/**
 * 
 */
package bor.vulkan.khr;

import java.nio.ByteBuffer;

import bor.vulkan.P;
import bor.vulkan.VkHandleInterface;
import bor.vulkan.VkHandle;

/**
 * @author Alessandro Borges
 *
 */
public class MirSurface extends VkHandle implements VkHandleInterface {

    /**
     * private
     */
    private MirSurface(){
        super();        
    }
    
    /**
     * @param nativePtr
     */
    public MirSurface(ByteBuffer nativePtr) {
        super(nativePtr);       
    }
    
    
    /**
     * Create a pointer P to contains a instance of this,
     * with unset native pointer.
     * Use {@link VkStruct#setPointer(ByteBuffer)} to set 
     * valid native pointer.
     *    
     * @return An instance of P for this VkStruct with null pointer 
     */
    public static P<MirSurface> createNullPointer(){        
        P<MirSurface> p = new P<MirSurface>(new MirSurface());        
        return p;
    }
    

}
