/**
 * Class wrapping Vulkan's VkComputePipelineCreateInfo struct.
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
 *  This class is a Java front end for struct VkComputePipelineCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkComputePipelineCreateInfo {
 *     VkStructureType                    sType;
 *     const void*                        pNext;
 *     VkPipelineCreateFlags              flags;
 *     VkPipelineShaderStageCreateInfo    stage;
 *     VkPipelineLayout                   layout;
 *     VkPipeline                         basePipelineHandle;
 *     int32_t                            basePipelineIndex;
 * } VkComputePipelineCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkComputePipelineCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [67]  */
	 private static final String TAG = "VkComputePipelineCreateInfo";

	/** ID of this structure [67]  */
	 public static final int TAG_ID = VKCOMPUTEPIPELINECREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkComputePipelineCreateInfo> p;

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
	 *  VkPipelineCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  VkPipelineShaderStageCreateInfo 	stage	[vkstruct]
	 */ 
	 VkPipelineShaderStageCreateInfo 	stage;

	/**
	 *  VkPipelineLayout 	layout	[vkhandle]
	 */ 
	 VkPipelineLayout 	layout;

	/**
	 *  VkPipeline 	basePipelineHandle	[vkhandle]
	 */ 
	 VkPipeline 	basePipelineHandle;

	/**
	 *  int32_t 	basePipelineIndex	[int]
	 */ 
	 int 	basePipelineIndex;

	/**
	 * Ctor
	 */
	public VkComputePipelineCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkComputePipelineCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkComputePipelineCreateInfo(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkComputePipelineCreateInfo(long address){ 
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
	 public static P<VkComputePipelineCreateInfo> createNullPointer(){
	        P<VkComputePipelineCreateInfo> p = new  P<VkComputePipelineCreateInfo>(new VkComputePipelineCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkComputePipelineCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkComputePipelineCreateInfo> (this);
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
	 * Prototype: VkPipelineCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkPipelineCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field stage	[vkstruct]<br>
	 * Prototype: VkPipelineShaderStageCreateInfo  stage
	 */ 
	 public void stage(VkPipelineShaderStageCreateInfo stage){
		 this.stage = stage;
		 ByteBuffer buff = (stage==null) ? null : stage.getPointer();
		 setStage0(this.ptr, buff);
	 }

	/**
	 * Get method for field stage	[vkstruct]<br>
	 * Prototype: VkPipelineShaderStageCreateInfo  stage
	 */ 
	 public VkPipelineShaderStageCreateInfo stage(){
		 long pointer = getStage0(super.ptr);
		 if(pointer == 0){
		    this.stage = null;
		    return null;
		  } 

		 if(this.stage == null){
		    this.stage = new VkPipelineShaderStageCreateInfo(pointer);
		 }else{
		    this.stage.setPointer(pointer);
		  }
		 return this.stage;
	 }

	/**
	 * Set method for field layout	[vkhandle]<br>
	 * Prototype: VkPipelineLayout  layout
	 */ 
	 public void layout(VkPipelineLayout layout){
		 this.layout = layout;
		 ByteBuffer buff = (layout==null) ? null : layout.getPointer();
		 setLayout0(this.ptr, buff);
	 }

	/**
	 * Get method for field layout	[vkhandle]<br>
	 * Prototype: VkPipelineLayout  layout
	 */ 
	 public VkPipelineLayout layout(){

		 long handle = getLayout0(super.ptr);
		 if(handle == 0){
		    this.layout = null;
		    return null;
		  }  

		 if(this.layout == null){
		    this.layout = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.layout).setPointer(handle);
		  }
		 return this.layout;
	 }

	/**
	 * Set method for field basePipelineHandle	[vkhandle]<br>
	 * Prototype: VkPipeline  basePipelineHandle
	 */ 
	 public void basePipelineHandle(VkPipeline basePipelineHandle){
		 this.basePipelineHandle = basePipelineHandle;
		 ByteBuffer buff = (basePipelineHandle==null) ? null : basePipelineHandle.getPointer();
		 setBasePipelineHandle0(this.ptr, buff);
	 }

	/**
	 * Get method for field basePipelineHandle	[vkhandle]<br>
	 * Prototype: VkPipeline  basePipelineHandle
	 */ 
	 public VkPipeline basePipelineHandle(){

		 long handle = getBasePipelineHandle0(super.ptr);
		 if(handle == 0){
		    this.basePipelineHandle = null;
		    return null;
		  }  

		 if(this.basePipelineHandle == null){
		    this.basePipelineHandle = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.basePipelineHandle).setPointer(handle);
		  }
		 return this.basePipelineHandle;
	 }

	/**
	 * Set method for field basePipelineIndex	[int]<br>
	 * Prototype: int32_t  basePipelineIndex
	 */ 
	 public void basePipelineIndex(int basePipelineIndex){
		 this.basePipelineIndex = basePipelineIndex;
		 setBasePipelineIndex0(this.ptr,  basePipelineIndex);
	 }

	/**
	 * Get method for field basePipelineIndex	[int]<br>
	 * Prototype: int32_t  basePipelineIndex
	 */ 
	 public int basePipelineIndex(){
		 int var = getBasePipelineIndex0(super.ptr);
		 this.basePipelineIndex = var;
		 return this.basePipelineIndex;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  vkObj->flags = (VkPipelineCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field stage	[vkstruct]<br>
	 * Prototype: VkPipelineShaderStageCreateInfo  stage
	 */ 
	 private static native void setStage0(Buffer ptr, java.nio.ByteBuffer  _stage);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  vkObj->stage = (VkPipelineShaderStageCreateInfo) (_stage);
	  */

	/**
	 * native GET method for field stage	[vkstruct]<br>
	 * Prototype: VkPipelineShaderStageCreateInfo  stage
	 */ 
	 private static native long getStage0(Buffer ptr);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->stage);	 */

	/**
	 * native SET method for field layout	[vkhandle]<br>
	 * Prototype: VkPipelineLayout  layout
	 */ 
	 private static native void setLayout0(Buffer ptr, java.nio.ByteBuffer  _layout);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  vkObj->layout = (VkPipelineLayout) (_layout);
	  */

	/**
	 * native GET method for field layout	[vkhandle]<br>
	 * Prototype: VkPipelineLayout  layout
	 */ 
	 private static native long getLayout0(Buffer ptr);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->layout);	 */

	/**
	 * native SET method for field basePipelineHandle	[vkhandle]<br>
	 * Prototype: VkPipeline  basePipelineHandle
	 */ 
	 private static native void setBasePipelineHandle0(Buffer ptr, java.nio.ByteBuffer  _basePipelineHandle);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  vkObj->basePipelineHandle = (VkPipeline) (_basePipelineHandle);
	  */

	/**
	 * native GET method for field basePipelineHandle	[vkhandle]<br>
	 * Prototype: VkPipeline  basePipelineHandle
	 */ 
	 private static native long getBasePipelineHandle0(Buffer ptr);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->basePipelineHandle);	 */

	/**
	 * native SET method for field basePipelineIndex	[int]<br>
	 * Prototype: int32_t  basePipelineIndex
	 */ 
	 private static native void setBasePipelineIndex0(Buffer ptr, int _basePipelineIndex);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  vkObj->basePipelineIndex = (int32_t) (_basePipelineIndex);
	  */

	/**
	 * native GET method for field basePipelineIndex	[int]<br>
	 * Prototype: int32_t  basePipelineIndex
	 */ 
	 private static native int getBasePipelineIndex0(Buffer ptr);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  return (jint) (vkObj->basePipelineIndex);
	 */



} // end of class VkComputePipelineCreateInfo
