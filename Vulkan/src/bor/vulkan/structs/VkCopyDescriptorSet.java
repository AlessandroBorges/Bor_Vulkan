/**
 * Class wrapping Vulkan's VkCopyDescriptorSet struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.01 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.*;
import java.nio.ByteBuffer;

import java.nio.Buffer;


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
 * @version Ver. 0.8.01 (beta) 
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

	/** P wrapper for THIS object */
	 private  P<VkCopyDescriptorSet> p;

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
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkCopyDescriptorSet(long address , int memSize){ 
		 super(address, memSize); 
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
	 * Create a pointer P to contain a instance of this,
	 * with clean native pointer.<br>
	 * You can use {@link VkStruct#setPointer(ByteBuffer)} to set a new 
	 * native pointer.
	 * @return An instance of P for this VkStruct with null pointer
	 */
	 public static P<VkCopyDescriptorSet> createNullPointer(){
	        P<VkCopyDescriptorSet> p = new  P<VkCopyDescriptorSet>(new VkCopyDescriptorSet());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkCopyDescriptorSet> getP() {
	       if(p == null ){
	           p = new P<VkCopyDescriptorSet> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		 int enumVal = sType.getValue();
		 setSType0(this.ptr, enumVal );
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
	 */ 
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 setPNext0(this.ptr, buff);
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
	 */ 
	 public void srcSet(VkDescriptorSet srcSet){
		 this.srcSet = srcSet;
		 ByteBuffer buff = (srcSet==null) ? null : srcSet.getPointer();
		 setSrcSet0(this.ptr, buff);
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
		    ((VkHandle)this.srcSet).setPointer(handle);
		  }
		 return this.srcSet;
	 }

	/**
	 * Set method for field srcBinding	[int]<br>
	 * Prototype: uint32_t  srcBinding
	 */ 
	 public void srcBinding(int srcBinding){
		 this.srcBinding = srcBinding;
		 setSrcBinding0(this.ptr,  srcBinding);
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
	 */ 
	 public void srcArrayElement(int srcArrayElement){
		 this.srcArrayElement = srcArrayElement;
		 setSrcArrayElement0(this.ptr,  srcArrayElement);
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
	 */ 
	 public void dstSet(VkDescriptorSet dstSet){
		 this.dstSet = dstSet;
		 ByteBuffer buff = (dstSet==null) ? null : dstSet.getPointer();
		 setDstSet0(this.ptr, buff);
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
		    ((VkHandle)this.dstSet).setPointer(handle);
		  }
		 return this.dstSet;
	 }

	/**
	 * Set method for field dstBinding	[int]<br>
	 * Prototype: uint32_t  dstBinding
	 */ 
	 public void dstBinding(int dstBinding){
		 this.dstBinding = dstBinding;
		 setDstBinding0(this.ptr,  dstBinding);
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
	 */ 
	 public void dstArrayElement(int dstArrayElement){
		 this.dstArrayElement = dstArrayElement;
		 setDstArrayElement0(this.ptr,  dstArrayElement);
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
	 */ 
	 public void descriptorCount(int descriptorCount){
		 this.descriptorCount = descriptorCount;
		 setDescriptorCount0(this.ptr,  descriptorCount);
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


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field srcSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  srcSet
	 */ 
	 private static native void setSrcSet0(Buffer ptr, java.nio.ByteBuffer  _srcSet);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  vkObj->srcSet = (VkDescriptorSet) (_srcSet);
	  */

	/**
	 * native GET method for field srcSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  srcSet
	 */ 
	 private static native long getSrcSet0(Buffer ptr);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->srcSet);	 */

	/**
	 * native SET method for field srcBinding	[int]<br>
	 * Prototype: uint32_t  srcBinding
	 */ 
	 private static native void setSrcBinding0(Buffer ptr, int _srcBinding);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  vkObj->srcBinding = (uint32_t) (_srcBinding);
	  */

	/**
	 * native GET method for field srcBinding	[int]<br>
	 * Prototype: uint32_t  srcBinding
	 */ 
	 private static native int getSrcBinding0(Buffer ptr);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  return (jint) (vkObj->srcBinding);
	 */

	/**
	 * native SET method for field srcArrayElement	[int]<br>
	 * Prototype: uint32_t  srcArrayElement
	 */ 
	 private static native void setSrcArrayElement0(Buffer ptr, int _srcArrayElement);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  vkObj->srcArrayElement = (uint32_t) (_srcArrayElement);
	  */

	/**
	 * native GET method for field srcArrayElement	[int]<br>
	 * Prototype: uint32_t  srcArrayElement
	 */ 
	 private static native int getSrcArrayElement0(Buffer ptr);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  return (jint) (vkObj->srcArrayElement);
	 */

	/**
	 * native SET method for field dstSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  dstSet
	 */ 
	 private static native void setDstSet0(Buffer ptr, java.nio.ByteBuffer  _dstSet);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  vkObj->dstSet = (VkDescriptorSet) (_dstSet);
	  */

	/**
	 * native GET method for field dstSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  dstSet
	 */ 
	 private static native long getDstSet0(Buffer ptr);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->dstSet);	 */

	/**
	 * native SET method for field dstBinding	[int]<br>
	 * Prototype: uint32_t  dstBinding
	 */ 
	 private static native void setDstBinding0(Buffer ptr, int _dstBinding);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  vkObj->dstBinding = (uint32_t) (_dstBinding);
	  */

	/**
	 * native GET method for field dstBinding	[int]<br>
	 * Prototype: uint32_t  dstBinding
	 */ 
	 private static native int getDstBinding0(Buffer ptr);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  return (jint) (vkObj->dstBinding);
	 */

	/**
	 * native SET method for field dstArrayElement	[int]<br>
	 * Prototype: uint32_t  dstArrayElement
	 */ 
	 private static native void setDstArrayElement0(Buffer ptr, int _dstArrayElement);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  vkObj->dstArrayElement = (uint32_t) (_dstArrayElement);
	  */

	/**
	 * native GET method for field dstArrayElement	[int]<br>
	 * Prototype: uint32_t  dstArrayElement
	 */ 
	 private static native int getDstArrayElement0(Buffer ptr);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  return (jint) (vkObj->dstArrayElement);
	 */

	/**
	 * native SET method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native void setDescriptorCount0(Buffer ptr, int _descriptorCount);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  vkObj->descriptorCount = (uint32_t) (_descriptorCount);
	  */

	/**
	 * native GET method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native int getDescriptorCount0(Buffer ptr);/*
		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  return (jint) (vkObj->descriptorCount);
	 */



} // end of class VkCopyDescriptorSet
