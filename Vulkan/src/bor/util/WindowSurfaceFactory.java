package bor.util;


import bor.vulkan.VkInstance;
import bor.vulkan.VkSurfaceKHR;
import bor.vulkan.structs.VkAllocationCallbacks;

/**
 * An interface for customizing the CreateWindowSurface and eglDestroySurface calls.
 * <p>
 * This interface must be implemented by clients wishing to call
 * {@link VulkanSurfaceView#setWindowSurfaceFactory(WindowSurfaceFactory)}
 */
public interface WindowSurfaceFactory {
    
    /**
     * 
     * @param instance
     * @param allocCallback
     * @param createInfo
     * @param nativeWindow
     *  @return null if the surface cannot be constructed.
     */
    public VkSurfaceKHR createWindowSurface( VkInstance instance, 
                                             VkAllocationCallbacks allocCallback,                                                    
                                             Object nativeWindow);
    /**
     * 
     * @param instance
     * @param surface
     */
    public void destroySurface(VkInstance instance, VkSurfaceKHR surface);
    
}// interface WindowSurfaceFactory
