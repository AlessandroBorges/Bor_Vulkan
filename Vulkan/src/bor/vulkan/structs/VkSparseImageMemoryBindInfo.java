// class wrapping Vulkan's VkSparseImageMemoryBindInfo struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkSparseImageMemoryBindInfo 
 * @Author Alessandro Borges 
 */
public class VkSparseImageMemoryBindInfo extends VkStruct {
	/** ID of this structure [31]  */
	 public static final int TAG = VKSPARSEIMAGEMEMORYBINDINFO_ID;

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
	 *  const VkSparseImageMemoryBind* 	pBinds 
	 */ 
	const VkSparseImageMemoryBind* 	pBinds;

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
	 * Prototype: const VkSparseImageMemoryBind*  pBinds
	 */ 
	 public void pBinds(const VkSparseImageMemoryBind* pBinds){
		 this.pBinds = pBinds;
		pBinds0(super.ptr, pBinds);
	 }

	/**
	 * get method for field pBinds
	 * Prototype: const VkSparseImageMemoryBind*  pBinds
	 */ 
	 public const VkSparseImageMemoryBind* pBinds(){
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
		  VkSparseImageMemoryBindInfo _obj = (VkSparseImageMemoryBindInfo)(*ptr);
		  _obj.image = (VkImage) (_image);
	  */

	/**
	 * get method for field image
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
	 private static native void pBinds0(ByteBuffer ptr, const VkSparseImageMemoryBind* _pBinds);/*
		  VkSparseImageMemoryBindInfo _obj = (VkSparseImageMemoryBindInfo)(*ptr);
		  _obj.pBinds = (const VkSparseImageMemoryBind*) (_pBinds);
	  */

	/**
	 * get method for field pBinds
	 * Prototype: const VkSparseImageMemoryBind*  pBinds
	 */ 
	 private static native const VkSparseImageMemoryBind* pBinds0(ByteBuffer ptr);/*
		  VkSparseImageMemoryBindInfo _obj = (VkSparseImageMemoryBindInfo)(ptr);
		  return (const VkSparseImageMemoryBind*) (_obj.const VkSparseImageMemoryBind*);
	 */



} // end of class VkSparseImageMemoryBindInfo
