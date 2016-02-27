// class wrapping Vulkan's VkCommandPoolCreateInfo struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkCommandPoolCreateInfo 
 * @Author Alessandro Borges 
 */
public class VkCommandPoolCreateInfo extends VkStruct {
	/** ID of this structure [86]  */
	 public static final int TAG = VKCOMMANDPOOLCREATEINFO_ID;

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
	 *  VkCommandPoolCreateFlags 	flags 
	 */ 
	int 	flags;

	/**
	 *  uint32_t 	queueFamilyIndex 
	 */ 
	int 	queueFamilyIndex;

	/**
	 * Ctor
	 */
	public VkCommandPoolCreateInfo(){ 
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
	 * Prototype: VkCommandPoolCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkCommandPoolCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field queueFamilyIndex
	 * Prototype: uint32_t  queueFamilyIndex
	 */ 
	 public void queueFamilyIndex(int queueFamilyIndex){
		 this.queueFamilyIndex = queueFamilyIndex;
		queueFamilyIndex0(super.ptr, queueFamilyIndex);
	 }

	/**
	 * get method for field queueFamilyIndex
	 * Prototype: uint32_t  queueFamilyIndex
	 */ 
	 public int queueFamilyIndex(){
		 // return  this.queueFamilyIndex;
		 return queueFamilyIndex0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkCommandPoolCreateInfo _obj = (VkCommandPoolCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkCommandPoolCreateInfo _obj = (VkCommandPoolCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkCommandPoolCreateInfo _obj = (VkCommandPoolCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkCommandPoolCreateInfo _obj = (VkCommandPoolCreateInfo)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkCommandPoolCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkCommandPoolCreateInfo _obj = (VkCommandPoolCreateInfo)(*ptr);
		  _obj.flags = (VkCommandPoolCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkCommandPoolCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkCommandPoolCreateInfo _obj = (VkCommandPoolCreateInfo)(ptr);
		  return (jint) (_obj.VkCommandPoolCreateFlags);
	 */

	/**
	 * native Set method for field queueFamilyIndex
	 * Prototype: uint32_t  queueFamilyIndex
	 */ 
	 private static native void queueFamilyIndex0(ByteBuffer ptr, int _queueFamilyIndex);/*
		  VkCommandPoolCreateInfo _obj = (VkCommandPoolCreateInfo)(*ptr);
		  _obj.queueFamilyIndex = (uint32_t) (_queueFamilyIndex);
	  */

	/**
	 * get method for field queueFamilyIndex
	 * Prototype: uint32_t  queueFamilyIndex
	 */ 
	 private static native int queueFamilyIndex0(ByteBuffer ptr);/*
		  VkCommandPoolCreateInfo _obj = (VkCommandPoolCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkCommandPoolCreateInfo
