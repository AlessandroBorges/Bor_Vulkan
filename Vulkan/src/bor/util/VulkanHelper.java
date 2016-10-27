package bor.util;

import android.view.SurfaceHolder;
import bor.vulkan.VkSurfaceKHR;

/**
 * This interface defines basic operations to initialize
 * Vulkan, using Vulkan WSI features
 * 
 * @author Alessandro Borges
 *
 */
interface VulkanHelper {

    /**
     * Create an drawing surface for the current SurfaceHolder surface. If a surface
     * already exists, destroy it before creating the new surface.
     *
     * @return true if the surface was created successfully.
     */
    public boolean createSurface();

    /**
     * Destroy current Surface
     * 
     * @param surfaceHolder
     */
    public void destroySurface();

    /**
     * Release resources, including release SurfaceKHR
     */
    public void finish();

    /**
     * Prepare surface for drawing
     */
    public void start();

    /**
     * perform swapchain, if available
     */
    public void swap();
    
    /**
     * Get current VkSurfaceKHR 
     * @return
     */
    public VkSurfaceKHR getSurface();    
}
