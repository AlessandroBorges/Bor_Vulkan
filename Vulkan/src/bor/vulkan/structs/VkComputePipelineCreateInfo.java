/**
 * Class wrapping Vulkan's VkComputePipelineCreateInfo struct.
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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkComputePipelineCreateInfo extends VkStruct {
	/** TAG of this structure [67]  */
	 private static final String TAG = "VkComputePipelineCreateInfo";

	/** ID of this structure [67]  */
	 public static final int TAG_ID = VKCOMPUTEPIPELINECREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkComputePipelineCreateInfo> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkStructureType 	sType	[vkenum]
	 */ 
	 VkStructureType 	sType;

	/**
	 *  const void* 	pNext	[p]
	 */ 
	 P<VkObject> 	pNext;

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
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkComputePipelineCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkComputePipelineCreateInfo(long address, int memSize){ 
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
	 public static P<VkComputePipelineCreateInfo> createNullPointer(){
	        P<VkComputePipelineCreateInfo> p = new  P<VkComputePipelineCreateInfo>(new VkComputePipelineCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkComputePipelineCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkComputePipelineCreateInfo> (this);
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
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(P<VkObject> pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public P<VkObject> pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field flags	[int]<br>
	 * Prototype: VkPipelineCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkPipelineCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field stage	[vkstruct]<br>
	 * Prototype: VkPipelineShaderStageCreateInfo  stage
	 */ 
	 public void stage(VkPipelineShaderStageCreateInfo stage){
		 this.stage = stage;
		stage0(super.ptr, stage);
	 }

	/**
	 * get method for field stage	[vkstruct]<br>
	 * Prototype: VkPipelineShaderStageCreateInfo  stage
	 */ 
	 public VkPipelineShaderStageCreateInfo stage(){
		 // return  this.stage;
		 return stage0(super.ptr);
	 }

	/**
	 * Set method for field layout	[vkhandle]<br>
	 * Prototype: VkPipelineLayout  layout
	 */ 
	 public void layout(VkPipelineLayout layout){
		 this.layout = layout;
		layout0(super.ptr, layout);
	 }

	/**
	 * get method for field layout	[vkhandle]<br>
	 * Prototype: VkPipelineLayout  layout
	 */ 
	 public VkPipelineLayout layout(){
		 // return  this.layout;
		 return layout0(super.ptr);
	 }

	/**
	 * Set method for field basePipelineHandle	[vkhandle]<br>
	 * Prototype: VkPipeline  basePipelineHandle
	 */ 
	 public void basePipelineHandle(VkPipeline basePipelineHandle){
		 this.basePipelineHandle = basePipelineHandle;
		basePipelineHandle0(super.ptr, basePipelineHandle);
	 }

	/**
	 * get method for field basePipelineHandle	[vkhandle]<br>
	 * Prototype: VkPipeline  basePipelineHandle
	 */ 
	 public VkPipeline basePipelineHandle(){
		 // return  this.basePipelineHandle;
		 return basePipelineHandle0(super.ptr);
	 }

	/**
	 * Set method for field basePipelineIndex	[int]<br>
	 * Prototype: int32_t  basePipelineIndex
	 */ 
	 public void basePipelineIndex(int basePipelineIndex){
		 this.basePipelineIndex = basePipelineIndex;
		basePipelineIndex0(super.ptr, basePipelineIndex);
	 }

	/**
	 * get method for field basePipelineIndex	[int]<br>
	 * Prototype: int32_t  basePipelineIndex
	 */ 
	 public int basePipelineIndex(){
		 // return  this.basePipelineIndex;
		 return basePipelineIndex0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkComputePipelineCreateInfo _obj = (VkComputePipelineCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkComputePipelineCreateInfo _obj = (VkComputePipelineCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkComputePipelineCreateInfo _obj = (VkComputePipelineCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkComputePipelineCreateInfo _obj = (VkComputePipelineCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkComputePipelineCreateInfo _obj = (VkComputePipelineCreateInfo)(*ptr);
		  _obj.flags = (VkPipelineCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkComputePipelineCreateInfo _obj = (VkComputePipelineCreateInfo)(ptr);
		  return (jint) (_obj.VkPipelineCreateFlags);
	 */

	/**
	 * native SET method for field stage	[vkstruct]<br>
	 * Prototype: VkPipelineShaderStageCreateInfo  stage
	 */ 
	 private static native void stage0(ByteBuffer ptr, VkPipelineShaderStageCreateInfo _stage);/*
		  VkComputePipelineCreateInfo _obj = (VkComputePipelineCreateInfo)(*ptr);
		  _obj.stage = (VkPipelineShaderStageCreateInfo) (_stage);
	  */

	/**
	 * native GET method for field stage	[vkstruct]<br>
	 * Prototype: VkPipelineShaderStageCreateInfo  stage
	 */ 
	 private static native VkPipelineShaderStageCreateInfo stage0(ByteBuffer ptr);/*
		  VkComputePipelineCreateInfo _obj = (VkComputePipelineCreateInfo)(ptr);
		  return (VkPipelineShaderStageCreateInfo) (_obj.VkPipelineShaderStageCreateInfo);
	 */

	/**
	 * native SET method for field layout	[vkhandle]<br>
	 * Prototype: VkPipelineLayout  layout
	 */ 
	 private static native void layout0(ByteBuffer ptr, VkPipelineLayout _layout);/*
		  VkComputePipelineCreateInfo _obj = (VkComputePipelineCreateInfo)(*ptr);
		  _obj.layout = (VkPipelineLayout) (_layout);
	  */

	/**
	 * native GET method for field layout	[vkhandle]<br>
	 * Prototype: VkPipelineLayout  layout
	 */ 
	 private static native VkPipelineLayout layout0(ByteBuffer ptr);/*
		  VkComputePipelineCreateInfo _obj = (VkComputePipelineCreateInfo)(ptr);
		  return (VkPipelineLayout) (_obj.VkPipelineLayout);
	 */

	/**
	 * native SET method for field basePipelineHandle	[vkhandle]<br>
	 * Prototype: VkPipeline  basePipelineHandle
	 */ 
	 private static native void basePipelineHandle0(ByteBuffer ptr, VkPipeline _basePipelineHandle);/*
		  VkComputePipelineCreateInfo _obj = (VkComputePipelineCreateInfo)(*ptr);
		  _obj.basePipelineHandle = (VkPipeline) (_basePipelineHandle);
	  */

	/**
	 * native GET method for field basePipelineHandle	[vkhandle]<br>
	 * Prototype: VkPipeline  basePipelineHandle
	 */ 
	 private static native VkPipeline basePipelineHandle0(ByteBuffer ptr);/*
		  VkComputePipelineCreateInfo _obj = (VkComputePipelineCreateInfo)(ptr);
		  return (VkPipeline) (_obj.VkPipeline);
	 */

	/**
	 * native SET method for field basePipelineIndex	[int]<br>
	 * Prototype: int32_t  basePipelineIndex
	 */ 
	 private static native void basePipelineIndex0(ByteBuffer ptr, int _basePipelineIndex);/*
		  VkComputePipelineCreateInfo _obj = (VkComputePipelineCreateInfo)(*ptr);
		  _obj.basePipelineIndex = (int32_t) (_basePipelineIndex);
	  */

	/**
	 * native GET method for field basePipelineIndex	[int]<br>
	 * Prototype: int32_t  basePipelineIndex
	 */ 
	 private static native int basePipelineIndex0(ByteBuffer ptr);/*
		  VkComputePipelineCreateInfo _obj = (VkComputePipelineCreateInfo)(ptr);
		  return (jint) (_obj.int32_t);
	 */



} // end of class VkComputePipelineCreateInfo
