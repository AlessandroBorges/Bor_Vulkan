/**
 * Class wrapping Vulkan's VkPipelineViewportStateCreateInfo struct.
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
 *  This class is a Java front end for struct VkPipelineViewportStateCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPipelineViewportStateCreateInfo {
 *     VkStructureType                       sType;
 *     const void*                           pNext;
 *     VkPipelineViewportStateCreateFlags    flags;
 *     uint32_t                              viewportCount;
 *     const VkViewport*                     pViewports;
 *     uint32_t                              scissorCount;
 *     const VkRect2D*                       pScissors;
 * } VkPipelineViewportStateCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkPipelineViewportStateCreateInfo extends VkStruct {
	/** TAG of this structure [58]  */
	 private static final String TAG = "VkPipelineViewportStateCreateInfo";

	/** ID of this structure [58]  */
	 public static final int TAG_ID = VKPIPELINEVIEWPORTSTATECREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkPipelineViewportStateCreateInfo> p;

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
	 *  VkPipelineViewportStateCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  uint32_t 	viewportCount	[int]
	 */ 
	 int 	viewportCount;

	/**
	 *  const VkViewport* 	pViewports	[vkstruct]
	 */ 
	  VkViewport  	pViewports;

	/**
	 *  uint32_t 	scissorCount	[int]
	 */ 
	 int 	scissorCount;

	/**
	 *  const VkRect2D* 	pScissors	[vkstruct]
	 */ 
	  VkRect2D  	pScissors;

	/**
	 * Ctor
	 */
	public VkPipelineViewportStateCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineViewportStateCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkPipelineViewportStateCreateInfo(long address, int memSize){ 
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
	 public static P<VkPipelineViewportStateCreateInfo> createNullPointer(){
	        P<VkPipelineViewportStateCreateInfo> p = new  P<VkPipelineViewportStateCreateInfo>(new VkPipelineViewportStateCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkPipelineViewportStateCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkPipelineViewportStateCreateInfo> (this);
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
	 * Prototype: VkPipelineViewportStateCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 flags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkPipelineViewportStateCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = flags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field viewportCount	[int]<br>
	 * Prototype: uint32_t  viewportCount
	 */ 
	 public void viewportCount(int viewportCount){
		 this.viewportCount = viewportCount;
		 viewportCount0(this.ptr,  viewportCount);
	 }

	/**
	 * Get method for field viewportCount	[int]<br>
	 * Prototype: uint32_t  viewportCount
	 */ 
	 public int viewportCount(){
		 int var = viewportCount0(super.ptr);
		 this.viewportCount = var;
		 return this.viewportCount;
	 }

	/**
	 * Set method for field pViewports	[vkstruct]<br>
	 * Prototype: const VkViewport*  pViewports
	 */ 
	 public void pViewports( VkViewport  pViewports){
		 this.pViewports = pViewports;
		 ByteBuffer buff = (pViewports==null) ? null : pViewports.getPointerStruct();
		 pViewports0(this.ptr, buff);
	 }

	/**
	 * Get method for field pViewports	[vkstruct]<br>
	 * Prototype: const VkViewport*  pViewports
	 */ 
	 public  VkViewport  pViewports(){
		 ByteBuffer pointer = pViewports0(super.ptr);
		 if(pointer == null){
		    this.pViewports = null;
		    return null;
		  } else 
 		 if(this.pViewports == null){
		    this.pViewports = new  VkViewport (pointer);
		 }else{
		    this.pViewports.setPointer(pointer);
		  }
		 return this.pViewports;
	 }

	/**
	 * Set method for field scissorCount	[int]<br>
	 * Prototype: uint32_t  scissorCount
	 */ 
	 public void scissorCount(int scissorCount){
		 this.scissorCount = scissorCount;
		 scissorCount0(this.ptr,  scissorCount);
	 }

	/**
	 * Get method for field scissorCount	[int]<br>
	 * Prototype: uint32_t  scissorCount
	 */ 
	 public int scissorCount(){
		 int var = scissorCount0(super.ptr);
		 this.scissorCount = var;
		 return this.scissorCount;
	 }

	/**
	 * Set method for field pScissors	[vkstruct]<br>
	 * Prototype: const VkRect2D*  pScissors
	 */ 
	 public void pScissors( VkRect2D  pScissors){
		 this.pScissors = pScissors;
		 ByteBuffer buff = (pScissors==null) ? null : pScissors.getPointerStruct();
		 pScissors0(this.ptr, buff);
	 }

	/**
	 * Get method for field pScissors	[vkstruct]<br>
	 * Prototype: const VkRect2D*  pScissors
	 */ 
	 public  VkRect2D  pScissors(){
		 ByteBuffer pointer = pScissors0(super.ptr);
		 if(pointer == null){
		    this.pScissors = null;
		    return null;
		  } else 
 		 if(this.pScissors == null){
		    this.pScissors = new  VkRect2D (pointer);
		 }else{
		    this.pScissors.setPointer(pointer);
		  }
		 return this.pScissors;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkPipelineViewportStateCreateInfo vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkPipelineViewportStateCreateInfo vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineViewportStateCreateFlags  flags
	 */ 
	 private static native void flags0(Buffer ptr, int _flags);/*
		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  vkObj->flags = (VkPipelineViewportStateCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineViewportStateCreateFlags  flags
	 */ 
	 private static native int flags0(Buffer ptr);/*
		  VkPipelineViewportStateCreateInfo vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field viewportCount	[int]<br>
	 * Prototype: uint32_t  viewportCount
	 */ 
	 private static native void viewportCount0(Buffer ptr, int _viewportCount);/*
		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  vkObj->viewportCount = (uint32_t) (_viewportCount);
	  */

	/**
	 * native GET method for field viewportCount	[int]<br>
	 * Prototype: uint32_t  viewportCount
	 */ 
	 private static native int viewportCount0(Buffer ptr);/*
		  VkPipelineViewportStateCreateInfo vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  return (jint) (vkObj->viewportCount);
	 */

	/**
	 * native SET method for field pViewports	[vkstruct]<br>
	 * Prototype: const VkViewport*  pViewports
	 */ 
	 private static native void pViewports0(Buffer ptr, java.nio.ByteBuffer  _pViewports);/*
		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  vkObj->pViewports = (const VkViewport*) (_pViewports);
	  */

	/**
	 * native GET method for field pViewports	[vkstruct]<br>
	 * Prototype: const VkViewport*  pViewports
	 */ 
	 private static native java.nio.ByteBuffer  pViewports0(Buffer ptr);/*
		  VkPipelineViewportStateCreateInfo vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  return ( VkViewport ) (vkObj->pViewports);
	 */

	/**
	 * native SET method for field scissorCount	[int]<br>
	 * Prototype: uint32_t  scissorCount
	 */ 
	 private static native void scissorCount0(Buffer ptr, int _scissorCount);/*
		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  vkObj->scissorCount = (uint32_t) (_scissorCount);
	  */

	/**
	 * native GET method for field scissorCount	[int]<br>
	 * Prototype: uint32_t  scissorCount
	 */ 
	 private static native int scissorCount0(Buffer ptr);/*
		  VkPipelineViewportStateCreateInfo vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  return (jint) (vkObj->scissorCount);
	 */

	/**
	 * native SET method for field pScissors	[vkstruct]<br>
	 * Prototype: const VkRect2D*  pScissors
	 */ 
	 private static native void pScissors0(Buffer ptr, java.nio.ByteBuffer  _pScissors);/*
		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  vkObj->pScissors = (const VkRect2D*) (_pScissors);
	  */

	/**
	 * native GET method for field pScissors	[vkstruct]<br>
	 * Prototype: const VkRect2D*  pScissors
	 */ 
	 private static native java.nio.ByteBuffer  pScissors0(Buffer ptr);/*
		  VkPipelineViewportStateCreateInfo vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  return ( VkRect2D ) (vkObj->pScissors);
	 */



} // end of class VkPipelineViewportStateCreateInfo
