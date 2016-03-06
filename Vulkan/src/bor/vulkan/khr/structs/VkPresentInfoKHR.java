/**
 * Class wrapping Vulkan's VkPresentInfoKHR struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.01 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.khr.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.*;
import bor.vulkan.khr.*;
import java.nio.ByteBuffer;


/**
 *  Project Bor-Vulkan 
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkPresentInfoKHR. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPresentInfoKHR {
 *     VkStructureType          sType;
 *     const void*              pNext;
 *     uint32_t                 waitSemaphoreCount;
 *     const VkSemaphore*       pWaitSemaphores;
 *     uint32_t                 swapchainCount;
 *     const VkSwapchainKHR*    pSwapchains;
 *     const uint32_t*          pImageIndices;
 *     VkResult*                pResults;
 * } VkPresentInfoKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkPresentInfoKHR extends VkStruct {
	/** TAG of this structure [109]  */
	 private static final String TAG = "VkPresentInfoKHR";

	/** ID of this structure [109]  */
	 public static final int TAG_ID = VKPRESENTINFOKHR_ID;

	 // fields //
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
	 *  uint32_t 	swapchainCount	[int]
	 */ 
	int 	swapchainCount;

	/**
	 *  const VkSwapchainKHR* 	pSwapchains	[p]
	 */ 
	P<VkSwapchainKHR>  	pSwapchains;

	/**
	 *  const uint32_t* 	pImageIndices	[int_array]
	 */ 
	int[] 	pImageIndices;

	/**
	 *  VkResult* 	pResults	[pinteger]
	 */ 
	PInteger 	pResults;

	/**
	 * Ctor
	 */
	public VkPresentInfoKHR(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPresentInfoKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkPresentInfoKHR(long address, int memSize){ 
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
	 public static P<VkPresentInfoKHR> createNullPointer(){
	        P<VkPresentInfoKHR> p = new  P<VkPresentInfoKHR>(new VkPresentInfoKHR());
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
	 * Set method for field swapchainCount	[int]<br>
	 * Prototype: uint32_t  swapchainCount
	 */ 
	 public void swapchainCount(int swapchainCount){
		 this.swapchainCount = swapchainCount;
		swapchainCount0(super.ptr, swapchainCount);
	 }

	/**
	 * get method for field swapchainCount	[int]<br>
	 * Prototype: uint32_t  swapchainCount
	 */ 
	 public int swapchainCount(){
		 // return  this.swapchainCount;
		 return swapchainCount0(super.ptr);
	 }

	/**
	 * Set method for field pSwapchains	[p]<br>
	 * Prototype: const VkSwapchainKHR*  pSwapchains
	 */ 
	 public void pSwapchains(P<VkSwapchainKHR>  pSwapchains){
		 this.pSwapchains = pSwapchains;
		pSwapchains0(super.ptr, pSwapchains);
	 }

	/**
	 * get method for field pSwapchains	[p]<br>
	 * Prototype: const VkSwapchainKHR*  pSwapchains
	 */ 
	 public P<VkSwapchainKHR>  pSwapchains(){
		 // return  this.pSwapchains;
		 return pSwapchains0(super.ptr);
	 }

	/**
	 * Set method for field pImageIndices	[int_array]<br>
	 * Prototype: const uint32_t*  pImageIndices
	 */ 
	 public void pImageIndices(int[] pImageIndices){
		 this.pImageIndices = pImageIndices;
		pImageIndices0(super.ptr, pImageIndices);
	 }

	/**
	 * get method for field pImageIndices	[int_array]<br>
	 * Prototype: const uint32_t*  pImageIndices
	 */ 
	 public int[] pImageIndices(){
		 // return  this.pImageIndices;
		 return pImageIndices0(super.ptr);
	 }

	/**
	 * Set method for field pResults	[pinteger]<br>
	 * Prototype: VkResult*  pResults
	 */ 
	 public void pResults(PInteger pResults){
		 this.pResults = pResults;
		pResults0(super.ptr, pResults);
	 }

	/**
	 * get method for field pResults	[pinteger]<br>
	 * Prototype: VkResult*  pResults
	 */ 
	 public PInteger pResults(){
		 // return  this.pResults;
		 return pResults0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 private static native void waitSemaphoreCount0(ByteBuffer ptr, int _waitSemaphoreCount);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(*ptr);
		  _obj.waitSemaphoreCount = (uint32_t) (_waitSemaphoreCount);
	  */

	/**
	 * native GET method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 private static native int waitSemaphoreCount0(ByteBuffer ptr);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field pWaitSemaphores	[p]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 private static native void pWaitSemaphores0(ByteBuffer ptr, P<VkSemaphore>  _pWaitSemaphores);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(*ptr);
		  _obj.pWaitSemaphores = (const VkSemaphore*) (_pWaitSemaphores);
	  */

	/**
	 * native GET method for field pWaitSemaphores	[p]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 private static native P<VkSemaphore>  pWaitSemaphores0(ByteBuffer ptr);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(ptr);
		  return (P<VkSemaphore> ) (_obj.const VkSemaphore*);
	 */

	/**
	 * native SET method for field swapchainCount	[int]<br>
	 * Prototype: uint32_t  swapchainCount
	 */ 
	 private static native void swapchainCount0(ByteBuffer ptr, int _swapchainCount);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(*ptr);
		  _obj.swapchainCount = (uint32_t) (_swapchainCount);
	  */

	/**
	 * native GET method for field swapchainCount	[int]<br>
	 * Prototype: uint32_t  swapchainCount
	 */ 
	 private static native int swapchainCount0(ByteBuffer ptr);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field pSwapchains	[p]<br>
	 * Prototype: const VkSwapchainKHR*  pSwapchains
	 */ 
	 private static native void pSwapchains0(ByteBuffer ptr, P<VkSwapchainKHR>  _pSwapchains);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(*ptr);
		  _obj.pSwapchains = (const VkSwapchainKHR*) (_pSwapchains);
	  */

	/**
	 * native GET method for field pSwapchains	[p]<br>
	 * Prototype: const VkSwapchainKHR*  pSwapchains
	 */ 
	 private static native P<VkSwapchainKHR>  pSwapchains0(ByteBuffer ptr);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(ptr);
		  return (P<VkSwapchainKHR> ) (_obj.const VkSwapchainKHR*);
	 */

	/**
	 * native SET method for field pImageIndices	[int_array]<br>
	 * Prototype: const uint32_t*  pImageIndices
	 */ 
	 private static native void pImageIndices0(ByteBuffer ptr, int[] _pImageIndices);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(*ptr);
		  _obj.pImageIndices = (const uint32_t*) (_pImageIndices);
	  */

	/**
	 * native GET method for field pImageIndices	[int_array]<br>
	 * Prototype: const uint32_t*  pImageIndices
	 */ 
	 private static native int[] pImageIndices0(ByteBuffer ptr);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(ptr);
		  return (int[]) (_obj.const uint32_t*);
	 */

	/**
	 * native SET method for field pResults	[pinteger]<br>
	 * Prototype: VkResult*  pResults
	 */ 
	 private static native void pResults0(ByteBuffer ptr, PInteger _pResults);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(*ptr);
		  _obj.pResults = (VkResult*) (_pResults);
	  */

	/**
	 * native GET method for field pResults	[pinteger]<br>
	 * Prototype: VkResult*  pResults
	 */ 
	 private static native PInteger pResults0(ByteBuffer ptr);/*
		  VkPresentInfoKHR _obj = (VkPresentInfoKHR)(ptr);
		  return (PInteger) (_obj.VkResult*);
	 */



} // end of class VkPresentInfoKHR
