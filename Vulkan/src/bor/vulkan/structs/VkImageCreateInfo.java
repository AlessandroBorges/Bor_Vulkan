/**
 * Class wrapping Vulkan's VkImageCreateInfo struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.01 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkImageCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkImageCreateInfo {
 *     VkStructureType          sType;
 *     const void*              pNext;
 *     VkImageCreateFlags       flags;
 *     VkImageType              imageType;
 *     VkFormat                 format;
 *     VkExtent3D               extent;
 *     uint32_t                 mipLevels;
 *     uint32_t                 arrayLayers;
 *     VkSampleCountFlagBits    samples;
 *     VkImageTiling            tiling;
 *     VkImageUsageFlags        usage;
 *     VkSharingMode            sharingMode;
 *     uint32_t                 queueFamilyIndexCount;
 *     const uint32_t*          pQueueFamilyIndices;
 *     VkImageLayout            initialLayout;
 * } VkImageCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkImageCreateInfo extends VkStruct {
	/** TAG of this structure [163]  */
	 private static final String TAG = "VkImageCreateInfo";

	/** ID of this structure [163]  */
	 public static final int TAG_ID = VKIMAGECREATEINFO_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType	[vkenum]	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext		 */ 
	P<VkObject> 	pNext;

	/**
	 *  VkImageCreateFlags 	flags		 */ 
	int 	flags;

	/**
	 *  VkImageType 	imageType	[vkenum]	 */ 
	VkImageType 	imageType;

	/**
	 *  VkFormat 	format	[vkenum]	 */ 
	VkFormat 	format;

	/**
	 *  VkExtent3D 	extent	[vkstruct]	 */ 
	VkExtent3D 	extent;

	/**
	 *  uint32_t 	mipLevels		 */ 
	int 	mipLevels;

	/**
	 *  uint32_t 	arrayLayers		 */ 
	int 	arrayLayers;

	/**
	 *  VkSampleCountFlagBits 	samples	[vkenum]	 */ 
	VkSampleCountFlagBits 	samples;

	/**
	 *  VkImageTiling 	tiling	[vkenum]	 */ 
	VkImageTiling 	tiling;

	/**
	 *  VkImageUsageFlags 	usage		 */ 
	int 	usage;

	/**
	 *  VkSharingMode 	sharingMode	[vkenum]	 */ 
	VkSharingMode 	sharingMode;

	/**
	 *  uint32_t 	queueFamilyIndexCount		 */ 
	int 	queueFamilyIndexCount;

	/**
	 *  const uint32_t* 	pQueueFamilyIndices		 */ 
	int[] 	pQueueFamilyIndices;

	/**
	 *  VkImageLayout 	initialLayout	[vkenum]	 */ 
	VkImageLayout 	initialLayout;

	/**
	 * Ctor
	 */
	public VkImageCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(P<VkObject> pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 public P<VkObject> pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field flags	
	 * Prototype: VkImageCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	
	 * Prototype: VkImageCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field imageType	[vkenum]
	 * Prototype: VkImageType  imageType
	 */ 
	 public void imageType(VkImageType imageType){
		 this.imageType = imageType;
		imageType0(super.ptr, imageType);
	 }

	/**
	 * get method for field imageType	[vkenum]
	 * Prototype: VkImageType  imageType
	 */ 
	 public VkImageType imageType(){
		 // return  this.imageType;
		 return imageType0(super.ptr);
	 }

	/**
	 * Set method for field format	[vkenum]
	 * Prototype: VkFormat  format
	 */ 
	 public void format(VkFormat format){
		 this.format = format;
		format0(super.ptr, format);
	 }

	/**
	 * get method for field format	[vkenum]
	 * Prototype: VkFormat  format
	 */ 
	 public VkFormat format(){
		 // return  this.format;
		 return format0(super.ptr);
	 }

	/**
	 * Set method for field extent	[vkstruct]
	 * Prototype: VkExtent3D  extent
	 */ 
	 public void extent(VkExtent3D extent){
		 this.extent = extent;
		extent0(super.ptr, extent);
	 }

	/**
	 * get method for field extent	[vkstruct]
	 * Prototype: VkExtent3D  extent
	 */ 
	 public VkExtent3D extent(){
		 // return  this.extent;
		 return extent0(super.ptr);
	 }

	/**
	 * Set method for field mipLevels	
	 * Prototype: uint32_t  mipLevels
	 */ 
	 public void mipLevels(int mipLevels){
		 this.mipLevels = mipLevels;
		mipLevels0(super.ptr, mipLevels);
	 }

	/**
	 * get method for field mipLevels	
	 * Prototype: uint32_t  mipLevels
	 */ 
	 public int mipLevels(){
		 // return  this.mipLevels;
		 return mipLevels0(super.ptr);
	 }

	/**
	 * Set method for field arrayLayers	
	 * Prototype: uint32_t  arrayLayers
	 */ 
	 public void arrayLayers(int arrayLayers){
		 this.arrayLayers = arrayLayers;
		arrayLayers0(super.ptr, arrayLayers);
	 }

	/**
	 * get method for field arrayLayers	
	 * Prototype: uint32_t  arrayLayers
	 */ 
	 public int arrayLayers(){
		 // return  this.arrayLayers;
		 return arrayLayers0(super.ptr);
	 }

	/**
	 * Set method for field samples	[vkenum]
	 * Prototype: VkSampleCountFlagBits  samples
	 */ 
	 public void samples(VkSampleCountFlagBits samples){
		 this.samples = samples;
		samples0(super.ptr, samples);
	 }

	/**
	 * get method for field samples	[vkenum]
	 * Prototype: VkSampleCountFlagBits  samples
	 */ 
	 public VkSampleCountFlagBits samples(){
		 // return  this.samples;
		 return samples0(super.ptr);
	 }

	/**
	 * Set method for field tiling	[vkenum]
	 * Prototype: VkImageTiling  tiling
	 */ 
	 public void tiling(VkImageTiling tiling){
		 this.tiling = tiling;
		tiling0(super.ptr, tiling);
	 }

	/**
	 * get method for field tiling	[vkenum]
	 * Prototype: VkImageTiling  tiling
	 */ 
	 public VkImageTiling tiling(){
		 // return  this.tiling;
		 return tiling0(super.ptr);
	 }

	/**
	 * Set method for field usage	
	 * Prototype: VkImageUsageFlags  usage
	 */ 
	 public void usage(int usage){
		 this.usage = usage;
		usage0(super.ptr, usage);
	 }

	/**
	 * get method for field usage	
	 * Prototype: VkImageUsageFlags  usage
	 */ 
	 public int usage(){
		 // return  this.usage;
		 return usage0(super.ptr);
	 }

	/**
	 * Set method for field sharingMode	[vkenum]
	 * Prototype: VkSharingMode  sharingMode
	 */ 
	 public void sharingMode(VkSharingMode sharingMode){
		 this.sharingMode = sharingMode;
		sharingMode0(super.ptr, sharingMode);
	 }

	/**
	 * get method for field sharingMode	[vkenum]
	 * Prototype: VkSharingMode  sharingMode
	 */ 
	 public VkSharingMode sharingMode(){
		 // return  this.sharingMode;
		 return sharingMode0(super.ptr);
	 }

	/**
	 * Set method for field queueFamilyIndexCount	
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 public void queueFamilyIndexCount(int queueFamilyIndexCount){
		 this.queueFamilyIndexCount = queueFamilyIndexCount;
		queueFamilyIndexCount0(super.ptr, queueFamilyIndexCount);
	 }

	/**
	 * get method for field queueFamilyIndexCount	
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 public int queueFamilyIndexCount(){
		 // return  this.queueFamilyIndexCount;
		 return queueFamilyIndexCount0(super.ptr);
	 }

	/**
	 * Set method for field pQueueFamilyIndices	
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 public void pQueueFamilyIndices(int[] pQueueFamilyIndices){
		 this.pQueueFamilyIndices = pQueueFamilyIndices;
		pQueueFamilyIndices0(super.ptr, pQueueFamilyIndices);
	 }

	/**
	 * get method for field pQueueFamilyIndices	
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 public int[] pQueueFamilyIndices(){
		 // return  this.pQueueFamilyIndices;
		 return pQueueFamilyIndices0(super.ptr);
	 }

	/**
	 * Set method for field initialLayout	[vkenum]
	 * Prototype: VkImageLayout  initialLayout
	 */ 
	 public void initialLayout(VkImageLayout initialLayout){
		 this.initialLayout = initialLayout;
		initialLayout0(super.ptr, initialLayout);
	 }

	/**
	 * get method for field initialLayout	[vkenum]
	 * Prototype: VkImageLayout  initialLayout
	 */ 
	 public VkImageLayout initialLayout(){
		 // return  this.initialLayout;
		 return initialLayout0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags	
	 * Prototype: VkImageCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(*ptr);
		  _obj.flags = (VkImageCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags	
	 * Prototype: VkImageCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(ptr);
		  return (jint) (_obj.VkImageCreateFlags);
	 */

	/**
	 * native Set method for field imageType	[vkenum]
	 * Prototype: VkImageType  imageType
	 */ 
	 private static native void imageType0(ByteBuffer ptr, VkImageType _imageType);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(*ptr);
		  _obj.imageType = (VkImageType) (_imageType);
	  */

	/**
	 * get method for field imageType	[vkenum]
	 * Prototype: VkImageType  imageType
	 */ 
	 private static native VkImageType imageType0(ByteBuffer ptr);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(ptr);
		  return (VkImageType) (_obj.VkImageType);
	 */

	/**
	 * native Set method for field format	[vkenum]
	 * Prototype: VkFormat  format
	 */ 
	 private static native void format0(ByteBuffer ptr, VkFormat _format);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(*ptr);
		  _obj.format = (VkFormat) (_format);
	  */

	/**
	 * get method for field format	[vkenum]
	 * Prototype: VkFormat  format
	 */ 
	 private static native VkFormat format0(ByteBuffer ptr);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(ptr);
		  return (VkFormat) (_obj.VkFormat);
	 */

	/**
	 * native Set method for field extent	[vkstruct]
	 * Prototype: VkExtent3D  extent
	 */ 
	 private static native void extent0(ByteBuffer ptr, VkExtent3D _extent);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(*ptr);
		  _obj.extent = (VkExtent3D) (_extent);
	  */

	/**
	 * get method for field extent	[vkstruct]
	 * Prototype: VkExtent3D  extent
	 */ 
	 private static native VkExtent3D extent0(ByteBuffer ptr);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(ptr);
		  return (VkExtent3D) (_obj.VkExtent3D);
	 */

	/**
	 * native Set method for field mipLevels	
	 * Prototype: uint32_t  mipLevels
	 */ 
	 private static native void mipLevels0(ByteBuffer ptr, int _mipLevels);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(*ptr);
		  _obj.mipLevels = (uint32_t) (_mipLevels);
	  */

	/**
	 * get method for field mipLevels	
	 * Prototype: uint32_t  mipLevels
	 */ 
	 private static native int mipLevels0(ByteBuffer ptr);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field arrayLayers	
	 * Prototype: uint32_t  arrayLayers
	 */ 
	 private static native void arrayLayers0(ByteBuffer ptr, int _arrayLayers);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(*ptr);
		  _obj.arrayLayers = (uint32_t) (_arrayLayers);
	  */

	/**
	 * get method for field arrayLayers	
	 * Prototype: uint32_t  arrayLayers
	 */ 
	 private static native int arrayLayers0(ByteBuffer ptr);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field samples	[vkenum]
	 * Prototype: VkSampleCountFlagBits  samples
	 */ 
	 private static native void samples0(ByteBuffer ptr, VkSampleCountFlagBits _samples);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(*ptr);
		  _obj.samples = (VkSampleCountFlagBits) (_samples);
	  */

	/**
	 * get method for field samples	[vkenum]
	 * Prototype: VkSampleCountFlagBits  samples
	 */ 
	 private static native VkSampleCountFlagBits samples0(ByteBuffer ptr);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(ptr);
		  return (VkSampleCountFlagBits) (_obj.VkSampleCountFlagBits);
	 */

	/**
	 * native Set method for field tiling	[vkenum]
	 * Prototype: VkImageTiling  tiling
	 */ 
	 private static native void tiling0(ByteBuffer ptr, VkImageTiling _tiling);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(*ptr);
		  _obj.tiling = (VkImageTiling) (_tiling);
	  */

	/**
	 * get method for field tiling	[vkenum]
	 * Prototype: VkImageTiling  tiling
	 */ 
	 private static native VkImageTiling tiling0(ByteBuffer ptr);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(ptr);
		  return (VkImageTiling) (_obj.VkImageTiling);
	 */

	/**
	 * native Set method for field usage	
	 * Prototype: VkImageUsageFlags  usage
	 */ 
	 private static native void usage0(ByteBuffer ptr, int _usage);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(*ptr);
		  _obj.usage = (VkImageUsageFlags) (_usage);
	  */

	/**
	 * get method for field usage	
	 * Prototype: VkImageUsageFlags  usage
	 */ 
	 private static native int usage0(ByteBuffer ptr);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(ptr);
		  return (jint) (_obj.VkImageUsageFlags);
	 */

	/**
	 * native Set method for field sharingMode	[vkenum]
	 * Prototype: VkSharingMode  sharingMode
	 */ 
	 private static native void sharingMode0(ByteBuffer ptr, VkSharingMode _sharingMode);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(*ptr);
		  _obj.sharingMode = (VkSharingMode) (_sharingMode);
	  */

	/**
	 * get method for field sharingMode	[vkenum]
	 * Prototype: VkSharingMode  sharingMode
	 */ 
	 private static native VkSharingMode sharingMode0(ByteBuffer ptr);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(ptr);
		  return (VkSharingMode) (_obj.VkSharingMode);
	 */

	/**
	 * native Set method for field queueFamilyIndexCount	
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 private static native void queueFamilyIndexCount0(ByteBuffer ptr, int _queueFamilyIndexCount);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(*ptr);
		  _obj.queueFamilyIndexCount = (uint32_t) (_queueFamilyIndexCount);
	  */

	/**
	 * get method for field queueFamilyIndexCount	
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 private static native int queueFamilyIndexCount0(ByteBuffer ptr);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pQueueFamilyIndices	
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 private static native void pQueueFamilyIndices0(ByteBuffer ptr, int[] _pQueueFamilyIndices);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(*ptr);
		  _obj.pQueueFamilyIndices = (const uint32_t*) (_pQueueFamilyIndices);
	  */

	/**
	 * get method for field pQueueFamilyIndices	
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 private static native int[] pQueueFamilyIndices0(ByteBuffer ptr);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(ptr);
		  return (int[]) (_obj.const uint32_t*);
	 */

	/**
	 * native Set method for field initialLayout	[vkenum]
	 * Prototype: VkImageLayout  initialLayout
	 */ 
	 private static native void initialLayout0(ByteBuffer ptr, VkImageLayout _initialLayout);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(*ptr);
		  _obj.initialLayout = (VkImageLayout) (_initialLayout);
	  */

	/**
	 * get method for field initialLayout	[vkenum]
	 * Prototype: VkImageLayout  initialLayout
	 */ 
	 private static native VkImageLayout initialLayout0(ByteBuffer ptr);/*
		  VkImageCreateInfo _obj = (VkImageCreateInfo)(ptr);
		  return (VkImageLayout) (_obj.VkImageLayout);
	 */



} // end of class VkImageCreateInfo
