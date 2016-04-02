/**
 * Class wrapping Vulkan's VkAllocationCallbacks struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.01 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.structs;

import java.nio.Buffer;
import java.nio.ByteBuffer;

import bor.vulkan.P;
import bor.vulkan.PFNvkAllocationFunction;
import bor.vulkan.PFNvkFreeFunction;
import bor.vulkan.PFNvkInternalAllocationNotification;
import bor.vulkan.PFNvkInternalFreeNotification;
import bor.vulkan.PFNvkReallocationFunction;


/**
 *  Project Bor-Vulkan 
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkAllocationCallbacks. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkAllocationCallbacks {
 *     void*                                   pUserData;
 *     PFN_vkAllocationFunction                pfnAllocation;
 *     PFN_vkReallocationFunction              pfnReallocation;
 *     PFN_vkFreeFunction                      pfnFree;
 *     PFN_vkInternalAllocationNotification    pfnInternalAllocation;
 *     PFN_vkInternalFreeNotification          pfnInternalFree;
 * } VkAllocationCallbacks;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkAllocationCallbacks extends VkStruct {
	/** TAG of this structure [3]  */
	 private static final String TAG = "VkAllocationCallbacks";

	/** ID of this structure [3]  */
	 public static final int TAG_ID = VKALLOCATIONCALLBACKS_ID;

	/** P wrapper for THIS object */
	 private  P<VkAllocationCallbacks> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  void* 	pUserData	[buffer]
	 */ 
	 java.nio.Buffer 	pUserData;

	/**
	 *  PFN_vkAllocationFunction 	pfnAllocation	[vkpfn]
	 */ 
	 PFNvkAllocationFunction 	pfnAllocation;

	/**
	 *  PFN_vkReallocationFunction 	pfnReallocation	[vkpfn]
	 */ 
	 PFNvkReallocationFunction 	pfnReallocation;

	/**
	 *  PFN_vkFreeFunction 	pfnFree	[vkpfn]
	 */ 
	 PFNvkFreeFunction 	pfnFree;

	/**
	 *  PFN_vkInternalAllocationNotification 	pfnInternalAllocation	[vkpfn]
	 */ 
	 PFNvkInternalAllocationNotification 	pfnInternalAllocation;

	/**
	 *  PFN_vkInternalFreeNotification 	pfnInternalFree	[vkpfn]
	 */ 
	 PFNvkInternalFreeNotification 	pfnInternalFree;

	/**
	 * Ctor
	 */
	public VkAllocationCallbacks(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkAllocationCallbacks(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkAllocationCallbacks(long address, int memSize){ 
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
	 public static P<VkAllocationCallbacks> createNullPointer(){
	        P<VkAllocationCallbacks> p = new  P<VkAllocationCallbacks>(new VkAllocationCallbacks());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkAllocationCallbacks> getP() {
	       if(p == null ){
	           p = new P<VkAllocationCallbacks> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field pUserData	[buffer]<br>
	 * Prototype: void*  pUserData
	 */ 
	 public void pUserData(java.nio.Buffer pUserData){
		 this.pUserData = pUserData;
		 pUserData0(this.ptr,  pUserData);
	 }

	/**
	 * Get method for field pUserData	[buffer]<br>
	 * Prototype: void*  pUserData
	 */ 
	 public java.nio.Buffer pUserData(){
		 java.nio.Buffer var = pUserData0(super.ptr);
		 this.pUserData = var;
		 return this.pUserData;
	 }

	/**
	 * Set method for field pfnAllocation	[vkpfn]<br>
	 * Prototype: PFN_vkAllocationFunction  pfnAllocation
	 */ 
	 public void pfnAllocation(PFNvkAllocationFunction pfnAllocation){
		 this.pfnAllocation = pfnAllocation;
		 ByteBuffer buff = (pfnAllocation==null) ? null : pfnAllocation.getHandle();
		 pfnAllocation0(this.ptr, buff);
	 }

	/**
	 * Get method for field pfnAllocation	[vkpfn]<br>
	 * Prototype: PFN_vkAllocationFunction  pfnAllocation
	 */ 
	 public PFNvkAllocationFunction pfnAllocation(){

		  ByteBuffer handle = pfnAllocation0(super.ptr);
		 if(handle == null){
		    this.pfnAllocation = null;
		    return null;
		  } else 
 		 if(this.pfnAllocation == null){
		    this.pfnAllocation = new PFNvkAllocationFunction(handle);
		 }else{
		    this.pfnAllocation.setHandle(handle);
		  }
		 return this.pfnAllocation;
	 }

	/**
	 * Set method for field pfnReallocation	[vkpfn]<br>
	 * Prototype: PFN_vkReallocationFunction  pfnReallocation
	 */ 
	 public void pfnReallocation(PFNvkReallocationFunction pfnReallocation){
		 this.pfnReallocation = pfnReallocation;
		 ByteBuffer buff = (pfnReallocation==null) ? null : pfnReallocation.getHandle();
		 pfnReallocation0(this.ptr, buff);
	 }

	/**
	 * Get method for field pfnReallocation	[vkpfn]<br>
	 * Prototype: PFN_vkReallocationFunction  pfnReallocation
	 */ 
	 public PFNvkReallocationFunction pfnReallocation(){

		  ByteBuffer handle = pfnReallocation0(super.ptr);
		 if(handle == null){
		    this.pfnReallocation = null;
		    return null;
		  } else 
 		 if(this.pfnReallocation == null){
		    this.pfnReallocation = new PFNvkReallocationFunction(handle);
		 }else{
		    this.pfnReallocation.setHandle(handle);
		  }
		 return this.pfnReallocation;
	 }

	/**
	 * Set method for field pfnFree	[vkpfn]<br>
	 * Prototype: PFN_vkFreeFunction  pfnFree
	 */ 
	 public void pfnFree(PFNvkFreeFunction pfnFree){
		 this.pfnFree = pfnFree;
		 ByteBuffer buff = (pfnFree==null) ? null : pfnFree.getHandle();
		 pfnFree0(this.ptr, buff);
	 }

	/**
	 * Get method for field pfnFree	[vkpfn]<br>
	 * Prototype: PFN_vkFreeFunction  pfnFree
	 */ 
	 public PFNvkFreeFunction pfnFree(){

		  ByteBuffer handle = pfnFree0(super.ptr);
		 if(handle == null){
		    this.pfnFree = null;
		    return null;
		  } else 
 		 if(this.pfnFree == null){
		    this.pfnFree = new PFNvkFreeFunction(handle);
		 }else{
		    this.pfnFree.setHandle(handle);
		  }
		 return this.pfnFree;
	 }

	/**
	 * Set method for field pfnInternalAllocation	[vkpfn]<br>
	 * Prototype: PFN_vkInternalAllocationNotification  pfnInternalAllocation
	 */ 
	 public void pfnInternalAllocation(PFNvkInternalAllocationNotification pfnInternalAllocation){
		 this.pfnInternalAllocation = pfnInternalAllocation;
		 ByteBuffer buff = (pfnInternalAllocation==null) ? null : pfnInternalAllocation.getHandle();
		 pfnInternalAllocation0(this.ptr, buff);
	 }

	/**
	 * Get method for field pfnInternalAllocation	[vkpfn]<br>
	 * Prototype: PFN_vkInternalAllocationNotification  pfnInternalAllocation
	 */ 
	 public PFNvkInternalAllocationNotification pfnInternalAllocation(){

		  ByteBuffer handle = pfnInternalAllocation0(super.ptr);
		 if(handle == null){
		    this.pfnInternalAllocation = null;
		    return null;
		  } else 
 		 if(this.pfnInternalAllocation == null){
		    this.pfnInternalAllocation = new PFNvkInternalAllocationNotification(handle);
		 }else{
		    this.pfnInternalAllocation.setHandle(handle);
		  }
		 return this.pfnInternalAllocation;
	 }

	/**
	 * Set method for field pfnInternalFree	[vkpfn]<br>
	 * Prototype: PFN_vkInternalFreeNotification  pfnInternalFree
	 */ 
	 public void pfnInternalFree(PFNvkInternalFreeNotification pfnInternalFree){
		 this.pfnInternalFree = pfnInternalFree;
		 ByteBuffer buff = (pfnInternalFree==null) ? null : pfnInternalFree.getHandle();
		 pfnInternalFree0(this.ptr, buff);
	 }

	/**
	 * Get method for field pfnInternalFree	[vkpfn]<br>
	 * Prototype: PFN_vkInternalFreeNotification  pfnInternalFree
	 */ 
	 public PFNvkInternalFreeNotification pfnInternalFree(){

		  ByteBuffer handle = pfnInternalFree0(super.ptr);
		 if(handle == null){
		    this.pfnInternalFree = null;
		    return null;
		  } else 
 		 if(this.pfnInternalFree == null){
		    this.pfnInternalFree = new PFNvkInternalFreeNotification(handle);
		 }else{
		    this.pfnInternalFree.setHandle(handle);
		  }
		 return this.pfnInternalFree;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field pUserData	[buffer]<br>
	 * Prototype: void*  pUserData
	 */ 
	 private static native void pUserData0(Buffer ptr, java.nio.Buffer _pUserData);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  vkObj->pUserData = (void*) (_pUserData);
	  */

	/**
	 * native GET method for field pUserData	[buffer]<br>
	 * Prototype: void*  pUserData
	 */ 
	 private static native java.nio.Buffer pUserData0(Buffer ptr);/*
		  VkAllocationCallbacks vkObj = (VkAllocationCallbacks*)(ptr);
		  return (jobject) (vkObj->pUserData);
	 */

	/**
	 * native SET method for field pfnAllocation	[vkpfn]<br>
	 * Prototype: PFN_vkAllocationFunction  pfnAllocation
	 */ 
	 private static native void pfnAllocation0(Buffer ptr, java.nio.ByteBuffer  _pfnAllocation);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  vkObj->pfnAllocation = (PFN_vkAllocationFunction) (_pfnAllocation);
	  */

	/**
	 * native GET method for field pfnAllocation	[vkpfn]<br>
	 * Prototype: PFN_vkAllocationFunction  pfnAllocation
	 */ 
	 private static native java.nio.ByteBuffer  pfnAllocation0(Buffer ptr);/*
		  VkAllocationCallbacks vkObj = (VkAllocationCallbacks*)(ptr);
		  return (PFNvkAllocationFunction) (vkObj->pfnAllocation);
	 */

	/**
	 * native SET method for field pfnReallocation	[vkpfn]<br>
	 * Prototype: PFN_vkReallocationFunction  pfnReallocation
	 */ 
	 private static native void pfnReallocation0(Buffer ptr, java.nio.ByteBuffer  _pfnReallocation);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  vkObj->pfnReallocation = (PFN_vkReallocationFunction) (_pfnReallocation);
	  */

	/**
	 * native GET method for field pfnReallocation	[vkpfn]<br>
	 * Prototype: PFN_vkReallocationFunction  pfnReallocation
	 */ 
	 private static native java.nio.ByteBuffer  pfnReallocation0(Buffer ptr);/*
		  VkAllocationCallbacks vkObj = (VkAllocationCallbacks*)(ptr);
		  return (PFNvkReallocationFunction) (vkObj->pfnReallocation);
	 */

	/**
	 * native SET method for field pfnFree	[vkpfn]<br>
	 * Prototype: PFN_vkFreeFunction  pfnFree
	 */ 
	 private static native void pfnFree0(Buffer ptr, java.nio.ByteBuffer  _pfnFree);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  vkObj->pfnFree = (PFN_vkFreeFunction) (_pfnFree);
	  */

	/**
	 * native GET method for field pfnFree	[vkpfn]<br>
	 * Prototype: PFN_vkFreeFunction  pfnFree
	 */ 
	 private static native java.nio.ByteBuffer  pfnFree0(Buffer ptr);/*
		  VkAllocationCallbacks vkObj = (VkAllocationCallbacks*)(ptr);
		  return (PFNvkFreeFunction) (vkObj->pfnFree);
	 */

	/**
	 * native SET method for field pfnInternalAllocation	[vkpfn]<br>
	 * Prototype: PFN_vkInternalAllocationNotification  pfnInternalAllocation
	 */ 
	 private static native void pfnInternalAllocation0(Buffer ptr, java.nio.ByteBuffer  _pfnInternalAllocation);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  vkObj->pfnInternalAllocation = (PFN_vkInternalAllocationNotification) (_pfnInternalAllocation);
	  */

	/**
	 * native GET method for field pfnInternalAllocation	[vkpfn]<br>
	 * Prototype: PFN_vkInternalAllocationNotification  pfnInternalAllocation
	 */ 
	 private static native java.nio.ByteBuffer  pfnInternalAllocation0(Buffer ptr);/*
		  VkAllocationCallbacks vkObj = (VkAllocationCallbacks*)(ptr);
		  return (PFNvkInternalAllocationNotification) (vkObj->pfnInternalAllocation);
	 */

	/**
	 * native SET method for field pfnInternalFree	[vkpfn]<br>
	 * Prototype: PFN_vkInternalFreeNotification  pfnInternalFree
	 */ 
	 private static native void pfnInternalFree0(Buffer ptr, java.nio.ByteBuffer  _pfnInternalFree);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  vkObj->pfnInternalFree = (PFN_vkInternalFreeNotification) (_pfnInternalFree);
	  */

	/**
	 * native GET method for field pfnInternalFree	[vkpfn]<br>
	 * Prototype: PFN_vkInternalFreeNotification  pfnInternalFree
	 */ 
	 private static native java.nio.ByteBuffer  pfnInternalFree0(Buffer ptr);/*
		  VkAllocationCallbacks vkObj = (VkAllocationCallbacks*)(ptr);
		  return (PFNvkInternalFreeNotification) (vkObj->pfnInternalFree);
	 */



} // end of class VkAllocationCallbacks
