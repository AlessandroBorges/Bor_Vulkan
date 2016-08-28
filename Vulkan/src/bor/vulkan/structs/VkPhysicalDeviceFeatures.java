/**
 * Class wrapping Vulkan's VkPhysicalDeviceFeatures struct.
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
 *  This class is a Java front end for struct VkPhysicalDeviceFeatures. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPhysicalDeviceFeatures {
 *     VkBool32    robustBufferAccess;
 *     VkBool32    fullDrawIndexUint32;
 *     VkBool32    imageCubeArray;
 *     VkBool32    independentBlend;
 *     VkBool32    geometryShader;
 *     VkBool32    tessellationShader;
 *     VkBool32    sampleRateShading;
 *     VkBool32    dualSrcBlend;
 *     VkBool32    logicOp;
 *     VkBool32    multiDrawIndirect;
 *     VkBool32    drawIndirectFirstInstance;
 *     VkBool32    depthClamp;
 *     VkBool32    depthBiasClamp;
 *     VkBool32    fillModeNonSolid;
 *     VkBool32    depthBounds;
 *     VkBool32    wideLines;
 *     VkBool32    largePoints;
 *     VkBool32    alphaToOne;
 *     VkBool32    multiViewport;
 *     VkBool32    samplerAnisotropy;
 *     VkBool32    textureCompressionETC2;
 *     VkBool32    textureCompressionASTC_LDR;
 *     VkBool32    textureCompressionBC;
 *     VkBool32    occlusionQueryPrecise;
 *     VkBool32    pipelineStatisticsQuery;
 *     VkBool32    vertexPipelineStoresAndAtomics;
 *     VkBool32    fragmentStoresAndAtomics;
 *     VkBool32    shaderTessellationAndGeometryPointSize;
 *     VkBool32    shaderImageGatherExtended;
 *     VkBool32    shaderStorageImageExtendedFormats;
 *     VkBool32    shaderStorageImageMultisample;
 *     VkBool32    shaderStorageImageReadWithoutFormat;
 *     VkBool32    shaderStorageImageWriteWithoutFormat;
 *     VkBool32    shaderUniformBufferArrayDynamicIndexing;
 *     VkBool32    shaderSampledImageArrayDynamicIndexing;
 *     VkBool32    shaderStorageBufferArrayDynamicIndexing;
 *     VkBool32    shaderStorageImageArrayDynamicIndexing;
 *     VkBool32    shaderClipDistance;
 *     VkBool32    shaderCullDistance;
 *     VkBool32    shaderFloat64;
 *     VkBool32    shaderInt64;
 *     VkBool32    shaderInt16;
 *     VkBool32    shaderResourceResidency;
 *     VkBool32    shaderResourceMinLod;
 *     VkBool32    sparseBinding;
 *     VkBool32    sparseResidencyBuffer;
 *     VkBool32    sparseResidencyImage2D;
 *     VkBool32    sparseResidencyImage3D;
 *     VkBool32    sparseResidency2Samples;
 *     VkBool32    sparseResidency4Samples;
 *     VkBool32    sparseResidency8Samples;
 *     VkBool32    sparseResidency16Samples;
 *     VkBool32    sparseResidencyAliased;
 *     VkBool32    variableMultisampleRate;
 *     VkBool32    inheritedQueries;
 * } VkPhysicalDeviceFeatures;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkPhysicalDeviceFeatures extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [4]  */
	 private static final String TAG = "VkPhysicalDeviceFeatures";

	/** ID of this structure [4]  */
	 public static final int TAG_ID = VKPHYSICALDEVICEFEATURES_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkBool32 	robustBufferAccess	[boolean]
	 */ 
	boolean 	robustBufferAccess;
	
	/**
	 *  VkBool32 	fullDrawIndexUint32	[boolean]
	 */ 
	boolean 	fullDrawIndexUint32;
	
	/**
	 *  VkBool32 	imageCubeArray	[boolean]
	 */ 
	boolean 	imageCubeArray;
	
	/**
	 *  VkBool32 	independentBlend	[boolean]
	 */ 
	boolean 	independentBlend;
	
	/**
	 *  VkBool32 	geometryShader	[boolean]
	 */ 
	boolean 	geometryShader;
	
	/**
	 *  VkBool32 	tessellationShader	[boolean]
	 */ 
	boolean 	tessellationShader;
	
	/**
	 *  VkBool32 	sampleRateShading	[boolean]
	 */ 
	boolean 	sampleRateShading;
	
	/**
	 *  VkBool32 	dualSrcBlend	[boolean]
	 */ 
	boolean 	dualSrcBlend;
	
	/**
	 *  VkBool32 	logicOp	[boolean]
	 */ 
	boolean 	logicOp;
	
	/**
	 *  VkBool32 	multiDrawIndirect	[boolean]
	 */ 
	boolean 	multiDrawIndirect;
	
	/**
	 *  VkBool32 	drawIndirectFirstInstance	[boolean]
	 */ 
	boolean 	drawIndirectFirstInstance;
	
	/**
	 *  VkBool32 	depthClamp	[boolean]
	 */ 
	boolean 	depthClamp;
	
	/**
	 *  VkBool32 	depthBiasClamp	[boolean]
	 */ 
	boolean 	depthBiasClamp;
	
	/**
	 *  VkBool32 	fillModeNonSolid	[boolean]
	 */ 
	boolean 	fillModeNonSolid;
	
	/**
	 *  VkBool32 	depthBounds	[boolean]
	 */ 
	boolean 	depthBounds;
	
	/**
	 *  VkBool32 	wideLines	[boolean]
	 */ 
	boolean 	wideLines;
	
	/**
	 *  VkBool32 	largePoints	[boolean]
	 */ 
	boolean 	largePoints;
	
	/**
	 *  VkBool32 	alphaToOne	[boolean]
	 */ 
	boolean 	alphaToOne;
	
	/**
	 *  VkBool32 	multiViewport	[boolean]
	 */ 
	boolean 	multiViewport;
	
	/**
	 *  VkBool32 	samplerAnisotropy	[boolean]
	 */ 
	boolean 	samplerAnisotropy;
	
	/**
	 *  VkBool32 	textureCompressionETC2	[boolean]
	 */ 
	boolean 	textureCompressionETC2;
	
	/**
	 *  VkBool32 	textureCompressionASTC_LDR	[boolean]
	 */ 
	boolean 	textureCompressionASTC_LDR;
	
	/**
	 *  VkBool32 	textureCompressionBC	[boolean]
	 */ 
	boolean 	textureCompressionBC;
	
	/**
	 *  VkBool32 	occlusionQueryPrecise	[boolean]
	 */ 
	boolean 	occlusionQueryPrecise;
	
	/**
	 *  VkBool32 	pipelineStatisticsQuery	[boolean]
	 */ 
	boolean 	pipelineStatisticsQuery;
	
	/**
	 *  VkBool32 	vertexPipelineStoresAndAtomics	[boolean]
	 */ 
	boolean 	vertexPipelineStoresAndAtomics;
	
	/**
	 *  VkBool32 	fragmentStoresAndAtomics	[boolean]
	 */ 
	boolean 	fragmentStoresAndAtomics;
	
	/**
	 *  VkBool32 	shaderTessellationAndGeometryPointSize	[boolean]
	 */ 
	boolean 	shaderTessellationAndGeometryPointSize;
	
	/**
	 *  VkBool32 	shaderImageGatherExtended	[boolean]
	 */ 
	boolean 	shaderImageGatherExtended;
	
	/**
	 *  VkBool32 	shaderStorageImageExtendedFormats	[boolean]
	 */ 
	boolean 	shaderStorageImageExtendedFormats;
	
	/**
	 *  VkBool32 	shaderStorageImageMultisample	[boolean]
	 */ 
	boolean 	shaderStorageImageMultisample;
	
	/**
	 *  VkBool32 	shaderStorageImageReadWithoutFormat	[boolean]
	 */ 
	boolean 	shaderStorageImageReadWithoutFormat;
	
	/**
	 *  VkBool32 	shaderStorageImageWriteWithoutFormat	[boolean]
	 */ 
	boolean 	shaderStorageImageWriteWithoutFormat;
	
	/**
	 *  VkBool32 	shaderUniformBufferArrayDynamicIndexing	[boolean]
	 */ 
	boolean 	shaderUniformBufferArrayDynamicIndexing;
	
	/**
	 *  VkBool32 	shaderSampledImageArrayDynamicIndexing	[boolean]
	 */ 
	boolean 	shaderSampledImageArrayDynamicIndexing;
	
	/**
	 *  VkBool32 	shaderStorageBufferArrayDynamicIndexing	[boolean]
	 */ 
	boolean 	shaderStorageBufferArrayDynamicIndexing;
	
	/**
	 *  VkBool32 	shaderStorageImageArrayDynamicIndexing	[boolean]
	 */ 
	boolean 	shaderStorageImageArrayDynamicIndexing;
	
	/**
	 *  VkBool32 	shaderClipDistance	[boolean]
	 */ 
	boolean 	shaderClipDistance;
	
	/**
	 *  VkBool32 	shaderCullDistance	[boolean]
	 */ 
	boolean 	shaderCullDistance;
	
	/**
	 *  VkBool32 	shaderFloat64	[boolean]
	 */ 
	boolean 	shaderFloat64;
	
	/**
	 *  VkBool32 	shaderInt64	[boolean]
	 */ 
	boolean 	shaderInt64;
	
	/**
	 *  VkBool32 	shaderInt16	[boolean]
	 */ 
	boolean 	shaderInt16;
	
	/**
	 *  VkBool32 	shaderResourceResidency	[boolean]
	 */ 
	boolean 	shaderResourceResidency;
	
	/**
	 *  VkBool32 	shaderResourceMinLod	[boolean]
	 */ 
	boolean 	shaderResourceMinLod;
	
	/**
	 *  VkBool32 	sparseBinding	[boolean]
	 */ 
	boolean 	sparseBinding;
	
	/**
	 *  VkBool32 	sparseResidencyBuffer	[boolean]
	 */ 
	boolean 	sparseResidencyBuffer;
	
	/**
	 *  VkBool32 	sparseResidencyImage2D	[boolean]
	 */ 
	boolean 	sparseResidencyImage2D;
	
	/**
	 *  VkBool32 	sparseResidencyImage3D	[boolean]
	 */ 
	boolean 	sparseResidencyImage3D;
	
	/**
	 *  VkBool32 	sparseResidency2Samples	[boolean]
	 */ 
	boolean 	sparseResidency2Samples;
	
	/**
	 *  VkBool32 	sparseResidency4Samples	[boolean]
	 */ 
	boolean 	sparseResidency4Samples;
	
	/**
	 *  VkBool32 	sparseResidency8Samples	[boolean]
	 */ 
	boolean 	sparseResidency8Samples;
	
	/**
	 *  VkBool32 	sparseResidency16Samples	[boolean]
	 */ 
	boolean 	sparseResidency16Samples;
	
	/**
	 *  VkBool32 	sparseResidencyAliased	[boolean]
	 */ 
	boolean 	sparseResidencyAliased;
	
	/**
	 *  VkBool32 	variableMultisampleRate	[boolean]
	 */ 
	boolean 	variableMultisampleRate;
	
	/**
	 *  VkBool32 	inheritedQueries	[boolean]
	 */ 
	boolean 	inheritedQueries;
	/**
	 * Ctor
	 */
	public VkPhysicalDeviceFeatures(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPhysicalDeviceFeatures(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPhysicalDeviceFeatures(long address){ 
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

	/** 
	 * Static method to create a VkArray for this VkStruct subclass.
	 * @param size - number of elements
	 */
	 public static VkArray<VkPhysicalDeviceFeatures> createVkArray(int size){ 
		 VkPhysicalDeviceFeatures[] array = new VkPhysicalDeviceFeatures[size]; 
		 VkArrayStruct<VkPhysicalDeviceFeatures> vkArray = new VkArrayStruct<VkPhysicalDeviceFeatures> (array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field robustBufferAccess	[boolean]<br>
	 * Prototype: VkBool32  robustBufferAccess
	 * 
	 * @param robustBufferAccess - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures robustBufferAccess(boolean robustBufferAccess){
		 this.robustBufferAccess = robustBufferAccess;
		 setRobustBufferAccess0(this.ptr,  robustBufferAccess);
		 return this;
	 }

	/**
	 * Get method for field robustBufferAccess	[boolean]<br>
	 * Prototype: VkBool32  robustBufferAccess
	 */ 
	 public boolean robustBufferAccess(){
		 boolean var = getRobustBufferAccess0(super.ptr);
		 this.robustBufferAccess = var;
		 return this.robustBufferAccess;
	 }

	/**
	 * Set method for field fullDrawIndexUint32	[boolean]<br>
	 * Prototype: VkBool32  fullDrawIndexUint32
	 * 
	 * @param fullDrawIndexUint32 - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures fullDrawIndexUint32(boolean fullDrawIndexUint32){
		 this.fullDrawIndexUint32 = fullDrawIndexUint32;
		 setFullDrawIndexUint320(this.ptr,  fullDrawIndexUint32);
		 return this;
	 }

	/**
	 * Get method for field fullDrawIndexUint32	[boolean]<br>
	 * Prototype: VkBool32  fullDrawIndexUint32
	 */ 
	 public boolean fullDrawIndexUint32(){
		 boolean var = getFullDrawIndexUint320(super.ptr);
		 this.fullDrawIndexUint32 = var;
		 return this.fullDrawIndexUint32;
	 }

	/**
	 * Set method for field imageCubeArray	[boolean]<br>
	 * Prototype: VkBool32  imageCubeArray
	 * 
	 * @param imageCubeArray - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures imageCubeArray(boolean imageCubeArray){
		 this.imageCubeArray = imageCubeArray;
		 setImageCubeArray0(this.ptr,  imageCubeArray);
		 return this;
	 }

	/**
	 * Get method for field imageCubeArray	[boolean]<br>
	 * Prototype: VkBool32  imageCubeArray
	 */ 
	 public boolean imageCubeArray(){
		 boolean var = getImageCubeArray0(super.ptr);
		 this.imageCubeArray = var;
		 return this.imageCubeArray;
	 }

	/**
	 * Set method for field independentBlend	[boolean]<br>
	 * Prototype: VkBool32  independentBlend
	 * 
	 * @param independentBlend - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures independentBlend(boolean independentBlend){
		 this.independentBlend = independentBlend;
		 setIndependentBlend0(this.ptr,  independentBlend);
		 return this;
	 }

	/**
	 * Get method for field independentBlend	[boolean]<br>
	 * Prototype: VkBool32  independentBlend
	 */ 
	 public boolean independentBlend(){
		 boolean var = getIndependentBlend0(super.ptr);
		 this.independentBlend = var;
		 return this.independentBlend;
	 }

	/**
	 * Set method for field geometryShader	[boolean]<br>
	 * Prototype: VkBool32  geometryShader
	 * 
	 * @param geometryShader - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures geometryShader(boolean geometryShader){
		 this.geometryShader = geometryShader;
		 setGeometryShader0(this.ptr,  geometryShader);
		 return this;
	 }

	/**
	 * Get method for field geometryShader	[boolean]<br>
	 * Prototype: VkBool32  geometryShader
	 */ 
	 public boolean geometryShader(){
		 boolean var = getGeometryShader0(super.ptr);
		 this.geometryShader = var;
		 return this.geometryShader;
	 }

	/**
	 * Set method for field tessellationShader	[boolean]<br>
	 * Prototype: VkBool32  tessellationShader
	 * 
	 * @param tessellationShader - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures tessellationShader(boolean tessellationShader){
		 this.tessellationShader = tessellationShader;
		 setTessellationShader0(this.ptr,  tessellationShader);
		 return this;
	 }

	/**
	 * Get method for field tessellationShader	[boolean]<br>
	 * Prototype: VkBool32  tessellationShader
	 */ 
	 public boolean tessellationShader(){
		 boolean var = getTessellationShader0(super.ptr);
		 this.tessellationShader = var;
		 return this.tessellationShader;
	 }

	/**
	 * Set method for field sampleRateShading	[boolean]<br>
	 * Prototype: VkBool32  sampleRateShading
	 * 
	 * @param sampleRateShading - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures sampleRateShading(boolean sampleRateShading){
		 this.sampleRateShading = sampleRateShading;
		 setSampleRateShading0(this.ptr,  sampleRateShading);
		 return this;
	 }

	/**
	 * Get method for field sampleRateShading	[boolean]<br>
	 * Prototype: VkBool32  sampleRateShading
	 */ 
	 public boolean sampleRateShading(){
		 boolean var = getSampleRateShading0(super.ptr);
		 this.sampleRateShading = var;
		 return this.sampleRateShading;
	 }

	/**
	 * Set method for field dualSrcBlend	[boolean]<br>
	 * Prototype: VkBool32  dualSrcBlend
	 * 
	 * @param dualSrcBlend - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures dualSrcBlend(boolean dualSrcBlend){
		 this.dualSrcBlend = dualSrcBlend;
		 setDualSrcBlend0(this.ptr,  dualSrcBlend);
		 return this;
	 }

	/**
	 * Get method for field dualSrcBlend	[boolean]<br>
	 * Prototype: VkBool32  dualSrcBlend
	 */ 
	 public boolean dualSrcBlend(){
		 boolean var = getDualSrcBlend0(super.ptr);
		 this.dualSrcBlend = var;
		 return this.dualSrcBlend;
	 }

	/**
	 * Set method for field logicOp	[boolean]<br>
	 * Prototype: VkBool32  logicOp
	 * 
	 * @param logicOp - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures logicOp(boolean logicOp){
		 this.logicOp = logicOp;
		 setLogicOp0(this.ptr,  logicOp);
		 return this;
	 }

	/**
	 * Get method for field logicOp	[boolean]<br>
	 * Prototype: VkBool32  logicOp
	 */ 
	 public boolean logicOp(){
		 boolean var = getLogicOp0(super.ptr);
		 this.logicOp = var;
		 return this.logicOp;
	 }

	/**
	 * Set method for field multiDrawIndirect	[boolean]<br>
	 * Prototype: VkBool32  multiDrawIndirect
	 * 
	 * @param multiDrawIndirect - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures multiDrawIndirect(boolean multiDrawIndirect){
		 this.multiDrawIndirect = multiDrawIndirect;
		 setMultiDrawIndirect0(this.ptr,  multiDrawIndirect);
		 return this;
	 }

	/**
	 * Get method for field multiDrawIndirect	[boolean]<br>
	 * Prototype: VkBool32  multiDrawIndirect
	 */ 
	 public boolean multiDrawIndirect(){
		 boolean var = getMultiDrawIndirect0(super.ptr);
		 this.multiDrawIndirect = var;
		 return this.multiDrawIndirect;
	 }

	/**
	 * Set method for field drawIndirectFirstInstance	[boolean]<br>
	 * Prototype: VkBool32  drawIndirectFirstInstance
	 * 
	 * @param drawIndirectFirstInstance - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures drawIndirectFirstInstance(boolean drawIndirectFirstInstance){
		 this.drawIndirectFirstInstance = drawIndirectFirstInstance;
		 setDrawIndirectFirstInstance0(this.ptr,  drawIndirectFirstInstance);
		 return this;
	 }

	/**
	 * Get method for field drawIndirectFirstInstance	[boolean]<br>
	 * Prototype: VkBool32  drawIndirectFirstInstance
	 */ 
	 public boolean drawIndirectFirstInstance(){
		 boolean var = getDrawIndirectFirstInstance0(super.ptr);
		 this.drawIndirectFirstInstance = var;
		 return this.drawIndirectFirstInstance;
	 }

	/**
	 * Set method for field depthClamp	[boolean]<br>
	 * Prototype: VkBool32  depthClamp
	 * 
	 * @param depthClamp - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures depthClamp(boolean depthClamp){
		 this.depthClamp = depthClamp;
		 setDepthClamp0(this.ptr,  depthClamp);
		 return this;
	 }

	/**
	 * Get method for field depthClamp	[boolean]<br>
	 * Prototype: VkBool32  depthClamp
	 */ 
	 public boolean depthClamp(){
		 boolean var = getDepthClamp0(super.ptr);
		 this.depthClamp = var;
		 return this.depthClamp;
	 }

	/**
	 * Set method for field depthBiasClamp	[boolean]<br>
	 * Prototype: VkBool32  depthBiasClamp
	 * 
	 * @param depthBiasClamp - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures depthBiasClamp(boolean depthBiasClamp){
		 this.depthBiasClamp = depthBiasClamp;
		 setDepthBiasClamp0(this.ptr,  depthBiasClamp);
		 return this;
	 }

	/**
	 * Get method for field depthBiasClamp	[boolean]<br>
	 * Prototype: VkBool32  depthBiasClamp
	 */ 
	 public boolean depthBiasClamp(){
		 boolean var = getDepthBiasClamp0(super.ptr);
		 this.depthBiasClamp = var;
		 return this.depthBiasClamp;
	 }

	/**
	 * Set method for field fillModeNonSolid	[boolean]<br>
	 * Prototype: VkBool32  fillModeNonSolid
	 * 
	 * @param fillModeNonSolid - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures fillModeNonSolid(boolean fillModeNonSolid){
		 this.fillModeNonSolid = fillModeNonSolid;
		 setFillModeNonSolid0(this.ptr,  fillModeNonSolid);
		 return this;
	 }

	/**
	 * Get method for field fillModeNonSolid	[boolean]<br>
	 * Prototype: VkBool32  fillModeNonSolid
	 */ 
	 public boolean fillModeNonSolid(){
		 boolean var = getFillModeNonSolid0(super.ptr);
		 this.fillModeNonSolid = var;
		 return this.fillModeNonSolid;
	 }

	/**
	 * Set method for field depthBounds	[boolean]<br>
	 * Prototype: VkBool32  depthBounds
	 * 
	 * @param depthBounds - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures depthBounds(boolean depthBounds){
		 this.depthBounds = depthBounds;
		 setDepthBounds0(this.ptr,  depthBounds);
		 return this;
	 }

	/**
	 * Get method for field depthBounds	[boolean]<br>
	 * Prototype: VkBool32  depthBounds
	 */ 
	 public boolean depthBounds(){
		 boolean var = getDepthBounds0(super.ptr);
		 this.depthBounds = var;
		 return this.depthBounds;
	 }

	/**
	 * Set method for field wideLines	[boolean]<br>
	 * Prototype: VkBool32  wideLines
	 * 
	 * @param wideLines - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures wideLines(boolean wideLines){
		 this.wideLines = wideLines;
		 setWideLines0(this.ptr,  wideLines);
		 return this;
	 }

	/**
	 * Get method for field wideLines	[boolean]<br>
	 * Prototype: VkBool32  wideLines
	 */ 
	 public boolean wideLines(){
		 boolean var = getWideLines0(super.ptr);
		 this.wideLines = var;
		 return this.wideLines;
	 }

	/**
	 * Set method for field largePoints	[boolean]<br>
	 * Prototype: VkBool32  largePoints
	 * 
	 * @param largePoints - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures largePoints(boolean largePoints){
		 this.largePoints = largePoints;
		 setLargePoints0(this.ptr,  largePoints);
		 return this;
	 }

	/**
	 * Get method for field largePoints	[boolean]<br>
	 * Prototype: VkBool32  largePoints
	 */ 
	 public boolean largePoints(){
		 boolean var = getLargePoints0(super.ptr);
		 this.largePoints = var;
		 return this.largePoints;
	 }

	/**
	 * Set method for field alphaToOne	[boolean]<br>
	 * Prototype: VkBool32  alphaToOne
	 * 
	 * @param alphaToOne - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures alphaToOne(boolean alphaToOne){
		 this.alphaToOne = alphaToOne;
		 setAlphaToOne0(this.ptr,  alphaToOne);
		 return this;
	 }

	/**
	 * Get method for field alphaToOne	[boolean]<br>
	 * Prototype: VkBool32  alphaToOne
	 */ 
	 public boolean alphaToOne(){
		 boolean var = getAlphaToOne0(super.ptr);
		 this.alphaToOne = var;
		 return this.alphaToOne;
	 }

	/**
	 * Set method for field multiViewport	[boolean]<br>
	 * Prototype: VkBool32  multiViewport
	 * 
	 * @param multiViewport - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures multiViewport(boolean multiViewport){
		 this.multiViewport = multiViewport;
		 setMultiViewport0(this.ptr,  multiViewport);
		 return this;
	 }

	/**
	 * Get method for field multiViewport	[boolean]<br>
	 * Prototype: VkBool32  multiViewport
	 */ 
	 public boolean multiViewport(){
		 boolean var = getMultiViewport0(super.ptr);
		 this.multiViewport = var;
		 return this.multiViewport;
	 }

	/**
	 * Set method for field samplerAnisotropy	[boolean]<br>
	 * Prototype: VkBool32  samplerAnisotropy
	 * 
	 * @param samplerAnisotropy - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures samplerAnisotropy(boolean samplerAnisotropy){
		 this.samplerAnisotropy = samplerAnisotropy;
		 setSamplerAnisotropy0(this.ptr,  samplerAnisotropy);
		 return this;
	 }

	/**
	 * Get method for field samplerAnisotropy	[boolean]<br>
	 * Prototype: VkBool32  samplerAnisotropy
	 */ 
	 public boolean samplerAnisotropy(){
		 boolean var = getSamplerAnisotropy0(super.ptr);
		 this.samplerAnisotropy = var;
		 return this.samplerAnisotropy;
	 }

	/**
	 * Set method for field textureCompressionETC2	[boolean]<br>
	 * Prototype: VkBool32  textureCompressionETC2
	 * 
	 * @param textureCompressionETC2 - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures textureCompressionETC2(boolean textureCompressionETC2){
		 this.textureCompressionETC2 = textureCompressionETC2;
		 setTextureCompressionETC20(this.ptr,  textureCompressionETC2);
		 return this;
	 }

	/**
	 * Get method for field textureCompressionETC2	[boolean]<br>
	 * Prototype: VkBool32  textureCompressionETC2
	 */ 
	 public boolean textureCompressionETC2(){
		 boolean var = getTextureCompressionETC20(super.ptr);
		 this.textureCompressionETC2 = var;
		 return this.textureCompressionETC2;
	 }

	/**
	 * Set method for field textureCompressionASTC_LDR	[boolean]<br>
	 * Prototype: VkBool32  textureCompressionASTC_LDR
	 * 
	 * @param textureCompressionASTC_LDR - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures textureCompressionASTC_LDR(boolean textureCompressionASTC_LDR){
		 this.textureCompressionASTC_LDR = textureCompressionASTC_LDR;
		 setTextureCompressionASTCJLDR0(this.ptr,  textureCompressionASTC_LDR);
		 return this;
	 }

	/**
	 * Get method for field textureCompressionASTC_LDR	[boolean]<br>
	 * Prototype: VkBool32  textureCompressionASTC_LDR
	 */ 
	 public boolean textureCompressionASTC_LDR(){
		 boolean var = getTextureCompressionASTCJLDR0(super.ptr);
		 this.textureCompressionASTC_LDR = var;
		 return this.textureCompressionASTC_LDR;
	 }

	/**
	 * Set method for field textureCompressionBC	[boolean]<br>
	 * Prototype: VkBool32  textureCompressionBC
	 * 
	 * @param textureCompressionBC - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures textureCompressionBC(boolean textureCompressionBC){
		 this.textureCompressionBC = textureCompressionBC;
		 setTextureCompressionBC0(this.ptr,  textureCompressionBC);
		 return this;
	 }

	/**
	 * Get method for field textureCompressionBC	[boolean]<br>
	 * Prototype: VkBool32  textureCompressionBC
	 */ 
	 public boolean textureCompressionBC(){
		 boolean var = getTextureCompressionBC0(super.ptr);
		 this.textureCompressionBC = var;
		 return this.textureCompressionBC;
	 }

	/**
	 * Set method for field occlusionQueryPrecise	[boolean]<br>
	 * Prototype: VkBool32  occlusionQueryPrecise
	 * 
	 * @param occlusionQueryPrecise - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures occlusionQueryPrecise(boolean occlusionQueryPrecise){
		 this.occlusionQueryPrecise = occlusionQueryPrecise;
		 setOcclusionQueryPrecise0(this.ptr,  occlusionQueryPrecise);
		 return this;
	 }

	/**
	 * Get method for field occlusionQueryPrecise	[boolean]<br>
	 * Prototype: VkBool32  occlusionQueryPrecise
	 */ 
	 public boolean occlusionQueryPrecise(){
		 boolean var = getOcclusionQueryPrecise0(super.ptr);
		 this.occlusionQueryPrecise = var;
		 return this.occlusionQueryPrecise;
	 }

	/**
	 * Set method for field pipelineStatisticsQuery	[boolean]<br>
	 * Prototype: VkBool32  pipelineStatisticsQuery
	 * 
	 * @param pipelineStatisticsQuery - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures pipelineStatisticsQuery(boolean pipelineStatisticsQuery){
		 this.pipelineStatisticsQuery = pipelineStatisticsQuery;
		 setPipelineStatisticsQuery0(this.ptr,  pipelineStatisticsQuery);
		 return this;
	 }

	/**
	 * Get method for field pipelineStatisticsQuery	[boolean]<br>
	 * Prototype: VkBool32  pipelineStatisticsQuery
	 */ 
	 public boolean pipelineStatisticsQuery(){
		 boolean var = getPipelineStatisticsQuery0(super.ptr);
		 this.pipelineStatisticsQuery = var;
		 return this.pipelineStatisticsQuery;
	 }

	/**
	 * Set method for field vertexPipelineStoresAndAtomics	[boolean]<br>
	 * Prototype: VkBool32  vertexPipelineStoresAndAtomics
	 * 
	 * @param vertexPipelineStoresAndAtomics - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures vertexPipelineStoresAndAtomics(boolean vertexPipelineStoresAndAtomics){
		 this.vertexPipelineStoresAndAtomics = vertexPipelineStoresAndAtomics;
		 setVertexPipelineStoresAndAtomics0(this.ptr,  vertexPipelineStoresAndAtomics);
		 return this;
	 }

	/**
	 * Get method for field vertexPipelineStoresAndAtomics	[boolean]<br>
	 * Prototype: VkBool32  vertexPipelineStoresAndAtomics
	 */ 
	 public boolean vertexPipelineStoresAndAtomics(){
		 boolean var = getVertexPipelineStoresAndAtomics0(super.ptr);
		 this.vertexPipelineStoresAndAtomics = var;
		 return this.vertexPipelineStoresAndAtomics;
	 }

	/**
	 * Set method for field fragmentStoresAndAtomics	[boolean]<br>
	 * Prototype: VkBool32  fragmentStoresAndAtomics
	 * 
	 * @param fragmentStoresAndAtomics - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures fragmentStoresAndAtomics(boolean fragmentStoresAndAtomics){
		 this.fragmentStoresAndAtomics = fragmentStoresAndAtomics;
		 setFragmentStoresAndAtomics0(this.ptr,  fragmentStoresAndAtomics);
		 return this;
	 }

	/**
	 * Get method for field fragmentStoresAndAtomics	[boolean]<br>
	 * Prototype: VkBool32  fragmentStoresAndAtomics
	 */ 
	 public boolean fragmentStoresAndAtomics(){
		 boolean var = getFragmentStoresAndAtomics0(super.ptr);
		 this.fragmentStoresAndAtomics = var;
		 return this.fragmentStoresAndAtomics;
	 }

	/**
	 * Set method for field shaderTessellationAndGeometryPointSize	[boolean]<br>
	 * Prototype: VkBool32  shaderTessellationAndGeometryPointSize
	 * 
	 * @param shaderTessellationAndGeometryPointSize - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures shaderTessellationAndGeometryPointSize(boolean shaderTessellationAndGeometryPointSize){
		 this.shaderTessellationAndGeometryPointSize = shaderTessellationAndGeometryPointSize;
		 setShaderTessellationAndGeometryPointSize0(this.ptr,  shaderTessellationAndGeometryPointSize);
		 return this;
	 }

	/**
	 * Get method for field shaderTessellationAndGeometryPointSize	[boolean]<br>
	 * Prototype: VkBool32  shaderTessellationAndGeometryPointSize
	 */ 
	 public boolean shaderTessellationAndGeometryPointSize(){
		 boolean var = getShaderTessellationAndGeometryPointSize0(super.ptr);
		 this.shaderTessellationAndGeometryPointSize = var;
		 return this.shaderTessellationAndGeometryPointSize;
	 }

	/**
	 * Set method for field shaderImageGatherExtended	[boolean]<br>
	 * Prototype: VkBool32  shaderImageGatherExtended
	 * 
	 * @param shaderImageGatherExtended - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures shaderImageGatherExtended(boolean shaderImageGatherExtended){
		 this.shaderImageGatherExtended = shaderImageGatherExtended;
		 setShaderImageGatherExtended0(this.ptr,  shaderImageGatherExtended);
		 return this;
	 }

	/**
	 * Get method for field shaderImageGatherExtended	[boolean]<br>
	 * Prototype: VkBool32  shaderImageGatherExtended
	 */ 
	 public boolean shaderImageGatherExtended(){
		 boolean var = getShaderImageGatherExtended0(super.ptr);
		 this.shaderImageGatherExtended = var;
		 return this.shaderImageGatherExtended;
	 }

	/**
	 * Set method for field shaderStorageImageExtendedFormats	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageExtendedFormats
	 * 
	 * @param shaderStorageImageExtendedFormats - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures shaderStorageImageExtendedFormats(boolean shaderStorageImageExtendedFormats){
		 this.shaderStorageImageExtendedFormats = shaderStorageImageExtendedFormats;
		 setShaderStorageImageExtendedFormats0(this.ptr,  shaderStorageImageExtendedFormats);
		 return this;
	 }

	/**
	 * Get method for field shaderStorageImageExtendedFormats	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageExtendedFormats
	 */ 
	 public boolean shaderStorageImageExtendedFormats(){
		 boolean var = getShaderStorageImageExtendedFormats0(super.ptr);
		 this.shaderStorageImageExtendedFormats = var;
		 return this.shaderStorageImageExtendedFormats;
	 }

	/**
	 * Set method for field shaderStorageImageMultisample	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageMultisample
	 * 
	 * @param shaderStorageImageMultisample - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures shaderStorageImageMultisample(boolean shaderStorageImageMultisample){
		 this.shaderStorageImageMultisample = shaderStorageImageMultisample;
		 setShaderStorageImageMultisample0(this.ptr,  shaderStorageImageMultisample);
		 return this;
	 }

	/**
	 * Get method for field shaderStorageImageMultisample	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageMultisample
	 */ 
	 public boolean shaderStorageImageMultisample(){
		 boolean var = getShaderStorageImageMultisample0(super.ptr);
		 this.shaderStorageImageMultisample = var;
		 return this.shaderStorageImageMultisample;
	 }

	/**
	 * Set method for field shaderStorageImageReadWithoutFormat	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageReadWithoutFormat
	 * 
	 * @param shaderStorageImageReadWithoutFormat - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures shaderStorageImageReadWithoutFormat(boolean shaderStorageImageReadWithoutFormat){
		 this.shaderStorageImageReadWithoutFormat = shaderStorageImageReadWithoutFormat;
		 setShaderStorageImageReadWithoutFormat0(this.ptr,  shaderStorageImageReadWithoutFormat);
		 return this;
	 }

	/**
	 * Get method for field shaderStorageImageReadWithoutFormat	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageReadWithoutFormat
	 */ 
	 public boolean shaderStorageImageReadWithoutFormat(){
		 boolean var = getShaderStorageImageReadWithoutFormat0(super.ptr);
		 this.shaderStorageImageReadWithoutFormat = var;
		 return this.shaderStorageImageReadWithoutFormat;
	 }

	/**
	 * Set method for field shaderStorageImageWriteWithoutFormat	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageWriteWithoutFormat
	 * 
	 * @param shaderStorageImageWriteWithoutFormat - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures shaderStorageImageWriteWithoutFormat(boolean shaderStorageImageWriteWithoutFormat){
		 this.shaderStorageImageWriteWithoutFormat = shaderStorageImageWriteWithoutFormat;
		 setShaderStorageImageWriteWithoutFormat0(this.ptr,  shaderStorageImageWriteWithoutFormat);
		 return this;
	 }

	/**
	 * Get method for field shaderStorageImageWriteWithoutFormat	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageWriteWithoutFormat
	 */ 
	 public boolean shaderStorageImageWriteWithoutFormat(){
		 boolean var = getShaderStorageImageWriteWithoutFormat0(super.ptr);
		 this.shaderStorageImageWriteWithoutFormat = var;
		 return this.shaderStorageImageWriteWithoutFormat;
	 }

	/**
	 * Set method for field shaderUniformBufferArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderUniformBufferArrayDynamicIndexing
	 * 
	 * @param shaderUniformBufferArrayDynamicIndexing - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures shaderUniformBufferArrayDynamicIndexing(boolean shaderUniformBufferArrayDynamicIndexing){
		 this.shaderUniformBufferArrayDynamicIndexing = shaderUniformBufferArrayDynamicIndexing;
		 setShaderUniformBufferArrayDynamicIndexing0(this.ptr,  shaderUniformBufferArrayDynamicIndexing);
		 return this;
	 }

	/**
	 * Get method for field shaderUniformBufferArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderUniformBufferArrayDynamicIndexing
	 */ 
	 public boolean shaderUniformBufferArrayDynamicIndexing(){
		 boolean var = getShaderUniformBufferArrayDynamicIndexing0(super.ptr);
		 this.shaderUniformBufferArrayDynamicIndexing = var;
		 return this.shaderUniformBufferArrayDynamicIndexing;
	 }

	/**
	 * Set method for field shaderSampledImageArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderSampledImageArrayDynamicIndexing
	 * 
	 * @param shaderSampledImageArrayDynamicIndexing - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures shaderSampledImageArrayDynamicIndexing(boolean shaderSampledImageArrayDynamicIndexing){
		 this.shaderSampledImageArrayDynamicIndexing = shaderSampledImageArrayDynamicIndexing;
		 setShaderSampledImageArrayDynamicIndexing0(this.ptr,  shaderSampledImageArrayDynamicIndexing);
		 return this;
	 }

	/**
	 * Get method for field shaderSampledImageArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderSampledImageArrayDynamicIndexing
	 */ 
	 public boolean shaderSampledImageArrayDynamicIndexing(){
		 boolean var = getShaderSampledImageArrayDynamicIndexing0(super.ptr);
		 this.shaderSampledImageArrayDynamicIndexing = var;
		 return this.shaderSampledImageArrayDynamicIndexing;
	 }

	/**
	 * Set method for field shaderStorageBufferArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageBufferArrayDynamicIndexing
	 * 
	 * @param shaderStorageBufferArrayDynamicIndexing - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures shaderStorageBufferArrayDynamicIndexing(boolean shaderStorageBufferArrayDynamicIndexing){
		 this.shaderStorageBufferArrayDynamicIndexing = shaderStorageBufferArrayDynamicIndexing;
		 setShaderStorageBufferArrayDynamicIndexing0(this.ptr,  shaderStorageBufferArrayDynamicIndexing);
		 return this;
	 }

	/**
	 * Get method for field shaderStorageBufferArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageBufferArrayDynamicIndexing
	 */ 
	 public boolean shaderStorageBufferArrayDynamicIndexing(){
		 boolean var = getShaderStorageBufferArrayDynamicIndexing0(super.ptr);
		 this.shaderStorageBufferArrayDynamicIndexing = var;
		 return this.shaderStorageBufferArrayDynamicIndexing;
	 }

	/**
	 * Set method for field shaderStorageImageArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageArrayDynamicIndexing
	 * 
	 * @param shaderStorageImageArrayDynamicIndexing - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures shaderStorageImageArrayDynamicIndexing(boolean shaderStorageImageArrayDynamicIndexing){
		 this.shaderStorageImageArrayDynamicIndexing = shaderStorageImageArrayDynamicIndexing;
		 setShaderStorageImageArrayDynamicIndexing0(this.ptr,  shaderStorageImageArrayDynamicIndexing);
		 return this;
	 }

	/**
	 * Get method for field shaderStorageImageArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageArrayDynamicIndexing
	 */ 
	 public boolean shaderStorageImageArrayDynamicIndexing(){
		 boolean var = getShaderStorageImageArrayDynamicIndexing0(super.ptr);
		 this.shaderStorageImageArrayDynamicIndexing = var;
		 return this.shaderStorageImageArrayDynamicIndexing;
	 }

	/**
	 * Set method for field shaderClipDistance	[boolean]<br>
	 * Prototype: VkBool32  shaderClipDistance
	 * 
	 * @param shaderClipDistance - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures shaderClipDistance(boolean shaderClipDistance){
		 this.shaderClipDistance = shaderClipDistance;
		 setShaderClipDistance0(this.ptr,  shaderClipDistance);
		 return this;
	 }

	/**
	 * Get method for field shaderClipDistance	[boolean]<br>
	 * Prototype: VkBool32  shaderClipDistance
	 */ 
	 public boolean shaderClipDistance(){
		 boolean var = getShaderClipDistance0(super.ptr);
		 this.shaderClipDistance = var;
		 return this.shaderClipDistance;
	 }

	/**
	 * Set method for field shaderCullDistance	[boolean]<br>
	 * Prototype: VkBool32  shaderCullDistance
	 * 
	 * @param shaderCullDistance - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures shaderCullDistance(boolean shaderCullDistance){
		 this.shaderCullDistance = shaderCullDistance;
		 setShaderCullDistance0(this.ptr,  shaderCullDistance);
		 return this;
	 }

	/**
	 * Get method for field shaderCullDistance	[boolean]<br>
	 * Prototype: VkBool32  shaderCullDistance
	 */ 
	 public boolean shaderCullDistance(){
		 boolean var = getShaderCullDistance0(super.ptr);
		 this.shaderCullDistance = var;
		 return this.shaderCullDistance;
	 }

	/**
	 * Set method for field shaderFloat64	[boolean]<br>
	 * Prototype: VkBool32  shaderFloat64
	 * 
	 * @param shaderFloat64 - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures shaderFloat64(boolean shaderFloat64){
		 this.shaderFloat64 = shaderFloat64;
		 setShaderFloat640(this.ptr,  shaderFloat64);
		 return this;
	 }

	/**
	 * Get method for field shaderFloat64	[boolean]<br>
	 * Prototype: VkBool32  shaderFloat64
	 */ 
	 public boolean shaderFloat64(){
		 boolean var = getShaderFloat640(super.ptr);
		 this.shaderFloat64 = var;
		 return this.shaderFloat64;
	 }

	/**
	 * Set method for field shaderInt64	[boolean]<br>
	 * Prototype: VkBool32  shaderInt64
	 * 
	 * @param shaderInt64 - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures shaderInt64(boolean shaderInt64){
		 this.shaderInt64 = shaderInt64;
		 setShaderInt640(this.ptr,  shaderInt64);
		 return this;
	 }

	/**
	 * Get method for field shaderInt64	[boolean]<br>
	 * Prototype: VkBool32  shaderInt64
	 */ 
	 public boolean shaderInt64(){
		 boolean var = getShaderInt640(super.ptr);
		 this.shaderInt64 = var;
		 return this.shaderInt64;
	 }

	/**
	 * Set method for field shaderInt16	[boolean]<br>
	 * Prototype: VkBool32  shaderInt16
	 * 
	 * @param shaderInt16 - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures shaderInt16(boolean shaderInt16){
		 this.shaderInt16 = shaderInt16;
		 setShaderInt160(this.ptr,  shaderInt16);
		 return this;
	 }

	/**
	 * Get method for field shaderInt16	[boolean]<br>
	 * Prototype: VkBool32  shaderInt16
	 */ 
	 public boolean shaderInt16(){
		 boolean var = getShaderInt160(super.ptr);
		 this.shaderInt16 = var;
		 return this.shaderInt16;
	 }

	/**
	 * Set method for field shaderResourceResidency	[boolean]<br>
	 * Prototype: VkBool32  shaderResourceResidency
	 * 
	 * @param shaderResourceResidency - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures shaderResourceResidency(boolean shaderResourceResidency){
		 this.shaderResourceResidency = shaderResourceResidency;
		 setShaderResourceResidency0(this.ptr,  shaderResourceResidency);
		 return this;
	 }

	/**
	 * Get method for field shaderResourceResidency	[boolean]<br>
	 * Prototype: VkBool32  shaderResourceResidency
	 */ 
	 public boolean shaderResourceResidency(){
		 boolean var = getShaderResourceResidency0(super.ptr);
		 this.shaderResourceResidency = var;
		 return this.shaderResourceResidency;
	 }

	/**
	 * Set method for field shaderResourceMinLod	[boolean]<br>
	 * Prototype: VkBool32  shaderResourceMinLod
	 * 
	 * @param shaderResourceMinLod - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures shaderResourceMinLod(boolean shaderResourceMinLod){
		 this.shaderResourceMinLod = shaderResourceMinLod;
		 setShaderResourceMinLod0(this.ptr,  shaderResourceMinLod);
		 return this;
	 }

	/**
	 * Get method for field shaderResourceMinLod	[boolean]<br>
	 * Prototype: VkBool32  shaderResourceMinLod
	 */ 
	 public boolean shaderResourceMinLod(){
		 boolean var = getShaderResourceMinLod0(super.ptr);
		 this.shaderResourceMinLod = var;
		 return this.shaderResourceMinLod;
	 }

	/**
	 * Set method for field sparseBinding	[boolean]<br>
	 * Prototype: VkBool32  sparseBinding
	 * 
	 * @param sparseBinding - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures sparseBinding(boolean sparseBinding){
		 this.sparseBinding = sparseBinding;
		 setSparseBinding0(this.ptr,  sparseBinding);
		 return this;
	 }

	/**
	 * Get method for field sparseBinding	[boolean]<br>
	 * Prototype: VkBool32  sparseBinding
	 */ 
	 public boolean sparseBinding(){
		 boolean var = getSparseBinding0(super.ptr);
		 this.sparseBinding = var;
		 return this.sparseBinding;
	 }

	/**
	 * Set method for field sparseResidencyBuffer	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyBuffer
	 * 
	 * @param sparseResidencyBuffer - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures sparseResidencyBuffer(boolean sparseResidencyBuffer){
		 this.sparseResidencyBuffer = sparseResidencyBuffer;
		 setSparseResidencyBuffer0(this.ptr,  sparseResidencyBuffer);
		 return this;
	 }

	/**
	 * Get method for field sparseResidencyBuffer	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyBuffer
	 */ 
	 public boolean sparseResidencyBuffer(){
		 boolean var = getSparseResidencyBuffer0(super.ptr);
		 this.sparseResidencyBuffer = var;
		 return this.sparseResidencyBuffer;
	 }

	/**
	 * Set method for field sparseResidencyImage2D	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyImage2D
	 * 
	 * @param sparseResidencyImage2D - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures sparseResidencyImage2D(boolean sparseResidencyImage2D){
		 this.sparseResidencyImage2D = sparseResidencyImage2D;
		 setSparseResidencyImage2D0(this.ptr,  sparseResidencyImage2D);
		 return this;
	 }

	/**
	 * Get method for field sparseResidencyImage2D	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyImage2D
	 */ 
	 public boolean sparseResidencyImage2D(){
		 boolean var = getSparseResidencyImage2D0(super.ptr);
		 this.sparseResidencyImage2D = var;
		 return this.sparseResidencyImage2D;
	 }

	/**
	 * Set method for field sparseResidencyImage3D	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyImage3D
	 * 
	 * @param sparseResidencyImage3D - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures sparseResidencyImage3D(boolean sparseResidencyImage3D){
		 this.sparseResidencyImage3D = sparseResidencyImage3D;
		 setSparseResidencyImage3D0(this.ptr,  sparseResidencyImage3D);
		 return this;
	 }

	/**
	 * Get method for field sparseResidencyImage3D	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyImage3D
	 */ 
	 public boolean sparseResidencyImage3D(){
		 boolean var = getSparseResidencyImage3D0(super.ptr);
		 this.sparseResidencyImage3D = var;
		 return this.sparseResidencyImage3D;
	 }

	/**
	 * Set method for field sparseResidency2Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency2Samples
	 * 
	 * @param sparseResidency2Samples - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures sparseResidency2Samples(boolean sparseResidency2Samples){
		 this.sparseResidency2Samples = sparseResidency2Samples;
		 setSparseResidency2Samples0(this.ptr,  sparseResidency2Samples);
		 return this;
	 }

	/**
	 * Get method for field sparseResidency2Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency2Samples
	 */ 
	 public boolean sparseResidency2Samples(){
		 boolean var = getSparseResidency2Samples0(super.ptr);
		 this.sparseResidency2Samples = var;
		 return this.sparseResidency2Samples;
	 }

	/**
	 * Set method for field sparseResidency4Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency4Samples
	 * 
	 * @param sparseResidency4Samples - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures sparseResidency4Samples(boolean sparseResidency4Samples){
		 this.sparseResidency4Samples = sparseResidency4Samples;
		 setSparseResidency4Samples0(this.ptr,  sparseResidency4Samples);
		 return this;
	 }

	/**
	 * Get method for field sparseResidency4Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency4Samples
	 */ 
	 public boolean sparseResidency4Samples(){
		 boolean var = getSparseResidency4Samples0(super.ptr);
		 this.sparseResidency4Samples = var;
		 return this.sparseResidency4Samples;
	 }

	/**
	 * Set method for field sparseResidency8Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency8Samples
	 * 
	 * @param sparseResidency8Samples - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures sparseResidency8Samples(boolean sparseResidency8Samples){
		 this.sparseResidency8Samples = sparseResidency8Samples;
		 setSparseResidency8Samples0(this.ptr,  sparseResidency8Samples);
		 return this;
	 }

	/**
	 * Get method for field sparseResidency8Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency8Samples
	 */ 
	 public boolean sparseResidency8Samples(){
		 boolean var = getSparseResidency8Samples0(super.ptr);
		 this.sparseResidency8Samples = var;
		 return this.sparseResidency8Samples;
	 }

	/**
	 * Set method for field sparseResidency16Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency16Samples
	 * 
	 * @param sparseResidency16Samples - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures sparseResidency16Samples(boolean sparseResidency16Samples){
		 this.sparseResidency16Samples = sparseResidency16Samples;
		 setSparseResidency16Samples0(this.ptr,  sparseResidency16Samples);
		 return this;
	 }

	/**
	 * Get method for field sparseResidency16Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency16Samples
	 */ 
	 public boolean sparseResidency16Samples(){
		 boolean var = getSparseResidency16Samples0(super.ptr);
		 this.sparseResidency16Samples = var;
		 return this.sparseResidency16Samples;
	 }

	/**
	 * Set method for field sparseResidencyAliased	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyAliased
	 * 
	 * @param sparseResidencyAliased - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures sparseResidencyAliased(boolean sparseResidencyAliased){
		 this.sparseResidencyAliased = sparseResidencyAliased;
		 setSparseResidencyAliased0(this.ptr,  sparseResidencyAliased);
		 return this;
	 }

	/**
	 * Get method for field sparseResidencyAliased	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyAliased
	 */ 
	 public boolean sparseResidencyAliased(){
		 boolean var = getSparseResidencyAliased0(super.ptr);
		 this.sparseResidencyAliased = var;
		 return this.sparseResidencyAliased;
	 }

	/**
	 * Set method for field variableMultisampleRate	[boolean]<br>
	 * Prototype: VkBool32  variableMultisampleRate
	 * 
	 * @param variableMultisampleRate - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures variableMultisampleRate(boolean variableMultisampleRate){
		 this.variableMultisampleRate = variableMultisampleRate;
		 setVariableMultisampleRate0(this.ptr,  variableMultisampleRate);
		 return this;
	 }

	/**
	 * Get method for field variableMultisampleRate	[boolean]<br>
	 * Prototype: VkBool32  variableMultisampleRate
	 */ 
	 public boolean variableMultisampleRate(){
		 boolean var = getVariableMultisampleRate0(super.ptr);
		 this.variableMultisampleRate = var;
		 return this.variableMultisampleRate;
	 }

	/**
	 * Set method for field inheritedQueries	[boolean]<br>
	 * Prototype: VkBool32  inheritedQueries
	 * 
	 * @param inheritedQueries - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceFeatures inheritedQueries(boolean inheritedQueries){
		 this.inheritedQueries = inheritedQueries;
		 setInheritedQueries0(this.ptr,  inheritedQueries);
		 return this;
	 }

	/**
	 * Get method for field inheritedQueries	[boolean]<br>
	 * Prototype: VkBool32  inheritedQueries
	 */ 
	 public boolean inheritedQueries(){
		 boolean var = getInheritedQueries0(super.ptr);
		 this.inheritedQueries = var;
		 return this.inheritedQueries;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkPhysicalDeviceFeatures [ ")
				.append("robustBufferAccess: ").append(robustBufferAccess() )
				.append(",\n fullDrawIndexUint32: ")
				.append(fullDrawIndexUint32() )
				.append(",\n imageCubeArray: ")
				.append(imageCubeArray() )
				.append(",\n independentBlend: ")
				.append(independentBlend() )
				.append(",\n geometryShader: ")
				.append(geometryShader() )
				.append(",\n tessellationShader: ")
				.append(tessellationShader() )
				.append(",\n sampleRateShading: ")
				.append(sampleRateShading() )
				.append(",\n dualSrcBlend: ")
				.append(dualSrcBlend() )
				.append(",\n logicOp: ")
				.append(logicOp() )
				.append(",\n multiDrawIndirect: ")
				.append(multiDrawIndirect() )
				.append(",\n drawIndirectFirstInstance: ")
				.append(drawIndirectFirstInstance() )
				.append(",\n depthClamp: ")
				.append(depthClamp() )
				.append(",\n depthBiasClamp: ")
				.append(depthBiasClamp() )
				.append(",\n fillModeNonSolid: ")
				.append(fillModeNonSolid() )
				.append(",\n depthBounds: ")
				.append(depthBounds() )
				.append(",\n wideLines: ")
				.append(wideLines() )
				.append(",\n largePoints: ")
				.append(largePoints() )
				.append(",\n alphaToOne: ")
				.append(alphaToOne() )
				.append(",\n multiViewport: ")
				.append(multiViewport() )
				.append(",\n samplerAnisotropy: ")
				.append(samplerAnisotropy() )
				.append(",\n textureCompressionETC2: ")
				.append(textureCompressionETC2() )
				.append(",\n textureCompressionASTC_LDR: ")
				.append(textureCompressionASTC_LDR() )
				.append(",\n textureCompressionBC: ")
				.append(textureCompressionBC() )
				.append(",\n occlusionQueryPrecise: ")
				.append(occlusionQueryPrecise() )
				.append(",\n pipelineStatisticsQuery: ")
				.append(pipelineStatisticsQuery() )
				.append(",\n vertexPipelineStoresAndAtomics: ")
				.append(vertexPipelineStoresAndAtomics() )
				.append(",\n fragmentStoresAndAtomics: ")
				.append(fragmentStoresAndAtomics() )
				.append(",\n shaderTessellationAndGeometryPointSize: ")
				.append(shaderTessellationAndGeometryPointSize() )
				.append(",\n shaderImageGatherExtended: ")
				.append(shaderImageGatherExtended() )
				.append(",\n shaderStorageImageExtendedFormats: ")
				.append(shaderStorageImageExtendedFormats() )
				.append(",\n shaderStorageImageMultisample: ")
				.append(shaderStorageImageMultisample() )
				.append(",\n shaderStorageImageReadWithoutFormat: ")
				.append(shaderStorageImageReadWithoutFormat() )
				.append(",\n shaderStorageImageWriteWithoutFormat: ")
				.append(shaderStorageImageWriteWithoutFormat() )
				.append(",\n shaderUniformBufferArrayDynamicIndexing: ")
				.append(shaderUniformBufferArrayDynamicIndexing() )
				.append(",\n shaderSampledImageArrayDynamicIndexing: ")
				.append(shaderSampledImageArrayDynamicIndexing() )
				.append(",\n shaderStorageBufferArrayDynamicIndexing: ")
				.append(shaderStorageBufferArrayDynamicIndexing() )
				.append(",\n shaderStorageImageArrayDynamicIndexing: ")
				.append(shaderStorageImageArrayDynamicIndexing() )
				.append(",\n shaderClipDistance: ")
				.append(shaderClipDistance() )
				.append(",\n shaderCullDistance: ")
				.append(shaderCullDistance() )
				.append(",\n shaderFloat64: ")
				.append(shaderFloat64() )
				.append(",\n shaderInt64: ")
				.append(shaderInt64() )
				.append(",\n shaderInt16: ")
				.append(shaderInt16() )
				.append(",\n shaderResourceResidency: ")
				.append(shaderResourceResidency() )
				.append(",\n shaderResourceMinLod: ")
				.append(shaderResourceMinLod() )
				.append(",\n sparseBinding: ")
				.append(sparseBinding() )
				.append(",\n sparseResidencyBuffer: ")
				.append(sparseResidencyBuffer() )
				.append(",\n sparseResidencyImage2D: ")
				.append(sparseResidencyImage2D() )
				.append(",\n sparseResidencyImage3D: ")
				.append(sparseResidencyImage3D() )
				.append(",\n sparseResidency2Samples: ")
				.append(sparseResidency2Samples() )
				.append(",\n sparseResidency4Samples: ")
				.append(sparseResidency4Samples() )
				.append(",\n sparseResidency8Samples: ")
				.append(sparseResidency8Samples() )
				.append(",\n sparseResidency16Samples: ")
				.append(sparseResidency16Samples() )
				.append(",\n sparseResidencyAliased: ")
				.append(sparseResidencyAliased() )
				.append(",\n variableMultisampleRate: ")
				.append(variableMultisampleRate() )
				.append(",\n inheritedQueries: ")
				.append(inheritedQueries() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field robustBufferAccess	[boolean]<br>
	 * Prototype: VkBool32  robustBufferAccess
	 */ 
	 private static native void setRobustBufferAccess0(Buffer ptr, boolean  _robustBufferAccess);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->robustBufferAccess = (VkBool32) (_robustBufferAccess);
	  */

	/**
	 * Native GET method for field robustBufferAccess	[boolean]<br>
	 * Prototype: VkBool32  robustBufferAccess
	 */ 
	 private static native boolean  getRobustBufferAccess0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->robustBufferAccess);
	 */

	/**
	 * Native SET method for field fullDrawIndexUint32	[boolean]<br>
	 * Prototype: VkBool32  fullDrawIndexUint32
	 */ 
	 private static native void setFullDrawIndexUint320(Buffer ptr, boolean  _fullDrawIndexUint32);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->fullDrawIndexUint32 = (VkBool32) (_fullDrawIndexUint32);
	  */

	/**
	 * Native GET method for field fullDrawIndexUint32	[boolean]<br>
	 * Prototype: VkBool32  fullDrawIndexUint32
	 */ 
	 private static native boolean  getFullDrawIndexUint320(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->fullDrawIndexUint32);
	 */

	/**
	 * Native SET method for field imageCubeArray	[boolean]<br>
	 * Prototype: VkBool32  imageCubeArray
	 */ 
	 private static native void setImageCubeArray0(Buffer ptr, boolean  _imageCubeArray);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->imageCubeArray = (VkBool32) (_imageCubeArray);
	  */

	/**
	 * Native GET method for field imageCubeArray	[boolean]<br>
	 * Prototype: VkBool32  imageCubeArray
	 */ 
	 private static native boolean  getImageCubeArray0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->imageCubeArray);
	 */

	/**
	 * Native SET method for field independentBlend	[boolean]<br>
	 * Prototype: VkBool32  independentBlend
	 */ 
	 private static native void setIndependentBlend0(Buffer ptr, boolean  _independentBlend);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->independentBlend = (VkBool32) (_independentBlend);
	  */

	/**
	 * Native GET method for field independentBlend	[boolean]<br>
	 * Prototype: VkBool32  independentBlend
	 */ 
	 private static native boolean  getIndependentBlend0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->independentBlend);
	 */

	/**
	 * Native SET method for field geometryShader	[boolean]<br>
	 * Prototype: VkBool32  geometryShader
	 */ 
	 private static native void setGeometryShader0(Buffer ptr, boolean  _geometryShader);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->geometryShader = (VkBool32) (_geometryShader);
	  */

	/**
	 * Native GET method for field geometryShader	[boolean]<br>
	 * Prototype: VkBool32  geometryShader
	 */ 
	 private static native boolean  getGeometryShader0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->geometryShader);
	 */

	/**
	 * Native SET method for field tessellationShader	[boolean]<br>
	 * Prototype: VkBool32  tessellationShader
	 */ 
	 private static native void setTessellationShader0(Buffer ptr, boolean  _tessellationShader);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->tessellationShader = (VkBool32) (_tessellationShader);
	  */

	/**
	 * Native GET method for field tessellationShader	[boolean]<br>
	 * Prototype: VkBool32  tessellationShader
	 */ 
	 private static native boolean  getTessellationShader0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->tessellationShader);
	 */

	/**
	 * Native SET method for field sampleRateShading	[boolean]<br>
	 * Prototype: VkBool32  sampleRateShading
	 */ 
	 private static native void setSampleRateShading0(Buffer ptr, boolean  _sampleRateShading);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->sampleRateShading = (VkBool32) (_sampleRateShading);
	  */

	/**
	 * Native GET method for field sampleRateShading	[boolean]<br>
	 * Prototype: VkBool32  sampleRateShading
	 */ 
	 private static native boolean  getSampleRateShading0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->sampleRateShading);
	 */

	/**
	 * Native SET method for field dualSrcBlend	[boolean]<br>
	 * Prototype: VkBool32  dualSrcBlend
	 */ 
	 private static native void setDualSrcBlend0(Buffer ptr, boolean  _dualSrcBlend);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->dualSrcBlend = (VkBool32) (_dualSrcBlend);
	  */

	/**
	 * Native GET method for field dualSrcBlend	[boolean]<br>
	 * Prototype: VkBool32  dualSrcBlend
	 */ 
	 private static native boolean  getDualSrcBlend0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->dualSrcBlend);
	 */

	/**
	 * Native SET method for field logicOp	[boolean]<br>
	 * Prototype: VkBool32  logicOp
	 */ 
	 private static native void setLogicOp0(Buffer ptr, boolean  _logicOp);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->logicOp = (VkBool32) (_logicOp);
	  */

	/**
	 * Native GET method for field logicOp	[boolean]<br>
	 * Prototype: VkBool32  logicOp
	 */ 
	 private static native boolean  getLogicOp0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->logicOp);
	 */

	/**
	 * Native SET method for field multiDrawIndirect	[boolean]<br>
	 * Prototype: VkBool32  multiDrawIndirect
	 */ 
	 private static native void setMultiDrawIndirect0(Buffer ptr, boolean  _multiDrawIndirect);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->multiDrawIndirect = (VkBool32) (_multiDrawIndirect);
	  */

	/**
	 * Native GET method for field multiDrawIndirect	[boolean]<br>
	 * Prototype: VkBool32  multiDrawIndirect
	 */ 
	 private static native boolean  getMultiDrawIndirect0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->multiDrawIndirect);
	 */

	/**
	 * Native SET method for field drawIndirectFirstInstance	[boolean]<br>
	 * Prototype: VkBool32  drawIndirectFirstInstance
	 */ 
	 private static native void setDrawIndirectFirstInstance0(Buffer ptr, boolean  _drawIndirectFirstInstance);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->drawIndirectFirstInstance = (VkBool32) (_drawIndirectFirstInstance);
	  */

	/**
	 * Native GET method for field drawIndirectFirstInstance	[boolean]<br>
	 * Prototype: VkBool32  drawIndirectFirstInstance
	 */ 
	 private static native boolean  getDrawIndirectFirstInstance0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->drawIndirectFirstInstance);
	 */

	/**
	 * Native SET method for field depthClamp	[boolean]<br>
	 * Prototype: VkBool32  depthClamp
	 */ 
	 private static native void setDepthClamp0(Buffer ptr, boolean  _depthClamp);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->depthClamp = (VkBool32) (_depthClamp);
	  */

	/**
	 * Native GET method for field depthClamp	[boolean]<br>
	 * Prototype: VkBool32  depthClamp
	 */ 
	 private static native boolean  getDepthClamp0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->depthClamp);
	 */

	/**
	 * Native SET method for field depthBiasClamp	[boolean]<br>
	 * Prototype: VkBool32  depthBiasClamp
	 */ 
	 private static native void setDepthBiasClamp0(Buffer ptr, boolean  _depthBiasClamp);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->depthBiasClamp = (VkBool32) (_depthBiasClamp);
	  */

	/**
	 * Native GET method for field depthBiasClamp	[boolean]<br>
	 * Prototype: VkBool32  depthBiasClamp
	 */ 
	 private static native boolean  getDepthBiasClamp0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->depthBiasClamp);
	 */

	/**
	 * Native SET method for field fillModeNonSolid	[boolean]<br>
	 * Prototype: VkBool32  fillModeNonSolid
	 */ 
	 private static native void setFillModeNonSolid0(Buffer ptr, boolean  _fillModeNonSolid);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->fillModeNonSolid = (VkBool32) (_fillModeNonSolid);
	  */

	/**
	 * Native GET method for field fillModeNonSolid	[boolean]<br>
	 * Prototype: VkBool32  fillModeNonSolid
	 */ 
	 private static native boolean  getFillModeNonSolid0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->fillModeNonSolid);
	 */

	/**
	 * Native SET method for field depthBounds	[boolean]<br>
	 * Prototype: VkBool32  depthBounds
	 */ 
	 private static native void setDepthBounds0(Buffer ptr, boolean  _depthBounds);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->depthBounds = (VkBool32) (_depthBounds);
	  */

	/**
	 * Native GET method for field depthBounds	[boolean]<br>
	 * Prototype: VkBool32  depthBounds
	 */ 
	 private static native boolean  getDepthBounds0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->depthBounds);
	 */

	/**
	 * Native SET method for field wideLines	[boolean]<br>
	 * Prototype: VkBool32  wideLines
	 */ 
	 private static native void setWideLines0(Buffer ptr, boolean  _wideLines);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->wideLines = (VkBool32) (_wideLines);
	  */

	/**
	 * Native GET method for field wideLines	[boolean]<br>
	 * Prototype: VkBool32  wideLines
	 */ 
	 private static native boolean  getWideLines0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->wideLines);
	 */

	/**
	 * Native SET method for field largePoints	[boolean]<br>
	 * Prototype: VkBool32  largePoints
	 */ 
	 private static native void setLargePoints0(Buffer ptr, boolean  _largePoints);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->largePoints = (VkBool32) (_largePoints);
	  */

	/**
	 * Native GET method for field largePoints	[boolean]<br>
	 * Prototype: VkBool32  largePoints
	 */ 
	 private static native boolean  getLargePoints0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->largePoints);
	 */

	/**
	 * Native SET method for field alphaToOne	[boolean]<br>
	 * Prototype: VkBool32  alphaToOne
	 */ 
	 private static native void setAlphaToOne0(Buffer ptr, boolean  _alphaToOne);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->alphaToOne = (VkBool32) (_alphaToOne);
	  */

	/**
	 * Native GET method for field alphaToOne	[boolean]<br>
	 * Prototype: VkBool32  alphaToOne
	 */ 
	 private static native boolean  getAlphaToOne0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->alphaToOne);
	 */

	/**
	 * Native SET method for field multiViewport	[boolean]<br>
	 * Prototype: VkBool32  multiViewport
	 */ 
	 private static native void setMultiViewport0(Buffer ptr, boolean  _multiViewport);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->multiViewport = (VkBool32) (_multiViewport);
	  */

	/**
	 * Native GET method for field multiViewport	[boolean]<br>
	 * Prototype: VkBool32  multiViewport
	 */ 
	 private static native boolean  getMultiViewport0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->multiViewport);
	 */

	/**
	 * Native SET method for field samplerAnisotropy	[boolean]<br>
	 * Prototype: VkBool32  samplerAnisotropy
	 */ 
	 private static native void setSamplerAnisotropy0(Buffer ptr, boolean  _samplerAnisotropy);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->samplerAnisotropy = (VkBool32) (_samplerAnisotropy);
	  */

	/**
	 * Native GET method for field samplerAnisotropy	[boolean]<br>
	 * Prototype: VkBool32  samplerAnisotropy
	 */ 
	 private static native boolean  getSamplerAnisotropy0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->samplerAnisotropy);
	 */

	/**
	 * Native SET method for field textureCompressionETC2	[boolean]<br>
	 * Prototype: VkBool32  textureCompressionETC2
	 */ 
	 private static native void setTextureCompressionETC20(Buffer ptr, boolean  _textureCompressionETC2);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->textureCompressionETC2 = (VkBool32) (_textureCompressionETC2);
	  */

	/**
	 * Native GET method for field textureCompressionETC2	[boolean]<br>
	 * Prototype: VkBool32  textureCompressionETC2
	 */ 
	 private static native boolean  getTextureCompressionETC20(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->textureCompressionETC2);
	 */

	/**
	 * Native SET method for field textureCompressionASTC_LDR	[boolean]<br>
	 * Prototype: VkBool32  textureCompressionASTC_LDR
	 */ 
	 private static native void setTextureCompressionASTCJLDR0(Buffer ptr, boolean  _textureCompressionASTC_LDR);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->textureCompressionASTC_LDR = (VkBool32) (_textureCompressionASTC_LDR);
	  */

	/**
	 * Native GET method for field textureCompressionASTC_LDR	[boolean]<br>
	 * Prototype: VkBool32  textureCompressionASTC_LDR
	 */ 
	 private static native boolean  getTextureCompressionASTCJLDR0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->textureCompressionASTC_LDR);
	 */

	/**
	 * Native SET method for field textureCompressionBC	[boolean]<br>
	 * Prototype: VkBool32  textureCompressionBC
	 */ 
	 private static native void setTextureCompressionBC0(Buffer ptr, boolean  _textureCompressionBC);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->textureCompressionBC = (VkBool32) (_textureCompressionBC);
	  */

	/**
	 * Native GET method for field textureCompressionBC	[boolean]<br>
	 * Prototype: VkBool32  textureCompressionBC
	 */ 
	 private static native boolean  getTextureCompressionBC0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->textureCompressionBC);
	 */

	/**
	 * Native SET method for field occlusionQueryPrecise	[boolean]<br>
	 * Prototype: VkBool32  occlusionQueryPrecise
	 */ 
	 private static native void setOcclusionQueryPrecise0(Buffer ptr, boolean  _occlusionQueryPrecise);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->occlusionQueryPrecise = (VkBool32) (_occlusionQueryPrecise);
	  */

	/**
	 * Native GET method for field occlusionQueryPrecise	[boolean]<br>
	 * Prototype: VkBool32  occlusionQueryPrecise
	 */ 
	 private static native boolean  getOcclusionQueryPrecise0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->occlusionQueryPrecise);
	 */

	/**
	 * Native SET method for field pipelineStatisticsQuery	[boolean]<br>
	 * Prototype: VkBool32  pipelineStatisticsQuery
	 */ 
	 private static native void setPipelineStatisticsQuery0(Buffer ptr, boolean  _pipelineStatisticsQuery);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->pipelineStatisticsQuery = (VkBool32) (_pipelineStatisticsQuery);
	  */

	/**
	 * Native GET method for field pipelineStatisticsQuery	[boolean]<br>
	 * Prototype: VkBool32  pipelineStatisticsQuery
	 */ 
	 private static native boolean  getPipelineStatisticsQuery0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->pipelineStatisticsQuery);
	 */

	/**
	 * Native SET method for field vertexPipelineStoresAndAtomics	[boolean]<br>
	 * Prototype: VkBool32  vertexPipelineStoresAndAtomics
	 */ 
	 private static native void setVertexPipelineStoresAndAtomics0(Buffer ptr, boolean  _vertexPipelineStoresAndAtomics);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->vertexPipelineStoresAndAtomics = (VkBool32) (_vertexPipelineStoresAndAtomics);
	  */

	/**
	 * Native GET method for field vertexPipelineStoresAndAtomics	[boolean]<br>
	 * Prototype: VkBool32  vertexPipelineStoresAndAtomics
	 */ 
	 private static native boolean  getVertexPipelineStoresAndAtomics0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->vertexPipelineStoresAndAtomics);
	 */

	/**
	 * Native SET method for field fragmentStoresAndAtomics	[boolean]<br>
	 * Prototype: VkBool32  fragmentStoresAndAtomics
	 */ 
	 private static native void setFragmentStoresAndAtomics0(Buffer ptr, boolean  _fragmentStoresAndAtomics);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->fragmentStoresAndAtomics = (VkBool32) (_fragmentStoresAndAtomics);
	  */

	/**
	 * Native GET method for field fragmentStoresAndAtomics	[boolean]<br>
	 * Prototype: VkBool32  fragmentStoresAndAtomics
	 */ 
	 private static native boolean  getFragmentStoresAndAtomics0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->fragmentStoresAndAtomics);
	 */

	/**
	 * Native SET method for field shaderTessellationAndGeometryPointSize	[boolean]<br>
	 * Prototype: VkBool32  shaderTessellationAndGeometryPointSize
	 */ 
	 private static native void setShaderTessellationAndGeometryPointSize0(Buffer ptr, boolean  _shaderTessellationAndGeometryPointSize);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->shaderTessellationAndGeometryPointSize = (VkBool32) (_shaderTessellationAndGeometryPointSize);
	  */

	/**
	 * Native GET method for field shaderTessellationAndGeometryPointSize	[boolean]<br>
	 * Prototype: VkBool32  shaderTessellationAndGeometryPointSize
	 */ 
	 private static native boolean  getShaderTessellationAndGeometryPointSize0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderTessellationAndGeometryPointSize);
	 */

	/**
	 * Native SET method for field shaderImageGatherExtended	[boolean]<br>
	 * Prototype: VkBool32  shaderImageGatherExtended
	 */ 
	 private static native void setShaderImageGatherExtended0(Buffer ptr, boolean  _shaderImageGatherExtended);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->shaderImageGatherExtended = (VkBool32) (_shaderImageGatherExtended);
	  */

	/**
	 * Native GET method for field shaderImageGatherExtended	[boolean]<br>
	 * Prototype: VkBool32  shaderImageGatherExtended
	 */ 
	 private static native boolean  getShaderImageGatherExtended0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderImageGatherExtended);
	 */

	/**
	 * Native SET method for field shaderStorageImageExtendedFormats	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageExtendedFormats
	 */ 
	 private static native void setShaderStorageImageExtendedFormats0(Buffer ptr, boolean  _shaderStorageImageExtendedFormats);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->shaderStorageImageExtendedFormats = (VkBool32) (_shaderStorageImageExtendedFormats);
	  */

	/**
	 * Native GET method for field shaderStorageImageExtendedFormats	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageExtendedFormats
	 */ 
	 private static native boolean  getShaderStorageImageExtendedFormats0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderStorageImageExtendedFormats);
	 */

	/**
	 * Native SET method for field shaderStorageImageMultisample	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageMultisample
	 */ 
	 private static native void setShaderStorageImageMultisample0(Buffer ptr, boolean  _shaderStorageImageMultisample);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->shaderStorageImageMultisample = (VkBool32) (_shaderStorageImageMultisample);
	  */

	/**
	 * Native GET method for field shaderStorageImageMultisample	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageMultisample
	 */ 
	 private static native boolean  getShaderStorageImageMultisample0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderStorageImageMultisample);
	 */

	/**
	 * Native SET method for field shaderStorageImageReadWithoutFormat	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageReadWithoutFormat
	 */ 
	 private static native void setShaderStorageImageReadWithoutFormat0(Buffer ptr, boolean  _shaderStorageImageReadWithoutFormat);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->shaderStorageImageReadWithoutFormat = (VkBool32) (_shaderStorageImageReadWithoutFormat);
	  */

	/**
	 * Native GET method for field shaderStorageImageReadWithoutFormat	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageReadWithoutFormat
	 */ 
	 private static native boolean  getShaderStorageImageReadWithoutFormat0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderStorageImageReadWithoutFormat);
	 */

	/**
	 * Native SET method for field shaderStorageImageWriteWithoutFormat	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageWriteWithoutFormat
	 */ 
	 private static native void setShaderStorageImageWriteWithoutFormat0(Buffer ptr, boolean  _shaderStorageImageWriteWithoutFormat);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->shaderStorageImageWriteWithoutFormat = (VkBool32) (_shaderStorageImageWriteWithoutFormat);
	  */

	/**
	 * Native GET method for field shaderStorageImageWriteWithoutFormat	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageWriteWithoutFormat
	 */ 
	 private static native boolean  getShaderStorageImageWriteWithoutFormat0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderStorageImageWriteWithoutFormat);
	 */

	/**
	 * Native SET method for field shaderUniformBufferArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderUniformBufferArrayDynamicIndexing
	 */ 
	 private static native void setShaderUniformBufferArrayDynamicIndexing0(Buffer ptr, boolean  _shaderUniformBufferArrayDynamicIndexing);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->shaderUniformBufferArrayDynamicIndexing = (VkBool32) (_shaderUniformBufferArrayDynamicIndexing);
	  */

	/**
	 * Native GET method for field shaderUniformBufferArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderUniformBufferArrayDynamicIndexing
	 */ 
	 private static native boolean  getShaderUniformBufferArrayDynamicIndexing0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderUniformBufferArrayDynamicIndexing);
	 */

	/**
	 * Native SET method for field shaderSampledImageArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderSampledImageArrayDynamicIndexing
	 */ 
	 private static native void setShaderSampledImageArrayDynamicIndexing0(Buffer ptr, boolean  _shaderSampledImageArrayDynamicIndexing);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->shaderSampledImageArrayDynamicIndexing = (VkBool32) (_shaderSampledImageArrayDynamicIndexing);
	  */

	/**
	 * Native GET method for field shaderSampledImageArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderSampledImageArrayDynamicIndexing
	 */ 
	 private static native boolean  getShaderSampledImageArrayDynamicIndexing0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderSampledImageArrayDynamicIndexing);
	 */

	/**
	 * Native SET method for field shaderStorageBufferArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageBufferArrayDynamicIndexing
	 */ 
	 private static native void setShaderStorageBufferArrayDynamicIndexing0(Buffer ptr, boolean  _shaderStorageBufferArrayDynamicIndexing);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->shaderStorageBufferArrayDynamicIndexing = (VkBool32) (_shaderStorageBufferArrayDynamicIndexing);
	  */

	/**
	 * Native GET method for field shaderStorageBufferArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageBufferArrayDynamicIndexing
	 */ 
	 private static native boolean  getShaderStorageBufferArrayDynamicIndexing0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderStorageBufferArrayDynamicIndexing);
	 */

	/**
	 * Native SET method for field shaderStorageImageArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageArrayDynamicIndexing
	 */ 
	 private static native void setShaderStorageImageArrayDynamicIndexing0(Buffer ptr, boolean  _shaderStorageImageArrayDynamicIndexing);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->shaderStorageImageArrayDynamicIndexing = (VkBool32) (_shaderStorageImageArrayDynamicIndexing);
	  */

	/**
	 * Native GET method for field shaderStorageImageArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageArrayDynamicIndexing
	 */ 
	 private static native boolean  getShaderStorageImageArrayDynamicIndexing0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderStorageImageArrayDynamicIndexing);
	 */

	/**
	 * Native SET method for field shaderClipDistance	[boolean]<br>
	 * Prototype: VkBool32  shaderClipDistance
	 */ 
	 private static native void setShaderClipDistance0(Buffer ptr, boolean  _shaderClipDistance);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->shaderClipDistance = (VkBool32) (_shaderClipDistance);
	  */

	/**
	 * Native GET method for field shaderClipDistance	[boolean]<br>
	 * Prototype: VkBool32  shaderClipDistance
	 */ 
	 private static native boolean  getShaderClipDistance0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderClipDistance);
	 */

	/**
	 * Native SET method for field shaderCullDistance	[boolean]<br>
	 * Prototype: VkBool32  shaderCullDistance
	 */ 
	 private static native void setShaderCullDistance0(Buffer ptr, boolean  _shaderCullDistance);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->shaderCullDistance = (VkBool32) (_shaderCullDistance);
	  */

	/**
	 * Native GET method for field shaderCullDistance	[boolean]<br>
	 * Prototype: VkBool32  shaderCullDistance
	 */ 
	 private static native boolean  getShaderCullDistance0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderCullDistance);
	 */

	/**
	 * Native SET method for field shaderFloat64	[boolean]<br>
	 * Prototype: VkBool32  shaderFloat64
	 */ 
	 private static native void setShaderFloat640(Buffer ptr, boolean  _shaderFloat64);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->shaderFloat64 = (VkBool32) (_shaderFloat64);
	  */

	/**
	 * Native GET method for field shaderFloat64	[boolean]<br>
	 * Prototype: VkBool32  shaderFloat64
	 */ 
	 private static native boolean  getShaderFloat640(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderFloat64);
	 */

	/**
	 * Native SET method for field shaderInt64	[boolean]<br>
	 * Prototype: VkBool32  shaderInt64
	 */ 
	 private static native void setShaderInt640(Buffer ptr, boolean  _shaderInt64);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->shaderInt64 = (VkBool32) (_shaderInt64);
	  */

	/**
	 * Native GET method for field shaderInt64	[boolean]<br>
	 * Prototype: VkBool32  shaderInt64
	 */ 
	 private static native boolean  getShaderInt640(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderInt64);
	 */

	/**
	 * Native SET method for field shaderInt16	[boolean]<br>
	 * Prototype: VkBool32  shaderInt16
	 */ 
	 private static native void setShaderInt160(Buffer ptr, boolean  _shaderInt16);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->shaderInt16 = (VkBool32) (_shaderInt16);
	  */

	/**
	 * Native GET method for field shaderInt16	[boolean]<br>
	 * Prototype: VkBool32  shaderInt16
	 */ 
	 private static native boolean  getShaderInt160(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderInt16);
	 */

	/**
	 * Native SET method for field shaderResourceResidency	[boolean]<br>
	 * Prototype: VkBool32  shaderResourceResidency
	 */ 
	 private static native void setShaderResourceResidency0(Buffer ptr, boolean  _shaderResourceResidency);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->shaderResourceResidency = (VkBool32) (_shaderResourceResidency);
	  */

	/**
	 * Native GET method for field shaderResourceResidency	[boolean]<br>
	 * Prototype: VkBool32  shaderResourceResidency
	 */ 
	 private static native boolean  getShaderResourceResidency0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderResourceResidency);
	 */

	/**
	 * Native SET method for field shaderResourceMinLod	[boolean]<br>
	 * Prototype: VkBool32  shaderResourceMinLod
	 */ 
	 private static native void setShaderResourceMinLod0(Buffer ptr, boolean  _shaderResourceMinLod);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->shaderResourceMinLod = (VkBool32) (_shaderResourceMinLod);
	  */

	/**
	 * Native GET method for field shaderResourceMinLod	[boolean]<br>
	 * Prototype: VkBool32  shaderResourceMinLod
	 */ 
	 private static native boolean  getShaderResourceMinLod0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderResourceMinLod);
	 */

	/**
	 * Native SET method for field sparseBinding	[boolean]<br>
	 * Prototype: VkBool32  sparseBinding
	 */ 
	 private static native void setSparseBinding0(Buffer ptr, boolean  _sparseBinding);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->sparseBinding = (VkBool32) (_sparseBinding);
	  */

	/**
	 * Native GET method for field sparseBinding	[boolean]<br>
	 * Prototype: VkBool32  sparseBinding
	 */ 
	 private static native boolean  getSparseBinding0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->sparseBinding);
	 */

	/**
	 * Native SET method for field sparseResidencyBuffer	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyBuffer
	 */ 
	 private static native void setSparseResidencyBuffer0(Buffer ptr, boolean  _sparseResidencyBuffer);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->sparseResidencyBuffer = (VkBool32) (_sparseResidencyBuffer);
	  */

	/**
	 * Native GET method for field sparseResidencyBuffer	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyBuffer
	 */ 
	 private static native boolean  getSparseResidencyBuffer0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->sparseResidencyBuffer);
	 */

	/**
	 * Native SET method for field sparseResidencyImage2D	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyImage2D
	 */ 
	 private static native void setSparseResidencyImage2D0(Buffer ptr, boolean  _sparseResidencyImage2D);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->sparseResidencyImage2D = (VkBool32) (_sparseResidencyImage2D);
	  */

	/**
	 * Native GET method for field sparseResidencyImage2D	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyImage2D
	 */ 
	 private static native boolean  getSparseResidencyImage2D0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->sparseResidencyImage2D);
	 */

	/**
	 * Native SET method for field sparseResidencyImage3D	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyImage3D
	 */ 
	 private static native void setSparseResidencyImage3D0(Buffer ptr, boolean  _sparseResidencyImage3D);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->sparseResidencyImage3D = (VkBool32) (_sparseResidencyImage3D);
	  */

	/**
	 * Native GET method for field sparseResidencyImage3D	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyImage3D
	 */ 
	 private static native boolean  getSparseResidencyImage3D0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->sparseResidencyImage3D);
	 */

	/**
	 * Native SET method for field sparseResidency2Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency2Samples
	 */ 
	 private static native void setSparseResidency2Samples0(Buffer ptr, boolean  _sparseResidency2Samples);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->sparseResidency2Samples = (VkBool32) (_sparseResidency2Samples);
	  */

	/**
	 * Native GET method for field sparseResidency2Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency2Samples
	 */ 
	 private static native boolean  getSparseResidency2Samples0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->sparseResidency2Samples);
	 */

	/**
	 * Native SET method for field sparseResidency4Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency4Samples
	 */ 
	 private static native void setSparseResidency4Samples0(Buffer ptr, boolean  _sparseResidency4Samples);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->sparseResidency4Samples = (VkBool32) (_sparseResidency4Samples);
	  */

	/**
	 * Native GET method for field sparseResidency4Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency4Samples
	 */ 
	 private static native boolean  getSparseResidency4Samples0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->sparseResidency4Samples);
	 */

	/**
	 * Native SET method for field sparseResidency8Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency8Samples
	 */ 
	 private static native void setSparseResidency8Samples0(Buffer ptr, boolean  _sparseResidency8Samples);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->sparseResidency8Samples = (VkBool32) (_sparseResidency8Samples);
	  */

	/**
	 * Native GET method for field sparseResidency8Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency8Samples
	 */ 
	 private static native boolean  getSparseResidency8Samples0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->sparseResidency8Samples);
	 */

	/**
	 * Native SET method for field sparseResidency16Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency16Samples
	 */ 
	 private static native void setSparseResidency16Samples0(Buffer ptr, boolean  _sparseResidency16Samples);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->sparseResidency16Samples = (VkBool32) (_sparseResidency16Samples);
	  */

	/**
	 * Native GET method for field sparseResidency16Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency16Samples
	 */ 
	 private static native boolean  getSparseResidency16Samples0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->sparseResidency16Samples);
	 */

	/**
	 * Native SET method for field sparseResidencyAliased	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyAliased
	 */ 
	 private static native void setSparseResidencyAliased0(Buffer ptr, boolean  _sparseResidencyAliased);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->sparseResidencyAliased = (VkBool32) (_sparseResidencyAliased);
	  */

	/**
	 * Native GET method for field sparseResidencyAliased	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyAliased
	 */ 
	 private static native boolean  getSparseResidencyAliased0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->sparseResidencyAliased);
	 */

	/**
	 * Native SET method for field variableMultisampleRate	[boolean]<br>
	 * Prototype: VkBool32  variableMultisampleRate
	 */ 
	 private static native void setVariableMultisampleRate0(Buffer ptr, boolean  _variableMultisampleRate);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->variableMultisampleRate = (VkBool32) (_variableMultisampleRate);
	  */

	/**
	 * Native GET method for field variableMultisampleRate	[boolean]<br>
	 * Prototype: VkBool32  variableMultisampleRate
	 */ 
	 private static native boolean  getVariableMultisampleRate0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->variableMultisampleRate);
	 */

	/**
	 * Native SET method for field inheritedQueries	[boolean]<br>
	 * Prototype: VkBool32  inheritedQueries
	 */ 
	 private static native void setInheritedQueries0(Buffer ptr, boolean  _inheritedQueries);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		 // code for simple past value 
		  vkObj->inheritedQueries = (VkBool32) (_inheritedQueries);
	  */

	/**
	 * Native GET method for field inheritedQueries	[boolean]<br>
	 * Prototype: VkBool32  inheritedQueries
	 */ 
	 private static native boolean  getInheritedQueries0(Buffer ptr);/*
		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->inheritedQueries);
	 */



} // end of class VkPhysicalDeviceFeatures
