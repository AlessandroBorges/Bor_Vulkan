 package bor.vulkan;

 import java.nio.ByteBuffer;

import bor.util.BigBuffer;
import bor.vulkan.enumerations.VkDebugReportObjectTypeEXT;
import bor.vulkan.enumerations.VkFilter;
import bor.vulkan.enumerations.VkFormat;
import bor.vulkan.enumerations.VkImageLayout;
import bor.vulkan.enumerations.VkImageTiling;
import bor.vulkan.enumerations.VkImageType;
import bor.vulkan.enumerations.VkIndexType;
import bor.vulkan.enumerations.VkPipelineBindPoint;
import bor.vulkan.enumerations.VkPipelineStageFlagBits;
import bor.vulkan.enumerations.VkPresentModeKHR;
import bor.vulkan.enumerations.VkResult;
import bor.vulkan.enumerations.VkSampleCountFlagBits;
import bor.vulkan.enumerations.VkSubpassContents;
import bor.vulkan.structs.VkAllocationCallbacks;
import bor.vulkan.structs.VkAndroidSurfaceCreateInfoKHR;
import bor.vulkan.structs.VkBindSparseInfo;
import bor.vulkan.structs.VkBufferCopy;
import bor.vulkan.structs.VkBufferCreateInfo;
import bor.vulkan.structs.VkBufferImageCopy;
import bor.vulkan.structs.VkBufferMemoryBarrier;
import bor.vulkan.structs.VkBufferViewCreateInfo;
import bor.vulkan.structs.VkClearAttachment;
import bor.vulkan.structs.VkClearColorValue;
import bor.vulkan.structs.VkClearDepthStencilValue;
import bor.vulkan.structs.VkClearRect;
import bor.vulkan.structs.VkCommandBufferAllocateInfo;
import bor.vulkan.structs.VkCommandBufferBeginInfo;
import bor.vulkan.structs.VkCommandPoolCreateInfo;
import bor.vulkan.structs.VkComputePipelineCreateInfo;
import bor.vulkan.structs.VkCopyDescriptorSet;
import bor.vulkan.structs.VkDebugMarkerMarkerInfoEXT;
import bor.vulkan.structs.VkDebugMarkerObjectNameInfoEXT;
import bor.vulkan.structs.VkDebugMarkerObjectTagInfoEXT;
import bor.vulkan.structs.VkDebugReportCallbackCreateInfoEXT;
import bor.vulkan.structs.VkDescriptorPoolCreateInfo;
import bor.vulkan.structs.VkDescriptorSetAllocateInfo;
import bor.vulkan.structs.VkDescriptorSetLayoutCreateInfo;
import bor.vulkan.structs.VkDeviceCreateInfo;
import bor.vulkan.structs.VkDisplayModeCreateInfoKHR;
import bor.vulkan.structs.VkDisplayModePropertiesKHR;
import bor.vulkan.structs.VkDisplayPlaneCapabilitiesKHR;
import bor.vulkan.structs.VkDisplayPlanePropertiesKHR;
import bor.vulkan.structs.VkDisplayPropertiesKHR;
import bor.vulkan.structs.VkDisplaySurfaceCreateInfoKHR;
import bor.vulkan.structs.VkEventCreateInfo;
import bor.vulkan.structs.VkExtensionProperties;
import bor.vulkan.structs.VkExtent2D;
import bor.vulkan.structs.VkFenceCreateInfo;
import bor.vulkan.structs.VkFormatProperties;
import bor.vulkan.structs.VkFramebufferCreateInfo;
import bor.vulkan.structs.VkGraphicsPipelineCreateInfo;
import bor.vulkan.structs.VkImageBlit;
import bor.vulkan.structs.VkImageCopy;
import bor.vulkan.structs.VkImageCreateInfo;
import bor.vulkan.structs.VkImageFormatProperties;
import bor.vulkan.structs.VkImageMemoryBarrier;
import bor.vulkan.structs.VkImageResolve;
import bor.vulkan.structs.VkImageSubresource;
import bor.vulkan.structs.VkImageSubresourceRange;
import bor.vulkan.structs.VkImageViewCreateInfo;
import bor.vulkan.structs.VkInstanceCreateInfo;
import bor.vulkan.structs.VkLayerProperties;
import bor.vulkan.structs.VkMappedMemoryRange;
import bor.vulkan.structs.VkMemoryAllocateInfo;
import bor.vulkan.structs.VkMemoryBarrier;
import bor.vulkan.structs.VkMemoryRequirements;
import bor.vulkan.structs.VkMirSurfaceCreateInfoKHR;
import bor.vulkan.structs.VkPhysicalDeviceFeatures;
import bor.vulkan.structs.VkPhysicalDeviceMemoryProperties;
import bor.vulkan.structs.VkPhysicalDeviceProperties;
import bor.vulkan.structs.VkPipelineCacheCreateInfo;
import bor.vulkan.structs.VkPipelineLayoutCreateInfo;
import bor.vulkan.structs.VkPresentInfoKHR;
import bor.vulkan.structs.VkQueryPoolCreateInfo;
import bor.vulkan.structs.VkQueueFamilyProperties;
import bor.vulkan.structs.VkRect2D;
import bor.vulkan.structs.VkRenderPassBeginInfo;
import bor.vulkan.structs.VkRenderPassCreateInfo;
import bor.vulkan.structs.VkSamplerCreateInfo;
import bor.vulkan.structs.VkSemaphoreCreateInfo;
import bor.vulkan.structs.VkShaderModuleCreateInfo;
import bor.vulkan.structs.VkSparseImageFormatProperties;
import bor.vulkan.structs.VkSparseImageMemoryRequirements;
import bor.vulkan.structs.VkSubmitInfo;
import bor.vulkan.structs.VkSubresourceLayout;
import bor.vulkan.structs.VkSurfaceCapabilitiesKHR;
import bor.vulkan.structs.VkSurfaceFormatKHR;
import bor.vulkan.structs.VkSwapchainCreateInfoKHR;
import bor.vulkan.structs.VkViewport;
import bor.vulkan.structs.VkWaylandSurfaceCreateInfoKHR;
import bor.vulkan.structs.VkWin32SurfaceCreateInfoKHR;
import bor.vulkan.structs.VkWriteDescriptorSet;
import bor.vulkan.structs.VkXcbSurfaceCreateInfoKHR;
import bor.vulkan.structs.VkXlibSurfaceCreateInfoKHR;

 public class Vk10 extends Vulkan
 {
     /** Includes **/
    //@off
    /*JNI
     
      
 #if defined(_WIN32)
        #define VK_USE_PLATFORM_WIN32_KHR 1
        #define WIN32_LEAN_AND_MEAN 1
        #define VC_EXTRALEAN 1
 #elif defined(__ANDROID__) 
       #define VK_USE_PLATFORM_ANDROID_KHR 1
 #else      
       #define VK_USE_PLATFORM_XCB_KHR 1
       #define VK_USE_PLATFORM_XLIB_KHR 1
 #endif   
  
      #define VULKAN_WRAPPER_ENABLE_ALL_EXTENSIONS_DEFAULT 1
      #include "BorVulkan.hpp"
      #include "vulkan_wrapper.h" 
           
      #include <stdio.h>
      #include <stdlib.h>
      
      using namespace std;
      
      typedef void* PointerToAnything;
      typedef PointerToAnything* PointerToAnythingArray;
      
      static  jclass byteBufferClass;      
      static  bool isWin32;
      static  bool isAndroid;
      static  bool isMIR;
      static  bool isWayland;
      static  bool isXCB;
      static  bool isXLIB;
      static  bool isVulkanAvailable;
  
    static void init(){
         // platforms support 
        isWin32 = false;
        isAndroid = false;
        isMIR = false;
        isWayland = false;
        isXCB = false;
        isXLIB = false;
   
   #ifdef VK_USE_PLATFORM_ANDROID_KHR
         isAndroid = true;
   #endif
   
    #ifdef VK_USE_PLATFORM_WIN32_KHR    
        isWin32 = true;
   #endif 

   #ifdef VK_USE_PLATFORM_MIR_KHR        
        isMIR = true;
   #endif
   
   #ifdef VK_USE_PLATFORM_WAYLAND_KHR       
       isWayland = true;
   #endif
        
   #ifdef VK_USE_PLATFORM_XCB_KHR        
        isXCB = true;
   #endif   
        
   #ifdef VK_USE_PLATFORM_XLIB_KHR          
    isXLIB = true;
   #endif    
      
 }//
 
  
#define BUFFERARRAY_SET(TYPE, BUFFERS, COUNT, P_VK)\
     TYPE* P_VK = (TYPE*) calloc(COUNT,sizeof(TYPE));\
     for(int i = 0; i < (int) COUNT; i++){\
       jobject obj = (BUFFERS) ? (jobject) env->GetObjectArrayElement(BUFFERS, i) : NULL;\
       if(obj != NULL){\
          TYPE* elem = (TYPE*)(env->GetDirectBufferAddress(obj));\
          P_VK[i] = (*elem);\
       }\
     }\
 
 #define BUFFERARRAY_COMMIT(TYPE, BUFFERS, COUNT, P_VK) \
  for(int i = 0; i < (int) COUNT; i++){\
           TYPE* obj = (TYPE*)calloc(1, sizeof(TYPE));\
           *obj = P_VK[i];\
           jobject bb_ = (jobject)(env->NewDirectByteBuffer(obj, sizeof(TYPE)));\
           env->SetObjectArrayElement(BUFFERS, i, bb_);\
      }\
  if (P_VK != NULL) free(P_VK);\
 
 // Vk10 header end
  */
    /**
     * <pre>
     * Default size in bytes of Dispatchable VkHandle.
     * It can be 4bytes in 32bits OS or 8bytes in 64bits OS. 
     * Current Dispatchable VkHandles are the following: 
     *   VK_DEFINE_HANDLE(VkInstance)
     *   VK_DEFINE_HANDLE(VkPhysicalDevice)
     *   VK_DEFINE_HANDLE(VkDevice)
     *   VK_DEFINE_HANDLE(VkQueue)
     *   VK_DEFINE_HANDLE(VkCommandBuffer)
     * </pre>
     */
    protected static int SIZE_OF_DISPATCHABLE_HANDLE = 8;
    /**
     * Default size in bytes of Non Dispatchable VkHandle.
     * Expected to be always 8 bytes in both 32/64bits environments.
     */
    protected static int SIZE_OF_NON__DISPATCHABLE_HANDLE = 8;
    
    /**
     * Vulkan Supported Plaforms
     * TODO - move to Vulkan.Java
     * @author Alessandro Borges
     *
     */
    public enum PLATFORMS{
        WIN32,
        ANDROID,
        XLIB,
        XCB,
        WAYLAND,
        MIR
    }
    
    static{
        init();        
        SIZE_OF_DISPATCHABLE_HANDLE = sizeOfDispatchableHandle();
        SIZE_OF_NON__DISPATCHABLE_HANDLE = sizeOfNonDispatchableHandle();
    }
    
    
    /**
     * Private Constructor
     */
    private Vk10(){}
    
    /**
     * initilize native codes
     */
    private static native void init();/*
       jclass bufferClassLocal = env->FindClass("java/nio/ByteBuffer");
       byteBufferClass = reinterpret_cast<jclass>(env->NewGlobalRef(bufferClassLocal));
       
       init();
       isVulkanAvailable =  (InitVulkan() != 0);
       
    */
    
    /**
     * <pre>
     * Get size of Dispatchable VkHandle;
     *   VK_DEFINE_HANDLE(VkInstance)
     *   VK_DEFINE_HANDLE(VkPhysicalDevice)
     *   VK_DEFINE_HANDLE(VkDevice)
     *   VK_DEFINE_HANDLE(VkQueue)
     *   VK_DEFINE_HANDLE(VkCommandBuffer)
     *  
     * </pre>
     * @return size in bytes of native Dispatchable VkHandle.
     */
    public static native int sizeOfDispatchableHandle();/*
        return(jint) sizeof(VkInstance);
    */
    
    /**
     * Get size of Non Dispatchable Handle.
     * @return size in bytes of native pointer
     */
    public  static native int sizeOfNonDispatchableHandle();/*
        return(jint) sizeof(VkSemaphore);
    */
    
    /**
     * @TODO implement it wisely.
     * @return
     */
    public static native boolean  isVulkanAvailable();/*
       return (jboolean) isVulkanAvailable;
    
    */
    

     
     
     
   /**
    *  Vulkan procedure ID: 1
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateInstance(
    *     const VkInstanceCreateInfo*                 pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkInstance*                                 pInstance);
    * </pre>
    * 
    * @param pCreateInfo - Vulkan Struct of type  final VkInstanceCreateInfo 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pInstance - An array of  VkInstance . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateInstance(
		final VkInstanceCreateInfo pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkInstance[] pInstance) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkInstance> pInstanceBuffer =
			 new BigBuffer<VkInstance>(pInstance, true);
	 int  _val = vkCreateInstance0(
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pInstanceBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pInstanceBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #1
    *  vkCreateInstance 
    * 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pInstance - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateInstance0(
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pInstance);/* 
	VkResult res = vkCreateInstance(
			(const VkInstanceCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkInstance*) pInstance);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 2
    * <h2>Prototype</h2><pre>
    *  void  vkDestroyInstance(
    *     VkInstance                                  instance,
    *     const VkAllocationCallbacks*                pAllocator);
    * </pre>
    * 
    * @param instance - Vulkan handle of type VkInstance 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    */
   public static void vkDestroyInstance(
		VkInstance instance,
		final VkAllocationCallbacks pAllocator) {

	 vkDestroyInstance0(
		instance.getNativeHandle() /* VkHandle */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */  );

   } 

   /**
    *  Native interface for Vulkan method #2
    *  vkDestroyInstance 
    * 
    * @param instance - 
    * @param pAllocator - 
    */
    private static native void vkDestroyInstance0(
		long   instance,
		ByteBuffer   pAllocator);/* 
	vkDestroyInstance(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(const VkAllocationCallbacks*) pAllocator);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 3
    * <h2>Prototype</h2><pre>
    *  VkResult  vkEnumeratePhysicalDevices(
    *     VkInstance                                  instance,
    *     uint32_t*                                   pPhysicalDeviceCount,
    *     VkPhysicalDevice*                           pPhysicalDevices);
    * </pre>
    * 
    * @param instance - Vulkan handle of type VkInstance 
    * @param pPhysicalDeviceCount - The length of array pPhysicalDevices. 
    * @param pPhysicalDevices - An array of  VkPhysicalDevice . 
    * 
    * @return VkResult
    */
   public static VkResult vkEnumeratePhysicalDevices(
		VkInstance instance,
		int[] pPhysicalDeviceCount,
		VkPhysicalDevice[] pPhysicalDevices) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkPhysicalDevice> pPhysicalDevicesBuffer =
			 new BigBuffer<VkPhysicalDevice>(pPhysicalDevices, true);
	 int  _val = vkEnumeratePhysicalDevices0(
			instance.getNativeHandle() /* VkHandle */ ,
			pPhysicalDeviceCount ,
			pPhysicalDevicesBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pPhysicalDevicesBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #3
    *  vkEnumeratePhysicalDevices 
    * 
    * @param instance - 
    * @param pPhysicalDeviceCount - 
    * @param pPhysicalDevices - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkEnumeratePhysicalDevices0(
		long   instance,
		int[]  pPhysicalDeviceCount,
		ByteBuffer   pPhysicalDevices);/* 
	VkResult res = vkEnumeratePhysicalDevices(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(uint32_t*) pPhysicalDeviceCount,
			(VkPhysicalDevice*) pPhysicalDevices);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 4
    * <h2>Prototype</h2><pre>
    *  void  vkGetPhysicalDeviceFeatures(
    *     VkPhysicalDevice                            physicalDevice,
    *     VkPhysicalDeviceFeatures*                   pFeatures);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param pFeatures - Vulkan Struct of type  VkPhysicalDeviceFeatures  
    */
   public static void vkGetPhysicalDeviceFeatures(
		VkPhysicalDevice physicalDevice,
		VkPhysicalDeviceFeatures pFeatures) {

	 vkGetPhysicalDeviceFeatures0(
		physicalDevice.getNativeHandle() /* VkHandle */ ,
		pFeatures.getPointer() /* Struct */ );

   } 

   /**
    *  Native interface for Vulkan method #4
    *  vkGetPhysicalDeviceFeatures 
    * 
    * @param physicalDevice - 
    * @param pFeatures - 
    */
    private static native void vkGetPhysicalDeviceFeatures0(
		long   physicalDevice,
		ByteBuffer   pFeatures);/* 
	vkGetPhysicalDeviceFeatures(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(VkPhysicalDeviceFeatures*) pFeatures);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 5
    * <h2>Prototype</h2><pre>
    *  void  vkGetPhysicalDeviceFormatProperties(
    *     VkPhysicalDevice                            physicalDevice,
    *     VkFormat                                    format,
    *     VkFormatProperties*                         pFormatProperties);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param format - Vulkan enumeration of type VkFormat 
    * @param pFormatProperties - Vulkan Struct of type  VkFormatProperties  
    */
   public static void vkGetPhysicalDeviceFormatProperties(
		VkPhysicalDevice physicalDevice,
		VkFormat format,
		VkFormatProperties pFormatProperties) {

	 vkGetPhysicalDeviceFormatProperties0(
		physicalDevice.getNativeHandle() /* VkHandle */ ,
		format.getValue() /* VkEnum */,
		pFormatProperties.getPointer() /* Struct */ );

   } 

   /**
    *  Native interface for Vulkan method #5
    *  vkGetPhysicalDeviceFormatProperties 
    * 
    * @param physicalDevice - 
    * @param format - 
    * @param pFormatProperties - 
    */
    private static native void vkGetPhysicalDeviceFormatProperties0(
		long   physicalDevice,
		int   format,
		ByteBuffer   pFormatProperties);/* 
	vkGetPhysicalDeviceFormatProperties(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(VkFormat) format,
			(VkFormatProperties*) pFormatProperties);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 6
    * <h2>Prototype</h2><pre>
    *  VkResult  vkGetPhysicalDeviceImageFormatProperties(
    *     VkPhysicalDevice                            physicalDevice,
    *     VkFormat                                    format,
    *     VkImageType                                 type,
    *     VkImageTiling                               tiling,
    *     VkImageUsageFlags                           usage,
    *     VkImageCreateFlags                          flags,
    *     VkImageFormatProperties*                    pImageFormatProperties);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param format - Vulkan enumeration of type VkFormat 
    * @param type - Vulkan enumeration of type VkImageType 
    * @param tiling - Vulkan enumeration of type VkImageTiling 
    * @param usage int 
    * @param flags int 
    * @param pImageFormatProperties - Vulkan Struct of type  VkImageFormatProperties  
    * 
    * @return VkResult
    */
   public static VkResult vkGetPhysicalDeviceImageFormatProperties(
		VkPhysicalDevice physicalDevice,
		VkFormat format,
		VkImageType type,
		VkImageTiling tiling,
		int usage,
		int flags,
		VkImageFormatProperties pImageFormatProperties) {

	 int  _val = vkGetPhysicalDeviceImageFormatProperties0(
			physicalDevice.getNativeHandle() /* VkHandle */ ,
			format.getValue() /* VkEnum */,
			type.getValue() /* VkEnum */,
			tiling.getValue() /* VkEnum */,
			usage ,
			flags ,
			pImageFormatProperties.getPointer() /* Struct */ );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #6
    *  vkGetPhysicalDeviceImageFormatProperties 
    * 
    * @param physicalDevice - 
    * @param format - 
    * @param type - 
    * @param tiling - 
    * @param usage - 
    * @param flags - 
    * @param pImageFormatProperties - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkGetPhysicalDeviceImageFormatProperties0(
		long   physicalDevice,
		int   format,
		int   type,
		int   tiling,
		int  usage,
		int  flags,
		ByteBuffer   pImageFormatProperties);/* 
	VkResult res = vkGetPhysicalDeviceImageFormatProperties(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(VkFormat) format,
			(VkImageType) type,
			(VkImageTiling) tiling,
			(VkImageUsageFlags) usage,
			(VkImageCreateFlags) flags,
			(VkImageFormatProperties*) pImageFormatProperties);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 7
    * <h2>Prototype</h2><pre>
    *  void  vkGetPhysicalDeviceProperties(
    *     VkPhysicalDevice                            physicalDevice,
    *     VkPhysicalDeviceProperties*                 pProperties);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param pProperties - Vulkan Struct of type  VkPhysicalDeviceProperties  
    */
   public static void vkGetPhysicalDeviceProperties(
		VkPhysicalDevice physicalDevice,
		VkPhysicalDeviceProperties pProperties) {

	 vkGetPhysicalDeviceProperties0(
		physicalDevice.getNativeHandle() /* VkHandle */ ,
		pProperties.getPointer() /* Struct */ );

   } 

   /**
    *  Native interface for Vulkan method #7
    *  vkGetPhysicalDeviceProperties 
    * 
    * @param physicalDevice - 
    * @param pProperties - 
    */
    private static native void vkGetPhysicalDeviceProperties0(
		long   physicalDevice,
		ByteBuffer   pProperties);/* 
	vkGetPhysicalDeviceProperties(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(VkPhysicalDeviceProperties*) pProperties);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 8
    * <h2>Prototype</h2><pre>
    *  void  vkGetPhysicalDeviceQueueFamilyProperties(
    *     VkPhysicalDevice                            physicalDevice,
    *     uint32_t*                                   pQueueFamilyPropertyCount,
    *     VkQueueFamilyProperties*                    pQueueFamilyProperties);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param pQueueFamilyPropertyCount - The length of array pQueueFamilyProperties. 
    * @param pQueueFamilyProperties - An array of  VkQueueFamilyProperties . 
    */
   public static void vkGetPhysicalDeviceQueueFamilyProperties(
		VkPhysicalDevice physicalDevice,
		int[] pQueueFamilyPropertyCount,
		VkQueueFamilyProperties[] pQueueFamilyProperties) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkQueueFamilyProperties> pQueueFamilyPropertiesBuff =
			 new BigBuffer<VkQueueFamilyProperties>(pQueueFamilyProperties, VkQueueFamilyProperties.getID());

	 vkGetPhysicalDeviceQueueFamilyProperties0(
		physicalDevice.getNativeHandle() /* VkHandle */ ,
		pQueueFamilyPropertyCount ,
		pQueueFamilyPropertiesBuff.getPointer() /*Buffer for Struct[]*/ );

   } 

   /**
    *  Native interface for Vulkan method #8
    *  vkGetPhysicalDeviceQueueFamilyProperties 
    * 
    * @param physicalDevice - 
    * @param pQueueFamilyPropertyCount - 
    * @param pQueueFamilyProperties - 
    */
    private static native void vkGetPhysicalDeviceQueueFamilyProperties0(
		long   physicalDevice,
		int[]  pQueueFamilyPropertyCount,
		ByteBuffer   pQueueFamilyProperties);/* 
	vkGetPhysicalDeviceQueueFamilyProperties(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(uint32_t*) pQueueFamilyPropertyCount,
			(VkQueueFamilyProperties*) pQueueFamilyProperties);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 9
    * <h2>Prototype</h2><pre>
    *  void  vkGetPhysicalDeviceMemoryProperties(
    *     VkPhysicalDevice                            physicalDevice,
    *     VkPhysicalDeviceMemoryProperties*           pMemoryProperties);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param pMemoryProperties - Vulkan Struct of type  VkPhysicalDeviceMemoryProperties  
    */
   public static void vkGetPhysicalDeviceMemoryProperties(
		VkPhysicalDevice physicalDevice,
		VkPhysicalDeviceMemoryProperties pMemoryProperties) {

	 vkGetPhysicalDeviceMemoryProperties0(
		physicalDevice.getNativeHandle() /* VkHandle */ ,
		pMemoryProperties.getPointer() /* Struct */ );

   } 

   /**
    *  Native interface for Vulkan method #9
    *  vkGetPhysicalDeviceMemoryProperties 
    * 
    * @param physicalDevice - 
    * @param pMemoryProperties - 
    */
    private static native void vkGetPhysicalDeviceMemoryProperties0(
		long   physicalDevice,
		ByteBuffer   pMemoryProperties);/* 
	vkGetPhysicalDeviceMemoryProperties(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(VkPhysicalDeviceMemoryProperties*) pMemoryProperties);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 10
    * <h2>Prototype</h2><pre>
    *  PFN_vkVoidFunction  vkGetInstanceProcAddr(
    *     VkInstance                                  instance,
    *     const char*                                 pName);
    * </pre>
    * 
    * @param instance - Vulkan handle of type VkInstance 
    * @param pName String 
    * 
    * @return PFNvkVoidFunction
    */
   public static PFNvkVoidFunction vkGetInstanceProcAddr(
		VkInstance instance,
		String pName) {

	 long  _val = vkGetInstanceProcAddr0(
			instance.getNativeHandle() /* VkHandle */ ,
			pName  );
	 return new PFNvkVoidFunction(_val);
   } 

   /**
    *  Native interface for Vulkan method #10
    *  vkGetInstanceProcAddr 
    * 
    * @param instance - 
    * @param pName - 
    * 
    * @return PFNvkVoidFunction as long  
    */
    private static native long  vkGetInstanceProcAddr0(
		long   instance,
		String  pName);/* 
	PFN_vkVoidFunction res = vkGetInstanceProcAddr(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(const char*) pName);
	 return (jlong) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 11
    * <h2>Prototype</h2><pre>
    *  PFN_vkVoidFunction  vkGetDeviceProcAddr(
    *     VkDevice                                    device,
    *     const char*                                 pName);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pName String 
    * 
    * @return PFNvkVoidFunction
    */
   public static PFNvkVoidFunction vkGetDeviceProcAddr(
		VkDevice device,
		String pName) {

	 long  _val = vkGetDeviceProcAddr0(
			device.getNativeHandle() /* VkHandle */ ,
			pName  );
	 return new PFNvkVoidFunction(_val);
   } 

   /**
    *  Native interface for Vulkan method #11
    *  vkGetDeviceProcAddr 
    * 
    * @param device - 
    * @param pName - 
    * 
    * @return PFNvkVoidFunction as long  
    */
    private static native long  vkGetDeviceProcAddr0(
		long   device,
		String  pName);/* 
	PFN_vkVoidFunction res = vkGetDeviceProcAddr(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const char*) pName);
	 return (jlong) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 12
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateDevice(
    *     VkPhysicalDevice                            physicalDevice,
    *     const VkDeviceCreateInfo*                   pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkDevice*                                   pDevice);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param pCreateInfo - Vulkan Struct of type  final VkDeviceCreateInfo 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pDevice - An array of  VkDevice . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateDevice(
		VkPhysicalDevice physicalDevice,
		final VkDeviceCreateInfo pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkDevice[] pDevice) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkDevice> pDeviceBuffer =
			 new BigBuffer<VkDevice>(pDevice, true);
	 int  _val = vkCreateDevice0(
			physicalDevice.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pDeviceBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pDeviceBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #12
    *  vkCreateDevice 
    * 
    * @param physicalDevice - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pDevice - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateDevice0(
		long   physicalDevice,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pDevice);/* 
	VkResult res = vkCreateDevice(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(const VkDeviceCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkDevice*) pDevice);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 13
    * <h2>Prototype</h2><pre>
    *  void  vkDestroyDevice(
    *     VkDevice                                    device,
    *     const VkAllocationCallbacks*                pAllocator);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    */
   public static void vkDestroyDevice(
		VkDevice device,
		final VkAllocationCallbacks pAllocator) {

	 vkDestroyDevice0(
		device.getNativeHandle() /* VkHandle */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */  );

   } 

   /**
    *  Native interface for Vulkan method #13
    *  vkDestroyDevice 
    * 
    * @param device - 
    * @param pAllocator - 
    */
    private static native void vkDestroyDevice0(
		long   device,
		ByteBuffer   pAllocator);/* 
	vkDestroyDevice(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkAllocationCallbacks*) pAllocator);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 14
    * <h2>Prototype</h2><pre>
    *  VkResult  vkEnumerateInstanceExtensionProperties(
    *     const char*                                 pLayerName,
    *     uint32_t*                                   pPropertyCount,
    *     VkExtensionProperties*                      pProperties);
    * </pre>
    * 
    * @param pLayerName String 
    * @param pPropertyCount - The length of array pProperties. 
    * @param pProperties - An array of  VkExtensionProperties . 
    * 
    * @return VkResult
    */
   public static VkResult vkEnumerateInstanceExtensionProperties(
		String pLayerName,
		int[] pPropertyCount,
		VkExtensionProperties[] pProperties) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkExtensionProperties> pPropertiesBuff =
			 new BigBuffer<VkExtensionProperties>(pProperties, VkExtensionProperties.getID());

	 int  _val = vkEnumerateInstanceExtensionProperties0(
			pLayerName ,
			pPropertyCount ,
			pPropertiesBuff.getPointer() /*Buffer for Struct[]*/ );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #14
    *  vkEnumerateInstanceExtensionProperties 
    * 
    * @param pLayerName - 
    * @param pPropertyCount - 
    * @param pProperties - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkEnumerateInstanceExtensionProperties0(
		String  pLayerName,
		int[]  pPropertyCount,
		ByteBuffer   pProperties);/* 
	VkResult res = vkEnumerateInstanceExtensionProperties(
			(const char*) pLayerName,
			(uint32_t*) pPropertyCount,
			(VkExtensionProperties*) pProperties);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 15
    * <h2>Prototype</h2><pre>
    *  VkResult  vkEnumerateDeviceExtensionProperties(
    *     VkPhysicalDevice                            physicalDevice,
    *     const char*                                 pLayerName,
    *     uint32_t*                                   pPropertyCount,
    *     VkExtensionProperties*                      pProperties);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param pLayerName String 
    * @param pPropertyCount - The length of array pProperties. 
    * @param pProperties - An array of  VkExtensionProperties . 
    * 
    * @return VkResult
    */
   public static VkResult vkEnumerateDeviceExtensionProperties(
		VkPhysicalDevice physicalDevice,
		String pLayerName,
		int[] pPropertyCount,
		VkExtensionProperties[] pProperties) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkExtensionProperties> pPropertiesBuff =
			 new BigBuffer<VkExtensionProperties>(pProperties, VkExtensionProperties.getID());

	 int  _val = vkEnumerateDeviceExtensionProperties0(
			physicalDevice.getNativeHandle() /* VkHandle */ ,
			pLayerName ,
			pPropertyCount ,
			pPropertiesBuff.getPointer() /*Buffer for Struct[]*/ );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #15
    *  vkEnumerateDeviceExtensionProperties 
    * 
    * @param physicalDevice - 
    * @param pLayerName - 
    * @param pPropertyCount - 
    * @param pProperties - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkEnumerateDeviceExtensionProperties0(
		long   physicalDevice,
		String  pLayerName,
		int[]  pPropertyCount,
		ByteBuffer   pProperties);/* 
	VkResult res = vkEnumerateDeviceExtensionProperties(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(const char*) pLayerName,
			(uint32_t*) pPropertyCount,
			(VkExtensionProperties*) pProperties);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 16
    * <h2>Prototype</h2><pre>
    *  VkResult  vkEnumerateInstanceLayerProperties(
    *     uint32_t*                                   pPropertyCount,
    *     VkLayerProperties*                          pProperties);
    * </pre>
    * 
    * @param pPropertyCount - The length of array pProperties. 
    * @param pProperties - An array of  VkLayerProperties . 
    * 
    * @return VkResult
    */
   public static VkResult vkEnumerateInstanceLayerProperties(
		int[] pPropertyCount,
		VkLayerProperties[] pProperties) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkLayerProperties> pPropertiesBuff =
			 new BigBuffer<VkLayerProperties>(pProperties, VkLayerProperties.getID());

	 int  _val = vkEnumerateInstanceLayerProperties0(
			pPropertyCount ,
			pPropertiesBuff.getPointer() /*Buffer for Struct[]*/ );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #16
    *  vkEnumerateInstanceLayerProperties 
    * 
    * @param pPropertyCount - 
    * @param pProperties - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkEnumerateInstanceLayerProperties0(
		int[]  pPropertyCount,
		ByteBuffer   pProperties);/* 
	VkResult res = vkEnumerateInstanceLayerProperties(
			(uint32_t*) pPropertyCount,
			(VkLayerProperties*) pProperties);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 17
    * <h2>Prototype</h2><pre>
    *  VkResult  vkEnumerateDeviceLayerProperties(
    *     VkPhysicalDevice                            physicalDevice,
    *     uint32_t*                                   pPropertyCount,
    *     VkLayerProperties*                          pProperties);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param pPropertyCount - The length of array pProperties. 
    * @param pProperties - An array of  VkLayerProperties . 
    * 
    * @return VkResult
    */
   public static VkResult vkEnumerateDeviceLayerProperties(
		VkPhysicalDevice physicalDevice,
		int[] pPropertyCount,
		VkLayerProperties[] pProperties) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkLayerProperties> pPropertiesBuff =
			 new BigBuffer<VkLayerProperties>(pProperties, VkLayerProperties.getID());

	 int  _val = vkEnumerateDeviceLayerProperties0(
			physicalDevice.getNativeHandle() /* VkHandle */ ,
			pPropertyCount ,
			pPropertiesBuff.getPointer() /*Buffer for Struct[]*/ );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #17
    *  vkEnumerateDeviceLayerProperties 
    * 
    * @param physicalDevice - 
    * @param pPropertyCount - 
    * @param pProperties - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkEnumerateDeviceLayerProperties0(
		long   physicalDevice,
		int[]  pPropertyCount,
		ByteBuffer   pProperties);/* 
	VkResult res = vkEnumerateDeviceLayerProperties(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(uint32_t*) pPropertyCount,
			(VkLayerProperties*) pProperties);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 18
    * <h2>Prototype</h2><pre>
    *  void  vkGetDeviceQueue(
    *     VkDevice                                    device,
    *     uint32_t                                    queueFamilyIndex,
    *     uint32_t                                    queueIndex,
    *     VkQueue*                                    pQueue);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param queueFamilyIndex int 
    * @param queueIndex int 
    * @param pQueue - Vulkan handle of type  VkQueue  
    */
   public static void vkGetDeviceQueue(
		VkDevice device,
		int queueFamilyIndex,
		int queueIndex,
		VkQueue pQueue) {

	 vkGetDeviceQueue0(
		device.getNativeHandle() /* VkHandle */ ,
		queueFamilyIndex ,
		queueIndex ,
		pQueue.getNativeHandle() /* VkHandle */  );

   } 

   /**
    *  Native interface for Vulkan method #18
    *  vkGetDeviceQueue 
    * 
    * @param device - 
    * @param queueFamilyIndex - 
    * @param queueIndex - 
    * @param pQueue - 
    */
    private static native void vkGetDeviceQueue0(
		long   device,
		int  queueFamilyIndex,
		int  queueIndex,
		long   pQueue);/* 
	vkGetDeviceQueue(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(uint32_t) queueFamilyIndex,
			(uint32_t) queueIndex,
			(VkQueue*) pQueue);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 19
    * <h2>Prototype</h2><pre>
    *  VkResult  vkQueueSubmit(
    *     VkQueue                                     queue,
    *     uint32_t                                    submitCount,
    *     const VkSubmitInfo*                         pSubmits,
    *     VkFence                                     fence);
    * </pre>
    * 
    * @param queue - Vulkan handle of type VkQueue 
    * @param submitCount - The length of array pSubmits. 
    * @param pSubmits - An array of  final VkSubmitInfo . 
    * @param fence - Vulkan handle of type VkFence 
    * 
    * @return VkResult
    */
   public static VkResult vkQueueSubmit(
		VkQueue queue,
		int submitCount,
		final VkSubmitInfo[] pSubmits,
		VkFence fence) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkSubmitInfo> pSubmitsBuff =
			 new BigBuffer<VkSubmitInfo>(pSubmits, VkSubmitInfo.getID());

	 int  _val = vkQueueSubmit0(
			queue.getNativeHandle() /* VkHandle */ ,
			submitCount ,
			pSubmitsBuff.getPointer() /*Buffer for Struct[]*/,
			fence.getNativeHandle() /* VkHandle */  );

	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #19
    *  vkQueueSubmit 
    * 
    * @param queue - 
    * @param submitCount - 
    * @param pSubmits - 
    * @param fence - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkQueueSubmit0(
		long   queue,
		int  submitCount,
		ByteBuffer   pSubmits,
		long   fence);/* 
	VkResult res = vkQueueSubmit(
			(VkQueue) reinterpret_cast<VkQueue>(queue),
			(uint32_t) submitCount,
			(const VkSubmitInfo*) pSubmits,
			(VkFence) reinterpret_cast<VkFence>(fence));
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 20
    * <h2>Prototype</h2><pre>
    *  VkResult  vkQueueWaitIdle(
    *     VkQueue                                     queue);
    * </pre>
    * 
    * @param queue - Vulkan handle of type VkQueue 
    * 
    * @return VkResult
    */
   public static VkResult vkQueueWaitIdle(
		VkQueue queue) {

	 int  _val = vkQueueWaitIdle0(
			queue.getNativeHandle() /* VkHandle */  );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #20
    *  vkQueueWaitIdle 
    * 
    * @param queue - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkQueueWaitIdle0(
		long   queue);/* 
	VkResult res = vkQueueWaitIdle(
			(VkQueue) reinterpret_cast<VkQueue>(queue));
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 21
    * <h2>Prototype</h2><pre>
    *  VkResult  vkDeviceWaitIdle(
    *     VkDevice                                    device);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * 
    * @return VkResult
    */
   public static VkResult vkDeviceWaitIdle(
		VkDevice device) {

	 int  _val = vkDeviceWaitIdle0(
			device.getNativeHandle() /* VkHandle */  );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #21
    *  vkDeviceWaitIdle 
    * 
    * @param device - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkDeviceWaitIdle0(
		long   device);/* 
	VkResult res = vkDeviceWaitIdle(
			(VkDevice) reinterpret_cast<VkDevice>(device));
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 22
    * <h2>Prototype</h2><pre>
    *  VkResult  vkAllocateMemory(
    *     VkDevice                                    device,
    *     const VkMemoryAllocateInfo*                 pAllocateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkDeviceMemory*                             pMemory);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pAllocateInfo - Vulkan Struct of type  final VkMemoryAllocateInfo 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pMemory - Vulkan handle of type  VkDeviceMemory  
    * 
    * @return VkResult
    */
   public static VkResult vkAllocateMemory(
		VkDevice device,
		final VkMemoryAllocateInfo pAllocateInfo,
		final VkAllocationCallbacks pAllocator,
		VkDeviceMemory pMemory) {

	 int  _val = vkAllocateMemory0(
			device.getNativeHandle() /* VkHandle */ ,
			pAllocateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pMemory.getNativeHandle() /* VkHandle */  );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #22
    *  vkAllocateMemory 
    * 
    * @param device - 
    * @param pAllocateInfo - 
    * @param pAllocator - 
    * @param pMemory - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkAllocateMemory0(
		long   device,
		ByteBuffer   pAllocateInfo,
		ByteBuffer   pAllocator,
		long   pMemory);/* 
	VkResult res = vkAllocateMemory(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkMemoryAllocateInfo*) pAllocateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkDeviceMemory*) pMemory);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 23
    * <h2>Prototype</h2><pre>
    *  void  vkFreeMemory(
    *     VkDevice                                    device,
    *     VkDeviceMemory                              memory,
    *     const VkAllocationCallbacks*                pAllocator);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param memory - Vulkan handle of type VkDeviceMemory 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    */
   public static void vkFreeMemory(
		VkDevice device,
		VkDeviceMemory memory,
		final VkAllocationCallbacks pAllocator) {

	 vkFreeMemory0(
		device.getNativeHandle() /* VkHandle */ ,
		memory.getNativeHandle() /* VkHandle */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */  );

   } 

   /**
    *  Native interface for Vulkan method #23
    *  vkFreeMemory 
    * 
    * @param device - 
    * @param memory - 
    * @param pAllocator - 
    */
    private static native void vkFreeMemory0(
		long   device,
		long   memory,
		ByteBuffer   pAllocator);/* 
	vkFreeMemory(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkDeviceMemory) reinterpret_cast<VkDeviceMemory>(memory),
			(const VkAllocationCallbacks*) pAllocator);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 24
    * <h2>Prototype</h2><pre>
    *  VkResult  vkMapMemory(
    *     VkDevice                                    device,
    *     VkDeviceMemory                              memory,
    *     VkDeviceSize                                offset,
    *     VkDeviceSize                                size,
    *     VkMemoryMapFlags                            flags,
    *     void**                                      ppData);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param memory - Vulkan handle of type VkDeviceMemory 
    * @param offset long 
    * @param size long 
    * @param flags int 
    * @param ppData ByteBuffer 
    * 
    * @return VkResult
    */
   public static VkResult vkMapMemory(
		VkDevice device,
		VkDeviceMemory memory,
		long offset,
		long size,
		int flags,
		ByteBuffer ppData) {

	 int  _val = vkMapMemory0(
			device.getNativeHandle() /* VkHandle */ ,
			memory.getNativeHandle() /* VkHandle */ ,
			offset ,
			size ,
			flags ,
			ppData  );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #24
    *  vkMapMemory 
    * 
    * @param device - 
    * @param memory - 
    * @param offset - 
    * @param size - 
    * @param flags - 
    * @param ppData - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkMapMemory0(
		long   device,
		long   memory,
		long  offset,
		long  size,
		int  flags,
		ByteBuffer  ppData);/* 
	VkResult res = vkMapMemory(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkDeviceMemory) reinterpret_cast<VkDeviceMemory>(memory),
			(VkDeviceSize) offset,
			(VkDeviceSize) size,
			(VkMemoryMapFlags) flags,
			(void**) ppData);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 25
    * <h2>Prototype</h2><pre>
    *  void  vkUnmapMemory(
    *     VkDevice                                    device,
    *     VkDeviceMemory                              memory);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param memory - Vulkan handle of type VkDeviceMemory 
    */
   public static void vkUnmapMemory(
		VkDevice device,
		VkDeviceMemory memory) {

	 vkUnmapMemory0(
		device.getNativeHandle() /* VkHandle */ ,
		memory.getNativeHandle() /* VkHandle */  );

   } 

   /**
    *  Native interface for Vulkan method #25
    *  vkUnmapMemory 
    * 
    * @param device - 
    * @param memory - 
    */
    private static native void vkUnmapMemory0(
		long   device,
		long   memory);/* 
	vkUnmapMemory(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkDeviceMemory) reinterpret_cast<VkDeviceMemory>(memory));

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 26
    * <h2>Prototype</h2><pre>
    *  VkResult  vkFlushMappedMemoryRanges(
    *     VkDevice                                    device,
    *     uint32_t                                    memoryRangeCount,
    *     const VkMappedMemoryRange*                  pMemoryRanges);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param memoryRangeCount - The length of array pMemoryRanges. 
    * @param pMemoryRanges - An array of  final VkMappedMemoryRange . 
    * 
    * @return VkResult
    */
   public static VkResult vkFlushMappedMemoryRanges(
		VkDevice device,
		int memoryRangeCount,
		final VkMappedMemoryRange[] pMemoryRanges) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkMappedMemoryRange> pMemoryRangesBuff =
			 new BigBuffer<VkMappedMemoryRange>(pMemoryRanges, VkMappedMemoryRange.getID());

	 int  _val = vkFlushMappedMemoryRanges0(
			device.getNativeHandle() /* VkHandle */ ,
			memoryRangeCount ,
			pMemoryRangesBuff.getPointer() /*Buffer for Struct[]*/ );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #26
    *  vkFlushMappedMemoryRanges 
    * 
    * @param device - 
    * @param memoryRangeCount - 
    * @param pMemoryRanges - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkFlushMappedMemoryRanges0(
		long   device,
		int  memoryRangeCount,
		ByteBuffer   pMemoryRanges);/* 
	VkResult res = vkFlushMappedMemoryRanges(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(uint32_t) memoryRangeCount,
			(const VkMappedMemoryRange*) pMemoryRanges);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 27
    * <h2>Prototype</h2><pre>
    *  VkResult  vkInvalidateMappedMemoryRanges(
    *     VkDevice                                    device,
    *     uint32_t                                    memoryRangeCount,
    *     const VkMappedMemoryRange*                  pMemoryRanges);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param memoryRangeCount - The length of array pMemoryRanges. 
    * @param pMemoryRanges - An array of  final VkMappedMemoryRange . 
    * 
    * @return VkResult
    */
   public static VkResult vkInvalidateMappedMemoryRanges(
		VkDevice device,
		int memoryRangeCount,
		final VkMappedMemoryRange[] pMemoryRanges) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkMappedMemoryRange> pMemoryRangesBuff =
			 new BigBuffer<VkMappedMemoryRange>(pMemoryRanges, VkMappedMemoryRange.getID());

	 int  _val = vkInvalidateMappedMemoryRanges0(
			device.getNativeHandle() /* VkHandle */ ,
			memoryRangeCount ,
			pMemoryRangesBuff.getPointer() /*Buffer for Struct[]*/ );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #27
    *  vkInvalidateMappedMemoryRanges 
    * 
    * @param device - 
    * @param memoryRangeCount - 
    * @param pMemoryRanges - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkInvalidateMappedMemoryRanges0(
		long   device,
		int  memoryRangeCount,
		ByteBuffer   pMemoryRanges);/* 
	VkResult res = vkInvalidateMappedMemoryRanges(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(uint32_t) memoryRangeCount,
			(const VkMappedMemoryRange*) pMemoryRanges);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 28
    * <h2>Prototype</h2><pre>
    *  void  vkGetDeviceMemoryCommitment(
    *     VkDevice                                    device,
    *     VkDeviceMemory                              memory,
    *     VkDeviceSize*                               pCommittedMemoryInBytes);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param memory - Vulkan handle of type VkDeviceMemory 
    * @param pCommittedMemoryInBytes - An array of long. 
    */
   public static void vkGetDeviceMemoryCommitment(
		VkDevice device,
		VkDeviceMemory memory,
		long[] pCommittedMemoryInBytes) {

	 vkGetDeviceMemoryCommitment0(
		device.getNativeHandle() /* VkHandle */ ,
		memory.getNativeHandle() /* VkHandle */ ,
		pCommittedMemoryInBytes  );

   } 

   /**
    *  Native interface for Vulkan method #28
    *  vkGetDeviceMemoryCommitment 
    * 
    * @param device - 
    * @param memory - 
    * @param pCommittedMemoryInBytes - 
    */
    private static native void vkGetDeviceMemoryCommitment0(
		long   device,
		long   memory,
		long[]  pCommittedMemoryInBytes);/* 
	vkGetDeviceMemoryCommitment(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkDeviceMemory) reinterpret_cast<VkDeviceMemory>(memory),
			(VkDeviceSize*) pCommittedMemoryInBytes);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 29
    * <h2>Prototype</h2><pre>
    *  VkResult  vkBindBufferMemory(
    *     VkDevice                                    device,
    *     VkBuffer                                    buffer,
    *     VkDeviceMemory                              memory,
    *     VkDeviceSize                                memoryOffset);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param buffer - Vulkan handle of type VkBuffer 
    * @param memory - Vulkan handle of type VkDeviceMemory 
    * @param memoryOffset long 
    * 
    * @return VkResult
    */
   public static VkResult vkBindBufferMemory(
		VkDevice device,
		VkBuffer buffer,
		VkDeviceMemory memory,
		long memoryOffset) {

	 int  _val = vkBindBufferMemory0(
			device.getNativeHandle() /* VkHandle */ ,
			buffer.getNativeHandle() /* VkHandle */ ,
			memory.getNativeHandle() /* VkHandle */ ,
			memoryOffset  );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #29
    *  vkBindBufferMemory 
    * 
    * @param device - 
    * @param buffer - 
    * @param memory - 
    * @param memoryOffset - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkBindBufferMemory0(
		long   device,
		long   buffer,
		long   memory,
		long  memoryOffset);/* 
	VkResult res = vkBindBufferMemory(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkBuffer) reinterpret_cast<VkBuffer>(buffer),
			(VkDeviceMemory) reinterpret_cast<VkDeviceMemory>(memory),
			(VkDeviceSize) memoryOffset);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 30
    * <h2>Prototype</h2><pre>
    *  VkResult  vkBindImageMemory(
    *     VkDevice                                    device,
    *     VkImage                                     image,
    *     VkDeviceMemory                              memory,
    *     VkDeviceSize                                memoryOffset);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param image - Vulkan handle of type VkImage 
    * @param memory - Vulkan handle of type VkDeviceMemory 
    * @param memoryOffset long 
    * 
    * @return VkResult
    */
   public static VkResult vkBindImageMemory(
		VkDevice device,
		VkImage image,
		VkDeviceMemory memory,
		long memoryOffset) {

	 int  _val = vkBindImageMemory0(
			device.getNativeHandle() /* VkHandle */ ,
			image.getNativeHandle() /* VkHandle */ ,
			memory.getNativeHandle() /* VkHandle */ ,
			memoryOffset  );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #30
    *  vkBindImageMemory 
    * 
    * @param device - 
    * @param image - 
    * @param memory - 
    * @param memoryOffset - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkBindImageMemory0(
		long   device,
		long   image,
		long   memory,
		long  memoryOffset);/* 
	VkResult res = vkBindImageMemory(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkImage) reinterpret_cast<VkImage>(image),
			(VkDeviceMemory) reinterpret_cast<VkDeviceMemory>(memory),
			(VkDeviceSize) memoryOffset);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 31
    * <h2>Prototype</h2><pre>
    *  void  vkGetBufferMemoryRequirements(
    *     VkDevice                                    device,
    *     VkBuffer                                    buffer,
    *     VkMemoryRequirements*                       pMemoryRequirements);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param buffer - Vulkan handle of type VkBuffer 
    * @param pMemoryRequirements - Vulkan Struct of type  VkMemoryRequirements  
    */
   public static void vkGetBufferMemoryRequirements(
		VkDevice device,
		VkBuffer buffer,
		VkMemoryRequirements pMemoryRequirements) {

	 vkGetBufferMemoryRequirements0(
		device.getNativeHandle() /* VkHandle */ ,
		buffer.getNativeHandle() /* VkHandle */ ,
		pMemoryRequirements.getPointer() /* Struct */ );

   } 

   /**
    *  Native interface for Vulkan method #31
    *  vkGetBufferMemoryRequirements 
    * 
    * @param device - 
    * @param buffer - 
    * @param pMemoryRequirements - 
    */
    private static native void vkGetBufferMemoryRequirements0(
		long   device,
		long   buffer,
		ByteBuffer   pMemoryRequirements);/* 
	vkGetBufferMemoryRequirements(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkBuffer) reinterpret_cast<VkBuffer>(buffer),
			(VkMemoryRequirements*) pMemoryRequirements);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 32
    * <h2>Prototype</h2><pre>
    *  void  vkGetImageMemoryRequirements(
    *     VkDevice                                    device,
    *     VkImage                                     image,
    *     VkMemoryRequirements*                       pMemoryRequirements);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param image - Vulkan handle of type VkImage 
    * @param pMemoryRequirements - Vulkan Struct of type  VkMemoryRequirements  
    */
   public static void vkGetImageMemoryRequirements(
		VkDevice device,
		VkImage image,
		VkMemoryRequirements pMemoryRequirements) {

	 vkGetImageMemoryRequirements0(
		device.getNativeHandle() /* VkHandle */ ,
		image.getNativeHandle() /* VkHandle */ ,
		pMemoryRequirements.getPointer() /* Struct */ );

   } 

   /**
    *  Native interface for Vulkan method #32
    *  vkGetImageMemoryRequirements 
    * 
    * @param device - 
    * @param image - 
    * @param pMemoryRequirements - 
    */
    private static native void vkGetImageMemoryRequirements0(
		long   device,
		long   image,
		ByteBuffer   pMemoryRequirements);/* 
	vkGetImageMemoryRequirements(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkImage) reinterpret_cast<VkImage>(image),
			(VkMemoryRequirements*) pMemoryRequirements);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 33
    * <h2>Prototype</h2><pre>
    *  void  vkGetImageSparseMemoryRequirements(
    *     VkDevice                                    device,
    *     VkImage                                     image,
    *     uint32_t*                                   pSparseMemoryRequirementCount,
    *     VkSparseImageMemoryRequirements*            pSparseMemoryRequirements);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param image - Vulkan handle of type VkImage 
    * @param pSparseMemoryRequirementCount - The length of array pSparseMemoryRequirements. 
    * @param pSparseMemoryRequirements - An array of  VkSparseImageMemoryRequirements . 
    */
   public static void vkGetImageSparseMemoryRequirements(
		VkDevice device,
		VkImage image,
		int[] pSparseMemoryRequirementCount,
		VkSparseImageMemoryRequirements[] pSparseMemoryRequirements) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkSparseImageMemoryRequirements> pSparseMemoryRequirementsBuff =
			 new BigBuffer<VkSparseImageMemoryRequirements>(pSparseMemoryRequirements, VkSparseImageMemoryRequirements.getID());

	 vkGetImageSparseMemoryRequirements0(
		device.getNativeHandle() /* VkHandle */ ,
		image.getNativeHandle() /* VkHandle */ ,
		pSparseMemoryRequirementCount ,
		pSparseMemoryRequirementsBuff.getPointer() /*Buffer for Struct[]*/ );

   } 

   /**
    *  Native interface for Vulkan method #33
    *  vkGetImageSparseMemoryRequirements 
    * 
    * @param device - 
    * @param image - 
    * @param pSparseMemoryRequirementCount - 
    * @param pSparseMemoryRequirements - 
    */
    private static native void vkGetImageSparseMemoryRequirements0(
		long   device,
		long   image,
		int[]  pSparseMemoryRequirementCount,
		ByteBuffer   pSparseMemoryRequirements);/* 
	vkGetImageSparseMemoryRequirements(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkImage) reinterpret_cast<VkImage>(image),
			(uint32_t*) pSparseMemoryRequirementCount,
			(VkSparseImageMemoryRequirements*) pSparseMemoryRequirements);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 34
    * <h2>Prototype</h2><pre>
    *  void  vkGetPhysicalDeviceSparseImageFormatProperties(
    *     VkPhysicalDevice                            physicalDevice,
    *     VkFormat                                    format,
    *     VkImageType                                 type,
    *     VkSampleCountFlagBits                       samples,
    *     VkImageUsageFlags                           usage,
    *     VkImageTiling                               tiling,
    *     uint32_t*                                   pPropertyCount,
    *     VkSparseImageFormatProperties*              pProperties);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param format - Vulkan enumeration of type VkFormat 
    * @param type - Vulkan enumeration of type VkImageType 
    * @param samples - Vulkan enumeration of type VkSampleCountFlagBits 
    * @param usage int 
    * @param tiling - Vulkan enumeration of type VkImageTiling 
    * @param pPropertyCount - The length of array pProperties. 
    * @param pProperties - An array of  VkSparseImageFormatProperties . 
    */
   public static void vkGetPhysicalDeviceSparseImageFormatProperties(
		VkPhysicalDevice physicalDevice,
		VkFormat format,
		VkImageType type,
		VkSampleCountFlagBits samples,
		int usage,
		VkImageTiling tiling,
		int[] pPropertyCount,
		VkSparseImageFormatProperties[] pProperties) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkSparseImageFormatProperties> pPropertiesBuff =
			 new BigBuffer<VkSparseImageFormatProperties>(pProperties, VkSparseImageFormatProperties.getID());

	 vkGetPhysicalDeviceSparseImageFormatProperties0(
		physicalDevice.getNativeHandle() /* VkHandle */ ,
		format.getValue() /* VkEnum */,
		type.getValue() /* VkEnum */,
		samples.getValue() /* VkEnum */,
		usage ,
		tiling.getValue() /* VkEnum */,
		pPropertyCount ,
		pPropertiesBuff.getPointer() /*Buffer for Struct[]*/ );

   } 

   /**
    *  Native interface for Vulkan method #34
    *  vkGetPhysicalDeviceSparseImageFormatProperties 
    * 
    * @param physicalDevice - 
    * @param format - 
    * @param type - 
    * @param samples - 
    * @param usage - 
    * @param tiling - 
    * @param pPropertyCount - 
    * @param pProperties - 
    */
    private static native void vkGetPhysicalDeviceSparseImageFormatProperties0(
		long   physicalDevice,
		int   format,
		int   type,
		int   samples,
		int  usage,
		int   tiling,
		int[]  pPropertyCount,
		ByteBuffer   pProperties);/* 
	vkGetPhysicalDeviceSparseImageFormatProperties(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(VkFormat) format,
			(VkImageType) type,
			(VkSampleCountFlagBits) samples,
			(VkImageUsageFlags) usage,
			(VkImageTiling) tiling,
			(uint32_t*) pPropertyCount,
			(VkSparseImageFormatProperties*) pProperties);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 35
    * <h2>Prototype</h2><pre>
    *  VkResult  vkQueueBindSparse(
    *     VkQueue                                     queue,
    *     uint32_t                                    bindInfoCount,
    *     const VkBindSparseInfo*                     pBindInfo,
    *     VkFence                                     fence);
    * </pre>
    * 
    * @param queue - Vulkan handle of type VkQueue 
    * @param bindInfoCount - The length of array pBindInfo. 
    * @param pBindInfo - An array of  final VkBindSparseInfo . 
    * @param fence - Vulkan handle of type VkFence 
    * 
    * @return VkResult
    */
   public static VkResult vkQueueBindSparse(
		VkQueue queue,
		int bindInfoCount,
		final VkBindSparseInfo[] pBindInfo,
		VkFence fence) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkBindSparseInfo> pBindInfoBuff =
			 new BigBuffer<VkBindSparseInfo>(pBindInfo, VkBindSparseInfo.getID());

	 int  _val = vkQueueBindSparse0(
			queue.getNativeHandle() /* VkHandle */ ,
			bindInfoCount ,
			pBindInfoBuff.getPointer() /*Buffer for Struct[]*/,
			fence.getNativeHandle() /* VkHandle */  );

	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #35
    *  vkQueueBindSparse 
    * 
    * @param queue - 
    * @param bindInfoCount - 
    * @param pBindInfo - 
    * @param fence - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkQueueBindSparse0(
		long   queue,
		int  bindInfoCount,
		ByteBuffer   pBindInfo,
		long   fence);/* 
	VkResult res = vkQueueBindSparse(
			(VkQueue) reinterpret_cast<VkQueue>(queue),
			(uint32_t) bindInfoCount,
			(const VkBindSparseInfo*) pBindInfo,
			(VkFence) reinterpret_cast<VkFence>(fence));
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 36
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateFence(
    *     VkDevice                                    device,
    *     const VkFenceCreateInfo*                    pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkFence*                                    pFence);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pCreateInfo - Vulkan Struct of type  final VkFenceCreateInfo 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pFence - An array of  VkFence . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateFence(
		VkDevice device,
		final VkFenceCreateInfo pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkFence[] pFence) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkFence> pFenceBuffer =
			 new BigBuffer<VkFence>(pFence, false);
	 int  _val = vkCreateFence0(
			device.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pFenceBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pFenceBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #36
    *  vkCreateFence 
    * 
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pFence - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateFence0(
		long   device,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pFence);/* 
	VkResult res = vkCreateFence(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkFenceCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkFence*) pFence);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 37
    * <h2>Prototype</h2><pre>
    *  void  vkDestroyFence(
    *     VkDevice                                    device,
    *     VkFence                                     fence,
    *     const VkAllocationCallbacks*                pAllocator);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param fence - Vulkan handle of type VkFence 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    */
   public static void vkDestroyFence(
		VkDevice device,
		VkFence fence,
		final VkAllocationCallbacks pAllocator) {

	 vkDestroyFence0(
		device.getNativeHandle() /* VkHandle */ ,
		fence.getNativeHandle() /* VkHandle */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */  );

   } 

   /**
    *  Native interface for Vulkan method #37
    *  vkDestroyFence 
    * 
    * @param device - 
    * @param fence - 
    * @param pAllocator - 
    */
    private static native void vkDestroyFence0(
		long   device,
		long   fence,
		ByteBuffer   pAllocator);/* 
	vkDestroyFence(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkFence) reinterpret_cast<VkFence>(fence),
			(const VkAllocationCallbacks*) pAllocator);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 38
    * <h2>Prototype</h2><pre>
    *  VkResult  vkResetFences(
    *     VkDevice                                    device,
    *     uint32_t                                    fenceCount,
    *     const VkFence*                              pFences);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param fenceCount - The length of array pFences. 
    * @param pFences - An array of  final VkFence . 
    * 
    * @return VkResult
    */
   public static VkResult vkResetFences(
		VkDevice device,
		int fenceCount,
		final VkFence[] pFences) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkFence> pFencesBuffer =
			 new BigBuffer<VkFence>(pFences, false);
	 int  _val = vkResetFences0(
			device.getNativeHandle() /* VkHandle */ ,
			fenceCount ,
			pFencesBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pFencesBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #38
    *  vkResetFences 
    * 
    * @param device - 
    * @param fenceCount - 
    * @param pFences - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkResetFences0(
		long   device,
		int  fenceCount,
		ByteBuffer   pFences);/* 
	VkResult res = vkResetFences(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(uint32_t) fenceCount,
			(const VkFence*) pFences);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 39
    * <h2>Prototype</h2><pre>
    *  VkResult  vkGetFenceStatus(
    *     VkDevice                                    device,
    *     VkFence                                     fence);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param fence - Vulkan handle of type VkFence 
    * 
    * @return VkResult
    */
   public static VkResult vkGetFenceStatus(
		VkDevice device,
		VkFence fence) {

	 int  _val = vkGetFenceStatus0(
			device.getNativeHandle() /* VkHandle */ ,
			fence.getNativeHandle() /* VkHandle */  );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #39
    *  vkGetFenceStatus 
    * 
    * @param device - 
    * @param fence - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkGetFenceStatus0(
		long   device,
		long   fence);/* 
	VkResult res = vkGetFenceStatus(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkFence) reinterpret_cast<VkFence>(fence));
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 40
    * <h2>Prototype</h2><pre>
    *  VkResult  vkWaitForFences(
    *     VkDevice                                    device,
    *     uint32_t                                    fenceCount,
    *     const VkFence*                              pFences,
    *     VkBool32                                    waitAll,
    *     uint64_t                                    timeout);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param fenceCount - The length of array pFences. 
    * @param pFences - An array of  final VkFence . 
    * @param waitAll boolean 
    * @param timeout long 
    * 
    * @return VkResult
    */
   public static VkResult vkWaitForFences(
		VkDevice device,
		int fenceCount,
		final VkFence[] pFences,
		boolean waitAll,
		long timeout) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkFence> pFencesBuffer =
			 new BigBuffer<VkFence>(pFences, false);
	 int  _val = vkWaitForFences0(
			device.getNativeHandle() /* VkHandle */ ,
			fenceCount ,
			pFencesBuffer.getPointer() /*BigBuffer of VkHandle*/,
			waitAll ,
			timeout  );
	 pFencesBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #40
    *  vkWaitForFences 
    * 
    * @param device - 
    * @param fenceCount - 
    * @param pFences - 
    * @param waitAll - 
    * @param timeout - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkWaitForFences0(
		long   device,
		int  fenceCount,
		ByteBuffer   pFences,
		boolean   waitAll,
		long  timeout);/* 
	VkResult res = vkWaitForFences(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(uint32_t) fenceCount,
			(const VkFence*) pFences,
			(VkBool32) waitAll,
			(uint64_t) timeout);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 41
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateSemaphore(
    *     VkDevice                                    device,
    *     const VkSemaphoreCreateInfo*                pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkSemaphore*                                pSemaphore);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pCreateInfo - Vulkan Struct of type  final VkSemaphoreCreateInfo 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pSemaphore - An array of  VkSemaphore . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateSemaphore(
		VkDevice device,
		final VkSemaphoreCreateInfo pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkSemaphore[] pSemaphore) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkSemaphore> pSemaphoreBuffer =
			 new BigBuffer<VkSemaphore>(pSemaphore, false);
	 int  _val = vkCreateSemaphore0(
			device.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pSemaphoreBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pSemaphoreBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #41
    *  vkCreateSemaphore 
    * 
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pSemaphore - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateSemaphore0(
		long   device,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pSemaphore);/* 
	VkResult res = vkCreateSemaphore(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkSemaphoreCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSemaphore*) pSemaphore);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 42
    * <h2>Prototype</h2><pre>
    *  void  vkDestroySemaphore(
    *     VkDevice                                    device,
    *     VkSemaphore                                 semaphore,
    *     const VkAllocationCallbacks*                pAllocator);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param semaphore - Vulkan handle of type VkSemaphore 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    */
   public static void vkDestroySemaphore(
		VkDevice device,
		VkSemaphore semaphore,
		final VkAllocationCallbacks pAllocator) {

	 vkDestroySemaphore0(
		device.getNativeHandle() /* VkHandle */ ,
		semaphore.getNativeHandle() /* VkHandle */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */  );

   } 

   /**
    *  Native interface for Vulkan method #42
    *  vkDestroySemaphore 
    * 
    * @param device - 
    * @param semaphore - 
    * @param pAllocator - 
    */
    private static native void vkDestroySemaphore0(
		long   device,
		long   semaphore,
		ByteBuffer   pAllocator);/* 
	vkDestroySemaphore(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkSemaphore) reinterpret_cast<VkSemaphore>(semaphore),
			(const VkAllocationCallbacks*) pAllocator);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 43
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateEvent(
    *     VkDevice                                    device,
    *     const VkEventCreateInfo*                    pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkEvent*                                    pEvent);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pCreateInfo - Vulkan Struct of type  final VkEventCreateInfo 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pEvent - An array of  VkEvent . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateEvent(
		VkDevice device,
		final VkEventCreateInfo pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkEvent[] pEvent) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkEvent> pEventBuffer =
			 new BigBuffer<VkEvent>(pEvent, false);
	 int  _val = vkCreateEvent0(
			device.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pEventBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pEventBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #43
    *  vkCreateEvent 
    * 
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pEvent - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateEvent0(
		long   device,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pEvent);/* 
	VkResult res = vkCreateEvent(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkEventCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkEvent*) pEvent);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 44
    * <h2>Prototype</h2><pre>
    *  void  vkDestroyEvent(
    *     VkDevice                                    device,
    *     VkEvent                                     event,
    *     const VkAllocationCallbacks*                pAllocator);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param event - Vulkan handle of type VkEvent 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    */
   public static void vkDestroyEvent(
		VkDevice device,
		VkEvent event,
		final VkAllocationCallbacks pAllocator) {

	 vkDestroyEvent0(
		device.getNativeHandle() /* VkHandle */ ,
		event.getNativeHandle() /* VkHandle */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */  );

   } 

   /**
    *  Native interface for Vulkan method #44
    *  vkDestroyEvent 
    * 
    * @param device - 
    * @param event - 
    * @param pAllocator - 
    */
    private static native void vkDestroyEvent0(
		long   device,
		long   event,
		ByteBuffer   pAllocator);/* 
	vkDestroyEvent(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkEvent) reinterpret_cast<VkEvent>(event),
			(const VkAllocationCallbacks*) pAllocator);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 45
    * <h2>Prototype</h2><pre>
    *  VkResult  vkGetEventStatus(
    *     VkDevice                                    device,
    *     VkEvent                                     event);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param event - Vulkan handle of type VkEvent 
    * 
    * @return VkResult
    */
   public static VkResult vkGetEventStatus(
		VkDevice device,
		VkEvent event) {

	 int  _val = vkGetEventStatus0(
			device.getNativeHandle() /* VkHandle */ ,
			event.getNativeHandle() /* VkHandle */  );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #45
    *  vkGetEventStatus 
    * 
    * @param device - 
    * @param event - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkGetEventStatus0(
		long   device,
		long   event);/* 
	VkResult res = vkGetEventStatus(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkEvent) reinterpret_cast<VkEvent>(event));
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 46
    * <h2>Prototype</h2><pre>
    *  VkResult  vkSetEvent(
    *     VkDevice                                    device,
    *     VkEvent                                     event);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param event - Vulkan handle of type VkEvent 
    * 
    * @return VkResult
    */
   public static VkResult vkSetEvent(
		VkDevice device,
		VkEvent event) {

	 int  _val = vkSetEvent0(
			device.getNativeHandle() /* VkHandle */ ,
			event.getNativeHandle() /* VkHandle */  );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #46
    *  vkSetEvent 
    * 
    * @param device - 
    * @param event - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkSetEvent0(
		long   device,
		long   event);/* 
	VkResult res = vkSetEvent(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkEvent) reinterpret_cast<VkEvent>(event));
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 47
    * <h2>Prototype</h2><pre>
    *  VkResult  vkResetEvent(
    *     VkDevice                                    device,
    *     VkEvent                                     event);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param event - Vulkan handle of type VkEvent 
    * 
    * @return VkResult
    */
   public static VkResult vkResetEvent(
		VkDevice device,
		VkEvent event) {

	 int  _val = vkResetEvent0(
			device.getNativeHandle() /* VkHandle */ ,
			event.getNativeHandle() /* VkHandle */  );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #47
    *  vkResetEvent 
    * 
    * @param device - 
    * @param event - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkResetEvent0(
		long   device,
		long   event);/* 
	VkResult res = vkResetEvent(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkEvent) reinterpret_cast<VkEvent>(event));
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 48
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateQueryPool(
    *     VkDevice                                    device,
    *     const VkQueryPoolCreateInfo*                pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkQueryPool*                                pQueryPool);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pCreateInfo - Vulkan Struct of type  final VkQueryPoolCreateInfo 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pQueryPool - An array of  VkQueryPool . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateQueryPool(
		VkDevice device,
		final VkQueryPoolCreateInfo pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkQueryPool[] pQueryPool) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkQueryPool> pQueryPoolBuffer =
			 new BigBuffer<VkQueryPool>(pQueryPool, false);
	 int  _val = vkCreateQueryPool0(
			device.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pQueryPoolBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pQueryPoolBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #48
    *  vkCreateQueryPool 
    * 
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pQueryPool - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateQueryPool0(
		long   device,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pQueryPool);/* 
	VkResult res = vkCreateQueryPool(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkQueryPoolCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkQueryPool*) pQueryPool);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 49
    * <h2>Prototype</h2><pre>
    *  void  vkDestroyQueryPool(
    *     VkDevice                                    device,
    *     VkQueryPool                                 queryPool,
    *     const VkAllocationCallbacks*                pAllocator);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param queryPool - Vulkan handle of type VkQueryPool 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    */
   public static void vkDestroyQueryPool(
		VkDevice device,
		VkQueryPool queryPool,
		final VkAllocationCallbacks pAllocator) {

	 vkDestroyQueryPool0(
		device.getNativeHandle() /* VkHandle */ ,
		queryPool.getNativeHandle() /* VkHandle */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */  );

   } 

   /**
    *  Native interface for Vulkan method #49
    *  vkDestroyQueryPool 
    * 
    * @param device - 
    * @param queryPool - 
    * @param pAllocator - 
    */
    private static native void vkDestroyQueryPool0(
		long   device,
		long   queryPool,
		ByteBuffer   pAllocator);/* 
	vkDestroyQueryPool(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkQueryPool) reinterpret_cast<VkQueryPool>(queryPool),
			(const VkAllocationCallbacks*) pAllocator);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 50
    * <h2>Prototype</h2><pre>
    *  VkResult  vkGetQueryPoolResults(
    *     VkDevice                                    device,
    *     VkQueryPool                                 queryPool,
    *     uint32_t                                    firstQuery,
    *     uint32_t                                    queryCount,
    *     size_t                                      dataSize,
    *     void*                                       pData,
    *     VkDeviceSize                                stride,
    *     VkQueryResultFlags                          flags);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param queryPool - Vulkan handle of type VkQueryPool 
    * @param firstQuery int 
    * @param queryCount - The length of array dataSize. 
    * @param dataSize long 
    * @param pData java.nio.Buffer 
    * @param stride long 
    * @param flags int 
    * 
    * @return VkResult
    */
   public static VkResult vkGetQueryPoolResults(
		VkDevice device,
		VkQueryPool queryPool,
		int firstQuery,
		int queryCount,
		long dataSize,
		java.nio.Buffer pData,
		long stride,
		int flags) {

	 int  _val = vkGetQueryPoolResults0(
			device.getNativeHandle() /* VkHandle */ ,
			queryPool.getNativeHandle() /* VkHandle */ ,
			firstQuery ,
			queryCount ,
			dataSize ,
			pData ,
			stride ,
			flags  );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #50
    *  vkGetQueryPoolResults 
    * 
    * @param device - 
    * @param queryPool - 
    * @param firstQuery - 
    * @param queryCount - 
    * @param dataSize - 
    * @param pData - 
    * @param stride - 
    * @param flags - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkGetQueryPoolResults0(
		long   device,
		long   queryPool,
		int  firstQuery,
		int  queryCount,
		long  dataSize,
		java.nio.Buffer  pData,
		long  stride,
		int  flags);/* 
	VkResult res = vkGetQueryPoolResults(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkQueryPool) reinterpret_cast<VkQueryPool>(queryPool),
			(uint32_t) firstQuery,
			(uint32_t) queryCount,
			(size_t) dataSize,
			(void*) pData,
			(VkDeviceSize) stride,
			(VkQueryResultFlags) flags);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 51
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateBuffer(
    *     VkDevice                                    device,
    *     const VkBufferCreateInfo*                   pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkBuffer*                                   pBuffer);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pCreateInfo - Vulkan Struct of type  final VkBufferCreateInfo 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pBuffer - An array of  VkBuffer . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateBuffer(
		VkDevice device,
		final VkBufferCreateInfo pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkBuffer[] pBuffer) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkBuffer> pBufferBuffer =
			 new BigBuffer<VkBuffer>(pBuffer, false);
	 int  _val = vkCreateBuffer0(
			device.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pBufferBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pBufferBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #51
    *  vkCreateBuffer 
    * 
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pBuffer - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateBuffer0(
		long   device,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pBuffer);/* 
	VkResult res = vkCreateBuffer(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkBufferCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkBuffer*) pBuffer);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 52
    * <h2>Prototype</h2><pre>
    *  void  vkDestroyBuffer(
    *     VkDevice                                    device,
    *     VkBuffer                                    buffer,
    *     const VkAllocationCallbacks*                pAllocator);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param buffer - Vulkan handle of type VkBuffer 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    */
   public static void vkDestroyBuffer(
		VkDevice device,
		VkBuffer buffer,
		final VkAllocationCallbacks pAllocator) {

	 vkDestroyBuffer0(
		device.getNativeHandle() /* VkHandle */ ,
		buffer.getNativeHandle() /* VkHandle */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */  );

   } 

   /**
    *  Native interface for Vulkan method #52
    *  vkDestroyBuffer 
    * 
    * @param device - 
    * @param buffer - 
    * @param pAllocator - 
    */
    private static native void vkDestroyBuffer0(
		long   device,
		long   buffer,
		ByteBuffer   pAllocator);/* 
	vkDestroyBuffer(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkBuffer) reinterpret_cast<VkBuffer>(buffer),
			(const VkAllocationCallbacks*) pAllocator);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 53
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateBufferView(
    *     VkDevice                                    device,
    *     const VkBufferViewCreateInfo*               pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkBufferView*                               pView);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pCreateInfo - Vulkan Struct of type  final VkBufferViewCreateInfo 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pView - An array of  VkBufferView . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateBufferView(
		VkDevice device,
		final VkBufferViewCreateInfo pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkBufferView[] pView) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkBufferView> pViewBuffer =
			 new BigBuffer<VkBufferView>(pView, false);
	 int  _val = vkCreateBufferView0(
			device.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pViewBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pViewBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #53
    *  vkCreateBufferView 
    * 
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pView - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateBufferView0(
		long   device,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pView);/* 
	VkResult res = vkCreateBufferView(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkBufferViewCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkBufferView*) pView);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 54
    * <h2>Prototype</h2><pre>
    *  void  vkDestroyBufferView(
    *     VkDevice                                    device,
    *     VkBufferView                                bufferView,
    *     const VkAllocationCallbacks*                pAllocator);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param bufferView - Vulkan handle of type VkBufferView 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    */
   public static void vkDestroyBufferView(
		VkDevice device,
		VkBufferView bufferView,
		final VkAllocationCallbacks pAllocator) {

	 vkDestroyBufferView0(
		device.getNativeHandle() /* VkHandle */ ,
		bufferView.getNativeHandle() /* VkHandle */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */  );

   } 

   /**
    *  Native interface for Vulkan method #54
    *  vkDestroyBufferView 
    * 
    * @param device - 
    * @param bufferView - 
    * @param pAllocator - 
    */
    private static native void vkDestroyBufferView0(
		long   device,
		long   bufferView,
		ByteBuffer   pAllocator);/* 
	vkDestroyBufferView(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkBufferView) reinterpret_cast<VkBufferView>(bufferView),
			(const VkAllocationCallbacks*) pAllocator);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 55
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateImage(
    *     VkDevice                                    device,
    *     const VkImageCreateInfo*                    pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkImage*                                    pImage);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pCreateInfo - Vulkan Struct of type  final VkImageCreateInfo 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pImage - An array of  VkImage . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateImage(
		VkDevice device,
		final VkImageCreateInfo pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkImage[] pImage) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkImage> pImageBuffer =
			 new BigBuffer<VkImage>(pImage, false);
	 int  _val = vkCreateImage0(
			device.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pImageBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pImageBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #55
    *  vkCreateImage 
    * 
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pImage - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateImage0(
		long   device,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pImage);/* 
	VkResult res = vkCreateImage(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkImageCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkImage*) pImage);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 56
    * <h2>Prototype</h2><pre>
    *  void  vkDestroyImage(
    *     VkDevice                                    device,
    *     VkImage                                     image,
    *     const VkAllocationCallbacks*                pAllocator);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param image - Vulkan handle of type VkImage 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    */
   public static void vkDestroyImage(
		VkDevice device,
		VkImage image,
		final VkAllocationCallbacks pAllocator) {

	 vkDestroyImage0(
		device.getNativeHandle() /* VkHandle */ ,
		image.getNativeHandle() /* VkHandle */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */  );

   } 

   /**
    *  Native interface for Vulkan method #56
    *  vkDestroyImage 
    * 
    * @param device - 
    * @param image - 
    * @param pAllocator - 
    */
    private static native void vkDestroyImage0(
		long   device,
		long   image,
		ByteBuffer   pAllocator);/* 
	vkDestroyImage(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkImage) reinterpret_cast<VkImage>(image),
			(const VkAllocationCallbacks*) pAllocator);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 57
    * <h2>Prototype</h2><pre>
    *  void  vkGetImageSubresourceLayout(
    *     VkDevice                                    device,
    *     VkImage                                     image,
    *     const VkImageSubresource*                   pSubresource,
    *     VkSubresourceLayout*                        pLayout);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param image - Vulkan handle of type VkImage 
    * @param pSubresource - Vulkan Struct of type  final VkImageSubresource 
    * @param pLayout - Vulkan Struct of type  VkSubresourceLayout  
    */
   public static void vkGetImageSubresourceLayout(
		VkDevice device,
		VkImage image,
		final VkImageSubresource pSubresource,
		VkSubresourceLayout pLayout) {

	 vkGetImageSubresourceLayout0(
		device.getNativeHandle() /* VkHandle */ ,
		image.getNativeHandle() /* VkHandle */ ,
		pSubresource.getPointer() /* Struct */,
		pLayout.getPointer() /* Struct */ );

   } 

   /**
    *  Native interface for Vulkan method #57
    *  vkGetImageSubresourceLayout 
    * 
    * @param device - 
    * @param image - 
    * @param pSubresource - 
    * @param pLayout - 
    */
    private static native void vkGetImageSubresourceLayout0(
		long   device,
		long   image,
		ByteBuffer   pSubresource,
		ByteBuffer   pLayout);/* 
	vkGetImageSubresourceLayout(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkImage) reinterpret_cast<VkImage>(image),
			(const VkImageSubresource*) pSubresource,
			(VkSubresourceLayout*) pLayout);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 58
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateImageView(
    *     VkDevice                                    device,
    *     const VkImageViewCreateInfo*                pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkImageView*                                pView);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pCreateInfo - Vulkan Struct of type  final VkImageViewCreateInfo 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pView - An array of  VkImageView . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateImageView(
		VkDevice device,
		final VkImageViewCreateInfo pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkImageView[] pView) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkImageView> pViewBuffer =
			 new BigBuffer<VkImageView>(pView, false);
	 int  _val = vkCreateImageView0(
			device.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pViewBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pViewBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #58
    *  vkCreateImageView 
    * 
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pView - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateImageView0(
		long   device,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pView);/* 
	VkResult res = vkCreateImageView(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkImageViewCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkImageView*) pView);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 59
    * <h2>Prototype</h2><pre>
    *  void  vkDestroyImageView(
    *     VkDevice                                    device,
    *     VkImageView                                 imageView,
    *     const VkAllocationCallbacks*                pAllocator);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param imageView - Vulkan handle of type VkImageView 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    */
   public static void vkDestroyImageView(
		VkDevice device,
		VkImageView imageView,
		final VkAllocationCallbacks pAllocator) {

	 vkDestroyImageView0(
		device.getNativeHandle() /* VkHandle */ ,
		imageView.getNativeHandle() /* VkHandle */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */  );

   } 

   /**
    *  Native interface for Vulkan method #59
    *  vkDestroyImageView 
    * 
    * @param device - 
    * @param imageView - 
    * @param pAllocator - 
    */
    private static native void vkDestroyImageView0(
		long   device,
		long   imageView,
		ByteBuffer   pAllocator);/* 
	vkDestroyImageView(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkImageView) reinterpret_cast<VkImageView>(imageView),
			(const VkAllocationCallbacks*) pAllocator);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 60
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateShaderModule(
    *     VkDevice                                    device,
    *     const VkShaderModuleCreateInfo*             pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkShaderModule*                             pShaderModule);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pCreateInfo - Vulkan Struct of type  final VkShaderModuleCreateInfo 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pShaderModule - An array of  VkShaderModule . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateShaderModule(
		VkDevice device,
		final VkShaderModuleCreateInfo pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkShaderModule[] pShaderModule) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkShaderModule> pShaderModuleBuffer =
			 new BigBuffer<VkShaderModule>(pShaderModule, false);
	 int  _val = vkCreateShaderModule0(
			device.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pShaderModuleBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pShaderModuleBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #60
    *  vkCreateShaderModule 
    * 
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pShaderModule - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateShaderModule0(
		long   device,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pShaderModule);/* 
	VkResult res = vkCreateShaderModule(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkShaderModuleCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkShaderModule*) pShaderModule);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 61
    * <h2>Prototype</h2><pre>
    *  void  vkDestroyShaderModule(
    *     VkDevice                                    device,
    *     VkShaderModule                              shaderModule,
    *     const VkAllocationCallbacks*                pAllocator);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param shaderModule - Vulkan handle of type VkShaderModule 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    */
   public static void vkDestroyShaderModule(
		VkDevice device,
		VkShaderModule shaderModule,
		final VkAllocationCallbacks pAllocator) {

	 vkDestroyShaderModule0(
		device.getNativeHandle() /* VkHandle */ ,
		shaderModule.getNativeHandle() /* VkHandle */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */  );

   } 

   /**
    *  Native interface for Vulkan method #61
    *  vkDestroyShaderModule 
    * 
    * @param device - 
    * @param shaderModule - 
    * @param pAllocator - 
    */
    private static native void vkDestroyShaderModule0(
		long   device,
		long   shaderModule,
		ByteBuffer   pAllocator);/* 
	vkDestroyShaderModule(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkShaderModule) reinterpret_cast<VkShaderModule>(shaderModule),
			(const VkAllocationCallbacks*) pAllocator);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 62
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreatePipelineCache(
    *     VkDevice                                    device,
    *     const VkPipelineCacheCreateInfo*            pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkPipelineCache*                            pPipelineCache);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pCreateInfo - Vulkan Struct of type  final VkPipelineCacheCreateInfo 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pPipelineCache - An array of  VkPipelineCache . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreatePipelineCache(
		VkDevice device,
		final VkPipelineCacheCreateInfo pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkPipelineCache[] pPipelineCache) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkPipelineCache> pPipelineCacheBuffer =
			 new BigBuffer<VkPipelineCache>(pPipelineCache, false);
	 int  _val = vkCreatePipelineCache0(
			device.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pPipelineCacheBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pPipelineCacheBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #62
    *  vkCreatePipelineCache 
    * 
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pPipelineCache - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreatePipelineCache0(
		long   device,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pPipelineCache);/* 
	VkResult res = vkCreatePipelineCache(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkPipelineCacheCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkPipelineCache*) pPipelineCache);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 63
    * <h2>Prototype</h2><pre>
    *  void  vkDestroyPipelineCache(
    *     VkDevice                                    device,
    *     VkPipelineCache                             pipelineCache,
    *     const VkAllocationCallbacks*                pAllocator);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pipelineCache - Vulkan handle of type VkPipelineCache 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    */
   public static void vkDestroyPipelineCache(
		VkDevice device,
		VkPipelineCache pipelineCache,
		final VkAllocationCallbacks pAllocator) {

	 vkDestroyPipelineCache0(
		device.getNativeHandle() /* VkHandle */ ,
		pipelineCache.getNativeHandle() /* VkHandle */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */  );

   } 

   /**
    *  Native interface for Vulkan method #63
    *  vkDestroyPipelineCache 
    * 
    * @param device - 
    * @param pipelineCache - 
    * @param pAllocator - 
    */
    private static native void vkDestroyPipelineCache0(
		long   device,
		long   pipelineCache,
		ByteBuffer   pAllocator);/* 
	vkDestroyPipelineCache(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkPipelineCache) reinterpret_cast<VkPipelineCache>(pipelineCache),
			(const VkAllocationCallbacks*) pAllocator);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 64
    * <h2>Prototype</h2><pre>
    *  VkResult  vkGetPipelineCacheData(
    *     VkDevice                                    device,
    *     VkPipelineCache                             pipelineCache,
    *     size_t*                                     pDataSize,
    *     void*                                       pData);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pipelineCache - Vulkan handle of type VkPipelineCache 
    * @param pDataSize - An array of long. 
    * @param pData java.nio.Buffer 
    * 
    * @return VkResult
    */
   public static VkResult vkGetPipelineCacheData(
		VkDevice device,
		VkPipelineCache pipelineCache,
		long[] pDataSize,
		java.nio.Buffer pData) {

	 int  _val = vkGetPipelineCacheData0(
			device.getNativeHandle() /* VkHandle */ ,
			pipelineCache.getNativeHandle() /* VkHandle */ ,
			pDataSize ,
			pData  );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #64
    *  vkGetPipelineCacheData 
    * 
    * @param device - 
    * @param pipelineCache - 
    * @param pDataSize - 
    * @param pData - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkGetPipelineCacheData0(
		long   device,
		long   pipelineCache,
		long[]  pDataSize,
		java.nio.Buffer  pData);/* 
	VkResult res = vkGetPipelineCacheData(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkPipelineCache) reinterpret_cast<VkPipelineCache>(pipelineCache),
			(size_t*) pDataSize,
			(void*) pData);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 65
    * <h2>Prototype</h2><pre>
    *  VkResult  vkMergePipelineCaches(
    *     VkDevice                                    device,
    *     VkPipelineCache                             dstCache,
    *     uint32_t                                    srcCacheCount,
    *     const VkPipelineCache*                      pSrcCaches);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param dstCache - Vulkan handle of type VkPipelineCache 
    * @param srcCacheCount - The length of array pSrcCaches. 
    * @param pSrcCaches - An array of  final VkPipelineCache . 
    * 
    * @return VkResult
    */
   public static VkResult vkMergePipelineCaches(
		VkDevice device,
		VkPipelineCache dstCache,
		int srcCacheCount,
		final VkPipelineCache[] pSrcCaches) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkPipelineCache> pSrcCachesBuffer =
			 new BigBuffer<VkPipelineCache>(pSrcCaches, false);
	 int  _val = vkMergePipelineCaches0(
			device.getNativeHandle() /* VkHandle */ ,
			dstCache.getNativeHandle() /* VkHandle */ ,
			srcCacheCount ,
			pSrcCachesBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pSrcCachesBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #65
    *  vkMergePipelineCaches 
    * 
    * @param device - 
    * @param dstCache - 
    * @param srcCacheCount - 
    * @param pSrcCaches - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkMergePipelineCaches0(
		long   device,
		long   dstCache,
		int  srcCacheCount,
		ByteBuffer   pSrcCaches);/* 
	VkResult res = vkMergePipelineCaches(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkPipelineCache) reinterpret_cast<VkPipelineCache>(dstCache),
			(uint32_t) srcCacheCount,
			(const VkPipelineCache*) pSrcCaches);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 66
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateGraphicsPipelines(
    *     VkDevice                                    device,
    *     VkPipelineCache                             pipelineCache,
    *     uint32_t                                    createInfoCount,
    *     const VkGraphicsPipelineCreateInfo*         pCreateInfos,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkPipeline*                                 pPipelines);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pipelineCache - Vulkan handle of type VkPipelineCache 
    * @param createInfoCount - The length of array pCreateInfos. 
    * @param pCreateInfos - An array of  final VkGraphicsPipelineCreateInfo . 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pPipelines - An array of  VkPipeline . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateGraphicsPipelines(
		VkDevice device,
		VkPipelineCache pipelineCache,
		int createInfoCount,
		final VkGraphicsPipelineCreateInfo[] pCreateInfos,
		final VkAllocationCallbacks pAllocator,
		VkPipeline[] pPipelines) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkGraphicsPipelineCreateInfo> pCreateInfosBuff =
			 new BigBuffer<VkGraphicsPipelineCreateInfo>(pCreateInfos, VkGraphicsPipelineCreateInfo.getID());
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkPipeline> pPipelinesBuffer =
			 new BigBuffer<VkPipeline>(pPipelines, false);
	 int  _val = vkCreateGraphicsPipelines0(
			device.getNativeHandle() /* VkHandle */ ,
			pipelineCache.getNativeHandle() /* VkHandle */ ,
			createInfoCount ,
			pCreateInfosBuff.getPointer() /*Buffer for Struct[]*/,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pPipelinesBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pPipelinesBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #66
    *  vkCreateGraphicsPipelines 
    * 
    * @param device - 
    * @param pipelineCache - 
    * @param createInfoCount - 
    * @param pCreateInfos - 
    * @param pAllocator - 
    * @param pPipelines - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateGraphicsPipelines0(
		long   device,
		long   pipelineCache,
		int  createInfoCount,
		ByteBuffer   pCreateInfos,
		ByteBuffer   pAllocator,
		ByteBuffer   pPipelines);/* 
	VkResult res = vkCreateGraphicsPipelines(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkPipelineCache) reinterpret_cast<VkPipelineCache>(pipelineCache),
			(uint32_t) createInfoCount,
			(const VkGraphicsPipelineCreateInfo*) pCreateInfos,
			(const VkAllocationCallbacks*) pAllocator,
			(VkPipeline*) pPipelines);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 67
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateComputePipelines(
    *     VkDevice                                    device,
    *     VkPipelineCache                             pipelineCache,
    *     uint32_t                                    createInfoCount,
    *     const VkComputePipelineCreateInfo*          pCreateInfos,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkPipeline*                                 pPipelines);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pipelineCache - Vulkan handle of type VkPipelineCache 
    * @param createInfoCount - The length of array pCreateInfos. 
    * @param pCreateInfos - An array of  final VkComputePipelineCreateInfo . 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pPipelines - An array of  VkPipeline . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateComputePipelines(
		VkDevice device,
		VkPipelineCache pipelineCache,
		int createInfoCount,
		final VkComputePipelineCreateInfo[] pCreateInfos,
		final VkAllocationCallbacks pAllocator,
		VkPipeline[] pPipelines) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkComputePipelineCreateInfo> pCreateInfosBuff =
			 new BigBuffer<VkComputePipelineCreateInfo>(pCreateInfos, VkComputePipelineCreateInfo.getID());
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkPipeline> pPipelinesBuffer =
			 new BigBuffer<VkPipeline>(pPipelines, false);
	 int  _val = vkCreateComputePipelines0(
			device.getNativeHandle() /* VkHandle */ ,
			pipelineCache.getNativeHandle() /* VkHandle */ ,
			createInfoCount ,
			pCreateInfosBuff.getPointer() /*Buffer for Struct[]*/,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pPipelinesBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pPipelinesBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #67
    *  vkCreateComputePipelines 
    * 
    * @param device - 
    * @param pipelineCache - 
    * @param createInfoCount - 
    * @param pCreateInfos - 
    * @param pAllocator - 
    * @param pPipelines - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateComputePipelines0(
		long   device,
		long   pipelineCache,
		int  createInfoCount,
		ByteBuffer   pCreateInfos,
		ByteBuffer   pAllocator,
		ByteBuffer   pPipelines);/* 
	VkResult res = vkCreateComputePipelines(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkPipelineCache) reinterpret_cast<VkPipelineCache>(pipelineCache),
			(uint32_t) createInfoCount,
			(const VkComputePipelineCreateInfo*) pCreateInfos,
			(const VkAllocationCallbacks*) pAllocator,
			(VkPipeline*) pPipelines);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 68
    * <h2>Prototype</h2><pre>
    *  void  vkDestroyPipeline(
    *     VkDevice                                    device,
    *     VkPipeline                                  pipeline,
    *     const VkAllocationCallbacks*                pAllocator);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pipeline - Vulkan handle of type VkPipeline 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    */
   public static void vkDestroyPipeline(
		VkDevice device,
		VkPipeline pipeline,
		final VkAllocationCallbacks pAllocator) {

	 vkDestroyPipeline0(
		device.getNativeHandle() /* VkHandle */ ,
		pipeline.getNativeHandle() /* VkHandle */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */  );

   } 

   /**
    *  Native interface for Vulkan method #68
    *  vkDestroyPipeline 
    * 
    * @param device - 
    * @param pipeline - 
    * @param pAllocator - 
    */
    private static native void vkDestroyPipeline0(
		long   device,
		long   pipeline,
		ByteBuffer   pAllocator);/* 
	vkDestroyPipeline(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkPipeline) reinterpret_cast<VkPipeline>(pipeline),
			(const VkAllocationCallbacks*) pAllocator);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 69
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreatePipelineLayout(
    *     VkDevice                                    device,
    *     const VkPipelineLayoutCreateInfo*           pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkPipelineLayout*                           pPipelineLayout);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pCreateInfo - Vulkan Struct of type  final VkPipelineLayoutCreateInfo 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pPipelineLayout - An array of  VkPipelineLayout . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreatePipelineLayout(
		VkDevice device,
		final VkPipelineLayoutCreateInfo pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkPipelineLayout[] pPipelineLayout) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkPipelineLayout> pPipelineLayoutBuffer =
			 new BigBuffer<VkPipelineLayout>(pPipelineLayout, false);
	 int  _val = vkCreatePipelineLayout0(
			device.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pPipelineLayoutBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pPipelineLayoutBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #69
    *  vkCreatePipelineLayout 
    * 
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pPipelineLayout - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreatePipelineLayout0(
		long   device,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pPipelineLayout);/* 
	VkResult res = vkCreatePipelineLayout(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkPipelineLayoutCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkPipelineLayout*) pPipelineLayout);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 70
    * <h2>Prototype</h2><pre>
    *  void  vkDestroyPipelineLayout(
    *     VkDevice                                    device,
    *     VkPipelineLayout                            pipelineLayout,
    *     const VkAllocationCallbacks*                pAllocator);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pipelineLayout - Vulkan handle of type VkPipelineLayout 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    */
   public static void vkDestroyPipelineLayout(
		VkDevice device,
		VkPipelineLayout pipelineLayout,
		final VkAllocationCallbacks pAllocator) {

	 vkDestroyPipelineLayout0(
		device.getNativeHandle() /* VkHandle */ ,
		pipelineLayout.getNativeHandle() /* VkHandle */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */  );

   } 

   /**
    *  Native interface for Vulkan method #70
    *  vkDestroyPipelineLayout 
    * 
    * @param device - 
    * @param pipelineLayout - 
    * @param pAllocator - 
    */
    private static native void vkDestroyPipelineLayout0(
		long   device,
		long   pipelineLayout,
		ByteBuffer   pAllocator);/* 
	vkDestroyPipelineLayout(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkPipelineLayout) reinterpret_cast<VkPipelineLayout>(pipelineLayout),
			(const VkAllocationCallbacks*) pAllocator);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 71
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateSampler(
    *     VkDevice                                    device,
    *     const VkSamplerCreateInfo*                  pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkSampler*                                  pSampler);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pCreateInfo - Vulkan Struct of type  final VkSamplerCreateInfo 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pSampler - An array of  VkSampler . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateSampler(
		VkDevice device,
		final VkSamplerCreateInfo pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkSampler[] pSampler) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkSampler> pSamplerBuffer =
			 new BigBuffer<VkSampler>(pSampler, false);
	 int  _val = vkCreateSampler0(
			device.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pSamplerBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pSamplerBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #71
    *  vkCreateSampler 
    * 
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pSampler - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateSampler0(
		long   device,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pSampler);/* 
	VkResult res = vkCreateSampler(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkSamplerCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSampler*) pSampler);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 72
    * <h2>Prototype</h2><pre>
    *  void  vkDestroySampler(
    *     VkDevice                                    device,
    *     VkSampler                                   sampler,
    *     const VkAllocationCallbacks*                pAllocator);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param sampler - Vulkan handle of type VkSampler 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    */
   public static void vkDestroySampler(
		VkDevice device,
		VkSampler sampler,
		final VkAllocationCallbacks pAllocator) {

	 vkDestroySampler0(
		device.getNativeHandle() /* VkHandle */ ,
		sampler.getNativeHandle() /* VkHandle */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */  );

   } 

   /**
    *  Native interface for Vulkan method #72
    *  vkDestroySampler 
    * 
    * @param device - 
    * @param sampler - 
    * @param pAllocator - 
    */
    private static native void vkDestroySampler0(
		long   device,
		long   sampler,
		ByteBuffer   pAllocator);/* 
	vkDestroySampler(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkSampler) reinterpret_cast<VkSampler>(sampler),
			(const VkAllocationCallbacks*) pAllocator);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 73
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateDescriptorSetLayout(
    *     VkDevice                                    device,
    *     const VkDescriptorSetLayoutCreateInfo*      pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkDescriptorSetLayout*                      pSetLayout);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pCreateInfo - Vulkan Struct of type  final VkDescriptorSetLayoutCreateInfo 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pSetLayout - An array of  VkDescriptorSetLayout . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateDescriptorSetLayout(
		VkDevice device,
		final VkDescriptorSetLayoutCreateInfo pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkDescriptorSetLayout[] pSetLayout) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkDescriptorSetLayout> pSetLayoutBuffer =
			 new BigBuffer<VkDescriptorSetLayout>(pSetLayout, false);
	 int  _val = vkCreateDescriptorSetLayout0(
			device.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pSetLayoutBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pSetLayoutBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #73
    *  vkCreateDescriptorSetLayout 
    * 
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pSetLayout - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateDescriptorSetLayout0(
		long   device,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pSetLayout);/* 
	VkResult res = vkCreateDescriptorSetLayout(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkDescriptorSetLayoutCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkDescriptorSetLayout*) pSetLayout);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 74
    * <h2>Prototype</h2><pre>
    *  void  vkDestroyDescriptorSetLayout(
    *     VkDevice                                    device,
    *     VkDescriptorSetLayout                       descriptorSetLayout,
    *     const VkAllocationCallbacks*                pAllocator);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param descriptorSetLayout - Vulkan handle of type VkDescriptorSetLayout 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    */
   public static void vkDestroyDescriptorSetLayout(
		VkDevice device,
		VkDescriptorSetLayout descriptorSetLayout,
		final VkAllocationCallbacks pAllocator) {

	 vkDestroyDescriptorSetLayout0(
		device.getNativeHandle() /* VkHandle */ ,
		descriptorSetLayout.getNativeHandle() /* VkHandle */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */  );

   } 

   /**
    *  Native interface for Vulkan method #74
    *  vkDestroyDescriptorSetLayout 
    * 
    * @param device - 
    * @param descriptorSetLayout - 
    * @param pAllocator - 
    */
    private static native void vkDestroyDescriptorSetLayout0(
		long   device,
		long   descriptorSetLayout,
		ByteBuffer   pAllocator);/* 
	vkDestroyDescriptorSetLayout(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkDescriptorSetLayout) reinterpret_cast<VkDescriptorSetLayout>(descriptorSetLayout),
			(const VkAllocationCallbacks*) pAllocator);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 75
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateDescriptorPool(
    *     VkDevice                                    device,
    *     const VkDescriptorPoolCreateInfo*           pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkDescriptorPool*                           pDescriptorPool);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pCreateInfo - Vulkan Struct of type  final VkDescriptorPoolCreateInfo 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pDescriptorPool - An array of  VkDescriptorPool . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateDescriptorPool(
		VkDevice device,
		final VkDescriptorPoolCreateInfo pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkDescriptorPool[] pDescriptorPool) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkDescriptorPool> pDescriptorPoolBuffer =
			 new BigBuffer<VkDescriptorPool>(pDescriptorPool, false);
	 int  _val = vkCreateDescriptorPool0(
			device.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pDescriptorPoolBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pDescriptorPoolBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #75
    *  vkCreateDescriptorPool 
    * 
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pDescriptorPool - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateDescriptorPool0(
		long   device,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pDescriptorPool);/* 
	VkResult res = vkCreateDescriptorPool(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkDescriptorPoolCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkDescriptorPool*) pDescriptorPool);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 76
    * <h2>Prototype</h2><pre>
    *  void  vkDestroyDescriptorPool(
    *     VkDevice                                    device,
    *     VkDescriptorPool                            descriptorPool,
    *     const VkAllocationCallbacks*                pAllocator);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param descriptorPool - Vulkan handle of type VkDescriptorPool 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    */
   public static void vkDestroyDescriptorPool(
		VkDevice device,
		VkDescriptorPool descriptorPool,
		final VkAllocationCallbacks pAllocator) {

	 vkDestroyDescriptorPool0(
		device.getNativeHandle() /* VkHandle */ ,
		descriptorPool.getNativeHandle() /* VkHandle */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */  );

   } 

   /**
    *  Native interface for Vulkan method #76
    *  vkDestroyDescriptorPool 
    * 
    * @param device - 
    * @param descriptorPool - 
    * @param pAllocator - 
    */
    private static native void vkDestroyDescriptorPool0(
		long   device,
		long   descriptorPool,
		ByteBuffer   pAllocator);/* 
	vkDestroyDescriptorPool(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkDescriptorPool) reinterpret_cast<VkDescriptorPool>(descriptorPool),
			(const VkAllocationCallbacks*) pAllocator);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 77
    * <h2>Prototype</h2><pre>
    *  VkResult  vkResetDescriptorPool(
    *     VkDevice                                    device,
    *     VkDescriptorPool                            descriptorPool,
    *     VkDescriptorPoolResetFlags                  flags);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param descriptorPool - Vulkan handle of type VkDescriptorPool 
    * @param flags int 
    * 
    * @return VkResult
    */
   public static VkResult vkResetDescriptorPool(
		VkDevice device,
		VkDescriptorPool descriptorPool,
		int flags) {

	 int  _val = vkResetDescriptorPool0(
			device.getNativeHandle() /* VkHandle */ ,
			descriptorPool.getNativeHandle() /* VkHandle */ ,
			flags  );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #77
    *  vkResetDescriptorPool 
    * 
    * @param device - 
    * @param descriptorPool - 
    * @param flags - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkResetDescriptorPool0(
		long   device,
		long   descriptorPool,
		int  flags);/* 
	VkResult res = vkResetDescriptorPool(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkDescriptorPool) reinterpret_cast<VkDescriptorPool>(descriptorPool),
			(VkDescriptorPoolResetFlags) flags);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 78
    * <h2>Prototype</h2><pre>
    *  VkResult  vkAllocateDescriptorSets(
    *     VkDevice                                    device,
    *     const VkDescriptorSetAllocateInfo*          pAllocateInfo,
    *     VkDescriptorSet*                            pDescriptorSets);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pAllocateInfo - Vulkan Struct of type  final VkDescriptorSetAllocateInfo 
    * @param pDescriptorSets - Vulkan handle of type  VkDescriptorSet  
    * 
    * @return VkResult
    */
   public static VkResult vkAllocateDescriptorSets(
		VkDevice device,
		final VkDescriptorSetAllocateInfo pAllocateInfo,
		VkDescriptorSet pDescriptorSets) {

	 int  _val = vkAllocateDescriptorSets0(
			device.getNativeHandle() /* VkHandle */ ,
			pAllocateInfo.getPointer() /* Struct */,
			pDescriptorSets.getNativeHandle() /* VkHandle */  );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #78
    *  vkAllocateDescriptorSets 
    * 
    * @param device - 
    * @param pAllocateInfo - 
    * @param pDescriptorSets - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkAllocateDescriptorSets0(
		long   device,
		ByteBuffer   pAllocateInfo,
		long   pDescriptorSets);/* 
	VkResult res = vkAllocateDescriptorSets(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkDescriptorSetAllocateInfo*) pAllocateInfo,
			(VkDescriptorSet*) pDescriptorSets);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 79
    * <h2>Prototype</h2><pre>
    *  VkResult  vkFreeDescriptorSets(
    *     VkDevice                                    device,
    *     VkDescriptorPool                            descriptorPool,
    *     uint32_t                                    descriptorSetCount,
    *     const VkDescriptorSet*                      pDescriptorSets);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param descriptorPool - Vulkan handle of type VkDescriptorPool 
    * @param descriptorSetCount - The length of array pDescriptorSets. 
    * @param pDescriptorSets - An array of  final VkDescriptorSet . 
    * 
    * @return VkResult
    */
   public static VkResult vkFreeDescriptorSets(
		VkDevice device,
		VkDescriptorPool descriptorPool,
		int descriptorSetCount,
		final VkDescriptorSet[] pDescriptorSets) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkDescriptorSet> pDescriptorSetsBuffer =
			 new BigBuffer<VkDescriptorSet>(pDescriptorSets, false);
	 int  _val = vkFreeDescriptorSets0(
			device.getNativeHandle() /* VkHandle */ ,
			descriptorPool.getNativeHandle() /* VkHandle */ ,
			descriptorSetCount ,
			pDescriptorSetsBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pDescriptorSetsBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #79
    *  vkFreeDescriptorSets 
    * 
    * @param device - 
    * @param descriptorPool - 
    * @param descriptorSetCount - 
    * @param pDescriptorSets - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkFreeDescriptorSets0(
		long   device,
		long   descriptorPool,
		int  descriptorSetCount,
		ByteBuffer   pDescriptorSets);/* 
	VkResult res = vkFreeDescriptorSets(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkDescriptorPool) reinterpret_cast<VkDescriptorPool>(descriptorPool),
			(uint32_t) descriptorSetCount,
			(const VkDescriptorSet*) pDescriptorSets);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 80
    * <h2>Prototype</h2><pre>
    *  void  vkUpdateDescriptorSets(
    *     VkDevice                                    device,
    *     uint32_t                                    descriptorWriteCount,
    *     const VkWriteDescriptorSet*                 pDescriptorWrites,
    *     uint32_t                                    descriptorCopyCount,
    *     const VkCopyDescriptorSet*                  pDescriptorCopies);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param descriptorWriteCount - The length of array pDescriptorWrites. 
    * @param pDescriptorWrites - An array of  final VkWriteDescriptorSet . 
    * @param descriptorCopyCount - The length of array pDescriptorCopies. 
    * @param pDescriptorCopies - An array of  final VkCopyDescriptorSet . 
    */
   public static void vkUpdateDescriptorSets(
		VkDevice device,
		int descriptorWriteCount,
		final VkWriteDescriptorSet[] pDescriptorWrites,
		int descriptorCopyCount,
		final VkCopyDescriptorSet[] pDescriptorCopies) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkWriteDescriptorSet> pDescriptorWritesBuff =
			 new BigBuffer<VkWriteDescriptorSet>(pDescriptorWrites, VkWriteDescriptorSet.getID());
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkCopyDescriptorSet> pDescriptorCopiesBuff =
			 new BigBuffer<VkCopyDescriptorSet>(pDescriptorCopies, VkCopyDescriptorSet.getID());

	 vkUpdateDescriptorSets0(
		device.getNativeHandle() /* VkHandle */ ,
		descriptorWriteCount ,
		pDescriptorWritesBuff.getPointer() /*Buffer for Struct[]*/,
		descriptorCopyCount ,
		pDescriptorCopiesBuff.getPointer() /*Buffer for Struct[]*/ );

   } 

   /**
    *  Native interface for Vulkan method #80
    *  vkUpdateDescriptorSets 
    * 
    * @param device - 
    * @param descriptorWriteCount - 
    * @param pDescriptorWrites - 
    * @param descriptorCopyCount - 
    * @param pDescriptorCopies - 
    */
    private static native void vkUpdateDescriptorSets0(
		long   device,
		int  descriptorWriteCount,
		ByteBuffer   pDescriptorWrites,
		int  descriptorCopyCount,
		ByteBuffer   pDescriptorCopies);/* 
	vkUpdateDescriptorSets(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(uint32_t) descriptorWriteCount,
			(const VkWriteDescriptorSet*) pDescriptorWrites,
			(uint32_t) descriptorCopyCount,
			(const VkCopyDescriptorSet*) pDescriptorCopies);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 81
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateFramebuffer(
    *     VkDevice                                    device,
    *     const VkFramebufferCreateInfo*              pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkFramebuffer*                              pFramebuffer);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pCreateInfo - Vulkan Struct of type  final VkFramebufferCreateInfo 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pFramebuffer - An array of  VkFramebuffer . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateFramebuffer(
		VkDevice device,
		final VkFramebufferCreateInfo pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkFramebuffer[] pFramebuffer) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkFramebuffer> pFramebufferBuffer =
			 new BigBuffer<VkFramebuffer>(pFramebuffer, false);
	 int  _val = vkCreateFramebuffer0(
			device.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pFramebufferBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pFramebufferBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #81
    *  vkCreateFramebuffer 
    * 
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pFramebuffer - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateFramebuffer0(
		long   device,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pFramebuffer);/* 
	VkResult res = vkCreateFramebuffer(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkFramebufferCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkFramebuffer*) pFramebuffer);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 82
    * <h2>Prototype</h2><pre>
    *  void  vkDestroyFramebuffer(
    *     VkDevice                                    device,
    *     VkFramebuffer                               framebuffer,
    *     const VkAllocationCallbacks*                pAllocator);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param framebuffer - Vulkan handle of type VkFramebuffer 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    */
   public static void vkDestroyFramebuffer(
		VkDevice device,
		VkFramebuffer framebuffer,
		final VkAllocationCallbacks pAllocator) {

	 vkDestroyFramebuffer0(
		device.getNativeHandle() /* VkHandle */ ,
		framebuffer.getNativeHandle() /* VkHandle */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */  );

   } 

   /**
    *  Native interface for Vulkan method #82
    *  vkDestroyFramebuffer 
    * 
    * @param device - 
    * @param framebuffer - 
    * @param pAllocator - 
    */
    private static native void vkDestroyFramebuffer0(
		long   device,
		long   framebuffer,
		ByteBuffer   pAllocator);/* 
	vkDestroyFramebuffer(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkFramebuffer) reinterpret_cast<VkFramebuffer>(framebuffer),
			(const VkAllocationCallbacks*) pAllocator);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 83
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateRenderPass(
    *     VkDevice                                    device,
    *     const VkRenderPassCreateInfo*               pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkRenderPass*                               pRenderPass);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pCreateInfo - Vulkan Struct of type  final VkRenderPassCreateInfo 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pRenderPass - An array of  VkRenderPass . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateRenderPass(
		VkDevice device,
		final VkRenderPassCreateInfo pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkRenderPass[] pRenderPass) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkRenderPass> pRenderPassBuffer =
			 new BigBuffer<VkRenderPass>(pRenderPass, false);
	 int  _val = vkCreateRenderPass0(
			device.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pRenderPassBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pRenderPassBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #83
    *  vkCreateRenderPass 
    * 
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pRenderPass - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateRenderPass0(
		long   device,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pRenderPass);/* 
	VkResult res = vkCreateRenderPass(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkRenderPassCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkRenderPass*) pRenderPass);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 84
    * <h2>Prototype</h2><pre>
    *  void  vkDestroyRenderPass(
    *     VkDevice                                    device,
    *     VkRenderPass                                renderPass,
    *     const VkAllocationCallbacks*                pAllocator);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param renderPass - Vulkan handle of type VkRenderPass 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    */
   public static void vkDestroyRenderPass(
		VkDevice device,
		VkRenderPass renderPass,
		final VkAllocationCallbacks pAllocator) {

	 vkDestroyRenderPass0(
		device.getNativeHandle() /* VkHandle */ ,
		renderPass.getNativeHandle() /* VkHandle */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */  );

   } 

   /**
    *  Native interface for Vulkan method #84
    *  vkDestroyRenderPass 
    * 
    * @param device - 
    * @param renderPass - 
    * @param pAllocator - 
    */
    private static native void vkDestroyRenderPass0(
		long   device,
		long   renderPass,
		ByteBuffer   pAllocator);/* 
	vkDestroyRenderPass(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkRenderPass) reinterpret_cast<VkRenderPass>(renderPass),
			(const VkAllocationCallbacks*) pAllocator);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 85
    * <h2>Prototype</h2><pre>
    *  void  vkGetRenderAreaGranularity(
    *     VkDevice                                    device,
    *     VkRenderPass                                renderPass,
    *     VkExtent2D*                                 pGranularity);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param renderPass - Vulkan handle of type VkRenderPass 
    * @param pGranularity - Vulkan Struct of type  VkExtent2D  
    */
   public static void vkGetRenderAreaGranularity(
		VkDevice device,
		VkRenderPass renderPass,
		VkExtent2D pGranularity) {

	 vkGetRenderAreaGranularity0(
		device.getNativeHandle() /* VkHandle */ ,
		renderPass.getNativeHandle() /* VkHandle */ ,
		pGranularity.getPointer() /* Struct */ );

   } 

   /**
    *  Native interface for Vulkan method #85
    *  vkGetRenderAreaGranularity 
    * 
    * @param device - 
    * @param renderPass - 
    * @param pGranularity - 
    */
    private static native void vkGetRenderAreaGranularity0(
		long   device,
		long   renderPass,
		ByteBuffer   pGranularity);/* 
	vkGetRenderAreaGranularity(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkRenderPass) reinterpret_cast<VkRenderPass>(renderPass),
			(VkExtent2D*) pGranularity);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 86
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateCommandPool(
    *     VkDevice                                    device,
    *     const VkCommandPoolCreateInfo*              pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkCommandPool*                              pCommandPool);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pCreateInfo - Vulkan Struct of type  final VkCommandPoolCreateInfo 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pCommandPool - An array of  VkCommandPool . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateCommandPool(
		VkDevice device,
		final VkCommandPoolCreateInfo pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkCommandPool[] pCommandPool) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkCommandPool> pCommandPoolBuffer =
			 new BigBuffer<VkCommandPool>(pCommandPool, false);
	 int  _val = vkCreateCommandPool0(
			device.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pCommandPoolBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pCommandPoolBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #86
    *  vkCreateCommandPool 
    * 
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pCommandPool - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateCommandPool0(
		long   device,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pCommandPool);/* 
	VkResult res = vkCreateCommandPool(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkCommandPoolCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkCommandPool*) pCommandPool);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 87
    * <h2>Prototype</h2><pre>
    *  void  vkDestroyCommandPool(
    *     VkDevice                                    device,
    *     VkCommandPool                               commandPool,
    *     const VkAllocationCallbacks*                pAllocator);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param commandPool - Vulkan handle of type VkCommandPool 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    */
   public static void vkDestroyCommandPool(
		VkDevice device,
		VkCommandPool commandPool,
		final VkAllocationCallbacks pAllocator) {

	 vkDestroyCommandPool0(
		device.getNativeHandle() /* VkHandle */ ,
		commandPool.getNativeHandle() /* VkHandle */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */  );

   } 

   /**
    *  Native interface for Vulkan method #87
    *  vkDestroyCommandPool 
    * 
    * @param device - 
    * @param commandPool - 
    * @param pAllocator - 
    */
    private static native void vkDestroyCommandPool0(
		long   device,
		long   commandPool,
		ByteBuffer   pAllocator);/* 
	vkDestroyCommandPool(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkCommandPool) reinterpret_cast<VkCommandPool>(commandPool),
			(const VkAllocationCallbacks*) pAllocator);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 88
    * <h2>Prototype</h2><pre>
    *  VkResult  vkResetCommandPool(
    *     VkDevice                                    device,
    *     VkCommandPool                               commandPool,
    *     VkCommandPoolResetFlags                     flags);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param commandPool - Vulkan handle of type VkCommandPool 
    * @param flags int 
    * 
    * @return VkResult
    */
   public static VkResult vkResetCommandPool(
		VkDevice device,
		VkCommandPool commandPool,
		int flags) {

	 int  _val = vkResetCommandPool0(
			device.getNativeHandle() /* VkHandle */ ,
			commandPool.getNativeHandle() /* VkHandle */ ,
			flags  );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #88
    *  vkResetCommandPool 
    * 
    * @param device - 
    * @param commandPool - 
    * @param flags - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkResetCommandPool0(
		long   device,
		long   commandPool,
		int  flags);/* 
	VkResult res = vkResetCommandPool(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkCommandPool) reinterpret_cast<VkCommandPool>(commandPool),
			(VkCommandPoolResetFlags) flags);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 89
    * <h2>Prototype</h2><pre>
    *  VkResult  vkAllocateCommandBuffers(
    *     VkDevice                                    device,
    *     const VkCommandBufferAllocateInfo*          pAllocateInfo,
    *     VkCommandBuffer*                            pCommandBuffers);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pAllocateInfo - Vulkan Struct of type  final VkCommandBufferAllocateInfo 
    * @param pCommandBuffers - Vulkan handle of type  VkCommandBuffer  
    * 
    * @return VkResult
    */
   public static VkResult vkAllocateCommandBuffers(
		VkDevice device,
		final VkCommandBufferAllocateInfo pAllocateInfo,
		VkCommandBuffer pCommandBuffers) {

	 int  _val = vkAllocateCommandBuffers0(
			device.getNativeHandle() /* VkHandle */ ,
			pAllocateInfo.getPointer() /* Struct */,
			pCommandBuffers.getNativeHandle() /* VkHandle */  );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #89
    *  vkAllocateCommandBuffers 
    * 
    * @param device - 
    * @param pAllocateInfo - 
    * @param pCommandBuffers - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkAllocateCommandBuffers0(
		long   device,
		ByteBuffer   pAllocateInfo,
		long   pCommandBuffers);/* 
	VkResult res = vkAllocateCommandBuffers(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkCommandBufferAllocateInfo*) pAllocateInfo,
			(VkCommandBuffer*) pCommandBuffers);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 90
    * <h2>Prototype</h2><pre>
    *  void  vkFreeCommandBuffers(
    *     VkDevice                                    device,
    *     VkCommandPool                               commandPool,
    *     uint32_t                                    commandBufferCount,
    *     const VkCommandBuffer*                      pCommandBuffers);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param commandPool - Vulkan handle of type VkCommandPool 
    * @param commandBufferCount - The length of array pCommandBuffers. 
    * @param pCommandBuffers - An array of  final VkCommandBuffer . 
    */
   public static void vkFreeCommandBuffers(
		VkDevice device,
		VkCommandPool commandPool,
		int commandBufferCount,
		final VkCommandBuffer[] pCommandBuffers) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkCommandBuffer> pCommandBuffersBuffer =
			 new BigBuffer<VkCommandBuffer>(pCommandBuffers, true);
	 vkFreeCommandBuffers0(
		device.getNativeHandle() /* VkHandle */ ,
		commandPool.getNativeHandle() /* VkHandle */ ,
		commandBufferCount ,
		pCommandBuffersBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pCommandBuffersBuffer.update();

   } 

   /**
    *  Native interface for Vulkan method #90
    *  vkFreeCommandBuffers 
    * 
    * @param device - 
    * @param commandPool - 
    * @param commandBufferCount - 
    * @param pCommandBuffers - 
    */
    private static native void vkFreeCommandBuffers0(
		long   device,
		long   commandPool,
		int  commandBufferCount,
		ByteBuffer   pCommandBuffers);/* 
	vkFreeCommandBuffers(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkCommandPool) reinterpret_cast<VkCommandPool>(commandPool),
			(uint32_t) commandBufferCount,
			(const VkCommandBuffer*) pCommandBuffers);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 91
    * <h2>Prototype</h2><pre>
    *  VkResult  vkBeginCommandBuffer(
    *     VkCommandBuffer                             commandBuffer,
    *     const VkCommandBufferBeginInfo*             pBeginInfo);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param pBeginInfo - Vulkan Struct of type  final VkCommandBufferBeginInfo 
    * 
    * @return VkResult
    */
   public static VkResult vkBeginCommandBuffer(
		VkCommandBuffer commandBuffer,
		final VkCommandBufferBeginInfo pBeginInfo) {

	 int  _val = vkBeginCommandBuffer0(
			commandBuffer.getNativeHandle() /* VkHandle */ ,
			pBeginInfo.getPointer() /* Struct */ );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #91
    *  vkBeginCommandBuffer 
    * 
    * @param commandBuffer - 
    * @param pBeginInfo - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkBeginCommandBuffer0(
		long   commandBuffer,
		ByteBuffer   pBeginInfo);/* 
	VkResult res = vkBeginCommandBuffer(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(const VkCommandBufferBeginInfo*) pBeginInfo);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 92
    * <h2>Prototype</h2><pre>
    *  VkResult  vkEndCommandBuffer(
    *     VkCommandBuffer                             commandBuffer);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * 
    * @return VkResult
    */
   public static VkResult vkEndCommandBuffer(
		VkCommandBuffer commandBuffer) {

	 int  _val = vkEndCommandBuffer0(
			commandBuffer.getNativeHandle() /* VkHandle */  );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #92
    *  vkEndCommandBuffer 
    * 
    * @param commandBuffer - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkEndCommandBuffer0(
		long   commandBuffer);/* 
	VkResult res = vkEndCommandBuffer(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer));
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 93
    * <h2>Prototype</h2><pre>
    *  VkResult  vkResetCommandBuffer(
    *     VkCommandBuffer                             commandBuffer,
    *     VkCommandBufferResetFlags                   flags);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param flags int 
    * 
    * @return VkResult
    */
   public static VkResult vkResetCommandBuffer(
		VkCommandBuffer commandBuffer,
		int flags) {

	 int  _val = vkResetCommandBuffer0(
			commandBuffer.getNativeHandle() /* VkHandle */ ,
			flags  );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #93
    *  vkResetCommandBuffer 
    * 
    * @param commandBuffer - 
    * @param flags - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkResetCommandBuffer0(
		long   commandBuffer,
		int  flags);/* 
	VkResult res = vkResetCommandBuffer(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkCommandBufferResetFlags) flags);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 94
    * <h2>Prototype</h2><pre>
    *  void  vkCmdBindPipeline(
    *     VkCommandBuffer                             commandBuffer,
    *     VkPipelineBindPoint                         pipelineBindPoint,
    *     VkPipeline                                  pipeline);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param pipelineBindPoint - Vulkan enumeration of type VkPipelineBindPoint 
    * @param pipeline - Vulkan handle of type VkPipeline 
    */
   public static void vkCmdBindPipeline(
		VkCommandBuffer commandBuffer,
		VkPipelineBindPoint pipelineBindPoint,
		VkPipeline pipeline) {

	 vkCmdBindPipeline0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		pipelineBindPoint.getValue() /* VkEnum */,
		pipeline.getNativeHandle() /* VkHandle */  );

   } 

   /**
    *  Native interface for Vulkan method #94
    *  vkCmdBindPipeline 
    * 
    * @param commandBuffer - 
    * @param pipelineBindPoint - 
    * @param pipeline - 
    */
    private static native void vkCmdBindPipeline0(
		long   commandBuffer,
		int   pipelineBindPoint,
		long   pipeline);/* 
	vkCmdBindPipeline(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkPipelineBindPoint) pipelineBindPoint,
			(VkPipeline) reinterpret_cast<VkPipeline>(pipeline));

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 95
    * <h2>Prototype</h2><pre>
    *  void  vkCmdSetViewport(
    *     VkCommandBuffer                             commandBuffer,
    *     uint32_t                                    firstViewport,
    *     uint32_t                                    viewportCount,
    *     const VkViewport*                           pViewports);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param firstViewport int 
    * @param viewportCount - The length of array pViewports. 
    * @param pViewports - An array of  final VkViewport . 
    */
   public static void vkCmdSetViewport(
		VkCommandBuffer commandBuffer,
		int firstViewport,
		int viewportCount,
		final VkViewport[] pViewports) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkViewport> pViewportsBuff =
			 new BigBuffer<VkViewport>(pViewports, VkViewport.getID());

	 vkCmdSetViewport0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		firstViewport ,
		viewportCount ,
		pViewportsBuff.getPointer() /*Buffer for Struct[]*/ );

   } 

   /**
    *  Native interface for Vulkan method #95
    *  vkCmdSetViewport 
    * 
    * @param commandBuffer - 
    * @param firstViewport - 
    * @param viewportCount - 
    * @param pViewports - 
    */
    private static native void vkCmdSetViewport0(
		long   commandBuffer,
		int  firstViewport,
		int  viewportCount,
		ByteBuffer   pViewports);/* 
	vkCmdSetViewport(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(uint32_t) firstViewport,
			(uint32_t) viewportCount,
			(const VkViewport*) pViewports);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 96
    * <h2>Prototype</h2><pre>
    *  void  vkCmdSetScissor(
    *     VkCommandBuffer                             commandBuffer,
    *     uint32_t                                    firstScissor,
    *     uint32_t                                    scissorCount,
    *     const VkRect2D*                             pScissors);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param firstScissor int 
    * @param scissorCount - The length of array pScissors. 
    * @param pScissors - An array of  final VkRect2D . 
    */
   public static void vkCmdSetScissor(
		VkCommandBuffer commandBuffer,
		int firstScissor,
		int scissorCount,
		final VkRect2D[] pScissors) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkRect2D> pScissorsBuff =
			 new BigBuffer<VkRect2D>(pScissors, VkRect2D.getID());

	 vkCmdSetScissor0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		firstScissor ,
		scissorCount ,
		pScissorsBuff.getPointer() /*Buffer for Struct[]*/ );

   } 

   /**
    *  Native interface for Vulkan method #96
    *  vkCmdSetScissor 
    * 
    * @param commandBuffer - 
    * @param firstScissor - 
    * @param scissorCount - 
    * @param pScissors - 
    */
    private static native void vkCmdSetScissor0(
		long   commandBuffer,
		int  firstScissor,
		int  scissorCount,
		ByteBuffer   pScissors);/* 
	vkCmdSetScissor(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(uint32_t) firstScissor,
			(uint32_t) scissorCount,
			(const VkRect2D*) pScissors);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 97
    * <h2>Prototype</h2><pre>
    *  void  vkCmdSetLineWidth(
    *     VkCommandBuffer                             commandBuffer,
    *     float                                       lineWidth);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param lineWidth float 
    */
   public static void vkCmdSetLineWidth(
		VkCommandBuffer commandBuffer,
		float lineWidth) {

	 vkCmdSetLineWidth0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		lineWidth  );

   } 

   /**
    *  Native interface for Vulkan method #97
    *  vkCmdSetLineWidth 
    * 
    * @param commandBuffer - 
    * @param lineWidth - 
    */
    private static native void vkCmdSetLineWidth0(
		long   commandBuffer,
		float  lineWidth);/* 
	vkCmdSetLineWidth(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(float) lineWidth);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 98
    * <h2>Prototype</h2><pre>
    *  void  vkCmdSetDepthBias(
    *     VkCommandBuffer                             commandBuffer,
    *     float                                       depthBiasConstantFactor,
    *     float                                       depthBiasClamp,
    *     float                                       depthBiasSlopeFactor);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param depthBiasConstantFactor float 
    * @param depthBiasClamp float 
    * @param depthBiasSlopeFactor float 
    */
   public static void vkCmdSetDepthBias(
		VkCommandBuffer commandBuffer,
		float depthBiasConstantFactor,
		float depthBiasClamp,
		float depthBiasSlopeFactor) {

	 vkCmdSetDepthBias0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		depthBiasConstantFactor ,
		depthBiasClamp ,
		depthBiasSlopeFactor  );

   } 

   /**
    *  Native interface for Vulkan method #98
    *  vkCmdSetDepthBias 
    * 
    * @param commandBuffer - 
    * @param depthBiasConstantFactor - 
    * @param depthBiasClamp - 
    * @param depthBiasSlopeFactor - 
    */
    private static native void vkCmdSetDepthBias0(
		long   commandBuffer,
		float  depthBiasConstantFactor,
		float  depthBiasClamp,
		float  depthBiasSlopeFactor);/* 
	vkCmdSetDepthBias(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(float) depthBiasConstantFactor,
			(float) depthBiasClamp,
			(float) depthBiasSlopeFactor);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 99
    * <h2>Prototype</h2><pre>
    *  void  vkCmdSetBlendConstants(
    *     VkCommandBuffer                             commandBuffer,
    *     const float                                 blendConstants[4]);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param blendConstants - An array of float. 
    */
   public static void vkCmdSetBlendConstants(
		VkCommandBuffer commandBuffer,
		float[] blendConstants) {

	 vkCmdSetBlendConstants0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		blendConstants  );

   } 

   /**
    *  Native interface for Vulkan method #99
    *  vkCmdSetBlendConstants 
    * 
    * @param commandBuffer - 
    * @param blendConstants - 
    */
    private static native void vkCmdSetBlendConstants0(
		long   commandBuffer,
		float[]  blendConstants);/* 
	float  blendConstantsParam[4] = {0,0,0,0};
	memcpy(blendConstantsParam, blendConstants, sizeof(blendConstantsParam));
	vkCmdSetBlendConstants(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			blendConstantsParam);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 100
    * <h2>Prototype</h2><pre>
    *  void  vkCmdSetDepthBounds(
    *     VkCommandBuffer                             commandBuffer,
    *     float                                       minDepthBounds,
    *     float                                       maxDepthBounds);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param minDepthBounds float 
    * @param maxDepthBounds float 
    */
   public static void vkCmdSetDepthBounds(
		VkCommandBuffer commandBuffer,
		float minDepthBounds,
		float maxDepthBounds) {

	 vkCmdSetDepthBounds0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		minDepthBounds ,
		maxDepthBounds  );

   } 

   /**
    *  Native interface for Vulkan method #100
    *  vkCmdSetDepthBounds 
    * 
    * @param commandBuffer - 
    * @param minDepthBounds - 
    * @param maxDepthBounds - 
    */
    private static native void vkCmdSetDepthBounds0(
		long   commandBuffer,
		float  minDepthBounds,
		float  maxDepthBounds);/* 
	vkCmdSetDepthBounds(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(float) minDepthBounds,
			(float) maxDepthBounds);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 101
    * <h2>Prototype</h2><pre>
    *  void  vkCmdSetStencilCompareMask(
    *     VkCommandBuffer                             commandBuffer,
    *     VkStencilFaceFlags                          faceMask,
    *     uint32_t                                    compareMask);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param faceMask int 
    * @param compareMask int 
    */
   public static void vkCmdSetStencilCompareMask(
		VkCommandBuffer commandBuffer,
		int faceMask,
		int compareMask) {

	 vkCmdSetStencilCompareMask0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		faceMask ,
		compareMask  );

   } 

   /**
    *  Native interface for Vulkan method #101
    *  vkCmdSetStencilCompareMask 
    * 
    * @param commandBuffer - 
    * @param faceMask - 
    * @param compareMask - 
    */
    private static native void vkCmdSetStencilCompareMask0(
		long   commandBuffer,
		int  faceMask,
		int  compareMask);/* 
	vkCmdSetStencilCompareMask(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkStencilFaceFlags) faceMask,
			(uint32_t) compareMask);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 102
    * <h2>Prototype</h2><pre>
    *  void  vkCmdSetStencilWriteMask(
    *     VkCommandBuffer                             commandBuffer,
    *     VkStencilFaceFlags                          faceMask,
    *     uint32_t                                    writeMask);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param faceMask int 
    * @param writeMask int 
    */
   public static void vkCmdSetStencilWriteMask(
		VkCommandBuffer commandBuffer,
		int faceMask,
		int writeMask) {

	 vkCmdSetStencilWriteMask0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		faceMask ,
		writeMask  );

   } 

   /**
    *  Native interface for Vulkan method #102
    *  vkCmdSetStencilWriteMask 
    * 
    * @param commandBuffer - 
    * @param faceMask - 
    * @param writeMask - 
    */
    private static native void vkCmdSetStencilWriteMask0(
		long   commandBuffer,
		int  faceMask,
		int  writeMask);/* 
	vkCmdSetStencilWriteMask(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkStencilFaceFlags) faceMask,
			(uint32_t) writeMask);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 103
    * <h2>Prototype</h2><pre>
    *  void  vkCmdSetStencilReference(
    *     VkCommandBuffer                             commandBuffer,
    *     VkStencilFaceFlags                          faceMask,
    *     uint32_t                                    reference);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param faceMask int 
    * @param reference int 
    */
   public static void vkCmdSetStencilReference(
		VkCommandBuffer commandBuffer,
		int faceMask,
		int reference) {

	 vkCmdSetStencilReference0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		faceMask ,
		reference  );

   } 

   /**
    *  Native interface for Vulkan method #103
    *  vkCmdSetStencilReference 
    * 
    * @param commandBuffer - 
    * @param faceMask - 
    * @param reference - 
    */
    private static native void vkCmdSetStencilReference0(
		long   commandBuffer,
		int  faceMask,
		int  reference);/* 
	vkCmdSetStencilReference(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkStencilFaceFlags) faceMask,
			(uint32_t) reference);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 104
    * <h2>Prototype</h2><pre>
    *  void  vkCmdBindDescriptorSets(
    *     VkCommandBuffer                             commandBuffer,
    *     VkPipelineBindPoint                         pipelineBindPoint,
    *     VkPipelineLayout                            layout,
    *     uint32_t                                    firstSet,
    *     uint32_t                                    descriptorSetCount,
    *     const VkDescriptorSet*                      pDescriptorSets,
    *     uint32_t                                    dynamicOffsetCount,
    *     const uint32_t*                             pDynamicOffsets);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param pipelineBindPoint - Vulkan enumeration of type VkPipelineBindPoint 
    * @param layout - Vulkan handle of type VkPipelineLayout 
    * @param firstSet int 
    * @param descriptorSetCount - The length of array pDescriptorSets. 
    * @param pDescriptorSets - An array of  final VkDescriptorSet . 
    * @param dynamicOffsetCount - The length of array pDynamicOffsets. 
    * @param pDynamicOffsets - An array of int. 
    */
   public static void vkCmdBindDescriptorSets(
		VkCommandBuffer commandBuffer,
		VkPipelineBindPoint pipelineBindPoint,
		VkPipelineLayout layout,
		int firstSet,
		int descriptorSetCount,
		final VkDescriptorSet[] pDescriptorSets,
		int dynamicOffsetCount,
		int[] pDynamicOffsets) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkDescriptorSet> pDescriptorSetsBuffer =
			 new BigBuffer<VkDescriptorSet>(pDescriptorSets, false);
	 vkCmdBindDescriptorSets0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		pipelineBindPoint.getValue() /* VkEnum */,
		layout.getNativeHandle() /* VkHandle */ ,
		firstSet ,
		descriptorSetCount ,
		pDescriptorSetsBuffer.getPointer() /*BigBuffer of VkHandle*/,
		dynamicOffsetCount ,
		pDynamicOffsets  );
	 pDescriptorSetsBuffer.update();

   } 

   /**
    *  Native interface for Vulkan method #104
    *  vkCmdBindDescriptorSets 
    * 
    * @param commandBuffer - 
    * @param pipelineBindPoint - 
    * @param layout - 
    * @param firstSet - 
    * @param descriptorSetCount - 
    * @param pDescriptorSets - 
    * @param dynamicOffsetCount - 
    * @param pDynamicOffsets - 
    */
    private static native void vkCmdBindDescriptorSets0(
		long   commandBuffer,
		int   pipelineBindPoint,
		long   layout,
		int  firstSet,
		int  descriptorSetCount,
		ByteBuffer   pDescriptorSets,
		int  dynamicOffsetCount,
		int[]  pDynamicOffsets);/* 
	vkCmdBindDescriptorSets(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkPipelineBindPoint) pipelineBindPoint,
			(VkPipelineLayout) reinterpret_cast<VkPipelineLayout>(layout),
			(uint32_t) firstSet,
			(uint32_t) descriptorSetCount,
			(const VkDescriptorSet*) pDescriptorSets,
			(uint32_t) dynamicOffsetCount,
			(const uint32_t*) pDynamicOffsets);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 105
    * <h2>Prototype</h2><pre>
    *  void  vkCmdBindIndexBuffer(
    *     VkCommandBuffer                             commandBuffer,
    *     VkBuffer                                    buffer,
    *     VkDeviceSize                                offset,
    *     VkIndexType                                 indexType);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param buffer - Vulkan handle of type VkBuffer 
    * @param offset long 
    * @param indexType - Vulkan enumeration of type VkIndexType 
    */
   public static void vkCmdBindIndexBuffer(
		VkCommandBuffer commandBuffer,
		VkBuffer buffer,
		long offset,
		VkIndexType indexType) {

	 vkCmdBindIndexBuffer0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		buffer.getNativeHandle() /* VkHandle */ ,
		offset ,
		indexType.getValue() /* VkEnum */ );

   } 

   /**
    *  Native interface for Vulkan method #105
    *  vkCmdBindIndexBuffer 
    * 
    * @param commandBuffer - 
    * @param buffer - 
    * @param offset - 
    * @param indexType - 
    */
    private static native void vkCmdBindIndexBuffer0(
		long   commandBuffer,
		long   buffer,
		long  offset,
		int   indexType);/* 
	vkCmdBindIndexBuffer(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkBuffer) reinterpret_cast<VkBuffer>(buffer),
			(VkDeviceSize) offset,
			(VkIndexType) indexType);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 106
    * <h2>Prototype</h2><pre>
    *  void  vkCmdBindVertexBuffers(
    *     VkCommandBuffer                             commandBuffer,
    *     uint32_t                                    firstBinding,
    *     uint32_t                                    bindingCount,
    *     const VkBuffer*                             pBuffers,
    *     const VkDeviceSize*                         pOffsets);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param firstBinding int 
    * @param bindingCount - The length of array pBuffers. 
    * @param pBuffers - An array of  final VkBuffer . 
    * @param pOffsets - An array of long. 
    */
   public static void vkCmdBindVertexBuffers(
		VkCommandBuffer commandBuffer,
		int firstBinding,
		int bindingCount,
		final VkBuffer[] pBuffers,
		long[] pOffsets) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkBuffer> pBuffersBuffer =
			 new BigBuffer<VkBuffer>(pBuffers, false);
	 vkCmdBindVertexBuffers0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		firstBinding ,
		bindingCount ,
		pBuffersBuffer.getPointer() /*BigBuffer of VkHandle*/,
		pOffsets  );
	 pBuffersBuffer.update();

   } 

   /**
    *  Native interface for Vulkan method #106
    *  vkCmdBindVertexBuffers 
    * 
    * @param commandBuffer - 
    * @param firstBinding - 
    * @param bindingCount - 
    * @param pBuffers - 
    * @param pOffsets - 
    */
    private static native void vkCmdBindVertexBuffers0(
		long   commandBuffer,
		int  firstBinding,
		int  bindingCount,
		ByteBuffer   pBuffers,
		long[]  pOffsets);/* 
	vkCmdBindVertexBuffers(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(uint32_t) firstBinding,
			(uint32_t) bindingCount,
			(const VkBuffer*) pBuffers,
			(const VkDeviceSize*) pOffsets);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 107
    * <h2>Prototype</h2><pre>
    *  void  vkCmdDraw(
    *     VkCommandBuffer                             commandBuffer,
    *     uint32_t                                    vertexCount,
    *     uint32_t                                    instanceCount,
    *     uint32_t                                    firstVertex,
    *     uint32_t                                    firstInstance);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param vertexCount - The length of array instanceCount. 
    * @param instanceCount - The length of array firstVertex. 
    * @param firstVertex int 
    * @param firstInstance int 
    */
   public static void vkCmdDraw(
		VkCommandBuffer commandBuffer,
		int vertexCount,
		int instanceCount,
		int firstVertex,
		int firstInstance) {

	 vkCmdDraw0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		vertexCount ,
		instanceCount ,
		firstVertex ,
		firstInstance  );

   } 

   /**
    *  Native interface for Vulkan method #107
    *  vkCmdDraw 
    * 
    * @param commandBuffer - 
    * @param vertexCount - 
    * @param instanceCount - 
    * @param firstVertex - 
    * @param firstInstance - 
    */
    private static native void vkCmdDraw0(
		long   commandBuffer,
		int  vertexCount,
		int  instanceCount,
		int  firstVertex,
		int  firstInstance);/* 
	vkCmdDraw(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(uint32_t) vertexCount,
			(uint32_t) instanceCount,
			(uint32_t) firstVertex,
			(uint32_t) firstInstance);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 108
    * <h2>Prototype</h2><pre>
    *  void  vkCmdDrawIndexed(
    *     VkCommandBuffer                             commandBuffer,
    *     uint32_t                                    indexCount,
    *     uint32_t                                    instanceCount,
    *     uint32_t                                    firstIndex,
    *     int32_t                                     vertexOffset,
    *     uint32_t                                    firstInstance);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param indexCount - The length of array instanceCount. 
    * @param instanceCount - The length of array firstIndex. 
    * @param firstIndex int 
    * @param vertexOffset int 
    * @param firstInstance int 
    */
   public static void vkCmdDrawIndexed(
		VkCommandBuffer commandBuffer,
		int indexCount,
		int instanceCount,
		int firstIndex,
		int vertexOffset,
		int firstInstance) {

	 vkCmdDrawIndexed0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		indexCount ,
		instanceCount ,
		firstIndex ,
		vertexOffset ,
		firstInstance  );

   } 

   /**
    *  Native interface for Vulkan method #108
    *  vkCmdDrawIndexed 
    * 
    * @param commandBuffer - 
    * @param indexCount - 
    * @param instanceCount - 
    * @param firstIndex - 
    * @param vertexOffset - 
    * @param firstInstance - 
    */
    private static native void vkCmdDrawIndexed0(
		long   commandBuffer,
		int  indexCount,
		int  instanceCount,
		int  firstIndex,
		int  vertexOffset,
		int  firstInstance);/* 
	vkCmdDrawIndexed(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(uint32_t) indexCount,
			(uint32_t) instanceCount,
			(uint32_t) firstIndex,
			(int32_t) vertexOffset,
			(uint32_t) firstInstance);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 109
    * <h2>Prototype</h2><pre>
    *  void  vkCmdDrawIndirect(
    *     VkCommandBuffer                             commandBuffer,
    *     VkBuffer                                    buffer,
    *     VkDeviceSize                                offset,
    *     uint32_t                                    drawCount,
    *     uint32_t                                    stride);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param buffer - Vulkan handle of type VkBuffer 
    * @param offset long 
    * @param drawCount - The length of array stride. 
    * @param stride int 
    */
   public static void vkCmdDrawIndirect(
		VkCommandBuffer commandBuffer,
		VkBuffer buffer,
		long offset,
		int drawCount,
		int stride) {

	 vkCmdDrawIndirect0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		buffer.getNativeHandle() /* VkHandle */ ,
		offset ,
		drawCount ,
		stride  );

   } 

   /**
    *  Native interface for Vulkan method #109
    *  vkCmdDrawIndirect 
    * 
    * @param commandBuffer - 
    * @param buffer - 
    * @param offset - 
    * @param drawCount - 
    * @param stride - 
    */
    private static native void vkCmdDrawIndirect0(
		long   commandBuffer,
		long   buffer,
		long  offset,
		int  drawCount,
		int  stride);/* 
	vkCmdDrawIndirect(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkBuffer) reinterpret_cast<VkBuffer>(buffer),
			(VkDeviceSize) offset,
			(uint32_t) drawCount,
			(uint32_t) stride);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 110
    * <h2>Prototype</h2><pre>
    *  void  vkCmdDrawIndexedIndirect(
    *     VkCommandBuffer                             commandBuffer,
    *     VkBuffer                                    buffer,
    *     VkDeviceSize                                offset,
    *     uint32_t                                    drawCount,
    *     uint32_t                                    stride);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param buffer - Vulkan handle of type VkBuffer 
    * @param offset long 
    * @param drawCount - The length of array stride. 
    * @param stride int 
    */
   public static void vkCmdDrawIndexedIndirect(
		VkCommandBuffer commandBuffer,
		VkBuffer buffer,
		long offset,
		int drawCount,
		int stride) {

	 vkCmdDrawIndexedIndirect0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		buffer.getNativeHandle() /* VkHandle */ ,
		offset ,
		drawCount ,
		stride  );

   } 

   /**
    *  Native interface for Vulkan method #110
    *  vkCmdDrawIndexedIndirect 
    * 
    * @param commandBuffer - 
    * @param buffer - 
    * @param offset - 
    * @param drawCount - 
    * @param stride - 
    */
    private static native void vkCmdDrawIndexedIndirect0(
		long   commandBuffer,
		long   buffer,
		long  offset,
		int  drawCount,
		int  stride);/* 
	vkCmdDrawIndexedIndirect(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkBuffer) reinterpret_cast<VkBuffer>(buffer),
			(VkDeviceSize) offset,
			(uint32_t) drawCount,
			(uint32_t) stride);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 111
    * <h2>Prototype</h2><pre>
    *  void  vkCmdDispatch(
    *     VkCommandBuffer                             commandBuffer,
    *     uint32_t                                    x,
    *     uint32_t                                    y,
    *     uint32_t                                    z);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param x int 
    * @param y int 
    * @param z int 
    */
   public static void vkCmdDispatch(
		VkCommandBuffer commandBuffer,
		int x,
		int y,
		int z) {

	 vkCmdDispatch0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		x ,
		y ,
		z  );

   } 

   /**
    *  Native interface for Vulkan method #111
    *  vkCmdDispatch 
    * 
    * @param commandBuffer - 
    * @param x - 
    * @param y - 
    * @param z - 
    */
    private static native void vkCmdDispatch0(
		long   commandBuffer,
		int  x,
		int  y,
		int  z);/* 
	vkCmdDispatch(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(uint32_t) x,
			(uint32_t) y,
			(uint32_t) z);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 112
    * <h2>Prototype</h2><pre>
    *  void  vkCmdDispatchIndirect(
    *     VkCommandBuffer                             commandBuffer,
    *     VkBuffer                                    buffer,
    *     VkDeviceSize                                offset);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param buffer - Vulkan handle of type VkBuffer 
    * @param offset long 
    */
   public static void vkCmdDispatchIndirect(
		VkCommandBuffer commandBuffer,
		VkBuffer buffer,
		long offset) {

	 vkCmdDispatchIndirect0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		buffer.getNativeHandle() /* VkHandle */ ,
		offset  );

   } 

   /**
    *  Native interface for Vulkan method #112
    *  vkCmdDispatchIndirect 
    * 
    * @param commandBuffer - 
    * @param buffer - 
    * @param offset - 
    */
    private static native void vkCmdDispatchIndirect0(
		long   commandBuffer,
		long   buffer,
		long  offset);/* 
	vkCmdDispatchIndirect(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkBuffer) reinterpret_cast<VkBuffer>(buffer),
			(VkDeviceSize) offset);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 113
    * <h2>Prototype</h2><pre>
    *  void  vkCmdCopyBuffer(
    *     VkCommandBuffer                             commandBuffer,
    *     VkBuffer                                    srcBuffer,
    *     VkBuffer                                    dstBuffer,
    *     uint32_t                                    regionCount,
    *     const VkBufferCopy*                         pRegions);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param srcBuffer - Vulkan handle of type VkBuffer 
    * @param dstBuffer - Vulkan handle of type VkBuffer 
    * @param regionCount - The length of array pRegions. 
    * @param pRegions - An array of  final VkBufferCopy . 
    */
   public static void vkCmdCopyBuffer(
		VkCommandBuffer commandBuffer,
		VkBuffer srcBuffer,
		VkBuffer dstBuffer,
		int regionCount,
		final VkBufferCopy[] pRegions) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkBufferCopy> pRegionsBuff =
			 new BigBuffer<VkBufferCopy>(pRegions, VkBufferCopy.getID());

	 vkCmdCopyBuffer0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		srcBuffer.getNativeHandle() /* VkHandle */ ,
		dstBuffer.getNativeHandle() /* VkHandle */ ,
		regionCount ,
		pRegionsBuff.getPointer() /*Buffer for Struct[]*/ );

   } 

   /**
    *  Native interface for Vulkan method #113
    *  vkCmdCopyBuffer 
    * 
    * @param commandBuffer - 
    * @param srcBuffer - 
    * @param dstBuffer - 
    * @param regionCount - 
    * @param pRegions - 
    */
    private static native void vkCmdCopyBuffer0(
		long   commandBuffer,
		long   srcBuffer,
		long   dstBuffer,
		int  regionCount,
		ByteBuffer   pRegions);/* 
	vkCmdCopyBuffer(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkBuffer) reinterpret_cast<VkBuffer>(srcBuffer),
			(VkBuffer) reinterpret_cast<VkBuffer>(dstBuffer),
			(uint32_t) regionCount,
			(const VkBufferCopy*) pRegions);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 114
    * <h2>Prototype</h2><pre>
    *  void  vkCmdCopyImage(
    *     VkCommandBuffer                             commandBuffer,
    *     VkImage                                     srcImage,
    *     VkImageLayout                               srcImageLayout,
    *     VkImage                                     dstImage,
    *     VkImageLayout                               dstImageLayout,
    *     uint32_t                                    regionCount,
    *     const VkImageCopy*                          pRegions);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param srcImage - Vulkan handle of type VkImage 
    * @param srcImageLayout - Vulkan enumeration of type VkImageLayout 
    * @param dstImage - Vulkan handle of type VkImage 
    * @param dstImageLayout - Vulkan enumeration of type VkImageLayout 
    * @param regionCount - The length of array pRegions. 
    * @param pRegions - An array of  final VkImageCopy . 
    */
   public static void vkCmdCopyImage(
		VkCommandBuffer commandBuffer,
		VkImage srcImage,
		VkImageLayout srcImageLayout,
		VkImage dstImage,
		VkImageLayout dstImageLayout,
		int regionCount,
		final VkImageCopy[] pRegions) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkImageCopy> pRegionsBuff =
			 new BigBuffer<VkImageCopy>(pRegions, VkImageCopy.getID());

	 vkCmdCopyImage0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		srcImage.getNativeHandle() /* VkHandle */ ,
		srcImageLayout.getValue() /* VkEnum */,
		dstImage.getNativeHandle() /* VkHandle */ ,
		dstImageLayout.getValue() /* VkEnum */,
		regionCount ,
		pRegionsBuff.getPointer() /*Buffer for Struct[]*/ );

   } 

   /**
    *  Native interface for Vulkan method #114
    *  vkCmdCopyImage 
    * 
    * @param commandBuffer - 
    * @param srcImage - 
    * @param srcImageLayout - 
    * @param dstImage - 
    * @param dstImageLayout - 
    * @param regionCount - 
    * @param pRegions - 
    */
    private static native void vkCmdCopyImage0(
		long   commandBuffer,
		long   srcImage,
		int   srcImageLayout,
		long   dstImage,
		int   dstImageLayout,
		int  regionCount,
		ByteBuffer   pRegions);/* 
	vkCmdCopyImage(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkImage) reinterpret_cast<VkImage>(srcImage),
			(VkImageLayout) srcImageLayout,
			(VkImage) reinterpret_cast<VkImage>(dstImage),
			(VkImageLayout) dstImageLayout,
			(uint32_t) regionCount,
			(const VkImageCopy*) pRegions);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 115
    * <h2>Prototype</h2><pre>
    *  void  vkCmdBlitImage(
    *     VkCommandBuffer                             commandBuffer,
    *     VkImage                                     srcImage,
    *     VkImageLayout                               srcImageLayout,
    *     VkImage                                     dstImage,
    *     VkImageLayout                               dstImageLayout,
    *     uint32_t                                    regionCount,
    *     const VkImageBlit*                          pRegions,
    *     VkFilter                                    filter);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param srcImage - Vulkan handle of type VkImage 
    * @param srcImageLayout - Vulkan enumeration of type VkImageLayout 
    * @param dstImage - Vulkan handle of type VkImage 
    * @param dstImageLayout - Vulkan enumeration of type VkImageLayout 
    * @param regionCount - The length of array pRegions. 
    * @param pRegions - An array of  final VkImageBlit . 
    * @param filter - Vulkan enumeration of type VkFilter 
    */
   public static void vkCmdBlitImage(
		VkCommandBuffer commandBuffer,
		VkImage srcImage,
		VkImageLayout srcImageLayout,
		VkImage dstImage,
		VkImageLayout dstImageLayout,
		int regionCount,
		final VkImageBlit[] pRegions,
		VkFilter filter) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkImageBlit> pRegionsBuff =
			 new BigBuffer<VkImageBlit>(pRegions, VkImageBlit.getID());

	 vkCmdBlitImage0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		srcImage.getNativeHandle() /* VkHandle */ ,
		srcImageLayout.getValue() /* VkEnum */,
		dstImage.getNativeHandle() /* VkHandle */ ,
		dstImageLayout.getValue() /* VkEnum */,
		regionCount ,
		pRegionsBuff.getPointer() /*Buffer for Struct[]*/,
		filter.getValue() /* VkEnum */ );


   } 

   /**
    *  Native interface for Vulkan method #115
    *  vkCmdBlitImage 
    * 
    * @param commandBuffer - 
    * @param srcImage - 
    * @param srcImageLayout - 
    * @param dstImage - 
    * @param dstImageLayout - 
    * @param regionCount - 
    * @param pRegions - 
    * @param filter - 
    */
    private static native void vkCmdBlitImage0(
		long   commandBuffer,
		long   srcImage,
		int   srcImageLayout,
		long   dstImage,
		int   dstImageLayout,
		int  regionCount,
		ByteBuffer   pRegions,
		int   filter);/* 
	vkCmdBlitImage(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkImage) reinterpret_cast<VkImage>(srcImage),
			(VkImageLayout) srcImageLayout,
			(VkImage) reinterpret_cast<VkImage>(dstImage),
			(VkImageLayout) dstImageLayout,
			(uint32_t) regionCount,
			(const VkImageBlit*) pRegions,
			(VkFilter) filter);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 116
    * <h2>Prototype</h2><pre>
    *  void  vkCmdCopyBufferToImage(
    *     VkCommandBuffer                             commandBuffer,
    *     VkBuffer                                    srcBuffer,
    *     VkImage                                     dstImage,
    *     VkImageLayout                               dstImageLayout,
    *     uint32_t                                    regionCount,
    *     const VkBufferImageCopy*                    pRegions);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param srcBuffer - Vulkan handle of type VkBuffer 
    * @param dstImage - Vulkan handle of type VkImage 
    * @param dstImageLayout - Vulkan enumeration of type VkImageLayout 
    * @param regionCount - The length of array pRegions. 
    * @param pRegions - An array of  final VkBufferImageCopy . 
    */
   public static void vkCmdCopyBufferToImage(
		VkCommandBuffer commandBuffer,
		VkBuffer srcBuffer,
		VkImage dstImage,
		VkImageLayout dstImageLayout,
		int regionCount,
		final VkBufferImageCopy[] pRegions) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkBufferImageCopy> pRegionsBuff =
			 new BigBuffer<VkBufferImageCopy>(pRegions, VkBufferImageCopy.getID());

	 vkCmdCopyBufferToImage0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		srcBuffer.getNativeHandle() /* VkHandle */ ,
		dstImage.getNativeHandle() /* VkHandle */ ,
		dstImageLayout.getValue() /* VkEnum */,
		regionCount ,
		pRegionsBuff.getPointer() /*Buffer for Struct[]*/ );

   } 

   /**
    *  Native interface for Vulkan method #116
    *  vkCmdCopyBufferToImage 
    * 
    * @param commandBuffer - 
    * @param srcBuffer - 
    * @param dstImage - 
    * @param dstImageLayout - 
    * @param regionCount - 
    * @param pRegions - 
    */
    private static native void vkCmdCopyBufferToImage0(
		long   commandBuffer,
		long   srcBuffer,
		long   dstImage,
		int   dstImageLayout,
		int  regionCount,
		ByteBuffer   pRegions);/* 
	vkCmdCopyBufferToImage(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkBuffer) reinterpret_cast<VkBuffer>(srcBuffer),
			(VkImage) reinterpret_cast<VkImage>(dstImage),
			(VkImageLayout) dstImageLayout,
			(uint32_t) regionCount,
			(const VkBufferImageCopy*) pRegions);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 117
    * <h2>Prototype</h2><pre>
    *  void  vkCmdCopyImageToBuffer(
    *     VkCommandBuffer                             commandBuffer,
    *     VkImage                                     srcImage,
    *     VkImageLayout                               srcImageLayout,
    *     VkBuffer                                    dstBuffer,
    *     uint32_t                                    regionCount,
    *     const VkBufferImageCopy*                    pRegions);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param srcImage - Vulkan handle of type VkImage 
    * @param srcImageLayout - Vulkan enumeration of type VkImageLayout 
    * @param dstBuffer - Vulkan handle of type VkBuffer 
    * @param regionCount - The length of array pRegions. 
    * @param pRegions - An array of  final VkBufferImageCopy . 
    */
   public static void vkCmdCopyImageToBuffer(
		VkCommandBuffer commandBuffer,
		VkImage srcImage,
		VkImageLayout srcImageLayout,
		VkBuffer dstBuffer,
		int regionCount,
		final VkBufferImageCopy[] pRegions) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkBufferImageCopy> pRegionsBuff =
			 new BigBuffer<VkBufferImageCopy>(pRegions, VkBufferImageCopy.getID());

	 vkCmdCopyImageToBuffer0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		srcImage.getNativeHandle() /* VkHandle */ ,
		srcImageLayout.getValue() /* VkEnum */,
		dstBuffer.getNativeHandle() /* VkHandle */ ,
		regionCount ,
		pRegionsBuff.getPointer() /*Buffer for Struct[]*/ );

   } 

   /**
    *  Native interface for Vulkan method #117
    *  vkCmdCopyImageToBuffer 
    * 
    * @param commandBuffer - 
    * @param srcImage - 
    * @param srcImageLayout - 
    * @param dstBuffer - 
    * @param regionCount - 
    * @param pRegions - 
    */
    private static native void vkCmdCopyImageToBuffer0(
		long   commandBuffer,
		long   srcImage,
		int   srcImageLayout,
		long   dstBuffer,
		int  regionCount,
		ByteBuffer   pRegions);/* 
	vkCmdCopyImageToBuffer(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkImage) reinterpret_cast<VkImage>(srcImage),
			(VkImageLayout) srcImageLayout,
			(VkBuffer) reinterpret_cast<VkBuffer>(dstBuffer),
			(uint32_t) regionCount,
			(const VkBufferImageCopy*) pRegions);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 118
    * <h2>Prototype</h2><pre>
    *  void  vkCmdUpdateBuffer(
    *     VkCommandBuffer                             commandBuffer,
    *     VkBuffer                                    dstBuffer,
    *     VkDeviceSize                                dstOffset,
    *     VkDeviceSize                                dataSize,
    *     const void*                                 pData);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param dstBuffer - Vulkan handle of type VkBuffer 
    * @param dstOffset long 
    * @param dataSize long 
    * @param pData java.nio.Buffer 
    */
   public static void vkCmdUpdateBuffer(
		VkCommandBuffer commandBuffer,
		VkBuffer dstBuffer,
		long dstOffset,
		long dataSize,
		java.nio.Buffer pData) {

	 vkCmdUpdateBuffer0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		dstBuffer.getNativeHandle() /* VkHandle */ ,
		dstOffset ,
		dataSize ,
		pData  );

   } 

   /**
    *  Native interface for Vulkan method #118
    *  vkCmdUpdateBuffer 
    * 
    * @param commandBuffer - 
    * @param dstBuffer - 
    * @param dstOffset - 
    * @param dataSize - 
    * @param pData - 
    */
    private static native void vkCmdUpdateBuffer0(
		long   commandBuffer,
		long   dstBuffer,
		long  dstOffset,
		long  dataSize,
		java.nio.Buffer  pData);/* 
	vkCmdUpdateBuffer(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkBuffer) reinterpret_cast<VkBuffer>(dstBuffer),
			(VkDeviceSize) dstOffset,
			(VkDeviceSize) dataSize,
			(const void*) pData);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 119
    * <h2>Prototype</h2><pre>
    *  void  vkCmdFillBuffer(
    *     VkCommandBuffer                             commandBuffer,
    *     VkBuffer                                    dstBuffer,
    *     VkDeviceSize                                dstOffset,
    *     VkDeviceSize                                size,
    *     uint32_t                                    data);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param dstBuffer - Vulkan handle of type VkBuffer 
    * @param dstOffset long 
    * @param size long 
    * @param data int 
    */
   public static void vkCmdFillBuffer(
		VkCommandBuffer commandBuffer,
		VkBuffer dstBuffer,
		long dstOffset,
		long size,
		int data) {

	 vkCmdFillBuffer0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		dstBuffer.getNativeHandle() /* VkHandle */ ,
		dstOffset ,
		size ,
		data  );

   } 

   /**
    *  Native interface for Vulkan method #119
    *  vkCmdFillBuffer 
    * 
    * @param commandBuffer - 
    * @param dstBuffer - 
    * @param dstOffset - 
    * @param size - 
    * @param data - 
    */
    private static native void vkCmdFillBuffer0(
		long   commandBuffer,
		long   dstBuffer,
		long  dstOffset,
		long  size,
		int  data);/* 
	vkCmdFillBuffer(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkBuffer) reinterpret_cast<VkBuffer>(dstBuffer),
			(VkDeviceSize) dstOffset,
			(VkDeviceSize) size,
			(uint32_t) data);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 120
    * <h2>Prototype</h2><pre>
    *  void  vkCmdClearColorImage(
    *     VkCommandBuffer                             commandBuffer,
    *     VkImage                                     image,
    *     VkImageLayout                               imageLayout,
    *     const VkClearColorValue*                    pColor,
    *     uint32_t                                    rangeCount,
    *     const VkImageSubresourceRange*              pRanges);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param image - Vulkan handle of type VkImage 
    * @param imageLayout - Vulkan enumeration of type VkImageLayout 
    * @param pColor - Vulkan Struct of type  final VkClearColorValue 
    * @param rangeCount - The length of array pRanges. 
    * @param pRanges - An array of  final VkImageSubresourceRange . 
    */
   public static void vkCmdClearColorImage(
		VkCommandBuffer commandBuffer,
		VkImage image,
		VkImageLayout imageLayout,
		final VkClearColorValue pColor,
		int rangeCount,
		final VkImageSubresourceRange[] pRanges) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkImageSubresourceRange> pRangesBuff =
			 new BigBuffer<VkImageSubresourceRange>(pRanges, VkImageSubresourceRange.getID());

	 vkCmdClearColorImage0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		image.getNativeHandle() /* VkHandle */ ,
		imageLayout.getValue() /* VkEnum */,
		pColor.getPointer() /* Struct */,
		rangeCount ,
		pRangesBuff.getPointer() /*Buffer for Struct[]*/ );

   } 

   /**
    *  Native interface for Vulkan method #120
    *  vkCmdClearColorImage 
    * 
    * @param commandBuffer - 
    * @param image - 
    * @param imageLayout - 
    * @param pColor - 
    * @param rangeCount - 
    * @param pRanges - 
    */
    private static native void vkCmdClearColorImage0(
		long   commandBuffer,
		long   image,
		int   imageLayout,
		ByteBuffer   pColor,
		int  rangeCount,
		ByteBuffer   pRanges);/* 
	vkCmdClearColorImage(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkImage) reinterpret_cast<VkImage>(image),
			(VkImageLayout) imageLayout,
			(const VkClearColorValue*) pColor,
			(uint32_t) rangeCount,
			(const VkImageSubresourceRange*) pRanges);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 121
    * <h2>Prototype</h2><pre>
    *  void  vkCmdClearDepthStencilImage(
    *     VkCommandBuffer                             commandBuffer,
    *     VkImage                                     image,
    *     VkImageLayout                               imageLayout,
    *     const VkClearDepthStencilValue*             pDepthStencil,
    *     uint32_t                                    rangeCount,
    *     const VkImageSubresourceRange*              pRanges);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param image - Vulkan handle of type VkImage 
    * @param imageLayout - Vulkan enumeration of type VkImageLayout 
    * @param pDepthStencil - Vulkan Struct of type  final VkClearDepthStencilValue 
    * @param rangeCount - The length of array pRanges. 
    * @param pRanges - An array of  final VkImageSubresourceRange . 
    */
   public static void vkCmdClearDepthStencilImage(
		VkCommandBuffer commandBuffer,
		VkImage image,
		VkImageLayout imageLayout,
		final VkClearDepthStencilValue pDepthStencil,
		int rangeCount,
		final VkImageSubresourceRange[] pRanges) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkImageSubresourceRange> pRangesBuff =
			 new BigBuffer<VkImageSubresourceRange>(pRanges, VkImageSubresourceRange.getID());

	 vkCmdClearDepthStencilImage0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		image.getNativeHandle() /* VkHandle */ ,
		imageLayout.getValue() /* VkEnum */,
		pDepthStencil.getPointer() /* Struct */,
		rangeCount ,
		pRangesBuff.getPointer() /*Buffer for Struct[]*/ );

   } 

   /**
    *  Native interface for Vulkan method #121
    *  vkCmdClearDepthStencilImage 
    * 
    * @param commandBuffer - 
    * @param image - 
    * @param imageLayout - 
    * @param pDepthStencil - 
    * @param rangeCount - 
    * @param pRanges - 
    */
    private static native void vkCmdClearDepthStencilImage0(
		long   commandBuffer,
		long   image,
		int   imageLayout,
		ByteBuffer   pDepthStencil,
		int  rangeCount,
		ByteBuffer   pRanges);/* 
	vkCmdClearDepthStencilImage(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkImage) reinterpret_cast<VkImage>(image),
			(VkImageLayout) imageLayout,
			(const VkClearDepthStencilValue*) pDepthStencil,
			(uint32_t) rangeCount,
			(const VkImageSubresourceRange*) pRanges);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 122
    * <h2>Prototype</h2><pre>
    *  void  vkCmdClearAttachments(
    *     VkCommandBuffer                             commandBuffer,
    *     uint32_t                                    attachmentCount,
    *     const VkClearAttachment*                    pAttachments,
    *     uint32_t                                    rectCount,
    *     const VkClearRect*                          pRects);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param attachmentCount - The length of array pAttachments. 
    * @param pAttachments - An array of  final VkClearAttachment . 
    * @param rectCount - The length of array pRects. 
    * @param pRects - An array of  final VkClearRect . 
    */
   public static void vkCmdClearAttachments(
		VkCommandBuffer commandBuffer,
		int attachmentCount,
		final VkClearAttachment[] pAttachments,
		int rectCount,
		final VkClearRect[] pRects) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkClearAttachment> pAttachmentsBuff =
			 new BigBuffer<VkClearAttachment>(pAttachments, VkClearAttachment.getID());
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkClearRect> pRectsBuff =
			 new BigBuffer<VkClearRect>(pRects, VkClearRect.getID());

	 vkCmdClearAttachments0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		attachmentCount ,
		pAttachmentsBuff.getPointer() /*Buffer for Struct[]*/,
		rectCount ,
		pRectsBuff.getPointer() /*Buffer for Struct[]*/ );


   } 

   /**
    *  Native interface for Vulkan method #122
    *  vkCmdClearAttachments 
    * 
    * @param commandBuffer - 
    * @param attachmentCount - 
    * @param pAttachments - 
    * @param rectCount - 
    * @param pRects - 
    */
    private static native void vkCmdClearAttachments0(
		long   commandBuffer,
		int  attachmentCount,
		ByteBuffer   pAttachments,
		int  rectCount,
		ByteBuffer   pRects);/* 
	vkCmdClearAttachments(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(uint32_t) attachmentCount,
			(const VkClearAttachment*) pAttachments,
			(uint32_t) rectCount,
			(const VkClearRect*) pRects);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 123
    * <h2>Prototype</h2><pre>
    *  void  vkCmdResolveImage(
    *     VkCommandBuffer                             commandBuffer,
    *     VkImage                                     srcImage,
    *     VkImageLayout                               srcImageLayout,
    *     VkImage                                     dstImage,
    *     VkImageLayout                               dstImageLayout,
    *     uint32_t                                    regionCount,
    *     const VkImageResolve*                       pRegions);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param srcImage - Vulkan handle of type VkImage 
    * @param srcImageLayout - Vulkan enumeration of type VkImageLayout 
    * @param dstImage - Vulkan handle of type VkImage 
    * @param dstImageLayout - Vulkan enumeration of type VkImageLayout 
    * @param regionCount - The length of array pRegions. 
    * @param pRegions - An array of  final VkImageResolve . 
    */
   public static void vkCmdResolveImage(
		VkCommandBuffer commandBuffer,
		VkImage srcImage,
		VkImageLayout srcImageLayout,
		VkImage dstImage,
		VkImageLayout dstImageLayout,
		int regionCount,
		final VkImageResolve[] pRegions) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkImageResolve> pRegionsBuff =
			 new BigBuffer<VkImageResolve>(pRegions, VkImageResolve.getID());

	 vkCmdResolveImage0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		srcImage.getNativeHandle() /* VkHandle */ ,
		srcImageLayout.getValue() /* VkEnum */,
		dstImage.getNativeHandle() /* VkHandle */ ,
		dstImageLayout.getValue() /* VkEnum */,
		regionCount ,
		pRegionsBuff.getPointer() /*Buffer for Struct[]*/ );

   } 

   /**
    *  Native interface for Vulkan method #123
    *  vkCmdResolveImage 
    * 
    * @param commandBuffer - 
    * @param srcImage - 
    * @param srcImageLayout - 
    * @param dstImage - 
    * @param dstImageLayout - 
    * @param regionCount - 
    * @param pRegions - 
    */
    private static native void vkCmdResolveImage0(
		long   commandBuffer,
		long   srcImage,
		int   srcImageLayout,
		long   dstImage,
		int   dstImageLayout,
		int  regionCount,
		ByteBuffer   pRegions);/* 
	vkCmdResolveImage(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkImage) reinterpret_cast<VkImage>(srcImage),
			(VkImageLayout) srcImageLayout,
			(VkImage) reinterpret_cast<VkImage>(dstImage),
			(VkImageLayout) dstImageLayout,
			(uint32_t) regionCount,
			(const VkImageResolve*) pRegions);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 124
    * <h2>Prototype</h2><pre>
    *  void  vkCmdSetEvent(
    *     VkCommandBuffer                             commandBuffer,
    *     VkEvent                                     event,
    *     VkPipelineStageFlags                        stageMask);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param event - Vulkan handle of type VkEvent 
    * @param stageMask int 
    */
   public static void vkCmdSetEvent(
		VkCommandBuffer commandBuffer,
		VkEvent event,
		int stageMask) {

	 vkCmdSetEvent0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		event.getNativeHandle() /* VkHandle */ ,
		stageMask  );

   } 

   /**
    *  Native interface for Vulkan method #124
    *  vkCmdSetEvent 
    * 
    * @param commandBuffer - 
    * @param event - 
    * @param stageMask - 
    */
    private static native void vkCmdSetEvent0(
		long   commandBuffer,
		long   event,
		int  stageMask);/* 
	vkCmdSetEvent(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkEvent) reinterpret_cast<VkEvent>(event),
			(VkPipelineStageFlags) stageMask);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 125
    * <h2>Prototype</h2><pre>
    *  void  vkCmdResetEvent(
    *     VkCommandBuffer                             commandBuffer,
    *     VkEvent                                     event,
    *     VkPipelineStageFlags                        stageMask);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param event - Vulkan handle of type VkEvent 
    * @param stageMask int 
    */
   public static void vkCmdResetEvent(
		VkCommandBuffer commandBuffer,
		VkEvent event,
		int stageMask) {

	 vkCmdResetEvent0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		event.getNativeHandle() /* VkHandle */ ,
		stageMask  );

   } 

   /**
    *  Native interface for Vulkan method #125
    *  vkCmdResetEvent 
    * 
    * @param commandBuffer - 
    * @param event - 
    * @param stageMask - 
    */
    private static native void vkCmdResetEvent0(
		long   commandBuffer,
		long   event,
		int  stageMask);/* 
	vkCmdResetEvent(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkEvent) reinterpret_cast<VkEvent>(event),
			(VkPipelineStageFlags) stageMask);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 126
    * <h2>Prototype</h2><pre>
    *  void  vkCmdWaitEvents(
    *     VkCommandBuffer                             commandBuffer,
    *     uint32_t                                    eventCount,
    *     const VkEvent*                              pEvents,
    *     VkPipelineStageFlags                        srcStageMask,
    *     VkPipelineStageFlags                        dstStageMask,
    *     uint32_t                                    memoryBarrierCount,
    *     const VkMemoryBarrier*                      pMemoryBarriers,
    *     uint32_t                                    bufferMemoryBarrierCount,
    *     const VkBufferMemoryBarrier*                pBufferMemoryBarriers,
    *     uint32_t                                    imageMemoryBarrierCount,
    *     const VkImageMemoryBarrier*                 pImageMemoryBarriers);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param eventCount - The length of array pEvents. 
    * @param pEvents - An array of  final VkEvent . 
    * @param srcStageMask int 
    * @param dstStageMask int 
    * @param memoryBarrierCount - The length of array pMemoryBarriers. 
    * @param pMemoryBarriers - An array of  final VkMemoryBarrier . 
    * @param bufferMemoryBarrierCount - The length of array pBufferMemoryBarriers. 
    * @param pBufferMemoryBarriers - An array of  final VkBufferMemoryBarrier . 
    * @param imageMemoryBarrierCount - The length of array pImageMemoryBarriers. 
    * @param pImageMemoryBarriers - An array of  final VkImageMemoryBarrier . 
    */
   public static void vkCmdWaitEvents(
		VkCommandBuffer commandBuffer,
		int eventCount,
		final VkEvent[] pEvents,
		int srcStageMask,
		int dstStageMask,
		int memoryBarrierCount,
		final VkMemoryBarrier[] pMemoryBarriers,
		int bufferMemoryBarrierCount,
		final VkBufferMemoryBarrier[] pBufferMemoryBarriers,
		int imageMemoryBarrierCount,
		final VkImageMemoryBarrier[] pImageMemoryBarriers) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkEvent> pEventsBuffer =
			 new BigBuffer<VkEvent>(pEvents, false);
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkMemoryBarrier> pMemoryBarriersBuff =
			 new BigBuffer<VkMemoryBarrier>(pMemoryBarriers, VkMemoryBarrier.getID());
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkBufferMemoryBarrier> pBufferMemoryBarriersBuff =
			 new BigBuffer<VkBufferMemoryBarrier>(pBufferMemoryBarriers, VkBufferMemoryBarrier.getID());
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkImageMemoryBarrier> pImageMemoryBarriersBuff =
			 new BigBuffer<VkImageMemoryBarrier>(pImageMemoryBarriers, VkImageMemoryBarrier.getID());

	 vkCmdWaitEvents0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		eventCount ,
		pEventsBuffer.getPointer() /*BigBuffer of VkHandle*/,
		srcStageMask ,
		dstStageMask ,
		memoryBarrierCount ,
		pMemoryBarriersBuff.getPointer() /*Buffer for Struct[]*/,
		bufferMemoryBarrierCount ,
		pBufferMemoryBarriersBuff.getPointer() /*Buffer for Struct[]*/,
		imageMemoryBarrierCount ,
		pImageMemoryBarriersBuff.getPointer() /*Buffer for Struct[]*/ );
	 pEventsBuffer.update();

   } 

   /**
    *  Native interface for Vulkan method #126
    *  vkCmdWaitEvents 
    * 
    * @param commandBuffer - 
    * @param eventCount - 
    * @param pEvents - 
    * @param srcStageMask - 
    * @param dstStageMask - 
    * @param memoryBarrierCount - 
    * @param pMemoryBarriers - 
    * @param bufferMemoryBarrierCount - 
    * @param pBufferMemoryBarriers - 
    * @param imageMemoryBarrierCount - 
    * @param pImageMemoryBarriers - 
    */
    private static native void vkCmdWaitEvents0(
		long   commandBuffer,
		int  eventCount,
		ByteBuffer   pEvents,
		int  srcStageMask,
		int  dstStageMask,
		int  memoryBarrierCount,
		ByteBuffer   pMemoryBarriers,
		int  bufferMemoryBarrierCount,
		ByteBuffer   pBufferMemoryBarriers,
		int  imageMemoryBarrierCount,
		ByteBuffer   pImageMemoryBarriers);/* 
	vkCmdWaitEvents(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(uint32_t) eventCount,
			(const VkEvent*) pEvents,
			(VkPipelineStageFlags) srcStageMask,
			(VkPipelineStageFlags) dstStageMask,
			(uint32_t) memoryBarrierCount,
			(const VkMemoryBarrier*) pMemoryBarriers,
			(uint32_t) bufferMemoryBarrierCount,
			(const VkBufferMemoryBarrier*) pBufferMemoryBarriers,
			(uint32_t) imageMemoryBarrierCount,
			(const VkImageMemoryBarrier*) pImageMemoryBarriers);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 127
    * <h2>Prototype</h2><pre>
    *  void  vkCmdPipelineBarrier(
    *     VkCommandBuffer                             commandBuffer,
    *     VkPipelineStageFlags                        srcStageMask,
    *     VkPipelineStageFlags                        dstStageMask,
    *     VkDependencyFlags                           dependencyFlags,
    *     uint32_t                                    memoryBarrierCount,
    *     const VkMemoryBarrier*                      pMemoryBarriers,
    *     uint32_t                                    bufferMemoryBarrierCount,
    *     const VkBufferMemoryBarrier*                pBufferMemoryBarriers,
    *     uint32_t                                    imageMemoryBarrierCount,
    *     const VkImageMemoryBarrier*                 pImageMemoryBarriers);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param srcStageMask int 
    * @param dstStageMask int 
    * @param dependencyFlags int 
    * @param memoryBarrierCount - The length of array pMemoryBarriers. 
    * @param pMemoryBarriers - An array of  final VkMemoryBarrier . 
    * @param bufferMemoryBarrierCount - The length of array pBufferMemoryBarriers. 
    * @param pBufferMemoryBarriers - An array of  final VkBufferMemoryBarrier . 
    * @param imageMemoryBarrierCount - The length of array pImageMemoryBarriers. 
    * @param pImageMemoryBarriers - An array of  final VkImageMemoryBarrier . 
    */
   public static void vkCmdPipelineBarrier(
		VkCommandBuffer commandBuffer,
		int srcStageMask,
		int dstStageMask,
		int dependencyFlags,
		int memoryBarrierCount,
		final VkMemoryBarrier[] pMemoryBarriers,
		int bufferMemoryBarrierCount,
		final VkBufferMemoryBarrier[] pBufferMemoryBarriers,
		int imageMemoryBarrierCount,
		final VkImageMemoryBarrier[] pImageMemoryBarriers) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkMemoryBarrier> pMemoryBarriersBuff =
			 new BigBuffer<VkMemoryBarrier>(pMemoryBarriers, VkMemoryBarrier.getID());
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkBufferMemoryBarrier> pBufferMemoryBarriersBuff =
			 new BigBuffer<VkBufferMemoryBarrier>(pBufferMemoryBarriers, VkBufferMemoryBarrier.getID());
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkImageMemoryBarrier> pImageMemoryBarriersBuff =
			 new BigBuffer<VkImageMemoryBarrier>(pImageMemoryBarriers, VkImageMemoryBarrier.getID());

	 vkCmdPipelineBarrier0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		srcStageMask ,
		dstStageMask ,
		dependencyFlags ,
		memoryBarrierCount ,
		pMemoryBarriersBuff.getPointer() /*Buffer for Struct[]*/,
		bufferMemoryBarrierCount ,
		pBufferMemoryBarriersBuff.getPointer() /*Buffer for Struct[]*/,
		imageMemoryBarrierCount ,
		pImageMemoryBarriersBuff.getPointer() /*Buffer for Struct[]*/ );

   } 

   /**
    *  Native interface for Vulkan method #127
    *  vkCmdPipelineBarrier 
    * 
    * @param commandBuffer - 
    * @param srcStageMask - 
    * @param dstStageMask - 
    * @param dependencyFlags - 
    * @param memoryBarrierCount - 
    * @param pMemoryBarriers - 
    * @param bufferMemoryBarrierCount - 
    * @param pBufferMemoryBarriers - 
    * @param imageMemoryBarrierCount - 
    * @param pImageMemoryBarriers - 
    */
    private static native void vkCmdPipelineBarrier0(
		long   commandBuffer,
		int  srcStageMask,
		int  dstStageMask,
		int  dependencyFlags,
		int  memoryBarrierCount,
		ByteBuffer   pMemoryBarriers,
		int  bufferMemoryBarrierCount,
		ByteBuffer   pBufferMemoryBarriers,
		int  imageMemoryBarrierCount,
		ByteBuffer   pImageMemoryBarriers);/* 
	vkCmdPipelineBarrier(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkPipelineStageFlags) srcStageMask,
			(VkPipelineStageFlags) dstStageMask,
			(VkDependencyFlags) dependencyFlags,
			(uint32_t) memoryBarrierCount,
			(const VkMemoryBarrier*) pMemoryBarriers,
			(uint32_t) bufferMemoryBarrierCount,
			(const VkBufferMemoryBarrier*) pBufferMemoryBarriers,
			(uint32_t) imageMemoryBarrierCount,
			(const VkImageMemoryBarrier*) pImageMemoryBarriers);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 128
    * <h2>Prototype</h2><pre>
    *  void  vkCmdBeginQuery(
    *     VkCommandBuffer                             commandBuffer,
    *     VkQueryPool                                 queryPool,
    *     uint32_t                                    query,
    *     VkQueryControlFlags                         flags);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param queryPool - Vulkan handle of type VkQueryPool 
    * @param query int 
    * @param flags int 
    */
   public static void vkCmdBeginQuery(
		VkCommandBuffer commandBuffer,
		VkQueryPool queryPool,
		int query,
		int flags) {

	 vkCmdBeginQuery0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		queryPool.getNativeHandle() /* VkHandle */ ,
		query ,
		flags  );

   } 

   /**
    *  Native interface for Vulkan method #128
    *  vkCmdBeginQuery 
    * 
    * @param commandBuffer - 
    * @param queryPool - 
    * @param query - 
    * @param flags - 
    */
    private static native void vkCmdBeginQuery0(
		long   commandBuffer,
		long   queryPool,
		int  query,
		int  flags);/* 
	vkCmdBeginQuery(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkQueryPool) reinterpret_cast<VkQueryPool>(queryPool),
			(uint32_t) query,
			(VkQueryControlFlags) flags);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 129
    * <h2>Prototype</h2><pre>
    *  void  vkCmdEndQuery(
    *     VkCommandBuffer                             commandBuffer,
    *     VkQueryPool                                 queryPool,
    *     uint32_t                                    query);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param queryPool - Vulkan handle of type VkQueryPool 
    * @param query int 
    */
   public static void vkCmdEndQuery(
		VkCommandBuffer commandBuffer,
		VkQueryPool queryPool,
		int query) {

	 vkCmdEndQuery0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		queryPool.getNativeHandle() /* VkHandle */ ,
		query  );

   } 

   /**
    *  Native interface for Vulkan method #129
    *  vkCmdEndQuery 
    * 
    * @param commandBuffer - 
    * @param queryPool - 
    * @param query - 
    */
    private static native void vkCmdEndQuery0(
		long   commandBuffer,
		long   queryPool,
		int  query);/* 
	vkCmdEndQuery(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkQueryPool) reinterpret_cast<VkQueryPool>(queryPool),
			(uint32_t) query);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 130
    * <h2>Prototype</h2><pre>
    *  void  vkCmdResetQueryPool(
    *     VkCommandBuffer                             commandBuffer,
    *     VkQueryPool                                 queryPool,
    *     uint32_t                                    firstQuery,
    *     uint32_t                                    queryCount);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param queryPool - Vulkan handle of type VkQueryPool 
    * @param firstQuery int 
    * @param queryCount - Length of query. 
    */
   public static void vkCmdResetQueryPool(
		VkCommandBuffer commandBuffer,
		VkQueryPool queryPool,
		int firstQuery,
		int queryCount) {

	 vkCmdResetQueryPool0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		queryPool.getNativeHandle() /* VkHandle */ ,
		firstQuery ,
		queryCount  );

   } 

   /**
    *  Native interface for Vulkan method #130
    *  vkCmdResetQueryPool 
    * 
    * @param commandBuffer - 
    * @param queryPool - 
    * @param firstQuery - 
    * @param queryCount - 
    */
    private static native void vkCmdResetQueryPool0(
		long   commandBuffer,
		long   queryPool,
		int  firstQuery,
		int  queryCount);/* 
	vkCmdResetQueryPool(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkQueryPool) reinterpret_cast<VkQueryPool>(queryPool),
			(uint32_t) firstQuery,
			(uint32_t) queryCount);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 131
    * <h2>Prototype</h2><pre>
    *  void  vkCmdWriteTimestamp(
    *     VkCommandBuffer                             commandBuffer,
    *     VkPipelineStageFlagBits                     pipelineStage,
    *     VkQueryPool                                 queryPool,
    *     uint32_t                                    query);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param pipelineStage - Vulkan enumeration of type VkPipelineStageFlagBits 
    * @param queryPool - Vulkan handle of type VkQueryPool 
    * @param query int 
    */
   public static void vkCmdWriteTimestamp(
		VkCommandBuffer commandBuffer,
		VkPipelineStageFlagBits pipelineStage,
		VkQueryPool queryPool,
		int query) {

	 vkCmdWriteTimestamp0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		pipelineStage.getValue() /* VkEnum */,
		queryPool.getNativeHandle() /* VkHandle */ ,
		query  );

   } 

   /**
    *  Native interface for Vulkan method #131
    *  vkCmdWriteTimestamp 
    * 
    * @param commandBuffer - 
    * @param pipelineStage - 
    * @param queryPool - 
    * @param query - 
    */
    private static native void vkCmdWriteTimestamp0(
		long   commandBuffer,
		int   pipelineStage,
		long   queryPool,
		int  query);/* 
	vkCmdWriteTimestamp(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkPipelineStageFlagBits) pipelineStage,
			(VkQueryPool) reinterpret_cast<VkQueryPool>(queryPool),
			(uint32_t) query);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 132
    * <h2>Prototype</h2><pre>
    *  void  vkCmdCopyQueryPoolResults(
    *     VkCommandBuffer                             commandBuffer,
    *     VkQueryPool                                 queryPool,
    *     uint32_t                                    firstQuery,
    *     uint32_t                                    queryCount,
    *     VkBuffer                                    dstBuffer,
    *     VkDeviceSize                                dstOffset,
    *     VkDeviceSize                                stride,
    *     VkQueryResultFlags                          flags);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param queryPool - Vulkan handle of type VkQueryPool 
    * @param firstQuery int 
    * @param queryCount - The length of array dstBuffer. 
    * @param dstBuffer - Vulkan handle of type VkBuffer 
    * @param dstOffset long 
    * @param stride long 
    * @param flags int 
    */
   public static void vkCmdCopyQueryPoolResults(
		VkCommandBuffer commandBuffer,
		VkQueryPool queryPool,
		int firstQuery,
		int queryCount,
		VkBuffer dstBuffer,
		long dstOffset,
		long stride,
		int flags) {

	 vkCmdCopyQueryPoolResults0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		queryPool.getNativeHandle() /* VkHandle */ ,
		firstQuery ,
		queryCount ,
		dstBuffer.getNativeHandle() /* VkHandle */ ,
		dstOffset ,
		stride ,
		flags  );

   } 

   /**
    *  Native interface for Vulkan method #132
    *  vkCmdCopyQueryPoolResults 
    * 
    * @param commandBuffer - 
    * @param queryPool - 
    * @param firstQuery - 
    * @param queryCount - 
    * @param dstBuffer - 
    * @param dstOffset - 
    * @param stride - 
    * @param flags - 
    */
    private static native void vkCmdCopyQueryPoolResults0(
		long   commandBuffer,
		long   queryPool,
		int  firstQuery,
		int  queryCount,
		long   dstBuffer,
		long  dstOffset,
		long  stride,
		int  flags);/* 
	vkCmdCopyQueryPoolResults(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkQueryPool) reinterpret_cast<VkQueryPool>(queryPool),
			(uint32_t) firstQuery,
			(uint32_t) queryCount,
			(VkBuffer) reinterpret_cast<VkBuffer>(dstBuffer),
			(VkDeviceSize) dstOffset,
			(VkDeviceSize) stride,
			(VkQueryResultFlags) flags);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 133
    * <h2>Prototype</h2><pre>
    *  void  vkCmdPushConstants(
    *     VkCommandBuffer                             commandBuffer,
    *     VkPipelineLayout                            layout,
    *     VkShaderStageFlags                          stageFlags,
    *     uint32_t                                    offset,
    *     uint32_t                                    size,
    *     const void*                                 pValues);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param layout - Vulkan handle of type VkPipelineLayout 
    * @param stageFlags int 
    * @param offset int 
    * @param size int 
    * @param pValues java.nio.Buffer 
    */
   public static void vkCmdPushConstants(
		VkCommandBuffer commandBuffer,
		VkPipelineLayout layout,
		int stageFlags,
		int offset,
		int size,
		java.nio.Buffer pValues) {

	 vkCmdPushConstants0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		layout.getNativeHandle() /* VkHandle */ ,
		stageFlags ,
		offset ,
		size ,
		pValues  );

   } 

   /**
    *  Native interface for Vulkan method #133
    *  vkCmdPushConstants 
    * 
    * @param commandBuffer - 
    * @param layout - 
    * @param stageFlags - 
    * @param offset - 
    * @param size - 
    * @param pValues - 
    */
    private static native void vkCmdPushConstants0(
		long   commandBuffer,
		long   layout,
		int  stageFlags,
		int  offset,
		int  size,
		java.nio.Buffer  pValues);/* 
	vkCmdPushConstants(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkPipelineLayout) reinterpret_cast<VkPipelineLayout>(layout),
			(VkShaderStageFlags) stageFlags,
			(uint32_t) offset,
			(uint32_t) size,
			(const void*) pValues);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 134
    * <h2>Prototype</h2><pre>
    *  void  vkCmdBeginRenderPass(
    *     VkCommandBuffer                             commandBuffer,
    *     const VkRenderPassBeginInfo*                pRenderPassBegin,
    *     VkSubpassContents                           contents);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param pRenderPassBegin - Vulkan Struct of type  final VkRenderPassBeginInfo 
    * @param contents - Vulkan enumeration of type VkSubpassContents 
    */
   public static void vkCmdBeginRenderPass(
		VkCommandBuffer commandBuffer,
		final VkRenderPassBeginInfo pRenderPassBegin,
		VkSubpassContents contents) {

	 vkCmdBeginRenderPass0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		pRenderPassBegin.getPointer() /* Struct */,
		contents.getValue() /* VkEnum */ );

   } 

   /**
    *  Native interface for Vulkan method #134
    *  vkCmdBeginRenderPass 
    * 
    * @param commandBuffer - 
    * @param pRenderPassBegin - 
    * @param contents - 
    */
    private static native void vkCmdBeginRenderPass0(
		long   commandBuffer,
		ByteBuffer   pRenderPassBegin,
		int   contents);/* 
	vkCmdBeginRenderPass(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(const VkRenderPassBeginInfo*) pRenderPassBegin,
			(VkSubpassContents) contents);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 135
    * <h2>Prototype</h2><pre>
    *  void  vkCmdNextSubpass(
    *     VkCommandBuffer                             commandBuffer,
    *     VkSubpassContents                           contents);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param contents - Vulkan enumeration of type VkSubpassContents 
    */
   public static void vkCmdNextSubpass(
		VkCommandBuffer commandBuffer,
		VkSubpassContents contents) {

	 vkCmdNextSubpass0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		contents.getValue() /* VkEnum */ );

   } 

   /**
    *  Native interface for Vulkan method #135
    *  vkCmdNextSubpass 
    * 
    * @param commandBuffer - 
    * @param contents - 
    */
    private static native void vkCmdNextSubpass0(
		long   commandBuffer,
		int   contents);/* 
	vkCmdNextSubpass(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkSubpassContents) contents);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 136
    * <h2>Prototype</h2><pre>
    *  void  vkCmdEndRenderPass(
    *     VkCommandBuffer                             commandBuffer);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    */
   public static void vkCmdEndRenderPass(
		VkCommandBuffer commandBuffer) {

	 vkCmdEndRenderPass0(
		commandBuffer.getNativeHandle() /* VkHandle */  );

   } 

   /**
    *  Native interface for Vulkan method #136
    *  vkCmdEndRenderPass 
    * 
    * @param commandBuffer - 
    */
    private static native void vkCmdEndRenderPass0(
		long   commandBuffer);/* 
	vkCmdEndRenderPass(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer));

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 137
    * <h2>Prototype</h2><pre>
    *  void  vkCmdExecuteCommands(
    *     VkCommandBuffer                             commandBuffer,
    *     uint32_t                                    commandBufferCount,
    *     const VkCommandBuffer*                      pCommandBuffers);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param commandBufferCount - The length of array pCommandBuffers. 
    * @param pCommandBuffers - An array of  final VkCommandBuffer . 
    */
   public static void vkCmdExecuteCommands(
		VkCommandBuffer commandBuffer,
		int commandBufferCount,
		final VkCommandBuffer[] pCommandBuffers) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkCommandBuffer> pCommandBuffersBuffer =
			 new BigBuffer<VkCommandBuffer>(pCommandBuffers, true);
	 vkCmdExecuteCommands0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		commandBufferCount ,
		pCommandBuffersBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pCommandBuffersBuffer.update();

   } 

   /**
    *  Native interface for Vulkan method #137
    *  vkCmdExecuteCommands 
    * 
    * @param commandBuffer - 
    * @param commandBufferCount - 
    * @param pCommandBuffers - 
    */
    private static native void vkCmdExecuteCommands0(
		long   commandBuffer,
		int  commandBufferCount,
		ByteBuffer   pCommandBuffers);/* 
	vkCmdExecuteCommands(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(uint32_t) commandBufferCount,
			(const VkCommandBuffer*) pCommandBuffers);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 138
    * <h2>Prototype</h2><pre>
    *  void  vkDestroySurfaceKHR(
    *     VkInstance                                  instance,
    *     VkSurfaceKHR                                surface,
    *     const VkAllocationCallbacks*                pAllocator);
    * </pre>
    * 
    * @param instance - Vulkan handle of type VkInstance 
    * @param surface - Vulkan handle of type VkSurfaceKHR 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    */
   public static void vkDestroySurfaceKHR(
		VkInstance instance,
		VkSurfaceKHR surface,
		final VkAllocationCallbacks pAllocator) {

	 vkDestroySurfaceKHR0(
		instance.getNativeHandle() /* VkHandle */ ,
		surface.getNativeHandle() /* VkHandle */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */  );

   } 

   /**
    *  Native interface for Vulkan method #138
    *  vkDestroySurfaceKHR 
    * 
    * @param instance - 
    * @param surface - 
    * @param pAllocator - 
    */
    private static native void vkDestroySurfaceKHR0(
		long   instance,
		long   surface,
		ByteBuffer   pAllocator);/* 
	vkDestroySurfaceKHR(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(VkSurfaceKHR) reinterpret_cast<VkSurfaceKHR>(surface),
			(const VkAllocationCallbacks*) pAllocator);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 139
    * <h2>Prototype</h2><pre>
    *  VkResult  vkGetPhysicalDeviceSurfaceSupportKHR(
    *     VkPhysicalDevice                            physicalDevice,
    *     uint32_t                                    queueFamilyIndex,
    *     VkSurfaceKHR                                surface,
    *     VkBool32*                                   pSupported);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param queueFamilyIndex int 
    * @param surface - Vulkan handle of type VkSurfaceKHR 
    * @param pSupported - An array of boolean. 
    * 
    * @return VkResult
    */
   public static VkResult vkGetPhysicalDeviceSurfaceSupportKHR(
		VkPhysicalDevice physicalDevice,
		int queueFamilyIndex,
		VkSurfaceKHR surface,
		boolean[] pSupported) {

	 int  _val = vkGetPhysicalDeviceSurfaceSupportKHR0(
			physicalDevice.getNativeHandle() /* VkHandle */ ,
			queueFamilyIndex ,
			surface.getNativeHandle() /* VkHandle */ ,
			pSupported  );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #139
    *  vkGetPhysicalDeviceSurfaceSupportKHR 
    * 
    * @param physicalDevice - 
    * @param queueFamilyIndex - 
    * @param surface - 
    * @param pSupported - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkGetPhysicalDeviceSurfaceSupportKHR0(
		long   physicalDevice,
		int  queueFamilyIndex,
		long   surface,
		boolean[]   pSupported);/* 
	VkResult res = vkGetPhysicalDeviceSurfaceSupportKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(uint32_t) queueFamilyIndex,
			(VkSurfaceKHR) reinterpret_cast<VkSurfaceKHR>(surface),
			(VkBool32*) pSupported);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 140
    * <h2>Prototype</h2><pre>
    *  VkResult  vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
    *     VkPhysicalDevice                            physicalDevice,
    *     VkSurfaceKHR                                surface,
    *     VkSurfaceCapabilitiesKHR*                   pSurfaceCapabilities);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param surface - Vulkan handle of type VkSurfaceKHR 
    * @param pSurfaceCapabilities - Vulkan Struct of type  VkSurfaceCapabilitiesKHR  
    * 
    * @return VkResult
    */
   public static VkResult vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
		VkPhysicalDevice physicalDevice,
		VkSurfaceKHR surface,
		VkSurfaceCapabilitiesKHR pSurfaceCapabilities) {

	 int  _val = vkGetPhysicalDeviceSurfaceCapabilitiesKHR0(
			physicalDevice.getNativeHandle() /* VkHandle */ ,
			surface.getNativeHandle() /* VkHandle */ ,
			pSurfaceCapabilities.getPointer() /* Struct */ );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #140
    *  vkGetPhysicalDeviceSurfaceCapabilitiesKHR 
    * 
    * @param physicalDevice - 
    * @param surface - 
    * @param pSurfaceCapabilities - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkGetPhysicalDeviceSurfaceCapabilitiesKHR0(
		long   physicalDevice,
		long   surface,
		ByteBuffer   pSurfaceCapabilities);/* 
	VkResult res = vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(VkSurfaceKHR) reinterpret_cast<VkSurfaceKHR>(surface),
			(VkSurfaceCapabilitiesKHR*) pSurfaceCapabilities);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 141
    * <h2>Prototype</h2><pre>
    *  VkResult  vkGetPhysicalDeviceSurfaceFormatsKHR(
    *     VkPhysicalDevice                            physicalDevice,
    *     VkSurfaceKHR                                surface,
    *     uint32_t*                                   pSurfaceFormatCount,
    *     VkSurfaceFormatKHR*                         pSurfaceFormats);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param surface - Vulkan handle of type VkSurfaceKHR 
    * @param pSurfaceFormatCount - The length of array pSurfaceFormats. 
    * @param pSurfaceFormats - An array of  VkSurfaceFormatKHR . 
    * 
    * @return VkResult
    */
   public static VkResult vkGetPhysicalDeviceSurfaceFormatsKHR(
		VkPhysicalDevice physicalDevice,
		VkSurfaceKHR surface,
		int[] pSurfaceFormatCount,
		VkSurfaceFormatKHR[] pSurfaceFormats) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkSurfaceFormatKHR> pSurfaceFormatsBuff =
			 new BigBuffer<VkSurfaceFormatKHR>(pSurfaceFormats, VkSurfaceFormatKHR.getID());

	 int  _val = vkGetPhysicalDeviceSurfaceFormatsKHR0(
			physicalDevice.getNativeHandle() /* VkHandle */ ,
			surface.getNativeHandle() /* VkHandle */ ,
			pSurfaceFormatCount ,
			pSurfaceFormatsBuff.getPointer() /*Buffer for Struct[]*/ );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #141
    *  vkGetPhysicalDeviceSurfaceFormatsKHR 
    * 
    * @param physicalDevice - 
    * @param surface - 
    * @param pSurfaceFormatCount - 
    * @param pSurfaceFormats - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkGetPhysicalDeviceSurfaceFormatsKHR0(
		long   physicalDevice,
		long   surface,
		int[]  pSurfaceFormatCount,
		ByteBuffer   pSurfaceFormats);/* 
	VkResult res = vkGetPhysicalDeviceSurfaceFormatsKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(VkSurfaceKHR) reinterpret_cast<VkSurfaceKHR>(surface),
			(uint32_t*) pSurfaceFormatCount,
			(VkSurfaceFormatKHR*) pSurfaceFormats);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 142
    * <h2>Prototype</h2><pre>
    *  VkResult  vkGetPhysicalDeviceSurfacePresentModesKHR(
    *     VkPhysicalDevice                            physicalDevice,
    *     VkSurfaceKHR                                surface,
    *     uint32_t*                                   pPresentModeCount,
    *     VkPresentModeKHR*                           pPresentModes);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param surface - Vulkan handle of type VkSurfaceKHR 
    * @param pPresentModeCount - The length of array pPresentModes. 
    * @param pPresentModes - An array of  VkPresentModeKHR . 
    * 
    * @return VkResult
    */
   public static VkResult vkGetPhysicalDeviceSurfacePresentModesKHR(
		VkPhysicalDevice physicalDevice,
		VkSurfaceKHR surface,
		int[] pPresentModeCount,
		VkPresentModeKHR[] pPresentModes) {
	 // Wrap VkEnum array in a int[] 
	 int[] pPresentModesEnumArr =  prepare(pPresentModes);

	 int  _val = vkGetPhysicalDeviceSurfacePresentModesKHR0(
			physicalDevice.getNativeHandle() /* VkHandle */ ,
			surface.getNativeHandle() /* VkHandle */ ,
			pPresentModeCount ,
			pPresentModesEnumArr /* VkEnum[] as int[] */ );

	 for(int i=0; i < pPresentModes.length; i++){
	    pPresentModes[i] = VkPresentModeKHR.fromValue(pPresentModesEnumArr[i]);
	  }
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #142
    *  vkGetPhysicalDeviceSurfacePresentModesKHR 
    * 
    * @param physicalDevice - 
    * @param surface - 
    * @param pPresentModeCount - 
    * @param pPresentModes - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkGetPhysicalDeviceSurfacePresentModesKHR0(
		long   physicalDevice,
		long   surface,
		int[]  pPresentModeCount,
		int[]   pPresentModes);/* 
	VkResult res = vkGetPhysicalDeviceSurfacePresentModesKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(VkSurfaceKHR) reinterpret_cast<VkSurfaceKHR>(surface),
			(uint32_t*) pPresentModeCount,
			(VkPresentModeKHR*) pPresentModes);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 143
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateSwapchainKHR(
    *     VkDevice                                    device,
    *     const VkSwapchainCreateInfoKHR*             pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkSwapchainKHR*                             pSwapchain);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pCreateInfo - Vulkan Struct of type  final VkSwapchainCreateInfoKHR 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pSwapchain - An array of  VkSwapchainKHR . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateSwapchainKHR(
		VkDevice device,
		final VkSwapchainCreateInfoKHR pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkSwapchainKHR[] pSwapchain) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkSwapchainKHR> pSwapchainBuffer =
			 new BigBuffer<VkSwapchainKHR>(pSwapchain, false);
	 int  _val = vkCreateSwapchainKHR0(
			device.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pSwapchainBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pSwapchainBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #143
    *  vkCreateSwapchainKHR 
    * 
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pSwapchain - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateSwapchainKHR0(
		long   device,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pSwapchain);/* 
	VkResult res = vkCreateSwapchainKHR(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkSwapchainCreateInfoKHR*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSwapchainKHR*) pSwapchain);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 144
    * <h2>Prototype</h2><pre>
    *  void  vkDestroySwapchainKHR(
    *     VkDevice                                    device,
    *     VkSwapchainKHR                              swapchain,
    *     const VkAllocationCallbacks*                pAllocator);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param swapchain - Vulkan handle of type VkSwapchainKHR 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    */
   public static void vkDestroySwapchainKHR(
		VkDevice device,
		VkSwapchainKHR swapchain,
		final VkAllocationCallbacks pAllocator) {

	 vkDestroySwapchainKHR0(
		device.getNativeHandle() /* VkHandle */ ,
		swapchain.getNativeHandle() /* VkHandle */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */  );

   } 

   /**
    *  Native interface for Vulkan method #144
    *  vkDestroySwapchainKHR 
    * 
    * @param device - 
    * @param swapchain - 
    * @param pAllocator - 
    */
    private static native void vkDestroySwapchainKHR0(
		long   device,
		long   swapchain,
		ByteBuffer   pAllocator);/* 
	vkDestroySwapchainKHR(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkSwapchainKHR) reinterpret_cast<VkSwapchainKHR>(swapchain),
			(const VkAllocationCallbacks*) pAllocator);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 145
    * <h2>Prototype</h2><pre>
    *  VkResult  vkGetSwapchainImagesKHR(
    *     VkDevice                                    device,
    *     VkSwapchainKHR                              swapchain,
    *     uint32_t*                                   pSwapchainImageCount,
    *     VkImage*                                    pSwapchainImages);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param swapchain - Vulkan handle of type VkSwapchainKHR 
    * @param pSwapchainImageCount - The length of array pSwapchainImages. 
    * @param pSwapchainImages - An array of  VkImage . 
    * 
    * @return VkResult
    */
   public static VkResult vkGetSwapchainImagesKHR(
		VkDevice device,
		VkSwapchainKHR swapchain,
		int[] pSwapchainImageCount,
		VkImage[] pSwapchainImages) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkImage> pSwapchainImagesBuffer =
			 new BigBuffer<VkImage>(pSwapchainImages, false);
	 int  _val = vkGetSwapchainImagesKHR0(
			device.getNativeHandle() /* VkHandle */ ,
			swapchain.getNativeHandle() /* VkHandle */ ,
			pSwapchainImageCount ,
			pSwapchainImagesBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pSwapchainImagesBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #145
    *  vkGetSwapchainImagesKHR 
    * 
    * @param device - 
    * @param swapchain - 
    * @param pSwapchainImageCount - 
    * @param pSwapchainImages - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkGetSwapchainImagesKHR0(
		long   device,
		long   swapchain,
		int[]  pSwapchainImageCount,
		ByteBuffer   pSwapchainImages);/* 
	VkResult res = vkGetSwapchainImagesKHR(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkSwapchainKHR) reinterpret_cast<VkSwapchainKHR>(swapchain),
			(uint32_t*) pSwapchainImageCount,
			(VkImage*) pSwapchainImages);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 146
    * <h2>Prototype</h2><pre>
    *  VkResult  vkAcquireNextImageKHR(
    *     VkDevice                                    device,
    *     VkSwapchainKHR                              swapchain,
    *     uint64_t                                    timeout,
    *     VkSemaphore                                 semaphore,
    *     VkFence                                     fence,
    *     uint32_t*                                   pImageIndex);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param swapchain - Vulkan handle of type VkSwapchainKHR 
    * @param timeout long 
    * @param semaphore - Vulkan handle of type VkSemaphore 
    * @param fence - Vulkan handle of type VkFence 
    * @param pImageIndex - An array of int. 
    * 
    * @return VkResult
    */
   public static VkResult vkAcquireNextImageKHR(
		VkDevice device,
		VkSwapchainKHR swapchain,
		long timeout,
		VkSemaphore semaphore,
		VkFence fence,
		int[] pImageIndex) {

	 int  _val = vkAcquireNextImageKHR0(
			device.getNativeHandle() /* VkHandle */ ,
			swapchain.getNativeHandle() /* VkHandle */ ,
			timeout ,
			semaphore.getNativeHandle() /* VkHandle */ ,
			fence.getNativeHandle() /* VkHandle */ ,
			pImageIndex  );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #146
    *  vkAcquireNextImageKHR 
    * 
    * @param device - 
    * @param swapchain - 
    * @param timeout - 
    * @param semaphore - 
    * @param fence - 
    * @param pImageIndex - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkAcquireNextImageKHR0(
		long   device,
		long   swapchain,
		long  timeout,
		long   semaphore,
		long   fence,
		int[]  pImageIndex);/* 
	VkResult res = vkAcquireNextImageKHR(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkSwapchainKHR) reinterpret_cast<VkSwapchainKHR>(swapchain),
			(uint64_t) timeout,
			(VkSemaphore) reinterpret_cast<VkSemaphore>(semaphore),
			(VkFence) reinterpret_cast<VkFence>(fence),
			(uint32_t*) pImageIndex);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 147
    * <h2>Prototype</h2><pre>
    *  VkResult  vkQueuePresentKHR(
    *     VkQueue                                     queue,
    *     const VkPresentInfoKHR*                     pPresentInfo);
    * </pre>
    * 
    * @param queue - Vulkan handle of type VkQueue 
    * @param pPresentInfo - Vulkan Struct of type  final VkPresentInfoKHR 
    * 
    * @return VkResult
    */
   public static VkResult vkQueuePresentKHR(
		VkQueue queue,
		final VkPresentInfoKHR pPresentInfo) {

	 int  _val = vkQueuePresentKHR0(
			queue.getNativeHandle() /* VkHandle */ ,
			pPresentInfo.getPointer() /* Struct */ );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #147
    *  vkQueuePresentKHR 
    * 
    * @param queue - 
    * @param pPresentInfo - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkQueuePresentKHR0(
		long   queue,
		ByteBuffer   pPresentInfo);/* 
	VkResult res = vkQueuePresentKHR(
			(VkQueue) reinterpret_cast<VkQueue>(queue),
			(const VkPresentInfoKHR*) pPresentInfo);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 148
    * <h2>Prototype</h2><pre>
    *  VkResult  vkGetPhysicalDeviceDisplayPropertiesKHR(
    *     VkPhysicalDevice                            physicalDevice,
    *     uint32_t*                                   pPropertyCount,
    *     VkDisplayPropertiesKHR*                     pProperties);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param pPropertyCount - The length of array pProperties. 
    * @param pProperties - An array of  VkDisplayPropertiesKHR . 
    * 
    * @return VkResult
    */
   public static VkResult vkGetPhysicalDeviceDisplayPropertiesKHR(
		VkPhysicalDevice physicalDevice,
		int[] pPropertyCount,
		VkDisplayPropertiesKHR[] pProperties) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkDisplayPropertiesKHR> pPropertiesBuff =
			 new BigBuffer<VkDisplayPropertiesKHR>(pProperties, VkDisplayPropertiesKHR.getID());

	 int  _val = vkGetPhysicalDeviceDisplayPropertiesKHR0(
			physicalDevice.getNativeHandle() /* VkHandle */ ,
			pPropertyCount ,
			pPropertiesBuff.getPointer() /*Buffer for Struct[]*/ );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #148
    *  vkGetPhysicalDeviceDisplayPropertiesKHR 
    * 
    * @param physicalDevice - 
    * @param pPropertyCount - 
    * @param pProperties - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkGetPhysicalDeviceDisplayPropertiesKHR0(
		long   physicalDevice,
		int[]  pPropertyCount,
		ByteBuffer   pProperties);/* 
	VkResult res = vkGetPhysicalDeviceDisplayPropertiesKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(uint32_t*) pPropertyCount,
			(VkDisplayPropertiesKHR*) pProperties);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 149
    * <h2>Prototype</h2><pre>
    *  VkResult  vkGetPhysicalDeviceDisplayPlanePropertiesKHR(
    *     VkPhysicalDevice                            physicalDevice,
    *     uint32_t*                                   pPropertyCount,
    *     VkDisplayPlanePropertiesKHR*                pProperties);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param pPropertyCount - The length of array pProperties. 
    * @param pProperties - An array of  VkDisplayPlanePropertiesKHR . 
    * 
    * @return VkResult
    */
   public static VkResult vkGetPhysicalDeviceDisplayPlanePropertiesKHR(
		VkPhysicalDevice physicalDevice,
		int[] pPropertyCount,
		VkDisplayPlanePropertiesKHR[] pProperties) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkDisplayPlanePropertiesKHR> pPropertiesBuff =
			 new BigBuffer<VkDisplayPlanePropertiesKHR>(pProperties, VkDisplayPlanePropertiesKHR.getID());

	 int  _val = vkGetPhysicalDeviceDisplayPlanePropertiesKHR0(
			physicalDevice.getNativeHandle() /* VkHandle */ ,
			pPropertyCount ,
			pPropertiesBuff.getPointer() /*Buffer for Struct[]*/ );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #149
    *  vkGetPhysicalDeviceDisplayPlanePropertiesKHR 
    * 
    * @param physicalDevice - 
    * @param pPropertyCount - 
    * @param pProperties - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkGetPhysicalDeviceDisplayPlanePropertiesKHR0(
		long   physicalDevice,
		int[]  pPropertyCount,
		ByteBuffer   pProperties);/* 
	VkResult res = vkGetPhysicalDeviceDisplayPlanePropertiesKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(uint32_t*) pPropertyCount,
			(VkDisplayPlanePropertiesKHR*) pProperties);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 150
    * <h2>Prototype</h2><pre>
    *  VkResult  vkGetDisplayPlaneSupportedDisplaysKHR(
    *     VkPhysicalDevice                            physicalDevice,
    *     uint32_t                                    planeIndex,
    *     uint32_t*                                   pDisplayCount,
    *     VkDisplayKHR*                               pDisplays);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param planeIndex int 
    * @param pDisplayCount - The length of array pDisplays. 
    * @param pDisplays - An array of  VkDisplayKHR . 
    * 
    * @return VkResult
    */
   public static VkResult vkGetDisplayPlaneSupportedDisplaysKHR(
		VkPhysicalDevice physicalDevice,
		int planeIndex,
		int[] pDisplayCount,
		VkDisplayKHR[] pDisplays) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkDisplayKHR> pDisplaysBuffer =
			 new BigBuffer<VkDisplayKHR>(pDisplays, false);
	 int  _val = vkGetDisplayPlaneSupportedDisplaysKHR0(
			physicalDevice.getNativeHandle() /* VkHandle */ ,
			planeIndex ,
			pDisplayCount ,
			pDisplaysBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pDisplaysBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #150
    *  vkGetDisplayPlaneSupportedDisplaysKHR 
    * 
    * @param physicalDevice - 
    * @param planeIndex - 
    * @param pDisplayCount - 
    * @param pDisplays - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkGetDisplayPlaneSupportedDisplaysKHR0(
		long   physicalDevice,
		int  planeIndex,
		int[]  pDisplayCount,
		ByteBuffer   pDisplays);/* 
	VkResult res = vkGetDisplayPlaneSupportedDisplaysKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(uint32_t) planeIndex,
			(uint32_t*) pDisplayCount,
			(VkDisplayKHR*) pDisplays);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 151
    * <h2>Prototype</h2><pre>
    *  VkResult  vkGetDisplayModePropertiesKHR(
    *     VkPhysicalDevice                            physicalDevice,
    *     VkDisplayKHR                                display,
    *     uint32_t*                                   pPropertyCount,
    *     VkDisplayModePropertiesKHR*                 pProperties);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param display - Vulkan handle of type VkDisplayKHR 
    * @param pPropertyCount - The length of array pProperties. 
    * @param pProperties - An array of  VkDisplayModePropertiesKHR . 
    * 
    * @return VkResult
    */
   public static VkResult vkGetDisplayModePropertiesKHR(
		VkPhysicalDevice physicalDevice,
		VkDisplayKHR display,
		int[] pPropertyCount,
		VkDisplayModePropertiesKHR[] pProperties) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkDisplayModePropertiesKHR> pPropertiesBuff =
			 new BigBuffer<VkDisplayModePropertiesKHR>(pProperties, VkDisplayModePropertiesKHR.getID());

	 int  _val = vkGetDisplayModePropertiesKHR0(
			physicalDevice.getNativeHandle() /* VkHandle */ ,
			display.getNativeHandle() /* VkHandle */ ,
			pPropertyCount ,
			pPropertiesBuff.getPointer() /*Buffer for Struct[]*/ );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #151
    *  vkGetDisplayModePropertiesKHR 
    * 
    * @param physicalDevice - 
    * @param display - 
    * @param pPropertyCount - 
    * @param pProperties - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkGetDisplayModePropertiesKHR0(
		long   physicalDevice,
		long   display,
		int[]  pPropertyCount,
		ByteBuffer   pProperties);/* 
	VkResult res = vkGetDisplayModePropertiesKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(VkDisplayKHR) reinterpret_cast<VkDisplayKHR>(display),
			(uint32_t*) pPropertyCount,
			(VkDisplayModePropertiesKHR*) pProperties);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 152
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateDisplayModeKHR(
    *     VkPhysicalDevice                            physicalDevice,
    *     VkDisplayKHR                                display,
    *     const VkDisplayModeCreateInfoKHR*           pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkDisplayModeKHR*                           pMode);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param display - Vulkan handle of type VkDisplayKHR 
    * @param pCreateInfo - Vulkan Struct of type  final VkDisplayModeCreateInfoKHR 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pMode - An array of  VkDisplayModeKHR . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateDisplayModeKHR(
		VkPhysicalDevice physicalDevice,
		VkDisplayKHR display,
		final VkDisplayModeCreateInfoKHR pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkDisplayModeKHR[] pMode) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkDisplayModeKHR> pModeBuffer =
			 new BigBuffer<VkDisplayModeKHR>(pMode, false);
	 int  _val = vkCreateDisplayModeKHR0(
			physicalDevice.getNativeHandle() /* VkHandle */ ,
			display.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pModeBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pModeBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #152
    *  vkCreateDisplayModeKHR 
    * 
    * @param physicalDevice - 
    * @param display - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pMode - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateDisplayModeKHR0(
		long   physicalDevice,
		long   display,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pMode);/* 
	VkResult res = vkCreateDisplayModeKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(VkDisplayKHR) reinterpret_cast<VkDisplayKHR>(display),
			(const VkDisplayModeCreateInfoKHR*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkDisplayModeKHR*) pMode);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 153
    * <h2>Prototype</h2><pre>
    *  VkResult  vkGetDisplayPlaneCapabilitiesKHR(
    *     VkPhysicalDevice                            physicalDevice,
    *     VkDisplayModeKHR                            mode,
    *     uint32_t                                    planeIndex,
    *     VkDisplayPlaneCapabilitiesKHR*              pCapabilities);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param mode - Vulkan handle of type VkDisplayModeKHR 
    * @param planeIndex int 
    * @param pCapabilities - Vulkan Struct of type  VkDisplayPlaneCapabilitiesKHR  
    * 
    * @return VkResult
    */
   public static VkResult vkGetDisplayPlaneCapabilitiesKHR(
		VkPhysicalDevice physicalDevice,
		VkDisplayModeKHR mode,
		int planeIndex,
		VkDisplayPlaneCapabilitiesKHR pCapabilities) {

	 int  _val = vkGetDisplayPlaneCapabilitiesKHR0(
			physicalDevice.getNativeHandle() /* VkHandle */ ,
			mode.getNativeHandle() /* VkHandle */ ,
			planeIndex ,
			pCapabilities.getPointer() /* Struct */ );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #153
    *  vkGetDisplayPlaneCapabilitiesKHR 
    * 
    * @param physicalDevice - 
    * @param mode - 
    * @param planeIndex - 
    * @param pCapabilities - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkGetDisplayPlaneCapabilitiesKHR0(
		long   physicalDevice,
		long   mode,
		int  planeIndex,
		ByteBuffer   pCapabilities);/* 
	VkResult res = vkGetDisplayPlaneCapabilitiesKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(VkDisplayModeKHR) reinterpret_cast<VkDisplayModeKHR>(mode),
			(uint32_t) planeIndex,
			(VkDisplayPlaneCapabilitiesKHR*) pCapabilities);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 154
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateDisplayPlaneSurfaceKHR(
    *     VkInstance                                  instance,
    *     const VkDisplaySurfaceCreateInfoKHR*        pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkSurfaceKHR*                               pSurface);
    * </pre>
    * 
    * @param instance - Vulkan handle of type VkInstance 
    * @param pCreateInfo - Vulkan Struct of type  final VkDisplaySurfaceCreateInfoKHR 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pSurface - An array of  VkSurfaceKHR . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateDisplayPlaneSurfaceKHR(
		VkInstance instance,
		final VkDisplaySurfaceCreateInfoKHR pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkSurfaceKHR[] pSurface) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkSurfaceKHR> pSurfaceBuffer =
			 new BigBuffer<VkSurfaceKHR>(pSurface, false);
	 int  _val = vkCreateDisplayPlaneSurfaceKHR0(
			instance.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pSurfaceBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pSurfaceBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #154
    *  vkCreateDisplayPlaneSurfaceKHR 
    * 
    * @param instance - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pSurface - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateDisplayPlaneSurfaceKHR0(
		long   instance,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pSurface);/* 
	VkResult res = vkCreateDisplayPlaneSurfaceKHR(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(const VkDisplaySurfaceCreateInfoKHR*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSurfaceKHR*) pSurface);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 155
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateSharedSwapchainsKHR(
    *     VkDevice                                    device,
    *     uint32_t                                    swapchainCount,
    *     const VkSwapchainCreateInfoKHR*             pCreateInfos,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkSwapchainKHR*                             pSwapchains);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param swapchainCount - The length of array pCreateInfos. 
    * @param pCreateInfos - An array of  final VkSwapchainCreateInfoKHR . 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pSwapchains - An array of  VkSwapchainKHR . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateSharedSwapchainsKHR(
		VkDevice device,
		int swapchainCount,
		final VkSwapchainCreateInfoKHR[] pCreateInfos,
		final VkAllocationCallbacks pAllocator,
		VkSwapchainKHR[] pSwapchains) {
	 // Wrap VkStruct array in a BigBuffer 
	 BigBuffer<VkSwapchainCreateInfoKHR> pCreateInfosBuff =
			 new BigBuffer<VkSwapchainCreateInfoKHR>(pCreateInfos, VkSwapchainCreateInfoKHR.getID());
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkSwapchainKHR> pSwapchainsBuffer =
			 new BigBuffer<VkSwapchainKHR>(pSwapchains, false);
	 int  _val = vkCreateSharedSwapchainsKHR0(
			device.getNativeHandle() /* VkHandle */ ,
			swapchainCount ,
			pCreateInfosBuff.getPointer() /*Buffer for Struct[]*/,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pSwapchainsBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pSwapchainsBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #155
    *  vkCreateSharedSwapchainsKHR 
    * 
    * @param device - 
    * @param swapchainCount - 
    * @param pCreateInfos - 
    * @param pAllocator - 
    * @param pSwapchains - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateSharedSwapchainsKHR0(
		long   device,
		int  swapchainCount,
		ByteBuffer   pCreateInfos,
		ByteBuffer   pAllocator,
		ByteBuffer   pSwapchains);/* 
	VkResult res = vkCreateSharedSwapchainsKHR(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(uint32_t) swapchainCount,
			(const VkSwapchainCreateInfoKHR*) pCreateInfos,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSwapchainKHR*) pSwapchains);
	 return (jint) res;
  */ 


    ////////////////////////////////////////////////////////////
    // WSI SURFACES
    ///////////////////////////////////////////////////////////

   /**
    *  Vulkan procedure ID: 156
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateXlibSurfaceKHR(
    *     VkInstance                                  instance,
    *     const VkXlibSurfaceCreateInfoKHR*           pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkSurfaceKHR*                               pSurface);
    * </pre>
    * 
    * @param instance - Vulkan handle of type VkInstance 
    * @param pCreateInfo - Vulkan Struct of type  final VkXlibSurfaceCreateInfoKHR 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pSurface - An array of  VkSurfaceKHR . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateXlibSurfaceKHR(
		VkInstance instance,
		final VkXlibSurfaceCreateInfoKHR pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkSurfaceKHR[] pSurface) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkSurfaceKHR> pSurfaceBuffer =
			 new BigBuffer<VkSurfaceKHR>(pSurface, false);
	 int  _val = vkCreateXlibSurfaceKHR0(
			instance.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pSurfaceBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pSurfaceBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #156
    *  vkCreateXlibSurfaceKHR 
    * 
    * @param instance - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pSurface - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateXlibSurfaceKHR0(
		long   instance,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pSurface);/* 
     #ifdef VK_USE_PLATFORM_XLIB_KHR	
	VkResult res = vkCreateXlibSurfaceKHR(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(const VkXlibSurfaceCreateInfoKHR*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSurfaceKHR*) pSurface);
	 return (jint) res;	 
     #else
         return (jint)VkResult::VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;
     #endif  
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 157
    * <h2>Prototype</h2><pre>
    *  VkBool32  vkGetPhysicalDeviceXlibPresentationSupportKHR(
    *     VkPhysicalDevice                            physicalDevice,
    *     uint32_t                                    queueFamilyIndex,
    *     Display*                                    dpy,
    *     VisualID                                    visualID);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param queueFamilyIndex int 
    * @param dpy - Vulkan handle of type XlibDisplay 
    * @param visualID - Vulkan handle of type XlibVisualID 
    * 
    * @return boolean
    */
   public static boolean vkGetPhysicalDeviceXlibPresentationSupportKHR(
		VkPhysicalDevice physicalDevice,
		int queueFamilyIndex,
		XlibDisplay dpy,
		XlibVisualID visualID) {

	 boolean  _val = vkGetPhysicalDeviceXlibPresentationSupportKHR0(
			physicalDevice.getNativeHandle() /* VkHandle */ ,
			queueFamilyIndex ,
			dpy.getNativeHandle() /* VkHandle */ ,
			visualID.getNativeHandle() /* VkHandle */  );
	 return _val;
   } 

   /**
    *  Native interface for Vulkan method #157
    *  vkGetPhysicalDeviceXlibPresentationSupportKHR 
    * 
    * @param physicalDevice - 
    * @param queueFamilyIndex - 
    * @param dpy - 
    * @param visualID - 
    * 
    * @return boolean as boolean  
    */
    private static native boolean  vkGetPhysicalDeviceXlibPresentationSupportKHR0(
		long   physicalDevice,
		int  queueFamilyIndex,
		long   dpy,
		long   visualID);/*
    #ifdef VK_USE_PLATFORM_XLIB_KHR		 
	boolean res = vkGetPhysicalDeviceXlibPresentationSupportKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(uint32_t) queueFamilyIndex,
			(Display*) dpy,
			(VisualID) reinterpret_cast<VisualID>(visualID));
	 return (jboolean) res;	 
     #else 
         return (jboolean)JNI_FALSE;
     #endif  
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 158
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateXcbSurfaceKHR(
    *     VkInstance                                  instance,
    *     const VkXcbSurfaceCreateInfoKHR*            pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkSurfaceKHR*                               pSurface);
    * </pre>
    * 
    * @param instance - Vulkan handle of type VkInstance 
    * @param pCreateInfo - Vulkan Struct of type  final VkXcbSurfaceCreateInfoKHR 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pSurface - An array of  VkSurfaceKHR . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateXcbSurfaceKHR(
		VkInstance instance,
		final VkXcbSurfaceCreateInfoKHR pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkSurfaceKHR[] pSurface) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkSurfaceKHR> pSurfaceBuffer =
			 new BigBuffer<VkSurfaceKHR>(pSurface, false);
	 int  _val = vkCreateXcbSurfaceKHR0(
			instance.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pSurfaceBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pSurfaceBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #158
    *  vkCreateXcbSurfaceKHR 
    * 
    * @param instance - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pSurface - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateXcbSurfaceKHR0(
		long   instance,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pSurface);/* 
    #ifdef VK_USE_PLATFORM_XCB_KHR  
	VkResult res = vkCreateXcbSurfaceKHR(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(const VkXcbSurfaceCreateInfoKHR*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSurfaceKHR*) pSurface);
	 return (jint) res;	 
     #else
         return (jint)VkResult::VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;
     #endif  
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 159
    * <h2>Prototype</h2><pre>
    *  VkBool32  vkGetPhysicalDeviceXcbPresentationSupportKHR(
    *     VkPhysicalDevice                            physicalDevice,
    *     uint32_t                                    queueFamilyIndex,
    *     xcb_connection_t*                           connection,
    *     xcb_visualid_t                              visual_id);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param queueFamilyIndex int 
    * @param connection - Vulkan handle of type XCBconnection 
    * @param visual_id - Vulkan handle of type XCBVisualID 
    * 
    * @return boolean
    */
   public static boolean vkGetPhysicalDeviceXcbPresentationSupportKHR(
		VkPhysicalDevice physicalDevice,
		int queueFamilyIndex,
		XCBconnection connection,
		XCBVisualID visual_id) {

	 boolean  _val = vkGetPhysicalDeviceXcbPresentationSupportKHR0(
			physicalDevice.getNativeHandle() /* VkHandle */ ,
			queueFamilyIndex ,
			connection.getNativeHandle() /* VkHandle */ ,
			visual_id.getNativeHandle() /* VkHandle */  );
	 return _val;
   } 

   /**
    *  Native interface for Vulkan method #159
    *  vkGetPhysicalDeviceXcbPresentationSupportKHR 
    * 
    * @param physicalDevice - 
    * @param queueFamilyIndex - 
    * @param connection - 
    * @param visual_id - 
    * 
    * @return boolean as boolean  
    */
    private static native boolean  vkGetPhysicalDeviceXcbPresentationSupportKHR0(
		long   physicalDevice,
		int  queueFamilyIndex,
		long   connection,
		long   visual_id);/* 
        #ifdef VK_USE_PLATFORM_XCB_KHR  
	boolean res = vkGetPhysicalDeviceXcbPresentationSupportKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(uint32_t) queueFamilyIndex,
			(xcb_connection_t*) connection,
			(xcb_visualid_t) reinterpret_cast<xcb_visualid_t>(visual_id));
	 return (jboolean) res;	 
     #else 
         return (jboolean)JNI_FALSE;
     #endif  
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 160
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateWaylandSurfaceKHR(
    *     VkInstance                                  instance,
    *     const VkWaylandSurfaceCreateInfoKHR*        pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkSurfaceKHR*                               pSurface);
    * </pre>
    * 
    * @param instance - Vulkan handle of type VkInstance 
    * @param pCreateInfo - Vulkan Struct of type  final VkWaylandSurfaceCreateInfoKHR 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pSurface - An array of  VkSurfaceKHR . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateWaylandSurfaceKHR(
		VkInstance instance,
		final VkWaylandSurfaceCreateInfoKHR pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkSurfaceKHR[] pSurface) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkSurfaceKHR> pSurfaceBuffer =
			 new BigBuffer<VkSurfaceKHR>(pSurface, false);
	 int  _val = vkCreateWaylandSurfaceKHR0(
			instance.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pSurfaceBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pSurfaceBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #160
    *  vkCreateWaylandSurfaceKHR 
    * 
    * @param instance - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pSurface - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateWaylandSurfaceKHR0(
		long   instance,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pSurface);/* 
    #ifdef VK_USE_PLATFORM_WAYLAND_KHR
	VkResult res = vkCreateWaylandSurfaceKHR(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(const VkWaylandSurfaceCreateInfoKHR*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSurfaceKHR*) pSurface);
	 return (jint) res;	 
     #else
         return (jint)VkResult::VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;
     #endif  
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 161
    * <h2>Prototype</h2><pre>
    *  VkBool32  vkGetPhysicalDeviceWaylandPresentationSupportKHR(
    *     VkPhysicalDevice                            physicalDevice,
    *     uint32_t                                    queueFamilyIndex,
    *     struct wl_display*                          display);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param queueFamilyIndex int 
    * @param display - Vulkan handle of type WlDisplay 
    * 
    * @return boolean
    */
   public static boolean vkGetPhysicalDeviceWaylandPresentationSupportKHR(
		VkPhysicalDevice physicalDevice,
		int queueFamilyIndex,
		WlDisplay display) {

	 boolean  _val = vkGetPhysicalDeviceWaylandPresentationSupportKHR0(
			physicalDevice.getNativeHandle() /* VkHandle */ ,
			queueFamilyIndex ,
			display.getNativeHandle() /* VkHandle */  );
	 return _val;
   } 

   /**
    *  Native interface for Vulkan method #161
    *  vkGetPhysicalDeviceWaylandPresentationSupportKHR 
    * 
    * @param physicalDevice - 
    * @param queueFamilyIndex - 
    * @param display - 
    * 
    * @return boolean as boolean  
    */
    private static native boolean  vkGetPhysicalDeviceWaylandPresentationSupportKHR0(
		long   physicalDevice,
		int  queueFamilyIndex,
		long   display);/* 
     #ifdef VK_USE_PLATFORM_WAYLAND_KHR
	boolean res = vkGetPhysicalDeviceWaylandPresentationSupportKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(uint32_t) queueFamilyIndex,
			(struct wl_display*) display);
	 return (jboolean) res;	 
     #else
         return (jboolean)JNI_FALSE;
     #endif  
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 162
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateMirSurfaceKHR(
    *     VkInstance                                  instance,
    *     const VkMirSurfaceCreateInfoKHR*            pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkSurfaceKHR*                               pSurface);
    * </pre>
    * 
    * @param instance - Vulkan handle of type VkInstance 
    * @param pCreateInfo - Vulkan Struct of type  final VkMirSurfaceCreateInfoKHR 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pSurface - An array of  VkSurfaceKHR . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateMirSurfaceKHR(
		VkInstance instance,
		final VkMirSurfaceCreateInfoKHR pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkSurfaceKHR[] pSurface) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkSurfaceKHR> pSurfaceBuffer =
			 new BigBuffer<VkSurfaceKHR>(pSurface, false);
	 int  _val = vkCreateMirSurfaceKHR0(
			instance.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pSurfaceBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pSurfaceBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #162
    *  vkCreateMirSurfaceKHR 
    * 
    * @param instance - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pSurface - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateMirSurfaceKHR0(
		long   instance,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pSurface);/* 
     #ifdef VK_USE_PLATFORM_MIR_KHR 		
	VkResult res = vkCreateMirSurfaceKHR(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(const VkMirSurfaceCreateInfoKHR*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSurfaceKHR*) pSurface);
	 return (jint) res;	 
     #else
         return (jint)VkResult::VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;
     #endif  
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 163
    * <h2>Prototype</h2><pre>
    *  VkBool32  vkGetPhysicalDeviceMirPresentationSupportKHR(
    *     VkPhysicalDevice                            physicalDevice,
    *     uint32_t                                    queueFamilyIndex,
    *     MirConnection*                              connection);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param queueFamilyIndex int 
    * @param connection - Vulkan handle of type MirConnection 
    * 
    * @return boolean
    */
   public static boolean vkGetPhysicalDeviceMirPresentationSupportKHR(
		VkPhysicalDevice physicalDevice,
		int queueFamilyIndex,
		MirConnection connection) {

	 boolean  _val = vkGetPhysicalDeviceMirPresentationSupportKHR0(
			physicalDevice.getNativeHandle() /* VkHandle */ ,
			queueFamilyIndex ,
			connection.getNativeHandle() /* VkHandle */  );
	 return _val;
   } 

   /**
    *  Native interface for Vulkan method #163
    *  vkGetPhysicalDeviceMirPresentationSupportKHR 
    * 
    * @param physicalDevice - 
    * @param queueFamilyIndex - 
    * @param connection - 
    * 
    * @return boolean as boolean  
    */
    private static native boolean  vkGetPhysicalDeviceMirPresentationSupportKHR0(
		long   physicalDevice,
		int  queueFamilyIndex,
		long   connection);/* 
     #ifdef VK_USE_PLATFORM_MIR_KHR 
	boolean res = vkGetPhysicalDeviceMirPresentationSupportKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(uint32_t) queueFamilyIndex,
			(MirConnection*) connection);
	 return (jboolean) res;	 
     #else
          return (jboolean)JNI_FALSE;
     #endif  
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 164
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateAndroidSurfaceKHR(
    *     VkInstance                                  instance,
    *     const VkAndroidSurfaceCreateInfoKHR*        pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkSurfaceKHR*                               pSurface);
    * </pre>
    * 
    * @param instance - Vulkan handle of type VkInstance 
    * @param pCreateInfo - Vulkan Struct of type  final VkAndroidSurfaceCreateInfoKHR 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pSurface - An array of  VkSurfaceKHR . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateAndroidSurfaceKHR(
		VkInstance instance,
		final VkAndroidSurfaceCreateInfoKHR pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkSurfaceKHR[] pSurface) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkSurfaceKHR> pSurfaceBuffer =
			 new BigBuffer<VkSurfaceKHR>(pSurface, false);
	 int  _val = vkCreateAndroidSurfaceKHR0(
			instance.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pSurfaceBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pSurfaceBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #164
    *  vkCreateAndroidSurfaceKHR 
    * 
    * @param instance - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pSurface - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateAndroidSurfaceKHR0(
		long   instance,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pSurface);/* 
        #ifdef VK_USE_PLATFORM_ANDROID_KHR 
	VkResult res = vkCreateAndroidSurfaceKHR(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(const VkAndroidSurfaceCreateInfoKHR*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSurfaceKHR*) pSurface);
	 return (jint) res;	 
     #else
         return (jint)VkResult::VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;
     #endif  
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 165
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateWin32SurfaceKHR(
    *     VkInstance                                  instance,
    *     const VkWin32SurfaceCreateInfoKHR*          pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkSurfaceKHR*                               pSurface);
    * </pre>
    * 
    * @param instance - Vulkan handle of type VkInstance 
    * @param pCreateInfo - Vulkan Struct of type  final VkWin32SurfaceCreateInfoKHR 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pSurface - An array of  VkSurfaceKHR . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateWin32SurfaceKHR(
		VkInstance instance,
		final VkWin32SurfaceCreateInfoKHR pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkSurfaceKHR[] pSurface) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkSurfaceKHR> pSurfaceBuffer =
			 new BigBuffer<VkSurfaceKHR>(pSurface, false);
	 int  _val = vkCreateWin32SurfaceKHR0(
			instance.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pSurfaceBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pSurfaceBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #165
    *  vkCreateWin32SurfaceKHR 
    * 
    * @param instance - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pSurface - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateWin32SurfaceKHR0(
		long   instance,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pSurface);/*
     // used in Windows OS only                                                      
     #ifdef VK_USE_PLATFORM_WIN32_KHR
	VkResult res = vkCreateWin32SurfaceKHR(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(const VkWin32SurfaceCreateInfoKHR*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSurfaceKHR*) pSurface);
	 return (jint) res;
     #else
         return (jint)VkResult::VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;
     #endif  
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 166
    * <h2>Prototype</h2><pre>
    *  VkBool32  vkGetPhysicalDeviceWin32PresentationSupportKHR(
    *     VkPhysicalDevice                            physicalDevice,
    *     uint32_t                                    queueFamilyIndex);
    * </pre>
    * 
    * @param physicalDevice - Vulkan handle of type VkPhysicalDevice 
    * @param queueFamilyIndex int 
    * 
    * @return boolean
    */
   public static boolean vkGetPhysicalDeviceWin32PresentationSupportKHR(
		VkPhysicalDevice physicalDevice,
		int queueFamilyIndex) {

	 boolean  _val = vkGetPhysicalDeviceWin32PresentationSupportKHR0(
			physicalDevice.getNativeHandle() /* VkHandle */ ,
			queueFamilyIndex  );
	 return _val;
   } 

   /**
    *  Native interface for Vulkan method #166
    *  vkGetPhysicalDeviceWin32PresentationSupportKHR 
    * 
    * @param physicalDevice - 
    * @param queueFamilyIndex - 
    * 
    * @return boolean as boolean  
    */
    private static native boolean  vkGetPhysicalDeviceWin32PresentationSupportKHR0(
		long   physicalDevice,
		int  queueFamilyIndex);/* 
     // used in Windows OS only                                                      
     #ifdef VK_USE_PLATFORM_WIN32_KHR
	 VkBool32 res = vkGetPhysicalDeviceWin32PresentationSupportKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(uint32_t) queueFamilyIndex);
	 return (jboolean) res;	 
     #else
         return (jboolean)JNI_FALSE;
     #endif  
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 167
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateDebugReportCallbackEXT(
    *     VkInstance                                  instance,
    *     const VkDebugReportCallbackCreateInfoEXT*   pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkDebugReportCallbackEXT*                   pCallback);
    * </pre>
    * 
    * @param instance - Vulkan handle of type VkInstance 
    * @param pCreateInfo - Vulkan Struct of type  final VkDebugReportCallbackCreateInfoEXT 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    * @param pCallback - An array of  VkDebugReportCallbackEXT . 
    * 
    * @return VkResult
    */
   public static VkResult vkCreateDebugReportCallbackEXT(
		VkInstance instance,
		final VkDebugReportCallbackCreateInfoEXT pCreateInfo,
		final VkAllocationCallbacks pAllocator,
		VkDebugReportCallbackEXT[] pCallback) {
	 // Wrap VkHandle array in a BigBuffer 
	 BigBuffer<VkDebugReportCallbackEXT> pCallbackBuffer =
			 new BigBuffer<VkDebugReportCallbackEXT>(pCallback, false);
	 int  _val = vkCreateDebugReportCallbackEXT0(
			instance.getNativeHandle() /* VkHandle */ ,
			pCreateInfo.getPointer() /* Struct */,
			(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */ ,
			pCallbackBuffer.getPointer() /*BigBuffer of VkHandle*/ );
	 pCallbackBuffer.update();
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #167
    *  vkCreateDebugReportCallbackEXT 
    * 
    * @param instance - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pCallback - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateDebugReportCallbackEXT0(
		long   instance,
		ByteBuffer   pCreateInfo,
		ByteBuffer   pAllocator,
		ByteBuffer   pCallback);/* 
	VkResult res = vkCreateDebugReportCallbackEXT(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(const VkDebugReportCallbackCreateInfoEXT*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkDebugReportCallbackEXT*) pCallback);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 168
    * <h2>Prototype</h2><pre>
    *  void  vkDestroyDebugReportCallbackEXT(
    *     VkInstance                                  instance,
    *     VkDebugReportCallbackEXT                    callback,
    *     const VkAllocationCallbacks*                pAllocator);
    * </pre>
    * 
    * @param instance - Vulkan handle of type VkInstance 
    * @param callback - Vulkan handle of type VkDebugReportCallbackEXT 
    * @param pAllocator - Vulkan Struct of type  final VkAllocationCallbacks 
    */
   public static void vkDestroyDebugReportCallbackEXT(
		VkInstance instance,
		VkDebugReportCallbackEXT callback,
		final VkAllocationCallbacks pAllocator) {

	 vkDestroyDebugReportCallbackEXT0(
		instance.getNativeHandle() /* VkHandle */ ,
		callback.getNativeHandle() /* VkHandle */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* Optional Struct */  );

   } 

   /**
    *  Native interface for Vulkan method #168
    *  vkDestroyDebugReportCallbackEXT 
    * 
    * @param instance - 
    * @param callback - 
    * @param pAllocator - 
    */
    private static native void vkDestroyDebugReportCallbackEXT0(
		long   instance,
		long   callback,
		ByteBuffer   pAllocator);/* 
	vkDestroyDebugReportCallbackEXT(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(VkDebugReportCallbackEXT) reinterpret_cast<VkDebugReportCallbackEXT>(callback),
			(const VkAllocationCallbacks*) pAllocator);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 169
    * <h2>Prototype</h2><pre>
    *  void  vkDebugReportMessageEXT(
    *     VkInstance                                  instance,
    *     VkDebugReportFlagsEXT                       flags,
    *     VkDebugReportObjectTypeEXT                  objectType,
    *     uint64_t                                    object,
    *     size_t                                      location,
    *     int32_t                                     messageCode,
    *     const char*                                 pLayerPrefix,
    *     const char*                                 pMessage);
    * </pre>
    * 
    * @param instance - Vulkan handle of type VkInstance 
    * @param flags int 
    * @param objectType - Vulkan enumeration of type VkDebugReportObjectTypeEXT 
    * @param object long 
    * @param location long 
    * @param messageCode int 
    * @param pLayerPrefix String 
    * @param pMessage String 
    */
   public static void vkDebugReportMessageEXT(
		VkInstance instance,
		int flags,
		VkDebugReportObjectTypeEXT objectType,
		long object,
		long location,
		int messageCode,
		String pLayerPrefix,
		String pMessage) {

	 vkDebugReportMessageEXT0(
		instance.getNativeHandle() /* VkHandle */ ,
		flags ,
		objectType.getValue() /* VkEnum */,
		object ,
		location ,
		messageCode ,
		pLayerPrefix ,
		pMessage  );

   } 

   /**
    *  Native interface for Vulkan method #169
    *  vkDebugReportMessageEXT 
    * 
    * @param instance - 
    * @param flags - 
    * @param objectType - 
    * @param object - 
    * @param location - 
    * @param messageCode - 
    * @param pLayerPrefix - 
    * @param pMessage - 
    */
    private static native void vkDebugReportMessageEXT0(
		long   instance,
		int  flags,
		int   objectType,
		long  object,
		long  location,
		int  messageCode,
		String  pLayerPrefix,
		String  pMessage);/* 
	vkDebugReportMessageEXT(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(VkDebugReportFlagsEXT) flags,
			(VkDebugReportObjectTypeEXT) objectType,
			(uint64_t) object,
			(size_t) location,
			(int32_t) messageCode,
			(const char*) pLayerPrefix,
			(const char*) pMessage);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 170
    * <h2>Prototype</h2><pre>
    *  VkResult  vkDebugMarkerSetObjectTagEXT(
    *     VkDevice                                    device,
    *     VkDebugMarkerObjectTagInfoEXT*              pTagInfo);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pTagInfo - Vulkan Struct of type  VkDebugMarkerObjectTagInfoEXT  
    * 
    * @return VkResult
    */
   public static VkResult vkDebugMarkerSetObjectTagEXT(
		VkDevice device,
		VkDebugMarkerObjectTagInfoEXT pTagInfo) {

	 int  _val = vkDebugMarkerSetObjectTagEXT0(
			device.getNativeHandle() /* VkHandle */ ,
			pTagInfo.getPointer() /* Struct */ );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #170
    *  vkDebugMarkerSetObjectTagEXT 
    * 
    * @param device - 
    * @param pTagInfo - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkDebugMarkerSetObjectTagEXT0(
		long   device,
		ByteBuffer   pTagInfo);/* 
	VkResult res = vkDebugMarkerSetObjectTagEXT(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkDebugMarkerObjectTagInfoEXT*) pTagInfo);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 171
    * <h2>Prototype</h2><pre>
    *  VkResult  vkDebugMarkerSetObjectNameEXT(
    *     VkDevice                                    device,
    *     VkDebugMarkerObjectNameInfoEXT*             pNameInfo);
    * </pre>
    * 
    * @param device - Vulkan handle of type VkDevice 
    * @param pNameInfo - Vulkan Struct of type  VkDebugMarkerObjectNameInfoEXT  
    * 
    * @return VkResult
    */
   public static VkResult vkDebugMarkerSetObjectNameEXT(
		VkDevice device,
		VkDebugMarkerObjectNameInfoEXT pNameInfo) {

	 int  _val = vkDebugMarkerSetObjectNameEXT0(
			device.getNativeHandle() /* VkHandle */ ,
			pNameInfo.getPointer() /* Struct */ );
	 return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #171
    *  vkDebugMarkerSetObjectNameEXT 
    * 
    * @param device - 
    * @param pNameInfo - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkDebugMarkerSetObjectNameEXT0(
		long   device,
		ByteBuffer   pNameInfo);/* 
	VkResult res = vkDebugMarkerSetObjectNameEXT(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkDebugMarkerObjectNameInfoEXT*) pNameInfo);
	 return (jint) res;
  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 172
    * <h2>Prototype</h2><pre>
    *  void  vkCmdDebugMarkerBeginEXT(
    *     VkCommandBuffer                             commandBuffer,
    *     VkDebugMarkerMarkerInfoEXT*                 pMarkerInfo);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param pMarkerInfo - Vulkan Struct of type  VkDebugMarkerMarkerInfoEXT  
    */
   public static void vkCmdDebugMarkerBeginEXT(
		VkCommandBuffer commandBuffer,
		VkDebugMarkerMarkerInfoEXT pMarkerInfo) {

	 vkCmdDebugMarkerBeginEXT0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		pMarkerInfo.getPointer() /* Struct */ );

   } 

   /**
    *  Native interface for Vulkan method #172
    *  vkCmdDebugMarkerBeginEXT 
    * 
    * @param commandBuffer - 
    * @param pMarkerInfo - 
    */
    private static native void vkCmdDebugMarkerBeginEXT0(
		long   commandBuffer,
		ByteBuffer   pMarkerInfo);/* 
	vkCmdDebugMarkerBeginEXT(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkDebugMarkerMarkerInfoEXT*) pMarkerInfo);

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 173
    * <h2>Prototype</h2><pre>
    *  void  vkCmdDebugMarkerEndEXT(
    *     VkCommandBuffer                             commandBuffer);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    */
   public static void vkCmdDebugMarkerEndEXT(
		VkCommandBuffer commandBuffer) {

	 vkCmdDebugMarkerEndEXT0(
		commandBuffer.getNativeHandle() /* VkHandle */  );

   } 

   /**
    *  Native interface for Vulkan method #173
    *  vkCmdDebugMarkerEndEXT 
    * 
    * @param commandBuffer - 
    */
    private static native void vkCmdDebugMarkerEndEXT0(
		long   commandBuffer);/* 
	vkCmdDebugMarkerEndEXT(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer));

  */ 


	/////////////////////////////////////

   /**
    *  Vulkan procedure ID: 174
    * <h2>Prototype</h2><pre>
    *  void  vkCmdDebugMarkerInsertEXT(
    *     VkCommandBuffer                             commandBuffer,
    *     VkDebugMarkerMarkerInfoEXT*                 pMarkerInfo);
    * </pre>
    * 
    * @param commandBuffer - Vulkan handle of type VkCommandBuffer 
    * @param pMarkerInfo - Vulkan Struct of type  VkDebugMarkerMarkerInfoEXT  
    */
   public static void vkCmdDebugMarkerInsertEXT(
		VkCommandBuffer commandBuffer,
		VkDebugMarkerMarkerInfoEXT pMarkerInfo) {

	 vkCmdDebugMarkerInsertEXT0(
		commandBuffer.getNativeHandle() /* VkHandle */ ,
		pMarkerInfo.getPointer() /* Struct */ );

   } 

   /**
    *  Native interface for Vulkan method #174
    *  vkCmdDebugMarkerInsertEXT 
    * 
    * @param commandBuffer - 
    * @param pMarkerInfo - 
    */
    private static native void vkCmdDebugMarkerInsertEXT0(
		long   commandBuffer,
		ByteBuffer   pMarkerInfo);/* 
	vkCmdDebugMarkerInsertEXT(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkDebugMarkerMarkerInfoEXT*) pMarkerInfo);

  */ 


	/////////////////////////////////////



 }//end of Vk.java 
