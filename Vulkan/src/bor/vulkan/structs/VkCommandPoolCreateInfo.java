/**
 * Class wrapping Vulkan's VkCommandPoolCreateInfo struct.
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
 *  This class is a Java front end for struct VkCommandPoolCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkCommandPoolCreateInfo {
 *     VkStructureType             sType;
 *     const void*                 pNext;
 *     VkCommandPoolCreateFlags    flags;
 *     uint32_t                    queueFamilyIndex;
 * } VkCommandPoolCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkCommandPoolCreateInfo extends VkStruct {
	/** TAG of this structure [86]  */
	 private static final String TAG = "VkCommandPoolCreateInfo";

	/** ID of this structure [86]  */
	 public static final int TAG_ID = VKCOMMANDPOOLCREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkCommandPoolCreateInfo> p;

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
	 *  VkCommandPoolCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  uint32_t 	queueFamilyIndex	[int]
	 */ 
	 int 	queueFamilyIndex;

	/**
	 * Ctor
	 */
	public VkCommandPoolCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkCommandPoolCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkCommandPoolCreateInfo(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkCommandPoolCreateInfo(long address){ 
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
	 public static P<VkCommandPoolCreateInfo> createNullPointer(){
	        P<VkCommandPoolCreateInfo> p = new  P<VkCommandPoolCreateInfo>(new VkCommandPoolCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkCommandPoolCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkCommandPoolCreateInfo> (this);
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
	 * Prototype: VkCommandPoolCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkCommandPoolCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field queueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndex
	 */ 
	 public void queueFamilyIndex(int queueFamilyIndex){
		 this.queueFamilyIndex = queueFamilyIndex;
		 setQueueFamilyIndex0(this.ptr,  queueFamilyIndex);
	 }

	/**
	 * Get method for field queueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndex
	 */ 
	 public int queueFamilyIndex(){
		 int var = getQueueFamilyIndex0(super.ptr);
		 this.queueFamilyIndex = var;
		 return this.queueFamilyIndex;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkCommandPoolCreateInfo* vkObj = (VkCommandPoolCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkCommandPoolCreateInfo vkObj = (VkCommandPoolCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkCommandPoolCreateInfo* vkObj = (VkCommandPoolCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkCommandPoolCreateInfo vkObj = (VkCommandPoolCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkCommandPoolCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkCommandPoolCreateInfo* vkObj = (VkCommandPoolCreateInfo*)(ptr);
		  vkObj->flags = (VkCommandPoolCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkCommandPoolCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkCommandPoolCreateInfo vkObj = (VkCommandPoolCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field queueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndex
	 */ 
	 private static native void setQueueFamilyIndex0(Buffer ptr, int _queueFamilyIndex);/*
		  VkCommandPoolCreateInfo* vkObj = (VkCommandPoolCreateInfo*)(ptr);
		  vkObj->queueFamilyIndex = (uint32_t) (_queueFamilyIndex);
	  */

	/**
	 * native GET method for field queueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndex
	 */ 
	 private static native int getQueueFamilyIndex0(Buffer ptr);/*
		  VkCommandPoolCreateInfo vkObj = (VkCommandPoolCreateInfo*)(ptr);
		  return (jint) (vkObj->queueFamilyIndex);
	 */



} // end of class VkCommandPoolCreateInfo
