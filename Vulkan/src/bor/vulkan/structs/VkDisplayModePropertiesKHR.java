/**
 * Class wrapping Vulkan's VkDisplayModePropertiesKHR struct.
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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkDisplayModePropertiesKHR extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [112]  */
	 private static final String TAG = "VkDisplayModePropertiesKHR";

	/** ID of this structure [112]  */
	 public static final int TAG_ID = VKDISPLAYMODEPROPERTIESKHR_ID;

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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDisplayModePropertiesKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	/** 
	 * Static method to create a VkArray for this VkStruct subclass.
	 * @param size - number of elements
	 */
	 public static VkArray<VkDisplayModePropertiesKHR> createVkArray(int size){ 
		 VkDisplayModePropertiesKHR[] array = new VkDisplayModePropertiesKHR[size]; 
		 VkArrayStruct<VkDisplayModePropertiesKHR> vkArray = new VkArrayStruct<VkDisplayModePropertiesKHR>(array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field displayMode	[vkhandle]<br>
	 * Prototype: VkDisplayModeKHR  displayMode
	 * 
	 * @param displayMode - a instance of VkDisplayModeKHR.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayModePropertiesKHR displayMode(VkDisplayModeKHR displayMode){
		 this.displayMode = displayMode;
		 long handle = (displayMode==null) ? 0L : displayMode.getNativeHandle();
		 setDisplayMode0(this.ptr, handle);
		 return this;
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
		    ((VkHandle)this.displayMode).setNativeHandle(handle);
		  }
		 return this.displayMode;
	 }

	/**
	 * Set method for field parameters	[vkstruct]<br>
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 * 
	 * @param parameters - a instance of VkDisplayModeParametersKHR.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayModePropertiesKHR parameters(VkDisplayModeParametersKHR parameters){
		 this.parameters = parameters;
		 ByteBuffer buff = (parameters==null) ? null : parameters.getPointer();
		 setParameters0(this.ptr, buff);
		 return this;
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


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkDisplayModePropertiesKHR [ ")
				.append("displayMode: ").append(displayMode() )
				.append(",\n parameters: ")
				.append(parameters() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field displayMode	[vkhandle]<br>
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 private static native void setDisplayMode0(Buffer ptr, long  _displayMode);/*
		  VkDisplayModePropertiesKHR* vkObj = (VkDisplayModePropertiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->displayMode = (VkDisplayModeKHR) (_displayMode);
	  */

	/**
	 * Native GET method for field displayMode	[vkhandle]<br>
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 private static native long getDisplayMode0(Buffer ptr);/*
		  VkDisplayModePropertiesKHR* vkObj = (VkDisplayModePropertiesKHR*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->displayMode);
	 */

	/**
	 * Native SET method for field parameters	[vkstruct]<br>
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 private static native void setParameters0(Buffer ptr, java.nio.ByteBuffer  _parameters);/*
		  VkDisplayModePropertiesKHR* vkObj = (VkDisplayModePropertiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkDisplayModeParametersKHR* p_parameters = (VkDisplayModeParametersKHR*) _parameters; 
		 vkObj->parameters = (*p_parameters); 
	  */

	/**
	 * Native GET method for field parameters	[vkstruct]<br>
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 private static native long getParameters0(Buffer ptr);/*
		  VkDisplayModePropertiesKHR* vkObj = (VkDisplayModePropertiesKHR*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->parameters);
	 */



} // end of class VkDisplayModePropertiesKHR
