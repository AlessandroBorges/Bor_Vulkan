/**
 * 
 */
package bor.util;

import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;

import bor.vulkan.*;
import bor.vulkan.enumerations.VkColorSpaceKHR;
import bor.vulkan.enumerations.VkFormat;
import bor.vulkan.enumerations.VkQueueFlagBits;
import bor.vulkan.enumerations.VkResult;
import bor.vulkan.enumerations.VkStructureType;
import bor.vulkan.structs.*;
import bor.vulkan.sweet.PhysicalDevice;

/**
 * @author Alessandro Borges
 *
 */
public class VulkanSurfaceView 
  extends SurfaceView 
  implements Callback {
    
    private final static String TAG = "VulkanSurfaceView";
    private final static boolean LOG_ATTACH_DETACH = false;
  //  private final static boolean LOG_THREADS = false;
  //  private final static boolean LOG_PAUSE_RESUME = false;
  //  private final static boolean LOG_SURFACE = false;
  //  private final static boolean LOG_RENDERER = false;
  //  private final static boolean LOG_RENDERER_DRAW_FRAME = false;
  //  private final static boolean LOG_EGL = false;
	
    /**
     * The renderer only renders
     * when the surface is created, or when {@link #requestRender} is called.
     *
     * @see #getRenderMode()
     * @see #setRenderMode(int)
     */
    public final static int RENDERMODE_WHEN_DIRTY = 0;
    /**
     * The renderer is called
     * continuously to re-render the scene.
     *
     * @see #getRenderMode()
     * @see #setRenderMode(int)
     * @see #requestRender()
     */
    public final static int RENDERMODE_CONTINUOUSLY = 1;

    /**
     * Check vkError() after every GL call and throw an exception if glError indicates
     * that an error has occurred. This can be used to help track down which OpenGL ES call
     * is causing an error.
     *
     * @see #getDebugFlags
     * @see #setDebugFlags
     */
    public final static int DEBUG_CHECK_VULKAN_ERROR = 1;

    /**
     * Log GL calls to the system log at "verbose" level with tag "GLSurfaceView".
     *
     * @see #getDebugFlags
     * @see #setDebugFlags
     */
    public final static int DEBUG_LOG_GL_CALLS = 2;
	private int mDebugFlags;
	private VkThread mVkThread;
	
	private static final Semaphore sEglSemaphore = new Semaphore(1);
	private boolean mSizeChanged = true;

	private final WeakReference<VulkanSurfaceView> mThisWeakRef = new WeakReference<VulkanSurfaceView>(this);
	protected VulkanConfigChooser mVulkanConfigChooser;
//	private EGLContextFactory mEGLContextFactory;
	protected WindowSurfaceFactory mWindowSurfaceFactory;
	protected Renderer mRenderer;
	protected boolean mDetached;

	/**
	 * The VkInstance used by this SurfaceViewer
	 */
	protected VkInstance vkInstance;
	
	/**
	 * The allocation callback used by this SurfaceViewer
	 */
	protected VkAllocationCallbacks allocationCallbacks = null;
	
	
	
	
   	
	    
    /**
     * Standard View constructor. In order to render something, you
     * must call {@link #setRenderer} to register a renderer.
     */
	
	public VulkanSurfaceView(Context context) {
		super(context);
		init();
	}
	
    /**
     * Standard View constructor. In order to render something, you
     * must call {@link #setRenderer} to register a renderer.
     */
	public VulkanSurfaceView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}
	
		
	 /**
	  * finalize  
	  * @throws Throwable
	  */
	protected void finalize() throws Throwable {
	        try {
	            if (mVkThread != null) {
	                // VkThread may still be running if this view was never
	                // attached to a window.
	            	mVkThread.requestExitAndWait();
	            }
	        } finally {
	            super.finalize();
	        }
	    }
	
	/**
	 * Install a SurfaceHolder.Calback in this Vulkan SurfaceView. So we get notified 
	 * when the underlying surface is created and destroyed.
	 */
	private void init(){
		SurfaceHolder holder  = getHolder();
		holder.addCallback(this);
	}
	
	/**
     * Set the debug flags to a new value. The value is
     * constructed by OR-together zero or more
     * of the DEBUG_CHECK_* constants. The debug flags take effect
     * whenever a surface is created. The default value is zero.
     * @param debugFlags the new debug flags
     * @see #DEBUG_CHECK_GL_ERROR
     * @see #DEBUG_LOG_GL_CALLS
     */
    public void setDebugFlags(int debugFlags) {
        mDebugFlags = debugFlags;
    }

    /**
     * Get the current value of the debug flags.
     * @return the current value of the debug flags.
     */
    public int getDebugFlags() {
        return mDebugFlags;
    }
    
    /**
     * Set the renderer associated with this view. Also starts the thread that
     * will call the renderer, which in turn causes the rendering to start.
     * <p>This method should be called once and only once in the life-cycle of
     * a GLSurfaceView.
     * <p>The following GLSurfaceView methods can only be called <em>before</em>
     * setRenderer is called:
     * <ul>
     * <li>{@link #setEGLConfigChooser(boolean)}
     * <li>{@link #setEGLConfigChooser(EGLConfigChooser)}
     * <li>{@link #setEGLConfigChooser(int, int, int, int, int, int)}
     * </ul>
     * <p>
     * The following GLSurfaceView methods can only be called <em>after</em>
     * setRenderer is called:
     * <ul>
     * <li>{@link #getRenderMode()}
     * <li>{@link #onPause()}
     * <li>{@link #onResume()}
     * <li>{@link #queueEvent(Runnable)}
     * <li>{@link #requestRender()}
     * <li>{@link #setRenderMode(int)}
     * </ul>
     *
     * @param renderer the renderer to use to perform OpenGL drawing.
     */
    public void setRenderer(Renderer renderer) {
        checkRenderThreadState();
        if (mVulkanConfigChooser == null) {
            mVulkanConfigChooser = new DefaultVulkanConfigChooser();
        }

        if (mWindowSurfaceFactory == null) {
            mWindowSurfaceFactory = new DefaultWindowSurfaceFactory();
        }
        mRenderer = renderer;
        mVkThread = new VkThread(mThisWeakRef);
        mVkThread.start();
    }
    
    /**
     * Set the rendering mode. When renderMode is
     * RENDERMODE_CONTINUOUSLY, the renderer is called
     * repeatedly to re-render the scene. When renderMode
     * is RENDERMODE_WHEN_DIRTY, the renderer only rendered when the surface
     * is created, or when {@link #requestRender} is called. Defaults to RENDERMODE_CONTINUOUSLY.
     * <p>
     * Using RENDERMODE_WHEN_DIRTY can improve battery life and overall system performance
     * by allowing the GPU and CPU to idle when the view does not need to be updated.
     * <p>
     * This method can only be called after {@link #setRenderer(Renderer)}
     *
     * @param renderMode one of the RENDERMODE_X constants
     * @see #RENDERMODE_CONTINUOUSLY
     * @see #RENDERMODE_WHEN_DIRTY
     */
    public void setRenderMode(int renderMode) {
    	mVkThread.setRenderMode(renderMode);
    }

    /**
     * Get the current rendering mode. May be called
     * from any thread. Must not be called before a renderer has been set.
     * @return the current rendering mode.
     * @see #RENDERMODE_CONTINUOUSLY
     * @see #RENDERMODE_WHEN_DIRTY
     */
    public int getRenderMode() {
        return mVkThread.getRenderMode();
    }

    /**
     * Request that the renderer render a frame.
     * This method is typically used when the render mode has been set to
     * {@link #RENDERMODE_WHEN_DIRTY}, so that frames are only rendered on demand.
     * May be called
     * from any thread. Must not be called before a renderer has been set.
     */
    public void requestRender() {
    	mVkThread.requestRender();
    }
    
    /**
     * Install a custom WindowSurfaceFactory.
     * <p>If this method is
     * called, it must be called before {@link #setRenderer(Renderer)}
     * is called.
     * <p>
     * If this method is not called, then by default
     * a window surface will be created with a null attribute list.
     */
    public void setWindowSurfaceFactory(WindowSurfaceFactory factory) {
        checkRenderThreadState();
        mWindowSurfaceFactory = factory;
    }
    
    /**
     * Install a custom VulkanConfigChooser.
     * <p>If this method is
     * called, it must be called before {@link #setRenderer(Renderer)}
     * is called.
     * <p>
     * If no setConfigChooser method is called, then by default the
     * view will choose the best device.
     * @param configChooser
     */
    public void setConfigChooser(VulkanConfigChooser configChooser) {
        checkRenderThreadState();
        mVulkanConfigChooser = configChooser;
    }

    /**
     * Check if current operation is set before VkThread is launched.
     */
    private void checkRenderThreadState() {
        if (mVkThread != null) {
            throw new IllegalStateException(
                    "setRenderer has already been called for this instance.");
        }
    }
    
    /**
     * Queue a runnable to be run on the GL rendering thread. This can be used
     * to communicate with the Renderer on the rendering thread.
     * Must not be called before a renderer has been set.
     * @param r the runnable to be run on the GL rendering thread.
     */
    public void queueEvent(Runnable r) {
        mVkThread.queueEvent(r);
    }
    
    /**
     * This method is used as part of the View class and is not normally
     * called or subclassed by clients of GLSurfaceView.
     */
    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (LOG_ATTACH_DETACH) {
            Log.d(TAG, "onAttachedToWindow reattach =" + mDetached);
        }
        if (mDetached && (mRenderer != null)) {
            int renderMode = RENDERMODE_CONTINUOUSLY;
            if (mVkThread != null) {
                renderMode = mVkThread.getRenderMode();
            }
            // re-start VkThread
            mVkThread = new VkThread(mThisWeakRef);
            if (renderMode != RENDERMODE_CONTINUOUSLY) {
            	mVkThread.setRenderMode(renderMode);
            }
            mVkThread.start();
        }
        mDetached = false;
    }

    @Override
    protected void onDetachedFromWindow() {
        if (LOG_ATTACH_DETACH) {
            Log.d(TAG, "onDetachedFromWindow");
        }
        if (mVkThread != null) {
        	mVkThread.requestExitAndWait();
        }
        mDetached = true;
        super.onDetachedFromWindow();
    }
    
    /**
     * This method is part of the SurfaceHolder.Callback interface, and is
     * not normally called or subclassed by clients of GLSurfaceView.
     */
	@Override
	public void surfaceChanged(SurfaceHolder holder_unused, int format, int w, int h) {
		 mVkThread.onWindowResize(w, h);
	}

	/**
     * This method is part of the SurfaceHolder.Callback interface, and is
     * not normally called or subclassed by clients of GLSurfaceView.
     */
	@Override
	public void surfaceCreated(SurfaceHolder arg0) {
		 mVkThread.surfaceCreated();
	}

	/**
     * This method is part of the SurfaceHolder.Callback interface, and is
     * not normally called or subclassed by clients of GLSurfaceView.
     */
	@Override
	public void surfaceDestroyed(SurfaceHolder arg0) {
		// Surface will be destroyed when we return
        mVkThread.surfaceDestroyed();
	}
	
    
    /**
     * A generic GL Thread. Takes care of initializing EGL and GL. Delegates
     * to a Renderer instance to do the actual drawing. Can be configured to
     * render continuously or on request.
     *
     */
    class VkThread extends Thread {
    	protected WeakReference<VulkanSurfaceView> mWeakView;
    /**
     * Constructor 	
     * @param mThisWeakRef - Weak reference to VulkanSurfaceViewer
     */
     public  VkThread(WeakReference<VulkanSurfaceView> mThisWeakRef) {
            super();
            mDone = false;
            mWidth = 0;
            mHeight = 0;
            mRequestRender = true;
            mRenderMode = RENDERMODE_CONTINUOUSLY;
            this.mWeakView = mThisWeakRef;
            VulkanSurfaceView view = mThisWeakRef.get();
            mRenderer = view.mRenderer;            
        }

        @Override
        public void run() {
            setName("VkThread " + getId());
            /*
             * When the android framework launches a second instance of
             * an activity, the new instance's onCreate() method may be
             * called before the first instance returns from onDestroy().
             *
             * This semaphore ensures that only one instance at a time
             * accesses EGL.
             */
            try {
                try {
                sEglSemaphore.acquire();
                } catch (InterruptedException e) {
                    return;
                }
                guardedRun();
            } catch (InterruptedException e) {
                // fall thru and exit normally
                e.printStackTrace();
            } finally {
                sEglSemaphore.release();
            }
        }

        /**
         * @TODO improve  DefaultVulkanHelper
         * @throws InterruptedException
         */
        private void guardedRun() throws InterruptedException {
            // @TODO - improve this 
            mVulkanHelperOnThread = new DefaultVulkanHelper(this.mWeakView);
            try {
                mVulkanHelperOnThread.start();

               // GL10 gl = null;
                boolean tellRendererSurfaceCreated = true;
                boolean tellRendererSurfaceChanged = true;

                /*
                 * This is our main activity thread's loop, we go until
                 * asked to quit.
                 */
                while (!mDone) {

                    /*
                     *  Update the asynchronous state (window size)
                     */
                    int w, h;
                    boolean changed;
                    boolean needStart = false;
                    synchronized (this) {
                        Runnable r;
                        while ((r = getEvent()) != null) {
                            r.run();
                        }
                        if (mPaused) {
                            mVulkanHelperOnThread.destroySurface();
                            mVulkanHelperOnThread.finish();
                            needStart = true;
                        }
                        while (needToWait()) {
                            if (!mHasSurface) {
                                if (!mWaitingForSurface) {
                                    mVulkanHelperOnThread.destroySurface();
                                    mWaitingForSurface = true;
                                    notify();
                                }
                            }
                            wait();
                        }
                        if (mDone) {
                            break;
                        }
                        changed = mSizeChanged;
                        w = mWidth;
                        h = mHeight;
                        mSizeChanged = false;
                        mRequestRender = false;
                        if (mHasSurface && mWaitingForSurface) {
                            changed = true;
                            mWaitingForSurface = false;
                        }
                    }
                    if (needStart) {
                        mVulkanHelperOnThread.start();
                        tellRendererSurfaceCreated = true;
                        changed = true;
                    }
                    if (changed) {
                        mVulkanHelperOnThread.createSurface();
                        tellRendererSurfaceChanged = true;
                    }
                    if (tellRendererSurfaceCreated) {
                        mRenderer.onSurfaceCreated();
                        tellRendererSurfaceCreated = false;
                    }
                    if (tellRendererSurfaceChanged) {
                        mRenderer.onSurfaceChanged(w, h);
                        tellRendererSurfaceChanged = false;
                    }
                    if ((w > 0) && (h > 0)) {
                        /* draw a frame here */
                        mRenderer.onDrawFrame();

                        /*
                         * Once we're done with GL, we need to call swapBuffers()
                         * to instruct the system to display the rendered frame
                         */
                        mVulkanHelperOnThread.swap();
                    }
                 }
            } finally {
                /*
                 * clean-up everything...
                 */
                mVulkanHelperOnThread.destroySurface();
                mVulkanHelperOnThread.finish();
            }
        }

        private boolean needToWait() {
            if (mDone) {
                return false;
            }

            if (mPaused || (! mHasSurface)) {
                return true;
            }

            if ((mWidth > 0) && (mHeight > 0) && (mRequestRender || (mRenderMode == RENDERMODE_CONTINUOUSLY))) {
                return false;
            }

            return true;
        }

        public void setRenderMode(int renderMode) {
            if ( !((RENDERMODE_WHEN_DIRTY <= renderMode) && (renderMode <= RENDERMODE_CONTINUOUSLY)) ) {
                throw new IllegalArgumentException("renderMode");
            }
            synchronized(this) {
                mRenderMode = renderMode;
                if (renderMode == RENDERMODE_CONTINUOUSLY) {
                    notify();
                }
            }
        }

        public int getRenderMode() {
            synchronized(this) {
                return mRenderMode;
            }
        }

        public void requestRender() {
            synchronized(this) {
                mRequestRender = true;
                notify();
            }
        }

        public void surfaceCreated() {
            synchronized(this) {
                mHasSurface = true;
                notify();
            }
        }

        public void surfaceDestroyed() {
            synchronized(this) {
                mHasSurface = false;
                notify();
                while(!mWaitingForSurface && isAlive()) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void onPause() {
            synchronized (this) {
                mPaused = true;
            }
        }

        public void onResume() {
            synchronized (this) {
                mPaused = false;
                notify();
            }
        }

        public void onWindowResize(int w, int h) {
            synchronized (this) {
                mWidth = w;
                mHeight = h;
                mSizeChanged = true;
                notify();
            }
        }

        public void requestExitAndWait() {
            // don't call this from GLThread thread or it is a guaranteed
            // deadlock!
            synchronized(this) {
                mDone = true;
                notify();
            }
            try {
                join();
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }

        /**
         * Queue an "event" to be run on the GL rendering thread.
         * @param r the runnable to be run on the GL rendering thread.
         */
        public void queueEvent(Runnable r) {
            synchronized(this) {
                mEventQueue.add(r);
            }
        }

        private Runnable getEvent() {
            synchronized(this) {
                if (mEventQueue.size() > 0) {
                    return mEventQueue.remove(0);
                }

            }
            return null;
        }

        private boolean mDone;
        private boolean mPaused;
        private boolean mHasSurface;
        private boolean mWaitingForSurface;
        private int mWidth;
        private int mHeight;
        private int mRenderMode;
        private boolean mRequestRender;
        private Renderer mRenderer;
        private ArrayList<Runnable> mEventQueue = new ArrayList<Runnable>();
        private DefaultVulkanHelper mVulkanHelperOnThread;
    }// class VkThread
    
    static class LogWriter extends Writer {

        @Override public void close() {
            flushBuilder();
        }

        @Override public void flush() {
            flushBuilder();
        }

        @Override public void write(char[] buf, int offset, int count) {
            for(int i = 0; i < count; i++) {
                char c = buf[offset + i];
                if ( c == '\n') {
                    flushBuilder();
                }
                else {
                    mBuilder.append(c);
                }
            }
        }

        private void flushBuilder() {
            if (mBuilder.length() > 0) {
              // @TODO implement Log for non-Android platforms - Use a Interface !  	
              //  Log.v("GLSurfaceView", mBuilder.toString());
                mBuilder.delete(0, mBuilder.length());
            }
        }

        private StringBuilder mBuilder = new StringBuilder();
    }

    
    
    
   
    
    

    /**
     * A generic renderer interface.
     * <p>
     * The renderer is responsible for making OpenGL calls to render a frame.
     * <p>
     * GLSurfaceView clients typically create their own classes that implement
     * this interface, and then call {@link GLSurfaceView#setRenderer} to
     * register the renderer with the GLSurfaceView.
     * <p>
     * <h3>Threading</h3>
     * The renderer will be called on a separate thread, so that rendering
     * performance is decoupled from the UI thread. Clients typically need to
     * communicate with the renderer from the UI thread, because that's where
     * input events are received. Clients can communicate using any of the
     * standard Java techniques for cross-thread communication, or they can
     * use the {@link GLSurfaceView#queueEvent(Runnable)} convenience method.
     * <p>
     * <h3>EGL Context Lost</h3>
     * There are situations where the EGL rendering context will be lost. This
     * typically happens when device wakes up after going to sleep. When
     * the EGL context is lost, all OpenGL resources (such as textures) that are
     * associated with that context will be automatically deleted. In order to
     * keep rendering correctly, a renderer must recreate any lost resources
     * that it still needs. The {@link #onSurfaceCreated(GL10, EGLConfig)} method
     * is a convenient place to do this.
     *
     *
     * @see #setRenderer(Renderer)
     */
    public interface Renderer {
        /**
         * Called when the surface is created or recreated.
         * <p>
         * Called when the rendering thread
         * starts and whenever the EGL context is lost. The context will typically
         * be lost when the Android device awakes after going to sleep.
         * <p>
         * Since this method is called at the beginning of rendering, as well as
         * every time the EGL context is lost, this method is a convenient place to put
         * code to create resources that need to be created when the rendering
         * starts, and that need to be recreated when the EGL context is lost.
         * Textures are an example of a resource that you might want to create
         * here.
         * <p>
         * Note that when the EGL context is lost, all OpenGL resources associated
         * with that context will be automatically deleted. You do not need to call
         * the corresponding "glDelete" methods such as glDeleteTextures to
         * manually delete these lost resources.
         * <p>
         * @param gl the GL interface. Use <code>instanceof</code> to
         * test if the interface supports GL11 or higher interfaces.
         * @param config the EGLConfig of the created surface. Can be used
         * to create matching pbuffers.
         */
        void onSurfaceCreated();

        /**
         * Called when the surface changed size.
         * <p>
         * Called after the surface is created and whenever
         * the OpenGL ES surface size changes.
         * <p>
         * Typically you will set your viewport here. If your camera
         * is fixed then you could also set your projection matrix here:
         * <pre class="prettyprint">
         * void onSurfaceChanged(GL10 gl, int width, int height) {
         *     gl.glViewport(0, 0, width, height);
         *     // for a fixed camera, set the projection too
         *     float ratio = (float) width / height;
         *     gl.glMatrixMode(GL10.GL_PROJECTION);
         *     gl.glLoadIdentity();
         *     gl.glFrustumf(-ratio, ratio, -1, 1, 1, 10);
         * }
         * </pre>
         * @param gl the GL interface. Use <code>instanceof</code> to
         * test if the interface supports GL11 or higher interfaces.
         * @param width
         * @param height
         */
        void onSurfaceChanged(int width, int height);

        /**
         * Called to draw the current frame.
         * <p>
         * This method is responsible for drawing the current frame.
         * <p>
         * The implementation of this method typically looks like this:
         * <pre class="prettyprint">
         * void onDrawFrame(GL10 gl) {
         *     gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
         *     //... other gl calls to render the scene ...
         * }
         * </pre>
         * @param gl the GL interface. Use <code>instanceof</code> to
         * test if the interface supports GL11 or higher interfaces.
         */
        void onDrawFrame();
    }

    /**
     * Get VulkanConfigChooser
     * @return current instance of VulkanConfigChooser
     */
    public VulkanConfigChooser getConfigChooser() {
        return this.mVulkanConfigChooser;
    }
      
}// class VulkanSurfaceView
