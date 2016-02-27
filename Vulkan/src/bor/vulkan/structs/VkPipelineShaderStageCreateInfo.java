// class wrapping Vulkan's VkPipelineShaderStageCreateInfo struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkPipelineShaderStageCreateInfo 
 * @Author Alessandro Borges 
 */
public class VkPipelineShaderStageCreateInfo extends VkStruct {
	/** ID of this structure [48]  */
	 public static final int TAG = VKPIPELINESHADERSTAGECREATEINFO_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType 
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext 
	 */ 
	VkObject 	pNext;

	/**
	 *  VkPipelineShaderStageCreateFlags 	flags 
	 */ 
	int 	flags;

	/**
	 *  VkShaderStageFlagBits 	stage 
	 */ 
	VkShaderStageFlagBits 	stage;

	/**
	 *  VkShaderModule 	module 
	 */ 
	VkShaderModule 	module;

	/**
	 *  const char* 	pName 
	 */ 
	String 	pName;

	/**
	 *  const VkSpecializationInfo* 	pSpecializationInfo 
	 */ 
	const VkSpecializationInfo* 	pSpecializationInfo;

	/**
	 * Ctor
	 */
	public VkPipelineShaderStageCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG); 
	}


	 // /////////////////////
	 //  SETTERS & GETTERS //
	 // /////////////////////

	/**
	 * Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field flags
	 * Prototype: VkPipelineShaderStageCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkPipelineShaderStageCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field stage
	 * Prototype: VkShaderStageFlagBits  stage
	 */ 
	 public void stage(VkShaderStageFlagBits stage){
		 this.stage = stage;
		stage0(super.ptr, stage);
	 }

	/**
	 * get method for field stage
	 * Prototype: VkShaderStageFlagBits  stage
	 */ 
	 public VkShaderStageFlagBits stage(){
		 // return  this.stage;
		 return stage0(super.ptr);
	 }

	/**
	 * Set method for field module
	 * Prototype: VkShaderModule  module
	 */ 
	 public void module(VkShaderModule module){
		 this.module = module;
		module0(super.ptr, module);
	 }

	/**
	 * get method for field module
	 * Prototype: VkShaderModule  module
	 */ 
	 public VkShaderModule module(){
		 // return  this.module;
		 return module0(super.ptr);
	 }

	/**
	 * Set method for field pName
	 * Prototype: const char*  pName
	 */ 
	 public void pName(String pName){
		 this.pName = pName;
		pName0(super.ptr, pName);
	 }

	/**
	 * get method for field pName
	 * Prototype: const char*  pName
	 */ 
	 public String pName(){
		 // return  this.pName;
		 return pName0(super.ptr);
	 }

	/**
	 * Set method for field pSpecializationInfo
	 * Prototype: const VkSpecializationInfo*  pSpecializationInfo
	 */ 
	 public void pSpecializationInfo(const VkSpecializationInfo* pSpecializationInfo){
		 this.pSpecializationInfo = pSpecializationInfo;
		pSpecializationInfo0(super.ptr, pSpecializationInfo);
	 }

	/**
	 * get method for field pSpecializationInfo
	 * Prototype: const VkSpecializationInfo*  pSpecializationInfo
	 */ 
	 public const VkSpecializationInfo* pSpecializationInfo(){
		 // return  this.pSpecializationInfo;
		 return pSpecializationInfo0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkPipelineShaderStageCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(*ptr);
		  _obj.flags = (VkPipelineShaderStageCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkPipelineShaderStageCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(ptr);
		  return (jint) (_obj.VkPipelineShaderStageCreateFlags);
	 */

	/**
	 * native Set method for field stage
	 * Prototype: VkShaderStageFlagBits  stage
	 */ 
	 private static native void stage0(ByteBuffer ptr, VkShaderStageFlagBits _stage);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(*ptr);
		  _obj.stage = (VkShaderStageFlagBits) (_stage);
	  */

	/**
	 * get method for field stage
	 * Prototype: VkShaderStageFlagBits  stage
	 */ 
	 private static native VkShaderStageFlagBits stage0(ByteBuffer ptr);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(ptr);
		  return (VkShaderStageFlagBits) (_obj.VkShaderStageFlagBits);
	 */

	/**
	 * native Set method for field module
	 * Prototype: VkShaderModule  module
	 */ 
	 private static native void module0(ByteBuffer ptr, VkShaderModule _module);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(*ptr);
		  _obj.module = (VkShaderModule) (_module);
	  */

	/**
	 * get method for field module
	 * Prototype: VkShaderModule  module
	 */ 
	 private static native VkShaderModule module0(ByteBuffer ptr);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(ptr);
		  return (VkShaderModule) (_obj.VkShaderModule);
	 */

	/**
	 * native Set method for field pName
	 * Prototype: const char*  pName
	 */ 
	 private static native void pName0(ByteBuffer ptr, String _pName);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(*ptr);
		  _obj.pName = (const char*) (_pName);
	  */

	/**
	 * get method for field pName
	 * Prototype: const char*  pName
	 */ 
	 private static native String pName0(ByteBuffer ptr);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(ptr);
		  return (jstring)(env->NewStringUTF(_obj.const char*);	 */

	/**
	 * native Set method for field pSpecializationInfo
	 * Prototype: const VkSpecializationInfo*  pSpecializationInfo
	 */ 
	 private static native void pSpecializationInfo0(ByteBuffer ptr, const VkSpecializationInfo* _pSpecializationInfo);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(*ptr);
		  _obj.pSpecializationInfo = (const VkSpecializationInfo*) (_pSpecializationInfo);
	  */

	/**
	 * get method for field pSpecializationInfo
	 * Prototype: const VkSpecializationInfo*  pSpecializationInfo
	 */ 
	 private static native const VkSpecializationInfo* pSpecializationInfo0(ByteBuffer ptr);/*
		  VkPipelineShaderStageCreateInfo _obj = (VkPipelineShaderStageCreateInfo)(ptr);
		  return (const VkSpecializationInfo*) (_obj.const VkSpecializationInfo*);
	 */



} // end of class VkPipelineShaderStageCreateInfo
