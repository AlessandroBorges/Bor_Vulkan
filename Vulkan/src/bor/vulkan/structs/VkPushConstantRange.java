/**
 * Class wrapping Vulkan's VkPushConstantRange struct.
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
 *  This class is a Java front end for struct VkPushConstantRange. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPushConstantRange {
 *     VkShaderStageFlags    stageFlags;
 *     uint32_t              offset;
 *     uint32_t              size;
 * } VkPushConstantRange;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkPushConstantRange extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [68]  */
	 private static final String TAG = "VkPushConstantRange";

	/** ID of this structure [68]  */
	 public static final int TAG_ID = VKPUSHCONSTANTRANGE_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkShaderStageFlags 	stageFlags	[int]
	 */ 
	int 	stageFlags;
	
	/**
	 *  uint32_t 	offset	[int]
	 */ 
	int 	offset;
	
	/**
	 *  uint32_t 	size	[int]
	 */ 
	int 	size;
	/**
	 * Ctor
	 */
	public VkPushConstantRange(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPushConstantRange(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPushConstantRange(long address){ 
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
	 * Set method for field stageFlags	[int]<br>
	 * Prototype: VkShaderStageFlags  stageFlags
	 * 
	 * @param stageFlags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPushConstantRange stageFlags(int stageFlags){
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
	 * Set method for field offset	[int]<br>
	 * Prototype: uint32_t  offset
	 * 
	 * @param offset - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPushConstantRange offset(int offset){
		 this.offset = offset;
		 setOffset0(this.ptr,  offset);
		 return this;
	 }

	/**
	 * Get method for field offset	[int]<br>
	 * Prototype: uint32_t  offset
	 */ 
	 public int offset(){
		 int var = getOffset0(super.ptr);
		 this.offset = var;
		 return this.offset;
	 }

	/**
	 * Set method for field size	[int]<br>
	 * Prototype: uint32_t  size
	 * 
	 * @param size - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPushConstantRange size(int size){
		 this.size = size;
		 setSize0(this.ptr,  size);
		 return this;
	 }

	/**
	 * Get method for field size	[int]<br>
	 * Prototype: uint32_t  size
	 */ 
	 public int size(){
		 int var = getSize0(super.ptr);
		 this.size = var;
		 return this.size;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkPushConstantRange [ ")
				.append("stageFlags: ").append(stageFlags() )
				.append(",\n offset: ")
				.append(offset() )
				.append(",\n size: ")
				.append(size() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field stageFlags	[int]<br>
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 private static native void setStageFlags0(Buffer ptr, int _stageFlags);/*
		  VkPushConstantRange* vkObj = (VkPushConstantRange*)(ptr);
		 // code for simple past value 
		  vkObj->stageFlags = (VkShaderStageFlags) (_stageFlags);
	  */

	/**
	 * Native GET method for field stageFlags	[int]<br>
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 private static native int getStageFlags0(Buffer ptr);/*
		  VkPushConstantRange* vkObj = (VkPushConstantRange*)(ptr);
		  return (jint) (vkObj->stageFlags);
	 */

	/**
	 * Native SET method for field offset	[int]<br>
	 * Prototype: uint32_t  offset
	 */ 
	 private static native void setOffset0(Buffer ptr, int _offset);/*
		  VkPushConstantRange* vkObj = (VkPushConstantRange*)(ptr);
		 // code for simple past value 
		  vkObj->offset = (uint32_t) (_offset);
	  */

	/**
	 * Native GET method for field offset	[int]<br>
	 * Prototype: uint32_t  offset
	 */ 
	 private static native int getOffset0(Buffer ptr);/*
		  VkPushConstantRange* vkObj = (VkPushConstantRange*)(ptr);
		  return (jint) (vkObj->offset);
	 */

	/**
	 * Native SET method for field size	[int]<br>
	 * Prototype: uint32_t  size
	 */ 
	 private static native void setSize0(Buffer ptr, int _size);/*
		  VkPushConstantRange* vkObj = (VkPushConstantRange*)(ptr);
		 // code for simple past value 
		  vkObj->size = (uint32_t) (_size);
	  */

	/**
	 * Native GET method for field size	[int]<br>
	 * Prototype: uint32_t  size
	 */ 
	 private static native int getSize0(Buffer ptr);/*
		  VkPushConstantRange* vkObj = (VkPushConstantRange*)(ptr);
		  return (jint) (vkObj->size);
	 */



} // end of class VkPushConstantRange
