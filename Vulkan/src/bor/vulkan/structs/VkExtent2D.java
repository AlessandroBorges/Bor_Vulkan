/**
 * Class wrapping Vulkan's VkExtent2D struct.
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
 *  This class is a Java front end for struct VkExtent2D. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkExtent2D {
 *     uint32_t    width;
 *     uint32_t    height;
 * } VkExtent2D;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkExtent2D extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [56]  */
	 private static final String TAG = "VkExtent2D";

	/** ID of this structure [56]  */
	 public static final int TAG_ID = VKEXTENT2D_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  uint32_t 	width	[int]
	 */ 
	int 	width;
	
	/**
	 *  uint32_t 	height	[int]
	 */ 
	int 	height;
	/**
	 * Ctor
	 */
	public VkExtent2D(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkExtent2D(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkExtent2D(long address){ 
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

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field width	[int]<br>
	 * Prototype: uint32_t  width
	 * 
	 * @param width - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkExtent2D width(int width){
		 this.width = width;
		 setWidth0(this.ptr,  width);
		 return this;
	 }

	/**
	 * Get method for field width	[int]<br>
	 * Prototype: uint32_t  width
	 */ 
	 public int width(){
		 int var = getWidth0(super.ptr);
		 this.width = var;
		 return this.width;
	 }

	/**
	 * Set method for field height	[int]<br>
	 * Prototype: uint32_t  height
	 * 
	 * @param height - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkExtent2D height(int height){
		 this.height = height;
		 setHeight0(this.ptr,  height);
		 return this;
	 }

	/**
	 * Get method for field height	[int]<br>
	 * Prototype: uint32_t  height
	 */ 
	 public int height(){
		 int var = getHeight0(super.ptr);
		 this.height = var;
		 return this.height;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkExtent2D [ ")
				.append("width: ").append(width() )
				.append(",\n height: ")
				.append(height() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field width	[int]<br>
	 * Prototype: uint32_t  width
	 */ 
	 private static native void setWidth0(Buffer ptr, int _width);/*
		  VkExtent2D* vkObj = (VkExtent2D*)(ptr);
		 // code for simple past value 
		  vkObj->width = (uint32_t) (_width);
	  */

	/**
	 * Native GET method for field width	[int]<br>
	 * Prototype: uint32_t  width
	 */ 
	 private static native int getWidth0(Buffer ptr);/*
		  VkExtent2D* vkObj = (VkExtent2D*)(ptr);
		  return (jint) (vkObj->width);
	 */

	/**
	 * Native SET method for field height	[int]<br>
	 * Prototype: uint32_t  height
	 */ 
	 private static native void setHeight0(Buffer ptr, int _height);/*
		  VkExtent2D* vkObj = (VkExtent2D*)(ptr);
		 // code for simple past value 
		  vkObj->height = (uint32_t) (_height);
	  */

	/**
	 * Native GET method for field height	[int]<br>
	 * Prototype: uint32_t  height
	 */ 
	 private static native int getHeight0(Buffer ptr);/*
		  VkExtent2D* vkObj = (VkExtent2D*)(ptr);
		  return (jint) (vkObj->height);
	 */



} // end of class VkExtent2D
