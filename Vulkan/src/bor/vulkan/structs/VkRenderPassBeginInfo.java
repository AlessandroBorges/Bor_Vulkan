// class wrapping Vulkan's VkRenderPassBeginInfo struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkRenderPassBeginInfo 
 * @Author Alessandro Borges 
 */
public class VkRenderPassBeginInfo extends VkStruct {
	/** ID of this structure [102]  */
	 public static final int TAG = VKRENDERPASSBEGININFO_ID;

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
	 *  VkRenderPass 	renderPass 
	 */ 
	VkRenderPass 	renderPass;

	/**
	 *  VkFramebuffer 	framebuffer 
	 */ 
	VkFramebuffer 	framebuffer;

	/**
	 *  VkRect2D 	renderArea 
	 */ 
	VkRect2D 	renderArea;

	/**
	 *  uint32_t 	clearValueCount 
	 */ 
	int 	clearValueCount;

	/**
	 *  const VkClearValue* 	pClearValues 
	 */ 
	const VkClearValue* 	pClearValues;

	/**
	 * Ctor
	 */
	public VkRenderPassBeginInfo(){ 
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
	 * Set method for field renderPass
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 public void renderPass(VkRenderPass renderPass){
		 this.renderPass = renderPass;
		renderPass0(super.ptr, renderPass);
	 }

	/**
	 * get method for field renderPass
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 public VkRenderPass renderPass(){
		 // return  this.renderPass;
		 return renderPass0(super.ptr);
	 }

	/**
	 * Set method for field framebuffer
	 * Prototype: VkFramebuffer  framebuffer
	 */ 
	 public void framebuffer(VkFramebuffer framebuffer){
		 this.framebuffer = framebuffer;
		framebuffer0(super.ptr, framebuffer);
	 }

	/**
	 * get method for field framebuffer
	 * Prototype: VkFramebuffer  framebuffer
	 */ 
	 public VkFramebuffer framebuffer(){
		 // return  this.framebuffer;
		 return framebuffer0(super.ptr);
	 }

	/**
	 * Set method for field renderArea
	 * Prototype: VkRect2D  renderArea
	 */ 
	 public void renderArea(VkRect2D renderArea){
		 this.renderArea = renderArea;
		renderArea0(super.ptr, renderArea);
	 }

	/**
	 * get method for field renderArea
	 * Prototype: VkRect2D  renderArea
	 */ 
	 public VkRect2D renderArea(){
		 // return  this.renderArea;
		 return renderArea0(super.ptr);
	 }

	/**
	 * Set method for field clearValueCount
	 * Prototype: uint32_t  clearValueCount
	 */ 
	 public void clearValueCount(int clearValueCount){
		 this.clearValueCount = clearValueCount;
		clearValueCount0(super.ptr, clearValueCount);
	 }

	/**
	 * get method for field clearValueCount
	 * Prototype: uint32_t  clearValueCount
	 */ 
	 public int clearValueCount(){
		 // return  this.clearValueCount;
		 return clearValueCount0(super.ptr);
	 }

	/**
	 * Set method for field pClearValues
	 * Prototype: const VkClearValue*  pClearValues
	 */ 
	 public void pClearValues(const VkClearValue* pClearValues){
		 this.pClearValues = pClearValues;
		pClearValues0(super.ptr, pClearValues);
	 }

	/**
	 * get method for field pClearValues
	 * Prototype: const VkClearValue*  pClearValues
	 */ 
	 public const VkClearValue* pClearValues(){
		 // return  this.pClearValues;
		 return pClearValues0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field renderPass
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native void renderPass0(ByteBuffer ptr, VkRenderPass _renderPass);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(*ptr);
		  _obj.renderPass = (VkRenderPass) (_renderPass);
	  */

	/**
	 * get method for field renderPass
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native VkRenderPass renderPass0(ByteBuffer ptr);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(ptr);
		  return (VkRenderPass) (_obj.VkRenderPass);
	 */

	/**
	 * native Set method for field framebuffer
	 * Prototype: VkFramebuffer  framebuffer
	 */ 
	 private static native void framebuffer0(ByteBuffer ptr, VkFramebuffer _framebuffer);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(*ptr);
		  _obj.framebuffer = (VkFramebuffer) (_framebuffer);
	  */

	/**
	 * get method for field framebuffer
	 * Prototype: VkFramebuffer  framebuffer
	 */ 
	 private static native VkFramebuffer framebuffer0(ByteBuffer ptr);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(ptr);
		  return (VkFramebuffer) (_obj.VkFramebuffer);
	 */

	/**
	 * native Set method for field renderArea
	 * Prototype: VkRect2D  renderArea
	 */ 
	 private static native void renderArea0(ByteBuffer ptr, VkRect2D _renderArea);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(*ptr);
		  _obj.renderArea = (VkRect2D) (_renderArea);
	  */

	/**
	 * get method for field renderArea
	 * Prototype: VkRect2D  renderArea
	 */ 
	 private static native VkRect2D renderArea0(ByteBuffer ptr);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(ptr);
		  return (VkRect2D) (_obj.VkRect2D);
	 */

	/**
	 * native Set method for field clearValueCount
	 * Prototype: uint32_t  clearValueCount
	 */ 
	 private static native void clearValueCount0(ByteBuffer ptr, int _clearValueCount);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(*ptr);
		  _obj.clearValueCount = (uint32_t) (_clearValueCount);
	  */

	/**
	 * get method for field clearValueCount
	 * Prototype: uint32_t  clearValueCount
	 */ 
	 private static native int clearValueCount0(ByteBuffer ptr);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pClearValues
	 * Prototype: const VkClearValue*  pClearValues
	 */ 
	 private static native void pClearValues0(ByteBuffer ptr, const VkClearValue* _pClearValues);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(*ptr);
		  _obj.pClearValues = (const VkClearValue*) (_pClearValues);
	  */

	/**
	 * get method for field pClearValues
	 * Prototype: const VkClearValue*  pClearValues
	 */ 
	 private static native const VkClearValue* pClearValues0(ByteBuffer ptr);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(ptr);
		  return (const VkClearValue*) (_obj.const VkClearValue*);
	 */



} // end of class VkRenderPassBeginInfo
