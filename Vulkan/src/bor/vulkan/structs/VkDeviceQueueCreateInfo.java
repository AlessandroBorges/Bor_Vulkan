/**
 * Class wrapping Vulkan's VkDeviceQueueCreateInfo struct.
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
 *  This class is a Java front end for struct VkDeviceQueueCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDeviceQueueCreateInfo {
 *     VkStructureType             sType;
 *     const void*                 pNext;
 *     VkDeviceQueueCreateFlags    flags;
 *     uint32_t                    queueFamilyIndex;
 *     uint32_t                    queueCount;
 *     const float*                pQueuePriorities;
 * } VkDeviceQueueCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkDeviceQueueCreateInfo extends VkStruct {
	/** TAG of this structure [139]  */
	 private static final String TAG = "VkDeviceQueueCreateInfo";

	/** ID of this structure [139]  */
	 public static final int TAG_ID = VKDEVICEQUEUECREATEINFO_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType	[vkenum]	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext		 */ 
	P<VkObject> 	pNext;

	/**
	 *  VkDeviceQueueCreateFlags 	flags		 */ 
	int 	flags;

	/**
	 *  uint32_t 	queueFamilyIndex		 */ 
	int 	queueFamilyIndex;

	/**
	 *  uint32_t 	queueCount		 */ 
	int 	queueCount;

	/**
	 *  const float* 	pQueuePriorities		 */ 
	float[] 	pQueuePriorities;

	/**
	 * Ctor
	 */
	public VkDeviceQueueCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType	[vkenum]
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
	 * Prototype: VkDeviceQueueCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	
	 * Prototype: VkDeviceQueueCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field queueFamilyIndex	
	 * Prototype: uint32_t  queueFamilyIndex
	 */ 
	 public void queueFamilyIndex(int queueFamilyIndex){
		 this.queueFamilyIndex = queueFamilyIndex;
		queueFamilyIndex0(super.ptr, queueFamilyIndex);
	 }

	/**
	 * get method for field queueFamilyIndex	
	 * Prototype: uint32_t  queueFamilyIndex
	 */ 
	 public int queueFamilyIndex(){
		 // return  this.queueFamilyIndex;
		 return queueFamilyIndex0(super.ptr);
	 }

	/**
	 * Set method for field queueCount	
	 * Prototype: uint32_t  queueCount
	 */ 
	 public void queueCount(int queueCount){
		 this.queueCount = queueCount;
		queueCount0(super.ptr, queueCount);
	 }

	/**
	 * get method for field queueCount	
	 * Prototype: uint32_t  queueCount
	 */ 
	 public int queueCount(){
		 // return  this.queueCount;
		 return queueCount0(super.ptr);
	 }

	/**
	 * Set method for field pQueuePriorities	
	 * Prototype: const float*  pQueuePriorities
	 */ 
	 public void pQueuePriorities(float[] pQueuePriorities){
		 this.pQueuePriorities = pQueuePriorities;
		pQueuePriorities0(super.ptr, pQueuePriorities);
	 }

	/**
	 * get method for field pQueuePriorities	
	 * Prototype: const float*  pQueuePriorities
	 */ 
	 public float[] pQueuePriorities(){
		 // return  this.pQueuePriorities;
		 return pQueuePriorities0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkDeviceQueueCreateInfo _obj = (VkDeviceQueueCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkDeviceQueueCreateInfo _obj = (VkDeviceQueueCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkDeviceQueueCreateInfo _obj = (VkDeviceQueueCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkDeviceQueueCreateInfo _obj = (VkDeviceQueueCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags	
	 * Prototype: VkDeviceQueueCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkDeviceQueueCreateInfo _obj = (VkDeviceQueueCreateInfo)(*ptr);
		  _obj.flags = (VkDeviceQueueCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags	
	 * Prototype: VkDeviceQueueCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkDeviceQueueCreateInfo _obj = (VkDeviceQueueCreateInfo)(ptr);
		  return (jint) (_obj.VkDeviceQueueCreateFlags);
	 */

	/**
	 * native Set method for field queueFamilyIndex	
	 * Prototype: uint32_t  queueFamilyIndex
	 */ 
	 private static native void queueFamilyIndex0(ByteBuffer ptr, int _queueFamilyIndex);/*
		  VkDeviceQueueCreateInfo _obj = (VkDeviceQueueCreateInfo)(*ptr);
		  _obj.queueFamilyIndex = (uint32_t) (_queueFamilyIndex);
	  */

	/**
	 * get method for field queueFamilyIndex	
	 * Prototype: uint32_t  queueFamilyIndex
	 */ 
	 private static native int queueFamilyIndex0(ByteBuffer ptr);/*
		  VkDeviceQueueCreateInfo _obj = (VkDeviceQueueCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field queueCount	
	 * Prototype: uint32_t  queueCount
	 */ 
	 private static native void queueCount0(ByteBuffer ptr, int _queueCount);/*
		  VkDeviceQueueCreateInfo _obj = (VkDeviceQueueCreateInfo)(*ptr);
		  _obj.queueCount = (uint32_t) (_queueCount);
	  */

	/**
	 * get method for field queueCount	
	 * Prototype: uint32_t  queueCount
	 */ 
	 private static native int queueCount0(ByteBuffer ptr);/*
		  VkDeviceQueueCreateInfo _obj = (VkDeviceQueueCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pQueuePriorities	
	 * Prototype: const float*  pQueuePriorities
	 */ 
	 private static native void pQueuePriorities0(ByteBuffer ptr, float[] _pQueuePriorities);/*
		  VkDeviceQueueCreateInfo _obj = (VkDeviceQueueCreateInfo)(*ptr);
		  _obj.pQueuePriorities = (const float*) (_pQueuePriorities);
	  */

	/**
	 * get method for field pQueuePriorities	
	 * Prototype: const float*  pQueuePriorities
	 */ 
	 private static native float[] pQueuePriorities0(ByteBuffer ptr);/*
		  VkDeviceQueueCreateInfo _obj = (VkDeviceQueueCreateInfo)(ptr);
		  return (float[]) (_obj.const float*);
	 */



} // end of class VkDeviceQueueCreateInfo
