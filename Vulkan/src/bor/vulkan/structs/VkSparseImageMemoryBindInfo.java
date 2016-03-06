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
 *  Project Bor-Vulkan 
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
	/** TAG of this structure [31]  */
	 private static final String TAG = "VkSparseImageMemoryBindInfo";

	/** ID of this structure [31]  */
	 public static final int TAG_ID = VKSPARSEIMAGEMEMORYBINDINFO_ID;

	 // fields //
	/**
	 *  VkImage 	image	[vkhandle]
	 */ 
	VkImage 	image;

	/**
	 *  uint32_t 	bindCount	[int]
	 */ 
	int 	bindCount;

	/**
	 *  const VkSparseImageMemoryBind* 	pBinds	[p]
	 */ 
	P<VkSparseImageMemoryBind>  	pBinds;

	/**
	 * Ctor
	 */
	public VkSparseImageMemoryBindInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSparseImageMemoryBindInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkSparseImageMemoryBindInfo(long address, int memSize){ 
		 super(address, memSize); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	/**
	 * Create a pointer P to contain a instance of this,
	 * with clean native pointer.<br>
	 * You can use {@link VkStruct#setPointer(ByteBuffer)} to set a new 
	 * native pointer.
	 * @return An instance of P for this VkStruct with null pointer
	 */
	 public static P<VkSparseImageMemoryBindInfo> createNullPointer(){
	        P<VkSparseImageMemoryBindInfo> p = new  P<VkSparseImageMemoryBindInfo>(new VkSparseImageMemoryBindInfo());
	        return p;
	    }

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 */ 
	 public void image(VkImage image){
		 this.image = image;
		image0(super.ptr, image);
	 }

	/**
	 * get method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 */ 
	 public VkImage image(){
		 // return  this.image;
		 return image0(super.ptr);
	 }

	/**
	 * Set method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 */ 
	 public void bindCount(int bindCount){
		 this.bindCount = bindCount;
		bindCount0(super.ptr, bindCount);
	 }

	/**
	 * get method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 */ 
	 public int bindCount(){
		 // return  this.bindCount;
		 return bindCount0(super.ptr);
	 }

	/**
	 * Set method for field pBinds	[p]<br>
	 * Prototype: const VkSparseImageMemoryBind*  pBinds
	 */ 
	 public void pBinds(P<VkSparseImageMemoryBind>  pBinds){
		 this.pBinds = pBinds;
		pBinds0(super.ptr, pBinds);
	 }

	/**
	 * get method for field pBinds	[p]<br>
	 * Prototype: const VkSparseImageMemoryBind*  pBinds
	 */ 
	 public P<VkSparseImageMemoryBind>  pBinds(){
		 // return  this.pBinds;
		 return pBinds0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 */ 
	 private static native void image0(ByteBuffer ptr, VkImage _image);/*
		  VkSparseImageMemoryBindInfo _obj = (VkSparseImageMemoryBindInfo)(*ptr);
		  _obj.image = (VkImage) (_image);
	  */

	/**
	 * native GET method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 */ 
	 private static native VkImage image0(ByteBuffer ptr);/*
		  VkSparseImageMemoryBindInfo _obj = (VkSparseImageMemoryBindInfo)(ptr);
		  return (VkImage) (_obj.VkImage);
	 */

	/**
	 * native SET method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 */ 
	 private static native void bindCount0(ByteBuffer ptr, int _bindCount);/*
		  VkSparseImageMemoryBindInfo _obj = (VkSparseImageMemoryBindInfo)(*ptr);
		  _obj.bindCount = (uint32_t) (_bindCount);
	  */

	/**
	 * native GET method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 */ 
	 private static native int bindCount0(ByteBuffer ptr);/*
		  VkSparseImageMemoryBindInfo _obj = (VkSparseImageMemoryBindInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field pBinds	[p]<br>
	 * Prototype: const VkSparseImageMemoryBind*  pBinds
	 */ 
	 private static native void pBinds0(ByteBuffer ptr, P<VkSparseImageMemoryBind>  _pBinds);/*
		  VkSparseImageMemoryBindInfo _obj = (VkSparseImageMemoryBindInfo)(*ptr);
		  _obj.pBinds = (const VkSparseImageMemoryBind*) (_pBinds);
	  */

	/**
	 * native GET method for field pBinds	[p]<br>
	 * Prototype: const VkSparseImageMemoryBind*  pBinds
	 */ 
	 private static native P<VkSparseImageMemoryBind>  pBinds0(ByteBuffer ptr);/*
		  VkSparseImageMemoryBindInfo _obj = (VkSparseImageMemoryBindInfo)(ptr);
		  return (P<VkSparseImageMemoryBind> ) (_obj.const VkSparseImageMemoryBind*);
	 */



} // end of class VkSparseImageMemoryBindInfo
