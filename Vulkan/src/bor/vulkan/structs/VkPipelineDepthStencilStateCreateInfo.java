/**
 * Class wrapping Vulkan's VkPipelineDepthStencilStateCreateInfo struct.
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
 *  This class is a Java front end for struct VkPipelineDepthStencilStateCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPipelineDepthStencilStateCreateInfo {
 *     VkStructureType                           sType;
 *     const void*                               pNext;
 *     VkPipelineDepthStencilStateCreateFlags    flags;
 *     VkBool32                                  depthTestEnable;
 *     VkBool32                                  depthWriteEnable;
 *     VkCompareOp                               depthCompareOp;
 *     VkBool32                                  depthBoundsTestEnable;
 *     VkBool32                                  stencilTestEnable;
 *     VkStencilOpState                          front;
 *     VkStencilOpState                          back;
 *     float                                     minDepthBounds;
 *     float                                     maxDepthBounds;
 * } VkPipelineDepthStencilStateCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkPipelineDepthStencilStateCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [62]  */
	 private static final String TAG = "VkPipelineDepthStencilStateCreateInfo";

	/** ID of this structure [62]  */
	 public static final int TAG_ID = VKPIPELINEDEPTHSTENCILSTATECREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkPipelineDepthStencilStateCreateInfo> p;

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
	 *  VkPipelineDepthStencilStateCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  VkBool32 	depthTestEnable	[boolean]
	 */ 
	 boolean 	depthTestEnable;

	/**
	 *  VkBool32 	depthWriteEnable	[boolean]
	 */ 
	 boolean 	depthWriteEnable;

	/**
	 *  VkCompareOp 	depthCompareOp	[vkenum]
	 */ 
	 VkCompareOp 	depthCompareOp;

	/**
	 *  VkBool32 	depthBoundsTestEnable	[boolean]
	 */ 
	 boolean 	depthBoundsTestEnable;

	/**
	 *  VkBool32 	stencilTestEnable	[boolean]
	 */ 
	 boolean 	stencilTestEnable;

	/**
	 *  VkStencilOpState 	front	[vkstruct]
	 */ 
	 VkStencilOpState 	front;

	/**
	 *  VkStencilOpState 	back	[vkstruct]
	 */ 
	 VkStencilOpState 	back;

	/**
	 *  float 	minDepthBounds	[float]
	 */ 
	 float 	minDepthBounds;

	/**
	 *  float 	maxDepthBounds	[float]
	 */ 
	 float 	maxDepthBounds;

	/**
	 * Ctor
	 */
	public VkPipelineDepthStencilStateCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineDepthStencilStateCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkPipelineDepthStencilStateCreateInfo(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPipelineDepthStencilStateCreateInfo(long address){ 
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
	 public static P<VkPipelineDepthStencilStateCreateInfo> createNullPointer(){
	        P<VkPipelineDepthStencilStateCreateInfo> p = new  P<VkPipelineDepthStencilStateCreateInfo>(new VkPipelineDepthStencilStateCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkPipelineDepthStencilStateCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkPipelineDepthStencilStateCreateInfo> (this);
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
	 * Prototype: VkPipelineDepthStencilStateCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkPipelineDepthStencilStateCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field depthTestEnable	[boolean]<br>
	 * Prototype: VkBool32  depthTestEnable
	 */ 
	 public void depthTestEnable(boolean depthTestEnable){
		 this.depthTestEnable = depthTestEnable;
		 setDepthTestEnable0(this.ptr,  depthTestEnable);
	 }

	/**
	 * Get method for field depthTestEnable	[boolean]<br>
	 * Prototype: VkBool32  depthTestEnable
	 */ 
	 public boolean depthTestEnable(){
		 boolean var = getDepthTestEnable0(super.ptr);
		 this.depthTestEnable = var;
		 return this.depthTestEnable;
	 }

	/**
	 * Set method for field depthWriteEnable	[boolean]<br>
	 * Prototype: VkBool32  depthWriteEnable
	 */ 
	 public void depthWriteEnable(boolean depthWriteEnable){
		 this.depthWriteEnable = depthWriteEnable;
		 setDepthWriteEnable0(this.ptr,  depthWriteEnable);
	 }

	/**
	 * Get method for field depthWriteEnable	[boolean]<br>
	 * Prototype: VkBool32  depthWriteEnable
	 */ 
	 public boolean depthWriteEnable(){
		 boolean var = getDepthWriteEnable0(super.ptr);
		 this.depthWriteEnable = var;
		 return this.depthWriteEnable;
	 }

	/**
	 * Set method for field depthCompareOp	[vkenum]<br>
	 * Prototype: VkCompareOp  depthCompareOp
	 */ 
	 public void depthCompareOp(VkCompareOp depthCompareOp){
		 this.depthCompareOp = depthCompareOp;
		 int enumVal = depthCompareOp.getValue();
		 setDepthCompareOp0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field depthCompareOp	[vkenum]<br>
	 * Prototype: VkCompareOp  depthCompareOp
	 */ 
	 public VkCompareOp depthCompareOp(){
		 int nativeVal = getDepthCompareOp0(super.ptr);
		 this.depthCompareOp = VkCompareOp.fromValue(nativeVal); 
		 return this.depthCompareOp;
	 }

	/**
	 * Set method for field depthBoundsTestEnable	[boolean]<br>
	 * Prototype: VkBool32  depthBoundsTestEnable
	 */ 
	 public void depthBoundsTestEnable(boolean depthBoundsTestEnable){
		 this.depthBoundsTestEnable = depthBoundsTestEnable;
		 setDepthBoundsTestEnable0(this.ptr,  depthBoundsTestEnable);
	 }

	/**
	 * Get method for field depthBoundsTestEnable	[boolean]<br>
	 * Prototype: VkBool32  depthBoundsTestEnable
	 */ 
	 public boolean depthBoundsTestEnable(){
		 boolean var = getDepthBoundsTestEnable0(super.ptr);
		 this.depthBoundsTestEnable = var;
		 return this.depthBoundsTestEnable;
	 }

	/**
	 * Set method for field stencilTestEnable	[boolean]<br>
	 * Prototype: VkBool32  stencilTestEnable
	 */ 
	 public void stencilTestEnable(boolean stencilTestEnable){
		 this.stencilTestEnable = stencilTestEnable;
		 setStencilTestEnable0(this.ptr,  stencilTestEnable);
	 }

	/**
	 * Get method for field stencilTestEnable	[boolean]<br>
	 * Prototype: VkBool32  stencilTestEnable
	 */ 
	 public boolean stencilTestEnable(){
		 boolean var = getStencilTestEnable0(super.ptr);
		 this.stencilTestEnable = var;
		 return this.stencilTestEnable;
	 }

	/**
	 * Set method for field front	[vkstruct]<br>
	 * Prototype: VkStencilOpState  front
	 */ 
	 public void front(VkStencilOpState front){
		 this.front = front;
		 ByteBuffer buff = (front==null) ? null : front.getPointer();
		 setFront0(this.ptr, buff);
	 }

	/**
	 * Get method for field front	[vkstruct]<br>
	 * Prototype: VkStencilOpState  front
	 */ 
	 public VkStencilOpState front(){
		 long pointer = getFront0(super.ptr);
		 if(pointer == 0){
		    this.front = null;
		    return null;
		  } 

		 if(this.front == null){
		    this.front = new VkStencilOpState(pointer);
		 }else{
		    this.front.setPointer(pointer);
		  }
		 return this.front;
	 }

	/**
	 * Set method for field back	[vkstruct]<br>
	 * Prototype: VkStencilOpState  back
	 */ 
	 public void back(VkStencilOpState back){
		 this.back = back;
		 ByteBuffer buff = (back==null) ? null : back.getPointer();
		 setBack0(this.ptr, buff);
	 }

	/**
	 * Get method for field back	[vkstruct]<br>
	 * Prototype: VkStencilOpState  back
	 */ 
	 public VkStencilOpState back(){
		 long pointer = getBack0(super.ptr);
		 if(pointer == 0){
		    this.back = null;
		    return null;
		  } 

		 if(this.back == null){
		    this.back = new VkStencilOpState(pointer);
		 }else{
		    this.back.setPointer(pointer);
		  }
		 return this.back;
	 }

	/**
	 * Set method for field minDepthBounds	[float]<br>
	 * Prototype: float  minDepthBounds
	 */ 
	 public void minDepthBounds(float minDepthBounds){
		 this.minDepthBounds = minDepthBounds;
		 setMinDepthBounds0(this.ptr,  minDepthBounds);
	 }

	/**
	 * Get method for field minDepthBounds	[float]<br>
	 * Prototype: float  minDepthBounds
	 */ 
	 public float minDepthBounds(){
		 float var = getMinDepthBounds0(super.ptr);
		 this.minDepthBounds = var;
		 return this.minDepthBounds;
	 }

	/**
	 * Set method for field maxDepthBounds	[float]<br>
	 * Prototype: float  maxDepthBounds
	 */ 
	 public void maxDepthBounds(float maxDepthBounds){
		 this.maxDepthBounds = maxDepthBounds;
		 setMaxDepthBounds0(this.ptr,  maxDepthBounds);
	 }

	/**
	 * Get method for field maxDepthBounds	[float]<br>
	 * Prototype: float  maxDepthBounds
	 */ 
	 public float maxDepthBounds(){
		 float var = getMaxDepthBounds0(super.ptr);
		 this.maxDepthBounds = var;
		 return this.maxDepthBounds;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineDepthStencilStateCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  vkObj->flags = (VkPipelineDepthStencilStateCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineDepthStencilStateCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field depthTestEnable	[boolean]<br>
	 * Prototype: VkBool32  depthTestEnable
	 */ 
	 private static native void setDepthTestEnable0(Buffer ptr, boolean _depthTestEnable);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  vkObj->depthTestEnable = (VkBool32) (_depthTestEnable);
	  */

	/**
	 * native GET method for field depthTestEnable	[boolean]<br>
	 * Prototype: VkBool32  depthTestEnable
	 */ 
	 private static native boolean getDepthTestEnable0(Buffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->depthTestEnable);
	 */

	/**
	 * native SET method for field depthWriteEnable	[boolean]<br>
	 * Prototype: VkBool32  depthWriteEnable
	 */ 
	 private static native void setDepthWriteEnable0(Buffer ptr, boolean _depthWriteEnable);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  vkObj->depthWriteEnable = (VkBool32) (_depthWriteEnable);
	  */

	/**
	 * native GET method for field depthWriteEnable	[boolean]<br>
	 * Prototype: VkBool32  depthWriteEnable
	 */ 
	 private static native boolean getDepthWriteEnable0(Buffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->depthWriteEnable);
	 */

	/**
	 * native SET method for field depthCompareOp	[vkenum]<br>
	 * Prototype: VkCompareOp  depthCompareOp
	 */ 
	 private static native void setDepthCompareOp0(Buffer ptr, int  _depthCompareOp);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  vkObj->depthCompareOp = (VkCompareOp) (_depthCompareOp);
	  */

	/**
	 * native GET method for field depthCompareOp	[vkenum]<br>
	 * Prototype: VkCompareOp  depthCompareOp
	 */ 
	 private static native int  getDepthCompareOp0(Buffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (VkCompareOp) (vkObj->depthCompareOp);
	 */

	/**
	 * native SET method for field depthBoundsTestEnable	[boolean]<br>
	 * Prototype: VkBool32  depthBoundsTestEnable
	 */ 
	 private static native void setDepthBoundsTestEnable0(Buffer ptr, boolean _depthBoundsTestEnable);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  vkObj->depthBoundsTestEnable = (VkBool32) (_depthBoundsTestEnable);
	  */

	/**
	 * native GET method for field depthBoundsTestEnable	[boolean]<br>
	 * Prototype: VkBool32  depthBoundsTestEnable
	 */ 
	 private static native boolean getDepthBoundsTestEnable0(Buffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->depthBoundsTestEnable);
	 */

	/**
	 * native SET method for field stencilTestEnable	[boolean]<br>
	 * Prototype: VkBool32  stencilTestEnable
	 */ 
	 private static native void setStencilTestEnable0(Buffer ptr, boolean _stencilTestEnable);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  vkObj->stencilTestEnable = (VkBool32) (_stencilTestEnable);
	  */

	/**
	 * native GET method for field stencilTestEnable	[boolean]<br>
	 * Prototype: VkBool32  stencilTestEnable
	 */ 
	 private static native boolean getStencilTestEnable0(Buffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->stencilTestEnable);
	 */

	/**
	 * native SET method for field front	[vkstruct]<br>
	 * Prototype: VkStencilOpState  front
	 */ 
	 private static native void setFront0(Buffer ptr, java.nio.ByteBuffer  _front);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  vkObj->front = (VkStencilOpState) (_front);
	  */

	/**
	 * native GET method for field front	[vkstruct]<br>
	 * Prototype: VkStencilOpState  front
	 */ 
	 private static native long getFront0(Buffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->front);	 */

	/**
	 * native SET method for field back	[vkstruct]<br>
	 * Prototype: VkStencilOpState  back
	 */ 
	 private static native void setBack0(Buffer ptr, java.nio.ByteBuffer  _back);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  vkObj->back = (VkStencilOpState) (_back);
	  */

	/**
	 * native GET method for field back	[vkstruct]<br>
	 * Prototype: VkStencilOpState  back
	 */ 
	 private static native long getBack0(Buffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->back);	 */

	/**
	 * native SET method for field minDepthBounds	[float]<br>
	 * Prototype: float  minDepthBounds
	 */ 
	 private static native void setMinDepthBounds0(Buffer ptr, float _minDepthBounds);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  vkObj->minDepthBounds = (float) (_minDepthBounds);
	  */

	/**
	 * native GET method for field minDepthBounds	[float]<br>
	 * Prototype: float  minDepthBounds
	 */ 
	 private static native float getMinDepthBounds0(Buffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jfloat) (vkObj->minDepthBounds);
	 */

	/**
	 * native SET method for field maxDepthBounds	[float]<br>
	 * Prototype: float  maxDepthBounds
	 */ 
	 private static native void setMaxDepthBounds0(Buffer ptr, float _maxDepthBounds);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  vkObj->maxDepthBounds = (float) (_maxDepthBounds);
	  */

	/**
	 * native GET method for field maxDepthBounds	[float]<br>
	 * Prototype: float  maxDepthBounds
	 */ 
	 private static native float getMaxDepthBounds0(Buffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jfloat) (vkObj->maxDepthBounds);
	 */



} // end of class VkPipelineDepthStencilStateCreateInfo
