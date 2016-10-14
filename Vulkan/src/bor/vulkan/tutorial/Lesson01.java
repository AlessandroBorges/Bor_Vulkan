/**
 * 
 */
package bor.vulkan.tutorial;

import bor.vulkan.*;
import bor.vulkan.enumerations.VkResult;
import bor.vulkan.enumerations.VkStructureType;
import bor.vulkan.structs.*;

import java.util.ArrayList;
import java.util.List;

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
        
        boolean useIt = Vk10.isVulkanAvailable();
        if(useIt){
            System.out.println("This platform supports Vulkan !");
        }else{
            System.err.println("Sorry ! Platform doesn't supports Vulkan ! \n"
                              +"Update your Video Card Drivers and try again.");
            System.exit(-1);
        }
       
        System.out.println("Win32: " + Vk10.isWin32());
        System.out.println("isAndroid: " + Vk10.isAndroid());
        System.out.println("64Bits: " + Vk10.is64Bits());
        int[] pPropertyCount = {0};
        VkExtensionProperties[] pProperties = null;
        //get 
        Vk10.vkEnumerateInstanceExtensionProperties(null , pPropertyCount, null);
        
        pProperties = new VkExtensionProperties[pPropertyCount[0]];
        Vk10.vkEnumerateInstanceExtensionProperties(null , pPropertyCount, pProperties);
        
       
        System.out.println("Extension Properties: ");
        int count = pPropertyCount[0];
        String[] extensionsNames = new String[count];
        for (int i = 0; i<count; i++){
            VkExtensionProperties vkExtensionProperties = pProperties[i];            
            extensionsNames[i] = vkExtensionProperties.extensionName();
            System.out.println(vkExtensionProperties);
        }
        
        VkInstanceCreateInfo pCreateInfo = new VkInstanceCreateInfo();         
        VkAllocationCallbacks pAllocator = null;
        
        VkInstance[] pInstance = new VkInstance[1];
        // fill ApplicationInfo data
        VkApplicationInfo appInfo = new VkApplicationInfo();
        appInfo.sType(VkStructureType.VK_STRUCTURE_TYPE_APPLICATION_INFO);
        appInfo.pNext(null);
        appInfo.pApplicationName("BorVulkan - Lesson 01");
        appInfo.pEngineName("BorVulkan");
        appInfo.applicationVersion(1);
        appInfo.apiVersion(Vulkan.VK_MAKE_VERSION(1, 0, 24));
        
                
        pCreateInfo.sType(VkStructureType.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO);
        pCreateInfo.pNext(null);
        pCreateInfo.flags(0);
        pCreateInfo.pApplicationInfo(appInfo);
        pCreateInfo.enabledExtensionCount(count);
        pCreateInfo.ppEnabledExtensionNames(extensionsNames);
        
             
        VkResult res =  Vk10.vkCreateInstance(pCreateInfo, pAllocator, pInstance); 
        
        System.out.println("VkResult : " + res);
        
        System.out.println("Create info: " + pCreateInfo );
       
        VkInstance instance = pInstance[0];    
        
        System.out.println("Instance:  " + instance);
        Vk10.vkDestroyInstance(instance, pAllocator);
        System.out.println("Instance Destroyed ! ");
    }

}
