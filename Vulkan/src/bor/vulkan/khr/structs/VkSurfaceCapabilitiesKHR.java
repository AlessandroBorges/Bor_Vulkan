/**
 * Class wrapping Vulkan's VkSurfaceCapabilitiesKHR struct.
 * 
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


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkSurfaceCapabilitiesKHR 
 *  <h3>ProtoType:</h3>
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
 * @version 0.8.01
 */
public class VkSurfaceCapabilitiesKHR extends VkStruct {
	/** TAG of this structure [230]  */
	 private static final String TAG = "VkSurfaceCapabilitiesKHR";

	/** ID of this structure [230]  */
	 public static final int TAG_ID = VKSURFACECAPABILITIESKHR_ID;

	 // fields //
	/**
	 *  uint32_t 	minImageCount 
	 */ 
	int 	minImageCount;

	/**
	 *  uint32_t 	maxImageCount 
	 */ 
	int 	maxImageCount;

	/**
	 *  VkExtent2D 	currentExtent 
	 */ 
	VkExtent2D 	currentExtent;

	/**
	 *  VkExtent2D 	minImageExtent 
	 */ 
	VkExtent2D 	minImageExtent;

	/**
	 *  VkExtent2D 	maxImageExtent 
	 */ 
	VkExtent2D 	maxImageExtent;

	/**
	 *  uint32_t 	maxImageArrayLayers 
	 */ 
	int 	maxImageArrayLayers;

	/**
	 *  VkSurfaceTransformFlagsKHR 	supportedTransforms 
	 */ 
	int 	supportedTransforms;

	/**
	 *  VkSurfaceTransformFlagBitsKHR 	currentTransform 
	 */ 
	VkSurfaceTransformFlagBitsKHR 	currentTransform;

	/**
	 *  VkCompositeAlphaFlagsKHR 	supportedCompositeAlpha 
	 */ 
	int 	supportedCompositeAlpha;

	/**
	 *  VkImageUsageFlags 	supportedUsageFlags 
	 */ 
	int 	supportedUsageFlags;

