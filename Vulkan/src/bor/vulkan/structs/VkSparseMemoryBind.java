/**
 * Class wrapping Vulkan's VkSparseMemoryBind struct.
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
 *  This class is a Java front end for struct VkSparseMemoryBind. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSparseMemoryBind {
 *     VkDeviceSize               resourceOffset;
 *     VkDeviceSize               size;
 *     VkDeviceMemory             memory;
 *     VkDeviceSize               memoryOffset;
 *     VkSparseMemoryBindFlags    flags;
 * } VkSparseMemoryBind;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkSparseMemoryBind extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [25]  */
	 private static final String TAG = "VkSparseMemoryBind";

	/** ID of this structure [25]  */
	 public static final int TAG_ID = VKSPARSEMEMORYBIND_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkDeviceSize 	resourceOffset	[long]
	 */ 
	long 	resourceOffset;
	
	/**
	 *  VkDeviceSize 	size	[long]
	 */ 
	long 	size;
	
	/**
	 *  VkDeviceMemory 	memory	[vkhandle]
	 */ 
	VkDeviceMemory 	memory;
	
	/**
	 *  VkDeviceSize 	memoryOffset	[long]
	 */ 
	long 	memoryOffset;
	
	/**
	 *  VkSparseMemoryBindFlags 	flags	[int]
	 */ 
	int 	flags;
	/**
	 * Ctor
	 */
	public VkSparseMemoryBind(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSparseMemoryBind(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkSparseMemoryBind(long address){ 
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
	 * Set method for field resourceOffset	[long]<br>
	 * Prototype: VkDeviceSize  resourceOffset
	 * 
	 * @param resourceOffset - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkSparseMemoryBind resourceOffset(long resourceOffset){
		 this.resourceOffset = resourceOffset;
		 setResourceOffset0(this.ptr,  resourceOffset);
		 return this;
	 }

	/**
	 * Get method for field resourceOffset	[long]<br>
	 * Prototype: VkDeviceSize  resourceOffset
	 */ 
	 public long resourceOffset(){
		 long var = getResourceOffset0(super.ptr);
		 this.resourceOffset = var;
		 return this.resourceOffset;
	 }

	/**
	 * Set method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 * 
	 * @param size - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkSparseMemoryBind size(long size){
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
	 * Set method for field memory	[vkhandle]<br>
	 * Prototype: VkDeviceMemory  memory
	 * 
	 * @param memory - a instance of VkDeviceMemory.
	 * @return this VkStruct instance.
	 */ 
	 public VkSparseMemoryBind memory(VkDeviceMemory memory){
		 this.memory = memory;
		 long handle = (memory==null) ? 0L : memory.getNativeHandle();
		 setMemory0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field memory	[vkhandle]<br>
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 public VkDeviceMemory memory(){

		 long handle = getMemory0(super.ptr);
		 if(handle == 0){
		    this.memory = null;
		    return null;
		  }  

		 if(this.memory == null){
		    this.memory = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.memory).setNativeHandle(handle);
		  }
		 return this.memory;
	 }

	/**
	 * Set method for field memoryOffset	[long]<br>
	 * Prototype: VkDeviceSize  memoryOffset
	 * 
	 * @param memoryOffset - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkSparseMemoryBind memoryOffset(long memoryOffset){
		 this.memoryOffset = memoryOffset;
		 setMemoryOffset0(this.ptr,  memoryOffset);
		 return this;
	 }

	/**
	 * Get method for field memoryOffset	[long]<br>
	 * Prototype: VkDeviceSize  memoryOffset
	 */ 
	 public long memoryOffset(){
		 long var = getMemoryOffset0(super.ptr);
		 this.memoryOffset = var;
		 return this.memoryOffset;
	 }

	/**
	 * Set method for field flags	[int]<br>
	 * Prototype: VkSparseMemoryBindFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSparseMemoryBind flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkSparseMemoryBindFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkSparseMemoryBind [ ")
				.append("resourceOffset: ").append(resourceOffset() )
				.append(",\n size: ")
				.append(size() )
				.append(",\n memory: ")
				.append(memory() )
				.append(",\n memoryOffset: ")
				.append(memoryOffset() )
				.append(",\n flags: ")
				.append(flags() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field resourceOffset	[long]<br>
	 * Prototype: VkDeviceSize  resourceOffset
	 */ 
	 private static native void setResourceOffset0(Buffer ptr, long _resourceOffset);/*
		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		 // code for simple past value 
		  vkObj->resourceOffset = (VkDeviceSize) (_resourceOffset);
	  */

	/**
	 * Native GET method for field resourceOffset	[long]<br>
	 * Prototype: VkDeviceSize  resourceOffset
	 */ 
	 private static native long getResourceOffset0(Buffer ptr);/*
		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		  return (jlong) (vkObj->resourceOffset);
	 */

	/**
	 * Native SET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native void setSize0(Buffer ptr, long _size);/*
		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		 // code for simple past value 
		  vkObj->size = (VkDeviceSize) (_size);
	  */

	/**
	 * Native GET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native long getSize0(Buffer ptr);/*
		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		  return (jlong) (vkObj->size);
	 */

	/**
	 * Native SET method for field memory	[vkhandle]<br>
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 private static native void setMemory0(Buffer ptr, long  _memory);/*
		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		 // code for simple past value 
		  vkObj->memory = (VkDeviceMemory) (_memory);
	  */

	/**
	 * Native GET method for field memory	[vkhandle]<br>
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 private static native long getMemory0(Buffer ptr);/*
		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->memory);
	 */

	/**
	 * Native SET method for field memoryOffset	[long]<br>
	 * Prototype: VkDeviceSize  memoryOffset
	 */ 
	 private static native void setMemoryOffset0(Buffer ptr, long _memoryOffset);/*
		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		 // code for simple past value 
		  vkObj->memoryOffset = (VkDeviceSize) (_memoryOffset);
	  */

	/**
	 * Native GET method for field memoryOffset	[long]<br>
	 * Prototype: VkDeviceSize  memoryOffset
	 */ 
	 private static native long getMemoryOffset0(Buffer ptr);/*
		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		  return (jlong) (vkObj->memoryOffset);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkSparseMemoryBindFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkSparseMemoryBindFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkSparseMemoryBindFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		  return (jint) (vkObj->flags);
	 */



} // end of class VkSparseMemoryBind
