/**
 * Class wrapping Vulkan's VkCommandBufferBeginInfo struct.
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
 *  This class is a Java front end for struct VkCommandBufferBeginInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkCommandBufferBeginInfo {
 *     VkStructureType                          sType;
 *     const void*                              pNext;
 *     VkCommandBufferUsageFlags                flags;
 *     const VkCommandBufferInheritanceInfo*    pInheritanceInfo;
 * } VkCommandBufferBeginInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkCommandBufferBeginInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [89]  */
	 private static final String TAG = "VkCommandBufferBeginInfo";

	/** ID of this structure [89]  */
	 public static final int TAG_ID = VKCOMMANDBUFFERBEGININFO_ID;

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
	 *  VkCommandBufferUsageFlags 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  const VkCommandBufferInheritanceInfo* 	pInheritanceInfo	[vkstruct]
	 */ 
	VkCommandBufferInheritanceInfo  	pInheritanceInfo;
	/**
	 * Ctor
	 */
	public VkCommandBufferBeginInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkCommandBufferBeginInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkCommandBufferBeginInfo(long address){ 
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
	 public VkCommandBufferBeginInfo sType(VkStructureType sType){
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
	 public VkCommandBufferBeginInfo pNext(VkObject pNext){
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
	 * Prototype: VkCommandBufferUsageFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkCommandBufferBeginInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkCommandBufferUsageFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field pInheritanceInfo	[vkstruct]<br>
	 * Prototype: const VkCommandBufferInheritanceInfo*  pInheritanceInfo
	 * 
	 * @param pInheritanceInfo - a instance of VkCommandBufferInheritanceInfo.
	 * @return this VkStruct instance.
	 */ 
	 public VkCommandBufferBeginInfo pInheritanceInfo(VkCommandBufferInheritanceInfo pInheritanceInfo){
		 this.pInheritanceInfo = pInheritanceInfo;
		 ByteBuffer buff = (pInheritanceInfo==null) ? null : pInheritanceInfo.getPointer();
		 setPInheritanceInfo0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field pInheritanceInfo	[vkstruct]<br>
	 * Prototype: const VkCommandBufferInheritanceInfo*  pInheritanceInfo
	 */ 
	 public VkCommandBufferInheritanceInfo pInheritanceInfo(){
		 long pointer = getPInheritanceInfo0(super.ptr);
		 if(pointer == 0){
		    this.pInheritanceInfo = null;
		    return null;
		  } 

		 if(this.pInheritanceInfo == null){
		    this.pInheritanceInfo = new VkCommandBufferInheritanceInfo(pointer);
		 }else{
		    this.pInheritanceInfo.setPointer(pointer);
		  }
		 return this.pInheritanceInfo;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkCommandBufferBeginInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n pInheritanceInfo: ")
				.append(pInheritanceInfo() )
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
		  VkCommandBufferBeginInfo* vkObj = (VkCommandBufferBeginInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkCommandBufferBeginInfo* vkObj = (VkCommandBufferBeginInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkCommandBufferBeginInfo* vkObj = (VkCommandBufferBeginInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkCommandBufferBeginInfo* vkObj = (VkCommandBufferBeginInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkCommandBufferUsageFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkCommandBufferBeginInfo* vkObj = (VkCommandBufferBeginInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkCommandBufferUsageFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkCommandBufferUsageFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkCommandBufferBeginInfo* vkObj = (VkCommandBufferBeginInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field pInheritanceInfo	[vkstruct]<br>
	 * Prototype: const VkCommandBufferInheritanceInfo*  pInheritanceInfo
	 */ 
	 private static native void setPInheritanceInfo0(Buffer ptr, java.nio.ByteBuffer  _pInheritanceInfo);/*
		  VkCommandBufferBeginInfo* vkObj = (VkCommandBufferBeginInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pInheritanceInfo = (const VkCommandBufferInheritanceInfo*) (_pInheritanceInfo);
	  */

	/**
	 * Native GET method for field pInheritanceInfo	[vkstruct]<br>
	 * Prototype: const VkCommandBufferInheritanceInfo*  pInheritanceInfo
	 */ 
	 private static native long getPInheritanceInfo0(Buffer ptr);/*
		  VkCommandBufferBeginInfo* vkObj = (VkCommandBufferBeginInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pInheritanceInfo);
	 */



} // end of class VkCommandBufferBeginInfo
