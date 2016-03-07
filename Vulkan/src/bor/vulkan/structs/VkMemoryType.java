/**
 * Class wrapping Vulkan's VkMemoryType struct.
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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkMemoryType extends VkStruct {
	/** TAG of this structure [12]  */
	 private static final String TAG = "VkMemoryType";

	/** ID of this structure [12]  */
	 public static final int TAG_ID = VKMEMORYTYPE_ID;

	/** P wrapper for THIS object */
	 private  P<VkMemoryType> p;

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
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkMemoryType(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkMemoryType(long address, int memSize){ 
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
	 public static P<VkMemoryType> createNullPointer(){
	        P<VkMemoryType> p = new  P<VkMemoryType>(new VkMemoryType());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkMemoryType> getP() {
	       if(p == null ){
	           p = new P<VkMemoryType> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field propertyFlags	[int]<br>
	 * Prototype: VkMemoryPropertyFlags  propertyFlags
	 */ 
	 public void propertyFlags(int propertyFlags){
		 this.propertyFlags = propertyFlags;
		propertyFlags0(super.ptr, propertyFlags);
	 }

	/**
	 * get method for field propertyFlags	[int]<br>
	 * Prototype: VkMemoryPropertyFlags  propertyFlags
	 */ 
	 public int propertyFlags(){
		 // return  this.propertyFlags;
		 return propertyFlags0(super.ptr);
	 }

	/**
	 * Set method for field heapIndex	[int]<br>
	 * Prototype: uint32_t  heapIndex
	 */ 
	 public void heapIndex(int heapIndex){
		 this.heapIndex = heapIndex;
		heapIndex0(super.ptr, heapIndex);
	 }

	/**
	 * get method for field heapIndex	[int]<br>
	 * Prototype: uint32_t  heapIndex
	 */ 
	 public int heapIndex(){
		 // return  this.heapIndex;
		 return heapIndex0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field propertyFlags	[int]<br>
	 * Prototype: VkMemoryPropertyFlags  propertyFlags
	 */ 
	 private static native void propertyFlags0(ByteBuffer ptr, int _propertyFlags);/*
		  VkMemoryType _obj = (VkMemoryType)(*ptr);
		  _obj.propertyFlags = (VkMemoryPropertyFlags) (_propertyFlags);
	  */

	/**
	 * native GET method for field propertyFlags	[int]<br>
	 * Prototype: VkMemoryPropertyFlags  propertyFlags
	 */ 
	 private static native int propertyFlags0(ByteBuffer ptr);/*
		  VkMemoryType _obj = (VkMemoryType)(ptr);
		  return (jint) (_obj.VkMemoryPropertyFlags);
	 */

	/**
	 * native SET method for field heapIndex	[int]<br>
	 * Prototype: uint32_t  heapIndex
	 */ 
	 private static native void heapIndex0(ByteBuffer ptr, int _heapIndex);/*
		  VkMemoryType _obj = (VkMemoryType)(*ptr);
		  _obj.heapIndex = (uint32_t) (_heapIndex);
	  */

	/**
	 * native GET method for field heapIndex	[int]<br>
	 * Prototype: uint32_t  heapIndex
	 */ 
	 private static native int heapIndex0(ByteBuffer ptr);/*
		  VkMemoryType _obj = (VkMemoryType)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkMemoryType
