/**
 * Class wrapping Vulkan's VkCommandBufferInheritanceInfo struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.65 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
 package bor.vulkan.structs;

 import bor.util.*;
 import bor.vulkan.*;
 import static bor.vulkan.Vulkan.*; 
 import bor.vulkan.enumerations.*;

 import java.util.*;
 import java.nio.*;


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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkCommandBufferInheritanceInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [88]  */
	 private static final String TAG = "VkCommandBufferInheritanceInfo";

	/** ID of this structure [88]  */
	 public static final int TAG_ID = VKCOMMANDBUFFERINHERITANCEINFO_ID;

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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkCommandBufferInheritanceInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkCommandBufferInheritanceInfo(long address){ 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 * 
	 * @param sType - a instance of VkStructureType.
	 * @return this VkStruct instance.
	 */ 
	 public VkCommandBufferInheritanceInfo sType(VkStructureType sType){
		 this.sType = sType;
		 int enumVal = sType.getValue();
		 setSType0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param pNext - a instance of VkObject.
	 * @return this VkStruct instance.
	 */ 
	 public VkCommandBufferInheritanceInfo pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 setPNext0(this.ptr, buff);
		 return this;
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
	 * 
	 * @param renderPass - a instance of VkRenderPass.
	 * @return this VkStruct instance.
	 */ 
	 public VkCommandBufferInheritanceInfo renderPass(VkRenderPass renderPass){
		 this.renderPass = renderPass;
		 long handle = (renderPass==null) ? 0L : renderPass.getNativeHandle();
		 setRenderPass0(this.ptr, handle);
		 return this;
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
		    ((VkHandle)this.renderPass).setNativeHandle(handle);
		  }
		 return this.renderPass;
	 }

	/**
	 * Set method for field subpass	[int]<br>
	 * Prototype: uint32_t  subpass
	 * 
	 * @param subpass - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkCommandBufferInheritanceInfo subpass(int subpass){
		 this.subpass = subpass;
		 setSubpass0(this.ptr,  subpass);
		 return this;
	 }

	/**
	 * Get method for field subpass	[int]<br>
	 * Prototype: uint32_t  subpass
	 */ 
	 public int subpass(){
		 int var = getSubpass0(super.ptr);
		 this.subpass = var;
		 return this.subpass;
	 }

	/**
	 * Set method for field framebuffer	[vkhandle]<br>
	 * Prototype: VkFramebuffer  framebuffer
	 * 
	 * @param framebuffer - a instance of VkFramebuffer.
	 * @return this VkStruct instance.
	 */ 
	 public VkCommandBufferInheritanceInfo framebuffer(VkFramebuffer framebuffer){
		 this.framebuffer = framebuffer;
		 long handle = (framebuffer==null) ? 0L : framebuffer.getNativeHandle();
		 setFramebuffer0(this.ptr, handle);
		 return this;
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
		    ((VkHandle)this.framebuffer).setNativeHandle(handle);
		  }
		 return this.framebuffer;
	 }

	/**
	 * Set method for field occlusionQueryEnable	[boolean]<br>
	 * Prototype: VkBool32  occlusionQueryEnable
	 * 
	 * @param occlusionQueryEnable - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkCommandBufferInheritanceInfo occlusionQueryEnable(boolean occlusionQueryEnable){
		 this.occlusionQueryEnable = occlusionQueryEnable;
		 setOcclusionQueryEnable0(this.ptr,  occlusionQueryEnable);
		 return this;
	 }

	/**
	 * Get method for field occlusionQueryEnable	[boolean]<br>
	 * Prototype: VkBool32  occlusionQueryEnable
	 */ 
	 public boolean occlusionQueryEnable(){
		 boolean var = getOcclusionQueryEnable0(super.ptr);
		 this.occlusionQueryEnable = var;
		 return this.occlusionQueryEnable;
	 }

	/**
	 * Set method for field queryFlags	[int]<br>
	 * Prototype: VkQueryControlFlags  queryFlags
	 * 
	 * @param queryFlags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkCommandBufferInheritanceInfo queryFlags(int queryFlags){
		 this.queryFlags = queryFlags;
		 setQueryFlags0(this.ptr,  queryFlags);
		 return this;
	 }

	/**
	 * Get method for field queryFlags	[int]<br>
	 * Prototype: VkQueryControlFlags  queryFlags
	 */ 
	 public int queryFlags(){
		 int var = getQueryFlags0(super.ptr);
		 this.queryFlags = var;
		 return this.queryFlags;
	 }

	/**
	 * Set method for field pipelineStatistics	[int]<br>
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 * 
	 * @param pipelineStatistics - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkCommandBufferInheritanceInfo pipelineStatistics(int pipelineStatistics){
		 this.pipelineStatistics = pipelineStatistics;
		 setPipelineStatistics0(this.ptr,  pipelineStatistics);
		 return this;
	 }

	/**
	 * Get method for field pipelineStatistics	[int]<br>
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 */ 
	 public int pipelineStatistics(){
		 int var = getPipelineStatistics0(super.ptr);
		 this.pipelineStatistics = var;
		 return this.pipelineStatistics;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkCommandBufferInheritanceInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n renderPass: ")
				.append(renderPass() )
				.append(",\n subpass: ")
				.append(subpass() )
				.append(",\n framebuffer: ")
				.append(framebuffer() )
				.append(",\n occlusionQueryEnable: ")
				.append(occlusionQueryEnable() )
				.append(",\n queryFlags: ")
				.append(queryFlags() )
				.append(",\n pipelineStatistics: ")
				.append(pipelineStatistics() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native void setRenderPass0(Buffer ptr, long  _renderPass);/*
		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		 // code for simple past value 
		  vkObj->renderPass = (VkRenderPass) (_renderPass);
	  */

	/**
	 * Native GET method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native long getRenderPass0(Buffer ptr);/*
		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->renderPass);
	 */

	/**
	 * Native SET method for field subpass	[int]<br>
	 * Prototype: uint32_t  subpass
	 */ 
	 private static native void setSubpass0(Buffer ptr, int _subpass);/*
		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		 // code for simple past value 
		  vkObj->subpass = (uint32_t) (_subpass);
	  */

	/**
	 * Native GET method for field subpass	[int]<br>
	 * Prototype: uint32_t  subpass
	 */ 
	 private static native int getSubpass0(Buffer ptr);/*
		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  return (jint) (vkObj->subpass);
	 */

	/**
	 * Native SET method for field framebuffer	[vkhandle]<br>
	 * Prototype: VkFramebuffer  framebuffer
	 */ 
	 private static native void setFramebuffer0(Buffer ptr, long  _framebuffer);/*
		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		 // code for simple past value 
		  vkObj->framebuffer = (VkFramebuffer) (_framebuffer);
	  */

	/**
	 * Native GET method for field framebuffer	[vkhandle]<br>
	 * Prototype: VkFramebuffer  framebuffer
	 */ 
	 private static native long getFramebuffer0(Buffer ptr);/*
		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->framebuffer);
	 */

	/**
	 * Native SET method for field occlusionQueryEnable	[boolean]<br>
	 * Prototype: VkBool32  occlusionQueryEnable
	 */ 
	 private static native void setOcclusionQueryEnable0(Buffer ptr, boolean  _occlusionQueryEnable);/*
		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		 // code for simple past value 
		  vkObj->occlusionQueryEnable = (VkBool32) (_occlusionQueryEnable);
	  */

	/**
	 * Native GET method for field occlusionQueryEnable	[boolean]<br>
	 * Prototype: VkBool32  occlusionQueryEnable
	 */ 
	 private static native boolean  getOcclusionQueryEnable0(Buffer ptr);/*
		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  return (jboolean) (vkObj->occlusionQueryEnable);
	 */

	/**
	 * Native SET method for field queryFlags	[int]<br>
	 * Prototype: VkQueryControlFlags  queryFlags
	 */ 
	 private static native void setQueryFlags0(Buffer ptr, int _queryFlags);/*
		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		 // code for simple past value 
		  vkObj->queryFlags = (VkQueryControlFlags) (_queryFlags);
	  */

	/**
	 * Native GET method for field queryFlags	[int]<br>
	 * Prototype: VkQueryControlFlags  queryFlags
	 */ 
	 private static native int getQueryFlags0(Buffer ptr);/*
		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  return (jint) (vkObj->queryFlags);
	 */

	/**
	 * Native SET method for field pipelineStatistics	[int]<br>
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 */ 
	 private static native void setPipelineStatistics0(Buffer ptr, int _pipelineStatistics);/*
		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		 // code for simple past value 
		  vkObj->pipelineStatistics = (VkQueryPipelineStatisticFlags) (_pipelineStatistics);
	  */

	/**
	 * Native GET method for field pipelineStatistics	[int]<br>
	 * Prototype: VkQueryPipelineStatisticFlags  pipelineStatistics
	 */ 
	 private static native int getPipelineStatistics0(Buffer ptr);/*
		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  return (jint) (vkObj->pipelineStatistics);
	 */



} // end of class VkCommandBufferInheritanceInfo
