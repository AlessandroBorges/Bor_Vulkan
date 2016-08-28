/**
 * Class wrapping Vulkan's VkRenderPassBeginInfo struct.
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
 * @version Ver. 0.8.65 (beta) 
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
	 *  const VkClearValue* 	pClearValues	[vkstruct_array_array]
	 */ 
	  VkClearValue[]  	pClearValues;
	 private BigBuffer 	 pClearValuesBUFFER;
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	/** 
	 * Static method to create a VkArray for this VkStruct subclass.
	 * @param size - number of elements
	 */
	 public static VkArray<VkRenderPassBeginInfo> createVkArray(int size){ 
		 VkRenderPassBeginInfo[] array = new VkRenderPassBeginInfo[size]; 
		 VkArrayStruct<VkRenderPassBeginInfo> vkArray = new VkArrayStruct<VkRenderPassBeginInfo> (array, TAG_ID);
		 return vkArray; 
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
	 public VkRenderPassBeginInfo sType(VkStructureType sType){
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
	 public VkRenderPassBeginInfo pNext(VkObject pNext){
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
	 public VkRenderPassBeginInfo renderPass(VkRenderPass renderPass){
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
	 * Set method for field framebuffer	[vkhandle]<br>
	 * Prototype: VkFramebuffer  framebuffer
	 * 
	 * @param framebuffer - a instance of VkFramebuffer.
	 * @return this VkStruct instance.
	 */ 
	 public VkRenderPassBeginInfo framebuffer(VkFramebuffer framebuffer){
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
	 * Set method for field renderArea	[vkstruct]<br>
	 * Prototype: VkRect2D  renderArea
	 * 
	 * @param renderArea - a instance of VkRect2D.
	 * @return this VkStruct instance.
	 */ 
	 public VkRenderPassBeginInfo renderArea(VkRect2D renderArea){
		 this.renderArea = renderArea;
		 ByteBuffer buff = (renderArea==null) ? null : renderArea.getPointer();
		 setRenderArea0(this.ptr, buff);
		 return this;
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
	 * 
	 * @param clearValueCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkRenderPassBeginInfo clearValueCount(int clearValueCount){
		 this.clearValueCount = clearValueCount;
		 setClearValueCount0(this.ptr,  clearValueCount);
		 return this;
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
	 * Set method for field pClearValues	[vkstruct_array]<br>
	 * Prototype: const VkClearValue*  pClearValues
	 * 
	 * @param pClearValues - a instance of VkClearValue[].
	 * @return this VkStruct instance.
	 */ 
	 public VkRenderPassBeginInfo pClearValues(VkClearValue[] pClearValues){
		 this.pClearValues = pClearValues;
		 this.pClearValuesBUFFER = new BigBuffer(pClearValues, VkClearValue.getID());
		 setPClearValues0(this.ptr, pClearValuesBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pClearValues	[vkstruct_array]<br>
	 * Prototype: const VkClearValue*  pClearValues
	 */ 
	 public VkClearValue[] pClearValues(){
		 long ptr = getPClearValues0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pClearValuesBUFFER != null && ptr == pClearValuesBUFFER.getBufferAddress()){ //same buffer 
		    pClearValuesBUFFER.update();
		    return pClearValues;
		  }else{
		     (new UnsupportedOperationException("There is no VKStruct[] for backup.")).printStackTrace();
		   }
		 return this.pClearValues;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkRenderPassBeginInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n renderPass: ")
				.append(renderPass() )
				.append(",\n framebuffer: ")
				.append(framebuffer() )
				.append(",\n renderArea: ")
				.append(renderArea() )
				.append(",\n clearValueCount: ")
				.append(clearValueCount() )
				.append(",\n pClearValues: ")
				.append(Arrays.toString(pClearValues()) )
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
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native void setRenderPass0(Buffer ptr, long  _renderPass);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		 // code for simple past value 
		  vkObj->renderPass = (VkRenderPass) (_renderPass);
	  */

	/**
	 * Native GET method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native long getRenderPass0(Buffer ptr);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->renderPass);
	 */

	/**
	 * Native SET method for field framebuffer	[vkhandle]<br>
	 * Prototype: VkFramebuffer  framebuffer
	 */ 
	 private static native void setFramebuffer0(Buffer ptr, long  _framebuffer);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		 // code for simple past value 
		  vkObj->framebuffer = (VkFramebuffer) (_framebuffer);
	  */

	/**
	 * Native GET method for field framebuffer	[vkhandle]<br>
	 * Prototype: VkFramebuffer  framebuffer
	 */ 
	 private static native long getFramebuffer0(Buffer ptr);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->framebuffer);
	 */

	/**
	 * Native SET method for field renderArea	[vkstruct]<br>
	 * Prototype: VkRect2D  renderArea
	 */ 
	 private static native void setRenderArea0(Buffer ptr, java.nio.ByteBuffer  _renderArea);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkRect2D* p_renderArea = (VkRect2D*) _renderArea; 
		 vkObj->renderArea = (*p_renderArea); 
	  */

	/**
	 * Native GET method for field renderArea	[vkstruct]<br>
	 * Prototype: VkRect2D  renderArea
	 */ 
	 private static native long getRenderArea0(Buffer ptr);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->renderArea);
	 */

	/**
	 * Native SET method for field clearValueCount	[int]<br>
	 * Prototype: uint32_t  clearValueCount
	 */ 
	 private static native void setClearValueCount0(Buffer ptr, int _clearValueCount);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		 // code for simple past value 
		  vkObj->clearValueCount = (uint32_t) (_clearValueCount);
	  */

	/**
	 * Native GET method for field clearValueCount	[int]<br>
	 * Prototype: uint32_t  clearValueCount
	 */ 
	 private static native int getClearValueCount0(Buffer ptr);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  return (jint) (vkObj->clearValueCount);
	 */

	/**
	 * Native SET method for field pClearValues	[vkstruct_array]<br>
	 * Prototype: const VkClearValue*  pClearValues
	 */ 
	 private static native void setPClearValues0(Buffer ptr, java.nio.ByteBuffer  _pClearValues);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkClearValue* p_pClearValues = ( VkClearValue*) _pClearValues; 
		 vkObj->pClearValues = p_pClearValues; 
	  */

	/**
	 * Native GET method for field pClearValues	[vkstruct_array]<br>
	 * Prototype: const VkClearValue*  pClearValues
	 */ 
	 private static native long getPClearValues0(Buffer ptr);/*
		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pClearValues );
	 */



} // end of class VkRenderPassBeginInfo
