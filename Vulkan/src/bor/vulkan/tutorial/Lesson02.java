/**
 * 
 */
package bor.vulkan.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.badlogic.gdx.jnigen.JniGenSharedLibraryLoader;

import bor.vulkan.Vk10;
import bor.vulkan.VkDevice;
import bor.vulkan.VkInstance;
import bor.vulkan.VkPhysicalDevice;
import bor.vulkan.Vulkan;
import bor.vulkan.enumerations.VkResult;
import bor.vulkan.enumerations.VkStructureType;

import bor.vulkan.structs.VkAllocationCallbacks;
import bor.vulkan.structs.VkApplicationInfo;
import bor.vulkan.structs.VkDeviceCreateInfo;
import bor.vulkan.structs.VkDeviceQueueCreateInfo;
import bor.vulkan.structs.VkExtensionProperties;
import bor.vulkan.structs.VkInstanceCreateInfo;
import bor.vulkan.structs.VkLayerProperties;
import bor.vulkan.structs.VkPhysicalDeviceFeatures;
import bor.vulkan.structs.VkPhysicalDeviceMemoryProperties;
import bor.vulkan.structs.VkPhysicalDeviceProperties;
import bor.vulkan.structs.VkPhysicalDeviceSparseProperties;
import bor.vulkan.structs.VkQueueFamilyProperties;
import bor.vulkan.structs.VkStruct;

/**
 * Create VkPhysicalDevices and VkDevices
 * @author Alessandro Borges
 *
 */
public class Lesson02 {
   
   
    private static String[] ppEnabledLayerNames = {"VK_LAYER_LUNARG_core_validation"}; 
    private static String[] otherLayerNames = {
            "VK_LAYER_GOOGLE_threading",     "VK_LAYER_LUNARG_parameter_validation",
            "VK_LAYER_LUNARG_device_limits", "VK_LAYER_LUNARG_object_tracker",
            "VK_LAYER_LUNARG_image",         "VK_LAYER_LUNARG_core_validation",
            "VK_LAYER_LUNARG_swapchain",     "VK_LAYER_GOOGLE_unique_objects"
        };
    
    private static String[] enabledLayerNames = {
            "VK_LAYER_GOOGLE_threading",
            "VK_LAYER_GOOGLE_unique_objects",
            "VK_LAYER_LUNARG_api_dump",
            "VK_LAYER_LUNARG_device_limits",
            "VK_LAYER_LUNARG_draw_state",
            "VK_LAYER_LUNARG_image",
            "VK_LAYER_LUNARG_mem_tracker",
            "VK_LAYER_LUNARG_object_tracker",
            "VK_LAYER_LUNARG_param_checker",
            "VK_LAYER_LUNARG_screenshot",
            "VK_LAYER_LUNARG_swapchain",
//             "VK_LAYER_LUNARG_vktrace",
        };
    
    private static String[] extensions = {Vulkan.VK_KHR_WIN32_SURFACE_EXTENSION_NAME, 
                                          Vulkan.VK_KHR_SURFACE_EXTENSION_NAME, 
                                          Vulkan.VK_EXT_DEBUG_REPORT_EXTENSION_NAME };
    /**
     * Create VkInstance
     * @param Vk10 - Vulkan 1.0 hub instance
     * @return a valid VkInstance or null 
     */
    public static VkInstance createVkInstance(){
        VkAllocationCallbacks pAllocator = null;        
        VkInstance[] pInstance = new VkInstance[1];   
        
        VkApplicationInfo appInfo = new VkApplicationInfo();
            appInfo.sType(VkStructureType.VK_STRUCTURE_TYPE_APPLICATION_INFO);
            appInfo.pApplicationName("BorVulkan - Lesson 02");
            appInfo.pEngineName("BorVulkan");
            appInfo.apiVersion(Vulkan.VK_MAKE_VERSION(1, 0, 5));
            appInfo.engineVersion(Vulkan.VK_MAKE_VERSION(1, 0, 5));
            appInfo.applicationVersion(1);
            
        VkInstanceCreateInfo pCreateInfo = new VkInstanceCreateInfo();
            pCreateInfo.sType(VkStructureType.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO);
            pCreateInfo.pNext(null);
            pCreateInfo.flags(0);
            pCreateInfo.pApplicationInfo(appInfo);
            
            pCreateInfo.ppEnabledLayerNames(null);
           // pCreateInfo.ppEnabledExtensionNames(extensions);
        
        System.out.println("\n VkInstanceCreateInfo : " + pCreateInfo.toString()); 
        
        VkResult res =  Vk10.vkCreateInstance(pCreateInfo, pAllocator, pInstance);
        VkInstance instance = pInstance[0];
         
        System.out.println("VkResult for CreateInstance : " + res);
        
        if(res!=VkResult.VK_SUCCESS){
            System.err.println("Failed to get a valid VkInstance");
        }        
        return instance;        
    }
    
    /**
     * Enumerate and print Instance Layers
     * @param Vk10
     * @return list of Instance Layers
     */
    public static List<VkLayerProperties> enumerateInstanceLayers(){
       
        int[] count = {0};
        VkLayerProperties[] array = null;        
        
        VkResult res =  Vk10.vkEnumerateInstanceLayerProperties(count, array);
        array = new VkLayerProperties[count[0]];
        res =  Vk10.vkEnumerateInstanceLayerProperties(count, array);
        System.out.println("\n\t VkResult for Enumerate Instance Layer Properties: " + res);
        System.out.println("\t VkLayerProperties count: " + array.length);
        List<VkLayerProperties> pProperties = Arrays.asList(array);
        return pProperties;
    }
    
    /**
     * 
     * @param instance
     * @return
     */
    public static List<VkPhysicalDevice> enumeratePhysicalDevices(VkInstance instance){
        VkResult result;
        int[] count = {0};
        result = Vk10.vkEnumeratePhysicalDevices(instance, count, null); 
        int qtd = count[0];
        VkPhysicalDevice[] pPhysicalDevices = new VkPhysicalDevice[qtd];        
        result = Vk10.vkEnumeratePhysicalDevices(instance, count, pPhysicalDevices );        
        System.out.println("VkResult for Enumerate Physical Devices " + result);       
        System.out.println("PhysicalDevices count: " + qtd);        
        return Arrays.asList(pPhysicalDevices);
    }
   
    
    private static void printStructsSize(){
        for(int i= 1; i<150; i++){
            System.out.println("Struct #"+i+" \t" + VkStruct.getStructureName(i)
            +":\t" + VkStruct.sizeOf(i));            
        }
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
      if(Vk10.isVulkanAvailable()){
          System.out.println("Vulkan is Available.");
      }else{
          System.err.println("Vulkan is not available.\nExit...");
          System.exit(-1);
      }
       
       VkInstance instance = createVkInstance(); 
       
  // enumerate instance layers
       List<VkLayerProperties> instanceLayerProps = enumerateInstanceLayers();
        System.out.println("Available Instance Layers: " + instanceLayerProps.size());
        for (VkLayerProperties vkLayerProperties : instanceLayerProps) {
            System.out.println(vkLayerProperties);
        }
  //Step 2 - Enumerate Phisical Devices       
       List<VkPhysicalDevice> physicalDevicesList = enumeratePhysicalDevices( instance);
        System.out.println("\n\n############################################# ");
        System.out.println("PhysicalDevices Properties of " + physicalDevicesList.size()+" Physical Devices ");
        int count = 0;
        for (VkPhysicalDevice physicalDevice : physicalDevicesList) {
            VkPhysicalDeviceProperties prop = new VkPhysicalDeviceProperties();
            Vk10.vkGetPhysicalDeviceProperties(physicalDevice, prop);
            System.out.println("\n\t Properties for PhysicalDevice #" + count);
            System.out.println(prop);
            System.out.println("==============================================");
            
            System.out.println("\n\t Features for PhysicalDevice #" + count);
            VkPhysicalDeviceFeatures features = new VkPhysicalDeviceFeatures();
            Vk10.vkGetPhysicalDeviceFeatures(physicalDevice, features);
            System.out.println(features);
            
            System.out.println("\n\t Memory for PhysicalDevice #" + count);
            VkPhysicalDeviceMemoryProperties pMemoryProperties = new VkPhysicalDeviceMemoryProperties();
            Vk10.vkGetPhysicalDeviceMemoryProperties(physicalDevice, pMemoryProperties); 
            System.out.println(pMemoryProperties);
            
            System.out.println("\n\t Extensions for PhysicalDevice #" + count);
            VkExtensionProperties[] extensions = null;
            int[] extCount = {0};
            Vk10.vkEnumerateDeviceExtensionProperties(physicalDevice, null, extCount, extensions); 
            extensions = new VkExtensionProperties[extCount[0]];
            Vk10.vkEnumerateDeviceExtensionProperties(physicalDevice, null, extCount, extensions);
            for(int ii=0; ii<extCount[0]; ii++){
                System.out.println("Extensions #"+ii+":\n"+extensions[ii]);
            }
            
            count++;
        }
        System.out.println("#############################################\n\n");
       
        
      //Step 3 - Create a Device
        VkPhysicalDevice physicalDevice = physicalDevicesList.get(0);
        int[] pQueueFamilyPropertyCount = {0};
        Vk10.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, pQueueFamilyPropertyCount, null);
        
