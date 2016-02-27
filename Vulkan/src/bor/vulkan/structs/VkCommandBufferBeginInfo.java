// class wrapping Vulkan's VkCommandBufferBeginInfo struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkCommandBufferBeginInfo 
 * @Author Alessandro Borges 
 */
public class VkCommandBufferBeginInfo extends VkStruct {
	/** ID of this structure [89]  */
	 public static final int TAG = VKCOMMANDBUFFERBEGININFO_ID;

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
	 *  VkCommandBufferUsageFlags 	flags 
	 */ 
	int 	flags;

	/**
	 *  const VkCommandBufferInheritanceInfo* 	pInheritanceInfo 
	 */ 
	const VkCommandBufferInheritanceInfo* 	pInheritanceInfo;

	/**
	 * Ctor
	 */
	public VkCommandBufferBeginInfo(){ 
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
	 * Prototype: VkCommandBufferUsageFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkCommandBufferUsageFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field pInheritanceInfo
	 * Prototype: const VkCommandBufferInheritanceInfo*  pInheritanceInfo
	 */ 
	 public void pInheritanceInfo(const VkCommandBufferInheritanceInfo* pInheritanceInfo){
		 this.pInheritanceInfo = pInheritanceInfo;
		pInheritanceInfo0(super.ptr, pInheritanceInfo);
	 }

	/**
	 * get method for field pInheritanceInfo
	 * Prototype: const VkCommandBufferInheritanceInfo*  pInheritanceInfo
	 */ 
	 public const VkCommandBufferInheritanceInfo* pInheritanceInfo(){
		 // return  this.pInheritanceInfo;
		 return pInheritanceInfo0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkCommandBufferBeginInfo _obj = (VkCommandBufferBeginInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkCommandBufferBeginInfo _obj = (VkCommandBufferBeginInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkCommandBufferBeginInfo _obj = (VkCommandBufferBeginInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkCommandBufferBeginInfo _obj = (VkCommandBufferBeginInfo)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkCommandBufferUsageFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkCommandBufferBeginInfo _obj = (VkCommandBufferBeginInfo)(*ptr);
		  _obj.flags = (VkCommandBufferUsageFlags) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkCommandBufferUsageFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkCommandBufferBeginInfo _obj = (VkCommandBufferBeginInfo)(ptr);
		  return (jint) (_obj.VkCommandBufferUsageFlags);
	 */

	/**
	 * native Set method for field pInheritanceInfo
	 * Prototype: const VkCommandBufferInheritanceInfo*  pInheritanceInfo
	 */ 
	 private static native void pInheritanceInfo0(ByteBuffer ptr, const VkCommandBufferInheritanceInfo* _pInheritanceInfo);/*
		  VkCommandBufferBeginInfo _obj = (VkCommandBufferBeginInfo)(*ptr);
		  _obj.pInheritanceInfo = (const VkCommandBufferInheritanceInfo*) (_pInheritanceInfo);
	  */

	/**
	 * get method for field pInheritanceInfo
	 * Prototype: const VkCommandBufferInheritanceInfo*  pInheritanceInfo
	 */ 
	 private static native const VkCommandBufferInheritanceInfo* pInheritanceInfo0(ByteBuffer ptr);/*
		  VkCommandBufferBeginInfo _obj = (VkCommandBufferBeginInfo)(ptr);
		  return (const VkCommandBufferInheritanceInfo*) (_obj.const VkCommandBufferInheritanceInfo*);
	 */



} // end of class VkCommandBufferBeginInfo
