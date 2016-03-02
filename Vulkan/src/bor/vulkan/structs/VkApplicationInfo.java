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

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.*;
import java.nio.ByteBuffer;


/**
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
	/** TAG of this structure [125]  */
	 private static final String TAG = "VkApplicationInfo";

	/** ID of this structure [125]  */
	 public static final int TAG_ID = VKAPPLICATIONINFO_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType	[vkenum]	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext		 */ 
	P<VkObject> 	pNext;

	/**
	 *  const char* 	pApplicationName		 */ 
	String 	pApplicationName;

	/**
	 *  uint32_t 	applicationVersion		 */ 
	int 	applicationVersion;

	/**
	 *  const char* 	pEngineName		 */ 
	String 	pEngineName;

	/**
	 *  uint32_t 	engineVersion		 */ 
	int 	engineVersion;

	/**
	 *  uint32_t 	apiVersion		 */ 
	int 	apiVersion;

	/**
	 * Ctor
	 */
	public VkApplicationInfo(){ 
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
	 * Set method for field pApplicationName	
	 * Prototype: const char*  pApplicationName
	 */ 
	 public void pApplicationName(String pApplicationName){
		 this.pApplicationName = pApplicationName;
		pApplicationName0(super.ptr, pApplicationName);
	 }

	/**
	 * get method for field pApplicationName	
	 * Prototype: const char*  pApplicationName
	 */ 
	 public String pApplicationName(){
		 // return  this.pApplicationName;
		 return pApplicationName0(super.ptr);
	 }

	/**
	 * Set method for field applicationVersion	
	 * Prototype: uint32_t  applicationVersion
	 */ 
	 public void applicationVersion(int applicationVersion){
		 this.applicationVersion = applicationVersion;
		applicationVersion0(super.ptr, applicationVersion);
	 }

	/**
	 * get method for field applicationVersion	
	 * Prototype: uint32_t  applicationVersion
	 */ 
	 public int applicationVersion(){
		 // return  this.applicationVersion;
		 return applicationVersion0(super.ptr);
	 }

	/**
	 * Set method for field pEngineName	
	 * Prototype: const char*  pEngineName
	 */ 
	 public void pEngineName(String pEngineName){
		 this.pEngineName = pEngineName;
		pEngineName0(super.ptr, pEngineName);
	 }

	/**
	 * get method for field pEngineName	
	 * Prototype: const char*  pEngineName
	 */ 
	 public String pEngineName(){
		 // return  this.pEngineName;
		 return pEngineName0(super.ptr);
	 }

	/**
	 * Set method for field engineVersion	
	 * Prototype: uint32_t  engineVersion
	 */ 
	 public void engineVersion(int engineVersion){
		 this.engineVersion = engineVersion;
		engineVersion0(super.ptr, engineVersion);
	 }

	/**
	 * get method for field engineVersion	
	 * Prototype: uint32_t  engineVersion
	 */ 
	 public int engineVersion(){
		 // return  this.engineVersion;
		 return engineVersion0(super.ptr);
	 }

	/**
	 * Set method for field apiVersion	
	 * Prototype: uint32_t  apiVersion
	 */ 
	 public void apiVersion(int apiVersion){
		 this.apiVersion = apiVersion;
		apiVersion0(super.ptr, apiVersion);
	 }

	/**
	 * get method for field apiVersion	
	 * Prototype: uint32_t  apiVersion
	 */ 
	 public int apiVersion(){
		 // return  this.apiVersion;
		 return apiVersion0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkApplicationInfo _obj = (VkApplicationInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkApplicationInfo _obj = (VkApplicationInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkApplicationInfo _obj = (VkApplicationInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkApplicationInfo _obj = (VkApplicationInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field pApplicationName	
	 * Prototype: const char*  pApplicationName
	 */ 
	 private static native void pApplicationName0(ByteBuffer ptr, String _pApplicationName);/*
		  VkApplicationInfo _obj = (VkApplicationInfo)(*ptr);
		  _obj.pApplicationName = (const char*) (_pApplicationName);
	  */

	/**
	 * get method for field pApplicationName	
	 * Prototype: const char*  pApplicationName
	 */ 
	 private static native String pApplicationName0(ByteBuffer ptr);/*
		  VkApplicationInfo _obj = (VkApplicationInfo)(ptr);
		  return (jstring)(env->NewStringUTF(_obj.const char*);	 */

	/**
	 * native Set method for field applicationVersion	
	 * Prototype: uint32_t  applicationVersion
	 */ 
	 private static native void applicationVersion0(ByteBuffer ptr, int _applicationVersion);/*
		  VkApplicationInfo _obj = (VkApplicationInfo)(*ptr);
		  _obj.applicationVersion = (uint32_t) (_applicationVersion);
	  */

	/**
	 * get method for field applicationVersion	
	 * Prototype: uint32_t  applicationVersion
	 */ 
	 private static native int applicationVersion0(ByteBuffer ptr);/*
		  VkApplicationInfo _obj = (VkApplicationInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pEngineName	
	 * Prototype: const char*  pEngineName
	 */ 
	 private static native void pEngineName0(ByteBuffer ptr, String _pEngineName);/*
		  VkApplicationInfo _obj = (VkApplicationInfo)(*ptr);
		  _obj.pEngineName = (const char*) (_pEngineName);
	  */

	/**
	 * get method for field pEngineName	
	 * Prototype: const char*  pEngineName
	 */ 
	 private static native String pEngineName0(ByteBuffer ptr);/*
		  VkApplicationInfo _obj = (VkApplicationInfo)(ptr);
		  return (jstring)(env->NewStringUTF(_obj.const char*);	 */

	/**
	 * native Set method for field engineVersion	
	 * Prototype: uint32_t  engineVersion
	 */ 
	 private static native void engineVersion0(ByteBuffer ptr, int _engineVersion);/*
		  VkApplicationInfo _obj = (VkApplicationInfo)(*ptr);
		  _obj.engineVersion = (uint32_t) (_engineVersion);
	  */

	/**
	 * get method for field engineVersion	
	 * Prototype: uint32_t  engineVersion
	 */ 
	 private static native int engineVersion0(ByteBuffer ptr);/*
		  VkApplicationInfo _obj = (VkApplicationInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field apiVersion	
	 * Prototype: uint32_t  apiVersion
	 */ 
	 private static native void apiVersion0(ByteBuffer ptr, int _apiVersion);/*
		  VkApplicationInfo _obj = (VkApplicationInfo)(*ptr);
		  _obj.apiVersion = (uint32_t) (_apiVersion);
	  */

	/**
	 * get method for field apiVersion	
	 * Prototype: uint32_t  apiVersion
	 */ 
	 private static native int apiVersion0(ByteBuffer ptr);/*
		  VkApplicationInfo _obj = (VkApplicationInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkApplicationInfo
