/**
 * Class wrapping Vulkan's VkFormatProperties struct.
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
 *  This class is a Java front end for struct VkFormatProperties. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkFormatProperties {
 *     VkFormatFeatureFlags    linearTilingFeatures;
 *     VkFormatFeatureFlags    optimalTilingFeatures;
 *     VkFormatFeatureFlags    bufferFeatures;
 * } VkFormatProperties;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkFormatProperties extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [5]  */
	 private static final String TAG = "VkFormatProperties";

	/** ID of this structure [5]  */
	 public static final int TAG_ID = VKFORMATPROPERTIES_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkFormatFeatureFlags 	linearTilingFeatures	[int]
	 */ 
	int 	linearTilingFeatures;
	
	/**
	 *  VkFormatFeatureFlags 	optimalTilingFeatures	[int]
	 */ 
	int 	optimalTilingFeatures;
	
	/**
	 *  VkFormatFeatureFlags 	bufferFeatures	[int]
	 */ 
	int 	bufferFeatures;
	/**
	 * Ctor
	 */
	public VkFormatProperties(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkFormatProperties(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkFormatProperties(long address){ 
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
	 * Set method for field linearTilingFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  linearTilingFeatures
	 * 
	 * @param linearTilingFeatures - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkFormatProperties linearTilingFeatures(int linearTilingFeatures){
		 this.linearTilingFeatures = linearTilingFeatures;
		 setLinearTilingFeatures0(this.ptr,  linearTilingFeatures);
		 return this;
	 }

	/**
	 * Get method for field linearTilingFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  linearTilingFeatures
	 */ 
	 public int linearTilingFeatures(){
		 int var = getLinearTilingFeatures0(super.ptr);
		 this.linearTilingFeatures = var;
		 return this.linearTilingFeatures;
	 }

	/**
	 * Set method for field optimalTilingFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  optimalTilingFeatures
	 * 
	 * @param optimalTilingFeatures - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkFormatProperties optimalTilingFeatures(int optimalTilingFeatures){
		 this.optimalTilingFeatures = optimalTilingFeatures;
		 setOptimalTilingFeatures0(this.ptr,  optimalTilingFeatures);
		 return this;
	 }

	/**
	 * Get method for field optimalTilingFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  optimalTilingFeatures
	 */ 
	 public int optimalTilingFeatures(){
		 int var = getOptimalTilingFeatures0(super.ptr);
		 this.optimalTilingFeatures = var;
		 return this.optimalTilingFeatures;
	 }

	/**
	 * Set method for field bufferFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  bufferFeatures
	 * 
	 * @param bufferFeatures - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkFormatProperties bufferFeatures(int bufferFeatures){
		 this.bufferFeatures = bufferFeatures;
		 setBufferFeatures0(this.ptr,  bufferFeatures);
		 return this;
	 }

	/**
	 * Get method for field bufferFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  bufferFeatures
	 */ 
	 public int bufferFeatures(){
		 int var = getBufferFeatures0(super.ptr);
		 this.bufferFeatures = var;
		 return this.bufferFeatures;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkFormatProperties [ ")
				.append("linearTilingFeatures: ").append(linearTilingFeatures() )
				.append(",\n optimalTilingFeatures: ")
				.append(optimalTilingFeatures() )
				.append(",\n bufferFeatures: ")
				.append(bufferFeatures() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field linearTilingFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  linearTilingFeatures
	 */ 
	 private static native void setLinearTilingFeatures0(Buffer ptr, int _linearTilingFeatures);/*
		  VkFormatProperties* vkObj = (VkFormatProperties*)(ptr);
		  vkObj->linearTilingFeatures = (VkFormatFeatureFlags) (_linearTilingFeatures);
	  */

	/**
	 * Native GET method for field linearTilingFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  linearTilingFeatures
	 */ 
	 private static native int getLinearTilingFeatures0(Buffer ptr);/*
		  VkFormatProperties* vkObj = (VkFormatProperties*)(ptr);
		  return (jint) (vkObj->linearTilingFeatures);
	 */

	/**
	 * Native SET method for field optimalTilingFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  optimalTilingFeatures
	 */ 
	 private static native void setOptimalTilingFeatures0(Buffer ptr, int _optimalTilingFeatures);/*
		  VkFormatProperties* vkObj = (VkFormatProperties*)(ptr);
		  vkObj->optimalTilingFeatures = (VkFormatFeatureFlags) (_optimalTilingFeatures);
	  */

	/**
	 * Native GET method for field optimalTilingFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  optimalTilingFeatures
	 */ 
	 private static native int getOptimalTilingFeatures0(Buffer ptr);/*
		  VkFormatProperties* vkObj = (VkFormatProperties*)(ptr);
		  return (jint) (vkObj->optimalTilingFeatures);
	 */

	/**
	 * Native SET method for field bufferFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  bufferFeatures
	 */ 
	 private static native void setBufferFeatures0(Buffer ptr, int _bufferFeatures);/*
		  VkFormatProperties* vkObj = (VkFormatProperties*)(ptr);
		  vkObj->bufferFeatures = (VkFormatFeatureFlags) (_bufferFeatures);
	  */

	/**
	 * Native GET method for field bufferFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  bufferFeatures
	 */ 
	 private static native int getBufferFeatures0(Buffer ptr);/*
		  VkFormatProperties* vkObj = (VkFormatProperties*)(ptr);
		  return (jint) (vkObj->bufferFeatures);
	 */



} // end of class VkFormatProperties
