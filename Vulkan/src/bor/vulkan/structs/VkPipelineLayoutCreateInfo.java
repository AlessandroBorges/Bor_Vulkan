// class wrapping Vulkan's VkPipelineLayoutCreateInfo struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkPipelineLayoutCreateInfo 
 * @Author Alessandro Borges 
 */
public class VkPipelineLayoutCreateInfo extends VkStruct {
	/** ID of this structure [69]  */
	 public static final int TAG = VKPIPELINELAYOUTCREATEINFO_ID;

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
	 *  VkPipelineLayoutCreateFlags 	flags 
	 */ 
	int 	flags;

	/**
	 *  uint32_t 	setLayoutCount 
	 */ 
	int 	setLayoutCount;

	/**
	 *  const VkDescriptorSetLayout* 	pSetLayouts 
	 */ 
	const VkDescriptorSetLayout* 	pSetLayouts;

	/**
	 *  uint32_t 	pushConstantRangeCount 
	 */ 
	int 	pushConstantRangeCount;

	/**
	 *  const VkPushConstantRange* 	pPushConstantRanges 
	 */ 
	const VkPushConstantRange* 	pPushConstantRanges;

	/**
	 * Ctor
	 */
	public VkPipelineLayoutCreateInfo(){ 
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
	 * Prototype: VkPipelineLayoutCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkPipelineLayoutCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field setLayoutCount
	 * Prototype: uint32_t  setLayoutCount
	 */ 
	 public void setLayoutCount(int setLayoutCount){
		 this.setLayoutCount = setLayoutCount;
		setLayoutCount0(super.ptr, setLayoutCount);
	 }

	/**
	 * get method for field setLayoutCount
	 * Prototype: uint32_t  setLayoutCount
	 */ 
	 public int setLayoutCount(){
		 // return  this.setLayoutCount;
		 return setLayoutCount0(super.ptr);
	 }

	/**
	 * Set method for field pSetLayouts
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 public void pSetLayouts(const VkDescriptorSetLayout* pSetLayouts){
		 this.pSetLayouts = pSetLayouts;
		pSetLayouts0(super.ptr, pSetLayouts);
	 }

	/**
	 * get method for field pSetLayouts
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 public const VkDescriptorSetLayout* pSetLayouts(){
		 // return  this.pSetLayouts;
		 return pSetLayouts0(super.ptr);
	 }

	/**
	 * Set method for field pushConstantRangeCount
	 * Prototype: uint32_t  pushConstantRangeCount
	 */ 
	 public void pushConstantRangeCount(int pushConstantRangeCount){
		 this.pushConstantRangeCount = pushConstantRangeCount;
		pushConstantRangeCount0(super.ptr, pushConstantRangeCount);
	 }

	/**
	 * get method for field pushConstantRangeCount
	 * Prototype: uint32_t  pushConstantRangeCount
	 */ 
	 public int pushConstantRangeCount(){
		 // return  this.pushConstantRangeCount;
		 return pushConstantRangeCount0(super.ptr);
	 }

	/**
	 * Set method for field pPushConstantRanges
	 * Prototype: const VkPushConstantRange*  pPushConstantRanges
	 */ 
	 public void pPushConstantRanges(const VkPushConstantRange* pPushConstantRanges){
		 this.pPushConstantRanges = pPushConstantRanges;
		pPushConstantRanges0(super.ptr, pPushConstantRanges);
	 }

	/**
	 * get method for field pPushConstantRanges
	 * Prototype: const VkPushConstantRange*  pPushConstantRanges
	 */ 
	 public const VkPushConstantRange* pPushConstantRanges(){
		 // return  this.pPushConstantRanges;
		 return pPushConstantRanges0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkPipelineLayoutCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(*ptr);
		  _obj.flags = (VkPipelineLayoutCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkPipelineLayoutCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(ptr);
		  return (jint) (_obj.VkPipelineLayoutCreateFlags);
	 */

	/**
	 * native Set method for field setLayoutCount
	 * Prototype: uint32_t  setLayoutCount
	 */ 
	 private static native void setLayoutCount0(ByteBuffer ptr, int _setLayoutCount);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(*ptr);
		  _obj.setLayoutCount = (uint32_t) (_setLayoutCount);
	  */

	/**
	 * get method for field setLayoutCount
	 * Prototype: uint32_t  setLayoutCount
	 */ 
	 private static native int setLayoutCount0(ByteBuffer ptr);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pSetLayouts
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 private static native void pSetLayouts0(ByteBuffer ptr, const VkDescriptorSetLayout* _pSetLayouts);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(*ptr);
		  _obj.pSetLayouts = (const VkDescriptorSetLayout*) (_pSetLayouts);
	  */

	/**
	 * get method for field pSetLayouts
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 private static native const VkDescriptorSetLayout* pSetLayouts0(ByteBuffer ptr);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(ptr);
		  return (const VkDescriptorSetLayout*) (_obj.const VkDescriptorSetLayout*);
	 */

	/**
	 * native Set method for field pushConstantRangeCount
	 * Prototype: uint32_t  pushConstantRangeCount
	 */ 
	 private static native void pushConstantRangeCount0(ByteBuffer ptr, int _pushConstantRangeCount);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(*ptr);
		  _obj.pushConstantRangeCount = (uint32_t) (_pushConstantRangeCount);
	  */

	/**
	 * get method for field pushConstantRangeCount
	 * Prototype: uint32_t  pushConstantRangeCount
	 */ 
	 private static native int pushConstantRangeCount0(ByteBuffer ptr);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pPushConstantRanges
	 * Prototype: const VkPushConstantRange*  pPushConstantRanges
	 */ 
	 private static native void pPushConstantRanges0(ByteBuffer ptr, const VkPushConstantRange* _pPushConstantRanges);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(*ptr);
		  _obj.pPushConstantRanges = (const VkPushConstantRange*) (_pPushConstantRanges);
	  */

	/**
	 * get method for field pPushConstantRanges
	 * Prototype: const VkPushConstantRange*  pPushConstantRanges
	 */ 
	 private static native const VkPushConstantRange* pPushConstantRanges0(ByteBuffer ptr);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(ptr);
		  return (const VkPushConstantRange*) (_obj.const VkPushConstantRange*);
	 */



} // end of class VkPipelineLayoutCreateInfo
