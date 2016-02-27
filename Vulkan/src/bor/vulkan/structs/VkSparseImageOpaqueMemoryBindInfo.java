// class wrapping Vulkan's VkSparseImageOpaqueMemoryBindInfo struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkSparseImageOpaqueMemoryBindInfo 
 * @Author Alessandro Borges 
 */
public class VkSparseImageOpaqueMemoryBindInfo extends VkStruct {
	/** ID of this structure [27]  */
	 public static final int TAG = VKSPARSEIMAGEOPAQUEMEMORYBINDINFO_ID;

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
	const VkSparseMemoryBind* 	pBinds;

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
		 return sizeOf(TAG); 
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
	 public void pBinds(const VkSparseMemoryBind* pBinds){
		 this.pBinds = pBinds;
		pBinds0(super.ptr, pBinds);
	 }

	/**
	 * get method for field pBinds
	 * Prototype: const VkSparseMemoryBind*  pBinds
	 */ 
	 public const VkSparseMemoryBind* pBinds(){
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
	 private static native void pBinds0(ByteBuffer ptr, const VkSparseMemoryBind* _pBinds);/*
		  VkSparseImageOpaqueMemoryBindInfo _obj = (VkSparseImageOpaqueMemoryBindInfo)(*ptr);
		  _obj.pBinds = (const VkSparseMemoryBind*) (_pBinds);
	  */

	/**
	 * get method for field pBinds
	 * Prototype: const VkSparseMemoryBind*  pBinds
	 */ 
	 private static native const VkSparseMemoryBind* pBinds0(ByteBuffer ptr);/*
		  VkSparseImageOpaqueMemoryBindInfo _obj = (VkSparseImageOpaqueMemoryBindInfo)(ptr);
		  return (const VkSparseMemoryBind*) (_obj.const VkSparseMemoryBind*);
	 */



} // end of class VkSparseImageOpaqueMemoryBindInfo
