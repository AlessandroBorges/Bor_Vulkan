/**
 * Class wrapping Vulkan's VkPhysicalDeviceLimits struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.01 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.*;
import java.nio.ByteBuffer;


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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkPhysicalDeviceLimits extends VkStruct {
	/** TAG of this structure [8]  */
	 private static final String TAG = "VkPhysicalDeviceLimits";

	/** ID of this structure [8]  */
	 public static final int TAG_ID = VKPHYSICALDEVICELIMITS_ID;

	/** P wrapper for THIS object */
	 private  P<VkPhysicalDeviceLimits> p;

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
	 *  uint32_t[] 	maxComputeWorkGroupCount	[int_array]
	 */ 
	 int[] 	maxComputeWorkGroupCount;

	/**
	 *  uint32_t 	maxComputeWorkGroupInvocations	[int]
	 */ 
	 int 	maxComputeWorkGroupInvocations;

	/**
	 *  uint32_t[] 	maxComputeWorkGroupSize	[int_array]
	 */ 
	 int[] 	maxComputeWorkGroupSize;

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
	 *  uint32_t[] 	maxViewportDimensions	[int_array]
	 */ 
	 int[] 	maxViewportDimensions;

	/**
	 *  float[] 	viewportBoundsRange	[float_array]
	 */ 
	 float[] 	viewportBoundsRange;

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
	 *  float[] 	pointSizeRange	[float_array]
	 */ 
	 float[] 	pointSizeRange;

	/**
	 *  float[] 	lineWidthRange	[float_array]
	 */ 
	 float[] 	lineWidthRange;

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
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPhysicalDeviceLimits(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkPhysicalDeviceLimits(long address, int memSize){ 
		 super(address, memSize); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	/**
	 * Create a pointer P to contain a instance of this,
	 * with clean native pointer.<br>
	 * You can use {@link VkStruct#setPointer(ByteBuffer)} to set a new 
	 * native pointer.
	 * @return An instance of P for this VkStruct with null pointer
	 */
	 public static P<VkPhysicalDeviceLimits> createNullPointer(){
	        P<VkPhysicalDeviceLimits> p = new  P<VkPhysicalDeviceLimits>(new VkPhysicalDeviceLimits());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkPhysicalDeviceLimits> getP() {
	       if(p == null ){
	           p = new P<VkPhysicalDeviceLimits> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field maxImageDimension1D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension1D
	 */ 
	 public void maxImageDimension1D(int maxImageDimension1D){
		 this.maxImageDimension1D = maxImageDimension1D;
		maxImageDimension1D0(super.ptr, maxImageDimension1D);
	 }

	/**
	 * get method for field maxImageDimension1D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension1D
	 */ 
	 public int maxImageDimension1D(){
		 // return  this.maxImageDimension1D;
		 return maxImageDimension1D0(super.ptr);
	 }

	/**
	 * Set method for field maxImageDimension2D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension2D
	 */ 
	 public void maxImageDimension2D(int maxImageDimension2D){
		 this.maxImageDimension2D = maxImageDimension2D;
		maxImageDimension2D0(super.ptr, maxImageDimension2D);
	 }

	/**
	 * get method for field maxImageDimension2D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension2D
	 */ 
	 public int maxImageDimension2D(){
		 // return  this.maxImageDimension2D;
		 return maxImageDimension2D0(super.ptr);
	 }

	/**
	 * Set method for field maxImageDimension3D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension3D
	 */ 
	 public void maxImageDimension3D(int maxImageDimension3D){
		 this.maxImageDimension3D = maxImageDimension3D;
		maxImageDimension3D0(super.ptr, maxImageDimension3D);
	 }

	/**
	 * get method for field maxImageDimension3D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension3D
	 */ 
	 public int maxImageDimension3D(){
		 // return  this.maxImageDimension3D;
		 return maxImageDimension3D0(super.ptr);
	 }

	/**
	 * Set method for field maxImageDimensionCube	[int]<br>
	 * Prototype: uint32_t  maxImageDimensionCube
	 */ 
	 public void maxImageDimensionCube(int maxImageDimensionCube){
		 this.maxImageDimensionCube = maxImageDimensionCube;
		maxImageDimensionCube0(super.ptr, maxImageDimensionCube);
	 }

	/**
	 * get method for field maxImageDimensionCube	[int]<br>
	 * Prototype: uint32_t  maxImageDimensionCube
	 */ 
	 public int maxImageDimensionCube(){
		 // return  this.maxImageDimensionCube;
		 return maxImageDimensionCube0(super.ptr);
	 }

	/**
	 * Set method for field maxImageArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxImageArrayLayers
	 */ 
	 public void maxImageArrayLayers(int maxImageArrayLayers){
		 this.maxImageArrayLayers = maxImageArrayLayers;
		maxImageArrayLayers0(super.ptr, maxImageArrayLayers);
	 }

	/**
	 * get method for field maxImageArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxImageArrayLayers
	 */ 
	 public int maxImageArrayLayers(){
		 // return  this.maxImageArrayLayers;
		 return maxImageArrayLayers0(super.ptr);
	 }

	/**
	 * Set method for field maxTexelBufferElements	[int]<br>
	 * Prototype: uint32_t  maxTexelBufferElements
	 */ 
	 public void maxTexelBufferElements(int maxTexelBufferElements){
		 this.maxTexelBufferElements = maxTexelBufferElements;
		maxTexelBufferElements0(super.ptr, maxTexelBufferElements);
	 }

	/**
	 * get method for field maxTexelBufferElements	[int]<br>
	 * Prototype: uint32_t  maxTexelBufferElements
	 */ 
	 public int maxTexelBufferElements(){
		 // return  this.maxTexelBufferElements;
		 return maxTexelBufferElements0(super.ptr);
	 }

	/**
	 * Set method for field maxUniformBufferRange	[int]<br>
	 * Prototype: uint32_t  maxUniformBufferRange
	 */ 
	 public void maxUniformBufferRange(int maxUniformBufferRange){
		 this.maxUniformBufferRange = maxUniformBufferRange;
		maxUniformBufferRange0(super.ptr, maxUniformBufferRange);
	 }

	/**
	 * get method for field maxUniformBufferRange	[int]<br>
	 * Prototype: uint32_t  maxUniformBufferRange
	 */ 
	 public int maxUniformBufferRange(){
		 // return  this.maxUniformBufferRange;
		 return maxUniformBufferRange0(super.ptr);
	 }

	/**
	 * Set method for field maxStorageBufferRange	[int]<br>
	 * Prototype: uint32_t  maxStorageBufferRange
	 */ 
	 public void maxStorageBufferRange(int maxStorageBufferRange){
		 this.maxStorageBufferRange = maxStorageBufferRange;
		maxStorageBufferRange0(super.ptr, maxStorageBufferRange);
	 }

	/**
	 * get method for field maxStorageBufferRange	[int]<br>
	 * Prototype: uint32_t  maxStorageBufferRange
	 */ 
	 public int maxStorageBufferRange(){
		 // return  this.maxStorageBufferRange;
		 return maxStorageBufferRange0(super.ptr);
	 }

	/**
	 * Set method for field maxPushConstantsSize	[int]<br>
	 * Prototype: uint32_t  maxPushConstantsSize
	 */ 
	 public void maxPushConstantsSize(int maxPushConstantsSize){
		 this.maxPushConstantsSize = maxPushConstantsSize;
		maxPushConstantsSize0(super.ptr, maxPushConstantsSize);
	 }

	/**
	 * get method for field maxPushConstantsSize	[int]<br>
	 * Prototype: uint32_t  maxPushConstantsSize
	 */ 
	 public int maxPushConstantsSize(){
		 // return  this.maxPushConstantsSize;
		 return maxPushConstantsSize0(super.ptr);
	 }

	/**
	 * Set method for field maxMemoryAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxMemoryAllocationCount
	 */ 
	 public void maxMemoryAllocationCount(int maxMemoryAllocationCount){
		 this.maxMemoryAllocationCount = maxMemoryAllocationCount;
		maxMemoryAllocationCount0(super.ptr, maxMemoryAllocationCount);
	 }

	/**
	 * get method for field maxMemoryAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxMemoryAllocationCount
	 */ 
	 public int maxMemoryAllocationCount(){
		 // return  this.maxMemoryAllocationCount;
		 return maxMemoryAllocationCount0(super.ptr);
	 }

	/**
	 * Set method for field maxSamplerAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxSamplerAllocationCount
	 */ 
	 public void maxSamplerAllocationCount(int maxSamplerAllocationCount){
		 this.maxSamplerAllocationCount = maxSamplerAllocationCount;
		maxSamplerAllocationCount0(super.ptr, maxSamplerAllocationCount);
	 }

	/**
	 * get method for field maxSamplerAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxSamplerAllocationCount
	 */ 
	 public int maxSamplerAllocationCount(){
		 // return  this.maxSamplerAllocationCount;
		 return maxSamplerAllocationCount0(super.ptr);
	 }

	/**
	 * Set method for field bufferImageGranularity	[long]<br>
	 * Prototype: VkDeviceSize  bufferImageGranularity
	 */ 
	 public void bufferImageGranularity(long bufferImageGranularity){
		 this.bufferImageGranularity = bufferImageGranularity;
		bufferImageGranularity0(super.ptr, bufferImageGranularity);
	 }

	/**
	 * get method for field bufferImageGranularity	[long]<br>
	 * Prototype: VkDeviceSize  bufferImageGranularity
	 */ 
	 public long bufferImageGranularity(){
		 // return  this.bufferImageGranularity;
		 return bufferImageGranularity0(super.ptr);
	 }

	/**
	 * Set method for field sparseAddressSpaceSize	[long]<br>
	 * Prototype: VkDeviceSize  sparseAddressSpaceSize
	 */ 
	 public void sparseAddressSpaceSize(long sparseAddressSpaceSize){
		 this.sparseAddressSpaceSize = sparseAddressSpaceSize;
		sparseAddressSpaceSize0(super.ptr, sparseAddressSpaceSize);
	 }

	/**
	 * get method for field sparseAddressSpaceSize	[long]<br>
	 * Prototype: VkDeviceSize  sparseAddressSpaceSize
	 */ 
	 public long sparseAddressSpaceSize(){
		 // return  this.sparseAddressSpaceSize;
		 return sparseAddressSpaceSize0(super.ptr);
	 }

	/**
	 * Set method for field maxBoundDescriptorSets	[int]<br>
	 * Prototype: uint32_t  maxBoundDescriptorSets
	 */ 
	 public void maxBoundDescriptorSets(int maxBoundDescriptorSets){
		 this.maxBoundDescriptorSets = maxBoundDescriptorSets;
		maxBoundDescriptorSets0(super.ptr, maxBoundDescriptorSets);
	 }

	/**
	 * get method for field maxBoundDescriptorSets	[int]<br>
	 * Prototype: uint32_t  maxBoundDescriptorSets
	 */ 
	 public int maxBoundDescriptorSets(){
		 // return  this.maxBoundDescriptorSets;
		 return maxBoundDescriptorSets0(super.ptr);
	 }

	/**
	 * Set method for field maxPerStageDescriptorSamplers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSamplers
	 */ 
	 public void maxPerStageDescriptorSamplers(int maxPerStageDescriptorSamplers){
		 this.maxPerStageDescriptorSamplers = maxPerStageDescriptorSamplers;
		maxPerStageDescriptorSamplers0(super.ptr, maxPerStageDescriptorSamplers);
	 }

	/**
	 * get method for field maxPerStageDescriptorSamplers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSamplers
	 */ 
	 public int maxPerStageDescriptorSamplers(){
		 // return  this.maxPerStageDescriptorSamplers;
		 return maxPerStageDescriptorSamplers0(super.ptr);
	 }

	/**
	 * Set method for field maxPerStageDescriptorUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorUniformBuffers
	 */ 
	 public void maxPerStageDescriptorUniformBuffers(int maxPerStageDescriptorUniformBuffers){
		 this.maxPerStageDescriptorUniformBuffers = maxPerStageDescriptorUniformBuffers;
		maxPerStageDescriptorUniformBuffers0(super.ptr, maxPerStageDescriptorUniformBuffers);
	 }

	/**
	 * get method for field maxPerStageDescriptorUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorUniformBuffers
	 */ 
	 public int maxPerStageDescriptorUniformBuffers(){
		 // return  this.maxPerStageDescriptorUniformBuffers;
		 return maxPerStageDescriptorUniformBuffers0(super.ptr);
	 }

	/**
	 * Set method for field maxPerStageDescriptorStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageBuffers
	 */ 
	 public void maxPerStageDescriptorStorageBuffers(int maxPerStageDescriptorStorageBuffers){
		 this.maxPerStageDescriptorStorageBuffers = maxPerStageDescriptorStorageBuffers;
		maxPerStageDescriptorStorageBuffers0(super.ptr, maxPerStageDescriptorStorageBuffers);
	 }

	/**
	 * get method for field maxPerStageDescriptorStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageBuffers
	 */ 
	 public int maxPerStageDescriptorStorageBuffers(){
		 // return  this.maxPerStageDescriptorStorageBuffers;
		 return maxPerStageDescriptorStorageBuffers0(super.ptr);
	 }

	/**
	 * Set method for field maxPerStageDescriptorSampledImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSampledImages
	 */ 
	 public void maxPerStageDescriptorSampledImages(int maxPerStageDescriptorSampledImages){
		 this.maxPerStageDescriptorSampledImages = maxPerStageDescriptorSampledImages;
		maxPerStageDescriptorSampledImages0(super.ptr, maxPerStageDescriptorSampledImages);
	 }

	/**
	 * get method for field maxPerStageDescriptorSampledImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSampledImages
	 */ 
	 public int maxPerStageDescriptorSampledImages(){
		 // return  this.maxPerStageDescriptorSampledImages;
		 return maxPerStageDescriptorSampledImages0(super.ptr);
	 }

	/**
	 * Set method for field maxPerStageDescriptorStorageImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageImages
	 */ 
	 public void maxPerStageDescriptorStorageImages(int maxPerStageDescriptorStorageImages){
		 this.maxPerStageDescriptorStorageImages = maxPerStageDescriptorStorageImages;
		maxPerStageDescriptorStorageImages0(super.ptr, maxPerStageDescriptorStorageImages);
	 }

	/**
	 * get method for field maxPerStageDescriptorStorageImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageImages
	 */ 
	 public int maxPerStageDescriptorStorageImages(){
		 // return  this.maxPerStageDescriptorStorageImages;
		 return maxPerStageDescriptorStorageImages0(super.ptr);
	 }

	/**
	 * Set method for field maxPerStageDescriptorInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorInputAttachments
	 */ 
	 public void maxPerStageDescriptorInputAttachments(int maxPerStageDescriptorInputAttachments){
		 this.maxPerStageDescriptorInputAttachments = maxPerStageDescriptorInputAttachments;
		maxPerStageDescriptorInputAttachments0(super.ptr, maxPerStageDescriptorInputAttachments);
	 }

	/**
	 * get method for field maxPerStageDescriptorInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorInputAttachments
	 */ 
	 public int maxPerStageDescriptorInputAttachments(){
		 // return  this.maxPerStageDescriptorInputAttachments;
		 return maxPerStageDescriptorInputAttachments0(super.ptr);
	 }

	/**
	 * Set method for field maxPerStageResources	[int]<br>
	 * Prototype: uint32_t  maxPerStageResources
	 */ 
	 public void maxPerStageResources(int maxPerStageResources){
		 this.maxPerStageResources = maxPerStageResources;
		maxPerStageResources0(super.ptr, maxPerStageResources);
	 }

	/**
	 * get method for field maxPerStageResources	[int]<br>
	 * Prototype: uint32_t  maxPerStageResources
	 */ 
	 public int maxPerStageResources(){
		 // return  this.maxPerStageResources;
		 return maxPerStageResources0(super.ptr);
	 }

	/**
	 * Set method for field maxDescriptorSetSamplers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSamplers
	 */ 
	 public void maxDescriptorSetSamplers(int maxDescriptorSetSamplers){
		 this.maxDescriptorSetSamplers = maxDescriptorSetSamplers;
		maxDescriptorSetSamplers0(super.ptr, maxDescriptorSetSamplers);
	 }

	/**
	 * get method for field maxDescriptorSetSamplers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSamplers
	 */ 
	 public int maxDescriptorSetSamplers(){
		 // return  this.maxDescriptorSetSamplers;
		 return maxDescriptorSetSamplers0(super.ptr);
	 }

	/**
	 * Set method for field maxDescriptorSetUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffers
	 */ 
	 public void maxDescriptorSetUniformBuffers(int maxDescriptorSetUniformBuffers){
		 this.maxDescriptorSetUniformBuffers = maxDescriptorSetUniformBuffers;
		maxDescriptorSetUniformBuffers0(super.ptr, maxDescriptorSetUniformBuffers);
	 }

	/**
	 * get method for field maxDescriptorSetUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffers
	 */ 
	 public int maxDescriptorSetUniformBuffers(){
		 // return  this.maxDescriptorSetUniformBuffers;
		 return maxDescriptorSetUniformBuffers0(super.ptr);
	 }

	/**
	 * Set method for field maxDescriptorSetUniformBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffersDynamic
	 */ 
	 public void maxDescriptorSetUniformBuffersDynamic(int maxDescriptorSetUniformBuffersDynamic){
		 this.maxDescriptorSetUniformBuffersDynamic = maxDescriptorSetUniformBuffersDynamic;
		maxDescriptorSetUniformBuffersDynamic0(super.ptr, maxDescriptorSetUniformBuffersDynamic);
	 }

	/**
	 * get method for field maxDescriptorSetUniformBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffersDynamic
	 */ 
	 public int maxDescriptorSetUniformBuffersDynamic(){
		 // return  this.maxDescriptorSetUniformBuffersDynamic;
		 return maxDescriptorSetUniformBuffersDynamic0(super.ptr);
	 }

	/**
	 * Set method for field maxDescriptorSetStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffers
	 */ 
	 public void maxDescriptorSetStorageBuffers(int maxDescriptorSetStorageBuffers){
		 this.maxDescriptorSetStorageBuffers = maxDescriptorSetStorageBuffers;
		maxDescriptorSetStorageBuffers0(super.ptr, maxDescriptorSetStorageBuffers);
	 }

	/**
	 * get method for field maxDescriptorSetStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffers
	 */ 
	 public int maxDescriptorSetStorageBuffers(){
		 // return  this.maxDescriptorSetStorageBuffers;
		 return maxDescriptorSetStorageBuffers0(super.ptr);
	 }

	/**
	 * Set method for field maxDescriptorSetStorageBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffersDynamic
	 */ 
	 public void maxDescriptorSetStorageBuffersDynamic(int maxDescriptorSetStorageBuffersDynamic){
		 this.maxDescriptorSetStorageBuffersDynamic = maxDescriptorSetStorageBuffersDynamic;
		maxDescriptorSetStorageBuffersDynamic0(super.ptr, maxDescriptorSetStorageBuffersDynamic);
	 }

	/**
	 * get method for field maxDescriptorSetStorageBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffersDynamic
	 */ 
	 public int maxDescriptorSetStorageBuffersDynamic(){
		 // return  this.maxDescriptorSetStorageBuffersDynamic;
		 return maxDescriptorSetStorageBuffersDynamic0(super.ptr);
	 }

	/**
	 * Set method for field maxDescriptorSetSampledImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSampledImages
	 */ 
	 public void maxDescriptorSetSampledImages(int maxDescriptorSetSampledImages){
		 this.maxDescriptorSetSampledImages = maxDescriptorSetSampledImages;
		maxDescriptorSetSampledImages0(super.ptr, maxDescriptorSetSampledImages);
	 }

	/**
	 * get method for field maxDescriptorSetSampledImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSampledImages
	 */ 
	 public int maxDescriptorSetSampledImages(){
		 // return  this.maxDescriptorSetSampledImages;
		 return maxDescriptorSetSampledImages0(super.ptr);
	 }

	/**
	 * Set method for field maxDescriptorSetStorageImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageImages
	 */ 
	 public void maxDescriptorSetStorageImages(int maxDescriptorSetStorageImages){
		 this.maxDescriptorSetStorageImages = maxDescriptorSetStorageImages;
		maxDescriptorSetStorageImages0(super.ptr, maxDescriptorSetStorageImages);
	 }

	/**
	 * get method for field maxDescriptorSetStorageImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageImages
	 */ 
	 public int maxDescriptorSetStorageImages(){
		 // return  this.maxDescriptorSetStorageImages;
		 return maxDescriptorSetStorageImages0(super.ptr);
	 }

	/**
	 * Set method for field maxDescriptorSetInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetInputAttachments
	 */ 
	 public void maxDescriptorSetInputAttachments(int maxDescriptorSetInputAttachments){
		 this.maxDescriptorSetInputAttachments = maxDescriptorSetInputAttachments;
		maxDescriptorSetInputAttachments0(super.ptr, maxDescriptorSetInputAttachments);
	 }

	/**
	 * get method for field maxDescriptorSetInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetInputAttachments
	 */ 
	 public int maxDescriptorSetInputAttachments(){
		 // return  this.maxDescriptorSetInputAttachments;
		 return maxDescriptorSetInputAttachments0(super.ptr);
	 }

	/**
	 * Set method for field maxVertexInputAttributes	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributes
	 */ 
	 public void maxVertexInputAttributes(int maxVertexInputAttributes){
		 this.maxVertexInputAttributes = maxVertexInputAttributes;
		maxVertexInputAttributes0(super.ptr, maxVertexInputAttributes);
	 }

	/**
	 * get method for field maxVertexInputAttributes	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributes
	 */ 
	 public int maxVertexInputAttributes(){
		 // return  this.maxVertexInputAttributes;
		 return maxVertexInputAttributes0(super.ptr);
	 }

	/**
	 * Set method for field maxVertexInputBindings	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindings
	 */ 
	 public void maxVertexInputBindings(int maxVertexInputBindings){
		 this.maxVertexInputBindings = maxVertexInputBindings;
		maxVertexInputBindings0(super.ptr, maxVertexInputBindings);
	 }

	/**
	 * get method for field maxVertexInputBindings	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindings
	 */ 
	 public int maxVertexInputBindings(){
		 // return  this.maxVertexInputBindings;
		 return maxVertexInputBindings0(super.ptr);
	 }

	/**
	 * Set method for field maxVertexInputAttributeOffset	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributeOffset
	 */ 
	 public void maxVertexInputAttributeOffset(int maxVertexInputAttributeOffset){
		 this.maxVertexInputAttributeOffset = maxVertexInputAttributeOffset;
		maxVertexInputAttributeOffset0(super.ptr, maxVertexInputAttributeOffset);
	 }

	/**
	 * get method for field maxVertexInputAttributeOffset	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributeOffset
	 */ 
	 public int maxVertexInputAttributeOffset(){
		 // return  this.maxVertexInputAttributeOffset;
		 return maxVertexInputAttributeOffset0(super.ptr);
	 }

	/**
	 * Set method for field maxVertexInputBindingStride	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindingStride
	 */ 
	 public void maxVertexInputBindingStride(int maxVertexInputBindingStride){
		 this.maxVertexInputBindingStride = maxVertexInputBindingStride;
		maxVertexInputBindingStride0(super.ptr, maxVertexInputBindingStride);
	 }

	/**
	 * get method for field maxVertexInputBindingStride	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindingStride
	 */ 
	 public int maxVertexInputBindingStride(){
		 // return  this.maxVertexInputBindingStride;
		 return maxVertexInputBindingStride0(super.ptr);
	 }

	/**
	 * Set method for field maxVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxVertexOutputComponents
	 */ 
	 public void maxVertexOutputComponents(int maxVertexOutputComponents){
		 this.maxVertexOutputComponents = maxVertexOutputComponents;
		maxVertexOutputComponents0(super.ptr, maxVertexOutputComponents);
	 }

	/**
	 * get method for field maxVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxVertexOutputComponents
	 */ 
	 public int maxVertexOutputComponents(){
		 // return  this.maxVertexOutputComponents;
		 return maxVertexOutputComponents0(super.ptr);
	 }

	/**
	 * Set method for field maxTessellationGenerationLevel	[int]<br>
	 * Prototype: uint32_t  maxTessellationGenerationLevel
	 */ 
	 public void maxTessellationGenerationLevel(int maxTessellationGenerationLevel){
		 this.maxTessellationGenerationLevel = maxTessellationGenerationLevel;
		maxTessellationGenerationLevel0(super.ptr, maxTessellationGenerationLevel);
	 }

	/**
	 * get method for field maxTessellationGenerationLevel	[int]<br>
	 * Prototype: uint32_t  maxTessellationGenerationLevel
	 */ 
	 public int maxTessellationGenerationLevel(){
		 // return  this.maxTessellationGenerationLevel;
		 return maxTessellationGenerationLevel0(super.ptr);
	 }

	/**
	 * Set method for field maxTessellationPatchSize	[int]<br>
	 * Prototype: uint32_t  maxTessellationPatchSize
	 */ 
	 public void maxTessellationPatchSize(int maxTessellationPatchSize){
		 this.maxTessellationPatchSize = maxTessellationPatchSize;
		maxTessellationPatchSize0(super.ptr, maxTessellationPatchSize);
	 }

	/**
	 * get method for field maxTessellationPatchSize	[int]<br>
	 * Prototype: uint32_t  maxTessellationPatchSize
	 */ 
	 public int maxTessellationPatchSize(){
		 // return  this.maxTessellationPatchSize;
		 return maxTessellationPatchSize0(super.ptr);
	 }

	/**
	 * Set method for field maxTessellationControlPerVertexInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexInputComponents
	 */ 
	 public void maxTessellationControlPerVertexInputComponents(int maxTessellationControlPerVertexInputComponents){
		 this.maxTessellationControlPerVertexInputComponents = maxTessellationControlPerVertexInputComponents;
		maxTessellationControlPerVertexInputComponents0(super.ptr, maxTessellationControlPerVertexInputComponents);
	 }

	/**
	 * get method for field maxTessellationControlPerVertexInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexInputComponents
	 */ 
	 public int maxTessellationControlPerVertexInputComponents(){
		 // return  this.maxTessellationControlPerVertexInputComponents;
		 return maxTessellationControlPerVertexInputComponents0(super.ptr);
	 }

	/**
	 * Set method for field maxTessellationControlPerVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexOutputComponents
	 */ 
	 public void maxTessellationControlPerVertexOutputComponents(int maxTessellationControlPerVertexOutputComponents){
		 this.maxTessellationControlPerVertexOutputComponents = maxTessellationControlPerVertexOutputComponents;
		maxTessellationControlPerVertexOutputComponents0(super.ptr, maxTessellationControlPerVertexOutputComponents);
	 }

	/**
	 * get method for field maxTessellationControlPerVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexOutputComponents
	 */ 
	 public int maxTessellationControlPerVertexOutputComponents(){
		 // return  this.maxTessellationControlPerVertexOutputComponents;
		 return maxTessellationControlPerVertexOutputComponents0(super.ptr);
	 }

	/**
	 * Set method for field maxTessellationControlPerPatchOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerPatchOutputComponents
	 */ 
	 public void maxTessellationControlPerPatchOutputComponents(int maxTessellationControlPerPatchOutputComponents){
		 this.maxTessellationControlPerPatchOutputComponents = maxTessellationControlPerPatchOutputComponents;
		maxTessellationControlPerPatchOutputComponents0(super.ptr, maxTessellationControlPerPatchOutputComponents);
	 }

	/**
	 * get method for field maxTessellationControlPerPatchOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerPatchOutputComponents
	 */ 
	 public int maxTessellationControlPerPatchOutputComponents(){
		 // return  this.maxTessellationControlPerPatchOutputComponents;
		 return maxTessellationControlPerPatchOutputComponents0(super.ptr);
	 }

	/**
	 * Set method for field maxTessellationControlTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlTotalOutputComponents
	 */ 
	 public void maxTessellationControlTotalOutputComponents(int maxTessellationControlTotalOutputComponents){
		 this.maxTessellationControlTotalOutputComponents = maxTessellationControlTotalOutputComponents;
		maxTessellationControlTotalOutputComponents0(super.ptr, maxTessellationControlTotalOutputComponents);
	 }

	/**
	 * get method for field maxTessellationControlTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlTotalOutputComponents
	 */ 
	 public int maxTessellationControlTotalOutputComponents(){
		 // return  this.maxTessellationControlTotalOutputComponents;
		 return maxTessellationControlTotalOutputComponents0(super.ptr);
	 }

	/**
	 * Set method for field maxTessellationEvaluationInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationInputComponents
	 */ 
	 public void maxTessellationEvaluationInputComponents(int maxTessellationEvaluationInputComponents){
		 this.maxTessellationEvaluationInputComponents = maxTessellationEvaluationInputComponents;
		maxTessellationEvaluationInputComponents0(super.ptr, maxTessellationEvaluationInputComponents);
	 }

	/**
	 * get method for field maxTessellationEvaluationInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationInputComponents
	 */ 
	 public int maxTessellationEvaluationInputComponents(){
		 // return  this.maxTessellationEvaluationInputComponents;
		 return maxTessellationEvaluationInputComponents0(super.ptr);
	 }

	/**
	 * Set method for field maxTessellationEvaluationOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationOutputComponents
	 */ 
	 public void maxTessellationEvaluationOutputComponents(int maxTessellationEvaluationOutputComponents){
		 this.maxTessellationEvaluationOutputComponents = maxTessellationEvaluationOutputComponents;
		maxTessellationEvaluationOutputComponents0(super.ptr, maxTessellationEvaluationOutputComponents);
	 }

	/**
	 * get method for field maxTessellationEvaluationOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationOutputComponents
	 */ 
	 public int maxTessellationEvaluationOutputComponents(){
		 // return  this.maxTessellationEvaluationOutputComponents;
		 return maxTessellationEvaluationOutputComponents0(super.ptr);
	 }

	/**
	 * Set method for field maxGeometryShaderInvocations	[int]<br>
	 * Prototype: uint32_t  maxGeometryShaderInvocations
	 */ 
	 public void maxGeometryShaderInvocations(int maxGeometryShaderInvocations){
		 this.maxGeometryShaderInvocations = maxGeometryShaderInvocations;
		maxGeometryShaderInvocations0(super.ptr, maxGeometryShaderInvocations);
	 }

	/**
	 * get method for field maxGeometryShaderInvocations	[int]<br>
	 * Prototype: uint32_t  maxGeometryShaderInvocations
	 */ 
	 public int maxGeometryShaderInvocations(){
		 // return  this.maxGeometryShaderInvocations;
		 return maxGeometryShaderInvocations0(super.ptr);
	 }

	/**
	 * Set method for field maxGeometryInputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryInputComponents
	 */ 
	 public void maxGeometryInputComponents(int maxGeometryInputComponents){
		 this.maxGeometryInputComponents = maxGeometryInputComponents;
		maxGeometryInputComponents0(super.ptr, maxGeometryInputComponents);
	 }

	/**
	 * get method for field maxGeometryInputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryInputComponents
	 */ 
	 public int maxGeometryInputComponents(){
		 // return  this.maxGeometryInputComponents;
		 return maxGeometryInputComponents0(super.ptr);
	 }

	/**
	 * Set method for field maxGeometryOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputComponents
	 */ 
	 public void maxGeometryOutputComponents(int maxGeometryOutputComponents){
		 this.maxGeometryOutputComponents = maxGeometryOutputComponents;
		maxGeometryOutputComponents0(super.ptr, maxGeometryOutputComponents);
	 }

	/**
	 * get method for field maxGeometryOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputComponents
	 */ 
	 public int maxGeometryOutputComponents(){
		 // return  this.maxGeometryOutputComponents;
		 return maxGeometryOutputComponents0(super.ptr);
	 }

	/**
	 * Set method for field maxGeometryOutputVertices	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputVertices
	 */ 
	 public void maxGeometryOutputVertices(int maxGeometryOutputVertices){
		 this.maxGeometryOutputVertices = maxGeometryOutputVertices;
		maxGeometryOutputVertices0(super.ptr, maxGeometryOutputVertices);
	 }

	/**
	 * get method for field maxGeometryOutputVertices	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputVertices
	 */ 
	 public int maxGeometryOutputVertices(){
		 // return  this.maxGeometryOutputVertices;
		 return maxGeometryOutputVertices0(super.ptr);
	 }

	/**
	 * Set method for field maxGeometryTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryTotalOutputComponents
	 */ 
	 public void maxGeometryTotalOutputComponents(int maxGeometryTotalOutputComponents){
		 this.maxGeometryTotalOutputComponents = maxGeometryTotalOutputComponents;
		maxGeometryTotalOutputComponents0(super.ptr, maxGeometryTotalOutputComponents);
	 }

	/**
	 * get method for field maxGeometryTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryTotalOutputComponents
	 */ 
	 public int maxGeometryTotalOutputComponents(){
		 // return  this.maxGeometryTotalOutputComponents;
		 return maxGeometryTotalOutputComponents0(super.ptr);
	 }

	/**
	 * Set method for field maxFragmentInputComponents	[int]<br>
	 * Prototype: uint32_t  maxFragmentInputComponents
	 */ 
	 public void maxFragmentInputComponents(int maxFragmentInputComponents){
		 this.maxFragmentInputComponents = maxFragmentInputComponents;
		maxFragmentInputComponents0(super.ptr, maxFragmentInputComponents);
	 }

	/**
	 * get method for field maxFragmentInputComponents	[int]<br>
	 * Prototype: uint32_t  maxFragmentInputComponents
	 */ 
	 public int maxFragmentInputComponents(){
		 // return  this.maxFragmentInputComponents;
		 return maxFragmentInputComponents0(super.ptr);
	 }

	/**
	 * Set method for field maxFragmentOutputAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentOutputAttachments
	 */ 
	 public void maxFragmentOutputAttachments(int maxFragmentOutputAttachments){
		 this.maxFragmentOutputAttachments = maxFragmentOutputAttachments;
		maxFragmentOutputAttachments0(super.ptr, maxFragmentOutputAttachments);
	 }

	/**
	 * get method for field maxFragmentOutputAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentOutputAttachments
	 */ 
	 public int maxFragmentOutputAttachments(){
		 // return  this.maxFragmentOutputAttachments;
		 return maxFragmentOutputAttachments0(super.ptr);
	 }

	/**
	 * Set method for field maxFragmentDualSrcAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentDualSrcAttachments
	 */ 
	 public void maxFragmentDualSrcAttachments(int maxFragmentDualSrcAttachments){
		 this.maxFragmentDualSrcAttachments = maxFragmentDualSrcAttachments;
		maxFragmentDualSrcAttachments0(super.ptr, maxFragmentDualSrcAttachments);
	 }

	/**
	 * get method for field maxFragmentDualSrcAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentDualSrcAttachments
	 */ 
	 public int maxFragmentDualSrcAttachments(){
		 // return  this.maxFragmentDualSrcAttachments;
		 return maxFragmentDualSrcAttachments0(super.ptr);
	 }

	/**
	 * Set method for field maxFragmentCombinedOutputResources	[int]<br>
	 * Prototype: uint32_t  maxFragmentCombinedOutputResources
	 */ 
	 public void maxFragmentCombinedOutputResources(int maxFragmentCombinedOutputResources){
		 this.maxFragmentCombinedOutputResources = maxFragmentCombinedOutputResources;
		maxFragmentCombinedOutputResources0(super.ptr, maxFragmentCombinedOutputResources);
	 }

	/**
	 * get method for field maxFragmentCombinedOutputResources	[int]<br>
	 * Prototype: uint32_t  maxFragmentCombinedOutputResources
	 */ 
	 public int maxFragmentCombinedOutputResources(){
		 // return  this.maxFragmentCombinedOutputResources;
		 return maxFragmentCombinedOutputResources0(super.ptr);
	 }

	/**
	 * Set method for field maxComputeSharedMemorySize	[int]<br>
	 * Prototype: uint32_t  maxComputeSharedMemorySize
	 */ 
	 public void maxComputeSharedMemorySize(int maxComputeSharedMemorySize){
		 this.maxComputeSharedMemorySize = maxComputeSharedMemorySize;
		maxComputeSharedMemorySize0(super.ptr, maxComputeSharedMemorySize);
	 }

	/**
	 * get method for field maxComputeSharedMemorySize	[int]<br>
	 * Prototype: uint32_t  maxComputeSharedMemorySize
	 */ 
	 public int maxComputeSharedMemorySize(){
		 // return  this.maxComputeSharedMemorySize;
		 return maxComputeSharedMemorySize0(super.ptr);
	 }

	/**
	 * Set method for field maxComputeWorkGroupCount	[int_array]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupCount
	 */ 
	 public void maxComputeWorkGroupCount(int[] maxComputeWorkGroupCount){
		 this.maxComputeWorkGroupCount = maxComputeWorkGroupCount;
		maxComputeWorkGroupCount0(super.ptr, maxComputeWorkGroupCount);
	 }

	/**
	 * get method for field maxComputeWorkGroupCount	[int_array]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupCount
	 */ 
	 public int[] maxComputeWorkGroupCount(){
		 // return  this.maxComputeWorkGroupCount;
		 return maxComputeWorkGroupCount0(super.ptr);
	 }

	/**
	 * Set method for field maxComputeWorkGroupInvocations	[int]<br>
	 * Prototype: uint32_t  maxComputeWorkGroupInvocations
	 */ 
	 public void maxComputeWorkGroupInvocations(int maxComputeWorkGroupInvocations){
		 this.maxComputeWorkGroupInvocations = maxComputeWorkGroupInvocations;
		maxComputeWorkGroupInvocations0(super.ptr, maxComputeWorkGroupInvocations);
	 }

	/**
	 * get method for field maxComputeWorkGroupInvocations	[int]<br>
	 * Prototype: uint32_t  maxComputeWorkGroupInvocations
	 */ 
	 public int maxComputeWorkGroupInvocations(){
		 // return  this.maxComputeWorkGroupInvocations;
		 return maxComputeWorkGroupInvocations0(super.ptr);
	 }

	/**
	 * Set method for field maxComputeWorkGroupSize	[int_array]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupSize
	 */ 
	 public void maxComputeWorkGroupSize(int[] maxComputeWorkGroupSize){
		 this.maxComputeWorkGroupSize = maxComputeWorkGroupSize;
		maxComputeWorkGroupSize0(super.ptr, maxComputeWorkGroupSize);
	 }

	/**
	 * get method for field maxComputeWorkGroupSize	[int_array]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupSize
	 */ 
	 public int[] maxComputeWorkGroupSize(){
		 // return  this.maxComputeWorkGroupSize;
		 return maxComputeWorkGroupSize0(super.ptr);
	 }

	/**
	 * Set method for field subPixelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subPixelPrecisionBits
	 */ 
	 public void subPixelPrecisionBits(int subPixelPrecisionBits){
		 this.subPixelPrecisionBits = subPixelPrecisionBits;
		subPixelPrecisionBits0(super.ptr, subPixelPrecisionBits);
	 }

	/**
	 * get method for field subPixelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subPixelPrecisionBits
	 */ 
	 public int subPixelPrecisionBits(){
		 // return  this.subPixelPrecisionBits;
		 return subPixelPrecisionBits0(super.ptr);
	 }

	/**
	 * Set method for field subTexelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subTexelPrecisionBits
	 */ 
	 public void subTexelPrecisionBits(int subTexelPrecisionBits){
		 this.subTexelPrecisionBits = subTexelPrecisionBits;
		subTexelPrecisionBits0(super.ptr, subTexelPrecisionBits);
	 }

	/**
	 * get method for field subTexelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subTexelPrecisionBits
	 */ 
	 public int subTexelPrecisionBits(){
		 // return  this.subTexelPrecisionBits;
		 return subTexelPrecisionBits0(super.ptr);
	 }

	/**
	 * Set method for field mipmapPrecisionBits	[int]<br>
	 * Prototype: uint32_t  mipmapPrecisionBits
	 */ 
	 public void mipmapPrecisionBits(int mipmapPrecisionBits){
		 this.mipmapPrecisionBits = mipmapPrecisionBits;
		mipmapPrecisionBits0(super.ptr, mipmapPrecisionBits);
	 }

	/**
	 * get method for field mipmapPrecisionBits	[int]<br>
	 * Prototype: uint32_t  mipmapPrecisionBits
	 */ 
	 public int mipmapPrecisionBits(){
		 // return  this.mipmapPrecisionBits;
		 return mipmapPrecisionBits0(super.ptr);
	 }

	/**
	 * Set method for field maxDrawIndexedIndexValue	[int]<br>
	 * Prototype: uint32_t  maxDrawIndexedIndexValue
	 */ 
	 public void maxDrawIndexedIndexValue(int maxDrawIndexedIndexValue){
		 this.maxDrawIndexedIndexValue = maxDrawIndexedIndexValue;
		maxDrawIndexedIndexValue0(super.ptr, maxDrawIndexedIndexValue);
	 }

	/**
	 * get method for field maxDrawIndexedIndexValue	[int]<br>
	 * Prototype: uint32_t  maxDrawIndexedIndexValue
	 */ 
	 public int maxDrawIndexedIndexValue(){
		 // return  this.maxDrawIndexedIndexValue;
		 return maxDrawIndexedIndexValue0(super.ptr);
	 }

	/**
	 * Set method for field maxDrawIndirectCount	[int]<br>
	 * Prototype: uint32_t  maxDrawIndirectCount
	 */ 
	 public void maxDrawIndirectCount(int maxDrawIndirectCount){
		 this.maxDrawIndirectCount = maxDrawIndirectCount;
		maxDrawIndirectCount0(super.ptr, maxDrawIndirectCount);
	 }

	/**
	 * get method for field maxDrawIndirectCount	[int]<br>
	 * Prototype: uint32_t  maxDrawIndirectCount
	 */ 
	 public int maxDrawIndirectCount(){
		 // return  this.maxDrawIndirectCount;
		 return maxDrawIndirectCount0(super.ptr);
	 }

	/**
	 * Set method for field maxSamplerLodBias	[float]<br>
	 * Prototype: float  maxSamplerLodBias
	 */ 
	 public void maxSamplerLodBias(float maxSamplerLodBias){
		 this.maxSamplerLodBias = maxSamplerLodBias;
		maxSamplerLodBias0(super.ptr, maxSamplerLodBias);
	 }

	/**
	 * get method for field maxSamplerLodBias	[float]<br>
	 * Prototype: float  maxSamplerLodBias
	 */ 
	 public float maxSamplerLodBias(){
		 // return  this.maxSamplerLodBias;
		 return maxSamplerLodBias0(super.ptr);
	 }

	/**
	 * Set method for field maxSamplerAnisotropy	[float]<br>
	 * Prototype: float  maxSamplerAnisotropy
	 */ 
	 public void maxSamplerAnisotropy(float maxSamplerAnisotropy){
		 this.maxSamplerAnisotropy = maxSamplerAnisotropy;
		maxSamplerAnisotropy0(super.ptr, maxSamplerAnisotropy);
	 }

	/**
	 * get method for field maxSamplerAnisotropy	[float]<br>
	 * Prototype: float  maxSamplerAnisotropy
	 */ 
	 public float maxSamplerAnisotropy(){
		 // return  this.maxSamplerAnisotropy;
		 return maxSamplerAnisotropy0(super.ptr);
	 }

	/**
	 * Set method for field maxViewports	[int]<br>
	 * Prototype: uint32_t  maxViewports
	 */ 
	 public void maxViewports(int maxViewports){
		 this.maxViewports = maxViewports;
		maxViewports0(super.ptr, maxViewports);
	 }

	/**
	 * get method for field maxViewports	[int]<br>
	 * Prototype: uint32_t  maxViewports
	 */ 
	 public int maxViewports(){
		 // return  this.maxViewports;
		 return maxViewports0(super.ptr);
	 }

	/**
	 * Set method for field maxViewportDimensions	[int_array]<br>
	 * Prototype: uint32_t[]  maxViewportDimensions
	 */ 
	 public void maxViewportDimensions(int[] maxViewportDimensions){
		 this.maxViewportDimensions = maxViewportDimensions;
		maxViewportDimensions0(super.ptr, maxViewportDimensions);
	 }

	/**
	 * get method for field maxViewportDimensions	[int_array]<br>
	 * Prototype: uint32_t[]  maxViewportDimensions
	 */ 
	 public int[] maxViewportDimensions(){
		 // return  this.maxViewportDimensions;
		 return maxViewportDimensions0(super.ptr);
	 }

	/**
	 * Set method for field viewportBoundsRange	[float_array]<br>
	 * Prototype: float[]  viewportBoundsRange
	 */ 
	 public void viewportBoundsRange(float[] viewportBoundsRange){
		 this.viewportBoundsRange = viewportBoundsRange;
		viewportBoundsRange0(super.ptr, viewportBoundsRange);
	 }

	/**
	 * get method for field viewportBoundsRange	[float_array]<br>
	 * Prototype: float[]  viewportBoundsRange
	 */ 
	 public float[] viewportBoundsRange(){
		 // return  this.viewportBoundsRange;
		 return viewportBoundsRange0(super.ptr);
	 }

	/**
	 * Set method for field viewportSubPixelBits	[int]<br>
	 * Prototype: uint32_t  viewportSubPixelBits
	 */ 
	 public void viewportSubPixelBits(int viewportSubPixelBits){
		 this.viewportSubPixelBits = viewportSubPixelBits;
		viewportSubPixelBits0(super.ptr, viewportSubPixelBits);
	 }

	/**
	 * get method for field viewportSubPixelBits	[int]<br>
	 * Prototype: uint32_t  viewportSubPixelBits
	 */ 
	 public int viewportSubPixelBits(){
		 // return  this.viewportSubPixelBits;
		 return viewportSubPixelBits0(super.ptr);
	 }

	/**
	 * Set method for field minMemoryMapAlignment	[long]<br>
	 * Prototype: size_t  minMemoryMapAlignment
	 */ 
	 public void minMemoryMapAlignment(long minMemoryMapAlignment){
		 this.minMemoryMapAlignment = minMemoryMapAlignment;
		minMemoryMapAlignment0(super.ptr, minMemoryMapAlignment);
	 }

	/**
	 * get method for field minMemoryMapAlignment	[long]<br>
	 * Prototype: size_t  minMemoryMapAlignment
	 */ 
	 public long minMemoryMapAlignment(){
		 // return  this.minMemoryMapAlignment;
		 return minMemoryMapAlignment0(super.ptr);
	 }

	/**
	 * Set method for field minTexelBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minTexelBufferOffsetAlignment
	 */ 
	 public void minTexelBufferOffsetAlignment(long minTexelBufferOffsetAlignment){
		 this.minTexelBufferOffsetAlignment = minTexelBufferOffsetAlignment;
		minTexelBufferOffsetAlignment0(super.ptr, minTexelBufferOffsetAlignment);
	 }

	/**
	 * get method for field minTexelBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minTexelBufferOffsetAlignment
	 */ 
	 public long minTexelBufferOffsetAlignment(){
		 // return  this.minTexelBufferOffsetAlignment;
		 return minTexelBufferOffsetAlignment0(super.ptr);
	 }

	/**
	 * Set method for field minUniformBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minUniformBufferOffsetAlignment
	 */ 
	 public void minUniformBufferOffsetAlignment(long minUniformBufferOffsetAlignment){
		 this.minUniformBufferOffsetAlignment = minUniformBufferOffsetAlignment;
		minUniformBufferOffsetAlignment0(super.ptr, minUniformBufferOffsetAlignment);
	 }

	/**
	 * get method for field minUniformBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minUniformBufferOffsetAlignment
	 */ 
	 public long minUniformBufferOffsetAlignment(){
		 // return  this.minUniformBufferOffsetAlignment;
		 return minUniformBufferOffsetAlignment0(super.ptr);
	 }

	/**
	 * Set method for field minStorageBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minStorageBufferOffsetAlignment
	 */ 
	 public void minStorageBufferOffsetAlignment(long minStorageBufferOffsetAlignment){
		 this.minStorageBufferOffsetAlignment = minStorageBufferOffsetAlignment;
		minStorageBufferOffsetAlignment0(super.ptr, minStorageBufferOffsetAlignment);
	 }

	/**
	 * get method for field minStorageBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minStorageBufferOffsetAlignment
	 */ 
	 public long minStorageBufferOffsetAlignment(){
		 // return  this.minStorageBufferOffsetAlignment;
		 return minStorageBufferOffsetAlignment0(super.ptr);
	 }

	/**
	 * Set method for field minTexelOffset	[int]<br>
	 * Prototype: int32_t  minTexelOffset
	 */ 
	 public void minTexelOffset(int minTexelOffset){
		 this.minTexelOffset = minTexelOffset;
		minTexelOffset0(super.ptr, minTexelOffset);
	 }

	/**
	 * get method for field minTexelOffset	[int]<br>
	 * Prototype: int32_t  minTexelOffset
	 */ 
	 public int minTexelOffset(){
		 // return  this.minTexelOffset;
		 return minTexelOffset0(super.ptr);
	 }

	/**
	 * Set method for field maxTexelOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelOffset
	 */ 
	 public void maxTexelOffset(int maxTexelOffset){
		 this.maxTexelOffset = maxTexelOffset;
		maxTexelOffset0(super.ptr, maxTexelOffset);
	 }

	/**
	 * get method for field maxTexelOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelOffset
	 */ 
	 public int maxTexelOffset(){
		 // return  this.maxTexelOffset;
		 return maxTexelOffset0(super.ptr);
	 }

	/**
	 * Set method for field minTexelGatherOffset	[int]<br>
	 * Prototype: int32_t  minTexelGatherOffset
	 */ 
	 public void minTexelGatherOffset(int minTexelGatherOffset){
		 this.minTexelGatherOffset = minTexelGatherOffset;
		minTexelGatherOffset0(super.ptr, minTexelGatherOffset);
	 }

	/**
	 * get method for field minTexelGatherOffset	[int]<br>
	 * Prototype: int32_t  minTexelGatherOffset
	 */ 
	 public int minTexelGatherOffset(){
		 // return  this.minTexelGatherOffset;
		 return minTexelGatherOffset0(super.ptr);
	 }

	/**
	 * Set method for field maxTexelGatherOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelGatherOffset
	 */ 
	 public void maxTexelGatherOffset(int maxTexelGatherOffset){
		 this.maxTexelGatherOffset = maxTexelGatherOffset;
		maxTexelGatherOffset0(super.ptr, maxTexelGatherOffset);
	 }

	/**
	 * get method for field maxTexelGatherOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelGatherOffset
	 */ 
	 public int maxTexelGatherOffset(){
		 // return  this.maxTexelGatherOffset;
		 return maxTexelGatherOffset0(super.ptr);
	 }

	/**
	 * Set method for field minInterpolationOffset	[float]<br>
	 * Prototype: float  minInterpolationOffset
	 */ 
	 public void minInterpolationOffset(float minInterpolationOffset){
		 this.minInterpolationOffset = minInterpolationOffset;
		minInterpolationOffset0(super.ptr, minInterpolationOffset);
	 }

	/**
	 * get method for field minInterpolationOffset	[float]<br>
	 * Prototype: float  minInterpolationOffset
	 */ 
	 public float minInterpolationOffset(){
		 // return  this.minInterpolationOffset;
		 return minInterpolationOffset0(super.ptr);
	 }

	/**
	 * Set method for field maxInterpolationOffset	[float]<br>
	 * Prototype: float  maxInterpolationOffset
	 */ 
	 public void maxInterpolationOffset(float maxInterpolationOffset){
		 this.maxInterpolationOffset = maxInterpolationOffset;
		maxInterpolationOffset0(super.ptr, maxInterpolationOffset);
	 }

	/**
	 * get method for field maxInterpolationOffset	[float]<br>
	 * Prototype: float  maxInterpolationOffset
	 */ 
	 public float maxInterpolationOffset(){
		 // return  this.maxInterpolationOffset;
		 return maxInterpolationOffset0(super.ptr);
	 }

	/**
	 * Set method for field subPixelInterpolationOffsetBits	[int]<br>
	 * Prototype: uint32_t  subPixelInterpolationOffsetBits
	 */ 
	 public void subPixelInterpolationOffsetBits(int subPixelInterpolationOffsetBits){
		 this.subPixelInterpolationOffsetBits = subPixelInterpolationOffsetBits;
		subPixelInterpolationOffsetBits0(super.ptr, subPixelInterpolationOffsetBits);
	 }

	/**
	 * get method for field subPixelInterpolationOffsetBits	[int]<br>
	 * Prototype: uint32_t  subPixelInterpolationOffsetBits
	 */ 
	 public int subPixelInterpolationOffsetBits(){
		 // return  this.subPixelInterpolationOffsetBits;
		 return subPixelInterpolationOffsetBits0(super.ptr);
	 }

	/**
	 * Set method for field maxFramebufferWidth	[int]<br>
	 * Prototype: uint32_t  maxFramebufferWidth
	 */ 
	 public void maxFramebufferWidth(int maxFramebufferWidth){
		 this.maxFramebufferWidth = maxFramebufferWidth;
		maxFramebufferWidth0(super.ptr, maxFramebufferWidth);
	 }

	/**
	 * get method for field maxFramebufferWidth	[int]<br>
	 * Prototype: uint32_t  maxFramebufferWidth
	 */ 
	 public int maxFramebufferWidth(){
		 // return  this.maxFramebufferWidth;
		 return maxFramebufferWidth0(super.ptr);
	 }

	/**
	 * Set method for field maxFramebufferHeight	[int]<br>
	 * Prototype: uint32_t  maxFramebufferHeight
	 */ 
	 public void maxFramebufferHeight(int maxFramebufferHeight){
		 this.maxFramebufferHeight = maxFramebufferHeight;
		maxFramebufferHeight0(super.ptr, maxFramebufferHeight);
	 }

	/**
	 * get method for field maxFramebufferHeight	[int]<br>
	 * Prototype: uint32_t  maxFramebufferHeight
	 */ 
	 public int maxFramebufferHeight(){
		 // return  this.maxFramebufferHeight;
		 return maxFramebufferHeight0(super.ptr);
	 }

	/**
	 * Set method for field maxFramebufferLayers	[int]<br>
	 * Prototype: uint32_t  maxFramebufferLayers
	 */ 
	 public void maxFramebufferLayers(int maxFramebufferLayers){
		 this.maxFramebufferLayers = maxFramebufferLayers;
		maxFramebufferLayers0(super.ptr, maxFramebufferLayers);
	 }

	/**
	 * get method for field maxFramebufferLayers	[int]<br>
	 * Prototype: uint32_t  maxFramebufferLayers
	 */ 
	 public int maxFramebufferLayers(){
		 // return  this.maxFramebufferLayers;
		 return maxFramebufferLayers0(super.ptr);
	 }

	/**
	 * Set method for field framebufferColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferColorSampleCounts
	 */ 
	 public void framebufferColorSampleCounts(int framebufferColorSampleCounts){
		 this.framebufferColorSampleCounts = framebufferColorSampleCounts;
		framebufferColorSampleCounts0(super.ptr, framebufferColorSampleCounts);
	 }

	/**
	 * get method for field framebufferColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferColorSampleCounts
	 */ 
	 public int framebufferColorSampleCounts(){
		 // return  this.framebufferColorSampleCounts;
		 return framebufferColorSampleCounts0(super.ptr);
	 }

	/**
	 * Set method for field framebufferDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferDepthSampleCounts
	 */ 
	 public void framebufferDepthSampleCounts(int framebufferDepthSampleCounts){
		 this.framebufferDepthSampleCounts = framebufferDepthSampleCounts;
		framebufferDepthSampleCounts0(super.ptr, framebufferDepthSampleCounts);
	 }

	/**
	 * get method for field framebufferDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferDepthSampleCounts
	 */ 
	 public int framebufferDepthSampleCounts(){
		 // return  this.framebufferDepthSampleCounts;
		 return framebufferDepthSampleCounts0(super.ptr);
	 }

	/**
	 * Set method for field framebufferStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferStencilSampleCounts
	 */ 
	 public void framebufferStencilSampleCounts(int framebufferStencilSampleCounts){
		 this.framebufferStencilSampleCounts = framebufferStencilSampleCounts;
		framebufferStencilSampleCounts0(super.ptr, framebufferStencilSampleCounts);
	 }

	/**
	 * get method for field framebufferStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferStencilSampleCounts
	 */ 
	 public int framebufferStencilSampleCounts(){
		 // return  this.framebufferStencilSampleCounts;
		 return framebufferStencilSampleCounts0(super.ptr);
	 }

	/**
	 * Set method for field framebufferNoAttachmentsSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferNoAttachmentsSampleCounts
	 */ 
	 public void framebufferNoAttachmentsSampleCounts(int framebufferNoAttachmentsSampleCounts){
		 this.framebufferNoAttachmentsSampleCounts = framebufferNoAttachmentsSampleCounts;
		framebufferNoAttachmentsSampleCounts0(super.ptr, framebufferNoAttachmentsSampleCounts);
	 }

	/**
	 * get method for field framebufferNoAttachmentsSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferNoAttachmentsSampleCounts
	 */ 
	 public int framebufferNoAttachmentsSampleCounts(){
		 // return  this.framebufferNoAttachmentsSampleCounts;
		 return framebufferNoAttachmentsSampleCounts0(super.ptr);
	 }

	/**
	 * Set method for field maxColorAttachments	[int]<br>
	 * Prototype: uint32_t  maxColorAttachments
	 */ 
	 public void maxColorAttachments(int maxColorAttachments){
		 this.maxColorAttachments = maxColorAttachments;
		maxColorAttachments0(super.ptr, maxColorAttachments);
	 }

	/**
	 * get method for field maxColorAttachments	[int]<br>
	 * Prototype: uint32_t  maxColorAttachments
	 */ 
	 public int maxColorAttachments(){
		 // return  this.maxColorAttachments;
		 return maxColorAttachments0(super.ptr);
	 }

	/**
	 * Set method for field sampledImageColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageColorSampleCounts
	 */ 
	 public void sampledImageColorSampleCounts(int sampledImageColorSampleCounts){
		 this.sampledImageColorSampleCounts = sampledImageColorSampleCounts;
		sampledImageColorSampleCounts0(super.ptr, sampledImageColorSampleCounts);
	 }

	/**
	 * get method for field sampledImageColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageColorSampleCounts
	 */ 
	 public int sampledImageColorSampleCounts(){
		 // return  this.sampledImageColorSampleCounts;
		 return sampledImageColorSampleCounts0(super.ptr);
	 }

	/**
	 * Set method for field sampledImageIntegerSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageIntegerSampleCounts
	 */ 
	 public void sampledImageIntegerSampleCounts(int sampledImageIntegerSampleCounts){
		 this.sampledImageIntegerSampleCounts = sampledImageIntegerSampleCounts;
		sampledImageIntegerSampleCounts0(super.ptr, sampledImageIntegerSampleCounts);
	 }

	/**
	 * get method for field sampledImageIntegerSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageIntegerSampleCounts
	 */ 
	 public int sampledImageIntegerSampleCounts(){
		 // return  this.sampledImageIntegerSampleCounts;
		 return sampledImageIntegerSampleCounts0(super.ptr);
	 }

	/**
	 * Set method for field sampledImageDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageDepthSampleCounts
	 */ 
	 public void sampledImageDepthSampleCounts(int sampledImageDepthSampleCounts){
		 this.sampledImageDepthSampleCounts = sampledImageDepthSampleCounts;
		sampledImageDepthSampleCounts0(super.ptr, sampledImageDepthSampleCounts);
	 }

	/**
	 * get method for field sampledImageDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageDepthSampleCounts
	 */ 
	 public int sampledImageDepthSampleCounts(){
		 // return  this.sampledImageDepthSampleCounts;
		 return sampledImageDepthSampleCounts0(super.ptr);
	 }

	/**
	 * Set method for field sampledImageStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageStencilSampleCounts
	 */ 
	 public void sampledImageStencilSampleCounts(int sampledImageStencilSampleCounts){
		 this.sampledImageStencilSampleCounts = sampledImageStencilSampleCounts;
		sampledImageStencilSampleCounts0(super.ptr, sampledImageStencilSampleCounts);
	 }

	/**
	 * get method for field sampledImageStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageStencilSampleCounts
	 */ 
	 public int sampledImageStencilSampleCounts(){
		 // return  this.sampledImageStencilSampleCounts;
		 return sampledImageStencilSampleCounts0(super.ptr);
	 }

	/**
	 * Set method for field storageImageSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  storageImageSampleCounts
	 */ 
	 public void storageImageSampleCounts(int storageImageSampleCounts){
		 this.storageImageSampleCounts = storageImageSampleCounts;
		storageImageSampleCounts0(super.ptr, storageImageSampleCounts);
	 }

	/**
	 * get method for field storageImageSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  storageImageSampleCounts
	 */ 
	 public int storageImageSampleCounts(){
		 // return  this.storageImageSampleCounts;
		 return storageImageSampleCounts0(super.ptr);
	 }

	/**
	 * Set method for field maxSampleMaskWords	[int]<br>
	 * Prototype: uint32_t  maxSampleMaskWords
	 */ 
	 public void maxSampleMaskWords(int maxSampleMaskWords){
		 this.maxSampleMaskWords = maxSampleMaskWords;
		maxSampleMaskWords0(super.ptr, maxSampleMaskWords);
	 }

	/**
	 * get method for field maxSampleMaskWords	[int]<br>
	 * Prototype: uint32_t  maxSampleMaskWords
	 */ 
	 public int maxSampleMaskWords(){
		 // return  this.maxSampleMaskWords;
		 return maxSampleMaskWords0(super.ptr);
	 }

	/**
	 * Set method for field timestampComputeAndGraphics	[boolean]<br>
	 * Prototype: VkBool32  timestampComputeAndGraphics
	 */ 
	 public void timestampComputeAndGraphics(boolean timestampComputeAndGraphics){
		 this.timestampComputeAndGraphics = timestampComputeAndGraphics;
		timestampComputeAndGraphics0(super.ptr, timestampComputeAndGraphics);
	 }

	/**
	 * get method for field timestampComputeAndGraphics	[boolean]<br>
	 * Prototype: VkBool32  timestampComputeAndGraphics
	 */ 
	 public boolean timestampComputeAndGraphics(){
		 // return  this.timestampComputeAndGraphics;
		 return timestampComputeAndGraphics0(super.ptr);
	 }

	/**
	 * Set method for field timestampPeriod	[float]<br>
	 * Prototype: float  timestampPeriod
	 */ 
	 public void timestampPeriod(float timestampPeriod){
		 this.timestampPeriod = timestampPeriod;
		timestampPeriod0(super.ptr, timestampPeriod);
	 }

	/**
	 * get method for field timestampPeriod	[float]<br>
	 * Prototype: float  timestampPeriod
	 */ 
	 public float timestampPeriod(){
		 // return  this.timestampPeriod;
		 return timestampPeriod0(super.ptr);
	 }

	/**
	 * Set method for field maxClipDistances	[int]<br>
	 * Prototype: uint32_t  maxClipDistances
	 */ 
	 public void maxClipDistances(int maxClipDistances){
		 this.maxClipDistances = maxClipDistances;
		maxClipDistances0(super.ptr, maxClipDistances);
	 }

	/**
	 * get method for field maxClipDistances	[int]<br>
	 * Prototype: uint32_t  maxClipDistances
	 */ 
	 public int maxClipDistances(){
		 // return  this.maxClipDistances;
		 return maxClipDistances0(super.ptr);
	 }

	/**
	 * Set method for field maxCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCullDistances
	 */ 
	 public void maxCullDistances(int maxCullDistances){
		 this.maxCullDistances = maxCullDistances;
		maxCullDistances0(super.ptr, maxCullDistances);
	 }

	/**
	 * get method for field maxCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCullDistances
	 */ 
	 public int maxCullDistances(){
		 // return  this.maxCullDistances;
		 return maxCullDistances0(super.ptr);
	 }

	/**
	 * Set method for field maxCombinedClipAndCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCombinedClipAndCullDistances
	 */ 
	 public void maxCombinedClipAndCullDistances(int maxCombinedClipAndCullDistances){
		 this.maxCombinedClipAndCullDistances = maxCombinedClipAndCullDistances;
		maxCombinedClipAndCullDistances0(super.ptr, maxCombinedClipAndCullDistances);
	 }

	/**
	 * get method for field maxCombinedClipAndCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCombinedClipAndCullDistances
	 */ 
	 public int maxCombinedClipAndCullDistances(){
		 // return  this.maxCombinedClipAndCullDistances;
		 return maxCombinedClipAndCullDistances0(super.ptr);
	 }

	/**
	 * Set method for field discreteQueuePriorities	[int]<br>
	 * Prototype: uint32_t  discreteQueuePriorities
	 */ 
	 public void discreteQueuePriorities(int discreteQueuePriorities){
		 this.discreteQueuePriorities = discreteQueuePriorities;
		discreteQueuePriorities0(super.ptr, discreteQueuePriorities);
	 }

	/**
	 * get method for field discreteQueuePriorities	[int]<br>
	 * Prototype: uint32_t  discreteQueuePriorities
	 */ 
	 public int discreteQueuePriorities(){
		 // return  this.discreteQueuePriorities;
		 return discreteQueuePriorities0(super.ptr);
	 }

	/**
	 * Set method for field pointSizeRange	[float_array]<br>
	 * Prototype: float[]  pointSizeRange
	 */ 
	 public void pointSizeRange(float[] pointSizeRange){
		 this.pointSizeRange = pointSizeRange;
		pointSizeRange0(super.ptr, pointSizeRange);
	 }

	/**
	 * get method for field pointSizeRange	[float_array]<br>
	 * Prototype: float[]  pointSizeRange
	 */ 
	 public float[] pointSizeRange(){
		 // return  this.pointSizeRange;
		 return pointSizeRange0(super.ptr);
	 }

	/**
	 * Set method for field lineWidthRange	[float_array]<br>
	 * Prototype: float[]  lineWidthRange
	 */ 
	 public void lineWidthRange(float[] lineWidthRange){
		 this.lineWidthRange = lineWidthRange;
		lineWidthRange0(super.ptr, lineWidthRange);
	 }

	/**
	 * get method for field lineWidthRange	[float_array]<br>
	 * Prototype: float[]  lineWidthRange
	 */ 
	 public float[] lineWidthRange(){
		 // return  this.lineWidthRange;
		 return lineWidthRange0(super.ptr);
	 }

	/**
	 * Set method for field pointSizeGranularity	[float]<br>
	 * Prototype: float  pointSizeGranularity
	 */ 
	 public void pointSizeGranularity(float pointSizeGranularity){
		 this.pointSizeGranularity = pointSizeGranularity;
		pointSizeGranularity0(super.ptr, pointSizeGranularity);
	 }

	/**
	 * get method for field pointSizeGranularity	[float]<br>
	 * Prototype: float  pointSizeGranularity
	 */ 
	 public float pointSizeGranularity(){
		 // return  this.pointSizeGranularity;
		 return pointSizeGranularity0(super.ptr);
	 }

	/**
	 * Set method for field lineWidthGranularity	[float]<br>
	 * Prototype: float  lineWidthGranularity
	 */ 
	 public void lineWidthGranularity(float lineWidthGranularity){
		 this.lineWidthGranularity = lineWidthGranularity;
		lineWidthGranularity0(super.ptr, lineWidthGranularity);
	 }

	/**
	 * get method for field lineWidthGranularity	[float]<br>
	 * Prototype: float  lineWidthGranularity
	 */ 
	 public float lineWidthGranularity(){
		 // return  this.lineWidthGranularity;
		 return lineWidthGranularity0(super.ptr);
	 }

	/**
	 * Set method for field strictLines	[boolean]<br>
	 * Prototype: VkBool32  strictLines
	 */ 
	 public void strictLines(boolean strictLines){
		 this.strictLines = strictLines;
		strictLines0(super.ptr, strictLines);
	 }

	/**
	 * get method for field strictLines	[boolean]<br>
	 * Prototype: VkBool32  strictLines
	 */ 
	 public boolean strictLines(){
		 // return  this.strictLines;
		 return strictLines0(super.ptr);
	 }

	/**
	 * Set method for field standardSampleLocations	[boolean]<br>
	 * Prototype: VkBool32  standardSampleLocations
	 */ 
	 public void standardSampleLocations(boolean standardSampleLocations){
		 this.standardSampleLocations = standardSampleLocations;
		standardSampleLocations0(super.ptr, standardSampleLocations);
	 }

	/**
	 * get method for field standardSampleLocations	[boolean]<br>
	 * Prototype: VkBool32  standardSampleLocations
	 */ 
	 public boolean standardSampleLocations(){
		 // return  this.standardSampleLocations;
		 return standardSampleLocations0(super.ptr);
	 }

	/**
	 * Set method for field optimalBufferCopyOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyOffsetAlignment
	 */ 
	 public void optimalBufferCopyOffsetAlignment(long optimalBufferCopyOffsetAlignment){
		 this.optimalBufferCopyOffsetAlignment = optimalBufferCopyOffsetAlignment;
		optimalBufferCopyOffsetAlignment0(super.ptr, optimalBufferCopyOffsetAlignment);
	 }

	/**
	 * get method for field optimalBufferCopyOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyOffsetAlignment
	 */ 
	 public long optimalBufferCopyOffsetAlignment(){
		 // return  this.optimalBufferCopyOffsetAlignment;
		 return optimalBufferCopyOffsetAlignment0(super.ptr);
	 }

	/**
	 * Set method for field optimalBufferCopyRowPitchAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyRowPitchAlignment
	 */ 
	 public void optimalBufferCopyRowPitchAlignment(long optimalBufferCopyRowPitchAlignment){
		 this.optimalBufferCopyRowPitchAlignment = optimalBufferCopyRowPitchAlignment;
		optimalBufferCopyRowPitchAlignment0(super.ptr, optimalBufferCopyRowPitchAlignment);
	 }

	/**
	 * get method for field optimalBufferCopyRowPitchAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyRowPitchAlignment
	 */ 
	 public long optimalBufferCopyRowPitchAlignment(){
		 // return  this.optimalBufferCopyRowPitchAlignment;
		 return optimalBufferCopyRowPitchAlignment0(super.ptr);
	 }

	/**
	 * Set method for field nonCoherentAtomSize	[long]<br>
	 * Prototype: VkDeviceSize  nonCoherentAtomSize
	 */ 
	 public void nonCoherentAtomSize(long nonCoherentAtomSize){
		 this.nonCoherentAtomSize = nonCoherentAtomSize;
		nonCoherentAtomSize0(super.ptr, nonCoherentAtomSize);
	 }

	/**
	 * get method for field nonCoherentAtomSize	[long]<br>
	 * Prototype: VkDeviceSize  nonCoherentAtomSize
	 */ 
	 public long nonCoherentAtomSize(){
		 // return  this.nonCoherentAtomSize;
		 return nonCoherentAtomSize0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field maxImageDimension1D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension1D
	 */ 
	 private static native void maxImageDimension1D0(ByteBuffer ptr, int _maxImageDimension1D);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxImageDimension1D = (uint32_t) (_maxImageDimension1D);
	  */

	/**
	 * native GET method for field maxImageDimension1D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension1D
	 */ 
	 private static native int maxImageDimension1D0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxImageDimension2D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension2D
	 */ 
	 private static native void maxImageDimension2D0(ByteBuffer ptr, int _maxImageDimension2D);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxImageDimension2D = (uint32_t) (_maxImageDimension2D);
	  */

	/**
	 * native GET method for field maxImageDimension2D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension2D
	 */ 
	 private static native int maxImageDimension2D0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxImageDimension3D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension3D
	 */ 
	 private static native void maxImageDimension3D0(ByteBuffer ptr, int _maxImageDimension3D);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxImageDimension3D = (uint32_t) (_maxImageDimension3D);
	  */

	/**
	 * native GET method for field maxImageDimension3D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension3D
	 */ 
	 private static native int maxImageDimension3D0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxImageDimensionCube	[int]<br>
	 * Prototype: uint32_t  maxImageDimensionCube
	 */ 
	 private static native void maxImageDimensionCube0(ByteBuffer ptr, int _maxImageDimensionCube);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxImageDimensionCube = (uint32_t) (_maxImageDimensionCube);
	  */

	/**
	 * native GET method for field maxImageDimensionCube	[int]<br>
	 * Prototype: uint32_t  maxImageDimensionCube
	 */ 
	 private static native int maxImageDimensionCube0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxImageArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxImageArrayLayers
	 */ 
	 private static native void maxImageArrayLayers0(ByteBuffer ptr, int _maxImageArrayLayers);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxImageArrayLayers = (uint32_t) (_maxImageArrayLayers);
	  */

	/**
	 * native GET method for field maxImageArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxImageArrayLayers
	 */ 
	 private static native int maxImageArrayLayers0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxTexelBufferElements	[int]<br>
	 * Prototype: uint32_t  maxTexelBufferElements
	 */ 
	 private static native void maxTexelBufferElements0(ByteBuffer ptr, int _maxTexelBufferElements);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxTexelBufferElements = (uint32_t) (_maxTexelBufferElements);
	  */

	/**
	 * native GET method for field maxTexelBufferElements	[int]<br>
	 * Prototype: uint32_t  maxTexelBufferElements
	 */ 
	 private static native int maxTexelBufferElements0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxUniformBufferRange	[int]<br>
	 * Prototype: uint32_t  maxUniformBufferRange
	 */ 
	 private static native void maxUniformBufferRange0(ByteBuffer ptr, int _maxUniformBufferRange);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxUniformBufferRange = (uint32_t) (_maxUniformBufferRange);
	  */

	/**
	 * native GET method for field maxUniformBufferRange	[int]<br>
	 * Prototype: uint32_t  maxUniformBufferRange
	 */ 
	 private static native int maxUniformBufferRange0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxStorageBufferRange	[int]<br>
	 * Prototype: uint32_t  maxStorageBufferRange
	 */ 
	 private static native void maxStorageBufferRange0(ByteBuffer ptr, int _maxStorageBufferRange);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxStorageBufferRange = (uint32_t) (_maxStorageBufferRange);
	  */

	/**
	 * native GET method for field maxStorageBufferRange	[int]<br>
	 * Prototype: uint32_t  maxStorageBufferRange
	 */ 
	 private static native int maxStorageBufferRange0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxPushConstantsSize	[int]<br>
	 * Prototype: uint32_t  maxPushConstantsSize
	 */ 
	 private static native void maxPushConstantsSize0(ByteBuffer ptr, int _maxPushConstantsSize);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxPushConstantsSize = (uint32_t) (_maxPushConstantsSize);
	  */

	/**
	 * native GET method for field maxPushConstantsSize	[int]<br>
	 * Prototype: uint32_t  maxPushConstantsSize
	 */ 
	 private static native int maxPushConstantsSize0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxMemoryAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxMemoryAllocationCount
	 */ 
	 private static native void maxMemoryAllocationCount0(ByteBuffer ptr, int _maxMemoryAllocationCount);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxMemoryAllocationCount = (uint32_t) (_maxMemoryAllocationCount);
	  */

	/**
	 * native GET method for field maxMemoryAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxMemoryAllocationCount
	 */ 
	 private static native int maxMemoryAllocationCount0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxSamplerAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxSamplerAllocationCount
	 */ 
	 private static native void maxSamplerAllocationCount0(ByteBuffer ptr, int _maxSamplerAllocationCount);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxSamplerAllocationCount = (uint32_t) (_maxSamplerAllocationCount);
	  */

	/**
	 * native GET method for field maxSamplerAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxSamplerAllocationCount
	 */ 
	 private static native int maxSamplerAllocationCount0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field bufferImageGranularity	[long]<br>
	 * Prototype: VkDeviceSize  bufferImageGranularity
	 */ 
	 private static native void bufferImageGranularity0(ByteBuffer ptr, long _bufferImageGranularity);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.bufferImageGranularity = (VkDeviceSize) (_bufferImageGranularity);
	  */

	/**
	 * native GET method for field bufferImageGranularity	[long]<br>
	 * Prototype: VkDeviceSize  bufferImageGranularity
	 */ 
	 private static native long bufferImageGranularity0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native SET method for field sparseAddressSpaceSize	[long]<br>
	 * Prototype: VkDeviceSize  sparseAddressSpaceSize
	 */ 
	 private static native void sparseAddressSpaceSize0(ByteBuffer ptr, long _sparseAddressSpaceSize);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.sparseAddressSpaceSize = (VkDeviceSize) (_sparseAddressSpaceSize);
	  */

	/**
	 * native GET method for field sparseAddressSpaceSize	[long]<br>
	 * Prototype: VkDeviceSize  sparseAddressSpaceSize
	 */ 
	 private static native long sparseAddressSpaceSize0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native SET method for field maxBoundDescriptorSets	[int]<br>
	 * Prototype: uint32_t  maxBoundDescriptorSets
	 */ 
	 private static native void maxBoundDescriptorSets0(ByteBuffer ptr, int _maxBoundDescriptorSets);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxBoundDescriptorSets = (uint32_t) (_maxBoundDescriptorSets);
	  */

	/**
	 * native GET method for field maxBoundDescriptorSets	[int]<br>
	 * Prototype: uint32_t  maxBoundDescriptorSets
	 */ 
	 private static native int maxBoundDescriptorSets0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxPerStageDescriptorSamplers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSamplers
	 */ 
	 private static native void maxPerStageDescriptorSamplers0(ByteBuffer ptr, int _maxPerStageDescriptorSamplers);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxPerStageDescriptorSamplers = (uint32_t) (_maxPerStageDescriptorSamplers);
	  */

	/**
	 * native GET method for field maxPerStageDescriptorSamplers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSamplers
	 */ 
	 private static native int maxPerStageDescriptorSamplers0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxPerStageDescriptorUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorUniformBuffers
	 */ 
	 private static native void maxPerStageDescriptorUniformBuffers0(ByteBuffer ptr, int _maxPerStageDescriptorUniformBuffers);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxPerStageDescriptorUniformBuffers = (uint32_t) (_maxPerStageDescriptorUniformBuffers);
	  */

	/**
	 * native GET method for field maxPerStageDescriptorUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorUniformBuffers
	 */ 
	 private static native int maxPerStageDescriptorUniformBuffers0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxPerStageDescriptorStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageBuffers
	 */ 
	 private static native void maxPerStageDescriptorStorageBuffers0(ByteBuffer ptr, int _maxPerStageDescriptorStorageBuffers);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxPerStageDescriptorStorageBuffers = (uint32_t) (_maxPerStageDescriptorStorageBuffers);
	  */

	/**
	 * native GET method for field maxPerStageDescriptorStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageBuffers
	 */ 
	 private static native int maxPerStageDescriptorStorageBuffers0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxPerStageDescriptorSampledImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSampledImages
	 */ 
	 private static native void maxPerStageDescriptorSampledImages0(ByteBuffer ptr, int _maxPerStageDescriptorSampledImages);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxPerStageDescriptorSampledImages = (uint32_t) (_maxPerStageDescriptorSampledImages);
	  */

	/**
	 * native GET method for field maxPerStageDescriptorSampledImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSampledImages
	 */ 
	 private static native int maxPerStageDescriptorSampledImages0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxPerStageDescriptorStorageImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageImages
	 */ 
	 private static native void maxPerStageDescriptorStorageImages0(ByteBuffer ptr, int _maxPerStageDescriptorStorageImages);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxPerStageDescriptorStorageImages = (uint32_t) (_maxPerStageDescriptorStorageImages);
	  */

	/**
	 * native GET method for field maxPerStageDescriptorStorageImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageImages
	 */ 
	 private static native int maxPerStageDescriptorStorageImages0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxPerStageDescriptorInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorInputAttachments
	 */ 
	 private static native void maxPerStageDescriptorInputAttachments0(ByteBuffer ptr, int _maxPerStageDescriptorInputAttachments);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxPerStageDescriptorInputAttachments = (uint32_t) (_maxPerStageDescriptorInputAttachments);
	  */

	/**
	 * native GET method for field maxPerStageDescriptorInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorInputAttachments
	 */ 
	 private static native int maxPerStageDescriptorInputAttachments0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxPerStageResources	[int]<br>
	 * Prototype: uint32_t  maxPerStageResources
	 */ 
	 private static native void maxPerStageResources0(ByteBuffer ptr, int _maxPerStageResources);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxPerStageResources = (uint32_t) (_maxPerStageResources);
	  */

	/**
	 * native GET method for field maxPerStageResources	[int]<br>
	 * Prototype: uint32_t  maxPerStageResources
	 */ 
	 private static native int maxPerStageResources0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxDescriptorSetSamplers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSamplers
	 */ 
	 private static native void maxDescriptorSetSamplers0(ByteBuffer ptr, int _maxDescriptorSetSamplers);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxDescriptorSetSamplers = (uint32_t) (_maxDescriptorSetSamplers);
	  */

	/**
	 * native GET method for field maxDescriptorSetSamplers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSamplers
	 */ 
	 private static native int maxDescriptorSetSamplers0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxDescriptorSetUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffers
	 */ 
	 private static native void maxDescriptorSetUniformBuffers0(ByteBuffer ptr, int _maxDescriptorSetUniformBuffers);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxDescriptorSetUniformBuffers = (uint32_t) (_maxDescriptorSetUniformBuffers);
	  */

	/**
	 * native GET method for field maxDescriptorSetUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffers
	 */ 
	 private static native int maxDescriptorSetUniformBuffers0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxDescriptorSetUniformBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffersDynamic
	 */ 
	 private static native void maxDescriptorSetUniformBuffersDynamic0(ByteBuffer ptr, int _maxDescriptorSetUniformBuffersDynamic);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxDescriptorSetUniformBuffersDynamic = (uint32_t) (_maxDescriptorSetUniformBuffersDynamic);
	  */

	/**
	 * native GET method for field maxDescriptorSetUniformBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffersDynamic
	 */ 
	 private static native int maxDescriptorSetUniformBuffersDynamic0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxDescriptorSetStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffers
	 */ 
	 private static native void maxDescriptorSetStorageBuffers0(ByteBuffer ptr, int _maxDescriptorSetStorageBuffers);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxDescriptorSetStorageBuffers = (uint32_t) (_maxDescriptorSetStorageBuffers);
	  */

	/**
	 * native GET method for field maxDescriptorSetStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffers
	 */ 
	 private static native int maxDescriptorSetStorageBuffers0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxDescriptorSetStorageBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffersDynamic
	 */ 
	 private static native void maxDescriptorSetStorageBuffersDynamic0(ByteBuffer ptr, int _maxDescriptorSetStorageBuffersDynamic);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxDescriptorSetStorageBuffersDynamic = (uint32_t) (_maxDescriptorSetStorageBuffersDynamic);
	  */

	/**
	 * native GET method for field maxDescriptorSetStorageBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffersDynamic
	 */ 
	 private static native int maxDescriptorSetStorageBuffersDynamic0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxDescriptorSetSampledImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSampledImages
	 */ 
	 private static native void maxDescriptorSetSampledImages0(ByteBuffer ptr, int _maxDescriptorSetSampledImages);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxDescriptorSetSampledImages = (uint32_t) (_maxDescriptorSetSampledImages);
	  */

	/**
	 * native GET method for field maxDescriptorSetSampledImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSampledImages
	 */ 
	 private static native int maxDescriptorSetSampledImages0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxDescriptorSetStorageImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageImages
	 */ 
	 private static native void maxDescriptorSetStorageImages0(ByteBuffer ptr, int _maxDescriptorSetStorageImages);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxDescriptorSetStorageImages = (uint32_t) (_maxDescriptorSetStorageImages);
	  */

	/**
	 * native GET method for field maxDescriptorSetStorageImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageImages
	 */ 
	 private static native int maxDescriptorSetStorageImages0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxDescriptorSetInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetInputAttachments
	 */ 
	 private static native void maxDescriptorSetInputAttachments0(ByteBuffer ptr, int _maxDescriptorSetInputAttachments);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxDescriptorSetInputAttachments = (uint32_t) (_maxDescriptorSetInputAttachments);
	  */

	/**
	 * native GET method for field maxDescriptorSetInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetInputAttachments
	 */ 
	 private static native int maxDescriptorSetInputAttachments0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxVertexInputAttributes	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributes
	 */ 
	 private static native void maxVertexInputAttributes0(ByteBuffer ptr, int _maxVertexInputAttributes);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxVertexInputAttributes = (uint32_t) (_maxVertexInputAttributes);
	  */

	/**
	 * native GET method for field maxVertexInputAttributes	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributes
	 */ 
	 private static native int maxVertexInputAttributes0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxVertexInputBindings	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindings
	 */ 
	 private static native void maxVertexInputBindings0(ByteBuffer ptr, int _maxVertexInputBindings);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxVertexInputBindings = (uint32_t) (_maxVertexInputBindings);
	  */

	/**
	 * native GET method for field maxVertexInputBindings	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindings
	 */ 
	 private static native int maxVertexInputBindings0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxVertexInputAttributeOffset	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributeOffset
	 */ 
	 private static native void maxVertexInputAttributeOffset0(ByteBuffer ptr, int _maxVertexInputAttributeOffset);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxVertexInputAttributeOffset = (uint32_t) (_maxVertexInputAttributeOffset);
	  */

	/**
	 * native GET method for field maxVertexInputAttributeOffset	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributeOffset
	 */ 
	 private static native int maxVertexInputAttributeOffset0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxVertexInputBindingStride	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindingStride
	 */ 
	 private static native void maxVertexInputBindingStride0(ByteBuffer ptr, int _maxVertexInputBindingStride);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxVertexInputBindingStride = (uint32_t) (_maxVertexInputBindingStride);
	  */

	/**
	 * native GET method for field maxVertexInputBindingStride	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindingStride
	 */ 
	 private static native int maxVertexInputBindingStride0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxVertexOutputComponents
	 */ 
	 private static native void maxVertexOutputComponents0(ByteBuffer ptr, int _maxVertexOutputComponents);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxVertexOutputComponents = (uint32_t) (_maxVertexOutputComponents);
	  */

	/**
	 * native GET method for field maxVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxVertexOutputComponents
	 */ 
	 private static native int maxVertexOutputComponents0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxTessellationGenerationLevel	[int]<br>
	 * Prototype: uint32_t  maxTessellationGenerationLevel
	 */ 
	 private static native void maxTessellationGenerationLevel0(ByteBuffer ptr, int _maxTessellationGenerationLevel);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxTessellationGenerationLevel = (uint32_t) (_maxTessellationGenerationLevel);
	  */

	/**
	 * native GET method for field maxTessellationGenerationLevel	[int]<br>
	 * Prototype: uint32_t  maxTessellationGenerationLevel
	 */ 
	 private static native int maxTessellationGenerationLevel0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxTessellationPatchSize	[int]<br>
	 * Prototype: uint32_t  maxTessellationPatchSize
	 */ 
	 private static native void maxTessellationPatchSize0(ByteBuffer ptr, int _maxTessellationPatchSize);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxTessellationPatchSize = (uint32_t) (_maxTessellationPatchSize);
	  */

	/**
	 * native GET method for field maxTessellationPatchSize	[int]<br>
	 * Prototype: uint32_t  maxTessellationPatchSize
	 */ 
	 private static native int maxTessellationPatchSize0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxTessellationControlPerVertexInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexInputComponents
	 */ 
	 private static native void maxTessellationControlPerVertexInputComponents0(ByteBuffer ptr, int _maxTessellationControlPerVertexInputComponents);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxTessellationControlPerVertexInputComponents = (uint32_t) (_maxTessellationControlPerVertexInputComponents);
	  */

	/**
	 * native GET method for field maxTessellationControlPerVertexInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexInputComponents
	 */ 
	 private static native int maxTessellationControlPerVertexInputComponents0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxTessellationControlPerVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexOutputComponents
	 */ 
	 private static native void maxTessellationControlPerVertexOutputComponents0(ByteBuffer ptr, int _maxTessellationControlPerVertexOutputComponents);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxTessellationControlPerVertexOutputComponents = (uint32_t) (_maxTessellationControlPerVertexOutputComponents);
	  */

	/**
	 * native GET method for field maxTessellationControlPerVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexOutputComponents
	 */ 
	 private static native int maxTessellationControlPerVertexOutputComponents0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxTessellationControlPerPatchOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerPatchOutputComponents
	 */ 
	 private static native void maxTessellationControlPerPatchOutputComponents0(ByteBuffer ptr, int _maxTessellationControlPerPatchOutputComponents);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxTessellationControlPerPatchOutputComponents = (uint32_t) (_maxTessellationControlPerPatchOutputComponents);
	  */

	/**
	 * native GET method for field maxTessellationControlPerPatchOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerPatchOutputComponents
	 */ 
	 private static native int maxTessellationControlPerPatchOutputComponents0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxTessellationControlTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlTotalOutputComponents
	 */ 
	 private static native void maxTessellationControlTotalOutputComponents0(ByteBuffer ptr, int _maxTessellationControlTotalOutputComponents);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxTessellationControlTotalOutputComponents = (uint32_t) (_maxTessellationControlTotalOutputComponents);
	  */

	/**
	 * native GET method for field maxTessellationControlTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlTotalOutputComponents
	 */ 
	 private static native int maxTessellationControlTotalOutputComponents0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxTessellationEvaluationInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationInputComponents
	 */ 
	 private static native void maxTessellationEvaluationInputComponents0(ByteBuffer ptr, int _maxTessellationEvaluationInputComponents);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxTessellationEvaluationInputComponents = (uint32_t) (_maxTessellationEvaluationInputComponents);
	  */

	/**
	 * native GET method for field maxTessellationEvaluationInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationInputComponents
	 */ 
	 private static native int maxTessellationEvaluationInputComponents0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxTessellationEvaluationOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationOutputComponents
	 */ 
	 private static native void maxTessellationEvaluationOutputComponents0(ByteBuffer ptr, int _maxTessellationEvaluationOutputComponents);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxTessellationEvaluationOutputComponents = (uint32_t) (_maxTessellationEvaluationOutputComponents);
	  */

	/**
	 * native GET method for field maxTessellationEvaluationOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationOutputComponents
	 */ 
	 private static native int maxTessellationEvaluationOutputComponents0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxGeometryShaderInvocations	[int]<br>
	 * Prototype: uint32_t  maxGeometryShaderInvocations
	 */ 
	 private static native void maxGeometryShaderInvocations0(ByteBuffer ptr, int _maxGeometryShaderInvocations);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxGeometryShaderInvocations = (uint32_t) (_maxGeometryShaderInvocations);
	  */

	/**
	 * native GET method for field maxGeometryShaderInvocations	[int]<br>
	 * Prototype: uint32_t  maxGeometryShaderInvocations
	 */ 
	 private static native int maxGeometryShaderInvocations0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxGeometryInputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryInputComponents
	 */ 
	 private static native void maxGeometryInputComponents0(ByteBuffer ptr, int _maxGeometryInputComponents);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxGeometryInputComponents = (uint32_t) (_maxGeometryInputComponents);
	  */

	/**
	 * native GET method for field maxGeometryInputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryInputComponents
	 */ 
	 private static native int maxGeometryInputComponents0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxGeometryOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputComponents
	 */ 
	 private static native void maxGeometryOutputComponents0(ByteBuffer ptr, int _maxGeometryOutputComponents);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxGeometryOutputComponents = (uint32_t) (_maxGeometryOutputComponents);
	  */

	/**
	 * native GET method for field maxGeometryOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputComponents
	 */ 
	 private static native int maxGeometryOutputComponents0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxGeometryOutputVertices	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputVertices
	 */ 
	 private static native void maxGeometryOutputVertices0(ByteBuffer ptr, int _maxGeometryOutputVertices);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxGeometryOutputVertices = (uint32_t) (_maxGeometryOutputVertices);
	  */

	/**
	 * native GET method for field maxGeometryOutputVertices	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputVertices
	 */ 
	 private static native int maxGeometryOutputVertices0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxGeometryTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryTotalOutputComponents
	 */ 
	 private static native void maxGeometryTotalOutputComponents0(ByteBuffer ptr, int _maxGeometryTotalOutputComponents);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxGeometryTotalOutputComponents = (uint32_t) (_maxGeometryTotalOutputComponents);
	  */

	/**
	 * native GET method for field maxGeometryTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryTotalOutputComponents
	 */ 
	 private static native int maxGeometryTotalOutputComponents0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxFragmentInputComponents	[int]<br>
	 * Prototype: uint32_t  maxFragmentInputComponents
	 */ 
	 private static native void maxFragmentInputComponents0(ByteBuffer ptr, int _maxFragmentInputComponents);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxFragmentInputComponents = (uint32_t) (_maxFragmentInputComponents);
	  */

	/**
	 * native GET method for field maxFragmentInputComponents	[int]<br>
	 * Prototype: uint32_t  maxFragmentInputComponents
	 */ 
	 private static native int maxFragmentInputComponents0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxFragmentOutputAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentOutputAttachments
	 */ 
	 private static native void maxFragmentOutputAttachments0(ByteBuffer ptr, int _maxFragmentOutputAttachments);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxFragmentOutputAttachments = (uint32_t) (_maxFragmentOutputAttachments);
	  */

	/**
	 * native GET method for field maxFragmentOutputAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentOutputAttachments
	 */ 
	 private static native int maxFragmentOutputAttachments0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxFragmentDualSrcAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentDualSrcAttachments
	 */ 
	 private static native void maxFragmentDualSrcAttachments0(ByteBuffer ptr, int _maxFragmentDualSrcAttachments);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxFragmentDualSrcAttachments = (uint32_t) (_maxFragmentDualSrcAttachments);
	  */

	/**
	 * native GET method for field maxFragmentDualSrcAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentDualSrcAttachments
	 */ 
	 private static native int maxFragmentDualSrcAttachments0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxFragmentCombinedOutputResources	[int]<br>
	 * Prototype: uint32_t  maxFragmentCombinedOutputResources
	 */ 
	 private static native void maxFragmentCombinedOutputResources0(ByteBuffer ptr, int _maxFragmentCombinedOutputResources);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxFragmentCombinedOutputResources = (uint32_t) (_maxFragmentCombinedOutputResources);
	  */

	/**
	 * native GET method for field maxFragmentCombinedOutputResources	[int]<br>
	 * Prototype: uint32_t  maxFragmentCombinedOutputResources
	 */ 
	 private static native int maxFragmentCombinedOutputResources0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxComputeSharedMemorySize	[int]<br>
	 * Prototype: uint32_t  maxComputeSharedMemorySize
	 */ 
	 private static native void maxComputeSharedMemorySize0(ByteBuffer ptr, int _maxComputeSharedMemorySize);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxComputeSharedMemorySize = (uint32_t) (_maxComputeSharedMemorySize);
	  */

	/**
	 * native GET method for field maxComputeSharedMemorySize	[int]<br>
	 * Prototype: uint32_t  maxComputeSharedMemorySize
	 */ 
	 private static native int maxComputeSharedMemorySize0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxComputeWorkGroupCount	[int_array]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupCount
	 */ 
	 private static native void maxComputeWorkGroupCount0(ByteBuffer ptr, int[] _maxComputeWorkGroupCount);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxComputeWorkGroupCount = (uint32_t[]) (_maxComputeWorkGroupCount);
	  */

	/**
	 * native GET method for field maxComputeWorkGroupCount	[int_array]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupCount
	 */ 
	 private static native int[] maxComputeWorkGroupCount0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (int[]) (_obj.uint32_t[]);
	 */

	/**
	 * native SET method for field maxComputeWorkGroupInvocations	[int]<br>
	 * Prototype: uint32_t  maxComputeWorkGroupInvocations
	 */ 
	 private static native void maxComputeWorkGroupInvocations0(ByteBuffer ptr, int _maxComputeWorkGroupInvocations);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxComputeWorkGroupInvocations = (uint32_t) (_maxComputeWorkGroupInvocations);
	  */

	/**
	 * native GET method for field maxComputeWorkGroupInvocations	[int]<br>
	 * Prototype: uint32_t  maxComputeWorkGroupInvocations
	 */ 
	 private static native int maxComputeWorkGroupInvocations0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxComputeWorkGroupSize	[int_array]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupSize
	 */ 
	 private static native void maxComputeWorkGroupSize0(ByteBuffer ptr, int[] _maxComputeWorkGroupSize);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxComputeWorkGroupSize = (uint32_t[]) (_maxComputeWorkGroupSize);
	  */

	/**
	 * native GET method for field maxComputeWorkGroupSize	[int_array]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupSize
	 */ 
	 private static native int[] maxComputeWorkGroupSize0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (int[]) (_obj.uint32_t[]);
	 */

	/**
	 * native SET method for field subPixelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subPixelPrecisionBits
	 */ 
	 private static native void subPixelPrecisionBits0(ByteBuffer ptr, int _subPixelPrecisionBits);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.subPixelPrecisionBits = (uint32_t) (_subPixelPrecisionBits);
	  */

	/**
	 * native GET method for field subPixelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subPixelPrecisionBits
	 */ 
	 private static native int subPixelPrecisionBits0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field subTexelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subTexelPrecisionBits
	 */ 
	 private static native void subTexelPrecisionBits0(ByteBuffer ptr, int _subTexelPrecisionBits);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.subTexelPrecisionBits = (uint32_t) (_subTexelPrecisionBits);
	  */

	/**
	 * native GET method for field subTexelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subTexelPrecisionBits
	 */ 
	 private static native int subTexelPrecisionBits0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field mipmapPrecisionBits	[int]<br>
	 * Prototype: uint32_t  mipmapPrecisionBits
	 */ 
	 private static native void mipmapPrecisionBits0(ByteBuffer ptr, int _mipmapPrecisionBits);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.mipmapPrecisionBits = (uint32_t) (_mipmapPrecisionBits);
	  */

	/**
	 * native GET method for field mipmapPrecisionBits	[int]<br>
	 * Prototype: uint32_t  mipmapPrecisionBits
	 */ 
	 private static native int mipmapPrecisionBits0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxDrawIndexedIndexValue	[int]<br>
	 * Prototype: uint32_t  maxDrawIndexedIndexValue
	 */ 
	 private static native void maxDrawIndexedIndexValue0(ByteBuffer ptr, int _maxDrawIndexedIndexValue);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxDrawIndexedIndexValue = (uint32_t) (_maxDrawIndexedIndexValue);
	  */

	/**
	 * native GET method for field maxDrawIndexedIndexValue	[int]<br>
	 * Prototype: uint32_t  maxDrawIndexedIndexValue
	 */ 
	 private static native int maxDrawIndexedIndexValue0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxDrawIndirectCount	[int]<br>
	 * Prototype: uint32_t  maxDrawIndirectCount
	 */ 
	 private static native void maxDrawIndirectCount0(ByteBuffer ptr, int _maxDrawIndirectCount);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxDrawIndirectCount = (uint32_t) (_maxDrawIndirectCount);
	  */

	/**
	 * native GET method for field maxDrawIndirectCount	[int]<br>
	 * Prototype: uint32_t  maxDrawIndirectCount
	 */ 
	 private static native int maxDrawIndirectCount0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxSamplerLodBias	[float]<br>
	 * Prototype: float  maxSamplerLodBias
	 */ 
	 private static native void maxSamplerLodBias0(ByteBuffer ptr, float _maxSamplerLodBias);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxSamplerLodBias = (float) (_maxSamplerLodBias);
	  */

	/**
	 * native GET method for field maxSamplerLodBias	[float]<br>
	 * Prototype: float  maxSamplerLodBias
	 */ 
	 private static native float maxSamplerLodBias0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native SET method for field maxSamplerAnisotropy	[float]<br>
	 * Prototype: float  maxSamplerAnisotropy
	 */ 
	 private static native void maxSamplerAnisotropy0(ByteBuffer ptr, float _maxSamplerAnisotropy);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxSamplerAnisotropy = (float) (_maxSamplerAnisotropy);
	  */

	/**
	 * native GET method for field maxSamplerAnisotropy	[float]<br>
	 * Prototype: float  maxSamplerAnisotropy
	 */ 
	 private static native float maxSamplerAnisotropy0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native SET method for field maxViewports	[int]<br>
	 * Prototype: uint32_t  maxViewports
	 */ 
	 private static native void maxViewports0(ByteBuffer ptr, int _maxViewports);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxViewports = (uint32_t) (_maxViewports);
	  */

	/**
	 * native GET method for field maxViewports	[int]<br>
	 * Prototype: uint32_t  maxViewports
	 */ 
	 private static native int maxViewports0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxViewportDimensions	[int_array]<br>
	 * Prototype: uint32_t[]  maxViewportDimensions
	 */ 
	 private static native void maxViewportDimensions0(ByteBuffer ptr, int[] _maxViewportDimensions);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxViewportDimensions = (uint32_t[]) (_maxViewportDimensions);
	  */

	/**
	 * native GET method for field maxViewportDimensions	[int_array]<br>
	 * Prototype: uint32_t[]  maxViewportDimensions
	 */ 
	 private static native int[] maxViewportDimensions0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (int[]) (_obj.uint32_t[]);
	 */

	/**
	 * native SET method for field viewportBoundsRange	[float_array]<br>
	 * Prototype: float[]  viewportBoundsRange
	 */ 
	 private static native void viewportBoundsRange0(ByteBuffer ptr, float[] _viewportBoundsRange);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.viewportBoundsRange = (float[]) (_viewportBoundsRange);
	  */

	/**
	 * native GET method for field viewportBoundsRange	[float_array]<br>
	 * Prototype: float[]  viewportBoundsRange
	 */ 
	 private static native float[] viewportBoundsRange0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (float[]) (_obj.float[]);
	 */

	/**
	 * native SET method for field viewportSubPixelBits	[int]<br>
	 * Prototype: uint32_t  viewportSubPixelBits
	 */ 
	 private static native void viewportSubPixelBits0(ByteBuffer ptr, int _viewportSubPixelBits);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.viewportSubPixelBits = (uint32_t) (_viewportSubPixelBits);
	  */

	/**
	 * native GET method for field viewportSubPixelBits	[int]<br>
	 * Prototype: uint32_t  viewportSubPixelBits
	 */ 
	 private static native int viewportSubPixelBits0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field minMemoryMapAlignment	[long]<br>
	 * Prototype: size_t  minMemoryMapAlignment
	 */ 
	 private static native void minMemoryMapAlignment0(ByteBuffer ptr, long _minMemoryMapAlignment);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.minMemoryMapAlignment = (size_t) (_minMemoryMapAlignment);
	  */

	/**
	 * native GET method for field minMemoryMapAlignment	[long]<br>
	 * Prototype: size_t  minMemoryMapAlignment
	 */ 
	 private static native long minMemoryMapAlignment0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jlong) (_obj.size_t);
	 */

	/**
	 * native SET method for field minTexelBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minTexelBufferOffsetAlignment
	 */ 
	 private static native void minTexelBufferOffsetAlignment0(ByteBuffer ptr, long _minTexelBufferOffsetAlignment);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.minTexelBufferOffsetAlignment = (VkDeviceSize) (_minTexelBufferOffsetAlignment);
	  */

	/**
	 * native GET method for field minTexelBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minTexelBufferOffsetAlignment
	 */ 
	 private static native long minTexelBufferOffsetAlignment0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native SET method for field minUniformBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minUniformBufferOffsetAlignment
	 */ 
	 private static native void minUniformBufferOffsetAlignment0(ByteBuffer ptr, long _minUniformBufferOffsetAlignment);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.minUniformBufferOffsetAlignment = (VkDeviceSize) (_minUniformBufferOffsetAlignment);
	  */

	/**
	 * native GET method for field minUniformBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minUniformBufferOffsetAlignment
	 */ 
	 private static native long minUniformBufferOffsetAlignment0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native SET method for field minStorageBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minStorageBufferOffsetAlignment
	 */ 
	 private static native void minStorageBufferOffsetAlignment0(ByteBuffer ptr, long _minStorageBufferOffsetAlignment);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.minStorageBufferOffsetAlignment = (VkDeviceSize) (_minStorageBufferOffsetAlignment);
	  */

	/**
	 * native GET method for field minStorageBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minStorageBufferOffsetAlignment
	 */ 
	 private static native long minStorageBufferOffsetAlignment0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native SET method for field minTexelOffset	[int]<br>
	 * Prototype: int32_t  minTexelOffset
	 */ 
	 private static native void minTexelOffset0(ByteBuffer ptr, int _minTexelOffset);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.minTexelOffset = (int32_t) (_minTexelOffset);
	  */

	/**
	 * native GET method for field minTexelOffset	[int]<br>
	 * Prototype: int32_t  minTexelOffset
	 */ 
	 private static native int minTexelOffset0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.int32_t);
	 */

	/**
	 * native SET method for field maxTexelOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelOffset
	 */ 
	 private static native void maxTexelOffset0(ByteBuffer ptr, int _maxTexelOffset);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxTexelOffset = (uint32_t) (_maxTexelOffset);
	  */

	/**
	 * native GET method for field maxTexelOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelOffset
	 */ 
	 private static native int maxTexelOffset0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field minTexelGatherOffset	[int]<br>
	 * Prototype: int32_t  minTexelGatherOffset
	 */ 
	 private static native void minTexelGatherOffset0(ByteBuffer ptr, int _minTexelGatherOffset);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.minTexelGatherOffset = (int32_t) (_minTexelGatherOffset);
	  */

	/**
	 * native GET method for field minTexelGatherOffset	[int]<br>
	 * Prototype: int32_t  minTexelGatherOffset
	 */ 
	 private static native int minTexelGatherOffset0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.int32_t);
	 */

	/**
	 * native SET method for field maxTexelGatherOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelGatherOffset
	 */ 
	 private static native void maxTexelGatherOffset0(ByteBuffer ptr, int _maxTexelGatherOffset);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxTexelGatherOffset = (uint32_t) (_maxTexelGatherOffset);
	  */

	/**
	 * native GET method for field maxTexelGatherOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelGatherOffset
	 */ 
	 private static native int maxTexelGatherOffset0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field minInterpolationOffset	[float]<br>
	 * Prototype: float  minInterpolationOffset
	 */ 
	 private static native void minInterpolationOffset0(ByteBuffer ptr, float _minInterpolationOffset);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.minInterpolationOffset = (float) (_minInterpolationOffset);
	  */

	/**
	 * native GET method for field minInterpolationOffset	[float]<br>
	 * Prototype: float  minInterpolationOffset
	 */ 
	 private static native float minInterpolationOffset0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native SET method for field maxInterpolationOffset	[float]<br>
	 * Prototype: float  maxInterpolationOffset
	 */ 
	 private static native void maxInterpolationOffset0(ByteBuffer ptr, float _maxInterpolationOffset);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxInterpolationOffset = (float) (_maxInterpolationOffset);
	  */

	/**
	 * native GET method for field maxInterpolationOffset	[float]<br>
	 * Prototype: float  maxInterpolationOffset
	 */ 
	 private static native float maxInterpolationOffset0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native SET method for field subPixelInterpolationOffsetBits	[int]<br>
	 * Prototype: uint32_t  subPixelInterpolationOffsetBits
	 */ 
	 private static native void subPixelInterpolationOffsetBits0(ByteBuffer ptr, int _subPixelInterpolationOffsetBits);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.subPixelInterpolationOffsetBits = (uint32_t) (_subPixelInterpolationOffsetBits);
	  */

	/**
	 * native GET method for field subPixelInterpolationOffsetBits	[int]<br>
	 * Prototype: uint32_t  subPixelInterpolationOffsetBits
	 */ 
	 private static native int subPixelInterpolationOffsetBits0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxFramebufferWidth	[int]<br>
	 * Prototype: uint32_t  maxFramebufferWidth
	 */ 
	 private static native void maxFramebufferWidth0(ByteBuffer ptr, int _maxFramebufferWidth);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxFramebufferWidth = (uint32_t) (_maxFramebufferWidth);
	  */

	/**
	 * native GET method for field maxFramebufferWidth	[int]<br>
	 * Prototype: uint32_t  maxFramebufferWidth
	 */ 
	 private static native int maxFramebufferWidth0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxFramebufferHeight	[int]<br>
	 * Prototype: uint32_t  maxFramebufferHeight
	 */ 
	 private static native void maxFramebufferHeight0(ByteBuffer ptr, int _maxFramebufferHeight);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxFramebufferHeight = (uint32_t) (_maxFramebufferHeight);
	  */

	/**
	 * native GET method for field maxFramebufferHeight	[int]<br>
	 * Prototype: uint32_t  maxFramebufferHeight
	 */ 
	 private static native int maxFramebufferHeight0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxFramebufferLayers	[int]<br>
	 * Prototype: uint32_t  maxFramebufferLayers
	 */ 
	 private static native void maxFramebufferLayers0(ByteBuffer ptr, int _maxFramebufferLayers);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxFramebufferLayers = (uint32_t) (_maxFramebufferLayers);
	  */

	/**
	 * native GET method for field maxFramebufferLayers	[int]<br>
	 * Prototype: uint32_t  maxFramebufferLayers
	 */ 
	 private static native int maxFramebufferLayers0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field framebufferColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferColorSampleCounts
	 */ 
	 private static native void framebufferColorSampleCounts0(ByteBuffer ptr, int _framebufferColorSampleCounts);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.framebufferColorSampleCounts = (VkSampleCountFlags) (_framebufferColorSampleCounts);
	  */

	/**
	 * native GET method for field framebufferColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferColorSampleCounts
	 */ 
	 private static native int framebufferColorSampleCounts0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.VkSampleCountFlags);
	 */

	/**
	 * native SET method for field framebufferDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferDepthSampleCounts
	 */ 
	 private static native void framebufferDepthSampleCounts0(ByteBuffer ptr, int _framebufferDepthSampleCounts);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.framebufferDepthSampleCounts = (VkSampleCountFlags) (_framebufferDepthSampleCounts);
	  */

	/**
	 * native GET method for field framebufferDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferDepthSampleCounts
	 */ 
	 private static native int framebufferDepthSampleCounts0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.VkSampleCountFlags);
	 */

	/**
	 * native SET method for field framebufferStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferStencilSampleCounts
	 */ 
	 private static native void framebufferStencilSampleCounts0(ByteBuffer ptr, int _framebufferStencilSampleCounts);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.framebufferStencilSampleCounts = (VkSampleCountFlags) (_framebufferStencilSampleCounts);
	  */

	/**
	 * native GET method for field framebufferStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferStencilSampleCounts
	 */ 
	 private static native int framebufferStencilSampleCounts0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.VkSampleCountFlags);
	 */

	/**
	 * native SET method for field framebufferNoAttachmentsSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferNoAttachmentsSampleCounts
	 */ 
	 private static native void framebufferNoAttachmentsSampleCounts0(ByteBuffer ptr, int _framebufferNoAttachmentsSampleCounts);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.framebufferNoAttachmentsSampleCounts = (VkSampleCountFlags) (_framebufferNoAttachmentsSampleCounts);
	  */

	/**
	 * native GET method for field framebufferNoAttachmentsSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferNoAttachmentsSampleCounts
	 */ 
	 private static native int framebufferNoAttachmentsSampleCounts0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.VkSampleCountFlags);
	 */

	/**
	 * native SET method for field maxColorAttachments	[int]<br>
	 * Prototype: uint32_t  maxColorAttachments
	 */ 
	 private static native void maxColorAttachments0(ByteBuffer ptr, int _maxColorAttachments);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxColorAttachments = (uint32_t) (_maxColorAttachments);
	  */

	/**
	 * native GET method for field maxColorAttachments	[int]<br>
	 * Prototype: uint32_t  maxColorAttachments
	 */ 
	 private static native int maxColorAttachments0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field sampledImageColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageColorSampleCounts
	 */ 
	 private static native void sampledImageColorSampleCounts0(ByteBuffer ptr, int _sampledImageColorSampleCounts);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.sampledImageColorSampleCounts = (VkSampleCountFlags) (_sampledImageColorSampleCounts);
	  */

	/**
	 * native GET method for field sampledImageColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageColorSampleCounts
	 */ 
	 private static native int sampledImageColorSampleCounts0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.VkSampleCountFlags);
	 */

	/**
	 * native SET method for field sampledImageIntegerSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageIntegerSampleCounts
	 */ 
	 private static native void sampledImageIntegerSampleCounts0(ByteBuffer ptr, int _sampledImageIntegerSampleCounts);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.sampledImageIntegerSampleCounts = (VkSampleCountFlags) (_sampledImageIntegerSampleCounts);
	  */

	/**
	 * native GET method for field sampledImageIntegerSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageIntegerSampleCounts
	 */ 
	 private static native int sampledImageIntegerSampleCounts0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.VkSampleCountFlags);
	 */

	/**
	 * native SET method for field sampledImageDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageDepthSampleCounts
	 */ 
	 private static native void sampledImageDepthSampleCounts0(ByteBuffer ptr, int _sampledImageDepthSampleCounts);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.sampledImageDepthSampleCounts = (VkSampleCountFlags) (_sampledImageDepthSampleCounts);
	  */

	/**
	 * native GET method for field sampledImageDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageDepthSampleCounts
	 */ 
	 private static native int sampledImageDepthSampleCounts0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.VkSampleCountFlags);
	 */

	/**
	 * native SET method for field sampledImageStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageStencilSampleCounts
	 */ 
	 private static native void sampledImageStencilSampleCounts0(ByteBuffer ptr, int _sampledImageStencilSampleCounts);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.sampledImageStencilSampleCounts = (VkSampleCountFlags) (_sampledImageStencilSampleCounts);
	  */

	/**
	 * native GET method for field sampledImageStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageStencilSampleCounts
	 */ 
	 private static native int sampledImageStencilSampleCounts0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.VkSampleCountFlags);
	 */

	/**
	 * native SET method for field storageImageSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  storageImageSampleCounts
	 */ 
	 private static native void storageImageSampleCounts0(ByteBuffer ptr, int _storageImageSampleCounts);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.storageImageSampleCounts = (VkSampleCountFlags) (_storageImageSampleCounts);
	  */

	/**
	 * native GET method for field storageImageSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  storageImageSampleCounts
	 */ 
	 private static native int storageImageSampleCounts0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.VkSampleCountFlags);
	 */

	/**
	 * native SET method for field maxSampleMaskWords	[int]<br>
	 * Prototype: uint32_t  maxSampleMaskWords
	 */ 
	 private static native void maxSampleMaskWords0(ByteBuffer ptr, int _maxSampleMaskWords);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxSampleMaskWords = (uint32_t) (_maxSampleMaskWords);
	  */

	/**
	 * native GET method for field maxSampleMaskWords	[int]<br>
	 * Prototype: uint32_t  maxSampleMaskWords
	 */ 
	 private static native int maxSampleMaskWords0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field timestampComputeAndGraphics	[boolean]<br>
	 * Prototype: VkBool32  timestampComputeAndGraphics
	 */ 
	 private static native void timestampComputeAndGraphics0(ByteBuffer ptr, boolean _timestampComputeAndGraphics);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.timestampComputeAndGraphics = (VkBool32) (_timestampComputeAndGraphics);
	  */

	/**
	 * native GET method for field timestampComputeAndGraphics	[boolean]<br>
	 * Prototype: VkBool32  timestampComputeAndGraphics
	 */ 
	 private static native boolean timestampComputeAndGraphics0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field timestampPeriod	[float]<br>
	 * Prototype: float  timestampPeriod
	 */ 
	 private static native void timestampPeriod0(ByteBuffer ptr, float _timestampPeriod);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.timestampPeriod = (float) (_timestampPeriod);
	  */

	/**
	 * native GET method for field timestampPeriod	[float]<br>
	 * Prototype: float  timestampPeriod
	 */ 
	 private static native float timestampPeriod0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native SET method for field maxClipDistances	[int]<br>
	 * Prototype: uint32_t  maxClipDistances
	 */ 
	 private static native void maxClipDistances0(ByteBuffer ptr, int _maxClipDistances);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxClipDistances = (uint32_t) (_maxClipDistances);
	  */

	/**
	 * native GET method for field maxClipDistances	[int]<br>
	 * Prototype: uint32_t  maxClipDistances
	 */ 
	 private static native int maxClipDistances0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCullDistances
	 */ 
	 private static native void maxCullDistances0(ByteBuffer ptr, int _maxCullDistances);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxCullDistances = (uint32_t) (_maxCullDistances);
	  */

	/**
	 * native GET method for field maxCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCullDistances
	 */ 
	 private static native int maxCullDistances0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxCombinedClipAndCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCombinedClipAndCullDistances
	 */ 
	 private static native void maxCombinedClipAndCullDistances0(ByteBuffer ptr, int _maxCombinedClipAndCullDistances);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.maxCombinedClipAndCullDistances = (uint32_t) (_maxCombinedClipAndCullDistances);
	  */

	/**
	 * native GET method for field maxCombinedClipAndCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCombinedClipAndCullDistances
	 */ 
	 private static native int maxCombinedClipAndCullDistances0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field discreteQueuePriorities	[int]<br>
	 * Prototype: uint32_t  discreteQueuePriorities
	 */ 
	 private static native void discreteQueuePriorities0(ByteBuffer ptr, int _discreteQueuePriorities);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.discreteQueuePriorities = (uint32_t) (_discreteQueuePriorities);
	  */

	/**
	 * native GET method for field discreteQueuePriorities	[int]<br>
	 * Prototype: uint32_t  discreteQueuePriorities
	 */ 
	 private static native int discreteQueuePriorities0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field pointSizeRange	[float_array]<br>
	 * Prototype: float[]  pointSizeRange
	 */ 
	 private static native void pointSizeRange0(ByteBuffer ptr, float[] _pointSizeRange);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.pointSizeRange = (float[]) (_pointSizeRange);
	  */

	/**
	 * native GET method for field pointSizeRange	[float_array]<br>
	 * Prototype: float[]  pointSizeRange
	 */ 
	 private static native float[] pointSizeRange0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (float[]) (_obj.float[]);
	 */

	/**
	 * native SET method for field lineWidthRange	[float_array]<br>
	 * Prototype: float[]  lineWidthRange
	 */ 
	 private static native void lineWidthRange0(ByteBuffer ptr, float[] _lineWidthRange);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.lineWidthRange = (float[]) (_lineWidthRange);
	  */

	/**
	 * native GET method for field lineWidthRange	[float_array]<br>
	 * Prototype: float[]  lineWidthRange
	 */ 
	 private static native float[] lineWidthRange0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (float[]) (_obj.float[]);
	 */

	/**
	 * native SET method for field pointSizeGranularity	[float]<br>
	 * Prototype: float  pointSizeGranularity
	 */ 
	 private static native void pointSizeGranularity0(ByteBuffer ptr, float _pointSizeGranularity);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.pointSizeGranularity = (float) (_pointSizeGranularity);
	  */

	/**
	 * native GET method for field pointSizeGranularity	[float]<br>
	 * Prototype: float  pointSizeGranularity
	 */ 
	 private static native float pointSizeGranularity0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native SET method for field lineWidthGranularity	[float]<br>
	 * Prototype: float  lineWidthGranularity
	 */ 
	 private static native void lineWidthGranularity0(ByteBuffer ptr, float _lineWidthGranularity);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.lineWidthGranularity = (float) (_lineWidthGranularity);
	  */

	/**
	 * native GET method for field lineWidthGranularity	[float]<br>
	 * Prototype: float  lineWidthGranularity
	 */ 
	 private static native float lineWidthGranularity0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native SET method for field strictLines	[boolean]<br>
	 * Prototype: VkBool32  strictLines
	 */ 
	 private static native void strictLines0(ByteBuffer ptr, boolean _strictLines);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.strictLines = (VkBool32) (_strictLines);
	  */

	/**
	 * native GET method for field strictLines	[boolean]<br>
	 * Prototype: VkBool32  strictLines
	 */ 
	 private static native boolean strictLines0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field standardSampleLocations	[boolean]<br>
	 * Prototype: VkBool32  standardSampleLocations
	 */ 
	 private static native void standardSampleLocations0(ByteBuffer ptr, boolean _standardSampleLocations);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.standardSampleLocations = (VkBool32) (_standardSampleLocations);
	  */

	/**
	 * native GET method for field standardSampleLocations	[boolean]<br>
	 * Prototype: VkBool32  standardSampleLocations
	 */ 
	 private static native boolean standardSampleLocations0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field optimalBufferCopyOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyOffsetAlignment
	 */ 
	 private static native void optimalBufferCopyOffsetAlignment0(ByteBuffer ptr, long _optimalBufferCopyOffsetAlignment);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.optimalBufferCopyOffsetAlignment = (VkDeviceSize) (_optimalBufferCopyOffsetAlignment);
	  */

	/**
	 * native GET method for field optimalBufferCopyOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyOffsetAlignment
	 */ 
	 private static native long optimalBufferCopyOffsetAlignment0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native SET method for field optimalBufferCopyRowPitchAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyRowPitchAlignment
	 */ 
	 private static native void optimalBufferCopyRowPitchAlignment0(ByteBuffer ptr, long _optimalBufferCopyRowPitchAlignment);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.optimalBufferCopyRowPitchAlignment = (VkDeviceSize) (_optimalBufferCopyRowPitchAlignment);
	  */

	/**
	 * native GET method for field optimalBufferCopyRowPitchAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyRowPitchAlignment
	 */ 
	 private static native long optimalBufferCopyRowPitchAlignment0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native SET method for field nonCoherentAtomSize	[long]<br>
	 * Prototype: VkDeviceSize  nonCoherentAtomSize
	 */ 
	 private static native void nonCoherentAtomSize0(ByteBuffer ptr, long _nonCoherentAtomSize);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(*ptr);
		  _obj.nonCoherentAtomSize = (VkDeviceSize) (_nonCoherentAtomSize);
	  */

	/**
	 * native GET method for field nonCoherentAtomSize	[long]<br>
	 * Prototype: VkDeviceSize  nonCoherentAtomSize
	 */ 
	 private static native long nonCoherentAtomSize0(ByteBuffer ptr);/*
		  VkPhysicalDeviceLimits _obj = (VkPhysicalDeviceLimits)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */



} // end of class VkPhysicalDeviceLimits
