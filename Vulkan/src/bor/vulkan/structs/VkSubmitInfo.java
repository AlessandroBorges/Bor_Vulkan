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
	 *  const void* 	pNext	[p]
	 */ 
	 P<VkObject> 	pNext;

	/**
	 *  uint32_t 	waitSemaphoreCount	[int]
	 */ 
	 int 	waitSemaphoreCount;

	/**
	 *  const VkSemaphore* 	pWaitSemaphores	[p]
	 */ 
	 P<VkSemaphore>  	pWaitSemaphores;

	/**
	 *  const VkPipelineStageFlags* 	pWaitDstStageMask	[pinteger]
	 */ 
	 PInteger 	pWaitDstStageMask;

	/**
	 *  uint32_t 	commandBufferCount	[int]
	 */ 
	 int 	commandBufferCount;

	/**
	 *  const VkCommandBuffer* 	pCommandBuffers	[p]
	 */ 
	 P<VkCommandBuffer>  	pCommandBuffers;

	/**
	 *  uint32_t 	signalSemaphoreCount	[int]
	 */ 
	 int 	signalSemaphoreCount;

	/**
	 *  const VkSemaphore* 	pSignalSemaphores	[p]
	 */ 
	 P<VkSemaphore>  	pSignalSemaphores;

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
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(P<VkObject> pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public P<VkObject> pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 public void waitSemaphoreCount(int waitSemaphoreCount){
		 this.waitSemaphoreCount = waitSemaphoreCount;
		waitSemaphoreCount0(super.ptr, waitSemaphoreCount);
	 }

	/**
	 * get method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 public int waitSemaphoreCount(){
		 // return  this.waitSemaphoreCount;
		 return waitSemaphoreCount0(super.ptr);
	 }

	/**
	 * Set method for field pWaitSemaphores	[p]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 public void pWaitSemaphores(P<VkSemaphore>  pWaitSemaphores){
		 this.pWaitSemaphores = pWaitSemaphores;
		pWaitSemaphores0(super.ptr, pWaitSemaphores);
	 }

	/**
	 * get method for field pWaitSemaphores	[p]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 public P<VkSemaphore>  pWaitSemaphores(){
		 // return  this.pWaitSemaphores;
		 return pWaitSemaphores0(super.ptr);
	 }

	/**
	 * Set method for field pWaitDstStageMask	[pinteger]<br>
	 * Prototype: const VkPipelineStageFlags*  pWaitDstStageMask
	 */ 
	 public void pWaitDstStageMask(PInteger pWaitDstStageMask){
		 this.pWaitDstStageMask = pWaitDstStageMask;
		pWaitDstStageMask0(super.ptr, pWaitDstStageMask);
	 }

	/**
	 * get method for field pWaitDstStageMask	[pinteger]<br>
	 * Prototype: const VkPipelineStageFlags*  pWaitDstStageMask
	 */ 
	 public PInteger pWaitDstStageMask(){
		 // return  this.pWaitDstStageMask;
		 return pWaitDstStageMask0(super.ptr);
	 }

	/**
	 * Set method for field commandBufferCount	[int]<br>
	 * Prototype: uint32_t  commandBufferCount
	 */ 
	 public void commandBufferCount(int commandBufferCount){
		 this.commandBufferCount = commandBufferCount;
		commandBufferCount0(super.ptr, commandBufferCount);
	 }

	/**
	 * get method for field commandBufferCount	[int]<br>
	 * Prototype: uint32_t  commandBufferCount
	 */ 
	 public int commandBufferCount(){
		 // return  this.commandBufferCount;
		 return commandBufferCount0(super.ptr);
	 }

	/**
	 * Set method for field pCommandBuffers	[p]<br>
	 * Prototype: const VkCommandBuffer*  pCommandBuffers
	 */ 
	 public void pCommandBuffers(P<VkCommandBuffer>  pCommandBuffers){
		 this.pCommandBuffers = pCommandBuffers;
		pCommandBuffers0(super.ptr, pCommandBuffers);
	 }

	/**
	 * get method for field pCommandBuffers	[p]<br>
	 * Prototype: const VkCommandBuffer*  pCommandBuffers
	 */ 
	 public P<VkCommandBuffer>  pCommandBuffers(){
		 // return  this.pCommandBuffers;
		 return pCommandBuffers0(super.ptr);
	 }

	/**
	 * Set method for field signalSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 public void signalSemaphoreCount(int signalSemaphoreCount){
		 this.signalSemaphoreCount = signalSemaphoreCount;
		signalSemaphoreCount0(super.ptr, signalSemaphoreCount);
	 }

	/**
	 * get method for field signalSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 public int signalSemaphoreCount(){
		 // return  this.signalSemaphoreCount;
		 return signalSemaphoreCount0(super.ptr);
	 }

	/**
	 * Set method for field pSignalSemaphores	[p]<br>
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 public void pSignalSemaphores(P<VkSemaphore>  pSignalSemaphores){
		 this.pSignalSemaphores = pSignalSemaphores;
		pSignalSemaphores0(super.ptr, pSignalSemaphores);
	 }

	/**
	 * get method for field pSignalSemaphores	[p]<br>
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 public P<VkSemaphore>  pSignalSemaphores(){
		 // return  this.pSignalSemaphores;
		 return pSignalSemaphores0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 private static native void waitSemaphoreCount0(ByteBuffer ptr, int _waitSemaphoreCount);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(*ptr);
		  _obj.waitSemaphoreCount = (uint32_t) (_waitSemaphoreCount);
	  */

	/**
	 * native GET method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 private static native int waitSemaphoreCount0(ByteBuffer ptr);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field pWaitSemaphores	[p]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 private static native void pWaitSemaphores0(ByteBuffer ptr, P<VkSemaphore>  _pWaitSemaphores);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(*ptr);
		  _obj.pWaitSemaphores = (const VkSemaphore*) (_pWaitSemaphores);
	  */

	/**
	 * native GET method for field pWaitSemaphores	[p]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 private static native P<VkSemaphore>  pWaitSemaphores0(ByteBuffer ptr);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(ptr);
		  return (P<VkSemaphore> ) (_obj.const VkSemaphore*);
	 */

	/**
	 * native SET method for field pWaitDstStageMask	[pinteger]<br>
	 * Prototype: const VkPipelineStageFlags*  pWaitDstStageMask
	 */ 
	 private static native void pWaitDstStageMask0(ByteBuffer ptr, PInteger _pWaitDstStageMask);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(*ptr);
		  _obj.pWaitDstStageMask = (const VkPipelineStageFlags*) (_pWaitDstStageMask);
	  */

	/**
	 * native GET method for field pWaitDstStageMask	[pinteger]<br>
	 * Prototype: const VkPipelineStageFlags*  pWaitDstStageMask
	 */ 
	 private static native PInteger pWaitDstStageMask0(ByteBuffer ptr);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(ptr);
		  return (PInteger) (_obj.const VkPipelineStageFlags*);
	 */

	/**
	 * native SET method for field commandBufferCount	[int]<br>
	 * Prototype: uint32_t  commandBufferCount
	 */ 
	 private static native void commandBufferCount0(ByteBuffer ptr, int _commandBufferCount);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(*ptr);
		  _obj.commandBufferCount = (uint32_t) (_commandBufferCount);
	  */

	/**
	 * native GET method for field commandBufferCount	[int]<br>
	 * Prototype: uint32_t  commandBufferCount
	 */ 
	 private static native int commandBufferCount0(ByteBuffer ptr);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field pCommandBuffers	[p]<br>
	 * Prototype: const VkCommandBuffer*  pCommandBuffers
	 */ 
	 private static native void pCommandBuffers0(ByteBuffer ptr, P<VkCommandBuffer>  _pCommandBuffers);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(*ptr);
		  _obj.pCommandBuffers = (const VkCommandBuffer*) (_pCommandBuffers);
	  */

	/**
	 * native GET method for field pCommandBuffers	[p]<br>
	 * Prototype: const VkCommandBuffer*  pCommandBuffers
	 */ 
	 private static native P<VkCommandBuffer>  pCommandBuffers0(ByteBuffer ptr);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(ptr);
		  return (P<VkCommandBuffer> ) (_obj.const VkCommandBuffer*);
	 */

	/**
	 * native SET method for field signalSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 private static native void signalSemaphoreCount0(ByteBuffer ptr, int _signalSemaphoreCount);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(*ptr);
		  _obj.signalSemaphoreCount = (uint32_t) (_signalSemaphoreCount);
	  */

	/**
	 * native GET method for field signalSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 private static native int signalSemaphoreCount0(ByteBuffer ptr);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field pSignalSemaphores	[p]<br>
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 private static native void pSignalSemaphores0(ByteBuffer ptr, P<VkSemaphore>  _pSignalSemaphores);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(*ptr);
		  _obj.pSignalSemaphores = (const VkSemaphore*) (_pSignalSemaphores);
	  */

	/**
	 * native GET method for field pSignalSemaphores	[p]<br>
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 private static native P<VkSemaphore>  pSignalSemaphores0(ByteBuffer ptr);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(ptr);
		  return (P<VkSemaphore> ) (_obj.const VkSemaphore*);
	 */



} // end of class VkSubmitInfo
