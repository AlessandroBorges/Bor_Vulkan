/**
 * Class wrapping Vulkan's VkLayerProperties struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.01 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.*;
import java.nio.ByteBuffer;


/**
 *  Project Bor-Vulkan 
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkLayerProperties. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkLayerProperties {
 *     char        layerName[VK_MAX_EXTENSION_NAME_SIZE];
 *     uint32_t    specVersion;
 *     uint32_t    implementationVersion;
 *     char        description[VK_MAX_DESCRIPTION_SIZE];
 * } VkLayerProperties;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkLayerProperties extends VkStruct {
	/** TAG of this structure [18]  */
	 private static final String TAG = "VkLayerProperties";

	/** ID of this structure [18]  */
	 public static final int TAG_ID = VKLAYERPROPERTIES_ID;

	 // fields //
	/**
	 *  char[] 	layerName	[string]
	 */ 
	String 	layerName;

	/**
	 *  uint32_t 	specVersion	[int]
	 */ 
	int 	specVersion;

	/**
	 *  uint32_t 	implementationVersion	[int]
	 */ 
	int 	implementationVersion;

	/**
	 *  char[] 	description	[string]
	 */ 
	String 	description;

	/**
	 * Ctor
	 */
	public VkLayerProperties(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkLayerProperties(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkLayerProperties(long address, int memSize){ 
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
	 public static P<VkLayerProperties> createNullPointer(){
	        P<VkLayerProperties> p = new  P<VkLayerProperties>(new VkLayerProperties());
	        return p;
	    }

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field layerName	[string]<br>
	 * Prototype: char[]  layerName
	 */ 
	 public void layerName(String layerName){
		 this.layerName = layerName;
		layerName0(super.ptr, layerName);
	 }

	/**
	 * get method for field layerName	[string]<br>
	 * Prototype: char[]  layerName
	 */ 
	 public String layerName(){
		 // return  this.layerName;
		 return layerName0(super.ptr);
	 }

	/**
	 * Set method for field specVersion	[int]<br>
	 * Prototype: uint32_t  specVersion
	 */ 
	 public void specVersion(int specVersion){
		 this.specVersion = specVersion;
		specVersion0(super.ptr, specVersion);
	 }

	/**
	 * get method for field specVersion	[int]<br>
	 * Prototype: uint32_t  specVersion
	 */ 
	 public int specVersion(){
		 // return  this.specVersion;
		 return specVersion0(super.ptr);
	 }

	/**
	 * Set method for field implementationVersion	[int]<br>
	 * Prototype: uint32_t  implementationVersion
	 */ 
	 public void implementationVersion(int implementationVersion){
		 this.implementationVersion = implementationVersion;
		implementationVersion0(super.ptr, implementationVersion);
	 }

	/**
	 * get method for field implementationVersion	[int]<br>
	 * Prototype: uint32_t  implementationVersion
	 */ 
	 public int implementationVersion(){
		 // return  this.implementationVersion;
		 return implementationVersion0(super.ptr);
	 }

	/**
	 * Set method for field description	[string]<br>
	 * Prototype: char[]  description
	 */ 
	 public void description(String description){
		 this.description = description;
		description0(super.ptr, description);
	 }

	/**
	 * get method for field description	[string]<br>
	 * Prototype: char[]  description
	 */ 
	 public String description(){
		 // return  this.description;
		 return description0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field layerName	[string]<br>
	 * Prototype: char[]  layerName
	 */ 
	 private static native void layerName0(ByteBuffer ptr, String _layerName);/*
		  VkLayerProperties _obj = (VkLayerProperties)(*ptr);
		  _obj.layerName = (char[]) (_layerName);
	  */

	/**
	 * native GET method for field layerName	[string]<br>
	 * Prototype: char[]  layerName
	 */ 
	 private static native String layerName0(ByteBuffer ptr);/*
		  VkLayerProperties _obj = (VkLayerProperties)(ptr);
		  return (jstring)(env->NewStringUTF(_obj.char[]);	 */

	/**
	 * native SET method for field specVersion	[int]<br>
	 * Prototype: uint32_t  specVersion
	 */ 
	 private static native void specVersion0(ByteBuffer ptr, int _specVersion);/*
		  VkLayerProperties _obj = (VkLayerProperties)(*ptr);
		  _obj.specVersion = (uint32_t) (_specVersion);
	  */

	/**
	 * native GET method for field specVersion	[int]<br>
	 * Prototype: uint32_t  specVersion
	 */ 
	 private static native int specVersion0(ByteBuffer ptr);/*
		  VkLayerProperties _obj = (VkLayerProperties)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field implementationVersion	[int]<br>
	 * Prototype: uint32_t  implementationVersion
	 */ 
	 private static native void implementationVersion0(ByteBuffer ptr, int _implementationVersion);/*
		  VkLayerProperties _obj = (VkLayerProperties)(*ptr);
		  _obj.implementationVersion = (uint32_t) (_implementationVersion);
	  */

	/**
	 * native GET method for field implementationVersion	[int]<br>
	 * Prototype: uint32_t  implementationVersion
	 */ 
	 private static native int implementationVersion0(ByteBuffer ptr);/*
		  VkLayerProperties _obj = (VkLayerProperties)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field description	[string]<br>
	 * Prototype: char[]  description
	 */ 
	 private static native void description0(ByteBuffer ptr, String _description);/*
		  VkLayerProperties _obj = (VkLayerProperties)(*ptr);
		  _obj.description = (char[]) (_description);
	  */

	/**
	 * native GET method for field description	[string]<br>
	 * Prototype: char[]  description
	 */ 
	 private static native String description0(ByteBuffer ptr);/*
		  VkLayerProperties _obj = (VkLayerProperties)(ptr);
		  return (jstring)(env->NewStringUTF(_obj.char[]);	 */



} // end of class VkLayerProperties
