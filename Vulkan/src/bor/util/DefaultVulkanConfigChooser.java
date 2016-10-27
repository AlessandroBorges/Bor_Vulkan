package bor.util;

import java.util.Arrays;
import java.util.List;

import bor.vulkan.Vk10;
import bor.vulkan.VkDevice;
import bor.vulkan.VkInstance;
import bor.vulkan.VkPhysicalDevice;
import bor.vulkan.VkSurfaceKHR;
import bor.vulkan.VkSwapchainKHR;
import bor.vulkan.Vulkan;
import bor.vulkan.enumerations.VkQueueFlagBits;
import bor.vulkan.enumerations.VkResult;
import bor.vulkan.enumerations.VkStructureType;
import bor.vulkan.structs.VkAllocationCallbacks;
import bor.vulkan.structs.VkApplicationInfo;
import bor.vulkan.structs.VkExtensionProperties;
import bor.vulkan.structs.VkInstanceCreateInfo;
import bor.vulkan.structs.VkQueueFamilyProperties;

/**
 * Simple implementation of  VulkanConfigChooser.
 * It also creates a generic VkInstanceCreateInfo
 * 
 * 
 *
 */
public class DefaultVulkanConfigChooser extends VulkanConfigChooser{
   
  // public VulkanAppContext ctx = new VulkanAppContext();
   /*
   protected VkInstance instance;
   protected VkPhysicalDevice physicalDevice;
   protected VkDevice device;
   protected VkAllocationCallbacks pAllocator = null;
   protected VkSwapchainKHR swapchain = null;
   */
   protected boolean supportSwapChain = false;
   
   private int queue_families_count = 0;       
   private int selected_graphics_queue_family_index = -1;
   private int selected_present_queue_family_index = -1;
   
   /**
    * Create VulkanConfigChooser implementation with default VkInstanceCreateInfo
    */
   public DefaultVulkanConfigChooser(){   
       ctx.pCallbackAllocator = null;
       ctx.pCreateInstanceInfo = createInstanceCreateInfo();  
       VkInstance[] pInstance = new VkInstance[1];
       VkResult res = Vk10.vkCreateInstance(ctx.pCreateInstanceInfo, ctx.pCallbackAllocator , pInstance);
       Vulkan.checkError(res);
       ctx.instance = pInstance[0];
   }
   
   /**
    * Create VulkanConfigChooser implementation with user defined
    *  VkInstanceCreateInfo
    * @param pCreateInstanceInfo - VkInstanceCreateInfo with info about application
    */
   public DefaultVulkanConfigChooser(VkInstanceCreateInfo pCreateInstanceInfo){                              
            this(pCreateInstanceInfo, null);
   }
   
   /**
    * Create VulkanConfigChooser implementation with user defined VkInstanceCreateInfo and VkAllocationCallbacks
    * @param pCreateInstanceInfo - user defined VkInstanceCreateInfo
    * @param pCallbackAllocator - user defined VkAllocationCallbacks
    */
   public DefaultVulkanConfigChooser(VkInstanceCreateInfo pCreateInstanceInfo, VkAllocationCallbacks pCallbackAllocator){ 
       ctx.pCallbackAllocator = pCallbackAllocator;
       ctx.pCreateInstanceInfo = pCreateInstanceInfo;
       VkInstance[] pInstance = new VkInstance[1];
       VkResult res = Vk10.vkCreateInstance(pCreateInstanceInfo, ctx.pCallbackAllocator , pInstance);
       Vulkan.checkError(res);
       ctx.instance = pInstance[0];
   }
   
   
   
   /**
    * Creates a very basic VkInstanceCreateInfo instance with VkApplicationInfo.
    * @return a instance of VkInstanceCreateInfo
    */
   public VkInstanceCreateInfo createInstanceCreateInfo(){        
       VkApplicationInfo appInfo = new VkApplicationInfo();
       appInfo.sType(VkStructureType.VK_STRUCTURE_TYPE_APPLICATION_INFO);
       appInfo.pApplicationName("Sample Vulkan application.");        
       appInfo.applicationVersion(Vulkan.VK_MAKE_VERSION(1, 0, 0));
       appInfo.pEngineName("BorVulkan engine.");
       appInfo.engineVersion(Vulkan.VK_MAKE_VERSION(0, 8, 9));
       appInfo.apiVersion(Vulkan.VK_MAKE_VERSION(1, 0, 0));
       
       // extract extensions names
       VkExtensionProperties[] props = queryInstanceExtension();  
       String[] extensions = null;
       if (props == null || props.length ==0) {
           extensions =  new String[props.length];
           for (int i = 0; i < extensions.length; i++) {
            extensions[i] = props[i].extensionName();
        }
       }
       
       VkInstanceCreateInfo pCreateInstanceInfo = new VkInstanceCreateInfo();  
       pCreateInstanceInfo.sType(VkStructureType.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO);
       if(extensions != null){
               pCreateInstanceInfo.enabledExtensionCount(extensions.length);
               pCreateInstanceInfo.ppEnabledExtensionNames(extensions);
       }               
       return pCreateInstanceInfo;
   }
   
   /**
    * Creates a  basic VkInstanceCreateInfo instance with VkApplicationInfo, 
    * with enabled layers and extensions.
    * @param enabledLayers - VkInstance layers to use
    * @param enabledExtensions - VkInstance extensions to use
    * 
    * @return a instance of VkInstanceCreateInfo
    */
   public VkInstanceCreateInfo createInstanceCreateInfo(String[] enabledLayers, String[] enabledExtensions){        
       VkApplicationInfo appInfo = new VkApplicationInfo();
       appInfo.sType(VkStructureType.VK_STRUCTURE_TYPE_APPLICATION_INFO);
       appInfo.pApplicationName("Sample Vulkan application.");        
       appInfo.applicationVersion(Vulkan.VK_MAKE_VERSION(1, 0, 0));
       appInfo.pEngineName("BorVulkan engine.");
       appInfo.engineVersion(Vulkan.VK_MAKE_VERSION(0, 8, 9));
       appInfo.apiVersion(Vulkan.VK_MAKE_VERSION(1, 0, 0));
       
             
       VkInstanceCreateInfo pCreateInstanceInfo = new VkInstanceCreateInfo();  
       pCreateInstanceInfo.sType(VkStructureType.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO);
       if(enabledExtensions != null){
               pCreateInstanceInfo.enabledExtensionCount(enabledExtensions.length);
               pCreateInstanceInfo.ppEnabledExtensionNames(enabledExtensions);
       }   
       if(enabledLayers != null){
           pCreateInstanceInfo.enabledLayerCount(enabledLayers.length);
           pCreateInstanceInfo.ppEnabledLayerNames(enabledLayers);
       }
       return pCreateInstanceInfo;
   }

    
    
    /**
     * Creates a Swapchain.<br>
     * Requires following extensions:
     *  <li> {@link Vulkan#VK_KHR_SWAPCHAIN_EXTENSION_NAME}</li>
     *  <li> {@link Vulkan#VK_KHR_SURFACE_EXTENSION_NAME}</li>
     *  <p>
     *  And one of: 
     *  <li> {@link Vulkan#VK_KHR_ANDROID_SURFACE_EXTENSION_NAME}
     *  <li> {@link Vulkan#VK_KHR_WIN32_SURFACE_EXTENSION_NAME}
     *  <li> {@link Vulkan#VK_KHR_XLIB_SURFACE_EXTENSION_NAME}
     *  <li> {@link Vulkan#VK_KHR_XCB_SURFACE_EXTENSION_NAME}
     *  </p>
     *  
     *  
     * @return
     */
    public boolean createSwapChain(){        
        if(!checkExtensions(null, null))
            return false;
        return false;
    }
    
