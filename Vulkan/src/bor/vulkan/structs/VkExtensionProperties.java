/**
 * Class wrapping Vulkan's VkExtensionProperties struct.
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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkExtensionProperties extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [17]  */
	 private static final String TAG = "VkExtensionProperties";

	/** ID of this structure [17]  */
	 public static final int TAG_ID = VKEXTENSIONPROPERTIES_ID;

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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkExtensionProperties(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field extensionName	[string]<br>
	 * Prototype: char[]  extensionName
	 * 
	 * @param extensionName - a instance of String.
	 * @return this VkStruct instance.
	 */ 
	 public VkExtensionProperties extensionName(String extensionName){
		 this.extensionName = extensionName;
		  this.extensionName = (extensionName == null) ? null 
		                     : (extensionName.length() + 1) < VK_MAX_EXTENSION_NAME_SIZE ? extensionName
		                         : extensionName.substring(0, VK_MAX_EXTENSION_NAME_SIZE - 1).trim();
		 setExtensionName0(this.ptr,  extensionName);
		 return this;
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
	 * 
	 * @param specVersion - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkExtensionProperties specVersion(int specVersion){
		 this.specVersion = specVersion;
		 setSpecVersion0(this.ptr,  specVersion);
		 return this;
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


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkExtensionProperties [ ")
				.append("extensionName: ").append(extensionName() )
				.append(",\n specVersion: ")
				.append(specVersion() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field extensionName	[string]<br>
	 * Prototype: char[]  extensionName
	 */ 
	 private static native void setExtensionName0(Buffer ptr, String _extensionName);/*
		  VkExtensionProperties* vkObj = (VkExtensionProperties*)(ptr);
		  strncpy(vkObj->extensionName, _extensionName, strlen(_extensionName)+1);
	  */

	/**
	 * Native GET method for field extensionName	[string]<br>
	 * Prototype: char[]  extensionName
	 */ 
	 private static native String getExtensionName0(Buffer ptr);/*
		  VkExtensionProperties* vkObj = (VkExtensionProperties*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->extensionName));
	 */

	/**
	 * Native SET method for field specVersion	[int]<br>
	 * Prototype: uint32_t  specVersion
	 */ 
	 private static native void setSpecVersion0(Buffer ptr, int _specVersion);/*
		  VkExtensionProperties* vkObj = (VkExtensionProperties*)(ptr);
		 // code for simple past value 
		  vkObj->specVersion = (uint32_t) (_specVersion);
	  */

	/**
	 * Native GET method for field specVersion	[int]<br>
	 * Prototype: uint32_t  specVersion
	 */ 
	 private static native int getSpecVersion0(Buffer ptr);/*
		  VkExtensionProperties* vkObj = (VkExtensionProperties*)(ptr);
		  return (jint) (vkObj->specVersion);
	 */



} // end of class VkExtensionProperties
