/**
 * 
 */
package bor.vulkan.enumerations;

/**
 * Wrapper class for operatios with VkImageUsageFlagBits
 * 
 * @see VkImageUsageFlagBits
 * @author Alessandro Borges
 *
 */
public class VkImageUsageFlags  {
    /**
     * 
     */
    private static final long serialVersionUID = -8684790804601235181L;
    private int value;
    
    
    /**
     * Creates a ORed value of VkImageUsageFlagBits
     * 
     * @param flags VkImageUsageFlagBits values
     */
    public VkImageUsageFlags(VkImageUsageFlagBits...flags){
        int result = 0;
        for (VkImageUsageFlagBits flag : flags) {
            result = result & flag.getValue();
        }
        this.value = result; 
    }

    /**
     *  get int value of this flag
     * @see java.lang.Number#intValue()
     */ 
    public int getValue() {       
        return value;
    }

    

}
