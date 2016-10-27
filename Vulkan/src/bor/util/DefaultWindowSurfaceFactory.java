package bor.util;

import android.util.Log;
import bor.vulkan.Vk10;
import bor.vulkan.VkInstance;
import bor.vulkan.VkSurfaceKHR;
import bor.vulkan.enumerations.VkResult;
import bor.vulkan.structs.VkAllocationCallbacks;

 /**
  * Default implementation of WindowSurfaceFactory.     
  */
 public class DefaultWindowSurfaceFactory implements WindowSurfaceFactory {
   private static final String TAG = "DefaultWindowSurfaceFactory";
    
    @Override
    public VkSurfaceKHR createWindowSurface(VkInstance instance,
                                            VkAllocationCallbacks allocCallback,                                              
                                            Object nativeWindow) {
        VkSurfaceKHR surface = null;
        VkResult res = null;
        try {                
            VkSurfaceKHR[] pSurface = {null};
            res = Vk10.vkCreateWindowSurface(instance, nativeWindow, allocCallback, pSurface );
            if(!res.isError()){
                surface = pSurface[0];
            }
        } catch (IllegalArgumentException e) {
            Log.e(TAG, "DefaultWindowSurfaceFactory.createWindowSurface", e);
        }

        return surface;
    }

    @Override
    public void destroySurface(VkInstance instance, VkSurfaceKHR surface) {
        Vk10.vkDestroySurfaceKHR(instance, surface, null);
    }

}// class DefaultWindowSurfaceFactory
