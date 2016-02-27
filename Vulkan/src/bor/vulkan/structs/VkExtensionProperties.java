// class wrapping Vulkan's VkExtensionProperties struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkExtensionProperties 
 * @Author Alessandro Borges 
 */
public class VkExtensionProperties extends VkStruct {
	/** ID of this structure [17]  */
	 public static final int TAG = VKEXTENSIONPROPERTIES_ID;

	 // fields //
	/**
	 *  char[] 	extensionName /* length=VK_MAX_EXTENSION_NAME_SIZE */ 
	 */ 
	char[] 	extensionName /* length=VK_MAX_EXTENSION_NAME_SIZE */;

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
		 return sizeOf(TAG); 
	}


	 // /////////////////////
	 //  SETTERS & GETTERS //
	 // /////////////////////

	/**
	 * Set method for field extensionName /* length=VK_MAX_EXTENSION_NAME_SIZE */
	 * Prototype: char[]  extensionName /* length=VK_MAX_EXTENSION_NAME_SIZE */
	 */ 
	 public void extensionName /* length=VK_MAX_EXTENSION_NAME_SIZE */(char[] extensionName /* length=VK_MAX_EXTENSION_NAME_SIZE */){
		 this.extensionName /* length=VK_MAX_EXTENSION_NAME_SIZE */ = extensionName /* length=VK_MAX_EXTENSION_NAME_SIZE */;
		extensionName /* length=VK_MAX_EXTENSION_NAME_SIZE */0(super.ptr, extensionName /* length=VK_MAX_EXTENSION_NAME_SIZE */);
	 }

	/**
	 * get method for field extensionName /* length=VK_MAX_EXTENSION_NAME_SIZE */
	 * Prototype: char[]  extensionName /* length=VK_MAX_EXTENSION_NAME_SIZE */
	 */ 
	 public char[] extensionName /* length=VK_MAX_EXTENSION_NAME_SIZE */(){
		 // return  this.extensionName /* length=VK_MAX_EXTENSION_NAME_SIZE */;
		 return extensionName /* length=VK_MAX_EXTENSION_NAME_SIZE */0(super.ptr);
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
	 * native Set method for field extensionName /* length=VK_MAX_EXTENSION_NAME_SIZE */
	 * Prototype: char[]  extensionName /* length=VK_MAX_EXTENSION_NAME_SIZE */
	 */ 
	 private static native void extensionName /* length=VK_MAX_EXTENSION_NAME_SIZE */0(ByteBuffer ptr, char[] _extensionName /* length=VK_MAX_EXTENSION_NAME_SIZE */);/*
		  VkExtensionProperties _obj = (VkExtensionProperties)(*ptr);
		  _obj.extensionName /* length=VK_MAX_EXTENSION_NAME_SIZE */ = (char[]) (_extensionName /* length=VK_MAX_EXTENSION_NAME_SIZE */);
	  */

	/**
	 * get method for field extensionName /* length=VK_MAX_EXTENSION_NAME_SIZE */
	 * Prototype: char[]  extensionName /* length=VK_MAX_EXTENSION_NAME_SIZE */
	 */ 
	 private static native char[] extensionName /* length=VK_MAX_EXTENSION_NAME_SIZE */0(ByteBuffer ptr);/*
		  VkExtensionProperties _obj = (VkExtensionProperties)(ptr);
		  return (char[]) (_obj.char[]);
	 */

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
