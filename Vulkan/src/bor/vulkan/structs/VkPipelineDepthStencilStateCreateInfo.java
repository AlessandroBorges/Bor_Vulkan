/**
 * Class wrapping Vulkan's VkPipelineDepthStencilStateCreateInfo struct.
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
 * @version Ver. 0.8.65 (beta) 
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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineDepthStencilStateCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 * 
	 * @param sType - a instance of VkStructureType.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineDepthStencilStateCreateInfo sType(VkStructureType sType){
		 this.sType = sType;
		 int enumVal = sType.getValue();
		 setSType0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param pNext - a instance of VkObject.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineDepthStencilStateCreateInfo pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 setPNext0(this.ptr, buff);
		 return this;
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
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineDepthStencilStateCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
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
	 * 
	 * @param depthTestEnable - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineDepthStencilStateCreateInfo depthTestEnable(boolean depthTestEnable){
		 this.depthTestEnable = depthTestEnable;
		 setDepthTestEnable0(this.ptr,  depthTestEnable);
		 return this;
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
	 * 
	 * @param depthWriteEnable - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineDepthStencilStateCreateInfo depthWriteEnable(boolean depthWriteEnable){
		 this.depthWriteEnable = depthWriteEnable;
		 setDepthWriteEnable0(this.ptr,  depthWriteEnable);
		 return this;
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
	 * 
	 * @param depthCompareOp - a instance of VkCompareOp.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineDepthStencilStateCreateInfo depthCompareOp(VkCompareOp depthCompareOp){
		 this.depthCompareOp = depthCompareOp;
		 int enumVal = depthCompareOp.getValue();
		 setDepthCompareOp0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param depthBoundsTestEnable - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineDepthStencilStateCreateInfo depthBoundsTestEnable(boolean depthBoundsTestEnable){
		 this.depthBoundsTestEnable = depthBoundsTestEnable;
		 setDepthBoundsTestEnable0(this.ptr,  depthBoundsTestEnable);
		 return this;
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
	 * 
	 * @param stencilTestEnable - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineDepthStencilStateCreateInfo stencilTestEnable(boolean stencilTestEnable){
		 this.stencilTestEnable = stencilTestEnable;
		 setStencilTestEnable0(this.ptr,  stencilTestEnable);
		 return this;
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
	 * 
	 * @param front - a instance of VkStencilOpState.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineDepthStencilStateCreateInfo front(VkStencilOpState front){
		 this.front = front;
		 ByteBuffer buff = (front==null) ? null : front.getPointer();
		 setFront0(this.ptr, buff);
		 return this;
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
	 * 
	 * @param back - a instance of VkStencilOpState.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineDepthStencilStateCreateInfo back(VkStencilOpState back){
		 this.back = back;
		 ByteBuffer buff = (back==null) ? null : back.getPointer();
		 setBack0(this.ptr, buff);
		 return this;
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
	 * 
	 * @param minDepthBounds - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineDepthStencilStateCreateInfo minDepthBounds(float minDepthBounds){
		 this.minDepthBounds = minDepthBounds;
		 setMinDepthBounds0(this.ptr,  minDepthBounds);
		 return this;
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
	 * 
	 * @param maxDepthBounds - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineDepthStencilStateCreateInfo maxDepthBounds(float maxDepthBounds){
		 this.maxDepthBounds = maxDepthBounds;
		 setMaxDepthBounds0(this.ptr,  maxDepthBounds);
		 return this;
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


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkPipelineDepthStencilStateCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n depthTestEnable: ")
				.append(depthTestEnable() )
				.append(",\n depthWriteEnable: ")
				.append(depthWriteEnable() )
				.append(",\n depthCompareOp: ")
				.append(depthCompareOp() )
				.append(",\n depthBoundsTestEnable: ")
				.append(depthBoundsTestEnable() )
				.append(",\n stencilTestEnable: ")
				.append(stencilTestEnable() )
				.append(",\n front: ")
				.append(front() )
				.append(",\n back: ")
				.append(back() )
				.append(",\n minDepthBounds: ")
				.append(minDepthBounds() )
				.append(",\n maxDepthBounds: ")
				.append(maxDepthBounds() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineDepthStencilStateCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  vkObj->flags = (VkPipelineDepthStencilStateCreateFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineDepthStencilStateCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field depthTestEnable	[boolean]<br>
	 * Prototype: VkBool32  depthTestEnable
	 */ 
	 private static native void setDepthTestEnable0(Buffer ptr, boolean  _depthTestEnable);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  vkObj->depthTestEnable = (VkBool32) (_depthTestEnable);
	  */

	/**
	 * Native GET method for field depthTestEnable	[boolean]<br>
	 * Prototype: VkBool32  depthTestEnable
	 */ 
	 private static native boolean  getDepthTestEnable0(Buffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->depthTestEnable);
	 */

	/**
	 * Native SET method for field depthWriteEnable	[boolean]<br>
	 * Prototype: VkBool32  depthWriteEnable
	 */ 
	 private static native void setDepthWriteEnable0(Buffer ptr, boolean  _depthWriteEnable);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  vkObj->depthWriteEnable = (VkBool32) (_depthWriteEnable);
	  */

	/**
	 * Native GET method for field depthWriteEnable	[boolean]<br>
	 * Prototype: VkBool32  depthWriteEnable
	 */ 
	 private static native boolean  getDepthWriteEnable0(Buffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->depthWriteEnable);
	 */

	/**
	 * Native SET method for field depthCompareOp	[vkenum]<br>
	 * Prototype: VkCompareOp  depthCompareOp
	 */ 
	 private static native void setDepthCompareOp0(Buffer ptr, int  _depthCompareOp);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  vkObj->depthCompareOp = (VkCompareOp) (_depthCompareOp);
	  */

	/**
	 * Native GET method for field depthCompareOp	[vkenum]<br>
	 * Prototype: VkCompareOp  depthCompareOp
	 */ 
	 private static native int  getDepthCompareOp0(Buffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (VkCompareOp) (vkObj->depthCompareOp);
	 */

	/**
	 * Native SET method for field depthBoundsTestEnable	[boolean]<br>
	 * Prototype: VkBool32  depthBoundsTestEnable
	 */ 
	 private static native void setDepthBoundsTestEnable0(Buffer ptr, boolean  _depthBoundsTestEnable);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  vkObj->depthBoundsTestEnable = (VkBool32) (_depthBoundsTestEnable);
	  */

	/**
	 * Native GET method for field depthBoundsTestEnable	[boolean]<br>
	 * Prototype: VkBool32  depthBoundsTestEnable
	 */ 
	 private static native boolean  getDepthBoundsTestEnable0(Buffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->depthBoundsTestEnable);
	 */

	/**
	 * Native SET method for field stencilTestEnable	[boolean]<br>
	 * Prototype: VkBool32  stencilTestEnable
	 */ 
	 private static native void setStencilTestEnable0(Buffer ptr, boolean  _stencilTestEnable);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  vkObj->stencilTestEnable = (VkBool32) (_stencilTestEnable);
	  */

	/**
	 * Native GET method for field stencilTestEnable	[boolean]<br>
	 * Prototype: VkBool32  stencilTestEnable
	 */ 
	 private static native boolean  getStencilTestEnable0(Buffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->stencilTestEnable);
	 */

	/**
	 * Native SET method for field front	[vkstruct]<br>
	 * Prototype: VkStencilOpState  front
	 */ 
	 private static native void setFront0(Buffer ptr, java.nio.ByteBuffer  _front);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  vkObj->front = (VkStencilOpState) (_front);
	  */

	/**
	 * Native GET method for field front	[vkstruct]<br>
	 * Prototype: VkStencilOpState  front
	 */ 
	 private static native long getFront0(Buffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->front);
	 */

	/**
	 * Native SET method for field back	[vkstruct]<br>
	 * Prototype: VkStencilOpState  back
	 */ 
	 private static native void setBack0(Buffer ptr, java.nio.ByteBuffer  _back);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  vkObj->back = (VkStencilOpState) (_back);
	  */

	/**
	 * Native GET method for field back	[vkstruct]<br>
	 * Prototype: VkStencilOpState  back
	 */ 
	 private static native long getBack0(Buffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->back);
	 */

	/**
	 * Native SET method for field minDepthBounds	[float]<br>
	 * Prototype: float  minDepthBounds
	 */ 
	 private static native void setMinDepthBounds0(Buffer ptr, float _minDepthBounds);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  vkObj->minDepthBounds = (float) (_minDepthBounds);
	  */

	/**
	 * Native GET method for field minDepthBounds	[float]<br>
	 * Prototype: float  minDepthBounds
	 */ 
	 private static native float getMinDepthBounds0(Buffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jfloat) (vkObj->minDepthBounds);
	 */

	/**
	 * Native SET method for field maxDepthBounds	[float]<br>
	 * Prototype: float  maxDepthBounds
	 */ 
	 private static native void setMaxDepthBounds0(Buffer ptr, float _maxDepthBounds);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  vkObj->maxDepthBounds = (float) (_maxDepthBounds);
	  */

	/**
	 * Native GET method for field maxDepthBounds	[float]<br>
	 * Prototype: float  maxDepthBounds
	 */ 
	 private static native float getMaxDepthBounds0(Buffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jfloat) (vkObj->maxDepthBounds);
	 */



} // end of class VkPipelineDepthStencilStateCreateInfo
