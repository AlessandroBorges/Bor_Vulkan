/**
 * Class wrapping Vulkan's VkDescriptorSetAllocateInfo struct.
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
 *  This class is a Java front end for struct VkDescriptorSetAllocateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDescriptorSetAllocateInfo {
 *     VkStructureType                 sType;
 *     const void*                     pNext;
 *     VkDescriptorPool                descriptorPool;
 *     uint32_t                        descriptorSetCount;
 *     const VkDescriptorSetLayout*    pSetLayouts;
 * } VkDescriptorSetAllocateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkDescriptorSetAllocateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [75]  */
	 private static final String TAG = "VkDescriptorSetAllocateInfo";

	/** ID of this structure [75]  */
	 public static final int TAG_ID = VKDESCRIPTORSETALLOCATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkDescriptorSetAllocateInfo> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkStructureType 	sType	[vkenum]
	 */ 
	 VkStructureType 	sType;

	/**
	 *  const void* 	pNext	[vkobject]
	 */ 
	 VkObject 	pNext;

	/**
	 *  VkDescriptorPool 	descriptorPool	[vkhandle]
	 */ 
	 VkDescriptorPool 	descriptorPool;

	/**
	 *  uint32_t 	descriptorSetCount	[int]
	 */ 
	 int 	descriptorSetCount;

	/**
	 *  const VkDescriptorSetLayout* 	pSetLayouts	[vkhandle]
	 */ 
	  VkDescriptorSetLayout  	pSetLayouts;

	/**
	 * Ctor
	 */
	public VkDescriptorSetAllocateInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDescriptorSetAllocateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkDescriptorSetAllocateInfo(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDescriptorSetAllocateInfo(long address){ 
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
	 public static P<VkDescriptorSetAllocateInfo> createNullPointer(){
	        P<VkDescriptorSetAllocateInfo> p = new  P<VkDescriptorSetAllocateInfo>(new VkDescriptorSetAllocateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkDescriptorSetAllocateInfo> getP() {
	       if(p == null ){
	           p = new P<VkDescriptorSetAllocateInfo> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		 int enumVal = sType.getValue();
		 setSType0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = getSType0(super.ptr);
		 this.sType = VkStructureType.fromValue(nativeVal); 
		 return this.sType;
	 }

	/**
	 * Set method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 setPNext0(this.ptr, buff);
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 long pointer = getPNext0(super.ptr);
		 if(pointer == 0){
		    this.pNext = null;
		    return null;
		  } else 
 		 if(this.pNext == null){
		    this.pNext = (VkObject)(new VkHandle(pointer));
		 }else{
		    this.pNext.setPointer(pointer);
		  }
		 return this.pNext;
	 }

	/**
	 * Set method for field descriptorPool	[vkhandle]<br>
	 * Prototype: VkDescriptorPool  descriptorPool
	 */ 
	 public void descriptorPool(VkDescriptorPool descriptorPool){
		 this.descriptorPool = descriptorPool;
		 ByteBuffer buff = (descriptorPool==null) ? null : descriptorPool.getPointer();
		 setDescriptorPool0(this.ptr, buff);
	 }

	/**
	 * Get method for field descriptorPool	[vkhandle]<br>
	 * Prototype: VkDescriptorPool  descriptorPool
	 */ 
	 public VkDescriptorPool descriptorPool(){

		 long handle = getDescriptorPool0(super.ptr);
		 if(handle == 0){
		    this.descriptorPool = null;
		    return null;
		  }  

		 if(this.descriptorPool == null){
		    this.descriptorPool = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.descriptorPool).setPointer(handle);
		  }
		 return this.descriptorPool;
	 }

	/**
	 * Set method for field descriptorSetCount	[int]<br>
	 * Prototype: uint32_t  descriptorSetCount
	 */ 
	 public void descriptorSetCount(int descriptorSetCount){
		 this.descriptorSetCount = descriptorSetCount;
		 setDescriptorSetCount0(this.ptr,  descriptorSetCount);
	 }

	/**
	 * Get method for field descriptorSetCount	[int]<br>
	 * Prototype: uint32_t  descriptorSetCount
	 */ 
	 public int descriptorSetCount(){
		 int var = getDescriptorSetCount0(super.ptr);
		 this.descriptorSetCount = var;
		 return this.descriptorSetCount;
	 }

	/**
	 * Set method for field pSetLayouts	[vkhandle]<br>
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 public void pSetLayouts( VkDescriptorSetLayout  pSetLayouts){
		 this.pSetLayouts = pSetLayouts;
		 ByteBuffer buff = (pSetLayouts==null) ? null : pSetLayouts.getPointer();
		 setPSetLayouts0(this.ptr, buff);
	 }

	/**
	 * Get method for field pSetLayouts	[vkhandle]<br>
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 public  VkDescriptorSetLayout  pSetLayouts(){

		 long handle = getPSetLayouts0(super.ptr);
		 if(handle == 0){
		    this.pSetLayouts = null;
		    return null;
		  }  

		 if(this.pSetLayouts == null){
		    this.pSetLayouts = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.pSetLayouts).setPointer(handle);
		  }
		 return this.pSetLayouts;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field descriptorPool	[vkhandle]<br>
	 * Prototype: VkDescriptorPool  descriptorPool
	 */ 
	 private static native void setDescriptorPool0(Buffer ptr, java.nio.ByteBuffer  _descriptorPool);/*
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  vkObj->descriptorPool = (VkDescriptorPool) (_descriptorPool);
	  */

	/**
	 * native GET method for field descriptorPool	[vkhandle]<br>
	 * Prototype: VkDescriptorPool  descriptorPool
	 */ 
	 private static native long getDescriptorPool0(Buffer ptr);/*
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->descriptorPool);	 */

	/**
	 * native SET method for field descriptorSetCount	[int]<br>
	 * Prototype: uint32_t  descriptorSetCount
	 */ 
	 private static native void setDescriptorSetCount0(Buffer ptr, int _descriptorSetCount);/*
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  vkObj->descriptorSetCount = (uint32_t) (_descriptorSetCount);
	  */

	/**
	 * native GET method for field descriptorSetCount	[int]<br>
	 * Prototype: uint32_t  descriptorSetCount
	 */ 
	 private static native int getDescriptorSetCount0(Buffer ptr);/*
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  return (jint) (vkObj->descriptorSetCount);
	 */

	/**
	 * native SET method for field pSetLayouts	[vkhandle]<br>
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 private static native void setPSetLayouts0(Buffer ptr, java.nio.ByteBuffer  _pSetLayouts);/*
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  vkObj->pSetLayouts = (const VkDescriptorSetLayout*) (_pSetLayouts);
	  */

	/**
	 * native GET method for field pSetLayouts	[vkhandle]<br>
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 private static native long getPSetLayouts0(Buffer ptr);/*
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pSetLayouts);	 */



} // end of class VkDescriptorSetAllocateInfo
