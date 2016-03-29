/**
 * Class wrapping Vulkan's VkSurfaceCapabilitiesKHR struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.01 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.khr.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.*;
import bor.vulkan.khr.*;
import java.nio.ByteBuffer;

import java.nio.Buffer;


/**
 *  Project Bor-Vulkan 
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkSurfaceCapabilitiesKHR. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSurfaceCapabilitiesKHR {
 *     uint32_t                         minImageCount;
 *     uint32_t                         maxImageCount;
 *     VkExtent2D                       currentExtent;
 *     VkExtent2D                       minImageExtent;
 *     VkExtent2D                       maxImageExtent;
 *     uint32_t                         maxImageArrayLayers;
 *     VkSurfaceTransformFlagsKHR       supportedTransforms;
 *     VkSurfaceTransformFlagBitsKHR    currentTransform;
 *     VkCompositeAlphaFlagsKHR         supportedCompositeAlpha;
 *     VkImageUsageFlags                supportedUsageFlags;
 * } VkSurfaceCapabilitiesKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkSurfaceCapabilitiesKHR extends VkStruct {
	/** TAG of this structure [106]  */
	 private static final String TAG = "VkSurfaceCapabilitiesKHR";

	/** ID of this structure [106]  */
	 public static final int TAG_ID = VKSURFACECAPABILITIESKHR_ID;

	/** P wrapper for THIS object */
	 private  P<VkSurfaceCapabilitiesKHR> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  uint32_t 	minImageCount	[int]
	 */ 
	 int 	minImageCount;

	/**
	 *  uint32_t 	maxImageCount	[int]
	 */ 
	 int 	maxImageCount;

	/**
	 *  VkExtent2D 	currentExtent	[vkstruct]
	 */ 
	 VkExtent2D 	currentExtent;

	/**
	 *  VkExtent2D 	minImageExtent	[vkstruct]
	 */ 
	 VkExtent2D 	minImageExtent;

	/**
	 *  VkExtent2D 	maxImageExtent	[vkstruct]
	 */ 
	 VkExtent2D 	maxImageExtent;

	/**
	 *  uint32_t 	maxImageArrayLayers	[int]
	 */ 
	 int 	maxImageArrayLayers;

	/**
	 *  VkSurfaceTransformFlagsKHR 	supportedTransforms	[int]
	 */ 
	 int 	supportedTransforms;

	/**
	 *  VkSurfaceTransformFlagBitsKHR 	currentTransform	[vkenum]
	 */ 
	 VkSurfaceTransformFlagBitsKHR 	currentTransform;

	/**
	 *  VkCompositeAlphaFlagsKHR 	supportedCompositeAlpha	[int]
	 */ 
	 int 	supportedCompositeAlpha;

	/**
	 *  VkImageUsageFlags 	supportedUsageFlags	[int]
	 */ 
	 int 	supportedUsageFlags;

	/**
	 * Ctor
	 */
	public VkSurfaceCapabilitiesKHR(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSurfaceCapabilitiesKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkSurfaceCapabilitiesKHR(long address, int memSize){ 
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
	 public static P<VkSurfaceCapabilitiesKHR> createNullPointer(){
	        P<VkSurfaceCapabilitiesKHR> p = new  P<VkSurfaceCapabilitiesKHR>(new VkSurfaceCapabilitiesKHR());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkSurfaceCapabilitiesKHR> getP() {
	       if(p == null ){
	           p = new P<VkSurfaceCapabilitiesKHR> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field minImageCount	[int]<br>
	 * Prototype: uint32_t  minImageCount
	 */ 
	 public void minImageCount(int minImageCount){
		 this.minImageCount = minImageCount;
		 minImageCount0(this.ptr,  minImageCount);
	 }

	/**
	 * Get method for field minImageCount	[int]<br>
	 * Prototype: uint32_t  minImageCount
	 */ 
	 public int minImageCount(){
		 int var = minImageCount0(super.ptr);
		 this.minImageCount = var;
		 return this.minImageCount;
	 }

	/**
	 * Set method for field maxImageCount	[int]<br>
	 * Prototype: uint32_t  maxImageCount
	 */ 
	 public void maxImageCount(int maxImageCount){
		 this.maxImageCount = maxImageCount;
		 maxImageCount0(this.ptr,  maxImageCount);
	 }

	/**
	 * Get method for field maxImageCount	[int]<br>
	 * Prototype: uint32_t  maxImageCount
	 */ 
	 public int maxImageCount(){
		 int var = maxImageCount0(super.ptr);
		 this.maxImageCount = var;
		 return this.maxImageCount;
	 }

	/**
	 * Set method for field currentExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  currentExtent
	 */ 
	 public void currentExtent(VkExtent2D currentExtent){
		 this.currentExtent = currentExtent;
		 ByteBuffer buff = (currentExtent==null) ? null : currentExtent.getPointerStruct();
		 currentExtent0(this.ptr, buff);
	 }

	/**
	 * Get method for field currentExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  currentExtent
	 */ 
	 public VkExtent2D currentExtent(){
		 ByteBuffer pointer = currentExtent0(super.ptr);
		 if(pointer == null){
		    this.currentExtent = null;
		    return null;
		  } else 
 		 if(this.currentExtent == null){
		    this.currentExtent = new VkExtent2D(pointer);
		 }else{
		    this.currentExtent.setPointer(pointer);
		  }
		 return this.currentExtent;
	 }

	/**
	 * Set method for field minImageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  minImageExtent
	 */ 
	 public void minImageExtent(VkExtent2D minImageExtent){
		 this.minImageExtent = minImageExtent;
		 ByteBuffer buff = (minImageExtent==null) ? null : minImageExtent.getPointerStruct();
		 minImageExtent0(this.ptr, buff);
	 }

	/**
	 * Get method for field minImageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  minImageExtent
	 */ 
	 public VkExtent2D minImageExtent(){
		 ByteBuffer pointer = minImageExtent0(super.ptr);
		 if(pointer == null){
		    this.minImageExtent = null;
		    return null;
		  } else 
 		 if(this.minImageExtent == null){
		    this.minImageExtent = new VkExtent2D(pointer);
		 }else{
		    this.minImageExtent.setPointer(pointer);
		  }
		 return this.minImageExtent;
	 }

	/**
	 * Set method for field maxImageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  maxImageExtent
	 */ 
	 public void maxImageExtent(VkExtent2D maxImageExtent){
		 this.maxImageExtent = maxImageExtent;
		 ByteBuffer buff = (maxImageExtent==null) ? null : maxImageExtent.getPointerStruct();
		 maxImageExtent0(this.ptr, buff);
	 }

	/**
	 * Get method for field maxImageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  maxImageExtent
	 */ 
	 public VkExtent2D maxImageExtent(){
		 ByteBuffer pointer = maxImageExtent0(super.ptr);
		 if(pointer == null){
		    this.maxImageExtent = null;
		    return null;
		  } else 
 		 if(this.maxImageExtent == null){
		    this.maxImageExtent = new VkExtent2D(pointer);
		 }else{
		    this.maxImageExtent.setPointer(pointer);
		  }
		 return this.maxImageExtent;
	 }

	/**
	 * Set method for field maxImageArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxImageArrayLayers
	 */ 
	 public void maxImageArrayLayers(int maxImageArrayLayers){
		 this.maxImageArrayLayers = maxImageArrayLayers;
		 maxImageArrayLayers0(this.ptr,  maxImageArrayLayers);
	 }

	/**
	 * Get method for field maxImageArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxImageArrayLayers
	 */ 
	 public int maxImageArrayLayers(){
		 int var = maxImageArrayLayers0(super.ptr);
		 this.maxImageArrayLayers = var;
		 return this.maxImageArrayLayers;
	 }

	/**
	 * Set method for field supportedTransforms	[int]<br>
	 * Prototype: VkSurfaceTransformFlagsKHR  supportedTransforms
	 */ 
	 public void supportedTransforms(int supportedTransforms){
		 this.supportedTransforms = supportedTransforms;
		 supportedTransforms0(this.ptr,  supportedTransforms);
	 }

	/**
	 * Get method for field supportedTransforms	[int]<br>
	 * Prototype: VkSurfaceTransformFlagsKHR  supportedTransforms
	 */ 
	 public int supportedTransforms(){
		 int var = supportedTransforms0(super.ptr);
		 this.supportedTransforms = var;
		 return this.supportedTransforms;
	 }

	/**
	 * Set method for field currentTransform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  currentTransform
	 */ 
	 public void currentTransform(VkSurfaceTransformFlagBitsKHR currentTransform){
		 this.currentTransform = currentTransform;
		 int enumVal = currentTransform.getValue();
		 currentTransform0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field currentTransform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  currentTransform
	 */ 
	 public VkSurfaceTransformFlagBitsKHR currentTransform(){
		 int nativeVal = currentTransform0(super.ptr);
		 this.currentTransform = VkSurfaceTransformFlagBitsKHR.fromValue(nativeVal); 
		 return this.currentTransform;
	 }

	/**
	 * Set method for field supportedCompositeAlpha	[int]<br>
	 * Prototype: VkCompositeAlphaFlagsKHR  supportedCompositeAlpha
	 */ 
	 public void supportedCompositeAlpha(int supportedCompositeAlpha){
		 this.supportedCompositeAlpha = supportedCompositeAlpha;
		 supportedCompositeAlpha0(this.ptr,  supportedCompositeAlpha);
	 }

	/**
	 * Get method for field supportedCompositeAlpha	[int]<br>
	 * Prototype: VkCompositeAlphaFlagsKHR  supportedCompositeAlpha
	 */ 
	 public int supportedCompositeAlpha(){
		 int var = supportedCompositeAlpha0(super.ptr);
		 this.supportedCompositeAlpha = var;
		 return this.supportedCompositeAlpha;
	 }

	/**
	 * Set method for field supportedUsageFlags	[int]<br>
	 * Prototype: VkImageUsageFlags  supportedUsageFlags
	 */ 
	 public void supportedUsageFlags(int supportedUsageFlags){
		 this.supportedUsageFlags = supportedUsageFlags;
		 supportedUsageFlags0(this.ptr,  supportedUsageFlags);
	 }

	/**
	 * Get method for field supportedUsageFlags	[int]<br>
	 * Prototype: VkImageUsageFlags  supportedUsageFlags
	 */ 
	 public int supportedUsageFlags(){
		 int var = supportedUsageFlags0(super.ptr);
		 this.supportedUsageFlags = var;
		 return this.supportedUsageFlags;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field minImageCount	[int]<br>
	 * Prototype: uint32_t  minImageCount
	 */ 
	 private static native void minImageCount0(Buffer ptr, int _minImageCount);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  vkObj->minImageCount = (uint32_t) (_minImageCount);
	  */

	/**
	 * native GET method for field minImageCount	[int]<br>
	 * Prototype: uint32_t  minImageCount
	 */ 
	 private static native int minImageCount0(Buffer ptr);/*
		  VkSurfaceCapabilitiesKHR vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  return (jint) (vkObj->minImageCount);
	 */

	/**
	 * native SET method for field maxImageCount	[int]<br>
	 * Prototype: uint32_t  maxImageCount
	 */ 
	 private static native void maxImageCount0(Buffer ptr, int _maxImageCount);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  vkObj->maxImageCount = (uint32_t) (_maxImageCount);
	  */

	/**
	 * native GET method for field maxImageCount	[int]<br>
	 * Prototype: uint32_t  maxImageCount
	 */ 
	 private static native int maxImageCount0(Buffer ptr);/*
		  VkSurfaceCapabilitiesKHR vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  return (jint) (vkObj->maxImageCount);
	 */

	/**
	 * native SET method for field currentExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  currentExtent
	 */ 
	 private static native void currentExtent0(Buffer ptr, java.nio.ByteBuffer  _currentExtent);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  vkObj->currentExtent = (VkExtent2D) (_currentExtent);
	  */

	/**
	 * native GET method for field currentExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  currentExtent
	 */ 
	 private static native java.nio.ByteBuffer  currentExtent0(Buffer ptr);/*
		  VkSurfaceCapabilitiesKHR vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  return (VkExtent2D) (vkObj->currentExtent);
	 */

	/**
	 * native SET method for field minImageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  minImageExtent
	 */ 
	 private static native void minImageExtent0(Buffer ptr, java.nio.ByteBuffer  _minImageExtent);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  vkObj->minImageExtent = (VkExtent2D) (_minImageExtent);
	  */

	/**
	 * native GET method for field minImageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  minImageExtent
	 */ 
	 private static native java.nio.ByteBuffer  minImageExtent0(Buffer ptr);/*
		  VkSurfaceCapabilitiesKHR vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  return (VkExtent2D) (vkObj->minImageExtent);
	 */

	/**
	 * native SET method for field maxImageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  maxImageExtent
	 */ 
	 private static native void maxImageExtent0(Buffer ptr, java.nio.ByteBuffer  _maxImageExtent);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  vkObj->maxImageExtent = (VkExtent2D) (_maxImageExtent);
	  */

	/**
	 * native GET method for field maxImageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  maxImageExtent
	 */ 
	 private static native java.nio.ByteBuffer  maxImageExtent0(Buffer ptr);/*
		  VkSurfaceCapabilitiesKHR vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  return (VkExtent2D) (vkObj->maxImageExtent);
	 */

	/**
	 * native SET method for field maxImageArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxImageArrayLayers
	 */ 
	 private static native void maxImageArrayLayers0(Buffer ptr, int _maxImageArrayLayers);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  vkObj->maxImageArrayLayers = (uint32_t) (_maxImageArrayLayers);
	  */

	/**
	 * native GET method for field maxImageArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxImageArrayLayers
	 */ 
	 private static native int maxImageArrayLayers0(Buffer ptr);/*
		  VkSurfaceCapabilitiesKHR vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  return (jint) (vkObj->maxImageArrayLayers);
	 */

	/**
	 * native SET method for field supportedTransforms	[int]<br>
	 * Prototype: VkSurfaceTransformFlagsKHR  supportedTransforms
	 */ 
	 private static native void supportedTransforms0(Buffer ptr, int _supportedTransforms);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  vkObj->supportedTransforms = (VkSurfaceTransformFlagsKHR) (_supportedTransforms);
	  */

	/**
	 * native GET method for field supportedTransforms	[int]<br>
	 * Prototype: VkSurfaceTransformFlagsKHR  supportedTransforms
	 */ 
	 private static native int supportedTransforms0(Buffer ptr);/*
		  VkSurfaceCapabilitiesKHR vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  return (jint) (vkObj->supportedTransforms);
	 */

	/**
	 * native SET method for field currentTransform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  currentTransform
	 */ 
	 private static native void currentTransform0(Buffer ptr, int  _currentTransform);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  vkObj->currentTransform = (VkSurfaceTransformFlagBitsKHR) (_currentTransform);
	  */

	/**
	 * native GET method for field currentTransform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  currentTransform
	 */ 
	 private static native int  currentTransform0(Buffer ptr);/*
		  VkSurfaceCapabilitiesKHR vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  return (VkSurfaceTransformFlagBitsKHR) (vkObj->currentTransform);
	 */

	/**
	 * native SET method for field supportedCompositeAlpha	[int]<br>
	 * Prototype: VkCompositeAlphaFlagsKHR  supportedCompositeAlpha
	 */ 
	 private static native void supportedCompositeAlpha0(Buffer ptr, int _supportedCompositeAlpha);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  vkObj->supportedCompositeAlpha = (VkCompositeAlphaFlagsKHR) (_supportedCompositeAlpha);
	  */

	/**
	 * native GET method for field supportedCompositeAlpha	[int]<br>
	 * Prototype: VkCompositeAlphaFlagsKHR  supportedCompositeAlpha
	 */ 
	 private static native int supportedCompositeAlpha0(Buffer ptr);/*
		  VkSurfaceCapabilitiesKHR vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  return (jint) (vkObj->supportedCompositeAlpha);
	 */

	/**
	 * native SET method for field supportedUsageFlags	[int]<br>
	 * Prototype: VkImageUsageFlags  supportedUsageFlags
	 */ 
	 private static native void supportedUsageFlags0(Buffer ptr, int _supportedUsageFlags);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  vkObj->supportedUsageFlags = (VkImageUsageFlags) (_supportedUsageFlags);
	  */

	/**
	 * native GET method for field supportedUsageFlags	[int]<br>
	 * Prototype: VkImageUsageFlags  supportedUsageFlags
	 */ 
	 private static native int supportedUsageFlags0(Buffer ptr);/*
		  VkSurfaceCapabilitiesKHR vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  return (jint) (vkObj->supportedUsageFlags);
	 */



} // end of class VkSurfaceCapabilitiesKHR
