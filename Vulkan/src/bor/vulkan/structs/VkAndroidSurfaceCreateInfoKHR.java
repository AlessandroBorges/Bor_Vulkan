/**
 * Class wrapping Vulkan's VkAndroidSurfaceCreateInfoKHR struct.
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
 *  This class is a Java front end for struct VkAndroidSurfaceCreateInfoKHR. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkAndroidSurfaceCreateInfoKHR {
 *     VkStructureType                   sType;
 *     const void*                       pNext;
 *     VkAndroidSurfaceCreateFlagsKHR    flags;
 *     ANativeWindow*                    window;
 * } VkAndroidSurfaceCreateInfoKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkAndroidSurfaceCreateInfoKHR extends VkStruct implements VkSurfaceCreateInfoKHR {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [122]  */
	 private static final String TAG = "VkAndroidSurfaceCreateInfoKHR";

	/** ID of this structure [122]  */
	 public static final int TAG_ID = VKANDROIDSURFACECREATEINFOKHR_ID;

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
	 *  VkAndroidSurfaceCreateFlagsKHR 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  ANativeWindow* 	window	[vkhandle]
	 */ 
	ANativeWindow 	window;
	/**
	 * Ctor
	 */
	public VkAndroidSurfaceCreateInfoKHR(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkAndroidSurfaceCreateInfoKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkAndroidSurfaceCreateInfoKHR(long address){ 
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
	 public static VkArray<VkAndroidSurfaceCreateInfoKHR> createVkArray(int size){ 
		 VkAndroidSurfaceCreateInfoKHR[] array = new VkAndroidSurfaceCreateInfoKHR[size]; 
		 VkArrayStruct<VkAndroidSurfaceCreateInfoKHR> vkArray = new VkArrayStruct<VkAndroidSurfaceCreateInfoKHR>(array, TAG_ID);
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
	 public VkAndroidSurfaceCreateInfoKHR sType(VkStructureType sType){
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
	 public VkAndroidSurfaceCreateInfoKHR pNext(VkObject pNext){
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
	 * Set method for field flags	[int]<br>
	 * Prototype: VkAndroidSurfaceCreateFlagsKHR  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkAndroidSurfaceCreateInfoKHR flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkAndroidSurfaceCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field window	[vkhandle]<br>
	 * Prototype: ANativeWindow*  window
	 * 
	 * @param window - a instance of ANativeWindow.
	 * @return this VkStruct instance.
	 */ 
	 public VkAndroidSurfaceCreateInfoKHR window(ANativeWindow window){
		 this.window = window;
		 long handle = (window==null) ? 0L : window.getNativeHandle();
		 setWindow0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field window	[vkhandle]<br>
	 * Prototype: ANativeWindow*  window
	 */ 
	 public ANativeWindow window(){

		 long handle = getWindow0(super.ptr);
		 if(handle == 0){
		    this.window = null;
		    return null;
		  }  

		 if(this.window == null){
		    this.window = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.window).setNativeHandle(handle);
		  }
		 return this.window;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkAndroidSurfaceCreateInfoKHR [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n window: ")
				.append(window() )
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
	 #ifdef VK_USE_PLATFORM_ANDROID_KHR 
		  VkAndroidSurfaceCreateInfoKHR* vkObj = (VkAndroidSurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	 #endif 
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
	 #ifdef VK_USE_PLATFORM_ANDROID_KHR 
		  VkAndroidSurfaceCreateInfoKHR* vkObj = (VkAndroidSurfaceCreateInfoKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 #else 
	   return 0; 
	 #endif 
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
	 #ifdef VK_USE_PLATFORM_ANDROID_KHR 
		  VkAndroidSurfaceCreateInfoKHR* vkObj = (VkAndroidSurfaceCreateInfoKHR*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	 #endif 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
	 #ifdef VK_USE_PLATFORM_ANDROID_KHR 
		  VkAndroidSurfaceCreateInfoKHR* vkObj = (VkAndroidSurfaceCreateInfoKHR*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 #else 
	   return 0; 
	 #endif 
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkAndroidSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
	 #ifdef VK_USE_PLATFORM_ANDROID_KHR 
		  VkAndroidSurfaceCreateInfoKHR* vkObj = (VkAndroidSurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkAndroidSurfaceCreateFlagsKHR) (_flags);
	 #endif 
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkAndroidSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
	 #ifdef VK_USE_PLATFORM_ANDROID_KHR 
		  VkAndroidSurfaceCreateInfoKHR* vkObj = (VkAndroidSurfaceCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->flags);
	 #else 
	   return 0; 
	 #endif 
	 */

	/**
	 * Native SET method for field window	[vkhandle]<br>
	 * Prototype: ANativeWindow*  window
	 */ 
	 private static native void setWindow0(Buffer ptr, long  _window);/*
	 #ifdef VK_USE_PLATFORM_ANDROID_KHR 
		  VkAndroidSurfaceCreateInfoKHR* vkObj = (VkAndroidSurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->window = (ANativeWindow*) (_window);
	 #endif 
	  */

	/**
	 * Native GET method for field window	[vkhandle]<br>
	 * Prototype: ANativeWindow*  window
	 */ 
	 private static native long getWindow0(Buffer ptr);/*
	 #ifdef VK_USE_PLATFORM_ANDROID_KHR 
		  VkAndroidSurfaceCreateInfoKHR* vkObj = (VkAndroidSurfaceCreateInfoKHR*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->window);
         #else 
	   return 0; 
	 #endif 
	 */



} // end of class VkAndroidSurfaceCreateInfoKHR
