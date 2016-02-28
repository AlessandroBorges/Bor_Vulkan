/**
 * Class wrapping Vulkan's VkFramebufferCreateInfo struct.
 * 
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
 *  This class is a Java front end for struct VkFramebufferCreateInfo 
 *  <h3>ProtoType:</h3>
 * <pre>
 * typedef struct VkFramebufferCreateInfo {
 *     VkStructureType             sType;
 *     const void*                 pNext;
 *     VkFramebufferCreateFlags    flags;
 *     VkRenderPass                renderPass;
 *     uint32_t                    attachmentCount;
 *     const VkImageView*          pAttachments;
 *     uint32_t                    width;
 *     uint32_t                    height;
 *     uint32_t                    layers;
 * } VkFramebufferCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version 0.8.01
 */
public class VkFramebufferCreateInfo extends VkStruct {
	/** TAG of this structure [204]  */
	 private static final String TAG = "VkFramebufferCreateInfo";

	/** ID of this structure [204]  */
	 public static final int TAG_ID = VKFRAMEBUFFERCREATEINFO_ID;

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
	 *  VkFramebufferCreateFlags 	flags 
	 */ 
	int 	flags;

	/**
	 *  VkRenderPass 	renderPass 
	 */ 
	VkRenderPass 	renderPass;

	/**
	 *  uint32_t 	attachmentCount 
	 */ 
	int 	attachmentCount;

	/**
	 *  const VkImageView* 	pAttachments 
	 */ 
	P<VkImageView>  	pAttachments;

	/**
	 *  uint32_t 	width 
	 */ 
	int 	width;

	/**
	 *  uint32_t 	height 
	 */ 
	int 	height;

	/**
	 *  uint32_t 	layers 
	 */ 
	int 	layers;

