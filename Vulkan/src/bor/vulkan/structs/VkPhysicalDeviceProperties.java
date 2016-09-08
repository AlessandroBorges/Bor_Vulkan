/**
 * Class wrapping Vulkan's VkPhysicalDeviceProperties struct.
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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkPhysicalDeviceProperties extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    #include <iostream>
    using namespace std;
    */  

	/** TAG of this structure [10]  */
	 private static final String TAG = "VkPhysicalDeviceProperties";

	/** ID of this structure [10]  */
	 public static final int TAG_ID = VKPHYSICALDEVICEPROPERTIES_ID;

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
	 *  uint8_t[] 	pipelineCacheUUID	[byte_array [VK_UUID_SIZE] ]
	 */ 
	byte[] 	pipelineCacheUUID = new byte[VK_UUID_SIZE];
	
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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPhysicalDeviceProperties(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPhysicalDeviceProperties(long address){ 
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
	 public static VkArray<VkPhysicalDeviceProperties> createVkArray(int size){ 
		 VkPhysicalDeviceProperties[] array = new VkPhysicalDeviceProperties[size]; 
		 VkArrayStruct<VkPhysicalDeviceProperties> vkArray = new VkArrayStruct<VkPhysicalDeviceProperties>(array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field apiVersion	[int]<br>
	 * Prototype: uint32_t  apiVersion
	 * 
	 * @param apiVersion - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceProperties apiVersion(int apiVersion){
		 this.apiVersion = apiVersion;
		 setApiVersion0(this.ptr,  apiVersion);
		 return this;
	 }

	/**
	 * Get method for field apiVersion	[int]<br>
	 * Prototype: uint32_t  apiVersion
	 */ 
	 public int apiVersion(){
		 int var = getApiVersion0(super.ptr);
		 this.apiVersion = var;
		 return this.apiVersion;
	 }

	/**
	 * Set method for field driverVersion	[int]<br>
	 * Prototype: uint32_t  driverVersion
	 * 
	 * @param driverVersion - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceProperties driverVersion(int driverVersion){
		 this.driverVersion = driverVersion;
		 setDriverVersion0(this.ptr,  driverVersion);
		 return this;
	 }

	/**
	 * Get method for field driverVersion	[int]<br>
	 * Prototype: uint32_t  driverVersion
	 */ 
	 public int driverVersion(){
		 int var = getDriverVersion0(super.ptr);
		 this.driverVersion = var;
		 return this.driverVersion;
	 }

	/**
	 * Set method for field vendorID	[int]<br>
	 * Prototype: uint32_t  vendorID
	 * 
	 * @param vendorID - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceProperties vendorID(int vendorID){
		 this.vendorID = vendorID;
		 setVendorID0(this.ptr,  vendorID);
		 return this;
	 }

	/**
	 * Get method for field vendorID	[int]<br>
	 * Prototype: uint32_t  vendorID
	 */ 
	 public int vendorID(){
		 int var = getVendorID0(super.ptr);
		 this.vendorID = var;
		 return this.vendorID;
	 }

	/**
	 * Set method for field deviceID	[int]<br>
	 * Prototype: uint32_t  deviceID
	 * 
	 * @param deviceID - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceProperties deviceID(int deviceID){
		 this.deviceID = deviceID;
		 setDeviceID0(this.ptr,  deviceID);
		 return this;
	 }

	/**
	 * Get method for field deviceID	[int]<br>
	 * Prototype: uint32_t  deviceID
	 */ 
	 public int deviceID(){
		 int var = getDeviceID0(super.ptr);
		 this.deviceID = var;
		 return this.deviceID;
	 }

	/**
	 * Set method for field deviceType	[vkenum]<br>
	 * Prototype: VkPhysicalDeviceType  deviceType
	 * 
	 * @param deviceType - a instance of VkPhysicalDeviceType.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceProperties deviceType(VkPhysicalDeviceType deviceType){
		 this.deviceType = deviceType;
		 int enumVal = deviceType.getValue();
		 setDeviceType0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field deviceType	[vkenum]<br>
	 * Prototype: VkPhysicalDeviceType  deviceType
	 */ 
	 public VkPhysicalDeviceType deviceType(){
		 int nativeVal = getDeviceType0(super.ptr);
		 this.deviceType = VkPhysicalDeviceType.fromValue(nativeVal); 
		 return this.deviceType;
	 }

	/**
	 * Set method for field deviceName	[string]<br>
	 * Prototype: char[]  deviceName
	 * 
	 * @param deviceName - a instance of String.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceProperties deviceName(String deviceName){
		 this.deviceName = deviceName;
		  this.deviceName = (deviceName == null) ? null 
		                     : (deviceName.length() + 1) < VK_MAX_PHYSICAL_DEVICE_NAME_SIZE ? deviceName
		                         : deviceName.substring(0, VK_MAX_PHYSICAL_DEVICE_NAME_SIZE - 1).trim();
		 setDeviceName0(this.ptr,  deviceName);
		 return this;
	 }

	/**
	 * Get method for field deviceName	[string]<br>
	 * Prototype: char[]  deviceName
	 */ 
	 public String deviceName(){
		 String var = getDeviceName0(super.ptr);
		 this.deviceName = var;
		 return this.deviceName;
	 }

	/**
	 * Set method for field pipelineCacheUUID	[byte]<br>
	 * Prototype: uint8_t[]  pipelineCacheUUID
	 * 
	 * @param pipelineCacheUUID - a instance of byte[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceProperties pipelineCacheUUID(byte[] pipelineCacheUUID){
		 if(pipelineCacheUUID == null)
		     java.util.Arrays.fill(this.pipelineCacheUUID , (byte) 0);
		  else
		     System.arraycopy(pipelineCacheUUID, 0, this.pipelineCacheUUID, 0, this.pipelineCacheUUID.length); 

		 setPipelineCacheUUID0(this.ptr,  this.pipelineCacheUUID);
		 return this;
	 }

	/**
	 * Get method for field pipelineCacheUUID	[byte]<br>
	 * Prototype: uint8_t[]  pipelineCacheUUID
	 */ 
	 public byte[] pipelineCacheUUID(){
		 byte[] var = getPipelineCacheUUID0(super.ptr, pipelineCacheUUID);
		 this.pipelineCacheUUID = var;
		 return this.pipelineCacheUUID;
	 }

	/**
	 * Set method for field limits	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceLimits  limits
	 * 
	 * @param limits - a instance of VkPhysicalDeviceLimits.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceProperties limits(VkPhysicalDeviceLimits limits){
		 this.limits = limits;
		 ByteBuffer buff = (limits==null) ? null : limits.getPointer();
		 setLimits0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field limits	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceLimits  limits
	 */ 
	 public VkPhysicalDeviceLimits limits(){
		 long pointer = getLimits0(super.ptr);
		 if(pointer == 0){
		    this.limits = null;
		    return null;
		  } 

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
	 * 
	 * @param sparseProperties - a instance of VkPhysicalDeviceSparseProperties.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceProperties sparseProperties(VkPhysicalDeviceSparseProperties sparseProperties){
		 this.sparseProperties = sparseProperties;
		 ByteBuffer buff = (sparseProperties==null) ? null : sparseProperties.getPointer();
		 setSparseProperties0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field sparseProperties	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceSparseProperties  sparseProperties
	 */ 
	 public VkPhysicalDeviceSparseProperties sparseProperties(){
		 long pointer = getSparseProperties0(super.ptr);
		 if(pointer == 0){
		    this.sparseProperties = null;
		    return null;
		  } 

		 if(this.sparseProperties == null){
		    this.sparseProperties = new VkPhysicalDeviceSparseProperties(pointer);
		 }else{
		    this.sparseProperties.setPointer(pointer);
		  }
		 return this.sparseProperties;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         int apiV = apiVersion();
         builder.append("VkPhysicalDeviceProperties [ ")
				.append("apiVersion: ")
				.append(Vulkan.getAPIVersionString(apiV))
				.append(",\n driverVersion: ")
				.append(Vulkan.getAPIVersionString(driverVersion()))
				//.append(driverVersion() )
				.append(",\n vendorID: ")
				.append(vendorID() )
				.append(",\n deviceID: ")
				.append(deviceID() )
				.append(",\n deviceType: ")
				.append(deviceType() )
				.append(",\n deviceName: ")
				.append(deviceName() )
				.append(",\n pipelineCacheUUID: ")
				.append(toString(pipelineCacheUUID()) )
				.append(",\n limits: ")
				.append(limits() )
				.append(",\n sparseProperties: ")
				.append(sparseProperties() )
				.append("]");
		 return builder.toString();
    }

    /**
     * Get value of pipelineCacheUUID
     * @param data - pipelineCacheUUID
     * @return string value
     */
    private static String toString(byte[] data){
        String s = "[";
        for (int i = 0; i < data.length; i++) {
            byte b = data[i];
            int hex = b & 0xFF;
            if(i>0) s += ", ";
            s += hex;
        }
        s+="]";
        return s;
    }
     
	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field apiVersion	[int]<br>
	 * Prototype: uint32_t  apiVersion
	 */ 
	 private static native void setApiVersion0(Buffer ptr, int _apiVersion);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		 // code for simple past value 
		  vkObj->apiVersion = (uint32_t) (_apiVersion);
	  */

	/**
	 * Native GET method for field apiVersion	[int]<br>
	 * Prototype: uint32_t  apiVersion
	 */ 
	 private static native int getApiVersion0(Buffer ptr);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jint) (vkObj->apiVersion);
	 */

	/**
	 * Native SET method for field driverVersion	[int]<br>
	 * Prototype: uint32_t  driverVersion
	 */ 
	 private static native void setDriverVersion0(Buffer ptr, int _driverVersion);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		 // code for simple past value 
		  vkObj->driverVersion = (uint32_t) (_driverVersion);
	  */

	/**
	 * Native GET method for field driverVersion	[int]<br>
	 * Prototype: uint32_t  driverVersion
	 */ 
	 private static native int getDriverVersion0(Buffer ptr);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jint) (vkObj->driverVersion);
	 */

	/**
	 * Native SET method for field vendorID	[int]<br>
	 * Prototype: uint32_t  vendorID
	 */ 
	 private static native void setVendorID0(Buffer ptr, int _vendorID);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		 // code for simple past value 
		  vkObj->vendorID = (uint32_t) (_vendorID);
	  */

	/**
	 * Native GET method for field vendorID	[int]<br>
	 * Prototype: uint32_t  vendorID
	 */ 
	 private static native int getVendorID0(Buffer ptr);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jint) (vkObj->vendorID);
	 */

	/**
	 * Native SET method for field deviceID	[int]<br>
	 * Prototype: uint32_t  deviceID
	 */ 
	 private static native void setDeviceID0(Buffer ptr, int _deviceID);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		 // code for simple past value 
		  vkObj->deviceID = (uint32_t) (_deviceID);
	  */

	/**
	 * Native GET method for field deviceID	[int]<br>
	 * Prototype: uint32_t  deviceID
	 */ 
	 private static native int getDeviceID0(Buffer ptr);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jint) (vkObj->deviceID);
	 */

	/**
	 * Native SET method for field deviceType	[vkenum]<br>
	 * Prototype: VkPhysicalDeviceType  deviceType
	 */ 
	 private static native void setDeviceType0(Buffer ptr, int  _deviceType);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		 // code for simple past value 
		  vkObj->deviceType = (VkPhysicalDeviceType) (_deviceType);
	  */

	/**
	 * Native GET method for field deviceType	[vkenum]<br>
	 * Prototype: VkPhysicalDeviceType  deviceType
	 */ 
	 private static native int getDeviceType0(Buffer ptr);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->deviceType);
	 */

	/**
	 * Native SET method for field deviceName	[string]<br>
	 * Prototype: char[]  deviceName
	 */ 
	 private static native void setDeviceName0(Buffer ptr, String _deviceName);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  strncpy(vkObj->deviceName, _deviceName, strlen(_deviceName)+1);
	  */

	/**
	 * Native GET method for field deviceName	[string]<br>
	 * Prototype: char[]  deviceName
	 */ 
	 private static native String getDeviceName0(Buffer ptr);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jstring)(env->NewStringUTF(cloneStr(vkObj->deviceName)));
	 */

	/**
	 * Native SET method for field pipelineCacheUUID	[byte]<br>
	 * Prototype: uint8_t[]  pipelineCacheUUID
	 */ 
	 private static native void setPipelineCacheUUID0(Buffer ptr, byte[] _pipelineCacheUUID);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		 // code for fixed size array 
		  memcpy(vkObj->pipelineCacheUUID, _pipelineCacheUUID, VK_UUID_SIZE * sizeof(uint8_t));
	  */

	/**
	 * Native GET method for field pipelineCacheUUID	[byte]<br>
	 * Prototype: uint8_t[]  pipelineCacheUUID
	 */ 
	 private static native byte[] getPipelineCacheUUID0(Buffer ptr, byte[] _pipelineCacheUUID);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  // fixed length array
		 
		  memcpy(_pipelineCacheUUID, vkObj->pipelineCacheUUID, VK_UUID_SIZE * sizeof(uint8_t));
		  return obj__pipelineCacheUUID;
	 */

	/**
	 * Native SET method for field limits	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceLimits  limits
	 */ 
	 private static native void setLimits0(Buffer ptr, java.nio.ByteBuffer  _limits);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkPhysicalDeviceLimits* p_limits = (VkPhysicalDeviceLimits*) _limits; 
		 vkObj->limits = (*p_limits); 
	  */

	/**
	 * Native GET method for field limits	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceLimits  limits
	 */ 
	 private static native long getLimits0(Buffer ptr);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->limits);
	 */

	/**
	 * Native SET method for field sparseProperties	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceSparseProperties  sparseProperties
	 */ 
	 private static native void setSparseProperties0(Buffer ptr, java.nio.ByteBuffer  _sparseProperties);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkPhysicalDeviceSparseProperties* p_sparseProperties = (VkPhysicalDeviceSparseProperties*) _sparseProperties; 
		 vkObj->sparseProperties = (*p_sparseProperties); 
	  */

	/**
	 * Native GET method for field sparseProperties	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceSparseProperties  sparseProperties
	 */ 
	 private static native long getSparseProperties0(Buffer ptr);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->sparseProperties);
	 */



} // end of class VkPhysicalDeviceProperties
