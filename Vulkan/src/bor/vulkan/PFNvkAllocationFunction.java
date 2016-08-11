/**
 * 
 */
package bor.vulkan;

import java.nio.ByteBuffer;

/**
 * Class to wrap PFNvkAllocationFunction pointers.<br>
 * 
 * As stated in VkHandleInterface interface, 
 * it uses a Direct ByteBuffer to store native pointers.
 * 
 * @author Alessandro Borges
 *
 */
public class PFNvkAllocationFunction extends VkHandle 
  implements PFNFunction, VkHandleInterface {

    /**
     * Ctor
     */
    private PFNvkAllocationFunction(){
        super();
    }
    
    /**
     * Package protected Ctor.<br>
     * @param nativePtr - pointer to native PFNvkAllocationFunction
     */
     public PFNvkAllocationFunction(ByteBuffer nativePtr) {
        super(nativePtr);        
    }
     
     public PFNvkAllocationFunction(long nativeHandle) {
         super(nativeHandle);        
     } 
     
    /**
     *  Implements {@link VkObject#getType()}. <br>
     *  Always return {@link VkObject#TYPE_PFN_FUNCTION}
     *  
     *  @return VkObject.TYPE_PFN_FUNCTION
     */
     @Override
    public int getType(){
        return VkObject.TYPE_PFN_FUNCTION;
    }
     
     
     
     /**
      * Create a pointer P to contains a instance of this,
      * with unset native pointer.
      * Use {@link VkStruct#setPointer(ByteBuffer)} to set 
      * valid native pointer.
      *    
      * @return An instance of P for this VkStruct with null pointer 
      */
     public static P<PFNvkAllocationFunction> createNullPointer(){        
         P<PFNvkAllocationFunction> p = new P<PFNvkAllocationFunction>(new PFNvkAllocationFunction());        
         return p;
     }

}
