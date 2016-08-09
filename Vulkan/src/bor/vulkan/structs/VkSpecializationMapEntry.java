/**
 * Class wrapping Vulkan's VkSpecializationMapEntry struct.
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
 *  This class is a Java front end for struct VkSpecializationMapEntry. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSpecializationMapEntry {
 *     uint32_t    constantID;
 *     uint32_t    offset;
 *     size_t      size;
 * } VkSpecializationMapEntry;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkSpecializationMapEntry extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [46]  */
	 private static final String TAG = "VkSpecializationMapEntry";

	/** ID of this structure [46]  */
	 public static final int TAG_ID = VKSPECIALIZATIONMAPENTRY_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  uint32_t 	constantID	[int]
	 */ 
	int 	constantID;
	
	/**
	 *  uint32_t 	offset	[int]
	 */ 
	int 	offset;
	
	/**
	 *  size_t 	size	[long]
	 */ 
	long 	size;
	/**
	 * Ctor
	 */
	public VkSpecializationMapEntry(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSpecializationMapEntry(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkSpecializationMapEntry(long address){ 
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
	 * Set method for field constantID	[int]<br>
	 * Prototype: uint32_t  constantID
	 * 
	 * @param constantID - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSpecializationMapEntry constantID(int constantID){
		 this.constantID = constantID;
		 setConstantID0(this.ptr,  constantID);
		 return this;
	 }

	/**
	 * Get method for field constantID	[int]<br>
	 * Prototype: uint32_t  constantID
	 */ 
	 public int constantID(){
		 int var = getConstantID0(super.ptr);
		 this.constantID = var;
		 return this.constantID;
	 }

	/**
	 * Set method for field offset	[int]<br>
	 * Prototype: uint32_t  offset
	 * 
	 * @param offset - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSpecializationMapEntry offset(int offset){
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
	 * Set method for field size	[long]<br>
	 * Prototype: size_t  size
	 * 
	 * @param size - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkSpecializationMapEntry size(long size){
		 this.size = size;
		 setSize0(this.ptr,  size);
		 return this;
	 }

	/**
	 * Get method for field size	[long]<br>
	 * Prototype: size_t  size
	 */ 
	 public long size(){
		 long var = getSize0(super.ptr);
		 this.size = var;
		 return this.size;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkSpecializationMapEntry [ ")
				.append("constantID: ").append(constantID() )
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
	 * Native SET method for field constantID	[int]<br>
	 * Prototype: uint32_t  constantID
	 */ 
	 private static native void setConstantID0(Buffer ptr, int _constantID);/*
		  VkSpecializationMapEntry* vkObj = (VkSpecializationMapEntry*)(ptr);
		  vkObj->constantID = (uint32_t) (_constantID);
	  */

	/**
	 * Native GET method for field constantID	[int]<br>
	 * Prototype: uint32_t  constantID
	 */ 
	 private static native int getConstantID0(Buffer ptr);/*
		  VkSpecializationMapEntry* vkObj = (VkSpecializationMapEntry*)(ptr);
		  return (jint) (vkObj->constantID);
	 */

	/**
	 * Native SET method for field offset	[int]<br>
	 * Prototype: uint32_t  offset
	 */ 
	 private static native void setOffset0(Buffer ptr, int _offset);/*
		  VkSpecializationMapEntry* vkObj = (VkSpecializationMapEntry*)(ptr);
		  vkObj->offset = (uint32_t) (_offset);
	  */

	/**
	 * Native GET method for field offset	[int]<br>
	 * Prototype: uint32_t  offset
	 */ 
	 private static native int getOffset0(Buffer ptr);/*
		  VkSpecializationMapEntry* vkObj = (VkSpecializationMapEntry*)(ptr);
		  return (jint) (vkObj->offset);
	 */

	/**
	 * Native SET method for field size	[long]<br>
	 * Prototype: size_t  size
	 */ 
	 private static native void setSize0(Buffer ptr, long _size);/*
		  VkSpecializationMapEntry* vkObj = (VkSpecializationMapEntry*)(ptr);
		  vkObj->size = (size_t) (_size);
	  */

	/**
	 * Native GET method for field size	[long]<br>
	 * Prototype: size_t  size
	 */ 
	 private static native long getSize0(Buffer ptr);/*
		  VkSpecializationMapEntry* vkObj = (VkSpecializationMapEntry*)(ptr);
		  return (jlong) (vkObj->size);
	 */



} // end of class VkSpecializationMapEntry
