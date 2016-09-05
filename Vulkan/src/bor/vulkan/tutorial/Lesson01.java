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
        
        //List<VkExtensionProperties> pProperties = new ArrayList<VkExtensionProperties>();
        List<String> extensionsNames = new ArrayList<String>();
        
       
        String pLayerName = "";
        int[] pPropertyCount = {0};
        VkExtensionProperties[] pProperties = new VkExtensionProperties[4];
        
        Vk10.vkEnumerateInstanceExtensionProperties(pLayerName , pPropertyCount, pProperties);
       // Vk10.vkEnumerateInstanceExtensionProperties(null, pProperties);
        System.out.println("Extension Properties: ");
        for (VkExtensionProperties vkExtensionProperties : pProperties) {
            System.out.println(vkExtensionProperties);
            extensionsNames.add(vkExtensionProperties.extensionName());
        }
        
        VkInstanceCreateInfo pCreateInfo = new VkInstanceCreateInfo(); 
        
        
        
        VkAllocationCallbacks pAllocator = null;
        VkInstance[] pInstance = new VkInstance[1];
        
        VkApplicationInfo appInfo = new VkApplicationInfo();
        appInfo.sType(VkStructureType.VK_STRUCTURE_TYPE_APPLICATION_INFO);
        appInfo.pApplicationName("BorVulkan - Lesson 01");
        appInfo.pEngineName("BorVulkan");
        appInfo.applicationVersion(1);
        appInfo.apiVersion(Vulkan.VK_MAKE_VERSION(1, 0, 5));
        
        String[] names = extensionsNames.toArray(new String[extensionsNames.size()]);
        
        pCreateInfo.sType(VkStructureType.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO);
        pCreateInfo.pNext(null);
        pCreateInfo.flags(0);
        pCreateInfo.pApplicationInfo(appInfo);
        pCreateInfo.enabledExtensionCount(names.length);
        pCreateInfo.ppEnabledExtensionNames(names);
        
        VkResult res =  Vk10.vkCreateInstance(pCreateInfo, pAllocator, pInstance); 
        
        System.out.println("VkResult : " + res);
        
        System.out.println("Create info: " + pCreateInfo.toString() );
        
        VkInstance instance = pInstance[0];    
        
        
        Vk10.vkDestroyInstance(instance, pAllocator);
        System.out.println("Instance Destroyed ! ");
    }

}
