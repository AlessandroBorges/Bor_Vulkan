/**
 * Class wrapping Vulkan's VkPipelineMultisampleStateCreateInfo struct.
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
 *  This class is a Java front end for struct VkPipelineMultisampleStateCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPipelineMultisampleStateCreateInfo {
 *     VkStructureType                          sType;
 *     const void*                              pNext;
 *     VkPipelineMultisampleStateCreateFlags    flags;
 *     VkSampleCountFlagBits                    rasterizationSamples;
 *     VkBool32                                 sampleShadingEnable;
 *     float                                    minSampleShading;
 *     const VkSampleMask*                      pSampleMask;
 *     VkBool32                                 alphaToCoverageEnable;
 *     VkBool32                                 alphaToOneEnable;
 * } VkPipelineMultisampleStateCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkPipelineMultisampleStateCreateInfo extends VkStruct {
	/** TAG of this structure [60]  */
	 private static final String TAG = "VkPipelineMultisampleStateCreateInfo";

	/** ID of this structure [60]  */
	 public static final int TAG_ID = VKPIPELINEMULTISAMPLESTATECREATEINFO_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType	[vkenum]
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext	[p]
	 */ 
	P<VkObject> 	pNext;

	/**
	 *  VkPipelineMultisampleStateCreateFlags 	flags	[int]
	 */ 
	int 	flags;

	/**
	 *  VkSampleCountFlagBits 	rasterizationSamples	[vkenum]
	 */ 
	VkSampleCountFlagBits 	rasterizationSamples;

	/**
	 *  VkBool32 	sampleShadingEnable	[boolean]
	 */ 
	boolean 	sampleShadingEnable;

	/**
	 *  float 	minSampleShading	[float]
	 */ 
	float 	minSampleShading;

	/**
	 *  const VkSampleMask* 	pSampleMask	[pinteger]
	 */ 
	PInteger 	pSampleMask;

	/**
	 *  VkBool32 	alphaToCoverageEnable	[boolean]
	 */ 
	boolean 	alphaToCoverageEnable;

	/**
	 *  VkBool32 	alphaToOneEnable	[boolean]
	 */ 
	boolean 	alphaToOneEnable;

	/**
	 * Ctor
	 */
	public VkPipelineMultisampleStateCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineMultisampleStateCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkPipelineMultisampleStateCreateInfo(long address, int memSize){ 
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
	 public static P<VkPipelineMultisampleStateCreateInfo> createNullPointer(){
	        P<VkPipelineMultisampleStateCreateInfo> p = new  P<VkPipelineMultisampleStateCreateInfo>(new VkPipelineMultisampleStateCreateInfo());
	        return p;
	    }

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(P<VkObject> pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public P<VkObject> pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field flags	[int]<br>
	 * Prototype: VkPipelineMultisampleStateCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkPipelineMultisampleStateCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field rasterizationSamples	[vkenum]<br>
	 * Prototype: VkSampleCountFlagBits  rasterizationSamples
	 */ 
	 public void rasterizationSamples(VkSampleCountFlagBits rasterizationSamples){
		 this.rasterizationSamples = rasterizationSamples;
		rasterizationSamples0(super.ptr, rasterizationSamples);
	 }

	/**
	 * get method for field rasterizationSamples	[vkenum]<br>
	 * Prototype: VkSampleCountFlagBits  rasterizationSamples
	 */ 
	 public VkSampleCountFlagBits rasterizationSamples(){
		 // return  this.rasterizationSamples;
		 return rasterizationSamples0(super.ptr);
	 }

	/**
	 * Set method for field sampleShadingEnable	[boolean]<br>
	 * Prototype: VkBool32  sampleShadingEnable
	 */ 
	 public void sampleShadingEnable(boolean sampleShadingEnable){
		 this.sampleShadingEnable = sampleShadingEnable;
		sampleShadingEnable0(super.ptr, sampleShadingEnable);
	 }

	/**
	 * get method for field sampleShadingEnable	[boolean]<br>
	 * Prototype: VkBool32  sampleShadingEnable
	 */ 
	 public boolean sampleShadingEnable(){
		 // return  this.sampleShadingEnable;
		 return sampleShadingEnable0(super.ptr);
	 }

	/**
	 * Set method for field minSampleShading	[float]<br>
	 * Prototype: float  minSampleShading
	 */ 
	 public void minSampleShading(float minSampleShading){
		 this.minSampleShading = minSampleShading;
		minSampleShading0(super.ptr, minSampleShading);
	 }

	/**
	 * get method for field minSampleShading	[float]<br>
	 * Prototype: float  minSampleShading
	 */ 
	 public float minSampleShading(){
		 // return  this.minSampleShading;
		 return minSampleShading0(super.ptr);
	 }

	/**
	 * Set method for field pSampleMask	[pinteger]<br>
	 * Prototype: const VkSampleMask*  pSampleMask
	 */ 
	 public void pSampleMask(PInteger pSampleMask){
		 this.pSampleMask = pSampleMask;
		pSampleMask0(super.ptr, pSampleMask);
	 }

	/**
	 * get method for field pSampleMask	[pinteger]<br>
	 * Prototype: const VkSampleMask*  pSampleMask
	 */ 
	 public PInteger pSampleMask(){
		 // return  this.pSampleMask;
		 return pSampleMask0(super.ptr);
	 }

	/**
	 * Set method for field alphaToCoverageEnable	[boolean]<br>
	 * Prototype: VkBool32  alphaToCoverageEnable
	 */ 
	 public void alphaToCoverageEnable(boolean alphaToCoverageEnable){
		 this.alphaToCoverageEnable = alphaToCoverageEnable;
		alphaToCoverageEnable0(super.ptr, alphaToCoverageEnable);
	 }

	/**
	 * get method for field alphaToCoverageEnable	[boolean]<br>
	 * Prototype: VkBool32  alphaToCoverageEnable
	 */ 
	 public boolean alphaToCoverageEnable(){
		 // return  this.alphaToCoverageEnable;
		 return alphaToCoverageEnable0(super.ptr);
	 }

	/**
	 * Set method for field alphaToOneEnable	[boolean]<br>
	 * Prototype: VkBool32  alphaToOneEnable
	 */ 
	 public void alphaToOneEnable(boolean alphaToOneEnable){
		 this.alphaToOneEnable = alphaToOneEnable;
		alphaToOneEnable0(super.ptr, alphaToOneEnable);
	 }

	/**
	 * get method for field alphaToOneEnable	[boolean]<br>
	 * Prototype: VkBool32  alphaToOneEnable
	 */ 
	 public boolean alphaToOneEnable(){
		 // return  this.alphaToOneEnable;
		 return alphaToOneEnable0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkPipelineMultisampleStateCreateInfo _obj = (VkPipelineMultisampleStateCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo _obj = (VkPipelineMultisampleStateCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkPipelineMultisampleStateCreateInfo _obj = (VkPipelineMultisampleStateCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo _obj = (VkPipelineMultisampleStateCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineMultisampleStateCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkPipelineMultisampleStateCreateInfo _obj = (VkPipelineMultisampleStateCreateInfo)(*ptr);
		  _obj.flags = (VkPipelineMultisampleStateCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineMultisampleStateCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo _obj = (VkPipelineMultisampleStateCreateInfo)(ptr);
		  return (jint) (_obj.VkPipelineMultisampleStateCreateFlags);
	 */

	/**
	 * native SET method for field rasterizationSamples	[vkenum]<br>
	 * Prototype: VkSampleCountFlagBits  rasterizationSamples
	 */ 
	 private static native void rasterizationSamples0(ByteBuffer ptr, VkSampleCountFlagBits _rasterizationSamples);/*
		  VkPipelineMultisampleStateCreateInfo _obj = (VkPipelineMultisampleStateCreateInfo)(*ptr);
		  _obj.rasterizationSamples = (VkSampleCountFlagBits) (_rasterizationSamples);
	  */

	/**
	 * native GET method for field rasterizationSamples	[vkenum]<br>
	 * Prototype: VkSampleCountFlagBits  rasterizationSamples
	 */ 
	 private static native VkSampleCountFlagBits rasterizationSamples0(ByteBuffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo _obj = (VkPipelineMultisampleStateCreateInfo)(ptr);
		  return (VkSampleCountFlagBits) (_obj.VkSampleCountFlagBits);
	 */

	/**
	 * native SET method for field sampleShadingEnable	[boolean]<br>
	 * Prototype: VkBool32  sampleShadingEnable
	 */ 
	 private static native void sampleShadingEnable0(ByteBuffer ptr, boolean _sampleShadingEnable);/*
		  VkPipelineMultisampleStateCreateInfo _obj = (VkPipelineMultisampleStateCreateInfo)(*ptr);
		  _obj.sampleShadingEnable = (VkBool32) (_sampleShadingEnable);
	  */

	/**
	 * native GET method for field sampleShadingEnable	[boolean]<br>
	 * Prototype: VkBool32  sampleShadingEnable
	 */ 
	 private static native boolean sampleShadingEnable0(ByteBuffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo _obj = (VkPipelineMultisampleStateCreateInfo)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field minSampleShading	[float]<br>
	 * Prototype: float  minSampleShading
	 */ 
	 private static native void minSampleShading0(ByteBuffer ptr, float _minSampleShading);/*
		  VkPipelineMultisampleStateCreateInfo _obj = (VkPipelineMultisampleStateCreateInfo)(*ptr);
		  _obj.minSampleShading = (float) (_minSampleShading);
	  */

	/**
	 * native GET method for field minSampleShading	[float]<br>
	 * Prototype: float  minSampleShading
	 */ 
	 private static native float minSampleShading0(ByteBuffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo _obj = (VkPipelineMultisampleStateCreateInfo)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native SET method for field pSampleMask	[pinteger]<br>
	 * Prototype: const VkSampleMask*  pSampleMask
	 */ 
	 private static native void pSampleMask0(ByteBuffer ptr, PInteger _pSampleMask);/*
		  VkPipelineMultisampleStateCreateInfo _obj = (VkPipelineMultisampleStateCreateInfo)(*ptr);
		  _obj.pSampleMask = (const VkSampleMask*) (_pSampleMask);
	  */

	/**
	 * native GET method for field pSampleMask	[pinteger]<br>
	 * Prototype: const VkSampleMask*  pSampleMask
	 */ 
	 private static native PInteger pSampleMask0(ByteBuffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo _obj = (VkPipelineMultisampleStateCreateInfo)(ptr);
		  return (PInteger) (_obj.const VkSampleMask*);
	 */

	/**
	 * native SET method for field alphaToCoverageEnable	[boolean]<br>
	 * Prototype: VkBool32  alphaToCoverageEnable
	 */ 
	 private static native void alphaToCoverageEnable0(ByteBuffer ptr, boolean _alphaToCoverageEnable);/*
		  VkPipelineMultisampleStateCreateInfo _obj = (VkPipelineMultisampleStateCreateInfo)(*ptr);
		  _obj.alphaToCoverageEnable = (VkBool32) (_alphaToCoverageEnable);
	  */

	/**
	 * native GET method for field alphaToCoverageEnable	[boolean]<br>
	 * Prototype: VkBool32  alphaToCoverageEnable
	 */ 
	 private static native boolean alphaToCoverageEnable0(ByteBuffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo _obj = (VkPipelineMultisampleStateCreateInfo)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field alphaToOneEnable	[boolean]<br>
	 * Prototype: VkBool32  alphaToOneEnable
	 */ 
	 private static native void alphaToOneEnable0(ByteBuffer ptr, boolean _alphaToOneEnable);/*
		  VkPipelineMultisampleStateCreateInfo _obj = (VkPipelineMultisampleStateCreateInfo)(*ptr);
		  _obj.alphaToOneEnable = (VkBool32) (_alphaToOneEnable);
	  */

	/**
	 * native GET method for field alphaToOneEnable	[boolean]<br>
	 * Prototype: VkBool32  alphaToOneEnable
	 */ 
	 private static native boolean alphaToOneEnable0(ByteBuffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo _obj = (VkPipelineMultisampleStateCreateInfo)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */



} // end of class VkPipelineMultisampleStateCreateInfo
