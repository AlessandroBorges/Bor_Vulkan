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

import java.nio.Buffer;


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

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

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
	 public VkMemoryType(long address , int memSize){ 
		 super(address, memSize); 
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
		 setPropertyFlags0(this.ptr,  propertyFlags);
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
	 */ 
	 public void heapIndex(int heapIndex){
		 this.heapIndex = heapIndex;
		 setHeapIndex0(this.ptr,  heapIndex);
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


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field propertyFlags	[int]<br>
	 * Prototype: VkMemoryPropertyFlags  propertyFlags
	 */ 
	 private static native void setPropertyFlags0(Buffer ptr, int _propertyFlags);/*
		  VkMemoryType* vkObj = (VkMemoryType*)(ptr);
		  vkObj->propertyFlags = (VkMemoryPropertyFlags) (_propertyFlags);
	  */

	/**
	 * native GET method for field propertyFlags	[int]<br>
	 * Prototype: VkMemoryPropertyFlags  propertyFlags
	 */ 
	 private static native int getPropertyFlags0(Buffer ptr);/*
		  VkMemoryType* vkObj = (VkMemoryType*)(ptr);
		  return (jint) (vkObj->propertyFlags);
	 */

	/**
	 * native SET method for field heapIndex	[int]<br>
	 * Prototype: uint32_t  heapIndex
	 */ 
	 private static native void setHeapIndex0(Buffer ptr, int _heapIndex);/*
		  VkMemoryType* vkObj = (VkMemoryType*)(ptr);
		  vkObj->heapIndex = (uint32_t) (_heapIndex);
	  */

	/**
	 * native GET method for field heapIndex	[int]<br>
	 * Prototype: uint32_t  heapIndex
	 */ 
	 private static native int getHeapIndex0(Buffer ptr);/*
		  VkMemoryType* vkObj = (VkMemoryType*)(ptr);
		  return (jint) (vkObj->heapIndex);
	 */



} // end of class VkMemoryType
