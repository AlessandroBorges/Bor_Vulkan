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


/**
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
	/** TAG of this structure [194]  */
	 private static final String TAG = "VkSamplerCreateInfo";

	/** ID of this structure [194]  */
	 public static final int TAG_ID = VKSAMPLERCREATEINFO_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType	[vkenum]	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext		 */ 
	P<VkObject> 	pNext;

	/**
	 *  VkSamplerCreateFlags 	flags		 */ 
	int 	flags;

	/**
	 *  VkFilter 	magFilter	[vkenum]	 */ 
	VkFilter 	magFilter;

	/**
	 *  VkFilter 	minFilter	[vkenum]	 */ 
	VkFilter 	minFilter;

	/**
	 *  VkSamplerMipmapMode 	mipmapMode	[vkenum]	 */ 
	VkSamplerMipmapMode 	mipmapMode;

	/**
	 *  VkSamplerAddressMode 	addressModeU	[vkenum]	 */ 
	VkSamplerAddressMode 	addressModeU;

	/**
	 *  VkSamplerAddressMode 	addressModeV	[vkenum]	 */ 
	VkSamplerAddressMode 	addressModeV;

	/**
	 *  VkSamplerAddressMode 	addressModeW	[vkenum]	 */ 
	VkSamplerAddressMode 	addressModeW;

	/**
	 *  float 	mipLodBias		 */ 
	float 	mipLodBias;

	/**
	 *  VkBool32 	anisotropyEnable		 */ 
	boolean 	anisotropyEnable;

	/**
	 *  float 	maxAnisotropy		 */ 
	float 	maxAnisotropy;

	/**
	 *  VkBool32 	compareEnable		 */ 
	boolean 	compareEnable;

	/**
	 *  VkCompareOp 	compareOp	[vkenum]	 */ 
	VkCompareOp 	compareOp;

	/**
	 *  float 	minLod		 */ 
	float 	minLod;

	/**
	 *  float 	maxLod		 */ 
	float 	maxLod;

	/**
	 *  VkBorderColor 	borderColor	[vkenum]	 */ 
	VkBorderColor 	borderColor;

	/**
	 *  VkBool32 	unnormalizedCoordinates		 */ 
	boolean 	unnormalizedCoordinates;

	/**
	 * Ctor
	 */
	public VkSamplerCreateInfo(){ 
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
	 * Prototype: VkSamplerCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	
	 * Prototype: VkSamplerCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field magFilter	[vkenum]
	 * Prototype: VkFilter  magFilter
	 */ 
	 public void magFilter(VkFilter magFilter){
		 this.magFilter = magFilter;
		magFilter0(super.ptr, magFilter);
	 }

	/**
	 * get method for field magFilter	[vkenum]
	 * Prototype: VkFilter  magFilter
	 */ 
	 public VkFilter magFilter(){
		 // return  this.magFilter;
		 return magFilter0(super.ptr);
	 }

	/**
	 * Set method for field minFilter	[vkenum]
	 * Prototype: VkFilter  minFilter
	 */ 
	 public void minFilter(VkFilter minFilter){
		 this.minFilter = minFilter;
		minFilter0(super.ptr, minFilter);
	 }

	/**
	 * get method for field minFilter	[vkenum]
	 * Prototype: VkFilter  minFilter
	 */ 
	 public VkFilter minFilter(){
		 // return  this.minFilter;
		 return minFilter0(super.ptr);
	 }

	/**
	 * Set method for field mipmapMode	[vkenum]
	 * Prototype: VkSamplerMipmapMode  mipmapMode
	 */ 
	 public void mipmapMode(VkSamplerMipmapMode mipmapMode){
		 this.mipmapMode = mipmapMode;
		mipmapMode0(super.ptr, mipmapMode);
	 }

	/**
	 * get method for field mipmapMode	[vkenum]
	 * Prototype: VkSamplerMipmapMode  mipmapMode
	 */ 
	 public VkSamplerMipmapMode mipmapMode(){
		 // return  this.mipmapMode;
		 return mipmapMode0(super.ptr);
	 }

	/**
	 * Set method for field addressModeU	[vkenum]
	 * Prototype: VkSamplerAddressMode  addressModeU
	 */ 
	 public void addressModeU(VkSamplerAddressMode addressModeU){
		 this.addressModeU = addressModeU;
		addressModeU0(super.ptr, addressModeU);
	 }

	/**
	 * get method for field addressModeU	[vkenum]
	 * Prototype: VkSamplerAddressMode  addressModeU
	 */ 
	 public VkSamplerAddressMode addressModeU(){
		 // return  this.addressModeU;
		 return addressModeU0(super.ptr);
	 }

	/**
	 * Set method for field addressModeV	[vkenum]
	 * Prototype: VkSamplerAddressMode  addressModeV
	 */ 
	 public void addressModeV(VkSamplerAddressMode addressModeV){
		 this.addressModeV = addressModeV;
		addressModeV0(super.ptr, addressModeV);
	 }

	/**
	 * get method for field addressModeV	[vkenum]
	 * Prototype: VkSamplerAddressMode  addressModeV
	 */ 
	 public VkSamplerAddressMode addressModeV(){
		 // return  this.addressModeV;
		 return addressModeV0(super.ptr);
	 }

	/**
	 * Set method for field addressModeW	[vkenum]
	 * Prototype: VkSamplerAddressMode  addressModeW
	 */ 
	 public void addressModeW(VkSamplerAddressMode addressModeW){
		 this.addressModeW = addressModeW;
		addressModeW0(super.ptr, addressModeW);
	 }

	/**
	 * get method for field addressModeW	[vkenum]
	 * Prototype: VkSamplerAddressMode  addressModeW
	 */ 
	 public VkSamplerAddressMode addressModeW(){
		 // return  this.addressModeW;
		 return addressModeW0(super.ptr);
	 }

	/**
	 * Set method for field mipLodBias	
	 * Prototype: float  mipLodBias
	 */ 
	 public void mipLodBias(float mipLodBias){
		 this.mipLodBias = mipLodBias;
		mipLodBias0(super.ptr, mipLodBias);
	 }

	/**
	 * get method for field mipLodBias	
	 * Prototype: float  mipLodBias
	 */ 
	 public float mipLodBias(){
		 // return  this.mipLodBias;
		 return mipLodBias0(super.ptr);
	 }

	/**
	 * Set method for field anisotropyEnable	
	 * Prototype: VkBool32  anisotropyEnable
	 */ 
	 public void anisotropyEnable(boolean anisotropyEnable){
		 this.anisotropyEnable = anisotropyEnable;
		anisotropyEnable0(super.ptr, anisotropyEnable);
	 }

	/**
	 * get method for field anisotropyEnable	
	 * Prototype: VkBool32  anisotropyEnable
	 */ 
	 public boolean anisotropyEnable(){
		 // return  this.anisotropyEnable;
		 return anisotropyEnable0(super.ptr);
	 }

	/**
	 * Set method for field maxAnisotropy	
	 * Prototype: float  maxAnisotropy
	 */ 
	 public void maxAnisotropy(float maxAnisotropy){
		 this.maxAnisotropy = maxAnisotropy;
		maxAnisotropy0(super.ptr, maxAnisotropy);
	 }

	/**
	 * get method for field maxAnisotropy	
	 * Prototype: float  maxAnisotropy
	 */ 
	 public float maxAnisotropy(){
		 // return  this.maxAnisotropy;
		 return maxAnisotropy0(super.ptr);
	 }

	/**
	 * Set method for field compareEnable	
	 * Prototype: VkBool32  compareEnable
	 */ 
	 public void compareEnable(boolean compareEnable){
		 this.compareEnable = compareEnable;
		compareEnable0(super.ptr, compareEnable);
	 }

	/**
	 * get method for field compareEnable	
	 * Prototype: VkBool32  compareEnable
	 */ 
	 public boolean compareEnable(){
		 // return  this.compareEnable;
		 return compareEnable0(super.ptr);
	 }

	/**
	 * Set method for field compareOp	[vkenum]
	 * Prototype: VkCompareOp  compareOp
	 */ 
	 public void compareOp(VkCompareOp compareOp){
		 this.compareOp = compareOp;
		compareOp0(super.ptr, compareOp);
	 }

	/**
	 * get method for field compareOp	[vkenum]
	 * Prototype: VkCompareOp  compareOp
	 */ 
	 public VkCompareOp compareOp(){
		 // return  this.compareOp;
		 return compareOp0(super.ptr);
	 }

	/**
	 * Set method for field minLod	
	 * Prototype: float  minLod
	 */ 
	 public void minLod(float minLod){
		 this.minLod = minLod;
		minLod0(super.ptr, minLod);
	 }

	/**
	 * get method for field minLod	
	 * Prototype: float  minLod
	 */ 
	 public float minLod(){
		 // return  this.minLod;
		 return minLod0(super.ptr);
	 }

	/**
	 * Set method for field maxLod	
	 * Prototype: float  maxLod
	 */ 
	 public void maxLod(float maxLod){
		 this.maxLod = maxLod;
		maxLod0(super.ptr, maxLod);
	 }

	/**
	 * get method for field maxLod	
	 * Prototype: float  maxLod
	 */ 
	 public float maxLod(){
		 // return  this.maxLod;
		 return maxLod0(super.ptr);
	 }

	/**
	 * Set method for field borderColor	[vkenum]
	 * Prototype: VkBorderColor  borderColor
	 */ 
	 public void borderColor(VkBorderColor borderColor){
		 this.borderColor = borderColor;
		borderColor0(super.ptr, borderColor);
	 }

	/**
	 * get method for field borderColor	[vkenum]
	 * Prototype: VkBorderColor  borderColor
	 */ 
	 public VkBorderColor borderColor(){
		 // return  this.borderColor;
		 return borderColor0(super.ptr);
	 }

	/**
	 * Set method for field unnormalizedCoordinates	
	 * Prototype: VkBool32  unnormalizedCoordinates
	 */ 
	 public void unnormalizedCoordinates(boolean unnormalizedCoordinates){
		 this.unnormalizedCoordinates = unnormalizedCoordinates;
		unnormalizedCoordinates0(super.ptr, unnormalizedCoordinates);
	 }

	/**
	 * get method for field unnormalizedCoordinates	
	 * Prototype: VkBool32  unnormalizedCoordinates
	 */ 
	 public boolean unnormalizedCoordinates(){
		 // return  this.unnormalizedCoordinates;
		 return unnormalizedCoordinates0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags	
	 * Prototype: VkSamplerCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(*ptr);
		  _obj.flags = (VkSamplerCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags	
	 * Prototype: VkSamplerCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(ptr);
		  return (jint) (_obj.VkSamplerCreateFlags);
	 */

	/**
	 * native Set method for field magFilter	[vkenum]
	 * Prototype: VkFilter  magFilter
	 */ 
	 private static native void magFilter0(ByteBuffer ptr, VkFilter _magFilter);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(*ptr);
		  _obj.magFilter = (VkFilter) (_magFilter);
	  */

	/**
	 * get method for field magFilter	[vkenum]
	 * Prototype: VkFilter  magFilter
	 */ 
	 private static native VkFilter magFilter0(ByteBuffer ptr);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(ptr);
		  return (VkFilter) (_obj.VkFilter);
	 */

	/**
	 * native Set method for field minFilter	[vkenum]
	 * Prototype: VkFilter  minFilter
	 */ 
	 private static native void minFilter0(ByteBuffer ptr, VkFilter _minFilter);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(*ptr);
		  _obj.minFilter = (VkFilter) (_minFilter);
	  */

	/**
	 * get method for field minFilter	[vkenum]
	 * Prototype: VkFilter  minFilter
	 */ 
	 private static native VkFilter minFilter0(ByteBuffer ptr);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(ptr);
		  return (VkFilter) (_obj.VkFilter);
	 */

	/**
	 * native Set method for field mipmapMode	[vkenum]
	 * Prototype: VkSamplerMipmapMode  mipmapMode
	 */ 
	 private static native void mipmapMode0(ByteBuffer ptr, VkSamplerMipmapMode _mipmapMode);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(*ptr);
		  _obj.mipmapMode = (VkSamplerMipmapMode) (_mipmapMode);
	  */

	/**
	 * get method for field mipmapMode	[vkenum]
	 * Prototype: VkSamplerMipmapMode  mipmapMode
	 */ 
	 private static native VkSamplerMipmapMode mipmapMode0(ByteBuffer ptr);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(ptr);
		  return (VkSamplerMipmapMode) (_obj.VkSamplerMipmapMode);
	 */

	/**
	 * native Set method for field addressModeU	[vkenum]
	 * Prototype: VkSamplerAddressMode  addressModeU
	 */ 
	 private static native void addressModeU0(ByteBuffer ptr, VkSamplerAddressMode _addressModeU);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(*ptr);
		  _obj.addressModeU = (VkSamplerAddressMode) (_addressModeU);
	  */

	/**
	 * get method for field addressModeU	[vkenum]
	 * Prototype: VkSamplerAddressMode  addressModeU
	 */ 
	 private static native VkSamplerAddressMode addressModeU0(ByteBuffer ptr);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(ptr);
		  return (VkSamplerAddressMode) (_obj.VkSamplerAddressMode);
	 */

	/**
	 * native Set method for field addressModeV	[vkenum]
	 * Prototype: VkSamplerAddressMode  addressModeV
	 */ 
	 private static native void addressModeV0(ByteBuffer ptr, VkSamplerAddressMode _addressModeV);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(*ptr);
		  _obj.addressModeV = (VkSamplerAddressMode) (_addressModeV);
	  */

	/**
	 * get method for field addressModeV	[vkenum]
	 * Prototype: VkSamplerAddressMode  addressModeV
	 */ 
	 private static native VkSamplerAddressMode addressModeV0(ByteBuffer ptr);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(ptr);
		  return (VkSamplerAddressMode) (_obj.VkSamplerAddressMode);
	 */

	/**
	 * native Set method for field addressModeW	[vkenum]
	 * Prototype: VkSamplerAddressMode  addressModeW
	 */ 
	 private static native void addressModeW0(ByteBuffer ptr, VkSamplerAddressMode _addressModeW);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(*ptr);
		  _obj.addressModeW = (VkSamplerAddressMode) (_addressModeW);
	  */

	/**
	 * get method for field addressModeW	[vkenum]
	 * Prototype: VkSamplerAddressMode  addressModeW
	 */ 
	 private static native VkSamplerAddressMode addressModeW0(ByteBuffer ptr);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(ptr);
		  return (VkSamplerAddressMode) (_obj.VkSamplerAddressMode);
	 */

	/**
	 * native Set method for field mipLodBias	
	 * Prototype: float  mipLodBias
	 */ 
	 private static native void mipLodBias0(ByteBuffer ptr, float _mipLodBias);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(*ptr);
		  _obj.mipLodBias = (float) (_mipLodBias);
	  */

	/**
	 * get method for field mipLodBias	
	 * Prototype: float  mipLodBias
	 */ 
	 private static native float mipLodBias0(ByteBuffer ptr);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native Set method for field anisotropyEnable	
	 * Prototype: VkBool32  anisotropyEnable
	 */ 
	 private static native void anisotropyEnable0(ByteBuffer ptr, boolean _anisotropyEnable);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(*ptr);
		  _obj.anisotropyEnable = (VkBool32) (_anisotropyEnable);
	  */

	/**
	 * get method for field anisotropyEnable	
	 * Prototype: VkBool32  anisotropyEnable
	 */ 
	 private static native boolean anisotropyEnable0(ByteBuffer ptr);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native Set method for field maxAnisotropy	
	 * Prototype: float  maxAnisotropy
	 */ 
	 private static native void maxAnisotropy0(ByteBuffer ptr, float _maxAnisotropy);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(*ptr);
		  _obj.maxAnisotropy = (float) (_maxAnisotropy);
	  */

	/**
	 * get method for field maxAnisotropy	
	 * Prototype: float  maxAnisotropy
	 */ 
	 private static native float maxAnisotropy0(ByteBuffer ptr);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native Set method for field compareEnable	
	 * Prototype: VkBool32  compareEnable
	 */ 
	 private static native void compareEnable0(ByteBuffer ptr, boolean _compareEnable);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(*ptr);
		  _obj.compareEnable = (VkBool32) (_compareEnable);
	  */

	/**
	 * get method for field compareEnable	
	 * Prototype: VkBool32  compareEnable
	 */ 
	 private static native boolean compareEnable0(ByteBuffer ptr);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native Set method for field compareOp	[vkenum]
	 * Prototype: VkCompareOp  compareOp
	 */ 
	 private static native void compareOp0(ByteBuffer ptr, VkCompareOp _compareOp);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(*ptr);
		  _obj.compareOp = (VkCompareOp) (_compareOp);
	  */

	/**
	 * get method for field compareOp	[vkenum]
	 * Prototype: VkCompareOp  compareOp
	 */ 
	 private static native VkCompareOp compareOp0(ByteBuffer ptr);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(ptr);
		  return (VkCompareOp) (_obj.VkCompareOp);
	 */

	/**
	 * native Set method for field minLod	
	 * Prototype: float  minLod
	 */ 
	 private static native void minLod0(ByteBuffer ptr, float _minLod);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(*ptr);
		  _obj.minLod = (float) (_minLod);
	  */

	/**
	 * get method for field minLod	
	 * Prototype: float  minLod
	 */ 
	 private static native float minLod0(ByteBuffer ptr);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native Set method for field maxLod	
	 * Prototype: float  maxLod
	 */ 
	 private static native void maxLod0(ByteBuffer ptr, float _maxLod);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(*ptr);
		  _obj.maxLod = (float) (_maxLod);
	  */

	/**
	 * get method for field maxLod	
	 * Prototype: float  maxLod
	 */ 
	 private static native float maxLod0(ByteBuffer ptr);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native Set method for field borderColor	[vkenum]
	 * Prototype: VkBorderColor  borderColor
	 */ 
	 private static native void borderColor0(ByteBuffer ptr, VkBorderColor _borderColor);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(*ptr);
		  _obj.borderColor = (VkBorderColor) (_borderColor);
	  */

	/**
	 * get method for field borderColor	[vkenum]
	 * Prototype: VkBorderColor  borderColor
	 */ 
	 private static native VkBorderColor borderColor0(ByteBuffer ptr);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(ptr);
		  return (VkBorderColor) (_obj.VkBorderColor);
	 */

	/**
	 * native Set method for field unnormalizedCoordinates	
	 * Prototype: VkBool32  unnormalizedCoordinates
	 */ 
	 private static native void unnormalizedCoordinates0(ByteBuffer ptr, boolean _unnormalizedCoordinates);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(*ptr);
		  _obj.unnormalizedCoordinates = (VkBool32) (_unnormalizedCoordinates);
	  */

	/**
	 * get method for field unnormalizedCoordinates	
	 * Prototype: VkBool32  unnormalizedCoordinates
	 */ 
	 private static native boolean unnormalizedCoordinates0(ByteBuffer ptr);/*
		  VkSamplerCreateInfo _obj = (VkSamplerCreateInfo)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */



} // end of class VkSamplerCreateInfo
