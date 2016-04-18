/**
 * Class wrapping Vulkan's VkBindSparseInfo struct.
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
 *  This class is a Java front end for struct VkBindSparseInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkBindSparseInfo {
 *     VkStructureType                             sType;
 *     const void*                                 pNext;
 *     uint32_t                                    waitSemaphoreCount;
 *     const VkSemaphore*                          pWaitSemaphores;
 *     uint32_t                                    bufferBindCount;
 *     const VkSparseBufferMemoryBindInfo*         pBufferBinds;
 *     uint32_t                                    imageOpaqueBindCount;
 *     const VkSparseImageOpaqueMemoryBindInfo*    pImageOpaqueBinds;
 *     uint32_t                                    imageBindCount;
 *     const VkSparseImageMemoryBindInfo*          pImageBinds;
 *     uint32_t                                    signalSemaphoreCount;
 *     const VkSemaphore*                          pSignalSemaphores;
 * } VkBindSparseInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkBindSparseInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [32]  */
	 private static final String TAG = "VkBindSparseInfo";

	/** ID of this structure [32]  */
	 public static final int TAG_ID = VKBINDSPARSEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkBindSparseInfo> p;

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
	 *  uint32_t 	waitSemaphoreCount	[int]
	 */ 
	 int 	waitSemaphoreCount;

	/**
	 *  const VkSemaphore* 	pWaitSemaphores	[vkhandle]
	 */ 
	  VkSemaphore  	pWaitSemaphores;

	/**
	 *  uint32_t 	bufferBindCount	[int]
	 */ 
	 int 	bufferBindCount;

	/**
	 *  const VkSparseBufferMemoryBindInfo* 	pBufferBinds	[vkstruct]
	 */ 
	  VkSparseBufferMemoryBindInfo  	pBufferBinds;

	/**
	 *  uint32_t 	imageOpaqueBindCount	[int]
	 */ 
	 int 	imageOpaqueBindCount;

	/**
	 *  const VkSparseImageOpaqueMemoryBindInfo* 	pImageOpaqueBinds	[vkstruct]
	 */ 
	  VkSparseImageOpaqueMemoryBindInfo  	pImageOpaqueBinds;

	/**
	 *  uint32_t 	imageBindCount	[int]
	 */ 
	 int 	imageBindCount;

	/**
	 *  const VkSparseImageMemoryBindInfo* 	pImageBinds	[vkstruct]
	 */ 
	  VkSparseImageMemoryBindInfo  	pImageBinds;

	/**
	 *  uint32_t 	signalSemaphoreCount	[int]
	 */ 
	 int 	signalSemaphoreCount;

	/**
	 *  const VkSemaphore* 	pSignalSemaphores	[vkhandle]
	 */ 
	  VkSemaphore  	pSignalSemaphores;

	/**
	 * Ctor
	 */
	public VkBindSparseInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkBindSparseInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkBindSparseInfo(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkBindSparseInfo(long address){ 
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
	 public static P<VkBindSparseInfo> createNullPointer(){
	        P<VkBindSparseInfo> p = new  P<VkBindSparseInfo>(new VkBindSparseInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkBindSparseInfo> getP() {
	       if(p == null ){
	           p = new P<VkBindSparseInfo> (this);
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
	 * Set method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 public void waitSemaphoreCount(int waitSemaphoreCount){
		 this.waitSemaphoreCount = waitSemaphoreCount;
		 setWaitSemaphoreCount0(this.ptr,  waitSemaphoreCount);
	 }

	/**
	 * Get method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 public int waitSemaphoreCount(){
		 int var = getWaitSemaphoreCount0(super.ptr);
		 this.waitSemaphoreCount = var;
		 return this.waitSemaphoreCount;
	 }

	/**
	 * Set method for field pWaitSemaphores	[vkhandle]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 public void pWaitSemaphores( VkSemaphore  pWaitSemaphores){
		 this.pWaitSemaphores = pWaitSemaphores;
		 ByteBuffer buff = (pWaitSemaphores==null) ? null : pWaitSemaphores.getPointer();
		 setPWaitSemaphores0(this.ptr, buff);
	 }

	/**
	 * Get method for field pWaitSemaphores	[vkhandle]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 public  VkSemaphore  pWaitSemaphores(){

		 long handle = getPWaitSemaphores0(super.ptr);
		 if(handle == 0){
		    this.pWaitSemaphores = null;
		    return null;
		  }  

		 if(this.pWaitSemaphores == null){
		    this.pWaitSemaphores = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.pWaitSemaphores).setPointer(handle);
		  }
		 return this.pWaitSemaphores;
	 }

	/**
	 * Set method for field bufferBindCount	[int]<br>
	 * Prototype: uint32_t  bufferBindCount
	 */ 
	 public void bufferBindCount(int bufferBindCount){
		 this.bufferBindCount = bufferBindCount;
		 setBufferBindCount0(this.ptr,  bufferBindCount);
	 }

	/**
	 * Get method for field bufferBindCount	[int]<br>
	 * Prototype: uint32_t  bufferBindCount
	 */ 
	 public int bufferBindCount(){
		 int var = getBufferBindCount0(super.ptr);
		 this.bufferBindCount = var;
		 return this.bufferBindCount;
	 }

	/**
	 * Set method for field pBufferBinds	[vkstruct]<br>
	 * Prototype: const VkSparseBufferMemoryBindInfo*  pBufferBinds
	 */ 
	 public void pBufferBinds( VkSparseBufferMemoryBindInfo  pBufferBinds){
		 this.pBufferBinds = pBufferBinds;
		 ByteBuffer buff = (pBufferBinds==null) ? null : pBufferBinds.getPointer();
		 setPBufferBinds0(this.ptr, buff);
	 }

	/**
	 * Get method for field pBufferBinds	[vkstruct]<br>
	 * Prototype: const VkSparseBufferMemoryBindInfo*  pBufferBinds
	 */ 
	 public  VkSparseBufferMemoryBindInfo  pBufferBinds(){
		 long pointer = getPBufferBinds0(super.ptr);
		 if(pointer == 0){
		    this.pBufferBinds = null;
		    return null;
		  } 

		 if(this.pBufferBinds == null){
		    this.pBufferBinds = new  VkSparseBufferMemoryBindInfo (pointer);
		 }else{
		    this.pBufferBinds.setPointer(pointer);
		  }
		 return this.pBufferBinds;
	 }

	/**
	 * Set method for field imageOpaqueBindCount	[int]<br>
	 * Prototype: uint32_t  imageOpaqueBindCount
	 */ 
	 public void imageOpaqueBindCount(int imageOpaqueBindCount){
		 this.imageOpaqueBindCount = imageOpaqueBindCount;
		 setImageOpaqueBindCount0(this.ptr,  imageOpaqueBindCount);
	 }

	/**
	 * Get method for field imageOpaqueBindCount	[int]<br>
	 * Prototype: uint32_t  imageOpaqueBindCount
	 */ 
	 public int imageOpaqueBindCount(){
		 int var = getImageOpaqueBindCount0(super.ptr);
		 this.imageOpaqueBindCount = var;
		 return this.imageOpaqueBindCount;
	 }

	/**
	 * Set method for field pImageOpaqueBinds	[vkstruct]<br>
	 * Prototype: const VkSparseImageOpaqueMemoryBindInfo*  pImageOpaqueBinds
	 */ 
	 public void pImageOpaqueBinds( VkSparseImageOpaqueMemoryBindInfo  pImageOpaqueBinds){
		 this.pImageOpaqueBinds = pImageOpaqueBinds;
		 ByteBuffer buff = (pImageOpaqueBinds==null) ? null : pImageOpaqueBinds.getPointer();
		 setPImageOpaqueBinds0(this.ptr, buff);
	 }

	/**
	 * Get method for field pImageOpaqueBinds	[vkstruct]<br>
	 * Prototype: const VkSparseImageOpaqueMemoryBindInfo*  pImageOpaqueBinds
	 */ 
	 public  VkSparseImageOpaqueMemoryBindInfo  pImageOpaqueBinds(){
		 long pointer = getPImageOpaqueBinds0(super.ptr);
		 if(pointer == 0){
		    this.pImageOpaqueBinds = null;
		    return null;
		  } 

		 if(this.pImageOpaqueBinds == null){
		    this.pImageOpaqueBinds = new  VkSparseImageOpaqueMemoryBindInfo (pointer);
		 }else{
		    this.pImageOpaqueBinds.setPointer(pointer);
		  }
		 return this.pImageOpaqueBinds;
	 }

	/**
	 * Set method for field imageBindCount	[int]<br>
	 * Prototype: uint32_t  imageBindCount
	 */ 
	 public void imageBindCount(int imageBindCount){
		 this.imageBindCount = imageBindCount;
		 setImageBindCount0(this.ptr,  imageBindCount);
	 }

	/**
	 * Get method for field imageBindCount	[int]<br>
	 * Prototype: uint32_t  imageBindCount
	 */ 
	 public int imageBindCount(){
		 int var = getImageBindCount0(super.ptr);
		 this.imageBindCount = var;
		 return this.imageBindCount;
	 }

	/**
	 * Set method for field pImageBinds	[vkstruct]<br>
	 * Prototype: const VkSparseImageMemoryBindInfo*  pImageBinds
	 */ 
	 public void pImageBinds( VkSparseImageMemoryBindInfo  pImageBinds){
		 this.pImageBinds = pImageBinds;
		 ByteBuffer buff = (pImageBinds==null) ? null : pImageBinds.getPointer();
		 setPImageBinds0(this.ptr, buff);
	 }

	/**
	 * Get method for field pImageBinds	[vkstruct]<br>
	 * Prototype: const VkSparseImageMemoryBindInfo*  pImageBinds
	 */ 
	 public  VkSparseImageMemoryBindInfo  pImageBinds(){
		 long pointer = getPImageBinds0(super.ptr);
		 if(pointer == 0){
		    this.pImageBinds = null;
		    return null;
		  } 

		 if(this.pImageBinds == null){
		    this.pImageBinds = new  VkSparseImageMemoryBindInfo (pointer);
		 }else{
		    this.pImageBinds.setPointer(pointer);
		  }
		 return this.pImageBinds;
	 }

	/**
	 * Set method for field signalSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 public void signalSemaphoreCount(int signalSemaphoreCount){
		 this.signalSemaphoreCount = signalSemaphoreCount;
		 setSignalSemaphoreCount0(this.ptr,  signalSemaphoreCount);
	 }

	/**
	 * Get method for field signalSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 public int signalSemaphoreCount(){
		 int var = getSignalSemaphoreCount0(super.ptr);
		 this.signalSemaphoreCount = var;
		 return this.signalSemaphoreCount;
	 }

	/**
	 * Set method for field pSignalSemaphores	[vkhandle]<br>
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 public void pSignalSemaphores( VkSemaphore  pSignalSemaphores){
		 this.pSignalSemaphores = pSignalSemaphores;
		 ByteBuffer buff = (pSignalSemaphores==null) ? null : pSignalSemaphores.getPointer();
		 setPSignalSemaphores0(this.ptr, buff);
	 }

	/**
	 * Get method for field pSignalSemaphores	[vkhandle]<br>
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 public  VkSemaphore  pSignalSemaphores(){

		 long handle = getPSignalSemaphores0(super.ptr);
		 if(handle == 0){
		    this.pSignalSemaphores = null;
		    return null;
		  }  

		 if(this.pSignalSemaphores == null){
		    this.pSignalSemaphores = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.pSignalSemaphores).setPointer(handle);
		  }
		 return this.pSignalSemaphores;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 private static native void setWaitSemaphoreCount0(Buffer ptr, int _waitSemaphoreCount);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  vkObj->waitSemaphoreCount = (uint32_t) (_waitSemaphoreCount);
	  */

	/**
	 * native GET method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 private static native int getWaitSemaphoreCount0(Buffer ptr);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  return (jint) (vkObj->waitSemaphoreCount);
	 */

	/**
	 * native SET method for field pWaitSemaphores	[vkhandle]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 private static native void setPWaitSemaphores0(Buffer ptr, java.nio.ByteBuffer  _pWaitSemaphores);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  vkObj->pWaitSemaphores = (const VkSemaphore*) (_pWaitSemaphores);
	  */

	/**
	 * native GET method for field pWaitSemaphores	[vkhandle]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 private static native long getPWaitSemaphores0(Buffer ptr);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pWaitSemaphores);	 */

	/**
	 * native SET method for field bufferBindCount	[int]<br>
	 * Prototype: uint32_t  bufferBindCount
	 */ 
	 private static native void setBufferBindCount0(Buffer ptr, int _bufferBindCount);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  vkObj->bufferBindCount = (uint32_t) (_bufferBindCount);
	  */

	/**
	 * native GET method for field bufferBindCount	[int]<br>
	 * Prototype: uint32_t  bufferBindCount
	 */ 
	 private static native int getBufferBindCount0(Buffer ptr);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  return (jint) (vkObj->bufferBindCount);
	 */

	/**
	 * native SET method for field pBufferBinds	[vkstruct]<br>
	 * Prototype: const VkSparseBufferMemoryBindInfo*  pBufferBinds
	 */ 
	 private static native void setPBufferBinds0(Buffer ptr, java.nio.ByteBuffer  _pBufferBinds);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  vkObj->pBufferBinds = (const VkSparseBufferMemoryBindInfo*) (_pBufferBinds);
	  */

	/**
	 * native GET method for field pBufferBinds	[vkstruct]<br>
	 * Prototype: const VkSparseBufferMemoryBindInfo*  pBufferBinds
	 */ 
	 private static native long getPBufferBinds0(Buffer ptr);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pBufferBinds);	 */

	/**
	 * native SET method for field imageOpaqueBindCount	[int]<br>
	 * Prototype: uint32_t  imageOpaqueBindCount
	 */ 
	 private static native void setImageOpaqueBindCount0(Buffer ptr, int _imageOpaqueBindCount);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  vkObj->imageOpaqueBindCount = (uint32_t) (_imageOpaqueBindCount);
	  */

	/**
	 * native GET method for field imageOpaqueBindCount	[int]<br>
	 * Prototype: uint32_t  imageOpaqueBindCount
	 */ 
	 private static native int getImageOpaqueBindCount0(Buffer ptr);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  return (jint) (vkObj->imageOpaqueBindCount);
	 */

	/**
	 * native SET method for field pImageOpaqueBinds	[vkstruct]<br>
	 * Prototype: const VkSparseImageOpaqueMemoryBindInfo*  pImageOpaqueBinds
	 */ 
	 private static native void setPImageOpaqueBinds0(Buffer ptr, java.nio.ByteBuffer  _pImageOpaqueBinds);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  vkObj->pImageOpaqueBinds = (const VkSparseImageOpaqueMemoryBindInfo*) (_pImageOpaqueBinds);
	  */

	/**
	 * native GET method for field pImageOpaqueBinds	[vkstruct]<br>
	 * Prototype: const VkSparseImageOpaqueMemoryBindInfo*  pImageOpaqueBinds
	 */ 
	 private static native long getPImageOpaqueBinds0(Buffer ptr);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pImageOpaqueBinds);	 */

	/**
	 * native SET method for field imageBindCount	[int]<br>
	 * Prototype: uint32_t  imageBindCount
	 */ 
	 private static native void setImageBindCount0(Buffer ptr, int _imageBindCount);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  vkObj->imageBindCount = (uint32_t) (_imageBindCount);
	  */

	/**
	 * native GET method for field imageBindCount	[int]<br>
	 * Prototype: uint32_t  imageBindCount
	 */ 
	 private static native int getImageBindCount0(Buffer ptr);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  return (jint) (vkObj->imageBindCount);
	 */

	/**
	 * native SET method for field pImageBinds	[vkstruct]<br>
	 * Prototype: const VkSparseImageMemoryBindInfo*  pImageBinds
	 */ 
	 private static native void setPImageBinds0(Buffer ptr, java.nio.ByteBuffer  _pImageBinds);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  vkObj->pImageBinds = (const VkSparseImageMemoryBindInfo*) (_pImageBinds);
	  */

	/**
	 * native GET method for field pImageBinds	[vkstruct]<br>
	 * Prototype: const VkSparseImageMemoryBindInfo*  pImageBinds
	 */ 
	 private static native long getPImageBinds0(Buffer ptr);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pImageBinds);	 */

	/**
	 * native SET method for field signalSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 private static native void setSignalSemaphoreCount0(Buffer ptr, int _signalSemaphoreCount);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  vkObj->signalSemaphoreCount = (uint32_t) (_signalSemaphoreCount);
	  */

	/**
	 * native GET method for field signalSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 private static native int getSignalSemaphoreCount0(Buffer ptr);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  return (jint) (vkObj->signalSemaphoreCount);
	 */

	/**
	 * native SET method for field pSignalSemaphores	[vkhandle]<br>
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 private static native void setPSignalSemaphores0(Buffer ptr, java.nio.ByteBuffer  _pSignalSemaphores);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  vkObj->pSignalSemaphores = (const VkSemaphore*) (_pSignalSemaphores);
	  */

	/**
	 * native GET method for field pSignalSemaphores	[vkhandle]<br>
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 private static native long getPSignalSemaphores0(Buffer ptr);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pSignalSemaphores);	 */



} // end of class VkBindSparseInfo
