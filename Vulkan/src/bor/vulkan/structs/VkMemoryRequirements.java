/**
 * Class wrapping Vulkan's VkMemoryRequirements struct.
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
 *  This class is a Java front end for struct VkMemoryRequirements. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkMemoryRequirements {
 *     VkDeviceSize    size;
 *     VkDeviceSize    alignment;
 *     uint32_t        memoryTypeBits;
 * } VkMemoryRequirements;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkMemoryRequirements extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [22]  */
	 private static final String TAG = "VkMemoryRequirements";

	/** ID of this structure [22]  */
	 public static final int TAG_ID = VKMEMORYREQUIREMENTS_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkDeviceSize 	size	[long]
	 */ 
	long 	size;
	
	/**
	 *  VkDeviceSize 	alignment	[long]
	 */ 
	long 	alignment;
	
	/**
	 *  uint32_t 	memoryTypeBits	[int]
	 */ 
	int 	memoryTypeBits;
	/**
	 * Ctor
	 */
	public VkMemoryRequirements(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkMemoryRequirements(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkMemoryRequirements(long address){ 
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
	 * Set method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 * 
	 * @param size - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkMemoryRequirements size(long size){
		 this.size = size;
		 setSize0(this.ptr,  size);
		 return this;
	 }

	/**
	 * Get method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 public long size(){
		 long var = getSize0(super.ptr);
		 this.size = var;
		 return this.size;
	 }

	/**
	 * Set method for field alignment	[long]<br>
	 * Prototype: VkDeviceSize  alignment
	 * 
	 * @param alignment - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkMemoryRequirements alignment(long alignment){
		 this.alignment = alignment;
		 setAlignment0(this.ptr,  alignment);
		 return this;
	 }

	/**
	 * Get method for field alignment	[long]<br>
	 * Prototype: VkDeviceSize  alignment
	 */ 
	 public long alignment(){
		 long var = getAlignment0(super.ptr);
		 this.alignment = var;
		 return this.alignment;
	 }

	/**
	 * Set method for field memoryTypeBits	[int]<br>
	 * Prototype: uint32_t  memoryTypeBits
	 * 
	 * @param memoryTypeBits - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkMemoryRequirements memoryTypeBits(int memoryTypeBits){
		 this.memoryTypeBits = memoryTypeBits;
		 setMemoryTypeBits0(this.ptr,  memoryTypeBits);
		 return this;
	 }

	/**
	 * Get method for field memoryTypeBits	[int]<br>
	 * Prototype: uint32_t  memoryTypeBits
	 */ 
	 public int memoryTypeBits(){
		 int var = getMemoryTypeBits0(super.ptr);
		 this.memoryTypeBits = var;
		 return this.memoryTypeBits;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkMemoryRequirements [ ")
				.append("size: ").append(size() )
				.append(",\n alignment: ")
				.append(alignment() )
				.append(",\n memoryTypeBits: ")
				.append(memoryTypeBits() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native void setSize0(Buffer ptr, long _size);/*
		  VkMemoryRequirements* vkObj = (VkMemoryRequirements*)(ptr);
		 // code for simple past value 
		  vkObj->size = (VkDeviceSize) (_size);
	  */

	/**
	 * Native GET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native long getSize0(Buffer ptr);/*
		  VkMemoryRequirements* vkObj = (VkMemoryRequirements*)(ptr);
		  return (jlong) (vkObj->size);
	 */

	/**
	 * Native SET method for field alignment	[long]<br>
	 * Prototype: VkDeviceSize  alignment
	 */ 
	 private static native void setAlignment0(Buffer ptr, long _alignment);/*
		  VkMemoryRequirements* vkObj = (VkMemoryRequirements*)(ptr);
		 // code for simple past value 
		  vkObj->alignment = (VkDeviceSize) (_alignment);
	  */

	/**
	 * Native GET method for field alignment	[long]<br>
	 * Prototype: VkDeviceSize  alignment
	 */ 
	 private static native long getAlignment0(Buffer ptr);/*
		  VkMemoryRequirements* vkObj = (VkMemoryRequirements*)(ptr);
		  return (jlong) (vkObj->alignment);
	 */

	/**
	 * Native SET method for field memoryTypeBits	[int]<br>
	 * Prototype: uint32_t  memoryTypeBits
	 */ 
	 private static native void setMemoryTypeBits0(Buffer ptr, int _memoryTypeBits);/*
		  VkMemoryRequirements* vkObj = (VkMemoryRequirements*)(ptr);
		 // code for simple past value 
		  vkObj->memoryTypeBits = (uint32_t) (_memoryTypeBits);
	  */

	/**
	 * Native GET method for field memoryTypeBits	[int]<br>
	 * Prototype: uint32_t  memoryTypeBits
	 */ 
	 private static native int getMemoryTypeBits0(Buffer ptr);/*
		  VkMemoryRequirements* vkObj = (VkMemoryRequirements*)(ptr);
		  return (jint) (vkObj->memoryTypeBits);
	 */



} // end of class VkMemoryRequirements
