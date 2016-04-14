/**
 * Class wrapping Vulkan's VkPipelineShaderStageCreateInfo struct.
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
 *  This class is a Java front end for struct VkPipelineShaderStageCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPipelineShaderStageCreateInfo {
 *     VkStructureType                     sType;
 *     const void*                         pNext;
 *     VkPipelineShaderStageCreateFlags    flags;
 *     VkShaderStageFlagBits               stage;
 *     VkShaderModule                      module;
 *     const char*                         pName;
 *     const VkSpecializationInfo*         pSpecializationInfo;
 * } VkPipelineShaderStageCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkPipelineShaderStageCreateInfo extends VkStruct {
	/** TAG of this structure [48]  */
	 private static final String TAG = "VkPipelineShaderStageCreateInfo";

	/** ID of this structure [48]  */
	 public static final int TAG_ID = VKPIPELINESHADERSTAGECREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkPipelineShaderStageCreateInfo> p;

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
	 *  VkPipelineShaderStageCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  VkShaderStageFlagBits 	stage	[vkenum]
	 */ 
	 VkShaderStageFlagBits 	stage;

	/**
	 *  VkShaderModule 	module	[vkhandle]
	 */ 
	 VkShaderModule 	module;

	/**
	 *  const char* 	pName	[string]
	 */ 
	 String 	pName;

	/**
	 *  const VkSpecializationInfo* 	pSpecializationInfo	[vkstruct]
	 */ 
	  VkSpecializationInfo  	pSpecializationInfo;

	/**
	 * Ctor
	 */
	public VkPipelineShaderStageCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineShaderStageCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkPipelineShaderStageCreateInfo(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPipelineShaderStageCreateInfo(long address){ 
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
	 public static P<VkPipelineShaderStageCreateInfo> createNullPointer(){
	        P<VkPipelineShaderStageCreateInfo> p = new  P<VkPipelineShaderStageCreateInfo>(new VkPipelineShaderStageCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkPipelineShaderStageCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkPipelineShaderStageCreateInfo> (this);
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
	 * Prototype: VkPipelineShaderStageCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkPipelineShaderStageCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field stage	[vkenum]<br>
	 * Prototype: VkShaderStageFlagBits  stage
	 */ 
	 public void stage(VkShaderStageFlagBits stage){
		 this.stage = stage;
		 int enumVal = stage.getValue();
		 setStage0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field stage	[vkenum]<br>
	 * Prototype: VkShaderStageFlagBits  stage
	 */ 
	 public VkShaderStageFlagBits stage(){
		 int nativeVal = getStage0(super.ptr);
		 this.stage = VkShaderStageFlagBits.fromValue(nativeVal); 
		 return this.stage;
	 }

	/**
	 * Set method for field module	[vkhandle]<br>
	 * Prototype: VkShaderModule  module
	 */ 
	 public void module(VkShaderModule module){
		 this.module = module;
		 ByteBuffer buff = (module==null) ? null : module.getPointer();
		 setModule0(this.ptr, buff);
	 }

	/**
	 * Get method for field module	[vkhandle]<br>
	 * Prototype: VkShaderModule  module
	 */ 
	 public VkShaderModule module(){

		 long handle = getModule0(super.ptr);
		 if(handle == 0){
		    this.module = null;
		    return null;
		  }  

		 if(this.module == null){
		    this.module = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.module).setPointer(handle);
		  }
		 return this.module;
	 }

	/**
	 * Set method for field pName	[string]<br>
	 * Prototype: const char*  pName
	 */ 
	 public void pName(String pName){
		 this.pName = pName;
		 setPName0(this.ptr,  pName);
	 }

	/**
	 * Get method for field pName	[string]<br>
	 * Prototype: const char*  pName
	 */ 
	 public String pName(){
		 String var = getPName0(super.ptr);
		 this.pName = var;
		 return this.pName;
	 }

	/**
	 * Set method for field pSpecializationInfo	[vkstruct]<br>
	 * Prototype: const VkSpecializationInfo*  pSpecializationInfo
	 */ 
	 public void pSpecializationInfo( VkSpecializationInfo  pSpecializationInfo){
		 this.pSpecializationInfo = pSpecializationInfo;
		 ByteBuffer buff = (pSpecializationInfo==null) ? null : pSpecializationInfo.getPointer();
		 setPSpecializationInfo0(this.ptr, buff);
	 }

	/**
	 * Get method for field pSpecializationInfo	[vkstruct]<br>
	 * Prototype: const VkSpecializationInfo*  pSpecializationInfo
	 */ 
	 public  VkSpecializationInfo  pSpecializationInfo(){
		 long pointer = getPSpecializationInfo0(super.ptr);
		 if(pointer == 0){
		    this.pSpecializationInfo = null;
		    return null;
		  } 

		 if(this.pSpecializationInfo == null){
		    this.pSpecializationInfo = new  VkSpecializationInfo (pointer);
		 }else{
		    this.pSpecializationInfo.setPointer(pointer);
		  }
		 return this.pSpecializationInfo;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkPipelineShaderStageCreateInfo vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkPipelineShaderStageCreateInfo vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineShaderStageCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  vkObj->flags = (VkPipelineShaderStageCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineShaderStageCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkPipelineShaderStageCreateInfo vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field stage	[vkenum]<br>
	 * Prototype: VkShaderStageFlagBits  stage
	 */ 
	 private static native void setStage0(Buffer ptr, int  _stage);/*
		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  vkObj->stage = (VkShaderStageFlagBits) (_stage);
	  */

	/**
	 * native GET method for field stage	[vkenum]<br>
	 * Prototype: VkShaderStageFlagBits  stage
	 */ 
	 private static native int  getStage0(Buffer ptr);/*
		  VkPipelineShaderStageCreateInfo vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  return (VkShaderStageFlagBits) (vkObj->stage);
	 */

	/**
	 * native SET method for field module	[vkhandle]<br>
	 * Prototype: VkShaderModule  module
	 */ 
	 private static native void setModule0(Buffer ptr, java.nio.ByteBuffer  _module);/*
		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  vkObj->module = (VkShaderModule) (_module);
	  */

	/**
	 * native GET method for field module	[vkhandle]<br>
	 * Prototype: VkShaderModule  module
	 */ 
	 private static native long getModule0(Buffer ptr);/*
		  VkPipelineShaderStageCreateInfo vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->module);	 */

	/**
	 * native SET method for field pName	[string]<br>
	 * Prototype: const char*  pName
	 */ 
	 private static native void setPName0(Buffer ptr, String _pName);/*
		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  vkObj->pName = (const char*) (_pName);
	  */

	/**
	 * native GET method for field pName	[string]<br>
	 * Prototype: const char*  pName
	 */ 
	 private static native String getPName0(Buffer ptr);/*
		  VkPipelineShaderStageCreateInfo vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->pName);	 */

	/**
	 * native SET method for field pSpecializationInfo	[vkstruct]<br>
	 * Prototype: const VkSpecializationInfo*  pSpecializationInfo
	 */ 
	 private static native void setPSpecializationInfo0(Buffer ptr, java.nio.ByteBuffer  _pSpecializationInfo);/*
		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  vkObj->pSpecializationInfo = (const VkSpecializationInfo*) (_pSpecializationInfo);
	  */

	/**
	 * native GET method for field pSpecializationInfo	[vkstruct]<br>
	 * Prototype: const VkSpecializationInfo*  pSpecializationInfo
	 */ 
	 private static native long getPSpecializationInfo0(Buffer ptr);/*
		  VkPipelineShaderStageCreateInfo vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pSpecializationInfo);	 */



} // end of class VkPipelineShaderStageCreateInfo
