#include <bor.vulkan.VkObject.h>

//@line:16

      
    #if defined(_WIN32)
        #define VK_USE_PLATFORM_WIN32_KHR 1
        #define WIN32_LEAN_AND_MEAN 1
        #define VC_EXTRALEAN 1
    #elif defined(__ANDROID__) && defined(__ARM_EABI__) && !defined(__ARM_ARCH_7A__)
       #define VK_USE_PLATFORM_ANDROID_KHR 1
    #elif defined(__ANDROID__) && defined(__ARM_ARCH_7A__)
       #define VK_USE_PLATFORM_ANDROID_KHR 1
    #else
     #define VK_USE_PLATFORM_XLIB_KHR 1
    #endif    
      
    // include other platform here
      
 //     #define VK_USE_PLATFORM_WIN32_KHR 1
      #include <stdlib.h>
      #include <stdio.h>      
      #include <vulkan/vulkan.h>
     
     JNIEXPORT jobject JNICALL Java_bor_vulkan_VkObject_nativeBuffer(JNIEnv* env, jclass clazz, jint size) {


//@line:246

     void* buffer = malloc(size);
     jobject directBuffer = env->NewDirectByteBuffer(buffer, size);
     return directBuffer;
    

}

static inline jboolean wrapped_Java_bor_vulkan_VkObject_deleteBuffer
(JNIEnv* env, jclass clazz, jobject obj_ptr, char* ptr) {

//@line:257

       free(ptr);
       return JNI_TRUE;
    
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_VkObject_deleteBuffer(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	char* ptr = (char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_VkObject_deleteBuffer(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT jint JNICALL Java_bor_vulkan_VkObject_sizeOf(JNIEnv* env, jclass clazz, jint structID) {


//@line:267

     
     size_t _size = 0; 
     switch((int)(structID)){
         case bor_vulkan_VkObject_VKAPPLICATIONINFO_ID :  _size = sizeof(VkApplicationInfo);break;
         case bor_vulkan_VkObject_VKINSTANCECREATEINFO_ID :  _size = sizeof(VkInstanceCreateInfo);break;
         case bor_vulkan_VkObject_VKALLOCATIONCALLBACKS_ID :  _size = sizeof(VkAllocationCallbacks);break;
         case bor_vulkan_VkObject_VKPHYSICALDEVICEFEATURES_ID :  _size = sizeof(VkPhysicalDeviceFeatures);break;
         case bor_vulkan_VkObject_VKFORMATPROPERTIES_ID :  _size = sizeof(VkFormatProperties);break;
         case bor_vulkan_VkObject_VKEXTENT3D_ID :  _size = sizeof(VkExtent3D);break;
         case bor_vulkan_VkObject_VKIMAGEFORMATPROPERTIES_ID :  _size = sizeof(VkImageFormatProperties);break;
         case bor_vulkan_VkObject_VKPHYSICALDEVICELIMITS_ID :  _size = sizeof(VkPhysicalDeviceLimits);break;
         case bor_vulkan_VkObject_VKPHYSICALDEVICESPARSEPROPERTIES_ID :  _size = sizeof(VkPhysicalDeviceSparseProperties);break;
         case bor_vulkan_VkObject_VKPHYSICALDEVICEPROPERTIES_ID :  _size = sizeof(VkPhysicalDeviceProperties);break;
         case bor_vulkan_VkObject_VKQUEUEFAMILYPROPERTIES_ID :  _size = sizeof(VkQueueFamilyProperties);break;
         case bor_vulkan_VkObject_VKMEMORYTYPE_ID :  _size = sizeof(VkMemoryType);break;
         case bor_vulkan_VkObject_VKMEMORYHEAP_ID :  _size = sizeof(VkMemoryHeap);break;
         case bor_vulkan_VkObject_VKPHYSICALDEVICEMEMORYPROPERTIES_ID :  _size = sizeof(VkPhysicalDeviceMemoryProperties);break;
         case bor_vulkan_VkObject_VKDEVICEQUEUECREATEINFO_ID :  _size = sizeof(VkDeviceQueueCreateInfo);break;
         case bor_vulkan_VkObject_VKDEVICECREATEINFO_ID :  _size = sizeof(VkDeviceCreateInfo);break;
         case bor_vulkan_VkObject_VKEXTENSIONPROPERTIES_ID :  _size = sizeof(VkExtensionProperties);break;
         case bor_vulkan_VkObject_VKLAYERPROPERTIES_ID :  _size = sizeof(VkLayerProperties);break;
         case bor_vulkan_VkObject_VKSUBMITINFO_ID :  _size = sizeof(VkSubmitInfo);break;
         case bor_vulkan_VkObject_VKMEMORYALLOCATEINFO_ID :  _size = sizeof(VkMemoryAllocateInfo);break;
         case bor_vulkan_VkObject_VKMAPPEDMEMORYRANGE_ID :  _size = sizeof(VkMappedMemoryRange);break;
         case bor_vulkan_VkObject_VKMEMORYREQUIREMENTS_ID :  _size = sizeof(VkMemoryRequirements);break;
         case bor_vulkan_VkObject_VKSPARSEIMAGEFORMATPROPERTIES_ID :  _size = sizeof(VkSparseImageFormatProperties);break;
         case bor_vulkan_VkObject_VKSPARSEIMAGEMEMORYREQUIREMENTS_ID :  _size = sizeof(VkSparseImageMemoryRequirements);break;
         case bor_vulkan_VkObject_VKSPARSEMEMORYBIND_ID :  _size = sizeof(VkSparseMemoryBind);break;
         case bor_vulkan_VkObject_VKSPARSEBUFFERMEMORYBINDINFO_ID :  _size = sizeof(VkSparseBufferMemoryBindInfo);break;
         case bor_vulkan_VkObject_VKSPARSEIMAGEOPAQUEMEMORYBINDINFO_ID :  _size = sizeof(VkSparseImageOpaqueMemoryBindInfo);break;
         case bor_vulkan_VkObject_VKIMAGESUBRESOURCE_ID :  _size = sizeof(VkImageSubresource);break;
         case bor_vulkan_VkObject_VKOFFSET3D_ID :  _size = sizeof(VkOffset3D);break;
         case bor_vulkan_VkObject_VKSPARSEIMAGEMEMORYBIND_ID :  _size = sizeof(VkSparseImageMemoryBind);break;
         case bor_vulkan_VkObject_VKSPARSEIMAGEMEMORYBINDINFO_ID :  _size = sizeof(VkSparseImageMemoryBindInfo);break;
         case bor_vulkan_VkObject_VKBINDSPARSEINFO_ID :  _size = sizeof(VkBindSparseInfo);break;
         case bor_vulkan_VkObject_VKFENCECREATEINFO_ID :  _size = sizeof(VkFenceCreateInfo);break;
         case bor_vulkan_VkObject_VKSEMAPHORECREATEINFO_ID :  _size = sizeof(VkSemaphoreCreateInfo);break;
         case bor_vulkan_VkObject_VKEVENTCREATEINFO_ID :  _size = sizeof(VkEventCreateInfo);break;
         case bor_vulkan_VkObject_VKQUERYPOOLCREATEINFO_ID :  _size = sizeof(VkQueryPoolCreateInfo);break;
         case bor_vulkan_VkObject_VKBUFFERCREATEINFO_ID :  _size = sizeof(VkBufferCreateInfo);break;
         case bor_vulkan_VkObject_VKBUFFERVIEWCREATEINFO_ID :  _size = sizeof(VkBufferViewCreateInfo);break;
         case bor_vulkan_VkObject_VKIMAGECREATEINFO_ID :  _size = sizeof(VkImageCreateInfo);break;
         case bor_vulkan_VkObject_VKSUBRESOURCELAYOUT_ID :  _size = sizeof(VkSubresourceLayout);break;
         case bor_vulkan_VkObject_VKCOMPONENTMAPPING_ID :  _size = sizeof(VkComponentMapping);break;
         case bor_vulkan_VkObject_VKIMAGESUBRESOURCERANGE_ID :  _size = sizeof(VkImageSubresourceRange);break;
         case bor_vulkan_VkObject_VKIMAGEVIEWCREATEINFO_ID :  _size = sizeof(VkImageViewCreateInfo);break;
         case bor_vulkan_VkObject_VKSHADERMODULECREATEINFO_ID :  _size = sizeof(VkShaderModuleCreateInfo);break;
         case bor_vulkan_VkObject_VKPIPELINECACHECREATEINFO_ID :  _size = sizeof(VkPipelineCacheCreateInfo);break;
         case bor_vulkan_VkObject_VKSPECIALIZATIONMAPENTRY_ID :  _size = sizeof(VkSpecializationMapEntry);break;
         case bor_vulkan_VkObject_VKSPECIALIZATIONINFO_ID :  _size = sizeof(VkSpecializationInfo);break;
         case bor_vulkan_VkObject_VKPIPELINESHADERSTAGECREATEINFO_ID :  _size = sizeof(VkPipelineShaderStageCreateInfo);break;
         case bor_vulkan_VkObject_VKVERTEXINPUTBINDINGDESCRIPTION_ID :  _size = sizeof(VkVertexInputBindingDescription);break;
         case bor_vulkan_VkObject_VKVERTEXINPUTATTRIBUTEDESCRIPTION_ID :  _size = sizeof(VkVertexInputAttributeDescription);break;
         case bor_vulkan_VkObject_VKPIPELINEVERTEXINPUTSTATECREATEINFO_ID :  _size = sizeof(VkPipelineVertexInputStateCreateInfo);break;
         case bor_vulkan_VkObject_VKPIPELINEINPUTASSEMBLYSTATECREATEINFO_ID :  _size = sizeof(VkPipelineInputAssemblyStateCreateInfo);break;
         case bor_vulkan_VkObject_VKPIPELINETESSELLATIONSTATECREATEINFO_ID :  _size = sizeof(VkPipelineTessellationStateCreateInfo);break;
         case bor_vulkan_VkObject_VKVIEWPORT_ID :  _size = sizeof(VkViewport);break;
         case bor_vulkan_VkObject_VKOFFSET2D_ID :  _size = sizeof(VkOffset2D);break;
         case bor_vulkan_VkObject_VKEXTENT2D_ID :  _size = sizeof(VkExtent2D);break;
         case bor_vulkan_VkObject_VKRECT2D_ID :  _size = sizeof(VkRect2D);break;
         case bor_vulkan_VkObject_VKPIPELINEVIEWPORTSTATECREATEINFO_ID :  _size = sizeof(VkPipelineViewportStateCreateInfo);break;
         case bor_vulkan_VkObject_VKPIPELINERASTERIZATIONSTATECREATEINFO_ID :  _size = sizeof(VkPipelineRasterizationStateCreateInfo);break;
         case bor_vulkan_VkObject_VKPIPELINEMULTISAMPLESTATECREATEINFO_ID :  _size = sizeof(VkPipelineMultisampleStateCreateInfo);break;
         case bor_vulkan_VkObject_VKSTENCILOPSTATE_ID :  _size = sizeof(VkStencilOpState);break;
         case bor_vulkan_VkObject_VKPIPELINEDEPTHSTENCILSTATECREATEINFO_ID :  _size = sizeof(VkPipelineDepthStencilStateCreateInfo);break;
         case bor_vulkan_VkObject_VKPIPELINECOLORBLENDATTACHMENTSTATE_ID :  _size = sizeof(VkPipelineColorBlendAttachmentState);break;
         case bor_vulkan_VkObject_VKPIPELINECOLORBLENDSTATECREATEINFO_ID :  _size = sizeof(VkPipelineColorBlendStateCreateInfo);break;
         case bor_vulkan_VkObject_VKPIPELINEDYNAMICSTATECREATEINFO_ID :  _size = sizeof(VkPipelineDynamicStateCreateInfo);break;
         case bor_vulkan_VkObject_VKGRAPHICSPIPELINECREATEINFO_ID :  _size = sizeof(VkGraphicsPipelineCreateInfo);break;
         case bor_vulkan_VkObject_VKCOMPUTEPIPELINECREATEINFO_ID :  _size = sizeof(VkComputePipelineCreateInfo);break;
         case bor_vulkan_VkObject_VKPUSHCONSTANTRANGE_ID :  _size = sizeof(VkPushConstantRange);break;
         case bor_vulkan_VkObject_VKPIPELINELAYOUTCREATEINFO_ID :  _size = sizeof(VkPipelineLayoutCreateInfo);break;
         case bor_vulkan_VkObject_VKSAMPLERCREATEINFO_ID :  _size = sizeof(VkSamplerCreateInfo);break;
         case bor_vulkan_VkObject_VKDESCRIPTORSETLAYOUTBINDING_ID :  _size = sizeof(VkDescriptorSetLayoutBinding);break;
         case bor_vulkan_VkObject_VKDESCRIPTORSETLAYOUTCREATEINFO_ID :  _size = sizeof(VkDescriptorSetLayoutCreateInfo);break;
         case bor_vulkan_VkObject_VKDESCRIPTORPOOLSIZE_ID :  _size = sizeof(VkDescriptorPoolSize);break;
         case bor_vulkan_VkObject_VKDESCRIPTORPOOLCREATEINFO_ID :  _size = sizeof(VkDescriptorPoolCreateInfo);break;
         case bor_vulkan_VkObject_VKDESCRIPTORSETALLOCATEINFO_ID :  _size = sizeof(VkDescriptorSetAllocateInfo);break;
         case bor_vulkan_VkObject_VKDESCRIPTORIMAGEINFO_ID :  _size = sizeof(VkDescriptorImageInfo);break;
         case bor_vulkan_VkObject_VKDESCRIPTORBUFFERINFO_ID :  _size = sizeof(VkDescriptorBufferInfo);break;
         case bor_vulkan_VkObject_VKWRITEDESCRIPTORSET_ID :  _size = sizeof(VkWriteDescriptorSet);break;
         case bor_vulkan_VkObject_VKCOPYDESCRIPTORSET_ID :  _size = sizeof(VkCopyDescriptorSet);break;
         case bor_vulkan_VkObject_VKFRAMEBUFFERCREATEINFO_ID :  _size = sizeof(VkFramebufferCreateInfo);break;
         case bor_vulkan_VkObject_VKATTACHMENTDESCRIPTION_ID :  _size = sizeof(VkAttachmentDescription);break;
         case bor_vulkan_VkObject_VKATTACHMENTREFERENCE_ID :  _size = sizeof(VkAttachmentReference);break;
         case bor_vulkan_VkObject_VKSUBPASSDESCRIPTION_ID :  _size = sizeof(VkSubpassDescription);break;
         case bor_vulkan_VkObject_VKSUBPASSDEPENDENCY_ID :  _size = sizeof(VkSubpassDependency);break;
         case bor_vulkan_VkObject_VKRENDERPASSCREATEINFO_ID :  _size = sizeof(VkRenderPassCreateInfo);break;
         case bor_vulkan_VkObject_VKCOMMANDPOOLCREATEINFO_ID :  _size = sizeof(VkCommandPoolCreateInfo);break;
         case bor_vulkan_VkObject_VKCOMMANDBUFFERALLOCATEINFO_ID :  _size = sizeof(VkCommandBufferAllocateInfo);break;
         case bor_vulkan_VkObject_VKCOMMANDBUFFERINHERITANCEINFO_ID :  _size = sizeof(VkCommandBufferInheritanceInfo);break;
         case bor_vulkan_VkObject_VKCOMMANDBUFFERBEGININFO_ID :  _size = sizeof(VkCommandBufferBeginInfo);break;
         case bor_vulkan_VkObject_VKBUFFERCOPY_ID :  _size = sizeof(VkBufferCopy);break;
         case bor_vulkan_VkObject_VKIMAGESUBRESOURCELAYERS_ID :  _size = sizeof(VkImageSubresourceLayers);break;
         case bor_vulkan_VkObject_VKIMAGECOPY_ID :  _size = sizeof(VkImageCopy);break;
         case bor_vulkan_VkObject_VKIMAGEBLIT_ID :  _size = sizeof(VkImageBlit);break;
         case bor_vulkan_VkObject_VKBUFFERIMAGECOPY_ID :  _size = sizeof(VkBufferImageCopy);break;
         case bor_vulkan_VkObject_VKCLEARDEPTHSTENCILVALUE_ID :  _size = sizeof(VkClearDepthStencilValue);break;
         case bor_vulkan_VkObject_VKCLEARATTACHMENT_ID :  _size = sizeof(VkClearAttachment);break;
         case bor_vulkan_VkObject_VKCLEARRECT_ID :  _size = sizeof(VkClearRect);break;
         case bor_vulkan_VkObject_VKIMAGERESOLVE_ID :  _size = sizeof(VkImageResolve);break;
         case bor_vulkan_VkObject_VKMEMORYBARRIER_ID :  _size = sizeof(VkMemoryBarrier);break;
         case bor_vulkan_VkObject_VKBUFFERMEMORYBARRIER_ID :  _size = sizeof(VkBufferMemoryBarrier);break;
         case bor_vulkan_VkObject_VKIMAGEMEMORYBARRIER_ID :  _size = sizeof(VkImageMemoryBarrier);break;
         case bor_vulkan_VkObject_VKRENDERPASSBEGININFO_ID :  _size = sizeof(VkRenderPassBeginInfo);break;
         case bor_vulkan_VkObject_VKDISPATCHINDIRECTCOMMAND_ID :  _size = sizeof(VkDispatchIndirectCommand);break;
         case bor_vulkan_VkObject_VKDRAWINDEXEDINDIRECTCOMMAND_ID :  _size = sizeof(VkDrawIndexedIndirectCommand);break;
         case bor_vulkan_VkObject_VKDRAWINDIRECTCOMMAND_ID :  _size = sizeof(VkDrawIndirectCommand);break;
         case bor_vulkan_VkObject_VKSURFACECAPABILITIESKHR_ID :  _size = sizeof(VkSurfaceCapabilitiesKHR);break;
         case bor_vulkan_VkObject_VKSURFACEFORMATKHR_ID :  _size = sizeof(VkSurfaceFormatKHR);break;
         case bor_vulkan_VkObject_VKSWAPCHAINCREATEINFOKHR_ID :  _size = sizeof(VkSwapchainCreateInfoKHR);break;
         case bor_vulkan_VkObject_VKPRESENTINFOKHR_ID :  _size = sizeof(VkPresentInfoKHR);break;
         case bor_vulkan_VkObject_VKDISPLAYPROPERTIESKHR_ID :  _size = sizeof(VkDisplayPropertiesKHR);break;
         case bor_vulkan_VkObject_VKDISPLAYMODEPARAMETERSKHR_ID :  _size = sizeof(VkDisplayModeParametersKHR);break;
         case bor_vulkan_VkObject_VKDISPLAYMODEPROPERTIESKHR_ID :  _size = sizeof(VkDisplayModePropertiesKHR);break;
         case bor_vulkan_VkObject_VKDISPLAYMODECREATEINFOKHR_ID :  _size = sizeof(VkDisplayModeCreateInfoKHR);break;
         case bor_vulkan_VkObject_VKDISPLAYPLANECAPABILITIESKHR_ID :  _size = sizeof(VkDisplayPlaneCapabilitiesKHR);break;
         case bor_vulkan_VkObject_VKDISPLAYPLANEPROPERTIESKHR_ID :  _size = sizeof(VkDisplayPlanePropertiesKHR);break;
         case bor_vulkan_VkObject_VKDISPLAYSURFACECREATEINFOKHR_ID :  _size = sizeof(VkDisplaySurfaceCreateInfoKHR);break;
         case bor_vulkan_VkObject_VKDISPLAYPRESENTINFOKHR_ID :  _size = sizeof(VkDisplayPresentInfoKHR);break;
       #ifdef VK_USE_PLATFORM_XLIB_KHR
         case bor_vulkan_VkObject_VKXLIBSURFACECREATEINFOKHR_ID :  _size = sizeof(VkXlibSurfaceCreateInfoKHR);break;
       #endif  
       #ifdef VK_USE_PLATFORM_XCB_KHR
         case bor_vulkan_VkObject_VKXCBSURFACECREATEINFOKHR_ID :  _size = sizeof(VkXcbSurfaceCreateInfoKHR);break;
       #endif  
       #ifdef VK_USE_PLATFORM_WAYLAND_KHR
         case bor_vulkan_VkObject_VKWAYLANDSURFACECREATEINFOKHR_ID :  _size = sizeof(VkWaylandSurfaceCreateInfoKHR);break;
       #endif  
       #ifdef VK_USE_PLATFORM_MIR_KHR
         case bor_vulkan_VkObject_VKMIRSURFACECREATEINFOKHR_ID :  _size = sizeof(VkMirSurfaceCreateInfoKHR);break;
       #endif 
       #ifdef VK_USE_PLATFORM_ANDROID_KHR 
         case bor_vulkan_VkObject_VKANDROIDSURFACECREATEINFOKHR_ID :  _size = sizeof(VkAndroidSurfaceCreateInfoKHR);break;
       #endif
       #ifdef VK_USE_PLATFORM_WIN32_KHR  
         case bor_vulkan_VkObject_VKWIN32SURFACECREATEINFOKHR_ID :  _size = sizeof(VkWin32SurfaceCreateInfoKHR);break;
       #endif  
         case bor_vulkan_VkObject_VKDEBUGREPORTCALLBACKCREATEINFOEXT_ID :  _size = sizeof(VkDebugReportCallbackCreateInfoEXT);break;
         default: _size = 0;break;
     }// switch
         
     return (jint)(_size);
         
    

}

