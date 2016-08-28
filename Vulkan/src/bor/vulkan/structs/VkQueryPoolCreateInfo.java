/**
 * Class wrapping Vulkan's VkQueryPoolCreateInfo struct.
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
 *  This class is a Java front end for struct VkQueryPoolCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkQueryPoolCreateInfo {
 *     VkStructureType                  sType;
 *     const void*                      pNext;
 *     VkQueryPoolCreateFlags           flags;
 *     VkQueryType                      queryType;
 *     uint32_t                         queryCount;
 *     VkQueryPipelineStatisticFlags    pipelineStatistics;
 * } VkQueryPoolCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkQueryPoolCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [36]  */
	 private static final String TAG = "VkQueryPoolCreateInfo";

	/** ID of this structure [36]  */
	 public static final int TAG_ID = VKQUERYPOOLCREATEINFO_ID;

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
	 *  VkQueryPoolCreateFlags 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  VkQueryType 	queryType	[vkenum]
	 */ 
	VkQueryType 	queryType;
	
	/**
	 *  uint32_t 	queryCount	[int]
	 */ 
	int 	queryCount;
	
	/**
	 *  VkQueryPipelineStatisticFlags 	pipelineStatistics	[int]
	 */ 
	int 	pipelineStatistics;
	/**
	 * Ctor
	 */
	public VkQueryPoolCreateInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkQueryPoolCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkQueryPoolCreateInfo(long address){ 
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

	/** 
	 * Static method to create a VkArray for this VkStruct subclass.
	 * @param size - number of elements
	 */
	 public static VkArray<VkQueryPoolCreateInfo> createVkArray(int size){ 
		 VkQueryPoolCreateInfo[] array = new VkQueryPoolCreateInfo[size]; 
		 VkArrayStruct<VkQueryPoolCreateInfo> vkArray = new VkArrayStruct<VkQueryPoolCreateInfo> (array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 * 
	 * @param sType - a instance of VkStructureType.
	 * @return this VkStruct instance.
	 */ 
	 public VkQueryPoolCreateInfo sType(VkStructureType sType){
		 this.sType = sType;
		 int enumVal = sType.getValue();
		 setSType0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param pNext - a instance of VkObject.
	 * @return this VkStruct instance.
	 */ 
	 public VkQueryPoolCreateInfo pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 setPNext0(this.ptr, buff);
		 return this;
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
	 * Prototype: VkQueryPoolCreateFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkQueryPoolCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkQueryPoolCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field queryType	[vkenum]<br>
	 * Prototype: VkQueryType  queryType
	 * 
	 * @param queryType - a instance of VkQueryType.
	 * @return this VkStruct instance.
	 */ 
	 public VkQueryPoolCreateInfo queryType(VkQueryType queryType){
		 this.queryType = queryType;
		 int enumVal = queryType.getValue();
		 setQueryType0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field queryType	[vkenum]<br>
	 * Prototype: VkQueryType  queryType
	 */ 
	 public VkQueryType queryType(){
		 int nativeVal = getQueryType0(super.ptr);
		 this.queryType = VkQueryType.fromValue(nativeVal); 
		 return this.queryType;
	 }

	/**
	 * Set method for field queryCount	[int]<br>
	 * Prototype: uint32_t  queryCount
	 * 
	 * @param queryCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkQueryPoolCreateInfo queryCount(int queryCount){
		 this.queryCount = queryCount;
		 setQueryCount0(this.ptr,  queryCount);
		 return this;
	 }

	/**
	 * Get method for field queryCount	[int]<br>
	 * Prototype: uint32_t  queryCount
	 */ 
	 public int queryCount(){
		 int var = getQueryCount0(super.ptr);
		 this.queryCount = var;
		 return this.queryCount;
	 }

	/**
	 * Set method for field pipelineStatistics	[int]<br>
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 * 
	 * @param pipelineStatistics - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkQueryPoolCreateInfo pipelineStatistics(int pipelineStatistics){
		 this.pipelineStatistics = pipelineStatistics;
		 setPipelineStatistics0(this.ptr,  pipelineStatistics);
		 return this;
	 }

	/**
	 * Get method for field pipelineStatistics	[int]<br>
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 */ 
	 public int pipelineStatistics(){
		 int var = getPipelineStatistics0(super.ptr);
		 this.pipelineStatistics = var;
		 return this.pipelineStatistics;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkQueryPoolCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n queryType: ")
				.append(queryType() )
				.append(",\n queryCount: ")
				.append(queryCount() )
				.append(",\n pipelineStatistics: ")
				.append(pipelineStatistics() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkQueryPoolCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkQueryPoolCreateFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkQueryPoolCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field queryType	[vkenum]<br>
	 * Prototype: VkQueryType  queryType
	 */ 
	 private static native void setQueryType0(Buffer ptr, int  _queryType);/*
		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->queryType = (VkQueryType) (_queryType);
	  */

	/**
	 * Native GET method for field queryType	[vkenum]<br>
	 * Prototype: VkQueryType  queryType
	 */ 
	 private static native int getQueryType0(Buffer ptr);/*
		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->queryType);
	 */

	/**
	 * Native SET method for field queryCount	[int]<br>
	 * Prototype: uint32_t  queryCount
	 */ 
	 private static native void setQueryCount0(Buffer ptr, int _queryCount);/*
		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->queryCount = (uint32_t) (_queryCount);
	  */

	/**
	 * Native GET method for field queryCount	[int]<br>
	 * Prototype: uint32_t  queryCount
	 */ 
	 private static native int getQueryCount0(Buffer ptr);/*
		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		  return (jint) (vkObj->queryCount);
	 */

	/**
	 * Native SET method for field pipelineStatistics	[int]<br>
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 */ 
	 private static native void setPipelineStatistics0(Buffer ptr, int _pipelineStatistics);/*
		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->pipelineStatistics = (VkQueryPipelineStatisticFlags) (_pipelineStatistics);
	  */

	/**
	 * Native GET method for field pipelineStatistics	[int]<br>
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 */ 
	 private static native int getPipelineStatistics0(Buffer ptr);/*
		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		  return (jint) (vkObj->pipelineStatistics);
	 */



} // end of class VkQueryPoolCreateInfo
