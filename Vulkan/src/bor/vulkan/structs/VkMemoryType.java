/**
 * Class wrapping Vulkan's VkMemoryType struct.
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
 *  This class is a Java front end for struct VkMemoryType. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkMemoryType {
 *     VkMemoryPropertyFlags    propertyFlags;
 *     uint32_t                 heapIndex;
 * } VkMemoryType;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkMemoryType extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [12]  */
	 private static final String TAG = "VkMemoryType";

	/** ID of this structure [12]  */
	 public static final int TAG_ID = VKMEMORYTYPE_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkMemoryPropertyFlags 	propertyFlags	[int]
	 */ 
	int 	propertyFlags;
	
	/**
	 *  uint32_t 	heapIndex	[int]
	 */ 
	int 	heapIndex;
	/**
	 * Ctor
	 */
	public VkMemoryType(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkMemoryType(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkMemoryType(long address){ 
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
	 * Set method for field propertyFlags	[int]<br>
	 * Prototype: VkMemoryPropertyFlags  propertyFlags
	 * 
	 * @param propertyFlags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkMemoryType propertyFlags(int propertyFlags){
		 this.propertyFlags = propertyFlags;
		 setPropertyFlags0(this.ptr,  propertyFlags);
		 return this;
	 }

	/**
	 * Get method for field propertyFlags	[int]<br>
	 * Prototype: VkMemoryPropertyFlags  propertyFlags
	 */ 
	 public int propertyFlags(){
		 int var = getPropertyFlags0(super.ptr);
		 this.propertyFlags = var;
		 return this.propertyFlags;
	 }

	/**
	 * Set method for field heapIndex	[int]<br>
	 * Prototype: uint32_t  heapIndex
	 * 
	 * @param heapIndex - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkMemoryType heapIndex(int heapIndex){
		 this.heapIndex = heapIndex;
		 setHeapIndex0(this.ptr,  heapIndex);
		 return this;
	 }

	/**
	 * Get method for field heapIndex	[int]<br>
	 * Prototype: uint32_t  heapIndex
	 */ 
	 public int heapIndex(){
		 int var = getHeapIndex0(super.ptr);
		 this.heapIndex = var;
		 return this.heapIndex;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkMemoryType [ ")
				.append("propertyFlags: ").append(propertyFlags() )
				.append(",\n heapIndex: ")
				.append(heapIndex() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field propertyFlags	[int]<br>
	 * Prototype: VkMemoryPropertyFlags  propertyFlags
	 */ 
	 private static native void setPropertyFlags0(Buffer ptr, int _propertyFlags);/*
		  VkMemoryType* vkObj = (VkMemoryType*)(ptr);
		  vkObj->propertyFlags = (VkMemoryPropertyFlags) (_propertyFlags);
	  */

	/**
	 * Native GET method for field propertyFlags	[int]<br>
	 * Prototype: VkMemoryPropertyFlags  propertyFlags
	 */ 
	 private static native int getPropertyFlags0(Buffer ptr);/*
		  VkMemoryType* vkObj = (VkMemoryType*)(ptr);
		  return (jint) (vkObj->propertyFlags);
	 */

	/**
	 * Native SET method for field heapIndex	[int]<br>
	 * Prototype: uint32_t  heapIndex
	 */ 
	 private static native void setHeapIndex0(Buffer ptr, int _heapIndex);/*
		  VkMemoryType* vkObj = (VkMemoryType*)(ptr);
		  vkObj->heapIndex = (uint32_t) (_heapIndex);
	  */

	/**
	 * Native GET method for field heapIndex	[int]<br>
	 * Prototype: uint32_t  heapIndex
	 */ 
	 private static native int getHeapIndex0(Buffer ptr);/*
		  VkMemoryType* vkObj = (VkMemoryType*)(ptr);
		  return (jint) (vkObj->heapIndex);
	 */



} // end of class VkMemoryType
