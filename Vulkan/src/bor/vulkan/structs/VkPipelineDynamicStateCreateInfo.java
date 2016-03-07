/**
 * Class wrapping Vulkan's VkPipelineDynamicStateCreateInfo struct.
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
 *  This class is a Java front end for struct VkPipelineDynamicStateCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPipelineDynamicStateCreateInfo {
 *     VkStructureType                      sType;
 *     const void*                          pNext;
 *     VkPipelineDynamicStateCreateFlags    flags;
 *     uint32_t                             dynamicStateCount;
 *     const VkDynamicState*                pDynamicStates;
 * } VkPipelineDynamicStateCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkPipelineDynamicStateCreateInfo extends VkStruct {
	/** TAG of this structure [65]  */
	 private static final String TAG = "VkPipelineDynamicStateCreateInfo";

	/** ID of this structure [65]  */
	 public static final int TAG_ID = VKPIPELINEDYNAMICSTATECREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkPipelineDynamicStateCreateInfo> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkStructureType 	sType	[vkenum]
	 */ 
	 VkStructureType 	sType;

	/**
	 *  const void* 	pNext	[p]
	 */ 
	 P<VkObject> 	pNext;

	/**
	 *  VkPipelineDynamicStateCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  uint32_t 	dynamicStateCount	[int]
	 */ 
	 int 	dynamicStateCount;

	/**
	 *  const VkDynamicState* 	pDynamicStates	
	 */ 
	 Penum<VkDynamicState> 	pDynamicStates;

	/**
	 * Ctor
	 */
	public VkPipelineDynamicStateCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineDynamicStateCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkPipelineDynamicStateCreateInfo(long address, int memSize){ 
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
	 public static P<VkPipelineDynamicStateCreateInfo> createNullPointer(){
	        P<VkPipelineDynamicStateCreateInfo> p = new  P<VkPipelineDynamicStateCreateInfo>(new VkPipelineDynamicStateCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkPipelineDynamicStateCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkPipelineDynamicStateCreateInfo> (this);
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
	 * Prototype: VkPipelineDynamicStateCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkPipelineDynamicStateCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field dynamicStateCount	[int]<br>
	 * Prototype: uint32_t  dynamicStateCount
	 */ 
	 public void dynamicStateCount(int dynamicStateCount){
		 this.dynamicStateCount = dynamicStateCount;
		dynamicStateCount0(super.ptr, dynamicStateCount);
	 }

	/**
	 * get method for field dynamicStateCount	[int]<br>
	 * Prototype: uint32_t  dynamicStateCount
	 */ 
	 public int dynamicStateCount(){
		 // return  this.dynamicStateCount;
		 return dynamicStateCount0(super.ptr);
	 }

	/**
	 * Set method for field pDynamicStates	<br>
	 * Prototype: const VkDynamicState*  pDynamicStates
	 */ 
	 public void pDynamicStates(Penum<VkDynamicState> pDynamicStates){
		 this.pDynamicStates = pDynamicStates;
		pDynamicStates0(super.ptr, pDynamicStates);
	 }

	/**
	 * get method for field pDynamicStates	<br>
	 * Prototype: const VkDynamicState*  pDynamicStates
	 */ 
	 public Penum<VkDynamicState> pDynamicStates(){
		 // return  this.pDynamicStates;
		 return pDynamicStates0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkPipelineDynamicStateCreateInfo _obj = (VkPipelineDynamicStateCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkPipelineDynamicStateCreateInfo _obj = (VkPipelineDynamicStateCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkPipelineDynamicStateCreateInfo _obj = (VkPipelineDynamicStateCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkPipelineDynamicStateCreateInfo _obj = (VkPipelineDynamicStateCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineDynamicStateCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkPipelineDynamicStateCreateInfo _obj = (VkPipelineDynamicStateCreateInfo)(*ptr);
		  _obj.flags = (VkPipelineDynamicStateCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineDynamicStateCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkPipelineDynamicStateCreateInfo _obj = (VkPipelineDynamicStateCreateInfo)(ptr);
		  return (jint) (_obj.VkPipelineDynamicStateCreateFlags);
	 */

	/**
	 * native SET method for field dynamicStateCount	[int]<br>
	 * Prototype: uint32_t  dynamicStateCount
	 */ 
	 private static native void dynamicStateCount0(ByteBuffer ptr, int _dynamicStateCount);/*
		  VkPipelineDynamicStateCreateInfo _obj = (VkPipelineDynamicStateCreateInfo)(*ptr);
		  _obj.dynamicStateCount = (uint32_t) (_dynamicStateCount);
	  */

	/**
	 * native GET method for field dynamicStateCount	[int]<br>
	 * Prototype: uint32_t  dynamicStateCount
	 */ 
	 private static native int dynamicStateCount0(ByteBuffer ptr);/*
		  VkPipelineDynamicStateCreateInfo _obj = (VkPipelineDynamicStateCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field pDynamicStates	<br>
	 * Prototype: const VkDynamicState*  pDynamicStates
	 */ 
	 private static native void pDynamicStates0(ByteBuffer ptr, Penum<VkDynamicState> _pDynamicStates);/*
		  VkPipelineDynamicStateCreateInfo _obj = (VkPipelineDynamicStateCreateInfo)(*ptr);
		  _obj.pDynamicStates = (const VkDynamicState*) (_pDynamicStates);
	  */

	/**
	 * native GET method for field pDynamicStates	<br>
	 * Prototype: const VkDynamicState*  pDynamicStates
	 */ 
	 private static native Penum<VkDynamicState> pDynamicStates0(ByteBuffer ptr);/*
		  VkPipelineDynamicStateCreateInfo _obj = (VkPipelineDynamicStateCreateInfo)(ptr);
		  return (Penum<VkDynamicState>) (_obj.const VkDynamicState*);
	 */



} // end of class VkPipelineDynamicStateCreateInfo
