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


/**
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
	/** TAG of this structure [140]  */
	 private static final String TAG = "VkDeviceCreateInfo";

	/** ID of this structure [140]  */
	 public static final int TAG_ID = VKDEVICECREATEINFO_ID;

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
	 *  VkDeviceCreateFlags 	flags 
	 */ 
	int 	flags;

	/**
	 *  uint32_t 	queueCreateInfoCount 
	 */ 
	int 	queueCreateInfoCount;

	/**
	 *  const VkDeviceQueueCreateInfo* 	pQueueCreateInfos 
	 */ 
	P<VkDeviceQueueCreateInfo>  	pQueueCreateInfos;

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
	 *  const VkPhysicalDeviceFeatures* 	pEnabledFeatures 
	 */ 
	P<VkPhysicalDeviceFeatures>  	pEnabledFeatures;

	/**
	 * Ctor
	 */
	public VkDeviceCreateInfo(){ 
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
	 * Prototype: VkDeviceCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkDeviceCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field queueCreateInfoCount
	 * Prototype: uint32_t  queueCreateInfoCount
	 */ 
	 public void queueCreateInfoCount(int queueCreateInfoCount){
		 this.queueCreateInfoCount = queueCreateInfoCount;
		queueCreateInfoCount0(super.ptr, queueCreateInfoCount);
	 }

	/**
	 * get method for field queueCreateInfoCount
	 * Prototype: uint32_t  queueCreateInfoCount
	 */ 
	 public int queueCreateInfoCount(){
		 // return  this.queueCreateInfoCount;
		 return queueCreateInfoCount0(super.ptr);
	 }

	/**
	 * Set method for field pQueueCreateInfos
	 * Prototype: const VkDeviceQueueCreateInfo*  pQueueCreateInfos
	 */ 
	 public void pQueueCreateInfos(P<VkDeviceQueueCreateInfo>  pQueueCreateInfos){
		 this.pQueueCreateInfos = pQueueCreateInfos;
		pQueueCreateInfos0(super.ptr, pQueueCreateInfos);
	 }

	/**
	 * get method for field pQueueCreateInfos
	 * Prototype: const VkDeviceQueueCreateInfo*  pQueueCreateInfos
	 */ 
	 public P<VkDeviceQueueCreateInfo>  pQueueCreateInfos(){
		 // return  this.pQueueCreateInfos;
		 return pQueueCreateInfos0(super.ptr);
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

	/**
	 * Set method for field pEnabledFeatures
	 * Prototype: const VkPhysicalDeviceFeatures*  pEnabledFeatures
	 */ 
	 public void pEnabledFeatures(P<VkPhysicalDeviceFeatures>  pEnabledFeatures){
		 this.pEnabledFeatures = pEnabledFeatures;
		pEnabledFeatures0(super.ptr, pEnabledFeatures);
	 }

	/**
	 * get method for field pEnabledFeatures
	 * Prototype: const VkPhysicalDeviceFeatures*  pEnabledFeatures
	 */ 
	 public P<VkPhysicalDeviceFeatures>  pEnabledFeatures(){
		 // return  this.pEnabledFeatures;
		 return pEnabledFeatures0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkDeviceCreateInfo _obj = (VkDeviceCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkDeviceCreateInfo _obj = (VkDeviceCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkDeviceCreateInfo _obj = (VkDeviceCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkDeviceCreateInfo _obj = (VkDeviceCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkDeviceCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkDeviceCreateInfo _obj = (VkDeviceCreateInfo)(*ptr);
		  _obj.flags = (VkDeviceCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkDeviceCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkDeviceCreateInfo _obj = (VkDeviceCreateInfo)(ptr);
		  return (jint) (_obj.VkDeviceCreateFlags);
	 */

	/**
	 * native Set method for field queueCreateInfoCount
	 * Prototype: uint32_t  queueCreateInfoCount
	 */ 
	 private static native void queueCreateInfoCount0(ByteBuffer ptr, int _queueCreateInfoCount);/*
		  VkDeviceCreateInfo _obj = (VkDeviceCreateInfo)(*ptr);
		  _obj.queueCreateInfoCount = (uint32_t) (_queueCreateInfoCount);
	  */

	/**
	 * get method for field queueCreateInfoCount
	 * Prototype: uint32_t  queueCreateInfoCount
	 */ 
	 private static native int queueCreateInfoCount0(ByteBuffer ptr);/*
		  VkDeviceCreateInfo _obj = (VkDeviceCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pQueueCreateInfos
	 * Prototype: const VkDeviceQueueCreateInfo*  pQueueCreateInfos
	 */ 
	 private static native void pQueueCreateInfos0(ByteBuffer ptr, P<VkDeviceQueueCreateInfo>  _pQueueCreateInfos);/*
		  VkDeviceCreateInfo _obj = (VkDeviceCreateInfo)(*ptr);
		  _obj.pQueueCreateInfos = (const VkDeviceQueueCreateInfo*) (_pQueueCreateInfos);
	  */

	/**
	 * get method for field pQueueCreateInfos
	 * Prototype: const VkDeviceQueueCreateInfo*  pQueueCreateInfos
	 */ 
	 private static native P<VkDeviceQueueCreateInfo>  pQueueCreateInfos0(ByteBuffer ptr);/*
		  VkDeviceCreateInfo _obj = (VkDeviceCreateInfo)(ptr);
		  return (P<VkDeviceQueueCreateInfo> ) (_obj.const VkDeviceQueueCreateInfo*);
	 */

	/**
	 * native Set method for field enabledLayerCount
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 private static native void enabledLayerCount0(ByteBuffer ptr, int _enabledLayerCount);/*
		  VkDeviceCreateInfo _obj = (VkDeviceCreateInfo)(*ptr);
		  _obj.enabledLayerCount = (uint32_t) (_enabledLayerCount);
	  */

	/**
	 * get method for field enabledLayerCount
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 private static native int enabledLayerCount0(ByteBuffer ptr);/*
		  VkDeviceCreateInfo _obj = (VkDeviceCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field ppEnabledLayerNames
	 * Prototype: const char* const*  ppEnabledLayerNames
	 */ 
	 private static native void ppEnabledLayerNames0(ByteBuffer ptr, String[] _ppEnabledLayerNames);/*
		  VkDeviceCreateInfo _obj = (VkDeviceCreateInfo)(*ptr);
		  _obj.ppEnabledLayerNames = (const char* const*) (_ppEnabledLayerNames);
	  */

	/**
	 * get method for field ppEnabledLayerNames
	 * Prototype: const char* const*  ppEnabledLayerNames
	 */ 
	 private static native String[] ppEnabledLayerNames0(ByteBuffer ptr);/*
		  VkDeviceCreateInfo _obj = (VkDeviceCreateInfo)(ptr);
		  return (String[]) (_obj.const char* const*);
	 */

	/**
	 * native Set method for field enabledExtensionCount
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 private static native void enabledExtensionCount0(ByteBuffer ptr, int _enabledExtensionCount);/*
		  VkDeviceCreateInfo _obj = (VkDeviceCreateInfo)(*ptr);
		  _obj.enabledExtensionCount = (uint32_t) (_enabledExtensionCount);
	  */

	/**
	 * get method for field enabledExtensionCount
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 private static native int enabledExtensionCount0(ByteBuffer ptr);/*
		  VkDeviceCreateInfo _obj = (VkDeviceCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field ppEnabledExtensionNames
	 * Prototype: const char* const*  ppEnabledExtensionNames
	 */ 
	 private static native void ppEnabledExtensionNames0(ByteBuffer ptr, String[] _ppEnabledExtensionNames);/*
		  VkDeviceCreateInfo _obj = (VkDeviceCreateInfo)(*ptr);
		  _obj.ppEnabledExtensionNames = (const char* const*) (_ppEnabledExtensionNames);
	  */

	/**
	 * get method for field ppEnabledExtensionNames
	 * Prototype: const char* const*  ppEnabledExtensionNames
	 */ 
	 private static native String[] ppEnabledExtensionNames0(ByteBuffer ptr);/*
		  VkDeviceCreateInfo _obj = (VkDeviceCreateInfo)(ptr);
		  return (String[]) (_obj.const char* const*);
	 */

	/**
	 * native Set method for field pEnabledFeatures
	 * Prototype: const VkPhysicalDeviceFeatures*  pEnabledFeatures
	 */ 
	 private static native void pEnabledFeatures0(ByteBuffer ptr, P<VkPhysicalDeviceFeatures>  _pEnabledFeatures);/*
		  VkDeviceCreateInfo _obj = (VkDeviceCreateInfo)(*ptr);
		  _obj.pEnabledFeatures = (const VkPhysicalDeviceFeatures*) (_pEnabledFeatures);
	  */

	/**
	 * get method for field pEnabledFeatures
	 * Prototype: const VkPhysicalDeviceFeatures*  pEnabledFeatures
	 */ 
	 private static native P<VkPhysicalDeviceFeatures>  pEnabledFeatures0(ByteBuffer ptr);/*
		  VkDeviceCreateInfo _obj = (VkDeviceCreateInfo)(ptr);
		  return (P<VkPhysicalDeviceFeatures> ) (_obj.const VkPhysicalDeviceFeatures*);
	 */



} // end of class VkDeviceCreateInfo
