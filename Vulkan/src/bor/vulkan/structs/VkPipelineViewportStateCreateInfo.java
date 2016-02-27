// class wrapping Vulkan's VkPipelineViewportStateCreateInfo struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkPipelineViewportStateCreateInfo 
 * @Author Alessandro Borges 
 */
public class VkPipelineViewportStateCreateInfo extends VkStruct {
	/** ID of this structure [58]  */
	 public static final int TAG = VKPIPELINEVIEWPORTSTATECREATEINFO_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType 
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext 
	 */ 
	VkObject 	pNext;

	/**
	 *  VkPipelineViewportStateCreateFlags 	flags 
	 */ 
	int 	flags;

	/**
	 *  uint32_t 	viewportCount 
	 */ 
	int 	viewportCount;

	/**
	 *  const VkViewport* 	pViewports 
	 */ 
	const VkViewport* 	pViewports;

	/**
	 *  uint32_t 	scissorCount 
	 */ 
	int 	scissorCount;

	/**
	 *  const VkRect2D* 	pScissors 
	 */ 
	const VkRect2D* 	pScissors;

	/**
	 * Ctor
	 */
	public VkPipelineViewportStateCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG); 
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
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field flags
	 * Prototype: VkPipelineViewportStateCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkPipelineViewportStateCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field viewportCount
	 * Prototype: uint32_t  viewportCount
	 */ 
	 public void viewportCount(int viewportCount){
		 this.viewportCount = viewportCount;
		viewportCount0(super.ptr, viewportCount);
	 }

	/**
	 * get method for field viewportCount
	 * Prototype: uint32_t  viewportCount
	 */ 
	 public int viewportCount(){
		 // return  this.viewportCount;
		 return viewportCount0(super.ptr);
	 }

	/**
	 * Set method for field pViewports
	 * Prototype: const VkViewport*  pViewports
	 */ 
	 public void pViewports(const VkViewport* pViewports){
		 this.pViewports = pViewports;
		pViewports0(super.ptr, pViewports);
	 }

	/**
	 * get method for field pViewports
	 * Prototype: const VkViewport*  pViewports
	 */ 
	 public const VkViewport* pViewports(){
		 // return  this.pViewports;
		 return pViewports0(super.ptr);
	 }

	/**
	 * Set method for field scissorCount
	 * Prototype: uint32_t  scissorCount
	 */ 
	 public void scissorCount(int scissorCount){
		 this.scissorCount = scissorCount;
		scissorCount0(super.ptr, scissorCount);
	 }

	/**
	 * get method for field scissorCount
	 * Prototype: uint32_t  scissorCount
	 */ 
	 public int scissorCount(){
		 // return  this.scissorCount;
		 return scissorCount0(super.ptr);
	 }

	/**
	 * Set method for field pScissors
	 * Prototype: const VkRect2D*  pScissors
	 */ 
	 public void pScissors(const VkRect2D* pScissors){
		 this.pScissors = pScissors;
		pScissors0(super.ptr, pScissors);
	 }

	/**
	 * get method for field pScissors
	 * Prototype: const VkRect2D*  pScissors
	 */ 
	 public const VkRect2D* pScissors(){
		 // return  this.pScissors;
		 return pScissors0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkPipelineViewportStateCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(*ptr);
		  _obj.flags = (VkPipelineViewportStateCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkPipelineViewportStateCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(ptr);
		  return (jint) (_obj.VkPipelineViewportStateCreateFlags);
	 */

	/**
	 * native Set method for field viewportCount
	 * Prototype: uint32_t  viewportCount
	 */ 
	 private static native void viewportCount0(ByteBuffer ptr, int _viewportCount);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(*ptr);
		  _obj.viewportCount = (uint32_t) (_viewportCount);
	  */

	/**
	 * get method for field viewportCount
	 * Prototype: uint32_t  viewportCount
	 */ 
	 private static native int viewportCount0(ByteBuffer ptr);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pViewports
	 * Prototype: const VkViewport*  pViewports
	 */ 
	 private static native void pViewports0(ByteBuffer ptr, const VkViewport* _pViewports);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(*ptr);
		  _obj.pViewports = (const VkViewport*) (_pViewports);
	  */

	/**
	 * get method for field pViewports
	 * Prototype: const VkViewport*  pViewports
	 */ 
	 private static native const VkViewport* pViewports0(ByteBuffer ptr);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(ptr);
		  return (const VkViewport*) (_obj.const VkViewport*);
	 */

	/**
	 * native Set method for field scissorCount
	 * Prototype: uint32_t  scissorCount
	 */ 
	 private static native void scissorCount0(ByteBuffer ptr, int _scissorCount);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(*ptr);
		  _obj.scissorCount = (uint32_t) (_scissorCount);
	  */

	/**
	 * get method for field scissorCount
	 * Prototype: uint32_t  scissorCount
	 */ 
	 private static native int scissorCount0(ByteBuffer ptr);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pScissors
	 * Prototype: const VkRect2D*  pScissors
	 */ 
	 private static native void pScissors0(ByteBuffer ptr, const VkRect2D* _pScissors);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(*ptr);
		  _obj.pScissors = (const VkRect2D*) (_pScissors);
	  */

	/**
	 * get method for field pScissors
	 * Prototype: const VkRect2D*  pScissors
	 */ 
	 private static native const VkRect2D* pScissors0(ByteBuffer ptr);/*
		  VkPipelineViewportStateCreateInfo _obj = (VkPipelineViewportStateCreateInfo)(ptr);
		  return (const VkRect2D*) (_obj.const VkRect2D*);
	 */



} // end of class VkPipelineViewportStateCreateInfo
