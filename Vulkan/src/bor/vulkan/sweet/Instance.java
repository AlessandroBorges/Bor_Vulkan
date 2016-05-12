/**
 * 
 */
package bor.vulkan.sweet;

import bor.vulkan.Vk10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bor.vulkan.*;
import bor.vulkan.enumerations.VkResult;
import bor.vulkan.khr.VkSurfaceKHR;
import bor.vulkan.khr.WSI;
import bor.vulkan.khr.structs.VkAndroidSurfaceCreateInfoKHR;
import bor.vulkan.khr.structs.VkDisplaySurfaceCreateInfoKHR;
import bor.vulkan.khr.structs.VkMirSurfaceCreateInfoKHR;
import bor.vulkan.khr.structs.VkWaylandSurfaceCreateInfoKHR;
import bor.vulkan.khr.structs.VkWin32SurfaceCreateInfoKHR;
import bor.vulkan.khr.structs.VkXcbSurfaceCreateInfoKHR;
import bor.vulkan.khr.structs.VkXlibSurfaceCreateInfoKHR;
import bor.vulkan.structs.*;

/**
 * @author Alessandro Borges
 *
 */
public class Instance {
    
    VkInstance vkInstance;
    VkInstanceCreateInfo pCreateInfo;     
    VkAllocationCallbacks pAllocator;
    
    WSI wsi;
    
    List<PhysicalDevice> physicalDeviceList = new ArrayList<PhysicalDevice>(2);
    
    static ResultHandler rh = ResultHandler.getInstance();
    
    List<VkSurfaceKHR> surfaceList = new ArrayList<VkSurfaceKHR>(2);
    
    /**
     * Lock Constructor
     */
    /* package private */ Instance(){}
    
    public static Instance createInstance(VkInstanceCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator){
        VkInstance[] pInstance = new VkInstance[1];
        VkResult res = Vk10.vkCreateInstance(pCreateInfo, pAllocator, pInstance);
        rh.check("createInstance", res);
        if(res.getValue()<0){
            return null;
        }
            
        Instance instance = new Instance();
        instance.vkInstance = pInstance[0];
        instance.pAllocator = pAllocator;
        
        return instance;
    }
    
    /**
     * Get the current available Physical Devices in this system. 
     * @return List of available PhysicalDevices
     */
    public List<PhysicalDevice> enumeratePhysicalDevices(){        
        if(physicalDeviceList.size() > 0){
            return physicalDeviceList;
        }        
        List<VkPhysicalDevice> vkList = new ArrayList<VkPhysicalDevice>(4);
        VkResult res = Vk10.vkEnumeratePhysicalDevices(vkInstance, vkList); 
        rh.check("enumeratePhysicalDevices", res);
        
        for (VkPhysicalDevice vkPhysicalDevice : vkList) {
            PhysicalDevice phy = new PhysicalDevice(this, vkPhysicalDevice);
            physicalDeviceList.add(phy);
        }        
        return physicalDeviceList;
    }
    
    
    /**
     * Enumerate all available Instance Layers Properties
     * @return List of available VkLayerProperties 
     */
    public List<VkLayerProperties> enumerateInstanceLayersProperties(){        
        List<VkLayerProperties> pProperties = new ArrayList<VkLayerProperties>();
        VkResult res = Vk10.vkEnumerateInstanceLayerProperties(pProperties);
        rh.check("enumerateInstanceLayersProperties", res);
        return pProperties;
    }
    
    /**
     * Enumerate all extensions properties of pLayerName
     * @param pLayerName - name of layer to query properties
     * @return list of VkExtensionProperties
     */
    public List<VkExtensionProperties> enumerateInstanceExtensionsProperties(String pLayerName){        
         List<VkExtensionProperties> pProperties = new ArrayList<VkExtensionProperties>();
        VkResult res =  Vk10.vkEnumerateInstanceExtensionProperties(pLayerName, pProperties);
        rh.check("enumerateInstanceExtensionsProperties", res);
        return pProperties;
    }
    
    /**
     * 
     * @param pCreateWin32Info
     * @return
     */
    public VkSurfaceKHR createWin32SurfaceKHR(VkWin32SurfaceCreateInfoKHR pCreateWin32Info){        
        VkSurfaceKHR[] pSurface = new VkSurfaceKHR[1];
        VkResult res = Vk10.vkCreateWin32SurfaceKHR(this.vkInstance, pCreateWin32Info, this.pAllocator, pSurface);
        rh.check("createWin32SurfaceKHR", res);
        VkSurfaceKHR surface = pSurface[0];        
        pSurface[0] = null;
        surfaceList.add(surface);
        return surface;
    }
   
    /**
     * 
     * @param pCreateXcbInfo
     * @return
     */
    public VkSurfaceKHR createXcbSurfaceKHR (VkXcbSurfaceCreateInfoKHR pCreateXcbInfo){        
        VkSurfaceKHR[] pSurface = new VkSurfaceKHR[1];
        VkResult res = Vk10.vkCreateXcbSurfaceKHR(this.vkInstance, pCreateXcbInfo, this.pAllocator, pSurface);
        rh.check("createXcbSurfaceKHR", res);
        VkSurfaceKHR surface = pSurface[0];
        pSurface[0] = null;
        surfaceList.add(surface);
        return surface;
    }
    
