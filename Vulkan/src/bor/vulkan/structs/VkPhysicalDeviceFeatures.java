/**
 * Class wrapping Vulkan's VkPhysicalDeviceFeatures struct.
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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkPhysicalDeviceFeatures extends VkStruct {
	/** TAG of this structure [4]  */
	 private static final String TAG = "VkPhysicalDeviceFeatures";

	/** ID of this structure [4]  */
	 public static final int TAG_ID = VKPHYSICALDEVICEFEATURES_ID;

	 // fields //
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
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPhysicalDeviceFeatures(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkPhysicalDeviceFeatures(long address, int memSize){ 
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
	 public static P<VkPhysicalDeviceFeatures> createNullPointer(){
	        P<VkPhysicalDeviceFeatures> p = new  P<VkPhysicalDeviceFeatures>(new VkPhysicalDeviceFeatures());
	        return p;
	    }

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field robustBufferAccess	[boolean]<br>
	 * Prototype: VkBool32  robustBufferAccess
	 */ 
	 public void robustBufferAccess(boolean robustBufferAccess){
		 this.robustBufferAccess = robustBufferAccess;
		robustBufferAccess0(super.ptr, robustBufferAccess);
	 }

	/**
	 * get method for field robustBufferAccess	[boolean]<br>
	 * Prototype: VkBool32  robustBufferAccess
	 */ 
	 public boolean robustBufferAccess(){
		 // return  this.robustBufferAccess;
		 return robustBufferAccess0(super.ptr);
	 }

	/**
	 * Set method for field fullDrawIndexUint32	[boolean]<br>
	 * Prototype: VkBool32  fullDrawIndexUint32
	 */ 
	 public void fullDrawIndexUint32(boolean fullDrawIndexUint32){
		 this.fullDrawIndexUint32 = fullDrawIndexUint32;
		fullDrawIndexUint320(super.ptr, fullDrawIndexUint32);
	 }

	/**
	 * get method for field fullDrawIndexUint32	[boolean]<br>
	 * Prototype: VkBool32  fullDrawIndexUint32
	 */ 
	 public boolean fullDrawIndexUint32(){
		 // return  this.fullDrawIndexUint32;
		 return fullDrawIndexUint320(super.ptr);
	 }

	/**
	 * Set method for field imageCubeArray	[boolean]<br>
	 * Prototype: VkBool32  imageCubeArray
	 */ 
	 public void imageCubeArray(boolean imageCubeArray){
		 this.imageCubeArray = imageCubeArray;
		imageCubeArray0(super.ptr, imageCubeArray);
	 }

	/**
	 * get method for field imageCubeArray	[boolean]<br>
	 * Prototype: VkBool32  imageCubeArray
	 */ 
	 public boolean imageCubeArray(){
		 // return  this.imageCubeArray;
		 return imageCubeArray0(super.ptr);
	 }

	/**
	 * Set method for field independentBlend	[boolean]<br>
	 * Prototype: VkBool32  independentBlend
	 */ 
	 public void independentBlend(boolean independentBlend){
		 this.independentBlend = independentBlend;
		independentBlend0(super.ptr, independentBlend);
	 }

	/**
	 * get method for field independentBlend	[boolean]<br>
	 * Prototype: VkBool32  independentBlend
	 */ 
	 public boolean independentBlend(){
		 // return  this.independentBlend;
		 return independentBlend0(super.ptr);
	 }

	/**
	 * Set method for field geometryShader	[boolean]<br>
	 * Prototype: VkBool32  geometryShader
	 */ 
	 public void geometryShader(boolean geometryShader){
		 this.geometryShader = geometryShader;
		geometryShader0(super.ptr, geometryShader);
	 }

	/**
	 * get method for field geometryShader	[boolean]<br>
	 * Prototype: VkBool32  geometryShader
	 */ 
	 public boolean geometryShader(){
		 // return  this.geometryShader;
		 return geometryShader0(super.ptr);
	 }

	/**
	 * Set method for field tessellationShader	[boolean]<br>
	 * Prototype: VkBool32  tessellationShader
	 */ 
	 public void tessellationShader(boolean tessellationShader){
		 this.tessellationShader = tessellationShader;
		tessellationShader0(super.ptr, tessellationShader);
	 }

	/**
	 * get method for field tessellationShader	[boolean]<br>
	 * Prototype: VkBool32  tessellationShader
	 */ 
	 public boolean tessellationShader(){
		 // return  this.tessellationShader;
		 return tessellationShader0(super.ptr);
	 }

	/**
	 * Set method for field sampleRateShading	[boolean]<br>
	 * Prototype: VkBool32  sampleRateShading
	 */ 
	 public void sampleRateShading(boolean sampleRateShading){
		 this.sampleRateShading = sampleRateShading;
		sampleRateShading0(super.ptr, sampleRateShading);
	 }

	/**
	 * get method for field sampleRateShading	[boolean]<br>
	 * Prototype: VkBool32  sampleRateShading
	 */ 
	 public boolean sampleRateShading(){
		 // return  this.sampleRateShading;
		 return sampleRateShading0(super.ptr);
	 }

	/**
	 * Set method for field dualSrcBlend	[boolean]<br>
	 * Prototype: VkBool32  dualSrcBlend
	 */ 
	 public void dualSrcBlend(boolean dualSrcBlend){
		 this.dualSrcBlend = dualSrcBlend;
		dualSrcBlend0(super.ptr, dualSrcBlend);
	 }

	/**
	 * get method for field dualSrcBlend	[boolean]<br>
	 * Prototype: VkBool32  dualSrcBlend
	 */ 
	 public boolean dualSrcBlend(){
		 // return  this.dualSrcBlend;
		 return dualSrcBlend0(super.ptr);
	 }

	/**
	 * Set method for field logicOp	[boolean]<br>
	 * Prototype: VkBool32  logicOp
	 */ 
	 public void logicOp(boolean logicOp){
		 this.logicOp = logicOp;
		logicOp0(super.ptr, logicOp);
	 }

	/**
	 * get method for field logicOp	[boolean]<br>
	 * Prototype: VkBool32  logicOp
	 */ 
	 public boolean logicOp(){
		 // return  this.logicOp;
		 return logicOp0(super.ptr);
	 }

	/**
	 * Set method for field multiDrawIndirect	[boolean]<br>
	 * Prototype: VkBool32  multiDrawIndirect
	 */ 
	 public void multiDrawIndirect(boolean multiDrawIndirect){
		 this.multiDrawIndirect = multiDrawIndirect;
		multiDrawIndirect0(super.ptr, multiDrawIndirect);
	 }

	/**
	 * get method for field multiDrawIndirect	[boolean]<br>
	 * Prototype: VkBool32  multiDrawIndirect
	 */ 
	 public boolean multiDrawIndirect(){
		 // return  this.multiDrawIndirect;
		 return multiDrawIndirect0(super.ptr);
	 }

	/**
	 * Set method for field drawIndirectFirstInstance	[boolean]<br>
	 * Prototype: VkBool32  drawIndirectFirstInstance
	 */ 
	 public void drawIndirectFirstInstance(boolean drawIndirectFirstInstance){
		 this.drawIndirectFirstInstance = drawIndirectFirstInstance;
		drawIndirectFirstInstance0(super.ptr, drawIndirectFirstInstance);
	 }

	/**
	 * get method for field drawIndirectFirstInstance	[boolean]<br>
	 * Prototype: VkBool32  drawIndirectFirstInstance
	 */ 
	 public boolean drawIndirectFirstInstance(){
		 // return  this.drawIndirectFirstInstance;
		 return drawIndirectFirstInstance0(super.ptr);
	 }

	/**
	 * Set method for field depthClamp	[boolean]<br>
	 * Prototype: VkBool32  depthClamp
	 */ 
	 public void depthClamp(boolean depthClamp){
		 this.depthClamp = depthClamp;
		depthClamp0(super.ptr, depthClamp);
	 }

	/**
	 * get method for field depthClamp	[boolean]<br>
	 * Prototype: VkBool32  depthClamp
	 */ 
	 public boolean depthClamp(){
		 // return  this.depthClamp;
		 return depthClamp0(super.ptr);
	 }

	/**
	 * Set method for field depthBiasClamp	[boolean]<br>
	 * Prototype: VkBool32  depthBiasClamp
	 */ 
	 public void depthBiasClamp(boolean depthBiasClamp){
		 this.depthBiasClamp = depthBiasClamp;
		depthBiasClamp0(super.ptr, depthBiasClamp);
	 }

	/**
	 * get method for field depthBiasClamp	[boolean]<br>
	 * Prototype: VkBool32  depthBiasClamp
	 */ 
	 public boolean depthBiasClamp(){
		 // return  this.depthBiasClamp;
		 return depthBiasClamp0(super.ptr);
	 }

	/**
	 * Set method for field fillModeNonSolid	[boolean]<br>
	 * Prototype: VkBool32  fillModeNonSolid
	 */ 
	 public void fillModeNonSolid(boolean fillModeNonSolid){
		 this.fillModeNonSolid = fillModeNonSolid;
		fillModeNonSolid0(super.ptr, fillModeNonSolid);
	 }

	/**
	 * get method for field fillModeNonSolid	[boolean]<br>
	 * Prototype: VkBool32  fillModeNonSolid
	 */ 
	 public boolean fillModeNonSolid(){
		 // return  this.fillModeNonSolid;
		 return fillModeNonSolid0(super.ptr);
	 }

	/**
	 * Set method for field depthBounds	[boolean]<br>
	 * Prototype: VkBool32  depthBounds
	 */ 
	 public void depthBounds(boolean depthBounds){
		 this.depthBounds = depthBounds;
		depthBounds0(super.ptr, depthBounds);
	 }

	/**
	 * get method for field depthBounds	[boolean]<br>
	 * Prototype: VkBool32  depthBounds
	 */ 
	 public boolean depthBounds(){
		 // return  this.depthBounds;
		 return depthBounds0(super.ptr);
	 }

	/**
	 * Set method for field wideLines	[boolean]<br>
	 * Prototype: VkBool32  wideLines
	 */ 
	 public void wideLines(boolean wideLines){
		 this.wideLines = wideLines;
		wideLines0(super.ptr, wideLines);
	 }

	/**
	 * get method for field wideLines	[boolean]<br>
	 * Prototype: VkBool32  wideLines
	 */ 
	 public boolean wideLines(){
		 // return  this.wideLines;
		 return wideLines0(super.ptr);
	 }

	/**
	 * Set method for field largePoints	[boolean]<br>
	 * Prototype: VkBool32  largePoints
	 */ 
	 public void largePoints(boolean largePoints){
		 this.largePoints = largePoints;
		largePoints0(super.ptr, largePoints);
	 }

	/**
	 * get method for field largePoints	[boolean]<br>
	 * Prototype: VkBool32  largePoints
	 */ 
	 public boolean largePoints(){
		 // return  this.largePoints;
		 return largePoints0(super.ptr);
	 }

	/**
	 * Set method for field alphaToOne	[boolean]<br>
	 * Prototype: VkBool32  alphaToOne
	 */ 
	 public void alphaToOne(boolean alphaToOne){
		 this.alphaToOne = alphaToOne;
		alphaToOne0(super.ptr, alphaToOne);
	 }

	/**
	 * get method for field alphaToOne	[boolean]<br>
	 * Prototype: VkBool32  alphaToOne
	 */ 
	 public boolean alphaToOne(){
		 // return  this.alphaToOne;
		 return alphaToOne0(super.ptr);
	 }

	/**
	 * Set method for field multiViewport	[boolean]<br>
	 * Prototype: VkBool32  multiViewport
	 */ 
	 public void multiViewport(boolean multiViewport){
		 this.multiViewport = multiViewport;
		multiViewport0(super.ptr, multiViewport);
	 }

	/**
	 * get method for field multiViewport	[boolean]<br>
	 * Prototype: VkBool32  multiViewport
	 */ 
	 public boolean multiViewport(){
		 // return  this.multiViewport;
		 return multiViewport0(super.ptr);
	 }

	/**
	 * Set method for field samplerAnisotropy	[boolean]<br>
	 * Prototype: VkBool32  samplerAnisotropy
	 */ 
	 public void samplerAnisotropy(boolean samplerAnisotropy){
		 this.samplerAnisotropy = samplerAnisotropy;
		samplerAnisotropy0(super.ptr, samplerAnisotropy);
	 }

	/**
	 * get method for field samplerAnisotropy	[boolean]<br>
	 * Prototype: VkBool32  samplerAnisotropy
	 */ 
	 public boolean samplerAnisotropy(){
		 // return  this.samplerAnisotropy;
		 return samplerAnisotropy0(super.ptr);
	 }

	/**
	 * Set method for field textureCompressionETC2	[boolean]<br>
	 * Prototype: VkBool32  textureCompressionETC2
	 */ 
	 public void textureCompressionETC2(boolean textureCompressionETC2){
		 this.textureCompressionETC2 = textureCompressionETC2;
		textureCompressionETC20(super.ptr, textureCompressionETC2);
	 }

	/**
	 * get method for field textureCompressionETC2	[boolean]<br>
	 * Prototype: VkBool32  textureCompressionETC2
	 */ 
	 public boolean textureCompressionETC2(){
		 // return  this.textureCompressionETC2;
		 return textureCompressionETC20(super.ptr);
	 }

	/**
	 * Set method for field textureCompressionASTC_LDR	[boolean]<br>
	 * Prototype: VkBool32  textureCompressionASTC_LDR
	 */ 
	 public void textureCompressionASTC_LDR(boolean textureCompressionASTC_LDR){
		 this.textureCompressionASTC_LDR = textureCompressionASTC_LDR;
		textureCompressionASTC_LDR0(super.ptr, textureCompressionASTC_LDR);
	 }

	/**
	 * get method for field textureCompressionASTC_LDR	[boolean]<br>
	 * Prototype: VkBool32  textureCompressionASTC_LDR
	 */ 
	 public boolean textureCompressionASTC_LDR(){
		 // return  this.textureCompressionASTC_LDR;
		 return textureCompressionASTC_LDR0(super.ptr);
	 }

	/**
	 * Set method for field textureCompressionBC	[boolean]<br>
	 * Prototype: VkBool32  textureCompressionBC
	 */ 
	 public void textureCompressionBC(boolean textureCompressionBC){
		 this.textureCompressionBC = textureCompressionBC;
		textureCompressionBC0(super.ptr, textureCompressionBC);
	 }

	/**
	 * get method for field textureCompressionBC	[boolean]<br>
	 * Prototype: VkBool32  textureCompressionBC
	 */ 
	 public boolean textureCompressionBC(){
		 // return  this.textureCompressionBC;
		 return textureCompressionBC0(super.ptr);
	 }

	/**
	 * Set method for field occlusionQueryPrecise	[boolean]<br>
	 * Prototype: VkBool32  occlusionQueryPrecise
	 */ 
	 public void occlusionQueryPrecise(boolean occlusionQueryPrecise){
		 this.occlusionQueryPrecise = occlusionQueryPrecise;
		occlusionQueryPrecise0(super.ptr, occlusionQueryPrecise);
	 }

	/**
	 * get method for field occlusionQueryPrecise	[boolean]<br>
	 * Prototype: VkBool32  occlusionQueryPrecise
	 */ 
	 public boolean occlusionQueryPrecise(){
		 // return  this.occlusionQueryPrecise;
		 return occlusionQueryPrecise0(super.ptr);
	 }

	/**
	 * Set method for field pipelineStatisticsQuery	[boolean]<br>
	 * Prototype: VkBool32  pipelineStatisticsQuery
	 */ 
	 public void pipelineStatisticsQuery(boolean pipelineStatisticsQuery){
		 this.pipelineStatisticsQuery = pipelineStatisticsQuery;
		pipelineStatisticsQuery0(super.ptr, pipelineStatisticsQuery);
	 }

	/**
	 * get method for field pipelineStatisticsQuery	[boolean]<br>
	 * Prototype: VkBool32  pipelineStatisticsQuery
	 */ 
	 public boolean pipelineStatisticsQuery(){
		 // return  this.pipelineStatisticsQuery;
		 return pipelineStatisticsQuery0(super.ptr);
	 }

	/**
	 * Set method for field vertexPipelineStoresAndAtomics	[boolean]<br>
	 * Prototype: VkBool32  vertexPipelineStoresAndAtomics
	 */ 
	 public void vertexPipelineStoresAndAtomics(boolean vertexPipelineStoresAndAtomics){
		 this.vertexPipelineStoresAndAtomics = vertexPipelineStoresAndAtomics;
		vertexPipelineStoresAndAtomics0(super.ptr, vertexPipelineStoresAndAtomics);
	 }

	/**
	 * get method for field vertexPipelineStoresAndAtomics	[boolean]<br>
	 * Prototype: VkBool32  vertexPipelineStoresAndAtomics
	 */ 
	 public boolean vertexPipelineStoresAndAtomics(){
		 // return  this.vertexPipelineStoresAndAtomics;
		 return vertexPipelineStoresAndAtomics0(super.ptr);
	 }

	/**
	 * Set method for field fragmentStoresAndAtomics	[boolean]<br>
	 * Prototype: VkBool32  fragmentStoresAndAtomics
	 */ 
	 public void fragmentStoresAndAtomics(boolean fragmentStoresAndAtomics){
		 this.fragmentStoresAndAtomics = fragmentStoresAndAtomics;
		fragmentStoresAndAtomics0(super.ptr, fragmentStoresAndAtomics);
	 }

	/**
	 * get method for field fragmentStoresAndAtomics	[boolean]<br>
	 * Prototype: VkBool32  fragmentStoresAndAtomics
	 */ 
	 public boolean fragmentStoresAndAtomics(){
		 // return  this.fragmentStoresAndAtomics;
		 return fragmentStoresAndAtomics0(super.ptr);
	 }

	/**
	 * Set method for field shaderTessellationAndGeometryPointSize	[boolean]<br>
	 * Prototype: VkBool32  shaderTessellationAndGeometryPointSize
	 */ 
	 public void shaderTessellationAndGeometryPointSize(boolean shaderTessellationAndGeometryPointSize){
		 this.shaderTessellationAndGeometryPointSize = shaderTessellationAndGeometryPointSize;
		shaderTessellationAndGeometryPointSize0(super.ptr, shaderTessellationAndGeometryPointSize);
	 }

	/**
	 * get method for field shaderTessellationAndGeometryPointSize	[boolean]<br>
	 * Prototype: VkBool32  shaderTessellationAndGeometryPointSize
	 */ 
	 public boolean shaderTessellationAndGeometryPointSize(){
		 // return  this.shaderTessellationAndGeometryPointSize;
		 return shaderTessellationAndGeometryPointSize0(super.ptr);
	 }

	/**
	 * Set method for field shaderImageGatherExtended	[boolean]<br>
	 * Prototype: VkBool32  shaderImageGatherExtended
	 */ 
	 public void shaderImageGatherExtended(boolean shaderImageGatherExtended){
		 this.shaderImageGatherExtended = shaderImageGatherExtended;
		shaderImageGatherExtended0(super.ptr, shaderImageGatherExtended);
	 }

	/**
	 * get method for field shaderImageGatherExtended	[boolean]<br>
	 * Prototype: VkBool32  shaderImageGatherExtended
	 */ 
	 public boolean shaderImageGatherExtended(){
		 // return  this.shaderImageGatherExtended;
		 return shaderImageGatherExtended0(super.ptr);
	 }

	/**
	 * Set method for field shaderStorageImageExtendedFormats	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageExtendedFormats
	 */ 
	 public void shaderStorageImageExtendedFormats(boolean shaderStorageImageExtendedFormats){
		 this.shaderStorageImageExtendedFormats = shaderStorageImageExtendedFormats;
		shaderStorageImageExtendedFormats0(super.ptr, shaderStorageImageExtendedFormats);
	 }

	/**
	 * get method for field shaderStorageImageExtendedFormats	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageExtendedFormats
	 */ 
	 public boolean shaderStorageImageExtendedFormats(){
		 // return  this.shaderStorageImageExtendedFormats;
		 return shaderStorageImageExtendedFormats0(super.ptr);
	 }

	/**
	 * Set method for field shaderStorageImageMultisample	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageMultisample
	 */ 
	 public void shaderStorageImageMultisample(boolean shaderStorageImageMultisample){
		 this.shaderStorageImageMultisample = shaderStorageImageMultisample;
		shaderStorageImageMultisample0(super.ptr, shaderStorageImageMultisample);
	 }

	/**
	 * get method for field shaderStorageImageMultisample	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageMultisample
	 */ 
	 public boolean shaderStorageImageMultisample(){
		 // return  this.shaderStorageImageMultisample;
		 return shaderStorageImageMultisample0(super.ptr);
	 }

	/**
	 * Set method for field shaderStorageImageReadWithoutFormat	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageReadWithoutFormat
	 */ 
	 public void shaderStorageImageReadWithoutFormat(boolean shaderStorageImageReadWithoutFormat){
		 this.shaderStorageImageReadWithoutFormat = shaderStorageImageReadWithoutFormat;
		shaderStorageImageReadWithoutFormat0(super.ptr, shaderStorageImageReadWithoutFormat);
	 }

	/**
	 * get method for field shaderStorageImageReadWithoutFormat	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageReadWithoutFormat
	 */ 
	 public boolean shaderStorageImageReadWithoutFormat(){
		 // return  this.shaderStorageImageReadWithoutFormat;
		 return shaderStorageImageReadWithoutFormat0(super.ptr);
	 }

	/**
	 * Set method for field shaderStorageImageWriteWithoutFormat	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageWriteWithoutFormat
	 */ 
	 public void shaderStorageImageWriteWithoutFormat(boolean shaderStorageImageWriteWithoutFormat){
		 this.shaderStorageImageWriteWithoutFormat = shaderStorageImageWriteWithoutFormat;
		shaderStorageImageWriteWithoutFormat0(super.ptr, shaderStorageImageWriteWithoutFormat);
	 }

	/**
	 * get method for field shaderStorageImageWriteWithoutFormat	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageWriteWithoutFormat
	 */ 
	 public boolean shaderStorageImageWriteWithoutFormat(){
		 // return  this.shaderStorageImageWriteWithoutFormat;
		 return shaderStorageImageWriteWithoutFormat0(super.ptr);
	 }

	/**
	 * Set method for field shaderUniformBufferArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderUniformBufferArrayDynamicIndexing
	 */ 
	 public void shaderUniformBufferArrayDynamicIndexing(boolean shaderUniformBufferArrayDynamicIndexing){
		 this.shaderUniformBufferArrayDynamicIndexing = shaderUniformBufferArrayDynamicIndexing;
		shaderUniformBufferArrayDynamicIndexing0(super.ptr, shaderUniformBufferArrayDynamicIndexing);
	 }

	/**
	 * get method for field shaderUniformBufferArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderUniformBufferArrayDynamicIndexing
	 */ 
	 public boolean shaderUniformBufferArrayDynamicIndexing(){
		 // return  this.shaderUniformBufferArrayDynamicIndexing;
		 return shaderUniformBufferArrayDynamicIndexing0(super.ptr);
	 }

	/**
	 * Set method for field shaderSampledImageArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderSampledImageArrayDynamicIndexing
	 */ 
	 public void shaderSampledImageArrayDynamicIndexing(boolean shaderSampledImageArrayDynamicIndexing){
		 this.shaderSampledImageArrayDynamicIndexing = shaderSampledImageArrayDynamicIndexing;
		shaderSampledImageArrayDynamicIndexing0(super.ptr, shaderSampledImageArrayDynamicIndexing);
	 }

	/**
	 * get method for field shaderSampledImageArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderSampledImageArrayDynamicIndexing
	 */ 
	 public boolean shaderSampledImageArrayDynamicIndexing(){
		 // return  this.shaderSampledImageArrayDynamicIndexing;
		 return shaderSampledImageArrayDynamicIndexing0(super.ptr);
	 }

	/**
	 * Set method for field shaderStorageBufferArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageBufferArrayDynamicIndexing
	 */ 
	 public void shaderStorageBufferArrayDynamicIndexing(boolean shaderStorageBufferArrayDynamicIndexing){
		 this.shaderStorageBufferArrayDynamicIndexing = shaderStorageBufferArrayDynamicIndexing;
		shaderStorageBufferArrayDynamicIndexing0(super.ptr, shaderStorageBufferArrayDynamicIndexing);
	 }

	/**
	 * get method for field shaderStorageBufferArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageBufferArrayDynamicIndexing
	 */ 
	 public boolean shaderStorageBufferArrayDynamicIndexing(){
		 // return  this.shaderStorageBufferArrayDynamicIndexing;
		 return shaderStorageBufferArrayDynamicIndexing0(super.ptr);
	 }

	/**
	 * Set method for field shaderStorageImageArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageArrayDynamicIndexing
	 */ 
	 public void shaderStorageImageArrayDynamicIndexing(boolean shaderStorageImageArrayDynamicIndexing){
		 this.shaderStorageImageArrayDynamicIndexing = shaderStorageImageArrayDynamicIndexing;
		shaderStorageImageArrayDynamicIndexing0(super.ptr, shaderStorageImageArrayDynamicIndexing);
	 }

	/**
	 * get method for field shaderStorageImageArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageArrayDynamicIndexing
	 */ 
	 public boolean shaderStorageImageArrayDynamicIndexing(){
		 // return  this.shaderStorageImageArrayDynamicIndexing;
		 return shaderStorageImageArrayDynamicIndexing0(super.ptr);
	 }

	/**
	 * Set method for field shaderClipDistance	[boolean]<br>
	 * Prototype: VkBool32  shaderClipDistance
	 */ 
	 public void shaderClipDistance(boolean shaderClipDistance){
		 this.shaderClipDistance = shaderClipDistance;
		shaderClipDistance0(super.ptr, shaderClipDistance);
	 }

	/**
	 * get method for field shaderClipDistance	[boolean]<br>
	 * Prototype: VkBool32  shaderClipDistance
	 */ 
	 public boolean shaderClipDistance(){
		 // return  this.shaderClipDistance;
		 return shaderClipDistance0(super.ptr);
	 }

	/**
	 * Set method for field shaderCullDistance	[boolean]<br>
	 * Prototype: VkBool32  shaderCullDistance
	 */ 
	 public void shaderCullDistance(boolean shaderCullDistance){
		 this.shaderCullDistance = shaderCullDistance;
		shaderCullDistance0(super.ptr, shaderCullDistance);
	 }

	/**
	 * get method for field shaderCullDistance	[boolean]<br>
	 * Prototype: VkBool32  shaderCullDistance
	 */ 
	 public boolean shaderCullDistance(){
		 // return  this.shaderCullDistance;
		 return shaderCullDistance0(super.ptr);
	 }

	/**
	 * Set method for field shaderFloat64	[boolean]<br>
	 * Prototype: VkBool32  shaderFloat64
	 */ 
	 public void shaderFloat64(boolean shaderFloat64){
		 this.shaderFloat64 = shaderFloat64;
		shaderFloat640(super.ptr, shaderFloat64);
	 }

	/**
	 * get method for field shaderFloat64	[boolean]<br>
	 * Prototype: VkBool32  shaderFloat64
	 */ 
	 public boolean shaderFloat64(){
		 // return  this.shaderFloat64;
		 return shaderFloat640(super.ptr);
	 }

	/**
	 * Set method for field shaderInt64	[boolean]<br>
	 * Prototype: VkBool32  shaderInt64
	 */ 
	 public void shaderInt64(boolean shaderInt64){
		 this.shaderInt64 = shaderInt64;
		shaderInt640(super.ptr, shaderInt64);
	 }

	/**
	 * get method for field shaderInt64	[boolean]<br>
	 * Prototype: VkBool32  shaderInt64
	 */ 
	 public boolean shaderInt64(){
		 // return  this.shaderInt64;
		 return shaderInt640(super.ptr);
	 }

	/**
	 * Set method for field shaderInt16	[boolean]<br>
	 * Prototype: VkBool32  shaderInt16
	 */ 
	 public void shaderInt16(boolean shaderInt16){
		 this.shaderInt16 = shaderInt16;
		shaderInt160(super.ptr, shaderInt16);
	 }

	/**
	 * get method for field shaderInt16	[boolean]<br>
	 * Prototype: VkBool32  shaderInt16
	 */ 
	 public boolean shaderInt16(){
		 // return  this.shaderInt16;
		 return shaderInt160(super.ptr);
	 }

	/**
	 * Set method for field shaderResourceResidency	[boolean]<br>
	 * Prototype: VkBool32  shaderResourceResidency
	 */ 
	 public void shaderResourceResidency(boolean shaderResourceResidency){
		 this.shaderResourceResidency = shaderResourceResidency;
		shaderResourceResidency0(super.ptr, shaderResourceResidency);
	 }

	/**
	 * get method for field shaderResourceResidency	[boolean]<br>
	 * Prototype: VkBool32  shaderResourceResidency
	 */ 
	 public boolean shaderResourceResidency(){
		 // return  this.shaderResourceResidency;
		 return shaderResourceResidency0(super.ptr);
	 }

	/**
	 * Set method for field shaderResourceMinLod	[boolean]<br>
	 * Prototype: VkBool32  shaderResourceMinLod
	 */ 
	 public void shaderResourceMinLod(boolean shaderResourceMinLod){
		 this.shaderResourceMinLod = shaderResourceMinLod;
		shaderResourceMinLod0(super.ptr, shaderResourceMinLod);
	 }

	/**
	 * get method for field shaderResourceMinLod	[boolean]<br>
	 * Prototype: VkBool32  shaderResourceMinLod
	 */ 
	 public boolean shaderResourceMinLod(){
		 // return  this.shaderResourceMinLod;
		 return shaderResourceMinLod0(super.ptr);
	 }

	/**
	 * Set method for field sparseBinding	[boolean]<br>
	 * Prototype: VkBool32  sparseBinding
	 */ 
	 public void sparseBinding(boolean sparseBinding){
		 this.sparseBinding = sparseBinding;
		sparseBinding0(super.ptr, sparseBinding);
	 }

	/**
	 * get method for field sparseBinding	[boolean]<br>
	 * Prototype: VkBool32  sparseBinding
	 */ 
	 public boolean sparseBinding(){
		 // return  this.sparseBinding;
		 return sparseBinding0(super.ptr);
	 }

	/**
	 * Set method for field sparseResidencyBuffer	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyBuffer
	 */ 
	 public void sparseResidencyBuffer(boolean sparseResidencyBuffer){
		 this.sparseResidencyBuffer = sparseResidencyBuffer;
		sparseResidencyBuffer0(super.ptr, sparseResidencyBuffer);
	 }

	/**
	 * get method for field sparseResidencyBuffer	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyBuffer
	 */ 
	 public boolean sparseResidencyBuffer(){
		 // return  this.sparseResidencyBuffer;
		 return sparseResidencyBuffer0(super.ptr);
	 }

	/**
	 * Set method for field sparseResidencyImage2D	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyImage2D
	 */ 
	 public void sparseResidencyImage2D(boolean sparseResidencyImage2D){
		 this.sparseResidencyImage2D = sparseResidencyImage2D;
		sparseResidencyImage2D0(super.ptr, sparseResidencyImage2D);
	 }

	/**
	 * get method for field sparseResidencyImage2D	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyImage2D
	 */ 
	 public boolean sparseResidencyImage2D(){
		 // return  this.sparseResidencyImage2D;
		 return sparseResidencyImage2D0(super.ptr);
	 }

	/**
	 * Set method for field sparseResidencyImage3D	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyImage3D
	 */ 
	 public void sparseResidencyImage3D(boolean sparseResidencyImage3D){
		 this.sparseResidencyImage3D = sparseResidencyImage3D;
		sparseResidencyImage3D0(super.ptr, sparseResidencyImage3D);
	 }

	/**
	 * get method for field sparseResidencyImage3D	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyImage3D
	 */ 
	 public boolean sparseResidencyImage3D(){
		 // return  this.sparseResidencyImage3D;
		 return sparseResidencyImage3D0(super.ptr);
	 }

	/**
	 * Set method for field sparseResidency2Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency2Samples
	 */ 
	 public void sparseResidency2Samples(boolean sparseResidency2Samples){
		 this.sparseResidency2Samples = sparseResidency2Samples;
		sparseResidency2Samples0(super.ptr, sparseResidency2Samples);
	 }

	/**
	 * get method for field sparseResidency2Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency2Samples
	 */ 
	 public boolean sparseResidency2Samples(){
		 // return  this.sparseResidency2Samples;
		 return sparseResidency2Samples0(super.ptr);
	 }

	/**
	 * Set method for field sparseResidency4Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency4Samples
	 */ 
	 public void sparseResidency4Samples(boolean sparseResidency4Samples){
		 this.sparseResidency4Samples = sparseResidency4Samples;
		sparseResidency4Samples0(super.ptr, sparseResidency4Samples);
	 }

	/**
	 * get method for field sparseResidency4Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency4Samples
	 */ 
	 public boolean sparseResidency4Samples(){
		 // return  this.sparseResidency4Samples;
		 return sparseResidency4Samples0(super.ptr);
	 }

	/**
	 * Set method for field sparseResidency8Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency8Samples
	 */ 
	 public void sparseResidency8Samples(boolean sparseResidency8Samples){
		 this.sparseResidency8Samples = sparseResidency8Samples;
		sparseResidency8Samples0(super.ptr, sparseResidency8Samples);
	 }

	/**
	 * get method for field sparseResidency8Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency8Samples
	 */ 
	 public boolean sparseResidency8Samples(){
		 // return  this.sparseResidency8Samples;
		 return sparseResidency8Samples0(super.ptr);
	 }

	/**
	 * Set method for field sparseResidency16Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency16Samples
	 */ 
	 public void sparseResidency16Samples(boolean sparseResidency16Samples){
		 this.sparseResidency16Samples = sparseResidency16Samples;
		sparseResidency16Samples0(super.ptr, sparseResidency16Samples);
	 }

	/**
	 * get method for field sparseResidency16Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency16Samples
	 */ 
	 public boolean sparseResidency16Samples(){
		 // return  this.sparseResidency16Samples;
		 return sparseResidency16Samples0(super.ptr);
	 }

	/**
	 * Set method for field sparseResidencyAliased	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyAliased
	 */ 
	 public void sparseResidencyAliased(boolean sparseResidencyAliased){
		 this.sparseResidencyAliased = sparseResidencyAliased;
		sparseResidencyAliased0(super.ptr, sparseResidencyAliased);
	 }

	/**
	 * get method for field sparseResidencyAliased	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyAliased
	 */ 
	 public boolean sparseResidencyAliased(){
		 // return  this.sparseResidencyAliased;
		 return sparseResidencyAliased0(super.ptr);
	 }

	/**
	 * Set method for field variableMultisampleRate	[boolean]<br>
	 * Prototype: VkBool32  variableMultisampleRate
	 */ 
	 public void variableMultisampleRate(boolean variableMultisampleRate){
		 this.variableMultisampleRate = variableMultisampleRate;
		variableMultisampleRate0(super.ptr, variableMultisampleRate);
	 }

	/**
	 * get method for field variableMultisampleRate	[boolean]<br>
	 * Prototype: VkBool32  variableMultisampleRate
	 */ 
	 public boolean variableMultisampleRate(){
		 // return  this.variableMultisampleRate;
		 return variableMultisampleRate0(super.ptr);
	 }

	/**
	 * Set method for field inheritedQueries	[boolean]<br>
	 * Prototype: VkBool32  inheritedQueries
	 */ 
	 public void inheritedQueries(boolean inheritedQueries){
		 this.inheritedQueries = inheritedQueries;
		inheritedQueries0(super.ptr, inheritedQueries);
	 }

	/**
	 * get method for field inheritedQueries	[boolean]<br>
	 * Prototype: VkBool32  inheritedQueries
	 */ 
	 public boolean inheritedQueries(){
		 // return  this.inheritedQueries;
		 return inheritedQueries0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field robustBufferAccess	[boolean]<br>
	 * Prototype: VkBool32  robustBufferAccess
	 */ 
	 private static native void robustBufferAccess0(ByteBuffer ptr, boolean _robustBufferAccess);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.robustBufferAccess = (VkBool32) (_robustBufferAccess);
	  */

	/**
	 * native GET method for field robustBufferAccess	[boolean]<br>
	 * Prototype: VkBool32  robustBufferAccess
	 */ 
	 private static native boolean robustBufferAccess0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field fullDrawIndexUint32	[boolean]<br>
	 * Prototype: VkBool32  fullDrawIndexUint32
	 */ 
	 private static native void fullDrawIndexUint320(ByteBuffer ptr, boolean _fullDrawIndexUint32);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.fullDrawIndexUint32 = (VkBool32) (_fullDrawIndexUint32);
	  */

	/**
	 * native GET method for field fullDrawIndexUint32	[boolean]<br>
	 * Prototype: VkBool32  fullDrawIndexUint32
	 */ 
	 private static native boolean fullDrawIndexUint320(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field imageCubeArray	[boolean]<br>
	 * Prototype: VkBool32  imageCubeArray
	 */ 
	 private static native void imageCubeArray0(ByteBuffer ptr, boolean _imageCubeArray);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.imageCubeArray = (VkBool32) (_imageCubeArray);
	  */

	/**
	 * native GET method for field imageCubeArray	[boolean]<br>
	 * Prototype: VkBool32  imageCubeArray
	 */ 
	 private static native boolean imageCubeArray0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field independentBlend	[boolean]<br>
	 * Prototype: VkBool32  independentBlend
	 */ 
	 private static native void independentBlend0(ByteBuffer ptr, boolean _independentBlend);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.independentBlend = (VkBool32) (_independentBlend);
	  */

	/**
	 * native GET method for field independentBlend	[boolean]<br>
	 * Prototype: VkBool32  independentBlend
	 */ 
	 private static native boolean independentBlend0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field geometryShader	[boolean]<br>
	 * Prototype: VkBool32  geometryShader
	 */ 
	 private static native void geometryShader0(ByteBuffer ptr, boolean _geometryShader);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.geometryShader = (VkBool32) (_geometryShader);
	  */

	/**
	 * native GET method for field geometryShader	[boolean]<br>
	 * Prototype: VkBool32  geometryShader
	 */ 
	 private static native boolean geometryShader0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field tessellationShader	[boolean]<br>
	 * Prototype: VkBool32  tessellationShader
	 */ 
	 private static native void tessellationShader0(ByteBuffer ptr, boolean _tessellationShader);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.tessellationShader = (VkBool32) (_tessellationShader);
	  */

	/**
	 * native GET method for field tessellationShader	[boolean]<br>
	 * Prototype: VkBool32  tessellationShader
	 */ 
	 private static native boolean tessellationShader0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field sampleRateShading	[boolean]<br>
	 * Prototype: VkBool32  sampleRateShading
	 */ 
	 private static native void sampleRateShading0(ByteBuffer ptr, boolean _sampleRateShading);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.sampleRateShading = (VkBool32) (_sampleRateShading);
	  */

	/**
	 * native GET method for field sampleRateShading	[boolean]<br>
	 * Prototype: VkBool32  sampleRateShading
	 */ 
	 private static native boolean sampleRateShading0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field dualSrcBlend	[boolean]<br>
	 * Prototype: VkBool32  dualSrcBlend
	 */ 
	 private static native void dualSrcBlend0(ByteBuffer ptr, boolean _dualSrcBlend);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.dualSrcBlend = (VkBool32) (_dualSrcBlend);
	  */

	/**
	 * native GET method for field dualSrcBlend	[boolean]<br>
	 * Prototype: VkBool32  dualSrcBlend
	 */ 
	 private static native boolean dualSrcBlend0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field logicOp	[boolean]<br>
	 * Prototype: VkBool32  logicOp
	 */ 
	 private static native void logicOp0(ByteBuffer ptr, boolean _logicOp);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.logicOp = (VkBool32) (_logicOp);
	  */

	/**
	 * native GET method for field logicOp	[boolean]<br>
	 * Prototype: VkBool32  logicOp
	 */ 
	 private static native boolean logicOp0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field multiDrawIndirect	[boolean]<br>
	 * Prototype: VkBool32  multiDrawIndirect
	 */ 
	 private static native void multiDrawIndirect0(ByteBuffer ptr, boolean _multiDrawIndirect);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.multiDrawIndirect = (VkBool32) (_multiDrawIndirect);
	  */

	/**
	 * native GET method for field multiDrawIndirect	[boolean]<br>
	 * Prototype: VkBool32  multiDrawIndirect
	 */ 
	 private static native boolean multiDrawIndirect0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field drawIndirectFirstInstance	[boolean]<br>
	 * Prototype: VkBool32  drawIndirectFirstInstance
	 */ 
	 private static native void drawIndirectFirstInstance0(ByteBuffer ptr, boolean _drawIndirectFirstInstance);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.drawIndirectFirstInstance = (VkBool32) (_drawIndirectFirstInstance);
	  */

	/**
	 * native GET method for field drawIndirectFirstInstance	[boolean]<br>
	 * Prototype: VkBool32  drawIndirectFirstInstance
	 */ 
	 private static native boolean drawIndirectFirstInstance0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field depthClamp	[boolean]<br>
	 * Prototype: VkBool32  depthClamp
	 */ 
	 private static native void depthClamp0(ByteBuffer ptr, boolean _depthClamp);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.depthClamp = (VkBool32) (_depthClamp);
	  */

	/**
	 * native GET method for field depthClamp	[boolean]<br>
	 * Prototype: VkBool32  depthClamp
	 */ 
	 private static native boolean depthClamp0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field depthBiasClamp	[boolean]<br>
	 * Prototype: VkBool32  depthBiasClamp
	 */ 
	 private static native void depthBiasClamp0(ByteBuffer ptr, boolean _depthBiasClamp);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.depthBiasClamp = (VkBool32) (_depthBiasClamp);
	  */

	/**
	 * native GET method for field depthBiasClamp	[boolean]<br>
	 * Prototype: VkBool32  depthBiasClamp
	 */ 
	 private static native boolean depthBiasClamp0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field fillModeNonSolid	[boolean]<br>
	 * Prototype: VkBool32  fillModeNonSolid
	 */ 
	 private static native void fillModeNonSolid0(ByteBuffer ptr, boolean _fillModeNonSolid);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.fillModeNonSolid = (VkBool32) (_fillModeNonSolid);
	  */

	/**
	 * native GET method for field fillModeNonSolid	[boolean]<br>
	 * Prototype: VkBool32  fillModeNonSolid
	 */ 
	 private static native boolean fillModeNonSolid0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field depthBounds	[boolean]<br>
	 * Prototype: VkBool32  depthBounds
	 */ 
	 private static native void depthBounds0(ByteBuffer ptr, boolean _depthBounds);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.depthBounds = (VkBool32) (_depthBounds);
	  */

	/**
	 * native GET method for field depthBounds	[boolean]<br>
	 * Prototype: VkBool32  depthBounds
	 */ 
	 private static native boolean depthBounds0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field wideLines	[boolean]<br>
	 * Prototype: VkBool32  wideLines
	 */ 
	 private static native void wideLines0(ByteBuffer ptr, boolean _wideLines);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.wideLines = (VkBool32) (_wideLines);
	  */

	/**
	 * native GET method for field wideLines	[boolean]<br>
	 * Prototype: VkBool32  wideLines
	 */ 
	 private static native boolean wideLines0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field largePoints	[boolean]<br>
	 * Prototype: VkBool32  largePoints
	 */ 
	 private static native void largePoints0(ByteBuffer ptr, boolean _largePoints);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.largePoints = (VkBool32) (_largePoints);
	  */

	/**
	 * native GET method for field largePoints	[boolean]<br>
	 * Prototype: VkBool32  largePoints
	 */ 
	 private static native boolean largePoints0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field alphaToOne	[boolean]<br>
	 * Prototype: VkBool32  alphaToOne
	 */ 
	 private static native void alphaToOne0(ByteBuffer ptr, boolean _alphaToOne);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.alphaToOne = (VkBool32) (_alphaToOne);
	  */

	/**
	 * native GET method for field alphaToOne	[boolean]<br>
	 * Prototype: VkBool32  alphaToOne
	 */ 
	 private static native boolean alphaToOne0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field multiViewport	[boolean]<br>
	 * Prototype: VkBool32  multiViewport
	 */ 
	 private static native void multiViewport0(ByteBuffer ptr, boolean _multiViewport);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.multiViewport = (VkBool32) (_multiViewport);
	  */

	/**
	 * native GET method for field multiViewport	[boolean]<br>
	 * Prototype: VkBool32  multiViewport
	 */ 
	 private static native boolean multiViewport0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field samplerAnisotropy	[boolean]<br>
	 * Prototype: VkBool32  samplerAnisotropy
	 */ 
	 private static native void samplerAnisotropy0(ByteBuffer ptr, boolean _samplerAnisotropy);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.samplerAnisotropy = (VkBool32) (_samplerAnisotropy);
	  */

	/**
	 * native GET method for field samplerAnisotropy	[boolean]<br>
	 * Prototype: VkBool32  samplerAnisotropy
	 */ 
	 private static native boolean samplerAnisotropy0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field textureCompressionETC2	[boolean]<br>
	 * Prototype: VkBool32  textureCompressionETC2
	 */ 
	 private static native void textureCompressionETC20(ByteBuffer ptr, boolean _textureCompressionETC2);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.textureCompressionETC2 = (VkBool32) (_textureCompressionETC2);
	  */

	/**
	 * native GET method for field textureCompressionETC2	[boolean]<br>
	 * Prototype: VkBool32  textureCompressionETC2
	 */ 
	 private static native boolean textureCompressionETC20(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field textureCompressionASTC_LDR	[boolean]<br>
	 * Prototype: VkBool32  textureCompressionASTC_LDR
	 */ 
	 private static native void textureCompressionASTC_LDR0(ByteBuffer ptr, boolean _textureCompressionASTC_LDR);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.textureCompressionASTC_LDR = (VkBool32) (_textureCompressionASTC_LDR);
	  */

	/**
	 * native GET method for field textureCompressionASTC_LDR	[boolean]<br>
	 * Prototype: VkBool32  textureCompressionASTC_LDR
	 */ 
	 private static native boolean textureCompressionASTC_LDR0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field textureCompressionBC	[boolean]<br>
	 * Prototype: VkBool32  textureCompressionBC
	 */ 
	 private static native void textureCompressionBC0(ByteBuffer ptr, boolean _textureCompressionBC);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.textureCompressionBC = (VkBool32) (_textureCompressionBC);
	  */

	/**
	 * native GET method for field textureCompressionBC	[boolean]<br>
	 * Prototype: VkBool32  textureCompressionBC
	 */ 
	 private static native boolean textureCompressionBC0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field occlusionQueryPrecise	[boolean]<br>
	 * Prototype: VkBool32  occlusionQueryPrecise
	 */ 
	 private static native void occlusionQueryPrecise0(ByteBuffer ptr, boolean _occlusionQueryPrecise);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.occlusionQueryPrecise = (VkBool32) (_occlusionQueryPrecise);
	  */

	/**
	 * native GET method for field occlusionQueryPrecise	[boolean]<br>
	 * Prototype: VkBool32  occlusionQueryPrecise
	 */ 
	 private static native boolean occlusionQueryPrecise0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field pipelineStatisticsQuery	[boolean]<br>
	 * Prototype: VkBool32  pipelineStatisticsQuery
	 */ 
	 private static native void pipelineStatisticsQuery0(ByteBuffer ptr, boolean _pipelineStatisticsQuery);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.pipelineStatisticsQuery = (VkBool32) (_pipelineStatisticsQuery);
	  */

	/**
	 * native GET method for field pipelineStatisticsQuery	[boolean]<br>
	 * Prototype: VkBool32  pipelineStatisticsQuery
	 */ 
	 private static native boolean pipelineStatisticsQuery0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field vertexPipelineStoresAndAtomics	[boolean]<br>
	 * Prototype: VkBool32  vertexPipelineStoresAndAtomics
	 */ 
	 private static native void vertexPipelineStoresAndAtomics0(ByteBuffer ptr, boolean _vertexPipelineStoresAndAtomics);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.vertexPipelineStoresAndAtomics = (VkBool32) (_vertexPipelineStoresAndAtomics);
	  */

	/**
	 * native GET method for field vertexPipelineStoresAndAtomics	[boolean]<br>
	 * Prototype: VkBool32  vertexPipelineStoresAndAtomics
	 */ 
	 private static native boolean vertexPipelineStoresAndAtomics0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field fragmentStoresAndAtomics	[boolean]<br>
	 * Prototype: VkBool32  fragmentStoresAndAtomics
	 */ 
	 private static native void fragmentStoresAndAtomics0(ByteBuffer ptr, boolean _fragmentStoresAndAtomics);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.fragmentStoresAndAtomics = (VkBool32) (_fragmentStoresAndAtomics);
	  */

	/**
	 * native GET method for field fragmentStoresAndAtomics	[boolean]<br>
	 * Prototype: VkBool32  fragmentStoresAndAtomics
	 */ 
	 private static native boolean fragmentStoresAndAtomics0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field shaderTessellationAndGeometryPointSize	[boolean]<br>
	 * Prototype: VkBool32  shaderTessellationAndGeometryPointSize
	 */ 
	 private static native void shaderTessellationAndGeometryPointSize0(ByteBuffer ptr, boolean _shaderTessellationAndGeometryPointSize);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.shaderTessellationAndGeometryPointSize = (VkBool32) (_shaderTessellationAndGeometryPointSize);
	  */

	/**
	 * native GET method for field shaderTessellationAndGeometryPointSize	[boolean]<br>
	 * Prototype: VkBool32  shaderTessellationAndGeometryPointSize
	 */ 
	 private static native boolean shaderTessellationAndGeometryPointSize0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field shaderImageGatherExtended	[boolean]<br>
	 * Prototype: VkBool32  shaderImageGatherExtended
	 */ 
	 private static native void shaderImageGatherExtended0(ByteBuffer ptr, boolean _shaderImageGatherExtended);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.shaderImageGatherExtended = (VkBool32) (_shaderImageGatherExtended);
	  */

	/**
	 * native GET method for field shaderImageGatherExtended	[boolean]<br>
	 * Prototype: VkBool32  shaderImageGatherExtended
	 */ 
	 private static native boolean shaderImageGatherExtended0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field shaderStorageImageExtendedFormats	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageExtendedFormats
	 */ 
	 private static native void shaderStorageImageExtendedFormats0(ByteBuffer ptr, boolean _shaderStorageImageExtendedFormats);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.shaderStorageImageExtendedFormats = (VkBool32) (_shaderStorageImageExtendedFormats);
	  */

	/**
	 * native GET method for field shaderStorageImageExtendedFormats	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageExtendedFormats
	 */ 
	 private static native boolean shaderStorageImageExtendedFormats0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field shaderStorageImageMultisample	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageMultisample
	 */ 
	 private static native void shaderStorageImageMultisample0(ByteBuffer ptr, boolean _shaderStorageImageMultisample);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.shaderStorageImageMultisample = (VkBool32) (_shaderStorageImageMultisample);
	  */

	/**
	 * native GET method for field shaderStorageImageMultisample	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageMultisample
	 */ 
	 private static native boolean shaderStorageImageMultisample0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field shaderStorageImageReadWithoutFormat	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageReadWithoutFormat
	 */ 
	 private static native void shaderStorageImageReadWithoutFormat0(ByteBuffer ptr, boolean _shaderStorageImageReadWithoutFormat);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.shaderStorageImageReadWithoutFormat = (VkBool32) (_shaderStorageImageReadWithoutFormat);
	  */

	/**
	 * native GET method for field shaderStorageImageReadWithoutFormat	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageReadWithoutFormat
	 */ 
	 private static native boolean shaderStorageImageReadWithoutFormat0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field shaderStorageImageWriteWithoutFormat	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageWriteWithoutFormat
	 */ 
	 private static native void shaderStorageImageWriteWithoutFormat0(ByteBuffer ptr, boolean _shaderStorageImageWriteWithoutFormat);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.shaderStorageImageWriteWithoutFormat = (VkBool32) (_shaderStorageImageWriteWithoutFormat);
	  */

	/**
	 * native GET method for field shaderStorageImageWriteWithoutFormat	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageWriteWithoutFormat
	 */ 
	 private static native boolean shaderStorageImageWriteWithoutFormat0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field shaderUniformBufferArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderUniformBufferArrayDynamicIndexing
	 */ 
	 private static native void shaderUniformBufferArrayDynamicIndexing0(ByteBuffer ptr, boolean _shaderUniformBufferArrayDynamicIndexing);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.shaderUniformBufferArrayDynamicIndexing = (VkBool32) (_shaderUniformBufferArrayDynamicIndexing);
	  */

	/**
	 * native GET method for field shaderUniformBufferArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderUniformBufferArrayDynamicIndexing
	 */ 
	 private static native boolean shaderUniformBufferArrayDynamicIndexing0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field shaderSampledImageArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderSampledImageArrayDynamicIndexing
	 */ 
	 private static native void shaderSampledImageArrayDynamicIndexing0(ByteBuffer ptr, boolean _shaderSampledImageArrayDynamicIndexing);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.shaderSampledImageArrayDynamicIndexing = (VkBool32) (_shaderSampledImageArrayDynamicIndexing);
	  */

	/**
	 * native GET method for field shaderSampledImageArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderSampledImageArrayDynamicIndexing
	 */ 
	 private static native boolean shaderSampledImageArrayDynamicIndexing0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field shaderStorageBufferArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageBufferArrayDynamicIndexing
	 */ 
	 private static native void shaderStorageBufferArrayDynamicIndexing0(ByteBuffer ptr, boolean _shaderStorageBufferArrayDynamicIndexing);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.shaderStorageBufferArrayDynamicIndexing = (VkBool32) (_shaderStorageBufferArrayDynamicIndexing);
	  */

	/**
	 * native GET method for field shaderStorageBufferArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageBufferArrayDynamicIndexing
	 */ 
	 private static native boolean shaderStorageBufferArrayDynamicIndexing0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field shaderStorageImageArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageArrayDynamicIndexing
	 */ 
	 private static native void shaderStorageImageArrayDynamicIndexing0(ByteBuffer ptr, boolean _shaderStorageImageArrayDynamicIndexing);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.shaderStorageImageArrayDynamicIndexing = (VkBool32) (_shaderStorageImageArrayDynamicIndexing);
	  */

	/**
	 * native GET method for field shaderStorageImageArrayDynamicIndexing	[boolean]<br>
	 * Prototype: VkBool32  shaderStorageImageArrayDynamicIndexing
	 */ 
	 private static native boolean shaderStorageImageArrayDynamicIndexing0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field shaderClipDistance	[boolean]<br>
	 * Prototype: VkBool32  shaderClipDistance
	 */ 
	 private static native void shaderClipDistance0(ByteBuffer ptr, boolean _shaderClipDistance);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.shaderClipDistance = (VkBool32) (_shaderClipDistance);
	  */

	/**
	 * native GET method for field shaderClipDistance	[boolean]<br>
	 * Prototype: VkBool32  shaderClipDistance
	 */ 
	 private static native boolean shaderClipDistance0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field shaderCullDistance	[boolean]<br>
	 * Prototype: VkBool32  shaderCullDistance
	 */ 
	 private static native void shaderCullDistance0(ByteBuffer ptr, boolean _shaderCullDistance);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.shaderCullDistance = (VkBool32) (_shaderCullDistance);
	  */

	/**
	 * native GET method for field shaderCullDistance	[boolean]<br>
	 * Prototype: VkBool32  shaderCullDistance
	 */ 
	 private static native boolean shaderCullDistance0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field shaderFloat64	[boolean]<br>
	 * Prototype: VkBool32  shaderFloat64
	 */ 
	 private static native void shaderFloat640(ByteBuffer ptr, boolean _shaderFloat64);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.shaderFloat64 = (VkBool32) (_shaderFloat64);
	  */

	/**
	 * native GET method for field shaderFloat64	[boolean]<br>
	 * Prototype: VkBool32  shaderFloat64
	 */ 
	 private static native boolean shaderFloat640(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field shaderInt64	[boolean]<br>
	 * Prototype: VkBool32  shaderInt64
	 */ 
	 private static native void shaderInt640(ByteBuffer ptr, boolean _shaderInt64);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.shaderInt64 = (VkBool32) (_shaderInt64);
	  */

	/**
	 * native GET method for field shaderInt64	[boolean]<br>
	 * Prototype: VkBool32  shaderInt64
	 */ 
	 private static native boolean shaderInt640(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field shaderInt16	[boolean]<br>
	 * Prototype: VkBool32  shaderInt16
	 */ 
	 private static native void shaderInt160(ByteBuffer ptr, boolean _shaderInt16);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.shaderInt16 = (VkBool32) (_shaderInt16);
	  */

	/**
	 * native GET method for field shaderInt16	[boolean]<br>
	 * Prototype: VkBool32  shaderInt16
	 */ 
	 private static native boolean shaderInt160(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field shaderResourceResidency	[boolean]<br>
	 * Prototype: VkBool32  shaderResourceResidency
	 */ 
	 private static native void shaderResourceResidency0(ByteBuffer ptr, boolean _shaderResourceResidency);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.shaderResourceResidency = (VkBool32) (_shaderResourceResidency);
	  */

	/**
	 * native GET method for field shaderResourceResidency	[boolean]<br>
	 * Prototype: VkBool32  shaderResourceResidency
	 */ 
	 private static native boolean shaderResourceResidency0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field shaderResourceMinLod	[boolean]<br>
	 * Prototype: VkBool32  shaderResourceMinLod
	 */ 
	 private static native void shaderResourceMinLod0(ByteBuffer ptr, boolean _shaderResourceMinLod);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.shaderResourceMinLod = (VkBool32) (_shaderResourceMinLod);
	  */

	/**
	 * native GET method for field shaderResourceMinLod	[boolean]<br>
	 * Prototype: VkBool32  shaderResourceMinLod
	 */ 
	 private static native boolean shaderResourceMinLod0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field sparseBinding	[boolean]<br>
	 * Prototype: VkBool32  sparseBinding
	 */ 
	 private static native void sparseBinding0(ByteBuffer ptr, boolean _sparseBinding);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.sparseBinding = (VkBool32) (_sparseBinding);
	  */

	/**
	 * native GET method for field sparseBinding	[boolean]<br>
	 * Prototype: VkBool32  sparseBinding
	 */ 
	 private static native boolean sparseBinding0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field sparseResidencyBuffer	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyBuffer
	 */ 
	 private static native void sparseResidencyBuffer0(ByteBuffer ptr, boolean _sparseResidencyBuffer);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.sparseResidencyBuffer = (VkBool32) (_sparseResidencyBuffer);
	  */

	/**
	 * native GET method for field sparseResidencyBuffer	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyBuffer
	 */ 
	 private static native boolean sparseResidencyBuffer0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field sparseResidencyImage2D	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyImage2D
	 */ 
	 private static native void sparseResidencyImage2D0(ByteBuffer ptr, boolean _sparseResidencyImage2D);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.sparseResidencyImage2D = (VkBool32) (_sparseResidencyImage2D);
	  */

	/**
	 * native GET method for field sparseResidencyImage2D	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyImage2D
	 */ 
	 private static native boolean sparseResidencyImage2D0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field sparseResidencyImage3D	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyImage3D
	 */ 
	 private static native void sparseResidencyImage3D0(ByteBuffer ptr, boolean _sparseResidencyImage3D);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.sparseResidencyImage3D = (VkBool32) (_sparseResidencyImage3D);
	  */

	/**
	 * native GET method for field sparseResidencyImage3D	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyImage3D
	 */ 
	 private static native boolean sparseResidencyImage3D0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field sparseResidency2Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency2Samples
	 */ 
	 private static native void sparseResidency2Samples0(ByteBuffer ptr, boolean _sparseResidency2Samples);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.sparseResidency2Samples = (VkBool32) (_sparseResidency2Samples);
	  */

	/**
	 * native GET method for field sparseResidency2Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency2Samples
	 */ 
	 private static native boolean sparseResidency2Samples0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field sparseResidency4Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency4Samples
	 */ 
	 private static native void sparseResidency4Samples0(ByteBuffer ptr, boolean _sparseResidency4Samples);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.sparseResidency4Samples = (VkBool32) (_sparseResidency4Samples);
	  */

	/**
	 * native GET method for field sparseResidency4Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency4Samples
	 */ 
	 private static native boolean sparseResidency4Samples0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field sparseResidency8Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency8Samples
	 */ 
	 private static native void sparseResidency8Samples0(ByteBuffer ptr, boolean _sparseResidency8Samples);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.sparseResidency8Samples = (VkBool32) (_sparseResidency8Samples);
	  */

	/**
	 * native GET method for field sparseResidency8Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency8Samples
	 */ 
	 private static native boolean sparseResidency8Samples0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field sparseResidency16Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency16Samples
	 */ 
	 private static native void sparseResidency16Samples0(ByteBuffer ptr, boolean _sparseResidency16Samples);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.sparseResidency16Samples = (VkBool32) (_sparseResidency16Samples);
	  */

	/**
	 * native GET method for field sparseResidency16Samples	[boolean]<br>
	 * Prototype: VkBool32  sparseResidency16Samples
	 */ 
	 private static native boolean sparseResidency16Samples0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field sparseResidencyAliased	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyAliased
	 */ 
	 private static native void sparseResidencyAliased0(ByteBuffer ptr, boolean _sparseResidencyAliased);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.sparseResidencyAliased = (VkBool32) (_sparseResidencyAliased);
	  */

	/**
	 * native GET method for field sparseResidencyAliased	[boolean]<br>
	 * Prototype: VkBool32  sparseResidencyAliased
	 */ 
	 private static native boolean sparseResidencyAliased0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field variableMultisampleRate	[boolean]<br>
	 * Prototype: VkBool32  variableMultisampleRate
	 */ 
	 private static native void variableMultisampleRate0(ByteBuffer ptr, boolean _variableMultisampleRate);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.variableMultisampleRate = (VkBool32) (_variableMultisampleRate);
	  */

	/**
	 * native GET method for field variableMultisampleRate	[boolean]<br>
	 * Prototype: VkBool32  variableMultisampleRate
	 */ 
	 private static native boolean variableMultisampleRate0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field inheritedQueries	[boolean]<br>
	 * Prototype: VkBool32  inheritedQueries
	 */ 
	 private static native void inheritedQueries0(ByteBuffer ptr, boolean _inheritedQueries);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(*ptr);
		  _obj.inheritedQueries = (VkBool32) (_inheritedQueries);
	  */

	/**
	 * native GET method for field inheritedQueries	[boolean]<br>
	 * Prototype: VkBool32  inheritedQueries
	 */ 
	 private static native boolean inheritedQueries0(ByteBuffer ptr);/*
		  VkPhysicalDeviceFeatures _obj = (VkPhysicalDeviceFeatures)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */



} // end of class VkPhysicalDeviceFeatures