	/**
	 * Ctor
	 */
	public VkFramebufferCreateInfo(){ 
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
	 * Prototype: VkFramebufferCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkFramebufferCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
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
	 * Set method for field attachmentCount
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 public void attachmentCount(int attachmentCount){
		 this.attachmentCount = attachmentCount;
		attachmentCount0(super.ptr, attachmentCount);
	 }

	/**
	 * get method for field attachmentCount
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 public int attachmentCount(){
		 // return  this.attachmentCount;
		 return attachmentCount0(super.ptr);
	 }

	/**
	 * Set method for field pAttachments
	 * Prototype: const VkImageView*  pAttachments
	 */ 
	 public void pAttachments(P<VkImageView>  pAttachments){
		 this.pAttachments = pAttachments;
		pAttachments0(super.ptr, pAttachments);
	 }

	/**
	 * get method for field pAttachments
	 * Prototype: const VkImageView*  pAttachments
	 */ 
	 public P<VkImageView>  pAttachments(){
		 // return  this.pAttachments;
		 return pAttachments0(super.ptr);
	 }

	/**
	 * Set method for field width
	 * Prototype: uint32_t  width
	 */ 
	 public void width(int width){
		 this.width = width;
		width0(super.ptr, width);
	 }

	/**
	 * get method for field width
	 * Prototype: uint32_t  width
	 */ 
	 public int width(){
		 // return  this.width;
		 return width0(super.ptr);
	 }

	/**
	 * Set method for field height
	 * Prototype: uint32_t  height
	 */ 
	 public void height(int height){
		 this.height = height;
		height0(super.ptr, height);
	 }

	/**
	 * get method for field height
	 * Prototype: uint32_t  height
	 */ 
	 public int height(){
		 // return  this.height;
		 return height0(super.ptr);
	 }

	/**
	 * Set method for field layers
	 * Prototype: uint32_t  layers
	 */ 
	 public void layers(int layers){
		 this.layers = layers;
		layers0(super.ptr, layers);
	 }

	/**
	 * get method for field layers
	 * Prototype: uint32_t  layers
	 */ 
	 public int layers(){
		 // return  this.layers;
		 return layers0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkFramebufferCreateInfo _obj = (VkFramebufferCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkFramebufferCreateInfo _obj = (VkFramebufferCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkFramebufferCreateInfo _obj = (VkFramebufferCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkFramebufferCreateInfo _obj = (VkFramebufferCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkFramebufferCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkFramebufferCreateInfo _obj = (VkFramebufferCreateInfo)(*ptr);
		  _obj.flags = (VkFramebufferCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkFramebufferCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkFramebufferCreateInfo _obj = (VkFramebufferCreateInfo)(ptr);
		  return (jint) (_obj.VkFramebufferCreateFlags);
	 */

	/**
	 * native Set method for field renderPass
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native void renderPass0(ByteBuffer ptr, VkRenderPass _renderPass);/*
		  VkFramebufferCreateInfo _obj = (VkFramebufferCreateInfo)(*ptr);
		  _obj.renderPass = (VkRenderPass) (_renderPass);
	  */

	/**
	 * get method for field renderPass
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native VkRenderPass renderPass0(ByteBuffer ptr);/*
		  VkFramebufferCreateInfo _obj = (VkFramebufferCreateInfo)(ptr);
		  return (VkRenderPass) (_obj.VkRenderPass);
	 */

	/**
	 * native Set method for field attachmentCount
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 private static native void attachmentCount0(ByteBuffer ptr, int _attachmentCount);/*
		  VkFramebufferCreateInfo _obj = (VkFramebufferCreateInfo)(*ptr);
		  _obj.attachmentCount = (uint32_t) (_attachmentCount);
	  */

	/**
	 * get method for field attachmentCount
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 private static native int attachmentCount0(ByteBuffer ptr);/*
		  VkFramebufferCreateInfo _obj = (VkFramebufferCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pAttachments
	 * Prototype: const VkImageView*  pAttachments
	 */ 
	 private static native void pAttachments0(ByteBuffer ptr, P<VkImageView>  _pAttachments);/*
		  VkFramebufferCreateInfo _obj = (VkFramebufferCreateInfo)(*ptr);
		  _obj.pAttachments = (const VkImageView*) (_pAttachments);
	  */

	/**
	 * get method for field pAttachments
	 * Prototype: const VkImageView*  pAttachments
	 */ 
	 private static native P<VkImageView>  pAttachments0(ByteBuffer ptr);/*
		  VkFramebufferCreateInfo _obj = (VkFramebufferCreateInfo)(ptr);
		  return (P<VkImageView> ) (_obj.const VkImageView*);
	 */

	/**
	 * native Set method for field width
	 * Prototype: uint32_t  width
	 */ 
	 private static native void width0(ByteBuffer ptr, int _width);/*
		  VkFramebufferCreateInfo _obj = (VkFramebufferCreateInfo)(*ptr);
		  _obj.width = (uint32_t) (_width);
	  */

	/**
	 * get method for field width
	 * Prototype: uint32_t  width
	 */ 
	 private static native int width0(ByteBuffer ptr);/*
		  VkFramebufferCreateInfo _obj = (VkFramebufferCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field height
	 * Prototype: uint32_t  height
	 */ 
	 private static native void height0(ByteBuffer ptr, int _height);/*
		  VkFramebufferCreateInfo _obj = (VkFramebufferCreateInfo)(*ptr);
		  _obj.height = (uint32_t) (_height);
	  */

	/**
	 * get method for field height
	 * Prototype: uint32_t  height
	 */ 
	 private static native int height0(ByteBuffer ptr);/*
		  VkFramebufferCreateInfo _obj = (VkFramebufferCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field layers
	 * Prototype: uint32_t  layers
	 */ 
	 private static native void layers0(ByteBuffer ptr, int _layers);/*
		  VkFramebufferCreateInfo _obj = (VkFramebufferCreateInfo)(*ptr);
		  _obj.layers = (uint32_t) (_layers);
	  */

	/**
	 * get method for field layers
	 * Prototype: uint32_t  layers
	 */ 
	 private static native int layers0(ByteBuffer ptr);/*
		  VkFramebufferCreateInfo _obj = (VkFramebufferCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkFramebufferCreateInfo
