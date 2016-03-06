/**
 * Class wrapping Vulkan's VkExtensionProperties struct.
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
 *  This class is a Java front end for struct VkExtensionProperties. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkExtensionProperties {
 *     char        extensionName[VK_MAX_EXTENSION_NAME_SIZE];
 *     uint32_t    specVersion;
 * } VkExtensionProperties;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkExtensionProperties extends VkStruct {
	/** TAG of this structure [17]  */
	 private static final String TAG = "VkExtensionProperties";

	/** ID of this structure [17]  */
	 public static final int TAG_ID = VKEXTENSIONPROPERTIES_ID;

	 // fields //
	/**
	 *  char[] 	extensionName	[string]
	 */ 
	String 	extensionName;

	/**
	 *  uint32_t 	specVersion	[int]
	 */ 
	int 	specVersion;

	/**
	 * Ctor
	 */
	public VkExtensionProperties(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkExtensionProperties(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkExtensionProperties(long address, int memSize){ 
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
	 public static P<VkExtensionProperties> createNullPointer(){
	        P<VkExtensionProperties> p = new  P<VkExtensionProperties>(new VkExtensionProperties());
	        return p;
	    }

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field extensionName	[string]<br>
	 * Prototype: char[]  extensionName
	 */ 
	 public void extensionName(String extensionName){
		 this.extensionName = extensionName;
		extensionName0(super.ptr, extensionName);
	 }

	/**
	 * get method for field extensionName	[string]<br>
	 * Prototype: char[]  extensionName
	 */ 
	 public String extensionName(){
		 // return  this.extensionName;
		 return extensionName0(super.ptr);
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


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field extensionName	[string]<br>
	 * Prototype: char[]  extensionName
	 */ 
	 private static native void extensionName0(ByteBuffer ptr, String _extensionName);/*
		  VkExtensionProperties _obj = (VkExtensionProperties)(*ptr);
		  _obj.extensionName = (char[]) (_extensionName);
	  */

	/**
	 * native GET method for field extensionName	[string]<br>
	 * Prototype: char[]  extensionName
	 */ 
	 private static native String extensionName0(ByteBuffer ptr);/*
		  VkExtensionProperties _obj = (VkExtensionProperties)(ptr);
		  return (jstring)(env->NewStringUTF(_obj.char[]);	 */

	/**
	 * native SET method for field specVersion	[int]<br>
	 * Prototype: uint32_t  specVersion
	 */ 
	 private static native void specVersion0(ByteBuffer ptr, int _specVersion);/*
		  VkExtensionProperties _obj = (VkExtensionProperties)(*ptr);
		  _obj.specVersion = (uint32_t) (_specVersion);
	  */

	/**
	 * native GET method for field specVersion	[int]<br>
	 * Prototype: uint32_t  specVersion
	 */ 
	 private static native int specVersion0(ByteBuffer ptr);/*
		  VkExtensionProperties _obj = (VkExtensionProperties)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkExtensionProperties
