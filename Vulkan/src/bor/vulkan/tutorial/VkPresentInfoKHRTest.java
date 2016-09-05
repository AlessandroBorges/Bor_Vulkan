/**
 * 
 */
package bor.vulkan.tutorial;

import bor.vulkan.*;
import bor.vulkan.enumerations.VkResult;
import bor.vulkan.enumerations.VkStructureType;
import bor.vulkan.structs.*;


/**
 * @author Livia
 *
 */
public class VkPresentInfoKHRTest {

    VkStructureType sType;
    VkObject pNext;
    int waitSemaphoreCount;
    P<VkSemaphore> pWaitSemaphores;
    int swapchainCount;
    P<VkSwapchainKHR> pSwapchains;
    int[] pImageIndices;
    VkResult[] pResults;
    
    
    public VkPresentInfoKHRTest() {
        // TODO Auto-generated constructor stub
    }

}
