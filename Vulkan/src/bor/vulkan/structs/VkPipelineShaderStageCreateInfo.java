/**
 * Class wrapping Vulkan's VkPipelineShaderStageCreateInfo struct.
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
 *  This class is a Java front end for struct VkPipelineShaderStageCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPipelineShaderStageCreateInfo {
 *     VkStructureType                     sType;
 *     const void*                         pNext;
 *     VkPipelineShaderStageCreateFlags    flags;
 *     VkShaderStageFlagBits               stage;
 *     VkShaderModule                      module;
 *     const char*                         pName;
 *     const VkSpecializationInfo*         pSpecializationInfo;
 * } VkPipelineShaderStageCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkPipelineShaderStageCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [48]  */
	 private static final String TAG = "VkPipelineShaderStageCreateInfo";

	/** ID of this structure [48]  */
	 public static final int TAG_ID = VKPIPELINESHADERSTAGECREATEINFO_ID;

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
	 *  VkPipelineShaderStageCreateFlags 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  VkShaderStageFlagBits 	stage	[vkenum]
	 */ 
	VkShaderStageFlagBits 	stage;
	
	/**
	 *  VkShaderModule 	module	[vkhandle]
	 */ 
	VkShaderModule 	module;
	
	/**
	 *  const char* 	pName	[string]
	 */ 
	String 	pName;
	
	/**
	 *  const VkSpecializationInfo* 	pSpecializationInfo	[vkstruct]
	 */ 
	VkSpecializationInfo  	pSpecializationInfo;
	/**
	 * Ctor
	 */
	public VkPipelineShaderStageCreateInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineShaderStageCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPipelineShaderStageCreateInfo(long address){ 
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
	 public VkPipelineShaderStageCreateInfo sType(VkStructureType sType){
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
	 public VkPipelineShaderStageCreateInfo pNext(VkObject pNext){
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
	 * Prototype: VkPipelineShaderStageCreateFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineShaderStageCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkPipelineShaderStageCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field stage	[vkenum]<br>
	 * Prototype: VkShaderStageFlagBits  stage
	 * 
	 * @param stage - a instance of VkShaderStageFlagBits.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineShaderStageCreateInfo stage(VkShaderStageFlagBits stage){
		 this.stage = stage;
		 int enumVal = stage.getValue();
		 setStage0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field stage	[vkenum]<br>
	 * Prototype: VkShaderStageFlagBits  stage
	 */ 
	 public VkShaderStageFlagBits stage(){
		 int nativeVal = getStage0(super.ptr);
		 this.stage = VkShaderStageFlagBits.fromValue(nativeVal); 
		 return this.stage;
	 }

	/**
	 * Set method for field module	[vkhandle]<br>
	 * Prototype: VkShaderModule  module
	 * 
	 * @param module - a instance of VkShaderModule.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineShaderStageCreateInfo module(VkShaderModule module){
		 this.module = module;
		 long handle = (module==null) ? 0L : module.getNativeHandle();
		 setModule0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field module	[vkhandle]<br>
	 * Prototype: VkShaderModule  module
	 */ 
	 public VkShaderModule module(){

		 long handle = getModule0(super.ptr);
		 if(handle == 0){
		    this.module = null;
		    return null;
		  }  

		 if(this.module == null){
		    this.module = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.module).setNativeHandle(handle);
		  }
		 return this.module;
	 }

	/**
	 * Set method for field pName	[string]<br>
	 * Prototype: const char*  pName
	 * 
	 * @param pName - a instance of String.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineShaderStageCreateInfo pName(String pName){
		 this.pName = pName;
		 setPName0(this.ptr,  pName);
		 return this;
	 }

	/**
	 * Get method for field pName	[string]<br>
	 * Prototype: const char*  pName
	 */ 
	 public String pName(){
		 String var = getPName0(super.ptr);
		 this.pName = var;
		 return this.pName;
	 }

	/**
	 * Set method for field pSpecializationInfo	[vkstruct]<br>
	 * Prototype: const VkSpecializationInfo*  pSpecializationInfo
	 * 
	 * @param pSpecializationInfo - a instance of VkSpecializationInfo.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineShaderStageCreateInfo pSpecializationInfo(VkSpecializationInfo pSpecializationInfo){
		 this.pSpecializationInfo = pSpecializationInfo;
		 ByteBuffer buff = (pSpecializationInfo==null) ? null : pSpecializationInfo.getPointer();
		 setPSpecializationInfo0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field pSpecializationInfo	[vkstruct]<br>
	 * Prototype: const VkSpecializationInfo*  pSpecializationInfo
	 */ 
	 public VkSpecializationInfo pSpecializationInfo(){
		 long pointer = getPSpecializationInfo0(super.ptr);
		 if(pointer == 0){
		    this.pSpecializationInfo = null;
		    return null;
		  } 

		 if(this.pSpecializationInfo == null){
		    this.pSpecializationInfo = new VkSpecializationInfo(pointer);
		 }else{
		    this.pSpecializationInfo.setPointer(pointer);
		  }
		 return this.pSpecializationInfo;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkPipelineShaderStageCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n stage: ")
				.append(stage() )
				.append(",\n module: ")
				.append(module() )
				.append(",\n pName: ")
				.append(pName() )
				.append(",\n pSpecializationInfo: ")
				.append(pSpecializationInfo() )
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
		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineShaderStageCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineShaderStageCreateFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineShaderStageCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field stage	[vkenum]<br>
	 * Prototype: VkShaderStageFlagBits  stage
	 */ 
	 private static native void setStage0(Buffer ptr, int  _stage);/*
		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->stage = (VkShaderStageFlagBits) (_stage);
	  */

	/**
	 * Native GET method for field stage	[vkenum]<br>
	 * Prototype: VkShaderStageFlagBits  stage
	 */ 
	 private static native int getStage0(Buffer ptr);/*
		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->stage);
	 */

	/**
	 * Native SET method for field module	[vkhandle]<br>
	 * Prototype: VkShaderModule  module
	 */ 
	 private static native void setModule0(Buffer ptr, long  _module);/*
		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->module = (VkShaderModule) (_module);
	  */

	/**
	 * Native GET method for field module	[vkhandle]<br>
	 * Prototype: VkShaderModule  module
	 */ 
	 private static native long getModule0(Buffer ptr);/*
		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->module);
	 */

	/**
	 * Native SET method for field pName	[string]<br>
	 * Prototype: const char*  pName
	 */ 
	 private static native void setPName0(Buffer ptr, String _pName);/*
		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  vkObj->pName = cloneStr(_pName);
	  */

	/**
	 * Native GET method for field pName	[string]<br>
	 * Prototype: const char*  pName
	 */ 
	 private static native String getPName0(Buffer ptr);/*
		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->pName));
	 */

	/**
	 * Native SET method for field pSpecializationInfo	[vkstruct]<br>
	 * Prototype: const VkSpecializationInfo*  pSpecializationInfo
	 */ 
	 private static native void setPSpecializationInfo0(Buffer ptr, java.nio.ByteBuffer  _pSpecializationInfo);/*
		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkSpecializationInfo* p_pSpecializationInfo = ( VkSpecializationInfo*) _pSpecializationInfo; 
		 vkObj->pSpecializationInfo = p_pSpecializationInfo; 
	  */

	/**
	 * Native GET method for field pSpecializationInfo	[vkstruct]<br>
	 * Prototype: const VkSpecializationInfo*  pSpecializationInfo
	 */ 
	 private static native long getPSpecializationInfo0(Buffer ptr);/*
		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pSpecializationInfo);
	 */



} // end of class VkPipelineShaderStageCreateInfo
