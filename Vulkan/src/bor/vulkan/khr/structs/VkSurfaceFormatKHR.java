// class wrapping Vulkan's VkSurfaceFormatKHR struct.
package bor.vulkan.khr.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.VkStruct;

import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkSurfaceFormatKHR 
 * @Author Alessandro Borges 
 */
public class VkSurfaceFormatKHR extends VkStruct {
	/** ID of this structure [107]  */
	 public static final int TAG = VKSURFACEFORMATKHR_ID;

	 // fields //
	/**
	 *  VkFormat 	format 
	 */ 
	VkFormat 	format;

	/**
	 *  VkColorSpaceKHR 	colorSpace 
	 */ 
	VkColorSpaceKHR 	colorSpace;

	/**
	 * Ctor
	 */
	public VkSurfaceFormatKHR(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG); 
	}


	 // /////////////////////
	 //  SETTERS & GETTERS //
	 // /////////////////////

	/**
	 * Set method for field format
	 * Prototype: VkFormat  format
	 */ 
	 public void format(VkFormat format){
		 this.format = format;
		format0(super.ptr, format);
	 }

	/**
	 * get method for field format
	 * Prototype: VkFormat  format
	 */ 
	 public VkFormat format(){
		 // return  this.format;
		 return format0(super.ptr);
	 }

	/**
	 * Set method for field colorSpace
	 * Prototype: VkColorSpaceKHR  colorSpace
	 */ 
	 public void colorSpace(VkColorSpaceKHR colorSpace){
		 this.colorSpace = colorSpace;
		colorSpace0(super.ptr, colorSpace);
	 }

	/**
	 * get method for field colorSpace
	 * Prototype: VkColorSpaceKHR  colorSpace
	 */ 
	 public VkColorSpaceKHR colorSpace(){
		 // return  this.colorSpace;
		 return colorSpace0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field format
	 * Prototype: VkFormat  format
	 */ 
	 private static native void format0(ByteBuffer ptr, VkFormat _format);/*
		  VkSurfaceFormatKHR _obj = (VkSurfaceFormatKHR)(*ptr);
		  _obj.format = (VkFormat) (_format);
	  */

	/**
	 * get method for field format
	 * Prototype: VkFormat  format
	 */ 
	 private static native VkFormat format0(ByteBuffer ptr);/*
		  VkSurfaceFormatKHR _obj = (VkSurfaceFormatKHR)(ptr);
		  return (VkFormat) (_obj.VkFormat);
	 */

	/**
	 * native Set method for field colorSpace
	 * Prototype: VkColorSpaceKHR  colorSpace
	 */ 
	 private static native void colorSpace0(ByteBuffer ptr, VkColorSpaceKHR _colorSpace);/*
		  VkSurfaceFormatKHR _obj = (VkSurfaceFormatKHR)(*ptr);
		  _obj.colorSpace = (VkColorSpaceKHR) (_colorSpace);
	  */

	/**
	 * get method for field colorSpace
	 * Prototype: VkColorSpaceKHR  colorSpace
	 */ 
	 private static native VkColorSpaceKHR colorSpace0(ByteBuffer ptr);/*
		  VkSurfaceFormatKHR _obj = (VkSurfaceFormatKHR)(ptr);
		  return (VkColorSpaceKHR) (_obj.VkColorSpaceKHR);
	 */



} // end of class VkSurfaceFormatKHR
