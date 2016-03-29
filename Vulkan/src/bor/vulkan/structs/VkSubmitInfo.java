/**
 * Class wrapping Vulkan's VkSubmitInfo struct.
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
 *  This class is a Java front end for struct VkSubmitInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSubmitInfo {
 *     VkStructureType                sType;
 *     const void*                    pNext;
 *     uint32_t                       waitSemaphoreCount;
 *     const VkSemaphore*             pWaitSemaphores;
 *     const VkPipelineStageFlags*    pWaitDstStageMask;
 *     uint32_t                       commandBufferCount;
 *     const VkCommandBuffer*         pCommandBuffers;
 *     uint32_t                       signalSemaphoreCount;
 *     const VkSemaphore*             pSignalSemaphores;
 * } VkSubmitInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkSubmitInfo extends VkStruct {
	/** TAG of this structure [19]  */
	 private static final String TAG = "VkSubmitInfo";

	/** ID of this structure [19]  */
	 public static final int TAG_ID = VKSUBMITINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkSubmitInfo> p;

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
	 *  const VkPipelineStageFlags* 	pWaitDstStageMask	[pinteger]
	 */ 
	 PInteger 	pWaitDstStageMask;

	/**
	 *  uint32_t 	commandBufferCount	[int]
	 */ 
	 int 	commandBufferCount;

	/**
	 *  const VkCommandBuffer* 	pCommandBuffers	[vkhandle]
	 */ 
	  VkCommandBuffer  	pCommandBuffers;

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
	public VkSubmitInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSubmitInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkSubmitInfo(long address, int memSize){ 
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
	 public static P<VkSubmitInfo> createNullPointer(){
	        P<VkSubmitInfo> p = new  P<VkSubmitInfo>(new VkSubmitInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkSubmitInfo> getP() {
	       if(p == null ){
	           p = new P<VkSubmitInfo> (this);
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
	 * Set method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 public void waitSemaphoreCount(int waitSemaphoreCount){
		 this.waitSemaphoreCount = waitSemaphoreCount;
		 waitSemaphoreCount0(this.ptr,  waitSemaphoreCount);
	 }

	/**
	 * Get method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 public int waitSemaphoreCount(){
		 int var = waitSemaphoreCount0(super.ptr);
		 this.waitSemaphoreCount = var;
		 return this.waitSemaphoreCount;
	 }

	/**
	 * Set method for field pWaitSemaphores	[vkhandle]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 public void pWaitSemaphores( VkSemaphore  pWaitSemaphores){
		 this.pWaitSemaphores = pWaitSemaphores;
		 ByteBuffer buff = (pWaitSemaphores==null) ? null : pWaitSemaphores.getHandle();
		 pWaitSemaphores0(this.ptr, buff);
	 }

	/**
	 * Get method for field pWaitSemaphores	[vkhandle]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 public  VkSemaphore  pWaitSemaphores(){

		 ByteBuffer handle = pWaitSemaphores0(super.ptr);
		 if(handle == null){
		    this.pWaitSemaphores = null;
		    return null;
		  } else 
 		 if(this.pWaitSemaphores == null){
		    this.pWaitSemaphores = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.pWaitSemaphores).setHandle(handle);
		  }
		 return this.pWaitSemaphores;
	 }

	/**
	 * Set method for field pWaitDstStageMask	[pinteger]<br>
	 * Prototype: const VkPipelineStageFlags*  pWaitDstStageMask
	 */ 
	 public void pWaitDstStageMask(PInteger pWaitDstStageMask){
		 this.pWaitDstStageMask = pWaitDstStageMask;
		 pWaitDstStageMask0(this.ptr,  pWaitDstStageMask);
	 }

	/**
	 * Get method for field pWaitDstStageMask	[pinteger]<br>
	 * Prototype: const VkPipelineStageFlags*  pWaitDstStageMask
	 */ 
	 public PInteger pWaitDstStageMask(){
		 PInteger var = pWaitDstStageMask0(super.ptr);
		 this.pWaitDstStageMask = var;
		 return this.pWaitDstStageMask;
	 }

	/**
	 * Set method for field commandBufferCount	[int]<br>
	 * Prototype: uint32_t  commandBufferCount
	 */ 
	 public void commandBufferCount(int commandBufferCount){
		 this.commandBufferCount = commandBufferCount;
		 commandBufferCount0(this.ptr,  commandBufferCount);
	 }

	/**
	 * Get method for field commandBufferCount	[int]<br>
	 * Prototype: uint32_t  commandBufferCount
	 */ 
	 public int commandBufferCount(){
		 int var = commandBufferCount0(super.ptr);
		 this.commandBufferCount = var;
		 return this.commandBufferCount;
	 }

	/**
	 * Set method for field pCommandBuffers	[vkhandle]<br>
	 * Prototype: const VkCommandBuffer*  pCommandBuffers
	 */ 
	 public void pCommandBuffers( VkCommandBuffer  pCommandBuffers){
		 this.pCommandBuffers = pCommandBuffers;
		 ByteBuffer buff = (pCommandBuffers==null) ? null : pCommandBuffers.getHandle();
		 pCommandBuffers0(this.ptr, buff);
	 }

	/**
	 * Get method for field pCommandBuffers	[vkhandle]<br>
	 * Prototype: const VkCommandBuffer*  pCommandBuffers
	 */ 
	 public  VkCommandBuffer  pCommandBuffers(){

		 ByteBuffer handle = pCommandBuffers0(super.ptr);
		 if(handle == null){
		    this.pCommandBuffers = null;
		    return null;
		  } else 
 		 if(this.pCommandBuffers == null){
		    this.pCommandBuffers = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.pCommandBuffers).setHandle(handle);
		  }
		 return this.pCommandBuffers;
	 }

	/**
	 * Set method for field signalSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 public void signalSemaphoreCount(int signalSemaphoreCount){
		 this.signalSemaphoreCount = signalSemaphoreCount;
		 signalSemaphoreCount0(this.ptr,  signalSemaphoreCount);
	 }

	/**
	 * Get method for field signalSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 public int signalSemaphoreCount(){
		 int var = signalSemaphoreCount0(super.ptr);
		 this.signalSemaphoreCount = var;
		 return this.signalSemaphoreCount;
	 }

	/**
	 * Set method for field pSignalSemaphores	[vkhandle]<br>
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 public void pSignalSemaphores( VkSemaphore  pSignalSemaphores){
		 this.pSignalSemaphores = pSignalSemaphores;
		 ByteBuffer buff = (pSignalSemaphores==null) ? null : pSignalSemaphores.getHandle();
		 pSignalSemaphores0(this.ptr, buff);
	 }

	/**
	 * Get method for field pSignalSemaphores	[vkhandle]<br>
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 public  VkSemaphore  pSignalSemaphores(){

		 ByteBuffer handle = pSignalSemaphores0(super.ptr);
		 if(handle == null){
		    this.pSignalSemaphores = null;
		    return null;
		  } else 
 		 if(this.pSignalSemaphores == null){
		    this.pSignalSemaphores = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.pSignalSemaphores).setHandle(handle);
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
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkSubmitInfo vkObj = (VkSubmitInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkSubmitInfo vkObj = (VkSubmitInfo*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 private static native void waitSemaphoreCount0(Buffer ptr, int _waitSemaphoreCount);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  vkObj->waitSemaphoreCount = (uint32_t) (_waitSemaphoreCount);
	  */

	/**
	 * native GET method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 private static native int waitSemaphoreCount0(Buffer ptr);/*
		  VkSubmitInfo vkObj = (VkSubmitInfo*)(ptr);
		  return (jint) (vkObj->waitSemaphoreCount);
	 */

	/**
	 * native SET method for field pWaitSemaphores	[vkhandle]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 private static native void pWaitSemaphores0(Buffer ptr, java.nio.ByteBuffer  _pWaitSemaphores);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  vkObj->pWaitSemaphores = (const VkSemaphore*) (_pWaitSemaphores);
	  */

	/**
	 * native GET method for field pWaitSemaphores	[vkhandle]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 private static native java.nio.ByteBuffer  pWaitSemaphores0(Buffer ptr);/*
		  VkSubmitInfo vkObj = (VkSubmitInfo*)(ptr);
		  return ( VkSemaphore ) (vkObj->pWaitSemaphores);
	 */

	/**
	 * native SET method for field pWaitDstStageMask	[pinteger]<br>
	 * Prototype: const VkPipelineStageFlags*  pWaitDstStageMask
	 */ 
	 private static native void pWaitDstStageMask0(Buffer ptr, PInteger _pWaitDstStageMask);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  vkObj->pWaitDstStageMask = (const VkPipelineStageFlags*) (_pWaitDstStageMask);
	  */

	/**
	 * native GET method for field pWaitDstStageMask	[pinteger]<br>
	 * Prototype: const VkPipelineStageFlags*  pWaitDstStageMask
	 */ 
	 private static native PInteger pWaitDstStageMask0(Buffer ptr);/*
		  VkSubmitInfo vkObj = (VkSubmitInfo*)(ptr);
		  return (PInteger) (vkObj->pWaitDstStageMask);
	 */

	/**
	 * native SET method for field commandBufferCount	[int]<br>
	 * Prototype: uint32_t  commandBufferCount
	 */ 
	 private static native void commandBufferCount0(Buffer ptr, int _commandBufferCount);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  vkObj->commandBufferCount = (uint32_t) (_commandBufferCount);
	  */

	/**
	 * native GET method for field commandBufferCount	[int]<br>
	 * Prototype: uint32_t  commandBufferCount
	 */ 
	 private static native int commandBufferCount0(Buffer ptr);/*
		  VkSubmitInfo vkObj = (VkSubmitInfo*)(ptr);
		  return (jint) (vkObj->commandBufferCount);
	 */

	/**
	 * native SET method for field pCommandBuffers	[vkhandle]<br>
	 * Prototype: const VkCommandBuffer*  pCommandBuffers
	 */ 
	 private static native void pCommandBuffers0(Buffer ptr, java.nio.ByteBuffer  _pCommandBuffers);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  vkObj->pCommandBuffers = (const VkCommandBuffer*) (_pCommandBuffers);
	  */

	/**
	 * native GET method for field pCommandBuffers	[vkhandle]<br>
	 * Prototype: const VkCommandBuffer*  pCommandBuffers
	 */ 
	 private static native java.nio.ByteBuffer  pCommandBuffers0(Buffer ptr);/*
		  VkSubmitInfo vkObj = (VkSubmitInfo*)(ptr);
		  return (jobject) (vkObj->pCommandBuffers);
	 */

	/**
	 * native SET method for field signalSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 private static native void signalSemaphoreCount0(Buffer ptr, int _signalSemaphoreCount);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  vkObj->signalSemaphoreCount = (uint32_t) (_signalSemaphoreCount);
	  */

	/**
	 * native GET method for field signalSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 private static native int signalSemaphoreCount0(Buffer ptr);/*
		  VkSubmitInfo vkObj = (VkSubmitInfo*)(ptr);
		  return (jint) (vkObj->signalSemaphoreCount);
	 */

	/**
	 * native SET method for field pSignalSemaphores	[vkhandle]<br>
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 private static native void pSignalSemaphores0(Buffer ptr, java.nio.ByteBuffer  _pSignalSemaphores);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  vkObj->pSignalSemaphores = (const VkSemaphore*) (_pSignalSemaphores);
	  */

	/**
	 * native GET method for field pSignalSemaphores	[vkhandle]<br>
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 private static native java.nio.ByteBuffer  pSignalSemaphores0(Buffer ptr);/*
		  VkSubmitInfo vkObj = (VkSubmitInfo*)(ptr);
		  return ( VkSemaphore ) (vkObj->pSignalSemaphores);
	 */



} // end of class VkSubmitInfo
