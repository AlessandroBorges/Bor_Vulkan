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
	/** TAG of this structure [110]  */
	 private static final String TAG = "VkDisplayPropertiesKHR";

	/** ID of this structure [110]  */
	 public static final int TAG_ID = VKDISPLAYPROPERTIESKHR_ID;

	 // fields //
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
	 public VkDisplayPropertiesKHR(long address, int memSize){ 
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
	 public static P<VkDisplayPropertiesKHR> createNullPointer(){
	        P<VkDisplayPropertiesKHR> p = new  P<VkDisplayPropertiesKHR>(new VkDisplayPropertiesKHR());
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
		display0(super.ptr, display);
	 }

	/**
	 * get method for field display	[vkhandle]<br>
	 * Prototype: VkDisplayKHR  display
	 */ 
	 public VkDisplayKHR display(){
		 // return  this.display;
		 return display0(super.ptr);
	 }

	/**
	 * Set method for field displayName	[string]<br>
	 * Prototype: const char*  displayName
	 */ 
	 public void displayName(String displayName){
		 this.displayName = displayName;
		displayName0(super.ptr, displayName);
	 }

	/**
	 * get method for field displayName	[string]<br>
	 * Prototype: const char*  displayName
	 */ 
	 public String displayName(){
		 // return  this.displayName;
		 return displayName0(super.ptr);
	 }

	/**
	 * Set method for field physicalDimensions	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalDimensions
	 */ 
	 public void physicalDimensions(VkExtent2D physicalDimensions){
		 this.physicalDimensions = physicalDimensions;
		physicalDimensions0(super.ptr, physicalDimensions);
	 }

	/**
	 * get method for field physicalDimensions	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalDimensions
	 */ 
	 public VkExtent2D physicalDimensions(){
		 // return  this.physicalDimensions;
		 return physicalDimensions0(super.ptr);
	 }

	/**
	 * Set method for field physicalResolution	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalResolution
	 */ 
	 public void physicalResolution(VkExtent2D physicalResolution){
		 this.physicalResolution = physicalResolution;
		physicalResolution0(super.ptr, physicalResolution);
	 }

	/**
	 * get method for field physicalResolution	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalResolution
	 */ 
	 public VkExtent2D physicalResolution(){
		 // return  this.physicalResolution;
		 return physicalResolution0(super.ptr);
	 }

	/**
	 * Set method for field supportedTransforms	[int]<br>
	 * Prototype: VkSurfaceTransformFlagsKHR  supportedTransforms
	 */ 
	 public void supportedTransforms(int supportedTransforms){
		 this.supportedTransforms = supportedTransforms;
		supportedTransforms0(super.ptr, supportedTransforms);
	 }

	/**
	 * get method for field supportedTransforms	[int]<br>
	 * Prototype: VkSurfaceTransformFlagsKHR  supportedTransforms
	 */ 
	 public int supportedTransforms(){
		 // return  this.supportedTransforms;
		 return supportedTransforms0(super.ptr);
	 }

	/**
	 * Set method for field planeReorderPossible	[boolean]<br>
	 * Prototype: VkBool32  planeReorderPossible
	 */ 
	 public void planeReorderPossible(boolean planeReorderPossible){
		 this.planeReorderPossible = planeReorderPossible;
		planeReorderPossible0(super.ptr, planeReorderPossible);
	 }

	/**
	 * get method for field planeReorderPossible	[boolean]<br>
	 * Prototype: VkBool32  planeReorderPossible
	 */ 
	 public boolean planeReorderPossible(){
		 // return  this.planeReorderPossible;
		 return planeReorderPossible0(super.ptr);
	 }

	/**
	 * Set method for field persistentContent	[boolean]<br>
	 * Prototype: VkBool32  persistentContent
	 */ 
	 public void persistentContent(boolean persistentContent){
		 this.persistentContent = persistentContent;
		persistentContent0(super.ptr, persistentContent);
	 }

	/**
	 * get method for field persistentContent	[boolean]<br>
	 * Prototype: VkBool32  persistentContent
	 */ 
	 public boolean persistentContent(){
		 // return  this.persistentContent;
		 return persistentContent0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field display	[vkhandle]<br>
	 * Prototype: VkDisplayKHR  display
	 */ 
	 private static native void display0(ByteBuffer ptr, VkDisplayKHR _display);/*
		  VkDisplayPropertiesKHR _obj = (VkDisplayPropertiesKHR)(*ptr);
		  _obj.display = (VkDisplayKHR) (_display);
	  */

	/**
	 * native GET method for field display	[vkhandle]<br>
	 * Prototype: VkDisplayKHR  display
	 */ 
	 private static native VkDisplayKHR display0(ByteBuffer ptr);/*
		  VkDisplayPropertiesKHR _obj = (VkDisplayPropertiesKHR)(ptr);
		  return (VkDisplayKHR) (_obj.VkDisplayKHR);
	 */

	/**
	 * native SET method for field displayName	[string]<br>
	 * Prototype: const char*  displayName
	 */ 
	 private static native void displayName0(ByteBuffer ptr, String _displayName);/*
		  VkDisplayPropertiesKHR _obj = (VkDisplayPropertiesKHR)(*ptr);
		  _obj.displayName = (const char*) (_displayName);
	  */

	/**
	 * native GET method for field displayName	[string]<br>
	 * Prototype: const char*  displayName
	 */ 
	 private static native String displayName0(ByteBuffer ptr);/*
		  VkDisplayPropertiesKHR _obj = (VkDisplayPropertiesKHR)(ptr);
		  return (jstring)(env->NewStringUTF(_obj.const char*);	 */

	/**
	 * native SET method for field physicalDimensions	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalDimensions
	 */ 
	 private static native void physicalDimensions0(ByteBuffer ptr, VkExtent2D _physicalDimensions);/*
		  VkDisplayPropertiesKHR _obj = (VkDisplayPropertiesKHR)(*ptr);
		  _obj.physicalDimensions = (VkExtent2D) (_physicalDimensions);
	  */

	/**
	 * native GET method for field physicalDimensions	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalDimensions
	 */ 
	 private static native VkExtent2D physicalDimensions0(ByteBuffer ptr);/*
		  VkDisplayPropertiesKHR _obj = (VkDisplayPropertiesKHR)(ptr);
		  return (VkExtent2D) (_obj.VkExtent2D);
	 */

	/**
	 * native SET method for field physicalResolution	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalResolution
	 */ 
	 private static native void physicalResolution0(ByteBuffer ptr, VkExtent2D _physicalResolution);/*
		  VkDisplayPropertiesKHR _obj = (VkDisplayPropertiesKHR)(*ptr);
		  _obj.physicalResolution = (VkExtent2D) (_physicalResolution);
	  */

	/**
	 * native GET method for field physicalResolution	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalResolution
	 */ 
	 private static native VkExtent2D physicalResolution0(ByteBuffer ptr);/*
		  VkDisplayPropertiesKHR _obj = (VkDisplayPropertiesKHR)(ptr);
		  return (VkExtent2D) (_obj.VkExtent2D);
	 */

	/**
	 * native SET method for field supportedTransforms	[int]<br>
	 * Prototype: VkSurfaceTransformFlagsKHR  supportedTransforms
	 */ 
	 private static native void supportedTransforms0(ByteBuffer ptr, int _supportedTransforms);/*
		  VkDisplayPropertiesKHR _obj = (VkDisplayPropertiesKHR)(*ptr);
		  _obj.supportedTransforms = (VkSurfaceTransformFlagsKHR) (_supportedTransforms);
	  */

	/**
	 * native GET method for field supportedTransforms	[int]<br>
	 * Prototype: VkSurfaceTransformFlagsKHR  supportedTransforms
	 */ 
	 private static native int supportedTransforms0(ByteBuffer ptr);/*
		  VkDisplayPropertiesKHR _obj = (VkDisplayPropertiesKHR)(ptr);
		  return (jint) (_obj.VkSurfaceTransformFlagsKHR);
	 */

	/**
	 * native SET method for field planeReorderPossible	[boolean]<br>
	 * Prototype: VkBool32  planeReorderPossible
	 */ 
	 private static native void planeReorderPossible0(ByteBuffer ptr, boolean _planeReorderPossible);/*
		  VkDisplayPropertiesKHR _obj = (VkDisplayPropertiesKHR)(*ptr);
		  _obj.planeReorderPossible = (VkBool32) (_planeReorderPossible);
	  */

	/**
	 * native GET method for field planeReorderPossible	[boolean]<br>
	 * Prototype: VkBool32  planeReorderPossible
	 */ 
	 private static native boolean planeReorderPossible0(ByteBuffer ptr);/*
		  VkDisplayPropertiesKHR _obj = (VkDisplayPropertiesKHR)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field persistentContent	[boolean]<br>
	 * Prototype: VkBool32  persistentContent
	 */ 
	 private static native void persistentContent0(ByteBuffer ptr, boolean _persistentContent);/*
		  VkDisplayPropertiesKHR _obj = (VkDisplayPropertiesKHR)(*ptr);
		  _obj.persistentContent = (VkBool32) (_persistentContent);
	  */

	/**
	 * native GET method for field persistentContent	[boolean]<br>
	 * Prototype: VkBool32  persistentContent
	 */ 
	 private static native boolean persistentContent0(ByteBuffer ptr);/*
		  VkDisplayPropertiesKHR _obj = (VkDisplayPropertiesKHR)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */



} // end of class VkDisplayPropertiesKHR
