/**
 * Class wrapping Vulkan's VkSamplerCreateInfo struct.
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

import java.nio.Buffer;


/**
 *  Project Bor-Vulkan 
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkSamplerCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSamplerCreateInfo {
 *     VkStructureType         sType;
 *     const void*             pNext;
 *     VkSamplerCreateFlags    flags;
 *     VkFilter                magFilter;
 *     VkFilter                minFilter;
 *     VkSamplerMipmapMode     mipmapMode;
 *     VkSamplerAddressMode    addressModeU;
 *     VkSamplerAddressMode    addressModeV;
 *     VkSamplerAddressMode    addressModeW;
 *     float                   mipLodBias;
 *     VkBool32                anisotropyEnable;
 *     float                   maxAnisotropy;
 *     VkBool32                compareEnable;
 *     VkCompareOp             compareOp;
 *     float                   minLod;
 *     float                   maxLod;
 *     VkBorderColor           borderColor;
 *     VkBool32                unnormalizedCoordinates;
 * } VkSamplerCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkSamplerCreateInfo extends VkStruct {
	/** TAG of this structure [70]  */
	 private static final String TAG = "VkSamplerCreateInfo";

	/** ID of this structure [70]  */
	 public static final int TAG_ID = VKSAMPLERCREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkSamplerCreateInfo> p;

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
	 *  VkSamplerCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  VkFilter 	magFilter	[vkenum]
	 */ 
	 VkFilter 	magFilter;

	/**
	 *  VkFilter 	minFilter	[vkenum]
	 */ 
	 VkFilter 	minFilter;

	/**
	 *  VkSamplerMipmapMode 	mipmapMode	[vkenum]
	 */ 
	 VkSamplerMipmapMode 	mipmapMode;

	/**
	 *  VkSamplerAddressMode 	addressModeU	[vkenum]
	 */ 
	 VkSamplerAddressMode 	addressModeU;

	/**
	 *  VkSamplerAddressMode 	addressModeV	[vkenum]
	 */ 
	 VkSamplerAddressMode 	addressModeV;

	/**
	 *  VkSamplerAddressMode 	addressModeW	[vkenum]
	 */ 
	 VkSamplerAddressMode 	addressModeW;

	/**
	 *  float 	mipLodBias	[float]
	 */ 
	 float 	mipLodBias;

	/**
	 *  VkBool32 	anisotropyEnable	[boolean]
	 */ 
	 boolean 	anisotropyEnable;

	/**
	 *  float 	maxAnisotropy	[float]
	 */ 
	 float 	maxAnisotropy;

	/**
	 *  VkBool32 	compareEnable	[boolean]
	 */ 
	 boolean 	compareEnable;

	/**
	 *  VkCompareOp 	compareOp	[vkenum]
	 */ 
	 VkCompareOp 	compareOp;

	/**
	 *  float 	minLod	[float]
	 */ 
	 float 	minLod;

	/**
	 *  float 	maxLod	[float]
	 */ 
	 float 	maxLod;

	/**
	 *  VkBorderColor 	borderColor	[vkenum]
	 */ 
	 VkBorderColor 	borderColor;

	/**
	 *  VkBool32 	unnormalizedCoordinates	[boolean]
	 */ 
	 boolean 	unnormalizedCoordinates;

	/**
	 * Ctor
	 */
	public VkSamplerCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSamplerCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkSamplerCreateInfo(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkSamplerCreateInfo(long address){ 
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
	 public static P<VkSamplerCreateInfo> createNullPointer(){
	        P<VkSamplerCreateInfo> p = new  P<VkSamplerCreateInfo>(new VkSamplerCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkSamplerCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkSamplerCreateInfo> (this);
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
	 * Prototype: VkSamplerCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkSamplerCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field magFilter	[vkenum]<br>
	 * Prototype: VkFilter  magFilter
	 */ 
	 public void magFilter(VkFilter magFilter){
		 this.magFilter = magFilter;
		 int enumVal = magFilter.getValue();
		 setMagFilter0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field magFilter	[vkenum]<br>
	 * Prototype: VkFilter  magFilter
	 */ 
	 public VkFilter magFilter(){
		 int nativeVal = getMagFilter0(super.ptr);
		 this.magFilter = VkFilter.fromValue(nativeVal); 
		 return this.magFilter;
	 }

	/**
	 * Set method for field minFilter	[vkenum]<br>
	 * Prototype: VkFilter  minFilter
	 */ 
	 public void minFilter(VkFilter minFilter){
		 this.minFilter = minFilter;
		 int enumVal = minFilter.getValue();
		 setMinFilter0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field minFilter	[vkenum]<br>
	 * Prototype: VkFilter  minFilter
	 */ 
	 public VkFilter minFilter(){
		 int nativeVal = getMinFilter0(super.ptr);
		 this.minFilter = VkFilter.fromValue(nativeVal); 
		 return this.minFilter;
	 }

	/**
	 * Set method for field mipmapMode	[vkenum]<br>
	 * Prototype: VkSamplerMipmapMode  mipmapMode
	 */ 
	 public void mipmapMode(VkSamplerMipmapMode mipmapMode){
		 this.mipmapMode = mipmapMode;
		 int enumVal = mipmapMode.getValue();
		 setMipmapMode0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field mipmapMode	[vkenum]<br>
	 * Prototype: VkSamplerMipmapMode  mipmapMode
	 */ 
	 public VkSamplerMipmapMode mipmapMode(){
		 int nativeVal = getMipmapMode0(super.ptr);
		 this.mipmapMode = VkSamplerMipmapMode.fromValue(nativeVal); 
		 return this.mipmapMode;
	 }

	/**
	 * Set method for field addressModeU	[vkenum]<br>
	 * Prototype: VkSamplerAddressMode  addressModeU
	 */ 
	 public void addressModeU(VkSamplerAddressMode addressModeU){
		 this.addressModeU = addressModeU;
		 int enumVal = addressModeU.getValue();
		 setAddressModeU0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field addressModeU	[vkenum]<br>
	 * Prototype: VkSamplerAddressMode  addressModeU
	 */ 
	 public VkSamplerAddressMode addressModeU(){
		 int nativeVal = getAddressModeU0(super.ptr);
		 this.addressModeU = VkSamplerAddressMode.fromValue(nativeVal); 
		 return this.addressModeU;
	 }

	/**
	 * Set method for field addressModeV	[vkenum]<br>
	 * Prototype: VkSamplerAddressMode  addressModeV
	 */ 
	 public void addressModeV(VkSamplerAddressMode addressModeV){
		 this.addressModeV = addressModeV;
		 int enumVal = addressModeV.getValue();
		 setAddressModeV0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field addressModeV	[vkenum]<br>
	 * Prototype: VkSamplerAddressMode  addressModeV
	 */ 
	 public VkSamplerAddressMode addressModeV(){
		 int nativeVal = getAddressModeV0(super.ptr);
		 this.addressModeV = VkSamplerAddressMode.fromValue(nativeVal); 
		 return this.addressModeV;
	 }

	/**
	 * Set method for field addressModeW	[vkenum]<br>
	 * Prototype: VkSamplerAddressMode  addressModeW
	 */ 
	 public void addressModeW(VkSamplerAddressMode addressModeW){
		 this.addressModeW = addressModeW;
		 int enumVal = addressModeW.getValue();
		 setAddressModeW0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field addressModeW	[vkenum]<br>
	 * Prototype: VkSamplerAddressMode  addressModeW
	 */ 
	 public VkSamplerAddressMode addressModeW(){
		 int nativeVal = getAddressModeW0(super.ptr);
		 this.addressModeW = VkSamplerAddressMode.fromValue(nativeVal); 
		 return this.addressModeW;
	 }

	/**
	 * Set method for field mipLodBias	[float]<br>
	 * Prototype: float  mipLodBias
	 */ 
	 public void mipLodBias(float mipLodBias){
		 this.mipLodBias = mipLodBias;
		 setMipLodBias0(this.ptr,  mipLodBias);
	 }

	/**
	 * Get method for field mipLodBias	[float]<br>
	 * Prototype: float  mipLodBias
	 */ 
	 public float mipLodBias(){
		 float var = getMipLodBias0(super.ptr);
		 this.mipLodBias = var;
		 return this.mipLodBias;
	 }

	/**
	 * Set method for field anisotropyEnable	[boolean]<br>
	 * Prototype: VkBool32  anisotropyEnable
	 */ 
	 public void anisotropyEnable(boolean anisotropyEnable){
		 this.anisotropyEnable = anisotropyEnable;
		 setAnisotropyEnable0(this.ptr,  anisotropyEnable);
	 }

	/**
	 * Get method for field anisotropyEnable	[boolean]<br>
	 * Prototype: VkBool32  anisotropyEnable
	 */ 
	 public boolean anisotropyEnable(){
		 boolean var = getAnisotropyEnable0(super.ptr);
		 this.anisotropyEnable = var;
		 return this.anisotropyEnable;
	 }

	/**
	 * Set method for field maxAnisotropy	[float]<br>
	 * Prototype: float  maxAnisotropy
	 */ 
	 public void maxAnisotropy(float maxAnisotropy){
		 this.maxAnisotropy = maxAnisotropy;
		 setMaxAnisotropy0(this.ptr,  maxAnisotropy);
	 }

	/**
	 * Get method for field maxAnisotropy	[float]<br>
	 * Prototype: float  maxAnisotropy
	 */ 
	 public float maxAnisotropy(){
		 float var = getMaxAnisotropy0(super.ptr);
		 this.maxAnisotropy = var;
		 return this.maxAnisotropy;
	 }

	/**
	 * Set method for field compareEnable	[boolean]<br>
	 * Prototype: VkBool32  compareEnable
	 */ 
	 public void compareEnable(boolean compareEnable){
		 this.compareEnable = compareEnable;
		 setCompareEnable0(this.ptr,  compareEnable);
	 }

	/**
	 * Get method for field compareEnable	[boolean]<br>
	 * Prototype: VkBool32  compareEnable
	 */ 
	 public boolean compareEnable(){
		 boolean var = getCompareEnable0(super.ptr);
		 this.compareEnable = var;
		 return this.compareEnable;
	 }

	/**
	 * Set method for field compareOp	[vkenum]<br>
	 * Prototype: VkCompareOp  compareOp
	 */ 
	 public void compareOp(VkCompareOp compareOp){
		 this.compareOp = compareOp;
		 int enumVal = compareOp.getValue();
		 setCompareOp0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field compareOp	[vkenum]<br>
	 * Prototype: VkCompareOp  compareOp
	 */ 
	 public VkCompareOp compareOp(){
		 int nativeVal = getCompareOp0(super.ptr);
		 this.compareOp = VkCompareOp.fromValue(nativeVal); 
		 return this.compareOp;
	 }

	/**
	 * Set method for field minLod	[float]<br>
	 * Prototype: float  minLod
	 */ 
	 public void minLod(float minLod){
		 this.minLod = minLod;
		 setMinLod0(this.ptr,  minLod);
	 }

	/**
	 * Get method for field minLod	[float]<br>
	 * Prototype: float  minLod
	 */ 
	 public float minLod(){
		 float var = getMinLod0(super.ptr);
		 this.minLod = var;
		 return this.minLod;
	 }

	/**
	 * Set method for field maxLod	[float]<br>
	 * Prototype: float  maxLod
	 */ 
	 public void maxLod(float maxLod){
		 this.maxLod = maxLod;
		 setMaxLod0(this.ptr,  maxLod);
	 }

	/**
	 * Get method for field maxLod	[float]<br>
	 * Prototype: float  maxLod
	 */ 
	 public float maxLod(){
		 float var = getMaxLod0(super.ptr);
		 this.maxLod = var;
		 return this.maxLod;
	 }

	/**
	 * Set method for field borderColor	[vkenum]<br>
	 * Prototype: VkBorderColor  borderColor
	 */ 
	 public void borderColor(VkBorderColor borderColor){
		 this.borderColor = borderColor;
		 int enumVal = borderColor.getValue();
		 setBorderColor0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field borderColor	[vkenum]<br>
	 * Prototype: VkBorderColor  borderColor
	 */ 
	 public VkBorderColor borderColor(){
		 int nativeVal = getBorderColor0(super.ptr);
		 this.borderColor = VkBorderColor.fromValue(nativeVal); 
		 return this.borderColor;
	 }

	/**
	 * Set method for field unnormalizedCoordinates	[boolean]<br>
	 * Prototype: VkBool32  unnormalizedCoordinates
	 */ 
	 public void unnormalizedCoordinates(boolean unnormalizedCoordinates){
		 this.unnormalizedCoordinates = unnormalizedCoordinates;
		 setUnnormalizedCoordinates0(this.ptr,  unnormalizedCoordinates);
	 }

	/**
	 * Get method for field unnormalizedCoordinates	[boolean]<br>
	 * Prototype: VkBool32  unnormalizedCoordinates
	 */ 
	 public boolean unnormalizedCoordinates(){
		 boolean var = getUnnormalizedCoordinates0(super.ptr);
		 this.unnormalizedCoordinates = var;
		 return this.unnormalizedCoordinates;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkSamplerCreateInfo vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkSamplerCreateInfo vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkSamplerCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  vkObj->flags = (VkSamplerCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkSamplerCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkSamplerCreateInfo vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field magFilter	[vkenum]<br>
	 * Prototype: VkFilter  magFilter
	 */ 
	 private static native void setMagFilter0(Buffer ptr, int  _magFilter);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  vkObj->magFilter = (VkFilter) (_magFilter);
	  */

	/**
	 * native GET method for field magFilter	[vkenum]<br>
	 * Prototype: VkFilter  magFilter
	 */ 
	 private static native int  getMagFilter0(Buffer ptr);/*
		  VkSamplerCreateInfo vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (VkFilter) (vkObj->magFilter);
	 */

	/**
	 * native SET method for field minFilter	[vkenum]<br>
	 * Prototype: VkFilter  minFilter
	 */ 
	 private static native void setMinFilter0(Buffer ptr, int  _minFilter);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  vkObj->minFilter = (VkFilter) (_minFilter);
	  */

	/**
	 * native GET method for field minFilter	[vkenum]<br>
	 * Prototype: VkFilter  minFilter
	 */ 
	 private static native int  getMinFilter0(Buffer ptr);/*
		  VkSamplerCreateInfo vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (VkFilter) (vkObj->minFilter);
	 */

	/**
	 * native SET method for field mipmapMode	[vkenum]<br>
	 * Prototype: VkSamplerMipmapMode  mipmapMode
	 */ 
	 private static native void setMipmapMode0(Buffer ptr, int  _mipmapMode);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  vkObj->mipmapMode = (VkSamplerMipmapMode) (_mipmapMode);
	  */

	/**
	 * native GET method for field mipmapMode	[vkenum]<br>
	 * Prototype: VkSamplerMipmapMode  mipmapMode
	 */ 
	 private static native int  getMipmapMode0(Buffer ptr);/*
		  VkSamplerCreateInfo vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (VkSamplerMipmapMode) (vkObj->mipmapMode);
	 */

	/**
	 * native SET method for field addressModeU	[vkenum]<br>
	 * Prototype: VkSamplerAddressMode  addressModeU
	 */ 
	 private static native void setAddressModeU0(Buffer ptr, int  _addressModeU);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  vkObj->addressModeU = (VkSamplerAddressMode) (_addressModeU);
	  */

	/**
	 * native GET method for field addressModeU	[vkenum]<br>
	 * Prototype: VkSamplerAddressMode  addressModeU
	 */ 
	 private static native int  getAddressModeU0(Buffer ptr);/*
		  VkSamplerCreateInfo vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (VkSamplerAddressMode) (vkObj->addressModeU);
	 */

	/**
	 * native SET method for field addressModeV	[vkenum]<br>
	 * Prototype: VkSamplerAddressMode  addressModeV
	 */ 
	 private static native void setAddressModeV0(Buffer ptr, int  _addressModeV);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  vkObj->addressModeV = (VkSamplerAddressMode) (_addressModeV);
	  */

	/**
	 * native GET method for field addressModeV	[vkenum]<br>
	 * Prototype: VkSamplerAddressMode  addressModeV
	 */ 
	 private static native int  getAddressModeV0(Buffer ptr);/*
		  VkSamplerCreateInfo vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (VkSamplerAddressMode) (vkObj->addressModeV);
	 */

	/**
	 * native SET method for field addressModeW	[vkenum]<br>
	 * Prototype: VkSamplerAddressMode  addressModeW
	 */ 
	 private static native void setAddressModeW0(Buffer ptr, int  _addressModeW);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  vkObj->addressModeW = (VkSamplerAddressMode) (_addressModeW);
	  */

	/**
	 * native GET method for field addressModeW	[vkenum]<br>
	 * Prototype: VkSamplerAddressMode  addressModeW
	 */ 
	 private static native int  getAddressModeW0(Buffer ptr);/*
		  VkSamplerCreateInfo vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (VkSamplerAddressMode) (vkObj->addressModeW);
	 */

	/**
	 * native SET method for field mipLodBias	[float]<br>
	 * Prototype: float  mipLodBias
	 */ 
	 private static native void setMipLodBias0(Buffer ptr, float _mipLodBias);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  vkObj->mipLodBias = (float) (_mipLodBias);
	  */

	/**
	 * native GET method for field mipLodBias	[float]<br>
	 * Prototype: float  mipLodBias
	 */ 
	 private static native float getMipLodBias0(Buffer ptr);/*
		  VkSamplerCreateInfo vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jfloat) (vkObj->mipLodBias);
	 */

	/**
	 * native SET method for field anisotropyEnable	[boolean]<br>
	 * Prototype: VkBool32  anisotropyEnable
	 */ 
	 private static native void setAnisotropyEnable0(Buffer ptr, boolean _anisotropyEnable);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  vkObj->anisotropyEnable = (VkBool32) (_anisotropyEnable);
	  */

	/**
	 * native GET method for field anisotropyEnable	[boolean]<br>
	 * Prototype: VkBool32  anisotropyEnable
	 */ 
	 private static native boolean getAnisotropyEnable0(Buffer ptr);/*
		  VkSamplerCreateInfo vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jboolean) (vkObj->anisotropyEnable);
	 */

	/**
	 * native SET method for field maxAnisotropy	[float]<br>
	 * Prototype: float  maxAnisotropy
	 */ 
	 private static native void setMaxAnisotropy0(Buffer ptr, float _maxAnisotropy);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  vkObj->maxAnisotropy = (float) (_maxAnisotropy);
	  */

	/**
	 * native GET method for field maxAnisotropy	[float]<br>
	 * Prototype: float  maxAnisotropy
	 */ 
	 private static native float getMaxAnisotropy0(Buffer ptr);/*
		  VkSamplerCreateInfo vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jfloat) (vkObj->maxAnisotropy);
	 */

	/**
	 * native SET method for field compareEnable	[boolean]<br>
	 * Prototype: VkBool32  compareEnable
	 */ 
	 private static native void setCompareEnable0(Buffer ptr, boolean _compareEnable);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  vkObj->compareEnable = (VkBool32) (_compareEnable);
	  */

	/**
	 * native GET method for field compareEnable	[boolean]<br>
	 * Prototype: VkBool32  compareEnable
	 */ 
	 private static native boolean getCompareEnable0(Buffer ptr);/*
		  VkSamplerCreateInfo vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jboolean) (vkObj->compareEnable);
	 */

	/**
	 * native SET method for field compareOp	[vkenum]<br>
	 * Prototype: VkCompareOp  compareOp
	 */ 
	 private static native void setCompareOp0(Buffer ptr, int  _compareOp);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  vkObj->compareOp = (VkCompareOp) (_compareOp);
	  */

	/**
	 * native GET method for field compareOp	[vkenum]<br>
	 * Prototype: VkCompareOp  compareOp
	 */ 
	 private static native int  getCompareOp0(Buffer ptr);/*
		  VkSamplerCreateInfo vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (VkCompareOp) (vkObj->compareOp);
	 */

	/**
	 * native SET method for field minLod	[float]<br>
	 * Prototype: float  minLod
	 */ 
	 private static native void setMinLod0(Buffer ptr, float _minLod);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  vkObj->minLod = (float) (_minLod);
	  */

	/**
	 * native GET method for field minLod	[float]<br>
	 * Prototype: float  minLod
	 */ 
	 private static native float getMinLod0(Buffer ptr);/*
		  VkSamplerCreateInfo vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jfloat) (vkObj->minLod);
	 */

	/**
	 * native SET method for field maxLod	[float]<br>
	 * Prototype: float  maxLod
	 */ 
	 private static native void setMaxLod0(Buffer ptr, float _maxLod);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  vkObj->maxLod = (float) (_maxLod);
	  */

	/**
	 * native GET method for field maxLod	[float]<br>
	 * Prototype: float  maxLod
	 */ 
	 private static native float getMaxLod0(Buffer ptr);/*
		  VkSamplerCreateInfo vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jfloat) (vkObj->maxLod);
	 */

	/**
	 * native SET method for field borderColor	[vkenum]<br>
	 * Prototype: VkBorderColor  borderColor
	 */ 
	 private static native void setBorderColor0(Buffer ptr, int  _borderColor);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  vkObj->borderColor = (VkBorderColor) (_borderColor);
	  */

	/**
	 * native GET method for field borderColor	[vkenum]<br>
	 * Prototype: VkBorderColor  borderColor
	 */ 
	 private static native int  getBorderColor0(Buffer ptr);/*
		  VkSamplerCreateInfo vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (VkBorderColor) (vkObj->borderColor);
	 */

	/**
	 * native SET method for field unnormalizedCoordinates	[boolean]<br>
	 * Prototype: VkBool32  unnormalizedCoordinates
	 */ 
	 private static native void setUnnormalizedCoordinates0(Buffer ptr, boolean _unnormalizedCoordinates);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  vkObj->unnormalizedCoordinates = (VkBool32) (_unnormalizedCoordinates);
	  */

	/**
	 * native GET method for field unnormalizedCoordinates	[boolean]<br>
	 * Prototype: VkBool32  unnormalizedCoordinates
	 */ 
	 private static native boolean getUnnormalizedCoordinates0(Buffer ptr);/*
		  VkSamplerCreateInfo vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jboolean) (vkObj->unnormalizedCoordinates);
	 */



} // end of class VkSamplerCreateInfo
