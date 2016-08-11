/**
 * Class wrapping Vulkan's VkAllocationCallbacks struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.65 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
 package bor.vulkan.structs;

 import bor.util.*;
 import bor.vulkan.*;
 import static bor.vulkan.Vulkan.*; 
 import bor.vulkan.enumerations.*;

 import java.util.*;
 import java.nio.*;


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
 * @version Ver. 0.8.65 (beta) 
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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkAllocationCallbacks(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field pUserData	[buffer]<br>
	 * Prototype: void*  pUserData
	 * 
	 * @param pUserData - a instance of java.nio.Buffer.
	 * @return this VkStruct instance.
	 */ 
	 public VkAllocationCallbacks pUserData(java.nio.Buffer pUserData){
		 this.pUserData = pUserData;
		 setPUserData0(this.ptr,  pUserData);
		 return this;
	 }

	/**
	 * Get method for field pUserData	[buffer]<br>
	 * Prototype: void*  pUserData
	 */ 
	 public java.nio.Buffer pUserData(){
		 long address = getPUserData0(super.ptr);
		 if(this.pUserData == null && address != 0L){
			  ByteBuffer bb = wrapPointer(address, 8);
			  this.pUserData = bb;
		 }
		 return this.pUserData;
	 }

	/**
	 * Set method for field pfnAllocation	[vkpfn]<br>
	 * Prototype: PFN_vkAllocationFunction  pfnAllocation
	 * 
	 * @param pfnAllocation - a instance of PFNvkAllocationFunction.
	 * @return this VkStruct instance.
	 */ 
	 public VkAllocationCallbacks pfnAllocation(PFNvkAllocationFunction pfnAllocation){
		 this.pfnAllocation = pfnAllocation;
		 long handle = (pfnAllocation==null) ? 0L : pfnAllocation.getNativeHandle();
		 setPfnAllocation0(this.ptr, handle);
		 return this;
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
		    this.pfnAllocation.setNativeHandle(handle);
		  }
		 return this.pfnAllocation;
	 }

	/**
	 * Set method for field pfnReallocation	[vkpfn]<br>
	 * Prototype: PFN_vkReallocationFunction  pfnReallocation
	 * 
	 * @param pfnReallocation - a instance of PFNvkReallocationFunction.
	 * @return this VkStruct instance.
	 */ 
	 public VkAllocationCallbacks pfnReallocation(PFNvkReallocationFunction pfnReallocation){
		 this.pfnReallocation = pfnReallocation;
		 long handle = (pfnReallocation==null) ? 0L : pfnReallocation.getNativeHandle();
		 setPfnReallocation0(this.ptr, handle);
		 return this;
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
		    this.pfnReallocation.setNativeHandle(handle);
		  }
		 return this.pfnReallocation;
	 }

	/**
	 * Set method for field pfnFree	[vkpfn]<br>
	 * Prototype: PFN_vkFreeFunction  pfnFree
	 * 
	 * @param pfnFree - a instance of PFNvkFreeFunction.
	 * @return this VkStruct instance.
	 */ 
	 public VkAllocationCallbacks pfnFree(PFNvkFreeFunction pfnFree){
		 this.pfnFree = pfnFree;
		 long handle = (pfnFree==null) ? 0L : pfnFree.getNativeHandle();
		 setPfnFree0(this.ptr, handle);
		 return this;
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
		    this.pfnFree.setNativeHandle(handle);
		  }
		 return this.pfnFree;
	 }

	/**
	 * Set method for field pfnInternalAllocation	[vkpfn]<br>
	 * Prototype: PFN_vkInternalAllocationNotification  pfnInternalAllocation
	 * 
	 * @param pfnInternalAllocation - a instance of PFNvkInternalAllocationNotification.
	 * @return this VkStruct instance.
	 */ 
	 public VkAllocationCallbacks pfnInternalAllocation(PFNvkInternalAllocationNotification pfnInternalAllocation){
		 this.pfnInternalAllocation = pfnInternalAllocation;
		 long handle = (pfnInternalAllocation==null) ? 0L : pfnInternalAllocation.getNativeHandle();
		 setPfnInternalAllocation0(this.ptr, handle);
		 return this;
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
		    this.pfnInternalAllocation.setNativeHandle(handle);
		  }
		 return this.pfnInternalAllocation;
	 }

	/**
	 * Set method for field pfnInternalFree	[vkpfn]<br>
	 * Prototype: PFN_vkInternalFreeNotification  pfnInternalFree
	 * 
	 * @param pfnInternalFree - a instance of PFNvkInternalFreeNotification.
	 * @return this VkStruct instance.
	 */ 
	 public VkAllocationCallbacks pfnInternalFree(PFNvkInternalFreeNotification pfnInternalFree){
		 this.pfnInternalFree = pfnInternalFree;
		 long handle = (pfnInternalFree==null) ? 0L : pfnInternalFree.getNativeHandle();
		 setPfnInternalFree0(this.ptr, handle);
		 return this;
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
		    this.pfnInternalFree.setNativeHandle(handle);
		  }
		 return this.pfnInternalFree;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkAllocationCallbacks [ ")
				.append("pUserData: ").append(pUserData() )
				.append(",\n pfnAllocation: ")
				.append(pfnAllocation() )
				.append(",\n pfnReallocation: ")
				.append(pfnReallocation() )
				.append(",\n pfnFree: ")
				.append(pfnFree() )
				.append(",\n pfnInternalAllocation: ")
				.append(pfnInternalAllocation() )
				.append(",\n pfnInternalFree: ")
				.append(pfnInternalFree() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field pUserData	[buffer]<br>
	 * Prototype: void*  pUserData
	 */ 
	 private static native void setPUserData0(Buffer ptr, java.nio.Buffer _pUserData);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pUserData = (void*) (_pUserData);
	  */

	/**
	 * Native GET method for field pUserData	[buffer]<br>
	 * Prototype: void*  pUserData
	 */ 
	 private static native long getPUserData0(Buffer ptr);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pUserData);
	 */

	/**
	 * Native SET method for field pfnAllocation	[vkpfn]<br>
	 * Prototype: PFN_vkAllocationFunction  pfnAllocation
	 */ 
	 private static native void setPfnAllocation0(Buffer ptr, long  _pfnAllocation);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		 // code for simple past value 
		  vkObj->pfnAllocation = (PFN_vkAllocationFunction) (_pfnAllocation);
	  */

	/**
	 * Native GET method for field pfnAllocation	[vkpfn]<br>
	 * Prototype: PFN_vkAllocationFunction  pfnAllocation
	 */ 
	 private static native long getPfnAllocation0(Buffer ptr);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pfnAllocation);
	 */

	/**
	 * Native SET method for field pfnReallocation	[vkpfn]<br>
	 * Prototype: PFN_vkReallocationFunction  pfnReallocation
	 */ 
	 private static native void setPfnReallocation0(Buffer ptr, long  _pfnReallocation);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		 // code for simple past value 
		  vkObj->pfnReallocation = (PFN_vkReallocationFunction) (_pfnReallocation);
	  */

	/**
	 * Native GET method for field pfnReallocation	[vkpfn]<br>
	 * Prototype: PFN_vkReallocationFunction  pfnReallocation
	 */ 
	 private static native long getPfnReallocation0(Buffer ptr);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pfnReallocation);
	 */

	/**
	 * Native SET method for field pfnFree	[vkpfn]<br>
	 * Prototype: PFN_vkFreeFunction  pfnFree
	 */ 
	 private static native void setPfnFree0(Buffer ptr, long  _pfnFree);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		 // code for simple past value 
		  vkObj->pfnFree = (PFN_vkFreeFunction) (_pfnFree);
	  */

	/**
	 * Native GET method for field pfnFree	[vkpfn]<br>
	 * Prototype: PFN_vkFreeFunction  pfnFree
	 */ 
	 private static native long getPfnFree0(Buffer ptr);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pfnFree);
	 */

	/**
	 * Native SET method for field pfnInternalAllocation	[vkpfn]<br>
	 * Prototype: PFN_vkInternalAllocationNotification  pfnInternalAllocation
	 */ 
	 private static native void setPfnInternalAllocation0(Buffer ptr, long  _pfnInternalAllocation);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		 // code for simple past value 
		  vkObj->pfnInternalAllocation = (PFN_vkInternalAllocationNotification) (_pfnInternalAllocation);
	  */

	/**
	 * Native GET method for field pfnInternalAllocation	[vkpfn]<br>
	 * Prototype: PFN_vkInternalAllocationNotification  pfnInternalAllocation
	 */ 
	 private static native long getPfnInternalAllocation0(Buffer ptr);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pfnInternalAllocation);
	 */

	/**
	 * Native SET method for field pfnInternalFree	[vkpfn]<br>
	 * Prototype: PFN_vkInternalFreeNotification  pfnInternalFree
	 */ 
	 private static native void setPfnInternalFree0(Buffer ptr, long  _pfnInternalFree);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		 // code for simple past value 
		  vkObj->pfnInternalFree = (PFN_vkInternalFreeNotification) (_pfnInternalFree);
	  */

	/**
	 * Native GET method for field pfnInternalFree	[vkpfn]<br>
	 * Prototype: PFN_vkInternalFreeNotification  pfnInternalFree
	 */ 
	 private static native long getPfnInternalFree0(Buffer ptr);/*
		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pfnInternalFree);
	 */



} // end of class VkAllocationCallbacks
