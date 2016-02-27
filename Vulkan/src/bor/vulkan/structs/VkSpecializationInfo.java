// class wrapping Vulkan's VkSpecializationInfo struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkSpecializationInfo 
 * @Author Alessandro Borges 
 */
public class VkSpecializationInfo extends VkStruct {
	/** ID of this structure [47]  */
	 public static final int TAG = VKSPECIALIZATIONINFO_ID;

	 // fields //
	/**
	 *  uint32_t 	mapEntryCount 
	 */ 
	int 	mapEntryCount;

	/**
	 *  const VkSpecializationMapEntry* 	pMapEntries 
	 */ 
	const VkSpecializationMapEntry* 	pMapEntries;

	/**
	 *  size_t 	dataSize 
	 */ 
	long 	dataSize;

	/**
	 *  const void* 	pData 
	 */ 
	const void* 	pData;

	/**
	 * Ctor
	 */
	public VkSpecializationInfo(){ 
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
	 * Set method for field mapEntryCount
	 * Prototype: uint32_t  mapEntryCount
	 */ 
	 public void mapEntryCount(int mapEntryCount){
		 this.mapEntryCount = mapEntryCount;
		mapEntryCount0(super.ptr, mapEntryCount);
	 }

	/**
	 * get method for field mapEntryCount
	 * Prototype: uint32_t  mapEntryCount
	 */ 
	 public int mapEntryCount(){
		 // return  this.mapEntryCount;
		 return mapEntryCount0(super.ptr);
	 }

	/**
	 * Set method for field pMapEntries
	 * Prototype: const VkSpecializationMapEntry*  pMapEntries
	 */ 
	 public void pMapEntries(const VkSpecializationMapEntry* pMapEntries){
		 this.pMapEntries = pMapEntries;
		pMapEntries0(super.ptr, pMapEntries);
	 }

	/**
	 * get method for field pMapEntries
	 * Prototype: const VkSpecializationMapEntry*  pMapEntries
	 */ 
	 public const VkSpecializationMapEntry* pMapEntries(){
		 // return  this.pMapEntries;
		 return pMapEntries0(super.ptr);
	 }

	/**
	 * Set method for field dataSize
	 * Prototype: size_t  dataSize
	 */ 
	 public void dataSize(long dataSize){
		 this.dataSize = dataSize;
		dataSize0(super.ptr, dataSize);
	 }

	/**
	 * get method for field dataSize
	 * Prototype: size_t  dataSize
	 */ 
	 public long dataSize(){
		 // return  this.dataSize;
		 return dataSize0(super.ptr);
	 }

	/**
	 * Set method for field pData
	 * Prototype: const void*  pData
	 */ 
	 public void pData(const void* pData){
		 this.pData = pData;
		pData0(super.ptr, pData);
	 }

	/**
	 * get method for field pData
	 * Prototype: const void*  pData
	 */ 
	 public const void* pData(){
		 // return  this.pData;
		 return pData0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field mapEntryCount
	 * Prototype: uint32_t  mapEntryCount
	 */ 
	 private static native void mapEntryCount0(ByteBuffer ptr, int _mapEntryCount);/*
		  VkSpecializationInfo _obj = (VkSpecializationInfo)(*ptr);
		  _obj.mapEntryCount = (uint32_t) (_mapEntryCount);
	  */

	/**
	 * get method for field mapEntryCount
	 * Prototype: uint32_t  mapEntryCount
	 */ 
	 private static native int mapEntryCount0(ByteBuffer ptr);/*
		  VkSpecializationInfo _obj = (VkSpecializationInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pMapEntries
	 * Prototype: const VkSpecializationMapEntry*  pMapEntries
	 */ 
	 private static native void pMapEntries0(ByteBuffer ptr, const VkSpecializationMapEntry* _pMapEntries);/*
		  VkSpecializationInfo _obj = (VkSpecializationInfo)(*ptr);
		  _obj.pMapEntries = (const VkSpecializationMapEntry*) (_pMapEntries);
	  */

	/**
	 * get method for field pMapEntries
	 * Prototype: const VkSpecializationMapEntry*  pMapEntries
	 */ 
	 private static native const VkSpecializationMapEntry* pMapEntries0(ByteBuffer ptr);/*
		  VkSpecializationInfo _obj = (VkSpecializationInfo)(ptr);
		  return (const VkSpecializationMapEntry*) (_obj.const VkSpecializationMapEntry*);
	 */

	/**
	 * native Set method for field dataSize
	 * Prototype: size_t  dataSize
	 */ 
	 private static native void dataSize0(ByteBuffer ptr, long _dataSize);/*
		  VkSpecializationInfo _obj = (VkSpecializationInfo)(*ptr);
		  _obj.dataSize = (size_t) (_dataSize);
	  */

	/**
	 * get method for field dataSize
	 * Prototype: size_t  dataSize
	 */ 
	 private static native long dataSize0(ByteBuffer ptr);/*
		  VkSpecializationInfo _obj = (VkSpecializationInfo)(ptr);
		  return (jlong) (_obj.size_t);
	 */

	/**
	 * native Set method for field pData
	 * Prototype: const void*  pData
	 */ 
	 private static native void pData0(ByteBuffer ptr, const void* _pData);/*
		  VkSpecializationInfo _obj = (VkSpecializationInfo)(*ptr);
		  _obj.pData = (const void*) (_pData);
	  */

	/**
	 * get method for field pData
	 * Prototype: const void*  pData
	 */ 
	 private static native const void* pData0(ByteBuffer ptr);/*
		  VkSpecializationInfo _obj = (VkSpecializationInfo)(ptr);
		  return (const void*) (_obj.const void*);
	 */



} // end of class VkSpecializationInfo
