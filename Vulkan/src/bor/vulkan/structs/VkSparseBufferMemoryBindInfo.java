/**
 * Class wrapping Vulkan's VkSparseBufferMemoryBindInfo struct.
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
 *  This class is a Java front end for struct VkSparseBufferMemoryBindInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSparseBufferMemoryBindInfo {
 *     VkBuffer                     buffer;
 *     uint32_t                     bindCount;
 *     const VkSparseMemoryBind*    pBinds;
 * } VkSparseBufferMemoryBindInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkSparseBufferMemoryBindInfo extends VkStruct {
	/** TAG of this structure [26]  */
	 private static final String TAG = "VkSparseBufferMemoryBindInfo";

	/** ID of this structure [26]  */
	 public static final int TAG_ID = VKSPARSEBUFFERMEMORYBINDINFO_ID;

	 // fields //
	/**
	 *  VkBuffer 	buffer	[vkhandle]
	 */ 
	VkBuffer 	buffer;

	/**
	 *  uint32_t 	bindCount	[int]
	 */ 
	int 	bindCount;

	/**
	 *  const VkSparseMemoryBind* 	pBinds	[p]
	 */ 
	P<VkSparseMemoryBind>  	pBinds;

	/**
	 * Ctor
	 */
	public VkSparseBufferMemoryBindInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSparseBufferMemoryBindInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkSparseBufferMemoryBindInfo(long address, int memSize){ 
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
	 public static P<VkSparseBufferMemoryBindInfo> createNullPointer(){
	        P<VkSparseBufferMemoryBindInfo> p = new  P<VkSparseBufferMemoryBindInfo>(new VkSparseBufferMemoryBindInfo());
	        return p;
	    }

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 public void buffer(VkBuffer buffer){
		 this.buffer = buffer;
		buffer0(super.ptr, buffer);
	 }

	/**
	 * get method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 public VkBuffer buffer(){
		 // return  this.buffer;
		 return buffer0(super.ptr);
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
	 * Prototype: const VkSparseMemoryBind*  pBinds
	 */ 
	 public void pBinds(P<VkSparseMemoryBind>  pBinds){
		 this.pBinds = pBinds;
		pBinds0(super.ptr, pBinds);
	 }

	/**
	 * get method for field pBinds	[p]<br>
	 * Prototype: const VkSparseMemoryBind*  pBinds
	 */ 
	 public P<VkSparseMemoryBind>  pBinds(){
		 // return  this.pBinds;
		 return pBinds0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native void buffer0(ByteBuffer ptr, VkBuffer _buffer);/*
		  VkSparseBufferMemoryBindInfo _obj = (VkSparseBufferMemoryBindInfo)(*ptr);
		  _obj.buffer = (VkBuffer) (_buffer);
	  */

	/**
	 * native GET method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native VkBuffer buffer0(ByteBuffer ptr);/*
		  VkSparseBufferMemoryBindInfo _obj = (VkSparseBufferMemoryBindInfo)(ptr);
		  return (VkBuffer) (_obj.VkBuffer);
	 */

	/**
	 * native SET method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 */ 
	 private static native void bindCount0(ByteBuffer ptr, int _bindCount);/*
		  VkSparseBufferMemoryBindInfo _obj = (VkSparseBufferMemoryBindInfo)(*ptr);
		  _obj.bindCount = (uint32_t) (_bindCount);
	  */

	/**
	 * native GET method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 */ 
	 private static native int bindCount0(ByteBuffer ptr);/*
		  VkSparseBufferMemoryBindInfo _obj = (VkSparseBufferMemoryBindInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field pBinds	[p]<br>
	 * Prototype: const VkSparseMemoryBind*  pBinds
	 */ 
	 private static native void pBinds0(ByteBuffer ptr, P<VkSparseMemoryBind>  _pBinds);/*
		  VkSparseBufferMemoryBindInfo _obj = (VkSparseBufferMemoryBindInfo)(*ptr);
		  _obj.pBinds = (const VkSparseMemoryBind*) (_pBinds);
	  */

	/**
	 * native GET method for field pBinds	[p]<br>
	 * Prototype: const VkSparseMemoryBind*  pBinds
	 */ 
	 private static native P<VkSparseMemoryBind>  pBinds0(ByteBuffer ptr);/*
		  VkSparseBufferMemoryBindInfo _obj = (VkSparseBufferMemoryBindInfo)(ptr);
		  return (P<VkSparseMemoryBind> ) (_obj.const VkSparseMemoryBind*);
	 */



} // end of class VkSparseBufferMemoryBindInfo
