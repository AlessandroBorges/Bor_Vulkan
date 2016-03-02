/**
 * Class wrapping Vulkan's VkSparseImageMemoryBindInfo struct.
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
 *  This class is a Java front end for struct VkSparseImageMemoryBindInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSparseImageMemoryBindInfo {
 *     VkImage                           image;
 *     uint32_t                          bindCount;
 *     const VkSparseImageMemoryBind*    pBinds;
 * } VkSparseImageMemoryBindInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkSparseImageMemoryBindInfo extends VkStruct {
	/** TAG of this structure [155]  */
	 private static final String TAG = "VkSparseImageMemoryBindInfo";

	/** ID of this structure [155]  */
	 public static final int TAG_ID = VKSPARSEIMAGEMEMORYBINDINFO_ID;

	 // fields //
	/**
	 *  VkImage 	image	[vkhandle]	 */ 
	VkImage 	image;

	/**
	 *  uint32_t 	bindCount		 */ 
	int 	bindCount;

	/**
	 *  const VkSparseImageMemoryBind* 	pBinds		 */ 
	P<VkSparseImageMemoryBind>  	pBinds;

	/**
	 * Ctor
	 */
	public VkSparseImageMemoryBindInfo(){ 
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
	 * Set method for field image	[vkhandle]
	 * Prototype: VkImage  image
	 */ 
	 public void image(VkImage image){
		 this.image = image;
		image0(super.ptr, image);
	 }

	/**
	 * get method for field image	[vkhandle]
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
	 * Prototype: const VkSparseImageMemoryBind*  pBinds
	 */ 
	 public void pBinds(P<VkSparseImageMemoryBind>  pBinds){
		 this.pBinds = pBinds;
		pBinds0(super.ptr, pBinds);
	 }

	/**
	 * get method for field pBinds	
	 * Prototype: const VkSparseImageMemoryBind*  pBinds
	 */ 
	 public P<VkSparseImageMemoryBind>  pBinds(){
		 // return  this.pBinds;
		 return pBinds0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field image	[vkhandle]
	 * Prototype: VkImage  image
	 */ 
	 private static native void image0(ByteBuffer ptr, VkImage _image);/*
		  VkSparseImageMemoryBindInfo _obj = (VkSparseImageMemoryBindInfo)(*ptr);
		  _obj.image = (VkImage) (_image);
	  */

	/**
	 * get method for field image	[vkhandle]
	 * Prototype: VkImage  image
	 */ 
	 private static native VkImage image0(ByteBuffer ptr);/*
		  VkSparseImageMemoryBindInfo _obj = (VkSparseImageMemoryBindInfo)(ptr);
		  return (VkImage) (_obj.VkImage);
	 */

	/**
	 * native Set method for field bindCount	
	 * Prototype: uint32_t  bindCount
	 */ 
	 private static native void bindCount0(ByteBuffer ptr, int _bindCount);/*
		  VkSparseImageMemoryBindInfo _obj = (VkSparseImageMemoryBindInfo)(*ptr);
		  _obj.bindCount = (uint32_t) (_bindCount);
	  */

	/**
	 * get method for field bindCount	
	 * Prototype: uint32_t  bindCount
	 */ 
	 private static native int bindCount0(ByteBuffer ptr);/*
		  VkSparseImageMemoryBindInfo _obj = (VkSparseImageMemoryBindInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pBinds	
	 * Prototype: const VkSparseImageMemoryBind*  pBinds
	 */ 
	 private static native void pBinds0(ByteBuffer ptr, P<VkSparseImageMemoryBind>  _pBinds);/*
		  VkSparseImageMemoryBindInfo _obj = (VkSparseImageMemoryBindInfo)(*ptr);
		  _obj.pBinds = (const VkSparseImageMemoryBind*) (_pBinds);
	  */

	/**
	 * get method for field pBinds	
	 * Prototype: const VkSparseImageMemoryBind*  pBinds
	 */ 
	 private static native P<VkSparseImageMemoryBind>  pBinds0(ByteBuffer ptr);/*
		  VkSparseImageMemoryBindInfo _obj = (VkSparseImageMemoryBindInfo)(ptr);
		  return (P<VkSparseImageMemoryBind> ) (_obj.const VkSparseImageMemoryBind*);
	 */



} // end of class VkSparseImageMemoryBindInfo
