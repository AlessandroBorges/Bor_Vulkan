#ifndef WSI_H
#define WSI_H

 #include <vulkan.h>
 #include <stdio.h>
 #include <stdlib.h>

   #define GET_INSTANCE_PROC_ADDR(inst, entrypoint)                               \
    {                                                                          \
        pfn##entrypoint =                                                 \
            (PFN_vk##entrypoint)vkGetInstanceProcAddr(inst, "vk"#entrypoint); \
        if (fpn##entrypoint == NULL) {                                    \
            printf("vkGetInstanceProcAddr failed to find vk"#entrypoint);       \
        }                                                                      \
    } \



 #define GET_DEVICE_PROC_ADDR(dev, entrypoint)                                  \
    {                                                                          \
        pfn##entrypoint =                                                 \
            (PFN_vk##entrypoint)g_gdpa(dev, "vk"#entrypoint); \n          \
        if (pfn##entrypoint == NULL) {                                    \
            printf("vkGetDeviceProcAddr failed to find vk"#entrypoint);      \
        }                                                                      \
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


    PFN_vkGetPhysicalDeviceDisplayPropertiesKHR      pfnGetPhysicalDeviceDisplayPropertiesKHR;
    PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR pfnGetPhysicalDeviceDisplayPlanePropertiesKHR;
    PFN_vkGetDisplayModePropertiesKHR                pfnGetDisplayModePropertiesKHR;
    PFN_vkGetDisplayPlaneCapabilitiesKHR             pfnGetDisplayPlaneCapabilitiesKHR;
    PFN_vkGetDisplayPlaneSupportedDisplaysKHR        pfnGetDisplayPlaneSupportedDisplaysKHR;
    PFN_vkCreateDisplayPlaneSurfaceKHR               pfnCreateDisplayPlaneSurfaceKHR;

    // instance procedures
    PFN_vkGetPhysicalDeviceSurfaceSupportKHR       pfnGetPhysicalDeviceSurfaceSupportKHR;
    PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR  pfnGetPhysicalDeviceSurfaceCapabilitiesKHR;
    PFN_vkGetPhysicalDeviceSurfaceFormatsKHR       pfnGetPhysicalDeviceSurfaceFormatsKHR;
    PFN_vkGetPhysicalDeviceSurfacePresentModesKHR  pfnGetPhysicalDeviceSurfacePresentModesKHR;

    // device procedures
    PFN_vkCreateSwapchainKHR    pfnCreateSwapchainKHR;
    PFN_vkDestroySwapchainKHR   pfnDestroySwapchainKHR;
    PFN_vkGetSwapchainImagesKHR pfnGetSwapchainImagesKHR;
    PFN_vkAcquireNextImageKHR   pfnAcquireNextImageKHR;
    PFN_vkQueuePresentKHR       pfnQueuePresentKHR;

    protected:
    private:
        PFN_vkGetDeviceProcAddr g_gdpa = NULL;
};

#endif // WSI_H
