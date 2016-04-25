/**
 * 
 */
package bor.vulkan.enumerations;

/**
 * 
 * Class to wrap Ored values of VkImageCreateFlagBits
 * @see VkImageCreateFlagBits
 * @author Alessandro Borges
 *
 */
public class VkImageCreateFlags {

    private int value;
    
    /**
     * Creates a instance of VkImageCreateFlags
     * drom ORed VkImageCreateFlagBits.
     * 
     * @see VkImageCreateFlagBits
     * @param flags - VkImageCreateFlagBits to be ored
     */
    public VkImageCreateFlags(VkImageCreateFlagBits...flags){
        int result = 0;
        for (VkImageCreateFlagBits flag : flags) {
            result = result & flag.getValue();
        }
        this.value = result;
    }
    
   /**
    * 
    * @return
    */
    public int getValue() {      
        return value;
    }
}
