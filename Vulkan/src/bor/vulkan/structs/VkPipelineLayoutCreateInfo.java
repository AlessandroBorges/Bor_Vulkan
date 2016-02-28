/**
 * Class wrapping Vulkan's VkPipelineLayoutCreateInfo struct.
 * 
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
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkPipelineLayoutCreateInfo 
 *  <h3>ProtoType:</h3>
 * <pre>
 * typedef struct VkPipelineLayoutCreateInfo {
 *     VkStructureType                 sType;
 *     const void*                     pNext;
 *     VkPipelineLayoutCreateFlags     flags;
 *     uint32_t                        setLayoutCount;
 *     const VkDescriptorSetLayout*    pSetLayouts;
 *     uint32_t                        pushConstantRangeCount;
 *     const VkPushConstantRange*      pPushConstantRanges;
 * } VkPipelineLayoutCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version 0.8.01
 */
public class VkPipelineLayoutCreateInfo extends VkStruct {
	/** TAG of this structure [193]  */
	 private static final String TAG = "VkPipelineLayoutCreateInfo";

	/** ID of this structure [193]  */
	 public static final int TAG_ID = VKPIPELINELAYOUTCREATEINFO_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType 
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext 
	 */ 
	P<VkObject> 	pNext;

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
	P<VkDescriptorSetLayout>  	pSetLayouts;

	/**
	 *  uint32_t 	pushConstantRangeCount 
	 */ 
	int 	pushConstantRangeCount;

	/**
	 *  const VkPushConstantRange* 	pPushConstantRanges 
	 */ 
	P<VkPushConstantRange>  	pPushConstantRanges;

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
		 return sizeOf(TAG_ID); 
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
	 public void pNext(P<VkObject> pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public P<VkObject> pNext(){
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
	 public void pSetLayouts(P<VkDescriptorSetLayout>  pSetLayouts){
		 this.pSetLayouts = pSetLayouts;
		pSetLayouts0(super.ptr, pSetLayouts);
	 }

	/**
	 * get method for field pSetLayouts
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 public P<VkDescriptorSetLayout>  pSetLayouts(){
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
	 public void pPushConstantRanges(P<VkPushConstantRange>  pPushConstantRanges){
		 this.pPushConstantRanges = pPushConstantRanges;
		pPushConstantRanges0(super.ptr, pPushConstantRanges);
	 }

	/**
	 * get method for field pPushConstantRanges
	 * Prototype: const VkPushConstantRange*  pPushConstantRanges
	 */ 
	 public P<VkPushConstantRange>  pPushConstantRanges(){
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
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
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
	 private static native void pSetLayouts0(ByteBuffer ptr, P<VkDescriptorSetLayout>  _pSetLayouts);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(*ptr);
		  _obj.pSetLayouts = (const VkDescriptorSetLayout*) (_pSetLayouts);
	  */

	/**
	 * get method for field pSetLayouts
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 private static native P<VkDescriptorSetLayout>  pSetLayouts0(ByteBuffer ptr);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(ptr);
		  return (P<VkDescriptorSetLayout> ) (_obj.const VkDescriptorSetLayout*);
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
	 private static native void pPushConstantRanges0(ByteBuffer ptr, P<VkPushConstantRange>  _pPushConstantRanges);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(*ptr);
		  _obj.pPushConstantRanges = (const VkPushConstantRange*) (_pPushConstantRanges);
	  */

	/**
	 * get method for field pPushConstantRanges
	 * Prototype: const VkPushConstantRange*  pPushConstantRanges
	 */ 
	 private static native P<VkPushConstantRange>  pPushConstantRanges0(ByteBuffer ptr);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(ptr);
		  return (P<VkPushConstantRange> ) (_obj.const VkPushConstantRange*);
	 */



} // end of class VkPipelineLayoutCreateInfo
