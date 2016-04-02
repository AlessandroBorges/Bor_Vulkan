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

import java.nio.Buffer;
import java.nio.ByteBuffer;

import bor.vulkan.P;
import bor.vulkan.VkHandle;
import bor.vulkan.khr.VkDisplayKHR;
import bor.vulkan.structs.VkExtent2D;
import bor.vulkan.structs.VkStruct;


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
		 ByteBuffer buff = (display==null) ? null : display.getHandle();
		 display0(this.ptr, buff);
	 }

	/**
	 * Get method for field display	[vkhandle]<br>
	 * Prototype: VkDisplayKHR  display
	 */ 
	 public VkDisplayKHR display(){

		 ByteBuffer handle = display0(super.ptr);
		 if(handle == null){
		    this.display = null;
		    return null;
		  } else 
 		 if(this.display == null){
		    this.display = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.display).setHandle(handle);
		  }
		 return this.display;
	 }

	/**
	 * Set method for field displayName	[string]<br>
	 * Prototype: const char*  displayName
	 */ 
	 public void displayName(String displayName){
		 this.displayName = displayName;
		 displayName0(this.ptr,  displayName);
	 }

	/**
	 * Get method for field displayName	[string]<br>
	 * Prototype: const char*  displayName
	 */ 
	 public String displayName(){
		 String var = displayName0(super.ptr);
		 this.displayName = var;
		 return this.displayName;
	 }

	/**
	 * Set method for field physicalDimensions	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalDimensions
	 */ 
	 public void physicalDimensions(VkExtent2D physicalDimensions){
		 this.physicalDimensions = physicalDimensions;
		 ByteBuffer buff = (physicalDimensions==null) ? null : physicalDimensions.getPointerStruct();
		 physicalDimensions0(this.ptr, buff);
	 }

	/**
	 * Get method for field physicalDimensions	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalDimensions
	 */ 
	 public VkExtent2D physicalDimensions(){
		 ByteBuffer pointer = physicalDimensions0(super.ptr);
		 if(pointer == null){
		    this.physicalDimensions = null;
		    return null;
		  } else 
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
		 ByteBuffer buff = (physicalResolution==null) ? null : physicalResolution.getPointerStruct();
		 physicalResolution0(this.ptr, buff);
	 }

	/**
	 * Get method for field physicalResolution	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalResolution
	 */ 
	 public VkExtent2D physicalResolution(){
		 ByteBuffer pointer = physicalResolution0(super.ptr);
		 if(pointer == null){
		    this.physicalResolution = null;
		    return null;
		  } else 
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
		 supportedTransforms0(this.ptr,  supportedTransforms);
	 }

	/**
	 * Get method for field supportedTransforms	[int]<br>
	 * Prototype: VkSurfaceTransformFlagsKHR  supportedTransforms
	 */ 
	 public int supportedTransforms(){
		 int var = supportedTransforms0(super.ptr);
		 this.supportedTransforms = var;
		 return this.supportedTransforms;
	 }

	/**
	 * Set method for field planeReorderPossible	[boolean]<br>
	 * Prototype: VkBool32  planeReorderPossible
	 */ 
	 public void planeReorderPossible(boolean planeReorderPossible){
		 this.planeReorderPossible = planeReorderPossible;
		 planeReorderPossible0(this.ptr,  planeReorderPossible);
	 }

	/**
	 * Get method for field planeReorderPossible	[boolean]<br>
	 * Prototype: VkBool32  planeReorderPossible
	 */ 
	 public boolean planeReorderPossible(){
		 boolean var = planeReorderPossible0(super.ptr);
		 this.planeReorderPossible = var;
		 return this.planeReorderPossible;
	 }

	/**
	 * Set method for field persistentContent	[boolean]<br>
	 * Prototype: VkBool32  persistentContent
	 */ 
	 public void persistentContent(boolean persistentContent){
		 this.persistentContent = persistentContent;
		 persistentContent0(this.ptr,  persistentContent);
	 }

	/**
	 * Get method for field persistentContent	[boolean]<br>
	 * Prototype: VkBool32  persistentContent
	 */ 
	 public boolean persistentContent(){
		 boolean var = persistentContent0(super.ptr);
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
	 private static native void display0(Buffer ptr, java.nio.ByteBuffer  _display);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  vkObj->display = (VkDisplayKHR) (_display);
	  */

	/**
	 * native GET method for field display	[vkhandle]<br>
	 * Prototype: VkDisplayKHR  display
	 */ 
	 private static native java.nio.ByteBuffer  display0(Buffer ptr);/*
		  VkDisplayPropertiesKHR vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  return (VkDisplayKHR) (vkObj->display);
	 */

	/**
	 * native SET method for field displayName	[string]<br>
	 * Prototype: const char*  displayName
	 */ 
	 private static native void displayName0(Buffer ptr, String _displayName);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  vkObj->displayName = (const char*) (_displayName);
	  */

	/**
	 * native GET method for field displayName	[string]<br>
	 * Prototype: const char*  displayName
	 */ 
	 private static native String displayName0(Buffer ptr);/*
		  VkDisplayPropertiesKHR vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->.displayName);	 */

	/**
	 * native SET method for field physicalDimensions	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalDimensions
	 */ 
	 private static native void physicalDimensions0(Buffer ptr, java.nio.ByteBuffer  _physicalDimensions);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  vkObj->physicalDimensions = (VkExtent2D) (_physicalDimensions);
	  */

	/**
	 * native GET method for field physicalDimensions	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalDimensions
	 */ 
	 private static native java.nio.ByteBuffer  physicalDimensions0(Buffer ptr);/*
		  VkDisplayPropertiesKHR vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  return (VkExtent2D) (vkObj->physicalDimensions);
	 */

	/**
	 * native SET method for field physicalResolution	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalResolution
	 */ 
	 private static native void physicalResolution0(Buffer ptr, java.nio.ByteBuffer  _physicalResolution);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  vkObj->physicalResolution = (VkExtent2D) (_physicalResolution);
	  */

	/**
	 * native GET method for field physicalResolution	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalResolution
	 */ 
	 private static native java.nio.ByteBuffer  physicalResolution0(Buffer ptr);/*
		  VkDisplayPropertiesKHR vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  return (VkExtent2D) (vkObj->physicalResolution);
	 */

	/**
	 * native SET method for field supportedTransforms	[int]<br>
	 * Prototype: VkSurfaceTransformFlagsKHR  supportedTransforms
	 */ 
	 private static native void supportedTransforms0(Buffer ptr, int _supportedTransforms);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  vkObj->supportedTransforms = (VkSurfaceTransformFlagsKHR) (_supportedTransforms);
	  */

	/**
	 * native GET method for field supportedTransforms	[int]<br>
	 * Prototype: VkSurfaceTransformFlagsKHR  supportedTransforms
	 */ 
	 private static native int supportedTransforms0(Buffer ptr);/*
		  VkDisplayPropertiesKHR vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  return (jint) (vkObj->supportedTransforms);
	 */

	/**
	 * native SET method for field planeReorderPossible	[boolean]<br>
	 * Prototype: VkBool32  planeReorderPossible
	 */ 
	 private static native void planeReorderPossible0(Buffer ptr, boolean _planeReorderPossible);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  vkObj->planeReorderPossible = (VkBool32) (_planeReorderPossible);
	  */

	/**
	 * native GET method for field planeReorderPossible	[boolean]<br>
	 * Prototype: VkBool32  planeReorderPossible
	 */ 
	 private static native boolean planeReorderPossible0(Buffer ptr);/*
		  VkDisplayPropertiesKHR vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  return (jboolean) (vkObj->planeReorderPossible);
	 */

	/**
	 * native SET method for field persistentContent	[boolean]<br>
	 * Prototype: VkBool32  persistentContent
	 */ 
	 private static native void persistentContent0(Buffer ptr, boolean _persistentContent);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  vkObj->persistentContent = (VkBool32) (_persistentContent);
	  */

	/**
	 * native GET method for field persistentContent	[boolean]<br>
	 * Prototype: VkBool32  persistentContent
	 */ 
	 private static native boolean persistentContent0(Buffer ptr);/*
		  VkDisplayPropertiesKHR vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  return (jboolean) (vkObj->persistentContent);
	 */



} // end of class VkDisplayPropertiesKHR
