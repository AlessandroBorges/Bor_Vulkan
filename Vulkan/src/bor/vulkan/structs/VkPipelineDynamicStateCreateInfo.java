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

import java.nio.Buffer;


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
	 *  const void* 	pNext	[vkobject]
	 */ 
	 VkObject 	pNext;

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
	 * Prototype: VkPipelineDynamicStateCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 flags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkPipelineDynamicStateCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = flags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field dynamicStateCount	[int]<br>
	 * Prototype: uint32_t  dynamicStateCount
	 */ 
	 public void dynamicStateCount(int dynamicStateCount){
		 this.dynamicStateCount = dynamicStateCount;
		 dynamicStateCount0(this.ptr,  dynamicStateCount);
	 }

	/**
	 * Get method for field dynamicStateCount	[int]<br>
	 * Prototype: uint32_t  dynamicStateCount
	 */ 
	 public int dynamicStateCount(){
		 int var = dynamicStateCount0(super.ptr);
		 this.dynamicStateCount = var;
		 return this.dynamicStateCount;
	 }

	/**
	 * Set method for field pDynamicStates	<br>
	 * Prototype: const VkDynamicState*  pDynamicStates
	 */ 
	 public void pDynamicStates(Penum<VkDynamicState> pDynamicStates){
		 this.pDynamicStates = pDynamicStates;
		 pDynamicStates0(this.ptr,  pDynamicStates);
	 }

	/**
	 * Get method for field pDynamicStates	<br>
	 * Prototype: const VkDynamicState*  pDynamicStates
	 */ 
	 public Penum<VkDynamicState> pDynamicStates(){
		 Penum<VkDynamicState> var = pDynamicStates0(super.ptr);
		 this.pDynamicStates = var;
		 return this.pDynamicStates;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkPipelineDynamicStateCreateInfo vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkPipelineDynamicStateCreateInfo vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineDynamicStateCreateFlags  flags
	 */ 
	 private static native void flags0(Buffer ptr, int _flags);/*
		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		  vkObj->flags = (VkPipelineDynamicStateCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineDynamicStateCreateFlags  flags
	 */ 
	 private static native int flags0(Buffer ptr);/*
		  VkPipelineDynamicStateCreateInfo vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field dynamicStateCount	[int]<br>
	 * Prototype: uint32_t  dynamicStateCount
	 */ 
	 private static native void dynamicStateCount0(Buffer ptr, int _dynamicStateCount);/*
		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		  vkObj->dynamicStateCount = (uint32_t) (_dynamicStateCount);
	  */

	/**
	 * native GET method for field dynamicStateCount	[int]<br>
	 * Prototype: uint32_t  dynamicStateCount
	 */ 
	 private static native int dynamicStateCount0(Buffer ptr);/*
		  VkPipelineDynamicStateCreateInfo vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		  return (jint) (vkObj->dynamicStateCount);
	 */

	/**
	 * native SET method for field pDynamicStates	<br>
	 * Prototype: const VkDynamicState*  pDynamicStates
	 */ 
	 private static native void pDynamicStates0(Buffer ptr, Penum<VkDynamicState> _pDynamicStates);/*
		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		  vkObj->pDynamicStates = (const VkDynamicState*) (_pDynamicStates);
	  */

	/**
	 * native GET method for field pDynamicStates	<br>
	 * Prototype: const VkDynamicState*  pDynamicStates
	 */ 
	 private static native Penum<VkDynamicState> pDynamicStates0(Buffer ptr);/*
		  VkPipelineDynamicStateCreateInfo vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		  return (Penum<VkDynamicState>) (vkObj->pDynamicStates);
	 */



} // end of class VkPipelineDynamicStateCreateInfo
