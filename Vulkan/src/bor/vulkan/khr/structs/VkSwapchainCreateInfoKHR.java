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
	/** TAG of this structure [108]  */
	 private static final String TAG = "VkSwapchainCreateInfoKHR";

	/** ID of this structure [108]  */
	 public static final int TAG_ID = VKSWAPCHAINCREATEINFOKHR_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType	[vkenum]
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext	[p]
	 */ 
	P<VkObject> 	pNext;

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
		 super(sizeOf()); 
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
	 public VkSwapchainCreateInfoKHR(long address, int memSize){ 
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
	 public static P<VkSwapchainCreateInfoKHR> createNullPointer(){
	        P<VkSwapchainCreateInfoKHR> p = new  P<VkSwapchainCreateInfoKHR>(new VkSwapchainCreateInfoKHR());
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
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(P<VkObject> pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public P<VkObject> pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field flags	[int]<br>
	 * Prototype: VkSwapchainCreateFlagsKHR  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkSwapchainCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field surface	[vkhandle]<br>
	 * Prototype: VkSurfaceKHR  surface
	 */ 
	 public void surface(VkSurfaceKHR surface){
		 this.surface = surface;
		surface0(super.ptr, surface);
	 }

	/**
	 * get method for field surface	[vkhandle]<br>
	 * Prototype: VkSurfaceKHR  surface
	 */ 
	 public VkSurfaceKHR surface(){
		 // return  this.surface;
		 return surface0(super.ptr);
	 }

	/**
	 * Set method for field minImageCount	[int]<br>
	 * Prototype: uint32_t  minImageCount
	 */ 
	 public void minImageCount(int minImageCount){
		 this.minImageCount = minImageCount;
		minImageCount0(super.ptr, minImageCount);
	 }

	/**
	 * get method for field minImageCount	[int]<br>
	 * Prototype: uint32_t  minImageCount
	 */ 
	 public int minImageCount(){
		 // return  this.minImageCount;
		 return minImageCount0(super.ptr);
	 }

	/**
	 * Set method for field imageFormat	[vkenum]<br>
	 * Prototype: VkFormat  imageFormat
	 */ 
	 public void imageFormat(VkFormat imageFormat){
		 this.imageFormat = imageFormat;
		imageFormat0(super.ptr, imageFormat);
	 }

	/**
	 * get method for field imageFormat	[vkenum]<br>
	 * Prototype: VkFormat  imageFormat
	 */ 
	 public VkFormat imageFormat(){
		 // return  this.imageFormat;
		 return imageFormat0(super.ptr);
	 }

	/**
	 * Set method for field imageColorSpace	[vkenum]<br>
	 * Prototype: VkColorSpaceKHR  imageColorSpace
	 */ 
	 public void imageColorSpace(VkColorSpaceKHR imageColorSpace){
		 this.imageColorSpace = imageColorSpace;
		imageColorSpace0(super.ptr, imageColorSpace);
	 }

	/**
	 * get method for field imageColorSpace	[vkenum]<br>
	 * Prototype: VkColorSpaceKHR  imageColorSpace
	 */ 
	 public VkColorSpaceKHR imageColorSpace(){
		 // return  this.imageColorSpace;
		 return imageColorSpace0(super.ptr);
	 }

	/**
	 * Set method for field imageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  imageExtent
	 */ 
	 public void imageExtent(VkExtent2D imageExtent){
		 this.imageExtent = imageExtent;
		imageExtent0(super.ptr, imageExtent);
	 }

	/**
	 * get method for field imageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  imageExtent
	 */ 
	 public VkExtent2D imageExtent(){
		 // return  this.imageExtent;
		 return imageExtent0(super.ptr);
	 }

	/**
	 * Set method for field imageArrayLayers	[int]<br>
	 * Prototype: uint32_t  imageArrayLayers
	 */ 
	 public void imageArrayLayers(int imageArrayLayers){
		 this.imageArrayLayers = imageArrayLayers;
		imageArrayLayers0(super.ptr, imageArrayLayers);
	 }

	/**
	 * get method for field imageArrayLayers	[int]<br>
	 * Prototype: uint32_t  imageArrayLayers
	 */ 
	 public int imageArrayLayers(){
		 // return  this.imageArrayLayers;
		 return imageArrayLayers0(super.ptr);
	 }

	/**
	 * Set method for field imageUsage	[int]<br>
	 * Prototype: VkImageUsageFlags  imageUsage
	 */ 
	 public void imageUsage(int imageUsage){
		 this.imageUsage = imageUsage;
		imageUsage0(super.ptr, imageUsage);
	 }

	/**
	 * get method for field imageUsage	[int]<br>
	 * Prototype: VkImageUsageFlags  imageUsage
	 */ 
	 public int imageUsage(){
		 // return  this.imageUsage;
		 return imageUsage0(super.ptr);
	 }

	/**
	 * Set method for field imageSharingMode	[vkenum]<br>
	 * Prototype: VkSharingMode  imageSharingMode
	 */ 
	 public void imageSharingMode(VkSharingMode imageSharingMode){
		 this.imageSharingMode = imageSharingMode;
		imageSharingMode0(super.ptr, imageSharingMode);
	 }

	/**
	 * get method for field imageSharingMode	[vkenum]<br>
	 * Prototype: VkSharingMode  imageSharingMode
	 */ 
	 public VkSharingMode imageSharingMode(){
		 // return  this.imageSharingMode;
		 return imageSharingMode0(super.ptr);
	 }

	/**
	 * Set method for field queueFamilyIndexCount	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 public void queueFamilyIndexCount(int queueFamilyIndexCount){
		 this.queueFamilyIndexCount = queueFamilyIndexCount;
		queueFamilyIndexCount0(super.ptr, queueFamilyIndexCount);
	 }

	/**
	 * get method for field queueFamilyIndexCount	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 public int queueFamilyIndexCount(){
		 // return  this.queueFamilyIndexCount;
		 return queueFamilyIndexCount0(super.ptr);
	 }

	/**
	 * Set method for field pQueueFamilyIndices	[int_array]<br>
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 public void pQueueFamilyIndices(int[] pQueueFamilyIndices){
		 this.pQueueFamilyIndices = pQueueFamilyIndices;
		pQueueFamilyIndices0(super.ptr, pQueueFamilyIndices);
	 }

	/**
	 * get method for field pQueueFamilyIndices	[int_array]<br>
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 public int[] pQueueFamilyIndices(){
		 // return  this.pQueueFamilyIndices;
		 return pQueueFamilyIndices0(super.ptr);
	 }

	/**
	 * Set method for field preTransform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  preTransform
	 */ 
	 public void preTransform(VkSurfaceTransformFlagBitsKHR preTransform){
		 this.preTransform = preTransform;
		preTransform0(super.ptr, preTransform);
	 }

	/**
	 * get method for field preTransform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  preTransform
	 */ 
	 public VkSurfaceTransformFlagBitsKHR preTransform(){
		 // return  this.preTransform;
		 return preTransform0(super.ptr);
	 }

	/**
	 * Set method for field compositeAlpha	[vkenum]<br>
	 * Prototype: VkCompositeAlphaFlagBitsKHR  compositeAlpha
	 */ 
	 public void compositeAlpha(VkCompositeAlphaFlagBitsKHR compositeAlpha){
		 this.compositeAlpha = compositeAlpha;
		compositeAlpha0(super.ptr, compositeAlpha);
	 }

	/**
	 * get method for field compositeAlpha	[vkenum]<br>
	 * Prototype: VkCompositeAlphaFlagBitsKHR  compositeAlpha
	 */ 
	 public VkCompositeAlphaFlagBitsKHR compositeAlpha(){
		 // return  this.compositeAlpha;
		 return compositeAlpha0(super.ptr);
	 }

	/**
	 * Set method for field presentMode	[vkenum]<br>
	 * Prototype: VkPresentModeKHR  presentMode
	 */ 
	 public void presentMode(VkPresentModeKHR presentMode){
		 this.presentMode = presentMode;
		presentMode0(super.ptr, presentMode);
	 }

	/**
	 * get method for field presentMode	[vkenum]<br>
	 * Prototype: VkPresentModeKHR  presentMode
	 */ 
	 public VkPresentModeKHR presentMode(){
		 // return  this.presentMode;
		 return presentMode0(super.ptr);
	 }

	/**
	 * Set method for field clipped	[boolean]<br>
	 * Prototype: VkBool32  clipped
	 */ 
	 public void clipped(boolean clipped){
		 this.clipped = clipped;
		clipped0(super.ptr, clipped);
	 }

	/**
	 * get method for field clipped	[boolean]<br>
	 * Prototype: VkBool32  clipped
	 */ 
	 public boolean clipped(){
		 // return  this.clipped;
		 return clipped0(super.ptr);
	 }

	/**
	 * Set method for field oldSwapchain	[vkhandle]<br>
	 * Prototype: VkSwapchainKHR  oldSwapchain
	 */ 
	 public void oldSwapchain(VkSwapchainKHR oldSwapchain){
		 this.oldSwapchain = oldSwapchain;
		oldSwapchain0(super.ptr, oldSwapchain);
	 }

	/**
	 * get method for field oldSwapchain	[vkhandle]<br>
	 * Prototype: VkSwapchainKHR  oldSwapchain
	 */ 
	 public VkSwapchainKHR oldSwapchain(){
		 // return  this.oldSwapchain;
		 return oldSwapchain0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkSwapchainCreateFlagsKHR  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.flags = (VkSwapchainCreateFlagsKHR) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkSwapchainCreateFlagsKHR  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (jint) (_obj.VkSwapchainCreateFlagsKHR);
	 */

	/**
	 * native SET method for field surface	[vkhandle]<br>
	 * Prototype: VkSurfaceKHR  surface
	 */ 
	 private static native void surface0(ByteBuffer ptr, VkSurfaceKHR _surface);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.surface = (VkSurfaceKHR) (_surface);
	  */

	/**
	 * native GET method for field surface	[vkhandle]<br>
	 * Prototype: VkSurfaceKHR  surface
	 */ 
	 private static native VkSurfaceKHR surface0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (VkSurfaceKHR) (_obj.VkSurfaceKHR);
	 */

	/**
	 * native SET method for field minImageCount	[int]<br>
	 * Prototype: uint32_t  minImageCount
	 */ 
	 private static native void minImageCount0(ByteBuffer ptr, int _minImageCount);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.minImageCount = (uint32_t) (_minImageCount);
	  */

	/**
	 * native GET method for field minImageCount	[int]<br>
	 * Prototype: uint32_t  minImageCount
	 */ 
	 private static native int minImageCount0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field imageFormat	[vkenum]<br>
	 * Prototype: VkFormat  imageFormat
	 */ 
	 private static native void imageFormat0(ByteBuffer ptr, VkFormat _imageFormat);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.imageFormat = (VkFormat) (_imageFormat);
	  */

	/**
	 * native GET method for field imageFormat	[vkenum]<br>
	 * Prototype: VkFormat  imageFormat
	 */ 
	 private static native VkFormat imageFormat0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (VkFormat) (_obj.VkFormat);
	 */

	/**
	 * native SET method for field imageColorSpace	[vkenum]<br>
	 * Prototype: VkColorSpaceKHR  imageColorSpace
	 */ 
	 private static native void imageColorSpace0(ByteBuffer ptr, VkColorSpaceKHR _imageColorSpace);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.imageColorSpace = (VkColorSpaceKHR) (_imageColorSpace);
	  */

	/**
	 * native GET method for field imageColorSpace	[vkenum]<br>
	 * Prototype: VkColorSpaceKHR  imageColorSpace
	 */ 
	 private static native VkColorSpaceKHR imageColorSpace0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (VkColorSpaceKHR) (_obj.VkColorSpaceKHR);
	 */

	/**
	 * native SET method for field imageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  imageExtent
	 */ 
	 private static native void imageExtent0(ByteBuffer ptr, VkExtent2D _imageExtent);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.imageExtent = (VkExtent2D) (_imageExtent);
	  */

	/**
	 * native GET method for field imageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  imageExtent
	 */ 
	 private static native VkExtent2D imageExtent0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (VkExtent2D) (_obj.VkExtent2D);
	 */

	/**
	 * native SET method for field imageArrayLayers	[int]<br>
	 * Prototype: uint32_t  imageArrayLayers
	 */ 
	 private static native void imageArrayLayers0(ByteBuffer ptr, int _imageArrayLayers);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.imageArrayLayers = (uint32_t) (_imageArrayLayers);
	  */

	/**
	 * native GET method for field imageArrayLayers	[int]<br>
	 * Prototype: uint32_t  imageArrayLayers
	 */ 
	 private static native int imageArrayLayers0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field imageUsage	[int]<br>
	 * Prototype: VkImageUsageFlags  imageUsage
	 */ 
	 private static native void imageUsage0(ByteBuffer ptr, int _imageUsage);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.imageUsage = (VkImageUsageFlags) (_imageUsage);
	  */

	/**
	 * native GET method for field imageUsage	[int]<br>
	 * Prototype: VkImageUsageFlags  imageUsage
	 */ 
	 private static native int imageUsage0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (jint) (_obj.VkImageUsageFlags);
	 */

	/**
	 * native SET method for field imageSharingMode	[vkenum]<br>
	 * Prototype: VkSharingMode  imageSharingMode
	 */ 
	 private static native void imageSharingMode0(ByteBuffer ptr, VkSharingMode _imageSharingMode);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.imageSharingMode = (VkSharingMode) (_imageSharingMode);
	  */

	/**
	 * native GET method for field imageSharingMode	[vkenum]<br>
	 * Prototype: VkSharingMode  imageSharingMode
	 */ 
	 private static native VkSharingMode imageSharingMode0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (VkSharingMode) (_obj.VkSharingMode);
	 */

	/**
	 * native SET method for field queueFamilyIndexCount	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 private static native void queueFamilyIndexCount0(ByteBuffer ptr, int _queueFamilyIndexCount);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.queueFamilyIndexCount = (uint32_t) (_queueFamilyIndexCount);
	  */

	/**
	 * native GET method for field queueFamilyIndexCount	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 private static native int queueFamilyIndexCount0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field pQueueFamilyIndices	[int_array]<br>
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 private static native void pQueueFamilyIndices0(ByteBuffer ptr, int[] _pQueueFamilyIndices);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.pQueueFamilyIndices = (const uint32_t*) (_pQueueFamilyIndices);
	  */

	/**
	 * native GET method for field pQueueFamilyIndices	[int_array]<br>
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 private static native int[] pQueueFamilyIndices0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (int[]) (_obj.const uint32_t*);
	 */

	/**
	 * native SET method for field preTransform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  preTransform
	 */ 
	 private static native void preTransform0(ByteBuffer ptr, VkSurfaceTransformFlagBitsKHR _preTransform);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.preTransform = (VkSurfaceTransformFlagBitsKHR) (_preTransform);
	  */

	/**
	 * native GET method for field preTransform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  preTransform
	 */ 
	 private static native VkSurfaceTransformFlagBitsKHR preTransform0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (VkSurfaceTransformFlagBitsKHR) (_obj.VkSurfaceTransformFlagBitsKHR);
	 */

	/**
	 * native SET method for field compositeAlpha	[vkenum]<br>
	 * Prototype: VkCompositeAlphaFlagBitsKHR  compositeAlpha
	 */ 
	 private static native void compositeAlpha0(ByteBuffer ptr, VkCompositeAlphaFlagBitsKHR _compositeAlpha);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.compositeAlpha = (VkCompositeAlphaFlagBitsKHR) (_compositeAlpha);
	  */

	/**
	 * native GET method for field compositeAlpha	[vkenum]<br>
	 * Prototype: VkCompositeAlphaFlagBitsKHR  compositeAlpha
	 */ 
	 private static native VkCompositeAlphaFlagBitsKHR compositeAlpha0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (VkCompositeAlphaFlagBitsKHR) (_obj.VkCompositeAlphaFlagBitsKHR);
	 */

	/**
	 * native SET method for field presentMode	[vkenum]<br>
	 * Prototype: VkPresentModeKHR  presentMode
	 */ 
	 private static native void presentMode0(ByteBuffer ptr, VkPresentModeKHR _presentMode);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.presentMode = (VkPresentModeKHR) (_presentMode);
	  */

	/**
	 * native GET method for field presentMode	[vkenum]<br>
	 * Prototype: VkPresentModeKHR  presentMode
	 */ 
	 private static native VkPresentModeKHR presentMode0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (VkPresentModeKHR) (_obj.VkPresentModeKHR);
	 */

	/**
	 * native SET method for field clipped	[boolean]<br>
	 * Prototype: VkBool32  clipped
	 */ 
	 private static native void clipped0(ByteBuffer ptr, boolean _clipped);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.clipped = (VkBool32) (_clipped);
	  */

	/**
	 * native GET method for field clipped	[boolean]<br>
	 * Prototype: VkBool32  clipped
	 */ 
	 private static native boolean clipped0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field oldSwapchain	[vkhandle]<br>
	 * Prototype: VkSwapchainKHR  oldSwapchain
	 */ 
	 private static native void oldSwapchain0(ByteBuffer ptr, VkSwapchainKHR _oldSwapchain);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(*ptr);
		  _obj.oldSwapchain = (VkSwapchainKHR) (_oldSwapchain);
	  */

	/**
	 * native GET method for field oldSwapchain	[vkhandle]<br>
	 * Prototype: VkSwapchainKHR  oldSwapchain
	 */ 
	 private static native VkSwapchainKHR oldSwapchain0(ByteBuffer ptr);/*
		  VkSwapchainCreateInfoKHR _obj = (VkSwapchainCreateInfoKHR)(ptr);
		  return (VkSwapchainKHR) (_obj.VkSwapchainKHR);
	 */



} // end of class VkSwapchainCreateInfoKHR
