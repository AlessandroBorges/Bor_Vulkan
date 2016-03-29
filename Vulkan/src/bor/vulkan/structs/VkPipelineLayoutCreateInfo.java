/**
 * Class wrapping Vulkan's VkPipelineLayoutCreateInfo struct.
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
 *  This class is a Java front end for struct VkPipelineLayoutCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPipelineLayoutCreateInfo {
 *     VkStructureType                 sType;
 *     const void*                     pNext;
 *     VkPipelineLayoutCreateFlags     flags;
 *     uint32_t                        setLayoutCount;
 *     const VkDescriptorSetLayout*    pSetLayouts;
 *     uint32_t                        pushConstantRangeCount;
 *     const VkPushConstantRange*      pPushConstantRanges;
 * } VkPipelineLayoutCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkPipelineLayoutCreateInfo extends VkStruct {
	/** TAG of this structure [69]  */
	 private static final String TAG = "VkPipelineLayoutCreateInfo";

	/** ID of this structure [69]  */
	 public static final int TAG_ID = VKPIPELINELAYOUTCREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkPipelineLayoutCreateInfo> p;

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
	 *  VkPipelineLayoutCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  uint32_t 	setLayoutCount	[int]
	 */ 
	 int 	setLayoutCount;

	/**
	 *  const VkDescriptorSetLayout* 	pSetLayouts	[vkhandle]
	 */ 
	  VkDescriptorSetLayout  	pSetLayouts;

	/**
	 *  uint32_t 	pushConstantRangeCount	[int]
	 */ 
	 int 	pushConstantRangeCount;

	/**
	 *  const VkPushConstantRange* 	pPushConstantRanges	[vkstruct]
	 */ 
	  VkPushConstantRange  	pPushConstantRanges;

	/**
	 * Ctor
	 */
	public VkPipelineLayoutCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineLayoutCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkPipelineLayoutCreateInfo(long address, int memSize){ 
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
	 public static P<VkPipelineLayoutCreateInfo> createNullPointer(){
	        P<VkPipelineLayoutCreateInfo> p = new  P<VkPipelineLayoutCreateInfo>(new VkPipelineLayoutCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkPipelineLayoutCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkPipelineLayoutCreateInfo> (this);
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
	 * Prototype: VkPipelineLayoutCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 flags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkPipelineLayoutCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = flags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field setLayoutCount	[int]<br>
	 * Prototype: uint32_t  setLayoutCount
	 */ 
	 public void setLayoutCount(int setLayoutCount){
		 this.setLayoutCount = setLayoutCount;
		 setLayoutCount0(this.ptr,  setLayoutCount);
	 }

	/**
	 * Get method for field setLayoutCount	[int]<br>
	 * Prototype: uint32_t  setLayoutCount
	 */ 
	 public int setLayoutCount(){
		 int var = setLayoutCount0(super.ptr);
		 this.setLayoutCount = var;
		 return this.setLayoutCount;
	 }

	/**
	 * Set method for field pSetLayouts	[vkhandle]<br>
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 public void pSetLayouts( VkDescriptorSetLayout  pSetLayouts){
		 this.pSetLayouts = pSetLayouts;
		 ByteBuffer buff = (pSetLayouts==null) ? null : pSetLayouts.getHandle();
		 pSetLayouts0(this.ptr, buff);
	 }

	/**
	 * Get method for field pSetLayouts	[vkhandle]<br>
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 public  VkDescriptorSetLayout  pSetLayouts(){

		 ByteBuffer handle = pSetLayouts0(super.ptr);
		 if(handle == null){
		    this.pSetLayouts = null;
		    return null;
		  } else 
 		 if(this.pSetLayouts == null){
		    this.pSetLayouts = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.pSetLayouts).setHandle(handle);
		  }
		 return this.pSetLayouts;
	 }

	/**
	 * Set method for field pushConstantRangeCount	[int]<br>
	 * Prototype: uint32_t  pushConstantRangeCount
	 */ 
	 public void pushConstantRangeCount(int pushConstantRangeCount){
		 this.pushConstantRangeCount = pushConstantRangeCount;
		 pushConstantRangeCount0(this.ptr,  pushConstantRangeCount);
	 }

	/**
	 * Get method for field pushConstantRangeCount	[int]<br>
	 * Prototype: uint32_t  pushConstantRangeCount
	 */ 
	 public int pushConstantRangeCount(){
		 int var = pushConstantRangeCount0(super.ptr);
		 this.pushConstantRangeCount = var;
		 return this.pushConstantRangeCount;
	 }

	/**
	 * Set method for field pPushConstantRanges	[vkstruct]<br>
	 * Prototype: const VkPushConstantRange*  pPushConstantRanges
	 */ 
	 public void pPushConstantRanges( VkPushConstantRange  pPushConstantRanges){
		 this.pPushConstantRanges = pPushConstantRanges;
		 ByteBuffer buff = (pPushConstantRanges==null) ? null : pPushConstantRanges.getPointerStruct();
		 pPushConstantRanges0(this.ptr, buff);
	 }

	/**
	 * Get method for field pPushConstantRanges	[vkstruct]<br>
	 * Prototype: const VkPushConstantRange*  pPushConstantRanges
	 */ 
	 public  VkPushConstantRange  pPushConstantRanges(){
		 ByteBuffer pointer = pPushConstantRanges0(super.ptr);
		 if(pointer == null){
		    this.pPushConstantRanges = null;
		    return null;
		  } else 
 		 if(this.pPushConstantRanges == null){
		    this.pPushConstantRanges = new  VkPushConstantRange (pointer);
		 }else{
		    this.pPushConstantRanges.setPointer(pointer);
		  }
		 return this.pPushConstantRanges;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkPipelineLayoutCreateInfo vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkPipelineLayoutCreateInfo vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineLayoutCreateFlags  flags
	 */ 
	 private static native void flags0(Buffer ptr, int _flags);/*
		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  vkObj->flags = (VkPipelineLayoutCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineLayoutCreateFlags  flags
	 */ 
	 private static native int flags0(Buffer ptr);/*
		  VkPipelineLayoutCreateInfo vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field setLayoutCount	[int]<br>
	 * Prototype: uint32_t  setLayoutCount
	 */ 
	 private static native void setLayoutCount0(Buffer ptr, int _setLayoutCount);/*
		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  vkObj->setLayoutCount = (uint32_t) (_setLayoutCount);
	  */

	/**
	 * native GET method for field setLayoutCount	[int]<br>
	 * Prototype: uint32_t  setLayoutCount
	 */ 
	 private static native int setLayoutCount0(Buffer ptr);/*
		  VkPipelineLayoutCreateInfo vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  return (jint) (vkObj->setLayoutCount);
	 */

	/**
	 * native SET method for field pSetLayouts	[vkhandle]<br>
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 private static native void pSetLayouts0(Buffer ptr, java.nio.ByteBuffer  _pSetLayouts);/*
		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  vkObj->pSetLayouts = (const VkDescriptorSetLayout*) (_pSetLayouts);
	  */

	/**
	 * native GET method for field pSetLayouts	[vkhandle]<br>
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 private static native java.nio.ByteBuffer  pSetLayouts0(Buffer ptr);/*
		  VkPipelineLayoutCreateInfo vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  return ( VkDescriptorSetLayout ) (vkObj->pSetLayouts);
	 */

	/**
	 * native SET method for field pushConstantRangeCount	[int]<br>
	 * Prototype: uint32_t  pushConstantRangeCount
	 */ 
	 private static native void pushConstantRangeCount0(Buffer ptr, int _pushConstantRangeCount);/*
		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  vkObj->pushConstantRangeCount = (uint32_t) (_pushConstantRangeCount);
	  */

	/**
	 * native GET method for field pushConstantRangeCount	[int]<br>
	 * Prototype: uint32_t  pushConstantRangeCount
	 */ 
	 private static native int pushConstantRangeCount0(Buffer ptr);/*
		  VkPipelineLayoutCreateInfo vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  return (jint) (vkObj->pushConstantRangeCount);
	 */

	/**
	 * native SET method for field pPushConstantRanges	[vkstruct]<br>
	 * Prototype: const VkPushConstantRange*  pPushConstantRanges
	 */ 
	 private static native void pPushConstantRanges0(Buffer ptr, java.nio.ByteBuffer  _pPushConstantRanges);/*
		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  vkObj->pPushConstantRanges = (const VkPushConstantRange*) (_pPushConstantRanges);
	  */

	/**
	 * native GET method for field pPushConstantRanges	[vkstruct]<br>
	 * Prototype: const VkPushConstantRange*  pPushConstantRanges
	 */ 
	 private static native java.nio.ByteBuffer  pPushConstantRanges0(Buffer ptr);/*
		  VkPipelineLayoutCreateInfo vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  return ( VkPushConstantRange ) (vkObj->pPushConstantRanges);
	 */



} // end of class VkPipelineLayoutCreateInfo
