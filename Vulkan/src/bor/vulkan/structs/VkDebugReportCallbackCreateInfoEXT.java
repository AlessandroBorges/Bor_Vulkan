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
 *     PFNvkDebugReportCallbackEXT    pfnCallback;
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
	 *  VkDebugReportFlagsEXT 	flags	[int]
	 */ 
	int 	flags;

	/**
	 *  PFNvkDebugReportCallbackEXT 	pfnCallback	[vkhandle]
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
	 * Set method for field flags	[int]<br>
	 * Prototype: VkDebugReportFlagsEXT  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkDebugReportFlagsEXT  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field pfnCallback	[vkhandle]<br>
	 * Prototype: PFNvkDebugReportCallbackEXT  pfnCallback
	 */ 
	 public void pfnCallback(PFNvkDebugReportCallbackEXT pfnCallback){
		 this.pfnCallback = pfnCallback;
		pfnCallback0(super.ptr, pfnCallback);
	 }

	/**
	 * get method for field pfnCallback	[vkhandle]<br>
	 * Prototype: PFNvkDebugReportCallbackEXT  pfnCallback
	 */ 
	 public PFNvkDebugReportCallbackEXT pfnCallback(){
		 // return  this.pfnCallback;
		 return pfnCallback0(super.ptr);
	 }

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


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkDebugReportCallbackCreateInfoEXT _obj = (VkDebugReportCallbackCreateInfoEXT)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkDebugReportCallbackCreateInfoEXT _obj = (VkDebugReportCallbackCreateInfoEXT)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkDebugReportCallbackCreateInfoEXT _obj = (VkDebugReportCallbackCreateInfoEXT)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkDebugReportCallbackCreateInfoEXT _obj = (VkDebugReportCallbackCreateInfoEXT)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkDebugReportFlagsEXT  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkDebugReportCallbackCreateInfoEXT _obj = (VkDebugReportCallbackCreateInfoEXT)(*ptr);
		  _obj.flags = (VkDebugReportFlagsEXT) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkDebugReportFlagsEXT  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkDebugReportCallbackCreateInfoEXT _obj = (VkDebugReportCallbackCreateInfoEXT)(ptr);
		  return (jint) (_obj.VkDebugReportFlagsEXT);
	 */

	/**
	 * native SET method for field pfnCallback	[vkhandle]<br>
	 * Prototype: PFNvkDebugReportCallbackEXT  pfnCallback
	 */ 
	 private static native void pfnCallback0(ByteBuffer ptr, PFNvkDebugReportCallbackEXT _pfnCallback);/*
		  VkDebugReportCallbackCreateInfoEXT _obj = (VkDebugReportCallbackCreateInfoEXT)(*ptr);
		  _obj.pfnCallback = (PFNvkDebugReportCallbackEXT) (_pfnCallback);
	  */

	/**
	 * native GET method for field pfnCallback	[vkhandle]<br>
	 * Prototype: PFNvkDebugReportCallbackEXT  pfnCallback
	 */ 
	 private static native PFNvkDebugReportCallbackEXT pfnCallback0(ByteBuffer ptr);/*
		  VkDebugReportCallbackCreateInfoEXT _obj = (VkDebugReportCallbackCreateInfoEXT)(ptr);
		  return (PFNvkDebugReportCallbackEXT) (_obj.PFN_vkDebugReportCallbackEXT);
	 */

	/**
	 * native SET method for field pUserData	[buffer]<br>
	 * Prototype: void*  pUserData
	 */ 
	 private static native void pUserData0(ByteBuffer ptr, java.nio.Buffer _pUserData);/*
		  VkDebugReportCallbackCreateInfoEXT _obj = (VkDebugReportCallbackCreateInfoEXT)(*ptr);
		  _obj.pUserData = (void*) (_pUserData);
	  */

	/**
	 * native GET method for field pUserData	[buffer]<br>
	 * Prototype: void*  pUserData
	 */ 
	 private static native java.nio.Buffer pUserData0(ByteBuffer ptr);/*
		  VkDebugReportCallbackCreateInfoEXT _obj = (VkDebugReportCallbackCreateInfoEXT)(ptr);
		  return (java.nio.Buffer) (_obj.void*);
	 */



} // end of class VkDebugReportCallbackCreateInfoEXT
