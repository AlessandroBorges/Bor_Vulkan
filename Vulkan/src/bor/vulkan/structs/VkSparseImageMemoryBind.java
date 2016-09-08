/**
 * Class wrapping Vulkan's VkSparseImageMemoryBind struct.
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
 *  This class is a Java front end for struct VkSparseImageMemoryBind. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSparseImageMemoryBind {
 *     VkImageSubresource         subresource;
 *     VkOffset3D                 offset;
 *     VkExtent3D                 extent;
 *     VkDeviceMemory             memory;
 *     VkDeviceSize               memoryOffset;
 *     VkSparseMemoryBindFlags    flags;
 * } VkSparseImageMemoryBind;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkSparseImageMemoryBind extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [30]  */
	 private static final String TAG = "VkSparseImageMemoryBind";

	/** ID of this structure [30]  */
	 public static final int TAG_ID = VKSPARSEIMAGEMEMORYBIND_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkImageSubresource 	subresource	[vkstruct]
	 */ 
	VkImageSubresource 	subresource;
	
	/**
	 *  VkOffset3D 	offset	[vkstruct]
	 */ 
	VkOffset3D 	offset;
	
	/**
	 *  VkExtent3D 	extent	[vkstruct]
	 */ 
	VkExtent3D 	extent;
	
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
	public VkSparseImageMemoryBind(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSparseImageMemoryBind(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkSparseImageMemoryBind(long address){ 
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

	/** 
	 * Static method to create a VkArray for this VkStruct subclass.
	 * @param size - number of elements
	 */
	 public static VkArray<VkSparseImageMemoryBind> createVkArray(int size){ 
		 VkSparseImageMemoryBind[] array = new VkSparseImageMemoryBind[size]; 
		 VkArrayStruct<VkSparseImageMemoryBind> vkArray = new VkArrayStruct<VkSparseImageMemoryBind>(array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field subresource	[vkstruct]<br>
	 * Prototype: VkImageSubresource  subresource
	 * 
	 * @param subresource - a instance of VkImageSubresource.
	 * @return this VkStruct instance.
	 */ 
	 public VkSparseImageMemoryBind subresource(VkImageSubresource subresource){
		 this.subresource = subresource;
		 ByteBuffer buff = (subresource==null) ? null : subresource.getPointer();
		 setSubresource0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field subresource	[vkstruct]<br>
	 * Prototype: VkImageSubresource  subresource
	 */ 
	 public VkImageSubresource subresource(){
		 long pointer = getSubresource0(super.ptr);
		 if(pointer == 0){
		    this.subresource = null;
		    return null;
		  } 

		 if(this.subresource == null){
		    this.subresource = new VkImageSubresource(pointer);
		 }else{
		    this.subresource.setPointer(pointer);
		  }
		 return this.subresource;
	 }

	/**
	 * Set method for field offset	[vkstruct]<br>
	 * Prototype: VkOffset3D  offset
	 * 
	 * @param offset - a instance of VkOffset3D.
	 * @return this VkStruct instance.
	 */ 
	 public VkSparseImageMemoryBind offset(VkOffset3D offset){
		 this.offset = offset;
		 ByteBuffer buff = (offset==null) ? null : offset.getPointer();
		 setOffset0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field offset	[vkstruct]<br>
	 * Prototype: VkOffset3D  offset
	 */ 
	 public VkOffset3D offset(){
		 long pointer = getOffset0(super.ptr);
		 if(pointer == 0){
		    this.offset = null;
		    return null;
		  } 

		 if(this.offset == null){
		    this.offset = new VkOffset3D(pointer);
		 }else{
		    this.offset.setPointer(pointer);
		  }
		 return this.offset;
	 }

	/**
	 * Set method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 * 
	 * @param extent - a instance of VkExtent3D.
	 * @return this VkStruct instance.
	 */ 
	 public VkSparseImageMemoryBind extent(VkExtent3D extent){
		 this.extent = extent;
		 ByteBuffer buff = (extent==null) ? null : extent.getPointer();
		 setExtent0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 public VkExtent3D extent(){
		 long pointer = getExtent0(super.ptr);
		 if(pointer == 0){
		    this.extent = null;
		    return null;
		  } 

		 if(this.extent == null){
		    this.extent = new VkExtent3D(pointer);
		 }else{
		    this.extent.setPointer(pointer);
		  }
		 return this.extent;
	 }

	/**
	 * Set method for field memory	[vkhandle]<br>
	 * Prototype: VkDeviceMemory  memory
	 * 
	 * @param memory - a instance of VkDeviceMemory.
	 * @return this VkStruct instance.
	 */ 
	 public VkSparseImageMemoryBind memory(VkDeviceMemory memory){
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
	 public VkSparseImageMemoryBind memoryOffset(long memoryOffset){
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
	 public VkSparseImageMemoryBind flags(int flags){
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
         builder.append("VkSparseImageMemoryBind [ ")
				.append("subresource: ").append(subresource() )
				.append(",\n offset: ")
				.append(offset() )
				.append(",\n extent: ")
				.append(extent() )
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
	 * Native SET method for field subresource	[vkstruct]<br>
	 * Prototype: VkImageSubresource  subresource
	 */ 
	 private static native void setSubresource0(Buffer ptr, java.nio.ByteBuffer  _subresource);/*
		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkImageSubresource* p_subresource = (VkImageSubresource*) _subresource; 
		 vkObj->subresource = (*p_subresource); 
	  */

	/**
	 * Native GET method for field subresource	[vkstruct]<br>
	 * Prototype: VkImageSubresource  subresource
	 */ 
	 private static native long getSubresource0(Buffer ptr);/*
		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->subresource);
	 */

	/**
	 * Native SET method for field offset	[vkstruct]<br>
	 * Prototype: VkOffset3D  offset
	 */ 
	 private static native void setOffset0(Buffer ptr, java.nio.ByteBuffer  _offset);/*
		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkOffset3D* p_offset = (VkOffset3D*) _offset; 
		 vkObj->offset = (*p_offset); 
	  */

	/**
	 * Native GET method for field offset	[vkstruct]<br>
	 * Prototype: VkOffset3D  offset
	 */ 
	 private static native long getOffset0(Buffer ptr);/*
		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->offset);
	 */

	/**
	 * Native SET method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 private static native void setExtent0(Buffer ptr, java.nio.ByteBuffer  _extent);/*
		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent3D* p_extent = (VkExtent3D*) _extent; 
		 vkObj->extent = (*p_extent); 
	  */

	/**
	 * Native GET method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 private static native long getExtent0(Buffer ptr);/*
		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->extent);
	 */

	/**
	 * Native SET method for field memory	[vkhandle]<br>
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 private static native void setMemory0(Buffer ptr, long  _memory);/*
		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		 // code for simple past value 
		  vkObj->memory = (VkDeviceMemory) (_memory);
	  */

	/**
	 * Native GET method for field memory	[vkhandle]<br>
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 private static native long getMemory0(Buffer ptr);/*
		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->memory);
	 */

	/**
	 * Native SET method for field memoryOffset	[long]<br>
	 * Prototype: VkDeviceSize  memoryOffset
	 */ 
	 private static native void setMemoryOffset0(Buffer ptr, long _memoryOffset);/*
		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		 // code for simple past value 
		  vkObj->memoryOffset = (VkDeviceSize) (_memoryOffset);
	  */

	/**
	 * Native GET method for field memoryOffset	[long]<br>
	 * Prototype: VkDeviceSize  memoryOffset
	 */ 
	 private static native long getMemoryOffset0(Buffer ptr);/*
		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		  return (jlong) (vkObj->memoryOffset);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkSparseMemoryBindFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkSparseMemoryBindFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkSparseMemoryBindFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		  return (jint) (vkObj->flags);
	 */



} // end of class VkSparseImageMemoryBind
