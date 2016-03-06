/**
 * Class wrapping Vulkan's VkSurfaceFormatKHR struct.
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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkSurfaceFormatKHR extends VkStruct {
	/** TAG of this structure [107]  */
	 private static final String TAG = "VkSurfaceFormatKHR";

	/** ID of this structure [107]  */
	 public static final int TAG_ID = VKSURFACEFORMATKHR_ID;

	 // fields //
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
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSurfaceFormatKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkSurfaceFormatKHR(long address, int memSize){ 
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
	 public static P<VkSurfaceFormatKHR> createNullPointer(){
	        P<VkSurfaceFormatKHR> p = new  P<VkSurfaceFormatKHR>(new VkSurfaceFormatKHR());
	        return p;
	    }

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 public void format(VkFormat format){
		 this.format = format;
		format0(super.ptr, format);
	 }

	/**
	 * get method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 public VkFormat format(){
		 // return  this.format;
		 return format0(super.ptr);
	 }

	/**
	 * Set method for field colorSpace	[vkenum]<br>
	 * Prototype: VkColorSpaceKHR  colorSpace
	 */ 
	 public void colorSpace(VkColorSpaceKHR colorSpace){
		 this.colorSpace = colorSpace;
		colorSpace0(super.ptr, colorSpace);
	 }

	/**
	 * get method for field colorSpace	[vkenum]<br>
	 * Prototype: VkColorSpaceKHR  colorSpace
	 */ 
	 public VkColorSpaceKHR colorSpace(){
		 // return  this.colorSpace;
		 return colorSpace0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native void format0(ByteBuffer ptr, VkFormat _format);/*
		  VkSurfaceFormatKHR _obj = (VkSurfaceFormatKHR)(*ptr);
		  _obj.format = (VkFormat) (_format);
	  */

	/**
	 * native GET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native VkFormat format0(ByteBuffer ptr);/*
		  VkSurfaceFormatKHR _obj = (VkSurfaceFormatKHR)(ptr);
		  return (VkFormat) (_obj.VkFormat);
	 */

	/**
	 * native SET method for field colorSpace	[vkenum]<br>
	 * Prototype: VkColorSpaceKHR  colorSpace
	 */ 
	 private static native void colorSpace0(ByteBuffer ptr, VkColorSpaceKHR _colorSpace);/*
		  VkSurfaceFormatKHR _obj = (VkSurfaceFormatKHR)(*ptr);
		  _obj.colorSpace = (VkColorSpaceKHR) (_colorSpace);
	  */

	/**
	 * native GET method for field colorSpace	[vkenum]<br>
	 * Prototype: VkColorSpaceKHR  colorSpace
	 */ 
	 private static native VkColorSpaceKHR colorSpace0(ByteBuffer ptr);/*
		  VkSurfaceFormatKHR _obj = (VkSurfaceFormatKHR)(ptr);
		  return (VkColorSpaceKHR) (_obj.VkColorSpaceKHR);
	 */



} // end of class VkSurfaceFormatKHR
