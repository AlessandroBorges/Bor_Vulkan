/**
 * Class wrapping Vulkan's VkPipelineCacheCreateInfo struct.
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
 *  This class is a Java front end for struct VkPipelineCacheCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPipelineCacheCreateInfo {
 *     VkStructureType               sType;
 *     const void*                   pNext;
 *     VkPipelineCacheCreateFlags    flags;
 *     size_t                        initialDataSize;
 *     const void*                   pInitialData;
 * } VkPipelineCacheCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkPipelineCacheCreateInfo extends VkStruct {
	/** TAG of this structure [45]  */
	 private static final String TAG = "VkPipelineCacheCreateInfo";

	/** ID of this structure [45]  */
	 public static final int TAG_ID = VKPIPELINECACHECREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkPipelineCacheCreateInfo> p;

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
	 *  VkPipelineCacheCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  size_t 	initialDataSize	[long]
	 */ 
	 long 	initialDataSize;

	/**
	 *  const void* 	pInitialData	[buffer]
	 */ 
	 java.nio.Buffer 	pInitialData;

	/**
	 * Ctor
	 */
	public VkPipelineCacheCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineCacheCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkPipelineCacheCreateInfo(long address, int memSize){ 
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
	 public static P<VkPipelineCacheCreateInfo> createNullPointer(){
	        P<VkPipelineCacheCreateInfo> p = new  P<VkPipelineCacheCreateInfo>(new VkPipelineCacheCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkPipelineCacheCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkPipelineCacheCreateInfo> (this);
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
	 * Set method for field flags	[int]<br>
	 * Prototype: VkPipelineCacheCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 flags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkPipelineCacheCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = flags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field initialDataSize	[long]<br>
	 * Prototype: size_t  initialDataSize
	 */ 
	 public void initialDataSize(long initialDataSize){
		 this.initialDataSize = initialDataSize;
		 initialDataSize0(this.ptr,  initialDataSize);
	 }

	/**
	 * Get method for field initialDataSize	[long]<br>
	 * Prototype: size_t  initialDataSize
	 */ 
	 public long initialDataSize(){
		 long var = initialDataSize0(super.ptr);
		 this.initialDataSize = var;
		 return this.initialDataSize;
	 }

	/**
	 * Set method for field pInitialData	[buffer]<br>
	 * Prototype: const void*  pInitialData
	 */ 
	 public void pInitialData(java.nio.Buffer pInitialData){
		 this.pInitialData = pInitialData;
		 pInitialData0(this.ptr,  pInitialData);
	 }

	/**
	 * Get method for field pInitialData	[buffer]<br>
	 * Prototype: const void*  pInitialData
	 */ 
	 public java.nio.Buffer pInitialData(){
		 java.nio.Buffer var = pInitialData0(super.ptr);
		 this.pInitialData = var;
		 return this.pInitialData;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkPipelineCacheCreateInfo vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkPipelineCacheCreateInfo vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineCacheCreateFlags  flags
	 */ 
	 private static native void flags0(Buffer ptr, int _flags);/*
		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		  vkObj->flags = (VkPipelineCacheCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineCacheCreateFlags  flags
	 */ 
	 private static native int flags0(Buffer ptr);/*
		  VkPipelineCacheCreateInfo vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field initialDataSize	[long]<br>
	 * Prototype: size_t  initialDataSize
	 */ 
	 private static native void initialDataSize0(Buffer ptr, long _initialDataSize);/*
		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		  vkObj->initialDataSize = (size_t) (_initialDataSize);
	  */

	/**
	 * native GET method for field initialDataSize	[long]<br>
	 * Prototype: size_t  initialDataSize
	 */ 
	 private static native long initialDataSize0(Buffer ptr);/*
		  VkPipelineCacheCreateInfo vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		  return (jlong) (vkObj->initialDataSize);
	 */

	/**
	 * native SET method for field pInitialData	[buffer]<br>
	 * Prototype: const void*  pInitialData
	 */ 
	 private static native void pInitialData0(Buffer ptr, java.nio.Buffer _pInitialData);/*
		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		  vkObj->pInitialData = (const void*) (_pInitialData);
	  */

	/**
	 * native GET method for field pInitialData	[buffer]<br>
	 * Prototype: const void*  pInitialData
	 */ 
	 private static native java.nio.Buffer pInitialData0(Buffer ptr);/*
		  VkPipelineCacheCreateInfo vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		  return (jobject) (vkObj->pInitialData);
	 */



} // end of class VkPipelineCacheCreateInfo
