/**
 * 
 */
package bor.vulkan.khr;

import java.nio.ByteBuffer;
import bor.vulkan.VkHandler;
import bor.vulkan.P;
import bor.vulkan.VkHandleInterface;

/**
 * @TODO - check possible use of P<NativeWindow> instead
 * @author Alessandro Borges
 * 
 */
public class ANativeWindow extends VkHandler implements VkHandleInterface {

    private ANativeWindow(){
        super();
    }
    
    
    /**
     * To be called from native side 
     * 
     * @param nativePtr - ANativeWindow pointer
     */
    protected ANativeWindow(ByteBuffer nativePtr){
        super(nativePtr);
    } 
    
    /**
     * Create a pointer P to contain a instance of this,
     * with unset native pointer.
     * Use {@link VkStruct#setPointer(ByteBuffer)} to set 
     * valid native pointer.
     *    
     * @return An instance of P for this VkStruct with null pointer 
     */
    public static P<ANativeWindow> createNullPointer(){        
        P<ANativeWindow> p = new P<ANativeWindow>(new ANativeWindow());        
        return p;
    }
    
}