/**
 * Class wrapping Vulkan's VkImageMemoryBarrier struct.
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
 *  This class is a Java front end for struct VkImageMemoryBarrier. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkImageMemoryBarrier {
 *     VkStructureType            sType;
 *     const void*                pNext;
 *     VkAccessFlags              srcAccessMask;
 *     VkAccessFlags              dstAccessMask;
 *     VkImageLayout              oldLayout;
 *     VkImageLayout              newLayout;
 *     uint32_t                   srcQueueFamilyIndex;
 *     uint32_t                   dstQueueFamilyIndex;
 *     VkImage                    image;
 *     VkImageSubresourceRange    subresourceRange;
 * } VkImageMemoryBarrier;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkImageMemoryBarrier extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [101]  */
	 private static final String TAG = "VkImageMemoryBarrier";

	/** ID of this structure [101]  */
	 public static final int TAG_ID = VKIMAGEMEMORYBARRIER_ID;

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
	 *  VkAccessFlags 	srcAccessMask	[int]
	 */ 
	int 	srcAccessMask;
	
	/**
	 *  VkAccessFlags 	dstAccessMask	[int]
	 */ 
	int 	dstAccessMask;
	
	/**
	 *  VkImageLayout 	oldLayout	[vkenum]
	 */ 
	VkImageLayout 	oldLayout;
	
	/**
	 *  VkImageLayout 	newLayout	[vkenum]
	 */ 
	VkImageLayout 	newLayout;
	
	/**
	 *  uint32_t 	srcQueueFamilyIndex	[int]
	 */ 
	int 	srcQueueFamilyIndex;
	
	/**
	 *  uint32_t 	dstQueueFamilyIndex	[int]
	 */ 
	int 	dstQueueFamilyIndex;
	
	/**
	 *  VkImage 	image	[vkhandle]
	 */ 
	VkImage 	image;
	
	/**
	 *  VkImageSubresourceRange 	subresourceRange	[vkstruct]
	 */ 
	VkImageSubresourceRange 	subresourceRange;
	/**
	 * Ctor
	 */
	public VkImageMemoryBarrier(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkImageMemoryBarrier(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkImageMemoryBarrier(long address){ 
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
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 * 
	 * @param sType - a instance of VkStructureType.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageMemoryBarrier sType(VkStructureType sType){
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
	 public VkImageMemoryBarrier pNext(VkObject pNext){
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
	 * Set method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 * 
	 * @param srcAccessMask - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageMemoryBarrier srcAccessMask(int srcAccessMask){
		 this.srcAccessMask = srcAccessMask;
		 setSrcAccessMask0(this.ptr,  srcAccessMask);
		 return this;
	 }

	/**
	 * Get method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 public int srcAccessMask(){
		 int var = getSrcAccessMask0(super.ptr);
		 this.srcAccessMask = var;
		 return this.srcAccessMask;
	 }

	/**
	 * Set method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 * 
	 * @param dstAccessMask - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageMemoryBarrier dstAccessMask(int dstAccessMask){
		 this.dstAccessMask = dstAccessMask;
		 setDstAccessMask0(this.ptr,  dstAccessMask);
		 return this;
	 }

	/**
	 * Get method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 public int dstAccessMask(){
		 int var = getDstAccessMask0(super.ptr);
		 this.dstAccessMask = var;
		 return this.dstAccessMask;
	 }

	/**
	 * Set method for field oldLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  oldLayout
	 * 
	 * @param oldLayout - a instance of VkImageLayout.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageMemoryBarrier oldLayout(VkImageLayout oldLayout){
		 this.oldLayout = oldLayout;
		 int enumVal = oldLayout.getValue();
		 setOldLayout0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field oldLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  oldLayout
	 */ 
	 public VkImageLayout oldLayout(){
		 int nativeVal = getOldLayout0(super.ptr);
		 this.oldLayout = VkImageLayout.fromValue(nativeVal); 
		 return this.oldLayout;
	 }

	/**
	 * Set method for field newLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  newLayout
	 * 
	 * @param newLayout - a instance of VkImageLayout.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageMemoryBarrier newLayout(VkImageLayout newLayout){
		 this.newLayout = newLayout;
		 int enumVal = newLayout.getValue();
		 setNewLayout0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field newLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  newLayout
	 */ 
	 public VkImageLayout newLayout(){
		 int nativeVal = getNewLayout0(super.ptr);
		 this.newLayout = VkImageLayout.fromValue(nativeVal); 
		 return this.newLayout;
	 }

	/**
	 * Set method for field srcQueueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  srcQueueFamilyIndex
	 * 
	 * @param srcQueueFamilyIndex - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageMemoryBarrier srcQueueFamilyIndex(int srcQueueFamilyIndex){
		 this.srcQueueFamilyIndex = srcQueueFamilyIndex;
		 setSrcQueueFamilyIndex0(this.ptr,  srcQueueFamilyIndex);
		 return this;
	 }

	/**
	 * Get method for field srcQueueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  srcQueueFamilyIndex
	 */ 
	 public int srcQueueFamilyIndex(){
		 int var = getSrcQueueFamilyIndex0(super.ptr);
		 this.srcQueueFamilyIndex = var;
		 return this.srcQueueFamilyIndex;
	 }

	/**
	 * Set method for field dstQueueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  dstQueueFamilyIndex
	 * 
	 * @param dstQueueFamilyIndex - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageMemoryBarrier dstQueueFamilyIndex(int dstQueueFamilyIndex){
		 this.dstQueueFamilyIndex = dstQueueFamilyIndex;
		 setDstQueueFamilyIndex0(this.ptr,  dstQueueFamilyIndex);
		 return this;
	 }

	/**
	 * Get method for field dstQueueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  dstQueueFamilyIndex
	 */ 
	 public int dstQueueFamilyIndex(){
		 int var = getDstQueueFamilyIndex0(super.ptr);
		 this.dstQueueFamilyIndex = var;
		 return this.dstQueueFamilyIndex;
	 }

	/**
	 * Set method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 * 
	 * @param image - a instance of VkImage.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageMemoryBarrier image(VkImage image){
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
	 * Set method for field subresourceRange	[vkstruct]<br>
	 * Prototype: VkImageSubresourceRange  subresourceRange
	 * 
	 * @param subresourceRange - a instance of VkImageSubresourceRange.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageMemoryBarrier subresourceRange(VkImageSubresourceRange subresourceRange){
		 this.subresourceRange = subresourceRange;
		 ByteBuffer buff = (subresourceRange==null) ? null : subresourceRange.getPointer();
		 setSubresourceRange0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field subresourceRange	[vkstruct]<br>
	 * Prototype: VkImageSubresourceRange  subresourceRange
	 */ 
	 public VkImageSubresourceRange subresourceRange(){
		 long pointer = getSubresourceRange0(super.ptr);
		 if(pointer == 0){
		    this.subresourceRange = null;
		    return null;
		  } 

		 if(this.subresourceRange == null){
		    this.subresourceRange = new VkImageSubresourceRange(pointer);
		 }else{
		    this.subresourceRange.setPointer(pointer);
		  }
		 return this.subresourceRange;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkImageMemoryBarrier [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n srcAccessMask: ")
				.append(srcAccessMask() )
				.append(",\n dstAccessMask: ")
				.append(dstAccessMask() )
				.append(",\n oldLayout: ")
				.append(oldLayout() )
				.append(",\n newLayout: ")
				.append(newLayout() )
				.append(",\n srcQueueFamilyIndex: ")
				.append(srcQueueFamilyIndex() )
				.append(",\n dstQueueFamilyIndex: ")
				.append(dstQueueFamilyIndex() )
				.append(",\n image: ")
				.append(image() )
				.append(",\n subresourceRange: ")
				.append(subresourceRange() )
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
		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 private static native void setSrcAccessMask0(Buffer ptr, int _srcAccessMask);/*
		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->srcAccessMask = (VkAccessFlags) (_srcAccessMask);
	  */

	/**
	 * Native GET method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 private static native int getSrcAccessMask0(Buffer ptr);/*
		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		  return (jint) (vkObj->srcAccessMask);
	 */

	/**
	 * Native SET method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 private static native void setDstAccessMask0(Buffer ptr, int _dstAccessMask);/*
		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->dstAccessMask = (VkAccessFlags) (_dstAccessMask);
	  */

	/**
	 * Native GET method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 private static native int getDstAccessMask0(Buffer ptr);/*
		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		  return (jint) (vkObj->dstAccessMask);
	 */

	/**
	 * Native SET method for field oldLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  oldLayout
	 */ 
	 private static native void setOldLayout0(Buffer ptr, int  _oldLayout);/*
		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->oldLayout = (VkImageLayout) (_oldLayout);
	  */

	/**
	 * Native GET method for field oldLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  oldLayout
	 */ 
	 private static native int  getOldLayout0(Buffer ptr);/*
		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		  return (VkImageLayout) (vkObj->oldLayout);
	 */

	/**
	 * Native SET method for field newLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  newLayout
	 */ 
	 private static native void setNewLayout0(Buffer ptr, int  _newLayout);/*
		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->newLayout = (VkImageLayout) (_newLayout);
	  */

	/**
	 * Native GET method for field newLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  newLayout
	 */ 
	 private static native int  getNewLayout0(Buffer ptr);/*
		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		  return (VkImageLayout) (vkObj->newLayout);
	 */

	/**
	 * Native SET method for field srcQueueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  srcQueueFamilyIndex
	 */ 
	 private static native void setSrcQueueFamilyIndex0(Buffer ptr, int _srcQueueFamilyIndex);/*
		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->srcQueueFamilyIndex = (uint32_t) (_srcQueueFamilyIndex);
	  */

	/**
	 * Native GET method for field srcQueueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  srcQueueFamilyIndex
	 */ 
	 private static native int getSrcQueueFamilyIndex0(Buffer ptr);/*
		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		  return (jint) (vkObj->srcQueueFamilyIndex);
	 */

	/**
	 * Native SET method for field dstQueueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  dstQueueFamilyIndex
	 */ 
	 private static native void setDstQueueFamilyIndex0(Buffer ptr, int _dstQueueFamilyIndex);/*
		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->dstQueueFamilyIndex = (uint32_t) (_dstQueueFamilyIndex);
	  */

	/**
	 * Native GET method for field dstQueueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  dstQueueFamilyIndex
	 */ 
	 private static native int getDstQueueFamilyIndex0(Buffer ptr);/*
		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		  return (jint) (vkObj->dstQueueFamilyIndex);
	 */

	/**
	 * Native SET method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 */ 
	 private static native void setImage0(Buffer ptr, long  _image);/*
		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->image = (VkImage) (_image);
	  */

	/**
	 * Native GET method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 */ 
	 private static native long getImage0(Buffer ptr);/*
		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->image);
	 */

	/**
	 * Native SET method for field subresourceRange	[vkstruct]<br>
	 * Prototype: VkImageSubresourceRange  subresourceRange
	 */ 
	 private static native void setSubresourceRange0(Buffer ptr, java.nio.ByteBuffer  _subresourceRange);/*
		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->subresourceRange = (VkImageSubresourceRange) (_subresourceRange);
	  */

	/**
	 * Native GET method for field subresourceRange	[vkstruct]<br>
	 * Prototype: VkImageSubresourceRange  subresourceRange
	 */ 
	 private static native long getSubresourceRange0(Buffer ptr);/*
		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->subresourceRange);
	 */



} // end of class VkImageMemoryBarrier
