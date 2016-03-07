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
		apiVersion0(super.ptr, apiVersion);
	 }

	/**
	 * get method for field apiVersion	[int]<br>
	 * Prototype: uint32_t  apiVersion
	 */ 
	 public int apiVersion(){
		 // return  this.apiVersion;
		 return apiVersion0(super.ptr);
	 }

	/**
	 * Set method for field driverVersion	[int]<br>
	 * Prototype: uint32_t  driverVersion
	 */ 
	 public void driverVersion(int driverVersion){
		 this.driverVersion = driverVersion;
		driverVersion0(super.ptr, driverVersion);
	 }

	/**
	 * get method for field driverVersion	[int]<br>
	 * Prototype: uint32_t  driverVersion
	 */ 
	 public int driverVersion(){
		 // return  this.driverVersion;
		 return driverVersion0(super.ptr);
	 }

	/**
	 * Set method for field vendorID	[int]<br>
	 * Prototype: uint32_t  vendorID
	 */ 
	 public void vendorID(int vendorID){
		 this.vendorID = vendorID;
		vendorID0(super.ptr, vendorID);
	 }

	/**
	 * get method for field vendorID	[int]<br>
	 * Prototype: uint32_t  vendorID
	 */ 
	 public int vendorID(){
		 // return  this.vendorID;
		 return vendorID0(super.ptr);
	 }

	/**
	 * Set method for field deviceID	[int]<br>
	 * Prototype: uint32_t  deviceID
	 */ 
	 public void deviceID(int deviceID){
		 this.deviceID = deviceID;
		deviceID0(super.ptr, deviceID);
	 }

	/**
	 * get method for field deviceID	[int]<br>
	 * Prototype: uint32_t  deviceID
	 */ 
	 public int deviceID(){
		 // return  this.deviceID;
		 return deviceID0(super.ptr);
	 }

	/**
	 * Set method for field deviceType	[vkenum]<br>
	 * Prototype: VkPhysicalDeviceType  deviceType
	 */ 
	 public void deviceType(VkPhysicalDeviceType deviceType){
		 this.deviceType = deviceType;
		deviceType0(super.ptr, deviceType);
	 }

	/**
	 * get method for field deviceType	[vkenum]<br>
	 * Prototype: VkPhysicalDeviceType  deviceType
	 */ 
	 public VkPhysicalDeviceType deviceType(){
		 // return  this.deviceType;
		 return deviceType0(super.ptr);
	 }

	/**
	 * Set method for field deviceName	[string]<br>
	 * Prototype: char[]  deviceName
	 */ 
	 public void deviceName(String deviceName){
		 this.deviceName = deviceName;
		deviceName0(super.ptr, deviceName);
	 }

	/**
	 * get method for field deviceName	[string]<br>
	 * Prototype: char[]  deviceName
	 */ 
	 public String deviceName(){
		 // return  this.deviceName;
		 return deviceName0(super.ptr);
	 }

	/**
	 * Set method for field pipelineCacheUUID	[byte_array]<br>
	 * Prototype: uint8_t[]  pipelineCacheUUID
	 */ 
	 public void pipelineCacheUUID(byte[] pipelineCacheUUID){
		 this.pipelineCacheUUID = pipelineCacheUUID;
		pipelineCacheUUID0(super.ptr, pipelineCacheUUID);
	 }

	/**
	 * get method for field pipelineCacheUUID	[byte_array]<br>
	 * Prototype: uint8_t[]  pipelineCacheUUID
	 */ 
	 public byte[] pipelineCacheUUID(){
		 // return  this.pipelineCacheUUID;
		 return pipelineCacheUUID0(super.ptr);
	 }

	/**
	 * Set method for field limits	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceLimits  limits
	 */ 
	 public void limits(VkPhysicalDeviceLimits limits){
		 this.limits = limits;
		limits0(super.ptr, limits);
	 }

	/**
	 * get method for field limits	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceLimits  limits
	 */ 
	 public VkPhysicalDeviceLimits limits(){
		 // return  this.limits;
		 return limits0(super.ptr);
	 }

	/**
	 * Set method for field sparseProperties	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceSparseProperties  sparseProperties
	 */ 
	 public void sparseProperties(VkPhysicalDeviceSparseProperties sparseProperties){
		 this.sparseProperties = sparseProperties;
		sparseProperties0(super.ptr, sparseProperties);
	 }

	/**
	 * get method for field sparseProperties	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceSparseProperties  sparseProperties
	 */ 
	 public VkPhysicalDeviceSparseProperties sparseProperties(){
		 // return  this.sparseProperties;
		 return sparseProperties0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field apiVersion	[int]<br>
	 * Prototype: uint32_t  apiVersion
	 */ 
	 private static native void apiVersion0(ByteBuffer ptr, int _apiVersion);/*
		  VkPhysicalDeviceProperties _obj = (VkPhysicalDeviceProperties)(*ptr);
		  _obj.apiVersion = (uint32_t) (_apiVersion);
	  */

	/**
	 * native GET method for field apiVersion	[int]<br>
	 * Prototype: uint32_t  apiVersion
	 */ 
	 private static native int apiVersion0(ByteBuffer ptr);/*
		  VkPhysicalDeviceProperties _obj = (VkPhysicalDeviceProperties)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field driverVersion	[int]<br>
	 * Prototype: uint32_t  driverVersion
	 */ 
	 private static native void driverVersion0(ByteBuffer ptr, int _driverVersion);/*
		  VkPhysicalDeviceProperties _obj = (VkPhysicalDeviceProperties)(*ptr);
		  _obj.driverVersion = (uint32_t) (_driverVersion);
	  */

	/**
	 * native GET method for field driverVersion	[int]<br>
	 * Prototype: uint32_t  driverVersion
	 */ 
	 private static native int driverVersion0(ByteBuffer ptr);/*
		  VkPhysicalDeviceProperties _obj = (VkPhysicalDeviceProperties)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field vendorID	[int]<br>
	 * Prototype: uint32_t  vendorID
	 */ 
	 private static native void vendorID0(ByteBuffer ptr, int _vendorID);/*
		  VkPhysicalDeviceProperties _obj = (VkPhysicalDeviceProperties)(*ptr);
		  _obj.vendorID = (uint32_t) (_vendorID);
	  */

	/**
	 * native GET method for field vendorID	[int]<br>
	 * Prototype: uint32_t  vendorID
	 */ 
	 private static native int vendorID0(ByteBuffer ptr);/*
		  VkPhysicalDeviceProperties _obj = (VkPhysicalDeviceProperties)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field deviceID	[int]<br>
	 * Prototype: uint32_t  deviceID
	 */ 
	 private static native void deviceID0(ByteBuffer ptr, int _deviceID);/*
		  VkPhysicalDeviceProperties _obj = (VkPhysicalDeviceProperties)(*ptr);
		  _obj.deviceID = (uint32_t) (_deviceID);
	  */

	/**
	 * native GET method for field deviceID	[int]<br>
	 * Prototype: uint32_t  deviceID
	 */ 
	 private static native int deviceID0(ByteBuffer ptr);/*
		  VkPhysicalDeviceProperties _obj = (VkPhysicalDeviceProperties)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field deviceType	[vkenum]<br>
	 * Prototype: VkPhysicalDeviceType  deviceType
	 */ 
	 private static native void deviceType0(ByteBuffer ptr, VkPhysicalDeviceType _deviceType);/*
		  VkPhysicalDeviceProperties _obj = (VkPhysicalDeviceProperties)(*ptr);
		  _obj.deviceType = (VkPhysicalDeviceType) (_deviceType);
	  */

	/**
	 * native GET method for field deviceType	[vkenum]<br>
	 * Prototype: VkPhysicalDeviceType  deviceType
	 */ 
	 private static native VkPhysicalDeviceType deviceType0(ByteBuffer ptr);/*
		  VkPhysicalDeviceProperties _obj = (VkPhysicalDeviceProperties)(ptr);
		  return (VkPhysicalDeviceType) (_obj.VkPhysicalDeviceType);
	 */

	/**
	 * native SET method for field deviceName	[string]<br>
	 * Prototype: char[]  deviceName
	 */ 
	 private static native void deviceName0(ByteBuffer ptr, String _deviceName);/*
		  VkPhysicalDeviceProperties _obj = (VkPhysicalDeviceProperties)(*ptr);
		  _obj.deviceName = (char[]) (_deviceName);
	  */

	/**
	 * native GET method for field deviceName	[string]<br>
	 * Prototype: char[]  deviceName
	 */ 
	 private static native String deviceName0(ByteBuffer ptr);/*
		  VkPhysicalDeviceProperties _obj = (VkPhysicalDeviceProperties)(ptr);
		  return (jstring)(env->NewStringUTF(_obj.char[]);	 */

	/**
	 * native SET method for field pipelineCacheUUID	[byte_array]<br>
	 * Prototype: uint8_t[]  pipelineCacheUUID
	 */ 
	 private static native void pipelineCacheUUID0(ByteBuffer ptr, byte[] _pipelineCacheUUID);/*
		  VkPhysicalDeviceProperties _obj = (VkPhysicalDeviceProperties)(*ptr);
		  _obj.pipelineCacheUUID = (uint8_t[]) (_pipelineCacheUUID);
	  */

	/**
	 * native GET method for field pipelineCacheUUID	[byte_array]<br>
	 * Prototype: uint8_t[]  pipelineCacheUUID
	 */ 
	 private static native byte[] pipelineCacheUUID0(ByteBuffer ptr);/*
		  VkPhysicalDeviceProperties _obj = (VkPhysicalDeviceProperties)(ptr);
		  return (byte[]) (_obj.uint8_t[]);
	 */

	/**
	 * native SET method for field limits	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceLimits  limits
	 */ 
	 private static native void limits0(ByteBuffer ptr, VkPhysicalDeviceLimits _limits);/*
		  VkPhysicalDeviceProperties _obj = (VkPhysicalDeviceProperties)(*ptr);
		  _obj.limits = (VkPhysicalDeviceLimits) (_limits);
	  */

	/**
	 * native GET method for field limits	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceLimits  limits
	 */ 
	 private static native VkPhysicalDeviceLimits limits0(ByteBuffer ptr);/*
		  VkPhysicalDeviceProperties _obj = (VkPhysicalDeviceProperties)(ptr);
		  return (VkPhysicalDeviceLimits) (_obj.VkPhysicalDeviceLimits);
	 */

	/**
	 * native SET method for field sparseProperties	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceSparseProperties  sparseProperties
	 */ 
	 private static native void sparseProperties0(ByteBuffer ptr, VkPhysicalDeviceSparseProperties _sparseProperties);/*
		  VkPhysicalDeviceProperties _obj = (VkPhysicalDeviceProperties)(*ptr);
		  _obj.sparseProperties = (VkPhysicalDeviceSparseProperties) (_sparseProperties);
	  */

	/**
	 * native GET method for field sparseProperties	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceSparseProperties  sparseProperties
	 */ 
	 private static native VkPhysicalDeviceSparseProperties sparseProperties0(ByteBuffer ptr);/*
		  VkPhysicalDeviceProperties _obj = (VkPhysicalDeviceProperties)(ptr);
		  return (VkPhysicalDeviceSparseProperties) (_obj.VkPhysicalDeviceSparseProperties);
	 */



} // end of class VkPhysicalDeviceProperties
