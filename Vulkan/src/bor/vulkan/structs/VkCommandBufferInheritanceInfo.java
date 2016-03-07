/**
 * Class wrapping Vulkan's VkCommandBufferInheritanceInfo struct.
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
 *  This class is a Java front end for struct VkCommandBufferInheritanceInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkCommandBufferInheritanceInfo {
 *     VkStructureType                  sType;
 *     const void*                      pNext;
 *     VkRenderPass                     renderPass;
 *     uint32_t                         subpass;
 *     VkFramebuffer                    framebuffer;
 *     VkBool32                         occlusionQueryEnable;
 *     VkQueryControlFlags              queryFlags;
 *     VkQueryPipelineStatisticFlags    pipelineStatistics;
 * } VkCommandBufferInheritanceInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkCommandBufferInheritanceInfo extends VkStruct {
	/** TAG of this structure [88]  */
	 private static final String TAG = "VkCommandBufferInheritanceInfo";

	/** ID of this structure [88]  */
	 public static final int TAG_ID = VKCOMMANDBUFFERINHERITANCEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkCommandBufferInheritanceInfo> p;

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
	 *  uint32_t 	subpass	[int]
	 */ 
	 int 	subpass;

	/**
	 *  VkFramebuffer 	framebuffer	[vkhandle]
	 */ 
	 VkFramebuffer 	framebuffer;

	/**
	 *  VkBool32 	occlusionQueryEnable	[boolean]
	 */ 
	 boolean 	occlusionQueryEnable;

	/**
	 *  VkQueryControlFlags 	queryFlags	[int]
	 */ 
	 int 	queryFlags;

	/**
	 *  VkQueryPipelineStatisticFlags 	pipelineStatistics	[int]
	 */ 
	 int 	pipelineStatistics;

	/**
	 * Ctor
	 */
	public VkCommandBufferInheritanceInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkCommandBufferInheritanceInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkCommandBufferInheritanceInfo(long address, int memSize){ 
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
	 public static P<VkCommandBufferInheritanceInfo> createNullPointer(){
	        P<VkCommandBufferInheritanceInfo> p = new  P<VkCommandBufferInheritanceInfo>(new VkCommandBufferInheritanceInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkCommandBufferInheritanceInfo> getP() {
	       if(p == null ){
	           p = new P<VkCommandBufferInheritanceInfo> (this);
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
	 * Set method for field subpass	[int]<br>
	 * Prototype: uint32_t  subpass
	 */ 
	 public void subpass(int subpass){
		 this.subpass = subpass;
		subpass0(super.ptr, subpass);
	 }

	/**
	 * get method for field subpass	[int]<br>
	 * Prototype: uint32_t  subpass
	 */ 
	 public int subpass(){
		 // return  this.subpass;
		 return subpass0(super.ptr);
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
	 * Set method for field occlusionQueryEnable	[boolean]<br>
	 * Prototype: VkBool32  occlusionQueryEnable
	 */ 
	 public void occlusionQueryEnable(boolean occlusionQueryEnable){
		 this.occlusionQueryEnable = occlusionQueryEnable;
		occlusionQueryEnable0(super.ptr, occlusionQueryEnable);
	 }

	/**
	 * get method for field occlusionQueryEnable	[boolean]<br>
	 * Prototype: VkBool32  occlusionQueryEnable
	 */ 
	 public boolean occlusionQueryEnable(){
		 // return  this.occlusionQueryEnable;
		 return occlusionQueryEnable0(super.ptr);
	 }

	/**
	 * Set method for field queryFlags	[int]<br>
	 * Prototype: VkQueryControlFlags  queryFlags
	 */ 
	 public void queryFlags(int queryFlags){
		 this.queryFlags = queryFlags;
		queryFlags0(super.ptr, queryFlags);
	 }

	/**
	 * get method for field queryFlags	[int]<br>
	 * Prototype: VkQueryControlFlags  queryFlags
	 */ 
	 public int queryFlags(){
		 // return  this.queryFlags;
		 return queryFlags0(super.ptr);
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
		  VkCommandBufferInheritanceInfo _obj = (VkCommandBufferInheritanceInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkCommandBufferInheritanceInfo _obj = (VkCommandBufferInheritanceInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkCommandBufferInheritanceInfo _obj = (VkCommandBufferInheritanceInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkCommandBufferInheritanceInfo _obj = (VkCommandBufferInheritanceInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native void renderPass0(ByteBuffer ptr, VkRenderPass _renderPass);/*
		  VkCommandBufferInheritanceInfo _obj = (VkCommandBufferInheritanceInfo)(*ptr);
		  _obj.renderPass = (VkRenderPass) (_renderPass);
	  */

	/**
	 * native GET method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native VkRenderPass renderPass0(ByteBuffer ptr);/*
		  VkCommandBufferInheritanceInfo _obj = (VkCommandBufferInheritanceInfo)(ptr);
		  return (VkRenderPass) (_obj.VkRenderPass);
	 */

	/**
	 * native SET method for field subpass	[int]<br>
	 * Prototype: uint32_t  subpass
	 */ 
	 private static native void subpass0(ByteBuffer ptr, int _subpass);/*
		  VkCommandBufferInheritanceInfo _obj = (VkCommandBufferInheritanceInfo)(*ptr);
		  _obj.subpass = (uint32_t) (_subpass);
	  */

	/**
	 * native GET method for field subpass	[int]<br>
	 * Prototype: uint32_t  subpass
	 */ 
	 private static native int subpass0(ByteBuffer ptr);/*
		  VkCommandBufferInheritanceInfo _obj = (VkCommandBufferInheritanceInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field framebuffer	[vkhandle]<br>
	 * Prototype: VkFramebuffer  framebuffer
	 */ 
	 private static native void framebuffer0(ByteBuffer ptr, VkFramebuffer _framebuffer);/*
		  VkCommandBufferInheritanceInfo _obj = (VkCommandBufferInheritanceInfo)(*ptr);
		  _obj.framebuffer = (VkFramebuffer) (_framebuffer);
	  */

	/**
	 * native GET method for field framebuffer	[vkhandle]<br>
	 * Prototype: VkFramebuffer  framebuffer
	 */ 
	 private static native VkFramebuffer framebuffer0(ByteBuffer ptr);/*
		  VkCommandBufferInheritanceInfo _obj = (VkCommandBufferInheritanceInfo)(ptr);
		  return (VkFramebuffer) (_obj.VkFramebuffer);
	 */

	/**
	 * native SET method for field occlusionQueryEnable	[boolean]<br>
	 * Prototype: VkBool32  occlusionQueryEnable
	 */ 
	 private static native void occlusionQueryEnable0(ByteBuffer ptr, boolean _occlusionQueryEnable);/*
		  VkCommandBufferInheritanceInfo _obj = (VkCommandBufferInheritanceInfo)(*ptr);
		  _obj.occlusionQueryEnable = (VkBool32) (_occlusionQueryEnable);
	  */

	/**
	 * native GET method for field occlusionQueryEnable	[boolean]<br>
	 * Prototype: VkBool32  occlusionQueryEnable
	 */ 
	 private static native boolean occlusionQueryEnable0(ByteBuffer ptr);/*
		  VkCommandBufferInheritanceInfo _obj = (VkCommandBufferInheritanceInfo)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field queryFlags	[int]<br>
	 * Prototype: VkQueryControlFlags  queryFlags
	 */ 
	 private static native void queryFlags0(ByteBuffer ptr, int _queryFlags);/*
		  VkCommandBufferInheritanceInfo _obj = (VkCommandBufferInheritanceInfo)(*ptr);
		  _obj.queryFlags = (VkQueryControlFlags) (_queryFlags);
	  */

	/**
	 * native GET method for field queryFlags	[int]<br>
	 * Prototype: VkQueryControlFlags  queryFlags
	 */ 
	 private static native int queryFlags0(ByteBuffer ptr);/*
		  VkCommandBufferInheritanceInfo _obj = (VkCommandBufferInheritanceInfo)(ptr);
		  return (jint) (_obj.VkQueryControlFlags);
	 */

	/**
	 * native SET method for field pipelineStatistics	[int]<br>
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 */ 
	 private static native void pipelineStatistics0(ByteBuffer ptr, int _pipelineStatistics);/*
		  VkCommandBufferInheritanceInfo _obj = (VkCommandBufferInheritanceInfo)(*ptr);
		  _obj.pipelineStatistics = (VkQueryPipelineStatisticFlags) (_pipelineStatistics);
	  */

	/**
	 * native GET method for field pipelineStatistics	[int]<br>
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 */ 
	 private static native int pipelineStatistics0(ByteBuffer ptr);/*
		  VkCommandBufferInheritanceInfo _obj = (VkCommandBufferInheritanceInfo)(ptr);
		  return (jint) (_obj.VkQueryPipelineStatisticFlags);
	 */



} // end of class VkCommandBufferInheritanceInfo
