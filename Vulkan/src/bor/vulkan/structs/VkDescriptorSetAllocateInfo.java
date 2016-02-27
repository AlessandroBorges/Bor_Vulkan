// class wrapping Vulkan's VkDescriptorSetAllocateInfo struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkDescriptorSetAllocateInfo 
 * @Author Alessandro Borges 
 */
public class VkDescriptorSetAllocateInfo extends VkStruct {
	/** ID of this structure [75]  */
	 public static final int TAG = VKDESCRIPTORSETALLOCATEINFO_ID;

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
	 *  VkDescriptorPool 	descriptorPool 
	 */ 
	VkDescriptorPool 	descriptorPool;

	/**
	 *  uint32_t 	descriptorSetCount 
	 */ 
	int 	descriptorSetCount;

	/**
	 *  const VkDescriptorSetLayout* 	pSetLayouts 
	 */ 
	const VkDescriptorSetLayout* 	pSetLayouts;

	/**
	 * Ctor
	 */
	public VkDescriptorSetAllocateInfo(){ 
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
	 * Set method for field descriptorPool
	 * Prototype: VkDescriptorPool  descriptorPool
	 */ 
	 public void descriptorPool(VkDescriptorPool descriptorPool){
		 this.descriptorPool = descriptorPool;
		descriptorPool0(super.ptr, descriptorPool);
	 }

	/**
	 * get method for field descriptorPool
	 * Prototype: VkDescriptorPool  descriptorPool
	 */ 
	 public VkDescriptorPool descriptorPool(){
		 // return  this.descriptorPool;
		 return descriptorPool0(super.ptr);
	 }

	/**
	 * Set method for field descriptorSetCount
	 * Prototype: uint32_t  descriptorSetCount
	 */ 
	 public void descriptorSetCount(int descriptorSetCount){
		 this.descriptorSetCount = descriptorSetCount;
		descriptorSetCount0(super.ptr, descriptorSetCount);
	 }

	/**
	 * get method for field descriptorSetCount
	 * Prototype: uint32_t  descriptorSetCount
	 */ 
	 public int descriptorSetCount(){
		 // return  this.descriptorSetCount;
		 return descriptorSetCount0(super.ptr);
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


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkDescriptorSetAllocateInfo _obj = (VkDescriptorSetAllocateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkDescriptorSetAllocateInfo _obj = (VkDescriptorSetAllocateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkDescriptorSetAllocateInfo _obj = (VkDescriptorSetAllocateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkDescriptorSetAllocateInfo _obj = (VkDescriptorSetAllocateInfo)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field descriptorPool
	 * Prototype: VkDescriptorPool  descriptorPool
	 */ 
	 private static native void descriptorPool0(ByteBuffer ptr, VkDescriptorPool _descriptorPool);/*
		  VkDescriptorSetAllocateInfo _obj = (VkDescriptorSetAllocateInfo)(*ptr);
		  _obj.descriptorPool = (VkDescriptorPool) (_descriptorPool);
	  */

	/**
	 * get method for field descriptorPool
	 * Prototype: VkDescriptorPool  descriptorPool
	 */ 
	 private static native VkDescriptorPool descriptorPool0(ByteBuffer ptr);/*
		  VkDescriptorSetAllocateInfo _obj = (VkDescriptorSetAllocateInfo)(ptr);
		  return (VkDescriptorPool) (_obj.VkDescriptorPool);
	 */

	/**
	 * native Set method for field descriptorSetCount
	 * Prototype: uint32_t  descriptorSetCount
	 */ 
	 private static native void descriptorSetCount0(ByteBuffer ptr, int _descriptorSetCount);/*
		  VkDescriptorSetAllocateInfo _obj = (VkDescriptorSetAllocateInfo)(*ptr);
		  _obj.descriptorSetCount = (uint32_t) (_descriptorSetCount);
	  */

	/**
	 * get method for field descriptorSetCount
	 * Prototype: uint32_t  descriptorSetCount
	 */ 
	 private static native int descriptorSetCount0(ByteBuffer ptr);/*
		  VkDescriptorSetAllocateInfo _obj = (VkDescriptorSetAllocateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pSetLayouts
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 private static native void pSetLayouts0(ByteBuffer ptr, const VkDescriptorSetLayout* _pSetLayouts);/*
		  VkDescriptorSetAllocateInfo _obj = (VkDescriptorSetAllocateInfo)(*ptr);
		  _obj.pSetLayouts = (const VkDescriptorSetLayout*) (_pSetLayouts);
	  */

	/**
	 * get method for field pSetLayouts
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 private static native const VkDescriptorSetLayout* pSetLayouts0(ByteBuffer ptr);/*
		  VkDescriptorSetAllocateInfo _obj = (VkDescriptorSetAllocateInfo)(ptr);
		  return (const VkDescriptorSetLayout*) (_obj.const VkDescriptorSetLayout*);
	 */



} // end of class VkDescriptorSetAllocateInfo
