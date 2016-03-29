/**
 * Class wrapping Vulkan's VkSpecializationMapEntry struct.
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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkSpecializationMapEntry extends VkStruct {
	/** TAG of this structure [46]  */
	 private static final String TAG = "VkSpecializationMapEntry";

	/** ID of this structure [46]  */
	 public static final int TAG_ID = VKSPECIALIZATIONMAPENTRY_ID;

	/** P wrapper for THIS object */
	 private  P<VkSpecializationMapEntry> p;

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
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSpecializationMapEntry(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkSpecializationMapEntry(long address, int memSize){ 
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
	 public static P<VkSpecializationMapEntry> createNullPointer(){
	        P<VkSpecializationMapEntry> p = new  P<VkSpecializationMapEntry>(new VkSpecializationMapEntry());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkSpecializationMapEntry> getP() {
	       if(p == null ){
	           p = new P<VkSpecializationMapEntry> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field constantID	[int]<br>
	 * Prototype: uint32_t  constantID
	 */ 
	 public void constantID(int constantID){
		 this.constantID = constantID;
		 constantID0(this.ptr,  constantID);
	 }

	/**
	 * Get method for field constantID	[int]<br>
	 * Prototype: uint32_t  constantID
	 */ 
	 public int constantID(){
		 int var = constantID0(super.ptr);
		 this.constantID = var;
		 return this.constantID;
	 }

	/**
	 * Set method for field offset	[int]<br>
	 * Prototype: uint32_t  offset
	 */ 
	 public void offset(int offset){
		 this.offset = offset;
		 offset0(this.ptr,  offset);
	 }

	/**
	 * Get method for field offset	[int]<br>
	 * Prototype: uint32_t  offset
	 */ 
	 public int offset(){
		 int var = offset0(super.ptr);
		 this.offset = var;
		 return this.offset;
	 }

	/**
	 * Set method for field size	[long]<br>
	 * Prototype: size_t  size
	 */ 
	 public void size(long size){
		 this.size = size;
		 size0(this.ptr,  size);
	 }

	/**
	 * Get method for field size	[long]<br>
	 * Prototype: size_t  size
	 */ 
	 public long size(){
		 long var = size0(super.ptr);
		 this.size = var;
		 return this.size;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field constantID	[int]<br>
	 * Prototype: uint32_t  constantID
	 */ 
	 private static native void constantID0(Buffer ptr, int _constantID);/*
		  VkSpecializationMapEntry* vkObj = (VkSpecializationMapEntry*)(ptr);
		  vkObj->constantID = (uint32_t) (_constantID);
	  */

	/**
	 * native GET method for field constantID	[int]<br>
	 * Prototype: uint32_t  constantID
	 */ 
	 private static native int constantID0(Buffer ptr);/*
		  VkSpecializationMapEntry vkObj = (VkSpecializationMapEntry*)(ptr);
		  return (jint) (vkObj->constantID);
	 */

	/**
	 * native SET method for field offset	[int]<br>
	 * Prototype: uint32_t  offset
	 */ 
	 private static native void offset0(Buffer ptr, int _offset);/*
		  VkSpecializationMapEntry* vkObj = (VkSpecializationMapEntry*)(ptr);
		  vkObj->offset = (uint32_t) (_offset);
	  */

	/**
	 * native GET method for field offset	[int]<br>
	 * Prototype: uint32_t  offset
	 */ 
	 private static native int offset0(Buffer ptr);/*
		  VkSpecializationMapEntry vkObj = (VkSpecializationMapEntry*)(ptr);
		  return (jint) (vkObj->offset);
	 */

	/**
	 * native SET method for field size	[long]<br>
	 * Prototype: size_t  size
	 */ 
	 private static native void size0(Buffer ptr, long _size);/*
		  VkSpecializationMapEntry* vkObj = (VkSpecializationMapEntry*)(ptr);
		  vkObj->size = (size_t) (_size);
	  */

	/**
	 * native GET method for field size	[long]<br>
	 * Prototype: size_t  size
	 */ 
	 private static native long size0(Buffer ptr);/*
		  VkSpecializationMapEntry vkObj = (VkSpecializationMapEntry*)(ptr);
		  return (jlong) (vkObj->size);
	 */



} // end of class VkSpecializationMapEntry
