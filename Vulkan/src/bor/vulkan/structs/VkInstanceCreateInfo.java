/**
 * Class wrapping Vulkan's VkInstanceCreateInfo struct.
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
 *  This class is a Java front end for struct VkInstanceCreateInfo. 
 *  <h3>Prototype:</h3>
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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkInstanceCreateInfo extends VkStruct {
	/** TAG of this structure [2]  */
	 private static final String TAG = "VkInstanceCreateInfo";

	/** ID of this structure [2]  */
	 public static final int TAG_ID = VKINSTANCECREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkInstanceCreateInfo> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkStructureType 	sType	[vkenum]
	 */ 
	 VkStructureType 	sType;

	/**
	 *  const void* 	pNext	[p]
	 */ 
	 P<VkObject> 	pNext;

	/**
	 *  VkInstanceCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  const VkApplicationInfo* 	pApplicationInfo	[p]
	 */ 
	 P<VkApplicationInfo>  	pApplicationInfo;

	/**
	 *  uint32_t 	enabledLayerCount	[int]
	 */ 
	 int 	enabledLayerCount;

	/**
	 *  const char* const* 	ppEnabledLayerNames	[string_arr]
	 */ 
	 String[] 	ppEnabledLayerNames;

	/**
	 *  uint32_t 	enabledExtensionCount	[int]
	 */ 
	 int 	enabledExtensionCount;

	/**
	 *  const char* const* 	ppEnabledExtensionNames	[string_arr]
	 */ 
	 String[] 	ppEnabledExtensionNames;

	/**
	 * Ctor
	 */
	public VkInstanceCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkInstanceCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkInstanceCreateInfo(long address, int memSize){ 
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
	 public static P<VkInstanceCreateInfo> createNullPointer(){
	        P<VkInstanceCreateInfo> p = new  P<VkInstanceCreateInfo>(new VkInstanceCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkInstanceCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkInstanceCreateInfo> (this);
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
	 * Prototype: VkInstanceCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkInstanceCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field pApplicationInfo	[p]<br>
	 * Prototype: const VkApplicationInfo*  pApplicationInfo
	 */ 
	 public void pApplicationInfo(P<VkApplicationInfo>  pApplicationInfo){
		 this.pApplicationInfo = pApplicationInfo;
		pApplicationInfo0(super.ptr, pApplicationInfo);
	 }

	/**
	 * get method for field pApplicationInfo	[p]<br>
	 * Prototype: const VkApplicationInfo*  pApplicationInfo
	 */ 
	 public P<VkApplicationInfo>  pApplicationInfo(){
		 // return  this.pApplicationInfo;
		 return pApplicationInfo0(super.ptr);
	 }

	/**
	 * Set method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 public void enabledLayerCount(int enabledLayerCount){
		 this.enabledLayerCount = enabledLayerCount;
		enabledLayerCount0(super.ptr, enabledLayerCount);
	 }

	/**
	 * get method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 public int enabledLayerCount(){
		 // return  this.enabledLayerCount;
		 return enabledLayerCount0(super.ptr);
	 }

	/**
	 * Set method for field ppEnabledLayerNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledLayerNames
	 */ 
	 public void ppEnabledLayerNames(String[] ppEnabledLayerNames){
		 this.ppEnabledLayerNames = ppEnabledLayerNames;
		ppEnabledLayerNames0(super.ptr, ppEnabledLayerNames);
	 }

	/**
	 * get method for field ppEnabledLayerNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledLayerNames
	 */ 
	 public String[] ppEnabledLayerNames(){
		 // return  this.ppEnabledLayerNames;
		 return ppEnabledLayerNames0(super.ptr);
	 }

	/**
	 * Set method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 public void enabledExtensionCount(int enabledExtensionCount){
		 this.enabledExtensionCount = enabledExtensionCount;
		enabledExtensionCount0(super.ptr, enabledExtensionCount);
	 }

	/**
	 * get method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 public int enabledExtensionCount(){
		 // return  this.enabledExtensionCount;
		 return enabledExtensionCount0(super.ptr);
	 }

	/**
	 * Set method for field ppEnabledExtensionNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledExtensionNames
	 */ 
	 public void ppEnabledExtensionNames(String[] ppEnabledExtensionNames){
		 this.ppEnabledExtensionNames = ppEnabledExtensionNames;
		ppEnabledExtensionNames0(super.ptr, ppEnabledExtensionNames);
	 }

	/**
	 * get method for field ppEnabledExtensionNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledExtensionNames
	 */ 
	 public String[] ppEnabledExtensionNames(){
		 // return  this.ppEnabledExtensionNames;
		 return ppEnabledExtensionNames0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkInstanceCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(*ptr);
		  _obj.flags = (VkInstanceCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkInstanceCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(ptr);
		  return (jint) (_obj.VkInstanceCreateFlags);
	 */

	/**
	 * native SET method for field pApplicationInfo	[p]<br>
	 * Prototype: const VkApplicationInfo*  pApplicationInfo
	 */ 
	 private static native void pApplicationInfo0(ByteBuffer ptr, P<VkApplicationInfo>  _pApplicationInfo);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(*ptr);
		  _obj.pApplicationInfo = (const VkApplicationInfo*) (_pApplicationInfo);
	  */

	/**
	 * native GET method for field pApplicationInfo	[p]<br>
	 * Prototype: const VkApplicationInfo*  pApplicationInfo
	 */ 
	 private static native P<VkApplicationInfo>  pApplicationInfo0(ByteBuffer ptr);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(ptr);
		  return (P<VkApplicationInfo> ) (_obj.const VkApplicationInfo*);
	 */

	/**
	 * native SET method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 private static native void enabledLayerCount0(ByteBuffer ptr, int _enabledLayerCount);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(*ptr);
		  _obj.enabledLayerCount = (uint32_t) (_enabledLayerCount);
	  */

	/**
	 * native GET method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 private static native int enabledLayerCount0(ByteBuffer ptr);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field ppEnabledLayerNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledLayerNames
	 */ 
	 private static native void ppEnabledLayerNames0(ByteBuffer ptr, String[] _ppEnabledLayerNames);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(*ptr);
		  _obj.ppEnabledLayerNames = (const char* const*) (_ppEnabledLayerNames);
	  */

	/**
	 * native GET method for field ppEnabledLayerNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledLayerNames
	 */ 
	 private static native String[] ppEnabledLayerNames0(ByteBuffer ptr);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(ptr);
		  return (String[]) (_obj.const char* const*);
	 */

	/**
	 * native SET method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 private static native void enabledExtensionCount0(ByteBuffer ptr, int _enabledExtensionCount);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(*ptr);
		  _obj.enabledExtensionCount = (uint32_t) (_enabledExtensionCount);
	  */

	/**
	 * native GET method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 private static native int enabledExtensionCount0(ByteBuffer ptr);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field ppEnabledExtensionNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledExtensionNames
	 */ 
	 private static native void ppEnabledExtensionNames0(ByteBuffer ptr, String[] _ppEnabledExtensionNames);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(*ptr);
		  _obj.ppEnabledExtensionNames = (const char* const*) (_ppEnabledExtensionNames);
	  */

	/**
	 * native GET method for field ppEnabledExtensionNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledExtensionNames
	 */ 
	 private static native String[] ppEnabledExtensionNames0(ByteBuffer ptr);/*
		  VkInstanceCreateInfo _obj = (VkInstanceCreateInfo)(ptr);
		  return (String[]) (_obj.const char* const*);
	 */



} // end of class VkInstanceCreateInfo
