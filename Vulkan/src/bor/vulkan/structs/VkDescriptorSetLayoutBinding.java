/**
 * Class wrapping Vulkan's VkDescriptorSetLayoutBinding struct.
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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkDescriptorSetLayoutBinding extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [71]  */
	 private static final String TAG = "VkDescriptorSetLayoutBinding";

	/** ID of this structure [71]  */
	 public static final int TAG_ID = VKDESCRIPTORSETLAYOUTBINDING_ID;

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
	 *  const VkSampler* 	pImmutableSamplers	[vkhandle_array_array]
	 */ 
	  VkSampler[]  	pImmutableSamplers;
	 private BigBuffer 	 pImmutableSamplersBUFFER;
	/**
	 * Ctor
	 */
	public VkDescriptorSetLayoutBinding(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDescriptorSetLayoutBinding(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDescriptorSetLayoutBinding(long address){ 
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
	 public static VkArray<VkDescriptorSetLayoutBinding> createVkArray(int size){ 
		 VkDescriptorSetLayoutBinding[] array = new VkDescriptorSetLayoutBinding[size]; 
		 VkArrayStruct<VkDescriptorSetLayoutBinding> vkArray = new VkArrayStruct<VkDescriptorSetLayoutBinding> (array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 * 
	 * @param binding - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDescriptorSetLayoutBinding binding(int binding){
		 this.binding = binding;
		 setBinding0(this.ptr,  binding);
		 return this;
	 }

	/**
	 * Get method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 */ 
	 public int binding(){
		 int var = getBinding0(super.ptr);
		 this.binding = var;
		 return this.binding;
	 }

	/**
	 * Set method for field descriptorType	[vkenum]<br>
	 * Prototype: VkDescriptorType  descriptorType
	 * 
	 * @param descriptorType - a instance of VkDescriptorType.
	 * @return this VkStruct instance.
	 */ 
	 public VkDescriptorSetLayoutBinding descriptorType(VkDescriptorType descriptorType){
		 this.descriptorType = descriptorType;
		 int enumVal = descriptorType.getValue();
		 setDescriptorType0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field descriptorType	[vkenum]<br>
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 public VkDescriptorType descriptorType(){
		 int nativeVal = getDescriptorType0(super.ptr);
		 this.descriptorType = VkDescriptorType.fromValue(nativeVal); 
		 return this.descriptorType;
	 }

	/**
	 * Set method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 * 
	 * @param descriptorCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDescriptorSetLayoutBinding descriptorCount(int descriptorCount){
		 this.descriptorCount = descriptorCount;
		 setDescriptorCount0(this.ptr,  descriptorCount);
		 return this;
	 }

	/**
	 * Get method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 public int descriptorCount(){
		 int var = getDescriptorCount0(super.ptr);
		 this.descriptorCount = var;
		 return this.descriptorCount;
	 }

	/**
	 * Set method for field stageFlags	[int]<br>
	 * Prototype: VkShaderStageFlags  stageFlags
	 * 
	 * @param stageFlags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDescriptorSetLayoutBinding stageFlags(int stageFlags){
		 this.stageFlags = stageFlags;
		 setStageFlags0(this.ptr,  stageFlags);
		 return this;
	 }

	/**
	 * Get method for field stageFlags	[int]<br>
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 public int stageFlags(){
		 int var = getStageFlags0(super.ptr);
		 this.stageFlags = var;
		 return this.stageFlags;
	 }

	/**
	 * Set method for field pImmutableSamplers	[vkhandle_array]<br>
	 * Prototype: const VkSampler*  pImmutableSamplers
	 * 
	 * @param pImmutableSamplers - a instance of VkSampler[].
	 * @return this VkStruct instance.
	 */ 
	 public VkDescriptorSetLayoutBinding pImmutableSamplers(VkSampler[] pImmutableSamplers){
		 this.pImmutableSamplers = pImmutableSamplers;
		 this.pImmutableSamplersBUFFER = new BigBuffer(pImmutableSamplers, false);
		 setPImmutableSamplers0(this.ptr, pImmutableSamplersBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pImmutableSamplers	[vkhandle_array]<br>
	 * Prototype: const VkSampler*  pImmutableSamplers
	 */ 
	 public VkSampler[] pImmutableSamplers(){
		 long ptr = getPImmutableSamplers0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pImmutableSamplersBUFFER != null && ptr == pImmutableSamplersBUFFER.getBufferAddress()){ //same buffer 
		    pImmutableSamplersBUFFER.update();
		    return pImmutableSamplers;
		  }else{
		     (new UnsupportedOperationException("There is no VKHandle[] for backup.")).printStackTrace();
		   }
		 return this.pImmutableSamplers;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkDescriptorSetLayoutBinding [ ")
				.append("binding: ").append(binding() )
				.append(",\n descriptorType: ")
				.append(descriptorType() )
				.append(",\n descriptorCount: ")
				.append(descriptorCount() )
				.append(",\n stageFlags: ")
				.append(stageFlags() )
				.append(",\n pImmutableSamplers: ")
				.append(Arrays.toString(pImmutableSamplers()) )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 */ 
	 private static native void setBinding0(Buffer ptr, int _binding);/*
		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		 // code for simple past value 
		  vkObj->binding = (uint32_t) (_binding);
	  */

	/**
	 * Native GET method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 */ 
	 private static native int getBinding0(Buffer ptr);/*
		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		  return (jint) (vkObj->binding);
	 */

	/**
	 * Native SET method for field descriptorType	[vkenum]<br>
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 private static native void setDescriptorType0(Buffer ptr, int  _descriptorType);/*
		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		 // code for simple past value 
		  vkObj->descriptorType = (VkDescriptorType) (_descriptorType);
	  */

	/**
	 * Native GET method for field descriptorType	[vkenum]<br>
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 private static native int getDescriptorType0(Buffer ptr);/*
		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->descriptorType);
	 */

	/**
	 * Native SET method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native void setDescriptorCount0(Buffer ptr, int _descriptorCount);/*
		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		 // code for simple past value 
		  vkObj->descriptorCount = (uint32_t) (_descriptorCount);
	  */

	/**
	 * Native GET method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native int getDescriptorCount0(Buffer ptr);/*
		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		  return (jint) (vkObj->descriptorCount);
	 */

	/**
	 * Native SET method for field stageFlags	[int]<br>
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 private static native void setStageFlags0(Buffer ptr, int _stageFlags);/*
		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		 // code for simple past value 
		  vkObj->stageFlags = (VkShaderStageFlags) (_stageFlags);
	  */

	/**
	 * Native GET method for field stageFlags	[int]<br>
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 private static native int getStageFlags0(Buffer ptr);/*
		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		  return (jint) (vkObj->stageFlags);
	 */

	/**
	 * Native SET method for field pImmutableSamplers	[vkhandle_array]<br>
	 * Prototype: const VkSampler*  pImmutableSamplers
	 */ 
	 private static native void setPImmutableSamplers0(Buffer ptr, ByteBuffer  _pImmutableSamplers);/*
		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkSampler* p_pImmutableSamplers = ( VkSampler*) _pImmutableSamplers; 
		 vkObj->pImmutableSamplers = p_pImmutableSamplers; 
	  */

	/**
	 * Native GET method for field pImmutableSamplers	[vkhandle_array]<br>
	 * Prototype: const VkSampler*  pImmutableSamplers
	 */ 
	 private static native long getPImmutableSamplers0(Buffer ptr);/*
		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pImmutableSamplers );
	 */



} // end of class VkDescriptorSetLayoutBinding
