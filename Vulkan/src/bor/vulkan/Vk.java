 package bor.vulkan;

 import java.nio.*;
 import bor.vulkan.khr.*;
 import bor.vulkan.structs.*;
 import bor.vulkan.enumerations.*;
 import bor.vulkan.khr.*;
 import bor.vulkan.khr.structs.*;

 public class Vk extends Vulkan
 {
   /**
    *  Vulkan procedure ID: 1
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateInstance(
    *     const VkInstanceCreateInfo*                 pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkInstance*                                 pInstance);
    * </pre>
    * 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pInstance - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateInstance(
		 VkInstanceCreateInfo  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkInstance  pInstance){
	int  _val = vkCreateInstance0(
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pInstance==null ? null : pInstance.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pInstance);/* 
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
    * @param instance - 
    * @param pAllocator - 
    */
   public void vkDestroyInstance(
		VkInstance instance,
		 VkAllocationCallbacks  pAllocator){
	vkDestroyInstance0(
		(instance==null ? null : instance.getPointer()) /* ByteBuffer */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

   } 

   /**
    *  Native interface for Vulkan method #2
    *  vkDestroyInstance 
    * 
    * @param instance - 
    * @param pAllocator - 
    */
    private static native void vkDestroyInstance0(
		java.nio.ByteBuffer   instance,
		java.nio.ByteBuffer   pAllocator);/* 
	VkInstance* ptr_instance = (VkInstance*) instance;
	vkDestroyInstance(
			(VkInstance) (*ptr_instance),
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
    * @param instance - 
    * @param pPhysicalDeviceCount - 
    * @param pPhysicalDevices - 
    * 
    * @return VkResult
    */
   public VkResult vkEnumeratePhysicalDevices(
		VkInstance instance,
		int[] pPhysicalDeviceCount,
		 VkPhysicalDevice  pPhysicalDevices){
	int  _val = vkEnumeratePhysicalDevices0(
			(instance==null ? null : instance.getPointer()) /* ByteBuffer */ ,
			pPhysicalDeviceCount ,
			(pPhysicalDevices==null ? null : pPhysicalDevices.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   instance,
		int[]  pPhysicalDeviceCount,
		java.nio.ByteBuffer   pPhysicalDevices);/* 
	VkInstance* ptr_instance = (VkInstance*) instance;
	VkResult res = vkEnumeratePhysicalDevices(
			(VkInstance) (*ptr_instance),
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
    * @param physicalDevice - 
    * @param pFeatures - 
    */
   public void vkGetPhysicalDeviceFeatures(
		VkPhysicalDevice physicalDevice,
		 VkPhysicalDeviceFeatures  pFeatures){
	vkGetPhysicalDeviceFeatures0(
		(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
		(pFeatures==null ? null : pFeatures.getPointer()) /* ByteBuffer */  );

   } 

   /**
    *  Native interface for Vulkan method #4
    *  vkGetPhysicalDeviceFeatures 
    * 
    * @param physicalDevice - 
    * @param pFeatures - 
    */
    private static native void vkGetPhysicalDeviceFeatures0(
		java.nio.ByteBuffer   physicalDevice,
		java.nio.ByteBuffer   pFeatures);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	vkGetPhysicalDeviceFeatures(
			(VkPhysicalDevice) (*ptr_physicalDevice),
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
    * @param physicalDevice - 
    * @param format - 
    * @param pFormatProperties - 
    */
   public void vkGetPhysicalDeviceFormatProperties(
		VkPhysicalDevice physicalDevice,
		VkFormat format,
		 VkFormatProperties  pFormatProperties){
	vkGetPhysicalDeviceFormatProperties0(
		(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
		format.getValue() /* enum */,
		(pFormatProperties==null ? null : pFormatProperties.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   physicalDevice,
		int   format,
		java.nio.ByteBuffer   pFormatProperties);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	vkGetPhysicalDeviceFormatProperties(
			(VkPhysicalDevice) (*ptr_physicalDevice),
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
    * @param physicalDevice - 
    * @param format - 
    * @param type - 
    * @param tiling - 
    * @param usage - 
    * @param flags - 
    * @param pImageFormatProperties - 
    * 
    * @return VkResult
    */
   public VkResult vkGetPhysicalDeviceImageFormatProperties(
		VkPhysicalDevice physicalDevice,
		VkFormat format,
		VkImageType type,
		VkImageTiling tiling,
		int usage,
		int flags,
		 VkImageFormatProperties  pImageFormatProperties){
	int  _val = vkGetPhysicalDeviceImageFormatProperties0(
			(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
			format.getValue() /* enum */,
			type.getValue() /* enum */,
			tiling.getValue() /* enum */,
			usage ,
			flags ,
			(pImageFormatProperties==null ? null : pImageFormatProperties.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   physicalDevice,
		int   format,
		int   type,
		int   tiling,
		int  usage,
		int  flags,
		java.nio.ByteBuffer   pImageFormatProperties);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	VkResult res = vkGetPhysicalDeviceImageFormatProperties(
			(VkPhysicalDevice) (*ptr_physicalDevice),
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
    * @param physicalDevice - 
    * @param pProperties - 
    */
   public void vkGetPhysicalDeviceProperties(
		VkPhysicalDevice physicalDevice,
		 VkPhysicalDeviceProperties  pProperties){
	vkGetPhysicalDeviceProperties0(
		(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
		(pProperties==null ? null : pProperties.getPointer()) /* ByteBuffer */  );

   } 

   /**
    *  Native interface for Vulkan method #7
    *  vkGetPhysicalDeviceProperties 
    * 
    * @param physicalDevice - 
    * @param pProperties - 
    */
    private static native void vkGetPhysicalDeviceProperties0(
		java.nio.ByteBuffer   physicalDevice,
		java.nio.ByteBuffer   pProperties);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	vkGetPhysicalDeviceProperties(
			(VkPhysicalDevice) (*ptr_physicalDevice),
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
    * @param physicalDevice - 
    * @param pQueueFamilyPropertyCount - 
    * @param pQueueFamilyProperties - 
    */
   public void vkGetPhysicalDeviceQueueFamilyProperties(
		VkPhysicalDevice physicalDevice,
		int[] pQueueFamilyPropertyCount,
		 VkQueueFamilyProperties  pQueueFamilyProperties){
	vkGetPhysicalDeviceQueueFamilyProperties0(
		(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
		pQueueFamilyPropertyCount ,
		(pQueueFamilyProperties==null ? null : pQueueFamilyProperties.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   physicalDevice,
		int[]  pQueueFamilyPropertyCount,
		java.nio.ByteBuffer   pQueueFamilyProperties);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	vkGetPhysicalDeviceQueueFamilyProperties(
			(VkPhysicalDevice) (*ptr_physicalDevice),
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
    * @param physicalDevice - 
    * @param pMemoryProperties - 
    */
   public void vkGetPhysicalDeviceMemoryProperties(
		VkPhysicalDevice physicalDevice,
		 VkPhysicalDeviceMemoryProperties  pMemoryProperties){
	vkGetPhysicalDeviceMemoryProperties0(
		(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
		(pMemoryProperties==null ? null : pMemoryProperties.getPointer()) /* ByteBuffer */  );

   } 

   /**
    *  Native interface for Vulkan method #9
    *  vkGetPhysicalDeviceMemoryProperties 
    * 
    * @param physicalDevice - 
    * @param pMemoryProperties - 
    */
    private static native void vkGetPhysicalDeviceMemoryProperties0(
		java.nio.ByteBuffer   physicalDevice,
		java.nio.ByteBuffer   pMemoryProperties);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	vkGetPhysicalDeviceMemoryProperties(
			(VkPhysicalDevice) (*ptr_physicalDevice),
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
    * @param instance - 
    * @param pName - 
    * 
    * @return PFNvkVoidFunction
    */
   public PFNvkVoidFunction vkGetInstanceProcAddr(
		VkInstance instance,
		String pName){
	java.nio.ByteBuffer  _val = vkGetInstanceProcAddr0(
			(instance==null ? null : instance.getPointer()) /* ByteBuffer */ ,
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
    * @return PFNvkVoidFunction as java.nio.ByteBuffer  
    */
    private static native java.nio.ByteBuffer  vkGetInstanceProcAddr0(
		java.nio.ByteBuffer   instance,
		String  pName);/* 
	VkInstance* ptr_instance = (VkInstance*) instance;
	PFNvkVoidFunction res = vkGetInstanceProcAddr(
			(VkInstance) (*ptr_instance),
			(const char*) pName);
	 return (jobject) res;
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
    * @param device - 
    * @param pName - 
    * 
    * @return PFNvkVoidFunction
    */
   public PFNvkVoidFunction vkGetDeviceProcAddr(
		VkDevice device,
		String pName){
	java.nio.ByteBuffer  _val = vkGetDeviceProcAddr0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
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
    * @return PFNvkVoidFunction as java.nio.ByteBuffer  
    */
    private static native java.nio.ByteBuffer  vkGetDeviceProcAddr0(
		java.nio.ByteBuffer   device,
		String  pName);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	PFNvkVoidFunction res = vkGetDeviceProcAddr(
			(VkDevice) (*ptr_device),
			(const char*) pName);
	 return (jobject) res;
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
    * @param physicalDevice - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pDevice - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateDevice(
		VkPhysicalDevice physicalDevice,
		 VkDeviceCreateInfo  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkDevice  pDevice){
	int  _val = vkCreateDevice0(
			(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pDevice==null ? null : pDevice.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   physicalDevice,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pDevice);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	VkResult res = vkCreateDevice(
			(VkPhysicalDevice) (*ptr_physicalDevice),
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
    * @param device - 
    * @param pAllocator - 
    */
   public void vkDestroyDevice(
		VkDevice device,
		 VkAllocationCallbacks  pAllocator){
	vkDestroyDevice0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

   } 

   /**
    *  Native interface for Vulkan method #13
    *  vkDestroyDevice 
    * 
    * @param device - 
    * @param pAllocator - 
    */
    private static native void vkDestroyDevice0(
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pAllocator);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	vkDestroyDevice(
			(VkDevice) (*ptr_device),
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
    * @param pLayerName - 
    * @param pPropertyCount - 
    * @param pProperties - 
    * 
    * @return VkResult
    */
   public VkResult vkEnumerateInstanceExtensionProperties(
		String pLayerName,
		int[] pPropertyCount,
		 VkExtensionProperties  pProperties){
	int  _val = vkEnumerateInstanceExtensionProperties0(
			pLayerName ,
			pPropertyCount ,
			(pProperties==null ? null : pProperties.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   pProperties);/* 
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
    * @param physicalDevice - 
    * @param pLayerName - 
    * @param pPropertyCount - 
    * @param pProperties - 
    * 
    * @return VkResult
    */
   public VkResult vkEnumerateDeviceExtensionProperties(
		VkPhysicalDevice physicalDevice,
		String pLayerName,
		int[] pPropertyCount,
		 VkExtensionProperties  pProperties){
	int  _val = vkEnumerateDeviceExtensionProperties0(
			(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
			pLayerName ,
			pPropertyCount ,
			(pProperties==null ? null : pProperties.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   physicalDevice,
		String  pLayerName,
		int[]  pPropertyCount,
		java.nio.ByteBuffer   pProperties);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	VkResult res = vkEnumerateDeviceExtensionProperties(
			(VkPhysicalDevice) (*ptr_physicalDevice),
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
    * @param pPropertyCount - 
    * @param pProperties - 
    * 
    * @return VkResult
    */
   public VkResult vkEnumerateInstanceLayerProperties(
		int[] pPropertyCount,
		 VkLayerProperties  pProperties){
	int  _val = vkEnumerateInstanceLayerProperties0(
			pPropertyCount ,
			(pProperties==null ? null : pProperties.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   pProperties);/* 
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
    * @param physicalDevice - 
    * @param pPropertyCount - 
    * @param pProperties - 
    * 
    * @return VkResult
    */
   public VkResult vkEnumerateDeviceLayerProperties(
		VkPhysicalDevice physicalDevice,
		int[] pPropertyCount,
		 VkLayerProperties  pProperties){
	int  _val = vkEnumerateDeviceLayerProperties0(
			(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
			pPropertyCount ,
			(pProperties==null ? null : pProperties.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   physicalDevice,
		int[]  pPropertyCount,
		java.nio.ByteBuffer   pProperties);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	VkResult res = vkEnumerateDeviceLayerProperties(
			(VkPhysicalDevice) (*ptr_physicalDevice),
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
    * @param device - 
    * @param queueFamilyIndex - 
    * @param queueIndex - 
    * @param pQueue - 
    */
   public void vkGetDeviceQueue(
		VkDevice device,
		int queueFamilyIndex,
		int queueIndex,
		 VkQueue  pQueue){
	vkGetDeviceQueue0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		queueFamilyIndex ,
		queueIndex ,
		(pQueue==null ? null : pQueue.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		int  queueFamilyIndex,
		int  queueIndex,
		java.nio.ByteBuffer   pQueue);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	vkGetDeviceQueue(
			(VkDevice) (*ptr_device),
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
    * @param queue - 
    * @param submitCount - 
    * @param pSubmits - 
    * @param fence - 
    * 
    * @return VkResult
    */
   public VkResult vkQueueSubmit(
		VkQueue queue,
		int submitCount,
		 VkSubmitInfo  pSubmits,
		VkFence fence){
	int  _val = vkQueueSubmit0(
			(queue==null ? null : queue.getPointer()) /* ByteBuffer */ ,
			submitCount ,
			(pSubmits==null ? null : pSubmits.getPointer()) /* ByteBuffer */ ,
			(fence==null ? null : fence.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   queue,
		int  submitCount,
		java.nio.ByteBuffer   pSubmits,
		java.nio.ByteBuffer   fence);/* 
	VkQueue* ptr_queue = (VkQueue*) queue;
	VkFence* ptr_fence = (VkFence*) fence;
	VkResult res = vkQueueSubmit(
			(VkQueue) (*ptr_queue),
			(uint32_t) submitCount,
			(const VkSubmitInfo*) pSubmits,
			(VkFence) (*ptr_fence));
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
    * @param queue - 
    * 
    * @return VkResult
    */
   public VkResult vkQueueWaitIdle(
		VkQueue queue){
	int  _val = vkQueueWaitIdle0(
			(queue==null ? null : queue.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   queue);/* 
	VkQueue* ptr_queue = (VkQueue*) queue;
	VkResult res = vkQueueWaitIdle(
			(VkQueue) (*ptr_queue));
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
    * @param device - 
    * 
    * @return VkResult
    */
   public VkResult vkDeviceWaitIdle(
		VkDevice device){
	int  _val = vkDeviceWaitIdle0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkDeviceWaitIdle(
			(VkDevice) (*ptr_device));
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
    * @param device - 
    * @param pAllocateInfo - 
    * @param pAllocator - 
    * @param pMemory - 
    * 
    * @return VkResult
    */
   public VkResult vkAllocateMemory(
		VkDevice device,
		 VkMemoryAllocateInfo  pAllocateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkDeviceMemory  pMemory){
	int  _val = vkAllocateMemory0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(pAllocateInfo==null ? null : pAllocateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pMemory==null ? null : pMemory.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pAllocateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pMemory);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkAllocateMemory(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param memory - 
    * @param pAllocator - 
    */
   public void vkFreeMemory(
		VkDevice device,
		VkDeviceMemory memory,
		 VkAllocationCallbacks  pAllocator){
	vkFreeMemory0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(memory==null ? null : memory.getPointer()) /* ByteBuffer */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   memory,
		java.nio.ByteBuffer   pAllocator);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkDeviceMemory* ptr_memory = (VkDeviceMemory*) memory;
	vkFreeMemory(
			(VkDevice) (*ptr_device),
			(VkDeviceMemory) (*ptr_memory),
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
    * @param device - 
    * @param memory - 
    * @param offset - 
    * @param size - 
    * @param flags - 
    * @param ppData - 
    * 
    * @return VkResult
    */
   public VkResult vkMapMemory(
		VkDevice device,
		VkDeviceMemory memory,
		long offset,
		long size,
		int flags,
		ByteBuffer ppData){
	int  _val = vkMapMemory0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(memory==null ? null : memory.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   memory,
		long  offset,
		long  size,
		int  flags,
		ByteBuffer  ppData);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkDeviceMemory* ptr_memory = (VkDeviceMemory*) memory;
	VkResult res = vkMapMemory(
			(VkDevice) (*ptr_device),
			(VkDeviceMemory) (*ptr_memory),
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
    * @param device - 
    * @param memory - 
    */
   public void vkUnmapMemory(
		VkDevice device,
		VkDeviceMemory memory){
	vkUnmapMemory0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(memory==null ? null : memory.getPointer()) /* ByteBuffer */  );

   } 

   /**
    *  Native interface for Vulkan method #25
    *  vkUnmapMemory 
    * 
    * @param device - 
    * @param memory - 
    */
    private static native void vkUnmapMemory0(
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   memory);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkDeviceMemory* ptr_memory = (VkDeviceMemory*) memory;
	vkUnmapMemory(
			(VkDevice) (*ptr_device),
			(VkDeviceMemory) (*ptr_memory));

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
    * @param device - 
    * @param memoryRangeCount - 
    * @param pMemoryRanges - 
    * 
    * @return VkResult
    */
   public VkResult vkFlushMappedMemoryRanges(
		VkDevice device,
		int memoryRangeCount,
		 VkMappedMemoryRange  pMemoryRanges){
	int  _val = vkFlushMappedMemoryRanges0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			memoryRangeCount ,
			(pMemoryRanges==null ? null : pMemoryRanges.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		int  memoryRangeCount,
		java.nio.ByteBuffer   pMemoryRanges);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkFlushMappedMemoryRanges(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param memoryRangeCount - 
    * @param pMemoryRanges - 
    * 
    * @return VkResult
    */
   public VkResult vkInvalidateMappedMemoryRanges(
		VkDevice device,
		int memoryRangeCount,
		 VkMappedMemoryRange  pMemoryRanges){
	int  _val = vkInvalidateMappedMemoryRanges0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			memoryRangeCount ,
			(pMemoryRanges==null ? null : pMemoryRanges.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		int  memoryRangeCount,
		java.nio.ByteBuffer   pMemoryRanges);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkInvalidateMappedMemoryRanges(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param memory - 
    * @param pCommittedMemoryInBytes - 
    */
   public void vkGetDeviceMemoryCommitment(
		VkDevice device,
		VkDeviceMemory memory,
		long[] pCommittedMemoryInBytes){
	vkGetDeviceMemoryCommitment0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(memory==null ? null : memory.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   memory,
		long[]  pCommittedMemoryInBytes);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkDeviceMemory* ptr_memory = (VkDeviceMemory*) memory;
	vkGetDeviceMemoryCommitment(
			(VkDevice) (*ptr_device),
			(VkDeviceMemory) (*ptr_memory),
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
    * @param device - 
    * @param buffer - 
    * @param memory - 
    * @param memoryOffset - 
    * 
    * @return VkResult
    */
   public VkResult vkBindBufferMemory(
		VkDevice device,
		VkBuffer buffer,
		VkDeviceMemory memory,
		long memoryOffset){
	int  _val = vkBindBufferMemory0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(buffer==null ? null : buffer.getPointer()) /* ByteBuffer */ ,
			(memory==null ? null : memory.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   buffer,
		java.nio.ByteBuffer   memory,
		long  memoryOffset);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkBuffer* ptr_buffer = (VkBuffer*) buffer;
	VkDeviceMemory* ptr_memory = (VkDeviceMemory*) memory;
	VkResult res = vkBindBufferMemory(
			(VkDevice) (*ptr_device),
			(VkBuffer) (*ptr_buffer),
			(VkDeviceMemory) (*ptr_memory),
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
    * @param device - 
    * @param image - 
    * @param memory - 
    * @param memoryOffset - 
    * 
    * @return VkResult
    */
   public VkResult vkBindImageMemory(
		VkDevice device,
		VkImage image,
		VkDeviceMemory memory,
		long memoryOffset){
	int  _val = vkBindImageMemory0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(image==null ? null : image.getPointer()) /* ByteBuffer */ ,
			(memory==null ? null : memory.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   image,
		java.nio.ByteBuffer   memory,
		long  memoryOffset);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkImage* ptr_image = (VkImage*) image;
	VkDeviceMemory* ptr_memory = (VkDeviceMemory*) memory;
	VkResult res = vkBindImageMemory(
			(VkDevice) (*ptr_device),
			(VkImage) (*ptr_image),
			(VkDeviceMemory) (*ptr_memory),
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
    * @param device - 
    * @param buffer - 
    * @param pMemoryRequirements - 
    */
   public void vkGetBufferMemoryRequirements(
		VkDevice device,
		VkBuffer buffer,
		 VkMemoryRequirements  pMemoryRequirements){
	vkGetBufferMemoryRequirements0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(buffer==null ? null : buffer.getPointer()) /* ByteBuffer */ ,
		(pMemoryRequirements==null ? null : pMemoryRequirements.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   buffer,
		java.nio.ByteBuffer   pMemoryRequirements);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkBuffer* ptr_buffer = (VkBuffer*) buffer;
	vkGetBufferMemoryRequirements(
			(VkDevice) (*ptr_device),
			(VkBuffer) (*ptr_buffer),
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
    * @param device - 
    * @param image - 
    * @param pMemoryRequirements - 
    */
   public void vkGetImageMemoryRequirements(
		VkDevice device,
		VkImage image,
		 VkMemoryRequirements  pMemoryRequirements){
	vkGetImageMemoryRequirements0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(image==null ? null : image.getPointer()) /* ByteBuffer */ ,
		(pMemoryRequirements==null ? null : pMemoryRequirements.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   image,
		java.nio.ByteBuffer   pMemoryRequirements);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkImage* ptr_image = (VkImage*) image;
	vkGetImageMemoryRequirements(
			(VkDevice) (*ptr_device),
			(VkImage) (*ptr_image),
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
    * @param device - 
    * @param image - 
    * @param pSparseMemoryRequirementCount - 
    * @param pSparseMemoryRequirements - 
    */
   public void vkGetImageSparseMemoryRequirements(
		VkDevice device,
		VkImage image,
		int[] pSparseMemoryRequirementCount,
		 VkSparseImageMemoryRequirements  pSparseMemoryRequirements){
	vkGetImageSparseMemoryRequirements0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(image==null ? null : image.getPointer()) /* ByteBuffer */ ,
		pSparseMemoryRequirementCount ,
		(pSparseMemoryRequirements==null ? null : pSparseMemoryRequirements.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   image,
		int[]  pSparseMemoryRequirementCount,
		java.nio.ByteBuffer   pSparseMemoryRequirements);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkImage* ptr_image = (VkImage*) image;
	vkGetImageSparseMemoryRequirements(
			(VkDevice) (*ptr_device),
			(VkImage) (*ptr_image),
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
    * @param physicalDevice - 
    * @param format - 
    * @param type - 
    * @param samples - 
    * @param usage - 
    * @param tiling - 
    * @param pPropertyCount - 
    * @param pProperties - 
    */
   public void vkGetPhysicalDeviceSparseImageFormatProperties(
		VkPhysicalDevice physicalDevice,
		VkFormat format,
		VkImageType type,
		VkSampleCountFlagBits samples,
		int usage,
		VkImageTiling tiling,
		int[] pPropertyCount,
		 VkSparseImageFormatProperties  pProperties){
	vkGetPhysicalDeviceSparseImageFormatProperties0(
		(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
		format.getValue() /* enum */,
		type.getValue() /* enum */,
		samples.getValue() /* enum */,
		usage ,
		tiling.getValue() /* enum */,
		pPropertyCount ,
		(pProperties==null ? null : pProperties.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   physicalDevice,
		int   format,
		int   type,
		int   samples,
		int  usage,
		int   tiling,
		int[]  pPropertyCount,
		java.nio.ByteBuffer   pProperties);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	vkGetPhysicalDeviceSparseImageFormatProperties(
			(VkPhysicalDevice) (*ptr_physicalDevice),
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
    * @param queue - 
    * @param bindInfoCount - 
    * @param pBindInfo - 
    * @param fence - 
    * 
    * @return VkResult
    */
   public VkResult vkQueueBindSparse(
		VkQueue queue,
		int bindInfoCount,
		 VkBindSparseInfo  pBindInfo,
		VkFence fence){
	int  _val = vkQueueBindSparse0(
			(queue==null ? null : queue.getPointer()) /* ByteBuffer */ ,
			bindInfoCount ,
			(pBindInfo==null ? null : pBindInfo.getPointer()) /* ByteBuffer */ ,
			(fence==null ? null : fence.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   queue,
		int  bindInfoCount,
		java.nio.ByteBuffer   pBindInfo,
		java.nio.ByteBuffer   fence);/* 
	VkQueue* ptr_queue = (VkQueue*) queue;
	VkFence* ptr_fence = (VkFence*) fence;
	VkResult res = vkQueueBindSparse(
			(VkQueue) (*ptr_queue),
			(uint32_t) bindInfoCount,
			(const VkBindSparseInfo*) pBindInfo,
			(VkFence) (*ptr_fence));
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
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pFence - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateFence(
		VkDevice device,
		 VkFenceCreateInfo  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkFence  pFence){
	int  _val = vkCreateFence0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pFence==null ? null : pFence.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pFence);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkCreateFence(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param fence - 
    * @param pAllocator - 
    */
   public void vkDestroyFence(
		VkDevice device,
		VkFence fence,
		 VkAllocationCallbacks  pAllocator){
	vkDestroyFence0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(fence==null ? null : fence.getPointer()) /* ByteBuffer */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   fence,
		java.nio.ByteBuffer   pAllocator);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkFence* ptr_fence = (VkFence*) fence;
	vkDestroyFence(
			(VkDevice) (*ptr_device),
			(VkFence) (*ptr_fence),
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
    * @param device - 
    * @param fenceCount - 
    * @param pFences - 
    * 
    * @return VkResult
    */
   public VkResult vkResetFences(
		VkDevice device,
		int fenceCount,
		 VkFence  pFences){
	int  _val = vkResetFences0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			fenceCount ,
			(pFences==null ? null : pFences.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		int  fenceCount,
		java.nio.ByteBuffer   pFences);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkResetFences(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param fence - 
    * 
    * @return VkResult
    */
   public VkResult vkGetFenceStatus(
		VkDevice device,
		VkFence fence){
	int  _val = vkGetFenceStatus0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(fence==null ? null : fence.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   fence);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkFence* ptr_fence = (VkFence*) fence;
	VkResult res = vkGetFenceStatus(
			(VkDevice) (*ptr_device),
			(VkFence) (*ptr_fence));
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
    * @param device - 
    * @param fenceCount - 
    * @param pFences - 
    * @param waitAll - 
    * @param timeout - 
    * 
    * @return VkResult
    */
   public VkResult vkWaitForFences(
		VkDevice device,
		int fenceCount,
		 VkFence  pFences,
		boolean waitAll,
		long timeout){
	int  _val = vkWaitForFences0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			fenceCount ,
			(pFences==null ? null : pFences.getPointer()) /* ByteBuffer */ ,
			waitAll ,
			timeout  );
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
		java.nio.ByteBuffer   device,
		int  fenceCount,
		java.nio.ByteBuffer   pFences,
		boolean  waitAll,
		long  timeout);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkWaitForFences(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pSemaphore - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateSemaphore(
		VkDevice device,
		 VkSemaphoreCreateInfo  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkSemaphore  pSemaphore){
	int  _val = vkCreateSemaphore0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pSemaphore==null ? null : pSemaphore.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pSemaphore);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkCreateSemaphore(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param semaphore - 
    * @param pAllocator - 
    */
   public void vkDestroySemaphore(
		VkDevice device,
		VkSemaphore semaphore,
		 VkAllocationCallbacks  pAllocator){
	vkDestroySemaphore0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(semaphore==null ? null : semaphore.getPointer()) /* ByteBuffer */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   semaphore,
		java.nio.ByteBuffer   pAllocator);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkSemaphore* ptr_semaphore = (VkSemaphore*) semaphore;
	vkDestroySemaphore(
			(VkDevice) (*ptr_device),
			(VkSemaphore) (*ptr_semaphore),
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
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pEvent - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateEvent(
		VkDevice device,
		 VkEventCreateInfo  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkEvent  pEvent){
	int  _val = vkCreateEvent0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pEvent==null ? null : pEvent.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pEvent);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkCreateEvent(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param event - 
    * @param pAllocator - 
    */
   public void vkDestroyEvent(
		VkDevice device,
		VkEvent event,
		 VkAllocationCallbacks  pAllocator){
	vkDestroyEvent0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(event==null ? null : event.getPointer()) /* ByteBuffer */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   event,
		java.nio.ByteBuffer   pAllocator);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkEvent* ptr_event = (VkEvent*) event;
	vkDestroyEvent(
			(VkDevice) (*ptr_device),
			(VkEvent) (*ptr_event),
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
    * @param device - 
    * @param event - 
    * 
    * @return VkResult
    */
   public VkResult vkGetEventStatus(
		VkDevice device,
		VkEvent event){
	int  _val = vkGetEventStatus0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(event==null ? null : event.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   event);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkEvent* ptr_event = (VkEvent*) event;
	VkResult res = vkGetEventStatus(
			(VkDevice) (*ptr_device),
			(VkEvent) (*ptr_event));
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
    * @param device - 
    * @param event - 
    * 
    * @return VkResult
    */
   public VkResult vkSetEvent(
		VkDevice device,
		VkEvent event){
	int  _val = vkSetEvent0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(event==null ? null : event.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   event);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkEvent* ptr_event = (VkEvent*) event;
	VkResult res = vkSetEvent(
			(VkDevice) (*ptr_device),
			(VkEvent) (*ptr_event));
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
    * @param device - 
    * @param event - 
    * 
    * @return VkResult
    */
   public VkResult vkResetEvent(
		VkDevice device,
		VkEvent event){
	int  _val = vkResetEvent0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(event==null ? null : event.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   event);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkEvent* ptr_event = (VkEvent*) event;
	VkResult res = vkResetEvent(
			(VkDevice) (*ptr_device),
			(VkEvent) (*ptr_event));
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
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pQueryPool - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateQueryPool(
		VkDevice device,
		 VkQueryPoolCreateInfo  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkQueryPool  pQueryPool){
	int  _val = vkCreateQueryPool0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pQueryPool==null ? null : pQueryPool.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pQueryPool);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkCreateQueryPool(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param queryPool - 
    * @param pAllocator - 
    */
   public void vkDestroyQueryPool(
		VkDevice device,
		VkQueryPool queryPool,
		 VkAllocationCallbacks  pAllocator){
	vkDestroyQueryPool0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(queryPool==null ? null : queryPool.getPointer()) /* ByteBuffer */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   queryPool,
		java.nio.ByteBuffer   pAllocator);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkQueryPool* ptr_queryPool = (VkQueryPool*) queryPool;
	vkDestroyQueryPool(
			(VkDevice) (*ptr_device),
			(VkQueryPool) (*ptr_queryPool),
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
    * @param device - 
    * @param queryPool - 
    * @param firstQuery - 
    * @param queryCount - 
    * @param dataSize - 
    * @param pData - 
    * @param stride - 
    * @param flags - 
    * 
    * @return VkResult
    */
   public VkResult vkGetQueryPoolResults(
		VkDevice device,
		VkQueryPool queryPool,
		int firstQuery,
		int queryCount,
		long dataSize,
		java.nio.Buffer pData,
		long stride,
		int flags){
	int  _val = vkGetQueryPoolResults0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(queryPool==null ? null : queryPool.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   queryPool,
		int  firstQuery,
		int  queryCount,
		long  dataSize,
		java.nio.Buffer  pData,
		long  stride,
		int  flags);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkQueryPool* ptr_queryPool = (VkQueryPool*) queryPool;
	VkResult res = vkGetQueryPoolResults(
			(VkDevice) (*ptr_device),
			(VkQueryPool) (*ptr_queryPool),
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
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pBuffer - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateBuffer(
		VkDevice device,
		 VkBufferCreateInfo  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkBuffer  pBuffer){
	int  _val = vkCreateBuffer0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pBuffer==null ? null : pBuffer.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pBuffer);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkCreateBuffer(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param buffer - 
    * @param pAllocator - 
    */
   public void vkDestroyBuffer(
		VkDevice device,
		VkBuffer buffer,
		 VkAllocationCallbacks  pAllocator){
	vkDestroyBuffer0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(buffer==null ? null : buffer.getPointer()) /* ByteBuffer */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   buffer,
		java.nio.ByteBuffer   pAllocator);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkBuffer* ptr_buffer = (VkBuffer*) buffer;
	vkDestroyBuffer(
			(VkDevice) (*ptr_device),
			(VkBuffer) (*ptr_buffer),
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
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pView - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateBufferView(
		VkDevice device,
		 VkBufferViewCreateInfo  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkBufferView  pView){
	int  _val = vkCreateBufferView0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pView==null ? null : pView.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pView);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkCreateBufferView(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param bufferView - 
    * @param pAllocator - 
    */
   public void vkDestroyBufferView(
		VkDevice device,
		VkBufferView bufferView,
		 VkAllocationCallbacks  pAllocator){
	vkDestroyBufferView0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(bufferView==null ? null : bufferView.getPointer()) /* ByteBuffer */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   bufferView,
		java.nio.ByteBuffer   pAllocator);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkBufferView* ptr_bufferView = (VkBufferView*) bufferView;
	vkDestroyBufferView(
			(VkDevice) (*ptr_device),
			(VkBufferView) (*ptr_bufferView),
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
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pImage - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateImage(
		VkDevice device,
		 VkImageCreateInfo  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkImage  pImage){
	int  _val = vkCreateImage0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pImage==null ? null : pImage.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pImage);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkCreateImage(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param image - 
    * @param pAllocator - 
    */
   public void vkDestroyImage(
		VkDevice device,
		VkImage image,
		 VkAllocationCallbacks  pAllocator){
	vkDestroyImage0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(image==null ? null : image.getPointer()) /* ByteBuffer */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   image,
		java.nio.ByteBuffer   pAllocator);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkImage* ptr_image = (VkImage*) image;
	vkDestroyImage(
			(VkDevice) (*ptr_device),
			(VkImage) (*ptr_image),
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
    * @param device - 
    * @param image - 
    * @param pSubresource - 
    * @param pLayout - 
    */
   public void vkGetImageSubresourceLayout(
		VkDevice device,
		VkImage image,
		 VkImageSubresource  pSubresource,
		 VkSubresourceLayout  pLayout){
	vkGetImageSubresourceLayout0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(image==null ? null : image.getPointer()) /* ByteBuffer */ ,
		(pSubresource==null ? null : pSubresource.getPointer()) /* ByteBuffer */ ,
		(pLayout==null ? null : pLayout.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   image,
		java.nio.ByteBuffer   pSubresource,
		java.nio.ByteBuffer   pLayout);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkImage* ptr_image = (VkImage*) image;
	vkGetImageSubresourceLayout(
			(VkDevice) (*ptr_device),
			(VkImage) (*ptr_image),
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
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pView - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateImageView(
		VkDevice device,
		 VkImageViewCreateInfo  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkImageView  pView){
	int  _val = vkCreateImageView0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pView==null ? null : pView.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pView);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkCreateImageView(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param imageView - 
    * @param pAllocator - 
    */
   public void vkDestroyImageView(
		VkDevice device,
		VkImageView imageView,
		 VkAllocationCallbacks  pAllocator){
	vkDestroyImageView0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(imageView==null ? null : imageView.getPointer()) /* ByteBuffer */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   imageView,
		java.nio.ByteBuffer   pAllocator);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkImageView* ptr_imageView = (VkImageView*) imageView;
	vkDestroyImageView(
			(VkDevice) (*ptr_device),
			(VkImageView) (*ptr_imageView),
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
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pShaderModule - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateShaderModule(
		VkDevice device,
		 VkShaderModuleCreateInfo  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkShaderModule  pShaderModule){
	int  _val = vkCreateShaderModule0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pShaderModule==null ? null : pShaderModule.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pShaderModule);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkCreateShaderModule(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param shaderModule - 
    * @param pAllocator - 
    */
   public void vkDestroyShaderModule(
		VkDevice device,
		VkShaderModule shaderModule,
		 VkAllocationCallbacks  pAllocator){
	vkDestroyShaderModule0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(shaderModule==null ? null : shaderModule.getPointer()) /* ByteBuffer */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   shaderModule,
		java.nio.ByteBuffer   pAllocator);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkShaderModule* ptr_shaderModule = (VkShaderModule*) shaderModule;
	vkDestroyShaderModule(
			(VkDevice) (*ptr_device),
			(VkShaderModule) (*ptr_shaderModule),
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
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pPipelineCache - 
    * 
    * @return VkResult
    */
   public VkResult vkCreatePipelineCache(
		VkDevice device,
		 VkPipelineCacheCreateInfo  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkPipelineCache  pPipelineCache){
	int  _val = vkCreatePipelineCache0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pPipelineCache==null ? null : pPipelineCache.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pPipelineCache);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkCreatePipelineCache(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param pipelineCache - 
    * @param pAllocator - 
    */
   public void vkDestroyPipelineCache(
		VkDevice device,
		VkPipelineCache pipelineCache,
		 VkAllocationCallbacks  pAllocator){
	vkDestroyPipelineCache0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(pipelineCache==null ? null : pipelineCache.getPointer()) /* ByteBuffer */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pipelineCache,
		java.nio.ByteBuffer   pAllocator);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkPipelineCache* ptr_pipelineCache = (VkPipelineCache*) pipelineCache;
	vkDestroyPipelineCache(
			(VkDevice) (*ptr_device),
			(VkPipelineCache) (*ptr_pipelineCache),
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
    * @param device - 
    * @param pipelineCache - 
    * @param pDataSize - 
    * @param pData - 
    * 
    * @return VkResult
    */
   public VkResult vkGetPipelineCacheData(
		VkDevice device,
		VkPipelineCache pipelineCache,
		long[] pDataSize,
		java.nio.Buffer pData){
	int  _val = vkGetPipelineCacheData0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(pipelineCache==null ? null : pipelineCache.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pipelineCache,
		long[]  pDataSize,
		java.nio.Buffer  pData);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkPipelineCache* ptr_pipelineCache = (VkPipelineCache*) pipelineCache;
	VkResult res = vkGetPipelineCacheData(
			(VkDevice) (*ptr_device),
			(VkPipelineCache) (*ptr_pipelineCache),
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
    * @param device - 
    * @param dstCache - 
    * @param srcCacheCount - 
    * @param pSrcCaches - 
    * 
    * @return VkResult
    */
   public VkResult vkMergePipelineCaches(
		VkDevice device,
		VkPipelineCache dstCache,
		int srcCacheCount,
		 VkPipelineCache  pSrcCaches){
	int  _val = vkMergePipelineCaches0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(dstCache==null ? null : dstCache.getPointer()) /* ByteBuffer */ ,
			srcCacheCount ,
			(pSrcCaches==null ? null : pSrcCaches.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   dstCache,
		int  srcCacheCount,
		java.nio.ByteBuffer   pSrcCaches);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkPipelineCache* ptr_dstCache = (VkPipelineCache*) dstCache;
	VkResult res = vkMergePipelineCaches(
			(VkDevice) (*ptr_device),
			(VkPipelineCache) (*ptr_dstCache),
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
    * @param device - 
    * @param pipelineCache - 
    * @param createInfoCount - 
    * @param pCreateInfos - 
    * @param pAllocator - 
    * @param pPipelines - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateGraphicsPipelines(
		VkDevice device,
		VkPipelineCache pipelineCache,
		int createInfoCount,
		 VkGraphicsPipelineCreateInfo  pCreateInfos,
		 VkAllocationCallbacks  pAllocator,
		 VkPipeline  pPipelines){
	int  _val = vkCreateGraphicsPipelines0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(pipelineCache==null ? null : pipelineCache.getPointer()) /* ByteBuffer */ ,
			createInfoCount ,
			(pCreateInfos==null ? null : pCreateInfos.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pPipelines==null ? null : pPipelines.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pipelineCache,
		int  createInfoCount,
		java.nio.ByteBuffer   pCreateInfos,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pPipelines);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkPipelineCache* ptr_pipelineCache = (VkPipelineCache*) pipelineCache;
	VkResult res = vkCreateGraphicsPipelines(
			(VkDevice) (*ptr_device),
			(VkPipelineCache) (*ptr_pipelineCache),
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
    * @param device - 
    * @param pipelineCache - 
    * @param createInfoCount - 
    * @param pCreateInfos - 
    * @param pAllocator - 
    * @param pPipelines - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateComputePipelines(
		VkDevice device,
		VkPipelineCache pipelineCache,
		int createInfoCount,
		 VkComputePipelineCreateInfo  pCreateInfos,
		 VkAllocationCallbacks  pAllocator,
		 VkPipeline  pPipelines){
	int  _val = vkCreateComputePipelines0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(pipelineCache==null ? null : pipelineCache.getPointer()) /* ByteBuffer */ ,
			createInfoCount ,
			(pCreateInfos==null ? null : pCreateInfos.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pPipelines==null ? null : pPipelines.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pipelineCache,
		int  createInfoCount,
		java.nio.ByteBuffer   pCreateInfos,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pPipelines);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkPipelineCache* ptr_pipelineCache = (VkPipelineCache*) pipelineCache;
	VkResult res = vkCreateComputePipelines(
			(VkDevice) (*ptr_device),
			(VkPipelineCache) (*ptr_pipelineCache),
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
    * @param device - 
    * @param pipeline - 
    * @param pAllocator - 
    */
   public void vkDestroyPipeline(
		VkDevice device,
		VkPipeline pipeline,
		 VkAllocationCallbacks  pAllocator){
	vkDestroyPipeline0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(pipeline==null ? null : pipeline.getPointer()) /* ByteBuffer */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pipeline,
		java.nio.ByteBuffer   pAllocator);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkPipeline* ptr_pipeline = (VkPipeline*) pipeline;
	vkDestroyPipeline(
			(VkDevice) (*ptr_device),
			(VkPipeline) (*ptr_pipeline),
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
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pPipelineLayout - 
    * 
    * @return VkResult
    */
   public VkResult vkCreatePipelineLayout(
		VkDevice device,
		 VkPipelineLayoutCreateInfo  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkPipelineLayout  pPipelineLayout){
	int  _val = vkCreatePipelineLayout0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pPipelineLayout==null ? null : pPipelineLayout.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pPipelineLayout);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkCreatePipelineLayout(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param pipelineLayout - 
    * @param pAllocator - 
    */
   public void vkDestroyPipelineLayout(
		VkDevice device,
		VkPipelineLayout pipelineLayout,
		 VkAllocationCallbacks  pAllocator){
	vkDestroyPipelineLayout0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(pipelineLayout==null ? null : pipelineLayout.getPointer()) /* ByteBuffer */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pipelineLayout,
		java.nio.ByteBuffer   pAllocator);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkPipelineLayout* ptr_pipelineLayout = (VkPipelineLayout*) pipelineLayout;
	vkDestroyPipelineLayout(
			(VkDevice) (*ptr_device),
			(VkPipelineLayout) (*ptr_pipelineLayout),
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
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pSampler - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateSampler(
		VkDevice device,
		 VkSamplerCreateInfo  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkSampler  pSampler){
	int  _val = vkCreateSampler0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pSampler==null ? null : pSampler.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pSampler);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkCreateSampler(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param sampler - 
    * @param pAllocator - 
    */
   public void vkDestroySampler(
		VkDevice device,
		VkSampler sampler,
		 VkAllocationCallbacks  pAllocator){
	vkDestroySampler0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(sampler==null ? null : sampler.getPointer()) /* ByteBuffer */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   sampler,
		java.nio.ByteBuffer   pAllocator);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkSampler* ptr_sampler = (VkSampler*) sampler;
	vkDestroySampler(
			(VkDevice) (*ptr_device),
			(VkSampler) (*ptr_sampler),
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
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pSetLayout - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateDescriptorSetLayout(
		VkDevice device,
		 VkDescriptorSetLayoutCreateInfo  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkDescriptorSetLayout  pSetLayout){
	int  _val = vkCreateDescriptorSetLayout0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pSetLayout==null ? null : pSetLayout.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pSetLayout);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkCreateDescriptorSetLayout(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param descriptorSetLayout - 
    * @param pAllocator - 
    */
   public void vkDestroyDescriptorSetLayout(
		VkDevice device,
		VkDescriptorSetLayout descriptorSetLayout,
		 VkAllocationCallbacks  pAllocator){
	vkDestroyDescriptorSetLayout0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(descriptorSetLayout==null ? null : descriptorSetLayout.getPointer()) /* ByteBuffer */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   descriptorSetLayout,
		java.nio.ByteBuffer   pAllocator);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkDescriptorSetLayout* ptr_descriptorSetLayout = (VkDescriptorSetLayout*) descriptorSetLayout;
	vkDestroyDescriptorSetLayout(
			(VkDevice) (*ptr_device),
			(VkDescriptorSetLayout) (*ptr_descriptorSetLayout),
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
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pDescriptorPool - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateDescriptorPool(
		VkDevice device,
		 VkDescriptorPoolCreateInfo  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkDescriptorPool  pDescriptorPool){
	int  _val = vkCreateDescriptorPool0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pDescriptorPool==null ? null : pDescriptorPool.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pDescriptorPool);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkCreateDescriptorPool(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param descriptorPool - 
    * @param pAllocator - 
    */
   public void vkDestroyDescriptorPool(
		VkDevice device,
		VkDescriptorPool descriptorPool,
		 VkAllocationCallbacks  pAllocator){
	vkDestroyDescriptorPool0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(descriptorPool==null ? null : descriptorPool.getPointer()) /* ByteBuffer */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   descriptorPool,
		java.nio.ByteBuffer   pAllocator);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkDescriptorPool* ptr_descriptorPool = (VkDescriptorPool*) descriptorPool;
	vkDestroyDescriptorPool(
			(VkDevice) (*ptr_device),
			(VkDescriptorPool) (*ptr_descriptorPool),
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
    * @param device - 
    * @param descriptorPool - 
    * @param flags - 
    * 
    * @return VkResult
    */
   public VkResult vkResetDescriptorPool(
		VkDevice device,
		VkDescriptorPool descriptorPool,
		int flags){
	int  _val = vkResetDescriptorPool0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(descriptorPool==null ? null : descriptorPool.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   descriptorPool,
		int  flags);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkDescriptorPool* ptr_descriptorPool = (VkDescriptorPool*) descriptorPool;
	VkResult res = vkResetDescriptorPool(
			(VkDevice) (*ptr_device),
			(VkDescriptorPool) (*ptr_descriptorPool),
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
    * @param device - 
    * @param pAllocateInfo - 
    * @param pDescriptorSets - 
    * 
    * @return VkResult
    */
   public VkResult vkAllocateDescriptorSets(
		VkDevice device,
		 VkDescriptorSetAllocateInfo  pAllocateInfo,
		 VkDescriptorSet  pDescriptorSets){
	int  _val = vkAllocateDescriptorSets0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(pAllocateInfo==null ? null : pAllocateInfo.getPointer()) /* ByteBuffer */ ,
			(pDescriptorSets==null ? null : pDescriptorSets.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pAllocateInfo,
		java.nio.ByteBuffer   pDescriptorSets);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkAllocateDescriptorSets(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param descriptorPool - 
    * @param descriptorSetCount - 
    * @param pDescriptorSets - 
    * 
    * @return VkResult
    */
   public VkResult vkFreeDescriptorSets(
		VkDevice device,
		VkDescriptorPool descriptorPool,
		int descriptorSetCount,
		 VkDescriptorSet  pDescriptorSets){
	int  _val = vkFreeDescriptorSets0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(descriptorPool==null ? null : descriptorPool.getPointer()) /* ByteBuffer */ ,
			descriptorSetCount ,
			(pDescriptorSets==null ? null : pDescriptorSets.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   descriptorPool,
		int  descriptorSetCount,
		java.nio.ByteBuffer   pDescriptorSets);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkDescriptorPool* ptr_descriptorPool = (VkDescriptorPool*) descriptorPool;
	VkResult res = vkFreeDescriptorSets(
			(VkDevice) (*ptr_device),
			(VkDescriptorPool) (*ptr_descriptorPool),
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
    * @param device - 
    * @param descriptorWriteCount - 
    * @param pDescriptorWrites - 
    * @param descriptorCopyCount - 
    * @param pDescriptorCopies - 
    */
   public void vkUpdateDescriptorSets(
		VkDevice device,
		int descriptorWriteCount,
		 VkWriteDescriptorSet  pDescriptorWrites,
		int descriptorCopyCount,
		 VkCopyDescriptorSet  pDescriptorCopies){
	vkUpdateDescriptorSets0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		descriptorWriteCount ,
		(pDescriptorWrites==null ? null : pDescriptorWrites.getPointer()) /* ByteBuffer */ ,
		descriptorCopyCount ,
		(pDescriptorCopies==null ? null : pDescriptorCopies.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		int  descriptorWriteCount,
		java.nio.ByteBuffer   pDescriptorWrites,
		int  descriptorCopyCount,
		java.nio.ByteBuffer   pDescriptorCopies);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	vkUpdateDescriptorSets(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pFramebuffer - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateFramebuffer(
		VkDevice device,
		 VkFramebufferCreateInfo  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkFramebuffer  pFramebuffer){
	int  _val = vkCreateFramebuffer0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pFramebuffer==null ? null : pFramebuffer.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pFramebuffer);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkCreateFramebuffer(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param framebuffer - 
    * @param pAllocator - 
    */
   public void vkDestroyFramebuffer(
		VkDevice device,
		VkFramebuffer framebuffer,
		 VkAllocationCallbacks  pAllocator){
	vkDestroyFramebuffer0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(framebuffer==null ? null : framebuffer.getPointer()) /* ByteBuffer */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   framebuffer,
		java.nio.ByteBuffer   pAllocator);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkFramebuffer* ptr_framebuffer = (VkFramebuffer*) framebuffer;
	vkDestroyFramebuffer(
			(VkDevice) (*ptr_device),
			(VkFramebuffer) (*ptr_framebuffer),
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
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pRenderPass - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateRenderPass(
		VkDevice device,
		 VkRenderPassCreateInfo  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkRenderPass  pRenderPass){
	int  _val = vkCreateRenderPass0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pRenderPass==null ? null : pRenderPass.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pRenderPass);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkCreateRenderPass(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param renderPass - 
    * @param pAllocator - 
    */
   public void vkDestroyRenderPass(
		VkDevice device,
		VkRenderPass renderPass,
		 VkAllocationCallbacks  pAllocator){
	vkDestroyRenderPass0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(renderPass==null ? null : renderPass.getPointer()) /* ByteBuffer */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   renderPass,
		java.nio.ByteBuffer   pAllocator);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkRenderPass* ptr_renderPass = (VkRenderPass*) renderPass;
	vkDestroyRenderPass(
			(VkDevice) (*ptr_device),
			(VkRenderPass) (*ptr_renderPass),
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
    * @param device - 
    * @param renderPass - 
    * @param pGranularity - 
    */
   public void vkGetRenderAreaGranularity(
		VkDevice device,
		VkRenderPass renderPass,
		 VkExtent2D  pGranularity){
	vkGetRenderAreaGranularity0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(renderPass==null ? null : renderPass.getPointer()) /* ByteBuffer */ ,
		(pGranularity==null ? null : pGranularity.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   renderPass,
		java.nio.ByteBuffer   pGranularity);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkRenderPass* ptr_renderPass = (VkRenderPass*) renderPass;
	vkGetRenderAreaGranularity(
			(VkDevice) (*ptr_device),
			(VkRenderPass) (*ptr_renderPass),
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
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pCommandPool - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateCommandPool(
		VkDevice device,
		 VkCommandPoolCreateInfo  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkCommandPool  pCommandPool){
	int  _val = vkCreateCommandPool0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pCommandPool==null ? null : pCommandPool.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pCommandPool);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkCreateCommandPool(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param commandPool - 
    * @param pAllocator - 
    */
   public void vkDestroyCommandPool(
		VkDevice device,
		VkCommandPool commandPool,
		 VkAllocationCallbacks  pAllocator){
	vkDestroyCommandPool0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(commandPool==null ? null : commandPool.getPointer()) /* ByteBuffer */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   commandPool,
		java.nio.ByteBuffer   pAllocator);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkCommandPool* ptr_commandPool = (VkCommandPool*) commandPool;
	vkDestroyCommandPool(
			(VkDevice) (*ptr_device),
			(VkCommandPool) (*ptr_commandPool),
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
    * @param device - 
    * @param commandPool - 
    * @param flags - 
    * 
    * @return VkResult
    */
   public VkResult vkResetCommandPool(
		VkDevice device,
		VkCommandPool commandPool,
		int flags){
	int  _val = vkResetCommandPool0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(commandPool==null ? null : commandPool.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   commandPool,
		int  flags);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkCommandPool* ptr_commandPool = (VkCommandPool*) commandPool;
	VkResult res = vkResetCommandPool(
			(VkDevice) (*ptr_device),
			(VkCommandPool) (*ptr_commandPool),
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
    * @param device - 
    * @param pAllocateInfo - 
    * @param pCommandBuffers - 
    * 
    * @return VkResult
    */
   public VkResult vkAllocateCommandBuffers(
		VkDevice device,
		 VkCommandBufferAllocateInfo  pAllocateInfo,
		 VkCommandBuffer  pCommandBuffers){
	int  _val = vkAllocateCommandBuffers0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(pAllocateInfo==null ? null : pAllocateInfo.getPointer()) /* ByteBuffer */ ,
			(pCommandBuffers==null ? null : pCommandBuffers.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pAllocateInfo,
		java.nio.ByteBuffer   pCommandBuffers);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkAllocateCommandBuffers(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param commandPool - 
    * @param commandBufferCount - 
    * @param pCommandBuffers - 
    */
   public void vkFreeCommandBuffers(
		VkDevice device,
		VkCommandPool commandPool,
		int commandBufferCount,
		 VkCommandBuffer  pCommandBuffers){
	vkFreeCommandBuffers0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(commandPool==null ? null : commandPool.getPointer()) /* ByteBuffer */ ,
		commandBufferCount ,
		(pCommandBuffers==null ? null : pCommandBuffers.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   commandPool,
		int  commandBufferCount,
		java.nio.ByteBuffer   pCommandBuffers);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkCommandPool* ptr_commandPool = (VkCommandPool*) commandPool;
	vkFreeCommandBuffers(
			(VkDevice) (*ptr_device),
			(VkCommandPool) (*ptr_commandPool),
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
    * @param commandBuffer - 
    * @param pBeginInfo - 
    * 
    * @return VkResult
    */
   public VkResult vkBeginCommandBuffer(
		VkCommandBuffer commandBuffer,
		 VkCommandBufferBeginInfo  pBeginInfo){
	int  _val = vkBeginCommandBuffer0(
			(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
			(pBeginInfo==null ? null : pBeginInfo.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   commandBuffer,
		java.nio.ByteBuffer   pBeginInfo);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkResult res = vkBeginCommandBuffer(
			(VkCommandBuffer) (*ptr_commandBuffer),
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
    * @param commandBuffer - 
    * 
    * @return VkResult
    */
   public VkResult vkEndCommandBuffer(
		VkCommandBuffer commandBuffer){
	int  _val = vkEndCommandBuffer0(
			(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   commandBuffer);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkResult res = vkEndCommandBuffer(
			(VkCommandBuffer) (*ptr_commandBuffer));
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
    * @param commandBuffer - 
    * @param flags - 
    * 
    * @return VkResult
    */
   public VkResult vkResetCommandBuffer(
		VkCommandBuffer commandBuffer,
		int flags){
	int  _val = vkResetCommandBuffer0(
			(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   commandBuffer,
		int  flags);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkResult res = vkResetCommandBuffer(
			(VkCommandBuffer) (*ptr_commandBuffer),
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
    * @param commandBuffer - 
    * @param pipelineBindPoint - 
    * @param pipeline - 
    */
   public void vkCmdBindPipeline(
		VkCommandBuffer commandBuffer,
		VkPipelineBindPoint pipelineBindPoint,
		VkPipeline pipeline){
	vkCmdBindPipeline0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		pipelineBindPoint.getValue() /* enum */,
		(pipeline==null ? null : pipeline.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   commandBuffer,
		int   pipelineBindPoint,
		java.nio.ByteBuffer   pipeline);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkPipeline* ptr_pipeline = (VkPipeline*) pipeline;
	vkCmdBindPipeline(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(VkPipelineBindPoint) pipelineBindPoint,
			(VkPipeline) (*ptr_pipeline));

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
    * @param commandBuffer - 
    * @param firstViewport - 
    * @param viewportCount - 
    * @param pViewports - 
    */
   public void vkCmdSetViewport(
		VkCommandBuffer commandBuffer,
		int firstViewport,
		int viewportCount,
		 VkViewport  pViewports){
	vkCmdSetViewport0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		firstViewport ,
		viewportCount ,
		(pViewports==null ? null : pViewports.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   commandBuffer,
		int  firstViewport,
		int  viewportCount,
		java.nio.ByteBuffer   pViewports);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	vkCmdSetViewport(
			(VkCommandBuffer) (*ptr_commandBuffer),
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
    * @param commandBuffer - 
    * @param firstScissor - 
    * @param scissorCount - 
    * @param pScissors - 
    */
   public void vkCmdSetScissor(
		VkCommandBuffer commandBuffer,
		int firstScissor,
		int scissorCount,
		 VkRect2D  pScissors){
	vkCmdSetScissor0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		firstScissor ,
		scissorCount ,
		(pScissors==null ? null : pScissors.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   commandBuffer,
		int  firstScissor,
		int  scissorCount,
		java.nio.ByteBuffer   pScissors);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	vkCmdSetScissor(
			(VkCommandBuffer) (*ptr_commandBuffer),
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
    * @param commandBuffer - 
    * @param lineWidth - 
    */
   public void vkCmdSetLineWidth(
		VkCommandBuffer commandBuffer,
		float lineWidth){
	vkCmdSetLineWidth0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   commandBuffer,
		float  lineWidth);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	vkCmdSetLineWidth(
			(VkCommandBuffer) (*ptr_commandBuffer),
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
    * @param commandBuffer - 
    * @param depthBiasConstantFactor - 
    * @param depthBiasClamp - 
    * @param depthBiasSlopeFactor - 
    */
   public void vkCmdSetDepthBias(
		VkCommandBuffer commandBuffer,
		float depthBiasConstantFactor,
		float depthBiasClamp,
		float depthBiasSlopeFactor){
	vkCmdSetDepthBias0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   commandBuffer,
		float  depthBiasConstantFactor,
		float  depthBiasClamp,
		float  depthBiasSlopeFactor);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	vkCmdSetDepthBias(
			(VkCommandBuffer) (*ptr_commandBuffer),
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
    * @param commandBuffer - 
    * @param blendConstants - 
    */
   public void vkCmdSetBlendConstants(
		VkCommandBuffer commandBuffer,
		float[] blendConstants){
	vkCmdSetBlendConstants0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   commandBuffer,
		float[]  blendConstants);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	vkCmdSetBlendConstants(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(const float[]) blendConstants);

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
    * @param commandBuffer - 
    * @param minDepthBounds - 
    * @param maxDepthBounds - 
    */
   public void vkCmdSetDepthBounds(
		VkCommandBuffer commandBuffer,
		float minDepthBounds,
		float maxDepthBounds){
	vkCmdSetDepthBounds0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   commandBuffer,
		float  minDepthBounds,
		float  maxDepthBounds);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	vkCmdSetDepthBounds(
			(VkCommandBuffer) (*ptr_commandBuffer),
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
    * @param commandBuffer - 
    * @param faceMask - 
    * @param compareMask - 
    */
   public void vkCmdSetStencilCompareMask(
		VkCommandBuffer commandBuffer,
		int faceMask,
		int compareMask){
	vkCmdSetStencilCompareMask0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   commandBuffer,
		int  faceMask,
		int  compareMask);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	vkCmdSetStencilCompareMask(
			(VkCommandBuffer) (*ptr_commandBuffer),
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
    * @param commandBuffer - 
    * @param faceMask - 
    * @param writeMask - 
    */
   public void vkCmdSetStencilWriteMask(
		VkCommandBuffer commandBuffer,
		int faceMask,
		int writeMask){
	vkCmdSetStencilWriteMask0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   commandBuffer,
		int  faceMask,
		int  writeMask);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	vkCmdSetStencilWriteMask(
			(VkCommandBuffer) (*ptr_commandBuffer),
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
    * @param commandBuffer - 
    * @param faceMask - 
    * @param reference - 
    */
   public void vkCmdSetStencilReference(
		VkCommandBuffer commandBuffer,
		int faceMask,
		int reference){
	vkCmdSetStencilReference0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   commandBuffer,
		int  faceMask,
		int  reference);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	vkCmdSetStencilReference(
			(VkCommandBuffer) (*ptr_commandBuffer),
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
    * @param commandBuffer - 
    * @param pipelineBindPoint - 
    * @param layout - 
    * @param firstSet - 
    * @param descriptorSetCount - 
    * @param pDescriptorSets - 
    * @param dynamicOffsetCount - 
    * @param pDynamicOffsets - 
    */
   public void vkCmdBindDescriptorSets(
		VkCommandBuffer commandBuffer,
		VkPipelineBindPoint pipelineBindPoint,
		VkPipelineLayout layout,
		int firstSet,
		int descriptorSetCount,
		 VkDescriptorSet  pDescriptorSets,
		int dynamicOffsetCount,
		int[] pDynamicOffsets){
	vkCmdBindDescriptorSets0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		pipelineBindPoint.getValue() /* enum */,
		(layout==null ? null : layout.getPointer()) /* ByteBuffer */ ,
		firstSet ,
		descriptorSetCount ,
		(pDescriptorSets==null ? null : pDescriptorSets.getPointer()) /* ByteBuffer */ ,
		dynamicOffsetCount ,
		pDynamicOffsets  );

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
		java.nio.ByteBuffer   commandBuffer,
		int   pipelineBindPoint,
		java.nio.ByteBuffer   layout,
		int  firstSet,
		int  descriptorSetCount,
		java.nio.ByteBuffer   pDescriptorSets,
		int  dynamicOffsetCount,
		int[]  pDynamicOffsets);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkPipelineLayout* ptr_layout = (VkPipelineLayout*) layout;
	vkCmdBindDescriptorSets(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(VkPipelineBindPoint) pipelineBindPoint,
			(VkPipelineLayout) (*ptr_layout),
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
    * @param commandBuffer - 
    * @param buffer - 
    * @param offset - 
    * @param indexType - 
    */
   public void vkCmdBindIndexBuffer(
		VkCommandBuffer commandBuffer,
		VkBuffer buffer,
		long offset,
		VkIndexType indexType){
	vkCmdBindIndexBuffer0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		(buffer==null ? null : buffer.getPointer()) /* ByteBuffer */ ,
		offset ,
		indexType.getValue() /* enum */ );

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
		java.nio.ByteBuffer   commandBuffer,
		java.nio.ByteBuffer   buffer,
		long  offset,
		int   indexType);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkBuffer* ptr_buffer = (VkBuffer*) buffer;
	vkCmdBindIndexBuffer(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(VkBuffer) (*ptr_buffer),
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
    * @param commandBuffer - 
    * @param firstBinding - 
    * @param bindingCount - 
    * @param pBuffers - 
    * @param pOffsets - 
    */
   public void vkCmdBindVertexBuffers(
		VkCommandBuffer commandBuffer,
		int firstBinding,
		int bindingCount,
		 VkBuffer  pBuffers,
		long[] pOffsets){
	vkCmdBindVertexBuffers0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		firstBinding ,
		bindingCount ,
		(pBuffers==null ? null : pBuffers.getPointer()) /* ByteBuffer */ ,
		pOffsets  );

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
		java.nio.ByteBuffer   commandBuffer,
		int  firstBinding,
		int  bindingCount,
		java.nio.ByteBuffer   pBuffers,
		long[]  pOffsets);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	vkCmdBindVertexBuffers(
			(VkCommandBuffer) (*ptr_commandBuffer),
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
    * @param commandBuffer - 
    * @param vertexCount - 
    * @param instanceCount - 
    * @param firstVertex - 
    * @param firstInstance - 
    */
   public void vkCmdDraw(
		VkCommandBuffer commandBuffer,
		int vertexCount,
		int instanceCount,
		int firstVertex,
		int firstInstance){
	vkCmdDraw0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   commandBuffer,
		int  vertexCount,
		int  instanceCount,
		int  firstVertex,
		int  firstInstance);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	vkCmdDraw(
			(VkCommandBuffer) (*ptr_commandBuffer),
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
    * @param commandBuffer - 
    * @param indexCount - 
    * @param instanceCount - 
    * @param firstIndex - 
    * @param vertexOffset - 
    * @param firstInstance - 
    */
   public void vkCmdDrawIndexed(
		VkCommandBuffer commandBuffer,
		int indexCount,
		int instanceCount,
		int firstIndex,
		int vertexOffset,
		int firstInstance){
	vkCmdDrawIndexed0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   commandBuffer,
		int  indexCount,
		int  instanceCount,
		int  firstIndex,
		int  vertexOffset,
		int  firstInstance);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	vkCmdDrawIndexed(
			(VkCommandBuffer) (*ptr_commandBuffer),
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
    * @param commandBuffer - 
    * @param buffer - 
    * @param offset - 
    * @param drawCount - 
    * @param stride - 
    */
   public void vkCmdDrawIndirect(
		VkCommandBuffer commandBuffer,
		VkBuffer buffer,
		long offset,
		int drawCount,
		int stride){
	vkCmdDrawIndirect0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		(buffer==null ? null : buffer.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   commandBuffer,
		java.nio.ByteBuffer   buffer,
		long  offset,
		int  drawCount,
		int  stride);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkBuffer* ptr_buffer = (VkBuffer*) buffer;
	vkCmdDrawIndirect(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(VkBuffer) (*ptr_buffer),
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
    * @param commandBuffer - 
    * @param buffer - 
    * @param offset - 
    * @param drawCount - 
    * @param stride - 
    */
   public void vkCmdDrawIndexedIndirect(
		VkCommandBuffer commandBuffer,
		VkBuffer buffer,
		long offset,
		int drawCount,
		int stride){
	vkCmdDrawIndexedIndirect0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		(buffer==null ? null : buffer.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   commandBuffer,
		java.nio.ByteBuffer   buffer,
		long  offset,
		int  drawCount,
		int  stride);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkBuffer* ptr_buffer = (VkBuffer*) buffer;
	vkCmdDrawIndexedIndirect(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(VkBuffer) (*ptr_buffer),
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
    * @param commandBuffer - 
    * @param x - 
    * @param y - 
    * @param z - 
    */
   public void vkCmdDispatch(
		VkCommandBuffer commandBuffer,
		int x,
		int y,
		int z){
	vkCmdDispatch0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   commandBuffer,
		int  x,
		int  y,
		int  z);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	vkCmdDispatch(
			(VkCommandBuffer) (*ptr_commandBuffer),
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
    * @param commandBuffer - 
    * @param buffer - 
    * @param offset - 
    */
   public void vkCmdDispatchIndirect(
		VkCommandBuffer commandBuffer,
		VkBuffer buffer,
		long offset){
	vkCmdDispatchIndirect0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		(buffer==null ? null : buffer.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   commandBuffer,
		java.nio.ByteBuffer   buffer,
		long  offset);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkBuffer* ptr_buffer = (VkBuffer*) buffer;
	vkCmdDispatchIndirect(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(VkBuffer) (*ptr_buffer),
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
    * @param commandBuffer - 
    * @param srcBuffer - 
    * @param dstBuffer - 
    * @param regionCount - 
    * @param pRegions - 
    */
   public void vkCmdCopyBuffer(
		VkCommandBuffer commandBuffer,
		VkBuffer srcBuffer,
		VkBuffer dstBuffer,
		int regionCount,
		 VkBufferCopy  pRegions){
	vkCmdCopyBuffer0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		(srcBuffer==null ? null : srcBuffer.getPointer()) /* ByteBuffer */ ,
		(dstBuffer==null ? null : dstBuffer.getPointer()) /* ByteBuffer */ ,
		regionCount ,
		(pRegions==null ? null : pRegions.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   commandBuffer,
		java.nio.ByteBuffer   srcBuffer,
		java.nio.ByteBuffer   dstBuffer,
		int  regionCount,
		java.nio.ByteBuffer   pRegions);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkBuffer* ptr_srcBuffer = (VkBuffer*) srcBuffer;
	VkBuffer* ptr_dstBuffer = (VkBuffer*) dstBuffer;
	vkCmdCopyBuffer(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(VkBuffer) (*ptr_srcBuffer),
			(VkBuffer) (*ptr_dstBuffer),
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
    * @param commandBuffer - 
    * @param srcImage - 
    * @param srcImageLayout - 
    * @param dstImage - 
    * @param dstImageLayout - 
    * @param regionCount - 
    * @param pRegions - 
    */
   public void vkCmdCopyImage(
		VkCommandBuffer commandBuffer,
		VkImage srcImage,
		VkImageLayout srcImageLayout,
		VkImage dstImage,
		VkImageLayout dstImageLayout,
		int regionCount,
		 VkImageCopy  pRegions){
	vkCmdCopyImage0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		(srcImage==null ? null : srcImage.getPointer()) /* ByteBuffer */ ,
		srcImageLayout.getValue() /* enum */,
		(dstImage==null ? null : dstImage.getPointer()) /* ByteBuffer */ ,
		dstImageLayout.getValue() /* enum */,
		regionCount ,
		(pRegions==null ? null : pRegions.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   commandBuffer,
		java.nio.ByteBuffer   srcImage,
		int   srcImageLayout,
		java.nio.ByteBuffer   dstImage,
		int   dstImageLayout,
		int  regionCount,
		java.nio.ByteBuffer   pRegions);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkImage* ptr_srcImage = (VkImage*) srcImage;
	VkImage* ptr_dstImage = (VkImage*) dstImage;
	vkCmdCopyImage(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(VkImage) (*ptr_srcImage),
			(VkImageLayout) srcImageLayout,
			(VkImage) (*ptr_dstImage),
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
    * @param commandBuffer - 
    * @param srcImage - 
    * @param srcImageLayout - 
    * @param dstImage - 
    * @param dstImageLayout - 
    * @param regionCount - 
    * @param pRegions - 
    * @param filter - 
    */
   public void vkCmdBlitImage(
		VkCommandBuffer commandBuffer,
		VkImage srcImage,
		VkImageLayout srcImageLayout,
		VkImage dstImage,
		VkImageLayout dstImageLayout,
		int regionCount,
		 VkImageBlit  pRegions,
		VkFilter filter){
	vkCmdBlitImage0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		(srcImage==null ? null : srcImage.getPointer()) /* ByteBuffer */ ,
		srcImageLayout.getValue() /* enum */,
		(dstImage==null ? null : dstImage.getPointer()) /* ByteBuffer */ ,
		dstImageLayout.getValue() /* enum */,
		regionCount ,
		(pRegions==null ? null : pRegions.getPointer()) /* ByteBuffer */ ,
		filter.getValue() /* enum */ );

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
		java.nio.ByteBuffer   commandBuffer,
		java.nio.ByteBuffer   srcImage,
		int   srcImageLayout,
		java.nio.ByteBuffer   dstImage,
		int   dstImageLayout,
		int  regionCount,
		java.nio.ByteBuffer   pRegions,
		int   filter);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkImage* ptr_srcImage = (VkImage*) srcImage;
	VkImage* ptr_dstImage = (VkImage*) dstImage;
	vkCmdBlitImage(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(VkImage) (*ptr_srcImage),
			(VkImageLayout) srcImageLayout,
			(VkImage) (*ptr_dstImage),
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
    * @param commandBuffer - 
    * @param srcBuffer - 
    * @param dstImage - 
    * @param dstImageLayout - 
    * @param regionCount - 
    * @param pRegions - 
    */
   public void vkCmdCopyBufferToImage(
		VkCommandBuffer commandBuffer,
		VkBuffer srcBuffer,
		VkImage dstImage,
		VkImageLayout dstImageLayout,
		int regionCount,
		 VkBufferImageCopy  pRegions){
	vkCmdCopyBufferToImage0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		(srcBuffer==null ? null : srcBuffer.getPointer()) /* ByteBuffer */ ,
		(dstImage==null ? null : dstImage.getPointer()) /* ByteBuffer */ ,
		dstImageLayout.getValue() /* enum */,
		regionCount ,
		(pRegions==null ? null : pRegions.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   commandBuffer,
		java.nio.ByteBuffer   srcBuffer,
		java.nio.ByteBuffer   dstImage,
		int   dstImageLayout,
		int  regionCount,
		java.nio.ByteBuffer   pRegions);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkBuffer* ptr_srcBuffer = (VkBuffer*) srcBuffer;
	VkImage* ptr_dstImage = (VkImage*) dstImage;
	vkCmdCopyBufferToImage(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(VkBuffer) (*ptr_srcBuffer),
			(VkImage) (*ptr_dstImage),
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
    * @param commandBuffer - 
    * @param srcImage - 
    * @param srcImageLayout - 
    * @param dstBuffer - 
    * @param regionCount - 
    * @param pRegions - 
    */
   public void vkCmdCopyImageToBuffer(
		VkCommandBuffer commandBuffer,
		VkImage srcImage,
		VkImageLayout srcImageLayout,
		VkBuffer dstBuffer,
		int regionCount,
		 VkBufferImageCopy  pRegions){
	vkCmdCopyImageToBuffer0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		(srcImage==null ? null : srcImage.getPointer()) /* ByteBuffer */ ,
		srcImageLayout.getValue() /* enum */,
		(dstBuffer==null ? null : dstBuffer.getPointer()) /* ByteBuffer */ ,
		regionCount ,
		(pRegions==null ? null : pRegions.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   commandBuffer,
		java.nio.ByteBuffer   srcImage,
		int   srcImageLayout,
		java.nio.ByteBuffer   dstBuffer,
		int  regionCount,
		java.nio.ByteBuffer   pRegions);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkImage* ptr_srcImage = (VkImage*) srcImage;
	VkBuffer* ptr_dstBuffer = (VkBuffer*) dstBuffer;
	vkCmdCopyImageToBuffer(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(VkImage) (*ptr_srcImage),
			(VkImageLayout) srcImageLayout,
			(VkBuffer) (*ptr_dstBuffer),
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
    *     const uint32_t*                             pData);
    * </pre>
    * 
    * @param commandBuffer - 
    * @param dstBuffer - 
    * @param dstOffset - 
    * @param dataSize - 
    * @param pData - 
    */
   public void vkCmdUpdateBuffer(
		VkCommandBuffer commandBuffer,
		VkBuffer dstBuffer,
		long dstOffset,
		long dataSize,
		int[] pData){
	vkCmdUpdateBuffer0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		(dstBuffer==null ? null : dstBuffer.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   commandBuffer,
		java.nio.ByteBuffer   dstBuffer,
		long  dstOffset,
		long  dataSize,
		int[]  pData);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkBuffer* ptr_dstBuffer = (VkBuffer*) dstBuffer;
	vkCmdUpdateBuffer(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(VkBuffer) (*ptr_dstBuffer),
			(VkDeviceSize) dstOffset,
			(VkDeviceSize) dataSize,
			(const uint32_t*) pData);

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
    * @param commandBuffer - 
    * @param dstBuffer - 
    * @param dstOffset - 
    * @param size - 
    * @param data - 
    */
   public void vkCmdFillBuffer(
		VkCommandBuffer commandBuffer,
		VkBuffer dstBuffer,
		long dstOffset,
		long size,
		int data){
	vkCmdFillBuffer0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		(dstBuffer==null ? null : dstBuffer.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   commandBuffer,
		java.nio.ByteBuffer   dstBuffer,
		long  dstOffset,
		long  size,
		int  data);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkBuffer* ptr_dstBuffer = (VkBuffer*) dstBuffer;
	vkCmdFillBuffer(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(VkBuffer) (*ptr_dstBuffer),
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
    * @param commandBuffer - 
    * @param image - 
    * @param imageLayout - 
    * @param pColor - 
    * @param rangeCount - 
    * @param pRanges - 
    */
   public void vkCmdClearColorImage(
		VkCommandBuffer commandBuffer,
		VkImage image,
		VkImageLayout imageLayout,
		 VkClearColorValue  pColor,
		int rangeCount,
		 VkImageSubresourceRange  pRanges){
	vkCmdClearColorImage0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		(image==null ? null : image.getPointer()) /* ByteBuffer */ ,
		imageLayout.getValue() /* enum */,
		(pColor==null ? null : pColor.getPointer()) /* ByteBuffer */ ,
		rangeCount ,
		(pRanges==null ? null : pRanges.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   commandBuffer,
		java.nio.ByteBuffer   image,
		int   imageLayout,
		java.nio.ByteBuffer   pColor,
		int  rangeCount,
		java.nio.ByteBuffer   pRanges);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkImage* ptr_image = (VkImage*) image;
	vkCmdClearColorImage(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(VkImage) (*ptr_image),
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
    * @param commandBuffer - 
    * @param image - 
    * @param imageLayout - 
    * @param pDepthStencil - 
    * @param rangeCount - 
    * @param pRanges - 
    */
   public void vkCmdClearDepthStencilImage(
		VkCommandBuffer commandBuffer,
		VkImage image,
		VkImageLayout imageLayout,
		 VkClearDepthStencilValue  pDepthStencil,
		int rangeCount,
		 VkImageSubresourceRange  pRanges){
	vkCmdClearDepthStencilImage0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		(image==null ? null : image.getPointer()) /* ByteBuffer */ ,
		imageLayout.getValue() /* enum */,
		(pDepthStencil==null ? null : pDepthStencil.getPointer()) /* ByteBuffer */ ,
		rangeCount ,
		(pRanges==null ? null : pRanges.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   commandBuffer,
		java.nio.ByteBuffer   image,
		int   imageLayout,
		java.nio.ByteBuffer   pDepthStencil,
		int  rangeCount,
		java.nio.ByteBuffer   pRanges);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkImage* ptr_image = (VkImage*) image;
	vkCmdClearDepthStencilImage(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(VkImage) (*ptr_image),
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
    * @param commandBuffer - 
    * @param attachmentCount - 
    * @param pAttachments - 
    * @param rectCount - 
    * @param pRects - 
    */
   public void vkCmdClearAttachments(
		VkCommandBuffer commandBuffer,
		int attachmentCount,
		 VkClearAttachment  pAttachments,
		int rectCount,
		 VkClearRect  pRects){
	vkCmdClearAttachments0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		attachmentCount ,
		(pAttachments==null ? null : pAttachments.getPointer()) /* ByteBuffer */ ,
		rectCount ,
		(pRects==null ? null : pRects.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   commandBuffer,
		int  attachmentCount,
		java.nio.ByteBuffer   pAttachments,
		int  rectCount,
		java.nio.ByteBuffer   pRects);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	vkCmdClearAttachments(
			(VkCommandBuffer) (*ptr_commandBuffer),
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
    * @param commandBuffer - 
    * @param srcImage - 
    * @param srcImageLayout - 
    * @param dstImage - 
    * @param dstImageLayout - 
    * @param regionCount - 
    * @param pRegions - 
    */
   public void vkCmdResolveImage(
		VkCommandBuffer commandBuffer,
		VkImage srcImage,
		VkImageLayout srcImageLayout,
		VkImage dstImage,
		VkImageLayout dstImageLayout,
		int regionCount,
		 VkImageResolve  pRegions){
	vkCmdResolveImage0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		(srcImage==null ? null : srcImage.getPointer()) /* ByteBuffer */ ,
		srcImageLayout.getValue() /* enum */,
		(dstImage==null ? null : dstImage.getPointer()) /* ByteBuffer */ ,
		dstImageLayout.getValue() /* enum */,
		regionCount ,
		(pRegions==null ? null : pRegions.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   commandBuffer,
		java.nio.ByteBuffer   srcImage,
		int   srcImageLayout,
		java.nio.ByteBuffer   dstImage,
		int   dstImageLayout,
		int  regionCount,
		java.nio.ByteBuffer   pRegions);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkImage* ptr_srcImage = (VkImage*) srcImage;
	VkImage* ptr_dstImage = (VkImage*) dstImage;
	vkCmdResolveImage(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(VkImage) (*ptr_srcImage),
			(VkImageLayout) srcImageLayout,
			(VkImage) (*ptr_dstImage),
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
    * @param commandBuffer - 
    * @param event - 
    * @param stageMask - 
    */
   public void vkCmdSetEvent(
		VkCommandBuffer commandBuffer,
		VkEvent event,
		int stageMask){
	vkCmdSetEvent0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		(event==null ? null : event.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   commandBuffer,
		java.nio.ByteBuffer   event,
		int  stageMask);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkEvent* ptr_event = (VkEvent*) event;
	vkCmdSetEvent(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(VkEvent) (*ptr_event),
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
    * @param commandBuffer - 
    * @param event - 
    * @param stageMask - 
    */
   public void vkCmdResetEvent(
		VkCommandBuffer commandBuffer,
		VkEvent event,
		int stageMask){
	vkCmdResetEvent0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		(event==null ? null : event.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   commandBuffer,
		java.nio.ByteBuffer   event,
		int  stageMask);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkEvent* ptr_event = (VkEvent*) event;
	vkCmdResetEvent(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(VkEvent) (*ptr_event),
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
   public void vkCmdWaitEvents(
		VkCommandBuffer commandBuffer,
		int eventCount,
		 VkEvent  pEvents,
		int srcStageMask,
		int dstStageMask,
		int memoryBarrierCount,
		 VkMemoryBarrier  pMemoryBarriers,
		int bufferMemoryBarrierCount,
		 VkBufferMemoryBarrier  pBufferMemoryBarriers,
		int imageMemoryBarrierCount,
		 VkImageMemoryBarrier  pImageMemoryBarriers){
	vkCmdWaitEvents0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		eventCount ,
		(pEvents==null ? null : pEvents.getPointer()) /* ByteBuffer */ ,
		srcStageMask ,
		dstStageMask ,
		memoryBarrierCount ,
		(pMemoryBarriers==null ? null : pMemoryBarriers.getPointer()) /* ByteBuffer */ ,
		bufferMemoryBarrierCount ,
		(pBufferMemoryBarriers==null ? null : pBufferMemoryBarriers.getPointer()) /* ByteBuffer */ ,
		imageMemoryBarrierCount ,
		(pImageMemoryBarriers==null ? null : pImageMemoryBarriers.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   commandBuffer,
		int  eventCount,
		java.nio.ByteBuffer   pEvents,
		int  srcStageMask,
		int  dstStageMask,
		int  memoryBarrierCount,
		java.nio.ByteBuffer   pMemoryBarriers,
		int  bufferMemoryBarrierCount,
		java.nio.ByteBuffer   pBufferMemoryBarriers,
		int  imageMemoryBarrierCount,
		java.nio.ByteBuffer   pImageMemoryBarriers);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	vkCmdWaitEvents(
			(VkCommandBuffer) (*ptr_commandBuffer),
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
   public void vkCmdPipelineBarrier(
		VkCommandBuffer commandBuffer,
		int srcStageMask,
		int dstStageMask,
		int dependencyFlags,
		int memoryBarrierCount,
		 VkMemoryBarrier  pMemoryBarriers,
		int bufferMemoryBarrierCount,
		 VkBufferMemoryBarrier  pBufferMemoryBarriers,
		int imageMemoryBarrierCount,
		 VkImageMemoryBarrier  pImageMemoryBarriers){
	vkCmdPipelineBarrier0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		srcStageMask ,
		dstStageMask ,
		dependencyFlags ,
		memoryBarrierCount ,
		(pMemoryBarriers==null ? null : pMemoryBarriers.getPointer()) /* ByteBuffer */ ,
		bufferMemoryBarrierCount ,
		(pBufferMemoryBarriers==null ? null : pBufferMemoryBarriers.getPointer()) /* ByteBuffer */ ,
		imageMemoryBarrierCount ,
		(pImageMemoryBarriers==null ? null : pImageMemoryBarriers.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   commandBuffer,
		int  srcStageMask,
		int  dstStageMask,
		int  dependencyFlags,
		int  memoryBarrierCount,
		java.nio.ByteBuffer   pMemoryBarriers,
		int  bufferMemoryBarrierCount,
		java.nio.ByteBuffer   pBufferMemoryBarriers,
		int  imageMemoryBarrierCount,
		java.nio.ByteBuffer   pImageMemoryBarriers);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	vkCmdPipelineBarrier(
			(VkCommandBuffer) (*ptr_commandBuffer),
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
    * @param commandBuffer - 
    * @param queryPool - 
    * @param query - 
    * @param flags - 
    */
   public void vkCmdBeginQuery(
		VkCommandBuffer commandBuffer,
		VkQueryPool queryPool,
		int query,
		int flags){
	vkCmdBeginQuery0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		(queryPool==null ? null : queryPool.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   commandBuffer,
		java.nio.ByteBuffer   queryPool,
		int  query,
		int  flags);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkQueryPool* ptr_queryPool = (VkQueryPool*) queryPool;
	vkCmdBeginQuery(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(VkQueryPool) (*ptr_queryPool),
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
    * @param commandBuffer - 
    * @param queryPool - 
    * @param query - 
    */
   public void vkCmdEndQuery(
		VkCommandBuffer commandBuffer,
		VkQueryPool queryPool,
		int query){
	vkCmdEndQuery0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		(queryPool==null ? null : queryPool.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   commandBuffer,
		java.nio.ByteBuffer   queryPool,
		int  query);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkQueryPool* ptr_queryPool = (VkQueryPool*) queryPool;
	vkCmdEndQuery(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(VkQueryPool) (*ptr_queryPool),
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
    * @param commandBuffer - 
    * @param queryPool - 
    * @param firstQuery - 
    * @param queryCount - 
    */
   public void vkCmdResetQueryPool(
		VkCommandBuffer commandBuffer,
		VkQueryPool queryPool,
		int firstQuery,
		int queryCount){
	vkCmdResetQueryPool0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		(queryPool==null ? null : queryPool.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   commandBuffer,
		java.nio.ByteBuffer   queryPool,
		int  firstQuery,
		int  queryCount);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkQueryPool* ptr_queryPool = (VkQueryPool*) queryPool;
	vkCmdResetQueryPool(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(VkQueryPool) (*ptr_queryPool),
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
    * @param commandBuffer - 
    * @param pipelineStage - 
    * @param queryPool - 
    * @param query - 
    */
   public void vkCmdWriteTimestamp(
		VkCommandBuffer commandBuffer,
		VkPipelineStageFlagBits pipelineStage,
		VkQueryPool queryPool,
		int query){
	vkCmdWriteTimestamp0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		pipelineStage.getValue() /* enum */,
		(queryPool==null ? null : queryPool.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   commandBuffer,
		int   pipelineStage,
		java.nio.ByteBuffer   queryPool,
		int  query);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkQueryPool* ptr_queryPool = (VkQueryPool*) queryPool;
	vkCmdWriteTimestamp(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(VkPipelineStageFlagBits) pipelineStage,
			(VkQueryPool) (*ptr_queryPool),
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
    * @param commandBuffer - 
    * @param queryPool - 
    * @param firstQuery - 
    * @param queryCount - 
    * @param dstBuffer - 
    * @param dstOffset - 
    * @param stride - 
    * @param flags - 
    */
   public void vkCmdCopyQueryPoolResults(
		VkCommandBuffer commandBuffer,
		VkQueryPool queryPool,
		int firstQuery,
		int queryCount,
		VkBuffer dstBuffer,
		long dstOffset,
		long stride,
		int flags){
	vkCmdCopyQueryPoolResults0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		(queryPool==null ? null : queryPool.getPointer()) /* ByteBuffer */ ,
		firstQuery ,
		queryCount ,
		(dstBuffer==null ? null : dstBuffer.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   commandBuffer,
		java.nio.ByteBuffer   queryPool,
		int  firstQuery,
		int  queryCount,
		java.nio.ByteBuffer   dstBuffer,
		long  dstOffset,
		long  stride,
		int  flags);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkQueryPool* ptr_queryPool = (VkQueryPool*) queryPool;
	VkBuffer* ptr_dstBuffer = (VkBuffer*) dstBuffer;
	vkCmdCopyQueryPoolResults(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(VkQueryPool) (*ptr_queryPool),
			(uint32_t) firstQuery,
			(uint32_t) queryCount,
			(VkBuffer) (*ptr_dstBuffer),
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
    * @param commandBuffer - 
    * @param layout - 
    * @param stageFlags - 
    * @param offset - 
    * @param size - 
    * @param pValues - 
    */
   public void vkCmdPushConstants(
		VkCommandBuffer commandBuffer,
		VkPipelineLayout layout,
		int stageFlags,
		int offset,
		int size,
		java.nio.Buffer pValues){
	vkCmdPushConstants0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		(layout==null ? null : layout.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   commandBuffer,
		java.nio.ByteBuffer   layout,
		int  stageFlags,
		int  offset,
		int  size,
		java.nio.Buffer  pValues);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	VkPipelineLayout* ptr_layout = (VkPipelineLayout*) layout;
	vkCmdPushConstants(
			(VkCommandBuffer) (*ptr_commandBuffer),
			(VkPipelineLayout) (*ptr_layout),
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
    * @param commandBuffer - 
    * @param pRenderPassBegin - 
    * @param contents - 
    */
   public void vkCmdBeginRenderPass(
		VkCommandBuffer commandBuffer,
		 VkRenderPassBeginInfo  pRenderPassBegin,
		VkSubpassContents contents){
	vkCmdBeginRenderPass0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		(pRenderPassBegin==null ? null : pRenderPassBegin.getPointer()) /* ByteBuffer */ ,
		contents.getValue() /* enum */ );

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
		java.nio.ByteBuffer   commandBuffer,
		java.nio.ByteBuffer   pRenderPassBegin,
		int   contents);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	vkCmdBeginRenderPass(
			(VkCommandBuffer) (*ptr_commandBuffer),
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
    * @param commandBuffer - 
    * @param contents - 
    */
   public void vkCmdNextSubpass(
		VkCommandBuffer commandBuffer,
		VkSubpassContents contents){
	vkCmdNextSubpass0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		contents.getValue() /* enum */ );

   } 

   /**
    *  Native interface for Vulkan method #135
    *  vkCmdNextSubpass 
    * 
    * @param commandBuffer - 
    * @param contents - 
    */
    private static native void vkCmdNextSubpass0(
		java.nio.ByteBuffer   commandBuffer,
		int   contents);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	vkCmdNextSubpass(
			(VkCommandBuffer) (*ptr_commandBuffer),
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
    * @param commandBuffer - 
    */
   public void vkCmdEndRenderPass(
		VkCommandBuffer commandBuffer){
	vkCmdEndRenderPass0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */  );

   } 

   /**
    *  Native interface for Vulkan method #136
    *  vkCmdEndRenderPass 
    * 
    * @param commandBuffer - 
    */
    private static native void vkCmdEndRenderPass0(
		java.nio.ByteBuffer   commandBuffer);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	vkCmdEndRenderPass(
			(VkCommandBuffer) (*ptr_commandBuffer));

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
    * @param commandBuffer - 
    * @param commandBufferCount - 
    * @param pCommandBuffers - 
    */
   public void vkCmdExecuteCommands(
		VkCommandBuffer commandBuffer,
		int commandBufferCount,
		 VkCommandBuffer  pCommandBuffers){
	vkCmdExecuteCommands0(
		(commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
		commandBufferCount ,
		(pCommandBuffers==null ? null : pCommandBuffers.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   commandBuffer,
		int  commandBufferCount,
		java.nio.ByteBuffer   pCommandBuffers);/* 
	VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
	vkCmdExecuteCommands(
			(VkCommandBuffer) (*ptr_commandBuffer),
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
    * @param instance - 
    * @param surface - 
    * @param pAllocator - 
    */
   public void vkDestroySurfaceKHR(
		VkInstance instance,
		VkSurfaceKHR surface,
		 VkAllocationCallbacks  pAllocator){
	vkDestroySurfaceKHR0(
		(instance==null ? null : instance.getPointer()) /* ByteBuffer */ ,
		(surface==null ? null : surface.getPointer()) /* ByteBuffer */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   instance,
		java.nio.ByteBuffer   surface,
		java.nio.ByteBuffer   pAllocator);/* 
	VkInstance* ptr_instance = (VkInstance*) instance;
	VkSurfaceKHR* ptr_surface = (VkSurfaceKHR*) surface;
	vkDestroySurfaceKHR(
			(VkInstance) (*ptr_instance),
			(VkSurfaceKHR) (*ptr_surface),
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
    * @param physicalDevice - 
    * @param queueFamilyIndex - 
    * @param surface - 
    * @param pSupported - 
    * 
    * @return VkResult
    */
   public VkResult vkGetPhysicalDeviceSurfaceSupportKHR(
		VkPhysicalDevice physicalDevice,
		int queueFamilyIndex,
		VkSurfaceKHR surface,
		boolean[] pSupported){
	int  _val = vkGetPhysicalDeviceSurfaceSupportKHR0(
			(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
			queueFamilyIndex ,
			(surface==null ? null : surface.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   physicalDevice,
		int  queueFamilyIndex,
		java.nio.ByteBuffer   surface,
		boolean[]  pSupported);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	VkSurfaceKHR* ptr_surface = (VkSurfaceKHR*) surface;
	VkResult res = vkGetPhysicalDeviceSurfaceSupportKHR(
			(VkPhysicalDevice) (*ptr_physicalDevice),
			(uint32_t) queueFamilyIndex,
			(VkSurfaceKHR) (*ptr_surface),
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
    * @param physicalDevice - 
    * @param surface - 
    * @param pSurfaceCapabilities - 
    * 
    * @return VkResult
    */
   public VkResult vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
		VkPhysicalDevice physicalDevice,
		VkSurfaceKHR surface,
		 VkSurfaceCapabilitiesKHR  pSurfaceCapabilities){
	int  _val = vkGetPhysicalDeviceSurfaceCapabilitiesKHR0(
			(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
			(surface==null ? null : surface.getPointer()) /* ByteBuffer */ ,
			(pSurfaceCapabilities==null ? null : pSurfaceCapabilities.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   physicalDevice,
		java.nio.ByteBuffer   surface,
		java.nio.ByteBuffer   pSurfaceCapabilities);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	VkSurfaceKHR* ptr_surface = (VkSurfaceKHR*) surface;
	VkResult res = vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
			(VkPhysicalDevice) (*ptr_physicalDevice),
			(VkSurfaceKHR) (*ptr_surface),
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
    * @param physicalDevice - 
    * @param surface - 
    * @param pSurfaceFormatCount - 
    * @param pSurfaceFormats - 
    * 
    * @return VkResult
    */
   public VkResult vkGetPhysicalDeviceSurfaceFormatsKHR(
		VkPhysicalDevice physicalDevice,
		VkSurfaceKHR surface,
		int[] pSurfaceFormatCount,
		 VkSurfaceFormatKHR  pSurfaceFormats){
	int  _val = vkGetPhysicalDeviceSurfaceFormatsKHR0(
			(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
			(surface==null ? null : surface.getPointer()) /* ByteBuffer */ ,
			pSurfaceFormatCount ,
			(pSurfaceFormats==null ? null : pSurfaceFormats.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   physicalDevice,
		java.nio.ByteBuffer   surface,
		int[]  pSurfaceFormatCount,
		java.nio.ByteBuffer   pSurfaceFormats);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	VkSurfaceKHR* ptr_surface = (VkSurfaceKHR*) surface;
	VkResult res = vkGetPhysicalDeviceSurfaceFormatsKHR(
			(VkPhysicalDevice) (*ptr_physicalDevice),
			(VkSurfaceKHR) (*ptr_surface),
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
    * @param physicalDevice - 
    * @param surface - 
    * @param pPresentModeCount - 
    * @param pPresentModes - 
    * 
    * @return VkResult
    */
   public VkResult vkGetPhysicalDeviceSurfacePresentModesKHR(
		VkPhysicalDevice physicalDevice,
		VkSurfaceKHR surface,
		int[] pPresentModeCount,
		 VkPresentModeKHR  pPresentModes){
	int  _val = vkGetPhysicalDeviceSurfacePresentModesKHR0(
			(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
			(surface==null ? null : surface.getPointer()) /* ByteBuffer */ ,
			pPresentModeCount ,
			pPresentModes.getValue() /* enum */ );
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
		java.nio.ByteBuffer   physicalDevice,
		java.nio.ByteBuffer   surface,
		int[]  pPresentModeCount,
		int   pPresentModes);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	VkSurfaceKHR* ptr_surface = (VkSurfaceKHR*) surface;
	VkResult res = vkGetPhysicalDeviceSurfacePresentModesKHR(
			(VkPhysicalDevice) (*ptr_physicalDevice),
			(VkSurfaceKHR) (*ptr_surface),
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
    * @param device - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pSwapchain - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateSwapchainKHR(
		VkDevice device,
		 VkSwapchainCreateInfoKHR  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkSwapchainKHR  pSwapchain){
	int  _val = vkCreateSwapchainKHR0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pSwapchain==null ? null : pSwapchain.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pSwapchain);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkCreateSwapchainKHR(
			(VkDevice) (*ptr_device),
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
    * @param device - 
    * @param swapchain - 
    * @param pAllocator - 
    */
   public void vkDestroySwapchainKHR(
		VkDevice device,
		VkSwapchainKHR swapchain,
		 VkAllocationCallbacks  pAllocator){
	vkDestroySwapchainKHR0(
		(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
		(swapchain==null ? null : swapchain.getPointer()) /* ByteBuffer */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   swapchain,
		java.nio.ByteBuffer   pAllocator);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkSwapchainKHR* ptr_swapchain = (VkSwapchainKHR*) swapchain;
	vkDestroySwapchainKHR(
			(VkDevice) (*ptr_device),
			(VkSwapchainKHR) (*ptr_swapchain),
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
    * @param device - 
    * @param swapchain - 
    * @param pSwapchainImageCount - 
    * @param pSwapchainImages - 
    * 
    * @return VkResult
    */
   public VkResult vkGetSwapchainImagesKHR(
		VkDevice device,
		VkSwapchainKHR swapchain,
		int[] pSwapchainImageCount,
		 VkImage  pSwapchainImages){
	int  _val = vkGetSwapchainImagesKHR0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(swapchain==null ? null : swapchain.getPointer()) /* ByteBuffer */ ,
			pSwapchainImageCount ,
			(pSwapchainImages==null ? null : pSwapchainImages.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   swapchain,
		int[]  pSwapchainImageCount,
		java.nio.ByteBuffer   pSwapchainImages);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkSwapchainKHR* ptr_swapchain = (VkSwapchainKHR*) swapchain;
	VkResult res = vkGetSwapchainImagesKHR(
			(VkDevice) (*ptr_device),
			(VkSwapchainKHR) (*ptr_swapchain),
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
    * @param device - 
    * @param swapchain - 
    * @param timeout - 
    * @param semaphore - 
    * @param fence - 
    * @param pImageIndex - 
    * 
    * @return VkResult
    */
   public VkResult vkAcquireNextImageKHR(
		VkDevice device,
		VkSwapchainKHR swapchain,
		long timeout,
		VkSemaphore semaphore,
		VkFence fence,
		int[] pImageIndex){
	int  _val = vkAcquireNextImageKHR0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			(swapchain==null ? null : swapchain.getPointer()) /* ByteBuffer */ ,
			timeout ,
			(semaphore==null ? null : semaphore.getPointer()) /* ByteBuffer */ ,
			(fence==null ? null : fence.getPointer()) /* ByteBuffer */ ,
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
		java.nio.ByteBuffer   device,
		java.nio.ByteBuffer   swapchain,
		long  timeout,
		java.nio.ByteBuffer   semaphore,
		java.nio.ByteBuffer   fence,
		int[]  pImageIndex);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkSwapchainKHR* ptr_swapchain = (VkSwapchainKHR*) swapchain;
	VkSemaphore* ptr_semaphore = (VkSemaphore*) semaphore;
	VkFence* ptr_fence = (VkFence*) fence;
	VkResult res = vkAcquireNextImageKHR(
			(VkDevice) (*ptr_device),
			(VkSwapchainKHR) (*ptr_swapchain),
			(uint64_t) timeout,
			(VkSemaphore) (*ptr_semaphore),
			(VkFence) (*ptr_fence),
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
    * @param queue - 
    * @param pPresentInfo - 
    * 
    * @return VkResult
    */
   public VkResult vkQueuePresentKHR(
		VkQueue queue,
		 VkPresentInfoKHR  pPresentInfo){
	int  _val = vkQueuePresentKHR0(
			(queue==null ? null : queue.getPointer()) /* ByteBuffer */ ,
			(pPresentInfo==null ? null : pPresentInfo.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   queue,
		java.nio.ByteBuffer   pPresentInfo);/* 
	VkQueue* ptr_queue = (VkQueue*) queue;
	VkResult res = vkQueuePresentKHR(
			(VkQueue) (*ptr_queue),
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
    * @param physicalDevice - 
    * @param pPropertyCount - 
    * @param pProperties - 
    * 
    * @return VkResult
    */
   public VkResult vkGetPhysicalDeviceDisplayPropertiesKHR(
		VkPhysicalDevice physicalDevice,
		int[] pPropertyCount,
		 VkDisplayPropertiesKHR  pProperties){
	int  _val = vkGetPhysicalDeviceDisplayPropertiesKHR0(
			(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
			pPropertyCount ,
			(pProperties==null ? null : pProperties.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   physicalDevice,
		int[]  pPropertyCount,
		java.nio.ByteBuffer   pProperties);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	VkResult res = vkGetPhysicalDeviceDisplayPropertiesKHR(
			(VkPhysicalDevice) (*ptr_physicalDevice),
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
    * @param physicalDevice - 
    * @param pPropertyCount - 
    * @param pProperties - 
    * 
    * @return VkResult
    */
   public VkResult vkGetPhysicalDeviceDisplayPlanePropertiesKHR(
		VkPhysicalDevice physicalDevice,
		int[] pPropertyCount,
		 VkDisplayPlanePropertiesKHR  pProperties){
	int  _val = vkGetPhysicalDeviceDisplayPlanePropertiesKHR0(
			(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
			pPropertyCount ,
			(pProperties==null ? null : pProperties.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   physicalDevice,
		int[]  pPropertyCount,
		java.nio.ByteBuffer   pProperties);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	VkResult res = vkGetPhysicalDeviceDisplayPlanePropertiesKHR(
			(VkPhysicalDevice) (*ptr_physicalDevice),
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
    * @param physicalDevice - 
    * @param planeIndex - 
    * @param pDisplayCount - 
    * @param pDisplays - 
    * 
    * @return VkResult
    */
   public VkResult vkGetDisplayPlaneSupportedDisplaysKHR(
		VkPhysicalDevice physicalDevice,
		int planeIndex,
		int[] pDisplayCount,
		 VkDisplayKHR  pDisplays){
	int  _val = vkGetDisplayPlaneSupportedDisplaysKHR0(
			(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
			planeIndex ,
			pDisplayCount ,
			(pDisplays==null ? null : pDisplays.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   physicalDevice,
		int  planeIndex,
		int[]  pDisplayCount,
		java.nio.ByteBuffer   pDisplays);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	VkResult res = vkGetDisplayPlaneSupportedDisplaysKHR(
			(VkPhysicalDevice) (*ptr_physicalDevice),
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
    * @param physicalDevice - 
    * @param display - 
    * @param pPropertyCount - 
    * @param pProperties - 
    * 
    * @return VkResult
    */
   public VkResult vkGetDisplayModePropertiesKHR(
		VkPhysicalDevice physicalDevice,
		VkDisplayKHR display,
		int[] pPropertyCount,
		 VkDisplayModePropertiesKHR  pProperties){
	int  _val = vkGetDisplayModePropertiesKHR0(
			(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
			(display==null ? null : display.getPointer()) /* ByteBuffer */ ,
			pPropertyCount ,
			(pProperties==null ? null : pProperties.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   physicalDevice,
		java.nio.ByteBuffer   display,
		int[]  pPropertyCount,
		java.nio.ByteBuffer   pProperties);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	VkDisplayKHR* ptr_display = (VkDisplayKHR*) display;
	VkResult res = vkGetDisplayModePropertiesKHR(
			(VkPhysicalDevice) (*ptr_physicalDevice),
			(VkDisplayKHR) (*ptr_display),
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
    * @param physicalDevice - 
    * @param display - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pMode - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateDisplayModeKHR(
		VkPhysicalDevice physicalDevice,
		VkDisplayKHR display,
		 VkDisplayModeCreateInfoKHR  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkDisplayModeKHR  pMode){
	int  _val = vkCreateDisplayModeKHR0(
			(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
			(display==null ? null : display.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pMode==null ? null : pMode.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   physicalDevice,
		java.nio.ByteBuffer   display,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pMode);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	VkDisplayKHR* ptr_display = (VkDisplayKHR*) display;
	VkResult res = vkCreateDisplayModeKHR(
			(VkPhysicalDevice) (*ptr_physicalDevice),
			(VkDisplayKHR) (*ptr_display),
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
    * @param physicalDevice - 
    * @param mode - 
    * @param planeIndex - 
    * @param pCapabilities - 
    * 
    * @return VkResult
    */
   public VkResult vkGetDisplayPlaneCapabilitiesKHR(
		VkPhysicalDevice physicalDevice,
		VkDisplayModeKHR mode,
		int planeIndex,
		 VkDisplayPlaneCapabilitiesKHR  pCapabilities){
	int  _val = vkGetDisplayPlaneCapabilitiesKHR0(
			(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
			(mode==null ? null : mode.getPointer()) /* ByteBuffer */ ,
			planeIndex ,
			(pCapabilities==null ? null : pCapabilities.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   physicalDevice,
		java.nio.ByteBuffer   mode,
		int  planeIndex,
		java.nio.ByteBuffer   pCapabilities);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	VkDisplayModeKHR* ptr_mode = (VkDisplayModeKHR*) mode;
	VkResult res = vkGetDisplayPlaneCapabilitiesKHR(
			(VkPhysicalDevice) (*ptr_physicalDevice),
			(VkDisplayModeKHR) (*ptr_mode),
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
    * @param instance - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pSurface - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateDisplayPlaneSurfaceKHR(
		VkInstance instance,
		 VkDisplaySurfaceCreateInfoKHR  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkSurfaceKHR  pSurface){
	int  _val = vkCreateDisplayPlaneSurfaceKHR0(
			(instance==null ? null : instance.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pSurface==null ? null : pSurface.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   instance,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pSurface);/* 
	VkInstance* ptr_instance = (VkInstance*) instance;
	VkResult res = vkCreateDisplayPlaneSurfaceKHR(
			(VkInstance) (*ptr_instance),
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
    * @param device - 
    * @param swapchainCount - 
    * @param pCreateInfos - 
    * @param pAllocator - 
    * @param pSwapchains - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateSharedSwapchainsKHR(
		VkDevice device,
		int swapchainCount,
		 VkSwapchainCreateInfoKHR  pCreateInfos,
		 VkAllocationCallbacks  pAllocator,
		 VkSwapchainKHR  pSwapchains){
	int  _val = vkCreateSharedSwapchainsKHR0(
			(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
			swapchainCount ,
			(pCreateInfos==null ? null : pCreateInfos.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pSwapchains==null ? null : pSwapchains.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   device,
		int  swapchainCount,
		java.nio.ByteBuffer   pCreateInfos,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pSwapchains);/* 
	VkDevice* ptr_device = (VkDevice*) device;
	VkResult res = vkCreateSharedSwapchainsKHR(
			(VkDevice) (*ptr_device),
			(uint32_t) swapchainCount,
			(const VkSwapchainCreateInfoKHR*) pCreateInfos,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSwapchainKHR*) pSwapchains);
	 return (jint) res;
  */ 


	/////////////////////////////////////

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
    * @param instance - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pSurface - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateXlibSurfaceKHR(
		VkInstance instance,
		 VkXlibSurfaceCreateInfoKHR  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkSurfaceKHR  pSurface){
	int  _val = vkCreateXlibSurfaceKHR0(
			(instance==null ? null : instance.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pSurface==null ? null : pSurface.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   instance,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pSurface);/* 
	VkInstance* ptr_instance = (VkInstance*) instance;
	VkResult res = vkCreateXlibSurfaceKHR(
			(VkInstance) (*ptr_instance),
			(const VkXlibSurfaceCreateInfoKHR*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSurfaceKHR*) pSurface);
	 return (jint) res;
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
    * @param physicalDevice - 
    * @param queueFamilyIndex - 
    * @param dpy - 
    * @param visualID - 
    * 
    * @return boolean
    */
   public boolean vkGetPhysicalDeviceXlibPresentationSupportKHR(
		VkPhysicalDevice physicalDevice,
		int queueFamilyIndex,
		XlibDisplay dpy,
		XlibVisualID visualID){
	boolean _val = vkGetPhysicalDeviceXlibPresentationSupportKHR0(
			(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
			queueFamilyIndex ,
			(dpy==null ? null : dpy.getPointer()) /* ByteBuffer */ ,
			(visualID==null ? null : visualID.getPointer()) /* ByteBuffer */  );
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
    private static native boolean vkGetPhysicalDeviceXlibPresentationSupportKHR0(
		java.nio.ByteBuffer   physicalDevice,
		int  queueFamilyIndex,
		java.nio.ByteBuffer   dpy,
		java.nio.ByteBuffer   visualID);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	VisualID* ptr_visualID = (VisualID*) visualID;
	boolean res = vkGetPhysicalDeviceXlibPresentationSupportKHR(
			(VkPhysicalDevice) (*ptr_physicalDevice),
			(uint32_t) queueFamilyIndex,
			(Display*) dpy,
			(VisualID) (*ptr_visualID));
	 return (jboolean) res;
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
    * @param instance - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pSurface - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateXcbSurfaceKHR(
		VkInstance instance,
		 VkXcbSurfaceCreateInfoKHR  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkSurfaceKHR  pSurface){
	int  _val = vkCreateXcbSurfaceKHR0(
			(instance==null ? null : instance.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pSurface==null ? null : pSurface.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   instance,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pSurface);/* 
	VkInstance* ptr_instance = (VkInstance*) instance;
	VkResult res = vkCreateXcbSurfaceKHR(
			(VkInstance) (*ptr_instance),
			(const VkXcbSurfaceCreateInfoKHR*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSurfaceKHR*) pSurface);
	 return (jint) res;
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
    * @param physicalDevice - 
    * @param queueFamilyIndex - 
    * @param connection - 
    * @param visual_id - 
    * 
    * @return boolean
    */
   public boolean vkGetPhysicalDeviceXcbPresentationSupportKHR(
		VkPhysicalDevice physicalDevice,
		int queueFamilyIndex,
		XCBconnection connection,
		XCBVisualID visual_id){
	boolean _val = vkGetPhysicalDeviceXcbPresentationSupportKHR0(
			(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
			queueFamilyIndex ,
			(connection==null ? null : connection.getPointer()) /* ByteBuffer */ ,
			visual_id  );
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
    private static native boolean vkGetPhysicalDeviceXcbPresentationSupportKHR0(
		java.nio.ByteBuffer   physicalDevice,
		int  queueFamilyIndex,
		java.nio.ByteBuffer   connection,
		XCBVisualID  visual_id);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	boolean res = vkGetPhysicalDeviceXcbPresentationSupportKHR(
			(VkPhysicalDevice) (*ptr_physicalDevice),
			(uint32_t) queueFamilyIndex,
			(xcb_connection_t*) connection,
			(xcb_visualid_t) visual_id);
	 return (jboolean) res;
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
    * @param instance - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pSurface - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateWaylandSurfaceKHR(
		VkInstance instance,
		 VkWaylandSurfaceCreateInfoKHR  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkSurfaceKHR  pSurface){
	int  _val = vkCreateWaylandSurfaceKHR0(
			(instance==null ? null : instance.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pSurface==null ? null : pSurface.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   instance,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pSurface);/* 
	VkInstance* ptr_instance = (VkInstance*) instance;
	VkResult res = vkCreateWaylandSurfaceKHR(
			(VkInstance) (*ptr_instance),
			(const VkWaylandSurfaceCreateInfoKHR*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSurfaceKHR*) pSurface);
	 return (jint) res;
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
    * @param physicalDevice - 
    * @param queueFamilyIndex - 
    * @param display - 
    * 
    * @return boolean
    */
   public boolean vkGetPhysicalDeviceWaylandPresentationSupportKHR(
		VkPhysicalDevice physicalDevice,
		int queueFamilyIndex,
		WlDisplay display){
	boolean _val = vkGetPhysicalDeviceWaylandPresentationSupportKHR0(
			(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
			queueFamilyIndex ,
			(display==null ? null : display.getPointer()) /* ByteBuffer */  );
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
    private static native boolean vkGetPhysicalDeviceWaylandPresentationSupportKHR0(
		java.nio.ByteBuffer   physicalDevice,
		int  queueFamilyIndex,
		java.nio.ByteBuffer   display);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	boolean res = vkGetPhysicalDeviceWaylandPresentationSupportKHR(
			(VkPhysicalDevice) (*ptr_physicalDevice),
			(uint32_t) queueFamilyIndex,
			(struct wl_display*) display);
	 return (jboolean) res;
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
    * @param instance - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pSurface - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateMirSurfaceKHR(
		VkInstance instance,
		 VkMirSurfaceCreateInfoKHR  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkSurfaceKHR  pSurface){
	int  _val = vkCreateMirSurfaceKHR0(
			(instance==null ? null : instance.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pSurface==null ? null : pSurface.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   instance,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pSurface);/* 
	VkInstance* ptr_instance = (VkInstance*) instance;
	VkResult res = vkCreateMirSurfaceKHR(
			(VkInstance) (*ptr_instance),
			(const VkMirSurfaceCreateInfoKHR*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSurfaceKHR*) pSurface);
	 return (jint) res;
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
    * @param physicalDevice - 
    * @param queueFamilyIndex - 
    * @param connection - 
    * 
    * @return boolean
    */
   public boolean vkGetPhysicalDeviceMirPresentationSupportKHR(
		VkPhysicalDevice physicalDevice,
		int queueFamilyIndex,
		MirConnection connection){
	boolean _val = vkGetPhysicalDeviceMirPresentationSupportKHR0(
			(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
			queueFamilyIndex ,
			(connection==null ? null : connection.getPointer()) /* ByteBuffer */  );
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
    private static native boolean vkGetPhysicalDeviceMirPresentationSupportKHR0(
		java.nio.ByteBuffer   physicalDevice,
		int  queueFamilyIndex,
		java.nio.ByteBuffer   connection);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	boolean res = vkGetPhysicalDeviceMirPresentationSupportKHR(
			(VkPhysicalDevice) (*ptr_physicalDevice),
			(uint32_t) queueFamilyIndex,
			(MirConnection*) connection);
	 return (jboolean) res;
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
    * @param instance - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pSurface - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateAndroidSurfaceKHR(
		VkInstance instance,
		 VkAndroidSurfaceCreateInfoKHR  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkSurfaceKHR  pSurface){
	int  _val = vkCreateAndroidSurfaceKHR0(
			(instance==null ? null : instance.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pSurface==null ? null : pSurface.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   instance,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pSurface);/* 
	VkInstance* ptr_instance = (VkInstance*) instance;
	VkResult res = vkCreateAndroidSurfaceKHR(
			(VkInstance) (*ptr_instance),
			(const VkAndroidSurfaceCreateInfoKHR*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSurfaceKHR*) pSurface);
	 return (jint) res;
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
    * @param instance - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pSurface - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateWin32SurfaceKHR(
		VkInstance instance,
		 VkWin32SurfaceCreateInfoKHR  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkSurfaceKHR  pSurface){
	int  _val = vkCreateWin32SurfaceKHR0(
			(instance==null ? null : instance.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pSurface==null ? null : pSurface.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   instance,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pSurface);/* 
	VkInstance* ptr_instance = (VkInstance*) instance;
	VkResult res = vkCreateWin32SurfaceKHR(
			(VkInstance) (*ptr_instance),
			(const VkWin32SurfaceCreateInfoKHR*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSurfaceKHR*) pSurface);
	 return (jint) res;
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
    * @param physicalDevice - 
    * @param queueFamilyIndex - 
    * 
    * @return boolean
    */
   public boolean vkGetPhysicalDeviceWin32PresentationSupportKHR(
		VkPhysicalDevice physicalDevice,
		int queueFamilyIndex){
	boolean _val = vkGetPhysicalDeviceWin32PresentationSupportKHR0(
			(physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
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
    private static native boolean vkGetPhysicalDeviceWin32PresentationSupportKHR0(
		java.nio.ByteBuffer   physicalDevice,
		int  queueFamilyIndex);/* 
	VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
	boolean res = vkGetPhysicalDeviceWin32PresentationSupportKHR(
			(VkPhysicalDevice) (*ptr_physicalDevice),
			(uint32_t) queueFamilyIndex);
	 return (jboolean) res;
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
    * @param instance - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pCallback - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateDebugReportCallbackEXT(
		VkInstance instance,
		 VkDebugReportCallbackCreateInfoEXT  pCreateInfo,
		 VkAllocationCallbacks  pAllocator,
		 VkDebugReportCallbackEXT  pCallback){
	int  _val = vkCreateDebugReportCallbackEXT0(
			(instance==null ? null : instance.getPointer()) /* ByteBuffer */ ,
			(pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
			(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
			(pCallback==null ? null : pCallback.getPointer()) /* ByteBuffer */  );
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
		java.nio.ByteBuffer   instance,
		java.nio.ByteBuffer   pCreateInfo,
		java.nio.ByteBuffer   pAllocator,
		java.nio.ByteBuffer   pCallback);/* 
	VkInstance* ptr_instance = (VkInstance*) instance;
	VkResult res = vkCreateDebugReportCallbackEXT(
			(VkInstance) (*ptr_instance),
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
    * @param instance - 
    * @param callback - 
    * @param pAllocator - 
    */
   public void vkDestroyDebugReportCallbackEXT(
		VkInstance instance,
		VkDebugReportCallbackEXT callback,
		 VkAllocationCallbacks  pAllocator){
	vkDestroyDebugReportCallbackEXT0(
		(instance==null ? null : instance.getPointer()) /* ByteBuffer */ ,
		(callback==null ? null : callback.getPointer()) /* ByteBuffer */ ,
		(pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

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
		java.nio.ByteBuffer   instance,
		java.nio.ByteBuffer   callback,
		java.nio.ByteBuffer   pAllocator);/* 
	VkInstance* ptr_instance = (VkInstance*) instance;
	VkDebugReportCallbackEXT* ptr_callback = (VkDebugReportCallbackEXT*) callback;
	vkDestroyDebugReportCallbackEXT(
			(VkInstance) (*ptr_instance),
			(VkDebugReportCallbackEXT) (*ptr_callback),
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
    * @param instance - 
    * @param flags - 
    * @param objectType - 
    * @param object - 
    * @param location - 
    * @param messageCode - 
    * @param pLayerPrefix - 
    * @param pMessage - 
    */
   public void vkDebugReportMessageEXT(
		VkInstance instance,
		int flags,
		VkDebugReportObjectTypeEXT objectType,
		long object,
		long location,
		int messageCode,
		String pLayerPrefix,
		String pMessage){
	vkDebugReportMessageEXT0(
		(instance==null ? null : instance.getPointer()) /* ByteBuffer */ ,
		flags ,
		objectType.getValue() /* enum */,
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
		java.nio.ByteBuffer   instance,
		int  flags,
		int   objectType,
		long  object,
		long  location,
		int  messageCode,
		String  pLayerPrefix,
		String  pMessage);/* 
	VkInstance* ptr_instance = (VkInstance*) instance;
	vkDebugReportMessageEXT(
			(VkInstance) (*ptr_instance),
			(VkDebugReportFlagsEXT) flags,
			(VkDebugReportObjectTypeEXT) objectType,
			(uint64_t) object,
			(size_t) location,
			(int32_t) messageCode,
			(const char*) pLayerPrefix,
			(const char*) pMessage);

  */ 


	/////////////////////////////////////



 }//end of Vk
