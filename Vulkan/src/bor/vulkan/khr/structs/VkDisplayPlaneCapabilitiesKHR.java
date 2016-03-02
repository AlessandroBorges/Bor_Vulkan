/**
 * Class wrapping Vulkan's VkDisplayPlaneCapabilitiesKHR struct.
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
 *  This class is a Java front end for struct VkDisplayPlaneCapabilitiesKHR. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDisplayPlaneCapabilitiesKHR {
 *     VkDisplayPlaneAlphaFlagsKHR    supportedAlpha;
 *     VkOffset2D                     minSrcPosition;
 *     VkOffset2D                     maxSrcPosition;
 *     VkExtent2D                     minSrcExtent;
 *     VkExtent2D                     maxSrcExtent;
 *     VkOffset2D                     minDstPosition;
 *     VkOffset2D                     maxDstPosition;
 *     VkExtent2D                     minDstExtent;
 *     VkExtent2D                     maxDstExtent;
 * } VkDisplayPlaneCapabilitiesKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkDisplayPlaneCapabilitiesKHR extends VkStruct {
	/** TAG of this structure [238]  */
	 private static final String TAG = "VkDisplayPlaneCapabilitiesKHR";

	/** ID of this structure [238]  */
	 public static final int TAG_ID = VKDISPLAYPLANECAPABILITIESKHR_ID;

	 // fields //
	/**
	 *  VkDisplayPlaneAlphaFlagsKHR 	supportedAlpha 
	 */ 
	int 	supportedAlpha;

	/**
	 *  VkOffset2D 	minSrcPosition 
	 */ 
	VkOffset2D 	minSrcPosition;

	/**
	 *  VkOffset2D 	maxSrcPosition 
	 */ 
	VkOffset2D 	maxSrcPosition;

	/**
	 *  VkExtent2D 	minSrcExtent 
	 */ 
	VkExtent2D 	minSrcExtent;

	/**
	 *  VkExtent2D 	maxSrcExtent 
	 */ 
	VkExtent2D 	maxSrcExtent;

	/**
	 *  VkOffset2D 	minDstPosition 
	 */ 
	VkOffset2D 	minDstPosition;

	/**
	 *  VkOffset2D 	maxDstPosition 
	 */ 
	VkOffset2D 	maxDstPosition;

	/**
	 *  VkExtent2D 	minDstExtent 
	 */ 
	VkExtent2D 	minDstExtent;

	/**
	 *  VkExtent2D 	maxDstExtent 
	 */ 
	VkExtent2D 	maxDstExtent;

	/**
	 * Ctor
	 */
	public VkDisplayPlaneCapabilitiesKHR(){ 
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
	 * Set method for field supportedAlpha
	 * Prototype: VkDisplayPlaneAlphaFlagsKHR  supportedAlpha
	 */ 
	 public void supportedAlpha(int supportedAlpha){
		 this.supportedAlpha = supportedAlpha;
		supportedAlpha0(super.ptr, supportedAlpha);
	 }

	/**
	 * get method for field supportedAlpha
	 * Prototype: VkDisplayPlaneAlphaFlagsKHR  supportedAlpha
	 */ 
	 public int supportedAlpha(){
		 // return  this.supportedAlpha;
		 return supportedAlpha0(super.ptr);
	 }

	/**
	 * Set method for field minSrcPosition
	 * Prototype: VkOffset2D  minSrcPosition
	 */ 
	 public void minSrcPosition(VkOffset2D minSrcPosition){
		 this.minSrcPosition = minSrcPosition;
		minSrcPosition0(super.ptr, minSrcPosition);
	 }

	/**
	 * get method for field minSrcPosition
	 * Prototype: VkOffset2D  minSrcPosition
	 */ 
	 public VkOffset2D minSrcPosition(){
		 // return  this.minSrcPosition;
		 return minSrcPosition0(super.ptr);
	 }

	/**
	 * Set method for field maxSrcPosition
	 * Prototype: VkOffset2D  maxSrcPosition
	 */ 
	 public void maxSrcPosition(VkOffset2D maxSrcPosition){
		 this.maxSrcPosition = maxSrcPosition;
		maxSrcPosition0(super.ptr, maxSrcPosition);
	 }

	/**
	 * get method for field maxSrcPosition
	 * Prototype: VkOffset2D  maxSrcPosition
	 */ 
	 public VkOffset2D maxSrcPosition(){
		 // return  this.maxSrcPosition;
		 return maxSrcPosition0(super.ptr);
	 }

	/**
	 * Set method for field minSrcExtent
	 * Prototype: VkExtent2D  minSrcExtent
	 */ 
	 public void minSrcExtent(VkExtent2D minSrcExtent){
		 this.minSrcExtent = minSrcExtent;
		minSrcExtent0(super.ptr, minSrcExtent);
	 }

	/**
	 * get method for field minSrcExtent
	 * Prototype: VkExtent2D  minSrcExtent
	 */ 
	 public VkExtent2D minSrcExtent(){
		 // return  this.minSrcExtent;
		 return minSrcExtent0(super.ptr);
	 }

	/**
	 * Set method for field maxSrcExtent
	 * Prototype: VkExtent2D  maxSrcExtent
	 */ 
	 public void maxSrcExtent(VkExtent2D maxSrcExtent){
		 this.maxSrcExtent = maxSrcExtent;
		maxSrcExtent0(super.ptr, maxSrcExtent);
	 }

	/**
	 * get method for field maxSrcExtent
	 * Prototype: VkExtent2D  maxSrcExtent
	 */ 
	 public VkExtent2D maxSrcExtent(){
		 // return  this.maxSrcExtent;
		 return maxSrcExtent0(super.ptr);
	 }

	/**
	 * Set method for field minDstPosition
	 * Prototype: VkOffset2D  minDstPosition
	 */ 
	 public void minDstPosition(VkOffset2D minDstPosition){
		 this.minDstPosition = minDstPosition;
		minDstPosition0(super.ptr, minDstPosition);
	 }

	/**
	 * get method for field minDstPosition
	 * Prototype: VkOffset2D  minDstPosition
	 */ 
	 public VkOffset2D minDstPosition(){
		 // return  this.minDstPosition;
		 return minDstPosition0(super.ptr);
	 }

	/**
	 * Set method for field maxDstPosition
	 * Prototype: VkOffset2D  maxDstPosition
	 */ 
	 public void maxDstPosition(VkOffset2D maxDstPosition){
		 this.maxDstPosition = maxDstPosition;
		maxDstPosition0(super.ptr, maxDstPosition);
	 }

	/**
	 * get method for field maxDstPosition
	 * Prototype: VkOffset2D  maxDstPosition
	 */ 
	 public VkOffset2D maxDstPosition(){
		 // return  this.maxDstPosition;
		 return maxDstPosition0(super.ptr);
	 }

	/**
	 * Set method for field minDstExtent
	 * Prototype: VkExtent2D  minDstExtent
	 */ 
	 public void minDstExtent(VkExtent2D minDstExtent){
		 this.minDstExtent = minDstExtent;
		minDstExtent0(super.ptr, minDstExtent);
	 }

	/**
	 * get method for field minDstExtent
	 * Prototype: VkExtent2D  minDstExtent
	 */ 
	 public VkExtent2D minDstExtent(){
		 // return  this.minDstExtent;
		 return minDstExtent0(super.ptr);
	 }

	/**
	 * Set method for field maxDstExtent
	 * Prototype: VkExtent2D  maxDstExtent
	 */ 
	 public void maxDstExtent(VkExtent2D maxDstExtent){
		 this.maxDstExtent = maxDstExtent;
		maxDstExtent0(super.ptr, maxDstExtent);
	 }

	/**
	 * get method for field maxDstExtent
	 * Prototype: VkExtent2D  maxDstExtent
	 */ 
	 public VkExtent2D maxDstExtent(){
		 // return  this.maxDstExtent;
		 return maxDstExtent0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field supportedAlpha
	 * Prototype: VkDisplayPlaneAlphaFlagsKHR  supportedAlpha
	 */ 
	 private static native void supportedAlpha0(ByteBuffer ptr, int _supportedAlpha);/*
		  VkDisplayPlaneCapabilitiesKHR _obj = (VkDisplayPlaneCapabilitiesKHR)(*ptr);
		  _obj.supportedAlpha = (VkDisplayPlaneAlphaFlagsKHR) (_supportedAlpha);
	  */

	/**
	 * get method for field supportedAlpha
	 * Prototype: VkDisplayPlaneAlphaFlagsKHR  supportedAlpha
	 */ 
	 private static native int supportedAlpha0(ByteBuffer ptr);/*
		  VkDisplayPlaneCapabilitiesKHR _obj = (VkDisplayPlaneCapabilitiesKHR)(ptr);
		  return (jint) (_obj.VkDisplayPlaneAlphaFlagsKHR);
	 */

	/**
	 * native Set method for field minSrcPosition
	 * Prototype: VkOffset2D  minSrcPosition
	 */ 
	 private static native void minSrcPosition0(ByteBuffer ptr, VkOffset2D _minSrcPosition);/*
		  VkDisplayPlaneCapabilitiesKHR _obj = (VkDisplayPlaneCapabilitiesKHR)(*ptr);
		  _obj.minSrcPosition = (VkOffset2D) (_minSrcPosition);
	  */

	/**
	 * get method for field minSrcPosition
	 * Prototype: VkOffset2D  minSrcPosition
	 */ 
	 private static native VkOffset2D minSrcPosition0(ByteBuffer ptr);/*
		  VkDisplayPlaneCapabilitiesKHR _obj = (VkDisplayPlaneCapabilitiesKHR)(ptr);
		  return (VkOffset2D) (_obj.VkOffset2D);
	 */

	/**
	 * native Set method for field maxSrcPosition
	 * Prototype: VkOffset2D  maxSrcPosition
	 */ 
	 private static native void maxSrcPosition0(ByteBuffer ptr, VkOffset2D _maxSrcPosition);/*
		  VkDisplayPlaneCapabilitiesKHR _obj = (VkDisplayPlaneCapabilitiesKHR)(*ptr);
		  _obj.maxSrcPosition = (VkOffset2D) (_maxSrcPosition);
	  */

	/**
	 * get method for field maxSrcPosition
	 * Prototype: VkOffset2D  maxSrcPosition
	 */ 
	 private static native VkOffset2D maxSrcPosition0(ByteBuffer ptr);/*
		  VkDisplayPlaneCapabilitiesKHR _obj = (VkDisplayPlaneCapabilitiesKHR)(ptr);
		  return (VkOffset2D) (_obj.VkOffset2D);
	 */

	/**
	 * native Set method for field minSrcExtent
	 * Prototype: VkExtent2D  minSrcExtent
	 */ 
	 private static native void minSrcExtent0(ByteBuffer ptr, VkExtent2D _minSrcExtent);/*
		  VkDisplayPlaneCapabilitiesKHR _obj = (VkDisplayPlaneCapabilitiesKHR)(*ptr);
		  _obj.minSrcExtent = (VkExtent2D) (_minSrcExtent);
	  */

	/**
	 * get method for field minSrcExtent
	 * Prototype: VkExtent2D  minSrcExtent
	 */ 
	 private static native VkExtent2D minSrcExtent0(ByteBuffer ptr);/*
		  VkDisplayPlaneCapabilitiesKHR _obj = (VkDisplayPlaneCapabilitiesKHR)(ptr);
		  return (VkExtent2D) (_obj.VkExtent2D);
	 */

	/**
	 * native Set method for field maxSrcExtent
	 * Prototype: VkExtent2D  maxSrcExtent
	 */ 
	 private static native void maxSrcExtent0(ByteBuffer ptr, VkExtent2D _maxSrcExtent);/*
		  VkDisplayPlaneCapabilitiesKHR _obj = (VkDisplayPlaneCapabilitiesKHR)(*ptr);
		  _obj.maxSrcExtent = (VkExtent2D) (_maxSrcExtent);
	  */

	/**
	 * get method for field maxSrcExtent
	 * Prototype: VkExtent2D  maxSrcExtent
	 */ 
	 private static native VkExtent2D maxSrcExtent0(ByteBuffer ptr);/*
		  VkDisplayPlaneCapabilitiesKHR _obj = (VkDisplayPlaneCapabilitiesKHR)(ptr);
		  return (VkExtent2D) (_obj.VkExtent2D);
	 */

	/**
	 * native Set method for field minDstPosition
	 * Prototype: VkOffset2D  minDstPosition
	 */ 
	 private static native void minDstPosition0(ByteBuffer ptr, VkOffset2D _minDstPosition);/*
		  VkDisplayPlaneCapabilitiesKHR _obj = (VkDisplayPlaneCapabilitiesKHR)(*ptr);
		  _obj.minDstPosition = (VkOffset2D) (_minDstPosition);
	  */

	/**
	 * get method for field minDstPosition
	 * Prototype: VkOffset2D  minDstPosition
	 */ 
	 private static native VkOffset2D minDstPosition0(ByteBuffer ptr);/*
		  VkDisplayPlaneCapabilitiesKHR _obj = (VkDisplayPlaneCapabilitiesKHR)(ptr);
		  return (VkOffset2D) (_obj.VkOffset2D);
	 */

	/**
	 * native Set method for field maxDstPosition
	 * Prototype: VkOffset2D  maxDstPosition
	 */ 
	 private static native void maxDstPosition0(ByteBuffer ptr, VkOffset2D _maxDstPosition);/*
		  VkDisplayPlaneCapabilitiesKHR _obj = (VkDisplayPlaneCapabilitiesKHR)(*ptr);
		  _obj.maxDstPosition = (VkOffset2D) (_maxDstPosition);
	  */

	/**
	 * get method for field maxDstPosition
	 * Prototype: VkOffset2D  maxDstPosition
	 */ 
	 private static native VkOffset2D maxDstPosition0(ByteBuffer ptr);/*
		  VkDisplayPlaneCapabilitiesKHR _obj = (VkDisplayPlaneCapabilitiesKHR)(ptr);
		  return (VkOffset2D) (_obj.VkOffset2D);
	 */

	/**
	 * native Set method for field minDstExtent
	 * Prototype: VkExtent2D  minDstExtent
	 */ 
	 private static native void minDstExtent0(ByteBuffer ptr, VkExtent2D _minDstExtent);/*
		  VkDisplayPlaneCapabilitiesKHR _obj = (VkDisplayPlaneCapabilitiesKHR)(*ptr);
		  _obj.minDstExtent = (VkExtent2D) (_minDstExtent);
	  */

	/**
	 * get method for field minDstExtent
	 * Prototype: VkExtent2D  minDstExtent
	 */ 
	 private static native VkExtent2D minDstExtent0(ByteBuffer ptr);/*
		  VkDisplayPlaneCapabilitiesKHR _obj = (VkDisplayPlaneCapabilitiesKHR)(ptr);
		  return (VkExtent2D) (_obj.VkExtent2D);
	 */

	/**
	 * native Set method for field maxDstExtent
	 * Prototype: VkExtent2D  maxDstExtent
	 */ 
	 private static native void maxDstExtent0(ByteBuffer ptr, VkExtent2D _maxDstExtent);/*
		  VkDisplayPlaneCapabilitiesKHR _obj = (VkDisplayPlaneCapabilitiesKHR)(*ptr);
		  _obj.maxDstExtent = (VkExtent2D) (_maxDstExtent);
	  */

	/**
	 * get method for field maxDstExtent
	 * Prototype: VkExtent2D  maxDstExtent
	 */ 
	 private static native VkExtent2D maxDstExtent0(ByteBuffer ptr);/*
		  VkDisplayPlaneCapabilitiesKHR _obj = (VkDisplayPlaneCapabilitiesKHR)(ptr);
		  return (VkExtent2D) (_obj.VkExtent2D);
	 */



} // end of class VkDisplayPlaneCapabilitiesKHR
