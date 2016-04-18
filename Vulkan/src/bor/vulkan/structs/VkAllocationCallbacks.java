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

import bor.util.Utils;
import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.*;
import java.nio.ByteBuffer;

import java.nio.Buffer;


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

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

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
	 public VkAllocationCallbacks(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkAllocationCallbacks(long address){ 
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
		 setPUserData0(this.ptr,  pUserData);
	 }

	/**
	 * Get method for field pUserData	[buffer]<br>
	 * Prototype: void*  pUserData
	 */ 
	 public java.nio.Buffer pUserData(){
		  long address = getPUserData0(super.ptr);
		  if(this.pUserData==null && address != 0){
		      ByteBuffer bb = Utils.wrapPointer(address, 8);
		      this.pUserData = bb;      
		  }
		  
		 
		 return this.pUserData;
	 }

	/**
	 * Set method for field pfnAllocation	[vkpfn]<br>
	 * Prototype: PFN_vkAllocationFunction  pfnAllocation
	 */ 
	 public void pfnAllocation(PFNvkAllocationFunction pfnAllocation){
		 this.pfnAllocation = pfnAllocation;
		 ByteBuffer buff = (pfnAllocation==null) ? null : pfnAllocation.getPointer();
		 setPfnAllocation0(this.ptr, buff);
	 }

	/**
	 * Get method for field pfnAllocation	[vkpfn]<br>
	 * Prototype: PFN_vkAllocationFunction  pfnAllocation
	 */ 
	 public PFNvkAllocationFunction pfnAllocation(){

		  long handle = getPfnAllocation0(super.ptr);
		 if(handle == 0){
		    this.pfnAllocation = null;
		    return null;
		  }  

		 if(this.pfnAllocation == null){
		    this.pfnAllocation = new PFNvkAllocationFunction(handle);
		 }else{
		    this.pfnAllocation.setPointer(handle);
		  }
		 return this.pfnAllocation;
	 }

	/**
	 * Set method for field pfnReallocation	[vkpfn]<br>
	 * Prototype: PFN_vkReallocationFunction  pfnReallocation
	 */ 
	 public void pfnReallocation(PFNvkReallocationFunction pfnReallocation){
		 this.pfnReallocation = pfnReallocation;
		 ByteBuffer buff = (pfnReallocation==null) ? null : pfnReallocation.getPointer();
		 setPfnReallocation0(this.ptr, buff);
	 }

	/**
	 * Get method for field pfnReallocation	[vkpfn]<br>
	 * Prototype: PFN_vkReallocationFunction  pfnReallocation
	 */ 
	 public PFNvkReallocationFunction pfnReallocation(){

		  long handle = getPfnReallocation0(super.ptr);
		 if(handle == 0){
		    this.pfnReallocation = null;
		    return null;
		  }  

		 if(this.pfnReallocation == null){
		    this.pfnReallocation = new PFNvkReallocationFunction(handle);
		 }else{
		    this.pfnReallocation.setPointer(handle);
		  }
		 return this.pfnReallocation;
	 }

	/**
	 * Set method for field pfnFree	[vkpfn]<br>
	 * Prototype: PFN_vkFreeFunction  pfnFree
	 */ 
	 public void pfnFree(PFNvkFreeFunction pfnFree){
		 this.pfnFree = pfnFree;
		 ByteBuffer buff = (pfnFree==null) ? null : pfnFree.getPointer();
		 setPfnFree0(this.ptr, buff);
	 }

	/**
	 * Get method for field pfnFree	[vkpfn]<br>
	 * Prototype: PFN_vkFreeFunction  pfnFree
	 */ 
	 public PFNvkFreeFunction pfnFree(){

		  long handle = getPfnFree0(super.ptr);
		 if(handle == 0){
		    this.pfnFree = null;
		    return null;
		  }  

		 if(this.pfnFree == null){
		    this.pfnFree = new PFNvkFreeFunction(handle);
		 }else{
		    this.pfnFree.setPointer(handle);
		  }
		 return this.pfnFree;
	 }

	/**
	 * Set method for field pfnInternalAllocation	[vkpfn]<br>
	 * Prototype: PFN_vkInternalAllocationNotification  pfnInternalAllocation
	 */ 
	 public void pfnInternalAllocation(PFNvkInternalAllocationNotification pfnInternalAllocation){
		 this.pfnInternalAllocation = pfnInternalAllocation;
		 ByteBuffer buff = (pfnInternalAllocation==null) ? null : pfnInternalAllocation.getPointer();
		 setPfnInternalAllocation0(this.ptr, buff);
	 }

	/**
	 * Get method for field pfnInternalAllocation	[vkpfn]<br>
	 * Prototype: PFN_vkInternalAllocationNotification  pfnInternalAllocation
	 */ 
	 public PFNvkInternalAllocationNotification pfnInternalAllocation(){

		  long handle = getPfnInternalAllocation0(super.ptr);
		 if(handle == 0){
		    this.pfnInternalAllocation = null;
		    return null;
		  }  

		 if(this.pfnInternalAllocation == null){
		    this.pfnInternalAllocation = new PFNvkInternalAllocationNotification(handle);
		 }else{
		    this.pfnInternalAllocation.setPointer(handle);
		  }
		 return this.pfnInternalAllocation;
	 }

	/**
	 * Set method for field pfnInternalFree	[vkpfn]<br>
	 * Prototype: PFN_vkInternalFreeNotification  pfnInternalFree
	 */ 
	 public void pfnInternalFree(PFNvkInternalFreeNotification pfnInternalFree){
		 this.pfnInternalFree = pfnInternalFree;
		 ByteBuffer buff = (pfnInternalFree==null) ? null : pfnInternalFree.getPointer();
		 setPfnInternalFree0(this.ptr, buff);
	 }

	/**
	 * Get method for field pfnInternalFree	[vkpfn]<br>
	 * Prototype: PFN_vkInternalFreeNotification  pfnInternalFree
	 */ 
	 public PFNvkInternalFreeNotification pfnInternalFree(){

		  long handle = getPfnInternalFree0(super.ptr);
		 if(handle == 0){
		    this.pfnInternalFree = null;
		    return null;
		  }  

		 if(this.pfnInternalFree == null){
		    this.pfnInternalFree = new PFNvkInternalFreeNotification(handle);
		 }else{
		    this.pfnInternalFree.setPointer(handle);
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
	 private static native void setPUserData0(Buffer ptr, java.nio.Buffer _pUserData);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  vkObj->pUserData = (void*) (_pUserData);
	  */

	/**
	 * native GET method for field pUserData	[buffer]<br>
	 * Prototype: void*  pUserData
	 */ 
	 private static native long getPUserData0(Buffer ptr);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pUserData);	 */

	/**
	 * native SET method for field pfnAllocation	[vkpfn]<br>
	 * Prototype: PFN_vkAllocationFunction  pfnAllocation
	 */ 
	 private static native void setPfnAllocation0(Buffer ptr, java.nio.ByteBuffer  _pfnAllocation);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  vkObj->pfnAllocation = (PFN_vkAllocationFunction) (_pfnAllocation);
	  */

	/**
	 * native GET method for field pfnAllocation	[vkpfn]<br>
	 * Prototype: PFN_vkAllocationFunction  pfnAllocation
	 */ 
	 private static native long getPfnAllocation0(Buffer ptr);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pfnAllocation);	 */

	/**
	 * native SET method for field pfnReallocation	[vkpfn]<br>
	 * Prototype: PFN_vkReallocationFunction  pfnReallocation
	 */ 
	 private static native void setPfnReallocation0(Buffer ptr, java.nio.ByteBuffer  _pfnReallocation);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  vkObj->pfnReallocation = (PFN_vkReallocationFunction) (_pfnReallocation);
	  */

	/**
	 * native GET method for field pfnReallocation	[vkpfn]<br>
	 * Prototype: PFN_vkReallocationFunction  pfnReallocation
	 */ 
	 private static native long getPfnReallocation0(Buffer ptr);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pfnReallocation);	 */

	/**
	 * native SET method for field pfnFree	[vkpfn]<br>
	 * Prototype: PFN_vkFreeFunction  pfnFree
	 */ 
	 private static native void setPfnFree0(Buffer ptr, java.nio.ByteBuffer  _pfnFree);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  vkObj->pfnFree = (PFN_vkFreeFunction) (_pfnFree);
	  */

	/**
	 * native GET method for field pfnFree	[vkpfn]<br>
	 * Prototype: PFN_vkFreeFunction  pfnFree
	 */ 
	 private static native long getPfnFree0(Buffer ptr);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pfnFree);	 */

	/**
	 * native SET method for field pfnInternalAllocation	[vkpfn]<br>
	 * Prototype: PFN_vkInternalAllocationNotification  pfnInternalAllocation
	 */ 
	 private static native void setPfnInternalAllocation0(Buffer ptr, java.nio.ByteBuffer  _pfnInternalAllocation);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  vkObj->pfnInternalAllocation = (PFN_vkInternalAllocationNotification) (_pfnInternalAllocation);
	  */

	/**
	 * native GET method for field pfnInternalAllocation	[vkpfn]<br>
	 * Prototype: PFN_vkInternalAllocationNotification  pfnInternalAllocation
	 */ 
	 private static native long getPfnInternalAllocation0(Buffer ptr);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pfnInternalAllocation);	 */

	/**
	 * native SET method for field pfnInternalFree	[vkpfn]<br>
	 * Prototype: PFN_vkInternalFreeNotification  pfnInternalFree
	 */ 
	 private static native void setPfnInternalFree0(Buffer ptr, java.nio.ByteBuffer  _pfnInternalFree);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  vkObj->pfnInternalFree = (PFN_vkInternalFreeNotification) (_pfnInternalFree);
	  */

	/**
	 * native GET method for field pfnInternalFree	[vkpfn]<br>
	 * Prototype: PFN_vkInternalFreeNotification  pfnInternalFree
	 */ 
	 private static native long getPfnInternalFree0(Buffer ptr);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pfnInternalFree);	 */



} // end of class VkAllocationCallbacks
