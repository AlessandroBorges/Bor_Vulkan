/**
 * 
 */
package bor.vulkan.tutorial;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.jnigen.JniGenSharedLibraryLoader;

import bor.vulkan.Vk10;
import bor.vulkan.VkDevice;
import bor.vulkan.VkInstance;
import bor.vulkan.VkPhysicalDevice;
import bor.vulkan.enumerations.VkResult;
import bor.vulkan.enumerations.VkStructureType;
import bor.vulkan.structs.VkAllocationCallbacks;
import bor.vulkan.structs.VkApplicationInfo;
import bor.vulkan.structs.VkDeviceCreateInfo;
import bor.vulkan.structs.VkInstanceCreateInfo;
import bor.vulkan.structs.VkPhysicalDeviceProperties;
import bor.vulkan.structs.VkStruct;

/**
 * Create VkDevices
 * @author Alessandro Borges
 *
 */
public class Lesson02 {
    /**
     * Loading native libraries
     */
    static{
        new JniGenSharedLibraryLoader("libs/BorVulkan-natives.jar").load("BorVulkan");
    }
   
    
    private static void testSizes(){
        Vk10 vk = new Vk10();
        for(int i=1; i<127;i++){
            System.out.println("Struct #" + i + " size: "+ VkStruct.sizeOf(i));    
        }
        
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
       // testSizes();
        
        Vk10 vk = new Vk10();        
        // First Step - Create a VkInstance
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
        VkInstance instance = pInstance[0];
         
        System.out.println("VkResult for CreateInstance : " + res);
        
        if(res!=VkResult.VK_SUCCESS){
            System.err.println("Failed to get a valid VkInstance");
        }
        
        //Step 2 - Enumerate Phisical Devices
       
        List<VkPhysicalDevice> physicalDevicesList = new ArrayList<VkPhysicalDevice>();
        VkResult resEnumerateDevices = vk.vkEnumeratePhysicalDevices(instance, physicalDevicesList );
        
        System.out.println("VkResult for Enumerate Physical Devices " + resEnumerateDevices);
        System.out.println("PhysicalDevices count: " + physicalDevicesList.size());
        System.out.println("PhysicalDevices Properties: ");
        int count = 0;
        for (VkPhysicalDevice physicalDevice : physicalDevicesList) {
            VkPhysicalDeviceProperties prop = new VkPhysicalDeviceProperties();
            vk.vkGetPhysicalDeviceProperties(physicalDevice, prop);
            System.out.println("Properties for Device #" + count++);
            System.out.println(prop);
            System.out.println("==============================================");
        }
        
        
      //Step 3 - Create a Device
        VkPhysicalDevice physicalDevice = physicalDevicesList.get(0);
        VkDevice[] pDevice = new VkDevice[1];
        VkDeviceCreateInfo pCreateDeviceInfo = new VkDeviceCreateInfo();
        pCreateDeviceInfo.sType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO);
        pCreateDeviceInfo.pNext(null);
        pCreateDeviceInfo.flags(0);
        pCreateDeviceInfo.queueCreateInfoCount(1);
        
        
        
        
        VkResult resDevice = vk.vkCreateDevice(physicalDevice, pCreateDeviceInfo, pAllocator, pDevice );
        System.out.println("VkResult for Device Creation " + resDevice);

        
        vk.vkDestroyInstance(instance, pAllocator);
    }

}
