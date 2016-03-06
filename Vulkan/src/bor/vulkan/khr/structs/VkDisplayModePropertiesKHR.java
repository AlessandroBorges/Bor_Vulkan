/**
 * Class wrapping Vulkan's VkDisplayModePropertiesKHR struct.
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
 *  This class is a Java front end for struct VkDisplayModePropertiesKHR. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDisplayModePropertiesKHR {
 *     VkDisplayModeKHR              displayMode;
 *     VkDisplayModeParametersKHR    parameters;
 * } VkDisplayModePropertiesKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkDisplayModePropertiesKHR extends VkStruct {
	/** TAG of this structure [112]  */
	 private static final String TAG = "VkDisplayModePropertiesKHR";

	/** ID of this structure [112]  */
	 public static final int TAG_ID = VKDISPLAYMODEPROPERTIESKHR_ID;

	 // fields //
	/**
	 *  VkDisplayModeKHR 	displayMode	[vkhandle]
	 */ 
	VkDisplayModeKHR 	displayMode;

	/**
	 *  VkDisplayModeParametersKHR 	parameters	[vkstruct]
	 */ 
	VkDisplayModeParametersKHR 	parameters;

	/**
	 * Ctor
	 */
	public VkDisplayModePropertiesKHR(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDisplayModePropertiesKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkDisplayModePropertiesKHR(long address, int memSize){ 
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
	 public static P<VkDisplayModePropertiesKHR> createNullPointer(){
	        P<VkDisplayModePropertiesKHR> p = new  P<VkDisplayModePropertiesKHR>(new VkDisplayModePropertiesKHR());
	        return p;
	    }

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field displayMode	[vkhandle]<br>
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 public void displayMode(VkDisplayModeKHR displayMode){
		 this.displayMode = displayMode;
		displayMode0(super.ptr, displayMode);
	 }

	/**
	 * get method for field displayMode	[vkhandle]<br>
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 public VkDisplayModeKHR displayMode(){
		 // return  this.displayMode;
		 return displayMode0(super.ptr);
	 }

	/**
	 * Set method for field parameters	[vkstruct]<br>
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 public void parameters(VkDisplayModeParametersKHR parameters){
		 this.parameters = parameters;
		parameters0(super.ptr, parameters);
	 }

	/**
	 * get method for field parameters	[vkstruct]<br>
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 public VkDisplayModeParametersKHR parameters(){
		 // return  this.parameters;
		 return parameters0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field displayMode	[vkhandle]<br>
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 private static native void displayMode0(ByteBuffer ptr, VkDisplayModeKHR _displayMode);/*
		  VkDisplayModePropertiesKHR _obj = (VkDisplayModePropertiesKHR)(*ptr);
		  _obj.displayMode = (VkDisplayModeKHR) (_displayMode);
	  */

	/**
	 * native GET method for field displayMode	[vkhandle]<br>
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 private static native VkDisplayModeKHR displayMode0(ByteBuffer ptr);/*
		  VkDisplayModePropertiesKHR _obj = (VkDisplayModePropertiesKHR)(ptr);
		  return (VkDisplayModeKHR) (_obj.VkDisplayModeKHR);
	 */

	/**
	 * native SET method for field parameters	[vkstruct]<br>
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 private static native void parameters0(ByteBuffer ptr, VkDisplayModeParametersKHR _parameters);/*
		  VkDisplayModePropertiesKHR _obj = (VkDisplayModePropertiesKHR)(*ptr);
		  _obj.parameters = (VkDisplayModeParametersKHR) (_parameters);
	  */

	/**
	 * native GET method for field parameters	[vkstruct]<br>
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 private static native VkDisplayModeParametersKHR parameters0(ByteBuffer ptr);/*
		  VkDisplayModePropertiesKHR _obj = (VkDisplayModePropertiesKHR)(ptr);
		  return (VkDisplayModeParametersKHR) (_obj.VkDisplayModeParametersKHR);
	 */



} // end of class VkDisplayModePropertiesKHR
