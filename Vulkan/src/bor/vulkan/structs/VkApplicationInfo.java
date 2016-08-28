/**
 * Class wrapping Vulkan's VkApplicationInfo struct.
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
 *  This class is a Java front end for struct VkApplicationInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkApplicationInfo {
 *     VkStructureType    sType;
 *     const void*        pNext;
 *     const char*        pApplicationName;
 *     uint32_t           applicationVersion;
 *     const char*        pEngineName;
 *     uint32_t           engineVersion;
 *     uint32_t           apiVersion;
 * } VkApplicationInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkApplicationInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [1]  */
	 private static final String TAG = "VkApplicationInfo";

	/** ID of this structure [1]  */
	 public static final int TAG_ID = VKAPPLICATIONINFO_ID;

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
	 *  const char* 	pApplicationName	[string]
	 */ 
	String 	pApplicationName;
	
	/**
	 *  uint32_t 	applicationVersion	[int]
	 */ 
	int 	applicationVersion;
	
	/**
	 *  const char* 	pEngineName	[string]
	 */ 
	String 	pEngineName;
	
	/**
	 *  uint32_t 	engineVersion	[int]
	 */ 
	int 	engineVersion;
	
	/**
	 *  uint32_t 	apiVersion	[int]
	 */ 
	int 	apiVersion;
	/**
	 * Ctor
	 */
	public VkApplicationInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkApplicationInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkApplicationInfo(long address){ 
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
	 public static VkArray<VkApplicationInfo> createVkArray(int size){ 
		 VkApplicationInfo[] array = new VkApplicationInfo[size]; 
		 VkArrayStruct<VkApplicationInfo> vkArray = new VkArrayStruct<VkApplicationInfo> (array, TAG_ID);
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
	 public VkApplicationInfo sType(VkStructureType sType){
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
	 public VkApplicationInfo pNext(VkObject pNext){
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
	 * Set method for field pApplicationName	[string]<br>
	 * Prototype: const char*  pApplicationName
	 * 
	 * @param pApplicationName - a instance of String.
	 * @return this VkStruct instance.
	 */ 
	 public VkApplicationInfo pApplicationName(String pApplicationName){
		 this.pApplicationName = pApplicationName;
		 setPApplicationName0(this.ptr,  pApplicationName);
		 return this;
	 }

	/**
	 * Get method for field pApplicationName	[string]<br>
	 * Prototype: const char*  pApplicationName
	 */ 
	 public String pApplicationName(){
		 String var = getPApplicationName0(super.ptr);
		 this.pApplicationName = var;
		 return this.pApplicationName;
	 }

	/**
	 * Set method for field applicationVersion	[int]<br>
	 * Prototype: uint32_t  applicationVersion
	 * 
	 * @param applicationVersion - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkApplicationInfo applicationVersion(int applicationVersion){
		 this.applicationVersion = applicationVersion;
		 setApplicationVersion0(this.ptr,  applicationVersion);
		 return this;
	 }

	/**
	 * Get method for field applicationVersion	[int]<br>
	 * Prototype: uint32_t  applicationVersion
	 */ 
	 public int applicationVersion(){
		 int var = getApplicationVersion0(super.ptr);
		 this.applicationVersion = var;
		 return this.applicationVersion;
	 }

	/**
	 * Set method for field pEngineName	[string]<br>
	 * Prototype: const char*  pEngineName
	 * 
	 * @param pEngineName - a instance of String.
	 * @return this VkStruct instance.
	 */ 
	 public VkApplicationInfo pEngineName(String pEngineName){
		 this.pEngineName = pEngineName;
		 setPEngineName0(this.ptr,  pEngineName);
		 return this;
	 }

	/**
	 * Get method for field pEngineName	[string]<br>
	 * Prototype: const char*  pEngineName
	 */ 
	 public String pEngineName(){
		 String var = getPEngineName0(super.ptr);
		 this.pEngineName = var;
		 return this.pEngineName;
	 }

	/**
	 * Set method for field engineVersion	[int]<br>
	 * Prototype: uint32_t  engineVersion
	 * 
	 * @param engineVersion - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkApplicationInfo engineVersion(int engineVersion){
		 this.engineVersion = engineVersion;
		 setEngineVersion0(this.ptr,  engineVersion);
		 return this;
	 }

	/**
	 * Get method for field engineVersion	[int]<br>
	 * Prototype: uint32_t  engineVersion
	 */ 
	 public int engineVersion(){
		 int var = getEngineVersion0(super.ptr);
		 this.engineVersion = var;
		 return this.engineVersion;
	 }

	/**
	 * Set method for field apiVersion	[int]<br>
	 * Prototype: uint32_t  apiVersion
	 * 
	 * @param apiVersion - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkApplicationInfo apiVersion(int apiVersion){
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


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkApplicationInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n pApplicationName: ")
				.append(pApplicationName() )
				.append(",\n applicationVersion: ")
				.append(applicationVersion() )
				.append(",\n pEngineName: ")
				.append(pEngineName() )
				.append(",\n engineVersion: ")
				.append(engineVersion() )
				.append(",\n apiVersion: ")
				.append(apiVersion() )
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
		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field pApplicationName	[string]<br>
	 * Prototype: const char*  pApplicationName
	 */ 
	 private static native void setPApplicationName0(Buffer ptr, String _pApplicationName);/*
		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  vkObj->pApplicationName = cloneStr(_pApplicationName);
	  */

	/**
	 * Native GET method for field pApplicationName	[string]<br>
	 * Prototype: const char*  pApplicationName
	 */ 
	 private static native String getPApplicationName0(Buffer ptr);/*
		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->pApplicationName));
	 */

	/**
	 * Native SET method for field applicationVersion	[int]<br>
	 * Prototype: uint32_t  applicationVersion
	 */ 
	 private static native void setApplicationVersion0(Buffer ptr, int _applicationVersion);/*
		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		 // code for simple past value 
		  vkObj->applicationVersion = (uint32_t) (_applicationVersion);
	  */

	/**
	 * Native GET method for field applicationVersion	[int]<br>
	 * Prototype: uint32_t  applicationVersion
	 */ 
	 private static native int getApplicationVersion0(Buffer ptr);/*
		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  return (jint) (vkObj->applicationVersion);
	 */

	/**
	 * Native SET method for field pEngineName	[string]<br>
	 * Prototype: const char*  pEngineName
	 */ 
	 private static native void setPEngineName0(Buffer ptr, String _pEngineName);/*
		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  vkObj->pEngineName = cloneStr(_pEngineName);
	  */

	/**
	 * Native GET method for field pEngineName	[string]<br>
	 * Prototype: const char*  pEngineName
	 */ 
	 private static native String getPEngineName0(Buffer ptr);/*
		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->pEngineName));
	 */

	/**
	 * Native SET method for field engineVersion	[int]<br>
	 * Prototype: uint32_t  engineVersion
	 */ 
	 private static native void setEngineVersion0(Buffer ptr, int _engineVersion);/*
		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		 // code for simple past value 
		  vkObj->engineVersion = (uint32_t) (_engineVersion);
	  */

	/**
	 * Native GET method for field engineVersion	[int]<br>
	 * Prototype: uint32_t  engineVersion
	 */ 
	 private static native int getEngineVersion0(Buffer ptr);/*
		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  return (jint) (vkObj->engineVersion);
	 */

	/**
	 * Native SET method for field apiVersion	[int]<br>
	 * Prototype: uint32_t  apiVersion
	 */ 
	 private static native void setApiVersion0(Buffer ptr, int _apiVersion);/*
		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		 // code for simple past value 
		  vkObj->apiVersion = (uint32_t) (_apiVersion);
	  */

	/**
	 * Native GET method for field apiVersion	[int]<br>
	 * Prototype: uint32_t  apiVersion
	 */ 
	 private static native int getApiVersion0(Buffer ptr);/*
		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  return (jint) (vkObj->apiVersion);
	 */



} // end of class VkApplicationInfo
