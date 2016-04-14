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
	 public VkDeviceCreateInfo(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDeviceCreateInfo(long address){ 
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
		 setSType0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = getSType0(super.ptr);
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
		 setPNext0(this.ptr, buff);
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 long pointer = getPNext0(super.ptr);
		 if(pointer == 0){
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
		 setFlags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkDeviceCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field queueCreateInfoCount	[int]<br>
	 * Prototype: uint32_t  queueCreateInfoCount
	 */ 
	 public void queueCreateInfoCount(int queueCreateInfoCount){
		 this.queueCreateInfoCount = queueCreateInfoCount;
		 setQueueCreateInfoCount0(this.ptr,  queueCreateInfoCount);
	 }

	/**
	 * Get method for field queueCreateInfoCount	[int]<br>
	 * Prototype: uint32_t  queueCreateInfoCount
	 */ 
	 public int queueCreateInfoCount(){
		 int var = getQueueCreateInfoCount0(super.ptr);
		 this.queueCreateInfoCount = var;
		 return this.queueCreateInfoCount;
	 }

	/**
	 * Set method for field pQueueCreateInfos	[vkstruct]<br>
	 * Prototype: const VkDeviceQueueCreateInfo*  pQueueCreateInfos
	 */ 
	 public void pQueueCreateInfos( VkDeviceQueueCreateInfo  pQueueCreateInfos){
		 this.pQueueCreateInfos = pQueueCreateInfos;
		 ByteBuffer buff = (pQueueCreateInfos==null) ? null : pQueueCreateInfos.getPointer();
		 setPQueueCreateInfos0(this.ptr, buff);
	 }

	/**
	 * Get method for field pQueueCreateInfos	[vkstruct]<br>
	 * Prototype: const VkDeviceQueueCreateInfo*  pQueueCreateInfos
	 */ 
	 public  VkDeviceQueueCreateInfo  pQueueCreateInfos(){
		 long pointer = getPQueueCreateInfos0(super.ptr);
		 if(pointer == 0){
		    this.pQueueCreateInfos = null;
		    return null;
		  } 

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
		 setEnabledLayerCount0(this.ptr,  enabledLayerCount);
	 }

	/**
	 * Get method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 public int enabledLayerCount(){
		 int var = getEnabledLayerCount0(super.ptr);
		 this.enabledLayerCount = var;
		 return this.enabledLayerCount;
	 }

	/**
	 * Set method for field ppEnabledLayerNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledLayerNames
	 */ 
	 public void ppEnabledLayerNames(String[] ppEnabledLayerNames){
		 this.ppEnabledLayerNames = ppEnabledLayerNames;
		 setPpEnabledLayerNames0(this.ptr,  ppEnabledLayerNames);
	 }

	/**
	 * Get method for field ppEnabledLayerNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledLayerNames
	 */ 
	 public String[] ppEnabledLayerNames(){
		 String[] var = getPpEnabledLayerNames0(super.ptr);
		 this.ppEnabledLayerNames = var;
		 return this.ppEnabledLayerNames;
	 }

	/**
	 * Set method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 public void enabledExtensionCount(int enabledExtensionCount){
		 this.enabledExtensionCount = enabledExtensionCount;
		 setEnabledExtensionCount0(this.ptr,  enabledExtensionCount);
	 }

	/**
	 * Get method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 public int enabledExtensionCount(){
		 int var = getEnabledExtensionCount0(super.ptr);
		 this.enabledExtensionCount = var;
		 return this.enabledExtensionCount;
	 }

	/**
	 * Set method for field ppEnabledExtensionNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledExtensionNames
	 */ 
	 public void ppEnabledExtensionNames(String[] ppEnabledExtensionNames){
		 this.ppEnabledExtensionNames = ppEnabledExtensionNames;
		 setPpEnabledExtensionNames0(this.ptr,  ppEnabledExtensionNames);
	 }

	/**
	 * Get method for field ppEnabledExtensionNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledExtensionNames
	 */ 
	 public String[] ppEnabledExtensionNames(){
		 String[] var = getPpEnabledExtensionNames0(super.ptr);
		 this.ppEnabledExtensionNames = var;
		 return this.ppEnabledExtensionNames;
	 }

	/**
	 * Set method for field pEnabledFeatures	[vkstruct]<br>
	 * Prototype: const VkPhysicalDeviceFeatures*  pEnabledFeatures
	 */ 
	 public void pEnabledFeatures( VkPhysicalDeviceFeatures  pEnabledFeatures){
		 this.pEnabledFeatures = pEnabledFeatures;
		 ByteBuffer buff = (pEnabledFeatures==null) ? null : pEnabledFeatures.getPointer();
		 setPEnabledFeatures0(this.ptr, buff);
	 }

	/**
	 * Get method for field pEnabledFeatures	[vkstruct]<br>
	 * Prototype: const VkPhysicalDeviceFeatures*  pEnabledFeatures
	 */ 
	 public  VkPhysicalDeviceFeatures  pEnabledFeatures(){
		 long pointer = getPEnabledFeatures0(super.ptr);
		 if(pointer == 0){
		    this.pEnabledFeatures = null;
		    return null;
		  } 

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
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkDeviceCreateInfo vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkDeviceCreateInfo vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkDeviceCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->flags = (VkDeviceCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkDeviceCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkDeviceCreateInfo vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field queueCreateInfoCount	[int]<br>
	 * Prototype: uint32_t  queueCreateInfoCount
	 */ 
	 private static native void setQueueCreateInfoCount0(Buffer ptr, int _queueCreateInfoCount);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->queueCreateInfoCount = (uint32_t) (_queueCreateInfoCount);
	  */

	/**
	 * native GET method for field queueCreateInfoCount	[int]<br>
	 * Prototype: uint32_t  queueCreateInfoCount
	 */ 
	 private static native int getQueueCreateInfoCount0(Buffer ptr);/*
		  VkDeviceCreateInfo vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->queueCreateInfoCount);
	 */

	/**
	 * native SET method for field pQueueCreateInfos	[vkstruct]<br>
	 * Prototype: const VkDeviceQueueCreateInfo*  pQueueCreateInfos
	 */ 
	 private static native void setPQueueCreateInfos0(Buffer ptr, java.nio.ByteBuffer  _pQueueCreateInfos);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->pQueueCreateInfos = (const VkDeviceQueueCreateInfo*) (_pQueueCreateInfos);
	  */

	/**
	 * native GET method for field pQueueCreateInfos	[vkstruct]<br>
	 * Prototype: const VkDeviceQueueCreateInfo*  pQueueCreateInfos
	 */ 
	 private static native long getPQueueCreateInfos0(Buffer ptr);/*
		  VkDeviceCreateInfo vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pQueueCreateInfos);	 */

	/**
	 * native SET method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 private static native void setEnabledLayerCount0(Buffer ptr, int _enabledLayerCount);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->enabledLayerCount = (uint32_t) (_enabledLayerCount);
	  */

	/**
	 * native GET method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 private static native int getEnabledLayerCount0(Buffer ptr);/*
		  VkDeviceCreateInfo vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->enabledLayerCount);
	 */

	/**
	 * native SET method for field ppEnabledLayerNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledLayerNames
	 */ 
	 private static native void setPpEnabledLayerNames0(Buffer ptr, String[] _ppEnabledLayerNames);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->ppEnabledLayerNames = (const char* const*) (_ppEnabledLayerNames);
	  */

	/**
	 * native GET method for field ppEnabledLayerNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledLayerNames
	 */ 
	 private static native String[] getPpEnabledLayerNames0(Buffer ptr);/*
		  VkDeviceCreateInfo vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (String[]) (vkObj->ppEnabledLayerNames);
	 */

	/**
	 * native SET method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 private static native void setEnabledExtensionCount0(Buffer ptr, int _enabledExtensionCount);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->enabledExtensionCount = (uint32_t) (_enabledExtensionCount);
	  */

	/**
	 * native GET method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 private static native int getEnabledExtensionCount0(Buffer ptr);/*
		  VkDeviceCreateInfo vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->enabledExtensionCount);
	 */

	/**
	 * native SET method for field ppEnabledExtensionNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledExtensionNames
	 */ 
	 private static native void setPpEnabledExtensionNames0(Buffer ptr, String[] _ppEnabledExtensionNames);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->ppEnabledExtensionNames = (const char* const*) (_ppEnabledExtensionNames);
	  */

	/**
	 * native GET method for field ppEnabledExtensionNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledExtensionNames
	 */ 
	 private static native String[] getPpEnabledExtensionNames0(Buffer ptr);/*
		  VkDeviceCreateInfo vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (String[]) (vkObj->ppEnabledExtensionNames);
	 */

	/**
	 * native SET method for field pEnabledFeatures	[vkstruct]<br>
	 * Prototype: const VkPhysicalDeviceFeatures*  pEnabledFeatures
	 */ 
	 private static native void setPEnabledFeatures0(Buffer ptr, java.nio.ByteBuffer  _pEnabledFeatures);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->pEnabledFeatures = (const VkPhysicalDeviceFeatures*) (_pEnabledFeatures);
	  */

	/**
	 * native GET method for field pEnabledFeatures	[vkstruct]<br>
	 * Prototype: const VkPhysicalDeviceFeatures*  pEnabledFeatures
	 */ 
	 private static native long getPEnabledFeatures0(Buffer ptr);/*
		  VkDeviceCreateInfo vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pEnabledFeatures);	 */



} // end of class VkDeviceCreateInfo
