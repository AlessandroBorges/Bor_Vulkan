/**
 * 
 */
package bor.vulkan;

import java.nio.ByteBuffer;

/**
 * Null Handle
 * @author Alessandro
 *
 */
public final class VK_NULL_HANDLE extends VkHandle {

    private static VK_NULL_HANDLE nullHandle = new VK_NULL_HANDLE();  
    /**
     * 
     */
    private VK_NULL_HANDLE() {        
    }

    /**
     * @param nativePtr
     */
    private VK_NULL_HANDLE(ByteBuffer nativePtr) {
    }
    
    /**
     * Create a pointer P to contain a instance of this,
     * with unset native pointer.
     * The 
     *    
     * @return A instance of P with null pointer 
     */
    public static VkHandle getNullHandle(){
        return nullHandle;
    }

}
