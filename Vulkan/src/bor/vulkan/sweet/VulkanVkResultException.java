/**
 * 
 */
package bor.vulkan.sweet;

import bor.vulkan.enumerations.VkResult;

/**
 * 
 * @author Alessandro Borges
 *
 */
@SuppressWarnings("serial")
public class VulkanVkResultException extends RuntimeException {

    public VkResult vkResult;

    /**
     * @return the vkResult
     */
    public VkResult getVkResult() {
        return vkResult;
    }

    /**
     * @param vkResult the vkResult to set
     */
    public void setVkResult(VkResult vkResult) {
        this.vkResult = vkResult;
    }

    /**
     * 
     */
    public VulkanVkResultException(VkResult res) {
        this("Error in Vulkan operation: " + res.toString());
        this.vkResult = res;       
    }

    /**
     * @param message
     */
    public VulkanVkResultException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public VulkanVkResultException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */
    public VulkanVkResultException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    public VulkanVkResultException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);       
    }

}
