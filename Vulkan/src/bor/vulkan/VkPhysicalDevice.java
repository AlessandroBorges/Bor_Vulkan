package bor.vulkan;

public interface VkPhysicalDevice extends VkHandleInterface {
    
    /**
     * 
     * @param size
     * @return
     */
    public VkArrayHandleDispatchable<VkInstance> createArray(int size);

}
