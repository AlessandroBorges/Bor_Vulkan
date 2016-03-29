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

import java.nio.Buffer;


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
		 maxImageDimension1D0(this.ptr,  maxImageDimension1D);
	 }

	/**
	 * Get method for field maxImageDimension1D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension1D
	 */ 
	 public int maxImageDimension1D(){
		 int var = maxImageDimension1D0(super.ptr);
		 this.maxImageDimension1D = var;
		 return this.maxImageDimension1D;
	 }

	/**
	 * Set method for field maxImageDimension2D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension2D
	 */ 
	 public void maxImageDimension2D(int maxImageDimension2D){
		 this.maxImageDimension2D = maxImageDimension2D;
		 maxImageDimension2D0(this.ptr,  maxImageDimension2D);
	 }

	/**
	 * Get method for field maxImageDimension2D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension2D
	 */ 
	 public int maxImageDimension2D(){
		 int var = maxImageDimension2D0(super.ptr);
		 this.maxImageDimension2D = var;
		 return this.maxImageDimension2D;
	 }

	/**
	 * Set method for field maxImageDimension3D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension3D
	 */ 
	 public void maxImageDimension3D(int maxImageDimension3D){
		 this.maxImageDimension3D = maxImageDimension3D;
		 maxImageDimension3D0(this.ptr,  maxImageDimension3D);
	 }

	/**
	 * Get method for field maxImageDimension3D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension3D
	 */ 
	 public int maxImageDimension3D(){
		 int var = maxImageDimension3D0(super.ptr);
		 this.maxImageDimension3D = var;
		 return this.maxImageDimension3D;
	 }

	/**
	 * Set method for field maxImageDimensionCube	[int]<br>
	 * Prototype: uint32_t  maxImageDimensionCube
	 */ 
	 public void maxImageDimensionCube(int maxImageDimensionCube){
		 this.maxImageDimensionCube = maxImageDimensionCube;
		 maxImageDimensionCube0(this.ptr,  maxImageDimensionCube);
	 }

	/**
	 * Get method for field maxImageDimensionCube	[int]<br>
	 * Prototype: uint32_t  maxImageDimensionCube
	 */ 
	 public int maxImageDimensionCube(){
		 int var = maxImageDimensionCube0(super.ptr);
		 this.maxImageDimensionCube = var;
		 return this.maxImageDimensionCube;
	 }

	/**
	 * Set method for field maxImageArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxImageArrayLayers
	 */ 
	 public void maxImageArrayLayers(int maxImageArrayLayers){
		 this.maxImageArrayLayers = maxImageArrayLayers;
		 maxImageArrayLayers0(this.ptr,  maxImageArrayLayers);
	 }

	/**
	 * Get method for field maxImageArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxImageArrayLayers
	 */ 
	 public int maxImageArrayLayers(){
		 int var = maxImageArrayLayers0(super.ptr);
		 this.maxImageArrayLayers = var;
		 return this.maxImageArrayLayers;
	 }

	/**
	 * Set method for field maxTexelBufferElements	[int]<br>
	 * Prototype: uint32_t  maxTexelBufferElements
	 */ 
	 public void maxTexelBufferElements(int maxTexelBufferElements){
		 this.maxTexelBufferElements = maxTexelBufferElements;
		 maxTexelBufferElements0(this.ptr,  maxTexelBufferElements);
	 }

	/**
	 * Get method for field maxTexelBufferElements	[int]<br>
	 * Prototype: uint32_t  maxTexelBufferElements
	 */ 
	 public int maxTexelBufferElements(){
		 int var = maxTexelBufferElements0(super.ptr);
		 this.maxTexelBufferElements = var;
		 return this.maxTexelBufferElements;
	 }

	/**
	 * Set method for field maxUniformBufferRange	[int]<br>
	 * Prototype: uint32_t  maxUniformBufferRange
	 */ 
	 public void maxUniformBufferRange(int maxUniformBufferRange){
		 this.maxUniformBufferRange = maxUniformBufferRange;
		 maxUniformBufferRange0(this.ptr,  maxUniformBufferRange);
	 }

	/**
	 * Get method for field maxUniformBufferRange	[int]<br>
	 * Prototype: uint32_t  maxUniformBufferRange
	 */ 
	 public int maxUniformBufferRange(){
		 int var = maxUniformBufferRange0(super.ptr);
		 this.maxUniformBufferRange = var;
		 return this.maxUniformBufferRange;
	 }

	/**
	 * Set method for field maxStorageBufferRange	[int]<br>
	 * Prototype: uint32_t  maxStorageBufferRange
	 */ 
	 public void maxStorageBufferRange(int maxStorageBufferRange){
		 this.maxStorageBufferRange = maxStorageBufferRange;
		 maxStorageBufferRange0(this.ptr,  maxStorageBufferRange);
	 }

	/**
	 * Get method for field maxStorageBufferRange	[int]<br>
	 * Prototype: uint32_t  maxStorageBufferRange
	 */ 
	 public int maxStorageBufferRange(){
		 int var = maxStorageBufferRange0(super.ptr);
		 this.maxStorageBufferRange = var;
		 return this.maxStorageBufferRange;
	 }

	/**
	 * Set method for field maxPushConstantsSize	[int]<br>
	 * Prototype: uint32_t  maxPushConstantsSize
	 */ 
	 public void maxPushConstantsSize(int maxPushConstantsSize){
		 this.maxPushConstantsSize = maxPushConstantsSize;
		 maxPushConstantsSize0(this.ptr,  maxPushConstantsSize);
	 }

	/**
	 * Get method for field maxPushConstantsSize	[int]<br>
	 * Prototype: uint32_t  maxPushConstantsSize
	 */ 
	 public int maxPushConstantsSize(){
		 int var = maxPushConstantsSize0(super.ptr);
		 this.maxPushConstantsSize = var;
		 return this.maxPushConstantsSize;
	 }

	/**
	 * Set method for field maxMemoryAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxMemoryAllocationCount
	 */ 
	 public void maxMemoryAllocationCount(int maxMemoryAllocationCount){
		 this.maxMemoryAllocationCount = maxMemoryAllocationCount;
		 maxMemoryAllocationCount0(this.ptr,  maxMemoryAllocationCount);
	 }

	/**
	 * Get method for field maxMemoryAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxMemoryAllocationCount
	 */ 
	 public int maxMemoryAllocationCount(){
		 int var = maxMemoryAllocationCount0(super.ptr);
		 this.maxMemoryAllocationCount = var;
		 return this.maxMemoryAllocationCount;
	 }

	/**
	 * Set method for field maxSamplerAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxSamplerAllocationCount
	 */ 
	 public void maxSamplerAllocationCount(int maxSamplerAllocationCount){
		 this.maxSamplerAllocationCount = maxSamplerAllocationCount;
		 maxSamplerAllocationCount0(this.ptr,  maxSamplerAllocationCount);
	 }

	/**
	 * Get method for field maxSamplerAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxSamplerAllocationCount
	 */ 
	 public int maxSamplerAllocationCount(){
		 int var = maxSamplerAllocationCount0(super.ptr);
		 this.maxSamplerAllocationCount = var;
		 return this.maxSamplerAllocationCount;
	 }

	/**
	 * Set method for field bufferImageGranularity	[long]<br>
	 * Prototype: VkDeviceSize  bufferImageGranularity
	 */ 
	 public void bufferImageGranularity(long bufferImageGranularity){
		 this.bufferImageGranularity = bufferImageGranularity;
		 bufferImageGranularity0(this.ptr,  bufferImageGranularity);
	 }

	/**
	 * Get method for field bufferImageGranularity	[long]<br>
	 * Prototype: VkDeviceSize  bufferImageGranularity
	 */ 
	 public long bufferImageGranularity(){
		 long var = bufferImageGranularity0(super.ptr);
		 this.bufferImageGranularity = var;
		 return this.bufferImageGranularity;
	 }

	/**
	 * Set method for field sparseAddressSpaceSize	[long]<br>
	 * Prototype: VkDeviceSize  sparseAddressSpaceSize
	 */ 
	 public void sparseAddressSpaceSize(long sparseAddressSpaceSize){
		 this.sparseAddressSpaceSize = sparseAddressSpaceSize;
		 sparseAddressSpaceSize0(this.ptr,  sparseAddressSpaceSize);
	 }

	/**
	 * Get method for field sparseAddressSpaceSize	[long]<br>
	 * Prototype: VkDeviceSize  sparseAddressSpaceSize
	 */ 
	 public long sparseAddressSpaceSize(){
		 long var = sparseAddressSpaceSize0(super.ptr);
		 this.sparseAddressSpaceSize = var;
		 return this.sparseAddressSpaceSize;
	 }

	/**
	 * Set method for field maxBoundDescriptorSets	[int]<br>
	 * Prototype: uint32_t  maxBoundDescriptorSets
	 */ 
	 public void maxBoundDescriptorSets(int maxBoundDescriptorSets){
		 this.maxBoundDescriptorSets = maxBoundDescriptorSets;
		 maxBoundDescriptorSets0(this.ptr,  maxBoundDescriptorSets);
	 }

	/**
	 * Get method for field maxBoundDescriptorSets	[int]<br>
	 * Prototype: uint32_t  maxBoundDescriptorSets
	 */ 
	 public int maxBoundDescriptorSets(){
		 int var = maxBoundDescriptorSets0(super.ptr);
		 this.maxBoundDescriptorSets = var;
		 return this.maxBoundDescriptorSets;
	 }

	/**
	 * Set method for field maxPerStageDescriptorSamplers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSamplers
	 */ 
	 public void maxPerStageDescriptorSamplers(int maxPerStageDescriptorSamplers){
		 this.maxPerStageDescriptorSamplers = maxPerStageDescriptorSamplers;
		 maxPerStageDescriptorSamplers0(this.ptr,  maxPerStageDescriptorSamplers);
	 }

	/**
	 * Get method for field maxPerStageDescriptorSamplers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSamplers
	 */ 
	 public int maxPerStageDescriptorSamplers(){
		 int var = maxPerStageDescriptorSamplers0(super.ptr);
		 this.maxPerStageDescriptorSamplers = var;
		 return this.maxPerStageDescriptorSamplers;
	 }

	/**
	 * Set method for field maxPerStageDescriptorUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorUniformBuffers
	 */ 
	 public void maxPerStageDescriptorUniformBuffers(int maxPerStageDescriptorUniformBuffers){
		 this.maxPerStageDescriptorUniformBuffers = maxPerStageDescriptorUniformBuffers;
		 maxPerStageDescriptorUniformBuffers0(this.ptr,  maxPerStageDescriptorUniformBuffers);
	 }

	/**
	 * Get method for field maxPerStageDescriptorUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorUniformBuffers
	 */ 
	 public int maxPerStageDescriptorUniformBuffers(){
		 int var = maxPerStageDescriptorUniformBuffers0(super.ptr);
		 this.maxPerStageDescriptorUniformBuffers = var;
		 return this.maxPerStageDescriptorUniformBuffers;
	 }

	/**
	 * Set method for field maxPerStageDescriptorStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageBuffers
	 */ 
	 public void maxPerStageDescriptorStorageBuffers(int maxPerStageDescriptorStorageBuffers){
		 this.maxPerStageDescriptorStorageBuffers = maxPerStageDescriptorStorageBuffers;
		 maxPerStageDescriptorStorageBuffers0(this.ptr,  maxPerStageDescriptorStorageBuffers);
	 }

	/**
	 * Get method for field maxPerStageDescriptorStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageBuffers
	 */ 
	 public int maxPerStageDescriptorStorageBuffers(){
		 int var = maxPerStageDescriptorStorageBuffers0(super.ptr);
		 this.maxPerStageDescriptorStorageBuffers = var;
		 return this.maxPerStageDescriptorStorageBuffers;
	 }

	/**
	 * Set method for field maxPerStageDescriptorSampledImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSampledImages
	 */ 
	 public void maxPerStageDescriptorSampledImages(int maxPerStageDescriptorSampledImages){
		 this.maxPerStageDescriptorSampledImages = maxPerStageDescriptorSampledImages;
		 maxPerStageDescriptorSampledImages0(this.ptr,  maxPerStageDescriptorSampledImages);
	 }

	/**
	 * Get method for field maxPerStageDescriptorSampledImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSampledImages
	 */ 
	 public int maxPerStageDescriptorSampledImages(){
		 int var = maxPerStageDescriptorSampledImages0(super.ptr);
		 this.maxPerStageDescriptorSampledImages = var;
		 return this.maxPerStageDescriptorSampledImages;
	 }

	/**
	 * Set method for field maxPerStageDescriptorStorageImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageImages
	 */ 
	 public void maxPerStageDescriptorStorageImages(int maxPerStageDescriptorStorageImages){
		 this.maxPerStageDescriptorStorageImages = maxPerStageDescriptorStorageImages;
		 maxPerStageDescriptorStorageImages0(this.ptr,  maxPerStageDescriptorStorageImages);
	 }

	/**
	 * Get method for field maxPerStageDescriptorStorageImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageImages
	 */ 
	 public int maxPerStageDescriptorStorageImages(){
		 int var = maxPerStageDescriptorStorageImages0(super.ptr);
		 this.maxPerStageDescriptorStorageImages = var;
		 return this.maxPerStageDescriptorStorageImages;
	 }

	/**
	 * Set method for field maxPerStageDescriptorInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorInputAttachments
	 */ 
	 public void maxPerStageDescriptorInputAttachments(int maxPerStageDescriptorInputAttachments){
		 this.maxPerStageDescriptorInputAttachments = maxPerStageDescriptorInputAttachments;
		 maxPerStageDescriptorInputAttachments0(this.ptr,  maxPerStageDescriptorInputAttachments);
	 }

	/**
	 * Get method for field maxPerStageDescriptorInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorInputAttachments
	 */ 
	 public int maxPerStageDescriptorInputAttachments(){
		 int var = maxPerStageDescriptorInputAttachments0(super.ptr);
		 this.maxPerStageDescriptorInputAttachments = var;
		 return this.maxPerStageDescriptorInputAttachments;
	 }

	/**
	 * Set method for field maxPerStageResources	[int]<br>
	 * Prototype: uint32_t  maxPerStageResources
	 */ 
	 public void maxPerStageResources(int maxPerStageResources){
		 this.maxPerStageResources = maxPerStageResources;
		 maxPerStageResources0(this.ptr,  maxPerStageResources);
	 }

	/**
	 * Get method for field maxPerStageResources	[int]<br>
	 * Prototype: uint32_t  maxPerStageResources
	 */ 
	 public int maxPerStageResources(){
		 int var = maxPerStageResources0(super.ptr);
		 this.maxPerStageResources = var;
		 return this.maxPerStageResources;
	 }

	/**
	 * Set method for field maxDescriptorSetSamplers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSamplers
	 */ 
	 public void maxDescriptorSetSamplers(int maxDescriptorSetSamplers){
		 this.maxDescriptorSetSamplers = maxDescriptorSetSamplers;
		 maxDescriptorSetSamplers0(this.ptr,  maxDescriptorSetSamplers);
	 }

	/**
	 * Get method for field maxDescriptorSetSamplers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSamplers
	 */ 
	 public int maxDescriptorSetSamplers(){
		 int var = maxDescriptorSetSamplers0(super.ptr);
		 this.maxDescriptorSetSamplers = var;
		 return this.maxDescriptorSetSamplers;
	 }

	/**
	 * Set method for field maxDescriptorSetUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffers
	 */ 
	 public void maxDescriptorSetUniformBuffers(int maxDescriptorSetUniformBuffers){
		 this.maxDescriptorSetUniformBuffers = maxDescriptorSetUniformBuffers;
		 maxDescriptorSetUniformBuffers0(this.ptr,  maxDescriptorSetUniformBuffers);
	 }

	/**
	 * Get method for field maxDescriptorSetUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffers
	 */ 
	 public int maxDescriptorSetUniformBuffers(){
		 int var = maxDescriptorSetUniformBuffers0(super.ptr);
		 this.maxDescriptorSetUniformBuffers = var;
		 return this.maxDescriptorSetUniformBuffers;
	 }

	/**
	 * Set method for field maxDescriptorSetUniformBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffersDynamic
	 */ 
	 public void maxDescriptorSetUniformBuffersDynamic(int maxDescriptorSetUniformBuffersDynamic){
		 this.maxDescriptorSetUniformBuffersDynamic = maxDescriptorSetUniformBuffersDynamic;
		 maxDescriptorSetUniformBuffersDynamic0(this.ptr,  maxDescriptorSetUniformBuffersDynamic);
	 }

	/**
	 * Get method for field maxDescriptorSetUniformBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffersDynamic
	 */ 
	 public int maxDescriptorSetUniformBuffersDynamic(){
		 int var = maxDescriptorSetUniformBuffersDynamic0(super.ptr);
		 this.maxDescriptorSetUniformBuffersDynamic = var;
		 return this.maxDescriptorSetUniformBuffersDynamic;
	 }

	/**
	 * Set method for field maxDescriptorSetStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffers
	 */ 
	 public void maxDescriptorSetStorageBuffers(int maxDescriptorSetStorageBuffers){
		 this.maxDescriptorSetStorageBuffers = maxDescriptorSetStorageBuffers;
		 maxDescriptorSetStorageBuffers0(this.ptr,  maxDescriptorSetStorageBuffers);
	 }

	/**
	 * Get method for field maxDescriptorSetStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffers
	 */ 
	 public int maxDescriptorSetStorageBuffers(){
		 int var = maxDescriptorSetStorageBuffers0(super.ptr);
		 this.maxDescriptorSetStorageBuffers = var;
		 return this.maxDescriptorSetStorageBuffers;
	 }

	/**
	 * Set method for field maxDescriptorSetStorageBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffersDynamic
	 */ 
	 public void maxDescriptorSetStorageBuffersDynamic(int maxDescriptorSetStorageBuffersDynamic){
		 this.maxDescriptorSetStorageBuffersDynamic = maxDescriptorSetStorageBuffersDynamic;
		 maxDescriptorSetStorageBuffersDynamic0(this.ptr,  maxDescriptorSetStorageBuffersDynamic);
	 }

	/**
	 * Get method for field maxDescriptorSetStorageBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffersDynamic
	 */ 
	 public int maxDescriptorSetStorageBuffersDynamic(){
		 int var = maxDescriptorSetStorageBuffersDynamic0(super.ptr);
		 this.maxDescriptorSetStorageBuffersDynamic = var;
		 return this.maxDescriptorSetStorageBuffersDynamic;
	 }

	/**
	 * Set method for field maxDescriptorSetSampledImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSampledImages
	 */ 
	 public void maxDescriptorSetSampledImages(int maxDescriptorSetSampledImages){
		 this.maxDescriptorSetSampledImages = maxDescriptorSetSampledImages;
		 maxDescriptorSetSampledImages0(this.ptr,  maxDescriptorSetSampledImages);
	 }

	/**
	 * Get method for field maxDescriptorSetSampledImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSampledImages
	 */ 
	 public int maxDescriptorSetSampledImages(){
		 int var = maxDescriptorSetSampledImages0(super.ptr);
		 this.maxDescriptorSetSampledImages = var;
		 return this.maxDescriptorSetSampledImages;
	 }

	/**
	 * Set method for field maxDescriptorSetStorageImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageImages
	 */ 
	 public void maxDescriptorSetStorageImages(int maxDescriptorSetStorageImages){
		 this.maxDescriptorSetStorageImages = maxDescriptorSetStorageImages;
		 maxDescriptorSetStorageImages0(this.ptr,  maxDescriptorSetStorageImages);
	 }

	/**
	 * Get method for field maxDescriptorSetStorageImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageImages
	 */ 
	 public int maxDescriptorSetStorageImages(){
		 int var = maxDescriptorSetStorageImages0(super.ptr);
		 this.maxDescriptorSetStorageImages = var;
		 return this.maxDescriptorSetStorageImages;
	 }

	/**
	 * Set method for field maxDescriptorSetInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetInputAttachments
	 */ 
	 public void maxDescriptorSetInputAttachments(int maxDescriptorSetInputAttachments){
		 this.maxDescriptorSetInputAttachments = maxDescriptorSetInputAttachments;
		 maxDescriptorSetInputAttachments0(this.ptr,  maxDescriptorSetInputAttachments);
	 }

	/**
	 * Get method for field maxDescriptorSetInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetInputAttachments
	 */ 
	 public int maxDescriptorSetInputAttachments(){
		 int var = maxDescriptorSetInputAttachments0(super.ptr);
		 this.maxDescriptorSetInputAttachments = var;
		 return this.maxDescriptorSetInputAttachments;
	 }

	/**
	 * Set method for field maxVertexInputAttributes	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributes
	 */ 
	 public void maxVertexInputAttributes(int maxVertexInputAttributes){
		 this.maxVertexInputAttributes = maxVertexInputAttributes;
		 maxVertexInputAttributes0(this.ptr,  maxVertexInputAttributes);
	 }

	/**
	 * Get method for field maxVertexInputAttributes	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributes
	 */ 
	 public int maxVertexInputAttributes(){
		 int var = maxVertexInputAttributes0(super.ptr);
		 this.maxVertexInputAttributes = var;
		 return this.maxVertexInputAttributes;
	 }

	/**
	 * Set method for field maxVertexInputBindings	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindings
	 */ 
	 public void maxVertexInputBindings(int maxVertexInputBindings){
		 this.maxVertexInputBindings = maxVertexInputBindings;
		 maxVertexInputBindings0(this.ptr,  maxVertexInputBindings);
	 }

	/**
	 * Get method for field maxVertexInputBindings	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindings
	 */ 
	 public int maxVertexInputBindings(){
		 int var = maxVertexInputBindings0(super.ptr);
		 this.maxVertexInputBindings = var;
		 return this.maxVertexInputBindings;
	 }

	/**
	 * Set method for field maxVertexInputAttributeOffset	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributeOffset
	 */ 
	 public void maxVertexInputAttributeOffset(int maxVertexInputAttributeOffset){
		 this.maxVertexInputAttributeOffset = maxVertexInputAttributeOffset;
		 maxVertexInputAttributeOffset0(this.ptr,  maxVertexInputAttributeOffset);
	 }

	/**
	 * Get method for field maxVertexInputAttributeOffset	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributeOffset
	 */ 
	 public int maxVertexInputAttributeOffset(){
		 int var = maxVertexInputAttributeOffset0(super.ptr);
		 this.maxVertexInputAttributeOffset = var;
		 return this.maxVertexInputAttributeOffset;
	 }

	/**
	 * Set method for field maxVertexInputBindingStride	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindingStride
	 */ 
	 public void maxVertexInputBindingStride(int maxVertexInputBindingStride){
		 this.maxVertexInputBindingStride = maxVertexInputBindingStride;
		 maxVertexInputBindingStride0(this.ptr,  maxVertexInputBindingStride);
	 }

	/**
	 * Get method for field maxVertexInputBindingStride	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindingStride
	 */ 
	 public int maxVertexInputBindingStride(){
		 int var = maxVertexInputBindingStride0(super.ptr);
		 this.maxVertexInputBindingStride = var;
		 return this.maxVertexInputBindingStride;
	 }

	/**
	 * Set method for field maxVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxVertexOutputComponents
	 */ 
	 public void maxVertexOutputComponents(int maxVertexOutputComponents){
		 this.maxVertexOutputComponents = maxVertexOutputComponents;
		 maxVertexOutputComponents0(this.ptr,  maxVertexOutputComponents);
	 }

	/**
	 * Get method for field maxVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxVertexOutputComponents
	 */ 
	 public int maxVertexOutputComponents(){
		 int var = maxVertexOutputComponents0(super.ptr);
		 this.maxVertexOutputComponents = var;
		 return this.maxVertexOutputComponents;
	 }

	/**
	 * Set method for field maxTessellationGenerationLevel	[int]<br>
	 * Prototype: uint32_t  maxTessellationGenerationLevel
	 */ 
	 public void maxTessellationGenerationLevel(int maxTessellationGenerationLevel){
		 this.maxTessellationGenerationLevel = maxTessellationGenerationLevel;
		 maxTessellationGenerationLevel0(this.ptr,  maxTessellationGenerationLevel);
	 }

	/**
	 * Get method for field maxTessellationGenerationLevel	[int]<br>
	 * Prototype: uint32_t  maxTessellationGenerationLevel
	 */ 
	 public int maxTessellationGenerationLevel(){
		 int var = maxTessellationGenerationLevel0(super.ptr);
		 this.maxTessellationGenerationLevel = var;
		 return this.maxTessellationGenerationLevel;
	 }

	/**
	 * Set method for field maxTessellationPatchSize	[int]<br>
	 * Prototype: uint32_t  maxTessellationPatchSize
	 */ 
	 public void maxTessellationPatchSize(int maxTessellationPatchSize){
		 this.maxTessellationPatchSize = maxTessellationPatchSize;
		 maxTessellationPatchSize0(this.ptr,  maxTessellationPatchSize);
	 }

	/**
	 * Get method for field maxTessellationPatchSize	[int]<br>
	 * Prototype: uint32_t  maxTessellationPatchSize
	 */ 
	 public int maxTessellationPatchSize(){
		 int var = maxTessellationPatchSize0(super.ptr);
		 this.maxTessellationPatchSize = var;
		 return this.maxTessellationPatchSize;
	 }

	/**
	 * Set method for field maxTessellationControlPerVertexInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexInputComponents
	 */ 
	 public void maxTessellationControlPerVertexInputComponents(int maxTessellationControlPerVertexInputComponents){
		 this.maxTessellationControlPerVertexInputComponents = maxTessellationControlPerVertexInputComponents;
		 maxTessellationControlPerVertexInputComponents0(this.ptr,  maxTessellationControlPerVertexInputComponents);
	 }

	/**
	 * Get method for field maxTessellationControlPerVertexInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexInputComponents
	 */ 
	 public int maxTessellationControlPerVertexInputComponents(){
		 int var = maxTessellationControlPerVertexInputComponents0(super.ptr);
		 this.maxTessellationControlPerVertexInputComponents = var;
		 return this.maxTessellationControlPerVertexInputComponents;
	 }

	/**
	 * Set method for field maxTessellationControlPerVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexOutputComponents
	 */ 
	 public void maxTessellationControlPerVertexOutputComponents(int maxTessellationControlPerVertexOutputComponents){
		 this.maxTessellationControlPerVertexOutputComponents = maxTessellationControlPerVertexOutputComponents;
		 maxTessellationControlPerVertexOutputComponents0(this.ptr,  maxTessellationControlPerVertexOutputComponents);
	 }

	/**
	 * Get method for field maxTessellationControlPerVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexOutputComponents
	 */ 
	 public int maxTessellationControlPerVertexOutputComponents(){
		 int var = maxTessellationControlPerVertexOutputComponents0(super.ptr);
		 this.maxTessellationControlPerVertexOutputComponents = var;
		 return this.maxTessellationControlPerVertexOutputComponents;
	 }

	/**
	 * Set method for field maxTessellationControlPerPatchOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerPatchOutputComponents
	 */ 
	 public void maxTessellationControlPerPatchOutputComponents(int maxTessellationControlPerPatchOutputComponents){
		 this.maxTessellationControlPerPatchOutputComponents = maxTessellationControlPerPatchOutputComponents;
		 maxTessellationControlPerPatchOutputComponents0(this.ptr,  maxTessellationControlPerPatchOutputComponents);
	 }

	/**
	 * Get method for field maxTessellationControlPerPatchOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerPatchOutputComponents
	 */ 
	 public int maxTessellationControlPerPatchOutputComponents(){
		 int var = maxTessellationControlPerPatchOutputComponents0(super.ptr);
		 this.maxTessellationControlPerPatchOutputComponents = var;
		 return this.maxTessellationControlPerPatchOutputComponents;
	 }

	/**
	 * Set method for field maxTessellationControlTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlTotalOutputComponents
	 */ 
	 public void maxTessellationControlTotalOutputComponents(int maxTessellationControlTotalOutputComponents){
		 this.maxTessellationControlTotalOutputComponents = maxTessellationControlTotalOutputComponents;
		 maxTessellationControlTotalOutputComponents0(this.ptr,  maxTessellationControlTotalOutputComponents);
	 }

	/**
	 * Get method for field maxTessellationControlTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlTotalOutputComponents
	 */ 
	 public int maxTessellationControlTotalOutputComponents(){
		 int var = maxTessellationControlTotalOutputComponents0(super.ptr);
		 this.maxTessellationControlTotalOutputComponents = var;
		 return this.maxTessellationControlTotalOutputComponents;
	 }

	/**
	 * Set method for field maxTessellationEvaluationInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationInputComponents
	 */ 
	 public void maxTessellationEvaluationInputComponents(int maxTessellationEvaluationInputComponents){
		 this.maxTessellationEvaluationInputComponents = maxTessellationEvaluationInputComponents;
		 maxTessellationEvaluationInputComponents0(this.ptr,  maxTessellationEvaluationInputComponents);
	 }

	/**
	 * Get method for field maxTessellationEvaluationInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationInputComponents
	 */ 
	 public int maxTessellationEvaluationInputComponents(){
		 int var = maxTessellationEvaluationInputComponents0(super.ptr);
		 this.maxTessellationEvaluationInputComponents = var;
		 return this.maxTessellationEvaluationInputComponents;
	 }

	/**
	 * Set method for field maxTessellationEvaluationOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationOutputComponents
	 */ 
	 public void maxTessellationEvaluationOutputComponents(int maxTessellationEvaluationOutputComponents){
		 this.maxTessellationEvaluationOutputComponents = maxTessellationEvaluationOutputComponents;
		 maxTessellationEvaluationOutputComponents0(this.ptr,  maxTessellationEvaluationOutputComponents);
	 }

	/**
	 * Get method for field maxTessellationEvaluationOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationOutputComponents
	 */ 
	 public int maxTessellationEvaluationOutputComponents(){
		 int var = maxTessellationEvaluationOutputComponents0(super.ptr);
		 this.maxTessellationEvaluationOutputComponents = var;
		 return this.maxTessellationEvaluationOutputComponents;
	 }

	/**
	 * Set method for field maxGeometryShaderInvocations	[int]<br>
	 * Prototype: uint32_t  maxGeometryShaderInvocations
	 */ 
	 public void maxGeometryShaderInvocations(int maxGeometryShaderInvocations){
		 this.maxGeometryShaderInvocations = maxGeometryShaderInvocations;
		 maxGeometryShaderInvocations0(this.ptr,  maxGeometryShaderInvocations);
	 }

	/**
	 * Get method for field maxGeometryShaderInvocations	[int]<br>
	 * Prototype: uint32_t  maxGeometryShaderInvocations
	 */ 
	 public int maxGeometryShaderInvocations(){
		 int var = maxGeometryShaderInvocations0(super.ptr);
		 this.maxGeometryShaderInvocations = var;
		 return this.maxGeometryShaderInvocations;
	 }

	/**
	 * Set method for field maxGeometryInputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryInputComponents
	 */ 
	 public void maxGeometryInputComponents(int maxGeometryInputComponents){
		 this.maxGeometryInputComponents = maxGeometryInputComponents;
		 maxGeometryInputComponents0(this.ptr,  maxGeometryInputComponents);
	 }

	/**
	 * Get method for field maxGeometryInputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryInputComponents
	 */ 
	 public int maxGeometryInputComponents(){
		 int var = maxGeometryInputComponents0(super.ptr);
		 this.maxGeometryInputComponents = var;
		 return this.maxGeometryInputComponents;
	 }

	/**
	 * Set method for field maxGeometryOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputComponents
	 */ 
	 public void maxGeometryOutputComponents(int maxGeometryOutputComponents){
		 this.maxGeometryOutputComponents = maxGeometryOutputComponents;
		 maxGeometryOutputComponents0(this.ptr,  maxGeometryOutputComponents);
	 }

	/**
	 * Get method for field maxGeometryOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputComponents
	 */ 
	 public int maxGeometryOutputComponents(){
		 int var = maxGeometryOutputComponents0(super.ptr);
		 this.maxGeometryOutputComponents = var;
		 return this.maxGeometryOutputComponents;
	 }

	/**
	 * Set method for field maxGeometryOutputVertices	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputVertices
	 */ 
	 public void maxGeometryOutputVertices(int maxGeometryOutputVertices){
		 this.maxGeometryOutputVertices = maxGeometryOutputVertices;
		 maxGeometryOutputVertices0(this.ptr,  maxGeometryOutputVertices);
	 }

	/**
	 * Get method for field maxGeometryOutputVertices	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputVertices
	 */ 
	 public int maxGeometryOutputVertices(){
		 int var = maxGeometryOutputVertices0(super.ptr);
		 this.maxGeometryOutputVertices = var;
		 return this.maxGeometryOutputVertices;
	 }

	/**
	 * Set method for field maxGeometryTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryTotalOutputComponents
	 */ 
	 public void maxGeometryTotalOutputComponents(int maxGeometryTotalOutputComponents){
		 this.maxGeometryTotalOutputComponents = maxGeometryTotalOutputComponents;
		 maxGeometryTotalOutputComponents0(this.ptr,  maxGeometryTotalOutputComponents);
	 }

	/**
	 * Get method for field maxGeometryTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryTotalOutputComponents
	 */ 
	 public int maxGeometryTotalOutputComponents(){
		 int var = maxGeometryTotalOutputComponents0(super.ptr);
		 this.maxGeometryTotalOutputComponents = var;
		 return this.maxGeometryTotalOutputComponents;
	 }

	/**
	 * Set method for field maxFragmentInputComponents	[int]<br>
	 * Prototype: uint32_t  maxFragmentInputComponents
	 */ 
	 public void maxFragmentInputComponents(int maxFragmentInputComponents){
		 this.maxFragmentInputComponents = maxFragmentInputComponents;
		 maxFragmentInputComponents0(this.ptr,  maxFragmentInputComponents);
	 }

	/**
	 * Get method for field maxFragmentInputComponents	[int]<br>
	 * Prototype: uint32_t  maxFragmentInputComponents
	 */ 
	 public int maxFragmentInputComponents(){
		 int var = maxFragmentInputComponents0(super.ptr);
		 this.maxFragmentInputComponents = var;
		 return this.maxFragmentInputComponents;
	 }

	/**
	 * Set method for field maxFragmentOutputAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentOutputAttachments
	 */ 
	 public void maxFragmentOutputAttachments(int maxFragmentOutputAttachments){
		 this.maxFragmentOutputAttachments = maxFragmentOutputAttachments;
		 maxFragmentOutputAttachments0(this.ptr,  maxFragmentOutputAttachments);
	 }

	/**
	 * Get method for field maxFragmentOutputAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentOutputAttachments
	 */ 
	 public int maxFragmentOutputAttachments(){
		 int var = maxFragmentOutputAttachments0(super.ptr);
		 this.maxFragmentOutputAttachments = var;
		 return this.maxFragmentOutputAttachments;
	 }

	/**
	 * Set method for field maxFragmentDualSrcAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentDualSrcAttachments
	 */ 
	 public void maxFragmentDualSrcAttachments(int maxFragmentDualSrcAttachments){
		 this.maxFragmentDualSrcAttachments = maxFragmentDualSrcAttachments;
		 maxFragmentDualSrcAttachments0(this.ptr,  maxFragmentDualSrcAttachments);
	 }

	/**
	 * Get method for field maxFragmentDualSrcAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentDualSrcAttachments
	 */ 
	 public int maxFragmentDualSrcAttachments(){
		 int var = maxFragmentDualSrcAttachments0(super.ptr);
		 this.maxFragmentDualSrcAttachments = var;
		 return this.maxFragmentDualSrcAttachments;
	 }

	/**
	 * Set method for field maxFragmentCombinedOutputResources	[int]<br>
	 * Prototype: uint32_t  maxFragmentCombinedOutputResources
	 */ 
	 public void maxFragmentCombinedOutputResources(int maxFragmentCombinedOutputResources){
		 this.maxFragmentCombinedOutputResources = maxFragmentCombinedOutputResources;
		 maxFragmentCombinedOutputResources0(this.ptr,  maxFragmentCombinedOutputResources);
	 }

	/**
	 * Get method for field maxFragmentCombinedOutputResources	[int]<br>
	 * Prototype: uint32_t  maxFragmentCombinedOutputResources
	 */ 
	 public int maxFragmentCombinedOutputResources(){
		 int var = maxFragmentCombinedOutputResources0(super.ptr);
		 this.maxFragmentCombinedOutputResources = var;
		 return this.maxFragmentCombinedOutputResources;
	 }

	/**
	 * Set method for field maxComputeSharedMemorySize	[int]<br>
	 * Prototype: uint32_t  maxComputeSharedMemorySize
	 */ 
	 public void maxComputeSharedMemorySize(int maxComputeSharedMemorySize){
		 this.maxComputeSharedMemorySize = maxComputeSharedMemorySize;
		 maxComputeSharedMemorySize0(this.ptr,  maxComputeSharedMemorySize);
	 }

	/**
	 * Get method for field maxComputeSharedMemorySize	[int]<br>
	 * Prototype: uint32_t  maxComputeSharedMemorySize
	 */ 
	 public int maxComputeSharedMemorySize(){
		 int var = maxComputeSharedMemorySize0(super.ptr);
		 this.maxComputeSharedMemorySize = var;
		 return this.maxComputeSharedMemorySize;
	 }

	/**
	 * Set method for field maxComputeWorkGroupCount	[int_array]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupCount
	 */ 
	 public void maxComputeWorkGroupCount(int[] maxComputeWorkGroupCount){
		 this.maxComputeWorkGroupCount = maxComputeWorkGroupCount;
		 maxComputeWorkGroupCount0(this.ptr,  maxComputeWorkGroupCount);
	 }

	/**
	 * Get method for field maxComputeWorkGroupCount	[int_array]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupCount
	 */ 
	 public int[] maxComputeWorkGroupCount(){
		 int[] var = maxComputeWorkGroupCount0(super.ptr);
		 this.maxComputeWorkGroupCount = var;
		 return this.maxComputeWorkGroupCount;
	 }

	/**
	 * Set method for field maxComputeWorkGroupInvocations	[int]<br>
	 * Prototype: uint32_t  maxComputeWorkGroupInvocations
	 */ 
	 public void maxComputeWorkGroupInvocations(int maxComputeWorkGroupInvocations){
		 this.maxComputeWorkGroupInvocations = maxComputeWorkGroupInvocations;
		 maxComputeWorkGroupInvocations0(this.ptr,  maxComputeWorkGroupInvocations);
	 }

	/**
	 * Get method for field maxComputeWorkGroupInvocations	[int]<br>
	 * Prototype: uint32_t  maxComputeWorkGroupInvocations
	 */ 
	 public int maxComputeWorkGroupInvocations(){
		 int var = maxComputeWorkGroupInvocations0(super.ptr);
		 this.maxComputeWorkGroupInvocations = var;
		 return this.maxComputeWorkGroupInvocations;
	 }

	/**
	 * Set method for field maxComputeWorkGroupSize	[int_array]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupSize
	 */ 
	 public void maxComputeWorkGroupSize(int[] maxComputeWorkGroupSize){
		 this.maxComputeWorkGroupSize = maxComputeWorkGroupSize;
		 maxComputeWorkGroupSize0(this.ptr,  maxComputeWorkGroupSize);
	 }

	/**
	 * Get method for field maxComputeWorkGroupSize	[int_array]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupSize
	 */ 
	 public int[] maxComputeWorkGroupSize(){
		 int[] var = maxComputeWorkGroupSize0(super.ptr);
		 this.maxComputeWorkGroupSize = var;
		 return this.maxComputeWorkGroupSize;
	 }

	/**
	 * Set method for field subPixelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subPixelPrecisionBits
	 */ 
	 public void subPixelPrecisionBits(int subPixelPrecisionBits){
		 this.subPixelPrecisionBits = subPixelPrecisionBits;
		 subPixelPrecisionBits0(this.ptr,  subPixelPrecisionBits);
	 }

	/**
	 * Get method for field subPixelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subPixelPrecisionBits
	 */ 
	 public int subPixelPrecisionBits(){
		 int var = subPixelPrecisionBits0(super.ptr);
		 this.subPixelPrecisionBits = var;
		 return this.subPixelPrecisionBits;
	 }

	/**
	 * Set method for field subTexelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subTexelPrecisionBits
	 */ 
	 public void subTexelPrecisionBits(int subTexelPrecisionBits){
		 this.subTexelPrecisionBits = subTexelPrecisionBits;
		 subTexelPrecisionBits0(this.ptr,  subTexelPrecisionBits);
	 }

	/**
	 * Get method for field subTexelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subTexelPrecisionBits
	 */ 
	 public int subTexelPrecisionBits(){
		 int var = subTexelPrecisionBits0(super.ptr);
		 this.subTexelPrecisionBits = var;
		 return this.subTexelPrecisionBits;
	 }

	/**
	 * Set method for field mipmapPrecisionBits	[int]<br>
	 * Prototype: uint32_t  mipmapPrecisionBits
	 */ 
	 public void mipmapPrecisionBits(int mipmapPrecisionBits){
		 this.mipmapPrecisionBits = mipmapPrecisionBits;
		 mipmapPrecisionBits0(this.ptr,  mipmapPrecisionBits);
	 }

	/**
	 * Get method for field mipmapPrecisionBits	[int]<br>
	 * Prototype: uint32_t  mipmapPrecisionBits
	 */ 
	 public int mipmapPrecisionBits(){
		 int var = mipmapPrecisionBits0(super.ptr);
		 this.mipmapPrecisionBits = var;
		 return this.mipmapPrecisionBits;
	 }

	/**
	 * Set method for field maxDrawIndexedIndexValue	[int]<br>
	 * Prototype: uint32_t  maxDrawIndexedIndexValue
	 */ 
	 public void maxDrawIndexedIndexValue(int maxDrawIndexedIndexValue){
		 this.maxDrawIndexedIndexValue = maxDrawIndexedIndexValue;
		 maxDrawIndexedIndexValue0(this.ptr,  maxDrawIndexedIndexValue);
	 }

	/**
	 * Get method for field maxDrawIndexedIndexValue	[int]<br>
	 * Prototype: uint32_t  maxDrawIndexedIndexValue
	 */ 
	 public int maxDrawIndexedIndexValue(){
		 int var = maxDrawIndexedIndexValue0(super.ptr);
		 this.maxDrawIndexedIndexValue = var;
		 return this.maxDrawIndexedIndexValue;
	 }

	/**
	 * Set method for field maxDrawIndirectCount	[int]<br>
	 * Prototype: uint32_t  maxDrawIndirectCount
	 */ 
	 public void maxDrawIndirectCount(int maxDrawIndirectCount){
		 this.maxDrawIndirectCount = maxDrawIndirectCount;
		 maxDrawIndirectCount0(this.ptr,  maxDrawIndirectCount);
	 }

	/**
	 * Get method for field maxDrawIndirectCount	[int]<br>
	 * Prototype: uint32_t  maxDrawIndirectCount
	 */ 
	 public int maxDrawIndirectCount(){
		 int var = maxDrawIndirectCount0(super.ptr);
		 this.maxDrawIndirectCount = var;
		 return this.maxDrawIndirectCount;
	 }

	/**
	 * Set method for field maxSamplerLodBias	[float]<br>
	 * Prototype: float  maxSamplerLodBias
	 */ 
	 public void maxSamplerLodBias(float maxSamplerLodBias){
		 this.maxSamplerLodBias = maxSamplerLodBias;
		 maxSamplerLodBias0(this.ptr,  maxSamplerLodBias);
	 }

	/**
	 * Get method for field maxSamplerLodBias	[float]<br>
	 * Prototype: float  maxSamplerLodBias
	 */ 
	 public float maxSamplerLodBias(){
		 float var = maxSamplerLodBias0(super.ptr);
		 this.maxSamplerLodBias = var;
		 return this.maxSamplerLodBias;
	 }

	/**
	 * Set method for field maxSamplerAnisotropy	[float]<br>
	 * Prototype: float  maxSamplerAnisotropy
	 */ 
	 public void maxSamplerAnisotropy(float maxSamplerAnisotropy){
		 this.maxSamplerAnisotropy = maxSamplerAnisotropy;
		 maxSamplerAnisotropy0(this.ptr,  maxSamplerAnisotropy);
	 }

	/**
	 * Get method for field maxSamplerAnisotropy	[float]<br>
	 * Prototype: float  maxSamplerAnisotropy
	 */ 
	 public float maxSamplerAnisotropy(){
		 float var = maxSamplerAnisotropy0(super.ptr);
		 this.maxSamplerAnisotropy = var;
		 return this.maxSamplerAnisotropy;
	 }

	/**
	 * Set method for field maxViewports	[int]<br>
	 * Prototype: uint32_t  maxViewports
	 */ 
	 public void maxViewports(int maxViewports){
		 this.maxViewports = maxViewports;
		 maxViewports0(this.ptr,  maxViewports);
	 }

	/**
	 * Get method for field maxViewports	[int]<br>
	 * Prototype: uint32_t  maxViewports
	 */ 
	 public int maxViewports(){
		 int var = maxViewports0(super.ptr);
		 this.maxViewports = var;
		 return this.maxViewports;
	 }

	/**
	 * Set method for field maxViewportDimensions	[int_array]<br>
	 * Prototype: uint32_t[]  maxViewportDimensions
	 */ 
	 public void maxViewportDimensions(int[] maxViewportDimensions){
		 this.maxViewportDimensions = maxViewportDimensions;
		 maxViewportDimensions0(this.ptr,  maxViewportDimensions);
	 }

	/**
	 * Get method for field maxViewportDimensions	[int_array]<br>
	 * Prototype: uint32_t[]  maxViewportDimensions
	 */ 
	 public int[] maxViewportDimensions(){
		 int[] var = maxViewportDimensions0(super.ptr);
		 this.maxViewportDimensions = var;
		 return this.maxViewportDimensions;
	 }

	/**
	 * Set method for field viewportBoundsRange	[float_array]<br>
	 * Prototype: float[]  viewportBoundsRange
	 */ 
	 public void viewportBoundsRange(float[] viewportBoundsRange){
		 this.viewportBoundsRange = viewportBoundsRange;
		 viewportBoundsRange0(this.ptr,  viewportBoundsRange);
	 }

	/**
	 * Get method for field viewportBoundsRange	[float_array]<br>
	 * Prototype: float[]  viewportBoundsRange
	 */ 
	 public float[] viewportBoundsRange(){
		 float[] var = viewportBoundsRange0(super.ptr);
		 this.viewportBoundsRange = var;
		 return this.viewportBoundsRange;
	 }

	/**
	 * Set method for field viewportSubPixelBits	[int]<br>
	 * Prototype: uint32_t  viewportSubPixelBits
	 */ 
	 public void viewportSubPixelBits(int viewportSubPixelBits){
		 this.viewportSubPixelBits = viewportSubPixelBits;
		 viewportSubPixelBits0(this.ptr,  viewportSubPixelBits);
	 }

	/**
	 * Get method for field viewportSubPixelBits	[int]<br>
	 * Prototype: uint32_t  viewportSubPixelBits
	 */ 
	 public int viewportSubPixelBits(){
		 int var = viewportSubPixelBits0(super.ptr);
		 this.viewportSubPixelBits = var;
		 return this.viewportSubPixelBits;
	 }

	/**
	 * Set method for field minMemoryMapAlignment	[long]<br>
	 * Prototype: size_t  minMemoryMapAlignment
	 */ 
	 public void minMemoryMapAlignment(long minMemoryMapAlignment){
		 this.minMemoryMapAlignment = minMemoryMapAlignment;
		 minMemoryMapAlignment0(this.ptr,  minMemoryMapAlignment);
	 }

	/**
	 * Get method for field minMemoryMapAlignment	[long]<br>
	 * Prototype: size_t  minMemoryMapAlignment
	 */ 
	 public long minMemoryMapAlignment(){
		 long var = minMemoryMapAlignment0(super.ptr);
		 this.minMemoryMapAlignment = var;
		 return this.minMemoryMapAlignment;
	 }

	/**
	 * Set method for field minTexelBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minTexelBufferOffsetAlignment
	 */ 
	 public void minTexelBufferOffsetAlignment(long minTexelBufferOffsetAlignment){
		 this.minTexelBufferOffsetAlignment = minTexelBufferOffsetAlignment;
		 minTexelBufferOffsetAlignment0(this.ptr,  minTexelBufferOffsetAlignment);
	 }

	/**
	 * Get method for field minTexelBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minTexelBufferOffsetAlignment
	 */ 
	 public long minTexelBufferOffsetAlignment(){
		 long var = minTexelBufferOffsetAlignment0(super.ptr);
		 this.minTexelBufferOffsetAlignment = var;
		 return this.minTexelBufferOffsetAlignment;
	 }

	/**
	 * Set method for field minUniformBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minUniformBufferOffsetAlignment
	 */ 
	 public void minUniformBufferOffsetAlignment(long minUniformBufferOffsetAlignment){
		 this.minUniformBufferOffsetAlignment = minUniformBufferOffsetAlignment;
		 minUniformBufferOffsetAlignment0(this.ptr,  minUniformBufferOffsetAlignment);
	 }

	/**
	 * Get method for field minUniformBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minUniformBufferOffsetAlignment
	 */ 
	 public long minUniformBufferOffsetAlignment(){
		 long var = minUniformBufferOffsetAlignment0(super.ptr);
		 this.minUniformBufferOffsetAlignment = var;
		 return this.minUniformBufferOffsetAlignment;
	 }

	/**
	 * Set method for field minStorageBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minStorageBufferOffsetAlignment
	 */ 
	 public void minStorageBufferOffsetAlignment(long minStorageBufferOffsetAlignment){
		 this.minStorageBufferOffsetAlignment = minStorageBufferOffsetAlignment;
		 minStorageBufferOffsetAlignment0(this.ptr,  minStorageBufferOffsetAlignment);
	 }

	/**
	 * Get method for field minStorageBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minStorageBufferOffsetAlignment
	 */ 
	 public long minStorageBufferOffsetAlignment(){
		 long var = minStorageBufferOffsetAlignment0(super.ptr);
		 this.minStorageBufferOffsetAlignment = var;
		 return this.minStorageBufferOffsetAlignment;
	 }

	/**
	 * Set method for field minTexelOffset	[int]<br>
	 * Prototype: int32_t  minTexelOffset
	 */ 
	 public void minTexelOffset(int minTexelOffset){
		 this.minTexelOffset = minTexelOffset;
		 minTexelOffset0(this.ptr,  minTexelOffset);
	 }

	/**
	 * Get method for field minTexelOffset	[int]<br>
	 * Prototype: int32_t  minTexelOffset
	 */ 
	 public int minTexelOffset(){
		 int var = minTexelOffset0(super.ptr);
		 this.minTexelOffset = var;
		 return this.minTexelOffset;
	 }

	/**
	 * Set method for field maxTexelOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelOffset
	 */ 
	 public void maxTexelOffset(int maxTexelOffset){
		 this.maxTexelOffset = maxTexelOffset;
		 maxTexelOffset0(this.ptr,  maxTexelOffset);
	 }

	/**
	 * Get method for field maxTexelOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelOffset
	 */ 
	 public int maxTexelOffset(){
		 int var = maxTexelOffset0(super.ptr);
		 this.maxTexelOffset = var;
		 return this.maxTexelOffset;
	 }

	/**
	 * Set method for field minTexelGatherOffset	[int]<br>
	 * Prototype: int32_t  minTexelGatherOffset
	 */ 
	 public void minTexelGatherOffset(int minTexelGatherOffset){
		 this.minTexelGatherOffset = minTexelGatherOffset;
		 minTexelGatherOffset0(this.ptr,  minTexelGatherOffset);
	 }

	/**
	 * Get method for field minTexelGatherOffset	[int]<br>
	 * Prototype: int32_t  minTexelGatherOffset
	 */ 
	 public int minTexelGatherOffset(){
		 int var = minTexelGatherOffset0(super.ptr);
		 this.minTexelGatherOffset = var;
		 return this.minTexelGatherOffset;
	 }

	/**
	 * Set method for field maxTexelGatherOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelGatherOffset
	 */ 
	 public void maxTexelGatherOffset(int maxTexelGatherOffset){
		 this.maxTexelGatherOffset = maxTexelGatherOffset;
		 maxTexelGatherOffset0(this.ptr,  maxTexelGatherOffset);
	 }

	/**
	 * Get method for field maxTexelGatherOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelGatherOffset
	 */ 
	 public int maxTexelGatherOffset(){
		 int var = maxTexelGatherOffset0(super.ptr);
		 this.maxTexelGatherOffset = var;
		 return this.maxTexelGatherOffset;
	 }

	/**
	 * Set method for field minInterpolationOffset	[float]<br>
	 * Prototype: float  minInterpolationOffset
	 */ 
	 public void minInterpolationOffset(float minInterpolationOffset){
		 this.minInterpolationOffset = minInterpolationOffset;
		 minInterpolationOffset0(this.ptr,  minInterpolationOffset);
	 }

	/**
	 * Get method for field minInterpolationOffset	[float]<br>
	 * Prototype: float  minInterpolationOffset
	 */ 
	 public float minInterpolationOffset(){
		 float var = minInterpolationOffset0(super.ptr);
		 this.minInterpolationOffset = var;
		 return this.minInterpolationOffset;
	 }

	/**
	 * Set method for field maxInterpolationOffset	[float]<br>
	 * Prototype: float  maxInterpolationOffset
	 */ 
	 public void maxInterpolationOffset(float maxInterpolationOffset){
		 this.maxInterpolationOffset = maxInterpolationOffset;
		 maxInterpolationOffset0(this.ptr,  maxInterpolationOffset);
	 }

	/**
	 * Get method for field maxInterpolationOffset	[float]<br>
	 * Prototype: float  maxInterpolationOffset
	 */ 
	 public float maxInterpolationOffset(){
		 float var = maxInterpolationOffset0(super.ptr);
		 this.maxInterpolationOffset = var;
		 return this.maxInterpolationOffset;
	 }

	/**
	 * Set method for field subPixelInterpolationOffsetBits	[int]<br>
	 * Prototype: uint32_t  subPixelInterpolationOffsetBits
	 */ 
	 public void subPixelInterpolationOffsetBits(int subPixelInterpolationOffsetBits){
		 this.subPixelInterpolationOffsetBits = subPixelInterpolationOffsetBits;
		 subPixelInterpolationOffsetBits0(this.ptr,  subPixelInterpolationOffsetBits);
	 }

	/**
	 * Get method for field subPixelInterpolationOffsetBits	[int]<br>
	 * Prototype: uint32_t  subPixelInterpolationOffsetBits
	 */ 
	 public int subPixelInterpolationOffsetBits(){
		 int var = subPixelInterpolationOffsetBits0(super.ptr);
		 this.subPixelInterpolationOffsetBits = var;
		 return this.subPixelInterpolationOffsetBits;
	 }

	/**
	 * Set method for field maxFramebufferWidth	[int]<br>
	 * Prototype: uint32_t  maxFramebufferWidth
	 */ 
	 public void maxFramebufferWidth(int maxFramebufferWidth){
		 this.maxFramebufferWidth = maxFramebufferWidth;
		 maxFramebufferWidth0(this.ptr,  maxFramebufferWidth);
	 }

	/**
	 * Get method for field maxFramebufferWidth	[int]<br>
	 * Prototype: uint32_t  maxFramebufferWidth
	 */ 
	 public int maxFramebufferWidth(){
		 int var = maxFramebufferWidth0(super.ptr);
		 this.maxFramebufferWidth = var;
		 return this.maxFramebufferWidth;
	 }

	/**
	 * Set method for field maxFramebufferHeight	[int]<br>
	 * Prototype: uint32_t  maxFramebufferHeight
	 */ 
	 public void maxFramebufferHeight(int maxFramebufferHeight){
		 this.maxFramebufferHeight = maxFramebufferHeight;
		 maxFramebufferHeight0(this.ptr,  maxFramebufferHeight);
	 }

	/**
	 * Get method for field maxFramebufferHeight	[int]<br>
	 * Prototype: uint32_t  maxFramebufferHeight
	 */ 
	 public int maxFramebufferHeight(){
		 int var = maxFramebufferHeight0(super.ptr);
		 this.maxFramebufferHeight = var;
		 return this.maxFramebufferHeight;
	 }

	/**
	 * Set method for field maxFramebufferLayers	[int]<br>
	 * Prototype: uint32_t  maxFramebufferLayers
	 */ 
	 public void maxFramebufferLayers(int maxFramebufferLayers){
		 this.maxFramebufferLayers = maxFramebufferLayers;
		 maxFramebufferLayers0(this.ptr,  maxFramebufferLayers);
	 }

	/**
	 * Get method for field maxFramebufferLayers	[int]<br>
	 * Prototype: uint32_t  maxFramebufferLayers
	 */ 
	 public int maxFramebufferLayers(){
		 int var = maxFramebufferLayers0(super.ptr);
		 this.maxFramebufferLayers = var;
		 return this.maxFramebufferLayers;
	 }

	/**
	 * Set method for field framebufferColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferColorSampleCounts
	 */ 
	 public void framebufferColorSampleCounts(int framebufferColorSampleCounts){
		 this.framebufferColorSampleCounts = framebufferColorSampleCounts;
		 framebufferColorSampleCounts0(this.ptr,  framebufferColorSampleCounts);
	 }

	/**
	 * Get method for field framebufferColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferColorSampleCounts
	 */ 
	 public int framebufferColorSampleCounts(){
		 int var = framebufferColorSampleCounts0(super.ptr);
		 this.framebufferColorSampleCounts = var;
		 return this.framebufferColorSampleCounts;
	 }

	/**
	 * Set method for field framebufferDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferDepthSampleCounts
	 */ 
	 public void framebufferDepthSampleCounts(int framebufferDepthSampleCounts){
		 this.framebufferDepthSampleCounts = framebufferDepthSampleCounts;
		 framebufferDepthSampleCounts0(this.ptr,  framebufferDepthSampleCounts);
	 }

	/**
	 * Get method for field framebufferDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferDepthSampleCounts
	 */ 
	 public int framebufferDepthSampleCounts(){
		 int var = framebufferDepthSampleCounts0(super.ptr);
		 this.framebufferDepthSampleCounts = var;
		 return this.framebufferDepthSampleCounts;
	 }

	/**
	 * Set method for field framebufferStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferStencilSampleCounts
	 */ 
	 public void framebufferStencilSampleCounts(int framebufferStencilSampleCounts){
		 this.framebufferStencilSampleCounts = framebufferStencilSampleCounts;
		 framebufferStencilSampleCounts0(this.ptr,  framebufferStencilSampleCounts);
	 }

	/**
	 * Get method for field framebufferStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferStencilSampleCounts
	 */ 
	 public int framebufferStencilSampleCounts(){
		 int var = framebufferStencilSampleCounts0(super.ptr);
		 this.framebufferStencilSampleCounts = var;
		 return this.framebufferStencilSampleCounts;
	 }

	/**
	 * Set method for field framebufferNoAttachmentsSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferNoAttachmentsSampleCounts
	 */ 
	 public void framebufferNoAttachmentsSampleCounts(int framebufferNoAttachmentsSampleCounts){
		 this.framebufferNoAttachmentsSampleCounts = framebufferNoAttachmentsSampleCounts;
		 framebufferNoAttachmentsSampleCounts0(this.ptr,  framebufferNoAttachmentsSampleCounts);
	 }

	/**
	 * Get method for field framebufferNoAttachmentsSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferNoAttachmentsSampleCounts
	 */ 
	 public int framebufferNoAttachmentsSampleCounts(){
		 int var = framebufferNoAttachmentsSampleCounts0(super.ptr);
		 this.framebufferNoAttachmentsSampleCounts = var;
		 return this.framebufferNoAttachmentsSampleCounts;
	 }

	/**
	 * Set method for field maxColorAttachments	[int]<br>
	 * Prototype: uint32_t  maxColorAttachments
	 */ 
	 public void maxColorAttachments(int maxColorAttachments){
		 this.maxColorAttachments = maxColorAttachments;
		 maxColorAttachments0(this.ptr,  maxColorAttachments);
	 }

	/**
	 * Get method for field maxColorAttachments	[int]<br>
	 * Prototype: uint32_t  maxColorAttachments
	 */ 
	 public int maxColorAttachments(){
		 int var = maxColorAttachments0(super.ptr);
		 this.maxColorAttachments = var;
		 return this.maxColorAttachments;
	 }

	/**
	 * Set method for field sampledImageColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageColorSampleCounts
	 */ 
	 public void sampledImageColorSampleCounts(int sampledImageColorSampleCounts){
		 this.sampledImageColorSampleCounts = sampledImageColorSampleCounts;
		 sampledImageColorSampleCounts0(this.ptr,  sampledImageColorSampleCounts);
	 }

	/**
	 * Get method for field sampledImageColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageColorSampleCounts
	 */ 
	 public int sampledImageColorSampleCounts(){
		 int var = sampledImageColorSampleCounts0(super.ptr);
		 this.sampledImageColorSampleCounts = var;
		 return this.sampledImageColorSampleCounts;
	 }

	/**
	 * Set method for field sampledImageIntegerSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageIntegerSampleCounts
	 */ 
	 public void sampledImageIntegerSampleCounts(int sampledImageIntegerSampleCounts){
		 this.sampledImageIntegerSampleCounts = sampledImageIntegerSampleCounts;
		 sampledImageIntegerSampleCounts0(this.ptr,  sampledImageIntegerSampleCounts);
	 }

	/**
	 * Get method for field sampledImageIntegerSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageIntegerSampleCounts
	 */ 
	 public int sampledImageIntegerSampleCounts(){
		 int var = sampledImageIntegerSampleCounts0(super.ptr);
		 this.sampledImageIntegerSampleCounts = var;
		 return this.sampledImageIntegerSampleCounts;
	 }

	/**
	 * Set method for field sampledImageDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageDepthSampleCounts
	 */ 
	 public void sampledImageDepthSampleCounts(int sampledImageDepthSampleCounts){
		 this.sampledImageDepthSampleCounts = sampledImageDepthSampleCounts;
		 sampledImageDepthSampleCounts0(this.ptr,  sampledImageDepthSampleCounts);
	 }

	/**
	 * Get method for field sampledImageDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageDepthSampleCounts
	 */ 
	 public int sampledImageDepthSampleCounts(){
		 int var = sampledImageDepthSampleCounts0(super.ptr);
		 this.sampledImageDepthSampleCounts = var;
		 return this.sampledImageDepthSampleCounts;
	 }

	/**
	 * Set method for field sampledImageStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageStencilSampleCounts
	 */ 
	 public void sampledImageStencilSampleCounts(int sampledImageStencilSampleCounts){
		 this.sampledImageStencilSampleCounts = sampledImageStencilSampleCounts;
		 sampledImageStencilSampleCounts0(this.ptr,  sampledImageStencilSampleCounts);
	 }

	/**
	 * Get method for field sampledImageStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageStencilSampleCounts
	 */ 
	 public int sampledImageStencilSampleCounts(){
		 int var = sampledImageStencilSampleCounts0(super.ptr);
		 this.sampledImageStencilSampleCounts = var;
		 return this.sampledImageStencilSampleCounts;
	 }

	/**
	 * Set method for field storageImageSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  storageImageSampleCounts
	 */ 
	 public void storageImageSampleCounts(int storageImageSampleCounts){
		 this.storageImageSampleCounts = storageImageSampleCounts;
		 storageImageSampleCounts0(this.ptr,  storageImageSampleCounts);
	 }

	/**
	 * Get method for field storageImageSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  storageImageSampleCounts
	 */ 
	 public int storageImageSampleCounts(){
		 int var = storageImageSampleCounts0(super.ptr);
		 this.storageImageSampleCounts = var;
		 return this.storageImageSampleCounts;
	 }

	/**
	 * Set method for field maxSampleMaskWords	[int]<br>
	 * Prototype: uint32_t  maxSampleMaskWords
	 */ 
	 public void maxSampleMaskWords(int maxSampleMaskWords){
		 this.maxSampleMaskWords = maxSampleMaskWords;
		 maxSampleMaskWords0(this.ptr,  maxSampleMaskWords);
	 }

	/**
	 * Get method for field maxSampleMaskWords	[int]<br>
	 * Prototype: uint32_t  maxSampleMaskWords
	 */ 
	 public int maxSampleMaskWords(){
		 int var = maxSampleMaskWords0(super.ptr);
		 this.maxSampleMaskWords = var;
		 return this.maxSampleMaskWords;
	 }

	/**
	 * Set method for field timestampComputeAndGraphics	[boolean]<br>
	 * Prototype: VkBool32  timestampComputeAndGraphics
	 */ 
	 public void timestampComputeAndGraphics(boolean timestampComputeAndGraphics){
		 this.timestampComputeAndGraphics = timestampComputeAndGraphics;
		 timestampComputeAndGraphics0(this.ptr,  timestampComputeAndGraphics);
	 }

	/**
	 * Get method for field timestampComputeAndGraphics	[boolean]<br>
	 * Prototype: VkBool32  timestampComputeAndGraphics
	 */ 
	 public boolean timestampComputeAndGraphics(){
		 boolean var = timestampComputeAndGraphics0(super.ptr);
		 this.timestampComputeAndGraphics = var;
		 return this.timestampComputeAndGraphics;
	 }

	/**
	 * Set method for field timestampPeriod	[float]<br>
	 * Prototype: float  timestampPeriod
	 */ 
	 public void timestampPeriod(float timestampPeriod){
		 this.timestampPeriod = timestampPeriod;
		 timestampPeriod0(this.ptr,  timestampPeriod);
	 }

	/**
	 * Get method for field timestampPeriod	[float]<br>
	 * Prototype: float  timestampPeriod
	 */ 
	 public float timestampPeriod(){
		 float var = timestampPeriod0(super.ptr);
		 this.timestampPeriod = var;
		 return this.timestampPeriod;
	 }

	/**
	 * Set method for field maxClipDistances	[int]<br>
	 * Prototype: uint32_t  maxClipDistances
	 */ 
	 public void maxClipDistances(int maxClipDistances){
		 this.maxClipDistances = maxClipDistances;
		 maxClipDistances0(this.ptr,  maxClipDistances);
	 }

	/**
	 * Get method for field maxClipDistances	[int]<br>
	 * Prototype: uint32_t  maxClipDistances
	 */ 
	 public int maxClipDistances(){
		 int var = maxClipDistances0(super.ptr);
		 this.maxClipDistances = var;
		 return this.maxClipDistances;
	 }

	/**
	 * Set method for field maxCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCullDistances
	 */ 
	 public void maxCullDistances(int maxCullDistances){
		 this.maxCullDistances = maxCullDistances;
		 maxCullDistances0(this.ptr,  maxCullDistances);
	 }

	/**
	 * Get method for field maxCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCullDistances
	 */ 
	 public int maxCullDistances(){
		 int var = maxCullDistances0(super.ptr);
		 this.maxCullDistances = var;
		 return this.maxCullDistances;
	 }

	/**
	 * Set method for field maxCombinedClipAndCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCombinedClipAndCullDistances
	 */ 
	 public void maxCombinedClipAndCullDistances(int maxCombinedClipAndCullDistances){
		 this.maxCombinedClipAndCullDistances = maxCombinedClipAndCullDistances;
		 maxCombinedClipAndCullDistances0(this.ptr,  maxCombinedClipAndCullDistances);
	 }

	/**
	 * Get method for field maxCombinedClipAndCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCombinedClipAndCullDistances
	 */ 
	 public int maxCombinedClipAndCullDistances(){
		 int var = maxCombinedClipAndCullDistances0(super.ptr);
		 this.maxCombinedClipAndCullDistances = var;
		 return this.maxCombinedClipAndCullDistances;
	 }

	/**
	 * Set method for field discreteQueuePriorities	[int]<br>
	 * Prototype: uint32_t  discreteQueuePriorities
	 */ 
	 public void discreteQueuePriorities(int discreteQueuePriorities){
		 this.discreteQueuePriorities = discreteQueuePriorities;
		 discreteQueuePriorities0(this.ptr,  discreteQueuePriorities);
	 }

	/**
	 * Get method for field discreteQueuePriorities	[int]<br>
	 * Prototype: uint32_t  discreteQueuePriorities
	 */ 
	 public int discreteQueuePriorities(){
		 int var = discreteQueuePriorities0(super.ptr);
		 this.discreteQueuePriorities = var;
		 return this.discreteQueuePriorities;
	 }

	/**
	 * Set method for field pointSizeRange	[float_array]<br>
	 * Prototype: float[]  pointSizeRange
	 */ 
	 public void pointSizeRange(float[] pointSizeRange){
		 this.pointSizeRange = pointSizeRange;
		 pointSizeRange0(this.ptr,  pointSizeRange);
	 }

	/**
	 * Get method for field pointSizeRange	[float_array]<br>
	 * Prototype: float[]  pointSizeRange
	 */ 
	 public float[] pointSizeRange(){
		 float[] var = pointSizeRange0(super.ptr);
		 this.pointSizeRange = var;
		 return this.pointSizeRange;
	 }

	/**
	 * Set method for field lineWidthRange	[float_array]<br>
	 * Prototype: float[]  lineWidthRange
	 */ 
	 public void lineWidthRange(float[] lineWidthRange){
		 this.lineWidthRange = lineWidthRange;
		 lineWidthRange0(this.ptr,  lineWidthRange);
	 }

	/**
	 * Get method for field lineWidthRange	[float_array]<br>
	 * Prototype: float[]  lineWidthRange
	 */ 
	 public float[] lineWidthRange(){
		 float[] var = lineWidthRange0(super.ptr);
		 this.lineWidthRange = var;
		 return this.lineWidthRange;
	 }

	/**
	 * Set method for field pointSizeGranularity	[float]<br>
	 * Prototype: float  pointSizeGranularity
	 */ 
	 public void pointSizeGranularity(float pointSizeGranularity){
		 this.pointSizeGranularity = pointSizeGranularity;
		 pointSizeGranularity0(this.ptr,  pointSizeGranularity);
	 }

	/**
	 * Get method for field pointSizeGranularity	[float]<br>
	 * Prototype: float  pointSizeGranularity
	 */ 
	 public float pointSizeGranularity(){
		 float var = pointSizeGranularity0(super.ptr);
		 this.pointSizeGranularity = var;
		 return this.pointSizeGranularity;
	 }

	/**
	 * Set method for field lineWidthGranularity	[float]<br>
	 * Prototype: float  lineWidthGranularity
	 */ 
	 public void lineWidthGranularity(float lineWidthGranularity){
		 this.lineWidthGranularity = lineWidthGranularity;
		 lineWidthGranularity0(this.ptr,  lineWidthGranularity);
	 }

	/**
	 * Get method for field lineWidthGranularity	[float]<br>
	 * Prototype: float  lineWidthGranularity
	 */ 
	 public float lineWidthGranularity(){
		 float var = lineWidthGranularity0(super.ptr);
		 this.lineWidthGranularity = var;
		 return this.lineWidthGranularity;
	 }

	/**
	 * Set method for field strictLines	[boolean]<br>
	 * Prototype: VkBool32  strictLines
	 */ 
	 public void strictLines(boolean strictLines){
		 this.strictLines = strictLines;
		 strictLines0(this.ptr,  strictLines);
	 }

	/**
	 * Get method for field strictLines	[boolean]<br>
	 * Prototype: VkBool32  strictLines
	 */ 
	 public boolean strictLines(){
		 boolean var = strictLines0(super.ptr);
		 this.strictLines = var;
		 return this.strictLines;
	 }

	/**
	 * Set method for field standardSampleLocations	[boolean]<br>
	 * Prototype: VkBool32  standardSampleLocations
	 */ 
	 public void standardSampleLocations(boolean standardSampleLocations){
		 this.standardSampleLocations = standardSampleLocations;
		 standardSampleLocations0(this.ptr,  standardSampleLocations);
	 }

	/**
	 * Get method for field standardSampleLocations	[boolean]<br>
	 * Prototype: VkBool32  standardSampleLocations
	 */ 
	 public boolean standardSampleLocations(){
		 boolean var = standardSampleLocations0(super.ptr);
		 this.standardSampleLocations = var;
		 return this.standardSampleLocations;
	 }

	/**
	 * Set method for field optimalBufferCopyOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyOffsetAlignment
	 */ 
	 public void optimalBufferCopyOffsetAlignment(long optimalBufferCopyOffsetAlignment){
		 this.optimalBufferCopyOffsetAlignment = optimalBufferCopyOffsetAlignment;
		 optimalBufferCopyOffsetAlignment0(this.ptr,  optimalBufferCopyOffsetAlignment);
	 }

	/**
	 * Get method for field optimalBufferCopyOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyOffsetAlignment
	 */ 
	 public long optimalBufferCopyOffsetAlignment(){
		 long var = optimalBufferCopyOffsetAlignment0(super.ptr);
		 this.optimalBufferCopyOffsetAlignment = var;
		 return this.optimalBufferCopyOffsetAlignment;
	 }

	/**
	 * Set method for field optimalBufferCopyRowPitchAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyRowPitchAlignment
	 */ 
	 public void optimalBufferCopyRowPitchAlignment(long optimalBufferCopyRowPitchAlignment){
		 this.optimalBufferCopyRowPitchAlignment = optimalBufferCopyRowPitchAlignment;
		 optimalBufferCopyRowPitchAlignment0(this.ptr,  optimalBufferCopyRowPitchAlignment);
	 }

	/**
	 * Get method for field optimalBufferCopyRowPitchAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyRowPitchAlignment
	 */ 
	 public long optimalBufferCopyRowPitchAlignment(){
		 long var = optimalBufferCopyRowPitchAlignment0(super.ptr);
		 this.optimalBufferCopyRowPitchAlignment = var;
		 return this.optimalBufferCopyRowPitchAlignment;
	 }

	/**
	 * Set method for field nonCoherentAtomSize	[long]<br>
	 * Prototype: VkDeviceSize  nonCoherentAtomSize
	 */ 
	 public void nonCoherentAtomSize(long nonCoherentAtomSize){
		 this.nonCoherentAtomSize = nonCoherentAtomSize;
		 nonCoherentAtomSize0(this.ptr,  nonCoherentAtomSize);
	 }

	/**
	 * Get method for field nonCoherentAtomSize	[long]<br>
	 * Prototype: VkDeviceSize  nonCoherentAtomSize
	 */ 
	 public long nonCoherentAtomSize(){
		 long var = nonCoherentAtomSize0(super.ptr);
		 this.nonCoherentAtomSize = var;
		 return this.nonCoherentAtomSize;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field maxImageDimension1D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension1D
	 */ 
	 private static native void maxImageDimension1D0(Buffer ptr, int _maxImageDimension1D);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxImageDimension1D = (uint32_t) (_maxImageDimension1D);
	  */

	/**
	 * native GET method for field maxImageDimension1D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension1D
	 */ 
	 private static native int maxImageDimension1D0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxImageDimension1D);
	 */

	/**
	 * native SET method for field maxImageDimension2D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension2D
	 */ 
	 private static native void maxImageDimension2D0(Buffer ptr, int _maxImageDimension2D);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxImageDimension2D = (uint32_t) (_maxImageDimension2D);
	  */

	/**
	 * native GET method for field maxImageDimension2D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension2D
	 */ 
	 private static native int maxImageDimension2D0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxImageDimension2D);
	 */

	/**
	 * native SET method for field maxImageDimension3D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension3D
	 */ 
	 private static native void maxImageDimension3D0(Buffer ptr, int _maxImageDimension3D);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxImageDimension3D = (uint32_t) (_maxImageDimension3D);
	  */

	/**
	 * native GET method for field maxImageDimension3D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension3D
	 */ 
	 private static native int maxImageDimension3D0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxImageDimension3D);
	 */

	/**
	 * native SET method for field maxImageDimensionCube	[int]<br>
	 * Prototype: uint32_t  maxImageDimensionCube
	 */ 
	 private static native void maxImageDimensionCube0(Buffer ptr, int _maxImageDimensionCube);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxImageDimensionCube = (uint32_t) (_maxImageDimensionCube);
	  */

	/**
	 * native GET method for field maxImageDimensionCube	[int]<br>
	 * Prototype: uint32_t  maxImageDimensionCube
	 */ 
	 private static native int maxImageDimensionCube0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxImageDimensionCube);
	 */

	/**
	 * native SET method for field maxImageArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxImageArrayLayers
	 */ 
	 private static native void maxImageArrayLayers0(Buffer ptr, int _maxImageArrayLayers);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxImageArrayLayers = (uint32_t) (_maxImageArrayLayers);
	  */

	/**
	 * native GET method for field maxImageArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxImageArrayLayers
	 */ 
	 private static native int maxImageArrayLayers0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxImageArrayLayers);
	 */

	/**
	 * native SET method for field maxTexelBufferElements	[int]<br>
	 * Prototype: uint32_t  maxTexelBufferElements
	 */ 
	 private static native void maxTexelBufferElements0(Buffer ptr, int _maxTexelBufferElements);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTexelBufferElements = (uint32_t) (_maxTexelBufferElements);
	  */

	/**
	 * native GET method for field maxTexelBufferElements	[int]<br>
	 * Prototype: uint32_t  maxTexelBufferElements
	 */ 
	 private static native int maxTexelBufferElements0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTexelBufferElements);
	 */

	/**
	 * native SET method for field maxUniformBufferRange	[int]<br>
	 * Prototype: uint32_t  maxUniformBufferRange
	 */ 
	 private static native void maxUniformBufferRange0(Buffer ptr, int _maxUniformBufferRange);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxUniformBufferRange = (uint32_t) (_maxUniformBufferRange);
	  */

	/**
	 * native GET method for field maxUniformBufferRange	[int]<br>
	 * Prototype: uint32_t  maxUniformBufferRange
	 */ 
	 private static native int maxUniformBufferRange0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxUniformBufferRange);
	 */

	/**
	 * native SET method for field maxStorageBufferRange	[int]<br>
	 * Prototype: uint32_t  maxStorageBufferRange
	 */ 
	 private static native void maxStorageBufferRange0(Buffer ptr, int _maxStorageBufferRange);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxStorageBufferRange = (uint32_t) (_maxStorageBufferRange);
	  */

	/**
	 * native GET method for field maxStorageBufferRange	[int]<br>
	 * Prototype: uint32_t  maxStorageBufferRange
	 */ 
	 private static native int maxStorageBufferRange0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxStorageBufferRange);
	 */

	/**
	 * native SET method for field maxPushConstantsSize	[int]<br>
	 * Prototype: uint32_t  maxPushConstantsSize
	 */ 
	 private static native void maxPushConstantsSize0(Buffer ptr, int _maxPushConstantsSize);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxPushConstantsSize = (uint32_t) (_maxPushConstantsSize);
	  */

	/**
	 * native GET method for field maxPushConstantsSize	[int]<br>
	 * Prototype: uint32_t  maxPushConstantsSize
	 */ 
	 private static native int maxPushConstantsSize0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxPushConstantsSize);
	 */

	/**
	 * native SET method for field maxMemoryAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxMemoryAllocationCount
	 */ 
	 private static native void maxMemoryAllocationCount0(Buffer ptr, int _maxMemoryAllocationCount);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxMemoryAllocationCount = (uint32_t) (_maxMemoryAllocationCount);
	  */

	/**
	 * native GET method for field maxMemoryAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxMemoryAllocationCount
	 */ 
	 private static native int maxMemoryAllocationCount0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxMemoryAllocationCount);
	 */

	/**
	 * native SET method for field maxSamplerAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxSamplerAllocationCount
	 */ 
	 private static native void maxSamplerAllocationCount0(Buffer ptr, int _maxSamplerAllocationCount);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxSamplerAllocationCount = (uint32_t) (_maxSamplerAllocationCount);
	  */

	/**
	 * native GET method for field maxSamplerAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxSamplerAllocationCount
	 */ 
	 private static native int maxSamplerAllocationCount0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxSamplerAllocationCount);
	 */

	/**
	 * native SET method for field bufferImageGranularity	[long]<br>
	 * Prototype: VkDeviceSize  bufferImageGranularity
	 */ 
	 private static native void bufferImageGranularity0(Buffer ptr, long _bufferImageGranularity);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->bufferImageGranularity = (VkDeviceSize) (_bufferImageGranularity);
	  */

	/**
	 * native GET method for field bufferImageGranularity	[long]<br>
	 * Prototype: VkDeviceSize  bufferImageGranularity
	 */ 
	 private static native long bufferImageGranularity0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->bufferImageGranularity);
	 */

	/**
	 * native SET method for field sparseAddressSpaceSize	[long]<br>
	 * Prototype: VkDeviceSize  sparseAddressSpaceSize
	 */ 
	 private static native void sparseAddressSpaceSize0(Buffer ptr, long _sparseAddressSpaceSize);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->sparseAddressSpaceSize = (VkDeviceSize) (_sparseAddressSpaceSize);
	  */

	/**
	 * native GET method for field sparseAddressSpaceSize	[long]<br>
	 * Prototype: VkDeviceSize  sparseAddressSpaceSize
	 */ 
	 private static native long sparseAddressSpaceSize0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->sparseAddressSpaceSize);
	 */

	/**
	 * native SET method for field maxBoundDescriptorSets	[int]<br>
	 * Prototype: uint32_t  maxBoundDescriptorSets
	 */ 
	 private static native void maxBoundDescriptorSets0(Buffer ptr, int _maxBoundDescriptorSets);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxBoundDescriptorSets = (uint32_t) (_maxBoundDescriptorSets);
	  */

	/**
	 * native GET method for field maxBoundDescriptorSets	[int]<br>
	 * Prototype: uint32_t  maxBoundDescriptorSets
	 */ 
	 private static native int maxBoundDescriptorSets0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxBoundDescriptorSets);
	 */

	/**
	 * native SET method for field maxPerStageDescriptorSamplers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSamplers
	 */ 
	 private static native void maxPerStageDescriptorSamplers0(Buffer ptr, int _maxPerStageDescriptorSamplers);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxPerStageDescriptorSamplers = (uint32_t) (_maxPerStageDescriptorSamplers);
	  */

	/**
	 * native GET method for field maxPerStageDescriptorSamplers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSamplers
	 */ 
	 private static native int maxPerStageDescriptorSamplers0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxPerStageDescriptorSamplers);
	 */

	/**
	 * native SET method for field maxPerStageDescriptorUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorUniformBuffers
	 */ 
	 private static native void maxPerStageDescriptorUniformBuffers0(Buffer ptr, int _maxPerStageDescriptorUniformBuffers);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxPerStageDescriptorUniformBuffers = (uint32_t) (_maxPerStageDescriptorUniformBuffers);
	  */

	/**
	 * native GET method for field maxPerStageDescriptorUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorUniformBuffers
	 */ 
	 private static native int maxPerStageDescriptorUniformBuffers0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxPerStageDescriptorUniformBuffers);
	 */

	/**
	 * native SET method for field maxPerStageDescriptorStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageBuffers
	 */ 
	 private static native void maxPerStageDescriptorStorageBuffers0(Buffer ptr, int _maxPerStageDescriptorStorageBuffers);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxPerStageDescriptorStorageBuffers = (uint32_t) (_maxPerStageDescriptorStorageBuffers);
	  */

	/**
	 * native GET method for field maxPerStageDescriptorStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageBuffers
	 */ 
	 private static native int maxPerStageDescriptorStorageBuffers0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxPerStageDescriptorStorageBuffers);
	 */

	/**
	 * native SET method for field maxPerStageDescriptorSampledImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSampledImages
	 */ 
	 private static native void maxPerStageDescriptorSampledImages0(Buffer ptr, int _maxPerStageDescriptorSampledImages);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxPerStageDescriptorSampledImages = (uint32_t) (_maxPerStageDescriptorSampledImages);
	  */

	/**
	 * native GET method for field maxPerStageDescriptorSampledImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSampledImages
	 */ 
	 private static native int maxPerStageDescriptorSampledImages0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxPerStageDescriptorSampledImages);
	 */

	/**
	 * native SET method for field maxPerStageDescriptorStorageImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageImages
	 */ 
	 private static native void maxPerStageDescriptorStorageImages0(Buffer ptr, int _maxPerStageDescriptorStorageImages);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxPerStageDescriptorStorageImages = (uint32_t) (_maxPerStageDescriptorStorageImages);
	  */

	/**
	 * native GET method for field maxPerStageDescriptorStorageImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageImages
	 */ 
	 private static native int maxPerStageDescriptorStorageImages0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxPerStageDescriptorStorageImages);
	 */

	/**
	 * native SET method for field maxPerStageDescriptorInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorInputAttachments
	 */ 
	 private static native void maxPerStageDescriptorInputAttachments0(Buffer ptr, int _maxPerStageDescriptorInputAttachments);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxPerStageDescriptorInputAttachments = (uint32_t) (_maxPerStageDescriptorInputAttachments);
	  */

	/**
	 * native GET method for field maxPerStageDescriptorInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorInputAttachments
	 */ 
	 private static native int maxPerStageDescriptorInputAttachments0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxPerStageDescriptorInputAttachments);
	 */

	/**
	 * native SET method for field maxPerStageResources	[int]<br>
	 * Prototype: uint32_t  maxPerStageResources
	 */ 
	 private static native void maxPerStageResources0(Buffer ptr, int _maxPerStageResources);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxPerStageResources = (uint32_t) (_maxPerStageResources);
	  */

	/**
	 * native GET method for field maxPerStageResources	[int]<br>
	 * Prototype: uint32_t  maxPerStageResources
	 */ 
	 private static native int maxPerStageResources0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxPerStageResources);
	 */

	/**
	 * native SET method for field maxDescriptorSetSamplers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSamplers
	 */ 
	 private static native void maxDescriptorSetSamplers0(Buffer ptr, int _maxDescriptorSetSamplers);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDescriptorSetSamplers = (uint32_t) (_maxDescriptorSetSamplers);
	  */

	/**
	 * native GET method for field maxDescriptorSetSamplers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSamplers
	 */ 
	 private static native int maxDescriptorSetSamplers0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDescriptorSetSamplers);
	 */

	/**
	 * native SET method for field maxDescriptorSetUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffers
	 */ 
	 private static native void maxDescriptorSetUniformBuffers0(Buffer ptr, int _maxDescriptorSetUniformBuffers);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDescriptorSetUniformBuffers = (uint32_t) (_maxDescriptorSetUniformBuffers);
	  */

	/**
	 * native GET method for field maxDescriptorSetUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffers
	 */ 
	 private static native int maxDescriptorSetUniformBuffers0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDescriptorSetUniformBuffers);
	 */

	/**
	 * native SET method for field maxDescriptorSetUniformBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffersDynamic
	 */ 
	 private static native void maxDescriptorSetUniformBuffersDynamic0(Buffer ptr, int _maxDescriptorSetUniformBuffersDynamic);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDescriptorSetUniformBuffersDynamic = (uint32_t) (_maxDescriptorSetUniformBuffersDynamic);
	  */

	/**
	 * native GET method for field maxDescriptorSetUniformBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffersDynamic
	 */ 
	 private static native int maxDescriptorSetUniformBuffersDynamic0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDescriptorSetUniformBuffersDynamic);
	 */

	/**
	 * native SET method for field maxDescriptorSetStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffers
	 */ 
	 private static native void maxDescriptorSetStorageBuffers0(Buffer ptr, int _maxDescriptorSetStorageBuffers);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDescriptorSetStorageBuffers = (uint32_t) (_maxDescriptorSetStorageBuffers);
	  */

	/**
	 * native GET method for field maxDescriptorSetStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffers
	 */ 
	 private static native int maxDescriptorSetStorageBuffers0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDescriptorSetStorageBuffers);
	 */

	/**
	 * native SET method for field maxDescriptorSetStorageBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffersDynamic
	 */ 
	 private static native void maxDescriptorSetStorageBuffersDynamic0(Buffer ptr, int _maxDescriptorSetStorageBuffersDynamic);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDescriptorSetStorageBuffersDynamic = (uint32_t) (_maxDescriptorSetStorageBuffersDynamic);
	  */

	/**
	 * native GET method for field maxDescriptorSetStorageBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffersDynamic
	 */ 
	 private static native int maxDescriptorSetStorageBuffersDynamic0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDescriptorSetStorageBuffersDynamic);
	 */

	/**
	 * native SET method for field maxDescriptorSetSampledImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSampledImages
	 */ 
	 private static native void maxDescriptorSetSampledImages0(Buffer ptr, int _maxDescriptorSetSampledImages);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDescriptorSetSampledImages = (uint32_t) (_maxDescriptorSetSampledImages);
	  */

	/**
	 * native GET method for field maxDescriptorSetSampledImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSampledImages
	 */ 
	 private static native int maxDescriptorSetSampledImages0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDescriptorSetSampledImages);
	 */

	/**
	 * native SET method for field maxDescriptorSetStorageImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageImages
	 */ 
	 private static native void maxDescriptorSetStorageImages0(Buffer ptr, int _maxDescriptorSetStorageImages);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDescriptorSetStorageImages = (uint32_t) (_maxDescriptorSetStorageImages);
	  */

	/**
	 * native GET method for field maxDescriptorSetStorageImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageImages
	 */ 
	 private static native int maxDescriptorSetStorageImages0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDescriptorSetStorageImages);
	 */

	/**
	 * native SET method for field maxDescriptorSetInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetInputAttachments
	 */ 
	 private static native void maxDescriptorSetInputAttachments0(Buffer ptr, int _maxDescriptorSetInputAttachments);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDescriptorSetInputAttachments = (uint32_t) (_maxDescriptorSetInputAttachments);
	  */

	/**
	 * native GET method for field maxDescriptorSetInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetInputAttachments
	 */ 
	 private static native int maxDescriptorSetInputAttachments0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDescriptorSetInputAttachments);
	 */

	/**
	 * native SET method for field maxVertexInputAttributes	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributes
	 */ 
	 private static native void maxVertexInputAttributes0(Buffer ptr, int _maxVertexInputAttributes);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxVertexInputAttributes = (uint32_t) (_maxVertexInputAttributes);
	  */

	/**
	 * native GET method for field maxVertexInputAttributes	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributes
	 */ 
	 private static native int maxVertexInputAttributes0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxVertexInputAttributes);
	 */

	/**
	 * native SET method for field maxVertexInputBindings	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindings
	 */ 
	 private static native void maxVertexInputBindings0(Buffer ptr, int _maxVertexInputBindings);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxVertexInputBindings = (uint32_t) (_maxVertexInputBindings);
	  */

	/**
	 * native GET method for field maxVertexInputBindings	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindings
	 */ 
	 private static native int maxVertexInputBindings0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxVertexInputBindings);
	 */

	/**
	 * native SET method for field maxVertexInputAttributeOffset	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributeOffset
	 */ 
	 private static native void maxVertexInputAttributeOffset0(Buffer ptr, int _maxVertexInputAttributeOffset);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxVertexInputAttributeOffset = (uint32_t) (_maxVertexInputAttributeOffset);
	  */

	/**
	 * native GET method for field maxVertexInputAttributeOffset	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributeOffset
	 */ 
	 private static native int maxVertexInputAttributeOffset0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxVertexInputAttributeOffset);
	 */

	/**
	 * native SET method for field maxVertexInputBindingStride	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindingStride
	 */ 
	 private static native void maxVertexInputBindingStride0(Buffer ptr, int _maxVertexInputBindingStride);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxVertexInputBindingStride = (uint32_t) (_maxVertexInputBindingStride);
	  */

	/**
	 * native GET method for field maxVertexInputBindingStride	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindingStride
	 */ 
	 private static native int maxVertexInputBindingStride0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxVertexInputBindingStride);
	 */

	/**
	 * native SET method for field maxVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxVertexOutputComponents
	 */ 
	 private static native void maxVertexOutputComponents0(Buffer ptr, int _maxVertexOutputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxVertexOutputComponents = (uint32_t) (_maxVertexOutputComponents);
	  */

	/**
	 * native GET method for field maxVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxVertexOutputComponents
	 */ 
	 private static native int maxVertexOutputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxVertexOutputComponents);
	 */

	/**
	 * native SET method for field maxTessellationGenerationLevel	[int]<br>
	 * Prototype: uint32_t  maxTessellationGenerationLevel
	 */ 
	 private static native void maxTessellationGenerationLevel0(Buffer ptr, int _maxTessellationGenerationLevel);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTessellationGenerationLevel = (uint32_t) (_maxTessellationGenerationLevel);
	  */

	/**
	 * native GET method for field maxTessellationGenerationLevel	[int]<br>
	 * Prototype: uint32_t  maxTessellationGenerationLevel
	 */ 
	 private static native int maxTessellationGenerationLevel0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTessellationGenerationLevel);
	 */

	/**
	 * native SET method for field maxTessellationPatchSize	[int]<br>
	 * Prototype: uint32_t  maxTessellationPatchSize
	 */ 
	 private static native void maxTessellationPatchSize0(Buffer ptr, int _maxTessellationPatchSize);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTessellationPatchSize = (uint32_t) (_maxTessellationPatchSize);
	  */

	/**
	 * native GET method for field maxTessellationPatchSize	[int]<br>
	 * Prototype: uint32_t  maxTessellationPatchSize
	 */ 
	 private static native int maxTessellationPatchSize0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTessellationPatchSize);
	 */

	/**
	 * native SET method for field maxTessellationControlPerVertexInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexInputComponents
	 */ 
	 private static native void maxTessellationControlPerVertexInputComponents0(Buffer ptr, int _maxTessellationControlPerVertexInputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTessellationControlPerVertexInputComponents = (uint32_t) (_maxTessellationControlPerVertexInputComponents);
	  */

	/**
	 * native GET method for field maxTessellationControlPerVertexInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexInputComponents
	 */ 
	 private static native int maxTessellationControlPerVertexInputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTessellationControlPerVertexInputComponents);
	 */

	/**
	 * native SET method for field maxTessellationControlPerVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexOutputComponents
	 */ 
	 private static native void maxTessellationControlPerVertexOutputComponents0(Buffer ptr, int _maxTessellationControlPerVertexOutputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTessellationControlPerVertexOutputComponents = (uint32_t) (_maxTessellationControlPerVertexOutputComponents);
	  */

	/**
	 * native GET method for field maxTessellationControlPerVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexOutputComponents
	 */ 
	 private static native int maxTessellationControlPerVertexOutputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTessellationControlPerVertexOutputComponents);
	 */

	/**
	 * native SET method for field maxTessellationControlPerPatchOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerPatchOutputComponents
	 */ 
	 private static native void maxTessellationControlPerPatchOutputComponents0(Buffer ptr, int _maxTessellationControlPerPatchOutputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTessellationControlPerPatchOutputComponents = (uint32_t) (_maxTessellationControlPerPatchOutputComponents);
	  */

	/**
	 * native GET method for field maxTessellationControlPerPatchOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerPatchOutputComponents
	 */ 
	 private static native int maxTessellationControlPerPatchOutputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTessellationControlPerPatchOutputComponents);
	 */

	/**
	 * native SET method for field maxTessellationControlTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlTotalOutputComponents
	 */ 
	 private static native void maxTessellationControlTotalOutputComponents0(Buffer ptr, int _maxTessellationControlTotalOutputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTessellationControlTotalOutputComponents = (uint32_t) (_maxTessellationControlTotalOutputComponents);
	  */

	/**
	 * native GET method for field maxTessellationControlTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlTotalOutputComponents
	 */ 
	 private static native int maxTessellationControlTotalOutputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTessellationControlTotalOutputComponents);
	 */

	/**
	 * native SET method for field maxTessellationEvaluationInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationInputComponents
	 */ 
	 private static native void maxTessellationEvaluationInputComponents0(Buffer ptr, int _maxTessellationEvaluationInputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTessellationEvaluationInputComponents = (uint32_t) (_maxTessellationEvaluationInputComponents);
	  */

	/**
	 * native GET method for field maxTessellationEvaluationInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationInputComponents
	 */ 
	 private static native int maxTessellationEvaluationInputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTessellationEvaluationInputComponents);
	 */

	/**
	 * native SET method for field maxTessellationEvaluationOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationOutputComponents
	 */ 
	 private static native void maxTessellationEvaluationOutputComponents0(Buffer ptr, int _maxTessellationEvaluationOutputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTessellationEvaluationOutputComponents = (uint32_t) (_maxTessellationEvaluationOutputComponents);
	  */

	/**
	 * native GET method for field maxTessellationEvaluationOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationOutputComponents
	 */ 
	 private static native int maxTessellationEvaluationOutputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTessellationEvaluationOutputComponents);
	 */

	/**
	 * native SET method for field maxGeometryShaderInvocations	[int]<br>
	 * Prototype: uint32_t  maxGeometryShaderInvocations
	 */ 
	 private static native void maxGeometryShaderInvocations0(Buffer ptr, int _maxGeometryShaderInvocations);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxGeometryShaderInvocations = (uint32_t) (_maxGeometryShaderInvocations);
	  */

	/**
	 * native GET method for field maxGeometryShaderInvocations	[int]<br>
	 * Prototype: uint32_t  maxGeometryShaderInvocations
	 */ 
	 private static native int maxGeometryShaderInvocations0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxGeometryShaderInvocations);
	 */

	/**
	 * native SET method for field maxGeometryInputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryInputComponents
	 */ 
	 private static native void maxGeometryInputComponents0(Buffer ptr, int _maxGeometryInputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxGeometryInputComponents = (uint32_t) (_maxGeometryInputComponents);
	  */

	/**
	 * native GET method for field maxGeometryInputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryInputComponents
	 */ 
	 private static native int maxGeometryInputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxGeometryInputComponents);
	 */

	/**
	 * native SET method for field maxGeometryOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputComponents
	 */ 
	 private static native void maxGeometryOutputComponents0(Buffer ptr, int _maxGeometryOutputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxGeometryOutputComponents = (uint32_t) (_maxGeometryOutputComponents);
	  */

	/**
	 * native GET method for field maxGeometryOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputComponents
	 */ 
	 private static native int maxGeometryOutputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxGeometryOutputComponents);
	 */

	/**
	 * native SET method for field maxGeometryOutputVertices	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputVertices
	 */ 
	 private static native void maxGeometryOutputVertices0(Buffer ptr, int _maxGeometryOutputVertices);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxGeometryOutputVertices = (uint32_t) (_maxGeometryOutputVertices);
	  */

	/**
	 * native GET method for field maxGeometryOutputVertices	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputVertices
	 */ 
	 private static native int maxGeometryOutputVertices0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxGeometryOutputVertices);
	 */

	/**
	 * native SET method for field maxGeometryTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryTotalOutputComponents
	 */ 
	 private static native void maxGeometryTotalOutputComponents0(Buffer ptr, int _maxGeometryTotalOutputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxGeometryTotalOutputComponents = (uint32_t) (_maxGeometryTotalOutputComponents);
	  */

	/**
	 * native GET method for field maxGeometryTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryTotalOutputComponents
	 */ 
	 private static native int maxGeometryTotalOutputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxGeometryTotalOutputComponents);
	 */

	/**
	 * native SET method for field maxFragmentInputComponents	[int]<br>
	 * Prototype: uint32_t  maxFragmentInputComponents
	 */ 
	 private static native void maxFragmentInputComponents0(Buffer ptr, int _maxFragmentInputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxFragmentInputComponents = (uint32_t) (_maxFragmentInputComponents);
	  */

	/**
	 * native GET method for field maxFragmentInputComponents	[int]<br>
	 * Prototype: uint32_t  maxFragmentInputComponents
	 */ 
	 private static native int maxFragmentInputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxFragmentInputComponents);
	 */

	/**
	 * native SET method for field maxFragmentOutputAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentOutputAttachments
	 */ 
	 private static native void maxFragmentOutputAttachments0(Buffer ptr, int _maxFragmentOutputAttachments);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxFragmentOutputAttachments = (uint32_t) (_maxFragmentOutputAttachments);
	  */

	/**
	 * native GET method for field maxFragmentOutputAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentOutputAttachments
	 */ 
	 private static native int maxFragmentOutputAttachments0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxFragmentOutputAttachments);
	 */

	/**
	 * native SET method for field maxFragmentDualSrcAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentDualSrcAttachments
	 */ 
	 private static native void maxFragmentDualSrcAttachments0(Buffer ptr, int _maxFragmentDualSrcAttachments);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxFragmentDualSrcAttachments = (uint32_t) (_maxFragmentDualSrcAttachments);
	  */

	/**
	 * native GET method for field maxFragmentDualSrcAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentDualSrcAttachments
	 */ 
	 private static native int maxFragmentDualSrcAttachments0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxFragmentDualSrcAttachments);
	 */

	/**
	 * native SET method for field maxFragmentCombinedOutputResources	[int]<br>
	 * Prototype: uint32_t  maxFragmentCombinedOutputResources
	 */ 
	 private static native void maxFragmentCombinedOutputResources0(Buffer ptr, int _maxFragmentCombinedOutputResources);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxFragmentCombinedOutputResources = (uint32_t) (_maxFragmentCombinedOutputResources);
	  */

	/**
	 * native GET method for field maxFragmentCombinedOutputResources	[int]<br>
	 * Prototype: uint32_t  maxFragmentCombinedOutputResources
	 */ 
	 private static native int maxFragmentCombinedOutputResources0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxFragmentCombinedOutputResources);
	 */

	/**
	 * native SET method for field maxComputeSharedMemorySize	[int]<br>
	 * Prototype: uint32_t  maxComputeSharedMemorySize
	 */ 
	 private static native void maxComputeSharedMemorySize0(Buffer ptr, int _maxComputeSharedMemorySize);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxComputeSharedMemorySize = (uint32_t) (_maxComputeSharedMemorySize);
	  */

	/**
	 * native GET method for field maxComputeSharedMemorySize	[int]<br>
	 * Prototype: uint32_t  maxComputeSharedMemorySize
	 */ 
	 private static native int maxComputeSharedMemorySize0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxComputeSharedMemorySize);
	 */

	/**
	 * native SET method for field maxComputeWorkGroupCount	[int_array]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupCount
	 */ 
	 private static native void maxComputeWorkGroupCount0(Buffer ptr, int[] _maxComputeWorkGroupCount);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxComputeWorkGroupCount = (uint32_t[]) (_maxComputeWorkGroupCount);
	  */

	/**
	 * native GET method for field maxComputeWorkGroupCount	[int_array]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupCount
	 */ 
	 private static native int[] maxComputeWorkGroupCount0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (int[]) (vkObj->maxComputeWorkGroupCount);
	 */

	/**
	 * native SET method for field maxComputeWorkGroupInvocations	[int]<br>
	 * Prototype: uint32_t  maxComputeWorkGroupInvocations
	 */ 
	 private static native void maxComputeWorkGroupInvocations0(Buffer ptr, int _maxComputeWorkGroupInvocations);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxComputeWorkGroupInvocations = (uint32_t) (_maxComputeWorkGroupInvocations);
	  */

	/**
	 * native GET method for field maxComputeWorkGroupInvocations	[int]<br>
	 * Prototype: uint32_t  maxComputeWorkGroupInvocations
	 */ 
	 private static native int maxComputeWorkGroupInvocations0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxComputeWorkGroupInvocations);
	 */

	/**
	 * native SET method for field maxComputeWorkGroupSize	[int_array]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupSize
	 */ 
	 private static native void maxComputeWorkGroupSize0(Buffer ptr, int[] _maxComputeWorkGroupSize);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxComputeWorkGroupSize = (uint32_t[]) (_maxComputeWorkGroupSize);
	  */

	/**
	 * native GET method for field maxComputeWorkGroupSize	[int_array]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupSize
	 */ 
	 private static native int[] maxComputeWorkGroupSize0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (int[]) (vkObj->maxComputeWorkGroupSize);
	 */

	/**
	 * native SET method for field subPixelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subPixelPrecisionBits
	 */ 
	 private static native void subPixelPrecisionBits0(Buffer ptr, int _subPixelPrecisionBits);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->subPixelPrecisionBits = (uint32_t) (_subPixelPrecisionBits);
	  */

	/**
	 * native GET method for field subPixelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subPixelPrecisionBits
	 */ 
	 private static native int subPixelPrecisionBits0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->subPixelPrecisionBits);
	 */

	/**
	 * native SET method for field subTexelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subTexelPrecisionBits
	 */ 
	 private static native void subTexelPrecisionBits0(Buffer ptr, int _subTexelPrecisionBits);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->subTexelPrecisionBits = (uint32_t) (_subTexelPrecisionBits);
	  */

	/**
	 * native GET method for field subTexelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subTexelPrecisionBits
	 */ 
	 private static native int subTexelPrecisionBits0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->subTexelPrecisionBits);
	 */

	/**
	 * native SET method for field mipmapPrecisionBits	[int]<br>
	 * Prototype: uint32_t  mipmapPrecisionBits
	 */ 
	 private static native void mipmapPrecisionBits0(Buffer ptr, int _mipmapPrecisionBits);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->mipmapPrecisionBits = (uint32_t) (_mipmapPrecisionBits);
	  */

	/**
	 * native GET method for field mipmapPrecisionBits	[int]<br>
	 * Prototype: uint32_t  mipmapPrecisionBits
	 */ 
	 private static native int mipmapPrecisionBits0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->mipmapPrecisionBits);
	 */

	/**
	 * native SET method for field maxDrawIndexedIndexValue	[int]<br>
	 * Prototype: uint32_t  maxDrawIndexedIndexValue
	 */ 
	 private static native void maxDrawIndexedIndexValue0(Buffer ptr, int _maxDrawIndexedIndexValue);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDrawIndexedIndexValue = (uint32_t) (_maxDrawIndexedIndexValue);
	  */

	/**
	 * native GET method for field maxDrawIndexedIndexValue	[int]<br>
	 * Prototype: uint32_t  maxDrawIndexedIndexValue
	 */ 
	 private static native int maxDrawIndexedIndexValue0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDrawIndexedIndexValue);
	 */

	/**
	 * native SET method for field maxDrawIndirectCount	[int]<br>
	 * Prototype: uint32_t  maxDrawIndirectCount
	 */ 
	 private static native void maxDrawIndirectCount0(Buffer ptr, int _maxDrawIndirectCount);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDrawIndirectCount = (uint32_t) (_maxDrawIndirectCount);
	  */

	/**
	 * native GET method for field maxDrawIndirectCount	[int]<br>
	 * Prototype: uint32_t  maxDrawIndirectCount
	 */ 
	 private static native int maxDrawIndirectCount0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDrawIndirectCount);
	 */

	/**
	 * native SET method for field maxSamplerLodBias	[float]<br>
	 * Prototype: float  maxSamplerLodBias
	 */ 
	 private static native void maxSamplerLodBias0(Buffer ptr, float _maxSamplerLodBias);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxSamplerLodBias = (float) (_maxSamplerLodBias);
	  */

	/**
	 * native GET method for field maxSamplerLodBias	[float]<br>
	 * Prototype: float  maxSamplerLodBias
	 */ 
	 private static native float maxSamplerLodBias0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jfloat) (vkObj->maxSamplerLodBias);
	 */

	/**
	 * native SET method for field maxSamplerAnisotropy	[float]<br>
	 * Prototype: float  maxSamplerAnisotropy
	 */ 
	 private static native void maxSamplerAnisotropy0(Buffer ptr, float _maxSamplerAnisotropy);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxSamplerAnisotropy = (float) (_maxSamplerAnisotropy);
	  */

	/**
	 * native GET method for field maxSamplerAnisotropy	[float]<br>
	 * Prototype: float  maxSamplerAnisotropy
	 */ 
	 private static native float maxSamplerAnisotropy0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jfloat) (vkObj->maxSamplerAnisotropy);
	 */

	/**
	 * native SET method for field maxViewports	[int]<br>
	 * Prototype: uint32_t  maxViewports
	 */ 
	 private static native void maxViewports0(Buffer ptr, int _maxViewports);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxViewports = (uint32_t) (_maxViewports);
	  */

	/**
	 * native GET method for field maxViewports	[int]<br>
	 * Prototype: uint32_t  maxViewports
	 */ 
	 private static native int maxViewports0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxViewports);
	 */

	/**
	 * native SET method for field maxViewportDimensions	[int_array]<br>
	 * Prototype: uint32_t[]  maxViewportDimensions
	 */ 
	 private static native void maxViewportDimensions0(Buffer ptr, int[] _maxViewportDimensions);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxViewportDimensions = (uint32_t[]) (_maxViewportDimensions);
	  */

	/**
	 * native GET method for field maxViewportDimensions	[int_array]<br>
	 * Prototype: uint32_t[]  maxViewportDimensions
	 */ 
	 private static native int[] maxViewportDimensions0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (int[]) (vkObj->maxViewportDimensions);
	 */

	/**
	 * native SET method for field viewportBoundsRange	[float_array]<br>
	 * Prototype: float[]  viewportBoundsRange
	 */ 
	 private static native void viewportBoundsRange0(Buffer ptr, float[] _viewportBoundsRange);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->viewportBoundsRange = (float[]) (_viewportBoundsRange);
	  */

	/**
	 * native GET method for field viewportBoundsRange	[float_array]<br>
	 * Prototype: float[]  viewportBoundsRange
	 */ 
	 private static native float[] viewportBoundsRange0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (float[]) (vkObj->viewportBoundsRange);
	 */

	/**
	 * native SET method for field viewportSubPixelBits	[int]<br>
	 * Prototype: uint32_t  viewportSubPixelBits
	 */ 
	 private static native void viewportSubPixelBits0(Buffer ptr, int _viewportSubPixelBits);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->viewportSubPixelBits = (uint32_t) (_viewportSubPixelBits);
	  */

	/**
	 * native GET method for field viewportSubPixelBits	[int]<br>
	 * Prototype: uint32_t  viewportSubPixelBits
	 */ 
	 private static native int viewportSubPixelBits0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->viewportSubPixelBits);
	 */

	/**
	 * native SET method for field minMemoryMapAlignment	[long]<br>
	 * Prototype: size_t  minMemoryMapAlignment
	 */ 
	 private static native void minMemoryMapAlignment0(Buffer ptr, long _minMemoryMapAlignment);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->minMemoryMapAlignment = (size_t) (_minMemoryMapAlignment);
	  */

	/**
	 * native GET method for field minMemoryMapAlignment	[long]<br>
	 * Prototype: size_t  minMemoryMapAlignment
	 */ 
	 private static native long minMemoryMapAlignment0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->minMemoryMapAlignment);
	 */

	/**
	 * native SET method for field minTexelBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minTexelBufferOffsetAlignment
	 */ 
	 private static native void minTexelBufferOffsetAlignment0(Buffer ptr, long _minTexelBufferOffsetAlignment);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->minTexelBufferOffsetAlignment = (VkDeviceSize) (_minTexelBufferOffsetAlignment);
	  */

	/**
	 * native GET method for field minTexelBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minTexelBufferOffsetAlignment
	 */ 
	 private static native long minTexelBufferOffsetAlignment0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->minTexelBufferOffsetAlignment);
	 */

	/**
	 * native SET method for field minUniformBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minUniformBufferOffsetAlignment
	 */ 
	 private static native void minUniformBufferOffsetAlignment0(Buffer ptr, long _minUniformBufferOffsetAlignment);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->minUniformBufferOffsetAlignment = (VkDeviceSize) (_minUniformBufferOffsetAlignment);
	  */

	/**
	 * native GET method for field minUniformBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minUniformBufferOffsetAlignment
	 */ 
	 private static native long minUniformBufferOffsetAlignment0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->minUniformBufferOffsetAlignment);
	 */

	/**
	 * native SET method for field minStorageBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minStorageBufferOffsetAlignment
	 */ 
	 private static native void minStorageBufferOffsetAlignment0(Buffer ptr, long _minStorageBufferOffsetAlignment);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->minStorageBufferOffsetAlignment = (VkDeviceSize) (_minStorageBufferOffsetAlignment);
	  */

	/**
	 * native GET method for field minStorageBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minStorageBufferOffsetAlignment
	 */ 
	 private static native long minStorageBufferOffsetAlignment0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->minStorageBufferOffsetAlignment);
	 */

	/**
	 * native SET method for field minTexelOffset	[int]<br>
	 * Prototype: int32_t  minTexelOffset
	 */ 
	 private static native void minTexelOffset0(Buffer ptr, int _minTexelOffset);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->minTexelOffset = (int32_t) (_minTexelOffset);
	  */

	/**
	 * native GET method for field minTexelOffset	[int]<br>
	 * Prototype: int32_t  minTexelOffset
	 */ 
	 private static native int minTexelOffset0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->minTexelOffset);
	 */

	/**
	 * native SET method for field maxTexelOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelOffset
	 */ 
	 private static native void maxTexelOffset0(Buffer ptr, int _maxTexelOffset);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTexelOffset = (uint32_t) (_maxTexelOffset);
	  */

	/**
	 * native GET method for field maxTexelOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelOffset
	 */ 
	 private static native int maxTexelOffset0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTexelOffset);
	 */

	/**
	 * native SET method for field minTexelGatherOffset	[int]<br>
	 * Prototype: int32_t  minTexelGatherOffset
	 */ 
	 private static native void minTexelGatherOffset0(Buffer ptr, int _minTexelGatherOffset);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->minTexelGatherOffset = (int32_t) (_minTexelGatherOffset);
	  */

	/**
	 * native GET method for field minTexelGatherOffset	[int]<br>
	 * Prototype: int32_t  minTexelGatherOffset
	 */ 
	 private static native int minTexelGatherOffset0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->minTexelGatherOffset);
	 */

	/**
	 * native SET method for field maxTexelGatherOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelGatherOffset
	 */ 
	 private static native void maxTexelGatherOffset0(Buffer ptr, int _maxTexelGatherOffset);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTexelGatherOffset = (uint32_t) (_maxTexelGatherOffset);
	  */

	/**
	 * native GET method for field maxTexelGatherOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelGatherOffset
	 */ 
	 private static native int maxTexelGatherOffset0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTexelGatherOffset);
	 */

	/**
	 * native SET method for field minInterpolationOffset	[float]<br>
	 * Prototype: float  minInterpolationOffset
	 */ 
	 private static native void minInterpolationOffset0(Buffer ptr, float _minInterpolationOffset);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->minInterpolationOffset = (float) (_minInterpolationOffset);
	  */

	/**
	 * native GET method for field minInterpolationOffset	[float]<br>
	 * Prototype: float  minInterpolationOffset
	 */ 
	 private static native float minInterpolationOffset0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jfloat) (vkObj->minInterpolationOffset);
	 */

	/**
	 * native SET method for field maxInterpolationOffset	[float]<br>
	 * Prototype: float  maxInterpolationOffset
	 */ 
	 private static native void maxInterpolationOffset0(Buffer ptr, float _maxInterpolationOffset);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxInterpolationOffset = (float) (_maxInterpolationOffset);
	  */

	/**
	 * native GET method for field maxInterpolationOffset	[float]<br>
	 * Prototype: float  maxInterpolationOffset
	 */ 
	 private static native float maxInterpolationOffset0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jfloat) (vkObj->maxInterpolationOffset);
	 */

	/**
	 * native SET method for field subPixelInterpolationOffsetBits	[int]<br>
	 * Prototype: uint32_t  subPixelInterpolationOffsetBits
	 */ 
	 private static native void subPixelInterpolationOffsetBits0(Buffer ptr, int _subPixelInterpolationOffsetBits);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->subPixelInterpolationOffsetBits = (uint32_t) (_subPixelInterpolationOffsetBits);
	  */

	/**
	 * native GET method for field subPixelInterpolationOffsetBits	[int]<br>
	 * Prototype: uint32_t  subPixelInterpolationOffsetBits
	 */ 
	 private static native int subPixelInterpolationOffsetBits0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->subPixelInterpolationOffsetBits);
	 */

	/**
	 * native SET method for field maxFramebufferWidth	[int]<br>
	 * Prototype: uint32_t  maxFramebufferWidth
	 */ 
	 private static native void maxFramebufferWidth0(Buffer ptr, int _maxFramebufferWidth);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxFramebufferWidth = (uint32_t) (_maxFramebufferWidth);
	  */

	/**
	 * native GET method for field maxFramebufferWidth	[int]<br>
	 * Prototype: uint32_t  maxFramebufferWidth
	 */ 
	 private static native int maxFramebufferWidth0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxFramebufferWidth);
	 */

	/**
	 * native SET method for field maxFramebufferHeight	[int]<br>
	 * Prototype: uint32_t  maxFramebufferHeight
	 */ 
	 private static native void maxFramebufferHeight0(Buffer ptr, int _maxFramebufferHeight);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxFramebufferHeight = (uint32_t) (_maxFramebufferHeight);
	  */

	/**
	 * native GET method for field maxFramebufferHeight	[int]<br>
	 * Prototype: uint32_t  maxFramebufferHeight
	 */ 
	 private static native int maxFramebufferHeight0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxFramebufferHeight);
	 */

	/**
	 * native SET method for field maxFramebufferLayers	[int]<br>
	 * Prototype: uint32_t  maxFramebufferLayers
	 */ 
	 private static native void maxFramebufferLayers0(Buffer ptr, int _maxFramebufferLayers);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxFramebufferLayers = (uint32_t) (_maxFramebufferLayers);
	  */

	/**
	 * native GET method for field maxFramebufferLayers	[int]<br>
	 * Prototype: uint32_t  maxFramebufferLayers
	 */ 
	 private static native int maxFramebufferLayers0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxFramebufferLayers);
	 */

	/**
	 * native SET method for field framebufferColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferColorSampleCounts
	 */ 
	 private static native void framebufferColorSampleCounts0(Buffer ptr, int _framebufferColorSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->framebufferColorSampleCounts = (VkSampleCountFlags) (_framebufferColorSampleCounts);
	  */

	/**
	 * native GET method for field framebufferColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferColorSampleCounts
	 */ 
	 private static native int framebufferColorSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->framebufferColorSampleCounts);
	 */

	/**
	 * native SET method for field framebufferDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferDepthSampleCounts
	 */ 
	 private static native void framebufferDepthSampleCounts0(Buffer ptr, int _framebufferDepthSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->framebufferDepthSampleCounts = (VkSampleCountFlags) (_framebufferDepthSampleCounts);
	  */

	/**
	 * native GET method for field framebufferDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferDepthSampleCounts
	 */ 
	 private static native int framebufferDepthSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->framebufferDepthSampleCounts);
	 */

	/**
	 * native SET method for field framebufferStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferStencilSampleCounts
	 */ 
	 private static native void framebufferStencilSampleCounts0(Buffer ptr, int _framebufferStencilSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->framebufferStencilSampleCounts = (VkSampleCountFlags) (_framebufferStencilSampleCounts);
	  */

	/**
	 * native GET method for field framebufferStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferStencilSampleCounts
	 */ 
	 private static native int framebufferStencilSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->framebufferStencilSampleCounts);
	 */

	/**
	 * native SET method for field framebufferNoAttachmentsSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferNoAttachmentsSampleCounts
	 */ 
	 private static native void framebufferNoAttachmentsSampleCounts0(Buffer ptr, int _framebufferNoAttachmentsSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->framebufferNoAttachmentsSampleCounts = (VkSampleCountFlags) (_framebufferNoAttachmentsSampleCounts);
	  */

	/**
	 * native GET method for field framebufferNoAttachmentsSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferNoAttachmentsSampleCounts
	 */ 
	 private static native int framebufferNoAttachmentsSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->framebufferNoAttachmentsSampleCounts);
	 */

	/**
	 * native SET method for field maxColorAttachments	[int]<br>
	 * Prototype: uint32_t  maxColorAttachments
	 */ 
	 private static native void maxColorAttachments0(Buffer ptr, int _maxColorAttachments);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxColorAttachments = (uint32_t) (_maxColorAttachments);
	  */

	/**
	 * native GET method for field maxColorAttachments	[int]<br>
	 * Prototype: uint32_t  maxColorAttachments
	 */ 
	 private static native int maxColorAttachments0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxColorAttachments);
	 */

	/**
	 * native SET method for field sampledImageColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageColorSampleCounts
	 */ 
	 private static native void sampledImageColorSampleCounts0(Buffer ptr, int _sampledImageColorSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->sampledImageColorSampleCounts = (VkSampleCountFlags) (_sampledImageColorSampleCounts);
	  */

	/**
	 * native GET method for field sampledImageColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageColorSampleCounts
	 */ 
	 private static native int sampledImageColorSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->sampledImageColorSampleCounts);
	 */

	/**
	 * native SET method for field sampledImageIntegerSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageIntegerSampleCounts
	 */ 
	 private static native void sampledImageIntegerSampleCounts0(Buffer ptr, int _sampledImageIntegerSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->sampledImageIntegerSampleCounts = (VkSampleCountFlags) (_sampledImageIntegerSampleCounts);
	  */

	/**
	 * native GET method for field sampledImageIntegerSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageIntegerSampleCounts
	 */ 
	 private static native int sampledImageIntegerSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->sampledImageIntegerSampleCounts);
	 */

	/**
	 * native SET method for field sampledImageDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageDepthSampleCounts
	 */ 
	 private static native void sampledImageDepthSampleCounts0(Buffer ptr, int _sampledImageDepthSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->sampledImageDepthSampleCounts = (VkSampleCountFlags) (_sampledImageDepthSampleCounts);
	  */

	/**
	 * native GET method for field sampledImageDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageDepthSampleCounts
	 */ 
	 private static native int sampledImageDepthSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->sampledImageDepthSampleCounts);
	 */

	/**
	 * native SET method for field sampledImageStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageStencilSampleCounts
	 */ 
	 private static native void sampledImageStencilSampleCounts0(Buffer ptr, int _sampledImageStencilSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->sampledImageStencilSampleCounts = (VkSampleCountFlags) (_sampledImageStencilSampleCounts);
	  */

	/**
	 * native GET method for field sampledImageStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageStencilSampleCounts
	 */ 
	 private static native int sampledImageStencilSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->sampledImageStencilSampleCounts);
	 */

	/**
	 * native SET method for field storageImageSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  storageImageSampleCounts
	 */ 
	 private static native void storageImageSampleCounts0(Buffer ptr, int _storageImageSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->storageImageSampleCounts = (VkSampleCountFlags) (_storageImageSampleCounts);
	  */

	/**
	 * native GET method for field storageImageSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  storageImageSampleCounts
	 */ 
	 private static native int storageImageSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->storageImageSampleCounts);
	 */

	/**
	 * native SET method for field maxSampleMaskWords	[int]<br>
	 * Prototype: uint32_t  maxSampleMaskWords
	 */ 
	 private static native void maxSampleMaskWords0(Buffer ptr, int _maxSampleMaskWords);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxSampleMaskWords = (uint32_t) (_maxSampleMaskWords);
	  */

	/**
	 * native GET method for field maxSampleMaskWords	[int]<br>
	 * Prototype: uint32_t  maxSampleMaskWords
	 */ 
	 private static native int maxSampleMaskWords0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxSampleMaskWords);
	 */

	/**
	 * native SET method for field timestampComputeAndGraphics	[boolean]<br>
	 * Prototype: VkBool32  timestampComputeAndGraphics
	 */ 
	 private static native void timestampComputeAndGraphics0(Buffer ptr, boolean _timestampComputeAndGraphics);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->timestampComputeAndGraphics = (VkBool32) (_timestampComputeAndGraphics);
	  */

	/**
	 * native GET method for field timestampComputeAndGraphics	[boolean]<br>
	 * Prototype: VkBool32  timestampComputeAndGraphics
	 */ 
	 private static native boolean timestampComputeAndGraphics0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jboolean) (vkObj->timestampComputeAndGraphics);
	 */

	/**
	 * native SET method for field timestampPeriod	[float]<br>
	 * Prototype: float  timestampPeriod
	 */ 
	 private static native void timestampPeriod0(Buffer ptr, float _timestampPeriod);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->timestampPeriod = (float) (_timestampPeriod);
	  */

	/**
	 * native GET method for field timestampPeriod	[float]<br>
	 * Prototype: float  timestampPeriod
	 */ 
	 private static native float timestampPeriod0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jfloat) (vkObj->timestampPeriod);
	 */

	/**
	 * native SET method for field maxClipDistances	[int]<br>
	 * Prototype: uint32_t  maxClipDistances
	 */ 
	 private static native void maxClipDistances0(Buffer ptr, int _maxClipDistances);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxClipDistances = (uint32_t) (_maxClipDistances);
	  */

	/**
	 * native GET method for field maxClipDistances	[int]<br>
	 * Prototype: uint32_t  maxClipDistances
	 */ 
	 private static native int maxClipDistances0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxClipDistances);
	 */

	/**
	 * native SET method for field maxCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCullDistances
	 */ 
	 private static native void maxCullDistances0(Buffer ptr, int _maxCullDistances);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxCullDistances = (uint32_t) (_maxCullDistances);
	  */

	/**
	 * native GET method for field maxCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCullDistances
	 */ 
	 private static native int maxCullDistances0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxCullDistances);
	 */

	/**
	 * native SET method for field maxCombinedClipAndCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCombinedClipAndCullDistances
	 */ 
	 private static native void maxCombinedClipAndCullDistances0(Buffer ptr, int _maxCombinedClipAndCullDistances);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxCombinedClipAndCullDistances = (uint32_t) (_maxCombinedClipAndCullDistances);
	  */

	/**
	 * native GET method for field maxCombinedClipAndCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCombinedClipAndCullDistances
	 */ 
	 private static native int maxCombinedClipAndCullDistances0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxCombinedClipAndCullDistances);
	 */

	/**
	 * native SET method for field discreteQueuePriorities	[int]<br>
	 * Prototype: uint32_t  discreteQueuePriorities
	 */ 
	 private static native void discreteQueuePriorities0(Buffer ptr, int _discreteQueuePriorities);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->discreteQueuePriorities = (uint32_t) (_discreteQueuePriorities);
	  */

	/**
	 * native GET method for field discreteQueuePriorities	[int]<br>
	 * Prototype: uint32_t  discreteQueuePriorities
	 */ 
	 private static native int discreteQueuePriorities0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->discreteQueuePriorities);
	 */

	/**
	 * native SET method for field pointSizeRange	[float_array]<br>
	 * Prototype: float[]  pointSizeRange
	 */ 
	 private static native void pointSizeRange0(Buffer ptr, float[] _pointSizeRange);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->pointSizeRange = (float[]) (_pointSizeRange);
	  */

	/**
	 * native GET method for field pointSizeRange	[float_array]<br>
	 * Prototype: float[]  pointSizeRange
	 */ 
	 private static native float[] pointSizeRange0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (float[]) (vkObj->pointSizeRange);
	 */

	/**
	 * native SET method for field lineWidthRange	[float_array]<br>
	 * Prototype: float[]  lineWidthRange
	 */ 
	 private static native void lineWidthRange0(Buffer ptr, float[] _lineWidthRange);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->lineWidthRange = (float[]) (_lineWidthRange);
	  */

	/**
	 * native GET method for field lineWidthRange	[float_array]<br>
	 * Prototype: float[]  lineWidthRange
	 */ 
	 private static native float[] lineWidthRange0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (float[]) (vkObj->lineWidthRange);
	 */

	/**
	 * native SET method for field pointSizeGranularity	[float]<br>
	 * Prototype: float  pointSizeGranularity
	 */ 
	 private static native void pointSizeGranularity0(Buffer ptr, float _pointSizeGranularity);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->pointSizeGranularity = (float) (_pointSizeGranularity);
	  */

	/**
	 * native GET method for field pointSizeGranularity	[float]<br>
	 * Prototype: float  pointSizeGranularity
	 */ 
	 private static native float pointSizeGranularity0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jfloat) (vkObj->pointSizeGranularity);
	 */

	/**
	 * native SET method for field lineWidthGranularity	[float]<br>
	 * Prototype: float  lineWidthGranularity
	 */ 
	 private static native void lineWidthGranularity0(Buffer ptr, float _lineWidthGranularity);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->lineWidthGranularity = (float) (_lineWidthGranularity);
	  */

	/**
	 * native GET method for field lineWidthGranularity	[float]<br>
	 * Prototype: float  lineWidthGranularity
	 */ 
	 private static native float lineWidthGranularity0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jfloat) (vkObj->lineWidthGranularity);
	 */

	/**
	 * native SET method for field strictLines	[boolean]<br>
	 * Prototype: VkBool32  strictLines
	 */ 
	 private static native void strictLines0(Buffer ptr, boolean _strictLines);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->strictLines = (VkBool32) (_strictLines);
	  */

	/**
	 * native GET method for field strictLines	[boolean]<br>
	 * Prototype: VkBool32  strictLines
	 */ 
	 private static native boolean strictLines0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jboolean) (vkObj->strictLines);
	 */

	/**
	 * native SET method for field standardSampleLocations	[boolean]<br>
	 * Prototype: VkBool32  standardSampleLocations
	 */ 
	 private static native void standardSampleLocations0(Buffer ptr, boolean _standardSampleLocations);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->standardSampleLocations = (VkBool32) (_standardSampleLocations);
	  */

	/**
	 * native GET method for field standardSampleLocations	[boolean]<br>
	 * Prototype: VkBool32  standardSampleLocations
	 */ 
	 private static native boolean standardSampleLocations0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jboolean) (vkObj->standardSampleLocations);
	 */

	/**
	 * native SET method for field optimalBufferCopyOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyOffsetAlignment
	 */ 
	 private static native void optimalBufferCopyOffsetAlignment0(Buffer ptr, long _optimalBufferCopyOffsetAlignment);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->optimalBufferCopyOffsetAlignment = (VkDeviceSize) (_optimalBufferCopyOffsetAlignment);
	  */

	/**
	 * native GET method for field optimalBufferCopyOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyOffsetAlignment
	 */ 
	 private static native long optimalBufferCopyOffsetAlignment0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->optimalBufferCopyOffsetAlignment);
	 */

	/**
	 * native SET method for field optimalBufferCopyRowPitchAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyRowPitchAlignment
	 */ 
	 private static native void optimalBufferCopyRowPitchAlignment0(Buffer ptr, long _optimalBufferCopyRowPitchAlignment);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->optimalBufferCopyRowPitchAlignment = (VkDeviceSize) (_optimalBufferCopyRowPitchAlignment);
	  */

	/**
	 * native GET method for field optimalBufferCopyRowPitchAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyRowPitchAlignment
	 */ 
	 private static native long optimalBufferCopyRowPitchAlignment0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->optimalBufferCopyRowPitchAlignment);
	 */

	/**
	 * native SET method for field nonCoherentAtomSize	[long]<br>
	 * Prototype: VkDeviceSize  nonCoherentAtomSize
	 */ 
	 private static native void nonCoherentAtomSize0(Buffer ptr, long _nonCoherentAtomSize);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->nonCoherentAtomSize = (VkDeviceSize) (_nonCoherentAtomSize);
	  */

	/**
	 * native GET method for field nonCoherentAtomSize	[long]<br>
	 * Prototype: VkDeviceSize  nonCoherentAtomSize
	 */ 
	 private static native long nonCoherentAtomSize0(Buffer ptr);/*
		  VkPhysicalDeviceLimits vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->nonCoherentAtomSize);
	 */



} // end of class VkPhysicalDeviceLimits
