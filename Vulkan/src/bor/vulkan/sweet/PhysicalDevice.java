/**
 * 
 */
package bor.vulkan.sweet;

import bor.vulkan.VkInstance;
import bor.vulkan.VkPhysicalDevice;

/**
 * @author Alessandro Borges
 *
 */
public class PhysicalDevice {
    Instance instance;
    VkPhysicalDevice vkPhysicalDevice;
    
    /**
     * 
     * @param instance
     * @param vkPhysicalDevice
     */
    /* package private */ PhysicalDevice(Instance instance, VkPhysicalDevice vkPhysicalDevice) {
       this.instance = instance;
       this.vkPhysicalDevice = vkPhysicalDevice;
    }

    /**
     * clean up this object
     */
    public void destroy() {
        
        
    }
    
    
    
    
}
