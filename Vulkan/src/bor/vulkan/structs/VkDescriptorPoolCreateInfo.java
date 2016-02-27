// class wrapping Vulkan's VkDescriptorPoolCreateInfo struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkDescriptorPoolCreateInfo 
 * @Author Alessandro Borges 
 */
public class VkDescriptorPoolCreateInfo extends VkStruct {
	/** ID of this structure [74]  */
	 public static final int TAG = VKDESCRIPTORPOOLCREATEINFO_ID;

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
	 *  VkDescriptorPoolCreateFlags 	flags 
	 */ 
	int 	flags;

	/**
	 *  uint32_t 	maxSets 
	 */ 
	int 	maxSets;

	/**
	 *  uint32_t 	poolSizeCount 
	 */ 
	int 	poolSizeCount;

	/**
	 *  const VkDescriptorPoolSize* 	pPoolSizes 
	 */ 
	const VkDescriptorPoolSize* 	pPoolSizes;

	/**
	 * Ctor
	 */
	public VkDescriptorPoolCreateInfo(){ 
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
	 * Prototype: VkDescriptorPoolCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkDescriptorPoolCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field maxSets
	 * Prototype: uint32_t  maxSets
	 */ 
	 public void maxSets(int maxSets){
		 this.maxSets = maxSets;
		maxSets0(super.ptr, maxSets);
	 }

	/**
	 * get method for field maxSets
	 * Prototype: uint32_t  maxSets
	 */ 
	 public int maxSets(){
		 // return  this.maxSets;
		 return maxSets0(super.ptr);
	 }

	/**
	 * Set method for field poolSizeCount
	 * Prototype: uint32_t  poolSizeCount
	 */ 
	 public void poolSizeCount(int poolSizeCount){
		 this.poolSizeCount = poolSizeCount;
		poolSizeCount0(super.ptr, poolSizeCount);
	 }

	/**
	 * get method for field poolSizeCount
	 * Prototype: uint32_t  poolSizeCount
	 */ 
	 public int poolSizeCount(){
		 // return  this.poolSizeCount;
		 return poolSizeCount0(super.ptr);
	 }

	/**
	 * Set method for field pPoolSizes
	 * Prototype: const VkDescriptorPoolSize*  pPoolSizes
	 */ 
	 public void pPoolSizes(const VkDescriptorPoolSize* pPoolSizes){
		 this.pPoolSizes = pPoolSizes;
		pPoolSizes0(super.ptr, pPoolSizes);
	 }

	/**
	 * get method for field pPoolSizes
	 * Prototype: const VkDescriptorPoolSize*  pPoolSizes
	 */ 
	 public const VkDescriptorPoolSize* pPoolSizes(){
		 // return  this.pPoolSizes;
		 return pPoolSizes0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkDescriptorPoolCreateInfo _obj = (VkDescriptorPoolCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkDescriptorPoolCreateInfo _obj = (VkDescriptorPoolCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkDescriptorPoolCreateInfo _obj = (VkDescriptorPoolCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkDescriptorPoolCreateInfo _obj = (VkDescriptorPoolCreateInfo)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkDescriptorPoolCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkDescriptorPoolCreateInfo _obj = (VkDescriptorPoolCreateInfo)(*ptr);
		  _obj.flags = (VkDescriptorPoolCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkDescriptorPoolCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkDescriptorPoolCreateInfo _obj = (VkDescriptorPoolCreateInfo)(ptr);
		  return (jint) (_obj.VkDescriptorPoolCreateFlags);
	 */

	/**
	 * native Set method for field maxSets
	 * Prototype: uint32_t  maxSets
	 */ 
	 private static native void maxSets0(ByteBuffer ptr, int _maxSets);/*
		  VkDescriptorPoolCreateInfo _obj = (VkDescriptorPoolCreateInfo)(*ptr);
		  _obj.maxSets = (uint32_t) (_maxSets);
	  */

	/**
	 * get method for field maxSets
	 * Prototype: uint32_t  maxSets
	 */ 
	 private static native int maxSets0(ByteBuffer ptr);/*
		  VkDescriptorPoolCreateInfo _obj = (VkDescriptorPoolCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field poolSizeCount
	 * Prototype: uint32_t  poolSizeCount
	 */ 
	 private static native void poolSizeCount0(ByteBuffer ptr, int _poolSizeCount);/*
		  VkDescriptorPoolCreateInfo _obj = (VkDescriptorPoolCreateInfo)(*ptr);
		  _obj.poolSizeCount = (uint32_t) (_poolSizeCount);
	  */

	/**
	 * get method for field poolSizeCount
	 * Prototype: uint32_t  poolSizeCount
	 */ 
	 private static native int poolSizeCount0(ByteBuffer ptr);/*
		  VkDescriptorPoolCreateInfo _obj = (VkDescriptorPoolCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pPoolSizes
	 * Prototype: const VkDescriptorPoolSize*  pPoolSizes
	 */ 
	 private static native void pPoolSizes0(ByteBuffer ptr, const VkDescriptorPoolSize* _pPoolSizes);/*
		  VkDescriptorPoolCreateInfo _obj = (VkDescriptorPoolCreateInfo)(*ptr);
		  _obj.pPoolSizes = (const VkDescriptorPoolSize*) (_pPoolSizes);
	  */

	/**
	 * get method for field pPoolSizes
	 * Prototype: const VkDescriptorPoolSize*  pPoolSizes
	 */ 
	 private static native const VkDescriptorPoolSize* pPoolSizes0(ByteBuffer ptr);/*
		  VkDescriptorPoolCreateInfo _obj = (VkDescriptorPoolCreateInfo)(ptr);
		  return (const VkDescriptorPoolSize*) (_obj.const VkDescriptorPoolSize*);
	 */



} // end of class VkDescriptorPoolCreateInfo
