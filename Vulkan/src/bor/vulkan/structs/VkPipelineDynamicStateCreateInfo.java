// class wrapping Vulkan's VkPipelineDynamicStateCreateInfo struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkPipelineDynamicStateCreateInfo 
 * @Author Alessandro Borges 
 */
public class VkPipelineDynamicStateCreateInfo extends VkStruct {
	/** ID of this structure [65]  */
	 public static final int TAG = VKPIPELINEDYNAMICSTATECREATEINFO_ID;

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
	 *  VkPipelineDynamicStateCreateFlags 	flags 
	 */ 
	int 	flags;

	/**
	 *  uint32_t 	dynamicStateCount 
	 */ 
	int 	dynamicStateCount;

	/**
	 *  const VkDynamicState* 	pDynamicStates 
	 */ 
	const VkDynamicState* 	pDynamicStates;

	/**
	 * Ctor
	 */
	public VkPipelineDynamicStateCreateInfo(){ 
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
	 * Prototype: VkPipelineDynamicStateCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkPipelineDynamicStateCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field dynamicStateCount
	 * Prototype: uint32_t  dynamicStateCount
	 */ 
	 public void dynamicStateCount(int dynamicStateCount){
		 this.dynamicStateCount = dynamicStateCount;
		dynamicStateCount0(super.ptr, dynamicStateCount);
	 }

	/**
	 * get method for field dynamicStateCount
	 * Prototype: uint32_t  dynamicStateCount
	 */ 
	 public int dynamicStateCount(){
		 // return  this.dynamicStateCount;
		 return dynamicStateCount0(super.ptr);
	 }

	/**
	 * Set method for field pDynamicStates
	 * Prototype: const VkDynamicState*  pDynamicStates
	 */ 
	 public void pDynamicStates(const VkDynamicState* pDynamicStates){
		 this.pDynamicStates = pDynamicStates;
		pDynamicStates0(super.ptr, pDynamicStates);
	 }

	/**
	 * get method for field pDynamicStates
	 * Prototype: const VkDynamicState*  pDynamicStates
	 */ 
	 public const VkDynamicState* pDynamicStates(){
		 // return  this.pDynamicStates;
		 return pDynamicStates0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkPipelineDynamicStateCreateInfo _obj = (VkPipelineDynamicStateCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkPipelineDynamicStateCreateInfo _obj = (VkPipelineDynamicStateCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkPipelineDynamicStateCreateInfo _obj = (VkPipelineDynamicStateCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkPipelineDynamicStateCreateInfo _obj = (VkPipelineDynamicStateCreateInfo)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkPipelineDynamicStateCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkPipelineDynamicStateCreateInfo _obj = (VkPipelineDynamicStateCreateInfo)(*ptr);
		  _obj.flags = (VkPipelineDynamicStateCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkPipelineDynamicStateCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkPipelineDynamicStateCreateInfo _obj = (VkPipelineDynamicStateCreateInfo)(ptr);
		  return (jint) (_obj.VkPipelineDynamicStateCreateFlags);
	 */

	/**
	 * native Set method for field dynamicStateCount
	 * Prototype: uint32_t  dynamicStateCount
	 */ 
	 private static native void dynamicStateCount0(ByteBuffer ptr, int _dynamicStateCount);/*
		  VkPipelineDynamicStateCreateInfo _obj = (VkPipelineDynamicStateCreateInfo)(*ptr);
		  _obj.dynamicStateCount = (uint32_t) (_dynamicStateCount);
	  */

	/**
	 * get method for field dynamicStateCount
	 * Prototype: uint32_t  dynamicStateCount
	 */ 
	 private static native int dynamicStateCount0(ByteBuffer ptr);/*
		  VkPipelineDynamicStateCreateInfo _obj = (VkPipelineDynamicStateCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pDynamicStates
	 * Prototype: const VkDynamicState*  pDynamicStates
	 */ 
	 private static native void pDynamicStates0(ByteBuffer ptr, const VkDynamicState* _pDynamicStates);/*
		  VkPipelineDynamicStateCreateInfo _obj = (VkPipelineDynamicStateCreateInfo)(*ptr);
		  _obj.pDynamicStates = (const VkDynamicState*) (_pDynamicStates);
	  */

	/**
	 * get method for field pDynamicStates
	 * Prototype: const VkDynamicState*  pDynamicStates
	 */ 
	 private static native const VkDynamicState* pDynamicStates0(ByteBuffer ptr);/*
		  VkPipelineDynamicStateCreateInfo _obj = (VkPipelineDynamicStateCreateInfo)(ptr);
		  return (const VkDynamicState*) (_obj.const VkDynamicState*);
	 */



} // end of class VkPipelineDynamicStateCreateInfo
