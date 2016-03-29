/**
 * Class wrapping Vulkan's VkQueryPoolCreateInfo struct.
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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkQueryPoolCreateInfo extends VkStruct {
	/** TAG of this structure [36]  */
	 private static final String TAG = "VkQueryPoolCreateInfo";

	/** ID of this structure [36]  */
	 public static final int TAG_ID = VKQUERYPOOLCREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkQueryPoolCreateInfo> p;

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
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkQueryPoolCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkQueryPoolCreateInfo(long address, int memSize){ 
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
	 public static P<VkQueryPoolCreateInfo> createNullPointer(){
	        P<VkQueryPoolCreateInfo> p = new  P<VkQueryPoolCreateInfo>(new VkQueryPoolCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkQueryPoolCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkQueryPoolCreateInfo> (this);
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
	 * Prototype: VkQueryPoolCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 flags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkQueryPoolCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = flags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field queryType	[vkenum]<br>
	 * Prototype: VkQueryType  queryType
	 */ 
	 public void queryType(VkQueryType queryType){
		 this.queryType = queryType;
		 int enumVal = queryType.getValue();
		 queryType0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field queryType	[vkenum]<br>
	 * Prototype: VkQueryType  queryType
	 */ 
	 public VkQueryType queryType(){
		 int nativeVal = queryType0(super.ptr);
		 this.queryType = VkQueryType.fromValue(nativeVal); 
		 return this.queryType;
	 }

	/**
	 * Set method for field queryCount	[int]<br>
	 * Prototype: uint32_t  queryCount
	 */ 
	 public void queryCount(int queryCount){
		 this.queryCount = queryCount;
		 queryCount0(this.ptr,  queryCount);
	 }

	/**
	 * Get method for field queryCount	[int]<br>
	 * Prototype: uint32_t  queryCount
	 */ 
	 public int queryCount(){
		 int var = queryCount0(super.ptr);
		 this.queryCount = var;
		 return this.queryCount;
	 }

	/**
	 * Set method for field pipelineStatistics	[int]<br>
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 */ 
	 public void pipelineStatistics(int pipelineStatistics){
		 this.pipelineStatistics = pipelineStatistics;
		 pipelineStatistics0(this.ptr,  pipelineStatistics);
	 }

	/**
	 * Get method for field pipelineStatistics	[int]<br>
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 */ 
	 public int pipelineStatistics(){
		 int var = pipelineStatistics0(super.ptr);
		 this.pipelineStatistics = var;
		 return this.pipelineStatistics;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkQueryPoolCreateInfo vkObj = (VkQueryPoolCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkQueryPoolCreateInfo vkObj = (VkQueryPoolCreateInfo*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkQueryPoolCreateFlags  flags
	 */ 
	 private static native void flags0(Buffer ptr, int _flags);/*
		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		  vkObj->flags = (VkQueryPoolCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkQueryPoolCreateFlags  flags
	 */ 
	 private static native int flags0(Buffer ptr);/*
		  VkQueryPoolCreateInfo vkObj = (VkQueryPoolCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field queryType	[vkenum]<br>
	 * Prototype: VkQueryType  queryType
	 */ 
	 private static native void queryType0(Buffer ptr, int  _queryType);/*
		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		  vkObj->queryType = (VkQueryType) (_queryType);
	  */

	/**
	 * native GET method for field queryType	[vkenum]<br>
	 * Prototype: VkQueryType  queryType
	 */ 
	 private static native int  queryType0(Buffer ptr);/*
		  VkQueryPoolCreateInfo vkObj = (VkQueryPoolCreateInfo*)(ptr);
		  return (VkQueryType) (vkObj->queryType);
	 */

	/**
	 * native SET method for field queryCount	[int]<br>
	 * Prototype: uint32_t  queryCount
	 */ 
	 private static native void queryCount0(Buffer ptr, int _queryCount);/*
		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		  vkObj->queryCount = (uint32_t) (_queryCount);
	  */

	/**
	 * native GET method for field queryCount	[int]<br>
	 * Prototype: uint32_t  queryCount
	 */ 
	 private static native int queryCount0(Buffer ptr);/*
		  VkQueryPoolCreateInfo vkObj = (VkQueryPoolCreateInfo*)(ptr);
		  return (jint) (vkObj->queryCount);
	 */

	/**
	 * native SET method for field pipelineStatistics	[int]<br>
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 */ 
	 private static native void pipelineStatistics0(Buffer ptr, int _pipelineStatistics);/*
		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		  vkObj->pipelineStatistics = (VkQueryPipelineStatisticFlags) (_pipelineStatistics);
	  */

	/**
	 * native GET method for field pipelineStatistics	[int]<br>
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 */ 
	 private static native int pipelineStatistics0(Buffer ptr);/*
		  VkQueryPoolCreateInfo vkObj = (VkQueryPoolCreateInfo*)(ptr);
		  return (jint) (vkObj->pipelineStatistics);
	 */



} // end of class VkQueryPoolCreateInfo
