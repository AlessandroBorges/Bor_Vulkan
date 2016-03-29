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

import java.nio.Buffer;


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

	/** P wrapper for THIS object */
	 private  P<VkDescriptorSetLayoutBinding> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
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
	 *  const VkSampler* 	pImmutableSamplers	[vkhandle]
	 */ 
	  VkSampler  	pImmutableSamplers;

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


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkDescriptorSetLayoutBinding> getP() {
	       if(p == null ){
	           p = new P<VkDescriptorSetLayoutBinding> (this);
	       }
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
		 binding0(this.ptr,  binding);
	 }

	/**
	 * Get method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 */ 
	 public int binding(){
		 int var = binding0(super.ptr);
		 this.binding = var;
		 return this.binding;
	 }

	/**
	 * Set method for field descriptorType	[vkenum]<br>
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 public void descriptorType(VkDescriptorType descriptorType){
		 this.descriptorType = descriptorType;
		 int enumVal = descriptorType.getValue();
		 descriptorType0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field descriptorType	[vkenum]<br>
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 public VkDescriptorType descriptorType(){
		 int nativeVal = descriptorType0(super.ptr);
		 this.descriptorType = VkDescriptorType.fromValue(nativeVal); 
		 return this.descriptorType;
	 }

	/**
	 * Set method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 public void descriptorCount(int descriptorCount){
		 this.descriptorCount = descriptorCount;
		 descriptorCount0(this.ptr,  descriptorCount);
	 }

	/**
	 * Get method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 public int descriptorCount(){
		 int var = descriptorCount0(super.ptr);
		 this.descriptorCount = var;
		 return this.descriptorCount;
	 }

	/**
	 * Set method for field stageFlags	[int]<br>
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 public void stageFlags(int stageFlags){
		 this.stageFlags = stageFlags;
		 stageFlags0(this.ptr,  stageFlags);
	 }

	/**
	 * Get method for field stageFlags	[int]<br>
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 public int stageFlags(){
		 int var = stageFlags0(super.ptr);
		 this.stageFlags = var;
		 return this.stageFlags;
	 }

	/**
	 * Set method for field pImmutableSamplers	[vkhandle]<br>
	 * Prototype: const VkSampler*  pImmutableSamplers
	 */ 
	 public void pImmutableSamplers( VkSampler  pImmutableSamplers){
		 this.pImmutableSamplers = pImmutableSamplers;
		 ByteBuffer buff = (pImmutableSamplers==null) ? null : pImmutableSamplers.getHandle();
		 pImmutableSamplers0(this.ptr, buff);
	 }

	/**
	 * Get method for field pImmutableSamplers	[vkhandle]<br>
	 * Prototype: const VkSampler*  pImmutableSamplers
	 */ 
	 public  VkSampler  pImmutableSamplers(){

		 ByteBuffer handle = pImmutableSamplers0(super.ptr);
		 if(handle == null){
		    this.pImmutableSamplers = null;
		    return null;
		  } else 
 		 if(this.pImmutableSamplers == null){
		    this.pImmutableSamplers = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.pImmutableSamplers).setHandle(handle);
		  }
		 return this.pImmutableSamplers;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 */ 
	 private static native void binding0(Buffer ptr, int _binding);/*
		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		  vkObj->binding = (uint32_t) (_binding);
	  */

	/**
	 * native GET method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 */ 
	 private static native int binding0(Buffer ptr);/*
		  VkDescriptorSetLayoutBinding vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		  return (jint) (vkObj->binding);
	 */

	/**
	 * native SET method for field descriptorType	[vkenum]<br>
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 private static native void descriptorType0(Buffer ptr, int  _descriptorType);/*
		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		  vkObj->descriptorType = (VkDescriptorType) (_descriptorType);
	  */

	/**
	 * native GET method for field descriptorType	[vkenum]<br>
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 private static native int  descriptorType0(Buffer ptr);/*
		  VkDescriptorSetLayoutBinding vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		  return (VkDescriptorType) (vkObj->descriptorType);
	 */

	/**
	 * native SET method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native void descriptorCount0(Buffer ptr, int _descriptorCount);/*
		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		  vkObj->descriptorCount = (uint32_t) (_descriptorCount);
	  */

	/**
	 * native GET method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native int descriptorCount0(Buffer ptr);/*
		  VkDescriptorSetLayoutBinding vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		  return (jint) (vkObj->descriptorCount);
	 */

	/**
	 * native SET method for field stageFlags	[int]<br>
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 private static native void stageFlags0(Buffer ptr, int _stageFlags);/*
		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		  vkObj->stageFlags = (VkShaderStageFlags) (_stageFlags);
	  */

	/**
	 * native GET method for field stageFlags	[int]<br>
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 private static native int stageFlags0(Buffer ptr);/*
		  VkDescriptorSetLayoutBinding vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		  return (jint) (vkObj->stageFlags);
	 */

	/**
	 * native SET method for field pImmutableSamplers	[vkhandle]<br>
	 * Prototype: const VkSampler*  pImmutableSamplers
	 */ 
	 private static native void pImmutableSamplers0(Buffer ptr, java.nio.ByteBuffer  _pImmutableSamplers);/*
		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		  vkObj->pImmutableSamplers = (const VkSampler*) (_pImmutableSamplers);
	  */

	/**
	 * native GET method for field pImmutableSamplers	[vkhandle]<br>
	 * Prototype: const VkSampler*  pImmutableSamplers
	 */ 
	 private static native java.nio.ByteBuffer  pImmutableSamplers0(Buffer ptr);/*
		  VkDescriptorSetLayoutBinding vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		  return ( VkSampler ) (vkObj->pImmutableSamplers);
	 */



} // end of class VkDescriptorSetLayoutBinding
