/**
 * Class wrapping Vulkan's VkPipelineTessellationStateCreateInfo struct.
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
 *  This class is a Java front end for struct VkPipelineTessellationStateCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPipelineTessellationStateCreateInfo {
 *     VkStructureType                           sType;
 *     const void*                               pNext;
 *     VkPipelineTessellationStateCreateFlags    flags;
 *     uint32_t                                  patchControlPoints;
 * } VkPipelineTessellationStateCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkPipelineTessellationStateCreateInfo extends VkStruct {
	/** TAG of this structure [53]  */
	 private static final String TAG = "VkPipelineTessellationStateCreateInfo";

	/** ID of this structure [53]  */
	 public static final int TAG_ID = VKPIPELINETESSELLATIONSTATECREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkPipelineTessellationStateCreateInfo> p;

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
	 *  VkPipelineTessellationStateCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  uint32_t 	patchControlPoints	[int]
	 */ 
	 int 	patchControlPoints;

	/**
	 * Ctor
	 */
	public VkPipelineTessellationStateCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineTessellationStateCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkPipelineTessellationStateCreateInfo(long address, int memSize){ 
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
	 public static P<VkPipelineTessellationStateCreateInfo> createNullPointer(){
	        P<VkPipelineTessellationStateCreateInfo> p = new  P<VkPipelineTessellationStateCreateInfo>(new VkPipelineTessellationStateCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkPipelineTessellationStateCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkPipelineTessellationStateCreateInfo> (this);
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
	 * Prototype: VkPipelineTessellationStateCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkPipelineTessellationStateCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field patchControlPoints	[int]<br>
	 * Prototype: uint32_t  patchControlPoints
	 */ 
	 public void patchControlPoints(int patchControlPoints){
		 this.patchControlPoints = patchControlPoints;
		patchControlPoints0(super.ptr, patchControlPoints);
	 }

	/**
	 * get method for field patchControlPoints	[int]<br>
	 * Prototype: uint32_t  patchControlPoints
	 */ 
	 public int patchControlPoints(){
		 // return  this.patchControlPoints;
		 return patchControlPoints0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkPipelineTessellationStateCreateInfo _obj = (VkPipelineTessellationStateCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkPipelineTessellationStateCreateInfo _obj = (VkPipelineTessellationStateCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkPipelineTessellationStateCreateInfo _obj = (VkPipelineTessellationStateCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkPipelineTessellationStateCreateInfo _obj = (VkPipelineTessellationStateCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineTessellationStateCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkPipelineTessellationStateCreateInfo _obj = (VkPipelineTessellationStateCreateInfo)(*ptr);
		  _obj.flags = (VkPipelineTessellationStateCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineTessellationStateCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkPipelineTessellationStateCreateInfo _obj = (VkPipelineTessellationStateCreateInfo)(ptr);
		  return (jint) (_obj.VkPipelineTessellationStateCreateFlags);
	 */

	/**
	 * native SET method for field patchControlPoints	[int]<br>
	 * Prototype: uint32_t  patchControlPoints
	 */ 
	 private static native void patchControlPoints0(ByteBuffer ptr, int _patchControlPoints);/*
		  VkPipelineTessellationStateCreateInfo _obj = (VkPipelineTessellationStateCreateInfo)(*ptr);
		  _obj.patchControlPoints = (uint32_t) (_patchControlPoints);
	  */

	/**
	 * native GET method for field patchControlPoints	[int]<br>
	 * Prototype: uint32_t  patchControlPoints
	 */ 
	 private static native int patchControlPoints0(ByteBuffer ptr);/*
		  VkPipelineTessellationStateCreateInfo _obj = (VkPipelineTessellationStateCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkPipelineTessellationStateCreateInfo
