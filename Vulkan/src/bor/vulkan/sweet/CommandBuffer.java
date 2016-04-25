/**
 * 
 */
package bor.vulkan.sweet;

import bor.vulkan.Vk10;
import bor.vulkan.VkCommandPool;
import bor.vulkan.VkDevice;
import bor.vulkan.VulkanException;
import bor.vulkan.enumerations.VkCommandPoolResetFlagBits;
import bor.vulkan.enumerations.VkResult;
import bor.vulkan.structs.VkAllocationCallbacks;
import bor.vulkan.structs.VkCommandPoolCreateInfo;

/**
 * @author Alessandro Borges
 *
 */
public class CommandBuffer {
    
    Device device;
    VkDevice vkDevice;
    VkResult lastVkResult; 
    VkCommandPool commandPool;
    VkCommandPoolCreateInfo pCreateInfo;
    VkAllocationCallbacks pAllocator;
    
    /**
     * Constructor
     * 
     * @param device
     * @param pCreateInfo
     * @param pAllocator
     */
    public CommandBuffer(Device device,
                         final VkCommandPoolCreateInfo pCreateInfo,
                         final VkAllocationCallbacks pAllocator){
        this.vkDevice = device.vkDevice;
        this.device = device;
        
        VkCommandPool[] pCmdPool = new VkCommandPool[1];
        
        VkResult res =  Vk10.vkCreateCommandPool(vkDevice, pCreateInfo, pAllocator, pCmdPool);
        lastVkResult = res;
        if(res != VkResult.VK_SUCCESS){
            throw new VulkanException("Failed to create CommandPool. Error: " + res);
        }
        
        this.commandPool = pCmdPool[0];
        this.pCreateInfo = pCreateInfo;
        this.pAllocator = pAllocator;
    }
    
        
    /**
     * 
     * @param flags - VkCommandPoolResetFlagBits flag bits to set
     * @return
     */
    public VkResult reset(int flags){ 
        return Vk10.vkResetCommandPool(vkDevice, commandPool, flags);        
    }
    
    /**
     * 
     */
    public void destroy(){
      Vk10.vkDestroyCommandPool(vkDevice, commandPool, pAllocator);
    }
    

}
