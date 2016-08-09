/**
 * Class wrapping Vulkan's VkLayerProperties struct.
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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkLayerProperties extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [18]  */
	 private static final String TAG = "VkLayerProperties";

	/** ID of this structure [18]  */
	 public static final int TAG_ID = VKLAYERPROPERTIES_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkLayerProperties(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkLayerProperties(long address){ 
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
	 * Set method for field layerName	[string]<br>
	 * Prototype: char[]  layerName
	 * 
	 * @param layerName - a instance of String.
	 * @return this VkStruct instance.
	 */ 
	 public VkLayerProperties layerName(String layerName){
		 this.layerName = layerName;
		  this.layerName = (layerName == null) ? null 
		                     : (layerName.length() + 1) < VK_MAX_EXTENSION_NAME_SIZE ? layerName
		                         : layerName.substring(0, VK_MAX_EXTENSION_NAME_SIZE - 1).trim();
		 setLayerName0(this.ptr,  layerName);
		 return this;
	 }

	/**
	 * Get method for field layerName	[string]<br>
	 * Prototype: char[]  layerName
	 */ 
	 public String layerName(){
		 String var = getLayerName0(super.ptr);
		 this.layerName = var;
		 return this.layerName;
	 }

	/**
	 * Set method for field specVersion	[int]<br>
	 * Prototype: uint32_t  specVersion
	 * 
	 * @param specVersion - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkLayerProperties specVersion(int specVersion){
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

	/**
	 * Set method for field implementationVersion	[int]<br>
	 * Prototype: uint32_t  implementationVersion
	 * 
	 * @param implementationVersion - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkLayerProperties implementationVersion(int implementationVersion){
		 this.implementationVersion = implementationVersion;
		 setImplementationVersion0(this.ptr,  implementationVersion);
		 return this;
	 }

	/**
	 * Get method for field implementationVersion	[int]<br>
	 * Prototype: uint32_t  implementationVersion
	 */ 
	 public int implementationVersion(){
		 int var = getImplementationVersion0(super.ptr);
		 this.implementationVersion = var;
		 return this.implementationVersion;
	 }

	/**
	 * Set method for field description	[string]<br>
	 * Prototype: char[]  description
	 * 
	 * @param description - a instance of String.
	 * @return this VkStruct instance.
	 */ 
	 public VkLayerProperties description(String description){
		 this.description = description;
		  this.description = (description == null) ? null 
		                     : (description.length() + 1) < VK_MAX_DESCRIPTION_SIZE ? description
		                         : description.substring(0, VK_MAX_DESCRIPTION_SIZE - 1).trim();
		 setDescription0(this.ptr,  description);
		 return this;
	 }

	/**
	 * Get method for field description	[string]<br>
	 * Prototype: char[]  description
	 */ 
	 public String description(){
		 String var = getDescription0(super.ptr);
		 this.description = var;
		 return this.description;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkLayerProperties [ ")
				.append("layerName: ").append(layerName() )
				.append(",\n specVersion: ")
				.append(specVersion() )
				.append(",\n implementationVersion: ")
				.append(implementationVersion() )
				.append(",\n description: ")
				.append(description() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field layerName	[string]<br>
	 * Prototype: char[]  layerName
	 */ 
	 private static native void setLayerName0(Buffer ptr, String _layerName);/*
		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  strncpy(vkObj->layerName, _layerName, strlen(_layerName)+1);
	  */

	/**
	 * Native GET method for field layerName	[string]<br>
	 * Prototype: char[]  layerName
	 */ 
	 private static native String getLayerName0(Buffer ptr);/*
		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->layerName));
	 */

	/**
	 * Native SET method for field specVersion	[int]<br>
	 * Prototype: uint32_t  specVersion
	 */ 
	 private static native void setSpecVersion0(Buffer ptr, int _specVersion);/*
		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  vkObj->specVersion = (uint32_t) (_specVersion);
	  */

	/**
	 * Native GET method for field specVersion	[int]<br>
	 * Prototype: uint32_t  specVersion
	 */ 
	 private static native int getSpecVersion0(Buffer ptr);/*
		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  return (jint) (vkObj->specVersion);
	 */

	/**
	 * Native SET method for field implementationVersion	[int]<br>
	 * Prototype: uint32_t  implementationVersion
	 */ 
	 private static native void setImplementationVersion0(Buffer ptr, int _implementationVersion);/*
		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  vkObj->implementationVersion = (uint32_t) (_implementationVersion);
	  */

	/**
	 * Native GET method for field implementationVersion	[int]<br>
	 * Prototype: uint32_t  implementationVersion
	 */ 
	 private static native int getImplementationVersion0(Buffer ptr);/*
		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  return (jint) (vkObj->implementationVersion);
	 */

	/**
	 * Native SET method for field description	[string]<br>
	 * Prototype: char[]  description
	 */ 
	 private static native void setDescription0(Buffer ptr, String _description);/*
		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  strncpy(vkObj->description, _description, strlen(_description)+1);
	  */

	/**
	 * Native GET method for field description	[string]<br>
	 * Prototype: char[]  description
	 */ 
	 private static native String getDescription0(Buffer ptr);/*
		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->description));
	 */



} // end of class VkLayerProperties
