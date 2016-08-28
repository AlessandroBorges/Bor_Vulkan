/**
 * Class wrapping Vulkan's VkCopyDescriptorSet struct.
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
 *  This class is a Java front end for struct VkCopyDescriptorSet. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkCopyDescriptorSet {
 *     VkStructureType    sType;
 *     const void*        pNext;
 *     VkDescriptorSet    srcSet;
 *     uint32_t           srcBinding;
 *     uint32_t           srcArrayElement;
 *     VkDescriptorSet    dstSet;
 *     uint32_t           dstBinding;
 *     uint32_t           dstArrayElement;
 *     uint32_t           descriptorCount;
 * } VkCopyDescriptorSet;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkCopyDescriptorSet extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [79]  */
	 private static final String TAG = "VkCopyDescriptorSet";

	/** ID of this structure [79]  */
	 public static final int TAG_ID = VKCOPYDESCRIPTORSET_ID;

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
	 *  VkDescriptorSet 	srcSet	[vkhandle]
	 */ 
	VkDescriptorSet 	srcSet;
	
	/**
	 *  uint32_t 	srcBinding	[int]
	 */ 
	int 	srcBinding;
	
	/**
	 *  uint32_t 	srcArrayElement	[int]
	 */ 
	int 	srcArrayElement;
	
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
	 * Ctor
	 */
	public VkCopyDescriptorSet(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkCopyDescriptorSet(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkCopyDescriptorSet(long address){ 
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
	 public static VkArray<VkCopyDescriptorSet> createVkArray(int size){ 
		 VkCopyDescriptorSet[] array = new VkCopyDescriptorSet[size]; 
		 VkArrayStruct<VkCopyDescriptorSet> vkArray = new VkArrayStruct<VkCopyDescriptorSet> (array, TAG_ID);
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
	 public VkCopyDescriptorSet sType(VkStructureType sType){
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
	 public VkCopyDescriptorSet pNext(VkObject pNext){
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
	 * Set method for field srcSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  srcSet
	 * 
	 * @param srcSet - a instance of VkDescriptorSet.
	 * @return this VkStruct instance.
	 */ 
	 public VkCopyDescriptorSet srcSet(VkDescriptorSet srcSet){
		 this.srcSet = srcSet;
		 long handle = (srcSet==null) ? 0L : srcSet.getNativeHandle();
		 setSrcSet0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field srcSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  srcSet
	 */ 
	 public VkDescriptorSet srcSet(){

		 long handle = getSrcSet0(super.ptr);
		 if(handle == 0){
		    this.srcSet = null;
		    return null;
		  }  

		 if(this.srcSet == null){
		    this.srcSet = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.srcSet).setNativeHandle(handle);
		  }
		 return this.srcSet;
	 }

	/**
	 * Set method for field srcBinding	[int]<br>
	 * Prototype: uint32_t  srcBinding
	 * 
	 * @param srcBinding - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkCopyDescriptorSet srcBinding(int srcBinding){
		 this.srcBinding = srcBinding;
		 setSrcBinding0(this.ptr,  srcBinding);
		 return this;
	 }

	/**
	 * Get method for field srcBinding	[int]<br>
	 * Prototype: uint32_t  srcBinding
	 */ 
	 public int srcBinding(){
		 int var = getSrcBinding0(super.ptr);
		 this.srcBinding = var;
		 return this.srcBinding;
	 }

	/**
	 * Set method for field srcArrayElement	[int]<br>
	 * Prototype: uint32_t  srcArrayElement
	 * 
	 * @param srcArrayElement - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkCopyDescriptorSet srcArrayElement(int srcArrayElement){
		 this.srcArrayElement = srcArrayElement;
		 setSrcArrayElement0(this.ptr,  srcArrayElement);
		 return this;
	 }

	/**
	 * Get method for field srcArrayElement	[int]<br>
	 * Prototype: uint32_t  srcArrayElement
	 */ 
	 public int srcArrayElement(){
		 int var = getSrcArrayElement0(super.ptr);
		 this.srcArrayElement = var;
		 return this.srcArrayElement;
	 }

	/**
	 * Set method for field dstSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  dstSet
	 * 
	 * @param dstSet - a instance of VkDescriptorSet.
	 * @return this VkStruct instance.
	 */ 
	 public VkCopyDescriptorSet dstSet(VkDescriptorSet dstSet){
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
	 public VkCopyDescriptorSet dstBinding(int dstBinding){
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
	 public VkCopyDescriptorSet dstArrayElement(int dstArrayElement){
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
	 public VkCopyDescriptorSet descriptorCount(int descriptorCount){
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


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkCopyDescriptorSet [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n srcSet: ")
				.append(srcSet() )
				.append(",\n srcBinding: ")
				.append(srcBinding() )
				.append(",\n srcArrayElement: ")
				.append(srcArrayElement() )
				.append(",\n dstSet: ")
				.append(dstSet() )
				.append(",\n dstBinding: ")
				.append(dstBinding() )
				.append(",\n dstArrayElement: ")
				.append(dstArrayElement() )
				.append(",\n descriptorCount: ")
				.append(descriptorCount() )
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
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field srcSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  srcSet
	 */ 
	 private static native void setSrcSet0(Buffer ptr, long  _srcSet);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->srcSet = (VkDescriptorSet) (_srcSet);
	  */

	/**
	 * Native GET method for field srcSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  srcSet
	 */ 
	 private static native long getSrcSet0(Buffer ptr);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->srcSet);
	 */

	/**
	 * Native SET method for field srcBinding	[int]<br>
	 * Prototype: uint32_t  srcBinding
	 */ 
	 private static native void setSrcBinding0(Buffer ptr, int _srcBinding);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->srcBinding = (uint32_t) (_srcBinding);
	  */

	/**
	 * Native GET method for field srcBinding	[int]<br>
	 * Prototype: uint32_t  srcBinding
	 */ 
	 private static native int getSrcBinding0(Buffer ptr);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  return (jint) (vkObj->srcBinding);
	 */

	/**
	 * Native SET method for field srcArrayElement	[int]<br>
	 * Prototype: uint32_t  srcArrayElement
	 */ 
	 private static native void setSrcArrayElement0(Buffer ptr, int _srcArrayElement);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->srcArrayElement = (uint32_t) (_srcArrayElement);
	  */

	/**
	 * Native GET method for field srcArrayElement	[int]<br>
	 * Prototype: uint32_t  srcArrayElement
	 */ 
	 private static native int getSrcArrayElement0(Buffer ptr);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  return (jint) (vkObj->srcArrayElement);
	 */

	/**
	 * Native SET method for field dstSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  dstSet
	 */ 
	 private static native void setDstSet0(Buffer ptr, long  _dstSet);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->dstSet = (VkDescriptorSet) (_dstSet);
	  */

	/**
	 * Native GET method for field dstSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  dstSet
	 */ 
	 private static native long getDstSet0(Buffer ptr);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->dstSet);
	 */

	/**
	 * Native SET method for field dstBinding	[int]<br>
	 * Prototype: uint32_t  dstBinding
	 */ 
	 private static native void setDstBinding0(Buffer ptr, int _dstBinding);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->dstBinding = (uint32_t) (_dstBinding);
	  */

	/**
	 * Native GET method for field dstBinding	[int]<br>
	 * Prototype: uint32_t  dstBinding
	 */ 
	 private static native int getDstBinding0(Buffer ptr);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  return (jint) (vkObj->dstBinding);
	 */

	/**
	 * Native SET method for field dstArrayElement	[int]<br>
	 * Prototype: uint32_t  dstArrayElement
	 */ 
	 private static native void setDstArrayElement0(Buffer ptr, int _dstArrayElement);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->dstArrayElement = (uint32_t) (_dstArrayElement);
	  */

	/**
	 * Native GET method for field dstArrayElement	[int]<br>
	 * Prototype: uint32_t  dstArrayElement
	 */ 
	 private static native int getDstArrayElement0(Buffer ptr);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  return (jint) (vkObj->dstArrayElement);
	 */

	/**
	 * Native SET method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native void setDescriptorCount0(Buffer ptr, int _descriptorCount);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->descriptorCount = (uint32_t) (_descriptorCount);
	  */

	/**
	 * Native GET method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native int getDescriptorCount0(Buffer ptr);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  return (jint) (vkObj->descriptorCount);
	 */



} // end of class VkCopyDescriptorSet
