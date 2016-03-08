package bor.vulkan;
 import bor.vulkan.khr.*;
 import java.nio.*;

 public class Vk extends Vulkan
 {
	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateInstance(
	 *     const VkInstanceCreateInfo*                 pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkInstance*                                 pInstance);
	 * </pre>
	 */
   public abstract VkResult vkCreateInstance(
		const VkInstanceCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkInstance*  pInstance);

    private static native VkResult vkCreateInstance0(
		const VkInstanceCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkInstance*  pInstance);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkDestroyInstance(
	 *     VkInstance                                  instance,
	 *     const VkAllocationCallbacks*                pAllocator);
	 * </pre>
	 */
   public abstract void vkDestroyInstance(
		VkInstance  instance,
		const VkAllocationCallbacks*  pAllocator);

    private static native void vkDestroyInstance0(
		VkInstance  instance,
		const VkAllocationCallbacks*  pAllocator);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkEnumeratePhysicalDevices(
	 *     VkInstance                                  instance,
	 *     uint32_t*                                   pPhysicalDeviceCount,
	 *     VkPhysicalDevice*                           pPhysicalDevices);
	 * </pre>
	 */
   public abstract VkResult vkEnumeratePhysicalDevices(
		VkInstance  instance,
		uint32_t*  pPhysicalDeviceCount,
		VkPhysicalDevice*  pPhysicalDevices);

    private static native VkResult vkEnumeratePhysicalDevices0(
		VkInstance  instance,
		uint32_t*  pPhysicalDeviceCount,
		VkPhysicalDevice*  pPhysicalDevices);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkGetPhysicalDeviceFeatures(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     VkPhysicalDeviceFeatures*                   pFeatures);
	 * </pre>
	 */
   public abstract void vkGetPhysicalDeviceFeatures(
		VkPhysicalDevice  physicalDevice,
		VkPhysicalDeviceFeatures*  pFeatures);

    private static native void vkGetPhysicalDeviceFeatures0(
		VkPhysicalDevice  physicalDevice,
		VkPhysicalDeviceFeatures*  pFeatures);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkGetPhysicalDeviceFormatProperties(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     VkFormat                                    format,
	 *     VkFormatProperties*                         pFormatProperties);
	 * </pre>
	 */
   public abstract void vkGetPhysicalDeviceFormatProperties(
		VkPhysicalDevice  physicalDevice,
		VkFormat  format,
		VkFormatProperties*  pFormatProperties);

    private static native void vkGetPhysicalDeviceFormatProperties0(
		VkPhysicalDevice  physicalDevice,
		VkFormat  format,
		VkFormatProperties*  pFormatProperties);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkGetPhysicalDeviceImageFormatProperties(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     VkFormat                                    format,
	 *     VkImageType                                 type,
	 *     VkImageTiling                               tiling,
	 *     VkImageUsageFlags                           usage,
	 *     VkImageCreateFlags                          flags,
	 *     VkImageFormatProperties*                    pImageFormatProperties);
	 * </pre>
	 */
   public abstract VkResult vkGetPhysicalDeviceImageFormatProperties(
		VkPhysicalDevice  physicalDevice,
		VkFormat  format,
		VkImageType  type,
		VkImageTiling  tiling,
		VkImageUsageFlags  usage,
		VkImageCreateFlags  flags,
		VkImageFormatProperties*  pImageFormatProperties);

    private static native VkResult vkGetPhysicalDeviceImageFormatProperties0(
		VkPhysicalDevice  physicalDevice,
		VkFormat  format,
		VkImageType  type,
		VkImageTiling  tiling,
		VkImageUsageFlags  usage,
		VkImageCreateFlags  flags,
		VkImageFormatProperties*  pImageFormatProperties);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkGetPhysicalDeviceProperties(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     VkPhysicalDeviceProperties*                 pProperties);
	 * </pre>
	 */
   public abstract void vkGetPhysicalDeviceProperties(
		VkPhysicalDevice  physicalDevice,
		VkPhysicalDeviceProperties*  pProperties);

    private static native void vkGetPhysicalDeviceProperties0(
		VkPhysicalDevice  physicalDevice,
		VkPhysicalDeviceProperties*  pProperties);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkGetPhysicalDeviceQueueFamilyProperties(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     uint32_t*                                   pQueueFamilyPropertyCount,
	 *     VkQueueFamilyProperties*                    pQueueFamilyProperties);
	 * </pre>
	 */
   public abstract void vkGetPhysicalDeviceQueueFamilyProperties(
		VkPhysicalDevice  physicalDevice,
		uint32_t*  pQueueFamilyPropertyCount,
		VkQueueFamilyProperties*  pQueueFamilyProperties);

    private static native void vkGetPhysicalDeviceQueueFamilyProperties0(
		VkPhysicalDevice  physicalDevice,
		uint32_t*  pQueueFamilyPropertyCount,
		VkQueueFamilyProperties*  pQueueFamilyProperties);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkGetPhysicalDeviceMemoryProperties(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     VkPhysicalDeviceMemoryProperties*           pMemoryProperties);
	 * </pre>
	 */
   public abstract void vkGetPhysicalDeviceMemoryProperties(
		VkPhysicalDevice  physicalDevice,
		VkPhysicalDeviceMemoryProperties*  pMemoryProperties);

    private static native void vkGetPhysicalDeviceMemoryProperties0(
		VkPhysicalDevice  physicalDevice,
		VkPhysicalDeviceMemoryProperties*  pMemoryProperties);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR PFN_vkVoidFunction VKAPI_CALL vkGetInstanceProcAddr(
	 *     VkInstance                                  instance,
	 *     const char*                                 pName);
	 * </pre>
	 */
   public abstract PFN_vkVoidFunction vkGetInstanceProcAddr(
		VkInstance  instance,
		const char*  pName);

    private static native PFN_vkVoidFunction vkGetInstanceProcAddr0(
		VkInstance  instance,
		const char*  pName);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR PFN_vkVoidFunction VKAPI_CALL vkGetDeviceProcAddr(
	 *     VkDevice                                    device,
	 *     const char*                                 pName);
	 * </pre>
	 */
   public abstract PFN_vkVoidFunction vkGetDeviceProcAddr(
		VkDevice  device,
		const char*  pName);

    private static native PFN_vkVoidFunction vkGetDeviceProcAddr0(
		VkDevice  device,
		const char*  pName);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateDevice(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     const VkDeviceCreateInfo*                   pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkDevice*                                   pDevice);
	 * </pre>
	 */
   public abstract VkResult vkCreateDevice(
		VkPhysicalDevice  physicalDevice,
		const VkDeviceCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkDevice*  pDevice);

    private static native VkResult vkCreateDevice0(
		VkPhysicalDevice  physicalDevice,
		const VkDeviceCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkDevice*  pDevice);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkDestroyDevice(
	 *     VkDevice                                    device,
	 *     const VkAllocationCallbacks*                pAllocator);
	 * </pre>
	 */
   public abstract void vkDestroyDevice(
		VkDevice  device,
		const VkAllocationCallbacks*  pAllocator);

    private static native void vkDestroyDevice0(
		VkDevice  device,
		const VkAllocationCallbacks*  pAllocator);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkEnumerateInstanceExtensionProperties(
	 *     const char*                                 pLayerName,
	 *     uint32_t*                                   pPropertyCount,
	 *     VkExtensionProperties*                      pProperties);
	 * </pre>
	 */
   public abstract VkResult vkEnumerateInstanceExtensionProperties(
		const char*  pLayerName,
		uint32_t*  pPropertyCount,
		VkExtensionProperties*  pProperties);

    private static native VkResult vkEnumerateInstanceExtensionProperties0(
		const char*  pLayerName,
		uint32_t*  pPropertyCount,
		VkExtensionProperties*  pProperties);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkEnumerateDeviceExtensionProperties(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     const char*                                 pLayerName,
	 *     uint32_t*                                   pPropertyCount,
	 *     VkExtensionProperties*                      pProperties);
	 * </pre>
	 */
   public abstract VkResult vkEnumerateDeviceExtensionProperties(
		VkPhysicalDevice  physicalDevice,
		const char*  pLayerName,
		uint32_t*  pPropertyCount,
		VkExtensionProperties*  pProperties);

    private static native VkResult vkEnumerateDeviceExtensionProperties0(
		VkPhysicalDevice  physicalDevice,
		const char*  pLayerName,
		uint32_t*  pPropertyCount,
		VkExtensionProperties*  pProperties);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkEnumerateInstanceLayerProperties(
	 *     uint32_t*                                   pPropertyCount,
	 *     VkLayerProperties*                          pProperties);
	 * </pre>
	 */
   public abstract VkResult vkEnumerateInstanceLayerProperties(
		uint32_t*  pPropertyCount,
		VkLayerProperties*  pProperties);

    private static native VkResult vkEnumerateInstanceLayerProperties0(
		uint32_t*  pPropertyCount,
		VkLayerProperties*  pProperties);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkEnumerateDeviceLayerProperties(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     uint32_t*                                   pPropertyCount,
	 *     VkLayerProperties*                          pProperties);
	 * </pre>
	 */
   public abstract VkResult vkEnumerateDeviceLayerProperties(
		VkPhysicalDevice  physicalDevice,
		uint32_t*  pPropertyCount,
		VkLayerProperties*  pProperties);

    private static native VkResult vkEnumerateDeviceLayerProperties0(
		VkPhysicalDevice  physicalDevice,
		uint32_t*  pPropertyCount,
		VkLayerProperties*  pProperties);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkGetDeviceQueue(
	 *     VkDevice                                    device,
	 *     uint32_t                                    queueFamilyIndex,
	 *     uint32_t                                    queueIndex,
	 *     VkQueue*                                    pQueue);
	 * </pre>
	 */
   public abstract void vkGetDeviceQueue(
		VkDevice  device,
		uint32_t  queueFamilyIndex,
		uint32_t  queueIndex,
		VkQueue*  pQueue);

    private static native void vkGetDeviceQueue0(
		VkDevice  device,
		uint32_t  queueFamilyIndex,
		uint32_t  queueIndex,
		VkQueue*  pQueue);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkQueueSubmit(
	 *     VkQueue                                     queue,
	 *     uint32_t                                    submitCount,
	 *     const VkSubmitInfo*                         pSubmits,
	 *     VkFence                                     fence);
	 * </pre>
	 */
   public abstract VkResult vkQueueSubmit(
		VkQueue  queue,
		uint32_t  submitCount,
		const VkSubmitInfo*  pSubmits,
		VkFence  fence);

    private static native VkResult vkQueueSubmit0(
		VkQueue  queue,
		uint32_t  submitCount,
		const VkSubmitInfo*  pSubmits,
		VkFence  fence);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkQueueWaitIdle(
	 *     VkQueue                                     queue);
	 * </pre>
	 */
   public abstract VkResult vkQueueWaitIdle(
		VkQueue  queue);

    private static native VkResult vkQueueWaitIdle0(
		VkQueue  queue);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkDeviceWaitIdle(
	 *     VkDevice                                    device);
	 * </pre>
	 */
   public abstract VkResult vkDeviceWaitIdle(
		VkDevice  device);

    private static native VkResult vkDeviceWaitIdle0(
		VkDevice  device);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkAllocateMemory(
	 *     VkDevice                                    device,
	 *     const VkMemoryAllocateInfo*                 pAllocateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkDeviceMemory*                             pMemory);
	 * </pre>
	 */
   public abstract VkResult vkAllocateMemory(
		VkDevice  device,
		const VkMemoryAllocateInfo*  pAllocateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkDeviceMemory*  pMemory);

    private static native VkResult vkAllocateMemory0(
		VkDevice  device,
		const VkMemoryAllocateInfo*  pAllocateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkDeviceMemory*  pMemory);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkFreeMemory(
	 *     VkDevice                                    device,
	 *     VkDeviceMemory                              memory,
	 *     const VkAllocationCallbacks*                pAllocator);
	 * </pre>
	 */
   public abstract void vkFreeMemory(
		VkDevice  device,
		VkDeviceMemory  memory,
		const VkAllocationCallbacks*  pAllocator);

    private static native void vkFreeMemory0(
		VkDevice  device,
		VkDeviceMemory  memory,
		const VkAllocationCallbacks*  pAllocator);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkMapMemory(
	 *     VkDevice                                    device,
	 *     VkDeviceMemory                              memory,
	 *     VkDeviceSize                                offset,
	 *     VkDeviceSize                                size,
	 *     VkMemoryMapFlags                            flags,
	 *     void**                                      ppData);
	 * </pre>
	 */
   public abstract VkResult vkMapMemory(
		VkDevice  device,
		VkDeviceMemory  memory,
		VkDeviceSize  offset,
		VkDeviceSize  size,
		VkMemoryMapFlags  flags,
		void**  ppData);

    private static native VkResult vkMapMemory0(
		VkDevice  device,
		VkDeviceMemory  memory,
		VkDeviceSize  offset,
		VkDeviceSize  size,
		VkMemoryMapFlags  flags,
		void**  ppData);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkUnmapMemory(
	 *     VkDevice                                    device,
	 *     VkDeviceMemory                              memory);
	 * </pre>
	 */
   public abstract void vkUnmapMemory(
		VkDevice  device,
		VkDeviceMemory  memory);

    private static native void vkUnmapMemory0(
		VkDevice  device,
		VkDeviceMemory  memory);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkFlushMappedMemoryRanges(
	 *     VkDevice                                    device,
	 *     uint32_t                                    memoryRangeCount,
	 *     const VkMappedMemoryRange*                  pMemoryRanges);
	 * </pre>
	 */
   public abstract VkResult vkFlushMappedMemoryRanges(
		VkDevice  device,
		uint32_t  memoryRangeCount,
		const VkMappedMemoryRange*  pMemoryRanges);

    private static native VkResult vkFlushMappedMemoryRanges0(
		VkDevice  device,
		uint32_t  memoryRangeCount,
		const VkMappedMemoryRange*  pMemoryRanges);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkInvalidateMappedMemoryRanges(
	 *     VkDevice                                    device,
	 *     uint32_t                                    memoryRangeCount,
	 *     const VkMappedMemoryRange*                  pMemoryRanges);
	 * </pre>
	 */
   public abstract VkResult vkInvalidateMappedMemoryRanges(
		VkDevice  device,
		uint32_t  memoryRangeCount,
		const VkMappedMemoryRange*  pMemoryRanges);

    private static native VkResult vkInvalidateMappedMemoryRanges0(
		VkDevice  device,
		uint32_t  memoryRangeCount,
		const VkMappedMemoryRange*  pMemoryRanges);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkGetDeviceMemoryCommitment(
	 *     VkDevice                                    device,
	 *     VkDeviceMemory                              memory,
	 *     VkDeviceSize*                               pCommittedMemoryInBytes);
	 * </pre>
	 */
   public abstract void vkGetDeviceMemoryCommitment(
		VkDevice  device,
		VkDeviceMemory  memory,
		VkDeviceSize*  pCommittedMemoryInBytes);

    private static native void vkGetDeviceMemoryCommitment0(
		VkDevice  device,
		VkDeviceMemory  memory,
		VkDeviceSize*  pCommittedMemoryInBytes);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkBindBufferMemory(
	 *     VkDevice                                    device,
	 *     VkBuffer                                    buffer,
	 *     VkDeviceMemory                              memory,
	 *     VkDeviceSize                                memoryOffset);
	 * </pre>
	 */
   public abstract VkResult vkBindBufferMemory(
		VkDevice  device,
		VkBuffer  buffer,
		VkDeviceMemory  memory,
		VkDeviceSize  memoryOffset);

    private static native VkResult vkBindBufferMemory0(
		VkDevice  device,
		VkBuffer  buffer,
		VkDeviceMemory  memory,
		VkDeviceSize  memoryOffset);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkBindImageMemory(
	 *     VkDevice                                    device,
	 *     VkImage                                     image,
	 *     VkDeviceMemory                              memory,
	 *     VkDeviceSize                                memoryOffset);
	 * </pre>
	 */
   public abstract VkResult vkBindImageMemory(
		VkDevice  device,
		VkImage  image,
		VkDeviceMemory  memory,
		VkDeviceSize  memoryOffset);

    private static native VkResult vkBindImageMemory0(
		VkDevice  device,
		VkImage  image,
		VkDeviceMemory  memory,
		VkDeviceSize  memoryOffset);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkGetBufferMemoryRequirements(
	 *     VkDevice                                    device,
	 *     VkBuffer                                    buffer,
	 *     VkMemoryRequirements*                       pMemoryRequirements);
	 * </pre>
	 */
   public abstract void vkGetBufferMemoryRequirements(
		VkDevice  device,
		VkBuffer  buffer,
		VkMemoryRequirements*  pMemoryRequirements);

    private static native void vkGetBufferMemoryRequirements0(
		VkDevice  device,
		VkBuffer  buffer,
		VkMemoryRequirements*  pMemoryRequirements);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkGetImageMemoryRequirements(
	 *     VkDevice                                    device,
	 *     VkImage                                     image,
	 *     VkMemoryRequirements*                       pMemoryRequirements);
	 * </pre>
	 */
   public abstract void vkGetImageMemoryRequirements(
		VkDevice  device,
		VkImage  image,
		VkMemoryRequirements*  pMemoryRequirements);

    private static native void vkGetImageMemoryRequirements0(
		VkDevice  device,
		VkImage  image,
		VkMemoryRequirements*  pMemoryRequirements);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkGetImageSparseMemoryRequirements(
	 *     VkDevice                                    device,
	 *     VkImage                                     image,
	 *     uint32_t*                                   pSparseMemoryRequirementCount,
	 *     VkSparseImageMemoryRequirements*            pSparseMemoryRequirements);
	 * </pre>
	 */
   public abstract void vkGetImageSparseMemoryRequirements(
		VkDevice  device,
		VkImage  image,
		uint32_t*  pSparseMemoryRequirementCount,
		VkSparseImageMemoryRequirements*  pSparseMemoryRequirements);

    private static native void vkGetImageSparseMemoryRequirements0(
		VkDevice  device,
		VkImage  image,
		uint32_t*  pSparseMemoryRequirementCount,
		VkSparseImageMemoryRequirements*  pSparseMemoryRequirements);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkGetPhysicalDeviceSparseImageFormatProperties(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     VkFormat                                    format,
	 *     VkImageType                                 type,
	 *     VkSampleCountFlagBits                       samples,
	 *     VkImageUsageFlags                           usage,
	 *     VkImageTiling                               tiling,
	 *     uint32_t*                                   pPropertyCount,
	 *     VkSparseImageFormatProperties*              pProperties);
	 * </pre>
	 */
   public abstract void vkGetPhysicalDeviceSparseImageFormatProperties(
		VkPhysicalDevice  physicalDevice,
		VkFormat  format,
		VkImageType  type,
		VkSampleCountFlagBits  samples,
		VkImageUsageFlags  usage,
		VkImageTiling  tiling,
		uint32_t*  pPropertyCount,
		VkSparseImageFormatProperties*  pProperties);

    private static native void vkGetPhysicalDeviceSparseImageFormatProperties0(
		VkPhysicalDevice  physicalDevice,
		VkFormat  format,
		VkImageType  type,
		VkSampleCountFlagBits  samples,
		VkImageUsageFlags  usage,
		VkImageTiling  tiling,
		uint32_t*  pPropertyCount,
		VkSparseImageFormatProperties*  pProperties);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkQueueBindSparse(
	 *     VkQueue                                     queue,
	 *     uint32_t                                    bindInfoCount,
	 *     const VkBindSparseInfo*                     pBindInfo,
	 *     VkFence                                     fence);
	 * </pre>
	 */
   public abstract VkResult vkQueueBindSparse(
		VkQueue  queue,
		uint32_t  bindInfoCount,
		const VkBindSparseInfo*  pBindInfo,
		VkFence  fence);

    private static native VkResult vkQueueBindSparse0(
		VkQueue  queue,
		uint32_t  bindInfoCount,
		const VkBindSparseInfo*  pBindInfo,
		VkFence  fence);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateFence(
	 *     VkDevice                                    device,
	 *     const VkFenceCreateInfo*                    pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkFence*                                    pFence);
	 * </pre>
	 */
   public abstract VkResult vkCreateFence(
		VkDevice  device,
		const VkFenceCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkFence*  pFence);

    private static native VkResult vkCreateFence0(
		VkDevice  device,
		const VkFenceCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkFence*  pFence);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkDestroyFence(
	 *     VkDevice                                    device,
	 *     VkFence                                     fence,
	 *     const VkAllocationCallbacks*                pAllocator);
	 * </pre>
	 */
   public abstract void vkDestroyFence(
		VkDevice  device,
		VkFence  fence,
		const VkAllocationCallbacks*  pAllocator);

    private static native void vkDestroyFence0(
		VkDevice  device,
		VkFence  fence,
		const VkAllocationCallbacks*  pAllocator);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkResetFences(
	 *     VkDevice                                    device,
	 *     uint32_t                                    fenceCount,
	 *     const VkFence*                              pFences);
	 * </pre>
	 */
   public abstract VkResult vkResetFences(
		VkDevice  device,
		uint32_t  fenceCount,
		const VkFence*  pFences);

    private static native VkResult vkResetFences0(
		VkDevice  device,
		uint32_t  fenceCount,
		const VkFence*  pFences);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkGetFenceStatus(
	 *     VkDevice                                    device,
	 *     VkFence                                     fence);
	 * </pre>
	 */
   public abstract VkResult vkGetFenceStatus(
		VkDevice  device,
		VkFence  fence);

    private static native VkResult vkGetFenceStatus0(
		VkDevice  device,
		VkFence  fence);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkWaitForFences(
	 *     VkDevice                                    device,
	 *     uint32_t                                    fenceCount,
	 *     const VkFence*                              pFences,
	 *     VkBool32                                    waitAll,
	 *     uint64_t                                    timeout);
	 * </pre>
	 */
   public abstract VkResult vkWaitForFences(
		VkDevice  device,
		uint32_t  fenceCount,
		const VkFence*  pFences,
		VkBool32  waitAll,
		uint64_t  timeout);

    private static native VkResult vkWaitForFences0(
		VkDevice  device,
		uint32_t  fenceCount,
		const VkFence*  pFences,
		VkBool32  waitAll,
		uint64_t  timeout);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateSemaphore(
	 *     VkDevice                                    device,
	 *     const VkSemaphoreCreateInfo*                pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkSemaphore*                                pSemaphore);
	 * </pre>
	 */
   public abstract VkResult vkCreateSemaphore(
		VkDevice  device,
		const VkSemaphoreCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkSemaphore*  pSemaphore);

    private static native VkResult vkCreateSemaphore0(
		VkDevice  device,
		const VkSemaphoreCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkSemaphore*  pSemaphore);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkDestroySemaphore(
	 *     VkDevice                                    device,
	 *     VkSemaphore                                 semaphore,
	 *     const VkAllocationCallbacks*                pAllocator);
	 * </pre>
	 */
   public abstract void vkDestroySemaphore(
		VkDevice  device,
		VkSemaphore  semaphore,
		const VkAllocationCallbacks*  pAllocator);

    private static native void vkDestroySemaphore0(
		VkDevice  device,
		VkSemaphore  semaphore,
		const VkAllocationCallbacks*  pAllocator);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateEvent(
	 *     VkDevice                                    device,
	 *     const VkEventCreateInfo*                    pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkEvent*                                    pEvent);
	 * </pre>
	 */
   public abstract VkResult vkCreateEvent(
		VkDevice  device,
		const VkEventCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkEvent*  pEvent);

    private static native VkResult vkCreateEvent0(
		VkDevice  device,
		const VkEventCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkEvent*  pEvent);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkDestroyEvent(
	 *     VkDevice                                    device,
	 *     VkEvent                                     event,
	 *     const VkAllocationCallbacks*                pAllocator);
	 * </pre>
	 */
   public abstract void vkDestroyEvent(
		VkDevice  device,
		VkEvent  event,
		const VkAllocationCallbacks*  pAllocator);

    private static native void vkDestroyEvent0(
		VkDevice  device,
		VkEvent  event,
		const VkAllocationCallbacks*  pAllocator);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkGetEventStatus(
	 *     VkDevice                                    device,
	 *     VkEvent                                     event);
	 * </pre>
	 */
   public abstract VkResult vkGetEventStatus(
		VkDevice  device,
		VkEvent  event);

    private static native VkResult vkGetEventStatus0(
		VkDevice  device,
		VkEvent  event);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkSetEvent(
	 *     VkDevice                                    device,
	 *     VkEvent                                     event);
	 * </pre>
	 */
   public abstract VkResult vkSetEvent(
		VkDevice  device,
		VkEvent  event);

    private static native VkResult vkSetEvent0(
		VkDevice  device,
		VkEvent  event);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkResetEvent(
	 *     VkDevice                                    device,
	 *     VkEvent                                     event);
	 * </pre>
	 */
   public abstract VkResult vkResetEvent(
		VkDevice  device,
		VkEvent  event);

    private static native VkResult vkResetEvent0(
		VkDevice  device,
		VkEvent  event);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateQueryPool(
	 *     VkDevice                                    device,
	 *     const VkQueryPoolCreateInfo*                pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkQueryPool*                                pQueryPool);
	 * </pre>
	 */
   public abstract VkResult vkCreateQueryPool(
		VkDevice  device,
		const VkQueryPoolCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkQueryPool*  pQueryPool);

    private static native VkResult vkCreateQueryPool0(
		VkDevice  device,
		const VkQueryPoolCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkQueryPool*  pQueryPool);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkDestroyQueryPool(
	 *     VkDevice                                    device,
	 *     VkQueryPool                                 queryPool,
	 *     const VkAllocationCallbacks*                pAllocator);
	 * </pre>
	 */
   public abstract void vkDestroyQueryPool(
		VkDevice  device,
		VkQueryPool  queryPool,
		const VkAllocationCallbacks*  pAllocator);

    private static native void vkDestroyQueryPool0(
		VkDevice  device,
		VkQueryPool  queryPool,
		const VkAllocationCallbacks*  pAllocator);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkGetQueryPoolResults(
	 *     VkDevice                                    device,
	 *     VkQueryPool                                 queryPool,
	 *     uint32_t                                    firstQuery,
	 *     uint32_t                                    queryCount,
	 *     size_t                                      dataSize,
	 *     void*                                       pData,
	 *     VkDeviceSize                                stride,
	 *     VkQueryResultFlags                          flags);
	 * </pre>
	 */
   public abstract VkResult vkGetQueryPoolResults(
		VkDevice  device,
		VkQueryPool  queryPool,
		uint32_t  firstQuery,
		uint32_t  queryCount,
		size_t  dataSize,
		void*  pData,
		VkDeviceSize  stride,
		VkQueryResultFlags  flags);

    private static native VkResult vkGetQueryPoolResults0(
		VkDevice  device,
		VkQueryPool  queryPool,
		uint32_t  firstQuery,
		uint32_t  queryCount,
		size_t  dataSize,
		void*  pData,
		VkDeviceSize  stride,
		VkQueryResultFlags  flags);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateBuffer(
	 *     VkDevice                                    device,
	 *     const VkBufferCreateInfo*                   pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkBuffer*                                   pBuffer);
	 * </pre>
	 */
   public abstract VkResult vkCreateBuffer(
		VkDevice  device,
		const VkBufferCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkBuffer*  pBuffer);

    private static native VkResult vkCreateBuffer0(
		VkDevice  device,
		const VkBufferCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkBuffer*  pBuffer);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkDestroyBuffer(
	 *     VkDevice                                    device,
	 *     VkBuffer                                    buffer,
	 *     const VkAllocationCallbacks*                pAllocator);
	 * </pre>
	 */
   public abstract void vkDestroyBuffer(
		VkDevice  device,
		VkBuffer  buffer,
		const VkAllocationCallbacks*  pAllocator);

    private static native void vkDestroyBuffer0(
		VkDevice  device,
		VkBuffer  buffer,
		const VkAllocationCallbacks*  pAllocator);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateBufferView(
	 *     VkDevice                                    device,
	 *     const VkBufferViewCreateInfo*               pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkBufferView*                               pView);
	 * </pre>
	 */
   public abstract VkResult vkCreateBufferView(
		VkDevice  device,
		const VkBufferViewCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkBufferView*  pView);

    private static native VkResult vkCreateBufferView0(
		VkDevice  device,
		const VkBufferViewCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkBufferView*  pView);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkDestroyBufferView(
	 *     VkDevice                                    device,
	 *     VkBufferView                                bufferView,
	 *     const VkAllocationCallbacks*                pAllocator);
	 * </pre>
	 */
   public abstract void vkDestroyBufferView(
		VkDevice  device,
		VkBufferView  bufferView,
		const VkAllocationCallbacks*  pAllocator);

    private static native void vkDestroyBufferView0(
		VkDevice  device,
		VkBufferView  bufferView,
		const VkAllocationCallbacks*  pAllocator);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateImage(
	 *     VkDevice                                    device,
	 *     const VkImageCreateInfo*                    pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkImage*                                    pImage);
	 * </pre>
	 */
   public abstract VkResult vkCreateImage(
		VkDevice  device,
		const VkImageCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkImage*  pImage);

    private static native VkResult vkCreateImage0(
		VkDevice  device,
		const VkImageCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkImage*  pImage);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkDestroyImage(
	 *     VkDevice                                    device,
	 *     VkImage                                     image,
	 *     const VkAllocationCallbacks*                pAllocator);
	 * </pre>
	 */
   public abstract void vkDestroyImage(
		VkDevice  device,
		VkImage  image,
		const VkAllocationCallbacks*  pAllocator);

    private static native void vkDestroyImage0(
		VkDevice  device,
		VkImage  image,
		const VkAllocationCallbacks*  pAllocator);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkGetImageSubresourceLayout(
	 *     VkDevice                                    device,
	 *     VkImage                                     image,
	 *     const VkImageSubresource*                   pSubresource,
	 *     VkSubresourceLayout*                        pLayout);
	 * </pre>
	 */
   public abstract void vkGetImageSubresourceLayout(
		VkDevice  device,
		VkImage  image,
		const VkImageSubresource*  pSubresource,
		VkSubresourceLayout*  pLayout);

    private static native void vkGetImageSubresourceLayout0(
		VkDevice  device,
		VkImage  image,
		const VkImageSubresource*  pSubresource,
		VkSubresourceLayout*  pLayout);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateImageView(
	 *     VkDevice                                    device,
	 *     const VkImageViewCreateInfo*                pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkImageView*                                pView);
	 * </pre>
	 */
   public abstract VkResult vkCreateImageView(
		VkDevice  device,
		const VkImageViewCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkImageView*  pView);

    private static native VkResult vkCreateImageView0(
		VkDevice  device,
		const VkImageViewCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkImageView*  pView);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkDestroyImageView(
	 *     VkDevice                                    device,
	 *     VkImageView                                 imageView,
	 *     const VkAllocationCallbacks*                pAllocator);
	 * </pre>
	 */
   public abstract void vkDestroyImageView(
		VkDevice  device,
		VkImageView  imageView,
		const VkAllocationCallbacks*  pAllocator);

    private static native void vkDestroyImageView0(
		VkDevice  device,
		VkImageView  imageView,
		const VkAllocationCallbacks*  pAllocator);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateShaderModule(
	 *     VkDevice                                    device,
	 *     const VkShaderModuleCreateInfo*             pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkShaderModule*                             pShaderModule);
	 * </pre>
	 */
   public abstract VkResult vkCreateShaderModule(
		VkDevice  device,
		const VkShaderModuleCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkShaderModule*  pShaderModule);

    private static native VkResult vkCreateShaderModule0(
		VkDevice  device,
		const VkShaderModuleCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkShaderModule*  pShaderModule);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkDestroyShaderModule(
	 *     VkDevice                                    device,
	 *     VkShaderModule                              shaderModule,
	 *     const VkAllocationCallbacks*                pAllocator);
	 * </pre>
	 */
   public abstract void vkDestroyShaderModule(
		VkDevice  device,
		VkShaderModule  shaderModule,
		const VkAllocationCallbacks*  pAllocator);

    private static native void vkDestroyShaderModule0(
		VkDevice  device,
		VkShaderModule  shaderModule,
		const VkAllocationCallbacks*  pAllocator);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreatePipelineCache(
	 *     VkDevice                                    device,
	 *     const VkPipelineCacheCreateInfo*            pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkPipelineCache*                            pPipelineCache);
	 * </pre>
	 */
   public abstract VkResult vkCreatePipelineCache(
		VkDevice  device,
		const VkPipelineCacheCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkPipelineCache*  pPipelineCache);

    private static native VkResult vkCreatePipelineCache0(
		VkDevice  device,
		const VkPipelineCacheCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkPipelineCache*  pPipelineCache);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkDestroyPipelineCache(
	 *     VkDevice                                    device,
	 *     VkPipelineCache                             pipelineCache,
	 *     const VkAllocationCallbacks*                pAllocator);
	 * </pre>
	 */
   public abstract void vkDestroyPipelineCache(
		VkDevice  device,
		VkPipelineCache  pipelineCache,
		const VkAllocationCallbacks*  pAllocator);

    private static native void vkDestroyPipelineCache0(
		VkDevice  device,
		VkPipelineCache  pipelineCache,
		const VkAllocationCallbacks*  pAllocator);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkGetPipelineCacheData(
	 *     VkDevice                                    device,
	 *     VkPipelineCache                             pipelineCache,
	 *     size_t*                                     pDataSize,
	 *     void*                                       pData);
	 * </pre>
	 */
   public abstract VkResult vkGetPipelineCacheData(
		VkDevice  device,
		VkPipelineCache  pipelineCache,
		size_t*  pDataSize,
		void*  pData);

    private static native VkResult vkGetPipelineCacheData0(
		VkDevice  device,
		VkPipelineCache  pipelineCache,
		size_t*  pDataSize,
		void*  pData);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkMergePipelineCaches(
	 *     VkDevice                                    device,
	 *     VkPipelineCache                             dstCache,
	 *     uint32_t                                    srcCacheCount,
	 *     const VkPipelineCache*                      pSrcCaches);
	 * </pre>
	 */
   public abstract VkResult vkMergePipelineCaches(
		VkDevice  device,
		VkPipelineCache  dstCache,
		uint32_t  srcCacheCount,
		const VkPipelineCache*  pSrcCaches);

    private static native VkResult vkMergePipelineCaches0(
		VkDevice  device,
		VkPipelineCache  dstCache,
		uint32_t  srcCacheCount,
		const VkPipelineCache*  pSrcCaches);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateGraphicsPipelines(
	 *     VkDevice                                    device,
	 *     VkPipelineCache                             pipelineCache,
	 *     uint32_t                                    createInfoCount,
	 *     const VkGraphicsPipelineCreateInfo*         pCreateInfos,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkPipeline*                                 pPipelines);
	 * </pre>
	 */
   public abstract VkResult vkCreateGraphicsPipelines(
		VkDevice  device,
		VkPipelineCache  pipelineCache,
		uint32_t  createInfoCount,
		const VkGraphicsPipelineCreateInfo*  pCreateInfos,
		const VkAllocationCallbacks*  pAllocator,
		VkPipeline*  pPipelines);

    private static native VkResult vkCreateGraphicsPipelines0(
		VkDevice  device,
		VkPipelineCache  pipelineCache,
		uint32_t  createInfoCount,
		const VkGraphicsPipelineCreateInfo*  pCreateInfos,
		const VkAllocationCallbacks*  pAllocator,
		VkPipeline*  pPipelines);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateComputePipelines(
	 *     VkDevice                                    device,
	 *     VkPipelineCache                             pipelineCache,
	 *     uint32_t                                    createInfoCount,
	 *     const VkComputePipelineCreateInfo*          pCreateInfos,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkPipeline*                                 pPipelines);
	 * </pre>
	 */
   public abstract VkResult vkCreateComputePipelines(
		VkDevice  device,
		VkPipelineCache  pipelineCache,
		uint32_t  createInfoCount,
		const VkComputePipelineCreateInfo*  pCreateInfos,
		const VkAllocationCallbacks*  pAllocator,
		VkPipeline*  pPipelines);

    private static native VkResult vkCreateComputePipelines0(
		VkDevice  device,
		VkPipelineCache  pipelineCache,
		uint32_t  createInfoCount,
		const VkComputePipelineCreateInfo*  pCreateInfos,
		const VkAllocationCallbacks*  pAllocator,
		VkPipeline*  pPipelines);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkDestroyPipeline(
	 *     VkDevice                                    device,
	 *     VkPipeline                                  pipeline,
	 *     const VkAllocationCallbacks*                pAllocator);
	 * </pre>
	 */
   public abstract void vkDestroyPipeline(
		VkDevice  device,
		VkPipeline  pipeline,
		const VkAllocationCallbacks*  pAllocator);

    private static native void vkDestroyPipeline0(
		VkDevice  device,
		VkPipeline  pipeline,
		const VkAllocationCallbacks*  pAllocator);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreatePipelineLayout(
	 *     VkDevice                                    device,
	 *     const VkPipelineLayoutCreateInfo*           pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkPipelineLayout*                           pPipelineLayout);
	 * </pre>
	 */
   public abstract VkResult vkCreatePipelineLayout(
		VkDevice  device,
		const VkPipelineLayoutCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkPipelineLayout*  pPipelineLayout);

    private static native VkResult vkCreatePipelineLayout0(
		VkDevice  device,
		const VkPipelineLayoutCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkPipelineLayout*  pPipelineLayout);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkDestroyPipelineLayout(
	 *     VkDevice                                    device,
	 *     VkPipelineLayout                            pipelineLayout,
	 *     const VkAllocationCallbacks*                pAllocator);
	 * </pre>
	 */
   public abstract void vkDestroyPipelineLayout(
		VkDevice  device,
		VkPipelineLayout  pipelineLayout,
		const VkAllocationCallbacks*  pAllocator);

    private static native void vkDestroyPipelineLayout0(
		VkDevice  device,
		VkPipelineLayout  pipelineLayout,
		const VkAllocationCallbacks*  pAllocator);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateSampler(
	 *     VkDevice                                    device,
	 *     const VkSamplerCreateInfo*                  pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkSampler*                                  pSampler);
	 * </pre>
	 */
   public abstract VkResult vkCreateSampler(
		VkDevice  device,
		const VkSamplerCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkSampler*  pSampler);

    private static native VkResult vkCreateSampler0(
		VkDevice  device,
		const VkSamplerCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkSampler*  pSampler);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkDestroySampler(
	 *     VkDevice                                    device,
	 *     VkSampler                                   sampler,
	 *     const VkAllocationCallbacks*                pAllocator);
	 * </pre>
	 */
   public abstract void vkDestroySampler(
		VkDevice  device,
		VkSampler  sampler,
		const VkAllocationCallbacks*  pAllocator);

    private static native void vkDestroySampler0(
		VkDevice  device,
		VkSampler  sampler,
		const VkAllocationCallbacks*  pAllocator);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateDescriptorSetLayout(
	 *     VkDevice                                    device,
	 *     const VkDescriptorSetLayoutCreateInfo*      pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkDescriptorSetLayout*                      pSetLayout);
	 * </pre>
	 */
   public abstract VkResult vkCreateDescriptorSetLayout(
		VkDevice  device,
		const VkDescriptorSetLayoutCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkDescriptorSetLayout*  pSetLayout);

    private static native VkResult vkCreateDescriptorSetLayout0(
		VkDevice  device,
		const VkDescriptorSetLayoutCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkDescriptorSetLayout*  pSetLayout);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkDestroyDescriptorSetLayout(
	 *     VkDevice                                    device,
	 *     VkDescriptorSetLayout                       descriptorSetLayout,
	 *     const VkAllocationCallbacks*                pAllocator);
	 * </pre>
	 */
   public abstract void vkDestroyDescriptorSetLayout(
		VkDevice  device,
		VkDescriptorSetLayout  descriptorSetLayout,
		const VkAllocationCallbacks*  pAllocator);

    private static native void vkDestroyDescriptorSetLayout0(
		VkDevice  device,
		VkDescriptorSetLayout  descriptorSetLayout,
		const VkAllocationCallbacks*  pAllocator);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateDescriptorPool(
	 *     VkDevice                                    device,
	 *     const VkDescriptorPoolCreateInfo*           pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkDescriptorPool*                           pDescriptorPool);
	 * </pre>
	 */
   public abstract VkResult vkCreateDescriptorPool(
		VkDevice  device,
		const VkDescriptorPoolCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkDescriptorPool*  pDescriptorPool);

    private static native VkResult vkCreateDescriptorPool0(
		VkDevice  device,
		const VkDescriptorPoolCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkDescriptorPool*  pDescriptorPool);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkDestroyDescriptorPool(
	 *     VkDevice                                    device,
	 *     VkDescriptorPool                            descriptorPool,
	 *     const VkAllocationCallbacks*                pAllocator);
	 * </pre>
	 */
   public abstract void vkDestroyDescriptorPool(
		VkDevice  device,
		VkDescriptorPool  descriptorPool,
		const VkAllocationCallbacks*  pAllocator);

    private static native void vkDestroyDescriptorPool0(
		VkDevice  device,
		VkDescriptorPool  descriptorPool,
		const VkAllocationCallbacks*  pAllocator);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkResetDescriptorPool(
	 *     VkDevice                                    device,
	 *     VkDescriptorPool                            descriptorPool,
	 *     VkDescriptorPoolResetFlags                  flags);
	 * </pre>
	 */
   public abstract VkResult vkResetDescriptorPool(
		VkDevice  device,
		VkDescriptorPool  descriptorPool,
		VkDescriptorPoolResetFlags  flags);

    private static native VkResult vkResetDescriptorPool0(
		VkDevice  device,
		VkDescriptorPool  descriptorPool,
		VkDescriptorPoolResetFlags  flags);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkAllocateDescriptorSets(
	 *     VkDevice                                    device,
	 *     const VkDescriptorSetAllocateInfo*          pAllocateInfo,
	 *     VkDescriptorSet*                            pDescriptorSets);
	 * </pre>
	 */
   public abstract VkResult vkAllocateDescriptorSets(
		VkDevice  device,
		const VkDescriptorSetAllocateInfo*  pAllocateInfo,
		VkDescriptorSet*  pDescriptorSets);

    private static native VkResult vkAllocateDescriptorSets0(
		VkDevice  device,
		const VkDescriptorSetAllocateInfo*  pAllocateInfo,
		VkDescriptorSet*  pDescriptorSets);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkFreeDescriptorSets(
	 *     VkDevice                                    device,
	 *     VkDescriptorPool                            descriptorPool,
	 *     uint32_t                                    descriptorSetCount,
	 *     const VkDescriptorSet*                      pDescriptorSets);
	 * </pre>
	 */
   public abstract VkResult vkFreeDescriptorSets(
		VkDevice  device,
		VkDescriptorPool  descriptorPool,
		uint32_t  descriptorSetCount,
		const VkDescriptorSet*  pDescriptorSets);

    private static native VkResult vkFreeDescriptorSets0(
		VkDevice  device,
		VkDescriptorPool  descriptorPool,
		uint32_t  descriptorSetCount,
		const VkDescriptorSet*  pDescriptorSets);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkUpdateDescriptorSets(
	 *     VkDevice                                    device,
	 *     uint32_t                                    descriptorWriteCount,
	 *     const VkWriteDescriptorSet*                 pDescriptorWrites,
	 *     uint32_t                                    descriptorCopyCount,
	 *     const VkCopyDescriptorSet*                  pDescriptorCopies);
	 * </pre>
	 */
   public abstract void vkUpdateDescriptorSets(
		VkDevice  device,
		uint32_t  descriptorWriteCount,
		const VkWriteDescriptorSet*  pDescriptorWrites,
		uint32_t  descriptorCopyCount,
		const VkCopyDescriptorSet*  pDescriptorCopies);

    private static native void vkUpdateDescriptorSets0(
		VkDevice  device,
		uint32_t  descriptorWriteCount,
		const VkWriteDescriptorSet*  pDescriptorWrites,
		uint32_t  descriptorCopyCount,
		const VkCopyDescriptorSet*  pDescriptorCopies);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateFramebuffer(
	 *     VkDevice                                    device,
	 *     const VkFramebufferCreateInfo*              pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkFramebuffer*                              pFramebuffer);
	 * </pre>
	 */
   public abstract VkResult vkCreateFramebuffer(
		VkDevice  device,
		const VkFramebufferCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkFramebuffer*  pFramebuffer);

    private static native VkResult vkCreateFramebuffer0(
		VkDevice  device,
		const VkFramebufferCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkFramebuffer*  pFramebuffer);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkDestroyFramebuffer(
	 *     VkDevice                                    device,
	 *     VkFramebuffer                               framebuffer,
	 *     const VkAllocationCallbacks*                pAllocator);
	 * </pre>
	 */
   public abstract void vkDestroyFramebuffer(
		VkDevice  device,
		VkFramebuffer  framebuffer,
		const VkAllocationCallbacks*  pAllocator);

    private static native void vkDestroyFramebuffer0(
		VkDevice  device,
		VkFramebuffer  framebuffer,
		const VkAllocationCallbacks*  pAllocator);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateRenderPass(
	 *     VkDevice                                    device,
	 *     const VkRenderPassCreateInfo*               pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkRenderPass*                               pRenderPass);
	 * </pre>
	 */
   public abstract VkResult vkCreateRenderPass(
		VkDevice  device,
		const VkRenderPassCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkRenderPass*  pRenderPass);

    private static native VkResult vkCreateRenderPass0(
		VkDevice  device,
		const VkRenderPassCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkRenderPass*  pRenderPass);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkDestroyRenderPass(
	 *     VkDevice                                    device,
	 *     VkRenderPass                                renderPass,
	 *     const VkAllocationCallbacks*                pAllocator);
	 * </pre>
	 */
   public abstract void vkDestroyRenderPass(
		VkDevice  device,
		VkRenderPass  renderPass,
		const VkAllocationCallbacks*  pAllocator);

    private static native void vkDestroyRenderPass0(
		VkDevice  device,
		VkRenderPass  renderPass,
		const VkAllocationCallbacks*  pAllocator);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkGetRenderAreaGranularity(
	 *     VkDevice                                    device,
	 *     VkRenderPass                                renderPass,
	 *     VkExtent2D*                                 pGranularity);
	 * </pre>
	 */
   public abstract void vkGetRenderAreaGranularity(
		VkDevice  device,
		VkRenderPass  renderPass,
		VkExtent2D*  pGranularity);

    private static native void vkGetRenderAreaGranularity0(
		VkDevice  device,
		VkRenderPass  renderPass,
		VkExtent2D*  pGranularity);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateCommandPool(
	 *     VkDevice                                    device,
	 *     const VkCommandPoolCreateInfo*              pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkCommandPool*                              pCommandPool);
	 * </pre>
	 */
   public abstract VkResult vkCreateCommandPool(
		VkDevice  device,
		const VkCommandPoolCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkCommandPool*  pCommandPool);

    private static native VkResult vkCreateCommandPool0(
		VkDevice  device,
		const VkCommandPoolCreateInfo*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkCommandPool*  pCommandPool);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkDestroyCommandPool(
	 *     VkDevice                                    device,
	 *     VkCommandPool                               commandPool,
	 *     const VkAllocationCallbacks*                pAllocator);
	 * </pre>
	 */
   public abstract void vkDestroyCommandPool(
		VkDevice  device,
		VkCommandPool  commandPool,
		const VkAllocationCallbacks*  pAllocator);

    private static native void vkDestroyCommandPool0(
		VkDevice  device,
		VkCommandPool  commandPool,
		const VkAllocationCallbacks*  pAllocator);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkResetCommandPool(
	 *     VkDevice                                    device,
	 *     VkCommandPool                               commandPool,
	 *     VkCommandPoolResetFlags                     flags);
	 * </pre>
	 */
   public abstract VkResult vkResetCommandPool(
		VkDevice  device,
		VkCommandPool  commandPool,
		VkCommandPoolResetFlags  flags);

    private static native VkResult vkResetCommandPool0(
		VkDevice  device,
		VkCommandPool  commandPool,
		VkCommandPoolResetFlags  flags);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkAllocateCommandBuffers(
	 *     VkDevice                                    device,
	 *     const VkCommandBufferAllocateInfo*          pAllocateInfo,
	 *     VkCommandBuffer*                            pCommandBuffers);
	 * </pre>
	 */
   public abstract VkResult vkAllocateCommandBuffers(
		VkDevice  device,
		const VkCommandBufferAllocateInfo*  pAllocateInfo,
		VkCommandBuffer*  pCommandBuffers);

    private static native VkResult vkAllocateCommandBuffers0(
		VkDevice  device,
		const VkCommandBufferAllocateInfo*  pAllocateInfo,
		VkCommandBuffer*  pCommandBuffers);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkFreeCommandBuffers(
	 *     VkDevice                                    device,
	 *     VkCommandPool                               commandPool,
	 *     uint32_t                                    commandBufferCount,
	 *     const VkCommandBuffer*                      pCommandBuffers);
	 * </pre>
	 */
   public abstract void vkFreeCommandBuffers(
		VkDevice  device,
		VkCommandPool  commandPool,
		uint32_t  commandBufferCount,
		const VkCommandBuffer*  pCommandBuffers);

    private static native void vkFreeCommandBuffers0(
		VkDevice  device,
		VkCommandPool  commandPool,
		uint32_t  commandBufferCount,
		const VkCommandBuffer*  pCommandBuffers);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkBeginCommandBuffer(
	 *     VkCommandBuffer                             commandBuffer,
	 *     const VkCommandBufferBeginInfo*             pBeginInfo);
	 * </pre>
	 */
   public abstract VkResult vkBeginCommandBuffer(
		VkCommandBuffer  commandBuffer,
		const VkCommandBufferBeginInfo*  pBeginInfo);

    private static native VkResult vkBeginCommandBuffer0(
		VkCommandBuffer  commandBuffer,
		const VkCommandBufferBeginInfo*  pBeginInfo);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkEndCommandBuffer(
	 *     VkCommandBuffer                             commandBuffer);
	 * </pre>
	 */
   public abstract VkResult vkEndCommandBuffer(
		VkCommandBuffer  commandBuffer);

    private static native VkResult vkEndCommandBuffer0(
		VkCommandBuffer  commandBuffer);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkResetCommandBuffer(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkCommandBufferResetFlags                   flags);
	 * </pre>
	 */
   public abstract VkResult vkResetCommandBuffer(
		VkCommandBuffer  commandBuffer,
		VkCommandBufferResetFlags  flags);

    private static native VkResult vkResetCommandBuffer0(
		VkCommandBuffer  commandBuffer,
		VkCommandBufferResetFlags  flags);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdBindPipeline(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkPipelineBindPoint                         pipelineBindPoint,
	 *     VkPipeline                                  pipeline);
	 * </pre>
	 */
   public abstract void vkCmdBindPipeline(
		VkCommandBuffer  commandBuffer,
		VkPipelineBindPoint  pipelineBindPoint,
		VkPipeline  pipeline);

    private static native void vkCmdBindPipeline0(
		VkCommandBuffer  commandBuffer,
		VkPipelineBindPoint  pipelineBindPoint,
		VkPipeline  pipeline);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdSetViewport(
	 *     VkCommandBuffer                             commandBuffer,
	 *     uint32_t                                    firstViewport,
	 *     uint32_t                                    viewportCount,
	 *     const VkViewport*                           pViewports);
	 * </pre>
	 */
   public abstract void vkCmdSetViewport(
		VkCommandBuffer  commandBuffer,
		uint32_t  firstViewport,
		uint32_t  viewportCount,
		const VkViewport*  pViewports);

    private static native void vkCmdSetViewport0(
		VkCommandBuffer  commandBuffer,
		uint32_t  firstViewport,
		uint32_t  viewportCount,
		const VkViewport*  pViewports);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdSetScissor(
	 *     VkCommandBuffer                             commandBuffer,
	 *     uint32_t                                    firstScissor,
	 *     uint32_t                                    scissorCount,
	 *     const VkRect2D*                             pScissors);
	 * </pre>
	 */
   public abstract void vkCmdSetScissor(
		VkCommandBuffer  commandBuffer,
		uint32_t  firstScissor,
		uint32_t  scissorCount,
		const VkRect2D*  pScissors);

    private static native void vkCmdSetScissor0(
		VkCommandBuffer  commandBuffer,
		uint32_t  firstScissor,
		uint32_t  scissorCount,
		const VkRect2D*  pScissors);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdSetLineWidth(
	 *     VkCommandBuffer                             commandBuffer,
	 *     float                                       lineWidth);
	 * </pre>
	 */
   public abstract void vkCmdSetLineWidth(
		VkCommandBuffer  commandBuffer,
		float  lineWidth);

    private static native void vkCmdSetLineWidth0(
		VkCommandBuffer  commandBuffer,
		float  lineWidth);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdSetDepthBias(
	 *     VkCommandBuffer                             commandBuffer,
	 *     float                                       depthBiasConstantFactor,
	 *     float                                       depthBiasClamp,
	 *     float                                       depthBiasSlopeFactor);
	 * </pre>
	 */
   public abstract void vkCmdSetDepthBias(
		VkCommandBuffer  commandBuffer,
		float  depthBiasConstantFactor,
		float  depthBiasClamp,
		float  depthBiasSlopeFactor);

    private static native void vkCmdSetDepthBias0(
		VkCommandBuffer  commandBuffer,
		float  depthBiasConstantFactor,
		float  depthBiasClamp,
		float  depthBiasSlopeFactor);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdSetBlendConstants(
	 *     VkCommandBuffer                             commandBuffer,
	 *     const float                                 blendConstants[4]);
	 * </pre>
	 */
   public abstract void vkCmdSetBlendConstants(
		VkCommandBuffer  commandBuffer,
		const float[]  blendConstants);

    private static native void vkCmdSetBlendConstants0(
		VkCommandBuffer  commandBuffer,
		const float[]  blendConstants);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdSetDepthBounds(
	 *     VkCommandBuffer                             commandBuffer,
	 *     float                                       minDepthBounds,
	 *     float                                       maxDepthBounds);
	 * </pre>
	 */
   public abstract void vkCmdSetDepthBounds(
		VkCommandBuffer  commandBuffer,
		float  minDepthBounds,
		float  maxDepthBounds);

    private static native void vkCmdSetDepthBounds0(
		VkCommandBuffer  commandBuffer,
		float  minDepthBounds,
		float  maxDepthBounds);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdSetStencilCompareMask(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkStencilFaceFlags                          faceMask,
	 *     uint32_t                                    compareMask);
	 * </pre>
	 */
   public abstract void vkCmdSetStencilCompareMask(
		VkCommandBuffer  commandBuffer,
		VkStencilFaceFlags  faceMask,
		uint32_t  compareMask);

    private static native void vkCmdSetStencilCompareMask0(
		VkCommandBuffer  commandBuffer,
		VkStencilFaceFlags  faceMask,
		uint32_t  compareMask);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdSetStencilWriteMask(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkStencilFaceFlags                          faceMask,
	 *     uint32_t                                    writeMask);
	 * </pre>
	 */
   public abstract void vkCmdSetStencilWriteMask(
		VkCommandBuffer  commandBuffer,
		VkStencilFaceFlags  faceMask,
		uint32_t  writeMask);

    private static native void vkCmdSetStencilWriteMask0(
		VkCommandBuffer  commandBuffer,
		VkStencilFaceFlags  faceMask,
		uint32_t  writeMask);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdSetStencilReference(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkStencilFaceFlags                          faceMask,
	 *     uint32_t                                    reference);
	 * </pre>
	 */
   public abstract void vkCmdSetStencilReference(
		VkCommandBuffer  commandBuffer,
		VkStencilFaceFlags  faceMask,
		uint32_t  reference);

    private static native void vkCmdSetStencilReference0(
		VkCommandBuffer  commandBuffer,
		VkStencilFaceFlags  faceMask,
		uint32_t  reference);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdBindDescriptorSets(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkPipelineBindPoint                         pipelineBindPoint,
	 *     VkPipelineLayout                            layout,
	 *     uint32_t                                    firstSet,
	 *     uint32_t                                    descriptorSetCount,
	 *     const VkDescriptorSet*                      pDescriptorSets,
	 *     uint32_t                                    dynamicOffsetCount,
	 *     const uint32_t*                             pDynamicOffsets);
	 * </pre>
	 */
   public abstract void vkCmdBindDescriptorSets(
		VkCommandBuffer  commandBuffer,
		VkPipelineBindPoint  pipelineBindPoint,
		VkPipelineLayout  layout,
		uint32_t  firstSet,
		uint32_t  descriptorSetCount,
		const VkDescriptorSet*  pDescriptorSets,
		uint32_t  dynamicOffsetCount,
		const uint32_t*  pDynamicOffsets);

    private static native void vkCmdBindDescriptorSets0(
		VkCommandBuffer  commandBuffer,
		VkPipelineBindPoint  pipelineBindPoint,
		VkPipelineLayout  layout,
		uint32_t  firstSet,
		uint32_t  descriptorSetCount,
		const VkDescriptorSet*  pDescriptorSets,
		uint32_t  dynamicOffsetCount,
		const uint32_t*  pDynamicOffsets);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdBindIndexBuffer(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkBuffer                                    buffer,
	 *     VkDeviceSize                                offset,
	 *     VkIndexType                                 indexType);
	 * </pre>
	 */
   public abstract void vkCmdBindIndexBuffer(
		VkCommandBuffer  commandBuffer,
		VkBuffer  buffer,
		VkDeviceSize  offset,
		VkIndexType  indexType);

    private static native void vkCmdBindIndexBuffer0(
		VkCommandBuffer  commandBuffer,
		VkBuffer  buffer,
		VkDeviceSize  offset,
		VkIndexType  indexType);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdBindVertexBuffers(
	 *     VkCommandBuffer                             commandBuffer,
	 *     uint32_t                                    firstBinding,
	 *     uint32_t                                    bindingCount,
	 *     const VkBuffer*                             pBuffers,
	 *     const VkDeviceSize*                         pOffsets);
	 * </pre>
	 */
   public abstract void vkCmdBindVertexBuffers(
		VkCommandBuffer  commandBuffer,
		uint32_t  firstBinding,
		uint32_t  bindingCount,
		const VkBuffer*  pBuffers,
		const VkDeviceSize*  pOffsets);

    private static native void vkCmdBindVertexBuffers0(
		VkCommandBuffer  commandBuffer,
		uint32_t  firstBinding,
		uint32_t  bindingCount,
		const VkBuffer*  pBuffers,
		const VkDeviceSize*  pOffsets);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdDraw(
	 *     VkCommandBuffer                             commandBuffer,
	 *     uint32_t                                    vertexCount,
	 *     uint32_t                                    instanceCount,
	 *     uint32_t                                    firstVertex,
	 *     uint32_t                                    firstInstance);
	 * </pre>
	 */
   public abstract void vkCmdDraw(
		VkCommandBuffer  commandBuffer,
		uint32_t  vertexCount,
		uint32_t  instanceCount,
		uint32_t  firstVertex,
		uint32_t  firstInstance);

    private static native void vkCmdDraw0(
		VkCommandBuffer  commandBuffer,
		uint32_t  vertexCount,
		uint32_t  instanceCount,
		uint32_t  firstVertex,
		uint32_t  firstInstance);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdDrawIndexed(
	 *     VkCommandBuffer                             commandBuffer,
	 *     uint32_t                                    indexCount,
	 *     uint32_t                                    instanceCount,
	 *     uint32_t                                    firstIndex,
	 *     int32_t                                     vertexOffset,
	 *     uint32_t                                    firstInstance);
	 * </pre>
	 */
   public abstract void vkCmdDrawIndexed(
		VkCommandBuffer  commandBuffer,
		uint32_t  indexCount,
		uint32_t  instanceCount,
		uint32_t  firstIndex,
		int32_t  vertexOffset,
		uint32_t  firstInstance);

    private static native void vkCmdDrawIndexed0(
		VkCommandBuffer  commandBuffer,
		uint32_t  indexCount,
		uint32_t  instanceCount,
		uint32_t  firstIndex,
		int32_t  vertexOffset,
		uint32_t  firstInstance);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdDrawIndirect(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkBuffer                                    buffer,
	 *     VkDeviceSize                                offset,
	 *     uint32_t                                    drawCount,
	 *     uint32_t                                    stride);
	 * </pre>
	 */
   public abstract void vkCmdDrawIndirect(
		VkCommandBuffer  commandBuffer,
		VkBuffer  buffer,
		VkDeviceSize  offset,
		uint32_t  drawCount,
		uint32_t  stride);

    private static native void vkCmdDrawIndirect0(
		VkCommandBuffer  commandBuffer,
		VkBuffer  buffer,
		VkDeviceSize  offset,
		uint32_t  drawCount,
		uint32_t  stride);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdDrawIndexedIndirect(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkBuffer                                    buffer,
	 *     VkDeviceSize                                offset,
	 *     uint32_t                                    drawCount,
	 *     uint32_t                                    stride);
	 * </pre>
	 */
   public abstract void vkCmdDrawIndexedIndirect(
		VkCommandBuffer  commandBuffer,
		VkBuffer  buffer,
		VkDeviceSize  offset,
		uint32_t  drawCount,
		uint32_t  stride);

    private static native void vkCmdDrawIndexedIndirect0(
		VkCommandBuffer  commandBuffer,
		VkBuffer  buffer,
		VkDeviceSize  offset,
		uint32_t  drawCount,
		uint32_t  stride);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdDispatch(
	 *     VkCommandBuffer                             commandBuffer,
	 *     uint32_t                                    x,
	 *     uint32_t                                    y,
	 *     uint32_t                                    z);
	 * </pre>
	 */
   public abstract void vkCmdDispatch(
		VkCommandBuffer  commandBuffer,
		uint32_t  x,
		uint32_t  y,
		uint32_t  z);

    private static native void vkCmdDispatch0(
		VkCommandBuffer  commandBuffer,
		uint32_t  x,
		uint32_t  y,
		uint32_t  z);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdDispatchIndirect(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkBuffer                                    buffer,
	 *     VkDeviceSize                                offset);
	 * </pre>
	 */
   public abstract void vkCmdDispatchIndirect(
		VkCommandBuffer  commandBuffer,
		VkBuffer  buffer,
		VkDeviceSize  offset);

    private static native void vkCmdDispatchIndirect0(
		VkCommandBuffer  commandBuffer,
		VkBuffer  buffer,
		VkDeviceSize  offset);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdCopyBuffer(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkBuffer                                    srcBuffer,
	 *     VkBuffer                                    dstBuffer,
	 *     uint32_t                                    regionCount,
	 *     const VkBufferCopy*                         pRegions);
	 * </pre>
	 */
   public abstract void vkCmdCopyBuffer(
		VkCommandBuffer  commandBuffer,
		VkBuffer  srcBuffer,
		VkBuffer  dstBuffer,
		uint32_t  regionCount,
		const VkBufferCopy*  pRegions);

    private static native void vkCmdCopyBuffer0(
		VkCommandBuffer  commandBuffer,
		VkBuffer  srcBuffer,
		VkBuffer  dstBuffer,
		uint32_t  regionCount,
		const VkBufferCopy*  pRegions);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdCopyImage(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkImage                                     srcImage,
	 *     VkImageLayout                               srcImageLayout,
	 *     VkImage                                     dstImage,
	 *     VkImageLayout                               dstImageLayout,
	 *     uint32_t                                    regionCount,
	 *     const VkImageCopy*                          pRegions);
	 * </pre>
	 */
   public abstract void vkCmdCopyImage(
		VkCommandBuffer  commandBuffer,
		VkImage  srcImage,
		VkImageLayout  srcImageLayout,
		VkImage  dstImage,
		VkImageLayout  dstImageLayout,
		uint32_t  regionCount,
		const VkImageCopy*  pRegions);

    private static native void vkCmdCopyImage0(
		VkCommandBuffer  commandBuffer,
		VkImage  srcImage,
		VkImageLayout  srcImageLayout,
		VkImage  dstImage,
		VkImageLayout  dstImageLayout,
		uint32_t  regionCount,
		const VkImageCopy*  pRegions);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdBlitImage(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkImage                                     srcImage,
	 *     VkImageLayout                               srcImageLayout,
	 *     VkImage                                     dstImage,
	 *     VkImageLayout                               dstImageLayout,
	 *     uint32_t                                    regionCount,
	 *     const VkImageBlit*                          pRegions,
	 *     VkFilter                                    filter);
	 * </pre>
	 */
   public abstract void vkCmdBlitImage(
		VkCommandBuffer  commandBuffer,
		VkImage  srcImage,
		VkImageLayout  srcImageLayout,
		VkImage  dstImage,
		VkImageLayout  dstImageLayout,
		uint32_t  regionCount,
		const VkImageBlit*  pRegions,
		VkFilter  filter);

    private static native void vkCmdBlitImage0(
		VkCommandBuffer  commandBuffer,
		VkImage  srcImage,
		VkImageLayout  srcImageLayout,
		VkImage  dstImage,
		VkImageLayout  dstImageLayout,
		uint32_t  regionCount,
		const VkImageBlit*  pRegions,
		VkFilter  filter);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdCopyBufferToImage(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkBuffer                                    srcBuffer,
	 *     VkImage                                     dstImage,
	 *     VkImageLayout                               dstImageLayout,
	 *     uint32_t                                    regionCount,
	 *     const VkBufferImageCopy*                    pRegions);
	 * </pre>
	 */
   public abstract void vkCmdCopyBufferToImage(
		VkCommandBuffer  commandBuffer,
		VkBuffer  srcBuffer,
		VkImage  dstImage,
		VkImageLayout  dstImageLayout,
		uint32_t  regionCount,
		const VkBufferImageCopy*  pRegions);

    private static native void vkCmdCopyBufferToImage0(
		VkCommandBuffer  commandBuffer,
		VkBuffer  srcBuffer,
		VkImage  dstImage,
		VkImageLayout  dstImageLayout,
		uint32_t  regionCount,
		const VkBufferImageCopy*  pRegions);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdCopyImageToBuffer(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkImage                                     srcImage,
	 *     VkImageLayout                               srcImageLayout,
	 *     VkBuffer                                    dstBuffer,
	 *     uint32_t                                    regionCount,
	 *     const VkBufferImageCopy*                    pRegions);
	 * </pre>
	 */
   public abstract void vkCmdCopyImageToBuffer(
		VkCommandBuffer  commandBuffer,
		VkImage  srcImage,
		VkImageLayout  srcImageLayout,
		VkBuffer  dstBuffer,
		uint32_t  regionCount,
		const VkBufferImageCopy*  pRegions);

    private static native void vkCmdCopyImageToBuffer0(
		VkCommandBuffer  commandBuffer,
		VkImage  srcImage,
		VkImageLayout  srcImageLayout,
		VkBuffer  dstBuffer,
		uint32_t  regionCount,
		const VkBufferImageCopy*  pRegions);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdUpdateBuffer(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkBuffer                                    dstBuffer,
	 *     VkDeviceSize                                dstOffset,
	 *     VkDeviceSize                                dataSize,
	 *     const uint32_t*                             pData);
	 * </pre>
	 */
   public abstract void vkCmdUpdateBuffer(
		VkCommandBuffer  commandBuffer,
		VkBuffer  dstBuffer,
		VkDeviceSize  dstOffset,
		VkDeviceSize  dataSize,
		const uint32_t*  pData);

    private static native void vkCmdUpdateBuffer0(
		VkCommandBuffer  commandBuffer,
		VkBuffer  dstBuffer,
		VkDeviceSize  dstOffset,
		VkDeviceSize  dataSize,
		const uint32_t*  pData);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdFillBuffer(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkBuffer                                    dstBuffer,
	 *     VkDeviceSize                                dstOffset,
	 *     VkDeviceSize                                size,
	 *     uint32_t                                    data);
	 * </pre>
	 */
   public abstract void vkCmdFillBuffer(
		VkCommandBuffer  commandBuffer,
		VkBuffer  dstBuffer,
		VkDeviceSize  dstOffset,
		VkDeviceSize  size,
		uint32_t  data);

    private static native void vkCmdFillBuffer0(
		VkCommandBuffer  commandBuffer,
		VkBuffer  dstBuffer,
		VkDeviceSize  dstOffset,
		VkDeviceSize  size,
		uint32_t  data);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdClearColorImage(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkImage                                     image,
	 *     VkImageLayout                               imageLayout,
	 *     const VkClearColorValue*                    pColor,
	 *     uint32_t                                    rangeCount,
	 *     const VkImageSubresourceRange*              pRanges);
	 * </pre>
	 */
   public abstract void vkCmdClearColorImage(
		VkCommandBuffer  commandBuffer,
		VkImage  image,
		VkImageLayout  imageLayout,
		const VkClearColorValue*  pColor,
		uint32_t  rangeCount,
		const VkImageSubresourceRange*  pRanges);

    private static native void vkCmdClearColorImage0(
		VkCommandBuffer  commandBuffer,
		VkImage  image,
		VkImageLayout  imageLayout,
		const VkClearColorValue*  pColor,
		uint32_t  rangeCount,
		const VkImageSubresourceRange*  pRanges);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdClearDepthStencilImage(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkImage                                     image,
	 *     VkImageLayout                               imageLayout,
	 *     const VkClearDepthStencilValue*             pDepthStencil,
	 *     uint32_t                                    rangeCount,
	 *     const VkImageSubresourceRange*              pRanges);
	 * </pre>
	 */
   public abstract void vkCmdClearDepthStencilImage(
		VkCommandBuffer  commandBuffer,
		VkImage  image,
		VkImageLayout  imageLayout,
		const VkClearDepthStencilValue*  pDepthStencil,
		uint32_t  rangeCount,
		const VkImageSubresourceRange*  pRanges);

    private static native void vkCmdClearDepthStencilImage0(
		VkCommandBuffer  commandBuffer,
		VkImage  image,
		VkImageLayout  imageLayout,
		const VkClearDepthStencilValue*  pDepthStencil,
		uint32_t  rangeCount,
		const VkImageSubresourceRange*  pRanges);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdClearAttachments(
	 *     VkCommandBuffer                             commandBuffer,
	 *     uint32_t                                    attachmentCount,
	 *     const VkClearAttachment*                    pAttachments,
	 *     uint32_t                                    rectCount,
	 *     const VkClearRect*                          pRects);
	 * </pre>
	 */
   public abstract void vkCmdClearAttachments(
		VkCommandBuffer  commandBuffer,
		uint32_t  attachmentCount,
		const VkClearAttachment*  pAttachments,
		uint32_t  rectCount,
		const VkClearRect*  pRects);

    private static native void vkCmdClearAttachments0(
		VkCommandBuffer  commandBuffer,
		uint32_t  attachmentCount,
		const VkClearAttachment*  pAttachments,
		uint32_t  rectCount,
		const VkClearRect*  pRects);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdResolveImage(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkImage                                     srcImage,
	 *     VkImageLayout                               srcImageLayout,
	 *     VkImage                                     dstImage,
	 *     VkImageLayout                               dstImageLayout,
	 *     uint32_t                                    regionCount,
	 *     const VkImageResolve*                       pRegions);
	 * </pre>
	 */
   public abstract void vkCmdResolveImage(
		VkCommandBuffer  commandBuffer,
		VkImage  srcImage,
		VkImageLayout  srcImageLayout,
		VkImage  dstImage,
		VkImageLayout  dstImageLayout,
		uint32_t  regionCount,
		const VkImageResolve*  pRegions);

    private static native void vkCmdResolveImage0(
		VkCommandBuffer  commandBuffer,
		VkImage  srcImage,
		VkImageLayout  srcImageLayout,
		VkImage  dstImage,
		VkImageLayout  dstImageLayout,
		uint32_t  regionCount,
		const VkImageResolve*  pRegions);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdSetEvent(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkEvent                                     event,
	 *     VkPipelineStageFlags                        stageMask);
	 * </pre>
	 */
   public abstract void vkCmdSetEvent(
		VkCommandBuffer  commandBuffer,
		VkEvent  event,
		VkPipelineStageFlags  stageMask);

    private static native void vkCmdSetEvent0(
		VkCommandBuffer  commandBuffer,
		VkEvent  event,
		VkPipelineStageFlags  stageMask);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdResetEvent(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkEvent                                     event,
	 *     VkPipelineStageFlags                        stageMask);
	 * </pre>
	 */
   public abstract void vkCmdResetEvent(
		VkCommandBuffer  commandBuffer,
		VkEvent  event,
		VkPipelineStageFlags  stageMask);

    private static native void vkCmdResetEvent0(
		VkCommandBuffer  commandBuffer,
		VkEvent  event,
		VkPipelineStageFlags  stageMask);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdWaitEvents(
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
	 */
   public abstract void vkCmdWaitEvents(
		VkCommandBuffer  commandBuffer,
		uint32_t  eventCount,
		const VkEvent*  pEvents,
		VkPipelineStageFlags  srcStageMask,
		VkPipelineStageFlags  dstStageMask,
		uint32_t  memoryBarrierCount,
		const VkMemoryBarrier*  pMemoryBarriers,
		uint32_t  bufferMemoryBarrierCount,
		const VkBufferMemoryBarrier*  pBufferMemoryBarriers,
		uint32_t  imageMemoryBarrierCount,
		const VkImageMemoryBarrier*  pImageMemoryBarriers);

    private static native void vkCmdWaitEvents0(
		VkCommandBuffer  commandBuffer,
		uint32_t  eventCount,
		const VkEvent*  pEvents,
		VkPipelineStageFlags  srcStageMask,
		VkPipelineStageFlags  dstStageMask,
		uint32_t  memoryBarrierCount,
		const VkMemoryBarrier*  pMemoryBarriers,
		uint32_t  bufferMemoryBarrierCount,
		const VkBufferMemoryBarrier*  pBufferMemoryBarriers,
		uint32_t  imageMemoryBarrierCount,
		const VkImageMemoryBarrier*  pImageMemoryBarriers);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdPipelineBarrier(
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
	 */
   public abstract void vkCmdPipelineBarrier(
		VkCommandBuffer  commandBuffer,
		VkPipelineStageFlags  srcStageMask,
		VkPipelineStageFlags  dstStageMask,
		VkDependencyFlags  dependencyFlags,
		uint32_t  memoryBarrierCount,
		const VkMemoryBarrier*  pMemoryBarriers,
		uint32_t  bufferMemoryBarrierCount,
		const VkBufferMemoryBarrier*  pBufferMemoryBarriers,
		uint32_t  imageMemoryBarrierCount,
		const VkImageMemoryBarrier*  pImageMemoryBarriers);

    private static native void vkCmdPipelineBarrier0(
		VkCommandBuffer  commandBuffer,
		VkPipelineStageFlags  srcStageMask,
		VkPipelineStageFlags  dstStageMask,
		VkDependencyFlags  dependencyFlags,
		uint32_t  memoryBarrierCount,
		const VkMemoryBarrier*  pMemoryBarriers,
		uint32_t  bufferMemoryBarrierCount,
		const VkBufferMemoryBarrier*  pBufferMemoryBarriers,
		uint32_t  imageMemoryBarrierCount,
		const VkImageMemoryBarrier*  pImageMemoryBarriers);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdBeginQuery(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkQueryPool                                 queryPool,
	 *     uint32_t                                    query,
	 *     VkQueryControlFlags                         flags);
	 * </pre>
	 */
   public abstract void vkCmdBeginQuery(
		VkCommandBuffer  commandBuffer,
		VkQueryPool  queryPool,
		uint32_t  query,
		VkQueryControlFlags  flags);

    private static native void vkCmdBeginQuery0(
		VkCommandBuffer  commandBuffer,
		VkQueryPool  queryPool,
		uint32_t  query,
		VkQueryControlFlags  flags);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdEndQuery(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkQueryPool                                 queryPool,
	 *     uint32_t                                    query);
	 * </pre>
	 */
   public abstract void vkCmdEndQuery(
		VkCommandBuffer  commandBuffer,
		VkQueryPool  queryPool,
		uint32_t  query);

    private static native void vkCmdEndQuery0(
		VkCommandBuffer  commandBuffer,
		VkQueryPool  queryPool,
		uint32_t  query);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdResetQueryPool(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkQueryPool                                 queryPool,
	 *     uint32_t                                    firstQuery,
	 *     uint32_t                                    queryCount);
	 * </pre>
	 */
   public abstract void vkCmdResetQueryPool(
		VkCommandBuffer  commandBuffer,
		VkQueryPool  queryPool,
		uint32_t  firstQuery,
		uint32_t  queryCount);

    private static native void vkCmdResetQueryPool0(
		VkCommandBuffer  commandBuffer,
		VkQueryPool  queryPool,
		uint32_t  firstQuery,
		uint32_t  queryCount);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdWriteTimestamp(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkPipelineStageFlagBits                     pipelineStage,
	 *     VkQueryPool                                 queryPool,
	 *     uint32_t                                    query);
	 * </pre>
	 */
   public abstract void vkCmdWriteTimestamp(
		VkCommandBuffer  commandBuffer,
		VkPipelineStageFlagBits  pipelineStage,
		VkQueryPool  queryPool,
		uint32_t  query);

    private static native void vkCmdWriteTimestamp0(
		VkCommandBuffer  commandBuffer,
		VkPipelineStageFlagBits  pipelineStage,
		VkQueryPool  queryPool,
		uint32_t  query);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdCopyQueryPoolResults(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkQueryPool                                 queryPool,
	 *     uint32_t                                    firstQuery,
	 *     uint32_t                                    queryCount,
	 *     VkBuffer                                    dstBuffer,
	 *     VkDeviceSize                                dstOffset,
	 *     VkDeviceSize                                stride,
	 *     VkQueryResultFlags                          flags);
	 * </pre>
	 */
   public abstract void vkCmdCopyQueryPoolResults(
		VkCommandBuffer  commandBuffer,
		VkQueryPool  queryPool,
		uint32_t  firstQuery,
		uint32_t  queryCount,
		VkBuffer  dstBuffer,
		VkDeviceSize  dstOffset,
		VkDeviceSize  stride,
		VkQueryResultFlags  flags);

    private static native void vkCmdCopyQueryPoolResults0(
		VkCommandBuffer  commandBuffer,
		VkQueryPool  queryPool,
		uint32_t  firstQuery,
		uint32_t  queryCount,
		VkBuffer  dstBuffer,
		VkDeviceSize  dstOffset,
		VkDeviceSize  stride,
		VkQueryResultFlags  flags);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdPushConstants(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkPipelineLayout                            layout,
	 *     VkShaderStageFlags                          stageFlags,
	 *     uint32_t                                    offset,
	 *     uint32_t                                    size,
	 *     const void*                                 pValues);
	 * </pre>
	 */
   public abstract void vkCmdPushConstants(
		VkCommandBuffer  commandBuffer,
		VkPipelineLayout  layout,
		VkShaderStageFlags  stageFlags,
		uint32_t  offset,
		uint32_t  size,
		const void*  pValues);

    private static native void vkCmdPushConstants0(
		VkCommandBuffer  commandBuffer,
		VkPipelineLayout  layout,
		VkShaderStageFlags  stageFlags,
		uint32_t  offset,
		uint32_t  size,
		const void*  pValues);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdBeginRenderPass(
	 *     VkCommandBuffer                             commandBuffer,
	 *     const VkRenderPassBeginInfo*                pRenderPassBegin,
	 *     VkSubpassContents                           contents);
	 * </pre>
	 */
   public abstract void vkCmdBeginRenderPass(
		VkCommandBuffer  commandBuffer,
		const VkRenderPassBeginInfo*  pRenderPassBegin,
		VkSubpassContents  contents);

    private static native void vkCmdBeginRenderPass0(
		VkCommandBuffer  commandBuffer,
		const VkRenderPassBeginInfo*  pRenderPassBegin,
		VkSubpassContents  contents);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdNextSubpass(
	 *     VkCommandBuffer                             commandBuffer,
	 *     VkSubpassContents                           contents);
	 * </pre>
	 */
   public abstract void vkCmdNextSubpass(
		VkCommandBuffer  commandBuffer,
		VkSubpassContents  contents);

    private static native void vkCmdNextSubpass0(
		VkCommandBuffer  commandBuffer,
		VkSubpassContents  contents);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdEndRenderPass(
	 *     VkCommandBuffer                             commandBuffer);
	 * </pre>
	 */
   public abstract void vkCmdEndRenderPass(
		VkCommandBuffer  commandBuffer);

    private static native void vkCmdEndRenderPass0(
		VkCommandBuffer  commandBuffer);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkCmdExecuteCommands(
	 *     VkCommandBuffer                             commandBuffer,
	 *     uint32_t                                    commandBufferCount,
	 *     const VkCommandBuffer*                      pCommandBuffers);
	 * </pre>
	 */
   public abstract void vkCmdExecuteCommands(
		VkCommandBuffer  commandBuffer,
		uint32_t  commandBufferCount,
		const VkCommandBuffer*  pCommandBuffers);

    private static native void vkCmdExecuteCommands0(
		VkCommandBuffer  commandBuffer,
		uint32_t  commandBufferCount,
		const VkCommandBuffer*  pCommandBuffers);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkDestroySurfaceKHR(
	 *     VkInstance                                  instance,
	 *     VkSurfaceKHR                                surface,
	 *     const VkAllocationCallbacks*                pAllocator);
	 * </pre>
	 */
   public abstract void vkDestroySurfaceKHR(
		VkInstance  instance,
		VkSurfaceKHR  surface,
		const VkAllocationCallbacks*  pAllocator);

    private static native void vkDestroySurfaceKHR0(
		VkInstance  instance,
		VkSurfaceKHR  surface,
		const VkAllocationCallbacks*  pAllocator);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkGetPhysicalDeviceSurfaceSupportKHR(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     uint32_t                                    queueFamilyIndex,
	 *     VkSurfaceKHR                                surface,
	 *     VkBool32*                                   pSupported);
	 * </pre>
	 */
   public abstract VkResult vkGetPhysicalDeviceSurfaceSupportKHR(
		VkPhysicalDevice  physicalDevice,
		uint32_t  queueFamilyIndex,
		VkSurfaceKHR  surface,
		VkBool32*  pSupported);

    private static native VkResult vkGetPhysicalDeviceSurfaceSupportKHR0(
		VkPhysicalDevice  physicalDevice,
		uint32_t  queueFamilyIndex,
		VkSurfaceKHR  surface,
		VkBool32*  pSupported);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     VkSurfaceKHR                                surface,
	 *     VkSurfaceCapabilitiesKHR*                   pSurfaceCapabilities);
	 * </pre>
	 */
   public abstract VkResult vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
		VkPhysicalDevice  physicalDevice,
		VkSurfaceKHR  surface,
		VkSurfaceCapabilitiesKHR*  pSurfaceCapabilities);

    private static native VkResult vkGetPhysicalDeviceSurfaceCapabilitiesKHR0(
		VkPhysicalDevice  physicalDevice,
		VkSurfaceKHR  surface,
		VkSurfaceCapabilitiesKHR*  pSurfaceCapabilities);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkGetPhysicalDeviceSurfaceFormatsKHR(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     VkSurfaceKHR                                surface,
	 *     uint32_t*                                   pSurfaceFormatCount,
	 *     VkSurfaceFormatKHR*                         pSurfaceFormats);
	 * </pre>
	 */
   public abstract VkResult vkGetPhysicalDeviceSurfaceFormatsKHR(
		VkPhysicalDevice  physicalDevice,
		VkSurfaceKHR  surface,
		uint32_t*  pSurfaceFormatCount,
		VkSurfaceFormatKHR*  pSurfaceFormats);

    private static native VkResult vkGetPhysicalDeviceSurfaceFormatsKHR0(
		VkPhysicalDevice  physicalDevice,
		VkSurfaceKHR  surface,
		uint32_t*  pSurfaceFormatCount,
		VkSurfaceFormatKHR*  pSurfaceFormats);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkGetPhysicalDeviceSurfacePresentModesKHR(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     VkSurfaceKHR                                surface,
	 *     uint32_t*                                   pPresentModeCount,
	 *     VkPresentModeKHR*                           pPresentModes);
	 * </pre>
	 */
   public abstract VkResult vkGetPhysicalDeviceSurfacePresentModesKHR(
		VkPhysicalDevice  physicalDevice,
		VkSurfaceKHR  surface,
		uint32_t*  pPresentModeCount,
		VkPresentModeKHR*  pPresentModes);

    private static native VkResult vkGetPhysicalDeviceSurfacePresentModesKHR0(
		VkPhysicalDevice  physicalDevice,
		VkSurfaceKHR  surface,
		uint32_t*  pPresentModeCount,
		VkPresentModeKHR*  pPresentModes);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateSwapchainKHR(
	 *     VkDevice                                    device,
	 *     const VkSwapchainCreateInfoKHR*             pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkSwapchainKHR*                             pSwapchain);
	 * </pre>
	 */
   public abstract VkResult vkCreateSwapchainKHR(
		VkDevice  device,
		const VkSwapchainCreateInfoKHR*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkSwapchainKHR*  pSwapchain);

    private static native VkResult vkCreateSwapchainKHR0(
		VkDevice  device,
		const VkSwapchainCreateInfoKHR*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkSwapchainKHR*  pSwapchain);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkDestroySwapchainKHR(
	 *     VkDevice                                    device,
	 *     VkSwapchainKHR                              swapchain,
	 *     const VkAllocationCallbacks*                pAllocator);
	 * </pre>
	 */
   public abstract void vkDestroySwapchainKHR(
		VkDevice  device,
		VkSwapchainKHR  swapchain,
		const VkAllocationCallbacks*  pAllocator);

    private static native void vkDestroySwapchainKHR0(
		VkDevice  device,
		VkSwapchainKHR  swapchain,
		const VkAllocationCallbacks*  pAllocator);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkGetSwapchainImagesKHR(
	 *     VkDevice                                    device,
	 *     VkSwapchainKHR                              swapchain,
	 *     uint32_t*                                   pSwapchainImageCount,
	 *     VkImage*                                    pSwapchainImages);
	 * </pre>
	 */
   public abstract VkResult vkGetSwapchainImagesKHR(
		VkDevice  device,
		VkSwapchainKHR  swapchain,
		uint32_t*  pSwapchainImageCount,
		VkImage*  pSwapchainImages);

    private static native VkResult vkGetSwapchainImagesKHR0(
		VkDevice  device,
		VkSwapchainKHR  swapchain,
		uint32_t*  pSwapchainImageCount,
		VkImage*  pSwapchainImages);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkAcquireNextImageKHR(
	 *     VkDevice                                    device,
	 *     VkSwapchainKHR                              swapchain,
	 *     uint64_t                                    timeout,
	 *     VkSemaphore                                 semaphore,
	 *     VkFence                                     fence,
	 *     uint32_t*                                   pImageIndex);
	 * </pre>
	 */
   public abstract VkResult vkAcquireNextImageKHR(
		VkDevice  device,
		VkSwapchainKHR  swapchain,
		uint64_t  timeout,
		VkSemaphore  semaphore,
		VkFence  fence,
		uint32_t*  pImageIndex);

    private static native VkResult vkAcquireNextImageKHR0(
		VkDevice  device,
		VkSwapchainKHR  swapchain,
		uint64_t  timeout,
		VkSemaphore  semaphore,
		VkFence  fence,
		uint32_t*  pImageIndex);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkQueuePresentKHR(
	 *     VkQueue                                     queue,
	 *     const VkPresentInfoKHR*                     pPresentInfo);
	 * </pre>
	 */
   public abstract VkResult vkQueuePresentKHR(
		VkQueue  queue,
		const VkPresentInfoKHR*  pPresentInfo);

    private static native VkResult vkQueuePresentKHR0(
		VkQueue  queue,
		const VkPresentInfoKHR*  pPresentInfo);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkGetPhysicalDeviceDisplayPropertiesKHR(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     uint32_t*                                   pPropertyCount,
	 *     VkDisplayPropertiesKHR*                     pProperties);
	 * </pre>
	 */
   public abstract VkResult vkGetPhysicalDeviceDisplayPropertiesKHR(
		VkPhysicalDevice  physicalDevice,
		uint32_t*  pPropertyCount,
		VkDisplayPropertiesKHR*  pProperties);

    private static native VkResult vkGetPhysicalDeviceDisplayPropertiesKHR0(
		VkPhysicalDevice  physicalDevice,
		uint32_t*  pPropertyCount,
		VkDisplayPropertiesKHR*  pProperties);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkGetPhysicalDeviceDisplayPlanePropertiesKHR(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     uint32_t*                                   pPropertyCount,
	 *     VkDisplayPlanePropertiesKHR*                pProperties);
	 * </pre>
	 */
   public abstract VkResult vkGetPhysicalDeviceDisplayPlanePropertiesKHR(
		VkPhysicalDevice  physicalDevice,
		uint32_t*  pPropertyCount,
		VkDisplayPlanePropertiesKHR*  pProperties);

    private static native VkResult vkGetPhysicalDeviceDisplayPlanePropertiesKHR0(
		VkPhysicalDevice  physicalDevice,
		uint32_t*  pPropertyCount,
		VkDisplayPlanePropertiesKHR*  pProperties);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkGetDisplayPlaneSupportedDisplaysKHR(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     uint32_t                                    planeIndex,
	 *     uint32_t*                                   pDisplayCount,
	 *     VkDisplayKHR*                               pDisplays);
	 * </pre>
	 */
   public abstract VkResult vkGetDisplayPlaneSupportedDisplaysKHR(
		VkPhysicalDevice  physicalDevice,
		uint32_t  planeIndex,
		uint32_t*  pDisplayCount,
		VkDisplayKHR*  pDisplays);

    private static native VkResult vkGetDisplayPlaneSupportedDisplaysKHR0(
		VkPhysicalDevice  physicalDevice,
		uint32_t  planeIndex,
		uint32_t*  pDisplayCount,
		VkDisplayKHR*  pDisplays);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkGetDisplayModePropertiesKHR(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     VkDisplayKHR                                display,
	 *     uint32_t*                                   pPropertyCount,
	 *     VkDisplayModePropertiesKHR*                 pProperties);
	 * </pre>
	 */
   public abstract VkResult vkGetDisplayModePropertiesKHR(
		VkPhysicalDevice  physicalDevice,
		VkDisplayKHR  display,
		uint32_t*  pPropertyCount,
		VkDisplayModePropertiesKHR*  pProperties);

    private static native VkResult vkGetDisplayModePropertiesKHR0(
		VkPhysicalDevice  physicalDevice,
		VkDisplayKHR  display,
		uint32_t*  pPropertyCount,
		VkDisplayModePropertiesKHR*  pProperties);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateDisplayModeKHR(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     VkDisplayKHR                                display,
	 *     const VkDisplayModeCreateInfoKHR*           pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkDisplayModeKHR*                           pMode);
	 * </pre>
	 */
   public abstract VkResult vkCreateDisplayModeKHR(
		VkPhysicalDevice  physicalDevice,
		VkDisplayKHR  display,
		const VkDisplayModeCreateInfoKHR*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkDisplayModeKHR*  pMode);

    private static native VkResult vkCreateDisplayModeKHR0(
		VkPhysicalDevice  physicalDevice,
		VkDisplayKHR  display,
		const VkDisplayModeCreateInfoKHR*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkDisplayModeKHR*  pMode);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkGetDisplayPlaneCapabilitiesKHR(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     VkDisplayModeKHR                            mode,
	 *     uint32_t                                    planeIndex,
	 *     VkDisplayPlaneCapabilitiesKHR*              pCapabilities);
	 * </pre>
	 */
   public abstract VkResult vkGetDisplayPlaneCapabilitiesKHR(
		VkPhysicalDevice  physicalDevice,
		VkDisplayModeKHR  mode,
		uint32_t  planeIndex,
		VkDisplayPlaneCapabilitiesKHR*  pCapabilities);

    private static native VkResult vkGetDisplayPlaneCapabilitiesKHR0(
		VkPhysicalDevice  physicalDevice,
		VkDisplayModeKHR  mode,
		uint32_t  planeIndex,
		VkDisplayPlaneCapabilitiesKHR*  pCapabilities);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateDisplayPlaneSurfaceKHR(
	 *     VkInstance                                  instance,
	 *     const VkDisplaySurfaceCreateInfoKHR*        pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkSurfaceKHR*                               pSurface);
	 * </pre>
	 */
   public abstract VkResult vkCreateDisplayPlaneSurfaceKHR(
		VkInstance  instance,
		const VkDisplaySurfaceCreateInfoKHR*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkSurfaceKHR*  pSurface);

    private static native VkResult vkCreateDisplayPlaneSurfaceKHR0(
		VkInstance  instance,
		const VkDisplaySurfaceCreateInfoKHR*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkSurfaceKHR*  pSurface);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateSharedSwapchainsKHR(
	 *     VkDevice                                    device,
	 *     uint32_t                                    swapchainCount,
	 *     const VkSwapchainCreateInfoKHR*             pCreateInfos,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkSwapchainKHR*                             pSwapchains);
	 * </pre>
	 */
   public abstract VkResult vkCreateSharedSwapchainsKHR(
		VkDevice  device,
		uint32_t  swapchainCount,
		const VkSwapchainCreateInfoKHR*  pCreateInfos,
		const VkAllocationCallbacks*  pAllocator,
		VkSwapchainKHR*  pSwapchains);

    private static native VkResult vkCreateSharedSwapchainsKHR0(
		VkDevice  device,
		uint32_t  swapchainCount,
		const VkSwapchainCreateInfoKHR*  pCreateInfos,
		const VkAllocationCallbacks*  pAllocator,
		VkSwapchainKHR*  pSwapchains);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateXlibSurfaceKHR(
	 *     VkInstance                                  instance,
	 *     const VkXlibSurfaceCreateInfoKHR*           pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkSurfaceKHR*                               pSurface);
	 * </pre>
	 */
   public abstract VkResult vkCreateXlibSurfaceKHR(
		VkInstance  instance,
		const VkXlibSurfaceCreateInfoKHR*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkSurfaceKHR*  pSurface);

    private static native VkResult vkCreateXlibSurfaceKHR0(
		VkInstance  instance,
		const VkXlibSurfaceCreateInfoKHR*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkSurfaceKHR*  pSurface);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkBool32 VKAPI_CALL vkGetPhysicalDeviceXlibPresentationSupportKHR(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     uint32_t                                    queueFamilyIndex,
	 *     Display*                                    dpy,
	 *     VisualID                                    visualID);
	 * </pre>
	 */
   public abstract VkBool32 vkGetPhysicalDeviceXlibPresentationSupportKHR(
		VkPhysicalDevice  physicalDevice,
		uint32_t  queueFamilyIndex,
		Display*  dpy,
		VisualID  visualID);

    private static native VkBool32 vkGetPhysicalDeviceXlibPresentationSupportKHR0(
		VkPhysicalDevice  physicalDevice,
		uint32_t  queueFamilyIndex,
		Display*  dpy,
		VisualID  visualID);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateXcbSurfaceKHR(
	 *     VkInstance                                  instance,
	 *     const VkXcbSurfaceCreateInfoKHR*            pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkSurfaceKHR*                               pSurface);
	 * </pre>
	 */
   public abstract VkResult vkCreateXcbSurfaceKHR(
		VkInstance  instance,
		const VkXcbSurfaceCreateInfoKHR*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkSurfaceKHR*  pSurface);

    private static native VkResult vkCreateXcbSurfaceKHR0(
		VkInstance  instance,
		const VkXcbSurfaceCreateInfoKHR*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkSurfaceKHR*  pSurface);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkBool32 VKAPI_CALL vkGetPhysicalDeviceXcbPresentationSupportKHR(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     uint32_t                                    queueFamilyIndex,
	 *     xcb_connection_t*                           connection,
	 *     xcb_visualid_t                              visual_id);
	 * </pre>
	 */
   public abstract VkBool32 vkGetPhysicalDeviceXcbPresentationSupportKHR(
		VkPhysicalDevice  physicalDevice,
		uint32_t  queueFamilyIndex,
		xcb_connection_t*  connection,
		xcb_visualid_t  visual_id);

    private static native VkBool32 vkGetPhysicalDeviceXcbPresentationSupportKHR0(
		VkPhysicalDevice  physicalDevice,
		uint32_t  queueFamilyIndex,
		xcb_connection_t*  connection,
		xcb_visualid_t  visual_id);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateWaylandSurfaceKHR(
	 *     VkInstance                                  instance,
	 *     const VkWaylandSurfaceCreateInfoKHR*        pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkSurfaceKHR*                               pSurface);
	 * </pre>
	 */
   public abstract VkResult vkCreateWaylandSurfaceKHR(
		VkInstance  instance,
		const VkWaylandSurfaceCreateInfoKHR*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkSurfaceKHR*  pSurface);

    private static native VkResult vkCreateWaylandSurfaceKHR0(
		VkInstance  instance,
		const VkWaylandSurfaceCreateInfoKHR*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkSurfaceKHR*  pSurface);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkBool32 VKAPI_CALL vkGetPhysicalDeviceWaylandPresentationSupportKHR(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     uint32_t                                    queueFamilyIndex,
	 *     struct wl_display*                          display);
	 * </pre>
	 */
   public abstract VkBool32 vkGetPhysicalDeviceWaylandPresentationSupportKHR(
		VkPhysicalDevice  physicalDevice,
		uint32_t  queueFamilyIndex,
		struct wl_display*  display);

    private static native VkBool32 vkGetPhysicalDeviceWaylandPresentationSupportKHR0(
		VkPhysicalDevice  physicalDevice,
		uint32_t  queueFamilyIndex,
		struct wl_display*  display);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateMirSurfaceKHR(
	 *     VkInstance                                  instance,
	 *     const VkMirSurfaceCreateInfoKHR*            pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkSurfaceKHR*                               pSurface);
	 * </pre>
	 */
   public abstract VkResult vkCreateMirSurfaceKHR(
		VkInstance  instance,
		const VkMirSurfaceCreateInfoKHR*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkSurfaceKHR*  pSurface);

    private static native VkResult vkCreateMirSurfaceKHR0(
		VkInstance  instance,
		const VkMirSurfaceCreateInfoKHR*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkSurfaceKHR*  pSurface);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkBool32 VKAPI_CALL vkGetPhysicalDeviceMirPresentationSupportKHR(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     uint32_t                                    queueFamilyIndex,
	 *     MirConnection*                              connection);
	 * </pre>
	 */
   public abstract VkBool32 vkGetPhysicalDeviceMirPresentationSupportKHR(
		VkPhysicalDevice  physicalDevice,
		uint32_t  queueFamilyIndex,
		MirConnection*  connection);

    private static native VkBool32 vkGetPhysicalDeviceMirPresentationSupportKHR0(
		VkPhysicalDevice  physicalDevice,
		uint32_t  queueFamilyIndex,
		MirConnection*  connection);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateAndroidSurfaceKHR(
	 *     VkInstance                                  instance,
	 *     const VkAndroidSurfaceCreateInfoKHR*        pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkSurfaceKHR*                               pSurface);
	 * </pre>
	 */
   public abstract VkResult vkCreateAndroidSurfaceKHR(
		VkInstance  instance,
		const VkAndroidSurfaceCreateInfoKHR*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkSurfaceKHR*  pSurface);

    private static native VkResult vkCreateAndroidSurfaceKHR0(
		VkInstance  instance,
		const VkAndroidSurfaceCreateInfoKHR*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkSurfaceKHR*  pSurface);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateWin32SurfaceKHR(
	 *     VkInstance                                  instance,
	 *     const VkWin32SurfaceCreateInfoKHR*          pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkSurfaceKHR*                               pSurface);
	 * </pre>
	 */
   public abstract VkResult vkCreateWin32SurfaceKHR(
		VkInstance  instance,
		const VkWin32SurfaceCreateInfoKHR*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkSurfaceKHR*  pSurface);

    private static native VkResult vkCreateWin32SurfaceKHR0(
		VkInstance  instance,
		const VkWin32SurfaceCreateInfoKHR*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkSurfaceKHR*  pSurface);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkBool32 VKAPI_CALL vkGetPhysicalDeviceWin32PresentationSupportKHR(
	 *     VkPhysicalDevice                            physicalDevice,
	 *     uint32_t                                    queueFamilyIndex);
	 * </pre>
	 */
   public abstract VkBool32 vkGetPhysicalDeviceWin32PresentationSupportKHR(
		VkPhysicalDevice  physicalDevice,
		uint32_t  queueFamilyIndex);

    private static native VkBool32 vkGetPhysicalDeviceWin32PresentationSupportKHR0(
		VkPhysicalDevice  physicalDevice,
		uint32_t  queueFamilyIndex);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR VkResult VKAPI_CALL vkCreateDebugReportCallbackEXT(
	 *     VkInstance                                  instance,
	 *     const VkDebugReportCallbackCreateInfoEXT*   pCreateInfo,
	 *     const VkAllocationCallbacks*                pAllocator,
	 *     VkDebugReportCallbackEXT*                   pCallback);
	 * </pre>
	 */
   public abstract VkResult vkCreateDebugReportCallbackEXT(
		VkInstance  instance,
		const VkDebugReportCallbackCreateInfoEXT*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkDebugReportCallbackEXT*  pCallback);

    private static native VkResult vkCreateDebugReportCallbackEXT0(
		VkInstance  instance,
		const VkDebugReportCallbackCreateInfoEXT*  pCreateInfo,
		const VkAllocationCallbacks*  pAllocator,
		VkDebugReportCallbackEXT*  pCallback);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkDestroyDebugReportCallbackEXT(
	 *     VkInstance                                  instance,
	 *     VkDebugReportCallbackEXT                    callback,
	 *     const VkAllocationCallbacks*                pAllocator);
	 * </pre>
	 */
   public abstract void vkDestroyDebugReportCallbackEXT(
		VkInstance  instance,
		VkDebugReportCallbackEXT  callback,
		const VkAllocationCallbacks*  pAllocator);

    private static native void vkDestroyDebugReportCallbackEXT0(
		VkInstance  instance,
		VkDebugReportCallbackEXT  callback,
		const VkAllocationCallbacks*  pAllocator);

	/////////////////////////////////////

	/**
	 * <h2>Prototype</h2><pre>
	 * VKAPI_ATTR void VKAPI_CALL vkDebugReportMessageEXT(
	 *     VkInstance                                  instance,
	 *     VkDebugReportFlagsEXT                       flags,
	 *     VkDebugReportObjectTypeEXT                  objectType,
	 *     uint64_t                                    object,
	 *     size_t                                      location,
	 *     int32_t                                     messageCode,
	 *     const char*                                 pLayerPrefix,
	 *     const char*                                 pMessage);
	 * </pre>
	 */
   public abstract void vkDebugReportMessageEXT(
		VkInstance  instance,
		VkDebugReportFlagsEXT  flags,
		VkDebugReportObjectTypeEXT  objectType,
		uint64_t  object,
		size_t  location,
		int32_t  messageCode,
		const char*  pLayerPrefix,
		const char*  pMessage);

    private static native void vkDebugReportMessageEXT0(
		VkInstance  instance,
		VkDebugReportFlagsEXT  flags,
		VkDebugReportObjectTypeEXT  objectType,
		uint64_t  object,
		size_t  location,
		int32_t  messageCode,
		const char*  pLayerPrefix,
		const char*  pMessage);

	/////////////////////////////////////



 }//end of Vk
