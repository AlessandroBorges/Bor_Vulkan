/**
 * Class wrapping Vulkan's VkFramebufferCreateInfo struct.
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
 *  This class is a Java front end for struct VkFramebufferCreateInfo. 
 *  <h3>Prototype:</h3>
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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkFramebufferCreateInfo extends VkStruct {
	/** TAG of this structure [80]  */
	 private static final String TAG = "VkFramebufferCreateInfo";

	/** ID of this structure [80]  */
	 public static final int TAG_ID = VKFRAMEBUFFERCREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkFramebufferCreateInfo> p;

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
	 *  VkFramebufferCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  VkRenderPass 	renderPass	[vkhandle]
	 */ 
	 VkRenderPass 	renderPass;

	/**
	 *  uint32_t 	attachmentCount	[int]
	 */ 
	 int 	attachmentCount;

	/**
	 *  const VkImageView* 	pAttachments	[vkhandle]
	 */ 
	  VkImageView  	pAttachments;

	/**
	 *  uint32_t 	width	[int]
	 */ 
	 int 	width;

	/**
	 *  uint32_t 	height	[int]
	 */ 
	 int 	height;

	/**
	 *  uint32_t 	layers	[int]
	 */ 
	 int 	layers;

	/**
	 * Ctor
	 */
	public VkFramebufferCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkFramebufferCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkFramebufferCreateInfo(long address, int memSize){ 
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
	 public static P<VkFramebufferCreateInfo> createNullPointer(){
	        P<VkFramebufferCreateInfo> p = new  P<VkFramebufferCreateInfo>(new VkFramebufferCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkFramebufferCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkFramebufferCreateInfo> (this);
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
	 * Prototype: VkFramebufferCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 flags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkFramebufferCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = flags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 public void renderPass(VkRenderPass renderPass){
		 this.renderPass = renderPass;
		 ByteBuffer buff = (renderPass==null) ? null : renderPass.getHandle();
		 renderPass0(this.ptr, buff);
	 }

	/**
	 * Get method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 public VkRenderPass renderPass(){

		 ByteBuffer handle = renderPass0(super.ptr);
		 if(handle == null){
		    this.renderPass = null;
		    return null;
		  } else 
 		 if(this.renderPass == null){
		    this.renderPass = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.renderPass).setHandle(handle);
		  }
		 return this.renderPass;
	 }

	/**
	 * Set method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 public void attachmentCount(int attachmentCount){
		 this.attachmentCount = attachmentCount;
		 attachmentCount0(this.ptr,  attachmentCount);
	 }

	/**
	 * Get method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 public int attachmentCount(){
		 int var = attachmentCount0(super.ptr);
		 this.attachmentCount = var;
		 return this.attachmentCount;
	 }

	/**
	 * Set method for field pAttachments	[vkhandle]<br>
	 * Prototype: const VkImageView*  pAttachments
	 */ 
	 public void pAttachments( VkImageView  pAttachments){
		 this.pAttachments = pAttachments;
		 ByteBuffer buff = (pAttachments==null) ? null : pAttachments.getHandle();
		 pAttachments0(this.ptr, buff);
	 }

	/**
	 * Get method for field pAttachments	[vkhandle]<br>
	 * Prototype: const VkImageView*  pAttachments
	 */ 
	 public  VkImageView  pAttachments(){

		 ByteBuffer handle = pAttachments0(super.ptr);
		 if(handle == null){
		    this.pAttachments = null;
		    return null;
		  } else 
 		 if(this.pAttachments == null){
		    this.pAttachments = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.pAttachments).setHandle(handle);
		  }
		 return this.pAttachments;
	 }

	/**
	 * Set method for field width	[int]<br>
	 * Prototype: uint32_t  width
	 */ 
	 public void width(int width){
		 this.width = width;
		 width0(this.ptr,  width);
	 }

	/**
	 * Get method for field width	[int]<br>
	 * Prototype: uint32_t  width
	 */ 
	 public int width(){
		 int var = width0(super.ptr);
		 this.width = var;
		 return this.width;
	 }

	/**
	 * Set method for field height	[int]<br>
	 * Prototype: uint32_t  height
	 */ 
	 public void height(int height){
		 this.height = height;
		 height0(this.ptr,  height);
	 }

	/**
	 * Get method for field height	[int]<br>
	 * Prototype: uint32_t  height
	 */ 
	 public int height(){
		 int var = height0(super.ptr);
		 this.height = var;
		 return this.height;
	 }

	/**
	 * Set method for field layers	[int]<br>
	 * Prototype: uint32_t  layers
	 */ 
	 public void layers(int layers){
		 this.layers = layers;
		 layers0(this.ptr,  layers);
	 }

	/**
	 * Get method for field layers	[int]<br>
	 * Prototype: uint32_t  layers
	 */ 
	 public int layers(){
		 int var = layers0(super.ptr);
		 this.layers = var;
		 return this.layers;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkFramebufferCreateInfo vkObj = (VkFramebufferCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkFramebufferCreateInfo vkObj = (VkFramebufferCreateInfo*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkFramebufferCreateFlags  flags
	 */ 
	 private static native void flags0(Buffer ptr, int _flags);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		  vkObj->flags = (VkFramebufferCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkFramebufferCreateFlags  flags
	 */ 
	 private static native int flags0(Buffer ptr);/*
		  VkFramebufferCreateInfo vkObj = (VkFramebufferCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native void renderPass0(Buffer ptr, java.nio.ByteBuffer  _renderPass);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		  vkObj->renderPass = (VkRenderPass) (_renderPass);
	  */

	/**
	 * native GET method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native java.nio.ByteBuffer  renderPass0(Buffer ptr);/*
		  VkFramebufferCreateInfo vkObj = (VkFramebufferCreateInfo*)(ptr);
		  return (VkRenderPass) (vkObj->renderPass);
	 */

	/**
	 * native SET method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 private static native void attachmentCount0(Buffer ptr, int _attachmentCount);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		  vkObj->attachmentCount = (uint32_t) (_attachmentCount);
	  */

	/**
	 * native GET method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 private static native int attachmentCount0(Buffer ptr);/*
		  VkFramebufferCreateInfo vkObj = (VkFramebufferCreateInfo*)(ptr);
		  return (jint) (vkObj->attachmentCount);
	 */

	/**
	 * native SET method for field pAttachments	[vkhandle]<br>
	 * Prototype: const VkImageView*  pAttachments
	 */ 
	 private static native void pAttachments0(Buffer ptr, java.nio.ByteBuffer  _pAttachments);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		  vkObj->pAttachments = (const VkImageView*) (_pAttachments);
	  */

	/**
	 * native GET method for field pAttachments	[vkhandle]<br>
	 * Prototype: const VkImageView*  pAttachments
	 */ 
	 private static native java.nio.ByteBuffer  pAttachments0(Buffer ptr);/*
		  VkFramebufferCreateInfo vkObj = (VkFramebufferCreateInfo*)(ptr);
		  return ( VkImageView ) (vkObj->pAttachments);
	 */

	/**
	 * native SET method for field width	[int]<br>
	 * Prototype: uint32_t  width
	 */ 
	 private static native void width0(Buffer ptr, int _width);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		  vkObj->width = (uint32_t) (_width);
	  */

	/**
	 * native GET method for field width	[int]<br>
	 * Prototype: uint32_t  width
	 */ 
	 private static native int width0(Buffer ptr);/*
		  VkFramebufferCreateInfo vkObj = (VkFramebufferCreateInfo*)(ptr);
		  return (jint) (vkObj->width);
	 */

	/**
	 * native SET method for field height	[int]<br>
	 * Prototype: uint32_t  height
	 */ 
	 private static native void height0(Buffer ptr, int _height);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		  vkObj->height = (uint32_t) (_height);
	  */

	/**
	 * native GET method for field height	[int]<br>
	 * Prototype: uint32_t  height
	 */ 
	 private static native int height0(Buffer ptr);/*
		  VkFramebufferCreateInfo vkObj = (VkFramebufferCreateInfo*)(ptr);
		  return (jint) (vkObj->height);
	 */

	/**
	 * native SET method for field layers	[int]<br>
	 * Prototype: uint32_t  layers
	 */ 
	 private static native void layers0(Buffer ptr, int _layers);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		  vkObj->layers = (uint32_t) (_layers);
	  */

	/**
	 * native GET method for field layers	[int]<br>
	 * Prototype: uint32_t  layers
	 */ 
	 private static native int layers0(Buffer ptr);/*
		  VkFramebufferCreateInfo vkObj = (VkFramebufferCreateInfo*)(ptr);
		  return (jint) (vkObj->layers);
	 */



} // end of class VkFramebufferCreateInfo
