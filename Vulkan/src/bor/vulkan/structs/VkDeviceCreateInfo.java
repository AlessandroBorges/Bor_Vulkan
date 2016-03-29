/**
 * Class wrapping Vulkan's VkDeviceCreateInfo struct.
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
 *  This class is a Java front end for struct VkDeviceCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDeviceCreateInfo {
 *     VkStructureType                    sType;
 *     const void*                        pNext;
 *     VkDeviceCreateFlags                flags;
 *     uint32_t                           queueCreateInfoCount;
 *     const VkDeviceQueueCreateInfo*     pQueueCreateInfos;
 *     uint32_t                           enabledLayerCount;
 *     const char* const*                 ppEnabledLayerNames;
 *     uint32_t                           enabledExtensionCount;
 *     const char* const*                 ppEnabledExtensionNames;
 *     const VkPhysicalDeviceFeatures*    pEnabledFeatures;
 * } VkDeviceCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkDeviceCreateInfo extends VkStruct {
	/** TAG of this structure [16]  */
	 private static final String TAG = "VkDeviceCreateInfo";

	/** ID of this structure [16]  */
	 public static final int TAG_ID = VKDEVICECREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkDeviceCreateInfo> p;

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
	 *  VkDeviceCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  uint32_t 	queueCreateInfoCount	[int]
	 */ 
	 int 	queueCreateInfoCount;

	/**
	 *  const VkDeviceQueueCreateInfo* 	pQueueCreateInfos	[vkstruct]
	 */ 
	  VkDeviceQueueCreateInfo  	pQueueCreateInfos;

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
	 *  const VkPhysicalDeviceFeatures* 	pEnabledFeatures	[vkstruct]
	 */ 
	  VkPhysicalDeviceFeatures  	pEnabledFeatures;

	/**
	 * Ctor
	 */
	public VkDeviceCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDeviceCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkDeviceCreateInfo(long address, int memSize){ 
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
	 public static P<VkDeviceCreateInfo> createNullPointer(){
	        P<VkDeviceCreateInfo> p = new  P<VkDeviceCreateInfo>(new VkDeviceCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkDeviceCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkDeviceCreateInfo> (this);
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
	 * Prototype: VkDeviceCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 flags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkDeviceCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = flags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field queueCreateInfoCount	[int]<br>
	 * Prototype: uint32_t  queueCreateInfoCount
	 */ 
	 public void queueCreateInfoCount(int queueCreateInfoCount){
		 this.queueCreateInfoCount = queueCreateInfoCount;
		 queueCreateInfoCount0(this.ptr,  queueCreateInfoCount);
	 }

	/**
	 * Get method for field queueCreateInfoCount	[int]<br>
	 * Prototype: uint32_t  queueCreateInfoCount
	 */ 
	 public int queueCreateInfoCount(){
		 int var = queueCreateInfoCount0(super.ptr);
		 this.queueCreateInfoCount = var;
		 return this.queueCreateInfoCount;
	 }

	/**
	 * Set method for field pQueueCreateInfos	[vkstruct]<br>
	 * Prototype: const VkDeviceQueueCreateInfo*  pQueueCreateInfos
	 */ 
	 public void pQueueCreateInfos( VkDeviceQueueCreateInfo  pQueueCreateInfos){
		 this.pQueueCreateInfos = pQueueCreateInfos;
		 ByteBuffer buff = (pQueueCreateInfos==null) ? null : pQueueCreateInfos.getPointerStruct();
		 pQueueCreateInfos0(this.ptr, buff);
	 }

	/**
	 * Get method for field pQueueCreateInfos	[vkstruct]<br>
	 * Prototype: const VkDeviceQueueCreateInfo*  pQueueCreateInfos
	 */ 
	 public  VkDeviceQueueCreateInfo  pQueueCreateInfos(){
		 ByteBuffer pointer = pQueueCreateInfos0(super.ptr);
		 if(pointer == null){
		    this.pQueueCreateInfos = null;
		    return null;
		  } else 
 		 if(this.pQueueCreateInfos == null){
		    this.pQueueCreateInfos = new  VkDeviceQueueCreateInfo (pointer);
		 }else{
		    this.pQueueCreateInfos.setPointer(pointer);
		  }
		 return this.pQueueCreateInfos;
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

	/**
	 * Set method for field pEnabledFeatures	[vkstruct]<br>
	 * Prototype: const VkPhysicalDeviceFeatures*  pEnabledFeatures
	 */ 
	 public void pEnabledFeatures( VkPhysicalDeviceFeatures  pEnabledFeatures){
		 this.pEnabledFeatures = pEnabledFeatures;
		 ByteBuffer buff = (pEnabledFeatures==null) ? null : pEnabledFeatures.getPointerStruct();
		 pEnabledFeatures0(this.ptr, buff);
	 }

	/**
	 * Get method for field pEnabledFeatures	[vkstruct]<br>
	 * Prototype: const VkPhysicalDeviceFeatures*  pEnabledFeatures
	 */ 
	 public  VkPhysicalDeviceFeatures  pEnabledFeatures(){
		 ByteBuffer pointer = pEnabledFeatures0(super.ptr);
		 if(pointer == null){
		    this.pEnabledFeatures = null;
		    return null;
		  } else 
 		 if(this.pEnabledFeatures == null){
		    this.pEnabledFeatures = new  VkPhysicalDeviceFeatures (pointer);
		 }else{
		    this.pEnabledFeatures.setPointer(pointer);
		  }
		 return this.pEnabledFeatures;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkDeviceCreateInfo vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkDeviceCreateInfo vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkDeviceCreateFlags  flags
	 */ 
	 private static native void flags0(Buffer ptr, int _flags);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->flags = (VkDeviceCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkDeviceCreateFlags  flags
	 */ 
	 private static native int flags0(Buffer ptr);/*
		  VkDeviceCreateInfo vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field queueCreateInfoCount	[int]<br>
	 * Prototype: uint32_t  queueCreateInfoCount
	 */ 
	 private static native void queueCreateInfoCount0(Buffer ptr, int _queueCreateInfoCount);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->queueCreateInfoCount = (uint32_t) (_queueCreateInfoCount);
	  */

	/**
	 * native GET method for field queueCreateInfoCount	[int]<br>
	 * Prototype: uint32_t  queueCreateInfoCount
	 */ 
	 private static native int queueCreateInfoCount0(Buffer ptr);/*
		  VkDeviceCreateInfo vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->queueCreateInfoCount);
	 */

	/**
	 * native SET method for field pQueueCreateInfos	[vkstruct]<br>
	 * Prototype: const VkDeviceQueueCreateInfo*  pQueueCreateInfos
	 */ 
	 private static native void pQueueCreateInfos0(Buffer ptr, java.nio.ByteBuffer  _pQueueCreateInfos);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->pQueueCreateInfos = (const VkDeviceQueueCreateInfo*) (_pQueueCreateInfos);
	  */

	/**
	 * native GET method for field pQueueCreateInfos	[vkstruct]<br>
	 * Prototype: const VkDeviceQueueCreateInfo*  pQueueCreateInfos
	 */ 
	 private static native java.nio.ByteBuffer  pQueueCreateInfos0(Buffer ptr);/*
		  VkDeviceCreateInfo vkObj = (VkDeviceCreateInfo*)(ptr);
		  return ( VkDeviceQueueCreateInfo ) (vkObj->pQueueCreateInfos);
	 */

	/**
	 * native SET method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 private static native void enabledLayerCount0(Buffer ptr, int _enabledLayerCount);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->enabledLayerCount = (uint32_t) (_enabledLayerCount);
	  */

	/**
	 * native GET method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 private static native int enabledLayerCount0(Buffer ptr);/*
		  VkDeviceCreateInfo vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->enabledLayerCount);
	 */

	/**
	 * native SET method for field ppEnabledLayerNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledLayerNames
	 */ 
	 private static native void ppEnabledLayerNames0(Buffer ptr, String[] _ppEnabledLayerNames);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->ppEnabledLayerNames = (const char* const*) (_ppEnabledLayerNames);
	  */

	/**
	 * native GET method for field ppEnabledLayerNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledLayerNames
	 */ 
	 private static native String[] ppEnabledLayerNames0(Buffer ptr);/*
		  VkDeviceCreateInfo vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (String[]) (vkObj->ppEnabledLayerNames);
	 */

	/**
	 * native SET method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 private static native void enabledExtensionCount0(Buffer ptr, int _enabledExtensionCount);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->enabledExtensionCount = (uint32_t) (_enabledExtensionCount);
	  */

	/**
	 * native GET method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 private static native int enabledExtensionCount0(Buffer ptr);/*
		  VkDeviceCreateInfo vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->enabledExtensionCount);
	 */

	/**
	 * native SET method for field ppEnabledExtensionNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledExtensionNames
	 */ 
	 private static native void ppEnabledExtensionNames0(Buffer ptr, String[] _ppEnabledExtensionNames);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->ppEnabledExtensionNames = (const char* const*) (_ppEnabledExtensionNames);
	  */

	/**
	 * native GET method for field ppEnabledExtensionNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledExtensionNames
	 */ 
	 private static native String[] ppEnabledExtensionNames0(Buffer ptr);/*
		  VkDeviceCreateInfo vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (String[]) (vkObj->ppEnabledExtensionNames);
	 */

	/**
	 * native SET method for field pEnabledFeatures	[vkstruct]<br>
	 * Prototype: const VkPhysicalDeviceFeatures*  pEnabledFeatures
	 */ 
	 private static native void pEnabledFeatures0(Buffer ptr, java.nio.ByteBuffer  _pEnabledFeatures);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->pEnabledFeatures = (const VkPhysicalDeviceFeatures*) (_pEnabledFeatures);
	  */

	/**
	 * native GET method for field pEnabledFeatures	[vkstruct]<br>
	 * Prototype: const VkPhysicalDeviceFeatures*  pEnabledFeatures
	 */ 
	 private static native java.nio.ByteBuffer  pEnabledFeatures0(Buffer ptr);/*
		  VkDeviceCreateInfo vkObj = (VkDeviceCreateInfo*)(ptr);
		  return ( VkPhysicalDeviceFeatures ) (vkObj->pEnabledFeatures);
	 */



} // end of class VkDeviceCreateInfo
