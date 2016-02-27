// class wrapping Vulkan's VkLayerProperties struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkLayerProperties 
 * @Author Alessandro Borges 
 */
public class VkLayerProperties extends VkStruct {
	/** ID of this structure [18]  */
	 public static final int TAG = VKLAYERPROPERTIES_ID;

	 // fields //
	/**
	 *  char[] 	layerName /* length=VK_MAX_EXTENSION_NAME_SIZE */ 
	 */ 
	char[] 	layerName /* length=VK_MAX_EXTENSION_NAME_SIZE */;

	/**
	 *  uint32_t 	specVersion 
	 */ 
	int 	specVersion;

	/**
	 *  uint32_t 	implementationVersion 
	 */ 
	int 	implementationVersion;

	/**
	 *  char[] 	description /* length=VK_MAX_DESCRIPTION_SIZE */ 
	 */ 
	char[] 	description /* length=VK_MAX_DESCRIPTION_SIZE */;

	/**
	 * Ctor
	 */
	public VkLayerProperties(){ 
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
	 * Set method for field layerName /* length=VK_MAX_EXTENSION_NAME_SIZE */
	 * Prototype: char[]  layerName /* length=VK_MAX_EXTENSION_NAME_SIZE */
	 */ 
	 public void layerName /* length=VK_MAX_EXTENSION_NAME_SIZE */(char[] layerName /* length=VK_MAX_EXTENSION_NAME_SIZE */){
		 this.layerName /* length=VK_MAX_EXTENSION_NAME_SIZE */ = layerName /* length=VK_MAX_EXTENSION_NAME_SIZE */;
		layerName /* length=VK_MAX_EXTENSION_NAME_SIZE */0(super.ptr, layerName /* length=VK_MAX_EXTENSION_NAME_SIZE */);
	 }

	/**
	 * get method for field layerName /* length=VK_MAX_EXTENSION_NAME_SIZE */
	 * Prototype: char[]  layerName /* length=VK_MAX_EXTENSION_NAME_SIZE */
	 */ 
	 public char[] layerName /* length=VK_MAX_EXTENSION_NAME_SIZE */(){
		 // return  this.layerName /* length=VK_MAX_EXTENSION_NAME_SIZE */;
		 return layerName /* length=VK_MAX_EXTENSION_NAME_SIZE */0(super.ptr);
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

	/**
	 * Set method for field implementationVersion
	 * Prototype: uint32_t  implementationVersion
	 */ 
	 public void implementationVersion(int implementationVersion){
		 this.implementationVersion = implementationVersion;
		implementationVersion0(super.ptr, implementationVersion);
	 }

	/**
	 * get method for field implementationVersion
	 * Prototype: uint32_t  implementationVersion
	 */ 
	 public int implementationVersion(){
		 // return  this.implementationVersion;
		 return implementationVersion0(super.ptr);
	 }

	/**
	 * Set method for field description /* length=VK_MAX_DESCRIPTION_SIZE */
	 * Prototype: char[]  description /* length=VK_MAX_DESCRIPTION_SIZE */
	 */ 
	 public void description /* length=VK_MAX_DESCRIPTION_SIZE */(char[] description /* length=VK_MAX_DESCRIPTION_SIZE */){
		 this.description /* length=VK_MAX_DESCRIPTION_SIZE */ = description /* length=VK_MAX_DESCRIPTION_SIZE */;
		description /* length=VK_MAX_DESCRIPTION_SIZE */0(super.ptr, description /* length=VK_MAX_DESCRIPTION_SIZE */);
	 }

	/**
	 * get method for field description /* length=VK_MAX_DESCRIPTION_SIZE */
	 * Prototype: char[]  description /* length=VK_MAX_DESCRIPTION_SIZE */
	 */ 
	 public char[] description /* length=VK_MAX_DESCRIPTION_SIZE */(){
		 // return  this.description /* length=VK_MAX_DESCRIPTION_SIZE */;
		 return description /* length=VK_MAX_DESCRIPTION_SIZE */0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field layerName /* length=VK_MAX_EXTENSION_NAME_SIZE */
	 * Prototype: char[]  layerName /* length=VK_MAX_EXTENSION_NAME_SIZE */
	 */ 
	 private static native void layerName /* length=VK_MAX_EXTENSION_NAME_SIZE */0(ByteBuffer ptr, char[] _layerName /* length=VK_MAX_EXTENSION_NAME_SIZE */);/*
		  VkLayerProperties _obj = (VkLayerProperties)(*ptr);
		  _obj.layerName /* length=VK_MAX_EXTENSION_NAME_SIZE */ = (char[]) (_layerName /* length=VK_MAX_EXTENSION_NAME_SIZE */);
	  */

	/**
	 * get method for field layerName /* length=VK_MAX_EXTENSION_NAME_SIZE */
	 * Prototype: char[]  layerName /* length=VK_MAX_EXTENSION_NAME_SIZE */
	 */ 
	 private static native char[] layerName /* length=VK_MAX_EXTENSION_NAME_SIZE */0(ByteBuffer ptr);/*
		  VkLayerProperties _obj = (VkLayerProperties)(ptr);
		  return (char[]) (_obj.char[]);
	 */

	/**
	 * native Set method for field specVersion
	 * Prototype: uint32_t  specVersion
	 */ 
	 private static native void specVersion0(ByteBuffer ptr, int _specVersion);/*
		  VkLayerProperties _obj = (VkLayerProperties)(*ptr);
		  _obj.specVersion = (uint32_t) (_specVersion);
	  */

	/**
	 * get method for field specVersion
	 * Prototype: uint32_t  specVersion
	 */ 
	 private static native int specVersion0(ByteBuffer ptr);/*
		  VkLayerProperties _obj = (VkLayerProperties)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field implementationVersion
	 * Prototype: uint32_t  implementationVersion
	 */ 
	 private static native void implementationVersion0(ByteBuffer ptr, int _implementationVersion);/*
		  VkLayerProperties _obj = (VkLayerProperties)(*ptr);
		  _obj.implementationVersion = (uint32_t) (_implementationVersion);
	  */

	/**
	 * get method for field implementationVersion
	 * Prototype: uint32_t  implementationVersion
	 */ 
	 private static native int implementationVersion0(ByteBuffer ptr);/*
		  VkLayerProperties _obj = (VkLayerProperties)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field description /* length=VK_MAX_DESCRIPTION_SIZE */
	 * Prototype: char[]  description /* length=VK_MAX_DESCRIPTION_SIZE */
	 */ 
	 private static native void description /* length=VK_MAX_DESCRIPTION_SIZE */0(ByteBuffer ptr, char[] _description /* length=VK_MAX_DESCRIPTION_SIZE */);/*
		  VkLayerProperties _obj = (VkLayerProperties)(*ptr);
		  _obj.description /* length=VK_MAX_DESCRIPTION_SIZE */ = (char[]) (_description /* length=VK_MAX_DESCRIPTION_SIZE */);
	  */

	/**
	 * get method for field description /* length=VK_MAX_DESCRIPTION_SIZE */
	 * Prototype: char[]  description /* length=VK_MAX_DESCRIPTION_SIZE */
	 */ 
	 private static native char[] description /* length=VK_MAX_DESCRIPTION_SIZE */0(ByteBuffer ptr);/*
		  VkLayerProperties _obj = (VkLayerProperties)(ptr);
		  return (char[]) (_obj.char[]);
	 */



} // end of class VkLayerProperties
