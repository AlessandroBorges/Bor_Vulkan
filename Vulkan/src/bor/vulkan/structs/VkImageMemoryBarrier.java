/**
 * Class wrapping Vulkan's VkImageMemoryBarrier struct.
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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkImageMemoryBarrier extends VkStruct {
	/** TAG of this structure [225]  */
	 private static final String TAG = "VkImageMemoryBarrier";

	/** ID of this structure [225]  */
	 public static final int TAG_ID = VKIMAGEMEMORYBARRIER_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType	[vkenum]	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext		 */ 
	P<VkObject> 	pNext;

	/**
	 *  VkAccessFlags 	srcAccessMask		 */ 
	int 	srcAccessMask;

	/**
	 *  VkAccessFlags 	dstAccessMask		 */ 
	int 	dstAccessMask;

	/**
	 *  VkImageLayout 	oldLayout	[vkenum]	 */ 
	VkImageLayout 	oldLayout;

	/**
	 *  VkImageLayout 	newLayout	[vkenum]	 */ 
	VkImageLayout 	newLayout;

	/**
	 *  uint32_t 	srcQueueFamilyIndex		 */ 
	int 	srcQueueFamilyIndex;

	/**
	 *  uint32_t 	dstQueueFamilyIndex		 */ 
	int 	dstQueueFamilyIndex;

	/**
	 *  VkImage 	image	[vkhandle]	 */ 
	VkImage 	image;

	/**
	 *  VkImageSubresourceRange 	subresourceRange	[vkstruct]	 */ 
	VkImageSubresourceRange 	subresourceRange;

	/**
	 * Ctor
	 */
	public VkImageMemoryBarrier(){ 
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
	 * Set method for field srcAccessMask	
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 public void srcAccessMask(int srcAccessMask){
		 this.srcAccessMask = srcAccessMask;
		srcAccessMask0(super.ptr, srcAccessMask);
	 }

	/**
	 * get method for field srcAccessMask	
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 public int srcAccessMask(){
		 // return  this.srcAccessMask;
		 return srcAccessMask0(super.ptr);
	 }

	/**
	 * Set method for field dstAccessMask	
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 public void dstAccessMask(int dstAccessMask){
		 this.dstAccessMask = dstAccessMask;
		dstAccessMask0(super.ptr, dstAccessMask);
	 }

	/**
	 * get method for field dstAccessMask	
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 public int dstAccessMask(){
		 // return  this.dstAccessMask;
		 return dstAccessMask0(super.ptr);
	 }

	/**
	 * Set method for field oldLayout	[vkenum]
	 * Prototype: VkImageLayout  oldLayout
	 */ 
	 public void oldLayout(VkImageLayout oldLayout){
		 this.oldLayout = oldLayout;
		oldLayout0(super.ptr, oldLayout);
	 }

	/**
	 * get method for field oldLayout	[vkenum]
	 * Prototype: VkImageLayout  oldLayout
	 */ 
	 public VkImageLayout oldLayout(){
		 // return  this.oldLayout;
		 return oldLayout0(super.ptr);
	 }

	/**
	 * Set method for field newLayout	[vkenum]
	 * Prototype: VkImageLayout  newLayout
	 */ 
	 public void newLayout(VkImageLayout newLayout){
		 this.newLayout = newLayout;
		newLayout0(super.ptr, newLayout);
	 }

	/**
	 * get method for field newLayout	[vkenum]
	 * Prototype: VkImageLayout  newLayout
	 */ 
	 public VkImageLayout newLayout(){
		 // return  this.newLayout;
		 return newLayout0(super.ptr);
	 }

	/**
	 * Set method for field srcQueueFamilyIndex	
	 * Prototype: uint32_t  srcQueueFamilyIndex
	 */ 
	 public void srcQueueFamilyIndex(int srcQueueFamilyIndex){
		 this.srcQueueFamilyIndex = srcQueueFamilyIndex;
		srcQueueFamilyIndex0(super.ptr, srcQueueFamilyIndex);
	 }

	/**
	 * get method for field srcQueueFamilyIndex	
	 * Prototype: uint32_t  srcQueueFamilyIndex
	 */ 
	 public int srcQueueFamilyIndex(){
		 // return  this.srcQueueFamilyIndex;
		 return srcQueueFamilyIndex0(super.ptr);
	 }

	/**
	 * Set method for field dstQueueFamilyIndex	
	 * Prototype: uint32_t  dstQueueFamilyIndex
	 */ 
	 public void dstQueueFamilyIndex(int dstQueueFamilyIndex){
		 this.dstQueueFamilyIndex = dstQueueFamilyIndex;
		dstQueueFamilyIndex0(super.ptr, dstQueueFamilyIndex);
	 }

	/**
	 * get method for field dstQueueFamilyIndex	
	 * Prototype: uint32_t  dstQueueFamilyIndex
	 */ 
	 public int dstQueueFamilyIndex(){
		 // return  this.dstQueueFamilyIndex;
		 return dstQueueFamilyIndex0(super.ptr);
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
		  VkImageMemoryBarrier _obj = (VkImageMemoryBarrier)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkImageMemoryBarrier _obj = (VkImageMemoryBarrier)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkImageMemoryBarrier _obj = (VkImageMemoryBarrier)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkImageMemoryBarrier _obj = (VkImageMemoryBarrier)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field srcAccessMask	
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 private static native void srcAccessMask0(ByteBuffer ptr, int _srcAccessMask);/*
		  VkImageMemoryBarrier _obj = (VkImageMemoryBarrier)(*ptr);
		  _obj.srcAccessMask = (VkAccessFlags) (_srcAccessMask);
	  */

	/**
	 * get method for field srcAccessMask	
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 private static native int srcAccessMask0(ByteBuffer ptr);/*
		  VkImageMemoryBarrier _obj = (VkImageMemoryBarrier)(ptr);
		  return (jint) (_obj.VkAccessFlags);
	 */

	/**
	 * native Set method for field dstAccessMask	
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 private static native void dstAccessMask0(ByteBuffer ptr, int _dstAccessMask);/*
		  VkImageMemoryBarrier _obj = (VkImageMemoryBarrier)(*ptr);
		  _obj.dstAccessMask = (VkAccessFlags) (_dstAccessMask);
	  */

	/**
	 * get method for field dstAccessMask	
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 private static native int dstAccessMask0(ByteBuffer ptr);/*
		  VkImageMemoryBarrier _obj = (VkImageMemoryBarrier)(ptr);
		  return (jint) (_obj.VkAccessFlags);
	 */

	/**
	 * native Set method for field oldLayout	[vkenum]
	 * Prototype: VkImageLayout  oldLayout
	 */ 
	 private static native void oldLayout0(ByteBuffer ptr, VkImageLayout _oldLayout);/*
		  VkImageMemoryBarrier _obj = (VkImageMemoryBarrier)(*ptr);
		  _obj.oldLayout = (VkImageLayout) (_oldLayout);
	  */

	/**
	 * get method for field oldLayout	[vkenum]
	 * Prototype: VkImageLayout  oldLayout
	 */ 
	 private static native VkImageLayout oldLayout0(ByteBuffer ptr);/*
		  VkImageMemoryBarrier _obj = (VkImageMemoryBarrier)(ptr);
		  return (VkImageLayout) (_obj.VkImageLayout);
	 */

	/**
	 * native Set method for field newLayout	[vkenum]
	 * Prototype: VkImageLayout  newLayout
	 */ 
	 private static native void newLayout0(ByteBuffer ptr, VkImageLayout _newLayout);/*
		  VkImageMemoryBarrier _obj = (VkImageMemoryBarrier)(*ptr);
		  _obj.newLayout = (VkImageLayout) (_newLayout);
	  */

	/**
	 * get method for field newLayout	[vkenum]
	 * Prototype: VkImageLayout  newLayout
	 */ 
	 private static native VkImageLayout newLayout0(ByteBuffer ptr);/*
		  VkImageMemoryBarrier _obj = (VkImageMemoryBarrier)(ptr);
		  return (VkImageLayout) (_obj.VkImageLayout);
	 */

	/**
	 * native Set method for field srcQueueFamilyIndex	
	 * Prototype: uint32_t  srcQueueFamilyIndex
	 */ 
	 private static native void srcQueueFamilyIndex0(ByteBuffer ptr, int _srcQueueFamilyIndex);/*
		  VkImageMemoryBarrier _obj = (VkImageMemoryBarrier)(*ptr);
		  _obj.srcQueueFamilyIndex = (uint32_t) (_srcQueueFamilyIndex);
	  */

	/**
	 * get method for field srcQueueFamilyIndex	
	 * Prototype: uint32_t  srcQueueFamilyIndex
	 */ 
	 private static native int srcQueueFamilyIndex0(ByteBuffer ptr);/*
		  VkImageMemoryBarrier _obj = (VkImageMemoryBarrier)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field dstQueueFamilyIndex	
	 * Prototype: uint32_t  dstQueueFamilyIndex
	 */ 
	 private static native void dstQueueFamilyIndex0(ByteBuffer ptr, int _dstQueueFamilyIndex);/*
		  VkImageMemoryBarrier _obj = (VkImageMemoryBarrier)(*ptr);
		  _obj.dstQueueFamilyIndex = (uint32_t) (_dstQueueFamilyIndex);
	  */

	/**
	 * get method for field dstQueueFamilyIndex	
	 * Prototype: uint32_t  dstQueueFamilyIndex
	 */ 
	 private static native int dstQueueFamilyIndex0(ByteBuffer ptr);/*
		  VkImageMemoryBarrier _obj = (VkImageMemoryBarrier)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field image	[vkhandle]
	 * Prototype: VkImage  image
	 */ 
	 private static native void image0(ByteBuffer ptr, VkImage _image);/*
		  VkImageMemoryBarrier _obj = (VkImageMemoryBarrier)(*ptr);
		  _obj.image = (VkImage) (_image);
	  */

	/**
	 * get method for field image	[vkhandle]
	 * Prototype: VkImage  image
	 */ 
	 private static native VkImage image0(ByteBuffer ptr);/*
		  VkImageMemoryBarrier _obj = (VkImageMemoryBarrier)(ptr);
		  return (VkImage) (_obj.VkImage);
	 */

	/**
	 * native Set method for field subresourceRange	[vkstruct]
	 * Prototype: VkImageSubresourceRange  subresourceRange
	 */ 
	 private static native void subresourceRange0(ByteBuffer ptr, VkImageSubresourceRange _subresourceRange);/*
		  VkImageMemoryBarrier _obj = (VkImageMemoryBarrier)(*ptr);
		  _obj.subresourceRange = (VkImageSubresourceRange) (_subresourceRange);
	  */

	/**
	 * get method for field subresourceRange	[vkstruct]
	 * Prototype: VkImageSubresourceRange  subresourceRange
	 */ 
	 private static native VkImageSubresourceRange subresourceRange0(ByteBuffer ptr);/*
		  VkImageMemoryBarrier _obj = (VkImageMemoryBarrier)(ptr);
		  return (VkImageSubresourceRange) (_obj.VkImageSubresourceRange);
	 */



} // end of class VkImageMemoryBarrier
