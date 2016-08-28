/**
 * Class wrapping Vulkan's VkPipelineRasterizationStateRasterizationOrderAMD struct.
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
 *  This class is a Java front end for struct VkPipelineRasterizationStateRasterizationOrderAMD. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPipelineRasterizationStateRasterizationOrderAMD {
 *     VkStructureType            sType;
 *     const void*                pNext;
 *     VkRasterizationOrderAMD    rasterizationOrder;
 * } VkPipelineRasterizationStateRasterizationOrderAMD;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkPipelineRasterizationStateRasterizationOrderAMD extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [125]  */
	 private static final String TAG = "VkPipelineRasterizationStateRasterizationOrderAMD";

	/** ID of this structure [125]  */
	 public static final int TAG_ID = VKPIPELINERASTERIZATIONSTATERASTERIZATIONORDERAMD_ID;

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
	 *  VkRasterizationOrderAMD 	rasterizationOrder	[vkenum]
	 */ 
	VkRasterizationOrderAMD 	rasterizationOrder;
	/**
	 * Ctor
	 */
	public VkPipelineRasterizationStateRasterizationOrderAMD(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineRasterizationStateRasterizationOrderAMD(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPipelineRasterizationStateRasterizationOrderAMD(long address){ 
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
	 public static VkArray<VkPipelineRasterizationStateRasterizationOrderAMD> createVkArray(int size){ 
		 VkPipelineRasterizationStateRasterizationOrderAMD[] array = new VkPipelineRasterizationStateRasterizationOrderAMD[size]; 
		 VkArrayStruct<VkPipelineRasterizationStateRasterizationOrderAMD> vkArray = new VkArrayStruct<VkPipelineRasterizationStateRasterizationOrderAMD> (array, TAG_ID);
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
	 public VkPipelineRasterizationStateRasterizationOrderAMD sType(VkStructureType sType){
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
	 public VkPipelineRasterizationStateRasterizationOrderAMD pNext(VkObject pNext){
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
	 * Set method for field rasterizationOrder	[vkenum]<br>
	 * Prototype: VkRasterizationOrderAMD  rasterizationOrder
	 * 
	 * @param rasterizationOrder - a instance of VkRasterizationOrderAMD.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineRasterizationStateRasterizationOrderAMD rasterizationOrder(VkRasterizationOrderAMD rasterizationOrder){
		 this.rasterizationOrder = rasterizationOrder;
		 int enumVal = rasterizationOrder.getValue();
		 setRasterizationOrder0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field rasterizationOrder	[vkenum]<br>
	 * Prototype: VkRasterizationOrderAMD  rasterizationOrder
	 */ 
	 public VkRasterizationOrderAMD rasterizationOrder(){
		 int nativeVal = getRasterizationOrder0(super.ptr);
		 this.rasterizationOrder = VkRasterizationOrderAMD.fromValue(nativeVal); 
		 return this.rasterizationOrder;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkPipelineRasterizationStateRasterizationOrderAMD [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n rasterizationOrder: ")
				.append(rasterizationOrder() )
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
		  VkPipelineRasterizationStateRasterizationOrderAMD* vkObj = (VkPipelineRasterizationStateRasterizationOrderAMD*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkPipelineRasterizationStateRasterizationOrderAMD* vkObj = (VkPipelineRasterizationStateRasterizationOrderAMD*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPipelineRasterizationStateRasterizationOrderAMD* vkObj = (VkPipelineRasterizationStateRasterizationOrderAMD*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkPipelineRasterizationStateRasterizationOrderAMD* vkObj = (VkPipelineRasterizationStateRasterizationOrderAMD*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field rasterizationOrder	[vkenum]<br>
	 * Prototype: VkRasterizationOrderAMD  rasterizationOrder
	 */ 
	 private static native void setRasterizationOrder0(Buffer ptr, int  _rasterizationOrder);/*
		  VkPipelineRasterizationStateRasterizationOrderAMD* vkObj = (VkPipelineRasterizationStateRasterizationOrderAMD*)(ptr);
		 // code for simple past value 
		  vkObj->rasterizationOrder = (VkRasterizationOrderAMD) (_rasterizationOrder);
	  */

	/**
	 * Native GET method for field rasterizationOrder	[vkenum]<br>
	 * Prototype: VkRasterizationOrderAMD  rasterizationOrder
	 */ 
	 private static native int getRasterizationOrder0(Buffer ptr);/*
		  VkPipelineRasterizationStateRasterizationOrderAMD* vkObj = (VkPipelineRasterizationStateRasterizationOrderAMD*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->rasterizationOrder);
	 */



} // end of class VkPipelineRasterizationStateRasterizationOrderAMD
