/**
 * Class wrapping Vulkan's VkDedicatedAllocationMemoryAllocateInfoNV struct.
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
 *  This class is a Java front end for struct VkDedicatedAllocationMemoryAllocateInfoNV. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDedicatedAllocationMemoryAllocateInfoNV {
 *     VkStructureType    sType;
 *     const void*        pNext;
 *     VkImage            image;
 *     VkBuffer           buffer;
 * } VkDedicatedAllocationMemoryAllocateInfoNV;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkDedicatedAllocationMemoryAllocateInfoNV extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [131]  */
	 private static final String TAG = "VkDedicatedAllocationMemoryAllocateInfoNV";

	/** ID of this structure [131]  */
	 public static final int TAG_ID = VKDEDICATEDALLOCATIONMEMORYALLOCATEINFONV_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkStructureType 	sType	[vkenum]
	 */ 
	VkStructureType 	sType;
	
	/**
	 *  const void* 	pNext	[vkobject]
	 */ 
	VkObject 	pNext;
	
	/**
	 *  VkImage 	image	[vkhandle]
	 */ 
	VkImage 	image;
	
	/**
	 *  VkBuffer 	buffer	[vkhandle]
	 */ 
	VkBuffer 	buffer;
	/**
	 * Ctor
	 */
	public VkDedicatedAllocationMemoryAllocateInfoNV(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDedicatedAllocationMemoryAllocateInfoNV(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDedicatedAllocationMemoryAllocateInfoNV(long address){ 
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
	 public static VkArray<VkDedicatedAllocationMemoryAllocateInfoNV> createVkArray(int size){ 
		 VkDedicatedAllocationMemoryAllocateInfoNV[] array = new VkDedicatedAllocationMemoryAllocateInfoNV[size]; 
		 VkArrayStruct<VkDedicatedAllocationMemoryAllocateInfoNV> vkArray = new VkArrayStruct<VkDedicatedAllocationMemoryAllocateInfoNV> (array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 * 
	 * @param sType - a instance of VkStructureType.
	 * @return this VkStruct instance.
	 */ 
	 public VkDedicatedAllocationMemoryAllocateInfoNV sType(VkStructureType sType){
		 this.sType = sType;
		 int enumVal = sType.getValue();
		 setSType0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = getSType0(super.ptr);
		 this.sType = VkStructureType.fromValue(nativeVal); 
		 return this.sType;
	 }

	/**
	 * Set method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 * 
	 * @param pNext - a instance of VkObject.
	 * @return this VkStruct instance.
	 */ 
	 public VkDedicatedAllocationMemoryAllocateInfoNV pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 setPNext0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 long pointer = getPNext0(super.ptr);
		 if(pointer == 0){
		    this.pNext = null;
		    return null;
		  } else 
		 if(this.pNext == null){
		    this.pNext = (VkObject)(new VkHandle(pointer));
		 }else{
		    this.pNext.setPointer(pointer);
		  }
		 return this.pNext;
	 }

	/**
	 * Set method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 * 
	 * @param image - a instance of VkImage.
	 * @return this VkStruct instance.
	 */ 
	 public VkDedicatedAllocationMemoryAllocateInfoNV image(VkImage image){
		 this.image = image;
		 long handle = (image==null) ? 0L : image.getNativeHandle();
		 setImage0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 */ 
	 public VkImage image(){

		 long handle = getImage0(super.ptr);
		 if(handle == 0){
		    this.image = null;
		    return null;
		  }  

		 if(this.image == null){
		    this.image = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.image).setNativeHandle(handle);
		  }
		 return this.image;
	 }

	/**
	 * Set method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 * 
	 * @param buffer - a instance of VkBuffer.
	 * @return this VkStruct instance.
	 */ 
	 public VkDedicatedAllocationMemoryAllocateInfoNV buffer(VkBuffer buffer){
		 this.buffer = buffer;
		 long handle = (buffer==null) ? 0L : buffer.getNativeHandle();
		 setBuffer0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 public VkBuffer buffer(){

		 long handle = getBuffer0(super.ptr);
		 if(handle == 0){
		    this.buffer = null;
		    return null;
		  }  

		 if(this.buffer == null){
		    this.buffer = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.buffer).setNativeHandle(handle);
		  }
		 return this.buffer;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkDedicatedAllocationMemoryAllocateInfoNV [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n image: ")
				.append(image() )
				.append(",\n buffer: ")
				.append(buffer() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkDedicatedAllocationMemoryAllocateInfoNV* vkObj = (VkDedicatedAllocationMemoryAllocateInfoNV*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkDedicatedAllocationMemoryAllocateInfoNV* vkObj = (VkDedicatedAllocationMemoryAllocateInfoNV*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDedicatedAllocationMemoryAllocateInfoNV* vkObj = (VkDedicatedAllocationMemoryAllocateInfoNV*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkDedicatedAllocationMemoryAllocateInfoNV* vkObj = (VkDedicatedAllocationMemoryAllocateInfoNV*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 */ 
	 private static native void setImage0(Buffer ptr, long  _image);/*
		  VkDedicatedAllocationMemoryAllocateInfoNV* vkObj = (VkDedicatedAllocationMemoryAllocateInfoNV*)(ptr);
		 // code for simple past value 
		  vkObj->image = (VkImage) (_image);
	  */

	/**
	 * Native GET method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 */ 
	 private static native long getImage0(Buffer ptr);/*
		  VkDedicatedAllocationMemoryAllocateInfoNV* vkObj = (VkDedicatedAllocationMemoryAllocateInfoNV*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->image);
	 */

	/**
	 * Native SET method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native void setBuffer0(Buffer ptr, long  _buffer);/*
		  VkDedicatedAllocationMemoryAllocateInfoNV* vkObj = (VkDedicatedAllocationMemoryAllocateInfoNV*)(ptr);
		 // code for simple past value 
		  vkObj->buffer = (VkBuffer) (_buffer);
	  */

	/**
	 * Native GET method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native long getBuffer0(Buffer ptr);/*
		  VkDedicatedAllocationMemoryAllocateInfoNV* vkObj = (VkDedicatedAllocationMemoryAllocateInfoNV*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->buffer);
	 */



} // end of class VkDedicatedAllocationMemoryAllocateInfoNV
