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


/**
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
	/** TAG of this structure [167]  */
	 private static final String TAG = "VkImageViewCreateInfo";

	/** ID of this structure [167]  */
	 public static final int TAG_ID = VKIMAGEVIEWCREATEINFO_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType	[vkenum]	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext		 */ 
	P<VkObject> 	pNext;

	/**
	 *  VkImageViewCreateFlags 	flags		 */ 
	int 	flags;

	/**
	 *  VkImage 	image	[vkhandle]	 */ 
	VkImage 	image;

	/**
	 *  VkImageViewType 	viewType	[vkenum]	 */ 
	VkImageViewType 	viewType;

	/**
	 *  VkFormat 	format	[vkenum]	 */ 
	VkFormat 	format;

	/**
	 *  VkComponentMapping 	components	[vkstruct]	 */ 
	VkComponentMapping 	components;

	/**
	 *  VkImageSubresourceRange 	subresourceRange	[vkstruct]	 */ 
	VkImageSubresourceRange 	subresourceRange;

	/**
	 * Ctor
	 */
	public VkImageViewCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(P<VkObject> pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 public P<VkObject> pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field flags	
	 * Prototype: VkImageViewCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	
	 * Prototype: VkImageViewCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field image	[vkhandle]
	 * Prototype: VkImage  image
	 */ 
	 public void image(VkImage image){
		 this.image = image;
		image0(super.ptr, image);
	 }

	/**
	 * get method for field image	[vkhandle]
	 * Prototype: VkImage  image
	 */ 
	 public VkImage image(){
		 // return  this.image;
		 return image0(super.ptr);
	 }

	/**
	 * Set method for field viewType	[vkenum]
	 * Prototype: VkImageViewType  viewType
	 */ 
	 public void viewType(VkImageViewType viewType){
		 this.viewType = viewType;
		viewType0(super.ptr, viewType);
	 }

	/**
	 * get method for field viewType	[vkenum]
	 * Prototype: VkImageViewType  viewType
	 */ 
	 public VkImageViewType viewType(){
		 // return  this.viewType;
		 return viewType0(super.ptr);
	 }

	/**
	 * Set method for field format	[vkenum]
	 * Prototype: VkFormat  format
	 */ 
	 public void format(VkFormat format){
		 this.format = format;
		format0(super.ptr, format);
	 }

	/**
	 * get method for field format	[vkenum]
	 * Prototype: VkFormat  format
	 */ 
	 public VkFormat format(){
		 // return  this.format;
		 return format0(super.ptr);
	 }

	/**
	 * Set method for field components	[vkstruct]
	 * Prototype: VkComponentMapping  components
	 */ 
	 public void components(VkComponentMapping components){
		 this.components = components;
		components0(super.ptr, components);
	 }

	/**
	 * get method for field components	[vkstruct]
	 * Prototype: VkComponentMapping  components
	 */ 
	 public VkComponentMapping components(){
		 // return  this.components;
		 return components0(super.ptr);
	 }

	/**
	 * Set method for field subresourceRange	[vkstruct]
	 * Prototype: VkImageSubresourceRange  subresourceRange
	 */ 
	 public void subresourceRange(VkImageSubresourceRange subresourceRange){
		 this.subresourceRange = subresourceRange;
		subresourceRange0(super.ptr, subresourceRange);
	 }

	/**
	 * get method for field subresourceRange	[vkstruct]
	 * Prototype: VkImageSubresourceRange  subresourceRange
	 */ 
	 public VkImageSubresourceRange subresourceRange(){
		 // return  this.subresourceRange;
		 return subresourceRange0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkImageViewCreateInfo _obj = (VkImageViewCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkImageViewCreateInfo _obj = (VkImageViewCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkImageViewCreateInfo _obj = (VkImageViewCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkImageViewCreateInfo _obj = (VkImageViewCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags	
	 * Prototype: VkImageViewCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkImageViewCreateInfo _obj = (VkImageViewCreateInfo)(*ptr);
		  _obj.flags = (VkImageViewCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags	
	 * Prototype: VkImageViewCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkImageViewCreateInfo _obj = (VkImageViewCreateInfo)(ptr);
		  return (jint) (_obj.VkImageViewCreateFlags);
	 */

	/**
	 * native Set method for field image	[vkhandle]
	 * Prototype: VkImage  image
	 */ 
	 private static native void image0(ByteBuffer ptr, VkImage _image);/*
		  VkImageViewCreateInfo _obj = (VkImageViewCreateInfo)(*ptr);
		  _obj.image = (VkImage) (_image);
	  */

	/**
	 * get method for field image	[vkhandle]
	 * Prototype: VkImage  image
	 */ 
	 private static native VkImage image0(ByteBuffer ptr);/*
		  VkImageViewCreateInfo _obj = (VkImageViewCreateInfo)(ptr);
		  return (VkImage) (_obj.VkImage);
	 */

	/**
	 * native Set method for field viewType	[vkenum]
	 * Prototype: VkImageViewType  viewType
	 */ 
	 private static native void viewType0(ByteBuffer ptr, VkImageViewType _viewType);/*
		  VkImageViewCreateInfo _obj = (VkImageViewCreateInfo)(*ptr);
		  _obj.viewType = (VkImageViewType) (_viewType);
	  */

	/**
	 * get method for field viewType	[vkenum]
	 * Prototype: VkImageViewType  viewType
	 */ 
	 private static native VkImageViewType viewType0(ByteBuffer ptr);/*
		  VkImageViewCreateInfo _obj = (VkImageViewCreateInfo)(ptr);
		  return (VkImageViewType) (_obj.VkImageViewType);
	 */

	/**
	 * native Set method for field format	[vkenum]
	 * Prototype: VkFormat  format
	 */ 
	 private static native void format0(ByteBuffer ptr, VkFormat _format);/*
		  VkImageViewCreateInfo _obj = (VkImageViewCreateInfo)(*ptr);
		  _obj.format = (VkFormat) (_format);
	  */

	/**
	 * get method for field format	[vkenum]
	 * Prototype: VkFormat  format
	 */ 
	 private static native VkFormat format0(ByteBuffer ptr);/*
		  VkImageViewCreateInfo _obj = (VkImageViewCreateInfo)(ptr);
		  return (VkFormat) (_obj.VkFormat);
	 */

	/**
	 * native Set method for field components	[vkstruct]
	 * Prototype: VkComponentMapping  components
	 */ 
	 private static native void components0(ByteBuffer ptr, VkComponentMapping _components);/*
		  VkImageViewCreateInfo _obj = (VkImageViewCreateInfo)(*ptr);
		  _obj.components = (VkComponentMapping) (_components);
	  */

	/**
	 * get method for field components	[vkstruct]
	 * Prototype: VkComponentMapping  components
	 */ 
	 private static native VkComponentMapping components0(ByteBuffer ptr);/*
		  VkImageViewCreateInfo _obj = (VkImageViewCreateInfo)(ptr);
		  return (VkComponentMapping) (_obj.VkComponentMapping);
	 */

	/**
	 * native Set method for field subresourceRange	[vkstruct]
	 * Prototype: VkImageSubresourceRange  subresourceRange
	 */ 
	 private static native void subresourceRange0(ByteBuffer ptr, VkImageSubresourceRange _subresourceRange);/*
		  VkImageViewCreateInfo _obj = (VkImageViewCreateInfo)(*ptr);
		  _obj.subresourceRange = (VkImageSubresourceRange) (_subresourceRange);
	  */

	/**
	 * get method for field subresourceRange	[vkstruct]
	 * Prototype: VkImageSubresourceRange  subresourceRange
	 */ 
	 private static native VkImageSubresourceRange subresourceRange0(ByteBuffer ptr);/*
		  VkImageViewCreateInfo _obj = (VkImageViewCreateInfo)(ptr);
		  return (VkImageSubresourceRange) (_obj.VkImageSubresourceRange);
	 */



} // end of class VkImageViewCreateInfo
