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
	 *  const void* 	pNext	[p]
	 */ 
	 P<VkObject> 	pNext;

	/**
	 *  VkPipelineLayoutCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  uint32_t 	setLayoutCount	[int]
	 */ 
	 int 	setLayoutCount;

	/**
	 *  const VkDescriptorSetLayout* 	pSetLayouts	[p]
	 */ 
	 P<VkDescriptorSetLayout>  	pSetLayouts;

	/**
	 *  uint32_t 	pushConstantRangeCount	[int]
	 */ 
	 int 	pushConstantRangeCount;

	/**
	 *  const VkPushConstantRange* 	pPushConstantRanges	[p]
	 */ 
	 P<VkPushConstantRange>  	pPushConstantRanges;

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
	 * Prototype: VkPipelineLayoutCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkPipelineLayoutCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field setLayoutCount	[int]<br>
	 * Prototype: uint32_t  setLayoutCount
	 */ 
	 public void setLayoutCount(int setLayoutCount){
		 this.setLayoutCount = setLayoutCount;
		setLayoutCount0(super.ptr, setLayoutCount);
	 }

	/**
	 * get method for field setLayoutCount	[int]<br>
	 * Prototype: uint32_t  setLayoutCount
	 */ 
	 public int setLayoutCount(){
		 // return  this.setLayoutCount;
		 return setLayoutCount0(super.ptr);
	 }

	/**
	 * Set method for field pSetLayouts	[p]<br>
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 public void pSetLayouts(P<VkDescriptorSetLayout>  pSetLayouts){
		 this.pSetLayouts = pSetLayouts;
		pSetLayouts0(super.ptr, pSetLayouts);
	 }

	/**
	 * get method for field pSetLayouts	[p]<br>
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 public P<VkDescriptorSetLayout>  pSetLayouts(){
		 // return  this.pSetLayouts;
		 return pSetLayouts0(super.ptr);
	 }

	/**
	 * Set method for field pushConstantRangeCount	[int]<br>
	 * Prototype: uint32_t  pushConstantRangeCount
	 */ 
	 public void pushConstantRangeCount(int pushConstantRangeCount){
		 this.pushConstantRangeCount = pushConstantRangeCount;
		pushConstantRangeCount0(super.ptr, pushConstantRangeCount);
	 }

	/**
	 * get method for field pushConstantRangeCount	[int]<br>
	 * Prototype: uint32_t  pushConstantRangeCount
	 */ 
	 public int pushConstantRangeCount(){
		 // return  this.pushConstantRangeCount;
		 return pushConstantRangeCount0(super.ptr);
	 }

	/**
	 * Set method for field pPushConstantRanges	[p]<br>
	 * Prototype: const VkPushConstantRange*  pPushConstantRanges
	 */ 
	 public void pPushConstantRanges(P<VkPushConstantRange>  pPushConstantRanges){
		 this.pPushConstantRanges = pPushConstantRanges;
		pPushConstantRanges0(super.ptr, pPushConstantRanges);
	 }

	/**
	 * get method for field pPushConstantRanges	[p]<br>
	 * Prototype: const VkPushConstantRange*  pPushConstantRanges
	 */ 
	 public P<VkPushConstantRange>  pPushConstantRanges(){
		 // return  this.pPushConstantRanges;
		 return pPushConstantRanges0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineLayoutCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(*ptr);
		  _obj.flags = (VkPipelineLayoutCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineLayoutCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(ptr);
		  return (jint) (_obj.VkPipelineLayoutCreateFlags);
	 */

	/**
	 * native SET method for field setLayoutCount	[int]<br>
	 * Prototype: uint32_t  setLayoutCount
	 */ 
	 private static native void setLayoutCount0(ByteBuffer ptr, int _setLayoutCount);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(*ptr);
		  _obj.setLayoutCount = (uint32_t) (_setLayoutCount);
	  */

	/**
	 * native GET method for field setLayoutCount	[int]<br>
	 * Prototype: uint32_t  setLayoutCount
	 */ 
	 private static native int setLayoutCount0(ByteBuffer ptr);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field pSetLayouts	[p]<br>
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 private static native void pSetLayouts0(ByteBuffer ptr, P<VkDescriptorSetLayout>  _pSetLayouts);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(*ptr);
		  _obj.pSetLayouts = (const VkDescriptorSetLayout*) (_pSetLayouts);
	  */

	/**
	 * native GET method for field pSetLayouts	[p]<br>
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 private static native P<VkDescriptorSetLayout>  pSetLayouts0(ByteBuffer ptr);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(ptr);
		  return (P<VkDescriptorSetLayout> ) (_obj.const VkDescriptorSetLayout*);
	 */

	/**
	 * native SET method for field pushConstantRangeCount	[int]<br>
	 * Prototype: uint32_t  pushConstantRangeCount
	 */ 
	 private static native void pushConstantRangeCount0(ByteBuffer ptr, int _pushConstantRangeCount);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(*ptr);
		  _obj.pushConstantRangeCount = (uint32_t) (_pushConstantRangeCount);
	  */

	/**
	 * native GET method for field pushConstantRangeCount	[int]<br>
	 * Prototype: uint32_t  pushConstantRangeCount
	 */ 
	 private static native int pushConstantRangeCount0(ByteBuffer ptr);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field pPushConstantRanges	[p]<br>
	 * Prototype: const VkPushConstantRange*  pPushConstantRanges
	 */ 
	 private static native void pPushConstantRanges0(ByteBuffer ptr, P<VkPushConstantRange>  _pPushConstantRanges);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(*ptr);
		  _obj.pPushConstantRanges = (const VkPushConstantRange*) (_pPushConstantRanges);
	  */

	/**
	 * native GET method for field pPushConstantRanges	[p]<br>
	 * Prototype: const VkPushConstantRange*  pPushConstantRanges
	 */ 
	 private static native P<VkPushConstantRange>  pPushConstantRanges0(ByteBuffer ptr);/*
		  VkPipelineLayoutCreateInfo _obj = (VkPipelineLayoutCreateInfo)(ptr);
		  return (P<VkPushConstantRange> ) (_obj.const VkPushConstantRange*);
	 */



} // end of class VkPipelineLayoutCreateInfo
