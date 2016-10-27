/**
 * 
 */
package bor.util;


import bor.vulkan.Vk10;
import bor.vulkan.VkDevice;
import bor.vulkan.VkInstance;
import bor.vulkan.VkPhysicalDevice;
import bor.vulkan.VkSurfaceKHR;
import bor.vulkan.enumerations.VkColorSpaceKHR;
import bor.vulkan.enumerations.VkFormat;
import bor.vulkan.enumerations.VkResult;
import bor.vulkan.structs.VkAllocationCallbacks;
import bor.vulkan.structs.VkApplicationInfo;
import bor.vulkan.structs.VkExtensionProperties;
import bor.vulkan.structs.VkInstanceCreateInfo;
import bor.vulkan.structs.VkLayerProperties;
import bor.vulkan.structs.VkSurfaceFormatKHR;

import static bor.vulkan.Vk10.*;

import android.view.SurfaceHolder;

/**
 * @author Alessandro Borges
 *
 */
/**
 * Class to set <b><i>user defined</i></b> methods to create Vulkan's VkInstance, PhysicalDevice and Device.<br>
 * All info will stored in {@link VulkanConfigChooser#ctx}, a instance of {@link VulkanAppContext}.<br> 
 */
public abstract class VulkanConfigChooser {

    /**
     * Stateful object with all relevant Vulkan info.
     */
    public VulkanAppContext ctx;
    
    /**
     * Plain Ctor. Uses default, clean instance of VulkanAppContext and DefaultWindowSurfaceFactory
     */
    public VulkanConfigChooser(){
        this(new VulkanAppContext(), new DefaultWindowSurfaceFactory());
    }

    /**
     * Ctor. <br>
     * Creates a VulkanConfigChooser with a user defined VulkanAppContext instance.
     * @param vulkanAppContext - user defined VulkanAppContext.
     */
    public VulkanConfigChooser(VulkanAppContext vulkanAppContext) {
        this(vulkanAppContext, new DefaultWindowSurfaceFactory());
    }

    /**
     * Ctor.
     * @param vulkanAppContext - User defined VulkanAppContext instance
     * @param windowSurfaceFactory - user defined WindowSurfaceFactory
     */
    public VulkanConfigChooser(VulkanAppContext vulkanAppContext, WindowSurfaceFactory windowSurfaceFactory) {
        this.ctx = vulkanAppContext;
        this.ctx.windowSurfaceFactory = windowSurfaceFactory;
    }
    /**
     * This method must create the following Vulkan objects:<br>
     * VkInstance - create the VkInstance to be used here. <br>
     * VkPhysicalDevice - chosen PhysicalDevice, among the enumerated ones. <br>
     * VkDevice - device
     * 
     * @return
     */
    public abstract VkDevice chooseDevice();

    /**
     * Return the current VkInstance.
     * Allow layers
     * 
     * @return result of operation
     */
    public abstract VkResult createVkInstance();

    /**
     * Query available VkLayerProperties.<br>
     * Returns null if there is no Layers avaialable.
     * 
     * @return array of available Layer properties
     */
    public VkLayerProperties[] queryInstanceLayers() {
        int[] count = { 0 };
        VkResult res = vkEnumerateInstanceLayerProperties(count, null);
        Vk10.checkError(res);
        if (count[0] == 0) return null;

        VkLayerProperties[] pProperties = new VkLayerProperties[count[0]];
        res = vkEnumerateInstanceLayerProperties(count, pProperties);
        Vk10.checkError(res);
        return pProperties;
    }
    
    /**
     * User defined {@link VkInstanceCreateInfo} and {@link VkApplicationInfo}
     * @return instance of VkInstanceCreateInfo
     */
    public abstract VkInstanceCreateInfo createDefaultInstanceCreateInfo(); 
    
    /**
     * User defined {@link VkInstanceCreateInfo} and {@link VkApplicationInfo}
     * @param enabledLayers - VkInstance layers to enable
     * @param enabledExtensions - VkInstance extensions to enable 
     * @return
     */
    public abstract VkInstanceCreateInfo createInstanceCreateInfo(String[] enabledLayers, String[] enabledExtensions);
    
    /**
     * Query <b><i>Instance</i></b> extensions properties.<br>
     * Returns null if there is no extensions avaialable.
     * 
     * @return array of VkExtensionProperties with avaialable Instance extensions
     */
    public VkExtensionProperties[] queryInstanceExtension() {
        int[] count = { 0 };
        VkExtensionProperties[] pProperties = null;
        VkResult res = vkEnumerateInstanceExtensionProperties(null, count, pProperties);
        if (count[0] == 0) return null;

        pProperties = new VkExtensionProperties[count[0]];
        res = vkEnumerateInstanceExtensionProperties(null, count, pProperties);
        Vk10.checkError(res);
        return pProperties;
    }

