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
	 *  const void* 	pNext	[p]
	 */ 
	 P<VkObject> 	pNext;

	/**
	 *  VkPipelineViewportStateCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  uint32_t 	viewportCount	[int]
	 */ 
	 int 	viewportCount;

	/**
	 *  const VkViewport* 	pViewports	[p]
	 */ 
	 P<VkViewport>  	pViewports;

	/**
	 *  uint32_t 	scissorCount	[int]
	 */ 
	 int 	scissorCount;

	/**
	 *  const VkRect2D* 	pScissors	[p]
	 */ 
	 P<VkRect2D>  	pScissors;

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
	 * Prototype: VkPipelineViewportStateCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkPipelineViewportStateCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field viewportCount	[int]<br>
	 * Prototype: uint32_t  viewportCount
	 */ 
	 public void viewportCount(int viewportCount){
		 this.viewportCount = viewportCount;
		viewportCount0(super.ptr, viewportCount);
	 }

	/**
	 * get method for field viewportCount	[int]<br>
	 * Prototype: uint32_t  viewportCount
	 */ 
	 public int viewportCount(){
		 // return  this.viewportCount;
		 return viewportCount0(super.ptr);
	 }

	/**
	 * Set method for field pViewports	[p]<br>
	 * Prototype: const VkViewport*  pViewports
	 */ 
	 public void pViewports(P<VkViewport>  pViewports){
		 this.pViewports = pViewports;
		pViewports0(super.ptr, pViewports);
	 }

	/**
	 * get method for field pViewports	[p]<br>
	 * Prototype: const VkViewport*  pViewports
	 */ 
	 public P<VkViewport>  pViewports(){
		 // return  this.pViewports;
		 return pViewports0(super.ptr);
	 }

	/**
	 * Set method for field scissorCount	[int]<br>
	 * Prototype: uint32_t  scissorCount
	 */ 
	 public void scissorCount(int scissorCount){
		 this.scissorCount = scissorCount;
		scissorCount0(super.ptr, scissorCount);
	 }

	/**
	 * get method for field scissorCount	[int]<br>
	 * Prototype: uint32_t  scissorCount
	 */ 
	 public int scissorCount(){
		 // return  this.scissorCount;
		 return scissorCount0(super.ptr);
	 }

	/**
	 * Set method for field pScissors	[p]<br>
	 * Prototype: const VkRect2D*  pScissors
	 */ 
	 public void pScissors(P<VkRect2D>  pScissors){
		 this.pScissors = pScissors;
		pScissors0(super.ptr, pScissors);
	 }

	/**
	 * get method for field pScissors	[p]<br>
	 * Prototype: const VkRect2D*  pScissors
	 */ 
	 public P<VkRect2D>  pScissors(){
		 // return  this.pScissors;
		 return pScissors0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineViewportStateCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(*ptr);
		  _obj.flags = (VkPipelineViewportStateCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineViewportStateCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(ptr);
		  return (jint) (_obj.VkPipelineViewportStateCreateFlags);
	 */

	/**
	 * native SET method for field viewportCount	[int]<br>
	 * Prototype: uint32_t  viewportCount
	 */ 
	 private static native void viewportCount0(ByteBuffer ptr, int _viewportCount);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(*ptr);
		  _obj.viewportCount = (uint32_t) (_viewportCount);
	  */

	/**
	 * native GET method for field viewportCount	[int]<br>
	 * Prototype: uint32_t  viewportCount
	 */ 
	 private static native int viewportCount0(ByteBuffer ptr);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field pViewports	[p]<br>
	 * Prototype: const VkViewport*  pViewports
	 */ 
	 private static native void pViewports0(ByteBuffer ptr, P<VkViewport>  _pViewports);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(*ptr);
		  _obj.pViewports = (const VkViewport*) (_pViewports);
	  */

	/**
	 * native GET method for field pViewports	[p]<br>
	 * Prototype: const VkViewport*  pViewports
	 */ 
	 private static native P<VkViewport>  pViewports0(ByteBuffer ptr);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(ptr);
		  return (P<VkViewport> ) (_obj.const VkViewport*);
	 */

	/**
	 * native SET method for field scissorCount	[int]<br>
	 * Prototype: uint32_t  scissorCount
	 */ 
	 private static native void scissorCount0(ByteBuffer ptr, int _scissorCount);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(*ptr);
		  _obj.scissorCount = (uint32_t) (_scissorCount);
	  */

	/**
	 * native GET method for field scissorCount	[int]<br>
	 * Prototype: uint32_t  scissorCount
	 */ 
	 private static native int scissorCount0(ByteBuffer ptr);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field pScissors	[p]<br>
	 * Prototype: const VkRect2D*  pScissors
	 */ 
	 private static native void pScissors0(ByteBuffer ptr, P<VkRect2D>  _pScissors);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(*ptr);
		  _obj.pScissors = (const VkRect2D*) (_pScissors);
	  */

	/**
	 * native GET method for field pScissors	[p]<br>
	 * Prototype: const VkRect2D*  pScissors
	 */ 
	 private static native P<VkRect2D>  pScissors0(ByteBuffer ptr);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(ptr);
		  return (P<VkRect2D> ) (_obj.const VkRect2D*);
	 */



} // end of class VkPipelineViewportStateCreateInfo
