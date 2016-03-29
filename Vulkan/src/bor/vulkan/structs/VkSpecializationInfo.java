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

import java.nio.Buffer;


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

	/** P wrapper for THIS object */
	 private  P<VkSpecializationInfo> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  uint32_t 	mapEntryCount	[int]
	 */ 
	 int 	mapEntryCount;

	/**
	 *  const VkSpecializationMapEntry* 	pMapEntries	[vkstruct]
	 */ 
	  VkSpecializationMapEntry  	pMapEntries;

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


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkSpecializationInfo> getP() {
	       if(p == null ){
	           p = new P<VkSpecializationInfo> (this);
	       }
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
		 mapEntryCount0(this.ptr,  mapEntryCount);
	 }

	/**
	 * Get method for field mapEntryCount	[int]<br>
	 * Prototype: uint32_t  mapEntryCount
	 */ 
	 public int mapEntryCount(){
		 int var = mapEntryCount0(super.ptr);
		 this.mapEntryCount = var;
		 return this.mapEntryCount;
	 }

	/**
	 * Set method for field pMapEntries	[vkstruct]<br>
	 * Prototype: const VkSpecializationMapEntry*  pMapEntries
	 */ 
	 public void pMapEntries( VkSpecializationMapEntry  pMapEntries){
		 this.pMapEntries = pMapEntries;
		 ByteBuffer buff = (pMapEntries==null) ? null : pMapEntries.getPointerStruct();
		 pMapEntries0(this.ptr, buff);
	 }

	/**
	 * Get method for field pMapEntries	[vkstruct]<br>
	 * Prototype: const VkSpecializationMapEntry*  pMapEntries
	 */ 
	 public  VkSpecializationMapEntry  pMapEntries(){
		 ByteBuffer pointer = pMapEntries0(super.ptr);
		 if(pointer == null){
		    this.pMapEntries = null;
		    return null;
		  } else 
 		 if(this.pMapEntries == null){
		    this.pMapEntries = new  VkSpecializationMapEntry (pointer);
		 }else{
		    this.pMapEntries.setPointer(pointer);
		  }
		 return this.pMapEntries;
	 }

	/**
	 * Set method for field dataSize	[long]<br>
	 * Prototype: size_t  dataSize
	 */ 
	 public void dataSize(long dataSize){
		 this.dataSize = dataSize;
		 dataSize0(this.ptr,  dataSize);
	 }

	/**
	 * Get method for field dataSize	[long]<br>
	 * Prototype: size_t  dataSize
	 */ 
	 public long dataSize(){
		 long var = dataSize0(super.ptr);
		 this.dataSize = var;
		 return this.dataSize;
	 }

	/**
	 * Set method for field pData	[buffer]<br>
	 * Prototype: const void*  pData
	 */ 
	 public void pData(java.nio.Buffer pData){
		 this.pData = pData;
		 pData0(this.ptr,  pData);
	 }

	/**
	 * Get method for field pData	[buffer]<br>
	 * Prototype: const void*  pData
	 */ 
	 public java.nio.Buffer pData(){
		 java.nio.Buffer var = pData0(super.ptr);
		 this.pData = var;
		 return this.pData;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field mapEntryCount	[int]<br>
	 * Prototype: uint32_t  mapEntryCount
	 */ 
	 private static native void mapEntryCount0(Buffer ptr, int _mapEntryCount);/*
		  VkSpecializationInfo* vkObj = (VkSpecializationInfo*)(ptr);
		  vkObj->mapEntryCount = (uint32_t) (_mapEntryCount);
	  */

	/**
	 * native GET method for field mapEntryCount	[int]<br>
	 * Prototype: uint32_t  mapEntryCount
	 */ 
	 private static native int mapEntryCount0(Buffer ptr);/*
		  VkSpecializationInfo vkObj = (VkSpecializationInfo*)(ptr);
		  return (jint) (vkObj->mapEntryCount);
	 */

	/**
	 * native SET method for field pMapEntries	[vkstruct]<br>
	 * Prototype: const VkSpecializationMapEntry*  pMapEntries
	 */ 
	 private static native void pMapEntries0(Buffer ptr, java.nio.ByteBuffer  _pMapEntries);/*
		  VkSpecializationInfo* vkObj = (VkSpecializationInfo*)(ptr);
		  vkObj->pMapEntries = (const VkSpecializationMapEntry*) (_pMapEntries);
	  */

	/**
	 * native GET method for field pMapEntries	[vkstruct]<br>
	 * Prototype: const VkSpecializationMapEntry*  pMapEntries
	 */ 
	 private static native java.nio.ByteBuffer  pMapEntries0(Buffer ptr);/*
		  VkSpecializationInfo vkObj = (VkSpecializationInfo*)(ptr);
		  return ( VkSpecializationMapEntry ) (vkObj->pMapEntries);
	 */

	/**
	 * native SET method for field dataSize	[long]<br>
	 * Prototype: size_t  dataSize
	 */ 
	 private static native void dataSize0(Buffer ptr, long _dataSize);/*
		  VkSpecializationInfo* vkObj = (VkSpecializationInfo*)(ptr);
		  vkObj->dataSize = (size_t) (_dataSize);
	  */

	/**
	 * native GET method for field dataSize	[long]<br>
	 * Prototype: size_t  dataSize
	 */ 
	 private static native long dataSize0(Buffer ptr);/*
		  VkSpecializationInfo vkObj = (VkSpecializationInfo*)(ptr);
		  return (jlong) (vkObj->dataSize);
	 */

	/**
	 * native SET method for field pData	[buffer]<br>
	 * Prototype: const void*  pData
	 */ 
	 private static native void pData0(Buffer ptr, java.nio.Buffer _pData);/*
		  VkSpecializationInfo* vkObj = (VkSpecializationInfo*)(ptr);
		  vkObj->pData = (const void*) (_pData);
	  */

	/**
	 * native GET method for field pData	[buffer]<br>
	 * Prototype: const void*  pData
	 */ 
	 private static native java.nio.Buffer pData0(Buffer ptr);/*
		  VkSpecializationInfo vkObj = (VkSpecializationInfo*)(ptr);
		  return (jobject) (vkObj->pData);
	 */



} // end of class VkSpecializationInfo
