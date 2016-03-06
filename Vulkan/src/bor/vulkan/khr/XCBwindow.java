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
public class XCBwindow extends VkHandler implements VkHandleInterface {

    private XCBwindow(){
        super();
    }
    
    /**
     * @param nativePtr
     */
    public XCBwindow(ByteBuffer nativePtr) {
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
public static P<XCBwindow> createNullPointer(){        
   P<XCBwindow> p = new P<XCBwindow>(new XCBwindow());        
   return p;
}

}
