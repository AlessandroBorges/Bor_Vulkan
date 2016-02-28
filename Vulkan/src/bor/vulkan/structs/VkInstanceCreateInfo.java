/**
 * Class wrapping Vulkan's VkInstanceCreateInfo struct.
 * 
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
 *  This class is a Java front end for struct VkInstanceCreateInfo 
 *  <h3>ProtoType:</h3>
 * <pre>
 * typedef struct VkInstanceCreateInfo {
 *     VkStructureType             sType;
 *     const void*                 pNext;
 *     VkInstanceCreateFlags       flags;
 *     const VkApplicationInfo*    pApplicationInfo;
 *     uint32_t                    enabledLayerCount;
 *     const char* const*          ppEnabledLayerNames;
 *     uint32_t                    enabledExtensionCount;
 *     const char* const*          ppEnabledExtensionNames;
 * } VkInstanceCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version 0.8.01
 */
public class VkInstanceCreateInfo extends VkStruct {
	/** TAG of this structure [126]  */
	 private static final String TAG = "VkInstanceCreateInfo";

	/** ID of this structure [126]  */
	 public static final int TAG_ID = VKINSTANCECREATEINFO_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType 
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext 
	 */ 
	P<VkObject> 	pNext;

	/**
	 *  VkInstanceCreateFlags 	flags 
	 */ 
	int 	flags;

	/**
	 *  const VkApplicationInfo* 	pApplicationInfo 
	 */ 
	P<VkApplicationInfo>  	pApplicationInfo;

	/**
	 *  uint32_t 	enabledLayerCount 
	 */ 
	int 	enabledLayerCount;

	/**
	 *  const char* const* 	ppEnabledLayerNames 
	 */ 
	String[] 	ppEnabledLayerNames;

	/**
	 *  uint32_t 	enabledExtensionCount 
	 */ 
	int 	enabledExtensionCount;

	/**
	 *  const char* const* 	ppEnabledExtensionNames 
	 */ 
	String[] 	ppEnabledExtensionNames;

