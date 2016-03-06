/**
 * Class wrapping Vulkan's VkSpecializationInfo struct.
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
 *  This class is a Java front end for struct VkSpecializationInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSpecializationInfo {
 *     uint32_t                           mapEntryCount;
 *     const VkSpecializationMapEntry*    pMapEntries;
 *     size_t                             dataSize;
 *     const void*                        pData;
 * } VkSpecializationInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkSpecializationInfo extends VkStruct {
	/** TAG of this structure [47]  */
	 private static final String TAG = "VkSpecializationInfo";

	/** ID of this structure [47]  */
	 public static final int TAG_ID = VKSPECIALIZATIONINFO_ID;

	 // fields //
	/**
	 *  uint32_t 	mapEntryCount	[int]
	 */ 
	int 	mapEntryCount;

	/**
	 *  const VkSpecializationMapEntry* 	pMapEntries	[p]
	 */ 
	P<VkSpecializationMapEntry>  	pMapEntries;

	/**
	 *  size_t 	dataSize	[long]
	 */ 
	long 	dataSize;

	/**
	 *  const void* 	pData	[buffer]
	 */ 
	java.nio.Buffer 	pData;

	/**
	 * Ctor
	 */
	public VkSpecializationInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSpecializationInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkSpecializationInfo(long address, int memSize){ 
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
	 public static P<VkSpecializationInfo> createNullPointer(){
	        P<VkSpecializationInfo> p = new  P<VkSpecializationInfo>(new VkSpecializationInfo());
	        return p;
	    }

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field mapEntryCount	[int]<br>
	 * Prototype: uint32_t  mapEntryCount
	 */ 
	 public void mapEntryCount(int mapEntryCount){
		 this.mapEntryCount = mapEntryCount;
		mapEntryCount0(super.ptr, mapEntryCount);
	 }

	/**
	 * get method for field mapEntryCount	[int]<br>
	 * Prototype: uint32_t  mapEntryCount
	 */ 
	 public int mapEntryCount(){
		 // return  this.mapEntryCount;
		 return mapEntryCount0(super.ptr);
	 }

	/**
	 * Set method for field pMapEntries	[p]<br>
	 * Prototype: const VkSpecializationMapEntry*  pMapEntries
	 */ 
	 public void pMapEntries(P<VkSpecializationMapEntry>  pMapEntries){
		 this.pMapEntries = pMapEntries;
		pMapEntries0(super.ptr, pMapEntries);
	 }

	/**
	 * get method for field pMapEntries	[p]<br>
	 * Prototype: const VkSpecializationMapEntry*  pMapEntries
	 */ 
	 public P<VkSpecializationMapEntry>  pMapEntries(){
		 // return  this.pMapEntries;
		 return pMapEntries0(super.ptr);
	 }

	/**
	 * Set method for field dataSize	[long]<br>
	 * Prototype: size_t  dataSize
	 */ 
	 public void dataSize(long dataSize){
		 this.dataSize = dataSize;
		dataSize0(super.ptr, dataSize);
	 }

	/**
	 * get method for field dataSize	[long]<br>
	 * Prototype: size_t  dataSize
	 */ 
	 public long dataSize(){
		 // return  this.dataSize;
		 return dataSize0(super.ptr);
	 }

	/**
	 * Set method for field pData	[buffer]<br>
	 * Prototype: const void*  pData
	 */ 
	 public void pData(java.nio.Buffer pData){
		 this.pData = pData;
		pData0(super.ptr, pData);
	 }

	/**
	 * get method for field pData	[buffer]<br>
	 * Prototype: const void*  pData
	 */ 
	 public java.nio.Buffer pData(){
		 // return  this.pData;
		 return pData0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field mapEntryCount	[int]<br>
	 * Prototype: uint32_t  mapEntryCount
	 */ 
	 private static native void mapEntryCount0(ByteBuffer ptr, int _mapEntryCount);/*
		  VkSpecializationInfo _obj = (VkSpecializationInfo)(*ptr);
		  _obj.mapEntryCount = (uint32_t) (_mapEntryCount);
	  */

	/**
	 * native GET method for field mapEntryCount	[int]<br>
	 * Prototype: uint32_t  mapEntryCount
	 */ 
	 private static native int mapEntryCount0(ByteBuffer ptr);/*
		  VkSpecializationInfo _obj = (VkSpecializationInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field pMapEntries	[p]<br>
	 * Prototype: const VkSpecializationMapEntry*  pMapEntries
	 */ 
	 private static native void pMapEntries0(ByteBuffer ptr, P<VkSpecializationMapEntry>  _pMapEntries);/*
		  VkSpecializationInfo _obj = (VkSpecializationInfo)(*ptr);
		  _obj.pMapEntries = (const VkSpecializationMapEntry*) (_pMapEntries);
	  */

	/**
	 * native GET method for field pMapEntries	[p]<br>
	 * Prototype: const VkSpecializationMapEntry*  pMapEntries
	 */ 
	 private static native P<VkSpecializationMapEntry>  pMapEntries0(ByteBuffer ptr);/*
		  VkSpecializationInfo _obj = (VkSpecializationInfo)(ptr);
		  return (P<VkSpecializationMapEntry> ) (_obj.const VkSpecializationMapEntry*);
	 */

	/**
	 * native SET method for field dataSize	[long]<br>
	 * Prototype: size_t  dataSize
	 */ 
	 private static native void dataSize0(ByteBuffer ptr, long _dataSize);/*
		  VkSpecializationInfo _obj = (VkSpecializationInfo)(*ptr);
		  _obj.dataSize = (size_t) (_dataSize);
	  */

	/**
	 * native GET method for field dataSize	[long]<br>
	 * Prototype: size_t  dataSize
	 */ 
	 private static native long dataSize0(ByteBuffer ptr);/*
		  VkSpecializationInfo _obj = (VkSpecializationInfo)(ptr);
		  return (jlong) (_obj.size_t);
	 */

	/**
	 * native SET method for field pData	[buffer]<br>
	 * Prototype: const void*  pData
	 */ 
	 private static native void pData0(ByteBuffer ptr, java.nio.Buffer _pData);/*
		  VkSpecializationInfo _obj = (VkSpecializationInfo)(*ptr);
		  _obj.pData = (const void*) (_pData);
	  */

	/**
	 * native GET method for field pData	[buffer]<br>
	 * Prototype: const void*  pData
	 */ 
	 private static native java.nio.Buffer pData0(ByteBuffer ptr);/*
		  VkSpecializationInfo _obj = (VkSpecializationInfo)(ptr);
		  return (java.nio.Buffer) (_obj.const void*);
	 */



} // end of class VkSpecializationInfo
