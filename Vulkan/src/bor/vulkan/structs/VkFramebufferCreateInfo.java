/**
 * Class wrapping Vulkan's VkFramebufferCreateInfo struct.
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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkFramebufferCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [80]  */
	 private static final String TAG = "VkFramebufferCreateInfo";

	/** ID of this structure [80]  */
	 public static final int TAG_ID = VKFRAMEBUFFERCREATEINFO_ID;

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
	 *  const VkImageView* 	pAttachments	[vkhandle_array_array]
	 */ 
	  VkImageView[]  	pAttachments;
	 private BigBuffer 	 pAttachmentsBUFFER;
	
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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkFramebufferCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkFramebufferCreateInfo(long address){ 
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
	 public VkFramebufferCreateInfo sType(VkStructureType sType){
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
	 public VkFramebufferCreateInfo pNext(VkObject pNext){
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
	 * Set method for field flags	[int]<br>
	 * Prototype: VkFramebufferCreateFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkFramebufferCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkFramebufferCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 * 
	 * @param renderPass - a instance of VkRenderPass.
	 * @return this VkStruct instance.
	 */ 
	 public VkFramebufferCreateInfo renderPass(VkRenderPass renderPass){
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
	 * Set method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 * 
	 * @param attachmentCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkFramebufferCreateInfo attachmentCount(int attachmentCount){
		 this.attachmentCount = attachmentCount;
		 setAttachmentCount0(this.ptr,  attachmentCount);
		 return this;
	 }

	/**
	 * Get method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 public int attachmentCount(){
		 int var = getAttachmentCount0(super.ptr);
		 this.attachmentCount = var;
		 return this.attachmentCount;
	 }

	/**
	 * Set method for field pAttachments	[vkhandle_array]<br>
	 * Prototype: const VkImageView*  pAttachments
	 * 
	 * @param pAttachments - a instance of VkImageView[].
	 * @return this VkStruct instance.
	 */ 
	 public VkFramebufferCreateInfo pAttachments(VkImageView[] pAttachments){
		 this.pAttachments = pAttachments;
		 this.pAttachmentsBUFFER = new BigBuffer(pAttachments, false);
		 setPAttachments0(this.ptr, pAttachmentsBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pAttachments	[vkhandle_array]<br>
	 * Prototype: const VkImageView*  pAttachments
	 */ 
	 public VkImageView[] pAttachments(){
		 long ptr = getPAttachments0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pAttachmentsBUFFER != null && ptr == pAttachmentsBUFFER.getBufferAddress()){ //same buffer 
		    pAttachmentsBUFFER.update();
		    return pAttachments;
		  }else{
		     (new UnsupportedOperationException("There is no VKHandle[] for backup.")).printStackTrace();
		   }
		 return this.pAttachments;
	 }

	/**
	 * Set method for field width	[int]<br>
	 * Prototype: uint32_t  width
	 * 
	 * @param width - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkFramebufferCreateInfo width(int width){
		 this.width = width;
		 setWidth0(this.ptr,  width);
		 return this;
	 }

	/**
	 * Get method for field width	[int]<br>
	 * Prototype: uint32_t  width
	 */ 
	 public int width(){
		 int var = getWidth0(super.ptr);
		 this.width = var;
		 return this.width;
	 }

	/**
	 * Set method for field height	[int]<br>
	 * Prototype: uint32_t  height
	 * 
	 * @param height - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkFramebufferCreateInfo height(int height){
		 this.height = height;
		 setHeight0(this.ptr,  height);
		 return this;
	 }

	/**
	 * Get method for field height	[int]<br>
	 * Prototype: uint32_t  height
	 */ 
	 public int height(){
		 int var = getHeight0(super.ptr);
		 this.height = var;
		 return this.height;
	 }

	/**
	 * Set method for field layers	[int]<br>
	 * Prototype: uint32_t  layers
	 * 
	 * @param layers - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkFramebufferCreateInfo layers(int layers){
		 this.layers = layers;
		 setLayers0(this.ptr,  layers);
		 return this;
	 }

	/**
	 * Get method for field layers	[int]<br>
	 * Prototype: uint32_t  layers
	 */ 
	 public int layers(){
		 int var = getLayers0(super.ptr);
		 this.layers = var;
		 return this.layers;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkFramebufferCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n renderPass: ")
				.append(renderPass() )
				.append(",\n attachmentCount: ")
				.append(attachmentCount() )
				.append(",\n pAttachments: ")
				.append(Arrays.toString(pAttachments()) )
				.append(",\n width: ")
				.append(width() )
				.append(",\n height: ")
				.append(height() )
				.append(",\n layers: ")
				.append(layers() )
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
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkFramebufferCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkFramebufferCreateFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkFramebufferCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native void setRenderPass0(Buffer ptr, long  _renderPass);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->renderPass = (VkRenderPass) (_renderPass);
	  */

	/**
	 * Native GET method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native long getRenderPass0(Buffer ptr);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->renderPass);
	 */

	/**
	 * Native SET method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 private static native void setAttachmentCount0(Buffer ptr, int _attachmentCount);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->attachmentCount = (uint32_t) (_attachmentCount);
	  */

	/**
	 * Native GET method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 private static native int getAttachmentCount0(Buffer ptr);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		  return (jint) (vkObj->attachmentCount);
	 */

	/**
	 * Native SET method for field pAttachments	[vkhandle_array]<br>
	 * Prototype: const VkImageView*  pAttachments
	 */ 
	 private static native void setPAttachments0(Buffer ptr, ByteBuffer  _pAttachments);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkImageView* p_pAttachments = ( VkImageView*) _pAttachments; 
		 vkObj->pAttachments = p_pAttachments; 
	  */

	/**
	 * Native GET method for field pAttachments	[vkhandle_array]<br>
	 * Prototype: const VkImageView*  pAttachments
	 */ 
	 private static native long getPAttachments0(Buffer ptr);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pAttachments );
	 */

	/**
	 * Native SET method for field width	[int]<br>
	 * Prototype: uint32_t  width
	 */ 
	 private static native void setWidth0(Buffer ptr, int _width);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->width = (uint32_t) (_width);
	  */

	/**
	 * Native GET method for field width	[int]<br>
	 * Prototype: uint32_t  width
	 */ 
	 private static native int getWidth0(Buffer ptr);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		  return (jint) (vkObj->width);
	 */

	/**
	 * Native SET method for field height	[int]<br>
	 * Prototype: uint32_t  height
	 */ 
	 private static native void setHeight0(Buffer ptr, int _height);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->height = (uint32_t) (_height);
	  */

	/**
	 * Native GET method for field height	[int]<br>
	 * Prototype: uint32_t  height
	 */ 
	 private static native int getHeight0(Buffer ptr);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		  return (jint) (vkObj->height);
	 */

	/**
	 * Native SET method for field layers	[int]<br>
	 * Prototype: uint32_t  layers
	 */ 
	 private static native void setLayers0(Buffer ptr, int _layers);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->layers = (uint32_t) (_layers);
	  */

	/**
	 * Native GET method for field layers	[int]<br>
	 * Prototype: uint32_t  layers
	 */ 
	 private static native int getLayers0(Buffer ptr);/*
		  VkFramebufferCreateInfo* vkObj = (VkFramebufferCreateInfo*)(ptr);
		  return (jint) (vkObj->layers);
	 */



} // end of class VkFramebufferCreateInfo
