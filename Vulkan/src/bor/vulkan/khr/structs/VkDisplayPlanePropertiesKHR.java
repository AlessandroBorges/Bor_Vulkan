/**
 * Class wrapping Vulkan's VkDisplayPlanePropertiesKHR struct.
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
 * @version Ver. 0.8.01 (beta) 
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

	/** P wrapper for THIS object */
	 private  P<VkDisplayPlanePropertiesKHR> p;

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
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkDisplayPlanePropertiesKHR(long address , int memSize){ 
		 super(address, memSize); 
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
	 * Create a pointer P to contain a instance of this,
	 * with clean native pointer.<br>
	 * You can use {@link VkStruct#setPointer(ByteBuffer)} to set a new 
	 * native pointer.
	 * @return An instance of P for this VkStruct with null pointer
	 */
	 public static P<VkDisplayPlanePropertiesKHR> createNullPointer(){
	        P<VkDisplayPlanePropertiesKHR> p = new  P<VkDisplayPlanePropertiesKHR>(new VkDisplayPlanePropertiesKHR());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkDisplayPlanePropertiesKHR> getP() {
	       if(p == null ){
	           p = new P<VkDisplayPlanePropertiesKHR> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field currentDisplay	[vkhandle]<br>
	 * Prototype: VkDisplayKHR  currentDisplay
	 */ 
	 public void currentDisplay(VkDisplayKHR currentDisplay){
		 this.currentDisplay = currentDisplay;
		 ByteBuffer buff = (currentDisplay==null) ? null : currentDisplay.getPointer();
		 setCurrentDisplay0(this.ptr, buff);
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
		    ((VkHandle)this.currentDisplay).setPointer(handle);
		  }
		 return this.currentDisplay;
	 }

	/**
	 * Set method for field currentStackIndex	[int]<br>
	 * Prototype: uint32_t  currentStackIndex
	 */ 
	 public void currentStackIndex(int currentStackIndex){
		 this.currentStackIndex = currentStackIndex;
		 setCurrentStackIndex0(this.ptr,  currentStackIndex);
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


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field currentDisplay	[vkhandle]<br>
	 * Prototype: VkDisplayKHR  currentDisplay
	 */ 
	 private static native void setCurrentDisplay0(Buffer ptr, java.nio.ByteBuffer  _currentDisplay);/*
		  VkDisplayPlanePropertiesKHR* vkObj = (VkDisplayPlanePropertiesKHR*)(ptr);
		  vkObj->currentDisplay = (VkDisplayKHR) (_currentDisplay);
	  */

	/**
	 * native GET method for field currentDisplay	[vkhandle]<br>
	 * Prototype: VkDisplayKHR  currentDisplay
	 */ 
	 private static native long getCurrentDisplay0(Buffer ptr);/*
		  VkDisplayPlanePropertiesKHR* vkObj = (VkDisplayPlanePropertiesKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->currentDisplay);	 */

	/**
	 * native SET method for field currentStackIndex	[int]<br>
	 * Prototype: uint32_t  currentStackIndex
	 */ 
	 private static native void setCurrentStackIndex0(Buffer ptr, int _currentStackIndex);/*
		  VkDisplayPlanePropertiesKHR* vkObj = (VkDisplayPlanePropertiesKHR*)(ptr);
		  vkObj->currentStackIndex = (uint32_t) (_currentStackIndex);
	  */

	/**
	 * native GET method for field currentStackIndex	[int]<br>
	 * Prototype: uint32_t  currentStackIndex
	 */ 
	 private static native int getCurrentStackIndex0(Buffer ptr);/*
		  VkDisplayPlanePropertiesKHR* vkObj = (VkDisplayPlanePropertiesKHR*)(ptr);
		  return (jint) (vkObj->currentStackIndex);
	 */



} // end of class VkDisplayPlanePropertiesKHR
