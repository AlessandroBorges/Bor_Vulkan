/**
 * Class wrapping Vulkan's VkExtensionProperties struct.
 * 
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
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkExtensionProperties 
 *  <h3>ProtoType:</h3>
 * <pre>
 * typedef struct VkExtensionProperties {
 *     char        extensionName[VK_MAX_EXTENSION_NAME_SIZE];
 *     uint32_t    specVersion;
 * } VkExtensionProperties;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version 0.8.01
 */
public class VkExtensionProperties extends VkStruct {
	/** TAG of this structure [141]  */
	 private static final String TAG = "VkExtensionProperties";

	/** ID of this structure [141]  */
	 public static final int TAG_ID = VKEXTENSIONPROPERTIES_ID;

	 // fields //
	/**
	 *  char[] 	extensionName 
	 */ 
	String 	extensionName;

	/**
	 *  uint32_t 	specVersion 
	 */ 
	int 	specVersion;

	/**
	 * Ctor
	 */
	public VkExtensionProperties(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	 // /////////////////////
	 //  SETTERS & GETTERS //
	 // /////////////////////

	/**
	 * Set method for field extensionName
	 * Prototype: char[]  extensionName
	 */ 
	 public void extensionName(String extensionName){
		 this.extensionName = extensionName;
		extensionName0(super.ptr, extensionName);
	 }

	/**
	 * get method for field extensionName
	 * Prototype: char[]  extensionName
	 */ 
	 public String extensionName(){
		 // return  this.extensionName;
		 return extensionName0(super.ptr);
	 }

	/**
	 * Set method for field specVersion
	 * Prototype: uint32_t  specVersion
	 */ 
	 public void specVersion(int specVersion){
		 this.specVersion = specVersion;
		specVersion0(super.ptr, specVersion);
	 }

	/**
	 * get method for field specVersion
	 * Prototype: uint32_t  specVersion
	 */ 
	 public int specVersion(){
		 // return  this.specVersion;
		 return specVersion0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field extensionName
	 * Prototype: char[]  extensionName
	 */ 
	 private static native void extensionName0(ByteBuffer ptr, String _extensionName);/*
		  VkExtensionProperties _obj = (VkExtensionProperties)(*ptr);
		  _obj.extensionName = (char[]) (_extensionName);
	  */

	/**
	 * get method for field extensionName
	 * Prototype: char[]  extensionName
	 */ 
	 private static native String extensionName0(ByteBuffer ptr);/*
		  VkExtensionProperties _obj = (VkExtensionProperties)(ptr);
		  return (jstring)(env->NewStringUTF(_obj.char[]);	 */

	/**
	 * native Set method for field specVersion
	 * Prototype: uint32_t  specVersion
	 */ 
	 private static native void specVersion0(ByteBuffer ptr, int _specVersion);/*
		  VkExtensionProperties _obj = (VkExtensionProperties)(*ptr);
		  _obj.specVersion = (uint32_t) (_specVersion);
	  */

	/**
	 * get method for field specVersion
	 * Prototype: uint32_t  specVersion
	 */ 
	 private static native int specVersion0(ByteBuffer ptr);/*
		  VkExtensionProperties _obj = (VkExtensionProperties)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkExtensionProperties
