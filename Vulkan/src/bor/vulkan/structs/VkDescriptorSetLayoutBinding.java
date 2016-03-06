/**
 * Class wrapping Vulkan's VkDescriptorSetLayoutBinding struct.
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
 *  This class is a Java front end for struct VkDescriptorSetLayoutBinding. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDescriptorSetLayoutBinding {
 *     uint32_t              binding;
 *     VkDescriptorType      descriptorType;
 *     uint32_t              descriptorCount;
 *     VkShaderStageFlags    stageFlags;
 *     const VkSampler*      pImmutableSamplers;
 * } VkDescriptorSetLayoutBinding;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkDescriptorSetLayoutBinding extends VkStruct {
	/** TAG of this structure [71]  */
	 private static final String TAG = "VkDescriptorSetLayoutBinding";

	/** ID of this structure [71]  */
	 public static final int TAG_ID = VKDESCRIPTORSETLAYOUTBINDING_ID;

	 // fields //
	/**
	 *  uint32_t 	binding	[int]
	 */ 
	int 	binding;

	/**
	 *  VkDescriptorType 	descriptorType	[vkenum]
	 */ 
	VkDescriptorType 	descriptorType;

	/**
	 *  uint32_t 	descriptorCount	[int]
	 */ 
	int 	descriptorCount;

	/**
	 *  VkShaderStageFlags 	stageFlags	[int]
	 */ 
	int 	stageFlags;

	/**
	 *  const VkSampler* 	pImmutableSamplers	[p]
	 */ 
	P<VkSampler>  	pImmutableSamplers;

	/**
	 * Ctor
	 */
	public VkDescriptorSetLayoutBinding(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDescriptorSetLayoutBinding(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkDescriptorSetLayoutBinding(long address, int memSize){ 
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
	 public static P<VkDescriptorSetLayoutBinding> createNullPointer(){
	        P<VkDescriptorSetLayoutBinding> p = new  P<VkDescriptorSetLayoutBinding>(new VkDescriptorSetLayoutBinding());
	        return p;
	    }

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 */ 
	 public void binding(int binding){
		 this.binding = binding;
		binding0(super.ptr, binding);
	 }

	/**
	 * get method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 */ 
	 public int binding(){
		 // return  this.binding;
		 return binding0(super.ptr);
	 }

	/**
	 * Set method for field descriptorType	[vkenum]<br>
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 public void descriptorType(VkDescriptorType descriptorType){
		 this.descriptorType = descriptorType;
		descriptorType0(super.ptr, descriptorType);
	 }

	/**
	 * get method for field descriptorType	[vkenum]<br>
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 public VkDescriptorType descriptorType(){
		 // return  this.descriptorType;
		 return descriptorType0(super.ptr);
	 }

	/**
	 * Set method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 public void descriptorCount(int descriptorCount){
		 this.descriptorCount = descriptorCount;
		descriptorCount0(super.ptr, descriptorCount);
	 }

	/**
	 * get method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 public int descriptorCount(){
		 // return  this.descriptorCount;
		 return descriptorCount0(super.ptr);
	 }

	/**
	 * Set method for field stageFlags	[int]<br>
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 public void stageFlags(int stageFlags){
		 this.stageFlags = stageFlags;
		stageFlags0(super.ptr, stageFlags);
	 }

	/**
	 * get method for field stageFlags	[int]<br>
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 public int stageFlags(){
		 // return  this.stageFlags;
		 return stageFlags0(super.ptr);
	 }

	/**
	 * Set method for field pImmutableSamplers	[p]<br>
	 * Prototype: const VkSampler*  pImmutableSamplers
	 */ 
	 public void pImmutableSamplers(P<VkSampler>  pImmutableSamplers){
		 this.pImmutableSamplers = pImmutableSamplers;
		pImmutableSamplers0(super.ptr, pImmutableSamplers);
	 }

	/**
	 * get method for field pImmutableSamplers	[p]<br>
	 * Prototype: const VkSampler*  pImmutableSamplers
	 */ 
	 public P<VkSampler>  pImmutableSamplers(){
		 // return  this.pImmutableSamplers;
		 return pImmutableSamplers0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 */ 
	 private static native void binding0(ByteBuffer ptr, int _binding);/*
		  VkDescriptorSetLayoutBinding _obj = (VkDescriptorSetLayoutBinding)(*ptr);
		  _obj.binding = (uint32_t) (_binding);
	  */

	/**
	 * native GET method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 */ 
	 private static native int binding0(ByteBuffer ptr);/*
		  VkDescriptorSetLayoutBinding _obj = (VkDescriptorSetLayoutBinding)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field descriptorType	[vkenum]<br>
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 private static native void descriptorType0(ByteBuffer ptr, VkDescriptorType _descriptorType);/*
		  VkDescriptorSetLayoutBinding _obj = (VkDescriptorSetLayoutBinding)(*ptr);
		  _obj.descriptorType = (VkDescriptorType) (_descriptorType);
	  */

	/**
	 * native GET method for field descriptorType	[vkenum]<br>
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 private static native VkDescriptorType descriptorType0(ByteBuffer ptr);/*
		  VkDescriptorSetLayoutBinding _obj = (VkDescriptorSetLayoutBinding)(ptr);
		  return (VkDescriptorType) (_obj.VkDescriptorType);
	 */

	/**
	 * native SET method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native void descriptorCount0(ByteBuffer ptr, int _descriptorCount);/*
		  VkDescriptorSetLayoutBinding _obj = (VkDescriptorSetLayoutBinding)(*ptr);
		  _obj.descriptorCount = (uint32_t) (_descriptorCount);
	  */

	/**
	 * native GET method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native int descriptorCount0(ByteBuffer ptr);/*
		  VkDescriptorSetLayoutBinding _obj = (VkDescriptorSetLayoutBinding)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field stageFlags	[int]<br>
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 private static native void stageFlags0(ByteBuffer ptr, int _stageFlags);/*
		  VkDescriptorSetLayoutBinding _obj = (VkDescriptorSetLayoutBinding)(*ptr);
		  _obj.stageFlags = (VkShaderStageFlags) (_stageFlags);
	  */

	/**
	 * native GET method for field stageFlags	[int]<br>
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 private static native int stageFlags0(ByteBuffer ptr);/*
		  VkDescriptorSetLayoutBinding _obj = (VkDescriptorSetLayoutBinding)(ptr);
		  return (jint) (_obj.VkShaderStageFlags);
	 */

	/**
	 * native SET method for field pImmutableSamplers	[p]<br>
	 * Prototype: const VkSampler*  pImmutableSamplers
	 */ 
	 private static native void pImmutableSamplers0(ByteBuffer ptr, P<VkSampler>  _pImmutableSamplers);/*
		  VkDescriptorSetLayoutBinding _obj = (VkDescriptorSetLayoutBinding)(*ptr);
		  _obj.pImmutableSamplers = (const VkSampler*) (_pImmutableSamplers);
	  */

	/**
	 * native GET method for field pImmutableSamplers	[p]<br>
	 * Prototype: const VkSampler*  pImmutableSamplers
	 */ 
	 private static native P<VkSampler>  pImmutableSamplers0(ByteBuffer ptr);/*
		  VkDescriptorSetLayoutBinding _obj = (VkDescriptorSetLayoutBinding)(ptr);
		  return (P<VkSampler> ) (_obj.const VkSampler*);
	 */



} // end of class VkDescriptorSetLayoutBinding
