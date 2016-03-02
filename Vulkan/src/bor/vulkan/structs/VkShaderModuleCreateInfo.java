/**
 * Class wrapping Vulkan's VkShaderModuleCreateInfo struct.
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
 *  This class is a Java front end for struct VkShaderModuleCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkShaderModuleCreateInfo {
 *     VkStructureType              sType;
 *     const void*                  pNext;
 *     VkShaderModuleCreateFlags    flags;
 *     size_t                       codeSize;
 *     const uint32_t*              pCode;
 * } VkShaderModuleCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkShaderModuleCreateInfo extends VkStruct {
	/** TAG of this structure [168]  */
	 private static final String TAG = "VkShaderModuleCreateInfo";

	/** ID of this structure [168]  */
	 public static final int TAG_ID = VKSHADERMODULECREATEINFO_ID;

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
	 *  VkShaderModuleCreateFlags 	flags 
	 */ 
	int 	flags;

	/**
	 *  size_t 	codeSize 
	 */ 
	long 	codeSize;

	/**
	 *  const uint32_t* 	pCode 
	 */ 
	int[] 	pCode;

	/**
	 * Ctor
	 */
	public VkShaderModuleCreateInfo(){ 
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
	 * Prototype: VkShaderModuleCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkShaderModuleCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field codeSize
	 * Prototype: size_t  codeSize
	 */ 
	 public void codeSize(long codeSize){
		 this.codeSize = codeSize;
		codeSize0(super.ptr, codeSize);
	 }

	/**
	 * get method for field codeSize
	 * Prototype: size_t  codeSize
	 */ 
	 public long codeSize(){
		 // return  this.codeSize;
		 return codeSize0(super.ptr);
	 }

	/**
	 * Set method for field pCode
	 * Prototype: const uint32_t*  pCode
	 */ 
	 public void pCode(int[] pCode){
		 this.pCode = pCode;
		pCode0(super.ptr, pCode);
	 }

	/**
	 * get method for field pCode
	 * Prototype: const uint32_t*  pCode
	 */ 
	 public int[] pCode(){
		 // return  this.pCode;
		 return pCode0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkShaderModuleCreateInfo _obj = (VkShaderModuleCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkShaderModuleCreateInfo _obj = (VkShaderModuleCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkShaderModuleCreateInfo _obj = (VkShaderModuleCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkShaderModuleCreateInfo _obj = (VkShaderModuleCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkShaderModuleCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkShaderModuleCreateInfo _obj = (VkShaderModuleCreateInfo)(*ptr);
		  _obj.flags = (VkShaderModuleCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkShaderModuleCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkShaderModuleCreateInfo _obj = (VkShaderModuleCreateInfo)(ptr);
		  return (jint) (_obj.VkShaderModuleCreateFlags);
	 */

	/**
	 * native Set method for field codeSize
	 * Prototype: size_t  codeSize
	 */ 
	 private static native void codeSize0(ByteBuffer ptr, long _codeSize);/*
		  VkShaderModuleCreateInfo _obj = (VkShaderModuleCreateInfo)(*ptr);
		  _obj.codeSize = (size_t) (_codeSize);
	  */

	/**
	 * get method for field codeSize
	 * Prototype: size_t  codeSize
	 */ 
	 private static native long codeSize0(ByteBuffer ptr);/*
		  VkShaderModuleCreateInfo _obj = (VkShaderModuleCreateInfo)(ptr);
		  return (jlong) (_obj.size_t);
	 */

	/**
	 * native Set method for field pCode
	 * Prototype: const uint32_t*  pCode
	 */ 
	 private static native void pCode0(ByteBuffer ptr, int[] _pCode);/*
		  VkShaderModuleCreateInfo _obj = (VkShaderModuleCreateInfo)(*ptr);
		  _obj.pCode = (const uint32_t*) (_pCode);
	  */

	/**
	 * get method for field pCode
	 * Prototype: const uint32_t*  pCode
	 */ 
	 private static native int[] pCode0(ByteBuffer ptr);/*
		  VkShaderModuleCreateInfo _obj = (VkShaderModuleCreateInfo)(ptr);
		  return (int[]) (_obj.const uint32_t*);
	 */



} // end of class VkShaderModuleCreateInfo
