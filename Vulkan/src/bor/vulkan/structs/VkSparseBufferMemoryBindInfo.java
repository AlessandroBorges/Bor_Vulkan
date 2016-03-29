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

import java.nio.Buffer;


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

	/** P wrapper for THIS object */
	 private  P<VkSparseBufferMemoryBindInfo> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkBuffer 	buffer	[vkhandle]
	 */ 
	 VkBuffer 	buffer;

	/**
	 *  uint32_t 	bindCount	[int]
	 */ 
	 int 	bindCount;

	/**
	 *  const VkSparseMemoryBind* 	pBinds	[vkstruct]
	 */ 
	  VkSparseMemoryBind  	pBinds;

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


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkSparseBufferMemoryBindInfo> getP() {
	       if(p == null ){
	           p = new P<VkSparseBufferMemoryBindInfo> (this);
	       }
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
		 ByteBuffer buff = (buffer==null) ? null : buffer.getHandle();
		 buffer0(this.ptr, buff);
	 }

	/**
	 * Get method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 public VkBuffer buffer(){

		 ByteBuffer handle = buffer0(super.ptr);
		 if(handle == null){
		    this.buffer = null;
		    return null;
		  } else 
 		 if(this.buffer == null){
		    this.buffer = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.buffer).setHandle(handle);
		  }
		 return this.buffer;
	 }

	/**
	 * Set method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 */ 
	 public void bindCount(int bindCount){
		 this.bindCount = bindCount;
		 bindCount0(this.ptr,  bindCount);
	 }

	/**
	 * Get method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 */ 
	 public int bindCount(){
		 int var = bindCount0(super.ptr);
		 this.bindCount = var;
		 return this.bindCount;
	 }

	/**
	 * Set method for field pBinds	[vkstruct]<br>
	 * Prototype: const VkSparseMemoryBind*  pBinds
	 */ 
	 public void pBinds( VkSparseMemoryBind  pBinds){
		 this.pBinds = pBinds;
		 ByteBuffer buff = (pBinds==null) ? null : pBinds.getPointerStruct();
		 pBinds0(this.ptr, buff);
	 }

	/**
	 * Get method for field pBinds	[vkstruct]<br>
	 * Prototype: const VkSparseMemoryBind*  pBinds
	 */ 
	 public  VkSparseMemoryBind  pBinds(){
		 ByteBuffer pointer = pBinds0(super.ptr);
		 if(pointer == null){
		    this.pBinds = null;
		    return null;
		  } else 
 		 if(this.pBinds == null){
		    this.pBinds = new  VkSparseMemoryBind (pointer);
		 }else{
		    this.pBinds.setPointer(pointer);
		  }
		 return this.pBinds;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native void buffer0(Buffer ptr, java.nio.ByteBuffer  _buffer);/*
		  VkSparseBufferMemoryBindInfo* vkObj = (VkSparseBufferMemoryBindInfo*)(ptr);
		  vkObj->buffer = (VkBuffer) (_buffer);
	  */

	/**
	 * native GET method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native java.nio.ByteBuffer  buffer0(Buffer ptr);/*
		  VkSparseBufferMemoryBindInfo vkObj = (VkSparseBufferMemoryBindInfo*)(ptr);
		  return (jobject) (vkObj->buffer);
	 */

	/**
	 * native SET method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 */ 
	 private static native void bindCount0(Buffer ptr, int _bindCount);/*
		  VkSparseBufferMemoryBindInfo* vkObj = (VkSparseBufferMemoryBindInfo*)(ptr);
		  vkObj->bindCount = (uint32_t) (_bindCount);
	  */

	/**
	 * native GET method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 */ 
	 private static native int bindCount0(Buffer ptr);/*
		  VkSparseBufferMemoryBindInfo vkObj = (VkSparseBufferMemoryBindInfo*)(ptr);
		  return (jint) (vkObj->bindCount);
	 */

	/**
	 * native SET method for field pBinds	[vkstruct]<br>
	 * Prototype: const VkSparseMemoryBind*  pBinds
	 */ 
	 private static native void pBinds0(Buffer ptr, java.nio.ByteBuffer  _pBinds);/*
		  VkSparseBufferMemoryBindInfo* vkObj = (VkSparseBufferMemoryBindInfo*)(ptr);
		  vkObj->pBinds = (const VkSparseMemoryBind*) (_pBinds);
	  */

	/**
	 * native GET method for field pBinds	[vkstruct]<br>
	 * Prototype: const VkSparseMemoryBind*  pBinds
	 */ 
	 private static native java.nio.ByteBuffer  pBinds0(Buffer ptr);/*
		  VkSparseBufferMemoryBindInfo vkObj = (VkSparseBufferMemoryBindInfo*)(ptr);
		  return ( VkSparseMemoryBind ) (vkObj->pBinds);
	 */



} // end of class VkSparseBufferMemoryBindInfo
