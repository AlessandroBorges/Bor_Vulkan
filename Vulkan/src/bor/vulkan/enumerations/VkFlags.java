/**
 * 
 */
package bor.vulkan.enumerations;

/**
 * 
 * @author Alessandro Borges
 *
 */
public class VkFlags {
    
    public int value = 0;

    /**
     * 
     */
    public VkFlags() {       
    }
    
    public VkFlags(int val){
        value = val;
    }
    
    public static VkFlags asFlag(int value){
         return new VkFlags(value);
    }

}
