/**
 * Class wrapping Vulkan's VkDisplayPropertiesKHR struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.01 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.khr.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.*;
import bor.vulkan.khr.*;
import java.nio.ByteBuffer;

import java.nio.Buffer;


/**
 *  Project Bor-Vulkan 
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkDisplayPropertiesKHR. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDisplayPropertiesKHR {
 *     VkDisplayKHR                  display;
 *     const char*                   displayName;
 *     VkExtent2D                    physicalDimensions;
 *     VkExtent2D                    physicalResolution;
 *     VkSurfaceTransformFlagsKHR    supportedTransforms;
 *     VkBool32                      planeReorderPossible;
 *     VkBool32                      persistentContent;
 * } VkDisplayPropertiesKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkDisplayPropertiesKHR extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [110]  */
	 private static final String TAG = "VkDisplayPropertiesKHR";

	/** ID of this structure [110]  */
	 public static final int TAG_ID = VKDISPLAYPROPERTIESKHR_ID;

	/** P wrapper for THIS object */
	 private  P<VkDisplayPropertiesKHR> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkDisplayKHR 	display	[vkhandle]
	 */ 
	 VkDisplayKHR 	display;

	/**
	 *  const char* 	displayName	[string]
	 */ 
	 String 	displayName;

	/**
	 *  VkExtent2D 	physicalDimensions	[vkstruct]
	 */ 
	 VkExtent2D 	physicalDimensions;

	/**
	 *  VkExtent2D 	physicalResolution	[vkstruct]
	 */ 
	 VkExtent2D 	physicalResolution;

	/**
	 *  VkSurfaceTransformFlagsKHR 	supportedTransforms	[int]
	 */ 
	 int 	supportedTransforms;

	/**
	 *  VkBool32 	planeReorderPossible	[boolean]
	 */ 
	 boolean 	planeReorderPossible;

	/**
	 *  VkBool32 	persistentContent	[boolean]
	 */ 
	 boolean 	persistentContent;

	/**
	 * Ctor
	 */
	public VkDisplayPropertiesKHR(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDisplayPropertiesKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkDisplayPropertiesKHR(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDisplayPropertiesKHR(long address){ 
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
	 public static P<VkDisplayPropertiesKHR> createNullPointer(){
	        P<VkDisplayPropertiesKHR> p = new  P<VkDisplayPropertiesKHR>(new VkDisplayPropertiesKHR());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkDisplayPropertiesKHR> getP() {
	       if(p == null ){
	           p = new P<VkDisplayPropertiesKHR> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field display	[vkhandle]<br>
	 * Prototype: VkDisplayKHR  display
	 */ 
	 public void display(VkDisplayKHR display){
		 this.display = display;
		 ByteBuffer buff = (display==null) ? null : display.getPointer();
		 setDisplay0(this.ptr, buff);
	 }

	/**
	 * Get method for field display	[vkhandle]<br>
	 * Prototype: VkDisplayKHR  display
	 */ 
	 public VkDisplayKHR display(){

		 long handle = getDisplay0(super.ptr);
		 if(handle == 0){
		    this.display = null;
		    return null;
		  }  

		 if(this.display == null){
		    this.display = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.display).setPointer(handle);
		  }
		 return this.display;
	 }

	/**
	 * Set method for field displayName	[string]<br>
	 * Prototype: const char*  displayName
	 */ 
	 public void displayName(String displayName){
		 this.displayName = displayName;
		 setDisplayName0(this.ptr,  displayName);
	 }

	/**
	 * Get method for field displayName	[string]<br>
	 * Prototype: const char*  displayName
	 */ 
	 public String displayName(){
		 String var = getDisplayName0(super.ptr);
		 this.displayName = var;
		 return this.displayName;
	 }

	/**
	 * Set method for field physicalDimensions	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalDimensions
	 */ 
	 public void physicalDimensions(VkExtent2D physicalDimensions){
		 this.physicalDimensions = physicalDimensions;
		 ByteBuffer buff = (physicalDimensions==null) ? null : physicalDimensions.getPointer();
		 setPhysicalDimensions0(this.ptr, buff);
	 }

	/**
	 * Get method for field physicalDimensions	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalDimensions
	 */ 
	 public VkExtent2D physicalDimensions(){
		 long pointer = getPhysicalDimensions0(super.ptr);
		 if(pointer == 0){
		    this.physicalDimensions = null;
		    return null;
		  } 

		 if(this.physicalDimensions == null){
		    this.physicalDimensions = new VkExtent2D(pointer);
		 }else{
		    this.physicalDimensions.setPointer(pointer);
		  }
		 return this.physicalDimensions;
	 }

	/**
	 * Set method for field physicalResolution	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalResolution
	 */ 
	 public void physicalResolution(VkExtent2D physicalResolution){
		 this.physicalResolution = physicalResolution;
		 ByteBuffer buff = (physicalResolution==null) ? null : physicalResolution.getPointer();
		 setPhysicalResolution0(this.ptr, buff);
	 }

	/**
	 * Get method for field physicalResolution	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalResolution
	 */ 
	 public VkExtent2D physicalResolution(){
		 long pointer = getPhysicalResolution0(super.ptr);
		 if(pointer == 0){
		    this.physicalResolution = null;
		    return null;
		  } 

		 if(this.physicalResolution == null){
		    this.physicalResolution = new VkExtent2D(pointer);
		 }else{
		    this.physicalResolution.setPointer(pointer);
		  }
		 return this.physicalResolution;
	 }

	/**
	 * Set method for field supportedTransforms	[int]<br>
	 * Prototype: VkSurfaceTransformFlagsKHR  supportedTransforms
	 */ 
	 public void supportedTransforms(int supportedTransforms){
		 this.supportedTransforms = supportedTransforms;
		 setSupportedTransforms0(this.ptr,  supportedTransforms);
	 }

	/**
	 * Get method for field supportedTransforms	[int]<br>
	 * Prototype: VkSurfaceTransformFlagsKHR  supportedTransforms
	 */ 
	 public int supportedTransforms(){
		 int var = getSupportedTransforms0(super.ptr);
		 this.supportedTransforms = var;
		 return this.supportedTransforms;
	 }

	/**
	 * Set method for field planeReorderPossible	[boolean]<br>
	 * Prototype: VkBool32  planeReorderPossible
	 */ 
	 public void planeReorderPossible(boolean planeReorderPossible){
		 this.planeReorderPossible = planeReorderPossible;
		 setPlaneReorderPossible0(this.ptr,  planeReorderPossible);
	 }

	/**
	 * Get method for field planeReorderPossible	[boolean]<br>
	 * Prototype: VkBool32  planeReorderPossible
	 */ 
	 public boolean planeReorderPossible(){
		 boolean var = getPlaneReorderPossible0(super.ptr);
		 this.planeReorderPossible = var;
		 return this.planeReorderPossible;
	 }

	/**
	 * Set method for field persistentContent	[boolean]<br>
	 * Prototype: VkBool32  persistentContent
	 */ 
	 public void persistentContent(boolean persistentContent){
		 this.persistentContent = persistentContent;
		 setPersistentContent0(this.ptr,  persistentContent);
	 }

	/**
	 * Get method for field persistentContent	[boolean]<br>
	 * Prototype: VkBool32  persistentContent
	 */ 
	 public boolean persistentContent(){
		 boolean var = getPersistentContent0(super.ptr);
		 this.persistentContent = var;
		 return this.persistentContent;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field display	[vkhandle]<br>
	 * Prototype: VkDisplayKHR  display
	 */ 
	 private static native void setDisplay0(Buffer ptr, java.nio.ByteBuffer  _display);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  vkObj->display = (VkDisplayKHR) (_display);
	  */

	/**
	 * native GET method for field display	[vkhandle]<br>
	 * Prototype: VkDisplayKHR  display
	 */ 
	 private static native long getDisplay0(Buffer ptr);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->display);	 */

	/**
	 * native SET method for field displayName	[string]<br>
	 * Prototype: const char*  displayName
	 */ 
	 private static native void setDisplayName0(Buffer ptr, String _displayName);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  vkObj->displayName = (const char*) (_displayName);
	  */

	/**
	 * native GET method for field displayName	[string]<br>
	 * Prototype: const char*  displayName
	 */ 
	 private static native String getDisplayName0(Buffer ptr);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->displayName));	 */

	/**
	 * native SET method for field physicalDimensions	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalDimensions
	 */ 
	 private static native void setPhysicalDimensions0(Buffer ptr, java.nio.ByteBuffer  _physicalDimensions);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  vkObj->physicalDimensions = (VkExtent2D) (_physicalDimensions);
	  */

	/**
	 * native GET method for field physicalDimensions	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalDimensions
	 */ 
	 private static native long getPhysicalDimensions0(Buffer ptr);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->physicalDimensions);	 */

	/**
	 * native SET method for field physicalResolution	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalResolution
	 */ 
	 private static native void setPhysicalResolution0(Buffer ptr, java.nio.ByteBuffer  _physicalResolution);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  vkObj->physicalResolution = (VkExtent2D) (_physicalResolution);
	  */

	/**
	 * native GET method for field physicalResolution	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalResolution
	 */ 
	 private static native long getPhysicalResolution0(Buffer ptr);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->physicalResolution);	 */

	/**
	 * native SET method for field supportedTransforms	[int]<br>
	 * Prototype: VkSurfaceTransformFlagsKHR  supportedTransforms
	 */ 
	 private static native void setSupportedTransforms0(Buffer ptr, int _supportedTransforms);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  vkObj->supportedTransforms = (VkSurfaceTransformFlagsKHR) (_supportedTransforms);
	  */

	/**
	 * native GET method for field supportedTransforms	[int]<br>
	 * Prototype: VkSurfaceTransformFlagsKHR  supportedTransforms
	 */ 
	 private static native int getSupportedTransforms0(Buffer ptr);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  return (jint) (vkObj->supportedTransforms);
	 */

	/**
	 * native SET method for field planeReorderPossible	[boolean]<br>
	 * Prototype: VkBool32  planeReorderPossible
	 */ 
	 private static native void setPlaneReorderPossible0(Buffer ptr, boolean _planeReorderPossible);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  vkObj->planeReorderPossible = (VkBool32) (_planeReorderPossible);
	  */

	/**
	 * native GET method for field planeReorderPossible	[boolean]<br>
	 * Prototype: VkBool32  planeReorderPossible
	 */ 
	 private static native boolean getPlaneReorderPossible0(Buffer ptr);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  return (jboolean) (vkObj->planeReorderPossible);
	 */

	/**
	 * native SET method for field persistentContent	[boolean]<br>
	 * Prototype: VkBool32  persistentContent
	 */ 
	 private static native void setPersistentContent0(Buffer ptr, boolean _persistentContent);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  vkObj->persistentContent = (VkBool32) (_persistentContent);
	  */

	/**
	 * native GET method for field persistentContent	[boolean]<br>
	 * Prototype: VkBool32  persistentContent
	 */ 
	 private static native boolean getPersistentContent0(Buffer ptr);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  return (jboolean) (vkObj->persistentContent);
	 */



} // end of class VkDisplayPropertiesKHR
