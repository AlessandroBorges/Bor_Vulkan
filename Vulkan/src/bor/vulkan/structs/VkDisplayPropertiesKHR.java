/**
 * Class wrapping Vulkan's VkDisplayPropertiesKHR struct.
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
 * @version Ver. 0.8.65 (beta) 
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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDisplayPropertiesKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	/** 
	 * Static method to create a VkArray for this VkStruct subclass.
	 * @param size - number of elements
	 */
	 public static VkArray<VkDisplayPropertiesKHR> createVkArray(int size){ 
		 VkDisplayPropertiesKHR[] array = new VkDisplayPropertiesKHR[size]; 
		 VkArrayStruct<VkDisplayPropertiesKHR> vkArray = new VkArrayStruct<VkDisplayPropertiesKHR> (array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field display	[vkhandle]<br>
	 * Prototype: VkDisplayKHR  display
	 * 
	 * @param display - a instance of VkDisplayKHR.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayPropertiesKHR display(VkDisplayKHR display){
		 this.display = display;
		 long handle = (display==null) ? 0L : display.getNativeHandle();
		 setDisplay0(this.ptr, handle);
		 return this;
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
		    ((VkHandle)this.display).setNativeHandle(handle);
		  }
		 return this.display;
	 }

	/**
	 * Set method for field displayName	[string]<br>
	 * Prototype: const char*  displayName
	 * 
	 * @param displayName - a instance of String.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayPropertiesKHR displayName(String displayName){
		 this.displayName = displayName;
		 setDisplayName0(this.ptr,  displayName);
		 return this;
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
	 * 
	 * @param physicalDimensions - a instance of VkExtent2D.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayPropertiesKHR physicalDimensions(VkExtent2D physicalDimensions){
		 this.physicalDimensions = physicalDimensions;
		 ByteBuffer buff = (physicalDimensions==null) ? null : physicalDimensions.getPointer();
		 setPhysicalDimensions0(this.ptr, buff);
		 return this;
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
	 * 
	 * @param physicalResolution - a instance of VkExtent2D.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayPropertiesKHR physicalResolution(VkExtent2D physicalResolution){
		 this.physicalResolution = physicalResolution;
		 ByteBuffer buff = (physicalResolution==null) ? null : physicalResolution.getPointer();
		 setPhysicalResolution0(this.ptr, buff);
		 return this;
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
	 * 
	 * @param supportedTransforms - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayPropertiesKHR supportedTransforms(int supportedTransforms){
		 this.supportedTransforms = supportedTransforms;
		 setSupportedTransforms0(this.ptr,  supportedTransforms);
		 return this;
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
	 * 
	 * @param planeReorderPossible - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayPropertiesKHR planeReorderPossible(boolean planeReorderPossible){
		 this.planeReorderPossible = planeReorderPossible;
		 setPlaneReorderPossible0(this.ptr,  planeReorderPossible);
		 return this;
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
	 * 
	 * @param persistentContent - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayPropertiesKHR persistentContent(boolean persistentContent){
		 this.persistentContent = persistentContent;
		 setPersistentContent0(this.ptr,  persistentContent);
		 return this;
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


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkDisplayPropertiesKHR [ ")
				.append("display: ").append(display() )
				.append(",\n displayName: ")
				.append(displayName() )
				.append(",\n physicalDimensions: ")
				.append(physicalDimensions() )
				.append(",\n physicalResolution: ")
				.append(physicalResolution() )
				.append(",\n supportedTransforms: ")
				.append(supportedTransforms() )
				.append(",\n planeReorderPossible: ")
				.append(planeReorderPossible() )
				.append(",\n persistentContent: ")
				.append(persistentContent() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field display	[vkhandle]<br>
	 * Prototype: VkDisplayKHR  display
	 */ 
	 private static native void setDisplay0(Buffer ptr, long  _display);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->display = (VkDisplayKHR) (_display);
	  */

	/**
	 * Native GET method for field display	[vkhandle]<br>
	 * Prototype: VkDisplayKHR  display
	 */ 
	 private static native long getDisplay0(Buffer ptr);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->display);
	 */

	/**
	 * Native SET method for field displayName	[string]<br>
	 * Prototype: const char*  displayName
	 */ 
	 private static native void setDisplayName0(Buffer ptr, String _displayName);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  vkObj->displayName = cloneStr(_displayName);
	  */

	/**
	 * Native GET method for field displayName	[string]<br>
	 * Prototype: const char*  displayName
	 */ 
	 private static native String getDisplayName0(Buffer ptr);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->displayName));
	 */

	/**
	 * Native SET method for field physicalDimensions	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalDimensions
	 */ 
	 private static native void setPhysicalDimensions0(Buffer ptr, java.nio.ByteBuffer  _physicalDimensions);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent2D* p_physicalDimensions = (VkExtent2D*) _physicalDimensions; 
		 vkObj->physicalDimensions = (*p_physicalDimensions); 
	  */

	/**
	 * Native GET method for field physicalDimensions	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalDimensions
	 */ 
	 private static native long getPhysicalDimensions0(Buffer ptr);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->physicalDimensions);
	 */

	/**
	 * Native SET method for field physicalResolution	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalResolution
	 */ 
	 private static native void setPhysicalResolution0(Buffer ptr, java.nio.ByteBuffer  _physicalResolution);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent2D* p_physicalResolution = (VkExtent2D*) _physicalResolution; 
		 vkObj->physicalResolution = (*p_physicalResolution); 
	  */

	/**
	 * Native GET method for field physicalResolution	[vkstruct]<br>
	 * Prototype: VkExtent2D  physicalResolution
	 */ 
	 private static native long getPhysicalResolution0(Buffer ptr);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->physicalResolution);
	 */

	/**
	 * Native SET method for field supportedTransforms	[int]<br>
	 * Prototype: VkSurfaceTransformFlagsKHR  supportedTransforms
	 */ 
	 private static native void setSupportedTransforms0(Buffer ptr, int _supportedTransforms);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->supportedTransforms = (VkSurfaceTransformFlagsKHR) (_supportedTransforms);
	  */

	/**
	 * Native GET method for field supportedTransforms	[int]<br>
	 * Prototype: VkSurfaceTransformFlagsKHR  supportedTransforms
	 */ 
	 private static native int getSupportedTransforms0(Buffer ptr);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  return (jint) (vkObj->supportedTransforms);
	 */

	/**
	 * Native SET method for field planeReorderPossible	[boolean]<br>
	 * Prototype: VkBool32  planeReorderPossible
	 */ 
	 private static native void setPlaneReorderPossible0(Buffer ptr, boolean  _planeReorderPossible);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->planeReorderPossible = (VkBool32) (_planeReorderPossible);
	  */

	/**
	 * Native GET method for field planeReorderPossible	[boolean]<br>
	 * Prototype: VkBool32  planeReorderPossible
	 */ 
	 private static native boolean  getPlaneReorderPossible0(Buffer ptr);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  return (jboolean) (vkObj->planeReorderPossible);
	 */

	/**
	 * Native SET method for field persistentContent	[boolean]<br>
	 * Prototype: VkBool32  persistentContent
	 */ 
	 private static native void setPersistentContent0(Buffer ptr, boolean  _persistentContent);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->persistentContent = (VkBool32) (_persistentContent);
	  */

	/**
	 * Native GET method for field persistentContent	[boolean]<br>
	 * Prototype: VkBool32  persistentContent
	 */ 
	 private static native boolean  getPersistentContent0(Buffer ptr);/*
		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  return (jboolean) (vkObj->persistentContent);
	 */



} // end of class VkDisplayPropertiesKHR
