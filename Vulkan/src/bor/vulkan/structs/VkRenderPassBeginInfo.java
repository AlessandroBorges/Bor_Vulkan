/**
 * Class wrapping Vulkan's VkRenderPassBeginInfo struct.
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
 *  This class is a Java front end for struct VkRenderPassBeginInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkRenderPassBeginInfo {
 *     VkStructureType        sType;
 *     const void*            pNext;
 *     VkRenderPass           renderPass;
 *     VkFramebuffer          framebuffer;
 *     VkRect2D               renderArea;
 *     uint32_t               clearValueCount;
 *     const VkClearValue*    pClearValues;
 * } VkRenderPassBeginInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkRenderPassBeginInfo extends VkStruct {
	/** TAG of this structure [102]  */
	 private static final String TAG = "VkRenderPassBeginInfo";

	/** ID of this structure [102]  */
	 public static final int TAG_ID = VKRENDERPASSBEGININFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkRenderPassBeginInfo> p;

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
	 *  VkRenderPass 	renderPass	[vkhandle]
	 */ 
	 VkRenderPass 	renderPass;

	/**
	 *  VkFramebuffer 	framebuffer	[vkhandle]
	 */ 
	 VkFramebuffer 	framebuffer;

	/**
	 *  VkRect2D 	renderArea	[vkstruct]
	 */ 
	 VkRect2D 	renderArea;

	/**
	 *  uint32_t 	clearValueCount	[int]
	 */ 
	 int 	clearValueCount;

	/**
	 *  const VkClearValue* 	pClearValues	[p]
	 */ 
	 P<VkClearValue>  	pClearValues;

	/**
	 * Ctor
	 */
	public VkRenderPassBeginInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkRenderPassBeginInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkRenderPassBeginInfo(long address, int memSize){ 
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
	 public static P<VkRenderPassBeginInfo> createNullPointer(){
	        P<VkRenderPassBeginInfo> p = new  P<VkRenderPassBeginInfo>(new VkRenderPassBeginInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkRenderPassBeginInfo> getP() {
	       if(p == null ){
	           p = new P<VkRenderPassBeginInfo> (this);
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
	 * Set method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 public void renderPass(VkRenderPass renderPass){
		 this.renderPass = renderPass;
		renderPass0(super.ptr, renderPass);
	 }

	/**
	 * get method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 public VkRenderPass renderPass(){
		 // return  this.renderPass;
		 return renderPass0(super.ptr);
	 }

	/**
	 * Set method for field framebuffer	[vkhandle]<br>
	 * Prototype: VkFramebuffer  framebuffer
	 */ 
	 public void framebuffer(VkFramebuffer framebuffer){
		 this.framebuffer = framebuffer;
		framebuffer0(super.ptr, framebuffer);
	 }

	/**
	 * get method for field framebuffer	[vkhandle]<br>
	 * Prototype: VkFramebuffer  framebuffer
	 */ 
	 public VkFramebuffer framebuffer(){
		 // return  this.framebuffer;
		 return framebuffer0(super.ptr);
	 }

	/**
	 * Set method for field renderArea	[vkstruct]<br>
	 * Prototype: VkRect2D  renderArea
	 */ 
	 public void renderArea(VkRect2D renderArea){
		 this.renderArea = renderArea;
		renderArea0(super.ptr, renderArea);
	 }

	/**
	 * get method for field renderArea	[vkstruct]<br>
	 * Prototype: VkRect2D  renderArea
	 */ 
	 public VkRect2D renderArea(){
		 // return  this.renderArea;
		 return renderArea0(super.ptr);
	 }

	/**
	 * Set method for field clearValueCount	[int]<br>
	 * Prototype: uint32_t  clearValueCount
	 */ 
	 public void clearValueCount(int clearValueCount){
		 this.clearValueCount = clearValueCount;
		clearValueCount0(super.ptr, clearValueCount);
	 }

	/**
	 * get method for field clearValueCount	[int]<br>
	 * Prototype: uint32_t  clearValueCount
	 */ 
	 public int clearValueCount(){
		 // return  this.clearValueCount;
		 return clearValueCount0(super.ptr);
	 }

	/**
	 * Set method for field pClearValues	[p]<br>
	 * Prototype: const VkClearValue*  pClearValues
	 */ 
	 public void pClearValues(P<VkClearValue>  pClearValues){
		 this.pClearValues = pClearValues;
		pClearValues0(super.ptr, pClearValues);
	 }

	/**
	 * get method for field pClearValues	[p]<br>
	 * Prototype: const VkClearValue*  pClearValues
	 */ 
	 public P<VkClearValue>  pClearValues(){
		 // return  this.pClearValues;
		 return pClearValues0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native void renderPass0(ByteBuffer ptr, VkRenderPass _renderPass);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(*ptr);
		  _obj.renderPass = (VkRenderPass) (_renderPass);
	  */

	/**
	 * native GET method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native VkRenderPass renderPass0(ByteBuffer ptr);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(ptr);
		  return (VkRenderPass) (_obj.VkRenderPass);
	 */

	/**
	 * native SET method for field framebuffer	[vkhandle]<br>
	 * Prototype: VkFramebuffer  framebuffer
	 */ 
	 private static native void framebuffer0(ByteBuffer ptr, VkFramebuffer _framebuffer);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(*ptr);
		  _obj.framebuffer = (VkFramebuffer) (_framebuffer);
	  */

	/**
	 * native GET method for field framebuffer	[vkhandle]<br>
	 * Prototype: VkFramebuffer  framebuffer
	 */ 
	 private static native VkFramebuffer framebuffer0(ByteBuffer ptr);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(ptr);
		  return (VkFramebuffer) (_obj.VkFramebuffer);
	 */

	/**
	 * native SET method for field renderArea	[vkstruct]<br>
	 * Prototype: VkRect2D  renderArea
	 */ 
	 private static native void renderArea0(ByteBuffer ptr, VkRect2D _renderArea);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(*ptr);
		  _obj.renderArea = (VkRect2D) (_renderArea);
	  */

	/**
	 * native GET method for field renderArea	[vkstruct]<br>
	 * Prototype: VkRect2D  renderArea
	 */ 
	 private static native VkRect2D renderArea0(ByteBuffer ptr);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(ptr);
		  return (VkRect2D) (_obj.VkRect2D);
	 */

	/**
	 * native SET method for field clearValueCount	[int]<br>
	 * Prototype: uint32_t  clearValueCount
	 */ 
	 private static native void clearValueCount0(ByteBuffer ptr, int _clearValueCount);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(*ptr);
		  _obj.clearValueCount = (uint32_t) (_clearValueCount);
	  */

	/**
	 * native GET method for field clearValueCount	[int]<br>
	 * Prototype: uint32_t  clearValueCount
	 */ 
	 private static native int clearValueCount0(ByteBuffer ptr);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field pClearValues	[p]<br>
	 * Prototype: const VkClearValue*  pClearValues
	 */ 
	 private static native void pClearValues0(ByteBuffer ptr, P<VkClearValue>  _pClearValues);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(*ptr);
		  _obj.pClearValues = (const VkClearValue*) (_pClearValues);
	  */

	/**
	 * native GET method for field pClearValues	[p]<br>
	 * Prototype: const VkClearValue*  pClearValues
	 */ 
	 private static native P<VkClearValue>  pClearValues0(ByteBuffer ptr);/*
		  VkRenderPassBeginInfo _obj = (VkRenderPassBeginInfo)(ptr);
		  return (P<VkClearValue> ) (_obj.const VkClearValue*);
	 */



} // end of class VkRenderPassBeginInfo
