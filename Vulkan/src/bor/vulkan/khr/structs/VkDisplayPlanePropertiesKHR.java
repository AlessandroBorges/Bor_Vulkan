// class wrapping Vulkan's VkDisplayPlanePropertiesKHR struct.
package bor.vulkan.khr.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.VkStruct;

import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkDisplayPlanePropertiesKHR 
 * @Author Alessandro Borges 
 */
public class VkDisplayPlanePropertiesKHR extends VkStruct {
	/** ID of this structure [115]  */
	 public static final int TAG = VKDISPLAYPLANEPROPERTIESKHR_ID;

	 // fields //
	/**
	 *  VkDisplayKHR 	currentDisplay 
	 */ 
	VkDisplayKHR 	currentDisplay;

	/**
	 *  uint32_t 	currentStackIndex 
	 */ 
	int 	currentStackIndex;

	/**
	 * Ctor
	 */
	public VkDisplayPlanePropertiesKHR(){ 
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
	 * Set method for field currentDisplay
	 * Prototype: VkDisplayKHR  currentDisplay
	 */ 
	 public void currentDisplay(VkDisplayKHR currentDisplay){
		 this.currentDisplay = currentDisplay;
		currentDisplay0(super.ptr, currentDisplay);
	 }

	/**
	 * get method for field currentDisplay
	 * Prototype: VkDisplayKHR  currentDisplay
	 */ 
	 public VkDisplayKHR currentDisplay(){
		 // return  this.currentDisplay;
		 return currentDisplay0(super.ptr);
	 }

	/**
	 * Set method for field currentStackIndex
	 * Prototype: uint32_t  currentStackIndex
	 */ 
	 public void currentStackIndex(int currentStackIndex){
		 this.currentStackIndex = currentStackIndex;
		currentStackIndex0(super.ptr, currentStackIndex);
	 }

	/**
	 * get method for field currentStackIndex
	 * Prototype: uint32_t  currentStackIndex
	 */ 
	 public int currentStackIndex(){
		 // return  this.currentStackIndex;
		 return currentStackIndex0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field currentDisplay
	 * Prototype: VkDisplayKHR  currentDisplay
	 */ 
	 private static native void currentDisplay0(ByteBuffer ptr, VkDisplayKHR _currentDisplay);/*
		  VkDisplayPlanePropertiesKHR _obj = (VkDisplayPlanePropertiesKHR)(*ptr);
		  _obj.currentDisplay = (VkDisplayKHR) (_currentDisplay);
	  */

	/**
	 * get method for field currentDisplay
	 * Prototype: VkDisplayKHR  currentDisplay
	 */ 
	 private static native VkDisplayKHR currentDisplay0(ByteBuffer ptr);/*
		  VkDisplayPlanePropertiesKHR _obj = (VkDisplayPlanePropertiesKHR)(ptr);
		  return (VkDisplayKHR) (_obj.VkDisplayKHR);
	 */

	/**
	 * native Set method for field currentStackIndex
	 * Prototype: uint32_t  currentStackIndex
	 */ 
	 private static native void currentStackIndex0(ByteBuffer ptr, int _currentStackIndex);/*
		  VkDisplayPlanePropertiesKHR _obj = (VkDisplayPlanePropertiesKHR)(*ptr);
		  _obj.currentStackIndex = (uint32_t) (_currentStackIndex);
	  */

	/**
	 * get method for field currentStackIndex
	 * Prototype: uint32_t  currentStackIndex
	 */ 
	 private static native int currentStackIndex0(ByteBuffer ptr);/*
		  VkDisplayPlanePropertiesKHR _obj = (VkDisplayPlanePropertiesKHR)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkDisplayPlanePropertiesKHR
