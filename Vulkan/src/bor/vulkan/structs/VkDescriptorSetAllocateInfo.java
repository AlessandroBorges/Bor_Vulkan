/**
 * Class wrapping Vulkan's VkDescriptorSetAllocateInfo struct.
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
 *  This class is a Java front end for struct VkDescriptorSetAllocateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDescriptorSetAllocateInfo {
 *     VkStructureType                 sType;
 *     const void*                     pNext;
 *     VkDescriptorPool                descriptorPool;
 *     uint32_t                        descriptorSetCount;
 *     const VkDescriptorSetLayout*    pSetLayouts;
 * } VkDescriptorSetAllocateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkDescriptorSetAllocateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [75]  */
	 private static final String TAG = "VkDescriptorSetAllocateInfo";

	/** ID of this structure [75]  */
	 public static final int TAG_ID = VKDESCRIPTORSETALLOCATEINFO_ID;

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
	 *  VkDescriptorPool 	descriptorPool	[vkhandle]
	 */ 
	VkDescriptorPool 	descriptorPool;
	
	/**
	 *  uint32_t 	descriptorSetCount	[int]
	 */ 
	int 	descriptorSetCount;
	
	/**
	 *  const VkDescriptorSetLayout* 	pSetLayouts	[vkhandle_array_array]
	 */ 
	  VkDescriptorSetLayout[]  	pSetLayouts;
	 private BigBuffer 	 pSetLayoutsBUFFER;
	/**
	 * Ctor
	 */
	public VkDescriptorSetAllocateInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDescriptorSetAllocateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDescriptorSetAllocateInfo(long address){ 
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
	 public VkDescriptorSetAllocateInfo sType(VkStructureType sType){
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
	 public VkDescriptorSetAllocateInfo pNext(VkObject pNext){
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
	 * Set method for field descriptorPool	[vkhandle]<br>
	 * Prototype: VkDescriptorPool  descriptorPool
	 * 
	 * @param descriptorPool - a instance of VkDescriptorPool.
	 * @return this VkStruct instance.
	 */ 
	 public VkDescriptorSetAllocateInfo descriptorPool(VkDescriptorPool descriptorPool){
		 this.descriptorPool = descriptorPool;
		 long handle = (descriptorPool==null) ? 0L : descriptorPool.getNativeHandle();
		 setDescriptorPool0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field descriptorPool	[vkhandle]<br>
	 * Prototype: VkDescriptorPool  descriptorPool
	 */ 
	 public VkDescriptorPool descriptorPool(){

		 long handle = getDescriptorPool0(super.ptr);
		 if(handle == 0){
		    this.descriptorPool = null;
		    return null;
		  }  

		 if(this.descriptorPool == null){
		    this.descriptorPool = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.descriptorPool).setNativeHandle(handle);
		  }
		 return this.descriptorPool;
	 }

	/**
	 * Set method for field descriptorSetCount	[int]<br>
	 * Prototype: uint32_t  descriptorSetCount
	 * 
	 * @param descriptorSetCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDescriptorSetAllocateInfo descriptorSetCount(int descriptorSetCount){
		 this.descriptorSetCount = descriptorSetCount;
		 setDescriptorSetCount0(this.ptr,  descriptorSetCount);
		 return this;
	 }

	/**
	 * Get method for field descriptorSetCount	[int]<br>
	 * Prototype: uint32_t  descriptorSetCount
	 */ 
	 public int descriptorSetCount(){
		 int var = getDescriptorSetCount0(super.ptr);
		 this.descriptorSetCount = var;
		 return this.descriptorSetCount;
	 }

	/**
	 * Set method for field pSetLayouts	[vkhandle_array]<br>
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 * 
	 * @param pSetLayouts - a instance of VkDescriptorSetLayout[].
	 * @return this VkStruct instance.
	 */ 
	 public VkDescriptorSetAllocateInfo pSetLayouts(VkDescriptorSetLayout[] pSetLayouts){
		 this.pSetLayouts = pSetLayouts;
		 this.pSetLayoutsBUFFER = new BigBuffer(pSetLayouts, false);
		 setPSetLayouts0(this.ptr, pSetLayoutsBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pSetLayouts	[vkhandle_array]<br>
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 public VkDescriptorSetLayout[] pSetLayouts(){
		 long ptr = getPSetLayouts0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pSetLayoutsBUFFER != null && ptr == pSetLayoutsBUFFER.getBufferAddress()){ //same buffer 
		    pSetLayoutsBUFFER.update();
		    return pSetLayouts;
		  }else{
		     (new UnsupportedOperationException("There is no VKHandle[] for backup.")).printStackTrace();
		   }
		 return this.pSetLayouts;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkDescriptorSetAllocateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n descriptorPool: ")
				.append(descriptorPool() )
				.append(",\n descriptorSetCount: ")
				.append(descriptorSetCount() )
				.append(",\n pSetLayouts: ")
				.append(Arrays.toString(pSetLayouts()) )
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
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field descriptorPool	[vkhandle]<br>
	 * Prototype: VkDescriptorPool  descriptorPool
	 */ 
	 private static native void setDescriptorPool0(Buffer ptr, long  _descriptorPool);/*
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->descriptorPool = (VkDescriptorPool) (_descriptorPool);
	  */

	/**
	 * Native GET method for field descriptorPool	[vkhandle]<br>
	 * Prototype: VkDescriptorPool  descriptorPool
	 */ 
	 private static native long getDescriptorPool0(Buffer ptr);/*
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->descriptorPool);
	 */

	/**
	 * Native SET method for field descriptorSetCount	[int]<br>
	 * Prototype: uint32_t  descriptorSetCount
	 */ 
	 private static native void setDescriptorSetCount0(Buffer ptr, int _descriptorSetCount);/*
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->descriptorSetCount = (uint32_t) (_descriptorSetCount);
	  */

	/**
	 * Native GET method for field descriptorSetCount	[int]<br>
	 * Prototype: uint32_t  descriptorSetCount
	 */ 
	 private static native int getDescriptorSetCount0(Buffer ptr);/*
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  return (jint) (vkObj->descriptorSetCount);
	 */

	/**
	 * Native SET method for field pSetLayouts	[vkhandle_array]<br>
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 private static native void setPSetLayouts0(Buffer ptr, ByteBuffer  _pSetLayouts);/*
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkDescriptorSetLayout* p_pSetLayouts = ( VkDescriptorSetLayout*) _pSetLayouts; 
		 vkObj->pSetLayouts = p_pSetLayouts; 
	  */

	/**
	 * Native GET method for field pSetLayouts	[vkhandle_array]<br>
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 private static native long getPSetLayouts0(Buffer ptr);/*
		  VkDescriptorSetAllocateInfo* vkObj = (VkDescriptorSetAllocateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pSetLayouts );
	 */



} // end of class VkDescriptorSetAllocateInfo
