// class wrapping Vulkan's VkMemoryHeap struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkMemoryHeap 
 * @Author Alessandro Borges 
 */
public class VkMemoryHeap extends VkStruct {
	/** ID of this structure [13]  */
	 public static final int TAG = VKMEMORYHEAP_ID;

	 // fields //
	/**
	 *  VkDeviceSize 	size 
	 */ 
	long 	size;

	/**
	 *  VkMemoryHeapFlags 	flags 
	 */ 
	int 	flags;

	/**
	 * Ctor
	 */
	public VkMemoryHeap(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG); 
	}


	 // /////////////////////
	 //  SETTERS & GETTERS //
	 // /////////////////////

	/**
	 * Set method for field size
	 * Prototype: VkDeviceSize  size
	 */ 
	 public void size(long size){
		 this.size = size;
		size0(super.ptr, size);
	 }

	/**
	 * get method for field size
	 * Prototype: VkDeviceSize  size
	 */ 
	 public long size(){
		 // return  this.size;
		 return size0(super.ptr);
	 }

	/**
	 * Set method for field flags
	 * Prototype: VkMemoryHeapFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkMemoryHeapFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field size
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native void size0(ByteBuffer ptr, long _size);/*
		  VkMemoryHeap _obj = (VkMemoryHeap)(*ptr);
		  _obj.size = (VkDeviceSize) (_size);
	  */

	/**
	 * get method for field size
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native long size0(ByteBuffer ptr);/*
		  VkMemoryHeap _obj = (VkMemoryHeap)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkMemoryHeapFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkMemoryHeap _obj = (VkMemoryHeap)(*ptr);
		  _obj.flags = (VkMemoryHeapFlags) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkMemoryHeapFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkMemoryHeap _obj = (VkMemoryHeap)(ptr);
		  return (jint) (_obj.VkMemoryHeapFlags);
	 */



} // end of class VkMemoryHeap