	/**
	 * Ctor
	 */
	public VkInstanceCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
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
	 public void pNext(P<VkObject> pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public P<VkObject> pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field flags
	 * Prototype: VkInstanceCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkInstanceCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field pApplicationInfo
	 * Prototype: const VkApplicationInfo*  pApplicationInfo
	 */ 
	 public void pApplicationInfo(P<VkApplicationInfo>  pApplicationInfo){
		 this.pApplicationInfo = pApplicationInfo;
		pApplicationInfo0(super.ptr, pApplicationInfo);
	 }

	/**
	 * get method for field pApplicationInfo
	 * Prototype: const VkApplicationInfo*  pApplicationInfo
	 */ 
	 public P<VkApplicationInfo>  pApplicationInfo(){
		 // return  this.pApplicationInfo;
		 return pApplicationInfo0(super.ptr);
	 }

	/**
	 * Set method for field enabledLayerCount
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 public void enabledLayerCount(int enabledLayerCount){
		 this.enabledLayerCount = enabledLayerCount;
		enabledLayerCount0(super.ptr, enabledLayerCount);
	 }

	/**
	 * get method for field enabledLayerCount
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 public int enabledLayerCount(){
		 // return  this.enabledLayerCount;
		 return enabledLayerCount0(super.ptr);
	 }

	/**
	 * Set method for field ppEnabledLayerNames
	 * Prototype: const char* const*  ppEnabledLayerNames
	 */ 
	 public void ppEnabledLayerNames(String[] ppEnabledLayerNames){
		 this.ppEnabledLayerNames = ppEnabledLayerNames;
		ppEnabledLayerNames0(super.ptr, ppEnabledLayerNames);
	 }

	/**
	 * get method for field ppEnabledLayerNames
	 * Prototype: const char* const*  ppEnabledLayerNames
	 */ 
	 public String[] ppEnabledLayerNames(){
		 // return  this.ppEnabledLayerNames;
		 return ppEnabledLayerNames0(super.ptr);
	 }

	/**
	 * Set method for field enabledExtensionCount
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 public void enabledExtensionCount(int enabledExtensionCount){
		 this.enabledExtensionCount = enabledExtensionCount;
		enabledExtensionCount0(super.ptr, enabledExtensionCount);
	 }

	/**
	 * get method for field enabledExtensionCount
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 public int enabledExtensionCount(){
		 // return  this.enabledExtensionCount;
		 return enabledExtensionCount0(super.ptr);
	 }

	/**
	 * Set method for field ppEnabledExtensionNames
	 * Prototype: const char* const*  ppEnabledExtensionNames
	 */ 
	 public void ppEnabledExtensionNames(String[] ppEnabledExtensionNames){
		 this.ppEnabledExtensionNames = ppEnabledExtensionNames;
		ppEnabledExtensionNames0(super.ptr, ppEnabledExtensionNames);
	 }

	/**
	 * get method for field ppEnabledExtensionNames
	 * Prototype: const char* const*  ppEnabledExtensionNames
	 */ 
	 public String[] ppEnabledExtensionNames(){
		 // return  this.ppEnabledExtensionNames;
		 return ppEnabledExtensionNames0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkInstanceCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(*ptr);
		  _obj.flags = (VkInstanceCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkInstanceCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(ptr);
		  return (jint) (_obj.VkInstanceCreateFlags);
	 */

	/**
	 * native Set method for field pApplicationInfo
	 * Prototype: const VkApplicationInfo*  pApplicationInfo
	 */ 
	 private static native void pApplicationInfo0(ByteBuffer ptr, P<VkApplicationInfo>  _pApplicationInfo);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(*ptr);
		  _obj.pApplicationInfo = (const VkApplicationInfo*) (_pApplicationInfo);
	  */

	/**
	 * get method for field pApplicationInfo
	 * Prototype: const VkApplicationInfo*  pApplicationInfo
	 */ 
	 private static native P<VkApplicationInfo>  pApplicationInfo0(ByteBuffer ptr);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(ptr);
		  return (P<VkApplicationInfo> ) (_obj.const VkApplicationInfo*);
	 */

	/**
	 * native Set method for field enabledLayerCount
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 private static native void enabledLayerCount0(ByteBuffer ptr, int _enabledLayerCount);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(*ptr);
		  _obj.enabledLayerCount = (uint32_t) (_enabledLayerCount);
	  */

	/**
	 * get method for field enabledLayerCount
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 private static native int enabledLayerCount0(ByteBuffer ptr);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field ppEnabledLayerNames
	 * Prototype: const char* const*  ppEnabledLayerNames
	 */ 
	 private static native void ppEnabledLayerNames0(ByteBuffer ptr, String[] _ppEnabledLayerNames);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(*ptr);
		  _obj.ppEnabledLayerNames = (const char* const*) (_ppEnabledLayerNames);
	  */

	/**
	 * get method for field ppEnabledLayerNames
	 * Prototype: const char* const*  ppEnabledLayerNames
	 */ 
	 private static native String[] ppEnabledLayerNames0(ByteBuffer ptr);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(ptr);
		  return (String[]) (_obj.const char* const*);
	 */

	/**
	 * native Set method for field enabledExtensionCount
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 private static native void enabledExtensionCount0(ByteBuffer ptr, int _enabledExtensionCount);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(*ptr);
		  _obj.enabledExtensionCount = (uint32_t) (_enabledExtensionCount);
	  */

	/**
	 * get method for field enabledExtensionCount
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 private static native int enabledExtensionCount0(ByteBuffer ptr);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field ppEnabledExtensionNames
	 * Prototype: const char* const*  ppEnabledExtensionNames
	 */ 
	 private static native void ppEnabledExtensionNames0(ByteBuffer ptr, String[] _ppEnabledExtensionNames);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(*ptr);
		  _obj.ppEnabledExtensionNames = (const char* const*) (_ppEnabledExtensionNames);
	  */

	/**
	 * get method for field ppEnabledExtensionNames
	 * Prototype: const char* const*  ppEnabledExtensionNames
	 */ 
	 private static native String[] ppEnabledExtensionNames0(ByteBuffer ptr);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(ptr);
		  return (String[]) (_obj.const char* const*);
	 */



} // end of class VkInstanceCreateInfo
