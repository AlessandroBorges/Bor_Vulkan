/**
 * Class wrapping Vulkan's VkSurfaceFormatKHR struct.
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
 *  This class is a Java front end for struct VkSurfaceFormatKHR. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSurfaceFormatKHR {
 *     VkFormat           format;
 *     VkColorSpaceKHR    colorSpace;
 * } VkSurfaceFormatKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkSurfaceFormatKHR extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [107]  */
	 private static final String TAG = "VkSurfaceFormatKHR";

	/** ID of this structure [107]  */
	 public static final int TAG_ID = VKSURFACEFORMATKHR_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkFormat 	format	[vkenum]
	 */ 
	VkFormat 	format;
	
	/**
	 *  VkColorSpaceKHR 	colorSpace	[vkenum]
	 */ 
	VkColorSpaceKHR 	colorSpace;
	/**
	 * Ctor
	 */
	public VkSurfaceFormatKHR(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSurfaceFormatKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkSurfaceFormatKHR(long address){ 
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
	 * Set method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 * 
	 * @param format - a instance of VkFormat.
	 * @return this VkStruct instance.
	 */ 
	 public VkSurfaceFormatKHR format(VkFormat format){
		 this.format = format;
		 int enumVal = format.getValue();
		 setFormat0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 public VkFormat format(){
		 int nativeVal = getFormat0(super.ptr);
		 this.format = VkFormat.fromValue(nativeVal); 
		 return this.format;
	 }

	/**
	 * Set method for field colorSpace	[vkenum]<br>
	 * Prototype: VkColorSpaceKHR  colorSpace
	 * 
	 * @param colorSpace - a instance of VkColorSpaceKHR.
	 * @return this VkStruct instance.
	 */ 
	 public VkSurfaceFormatKHR colorSpace(VkColorSpaceKHR colorSpace){
		 this.colorSpace = colorSpace;
		 int enumVal = colorSpace.getValue();
		 setColorSpace0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field colorSpace	[vkenum]<br>
	 * Prototype: VkColorSpaceKHR  colorSpace
	 */ 
	 public VkColorSpaceKHR colorSpace(){
		 int nativeVal = getColorSpace0(super.ptr);
		 this.colorSpace = VkColorSpaceKHR.fromValue(nativeVal); 
		 return this.colorSpace;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkSurfaceFormatKHR [ ")
				.append("format: ").append(format() )
				.append(",\n colorSpace: ")
				.append(colorSpace() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native void setFormat0(Buffer ptr, int  _format);/*
		  VkSurfaceFormatKHR* vkObj = (VkSurfaceFormatKHR*)(ptr);
		 // code for simple past value 
		  vkObj->format = (VkFormat) (_format);
	  */

	/**
	 * Native GET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native int  getFormat0(Buffer ptr);/*
		  VkSurfaceFormatKHR* vkObj = (VkSurfaceFormatKHR*)(ptr);
		  return (VkFormat) (vkObj->format);
	 */

	/**
	 * Native SET method for field colorSpace	[vkenum]<br>
	 * Prototype: VkColorSpaceKHR  colorSpace
	 */ 
	 private static native void setColorSpace0(Buffer ptr, int  _colorSpace);/*
		  VkSurfaceFormatKHR* vkObj = (VkSurfaceFormatKHR*)(ptr);
		 // code for simple past value 
		  vkObj->colorSpace = (VkColorSpaceKHR) (_colorSpace);
	  */

	/**
	 * Native GET method for field colorSpace	[vkenum]<br>
	 * Prototype: VkColorSpaceKHR  colorSpace
	 */ 
	 private static native int  getColorSpace0(Buffer ptr);/*
		  VkSurfaceFormatKHR* vkObj = (VkSurfaceFormatKHR*)(ptr);
		  return (VkColorSpaceKHR) (vkObj->colorSpace);
	 */



} // end of class VkSurfaceFormatKHR