    /**
     * Required extensions for SwapChain.
     *  <li> {@link Vulkan#VK_KHR_SWAPCHAIN_EXTENSION_NAME}</li>
     *  <li> {@link Vulkan#VK_KHR_SURFACE_EXTENSION_NAME}</li>
     */
    public static final String[] KHR_SWAP_CHAIN_EXTENSIONS = {Vulkan.VK_KHR_SURFACE_EXTENSION_NAME, Vulkan.VK_KHR_SWAPCHAIN_EXTENSION_NAME};
    /**
     * Required extensions for creating surface.
     *  <li> {@link Vulkan#VK_KHR_ANDROID_SURFACE_EXTENSION_NAME}
     *  <li> {@link Vulkan#VK_KHR_WIN32_SURFACE_EXTENSION_NAME}
     *  <li> {@link Vulkan#VK_KHR_XLIB_SURFACE_EXTENSION_NAME}
     *  <li> {@link Vulkan#VK_KHR_XCB_SURFACE_EXTENSION_NAME}
     */
    public static final String[] KHR_SURFACE_EXTENSIONS = { Vulkan.VK_KHR_ANDROID_SURFACE_EXTENSION_NAME, 
                                                            Vulkan.VK_KHR_WIN32_SURFACE_EXTENSION_NAME,
                                                            Vulkan.VK_KHR_XLIB_SURFACE_EXTENSION_NAME,
                                                            Vulkan.VK_KHR_XCB_SURFACE_EXTENSION_NAME};
   
    /**
     * Look up for available extension extensions.
     * @param extensionCheck - extension to look for.
     * @param list - list of available extensions.
     * @return true if list contains extensionCheck.
     */
    public boolean checkExtensions(String extensionCheck, String[] list) {
        for (String test : list) {
            if(test != null && test.trim().equals(extensionCheck))
                return true;
        }
        return false;
    }

    
    public void start() {          
      choosePhysicalDevice(ctx.instance, ctx.surfaceKHR);  
      createDevice();   
    }
    
    
    
    public void createDevice() {  
        
        VkDevice[] pDevice = {null};
        VkResult res = Vk10.vkCreateDevice(ctx.physicalDevice, ctx.pCreateDeviceInfo, ctx.pCallbackAllocator, pDevice );
        
        ctx.device = pDevice[0];
    }

