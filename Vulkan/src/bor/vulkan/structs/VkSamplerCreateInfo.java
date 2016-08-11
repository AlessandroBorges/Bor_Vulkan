/**
 * Class wrapping Vulkan's VkSamplerCreateInfo struct.
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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkSamplerCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [70]  */
	 private static final String TAG = "VkSamplerCreateInfo";

	/** ID of this structure [70]  */
	 public static final int TAG_ID = VKSAMPLERCREATEINFO_ID;

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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSamplerCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
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
	 public VkSamplerCreateInfo sType(VkStructureType sType){
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
	 public VkSamplerCreateInfo pNext(VkObject pNext){
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
	 * Prototype: VkSamplerCreateFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSamplerCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
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
	 * 
	 * @param magFilter - a instance of VkFilter.
	 * @return this VkStruct instance.
	 */ 
	 public VkSamplerCreateInfo magFilter(VkFilter magFilter){
		 this.magFilter = magFilter;
		 int enumVal = magFilter.getValue();
		 setMagFilter0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param minFilter - a instance of VkFilter.
	 * @return this VkStruct instance.
	 */ 
	 public VkSamplerCreateInfo minFilter(VkFilter minFilter){
		 this.minFilter = minFilter;
		 int enumVal = minFilter.getValue();
		 setMinFilter0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param mipmapMode - a instance of VkSamplerMipmapMode.
	 * @return this VkStruct instance.
	 */ 
	 public VkSamplerCreateInfo mipmapMode(VkSamplerMipmapMode mipmapMode){
		 this.mipmapMode = mipmapMode;
		 int enumVal = mipmapMode.getValue();
		 setMipmapMode0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param addressModeU - a instance of VkSamplerAddressMode.
	 * @return this VkStruct instance.
	 */ 
	 public VkSamplerCreateInfo addressModeU(VkSamplerAddressMode addressModeU){
		 this.addressModeU = addressModeU;
		 int enumVal = addressModeU.getValue();
		 setAddressModeU0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param addressModeV - a instance of VkSamplerAddressMode.
	 * @return this VkStruct instance.
	 */ 
	 public VkSamplerCreateInfo addressModeV(VkSamplerAddressMode addressModeV){
		 this.addressModeV = addressModeV;
		 int enumVal = addressModeV.getValue();
		 setAddressModeV0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param addressModeW - a instance of VkSamplerAddressMode.
	 * @return this VkStruct instance.
	 */ 
	 public VkSamplerCreateInfo addressModeW(VkSamplerAddressMode addressModeW){
		 this.addressModeW = addressModeW;
		 int enumVal = addressModeW.getValue();
		 setAddressModeW0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param mipLodBias - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkSamplerCreateInfo mipLodBias(float mipLodBias){
		 this.mipLodBias = mipLodBias;
		 setMipLodBias0(this.ptr,  mipLodBias);
		 return this;
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
	 * 
	 * @param anisotropyEnable - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkSamplerCreateInfo anisotropyEnable(boolean anisotropyEnable){
		 this.anisotropyEnable = anisotropyEnable;
		 setAnisotropyEnable0(this.ptr,  anisotropyEnable);
		 return this;
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
	 * 
	 * @param maxAnisotropy - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkSamplerCreateInfo maxAnisotropy(float maxAnisotropy){
		 this.maxAnisotropy = maxAnisotropy;
		 setMaxAnisotropy0(this.ptr,  maxAnisotropy);
		 return this;
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
	 * 
	 * @param compareEnable - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkSamplerCreateInfo compareEnable(boolean compareEnable){
		 this.compareEnable = compareEnable;
		 setCompareEnable0(this.ptr,  compareEnable);
		 return this;
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
	 * 
	 * @param compareOp - a instance of VkCompareOp.
	 * @return this VkStruct instance.
	 */ 
	 public VkSamplerCreateInfo compareOp(VkCompareOp compareOp){
		 this.compareOp = compareOp;
		 int enumVal = compareOp.getValue();
		 setCompareOp0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param minLod - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkSamplerCreateInfo minLod(float minLod){
		 this.minLod = minLod;
		 setMinLod0(this.ptr,  minLod);
		 return this;
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
	 * 
	 * @param maxLod - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkSamplerCreateInfo maxLod(float maxLod){
		 this.maxLod = maxLod;
		 setMaxLod0(this.ptr,  maxLod);
		 return this;
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
	 * 
	 * @param borderColor - a instance of VkBorderColor.
	 * @return this VkStruct instance.
	 */ 
	 public VkSamplerCreateInfo borderColor(VkBorderColor borderColor){
		 this.borderColor = borderColor;
		 int enumVal = borderColor.getValue();
		 setBorderColor0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param unnormalizedCoordinates - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkSamplerCreateInfo unnormalizedCoordinates(boolean unnormalizedCoordinates){
		 this.unnormalizedCoordinates = unnormalizedCoordinates;
		 setUnnormalizedCoordinates0(this.ptr,  unnormalizedCoordinates);
		 return this;
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


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkSamplerCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n magFilter: ")
				.append(magFilter() )
				.append(",\n minFilter: ")
				.append(minFilter() )
				.append(",\n mipmapMode: ")
				.append(mipmapMode() )
				.append(",\n addressModeU: ")
				.append(addressModeU() )
				.append(",\n addressModeV: ")
				.append(addressModeV() )
				.append(",\n addressModeW: ")
				.append(addressModeW() )
				.append(",\n mipLodBias: ")
				.append(mipLodBias() )
				.append(",\n anisotropyEnable: ")
				.append(anisotropyEnable() )
				.append(",\n maxAnisotropy: ")
				.append(maxAnisotropy() )
				.append(",\n compareEnable: ")
				.append(compareEnable() )
				.append(",\n compareOp: ")
				.append(compareOp() )
				.append(",\n minLod: ")
				.append(minLod() )
				.append(",\n maxLod: ")
				.append(maxLod() )
				.append(",\n borderColor: ")
				.append(borderColor() )
				.append(",\n unnormalizedCoordinates: ")
				.append(unnormalizedCoordinates() )
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
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkSamplerCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkSamplerCreateFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkSamplerCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field magFilter	[vkenum]<br>
	 * Prototype: VkFilter  magFilter
	 */ 
	 private static native void setMagFilter0(Buffer ptr, int  _magFilter);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->magFilter = (VkFilter) (_magFilter);
	  */

	/**
	 * Native GET method for field magFilter	[vkenum]<br>
	 * Prototype: VkFilter  magFilter
	 */ 
	 private static native int  getMagFilter0(Buffer ptr);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (VkFilter) (vkObj->magFilter);
	 */

	/**
	 * Native SET method for field minFilter	[vkenum]<br>
	 * Prototype: VkFilter  minFilter
	 */ 
	 private static native void setMinFilter0(Buffer ptr, int  _minFilter);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->minFilter = (VkFilter) (_minFilter);
	  */

	/**
	 * Native GET method for field minFilter	[vkenum]<br>
	 * Prototype: VkFilter  minFilter
	 */ 
	 private static native int  getMinFilter0(Buffer ptr);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (VkFilter) (vkObj->minFilter);
	 */

	/**
	 * Native SET method for field mipmapMode	[vkenum]<br>
	 * Prototype: VkSamplerMipmapMode  mipmapMode
	 */ 
	 private static native void setMipmapMode0(Buffer ptr, int  _mipmapMode);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->mipmapMode = (VkSamplerMipmapMode) (_mipmapMode);
	  */

	/**
	 * Native GET method for field mipmapMode	[vkenum]<br>
	 * Prototype: VkSamplerMipmapMode  mipmapMode
	 */ 
	 private static native int  getMipmapMode0(Buffer ptr);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (VkSamplerMipmapMode) (vkObj->mipmapMode);
	 */

	/**
	 * Native SET method for field addressModeU	[vkenum]<br>
	 * Prototype: VkSamplerAddressMode  addressModeU
	 */ 
	 private static native void setAddressModeU0(Buffer ptr, int  _addressModeU);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->addressModeU = (VkSamplerAddressMode) (_addressModeU);
	  */

	/**
	 * Native GET method for field addressModeU	[vkenum]<br>
	 * Prototype: VkSamplerAddressMode  addressModeU
	 */ 
	 private static native int  getAddressModeU0(Buffer ptr);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (VkSamplerAddressMode) (vkObj->addressModeU);
	 */

	/**
	 * Native SET method for field addressModeV	[vkenum]<br>
	 * Prototype: VkSamplerAddressMode  addressModeV
	 */ 
	 private static native void setAddressModeV0(Buffer ptr, int  _addressModeV);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->addressModeV = (VkSamplerAddressMode) (_addressModeV);
	  */

	/**
	 * Native GET method for field addressModeV	[vkenum]<br>
	 * Prototype: VkSamplerAddressMode  addressModeV
	 */ 
	 private static native int  getAddressModeV0(Buffer ptr);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (VkSamplerAddressMode) (vkObj->addressModeV);
	 */

	/**
	 * Native SET method for field addressModeW	[vkenum]<br>
	 * Prototype: VkSamplerAddressMode  addressModeW
	 */ 
	 private static native void setAddressModeW0(Buffer ptr, int  _addressModeW);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->addressModeW = (VkSamplerAddressMode) (_addressModeW);
	  */

	/**
	 * Native GET method for field addressModeW	[vkenum]<br>
	 * Prototype: VkSamplerAddressMode  addressModeW
	 */ 
	 private static native int  getAddressModeW0(Buffer ptr);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (VkSamplerAddressMode) (vkObj->addressModeW);
	 */

	/**
	 * Native SET method for field mipLodBias	[float]<br>
	 * Prototype: float  mipLodBias
	 */ 
	 private static native void setMipLodBias0(Buffer ptr, float _mipLodBias);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->mipLodBias = (float) (_mipLodBias);
	  */

	/**
	 * Native GET method for field mipLodBias	[float]<br>
	 * Prototype: float  mipLodBias
	 */ 
	 private static native float getMipLodBias0(Buffer ptr);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jfloat) (vkObj->mipLodBias);
	 */

	/**
	 * Native SET method for field anisotropyEnable	[boolean]<br>
	 * Prototype: VkBool32  anisotropyEnable
	 */ 
	 private static native void setAnisotropyEnable0(Buffer ptr, boolean  _anisotropyEnable);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->anisotropyEnable = (VkBool32) (_anisotropyEnable);
	  */

	/**
	 * Native GET method for field anisotropyEnable	[boolean]<br>
	 * Prototype: VkBool32  anisotropyEnable
	 */ 
	 private static native boolean  getAnisotropyEnable0(Buffer ptr);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jboolean) (vkObj->anisotropyEnable);
	 */

	/**
	 * Native SET method for field maxAnisotropy	[float]<br>
	 * Prototype: float  maxAnisotropy
	 */ 
	 private static native void setMaxAnisotropy0(Buffer ptr, float _maxAnisotropy);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->maxAnisotropy = (float) (_maxAnisotropy);
	  */

	/**
	 * Native GET method for field maxAnisotropy	[float]<br>
	 * Prototype: float  maxAnisotropy
	 */ 
	 private static native float getMaxAnisotropy0(Buffer ptr);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jfloat) (vkObj->maxAnisotropy);
	 */

	/**
	 * Native SET method for field compareEnable	[boolean]<br>
	 * Prototype: VkBool32  compareEnable
	 */ 
	 private static native void setCompareEnable0(Buffer ptr, boolean  _compareEnable);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->compareEnable = (VkBool32) (_compareEnable);
	  */

	/**
	 * Native GET method for field compareEnable	[boolean]<br>
	 * Prototype: VkBool32  compareEnable
	 */ 
	 private static native boolean  getCompareEnable0(Buffer ptr);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jboolean) (vkObj->compareEnable);
	 */

	/**
	 * Native SET method for field compareOp	[vkenum]<br>
	 * Prototype: VkCompareOp  compareOp
	 */ 
	 private static native void setCompareOp0(Buffer ptr, int  _compareOp);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->compareOp = (VkCompareOp) (_compareOp);
	  */

	/**
	 * Native GET method for field compareOp	[vkenum]<br>
	 * Prototype: VkCompareOp  compareOp
	 */ 
	 private static native int  getCompareOp0(Buffer ptr);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (VkCompareOp) (vkObj->compareOp);
	 */

	/**
	 * Native SET method for field minLod	[float]<br>
	 * Prototype: float  minLod
	 */ 
	 private static native void setMinLod0(Buffer ptr, float _minLod);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->minLod = (float) (_minLod);
	  */

	/**
	 * Native GET method for field minLod	[float]<br>
	 * Prototype: float  minLod
	 */ 
	 private static native float getMinLod0(Buffer ptr);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jfloat) (vkObj->minLod);
	 */

	/**
	 * Native SET method for field maxLod	[float]<br>
	 * Prototype: float  maxLod
	 */ 
	 private static native void setMaxLod0(Buffer ptr, float _maxLod);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->maxLod = (float) (_maxLod);
	  */

	/**
	 * Native GET method for field maxLod	[float]<br>
	 * Prototype: float  maxLod
	 */ 
	 private static native float getMaxLod0(Buffer ptr);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jfloat) (vkObj->maxLod);
	 */

	/**
	 * Native SET method for field borderColor	[vkenum]<br>
	 * Prototype: VkBorderColor  borderColor
	 */ 
	 private static native void setBorderColor0(Buffer ptr, int  _borderColor);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->borderColor = (VkBorderColor) (_borderColor);
	  */

	/**
	 * Native GET method for field borderColor	[vkenum]<br>
	 * Prototype: VkBorderColor  borderColor
	 */ 
	 private static native int  getBorderColor0(Buffer ptr);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (VkBorderColor) (vkObj->borderColor);
	 */

	/**
	 * Native SET method for field unnormalizedCoordinates	[boolean]<br>
	 * Prototype: VkBool32  unnormalizedCoordinates
	 */ 
	 private static native void setUnnormalizedCoordinates0(Buffer ptr, boolean  _unnormalizedCoordinates);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->unnormalizedCoordinates = (VkBool32) (_unnormalizedCoordinates);
	  */

	/**
	 * Native GET method for field unnormalizedCoordinates	[boolean]<br>
	 * Prototype: VkBool32  unnormalizedCoordinates
	 */ 
	 private static native boolean  getUnnormalizedCoordinates0(Buffer ptr);/*
		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jboolean) (vkObj->unnormalizedCoordinates);
	 */



} // end of class VkSamplerCreateInfo
