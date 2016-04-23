/**
 * Class wrapping Vulkan's VkDescriptorSetLayoutCreateInfo struct.
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
 *  This class is a Java front end for struct VkDescriptorSetLayoutCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDescriptorSetLayoutCreateInfo {
 *     VkStructureType                        sType;
 *     const void*                            pNext;
 *     VkDescriptorSetLayoutCreateFlags       flags;
 *     uint32_t                               bindingCount;
 *     const VkDescriptorSetLayoutBinding*    pBindings;
 * } VkDescriptorSetLayoutCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkDescriptorSetLayoutCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [72]  */
	 private static final String TAG = "VkDescriptorSetLayoutCreateInfo";

	/** ID of this structure [72]  */
	 public static final int TAG_ID = VKDESCRIPTORSETLAYOUTCREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkDescriptorSetLayoutCreateInfo> p;

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
	 *  VkDescriptorSetLayoutCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  uint32_t 	bindingCount	[int]
	 */ 
	 int 	bindingCount;

	/**
	 *  const VkDescriptorSetLayoutBinding* 	pBindings	[vkstruct]
	 */ 
	  VkDescriptorSetLayoutBinding  	pBindings;

	/**
	 * Ctor
	 */
	public VkDescriptorSetLayoutCreateInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDescriptorSetLayoutCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkDescriptorSetLayoutCreateInfo(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDescriptorSetLayoutCreateInfo(long address){ 
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
	 public static P<VkDescriptorSetLayoutCreateInfo> createNullPointer(){
	        P<VkDescriptorSetLayoutCreateInfo> p = new  P<VkDescriptorSetLayoutCreateInfo>(new VkDescriptorSetLayoutCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkDescriptorSetLayoutCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkDescriptorSetLayoutCreateInfo> (this);
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
	 * Set method for field flags	[int]<br>
	 * Prototype: VkDescriptorSetLayoutCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkDescriptorSetLayoutCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field bindingCount	[int]<br>
	 * Prototype: uint32_t  bindingCount
	 */ 
	 public void bindingCount(int bindingCount){
		 this.bindingCount = bindingCount;
		 setBindingCount0(this.ptr,  bindingCount);
	 }

	/**
	 * Get method for field bindingCount	[int]<br>
	 * Prototype: uint32_t  bindingCount
	 */ 
	 public int bindingCount(){
		 int var = getBindingCount0(super.ptr);
		 this.bindingCount = var;
		 return this.bindingCount;
	 }

	/**
	 * Set method for field pBindings	[vkstruct]<br>
	 * Prototype: const VkDescriptorSetLayoutBinding*  pBindings
	 */ 
	 public void pBindings( VkDescriptorSetLayoutBinding  pBindings){
		 this.pBindings = pBindings;
		 ByteBuffer buff = (pBindings==null) ? null : pBindings.getPointer();
		 setPBindings0(this.ptr, buff);
	 }

	/**
	 * Get method for field pBindings	[vkstruct]<br>
	 * Prototype: const VkDescriptorSetLayoutBinding*  pBindings
	 */ 
	 public  VkDescriptorSetLayoutBinding  pBindings(){
		 long pointer = getPBindings0(super.ptr);
		 if(pointer == 0){
		    this.pBindings = null;
		    return null;
		  } 

		 if(this.pBindings == null){
		    this.pBindings = new  VkDescriptorSetLayoutBinding (pointer);
		 }else{
		    this.pBindings.setPointer(pointer);
		  }
		 return this.pBindings;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkDescriptorSetLayoutCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  vkObj->flags = (VkDescriptorSetLayoutCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkDescriptorSetLayoutCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field bindingCount	[int]<br>
	 * Prototype: uint32_t  bindingCount
	 */ 
	 private static native void setBindingCount0(Buffer ptr, int _bindingCount);/*
		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  vkObj->bindingCount = (uint32_t) (_bindingCount);
	  */

	/**
	 * native GET method for field bindingCount	[int]<br>
	 * Prototype: uint32_t  bindingCount
	 */ 
	 private static native int getBindingCount0(Buffer ptr);/*
		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  return (jint) (vkObj->bindingCount);
	 */

	/**
	 * native SET method for field pBindings	[vkstruct]<br>
	 * Prototype: const VkDescriptorSetLayoutBinding*  pBindings
	 */ 
	 private static native void setPBindings0(Buffer ptr, java.nio.ByteBuffer  _pBindings);/*
		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  vkObj->pBindings = (const VkDescriptorSetLayoutBinding*) (_pBindings);
	  */

	/**
	 * native GET method for field pBindings	[vkstruct]<br>
	 * Prototype: const VkDescriptorSetLayoutBinding*  pBindings
	 */ 
	 private static native long getPBindings0(Buffer ptr);/*
		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pBindings);	 */



} // end of class VkDescriptorSetLayoutCreateInfo
