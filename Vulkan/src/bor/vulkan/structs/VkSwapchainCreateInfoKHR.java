/**
 * Class wrapping Vulkan's VkSwapchainCreateInfoKHR struct.
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
 * @version Ver. 0.8.65 (beta) 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	/** 
	 * Static method to create a VkArray for this VkStruct subclass.
	 * @param size - number of elements
	 */
	 public static VkArray<VkSwapchainCreateInfoKHR> createVkArray(int size){ 
		 VkSwapchainCreateInfoKHR[] array = new VkSwapchainCreateInfoKHR[size]; 
		 VkArrayStruct<VkSwapchainCreateInfoKHR> vkArray = new VkArrayStruct<VkSwapchainCreateInfoKHR>(array, TAG_ID);
		 return vkArray; 
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
	 public VkSwapchainCreateInfoKHR sType(VkStructureType sType){
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
	 public VkSwapchainCreateInfoKHR pNext(VkObject pNext){
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
	 * Prototype: VkSwapchainCreateFlagsKHR  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSwapchainCreateInfoKHR flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
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
	 * 
	 * @param surface - a instance of VkSurfaceKHR.
	 * @return this VkStruct instance.
	 */ 
	 public VkSwapchainCreateInfoKHR surface(VkSurfaceKHR surface){
		 this.surface = surface;
		 long handle = (surface==null) ? 0L : surface.getNativeHandle();
		 setSurface0(this.ptr, handle);
		 return this;
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
		    ((VkHandle)this.surface).setNativeHandle(handle);
		  }
		 return this.surface;
	 }

	/**
	 * Set method for field minImageCount	[int]<br>
	 * Prototype: uint32_t  minImageCount
	 * 
	 * @param minImageCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSwapchainCreateInfoKHR minImageCount(int minImageCount){
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
	 * Set method for field imageFormat	[vkenum]<br>
	 * Prototype: VkFormat  imageFormat
	 * 
	 * @param imageFormat - a instance of VkFormat.
	 * @return this VkStruct instance.
	 */ 
	 public VkSwapchainCreateInfoKHR imageFormat(VkFormat imageFormat){
		 this.imageFormat = imageFormat;
		 int enumVal = imageFormat.getValue();
		 setImageFormat0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param imageColorSpace - a instance of VkColorSpaceKHR.
	 * @return this VkStruct instance.
	 */ 
	 public VkSwapchainCreateInfoKHR imageColorSpace(VkColorSpaceKHR imageColorSpace){
		 this.imageColorSpace = imageColorSpace;
		 int enumVal = imageColorSpace.getValue();
		 setImageColorSpace0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param imageExtent - a instance of VkExtent2D.
	 * @return this VkStruct instance.
	 */ 
	 public VkSwapchainCreateInfoKHR imageExtent(VkExtent2D imageExtent){
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

	/**
	 * Set method for field imageArrayLayers	[int]<br>
	 * Prototype: uint32_t  imageArrayLayers
	 * 
	 * @param imageArrayLayers - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSwapchainCreateInfoKHR imageArrayLayers(int imageArrayLayers){
		 this.imageArrayLayers = imageArrayLayers;
		 setImageArrayLayers0(this.ptr,  imageArrayLayers);
		 return this;
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
	 * 
	 * @param imageUsage - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSwapchainCreateInfoKHR imageUsage(int imageUsage){
		 this.imageUsage = imageUsage;
		 setImageUsage0(this.ptr,  imageUsage);
		 return this;
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
	 * 
	 * @param imageSharingMode - a instance of VkSharingMode.
	 * @return this VkStruct instance.
	 */ 
	 public VkSwapchainCreateInfoKHR imageSharingMode(VkSharingMode imageSharingMode){
		 this.imageSharingMode = imageSharingMode;
		 int enumVal = imageSharingMode.getValue();
		 setImageSharingMode0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param queueFamilyIndexCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSwapchainCreateInfoKHR queueFamilyIndexCount(int queueFamilyIndexCount){
		 this.queueFamilyIndexCount = queueFamilyIndexCount;
		 setQueueFamilyIndexCount0(this.ptr,  queueFamilyIndexCount);
		 return this;
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
	 * Set method for field pQueueFamilyIndices	[int]<br>
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 * 
	 * @param pQueueFamilyIndices - a instance of int[].
	 * @return this VkStruct instance.
	 */ 
	 public VkSwapchainCreateInfoKHR pQueueFamilyIndices(int[] pQueueFamilyIndices){
		 this.pQueueFamilyIndices = pQueueFamilyIndices;
		 setPQueueFamilyIndices0(this.ptr,  pQueueFamilyIndices);
		 return this;
	 }

	/**
	 * Get method for field pQueueFamilyIndices	[int]<br>
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 public int[] pQueueFamilyIndices(){
		 int[] var = getPQueueFamilyIndices0(super.ptr, pQueueFamilyIndices);
		 this.pQueueFamilyIndices = var;
		 return this.pQueueFamilyIndices;
	 }

	/**
	 * Set method for field preTransform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  preTransform
	 * 
	 * @param preTransform - a instance of VkSurfaceTransformFlagBitsKHR.
	 * @return this VkStruct instance.
	 */ 
	 public VkSwapchainCreateInfoKHR preTransform(VkSurfaceTransformFlagBitsKHR preTransform){
		 this.preTransform = preTransform;
		 int enumVal = preTransform.getValue();
		 setPreTransform0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param compositeAlpha - a instance of VkCompositeAlphaFlagBitsKHR.
	 * @return this VkStruct instance.
	 */ 
	 public VkSwapchainCreateInfoKHR compositeAlpha(VkCompositeAlphaFlagBitsKHR compositeAlpha){
		 this.compositeAlpha = compositeAlpha;
		 int enumVal = compositeAlpha.getValue();
		 setCompositeAlpha0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param presentMode - a instance of VkPresentModeKHR.
	 * @return this VkStruct instance.
	 */ 
	 public VkSwapchainCreateInfoKHR presentMode(VkPresentModeKHR presentMode){
		 this.presentMode = presentMode;
		 int enumVal = presentMode.getValue();
		 setPresentMode0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param clipped - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkSwapchainCreateInfoKHR clipped(boolean clipped){
		 this.clipped = clipped;
		 setClipped0(this.ptr,  clipped);
		 return this;
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
	 * 
	 * @param oldSwapchain - a instance of VkSwapchainKHR.
	 * @return this VkStruct instance.
	 */ 
	 public VkSwapchainCreateInfoKHR oldSwapchain(VkSwapchainKHR oldSwapchain){
		 this.oldSwapchain = oldSwapchain;
		 long handle = (oldSwapchain==null) ? 0L : oldSwapchain.getNativeHandle();
		 setOldSwapchain0(this.ptr, handle);
		 return this;
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
		    ((VkHandle)this.oldSwapchain).setNativeHandle(handle);
		  }
		 return this.oldSwapchain;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkSwapchainCreateInfoKHR [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n surface: ")
				.append(surface() )
				.append(",\n minImageCount: ")
				.append(minImageCount() )
				.append(",\n imageFormat: ")
				.append(imageFormat() )
				.append(",\n imageColorSpace: ")
				.append(imageColorSpace() )
				.append(",\n imageExtent: ")
				.append(imageExtent() )
				.append(",\n imageArrayLayers: ")
				.append(imageArrayLayers() )
				.append(",\n imageUsage: ")
				.append(imageUsage() )
				.append(",\n imageSharingMode: ")
				.append(imageSharingMode() )
				.append(",\n queueFamilyIndexCount: ")
				.append(queueFamilyIndexCount() )
				.append(",\n pQueueFamilyIndices: ")
				.append(Arrays.toString(pQueueFamilyIndices()) )
				.append(",\n preTransform: ")
				.append(preTransform() )
				.append(",\n compositeAlpha: ")
				.append(compositeAlpha() )
				.append(",\n presentMode: ")
				.append(presentMode() )
				.append(",\n clipped: ")
				.append(clipped() )
				.append(",\n oldSwapchain: ")
				.append(oldSwapchain() )
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
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkSwapchainCreateFlagsKHR  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkSwapchainCreateFlagsKHR) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkSwapchainCreateFlagsKHR  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field surface	[vkhandle]<br>
	 * Prototype: VkSurfaceKHR  surface
	 */ 
	 private static native void setSurface0(Buffer ptr, long  _surface);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->surface = (VkSurfaceKHR) (_surface);
	  */

	/**
	 * Native GET method for field surface	[vkhandle]<br>
	 * Prototype: VkSurfaceKHR  surface
	 */ 
	 private static native long getSurface0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->surface);
	 */

	/**
	 * Native SET method for field minImageCount	[int]<br>
	 * Prototype: uint32_t  minImageCount
	 */ 
	 private static native void setMinImageCount0(Buffer ptr, int _minImageCount);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->minImageCount = (uint32_t) (_minImageCount);
	  */

	/**
	 * Native GET method for field minImageCount	[int]<br>
	 * Prototype: uint32_t  minImageCount
	 */ 
	 private static native int getMinImageCount0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->minImageCount);
	 */

	/**
	 * Native SET method for field imageFormat	[vkenum]<br>
	 * Prototype: VkFormat  imageFormat
	 */ 
	 private static native void setImageFormat0(Buffer ptr, int  _imageFormat);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->imageFormat = (VkFormat) (_imageFormat);
	  */

	/**
	 * Native GET method for field imageFormat	[vkenum]<br>
	 * Prototype: VkFormat  imageFormat
	 */ 
	 private static native int getImageFormat0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->imageFormat);
	 */

	/**
	 * Native SET method for field imageColorSpace	[vkenum]<br>
	 * Prototype: VkColorSpaceKHR  imageColorSpace
	 */ 
	 private static native void setImageColorSpace0(Buffer ptr, int  _imageColorSpace);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->imageColorSpace = (VkColorSpaceKHR) (_imageColorSpace);
	  */

	/**
	 * Native GET method for field imageColorSpace	[vkenum]<br>
	 * Prototype: VkColorSpaceKHR  imageColorSpace
	 */ 
	 private static native int getImageColorSpace0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->imageColorSpace);
	 */

	/**
	 * Native SET method for field imageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  imageExtent
	 */ 
	 private static native void setImageExtent0(Buffer ptr, java.nio.ByteBuffer  _imageExtent);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent2D* p_imageExtent = (VkExtent2D*) _imageExtent; 
		 vkObj->imageExtent = (*p_imageExtent); 
	  */

	/**
	 * Native GET method for field imageExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  imageExtent
	 */ 
	 private static native long getImageExtent0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->imageExtent);
	 */

	/**
	 * Native SET method for field imageArrayLayers	[int]<br>
	 * Prototype: uint32_t  imageArrayLayers
	 */ 
	 private static native void setImageArrayLayers0(Buffer ptr, int _imageArrayLayers);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->imageArrayLayers = (uint32_t) (_imageArrayLayers);
	  */

	/**
	 * Native GET method for field imageArrayLayers	[int]<br>
	 * Prototype: uint32_t  imageArrayLayers
	 */ 
	 private static native int getImageArrayLayers0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->imageArrayLayers);
	 */

	/**
	 * Native SET method for field imageUsage	[int]<br>
	 * Prototype: VkImageUsageFlags  imageUsage
	 */ 
	 private static native void setImageUsage0(Buffer ptr, int _imageUsage);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->imageUsage = (VkImageUsageFlags) (_imageUsage);
	  */

	/**
	 * Native GET method for field imageUsage	[int]<br>
	 * Prototype: VkImageUsageFlags  imageUsage
	 */ 
	 private static native int getImageUsage0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->imageUsage);
	 */

	/**
	 * Native SET method for field imageSharingMode	[vkenum]<br>
	 * Prototype: VkSharingMode  imageSharingMode
	 */ 
	 private static native void setImageSharingMode0(Buffer ptr, int  _imageSharingMode);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->imageSharingMode = (VkSharingMode) (_imageSharingMode);
	  */

	/**
	 * Native GET method for field imageSharingMode	[vkenum]<br>
	 * Prototype: VkSharingMode  imageSharingMode
	 */ 
	 private static native int getImageSharingMode0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->imageSharingMode);
	 */

	/**
	 * Native SET method for field queueFamilyIndexCount	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 private static native void setQueueFamilyIndexCount0(Buffer ptr, int _queueFamilyIndexCount);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->queueFamilyIndexCount = (uint32_t) (_queueFamilyIndexCount);
	  */

	/**
	 * Native GET method for field queueFamilyIndexCount	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 private static native int getQueueFamilyIndexCount0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->queueFamilyIndexCount);
	 */

	/**
	 * Native SET method for field pQueueFamilyIndices	[int]<br>
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 private static native void setPQueueFamilyIndices0(Buffer ptr, int[] _pQueueFamilyIndices);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for generic array assignment 
		 uint32_t* temp = const_cast<uint32_t*>(vkObj->pQueueFamilyIndices);
		 if(temp) { free(temp); } 
		 vkObj->pQueueFamilyIndices = NULL; 
		 if( _pQueueFamilyIndices == NULL){ 
		    vkObj->queueFamilyIndexCount = 0; 
		     return;
		  }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pQueueFamilyIndices); 
		  temp = CALLOC(count, uint32_t); 
		  memcpy( temp, _pQueueFamilyIndices, count * sizeof(uint32_t)); 
		  vkObj->pQueueFamilyIndices = temp; 
		  vkObj->queueFamilyIndexCount = count;
	  */

	/**
	 * Native GET method for field pQueueFamilyIndices	[int]<br>
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 private static native int[] getPQueueFamilyIndices0(Buffer ptr, int[] _pQueueFamilyIndices);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  // generic get for C type array, with content copy 
		  if( 0 == vkObj->queueFamilyIndexCount){ 
		     return NULL;
		   }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pQueueFamilyIndices);
		  if(vkObj->pQueueFamilyIndices == NULL){
		    return NULL;
		   }
 		  memcpy(_pQueueFamilyIndices, vkObj->pQueueFamilyIndices, count * sizeof(uint32_t));
		  return obj__pQueueFamilyIndices;
	 */

	/**
	 * Native SET method for field preTransform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  preTransform
	 */ 
	 private static native void setPreTransform0(Buffer ptr, int  _preTransform);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->preTransform = (VkSurfaceTransformFlagBitsKHR) (_preTransform);
	  */

	/**
	 * Native GET method for field preTransform	[vkenum]<br>
	 * Prototype: VkSurfaceTransformFlagBitsKHR  preTransform
	 */ 
	 private static native int getPreTransform0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->preTransform);
	 */

	/**
	 * Native SET method for field compositeAlpha	[vkenum]<br>
	 * Prototype: VkCompositeAlphaFlagBitsKHR  compositeAlpha
	 */ 
	 private static native void setCompositeAlpha0(Buffer ptr, int  _compositeAlpha);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->compositeAlpha = (VkCompositeAlphaFlagBitsKHR) (_compositeAlpha);
	  */

	/**
	 * Native GET method for field compositeAlpha	[vkenum]<br>
	 * Prototype: VkCompositeAlphaFlagBitsKHR  compositeAlpha
	 */ 
	 private static native int getCompositeAlpha0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->compositeAlpha);
	 */

	/**
	 * Native SET method for field presentMode	[vkenum]<br>
	 * Prototype: VkPresentModeKHR  presentMode
	 */ 
	 private static native void setPresentMode0(Buffer ptr, int  _presentMode);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->presentMode = (VkPresentModeKHR) (_presentMode);
	  */

	/**
	 * Native GET method for field presentMode	[vkenum]<br>
	 * Prototype: VkPresentModeKHR  presentMode
	 */ 
	 private static native int getPresentMode0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->presentMode);
	 */

	/**
	 * Native SET method for field clipped	[boolean]<br>
	 * Prototype: VkBool32  clipped
	 */ 
	 private static native void setClipped0(Buffer ptr, boolean  _clipped);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->clipped = (VkBool32) (_clipped);
	  */

	/**
	 * Native GET method for field clipped	[boolean]<br>
	 * Prototype: VkBool32  clipped
	 */ 
	 private static native boolean  getClipped0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (jboolean) (vkObj->clipped);
	 */

	/**
	 * Native SET method for field oldSwapchain	[vkhandle]<br>
	 * Prototype: VkSwapchainKHR  oldSwapchain
	 */ 
	 private static native void setOldSwapchain0(Buffer ptr, long  _oldSwapchain);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->oldSwapchain = (VkSwapchainKHR) (_oldSwapchain);
	  */

	/**
	 * Native GET method for field oldSwapchain	[vkhandle]<br>
	 * Prototype: VkSwapchainKHR  oldSwapchain
	 */ 
	 private static native long getOldSwapchain0(Buffer ptr);/*
		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->oldSwapchain);
	 */



} // end of class VkSwapchainCreateInfoKHR
