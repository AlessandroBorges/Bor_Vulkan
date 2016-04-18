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

import java.nio.Buffer;


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

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [31]  */
	 private static final String TAG = "VkSparseImageMemoryBindInfo";

	/** ID of this structure [31]  */
	 public static final int TAG_ID = VKSPARSEIMAGEMEMORYBINDINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkSparseImageMemoryBindInfo> p;

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
	 *  const VkSparseImageMemoryBind* 	pBinds	[vkstruct]
	 */ 
	  VkSparseImageMemoryBind  	pBinds;

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
	 public VkSparseImageMemoryBindInfo(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkSparseImageMemoryBindInfo(long address){ 
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
	 public static P<VkSparseImageMemoryBindInfo> createNullPointer(){
	        P<VkSparseImageMemoryBindInfo> p = new  P<VkSparseImageMemoryBindInfo>(new VkSparseImageMemoryBindInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkSparseImageMemoryBindInfo> getP() {
	       if(p == null ){
	           p = new P<VkSparseImageMemoryBindInfo> (this);
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
	 * Prototype: const VkSparseImageMemoryBind*  pBinds
	 */ 
	 public void pBinds( VkSparseImageMemoryBind  pBinds){
		 this.pBinds = pBinds;
		 ByteBuffer buff = (pBinds==null) ? null : pBinds.getPointer();
		 setPBinds0(this.ptr, buff);
	 }

	/**
	 * Get method for field pBinds	[vkstruct]<br>
	 * Prototype: const VkSparseImageMemoryBind*  pBinds
	 */ 
	 public  VkSparseImageMemoryBind  pBinds(){
		 long pointer = getPBinds0(super.ptr);
		 if(pointer == 0){
		    this.pBinds = null;
		    return null;
		  } 

		 if(this.pBinds == null){
		    this.pBinds = new  VkSparseImageMemoryBind (pointer);
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
		  VkSparseImageMemoryBindInfo* vkObj = (VkSparseImageMemoryBindInfo*)(ptr);
		  vkObj->image = (VkImage) (_image);
	  */

	/**
	 * native GET method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 */ 
	 private static native long getImage0(Buffer ptr);/*
		  VkSparseImageMemoryBindInfo* vkObj = (VkSparseImageMemoryBindInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->image);	 */

	/**
	 * native SET method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 */ 
	 private static native void setBindCount0(Buffer ptr, int _bindCount);/*
		  VkSparseImageMemoryBindInfo* vkObj = (VkSparseImageMemoryBindInfo*)(ptr);
		  vkObj->bindCount = (uint32_t) (_bindCount);
	  */

	/**
	 * native GET method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 */ 
	 private static native int getBindCount0(Buffer ptr);/*
		  VkSparseImageMemoryBindInfo* vkObj = (VkSparseImageMemoryBindInfo*)(ptr);
		  return (jint) (vkObj->bindCount);
	 */

	/**
	 * native SET method for field pBinds	[vkstruct]<br>
	 * Prototype: const VkSparseImageMemoryBind*  pBinds
	 */ 
	 private static native void setPBinds0(Buffer ptr, java.nio.ByteBuffer  _pBinds);/*
		  VkSparseImageMemoryBindInfo* vkObj = (VkSparseImageMemoryBindInfo*)(ptr);
		  vkObj->pBinds = (const VkSparseImageMemoryBind*) (_pBinds);
	  */

	/**
	 * native GET method for field pBinds	[vkstruct]<br>
	 * Prototype: const VkSparseImageMemoryBind*  pBinds
	 */ 
	 private static native long getPBinds0(Buffer ptr);/*
		  VkSparseImageMemoryBindInfo* vkObj = (VkSparseImageMemoryBindInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pBinds);	 */



} // end of class VkSparseImageMemoryBindInfo
