/**
 * Class wrapping Vulkan's VkDescriptorPoolSize struct.
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
 *  This class is a Java front end for struct VkDescriptorPoolSize. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDescriptorPoolSize {
 *     VkDescriptorType    type;
 *     uint32_t            descriptorCount;
 * } VkDescriptorPoolSize;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkDescriptorPoolSize extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [73]  */
	 private static final String TAG = "VkDescriptorPoolSize";

	/** ID of this structure [73]  */
	 public static final int TAG_ID = VKDESCRIPTORPOOLSIZE_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkDescriptorType 	type	[vkenum]
	 */ 
	VkDescriptorType 	type;
	
	/**
	 *  uint32_t 	descriptorCount	[int]
	 */ 
	int 	descriptorCount;
	/**
	 * Ctor
	 */
	public VkDescriptorPoolSize(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDescriptorPoolSize(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDescriptorPoolSize(long address){ 
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
	 public static VkArray<VkDescriptorPoolSize> createVkArray(int size){ 
		 VkDescriptorPoolSize[] array = new VkDescriptorPoolSize[size]; 
		 VkArrayStruct<VkDescriptorPoolSize> vkArray = new VkArrayStruct<VkDescriptorPoolSize> (array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field type	[vkenum]<br>
	 * Prototype: VkDescriptorType  type
	 * 
	 * @param type - a instance of VkDescriptorType.
	 * @return this VkStruct instance.
	 */ 
	 public VkDescriptorPoolSize type(VkDescriptorType type){
		 this.type = type;
		 int enumVal = type.getValue();
		 setType0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field type	[vkenum]<br>
	 * Prototype: VkDescriptorType  type
	 */ 
	 public VkDescriptorType type(){
		 int nativeVal = getType0(super.ptr);
		 this.type = VkDescriptorType.fromValue(nativeVal); 
		 return this.type;
	 }

	/**
	 * Set method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 * 
	 * @param descriptorCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDescriptorPoolSize descriptorCount(int descriptorCount){
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


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkDescriptorPoolSize [ ")
				.append("type: ").append(type() )
				.append(",\n descriptorCount: ")
				.append(descriptorCount() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field type	[vkenum]<br>
	 * Prototype: VkDescriptorType  type
	 */ 
	 private static native void setType0(Buffer ptr, int  _type);/*
		  VkDescriptorPoolSize* vkObj = (VkDescriptorPoolSize*)(ptr);
		 // code for simple past value 
		  vkObj->type = (VkDescriptorType) (_type);
	  */

	/**
	 * Native GET method for field type	[vkenum]<br>
	 * Prototype: VkDescriptorType  type
	 */ 
	 private static native int getType0(Buffer ptr);/*
		  VkDescriptorPoolSize* vkObj = (VkDescriptorPoolSize*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->type);
	 */

	/**
	 * Native SET method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native void setDescriptorCount0(Buffer ptr, int _descriptorCount);/*
		  VkDescriptorPoolSize* vkObj = (VkDescriptorPoolSize*)(ptr);
		 // code for simple past value 
		  vkObj->descriptorCount = (uint32_t) (_descriptorCount);
	  */

	/**
	 * Native GET method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native int getDescriptorCount0(Buffer ptr);/*
		  VkDescriptorPoolSize* vkObj = (VkDescriptorPoolSize*)(ptr);
		  return (jint) (vkObj->descriptorCount);
	 */



} // end of class VkDescriptorPoolSize
