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

import java.nio.Buffer;


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

	/** P wrapper for THIS object */
	 private  P<VkPresentInfoKHR> p;

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
	 *  uint32_t 	swapchainCount	[int]
	 */ 
	 int 	swapchainCount;

	/**
	 *  const VkSwapchainKHR* 	pSwapchains	[vkhandle]
	 */ 
	  VkSwapchainKHR  	pSwapchains;

	/**
	 *  const uint32_t* 	pImageIndices	[int_array]
	 */ 
	 int[] 	pImageIndices;

	/**
	 *  VkResult* 	pResults	
	 */ 
	 VkResult[] 	pResults;

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
	 public VkPresentInfoKHR(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPresentInfoKHR(long address){ 
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
	 public static P<VkPresentInfoKHR> createNullPointer(){
	        P<VkPresentInfoKHR> p = new  P<VkPresentInfoKHR>(new VkPresentInfoKHR());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkPresentInfoKHR> getP() {
	       if(p == null ){
	           p = new P<VkPresentInfoKHR> (this);
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
	 * Set method for field swapchainCount	[int]<br>
	 * Prototype: uint32_t  swapchainCount
	 */ 
	 public void swapchainCount(int swapchainCount){
		 this.swapchainCount = swapchainCount;
		 setSwapchainCount0(this.ptr,  swapchainCount);
	 }

	/**
	 * Get method for field swapchainCount	[int]<br>
	 * Prototype: uint32_t  swapchainCount
	 */ 
	 public int swapchainCount(){
		 int var = getSwapchainCount0(super.ptr);
		 this.swapchainCount = var;
		 return this.swapchainCount;
	 }

	/**
	 * Set method for field pSwapchains	[vkhandle]<br>
	 * Prototype: const VkSwapchainKHR*  pSwapchains
	 */ 
	 public void pSwapchains( VkSwapchainKHR  pSwapchains){
		 this.pSwapchains = pSwapchains;
		 ByteBuffer buff = (pSwapchains==null) ? null : pSwapchains.getPointer();
		 setPSwapchains0(this.ptr, buff);
	 }

	/**
	 * Get method for field pSwapchains	[vkhandle]<br>
	 * Prototype: const VkSwapchainKHR*  pSwapchains
	 */ 
	 public  VkSwapchainKHR  pSwapchains(){

		 long handle = getPSwapchains0(super.ptr);
		 if(handle == 0){
		    this.pSwapchains = null;
		    return null;
		  }  

		 if(this.pSwapchains == null){
		    this.pSwapchains = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.pSwapchains).setPointer(handle);
		  }
		 return this.pSwapchains;
	 }

	/**
	 * Set method for field pImageIndices	[int_array]<br>
	 * Prototype: const uint32_t*  pImageIndices
	 */ 
	 public void pImageIndices(int[] pImageIndices){
		 this.pImageIndices = pImageIndices;
		 setPImageIndices0(this.ptr,  pImageIndices);
	 }

	/**
	 * Get method for field pImageIndices	[int_array]<br>
	 * Prototype: const uint32_t*  pImageIndices
	 */ 
	 public int[] pImageIndices(){
		 int[] var = getPImageIndices0(super.ptr);
		 this.pImageIndices = var;
		 return this.pImageIndices;
	 }

	/**
	 * Set method for field pResults	<br>
	 * Prototype: VkResult*  pResults
	 */ 
	 public void pResults(VkResult[] pResults){
		 this.pResults = pResults;
		 setPResults0(this.ptr,  pResults);
	 }

	/**
	 * Get method for field pResults	<br>
	 * Prototype: VkResult*  pResults
	 */ 
	 public VkResult[] pResults(){
		 VkResult[] var = getPResults0(super.ptr);
		 this.pResults = var;
		 return this.pResults;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkPresentInfoKHR vkObj = (VkPresentInfoKHR*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkPresentInfoKHR vkObj = (VkPresentInfoKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 private static native void setWaitSemaphoreCount0(Buffer ptr, int _waitSemaphoreCount);/*
		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  vkObj->waitSemaphoreCount = (uint32_t) (_waitSemaphoreCount);
	  */

	/**
	 * native GET method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 private static native int getWaitSemaphoreCount0(Buffer ptr);/*
		  VkPresentInfoKHR vkObj = (VkPresentInfoKHR*)(ptr);
		  return (jint) (vkObj->waitSemaphoreCount);
	 */

	/**
	 * native SET method for field pWaitSemaphores	[vkhandle]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 private static native void setPWaitSemaphores0(Buffer ptr, java.nio.ByteBuffer  _pWaitSemaphores);/*
		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  vkObj->pWaitSemaphores = (const VkSemaphore*) (_pWaitSemaphores);
	  */

	/**
	 * native GET method for field pWaitSemaphores	[vkhandle]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 private static native long getPWaitSemaphores0(Buffer ptr);/*
		  VkPresentInfoKHR vkObj = (VkPresentInfoKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pWaitSemaphores);	 */

	/**
	 * native SET method for field swapchainCount	[int]<br>
	 * Prototype: uint32_t  swapchainCount
	 */ 
	 private static native void setSwapchainCount0(Buffer ptr, int _swapchainCount);/*
		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  vkObj->swapchainCount = (uint32_t) (_swapchainCount);
	  */

	/**
	 * native GET method for field swapchainCount	[int]<br>
	 * Prototype: uint32_t  swapchainCount
	 */ 
	 private static native int getSwapchainCount0(Buffer ptr);/*
		  VkPresentInfoKHR vkObj = (VkPresentInfoKHR*)(ptr);
		  return (jint) (vkObj->swapchainCount);
	 */

	/**
	 * native SET method for field pSwapchains	[vkhandle]<br>
	 * Prototype: const VkSwapchainKHR*  pSwapchains
	 */ 
	 private static native void setPSwapchains0(Buffer ptr, java.nio.ByteBuffer  _pSwapchains);/*
		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  vkObj->pSwapchains = (const VkSwapchainKHR*) (_pSwapchains);
	  */

	/**
	 * native GET method for field pSwapchains	[vkhandle]<br>
	 * Prototype: const VkSwapchainKHR*  pSwapchains
	 */ 
	 private static native long getPSwapchains0(Buffer ptr);/*
		  VkPresentInfoKHR vkObj = (VkPresentInfoKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pSwapchains);	 */

	/**
	 * native SET method for field pImageIndices	[int_array]<br>
	 * Prototype: const uint32_t*  pImageIndices
	 */ 
	 private static native void setPImageIndices0(Buffer ptr, int[] _pImageIndices);/*
		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  vkObj->pImageIndices = (const uint32_t*) (_pImageIndices);
	  */

	/**
	 * native GET method for field pImageIndices	[int_array]<br>
	 * Prototype: const uint32_t*  pImageIndices
	 */ 
	 private static native int[] getPImageIndices0(Buffer ptr);/*
		  VkPresentInfoKHR vkObj = (VkPresentInfoKHR*)(ptr);
		  return (int[]) (vkObj->pImageIndices);
	 */

	/**
	 * native SET method for field pResults	<br>
	 * Prototype: VkResult*  pResults
	 */ 
	 private static native void setPResults0(Buffer ptr, VkResult[] _pResults);/*
		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  vkObj->pResults = (VkResult*) (_pResults);
	  */

	/**
	 * native GET method for field pResults	<br>
	 * Prototype: VkResult*  pResults
	 */ 
	 private static native VkResult[] getPResults0(Buffer ptr);/*
		  VkPresentInfoKHR vkObj = (VkPresentInfoKHR*)(ptr);
		  return (VkResult[]) (vkObj->pResults);
	 */



} // end of class VkPresentInfoKHR
