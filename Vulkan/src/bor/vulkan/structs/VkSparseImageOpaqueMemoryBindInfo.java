/**
 * Class wrapping Vulkan's VkSparseImageOpaqueMemoryBindInfo struct.
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
 *  This class is a Java front end for struct VkSparseImageOpaqueMemoryBindInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSparseImageOpaqueMemoryBindInfo {
 *     VkImage                      image;
 *     uint32_t                     bindCount;
 *     const VkSparseMemoryBind*    pBinds;
 * } VkSparseImageOpaqueMemoryBindInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkSparseImageOpaqueMemoryBindInfo extends VkStruct {
	/** TAG of this structure [151]  */
	 private static final String TAG = "VkSparseImageOpaqueMemoryBindInfo";

	/** ID of this structure [151]  */
	 public static final int TAG_ID = VKSPARSEIMAGEOPAQUEMEMORYBINDINFO_ID;

	 // fields //
	/**
	 *  VkImage 	image 
	 */ 
	VkImage 	image;

	/**
	 *  uint32_t 	bindCount 
	 */ 
	int 	bindCount;

	/**
	 *  const VkSparseMemoryBind* 	pBinds 
	 */ 
	P<VkSparseMemoryBind>  	pBinds;

	/**
	 * Ctor
	 */
	public VkSparseImageOpaqueMemoryBindInfo(){ 
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
	 * Set method for field image
	 * Prototype: VkImage  image
	 */ 
	 public void image(VkImage image){
		 this.image = image;
		image0(super.ptr, image);
	 }

	/**
	 * get method for field image
	 * Prototype: VkImage  image
	 */ 
	 public VkImage image(){
		 // return  this.image;
		 return image0(super.ptr);
	 }

	/**
	 * Set method for field bindCount
	 * Prototype: uint32_t  bindCount
	 */ 
	 public void bindCount(int bindCount){
		 this.bindCount = bindCount;
		bindCount0(super.ptr, bindCount);
	 }

	/**
	 * get method for field bindCount
	 * Prototype: uint32_t  bindCount
	 */ 
	 public int bindCount(){
		 // return  this.bindCount;
		 return bindCount0(super.ptr);
	 }

	/**
	 * Set method for field pBinds
	 * Prototype: const VkSparseMemoryBind*  pBinds
	 */ 
	 public void pBinds(P<VkSparseMemoryBind>  pBinds){
		 this.pBinds = pBinds;
		pBinds0(super.ptr, pBinds);
	 }

	/**
	 * get method for field pBinds
	 * Prototype: const VkSparseMemoryBind*  pBinds
	 */ 
	 public P<VkSparseMemoryBind>  pBinds(){
		 // return  this.pBinds;
		 return pBinds0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field image
	 * Prototype: VkImage  image
	 */ 
	 private static native void image0(ByteBuffer ptr, VkImage _image);/*
		  VkSparseImageOpaqueMemoryBindInfo _obj = (VkSparseImageOpaqueMemoryBindInfo)(*ptr);
		  _obj.image = (VkImage) (_image);
	  */

	/**
	 * get method for field image
	 * Prototype: VkImage  image
	 */ 
	 private static native VkImage image0(ByteBuffer ptr);/*
		  VkSparseImageOpaqueMemoryBindInfo _obj = (VkSparseImageOpaqueMemoryBindInfo)(ptr);
		  return (VkImage) (_obj.VkImage);
	 */

	/**
	 * native Set method for field bindCount
	 * Prototype: uint32_t  bindCount
	 */ 
	 private static native void bindCount0(ByteBuffer ptr, int _bindCount);/*
		  VkSparseImageOpaqueMemoryBindInfo _obj = (VkSparseImageOpaqueMemoryBindInfo)(*ptr);
		  _obj.bindCount = (uint32_t) (_bindCount);
	  */

	/**
	 * get method for field bindCount
	 * Prototype: uint32_t  bindCount
	 */ 
	 private static native int bindCount0(ByteBuffer ptr);/*
		  VkSparseImageOpaqueMemoryBindInfo _obj = (VkSparseImageOpaqueMemoryBindInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pBinds
	 * Prototype: const VkSparseMemoryBind*  pBinds
	 */ 
	 private static native void pBinds0(ByteBuffer ptr, P<VkSparseMemoryBind>  _pBinds);/*
		  VkSparseImageOpaqueMemoryBindInfo _obj = (VkSparseImageOpaqueMemoryBindInfo)(*ptr);
		  _obj.pBinds = (const VkSparseMemoryBind*) (_pBinds);
	  */

	/**
	 * get method for field pBinds
	 * Prototype: const VkSparseMemoryBind*  pBinds
	 */ 
	 private static native P<VkSparseMemoryBind>  pBinds0(ByteBuffer ptr);/*
		  VkSparseImageOpaqueMemoryBindInfo _obj = (VkSparseImageOpaqueMemoryBindInfo)(ptr);
		  return (P<VkSparseMemoryBind> ) (_obj.const VkSparseMemoryBind*);
	 */



} // end of class VkSparseImageOpaqueMemoryBindInfo
