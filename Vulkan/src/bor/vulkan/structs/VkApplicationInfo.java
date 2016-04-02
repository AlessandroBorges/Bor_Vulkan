/**
 * Class wrapping Vulkan's VkApplicationInfo struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.01 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.structs;

import java.nio.Buffer;
import java.nio.ByteBuffer;

import bor.vulkan.P;
import bor.vulkan.VkHandle;
import bor.vulkan.VkObject;
import bor.vulkan.enumerations.VkStructureType;


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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkApplicationInfo extends VkStruct {
	/** TAG of this structure [1]  */
	 private static final String TAG = "VkApplicationInfo";

	/** ID of this structure [1]  */
	 public static final int TAG_ID = VKAPPLICATIONINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkApplicationInfo> p;

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
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkApplicationInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkApplicationInfo(long address, int memSize){ 
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
	 public static P<VkApplicationInfo> createNullPointer(){
	        P<VkApplicationInfo> p = new  P<VkApplicationInfo>(new VkApplicationInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkApplicationInfo> getP() {
	       if(p == null ){
	           p = new P<VkApplicationInfo> (this);
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
		 sType0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = sType0(super.ptr);
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
		 pNext0(this.ptr, buff);
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 ByteBuffer pointer = pNext0(super.ptr);
		 if(pointer == null){
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
	 */ 
	 public void pApplicationName(String pApplicationName){
		 this.pApplicationName = pApplicationName;
		 pApplicationName0(this.ptr,  pApplicationName);
	 }

	/**
	 * Get method for field pApplicationName	[string]<br>
	 * Prototype: const char*  pApplicationName
	 */ 
	 public String pApplicationName(){
		 String var = pApplicationName0(super.ptr);
		 this.pApplicationName = var;
		 return this.pApplicationName;
	 }

	/**
	 * Set method for field applicationVersion	[int]<br>
	 * Prototype: uint32_t  applicationVersion
	 */ 
	 public void applicationVersion(int applicationVersion){
		 this.applicationVersion = applicationVersion;
		 applicationVersion0(this.ptr,  applicationVersion);
	 }

	/**
	 * Get method for field applicationVersion	[int]<br>
	 * Prototype: uint32_t  applicationVersion
	 */ 
	 public int applicationVersion(){
		 int var = applicationVersion0(super.ptr);
		 this.applicationVersion = var;
		 return this.applicationVersion;
	 }

	/**
	 * Set method for field pEngineName	[string]<br>
	 * Prototype: const char*  pEngineName
	 */ 
	 public void pEngineName(String pEngineName){
		 this.pEngineName = pEngineName;
		 pEngineName0(this.ptr,  pEngineName);
	 }

	/**
	 * Get method for field pEngineName	[string]<br>
	 * Prototype: const char*  pEngineName
	 */ 
	 public String pEngineName(){
		 String var = pEngineName0(super.ptr);
		 this.pEngineName = var;
		 return this.pEngineName;
	 }

	/**
	 * Set method for field engineVersion	[int]<br>
	 * Prototype: uint32_t  engineVersion
	 */ 
	 public void engineVersion(int engineVersion){
		 this.engineVersion = engineVersion;
		 engineVersion0(this.ptr,  engineVersion);
	 }

	/**
	 * Get method for field engineVersion	[int]<br>
	 * Prototype: uint32_t  engineVersion
	 */ 
	 public int engineVersion(){
		 int var = engineVersion0(super.ptr);
		 this.engineVersion = var;
		 return this.engineVersion;
	 }

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


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkApplicationInfo vkObj = (VkApplicationInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkApplicationInfo vkObj = (VkApplicationInfo*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field pApplicationName	[string]<br>
	 * Prototype: const char*  pApplicationName
	 */ 
	 private static native void pApplicationName0(Buffer ptr, String _pApplicationName);/*
		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  vkObj->pApplicationName = (const char*) (_pApplicationName);
	  */

	/**
	 * native GET method for field pApplicationName	[string]<br>
	 * Prototype: const char*  pApplicationName
	 */ 
	 private static native String pApplicationName0(Buffer ptr);/*
		  VkApplicationInfo vkObj = (VkApplicationInfo*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->.pApplicationName);	 */

	/**
	 * native SET method for field applicationVersion	[int]<br>
	 * Prototype: uint32_t  applicationVersion
	 */ 
	 private static native void applicationVersion0(Buffer ptr, int _applicationVersion);/*
		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  vkObj->applicationVersion = (uint32_t) (_applicationVersion);
	  */

	/**
	 * native GET method for field applicationVersion	[int]<br>
	 * Prototype: uint32_t  applicationVersion
	 */ 
	 private static native int applicationVersion0(Buffer ptr);/*
		  VkApplicationInfo vkObj = (VkApplicationInfo*)(ptr);
		  return (jint) (vkObj->applicationVersion);
	 */

	/**
	 * native SET method for field pEngineName	[string]<br>
	 * Prototype: const char*  pEngineName
	 */ 
	 private static native void pEngineName0(Buffer ptr, String _pEngineName);/*
		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  vkObj->pEngineName = (const char*) (_pEngineName);
	  */

	/**
	 * native GET method for field pEngineName	[string]<br>
	 * Prototype: const char*  pEngineName
	 */ 
	 private static native String pEngineName0(Buffer ptr);/*
		  VkApplicationInfo vkObj = (VkApplicationInfo*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->.pEngineName);	 */

	/**
	 * native SET method for field engineVersion	[int]<br>
	 * Prototype: uint32_t  engineVersion
	 */ 
	 private static native void engineVersion0(Buffer ptr, int _engineVersion);/*
		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  vkObj->engineVersion = (uint32_t) (_engineVersion);
	  */

	/**
	 * native GET method for field engineVersion	[int]<br>
	 * Prototype: uint32_t  engineVersion
	 */ 
	 private static native int engineVersion0(Buffer ptr);/*
		  VkApplicationInfo vkObj = (VkApplicationInfo*)(ptr);
		  return (jint) (vkObj->engineVersion);
	 */

	/**
	 * native SET method for field apiVersion	[int]<br>
	 * Prototype: uint32_t  apiVersion
	 */ 
	 private static native void apiVersion0(Buffer ptr, int _apiVersion);/*
		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  vkObj->apiVersion = (uint32_t) (_apiVersion);
	  */

	/**
	 * native GET method for field apiVersion	[int]<br>
	 * Prototype: uint32_t  apiVersion
	 */ 
	 private static native int apiVersion0(Buffer ptr);/*
		  VkApplicationInfo vkObj = (VkApplicationInfo*)(ptr);
		  return (jint) (vkObj->apiVersion);
	 */



} // end of class VkApplicationInfo