    /**
     * Query <b><i>Device</i></b> Extensions properties.<br>
     * Returns null if there is no extensions avaialable.
     * 
     * @return array of VkExtensionProperties with avaialable Instance extensions
     */
    public VkExtensionProperties[] queryDeviceExtension() {
        int[] count = { 0 };
        VkExtensionProperties[] pProperties = null;
        VkResult res = Vk10.vkEnumerateDeviceExtensionProperties(ctx.physicalDevice, null, count, pProperties);
        if (count[0] == 0) return null;

        pProperties = new VkExtensionProperties[count[0]];
        res = Vk10.vkEnumerateInstanceExtensionProperties(null, count, pProperties);
        Vk10.checkError(res);
        return pProperties;
    }

    /**
     * Extract names from a array VkExtensionProperties
     * 
     * @param extensions array of VkExtensionProperties, previously queried.
     * @return array with extension names.
     */
    public String[] extractNames(VkExtensionProperties[] extensions) {
        if (extensions == null || extensions.length < 1) return null;
        String[] names = new String[extensions.length];

        for (int i = 0; i < names.length; i++) {
            VkExtensionProperties p = extensions[i];
            names[i] = p == null ? null : p.extensionName();
        }
        return names;
    }

    /**
     * Extract names from a array VkExtensionProperties
     * 
     * @param layers array of VkLayerProperties, previously queried.
     * @return array with extension names.
     */
    public String[] extractNames(VkLayerProperties[] layers) {
        if (layers == null || layers.length < 1) return null;
        String[] names = new String[layers.length];

        for (int i = 0; i < names.length; i++) {
            VkLayerProperties p = layers[i];
            names[i] = p == null ? null : p.layerName();
        }
        return names;
    }

    /**
     * Query avaialable PhysicalDevices.<br>
     * Call this method after VkInstance creation.
     * 
     * @return
     */
    public VkPhysicalDevice[] queryPhysicalDevices() {
        int[] pPhysicalDeviceCount = { 0 };
        VkPhysicalDevice[] pPhysicalDevices = null;
        VkResult res = Vk10.vkEnumeratePhysicalDevices(ctx.instance, pPhysicalDeviceCount, pPhysicalDevices);
        Vk10.checkError(res);

        if (pPhysicalDeviceCount[0] == 0) { return null; }
        pPhysicalDevices = new VkPhysicalDevice[pPhysicalDeviceCount[0]];
        res = Vk10.vkEnumeratePhysicalDevices(ctx.instance, pPhysicalDeviceCount, pPhysicalDevices);
        Vk10.checkError(res);

        return pPhysicalDevices;
    }

    /**
     * Choose the best avaialable VkSurfaceFormatKHR
     * @param surfaceFormats array of avaialable SurfaceFormats;
     * @return best SurfaceFormat. Possibly a VkFormat.VK_FORMAT_R8G8B8A8_UNORM 
     *        with VK_COLOR_SPACE_SRGB_NONLINEAR_KHR. 
     */
    public VkSurfaceFormatKHR chooseBestSurfaceFormatKHR(VkSurfaceFormatKHR[] surfaceFormats){
        // If the list contains only one entry with undefined format
        // it means that there are no preferred surface formats and any can be chosen
        if( (surfaceFormats.length == 1) && (surfaceFormats[0].format() == VkFormat.VK_FORMAT_UNDEFINED) ) {
            
            VkSurfaceFormatKHR res = new VkSurfaceFormatKHR();                
            res.format(VkFormat.VK_FORMAT_R8G8B8A8_UNORM);
            res.colorSpace(VkColorSpaceKHR.VK_COLOR_SPACE_SRGB_NONLINEAR_KHR);
            return res;
        }

        // Check if list contains most widely used R8 G8 B8 A8 format
        // with nonlinear color space
        for( VkSurfaceFormatKHR surFormat : surfaceFormats ) {
          if( surFormat.format() == VkFormat.VK_FORMAT_R8G8B8A8_UNORM ) {
            return surFormat;
          }
        }
        // Return the first format from the list
        return surfaceFormats[0];
    }
    
    public abstract VkSurfaceKHR createSurfaceKHR();

    public abstract void destroySurfaceKHR();


    /**
     * This method uses 
     * @param surfaceHolder
     * @return
     */
     public boolean createSurface(SurfaceHolder surfaceHolder) {        
             destroySurface();            
             ctx.surfaceKHR = ctx.windowSurfaceFactory.createWindowSurface(ctx.instance,
                                                                            ctx.pCallbackAllocator, 
                                                                            surfaceHolder);               
             return (ctx.surfaceKHR != null);
     }

     /**
      * 
      */
     public void destroySurface() {
         System.err.println("Destroy Surface requested");
         if(ctx.surfaceKHR==null || ctx.instance==null)
             return;            
            
         if(ctx != null){           
            ctx.windowSurfaceFactory.destroySurface(ctx.instance,
                                                    ctx.surfaceKHR);
         }
         ctx.surfaceKHR.setPointer(0L);
         ctx.surfaceKHR = null;
     }
    
    /**
     * Return the chosen PhysicalDevice
     * 
     * @return
     */
    public abstract VkPhysicalDevice chooseVkPhysicalDevice(VkPhysicalDevice[] devices, VkSurfaceKHR surface);

    
    
    
    /**
     * destroy current VkDevice.
     */
    public abstract void destroyDevice();

    /**
     * Destroy current Instance.
     */
    public abstract void destroyVkInstance();

}// end abstract class VulkanConfigChooser
    