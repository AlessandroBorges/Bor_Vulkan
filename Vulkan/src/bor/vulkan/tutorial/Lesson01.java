/**
 * 
 */
package bor.vulkan.tutorial;

import bor.vulkan.*;
import bor.vulkan.enumerations.VkResult;
import bor.vulkan.enumerations.VkStructureType;
import bor.vulkan.structs.*;

import com.badlogic.gdx.jnigen.JniGenSharedLibraryLoader;

/**
 * How to create a VkInstance
 * @author Alessandro Borges
 *
 */


public class Lesson01 {
    /**
     * Loading native libraries
     */
    static{
        new JniGenSharedLibraryLoader("libs/BorVulkan-natives.jar").load("BorVulkan");
    }
        /**
     * @param args
     */
    public static void main(String[] args) {
        
        Vk10 vk = new Vk10();        
        
        VkInstanceCreateInfo pCreateInfo = new VkInstanceCreateInfo();        
        VkAllocationCallbacks pAllocator = null;
        VkInstance[] pInstance = new VkInstance[1];
        
        VkApplicationInfo appInfo = new VkApplicationInfo();
        appInfo.sType(VkStructureType.VK_STRUCTURE_TYPE_APPLICATION_INFO);
        appInfo.pApplicationName("BorVulkan - Lesson 01");
        appInfo.pEngineName("BorVulkan");
        appInfo.applicationVersion(1);
        appInfo.apiVersion(0);
        
        pCreateInfo.sType(VkStructureType.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO);
        pCreateInfo.pNext(null);
        pCreateInfo.flags(0);
        pCreateInfo.pApplicationInfo(appInfo);
        pCreateInfo.enabledExtensionCount(0);
        
        VkResult res =  vk.vkCreateInstance(pCreateInfo, pAllocator, pInstance); 
        
        System.out.println("VkResult : " + res);
        
        VkInstance instance = pInstance[0];        
        vk.vkDestroyInstance(instance, pAllocator);
    }

}
