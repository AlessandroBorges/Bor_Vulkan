package bor.util;

import bor.vulkan.VkDevice;
import bor.vulkan.VkInstance;
import bor.vulkan.VkPhysicalDevice;
import bor.vulkan.VkQueue;
import bor.vulkan.VkSurfaceKHR;
import bor.vulkan.VkSwapchainKHR;
import bor.vulkan.structs.VkAllocationCallbacks;
import bor.vulkan.structs.VkDeviceCreateInfo;
import bor.vulkan.structs.VkInstanceCreateInfo;
import bor.vulkan.structs.VkPhysicalDeviceProperties;
import bor.vulkan.structs.VkSurfaceFormatKHR;

/**
 * Class to help spare data about Vulkan Context
 * @author Alessandro Borges
 *
 */
public  class VulkanAppContext{
    public int width;
    public int height;
    public VkInstance instance;
    public VkPhysicalDevice physicalDevice;
    public VkPhysicalDeviceProperties physicalDeviceProperties; 
    public VkDevice device;
    
    public WindowSurfaceFactory windowSurfaceFactory;
    
    public VkSurfaceKHR surfaceKHR;         
    public VkSurfaceFormatKHR surfaceFormatKHR;
    public VkSwapchainKHR swapChain;
    
    public int graphicQueueIdx;
    public int presentQueueIdx;
    public VkQueue graphicsQueue;
    public VkQueue presentQueue;
    public VkAllocationCallbacks pCallbackAllocator;
    public VkInstanceCreateInfo pCreateInstanceInfo;
    public VkDeviceCreateInfo pCreateDeviceInfo;
}