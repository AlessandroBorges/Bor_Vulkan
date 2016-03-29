/**
 * Class wrapping Vulkan's VkPhysicalDeviceProperties struct.
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
 *  This class is a Java front end for struct VkPhysicalDeviceProperties. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPhysicalDeviceProperties {
 *     uint32_t                            apiVersion;
 *     uint32_t                            driverVersion;
 *     uint32_t                            vendorID;
 *     uint32_t                            deviceID;
 *     VkPhysicalDeviceType                deviceType;
 *     char                                deviceName[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE];
 *     uint8_t                             pipelineCacheUUID[VK_UUID_SIZE];
 *     VkPhysicalDeviceLimits              limits;
 *     VkPhysicalDeviceSparseProperties    sparseProperties;
 * } VkPhysicalDeviceProperties;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkPhysicalDeviceProperties extends VkStruct {
	/** TAG of this structure [10]  */
	 private static final String TAG = "VkPhysicalDeviceProperties";

	/** ID of this structure [10]  */
	 public static final int TAG_ID = VKPHYSICALDEVICEPROPERTIES_ID;

	/** P wrapper for THIS object */
	 private  P<VkPhysicalDeviceProperties> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  uint32_t 	apiVersion	[int]
	 */ 
	 int 	apiVersion;

	/**
	 *  uint32_t 	driverVersion	[int]
	 */ 
	 int 	driverVersion;

	/**
	 *  uint32_t 	vendorID	[int]
	 */ 
	 int 	vendorID;

	/**
	 *  uint32_t 	deviceID	[int]
	 */ 
	 int 	deviceID;

	/**
	 *  VkPhysicalDeviceType 	deviceType	[vkenum]
	 */ 
	 VkPhysicalDeviceType 	deviceType;

	/**
	 *  char[] 	deviceName	[string]
	 */ 
	 String 	deviceName;

	/**
	 *  uint8_t[] 	pipelineCacheUUID	[byte_array]
	 */ 
	 byte[] 	pipelineCacheUUID;

	/**
	 *  VkPhysicalDeviceLimits 	limits	[vkstruct]
	 */ 
	 VkPhysicalDeviceLimits 	limits;

	/**
	 *  VkPhysicalDeviceSparseProperties 	sparseProperties	[vkstruct]
	 */ 
	 VkPhysicalDeviceSparseProperties 	sparseProperties;

	/**
	 * Ctor
	 */
	public VkPhysicalDeviceProperties(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPhysicalDeviceProperties(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkPhysicalDeviceProperties(long address, int memSize){ 
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
	 public static P<VkPhysicalDeviceProperties> createNullPointer(){
	        P<VkPhysicalDeviceProperties> p = new  P<VkPhysicalDeviceProperties>(new VkPhysicalDeviceProperties());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkPhysicalDeviceProperties> getP() {
	       if(p == null ){
	           p = new P<VkPhysicalDeviceProperties> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field apiVersion	[int]<br>
	 * Prototype: uint32_t  apiVersion
	 */ 
	 public void apiVersion(int apiVersion){
		 this.apiVersion = apiVersion;
		 apiVersion0(this.ptr,  apiVersion);
	 }

	/**
	 * Get method for field apiVersion	[int]<br>
	 * Prototype: uint32_t  apiVersion
	 */ 
	 public int apiVersion(){
		 int var = apiVersion0(super.ptr);
		 this.apiVersion = var;
		 return this.apiVersion;
	 }

	/**
	 * Set method for field driverVersion	[int]<br>
	 * Prototype: uint32_t  driverVersion
	 */ 
	 public void driverVersion(int driverVersion){
		 this.driverVersion = driverVersion;
		 driverVersion0(this.ptr,  driverVersion);
	 }

	/**
	 * Get method for field driverVersion	[int]<br>
	 * Prototype: uint32_t  driverVersion
	 */ 
	 public int driverVersion(){
		 int var = driverVersion0(super.ptr);
		 this.driverVersion = var;
		 return this.driverVersion;
	 }

	/**
	 * Set method for field vendorID	[int]<br>
	 * Prototype: uint32_t  vendorID
	 */ 
	 public void vendorID(int vendorID){
		 this.vendorID = vendorID;
		 vendorID0(this.ptr,  vendorID);
	 }

	/**
	 * Get method for field vendorID	[int]<br>
	 * Prototype: uint32_t  vendorID
	 */ 
	 public int vendorID(){
		 int var = vendorID0(super.ptr);
		 this.vendorID = var;
		 return this.vendorID;
	 }

	/**
	 * Set method for field deviceID	[int]<br>
	 * Prototype: uint32_t  deviceID
	 */ 
	 public void deviceID(int deviceID){
		 this.deviceID = deviceID;
		 deviceID0(this.ptr,  deviceID);
	 }

	/**
	 * Get method for field deviceID	[int]<br>
	 * Prototype: uint32_t  deviceID
	 */ 
	 public int deviceID(){
		 int var = deviceID0(super.ptr);
		 this.deviceID = var;
		 return this.deviceID;
	 }

	/**
	 * Set method for field deviceType	[vkenum]<br>
	 * Prototype: VkPhysicalDeviceType  deviceType
	 */ 
	 public void deviceType(VkPhysicalDeviceType deviceType){
		 this.deviceType = deviceType;
		 int enumVal = deviceType.getValue();
		 deviceType0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field deviceType	[vkenum]<br>
	 * Prototype: VkPhysicalDeviceType  deviceType
	 */ 
	 public VkPhysicalDeviceType deviceType(){
		 int nativeVal = deviceType0(super.ptr);
		 this.deviceType = VkPhysicalDeviceType.fromValue(nativeVal); 
		 return this.deviceType;
	 }

	/**
	 * Set method for field deviceName	[string]<br>
	 * Prototype: char[]  deviceName
	 */ 
	 public void deviceName(String deviceName){
		 this.deviceName = deviceName;
		 deviceName0(this.ptr,  deviceName);
	 }

	/**
	 * Get method for field deviceName	[string]<br>
	 * Prototype: char[]  deviceName
	 */ 
	 public String deviceName(){
		 String var = deviceName0(super.ptr);
		 this.deviceName = var;
		 return this.deviceName;
	 }

	/**
	 * Set method for field pipelineCacheUUID	[byte_array]<br>
	 * Prototype: uint8_t[]  pipelineCacheUUID
	 */ 
	 public void pipelineCacheUUID(byte[] pipelineCacheUUID){
		 this.pipelineCacheUUID = pipelineCacheUUID;
		 pipelineCacheUUID0(this.ptr,  pipelineCacheUUID);
	 }

	/**
	 * Get method for field pipelineCacheUUID	[byte_array]<br>
	 * Prototype: uint8_t[]  pipelineCacheUUID
	 */ 
	 public byte[] pipelineCacheUUID(){
		 byte[] var = pipelineCacheUUID0(super.ptr);
		 this.pipelineCacheUUID = var;
		 return this.pipelineCacheUUID;
	 }

	/**
	 * Set method for field limits	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceLimits  limits
	 */ 
	 public void limits(VkPhysicalDeviceLimits limits){
		 this.limits = limits;
		 ByteBuffer buff = (limits==null) ? null : limits.getPointerStruct();
		 limits0(this.ptr, buff);
	 }

	/**
	 * Get method for field limits	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceLimits  limits
	 */ 
	 public VkPhysicalDeviceLimits limits(){
		 ByteBuffer pointer = limits0(super.ptr);
		 if(pointer == null){
		    this.limits = null;
		    return null;
		  } else 
 		 if(this.limits == null){
		    this.limits = new VkPhysicalDeviceLimits(pointer);
		 }else{
		    this.limits.setPointer(pointer);
		  }
		 return this.limits;
	 }

	/**
	 * Set method for field sparseProperties	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceSparseProperties  sparseProperties
	 */ 
	 public void sparseProperties(VkPhysicalDeviceSparseProperties sparseProperties){
		 this.sparseProperties = sparseProperties;
		 ByteBuffer buff = (sparseProperties==null) ? null : sparseProperties.getPointerStruct();
		 sparseProperties0(this.ptr, buff);
	 }

	/**
	 * Get method for field sparseProperties	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceSparseProperties  sparseProperties
	 */ 
	 public VkPhysicalDeviceSparseProperties sparseProperties(){
		 ByteBuffer pointer = sparseProperties0(super.ptr);
		 if(pointer == null){
		    this.sparseProperties = null;
		    return null;
		  } else 
 		 if(this.sparseProperties == null){
		    this.sparseProperties = new VkPhysicalDeviceSparseProperties(pointer);
		 }else{
		    this.sparseProperties.setPointer(pointer);
		  }
		 return this.sparseProperties;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field apiVersion	[int]<br>
	 * Prototype: uint32_t  apiVersion
	 */ 
	 private static native void apiVersion0(Buffer ptr, int _apiVersion);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  vkObj->apiVersion = (uint32_t) (_apiVersion);
	  */

	/**
	 * native GET method for field apiVersion	[int]<br>
	 * Prototype: uint32_t  apiVersion
	 */ 
	 private static native int apiVersion0(Buffer ptr);/*
		  VkPhysicalDeviceProperties vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jint) (vkObj->apiVersion);
	 */

	/**
	 * native SET method for field driverVersion	[int]<br>
	 * Prototype: uint32_t  driverVersion
	 */ 
	 private static native void driverVersion0(Buffer ptr, int _driverVersion);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  vkObj->driverVersion = (uint32_t) (_driverVersion);
	  */

	/**
	 * native GET method for field driverVersion	[int]<br>
	 * Prototype: uint32_t  driverVersion
	 */ 
	 private static native int driverVersion0(Buffer ptr);/*
		  VkPhysicalDeviceProperties vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jint) (vkObj->driverVersion);
	 */

	/**
	 * native SET method for field vendorID	[int]<br>
	 * Prototype: uint32_t  vendorID
	 */ 
	 private static native void vendorID0(Buffer ptr, int _vendorID);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  vkObj->vendorID = (uint32_t) (_vendorID);
	  */

	/**
	 * native GET method for field vendorID	[int]<br>
	 * Prototype: uint32_t  vendorID
	 */ 
	 private static native int vendorID0(Buffer ptr);/*
		  VkPhysicalDeviceProperties vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jint) (vkObj->vendorID);
	 */

	/**
	 * native SET method for field deviceID	[int]<br>
	 * Prototype: uint32_t  deviceID
	 */ 
	 private static native void deviceID0(Buffer ptr, int _deviceID);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  vkObj->deviceID = (uint32_t) (_deviceID);
	  */

	/**
	 * native GET method for field deviceID	[int]<br>
	 * Prototype: uint32_t  deviceID
	 */ 
	 private static native int deviceID0(Buffer ptr);/*
		  VkPhysicalDeviceProperties vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jint) (vkObj->deviceID);
	 */

	/**
	 * native SET method for field deviceType	[vkenum]<br>
	 * Prototype: VkPhysicalDeviceType  deviceType
	 */ 
	 private static native void deviceType0(Buffer ptr, int  _deviceType);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  vkObj->deviceType = (VkPhysicalDeviceType) (_deviceType);
	  */

	/**
	 * native GET method for field deviceType	[vkenum]<br>
	 * Prototype: VkPhysicalDeviceType  deviceType
	 */ 
	 private static native int  deviceType0(Buffer ptr);/*
		  VkPhysicalDeviceProperties vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (VkPhysicalDeviceType) (vkObj->deviceType);
	 */

	/**
	 * native SET method for field deviceName	[string]<br>
	 * Prototype: char[]  deviceName
	 */ 
	 private static native void deviceName0(Buffer ptr, String _deviceName);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  vkObj->deviceName = (char[]) (_deviceName);
	  */

	/**
	 * native GET method for field deviceName	[string]<br>
	 * Prototype: char[]  deviceName
	 */ 
	 private static native String deviceName0(Buffer ptr);/*
		  VkPhysicalDeviceProperties vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->.deviceName);	 */

	/**
	 * native SET method for field pipelineCacheUUID	[byte_array]<br>
	 * Prototype: uint8_t[]  pipelineCacheUUID
	 */ 
	 private static native void pipelineCacheUUID0(Buffer ptr, byte[] _pipelineCacheUUID);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  vkObj->pipelineCacheUUID = (uint8_t[]) (_pipelineCacheUUID);
	  */

	/**
	 * native GET method for field pipelineCacheUUID	[byte_array]<br>
	 * Prototype: uint8_t[]  pipelineCacheUUID
	 */ 
	 private static native byte[] pipelineCacheUUID0(Buffer ptr);/*
		  VkPhysicalDeviceProperties vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (byte[]) (vkObj->pipelineCacheUUID);
	 */

	/**
	 * native SET method for field limits	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceLimits  limits
	 */ 
	 private static native void limits0(Buffer ptr, java.nio.ByteBuffer  _limits);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  vkObj->limits = (VkPhysicalDeviceLimits) (_limits);
	  */

	/**
	 * native GET method for field limits	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceLimits  limits
	 */ 
	 private static native java.nio.ByteBuffer  limits0(Buffer ptr);/*
		  VkPhysicalDeviceProperties vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (VkPhysicalDeviceLimits) (vkObj->limits);
	 */

	/**
	 * native SET method for field sparseProperties	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceSparseProperties  sparseProperties
	 */ 
	 private static native void sparseProperties0(Buffer ptr, java.nio.ByteBuffer  _sparseProperties);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  vkObj->sparseProperties = (VkPhysicalDeviceSparseProperties) (_sparseProperties);
	  */

	/**
	 * native GET method for field sparseProperties	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceSparseProperties  sparseProperties
	 */ 
	 private static native java.nio.ByteBuffer  sparseProperties0(Buffer ptr);/*
		  VkPhysicalDeviceProperties vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (VkPhysicalDeviceSparseProperties) (vkObj->sparseProperties);
	 */



} // end of class VkPhysicalDeviceProperties
