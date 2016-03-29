/**
 * Class wrapping Vulkan's VkImageViewCreateInfo struct.
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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkImageViewCreateInfo extends VkStruct {
	/** TAG of this structure [43]  */
	 private static final String TAG = "VkImageViewCreateInfo";

	/** ID of this structure [43]  */
	 public static final int TAG_ID = VKIMAGEVIEWCREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkImageViewCreateInfo> p;

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
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkImageViewCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkImageViewCreateInfo(long address, int memSize){ 
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
	 public static P<VkImageViewCreateInfo> createNullPointer(){
	        P<VkImageViewCreateInfo> p = new  P<VkImageViewCreateInfo>(new VkImageViewCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkImageViewCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkImageViewCreateInfo> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		 int enumVal = sType.getValue();
		 sType0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = sType0(super.ptr);
		 this.sType = VkStructureType.fromValue(nativeVal); 
		 return this.sType;
	 }

	/**
	 * Set method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 pNext0(this.ptr, buff);
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 ByteBuffer pointer = pNext0(super.ptr);
		 if(pointer == null){
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
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 flags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkImageViewCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = flags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 */ 
	 public void image(VkImage image){
		 this.image = image;
		 ByteBuffer buff = (image==null) ? null : image.getHandle();
		 image0(this.ptr, buff);
	 }

	/**
	 * Get method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 */ 
	 public VkImage image(){

		 ByteBuffer handle = image0(super.ptr);
		 if(handle == null){
		    this.image = null;
		    return null;
		  } else 
 		 if(this.image == null){
		    this.image = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.image).setHandle(handle);
		  }
		 return this.image;
	 }

	/**
	 * Set method for field viewType	[vkenum]<br>
	 * Prototype: VkImageViewType  viewType
	 */ 
	 public void viewType(VkImageViewType viewType){
		 this.viewType = viewType;
		 int enumVal = viewType.getValue();
		 viewType0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field viewType	[vkenum]<br>
	 * Prototype: VkImageViewType  viewType
	 */ 
	 public VkImageViewType viewType(){
		 int nativeVal = viewType0(super.ptr);
		 this.viewType = VkImageViewType.fromValue(nativeVal); 
		 return this.viewType;
	 }

	/**
	 * Set method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 public void format(VkFormat format){
		 this.format = format;
		 int enumVal = format.getValue();
		 format0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 public VkFormat format(){
		 int nativeVal = format0(super.ptr);
		 this.format = VkFormat.fromValue(nativeVal); 
		 return this.format;
	 }

	/**
	 * Set method for field components	[vkstruct]<br>
	 * Prototype: VkComponentMapping  components
	 */ 
	 public void components(VkComponentMapping components){
		 this.components = components;
		 ByteBuffer buff = (components==null) ? null : components.getPointerStruct();
		 components0(this.ptr, buff);
	 }

	/**
	 * Get method for field components	[vkstruct]<br>
	 * Prototype: VkComponentMapping  components
	 */ 
	 public VkComponentMapping components(){
		 ByteBuffer pointer = components0(super.ptr);
		 if(pointer == null){
		    this.components = null;
		    return null;
		  } else 
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
	 */ 
	 public void subresourceRange(VkImageSubresourceRange subresourceRange){
		 this.subresourceRange = subresourceRange;
		 ByteBuffer buff = (subresourceRange==null) ? null : subresourceRange.getPointerStruct();
		 subresourceRange0(this.ptr, buff);
	 }

	/**
	 * Get method for field subresourceRange	[vkstruct]<br>
	 * Prototype: VkImageSubresourceRange  subresourceRange
	 */ 
	 public VkImageSubresourceRange subresourceRange(){
		 ByteBuffer pointer = subresourceRange0(super.ptr);
		 if(pointer == null){
		    this.subresourceRange = null;
		    return null;
		  } else 
 		 if(this.subresourceRange == null){
		    this.subresourceRange = new VkImageSubresourceRange(pointer);
		 }else{
		    this.subresourceRange.setPointer(pointer);
		  }
		 return this.subresourceRange;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkImageViewCreateInfo vkObj = (VkImageViewCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkImageViewCreateInfo vkObj = (VkImageViewCreateInfo*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkImageViewCreateFlags  flags
	 */ 
	 private static native void flags0(Buffer ptr, int _flags);/*
		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		  vkObj->flags = (VkImageViewCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkImageViewCreateFlags  flags
	 */ 
	 private static native int flags0(Buffer ptr);/*
		  VkImageViewCreateInfo vkObj = (VkImageViewCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 */ 
	 private static native void image0(Buffer ptr, java.nio.ByteBuffer  _image);/*
		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		  vkObj->image = (VkImage) (_image);
	  */

	/**
	 * native GET method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 */ 
	 private static native java.nio.ByteBuffer  image0(Buffer ptr);/*
		  VkImageViewCreateInfo vkObj = (VkImageViewCreateInfo*)(ptr);
		  return (VkImage) (vkObj->image);
	 */

	/**
	 * native SET method for field viewType	[vkenum]<br>
	 * Prototype: VkImageViewType  viewType
	 */ 
	 private static native void viewType0(Buffer ptr, int  _viewType);/*
		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		  vkObj->viewType = (VkImageViewType) (_viewType);
	  */

	/**
	 * native GET method for field viewType	[vkenum]<br>
	 * Prototype: VkImageViewType  viewType
	 */ 
	 private static native int  viewType0(Buffer ptr);/*
		  VkImageViewCreateInfo vkObj = (VkImageViewCreateInfo*)(ptr);
		  return (VkImageViewType) (vkObj->viewType);
	 */

	/**
	 * native SET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native void format0(Buffer ptr, int  _format);/*
		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		  vkObj->format = (VkFormat) (_format);
	  */

	/**
	 * native GET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native int  format0(Buffer ptr);/*
		  VkImageViewCreateInfo vkObj = (VkImageViewCreateInfo*)(ptr);
		  return (VkFormat) (vkObj->format);
	 */

	/**
	 * native SET method for field components	[vkstruct]<br>
	 * Prototype: VkComponentMapping  components
	 */ 
	 private static native void components0(Buffer ptr, java.nio.ByteBuffer  _components);/*
		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		  vkObj->components = (VkComponentMapping) (_components);
	  */

	/**
	 * native GET method for field components	[vkstruct]<br>
	 * Prototype: VkComponentMapping  components
	 */ 
	 private static native java.nio.ByteBuffer  components0(Buffer ptr);/*
		  VkImageViewCreateInfo vkObj = (VkImageViewCreateInfo*)(ptr);
		  return (VkComponentMapping) (vkObj->components);
	 */

	/**
	 * native SET method for field subresourceRange	[vkstruct]<br>
	 * Prototype: VkImageSubresourceRange  subresourceRange
	 */ 
	 private static native void subresourceRange0(Buffer ptr, java.nio.ByteBuffer  _subresourceRange);/*
		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		  vkObj->subresourceRange = (VkImageSubresourceRange) (_subresourceRange);
	  */

	/**
	 * native GET method for field subresourceRange	[vkstruct]<br>
	 * Prototype: VkImageSubresourceRange  subresourceRange
	 */ 
	 private static native java.nio.ByteBuffer  subresourceRange0(Buffer ptr);/*
		  VkImageViewCreateInfo vkObj = (VkImageViewCreateInfo*)(ptr);
		  return (VkImageSubresourceRange) (vkObj->subresourceRange);
	 */



} // end of class VkImageViewCreateInfo
