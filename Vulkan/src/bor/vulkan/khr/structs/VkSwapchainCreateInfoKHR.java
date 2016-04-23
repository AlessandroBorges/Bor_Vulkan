/**
 * Class wrapping Vulkan's VkSwapchainCreateInfoKHR struct.
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
 *  This class is a Java front end for struct VkSwapchainCreateInfoKHR. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSwapchainCreateInfoKHR {
 *     VkStructureType                  sType;
 *     const void*                      pNext;
 *     VkSwapchainCreateFlagsKHR        flags;
 *     VkSurfaceKHR                     surface;
 *     uint32_t                         minImageCount;
 *     VkFormat                         imageFormat;
 *     VkColorSpaceKHR                  imageColorSpace;
 *     VkExtent2D                       imageExtent;
 *     uint32_t                         imageArrayLayers;
 *     VkImageUsageFlags                imageUsage;
 *     VkSharingMode                    imageSharingMode;
 *     uint32_t                         queueFamilyIndexCount;
 *     const uint32_t*                  pQueueFamilyIndices;
 *     VkSurfaceTransformFlagBitsKHR    preTransform;
 *     VkCompositeAlphaFlagBitsKHR      compositeAlpha;
 *     VkPresentModeKHR                 presentMode;
 *     VkBool32                         clipped;
 *     VkSwapchainKHR                   oldSwapchain;
 * } VkSwapchainCreateInfoKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkSwapchainCreateInfoKHR extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [108]  */
	 private static final String TAG = "VkSwapchainCreateInfoKHR";

	/** ID of this structure [108]  */
	 public static final int TAG_ID = VKSWAPCHAINCREATEINFOKHR_ID;

	/** P wrapper for THIS object */
	 private  P<VkSwapchainCreateInfoKHR> p;

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
	 *  VkSwapchainCreateFlagsKHR 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  VkSurfaceKHR 	surface	[vkhandle]
	 */ 
	 VkSurfaceKHR 	surface;

	/**
	 *  uint32_t 	minImageCount	[int]
	 */ 
	 int 	minImageCount;

	/**
	 *  VkFormat 	imageFormat	[vkenum]
	 */ 
	 VkFormat 	imageFormat;

	/**
	 *  VkColorSpaceKHR 	imageColorSpace	[vkenum]
	 */ 
	 VkColorSpaceKHR 	imageColorSpace;

	/**
	 *  VkExtent2D 	imageExtent	[vkstruct]
	 */ 
	 VkExtent2D 	imageExtent;

	/**
	 *  uint32_t 	imageArrayLayers	[int]
	 */ 
	 int 	imageArrayLayers;

	/**
	 *  VkImageUsageFlags 	imageUsage	[int]
	 */ 
	 int 	imageUsage;

	/**
	 *  VkSharingMode 	imageSharingMode	[vkenum]
	 */ 
	 VkSharingMode 	imageSharingMode;

	/**
	 *  uint32_t 	queueFamilyIndexCount	[int]
	 */ 
	 int 	queueFamilyIndexCount;

	/**
	 *  const uint32_t* 	pQueueFamilyIndices	[int_array]
	 */ 
	 int[] 	pQueueFamilyIndices;

	/**
	 *  VkSurfaceTransformFlagBitsKHR 	preTransform	[vkenum]
	 */ 
	 VkSurfaceTransformFlagBitsKHR 	preTransform;

	/**
	 *  VkCompositeAlphaFlagBitsKHR 	compositeAlpha	[vkenum]
	 */ 
	 VkCompositeAlphaFlagBitsKHR 	compositeAlpha;

	/**
	 *  VkPresentModeKHR 	presentMode	[vkenum]
	 */ 
	 VkPresentModeKHR 	presentMode;

	/**
	 *  VkBool32 	clipped	[boolean]
	 */ 
	 boolean 	clipped;

	/**
	 *  VkSwapchainKHR 	oldSwapchain	[vkhandle]
	 */ 
	 VkSwapchainKHR 	oldSwapchain;

	/**
	 * Ctor
	 */
	public VkSwapchainCreateInfoKHR(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSwapchainCreateInfoKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkSwapchainCreateInfoKHR(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkSwapchainCreateInfoKHR(long address){ 
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
	 public static P<VkSwapchainCreateInfoKHR> createNullPointer(){
	        P<VkSwapchainCreateInfoKHR> p = new  P<VkSwapchainCreateInfoKHR>(new VkSwapchainCreateInfoKHR());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkSwapchainCreateInfoKHR> getP() {
	       if(p == null ){
	           p = new P<VkSwapchainCreateInfoKHR> (this);
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
		 setSType0(this.ptr, enumVal );
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
	 */ 
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 setPNext0(this.ptr, buff);
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
	 * Prototype: VkSwapchainCreateFlagsKHR  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkSwapchainCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field surface	[vkhandle]<br>
	 * Prototype: VkSurfaceKHR  surface
	 */ 
	 public void surface(VkSurfaceKHR surface){
		 this.surface = surface;
		 ByteBuffer buff = (surface==null) ? null : surface.getPointer();
		 setSurface0(this.ptr, buff);
	 }

	/**
	 * Get method for field surface	[vkhandle]<br>
	 * Prototype: VkSurfaceKHR  surface
	 */ 
	 public VkSurfaceKHR surface(){

		 long handle = getSurface0(super.ptr);
		 if(handle == 0){
		    this.surface = null;
		    return null;
		  }  

		 if(this.surface == null){
		    this.surface = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.surface).setPointer(handle);
		  }
		 return this.surface;
	 }

	/**
	 * Set method for field minImageCount	[int]<br>
	 * Prototype: uint32_t  minImageCount
	 */ 
	 public void minImageCount(int minImageCount){
		 this.minImageCount = minImageCount;
		 setMinImageCount0(this.ptr,  minImageCount);
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
	 * Set method for field imageFormat	[vkenum]<br>
	 * Prototype: VkFormat  imageFormat
	 */ 
	 public void imageFormat(VkFormat imageFormat){
		 this.imageFormat = imageFormat;
		 int enumVal = imageFormat.getValue();
		 setImageFormat0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field imageFormat	[vkenum]<br>
	 * Prototype: VkFormat  imageFormat
	 */ 
	 public VkFormat imageFormat(){
		 int nativeVal = getImageFormat0(super.ptr);
		 this.imageFormat = VkFormat.fromValue(nativeVal); 
		 return this.imageFormat;
	 }

	/**
	 * Set method for field imageColorSpace	[vkenum]<br>
	 * Prototype: VkColorSpaceKHR  imageColorSpace
	 */ 
	 public void imageColorSpace(VkColorSpaceKHR imageColorSpace){
		 this.imageColorSpace = imageColorSpace;
		 int enumVal = imageColorSpace.getValue();
		 setImageColorSpace0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field imageColorSpace	[vkenum]<br>
	 * Prototype: VkColorSpaceKHR  imageColorSpace
	 */ 
	 public VkColorSpaceKHR imageColorSpace(){
		 int nativeVal = getImageColorSpace0(super.ptr);
		 this.imageColorSpace = VkColorSpaceKHR.fromValue(nativeVal); 
		 return this.imageColorSpace;
	 }

	/**
	 * Set method for field imageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  imageExtent
	 */ 
	 public void imageExtent(VkExtent2D imageExtent){
		 this.imageExtent = imageExtent;
		 ByteBuffer buff = (imageExtent==null) ? null : imageExtent.getPointer();
		 setImageExtent0(this.ptr, buff);
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

	/**
	 * Set method for field imageArrayLayers	[int]<br>
	 * Prototype: uint32_t  imageArrayLayers
	 */ 
	 public void imageArrayLayers(int imageArrayLayers){
		 this.imageArrayLayers = imageArrayLayers;
		 setImageArrayLayers0(this.ptr,  imageArrayLayers);
	 }

	/**
	 * Get method for field imageArrayLayers	[int]<br>
	 * Prototype: uint32_t  imageArrayLayers
	 */ 
	 public int imageArrayLayers(){
		 int var = getImageArrayLayers0(super.ptr);
		 this.imageArrayLayers = var;
		 return this.imageArrayLayers;
	 }

	/**
	 * Set method for field imageUsage	[int]<br>
	 * Prototype: VkImageUsageFlags  imageUsage
	 */ 
	 public void imageUsage(int imageUsage){
		 this.imageUsage = imageUsage;
		 setImageUsage0(this.ptr,  imageUsage);
	 }

	/**
	 * Get method for field imageUsage	[int]<br>
	 * Prototype: VkImageUsageFlags  imageUsage
	 */ 
	 public int imageUsage(){
		 int var = getImageUsage0(super.ptr);
		 this.imageUsage = var;
		 return this.imageUsage;
	 }

	/**
	 * Set method for field imageSharingMode	[vkenum]<br>
	 * Prototype: VkSharingMode  imageSharingMode
	 */ 
	 public void imageSharingMode(VkSharingMode imageSharingMode){
		 this.imageSharingMode = imageSharingMode;
		 int enumVal = imageSharingMode.getValue();
		 setImageSharingMode0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field imageSharingMode	[vkenum]<br>
	 * Prototype: VkSharingMode  imageSharingMode
	 */ 
	 public VkSharingMode imageSharingMode(){
		 int nativeVal = getImageSharingMode0(super.ptr);
		 this.imageSharingMode = VkSharingMode.fromValue(nativeVal); 
		 return this.imageSharingMode;
	 }

	/**
	 * Set method for field queueFamilyIndexCount	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 public void queueFamilyIndexCount(int queueFamilyIndexCount){
		 this.queueFamilyIndexCount = queueFamilyIndexCount;
		 setQueueFamilyIndexCount0(this.ptr,  queueFamilyIndexCount);
	 }

	/**
	 * Get method for field queueFamilyIndexCount	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 public int queueFamilyIndexCount(){
		 int var = getQueueFamilyIndexCount0(super.ptr);
		 this.queueFamilyIndexCount = var;
		 return this.queueFamilyIndexCount;
	 }

	/**
	 * Set method for field pQueueFamilyIndices	[int_array]<br>
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 public void pQueueFamilyIndices(int[] pQueueFamilyIndices){
		 this.pQueueFamilyIndices = pQueueFamilyIndices;
		 setPQueueFamilyIndices0(this.ptr,  pQueueFamilyIndices);
	 }

	/**
	 * Get method for field pQueueFamilyIndices	[int_array]<br>
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 public int[] pQueueFamilyIndices(){
		 int[] var = getPQueueFamilyIndices0(super.ptr);
		 this.pQueueFamilyIndices = var;
		 return this.pQueueFamilyIndices;
	 }

	/**
	 * Set method for field preTransform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  preTransform
	 */ 
	 public void preTransform(VkSurfaceTransformFlagBitsKHR preTransform){
		 this.preTransform = preTransform;
		 int enumVal = preTransform.getValue();
		 setPreTransform0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field preTransform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  preTransform
	 */ 
	 public VkSurfaceTransformFlagBitsKHR preTransform(){
		 int nativeVal = getPreTransform0(super.ptr);
		 this.preTransform = VkSurfaceTransformFlagBitsKHR.fromValue(nativeVal); 
		 return this.preTransform;
	 }

	/**
	 * Set method for field compositeAlpha	[vkenum]<br>
	 * Prototype: VkCompositeAlphaFlagBitsKHR  compositeAlpha
	 */ 
	 public void compositeAlpha(VkCompositeAlphaFlagBitsKHR compositeAlpha){
		 this.compositeAlpha = compositeAlpha;
		 int enumVal = compositeAlpha.getValue();
		 setCompositeAlpha0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field compositeAlpha	[vkenum]<br>
	 * Prototype: VkCompositeAlphaFlagBitsKHR  compositeAlpha
	 */ 
	 public VkCompositeAlphaFlagBitsKHR compositeAlpha(){
		 int nativeVal = getCompositeAlpha0(super.ptr);
		 this.compositeAlpha = VkCompositeAlphaFlagBitsKHR.fromValue(nativeVal); 
		 return this.compositeAlpha;
	 }

	/**
	 * Set method for field presentMode	[vkenum]<br>
	 * Prototype: VkPresentModeKHR  presentMode
	 */ 
	 public void presentMode(VkPresentModeKHR presentMode){
		 this.presentMode = presentMode;
		 int enumVal = presentMode.getValue();
		 setPresentMode0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field presentMode	[vkenum]<br>
	 * Prototype: VkPresentModeKHR  presentMode
	 */ 
	 public VkPresentModeKHR presentMode(){
		 int nativeVal = getPresentMode0(super.ptr);
		 this.presentMode = VkPresentModeKHR.fromValue(nativeVal); 
		 return this.presentMode;
	 }

	/**
	 * Set method for field clipped	[boolean]<br>
	 * Prototype: VkBool32  clipped
	 */ 
	 public void clipped(boolean clipped){
		 this.clipped = clipped;
		 setClipped0(this.ptr,  clipped);
	 }

	/**
	 * Get method for field clipped	[boolean]<br>
	 * Prototype: VkBool32  clipped
	 */ 
	 public boolean clipped(){
		 boolean var = getClipped0(super.ptr);
		 this.clipped = var;
		 return this.clipped;
	 }

	/**
	 * Set method for field oldSwapchain	[vkhandle]<br>
	 * Prototype: VkSwapchainKHR  oldSwapchain
	 */ 
	 public void oldSwapchain(VkSwapchainKHR oldSwapchain){
		 this.oldSwapchain = oldSwapchain;
		 ByteBuffer buff = (oldSwapchain==null) ? null : oldSwapchain.getPointer();
		 setOldSwapchain0(this.ptr, buff);
	 }

	/**
	 * Get method for field oldSwapchain	[vkhandle]<br>
	 * Prototype: VkSwapchainKHR  oldSwapchain
	 */ 
	 public VkSwapchainKHR oldSwapchain(){

		 long handle = getOldSwapchain0(super.ptr);
		 if(handle == 0){
		    this.oldSwapchain = null;
		    return null;
		  }  

		 if(this.oldSwapchain == null){
		    this.oldSwapchain = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.oldSwapchain).setPointer(handle);
		  }
		 return this.oldSwapchain;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkSwapchainCreateFlagsKHR  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  vkObj->flags = (VkSwapchainCreateFlagsKHR) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkSwapchainCreateFlagsKHR  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field surface	[vkhandle]<br>
	 * Prototype: VkSurfaceKHR  surface
	 */ 
	 private static native void setSurface0(Buffer ptr, java.nio.ByteBuffer  _surface);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  vkObj->surface = (VkSurfaceKHR) (_surface);
	  */

	/**
	 * native GET method for field surface	[vkhandle]<br>
	 * Prototype: VkSurfaceKHR  surface
	 */ 
	 private static native long getSurface0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->surface);	 */

	/**
	 * native SET method for field minImageCount	[int]<br>
	 * Prototype: uint32_t  minImageCount
	 */ 
	 private static native void setMinImageCount0(Buffer ptr, int _minImageCount);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  vkObj->minImageCount = (uint32_t) (_minImageCount);
	  */

	/**
	 * native GET method for field minImageCount	[int]<br>
	 * Prototype: uint32_t  minImageCount
	 */ 
	 private static native int getMinImageCount0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->minImageCount);
	 */

	/**
	 * native SET method for field imageFormat	[vkenum]<br>
	 * Prototype: VkFormat  imageFormat
	 */ 
	 private static native void setImageFormat0(Buffer ptr, int  _imageFormat);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  vkObj->imageFormat = (VkFormat) (_imageFormat);
	  */

	/**
	 * native GET method for field imageFormat	[vkenum]<br>
	 * Prototype: VkFormat  imageFormat
	 */ 
	 private static native int  getImageFormat0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (VkFormat) (vkObj->imageFormat);
	 */

	/**
	 * native SET method for field imageColorSpace	[vkenum]<br>
	 * Prototype: VkColorSpaceKHR  imageColorSpace
	 */ 
	 private static native void setImageColorSpace0(Buffer ptr, int  _imageColorSpace);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  vkObj->imageColorSpace = (VkColorSpaceKHR) (_imageColorSpace);
	  */

	/**
	 * native GET method for field imageColorSpace	[vkenum]<br>
	 * Prototype: VkColorSpaceKHR  imageColorSpace
	 */ 
	 private static native int  getImageColorSpace0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (VkColorSpaceKHR) (vkObj->imageColorSpace);
	 */

	/**
	 * native SET method for field imageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  imageExtent
	 */ 
	 private static native void setImageExtent0(Buffer ptr, java.nio.ByteBuffer  _imageExtent);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  vkObj->imageExtent = (VkExtent2D) (_imageExtent);
	  */

	/**
	 * native GET method for field imageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  imageExtent
	 */ 
	 private static native long getImageExtent0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->imageExtent);	 */

	/**
	 * native SET method for field imageArrayLayers	[int]<br>
	 * Prototype: uint32_t  imageArrayLayers
	 */ 
	 private static native void setImageArrayLayers0(Buffer ptr, int _imageArrayLayers);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  vkObj->imageArrayLayers = (uint32_t) (_imageArrayLayers);
	  */

	/**
	 * native GET method for field imageArrayLayers	[int]<br>
	 * Prototype: uint32_t  imageArrayLayers
	 */ 
	 private static native int getImageArrayLayers0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->imageArrayLayers);
	 */

	/**
	 * native SET method for field imageUsage	[int]<br>
	 * Prototype: VkImageUsageFlags  imageUsage
	 */ 
	 private static native void setImageUsage0(Buffer ptr, int _imageUsage);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  vkObj->imageUsage = (VkImageUsageFlags) (_imageUsage);
	  */

	/**
	 * native GET method for field imageUsage	[int]<br>
	 * Prototype: VkImageUsageFlags  imageUsage
	 */ 
	 private static native int getImageUsage0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->imageUsage);
	 */

	/**
	 * native SET method for field imageSharingMode	[vkenum]<br>
	 * Prototype: VkSharingMode  imageSharingMode
	 */ 
	 private static native void setImageSharingMode0(Buffer ptr, int  _imageSharingMode);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  vkObj->imageSharingMode = (VkSharingMode) (_imageSharingMode);
	  */

	/**
	 * native GET method for field imageSharingMode	[vkenum]<br>
	 * Prototype: VkSharingMode  imageSharingMode
	 */ 
	 private static native int  getImageSharingMode0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (VkSharingMode) (vkObj->imageSharingMode);
	 */

	/**
	 * native SET method for field queueFamilyIndexCount	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 private static native void setQueueFamilyIndexCount0(Buffer ptr, int _queueFamilyIndexCount);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  vkObj->queueFamilyIndexCount = (uint32_t) (_queueFamilyIndexCount);
	  */

	/**
	 * native GET method for field queueFamilyIndexCount	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 private static native int getQueueFamilyIndexCount0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->queueFamilyIndexCount);
	 */

	/**
	 * native SET method for field pQueueFamilyIndices	[int_array]<br>
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 private static native void setPQueueFamilyIndices0(Buffer ptr, int[] _pQueueFamilyIndices);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  vkObj->pQueueFamilyIndices = (const uint32_t*) (_pQueueFamilyIndices);
	  */

	/**
	 * native GET method for field pQueueFamilyIndices	[int_array]<br>
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 private static native int[] getPQueueFamilyIndices0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (int[]) (vkObj->pQueueFamilyIndices);
	 */

	/**
	 * native SET method for field preTransform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  preTransform
	 */ 
	 private static native void setPreTransform0(Buffer ptr, int  _preTransform);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  vkObj->preTransform = (VkSurfaceTransformFlagBitsKHR) (_preTransform);
	  */

	/**
	 * native GET method for field preTransform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  preTransform
	 */ 
	 private static native int  getPreTransform0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (VkSurfaceTransformFlagBitsKHR) (vkObj->preTransform);
	 */

	/**
	 * native SET method for field compositeAlpha	[vkenum]<br>
	 * Prototype: VkCompositeAlphaFlagBitsKHR  compositeAlpha
	 */ 
	 private static native void setCompositeAlpha0(Buffer ptr, int  _compositeAlpha);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  vkObj->compositeAlpha = (VkCompositeAlphaFlagBitsKHR) (_compositeAlpha);
	  */

	/**
	 * native GET method for field compositeAlpha	[vkenum]<br>
	 * Prototype: VkCompositeAlphaFlagBitsKHR  compositeAlpha
	 */ 
	 private static native int  getCompositeAlpha0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (VkCompositeAlphaFlagBitsKHR) (vkObj->compositeAlpha);
	 */

	/**
	 * native SET method for field presentMode	[vkenum]<br>
	 * Prototype: VkPresentModeKHR  presentMode
	 */ 
	 private static native void setPresentMode0(Buffer ptr, int  _presentMode);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  vkObj->presentMode = (VkPresentModeKHR) (_presentMode);
	  */

	/**
	 * native GET method for field presentMode	[vkenum]<br>
	 * Prototype: VkPresentModeKHR  presentMode
	 */ 
	 private static native int  getPresentMode0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (VkPresentModeKHR) (vkObj->presentMode);
	 */

	/**
	 * native SET method for field clipped	[boolean]<br>
	 * Prototype: VkBool32  clipped
	 */ 
	 private static native void setClipped0(Buffer ptr, boolean _clipped);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  vkObj->clipped = (VkBool32) (_clipped);
	  */

	/**
	 * native GET method for field clipped	[boolean]<br>
	 * Prototype: VkBool32  clipped
	 */ 
	 private static native boolean getClipped0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (jboolean) (vkObj->clipped);
	 */

	/**
	 * native SET method for field oldSwapchain	[vkhandle]<br>
	 * Prototype: VkSwapchainKHR  oldSwapchain
	 */ 
	 private static native void setOldSwapchain0(Buffer ptr, java.nio.ByteBuffer  _oldSwapchain);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  vkObj->oldSwapchain = (VkSwapchainKHR) (_oldSwapchain);
	  */

	/**
	 * native GET method for field oldSwapchain	[vkhandle]<br>
	 * Prototype: VkSwapchainKHR  oldSwapchain
	 */ 
	 private static native long getOldSwapchain0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->oldSwapchain);	 */



} // end of class VkSwapchainCreateInfoKHR
