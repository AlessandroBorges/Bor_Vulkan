/**
 * 
 */
package bor.vulkan.khr;

import java.nio.ByteBuffer;

import bor.vulkan.P;
import bor.vulkan.VkHandleInterface;
import bor.vulkan.VkHandler;

/**
 * @author Alessandro Borges
 *
 */
public class MirConnection extends VkHandler implements VkHandleInterface {

    /**
     * creates a empty pointer for MirConnection
     */
    private MirConnection(){ 
        super();
    }
    
    /**
     * @param nativePtr
     */
    public MirConnection(ByteBuffer nativePtr) {
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
    public static P<MirConnection> createNullPointer(){        
        P<MirConnection> p = new P<MirConnection>(new MirConnection());        
        return p;
    }
   

}
