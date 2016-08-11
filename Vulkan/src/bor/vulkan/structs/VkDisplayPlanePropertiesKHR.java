/**
 * Class wrapping Vulkan's VkDisplayPlanePropertiesKHR struct.
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
 *  This class is a Java front end for struct VkDisplayPlanePropertiesKHR. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDisplayPlanePropertiesKHR {
 *     VkDisplayKHR    currentDisplay;
 *     uint32_t        currentStackIndex;
 * } VkDisplayPlanePropertiesKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkDisplayPlanePropertiesKHR extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [115]  */
	 private static final String TAG = "VkDisplayPlanePropertiesKHR";

	/** ID of this structure [115]  */
	 public static final int TAG_ID = VKDISPLAYPLANEPROPERTIESKHR_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkDisplayKHR 	currentDisplay	[vkhandle]
	 */ 
	VkDisplayKHR 	currentDisplay;
	
	/**
	 *  uint32_t 	currentStackIndex	[int]
	 */ 
	int 	currentStackIndex;
	/**
	 * Ctor
	 */
	public VkDisplayPlanePropertiesKHR(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDisplayPlanePropertiesKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDisplayPlanePropertiesKHR(long address){ 
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
	 * Set method for field currentDisplay	[vkhandle]<br>
	 * Prototype: VkDisplayKHR  currentDisplay
	 * 
	 * @param currentDisplay - a instance of VkDisplayKHR.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayPlanePropertiesKHR currentDisplay(VkDisplayKHR currentDisplay){
		 this.currentDisplay = currentDisplay;
		 long handle = (currentDisplay==null) ? 0L : currentDisplay.getNativeHandle();
		 setCurrentDisplay0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field currentDisplay	[vkhandle]<br>
	 * Prototype: VkDisplayKHR  currentDisplay
	 */ 
	 public VkDisplayKHR currentDisplay(){

		 long handle = getCurrentDisplay0(super.ptr);
		 if(handle == 0){
		    this.currentDisplay = null;
		    return null;
		  }  

		 if(this.currentDisplay == null){
		    this.currentDisplay = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.currentDisplay).setNativeHandle(handle);
		  }
		 return this.currentDisplay;
	 }

	/**
	 * Set method for field currentStackIndex	[int]<br>
	 * Prototype: uint32_t  currentStackIndex
	 * 
	 * @param currentStackIndex - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayPlanePropertiesKHR currentStackIndex(int currentStackIndex){
		 this.currentStackIndex = currentStackIndex;
		 setCurrentStackIndex0(this.ptr,  currentStackIndex);
		 return this;
	 }

	/**
	 * Get method for field currentStackIndex	[int]<br>
	 * Prototype: uint32_t  currentStackIndex
	 */ 
	 public int currentStackIndex(){
		 int var = getCurrentStackIndex0(super.ptr);
		 this.currentStackIndex = var;
		 return this.currentStackIndex;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkDisplayPlanePropertiesKHR [ ")
				.append("currentDisplay: ").append(currentDisplay() )
				.append(",\n currentStackIndex: ")
				.append(currentStackIndex() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field currentDisplay	[vkhandle]<br>
	 * Prototype: VkDisplayKHR  currentDisplay
	 */ 
	 private static native void setCurrentDisplay0(Buffer ptr, long  _currentDisplay);/*
		  VkDisplayPlanePropertiesKHR* vkObj = (VkDisplayPlanePropertiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->currentDisplay = (VkDisplayKHR) (_currentDisplay);
	  */

	/**
	 * Native GET method for field currentDisplay	[vkhandle]<br>
	 * Prototype: VkDisplayKHR  currentDisplay
	 */ 
	 private static native long getCurrentDisplay0(Buffer ptr);/*
		  VkDisplayPlanePropertiesKHR* vkObj = (VkDisplayPlanePropertiesKHR*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->currentDisplay);
	 */

	/**
	 * Native SET method for field currentStackIndex	[int]<br>
	 * Prototype: uint32_t  currentStackIndex
	 */ 
	 private static native void setCurrentStackIndex0(Buffer ptr, int _currentStackIndex);/*
		  VkDisplayPlanePropertiesKHR* vkObj = (VkDisplayPlanePropertiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->currentStackIndex = (uint32_t) (_currentStackIndex);
	  */

	/**
	 * Native GET method for field currentStackIndex	[int]<br>
	 * Prototype: uint32_t  currentStackIndex
	 */ 
	 private static native int getCurrentStackIndex0(Buffer ptr);/*
		  VkDisplayPlanePropertiesKHR* vkObj = (VkDisplayPlanePropertiesKHR*)(ptr);
		  return (jint) (vkObj->currentStackIndex);
	 */



} // end of class VkDisplayPlanePropertiesKHR
