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
import java.util.Arrays;
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

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

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
	 public VkPhysicalDeviceLimits(long address , int memSize){ 
		 super(address, memSize); 
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
		 setMaxImageDimension1D0(this.ptr,  maxImageDimension1D);
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
	 */ 
	 public void maxImageDimension2D(int maxImageDimension2D){
		 this.maxImageDimension2D = maxImageDimension2D;
		 setMaxImageDimension2D0(this.ptr,  maxImageDimension2D);
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
	 */ 
	 public void maxImageDimension3D(int maxImageDimension3D){
		 this.maxImageDimension3D = maxImageDimension3D;
		 setMaxImageDimension3D0(this.ptr,  maxImageDimension3D);
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
	 */ 
	 public void maxImageDimensionCube(int maxImageDimensionCube){
		 this.maxImageDimensionCube = maxImageDimensionCube;
		 setMaxImageDimensionCube0(this.ptr,  maxImageDimensionCube);
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
	 */ 
	 public void maxImageArrayLayers(int maxImageArrayLayers){
		 this.maxImageArrayLayers = maxImageArrayLayers;
		 setMaxImageArrayLayers0(this.ptr,  maxImageArrayLayers);
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
	 */ 
	 public void maxTexelBufferElements(int maxTexelBufferElements){
		 this.maxTexelBufferElements = maxTexelBufferElements;
		 setMaxTexelBufferElements0(this.ptr,  maxTexelBufferElements);
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
	 */ 
	 public void maxUniformBufferRange(int maxUniformBufferRange){
		 this.maxUniformBufferRange = maxUniformBufferRange;
		 setMaxUniformBufferRange0(this.ptr,  maxUniformBufferRange);
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
	 */ 
	 public void maxStorageBufferRange(int maxStorageBufferRange){
		 this.maxStorageBufferRange = maxStorageBufferRange;
		 setMaxStorageBufferRange0(this.ptr,  maxStorageBufferRange);
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
	 */ 
	 public void maxPushConstantsSize(int maxPushConstantsSize){
		 this.maxPushConstantsSize = maxPushConstantsSize;
		 setMaxPushConstantsSize0(this.ptr,  maxPushConstantsSize);
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
	 */ 
	 public void maxMemoryAllocationCount(int maxMemoryAllocationCount){
		 this.maxMemoryAllocationCount = maxMemoryAllocationCount;
		 setMaxMemoryAllocationCount0(this.ptr,  maxMemoryAllocationCount);
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
	 */ 
	 public void maxSamplerAllocationCount(int maxSamplerAllocationCount){
		 this.maxSamplerAllocationCount = maxSamplerAllocationCount;
		 setMaxSamplerAllocationCount0(this.ptr,  maxSamplerAllocationCount);
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
	 */ 
	 public void bufferImageGranularity(long bufferImageGranularity){
		 this.bufferImageGranularity = bufferImageGranularity;
		 setBufferImageGranularity0(this.ptr,  bufferImageGranularity);
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
	 */ 
	 public void sparseAddressSpaceSize(long sparseAddressSpaceSize){
		 this.sparseAddressSpaceSize = sparseAddressSpaceSize;
		 setSparseAddressSpaceSize0(this.ptr,  sparseAddressSpaceSize);
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
	 */ 
	 public void maxBoundDescriptorSets(int maxBoundDescriptorSets){
		 this.maxBoundDescriptorSets = maxBoundDescriptorSets;
		 setMaxBoundDescriptorSets0(this.ptr,  maxBoundDescriptorSets);
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
	 */ 
	 public void maxPerStageDescriptorSamplers(int maxPerStageDescriptorSamplers){
		 this.maxPerStageDescriptorSamplers = maxPerStageDescriptorSamplers;
		 setMaxPerStageDescriptorSamplers0(this.ptr,  maxPerStageDescriptorSamplers);
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
	 */ 
	 public void maxPerStageDescriptorUniformBuffers(int maxPerStageDescriptorUniformBuffers){
		 this.maxPerStageDescriptorUniformBuffers = maxPerStageDescriptorUniformBuffers;
		 setMaxPerStageDescriptorUniformBuffers0(this.ptr,  maxPerStageDescriptorUniformBuffers);
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
	 */ 
	 public void maxPerStageDescriptorStorageBuffers(int maxPerStageDescriptorStorageBuffers){
		 this.maxPerStageDescriptorStorageBuffers = maxPerStageDescriptorStorageBuffers;
		 setMaxPerStageDescriptorStorageBuffers0(this.ptr,  maxPerStageDescriptorStorageBuffers);
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
	 */ 
	 public void maxPerStageDescriptorSampledImages(int maxPerStageDescriptorSampledImages){
		 this.maxPerStageDescriptorSampledImages = maxPerStageDescriptorSampledImages;
		 setMaxPerStageDescriptorSampledImages0(this.ptr,  maxPerStageDescriptorSampledImages);
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
	 */ 
	 public void maxPerStageDescriptorStorageImages(int maxPerStageDescriptorStorageImages){
		 this.maxPerStageDescriptorStorageImages = maxPerStageDescriptorStorageImages;
		 setMaxPerStageDescriptorStorageImages0(this.ptr,  maxPerStageDescriptorStorageImages);
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
	 */ 
	 public void maxPerStageDescriptorInputAttachments(int maxPerStageDescriptorInputAttachments){
		 this.maxPerStageDescriptorInputAttachments = maxPerStageDescriptorInputAttachments;
		 setMaxPerStageDescriptorInputAttachments0(this.ptr,  maxPerStageDescriptorInputAttachments);
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
	 */ 
	 public void maxPerStageResources(int maxPerStageResources){
		 this.maxPerStageResources = maxPerStageResources;
		 setMaxPerStageResources0(this.ptr,  maxPerStageResources);
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
	 */ 
	 public void maxDescriptorSetSamplers(int maxDescriptorSetSamplers){
		 this.maxDescriptorSetSamplers = maxDescriptorSetSamplers;
		 setMaxDescriptorSetSamplers0(this.ptr,  maxDescriptorSetSamplers);
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
	 */ 
	 public void maxDescriptorSetUniformBuffers(int maxDescriptorSetUniformBuffers){
		 this.maxDescriptorSetUniformBuffers = maxDescriptorSetUniformBuffers;
		 setMaxDescriptorSetUniformBuffers0(this.ptr,  maxDescriptorSetUniformBuffers);
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
	 */ 
	 public void maxDescriptorSetUniformBuffersDynamic(int maxDescriptorSetUniformBuffersDynamic){
		 this.maxDescriptorSetUniformBuffersDynamic = maxDescriptorSetUniformBuffersDynamic;
		 setMaxDescriptorSetUniformBuffersDynamic0(this.ptr,  maxDescriptorSetUniformBuffersDynamic);
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
	 */ 
	 public void maxDescriptorSetStorageBuffers(int maxDescriptorSetStorageBuffers){
		 this.maxDescriptorSetStorageBuffers = maxDescriptorSetStorageBuffers;
		 setMaxDescriptorSetStorageBuffers0(this.ptr,  maxDescriptorSetStorageBuffers);
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
	 */ 
	 public void maxDescriptorSetStorageBuffersDynamic(int maxDescriptorSetStorageBuffersDynamic){
		 this.maxDescriptorSetStorageBuffersDynamic = maxDescriptorSetStorageBuffersDynamic;
		 setMaxDescriptorSetStorageBuffersDynamic0(this.ptr,  maxDescriptorSetStorageBuffersDynamic);
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
	 */ 
	 public void maxDescriptorSetSampledImages(int maxDescriptorSetSampledImages){
		 this.maxDescriptorSetSampledImages = maxDescriptorSetSampledImages;
		 setMaxDescriptorSetSampledImages0(this.ptr,  maxDescriptorSetSampledImages);
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
	 */ 
	 public void maxDescriptorSetStorageImages(int maxDescriptorSetStorageImages){
		 this.maxDescriptorSetStorageImages = maxDescriptorSetStorageImages;
		 setMaxDescriptorSetStorageImages0(this.ptr,  maxDescriptorSetStorageImages);
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
	 */ 
	 public void maxDescriptorSetInputAttachments(int maxDescriptorSetInputAttachments){
		 this.maxDescriptorSetInputAttachments = maxDescriptorSetInputAttachments;
		 setMaxDescriptorSetInputAttachments0(this.ptr,  maxDescriptorSetInputAttachments);
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
	 */ 
	 public void maxVertexInputAttributes(int maxVertexInputAttributes){
		 this.maxVertexInputAttributes = maxVertexInputAttributes;
		 setMaxVertexInputAttributes0(this.ptr,  maxVertexInputAttributes);
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
	 */ 
	 public void maxVertexInputBindings(int maxVertexInputBindings){
		 this.maxVertexInputBindings = maxVertexInputBindings;
		 setMaxVertexInputBindings0(this.ptr,  maxVertexInputBindings);
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
	 */ 
	 public void maxVertexInputAttributeOffset(int maxVertexInputAttributeOffset){
		 this.maxVertexInputAttributeOffset = maxVertexInputAttributeOffset;
		 setMaxVertexInputAttributeOffset0(this.ptr,  maxVertexInputAttributeOffset);
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
	 */ 
	 public void maxVertexInputBindingStride(int maxVertexInputBindingStride){
		 this.maxVertexInputBindingStride = maxVertexInputBindingStride;
		 setMaxVertexInputBindingStride0(this.ptr,  maxVertexInputBindingStride);
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
	 */ 
	 public void maxVertexOutputComponents(int maxVertexOutputComponents){
		 this.maxVertexOutputComponents = maxVertexOutputComponents;
		 setMaxVertexOutputComponents0(this.ptr,  maxVertexOutputComponents);
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
	 */ 
	 public void maxTessellationGenerationLevel(int maxTessellationGenerationLevel){
		 this.maxTessellationGenerationLevel = maxTessellationGenerationLevel;
		 setMaxTessellationGenerationLevel0(this.ptr,  maxTessellationGenerationLevel);
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
	 */ 
	 public void maxTessellationPatchSize(int maxTessellationPatchSize){
		 this.maxTessellationPatchSize = maxTessellationPatchSize;
		 setMaxTessellationPatchSize0(this.ptr,  maxTessellationPatchSize);
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
	 */ 
	 public void maxTessellationControlPerVertexInputComponents(int maxTessellationControlPerVertexInputComponents){
		 this.maxTessellationControlPerVertexInputComponents = maxTessellationControlPerVertexInputComponents;
		 setMaxTessellationControlPerVertexInputComponents0(this.ptr,  maxTessellationControlPerVertexInputComponents);
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
	 */ 
	 public void maxTessellationControlPerVertexOutputComponents(int maxTessellationControlPerVertexOutputComponents){
		 this.maxTessellationControlPerVertexOutputComponents = maxTessellationControlPerVertexOutputComponents;
		 setMaxTessellationControlPerVertexOutputComponents0(this.ptr,  maxTessellationControlPerVertexOutputComponents);
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
	 */ 
	 public void maxTessellationControlPerPatchOutputComponents(int maxTessellationControlPerPatchOutputComponents){
		 this.maxTessellationControlPerPatchOutputComponents = maxTessellationControlPerPatchOutputComponents;
		 setMaxTessellationControlPerPatchOutputComponents0(this.ptr,  maxTessellationControlPerPatchOutputComponents);
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
	 */ 
	 public void maxTessellationControlTotalOutputComponents(int maxTessellationControlTotalOutputComponents){
		 this.maxTessellationControlTotalOutputComponents = maxTessellationControlTotalOutputComponents;
		 setMaxTessellationControlTotalOutputComponents0(this.ptr,  maxTessellationControlTotalOutputComponents);
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
	 */ 
	 public void maxTessellationEvaluationInputComponents(int maxTessellationEvaluationInputComponents){
		 this.maxTessellationEvaluationInputComponents = maxTessellationEvaluationInputComponents;
		 setMaxTessellationEvaluationInputComponents0(this.ptr,  maxTessellationEvaluationInputComponents);
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
	 */ 
	 public void maxTessellationEvaluationOutputComponents(int maxTessellationEvaluationOutputComponents){
		 this.maxTessellationEvaluationOutputComponents = maxTessellationEvaluationOutputComponents;
		 setMaxTessellationEvaluationOutputComponents0(this.ptr,  maxTessellationEvaluationOutputComponents);
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
	 */ 
	 public void maxGeometryShaderInvocations(int maxGeometryShaderInvocations){
		 this.maxGeometryShaderInvocations = maxGeometryShaderInvocations;
		 setMaxGeometryShaderInvocations0(this.ptr,  maxGeometryShaderInvocations);
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
	 */ 
	 public void maxGeometryInputComponents(int maxGeometryInputComponents){
		 this.maxGeometryInputComponents = maxGeometryInputComponents;
		 setMaxGeometryInputComponents0(this.ptr,  maxGeometryInputComponents);
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
	 */ 
	 public void maxGeometryOutputComponents(int maxGeometryOutputComponents){
		 this.maxGeometryOutputComponents = maxGeometryOutputComponents;
		 setMaxGeometryOutputComponents0(this.ptr,  maxGeometryOutputComponents);
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
	 */ 
	 public void maxGeometryOutputVertices(int maxGeometryOutputVertices){
		 this.maxGeometryOutputVertices = maxGeometryOutputVertices;
		 setMaxGeometryOutputVertices0(this.ptr,  maxGeometryOutputVertices);
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
	 */ 
	 public void maxGeometryTotalOutputComponents(int maxGeometryTotalOutputComponents){
		 this.maxGeometryTotalOutputComponents = maxGeometryTotalOutputComponents;
		 setMaxGeometryTotalOutputComponents0(this.ptr,  maxGeometryTotalOutputComponents);
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
	 */ 
	 public void maxFragmentInputComponents(int maxFragmentInputComponents){
		 this.maxFragmentInputComponents = maxFragmentInputComponents;
		 setMaxFragmentInputComponents0(this.ptr,  maxFragmentInputComponents);
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
	 */ 
	 public void maxFragmentOutputAttachments(int maxFragmentOutputAttachments){
		 this.maxFragmentOutputAttachments = maxFragmentOutputAttachments;
		 setMaxFragmentOutputAttachments0(this.ptr,  maxFragmentOutputAttachments);
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
	 */ 
	 public void maxFragmentDualSrcAttachments(int maxFragmentDualSrcAttachments){
		 this.maxFragmentDualSrcAttachments = maxFragmentDualSrcAttachments;
		 setMaxFragmentDualSrcAttachments0(this.ptr,  maxFragmentDualSrcAttachments);
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
	 */ 
	 public void maxFragmentCombinedOutputResources(int maxFragmentCombinedOutputResources){
		 this.maxFragmentCombinedOutputResources = maxFragmentCombinedOutputResources;
		 setMaxFragmentCombinedOutputResources0(this.ptr,  maxFragmentCombinedOutputResources);
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
	 */ 
	 public void maxComputeSharedMemorySize(int maxComputeSharedMemorySize){
		 this.maxComputeSharedMemorySize = maxComputeSharedMemorySize;
		 setMaxComputeSharedMemorySize0(this.ptr,  maxComputeSharedMemorySize);
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
	 * Set method for field maxComputeWorkGroupCount	[int_array]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupCount
	 */ 
	 public void maxComputeWorkGroupCount(int[] maxComputeWorkGroupCount){
		 this.maxComputeWorkGroupCount = maxComputeWorkGroupCount;
		 setMaxComputeWorkGroupCount0(this.ptr,  maxComputeWorkGroupCount);
	 }

	/**
	 * Get method for field maxComputeWorkGroupCount	[int_array]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupCount
	 */ 
	 public int[] maxComputeWorkGroupCount(){
	         if(maxComputeWorkGroupCount==null){
	             maxComputeWorkGroupCount = new int[3];
		     getMaxComputeWorkGroupCount0(super.ptr, this.maxComputeWorkGroupCount);
	         }
		 return this.maxComputeWorkGroupCount;
	 }

	/**
	 * Set method for field maxComputeWorkGroupInvocations	[int]<br>
	 * Prototype: uint32_t  maxComputeWorkGroupInvocations
	 */ 
	 public void maxComputeWorkGroupInvocations(int maxComputeWorkGroupInvocations){
		 this.maxComputeWorkGroupInvocations = maxComputeWorkGroupInvocations;
		 setMaxComputeWorkGroupInvocations0(this.ptr,  maxComputeWorkGroupInvocations);
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
	 * Set method for field maxComputeWorkGroupSize	[int_array]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupSize
	 */ 
	 public void maxComputeWorkGroupSize(int[] maxComputeWorkGroupSize){
		 this.maxComputeWorkGroupSize = maxComputeWorkGroupSize;
		 setMaxComputeWorkGroupSize0(this.ptr,  maxComputeWorkGroupSize);
	 }

	/**
	 * Get method for field maxComputeWorkGroupSize	[int_array]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupSize
	 */ 
	 public int[] maxComputeWorkGroupSize(){
	       if(maxComputeWorkGroupSize==null){
	           maxComputeWorkGroupSize = new int[3];  
		 getMaxComputeWorkGroupSize0(super.ptr,maxComputeWorkGroupSize );
	       } 
		 return this.maxComputeWorkGroupSize;
	 }

	/**
	 * Set method for field subPixelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subPixelPrecisionBits
	 */ 
	 public void subPixelPrecisionBits(int subPixelPrecisionBits){
		 this.subPixelPrecisionBits = subPixelPrecisionBits;
		 setSubPixelPrecisionBits0(this.ptr,  subPixelPrecisionBits);
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
	 */ 
	 public void subTexelPrecisionBits(int subTexelPrecisionBits){
		 this.subTexelPrecisionBits = subTexelPrecisionBits;
		 setSubTexelPrecisionBits0(this.ptr,  subTexelPrecisionBits);
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
	 */ 
	 public void mipmapPrecisionBits(int mipmapPrecisionBits){
		 this.mipmapPrecisionBits = mipmapPrecisionBits;
		 setMipmapPrecisionBits0(this.ptr,  mipmapPrecisionBits);
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
	 */ 
	 public void maxDrawIndexedIndexValue(int maxDrawIndexedIndexValue){
		 this.maxDrawIndexedIndexValue = maxDrawIndexedIndexValue;
		 setMaxDrawIndexedIndexValue0(this.ptr,  maxDrawIndexedIndexValue);
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
	 */ 
	 public void maxDrawIndirectCount(int maxDrawIndirectCount){
		 this.maxDrawIndirectCount = maxDrawIndirectCount;
		 setMaxDrawIndirectCount0(this.ptr,  maxDrawIndirectCount);
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
	 */ 
	 public void maxSamplerLodBias(float maxSamplerLodBias){
		 this.maxSamplerLodBias = maxSamplerLodBias;
		 setMaxSamplerLodBias0(this.ptr,  maxSamplerLodBias);
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
	 */ 
	 public void maxSamplerAnisotropy(float maxSamplerAnisotropy){
		 this.maxSamplerAnisotropy = maxSamplerAnisotropy;
		 setMaxSamplerAnisotropy0(this.ptr,  maxSamplerAnisotropy);
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
	 */ 
	 public void maxViewports(int maxViewports){
		 this.maxViewports = maxViewports;
		 setMaxViewports0(this.ptr,  maxViewports);
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
	 * Set method for field maxViewportDimensions	[int_array]<br>
	 * Prototype: uint32_t[]  maxViewportDimensions
	 */ 
	 public void maxViewportDimensions(int[] maxViewportDimensions){
		 this.maxViewportDimensions = maxViewportDimensions;
		 setMaxViewportDimensions0(this.ptr,  maxViewportDimensions);
	 }

	/**
	 * Get method for field maxViewportDimensions	[int_array]<br>
	 * Prototype: uint32_t[]  maxViewportDimensions
	 */ 
	 public int[] maxViewportDimensions(){
	     if(maxViewportDimensions==null){
	         maxViewportDimensions = new int[2];
	         getMaxViewportDimensions0(super.ptr, maxViewportDimensions);
	     }		
            return this.maxViewportDimensions;
	 }

	/* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "VkPhysicalDeviceLimits ["+
                "\n\t  maxImageDimension1D : " + maxImageDimension1D() + 
                ",\n\t maxImageDimension2D : "+ maxImageDimension2D() + 
                ",\n\t maxImageDimension3D : " + maxImageDimension3D() + 
                ",\n\t maxImageDimensionCube : " + maxImageDimensionCube() 
                + ",\n\t maxImageArrayLayers : " + maxImageArrayLayers() 
                + ",\n\t maxTexelBufferElements : " + maxTexelBufferElements() 
                + ",\n\t maxUniformBufferRange : " + maxUniformBufferRange()
                + ",\n\t maxStorageBufferRange : " + maxStorageBufferRange() 
                + ",\n\t maxPushConstantsSize : " + maxPushConstantsSize()
                + ",\n\t maxMemoryAllocationCount : " + maxMemoryAllocationCount()  
                + ",\n\t maxSamplerAllocationCount : "  + maxSamplerAllocationCount() 
                + ",\n\t bufferImageGranularity : " + bufferImageGranularity()
                + ",\n\t sparseAddressSpaceSize : " + sparseAddressSpaceSize() 
                + ",\n\t maxBoundDescriptorSets : " + maxBoundDescriptorSets() 
                + ",\n\t maxPerStageDescriptorSamplers : " + maxPerStageDescriptorSamplers()
                + ",\n\t maxPerStageDescriptorUniformBuffers : " + maxPerStageDescriptorUniformBuffers()
                + ",\n\t maxPerStageDescriptorStorageBuffers : " + maxPerStageDescriptorStorageBuffers()
                + ",\n\t maxPerStageDescriptorSampledImages : " + maxPerStageDescriptorSampledImages()
                + ",\n\t maxPerStageDescriptorStorageImages : " + maxPerStageDescriptorStorageImages()
                + ",\n\t maxPerStageDescriptorInputAttachments : " + maxPerStageDescriptorInputAttachments()
                + ",\n\t maxPerStageResources : " + maxPerStageResources()
                + ",\n\t maxDescriptorSetSamplers : "            + maxDescriptorSetSamplers() 
                + ",\n\t maxDescriptorSetUniformBuffers : " + maxDescriptorSetUniformBuffers()
                + ",\n\t maxDescriptorSetUniformBuffersDynamic : " + maxDescriptorSetUniformBuffersDynamic()
                + ",\n\t maxDescriptorSetStorageBuffers : " + maxDescriptorSetStorageBuffers()
                + ",\n\t maxDescriptorSetStorageBuffersDynamic : " + maxDescriptorSetStorageBuffersDynamic()
                + ",\n\t maxDescriptorSetSampledImages : " + maxDescriptorSetSampledImages()
                + ",\n\t maxDescriptorSetStorageImages : " + maxDescriptorSetStorageImages()
                + ",\n\t maxDescriptorSetInputAttachments : " + maxDescriptorSetInputAttachments()
                + ",\n\t maxVertexInputAttributes : " + maxVertexInputAttributes() 
                + ",\n\t maxVertexInputBindings : "   + maxVertexInputBindings()  
                + ",\n\t maxVertexInputAttributeOffset : " + maxVertexInputAttributeOffset()
                + ",\n\t maxVertexInputBindingStride : " + maxVertexInputBindingStride() 
                + ",\n\t maxVertexOutputComponents : "   + maxVertexOutputComponents() 
                + ",\n\t maxTessellationGenerationLevel : " + maxTessellationGenerationLevel()
                + ",\n\t maxTessellationPatchSize : " + maxTessellationPatchSize()
                + ",\n\t maxTessellationControlPerVertexInputComponents : " + maxTessellationControlPerVertexInputComponents()
                + ",\n\t maxTessellationControlPerVertexOutputComponents : " + maxTessellationControlPerVertexOutputComponents()
                + ",\n\t maxTessellationControlPerPatchOutputComponents : " + maxTessellationControlPerPatchOutputComponents()
                + ",\n\t maxTessellationControlTotalOutputComponents : " + maxTessellationControlTotalOutputComponents()
                + ",\n\t maxTessellationEvaluationInputComponents : " + maxTessellationEvaluationInputComponents()
                + ",\n\t maxTessellationEvaluationOutputComponents : " + maxTessellationEvaluationOutputComponents()
                + ",\n\t maxGeometryShaderInvocations : " + maxGeometryShaderInvocations()
                + ",\n\t maxGeometryInputComponents : "   + maxGeometryInputComponents()
                + ",\n\t maxGeometryOutputComponents : " + maxGeometryOutputComponents()
                + ",\n\t maxGeometryOutputVertices : " + maxGeometryOutputVertices()
                + ",\n\t maxGeometryTotalOutputComponents : " + maxGeometryTotalOutputComponents()
                + ",\n\t maxFragmentInputComponents : " + maxFragmentInputComponents()
                + ",\n\t maxFragmentOutputAttachments : " + maxFragmentOutputAttachments()
                + ",\n\t maxFragmentDualSrcAttachments : " + maxFragmentDualSrcAttachments()
                + ",\n\t maxFragmentCombinedOutputResources : " + maxFragmentCombinedOutputResources()
                + ",\n\t maxComputeSharedMemorySize : " + maxComputeSharedMemorySize()
                + ",\n\t maxComputeWorkGroupCount : " + Arrays.toString(maxComputeWorkGroupCount())
                + ",\n\t maxComputeWorkGroupInvocations : " + maxComputeWorkGroupInvocations() 
                + ",\n\t maxComputeWorkGroupSize : "+ Arrays.toString(maxComputeWorkGroupSize()) 
                + ",\n\t subPixelPrecisionBits : " + subPixelPrecisionBits()
                + ",\n\t subTexelPrecisionBits : " + subTexelPrecisionBits() 
                + ",\n\t mipmapPrecisionBits : " + mipmapPrecisionBits()
                + ",\n\t maxDrawIndexedIndexValue : " + maxDrawIndexedIndexValue()
                + ",\n\t maxDrawIndirectCount : " + maxDrawIndirectCount() 
                + ",\n\t maxSamplerLodBias : " + maxSamplerLodBias() 
                + ",\n\t maxSamplerAnisotropy : " + maxSamplerAnisotropy() 
                + ",\n\t maxViewports : " + maxViewports()
                + ",\n\t maxViewportDimensions : " + Arrays.toString(maxViewportDimensions()) 
                + ",\n\t viewportBoundsRange : "    + Arrays.toString(viewportBoundsRange()) 
                + ",\n\t viewportSubPixelBits : " + viewportSubPixelBits()
                + ",\n\t minMemoryMapAlignment : " + minMemoryMapAlignment() 
                + ",\n\t minTexelBufferOffsetAlignment : " + minTexelBufferOffsetAlignment()
                + ",\n\t minUniformBufferOffsetAlignment : " + minUniformBufferOffsetAlignment()                
                + ",\n\t minStorageBufferOffsetAlignment : " + minStorageBufferOffsetAlignment()
                + ",\n\t minTexelOffset : "  + minTexelOffset() 
                + ",\n\t maxTexelOffset : " + maxTexelOffset()  
                + ",\n\t minTexelGatherOffset : " + minTexelGatherOffset() 
                + ",\n\t maxTexelGatherOffset : " + maxTexelGatherOffset() 
                + ",\n\t minInterpolationOffset : "+ minInterpolationOffset() 
                + ",\n\t maxInterpolationOffset : " + maxInterpolationOffset()
                + ",\n\t subPixelInterpolationOffsetBits : " + subPixelInterpolationOffsetBits()
                + ",\n\t maxFramebufferWidth : "+ maxFramebufferWidth() 
                + ",\n\t maxFramebufferHeight : " + maxFramebufferHeight() 
                + ",\n\t maxFramebufferLayers : " + maxFramebufferLayers() 
                + ",\n\t framebufferColorSampleCounts : " + framebufferColorSampleCounts()
                + ",\n\t framebufferDepthSampleCounts : " + framebufferDepthSampleCounts() 
                + ",\n\t framebufferStencilSampleCounts : "+ framebufferStencilSampleCounts() 
                + ",\n\t framebufferNoAttachmentsSampleCounts : " + framebufferNoAttachmentsSampleCounts() 
                + ",\n\t maxColorAttachments : " + maxColorAttachments()
                + ",\n\t sampledImageColorSampleCounts : " + sampledImageColorSampleCounts()
                + ",\n\t sampledImageIntegerSampleCounts : " + sampledImageIntegerSampleCounts()
                + ",\n\t sampledImageDepthSampleCounts : " + sampledImageDepthSampleCounts()
                + ",\n\t sampledImageStencilSampleCounts : " + sampledImageStencilSampleCounts()
                + ",\n\t storageImageSampleCounts : " + storageImageSampleCounts() 
                + ",\n\t maxSampleMaskWords : " + maxSampleMaskWords()
                + ",\n\t timestampComputeAndGraphics : " + timestampComputeAndGraphics() 
                + ",\n\t timestampPeriod : " + timestampPeriod() 
                + ",\n\t maxClipDistances : " + maxClipDistances() 
                + ",\n\t maxCullDistances : " + maxCullDistances()
                + ",\n\t maxCombinedClipAndCullDistances : " + maxCombinedClipAndCullDistances() 
                + ",\n\t discreteQueuePriorities : " + discreteQueuePriorities() 
                + ",\n\t pointSizeRange : " + Arrays.toString(pointSizeRange()) 
                + ",\n\t lineWidthRange : " + Arrays.toString(lineWidthRange()) 
                + ",\n\t pointSizeGranularity : " + pointSizeGranularity()
                + ",\n\t lineWidthGranularity : " + lineWidthGranularity() 
                + ",\n\t strictLines : " + strictLines()
                + ",\n\t standardSampleLocations : " + standardSampleLocations() 
                + ",\n\t optimalBufferCopyOffsetAlignment : "+ optimalBufferCopyOffsetAlignment() 
                + ",\n\t optimalBufferCopyRowPitchAlignment : " + optimalBufferCopyRowPitchAlignment() 
                + ",\n\t nonCoherentAtomSize : " + nonCoherentAtomSize + "]\n";
    }

    /**
	 * Set method for field viewportBoundsRange	[float_array]<br>
	 * Prototype: float[]  viewportBoundsRange
	 */ 
	 public void viewportBoundsRange(float[] viewportBoundsRange){
		 this.viewportBoundsRange = viewportBoundsRange.clone();
		 setViewportBoundsRange0(this.ptr,  viewportBoundsRange);
	 }

	/**
	 * Get method for field viewportBoundsRange	[float_array]<br>
	 * Prototype: float[]  viewportBoundsRange
	 */ 
	 public float[] viewportBoundsRange(){
	     if(viewportBoundsRange==null){
	         viewportBoundsRange = new float[2];
	         getViewportBoundsRange0(super.ptr,viewportBoundsRange );
	     }		
	    return this.viewportBoundsRange;
	 }

	/**
	 * Set method for field viewportSubPixelBits	[int]<br>
	 * Prototype: uint32_t  viewportSubPixelBits
	 */ 
	 public void viewportSubPixelBits(int viewportSubPixelBits){
		 this.viewportSubPixelBits = viewportSubPixelBits;
		 setViewportSubPixelBits0(this.ptr,  viewportSubPixelBits);
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
	 */ 
	 public void minMemoryMapAlignment(long minMemoryMapAlignment){
		 this.minMemoryMapAlignment = minMemoryMapAlignment;
		 setMinMemoryMapAlignment0(this.ptr,  minMemoryMapAlignment);
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
	 */ 
	 public void minTexelBufferOffsetAlignment(long minTexelBufferOffsetAlignment){
		 this.minTexelBufferOffsetAlignment = minTexelBufferOffsetAlignment;
		 setMinTexelBufferOffsetAlignment0(this.ptr,  minTexelBufferOffsetAlignment);
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
	 */ 
	 public void minUniformBufferOffsetAlignment(long minUniformBufferOffsetAlignment){
		 this.minUniformBufferOffsetAlignment = minUniformBufferOffsetAlignment;
		 setMinUniformBufferOffsetAlignment0(this.ptr,  minUniformBufferOffsetAlignment);
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
	 */ 
	 public void minStorageBufferOffsetAlignment(long minStorageBufferOffsetAlignment){
		 this.minStorageBufferOffsetAlignment = minStorageBufferOffsetAlignment;
		 setMinStorageBufferOffsetAlignment0(this.ptr,  minStorageBufferOffsetAlignment);
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
	 */ 
	 public void minTexelOffset(int minTexelOffset){
		 this.minTexelOffset = minTexelOffset;
		 setMinTexelOffset0(this.ptr,  minTexelOffset);
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
	 */ 
	 public void maxTexelOffset(int maxTexelOffset){
		 this.maxTexelOffset = maxTexelOffset;
		 setMaxTexelOffset0(this.ptr,  maxTexelOffset);
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
	 */ 
	 public void minTexelGatherOffset(int minTexelGatherOffset){
		 this.minTexelGatherOffset = minTexelGatherOffset;
		 setMinTexelGatherOffset0(this.ptr,  minTexelGatherOffset);
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
	 */ 
	 public void maxTexelGatherOffset(int maxTexelGatherOffset){
		 this.maxTexelGatherOffset = maxTexelGatherOffset;
		 setMaxTexelGatherOffset0(this.ptr,  maxTexelGatherOffset);
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
	 */ 
	 public void minInterpolationOffset(float minInterpolationOffset){
		 this.minInterpolationOffset = minInterpolationOffset;
		 setMinInterpolationOffset0(this.ptr,  minInterpolationOffset);
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
	 */ 
	 public void maxInterpolationOffset(float maxInterpolationOffset){
		 this.maxInterpolationOffset = maxInterpolationOffset;
		 setMaxInterpolationOffset0(this.ptr,  maxInterpolationOffset);
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
	 */ 
	 public void subPixelInterpolationOffsetBits(int subPixelInterpolationOffsetBits){
		 this.subPixelInterpolationOffsetBits = subPixelInterpolationOffsetBits;
		 setSubPixelInterpolationOffsetBits0(this.ptr,  subPixelInterpolationOffsetBits);
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
	 */ 
	 public void maxFramebufferWidth(int maxFramebufferWidth){
		 this.maxFramebufferWidth = maxFramebufferWidth;
		 setMaxFramebufferWidth0(this.ptr,  maxFramebufferWidth);
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
	 */ 
	 public void maxFramebufferHeight(int maxFramebufferHeight){
		 this.maxFramebufferHeight = maxFramebufferHeight;
		 setMaxFramebufferHeight0(this.ptr,  maxFramebufferHeight);
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
	 */ 
	 public void maxFramebufferLayers(int maxFramebufferLayers){
		 this.maxFramebufferLayers = maxFramebufferLayers;
		 setMaxFramebufferLayers0(this.ptr,  maxFramebufferLayers);
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
	 */ 
	 public void framebufferColorSampleCounts(int framebufferColorSampleCounts){
		 this.framebufferColorSampleCounts = framebufferColorSampleCounts;
		 setFramebufferColorSampleCounts0(this.ptr,  framebufferColorSampleCounts);
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
	 */ 
	 public void framebufferDepthSampleCounts(int framebufferDepthSampleCounts){
		 this.framebufferDepthSampleCounts = framebufferDepthSampleCounts;
		 setFramebufferDepthSampleCounts0(this.ptr,  framebufferDepthSampleCounts);
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
	 */ 
	 public void framebufferStencilSampleCounts(int framebufferStencilSampleCounts){
		 this.framebufferStencilSampleCounts = framebufferStencilSampleCounts;
		 setFramebufferStencilSampleCounts0(this.ptr,  framebufferStencilSampleCounts);
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
	 */ 
	 public void framebufferNoAttachmentsSampleCounts(int framebufferNoAttachmentsSampleCounts){
		 this.framebufferNoAttachmentsSampleCounts = framebufferNoAttachmentsSampleCounts;
		 setFramebufferNoAttachmentsSampleCounts0(this.ptr,  framebufferNoAttachmentsSampleCounts);
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
	 */ 
	 public void maxColorAttachments(int maxColorAttachments){
		 this.maxColorAttachments = maxColorAttachments;
		 setMaxColorAttachments0(this.ptr,  maxColorAttachments);
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
	 */ 
	 public void sampledImageColorSampleCounts(int sampledImageColorSampleCounts){
		 this.sampledImageColorSampleCounts = sampledImageColorSampleCounts;
		 setSampledImageColorSampleCounts0(this.ptr,  sampledImageColorSampleCounts);
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
	 */ 
	 public void sampledImageIntegerSampleCounts(int sampledImageIntegerSampleCounts){
		 this.sampledImageIntegerSampleCounts = sampledImageIntegerSampleCounts;
		 setSampledImageIntegerSampleCounts0(this.ptr,  sampledImageIntegerSampleCounts);
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
	 */ 
	 public void sampledImageDepthSampleCounts(int sampledImageDepthSampleCounts){
		 this.sampledImageDepthSampleCounts = sampledImageDepthSampleCounts;
		 setSampledImageDepthSampleCounts0(this.ptr,  sampledImageDepthSampleCounts);
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
	 */ 
	 public void sampledImageStencilSampleCounts(int sampledImageStencilSampleCounts){
		 this.sampledImageStencilSampleCounts = sampledImageStencilSampleCounts;
		 setSampledImageStencilSampleCounts0(this.ptr,  sampledImageStencilSampleCounts);
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
	 */ 
	 public void storageImageSampleCounts(int storageImageSampleCounts){
		 this.storageImageSampleCounts = storageImageSampleCounts;
		 setStorageImageSampleCounts0(this.ptr,  storageImageSampleCounts);
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
	 */ 
	 public void maxSampleMaskWords(int maxSampleMaskWords){
		 this.maxSampleMaskWords = maxSampleMaskWords;
		 setMaxSampleMaskWords0(this.ptr,  maxSampleMaskWords);
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
	 */ 
	 public void timestampComputeAndGraphics(boolean timestampComputeAndGraphics){
		 this.timestampComputeAndGraphics = timestampComputeAndGraphics;
		 setTimestampComputeAndGraphics0(this.ptr,  timestampComputeAndGraphics);
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
	 */ 
	 public void timestampPeriod(float timestampPeriod){
		 this.timestampPeriod = timestampPeriod;
		 setTimestampPeriod0(this.ptr,  timestampPeriod);
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
	 */ 
	 public void maxClipDistances(int maxClipDistances){
		 this.maxClipDistances = maxClipDistances;
		 setMaxClipDistances0(this.ptr,  maxClipDistances);
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
	 */ 
	 public void maxCullDistances(int maxCullDistances){
		 this.maxCullDistances = maxCullDistances;
		 setMaxCullDistances0(this.ptr,  maxCullDistances);
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
	 */ 
	 public void maxCombinedClipAndCullDistances(int maxCombinedClipAndCullDistances){
		 this.maxCombinedClipAndCullDistances = maxCombinedClipAndCullDistances;
		 setMaxCombinedClipAndCullDistances0(this.ptr,  maxCombinedClipAndCullDistances);
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
	 */ 
	 public void discreteQueuePriorities(int discreteQueuePriorities){
		 this.discreteQueuePriorities = discreteQueuePriorities;
		 setDiscreteQueuePriorities0(this.ptr,  discreteQueuePriorities);
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
	 * Set method for field pointSizeRange	[float_array]<br>
	 * Prototype: float[]  pointSizeRange
	 */ 
	 public void pointSizeRange(float[] pointSizeRange){
		 this.pointSizeRange = pointSizeRange;
		 setPointSizeRange0(this.ptr,  pointSizeRange);
	 }

	/**
	 * Get method for field pointSizeRange	[float_array]<br>
	 * Prototype: float[]  pointSizeRange
	 */ 
	 public float[] pointSizeRange(){
	     if(pointSizeRange==null){
	         pointSizeRange = new float[2];
	         getPointSizeRange0(super.ptr,pointSizeRange);
	     }
	     return this.pointSizeRange;
	 }

	/**
	 * Set method for field lineWidthRange	[float_array]<br>
	 * Prototype: float[]  lineWidthRange
	 */ 
	 public void lineWidthRange(float[] lineWidthRange){
		 this.lineWidthRange = lineWidthRange;
		 setLineWidthRange0(this.ptr,  lineWidthRange);
	 }

	/**
	 * Get method for field lineWidthRange	[float_array]<br>
	 * Prototype: float[]  lineWidthRange
	 */ 
	 public float[] lineWidthRange(){
	     if(lineWidthRange==null){
	         lineWidthRange = new float[2];
	         getLineWidthRange0(super.ptr,lineWidthRange);
	     }
	     return this.lineWidthRange;
	 }

	/**
	 * Set method for field pointSizeGranularity	[float]<br>
	 * Prototype: float  pointSizeGranularity
	 */ 
	 public void pointSizeGranularity(float pointSizeGranularity){
		 this.pointSizeGranularity = pointSizeGranularity;
		 setPointSizeGranularity0(this.ptr,  pointSizeGranularity);
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
	 */ 
	 public void lineWidthGranularity(float lineWidthGranularity){
		 this.lineWidthGranularity = lineWidthGranularity;
		 setLineWidthGranularity0(this.ptr,  lineWidthGranularity);
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
	 */ 
	 public void strictLines(boolean strictLines){
		 this.strictLines = strictLines;
		 setStrictLines0(this.ptr,  strictLines);
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
	 */ 
	 public void standardSampleLocations(boolean standardSampleLocations){
		 this.standardSampleLocations = standardSampleLocations;
		 setStandardSampleLocations0(this.ptr,  standardSampleLocations);
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
	 */ 
	 public void optimalBufferCopyOffsetAlignment(long optimalBufferCopyOffsetAlignment){
		 this.optimalBufferCopyOffsetAlignment = optimalBufferCopyOffsetAlignment;
		 setOptimalBufferCopyOffsetAlignment0(this.ptr,  optimalBufferCopyOffsetAlignment);
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
	 */ 
	 public void optimalBufferCopyRowPitchAlignment(long optimalBufferCopyRowPitchAlignment){
		 this.optimalBufferCopyRowPitchAlignment = optimalBufferCopyRowPitchAlignment;
		 setOptimalBufferCopyRowPitchAlignment0(this.ptr,  optimalBufferCopyRowPitchAlignment);
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
	 */ 
	 public void nonCoherentAtomSize(long nonCoherentAtomSize){
		 this.nonCoherentAtomSize = nonCoherentAtomSize;
		 setNonCoherentAtomSize0(this.ptr,  nonCoherentAtomSize);
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


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field maxImageDimension1D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension1D
	 */ 
	 private static native void setMaxImageDimension1D0(Buffer ptr, int _maxImageDimension1D);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxImageDimension1D = (uint32_t) (_maxImageDimension1D);
	  */

	/**
	 * native GET method for field maxImageDimension1D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension1D
	 */ 
	 private static native int getMaxImageDimension1D0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxImageDimension1D);
	 */

	/**
	 * native SET method for field maxImageDimension2D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension2D
	 */ 
	 private static native void setMaxImageDimension2D0(Buffer ptr, int _maxImageDimension2D);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxImageDimension2D = (uint32_t) (_maxImageDimension2D);
	  */

	/**
	 * native GET method for field maxImageDimension2D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension2D
	 */ 
	 private static native int getMaxImageDimension2D0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxImageDimension2D);
	 */

	/**
	 * native SET method for field maxImageDimension3D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension3D
	 */ 
	 private static native void setMaxImageDimension3D0(Buffer ptr, int _maxImageDimension3D);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxImageDimension3D = (uint32_t) (_maxImageDimension3D);
	  */

	/**
	 * native GET method for field maxImageDimension3D	[int]<br>
	 * Prototype: uint32_t  maxImageDimension3D
	 */ 
	 private static native int getMaxImageDimension3D0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxImageDimension3D);
	 */

	/**
	 * native SET method for field maxImageDimensionCube	[int]<br>
	 * Prototype: uint32_t  maxImageDimensionCube
	 */ 
	 private static native void setMaxImageDimensionCube0(Buffer ptr, int _maxImageDimensionCube);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxImageDimensionCube = (uint32_t) (_maxImageDimensionCube);
	  */

	/**
	 * native GET method for field maxImageDimensionCube	[int]<br>
	 * Prototype: uint32_t  maxImageDimensionCube
	 */ 
	 private static native int getMaxImageDimensionCube0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxImageDimensionCube);
	 */

	/**
	 * native SET method for field maxImageArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxImageArrayLayers
	 */ 
	 private static native void setMaxImageArrayLayers0(Buffer ptr, int _maxImageArrayLayers);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxImageArrayLayers = (uint32_t) (_maxImageArrayLayers);
	  */

	/**
	 * native GET method for field maxImageArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxImageArrayLayers
	 */ 
	 private static native int getMaxImageArrayLayers0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxImageArrayLayers);
	 */

	/**
	 * native SET method for field maxTexelBufferElements	[int]<br>
	 * Prototype: uint32_t  maxTexelBufferElements
	 */ 
	 private static native void setMaxTexelBufferElements0(Buffer ptr, int _maxTexelBufferElements);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTexelBufferElements = (uint32_t) (_maxTexelBufferElements);
	  */

	/**
	 * native GET method for field maxTexelBufferElements	[int]<br>
	 * Prototype: uint32_t  maxTexelBufferElements
	 */ 
	 private static native int getMaxTexelBufferElements0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTexelBufferElements);
	 */

	/**
	 * native SET method for field maxUniformBufferRange	[int]<br>
	 * Prototype: uint32_t  maxUniformBufferRange
	 */ 
	 private static native void setMaxUniformBufferRange0(Buffer ptr, int _maxUniformBufferRange);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxUniformBufferRange = (uint32_t) (_maxUniformBufferRange);
	  */

	/**
	 * native GET method for field maxUniformBufferRange	[int]<br>
	 * Prototype: uint32_t  maxUniformBufferRange
	 */ 
	 private static native int getMaxUniformBufferRange0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxUniformBufferRange);
	 */

	/**
	 * native SET method for field maxStorageBufferRange	[int]<br>
	 * Prototype: uint32_t  maxStorageBufferRange
	 */ 
	 private static native void setMaxStorageBufferRange0(Buffer ptr, int _maxStorageBufferRange);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxStorageBufferRange = (uint32_t) (_maxStorageBufferRange);
	  */

	/**
	 * native GET method for field maxStorageBufferRange	[int]<br>
	 * Prototype: uint32_t  maxStorageBufferRange
	 */ 
	 private static native int getMaxStorageBufferRange0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxStorageBufferRange);
	 */

	/**
	 * native SET method for field maxPushConstantsSize	[int]<br>
	 * Prototype: uint32_t  maxPushConstantsSize
	 */ 
	 private static native void setMaxPushConstantsSize0(Buffer ptr, int _maxPushConstantsSize);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxPushConstantsSize = (uint32_t) (_maxPushConstantsSize);
	  */

	/**
	 * native GET method for field maxPushConstantsSize	[int]<br>
	 * Prototype: uint32_t  maxPushConstantsSize
	 */ 
	 private static native int getMaxPushConstantsSize0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxPushConstantsSize);
	 */

	/**
	 * native SET method for field maxMemoryAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxMemoryAllocationCount
	 */ 
	 private static native void setMaxMemoryAllocationCount0(Buffer ptr, int _maxMemoryAllocationCount);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxMemoryAllocationCount = (uint32_t) (_maxMemoryAllocationCount);
	  */

	/**
	 * native GET method for field maxMemoryAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxMemoryAllocationCount
	 */ 
	 private static native int getMaxMemoryAllocationCount0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxMemoryAllocationCount);
	 */

	/**
	 * native SET method for field maxSamplerAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxSamplerAllocationCount
	 */ 
	 private static native void setMaxSamplerAllocationCount0(Buffer ptr, int _maxSamplerAllocationCount);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxSamplerAllocationCount = (uint32_t) (_maxSamplerAllocationCount);
	  */

	/**
	 * native GET method for field maxSamplerAllocationCount	[int]<br>
	 * Prototype: uint32_t  maxSamplerAllocationCount
	 */ 
	 private static native int getMaxSamplerAllocationCount0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxSamplerAllocationCount);
	 */

	/**
	 * native SET method for field bufferImageGranularity	[long]<br>
	 * Prototype: VkDeviceSize  bufferImageGranularity
	 */ 
	 private static native void setBufferImageGranularity0(Buffer ptr, long _bufferImageGranularity);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->bufferImageGranularity = (VkDeviceSize) (_bufferImageGranularity);
	  */

	/**
	 * native GET method for field bufferImageGranularity	[long]<br>
	 * Prototype: VkDeviceSize  bufferImageGranularity
	 */ 
	 private static native long getBufferImageGranularity0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->bufferImageGranularity);
	 */

	/**
	 * native SET method for field sparseAddressSpaceSize	[long]<br>
	 * Prototype: VkDeviceSize  sparseAddressSpaceSize
	 */ 
	 private static native void setSparseAddressSpaceSize0(Buffer ptr, long _sparseAddressSpaceSize);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->sparseAddressSpaceSize = (VkDeviceSize) (_sparseAddressSpaceSize);
	  */

	/**
	 * native GET method for field sparseAddressSpaceSize	[long]<br>
	 * Prototype: VkDeviceSize  sparseAddressSpaceSize
	 */ 
	 private static native long getSparseAddressSpaceSize0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->sparseAddressSpaceSize);
	 */

	/**
	 * native SET method for field maxBoundDescriptorSets	[int]<br>
	 * Prototype: uint32_t  maxBoundDescriptorSets
	 */ 
	 private static native void setMaxBoundDescriptorSets0(Buffer ptr, int _maxBoundDescriptorSets);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxBoundDescriptorSets = (uint32_t) (_maxBoundDescriptorSets);
	  */

	/**
	 * native GET method for field maxBoundDescriptorSets	[int]<br>
	 * Prototype: uint32_t  maxBoundDescriptorSets
	 */ 
	 private static native int getMaxBoundDescriptorSets0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxBoundDescriptorSets);
	 */

	/**
	 * native SET method for field maxPerStageDescriptorSamplers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSamplers
	 */ 
	 private static native void setMaxPerStageDescriptorSamplers0(Buffer ptr, int _maxPerStageDescriptorSamplers);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxPerStageDescriptorSamplers = (uint32_t) (_maxPerStageDescriptorSamplers);
	  */

	/**
	 * native GET method for field maxPerStageDescriptorSamplers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSamplers
	 */ 
	 private static native int getMaxPerStageDescriptorSamplers0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxPerStageDescriptorSamplers);
	 */

	/**
	 * native SET method for field maxPerStageDescriptorUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorUniformBuffers
	 */ 
	 private static native void setMaxPerStageDescriptorUniformBuffers0(Buffer ptr, int _maxPerStageDescriptorUniformBuffers);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxPerStageDescriptorUniformBuffers = (uint32_t) (_maxPerStageDescriptorUniformBuffers);
	  */

	/**
	 * native GET method for field maxPerStageDescriptorUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorUniformBuffers
	 */ 
	 private static native int getMaxPerStageDescriptorUniformBuffers0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxPerStageDescriptorUniformBuffers);
	 */

	/**
	 * native SET method for field maxPerStageDescriptorStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageBuffers
	 */ 
	 private static native void setMaxPerStageDescriptorStorageBuffers0(Buffer ptr, int _maxPerStageDescriptorStorageBuffers);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxPerStageDescriptorStorageBuffers = (uint32_t) (_maxPerStageDescriptorStorageBuffers);
	  */

	/**
	 * native GET method for field maxPerStageDescriptorStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageBuffers
	 */ 
	 private static native int getMaxPerStageDescriptorStorageBuffers0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxPerStageDescriptorStorageBuffers);
	 */

	/**
	 * native SET method for field maxPerStageDescriptorSampledImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSampledImages
	 */ 
	 private static native void setMaxPerStageDescriptorSampledImages0(Buffer ptr, int _maxPerStageDescriptorSampledImages);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxPerStageDescriptorSampledImages = (uint32_t) (_maxPerStageDescriptorSampledImages);
	  */

	/**
	 * native GET method for field maxPerStageDescriptorSampledImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorSampledImages
	 */ 
	 private static native int getMaxPerStageDescriptorSampledImages0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxPerStageDescriptorSampledImages);
	 */

	/**
	 * native SET method for field maxPerStageDescriptorStorageImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageImages
	 */ 
	 private static native void setMaxPerStageDescriptorStorageImages0(Buffer ptr, int _maxPerStageDescriptorStorageImages);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxPerStageDescriptorStorageImages = (uint32_t) (_maxPerStageDescriptorStorageImages);
	  */

	/**
	 * native GET method for field maxPerStageDescriptorStorageImages	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorStorageImages
	 */ 
	 private static native int getMaxPerStageDescriptorStorageImages0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxPerStageDescriptorStorageImages);
	 */

	/**
	 * native SET method for field maxPerStageDescriptorInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorInputAttachments
	 */ 
	 private static native void setMaxPerStageDescriptorInputAttachments0(Buffer ptr, int _maxPerStageDescriptorInputAttachments);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxPerStageDescriptorInputAttachments = (uint32_t) (_maxPerStageDescriptorInputAttachments);
	  */

	/**
	 * native GET method for field maxPerStageDescriptorInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxPerStageDescriptorInputAttachments
	 */ 
	 private static native int getMaxPerStageDescriptorInputAttachments0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxPerStageDescriptorInputAttachments);
	 */

	/**
	 * native SET method for field maxPerStageResources	[int]<br>
	 * Prototype: uint32_t  maxPerStageResources
	 */ 
	 private static native void setMaxPerStageResources0(Buffer ptr, int _maxPerStageResources);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxPerStageResources = (uint32_t) (_maxPerStageResources);
	  */

	/**
	 * native GET method for field maxPerStageResources	[int]<br>
	 * Prototype: uint32_t  maxPerStageResources
	 */ 
	 private static native int getMaxPerStageResources0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxPerStageResources);
	 */

	/**
	 * native SET method for field maxDescriptorSetSamplers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSamplers
	 */ 
	 private static native void setMaxDescriptorSetSamplers0(Buffer ptr, int _maxDescriptorSetSamplers);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDescriptorSetSamplers = (uint32_t) (_maxDescriptorSetSamplers);
	  */

	/**
	 * native GET method for field maxDescriptorSetSamplers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSamplers
	 */ 
	 private static native int getMaxDescriptorSetSamplers0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDescriptorSetSamplers);
	 */

	/**
	 * native SET method for field maxDescriptorSetUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffers
	 */ 
	 private static native void setMaxDescriptorSetUniformBuffers0(Buffer ptr, int _maxDescriptorSetUniformBuffers);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDescriptorSetUniformBuffers = (uint32_t) (_maxDescriptorSetUniformBuffers);
	  */

	/**
	 * native GET method for field maxDescriptorSetUniformBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffers
	 */ 
	 private static native int getMaxDescriptorSetUniformBuffers0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDescriptorSetUniformBuffers);
	 */

	/**
	 * native SET method for field maxDescriptorSetUniformBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffersDynamic
	 */ 
	 private static native void setMaxDescriptorSetUniformBuffersDynamic0(Buffer ptr, int _maxDescriptorSetUniformBuffersDynamic);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDescriptorSetUniformBuffersDynamic = (uint32_t) (_maxDescriptorSetUniformBuffersDynamic);
	  */

	/**
	 * native GET method for field maxDescriptorSetUniformBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetUniformBuffersDynamic
	 */ 
	 private static native int getMaxDescriptorSetUniformBuffersDynamic0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDescriptorSetUniformBuffersDynamic);
	 */

	/**
	 * native SET method for field maxDescriptorSetStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffers
	 */ 
	 private static native void setMaxDescriptorSetStorageBuffers0(Buffer ptr, int _maxDescriptorSetStorageBuffers);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDescriptorSetStorageBuffers = (uint32_t) (_maxDescriptorSetStorageBuffers);
	  */

	/**
	 * native GET method for field maxDescriptorSetStorageBuffers	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffers
	 */ 
	 private static native int getMaxDescriptorSetStorageBuffers0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDescriptorSetStorageBuffers);
	 */

	/**
	 * native SET method for field maxDescriptorSetStorageBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffersDynamic
	 */ 
	 private static native void setMaxDescriptorSetStorageBuffersDynamic0(Buffer ptr, int _maxDescriptorSetStorageBuffersDynamic);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDescriptorSetStorageBuffersDynamic = (uint32_t) (_maxDescriptorSetStorageBuffersDynamic);
	  */

	/**
	 * native GET method for field maxDescriptorSetStorageBuffersDynamic	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageBuffersDynamic
	 */ 
	 private static native int getMaxDescriptorSetStorageBuffersDynamic0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDescriptorSetStorageBuffersDynamic);
	 */

	/**
	 * native SET method for field maxDescriptorSetSampledImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSampledImages
	 */ 
	 private static native void setMaxDescriptorSetSampledImages0(Buffer ptr, int _maxDescriptorSetSampledImages);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDescriptorSetSampledImages = (uint32_t) (_maxDescriptorSetSampledImages);
	  */

	/**
	 * native GET method for field maxDescriptorSetSampledImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetSampledImages
	 */ 
	 private static native int getMaxDescriptorSetSampledImages0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDescriptorSetSampledImages);
	 */

	/**
	 * native SET method for field maxDescriptorSetStorageImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageImages
	 */ 
	 private static native void setMaxDescriptorSetStorageImages0(Buffer ptr, int _maxDescriptorSetStorageImages);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDescriptorSetStorageImages = (uint32_t) (_maxDescriptorSetStorageImages);
	  */

	/**
	 * native GET method for field maxDescriptorSetStorageImages	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetStorageImages
	 */ 
	 private static native int getMaxDescriptorSetStorageImages0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDescriptorSetStorageImages);
	 */

	/**
	 * native SET method for field maxDescriptorSetInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetInputAttachments
	 */ 
	 private static native void setMaxDescriptorSetInputAttachments0(Buffer ptr, int _maxDescriptorSetInputAttachments);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDescriptorSetInputAttachments = (uint32_t) (_maxDescriptorSetInputAttachments);
	  */

	/**
	 * native GET method for field maxDescriptorSetInputAttachments	[int]<br>
	 * Prototype: uint32_t  maxDescriptorSetInputAttachments
	 */ 
	 private static native int getMaxDescriptorSetInputAttachments0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDescriptorSetInputAttachments);
	 */

	/**
	 * native SET method for field maxVertexInputAttributes	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributes
	 */ 
	 private static native void setMaxVertexInputAttributes0(Buffer ptr, int _maxVertexInputAttributes);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxVertexInputAttributes = (uint32_t) (_maxVertexInputAttributes);
	  */

	/**
	 * native GET method for field maxVertexInputAttributes	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributes
	 */ 
	 private static native int getMaxVertexInputAttributes0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxVertexInputAttributes);
	 */

	/**
	 * native SET method for field maxVertexInputBindings	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindings
	 */ 
	 private static native void setMaxVertexInputBindings0(Buffer ptr, int _maxVertexInputBindings);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxVertexInputBindings = (uint32_t) (_maxVertexInputBindings);
	  */

	/**
	 * native GET method for field maxVertexInputBindings	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindings
	 */ 
	 private static native int getMaxVertexInputBindings0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxVertexInputBindings);
	 */

	/**
	 * native SET method for field maxVertexInputAttributeOffset	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributeOffset
	 */ 
	 private static native void setMaxVertexInputAttributeOffset0(Buffer ptr, int _maxVertexInputAttributeOffset);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxVertexInputAttributeOffset = (uint32_t) (_maxVertexInputAttributeOffset);
	  */

	/**
	 * native GET method for field maxVertexInputAttributeOffset	[int]<br>
	 * Prototype: uint32_t  maxVertexInputAttributeOffset
	 */ 
	 private static native int getMaxVertexInputAttributeOffset0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxVertexInputAttributeOffset);
	 */

	/**
	 * native SET method for field maxVertexInputBindingStride	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindingStride
	 */ 
	 private static native void setMaxVertexInputBindingStride0(Buffer ptr, int _maxVertexInputBindingStride);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxVertexInputBindingStride = (uint32_t) (_maxVertexInputBindingStride);
	  */

	/**
	 * native GET method for field maxVertexInputBindingStride	[int]<br>
	 * Prototype: uint32_t  maxVertexInputBindingStride
	 */ 
	 private static native int getMaxVertexInputBindingStride0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxVertexInputBindingStride);
	 */

	/**
	 * native SET method for field maxVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxVertexOutputComponents
	 */ 
	 private static native void setMaxVertexOutputComponents0(Buffer ptr, int _maxVertexOutputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxVertexOutputComponents = (uint32_t) (_maxVertexOutputComponents);
	  */

	/**
	 * native GET method for field maxVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxVertexOutputComponents
	 */ 
	 private static native int getMaxVertexOutputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxVertexOutputComponents);
	 */

	/**
	 * native SET method for field maxTessellationGenerationLevel	[int]<br>
	 * Prototype: uint32_t  maxTessellationGenerationLevel
	 */ 
	 private static native void setMaxTessellationGenerationLevel0(Buffer ptr, int _maxTessellationGenerationLevel);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTessellationGenerationLevel = (uint32_t) (_maxTessellationGenerationLevel);
	  */

	/**
	 * native GET method for field maxTessellationGenerationLevel	[int]<br>
	 * Prototype: uint32_t  maxTessellationGenerationLevel
	 */ 
	 private static native int getMaxTessellationGenerationLevel0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTessellationGenerationLevel);
	 */

	/**
	 * native SET method for field maxTessellationPatchSize	[int]<br>
	 * Prototype: uint32_t  maxTessellationPatchSize
	 */ 
	 private static native void setMaxTessellationPatchSize0(Buffer ptr, int _maxTessellationPatchSize);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTessellationPatchSize = (uint32_t) (_maxTessellationPatchSize);
	  */

	/**
	 * native GET method for field maxTessellationPatchSize	[int]<br>
	 * Prototype: uint32_t  maxTessellationPatchSize
	 */ 
	 private static native int getMaxTessellationPatchSize0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTessellationPatchSize);
	 */

	/**
	 * native SET method for field maxTessellationControlPerVertexInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexInputComponents
	 */ 
	 private static native void setMaxTessellationControlPerVertexInputComponents0(Buffer ptr, int _maxTessellationControlPerVertexInputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTessellationControlPerVertexInputComponents = (uint32_t) (_maxTessellationControlPerVertexInputComponents);
	  */

	/**
	 * native GET method for field maxTessellationControlPerVertexInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexInputComponents
	 */ 
	 private static native int getMaxTessellationControlPerVertexInputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTessellationControlPerVertexInputComponents);
	 */

	/**
	 * native SET method for field maxTessellationControlPerVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexOutputComponents
	 */ 
	 private static native void setMaxTessellationControlPerVertexOutputComponents0(Buffer ptr, int _maxTessellationControlPerVertexOutputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTessellationControlPerVertexOutputComponents = (uint32_t) (_maxTessellationControlPerVertexOutputComponents);
	  */

	/**
	 * native GET method for field maxTessellationControlPerVertexOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerVertexOutputComponents
	 */ 
	 private static native int getMaxTessellationControlPerVertexOutputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTessellationControlPerVertexOutputComponents);
	 */

	/**
	 * native SET method for field maxTessellationControlPerPatchOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerPatchOutputComponents
	 */ 
	 private static native void setMaxTessellationControlPerPatchOutputComponents0(Buffer ptr, int _maxTessellationControlPerPatchOutputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTessellationControlPerPatchOutputComponents = (uint32_t) (_maxTessellationControlPerPatchOutputComponents);
	  */

	/**
	 * native GET method for field maxTessellationControlPerPatchOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlPerPatchOutputComponents
	 */ 
	 private static native int getMaxTessellationControlPerPatchOutputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTessellationControlPerPatchOutputComponents);
	 */

	/**
	 * native SET method for field maxTessellationControlTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlTotalOutputComponents
	 */ 
	 private static native void setMaxTessellationControlTotalOutputComponents0(Buffer ptr, int _maxTessellationControlTotalOutputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTessellationControlTotalOutputComponents = (uint32_t) (_maxTessellationControlTotalOutputComponents);
	  */

	/**
	 * native GET method for field maxTessellationControlTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationControlTotalOutputComponents
	 */ 
	 private static native int getMaxTessellationControlTotalOutputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTessellationControlTotalOutputComponents);
	 */

	/**
	 * native SET method for field maxTessellationEvaluationInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationInputComponents
	 */ 
	 private static native void setMaxTessellationEvaluationInputComponents0(Buffer ptr, int _maxTessellationEvaluationInputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTessellationEvaluationInputComponents = (uint32_t) (_maxTessellationEvaluationInputComponents);
	  */

	/**
	 * native GET method for field maxTessellationEvaluationInputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationInputComponents
	 */ 
	 private static native int getMaxTessellationEvaluationInputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTessellationEvaluationInputComponents);
	 */

	/**
	 * native SET method for field maxTessellationEvaluationOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationOutputComponents
	 */ 
	 private static native void setMaxTessellationEvaluationOutputComponents0(Buffer ptr, int _maxTessellationEvaluationOutputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTessellationEvaluationOutputComponents = (uint32_t) (_maxTessellationEvaluationOutputComponents);
	  */

	/**
	 * native GET method for field maxTessellationEvaluationOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxTessellationEvaluationOutputComponents
	 */ 
	 private static native int getMaxTessellationEvaluationOutputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTessellationEvaluationOutputComponents);
	 */

	/**
	 * native SET method for field maxGeometryShaderInvocations	[int]<br>
	 * Prototype: uint32_t  maxGeometryShaderInvocations
	 */ 
	 private static native void setMaxGeometryShaderInvocations0(Buffer ptr, int _maxGeometryShaderInvocations);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxGeometryShaderInvocations = (uint32_t) (_maxGeometryShaderInvocations);
	  */

	/**
	 * native GET method for field maxGeometryShaderInvocations	[int]<br>
	 * Prototype: uint32_t  maxGeometryShaderInvocations
	 */ 
	 private static native int getMaxGeometryShaderInvocations0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxGeometryShaderInvocations);
	 */

	/**
	 * native SET method for field maxGeometryInputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryInputComponents
	 */ 
	 private static native void setMaxGeometryInputComponents0(Buffer ptr, int _maxGeometryInputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxGeometryInputComponents = (uint32_t) (_maxGeometryInputComponents);
	  */

	/**
	 * native GET method for field maxGeometryInputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryInputComponents
	 */ 
	 private static native int getMaxGeometryInputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxGeometryInputComponents);
	 */

	/**
	 * native SET method for field maxGeometryOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputComponents
	 */ 
	 private static native void setMaxGeometryOutputComponents0(Buffer ptr, int _maxGeometryOutputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxGeometryOutputComponents = (uint32_t) (_maxGeometryOutputComponents);
	  */

	/**
	 * native GET method for field maxGeometryOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputComponents
	 */ 
	 private static native int getMaxGeometryOutputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxGeometryOutputComponents);
	 */

	/**
	 * native SET method for field maxGeometryOutputVertices	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputVertices
	 */ 
	 private static native void setMaxGeometryOutputVertices0(Buffer ptr, int _maxGeometryOutputVertices);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxGeometryOutputVertices = (uint32_t) (_maxGeometryOutputVertices);
	  */

	/**
	 * native GET method for field maxGeometryOutputVertices	[int]<br>
	 * Prototype: uint32_t  maxGeometryOutputVertices
	 */ 
	 private static native int getMaxGeometryOutputVertices0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxGeometryOutputVertices);
	 */

	/**
	 * native SET method for field maxGeometryTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryTotalOutputComponents
	 */ 
	 private static native void setMaxGeometryTotalOutputComponents0(Buffer ptr, int _maxGeometryTotalOutputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxGeometryTotalOutputComponents = (uint32_t) (_maxGeometryTotalOutputComponents);
	  */

	/**
	 * native GET method for field maxGeometryTotalOutputComponents	[int]<br>
	 * Prototype: uint32_t  maxGeometryTotalOutputComponents
	 */ 
	 private static native int getMaxGeometryTotalOutputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxGeometryTotalOutputComponents);
	 */

	/**
	 * native SET method for field maxFragmentInputComponents	[int]<br>
	 * Prototype: uint32_t  maxFragmentInputComponents
	 */ 
	 private static native void setMaxFragmentInputComponents0(Buffer ptr, int _maxFragmentInputComponents);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxFragmentInputComponents = (uint32_t) (_maxFragmentInputComponents);
	  */

	/**
	 * native GET method for field maxFragmentInputComponents	[int]<br>
	 * Prototype: uint32_t  maxFragmentInputComponents
	 */ 
	 private static native int getMaxFragmentInputComponents0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxFragmentInputComponents);
	 */

	/**
	 * native SET method for field maxFragmentOutputAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentOutputAttachments
	 */ 
	 private static native void setMaxFragmentOutputAttachments0(Buffer ptr, int _maxFragmentOutputAttachments);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxFragmentOutputAttachments = (uint32_t) (_maxFragmentOutputAttachments);
	  */

	/**
	 * native GET method for field maxFragmentOutputAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentOutputAttachments
	 */ 
	 private static native int getMaxFragmentOutputAttachments0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxFragmentOutputAttachments);
	 */

	/**
	 * native SET method for field maxFragmentDualSrcAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentDualSrcAttachments
	 */ 
	 private static native void setMaxFragmentDualSrcAttachments0(Buffer ptr, int _maxFragmentDualSrcAttachments);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxFragmentDualSrcAttachments = (uint32_t) (_maxFragmentDualSrcAttachments);
	  */

	/**
	 * native GET method for field maxFragmentDualSrcAttachments	[int]<br>
	 * Prototype: uint32_t  maxFragmentDualSrcAttachments
	 */ 
	 private static native int getMaxFragmentDualSrcAttachments0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxFragmentDualSrcAttachments);
	 */

	/**
	 * native SET method for field maxFragmentCombinedOutputResources	[int]<br>
	 * Prototype: uint32_t  maxFragmentCombinedOutputResources
	 */ 
	 private static native void setMaxFragmentCombinedOutputResources0(Buffer ptr, int _maxFragmentCombinedOutputResources);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxFragmentCombinedOutputResources = (uint32_t) (_maxFragmentCombinedOutputResources);
	  */

	/**
	 * native GET method for field maxFragmentCombinedOutputResources	[int]<br>
	 * Prototype: uint32_t  maxFragmentCombinedOutputResources
	 */ 
	 private static native int getMaxFragmentCombinedOutputResources0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxFragmentCombinedOutputResources);
	 */

	/**
	 * native SET method for field maxComputeSharedMemorySize	[int]<br>
	 * Prototype: uint32_t  maxComputeSharedMemorySize
	 */ 
	 private static native void setMaxComputeSharedMemorySize0(Buffer ptr, int _maxComputeSharedMemorySize);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxComputeSharedMemorySize = (uint32_t) (_maxComputeSharedMemorySize);
	  */

	/**
	 * native GET method for field maxComputeSharedMemorySize	[int]<br>
	 * Prototype: uint32_t  maxComputeSharedMemorySize
	 */ 
	 private static native int getMaxComputeSharedMemorySize0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxComputeSharedMemorySize);
	 */

	/**
	 * native SET method for field maxComputeWorkGroupCount	[int_array]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupCount
	 */ 
	 @Deprecated
	 private static native void setMaxComputeWorkGroupCount0(Buffer ptr, int[] _maxComputeWorkGroupCount);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxComputeWorkGroupCount[0] = (uint32_t) _maxComputeWorkGroupCount[0];
		  vkObj->maxComputeWorkGroupCount[1] = (uint32_t) _maxComputeWorkGroupCount[1];
		  vkObj->maxComputeWorkGroupCount[2] = (uint32_t) _maxComputeWorkGroupCount[2];
	  */

	/**
	 * native GET method for field maxComputeWorkGroupCount	[int_array]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupCount
	 */ 
	 private static native void getMaxComputeWorkGroupCount0(Buffer ptr,int[] input);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  for(int i=0; i<3; i++){
		     input[i] = (jint) vkObj->maxComputeWorkGroupCount[i];
		  }
	 */

	/**
	 * native SET method for field maxComputeWorkGroupInvocations	[int]<br>
	 * Prototype: uint32_t  maxComputeWorkGroupInvocations
	 */ 
	 private static native void setMaxComputeWorkGroupInvocations0(Buffer ptr, int _maxComputeWorkGroupInvocations);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxComputeWorkGroupInvocations = (uint32_t) (_maxComputeWorkGroupInvocations);
	  */

	/**
	 * native GET method for field maxComputeWorkGroupInvocations	[int]<br>
	 * Prototype: uint32_t  maxComputeWorkGroupInvocations
	 */ 
	 private static native int getMaxComputeWorkGroupInvocations0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxComputeWorkGroupInvocations);
	 */

	/**
	 * native SET method for field maxComputeWorkGroupSize	[int_array]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupSize
	 */ 
	 private static native void setMaxComputeWorkGroupSize0(Buffer ptr, int[] _maxComputeWorkGroupSize);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxComputeWorkGroupSize[0] = (uint32_t) (_maxComputeWorkGroupSize[0]);
		  vkObj->maxComputeWorkGroupSize[1] = (uint32_t) (_maxComputeWorkGroupSize[1]);
		  vkObj->maxComputeWorkGroupSize[2] = (uint32_t) (_maxComputeWorkGroupSize[2]);
	  */

	/**
	 * native GET method for field maxComputeWorkGroupSize	[int_array]<br>
	 * Prototype: uint32_t[]  maxComputeWorkGroupSize
	 */ 
	 private static native void getMaxComputeWorkGroupSize0(Buffer ptr, int[] input);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  //return (int[]) (vkObj->maxComputeWorkGroupSize);
		  for(int i=0; i<3; i++){
		   input[i] = (jint)vkObj->maxComputeWorkGroupSize[i];
		  }
	 */

	/**
	 * native SET method for field subPixelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subPixelPrecisionBits
	 */ 
	 private static native void setSubPixelPrecisionBits0(Buffer ptr, int _subPixelPrecisionBits);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->subPixelPrecisionBits = (uint32_t) (_subPixelPrecisionBits);
	  */

	/**
	 * native GET method for field subPixelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subPixelPrecisionBits
	 */ 
	 private static native int getSubPixelPrecisionBits0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->subPixelPrecisionBits);
	 */

	/**
	 * native SET method for field subTexelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subTexelPrecisionBits
	 */ 
	 private static native void setSubTexelPrecisionBits0(Buffer ptr, int _subTexelPrecisionBits);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->subTexelPrecisionBits = (uint32_t) (_subTexelPrecisionBits);
	  */

	/**
	 * native GET method for field subTexelPrecisionBits	[int]<br>
	 * Prototype: uint32_t  subTexelPrecisionBits
	 */ 
	 private static native int getSubTexelPrecisionBits0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->subTexelPrecisionBits);
	 */

	/**
	 * native SET method for field mipmapPrecisionBits	[int]<br>
	 * Prototype: uint32_t  mipmapPrecisionBits
	 */ 
	 private static native void setMipmapPrecisionBits0(Buffer ptr, int _mipmapPrecisionBits);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->mipmapPrecisionBits = (uint32_t) (_mipmapPrecisionBits);
	  */

	/**
	 * native GET method for field mipmapPrecisionBits	[int]<br>
	 * Prototype: uint32_t  mipmapPrecisionBits
	 */ 
	 private static native int getMipmapPrecisionBits0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->mipmapPrecisionBits);
	 */

	/**
	 * native SET method for field maxDrawIndexedIndexValue	[int]<br>
	 * Prototype: uint32_t  maxDrawIndexedIndexValue
	 */ 
	 private static native void setMaxDrawIndexedIndexValue0(Buffer ptr, int _maxDrawIndexedIndexValue);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDrawIndexedIndexValue = (uint32_t) (_maxDrawIndexedIndexValue);
	  */

	/**
	 * native GET method for field maxDrawIndexedIndexValue	[int]<br>
	 * Prototype: uint32_t  maxDrawIndexedIndexValue
	 */ 
	 private static native int getMaxDrawIndexedIndexValue0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDrawIndexedIndexValue);
	 */

	/**
	 * native SET method for field maxDrawIndirectCount	[int]<br>
	 * Prototype: uint32_t  maxDrawIndirectCount
	 */ 
	 private static native void setMaxDrawIndirectCount0(Buffer ptr, int _maxDrawIndirectCount);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxDrawIndirectCount = (uint32_t) (_maxDrawIndirectCount);
	  */

	/**
	 * native GET method for field maxDrawIndirectCount	[int]<br>
	 * Prototype: uint32_t  maxDrawIndirectCount
	 */ 
	 private static native int getMaxDrawIndirectCount0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxDrawIndirectCount);
	 */

	/**
	 * native SET method for field maxSamplerLodBias	[float]<br>
	 * Prototype: float  maxSamplerLodBias
	 */ 
	 private static native void setMaxSamplerLodBias0(Buffer ptr, float _maxSamplerLodBias);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxSamplerLodBias = (float) (_maxSamplerLodBias);
	  */

	/**
	 * native GET method for field maxSamplerLodBias	[float]<br>
	 * Prototype: float  maxSamplerLodBias
	 */ 
	 private static native float getMaxSamplerLodBias0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jfloat) (vkObj->maxSamplerLodBias);
	 */

	/**
	 * native SET method for field maxSamplerAnisotropy	[float]<br>
	 * Prototype: float  maxSamplerAnisotropy
	 */ 
	 private static native void setMaxSamplerAnisotropy0(Buffer ptr, float _maxSamplerAnisotropy);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxSamplerAnisotropy = (float) (_maxSamplerAnisotropy);
	  */

	/**
	 * native GET method for field maxSamplerAnisotropy	[float]<br>
	 * Prototype: float  maxSamplerAnisotropy
	 */ 
	 private static native float getMaxSamplerAnisotropy0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jfloat) (vkObj->maxSamplerAnisotropy);
	 */

	/**
	 * native SET method for field maxViewports	[int]<br>
	 * Prototype: uint32_t  maxViewports
	 */ 
	 private static native void setMaxViewports0(Buffer ptr, int _maxViewports);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxViewports = (uint32_t) (_maxViewports);
	  */

	/**
	 * native GET method for field maxViewports	[int]<br>
	 * Prototype: uint32_t  maxViewports
	 */ 
	 private static native int getMaxViewports0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxViewports);
	 */

	/**
	 * native SET method for field maxViewportDimensions	[int_array]<br>
	 * Prototype: uint32_t[]  maxViewportDimensions
	 */ 
	 private static native void setMaxViewportDimensions0(Buffer ptr, int[] _maxViewportDimensions);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxViewportDimensions[0] = (uint32_t) (_maxViewportDimensions[0]);
		  vkObj->maxViewportDimensions[1] = (uint32_t) (_maxViewportDimensions[1]);
	  */

	/**
	 * native GET method for field maxViewportDimensions	[int_array]<br>
	 * Prototype: uint32_t[]  maxViewportDimensions
	 */ 
	 private static native void getMaxViewportDimensions0(Buffer ptr,int[] input);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  input[0] = (jint) (vkObj->maxViewportDimensions[0]);
		  input[1] = (jint) (vkObj->maxViewportDimensions[1]);
	 */

	/**
	 * native SET method for field viewportBoundsRange	[float_array]<br>
	 * Prototype: float[]  viewportBoundsRange
	 */ 
	 private static native void setViewportBoundsRange0(Buffer ptr, float[] _viewportBoundsRange);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->viewportBoundsRange[0] = (float) (_viewportBoundsRange[0]);
		  vkObj->viewportBoundsRange[1] = (float) (_viewportBoundsRange[1]);
	  */

	/**
	 * native GET method for field viewportBoundsRange	[float_array]<br>
	 * Prototype: float[]  viewportBoundsRange
	 */ 
	 private static native void getViewportBoundsRange0(Buffer ptr, float[] input);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  input[0] = (jfloat) (vkObj->viewportBoundsRange[0]);
		  input[1] = (jfloat) (vkObj->viewportBoundsRange[1]);
	 */

	/**
	 * native SET method for field viewportSubPixelBits	[int]<br>
	 * Prototype: uint32_t  viewportSubPixelBits
	 */ 
	 private static native void setViewportSubPixelBits0(Buffer ptr, int _viewportSubPixelBits);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->viewportSubPixelBits = (uint32_t) (_viewportSubPixelBits);
	  */

	/**
	 * native GET method for field viewportSubPixelBits	[int]<br>
	 * Prototype: uint32_t  viewportSubPixelBits
	 */ 
	 private static native int getViewportSubPixelBits0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->viewportSubPixelBits);
	 */

	/**
	 * native SET method for field minMemoryMapAlignment	[long]<br>
	 * Prototype: size_t  minMemoryMapAlignment
	 */ 
	 private static native void setMinMemoryMapAlignment0(Buffer ptr, long _minMemoryMapAlignment);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->minMemoryMapAlignment = (size_t) (_minMemoryMapAlignment);
	  */

	/**
	 * native GET method for field minMemoryMapAlignment	[long]<br>
	 * Prototype: size_t  minMemoryMapAlignment
	 */ 
	 private static native long getMinMemoryMapAlignment0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->minMemoryMapAlignment);
	 */

	/**
	 * native SET method for field minTexelBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minTexelBufferOffsetAlignment
	 */ 
	 private static native void setMinTexelBufferOffsetAlignment0(Buffer ptr, long _minTexelBufferOffsetAlignment);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->minTexelBufferOffsetAlignment = (VkDeviceSize) (_minTexelBufferOffsetAlignment);
	  */

	/**
	 * native GET method for field minTexelBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minTexelBufferOffsetAlignment
	 */ 
	 private static native long getMinTexelBufferOffsetAlignment0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->minTexelBufferOffsetAlignment);
	 */

	/**
	 * native SET method for field minUniformBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minUniformBufferOffsetAlignment
	 */ 
	 private static native void setMinUniformBufferOffsetAlignment0(Buffer ptr, long _minUniformBufferOffsetAlignment);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->minUniformBufferOffsetAlignment = (VkDeviceSize) (_minUniformBufferOffsetAlignment);
	  */

	/**
	 * native GET method for field minUniformBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minUniformBufferOffsetAlignment
	 */ 
	 private static native long getMinUniformBufferOffsetAlignment0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->minUniformBufferOffsetAlignment);
	 */

	/**
	 * native SET method for field minStorageBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minStorageBufferOffsetAlignment
	 */ 
	 private static native void setMinStorageBufferOffsetAlignment0(Buffer ptr, long _minStorageBufferOffsetAlignment);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->minStorageBufferOffsetAlignment = (VkDeviceSize) (_minStorageBufferOffsetAlignment);
	  */

	/**
	 * native GET method for field minStorageBufferOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  minStorageBufferOffsetAlignment
	 */ 
	 private static native long getMinStorageBufferOffsetAlignment0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->minStorageBufferOffsetAlignment);
	 */

	/**
	 * native SET method for field minTexelOffset	[int]<br>
	 * Prototype: int32_t  minTexelOffset
	 */ 
	 private static native void setMinTexelOffset0(Buffer ptr, int _minTexelOffset);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->minTexelOffset = (int32_t) (_minTexelOffset);
	  */

	/**
	 * native GET method for field minTexelOffset	[int]<br>
	 * Prototype: int32_t  minTexelOffset
	 */ 
	 private static native int getMinTexelOffset0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->minTexelOffset);
	 */

	/**
	 * native SET method for field maxTexelOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelOffset
	 */ 
	 private static native void setMaxTexelOffset0(Buffer ptr, int _maxTexelOffset);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTexelOffset = (uint32_t) (_maxTexelOffset);
	  */

	/**
	 * native GET method for field maxTexelOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelOffset
	 */ 
	 private static native int getMaxTexelOffset0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTexelOffset);
	 */

	/**
	 * native SET method for field minTexelGatherOffset	[int]<br>
	 * Prototype: int32_t  minTexelGatherOffset
	 */ 
	 private static native void setMinTexelGatherOffset0(Buffer ptr, int _minTexelGatherOffset);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->minTexelGatherOffset = (int32_t) (_minTexelGatherOffset);
	  */

	/**
	 * native GET method for field minTexelGatherOffset	[int]<br>
	 * Prototype: int32_t  minTexelGatherOffset
	 */ 
	 private static native int getMinTexelGatherOffset0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->minTexelGatherOffset);
	 */

	/**
	 * native SET method for field maxTexelGatherOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelGatherOffset
	 */ 
	 private static native void setMaxTexelGatherOffset0(Buffer ptr, int _maxTexelGatherOffset);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxTexelGatherOffset = (uint32_t) (_maxTexelGatherOffset);
	  */

	/**
	 * native GET method for field maxTexelGatherOffset	[int]<br>
	 * Prototype: uint32_t  maxTexelGatherOffset
	 */ 
	 private static native int getMaxTexelGatherOffset0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxTexelGatherOffset);
	 */

	/**
	 * native SET method for field minInterpolationOffset	[float]<br>
	 * Prototype: float  minInterpolationOffset
	 */ 
	 private static native void setMinInterpolationOffset0(Buffer ptr, float _minInterpolationOffset);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->minInterpolationOffset = (float) (_minInterpolationOffset);
	  */

	/**
	 * native GET method for field minInterpolationOffset	[float]<br>
	 * Prototype: float  minInterpolationOffset
	 */ 
	 private static native float getMinInterpolationOffset0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jfloat) (vkObj->minInterpolationOffset);
	 */

	/**
	 * native SET method for field maxInterpolationOffset	[float]<br>
	 * Prototype: float  maxInterpolationOffset
	 */ 
	 private static native void setMaxInterpolationOffset0(Buffer ptr, float _maxInterpolationOffset);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxInterpolationOffset = (float) (_maxInterpolationOffset);
	  */

	/**
	 * native GET method for field maxInterpolationOffset	[float]<br>
	 * Prototype: float  maxInterpolationOffset
	 */ 
	 private static native float getMaxInterpolationOffset0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jfloat) (vkObj->maxInterpolationOffset);
	 */

	/**
	 * native SET method for field subPixelInterpolationOffsetBits	[int]<br>
	 * Prototype: uint32_t  subPixelInterpolationOffsetBits
	 */ 
	 private static native void setSubPixelInterpolationOffsetBits0(Buffer ptr, int _subPixelInterpolationOffsetBits);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->subPixelInterpolationOffsetBits = (uint32_t) (_subPixelInterpolationOffsetBits);
	  */

	/**
	 * native GET method for field subPixelInterpolationOffsetBits	[int]<br>
	 * Prototype: uint32_t  subPixelInterpolationOffsetBits
	 */ 
	 private static native int getSubPixelInterpolationOffsetBits0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->subPixelInterpolationOffsetBits);
	 */

	/**
	 * native SET method for field maxFramebufferWidth	[int]<br>
	 * Prototype: uint32_t  maxFramebufferWidth
	 */ 
	 private static native void setMaxFramebufferWidth0(Buffer ptr, int _maxFramebufferWidth);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxFramebufferWidth = (uint32_t) (_maxFramebufferWidth);
	  */

	/**
	 * native GET method for field maxFramebufferWidth	[int]<br>
	 * Prototype: uint32_t  maxFramebufferWidth
	 */ 
	 private static native int getMaxFramebufferWidth0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxFramebufferWidth);
	 */

	/**
	 * native SET method for field maxFramebufferHeight	[int]<br>
	 * Prototype: uint32_t  maxFramebufferHeight
	 */ 
	 private static native void setMaxFramebufferHeight0(Buffer ptr, int _maxFramebufferHeight);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxFramebufferHeight = (uint32_t) (_maxFramebufferHeight);
	  */

	/**
	 * native GET method for field maxFramebufferHeight	[int]<br>
	 * Prototype: uint32_t  maxFramebufferHeight
	 */ 
	 private static native int getMaxFramebufferHeight0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxFramebufferHeight);
	 */

	/**
	 * native SET method for field maxFramebufferLayers	[int]<br>
	 * Prototype: uint32_t  maxFramebufferLayers
	 */ 
	 private static native void setMaxFramebufferLayers0(Buffer ptr, int _maxFramebufferLayers);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxFramebufferLayers = (uint32_t) (_maxFramebufferLayers);
	  */

	/**
	 * native GET method for field maxFramebufferLayers	[int]<br>
	 * Prototype: uint32_t  maxFramebufferLayers
	 */ 
	 private static native int getMaxFramebufferLayers0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxFramebufferLayers);
	 */

	/**
	 * native SET method for field framebufferColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferColorSampleCounts
	 */ 
	 private static native void setFramebufferColorSampleCounts0(Buffer ptr, int _framebufferColorSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->framebufferColorSampleCounts = (VkSampleCountFlags) (_framebufferColorSampleCounts);
	  */

	/**
	 * native GET method for field framebufferColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferColorSampleCounts
	 */ 
	 private static native int getFramebufferColorSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->framebufferColorSampleCounts);
	 */

	/**
	 * native SET method for field framebufferDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferDepthSampleCounts
	 */ 
	 private static native void setFramebufferDepthSampleCounts0(Buffer ptr, int _framebufferDepthSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->framebufferDepthSampleCounts = (VkSampleCountFlags) (_framebufferDepthSampleCounts);
	  */

	/**
	 * native GET method for field framebufferDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferDepthSampleCounts
	 */ 
	 private static native int getFramebufferDepthSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->framebufferDepthSampleCounts);
	 */

	/**
	 * native SET method for field framebufferStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferStencilSampleCounts
	 */ 
	 private static native void setFramebufferStencilSampleCounts0(Buffer ptr, int _framebufferStencilSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->framebufferStencilSampleCounts = (VkSampleCountFlags) (_framebufferStencilSampleCounts);
	  */

	/**
	 * native GET method for field framebufferStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferStencilSampleCounts
	 */ 
	 private static native int getFramebufferStencilSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->framebufferStencilSampleCounts);
	 */

	/**
	 * native SET method for field framebufferNoAttachmentsSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferNoAttachmentsSampleCounts
	 */ 
	 private static native void setFramebufferNoAttachmentsSampleCounts0(Buffer ptr, int _framebufferNoAttachmentsSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->framebufferNoAttachmentsSampleCounts = (VkSampleCountFlags) (_framebufferNoAttachmentsSampleCounts);
	  */

	/**
	 * native GET method for field framebufferNoAttachmentsSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  framebufferNoAttachmentsSampleCounts
	 */ 
	 private static native int getFramebufferNoAttachmentsSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->framebufferNoAttachmentsSampleCounts);
	 */

	/**
	 * native SET method for field maxColorAttachments	[int]<br>
	 * Prototype: uint32_t  maxColorAttachments
	 */ 
	 private static native void setMaxColorAttachments0(Buffer ptr, int _maxColorAttachments);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxColorAttachments = (uint32_t) (_maxColorAttachments);
	  */

	/**
	 * native GET method for field maxColorAttachments	[int]<br>
	 * Prototype: uint32_t  maxColorAttachments
	 */ 
	 private static native int getMaxColorAttachments0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxColorAttachments);
	 */

	/**
	 * native SET method for field sampledImageColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageColorSampleCounts
	 */ 
	 private static native void setSampledImageColorSampleCounts0(Buffer ptr, int _sampledImageColorSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->sampledImageColorSampleCounts = (VkSampleCountFlags) (_sampledImageColorSampleCounts);
	  */

	/**
	 * native GET method for field sampledImageColorSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageColorSampleCounts
	 */ 
	 private static native int getSampledImageColorSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->sampledImageColorSampleCounts);
	 */

	/**
	 * native SET method for field sampledImageIntegerSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageIntegerSampleCounts
	 */ 
	 private static native void setSampledImageIntegerSampleCounts0(Buffer ptr, int _sampledImageIntegerSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->sampledImageIntegerSampleCounts = (VkSampleCountFlags) (_sampledImageIntegerSampleCounts);
	  */

	/**
	 * native GET method for field sampledImageIntegerSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageIntegerSampleCounts
	 */ 
	 private static native int getSampledImageIntegerSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->sampledImageIntegerSampleCounts);
	 */

	/**
	 * native SET method for field sampledImageDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageDepthSampleCounts
	 */ 
	 private static native void setSampledImageDepthSampleCounts0(Buffer ptr, int _sampledImageDepthSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->sampledImageDepthSampleCounts = (VkSampleCountFlags) (_sampledImageDepthSampleCounts);
	  */

	/**
	 * native GET method for field sampledImageDepthSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageDepthSampleCounts
	 */ 
	 private static native int getSampledImageDepthSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->sampledImageDepthSampleCounts);
	 */

	/**
	 * native SET method for field sampledImageStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageStencilSampleCounts
	 */ 
	 private static native void setSampledImageStencilSampleCounts0(Buffer ptr, int _sampledImageStencilSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->sampledImageStencilSampleCounts = (VkSampleCountFlags) (_sampledImageStencilSampleCounts);
	  */

	/**
	 * native GET method for field sampledImageStencilSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampledImageStencilSampleCounts
	 */ 
	 private static native int getSampledImageStencilSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->sampledImageStencilSampleCounts);
	 */

	/**
	 * native SET method for field storageImageSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  storageImageSampleCounts
	 */ 
	 private static native void setStorageImageSampleCounts0(Buffer ptr, int _storageImageSampleCounts);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->storageImageSampleCounts = (VkSampleCountFlags) (_storageImageSampleCounts);
	  */

	/**
	 * native GET method for field storageImageSampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  storageImageSampleCounts
	 */ 
	 private static native int getStorageImageSampleCounts0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->storageImageSampleCounts);
	 */

	/**
	 * native SET method for field maxSampleMaskWords	[int]<br>
	 * Prototype: uint32_t  maxSampleMaskWords
	 */ 
	 private static native void setMaxSampleMaskWords0(Buffer ptr, int _maxSampleMaskWords);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxSampleMaskWords = (uint32_t) (_maxSampleMaskWords);
	  */

	/**
	 * native GET method for field maxSampleMaskWords	[int]<br>
	 * Prototype: uint32_t  maxSampleMaskWords
	 */ 
	 private static native int getMaxSampleMaskWords0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxSampleMaskWords);
	 */

	/**
	 * native SET method for field timestampComputeAndGraphics	[boolean]<br>
	 * Prototype: VkBool32  timestampComputeAndGraphics
	 */ 
	 private static native void setTimestampComputeAndGraphics0(Buffer ptr, boolean _timestampComputeAndGraphics);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->timestampComputeAndGraphics = (VkBool32) (_timestampComputeAndGraphics);
	  */

	/**
	 * native GET method for field timestampComputeAndGraphics	[boolean]<br>
	 * Prototype: VkBool32  timestampComputeAndGraphics
	 */ 
	 private static native boolean getTimestampComputeAndGraphics0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jboolean) (vkObj->timestampComputeAndGraphics);
	 */

	/**
	 * native SET method for field timestampPeriod	[float]<br>
	 * Prototype: float  timestampPeriod
	 */ 
	 private static native void setTimestampPeriod0(Buffer ptr, float _timestampPeriod);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->timestampPeriod = (float) (_timestampPeriod);
	  */

	/**
	 * native GET method for field timestampPeriod	[float]<br>
	 * Prototype: float  timestampPeriod
	 */ 
	 private static native float getTimestampPeriod0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jfloat) (vkObj->timestampPeriod);
	 */

	/**
	 * native SET method for field maxClipDistances	[int]<br>
	 * Prototype: uint32_t  maxClipDistances
	 */ 
	 private static native void setMaxClipDistances0(Buffer ptr, int _maxClipDistances);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxClipDistances = (uint32_t) (_maxClipDistances);
	  */

	/**
	 * native GET method for field maxClipDistances	[int]<br>
	 * Prototype: uint32_t  maxClipDistances
	 */ 
	 private static native int getMaxClipDistances0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxClipDistances);
	 */

	/**
	 * native SET method for field maxCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCullDistances
	 */ 
	 private static native void setMaxCullDistances0(Buffer ptr, int _maxCullDistances);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxCullDistances = (uint32_t) (_maxCullDistances);
	  */

	/**
	 * native GET method for field maxCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCullDistances
	 */ 
	 private static native int getMaxCullDistances0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxCullDistances);
	 */

	/**
	 * native SET method for field maxCombinedClipAndCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCombinedClipAndCullDistances
	 */ 
	 private static native void setMaxCombinedClipAndCullDistances0(Buffer ptr, int _maxCombinedClipAndCullDistances);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->maxCombinedClipAndCullDistances = (uint32_t) (_maxCombinedClipAndCullDistances);
	  */

	/**
	 * native GET method for field maxCombinedClipAndCullDistances	[int]<br>
	 * Prototype: uint32_t  maxCombinedClipAndCullDistances
	 */ 
	 private static native int getMaxCombinedClipAndCullDistances0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jint) (vkObj->maxCombinedClipAndCullDistances);
	 */

	/**
	 * native SET method for field discreteQueuePriorities	[int]<br>
	 * Prototype: uint32_t  discreteQueuePriorities
	 */ 
	 private static native void setDiscreteQueuePriorities0(Buffer ptr, int _discreteQueuePriorities);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->discreteQueuePriorities = (uint32_t) (_discreteQueuePriorities);
	  */

	/**
	 * native GET method for field discreteQueuePriorities	[int]<br>
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
	 * native SET method for field pointSizeGranularity	[float]<br>
	 * Prototype: float  pointSizeGranularity
	 */ 
	 private static native void setPointSizeGranularity0(Buffer ptr, float _pointSizeGranularity);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->pointSizeGranularity = (float) (_pointSizeGranularity);
	  */

	/**
	 * native GET method for field pointSizeGranularity	[float]<br>
	 * Prototype: float  pointSizeGranularity
	 */ 
	 private static native float getPointSizeGranularity0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jfloat) (vkObj->pointSizeGranularity);
	 */

	/**
	 * native SET method for field lineWidthGranularity	[float]<br>
	 * Prototype: float  lineWidthGranularity
	 */ 
	 private static native void setLineWidthGranularity0(Buffer ptr, float _lineWidthGranularity);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->lineWidthGranularity = (float) (_lineWidthGranularity);
	  */

	/**
	 * native GET method for field lineWidthGranularity	[float]<br>
	 * Prototype: float  lineWidthGranularity
	 */ 
	 private static native float getLineWidthGranularity0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jfloat) (vkObj->lineWidthGranularity);
	 */

	/**
	 * native SET method for field strictLines	[boolean]<br>
	 * Prototype: VkBool32  strictLines
	 */ 
	 private static native void setStrictLines0(Buffer ptr, boolean _strictLines);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->strictLines = (VkBool32) (_strictLines);
	  */

	/**
	 * native GET method for field strictLines	[boolean]<br>
	 * Prototype: VkBool32  strictLines
	 */ 
	 private static native boolean getStrictLines0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jboolean) (vkObj->strictLines);
	 */

	/**
	 * native SET method for field standardSampleLocations	[boolean]<br>
	 * Prototype: VkBool32  standardSampleLocations
	 */ 
	 private static native void setStandardSampleLocations0(Buffer ptr, boolean _standardSampleLocations);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->standardSampleLocations = (VkBool32) (_standardSampleLocations);
	  */

	/**
	 * native GET method for field standardSampleLocations	[boolean]<br>
	 * Prototype: VkBool32  standardSampleLocations
	 */ 
	 private static native boolean getStandardSampleLocations0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jboolean) (vkObj->standardSampleLocations);
	 */

	/**
	 * native SET method for field optimalBufferCopyOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyOffsetAlignment
	 */ 
	 private static native void setOptimalBufferCopyOffsetAlignment0(Buffer ptr, long _optimalBufferCopyOffsetAlignment);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->optimalBufferCopyOffsetAlignment = (VkDeviceSize) (_optimalBufferCopyOffsetAlignment);
	  */

	/**
	 * native GET method for field optimalBufferCopyOffsetAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyOffsetAlignment
	 */ 
	 private static native long getOptimalBufferCopyOffsetAlignment0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->optimalBufferCopyOffsetAlignment);
	 */

	/**
	 * native SET method for field optimalBufferCopyRowPitchAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyRowPitchAlignment
	 */ 
	 private static native void setOptimalBufferCopyRowPitchAlignment0(Buffer ptr, long _optimalBufferCopyRowPitchAlignment);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->optimalBufferCopyRowPitchAlignment = (VkDeviceSize) (_optimalBufferCopyRowPitchAlignment);
	  */

	/**
	 * native GET method for field optimalBufferCopyRowPitchAlignment	[long]<br>
	 * Prototype: VkDeviceSize  optimalBufferCopyRowPitchAlignment
	 */ 
	 private static native long getOptimalBufferCopyRowPitchAlignment0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->optimalBufferCopyRowPitchAlignment);
	 */

	/**
	 * native SET method for field nonCoherentAtomSize	[long]<br>
	 * Prototype: VkDeviceSize  nonCoherentAtomSize
	 */ 
	 private static native void setNonCoherentAtomSize0(Buffer ptr, long _nonCoherentAtomSize);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  vkObj->nonCoherentAtomSize = (VkDeviceSize) (_nonCoherentAtomSize);
	  */

	/**
	 * native GET method for field nonCoherentAtomSize	[long]<br>
	 * Prototype: VkDeviceSize  nonCoherentAtomSize
	 */ 
	 private static native long getNonCoherentAtomSize0(Buffer ptr);/*
		  VkPhysicalDeviceLimits* vkObj = (VkPhysicalDeviceLimits*)(ptr);
		  return (jlong) (vkObj->nonCoherentAtomSize);
	 */



} // end of class VkPhysicalDeviceLimits
