/**
 * Class wrapping Vulkan's VkPipelineCacheCreateInfo struct.
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
 *  This class is a Java front end for struct VkPipelineCacheCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPipelineCacheCreateInfo {
 *     VkStructureType               sType;
 *     const void*                   pNext;
 *     VkPipelineCacheCreateFlags    flags;
 *     size_t                        initialDataSize;
 *     const void*                   pInitialData;
 * } VkPipelineCacheCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkPipelineCacheCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [45]  */
	 private static final String TAG = "VkPipelineCacheCreateInfo";

	/** ID of this structure [45]  */
	 public static final int TAG_ID = VKPIPELINECACHECREATEINFO_ID;

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
	 *  VkPipelineCacheCreateFlags 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  size_t 	initialDataSize	[long]
	 */ 
	long 	initialDataSize;
	
	/**
	 *  const void* 	pInitialData	[buffer]
	 */ 
	java.nio.Buffer 	pInitialData;
	/**
	 * Ctor
	 */
	public VkPipelineCacheCreateInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineCacheCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPipelineCacheCreateInfo(long address){ 
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
	 public VkPipelineCacheCreateInfo sType(VkStructureType sType){
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
	 public VkPipelineCacheCreateInfo pNext(VkObject pNext){
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
	 * Prototype: VkPipelineCacheCreateFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineCacheCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkPipelineCacheCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field initialDataSize	[long]<br>
	 * Prototype: size_t  initialDataSize
	 * 
	 * @param initialDataSize - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineCacheCreateInfo initialDataSize(long initialDataSize){
		 this.initialDataSize = initialDataSize;
		 setInitialDataSize0(this.ptr,  initialDataSize);
		 return this;
	 }

	/**
	 * Get method for field initialDataSize	[long]<br>
	 * Prototype: size_t  initialDataSize
	 */ 
	 public long initialDataSize(){
		 long var = getInitialDataSize0(super.ptr);
		 this.initialDataSize = var;
		 return this.initialDataSize;
	 }

	/**
	 * Set method for field pInitialData	[buffer]<br>
	 * Prototype: const void*  pInitialData
	 * 
	 * @param pInitialData - a instance of java.nio.Buffer.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineCacheCreateInfo pInitialData(java.nio.Buffer pInitialData){
		 this.pInitialData = pInitialData;
		 setPInitialData0(this.ptr,  pInitialData);
		 return this;
	 }

	/**
	 * Get method for field pInitialData	[buffer]<br>
	 * Prototype: const void*  pInitialData
	 */ 
	 public java.nio.Buffer pInitialData(){
		 long address = getPInitialData0(super.ptr);
		 if(this.pInitialData == null && address != 0L){
			  ByteBuffer bb = wrapPointer(address, 8);
			  this.pInitialData = bb;
		 }
		 return this.pInitialData;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkPipelineCacheCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n initialDataSize: ")
				.append(initialDataSize() )
				.append(",\n pInitialData: ")
				.append(pInitialData() )
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
		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineCacheCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineCacheCreateFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineCacheCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field initialDataSize	[long]<br>
	 * Prototype: size_t  initialDataSize
	 */ 
	 private static native void setInitialDataSize0(Buffer ptr, long _initialDataSize);/*
		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->initialDataSize = (size_t) (_initialDataSize);
	  */

	/**
	 * Native GET method for field initialDataSize	[long]<br>
	 * Prototype: size_t  initialDataSize
	 */ 
	 private static native long getInitialDataSize0(Buffer ptr);/*
		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		  return (jlong) (vkObj->initialDataSize);
	 */

	/**
	 * Native SET method for field pInitialData	[buffer]<br>
	 * Prototype: const void*  pInitialData
	 */ 
	 private static native void setPInitialData0(Buffer ptr, java.nio.Buffer _pInitialData);/*
		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pInitialData = (const void*) (_pInitialData);
	  */

	/**
	 * Native GET method for field pInitialData	[buffer]<br>
	 * Prototype: const void*  pInitialData
	 */ 
	 private static native long getPInitialData0(Buffer ptr);/*
		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pInitialData);
	 */



} // end of class VkPipelineCacheCreateInfo
