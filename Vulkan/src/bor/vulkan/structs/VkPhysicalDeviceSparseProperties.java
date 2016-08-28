/**
 * Class wrapping Vulkan's VkPhysicalDeviceSparseProperties struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.65 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
 package bor.vulkan.structs;

 import bor.util.*;
 import bor.vulkan.*;
 import static bor.vulkan.Vulkan.*; 
 import bor.vulkan.enumerations.*;

 import java.util.*;
 import java.nio.*;


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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkPhysicalDeviceSparseProperties extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [9]  */
	 private static final String TAG = "VkPhysicalDeviceSparseProperties";

	/** ID of this structure [9]  */
	 public static final int TAG_ID = VKPHYSICALDEVICESPARSEPROPERTIES_ID;

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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPhysicalDeviceSparseProperties(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	/** 
	 * Static method to create a VkArray for this VkStruct subclass.
	 * @param size - number of elements
	 */
	 public static VkArray<VkPhysicalDeviceSparseProperties> createVkArray(int size){ 
		 VkPhysicalDeviceSparseProperties[] array = new VkPhysicalDeviceSparseProperties[size]; 
		 VkArrayStruct<VkPhysicalDeviceSparseProperties> vkArray = new VkArrayStruct<VkPhysicalDeviceSparseProperties> (array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field residencyStandard2DBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard2DBlockShape
	 * 
	 * @param residencyStandard2DBlockShape - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceSparseProperties residencyStandard2DBlockShape(boolean residencyStandard2DBlockShape){
		 this.residencyStandard2DBlockShape = residencyStandard2DBlockShape;
		 setResidencyStandard2DBlockShape0(this.ptr,  residencyStandard2DBlockShape);
		 return this;
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
	 * 
	 * @param residencyStandard2DMultisampleBlockShape - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceSparseProperties residencyStandard2DMultisampleBlockShape(boolean residencyStandard2DMultisampleBlockShape){
		 this.residencyStandard2DMultisampleBlockShape = residencyStandard2DMultisampleBlockShape;
		 setResidencyStandard2DMultisampleBlockShape0(this.ptr,  residencyStandard2DMultisampleBlockShape);
		 return this;
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
	 * 
	 * @param residencyStandard3DBlockShape - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceSparseProperties residencyStandard3DBlockShape(boolean residencyStandard3DBlockShape){
		 this.residencyStandard3DBlockShape = residencyStandard3DBlockShape;
		 setResidencyStandard3DBlockShape0(this.ptr,  residencyStandard3DBlockShape);
		 return this;
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
	 * 
	 * @param residencyAlignedMipSize - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceSparseProperties residencyAlignedMipSize(boolean residencyAlignedMipSize){
		 this.residencyAlignedMipSize = residencyAlignedMipSize;
		 setResidencyAlignedMipSize0(this.ptr,  residencyAlignedMipSize);
		 return this;
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
	 * 
	 * @param residencyNonResidentStrict - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceSparseProperties residencyNonResidentStrict(boolean residencyNonResidentStrict){
		 this.residencyNonResidentStrict = residencyNonResidentStrict;
		 setResidencyNonResidentStrict0(this.ptr,  residencyNonResidentStrict);
		 return this;
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


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkPhysicalDeviceSparseProperties [ ")
				.append("residencyStandard2DBlockShape: ").append(residencyStandard2DBlockShape() )
				.append(",\n residencyStandard2DMultisampleBlockShape: ")
				.append(residencyStandard2DMultisampleBlockShape() )
				.append(",\n residencyStandard3DBlockShape: ")
				.append(residencyStandard3DBlockShape() )
				.append(",\n residencyAlignedMipSize: ")
				.append(residencyAlignedMipSize() )
				.append(",\n residencyNonResidentStrict: ")
				.append(residencyNonResidentStrict() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field residencyStandard2DBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard2DBlockShape
	 */ 
	 private static native void setResidencyStandard2DBlockShape0(Buffer ptr, boolean  _residencyStandard2DBlockShape);/*
		  VkPhysicalDeviceSparseProperties* vkObj = (VkPhysicalDeviceSparseProperties*)(ptr);
		 // code for simple past value 
		  vkObj->residencyStandard2DBlockShape = (VkBool32) (_residencyStandard2DBlockShape);
	  */

	/**
	 * Native GET method for field residencyStandard2DBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard2DBlockShape
	 */ 
	 private static native boolean  getResidencyStandard2DBlockShape0(Buffer ptr);/*
		  VkPhysicalDeviceSparseProperties* vkObj = (VkPhysicalDeviceSparseProperties*)(ptr);
		  return (jboolean) (vkObj->residencyStandard2DBlockShape);
	 */

	/**
	 * Native SET method for field residencyStandard2DMultisampleBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard2DMultisampleBlockShape
	 */ 
	 private static native void setResidencyStandard2DMultisampleBlockShape0(Buffer ptr, boolean  _residencyStandard2DMultisampleBlockShape);/*
		  VkPhysicalDeviceSparseProperties* vkObj = (VkPhysicalDeviceSparseProperties*)(ptr);
		 // code for simple past value 
		  vkObj->residencyStandard2DMultisampleBlockShape = (VkBool32) (_residencyStandard2DMultisampleBlockShape);
	  */

	/**
	 * Native GET method for field residencyStandard2DMultisampleBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard2DMultisampleBlockShape
	 */ 
	 private static native boolean  getResidencyStandard2DMultisampleBlockShape0(Buffer ptr);/*
		  VkPhysicalDeviceSparseProperties* vkObj = (VkPhysicalDeviceSparseProperties*)(ptr);
		  return (jboolean) (vkObj->residencyStandard2DMultisampleBlockShape);
	 */

	/**
	 * Native SET method for field residencyStandard3DBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard3DBlockShape
	 */ 
	 private static native void setResidencyStandard3DBlockShape0(Buffer ptr, boolean  _residencyStandard3DBlockShape);/*
		  VkPhysicalDeviceSparseProperties* vkObj = (VkPhysicalDeviceSparseProperties*)(ptr);
		 // code for simple past value 
		  vkObj->residencyStandard3DBlockShape = (VkBool32) (_residencyStandard3DBlockShape);
	  */

	/**
	 * Native GET method for field residencyStandard3DBlockShape	[boolean]<br>
	 * Prototype: VkBool32  residencyStandard3DBlockShape
	 */ 
	 private static native boolean  getResidencyStandard3DBlockShape0(Buffer ptr);/*
		  VkPhysicalDeviceSparseProperties* vkObj = (VkPhysicalDeviceSparseProperties*)(ptr);
		  return (jboolean) (vkObj->residencyStandard3DBlockShape);
	 */

	/**
	 * Native SET method for field residencyAlignedMipSize	[boolean]<br>
	 * Prototype: VkBool32  residencyAlignedMipSize
	 */ 
	 private static native void setResidencyAlignedMipSize0(Buffer ptr, boolean  _residencyAlignedMipSize);/*
		  VkPhysicalDeviceSparseProperties* vkObj = (VkPhysicalDeviceSparseProperties*)(ptr);
		 // code for simple past value 
		  vkObj->residencyAlignedMipSize = (VkBool32) (_residencyAlignedMipSize);
	  */

	/**
	 * Native GET method for field residencyAlignedMipSize	[boolean]<br>
	 * Prototype: VkBool32  residencyAlignedMipSize
	 */ 
	 private static native boolean  getResidencyAlignedMipSize0(Buffer ptr);/*
		  VkPhysicalDeviceSparseProperties* vkObj = (VkPhysicalDeviceSparseProperties*)(ptr);
		  return (jboolean) (vkObj->residencyAlignedMipSize);
	 */

	/**
	 * Native SET method for field residencyNonResidentStrict	[boolean]<br>
	 * Prototype: VkBool32  residencyNonResidentStrict
	 */ 
	 private static native void setResidencyNonResidentStrict0(Buffer ptr, boolean  _residencyNonResidentStrict);/*
		  VkPhysicalDeviceSparseProperties* vkObj = (VkPhysicalDeviceSparseProperties*)(ptr);
		 // code for simple past value 
		  vkObj->residencyNonResidentStrict = (VkBool32) (_residencyNonResidentStrict);
	  */

	/**
	 * Native GET method for field residencyNonResidentStrict	[boolean]<br>
	 * Prototype: VkBool32  residencyNonResidentStrict
	 */ 
	 private static native boolean  getResidencyNonResidentStrict0(Buffer ptr);/*
		  VkPhysicalDeviceSparseProperties* vkObj = (VkPhysicalDeviceSparseProperties*)(ptr);
		  return (jboolean) (vkObj->residencyNonResidentStrict);
	 */



} // end of class VkPhysicalDeviceSparseProperties
