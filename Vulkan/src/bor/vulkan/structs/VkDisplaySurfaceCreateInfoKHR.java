/**
 * Class wrapping Vulkan's VkDisplaySurfaceCreateInfoKHR struct.
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
 *  This class is a Java front end for struct VkDisplaySurfaceCreateInfoKHR. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDisplaySurfaceCreateInfoKHR {
 *     VkStructureType                   sType;
 *     const void*                       pNext;
 *     VkDisplaySurfaceCreateFlagsKHR    flags;
 *     VkDisplayModeKHR                  displayMode;
 *     uint32_t                          planeIndex;
 *     uint32_t                          planeStackIndex;
 *     VkSurfaceTransformFlagBitsKHR     transform;
 *     float                             globalAlpha;
 *     VkDisplayPlaneAlphaFlagBitsKHR    alphaMode;
 *     VkExtent2D                        imageExtent;
 * } VkDisplaySurfaceCreateInfoKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkDisplaySurfaceCreateInfoKHR extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [116]  */
	 private static final String TAG = "VkDisplaySurfaceCreateInfoKHR";

	/** ID of this structure [116]  */
	 public static final int TAG_ID = VKDISPLAYSURFACECREATEINFOKHR_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkStructureType 	sType	[vkenum]
	 */ 
	VkStructureType 	sType;
	
	/**
	 *  const void* 	pNext	[vkobject]
	 */ 
	VkObject 	pNext;
	
	/**
	 *  VkDisplaySurfaceCreateFlagsKHR 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  VkDisplayModeKHR 	displayMode	[vkhandle]
	 */ 
	VkDisplayModeKHR 	displayMode;
	
	/**
	 *  uint32_t 	planeIndex	[int]
	 */ 
	int 	planeIndex;
	
	/**
	 *  uint32_t 	planeStackIndex	[int]
	 */ 
	int 	planeStackIndex;
	
	/**
	 *  VkSurfaceTransformFlagBitsKHR 	transform	[vkenum]
	 */ 
	VkSurfaceTransformFlagBitsKHR 	transform;
	
	/**
	 *  float 	globalAlpha	[float]
	 */ 
	float 	globalAlpha;
	
	/**
	 *  VkDisplayPlaneAlphaFlagBitsKHR 	alphaMode	[vkenum]
	 */ 
	VkDisplayPlaneAlphaFlagBitsKHR 	alphaMode;
	
	/**
	 *  VkExtent2D 	imageExtent	[vkstruct]
	 */ 
	VkExtent2D 	imageExtent;
	/**
	 * Ctor
	 */
	public VkDisplaySurfaceCreateInfoKHR(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDisplaySurfaceCreateInfoKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDisplaySurfaceCreateInfoKHR(long address){ 
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
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 * 
	 * @param sType - a instance of VkStructureType.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplaySurfaceCreateInfoKHR sType(VkStructureType sType){
		 this.sType = sType;
		 int enumVal = sType.getValue();
		 setSType0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = getSType0(super.ptr);
		 this.sType = VkStructureType.fromValue(nativeVal); 
		 return this.sType;
	 }

	/**
	 * Set method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 * 
	 * @param pNext - a instance of VkObject.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplaySurfaceCreateInfoKHR pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 setPNext0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 long pointer = getPNext0(super.ptr);
		 if(pointer == 0){
		    this.pNext = null;
		    return null;
		  } else 
		 if(this.pNext == null){
		    this.pNext = (VkObject)(new VkHandle(pointer));
		 }else{
		    this.pNext.setPointer(pointer);
		  }
		 return this.pNext;
	 }

	/**
	 * Set method for field flags	[int]<br>
	 * Prototype: VkDisplaySurfaceCreateFlagsKHR  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplaySurfaceCreateInfoKHR flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkDisplaySurfaceCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field displayMode	[vkhandle]<br>
	 * Prototype: VkDisplayModeKHR  displayMode
	 * 
	 * @param displayMode - a instance of VkDisplayModeKHR.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplaySurfaceCreateInfoKHR displayMode(VkDisplayModeKHR displayMode){
		 this.displayMode = displayMode;
		 long handle = (displayMode==null) ? 0L : displayMode.getNativeHandle();
		 setDisplayMode0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field displayMode	[vkhandle]<br>
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 public VkDisplayModeKHR displayMode(){

		 long handle = getDisplayMode0(super.ptr);
		 if(handle == 0){
		    this.displayMode = null;
		    return null;
		  }  

		 if(this.displayMode == null){
		    this.displayMode = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.displayMode).setNativeHandle(handle);
		  }
		 return this.displayMode;
	 }

	/**
	 * Set method for field planeIndex	[int]<br>
	 * Prototype: uint32_t  planeIndex
	 * 
	 * @param planeIndex - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplaySurfaceCreateInfoKHR planeIndex(int planeIndex){
		 this.planeIndex = planeIndex;
		 setPlaneIndex0(this.ptr,  planeIndex);
		 return this;
	 }

	/**
	 * Get method for field planeIndex	[int]<br>
	 * Prototype: uint32_t  planeIndex
	 */ 
	 public int planeIndex(){
		 int var = getPlaneIndex0(super.ptr);
		 this.planeIndex = var;
		 return this.planeIndex;
	 }

	/**
	 * Set method for field planeStackIndex	[int]<br>
	 * Prototype: uint32_t  planeStackIndex
	 * 
	 * @param planeStackIndex - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplaySurfaceCreateInfoKHR planeStackIndex(int planeStackIndex){
		 this.planeStackIndex = planeStackIndex;
		 setPlaneStackIndex0(this.ptr,  planeStackIndex);
		 return this;
	 }

	/**
	 * Get method for field planeStackIndex	[int]<br>
	 * Prototype: uint32_t  planeStackIndex
	 */ 
	 public int planeStackIndex(){
		 int var = getPlaneStackIndex0(super.ptr);
		 this.planeStackIndex = var;
		 return this.planeStackIndex;
	 }

	/**
	 * Set method for field transform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  transform
	 * 
	 * @param transform - a instance of VkSurfaceTransformFlagBitsKHR.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplaySurfaceCreateInfoKHR transform(VkSurfaceTransformFlagBitsKHR transform){
		 this.transform = transform;
		 int enumVal = transform.getValue();
		 setTransform0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field transform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  transform
	 */ 
	 public VkSurfaceTransformFlagBitsKHR transform(){
		 int nativeVal = getTransform0(super.ptr);
		 this.transform = VkSurfaceTransformFlagBitsKHR.fromValue(nativeVal); 
		 return this.transform;
	 }

	/**
	 * Set method for field globalAlpha	[float]<br>
	 * Prototype: float  globalAlpha
	 * 
	 * @param globalAlpha - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplaySurfaceCreateInfoKHR globalAlpha(float globalAlpha){
		 this.globalAlpha = globalAlpha;
		 setGlobalAlpha0(this.ptr,  globalAlpha);
		 return this;
	 }

	/**
	 * Get method for field globalAlpha	[float]<br>
	 * Prototype: float  globalAlpha
	 */ 
	 public float globalAlpha(){
		 float var = getGlobalAlpha0(super.ptr);
		 this.globalAlpha = var;
		 return this.globalAlpha;
	 }

	/**
	 * Set method for field alphaMode	[vkenum]<br>
	 * Prototype: VkDisplayPlaneAlphaFlagBitsKHR  alphaMode
	 * 
	 * @param alphaMode - a instance of VkDisplayPlaneAlphaFlagBitsKHR.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplaySurfaceCreateInfoKHR alphaMode(VkDisplayPlaneAlphaFlagBitsKHR alphaMode){
		 this.alphaMode = alphaMode;
		 int enumVal = alphaMode.getValue();
		 setAlphaMode0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field alphaMode	[vkenum]<br>
	 * Prototype: VkDisplayPlaneAlphaFlagBitsKHR  alphaMode
	 */ 
	 public VkDisplayPlaneAlphaFlagBitsKHR alphaMode(){
		 int nativeVal = getAlphaMode0(super.ptr);
		 this.alphaMode = VkDisplayPlaneAlphaFlagBitsKHR.fromValue(nativeVal); 
		 return this.alphaMode;
	 }

	/**
	 * Set method for field imageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  imageExtent
	 * 
	 * @param imageExtent - a instance of VkExtent2D.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplaySurfaceCreateInfoKHR imageExtent(VkExtent2D imageExtent){
		 this.imageExtent = imageExtent;
		 ByteBuffer buff = (imageExtent==null) ? null : imageExtent.getPointer();
		 setImageExtent0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field imageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  imageExtent
	 */ 
	 public VkExtent2D imageExtent(){
		 long pointer = getImageExtent0(super.ptr);
		 if(pointer == 0){
		    this.imageExtent = null;
		    return null;
		  } 

		 if(this.imageExtent == null){
		    this.imageExtent = new VkExtent2D(pointer);
		 }else{
		    this.imageExtent.setPointer(pointer);
		  }
		 return this.imageExtent;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkDisplaySurfaceCreateInfoKHR [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n displayMode: ")
				.append(displayMode() )
				.append(",\n planeIndex: ")
				.append(planeIndex() )
				.append(",\n planeStackIndex: ")
				.append(planeStackIndex() )
				.append(",\n transform: ")
				.append(transform() )
				.append(",\n globalAlpha: ")
				.append(globalAlpha() )
				.append(",\n alphaMode: ")
				.append(alphaMode() )
				.append(",\n imageExtent: ")
				.append(imageExtent() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkDisplaySurfaceCreateFlagsKHR  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkDisplaySurfaceCreateFlagsKHR) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkDisplaySurfaceCreateFlagsKHR  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field displayMode	[vkhandle]<br>
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 private static native void setDisplayMode0(Buffer ptr, long  _displayMode);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->displayMode = (VkDisplayModeKHR) (_displayMode);
	  */

	/**
	 * Native GET method for field displayMode	[vkhandle]<br>
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 private static native long getDisplayMode0(Buffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->displayMode);
	 */

	/**
	 * Native SET method for field planeIndex	[int]<br>
	 * Prototype: uint32_t  planeIndex
	 */ 
	 private static native void setPlaneIndex0(Buffer ptr, int _planeIndex);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->planeIndex = (uint32_t) (_planeIndex);
	  */

	/**
	 * Native GET method for field planeIndex	[int]<br>
	 * Prototype: uint32_t  planeIndex
	 */ 
	 private static native int getPlaneIndex0(Buffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->planeIndex);
	 */

	/**
	 * Native SET method for field planeStackIndex	[int]<br>
	 * Prototype: uint32_t  planeStackIndex
	 */ 
	 private static native void setPlaneStackIndex0(Buffer ptr, int _planeStackIndex);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->planeStackIndex = (uint32_t) (_planeStackIndex);
	  */

	/**
	 * Native GET method for field planeStackIndex	[int]<br>
	 * Prototype: uint32_t  planeStackIndex
	 */ 
	 private static native int getPlaneStackIndex0(Buffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->planeStackIndex);
	 */

	/**
	 * Native SET method for field transform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  transform
	 */ 
	 private static native void setTransform0(Buffer ptr, int  _transform);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->transform = (VkSurfaceTransformFlagBitsKHR) (_transform);
	  */

	/**
	 * Native GET method for field transform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  transform
	 */ 
	 private static native int getTransform0(Buffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->transform);
	 */

	/**
	 * Native SET method for field globalAlpha	[float]<br>
	 * Prototype: float  globalAlpha
	 */ 
	 private static native void setGlobalAlpha0(Buffer ptr, float _globalAlpha);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->globalAlpha = (float) (_globalAlpha);
	  */

	/**
	 * Native GET method for field globalAlpha	[float]<br>
	 * Prototype: float  globalAlpha
	 */ 
	 private static native float getGlobalAlpha0(Buffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  return (jfloat) (vkObj->globalAlpha);
	 */

	/**
	 * Native SET method for field alphaMode	[vkenum]<br>
	 * Prototype: VkDisplayPlaneAlphaFlagBitsKHR  alphaMode
	 */ 
	 private static native void setAlphaMode0(Buffer ptr, int  _alphaMode);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->alphaMode = (VkDisplayPlaneAlphaFlagBitsKHR) (_alphaMode);
	  */

	/**
	 * Native GET method for field alphaMode	[vkenum]<br>
	 * Prototype: VkDisplayPlaneAlphaFlagBitsKHR  alphaMode
	 */ 
	 private static native int getAlphaMode0(Buffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->alphaMode);
	 */

	/**
	 * Native SET method for field imageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  imageExtent
	 */ 
	 private static native void setImageExtent0(Buffer ptr, java.nio.ByteBuffer  _imageExtent);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent2D* p_imageExtent = (VkExtent2D*) _imageExtent; 
		 vkObj->imageExtent = (*p_imageExtent); 
	  */

	/**
	 * Native GET method for field imageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  imageExtent
	 */ 
	 private static native long getImageExtent0(Buffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->imageExtent);
	 */



} // end of class VkDisplaySurfaceCreateInfoKHR