    public VkPhysicalDevice choosePhysicalDevice(VkInstance instance, VkSurfaceKHR surfaceKHR) { 
        List<VkPhysicalDevice> list = enumeratePhysicalDevices(instance);
        if(list.size()==1)
            return list.get(0);
                              
        int graphics_queue_family_index = -1;
        
        for (VkPhysicalDevice physical_device : list) {
            int[] pPropertyCount = { 1 };
            VkExtensionProperties[] pProperties = { null };
            String pLayerName = Vulkan.VK_KHR_SWAPCHAIN_EXTENSION_NAME;
            // check support to swapchain
            VkResult res = Vk10.vkEnumerateDeviceExtensionProperties(physical_device, pLayerName, pPropertyCount, pProperties);
            if(res.isError()){
                continue;
            }
            int[] queue_families_count = {0};
            Vk10.vkGetPhysicalDeviceQueueFamilyProperties( physical_device, queue_families_count, null);
            if( queue_families_count[0] == 0 ) {
                continue;
            }
            int count = queue_families_count[0];
            VkQueueFamilyProperties[] queue_family_properties = new VkQueueFamilyProperties[count] ;
            Vk10.vkGetPhysicalDeviceQueueFamilyProperties( physical_device, queue_families_count, queue_family_properties);
            
            boolean[][]  queue_present_support = new boolean[count][1];
            for( int i = 0; i < count; ++i ) {
                Vk10.vkGetPhysicalDeviceSurfaceSupportKHR( physical_device, i, surfaceKHR, queue_present_support[i] );
                
                VkQueueFlagBits flag = VkQueueFlagBits.fromValue(queue_family_properties[i].queueFlags());
                if( (queue_family_properties[i].queueCount() > 0) && VkQueueFlagBits.isORed(flag, VkQueueFlagBits.VK_QUEUE_GRAPHICS_BIT)) 
                {
                      // Select first queue that supports graphics
                      if( graphics_queue_family_index == -1 ) {
                        graphics_queue_family_index = i;
                      }
                      // If there is queue that supports both graphics and present - prefer it
                      if( queue_present_support[i][0] ) {
                        selected_graphics_queue_family_index = i;
                        selected_present_queue_family_index = i;
                        return physical_device;
                      }
                    }
            } // for i
            
            int present_queue_family_index = -1;
         // We don't have queue that supports both graphics and present so we have to use separate queues
            for( int i = 0; i < count; ++i ) {
              if( queue_present_support[i][0] ) {
                present_queue_family_index = i;
                break;
              }
            }

            // If this device doesn't support queues with graphics and present capabilities don't use it
            if( (graphics_queue_family_index == -1) ||
                (present_queue_family_index == -1) ) {
              System.out.println("Could not find queue family with required properties on physical device " + physical_device + "!" );
              continue;
            }

            selected_graphics_queue_family_index = graphics_queue_family_index;
            selected_present_queue_family_index = present_queue_family_index;
            return physical_device;             
         }//foreach VkPhysicalDevice
        return null;
    }
    
    /**
     * Get a list of VkPhysicalDevices available.
     * @param instance - VkInstance to query
     * @return list of VkPhysicalDevices
     */
    public List<VkPhysicalDevice> enumeratePhysicalDevices(VkInstance instance){
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
    
    /*
     * @todo rename to start
     * (non-Javadoc)
     * @see bor.util.VulkanSurfaceView.VulkanConfigChooser#chooseDevice()
     */
    @Override        
    public VkDevice chooseDevice() {
        if(ctx.device==null){
           start();
        }
        return ctx.device;
    }

    /*
     * (non-Javadoc)
     * @see bor.util.VulkanSurfaceView.VulkanConfigChooser#getVkInstance()
     */        
    public VkInstance getVkInstance() {
        return ctx.instance;
    }

    /*
     * (non-Javadoc)
     * @see bor.util.VulkanSurfaceView.VulkanConfigChooser#getVkPhysicalDevice()
     */       
    public VkPhysicalDevice getVkPhysicalDevice() {
        return ctx.physicalDevice;
    }
    
    
   
    /*
     * (non-Javadoc)
     * @see bor.util.VulkanSurfaceView.VulkanConfigChooser#getVkAllocationCallbacks()
     */  
    public VkAllocationCallbacks getVkAllocationCallbacks() {
        return ctx.pCallbackAllocator;
    }

    @Override
    public void destroyDevice() {
        Vk10.vkDestroyDevice(ctx.device, ctx.pCallbackAllocator); 
        ctx.device.setPointer(0L);
        ctx.device = null;
    }

   
    @Override
    public void destroyVkInstance() {
        Vk10.vkDestroyInstance(ctx.instance, ctx.pCallbackAllocator);
        ctx.instance.setPointer(0L);
        ctx.instance = null;
        ctx.pCallbackAllocator = null;
    }

    @Override
    public VkResult createVkInstance() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public VkInstanceCreateInfo createDefaultInstanceCreateInfo() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public VkSurfaceKHR createSurfaceKHR() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void destroySurfaceKHR() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public VkPhysicalDevice chooseVkPhysicalDevice(VkPhysicalDevice[] devices, VkSurfaceKHR surface) {
        // TODO Auto-generated method stub
        return null;
    }

} // class SimpleVulkanConfigChooser

//////////////////////////////////////////////////////////////////////////////////////