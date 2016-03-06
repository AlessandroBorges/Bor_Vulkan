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

	 // fields //
	/**
	 *  VkStructureType 	sType	[vkenum]
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext	[p]
	 */ 
	P<VkObject> 	pNext;

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

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(P<VkObject> pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public P<VkObject> pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field flags	[int]<br>
	 * Prototype: VkQueryPoolCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkQueryPoolCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field queryType	[vkenum]<br>
	 * Prototype: VkQueryType  queryType
	 */ 
	 public void queryType(VkQueryType queryType){
		 this.queryType = queryType;
		queryType0(super.ptr, queryType);
	 }

	/**
	 * get method for field queryType	[vkenum]<br>
	 * Prototype: VkQueryType  queryType
	 */ 
	 public VkQueryType queryType(){
		 // return  this.queryType;
		 return queryType0(super.ptr);
	 }

	/**
	 * Set method for field queryCount	[int]<br>
	 * Prototype: uint32_t  queryCount
	 */ 
	 public void queryCount(int queryCount){
		 this.queryCount = queryCount;
		queryCount0(super.ptr, queryCount);
	 }

	/**
	 * get method for field queryCount	[int]<br>
	 * Prototype: uint32_t  queryCount
	 */ 
	 public int queryCount(){
		 // return  this.queryCount;
		 return queryCount0(super.ptr);
	 }

	/**
	 * Set method for field pipelineStatistics	[int]<br>
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 */ 
	 public void pipelineStatistics(int pipelineStatistics){
		 this.pipelineStatistics = pipelineStatistics;
		pipelineStatistics0(super.ptr, pipelineStatistics);
	 }

	/**
	 * get method for field pipelineStatistics	[int]<br>
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 */ 
	 public int pipelineStatistics(){
		 // return  this.pipelineStatistics;
		 return pipelineStatistics0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkQueryPoolCreateInfo _obj = (VkQueryPoolCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkQueryPoolCreateInfo _obj = (VkQueryPoolCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkQueryPoolCreateInfo _obj = (VkQueryPoolCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkQueryPoolCreateInfo _obj = (VkQueryPoolCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkQueryPoolCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkQueryPoolCreateInfo _obj = (VkQueryPoolCreateInfo)(*ptr);
		  _obj.flags = (VkQueryPoolCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkQueryPoolCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkQueryPoolCreateInfo _obj = (VkQueryPoolCreateInfo)(ptr);
		  return (jint) (_obj.VkQueryPoolCreateFlags);
	 */

	/**
	 * native SET method for field queryType	[vkenum]<br>
	 * Prototype: VkQueryType  queryType
	 */ 
	 private static native void queryType0(ByteBuffer ptr, VkQueryType _queryType);/*
		  VkQueryPoolCreateInfo _obj = (VkQueryPoolCreateInfo)(*ptr);
		  _obj.queryType = (VkQueryType) (_queryType);
	  */

	/**
	 * native GET method for field queryType	[vkenum]<br>
	 * Prototype: VkQueryType  queryType
	 */ 
	 private static native VkQueryType queryType0(ByteBuffer ptr);/*
		  VkQueryPoolCreateInfo _obj = (VkQueryPoolCreateInfo)(ptr);
		  return (VkQueryType) (_obj.VkQueryType);
	 */

	/**
	 * native SET method for field queryCount	[int]<br>
	 * Prototype: uint32_t  queryCount
	 */ 
	 private static native void queryCount0(ByteBuffer ptr, int _queryCount);/*
		  VkQueryPoolCreateInfo _obj = (VkQueryPoolCreateInfo)(*ptr);
		  _obj.queryCount = (uint32_t) (_queryCount);
	  */

	/**
	 * native GET method for field queryCount	[int]<br>
	 * Prototype: uint32_t  queryCount
	 */ 
	 private static native int queryCount0(ByteBuffer ptr);/*
		  VkQueryPoolCreateInfo _obj = (VkQueryPoolCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field pipelineStatistics	[int]<br>
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 */ 
	 private static native void pipelineStatistics0(ByteBuffer ptr, int _pipelineStatistics);/*
		  VkQueryPoolCreateInfo _obj = (VkQueryPoolCreateInfo)(*ptr);
		  _obj.pipelineStatistics = (VkQueryPipelineStatisticFlags) (_pipelineStatistics);
	  */

	/**
	 * native GET method for field pipelineStatistics	[int]<br>
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 */ 
	 private static native int pipelineStatistics0(ByteBuffer ptr);/*
		  VkQueryPoolCreateInfo _obj = (VkQueryPoolCreateInfo)(ptr);
		  return (jint) (_obj.VkQueryPipelineStatisticFlags);
	 */



} // end of class VkQueryPoolCreateInfo
