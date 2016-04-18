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
import java.util.Arrays;
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

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

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
		 super(sizeOf(),0); 
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
	 public VkPhysicalDeviceProperties(long address , int memSize){ 
		 super(address, memSize); 
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
		 setApiVersion0(this.ptr,  apiVersion);
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
	 */ 
	 public void driverVersion(int driverVersion){
		 this.driverVersion = driverVersion;
		 setDriverVersion0(this.ptr,  driverVersion);
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
	 */ 
	 public void vendorID(int vendorID){
		 this.vendorID = vendorID;
		 setVendorID0(this.ptr,  vendorID);
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
	 */ 
	 public void deviceID(int deviceID){
		 this.deviceID = deviceID;
		 setDeviceID0(this.ptr,  deviceID);
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
	 */ 
	 public void deviceType(VkPhysicalDeviceType deviceType){
		 this.deviceType = deviceType;
		 int enumVal = deviceType.getValue();
		 setDeviceType0(this.ptr, enumVal );
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
	 */ 
	 public void deviceName(String deviceName){
		 this.deviceName = deviceName;
		 String s = (deviceName==null) ? null : deviceName.substring(0, 254);
		 setDeviceName0(this.ptr,  s, (s==null ? 0 : s.length()) );
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
	 * Set method for field pipelineCacheUUID	[byte_array]<br>
	 * Prototype: uint8_t[]  pipelineCacheUUID
	 */ 
	 public void pipelineCacheUUID(byte[] pipelineCacheUUID){
	         if(pipelineCacheUUID.length < 16){
	             throw new IllegalArgumentException("Length of pipelineCacheUUID must be at least 16.");
	         }
		 this.pipelineCacheUUID = pipelineCacheUUID;		 
		 setPipelineCacheUUID0(this.ptr,  pipelineCacheUUID);
	 }

	/**
	 * Get method for field pipelineCacheUUID	[byte_array]<br>
	 * Prototype: uint8_t[]  pipelineCacheUUID
	 */ 
	 public byte[] pipelineCacheUUID(){
	         if(pipelineCacheUUID == null){
	             pipelineCacheUUID = new byte[16]; 
	         }
		getPipelineCacheUUID0(super.ptr,pipelineCacheUUID);		 
	        return this.pipelineCacheUUID;
	 }

	/**
	 * Set method for field limits	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceLimits  limits
	 */ 
	 public void limits(VkPhysicalDeviceLimits limits){
		 this.limits = limits;
		 ByteBuffer buff = (limits==null) ? null : limits.getPointer();
		 setLimits0(this.ptr, buff);
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
	 */ 
	 public void sparseProperties(VkPhysicalDeviceSparseProperties sparseProperties){
		 this.sparseProperties = sparseProperties;
		 ByteBuffer buff = (sparseProperties==null) ? null : sparseProperties.getPointer();
		 setSparseProperties0(this.ptr, buff);
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
        return "VkPhysicalDeviceProperties [apiVersion=" + apiVersion() + 
                 ",\n driverVersion=" + driverVersion()
                +",\n vendorID=" + vendorID() 
                +",\n deviceID=" + deviceID() 
                + ",\n "
                + "deviceType= " + (deviceType == null ? deviceType() : deviceType) +",\n"
                + "deviceName= " + (deviceName == null ? deviceName() : deviceName) + ",\n"
                + "pipelineCacheUUID=" + (pipelineCacheUUID == null ? 
                                           Arrays.toString(pipelineCacheUUID()) : 
                                           Arrays.toString(pipelineCacheUUID)) + ",\n"
                + "limits=" + (limits == null ?  limits() : limits)+",\n"
                +  "sparseProperties=" + (sparseProperties == null ?sparseProperties() :  sparseProperties) + "]\n";
    }

    //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field apiVersion	[int]<br>
	 * Prototype: uint32_t  apiVersion
	 */ 
	 private static native void setApiVersion0(Buffer ptr, int _apiVersion);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  vkObj->apiVersion = (uint32_t) (_apiVersion);
	  */

	/**
	 * native GET method for field apiVersion	[int]<br>
	 * Prototype: uint32_t  apiVersion
	 */ 
	 private static native int getApiVersion0(Buffer ptr);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jint) (vkObj->apiVersion);
	 */

	/**
	 * native SET method for field driverVersion	[int]<br>
	 * Prototype: uint32_t  driverVersion
	 */ 
	 private static native void setDriverVersion0(Buffer ptr, int _driverVersion);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  vkObj->driverVersion = (uint32_t) (_driverVersion);
	  */

	/**
	 * native GET method for field driverVersion	[int]<br>
	 * Prototype: uint32_t  driverVersion
	 */ 
	 private static native int getDriverVersion0(Buffer ptr);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jint) (vkObj->driverVersion);
	 */

	/**
	 * native SET method for field vendorID	[int]<br>
	 * Prototype: uint32_t  vendorID
	 */ 
	 private static native void setVendorID0(Buffer ptr, int _vendorID);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  vkObj->vendorID = (uint32_t) (_vendorID);
	  */

	/**
	 * native GET method for field vendorID	[int]<br>
	 * Prototype: uint32_t  vendorID
	 */ 
	 private static native int getVendorID0(Buffer ptr);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jint) (vkObj->vendorID);
	 */

	/**
	 * native SET method for field deviceID	[int]<br>
	 * Prototype: uint32_t  deviceID
	 */ 
	 private static native void setDeviceID0(Buffer ptr, int _deviceID);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  vkObj->deviceID = (uint32_t) (_deviceID);
	  */

	/**
	 * native GET method for field deviceID	[int]<br>
	 * Prototype: uint32_t  deviceID
	 */ 
	 private static native int getDeviceID0(Buffer ptr);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jint) (vkObj->deviceID);
	 */

	/**
	 * native SET method for field deviceType	[vkenum]<br>
	 * Prototype: VkPhysicalDeviceType  deviceType
	 */ 
	 private static native void setDeviceType0(Buffer ptr, int  _deviceType);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  vkObj->deviceType = (VkPhysicalDeviceType) (_deviceType);
	  */

	/**
	 * native GET method for field deviceType	[vkenum]<br>
	 * Prototype: VkPhysicalDeviceType  deviceType
	 */ 
	 private static native int  getDeviceType0(Buffer ptr);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (VkPhysicalDeviceType) (vkObj->deviceType);
	 */

	/**
	 * native SET method for field deviceName	[string]<br>
	 * Prototype: char[]  deviceName
	 * @TODO implement it
	 */
	 private static native void setDeviceName0(Buffer ptr, String _deviceName, int len);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);		  
		  strncpy(vkObj->deviceName, _deviceName, len);		  
		  vkObj->deviceName[len] = '\0';
	  */

	/**
	 * native GET method for field deviceName	[string]<br>
	 * Prototype: char[]  deviceName
	 */ 
	 private static native String getDeviceName0(Buffer ptr);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->deviceName));	 */

	/**
	 * native SET method for field pipelineCacheUUID	[byte_array]<br>
	 * Prototype: uint8_t[]  pipelineCacheUUID
	 */ 
	 
	 private static native void setPipelineCacheUUID0(Buffer ptr, byte[] _pipelineCacheUUID);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  for(int i = 0; i< VK_UUID_SIZE; i++){
		     vkObj->pipelineCacheUUID[i] = (uint8_t) (_pipelineCacheUUID[i]);
		  }
	  */

	/**
	 * native GET method for field pipelineCacheUUID	[byte_array]<br>
	 * Prototype: uint8_t[]  pipelineCacheUUID
	 */ 
	 private static native void getPipelineCacheUUID0(Buffer ptr, byte[] retByte);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  //copy it
		  for(int i=0; i<VK_UUID_SIZE; i++){
		   retByte[i] = (jbyte) vkObj->pipelineCacheUUID[i];
		  }
	 */

	/**
	 * native SET method for field limits	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceLimits  limits
	 */ 
	 private static native void setLimits0(Buffer ptr, java.nio.ByteBuffer  _limits);/*
		 VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		 VkPhysicalDeviceLimits*   pLimits = (VkPhysicalDeviceLimits*)_limits;
		 vkObj->limits = (VkPhysicalDeviceLimits) (*pLimits);
	  */

	/**
	 * native GET method for field limits	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceLimits  limits
	 */ 
	 private static native long getLimits0(Buffer ptr);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);		  
		  VkPhysicalDeviceLimits* pLimits = &(vkObj->limits);
		  return (jlong) reinterpret_cast<jlong>(pLimits);
        */

	/**
	 * native SET method for field sparseProperties	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceSparseProperties  sparseProperties
	 */ 
	 private static native void setSparseProperties0(Buffer ptr, java.nio.ByteBuffer  _sparseProperties);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  VkPhysicalDeviceSparseProperties* sparseProperties = (VkPhysicalDeviceSparseProperties*)_sparseProperties;
		  vkObj->sparseProperties = (VkPhysicalDeviceSparseProperties) (*sparseProperties);
		  
	  */

	/**
	 * native GET method for field sparseProperties	[vkstruct]<br>
	 * Prototype: VkPhysicalDeviceSparseProperties  sparseProperties
	 */ 
	 private static native long getSparseProperties0(Buffer ptr);/*
		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  VkPhysicalDeviceSparseProperties* pSparse = &(vkObj->sparseProperties);		  
		  return (jlong) reinterpret_cast<jlong>(pSparse);
	 */



} // end of class VkPhysicalDeviceProperties
