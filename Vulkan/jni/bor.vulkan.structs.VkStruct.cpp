#include <bor.vulkan.structs.VkStruct.h>

//@line:35

   #include <BorVulkan.hpp>
     
     JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkStruct_sizeOf(JNIEnv* env, jclass clazz, jint structID) {


//@line:500

     
     size_t _size = 0; 
     switch((int)(structID)){
         case bor_vulkan_structs_VkStruct_VKAPPLICATIONINFO_ID :  _size = sizeof(VkApplicationInfo);break;
         case bor_vulkan_structs_VkStruct_VKINSTANCECREATEINFO_ID :  _size = sizeof(VkInstanceCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKALLOCATIONCALLBACKS_ID :  _size = sizeof(VkAllocationCallbacks);break;
         case bor_vulkan_structs_VkStruct_VKPHYSICALDEVICEFEATURES_ID :  _size = sizeof(VkPhysicalDeviceFeatures);break;
         case bor_vulkan_structs_VkStruct_VKFORMATPROPERTIES_ID :  _size = sizeof(VkFormatProperties);break;
         case bor_vulkan_structs_VkStruct_VKEXTENT3D_ID :  _size = sizeof(VkExtent3D);break;
         case bor_vulkan_structs_VkStruct_VKIMAGEFORMATPROPERTIES_ID :  _size = sizeof(VkImageFormatProperties);break;
         case bor_vulkan_structs_VkStruct_VKPHYSICALDEVICELIMITS_ID :  _size = sizeof(VkPhysicalDeviceLimits);break;
         case bor_vulkan_structs_VkStruct_VKPHYSICALDEVICESPARSEPROPERTIES_ID :  _size = sizeof(VkPhysicalDeviceSparseProperties);break;
         case bor_vulkan_structs_VkStruct_VKPHYSICALDEVICEPROPERTIES_ID :  _size = sizeof(VkPhysicalDeviceProperties);break;
         case bor_vulkan_structs_VkStruct_VKQUEUEFAMILYPROPERTIES_ID :  _size = sizeof(VkQueueFamilyProperties);break;
         case bor_vulkan_structs_VkStruct_VKMEMORYTYPE_ID :  _size = sizeof(VkMemoryType);break;
         case bor_vulkan_structs_VkStruct_VKMEMORYHEAP_ID :  _size = sizeof(VkMemoryHeap);break;
         case bor_vulkan_structs_VkStruct_VKPHYSICALDEVICEMEMORYPROPERTIES_ID :  _size = sizeof(VkPhysicalDeviceMemoryProperties);break;
         case bor_vulkan_structs_VkStruct_VKDEVICEQUEUECREATEINFO_ID :  _size = sizeof(VkDeviceQueueCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKDEVICECREATEINFO_ID :  _size = sizeof(VkDeviceCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKEXTENSIONPROPERTIES_ID :  _size = sizeof(VkExtensionProperties);break;
         case bor_vulkan_structs_VkStruct_VKLAYERPROPERTIES_ID :  _size = sizeof(VkLayerProperties);break;
         case bor_vulkan_structs_VkStruct_VKSUBMITINFO_ID :  _size = sizeof(VkSubmitInfo);break;
         case bor_vulkan_structs_VkStruct_VKMEMORYALLOCATEINFO_ID :  _size = sizeof(VkMemoryAllocateInfo);break;
         case bor_vulkan_structs_VkStruct_VKMAPPEDMEMORYRANGE_ID :  _size = sizeof(VkMappedMemoryRange);break;
         case bor_vulkan_structs_VkStruct_VKMEMORYREQUIREMENTS_ID :  _size = sizeof(VkMemoryRequirements);break;
         case bor_vulkan_structs_VkStruct_VKSPARSEIMAGEFORMATPROPERTIES_ID :  _size = sizeof(VkSparseImageFormatProperties);break;
         case bor_vulkan_structs_VkStruct_VKSPARSEIMAGEMEMORYREQUIREMENTS_ID :  _size = sizeof(VkSparseImageMemoryRequirements);break;
         case bor_vulkan_structs_VkStruct_VKSPARSEMEMORYBIND_ID :  _size = sizeof(VkSparseMemoryBind);break;
         case bor_vulkan_structs_VkStruct_VKSPARSEBUFFERMEMORYBINDINFO_ID :  _size = sizeof(VkSparseBufferMemoryBindInfo);break;
         case bor_vulkan_structs_VkStruct_VKSPARSEIMAGEOPAQUEMEMORYBINDINFO_ID :  _size = sizeof(VkSparseImageOpaqueMemoryBindInfo);break;
         case bor_vulkan_structs_VkStruct_VKIMAGESUBRESOURCE_ID :  _size = sizeof(VkImageSubresource);break;
         case bor_vulkan_structs_VkStruct_VKOFFSET3D_ID :  _size = sizeof(VkOffset3D);break;
         case bor_vulkan_structs_VkStruct_VKSPARSEIMAGEMEMORYBIND_ID :  _size = sizeof(VkSparseImageMemoryBind);break;
         case bor_vulkan_structs_VkStruct_VKSPARSEIMAGEMEMORYBINDINFO_ID :  _size = sizeof(VkSparseImageMemoryBindInfo);break;
         case bor_vulkan_structs_VkStruct_VKBINDSPARSEINFO_ID :  _size = sizeof(VkBindSparseInfo);break;
         case bor_vulkan_structs_VkStruct_VKFENCECREATEINFO_ID :  _size = sizeof(VkFenceCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKSEMAPHORECREATEINFO_ID :  _size = sizeof(VkSemaphoreCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKEVENTCREATEINFO_ID :  _size = sizeof(VkEventCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKQUERYPOOLCREATEINFO_ID :  _size = sizeof(VkQueryPoolCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKBUFFERCREATEINFO_ID :  _size = sizeof(VkBufferCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKBUFFERVIEWCREATEINFO_ID :  _size = sizeof(VkBufferViewCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKIMAGECREATEINFO_ID :  _size = sizeof(VkImageCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKSUBRESOURCELAYOUT_ID :  _size = sizeof(VkSubresourceLayout);break;
         case bor_vulkan_structs_VkStruct_VKCOMPONENTMAPPING_ID :  _size = sizeof(VkComponentMapping);break;
         case bor_vulkan_structs_VkStruct_VKIMAGESUBRESOURCERANGE_ID :  _size = sizeof(VkImageSubresourceRange);break;
         case bor_vulkan_structs_VkStruct_VKIMAGEVIEWCREATEINFO_ID :  _size = sizeof(VkImageViewCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKSHADERMODULECREATEINFO_ID :  _size = sizeof(VkShaderModuleCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINECACHECREATEINFO_ID :  _size = sizeof(VkPipelineCacheCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKSPECIALIZATIONMAPENTRY_ID :  _size = sizeof(VkSpecializationMapEntry);break;
         case bor_vulkan_structs_VkStruct_VKSPECIALIZATIONINFO_ID :  _size = sizeof(VkSpecializationInfo);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINESHADERSTAGECREATEINFO_ID :  _size = sizeof(VkPipelineShaderStageCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKVERTEXINPUTBINDINGDESCRIPTION_ID :  _size = sizeof(VkVertexInputBindingDescription);break;
         case bor_vulkan_structs_VkStruct_VKVERTEXINPUTATTRIBUTEDESCRIPTION_ID :  _size = sizeof(VkVertexInputAttributeDescription);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINEVERTEXINPUTSTATECREATEINFO_ID :  _size = sizeof(VkPipelineVertexInputStateCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINEINPUTASSEMBLYSTATECREATEINFO_ID :  _size = sizeof(VkPipelineInputAssemblyStateCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINETESSELLATIONSTATECREATEINFO_ID :  _size = sizeof(VkPipelineTessellationStateCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKVIEWPORT_ID :  _size = sizeof(VkViewport);break;
         case bor_vulkan_structs_VkStruct_VKOFFSET2D_ID :  _size = sizeof(VkOffset2D);break;
         case bor_vulkan_structs_VkStruct_VKEXTENT2D_ID :  _size = sizeof(VkExtent2D);break;
         case bor_vulkan_structs_VkStruct_VKRECT2D_ID :  _size = sizeof(VkRect2D);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINEVIEWPORTSTATECREATEINFO_ID :  _size = sizeof(VkPipelineViewportStateCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINERASTERIZATIONSTATECREATEINFO_ID :  _size = sizeof(VkPipelineRasterizationStateCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINEMULTISAMPLESTATECREATEINFO_ID :  _size = sizeof(VkPipelineMultisampleStateCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKSTENCILOPSTATE_ID :  _size = sizeof(VkStencilOpState);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINEDEPTHSTENCILSTATECREATEINFO_ID :  _size = sizeof(VkPipelineDepthStencilStateCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINECOLORBLENDATTACHMENTSTATE_ID :  _size = sizeof(VkPipelineColorBlendAttachmentState);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINECOLORBLENDSTATECREATEINFO_ID :  _size = sizeof(VkPipelineColorBlendStateCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINEDYNAMICSTATECREATEINFO_ID :  _size = sizeof(VkPipelineDynamicStateCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKGRAPHICSPIPELINECREATEINFO_ID :  _size = sizeof(VkGraphicsPipelineCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKCOMPUTEPIPELINECREATEINFO_ID :  _size = sizeof(VkComputePipelineCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKPUSHCONSTANTRANGE_ID :  _size = sizeof(VkPushConstantRange);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINELAYOUTCREATEINFO_ID :  _size = sizeof(VkPipelineLayoutCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKSAMPLERCREATEINFO_ID :  _size = sizeof(VkSamplerCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKDESCRIPTORSETLAYOUTBINDING_ID :  _size = sizeof(VkDescriptorSetLayoutBinding);break;
         case bor_vulkan_structs_VkStruct_VKDESCRIPTORSETLAYOUTCREATEINFO_ID :  _size = sizeof(VkDescriptorSetLayoutCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKDESCRIPTORPOOLSIZE_ID :  _size = sizeof(VkDescriptorPoolSize);break;
         case bor_vulkan_structs_VkStruct_VKDESCRIPTORPOOLCREATEINFO_ID :  _size = sizeof(VkDescriptorPoolCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKDESCRIPTORSETALLOCATEINFO_ID :  _size = sizeof(VkDescriptorSetAllocateInfo);break;
         case bor_vulkan_structs_VkStruct_VKDESCRIPTORIMAGEINFO_ID :  _size = sizeof(VkDescriptorImageInfo);break;
         case bor_vulkan_structs_VkStruct_VKDESCRIPTORBUFFERINFO_ID :  _size = sizeof(VkDescriptorBufferInfo);break;
         case bor_vulkan_structs_VkStruct_VKWRITEDESCRIPTORSET_ID :  _size = sizeof(VkWriteDescriptorSet);break;
         case bor_vulkan_structs_VkStruct_VKCOPYDESCRIPTORSET_ID :  _size = sizeof(VkCopyDescriptorSet);break;
         case bor_vulkan_structs_VkStruct_VKFRAMEBUFFERCREATEINFO_ID :  _size = sizeof(VkFramebufferCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKATTACHMENTDESCRIPTION_ID :  _size = sizeof(VkAttachmentDescription);break;
         case bor_vulkan_structs_VkStruct_VKATTACHMENTREFERENCE_ID :  _size = sizeof(VkAttachmentReference);break;
         case bor_vulkan_structs_VkStruct_VKSUBPASSDESCRIPTION_ID :  _size = sizeof(VkSubpassDescription);break;
         case bor_vulkan_structs_VkStruct_VKSUBPASSDEPENDENCY_ID :  _size = sizeof(VkSubpassDependency);break;
         case bor_vulkan_structs_VkStruct_VKRENDERPASSCREATEINFO_ID :  _size = sizeof(VkRenderPassCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKCOMMANDPOOLCREATEINFO_ID :  _size = sizeof(VkCommandPoolCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKCOMMANDBUFFERALLOCATEINFO_ID :  _size = sizeof(VkCommandBufferAllocateInfo);break;
         case bor_vulkan_structs_VkStruct_VKCOMMANDBUFFERINHERITANCEINFO_ID :  _size = sizeof(VkCommandBufferInheritanceInfo);break;
         case bor_vulkan_structs_VkStruct_VKCOMMANDBUFFERBEGININFO_ID :  _size = sizeof(VkCommandBufferBeginInfo);break;
         case bor_vulkan_structs_VkStruct_VKBUFFERCOPY_ID :  _size = sizeof(VkBufferCopy);break;
         case bor_vulkan_structs_VkStruct_VKIMAGESUBRESOURCELAYERS_ID :  _size = sizeof(VkImageSubresourceLayers);break;
         case bor_vulkan_structs_VkStruct_VKIMAGECOPY_ID :  _size = sizeof(VkImageCopy);break;
         case bor_vulkan_structs_VkStruct_VKIMAGEBLIT_ID :  _size = sizeof(VkImageBlit);break;
         case bor_vulkan_structs_VkStruct_VKBUFFERIMAGECOPY_ID :  _size = sizeof(VkBufferImageCopy);break;
         case bor_vulkan_structs_VkStruct_VKCLEARDEPTHSTENCILVALUE_ID :  _size = sizeof(VkClearDepthStencilValue);break;
         case bor_vulkan_structs_VkStruct_VKCLEARATTACHMENT_ID :  _size = sizeof(VkClearAttachment);break;
         case bor_vulkan_structs_VkStruct_VKCLEARRECT_ID :  _size = sizeof(VkClearRect);break;
         case bor_vulkan_structs_VkStruct_VKIMAGERESOLVE_ID :  _size = sizeof(VkImageResolve);break;
         case bor_vulkan_structs_VkStruct_VKMEMORYBARRIER_ID :  _size = sizeof(VkMemoryBarrier);break;
         case bor_vulkan_structs_VkStruct_VKBUFFERMEMORYBARRIER_ID :  _size = sizeof(VkBufferMemoryBarrier);break;
         case bor_vulkan_structs_VkStruct_VKIMAGEMEMORYBARRIER_ID :  _size = sizeof(VkImageMemoryBarrier);break;
         case bor_vulkan_structs_VkStruct_VKRENDERPASSBEGININFO_ID :  _size = sizeof(VkRenderPassBeginInfo);break;
         case bor_vulkan_structs_VkStruct_VKDISPATCHINDIRECTCOMMAND_ID :  _size = sizeof(VkDispatchIndirectCommand);break;
         case bor_vulkan_structs_VkStruct_VKDRAWINDEXEDINDIRECTCOMMAND_ID :  _size = sizeof(VkDrawIndexedIndirectCommand);break;
         case bor_vulkan_structs_VkStruct_VKDRAWINDIRECTCOMMAND_ID :  _size = sizeof(VkDrawIndirectCommand);break;
         case bor_vulkan_structs_VkStruct_VKSURFACECAPABILITIESKHR_ID :  _size = sizeof(VkSurfaceCapabilitiesKHR);break;
         case bor_vulkan_structs_VkStruct_VKSURFACEFORMATKHR_ID :  _size = sizeof(VkSurfaceFormatKHR);break;
         case bor_vulkan_structs_VkStruct_VKSWAPCHAINCREATEINFOKHR_ID :  _size = sizeof(VkSwapchainCreateInfoKHR);break;
         case bor_vulkan_structs_VkStruct_VKPRESENTINFOKHR_ID :  _size = sizeof(VkPresentInfoKHR);break;
         case bor_vulkan_structs_VkStruct_VKDISPLAYPROPERTIESKHR_ID :  _size = sizeof(VkDisplayPropertiesKHR);break;
         case bor_vulkan_structs_VkStruct_VKDISPLAYMODEPARAMETERSKHR_ID :  _size = sizeof(VkDisplayModeParametersKHR);break;
         case bor_vulkan_structs_VkStruct_VKDISPLAYMODEPROPERTIESKHR_ID :  _size = sizeof(VkDisplayModePropertiesKHR);break;
         case bor_vulkan_structs_VkStruct_VKDISPLAYMODECREATEINFOKHR_ID :  _size = sizeof(VkDisplayModeCreateInfoKHR);break;
         case bor_vulkan_structs_VkStruct_VKDISPLAYPLANECAPABILITIESKHR_ID :  _size = sizeof(VkDisplayPlaneCapabilitiesKHR);break;
         case bor_vulkan_structs_VkStruct_VKDISPLAYPLANEPROPERTIESKHR_ID :  _size = sizeof(VkDisplayPlanePropertiesKHR);break;
         case bor_vulkan_structs_VkStruct_VKDISPLAYSURFACECREATEINFOKHR_ID :  _size = sizeof(VkDisplaySurfaceCreateInfoKHR);break;
         case bor_vulkan_structs_VkStruct_VKDISPLAYPRESENTINFOKHR_ID :  _size = sizeof(VkDisplayPresentInfoKHR);break;
       #ifdef VK_USE_PLATFORM_XLIB_KHR
         case bor_vulkan_structs_VkStruct_VKXLIBSURFACECREATEINFOKHR_ID :  _size = sizeof(VkXlibSurfaceCreateInfoKHR);break;
       #endif  
       #ifdef VK_USE_PLATFORM_XCB_KHR
         case bor_vulkan_structs_VkStruct_VKXCBSURFACECREATEINFOKHR_ID :  _size = sizeof(VkXcbSurfaceCreateInfoKHR);break;
       #endif  
       #ifdef VK_USE_PLATFORM_WAYLAND_KHR
         case bor_vulkan_structs_VkStruct_VKWAYLANDSURFACECREATEINFOKHR_ID :  _size = sizeof(VkWaylandSurfaceCreateInfoKHR);break;
       #endif  
       #ifdef VK_USE_PLATFORM_MIR_KHR
         case bor_vulkan_structs_VkStruct_VKMIRSURFACECREATEINFOKHR_ID :  _size = sizeof(VkMirSurfaceCreateInfoKHR);break;
       #endif 
       #ifdef VK_USE_PLATFORM_ANDROID_KHR 
         case bor_vulkan_structs_VkStruct_VKANDROIDSURFACECREATEINFOKHR_ID :  _size = sizeof(VkAndroidSurfaceCreateInfoKHR);break;
       #endif
       #ifdef VK_USE_PLATFORM_WIN32_KHR  
         case bor_vulkan_structs_VkStruct_VKWIN32SURFACECREATEINFOKHR_ID :  _size = sizeof(VkWin32SurfaceCreateInfoKHR);break;
       #endif  
         case bor_vulkan_structs_VkStruct_VKDEBUGREPORTCALLBACKCREATEINFOEXT_ID :  _size = sizeof(VkDebugReportCallbackCreateInfoEXT);break;
         default: _size = 0;break;
     }// switch
         
     return (jint)(_size);
         
    

}

