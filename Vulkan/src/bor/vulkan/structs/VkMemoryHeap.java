/**
 * Class wrapping Vulkan's VkMemoryHeap struct.
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
 *  This class is a Java front end for struct VkMemoryHeap. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkMemoryHeap {
 *     VkDeviceSize         size;
 *     VkMemoryHeapFlags    flags;
 * } VkMemoryHeap;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkMemoryHeap extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [13]  */
	 private static final String TAG = "VkMemoryHeap";

	/** ID of this structure [13]  */
	 public static final int TAG_ID = VKMEMORYHEAP_ID;

	/** P wrapper for THIS object */
	 private  P<VkMemoryHeap> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkDeviceSize 	size	[long]
	 */ 
	 long 	size;

	/**
	 *  VkMemoryHeapFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 * Ctor
	 */
	public VkMemoryHeap(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkMemoryHeap(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkMemoryHeap(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkMemoryHeap(long address){ 
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
	 public static P<VkMemoryHeap> createNullPointer(){
	        P<VkMemoryHeap> p = new  P<VkMemoryHeap>(new VkMemoryHeap());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkMemoryHeap> getP() {
	       if(p == null ){
	           p = new P<VkMemoryHeap> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 public void size(long size){
		 this.size = size;
		 setSize0(this.ptr,  size);
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
	 * Set method for field flags	[int]<br>
	 * Prototype: VkMemoryHeapFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkMemoryHeapFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native void setSize0(Buffer ptr, long _size);/*
		  VkMemoryHeap* vkObj = (VkMemoryHeap*)(ptr);
		  vkObj->size = (VkDeviceSize) (_size);
	  */

	/**
	 * native GET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native long getSize0(Buffer ptr);/*
		  VkMemoryHeap* vkObj = (VkMemoryHeap*)(ptr);
		  return (jlong) (vkObj->size);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkMemoryHeapFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkMemoryHeap* vkObj = (VkMemoryHeap*)(ptr);
		  vkObj->flags = (VkMemoryHeapFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkMemoryHeapFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkMemoryHeap* vkObj = (VkMemoryHeap*)(ptr);
		  return (jint) (vkObj->flags);
	 */



} // end of class VkMemoryHeap
