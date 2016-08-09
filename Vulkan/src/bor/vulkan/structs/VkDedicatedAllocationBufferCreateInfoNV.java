/**
 * Class wrapping Vulkan's VkDedicatedAllocationBufferCreateInfoNV struct.
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
 *  This class is a Java front end for struct VkDedicatedAllocationBufferCreateInfoNV. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDedicatedAllocationBufferCreateInfoNV {
 *     VkStructureType    sType;
 *     const void*        pNext;
 *     VkBool32           dedicatedAllocation;
 * } VkDedicatedAllocationBufferCreateInfoNV;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkDedicatedAllocationBufferCreateInfoNV extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [130]  */
	 private static final String TAG = "VkDedicatedAllocationBufferCreateInfoNV";

	/** ID of this structure [130]  */
	 public static final int TAG_ID = VKDEDICATEDALLOCATIONBUFFERCREATEINFONV_ID;

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
	 *  VkBool32 	dedicatedAllocation	[boolean]
	 */ 
	boolean 	dedicatedAllocation;
	/**
	 * Ctor
	 */
	public VkDedicatedAllocationBufferCreateInfoNV(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDedicatedAllocationBufferCreateInfoNV(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDedicatedAllocationBufferCreateInfoNV(long address){ 
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
	 public VkDedicatedAllocationBufferCreateInfoNV sType(VkStructureType sType){
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
	 public VkDedicatedAllocationBufferCreateInfoNV pNext(VkObject pNext){
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
	 * Set method for field dedicatedAllocation	[boolean]<br>
	 * Prototype: VkBool32  dedicatedAllocation
	 * 
	 * @param dedicatedAllocation - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkDedicatedAllocationBufferCreateInfoNV dedicatedAllocation(boolean dedicatedAllocation){
		 this.dedicatedAllocation = dedicatedAllocation;
		 setDedicatedAllocation0(this.ptr,  dedicatedAllocation);
		 return this;
	 }

	/**
	 * Get method for field dedicatedAllocation	[boolean]<br>
	 * Prototype: VkBool32  dedicatedAllocation
	 */ 
	 public boolean dedicatedAllocation(){
		 boolean var = getDedicatedAllocation0(super.ptr);
		 this.dedicatedAllocation = var;
		 return this.dedicatedAllocation;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkDedicatedAllocationBufferCreateInfoNV [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n dedicatedAllocation: ")
				.append(dedicatedAllocation() )
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
		  VkDedicatedAllocationBufferCreateInfoNV* vkObj = (VkDedicatedAllocationBufferCreateInfoNV*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkDedicatedAllocationBufferCreateInfoNV* vkObj = (VkDedicatedAllocationBufferCreateInfoNV*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDedicatedAllocationBufferCreateInfoNV* vkObj = (VkDedicatedAllocationBufferCreateInfoNV*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkDedicatedAllocationBufferCreateInfoNV* vkObj = (VkDedicatedAllocationBufferCreateInfoNV*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 */

	/**
	 * Native SET method for field dedicatedAllocation	[boolean]<br>
	 * Prototype: VkBool32  dedicatedAllocation
	 */ 
	 private static native void setDedicatedAllocation0(Buffer ptr, boolean  _dedicatedAllocation);/*
		  VkDedicatedAllocationBufferCreateInfoNV* vkObj = (VkDedicatedAllocationBufferCreateInfoNV*)(ptr);
		  vkObj->dedicatedAllocation = (VkBool32) (_dedicatedAllocation);
	  */

	/**
	 * Native GET method for field dedicatedAllocation	[boolean]<br>
	 * Prototype: VkBool32  dedicatedAllocation
	 */ 
	 private static native boolean  getDedicatedAllocation0(Buffer ptr);/*
		  VkDedicatedAllocationBufferCreateInfoNV* vkObj = (VkDedicatedAllocationBufferCreateInfoNV*)(ptr);
		  return (jboolean) (vkObj->dedicatedAllocation);
	 */



} // end of class VkDedicatedAllocationBufferCreateInfoNV
