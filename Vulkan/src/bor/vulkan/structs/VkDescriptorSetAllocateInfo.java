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
		 super(sizeOf()); 
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
	 public VkDescriptorSetAllocateInfo(long address, int memSize){ 
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
		 sType0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = sType0(super.ptr);
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
		 pNext0(this.ptr, buff);
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 ByteBuffer pointer = pNext0(super.ptr);
		 if(pointer == null){
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
		 ByteBuffer buff = (descriptorPool==null) ? null : descriptorPool.getHandle();
		 descriptorPool0(this.ptr, buff);
	 }

	/**
	 * Get method for field descriptorPool	[vkhandle]<br>
	 * Prototype: VkDescriptorPool  descriptorPool
	 */ 
	 public VkDescriptorPool descriptorPool(){

		 ByteBuffer handle = descriptorPool0(super.ptr);
		 if(handle == null){
		    this.descriptorPool = null;
		    return null;
		  } else 
 		 if(this.descriptorPool == null){
		    this.descriptorPool = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.descriptorPool).setHandle(handle);
		  }
		 return this.descriptorPool;
	 }

	/**
	 * Set method for field descriptorSetCount	[int]<br>
	 * Prototype: uint32_t  descriptorSetCount
	 */ 
	 public void descriptorSetCount(int descriptorSetCount){
		 this.descriptorSetCount = descriptorSetCount;
		 descriptorSetCount0(this.ptr,  descriptorSetCount);
	 }

	/**
	 * Get method for field descriptorSetCount	[int]<br>
	 * Prototype: uint32_t  descriptorSetCount
	 */ 
	 public int descriptorSetCount(){
		 int var = descriptorSetCount0(super.ptr);
		 this.descriptorSetCount = var;
		 return this.descriptorSetCount;
	 }

	/**
	 * Set method for field pSetLayouts	[vkhandle]<br>
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 public void pSetLayouts( VkDescriptorSetLayout  pSetLayouts){
		 this.pSetLayouts = pSetLayouts;
		 ByteBuffer buff = (pSetLayouts==null) ? null : pSetLayouts.getHandle();
		 pSetLayouts0(this.ptr, buff);
	 }

	/**
	 * Get method for field pSetLayouts	[vkhandle]<br>
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 public  VkDescriptorSetLayout  pSetLayouts(){

		 ByteBuffer handle = pSetLayouts0(super.ptr);
		 if(handle == null){
		    this.pSetLayouts = null;
		    return null;
		  } else 
 		 if(this.pSetLayouts == null){
		    this.pSetLayouts = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.pSetLayouts).setHandle(handle);
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
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkDescriptorSetAllocateInfo vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkDescriptorSetAllocateInfo vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field descriptorPool	[vkhandle]<br>
	 * Prototype: VkDescriptorPool  descriptorPool
	 */ 
	 private static native void descriptorPool0(Buffer ptr, java.nio.ByteBuffer  _descriptorPool);/*
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  vkObj->descriptorPool = (VkDescriptorPool) (_descriptorPool);
	  */

	/**
	 * native GET method for field descriptorPool	[vkhandle]<br>
	 * Prototype: VkDescriptorPool  descriptorPool
	 */ 
	 private static native java.nio.ByteBuffer  descriptorPool0(Buffer ptr);/*
		  VkDescriptorSetAllocateInfo vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  return (VkDescriptorPool) (vkObj->descriptorPool);
	 */

	/**
	 * native SET method for field descriptorSetCount	[int]<br>
	 * Prototype: uint32_t  descriptorSetCount
	 */ 
	 private static native void descriptorSetCount0(Buffer ptr, int _descriptorSetCount);/*
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  vkObj->descriptorSetCount = (uint32_t) (_descriptorSetCount);
	  */

	/**
	 * native GET method for field descriptorSetCount	[int]<br>
	 * Prototype: uint32_t  descriptorSetCount
	 */ 
	 private static native int descriptorSetCount0(Buffer ptr);/*
		  VkDescriptorSetAllocateInfo vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  return (jint) (vkObj->descriptorSetCount);
	 */

	/**
	 * native SET method for field pSetLayouts	[vkhandle]<br>
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 private static native void pSetLayouts0(Buffer ptr, java.nio.ByteBuffer  _pSetLayouts);/*
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  vkObj->pSetLayouts = (const VkDescriptorSetLayout*) (_pSetLayouts);
	  */

	/**
	 * native GET method for field pSetLayouts	[vkhandle]<br>
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 private static native java.nio.ByteBuffer  pSetLayouts0(Buffer ptr);/*
		  VkDescriptorSetAllocateInfo vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  return ( VkDescriptorSetLayout ) (vkObj->pSetLayouts);
	 */



} // end of class VkDescriptorSetAllocateInfo
