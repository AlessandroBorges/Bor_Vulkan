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

import java.nio.Buffer;


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

	/** P wrapper for THIS object */
	 private  P<VkSurfaceFormatKHR> p;

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


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkSurfaceFormatKHR> getP() {
	       if(p == null ){
	           p = new P<VkSurfaceFormatKHR> (this);
	       }
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
		 int enumVal = format.getValue();
		 format0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 public VkFormat format(){
		 int nativeVal = format0(super.ptr);
		 this.format = VkFormat.fromValue(nativeVal); 
		 return this.format;
	 }

	/**
	 * Set method for field colorSpace	[vkenum]<br>
	 * Prototype: VkColorSpaceKHR  colorSpace
	 */ 
	 public void colorSpace(VkColorSpaceKHR colorSpace){
		 this.colorSpace = colorSpace;
		 int enumVal = colorSpace.getValue();
		 colorSpace0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field colorSpace	[vkenum]<br>
	 * Prototype: VkColorSpaceKHR  colorSpace
	 */ 
	 public VkColorSpaceKHR colorSpace(){
		 int nativeVal = colorSpace0(super.ptr);
		 this.colorSpace = VkColorSpaceKHR.fromValue(nativeVal); 
		 return this.colorSpace;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native void format0(Buffer ptr, int  _format);/*
		  VkSurfaceFormatKHR* vkObj = (VkSurfaceFormatKHR*)(ptr);
		  vkObj->format = (VkFormat) (_format);
	  */

	/**
	 * native GET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native int  format0(Buffer ptr);/*
		  VkSurfaceFormatKHR vkObj = (VkSurfaceFormatKHR*)(ptr);
		  return (VkFormat) (vkObj->format);
	 */

	/**
	 * native SET method for field colorSpace	[vkenum]<br>
	 * Prototype: VkColorSpaceKHR  colorSpace
	 */ 
	 private static native void colorSpace0(Buffer ptr, int  _colorSpace);/*
		  VkSurfaceFormatKHR* vkObj = (VkSurfaceFormatKHR*)(ptr);
		  vkObj->colorSpace = (VkColorSpaceKHR) (_colorSpace);
	  */

	/**
	 * native GET method for field colorSpace	[vkenum]<br>
	 * Prototype: VkColorSpaceKHR  colorSpace
	 */ 
	 private static native int  colorSpace0(Buffer ptr);/*
		  VkSurfaceFormatKHR vkObj = (VkSurfaceFormatKHR*)(ptr);
		  return (VkColorSpaceKHR) (vkObj->colorSpace);
	 */



} // end of class VkSurfaceFormatKHR
