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

import java.nio.Buffer;


/**
 *  Project Bor-Vulkan 
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
	/** TAG of this structure [27]  */
	 private static final String TAG = "VkSparseImageOpaqueMemoryBindInfo";

	/** ID of this structure [27]  */
	 public static final int TAG_ID = VKSPARSEIMAGEOPAQUEMEMORYBINDINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkSparseImageOpaqueMemoryBindInfo> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkImage 	image	[vkhandle]
	 */ 
	 VkImage 	image;

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
	public VkSparseImageOpaqueMemoryBindInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSparseImageOpaqueMemoryBindInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkSparseImageOpaqueMemoryBindInfo(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkSparseImageOpaqueMemoryBindInfo(long address){ 
		 super(address); 
	 }

	/** 
	 * Static Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}

	/** 
	 * Method to get native size of this structure 
	 */
	 @Override
	 public int getSizeBytes(){ 
		 return sizeOf(); 
	}


	/**
	 * Create a pointer P to contain a instance of this,
	 * with clean native pointer.<br>
	 * You can use {@link VkStruct#setPointer(ByteBuffer)} to set a new 
	 * native pointer.
	 * @return An instance of P for this VkStruct with null pointer
	 */
	 public static P<VkSparseImageOpaqueMemoryBindInfo> createNullPointer(){
	        P<VkSparseImageOpaqueMemoryBindInfo> p = new  P<VkSparseImageOpaqueMemoryBindInfo>(new VkSparseImageOpaqueMemoryBindInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkSparseImageOpaqueMemoryBindInfo> getP() {
	       if(p == null ){
	           p = new P<VkSparseImageOpaqueMemoryBindInfo> (this);
	       }
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
		 ByteBuffer buff = (image==null) ? null : image.getPointer();
		 setImage0(this.ptr, buff);
	 }

	/**
	 * Get method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 */ 
	 public VkImage image(){

		 long handle = getImage0(super.ptr);
		 if(handle == 0){
		    this.image = null;
		    return null;
		  }  

		 if(this.image == null){
		    this.image = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.image).setPointer(handle);
		  }
		 return this.image;
	 }

	/**
	 * Set method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 */ 
	 public void bindCount(int bindCount){
		 this.bindCount = bindCount;
		 setBindCount0(this.ptr,  bindCount);
	 }

	/**
	 * Get method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 */ 
	 public int bindCount(){
		 int var = getBindCount0(super.ptr);
		 this.bindCount = var;
		 return this.bindCount;
	 }

	/**
	 * Set method for field pBinds	[vkstruct]<br>
	 * Prototype: const VkSparseMemoryBind*  pBinds
	 */ 
	 public void pBinds( VkSparseMemoryBind  pBinds){
		 this.pBinds = pBinds;
		 ByteBuffer buff = (pBinds==null) ? null : pBinds.getPointer();
		 setPBinds0(this.ptr, buff);
	 }

	/**
	 * Get method for field pBinds	[vkstruct]<br>
	 * Prototype: const VkSparseMemoryBind*  pBinds
	 */ 
	 public  VkSparseMemoryBind  pBinds(){
		 long pointer = getPBinds0(super.ptr);
		 if(pointer == 0){
		    this.pBinds = null;
		    return null;
		  } 

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
	 * native SET method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 */ 
	 private static native void setImage0(Buffer ptr, java.nio.ByteBuffer  _image);/*
		  VkSparseImageOpaqueMemoryBindInfo* vkObj = (VkSparseImageOpaqueMemoryBindInfo*)(ptr);
		  vkObj->image = (VkImage) (_image);
	  */

	/**
	 * native GET method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 */ 
	 private static native long getImage0(Buffer ptr);/*
		  VkSparseImageOpaqueMemoryBindInfo vkObj = (VkSparseImageOpaqueMemoryBindInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->image);	 */

	/**
	 * native SET method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 */ 
	 private static native void setBindCount0(Buffer ptr, int _bindCount);/*
		  VkSparseImageOpaqueMemoryBindInfo* vkObj = (VkSparseImageOpaqueMemoryBindInfo*)(ptr);
		  vkObj->bindCount = (uint32_t) (_bindCount);
	  */

	/**
	 * native GET method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 */ 
	 private static native int getBindCount0(Buffer ptr);/*
		  VkSparseImageOpaqueMemoryBindInfo vkObj = (VkSparseImageOpaqueMemoryBindInfo*)(ptr);
		  return (jint) (vkObj->bindCount);
	 */

	/**
	 * native SET method for field pBinds	[vkstruct]<br>
	 * Prototype: const VkSparseMemoryBind*  pBinds
	 */ 
	 private static native void setPBinds0(Buffer ptr, java.nio.ByteBuffer  _pBinds);/*
		  VkSparseImageOpaqueMemoryBindInfo* vkObj = (VkSparseImageOpaqueMemoryBindInfo*)(ptr);
		  vkObj->pBinds = (const VkSparseMemoryBind*) (_pBinds);
	  */

	/**
	 * native GET method for field pBinds	[vkstruct]<br>
	 * Prototype: const VkSparseMemoryBind*  pBinds
	 */ 
	 private static native long getPBinds0(Buffer ptr);/*
		  VkSparseImageOpaqueMemoryBindInfo vkObj = (VkSparseImageOpaqueMemoryBindInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pBinds);	 */



} // end of class VkSparseImageOpaqueMemoryBindInfo
