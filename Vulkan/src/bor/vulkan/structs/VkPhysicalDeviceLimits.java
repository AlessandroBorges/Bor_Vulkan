/**
 * Class wrapping Vulkan's VkPhysicalDeviceLimits struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.65 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
 package bor.vulkan.structs;

 import bor.util.*;
 import bor.vulkan.*;
 import static bor.vulkan.Vulkan.*; 
 import bor.vulkan.enumerations.*;

 import java.util.*;
 import java.nio.*;


/**
 *  Project Bor-Vulkan 
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkPhysicalDeviceLimits. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPhysicalDeviceLimits {
 *     uint32_t              maxImageDimension1D;
 *     uint32_t              maxImageDimension2D;
 *     uint32_t              maxImageDimension3D;
 *     uint32_t              maxImageDimensionCube;
 *     uint32_t              maxImageArrayLayers;
 *     uint32_t              maxTexelBufferElements;
 *     uint32_t              maxUniformBufferRange;
 *     uint32_t              maxStorageBufferRange;
 *     uint32_t              maxPushConstantsSize;
 *     uint32_t              maxMemoryAllocationCount;
 *     uint32_t              maxSamplerAllocationCount;
 *     VkDeviceSize          bufferImageGranularity;
 *     VkDeviceSize          sparseAddressSpaceSize;
 *     uint32_t              maxBoundDescriptorSets;
 *     uint32_t              maxPerStageDescriptorSamplers;
 *     uint32_t              maxPerStageDescriptorUniformBuffers;
 *     uint32_t              maxPerStageDescriptorStorageBuffers;
 *     uint32_t              maxPerStageDescriptorSampledImages;
 *     uint32_t              maxPerStageDescriptorStorageImages;
 *     uint32_t              maxPerStageDescriptorInputAttachments;
 *     uint32_t              maxPerStageResources;
 *     uint32_t              maxDescriptorSetSamplers;
 *     uint32_t              maxDescriptorSetUniformBuffers;
 *     uint32_t              maxDescriptorSetUniformBuffersDynamic;
 *     uint32_t              maxDescriptorSetStorageBuffers;
 *     uint32_t              maxDescriptorSetStorageBuffersDynamic;
 *     uint32_t              maxDescriptorSetSampledImages;
 *     uint32_t              maxDescriptorSetStorageImages;
 *     uint32_t              maxDescriptorSetInputAttachments;
 *     uint32_t              maxVertexInputAttributes;
 *     uint32_t              maxVertexInputBindings;
 *     uint32_t              maxVertexInputAttributeOffset;
 *     uint32_t              maxVertexInputBindingStride;
 *     uint32_t              maxVertexOutputComponents;
 *     uint32_t              maxTessellationGenerationLevel;
 *     uint32_t              maxTessellationPatchSize;
 *     uint32_t              maxTessellationControlPerVertexInputComponents;
 *     uint32_t              maxTessellationControlPerVertexOutputComponents;
 *     uint32_t              maxTessellationControlPerPatchOutputComponents;
 *     uint32_t              maxTessellationControlTotalOutputComponents;
 *     uint32_t              maxTessellationEvaluationInputComponents;
 *     uint32_t              maxTessellationEvaluationOutputComponents;
 *     uint32_t              maxGeometryShaderInvocations;
 *     uint32_t              maxGeometryInputComponents;
 *     uint32_t              maxGeometryOutputComponents;
 *     uint32_t              maxGeometryOutputVertices;
 *     uint32_t              maxGeometryTotalOutputComponents;
 *     uint32_t              maxFragmentInputComponents;
 *     uint32_t              maxFragmentOutputAttachments;
 *     uint32_t              maxFragmentDualSrcAttachments;
 *     uint32_t              maxFragmentCombinedOutputResources;
 *     uint32_t              maxComputeSharedMemorySize;
 *     uint32_t              maxComputeWorkGroupCount[3];
 *     uint32_t              maxComputeWorkGroupInvocations;
 *     uint32_t              maxComputeWorkGroupSize[3];
 *     uint32_t              subPixelPrecisionBits;
 *     uint32_t              subTexelPrecisionBits;
 *     uint32_t              mipmapPrecisionBits;
 *     uint32_t              maxDrawIndexedIndexValue;
 *     uint32_t              maxDrawIndirectCount;
 *     float                 maxSamplerLodBias;
 *     float                 maxSamplerAnisotropy;
 *     uint32_t              maxViewports;
 *     uint32_t              maxViewportDimensions[2];
 *     float                 viewportBoundsRange[2];
 *     uint32_t              viewportSubPixelBits;
 *     size_t                minMemoryMapAlignment;
 *     VkDeviceSize          minTexelBufferOffsetAlignment;
 *     VkDeviceSize          minUniformBufferOffsetAlignment;
 *     VkDeviceSize          minStorageBufferOffsetAlignment;
 *     int32_t               minTexelOffset;
 *     uint32_t              maxTexelOffset;
 *     int32_t               minTexelGatherOffset;
 *     uint32_t              maxTexelGatherOffset;
 *     float                 minInterpolationOffset;
 *     float                 maxInterpolationOffset;
 *     uint32_t              subPixelInterpolationOffsetBits;
 *     uint32_t              maxFramebufferWidth;
 *     uint32_t              maxFramebufferHeight;
 *     uint32_t              maxFramebufferLayers;
 *     VkSampleCountFlags    framebufferColorSampleCounts;
 *     VkSampleCountFlags    framebufferDepthSampleCounts;
 *     VkSampleCountFlags    framebufferStencilSampleCounts;
 *     VkSampleCountFlags    framebufferNoAttachmentsSampleCounts;
 *     uint32_t              maxColorAttachments;
 *     VkSampleCountFlags    sampledImageColorSampleCounts;
 *     VkSampleCountFlags    sampledImageIntegerSampleCounts;
 *     VkSampleCountFlags    sampledImageDepthSampleCounts;
 *     VkSampleCountFlags    sampledImageStencilSampleCounts;
 *     VkSampleCountFlags    storageImageSampleCounts;
 *     uint32_t              maxSampleMaskWords;
 *     VkBool32              timestampComputeAndGraphics;
 *     float                 timestampPeriod;
 *     uint32_t              maxClipDistances;
 *     uint32_t              maxCullDistances;
 *     uint32_t              maxCombinedClipAndCullDistances;
 *     uint32_t              discreteQueuePriorities;
 *     float                 pointSizeRange[2];
 *     float                 lineWidthRange[2];
 *     float                 pointSizeGranularity;
 *     float                 lineWidthGranularity;
 *     VkBool32              strictLines;
 *     VkBool32              standardSampleLocations;
 *     VkDeviceSize          optimalBufferCopyOffsetAlignment;
 *     VkDeviceSize          optimalBufferCopyRowPitchAlignment;
 *     VkDeviceSize          nonCoherentAtomSize;
 * } VkPhysicalDeviceLimits;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkPhysicalDeviceLimits extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [8]  */
	 private static final String TAG = "VkPhysicalDeviceLimits";

	/** ID of this structure [8]  */
	 public static final int TAG_ID = VKPHYSICALDEVICELIMITS_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  uint32_t 	maxImageDimension1D	[int]
	 */ 
	int 	maxImageDimension1D;
	
	/**
	 *  uint32_t 	maxImageDimension2D	[int]
	 */ 
	int 	maxImageDimension2D;
	
	/**
	 *  uint32_t 	maxImageDimension3D	[int]
	 */ 
	int 	maxImageDimension3D;
	
	/**
	 *  uint32_t 	maxImageDimensionCube	[int]
	 */ 
	int 	maxImageDimensionCube;
	
	/**
	 *  uint32_t 	maxImageArrayLayers	[int]
	 */ 
	int 	maxImageArrayLayers;
	
	/**
	 *  uint32_t 	maxTexelBufferElements	[int]
	 */ 
	int 	maxTexelBufferElements;
	
	/**
	 *  uint32_t 	maxUniformBufferRange	[int]
	 */ 
	int 	maxUniformBufferRange;
	
	/**
	 *  uint32_t 	maxStorageBufferRange	[int]
	 */ 
	int 	maxStorageBufferRange;
	
	/**
	 *  uint32_t 	maxPushConstantsSize	[int]
	 */ 
	int 	maxPushConstantsSize;
	
	/**
	 *  uint32_t 	maxMemoryAllocationCount	[int]
	 */ 
	int 	maxMemoryAllocationCount;
	
	/**
	 *  uint32_t 	maxSamplerAllocationCount	[int]
	 */ 
	int 	maxSamplerAllocationCount;
	
	/**
	 *  VkDeviceSize 	bufferImageGranularity	[long]
	 */ 
	long 	bufferImageGranularity;
	
	/**
	 *  VkDeviceSize 	sparseAddressSpaceSize	[long]
	 */ 
	long 	sparseAddressSpaceSize;
	
	/**
	 *  uint32_t 	maxBoundDescriptorSets	[int]
	 */ 
	int 	maxBoundDescriptorSets;
	
	/**
	 *  uint32_t 	maxPerStageDescriptorSamplers	[int]
	 */ 
	int 	maxPerStageDescriptorSamplers;
	
	/**
	 *  uint32_t 	maxPerStageDescriptorUniformBuffers	[int]
	 */ 
	int 	maxPerStageDescriptorUniformBuffers;
	
	/**
	 *  uint32_t 	maxPerStageDescriptorStorageBuffers	[int]
	 */ 
	int 	maxPerStageDescriptorStorageBuffers;
	
	/**
	 *  uint32_t 	maxPerStageDescriptorSampledImages	[int]
	 */ 
	int 	maxPerStageDescriptorSampledImages;
	
	/**
	 *  uint32_t 	maxPerStageDescriptorStorageImages	[int]
	 */ 
	int 	maxPerStageDescriptorStorageImages;
	
	/**
	 *  uint32_t 	maxPerStageDescriptorInputAttachments	[int]
	 */ 
	int 	maxPerStageDescriptorInputAttachments;
	
	/**
	 *  uint32_t 	maxPerStageResources	[int]
	 */ 
	int 	maxPerStageResources;
	
	/**
	 *  uint32_t 	maxDescriptorSetSamplers	[int]
	 */ 
	int 	maxDescriptorSetSamplers;
	
	/**
	 *  uint32_t 	maxDescriptorSetUniformBuffers	[int]
	 */ 
	int 	maxDescriptorSetUniformBuffers;
	
	/**
	 *  uint32_t 	maxDescriptorSetUniformBuffersDynamic	[int]
	 */ 
	int 	maxDescriptorSetUniformBuffersDynamic;
	
	/**
	 *  uint32_t 	maxDescriptorSetStorageBuffers	[int]
	 */ 
	int 	maxDescriptorSetStorageBuffers;
	
	/**
	 *  uint32_t 	maxDescriptorSetStorageBuffersDynamic	[int]
	 */ 
	int 	maxDescriptorSetStorageBuffersDynamic;
	
	/**
	 *  uint32_t 	maxDescriptorSetSampledImages	[int]
	 */ 
	int 	maxDescriptorSetSampledImages;
	
	/**
	 *  uint32_t 	maxDescriptorSetStorageImages	[int]
	 */ 
	int 	maxDescriptorSetStorageImages;
	
	/**
	 *  uint32_t 	maxDescriptorSetInputAttachments	[int]
	 */ 
	int 	maxDescriptorSetInputAttachments;
	
	/**
	 *  uint32_t 	maxVertexInputAttributes	[int]
	 */ 
	int 	maxVertexInputAttributes;
	
	/**
	 *  uint32_t 	maxVertexInputBindings	[int]
	 */ 
	int 	maxVertexInputBindings;
	
	/**
	 *  uint32_t 	maxVertexInputAttributeOffset	[int]
	 */ 
	int 	maxVertexInputAttributeOffset;
	
	/**
	 *  uint32_t 	maxVertexInputBindingStride	[int]
	 */ 
	int 	maxVertexInputBindingStride;
	
	/**
	 *  uint32_t 	maxVertexOutputComponents	[int]
	 */ 
	int 	maxVertexOutputComponents;
	
	/**
	 *  uint32_t 	maxTessellationGenerationLevel	[int]
	 */ 
	int 	maxTessellationGenerationLevel;
	
	/**
	 *  uint32_t 	maxTessellationPatchSize	[int]
	 */ 
	int 	maxTessellationPatchSize;
	
	/**
	 *  uint32_t 	maxTessellationControlPerVertexInputComponents	[int]
	 */ 
	int 	maxTessellationControlPerVertexInputComponents;
	
	/**
	 *  uint32_t 	maxTessellationControlPerVertexOutputComponents	[int]
	 */ 
	int 	maxTessellationControlPerVertexOutputComponents;
	
	/**
	 *  uint32_t 	maxTessellationControlPerPatchOutputComponents	[int]
	 */ 
	int 	maxTessellationControlPerPatchOutputComponents;
	
	/**
	 *  uint32_t 	maxTessellationControlTotalOutputComponents	[int]
	 */ 
	int 	maxTessellationControlTotalOutputComponents;
	
	/**
	 *  uint32_t 	maxTessellationEvaluationInputComponents	[int]
	 */ 
	int 	maxTessellationEvaluationInputComponents;
	
	/**
	 *  uint32_t 	maxTessellationEvaluationOutputComponents	[int]
	 */ 
	int 	maxTessellationEvaluationOutputComponents;
	
	/**
	 *  uint32_t 	maxGeometryShaderInvocations	[int]
	 */ 
	int 	maxGeometryShaderInvocations;
	
	/**
	 *  uint32_t 	maxGeometryInputComponents	[int]
	 */ 
	int 	maxGeometryInputComponents;
	
	/**
	 *  uint32_t 	maxGeometryOutputComponents	[int]
	 */ 
	int 	maxGeometryOutputComponents;
	
	/**
	 *  uint32_t 	maxGeometryOutputVertices	[int]
	 */ 
	int 	maxGeometryOutputVertices;
	
	/**
	 *  uint32_t 	maxGeometryTotalOutputComponents	[int]
	 */ 
	int 	maxGeometryTotalOutputComponents;
	
	/**
	 *  uint32_t 	maxFragmentInputComponents	[int]
	 */ 
	int 	maxFragmentInputComponents;
	
	/**
	 *  uint32_t 	maxFragmentOutputAttachments	[int]
	 */ 
	int 	maxFragmentOutputAttachments;
	
	/**
	 *  uint32_t 	maxFragmentDualSrcAttachments	[int]
	 */ 
	int 	maxFragmentDualSrcAttachments;
	
	/**
	 *  uint32_t 	maxFragmentCombinedOutputResources	[int]
	 */ 
	int 	maxFragmentCombinedOutputResources;
	
	/**
	 *  uint32_t 	maxComputeSharedMemorySize	[int]
	 */ 
	int 	maxComputeSharedMemorySize;
	
	/**
	 *  uint32_t[] 	maxComputeWorkGroupCount	[int_array [3] ]
	 */ 
	int[] 	maxComputeWorkGroupCount = new int[3];
	
	/**
	 *  uint32_t 	maxComputeWorkGroupInvocations	[int]
	 */ 
	int 	maxComputeWorkGroupInvocations;
	
	/**
	 *  uint32_t[] 	maxComputeWorkGroupSize	[int_array [3] ]
	 */ 
	int[] 	maxComputeWorkGroupSize = new int[3];
	
	/**
	 *  uint32_t 	subPixelPrecisionBits	[int]
	 */ 
	int 	subPixelPrecisionBits;
	
	/**
	 *  uint32_t 	subTexelPrecisionBits	[int]
	 */ 
	int 	subTexelPrecisionBits;
	
	/**
	 *  uint32_t 	mipmapPrecisionBits	[int]
	 */ 
	int 	mipmapPrecisionBits;
	
	/**
	 *  uint32_t 	maxDrawIndexedIndexValue	[int]
	 */ 
	int 	maxDrawIndexedIndexValue;
	
	/**
	 *  uint32_t 	maxDrawIndirectCount	[int]
	 */ 
	int 	maxDrawIndirectCount;
	
	/**
	 *  float 	maxSamplerLodBias	[float]
	 */ 
	float 	maxSamplerLodBias;
	
	/**
	 *  float 	maxSamplerAnisotropy	[float]
	 */ 
	float 	maxSamplerAnisotropy;
	
	/**
	 *  uint32_t 	maxViewports	[int]
	 */ 
	int 	maxViewports;
	
	/**
	 *  uint32_t[] 	maxViewportDimensions	[int_array [2] ]
	 */ 
	int[] 	maxViewportDimensions = new int[2];
	
	/**
	 *  float[] 	viewportBoundsRange	[float_array [2] ]
	 */ 
	float[] 	viewportBoundsRange = new float[2];
	
	/**
	 *  uint32_t 	viewportSubPixelBits	[int]
	 */ 
	int 	viewportSubPixelBits;
	
	/**
	 *  size_t 	minMemoryMapAlignment	[long]
	 */ 
	long 	minMemoryMapAlignment;
	
	/**
	 *  VkDeviceSize 	minTexelBufferOffsetAlignment	[long]
	 */ 
	long 	minTexelBufferOffsetAlignment;
	
	/**
	 *  VkDeviceSize 	minUniformBufferOffsetAlignment	[long]
	 */ 
	long 	minUniformBufferOffsetAlignment;
	
	/**
	 *  VkDeviceSize 	minStorageBufferOffsetAlignment	[long]
	 */ 
	long 	minStorageBufferOffsetAlignment;
	
	/**
	 *  int32_t 	minTexelOffset	[int]
	 */ 
	int 	minTexelOffset;
	
	/**
	 *  uint32_t 	maxTexelOffset	[int]
	 */ 
	int 	maxTexelOffset;
	
	/**
	 *  int32_t 	minTexelGatherOffset	[int]
	 */ 
	int 	minTexelGatherOffset;
	
	/**
	 *  uint32_t 	maxTexelGatherOffset	[int]
	 */ 
	int 	maxTexelGatherOffset;
	
	/**
	 *  float 	minInterpolationOffset	[float]
	 */ 
	float 	minInterpolationOffset;
	
	/**
	 *  float 	maxInterpolationOffset	[float]
	 */ 
	float 	maxInterpolationOffset;
	
	/**
	 *  uint32_t 	subPixelInterpolationOffsetBits	[int]
	 */ 
	int 	subPixelInterpolationOffsetBits;
	
	/**
	 *  uint32_t 	maxFramebufferWidth	[int]
	 */ 
	int 	maxFramebufferWidth;
	
	/**
	 *  uint32_t 	maxFramebufferHeight	[int]
	 */ 
	int 	maxFramebufferHeight;
	
	/**
	 *  uint32_t 	maxFramebufferLayers	[int]
	 */ 
	int 	maxFramebufferLayers;
	
	/**
	 *  VkSampleCountFlags 	framebufferColorSampleCounts	[int]
	 */ 
	int 	framebufferColorSampleCounts;
	
	/**
	 *  VkSampleCountFlags 	framebufferDepthSampleCounts	[int]
	 */ 
	int 	framebufferDepthSampleCounts;
	
	/**
	 *  VkSampleCountFlags 	framebufferStencilSampleCounts	[int]
	 */ 
	int 	framebufferStencilSampleCounts;
	
	/**
	 *  VkSampleCountFlags 	framebufferNoAttachmentsSampleCounts	[int]
	 */ 
	int 	framebufferNoAttachmentsSampleCounts;
	
	/**
	 *  uint32_t 	maxColorAttachments	[int]
	 */ 
	int 	maxColorAttachments;
	
	/**
	 *  VkSampleCountFlags 	sampledImageColorSampleCounts	[int]
	 */ 
	int 	sampledImageColorSampleCounts;
	
	/**
	 *  VkSampleCountFlags 	sampledImageIntegerSampleCounts	[int]
	 */ 
	int 	sampledImageIntegerSampleCounts;
	
	/**
	 *  VkSampleCountFlags 	sampledImageDepthSampleCounts	[int]
	 */ 
	int 	sampledImageDepthSampleCounts;
	
	/**
	 *  VkSampleCountFlags 	sampledImageStencilSampleCounts	[int]
	 */ 
	int 	sampledImageStencilSampleCounts;
	
	/**
	 *  VkSampleCountFlags 	storageImageSampleCounts	[int]
	 */ 
	int 	storageImageSampleCounts;
	
	/**
	 *  uint32_t 	maxSampleMaskWords	[int]
	 */ 
	int 	maxSampleMaskWords;
	
	/**
	 *  VkBool32 	timestampComputeAndGraphics	[boolean]
	 */ 
	boolean 	timestampComputeAndGraphics;
	
	/**
	 *  float 	timestampPeriod	[float]
	 */ 
	float 	timestampPeriod;
	
	/**
	 *  uint32_t 	maxClipDistances	[int]
	 */ 
	int 	maxClipDistances;
	
	/**
	 *  uint32_t 	maxCullDistances	[int]
	 */ 
	int 	maxCullDistances;
	
	/**
	 *  uint32_t 	maxCombinedClipAndCullDistances	[int]
	 */ 
	int 	maxCombinedClipAndCullDistances;
	
	/**
	 *  uint32_t 	discreteQueuePriorities	[int]
	 */ 
	int 	discreteQueuePriorities;
	
	/**
	 *  float[] 	pointSizeRange	[float_array [2] ]
	 */ 
	float[] 	pointSizeRange = new float[2];
	
	/**
	 *  float[] 	lineWidthRange	[float_array [2] ]
	 */ 
	float[] 	lineWidthRange = new float[2];
	
	/**
	 *  float 	pointSizeGranularity	[float]
	 */ 
	float 	pointSizeGranularity;
	
	/**
	 *  float 	lineWidthGranularity	[float]
	 */ 
	float 	lineWidthGranularity;
	
	/**
	 *  VkBool32 	strictLines	[boolean]
	 */ 
	boolean 	strictLines;
	
	/**
	 *  VkBool32 	standardSampleLocations	[boolean]
	 */ 
	boolean 	standardSampleLocations;
	
	/**
	 *  VkDeviceSize 	optimalBufferCopyOffsetAlignment	[long]
	 */ 
	long 	optimalBufferCopyOffsetAlignment;
	
	/**
	 *  VkDeviceSize 	optimalBufferCopyRowPitchAlignment	[long]
	 */ 
	long 	optimalBufferCopyRowPitchAlignment;
	
	/**
	 *  VkDeviceSize 	nonCoherentAtomSize	[long]
	 */ 
	long 	nonCoherentAtomSize;
	/**
	 * Ctor
	 */
	public VkPhysicalDeviceLimits(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPhysicalDeviceLimits(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPhysicalDeviceLimits(long address){ 
		 super(address); 
	 }

	/** 
	 * Static Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}

	/** 
	 * Method to get native size of this structure 
	 */
	 @Override
	 public int getSizeBytes(){ 
		 return sizeOf(); 
	}

	/** 
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field maxImageDimension1D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension1D
	 * 
	 * @param maxImageDimension1D - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxImageDimension1D(int maxImageDimension1D){
		 this.maxImageDimension1D = maxImageDimension1D;
		 setMaxImageDimension1D0(this.ptr,  maxImageDimension1D);
		 return this;
	 }

	/**
	 * Get method for field maxImageDimension1D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension1D
	 */ 
	 public int maxImageDimension1D(){
		 int var = getMaxImageDimension1D0(super.ptr);
		 this.maxImageDimension1D = var;
		 return this.maxImageDimension1D;
	 }

	/**
	 * Set method for field maxImageDimension2D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension2D
	 * 
	 * @param maxImageDimension2D - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxImageDimension2D(int maxImageDimension2D){
		 this.maxImageDimension2D = maxImageDimension2D;
		 setMaxImageDimension2D0(this.ptr,  maxImageDimension2D);
		 return this;
	 }

	/**
	 * Get method for field maxImageDimension2D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension2D
	 */ 
	 public int maxImageDimension2D(){
		 int var = getMaxImageDimension2D0(super.ptr);
		 this.maxImageDimension2D = var;
		 return this.maxImageDimension2D;
	 }

	/**
	 * Set method for field maxImageDimension3D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension3D
	 * 
	 * @param maxImageDimension3D - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxImageDimension3D(int maxImageDimension3D){
		 this.maxImageDimension3D = maxImageDimension3D;
		 setMaxImageDimension3D0(this.ptr,  maxImageDimension3D);
		 return this;
	 }

	/**
	 * Get method for field maxImageDimension3D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension3D
	 */ 
	 public int maxImageDimension3D(){
		 int var = getMaxImageDimension3D0(super.ptr);
		 this.maxImageDimension3D = var;
		 return this.maxImageDimension3D;
	 }

	/**
	 * Set method for field maxImageDimensionCube	[int]<br>
	 * Prototype: uint32_t  maxImageDimensionCube
	 * 
	 * @param maxImageDimensionCube - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxImageDimensionCube(int maxImageDimensionCube){
		 this.maxImageDimensionCube = maxImageDimensionCube;
		 setMaxImageDimensionCube0(this.ptr,  maxImageDimensionCube);
		 return this;
	 }

	/**
	 * Get method for field maxImageDimensionCube	[int]<br>
	 * Prototype: uint32_t  maxImageDimensionCube
	 */ 
	 public int maxImageDimensionCube(){
		 int var = getMaxImageDimensionCube0(super.ptr);
		 this.maxImageDimensionCube = var;
		 return this.maxImageDimensionCube;
	 }

	/**
	 * Set method for field maxImageArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxImageArrayLayers
	 * 
	 * @param maxImageArrayLayers - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxImageArrayLayers(int maxImageArrayLayers){
		 this.maxImageArrayLayers = maxImageArrayLayers;
		 setMaxImageArrayLayers0(this.ptr,  maxImageArrayLayers);
		 return this;
	 }

	/**
	 * Get method for field maxImageArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxImageArrayLayers
	 */ 
	 public int maxImageArrayLayers(){
		 int var = getMaxImageArrayLayers0(super.ptr);
		 this.maxImageArrayLayers = var;
		 return this.maxImageArrayLayers;
	 }

	/**
	 * Set method for field maxTexelBufferElements	[int]<br>
	 * Prototype: uint32_t  maxTexelBufferElements
	 * 
	 * @param maxTexelBufferElements - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxTexelBufferElements(int maxTexelBufferElements){
		 this.maxTexelBufferElements = maxTexelBufferElements;
		 setMaxTexelBufferElements0(this.ptr,  maxTexelBufferElements);
		 return this;
	 }

	/**
	 * Get method for field maxTexelBufferElements	[int]<br>
	 * Prototype: uint32_t  maxTexelBufferElements
	 */ 
	 public int maxTexelBufferElements(){
		 int var = getMaxTexelBufferElements0(super.ptr);
		 this.maxTexelBufferElements = var;
		 return this.maxTexelBufferElements;
	 }

	/**
	 * Set method for field maxUniformBufferRange	[int]<br>
	 * Prototype: uint32_t  maxUniformBufferRange
	 * 
	 * @param maxUniformBufferRange - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxUniformBufferRange(int maxUniformBufferRange){
		 this.maxUniformBufferRange = maxUniformBufferRange;
		 setMaxUniformBufferRange0(this.ptr,  maxUniformBufferRange);
		 return this;
	 }

	/**
	 * Get method for field maxUniformBufferRange	[int]<br>
	 * Prototype: uint32_t  maxUniformBufferRange
	 */ 
	 public int maxUniformBufferRange(){
		 int var = getMaxUniformBufferRange0(super.ptr);
		 this.maxUniformBufferRange = var;
		 return this.maxUniformBufferRange;
	 }

	/**
	 * Set method for field maxStorageBufferRange	[int]<br>
	 * Prototype: uint32_t  maxStorageBufferRange
	 * 
	 * @param maxStorageBufferRange - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxStorageBufferRange(int maxStorageBufferRange){
		 this.maxStorageBufferRange = maxStorageBufferRange;
		 setMaxStorageBufferRange0(this.ptr,  maxStorageBufferRange);
		 return this;
	 }

	/**
	 * Get method for field maxStorageBufferRange	[int]<br>
	 * Prototype: uint32_t  maxStorageBufferRange
	 */ 
	 public int maxStorageBufferRange(){
		 int var = getMaxStorageBufferRange0(super.ptr);
		 this.maxStorageBufferRange = var;
		 return this.maxStorageBufferRange;
	 }

	/**
	 * Set method for field maxPushConstantsSize	[int]<br>
	 * Prototype: uint32_t  maxPushConstantsSize
	 * 
	 * @param maxPushConstantsSize - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxPushConstantsSize(int maxPushConstantsSize){
		 this.maxPushConstantsSize = maxPushConstantsSize;
		 setMaxPushConstantsSize0(this.ptr,  maxPushConstantsSize);
		 return this;
	 }

	/**
	 * Get method for field maxPushConstantsSize	[int]<br>
	 * Prototype: uint32_t  maxPushConstantsSize
	 */ 
	 public int maxPushConstantsSize(){
		 int var = getMaxPushConstantsSize0(super.ptr);
		 this.maxPushConstantsSize = var;
		 return this.maxPushConstantsSize;
	 }

	/**
	 * Set method for field maxMemoryAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxMemoryAllocationCount
	 * 
	 * @param maxMemoryAllocationCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxMemoryAllocationCount(int maxMemoryAllocationCount){
		 this.maxMemoryAllocationCount = maxMemoryAllocationCount;
		 setMaxMemoryAllocationCount0(this.ptr,  maxMemoryAllocationCount);
		 return this;
	 }

	/**
	 * Get method for field maxMemoryAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxMemoryAllocationCount
	 */ 
	 public int maxMemoryAllocationCount(){
		 int var = getMaxMemoryAllocationCount0(super.ptr);
		 this.maxMemoryAllocationCount = var;
		 return this.maxMemoryAllocationCount;
	 }

	/**
	 * Set method for field maxSamplerAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxSamplerAllocationCount
	 * 
	 * @param maxSamplerAllocationCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxSamplerAllocationCount(int maxSamplerAllocationCount){
		 this.maxSamplerAllocationCount = maxSamplerAllocationCount;
		 setMaxSamplerAllocationCount0(this.ptr,  maxSamplerAllocationCount);
		 return this;
	 }

	/**
	 * Get method for field maxSamplerAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxSamplerAllocationCount
	 */ 
	 public int maxSamplerAllocationCount(){
		 int var = getMaxSamplerAllocationCount0(super.ptr);
		 this.maxSamplerAllocationCount = var;
		 return this.maxSamplerAllocationCount;
	 }

	/**
	 * Set method for field bufferImageGranularity	[long]<br>
	 * Prototype: VkDeviceSize  bufferImageGranularity
	 * 
	 * @param bufferImageGranularity - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits bufferImageGranularity(long bufferImageGranularity){
		 this.bufferImageGranularity = bufferImageGranularity;
		 setBufferImageGranularity0(this.ptr,  bufferImageGranularity);
		 return this;
	 }

	/**
	 * Get method for field bufferImageGranularity	[long]<br>
	 * Prototype: VkDeviceSize  bufferImageGranularity
	 */ 
	 public long bufferImageGranularity(){
		 long var = getBufferImageGranularity0(super.ptr);
		 this.bufferImageGranularity = var;
		 return this.bufferImageGranularity;
	 }

	/**
	 * Set method for field sparseAddressSpaceSize	[long]<br>
	 * Prototype: VkDeviceSize  sparseAddressSpaceSize
	 * 
	 * @param sparseAddressSpaceSize - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits sparseAddressSpaceSize(long sparseAddressSpaceSize){
		 this.sparseAddressSpaceSize = sparseAddressSpaceSize;
		 setSparseAddressSpaceSize0(this.ptr,  sparseAddressSpaceSize);
		 return this;
	 }

	/**
	 * Get method for field sparseAddressSpaceSize	[long]<br>
	 * Prototype: VkDeviceSize  sparseAddressSpaceSize
	 */ 
	 public long sparseAddressSpaceSize(){
		 long var = getSparseAddressSpaceSize0(super.ptr);
		 this.sparseAddressSpaceSize = var;
		 return this.sparseAddressSpaceSize;
	 }

	/**
	 * Set method for field maxBoundDescriptorSets	[int]<br>
	 * Prototype: uint32_t  maxBoundDescriptorSets
	 * 
	 * @param maxBoundDescriptorSets - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxBoundDescriptorSets(int maxBoundDescriptorSets){
		 this.maxBoundDescriptorSets = maxBoundDescriptorSets;
		 setMaxBoundDescriptorSets0(this.ptr,  maxBoundDescriptorSets);
		 return this;
	 }

	/**
	 * Get method for field maxBoundDescriptorSets	[int]<br>
	 * Prototype: uint32_t  maxBoundDescriptorSets
	 */ 
	 public int maxBoundDescriptorSets(){
		 int var = getMaxBoundDescriptorSets0(super.ptr);
		 this.maxBoundDescriptorSets = var;
		 return this.maxBoundDescriptorSets;
	 }

	/**
	 * Set method for field maxPerStageDescriptorSamplers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSamplers
	 * 
	 * @param maxPerStageDescriptorSamplers - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxPerStageDescriptorSamplers(int maxPerStageDescriptorSamplers){
		 this.maxPerStageDescriptorSamplers = maxPerStageDescriptorSamplers;
		 setMaxPerStageDescriptorSamplers0(this.ptr,  maxPerStageDescriptorSamplers);
		 return this;
	 }

	/**
	 * Get method for field maxPerStageDescriptorSamplers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSamplers
	 */ 
	 public int maxPerStageDescriptorSamplers(){
		 int var = getMaxPerStageDescriptorSamplers0(super.ptr);
		 this.maxPerStageDescriptorSamplers = var;
		 return this.maxPerStageDescriptorSamplers;
	 }

	/**
	 * Set method for field maxPerStageDescriptorUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorUniformBuffers
	 * 
	 * @param maxPerStageDescriptorUniformBuffers - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxPerStageDescriptorUniformBuffers(int maxPerStageDescriptorUniformBuffers){
		 this.maxPerStageDescriptorUniformBuffers = maxPerStageDescriptorUniformBuffers;
		 setMaxPerStageDescriptorUniformBuffers0(this.ptr,  maxPerStageDescriptorUniformBuffers);
		 return this;
	 }

	/**
	 * Get method for field maxPerStageDescriptorUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorUniformBuffers
	 */ 
	 public int maxPerStageDescriptorUniformBuffers(){
		 int var = getMaxPerStageDescriptorUniformBuffers0(super.ptr);
		 this.maxPerStageDescriptorUniformBuffers = var;
		 return this.maxPerStageDescriptorUniformBuffers;
	 }

	/**
	 * Set method for field maxPerStageDescriptorStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageBuffers
	 * 
	 * @param maxPerStageDescriptorStorageBuffers - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxPerStageDescriptorStorageBuffers(int maxPerStageDescriptorStorageBuffers){
		 this.maxPerStageDescriptorStorageBuffers = maxPerStageDescriptorStorageBuffers;
		 setMaxPerStageDescriptorStorageBuffers0(this.ptr,  maxPerStageDescriptorStorageBuffers);
		 return this;
	 }

	/**
	 * Get method for field maxPerStageDescriptorStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageBuffers
	 */ 
	 public int maxPerStageDescriptorStorageBuffers(){
		 int var = getMaxPerStageDescriptorStorageBuffers0(super.ptr);
		 this.maxPerStageDescriptorStorageBuffers = var;
		 return this.maxPerStageDescriptorStorageBuffers;
	 }

	/**
	 * Set method for field maxPerStageDescriptorSampledImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSampledImages
	 * 
	 * @param maxPerStageDescriptorSampledImages - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxPerStageDescriptorSampledImages(int maxPerStageDescriptorSampledImages){
		 this.maxPerStageDescriptorSampledImages = maxPerStageDescriptorSampledImages;
		 setMaxPerStageDescriptorSampledImages0(this.ptr,  maxPerStageDescriptorSampledImages);
		 return this;
	 }

	/**
	 * Get method for field maxPerStageDescriptorSampledImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSampledImages
	 */ 
	 public int maxPerStageDescriptorSampledImages(){
		 int var = getMaxPerStageDescriptorSampledImages0(super.ptr);
		 this.maxPerStageDescriptorSampledImages = var;
		 return this.maxPerStageDescriptorSampledImages;
	 }

	/**
	 * Set method for field maxPerStageDescriptorStorageImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageImages
	 * 
	 * @param maxPerStageDescriptorStorageImages - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxPerStageDescriptorStorageImages(int maxPerStageDescriptorStorageImages){
		 this.maxPerStageDescriptorStorageImages = maxPerStageDescriptorStorageImages;
		 setMaxPerStageDescriptorStorageImages0(this.ptr,  maxPerStageDescriptorStorageImages);
		 return this;
	 }

	/**
	 * Get method for field maxPerStageDescriptorStorageImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageImages
	 */ 
	 public int maxPerStageDescriptorStorageImages(){
		 int var = getMaxPerStageDescriptorStorageImages0(super.ptr);
		 this.maxPerStageDescriptorStorageImages = var;
		 return this.maxPerStageDescriptorStorageImages;
	 }

	/**
	 * Set method for field maxPerStageDescriptorInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorInputAttachments
	 * 
	 * @param maxPerStageDescriptorInputAttachments - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxPerStageDescriptorInputAttachments(int maxPerStageDescriptorInputAttachments){
		 this.maxPerStageDescriptorInputAttachments = maxPerStageDescriptorInputAttachments;
		 setMaxPerStageDescriptorInputAttachments0(this.ptr,  maxPerStageDescriptorInputAttachments);
		 return this;
	 }

	/**
	 * Get method for field maxPerStageDescriptorInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorInputAttachments
	 */ 
	 public int maxPerStageDescriptorInputAttachments(){
		 int var = getMaxPerStageDescriptorInputAttachments0(super.ptr);
		 this.maxPerStageDescriptorInputAttachments = var;
		 return this.maxPerStageDescriptorInputAttachments;
	 }

	/**
	 * Set method for field maxPerStageResources	[int]<br>
	 * Prototype: uint32_t  maxPerStageResources
	 * 
	 * @param maxPerStageResources - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxPerStageResources(int maxPerStageResources){
		 this.maxPerStageResources = maxPerStageResources;
		 setMaxPerStageResources0(this.ptr,  maxPerStageResources);
		 return this;
	 }

	/**
	 * Get method for field maxPerStageResources	[int]<br>
	 * Prototype: uint32_t  maxPerStageResources
	 */ 
	 public int maxPerStageResources(){
		 int var = getMaxPerStageResources0(super.ptr);
		 this.maxPerStageResources = var;
		 return this.maxPerStageResources;
	 }

	/**
	 * Set method for field maxDescriptorSetSamplers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSamplers
	 * 
	 * @param maxDescriptorSetSamplers - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxDescriptorSetSamplers(int maxDescriptorSetSamplers){
		 this.maxDescriptorSetSamplers = maxDescriptorSetSamplers;
		 setMaxDescriptorSetSamplers0(this.ptr,  maxDescriptorSetSamplers);
		 return this;
	 }

	/**
	 * Get method for field maxDescriptorSetSamplers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSamplers
	 */ 
	 public int maxDescriptorSetSamplers(){
		 int var = getMaxDescriptorSetSamplers0(super.ptr);
		 this.maxDescriptorSetSamplers = var;
		 return this.maxDescriptorSetSamplers;
	 }

	/**
	 * Set method for field maxDescriptorSetUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffers
	 * 
	 * @param maxDescriptorSetUniformBuffers - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxDescriptorSetUniformBuffers(int maxDescriptorSetUniformBuffers){
		 this.maxDescriptorSetUniformBuffers = maxDescriptorSetUniformBuffers;
		 setMaxDescriptorSetUniformBuffers0(this.ptr,  maxDescriptorSetUniformBuffers);
		 return this;
	 }

	/**
	 * Get method for field maxDescriptorSetUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffers
	 */ 
	 public int maxDescriptorSetUniformBuffers(){
		 int var = getMaxDescriptorSetUniformBuffers0(super.ptr);
		 this.maxDescriptorSetUniformBuffers = var;
		 return this.maxDescriptorSetUniformBuffers;
	 }

	/**
	 * Set method for field maxDescriptorSetUniformBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffersDynamic
	 * 
	 * @param maxDescriptorSetUniformBuffersDynamic - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxDescriptorSetUniformBuffersDynamic(int maxDescriptorSetUniformBuffersDynamic){
		 this.maxDescriptorSetUniformBuffersDynamic = maxDescriptorSetUniformBuffersDynamic;
		 setMaxDescriptorSetUniformBuffersDynamic0(this.ptr,  maxDescriptorSetUniformBuffersDynamic);
		 return this;
	 }

	/**
	 * Get method for field maxDescriptorSetUniformBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffersDynamic
	 */ 
	 public int maxDescriptorSetUniformBuffersDynamic(){
		 int var = getMaxDescriptorSetUniformBuffersDynamic0(super.ptr);
		 this.maxDescriptorSetUniformBuffersDynamic = var;
		 return this.maxDescriptorSetUniformBuffersDynamic;
	 }

	/**
	 * Set method for field maxDescriptorSetStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffers
	 * 
	 * @param maxDescriptorSetStorageBuffers - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxDescriptorSetStorageBuffers(int maxDescriptorSetStorageBuffers){
		 this.maxDescriptorSetStorageBuffers = maxDescriptorSetStorageBuffers;
		 setMaxDescriptorSetStorageBuffers0(this.ptr,  maxDescriptorSetStorageBuffers);
		 return this;
	 }

	/**
	 * Get method for field maxDescriptorSetStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffers
	 */ 
	 public int maxDescriptorSetStorageBuffers(){
		 int var = getMaxDescriptorSetStorageBuffers0(super.ptr);
		 this.maxDescriptorSetStorageBuffers = var;
		 return this.maxDescriptorSetStorageBuffers;
	 }

	/**
	 * Set method for field maxDescriptorSetStorageBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffersDynamic
	 * 
	 * @param maxDescriptorSetStorageBuffersDynamic - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxDescriptorSetStorageBuffersDynamic(int maxDescriptorSetStorageBuffersDynamic){
		 this.maxDescriptorSetStorageBuffersDynamic = maxDescriptorSetStorageBuffersDynamic;
		 setMaxDescriptorSetStorageBuffersDynamic0(this.ptr,  maxDescriptorSetStorageBuffersDynamic);
		 return this;
	 }

	/**
	 * Get method for field maxDescriptorSetStorageBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffersDynamic
	 */ 
	 public int maxDescriptorSetStorageBuffersDynamic(){
		 int var = getMaxDescriptorSetStorageBuffersDynamic0(super.ptr);
		 this.maxDescriptorSetStorageBuffersDynamic = var;
		 return this.maxDescriptorSetStorageBuffersDynamic;
	 }

	/**
	 * Set method for field maxDescriptorSetSampledImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSampledImages
	 * 
	 * @param maxDescriptorSetSampledImages - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxDescriptorSetSampledImages(int maxDescriptorSetSampledImages){
		 this.maxDescriptorSetSampledImages = maxDescriptorSetSampledImages;
		 setMaxDescriptorSetSampledImages0(this.ptr,  maxDescriptorSetSampledImages);
		 return this;
	 }

	/**
	 * Get method for field maxDescriptorSetSampledImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSampledImages
	 */ 
	 public int maxDescriptorSetSampledImages(){
		 int var = getMaxDescriptorSetSampledImages0(super.ptr);
		 this.maxDescriptorSetSampledImages = var;
		 return this.maxDescriptorSetSampledImages;
	 }

	/**
	 * Set method for field maxDescriptorSetStorageImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageImages
	 * 
	 * @param maxDescriptorSetStorageImages - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxDescriptorSetStorageImages(int maxDescriptorSetStorageImages){
		 this.maxDescriptorSetStorageImages = maxDescriptorSetStorageImages;
		 setMaxDescriptorSetStorageImages0(this.ptr,  maxDescriptorSetStorageImages);
		 return this;
	 }

	/**
	 * Get method for field maxDescriptorSetStorageImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageImages
	 */ 
	 public int maxDescriptorSetStorageImages(){
		 int var = getMaxDescriptorSetStorageImages0(super.ptr);
		 this.maxDescriptorSetStorageImages = var;
		 return this.maxDescriptorSetStorageImages;
	 }

	/**
	 * Set method for field maxDescriptorSetInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetInputAttachments
	 * 
	 * @param maxDescriptorSetInputAttachments - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxDescriptorSetInputAttachments(int maxDescriptorSetInputAttachments){
		 this.maxDescriptorSetInputAttachments = maxDescriptorSetInputAttachments;
		 setMaxDescriptorSetInputAttachments0(this.ptr,  maxDescriptorSetInputAttachments);
		 return this;
	 }

	/**
	 * Get method for field maxDescriptorSetInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetInputAttachments
	 */ 
	 public int maxDescriptorSetInputAttachments(){
		 int var = getMaxDescriptorSetInputAttachments0(super.ptr);
		 this.maxDescriptorSetInputAttachments = var;
		 return this.maxDescriptorSetInputAttachments;
	 }

	/**
	 * Set method for field maxVertexInputAttributes	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributes
	 * 
	 * @param maxVertexInputAttributes - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxVertexInputAttributes(int maxVertexInputAttributes){
		 this.maxVertexInputAttributes = maxVertexInputAttributes;
		 setMaxVertexInputAttributes0(this.ptr,  maxVertexInputAttributes);
		 return this;
	 }

	/**
	 * Get method for field maxVertexInputAttributes	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributes
	 */ 
	 public int maxVertexInputAttributes(){
		 int var = getMaxVertexInputAttributes0(super.ptr);
		 this.maxVertexInputAttributes = var;
		 return this.maxVertexInputAttributes;
	 }

	/**
	 * Set method for field maxVertexInputBindings	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindings
	 * 
	 * @param maxVertexInputBindings - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxVertexInputBindings(int maxVertexInputBindings){
		 this.maxVertexInputBindings = maxVertexInputBindings;
		 setMaxVertexInputBindings0(this.ptr,  maxVertexInputBindings);
		 return this;
	 }

	/**
	 * Get method for field maxVertexInputBindings	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindings
	 */ 
	 public int maxVertexInputBindings(){
		 int var = getMaxVertexInputBindings0(super.ptr);
		 this.maxVertexInputBindings = var;
		 return this.maxVertexInputBindings;
	 }

	/**
	 * Set method for field maxVertexInputAttributeOffset	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributeOffset
	 * 
	 * @param maxVertexInputAttributeOffset - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxVertexInputAttributeOffset(int maxVertexInputAttributeOffset){
		 this.maxVertexInputAttributeOffset = maxVertexInputAttributeOffset;
		 setMaxVertexInputAttributeOffset0(this.ptr,  maxVertexInputAttributeOffset);
		 return this;
	 }

	/**
	 * Get method for field maxVertexInputAttributeOffset	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributeOffset
	 */ 
	 public int maxVertexInputAttributeOffset(){
		 int var = getMaxVertexInputAttributeOffset0(super.ptr);
		 this.maxVertexInputAttributeOffset = var;
		 return this.maxVertexInputAttributeOffset;
	 }

	/**
	 * Set method for field maxVertexInputBindingStride	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindingStride
	 * 
	 * @param maxVertexInputBindingStride - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxVertexInputBindingStride(int maxVertexInputBindingStride){
		 this.maxVertexInputBindingStride = maxVertexInputBindingStride;
		 setMaxVertexInputBindingStride0(this.ptr,  maxVertexInputBindingStride);
		 return this;
	 }

	/**
	 * Get method for field maxVertexInputBindingStride	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindingStride
	 */ 
	 public int maxVertexInputBindingStride(){
		 int var = getMaxVertexInputBindingStride0(super.ptr);
		 this.maxVertexInputBindingStride = var;
		 return this.maxVertexInputBindingStride;
	 }

	/**
	 * Set method for field maxVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxVertexOutputComponents
	 * 
	 * @param maxVertexOutputComponents - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxVertexOutputComponents(int maxVertexOutputComponents){
		 this.maxVertexOutputComponents = maxVertexOutputComponents;
		 setMaxVertexOutputComponents0(this.ptr,  maxVertexOutputComponents);
		 return this;
	 }

	/**
	 * Get method for field maxVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxVertexOutputComponents
	 */ 
	 public int maxVertexOutputComponents(){
		 int var = getMaxVertexOutputComponents0(super.ptr);
		 this.maxVertexOutputComponents = var;
		 return this.maxVertexOutputComponents;
	 }

	/**
	 * Set method for field maxTessellationGenerationLevel	[int]<br>
	 * Prototype: uint32_t  maxTessellationGenerationLevel
	 * 
	 * @param maxTessellationGenerationLevel - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxTessellationGenerationLevel(int maxTessellationGenerationLevel){
		 this.maxTessellationGenerationLevel = maxTessellationGenerationLevel;
		 setMaxTessellationGenerationLevel0(this.ptr,  maxTessellationGenerationLevel);
		 return this;
	 }

	/**
	 * Get method for field maxTessellationGenerationLevel	[int]<br>
	 * Prototype: uint32_t  maxTessellationGenerationLevel
	 */ 
	 public int maxTessellationGenerationLevel(){
		 int var = getMaxTessellationGenerationLevel0(super.ptr);
		 this.maxTessellationGenerationLevel = var;
		 return this.maxTessellationGenerationLevel;
	 }

	/**
	 * Set method for field maxTessellationPatchSize	[int]<br>
	 * Prototype: uint32_t  maxTessellationPatchSize
	 * 
	 * @param maxTessellationPatchSize - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxTessellationPatchSize(int maxTessellationPatchSize){
		 this.maxTessellationPatchSize = maxTessellationPatchSize;
		 setMaxTessellationPatchSize0(this.ptr,  maxTessellationPatchSize);
		 return this;
	 }

	/**
	 * Get method for field maxTessellationPatchSize	[int]<br>
	 * Prototype: uint32_t  maxTessellationPatchSize
	 */ 
	 public int maxTessellationPatchSize(){
		 int var = getMaxTessellationPatchSize0(super.ptr);
		 this.maxTessellationPatchSize = var;
		 return this.maxTessellationPatchSize;
	 }

	/**
	 * Set method for field maxTessellationControlPerVertexInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexInputComponents
	 * 
	 * @param maxTessellationControlPerVertexInputComponents - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxTessellationControlPerVertexInputComponents(int maxTessellationControlPerVertexInputComponents){
		 this.maxTessellationControlPerVertexInputComponents = maxTessellationControlPerVertexInputComponents;
		 setMaxTessellationControlPerVertexInputComponents0(this.ptr,  maxTessellationControlPerVertexInputComponents);
		 return this;
	 }

	/**
	 * Get method for field maxTessellationControlPerVertexInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexInputComponents
	 */ 
	 public int maxTessellationControlPerVertexInputComponents(){
		 int var = getMaxTessellationControlPerVertexInputComponents0(super.ptr);
		 this.maxTessellationControlPerVertexInputComponents = var;
		 return this.maxTessellationControlPerVertexInputComponents;
	 }

	/**
	 * Set method for field maxTessellationControlPerVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexOutputComponents
	 * 
	 * @param maxTessellationControlPerVertexOutputComponents - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxTessellationControlPerVertexOutputComponents(int maxTessellationControlPerVertexOutputComponents){
		 this.maxTessellationControlPerVertexOutputComponents = maxTessellationControlPerVertexOutputComponents;
		 setMaxTessellationControlPerVertexOutputComponents0(this.ptr,  maxTessellationControlPerVertexOutputComponents);
		 return this;
	 }

	/**
	 * Get method for field maxTessellationControlPerVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexOutputComponents
	 */ 
	 public int maxTessellationControlPerVertexOutputComponents(){
		 int var = getMaxTessellationControlPerVertexOutputComponents0(super.ptr);
		 this.maxTessellationControlPerVertexOutputComponents = var;
		 return this.maxTessellationControlPerVertexOutputComponents;
	 }

	/**
	 * Set method for field maxTessellationControlPerPatchOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerPatchOutputComponents
	 * 
	 * @param maxTessellationControlPerPatchOutputComponents - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxTessellationControlPerPatchOutputComponents(int maxTessellationControlPerPatchOutputComponents){
		 this.maxTessellationControlPerPatchOutputComponents = maxTessellationControlPerPatchOutputComponents;
		 setMaxTessellationControlPerPatchOutputComponents0(this.ptr,  maxTessellationControlPerPatchOutputComponents);
		 return this;
	 }

	/**
	 * Get method for field maxTessellationControlPerPatchOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerPatchOutputComponents
	 */ 
	 public int maxTessellationControlPerPatchOutputComponents(){
		 int var = getMaxTessellationControlPerPatchOutputComponents0(super.ptr);
		 this.maxTessellationControlPerPatchOutputComponents = var;
		 return this.maxTessellationControlPerPatchOutputComponents;
	 }

	/**
	 * Set method for field maxTessellationControlTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlTotalOutputComponents
	 * 
	 * @param maxTessellationControlTotalOutputComponents - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxTessellationControlTotalOutputComponents(int maxTessellationControlTotalOutputComponents){
		 this.maxTessellationControlTotalOutputComponents = maxTessellationControlTotalOutputComponents;
		 setMaxTessellationControlTotalOutputComponents0(this.ptr,  maxTessellationControlTotalOutputComponents);
		 return this;
	 }

	/**
	 * Get method for field maxTessellationControlTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlTotalOutputComponents
	 */ 
	 public int maxTessellationControlTotalOutputComponents(){
		 int var = getMaxTessellationControlTotalOutputComponents0(super.ptr);
		 this.maxTessellationControlTotalOutputComponents = var;
		 return this.maxTessellationControlTotalOutputComponents;
	 }

	/**
	 * Set method for field maxTessellationEvaluationInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationInputComponents
	 * 
	 * @param maxTessellationEvaluationInputComponents - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxTessellationEvaluationInputComponents(int maxTessellationEvaluationInputComponents){
		 this.maxTessellationEvaluationInputComponents = maxTessellationEvaluationInputComponents;
		 setMaxTessellationEvaluationInputComponents0(this.ptr,  maxTessellationEvaluationInputComponents);
		 return this;
	 }

	/**
	 * Get method for field maxTessellationEvaluationInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationInputComponents
	 */ 
	 public int maxTessellationEvaluationInputComponents(){
		 int var = getMaxTessellationEvaluationInputComponents0(super.ptr);
		 this.maxTessellationEvaluationInputComponents = var;
		 return this.maxTessellationEvaluationInputComponents;
	 }

	/**
	 * Set method for field maxTessellationEvaluationOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationOutputComponents
	 * 
	 * @param maxTessellationEvaluationOutputComponents - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxTessellationEvaluationOutputComponents(int maxTessellationEvaluationOutputComponents){
		 this.maxTessellationEvaluationOutputComponents = maxTessellationEvaluationOutputComponents;
		 setMaxTessellationEvaluationOutputComponents0(this.ptr,  maxTessellationEvaluationOutputComponents);
		 return this;
	 }

	/**
	 * Get method for field maxTessellationEvaluationOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationOutputComponents
	 */ 
	 public int maxTessellationEvaluationOutputComponents(){
		 int var = getMaxTessellationEvaluationOutputComponents0(super.ptr);
		 this.maxTessellationEvaluationOutputComponents = var;
		 return this.maxTessellationEvaluationOutputComponents;
	 }

	/**
	 * Set method for field maxGeometryShaderInvocations	[int]<br>
	 * Prototype: uint32_t  maxGeometryShaderInvocations
	 * 
	 * @param maxGeometryShaderInvocations - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxGeometryShaderInvocations(int maxGeometryShaderInvocations){
		 this.maxGeometryShaderInvocations = maxGeometryShaderInvocations;
		 setMaxGeometryShaderInvocations0(this.ptr,  maxGeometryShaderInvocations);
		 return this;
	 }

	/**
	 * Get method for field maxGeometryShaderInvocations	[int]<br>
	 * Prototype: uint32_t  maxGeometryShaderInvocations
	 */ 
	 public int maxGeometryShaderInvocations(){
		 int var = getMaxGeometryShaderInvocations0(super.ptr);
		 this.maxGeometryShaderInvocations = var;
		 return this.maxGeometryShaderInvocations;
	 }

	/**
	 * Set method for field maxGeometryInputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryInputComponents
	 * 
	 * @param maxGeometryInputComponents - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxGeometryInputComponents(int maxGeometryInputComponents){
		 this.maxGeometryInputComponents = maxGeometryInputComponents;
		 setMaxGeometryInputComponents0(this.ptr,  maxGeometryInputComponents);
		 return this;
	 }

	/**
	 * Get method for field maxGeometryInputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryInputComponents
	 */ 
	 public int maxGeometryInputComponents(){
		 int var = getMaxGeometryInputComponents0(super.ptr);
		 this.maxGeometryInputComponents = var;
		 return this.maxGeometryInputComponents;
	 }

	/**
	 * Set method for field maxGeometryOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputComponents
	 * 
	 * @param maxGeometryOutputComponents - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxGeometryOutputComponents(int maxGeometryOutputComponents){
		 this.maxGeometryOutputComponents = maxGeometryOutputComponents;
		 setMaxGeometryOutputComponents0(this.ptr,  maxGeometryOutputComponents);
		 return this;
	 }

	/**
	 * Get method for field maxGeometryOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputComponents
	 */ 
	 public int maxGeometryOutputComponents(){
		 int var = getMaxGeometryOutputComponents0(super.ptr);
		 this.maxGeometryOutputComponents = var;
		 return this.maxGeometryOutputComponents;
	 }

	/**
	 * Set method for field maxGeometryOutputVertices	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputVertices
	 * 
	 * @param maxGeometryOutputVertices - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxGeometryOutputVertices(int maxGeometryOutputVertices){
		 this.maxGeometryOutputVertices = maxGeometryOutputVertices;
		 setMaxGeometryOutputVertices0(this.ptr,  maxGeometryOutputVertices);
		 return this;
	 }

	/**
	 * Get method for field maxGeometryOutputVertices	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputVertices
	 */ 
	 public int maxGeometryOutputVertices(){
		 int var = getMaxGeometryOutputVertices0(super.ptr);
		 this.maxGeometryOutputVertices = var;
		 return this.maxGeometryOutputVertices;
	 }

	/**
	 * Set method for field maxGeometryTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryTotalOutputComponents
	 * 
	 * @param maxGeometryTotalOutputComponents - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxGeometryTotalOutputComponents(int maxGeometryTotalOutputComponents){
		 this.maxGeometryTotalOutputComponents = maxGeometryTotalOutputComponents;
		 setMaxGeometryTotalOutputComponents0(this.ptr,  maxGeometryTotalOutputComponents);
		 return this;
	 }

	/**
	 * Get method for field maxGeometryTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryTotalOutputComponents
	 */ 
	 public int maxGeometryTotalOutputComponents(){
		 int var = getMaxGeometryTotalOutputComponents0(super.ptr);
		 this.maxGeometryTotalOutputComponents = var;
		 return this.maxGeometryTotalOutputComponents;
	 }

	/**
	 * Set method for field maxFragmentInputComponents	[int]<br>
	 * Prototype: uint32_t  maxFragmentInputComponents
	 * 
	 * @param maxFragmentInputComponents - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxFragmentInputComponents(int maxFragmentInputComponents){
		 this.maxFragmentInputComponents = maxFragmentInputComponents;
		 setMaxFragmentInputComponents0(this.ptr,  maxFragmentInputComponents);
		 return this;
	 }

	/**
	 * Get method for field maxFragmentInputComponents	[int]<br>
	 * Prototype: uint32_t  maxFragmentInputComponents
	 */ 
	 public int maxFragmentInputComponents(){
		 int var = getMaxFragmentInputComponents0(super.ptr);
		 this.maxFragmentInputComponents = var;
		 return this.maxFragmentInputComponents;
	 }

	/**
	 * Set method for field maxFragmentOutputAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentOutputAttachments
	 * 
	 * @param maxFragmentOutputAttachments - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxFragmentOutputAttachments(int maxFragmentOutputAttachments){
		 this.maxFragmentOutputAttachments = maxFragmentOutputAttachments;
		 setMaxFragmentOutputAttachments0(this.ptr,  maxFragmentOutputAttachments);
		 return this;
	 }

	/**
	 * Get method for field maxFragmentOutputAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentOutputAttachments
	 */ 
	 public int maxFragmentOutputAttachments(){
		 int var = getMaxFragmentOutputAttachments0(super.ptr);
		 this.maxFragmentOutputAttachments = var;
		 return this.maxFragmentOutputAttachments;
	 }

	/**
	 * Set method for field maxFragmentDualSrcAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentDualSrcAttachments
	 * 
	 * @param maxFragmentDualSrcAttachments - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxFragmentDualSrcAttachments(int maxFragmentDualSrcAttachments){
		 this.maxFragmentDualSrcAttachments = maxFragmentDualSrcAttachments;
		 setMaxFragmentDualSrcAttachments0(this.ptr,  maxFragmentDualSrcAttachments);
		 return this;
	 }

	/**
	 * Get method for field maxFragmentDualSrcAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentDualSrcAttachments
	 */ 
	 public int maxFragmentDualSrcAttachments(){
		 int var = getMaxFragmentDualSrcAttachments0(super.ptr);
		 this.maxFragmentDualSrcAttachments = var;
		 return this.maxFragmentDualSrcAttachments;
	 }

	/**
	 * Set method for field maxFragmentCombinedOutputResources	[int]<br>
	 * Prototype: uint32_t  maxFragmentCombinedOutputResources
	 * 
	 * @param maxFragmentCombinedOutputResources - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxFragmentCombinedOutputResources(int maxFragmentCombinedOutputResources){
		 this.maxFragmentCombinedOutputResources = maxFragmentCombinedOutputResources;
		 setMaxFragmentCombinedOutputResources0(this.ptr,  maxFragmentCombinedOutputResources);
		 return this;
	 }

	/**
	 * Get method for field maxFragmentCombinedOutputResources	[int]<br>
	 * Prototype: uint32_t  maxFragmentCombinedOutputResources
	 */ 
	 public int maxFragmentCombinedOutputResources(){
		 int var = getMaxFragmentCombinedOutputResources0(super.ptr);
		 this.maxFragmentCombinedOutputResources = var;
		 return this.maxFragmentCombinedOutputResources;
	 }

	/**
	 * Set method for field maxComputeSharedMemorySize	[int]<br>
	 * Prototype: uint32_t  maxComputeSharedMemorySize
	 * 
	 * @param maxComputeSharedMemorySize - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxComputeSharedMemorySize(int maxComputeSharedMemorySize){
		 this.maxComputeSharedMemorySize = maxComputeSharedMemorySize;
		 setMaxComputeSharedMemorySize0(this.ptr,  maxComputeSharedMemorySize);
		 return this;
	 }

	/**
	 * Get method for field maxComputeSharedMemorySize	[int]<br>
	 * Prototype: uint32_t  maxComputeSharedMemorySize
	 */ 
	 public int maxComputeSharedMemorySize(){
		 int var = getMaxComputeSharedMemorySize0(super.ptr);
		 this.maxComputeSharedMemorySize = var;
		 return this.maxComputeSharedMemorySize;
	 }

	/**
	 * Set method for field maxComputeWorkGroupCount	[int]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupCount
	 * 
	 * @param maxComputeWorkGroupCount - a instance of int[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxComputeWorkGroupCount(int[] maxComputeWorkGroupCount){
		 if(maxComputeWorkGroupCount == null)
		     java.util.Arrays.fill(this.maxComputeWorkGroupCount , 0);
		  else
		     System.arraycopy(maxComputeWorkGroupCount, 0, this.maxComputeWorkGroupCount, 0, this.maxComputeWorkGroupCount.length); 

		 setMaxComputeWorkGroupCount0(this.ptr,  this.maxComputeWorkGroupCount);
		 return this;
	 }

	/**
	 * Get method for field maxComputeWorkGroupCount	[int]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupCount
	 */ 
	 public int[] maxComputeWorkGroupCount(){
		 int[] var = getMaxComputeWorkGroupCount0(super.ptr, maxComputeWorkGroupCount);
		 this.maxComputeWorkGroupCount = var;
		 return this.maxComputeWorkGroupCount;
	 }

	/**
	 * Set method for field maxComputeWorkGroupInvocations	[int]<br>
	 * Prototype: uint32_t  maxComputeWorkGroupInvocations
	 * 
	 * @param maxComputeWorkGroupInvocations - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxComputeWorkGroupInvocations(int maxComputeWorkGroupInvocations){
		 this.maxComputeWorkGroupInvocations = maxComputeWorkGroupInvocations;
		 setMaxComputeWorkGroupInvocations0(this.ptr,  maxComputeWorkGroupInvocations);
		 return this;
	 }

	/**
	 * Get method for field maxComputeWorkGroupInvocations	[int]<br>
	 * Prototype: uint32_t  maxComputeWorkGroupInvocations
	 */ 
	 public int maxComputeWorkGroupInvocations(){
		 int var = getMaxComputeWorkGroupInvocations0(super.ptr);
		 this.maxComputeWorkGroupInvocations = var;
		 return this.maxComputeWorkGroupInvocations;
	 }

	/**
	 * Set method for field maxComputeWorkGroupSize	[int]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupSize
	 * 
	 * @param maxComputeWorkGroupSize - a instance of int[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxComputeWorkGroupSize(int[] maxComputeWorkGroupSize){
		 if(maxComputeWorkGroupSize == null)
		     java.util.Arrays.fill(this.maxComputeWorkGroupSize , 0);
		  else
		     System.arraycopy(maxComputeWorkGroupSize, 0, this.maxComputeWorkGroupSize, 0, this.maxComputeWorkGroupSize.length); 

		 setMaxComputeWorkGroupSize0(this.ptr,  this.maxComputeWorkGroupSize);
		 return this;
	 }

	/**
	 * Get method for field maxComputeWorkGroupSize	[int]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupSize
	 */ 
	 public int[] maxComputeWorkGroupSize(){
		 int[] var = getMaxComputeWorkGroupSize0(super.ptr, maxComputeWorkGroupSize);
		 this.maxComputeWorkGroupSize = var;
		 return this.maxComputeWorkGroupSize;
	 }

	/**
	 * Set method for field subPixelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subPixelPrecisionBits
	 * 
	 * @param subPixelPrecisionBits - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits subPixelPrecisionBits(int subPixelPrecisionBits){
		 this.subPixelPrecisionBits = subPixelPrecisionBits;
		 setSubPixelPrecisionBits0(this.ptr,  subPixelPrecisionBits);
		 return this;
	 }

	/**
	 * Get method for field subPixelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subPixelPrecisionBits
	 */ 
	 public int subPixelPrecisionBits(){
		 int var = getSubPixelPrecisionBits0(super.ptr);
		 this.subPixelPrecisionBits = var;
		 return this.subPixelPrecisionBits;
	 }

	/**
	 * Set method for field subTexelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subTexelPrecisionBits
	 * 
	 * @param subTexelPrecisionBits - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits subTexelPrecisionBits(int subTexelPrecisionBits){
		 this.subTexelPrecisionBits = subTexelPrecisionBits;
		 setSubTexelPrecisionBits0(this.ptr,  subTexelPrecisionBits);
		 return this;
	 }

	/**
	 * Get method for field subTexelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subTexelPrecisionBits
	 */ 
	 public int subTexelPrecisionBits(){
		 int var = getSubTexelPrecisionBits0(super.ptr);
		 this.subTexelPrecisionBits = var;
		 return this.subTexelPrecisionBits;
	 }

	/**
	 * Set method for field mipmapPrecisionBits	[int]<br>
	 * Prototype: uint32_t  mipmapPrecisionBits
	 * 
	 * @param mipmapPrecisionBits - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits mipmapPrecisionBits(int mipmapPrecisionBits){
		 this.mipmapPrecisionBits = mipmapPrecisionBits;
		 setMipmapPrecisionBits0(this.ptr,  mipmapPrecisionBits);
		 return this;
	 }

	/**
	 * Get method for field mipmapPrecisionBits	[int]<br>
	 * Prototype: uint32_t  mipmapPrecisionBits
	 */ 
	 public int mipmapPrecisionBits(){
		 int var = getMipmapPrecisionBits0(super.ptr);
		 this.mipmapPrecisionBits = var;
		 return this.mipmapPrecisionBits;
	 }

	/**
	 * Set method for field maxDrawIndexedIndexValue	[int]<br>
	 * Prototype: uint32_t  maxDrawIndexedIndexValue
	 * 
	 * @param maxDrawIndexedIndexValue - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxDrawIndexedIndexValue(int maxDrawIndexedIndexValue){
		 this.maxDrawIndexedIndexValue = maxDrawIndexedIndexValue;
		 setMaxDrawIndexedIndexValue0(this.ptr,  maxDrawIndexedIndexValue);
		 return this;
	 }

	/**
	 * Get method for field maxDrawIndexedIndexValue	[int]<br>
	 * Prototype: uint32_t  maxDrawIndexedIndexValue
	 */ 
	 public int maxDrawIndexedIndexValue(){
		 int var = getMaxDrawIndexedIndexValue0(super.ptr);
		 this.maxDrawIndexedIndexValue = var;
		 return this.maxDrawIndexedIndexValue;
	 }

	/**
	 * Set method for field maxDrawIndirectCount	[int]<br>
	 * Prototype: uint32_t  maxDrawIndirectCount
	 * 
	 * @param maxDrawIndirectCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxDrawIndirectCount(int maxDrawIndirectCount){
		 this.maxDrawIndirectCount = maxDrawIndirectCount;
		 setMaxDrawIndirectCount0(this.ptr,  maxDrawIndirectCount);
		 return this;
	 }

	/**
	 * Get method for field maxDrawIndirectCount	[int]<br>
	 * Prototype: uint32_t  maxDrawIndirectCount
	 */ 
	 public int maxDrawIndirectCount(){
		 int var = getMaxDrawIndirectCount0(super.ptr);
		 this.maxDrawIndirectCount = var;
		 return this.maxDrawIndirectCount;
	 }

	/**
	 * Set method for field maxSamplerLodBias	[float]<br>
	 * Prototype: float  maxSamplerLodBias
	 * 
	 * @param maxSamplerLodBias - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxSamplerLodBias(float maxSamplerLodBias){
		 this.maxSamplerLodBias = maxSamplerLodBias;
		 setMaxSamplerLodBias0(this.ptr,  maxSamplerLodBias);
		 return this;
	 }

	/**
	 * Get method for field maxSamplerLodBias	[float]<br>
	 * Prototype: float  maxSamplerLodBias
	 */ 
	 public float maxSamplerLodBias(){
		 float var = getMaxSamplerLodBias0(super.ptr);
		 this.maxSamplerLodBias = var;
		 return this.maxSamplerLodBias;
	 }

	/**
	 * Set method for field maxSamplerAnisotropy	[float]<br>
	 * Prototype: float  maxSamplerAnisotropy
	 * 
	 * @param maxSamplerAnisotropy - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxSamplerAnisotropy(float maxSamplerAnisotropy){
		 this.maxSamplerAnisotropy = maxSamplerAnisotropy;
		 setMaxSamplerAnisotropy0(this.ptr,  maxSamplerAnisotropy);
		 return this;
	 }

	/**
	 * Get method for field maxSamplerAnisotropy	[float]<br>
	 * Prototype: float  maxSamplerAnisotropy
	 */ 
	 public float maxSamplerAnisotropy(){
		 float var = getMaxSamplerAnisotropy0(super.ptr);
		 this.maxSamplerAnisotropy = var;
		 return this.maxSamplerAnisotropy;
	 }

	/**
	 * Set method for field maxViewports	[int]<br>
	 * Prototype: uint32_t  maxViewports
	 * 
	 * @param maxViewports - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxViewports(int maxViewports){
		 this.maxViewports = maxViewports;
		 setMaxViewports0(this.ptr,  maxViewports);
		 return this;
	 }

	/**
	 * Get method for field maxViewports	[int]<br>
	 * Prototype: uint32_t  maxViewports
	 */ 
	 public int maxViewports(){
		 int var = getMaxViewports0(super.ptr);
		 this.maxViewports = var;
		 return this.maxViewports;
	 }

	/**
	 * Set method for field maxViewportDimensions	[int]<br>
	 * Prototype: uint32_t[]  maxViewportDimensions
	 * 
	 * @param maxViewportDimensions - a instance of int[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxViewportDimensions(int[] maxViewportDimensions){
		 if(maxViewportDimensions == null)
		     java.util.Arrays.fill(this.maxViewportDimensions , 0);
		  else
		     System.arraycopy(maxViewportDimensions, 0, this.maxViewportDimensions, 0, this.maxViewportDimensions.length); 

		 setMaxViewportDimensions0(this.ptr,  this.maxViewportDimensions);
		 return this;
	 }

	/**
	 * Get method for field maxViewportDimensions	[int]<br>
	 * Prototype: uint32_t[]  maxViewportDimensions
	 */ 
	 public int[] maxViewportDimensions(){
		 int[] var = getMaxViewportDimensions0(super.ptr, maxViewportDimensions);
		 this.maxViewportDimensions = var;
		 return this.maxViewportDimensions;
	 }

	/**
	 * Set method for field viewportBoundsRange	[float]<br>
	 * Prototype: float[]  viewportBoundsRange
	 * 
	 * @param viewportBoundsRange - a instance of float[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits viewportBoundsRange(float[] viewportBoundsRange){
		 if(viewportBoundsRange == null)
		     java.util.Arrays.fill(this.viewportBoundsRange , 0);
		  else
		     System.arraycopy(viewportBoundsRange, 0, this.viewportBoundsRange, 0, this.viewportBoundsRange.length); 

		 setViewportBoundsRange0(this.ptr,  this.viewportBoundsRange);
		 return this;
	 }

	/**
	 * Get method for field viewportBoundsRange	[float]<br>
	 * Prototype: float[]  viewportBoundsRange
	 */ 
	 public float[] viewportBoundsRange(){
		 float[] var = getViewportBoundsRange0(super.ptr, viewportBoundsRange);
		 this.viewportBoundsRange = var;
		 return this.viewportBoundsRange;
	 }

	/**
	 * Set method for field viewportSubPixelBits	[int]<br>
	 * Prototype: uint32_t  viewportSubPixelBits
	 * 
	 * @param viewportSubPixelBits - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits viewportSubPixelBits(int viewportSubPixelBits){
		 this.viewportSubPixelBits = viewportSubPixelBits;
		 setViewportSubPixelBits0(this.ptr,  viewportSubPixelBits);
		 return this;
	 }

	/**
	 * Get method for field viewportSubPixelBits	[int]<br>
	 * Prototype: uint32_t  viewportSubPixelBits
	 */ 
	 public int viewportSubPixelBits(){
		 int var = getViewportSubPixelBits0(super.ptr);
		 this.viewportSubPixelBits = var;
		 return this.viewportSubPixelBits;
	 }

	/**
	 * Set method for field minMemoryMapAlignment	[long]<br>
	 * Prototype: size_t  minMemoryMapAlignment
	 * 
	 * @param minMemoryMapAlignment - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits minMemoryMapAlignment(long minMemoryMapAlignment){
		 this.minMemoryMapAlignment = minMemoryMapAlignment;
		 setMinMemoryMapAlignment0(this.ptr,  minMemoryMapAlignment);
		 return this;
	 }

	/**
	 * Get method for field minMemoryMapAlignment	[long]<br>
	 * Prototype: size_t  minMemoryMapAlignment
	 */ 
	 public long minMemoryMapAlignment(){
		 long var = getMinMemoryMapAlignment0(super.ptr);
		 this.minMemoryMapAlignment = var;
		 return this.minMemoryMapAlignment;
	 }

	/**
	 * Set method for field minTexelBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minTexelBufferOffsetAlignment
	 * 
	 * @param minTexelBufferOffsetAlignment - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits minTexelBufferOffsetAlignment(long minTexelBufferOffsetAlignment){
		 this.minTexelBufferOffsetAlignment = minTexelBufferOffsetAlignment;
		 setMinTexelBufferOffsetAlignment0(this.ptr,  minTexelBufferOffsetAlignment);
		 return this;
	 }

	/**
	 * Get method for field minTexelBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minTexelBufferOffsetAlignment
	 */ 
	 public long minTexelBufferOffsetAlignment(){
		 long var = getMinTexelBufferOffsetAlignment0(super.ptr);
		 this.minTexelBufferOffsetAlignment = var;
		 return this.minTexelBufferOffsetAlignment;
	 }

	/**
	 * Set method for field minUniformBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minUniformBufferOffsetAlignment
	 * 
	 * @param minUniformBufferOffsetAlignment - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits minUniformBufferOffsetAlignment(long minUniformBufferOffsetAlignment){
		 this.minUniformBufferOffsetAlignment = minUniformBufferOffsetAlignment;
		 setMinUniformBufferOffsetAlignment0(this.ptr,  minUniformBufferOffsetAlignment);
		 return this;
	 }

	/**
	 * Get method for field minUniformBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minUniformBufferOffsetAlignment
	 */ 
	 public long minUniformBufferOffsetAlignment(){
		 long var = getMinUniformBufferOffsetAlignment0(super.ptr);
		 this.minUniformBufferOffsetAlignment = var;
		 return this.minUniformBufferOffsetAlignment;
	 }

	/**
	 * Set method for field minStorageBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minStorageBufferOffsetAlignment
	 * 
	 * @param minStorageBufferOffsetAlignment - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits minStorageBufferOffsetAlignment(long minStorageBufferOffsetAlignment){
		 this.minStorageBufferOffsetAlignment = minStorageBufferOffsetAlignment;
		 setMinStorageBufferOffsetAlignment0(this.ptr,  minStorageBufferOffsetAlignment);
		 return this;
	 }

	/**
	 * Get method for field minStorageBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minStorageBufferOffsetAlignment
	 */ 
	 public long minStorageBufferOffsetAlignment(){
		 long var = getMinStorageBufferOffsetAlignment0(super.ptr);
		 this.minStorageBufferOffsetAlignment = var;
		 return this.minStorageBufferOffsetAlignment;
	 }

	/**
	 * Set method for field minTexelOffset	[int]<br>
	 * Prototype: int32_t  minTexelOffset
	 * 
	 * @param minTexelOffset - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits minTexelOffset(int minTexelOffset){
		 this.minTexelOffset = minTexelOffset;
		 setMinTexelOffset0(this.ptr,  minTexelOffset);
		 return this;
	 }

	/**
	 * Get method for field minTexelOffset	[int]<br>
	 * Prototype: int32_t  minTexelOffset
	 */ 
	 public int minTexelOffset(){
		 int var = getMinTexelOffset0(super.ptr);
		 this.minTexelOffset = var;
		 return this.minTexelOffset;
	 }

	/**
	 * Set method for field maxTexelOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelOffset
	 * 
	 * @param maxTexelOffset - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxTexelOffset(int maxTexelOffset){
		 this.maxTexelOffset = maxTexelOffset;
		 setMaxTexelOffset0(this.ptr,  maxTexelOffset);
		 return this;
	 }

	/**
	 * Get method for field maxTexelOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelOffset
	 */ 
	 public int maxTexelOffset(){
		 int var = getMaxTexelOffset0(super.ptr);
		 this.maxTexelOffset = var;
		 return this.maxTexelOffset;
	 }

	/**
	 * Set method for field minTexelGatherOffset	[int]<br>
	 * Prototype: int32_t  minTexelGatherOffset
	 * 
	 * @param minTexelGatherOffset - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits minTexelGatherOffset(int minTexelGatherOffset){
		 this.minTexelGatherOffset = minTexelGatherOffset;
		 setMinTexelGatherOffset0(this.ptr,  minTexelGatherOffset);
		 return this;
	 }

	/**
	 * Get method for field minTexelGatherOffset	[int]<br>
	 * Prototype: int32_t  minTexelGatherOffset
	 */ 
	 public int minTexelGatherOffset(){
		 int var = getMinTexelGatherOffset0(super.ptr);
		 this.minTexelGatherOffset = var;
		 return this.minTexelGatherOffset;
	 }

	/**
	 * Set method for field maxTexelGatherOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelGatherOffset
	 * 
	 * @param maxTexelGatherOffset - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxTexelGatherOffset(int maxTexelGatherOffset){
		 this.maxTexelGatherOffset = maxTexelGatherOffset;
		 setMaxTexelGatherOffset0(this.ptr,  maxTexelGatherOffset);
		 return this;
	 }

	/**
	 * Get method for field maxTexelGatherOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelGatherOffset
	 */ 
	 public int maxTexelGatherOffset(){
		 int var = getMaxTexelGatherOffset0(super.ptr);
		 this.maxTexelGatherOffset = var;
		 return this.maxTexelGatherOffset;
	 }

	/**
	 * Set method for field minInterpolationOffset	[float]<br>
	 * Prototype: float  minInterpolationOffset
	 * 
	 * @param minInterpolationOffset - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits minInterpolationOffset(float minInterpolationOffset){
		 this.minInterpolationOffset = minInterpolationOffset;
		 setMinInterpolationOffset0(this.ptr,  minInterpolationOffset);
		 return this;
	 }

	/**
	 * Get method for field minInterpolationOffset	[float]<br>
	 * Prototype: float  minInterpolationOffset
	 */ 
	 public float minInterpolationOffset(){
		 float var = getMinInterpolationOffset0(super.ptr);
		 this.minInterpolationOffset = var;
		 return this.minInterpolationOffset;
	 }

	/**
	 * Set method for field maxInterpolationOffset	[float]<br>
	 * Prototype: float  maxInterpolationOffset
	 * 
	 * @param maxInterpolationOffset - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxInterpolationOffset(float maxInterpolationOffset){
		 this.maxInterpolationOffset = maxInterpolationOffset;
		 setMaxInterpolationOffset0(this.ptr,  maxInterpolationOffset);
		 return this;
	 }

	/**
	 * Get method for field maxInterpolationOffset	[float]<br>
	 * Prototype: float  maxInterpolationOffset
	 */ 
	 public float maxInterpolationOffset(){
		 float var = getMaxInterpolationOffset0(super.ptr);
		 this.maxInterpolationOffset = var;
		 return this.maxInterpolationOffset;
	 }

	/**
	 * Set method for field subPixelInterpolationOffsetBits	[int]<br>
	 * Prototype: uint32_t  subPixelInterpolationOffsetBits
	 * 
	 * @param subPixelInterpolationOffsetBits - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits subPixelInterpolationOffsetBits(int subPixelInterpolationOffsetBits){
		 this.subPixelInterpolationOffsetBits = subPixelInterpolationOffsetBits;
		 setSubPixelInterpolationOffsetBits0(this.ptr,  subPixelInterpolationOffsetBits);
		 return this;
	 }

	/**
	 * Get method for field subPixelInterpolationOffsetBits	[int]<br>
	 * Prototype: uint32_t  subPixelInterpolationOffsetBits
	 */ 
	 public int subPixelInterpolationOffsetBits(){
		 int var = getSubPixelInterpolationOffsetBits0(super.ptr);
		 this.subPixelInterpolationOffsetBits = var;
		 return this.subPixelInterpolationOffsetBits;
	 }

	/**
	 * Set method for field maxFramebufferWidth	[int]<br>
	 * Prototype: uint32_t  maxFramebufferWidth
	 * 
	 * @param maxFramebufferWidth - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxFramebufferWidth(int maxFramebufferWidth){
		 this.maxFramebufferWidth = maxFramebufferWidth;
		 setMaxFramebufferWidth0(this.ptr,  maxFramebufferWidth);
		 return this;
	 }

	/**
	 * Get method for field maxFramebufferWidth	[int]<br>
	 * Prototype: uint32_t  maxFramebufferWidth
	 */ 
	 public int maxFramebufferWidth(){
		 int var = getMaxFramebufferWidth0(super.ptr);
		 this.maxFramebufferWidth = var;
		 return this.maxFramebufferWidth;
	 }

	/**
	 * Set method for field maxFramebufferHeight	[int]<br>
	 * Prototype: uint32_t  maxFramebufferHeight
	 * 
	 * @param maxFramebufferHeight - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxFramebufferHeight(int maxFramebufferHeight){
		 this.maxFramebufferHeight = maxFramebufferHeight;
		 setMaxFramebufferHeight0(this.ptr,  maxFramebufferHeight);
		 return this;
	 }

	/**
	 * Get method for field maxFramebufferHeight	[int]<br>
	 * Prototype: uint32_t  maxFramebufferHeight
	 */ 
	 public int maxFramebufferHeight(){
		 int var = getMaxFramebufferHeight0(super.ptr);
		 this.maxFramebufferHeight = var;
		 return this.maxFramebufferHeight;
	 }

	/**
	 * Set method for field maxFramebufferLayers	[int]<br>
	 * Prototype: uint32_t  maxFramebufferLayers
	 * 
	 * @param maxFramebufferLayers - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxFramebufferLayers(int maxFramebufferLayers){
		 this.maxFramebufferLayers = maxFramebufferLayers;
		 setMaxFramebufferLayers0(this.ptr,  maxFramebufferLayers);
		 return this;
	 }

	/**
	 * Get method for field maxFramebufferLayers	[int]<br>
	 * Prototype: uint32_t  maxFramebufferLayers
	 */ 
	 public int maxFramebufferLayers(){
		 int var = getMaxFramebufferLayers0(super.ptr);
		 this.maxFramebufferLayers = var;
		 return this.maxFramebufferLayers;
	 }

	/**
	 * Set method for field framebufferColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferColorSampleCounts
	 * 
	 * @param framebufferColorSampleCounts - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits framebufferColorSampleCounts(int framebufferColorSampleCounts){
		 this.framebufferColorSampleCounts = framebufferColorSampleCounts;
		 setFramebufferColorSampleCounts0(this.ptr,  framebufferColorSampleCounts);
		 return this;
	 }

	/**
	 * Get method for field framebufferColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferColorSampleCounts
	 */ 
	 public int framebufferColorSampleCounts(){
		 int var = getFramebufferColorSampleCounts0(super.ptr);
		 this.framebufferColorSampleCounts = var;
		 return this.framebufferColorSampleCounts;
	 }

	/**
	 * Set method for field framebufferDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferDepthSampleCounts
	 * 
	 * @param framebufferDepthSampleCounts - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits framebufferDepthSampleCounts(int framebufferDepthSampleCounts){
		 this.framebufferDepthSampleCounts = framebufferDepthSampleCounts;
		 setFramebufferDepthSampleCounts0(this.ptr,  framebufferDepthSampleCounts);
		 return this;
	 }

	/**
	 * Get method for field framebufferDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferDepthSampleCounts
	 */ 
	 public int framebufferDepthSampleCounts(){
		 int var = getFramebufferDepthSampleCounts0(super.ptr);
		 this.framebufferDepthSampleCounts = var;
		 return this.framebufferDepthSampleCounts;
	 }

	/**
	 * Set method for field framebufferStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferStencilSampleCounts
	 * 
	 * @param framebufferStencilSampleCounts - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits framebufferStencilSampleCounts(int framebufferStencilSampleCounts){
		 this.framebufferStencilSampleCounts = framebufferStencilSampleCounts;
		 setFramebufferStencilSampleCounts0(this.ptr,  framebufferStencilSampleCounts);
		 return this;
	 }

	/**
	 * Get method for field framebufferStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferStencilSampleCounts
	 */ 
	 public int framebufferStencilSampleCounts(){
		 int var = getFramebufferStencilSampleCounts0(super.ptr);
		 this.framebufferStencilSampleCounts = var;
		 return this.framebufferStencilSampleCounts;
	 }

	/**
	 * Set method for field framebufferNoAttachmentsSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferNoAttachmentsSampleCounts
	 * 
	 * @param framebufferNoAttachmentsSampleCounts - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits framebufferNoAttachmentsSampleCounts(int framebufferNoAttachmentsSampleCounts){
		 this.framebufferNoAttachmentsSampleCounts = framebufferNoAttachmentsSampleCounts;
		 setFramebufferNoAttachmentsSampleCounts0(this.ptr,  framebufferNoAttachmentsSampleCounts);
		 return this;
	 }

	/**
	 * Get method for field framebufferNoAttachmentsSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferNoAttachmentsSampleCounts
	 */ 
	 public int framebufferNoAttachmentsSampleCounts(){
		 int var = getFramebufferNoAttachmentsSampleCounts0(super.ptr);
		 this.framebufferNoAttachmentsSampleCounts = var;
		 return this.framebufferNoAttachmentsSampleCounts;
	 }

	/**
	 * Set method for field maxColorAttachments	[int]<br>
	 * Prototype: uint32_t  maxColorAttachments
	 * 
	 * @param maxColorAttachments - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxColorAttachments(int maxColorAttachments){
		 this.maxColorAttachments = maxColorAttachments;
		 setMaxColorAttachments0(this.ptr,  maxColorAttachments);
		 return this;
	 }

	/**
	 * Get method for field maxColorAttachments	[int]<br>
	 * Prototype: uint32_t  maxColorAttachments
	 */ 
	 public int maxColorAttachments(){
		 int var = getMaxColorAttachments0(super.ptr);
		 this.maxColorAttachments = var;
		 return this.maxColorAttachments;
	 }

	/**
	 * Set method for field sampledImageColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageColorSampleCounts
	 * 
	 * @param sampledImageColorSampleCounts - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits sampledImageColorSampleCounts(int sampledImageColorSampleCounts){
		 this.sampledImageColorSampleCounts = sampledImageColorSampleCounts;
		 setSampledImageColorSampleCounts0(this.ptr,  sampledImageColorSampleCounts);
		 return this;
	 }

	/**
	 * Get method for field sampledImageColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageColorSampleCounts
	 */ 
	 public int sampledImageColorSampleCounts(){
		 int var = getSampledImageColorSampleCounts0(super.ptr);
		 this.sampledImageColorSampleCounts = var;
		 return this.sampledImageColorSampleCounts;
	 }

	/**
	 * Set method for field sampledImageIntegerSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageIntegerSampleCounts
	 * 
	 * @param sampledImageIntegerSampleCounts - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits sampledImageIntegerSampleCounts(int sampledImageIntegerSampleCounts){
		 this.sampledImageIntegerSampleCounts = sampledImageIntegerSampleCounts;
		 setSampledImageIntegerSampleCounts0(this.ptr,  sampledImageIntegerSampleCounts);
		 return this;
	 }

	/**
	 * Get method for field sampledImageIntegerSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageIntegerSampleCounts
	 */ 
	 public int sampledImageIntegerSampleCounts(){
		 int var = getSampledImageIntegerSampleCounts0(super.ptr);
		 this.sampledImageIntegerSampleCounts = var;
		 return this.sampledImageIntegerSampleCounts;
	 }

	/**
	 * Set method for field sampledImageDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageDepthSampleCounts
	 * 
	 * @param sampledImageDepthSampleCounts - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits sampledImageDepthSampleCounts(int sampledImageDepthSampleCounts){
		 this.sampledImageDepthSampleCounts = sampledImageDepthSampleCounts;
		 setSampledImageDepthSampleCounts0(this.ptr,  sampledImageDepthSampleCounts);
		 return this;
	 }

	/**
	 * Get method for field sampledImageDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageDepthSampleCounts
	 */ 
	 public int sampledImageDepthSampleCounts(){
		 int var = getSampledImageDepthSampleCounts0(super.ptr);
		 this.sampledImageDepthSampleCounts = var;
		 return this.sampledImageDepthSampleCounts;
	 }

	/**
	 * Set method for field sampledImageStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageStencilSampleCounts
	 * 
	 * @param sampledImageStencilSampleCounts - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits sampledImageStencilSampleCounts(int sampledImageStencilSampleCounts){
		 this.sampledImageStencilSampleCounts = sampledImageStencilSampleCounts;
		 setSampledImageStencilSampleCounts0(this.ptr,  sampledImageStencilSampleCounts);
		 return this;
	 }

	/**
	 * Get method for field sampledImageStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageStencilSampleCounts
	 */ 
	 public int sampledImageStencilSampleCounts(){
		 int var = getSampledImageStencilSampleCounts0(super.ptr);
		 this.sampledImageStencilSampleCounts = var;
		 return this.sampledImageStencilSampleCounts;
	 }

	/**
	 * Set method for field storageImageSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  storageImageSampleCounts
	 * 
	 * @param storageImageSampleCounts - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits storageImageSampleCounts(int storageImageSampleCounts){
		 this.storageImageSampleCounts = storageImageSampleCounts;
		 setStorageImageSampleCounts0(this.ptr,  storageImageSampleCounts);
		 return this;
	 }

	/**
	 * Get method for field storageImageSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  storageImageSampleCounts
	 */ 
	 public int storageImageSampleCounts(){
		 int var = getStorageImageSampleCounts0(super.ptr);
		 this.storageImageSampleCounts = var;
		 return this.storageImageSampleCounts;
	 }

	/**
	 * Set method for field maxSampleMaskWords	[int]<br>
	 * Prototype: uint32_t  maxSampleMaskWords
	 * 
	 * @param maxSampleMaskWords - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxSampleMaskWords(int maxSampleMaskWords){
		 this.maxSampleMaskWords = maxSampleMaskWords;
		 setMaxSampleMaskWords0(this.ptr,  maxSampleMaskWords);
		 return this;
	 }

	/**
	 * Get method for field maxSampleMaskWords	[int]<br>
	 * Prototype: uint32_t  maxSampleMaskWords
	 */ 
	 public int maxSampleMaskWords(){
		 int var = getMaxSampleMaskWords0(super.ptr);
		 this.maxSampleMaskWords = var;
		 return this.maxSampleMaskWords;
	 }

	/**
	 * Set method for field timestampComputeAndGraphics	[boolean]<br>
	 * Prototype: VkBool32  timestampComputeAndGraphics
	 * 
	 * @param timestampComputeAndGraphics - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits timestampComputeAndGraphics(boolean timestampComputeAndGraphics){
		 this.timestampComputeAndGraphics = timestampComputeAndGraphics;
		 setTimestampComputeAndGraphics0(this.ptr,  timestampComputeAndGraphics);
		 return this;
	 }

	/**
	 * Get method for field timestampComputeAndGraphics	[boolean]<br>
	 * Prototype: VkBool32  timestampComputeAndGraphics
	 */ 
	 public boolean timestampComputeAndGraphics(){
		 boolean var = getTimestampComputeAndGraphics0(super.ptr);
		 this.timestampComputeAndGraphics = var;
		 return this.timestampComputeAndGraphics;
	 }

	/**
	 * Set method for field timestampPeriod	[float]<br>
	 * Prototype: float  timestampPeriod
	 * 
	 * @param timestampPeriod - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits timestampPeriod(float timestampPeriod){
		 this.timestampPeriod = timestampPeriod;
		 setTimestampPeriod0(this.ptr,  timestampPeriod);
		 return this;
	 }

	/**
	 * Get method for field timestampPeriod	[float]<br>
	 * Prototype: float  timestampPeriod
	 */ 
	 public float timestampPeriod(){
		 float var = getTimestampPeriod0(super.ptr);
		 this.timestampPeriod = var;
		 return this.timestampPeriod;
	 }

	/**
	 * Set method for field maxClipDistances	[int]<br>
	 * Prototype: uint32_t  maxClipDistances
	 * 
	 * @param maxClipDistances - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxClipDistances(int maxClipDistances){
		 this.maxClipDistances = maxClipDistances;
		 setMaxClipDistances0(this.ptr,  maxClipDistances);
		 return this;
	 }

	/**
	 * Get method for field maxClipDistances	[int]<br>
	 * Prototype: uint32_t  maxClipDistances
	 */ 
	 public int maxClipDistances(){
		 int var = getMaxClipDistances0(super.ptr);
		 this.maxClipDistances = var;
		 return this.maxClipDistances;
	 }

	/**
	 * Set method for field maxCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCullDistances
	 * 
	 * @param maxCullDistances - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxCullDistances(int maxCullDistances){
		 this.maxCullDistances = maxCullDistances;
		 setMaxCullDistances0(this.ptr,  maxCullDistances);
		 return this;
	 }

	/**
	 * Get method for field maxCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCullDistances
	 */ 
	 public int maxCullDistances(){
		 int var = getMaxCullDistances0(super.ptr);
		 this.maxCullDistances = var;
		 return this.maxCullDistances;
	 }

	/**
	 * Set method for field maxCombinedClipAndCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCombinedClipAndCullDistances
	 * 
	 * @param maxCombinedClipAndCullDistances - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits maxCombinedClipAndCullDistances(int maxCombinedClipAndCullDistances){
		 this.maxCombinedClipAndCullDistances = maxCombinedClipAndCullDistances;
		 setMaxCombinedClipAndCullDistances0(this.ptr,  maxCombinedClipAndCullDistances);
		 return this;
	 }

	/**
	 * Get method for field maxCombinedClipAndCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCombinedClipAndCullDistances
	 */ 
	 public int maxCombinedClipAndCullDistances(){
		 int var = getMaxCombinedClipAndCullDistances0(super.ptr);
		 this.maxCombinedClipAndCullDistances = var;
		 return this.maxCombinedClipAndCullDistances;
	 }

	/**
	 * Set method for field discreteQueuePriorities	[int]<br>
	 * Prototype: uint32_t  discreteQueuePriorities
	 * 
	 * @param discreteQueuePriorities - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits discreteQueuePriorities(int discreteQueuePriorities){
		 this.discreteQueuePriorities = discreteQueuePriorities;
		 setDiscreteQueuePriorities0(this.ptr,  discreteQueuePriorities);
		 return this;
	 }

	/**
	 * Get method for field discreteQueuePriorities	[int]<br>
	 * Prototype: uint32_t  discreteQueuePriorities
	 */ 
	 public int discreteQueuePriorities(){
		 int var = getDiscreteQueuePriorities0(super.ptr);
		 this.discreteQueuePriorities = var;
		 return this.discreteQueuePriorities;
	 }

	/**
	 * Set method for field pointSizeRange	[float]<br>
	 * Prototype: float[]  pointSizeRange
	 * 
	 * @param pointSizeRange - a instance of float[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits pointSizeRange(float[] pointSizeRange){
		 if(pointSizeRange == null)
		     java.util.Arrays.fill(this.pointSizeRange , 0);
		  else
		     System.arraycopy(pointSizeRange, 0, this.pointSizeRange, 0, this.pointSizeRange.length); 

		 setPointSizeRange0(this.ptr,  this.pointSizeRange);
		 return this;
	 }

	/**
	 * Get method for field pointSizeRange	[float]<br>
	 * Prototype: float[]  pointSizeRange
	 */ 
	 public float[] pointSizeRange(){
		 float[] var = getPointSizeRange0(super.ptr, pointSizeRange);
		 this.pointSizeRange = var;
		 return this.pointSizeRange;
	 }

	/**
	 * Set method for field lineWidthRange	[float]<br>
	 * Prototype: float[]  lineWidthRange
	 * 
	 * @param lineWidthRange - a instance of float[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits lineWidthRange(float[] lineWidthRange){
		 if(lineWidthRange == null)
		     java.util.Arrays.fill(this.lineWidthRange , 0);
		  else
		     System.arraycopy(lineWidthRange, 0, this.lineWidthRange, 0, this.lineWidthRange.length); 

		 setLineWidthRange0(this.ptr,  this.lineWidthRange);
		 return this;
	 }

	/**
	 * Get method for field lineWidthRange	[float]<br>
	 * Prototype: float[]  lineWidthRange
	 */ 
	 public float[] lineWidthRange(){
		 float[] var = getLineWidthRange0(super.ptr, lineWidthRange);
		 this.lineWidthRange = var;
		 return this.lineWidthRange;
	 }

	/**
	 * Set method for field pointSizeGranularity	[float]<br>
	 * Prototype: float  pointSizeGranularity
	 * 
	 * @param pointSizeGranularity - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits pointSizeGranularity(float pointSizeGranularity){
		 this.pointSizeGranularity = pointSizeGranularity;
		 setPointSizeGranularity0(this.ptr,  pointSizeGranularity);
		 return this;
	 }

	/**
	 * Get method for field pointSizeGranularity	[float]<br>
	 * Prototype: float  pointSizeGranularity
	 */ 
	 public float pointSizeGranularity(){
		 float var = getPointSizeGranularity0(super.ptr);
		 this.pointSizeGranularity = var;
		 return this.pointSizeGranularity;
	 }

	/**
	 * Set method for field lineWidthGranularity	[float]<br>
	 * Prototype: float  lineWidthGranularity
	 * 
	 * @param lineWidthGranularity - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits lineWidthGranularity(float lineWidthGranularity){
		 this.lineWidthGranularity = lineWidthGranularity;
		 setLineWidthGranularity0(this.ptr,  lineWidthGranularity);
		 return this;
	 }

	/**
	 * Get method for field lineWidthGranularity	[float]<br>
	 * Prototype: float  lineWidthGranularity
	 */ 
	 public float lineWidthGranularity(){
		 float var = getLineWidthGranularity0(super.ptr);
		 this.lineWidthGranularity = var;
		 return this.lineWidthGranularity;
	 }

	/**
	 * Set method for field strictLines	[boolean]<br>
	 * Prototype: VkBool32  strictLines
	 * 
	 * @param strictLines - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits strictLines(boolean strictLines){
		 this.strictLines = strictLines;
		 setStrictLines0(this.ptr,  strictLines);
		 return this;
	 }

	/**
	 * Get method for field strictLines	[boolean]<br>
	 * Prototype: VkBool32  strictLines
	 */ 
	 public boolean strictLines(){
		 boolean var = getStrictLines0(super.ptr);
		 this.strictLines = var;
		 return this.strictLines;
	 }

	/**
	 * Set method for field standardSampleLocations	[boolean]<br>
	 * Prototype: VkBool32  standardSampleLocations
	 * 
	 * @param standardSampleLocations - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits standardSampleLocations(boolean standardSampleLocations){
		 this.standardSampleLocations = standardSampleLocations;
		 setStandardSampleLocations0(this.ptr,  standardSampleLocations);
		 return this;
	 }

	/**
	 * Get method for field standardSampleLocations	[boolean]<br>
	 * Prototype: VkBool32  standardSampleLocations
	 */ 
	 public boolean standardSampleLocations(){
		 boolean var = getStandardSampleLocations0(super.ptr);
		 this.standardSampleLocations = var;
		 return this.standardSampleLocations;
	 }

	/**
	 * Set method for field optimalBufferCopyOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyOffsetAlignment
	 * 
	 * @param optimalBufferCopyOffsetAlignment - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits optimalBufferCopyOffsetAlignment(long optimalBufferCopyOffsetAlignment){
		 this.optimalBufferCopyOffsetAlignment = optimalBufferCopyOffsetAlignment;
		 setOptimalBufferCopyOffsetAlignment0(this.ptr,  optimalBufferCopyOffsetAlignment);
		 return this;
	 }

	/**
	 * Get method for field optimalBufferCopyOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyOffsetAlignment
	 */ 
	 public long optimalBufferCopyOffsetAlignment(){
		 long var = getOptimalBufferCopyOffsetAlignment0(super.ptr);
		 this.optimalBufferCopyOffsetAlignment = var;
		 return this.optimalBufferCopyOffsetAlignment;
	 }

	/**
	 * Set method for field optimalBufferCopyRowPitchAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyRowPitchAlignment
	 * 
	 * @param optimalBufferCopyRowPitchAlignment - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits optimalBufferCopyRowPitchAlignment(long optimalBufferCopyRowPitchAlignment){
		 this.optimalBufferCopyRowPitchAlignment = optimalBufferCopyRowPitchAlignment;
		 setOptimalBufferCopyRowPitchAlignment0(this.ptr,  optimalBufferCopyRowPitchAlignment);
		 return this;
	 }

	/**
	 * Get method for field optimalBufferCopyRowPitchAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyRowPitchAlignment
	 */ 
	 public long optimalBufferCopyRowPitchAlignment(){
		 long var = getOptimalBufferCopyRowPitchAlignment0(super.ptr);
		 this.optimalBufferCopyRowPitchAlignment = var;
		 return this.optimalBufferCopyRowPitchAlignment;
	 }

	/**
	 * Set method for field nonCoherentAtomSize	[long]<br>
	 * Prototype: VkDeviceSize  nonCoherentAtomSize
	 * 
	 * @param nonCoherentAtomSize - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceLimits nonCoherentAtomSize(long nonCoherentAtomSize){
		 this.nonCoherentAtomSize = nonCoherentAtomSize;
		 setNonCoherentAtomSize0(this.ptr,  nonCoherentAtomSize);
		 return this;
	 }

	/**
	 * Get method for field nonCoherentAtomSize	[long]<br>
	 * Prototype: VkDeviceSize  nonCoherentAtomSize
	 */ 
	 public long nonCoherentAtomSize(){
		 long var = getNonCoherentAtomSize0(super.ptr);
		 this.nonCoherentAtomSize = var;
		 return this.nonCoherentAtomSize;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkPhysicalDeviceLimits [ ")
				.append("maxImageDimension1D: ").append(maxImageDimension1D() )
				.append(",\n maxImageDimension2D: ")
				.append(maxImageDimension2D() )
				.append(",\n maxImageDimension3D: ")
				.append(maxImageDimension3D() )
				.append(",\n maxImageDimensionCube: ")
				.append(maxImageDimensionCube() )
				.append(",\n maxImageArrayLayers: ")
				.append(maxImageArrayLayers() )
				.append(",\n maxTexelBufferElements: ")
				.append(maxTexelBufferElements() )
				.append(",\n maxUniformBufferRange: ")
				.append(maxUniformBufferRange() )
				.append(",\n maxStorageBufferRange: ")
				.append(maxStorageBufferRange() )
				.append(",\n maxPushConstantsSize: ")
				.append(maxPushConstantsSize() )
				.append(",\n maxMemoryAllocationCount: ")
				.append(maxMemoryAllocationCount() )
				.append(",\n maxSamplerAllocationCount: ")
				.append(maxSamplerAllocationCount() )
				.append(",\n bufferImageGranularity: ")
				.append(bufferImageGranularity() )
				.append(",\n sparseAddressSpaceSize: ")
				.append(sparseAddressSpaceSize() )
				.append(",\n maxBoundDescriptorSets: ")
				.append(maxBoundDescriptorSets() )
				.append(",\n maxPerStageDescriptorSamplers: ")
				.append(maxPerStageDescriptorSamplers() )
				.append(",\n maxPerStageDescriptorUniformBuffers: ")
				.append(maxPerStageDescriptorUniformBuffers() )
				.append(",\n maxPerStageDescriptorStorageBuffers: ")
				.append(maxPerStageDescriptorStorageBuffers() )
				.append(",\n maxPerStageDescriptorSampledImages: ")
				.append(maxPerStageDescriptorSampledImages() )
				.append(",\n maxPerStageDescriptorStorageImages: ")
				.append(maxPerStageDescriptorStorageImages() )
				.append(",\n maxPerStageDescriptorInputAttachments: ")
				.append(maxPerStageDescriptorInputAttachments() )
				.append(",\n maxPerStageResources: ")
				.append(maxPerStageResources() )
				.append(",\n maxDescriptorSetSamplers: ")
				.append(maxDescriptorSetSamplers() )
				.append(",\n maxDescriptorSetUniformBuffers: ")
				.append(maxDescriptorSetUniformBuffers() )
				.append(",\n maxDescriptorSetUniformBuffersDynamic: ")
				.append(maxDescriptorSetUniformBuffersDynamic() )
				.append(",\n maxDescriptorSetStorageBuffers: ")
				.append(maxDescriptorSetStorageBuffers() )
				.append(",\n maxDescriptorSetStorageBuffersDynamic: ")
				.append(maxDescriptorSetStorageBuffersDynamic() )
				.append(",\n maxDescriptorSetSampledImages: ")
				.append(maxDescriptorSetSampledImages() )
				.append(",\n maxDescriptorSetStorageImages: ")
				.append(maxDescriptorSetStorageImages() )
				.append(",\n maxDescriptorSetInputAttachments: ")
				.append(maxDescriptorSetInputAttachments() )
				.append(",\n maxVertexInputAttributes: ")
				.append(maxVertexInputAttributes() )
				.append(",\n maxVertexInputBindings: ")
				.append(maxVertexInputBindings() )
				.append(",\n maxVertexInputAttributeOffset: ")
				.append(maxVertexInputAttributeOffset() )
				.append(",\n maxVertexInputBindingStride: ")
				.append(maxVertexInputBindingStride() )
				.append(",\n maxVertexOutputComponents: ")
				.append(maxVertexOutputComponents() )
				.append(",\n maxTessellationGenerationLevel: ")
				.append(maxTessellationGenerationLevel() )
				.append(",\n maxTessellationPatchSize: ")
				.append(maxTessellationPatchSize() )
				.append(",\n maxTessellationControlPerVertexInputComponents: ")
				.append(maxTessellationControlPerVertexInputComponents() )
				.append(",\n maxTessellationControlPerVertexOutputComponents: ")
				.append(maxTessellationControlPerVertexOutputComponents() )
				.append(",\n maxTessellationControlPerPatchOutputComponents: ")
				.append(maxTessellationControlPerPatchOutputComponents() )
				.append(",\n maxTessellationControlTotalOutputComponents: ")
				.append(maxTessellationControlTotalOutputComponents() )
				.append(",\n maxTessellationEvaluationInputComponents: ")
				.append(maxTessellationEvaluationInputComponents() )
				.append(",\n maxTessellationEvaluationOutputComponents: ")
				.append(maxTessellationEvaluationOutputComponents() )
				.append(",\n maxGeometryShaderInvocations: ")
				.append(maxGeometryShaderInvocations() )
				.append(",\n maxGeometryInputComponents: ")
				.append(maxGeometryInputComponents() )
				.append(",\n maxGeometryOutputComponents: ")
				.append(maxGeometryOutputComponents() )
				.append(",\n maxGeometryOutputVertices: ")
				.append(maxGeometryOutputVertices() )
				.append(",\n maxGeometryTotalOutputComponents: ")
				.append(maxGeometryTotalOutputComponents() )
				.append(",\n maxFragmentInputComponents: ")
				.append(maxFragmentInputComponents() )
				.append(",\n maxFragmentOutputAttachments: ")
				.append(maxFragmentOutputAttachments() )
				.append(",\n maxFragmentDualSrcAttachments: ")
				.append(maxFragmentDualSrcAttachments() )
				.append(",\n maxFragmentCombinedOutputResources: ")
				.append(maxFragmentCombinedOutputResources() )
				.append(",\n maxComputeSharedMemorySize: ")
				.append(maxComputeSharedMemorySize() )
				.append(",\n maxComputeWorkGroupCount: ")
				.append(Arrays.toString(maxComputeWorkGroupCount()) )
				.append(",\n maxComputeWorkGroupInvocations: ")
				.append(maxComputeWorkGroupInvocations() )
				.append(",\n maxComputeWorkGroupSize: ")
				.append(Arrays.toString(maxComputeWorkGroupSize()) )
				.append(",\n subPixelPrecisionBits: ")
				.append(subPixelPrecisionBits() )
				.append(",\n subTexelPrecisionBits: ")
				.append(subTexelPrecisionBits() )
				.append(",\n mipmapPrecisionBits: ")
				.append(mipmapPrecisionBits() )
				.append(",\n maxDrawIndexedIndexValue: ")
				.append(maxDrawIndexedIndexValue() )
				.append(",\n maxDrawIndirectCount: ")
				.append(maxDrawIndirectCount() )
				.append(",\n maxSamplerLodBias: ")
				.append(maxSamplerLodBias() )
				.append(",\n maxSamplerAnisotropy: ")
				.append(maxSamplerAnisotropy() )
				.append(",\n maxViewports: ")
				.append(maxViewports() )
				.append(",\n maxViewportDimensions: ")
				.append(Arrays.toString(maxViewportDimensions()) )
				.append(",\n viewportBoundsRange: ")
				.append(Arrays.toString(viewportBoundsRange()) )
				.append(",\n viewportSubPixelBits: ")
				.append(viewportSubPixelBits() )
				.append(",\n minMemoryMapAlignment: ")
				.append(minMemoryMapAlignment() )
				.append(",\n minTexelBufferOffsetAlignment: ")
				.append(minTexelBufferOffsetAlignment() )
				.append(",\n minUniformBufferOffsetAlignment: ")
				.append(minUniformBufferOffsetAlignment() )
				.append(",\n minStorageBufferOffsetAlignment: ")
				.append(minStorageBufferOffsetAlignment() )
				.append(",\n minTexelOffset: ")
				.append(minTexelOffset() )
				.append(",\n maxTexelOffset: ")
				.append(maxTexelOffset() )
				.append(",\n minTexelGatherOffset: ")
				.append(minTexelGatherOffset() )
				.append(",\n maxTexelGatherOffset: ")
				.append(maxTexelGatherOffset() )
				.append(",\n minInterpolationOffset: ")
				.append(minInterpolationOffset() )
				.append(",\n maxInterpolationOffset: ")
				.append(maxInterpolationOffset() )
				.append(",\n subPixelInterpolationOffsetBits: ")
				.append(subPixelInterpolationOffsetBits() )
				.append(",\n maxFramebufferWidth: ")
				.append(maxFramebufferWidth() )
				.append(",\n maxFramebufferHeight: ")
				.append(maxFramebufferHeight() )
				.append(",\n maxFramebufferLayers: ")
				.append(maxFramebufferLayers() )
				.append(",\n framebufferColorSampleCounts: ")
				.append(framebufferColorSampleCounts() )
				.append(",\n framebufferDepthSampleCounts: ")
				.append(framebufferDepthSampleCounts() )
				.append(",\n framebufferStencilSampleCounts: ")
				.append(framebufferStencilSampleCounts() )
				.append(",\n framebufferNoAttachmentsSampleCounts: ")
				.append(framebufferNoAttachmentsSampleCounts() )
				.append(",\n maxColorAttachments: ")
				.append(maxColorAttachments() )
				.append(",\n sampledImageColorSampleCounts: ")
				.append(sampledImageColorSampleCounts() )
				.append(",\n sampledImageIntegerSampleCounts: ")
				.append(sampledImageIntegerSampleCounts() )
				.append(",\n sampledImageDepthSampleCounts: ")
				.append(sampledImageDepthSampleCounts() )
				.append(",\n sampledImageStencilSampleCounts: ")
				.append(sampledImageStencilSampleCounts() )
				.append(",\n storageImageSampleCounts: ")
				.append(storageImageSampleCounts() )
				.append(",\n maxSampleMaskWords: ")
				.append(maxSampleMaskWords() )
				.append(",\n timestampComputeAndGraphics: ")
				.append(timestampComputeAndGraphics() )
				.append(",\n timestampPeriod: ")
				.append(timestampPeriod() )
				.append(",\n maxClipDistances: ")
				.append(maxClipDistances() )
				.append(",\n maxCullDistances: ")
				.append(maxCullDistances() )
				.append(",\n maxCombinedClipAndCullDistances: ")
				.append(maxCombinedClipAndCullDistances() )
				.append(",\n discreteQueuePriorities: ")
				.append(discreteQueuePriorities() )
				.append(",\n pointSizeRange: ")
				.append(Arrays.toString(pointSizeRange()) )
				.append(",\n lineWidthRange: ")
				.append(Arrays.toString(lineWidthRange()) )
				.append(",\n pointSizeGranularity: ")
				.append(pointSizeGranularity() )
				.append(",\n lineWidthGranularity: ")
				.append(lineWidthGranularity() )
				.append(",\n strictLines: ")
				.append(strictLines() )
				.append(",\n standardSampleLocations: ")
				.append(standardSampleLocations() )
				.append(",\n optimalBufferCopyOffsetAlignment: ")
				.append(optimalBufferCopyOffsetAlignment() )
				.append(",\n optimalBufferCopyRowPitchAlignment: ")
				.append(optimalBufferCopyRowPitchAlignment() )
				.append(",\n nonCoherentAtomSize: ")
				.append(nonCoherentAtomSize() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field maxImageDimension1D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension1D
	 */ 
	 private static native void setMaxImageDimension1D0(Buffer ptr, int _maxImageDimension1D);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxImageDimension1D = (uint32_t) (_maxImageDimension1D);
	  */

	/**
	 * Native GET method for field maxImageDimension1D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension1D
	 */ 
	 private static native int getMaxImageDimension1D0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxImageDimension1D);
	 */

	/**
	 * Native SET method for field maxImageDimension2D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension2D
	 */ 
	 private static native void setMaxImageDimension2D0(Buffer ptr, int _maxImageDimension2D);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxImageDimension2D = (uint32_t) (_maxImageDimension2D);
	  */

	/**
	 * Native GET method for field maxImageDimension2D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension2D
	 */ 
	 private static native int getMaxImageDimension2D0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxImageDimension2D);
	 */

	/**
	 * Native SET method for field maxImageDimension3D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension3D
	 */ 
	 private static native void setMaxImageDimension3D0(Buffer ptr, int _maxImageDimension3D);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxImageDimension3D = (uint32_t) (_maxImageDimension3D);
	  */

	/**
	 * Native GET method for field maxImageDimension3D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension3D
	 */ 
	 private static native int getMaxImageDimension3D0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxImageDimension3D);
	 */

	/**
	 * Native SET method for field maxImageDimensionCube	[int]<br>
	 * Prototype: uint32_t  maxImageDimensionCube
	 */ 
	 private static native void setMaxImageDimensionCube0(Buffer ptr, int _maxImageDimensionCube);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxImageDimensionCube = (uint32_t) (_maxImageDimensionCube);
	  */

	/**
	 * Native GET method for field maxImageDimensionCube	[int]<br>
	 * Prototype: uint32_t  maxImageDimensionCube
	 */ 
	 private static native int getMaxImageDimensionCube0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxImageDimensionCube);
	 */

	/**
	 * Native SET method for field maxImageArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxImageArrayLayers
	 */ 
	 private static native void setMaxImageArrayLayers0(Buffer ptr, int _maxImageArrayLayers);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxImageArrayLayers = (uint32_t) (_maxImageArrayLayers);
	  */

	/**
	 * Native GET method for field maxImageArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxImageArrayLayers
	 */ 
	 private static native int getMaxImageArrayLayers0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxImageArrayLayers);
	 */

	/**
	 * Native SET method for field maxTexelBufferElements	[int]<br>
	 * Prototype: uint32_t  maxTexelBufferElements
	 */ 
	 private static native void setMaxTexelBufferElements0(Buffer ptr, int _maxTexelBufferElements);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTexelBufferElements = (uint32_t) (_maxTexelBufferElements);
	  */

	/**
	 * Native GET method for field maxTexelBufferElements	[int]<br>
	 * Prototype: uint32_t  maxTexelBufferElements
	 */ 
	 private static native int getMaxTexelBufferElements0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTexelBufferElements);
	 */

	/**
	 * Native SET method for field maxUniformBufferRange	[int]<br>
	 * Prototype: uint32_t  maxUniformBufferRange
	 */ 
	 private static native void setMaxUniformBufferRange0(Buffer ptr, int _maxUniformBufferRange);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxUniformBufferRange = (uint32_t) (_maxUniformBufferRange);
	  */

	/**
	 * Native GET method for field maxUniformBufferRange	[int]<br>
	 * Prototype: uint32_t  maxUniformBufferRange
	 */ 
	 private static native int getMaxUniformBufferRange0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxUniformBufferRange);
	 */

	/**
	 * Native SET method for field maxStorageBufferRange	[int]<br>
	 * Prototype: uint32_t  maxStorageBufferRange
	 */ 
	 private static native void setMaxStorageBufferRange0(Buffer ptr, int _maxStorageBufferRange);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxStorageBufferRange = (uint32_t) (_maxStorageBufferRange);
	  */

	/**
	 * Native GET method for field maxStorageBufferRange	[int]<br>
	 * Prototype: uint32_t  maxStorageBufferRange
	 */ 
	 private static native int getMaxStorageBufferRange0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxStorageBufferRange);
	 */

	/**
	 * Native SET method for field maxPushConstantsSize	[int]<br>
	 * Prototype: uint32_t  maxPushConstantsSize
	 */ 
	 private static native void setMaxPushConstantsSize0(Buffer ptr, int _maxPushConstantsSize);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxPushConstantsSize = (uint32_t) (_maxPushConstantsSize);
	  */

	/**
	 * Native GET method for field maxPushConstantsSize	[int]<br>
	 * Prototype: uint32_t  maxPushConstantsSize
	 */ 
	 private static native int getMaxPushConstantsSize0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxPushConstantsSize);
	 */

	/**
	 * Native SET method for field maxMemoryAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxMemoryAllocationCount
	 */ 
	 private static native void setMaxMemoryAllocationCount0(Buffer ptr, int _maxMemoryAllocationCount);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxMemoryAllocationCount = (uint32_t) (_maxMemoryAllocationCount);
	  */

	/**
	 * Native GET method for field maxMemoryAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxMemoryAllocationCount
	 */ 
	 private static native int getMaxMemoryAllocationCount0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxMemoryAllocationCount);
	 */

	/**
	 * Native SET method for field maxSamplerAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxSamplerAllocationCount
	 */ 
	 private static native void setMaxSamplerAllocationCount0(Buffer ptr, int _maxSamplerAllocationCount);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxSamplerAllocationCount = (uint32_t) (_maxSamplerAllocationCount);
	  */

	/**
	 * Native GET method for field maxSamplerAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxSamplerAllocationCount
	 */ 
	 private static native int getMaxSamplerAllocationCount0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxSamplerAllocationCount);
	 */

	/**
	 * Native SET method for field bufferImageGranularity	[long]<br>
	 * Prototype: VkDeviceSize  bufferImageGranularity
	 */ 
	 private static native void setBufferImageGranularity0(Buffer ptr, long _bufferImageGranularity);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->bufferImageGranularity = (VkDeviceSize) (_bufferImageGranularity);
	  */

	/**
	 * Native GET method for field bufferImageGranularity	[long]<br>
	 * Prototype: VkDeviceSize  bufferImageGranularity
	 */ 
	 private static native long getBufferImageGranularity0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->bufferImageGranularity);
	 */

	/**
	 * Native SET method for field sparseAddressSpaceSize	[long]<br>
	 * Prototype: VkDeviceSize  sparseAddressSpaceSize
	 */ 
	 private static native void setSparseAddressSpaceSize0(Buffer ptr, long _sparseAddressSpaceSize);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->sparseAddressSpaceSize = (VkDeviceSize) (_sparseAddressSpaceSize);
	  */

	/**
	 * Native GET method for field sparseAddressSpaceSize	[long]<br>
	 * Prototype: VkDeviceSize  sparseAddressSpaceSize
	 */ 
	 private static native long getSparseAddressSpaceSize0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->sparseAddressSpaceSize);
	 */

	/**
	 * Native SET method for field maxBoundDescriptorSets	[int]<br>
	 * Prototype: uint32_t  maxBoundDescriptorSets
	 */ 
	 private static native void setMaxBoundDescriptorSets0(Buffer ptr, int _maxBoundDescriptorSets);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxBoundDescriptorSets = (uint32_t) (_maxBoundDescriptorSets);
	  */

	/**
	 * Native GET method for field maxBoundDescriptorSets	[int]<br>
	 * Prototype: uint32_t  maxBoundDescriptorSets
	 */ 
	 private static native int getMaxBoundDescriptorSets0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxBoundDescriptorSets);
	 */

	/**
	 * Native SET method for field maxPerStageDescriptorSamplers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSamplers
	 */ 
	 private static native void setMaxPerStageDescriptorSamplers0(Buffer ptr, int _maxPerStageDescriptorSamplers);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxPerStageDescriptorSamplers = (uint32_t) (_maxPerStageDescriptorSamplers);
	  */

	/**
	 * Native GET method for field maxPerStageDescriptorSamplers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSamplers
	 */ 
	 private static native int getMaxPerStageDescriptorSamplers0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxPerStageDescriptorSamplers);
	 */

	/**
	 * Native SET method for field maxPerStageDescriptorUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorUniformBuffers
	 */ 
	 private static native void setMaxPerStageDescriptorUniformBuffers0(Buffer ptr, int _maxPerStageDescriptorUniformBuffers);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxPerStageDescriptorUniformBuffers = (uint32_t) (_maxPerStageDescriptorUniformBuffers);
	  */

	/**
	 * Native GET method for field maxPerStageDescriptorUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorUniformBuffers
	 */ 
	 private static native int getMaxPerStageDescriptorUniformBuffers0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxPerStageDescriptorUniformBuffers);
	 */

	/**
	 * Native SET method for field maxPerStageDescriptorStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageBuffers
	 */ 
	 private static native void setMaxPerStageDescriptorStorageBuffers0(Buffer ptr, int _maxPerStageDescriptorStorageBuffers);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxPerStageDescriptorStorageBuffers = (uint32_t) (_maxPerStageDescriptorStorageBuffers);
	  */

	/**
	 * Native GET method for field maxPerStageDescriptorStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageBuffers
	 */ 
	 private static native int getMaxPerStageDescriptorStorageBuffers0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxPerStageDescriptorStorageBuffers);
	 */

	/**
	 * Native SET method for field maxPerStageDescriptorSampledImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSampledImages
	 */ 
	 private static native void setMaxPerStageDescriptorSampledImages0(Buffer ptr, int _maxPerStageDescriptorSampledImages);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxPerStageDescriptorSampledImages = (uint32_t) (_maxPerStageDescriptorSampledImages);
	  */

	/**
	 * Native GET method for field maxPerStageDescriptorSampledImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSampledImages
	 */ 
	 private static native int getMaxPerStageDescriptorSampledImages0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxPerStageDescriptorSampledImages);
	 */

	/**
	 * Native SET method for field maxPerStageDescriptorStorageImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageImages
	 */ 
	 private static native void setMaxPerStageDescriptorStorageImages0(Buffer ptr, int _maxPerStageDescriptorStorageImages);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxPerStageDescriptorStorageImages = (uint32_t) (_maxPerStageDescriptorStorageImages);
	  */

	/**
	 * Native GET method for field maxPerStageDescriptorStorageImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageImages
	 */ 
	 private static native int getMaxPerStageDescriptorStorageImages0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxPerStageDescriptorStorageImages);
	 */

	/**
	 * Native SET method for field maxPerStageDescriptorInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorInputAttachments
	 */ 
	 private static native void setMaxPerStageDescriptorInputAttachments0(Buffer ptr, int _maxPerStageDescriptorInputAttachments);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxPerStageDescriptorInputAttachments = (uint32_t) (_maxPerStageDescriptorInputAttachments);
	  */

	/**
	 * Native GET method for field maxPerStageDescriptorInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorInputAttachments
	 */ 
	 private static native int getMaxPerStageDescriptorInputAttachments0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxPerStageDescriptorInputAttachments);
	 */

	/**
	 * Native SET method for field maxPerStageResources	[int]<br>
	 * Prototype: uint32_t  maxPerStageResources
	 */ 
	 private static native void setMaxPerStageResources0(Buffer ptr, int _maxPerStageResources);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxPerStageResources = (uint32_t) (_maxPerStageResources);
	  */

	/**
	 * Native GET method for field maxPerStageResources	[int]<br>
	 * Prototype: uint32_t  maxPerStageResources
	 */ 
	 private static native int getMaxPerStageResources0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxPerStageResources);
	 */

	/**
	 * Native SET method for field maxDescriptorSetSamplers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSamplers
	 */ 
	 private static native void setMaxDescriptorSetSamplers0(Buffer ptr, int _maxDescriptorSetSamplers);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDescriptorSetSamplers = (uint32_t) (_maxDescriptorSetSamplers);
	  */

	/**
	 * Native GET method for field maxDescriptorSetSamplers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSamplers
	 */ 
	 private static native int getMaxDescriptorSetSamplers0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDescriptorSetSamplers);
	 */

	/**
	 * Native SET method for field maxDescriptorSetUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffers
	 */ 
	 private static native void setMaxDescriptorSetUniformBuffers0(Buffer ptr, int _maxDescriptorSetUniformBuffers);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDescriptorSetUniformBuffers = (uint32_t) (_maxDescriptorSetUniformBuffers);
	  */

	/**
	 * Native GET method for field maxDescriptorSetUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffers
	 */ 
	 private static native int getMaxDescriptorSetUniformBuffers0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDescriptorSetUniformBuffers);
	 */

	/**
	 * Native SET method for field maxDescriptorSetUniformBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffersDynamic
	 */ 
	 private static native void setMaxDescriptorSetUniformBuffersDynamic0(Buffer ptr, int _maxDescriptorSetUniformBuffersDynamic);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDescriptorSetUniformBuffersDynamic = (uint32_t) (_maxDescriptorSetUniformBuffersDynamic);
	  */

	/**
	 * Native GET method for field maxDescriptorSetUniformBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffersDynamic
	 */ 
	 private static native int getMaxDescriptorSetUniformBuffersDynamic0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDescriptorSetUniformBuffersDynamic);
	 */

	/**
	 * Native SET method for field maxDescriptorSetStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffers
	 */ 
	 private static native void setMaxDescriptorSetStorageBuffers0(Buffer ptr, int _maxDescriptorSetStorageBuffers);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDescriptorSetStorageBuffers = (uint32_t) (_maxDescriptorSetStorageBuffers);
	  */

	/**
	 * Native GET method for field maxDescriptorSetStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffers
	 */ 
	 private static native int getMaxDescriptorSetStorageBuffers0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDescriptorSetStorageBuffers);
	 */

	/**
	 * Native SET method for field maxDescriptorSetStorageBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffersDynamic
	 */ 
	 private static native void setMaxDescriptorSetStorageBuffersDynamic0(Buffer ptr, int _maxDescriptorSetStorageBuffersDynamic);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDescriptorSetStorageBuffersDynamic = (uint32_t) (_maxDescriptorSetStorageBuffersDynamic);
	  */

	/**
	 * Native GET method for field maxDescriptorSetStorageBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffersDynamic
	 */ 
	 private static native int getMaxDescriptorSetStorageBuffersDynamic0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDescriptorSetStorageBuffersDynamic);
	 */

	/**
	 * Native SET method for field maxDescriptorSetSampledImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSampledImages
	 */ 
	 private static native void setMaxDescriptorSetSampledImages0(Buffer ptr, int _maxDescriptorSetSampledImages);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDescriptorSetSampledImages = (uint32_t) (_maxDescriptorSetSampledImages);
	  */

	/**
	 * Native GET method for field maxDescriptorSetSampledImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSampledImages
	 */ 
	 private static native int getMaxDescriptorSetSampledImages0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDescriptorSetSampledImages);
	 */

	/**
	 * Native SET method for field maxDescriptorSetStorageImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageImages
	 */ 
	 private static native void setMaxDescriptorSetStorageImages0(Buffer ptr, int _maxDescriptorSetStorageImages);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDescriptorSetStorageImages = (uint32_t) (_maxDescriptorSetStorageImages);
	  */

	/**
	 * Native GET method for field maxDescriptorSetStorageImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageImages
	 */ 
	 private static native int getMaxDescriptorSetStorageImages0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDescriptorSetStorageImages);
	 */

	/**
	 * Native SET method for field maxDescriptorSetInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetInputAttachments
	 */ 
	 private static native void setMaxDescriptorSetInputAttachments0(Buffer ptr, int _maxDescriptorSetInputAttachments);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDescriptorSetInputAttachments = (uint32_t) (_maxDescriptorSetInputAttachments);
	  */

	/**
	 * Native GET method for field maxDescriptorSetInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetInputAttachments
	 */ 
	 private static native int getMaxDescriptorSetInputAttachments0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDescriptorSetInputAttachments);
	 */

	/**
	 * Native SET method for field maxVertexInputAttributes	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributes
	 */ 
	 private static native void setMaxVertexInputAttributes0(Buffer ptr, int _maxVertexInputAttributes);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxVertexInputAttributes = (uint32_t) (_maxVertexInputAttributes);
	  */

	/**
	 * Native GET method for field maxVertexInputAttributes	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributes
	 */ 
	 private static native int getMaxVertexInputAttributes0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxVertexInputAttributes);
	 */

	/**
	 * Native SET method for field maxVertexInputBindings	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindings
	 */ 
	 private static native void setMaxVertexInputBindings0(Buffer ptr, int _maxVertexInputBindings);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxVertexInputBindings = (uint32_t) (_maxVertexInputBindings);
	  */

	/**
	 * Native GET method for field maxVertexInputBindings	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindings
	 */ 
	 private static native int getMaxVertexInputBindings0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxVertexInputBindings);
	 */

	/**
	 * Native SET method for field maxVertexInputAttributeOffset	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributeOffset
	 */ 
	 private static native void setMaxVertexInputAttributeOffset0(Buffer ptr, int _maxVertexInputAttributeOffset);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxVertexInputAttributeOffset = (uint32_t) (_maxVertexInputAttributeOffset);
	  */

	/**
	 * Native GET method for field maxVertexInputAttributeOffset	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributeOffset
	 */ 
	 private static native int getMaxVertexInputAttributeOffset0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxVertexInputAttributeOffset);
	 */

	/**
	 * Native SET method for field maxVertexInputBindingStride	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindingStride
	 */ 
	 private static native void setMaxVertexInputBindingStride0(Buffer ptr, int _maxVertexInputBindingStride);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxVertexInputBindingStride = (uint32_t) (_maxVertexInputBindingStride);
	  */

	/**
	 * Native GET method for field maxVertexInputBindingStride	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindingStride
	 */ 
	 private static native int getMaxVertexInputBindingStride0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxVertexInputBindingStride);
	 */

	/**
	 * Native SET method for field maxVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxVertexOutputComponents
	 */ 
	 private static native void setMaxVertexOutputComponents0(Buffer ptr, int _maxVertexOutputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxVertexOutputComponents = (uint32_t) (_maxVertexOutputComponents);
	  */

	/**
	 * Native GET method for field maxVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxVertexOutputComponents
	 */ 
	 private static native int getMaxVertexOutputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxVertexOutputComponents);
	 */

	/**
	 * Native SET method for field maxTessellationGenerationLevel	[int]<br>
	 * Prototype: uint32_t  maxTessellationGenerationLevel
	 */ 
	 private static native void setMaxTessellationGenerationLevel0(Buffer ptr, int _maxTessellationGenerationLevel);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTessellationGenerationLevel = (uint32_t) (_maxTessellationGenerationLevel);
	  */

	/**
	 * Native GET method for field maxTessellationGenerationLevel	[int]<br>
	 * Prototype: uint32_t  maxTessellationGenerationLevel
	 */ 
	 private static native int getMaxTessellationGenerationLevel0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTessellationGenerationLevel);
	 */

	/**
	 * Native SET method for field maxTessellationPatchSize	[int]<br>
	 * Prototype: uint32_t  maxTessellationPatchSize
	 */ 
	 private static native void setMaxTessellationPatchSize0(Buffer ptr, int _maxTessellationPatchSize);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTessellationPatchSize = (uint32_t) (_maxTessellationPatchSize);
	  */

	/**
	 * Native GET method for field maxTessellationPatchSize	[int]<br>
	 * Prototype: uint32_t  maxTessellationPatchSize
	 */ 
	 private static native int getMaxTessellationPatchSize0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTessellationPatchSize);
	 */

	/**
	 * Native SET method for field maxTessellationControlPerVertexInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexInputComponents
	 */ 
	 private static native void setMaxTessellationControlPerVertexInputComponents0(Buffer ptr, int _maxTessellationControlPerVertexInputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTessellationControlPerVertexInputComponents = (uint32_t) (_maxTessellationControlPerVertexInputComponents);
	  */

	/**
	 * Native GET method for field maxTessellationControlPerVertexInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexInputComponents
	 */ 
	 private static native int getMaxTessellationControlPerVertexInputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTessellationControlPerVertexInputComponents);
	 */

	/**
	 * Native SET method for field maxTessellationControlPerVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexOutputComponents
	 */ 
	 private static native void setMaxTessellationControlPerVertexOutputComponents0(Buffer ptr, int _maxTessellationControlPerVertexOutputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTessellationControlPerVertexOutputComponents = (uint32_t) (_maxTessellationControlPerVertexOutputComponents);
	  */

	/**
	 * Native GET method for field maxTessellationControlPerVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexOutputComponents
	 */ 
	 private static native int getMaxTessellationControlPerVertexOutputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTessellationControlPerVertexOutputComponents);
	 */

	/**
	 * Native SET method for field maxTessellationControlPerPatchOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerPatchOutputComponents
	 */ 
	 private static native void setMaxTessellationControlPerPatchOutputComponents0(Buffer ptr, int _maxTessellationControlPerPatchOutputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTessellationControlPerPatchOutputComponents = (uint32_t) (_maxTessellationControlPerPatchOutputComponents);
	  */

	/**
	 * Native GET method for field maxTessellationControlPerPatchOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerPatchOutputComponents
	 */ 
	 private static native int getMaxTessellationControlPerPatchOutputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTessellationControlPerPatchOutputComponents);
	 */

	/**
	 * Native SET method for field maxTessellationControlTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlTotalOutputComponents
	 */ 
	 private static native void setMaxTessellationControlTotalOutputComponents0(Buffer ptr, int _maxTessellationControlTotalOutputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTessellationControlTotalOutputComponents = (uint32_t) (_maxTessellationControlTotalOutputComponents);
	  */

	/**
	 * Native GET method for field maxTessellationControlTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlTotalOutputComponents
	 */ 
	 private static native int getMaxTessellationControlTotalOutputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTessellationControlTotalOutputComponents);
	 */

	/**
	 * Native SET method for field maxTessellationEvaluationInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationInputComponents
	 */ 
	 private static native void setMaxTessellationEvaluationInputComponents0(Buffer ptr, int _maxTessellationEvaluationInputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTessellationEvaluationInputComponents = (uint32_t) (_maxTessellationEvaluationInputComponents);
	  */

	/**
	 * Native GET method for field maxTessellationEvaluationInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationInputComponents
	 */ 
	 private static native int getMaxTessellationEvaluationInputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTessellationEvaluationInputComponents);
	 */

	/**
	 * Native SET method for field maxTessellationEvaluationOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationOutputComponents
	 */ 
	 private static native void setMaxTessellationEvaluationOutputComponents0(Buffer ptr, int _maxTessellationEvaluationOutputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTessellationEvaluationOutputComponents = (uint32_t) (_maxTessellationEvaluationOutputComponents);
	  */

	/**
	 * Native GET method for field maxTessellationEvaluationOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationOutputComponents
	 */ 
	 private static native int getMaxTessellationEvaluationOutputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTessellationEvaluationOutputComponents);
	 */

	/**
	 * Native SET method for field maxGeometryShaderInvocations	[int]<br>
	 * Prototype: uint32_t  maxGeometryShaderInvocations
	 */ 
	 private static native void setMaxGeometryShaderInvocations0(Buffer ptr, int _maxGeometryShaderInvocations);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxGeometryShaderInvocations = (uint32_t) (_maxGeometryShaderInvocations);
	  */

	/**
	 * Native GET method for field maxGeometryShaderInvocations	[int]<br>
	 * Prototype: uint32_t  maxGeometryShaderInvocations
	 */ 
	 private static native int getMaxGeometryShaderInvocations0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxGeometryShaderInvocations);
	 */

	/**
	 * Native SET method for field maxGeometryInputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryInputComponents
	 */ 
	 private static native void setMaxGeometryInputComponents0(Buffer ptr, int _maxGeometryInputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxGeometryInputComponents = (uint32_t) (_maxGeometryInputComponents);
	  */

	/**
	 * Native GET method for field maxGeometryInputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryInputComponents
	 */ 
	 private static native int getMaxGeometryInputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxGeometryInputComponents);
	 */

	/**
	 * Native SET method for field maxGeometryOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputComponents
	 */ 
	 private static native void setMaxGeometryOutputComponents0(Buffer ptr, int _maxGeometryOutputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxGeometryOutputComponents = (uint32_t) (_maxGeometryOutputComponents);
	  */

	/**
	 * Native GET method for field maxGeometryOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputComponents
	 */ 
	 private static native int getMaxGeometryOutputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxGeometryOutputComponents);
	 */

	/**
	 * Native SET method for field maxGeometryOutputVertices	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputVertices
	 */ 
	 private static native void setMaxGeometryOutputVertices0(Buffer ptr, int _maxGeometryOutputVertices);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxGeometryOutputVertices = (uint32_t) (_maxGeometryOutputVertices);
	  */

	/**
	 * Native GET method for field maxGeometryOutputVertices	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputVertices
	 */ 
	 private static native int getMaxGeometryOutputVertices0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxGeometryOutputVertices);
	 */

	/**
	 * Native SET method for field maxGeometryTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryTotalOutputComponents
	 */ 
	 private static native void setMaxGeometryTotalOutputComponents0(Buffer ptr, int _maxGeometryTotalOutputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxGeometryTotalOutputComponents = (uint32_t) (_maxGeometryTotalOutputComponents);
	  */

	/**
	 * Native GET method for field maxGeometryTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryTotalOutputComponents
	 */ 
	 private static native int getMaxGeometryTotalOutputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxGeometryTotalOutputComponents);
	 */

	/**
	 * Native SET method for field maxFragmentInputComponents	[int]<br>
	 * Prototype: uint32_t  maxFragmentInputComponents
	 */ 
	 private static native void setMaxFragmentInputComponents0(Buffer ptr, int _maxFragmentInputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxFragmentInputComponents = (uint32_t) (_maxFragmentInputComponents);
	  */

	/**
	 * Native GET method for field maxFragmentInputComponents	[int]<br>
	 * Prototype: uint32_t  maxFragmentInputComponents
	 */ 
	 private static native int getMaxFragmentInputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxFragmentInputComponents);
	 */

	/**
	 * Native SET method for field maxFragmentOutputAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentOutputAttachments
	 */ 
	 private static native void setMaxFragmentOutputAttachments0(Buffer ptr, int _maxFragmentOutputAttachments);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxFragmentOutputAttachments = (uint32_t) (_maxFragmentOutputAttachments);
	  */

	/**
	 * Native GET method for field maxFragmentOutputAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentOutputAttachments
	 */ 
	 private static native int getMaxFragmentOutputAttachments0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxFragmentOutputAttachments);
	 */

	/**
	 * Native SET method for field maxFragmentDualSrcAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentDualSrcAttachments
	 */ 
	 private static native void setMaxFragmentDualSrcAttachments0(Buffer ptr, int _maxFragmentDualSrcAttachments);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxFragmentDualSrcAttachments = (uint32_t) (_maxFragmentDualSrcAttachments);
	  */

	/**
	 * Native GET method for field maxFragmentDualSrcAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentDualSrcAttachments
	 */ 
	 private static native int getMaxFragmentDualSrcAttachments0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxFragmentDualSrcAttachments);
	 */

	/**
	 * Native SET method for field maxFragmentCombinedOutputResources	[int]<br>
	 * Prototype: uint32_t  maxFragmentCombinedOutputResources
	 */ 
	 private static native void setMaxFragmentCombinedOutputResources0(Buffer ptr, int _maxFragmentCombinedOutputResources);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxFragmentCombinedOutputResources = (uint32_t) (_maxFragmentCombinedOutputResources);
	  */

	/**
	 * Native GET method for field maxFragmentCombinedOutputResources	[int]<br>
	 * Prototype: uint32_t  maxFragmentCombinedOutputResources
	 */ 
	 private static native int getMaxFragmentCombinedOutputResources0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxFragmentCombinedOutputResources);
	 */

	/**
	 * Native SET method for field maxComputeSharedMemorySize	[int]<br>
	 * Prototype: uint32_t  maxComputeSharedMemorySize
	 */ 
	 private static native void setMaxComputeSharedMemorySize0(Buffer ptr, int _maxComputeSharedMemorySize);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxComputeSharedMemorySize = (uint32_t) (_maxComputeSharedMemorySize);
	  */

	/**
	 * Native GET method for field maxComputeSharedMemorySize	[int]<br>
	 * Prototype: uint32_t  maxComputeSharedMemorySize
	 */ 
	 private static native int getMaxComputeSharedMemorySize0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxComputeSharedMemorySize);
	 */

	/**
	 * Native SET method for field maxComputeWorkGroupCount	[int]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupCount
	 */ 
	 private static native void setMaxComputeWorkGroupCount0(Buffer ptr, int[] _maxComputeWorkGroupCount);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  memcpy(&(vkObj->maxComputeWorkGroupCount), &_maxComputeWorkGroupCount, 3 * sizeof(uint32_t));
	  */

	/**
	 * Native GET method for field maxComputeWorkGroupCount	[int]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupCount
	 */ 
	 private static native int[] getMaxComputeWorkGroupCount0(Buffer ptr, int[] maxComputeWorkGroupCount);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  memcpy(&_maxComputeWorkGroupCount, &(vkObj->maxComputeWorkGroupCount), 3 * sizeof(uint32_t));
		  return _maxComputeWorkGroupCount;
	 */

	/**
	 * Native SET method for field maxComputeWorkGroupInvocations	[int]<br>
	 * Prototype: uint32_t  maxComputeWorkGroupInvocations
	 */ 
	 private static native void setMaxComputeWorkGroupInvocations0(Buffer ptr, int _maxComputeWorkGroupInvocations);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxComputeWorkGroupInvocations = (uint32_t) (_maxComputeWorkGroupInvocations);
	  */

	/**
	 * Native GET method for field maxComputeWorkGroupInvocations	[int]<br>
	 * Prototype: uint32_t  maxComputeWorkGroupInvocations
	 */ 
	 private static native int getMaxComputeWorkGroupInvocations0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxComputeWorkGroupInvocations);
	 */

	/**
	 * Native SET method for field maxComputeWorkGroupSize	[int]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupSize
	 */ 
	 private static native void setMaxComputeWorkGroupSize0(Buffer ptr, int[] _maxComputeWorkGroupSize);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  memcpy(&(vkObj->maxComputeWorkGroupSize), &_maxComputeWorkGroupSize, 3 * sizeof(uint32_t));
	  */

	/**
	 * Native GET method for field maxComputeWorkGroupSize	[int]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupSize
	 */ 
	 private static native int[] getMaxComputeWorkGroupSize0(Buffer ptr, int[] maxComputeWorkGroupSize);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  memcpy(&_maxComputeWorkGroupSize, &(vkObj->maxComputeWorkGroupSize), 3 * sizeof(uint32_t));
		  return _maxComputeWorkGroupSize;
	 */

	/**
	 * Native SET method for field subPixelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subPixelPrecisionBits
	 */ 
	 private static native void setSubPixelPrecisionBits0(Buffer ptr, int _subPixelPrecisionBits);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->subPixelPrecisionBits = (uint32_t) (_subPixelPrecisionBits);
	  */

	/**
	 * Native GET method for field subPixelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subPixelPrecisionBits
	 */ 
	 private static native int getSubPixelPrecisionBits0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->subPixelPrecisionBits);
	 */

	/**
	 * Native SET method for field subTexelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subTexelPrecisionBits
	 */ 
	 private static native void setSubTexelPrecisionBits0(Buffer ptr, int _subTexelPrecisionBits);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->subTexelPrecisionBits = (uint32_t) (_subTexelPrecisionBits);
	  */

	/**
	 * Native GET method for field subTexelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subTexelPrecisionBits
	 */ 
	 private static native int getSubTexelPrecisionBits0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->subTexelPrecisionBits);
	 */

	/**
	 * Native SET method for field mipmapPrecisionBits	[int]<br>
	 * Prototype: uint32_t  mipmapPrecisionBits
	 */ 
	 private static native void setMipmapPrecisionBits0(Buffer ptr, int _mipmapPrecisionBits);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->mipmapPrecisionBits = (uint32_t) (_mipmapPrecisionBits);
	  */

	/**
	 * Native GET method for field mipmapPrecisionBits	[int]<br>
	 * Prototype: uint32_t  mipmapPrecisionBits
	 */ 
	 private static native int getMipmapPrecisionBits0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->mipmapPrecisionBits);
	 */

	/**
	 * Native SET method for field maxDrawIndexedIndexValue	[int]<br>
	 * Prototype: uint32_t  maxDrawIndexedIndexValue
	 */ 
	 private static native void setMaxDrawIndexedIndexValue0(Buffer ptr, int _maxDrawIndexedIndexValue);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDrawIndexedIndexValue = (uint32_t) (_maxDrawIndexedIndexValue);
	  */

	/**
	 * Native GET method for field maxDrawIndexedIndexValue	[int]<br>
	 * Prototype: uint32_t  maxDrawIndexedIndexValue
	 */ 
	 private static native int getMaxDrawIndexedIndexValue0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDrawIndexedIndexValue);
	 */

	/**
	 * Native SET method for field maxDrawIndirectCount	[int]<br>
	 * Prototype: uint32_t  maxDrawIndirectCount
	 */ 
	 private static native void setMaxDrawIndirectCount0(Buffer ptr, int _maxDrawIndirectCount);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDrawIndirectCount = (uint32_t) (_maxDrawIndirectCount);
	  */

	/**
	 * Native GET method for field maxDrawIndirectCount	[int]<br>
	 * Prototype: uint32_t  maxDrawIndirectCount
	 */ 
	 private static native int getMaxDrawIndirectCount0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDrawIndirectCount);
	 */

	/**
	 * Native SET method for field maxSamplerLodBias	[float]<br>
	 * Prototype: float  maxSamplerLodBias
	 */ 
	 private static native void setMaxSamplerLodBias0(Buffer ptr, float _maxSamplerLodBias);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxSamplerLodBias = (float) (_maxSamplerLodBias);
	  */

	/**
	 * Native GET method for field maxSamplerLodBias	[float]<br>
	 * Prototype: float  maxSamplerLodBias
	 */ 
	 private static native float getMaxSamplerLodBias0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jfloat) (vkObj->maxSamplerLodBias);
	 */

	/**
	 * Native SET method for field maxSamplerAnisotropy	[float]<br>
	 * Prototype: float  maxSamplerAnisotropy
	 */ 
	 private static native void setMaxSamplerAnisotropy0(Buffer ptr, float _maxSamplerAnisotropy);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxSamplerAnisotropy = (float) (_maxSamplerAnisotropy);
	  */

	/**
	 * Native GET method for field maxSamplerAnisotropy	[float]<br>
	 * Prototype: float  maxSamplerAnisotropy
	 */ 
	 private static native float getMaxSamplerAnisotropy0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jfloat) (vkObj->maxSamplerAnisotropy);
	 */

	/**
	 * Native SET method for field maxViewports	[int]<br>
	 * Prototype: uint32_t  maxViewports
	 */ 
	 private static native void setMaxViewports0(Buffer ptr, int _maxViewports);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxViewports = (uint32_t) (_maxViewports);
	  */

	/**
	 * Native GET method for field maxViewports	[int]<br>
	 * Prototype: uint32_t  maxViewports
	 */ 
	 private static native int getMaxViewports0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxViewports);
	 */

	/**
	 * Native SET method for field maxViewportDimensions	[int]<br>
	 * Prototype: uint32_t[]  maxViewportDimensions
	 */ 
	 private static native void setMaxViewportDimensions0(Buffer ptr, int[] _maxViewportDimensions);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  memcpy(&(vkObj->maxViewportDimensions), &_maxViewportDimensions, 2 * sizeof(uint32_t));
	  */

	/**
	 * Native GET method for field maxViewportDimensions	[int]<br>
	 * Prototype: uint32_t[]  maxViewportDimensions
	 */ 
	 private static native int[] getMaxViewportDimensions0(Buffer ptr, int[] maxViewportDimensions);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  memcpy(&_maxViewportDimensions, &(vkObj->maxViewportDimensions), 2 * sizeof(uint32_t));
		  return _maxViewportDimensions;
	 */

	/**
	 * Native SET method for field viewportBoundsRange	[float]<br>
	 * Prototype: float[]  viewportBoundsRange
	 */ 
	 private static native void setViewportBoundsRange0(Buffer ptr, float[] _viewportBoundsRange);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  memcpy(&(vkObj->viewportBoundsRange), &_viewportBoundsRange, 2 * sizeof(float));
	  */

	/**
	 * Native GET method for field viewportBoundsRange	[float]<br>
	 * Prototype: float[]  viewportBoundsRange
	 */ 
	 private static native float[] getViewportBoundsRange0(Buffer ptr, float[] viewportBoundsRange);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  memcpy(&_viewportBoundsRange, &(vkObj->viewportBoundsRange), 2 * sizeof(float));
		  return _viewportBoundsRange;
	 */

	/**
	 * Native SET method for field viewportSubPixelBits	[int]<br>
	 * Prototype: uint32_t  viewportSubPixelBits
	 */ 
	 private static native void setViewportSubPixelBits0(Buffer ptr, int _viewportSubPixelBits);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->viewportSubPixelBits = (uint32_t) (_viewportSubPixelBits);
	  */

	/**
	 * Native GET method for field viewportSubPixelBits	[int]<br>
	 * Prototype: uint32_t  viewportSubPixelBits
	 */ 
	 private static native int getViewportSubPixelBits0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->viewportSubPixelBits);
	 */

	/**
	 * Native SET method for field minMemoryMapAlignment	[long]<br>
	 * Prototype: size_t  minMemoryMapAlignment
	 */ 
	 private static native void setMinMemoryMapAlignment0(Buffer ptr, long _minMemoryMapAlignment);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->minMemoryMapAlignment = (size_t) (_minMemoryMapAlignment);
	  */

	/**
	 * Native GET method for field minMemoryMapAlignment	[long]<br>
	 * Prototype: size_t  minMemoryMapAlignment
	 */ 
	 private static native long getMinMemoryMapAlignment0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->minMemoryMapAlignment);
	 */

	/**
	 * Native SET method for field minTexelBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minTexelBufferOffsetAlignment
	 */ 
	 private static native void setMinTexelBufferOffsetAlignment0(Buffer ptr, long _minTexelBufferOffsetAlignment);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->minTexelBufferOffsetAlignment = (VkDeviceSize) (_minTexelBufferOffsetAlignment);
	  */

	/**
	 * Native GET method for field minTexelBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minTexelBufferOffsetAlignment
	 */ 
	 private static native long getMinTexelBufferOffsetAlignment0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->minTexelBufferOffsetAlignment);
	 */

	/**
	 * Native SET method for field minUniformBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minUniformBufferOffsetAlignment
	 */ 
	 private static native void setMinUniformBufferOffsetAlignment0(Buffer ptr, long _minUniformBufferOffsetAlignment);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->minUniformBufferOffsetAlignment = (VkDeviceSize) (_minUniformBufferOffsetAlignment);
	  */

	/**
	 * Native GET method for field minUniformBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minUniformBufferOffsetAlignment
	 */ 
	 private static native long getMinUniformBufferOffsetAlignment0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->minUniformBufferOffsetAlignment);
	 */

	/**
	 * Native SET method for field minStorageBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minStorageBufferOffsetAlignment
	 */ 
	 private static native void setMinStorageBufferOffsetAlignment0(Buffer ptr, long _minStorageBufferOffsetAlignment);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->minStorageBufferOffsetAlignment = (VkDeviceSize) (_minStorageBufferOffsetAlignment);
	  */

	/**
	 * Native GET method for field minStorageBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minStorageBufferOffsetAlignment
	 */ 
	 private static native long getMinStorageBufferOffsetAlignment0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->minStorageBufferOffsetAlignment);
	 */

	/**
	 * Native SET method for field minTexelOffset	[int]<br>
	 * Prototype: int32_t  minTexelOffset
	 */ 
	 private static native void setMinTexelOffset0(Buffer ptr, int _minTexelOffset);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->minTexelOffset = (int32_t) (_minTexelOffset);
	  */

	/**
	 * Native GET method for field minTexelOffset	[int]<br>
	 * Prototype: int32_t  minTexelOffset
	 */ 
	 private static native int getMinTexelOffset0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->minTexelOffset);
	 */

	/**
	 * Native SET method for field maxTexelOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelOffset
	 */ 
	 private static native void setMaxTexelOffset0(Buffer ptr, int _maxTexelOffset);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTexelOffset = (uint32_t) (_maxTexelOffset);
	  */

	/**
	 * Native GET method for field maxTexelOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelOffset
	 */ 
	 private static native int getMaxTexelOffset0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTexelOffset);
	 */

	/**
	 * Native SET method for field minTexelGatherOffset	[int]<br>
	 * Prototype: int32_t  minTexelGatherOffset
	 */ 
	 private static native void setMinTexelGatherOffset0(Buffer ptr, int _minTexelGatherOffset);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->minTexelGatherOffset = (int32_t) (_minTexelGatherOffset);
	  */

	/**
	 * Native GET method for field minTexelGatherOffset	[int]<br>
	 * Prototype: int32_t  minTexelGatherOffset
	 */ 
	 private static native int getMinTexelGatherOffset0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->minTexelGatherOffset);
	 */

	/**
	 * Native SET method for field maxTexelGatherOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelGatherOffset
	 */ 
	 private static native void setMaxTexelGatherOffset0(Buffer ptr, int _maxTexelGatherOffset);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTexelGatherOffset = (uint32_t) (_maxTexelGatherOffset);
	  */

	/**
	 * Native GET method for field maxTexelGatherOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelGatherOffset
	 */ 
	 private static native int getMaxTexelGatherOffset0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTexelGatherOffset);
	 */

	/**
	 * Native SET method for field minInterpolationOffset	[float]<br>
	 * Prototype: float  minInterpolationOffset
	 */ 
	 private static native void setMinInterpolationOffset0(Buffer ptr, float _minInterpolationOffset);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->minInterpolationOffset = (float) (_minInterpolationOffset);
	  */

	/**
	 * Native GET method for field minInterpolationOffset	[float]<br>
	 * Prototype: float  minInterpolationOffset
	 */ 
	 private static native float getMinInterpolationOffset0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jfloat) (vkObj->minInterpolationOffset);
	 */

	/**
	 * Native SET method for field maxInterpolationOffset	[float]<br>
	 * Prototype: float  maxInterpolationOffset
	 */ 
	 private static native void setMaxInterpolationOffset0(Buffer ptr, float _maxInterpolationOffset);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxInterpolationOffset = (float) (_maxInterpolationOffset);
	  */

	/**
	 * Native GET method for field maxInterpolationOffset	[float]<br>
	 * Prototype: float  maxInterpolationOffset
	 */ 
	 private static native float getMaxInterpolationOffset0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jfloat) (vkObj->maxInterpolationOffset);
	 */

	/**
	 * Native SET method for field subPixelInterpolationOffsetBits	[int]<br>
	 * Prototype: uint32_t  subPixelInterpolationOffsetBits
	 */ 
	 private static native void setSubPixelInterpolationOffsetBits0(Buffer ptr, int _subPixelInterpolationOffsetBits);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->subPixelInterpolationOffsetBits = (uint32_t) (_subPixelInterpolationOffsetBits);
	  */

	/**
	 * Native GET method for field subPixelInterpolationOffsetBits	[int]<br>
	 * Prototype: uint32_t  subPixelInterpolationOffsetBits
	 */ 
	 private static native int getSubPixelInterpolationOffsetBits0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->subPixelInterpolationOffsetBits);
	 */

	/**
	 * Native SET method for field maxFramebufferWidth	[int]<br>
	 * Prototype: uint32_t  maxFramebufferWidth
	 */ 
	 private static native void setMaxFramebufferWidth0(Buffer ptr, int _maxFramebufferWidth);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxFramebufferWidth = (uint32_t) (_maxFramebufferWidth);
	  */

	/**
	 * Native GET method for field maxFramebufferWidth	[int]<br>
	 * Prototype: uint32_t  maxFramebufferWidth
	 */ 
	 private static native int getMaxFramebufferWidth0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxFramebufferWidth);
	 */

	/**
	 * Native SET method for field maxFramebufferHeight	[int]<br>
	 * Prototype: uint32_t  maxFramebufferHeight
	 */ 
	 private static native void setMaxFramebufferHeight0(Buffer ptr, int _maxFramebufferHeight);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxFramebufferHeight = (uint32_t) (_maxFramebufferHeight);
	  */

	/**
	 * Native GET method for field maxFramebufferHeight	[int]<br>
	 * Prototype: uint32_t  maxFramebufferHeight
	 */ 
	 private static native int getMaxFramebufferHeight0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxFramebufferHeight);
	 */

	/**
	 * Native SET method for field maxFramebufferLayers	[int]<br>
	 * Prototype: uint32_t  maxFramebufferLayers
	 */ 
	 private static native void setMaxFramebufferLayers0(Buffer ptr, int _maxFramebufferLayers);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxFramebufferLayers = (uint32_t) (_maxFramebufferLayers);
	  */

	/**
	 * Native GET method for field maxFramebufferLayers	[int]<br>
	 * Prototype: uint32_t  maxFramebufferLayers
	 */ 
	 private static native int getMaxFramebufferLayers0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxFramebufferLayers);
	 */

	/**
	 * Native SET method for field framebufferColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferColorSampleCounts
	 */ 
	 private static native void setFramebufferColorSampleCounts0(Buffer ptr, int _framebufferColorSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->framebufferColorSampleCounts = (VkSampleCountFlags) (_framebufferColorSampleCounts);
	  */

	/**
	 * Native GET method for field framebufferColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferColorSampleCounts
	 */ 
	 private static native int getFramebufferColorSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->framebufferColorSampleCounts);
	 */

	/**
	 * Native SET method for field framebufferDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferDepthSampleCounts
	 */ 
	 private static native void setFramebufferDepthSampleCounts0(Buffer ptr, int _framebufferDepthSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->framebufferDepthSampleCounts = (VkSampleCountFlags) (_framebufferDepthSampleCounts);
	  */

	/**
	 * Native GET method for field framebufferDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferDepthSampleCounts
	 */ 
	 private static native int getFramebufferDepthSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->framebufferDepthSampleCounts);
	 */

	/**
	 * Native SET method for field framebufferStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferStencilSampleCounts
	 */ 
	 private static native void setFramebufferStencilSampleCounts0(Buffer ptr, int _framebufferStencilSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->framebufferStencilSampleCounts = (VkSampleCountFlags) (_framebufferStencilSampleCounts);
	  */

	/**
	 * Native GET method for field framebufferStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferStencilSampleCounts
	 */ 
	 private static native int getFramebufferStencilSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->framebufferStencilSampleCounts);
	 */

	/**
	 * Native SET method for field framebufferNoAttachmentsSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferNoAttachmentsSampleCounts
	 */ 
	 private static native void setFramebufferNoAttachmentsSampleCounts0(Buffer ptr, int _framebufferNoAttachmentsSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->framebufferNoAttachmentsSampleCounts = (VkSampleCountFlags) (_framebufferNoAttachmentsSampleCounts);
	  */

	/**
	 * Native GET method for field framebufferNoAttachmentsSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferNoAttachmentsSampleCounts
	 */ 
	 private static native int getFramebufferNoAttachmentsSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->framebufferNoAttachmentsSampleCounts);
	 */

	/**
	 * Native SET method for field maxColorAttachments	[int]<br>
	 * Prototype: uint32_t  maxColorAttachments
	 */ 
	 private static native void setMaxColorAttachments0(Buffer ptr, int _maxColorAttachments);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxColorAttachments = (uint32_t) (_maxColorAttachments);
	  */

	/**
	 * Native GET method for field maxColorAttachments	[int]<br>
	 * Prototype: uint32_t  maxColorAttachments
	 */ 
	 private static native int getMaxColorAttachments0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxColorAttachments);
	 */

	/**
	 * Native SET method for field sampledImageColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageColorSampleCounts
	 */ 
	 private static native void setSampledImageColorSampleCounts0(Buffer ptr, int _sampledImageColorSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->sampledImageColorSampleCounts = (VkSampleCountFlags) (_sampledImageColorSampleCounts);
	  */

	/**
	 * Native GET method for field sampledImageColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageColorSampleCounts
	 */ 
	 private static native int getSampledImageColorSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->sampledImageColorSampleCounts);
	 */

	/**
	 * Native SET method for field sampledImageIntegerSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageIntegerSampleCounts
	 */ 
	 private static native void setSampledImageIntegerSampleCounts0(Buffer ptr, int _sampledImageIntegerSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->sampledImageIntegerSampleCounts = (VkSampleCountFlags) (_sampledImageIntegerSampleCounts);
	  */

	/**
	 * Native GET method for field sampledImageIntegerSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageIntegerSampleCounts
	 */ 
	 private static native int getSampledImageIntegerSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->sampledImageIntegerSampleCounts);
	 */

	/**
	 * Native SET method for field sampledImageDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageDepthSampleCounts
	 */ 
	 private static native void setSampledImageDepthSampleCounts0(Buffer ptr, int _sampledImageDepthSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->sampledImageDepthSampleCounts = (VkSampleCountFlags) (_sampledImageDepthSampleCounts);
	  */

	/**
	 * Native GET method for field sampledImageDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageDepthSampleCounts
	 */ 
	 private static native int getSampledImageDepthSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->sampledImageDepthSampleCounts);
	 */

	/**
	 * Native SET method for field sampledImageStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageStencilSampleCounts
	 */ 
	 private static native void setSampledImageStencilSampleCounts0(Buffer ptr, int _sampledImageStencilSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->sampledImageStencilSampleCounts = (VkSampleCountFlags) (_sampledImageStencilSampleCounts);
	  */

	/**
	 * Native GET method for field sampledImageStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageStencilSampleCounts
	 */ 
	 private static native int getSampledImageStencilSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->sampledImageStencilSampleCounts);
	 */

	/**
	 * Native SET method for field storageImageSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  storageImageSampleCounts
	 */ 
	 private static native void setStorageImageSampleCounts0(Buffer ptr, int _storageImageSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->storageImageSampleCounts = (VkSampleCountFlags) (_storageImageSampleCounts);
	  */

	/**
	 * Native GET method for field storageImageSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  storageImageSampleCounts
	 */ 
	 private static native int getStorageImageSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->storageImageSampleCounts);
	 */

	/**
	 * Native SET method for field maxSampleMaskWords	[int]<br>
	 * Prototype: uint32_t  maxSampleMaskWords
	 */ 
	 private static native void setMaxSampleMaskWords0(Buffer ptr, int _maxSampleMaskWords);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxSampleMaskWords = (uint32_t) (_maxSampleMaskWords);
	  */

	/**
	 * Native GET method for field maxSampleMaskWords	[int]<br>
	 * Prototype: uint32_t  maxSampleMaskWords
	 */ 
	 private static native int getMaxSampleMaskWords0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxSampleMaskWords);
	 */

	/**
	 * Native SET method for field timestampComputeAndGraphics	[boolean]<br>
	 * Prototype: VkBool32  timestampComputeAndGraphics
	 */ 
	 private static native void setTimestampComputeAndGraphics0(Buffer ptr, boolean  _timestampComputeAndGraphics);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->timestampComputeAndGraphics = (VkBool32) (_timestampComputeAndGraphics);
	  */

	/**
	 * Native GET method for field timestampComputeAndGraphics	[boolean]<br>
	 * Prototype: VkBool32  timestampComputeAndGraphics
	 */ 
	 private static native boolean  getTimestampComputeAndGraphics0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jboolean) (vkObj->timestampComputeAndGraphics);
	 */

	/**
	 * Native SET method for field timestampPeriod	[float]<br>
	 * Prototype: float  timestampPeriod
	 */ 
	 private static native void setTimestampPeriod0(Buffer ptr, float _timestampPeriod);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->timestampPeriod = (float) (_timestampPeriod);
	  */

	/**
	 * Native GET method for field timestampPeriod	[float]<br>
	 * Prototype: float  timestampPeriod
	 */ 
	 private static native float getTimestampPeriod0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jfloat) (vkObj->timestampPeriod);
	 */

	/**
	 * Native SET method for field maxClipDistances	[int]<br>
	 * Prototype: uint32_t  maxClipDistances
	 */ 
	 private static native void setMaxClipDistances0(Buffer ptr, int _maxClipDistances);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxClipDistances = (uint32_t) (_maxClipDistances);
	  */

	/**
	 * Native GET method for field maxClipDistances	[int]<br>
	 * Prototype: uint32_t  maxClipDistances
	 */ 
	 private static native int getMaxClipDistances0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxClipDistances);
	 */

	/**
	 * Native SET method for field maxCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCullDistances
	 */ 
	 private static native void setMaxCullDistances0(Buffer ptr, int _maxCullDistances);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxCullDistances = (uint32_t) (_maxCullDistances);
	  */

	/**
	 * Native GET method for field maxCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCullDistances
	 */ 
	 private static native int getMaxCullDistances0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxCullDistances);
	 */

	/**
	 * Native SET method for field maxCombinedClipAndCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCombinedClipAndCullDistances
	 */ 
	 private static native void setMaxCombinedClipAndCullDistances0(Buffer ptr, int _maxCombinedClipAndCullDistances);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxCombinedClipAndCullDistances = (uint32_t) (_maxCombinedClipAndCullDistances);
	  */

	/**
	 * Native GET method for field maxCombinedClipAndCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCombinedClipAndCullDistances
	 */ 
	 private static native int getMaxCombinedClipAndCullDistances0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxCombinedClipAndCullDistances);
	 */

	/**
	 * Native SET method for field discreteQueuePriorities	[int]<br>
	 * Prototype: uint32_t  discreteQueuePriorities
	 */ 
	 private static native void setDiscreteQueuePriorities0(Buffer ptr, int _discreteQueuePriorities);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->discreteQueuePriorities = (uint32_t) (_discreteQueuePriorities);
	  */

	/**
	 * Native GET method for field discreteQueuePriorities	[int]<br>
	 * Prototype: uint32_t  discreteQueuePriorities
	 */ 
	 private static native int getDiscreteQueuePriorities0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->discreteQueuePriorities);
	 */

	/**
	 * native SET method for field pointSizeRange	[float_array]<br>
	 * Prototype: float[]  pointSizeRange
	 */ 
	 private static native void setPointSizeRange0(Buffer ptr, float[] _pointSizeRange);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->pointSizeRange[0] = (float) (_pointSizeRange[0]);
		  vkObj->pointSizeRange[1] = (float) (_pointSizeRange[1]);		  
	  */

	/**
	 * native GET method for field pointSizeRange	[float_array]<br>
	 * Prototype: float[]  pointSizeRange
	 */ 
	 private static native void getPointSizeRange0(Buffer ptr, float[] input);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  input[0] = (jfloat) (vkObj->pointSizeRange[0]);
		  input[1] = (jfloat) (vkObj->pointSizeRange[1]);
	 */

