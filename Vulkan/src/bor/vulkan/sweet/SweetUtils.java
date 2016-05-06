/**
 * 
 */
package bor.vulkan.sweet;

import bor.vulkan.structs.VkStruct;

/**
 * Some Utilities
 * @author Alessandro Borges
 *
 */
public class SweetUtils {

    /**
     * 
     */
    private SweetUtils() {}
    
    
    public void delete(VkStruct struct){
        if(struct==null || struct.getPointer()==null) 
            return;
        
        struct.free();
        
    }

}
