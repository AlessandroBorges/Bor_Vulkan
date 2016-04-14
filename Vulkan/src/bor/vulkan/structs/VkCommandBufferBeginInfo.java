/**
 * Class wrapping Vulkan's VkCommandBufferBeginInfo struct.
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
 *  This class is a Java front end for struct VkCommandBufferBeginInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkCommandBufferBeginInfo {
 *     VkStructureType                          sType;
 *     const void*                              pNext;
 *     VkCommandBufferUsageFlags                flags;
 *     const VkCommandBufferInheritanceInfo*    pInheritanceInfo;
 * } VkCommandBufferBeginInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkCommandBufferBeginInfo extends VkStruct {
	/** TAG of this structure [89]  */
	 private static final String TAG = "VkCommandBufferBeginInfo";

	/** ID of this structure [89]  */
	 public static final int TAG_ID = VKCOMMANDBUFFERBEGININFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkCommandBufferBeginInfo> p;

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
	 *  VkCommandBufferUsageFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  const VkCommandBufferInheritanceInfo* 	pInheritanceInfo	[vkstruct]
	 */ 
	  VkCommandBufferInheritanceInfo  	pInheritanceInfo;

	/**
	 * Ctor
	 */
	public VkCommandBufferBeginInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkCommandBufferBeginInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkCommandBufferBeginInfo(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkCommandBufferBeginInfo(long address){ 
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
	 public static P<VkCommandBufferBeginInfo> createNullPointer(){
	        P<VkCommandBufferBeginInfo> p = new  P<VkCommandBufferBeginInfo>(new VkCommandBufferBeginInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkCommandBufferBeginInfo> getP() {
	       if(p == null ){
	           p = new P<VkCommandBufferBeginInfo> (this);
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
	 * Prototype: VkCommandBufferUsageFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkCommandBufferUsageFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field pInheritanceInfo	[vkstruct]<br>
	 * Prototype: const VkCommandBufferInheritanceInfo*  pInheritanceInfo
	 */ 
	 public void pInheritanceInfo( VkCommandBufferInheritanceInfo  pInheritanceInfo){
		 this.pInheritanceInfo = pInheritanceInfo;
		 ByteBuffer buff = (pInheritanceInfo==null) ? null : pInheritanceInfo.getPointer();
		 setPInheritanceInfo0(this.ptr, buff);
	 }

	/**
	 * Get method for field pInheritanceInfo	[vkstruct]<br>
	 * Prototype: const VkCommandBufferInheritanceInfo*  pInheritanceInfo
	 */ 
	 public  VkCommandBufferInheritanceInfo  pInheritanceInfo(){
		 long pointer = getPInheritanceInfo0(super.ptr);
		 if(pointer == 0){
		    this.pInheritanceInfo = null;
		    return null;
		  } 

		 if(this.pInheritanceInfo == null){
		    this.pInheritanceInfo = new  VkCommandBufferInheritanceInfo (pointer);
		 }else{
		    this.pInheritanceInfo.setPointer(pointer);
		  }
		 return this.pInheritanceInfo;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkCommandBufferBeginInfo* vkObj = (VkCommandBufferBeginInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkCommandBufferBeginInfo vkObj = (VkCommandBufferBeginInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkCommandBufferBeginInfo* vkObj = (VkCommandBufferBeginInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkCommandBufferBeginInfo vkObj = (VkCommandBufferBeginInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkCommandBufferUsageFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkCommandBufferBeginInfo* vkObj = (VkCommandBufferBeginInfo*)(ptr);
		  vkObj->flags = (VkCommandBufferUsageFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkCommandBufferUsageFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkCommandBufferBeginInfo vkObj = (VkCommandBufferBeginInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field pInheritanceInfo	[vkstruct]<br>
	 * Prototype: const VkCommandBufferInheritanceInfo*  pInheritanceInfo
	 */ 
	 private static native void setPInheritanceInfo0(Buffer ptr, java.nio.ByteBuffer  _pInheritanceInfo);/*
		  VkCommandBufferBeginInfo* vkObj = (VkCommandBufferBeginInfo*)(ptr);
		  vkObj->pInheritanceInfo = (const VkCommandBufferInheritanceInfo*) (_pInheritanceInfo);
	  */

	/**
	 * native GET method for field pInheritanceInfo	[vkstruct]<br>
	 * Prototype: const VkCommandBufferInheritanceInfo*  pInheritanceInfo
	 */ 
	 private static native long getPInheritanceInfo0(Buffer ptr);/*
		  VkCommandBufferBeginInfo vkObj = (VkCommandBufferBeginInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pInheritanceInfo);	 */



} // end of class VkCommandBufferBeginInfo
