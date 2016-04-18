/**
 * Class wrapping Vulkan's VkInstanceCreateInfo struct.
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
 *  This class is a Java front end for struct VkInstanceCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkInstanceCreateInfo {
 *     VkStructureType             sType;
 *     const void*                 pNext;
 *     VkInstanceCreateFlags       flags;
 *     const VkApplicationInfo*    pApplicationInfo;
 *     uint32_t                    enabledLayerCount;
 *     const char* const*          ppEnabledLayerNames;
 *     uint32_t                    enabledExtensionCount;
 *     const char* const*          ppEnabledExtensionNames;
 * } VkInstanceCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkInstanceCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    #include <vector>
    #include <string>
    #include <iostream>
    
    using namespace std;
    */  

	/** TAG of this structure [2]  */
	 private static final String TAG = "VkInstanceCreateInfo";

	/** ID of this structure [2]  */
	 public static final int TAG_ID = VKINSTANCECREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkInstanceCreateInfo> p;

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
	 *  VkInstanceCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  const VkApplicationInfo* 	pApplicationInfo	[vkstruct]
	 */ 
	  VkApplicationInfo  	pApplicationInfo;

	/**
	 *  uint32_t 	enabledLayerCount	[int]
	 */ 
	 int 	enabledLayerCount;

	/**
	 *  const char* const* 	ppEnabledLayerNames	[string_arr]
	 */ 
	 String[] 	ppEnabledLayerNames;

	/**
	 *  uint32_t 	enabledExtensionCount	[int]
	 */ 
	 int 	enabledExtensionCount;

	/**
	 *  const char* const* 	ppEnabledExtensionNames	[string_arr]
	 */ 
	 String[] 	ppEnabledExtensionNames;

	/**
	 * Ctor
	 */
	public VkInstanceCreateInfo(){ 
		 super(sizeOf(),0); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkInstanceCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkInstanceCreateInfo(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkInstanceCreateInfo(long address){ 
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
	 public static P<VkInstanceCreateInfo> createNullPointer(){
	        P<VkInstanceCreateInfo> p = new  P<VkInstanceCreateInfo>(new VkInstanceCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkInstanceCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkInstanceCreateInfo> (this);
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
		 setSType0(this.ptr, enumVal );
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
	 */ 
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 setPNext0(this.ptr, buff);
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
	 * Set method for field flags	[int]<br>
	 * Prototype: VkInstanceCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkInstanceCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field pApplicationInfo	[vkstruct]<br>
	 * Prototype: const VkApplicationInfo*  pApplicationInfo
	 */ 
	 public void pApplicationInfo( VkApplicationInfo  pApplicationInfo){
		 this.pApplicationInfo = pApplicationInfo;
		 ByteBuffer buff = (pApplicationInfo==null) ? null : pApplicationInfo.getPointer();
		 setPApplicationInfo0(this.ptr, buff);
	 }

	/**
	 * Get method for field pApplicationInfo	[vkstruct]<br>
	 * Prototype: const VkApplicationInfo*  pApplicationInfo
	 */ 
	 public  VkApplicationInfo  pApplicationInfo(){
		 long pointer = getPApplicationInfo0(super.ptr);
		 if(pointer == 0){
		    this.pApplicationInfo = null;
		    return null;
		  } 

		 if(this.pApplicationInfo == null){
		    this.pApplicationInfo = new  VkApplicationInfo (pointer);
		 }else{
		    this.pApplicationInfo.setPointer(pointer);
		  }
		 return this.pApplicationInfo;
	 }

	/**
	 * Set method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 public void enabledLayerCount(int enabledLayerCount){
		 this.enabledLayerCount = enabledLayerCount;
		 setEnabledLayerCount0(this.ptr,  enabledLayerCount);
	 }

	/**
	 * Get method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 public int enabledLayerCount(){
		 int var = getEnabledLayerCount0(super.ptr);
		 this.enabledLayerCount = var;
		 return this.enabledLayerCount;
	 }

	/**
	 * Set method for field ppEnabledLayerNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledLayerNames
	 */ 
	 public void ppEnabledLayerNames(String[] ppEnabledLayerNames){
		 this.ppEnabledLayerNames = ppEnabledLayerNames;
		 setPpEnabledLayerNames0(this.ptr,  ppEnabledLayerNames);
	 }

	/**
	 * Get method for field ppEnabledLayerNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledLayerNames
	 */ 
	 public String[] ppEnabledLayerNames(){
	     return this.ppEnabledLayerNames;
//		 String[] var = getPpEnabledLayerNames0(super.ptr);
//		 this.ppEnabledLayerNames = var;
//		 return this.ppEnabledLayerNames;
	 }

	/**
	 * Set method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 public void enabledExtensionCount(int enabledExtensionCount){
		 this.enabledExtensionCount = enabledExtensionCount;
		 setEnabledExtensionCount0(this.ptr,  enabledExtensionCount);
	 }

	/**
	 * Get method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 public int enabledExtensionCount(){
		 int var = getEnabledExtensionCount0(super.ptr);
		 this.enabledExtensionCount = var;
		 return this.enabledExtensionCount;
	 }

	/**
	 * Set method for field ppEnabledExtensionNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledExtensionNames
	 */ 
	 public void ppEnabledExtensionNames(String[] ppEnabledExtensionNames){
		 this.ppEnabledExtensionNames = ppEnabledExtensionNames;
		 setPpEnabledExtensionNames0(this.ptr,  ppEnabledExtensionNames);
	 }

	/**
	 * Get method for field ppEnabledExtensionNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledExtensionNames
	 */ 
	 public String[] ppEnabledExtensionNames(){
	    //  if(ppEnabledExtensionNames != null){
	         return this.ppEnabledExtensionNames;
	   //   }
//		String[] var = getPpEnabledExtensionNames0(super.ptr);
//		this.ppEnabledExtensionNames = var;
//		return this.ppEnabledExtensionNames;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkInstanceCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  vkObj->flags = (VkInstanceCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkInstanceCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field pApplicationInfo	[vkstruct]<br>
	 * Prototype: const VkApplicationInfo*  pApplicationInfo
	 */ 
	 private static native void setPApplicationInfo0(Buffer ptr, java.nio.ByteBuffer  _pApplicationInfo);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  vkObj->pApplicationInfo = (const VkApplicationInfo*) (_pApplicationInfo);
	  */

	/**
	 * native GET method for field pApplicationInfo	[vkstruct]<br>
	 * Prototype: const VkApplicationInfo*  pApplicationInfo
	 */ 
	 private static native long getPApplicationInfo0(Buffer ptr);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pApplicationInfo);	 */

	/**
	 * native SET method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 private static native void setEnabledLayerCount0(Buffer ptr, int _enabledLayerCount);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  vkObj->enabledLayerCount = (uint32_t) (_enabledLayerCount);
	  */

	/**
	 * native GET method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 private static native int getEnabledLayerCount0(Buffer ptr);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (jint) (vkObj->enabledLayerCount);
	 */

	/**
	 * native SET method for field ppEnabledLayerNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledLayerNames
	 */ 
	 private static native void setPpEnabledLayerNames0(Buffer ptr, String[] enabledLayerNames);/*
	          VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
                  
                  int stringCount = enabledLayerNames ? env->GetArrayLength(enabledLayerNames) : 0;
                  std::vector<const char*> enabledLayers;
                  
                  for (int i=0; i<stringCount; i++) {
                          jstring string = (jstring) env->GetObjectArrayElement(enabledLayerNames, i);
                          const char *rawString = env->GetStringUTFChars(string, 0);
                          enabledLayers.push_back(rawString);
                        // Don't forget to call `ReleaseStringUTFChars` when you're done.
                          env->ReleaseStringUTFChars(string, rawString);
                   }
                   
                  vkObj->enabledLayerCount = enabledLayers.size();
                  vkObj->ppEnabledLayerNames = (const char* const*) enabledLayers.data();
                  
		  //vkObj->ppEnabledLayerNames = (const char* const*) (_ppEnabledLayerNames);
	  */

	/**
	 * native GET method for field ppEnabledLayerNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledLayerNames
	 */ 
	 private static native String[] getPpEnabledLayerNames0(Buffer ptr);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
				  
                  int count = (int) vkObj->enabledLayerCount;
                  
                  jobjectArray ret;
                  
                  if(count>0){
                   
                   // thanks to code ranch 
                   // http://www.coderanch.com/t/326467/java/java/Returning-String-array-program-Java
                   ret= (jobjectArray)env->NewObjectArray(count,
                                                          env->FindClass("java/lang/String"),
                                                          env->NewStringUTF(""));
                   // const char *ppLayerNames[] = (vkObj->ppEnabledLayerNames);
                    for(int i = 0; i<count; i++){
                         env->SetObjectArrayElement(ret, 
                                                    i,
                                                    env->NewStringUTF(vkObj->ppEnabledLayerNames[i]));
                      }//for
                      return ret;
                  }//if count
                   
                  return NULL; 
	 */

	/**
	 * native SET method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 private static native void setEnabledExtensionCount0(Buffer ptr, int _enabledExtensionCount);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  vkObj->enabledExtensionCount = (uint32_t) (_enabledExtensionCount);
	  */

	/**
	 * native GET method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 private static native int getEnabledExtensionCount0(Buffer ptr);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (jint) (vkObj->enabledExtensionCount);
	 */

	/**
	 * native SET method for field ppEnabledExtensionNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledExtensionNames
	 */ 
	 private static native void setPpEnabledExtensionNames0(Buffer ptr, String[] enabledExtensionNames);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  
		  int stringCount = enabledExtensionNames ? env->GetArrayLength(enabledExtensionNames) : 0;
                  std::vector<const char*> enabledExtensions;
                  
                  for (int i=0; i<stringCount; i++) {
                          jstring string = (jstring) env->GetObjectArrayElement(enabledExtensionNames, i);
                          const char *rawString = env->GetStringUTFChars(string, 0);
                          enabledExtensions.push_back(rawString);
                        // Don't forget to call `ReleaseStringUTFChars` when you're done.
                          env->ReleaseStringUTFChars(string, rawString);
                   }
		   
		  vkObj->enabledExtensionCount = enabledExtensions.size();
                  vkObj->ppEnabledExtensionNames = (const char* const*) enabledExtensions.data();
		  
	  */

	/**
	 * native GET method for field ppEnabledExtensionNames	[string_arr]<br>
	 * Prototype: const char* const*  ppEnabledExtensionNames
	 */ 
	 private static native String[] getPpEnabledExtensionNames0(Buffer ptr);/*
		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  int count = (int) vkObj->enabledExtensionCount;
		  
		  jobjectArray ret;
		  
		  if(count>0){
		  // const char *ppEnabledExtensionNames[] = (vkObj->ppEnabledExtensionNames);
		   // thanks to code ranch 
		   // http://www.coderanch.com/t/326467/java/java/Returning-String-array-program-Java
		   ret= (jobjectArray)env->NewObjectArray(count,
		                                          env->FindClass("java/lang/String"),
		                                          env->NewStringUTF(""));
		     for(int i = 0; i<count; i++){
		      env->SetObjectArrayElement(ret, 
		                                  i,
		                                  env->NewStringUTF(vkObj->ppEnabledExtensionNames[i]));
		      }
		      return ret;
		  }
		   
		  return NULL; //(String[]) (vkObj->ppEnabledExtensionNames);
	 */



} // end of class VkInstanceCreateInfo
