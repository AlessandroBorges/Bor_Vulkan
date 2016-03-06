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
 *  Project Bor-Vulkan 
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
	/** TAG of this structure [9]  */
	 private static final String TAG = "VkPhysicalDeviceSparseProperties";

	/** ID of this structure [9]  */
	 public static final int TAG_ID = VKPHYSICALDEVICESPARSEPROPERTIES_ID;

	 // fields //
	/**
	 *  VkBool32 	residencyStandard2DBlockShape	[boolean]
	 */ 
	boolean 	residencyStandard2DBlockShape;

	/**
	 *  VkBool32 	residencyStandard2DMultisampleBlockShape	[boolean]
	 */ 
	boolean 	residencyStandard2DMultisampleBlockShape;

	/**
	 *  VkBool32 	residencyStandard3DBlockShape	[boolean]
	 */ 
	boolean 	residencyStandard3DBlockShape;

	/**
	 *  VkBool32 	residencyAlignedMipSize	[boolean]
	 */ 
	boolean 	residencyAlignedMipSize;

	/**
	 *  VkBool32 	residencyNonResidentStrict	[boolean]
	 */ 
	boolean 	residencyNonResidentStrict;

	/**
	 * Ctor
	 */
	public VkPhysicalDeviceSparseProperties(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPhysicalDeviceSparseProperties(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkPhysicalDeviceSparseProperties(long address, int memSize){ 
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
	 public static P<VkPhysicalDeviceSparseProperties> createNullPointer(){
	        P<VkPhysicalDeviceSparseProperties> p = new  P<VkPhysicalDeviceSparseProperties>(new VkPhysicalDeviceSparseProperties());
	        return p;
	    }

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field residencyStandard2DBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard2DBlockShape
	 */ 
	 public void residencyStandard2DBlockShape(boolean residencyStandard2DBlockShape){
		 this.residencyStandard2DBlockShape = residencyStandard2DBlockShape;
		residencyStandard2DBlockShape0(super.ptr, residencyStandard2DBlockShape);
	 }

	/**
	 * get method for field residencyStandard2DBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard2DBlockShape
	 */ 
	 public boolean residencyStandard2DBlockShape(){
		 // return  this.residencyStandard2DBlockShape;
		 return residencyStandard2DBlockShape0(super.ptr);
	 }

	/**
	 * Set method for field residencyStandard2DMultisampleBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard2DMultisampleBlockShape
	 */ 
	 public void residencyStandard2DMultisampleBlockShape(boolean residencyStandard2DMultisampleBlockShape){
		 this.residencyStandard2DMultisampleBlockShape = residencyStandard2DMultisampleBlockShape;
		residencyStandard2DMultisampleBlockShape0(super.ptr, residencyStandard2DMultisampleBlockShape);
	 }

	/**
	 * get method for field residencyStandard2DMultisampleBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard2DMultisampleBlockShape
	 */ 
	 public boolean residencyStandard2DMultisampleBlockShape(){
		 // return  this.residencyStandard2DMultisampleBlockShape;
		 return residencyStandard2DMultisampleBlockShape0(super.ptr);
	 }

	/**
	 * Set method for field residencyStandard3DBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard3DBlockShape
	 */ 
	 public void residencyStandard3DBlockShape(boolean residencyStandard3DBlockShape){
		 this.residencyStandard3DBlockShape = residencyStandard3DBlockShape;
		residencyStandard3DBlockShape0(super.ptr, residencyStandard3DBlockShape);
	 }

	/**
	 * get method for field residencyStandard3DBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard3DBlockShape
	 */ 
	 public boolean residencyStandard3DBlockShape(){
		 // return  this.residencyStandard3DBlockShape;
		 return residencyStandard3DBlockShape0(super.ptr);
	 }

	/**
	 * Set method for field residencyAlignedMipSize	[boolean]<br>
	 * Prototype: VkBool32  residencyAlignedMipSize
	 */ 
	 public void residencyAlignedMipSize(boolean residencyAlignedMipSize){
		 this.residencyAlignedMipSize = residencyAlignedMipSize;
		residencyAlignedMipSize0(super.ptr, residencyAlignedMipSize);
	 }

	/**
	 * get method for field residencyAlignedMipSize	[boolean]<br>
	 * Prototype: VkBool32  residencyAlignedMipSize
	 */ 
	 public boolean residencyAlignedMipSize(){
		 // return  this.residencyAlignedMipSize;
		 return residencyAlignedMipSize0(super.ptr);
	 }

	/**
	 * Set method for field residencyNonResidentStrict	[boolean]<br>
	 * Prototype: VkBool32  residencyNonResidentStrict
	 */ 
	 public void residencyNonResidentStrict(boolean residencyNonResidentStrict){
		 this.residencyNonResidentStrict = residencyNonResidentStrict;
		residencyNonResidentStrict0(super.ptr, residencyNonResidentStrict);
	 }

	/**
	 * get method for field residencyNonResidentStrict	[boolean]<br>
	 * Prototype: VkBool32  residencyNonResidentStrict
	 */ 
	 public boolean residencyNonResidentStrict(){
		 // return  this.residencyNonResidentStrict;
		 return residencyNonResidentStrict0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field residencyStandard2DBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard2DBlockShape
	 */ 
	 private static native void residencyStandard2DBlockShape0(ByteBuffer ptr, boolean _residencyStandard2DBlockShape);/*
		  VkPhysicalDeviceSparseProperties _obj = (VkPhysicalDeviceSparseProperties)(*ptr);
		  _obj.residencyStandard2DBlockShape = (VkBool32) (_residencyStandard2DBlockShape);
	  */

	/**
	 * native GET method for field residencyStandard2DBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard2DBlockShape
	 */ 
	 private static native boolean residencyStandard2DBlockShape0(ByteBuffer ptr);/*
		  VkPhysicalDeviceSparseProperties _obj = (VkPhysicalDeviceSparseProperties)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field residencyStandard2DMultisampleBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard2DMultisampleBlockShape
	 */ 
	 private static native void residencyStandard2DMultisampleBlockShape0(ByteBuffer ptr, boolean _residencyStandard2DMultisampleBlockShape);/*
		  VkPhysicalDeviceSparseProperties _obj = (VkPhysicalDeviceSparseProperties)(*ptr);
		  _obj.residencyStandard2DMultisampleBlockShape = (VkBool32) (_residencyStandard2DMultisampleBlockShape);
	  */

	/**
	 * native GET method for field residencyStandard2DMultisampleBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard2DMultisampleBlockShape
	 */ 
	 private static native boolean residencyStandard2DMultisampleBlockShape0(ByteBuffer ptr);/*
		  VkPhysicalDeviceSparseProperties _obj = (VkPhysicalDeviceSparseProperties)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field residencyStandard3DBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard3DBlockShape
	 */ 
	 private static native void residencyStandard3DBlockShape0(ByteBuffer ptr, boolean _residencyStandard3DBlockShape);/*
		  VkPhysicalDeviceSparseProperties _obj = (VkPhysicalDeviceSparseProperties)(*ptr);
		  _obj.residencyStandard3DBlockShape = (VkBool32) (_residencyStandard3DBlockShape);
	  */

	/**
	 * native GET method for field residencyStandard3DBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard3DBlockShape
	 */ 
	 private static native boolean residencyStandard3DBlockShape0(ByteBuffer ptr);/*
		  VkPhysicalDeviceSparseProperties _obj = (VkPhysicalDeviceSparseProperties)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field residencyAlignedMipSize	[boolean]<br>
	 * Prototype: VkBool32  residencyAlignedMipSize
	 */ 
	 private static native void residencyAlignedMipSize0(ByteBuffer ptr, boolean _residencyAlignedMipSize);/*
		  VkPhysicalDeviceSparseProperties _obj = (VkPhysicalDeviceSparseProperties)(*ptr);
		  _obj.residencyAlignedMipSize = (VkBool32) (_residencyAlignedMipSize);
	  */

	/**
	 * native GET method for field residencyAlignedMipSize	[boolean]<br>
	 * Prototype: VkBool32  residencyAlignedMipSize
	 */ 
	 private static native boolean residencyAlignedMipSize0(ByteBuffer ptr);/*
		  VkPhysicalDeviceSparseProperties _obj = (VkPhysicalDeviceSparseProperties)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field residencyNonResidentStrict	[boolean]<br>
	 * Prototype: VkBool32  residencyNonResidentStrict
	 */ 
	 private static native void residencyNonResidentStrict0(ByteBuffer ptr, boolean _residencyNonResidentStrict);/*
		  VkPhysicalDeviceSparseProperties _obj = (VkPhysicalDeviceSparseProperties)(*ptr);
		  _obj.residencyNonResidentStrict = (VkBool32) (_residencyNonResidentStrict);
	  */

	/**
	 * native GET method for field residencyNonResidentStrict	[boolean]<br>
	 * Prototype: VkBool32  residencyNonResidentStrict
	 */ 
	 private static native boolean residencyNonResidentStrict0(ByteBuffer ptr);/*
		  VkPhysicalDeviceSparseProperties _obj = (VkPhysicalDeviceSparseProperties)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */



} // end of class VkPhysicalDeviceSparseProperties
