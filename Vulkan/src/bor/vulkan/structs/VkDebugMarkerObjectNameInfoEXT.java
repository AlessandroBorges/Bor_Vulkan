/**
 * Class wrapping Vulkan's VkDebugMarkerObjectNameInfoEXT struct.
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
 *  This class is a Java front end for struct VkDebugMarkerObjectNameInfoEXT. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDebugMarkerObjectNameInfoEXT {
 *     VkStructureType               sType;
 *     const void*                   pNext;
 *     VkDebugReportObjectTypeEXT    objectType;
 *     uint64_t                      object;
 *     const char*                   pObjectName;
 * } VkDebugMarkerObjectNameInfoEXT;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkDebugMarkerObjectNameInfoEXT extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [126]  */
	 private static final String TAG = "VkDebugMarkerObjectNameInfoEXT";

	/** ID of this structure [126]  */
	 public static final int TAG_ID = VKDEBUGMARKEROBJECTNAMEINFOEXT_ID;

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
	 *  VkDebugReportObjectTypeEXT 	objectType	[vkenum]
	 */ 
	VkDebugReportObjectTypeEXT 	objectType;
	
	/**
	 *  uint64_t 	object	[long]
	 */ 
	long 	object;
	
	/**
	 *  const char* 	pObjectName	[string]
	 */ 
	String 	pObjectName;
	/**
	 * Ctor
	 */
	public VkDebugMarkerObjectNameInfoEXT(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDebugMarkerObjectNameInfoEXT(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDebugMarkerObjectNameInfoEXT(long address){ 
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
	 public VkDebugMarkerObjectNameInfoEXT sType(VkStructureType sType){
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
	 public VkDebugMarkerObjectNameInfoEXT pNext(VkObject pNext){
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
	 * Set method for field objectType	[vkenum]<br>
	 * Prototype: VkDebugReportObjectTypeEXT  objectType
	 * 
	 * @param objectType - a instance of VkDebugReportObjectTypeEXT.
	 * @return this VkStruct instance.
	 */ 
	 public VkDebugMarkerObjectNameInfoEXT objectType(VkDebugReportObjectTypeEXT objectType){
		 this.objectType = objectType;
		 int enumVal = objectType.getValue();
		 setObjectType0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field objectType	[vkenum]<br>
	 * Prototype: VkDebugReportObjectTypeEXT  objectType
	 */ 
	 public VkDebugReportObjectTypeEXT objectType(){
		 int nativeVal = getObjectType0(super.ptr);
		 this.objectType = VkDebugReportObjectTypeEXT.fromValue(nativeVal); 
		 return this.objectType;
	 }

	/**
	 * Set method for field object	[long]<br>
	 * Prototype: uint64_t  object
	 * 
	 * @param object - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkDebugMarkerObjectNameInfoEXT object(long object){
		 this.object = object;
		 setObject0(this.ptr,  object);
		 return this;
	 }

	/**
	 * Get method for field object	[long]<br>
	 * Prototype: uint64_t  object
	 */ 
	 public long object(){
		 long var = getObject0(super.ptr);
		 this.object = var;
		 return this.object;
	 }

	/**
	 * Set method for field pObjectName	[string]<br>
	 * Prototype: const char*  pObjectName
	 * 
	 * @param pObjectName - a instance of String.
	 * @return this VkStruct instance.
	 */ 
	 public VkDebugMarkerObjectNameInfoEXT pObjectName(String pObjectName){
		 this.pObjectName = pObjectName;
		 setPObjectName0(this.ptr,  pObjectName);
		 return this;
	 }

	/**
	 * Get method for field pObjectName	[string]<br>
	 * Prototype: const char*  pObjectName
	 */ 
	 public String pObjectName(){
		 String var = getPObjectName0(super.ptr);
		 this.pObjectName = var;
		 return this.pObjectName;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkDebugMarkerObjectNameInfoEXT [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n objectType: ")
				.append(objectType() )
				.append(",\n object: ")
				.append(object() )
				.append(",\n pObjectName: ")
				.append(pObjectName() )
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
		  VkDebugMarkerObjectNameInfoEXT* vkObj = (VkDebugMarkerObjectNameInfoEXT*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkDebugMarkerObjectNameInfoEXT* vkObj = (VkDebugMarkerObjectNameInfoEXT*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDebugMarkerObjectNameInfoEXT* vkObj = (VkDebugMarkerObjectNameInfoEXT*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkDebugMarkerObjectNameInfoEXT* vkObj = (VkDebugMarkerObjectNameInfoEXT*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 */

	/**
	 * Native SET method for field objectType	[vkenum]<br>
	 * Prototype: VkDebugReportObjectTypeEXT  objectType
	 */ 
	 private static native void setObjectType0(Buffer ptr, int  _objectType);/*
		  VkDebugMarkerObjectNameInfoEXT* vkObj = (VkDebugMarkerObjectNameInfoEXT*)(ptr);
		  vkObj->objectType = (VkDebugReportObjectTypeEXT) (_objectType);
	  */

	/**
	 * Native GET method for field objectType	[vkenum]<br>
	 * Prototype: VkDebugReportObjectTypeEXT  objectType
	 */ 
	 private static native int  getObjectType0(Buffer ptr);/*
		  VkDebugMarkerObjectNameInfoEXT* vkObj = (VkDebugMarkerObjectNameInfoEXT*)(ptr);
		  return (VkDebugReportObjectTypeEXT) (vkObj->objectType);
	 */

	/**
	 * Native SET method for field object	[long]<br>
	 * Prototype: uint64_t  object
	 */ 
	 private static native void setObject0(Buffer ptr, long _object);/*
		  VkDebugMarkerObjectNameInfoEXT* vkObj = (VkDebugMarkerObjectNameInfoEXT*)(ptr);
		  vkObj->object = (uint64_t) (_object);
	  */

	/**
	 * Native GET method for field object	[long]<br>
	 * Prototype: uint64_t  object
	 */ 
	 private static native long getObject0(Buffer ptr);/*
		  VkDebugMarkerObjectNameInfoEXT* vkObj = (VkDebugMarkerObjectNameInfoEXT*)(ptr);
		  return (jlong) (vkObj->object);
	 */

	/**
	 * Native SET method for field pObjectName	[string]<br>
	 * Prototype: const char*  pObjectName
	 */ 
	 private static native void setPObjectName0(Buffer ptr, String _pObjectName);/*
		  VkDebugMarkerObjectNameInfoEXT* vkObj = (VkDebugMarkerObjectNameInfoEXT*)(ptr);
		  vkObj->pObjectName = cloneStr(_pObjectName);
	  */

	/**
	 * Native GET method for field pObjectName	[string]<br>
	 * Prototype: const char*  pObjectName
	 */ 
	 private static native String getPObjectName0(Buffer ptr);/*
		  VkDebugMarkerObjectNameInfoEXT* vkObj = (VkDebugMarkerObjectNameInfoEXT*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->pObjectName));
	 */



} // end of class VkDebugMarkerObjectNameInfoEXT
