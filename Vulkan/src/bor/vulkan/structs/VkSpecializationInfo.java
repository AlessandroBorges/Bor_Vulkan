/**
 * Class wrapping Vulkan's VkSpecializationInfo struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.65 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
 package bor.vulkan.structs;

 import bor.util.*;
 import bor.vulkan.*;
 import static bor.vulkan.Vulkan.*; 
 import bor.vulkan.enumerations.*;

 import java.util.*;
 import java.nio.*;


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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkSpecializationInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [47]  */
	 private static final String TAG = "VkSpecializationInfo";

	/** ID of this structure [47]  */
	 public static final int TAG_ID = VKSPECIALIZATIONINFO_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  uint32_t 	mapEntryCount	[int]
	 */ 
	int 	mapEntryCount;
	
	/**
	 *  const VkSpecializationMapEntry* 	pMapEntries	[vkstruct_array_array]
	 */ 
	  VkSpecializationMapEntry[]  	pMapEntries;
	 private BigBuffer 	 pMapEntriesBUFFER;
	
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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSpecializationInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkSpecializationInfo(long address){ 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field mapEntryCount	[int]<br>
	 * Prototype: uint32_t  mapEntryCount
	 * 
	 * @param mapEntryCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSpecializationInfo mapEntryCount(int mapEntryCount){
		 this.mapEntryCount = mapEntryCount;
		 setMapEntryCount0(this.ptr,  mapEntryCount);
		 return this;
	 }

	/**
	 * Get method for field mapEntryCount	[int]<br>
	 * Prototype: uint32_t  mapEntryCount
	 */ 
	 public int mapEntryCount(){
		 int var = getMapEntryCount0(super.ptr);
		 this.mapEntryCount = var;
		 return this.mapEntryCount;
	 }

	/**
	 * Set method for field pMapEntries	[vkstruct_array]<br>
	 * Prototype: const VkSpecializationMapEntry*  pMapEntries
	 * 
	 * @param pMapEntries - a instance of VkSpecializationMapEntry[].
	 * @return this VkStruct instance.
	 */ 
	 public VkSpecializationInfo pMapEntries(VkSpecializationMapEntry[] pMapEntries){
		 this.pMapEntries = pMapEntries;
		 this.pMapEntriesBUFFER = new BigBuffer(pMapEntries, VkSpecializationMapEntry.getID());
		 setPMapEntries0(this.ptr, pMapEntriesBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pMapEntries	[vkstruct_array]<br>
	 * Prototype: const VkSpecializationMapEntry*  pMapEntries
	 */ 
	 public VkSpecializationMapEntry[] pMapEntries(){
		 long ptr = getPMapEntries0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pMapEntriesBUFFER != null && ptr == pMapEntriesBUFFER.getBufferAddress()){ //same buffer 
		    pMapEntriesBUFFER.update();
		    return pMapEntries;
		  }else{
		     (new UnsupportedOperationException("There is no VKStruct[] for backup.")).printStackTrace();
		   }
		 return this.pMapEntries;
	 }

	/**
	 * Set method for field dataSize	[long]<br>
	 * Prototype: size_t  dataSize
	 * 
	 * @param dataSize - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkSpecializationInfo dataSize(long dataSize){
		 this.dataSize = dataSize;
		 setDataSize0(this.ptr,  dataSize);
		 return this;
	 }

	/**
	 * Get method for field dataSize	[long]<br>
	 * Prototype: size_t  dataSize
	 */ 
	 public long dataSize(){
		 long var = getDataSize0(super.ptr);
		 this.dataSize = var;
		 return this.dataSize;
	 }

	/**
	 * Set method for field pData	[buffer]<br>
	 * Prototype: const void*  pData
	 * 
	 * @param pData - a instance of java.nio.Buffer.
	 * @return this VkStruct instance.
	 */ 
	 public VkSpecializationInfo pData(java.nio.Buffer pData){
		 this.pData = pData;
		 setPData0(this.ptr,  pData);
		 return this;
	 }

	/**
	 * Get method for field pData	[buffer]<br>
	 * Prototype: const void*  pData
	 */ 
	 public java.nio.Buffer pData(){
		 long address = getPData0(super.ptr);
		 if(this.pData == null && address != 0L){
			  ByteBuffer bb = wrapPointer(address, 8);
			  this.pData = bb;
		 }
		 return this.pData;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkSpecializationInfo [ ")
				.append("mapEntryCount: ").append(mapEntryCount() )
				.append(",\n pMapEntries: ")
				.append(Arrays.toString(pMapEntries()) )
				.append(",\n dataSize: ")
				.append(dataSize() )
				.append(",\n pData: ")
				.append(pData() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field mapEntryCount	[int]<br>
	 * Prototype: uint32_t  mapEntryCount
	 */ 
	 private static native void setMapEntryCount0(Buffer ptr, int _mapEntryCount);/*
		  VkSpecializationInfo* vkObj = (VkSpecializationInfo*)(ptr);
		  vkObj->mapEntryCount = (uint32_t) (_mapEntryCount);
	  */

	/**
	 * Native GET method for field mapEntryCount	[int]<br>
	 * Prototype: uint32_t  mapEntryCount
	 */ 
	 private static native int getMapEntryCount0(Buffer ptr);/*
		  VkSpecializationInfo* vkObj = (VkSpecializationInfo*)(ptr);
		  return (jint) (vkObj->mapEntryCount);
	 */

	/**
	 * Native SET method for field pMapEntries	[vkstruct_array]<br>
	 * Prototype: const VkSpecializationMapEntry*  pMapEntries
	 */ 
	 private static native void setPMapEntries0(Buffer ptr, java.nio.ByteBuffer  _pMapEntries);/*
		  VkSpecializationInfo* vkObj = (VkSpecializationInfo*)(ptr);
		  vkObj->pMapEntries = (const VkSpecializationMapEntry*) (_pMapEntries);
	  */

	/**
	 * Native GET method for field pMapEntries	[vkstruct_array]<br>
	 * Prototype: const VkSpecializationMapEntry*  pMapEntries
	 */ 
	 private static native long getPMapEntries0(Buffer ptr);/*
		  VkSpecializationInfo* vkObj = (VkSpecializationInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pMapEntries);
	 */

	/**
	 * Native SET method for field dataSize	[long]<br>
	 * Prototype: size_t  dataSize
	 */ 
	 private static native void setDataSize0(Buffer ptr, long _dataSize);/*
		  VkSpecializationInfo* vkObj = (VkSpecializationInfo*)(ptr);
		  vkObj->dataSize = (size_t) (_dataSize);
	  */

	/**
	 * Native GET method for field dataSize	[long]<br>
	 * Prototype: size_t  dataSize
	 */ 
	 private static native long getDataSize0(Buffer ptr);/*
		  VkSpecializationInfo* vkObj = (VkSpecializationInfo*)(ptr);
		  return (jlong) (vkObj->dataSize);
	 */

	/**
	 * Native SET method for field pData	[buffer]<br>
	 * Prototype: const void*  pData
	 */ 
	 private static native void setPData0(Buffer ptr, java.nio.Buffer _pData);/*
		  VkSpecializationInfo* vkObj = (VkSpecializationInfo*)(ptr);
		  vkObj->pData = (const void*) (_pData);
	  */

	/**
	 * Native GET method for field pData	[buffer]<br>
	 * Prototype: const void*  pData
	 */ 
	 private static native long getPData0(Buffer ptr);/*
		  VkSpecializationInfo* vkObj = (VkSpecializationInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pData);
	 */



} // end of class VkSpecializationInfo
