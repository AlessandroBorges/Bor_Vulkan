// class wrapping Vulkan's VkDescriptorSetLayoutCreateInfo struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkDescriptorSetLayoutCreateInfo 
 * @Author Alessandro Borges 
 */
public class VkDescriptorSetLayoutCreateInfo extends VkStruct {
	/** ID of this structure [72]  */
	 public static final int TAG = VKDESCRIPTORSETLAYOUTCREATEINFO_ID;

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
	 *  VkDescriptorSetLayoutCreateFlags 	flags 
	 */ 
	int 	flags;

	/**
	 *  uint32_t 	bindingCount 
	 */ 
	int 	bindingCount;

	/**
	 *  const VkDescriptorSetLayoutBinding* 	pBindings 
	 */ 
	const VkDescriptorSetLayoutBinding* 	pBindings;

	/**
	 * Ctor
	 */
	public VkDescriptorSetLayoutCreateInfo(){ 
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
	 * Prototype: VkDescriptorSetLayoutCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkDescriptorSetLayoutCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field bindingCount
	 * Prototype: uint32_t  bindingCount
	 */ 
	 public void bindingCount(int bindingCount){
		 this.bindingCount = bindingCount;
		bindingCount0(super.ptr, bindingCount);
	 }

	/**
	 * get method for field bindingCount
	 * Prototype: uint32_t  bindingCount
	 */ 
	 public int bindingCount(){
		 // return  this.bindingCount;
		 return bindingCount0(super.ptr);
	 }

	/**
	 * Set method for field pBindings
	 * Prototype: const VkDescriptorSetLayoutBinding*  pBindings
	 */ 
	 public void pBindings(const VkDescriptorSetLayoutBinding* pBindings){
		 this.pBindings = pBindings;
		pBindings0(super.ptr, pBindings);
	 }

	/**
	 * get method for field pBindings
	 * Prototype: const VkDescriptorSetLayoutBinding*  pBindings
	 */ 
	 public const VkDescriptorSetLayoutBinding* pBindings(){
		 // return  this.pBindings;
		 return pBindings0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkDescriptorSetLayoutCreateInfo _obj = (VkDescriptorSetLayoutCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkDescriptorSetLayoutCreateInfo _obj = (VkDescriptorSetLayoutCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkDescriptorSetLayoutCreateInfo _obj = (VkDescriptorSetLayoutCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkDescriptorSetLayoutCreateInfo _obj = (VkDescriptorSetLayoutCreateInfo)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkDescriptorSetLayoutCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkDescriptorSetLayoutCreateInfo _obj = (VkDescriptorSetLayoutCreateInfo)(*ptr);
		  _obj.flags = (VkDescriptorSetLayoutCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkDescriptorSetLayoutCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkDescriptorSetLayoutCreateInfo _obj = (VkDescriptorSetLayoutCreateInfo)(ptr);
		  return (jint) (_obj.VkDescriptorSetLayoutCreateFlags);
	 */

	/**
	 * native Set method for field bindingCount
	 * Prototype: uint32_t  bindingCount
	 */ 
	 private static native void bindingCount0(ByteBuffer ptr, int _bindingCount);/*
		  VkDescriptorSetLayoutCreateInfo _obj = (VkDescriptorSetLayoutCreateInfo)(*ptr);
		  _obj.bindingCount = (uint32_t) (_bindingCount);
	  */

	/**
	 * get method for field bindingCount
	 * Prototype: uint32_t  bindingCount
	 */ 
	 private static native int bindingCount0(ByteBuffer ptr);/*
		  VkDescriptorSetLayoutCreateInfo _obj = (VkDescriptorSetLayoutCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pBindings
	 * Prototype: const VkDescriptorSetLayoutBinding*  pBindings
	 */ 
	 private static native void pBindings0(ByteBuffer ptr, const VkDescriptorSetLayoutBinding* _pBindings);/*
		  VkDescriptorSetLayoutCreateInfo _obj = (VkDescriptorSetLayoutCreateInfo)(*ptr);
		  _obj.pBindings = (const VkDescriptorSetLayoutBinding*) (_pBindings);
	  */

	/**
	 * get method for field pBindings
	 * Prototype: const VkDescriptorSetLayoutBinding*  pBindings
	 */ 
	 private static native const VkDescriptorSetLayoutBinding* pBindings0(ByteBuffer ptr);/*
		  VkDescriptorSetLayoutCreateInfo _obj = (VkDescriptorSetLayoutCreateInfo)(ptr);
		  return (const VkDescriptorSetLayoutBinding*) (_obj.const VkDescriptorSetLayoutBinding*);
	 */



} // end of class VkDescriptorSetLayoutCreateInfo
