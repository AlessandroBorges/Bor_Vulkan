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

import java.nio.Buffer;


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

	/** P wrapper for THIS object */
	 private  P<VkExtensionProperties> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
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
	 public VkExtensionProperties(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkExtensionProperties(long address){ 
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
	 public static P<VkExtensionProperties> createNullPointer(){
	        P<VkExtensionProperties> p = new  P<VkExtensionProperties>(new VkExtensionProperties());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkExtensionProperties> getP() {
	       if(p == null ){
	           p = new P<VkExtensionProperties> (this);
	       }
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
		 setExtensionName0(this.ptr,  extensionName);
	 }

	/**
	 * Get method for field extensionName	[string]<br>
	 * Prototype: char[]  extensionName
	 */ 
	 public String extensionName(){
		 String var = getExtensionName0(super.ptr);
		 this.extensionName = var;
		 return this.extensionName;
	 }

	/**
	 * Set method for field specVersion	[int]<br>
	 * Prototype: uint32_t  specVersion
	 */ 
	 public void specVersion(int specVersion){
		 this.specVersion = specVersion;
		 setSpecVersion0(this.ptr,  specVersion);
	 }

	/**
	 * Get method for field specVersion	[int]<br>
	 * Prototype: uint32_t  specVersion
	 */ 
	 public int specVersion(){
		 int var = getSpecVersion0(super.ptr);
		 this.specVersion = var;
		 return this.specVersion;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field extensionName	[string]<br>
	 * Prototype: char[]  extensionName
	 */ 
	 private static native void setExtensionName0(Buffer ptr, String _extensionName);/*
		  VkExtensionProperties* vkObj = (VkExtensionProperties*)(ptr);
		  vkObj->extensionName = (char[]) (_extensionName);
	  */

	/**
	 * native GET method for field extensionName	[string]<br>
	 * Prototype: char[]  extensionName
	 */ 
	 private static native String getExtensionName0(Buffer ptr);/*
		  VkExtensionProperties vkObj = (VkExtensionProperties*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->extensionName);	 */

	/**
	 * native SET method for field specVersion	[int]<br>
	 * Prototype: uint32_t  specVersion
	 */ 
	 private static native void setSpecVersion0(Buffer ptr, int _specVersion);/*
		  VkExtensionProperties* vkObj = (VkExtensionProperties*)(ptr);
		  vkObj->specVersion = (uint32_t) (_specVersion);
	  */

	/**
	 * native GET method for field specVersion	[int]<br>
	 * Prototype: uint32_t  specVersion
	 */ 
	 private static native int getSpecVersion0(Buffer ptr);/*
		  VkExtensionProperties vkObj = (VkExtensionProperties*)(ptr);
		  return (jint) (vkObj->specVersion);
	 */



} // end of class VkExtensionProperties
