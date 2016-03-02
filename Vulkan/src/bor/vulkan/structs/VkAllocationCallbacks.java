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
	/** TAG of this structure [127]  */
	 private static final String TAG = "VkAllocationCallbacks";

	/** ID of this structure [127]  */
	 public static final int TAG_ID = VKALLOCATIONCALLBACKS_ID;

	 // fields //
	/**
	 *  void* 	pUserData		 */ 
	java.nio.Buffer 	pUserData;

	/**
	 *  PFN_vkAllocationFunction 	pfnAllocation	[vkhandle]	 */ 
	PFN_vkAllocationFunction 	pfnAllocation;

	/**
	 *  PFN_vkReallocationFunction 	pfnReallocation	[vkhandle]	 */ 
	PFN_vkReallocationFunction 	pfnReallocation;

	/**
	 *  PFN_vkFreeFunction 	pfnFree	[vkhandle]	 */ 
	PFN_vkFreeFunction 	pfnFree;

	/**
	 *  PFN_vkInternalAllocationNotification 	pfnInternalAllocation	[vkhandle]	 */ 
	PFN_vkInternalAllocationNotification 	pfnInternalAllocation;

	/**
	 *  PFN_vkInternalFreeNotification 	pfnInternalFree	[vkhandle]	 */ 
	PFN_vkInternalFreeNotification 	pfnInternalFree;

	/**
	 * Ctor
	 */
	public VkAllocationCallbacks(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field pUserData	
	 * Prototype: void*  pUserData
	 */ 
	 public void pUserData(java.nio.Buffer pUserData){
		 this.pUserData = pUserData;
		pUserData0(super.ptr, pUserData);
	 }

	/**
	 * get method for field pUserData	
	 * Prototype: void*  pUserData
	 */ 
	 public java.nio.Buffer pUserData(){
		 // return  this.pUserData;
		 return pUserData0(super.ptr);
	 }

	/**
	 * Set method for field pfnAllocation	[vkhandle]
	 * Prototype: PFN_vkAllocationFunction  pfnAllocation
	 */ 
	 public void pfnAllocation(PFN_vkAllocationFunction pfnAllocation){
		 this.pfnAllocation = pfnAllocation;
		pfnAllocation0(super.ptr, pfnAllocation);
	 }

	/**
	 * get method for field pfnAllocation	[vkhandle]
	 * Prototype: PFN_vkAllocationFunction  pfnAllocation
	 */ 
	 public PFN_vkAllocationFunction pfnAllocation(){
		 // return  this.pfnAllocation;
		 return pfnAllocation0(super.ptr);
	 }

	/**
	 * Set method for field pfnReallocation	[vkhandle]
	 * Prototype: PFN_vkReallocationFunction  pfnReallocation
	 */ 
	 public void pfnReallocation(PFN_vkReallocationFunction pfnReallocation){
		 this.pfnReallocation = pfnReallocation;
		pfnReallocation0(super.ptr, pfnReallocation);
	 }

	/**
	 * get method for field pfnReallocation	[vkhandle]
	 * Prototype: PFN_vkReallocationFunction  pfnReallocation
	 */ 
	 public PFN_vkReallocationFunction pfnReallocation(){
		 // return  this.pfnReallocation;
		 return pfnReallocation0(super.ptr);
	 }

	/**
	 * Set method for field pfnFree	[vkhandle]
	 * Prototype: PFN_vkFreeFunction  pfnFree
	 */ 
	 public void pfnFree(PFN_vkFreeFunction pfnFree){
		 this.pfnFree = pfnFree;
		pfnFree0(super.ptr, pfnFree);
	 }

	/**
	 * get method for field pfnFree	[vkhandle]
	 * Prototype: PFN_vkFreeFunction  pfnFree
	 */ 
	 public PFN_vkFreeFunction pfnFree(){
		 // return  this.pfnFree;
		 return pfnFree0(super.ptr);
	 }

	/**
	 * Set method for field pfnInternalAllocation	[vkhandle]
	 * Prototype: PFN_vkInternalAllocationNotification  pfnInternalAllocation
	 */ 
	 public void pfnInternalAllocation(PFN_vkInternalAllocationNotification pfnInternalAllocation){
		 this.pfnInternalAllocation = pfnInternalAllocation;
		pfnInternalAllocation0(super.ptr, pfnInternalAllocation);
	 }

	/**
	 * get method for field pfnInternalAllocation	[vkhandle]
	 * Prototype: PFN_vkInternalAllocationNotification  pfnInternalAllocation
	 */ 
	 public PFN_vkInternalAllocationNotification pfnInternalAllocation(){
		 // return  this.pfnInternalAllocation;
		 return pfnInternalAllocation0(super.ptr);
	 }

	/**
	 * Set method for field pfnInternalFree	[vkhandle]
	 * Prototype: PFN_vkInternalFreeNotification  pfnInternalFree
	 */ 
	 public void pfnInternalFree(PFN_vkInternalFreeNotification pfnInternalFree){
		 this.pfnInternalFree = pfnInternalFree;
		pfnInternalFree0(super.ptr, pfnInternalFree);
	 }

	/**
	 * get method for field pfnInternalFree	[vkhandle]
	 * Prototype: PFN_vkInternalFreeNotification  pfnInternalFree
	 */ 
	 public PFN_vkInternalFreeNotification pfnInternalFree(){
		 // return  this.pfnInternalFree;
		 return pfnInternalFree0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field pUserData	
	 * Prototype: void*  pUserData
	 */ 
	 private static native void pUserData0(ByteBuffer ptr, java.nio.Buffer _pUserData);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(*ptr);
		  _obj.pUserData = (void*) (_pUserData);
	  */

	/**
	 * get method for field pUserData	
	 * Prototype: void*  pUserData
	 */ 
	 private static native java.nio.Buffer pUserData0(ByteBuffer ptr);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(ptr);
		  return (java.nio.Buffer) (_obj.void*);
	 */

	/**
	 * native Set method for field pfnAllocation	[vkhandle]
	 * Prototype: PFN_vkAllocationFunction  pfnAllocation
	 */ 
	 private static native void pfnAllocation0(ByteBuffer ptr, PFN_vkAllocationFunction _pfnAllocation);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(*ptr);
		  _obj.pfnAllocation = (PFN_vkAllocationFunction) (_pfnAllocation);
	  */

	/**
	 * get method for field pfnAllocation	[vkhandle]
	 * Prototype: PFN_vkAllocationFunction  pfnAllocation
	 */ 
	 private static native PFN_vkAllocationFunction pfnAllocation0(ByteBuffer ptr);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(ptr);
		  return (PFN_vkAllocationFunction) (_obj.PFN_vkAllocationFunction);
	 */

	/**
	 * native Set method for field pfnReallocation	[vkhandle]
	 * Prototype: PFN_vkReallocationFunction  pfnReallocation
	 */ 
	 private static native void pfnReallocation0(ByteBuffer ptr, PFN_vkReallocationFunction _pfnReallocation);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(*ptr);
		  _obj.pfnReallocation = (PFN_vkReallocationFunction) (_pfnReallocation);
	  */

	/**
	 * get method for field pfnReallocation	[vkhandle]
	 * Prototype: PFN_vkReallocationFunction  pfnReallocation
	 */ 
	 private static native PFN_vkReallocationFunction pfnReallocation0(ByteBuffer ptr);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(ptr);
		  return (PFN_vkReallocationFunction) (_obj.PFN_vkReallocationFunction);
	 */

	/**
	 * native Set method for field pfnFree	[vkhandle]
	 * Prototype: PFN_vkFreeFunction  pfnFree
	 */ 
	 private static native void pfnFree0(ByteBuffer ptr, PFN_vkFreeFunction _pfnFree);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(*ptr);
		  _obj.pfnFree = (PFN_vkFreeFunction) (_pfnFree);
	  */

	/**
	 * get method for field pfnFree	[vkhandle]
	 * Prototype: PFN_vkFreeFunction  pfnFree
	 */ 
	 private static native PFN_vkFreeFunction pfnFree0(ByteBuffer ptr);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(ptr);
		  return (PFN_vkFreeFunction) (_obj.PFN_vkFreeFunction);
	 */

	/**
	 * native Set method for field pfnInternalAllocation	[vkhandle]
	 * Prototype: PFN_vkInternalAllocationNotification  pfnInternalAllocation
	 */ 
	 private static native void pfnInternalAllocation0(ByteBuffer ptr, PFN_vkInternalAllocationNotification _pfnInternalAllocation);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(*ptr);
		  _obj.pfnInternalAllocation = (PFN_vkInternalAllocationNotification) (_pfnInternalAllocation);
	  */

	/**
	 * get method for field pfnInternalAllocation	[vkhandle]
	 * Prototype: PFN_vkInternalAllocationNotification  pfnInternalAllocation
	 */ 
	 private static native PFN_vkInternalAllocationNotification pfnInternalAllocation0(ByteBuffer ptr);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(ptr);
		  return (PFN_vkInternalAllocationNotification) (_obj.PFN_vkInternalAllocationNotification);
	 */

	/**
	 * native Set method for field pfnInternalFree	[vkhandle]
	 * Prototype: PFN_vkInternalFreeNotification  pfnInternalFree
	 */ 
	 private static native void pfnInternalFree0(ByteBuffer ptr, PFN_vkInternalFreeNotification _pfnInternalFree);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(*ptr);
		  _obj.pfnInternalFree = (PFN_vkInternalFreeNotification) (_pfnInternalFree);
	  */

	/**
	 * get method for field pfnInternalFree	[vkhandle]
	 * Prototype: PFN_vkInternalFreeNotification  pfnInternalFree
	 */ 
	 private static native PFN_vkInternalFreeNotification pfnInternalFree0(ByteBuffer ptr);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(ptr);
		  return (PFN_vkInternalFreeNotification) (_obj.PFN_vkInternalFreeNotification);
	 */



} // end of class VkAllocationCallbacks
