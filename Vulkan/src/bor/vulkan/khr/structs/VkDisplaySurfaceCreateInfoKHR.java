/**
 * Class wrapping Vulkan's VkDisplaySurfaceCreateInfoKHR struct.
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


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkDisplaySurfaceCreateInfoKHR. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDisplaySurfaceCreateInfoKHR {
 *     VkStructureType                   sType;
 *     const void*                       pNext;
 *     VkDisplaySurfaceCreateFlagsKHR    flags;
 *     VkDisplayModeKHR                  displayMode;
 *     uint32_t                          planeIndex;
 *     uint32_t                          planeStackIndex;
 *     VkSurfaceTransformFlagBitsKHR     transform;
 *     float                             globalAlpha;
 *     VkDisplayPlaneAlphaFlagBitsKHR    alphaMode;
 *     VkExtent2D                        imageExtent;
 * } VkDisplaySurfaceCreateInfoKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkDisplaySurfaceCreateInfoKHR extends VkStruct {
	/** TAG of this structure [240]  */
	 private static final String TAG = "VkDisplaySurfaceCreateInfoKHR";

	/** ID of this structure [240]  */
	 public static final int TAG_ID = VKDISPLAYSURFACECREATEINFOKHR_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType 
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext 
	 */ 
	P<VkObject> 	pNext;

	/**
	 *  VkDisplaySurfaceCreateFlagsKHR 	flags 
	 */ 
	int 	flags;

	/**
	 *  VkDisplayModeKHR 	displayMode 
	 */ 
	VkDisplayModeKHR 	displayMode;

	/**
	 *  uint32_t 	planeIndex 
	 */ 
	int 	planeIndex;

	/**
	 *  uint32_t 	planeStackIndex 
	 */ 
	int 	planeStackIndex;

	/**
	 *  VkSurfaceTransformFlagBitsKHR 	transform 
	 */ 
	VkSurfaceTransformFlagBitsKHR 	transform;

	/**
	 *  float 	globalAlpha 
	 */ 
	float 	globalAlpha;

	/**
	 *  VkDisplayPlaneAlphaFlagBitsKHR 	alphaMode 
	 */ 
	VkDisplayPlaneAlphaFlagBitsKHR 	alphaMode;

	/**
	 *  VkExtent2D 	imageExtent 
	 */ 
	VkExtent2D 	imageExtent;

	/**
	 * Ctor
	 */
	public VkDisplaySurfaceCreateInfoKHR(){ 
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
	 * Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType
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
	 * Prototype: VkDisplaySurfaceCreateFlagsKHR  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkDisplaySurfaceCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field displayMode
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 public void displayMode(VkDisplayModeKHR displayMode){
		 this.displayMode = displayMode;
		displayMode0(super.ptr, displayMode);
	 }

	/**
	 * get method for field displayMode
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 public VkDisplayModeKHR displayMode(){
		 // return  this.displayMode;
		 return displayMode0(super.ptr);
	 }

	/**
	 * Set method for field planeIndex
	 * Prototype: uint32_t  planeIndex
	 */ 
	 public void planeIndex(int planeIndex){
		 this.planeIndex = planeIndex;
		planeIndex0(super.ptr, planeIndex);
	 }

	/**
	 * get method for field planeIndex
	 * Prototype: uint32_t  planeIndex
	 */ 
	 public int planeIndex(){
		 // return  this.planeIndex;
		 return planeIndex0(super.ptr);
	 }

	/**
	 * Set method for field planeStackIndex
	 * Prototype: uint32_t  planeStackIndex
	 */ 
	 public void planeStackIndex(int planeStackIndex){
		 this.planeStackIndex = planeStackIndex;
		planeStackIndex0(super.ptr, planeStackIndex);
	 }

	/**
	 * get method for field planeStackIndex
	 * Prototype: uint32_t  planeStackIndex
	 */ 
	 public int planeStackIndex(){
		 // return  this.planeStackIndex;
		 return planeStackIndex0(super.ptr);
	 }

	/**
	 * Set method for field transform
	 * Prototype: VkSurfaceTransformFlagBitsKHR  transform
	 */ 
	 public void transform(VkSurfaceTransformFlagBitsKHR transform){
		 this.transform = transform;
		transform0(super.ptr, transform);
	 }

	/**
	 * get method for field transform
	 * Prototype: VkSurfaceTransformFlagBitsKHR  transform
	 */ 
	 public VkSurfaceTransformFlagBitsKHR transform(){
		 // return  this.transform;
		 return transform0(super.ptr);
	 }

	/**
	 * Set method for field globalAlpha
	 * Prototype: float  globalAlpha
	 */ 
	 public void globalAlpha(float globalAlpha){
		 this.globalAlpha = globalAlpha;
		globalAlpha0(super.ptr, globalAlpha);
	 }

	/**
	 * get method for field globalAlpha
	 * Prototype: float  globalAlpha
	 */ 
	 public float globalAlpha(){
		 // return  this.globalAlpha;
		 return globalAlpha0(super.ptr);
	 }

	/**
	 * Set method for field alphaMode
	 * Prototype: VkDisplayPlaneAlphaFlagBitsKHR  alphaMode
	 */ 
	 public void alphaMode(VkDisplayPlaneAlphaFlagBitsKHR alphaMode){
		 this.alphaMode = alphaMode;
		alphaMode0(super.ptr, alphaMode);
	 }

	/**
	 * get method for field alphaMode
	 * Prototype: VkDisplayPlaneAlphaFlagBitsKHR  alphaMode
	 */ 
	 public VkDisplayPlaneAlphaFlagBitsKHR alphaMode(){
		 // return  this.alphaMode;
		 return alphaMode0(super.ptr);
	 }

	/**
	 * Set method for field imageExtent
	 * Prototype: VkExtent2D  imageExtent
	 */ 
	 public void imageExtent(VkExtent2D imageExtent){
		 this.imageExtent = imageExtent;
		imageExtent0(super.ptr, imageExtent);
	 }

	/**
	 * get method for field imageExtent
	 * Prototype: VkExtent2D  imageExtent
	 */ 
	 public VkExtent2D imageExtent(){
		 // return  this.imageExtent;
		 return imageExtent0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkDisplaySurfaceCreateInfoKHR _obj = (VkDisplaySurfaceCreateInfoKHR)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR _obj = (VkDisplaySurfaceCreateInfoKHR)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkDisplaySurfaceCreateInfoKHR _obj = (VkDisplaySurfaceCreateInfoKHR)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR _obj = (VkDisplaySurfaceCreateInfoKHR)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkDisplaySurfaceCreateFlagsKHR  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkDisplaySurfaceCreateInfoKHR _obj = (VkDisplaySurfaceCreateInfoKHR)(*ptr);
		  _obj.flags = (VkDisplaySurfaceCreateFlagsKHR) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkDisplaySurfaceCreateFlagsKHR  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR _obj = (VkDisplaySurfaceCreateInfoKHR)(ptr);
		  return (jint) (_obj.VkDisplaySurfaceCreateFlagsKHR);
	 */

	/**
	 * native Set method for field displayMode
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 private static native void displayMode0(ByteBuffer ptr, VkDisplayModeKHR _displayMode);/*
		  VkDisplaySurfaceCreateInfoKHR _obj = (VkDisplaySurfaceCreateInfoKHR)(*ptr);
		  _obj.displayMode = (VkDisplayModeKHR) (_displayMode);
	  */

	/**
	 * get method for field displayMode
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 private static native VkDisplayModeKHR displayMode0(ByteBuffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR _obj = (VkDisplaySurfaceCreateInfoKHR)(ptr);
		  return (VkDisplayModeKHR) (_obj.VkDisplayModeKHR);
	 */

	/**
	 * native Set method for field planeIndex
	 * Prototype: uint32_t  planeIndex
	 */ 
	 private static native void planeIndex0(ByteBuffer ptr, int _planeIndex);/*
		  VkDisplaySurfaceCreateInfoKHR _obj = (VkDisplaySurfaceCreateInfoKHR)(*ptr);
		  _obj.planeIndex = (uint32_t) (_planeIndex);
	  */

	/**
	 * get method for field planeIndex
	 * Prototype: uint32_t  planeIndex
	 */ 
	 private static native int planeIndex0(ByteBuffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR _obj = (VkDisplaySurfaceCreateInfoKHR)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field planeStackIndex
	 * Prototype: uint32_t  planeStackIndex
	 */ 
	 private static native void planeStackIndex0(ByteBuffer ptr, int _planeStackIndex);/*
		  VkDisplaySurfaceCreateInfoKHR _obj = (VkDisplaySurfaceCreateInfoKHR)(*ptr);
		  _obj.planeStackIndex = (uint32_t) (_planeStackIndex);
	  */

	/**
	 * get method for field planeStackIndex
	 * Prototype: uint32_t  planeStackIndex
	 */ 
	 private static native int planeStackIndex0(ByteBuffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR _obj = (VkDisplaySurfaceCreateInfoKHR)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field transform
	 * Prototype: VkSurfaceTransformFlagBitsKHR  transform
	 */ 
	 private static native void transform0(ByteBuffer ptr, VkSurfaceTransformFlagBitsKHR _transform);/*
		  VkDisplaySurfaceCreateInfoKHR _obj = (VkDisplaySurfaceCreateInfoKHR)(*ptr);
		  _obj.transform = (VkSurfaceTransformFlagBitsKHR) (_transform);
	  */

	/**
	 * get method for field transform
	 * Prototype: VkSurfaceTransformFlagBitsKHR  transform
	 */ 
	 private static native VkSurfaceTransformFlagBitsKHR transform0(ByteBuffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR _obj = (VkDisplaySurfaceCreateInfoKHR)(ptr);
		  return (VkSurfaceTransformFlagBitsKHR) (_obj.VkSurfaceTransformFlagBitsKHR);
	 */

	/**
	 * native Set method for field globalAlpha
	 * Prototype: float  globalAlpha
	 */ 
	 private static native void globalAlpha0(ByteBuffer ptr, float _globalAlpha);/*
		  VkDisplaySurfaceCreateInfoKHR _obj = (VkDisplaySurfaceCreateInfoKHR)(*ptr);
		  _obj.globalAlpha = (float) (_globalAlpha);
	  */

	/**
	 * get method for field globalAlpha
	 * Prototype: float  globalAlpha
	 */ 
	 private static native float globalAlpha0(ByteBuffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR _obj = (VkDisplaySurfaceCreateInfoKHR)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native Set method for field alphaMode
	 * Prototype: VkDisplayPlaneAlphaFlagBitsKHR  alphaMode
	 */ 
	 private static native void alphaMode0(ByteBuffer ptr, VkDisplayPlaneAlphaFlagBitsKHR _alphaMode);/*
		  VkDisplaySurfaceCreateInfoKHR _obj = (VkDisplaySurfaceCreateInfoKHR)(*ptr);
		  _obj.alphaMode = (VkDisplayPlaneAlphaFlagBitsKHR) (_alphaMode);
	  */

	/**
	 * get method for field alphaMode
	 * Prototype: VkDisplayPlaneAlphaFlagBitsKHR  alphaMode
	 */ 
	 private static native VkDisplayPlaneAlphaFlagBitsKHR alphaMode0(ByteBuffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR _obj = (VkDisplaySurfaceCreateInfoKHR)(ptr);
		  return (VkDisplayPlaneAlphaFlagBitsKHR) (_obj.VkDisplayPlaneAlphaFlagBitsKHR);
	 */

	/**
	 * native Set method for field imageExtent
	 * Prototype: VkExtent2D  imageExtent
	 */ 
	 private static native void imageExtent0(ByteBuffer ptr, VkExtent2D _imageExtent);/*
		  VkDisplaySurfaceCreateInfoKHR _obj = (VkDisplaySurfaceCreateInfoKHR)(*ptr);
		  _obj.imageExtent = (VkExtent2D) (_imageExtent);
	  */

	/**
	 * get method for field imageExtent
	 * Prototype: VkExtent2D  imageExtent
	 */ 
	 private static native VkExtent2D imageExtent0(ByteBuffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR _obj = (VkDisplaySurfaceCreateInfoKHR)(ptr);
		  return (VkExtent2D) (_obj.VkExtent2D);
	 */



} // end of class VkDisplaySurfaceCreateInfoKHR
