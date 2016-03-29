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

import java.nio.Buffer;


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
	 *  const void* 	pNext	[vkobject]
	 */ 
	 VkObject 	pNext;

	/**
	 *  VkInstanceCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  const VkApplicationInfo* 	pApplicationInfo	[vkstruct]
	 */ 
	  VkApplicationInfo  	pApplicationInfo;

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
	 * Prototype: VkInstanceCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 flags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkInstanceCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = flags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field pApplicationInfo	[vkstruct]<br>
	 * Prototype: const VkApplicationInfo*  pApplicationInfo
	 */ 
	 public void pApplicationInfo( VkApplicationInfo  pApplicationInfo){
		 this.pApplicationInfo = pApplicationInfo;
		 ByteBuffer buff = (pApplicationInfo==null) ? null : pApplicationInfo.getPointerStruct();
		 pApplicationInfo0(this.ptr, buff);
	 }

	/**
	 * Get method for field pApplicationInfo	[vkstruct]<br>
	 * Prototype: const VkApplicationInfo*  pApplicationInfo
	 */ 
	 public  VkApplicationInfo  pApplicationInfo(){
		 ByteBuffer pointer = pApplicationInfo0(super.ptr);
		 if(pointer == null){
		    this.pApplicationInfo = null;
		    return null;
		  } else 
 		 if(this.pApplicationInfo == null){
		    this.pApplicationInfo = new  VkApplicationInfo (pointer);
		 }else{
		    this.pApplicationInfo.setPointer(pointer);
		  }
		 return this.pApplicationInfo;
	 }

	/**
	 * Set method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 public void enabledLayerCount(int enabledLayerCount){
		 this.enabledLayerCount = enabledLayerCount;
		 enabledLayerCount0(this.ptr,  enabledLayerCount);
	 }

	/**
	 * Get method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 public int enabledLayerCount(){
		 int var = enabledLayerCount0(super.ptr);
		 this.enabledLayerCount = var;
		 return this.enabledLayerCount;
	 }

	/**
	 * Set method for field ppEnabledLayerNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledLayerNames
	 */ 
	 public void ppEnabledLayerNames(String[] ppEnabledLayerNames){
		 this.ppEnabledLayerNames = ppEnabledLayerNames;
		 ppEnabledLayerNames0(this.ptr,  ppEnabledLayerNames);
	 }

	/**
	 * Get method for field ppEnabledLayerNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledLayerNames
	 */ 
	 public String[] ppEnabledLayerNames(){
		 String[] var = ppEnabledLayerNames0(super.ptr);
		 this.ppEnabledLayerNames = var;
		 return this.ppEnabledLayerNames;
	 }

	/**
	 * Set method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 public void enabledExtensionCount(int enabledExtensionCount){
		 this.enabledExtensionCount = enabledExtensionCount;
		 enabledExtensionCount0(this.ptr,  enabledExtensionCount);
	 }

	/**
	 * Get method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 public int enabledExtensionCount(){
		 int var = enabledExtensionCount0(super.ptr);
		 this.enabledExtensionCount = var;
		 return this.enabledExtensionCount;
	 }

	/**
	 * Set method for field ppEnabledExtensionNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledExtensionNames
	 */ 
	 public void ppEnabledExtensionNames(String[] ppEnabledExtensionNames){
		 this.ppEnabledExtensionNames = ppEnabledExtensionNames;
		 ppEnabledExtensionNames0(this.ptr,  ppEnabledExtensionNames);
	 }

	/**
	 * Get method for field ppEnabledExtensionNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledExtensionNames
	 */ 
	 public String[] ppEnabledExtensionNames(){
		 String[] var = ppEnabledExtensionNames0(super.ptr);
		 this.ppEnabledExtensionNames = var;
		 return this.ppEnabledExtensionNames;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkInstanceCreateInfo vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkInstanceCreateInfo vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkInstanceCreateFlags  flags
	 */ 
	 private static native void flags0(Buffer ptr, int _flags);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  vkObj->flags = (VkInstanceCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkInstanceCreateFlags  flags
	 */ 
	 private static native int flags0(Buffer ptr);/*
		  VkInstanceCreateInfo vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field pApplicationInfo	[vkstruct]<br>
	 * Prototype: const VkApplicationInfo*  pApplicationInfo
	 */ 
	 private static native void pApplicationInfo0(Buffer ptr, java.nio.ByteBuffer  _pApplicationInfo);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  vkObj->pApplicationInfo = (const VkApplicationInfo*) (_pApplicationInfo);
	  */

	/**
	 * native GET method for field pApplicationInfo	[vkstruct]<br>
	 * Prototype: const VkApplicationInfo*  pApplicationInfo
	 */ 
	 private static native java.nio.ByteBuffer  pApplicationInfo0(Buffer ptr);/*
		  VkInstanceCreateInfo vkObj = (VkInstanceCreateInfo*)(ptr);
		  return ( VkApplicationInfo ) (vkObj->pApplicationInfo);
	 */

	/**
	 * native SET method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 private static native void enabledLayerCount0(Buffer ptr, int _enabledLayerCount);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  vkObj->enabledLayerCount = (uint32_t) (_enabledLayerCount);
	  */

	/**
	 * native GET method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 private static native int enabledLayerCount0(Buffer ptr);/*
		  VkInstanceCreateInfo vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (jint) (vkObj->enabledLayerCount);
	 */

	/**
	 * native SET method for field ppEnabledLayerNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledLayerNames
	 */ 
	 private static native void ppEnabledLayerNames0(Buffer ptr, String[] _ppEnabledLayerNames);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  vkObj->ppEnabledLayerNames = (const char* const*) (_ppEnabledLayerNames);
	  */

	/**
	 * native GET method for field ppEnabledLayerNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledLayerNames
	 */ 
	 private static native String[] ppEnabledLayerNames0(Buffer ptr);/*
		  VkInstanceCreateInfo vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (String[]) (vkObj->ppEnabledLayerNames);
	 */

	/**
	 * native SET method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 private static native void enabledExtensionCount0(Buffer ptr, int _enabledExtensionCount);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  vkObj->enabledExtensionCount = (uint32_t) (_enabledExtensionCount);
	  */

	/**
	 * native GET method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 private static native int enabledExtensionCount0(Buffer ptr);/*
		  VkInstanceCreateInfo vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (jint) (vkObj->enabledExtensionCount);
	 */

	/**
	 * native SET method for field ppEnabledExtensionNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledExtensionNames
	 */ 
	 private static native void ppEnabledExtensionNames0(Buffer ptr, String[] _ppEnabledExtensionNames);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  vkObj->ppEnabledExtensionNames = (const char* const*) (_ppEnabledExtensionNames);
	  */

	/**
	 * native GET method for field ppEnabledExtensionNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledExtensionNames
	 */ 
	 private static native String[] ppEnabledExtensionNames0(Buffer ptr);/*
		  VkInstanceCreateInfo vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (String[]) (vkObj->ppEnabledExtensionNames);
	 */



} // end of class VkInstanceCreateInfo
