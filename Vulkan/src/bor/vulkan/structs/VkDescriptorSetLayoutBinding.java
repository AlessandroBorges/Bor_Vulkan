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
	/** TAG of this structure [195]  */
	 private static final String TAG = "VkDescriptorSetLayoutBinding";

	/** ID of this structure [195]  */
	 public static final int TAG_ID = VKDESCRIPTORSETLAYOUTBINDING_ID;

	 // fields //
	/**
	 *  uint32_t 	binding 
	 */ 
	int 	binding;

	/**
	 *  VkDescriptorType 	descriptorType 
	 */ 
	VkDescriptorType 	descriptorType;

	/**
	 *  uint32_t 	descriptorCount 
	 */ 
	int 	descriptorCount;

	/**
	 *  VkShaderStageFlags 	stageFlags 
	 */ 
	int 	stageFlags;

	/**
	 *  const VkSampler* 	pImmutableSamplers 
	 */ 
	P<VkSampler>  	pImmutableSamplers;

	/**
	 * Ctor
	 */
	public VkDescriptorSetLayoutBinding(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	 // /////////////////////
	 //  SETTERS & GETTERS //
	 // /////////////////////

	/**
	 * Set method for field binding
	 * Prototype: uint32_t  binding
	 */ 
	 public void binding(int binding){
		 this.binding = binding;
		binding0(super.ptr, binding);
	 }

	/**
	 * get method for field binding
	 * Prototype: uint32_t  binding
	 */ 
	 public int binding(){
		 // return  this.binding;
		 return binding0(super.ptr);
	 }

	/**
	 * Set method for field descriptorType
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 public void descriptorType(VkDescriptorType descriptorType){
		 this.descriptorType = descriptorType;
		descriptorType0(super.ptr, descriptorType);
	 }

	/**
	 * get method for field descriptorType
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 public VkDescriptorType descriptorType(){
		 // return  this.descriptorType;
		 return descriptorType0(super.ptr);
	 }

	/**
	 * Set method for field descriptorCount
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 public void descriptorCount(int descriptorCount){
		 this.descriptorCount = descriptorCount;
		descriptorCount0(super.ptr, descriptorCount);
	 }

	/**
	 * get method for field descriptorCount
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 public int descriptorCount(){
		 // return  this.descriptorCount;
		 return descriptorCount0(super.ptr);
	 }

	/**
	 * Set method for field stageFlags
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 public void stageFlags(int stageFlags){
		 this.stageFlags = stageFlags;
		stageFlags0(super.ptr, stageFlags);
	 }

	/**
	 * get method for field stageFlags
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 public int stageFlags(){
		 // return  this.stageFlags;
		 return stageFlags0(super.ptr);
	 }

	/**
	 * Set method for field pImmutableSamplers
	 * Prototype: const VkSampler*  pImmutableSamplers
	 */ 
	 public void pImmutableSamplers(P<VkSampler>  pImmutableSamplers){
		 this.pImmutableSamplers = pImmutableSamplers;
		pImmutableSamplers0(super.ptr, pImmutableSamplers);
	 }

	/**
	 * get method for field pImmutableSamplers
	 * Prototype: const VkSampler*  pImmutableSamplers
	 */ 
	 public P<VkSampler>  pImmutableSamplers(){
		 // return  this.pImmutableSamplers;
		 return pImmutableSamplers0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field binding
	 * Prototype: uint32_t  binding
	 */ 
	 private static native void binding0(ByteBuffer ptr, int _binding);/*
		  VkDescriptorSetLayoutBinding _obj = (VkDescriptorSetLayoutBinding)(*ptr);
		  _obj.binding = (uint32_t) (_binding);
	  */

	/**
	 * get method for field binding
	 * Prototype: uint32_t  binding
	 */ 
	 private static native int binding0(ByteBuffer ptr);/*
		  VkDescriptorSetLayoutBinding _obj = (VkDescriptorSetLayoutBinding)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field descriptorType
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 private static native void descriptorType0(ByteBuffer ptr, VkDescriptorType _descriptorType);/*
		  VkDescriptorSetLayoutBinding _obj = (VkDescriptorSetLayoutBinding)(*ptr);
		  _obj.descriptorType = (VkDescriptorType) (_descriptorType);
	  */

	/**
	 * get method for field descriptorType
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 private static native VkDescriptorType descriptorType0(ByteBuffer ptr);/*
		  VkDescriptorSetLayoutBinding _obj = (VkDescriptorSetLayoutBinding)(ptr);
		  return (VkDescriptorType) (_obj.VkDescriptorType);
	 */

	/**
	 * native Set method for field descriptorCount
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native void descriptorCount0(ByteBuffer ptr, int _descriptorCount);/*
		  VkDescriptorSetLayoutBinding _obj = (VkDescriptorSetLayoutBinding)(*ptr);
		  _obj.descriptorCount = (uint32_t) (_descriptorCount);
	  */

	/**
	 * get method for field descriptorCount
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native int descriptorCount0(ByteBuffer ptr);/*
		  VkDescriptorSetLayoutBinding _obj = (VkDescriptorSetLayoutBinding)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field stageFlags
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 private static native void stageFlags0(ByteBuffer ptr, int _stageFlags);/*
		  VkDescriptorSetLayoutBinding _obj = (VkDescriptorSetLayoutBinding)(*ptr);
		  _obj.stageFlags = (VkShaderStageFlags) (_stageFlags);
	  */

	/**
	 * get method for field stageFlags
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 private static native int stageFlags0(ByteBuffer ptr);/*
		  VkDescriptorSetLayoutBinding _obj = (VkDescriptorSetLayoutBinding)(ptr);
		  return (jint) (_obj.VkShaderStageFlags);
	 */

	/**
	 * native Set method for field pImmutableSamplers
	 * Prototype: const VkSampler*  pImmutableSamplers
	 */ 
	 private static native void pImmutableSamplers0(ByteBuffer ptr, P<VkSampler>  _pImmutableSamplers);/*
		  VkDescriptorSetLayoutBinding _obj = (VkDescriptorSetLayoutBinding)(*ptr);
		  _obj.pImmutableSamplers = (const VkSampler*) (_pImmutableSamplers);
	  */

	/**
	 * get method for field pImmutableSamplers
	 * Prototype: const VkSampler*  pImmutableSamplers
	 */ 
	 private static native P<VkSampler>  pImmutableSamplers0(ByteBuffer ptr);/*
		  VkDescriptorSetLayoutBinding _obj = (VkDescriptorSetLayoutBinding)(ptr);
		  return (P<VkSampler> ) (_obj.const VkSampler*);
	 */



} // end of class VkDescriptorSetLayoutBinding
