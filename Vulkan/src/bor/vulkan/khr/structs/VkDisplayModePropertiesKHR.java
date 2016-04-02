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

import java.nio.Buffer;
import java.nio.ByteBuffer;

import bor.vulkan.P;
import bor.vulkan.VkHandle;
import bor.vulkan.khr.VkDisplayModeKHR;
import bor.vulkan.structs.VkStruct;


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
		 ByteBuffer buff = (displayMode==null) ? null : displayMode.getHandle();
		 displayMode0(this.ptr, buff);
	 }

	/**
	 * Get method for field displayMode	[vkhandle]<br>
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 public VkDisplayModeKHR displayMode(){

		 ByteBuffer handle = displayMode0(super.ptr);
		 if(handle == null){
		    this.displayMode = null;
		    return null;
		  } else 
 		 if(this.displayMode == null){
		    this.displayMode = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.displayMode).setHandle(handle);
		  }
		 return this.displayMode;
	 }

	/**
	 * Set method for field parameters	[vkstruct]<br>
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 public void parameters(VkDisplayModeParametersKHR parameters){
		 this.parameters = parameters;
		 ByteBuffer buff = (parameters==null) ? null : parameters.getPointerStruct();
		 parameters0(this.ptr, buff);
	 }

	/**
	 * Get method for field parameters	[vkstruct]<br>
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 public VkDisplayModeParametersKHR parameters(){
		 ByteBuffer pointer = parameters0(super.ptr);
		 if(pointer == null){
		    this.parameters = null;
		    return null;
		  } else 
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
	 private static native void displayMode0(Buffer ptr, java.nio.ByteBuffer  _displayMode);/*
		  VkDisplayModePropertiesKHR* vkObj = (VkDisplayModePropertiesKHR*)(ptr);
		  vkObj->displayMode = (VkDisplayModeKHR) (_displayMode);
	  */

	/**
	 * native GET method for field displayMode	[vkhandle]<br>
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 private static native java.nio.ByteBuffer  displayMode0(Buffer ptr);/*
		  VkDisplayModePropertiesKHR vkObj = (VkDisplayModePropertiesKHR*)(ptr);
		  return (VkDisplayModeKHR) (vkObj->displayMode);
	 */

	/**
	 * native SET method for field parameters	[vkstruct]<br>
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 private static native void parameters0(Buffer ptr, java.nio.ByteBuffer  _parameters);/*
		  VkDisplayModePropertiesKHR* vkObj = (VkDisplayModePropertiesKHR*)(ptr);
		  vkObj->parameters = (VkDisplayModeParametersKHR) (_parameters);
	  */

	/**
	 * native GET method for field parameters	[vkstruct]<br>
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 private static native java.nio.ByteBuffer  parameters0(Buffer ptr);/*
		  VkDisplayModePropertiesKHR vkObj = (VkDisplayModePropertiesKHR*)(ptr);
		  return (VkDisplayModeParametersKHR) (vkObj->parameters);
	 */



} // end of class VkDisplayModePropertiesKHR
