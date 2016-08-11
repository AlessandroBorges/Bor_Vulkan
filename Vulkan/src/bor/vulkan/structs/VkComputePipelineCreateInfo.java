/**
 * Class wrapping Vulkan's VkComputePipelineCreateInfo struct.
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
 *  This class is a Java front end for struct VkComputePipelineCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkComputePipelineCreateInfo {
 *     VkStructureType                    sType;
 *     const void*                        pNext;
 *     VkPipelineCreateFlags              flags;
 *     VkPipelineShaderStageCreateInfo    stage;
 *     VkPipelineLayout                   layout;
 *     VkPipeline                         basePipelineHandle;
 *     int32_t                            basePipelineIndex;
 * } VkComputePipelineCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkComputePipelineCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [67]  */
	 private static final String TAG = "VkComputePipelineCreateInfo";

	/** ID of this structure [67]  */
	 public static final int TAG_ID = VKCOMPUTEPIPELINECREATEINFO_ID;

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
	 *  VkPipelineCreateFlags 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  VkPipelineShaderStageCreateInfo 	stage	[vkstruct]
	 */ 
	VkPipelineShaderStageCreateInfo 	stage;
	
	/**
	 *  VkPipelineLayout 	layout	[vkhandle]
	 */ 
	VkPipelineLayout 	layout;
	
	/**
	 *  VkPipeline 	basePipelineHandle	[vkhandle]
	 */ 
	VkPipeline 	basePipelineHandle;
	
	/**
	 *  int32_t 	basePipelineIndex	[int]
	 */ 
	int 	basePipelineIndex;
	/**
	 * Ctor
	 */
	public VkComputePipelineCreateInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkComputePipelineCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkComputePipelineCreateInfo(long address){ 
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
	 public VkComputePipelineCreateInfo sType(VkStructureType sType){
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
	 public VkComputePipelineCreateInfo pNext(VkObject pNext){
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
	 * Prototype: VkPipelineCreateFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkComputePipelineCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkPipelineCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field stage	[vkstruct]<br>
	 * Prototype: VkPipelineShaderStageCreateInfo  stage
	 * 
	 * @param stage - a instance of VkPipelineShaderStageCreateInfo.
	 * @return this VkStruct instance.
	 */ 
	 public VkComputePipelineCreateInfo stage(VkPipelineShaderStageCreateInfo stage){
		 this.stage = stage;
		 ByteBuffer buff = (stage==null) ? null : stage.getPointer();
		 setStage0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field stage	[vkstruct]<br>
	 * Prototype: VkPipelineShaderStageCreateInfo  stage
	 */ 
	 public VkPipelineShaderStageCreateInfo stage(){
		 long pointer = getStage0(super.ptr);
		 if(pointer == 0){
		    this.stage = null;
		    return null;
		  } 

		 if(this.stage == null){
		    this.stage = new VkPipelineShaderStageCreateInfo(pointer);
		 }else{
		    this.stage.setPointer(pointer);
		  }
		 return this.stage;
	 }

	/**
	 * Set method for field layout	[vkhandle]<br>
	 * Prototype: VkPipelineLayout  layout
	 * 
	 * @param layout - a instance of VkPipelineLayout.
	 * @return this VkStruct instance.
	 */ 
	 public VkComputePipelineCreateInfo layout(VkPipelineLayout layout){
		 this.layout = layout;
		 long handle = (layout==null) ? 0L : layout.getNativeHandle();
		 setLayout0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field layout	[vkhandle]<br>
	 * Prototype: VkPipelineLayout  layout
	 */ 
	 public VkPipelineLayout layout(){

		 long handle = getLayout0(super.ptr);
		 if(handle == 0){
		    this.layout = null;
		    return null;
		  }  

		 if(this.layout == null){
		    this.layout = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.layout).setNativeHandle(handle);
		  }
		 return this.layout;
	 }

	/**
	 * Set method for field basePipelineHandle	[vkhandle]<br>
	 * Prototype: VkPipeline  basePipelineHandle
	 * 
	 * @param basePipelineHandle - a instance of VkPipeline.
	 * @return this VkStruct instance.
	 */ 
	 public VkComputePipelineCreateInfo basePipelineHandle(VkPipeline basePipelineHandle){
		 this.basePipelineHandle = basePipelineHandle;
		 long handle = (basePipelineHandle==null) ? 0L : basePipelineHandle.getNativeHandle();
		 setBasePipelineHandle0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field basePipelineHandle	[vkhandle]<br>
	 * Prototype: VkPipeline  basePipelineHandle
	 */ 
	 public VkPipeline basePipelineHandle(){

		 long handle = getBasePipelineHandle0(super.ptr);
		 if(handle == 0){
		    this.basePipelineHandle = null;
		    return null;
		  }  

		 if(this.basePipelineHandle == null){
		    this.basePipelineHandle = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.basePipelineHandle).setNativeHandle(handle);
		  }
		 return this.basePipelineHandle;
	 }

	/**
	 * Set method for field basePipelineIndex	[int]<br>
	 * Prototype: int32_t  basePipelineIndex
	 * 
	 * @param basePipelineIndex - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkComputePipelineCreateInfo basePipelineIndex(int basePipelineIndex){
		 this.basePipelineIndex = basePipelineIndex;
		 setBasePipelineIndex0(this.ptr,  basePipelineIndex);
		 return this;
	 }

	/**
	 * Get method for field basePipelineIndex	[int]<br>
	 * Prototype: int32_t  basePipelineIndex
	 */ 
	 public int basePipelineIndex(){
		 int var = getBasePipelineIndex0(super.ptr);
		 this.basePipelineIndex = var;
		 return this.basePipelineIndex;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkComputePipelineCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n stage: ")
				.append(stage() )
				.append(",\n layout: ")
				.append(layout() )
				.append(",\n basePipelineHandle: ")
				.append(basePipelineHandle() )
				.append(",\n basePipelineIndex: ")
				.append(basePipelineIndex() )
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
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineCreateFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field stage	[vkstruct]<br>
	 * Prototype: VkPipelineShaderStageCreateInfo  stage
	 */ 
	 private static native void setStage0(Buffer ptr, java.nio.ByteBuffer  _stage);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->stage = (VkPipelineShaderStageCreateInfo) (_stage);
	  */

	/**
	 * Native GET method for field stage	[vkstruct]<br>
	 * Prototype: VkPipelineShaderStageCreateInfo  stage
	 */ 
	 private static native long getStage0(Buffer ptr);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->stage);
	 */

	/**
	 * Native SET method for field layout	[vkhandle]<br>
	 * Prototype: VkPipelineLayout  layout
	 */ 
	 private static native void setLayout0(Buffer ptr, long  _layout);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->layout = (VkPipelineLayout) (_layout);
	  */

	/**
	 * Native GET method for field layout	[vkhandle]<br>
	 * Prototype: VkPipelineLayout  layout
	 */ 
	 private static native long getLayout0(Buffer ptr);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->layout);
	 */

	/**
	 * Native SET method for field basePipelineHandle	[vkhandle]<br>
	 * Prototype: VkPipeline  basePipelineHandle
	 */ 
	 private static native void setBasePipelineHandle0(Buffer ptr, long  _basePipelineHandle);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->basePipelineHandle = (VkPipeline) (_basePipelineHandle);
	  */

	/**
	 * Native GET method for field basePipelineHandle	[vkhandle]<br>
	 * Prototype: VkPipeline  basePipelineHandle
	 */ 
	 private static native long getBasePipelineHandle0(Buffer ptr);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->basePipelineHandle);
	 */

	/**
	 * Native SET method for field basePipelineIndex	[int]<br>
	 * Prototype: int32_t  basePipelineIndex
	 */ 
	 private static native void setBasePipelineIndex0(Buffer ptr, int _basePipelineIndex);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->basePipelineIndex = (int32_t) (_basePipelineIndex);
	  */

	/**
	 * Native GET method for field basePipelineIndex	[int]<br>
	 * Prototype: int32_t  basePipelineIndex
	 */ 
	 private static native int getBasePipelineIndex0(Buffer ptr);/*
		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  return (jint) (vkObj->basePipelineIndex);
	 */



} // end of class VkComputePipelineCreateInfo