/**
	 * native SET method for field lineWidthRange	[float_array]<br>
	 * Prototype: float[]  lineWidthRange
	 */ 
	 private static native void setLineWidthRange0(Buffer ptr, float[] _lineWidthRange);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->lineWidthRange[0] = (float) (_lineWidthRange[0]);
		  vkObj->lineWidthRange[1] = (float) (_lineWidthRange[1]);
	  */

	/**
	 * native GET method for field lineWidthRange	[float_array]<br>
	 * Prototype: float[]  lineWidthRange
	 */ 
	 private static native void getLineWidthRange0(Buffer ptr, float[] input);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  input[0] = (jfloat) (vkObj->lineWidthRange[0]);
		  input[1] = (jfloat) (vkObj->lineWidthRange[1]);
	 */

	/**
	 * Native SET method for field pointSizeGranularity	[float]<br>
	 * Prototype: float  pointSizeGranularity
	 */ 
	 private static native void setPointSizeGranularity0(Buffer ptr, float _pointSizeGranularity);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->pointSizeGranularity = (float) (_pointSizeGranularity);
	  */

	/**
	 * Native GET method for field pointSizeGranularity	[float]<br>
	 * Prototype: float  pointSizeGranularity
	 */ 
	 private static native float getPointSizeGranularity0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jfloat) (vkObj->pointSizeGranularity);
	 */

	/**
	 * Native SET method for field lineWidthGranularity	[float]<br>
	 * Prototype: float  lineWidthGranularity
	 */ 
	 private static native void setLineWidthGranularity0(Buffer ptr, float _lineWidthGranularity);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->lineWidthGranularity = (float) (_lineWidthGranularity);
	  */

	/**
	 * Native GET method for field lineWidthGranularity	[float]<br>
	 * Prototype: float  lineWidthGranularity
	 */ 
	 private static native float getLineWidthGranularity0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jfloat) (vkObj->lineWidthGranularity);
	 */

	/**
	 * Native SET method for field strictLines	[boolean]<br>
	 * Prototype: VkBool32  strictLines
	 */ 
	 private static native void setStrictLines0(Buffer ptr, boolean  _strictLines);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->strictLines = (VkBool32) (_strictLines);
	  */

	/**
	 * Native GET method for field strictLines	[boolean]<br>
	 * Prototype: VkBool32  strictLines
	 */ 
	 private static native boolean  getStrictLines0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jboolean) (vkObj->strictLines);
	 */

	/**
	 * Native SET method for field standardSampleLocations	[boolean]<br>
	 * Prototype: VkBool32  standardSampleLocations
	 */ 
	 private static native void setStandardSampleLocations0(Buffer ptr, boolean  _standardSampleLocations);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->standardSampleLocations = (VkBool32) (_standardSampleLocations);
	  */

	/**
	 * Native GET method for field standardSampleLocations	[boolean]<br>
	 * Prototype: VkBool32  standardSampleLocations
	 */ 
	 private static native boolean  getStandardSampleLocations0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jboolean) (vkObj->standardSampleLocations);
	 */

	/**
	 * Native SET method for field optimalBufferCopyOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyOffsetAlignment
	 */ 
	 private static native void setOptimalBufferCopyOffsetAlignment0(Buffer ptr, long _optimalBufferCopyOffsetAlignment);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->optimalBufferCopyOffsetAlignment = (VkDeviceSize) (_optimalBufferCopyOffsetAlignment);
	  */

	/**
	 * Native GET method for field optimalBufferCopyOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyOffsetAlignment
	 */ 
	 private static native long getOptimalBufferCopyOffsetAlignment0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->optimalBufferCopyOffsetAlignment);
	 */

	/**
	 * Native SET method for field optimalBufferCopyRowPitchAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyRowPitchAlignment
	 */ 
	 private static native void setOptimalBufferCopyRowPitchAlignment0(Buffer ptr, long _optimalBufferCopyRowPitchAlignment);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->optimalBufferCopyRowPitchAlignment = (VkDeviceSize) (_optimalBufferCopyRowPitchAlignment);
	  */

	/**
	 * Native GET method for field optimalBufferCopyRowPitchAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyRowPitchAlignment
	 */ 
	 private static native long getOptimalBufferCopyRowPitchAlignment0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->optimalBufferCopyRowPitchAlignment);
	 */

	/**
	 * Native SET method for field nonCoherentAtomSize	[long]<br>
	 * Prototype: VkDeviceSize  nonCoherentAtomSize
	 */ 
	 private static native void setNonCoherentAtomSize0(Buffer ptr, long _nonCoherentAtomSize);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->nonCoherentAtomSize = (VkDeviceSize) (_nonCoherentAtomSize);
	  */

	/**
	 * Native GET method for field nonCoherentAtomSize	[long]<br>
	 * Prototype: VkDeviceSize  nonCoherentAtomSize
	 */ 
	 private static native long getNonCoherentAtomSize0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->nonCoherentAtomSize);
	 */





} // end of class VkPhysicalDeviceLimits
