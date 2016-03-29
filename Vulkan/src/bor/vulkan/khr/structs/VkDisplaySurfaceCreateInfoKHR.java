/**
 * Class wrapping Vulkan's VkDisplaySurfaceCreateInfoKHR struct.
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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkDisplaySurfaceCreateInfoKHR extends VkStruct {
	/** TAG of this structure [116]  */
	 private static final String TAG = "VkDisplaySurfaceCreateInfoKHR";

	/** ID of this structure [116]  */
	 public static final int TAG_ID = VKDISPLAYSURFACECREATEINFOKHR_ID;

	/** P wrapper for THIS object */
	 private  P<VkDisplaySurfaceCreateInfoKHR> p;

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
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDisplaySurfaceCreateInfoKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkDisplaySurfaceCreateInfoKHR(long address, int memSize){ 
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
	 public static P<VkDisplaySurfaceCreateInfoKHR> createNullPointer(){
	        P<VkDisplaySurfaceCreateInfoKHR> p = new  P<VkDisplaySurfaceCreateInfoKHR>(new VkDisplaySurfaceCreateInfoKHR());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkDisplaySurfaceCreateInfoKHR> getP() {
	       if(p == null ){
	           p = new P<VkDisplaySurfaceCreateInfoKHR> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		 int enumVal = sType.getValue();
		 sType0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = sType0(super.ptr);
		 this.sType = VkStructureType.fromValue(nativeVal); 
		 return this.sType;
	 }

	/**
	 * Set method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 pNext0(this.ptr, buff);
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 ByteBuffer pointer = pNext0(super.ptr);
		 if(pointer == null){
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
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 flags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkDisplaySurfaceCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 int var = flags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field displayMode	[vkhandle]<br>
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 public void displayMode(VkDisplayModeKHR displayMode){
		 this.displayMode = displayMode;
		 ByteBuffer buff = (displayMode==null) ? null : displayMode.getHandle();
		 displayMode0(this.ptr, buff);
	 }

	/**
	 * Get method for field displayMode	[vkhandle]<br>
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 public VkDisplayModeKHR displayMode(){

		 ByteBuffer handle = displayMode0(super.ptr);
		 if(handle == null){
		    this.displayMode = null;
		    return null;
		  } else 
 		 if(this.displayMode == null){
		    this.displayMode = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.displayMode).setHandle(handle);
		  }
		 return this.displayMode;
	 }

	/**
	 * Set method for field planeIndex	[int]<br>
	 * Prototype: uint32_t  planeIndex
	 */ 
	 public void planeIndex(int planeIndex){
		 this.planeIndex = planeIndex;
		 planeIndex0(this.ptr,  planeIndex);
	 }

	/**
	 * Get method for field planeIndex	[int]<br>
	 * Prototype: uint32_t  planeIndex
	 */ 
	 public int planeIndex(){
		 int var = planeIndex0(super.ptr);
		 this.planeIndex = var;
		 return this.planeIndex;
	 }

	/**
	 * Set method for field planeStackIndex	[int]<br>
	 * Prototype: uint32_t  planeStackIndex
	 */ 
	 public void planeStackIndex(int planeStackIndex){
		 this.planeStackIndex = planeStackIndex;
		 planeStackIndex0(this.ptr,  planeStackIndex);
	 }

	/**
	 * Get method for field planeStackIndex	[int]<br>
	 * Prototype: uint32_t  planeStackIndex
	 */ 
	 public int planeStackIndex(){
		 int var = planeStackIndex0(super.ptr);
		 this.planeStackIndex = var;
		 return this.planeStackIndex;
	 }

	/**
	 * Set method for field transform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  transform
	 */ 
	 public void transform(VkSurfaceTransformFlagBitsKHR transform){
		 this.transform = transform;
		 int enumVal = transform.getValue();
		 transform0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field transform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  transform
	 */ 
	 public VkSurfaceTransformFlagBitsKHR transform(){
		 int nativeVal = transform0(super.ptr);
		 this.transform = VkSurfaceTransformFlagBitsKHR.fromValue(nativeVal); 
		 return this.transform;
	 }

	/**
	 * Set method for field globalAlpha	[float]<br>
	 * Prototype: float  globalAlpha
	 */ 
	 public void globalAlpha(float globalAlpha){
		 this.globalAlpha = globalAlpha;
		 globalAlpha0(this.ptr,  globalAlpha);
	 }

	/**
	 * Get method for field globalAlpha	[float]<br>
	 * Prototype: float  globalAlpha
	 */ 
	 public float globalAlpha(){
		 float var = globalAlpha0(super.ptr);
		 this.globalAlpha = var;
		 return this.globalAlpha;
	 }

	/**
	 * Set method for field alphaMode	[vkenum]<br>
	 * Prototype: VkDisplayPlaneAlphaFlagBitsKHR  alphaMode
	 */ 
	 public void alphaMode(VkDisplayPlaneAlphaFlagBitsKHR alphaMode){
		 this.alphaMode = alphaMode;
		 int enumVal = alphaMode.getValue();
		 alphaMode0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field alphaMode	[vkenum]<br>
	 * Prototype: VkDisplayPlaneAlphaFlagBitsKHR  alphaMode
	 */ 
	 public VkDisplayPlaneAlphaFlagBitsKHR alphaMode(){
		 int nativeVal = alphaMode0(super.ptr);
		 this.alphaMode = VkDisplayPlaneAlphaFlagBitsKHR.fromValue(nativeVal); 
		 return this.alphaMode;
	 }

	/**
	 * Set method for field imageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  imageExtent
	 */ 
	 public void imageExtent(VkExtent2D imageExtent){
		 this.imageExtent = imageExtent;
		 ByteBuffer buff = (imageExtent==null) ? null : imageExtent.getPointerStruct();
		 imageExtent0(this.ptr, buff);
	 }

	/**
	 * Get method for field imageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  imageExtent
	 */ 
	 public VkExtent2D imageExtent(){
		 ByteBuffer pointer = imageExtent0(super.ptr);
		 if(pointer == null){
		    this.imageExtent = null;
		    return null;
		  } else 
 		 if(this.imageExtent == null){
		    this.imageExtent = new VkExtent2D(pointer);
		 }else{
		    this.imageExtent.setPointer(pointer);
		  }
		 return this.imageExtent;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkDisplaySurfaceCreateFlagsKHR  flags
	 */ 
	 private static native void flags0(Buffer ptr, int _flags);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  vkObj->flags = (VkDisplaySurfaceCreateFlagsKHR) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkDisplaySurfaceCreateFlagsKHR  flags
	 */ 
	 private static native int flags0(Buffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field displayMode	[vkhandle]<br>
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 private static native void displayMode0(Buffer ptr, java.nio.ByteBuffer  _displayMode);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  vkObj->displayMode = (VkDisplayModeKHR) (_displayMode);
	  */

	/**
	 * native GET method for field displayMode	[vkhandle]<br>
	 * Prototype: VkDisplayModeKHR  displayMode
	 */ 
	 private static native java.nio.ByteBuffer  displayMode0(Buffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  return (VkDisplayModeKHR) (vkObj->displayMode);
	 */

	/**
	 * native SET method for field planeIndex	[int]<br>
	 * Prototype: uint32_t  planeIndex
	 */ 
	 private static native void planeIndex0(Buffer ptr, int _planeIndex);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  vkObj->planeIndex = (uint32_t) (_planeIndex);
	  */

	/**
	 * native GET method for field planeIndex	[int]<br>
	 * Prototype: uint32_t  planeIndex
	 */ 
	 private static native int planeIndex0(Buffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->planeIndex);
	 */

	/**
	 * native SET method for field planeStackIndex	[int]<br>
	 * Prototype: uint32_t  planeStackIndex
	 */ 
	 private static native void planeStackIndex0(Buffer ptr, int _planeStackIndex);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  vkObj->planeStackIndex = (uint32_t) (_planeStackIndex);
	  */

	/**
	 * native GET method for field planeStackIndex	[int]<br>
	 * Prototype: uint32_t  planeStackIndex
	 */ 
	 private static native int planeStackIndex0(Buffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->planeStackIndex);
	 */

	/**
	 * native SET method for field transform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  transform
	 */ 
	 private static native void transform0(Buffer ptr, int  _transform);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  vkObj->transform = (VkSurfaceTransformFlagBitsKHR) (_transform);
	  */

	/**
	 * native GET method for field transform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  transform
	 */ 
	 private static native int  transform0(Buffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  return (VkSurfaceTransformFlagBitsKHR) (vkObj->transform);
	 */

	/**
	 * native SET method for field globalAlpha	[float]<br>
	 * Prototype: float  globalAlpha
	 */ 
	 private static native void globalAlpha0(Buffer ptr, float _globalAlpha);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  vkObj->globalAlpha = (float) (_globalAlpha);
	  */

	/**
	 * native GET method for field globalAlpha	[float]<br>
	 * Prototype: float  globalAlpha
	 */ 
	 private static native float globalAlpha0(Buffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  return (jfloat) (vkObj->globalAlpha);
	 */

	/**
	 * native SET method for field alphaMode	[vkenum]<br>
	 * Prototype: VkDisplayPlaneAlphaFlagBitsKHR  alphaMode
	 */ 
	 private static native void alphaMode0(Buffer ptr, int  _alphaMode);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  vkObj->alphaMode = (VkDisplayPlaneAlphaFlagBitsKHR) (_alphaMode);
	  */

	/**
	 * native GET method for field alphaMode	[vkenum]<br>
	 * Prototype: VkDisplayPlaneAlphaFlagBitsKHR  alphaMode
	 */ 
	 private static native int  alphaMode0(Buffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  return (VkDisplayPlaneAlphaFlagBitsKHR) (vkObj->alphaMode);
	 */

	/**
	 * native SET method for field imageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  imageExtent
	 */ 
	 private static native void imageExtent0(Buffer ptr, java.nio.ByteBuffer  _imageExtent);/*
		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  vkObj->imageExtent = (VkExtent2D) (_imageExtent);
	  */

	/**
	 * native GET method for field imageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  imageExtent
	 */ 
	 private static native java.nio.ByteBuffer  imageExtent0(Buffer ptr);/*
		  VkDisplaySurfaceCreateInfoKHR vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  return (VkExtent2D) (vkObj->imageExtent);
	 */



} // end of class VkDisplaySurfaceCreateInfoKHR