    /**
     * 
     * @param pCreateAndroidInfo
     * @return
     */
    public VkSurfaceKHR createAndroidSurfaceKHR (VkAndroidSurfaceCreateInfoKHR pCreateAndroidInfo){        
        VkSurfaceKHR[] pSurface = new VkSurfaceKHR[1];
        VkResult res = Vk10.vkCreateAndroidSurfaceKHR(this.vkInstance, pCreateAndroidInfo, this.pAllocator, pSurface);
        rh.check("createAndroidSurfaceKHR", res);
        VkSurfaceKHR surface = pSurface[0];
        pSurface[0] = null;
        surfaceList.add(surface);
        return surface;
    }
    
    /**
     * 
     * @param pCreateMirInfo
     * @return
     */
    public VkSurfaceKHR createMirSurfaceKHR (VkMirSurfaceCreateInfoKHR pCreateMirInfo){        
        VkSurfaceKHR[] pSurface = new VkSurfaceKHR[1];
        VkResult res = Vk10.vkCreateMirSurfaceKHR(this.vkInstance, pCreateMirInfo, this.pAllocator, pSurface);
        rh.check("createMirSurfaceKHR", res);
        VkSurfaceKHR surface = pSurface[0];
        pSurface[0] = null;
        surfaceList.add(surface);
        return surface;
    }
    
    /**
     * 
     * @param pCreateWaylandInfo
     * @return
     */
    public VkSurfaceKHR createWaylandSurfaceKHR (VkWaylandSurfaceCreateInfoKHR pCreateWaylandInfo){        
        VkSurfaceKHR[] pSurface = new VkSurfaceKHR[1];
        VkResult res = Vk10.vkCreateWaylandSurfaceKHR(this.vkInstance, pCreateWaylandInfo, this.pAllocator, pSurface);
        rh.check("createWaylandSurfaceKHR", res);
        VkSurfaceKHR surface = pSurface[0];
        pSurface[0] = null;
        surfaceList.add(surface);
        return surface;
    }
    
    /**
     * 
     * @param pCreateXlibInfo
     * @return
     */
    public VkSurfaceKHR createXlibSurfaceKHR (VkXlibSurfaceCreateInfoKHR pCreateXlibInfo){        
        VkSurfaceKHR[] pSurface = new VkSurfaceKHR[1];
        VkResult res = Vk10.vkCreateXlibSurfaceKHR(this.vkInstance, pCreateXlibInfo, this.pAllocator, pSurface);
        rh.check("createXlibSurfaceKHR", res);
        VkSurfaceKHR surface = pSurface[0];
        pSurface[0] = null;
        surfaceList.add(surface);
        return surface;
    }
    
    /**
     * 
     * @param surfaceKHR
     * @return true if surface was destroyed
     */
    public boolean destroySurface(VkSurfaceKHR surfaceKHR){
       if(surfaceList.contains(surfaceKHR) && surfaceKHR != null){
           Vk10.vkDestroySurfaceKHR(this.vkInstance, surfaceKHR, this.pAllocator);
           surfaceList.remove(surfaceKHR);
           surfaceKHR.free();
           return true;
       }
        return false;
    }
    
    /**
     * 
     * @param pCreateDisplayPlaneInfo
     * @return VkSurfaceKHR
     */
    public VkSurfaceKHR vkCreateDisplayPlaneSurfaceKHR(VkDisplaySurfaceCreateInfoKHR pCreateDisplayPlaneInfo){
        VkSurfaceKHR[] pSurface = new VkSurfaceKHR[1];
        VkResult res = Vk10.vkCreateDisplayPlaneSurfaceKHR(vkInstance, pCreateDisplayPlaneInfo, pAllocator, pSurface);        
        rh.check("vkCreateDisplayPlaneSurfaceKHR", res);
        VkSurfaceKHR surface = pSurface[0];
        pSurface[0] = null;
        surfaceList.add(surface);
        return surface;
    }
    
    /**
     * Destroy this instance
     */
    public void destroy(){
        
        if(physicalDeviceList != null && physicalDeviceList.size()>0){
            for (PhysicalDevice physicalDevice : physicalDeviceList) {
                physicalDevice.destroy();
            }
        }
        physicalDeviceList.clear();
        physicalDeviceList = null;
        
        /**
         * destroy pending surfaces
         */
        for(VkSurfaceKHR surface : surfaceList){
            destroySurface(surface);
        }
        surfaceList.clear();
        
        
        // main objects
        Vk10.vkDestroyInstance(vkInstance, pAllocator);
        this.vkInstance.free();
        this.pCreateInfo.free();
        //assume that instance is the very last one VkObject to leave;
        if(pAllocator!=null)
            pAllocator.free();
        wsi.free();
        
        vkInstance = null;
        pCreateInfo = null;
        wsi = null;
        
        
    }
    
    
    
    
    /**
     * 
     * @return the internal VkInstance object 
     */
    public VkInstance getVkInstance(){
        return this.vkInstance;
    }
    
    /**
     * @return the pCreateInfo
     */
    public VkInstanceCreateInfo getVkInstanceCreateInfo() {
        return pCreateInfo;
    }

    /**
     * @return the pAllocator
     */
    public VkAllocationCallbacks getVkAllocatorCallback() {
        return pAllocator;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Instance [vkInstance: ")
                .append(vkInstance)
                .append(", pCreateInfo: ")
                .append(pCreateInfo)
                .append(", pAllocator: ")
                .append(pAllocator)
                .append("]");
        return builder.toString();
    }
    
    
    
    
    

}
