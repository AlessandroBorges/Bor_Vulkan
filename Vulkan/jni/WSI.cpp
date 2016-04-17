
#include <WSI.h>

WSI::WSI(VkInstance _instance,VkDevice _device)
{
    instance = _instance;
    device = _device;
    init();
    //ctor
}

WSI::~WSI()
{
    //dtor
}
/**
 * Initialize instance and device related functions
 */
void WSI::init(){
    // platforms support 
	isWin32 = false;
	isAndroid = false;
	isMIR = false;
	isWayland = false;
	isXCB = false;
	isXLIB = false;
	
    g_gdpa = (PFN_vkGetDeviceProcAddr)vkGetInstanceProcAddr(instance, "vkGetDeviceProcAddr");

   //instance  
   GET_INSTANCE_PROC_ADDR(instance, GetPhysicalDeviceSurfaceSupportKHR);
   GET_INSTANCE_PROC_ADDR(instance, GetPhysicalDeviceSurfaceCapabilitiesKHR);
   GET_INSTANCE_PROC_ADDR(instance, GetPhysicalDeviceSurfaceFormatsKHR);
   GET_INSTANCE_PROC_ADDR(instance, GetPhysicalDeviceSurfacePresentModesKHR);
   GET_INSTANCE_PROC_ADDR(instance, GetPhysicalDeviceDisplayPropertiesKHR);
   GET_INSTANCE_PROC_ADDR(instance, GetPhysicalDeviceDisplayPlanePropertiesKHR);
   GET_INSTANCE_PROC_ADDR(instance, GetDisplayModePropertiesKHR);
   GET_INSTANCE_PROC_ADDR(instance, GetDisplayPlaneCapabilitiesKHR);
   GET_INSTANCE_PROC_ADDR(instance, GetDisplayPlaneSupportedDisplaysKHR);
   GET_INSTANCE_PROC_ADDR(instance, CreateDisplayPlaneSurfaceKHR);
   
   #ifdef VK_USE_PLATFORM_ANDROID_KHR  
     GET_INSTANCE_PROC_ADDR(instance, CreateAndroidSurfaceKHR);
	 isAndroid = true;
   #endif
   
    #ifdef VK_USE_PLATFORM_WIN32_KHR
    GET_INSTANCE_PROC_ADDR(instance, CreateWin32SurfaceKHR);
	GET_INSTANCE_PROC_ADDR(instance, GetPhysicalDeviceWin32PresentationSupportKHR);
	isWin32 = true;
   #endif 

   #ifdef VK_USE_PLATFORM_MIR_KHR
	GET_INSTANCE_PROC_ADDR(instance, CreateMirSurfaceKHR);
	GET_INSTANCE_PROC_ADDR(instance, GetPhysicalDeviceMirPresentationSupportKHR);
	isMIR = true;
   #endif
   
   #ifdef VK_USE_PLATFORM_WAYLAND_KHR
   GET_INSTANCE_PROC_ADDR(instance, CreateWaylandSurfaceKHR);
   GET_INSTANCE_PROC_ADDR(instance, pfnGetPhysicalDeviceWaylandPresentationSupportKHR);
   isWayland = true;
   #endif
	
   #ifdef VK_USE_PLATFORM_XCB_KHR
    GET_INSTANCE_PROC_ADDR(instance, CreateXcbSurfaceKHR);
	GET_INSTANCE_PROC_ADDR(instance, GetPhysicalDeviceXcbPresentationSupportKHR);
	isXCB = true;
   #endif   
	
	#ifdef VK_USE_PLATFORM_XLIB_KHR
	  GET_INSTANCE_PROC_ADDR(instance, CreateXlibSurfaceKHR);
	  GET_INSTANCE_PROC_ADDR(instance, GetPhysicalDeviceXlibPresentationSupportKHR);
	  isXLIB = true;
	#endif   
   
   //pfnCreateSharedSwapchainsKHR
   //device 
   GET_DEVICE_PROC_ADDR(device,CreateSharedSwapchainsKHR);
   GET_DEVICE_PROC_ADDR(device,CreateSwapchainKHR);
   GET_DEVICE_PROC_ADDR(device,DestroySwapchainKHR);
   GET_DEVICE_PROC_ADDR(device,GetSwapchainImagesKHR);
   GET_DEVICE_PROC_ADDR(device,AcquireNextImageKHR);
   GET_DEVICE_PROC_ADDR(device,QueuePresentKHR);

}

