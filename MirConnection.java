/**
 * 
 */
package bor.vulkan.khr;

import java.nio.ByteBuffer;

import bor.vulkan.VkHandle;
import bor.vulkan.VkHandlerConcrete;

/**
 * @author Alessandro Borges
 *
 */
public class MirConnection extends VkHandlerConcrete implements VkHandle {

    /**
     * @param nativePtr
     */
    public MirConnection(ByteBuffer nativePtr) {
        super(nativePtr);       
    }   
   

}
