// class wrapping Vulkan's VkPresentInfoKHR struct.
package bor.vulkan.khr.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.VkStruct;

import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkPresentInfoKHR 
 * @Author Alessandro Borges 
 */
public class VkPresentInfoKHR extends VkStruct {
	/** ID of this structure [109]  */
	 public static final int TAG = VKPRESENTINFOKHR_ID;

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
	 *  uint32_t 	swapchainCount 
	 */ 
	int 	swapchainCount;

	/**
	 *  const VkSwapchainKHR* 	pSwapchains 
	 */ 
	const VkSwapchainKHR* 	pSwapchains;

	/**
	 *  const uint32_t* 	pImageIndices 
	 */ 
	const uint32_t* 	pImageIndices;

	/**
	 *  VkResult* 	pResults 
	 */ 
	VkResult* 	pResults;

	/**
	 * Ctor
	 */
	public VkPresentInfoKHR(){ 
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
	 * Set method for field swapchainCount
	 * Prototype: uint32_t  swapchainCount
	 */ 
	 public void swapchainCount(int swapchainCount){
		 this.swapchainCount = swapchainCount;
		swapchainCount0(super.ptr, swapchainCount);
	 }

	/**
	 * get method for field swapchainCount
	 * Prototype: uint32_t  swapchainCount
	 */ 
	 public int swapchainCount(){
		 // return  this.swapchainCount;
		 return swapchainCount0(super.ptr);
	 }

	/**
	 * Set method for field pSwapchains
	 * Prototype: const VkSwapchainKHR*  pSwapchains
	 */ 
	 public void pSwapchains(const VkSwapchainKHR* pSwapchains){
		 this.pSwapchains = pSwapchains;
		pSwapchains0(super.ptr, pSwapchains);
	 }

	/**
	 * get method for field pSwapchains
	 * Prototype: const VkSwapchainKHR*  pSwapchains
	 */ 
	 public const VkSwapchainKHR* pSwapchains(){
		 // return  this.pSwapchains;
		 return pSwapchains0(super.ptr);
	 }

	/**
	 * Set method for field pImageIndices
	 * Prototype: const uint32_t*  pImageIndices
	 */ 
	 public void pImageIndices(const uint32_t* pImageIndices){
		 this.pImageIndices = pImageIndices;
		pImageIndices0(super.ptr, pImageIndices);
	 }

	/**
	 * get method for field pImageIndices
	 * Prototype: const uint32_t*  pImageIndices
	 */ 
	 public const uint32_t* pImageIndices(){
		 // return  this.pImageIndices;
		 return pImageIndices0(super.ptr);
	 }

	/**
	 * Set method for field pResults
	 * Prototype: VkResult*  pResults
	 */ 
	 public void pResults(VkResult* pResults){
		 this.pResults = pResults;
		pResults0(super.ptr, pResults);
	 }

	/**
	 * get method for field pResults
	 * Prototype: VkResult*  pResults
	 */ 
	 public VkResult* pResults(){
		 // return  this.pResults;
		 return pResults0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field waitSemaphoreCount
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 private static native void waitSemaphoreCount0(ByteBuffer ptr, int _waitSemaphoreCount);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(*ptr);
		  _obj.waitSemaphoreCount = (uint32_t) (_waitSemaphoreCount);
	  */

	/**
	 * get method for field waitSemaphoreCount
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 private static native int waitSemaphoreCount0(ByteBuffer ptr);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pWaitSemaphores
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 private static native void pWaitSemaphores0(ByteBuffer ptr, const VkSemaphore* _pWaitSemaphores);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(*ptr);
		  _obj.pWaitSemaphores = (const VkSemaphore*) (_pWaitSemaphores);
	  */

	/**
	 * get method for field pWaitSemaphores
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 private static native const VkSemaphore* pWaitSemaphores0(ByteBuffer ptr);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(ptr);
		  return (const VkSemaphore*) (_obj.const VkSemaphore*);
	 */

	/**
	 * native Set method for field swapchainCount
	 * Prototype: uint32_t  swapchainCount
	 */ 
	 private static native void swapchainCount0(ByteBuffer ptr, int _swapchainCount);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(*ptr);
		  _obj.swapchainCount = (uint32_t) (_swapchainCount);
	  */

	/**
	 * get method for field swapchainCount
	 * Prototype: uint32_t  swapchainCount
	 */ 
	 private static native int swapchainCount0(ByteBuffer ptr);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pSwapchains
	 * Prototype: const VkSwapchainKHR*  pSwapchains
	 */ 
	 private static native void pSwapchains0(ByteBuffer ptr, const VkSwapchainKHR* _pSwapchains);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(*ptr);
		  _obj.pSwapchains = (const VkSwapchainKHR*) (_pSwapchains);
	  */

	/**
	 * get method for field pSwapchains
	 * Prototype: const VkSwapchainKHR*  pSwapchains
	 */ 
	 private static native const VkSwapchainKHR* pSwapchains0(ByteBuffer ptr);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(ptr);
		  return (const VkSwapchainKHR*) (_obj.const VkSwapchainKHR*);
	 */

	/**
	 * native Set method for field pImageIndices
	 * Prototype: const uint32_t*  pImageIndices
	 */ 
	 private static native void pImageIndices0(ByteBuffer ptr, const uint32_t* _pImageIndices);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(*ptr);
		  _obj.pImageIndices = (const uint32_t*) (_pImageIndices);
	  */

	/**
	 * get method for field pImageIndices
	 * Prototype: const uint32_t*  pImageIndices
	 */ 
	 private static native const uint32_t* pImageIndices0(ByteBuffer ptr);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(ptr);
		  return (const uint32_t*) (_obj.const uint32_t*);
	 */

	/**
	 * native Set method for field pResults
	 * Prototype: VkResult*  pResults
	 */ 
	 private static native void pResults0(ByteBuffer ptr, VkResult* _pResults);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(*ptr);
		  _obj.pResults = (VkResult*) (_pResults);
	  */

	/**
	 * get method for field pResults
	 * Prototype: VkResult*  pResults
	 */ 
	 private static native VkResult* pResults0(ByteBuffer ptr);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(ptr);
		  return (VkResult*) (_obj.VkResult*);
	 */



} // end of class VkPresentInfoKHR
