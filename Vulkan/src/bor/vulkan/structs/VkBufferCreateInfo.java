/**
 * Class wrapping Vulkan's VkBufferCreateInfo struct.
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
 *  This class is a Java front end for struct VkBufferCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkBufferCreateInfo {
 *     VkStructureType        sType;
 *     const void*            pNext;
 *     VkBufferCreateFlags    flags;
 *     VkDeviceSize           size;
 *     VkBufferUsageFlags     usage;
 *     VkSharingMode          sharingMode;
 *     uint32_t               queueFamilyIndexCount;
 *     const uint32_t*        pQueueFamilyIndices;
 * } VkBufferCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkBufferCreateInfo extends VkStruct {
	/** TAG of this structure [161]  */
	 private static final String TAG = "VkBufferCreateInfo";

	/** ID of this structure [161]  */
	 public static final int TAG_ID = VKBUFFERCREATEINFO_ID;

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
	 *  VkBufferCreateFlags 	flags 
	 */ 
	int 	flags;

	/**
	 *  VkDeviceSize 	size 
	 */ 
	long 	size;

	/**
	 *  VkBufferUsageFlags 	usage 
	 */ 
	int 	usage;

	/**
	 *  VkSharingMode 	sharingMode 
	 */ 
	VkSharingMode 	sharingMode;

	/**
	 *  uint32_t 	queueFamilyIndexCount 
	 */ 
	int 	queueFamilyIndexCount;

	/**
	 *  const uint32_t* 	pQueueFamilyIndices 
	 */ 
	int[] 	pQueueFamilyIndices;

	/**
	 * Ctor
	 */
	public VkBufferCreateInfo(){ 
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
	 * Prototype: VkBufferCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkBufferCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field size
	 * Prototype: VkDeviceSize  size
	 */ 
	 public void size(long size){
		 this.size = size;
		size0(super.ptr, size);
	 }

	/**
	 * get method for field size
	 * Prototype: VkDeviceSize  size
	 */ 
	 public long size(){
		 // return  this.size;
		 return size0(super.ptr);
	 }

	/**
	 * Set method for field usage
	 * Prototype: VkBufferUsageFlags  usage
	 */ 
	 public void usage(int usage){
		 this.usage = usage;
		usage0(super.ptr, usage);
	 }

	/**
	 * get method for field usage
	 * Prototype: VkBufferUsageFlags  usage
	 */ 
	 public int usage(){
		 // return  this.usage;
		 return usage0(super.ptr);
	 }

	/**
	 * Set method for field sharingMode
	 * Prototype: VkSharingMode  sharingMode
	 */ 
	 public void sharingMode(VkSharingMode sharingMode){
		 this.sharingMode = sharingMode;
		sharingMode0(super.ptr, sharingMode);
	 }

	/**
	 * get method for field sharingMode
	 * Prototype: VkSharingMode  sharingMode
	 */ 
	 public VkSharingMode sharingMode(){
		 // return  this.sharingMode;
		 return sharingMode0(super.ptr);
	 }

	/**
	 * Set method for field queueFamilyIndexCount
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 public void queueFamilyIndexCount(int queueFamilyIndexCount){
		 this.queueFamilyIndexCount = queueFamilyIndexCount;
		queueFamilyIndexCount0(super.ptr, queueFamilyIndexCount);
	 }

	/**
	 * get method for field queueFamilyIndexCount
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 public int queueFamilyIndexCount(){
		 // return  this.queueFamilyIndexCount;
		 return queueFamilyIndexCount0(super.ptr);
	 }

	/**
	 * Set method for field pQueueFamilyIndices
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 public void pQueueFamilyIndices(int[] pQueueFamilyIndices){
		 this.pQueueFamilyIndices = pQueueFamilyIndices;
		pQueueFamilyIndices0(super.ptr, pQueueFamilyIndices);
	 }

	/**
	 * get method for field pQueueFamilyIndices
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 public int[] pQueueFamilyIndices(){
		 // return  this.pQueueFamilyIndices;
		 return pQueueFamilyIndices0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkBufferCreateInfo _obj = (VkBufferCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkBufferCreateInfo _obj = (VkBufferCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkBufferCreateInfo _obj = (VkBufferCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkBufferCreateInfo _obj = (VkBufferCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkBufferCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkBufferCreateInfo _obj = (VkBufferCreateInfo)(*ptr);
		  _obj.flags = (VkBufferCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkBufferCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkBufferCreateInfo _obj = (VkBufferCreateInfo)(ptr);
		  return (jint) (_obj.VkBufferCreateFlags);
	 */

	/**
	 * native Set method for field size
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native void size0(ByteBuffer ptr, long _size);/*
		  VkBufferCreateInfo _obj = (VkBufferCreateInfo)(*ptr);
		  _obj.size = (VkDeviceSize) (_size);
	  */

	/**
	 * get method for field size
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native long size0(ByteBuffer ptr);/*
		  VkBufferCreateInfo _obj = (VkBufferCreateInfo)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native Set method for field usage
	 * Prototype: VkBufferUsageFlags  usage
	 */ 
	 private static native void usage0(ByteBuffer ptr, int _usage);/*
		  VkBufferCreateInfo _obj = (VkBufferCreateInfo)(*ptr);
		  _obj.usage = (VkBufferUsageFlags) (_usage);
	  */

	/**
	 * get method for field usage
	 * Prototype: VkBufferUsageFlags  usage
	 */ 
	 private static native int usage0(ByteBuffer ptr);/*
		  VkBufferCreateInfo _obj = (VkBufferCreateInfo)(ptr);
		  return (jint) (_obj.VkBufferUsageFlags);
	 */

	/**
	 * native Set method for field sharingMode
	 * Prototype: VkSharingMode  sharingMode
	 */ 
	 private static native void sharingMode0(ByteBuffer ptr, VkSharingMode _sharingMode);/*
		  VkBufferCreateInfo _obj = (VkBufferCreateInfo)(*ptr);
		  _obj.sharingMode = (VkSharingMode) (_sharingMode);
	  */

	/**
	 * get method for field sharingMode
	 * Prototype: VkSharingMode  sharingMode
	 */ 
	 private static native VkSharingMode sharingMode0(ByteBuffer ptr);/*
		  VkBufferCreateInfo _obj = (VkBufferCreateInfo)(ptr);
		  return (VkSharingMode) (_obj.VkSharingMode);
	 */

	/**
	 * native Set method for field queueFamilyIndexCount
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 private static native void queueFamilyIndexCount0(ByteBuffer ptr, int _queueFamilyIndexCount);/*
		  VkBufferCreateInfo _obj = (VkBufferCreateInfo)(*ptr);
		  _obj.queueFamilyIndexCount = (uint32_t) (_queueFamilyIndexCount);
	  */

	/**
	 * get method for field queueFamilyIndexCount
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 private static native int queueFamilyIndexCount0(ByteBuffer ptr);/*
		  VkBufferCreateInfo _obj = (VkBufferCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pQueueFamilyIndices
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 private static native void pQueueFamilyIndices0(ByteBuffer ptr, int[] _pQueueFamilyIndices);/*
		  VkBufferCreateInfo _obj = (VkBufferCreateInfo)(*ptr);
		  _obj.pQueueFamilyIndices = (const uint32_t*) (_pQueueFamilyIndices);
	  */

	/**
	 * get method for field pQueueFamilyIndices
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 private static native int[] pQueueFamilyIndices0(ByteBuffer ptr);/*
		  VkBufferCreateInfo _obj = (VkBufferCreateInfo)(ptr);
		  return (int[]) (_obj.const uint32_t*);
	 */



} // end of class VkBufferCreateInfo
