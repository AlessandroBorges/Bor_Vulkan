/**
 * Class wrapping Vulkan's VkWriteDescriptorSet struct.
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
 *  This class is a Java front end for struct VkWriteDescriptorSet. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkWriteDescriptorSet {
 *     VkStructureType                  sType;
 *     const void*                      pNext;
 *     VkDescriptorSet                  dstSet;
 *     uint32_t                         dstBinding;
 *     uint32_t                         dstArrayElement;
 *     uint32_t                         descriptorCount;
 *     VkDescriptorType                 descriptorType;
 *     const VkDescriptorImageInfo*     pImageInfo;
 *     const VkDescriptorBufferInfo*    pBufferInfo;
 *     const VkBufferView*              pTexelBufferView;
 * } VkWriteDescriptorSet;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkWriteDescriptorSet extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [78]  */
	 private static final String TAG = "VkWriteDescriptorSet";

	/** ID of this structure [78]  */
	 public static final int TAG_ID = VKWRITEDESCRIPTORSET_ID;

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
	 *  VkDescriptorSet 	dstSet	[vkhandle]
	 */ 
	VkDescriptorSet 	dstSet;
	
	/**
	 *  uint32_t 	dstBinding	[int]
	 */ 
	int 	dstBinding;
	
	/**
	 *  uint32_t 	dstArrayElement	[int]
	 */ 
	int 	dstArrayElement;
	
	/**
	 *  uint32_t 	descriptorCount	[int]
	 */ 
	int 	descriptorCount;
	
	/**
	 *  VkDescriptorType 	descriptorType	[vkenum]
	 */ 
	VkDescriptorType 	descriptorType;
	
	/**
	 *  const VkDescriptorImageInfo* 	pImageInfo	[vkstruct]
	 */ 
	VkDescriptorImageInfo  	pImageInfo;
	
	/**
	 *  const VkDescriptorBufferInfo* 	pBufferInfo	[vkstruct]
	 */ 
	VkDescriptorBufferInfo  	pBufferInfo;
	
	/**
	 *  const VkBufferView* 	pTexelBufferView	[vkhandle]
	 */ 
	VkBufferView  	pTexelBufferView;
	/**
	 * Ctor
	 */
	public VkWriteDescriptorSet(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkWriteDescriptorSet(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkWriteDescriptorSet(long address){ 
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
	 public static VkArray<VkWriteDescriptorSet> createVkArray(int size){ 
		 VkWriteDescriptorSet[] array = new VkWriteDescriptorSet[size]; 
		 VkArrayStruct<VkWriteDescriptorSet> vkArray = new VkArrayStruct<VkWriteDescriptorSet>(array, TAG_ID);
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
	 public VkWriteDescriptorSet sType(VkStructureType sType){
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
	 public VkWriteDescriptorSet pNext(VkObject pNext){
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
	 * Set method for field dstSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  dstSet
	 * 
	 * @param dstSet - a instance of VkDescriptorSet.
	 * @return this VkStruct instance.
	 */ 
	 public VkWriteDescriptorSet dstSet(VkDescriptorSet dstSet){
		 this.dstSet = dstSet;
		 long handle = (dstSet==null) ? 0L : dstSet.getNativeHandle();
		 setDstSet0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field dstSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  dstSet
	 */ 
	 public VkDescriptorSet dstSet(){

		 long handle = getDstSet0(super.ptr);
		 if(handle == 0){
		    this.dstSet = null;
		    return null;
		  }  

		 if(this.dstSet == null){
		    this.dstSet = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.dstSet).setNativeHandle(handle);
		  }
		 return this.dstSet;
	 }

	/**
	 * Set method for field dstBinding	[int]<br>
	 * Prototype: uint32_t  dstBinding
	 * 
	 * @param dstBinding - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkWriteDescriptorSet dstBinding(int dstBinding){
		 this.dstBinding = dstBinding;
		 setDstBinding0(this.ptr,  dstBinding);
		 return this;
	 }

	/**
	 * Get method for field dstBinding	[int]<br>
	 * Prototype: uint32_t  dstBinding
	 */ 
	 public int dstBinding(){
		 int var = getDstBinding0(super.ptr);
		 this.dstBinding = var;
		 return this.dstBinding;
	 }

	/**
	 * Set method for field dstArrayElement	[int]<br>
	 * Prototype: uint32_t  dstArrayElement
	 * 
	 * @param dstArrayElement - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkWriteDescriptorSet dstArrayElement(int dstArrayElement){
		 this.dstArrayElement = dstArrayElement;
		 setDstArrayElement0(this.ptr,  dstArrayElement);
		 return this;
	 }

	/**
	 * Get method for field dstArrayElement	[int]<br>
	 * Prototype: uint32_t  dstArrayElement
	 */ 
	 public int dstArrayElement(){
		 int var = getDstArrayElement0(super.ptr);
		 this.dstArrayElement = var;
		 return this.dstArrayElement;
	 }

	/**
	 * Set method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 * 
	 * @param descriptorCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkWriteDescriptorSet descriptorCount(int descriptorCount){
		 this.descriptorCount = descriptorCount;
		 setDescriptorCount0(this.ptr,  descriptorCount);
		 return this;
	 }

	/**
	 * Get method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 public int descriptorCount(){
		 int var = getDescriptorCount0(super.ptr);
		 this.descriptorCount = var;
		 return this.descriptorCount;
	 }

	/**
	 * Set method for field descriptorType	[vkenum]<br>
	 * Prototype: VkDescriptorType  descriptorType
	 * 
	 * @param descriptorType - a instance of VkDescriptorType.
	 * @return this VkStruct instance.
	 */ 
	 public VkWriteDescriptorSet descriptorType(VkDescriptorType descriptorType){
		 this.descriptorType = descriptorType;
		 int enumVal = descriptorType.getValue();
		 setDescriptorType0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field descriptorType	[vkenum]<br>
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 public VkDescriptorType descriptorType(){
		 int nativeVal = getDescriptorType0(super.ptr);
		 this.descriptorType = VkDescriptorType.fromValue(nativeVal); 
		 return this.descriptorType;
	 }

	/**
	 * Set method for field pImageInfo	[vkstruct]<br>
	 * Prototype: const VkDescriptorImageInfo*  pImageInfo
	 * 
	 * @param pImageInfo - a instance of VkDescriptorImageInfo.
	 * @return this VkStruct instance.
	 */ 
	 public VkWriteDescriptorSet pImageInfo(VkDescriptorImageInfo pImageInfo){
		 this.pImageInfo = pImageInfo;
		 ByteBuffer buff = (pImageInfo==null) ? null : pImageInfo.getPointer();
		 setPImageInfo0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field pImageInfo	[vkstruct]<br>
	 * Prototype: const VkDescriptorImageInfo*  pImageInfo
	 */ 
	 public VkDescriptorImageInfo pImageInfo(){
		 long pointer = getPImageInfo0(super.ptr);
		 if(pointer == 0){
		    this.pImageInfo = null;
		    return null;
		  } 

		 if(this.pImageInfo == null){
		    this.pImageInfo = new VkDescriptorImageInfo(pointer);
		 }else{
		    this.pImageInfo.setPointer(pointer);
		  }
		 return this.pImageInfo;
	 }

	/**
	 * Set method for field pBufferInfo	[vkstruct]<br>
	 * Prototype: const VkDescriptorBufferInfo*  pBufferInfo
	 * 
	 * @param pBufferInfo - a instance of VkDescriptorBufferInfo.
	 * @return this VkStruct instance.
	 */ 
	 public VkWriteDescriptorSet pBufferInfo(VkDescriptorBufferInfo pBufferInfo){
		 this.pBufferInfo = pBufferInfo;
		 ByteBuffer buff = (pBufferInfo==null) ? null : pBufferInfo.getPointer();
		 setPBufferInfo0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field pBufferInfo	[vkstruct]<br>
	 * Prototype: const VkDescriptorBufferInfo*  pBufferInfo
	 */ 
	 public VkDescriptorBufferInfo pBufferInfo(){
		 long pointer = getPBufferInfo0(super.ptr);
		 if(pointer == 0){
		    this.pBufferInfo = null;
		    return null;
		  } 

		 if(this.pBufferInfo == null){
		    this.pBufferInfo = new VkDescriptorBufferInfo(pointer);
		 }else{
		    this.pBufferInfo.setPointer(pointer);
		  }
		 return this.pBufferInfo;
	 }

	/**
	 * Set method for field pTexelBufferView	[vkhandle]<br>
	 * Prototype: const VkBufferView*  pTexelBufferView
	 * 
	 * @param pTexelBufferView - a instance of VkBufferView.
	 * @return this VkStruct instance.
	 */ 
	 public VkWriteDescriptorSet pTexelBufferView(VkBufferView pTexelBufferView){
		 this.pTexelBufferView = pTexelBufferView;
		 long handle = (pTexelBufferView==null) ? 0L : pTexelBufferView.getNativeHandle();
		 setPTexelBufferView0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field pTexelBufferView	[vkhandle]<br>
	 * Prototype: const VkBufferView*  pTexelBufferView
	 */ 
	 public VkBufferView pTexelBufferView(){

		 long handle = getPTexelBufferView0(super.ptr);
		 if(handle == 0){
		    this.pTexelBufferView = null;
		    return null;
		  }  

		 if(this.pTexelBufferView == null){
		    this.pTexelBufferView = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.pTexelBufferView).setNativeHandle(handle);
		  }
		 return this.pTexelBufferView;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkWriteDescriptorSet [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n dstSet: ")
				.append(dstSet() )
				.append(",\n dstBinding: ")
				.append(dstBinding() )
				.append(",\n dstArrayElement: ")
				.append(dstArrayElement() )
				.append(",\n descriptorCount: ")
				.append(descriptorCount() )
				.append(",\n descriptorType: ")
				.append(descriptorType() )
				.append(",\n pImageInfo: ")
				.append(pImageInfo() )
				.append(",\n pBufferInfo: ")
				.append(pBufferInfo() )
				.append(",\n pTexelBufferView: ")
				.append(pTexelBufferView() )
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
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 */

	/**
	 * Native SET method for field dstSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  dstSet
	 */ 
	 private static native void setDstSet0(Buffer ptr, long  _dstSet);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->dstSet = (VkDescriptorSet) (_dstSet);
	  */

	/**
	 * Native GET method for field dstSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  dstSet
	 */ 
	 private static native long getDstSet0(Buffer ptr);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->dstSet);
	 */

	/**
	 * Native SET method for field dstBinding	[int]<br>
	 * Prototype: uint32_t  dstBinding
	 */ 
	 private static native void setDstBinding0(Buffer ptr, int _dstBinding);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->dstBinding = (uint32_t) (_dstBinding);
	  */

	/**
	 * Native GET method for field dstBinding	[int]<br>
	 * Prototype: uint32_t  dstBinding
	 */ 
	 private static native int getDstBinding0(Buffer ptr);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  return (jint) (vkObj->dstBinding);
	 */

	/**
	 * Native SET method for field dstArrayElement	[int]<br>
	 * Prototype: uint32_t  dstArrayElement
	 */ 
	 private static native void setDstArrayElement0(Buffer ptr, int _dstArrayElement);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->dstArrayElement = (uint32_t) (_dstArrayElement);
	  */

	/**
	 * Native GET method for field dstArrayElement	[int]<br>
	 * Prototype: uint32_t  dstArrayElement
	 */ 
	 private static native int getDstArrayElement0(Buffer ptr);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  return (jint) (vkObj->dstArrayElement);
	 */

	/**
	 * Native SET method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native void setDescriptorCount0(Buffer ptr, int _descriptorCount);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->descriptorCount = (uint32_t) (_descriptorCount);
	  */

	/**
	 * Native GET method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native int getDescriptorCount0(Buffer ptr);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  return (jint) (vkObj->descriptorCount);
	 */

	/**
	 * Native SET method for field descriptorType	[vkenum]<br>
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 private static native void setDescriptorType0(Buffer ptr, int  _descriptorType);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->descriptorType = (VkDescriptorType) (_descriptorType);
	  */

	/**
	 * Native GET method for field descriptorType	[vkenum]<br>
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 private static native int getDescriptorType0(Buffer ptr);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->descriptorType);
	 */

	/**
	 * Native SET method for field pImageInfo	[vkstruct]<br>
	 * Prototype: const VkDescriptorImageInfo*  pImageInfo
	 */ 
	 private static native void setPImageInfo0(Buffer ptr, java.nio.ByteBuffer  _pImageInfo);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkDescriptorImageInfo* p_pImageInfo = ( VkDescriptorImageInfo*) _pImageInfo; 
		 vkObj->pImageInfo = p_pImageInfo; 
	  */

	/**
	 * Native GET method for field pImageInfo	[vkstruct]<br>
	 * Prototype: const VkDescriptorImageInfo*  pImageInfo
	 */ 
	 private static native long getPImageInfo0(Buffer ptr);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pImageInfo);
	 */

	/**
	 * Native SET method for field pBufferInfo	[vkstruct]<br>
	 * Prototype: const VkDescriptorBufferInfo*  pBufferInfo
	 */ 
	 private static native void setPBufferInfo0(Buffer ptr, java.nio.ByteBuffer  _pBufferInfo);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkDescriptorBufferInfo* p_pBufferInfo = ( VkDescriptorBufferInfo*) _pBufferInfo; 
		 vkObj->pBufferInfo = p_pBufferInfo; 
	  */

	/**
	 * Native GET method for field pBufferInfo	[vkstruct]<br>
	 * Prototype: const VkDescriptorBufferInfo*  pBufferInfo
	 */ 
	 private static native long getPBufferInfo0(Buffer ptr);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pBufferInfo);
	 */

	/**
	 * Native SET method for field pTexelBufferView	[vkhandle]<br>
	 * Prototype: const VkBufferView*  pTexelBufferView
	 */ 
	 private static native void setPTexelBufferView0(Buffer ptr, long  _pTexelBufferView);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->pTexelBufferView = (const VkBufferView*) (_pTexelBufferView);
	  */

	/**
	 * Native GET method for field pTexelBufferView	[vkhandle]<br>
	 * Prototype: const VkBufferView*  pTexelBufferView
	 */ 
	 private static native long getPTexelBufferView0(Buffer ptr);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pTexelBufferView);
	 */



} // end of class VkWriteDescriptorSet
