// class wrapping Vulkan's VkDisplayModeParametersKHR struct.
package bor.vulkan.khr.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.VkExtent2D;
import bor.vulkan.structs.VkStruct;

import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkDisplayModeParametersKHR 
 * @Author Alessandro Borges 
 */
public class VkDisplayModeParametersKHR extends VkStruct {
	/** ID of this structure [111]  */
	 public static final int TAG = VKDISPLAYMODEPARAMETERSKHR_ID;

	 // fields //
	/**
	 *  VkExtent2D 	visibleRegion 
	 */ 
	VkExtent2D 	visibleRegion;

	/**
	 *  uint32_t 	refreshRate 
	 */ 
	int 	refreshRate;

	/**
	 * Ctor
	 */
	public VkDisplayModeParametersKHR(){ 
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
	 * Set method for field visibleRegion
	 * Prototype: VkExtent2D  visibleRegion
	 */ 
	 public void visibleRegion(VkExtent2D visibleRegion){
		 this.visibleRegion = visibleRegion;
		visibleRegion0(super.ptr, visibleRegion);
	 }

	/**
	 * get method for field visibleRegion
	 * Prototype: VkExtent2D  visibleRegion
	 */ 
	 public VkExtent2D visibleRegion(){
		 // return  this.visibleRegion;
		 return visibleRegion0(super.ptr);
	 }

	/**
	 * Set method for field refreshRate
	 * Prototype: uint32_t  refreshRate
	 */ 
	 public void refreshRate(int refreshRate){
		 this.refreshRate = refreshRate;
		refreshRate0(super.ptr, refreshRate);
	 }

	/**
	 * get method for field refreshRate
	 * Prototype: uint32_t  refreshRate
	 */ 
	 public int refreshRate(){
		 // return  this.refreshRate;
		 return refreshRate0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field visibleRegion
	 * Prototype: VkExtent2D  visibleRegion
	 */ 
	 private static native void visibleRegion0(ByteBuffer ptr, VkExtent2D _visibleRegion);/*
		  VkDisplayModeParametersKHR _obj = (VkDisplayModeParametersKHR)(*ptr);
		  _obj.visibleRegion = (VkExtent2D) (_visibleRegion);
	  */

	/**
	 * get method for field visibleRegion
	 * Prototype: VkExtent2D  visibleRegion
	 */ 
	 private static native VkExtent2D visibleRegion0(ByteBuffer ptr);/*
		  VkDisplayModeParametersKHR _obj = (VkDisplayModeParametersKHR)(ptr);
		  return (VkExtent2D) (_obj.VkExtent2D);
	 */

	/**
	 * native Set method for field refreshRate
	 * Prototype: uint32_t  refreshRate
	 */ 
	 private static native void refreshRate0(ByteBuffer ptr, int _refreshRate);/*
		  VkDisplayModeParametersKHR _obj = (VkDisplayModeParametersKHR)(*ptr);
		  _obj.refreshRate = (uint32_t) (_refreshRate);
	  */

	/**
	 * get method for field refreshRate
	 * Prototype: uint32_t  refreshRate
	 */ 
	 private static native int refreshRate0(ByteBuffer ptr);/*
		  VkDisplayModeParametersKHR _obj = (VkDisplayModeParametersKHR)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkDisplayModeParametersKHR
