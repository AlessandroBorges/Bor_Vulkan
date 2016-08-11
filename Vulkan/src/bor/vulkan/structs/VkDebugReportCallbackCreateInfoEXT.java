/**
 * Class wrapping Vulkan's VkDebugReportCallbackCreateInfoEXT struct.
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
 *  This class is a Java front end for struct VkDebugReportCallbackCreateInfoEXT. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDebugReportCallbackCreateInfoEXT {
 *     VkStructureType                 sType;
 *     const void*                     pNext;
 *     VkDebugReportFlagsEXT           flags;
 *     PFN_vkDebugReportCallbackEXT    pfnCallback;
 *     void*                           pUserData;
 * } VkDebugReportCallbackCreateInfoEXT;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkDebugReportCallbackCreateInfoEXT extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [124]  */
	 private static final String TAG = "VkDebugReportCallbackCreateInfoEXT";

	/** ID of this structure [124]  */
	 public static final int TAG_ID = VKDEBUGREPORTCALLBACKCREATEINFOEXT_ID;

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
	 *  VkDebugReportFlagsEXT 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  PFN_vkDebugReportCallbackEXT 	pfnCallback	[vkpfn]
	 */ 
	PFNvkDebugReportCallbackEXT 	pfnCallback;
	
	/**
	 *  void* 	pUserData	[buffer]
	 */ 
	java.nio.Buffer 	pUserData;
	/**
	 * Ctor
	 */
	public VkDebugReportCallbackCreateInfoEXT(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDebugReportCallbackCreateInfoEXT(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDebugReportCallbackCreateInfoEXT(long address){ 
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
	 public VkDebugReportCallbackCreateInfoEXT sType(VkStructureType sType){
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
	 public VkDebugReportCallbackCreateInfoEXT pNext(VkObject pNext){
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
	 * Prototype: VkDebugReportFlagsEXT  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDebugReportCallbackCreateInfoEXT flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkDebugReportFlagsEXT  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field pfnCallback	[vkpfn]<br>
	 * Prototype: PFN_vkDebugReportCallbackEXT  pfnCallback
	 * 
	 * @param pfnCallback - a instance of PFNvkDebugReportCallbackEXT.
	 * @return this VkStruct instance.
	 */ 
	 public VkDebugReportCallbackCreateInfoEXT pfnCallback(PFNvkDebugReportCallbackEXT pfnCallback){
		 this.pfnCallback = pfnCallback;
		 long handle = (pfnCallback==null) ? 0L : pfnCallback.getNativeHandle();
		 setPfnCallback0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field pfnCallback	[vkpfn]<br>
	 * Prototype: PFN_vkDebugReportCallbackEXT  pfnCallback
	 */ 
	 public PFNvkDebugReportCallbackEXT pfnCallback(){

		  long handle = getPfnCallback0(super.ptr);
		 if(handle == 0){
		    this.pfnCallback = null;
		    return null;
		  }  

		 if(this.pfnCallback == null){
		    this.pfnCallback = new PFNvkDebugReportCallbackEXT(handle);
		 }else{
		    this.pfnCallback.setNativeHandle(handle);
		  }
		 return this.pfnCallback;
	 }

	/**
	 * Set method for field pUserData	[buffer]<br>
	 * Prototype: void*  pUserData
	 * 
	 * @param pUserData - a instance of java.nio.Buffer.
	 * @return this VkStruct instance.
	 */ 
	 public VkDebugReportCallbackCreateInfoEXT pUserData(java.nio.Buffer pUserData){
		 this.pUserData = pUserData;
		 setPUserData0(this.ptr,  pUserData);
		 return this;
	 }

	/**
	 * Get method for field pUserData	[buffer]<br>
	 * Prototype: void*  pUserData
	 */ 
	 public java.nio.Buffer pUserData(){
		 long address = getPUserData0(super.ptr);
		 if(this.pUserData == null && address != 0L){
			  ByteBuffer bb = wrapPointer(address, 8);
			  this.pUserData = bb;
		 }
		 return this.pUserData;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkDebugReportCallbackCreateInfoEXT [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n pfnCallback: ")
				.append(pfnCallback() )
				.append(",\n pUserData: ")
				.append(pUserData() )
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
		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkDebugReportFlagsEXT  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkDebugReportFlagsEXT) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkDebugReportFlagsEXT  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field pfnCallback	[vkpfn]<br>
	 * Prototype: PFN_vkDebugReportCallbackEXT  pfnCallback
	 */ 
	 private static native void setPfnCallback0(Buffer ptr, long  _pfnCallback);/*
		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		 // code for simple past value 
		  vkObj->pfnCallback = (PFN_vkDebugReportCallbackEXT) (_pfnCallback);
	  */

	/**
	 * Native GET method for field pfnCallback	[vkpfn]<br>
	 * Prototype: PFN_vkDebugReportCallbackEXT  pfnCallback
	 */ 
	 private static native long getPfnCallback0(Buffer ptr);/*
		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pfnCallback);
	 */

	/**
	 * Native SET method for field pUserData	[buffer]<br>
	 * Prototype: void*  pUserData
	 */ 
	 private static native void setPUserData0(Buffer ptr, java.nio.Buffer _pUserData);/*
		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pUserData = (void*) (_pUserData);
	  */

	/**
	 * Native GET method for field pUserData	[buffer]<br>
	 * Prototype: void*  pUserData
	 */ 
	 private static native long getPUserData0(Buffer ptr);/*
		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pUserData);
	 */



} // end of class VkDebugReportCallbackCreateInfoEXT
