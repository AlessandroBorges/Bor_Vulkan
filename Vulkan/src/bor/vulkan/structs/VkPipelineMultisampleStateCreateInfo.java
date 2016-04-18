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

import java.nio.Buffer;


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

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [60]  */
	 private static final String TAG = "VkPipelineMultisampleStateCreateInfo";

	/** ID of this structure [60]  */
	 public static final int TAG_ID = VKPIPELINEMULTISAMPLESTATECREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkPipelineMultisampleStateCreateInfo> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkStructureType 	sType	[vkenum]
	 */ 
	 VkStructureType 	sType;

	/**
	 *  const void* 	pNext	[vkobject]
	 */ 
	 VkObject 	pNext;

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
	 *  const VkSampleMask* 	pSampleMask	[int_array]
	 */ 
	 int[] 	pSampleMask;

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
	 public VkPipelineMultisampleStateCreateInfo(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPipelineMultisampleStateCreateInfo(long address){ 
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
	 public static P<VkPipelineMultisampleStateCreateInfo> createNullPointer(){
	        P<VkPipelineMultisampleStateCreateInfo> p = new  P<VkPipelineMultisampleStateCreateInfo>(new VkPipelineMultisampleStateCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkPipelineMultisampleStateCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkPipelineMultisampleStateCreateInfo> (this);
	       }
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
		 int enumVal = sType.getValue();
		 setSType0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = getSType0(super.ptr);
		 this.sType = VkStructureType.fromValue(nativeVal); 
		 return this.sType;
	 }

	/**
	 * Set method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 setPNext0(this.ptr, buff);
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 long pointer = getPNext0(super.ptr);
		 if(pointer == 0){
		    this.pNext = null;
		    return null;
		  } else 
 		 if(this.pNext == null){
		    this.pNext = (VkObject)(new VkHandle(pointer));
		 }else{
		    this.pNext.setPointer(pointer);
		  }
		 return this.pNext;
	 }

	/**
	 * Set method for field flags	[int]<br>
	 * Prototype: VkPipelineMultisampleStateCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkPipelineMultisampleStateCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field rasterizationSamples	[vkenum]<br>
	 * Prototype: VkSampleCountFlagBits  rasterizationSamples
	 */ 
	 public void rasterizationSamples(VkSampleCountFlagBits rasterizationSamples){
		 this.rasterizationSamples = rasterizationSamples;
		 int enumVal = rasterizationSamples.getValue();
		 setRasterizationSamples0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field rasterizationSamples	[vkenum]<br>
	 * Prototype: VkSampleCountFlagBits  rasterizationSamples
	 */ 
	 public VkSampleCountFlagBits rasterizationSamples(){
		 int nativeVal = getRasterizationSamples0(super.ptr);
		 this.rasterizationSamples = VkSampleCountFlagBits.fromValue(nativeVal); 
		 return this.rasterizationSamples;
	 }

	/**
	 * Set method for field sampleShadingEnable	[boolean]<br>
	 * Prototype: VkBool32  sampleShadingEnable
	 */ 
	 public void sampleShadingEnable(boolean sampleShadingEnable){
		 this.sampleShadingEnable = sampleShadingEnable;
		 setSampleShadingEnable0(this.ptr,  sampleShadingEnable);
	 }

	/**
	 * Get method for field sampleShadingEnable	[boolean]<br>
	 * Prototype: VkBool32  sampleShadingEnable
	 */ 
	 public boolean sampleShadingEnable(){
		 boolean var = getSampleShadingEnable0(super.ptr);
		 this.sampleShadingEnable = var;
		 return this.sampleShadingEnable;
	 }

	/**
	 * Set method for field minSampleShading	[float]<br>
	 * Prototype: float  minSampleShading
	 */ 
	 public void minSampleShading(float minSampleShading){
		 this.minSampleShading = minSampleShading;
		 setMinSampleShading0(this.ptr,  minSampleShading);
	 }

	/**
	 * Get method for field minSampleShading	[float]<br>
	 * Prototype: float  minSampleShading
	 */ 
	 public float minSampleShading(){
		 float var = getMinSampleShading0(super.ptr);
		 this.minSampleShading = var;
		 return this.minSampleShading;
	 }

	/**
	 * Set method for field pSampleMask	[int_array]<br>
	 * Prototype: const VkSampleMask*  pSampleMask
	 */ 
	 public void pSampleMask(int[] pSampleMask){
		 this.pSampleMask = pSampleMask;
		 setPSampleMask0(this.ptr,  pSampleMask);
	 }

	/**
	 * Get method for field pSampleMask	[int_array]<br>
	 * Prototype: const VkSampleMask*  pSampleMask
	 */ 
	 public int[] pSampleMask(){
		 int[] var = getPSampleMask0(super.ptr);
		 this.pSampleMask = var;
		 return this.pSampleMask;
	 }

	/**
	 * Set method for field alphaToCoverageEnable	[boolean]<br>
	 * Prototype: VkBool32  alphaToCoverageEnable
	 */ 
	 public void alphaToCoverageEnable(boolean alphaToCoverageEnable){
		 this.alphaToCoverageEnable = alphaToCoverageEnable;
		 setAlphaToCoverageEnable0(this.ptr,  alphaToCoverageEnable);
	 }

	/**
	 * Get method for field alphaToCoverageEnable	[boolean]<br>
	 * Prototype: VkBool32  alphaToCoverageEnable
	 */ 
	 public boolean alphaToCoverageEnable(){
		 boolean var = getAlphaToCoverageEnable0(super.ptr);
		 this.alphaToCoverageEnable = var;
		 return this.alphaToCoverageEnable;
	 }

	/**
	 * Set method for field alphaToOneEnable	[boolean]<br>
	 * Prototype: VkBool32  alphaToOneEnable
	 */ 
	 public void alphaToOneEnable(boolean alphaToOneEnable){
		 this.alphaToOneEnable = alphaToOneEnable;
		 setAlphaToOneEnable0(this.ptr,  alphaToOneEnable);
	 }

	/**
	 * Get method for field alphaToOneEnable	[boolean]<br>
	 * Prototype: VkBool32  alphaToOneEnable
	 */ 
	 public boolean alphaToOneEnable(){
		 boolean var = getAlphaToOneEnable0(super.ptr);
		 this.alphaToOneEnable = var;
		 return this.alphaToOneEnable;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineMultisampleStateCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  vkObj->flags = (VkPipelineMultisampleStateCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineMultisampleStateCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field rasterizationSamples	[vkenum]<br>
	 * Prototype: VkSampleCountFlagBits  rasterizationSamples
	 */ 
	 private static native void setRasterizationSamples0(Buffer ptr, int  _rasterizationSamples);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  vkObj->rasterizationSamples = (VkSampleCountFlagBits) (_rasterizationSamples);
	  */

	/**
	 * native GET method for field rasterizationSamples	[vkenum]<br>
	 * Prototype: VkSampleCountFlagBits  rasterizationSamples
	 */ 
	 private static native int  getRasterizationSamples0(Buffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  return (VkSampleCountFlagBits) (vkObj->rasterizationSamples);
	 */

	/**
	 * native SET method for field sampleShadingEnable	[boolean]<br>
	 * Prototype: VkBool32  sampleShadingEnable
	 */ 
	 private static native void setSampleShadingEnable0(Buffer ptr, boolean _sampleShadingEnable);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  vkObj->sampleShadingEnable = (VkBool32) (_sampleShadingEnable);
	  */

	/**
	 * native GET method for field sampleShadingEnable	[boolean]<br>
	 * Prototype: VkBool32  sampleShadingEnable
	 */ 
	 private static native boolean getSampleShadingEnable0(Buffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->sampleShadingEnable);
	 */

	/**
	 * native SET method for field minSampleShading	[float]<br>
	 * Prototype: float  minSampleShading
	 */ 
	 private static native void setMinSampleShading0(Buffer ptr, float _minSampleShading);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  vkObj->minSampleShading = (float) (_minSampleShading);
	  */

	/**
	 * native GET method for field minSampleShading	[float]<br>
	 * Prototype: float  minSampleShading
	 */ 
	 private static native float getMinSampleShading0(Buffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  return (jfloat) (vkObj->minSampleShading);
	 */

	/**
	 * native SET method for field pSampleMask	[int_array]<br>
	 * Prototype: const VkSampleMask*  pSampleMask
	 */ 
	 private static native void setPSampleMask0(Buffer ptr, int[] _pSampleMask);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  vkObj->pSampleMask = (const VkSampleMask*) (_pSampleMask);
	  */

	/**
	 * native GET method for field pSampleMask	[int_array]<br>
	 * Prototype: const VkSampleMask*  pSampleMask
	 */ 
	 private static native int[] getPSampleMask0(Buffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  return (int[]) (vkObj->pSampleMask);
	 */

	/**
	 * native SET method for field alphaToCoverageEnable	[boolean]<br>
	 * Prototype: VkBool32  alphaToCoverageEnable
	 */ 
	 private static native void setAlphaToCoverageEnable0(Buffer ptr, boolean _alphaToCoverageEnable);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  vkObj->alphaToCoverageEnable = (VkBool32) (_alphaToCoverageEnable);
	  */

	/**
	 * native GET method for field alphaToCoverageEnable	[boolean]<br>
	 * Prototype: VkBool32  alphaToCoverageEnable
	 */ 
	 private static native boolean getAlphaToCoverageEnable0(Buffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->alphaToCoverageEnable);
	 */

	/**
	 * native SET method for field alphaToOneEnable	[boolean]<br>
	 * Prototype: VkBool32  alphaToOneEnable
	 */ 
	 private static native void setAlphaToOneEnable0(Buffer ptr, boolean _alphaToOneEnable);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  vkObj->alphaToOneEnable = (VkBool32) (_alphaToOneEnable);
	  */

	/**
	 * native GET method for field alphaToOneEnable	[boolean]<br>
	 * Prototype: VkBool32  alphaToOneEnable
	 */ 
	 private static native boolean getAlphaToOneEnable0(Buffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->alphaToOneEnable);
	 */



} // end of class VkPipelineMultisampleStateCreateInfo
