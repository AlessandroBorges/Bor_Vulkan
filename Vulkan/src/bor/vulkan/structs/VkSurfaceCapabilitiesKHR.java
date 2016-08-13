/**
 * Class wrapping Vulkan's VkSurfaceCapabilitiesKHR struct.
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
 *  This class is a Java front end for struct VkSurfaceCapabilitiesKHR. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSurfaceCapabilitiesKHR {
 *     uint32_t                         minImageCount;
 *     uint32_t                         maxImageCount;
 *     VkExtent2D                       currentExtent;
 *     VkExtent2D                       minImageExtent;
 *     VkExtent2D                       maxImageExtent;
 *     uint32_t                         maxImageArrayLayers;
 *     VkSurfaceTransformFlagsKHR       supportedTransforms;
 *     VkSurfaceTransformFlagBitsKHR    currentTransform;
 *     VkCompositeAlphaFlagsKHR         supportedCompositeAlpha;
 *     VkImageUsageFlags                supportedUsageFlags;
 * } VkSurfaceCapabilitiesKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkSurfaceCapabilitiesKHR extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [106]  */
	 private static final String TAG = "VkSurfaceCapabilitiesKHR";

	/** ID of this structure [106]  */
	 public static final int TAG_ID = VKSURFACECAPABILITIESKHR_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  uint32_t 	minImageCount	[int]
	 */ 
	int 	minImageCount;
	
	/**
	 *  uint32_t 	maxImageCount	[int]
	 */ 
	int 	maxImageCount;
	
	/**
	 *  VkExtent2D 	currentExtent	[vkstruct]
	 */ 
	VkExtent2D 	currentExtent;
	
	/**
	 *  VkExtent2D 	minImageExtent	[vkstruct]
	 */ 
	VkExtent2D 	minImageExtent;
	
	/**
	 *  VkExtent2D 	maxImageExtent	[vkstruct]
	 */ 
	VkExtent2D 	maxImageExtent;
	
	/**
	 *  uint32_t 	maxImageArrayLayers	[int]
	 */ 
	int 	maxImageArrayLayers;
	
	/**
	 *  VkSurfaceTransformFlagsKHR 	supportedTransforms	[int]
	 */ 
	int 	supportedTransforms;
	
	/**
	 *  VkSurfaceTransformFlagBitsKHR 	currentTransform	[vkenum]
	 */ 
	VkSurfaceTransformFlagBitsKHR 	currentTransform;
	
	/**
	 *  VkCompositeAlphaFlagsKHR 	supportedCompositeAlpha	[int]
	 */ 
	int 	supportedCompositeAlpha;
	
	/**
	 *  VkImageUsageFlags 	supportedUsageFlags	[int]
	 */ 
	int 	supportedUsageFlags;
	/**
	 * Ctor
	 */
	public VkSurfaceCapabilitiesKHR(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSurfaceCapabilitiesKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkSurfaceCapabilitiesKHR(long address){ 
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
	 * Set method for field minImageCount	[int]<br>
	 * Prototype: uint32_t  minImageCount
	 * 
	 * @param minImageCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSurfaceCapabilitiesKHR minImageCount(int minImageCount){
		 this.minImageCount = minImageCount;
		 setMinImageCount0(this.ptr,  minImageCount);
		 return this;
	 }

	/**
	 * Get method for field minImageCount	[int]<br>
	 * Prototype: uint32_t  minImageCount
	 */ 
	 public int minImageCount(){
		 int var = getMinImageCount0(super.ptr);
		 this.minImageCount = var;
		 return this.minImageCount;
	 }

	/**
	 * Set method for field maxImageCount	[int]<br>
	 * Prototype: uint32_t  maxImageCount
	 * 
	 * @param maxImageCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSurfaceCapabilitiesKHR maxImageCount(int maxImageCount){
		 this.maxImageCount = maxImageCount;
		 setMaxImageCount0(this.ptr,  maxImageCount);
		 return this;
	 }

	/**
	 * Get method for field maxImageCount	[int]<br>
	 * Prototype: uint32_t  maxImageCount
	 */ 
	 public int maxImageCount(){
		 int var = getMaxImageCount0(super.ptr);
		 this.maxImageCount = var;
		 return this.maxImageCount;
	 }

	/**
	 * Set method for field currentExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  currentExtent
	 * 
	 * @param currentExtent - a instance of VkExtent2D.
	 * @return this VkStruct instance.
	 */ 
	 public VkSurfaceCapabilitiesKHR currentExtent(VkExtent2D currentExtent){
		 this.currentExtent = currentExtent;
		 ByteBuffer buff = (currentExtent==null) ? null : currentExtent.getPointer();
		 setCurrentExtent0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field currentExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  currentExtent
	 */ 
	 public VkExtent2D currentExtent(){
		 long pointer = getCurrentExtent0(super.ptr);
		 if(pointer == 0){
		    this.currentExtent = null;
		    return null;
		  } 

		 if(this.currentExtent == null){
		    this.currentExtent = new VkExtent2D(pointer);
		 }else{
		    this.currentExtent.setPointer(pointer);
		  }
		 return this.currentExtent;
	 }

	/**
	 * Set method for field minImageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  minImageExtent
	 * 
	 * @param minImageExtent - a instance of VkExtent2D.
	 * @return this VkStruct instance.
	 */ 
	 public VkSurfaceCapabilitiesKHR minImageExtent(VkExtent2D minImageExtent){
		 this.minImageExtent = minImageExtent;
		 ByteBuffer buff = (minImageExtent==null) ? null : minImageExtent.getPointer();
		 setMinImageExtent0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field minImageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  minImageExtent
	 */ 
	 public VkExtent2D minImageExtent(){
		 long pointer = getMinImageExtent0(super.ptr);
		 if(pointer == 0){
		    this.minImageExtent = null;
		    return null;
		  } 

		 if(this.minImageExtent == null){
		    this.minImageExtent = new VkExtent2D(pointer);
		 }else{
		    this.minImageExtent.setPointer(pointer);
		  }
		 return this.minImageExtent;
	 }

	/**
	 * Set method for field maxImageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  maxImageExtent
	 * 
	 * @param maxImageExtent - a instance of VkExtent2D.
	 * @return this VkStruct instance.
	 */ 
	 public VkSurfaceCapabilitiesKHR maxImageExtent(VkExtent2D maxImageExtent){
		 this.maxImageExtent = maxImageExtent;
		 ByteBuffer buff = (maxImageExtent==null) ? null : maxImageExtent.getPointer();
		 setMaxImageExtent0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field maxImageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  maxImageExtent
	 */ 
	 public VkExtent2D maxImageExtent(){
		 long pointer = getMaxImageExtent0(super.ptr);
		 if(pointer == 0){
		    this.maxImageExtent = null;
		    return null;
		  } 

		 if(this.maxImageExtent == null){
		    this.maxImageExtent = new VkExtent2D(pointer);
		 }else{
		    this.maxImageExtent.setPointer(pointer);
		  }
		 return this.maxImageExtent;
	 }

	/**
	 * Set method for field maxImageArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxImageArrayLayers
	 * 
	 * @param maxImageArrayLayers - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSurfaceCapabilitiesKHR maxImageArrayLayers(int maxImageArrayLayers){
		 this.maxImageArrayLayers = maxImageArrayLayers;
		 setMaxImageArrayLayers0(this.ptr,  maxImageArrayLayers);
		 return this;
	 }

	/**
	 * Get method for field maxImageArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxImageArrayLayers
	 */ 
	 public int maxImageArrayLayers(){
		 int var = getMaxImageArrayLayers0(super.ptr);
		 this.maxImageArrayLayers = var;
		 return this.maxImageArrayLayers;
	 }

	/**
	 * Set method for field supportedTransforms	[int]<br>
	 * Prototype: VkSurfaceTransformFlagsKHR  supportedTransforms
	 * 
	 * @param supportedTransforms - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSurfaceCapabilitiesKHR supportedTransforms(int supportedTransforms){
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
	 * Set method for field currentTransform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  currentTransform
	 * 
	 * @param currentTransform - a instance of VkSurfaceTransformFlagBitsKHR.
	 * @return this VkStruct instance.
	 */ 
	 public VkSurfaceCapabilitiesKHR currentTransform(VkSurfaceTransformFlagBitsKHR currentTransform){
		 this.currentTransform = currentTransform;
		 int enumVal = currentTransform.getValue();
		 setCurrentTransform0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field currentTransform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  currentTransform
	 */ 
	 public VkSurfaceTransformFlagBitsKHR currentTransform(){
		 int nativeVal = getCurrentTransform0(super.ptr);
		 this.currentTransform = VkSurfaceTransformFlagBitsKHR.fromValue(nativeVal); 
		 return this.currentTransform;
	 }

	/**
	 * Set method for field supportedCompositeAlpha	[int]<br>
	 * Prototype: VkCompositeAlphaFlagsKHR  supportedCompositeAlpha
	 * 
	 * @param supportedCompositeAlpha - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSurfaceCapabilitiesKHR supportedCompositeAlpha(int supportedCompositeAlpha){
		 this.supportedCompositeAlpha = supportedCompositeAlpha;
		 setSupportedCompositeAlpha0(this.ptr,  supportedCompositeAlpha);
		 return this;
	 }

	/**
	 * Get method for field supportedCompositeAlpha	[int]<br>
	 * Prototype: VkCompositeAlphaFlagsKHR  supportedCompositeAlpha
	 */ 
	 public int supportedCompositeAlpha(){
		 int var = getSupportedCompositeAlpha0(super.ptr);
		 this.supportedCompositeAlpha = var;
		 return this.supportedCompositeAlpha;
	 }

	/**
	 * Set method for field supportedUsageFlags	[int]<br>
	 * Prototype: VkImageUsageFlags  supportedUsageFlags
	 * 
	 * @param supportedUsageFlags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSurfaceCapabilitiesKHR supportedUsageFlags(int supportedUsageFlags){
		 this.supportedUsageFlags = supportedUsageFlags;
		 setSupportedUsageFlags0(this.ptr,  supportedUsageFlags);
		 return this;
	 }

	/**
	 * Get method for field supportedUsageFlags	[int]<br>
	 * Prototype: VkImageUsageFlags  supportedUsageFlags
	 */ 
	 public int supportedUsageFlags(){
		 int var = getSupportedUsageFlags0(super.ptr);
		 this.supportedUsageFlags = var;
		 return this.supportedUsageFlags;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkSurfaceCapabilitiesKHR [ ")
				.append("minImageCount: ").append(minImageCount() )
				.append(",\n maxImageCount: ")
				.append(maxImageCount() )
				.append(",\n currentExtent: ")
				.append(currentExtent() )
				.append(",\n minImageExtent: ")
				.append(minImageExtent() )
				.append(",\n maxImageExtent: ")
				.append(maxImageExtent() )
				.append(",\n maxImageArrayLayers: ")
				.append(maxImageArrayLayers() )
				.append(",\n supportedTransforms: ")
				.append(supportedTransforms() )
				.append(",\n currentTransform: ")
				.append(currentTransform() )
				.append(",\n supportedCompositeAlpha: ")
				.append(supportedCompositeAlpha() )
				.append(",\n supportedUsageFlags: ")
				.append(supportedUsageFlags() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field minImageCount	[int]<br>
	 * Prototype: uint32_t  minImageCount
	 */ 
	 private static native void setMinImageCount0(Buffer ptr, int _minImageCount);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->minImageCount = (uint32_t) (_minImageCount);
	  */

	/**
	 * Native GET method for field minImageCount	[int]<br>
	 * Prototype: uint32_t  minImageCount
	 */ 
	 private static native int getMinImageCount0(Buffer ptr);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  return (jint) (vkObj->minImageCount);
	 */

	/**
	 * Native SET method for field maxImageCount	[int]<br>
	 * Prototype: uint32_t  maxImageCount
	 */ 
	 private static native void setMaxImageCount0(Buffer ptr, int _maxImageCount);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->maxImageCount = (uint32_t) (_maxImageCount);
	  */

	/**
	 * Native GET method for field maxImageCount	[int]<br>
	 * Prototype: uint32_t  maxImageCount
	 */ 
	 private static native int getMaxImageCount0(Buffer ptr);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  return (jint) (vkObj->maxImageCount);
	 */

	/**
	 * Native SET method for field currentExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  currentExtent
	 */ 
	 private static native void setCurrentExtent0(Buffer ptr, java.nio.ByteBuffer  _currentExtent);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent2D* p_currentExtent = (VkExtent2D*) _currentExtent; 
		 vkObj->currentExtent = (*p_currentExtent); 
	  */

	/**
	 * Native GET method for field currentExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  currentExtent
	 */ 
	 private static native long getCurrentExtent0(Buffer ptr);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->currentExtent);
	 */

	/**
	 * Native SET method for field minImageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  minImageExtent
	 */ 
	 private static native void setMinImageExtent0(Buffer ptr, java.nio.ByteBuffer  _minImageExtent);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent2D* p_minImageExtent = (VkExtent2D*) _minImageExtent; 
		 vkObj->minImageExtent = (*p_minImageExtent); 
	  */

	/**
	 * Native GET method for field minImageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  minImageExtent
	 */ 
	 private static native long getMinImageExtent0(Buffer ptr);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->minImageExtent);
	 */

	/**
	 * Native SET method for field maxImageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  maxImageExtent
	 */ 
	 private static native void setMaxImageExtent0(Buffer ptr, java.nio.ByteBuffer  _maxImageExtent);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent2D* p_maxImageExtent = (VkExtent2D*) _maxImageExtent; 
		 vkObj->maxImageExtent = (*p_maxImageExtent); 
	  */

	/**
	 * Native GET method for field maxImageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  maxImageExtent
	 */ 
	 private static native long getMaxImageExtent0(Buffer ptr);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->maxImageExtent);
	 */

	/**
	 * Native SET method for field maxImageArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxImageArrayLayers
	 */ 
	 private static native void setMaxImageArrayLayers0(Buffer ptr, int _maxImageArrayLayers);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->maxImageArrayLayers = (uint32_t) (_maxImageArrayLayers);
	  */

	/**
	 * Native GET method for field maxImageArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxImageArrayLayers
	 */ 
	 private static native int getMaxImageArrayLayers0(Buffer ptr);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  return (jint) (vkObj->maxImageArrayLayers);
	 */

	/**
	 * Native SET method for field supportedTransforms	[int]<br>
	 * Prototype: VkSurfaceTransformFlagsKHR  supportedTransforms
	 */ 
	 private static native void setSupportedTransforms0(Buffer ptr, int _supportedTransforms);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->supportedTransforms = (VkSurfaceTransformFlagsKHR) (_supportedTransforms);
	  */

	/**
	 * Native GET method for field supportedTransforms	[int]<br>
	 * Prototype: VkSurfaceTransformFlagsKHR  supportedTransforms
	 */ 
	 private static native int getSupportedTransforms0(Buffer ptr);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  return (jint) (vkObj->supportedTransforms);
	 */

	/**
	 * Native SET method for field currentTransform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  currentTransform
	 */ 
	 private static native void setCurrentTransform0(Buffer ptr, int  _currentTransform);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->currentTransform = (VkSurfaceTransformFlagBitsKHR) (_currentTransform);
	  */

	/**
	 * Native GET method for field currentTransform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  currentTransform
	 */ 
	 private static native int getCurrentTransform0(Buffer ptr);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->currentTransform);
	 */

	/**
	 * Native SET method for field supportedCompositeAlpha	[int]<br>
	 * Prototype: VkCompositeAlphaFlagsKHR  supportedCompositeAlpha
	 */ 
	 private static native void setSupportedCompositeAlpha0(Buffer ptr, int _supportedCompositeAlpha);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->supportedCompositeAlpha = (VkCompositeAlphaFlagsKHR) (_supportedCompositeAlpha);
	  */

	/**
	 * Native GET method for field supportedCompositeAlpha	[int]<br>
	 * Prototype: VkCompositeAlphaFlagsKHR  supportedCompositeAlpha
	 */ 
	 private static native int getSupportedCompositeAlpha0(Buffer ptr);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  return (jint) (vkObj->supportedCompositeAlpha);
	 */

	/**
	 * Native SET method for field supportedUsageFlags	[int]<br>
	 * Prototype: VkImageUsageFlags  supportedUsageFlags
	 */ 
	 private static native void setSupportedUsageFlags0(Buffer ptr, int _supportedUsageFlags);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->supportedUsageFlags = (VkImageUsageFlags) (_supportedUsageFlags);
	  */

	/**
	 * Native GET method for field supportedUsageFlags	[int]<br>
	 * Prototype: VkImageUsageFlags  supportedUsageFlags
	 */ 
	 private static native int getSupportedUsageFlags0(Buffer ptr);/*
		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  return (jint) (vkObj->supportedUsageFlags);
	 */



} // end of class VkSurfaceCapabilitiesKHR
