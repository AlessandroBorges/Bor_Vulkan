/**
 * Class wrapping Vulkan's VkDeviceQueueCreateInfo struct.
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
 *  This class is a Java front end for struct VkDeviceQueueCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDeviceQueueCreateInfo {
 *     VkStructureType             sType;
 *     const void*                 pNext;
 *     VkDeviceQueueCreateFlags    flags;
 *     uint32_t                    queueFamilyIndex;
 *     uint32_t                    queueCount;
 *     const float*                pQueuePriorities;
 * } VkDeviceQueueCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkDeviceQueueCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [15]  */
	 private static final String TAG = "VkDeviceQueueCreateInfo";

	/** ID of this structure [15]  */
	 public static final int TAG_ID = VKDEVICEQUEUECREATEINFO_ID;

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
	 *  VkDeviceQueueCreateFlags 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  uint32_t 	queueFamilyIndex	[int]
	 */ 
	int 	queueFamilyIndex;
	
	/**
	 *  uint32_t 	queueCount	[int]
	 */ 
	int 	queueCount;
	
	/**
	 *  const float* 	pQueuePriorities	[float_array]
	 */ 
	float[] 	pQueuePriorities;
	/**
	 * Ctor
	 */
	public VkDeviceQueueCreateInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDeviceQueueCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDeviceQueueCreateInfo(long address){ 
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
	 public static VkArray<VkDeviceQueueCreateInfo> createVkArray(int size){ 
		 VkDeviceQueueCreateInfo[] array = new VkDeviceQueueCreateInfo[size]; 
		 VkArrayStruct<VkDeviceQueueCreateInfo> vkArray = new VkArrayStruct<VkDeviceQueueCreateInfo>(array, TAG_ID);
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
	 public VkDeviceQueueCreateInfo sType(VkStructureType sType){
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
	 public VkDeviceQueueCreateInfo pNext(VkObject pNext){
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
	 * Prototype: VkDeviceQueueCreateFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDeviceQueueCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkDeviceQueueCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field queueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndex
	 * 
	 * @param queueFamilyIndex - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDeviceQueueCreateInfo queueFamilyIndex(int queueFamilyIndex){
		 this.queueFamilyIndex = queueFamilyIndex;
		 setQueueFamilyIndex0(this.ptr,  queueFamilyIndex);
		 return this;
	 }

	/**
	 * Get method for field queueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndex
	 */ 
	 public int queueFamilyIndex(){
		 int var = getQueueFamilyIndex0(super.ptr);
		 this.queueFamilyIndex = var;
		 return this.queueFamilyIndex;
	 }

	/**
	 * Set method for field queueCount	[int]<br>
	 * Prototype: uint32_t  queueCount
	 * 
	 * @param queueCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDeviceQueueCreateInfo queueCount(int queueCount){
		 this.queueCount = queueCount;
		 setQueueCount0(this.ptr,  queueCount);
		 return this;
	 }

	/**
	 * Get method for field queueCount	[int]<br>
	 * Prototype: uint32_t  queueCount
	 */ 
	 public int queueCount(){
		 int var = getQueueCount0(super.ptr);
		 this.queueCount = var;
		 return this.queueCount;
	 }

	/**
	 * Set method for field pQueuePriorities	[float]<br>
	 * Prototype: const float*  pQueuePriorities
	 * 
	 * @param pQueuePriorities - a instance of float[].
	 * @return this VkStruct instance.
	 */ 
	 public VkDeviceQueueCreateInfo pQueuePriorities(float[] pQueuePriorities){
		 this.pQueuePriorities = pQueuePriorities;
		 setPQueuePriorities0(this.ptr,  pQueuePriorities);
		 return this;
	 }

	/**
	 * Get method for field pQueuePriorities	[float]<br>
	 * Prototype: const float*  pQueuePriorities
	 */ 
	 public float[] pQueuePriorities(){
		 float[] var = getPQueuePriorities0(super.ptr, pQueuePriorities);
		 this.pQueuePriorities = var;
		 return this.pQueuePriorities;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkDeviceQueueCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n queueFamilyIndex: ")
				.append(queueFamilyIndex() )
				.append(",\n queueCount: ")
				.append(queueCount() )
				.append(",\n pQueuePriorities: ")
				.append(Arrays.toString(pQueuePriorities()) )
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
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkDeviceQueueCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkDeviceQueueCreateFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkDeviceQueueCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field queueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndex
	 */ 
	 private static native void setQueueFamilyIndex0(Buffer ptr, int _queueFamilyIndex);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->queueFamilyIndex = (uint32_t) (_queueFamilyIndex);
	  */

	/**
	 * Native GET method for field queueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndex
	 */ 
	 private static native int getQueueFamilyIndex0(Buffer ptr);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  return (jint) (vkObj->queueFamilyIndex);
	 */

	/**
	 * Native SET method for field queueCount	[int]<br>
	 * Prototype: uint32_t  queueCount
	 */ 
	 private static native void setQueueCount0(Buffer ptr, int _queueCount);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->queueCount = (uint32_t) (_queueCount);
	  */

	/**
	 * Native GET method for field queueCount	[int]<br>
	 * Prototype: uint32_t  queueCount
	 */ 
	 private static native int getQueueCount0(Buffer ptr);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  return (jint) (vkObj->queueCount);
	 */

	/**
	 * Native SET method for field pQueuePriorities	[float]<br>
	 * Prototype: const float*  pQueuePriorities
	 */ 
	 private static native void setPQueuePriorities0(Buffer ptr, float[] _pQueuePriorities);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		 // code for generic array assignment 
		 float* temp = const_cast<float*>(vkObj->pQueuePriorities);
		 if(temp) { free(temp); } 
		 vkObj->pQueuePriorities = NULL; 
		 if( _pQueuePriorities == NULL){ 
		    vkObj->queueCount = 0; 
		     return;
		  }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pQueuePriorities); 
		  temp = CALLOC(count, float); 
		  memcpy( temp, _pQueuePriorities, count * sizeof(float)); 
		  vkObj->pQueuePriorities = temp; 
		  vkObj->queueCount = count;
	  */

	/**
	 * Native GET method for field pQueuePriorities	[float]<br>
	 * Prototype: const float*  pQueuePriorities
	 */ 
	 private static native float[] getPQueuePriorities0(Buffer ptr, float[] _pQueuePriorities);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  // generic get for C type array, with content copy 
		  if( 0 == vkObj->queueCount){ 
		     return NULL;
		   }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pQueuePriorities);
		  if(vkObj->pQueuePriorities == NULL){
		    return NULL;
		   }
 		  memcpy(_pQueuePriorities, vkObj->pQueuePriorities, count * sizeof(float));
		  return obj__pQueuePriorities;
	 */



} // end of class VkDeviceQueueCreateInfo
