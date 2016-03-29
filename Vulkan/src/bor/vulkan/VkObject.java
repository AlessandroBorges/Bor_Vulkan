package bor.vulkan;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.*;


/**
 * VkObject holds the native reference to a Vulkan struct.
 * 
 * There are two types of VkObjects:
 * <li> Vulkan objects - hold only a pointer to Vulkan objects
 * <li> Vulkan Structures - hold a pointer Vulkan struct itself.
 * 
 * @author Alessandro Borges
 *
 */
public interface VkObject {
    
    /**
     * Default size of Pointer.
     * It is safe from Java side and can be cast to (void *) in both 
     * 32 and 64 bits in all major O.S. supported by Java JRE. <br>
     */
    public static final int SIZEOF_PTR = 8; 
    
    
    /**
     * Flag. This VkObject is a pointer for a struct
     */
    public static final int TYPE_STRUCT = 0x01;
    
    /**
     * Flag. This VkObject is a pointer for a Handler
     */
    public static final int TYPE_HANDLER = 0x02;
    
    /**
     * Flag. This VkObject is a pointer for a PFNFunction
     */
    public static final int TYPE_PFN_FUNCTION = 0x04;
    
    /**
     * Inform if this VkObject is a Struct or a Handler 
     * @return one of TYPE_STRUCT or TYPE_HANDLER
     */
    public int getType();
    
    /**
     * Return the native pointer to VkObject.
     * @return native pointer wrapped by a ByteBuffer
     */
    public java.nio.ByteBuffer getPointer();
    
    /**
     * check if internal pointer to VkObject is null.
     * @return
     */
    public boolean isNull();
    
    /**
     * Return this VkObject instance wrapped in pointer P<br>
     *  
     *  P&lt;? extends VkObject &gt; 
     * 
     * @return  a P container wrapping this object.
     */
    public P<? extends VkObject> getP();
    
    /**
     * Used to set a new pointer after a native [in][out] operation.
     * @param nativePtr - native pointer to set
     * @
     */
     void setPointer(java.nio.ByteBuffer nativePtr);
 
}
