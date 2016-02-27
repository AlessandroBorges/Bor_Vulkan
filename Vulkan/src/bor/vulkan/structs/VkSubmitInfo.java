// class wrapping Vulkan's VkSubmitInfo struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkSubmitInfo 
 * @Author Alessandro Borges 
 */
public class VkSubmitInfo extends VkStruct {
	/** ID of this structure [19]  */
	 public static final int TAG = VKSUBMITINFO_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType 
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext 
	 */ 
	VkObject 	pNext;

	/**
	 *  uint32_t 	waitSemaphoreCount 
	 */ 
	int 	waitSemaphoreCount;

	/**
	 *  const VkSemaphore* 	pWaitSemaphores 
	 */ 
	const VkSemaphore* 	pWaitSemaphores;

	/**
	 *  const VkPipelineStageFlags* 	pWaitDstStageMask 
	 */ 
	const VkPipelineStageFlags* 	pWaitDstStageMask;

	/**
	 *  uint32_t 	commandBufferCount 
	 */ 
	int 	commandBufferCount;

	/**
	 *  const VkCommandBuffer* 	pCommandBuffers 
	 */ 
	const VkCommandBuffer* 	pCommandBuffers;

	/**
	 *  uint32_t 	signalSemaphoreCount 
	 */ 
	int 	signalSemaphoreCount;

	/**
	 *  const VkSemaphore* 	pSignalSemaphores 
	 */ 
	const VkSemaphore* 	pSignalSemaphores;

