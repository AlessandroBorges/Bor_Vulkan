/**
 * Class wrapping Vulkan's VkDebugReportCallbackCreateInfoEXT struct.
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

import java.nio.Buffer;


/**
 *  Project Bor-Vulkan 
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkDebugReportCallbackCreateInfoEXT. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDebugReportCallbackCreateInfoEXT {
 *     VkStructureType                 sType;
 *     const void*                     pNext;
 *     VkDebugReportFlagsEXT           flags;
 *     PFN_vkDebugReportCallbackEXT    pfnCallback;
 *     void*                           pUserData;
 * } VkDebugReportCallbackCreateInfoEXT;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkDebugReportCallbackCreateInfoEXT extends VkStruct {
	/** TAG of this structure [124]  */
	 private static final String TAG = "VkDebugReportCallbackCreateInfoEXT";

	/** ID of this structure [124]  */
	 public static final int TAG_ID = VKDEBUGREPORTCALLBACKCREATEINFOEXT_ID;

	/** P wrapper for THIS object */
	 private  P<VkDebugReportCallbackCreateInfoEXT> p;

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
	 *  VkDebugReportFlagsEXT 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  PFN_vkDebugReportCallbackEXT 	pfnCallback	[vkpfn]
	 */ 
	 PFNvkDebugReportCallbackEXT 	pfnCallback;

	/**
	 *  void* 	pUserData	[buffer]
	 */ 
	 java.nio.Buffer 	pUserData;

	/**
	 * Ctor
	 */
	public VkDebugReportCallbackCreateInfoEXT(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDebugReportCallbackCreateInfoEXT(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkDebugReportCallbackCreateInfoEXT(long address, int memSize){ 
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
	 public static P<VkDebugReportCallbackCreateInfoEXT> createNullPointer(){
	        P<VkDebugReportCallbackCreateInfoEXT> p = new  P<VkDebugReportCallbackCreateInfoEXT>(new VkDebugReportCallbackCreateInfoEXT());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkDebugReportCallbackCreateInfoEXT> getP() {
	       if(p == null ){
	           p = new P<VkDebugReportCallbackCreateInfoEXT> (this);
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
		 sType0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = sType0(super.ptr);
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
		 pNext0(this.ptr, buff);
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 ByteBuffer pointer = pNext0(super.ptr);
		 if(pointer == null){
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
	 * Set method for field flags	[int]<br>
	 * Prototype: VkDebugReportFlagsEXT  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 flags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkDebugReportFlagsEXT  flags
	 */ 
	 public int flags(){
		 int var = flags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field pfnCallback	[vkpfn]<br>
	 * Prototype: PFN_vkDebugReportCallbackEXT  pfnCallback
	 */ 
	 public void pfnCallback(PFNvkDebugReportCallbackEXT pfnCallback){
		 this.pfnCallback = pfnCallback;
		 ByteBuffer buff = (pfnCallback==null) ? null : pfnCallback.getHandle();
		 pfnCallback0(this.ptr, buff);
	 }

	/**
	 * Get method for field pfnCallback	[vkpfn]<br>
	 * Prototype: PFN_vkDebugReportCallbackEXT  pfnCallback
	 */ 
	 public PFNvkDebugReportCallbackEXT pfnCallback(){

		  ByteBuffer handle = pfnCallback0(super.ptr);
		 if(handle == null){
		    this.pfnCallback = null;
		    return null;
		  } else 
 		 if(this.pfnCallback == null){
		    this.pfnCallback = new PFNvkDebugReportCallbackEXT(handle);
		 }else{
		    this.pfnCallback.setHandle(handle);
		  }
		 return this.pfnCallback;
	 }

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


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkDebugReportCallbackCreateInfoEXT vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkDebugReportCallbackCreateInfoEXT vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkDebugReportFlagsEXT  flags
	 */ 
	 private static native void flags0(Buffer ptr, int _flags);/*
		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		  vkObj->flags = (VkDebugReportFlagsEXT) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkDebugReportFlagsEXT  flags
	 */ 
	 private static native int flags0(Buffer ptr);/*
		  VkDebugReportCallbackCreateInfoEXT vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field pfnCallback	[vkpfn]<br>
	 * Prototype: PFN_vkDebugReportCallbackEXT  pfnCallback
	 */ 
	 private static native void pfnCallback0(Buffer ptr, java.nio.ByteBuffer  _pfnCallback);/*
		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		  vkObj->pfnCallback = (PFN_vkDebugReportCallbackEXT) (_pfnCallback);
	  */

	/**
	 * native GET method for field pfnCallback	[vkpfn]<br>
	 * Prototype: PFN_vkDebugReportCallbackEXT  pfnCallback
	 */ 
	 private static native java.nio.ByteBuffer  pfnCallback0(Buffer ptr);/*
		  VkDebugReportCallbackCreateInfoEXT vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		  return (PFNvkDebugReportCallbackEXT) (vkObj->pfnCallback);
	 */

	/**
	 * native SET method for field pUserData	[buffer]<br>
	 * Prototype: void*  pUserData
	 */ 
	 private static native void pUserData0(Buffer ptr, java.nio.Buffer _pUserData);/*
		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		  vkObj->pUserData = (void*) (_pUserData);
	  */

	/**
	 * native GET method for field pUserData	[buffer]<br>
	 * Prototype: void*  pUserData
	 */ 
	 private static native java.nio.Buffer pUserData0(Buffer ptr);/*
		  VkDebugReportCallbackCreateInfoEXT vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		  return (jobject) (vkObj->pUserData);
	 */



} // end of class VkDebugReportCallbackCreateInfoEXT
