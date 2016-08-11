/**
 * Class wrapping Vulkan's VkDebugMarkerObjectTagInfoEXT struct.
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
 *  This class is a Java front end for struct VkDebugMarkerObjectTagInfoEXT. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDebugMarkerObjectTagInfoEXT {
 *     VkStructureType               sType;
 *     const void*                   pNext;
 *     VkDebugReportObjectTypeEXT    objectType;
 *     uint64_t                      object;
 *     uint64_t                      tagName;
 *     size_t                        tagSize;
 *     const void*                   pTag;
 * } VkDebugMarkerObjectTagInfoEXT;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkDebugMarkerObjectTagInfoEXT extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [127]  */
	 private static final String TAG = "VkDebugMarkerObjectTagInfoEXT";

	/** ID of this structure [127]  */
	 public static final int TAG_ID = VKDEBUGMARKEROBJECTTAGINFOEXT_ID;

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
	 *  uint64_t 	tagName	[long]
	 */ 
	long 	tagName;
	
	/**
	 *  size_t 	tagSize	[long]
	 */ 
	long 	tagSize;
	
	/**
	 *  const void* 	pTag	[buffer]
	 */ 
	java.nio.Buffer 	pTag;
	/**
	 * Ctor
	 */
	public VkDebugMarkerObjectTagInfoEXT(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDebugMarkerObjectTagInfoEXT(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDebugMarkerObjectTagInfoEXT(long address){ 
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
	 public VkDebugMarkerObjectTagInfoEXT sType(VkStructureType sType){
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
	 public VkDebugMarkerObjectTagInfoEXT pNext(VkObject pNext){
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
	 public VkDebugMarkerObjectTagInfoEXT objectType(VkDebugReportObjectTypeEXT objectType){
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
	 public VkDebugMarkerObjectTagInfoEXT object(long object){
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
	 * Set method for field tagName	[long]<br>
	 * Prototype: uint64_t  tagName
	 * 
	 * @param tagName - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkDebugMarkerObjectTagInfoEXT tagName(long tagName){
		 this.tagName = tagName;
		 setTagName0(this.ptr,  tagName);
		 return this;
	 }

	/**
	 * Get method for field tagName	[long]<br>
	 * Prototype: uint64_t  tagName
	 */ 
	 public long tagName(){
		 long var = getTagName0(super.ptr);
		 this.tagName = var;
		 return this.tagName;
	 }

	/**
	 * Set method for field tagSize	[long]<br>
	 * Prototype: size_t  tagSize
	 * 
	 * @param tagSize - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkDebugMarkerObjectTagInfoEXT tagSize(long tagSize){
		 this.tagSize = tagSize;
		 setTagSize0(this.ptr,  tagSize);
		 return this;
	 }

	/**
	 * Get method for field tagSize	[long]<br>
	 * Prototype: size_t  tagSize
	 */ 
	 public long tagSize(){
		 long var = getTagSize0(super.ptr);
		 this.tagSize = var;
		 return this.tagSize;
	 }

	/**
	 * Set method for field pTag	[buffer]<br>
	 * Prototype: const void*  pTag
	 * 
	 * @param pTag - a instance of java.nio.Buffer.
	 * @return this VkStruct instance.
	 */ 
	 public VkDebugMarkerObjectTagInfoEXT pTag(java.nio.Buffer pTag){
		 this.pTag = pTag;
		 setPTag0(this.ptr,  pTag);
		 return this;
	 }

	/**
	 * Get method for field pTag	[buffer]<br>
	 * Prototype: const void*  pTag
	 */ 
	 public java.nio.Buffer pTag(){
		 long address = getPTag0(super.ptr);
		 if(this.pTag == null && address != 0L){
			  ByteBuffer bb = wrapPointer(address, 8);
			  this.pTag = bb;
		 }
		 return this.pTag;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkDebugMarkerObjectTagInfoEXT [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n objectType: ")
				.append(objectType() )
				.append(",\n object: ")
				.append(object() )
				.append(",\n tagName: ")
				.append(tagName() )
				.append(",\n tagSize: ")
				.append(tagSize() )
				.append(",\n pTag: ")
				.append(pTag() )
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
		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field objectType	[vkenum]<br>
	 * Prototype: VkDebugReportObjectTypeEXT  objectType
	 */ 
	 private static native void setObjectType0(Buffer ptr, int  _objectType);/*
		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		 // code for simple past value 
		  vkObj->objectType = (VkDebugReportObjectTypeEXT) (_objectType);
	  */

	/**
	 * Native GET method for field objectType	[vkenum]<br>
	 * Prototype: VkDebugReportObjectTypeEXT  objectType
	 */ 
	 private static native int  getObjectType0(Buffer ptr);/*
		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		  return (VkDebugReportObjectTypeEXT) (vkObj->objectType);
	 */

	/**
	 * Native SET method for field object	[long]<br>
	 * Prototype: uint64_t  object
	 */ 
	 private static native void setObject0(Buffer ptr, long _object);/*
		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		 // code for simple past value 
		  vkObj->object = (uint64_t) (_object);
	  */

	/**
	 * Native GET method for field object	[long]<br>
	 * Prototype: uint64_t  object
	 */ 
	 private static native long getObject0(Buffer ptr);/*
		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		  return (jlong) (vkObj->object);
	 */

	/**
	 * Native SET method for field tagName	[long]<br>
	 * Prototype: uint64_t  tagName
	 */ 
	 private static native void setTagName0(Buffer ptr, long _tagName);/*
		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		 // code for simple past value 
		  vkObj->tagName = (uint64_t) (_tagName);
	  */

	/**
	 * Native GET method for field tagName	[long]<br>
	 * Prototype: uint64_t  tagName
	 */ 
	 private static native long getTagName0(Buffer ptr);/*
		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		  return (jlong) (vkObj->tagName);
	 */

	/**
	 * Native SET method for field tagSize	[long]<br>
	 * Prototype: size_t  tagSize
	 */ 
	 private static native void setTagSize0(Buffer ptr, long _tagSize);/*
		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		 // code for simple past value 
		  vkObj->tagSize = (size_t) (_tagSize);
	  */

	/**
	 * Native GET method for field tagSize	[long]<br>
	 * Prototype: size_t  tagSize
	 */ 
	 private static native long getTagSize0(Buffer ptr);/*
		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		  return (jlong) (vkObj->tagSize);
	 */

	/**
	 * Native SET method for field pTag	[buffer]<br>
	 * Prototype: const void*  pTag
	 */ 
	 private static native void setPTag0(Buffer ptr, java.nio.Buffer _pTag);/*
		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pTag = (const void*) (_pTag);
	  */

	/**
	 * Native GET method for field pTag	[buffer]<br>
	 * Prototype: const void*  pTag
	 */ 
	 private static native long getPTag0(Buffer ptr);/*
		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pTag);
	 */



} // end of class VkDebugMarkerObjectTagInfoEXT