        int countQ = pQueueFamilyPropertyCount[0];
        VkQueueFamilyProperties[] pQueueFamilyProperties = new VkQueueFamilyProperties[countQ];
        Vk10.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, pQueueFamilyPropertyCount, pQueueFamilyProperties);
        
        int i = 0;
        for (VkQueueFamilyProperties queueFamily : pQueueFamilyProperties) {            
            System.out.println("VkQueueFamilyProperties #" + i);
            System.out.println(queueFamily);    
            System.out.println("======\n");
            i++;
        }
        System.out.println("#############################################\n\n");
       // DEVICE 
        VkDevice[] pDevice = new VkDevice[1];
        
        VkDeviceQueueCreateInfo[] pQueueCreateInfos = new VkDeviceQueueCreateInfo[1];        
        float[] queue_priorities = {1.0f};
        VkDeviceQueueCreateInfo queueCreateInfo = new VkDeviceQueueCreateInfo();
        
        queueCreateInfo.sType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO);
        queueCreateInfo.pNext(null);
        queueCreateInfo.flags(0);
        queueCreateInfo.queueFamilyIndex(0);
        queueCreateInfo.queueCount(1);
        queueCreateInfo.pQueuePriorities(queue_priorities);
        
        pQueueCreateInfos[0] = queueCreateInfo;
        
        VkDeviceCreateInfo pCreateDeviceInfo = new VkDeviceCreateInfo();
       // pCreateDeviceInfo.dump();
        pCreateDeviceInfo.sType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO);
        pCreateDeviceInfo.pNext(null);
        pCreateDeviceInfo.flags(0);
        pCreateDeviceInfo.queueCreateInfoCount(1);
        pCreateDeviceInfo.pQueueCreateInfos(pQueueCreateInfos);
        
        //VkDeviceQueueCreateInfo*
        pCreateDeviceInfo.pQueueCreateInfos(pQueueCreateInfos);
        //pCreateDeviceInfo.dump();
        
        System.err.println("VkDeviceCreateInfo: " +  pCreateDeviceInfo);
        
        VkAllocationCallbacks pAllocator = null;
        
        VkResult resDevice = Vk10.vkCreateDevice(physicalDevice, pCreateDeviceInfo, pAllocator , pDevice );
        System.out.println("VkResult for Device Creation: " + resDevice);
        VkDevice device = pDevice[0];
        
        Vk10.vkDestroyDevice(device , pAllocator);
        Vk10.vkDestroyInstance(instance, pAllocator);
    }

}
