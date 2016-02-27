// class wrapping Vulkan's VkDebugReportCallbackCreateInfoEXT struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkDebugReportCallbackCreateInfoEXT 
 * @Author Alessandro Borges 
 */
public class VkDebugReportCallbackCreateInfoEXT extends VkStruct {
	/** ID of this structure [124]  */
	 public static final int TAG = VKDEBUGREPORTCALLBACKCREATEINFOEXT_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType 
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext 
	 */ 
	VkObject 	pNext;

	/**
	 *  VkDebugReportFlagsEXT 	flags 
	 */ 
	int 	flags;

	/**
	 *  PFN_vkDebugReportCallbackEXT 	pfnCallback 
	 */ 
	PFN_vkDebugReportCallbackEXT 	pfnCallback;

	/**
	 *  void* 	pUserData 
	 */ 
	ByteBuffer 	pUserData;

	/**
	 * Ctor
	 */
	public VkDebugReportCallbackCreateInfoEXT(){ 
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
	 * Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field flags
	 * Prototype: VkDebugReportFlagsEXT  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkDebugReportFlagsEXT  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field pfnCallback
	 * Prototype: PFN_vkDebugReportCallbackEXT  pfnCallback
	 */ 
	 public void pfnCallback(PFN_vkDebugReportCallbackEXT pfnCallback){
		 this.pfnCallback = pfnCallback;
		pfnCallback0(super.ptr, pfnCallback);
	 }

	/**
	 * get method for field pfnCallback
	 * Prototype: PFN_vkDebugReportCallbackEXT  pfnCallback
	 */ 
	 public PFN_vkDebugReportCallbackEXT pfnCallback(){
		 // return  this.pfnCallback;
		 return pfnCallback0(super.ptr);
	 }

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


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkDebugReportCallbackCreateInfoEXT _obj = (VkDebugReportCallbackCreateInfoEXT)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkDebugReportCallbackCreateInfoEXT _obj = (VkDebugReportCallbackCreateInfoEXT)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkDebugReportCallbackCreateInfoEXT _obj = (VkDebugReportCallbackCreateInfoEXT)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkDebugReportCallbackCreateInfoEXT _obj = (VkDebugReportCallbackCreateInfoEXT)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkDebugReportFlagsEXT  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkDebugReportCallbackCreateInfoEXT _obj = (VkDebugReportCallbackCreateInfoEXT)(*ptr);
		  _obj.flags = (VkDebugReportFlagsEXT) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkDebugReportFlagsEXT  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkDebugReportCallbackCreateInfoEXT _obj = (VkDebugReportCallbackCreateInfoEXT)(ptr);
		  return (jint) (_obj.VkDebugReportFlagsEXT);
	 */

	/**
	 * native Set method for field pfnCallback
	 * Prototype: PFN_vkDebugReportCallbackEXT  pfnCallback
	 */ 
	 private static native void pfnCallback0(ByteBuffer ptr, PFN_vkDebugReportCallbackEXT _pfnCallback);/*
		  VkDebugReportCallbackCreateInfoEXT _obj = (VkDebugReportCallbackCreateInfoEXT)(*ptr);
		  _obj.pfnCallback = (PFN_vkDebugReportCallbackEXT) (_pfnCallback);
	  */

	/**
	 * get method for field pfnCallback
	 * Prototype: PFN_vkDebugReportCallbackEXT  pfnCallback
	 */ 
	 private static native PFN_vkDebugReportCallbackEXT pfnCallback0(ByteBuffer ptr);/*
		  VkDebugReportCallbackCreateInfoEXT _obj = (VkDebugReportCallbackCreateInfoEXT)(ptr);
		  return (PFN_vkDebugReportCallbackEXT) (_obj.PFN_vkDebugReportCallbackEXT);
	 */

	/**
	 * native Set method for field pUserData
	 * Prototype: void*  pUserData
	 */ 
	 private static native void pUserData0(ByteBuffer ptr, ByteBuffer _pUserData);/*
		  VkDebugReportCallbackCreateInfoEXT _obj = (VkDebugReportCallbackCreateInfoEXT)(*ptr);
		  _obj.pUserData = (void*) (_pUserData);
	  */

	/**
	 * get method for field pUserData
	 * Prototype: void*  pUserData
	 */ 
	 private static native ByteBuffer pUserData0(ByteBuffer ptr);/*
		  VkDebugReportCallbackCreateInfoEXT _obj = (VkDebugReportCallbackCreateInfoEXT)(ptr);
		  return (ByteBuffer) (_obj.void*);
	 */



} // end of class VkDebugReportCallbackCreateInfoEXT
