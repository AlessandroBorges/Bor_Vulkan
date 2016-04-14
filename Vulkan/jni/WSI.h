#ifndef WSI_H
#define WSI_H


 #include <vulkan/vulkan.h>
 #include <stdio.h>
 #include <stdlib.h>

   #define GET_INSTANCE_PROC_ADDR(inst, entrypoint)                       \
    {                                                                     \
        pfn##entrypoint =                                                 \
            (PFN_vk##entrypoint)vkGetInstanceProcAddr(inst, "vk"#entrypoint); \
        if (pfn##entrypoint == NULL) {                                    \
            printf("vkGetInstanceProcAddr failed to find vk"#entrypoint); \
        }                                                                 \
    } \



 #define GET_DEVICE_PROC_ADDR(dev, entrypoint)                         \
    {                                                                  \
        pfn##entrypoint =                                              \
            (PFN_vk##entrypoint)g_gdpa(dev, "vk"#entrypoint);          \
        if (pfn##entrypoint == NULL) {                                 \
            printf("vkGetDeviceProcAddr failed to find vk"#entrypoint);\
        }                                                              \
    }            \
      \

class WSI
{
    public:
        WSI(VkInstance _instance,VkDevice _device );
        virtual ~WSI();
        void init();

    VkInstance instance;
    VkDevice device;

    // instance procedures
    PFN_vkGetPhysicalDeviceSurfaceSupportKHR         pfnGetPhysicalDeviceSurfaceSupportKHR; //i01
    PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR    pfnGetPhysicalDeviceSurfaceCapabilitiesKHR; //i02
    PFN_vkGetPhysicalDeviceSurfaceFormatsKHR         pfnGetPhysicalDeviceSurfaceFormatsKHR; //i03
    PFN_vkGetPhysicalDeviceSurfacePresentModesKHR    pfnGetPhysicalDeviceSurfacePresentModesKHR; //i04
    PFN_vkGetPhysicalDeviceDisplayPropertiesKHR      pfnGetPhysicalDeviceDisplayPropertiesKHR;  //i05
    PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR pfnGetPhysicalDeviceDisplayPlanePropertiesKHR; //i06
	
		
    PFN_vkGetDisplayModePropertiesKHR                pfnGetDisplayModePropertiesKHR; //i07
    PFN_vkGetDisplayPlaneCapabilitiesKHR             pfnGetDisplayPlaneCapabilitiesKHR; //i08
    PFN_vkGetDisplayPlaneSupportedDisplaysKHR        pfnGetDisplayPlaneSupportedDisplaysKHR; //i09
    PFN_vkCreateDisplayPlaneSurfaceKHR               pfnCreateDisplayPlaneSurfaceKHR; //i10
    PFN_vkCreateDisplayModeKHR                       pfnCreateDisplayModeKHR;//i11
	
	bool isWin32;
	bool isAndroid;
	bool isMIR;
	bool isWayland;
	bool isXCB;
	bool isXLIB;
	
   #ifdef VK_USE_PLATFORM_ANDROID_KHR  
     PFN_vkCreateAndroidSurfaceKHR pfnCreateAndroidSurfaceKHR;
   #endif
   #ifdef VK_USE_PLATFORM_WIN32_KHR
    PFN_vkCreateWin32SurfaceKHR pfnCreateWin32SurfaceKHR;
	PFN_vkGetPhysicalDeviceWin32PresentationSupportKHR pfnGetPhysicalDeviceWin32PresentationSupportKHR;
   #endif 

   #ifdef VK_USE_PLATFORM_MIR_KHR
	PFN_vkCreateMirSurfaceKHR pfnCreateMirSurfaceKHR;
	PFN_vkGetPhysicalDeviceMirPresentationSupportKHR pfnGetPhysicalDeviceMirPresentationSupportKHR;
   #endif
   
   #ifdef VK_USE_PLATFORM_WAYLAND_KHR
   PFN_vkCreateWaylandSurfaceKHR pfnCreateWaylandSurfaceKHR;
   PFN_vkGetPhysicalDeviceWaylandPresentationSupportKHR pfnGetPhysicalDeviceWaylandPresentationSupportKHR;
   #endif
	
   #ifdef VK_USE_PLATFORM_XCB_KHR
    PFN_vkCreateXcbSurfaceKHR pfnCreateXcbSurfaceKHR;
	PFN_vkGetPhysicalDeviceXcbPresentationSupportKHR pfnGetPhysicalDeviceXcbPresentationSupportKHR;
   #endif   
	
   #ifdef VK_USE_PLATFORM_XLIB_KHR
    PFN_vkCreateXlibSurfaceKHR pfnCreateXlibSurfaceKHR;
    PFN_vkGetPhysicalDeviceXlibPresentationSupportKHR pfnGetPhysicalDeviceXlibPresentationSupportKHR;
   #endif
	
	
    // device procedures
    PFN_vkCreateSwapchainKHR    pfnCreateSwapchainKHR; //d01
    PFN_vkDestroySwapchainKHR   pfnDestroySwapchainKHR; //d02
    PFN_vkGetSwapchainImagesKHR pfnGetSwapchainImagesKHR; //d03
    PFN_vkAcquireNextImageKHR   pfnAcquireNextImageKHR; //d04
    PFN_vkQueuePresentKHR       pfnQueuePresentKHR; //d05

    protected:
    private:
        PFN_vkGetDeviceProcAddr g_gdpa = NULL;
};

#endif // WSI_H
