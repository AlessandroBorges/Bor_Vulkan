/**
 * Class wrapping Vulkan's VkPipelineVertexInputStateCreateInfo struct.
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
 *  This class is a Java front end for struct VkPipelineVertexInputStateCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPipelineVertexInputStateCreateInfo {
 *     VkStructureType                             sType;
 *     const void*                                 pNext;
 *     VkPipelineVertexInputStateCreateFlags       flags;
 *     uint32_t                                    vertexBindingDescriptionCount;
 *     const VkVertexInputBindingDescription*      pVertexBindingDescriptions;
 *     uint32_t                                    vertexAttributeDescriptionCount;
 *     const VkVertexInputAttributeDescription*    pVertexAttributeDescriptions;
 * } VkPipelineVertexInputStateCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkPipelineVertexInputStateCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [51]  */
	 private static final String TAG = "VkPipelineVertexInputStateCreateInfo";

	/** ID of this structure [51]  */
	 public static final int TAG_ID = VKPIPELINEVERTEXINPUTSTATECREATEINFO_ID;

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
	 *  VkPipelineVertexInputStateCreateFlags 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  uint32_t 	vertexBindingDescriptionCount	[int]
	 */ 
	int 	vertexBindingDescriptionCount;
	
	/**
	 *  const VkVertexInputBindingDescription* 	pVertexBindingDescriptions	[vkstruct_array_array]
	 */ 
	VkVertexInputBindingDescription[]  	pVertexBindingDescriptions;
	 private BigBuffer<VkVertexInputBindingDescription> 	 pVertexBindingDescriptionsBUFFER;
	
	/**
	 *  uint32_t 	vertexAttributeDescriptionCount	[int]
	 */ 
	int 	vertexAttributeDescriptionCount;
	
	/**
	 *  const VkVertexInputAttributeDescription* 	pVertexAttributeDescriptions	[vkstruct_array_array]
	 */ 
	VkVertexInputAttributeDescription[]  	pVertexAttributeDescriptions;
	 private BigBuffer<VkVertexInputAttributeDescription> 	 pVertexAttributeDescriptionsBUFFER;
	/**
	 * Ctor
	 */
	public VkPipelineVertexInputStateCreateInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineVertexInputStateCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPipelineVertexInputStateCreateInfo(long address){ 
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
	 public static VkArray<VkPipelineVertexInputStateCreateInfo> createVkArray(int size){ 
		 VkPipelineVertexInputStateCreateInfo[] array = new VkPipelineVertexInputStateCreateInfo[size]; 
		 VkArrayStruct<VkPipelineVertexInputStateCreateInfo> vkArray = new VkArrayStruct<VkPipelineVertexInputStateCreateInfo>(array, TAG_ID);
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
	 public VkPipelineVertexInputStateCreateInfo sType(VkStructureType sType){
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
	 public VkPipelineVertexInputStateCreateInfo pNext(VkObject pNext){
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
	 * Prototype: VkPipelineVertexInputStateCreateFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineVertexInputStateCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkPipelineVertexInputStateCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field vertexBindingDescriptionCount	[int]<br>
	 * Prototype: uint32_t  vertexBindingDescriptionCount
	 * 
	 * @param vertexBindingDescriptionCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineVertexInputStateCreateInfo vertexBindingDescriptionCount(int vertexBindingDescriptionCount){
		 this.vertexBindingDescriptionCount = vertexBindingDescriptionCount;
		 setVertexBindingDescriptionCount0(this.ptr,  vertexBindingDescriptionCount);
		 return this;
	 }

	/**
	 * Get method for field vertexBindingDescriptionCount	[int]<br>
	 * Prototype: uint32_t  vertexBindingDescriptionCount
	 */ 
	 public int vertexBindingDescriptionCount(){
		 int var = getVertexBindingDescriptionCount0(super.ptr);
		 this.vertexBindingDescriptionCount = var;
		 return this.vertexBindingDescriptionCount;
	 }

	/**
	 * Set method for field pVertexBindingDescriptions	[vkstruct_array]<br>
	 * Prototype: const VkVertexInputBindingDescription*  pVertexBindingDescriptions
	 * 
	 * @param pVertexBindingDescriptions - a instance of VkVertexInputBindingDescription[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineVertexInputStateCreateInfo pVertexBindingDescriptions(VkVertexInputBindingDescription[] pVertexBindingDescriptions){
		 this.pVertexBindingDescriptions = pVertexBindingDescriptions;
		 this.pVertexBindingDescriptionsBUFFER = new BigBuffer<VkVertexInputBindingDescription>(pVertexBindingDescriptions, VkVertexInputBindingDescription.getID());
		 setPVertexBindingDescriptions0(this.ptr, pVertexBindingDescriptionsBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pVertexBindingDescriptions	[vkstruct_array]<br>
	 * Prototype: const VkVertexInputBindingDescription*  pVertexBindingDescriptions
	 */ 
	 public VkVertexInputBindingDescription[] pVertexBindingDescriptions(){
		 long ptr = getPVertexBindingDescriptions0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pVertexBindingDescriptionsBUFFER != null && ptr == pVertexBindingDescriptionsBUFFER.getBufferAddress()){ //same buffer 
		    pVertexBindingDescriptionsBUFFER.update();
		  }else{
		     // wrap native structs 
		     int length = vertexBindingDescriptionCount();
		     if(length > 0){
		        this.pVertexBindingDescriptions = new VkVertexInputBindingDescription[length];
		        pVertexBindingDescriptionsBUFFER = new BigBuffer<VkVertexInputBindingDescription>(ptr, pVertexBindingDescriptions, VkVertexInputBindingDescription.getID() );
		     }
		   }
		 return this.pVertexBindingDescriptions;
	 }

	/**
	 * Set method for field vertexAttributeDescriptionCount	[int]<br>
	 * Prototype: uint32_t  vertexAttributeDescriptionCount
	 * 
	 * @param vertexAttributeDescriptionCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineVertexInputStateCreateInfo vertexAttributeDescriptionCount(int vertexAttributeDescriptionCount){
		 this.vertexAttributeDescriptionCount = vertexAttributeDescriptionCount;
		 setVertexAttributeDescriptionCount0(this.ptr,  vertexAttributeDescriptionCount);
		 return this;
	 }

	/**
	 * Get method for field vertexAttributeDescriptionCount	[int]<br>
	 * Prototype: uint32_t  vertexAttributeDescriptionCount
	 */ 
	 public int vertexAttributeDescriptionCount(){
		 int var = getVertexAttributeDescriptionCount0(super.ptr);
		 this.vertexAttributeDescriptionCount = var;
		 return this.vertexAttributeDescriptionCount;
	 }

	/**
	 * Set method for field pVertexAttributeDescriptions	[vkstruct_array]<br>
	 * Prototype: const VkVertexInputAttributeDescription*  pVertexAttributeDescriptions
	 * 
	 * @param pVertexAttributeDescriptions - a instance of VkVertexInputAttributeDescription[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineVertexInputStateCreateInfo pVertexAttributeDescriptions(VkVertexInputAttributeDescription[] pVertexAttributeDescriptions){
		 this.pVertexAttributeDescriptions = pVertexAttributeDescriptions;
		 this.pVertexAttributeDescriptionsBUFFER = new BigBuffer<VkVertexInputAttributeDescription>(pVertexAttributeDescriptions, VkVertexInputAttributeDescription.getID());
		 setPVertexAttributeDescriptions0(this.ptr, pVertexAttributeDescriptionsBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pVertexAttributeDescriptions	[vkstruct_array]<br>
	 * Prototype: const VkVertexInputAttributeDescription*  pVertexAttributeDescriptions
	 */ 
	 public VkVertexInputAttributeDescription[] pVertexAttributeDescriptions(){
		 long ptr = getPVertexAttributeDescriptions0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pVertexAttributeDescriptionsBUFFER != null && ptr == pVertexAttributeDescriptionsBUFFER.getBufferAddress()){ //same buffer 
		    pVertexAttributeDescriptionsBUFFER.update();
		  }else{
		     // wrap native structs 
		     int length = vertexAttributeDescriptionCount();
		     if(length > 0){
		        this.pVertexAttributeDescriptions = new VkVertexInputAttributeDescription[length];
		        pVertexAttributeDescriptionsBUFFER = new BigBuffer<VkVertexInputAttributeDescription>(ptr, pVertexAttributeDescriptions, VkVertexInputAttributeDescription.getID() );
		     }
		   }
		 return this.pVertexAttributeDescriptions;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkPipelineVertexInputStateCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n vertexBindingDescriptionCount: ")
				.append(vertexBindingDescriptionCount() )
				.append(",\n pVertexBindingDescriptions: ")
				.append(Arrays.toString(pVertexBindingDescriptions()) )
				.append(",\n vertexAttributeDescriptionCount: ")
				.append(vertexAttributeDescriptionCount() )
				.append(",\n pVertexAttributeDescriptions: ")
				.append(Arrays.toString(pVertexAttributeDescriptions()) )
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
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineVertexInputStateCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineVertexInputStateCreateFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineVertexInputStateCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field vertexBindingDescriptionCount	[int]<br>
	 * Prototype: uint32_t  vertexBindingDescriptionCount
	 */ 
	 private static native void setVertexBindingDescriptionCount0(Buffer ptr, int _vertexBindingDescriptionCount);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->vertexBindingDescriptionCount = (uint32_t) (_vertexBindingDescriptionCount);
	  */

	/**
	 * Native GET method for field vertexBindingDescriptionCount	[int]<br>
	 * Prototype: uint32_t  vertexBindingDescriptionCount
	 */ 
	 private static native int getVertexBindingDescriptionCount0(Buffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  return (jint) (vkObj->vertexBindingDescriptionCount);
	 */

	/**
	 * Native SET method for field pVertexBindingDescriptions	[vkstruct_array]<br>
	 * Prototype: const VkVertexInputBindingDescription*  pVertexBindingDescriptions
	 */ 
	 private static native void setPVertexBindingDescriptions0(Buffer ptr, java.nio.ByteBuffer  _pVertexBindingDescriptions);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkVertexInputBindingDescription* p_pVertexBindingDescriptions = ( VkVertexInputBindingDescription*) _pVertexBindingDescriptions; 
		 vkObj->pVertexBindingDescriptions = p_pVertexBindingDescriptions; 
	  */

	/**
	 * Native GET method for field pVertexBindingDescriptions	[vkstruct_array]<br>
	 * Prototype: const VkVertexInputBindingDescription*  pVertexBindingDescriptions
	 */ 
	 private static native long getPVertexBindingDescriptions0(Buffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pVertexBindingDescriptions );
	 */

	/**
	 * Native SET method for field vertexAttributeDescriptionCount	[int]<br>
	 * Prototype: uint32_t  vertexAttributeDescriptionCount
	 */ 
	 private static native void setVertexAttributeDescriptionCount0(Buffer ptr, int _vertexAttributeDescriptionCount);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->vertexAttributeDescriptionCount = (uint32_t) (_vertexAttributeDescriptionCount);
	  */

	/**
	 * Native GET method for field vertexAttributeDescriptionCount	[int]<br>
	 * Prototype: uint32_t  vertexAttributeDescriptionCount
	 */ 
	 private static native int getVertexAttributeDescriptionCount0(Buffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  return (jint) (vkObj->vertexAttributeDescriptionCount);
	 */

	/**
	 * Native SET method for field pVertexAttributeDescriptions	[vkstruct_array]<br>
	 * Prototype: const VkVertexInputAttributeDescription*  pVertexAttributeDescriptions
	 */ 
	 private static native void setPVertexAttributeDescriptions0(Buffer ptr, java.nio.ByteBuffer  _pVertexAttributeDescriptions);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkVertexInputAttributeDescription* p_pVertexAttributeDescriptions = ( VkVertexInputAttributeDescription*) _pVertexAttributeDescriptions; 
		 vkObj->pVertexAttributeDescriptions = p_pVertexAttributeDescriptions; 
	  */

	/**
	 * Native GET method for field pVertexAttributeDescriptions	[vkstruct_array]<br>
	 * Prototype: const VkVertexInputAttributeDescription*  pVertexAttributeDescriptions
	 */ 
	 private static native long getPVertexAttributeDescriptions0(Buffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pVertexAttributeDescriptions );
	 */



} // end of class VkPipelineVertexInputStateCreateInfo
