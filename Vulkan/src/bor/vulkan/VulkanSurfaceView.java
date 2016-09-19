/**
 * 
 */
package bor.vulkan;

import java.io.Writer;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;

import bor.vulkan.*;
import bor.vulkan.enumerations.VkResult;
import bor.vulkan.enumerations.VkStructureType;
import bor.vulkan.structs.*;

/**
 * @author Alessandro Borges
 *
 */
public class VulkanSurfaceView extends SurfaceView implements Callback {
	
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

	
	private VulkanConfigChooser mEGLConfigChooser;
//	private EGLContextFactory mEGLContextFactory;
	private WindowSurfaceFactory mEGLWindowSurfaceFactory;

	
	/**
	 * User defined method for VkDeviceCreation
	 * @author Alessandro Borges
	 *
	 */
	public interface VulkanConfigChooser{
		/**
		 * This method must create the following Vulkan objects:<br>
		 * VkInstance - create the VkInstance to be used here. <br> 
		 * VkPhysicalDevice - chosen PhysicalDevice, among the enumerated ones. <br>
		 * VkDevice - device 
		 * 
		 * @return
		 */
		public VkDevice chooseDevice();
		
		/**
		 * Return the current VkInstance.
		 * @return VkInstance
		 */
		public VkInstance getVkInstance();
		
		/**
		 * Return the chosen PhysicalDevice
		 * @return
		 */
		public VkPhysicalDevice getVkPhysicalDevice();
	}
	
	/**
	 * Simple Chooser for VkDevice
	 * @author Alessandro Borges
	 *
	 */
	private static class SimpleVulkanConfigChooser implements VulkanConfigChooser{
       private VkInstance instance;
       private VkPhysicalDevice physicalDevice;
       private VkDevice device;
       
       /**
        * Create a simple Instance with 
        */
       public SimpleVulkanConfigChooser(){    	  	
		this(createSampleInstanceCreateInfo());
       }
       
       public SimpleVulkanConfigChooser(VkInstanceCreateInfo pCreateInstanceInfo){
    	VkAllocationCallbacks pAllocator = null;		
   		VkInstance[] pInstance = new VkInstance[1];
   		VkResult res = Vk10.vkCreateInstance(pCreateInstanceInfo, pAllocator , pInstance);
   		Vulkan.check(res);
   		this.instance = pInstance[0];
       }
       
       
       
       /**
        * Creates a very basic 
        * @return
        */
       public static VkInstanceCreateInfo createSampleInstanceCreateInfo(){
    	   
    	   VkApplicationInfo appInfo = new VkApplicationInfo();
    	   appInfo.sType(VkStructureType.VK_STRUCTURE_TYPE_APPLICATION_INFO);
    	   appInfo.pApplicationName("Sample Vulkan application.");    	  
    	   appInfo.applicationVersion(Vulkan.VK_MAKE_VERSION(1, 0, 0));
    	   appInfo.pEngineName("BorVulkan engine.");
    	   appInfo.engineVersion(Vulkan.VK_MAKE_VERSION(0, 8, 9));
    	   appInfo.apiVersion(Vulkan.VK_MAKE_VERSION(1, 0, 0));
    	   
    	   String[] extensions = getInstanceExtensions();	   
    	   VkInstanceCreateInfo pCreateInstanceInfo = new VkInstanceCreateInfo();  
    	   pCreateInstanceInfo.sType(VkStructureType.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO);
    	   if(extensions != null){
    		   pCreateInstanceInfo.enabledExtensionCount(extensions.length);
    		   pCreateInstanceInfo.ppEnabledExtensionNames(extensions);
    	   }    	   
    	   return pCreateInstanceInfo;
       }
       
       /**
        * Get Instance extensions Names
        * @return String[] with extensions names
        */
       public static String[] getInstanceExtensions(){
    	   String[] extensions = null;
    	   int[] pPropertyCount = {0};
		   VkExtensionProperties[] pProperties = null;
		   Vk10.vkEnumerateInstanceExtensionProperties(null, pPropertyCount, pProperties);
		   int size = pPropertyCount[0];
		   if ( size > 0){
			   pProperties = new VkExtensionProperties[size];
			   extensions  = new String[size];
			   VkResult res =  Vk10.vkEnumerateInstanceExtensionProperties(null, pPropertyCount, pProperties);
			   Vulkan.check(res);			   
			   for (int i = 0; i < size; i++) {
				   VkExtensionProperties p = pProperties[i];
				   extensions[i] = p.extensionName();
			    }
		   }
    	   return extensions;
       }
       
		
		@Override
		public VkDevice chooseDevice() {
			if(device == null){
				
			}
			return device;
		}

		@Override
		public VkInstance getVkInstance() {
			return this.instance;
		}

		@Override
		public VkPhysicalDevice getVkPhysicalDevice() {	
			if(physicalDevice == null){
				
			}
			
			return this.physicalDevice;
		}
		
	}
	
	
    
    /**
     * Standard View constructor. In order to render something, you
     * must call {@link #setRenderer} to register a renderer.
     */
	
	public VulkanSurfaceView(Context context) {
		super(context);
		init();
	}
	
	public VulkanSurfaceView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}
	
	public VulkanSurfaceView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
		super(context, attrs, defStyleAttr, defStyleRes);	
		init();
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
        if (mEGLConfigChooser == null) {
            mEGLConfigChooser = new SimpleVulkanConfigChooser();
        }
//        if (mEGLContextFactory == null) {
//            mEGLContextFactory = new DefaultContextFactory();
//        }
        if (mEGLWindowSurfaceFactory == null) {
            mEGLWindowSurfaceFactory = new DefaultWindowSurfaceFactory();
        }
        mVkThread = new VkThread(renderer);
        mVkThread.start();
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
        mEGLWindowSurfaceFactory = factory;
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
        mEGLConfigChooser = configChooser;
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
     * A generic GL Thread. Takes care of initializing EGL and GL. Delegates
     * to a Renderer instance to do the actual drawing. Can be configured to
     * render continuously or on request.
     *
     */
    class VkThread extends Thread {
    	
    	
        VkThread(Renderer renderer) {
            super();
            mDone = false;
            mWidth = 0;
            mHeight = 0;
            mRequestRender = true;
            mRenderMode = RENDERMODE_CONTINUOUSLY;
            mRenderer = renderer;
            setName("VkThread");
        }

        @Override
        public void run() {
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
            } finally {
                sEglSemaphore.release();
            }
        }

        private void guardedRun() throws InterruptedException {
            mEglHelper = new SimpleVulkanHelper();
            try {
                mEglHelper.start();

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
                            mEglHelper.destroySurface();
                            mEglHelper.finish();
                            needStart = true;
                        }
                        while (needToWait()) {
                            if (!mHasSurface) {
                                if (!mWaitingForSurface) {
                                    mEglHelper.destroySurface();
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
                        mEglHelper.start();
                        tellRendererSurfaceCreated = true;
                        changed = true;
                    }
                    if (changed) {
                        mEglHelper.createSurface(getHolder());
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
                        mEglHelper.swap();
                    }
                 }
            } finally {
                /*
                 * clean-up everything...
                 */
                mEglHelper.destroySurface();
                mEglHelper.finish();
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
        private VulkanHelper mEglHelper;
    }
    
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
     * An interface for customizing the eglCreateWindowSurface and eglDestroySurface calls.
     * <p>
     * This interface must be implemented by clients wishing to call
     * {@link GLSurfaceView#setEGLWindowSurfaceFactory(EGLWindowSurfaceFactory)}
     */
    public interface WindowSurfaceFactory {
        
    	public VkSurfaceKHR createWindowSurface(VkInstance instance, VkSurfaceCreateInfoKHR createInfo, Object nativeWindow);
        
        public void destroySurface(VkInstance instance, VkSurfaceKHR surface);
    }
    
    private static class  DefaultWindowSurfaceFactory implements  WindowSurfaceFactory{

		@Override
		public VkSurfaceKHR createWindowSurface(VkInstance instance, VkSurfaceCreateInfoKHR createInfo, Object nativeWindow) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void destroySurface(VkInstance instance, VkSurfaceKHR surface) {
			// TODO Auto-generated method stub
			
		}
    	
    } // class DefaultWindowSurfaceFactory
    
    

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
    
	/* (non-Javadoc)
	 * @see android.view.SurfaceHolder.Callback#surfaceChanged(android.view.SurfaceHolder, int, int, int)
	 */
	@Override
	public void surfaceChanged(SurfaceHolder arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see android.view.SurfaceHolder.Callback#surfaceCreated(android.view.SurfaceHolder)
	 */
	@Override
	public void surfaceCreated(SurfaceHolder arg0) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see android.view.SurfaceHolder.Callback#surfaceDestroyed(android.view.SurfaceHolder)
	 */
	@Override
	public void surfaceDestroyed(SurfaceHolder arg0) {
		// TODO Auto-generated method stub

	}
	
	
 /**
  * This interface defines basic operations to initialize 
  *  Vulkan, using Vulkan WSI features
  * @author Alessandro Borges
  *
  */
   interface VulkanHelper{
	  
	  
    /**
     * Create an drawing surface for the current SurfaceHolder surface. If a surface
     * already exists, destroy it before creating the new surface.
     *
     * @return true if the surface was created successfully.
     */
	   
	   public boolean createSurface(SurfaceHolder surfaceHolder);
	   
	   /**
	    * Destroy this Surface
	    * @param surfaceHolder
	    */
	   public void destroySurface();
	   
	   public void finish();
	   public void start();
	   public void swap();

/**
 * Release and recreate device depends of
 * some complex and high level child object tracking,
 * possibly with a List<WeakReference<VkObject>> 
 */
	   /*
	   public VkDevice recreateDevice();
	   public void releaseDevice();
	   public void releaseDeviceResources();
	   public void releasePhysicalDevice();
	   public void releaseInstance();
	   */
  }	
	
	private static class SimpleVulkanHelper implements VulkanHelper{

		@Override
		public boolean createSurface(SurfaceHolder surfaceHolder) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void destroySurface() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void finish() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void start() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void swap() {
			// TODO Auto-generated method stub
			
		}
		
	}
	    

}// class VulkanSurfaceView
