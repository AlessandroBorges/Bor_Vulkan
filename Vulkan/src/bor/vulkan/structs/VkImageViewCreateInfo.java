/**
 * Class wrapping Vulkan's VkImageViewCreateInfo struct.
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
 *  This class is a Java front end for struct VkImageViewCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkImageViewCreateInfo {
 *     VkStructureType            sType;
 *     const void*                pNext;
 *     VkImageViewCreateFlags     flags;
 *     VkImage                    image;
 *     VkImageViewType            viewType;
 *     VkFormat                   format;
 *     VkComponentMapping         components;
 *     VkImageSubresourceRange    subresourceRange;
 * } VkImageViewCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkImageViewCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [43]  */
	 private static final String TAG = "VkImageViewCreateInfo";

	/** ID of this structure [43]  */
	 public static final int TAG_ID = VKIMAGEVIEWCREATEINFO_ID;

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
	 *  VkImageViewCreateFlags 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  VkImage 	image	[vkhandle]
	 */ 
	VkImage 	image;
	
	/**
	 *  VkImageViewType 	viewType	[vkenum]
	 */ 
	VkImageViewType 	viewType;
	
	/**
	 *  VkFormat 	format	[vkenum]
	 */ 
	VkFormat 	format;
	
	/**
	 *  VkComponentMapping 	components	[vkstruct]
	 */ 
	VkComponentMapping 	components;
	
	/**
	 *  VkImageSubresourceRange 	subresourceRange	[vkstruct]
	 */ 
	VkImageSubresourceRange 	subresourceRange;
	/**
	 * Ctor
	 */
	public VkImageViewCreateInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkImageViewCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkImageViewCreateInfo(long address){ 
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
	 public static VkArray<VkImageViewCreateInfo> createVkArray(int size){ 
		 VkImageViewCreateInfo[] array = new VkImageViewCreateInfo[size]; 
		 VkArrayStruct<VkImageViewCreateInfo> vkArray = new VkArrayStruct<VkImageViewCreateInfo>(array, TAG_ID);
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
	 public VkImageViewCreateInfo sType(VkStructureType sType){
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
	 public VkImageViewCreateInfo pNext(VkObject pNext){
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
	 * Set method for field flags	[int]<br>
	 * Prototype: VkImageViewCreateFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageViewCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkImageViewCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 * 
	 * @param image - a instance of VkImage.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageViewCreateInfo image(VkImage image){
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
	 * Set method for field viewType	[vkenum]<br>
	 * Prototype: VkImageViewType  viewType
	 * 
	 * @param viewType - a instance of VkImageViewType.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageViewCreateInfo viewType(VkImageViewType viewType){
		 this.viewType = viewType;
		 int enumVal = viewType.getValue();
		 setViewType0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field viewType	[vkenum]<br>
	 * Prototype: VkImageViewType  viewType
	 */ 
	 public VkImageViewType viewType(){
		 int nativeVal = getViewType0(super.ptr);
		 this.viewType = VkImageViewType.fromValue(nativeVal); 
		 return this.viewType;
	 }

	/**
	 * Set method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 * 
	 * @param format - a instance of VkFormat.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageViewCreateInfo format(VkFormat format){
		 this.format = format;
		 int enumVal = format.getValue();
		 setFormat0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 public VkFormat format(){
		 int nativeVal = getFormat0(super.ptr);
		 this.format = VkFormat.fromValue(nativeVal); 
		 return this.format;
	 }

	/**
	 * Set method for field components	[vkstruct]<br>
	 * Prototype: VkComponentMapping  components
	 * 
	 * @param components - a instance of VkComponentMapping.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageViewCreateInfo components(VkComponentMapping components){
		 this.components = components;
		 ByteBuffer buff = (components==null) ? null : components.getPointer();
		 setComponents0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field components	[vkstruct]<br>
	 * Prototype: VkComponentMapping  components
	 */ 
	 public VkComponentMapping components(){
		 long pointer = getComponents0(super.ptr);
		 if(pointer == 0){
		    this.components = null;
		    return null;
		  } 

		 if(this.components == null){
		    this.components = new VkComponentMapping(pointer);
		 }else{
		    this.components.setPointer(pointer);
		  }
		 return this.components;
	 }

	/**
	 * Set method for field subresourceRange	[vkstruct]<br>
	 * Prototype: VkImageSubresourceRange  subresourceRange
	 * 
	 * @param subresourceRange - a instance of VkImageSubresourceRange.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageViewCreateInfo subresourceRange(VkImageSubresourceRange subresourceRange){
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
         builder.append("VkImageViewCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n image: ")
				.append(image() )
				.append(",\n viewType: ")
				.append(viewType() )
				.append(",\n format: ")
				.append(format() )
				.append(",\n components: ")
				.append(components() )
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
		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkImageViewCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkImageViewCreateFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkImageViewCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 */ 
	 private static native void setImage0(Buffer ptr, long  _image);/*
		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->image = (VkImage) (_image);
	  */

	/**
	 * Native GET method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 */ 
	 private static native long getImage0(Buffer ptr);/*
		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->image);
	 */

	/**
	 * Native SET method for field viewType	[vkenum]<br>
	 * Prototype: VkImageViewType  viewType
	 */ 
	 private static native void setViewType0(Buffer ptr, int  _viewType);/*
		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->viewType = (VkImageViewType) (_viewType);
	  */

	/**
	 * Native GET method for field viewType	[vkenum]<br>
	 * Prototype: VkImageViewType  viewType
	 */ 
	 private static native int getViewType0(Buffer ptr);/*
		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->viewType);
	 */

	/**
	 * Native SET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native void setFormat0(Buffer ptr, int  _format);/*
		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->format = (VkFormat) (_format);
	  */

	/**
	 * Native GET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native int getFormat0(Buffer ptr);/*
		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->format);
	 */

	/**
	 * Native SET method for field components	[vkstruct]<br>
	 * Prototype: VkComponentMapping  components
	 */ 
	 private static native void setComponents0(Buffer ptr, java.nio.ByteBuffer  _components);/*
		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkComponentMapping* p_components = (VkComponentMapping*) _components; 
		 vkObj->components = (*p_components); 
	  */

	/**
	 * Native GET method for field components	[vkstruct]<br>
	 * Prototype: VkComponentMapping  components
	 */ 
	 private static native long getComponents0(Buffer ptr);/*
		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->components);
	 */

	/**
	 * Native SET method for field subresourceRange	[vkstruct]<br>
	 * Prototype: VkImageSubresourceRange  subresourceRange
	 */ 
	 private static native void setSubresourceRange0(Buffer ptr, java.nio.ByteBuffer  _subresourceRange);/*
		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkImageSubresourceRange* p_subresourceRange = (VkImageSubresourceRange*) _subresourceRange; 
		 vkObj->subresourceRange = (*p_subresourceRange); 
	  */

	/**
	 * Native GET method for field subresourceRange	[vkstruct]<br>
	 * Prototype: VkImageSubresourceRange  subresourceRange
	 */ 
	 private static native long getSubresourceRange0(Buffer ptr);/*
		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->subresourceRange);
	 */



} // end of class VkImageViewCreateInfo
