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
	 *  const void* 	pNext	[p]
	 */ 
	 P<VkObject> 	pNext;

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
	 *  const VkSpecializationInfo* 	pSpecializationInfo	[p]
	 */ 
	 P<VkSpecializationInfo>  	pSpecializationInfo;

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
	 public VkPipelineShaderStageCreateInfo(long address, int memSize){ 
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
	 * Prototype: VkPipelineShaderStageCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkPipelineShaderStageCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field stage	[vkenum]<br>
	 * Prototype: VkShaderStageFlagBits  stage
	 */ 
	 public void stage(VkShaderStageFlagBits stage){
		 this.stage = stage;
		stage0(super.ptr, stage);
	 }

	/**
	 * get method for field stage	[vkenum]<br>
	 * Prototype: VkShaderStageFlagBits  stage
	 */ 
	 public VkShaderStageFlagBits stage(){
		 // return  this.stage;
		 return stage0(super.ptr);
	 }

	/**
	 * Set method for field module	[vkhandle]<br>
	 * Prototype: VkShaderModule  module
	 */ 
	 public void module(VkShaderModule module){
		 this.module = module;
		module0(super.ptr, module);
	 }

	/**
	 * get method for field module	[vkhandle]<br>
	 * Prototype: VkShaderModule  module
	 */ 
	 public VkShaderModule module(){
		 // return  this.module;
		 return module0(super.ptr);
	 }

	/**
	 * Set method for field pName	[string]<br>
	 * Prototype: const char*  pName
	 */ 
	 public void pName(String pName){
		 this.pName = pName;
		pName0(super.ptr, pName);
	 }

	/**
	 * get method for field pName	[string]<br>
	 * Prototype: const char*  pName
	 */ 
	 public String pName(){
		 // return  this.pName;
		 return pName0(super.ptr);
	 }

	/**
	 * Set method for field pSpecializationInfo	[p]<br>
	 * Prototype: const VkSpecializationInfo*  pSpecializationInfo
	 */ 
	 public void pSpecializationInfo(P<VkSpecializationInfo>  pSpecializationInfo){
		 this.pSpecializationInfo = pSpecializationInfo;
		pSpecializationInfo0(super.ptr, pSpecializationInfo);
	 }

	/**
	 * get method for field pSpecializationInfo	[p]<br>
	 * Prototype: const VkSpecializationInfo*  pSpecializationInfo
	 */ 
	 public P<VkSpecializationInfo>  pSpecializationInfo(){
		 // return  this.pSpecializationInfo;
		 return pSpecializationInfo0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineShaderStageCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(*ptr);
		  _obj.flags = (VkPipelineShaderStageCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineShaderStageCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(ptr);
		  return (jint) (_obj.VkPipelineShaderStageCreateFlags);
	 */

	/**
	 * native SET method for field stage	[vkenum]<br>
	 * Prototype: VkShaderStageFlagBits  stage
	 */ 
	 private static native void stage0(ByteBuffer ptr, VkShaderStageFlagBits _stage);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(*ptr);
		  _obj.stage = (VkShaderStageFlagBits) (_stage);
	  */

	/**
	 * native GET method for field stage	[vkenum]<br>
	 * Prototype: VkShaderStageFlagBits  stage
	 */ 
	 private static native VkShaderStageFlagBits stage0(ByteBuffer ptr);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(ptr);
		  return (VkShaderStageFlagBits) (_obj.VkShaderStageFlagBits);
	 */

	/**
	 * native SET method for field module	[vkhandle]<br>
	 * Prototype: VkShaderModule  module
	 */ 
	 private static native void module0(ByteBuffer ptr, VkShaderModule _module);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(*ptr);
		  _obj.module = (VkShaderModule) (_module);
	  */

	/**
	 * native GET method for field module	[vkhandle]<br>
	 * Prototype: VkShaderModule  module
	 */ 
	 private static native VkShaderModule module0(ByteBuffer ptr);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(ptr);
		  return (VkShaderModule) (_obj.VkShaderModule);
	 */

	/**
	 * native SET method for field pName	[string]<br>
	 * Prototype: const char*  pName
	 */ 
	 private static native void pName0(ByteBuffer ptr, String _pName);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(*ptr);
		  _obj.pName = (const char*) (_pName);
	  */

	/**
	 * native GET method for field pName	[string]<br>
	 * Prototype: const char*  pName
	 */ 
	 private static native String pName0(ByteBuffer ptr);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(ptr);
		  return (jstring)(env->NewStringUTF(_obj.const char*);	 */

	/**
	 * native SET method for field pSpecializationInfo	[p]<br>
	 * Prototype: const VkSpecializationInfo*  pSpecializationInfo
	 */ 
	 private static native void pSpecializationInfo0(ByteBuffer ptr, P<VkSpecializationInfo>  _pSpecializationInfo);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(*ptr);
		  _obj.pSpecializationInfo = (const VkSpecializationInfo*) (_pSpecializationInfo);
	  */

	/**
	 * native GET method for field pSpecializationInfo	[p]<br>
	 * Prototype: const VkSpecializationInfo*  pSpecializationInfo
	 */ 
	 private static native P<VkSpecializationInfo>  pSpecializationInfo0(ByteBuffer ptr);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(ptr);
		  return (P<VkSpecializationInfo> ) (_obj.const VkSpecializationInfo*);
	 */



} // end of class VkPipelineShaderStageCreateInfo
