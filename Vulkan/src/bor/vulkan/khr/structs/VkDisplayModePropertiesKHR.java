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

import java.nio.Buffer;


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

	/** P wrapper for THIS object */
	 private  P<VkDisplayModePropertiesKHR> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
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
	 public VkDisplayModePropertiesKHR(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDisplayModePropertiesKHR(long address){ 
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
	 public static P<VkDisplayModePropertiesKHR> createNullPointer(){
	        P<VkDisplayModePropertiesKHR> p = new  P<VkDisplayModePropertiesKHR>(new VkDisplayModePropertiesKHR());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkDisplayModePropertiesKHR> getP() {
	       if(p == null ){
	           p = new P<VkDisplayModePropertiesKHR> (this);
	       }
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
		 ByteBuffer buff = (displayMode==null) ? null : displayMode.getPointer();
		 setDisplayMode0(this.ptr, buff);
	 }

	/**
	 * Get method for field displayMode	[vkhandle]<br>
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 public VkDisplayModeKHR displayMode(){

		 long handle = getDisplayMode0(super.ptr);
		 if(handle == 0){
		    this.displayMode = null;
		    return null;
		  }  

		 if(this.displayMode == null){
		    this.displayMode = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.displayMode).setPointer(handle);
		  }
		 return this.displayMode;
	 }

	/**
	 * Set method for field parameters	[vkstruct]<br>
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 public void parameters(VkDisplayModeParametersKHR parameters){
		 this.parameters = parameters;
		 ByteBuffer buff = (parameters==null) ? null : parameters.getPointer();
		 setParameters0(this.ptr, buff);
	 }

	/**
	 * Get method for field parameters	[vkstruct]<br>
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 public VkDisplayModeParametersKHR parameters(){
		 long pointer = getParameters0(super.ptr);
		 if(pointer == 0){
		    this.parameters = null;
		    return null;
		  } 

		 if(this.parameters == null){
		    this.parameters = new VkDisplayModeParametersKHR(pointer);
		 }else{
		    this.parameters.setPointer(pointer);
		  }
		 return this.parameters;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field displayMode	[vkhandle]<br>
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 private static native void setDisplayMode0(Buffer ptr, java.nio.ByteBuffer  _displayMode);/*
		  VkDisplayModePropertiesKHR* vkObj = (VkDisplayModePropertiesKHR*)(ptr);
		  vkObj->displayMode = (VkDisplayModeKHR) (_displayMode);
	  */

	/**
	 * native GET method for field displayMode	[vkhandle]<br>
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 private static native long getDisplayMode0(Buffer ptr);/*
		  VkDisplayModePropertiesKHR vkObj = (VkDisplayModePropertiesKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->displayMode);	 */

	/**
	 * native SET method for field parameters	[vkstruct]<br>
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 private static native void setParameters0(Buffer ptr, java.nio.ByteBuffer  _parameters);/*
		  VkDisplayModePropertiesKHR* vkObj = (VkDisplayModePropertiesKHR*)(ptr);
		  vkObj->parameters = (VkDisplayModeParametersKHR) (_parameters);
	  */

	/**
	 * native GET method for field parameters	[vkstruct]<br>
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 private static native long getParameters0(Buffer ptr);/*
		  VkDisplayModePropertiesKHR vkObj = (VkDisplayModePropertiesKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->parameters);	 */



} // end of class VkDisplayModePropertiesKHR
