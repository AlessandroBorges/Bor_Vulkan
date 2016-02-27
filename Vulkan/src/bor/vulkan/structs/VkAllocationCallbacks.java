// class wrapping Vulkan's VkAllocationCallbacks struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkAllocationCallbacks 
 * @Author Alessandro Borges 
 */
public class VkAllocationCallbacks extends VkStruct {
	/** ID of this structure [3]  */
	 public static final int TAG = VKALLOCATIONCALLBACKS_ID;

	 // fields //
	/**
	 *  void* 	pUserData 
	 */ 
	ByteBuffer 	pUserData;

	/**
	 *  PFN_vkAllocationFunction 	pfnAllocation 
	 */ 
	PFN_vkAllocationFunction 	pfnAllocation;

	/**
	 *  PFN_vkReallocationFunction 	pfnReallocation 
	 */ 
	PFN_vkReallocationFunction 	pfnReallocation;

	/**
	 *  PFN_vkFreeFunction 	pfnFree 
	 */ 
	PFN_vkFreeFunction 	pfnFree;

	/**
	 *  PFN_vkInternalAllocationNotification 	pfnInternalAllocation 
	 */ 
	PFN_vkInternalAllocationNotification 	pfnInternalAllocation;

	/**
	 *  PFN_vkInternalFreeNotification 	pfnInternalFree 
	 */ 
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
		 return sizeOf(TAG); 
	}


	 // /////////////////////
	 //  SETTERS & GETTERS //
	 // /////////////////////

	/**
	 * Set method for field pUserData
	 * Prototype: void*  pUserData
	 */ 
	 public void pUserData(ByteBuffer pUserData){
		 this.pUserData = pUserData;
		pUserData0(super.ptr, pUserData);
	 }

	/**
	 * get method for field pUserData
	 * Prototype: void*  pUserData
	 */ 
	 public ByteBuffer pUserData(){
		 // return  this.pUserData;
		 return pUserData0(super.ptr);
	 }

	/**
	 * Set method for field pfnAllocation
	 * Prototype: PFN_vkAllocationFunction  pfnAllocation
	 */ 
	 public void pfnAllocation(PFN_vkAllocationFunction pfnAllocation){
		 this.pfnAllocation = pfnAllocation;
		pfnAllocation0(super.ptr, pfnAllocation);
	 }

	/**
	 * get method for field pfnAllocation
	 * Prototype: PFN_vkAllocationFunction  pfnAllocation
	 */ 
	 public PFN_vkAllocationFunction pfnAllocation(){
		 // return  this.pfnAllocation;
		 return pfnAllocation0(super.ptr);
	 }

	/**
	 * Set method for field pfnReallocation
	 * Prototype: PFN_vkReallocationFunction  pfnReallocation
	 */ 
	 public void pfnReallocation(PFN_vkReallocationFunction pfnReallocation){
		 this.pfnReallocation = pfnReallocation;
		pfnReallocation0(super.ptr, pfnReallocation);
	 }

	/**
	 * get method for field pfnReallocation
	 * Prototype: PFN_vkReallocationFunction  pfnReallocation
	 */ 
	 public PFN_vkReallocationFunction pfnReallocation(){
		 // return  this.pfnReallocation;
		 return pfnReallocation0(super.ptr);
	 }

	/**
	 * Set method for field pfnFree
	 * Prototype: PFN_vkFreeFunction  pfnFree
	 */ 
	 public void pfnFree(PFN_vkFreeFunction pfnFree){
		 this.pfnFree = pfnFree;
		pfnFree0(super.ptr, pfnFree);
	 }

	/**
	 * get method for field pfnFree
	 * Prototype: PFN_vkFreeFunction  pfnFree
	 */ 
	 public PFN_vkFreeFunction pfnFree(){
		 // return  this.pfnFree;
		 return pfnFree0(super.ptr);
	 }

	/**
	 * Set method for field pfnInternalAllocation
	 * Prototype: PFN_vkInternalAllocationNotification  pfnInternalAllocation
	 */ 
	 public void pfnInternalAllocation(PFN_vkInternalAllocationNotification pfnInternalAllocation){
		 this.pfnInternalAllocation = pfnInternalAllocation;
		pfnInternalAllocation0(super.ptr, pfnInternalAllocation);
	 }

	/**
	 * get method for field pfnInternalAllocation
	 * Prototype: PFN_vkInternalAllocationNotification  pfnInternalAllocation
	 */ 
	 public PFN_vkInternalAllocationNotification pfnInternalAllocation(){
		 // return  this.pfnInternalAllocation;
		 return pfnInternalAllocation0(super.ptr);
	 }

	/**
	 * Set method for field pfnInternalFree
	 * Prototype: PFN_vkInternalFreeNotification  pfnInternalFree
	 */ 
	 public void pfnInternalFree(PFN_vkInternalFreeNotification pfnInternalFree){
		 this.pfnInternalFree = pfnInternalFree;
		pfnInternalFree0(super.ptr, pfnInternalFree);
	 }

	/**
	 * get method for field pfnInternalFree
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
	 private static native void pUserData0(ByteBuffer ptr, ByteBuffer _pUserData);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(*ptr);
		  _obj.pUserData = (void*) (_pUserData);
	  */

	/**
	 * get method for field pUserData
	 * Prototype: void*  pUserData
	 */ 
	 private static native ByteBuffer pUserData0(ByteBuffer ptr);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(ptr);
		  return (ByteBuffer) (_obj.void*);
	 */

	/**
	 * native Set method for field pfnAllocation
	 * Prototype: PFN_vkAllocationFunction  pfnAllocation
	 */ 
	 private static native void pfnAllocation0(ByteBuffer ptr, PFN_vkAllocationFunction _pfnAllocation);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(*ptr);
		  _obj.pfnAllocation = (PFN_vkAllocationFunction) (_pfnAllocation);
	  */

	/**
	 * get method for field pfnAllocation
	 * Prototype: PFN_vkAllocationFunction  pfnAllocation
	 */ 
	 private static native PFN_vkAllocationFunction pfnAllocation0(ByteBuffer ptr);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(ptr);
		  return (PFN_vkAllocationFunction) (_obj.PFN_vkAllocationFunction);
	 */

	/**
	 * native Set method for field pfnReallocation
	 * Prototype: PFN_vkReallocationFunction  pfnReallocation
	 */ 
	 private static native void pfnReallocation0(ByteBuffer ptr, PFN_vkReallocationFunction _pfnReallocation);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(*ptr);
		  _obj.pfnReallocation = (PFN_vkReallocationFunction) (_pfnReallocation);
	  */

	/**
	 * get method for field pfnReallocation
	 * Prototype: PFN_vkReallocationFunction  pfnReallocation
	 */ 
	 private static native PFN_vkReallocationFunction pfnReallocation0(ByteBuffer ptr);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(ptr);
		  return (PFN_vkReallocationFunction) (_obj.PFN_vkReallocationFunction);
	 */

	/**
	 * native Set method for field pfnFree
	 * Prototype: PFN_vkFreeFunction  pfnFree
	 */ 
	 private static native void pfnFree0(ByteBuffer ptr, PFN_vkFreeFunction _pfnFree);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(*ptr);
		  _obj.pfnFree = (PFN_vkFreeFunction) (_pfnFree);
	  */

	/**
	 * get method for field pfnFree
	 * Prototype: PFN_vkFreeFunction  pfnFree
	 */ 
	 private static native PFN_vkFreeFunction pfnFree0(ByteBuffer ptr);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(ptr);
		  return (PFN_vkFreeFunction) (_obj.PFN_vkFreeFunction);
	 */

	/**
	 * native Set method for field pfnInternalAllocation
	 * Prototype: PFN_vkInternalAllocationNotification  pfnInternalAllocation
	 */ 
	 private static native void pfnInternalAllocation0(ByteBuffer ptr, PFN_vkInternalAllocationNotification _pfnInternalAllocation);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(*ptr);
		  _obj.pfnInternalAllocation = (PFN_vkInternalAllocationNotification) (_pfnInternalAllocation);
	  */

	/**
	 * get method for field pfnInternalAllocation
	 * Prototype: PFN_vkInternalAllocationNotification  pfnInternalAllocation
	 */ 
	 private static native PFN_vkInternalAllocationNotification pfnInternalAllocation0(ByteBuffer ptr);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(ptr);
		  return (PFN_vkInternalAllocationNotification) (_obj.PFN_vkInternalAllocationNotification);
	 */

	/**
	 * native Set method for field pfnInternalFree
	 * Prototype: PFN_vkInternalFreeNotification  pfnInternalFree
	 */ 
	 private static native void pfnInternalFree0(ByteBuffer ptr, PFN_vkInternalFreeNotification _pfnInternalFree);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(*ptr);
		  _obj.pfnInternalFree = (PFN_vkInternalFreeNotification) (_pfnInternalFree);
	  */

	/**
	 * get method for field pfnInternalFree
	 * Prototype: PFN_vkInternalFreeNotification  pfnInternalFree
	 */ 
	 private static native PFN_vkInternalFreeNotification pfnInternalFree0(ByteBuffer ptr);/*
		  VkAllocationCallbacks _obj = (VkAllocationCallbacks)(ptr);
		  return (PFN_vkInternalFreeNotification) (_obj.PFN_vkInternalFreeNotification);
	 */



} // end of class VkAllocationCallbacks
