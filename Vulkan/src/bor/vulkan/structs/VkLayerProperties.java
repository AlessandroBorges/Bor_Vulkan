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

import java.nio.Buffer;


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

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [18]  */
	 private static final String TAG = "VkLayerProperties";

	/** ID of this structure [18]  */
	 public static final int TAG_ID = VKLAYERPROPERTIES_ID;

	/** P wrapper for THIS object */
	 private  P<VkLayerProperties> p;

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
	 public VkLayerProperties(long address , int memSize){ 
		 super(address, memSize); 
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


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkLayerProperties> getP() {
	       if(p == null ){
	           p = new P<VkLayerProperties> (this);
	       }
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
		 setLayerName0(this.ptr,  layerName);
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
	 
	 /**
	  * Get API version
	  * @return String representation of Vulkan API 
	  */
	 public String specVersionString(){
	     int spec = specVersion();
	     return Vulkan.getAPIVersionString(spec);
	 }

	/**
	 * Set method for field implementationVersion	[int]<br>
	 * Prototype: uint32_t  implementationVersion
	 */ 
	 public void implementationVersion(int implementationVersion){
		 this.implementationVersion = implementationVersion;
		 setImplementationVersion0(this.ptr,  implementationVersion);
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
	 */ 
	 public void description(String description){
		 int len = 0;
		 if(description!= null){
		    description = description.substring(0,Vulkan.VK_MAX_DESCRIPTION_SIZE);
		    len = description.length();
		 }
		 this.description = description;
		 setDescription0(this.ptr,  description, len);
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
        builder.append("VkLayerProperties [layerName : ")
                .append(layerName())
                .append(",\n\t specVersion : ")
                .append(specVersion() + "  [" + this.specVersionString() +"]")
                .append(",\n\t implementationVersion : ")
                .append(implementationVersion())
                .append(",\n\t description : ")
                .append(description())
                .append("]\n");
        return builder.toString();
    }

    //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field layerName	[string]<br>
	 * Prototype: char[]  layerName
	 */ 
	 private static native void setLayerName0(Buffer ptr, String layerName);/*
		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  memcpy ( vkObj->layerName, layerName, strlen(layerName)+1 );
		  //vkObj->layerName = (char[]) (_layerName);
	  */

	/**
	 * native GET method for field layerName	[string]<br>
	 * Prototype: char[]  layerName
	 */ 
	 private static native String getLayerName0(Buffer ptr);/*
		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);		  
		  return (jstring)(env->NewStringUTF(vkObj->layerName));	 */

	/**
	 * native SET method for field specVersion	[int]<br>
	 * Prototype: uint32_t  specVersion
	 */ 
	 private static native void setSpecVersion0(Buffer ptr, int _specVersion);/*
		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  vkObj->specVersion = (uint32_t) (_specVersion);
	  */

	/**
	 * native GET method for field specVersion	[int]<br>
	 * Prototype: uint32_t  specVersion
	 */ 
	 private static native int getSpecVersion0(Buffer ptr);/*
		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  return (jint) (vkObj->specVersion);
	 */

	/**
	 * native SET method for field implementationVersion	[int]<br>
	 * Prototype: uint32_t  implementationVersion
	 */ 
	 private static native void setImplementationVersion0(Buffer ptr, int _implementationVersion);/*
		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  vkObj->implementationVersion = (uint32_t) (_implementationVersion);
	  */

	/**
	 * native GET method for field implementationVersion	[int]<br>
	 * Prototype: uint32_t  implementationVersion
	 */ 
	 private static native int getImplementationVersion0(Buffer ptr);/*
		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  return (jint) (vkObj->implementationVersion);
	 */

	/**
	 * native SET method for field description	[string]<br>
	 * Prototype: char[]  description
	 */ 
       private static native void setDescription0(Buffer ptr, String description, int len);/*MANUAL
	        unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);
                char* description = (char*)env->GetStringUTFChars(obj_description, 0);
                  
		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  strncpy(vkObj->description, description, len);                 
                  vkObj->description[len] = '\0';
		  
		//  vkObj->description = (char[]) (_description);
	  */

	/**
	 * native GET method for field description	[string]<br>
	 * Prototype: char[]  description
	 */ 
	 private static native String getDescription0(Buffer ptr);/*
		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->description));	 */



} // end of class VkLayerProperties
