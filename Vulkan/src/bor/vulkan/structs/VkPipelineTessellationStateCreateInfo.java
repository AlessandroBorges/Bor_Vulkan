/**
 * Class wrapping Vulkan's VkPipelineTessellationStateCreateInfo struct.
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
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkPipelineTessellationStateCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPipelineTessellationStateCreateInfo {
 *     VkStructureType                           sType;
 *     const void*                               pNext;
 *     VkPipelineTessellationStateCreateFlags    flags;
 *     uint32_t                                  patchControlPoints;
 * } VkPipelineTessellationStateCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkPipelineTessellationStateCreateInfo extends VkStruct {
	/** TAG of this structure [177]  */
	 private static final String TAG = "VkPipelineTessellationStateCreateInfo";

	/** ID of this structure [177]  */
	 public static final int TAG_ID = VKPIPELINETESSELLATIONSTATECREATEINFO_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType	[vkenum]	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext		 */ 
	P<VkObject> 	pNext;

	/**
	 *  VkPipelineTessellationStateCreateFlags 	flags		 */ 
	int 	flags;

	/**
	 *  uint32_t 	patchControlPoints		 */ 
	int 	patchControlPoints;

	/**
	 * Ctor
	 */
	public VkPipelineTessellationStateCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType	[vkenum]
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
	 * Prototype: VkPipelineTessellationStateCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	
	 * Prototype: VkPipelineTessellationStateCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field patchControlPoints	
	 * Prototype: uint32_t  patchControlPoints
	 */ 
	 public void patchControlPoints(int patchControlPoints){
		 this.patchControlPoints = patchControlPoints;
		patchControlPoints0(super.ptr, patchControlPoints);
	 }

	/**
	 * get method for field patchControlPoints	
	 * Prototype: uint32_t  patchControlPoints
	 */ 
	 public int patchControlPoints(){
		 // return  this.patchControlPoints;
		 return patchControlPoints0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkPipelineTessellationStateCreateInfo _obj = (VkPipelineTessellationStateCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkPipelineTessellationStateCreateInfo _obj = (VkPipelineTessellationStateCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkPipelineTessellationStateCreateInfo _obj = (VkPipelineTessellationStateCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkPipelineTessellationStateCreateInfo _obj = (VkPipelineTessellationStateCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags	
	 * Prototype: VkPipelineTessellationStateCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkPipelineTessellationStateCreateInfo _obj = (VkPipelineTessellationStateCreateInfo)(*ptr);
		  _obj.flags = (VkPipelineTessellationStateCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags	
	 * Prototype: VkPipelineTessellationStateCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkPipelineTessellationStateCreateInfo _obj = (VkPipelineTessellationStateCreateInfo)(ptr);
		  return (jint) (_obj.VkPipelineTessellationStateCreateFlags);
	 */

	/**
	 * native Set method for field patchControlPoints	
	 * Prototype: uint32_t  patchControlPoints
	 */ 
	 private static native void patchControlPoints0(ByteBuffer ptr, int _patchControlPoints);/*
		  VkPipelineTessellationStateCreateInfo _obj = (VkPipelineTessellationStateCreateInfo)(*ptr);
		  _obj.patchControlPoints = (uint32_t) (_patchControlPoints);
	  */

	/**
	 * get method for field patchControlPoints	
	 * Prototype: uint32_t  patchControlPoints
	 */ 
	 private static native int patchControlPoints0(ByteBuffer ptr);/*
		  VkPipelineTessellationStateCreateInfo _obj = (VkPipelineTessellationStateCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkPipelineTessellationStateCreateInfo
