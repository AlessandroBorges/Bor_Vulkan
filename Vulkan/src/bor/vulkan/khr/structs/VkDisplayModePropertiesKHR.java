// class wrapping Vulkan's VkDisplayModePropertiesKHR struct.
package bor.vulkan.khr.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.VkStruct;

import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkDisplayModePropertiesKHR 
 * @Author Alessandro Borges 
 */
public class VkDisplayModePropertiesKHR extends VkStruct {
	/** ID of this structure [112]  */
	 public static final int TAG = VKDISPLAYMODEPROPERTIESKHR_ID;

	 // fields //
	/**
	 *  VkDisplayModeKHR 	displayMode 
	 */ 
	VkDisplayModeKHR 	displayMode;

	/**
	 *  VkDisplayModeParametersKHR 	parameters 
	 */ 
	VkDisplayModeParametersKHR 	parameters;

	/**
	 * Ctor
	 */
	public VkDisplayModePropertiesKHR(){ 
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
	 * Set method for field displayMode
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 public void displayMode(VkDisplayModeKHR displayMode){
		 this.displayMode = displayMode;
		displayMode0(super.ptr, displayMode);
	 }

	/**
	 * get method for field displayMode
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 public VkDisplayModeKHR displayMode(){
		 // return  this.displayMode;
		 return displayMode0(super.ptr);
	 }

	/**
	 * Set method for field parameters
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 public void parameters(VkDisplayModeParametersKHR parameters){
		 this.parameters = parameters;
		parameters0(super.ptr, parameters);
	 }

	/**
	 * get method for field parameters
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 public VkDisplayModeParametersKHR parameters(){
		 // return  this.parameters;
		 return parameters0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field displayMode
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 private static native void displayMode0(ByteBuffer ptr, VkDisplayModeKHR _displayMode);/*
		  VkDisplayModePropertiesKHR _obj = (VkDisplayModePropertiesKHR)(*ptr);
		  _obj.displayMode = (VkDisplayModeKHR) (_displayMode);
	  */

	/**
	 * get method for field displayMode
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 private static native VkDisplayModeKHR displayMode0(ByteBuffer ptr);/*
		  VkDisplayModePropertiesKHR _obj = (VkDisplayModePropertiesKHR)(ptr);
		  return (VkDisplayModeKHR) (_obj.VkDisplayModeKHR);
	 */

	/**
	 * native Set method for field parameters
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 private static native void parameters0(ByteBuffer ptr, VkDisplayModeParametersKHR _parameters);/*
		  VkDisplayModePropertiesKHR _obj = (VkDisplayModePropertiesKHR)(*ptr);
		  _obj.parameters = (VkDisplayModeParametersKHR) (_parameters);
	  */

	/**
	 * get method for field parameters
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 private static native VkDisplayModeParametersKHR parameters0(ByteBuffer ptr);/*
		  VkDisplayModePropertiesKHR _obj = (VkDisplayModePropertiesKHR)(ptr);
		  return (VkDisplayModeParametersKHR) (_obj.VkDisplayModeParametersKHR);
	 */



} // end of class VkDisplayModePropertiesKHR
