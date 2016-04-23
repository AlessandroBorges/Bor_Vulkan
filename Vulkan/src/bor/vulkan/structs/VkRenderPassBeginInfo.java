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

import java.nio.Buffer;


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

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

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
	 *  const void* 	pNext	[vkobject]
	 */ 
	 VkObject 	pNext;

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
	 *  const VkClearValue* 	pClearValues	[vkstruct]
	 */ 
	  VkClearValue  	pClearValues;

	/**
	 * Ctor
	 */
	public VkRenderPassBeginInfo(){ 
		 super(TAG_ID);
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
	 public VkRenderPassBeginInfo(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkRenderPassBeginInfo(long address){ 
		 super(address); 
	 }

	/** 
	 * Static Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}

	/** 
	 * Method to get native size of this structure 
	 */
	 @Override
	 public int getSizeBytes(){ 
		 return sizeOf(); 
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
		 int enumVal = sType.getValue();
		 setSType0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = getSType0(super.ptr);
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
		 setPNext0(this.ptr, buff);
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 long pointer = getPNext0(super.ptr);
		 if(pointer == 0){
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
	 * Set method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 public void renderPass(VkRenderPass renderPass){
		 this.renderPass = renderPass;
		 ByteBuffer buff = (renderPass==null) ? null : renderPass.getPointer();
		 setRenderPass0(this.ptr, buff);
	 }

	/**
	 * Get method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 public VkRenderPass renderPass(){

		 long handle = getRenderPass0(super.ptr);
		 if(handle == 0){
		    this.renderPass = null;
		    return null;
		  }  

		 if(this.renderPass == null){
		    this.renderPass = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.renderPass).setPointer(handle);
		  }
		 return this.renderPass;
	 }

	/**
	 * Set method for field framebuffer	[vkhandle]<br>
	 * Prototype: VkFramebuffer  framebuffer
	 */ 
	 public void framebuffer(VkFramebuffer framebuffer){
		 this.framebuffer = framebuffer;
		 ByteBuffer buff = (framebuffer==null) ? null : framebuffer.getPointer();
		 setFramebuffer0(this.ptr, buff);
	 }

	/**
	 * Get method for field framebuffer	[vkhandle]<br>
	 * Prototype: VkFramebuffer  framebuffer
	 */ 
	 public VkFramebuffer framebuffer(){

		 long handle = getFramebuffer0(super.ptr);
		 if(handle == 0){
		    this.framebuffer = null;
		    return null;
		  }  

		 if(this.framebuffer == null){
		    this.framebuffer = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.framebuffer).setPointer(handle);
		  }
		 return this.framebuffer;
	 }

	/**
	 * Set method for field renderArea	[vkstruct]<br>
	 * Prototype: VkRect2D  renderArea
	 */ 
	 public void renderArea(VkRect2D renderArea){
		 this.renderArea = renderArea;
		 ByteBuffer buff = (renderArea==null) ? null : renderArea.getPointer();
		 setRenderArea0(this.ptr, buff);
	 }

	/**
	 * Get method for field renderArea	[vkstruct]<br>
	 * Prototype: VkRect2D  renderArea
	 */ 
	 public VkRect2D renderArea(){
		 long pointer = getRenderArea0(super.ptr);
		 if(pointer == 0){
		    this.renderArea = null;
		    return null;
		  } 

		 if(this.renderArea == null){
		    this.renderArea = new VkRect2D(pointer);
		 }else{
		    this.renderArea.setPointer(pointer);
		  }
		 return this.renderArea;
	 }

	/**
	 * Set method for field clearValueCount	[int]<br>
	 * Prototype: uint32_t  clearValueCount
	 */ 
	 public void clearValueCount(int clearValueCount){
		 this.clearValueCount = clearValueCount;
		 setClearValueCount0(this.ptr,  clearValueCount);
	 }

	/**
	 * Get method for field clearValueCount	[int]<br>
	 * Prototype: uint32_t  clearValueCount
	 */ 
	 public int clearValueCount(){
		 int var = getClearValueCount0(super.ptr);
		 this.clearValueCount = var;
		 return this.clearValueCount;
	 }

	/**
	 * Set method for field pClearValues	[vkstruct]<br>
	 * Prototype: const VkClearValue*  pClearValues
	 */ 
	 public void pClearValues( VkClearValue  pClearValues){
		 this.pClearValues = pClearValues;
		 ByteBuffer buff = (pClearValues==null) ? null : pClearValues.getPointer();
		 setPClearValues0(this.ptr, buff);
	 }

	/**
	 * Get method for field pClearValues	[vkstruct]<br>
	 * Prototype: const VkClearValue*  pClearValues
	 */ 
	 public  VkClearValue  pClearValues(){
		 long pointer = getPClearValues0(super.ptr);
		 if(pointer == 0){
		    this.pClearValues = null;
		    return null;
		  } 

		 if(this.pClearValues == null){
		    this.pClearValues = new  VkClearValue (pointer);
		 }else{
		    this.pClearValues.setPointer(pointer);
		  }
		 return this.pClearValues;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native void setRenderPass0(Buffer ptr, java.nio.ByteBuffer  _renderPass);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  vkObj->renderPass = (VkRenderPass) (_renderPass);
	  */

	/**
	 * native GET method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native long getRenderPass0(Buffer ptr);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->renderPass);	 */

	/**
	 * native SET method for field framebuffer	[vkhandle]<br>
	 * Prototype: VkFramebuffer  framebuffer
	 */ 
	 private static native void setFramebuffer0(Buffer ptr, java.nio.ByteBuffer  _framebuffer);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  vkObj->framebuffer = (VkFramebuffer) (_framebuffer);
	  */

	/**
	 * native GET method for field framebuffer	[vkhandle]<br>
	 * Prototype: VkFramebuffer  framebuffer
	 */ 
	 private static native long getFramebuffer0(Buffer ptr);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->framebuffer);	 */

	/**
	 * native SET method for field renderArea	[vkstruct]<br>
	 * Prototype: VkRect2D  renderArea
	 */ 
	 private static native void setRenderArea0(Buffer ptr, java.nio.ByteBuffer  _renderArea);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  vkObj->renderArea = (VkRect2D) (_renderArea);
	  */

	/**
	 * native GET method for field renderArea	[vkstruct]<br>
	 * Prototype: VkRect2D  renderArea
	 */ 
	 private static native long getRenderArea0(Buffer ptr);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->renderArea);	 */

	/**
	 * native SET method for field clearValueCount	[int]<br>
	 * Prototype: uint32_t  clearValueCount
	 */ 
	 private static native void setClearValueCount0(Buffer ptr, int _clearValueCount);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  vkObj->clearValueCount = (uint32_t) (_clearValueCount);
	  */

	/**
	 * native GET method for field clearValueCount	[int]<br>
	 * Prototype: uint32_t  clearValueCount
	 */ 
	 private static native int getClearValueCount0(Buffer ptr);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  return (jint) (vkObj->clearValueCount);
	 */

	/**
	 * native SET method for field pClearValues	[vkstruct]<br>
	 * Prototype: const VkClearValue*  pClearValues
	 */ 
	 private static native void setPClearValues0(Buffer ptr, java.nio.ByteBuffer  _pClearValues);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  vkObj->pClearValues = (const VkClearValue*) (_pClearValues);
	  */

	/**
	 * native GET method for field pClearValues	[vkstruct]<br>
	 * Prototype: const VkClearValue*  pClearValues
	 */ 
	 private static native long getPClearValues0(Buffer ptr);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pClearValues);	 */



} // end of class VkRenderPassBeginInfo
