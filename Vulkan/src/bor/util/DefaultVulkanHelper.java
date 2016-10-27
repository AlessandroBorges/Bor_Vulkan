package bor.util;

import java.lang.ref.WeakReference;

import android.view.SurfaceHolder;
import bor.vulkan.VkSurfaceKHR;

/**
 * Implementation of VulkanHelper.
 * Must be called before 
 * @author Alessandro Borges
 *
 */
public class DefaultVulkanHelper implements VulkanHelper 
{
    
    private java.lang.ref.WeakReference<VulkanSurfaceView> weakRef;
    
   // private VulkanConfigChooser configChooser;
    
    public DefaultVulkanHelper(WeakReference<VulkanSurfaceView> weakRef){
        this.weakRef = weakRef;
    }
    
    private VulkanConfigChooser getConfigChooser(){        
        VulkanSurfaceView view = this.weakRef.get();
        if(view != null){
            return view.getConfigChooser();
        }        
        return null;        
    }

    /**
     * Get current SurfaceKHR
     * @return
     */
    public VkSurfaceKHR getSurface(){
        VulkanConfigChooser chooser = getConfigChooser();
        if(chooser != null){
           return chooser.ctx.surfaceKHR;
        }
        return null;
    }
    
   

   /**
    * Creates a VkSurfaceKHR, using a instance of {@link VulkanConfigChooser} 
    * obtained from from {@link VulkanSurfaceView#getConfigChooser()}. 
    * 
    * @return
    */
    public boolean createSurface() {    
        VulkanSurfaceView view = this.weakRef.get();
        if(view == null){
            return false;
        }
        VulkanConfigChooser chooser = view.mVulkanConfigChooser;
        if(chooser != null){        
            destroySurface();    
            VulkanAppContext ctx = chooser.ctx;
            WindowSurfaceFactory wsf = ctx.windowSurfaceFactory; 
            ctx.surfaceKHR = wsf.createWindowSurface(ctx.instance, 
                                               ctx.pCallbackAllocator, 
                                               view.getHolder());               
            return (ctx.surfaceKHR != null);
        }else
            return false;
    }

    /**
     * 
     */
    public void destroySurface() {
        System.err.println("Destroy Surface requested");
        VulkanSurfaceView view = weakRef.get();   
        if(view != null){
           VulkanConfigChooser chooser = view.mVulkanConfigChooser; 
           if(chooser == null || chooser.ctx.surfaceKHR==null)
               return; 
           VulkanAppContext ctx = chooser.ctx;
           WindowSurfaceFactory wsf = ctx.windowSurfaceFactory; 
           wsf.destroySurface(ctx.instance, ctx.surfaceKHR);
           ctx.surfaceKHR.setPointer(0L);
           ctx.surfaceKHR = null;
        }        
    }

    
  /**
   * clean all resources
   */
    public void finish() {
        destroySurface();
        VulkanSurfaceView view = weakRef.get();   
        if(view != null){
            VulkanConfigChooser chooser = view.mVulkanConfigChooser;
            chooser.destroyDevice();              
            chooser.destroyVkInstance();
        }
    }

    

   /**
    * Do swapchain
    */
    public void swap() {
    }

   

    /**
     * 
     */
    public void start() {
     
    }

    
}// class DefaultVulkanHelper
