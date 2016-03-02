/**
 * Class wrapping Vulkan's VkPhysicalDeviceSparseProperties struct.
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
 *  This class is a Java front end for struct VkPhysicalDeviceSparseProperties. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPhysicalDeviceSparseProperties {
 *     VkBool32    residencyStandard2DBlockShape;
 *     VkBool32    residencyStandard2DMultisampleBlockShape;
 *     VkBool32    residencyStandard3DBlockShape;
 *     VkBool32    residencyAlignedMipSize;
 *     VkBool32    residencyNonResidentStrict;
 * } VkPhysicalDeviceSparseProperties;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkPhysicalDeviceSparseProperties extends VkStruct {
	/** TAG of this structure [133]  */
	 private static final String TAG = "VkPhysicalDeviceSparseProperties";

	/** ID of this structure [133]  */
	 public static final int TAG_ID = VKPHYSICALDEVICESPARSEPROPERTIES_ID;

	 // fields //
	/**
	 *  VkBool32 	residencyStandard2DBlockShape 
	 */ 
	boolean 	residencyStandard2DBlockShape;

	/**
	 *  VkBool32 	residencyStandard2DMultisampleBlockShape 
	 */ 
	boolean 	residencyStandard2DMultisampleBlockShape;

	/**
	 *  VkBool32 	residencyStandard3DBlockShape 
	 */ 
	boolean 	residencyStandard3DBlockShape;

	/**
	 *  VkBool32 	residencyAlignedMipSize 
	 */ 
	boolean 	residencyAlignedMipSize;

	/**
	 *  VkBool32 	residencyNonResidentStrict 
	 */ 
	boolean 	residencyNonResidentStrict;

	/**
	 * Ctor
	 */
	public VkPhysicalDeviceSparseProperties(){ 
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
	 * Set method for field residencyStandard2DBlockShape
	 * Prototype: VkBool32  residencyStandard2DBlockShape
	 */ 
	 public void residencyStandard2DBlockShape(boolean residencyStandard2DBlockShape){
		 this.residencyStandard2DBlockShape = residencyStandard2DBlockShape;
		residencyStandard2DBlockShape0(super.ptr, residencyStandard2DBlockShape);
	 }

	/**
	 * get method for field residencyStandard2DBlockShape
	 * Prototype: VkBool32  residencyStandard2DBlockShape
	 */ 
	 public boolean residencyStandard2DBlockShape(){
		 // return  this.residencyStandard2DBlockShape;
		 return residencyStandard2DBlockShape0(super.ptr);
	 }

	/**
	 * Set method for field residencyStandard2DMultisampleBlockShape
	 * Prototype: VkBool32  residencyStandard2DMultisampleBlockShape
	 */ 
	 public void residencyStandard2DMultisampleBlockShape(boolean residencyStandard2DMultisampleBlockShape){
		 this.residencyStandard2DMultisampleBlockShape = residencyStandard2DMultisampleBlockShape;
		residencyStandard2DMultisampleBlockShape0(super.ptr, residencyStandard2DMultisampleBlockShape);
	 }

	/**
	 * get method for field residencyStandard2DMultisampleBlockShape
	 * Prototype: VkBool32  residencyStandard2DMultisampleBlockShape
	 */ 
	 public boolean residencyStandard2DMultisampleBlockShape(){
		 // return  this.residencyStandard2DMultisampleBlockShape;
		 return residencyStandard2DMultisampleBlockShape0(super.ptr);
	 }

	/**
	 * Set method for field residencyStandard3DBlockShape
	 * Prototype: VkBool32  residencyStandard3DBlockShape
	 */ 
	 public void residencyStandard3DBlockShape(boolean residencyStandard3DBlockShape){
		 this.residencyStandard3DBlockShape = residencyStandard3DBlockShape;
		residencyStandard3DBlockShape0(super.ptr, residencyStandard3DBlockShape);
	 }

	/**
	 * get method for field residencyStandard3DBlockShape
	 * Prototype: VkBool32  residencyStandard3DBlockShape
	 */ 
	 public boolean residencyStandard3DBlockShape(){
		 // return  this.residencyStandard3DBlockShape;
		 return residencyStandard3DBlockShape0(super.ptr);
	 }

	/**
	 * Set method for field residencyAlignedMipSize
	 * Prototype: VkBool32  residencyAlignedMipSize
	 */ 
	 public void residencyAlignedMipSize(boolean residencyAlignedMipSize){
		 this.residencyAlignedMipSize = residencyAlignedMipSize;
		residencyAlignedMipSize0(super.ptr, residencyAlignedMipSize);
	 }

	/**
	 * get method for field residencyAlignedMipSize
	 * Prototype: VkBool32  residencyAlignedMipSize
	 */ 
	 public boolean residencyAlignedMipSize(){
		 // return  this.residencyAlignedMipSize;
		 return residencyAlignedMipSize0(super.ptr);
	 }

	/**
	 * Set method for field residencyNonResidentStrict
	 * Prototype: VkBool32  residencyNonResidentStrict
	 */ 
	 public void residencyNonResidentStrict(boolean residencyNonResidentStrict){
		 this.residencyNonResidentStrict = residencyNonResidentStrict;
		residencyNonResidentStrict0(super.ptr, residencyNonResidentStrict);
	 }

	/**
	 * get method for field residencyNonResidentStrict
	 * Prototype: VkBool32  residencyNonResidentStrict
	 */ 
	 public boolean residencyNonResidentStrict(){
		 // return  this.residencyNonResidentStrict;
		 return residencyNonResidentStrict0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field residencyStandard2DBlockShape
	 * Prototype: VkBool32  residencyStandard2DBlockShape
	 */ 
	 private static native void residencyStandard2DBlockShape0(ByteBuffer ptr, boolean _residencyStandard2DBlockShape);/*
		  VkPhysicalDeviceSparseProperties _obj = (VkPhysicalDeviceSparseProperties)(*ptr);
		  _obj.residencyStandard2DBlockShape = (VkBool32) (_residencyStandard2DBlockShape);
	  */

	/**
	 * get method for field residencyStandard2DBlockShape
	 * Prototype: VkBool32  residencyStandard2DBlockShape
	 */ 
	 private static native boolean residencyStandard2DBlockShape0(ByteBuffer ptr);/*
		  VkPhysicalDeviceSparseProperties _obj = (VkPhysicalDeviceSparseProperties)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native Set method for field residencyStandard2DMultisampleBlockShape
	 * Prototype: VkBool32  residencyStandard2DMultisampleBlockShape
	 */ 
	 private static native void residencyStandard2DMultisampleBlockShape0(ByteBuffer ptr, boolean _residencyStandard2DMultisampleBlockShape);/*
		  VkPhysicalDeviceSparseProperties _obj = (VkPhysicalDeviceSparseProperties)(*ptr);
		  _obj.residencyStandard2DMultisampleBlockShape = (VkBool32) (_residencyStandard2DMultisampleBlockShape);
	  */

	/**
	 * get method for field residencyStandard2DMultisampleBlockShape
	 * Prototype: VkBool32  residencyStandard2DMultisampleBlockShape
	 */ 
	 private static native boolean residencyStandard2DMultisampleBlockShape0(ByteBuffer ptr);/*
		  VkPhysicalDeviceSparseProperties _obj = (VkPhysicalDeviceSparseProperties)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native Set method for field residencyStandard3DBlockShape
	 * Prototype: VkBool32  residencyStandard3DBlockShape
	 */ 
	 private static native void residencyStandard3DBlockShape0(ByteBuffer ptr, boolean _residencyStandard3DBlockShape);/*
		  VkPhysicalDeviceSparseProperties _obj = (VkPhysicalDeviceSparseProperties)(*ptr);
		  _obj.residencyStandard3DBlockShape = (VkBool32) (_residencyStandard3DBlockShape);
	  */

	/**
	 * get method for field residencyStandard3DBlockShape
	 * Prototype: VkBool32  residencyStandard3DBlockShape
	 */ 
	 private static native boolean residencyStandard3DBlockShape0(ByteBuffer ptr);/*
		  VkPhysicalDeviceSparseProperties _obj = (VkPhysicalDeviceSparseProperties)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native Set method for field residencyAlignedMipSize
	 * Prototype: VkBool32  residencyAlignedMipSize
	 */ 
	 private static native void residencyAlignedMipSize0(ByteBuffer ptr, boolean _residencyAlignedMipSize);/*
		  VkPhysicalDeviceSparseProperties _obj = (VkPhysicalDeviceSparseProperties)(*ptr);
		  _obj.residencyAlignedMipSize = (VkBool32) (_residencyAlignedMipSize);
	  */

	/**
	 * get method for field residencyAlignedMipSize
	 * Prototype: VkBool32  residencyAlignedMipSize
	 */ 
	 private static native boolean residencyAlignedMipSize0(ByteBuffer ptr);/*
		  VkPhysicalDeviceSparseProperties _obj = (VkPhysicalDeviceSparseProperties)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native Set method for field residencyNonResidentStrict
	 * Prototype: VkBool32  residencyNonResidentStrict
	 */ 
	 private static native void residencyNonResidentStrict0(ByteBuffer ptr, boolean _residencyNonResidentStrict);/*
		  VkPhysicalDeviceSparseProperties _obj = (VkPhysicalDeviceSparseProperties)(*ptr);
		  _obj.residencyNonResidentStrict = (VkBool32) (_residencyNonResidentStrict);
	  */

	/**
	 * get method for field residencyNonResidentStrict
	 * Prototype: VkBool32  residencyNonResidentStrict
	 */ 
	 private static native boolean residencyNonResidentStrict0(ByteBuffer ptr);/*
		  VkPhysicalDeviceSparseProperties _obj = (VkPhysicalDeviceSparseProperties)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */



} // end of class VkPhysicalDeviceSparseProperties
