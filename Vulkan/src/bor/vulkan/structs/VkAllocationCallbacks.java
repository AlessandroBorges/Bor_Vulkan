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

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.*;
import java.nio.ByteBuffer;


/**
 *  Project Bor-Vulkan 
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkAllocationCallbacks. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkAllocationCallbacks {
 *     void*                                   pUserData;
 *     PFNvkAllocationFunction                pfnAllocation;
 *     PFNvkReallocationFunction              pfnReallocation;
 *     PFNvkFreeFunction                      pfnFree;
 *     PFNvkInternalAllocationNotification    pfnInternalAllocation;
 *     PFNvkInternalFreeNotification          pfnInternalFree;
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

	 // fields //
	/**
	 *  void* 	pUserData	[buffer]
	 */ 
	java.nio.Buffer 	pUserData;

	/**
	 *  PFNvkAllocationFunction 	pfnAllocation	[vkhandle]
	 */ 
	PFNvkAllocationFunction 	pfnAllocation;

	/**
	 *  PFNvkReallocationFunction 	pfnReallocation	[vkhandle]
	 */ 
	PFNvkReallocationFunction 	pfnReallocation;

	/**
	 *  PFNvkFreeFunction 	pfnFree	[vkhandle]
	 */ 
	PFNvkFreeFunction 	pfnFree;

	/**
	 *  PFNvkInternalAllocationNotification 	pfnInternalAllocation	[vkhandle]
	 */ 
	PFNvkInternalAllocationNotification 	pfnInternalAllocation;

	/**
	 *  PFNvkInternalFreeNotification 	pfnInternalFree	[vkhandle]
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

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field pUserData	[buffer]<br>
	 * Prototype: void*  pUserData
	 */ 
	 public void pUserData(java.nio.Buffer pUserData){
		 this.pUserData = pUserData;
		pUserData0(super.ptr, pUserData);
	 }

	/**
	 * get method for field pUserData	[buffer]<br>
	 * Prototype: void*  pUserData
	 */ 
	 public java.nio.Buffer pUserData(){
		 // return  this.pUserData;
		 return pUserData0(super.ptr);
	 }

	/**
	 * Set method for field pfnAllocation	[vkhandle]<br>
	 * Prototype: PFNvkAllocationFunction  pfnAllocation
	 */ 
	 public void pfnAllocation(PFNvkAllocationFunction pfnAllocation){
		 this.pfnAllocation = pfnAllocation;
		pfnAllocation0(super.ptr, pfnAllocation);
	 }

	/**
	 * get method for field pfnAllocation	[vkhandle]<br>
	 * Prototype: PFNvkAllocationFunction  pfnAllocation
	 */ 
	 public PFNvkAllocationFunction pfnAllocation(){
		 // return  this.pfnAllocation;
		 return pfnAllocation0(super.ptr);
	 }

	/**
	 * Set method for field pfnReallocation	[vkhandle]<br>
	 * Prototype: PFNvkReallocationFunction  pfnReallocation
	 */ 
	 public void pfnReallocation(PFNvkReallocationFunction pfnReallocation){
		 this.pfnReallocation = pfnReallocation;
		pfnReallocation0(super.ptr, pfnReallocation);
	 }

	/**
	 * get method for field pfnReallocation	[vkhandle]<br>
	 * Prototype: PFNvkReallocationFunction  pfnReallocation
	 */ 
	 public PFNvkReallocationFunction pfnReallocation(){
		 // return  this.pfnReallocation;
		 return pfnReallocation0(super.ptr);
	 }

	/**
	 * Set method for field pfnFree	[vkhandle]<br>
	 * Prototype: PFNvkFreeFunction  pfnFree
	 */ 
	 public void pfnFree(PFNvkFreeFunction pfnFree){
		 this.pfnFree = pfnFree;
		pfnFree0(super.ptr, pfnFree);
	 }

	/**
	 * get method for field pfnFree	[vkhandle]<br>
	 * Prototype: PFNvkFreeFunction  pfnFree
	 */ 
	 public PFNvkFreeFunction pfnFree(){
		 // return  this.pfnFree;
		 return pfnFree0(super.ptr);
	 }

	/**
	 * Set method for field pfnInternalAllocation	[vkhandle]<br>
	 * Prototype: PFNvkInternalAllocationNotification  pfnInternalAllocation
	 */ 
	 public void pfnInternalAllocation(PFNvkInternalAllocationNotification pfnInternalAllocation){
		 this.pfnInternalAllocation = pfnInternalAllocation;
		pfnInternalAllocation0(super.ptr, pfnInternalAllocation);
	 }

	/**
	 * get method for field pfnInternalAllocation	[vkhandle]<br>
	 * Prototype: PFNvkInternalAllocationNotification  pfnInternalAllocation
	 */ 
	 public PFNvkInternalAllocationNotification pfnInternalAllocation(){
		 // return  this.pfnInternalAllocation;
		 return pfnInternalAllocation0(super.ptr);
	 }

	/**
	 * Set method for field pfnInternalFree	[vkhandle]<br>
	 * Prototype: PFNvkInternalFreeNotification  pfnInternalFree
	 */ 
	 public void pfnInternalFree(PFNvkInternalFreeNotification pfnInternalFree){
		 this.pfnInternalFree = pfnInternalFree;
		pfnInternalFree0(super.ptr, pfnInternalFree);
	 }

	/**
	 * get method for field pfnInternalFree	[vkhandle]<br>
	 * Prototype: PFNvkInternalFreeNotification  pfnInternalFree
	 */ 
	 public PFNvkInternalFreeNotification pfnInternalFree(){
		 // return  this.pfnInternalFree;
		 return pfnInternalFree0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field pUserData	[buffer]<br>
	 * Prototype: void*  pUserData
	 */ 
	 private static native void pUserData0(ByteBuffer ptr, java.nio.Buffer _pUserData);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(*ptr);
		  _obj.pUserData = (void*) (_pUserData);
	  */

	/**
	 * native GET method for field pUserData	[buffer]<br>
	 * Prototype: void*  pUserData
	 */ 
	 private static native java.nio.Buffer pUserData0(ByteBuffer ptr);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(ptr);
		  return (java.nio.Buffer) (_obj.void*);
	 */

	/**
	 * native SET method for field pfnAllocation	[vkhandle]<br>
	 * Prototype: PFNvkAllocationFunction  pfnAllocation
	 */ 
	 private static native void pfnAllocation0(ByteBuffer ptr, PFNvkAllocationFunction _pfnAllocation);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(*ptr);
		  _obj.pfnAllocation = (PFNvkAllocationFunction) (_pfnAllocation);
	  */

	/**
	 * native GET method for field pfnAllocation	[vkhandle]<br>
	 * Prototype: PFNvkAllocationFunction  pfnAllocation
	 */ 
	 private static native PFNvkAllocationFunction pfnAllocation0(ByteBuffer ptr);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(ptr);
		  return (PFNvkAllocationFunction) (_obj.PFN_vkAllocationFunction);
	 */

	/**
	 * native SET method for field pfnReallocation	[vkhandle]<br>
	 * Prototype: PFNvkReallocationFunction  pfnReallocation
	 */ 
	 private static native void pfnReallocation0(ByteBuffer ptr, PFNvkReallocationFunction _pfnReallocation);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(*ptr);
		  _obj.pfnReallocation = (PFNvkReallocationFunction) (_pfnReallocation);
	  */

	/**
	 * native GET method for field pfnReallocation	[vkhandle]<br>
	 * Prototype: PFNvkReallocationFunction  pfnReallocation
	 */ 
	 private static native PFNvkReallocationFunction pfnReallocation0(ByteBuffer ptr);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(ptr);
		  return (PFNvkReallocationFunction) (_obj.PFN_vkReallocationFunction);
	 */

	/**
	 * native SET method for field pfnFree	[vkhandle]<br>
	 * Prototype: PFNvkFreeFunction  pfnFree
	 */ 
	 private static native void pfnFree0(ByteBuffer ptr, PFNvkFreeFunction _pfnFree);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(*ptr);
		  _obj.pfnFree = (PFNvkFreeFunction) (_pfnFree);
	  */

	/**
	 * native GET method for field pfnFree	[vkhandle]<br>
	 * Prototype: PFNvkFreeFunction  pfnFree
	 */ 
	 private static native PFNvkFreeFunction pfnFree0(ByteBuffer ptr);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(ptr);
		  return (PFNvkFreeFunction) (_obj.PFN_vkFreeFunction);
	 */

	/**
	 * native SET method for field pfnInternalAllocation	[vkhandle]<br>
	 * Prototype: PFNvkInternalAllocationNotification  pfnInternalAllocation
	 */ 
	 private static native void pfnInternalAllocation0(ByteBuffer ptr, PFNvkInternalAllocationNotification _pfnInternalAllocation);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(*ptr);
		  _obj.pfnInternalAllocation = (PFNvkInternalAllocationNotification) (_pfnInternalAllocation);
	  */

	/**
	 * native GET method for field pfnInternalAllocation	[vkhandle]<br>
	 * Prototype: PFNvkInternalAllocationNotification  pfnInternalAllocation
	 */ 
	 private static native PFNvkInternalAllocationNotification pfnInternalAllocation0(ByteBuffer ptr);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(ptr);
		  return (PFNvkInternalAllocationNotification) (_obj.PFN_vkInternalAllocationNotification);
	 */

	/**
	 * native SET method for field pfnInternalFree	[vkhandle]<br>
	 * Prototype: PFNvkInternalFreeNotification  pfnInternalFree
	 */ 
	 private static native void pfnInternalFree0(ByteBuffer ptr, PFNvkInternalFreeNotification _pfnInternalFree);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(*ptr);
		  _obj.pfnInternalFree = (PFNvkInternalFreeNotification) (_pfnInternalFree);
	  */

	/**
	 * native GET method for field pfnInternalFree	[vkhandle]<br>
	 * Prototype: PFNvkInternalFreeNotification  pfnInternalFree
	 */ 
	 private static native PFNvkInternalFreeNotification pfnInternalFree0(ByteBuffer ptr);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(ptr);
		  return (PFNvkInternalFreeNotification) (_obj.PFN_vkInternalFreeNotification);
	 */



} // end of class VkAllocationCallbacks
