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
	/** TAG of this structure [160]  */
	 private static final String TAG = "VkQueryPoolCreateInfo";

	/** ID of this structure [160]  */
	 public static final int TAG_ID = VKQUERYPOOLCREATEINFO_ID;

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
	 *  VkQueryPoolCreateFlags 	flags 
	 */ 
	int 	flags;

	/**
	 *  VkQueryType 	queryType 
	 */ 
	VkQueryType 	queryType;

	/**
	 *  uint32_t 	queryCount 
	 */ 
	int 	queryCount;

	/**
	 *  VkQueryPipelineStatisticFlags 	pipelineStatistics 
	 */ 
	int 	pipelineStatistics;

	/**
	 * Ctor
	 */
	public VkQueryPoolCreateInfo(){ 
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
	 * Prototype: VkQueryPoolCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkQueryPoolCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field queryType
	 * Prototype: VkQueryType  queryType
	 */ 
	 public void queryType(VkQueryType queryType){
		 this.queryType = queryType;
		queryType0(super.ptr, queryType);
	 }

	/**
	 * get method for field queryType
	 * Prototype: VkQueryType  queryType
	 */ 
	 public VkQueryType queryType(){
		 // return  this.queryType;
		 return queryType0(super.ptr);
	 }

	/**
	 * Set method for field queryCount
	 * Prototype: uint32_t  queryCount
	 */ 
	 public void queryCount(int queryCount){
		 this.queryCount = queryCount;
		queryCount0(super.ptr, queryCount);
	 }

	/**
	 * get method for field queryCount
	 * Prototype: uint32_t  queryCount
	 */ 
	 public int queryCount(){
		 // return  this.queryCount;
		 return queryCount0(super.ptr);
	 }

	/**
	 * Set method for field pipelineStatistics
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 */ 
	 public void pipelineStatistics(int pipelineStatistics){
		 this.pipelineStatistics = pipelineStatistics;
		pipelineStatistics0(super.ptr, pipelineStatistics);
	 }

	/**
	 * get method for field pipelineStatistics
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 */ 
	 public int pipelineStatistics(){
		 // return  this.pipelineStatistics;
		 return pipelineStatistics0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkQueryPoolCreateInfo _obj = (VkQueryPoolCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkQueryPoolCreateInfo _obj = (VkQueryPoolCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkQueryPoolCreateInfo _obj = (VkQueryPoolCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkQueryPoolCreateInfo _obj = (VkQueryPoolCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkQueryPoolCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkQueryPoolCreateInfo _obj = (VkQueryPoolCreateInfo)(*ptr);
		  _obj.flags = (VkQueryPoolCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkQueryPoolCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkQueryPoolCreateInfo _obj = (VkQueryPoolCreateInfo)(ptr);
		  return (jint) (_obj.VkQueryPoolCreateFlags);
	 */

	/**
	 * native Set method for field queryType
	 * Prototype: VkQueryType  queryType
	 */ 
	 private static native void queryType0(ByteBuffer ptr, VkQueryType _queryType);/*
		  VkQueryPoolCreateInfo _obj = (VkQueryPoolCreateInfo)(*ptr);
		  _obj.queryType = (VkQueryType) (_queryType);
	  */

	/**
	 * get method for field queryType
	 * Prototype: VkQueryType  queryType
	 */ 
	 private static native VkQueryType queryType0(ByteBuffer ptr);/*
		  VkQueryPoolCreateInfo _obj = (VkQueryPoolCreateInfo)(ptr);
		  return (VkQueryType) (_obj.VkQueryType);
	 */

	/**
	 * native Set method for field queryCount
	 * Prototype: uint32_t  queryCount
	 */ 
	 private static native void queryCount0(ByteBuffer ptr, int _queryCount);/*
		  VkQueryPoolCreateInfo _obj = (VkQueryPoolCreateInfo)(*ptr);
		  _obj.queryCount = (uint32_t) (_queryCount);
	  */

	/**
	 * get method for field queryCount
	 * Prototype: uint32_t  queryCount
	 */ 
	 private static native int queryCount0(ByteBuffer ptr);/*
		  VkQueryPoolCreateInfo _obj = (VkQueryPoolCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pipelineStatistics
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 */ 
	 private static native void pipelineStatistics0(ByteBuffer ptr, int _pipelineStatistics);/*
		  VkQueryPoolCreateInfo _obj = (VkQueryPoolCreateInfo)(*ptr);
		  _obj.pipelineStatistics = (VkQueryPipelineStatisticFlags) (_pipelineStatistics);
	  */

	/**
	 * get method for field pipelineStatistics
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 */ 
	 private static native int pipelineStatistics0(ByteBuffer ptr);/*
		  VkQueryPoolCreateInfo _obj = (VkQueryPoolCreateInfo)(ptr);
		  return (jint) (_obj.VkQueryPipelineStatisticFlags);
	 */



} // end of class VkQueryPoolCreateInfo