	/**
	 * Ctor
	 */
	public VkSubmitInfo(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG); 
	}


	 // /////////////////////
	 //  SETTERS & GETTERS //
	 // /////////////////////

	/**
	 * Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field waitSemaphoreCount
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 public void waitSemaphoreCount(int waitSemaphoreCount){
		 this.waitSemaphoreCount = waitSemaphoreCount;
		waitSemaphoreCount0(super.ptr, waitSemaphoreCount);
	 }

	/**
	 * get method for field waitSemaphoreCount
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 public int waitSemaphoreCount(){
		 // return  this.waitSemaphoreCount;
		 return waitSemaphoreCount0(super.ptr);
	 }

	/**
	 * Set method for field pWaitSemaphores
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 public void pWaitSemaphores(const VkSemaphore* pWaitSemaphores){
		 this.pWaitSemaphores = pWaitSemaphores;
		pWaitSemaphores0(super.ptr, pWaitSemaphores);
	 }

	/**
	 * get method for field pWaitSemaphores
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 public const VkSemaphore* pWaitSemaphores(){
		 // return  this.pWaitSemaphores;
		 return pWaitSemaphores0(super.ptr);
	 }

	/**
	 * Set method for field pWaitDstStageMask
	 * Prototype: const VkPipelineStageFlags*  pWaitDstStageMask
	 */ 
	 public void pWaitDstStageMask(const VkPipelineStageFlags* pWaitDstStageMask){
		 this.pWaitDstStageMask = pWaitDstStageMask;
		pWaitDstStageMask0(super.ptr, pWaitDstStageMask);
	 }

	/**
	 * get method for field pWaitDstStageMask
	 * Prototype: const VkPipelineStageFlags*  pWaitDstStageMask
	 */ 
	 public const VkPipelineStageFlags* pWaitDstStageMask(){
		 // return  this.pWaitDstStageMask;
		 return pWaitDstStageMask0(super.ptr);
	 }

	/**
	 * Set method for field commandBufferCount
	 * Prototype: uint32_t  commandBufferCount
	 */ 
	 public void commandBufferCount(int commandBufferCount){
		 this.commandBufferCount = commandBufferCount;
		commandBufferCount0(super.ptr, commandBufferCount);
	 }

	/**
	 * get method for field commandBufferCount
	 * Prototype: uint32_t  commandBufferCount
	 */ 
	 public int commandBufferCount(){
		 // return  this.commandBufferCount;
		 return commandBufferCount0(super.ptr);
	 }

	/**
	 * Set method for field pCommandBuffers
	 * Prototype: const VkCommandBuffer*  pCommandBuffers
	 */ 
	 public void pCommandBuffers(const VkCommandBuffer* pCommandBuffers){
		 this.pCommandBuffers = pCommandBuffers;
		pCommandBuffers0(super.ptr, pCommandBuffers);
	 }

	/**
	 * get method for field pCommandBuffers
	 * Prototype: const VkCommandBuffer*  pCommandBuffers
	 */ 
	 public const VkCommandBuffer* pCommandBuffers(){
		 // return  this.pCommandBuffers;
		 return pCommandBuffers0(super.ptr);
	 }

	/**
	 * Set method for field signalSemaphoreCount
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 public void signalSemaphoreCount(int signalSemaphoreCount){
		 this.signalSemaphoreCount = signalSemaphoreCount;
		signalSemaphoreCount0(super.ptr, signalSemaphoreCount);
	 }

	/**
	 * get method for field signalSemaphoreCount
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 public int signalSemaphoreCount(){
		 // return  this.signalSemaphoreCount;
		 return signalSemaphoreCount0(super.ptr);
	 }

	/**
	 * Set method for field pSignalSemaphores
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 public void pSignalSemaphores(const VkSemaphore* pSignalSemaphores){
		 this.pSignalSemaphores = pSignalSemaphores;
		pSignalSemaphores0(super.ptr, pSignalSemaphores);
	 }

	/**
	 * get method for field pSignalSemaphores
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 public const VkSemaphore* pSignalSemaphores(){
		 // return  this.pSignalSemaphores;
		 return pSignalSemaphores0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field waitSemaphoreCount
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 private static native void waitSemaphoreCount0(ByteBuffer ptr, int _waitSemaphoreCount);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(*ptr);
		  _obj.waitSemaphoreCount = (uint32_t) (_waitSemaphoreCount);
	  */

	/**
	 * get method for field waitSemaphoreCount
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 private static native int waitSemaphoreCount0(ByteBuffer ptr);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pWaitSemaphores
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 private static native void pWaitSemaphores0(ByteBuffer ptr, const VkSemaphore* _pWaitSemaphores);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(*ptr);
		  _obj.pWaitSemaphores = (const VkSemaphore*) (_pWaitSemaphores);
	  */

	/**
	 * get method for field pWaitSemaphores
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 private static native const VkSemaphore* pWaitSemaphores0(ByteBuffer ptr);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(ptr);
		  return (const VkSemaphore*) (_obj.const VkSemaphore*);
	 */

	/**
	 * native Set method for field pWaitDstStageMask
	 * Prototype: const VkPipelineStageFlags*  pWaitDstStageMask
	 */ 
	 private static native void pWaitDstStageMask0(ByteBuffer ptr, const VkPipelineStageFlags* _pWaitDstStageMask);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(*ptr);
		  _obj.pWaitDstStageMask = (const VkPipelineStageFlags*) (_pWaitDstStageMask);
	  */

	/**
	 * get method for field pWaitDstStageMask
	 * Prototype: const VkPipelineStageFlags*  pWaitDstStageMask
	 */ 
	 private static native const VkPipelineStageFlags* pWaitDstStageMask0(ByteBuffer ptr);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(ptr);
		  return (const VkPipelineStageFlags*) (_obj.const VkPipelineStageFlags*);
	 */

	/**
	 * native Set method for field commandBufferCount
	 * Prototype: uint32_t  commandBufferCount
	 */ 
	 private static native void commandBufferCount0(ByteBuffer ptr, int _commandBufferCount);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(*ptr);
		  _obj.commandBufferCount = (uint32_t) (_commandBufferCount);
	  */

	/**
	 * get method for field commandBufferCount
	 * Prototype: uint32_t  commandBufferCount
	 */ 
	 private static native int commandBufferCount0(ByteBuffer ptr);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pCommandBuffers
	 * Prototype: const VkCommandBuffer*  pCommandBuffers
	 */ 
	 private static native void pCommandBuffers0(ByteBuffer ptr, const VkCommandBuffer* _pCommandBuffers);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(*ptr);
		  _obj.pCommandBuffers = (const VkCommandBuffer*) (_pCommandBuffers);
	  */

	/**
	 * get method for field pCommandBuffers
	 * Prototype: const VkCommandBuffer*  pCommandBuffers
	 */ 
	 private static native const VkCommandBuffer* pCommandBuffers0(ByteBuffer ptr);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(ptr);
		  return (const VkCommandBuffer*) (_obj.const VkCommandBuffer*);
	 */

	/**
	 * native Set method for field signalSemaphoreCount
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 private static native void signalSemaphoreCount0(ByteBuffer ptr, int _signalSemaphoreCount);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(*ptr);
		  _obj.signalSemaphoreCount = (uint32_t) (_signalSemaphoreCount);
	  */

	/**
	 * get method for field signalSemaphoreCount
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 private static native int signalSemaphoreCount0(ByteBuffer ptr);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pSignalSemaphores
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 private static native void pSignalSemaphores0(ByteBuffer ptr, const VkSemaphore* _pSignalSemaphores);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(*ptr);
		  _obj.pSignalSemaphores = (const VkSemaphore*) (_pSignalSemaphores);
	  */

	/**
	 * get method for field pSignalSemaphores
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 private static native const VkSemaphore* pSignalSemaphores0(ByteBuffer ptr);/*
		  VkSubmitInfo _obj = (VkSubmitInfo)(ptr);
		  return (const VkSemaphore*) (_obj.const VkSemaphore*);
	 */



} // end of class VkSubmitInfo
