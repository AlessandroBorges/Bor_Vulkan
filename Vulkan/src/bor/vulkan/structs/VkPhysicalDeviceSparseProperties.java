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

import java.nio.Buffer;


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

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "VkPhysicalDeviceSparseProperties [residencyStandard2DBlockShape=" + residencyStandard2DBlockShape()
                + ",\n\t\t residencyStandard2DMultisampleBlockShape=" + residencyStandard2DMultisampleBlockShape()
                + ",\n\t\t residencyStandard3DBlockShape=" + residencyStandard3DBlockShape() 
                + ",\n\t\t residencyAlignedMipSize=" + residencyAlignedMipSize() 
                + ",\n\t\t residencyNonResidentStrict=" + residencyNonResidentStrict() + "]\n";
    }

    /** TAG of this structure [9]  */
	 private static final String TAG = "VkPhysicalDeviceSparseProperties";

	/** ID of this structure [9]  */
	 public static final int TAG_ID = VKPHYSICALDEVICESPARSEPROPERTIES_ID;

	/** P wrapper for THIS object */
	 private  P<VkPhysicalDeviceSparseProperties> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
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
	 public VkPhysicalDeviceSparseProperties(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPhysicalDeviceSparseProperties(long address){ 
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


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkPhysicalDeviceSparseProperties> getP() {
	       if(p == null ){
	           p = new P<VkPhysicalDeviceSparseProperties> (this);
	       }
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
		 setResidencyStandard2DBlockShape0(this.ptr,  residencyStandard2DBlockShape);
	 }

	/**
	 * Get method for field residencyStandard2DBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard2DBlockShape
	 */ 
	 public boolean residencyStandard2DBlockShape(){
		 boolean var = getResidencyStandard2DBlockShape0(super.ptr);
		 this.residencyStandard2DBlockShape = var;
		 return this.residencyStandard2DBlockShape;
	 }

	/**
	 * Set method for field residencyStandard2DMultisampleBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard2DMultisampleBlockShape
	 */ 
	 public void residencyStandard2DMultisampleBlockShape(boolean residencyStandard2DMultisampleBlockShape){
		 this.residencyStandard2DMultisampleBlockShape = residencyStandard2DMultisampleBlockShape;
		 setResidencyStandard2DMultisampleBlockShape0(this.ptr,  residencyStandard2DMultisampleBlockShape);
	 }

	/**
	 * Get method for field residencyStandard2DMultisampleBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard2DMultisampleBlockShape
	 */ 
	 public boolean residencyStandard2DMultisampleBlockShape(){
		 boolean var = getResidencyStandard2DMultisampleBlockShape0(super.ptr);
		 this.residencyStandard2DMultisampleBlockShape = var;
		 return this.residencyStandard2DMultisampleBlockShape;
	 }

	/**
	 * Set method for field residencyStandard3DBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard3DBlockShape
	 */ 
	 public void residencyStandard3DBlockShape(boolean residencyStandard3DBlockShape){
		 this.residencyStandard3DBlockShape = residencyStandard3DBlockShape;
		 setResidencyStandard3DBlockShape0(this.ptr,  residencyStandard3DBlockShape);
	 }

	/**
	 * Get method for field residencyStandard3DBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard3DBlockShape
	 */ 
	 public boolean residencyStandard3DBlockShape(){
		 boolean var = getResidencyStandard3DBlockShape0(super.ptr);
		 this.residencyStandard3DBlockShape = var;
		 return this.residencyStandard3DBlockShape;
	 }

	/**
	 * Set method for field residencyAlignedMipSize	[boolean]<br>
	 * Prototype: VkBool32  residencyAlignedMipSize
	 */ 
	 public void residencyAlignedMipSize(boolean residencyAlignedMipSize){
		 this.residencyAlignedMipSize = residencyAlignedMipSize;
		 setResidencyAlignedMipSize0(this.ptr,  residencyAlignedMipSize);
	 }

	/**
	 * Get method for field residencyAlignedMipSize	[boolean]<br>
	 * Prototype: VkBool32  residencyAlignedMipSize
	 */ 
	 public boolean residencyAlignedMipSize(){
		 boolean var = getResidencyAlignedMipSize0(super.ptr);
		 this.residencyAlignedMipSize = var;
		 return this.residencyAlignedMipSize;
	 }

	/**
	 * Set method for field residencyNonResidentStrict	[boolean]<br>
	 * Prototype: VkBool32  residencyNonResidentStrict
	 */ 
	 public void residencyNonResidentStrict(boolean residencyNonResidentStrict){
		 this.residencyNonResidentStrict = residencyNonResidentStrict;
		 setResidencyNonResidentStrict0(this.ptr,  residencyNonResidentStrict);
	 }

	/**
	 * Get method for field residencyNonResidentStrict	[boolean]<br>
	 * Prototype: VkBool32  residencyNonResidentStrict
	 */ 
	 public boolean residencyNonResidentStrict(){
		 boolean var = getResidencyNonResidentStrict0(super.ptr);
		 this.residencyNonResidentStrict = var;
		 return this.residencyNonResidentStrict;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field residencyStandard2DBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard2DBlockShape
	 */ 
	 private static native void setResidencyStandard2DBlockShape0(Buffer ptr, boolean _residencyStandard2DBlockShape);/*
		  VkPhysicalDeviceSparseProperties* vkObj = (VkPhysicalDeviceSparseProperties*)(ptr);
		  vkObj->residencyStandard2DBlockShape = (VkBool32) (_residencyStandard2DBlockShape);
	  */

	/**
	 * native GET method for field residencyStandard2DBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard2DBlockShape
	 */ 
	 private static native boolean getResidencyStandard2DBlockShape0(Buffer ptr);/*
		  VkPhysicalDeviceSparseProperties* vkObj = (VkPhysicalDeviceSparseProperties*)(ptr);
		  return (jboolean) (vkObj->residencyStandard2DBlockShape);
	 */

	/**
	 * native SET method for field residencyStandard2DMultisampleBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard2DMultisampleBlockShape
	 */ 
	 private static native void setResidencyStandard2DMultisampleBlockShape0(Buffer ptr, boolean _residencyStandard2DMultisampleBlockShape);/*
		  VkPhysicalDeviceSparseProperties* vkObj = (VkPhysicalDeviceSparseProperties*)(ptr);
		  vkObj->residencyStandard2DMultisampleBlockShape = (VkBool32) (_residencyStandard2DMultisampleBlockShape);
	  */

	/**
	 * native GET method for field residencyStandard2DMultisampleBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard2DMultisampleBlockShape
	 */ 
	 private static native boolean getResidencyStandard2DMultisampleBlockShape0(Buffer ptr);/*
		  VkPhysicalDeviceSparseProperties* vkObj = (VkPhysicalDeviceSparseProperties*)(ptr);
		  return (jboolean) (vkObj->residencyStandard2DMultisampleBlockShape);
	 */

	/**
	 * native SET method for field residencyStandard3DBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard3DBlockShape
	 */ 
	 private static native void setResidencyStandard3DBlockShape0(Buffer ptr, boolean _residencyStandard3DBlockShape);/*
		  VkPhysicalDeviceSparseProperties* vkObj = (VkPhysicalDeviceSparseProperties*)(ptr);
		  vkObj->residencyStandard3DBlockShape = (VkBool32) (_residencyStandard3DBlockShape);
	  */

	/**
	 * native GET method for field residencyStandard3DBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard3DBlockShape
	 */ 
	 private static native boolean getResidencyStandard3DBlockShape0(Buffer ptr);/*
		  VkPhysicalDeviceSparseProperties* vkObj = (VkPhysicalDeviceSparseProperties*)(ptr);
		  return (jboolean) (vkObj->residencyStandard3DBlockShape);
	 */

	/**
	 * native SET method for field residencyAlignedMipSize	[boolean]<br>
	 * Prototype: VkBool32  residencyAlignedMipSize
	 */ 
	 private static native void setResidencyAlignedMipSize0(Buffer ptr, boolean _residencyAlignedMipSize);/*
		  VkPhysicalDeviceSparseProperties* vkObj = (VkPhysicalDeviceSparseProperties*)(ptr);
		  vkObj->residencyAlignedMipSize = (VkBool32) (_residencyAlignedMipSize);
	  */

	/**
	 * native GET method for field residencyAlignedMipSize	[boolean]<br>
	 * Prototype: VkBool32  residencyAlignedMipSize
	 */ 
	 private static native boolean getResidencyAlignedMipSize0(Buffer ptr);/*
		  VkPhysicalDeviceSparseProperties* vkObj = (VkPhysicalDeviceSparseProperties*)(ptr);
		  return (jboolean) (vkObj->residencyAlignedMipSize);
	 */

	/**
	 * native SET method for field residencyNonResidentStrict	[boolean]<br>
	 * Prototype: VkBool32  residencyNonResidentStrict
	 */ 
	 private static native void setResidencyNonResidentStrict0(Buffer ptr, boolean _residencyNonResidentStrict);/*
		  VkPhysicalDeviceSparseProperties* vkObj = (VkPhysicalDeviceSparseProperties*)(ptr);
		  vkObj->residencyNonResidentStrict = (VkBool32) (_residencyNonResidentStrict);
	  */

	/**
	 * native GET method for field residencyNonResidentStrict	[boolean]<br>
	 * Prototype: VkBool32  residencyNonResidentStrict
	 */ 
	 private static native boolean getResidencyNonResidentStrict0(Buffer ptr);/*
		  VkPhysicalDeviceSparseProperties* vkObj = (VkPhysicalDeviceSparseProperties*)(ptr);
		  return (jboolean) (vkObj->residencyNonResidentStrict);
	 */



} // end of class VkPhysicalDeviceSparseProperties
