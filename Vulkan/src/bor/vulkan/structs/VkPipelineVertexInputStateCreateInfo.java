/**
 * Class wrapping Vulkan's VkPipelineVertexInputStateCreateInfo struct.
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
 *  This class is a Java front end for struct VkPipelineVertexInputStateCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPipelineVertexInputStateCreateInfo {
 *     VkStructureType                             sType;
 *     const void*                                 pNext;
 *     VkPipelineVertexInputStateCreateFlags       flags;
 *     uint32_t                                    vertexBindingDescriptionCount;
 *     const VkVertexInputBindingDescription*      pVertexBindingDescriptions;
 *     uint32_t                                    vertexAttributeDescriptionCount;
 *     const VkVertexInputAttributeDescription*    pVertexAttributeDescriptions;
 * } VkPipelineVertexInputStateCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkPipelineVertexInputStateCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [51]  */
	 private static final String TAG = "VkPipelineVertexInputStateCreateInfo";

	/** ID of this structure [51]  */
	 public static final int TAG_ID = VKPIPELINEVERTEXINPUTSTATECREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkPipelineVertexInputStateCreateInfo> p;

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
	 *  VkPipelineVertexInputStateCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  uint32_t 	vertexBindingDescriptionCount	[int]
	 */ 
	 int 	vertexBindingDescriptionCount;

	/**
	 *  const VkVertexInputBindingDescription* 	pVertexBindingDescriptions	[vkstruct]
	 */ 
	  VkVertexInputBindingDescription  	pVertexBindingDescriptions;

	/**
	 *  uint32_t 	vertexAttributeDescriptionCount	[int]
	 */ 
	 int 	vertexAttributeDescriptionCount;

	/**
	 *  const VkVertexInputAttributeDescription* 	pVertexAttributeDescriptions	[vkstruct]
	 */ 
	  VkVertexInputAttributeDescription  	pVertexAttributeDescriptions;

	/**
	 * Ctor
	 */
	public VkPipelineVertexInputStateCreateInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineVertexInputStateCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkPipelineVertexInputStateCreateInfo(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPipelineVertexInputStateCreateInfo(long address){ 
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
	 public static P<VkPipelineVertexInputStateCreateInfo> createNullPointer(){
	        P<VkPipelineVertexInputStateCreateInfo> p = new  P<VkPipelineVertexInputStateCreateInfo>(new VkPipelineVertexInputStateCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkPipelineVertexInputStateCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkPipelineVertexInputStateCreateInfo> (this);
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
	 * Set method for field flags	[int]<br>
	 * Prototype: VkPipelineVertexInputStateCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkPipelineVertexInputStateCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field vertexBindingDescriptionCount	[int]<br>
	 * Prototype: uint32_t  vertexBindingDescriptionCount
	 */ 
	 public void vertexBindingDescriptionCount(int vertexBindingDescriptionCount){
		 this.vertexBindingDescriptionCount = vertexBindingDescriptionCount;
		 setVertexBindingDescriptionCount0(this.ptr,  vertexBindingDescriptionCount);
	 }

	/**
	 * Get method for field vertexBindingDescriptionCount	[int]<br>
	 * Prototype: uint32_t  vertexBindingDescriptionCount
	 */ 
	 public int vertexBindingDescriptionCount(){
		 int var = getVertexBindingDescriptionCount0(super.ptr);
		 this.vertexBindingDescriptionCount = var;
		 return this.vertexBindingDescriptionCount;
	 }

	/**
	 * Set method for field pVertexBindingDescriptions	[vkstruct]<br>
	 * Prototype: const VkVertexInputBindingDescription*  pVertexBindingDescriptions
	 */ 
	 public void pVertexBindingDescriptions( VkVertexInputBindingDescription  pVertexBindingDescriptions){
		 this.pVertexBindingDescriptions = pVertexBindingDescriptions;
		 ByteBuffer buff = (pVertexBindingDescriptions==null) ? null : pVertexBindingDescriptions.getPointer();
		 setPVertexBindingDescriptions0(this.ptr, buff);
	 }

	/**
	 * Get method for field pVertexBindingDescriptions	[vkstruct]<br>
	 * Prototype: const VkVertexInputBindingDescription*  pVertexBindingDescriptions
	 */ 
	 public  VkVertexInputBindingDescription  pVertexBindingDescriptions(){
		 long pointer = getPVertexBindingDescriptions0(super.ptr);
		 if(pointer == 0){
		    this.pVertexBindingDescriptions = null;
		    return null;
		  } 

		 if(this.pVertexBindingDescriptions == null){
		    this.pVertexBindingDescriptions = new  VkVertexInputBindingDescription (pointer);
		 }else{
		    this.pVertexBindingDescriptions.setPointer(pointer);
		  }
		 return this.pVertexBindingDescriptions;
	 }

	/**
	 * Set method for field vertexAttributeDescriptionCount	[int]<br>
	 * Prototype: uint32_t  vertexAttributeDescriptionCount
	 */ 
	 public void vertexAttributeDescriptionCount(int vertexAttributeDescriptionCount){
		 this.vertexAttributeDescriptionCount = vertexAttributeDescriptionCount;
		 setVertexAttributeDescriptionCount0(this.ptr,  vertexAttributeDescriptionCount);
	 }

	/**
	 * Get method for field vertexAttributeDescriptionCount	[int]<br>
	 * Prototype: uint32_t  vertexAttributeDescriptionCount
	 */ 
	 public int vertexAttributeDescriptionCount(){
		 int var = getVertexAttributeDescriptionCount0(super.ptr);
		 this.vertexAttributeDescriptionCount = var;
		 return this.vertexAttributeDescriptionCount;
	 }

	/**
	 * Set method for field pVertexAttributeDescriptions	[vkstruct]<br>
	 * Prototype: const VkVertexInputAttributeDescription*  pVertexAttributeDescriptions
	 */ 
	 public void pVertexAttributeDescriptions( VkVertexInputAttributeDescription  pVertexAttributeDescriptions){
		 this.pVertexAttributeDescriptions = pVertexAttributeDescriptions;
		 ByteBuffer buff = (pVertexAttributeDescriptions==null) ? null : pVertexAttributeDescriptions.getPointer();
		 setPVertexAttributeDescriptions0(this.ptr, buff);
	 }

	/**
	 * Get method for field pVertexAttributeDescriptions	[vkstruct]<br>
	 * Prototype: const VkVertexInputAttributeDescription*  pVertexAttributeDescriptions
	 */ 
	 public  VkVertexInputAttributeDescription  pVertexAttributeDescriptions(){
		 long pointer = getPVertexAttributeDescriptions0(super.ptr);
		 if(pointer == 0){
		    this.pVertexAttributeDescriptions = null;
		    return null;
		  } 

		 if(this.pVertexAttributeDescriptions == null){
		    this.pVertexAttributeDescriptions = new  VkVertexInputAttributeDescription (pointer);
		 }else{
		    this.pVertexAttributeDescriptions.setPointer(pointer);
		  }
		 return this.pVertexAttributeDescriptions;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineVertexInputStateCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  vkObj->flags = (VkPipelineVertexInputStateCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineVertexInputStateCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field vertexBindingDescriptionCount	[int]<br>
	 * Prototype: uint32_t  vertexBindingDescriptionCount
	 */ 
	 private static native void setVertexBindingDescriptionCount0(Buffer ptr, int _vertexBindingDescriptionCount);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  vkObj->vertexBindingDescriptionCount = (uint32_t) (_vertexBindingDescriptionCount);
	  */

	/**
	 * native GET method for field vertexBindingDescriptionCount	[int]<br>
	 * Prototype: uint32_t  vertexBindingDescriptionCount
	 */ 
	 private static native int getVertexBindingDescriptionCount0(Buffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  return (jint) (vkObj->vertexBindingDescriptionCount);
	 */

	/**
	 * native SET method for field pVertexBindingDescriptions	[vkstruct]<br>
	 * Prototype: const VkVertexInputBindingDescription*  pVertexBindingDescriptions
	 */ 
	 private static native void setPVertexBindingDescriptions0(Buffer ptr, java.nio.ByteBuffer  _pVertexBindingDescriptions);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  vkObj->pVertexBindingDescriptions = (const VkVertexInputBindingDescription*) (_pVertexBindingDescriptions);
	  */

	/**
	 * native GET method for field pVertexBindingDescriptions	[vkstruct]<br>
	 * Prototype: const VkVertexInputBindingDescription*  pVertexBindingDescriptions
	 */ 
	 private static native long getPVertexBindingDescriptions0(Buffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pVertexBindingDescriptions);	 */

	/**
	 * native SET method for field vertexAttributeDescriptionCount	[int]<br>
	 * Prototype: uint32_t  vertexAttributeDescriptionCount
	 */ 
	 private static native void setVertexAttributeDescriptionCount0(Buffer ptr, int _vertexAttributeDescriptionCount);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  vkObj->vertexAttributeDescriptionCount = (uint32_t) (_vertexAttributeDescriptionCount);
	  */

	/**
	 * native GET method for field vertexAttributeDescriptionCount	[int]<br>
	 * Prototype: uint32_t  vertexAttributeDescriptionCount
	 */ 
	 private static native int getVertexAttributeDescriptionCount0(Buffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  return (jint) (vkObj->vertexAttributeDescriptionCount);
	 */

	/**
	 * native SET method for field pVertexAttributeDescriptions	[vkstruct]<br>
	 * Prototype: const VkVertexInputAttributeDescription*  pVertexAttributeDescriptions
	 */ 
	 private static native void setPVertexAttributeDescriptions0(Buffer ptr, java.nio.ByteBuffer  _pVertexAttributeDescriptions);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  vkObj->pVertexAttributeDescriptions = (const VkVertexInputAttributeDescription*) (_pVertexAttributeDescriptions);
	  */

	/**
	 * native GET method for field pVertexAttributeDescriptions	[vkstruct]<br>
	 * Prototype: const VkVertexInputAttributeDescription*  pVertexAttributeDescriptions
	 */ 
	 private static native long getPVertexAttributeDescriptions0(Buffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pVertexAttributeDescriptions);	 */



} // end of class VkPipelineVertexInputStateCreateInfo
