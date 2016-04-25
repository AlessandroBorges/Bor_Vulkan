/**
 * 
 */
package bor.vulkan.sweet;

import bor.vulkan.VkDevice;
import bor.vulkan.VkInstance;
import bor.vulkan.VkPhysicalDevice;
import bor.vulkan.VulkanException;
import bor.vulkan.enumerations.VkResult;
import bor.vulkan.structs.VkAllocationCallbacks;
import bor.vulkan.structs.VkDeviceCreateInfo;

import static bor.vulkan.Vk10.*;

import bor.vulkan.PFNvkVoidFunction;
import bor.vulkan.Vk10;

/**
 * @author Alessandro Borges
 *
 */
public class Device {

     protected VkDevice vkDevice;
     protected VkInstance instance; 
     protected VkPhysicalDevice physicalDevice;
     protected VkDeviceCreateInfo  pCreateDeviceInfo;
     protected VkAllocationCallbacks  pAllocator;
     
     
     /**
      * Create a 
      * @param instance
      * @param physicalDevice
      * @param pCreateDeviceInfo
      * @param pAllocator
      */
     public Device(VkInstance instance, 
                   VkPhysicalDevice  physicalDevice,
                   VkDeviceCreateInfo  pCreateDeviceInfo,
                   VkAllocationCallbacks  pAllocator){
         
         VkDevice[] pDevice = new VkDevice[1];         
         VkResult res = vkCreateDevice(physicalDevice, pCreateDeviceInfo, pAllocator, pDevice);
         if(res != VkResult.VK_SUCCESS){
             throw new VulkanException("Error when creating device. Error: " + res);
         }
         
         this.vkDevice = pDevice[0];
         this.instance = instance;
         this.physicalDevice = physicalDevice;
         this.pCreateDeviceInfo = pCreateDeviceInfo;
         this.pAllocator = pAllocator;
     }
     
     
     /**
      * Destroy this device.<br>
      * Application must create another VkDevice, if necessary.
      */
     public void destroyDevice(){
         Vk10.vkDestroyDevice(vkDevice, pAllocator);
         vkDevice = null;
     }
     
     /**
      * Wait Device
      * @return VkResult
      */
     public VkResult waitIdle(){
         return Vk10.vkDeviceWaitIdle(vkDevice);
     }
     
     /**
      * 
      * @param funcName
      * @return
      */
     public PFNvkVoidFunction getProcAddress(String funcName){
         return Vk10.vkGetDeviceProcAddr(vkDevice, funcName);
     }
     
    
}