	/**
	 * Ctor
	 */
	public VkSurfaceCapabilitiesKHR(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	 // /////////////////////
	 //  SETTERS & GETTERS //
	 // /////////////////////

	/**
	 * Set method for field minImageCount
	 * Prototype: uint32_t  minImageCount
	 */ 
	 public void minImageCount(int minImageCount){
		 this.minImageCount = minImageCount;
		minImageCount0(super.ptr, minImageCount);
	 }

	/**
	 * get method for field minImageCount
	 * Prototype: uint32_t  minImageCount
	 */ 
	 public int minImageCount(){
		 // return  this.minImageCount;
		 return minImageCount0(super.ptr);
	 }

	/**
	 * Set method for field maxImageCount
	 * Prototype: uint32_t  maxImageCount
	 */ 
	 public void maxImageCount(int maxImageCount){
		 this.maxImageCount = maxImageCount;
		maxImageCount0(super.ptr, maxImageCount);
	 }

	/**
	 * get method for field maxImageCount
	 * Prototype: uint32_t  maxImageCount
	 */ 
	 public int maxImageCount(){
		 // return  this.maxImageCount;
		 return maxImageCount0(super.ptr);
	 }

	/**
	 * Set method for field currentExtent
	 * Prototype: VkExtent2D  currentExtent
	 */ 
	 public void currentExtent(VkExtent2D currentExtent){
		 this.currentExtent = currentExtent;
		currentExtent0(super.ptr, currentExtent);
	 }

	/**
	 * get method for field currentExtent
	 * Prototype: VkExtent2D  currentExtent
	 */ 
	 public VkExtent2D currentExtent(){
		 // return  this.currentExtent;
		 return currentExtent0(super.ptr);
	 }

	/**
	 * Set method for field minImageExtent
	 * Prototype: VkExtent2D  minImageExtent
	 */ 
	 public void minImageExtent(VkExtent2D minImageExtent){
		 this.minImageExtent = minImageExtent;
		minImageExtent0(super.ptr, minImageExtent);
	 }

	/**
	 * get method for field minImageExtent
	 * Prototype: VkExtent2D  minImageExtent
	 */ 
	 public VkExtent2D minImageExtent(){
		 // return  this.minImageExtent;
		 return minImageExtent0(super.ptr);
	 }

	/**
	 * Set method for field maxImageExtent
	 * Prototype: VkExtent2D  maxImageExtent
	 */ 
	 public void maxImageExtent(VkExtent2D maxImageExtent){
		 this.maxImageExtent = maxImageExtent;
		maxImageExtent0(super.ptr, maxImageExtent);
	 }

	/**
	 * get method for field maxImageExtent
	 * Prototype: VkExtent2D  maxImageExtent
	 */ 
	 public VkExtent2D maxImageExtent(){
		 // return  this.maxImageExtent;
		 return maxImageExtent0(super.ptr);
	 }

	/**
	 * Set method for field maxImageArrayLayers
	 * Prototype: uint32_t  maxImageArrayLayers
	 */ 
	 public void maxImageArrayLayers(int maxImageArrayLayers){
		 this.maxImageArrayLayers = maxImageArrayLayers;
		maxImageArrayLayers0(super.ptr, maxImageArrayLayers);
	 }

	/**
	 * get method for field maxImageArrayLayers
	 * Prototype: uint32_t  maxImageArrayLayers
	 */ 
	 public int maxImageArrayLayers(){
		 // return  this.maxImageArrayLayers;
		 return maxImageArrayLayers0(super.ptr);
	 }

	/**
	 * Set method for field supportedTransforms
	 * Prototype: VkSurfaceTransformFlagsKHR  supportedTransforms
	 */ 
	 public void supportedTransforms(int supportedTransforms){
		 this.supportedTransforms = supportedTransforms;
		supportedTransforms0(super.ptr, supportedTransforms);
	 }

	/**
	 * get method for field supportedTransforms
	 * Prototype: VkSurfaceTransformFlagsKHR  supportedTransforms
	 */ 
	 public int supportedTransforms(){
		 // return  this.supportedTransforms;
		 return supportedTransforms0(super.ptr);
	 }

	/**
	 * Set method for field currentTransform
	 * Prototype: VkSurfaceTransformFlagBitsKHR  currentTransform
	 */ 
	 public void currentTransform(VkSurfaceTransformFlagBitsKHR currentTransform){
		 this.currentTransform = currentTransform;
		currentTransform0(super.ptr, currentTransform);
	 }

	/**
	 * get method for field currentTransform
	 * Prototype: VkSurfaceTransformFlagBitsKHR  currentTransform
	 */ 
	 public VkSurfaceTransformFlagBitsKHR currentTransform(){
		 // return  this.currentTransform;
		 return currentTransform0(super.ptr);
	 }

	/**
	 * Set method for field supportedCompositeAlpha
	 * Prototype: VkCompositeAlphaFlagsKHR  supportedCompositeAlpha
	 */ 
	 public void supportedCompositeAlpha(int supportedCompositeAlpha){
		 this.supportedCompositeAlpha = supportedCompositeAlpha;
		supportedCompositeAlpha0(super.ptr, supportedCompositeAlpha);
	 }

	/**
	 * get method for field supportedCompositeAlpha
	 * Prototype: VkCompositeAlphaFlagsKHR  supportedCompositeAlpha
	 */ 
	 public int supportedCompositeAlpha(){
		 // return  this.supportedCompositeAlpha;
		 return supportedCompositeAlpha0(super.ptr);
	 }

	/**
	 * Set method for field supportedUsageFlags
	 * Prototype: VkImageUsageFlags  supportedUsageFlags
	 */ 
	 public void supportedUsageFlags(int supportedUsageFlags){
		 this.supportedUsageFlags = supportedUsageFlags;
		supportedUsageFlags0(super.ptr, supportedUsageFlags);
	 }

	/**
	 * get method for field supportedUsageFlags
	 * Prototype: VkImageUsageFlags  supportedUsageFlags
	 */ 
	 public int supportedUsageFlags(){
		 // return  this.supportedUsageFlags;
		 return supportedUsageFlags0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field minImageCount
	 * Prototype: uint32_t  minImageCount
	 */ 
	 private static native void minImageCount0(ByteBuffer ptr, int _minImageCount);/*
		  VkSurfaceCapabilitiesKHR _obj = (VkSurfaceCapabilitiesKHR)(*ptr);
		  _obj.minImageCount = (uint32_t) (_minImageCount);
	  */

	/**
	 * get method for field minImageCount
	 * Prototype: uint32_t  minImageCount
	 */ 
	 private static native int minImageCount0(ByteBuffer ptr);/*
		  VkSurfaceCapabilitiesKHR _obj = (VkSurfaceCapabilitiesKHR)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field maxImageCount
	 * Prototype: uint32_t  maxImageCount
	 */ 
	 private static native void maxImageCount0(ByteBuffer ptr, int _maxImageCount);/*
		  VkSurfaceCapabilitiesKHR _obj = (VkSurfaceCapabilitiesKHR)(*ptr);
		  _obj.maxImageCount = (uint32_t) (_maxImageCount);
	  */

	/**
	 * get method for field maxImageCount
	 * Prototype: uint32_t  maxImageCount
	 */ 
	 private static native int maxImageCount0(ByteBuffer ptr);/*
		  VkSurfaceCapabilitiesKHR _obj = (VkSurfaceCapabilitiesKHR)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field currentExtent
	 * Prototype: VkExtent2D  currentExtent
	 */ 
	 private static native void currentExtent0(ByteBuffer ptr, VkExtent2D _currentExtent);/*
		  VkSurfaceCapabilitiesKHR _obj = (VkSurfaceCapabilitiesKHR)(*ptr);
		  _obj.currentExtent = (VkExtent2D) (_currentExtent);
	  */

	/**
	 * get method for field currentExtent
	 * Prototype: VkExtent2D  currentExtent
	 */ 
	 private static native VkExtent2D currentExtent0(ByteBuffer ptr);/*
		  VkSurfaceCapabilitiesKHR _obj = (VkSurfaceCapabilitiesKHR)(ptr);
		  return (VkExtent2D) (_obj.VkExtent2D);
	 */

	/**
	 * native Set method for field minImageExtent
	 * Prototype: VkExtent2D  minImageExtent
	 */ 
	 private static native void minImageExtent0(ByteBuffer ptr, VkExtent2D _minImageExtent);/*
		  VkSurfaceCapabilitiesKHR _obj = (VkSurfaceCapabilitiesKHR)(*ptr);
		  _obj.minImageExtent = (VkExtent2D) (_minImageExtent);
	  */

	/**
	 * get method for field minImageExtent
	 * Prototype: VkExtent2D  minImageExtent
	 */ 
	 private static native VkExtent2D minImageExtent0(ByteBuffer ptr);/*
		  VkSurfaceCapabilitiesKHR _obj = (VkSurfaceCapabilitiesKHR)(ptr);
		  return (VkExtent2D) (_obj.VkExtent2D);
	 */

	/**
	 * native Set method for field maxImageExtent
	 * Prototype: VkExtent2D  maxImageExtent
	 */ 
	 private static native void maxImageExtent0(ByteBuffer ptr, VkExtent2D _maxImageExtent);/*
		  VkSurfaceCapabilitiesKHR _obj = (VkSurfaceCapabilitiesKHR)(*ptr);
		  _obj.maxImageExtent = (VkExtent2D) (_maxImageExtent);
	  */

	/**
	 * get method for field maxImageExtent
	 * Prototype: VkExtent2D  maxImageExtent
	 */ 
	 private static native VkExtent2D maxImageExtent0(ByteBuffer ptr);/*
		  VkSurfaceCapabilitiesKHR _obj = (VkSurfaceCapabilitiesKHR)(ptr);
		  return (VkExtent2D) (_obj.VkExtent2D);
	 */

	/**
	 * native Set method for field maxImageArrayLayers
	 * Prototype: uint32_t  maxImageArrayLayers
	 */ 
	 private static native void maxImageArrayLayers0(ByteBuffer ptr, int _maxImageArrayLayers);/*
		  VkSurfaceCapabilitiesKHR _obj = (VkSurfaceCapabilitiesKHR)(*ptr);
		  _obj.maxImageArrayLayers = (uint32_t) (_maxImageArrayLayers);
	  */

	/**
	 * get method for field maxImageArrayLayers
	 * Prototype: uint32_t  maxImageArrayLayers
	 */ 
	 private static native int maxImageArrayLayers0(ByteBuffer ptr);/*
		  VkSurfaceCapabilitiesKHR _obj = (VkSurfaceCapabilitiesKHR)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field supportedTransforms
	 * Prototype: VkSurfaceTransformFlagsKHR  supportedTransforms
	 */ 
	 private static native void supportedTransforms0(ByteBuffer ptr, int _supportedTransforms);/*
		  VkSurfaceCapabilitiesKHR _obj = (VkSurfaceCapabilitiesKHR)(*ptr);
		  _obj.supportedTransforms = (VkSurfaceTransformFlagsKHR) (_supportedTransforms);
	  */

	/**
	 * get method for field supportedTransforms
	 * Prototype: VkSurfaceTransformFlagsKHR  supportedTransforms
	 */ 
	 private static native int supportedTransforms0(ByteBuffer ptr);/*
		  VkSurfaceCapabilitiesKHR _obj = (VkSurfaceCapabilitiesKHR)(ptr);
		  return (jint) (_obj.VkSurfaceTransformFlagsKHR);
	 */

	/**
	 * native Set method for field currentTransform
	 * Prototype: VkSurfaceTransformFlagBitsKHR  currentTransform
	 */ 
	 private static native void currentTransform0(ByteBuffer ptr, VkSurfaceTransformFlagBitsKHR _currentTransform);/*
		  VkSurfaceCapabilitiesKHR _obj = (VkSurfaceCapabilitiesKHR)(*ptr);
		  _obj.currentTransform = (VkSurfaceTransformFlagBitsKHR) (_currentTransform);
	  */

	/**
	 * get method for field currentTransform
	 * Prototype: VkSurfaceTransformFlagBitsKHR  currentTransform
	 */ 
	 private static native VkSurfaceTransformFlagBitsKHR currentTransform0(ByteBuffer ptr);/*
		  VkSurfaceCapabilitiesKHR _obj = (VkSurfaceCapabilitiesKHR)(ptr);
		  return (VkSurfaceTransformFlagBitsKHR) (_obj.VkSurfaceTransformFlagBitsKHR);
	 */

	/**
	 * native Set method for field supportedCompositeAlpha
	 * Prototype: VkCompositeAlphaFlagsKHR  supportedCompositeAlpha
	 */ 
	 private static native void supportedCompositeAlpha0(ByteBuffer ptr, int _supportedCompositeAlpha);/*
		  VkSurfaceCapabilitiesKHR _obj = (VkSurfaceCapabilitiesKHR)(*ptr);
		  _obj.supportedCompositeAlpha = (VkCompositeAlphaFlagsKHR) (_supportedCompositeAlpha);
	  */

	/**
	 * get method for field supportedCompositeAlpha
	 * Prototype: VkCompositeAlphaFlagsKHR  supportedCompositeAlpha
	 */ 
	 private static native int supportedCompositeAlpha0(ByteBuffer ptr);/*
		  VkSurfaceCapabilitiesKHR _obj = (VkSurfaceCapabilitiesKHR)(ptr);
		  return (jint) (_obj.VkCompositeAlphaFlagsKHR);
	 */

	/**
	 * native Set method for field supportedUsageFlags
	 * Prototype: VkImageUsageFlags  supportedUsageFlags
	 */ 
	 private static native void supportedUsageFlags0(ByteBuffer ptr, int _supportedUsageFlags);/*
		  VkSurfaceCapabilitiesKHR _obj = (VkSurfaceCapabilitiesKHR)(*ptr);
		  _obj.supportedUsageFlags = (VkImageUsageFlags) (_supportedUsageFlags);
	  */

	/**
	 * get method for field supportedUsageFlags
	 * Prototype: VkImageUsageFlags  supportedUsageFlags
	 */ 
	 private static native int supportedUsageFlags0(ByteBuffer ptr);/*
		  VkSurfaceCapabilitiesKHR _obj = (VkSurfaceCapabilitiesKHR)(ptr);
		  return (jint) (_obj.VkImageUsageFlags);
	 */



} // end of class VkSurfaceCapabilitiesKHR
