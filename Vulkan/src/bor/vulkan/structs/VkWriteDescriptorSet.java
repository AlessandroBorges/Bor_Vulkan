/**
 * Class wrapping Vulkan's VkWriteDescriptorSet struct.
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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkWriteDescriptorSet extends VkStruct {
	/** TAG of this structure [78]  */
	 private static final String TAG = "VkWriteDescriptorSet";

	/** ID of this structure [78]  */
	 public static final int TAG_ID = VKWRITEDESCRIPTORSET_ID;

	/** P wrapper for THIS object */
	 private  P<VkWriteDescriptorSet> p;

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
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkWriteDescriptorSet(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkWriteDescriptorSet(long address , int memSize){ 
		 super(address, memSize); 
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
	 * Create a pointer P to contain a instance of this,
	 * with clean native pointer.<br>
	 * You can use {@link VkStruct#setPointer(ByteBuffer)} to set a new 
	 * native pointer.
	 * @return An instance of P for this VkStruct with null pointer
	 */
	 public static P<VkWriteDescriptorSet> createNullPointer(){
	        P<VkWriteDescriptorSet> p = new  P<VkWriteDescriptorSet>(new VkWriteDescriptorSet());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkWriteDescriptorSet> getP() {
	       if(p == null ){
	           p = new P<VkWriteDescriptorSet> (this);
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

	/**
	 * Set method for field descriptorType	[vkenum]<br>
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 public void descriptorType(VkDescriptorType descriptorType){
		 this.descriptorType = descriptorType;
		 int enumVal = descriptorType.getValue();
		 setDescriptorType0(this.ptr, enumVal );
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
	 */ 
	 public void pImageInfo( VkDescriptorImageInfo  pImageInfo){
		 this.pImageInfo = pImageInfo;
		 ByteBuffer buff = (pImageInfo==null) ? null : pImageInfo.getPointer();
		 setPImageInfo0(this.ptr, buff);
	 }

	/**
	 * Get method for field pImageInfo	[vkstruct]<br>
	 * Prototype: const VkDescriptorImageInfo*  pImageInfo
	 */ 
	 public  VkDescriptorImageInfo  pImageInfo(){
		 long pointer = getPImageInfo0(super.ptr);
		 if(pointer == 0){
		    this.pImageInfo = null;
		    return null;
		  } 

		 if(this.pImageInfo == null){
		    this.pImageInfo = new  VkDescriptorImageInfo (pointer);
		 }else{
		    this.pImageInfo.setPointer(pointer);
		  }
		 return this.pImageInfo;
	 }

	/**
	 * Set method for field pBufferInfo	[vkstruct]<br>
	 * Prototype: const VkDescriptorBufferInfo*  pBufferInfo
	 */ 
	 public void pBufferInfo( VkDescriptorBufferInfo  pBufferInfo){
		 this.pBufferInfo = pBufferInfo;
		 ByteBuffer buff = (pBufferInfo==null) ? null : pBufferInfo.getPointer();
		 setPBufferInfo0(this.ptr, buff);
	 }

	/**
	 * Get method for field pBufferInfo	[vkstruct]<br>
	 * Prototype: const VkDescriptorBufferInfo*  pBufferInfo
	 */ 
	 public  VkDescriptorBufferInfo  pBufferInfo(){
		 long pointer = getPBufferInfo0(super.ptr);
		 if(pointer == 0){
		    this.pBufferInfo = null;
		    return null;
		  } 

		 if(this.pBufferInfo == null){
		    this.pBufferInfo = new  VkDescriptorBufferInfo (pointer);
		 }else{
		    this.pBufferInfo.setPointer(pointer);
		  }
		 return this.pBufferInfo;
	 }

	/**
	 * Set method for field pTexelBufferView	[vkhandle]<br>
	 * Prototype: const VkBufferView*  pTexelBufferView
	 */ 
	 public void pTexelBufferView( VkBufferView  pTexelBufferView){
		 this.pTexelBufferView = pTexelBufferView;
		 ByteBuffer buff = (pTexelBufferView==null) ? null : pTexelBufferView.getPointer();
		 setPTexelBufferView0(this.ptr, buff);
	 }

	/**
	 * Get method for field pTexelBufferView	[vkhandle]<br>
	 * Prototype: const VkBufferView*  pTexelBufferView
	 */ 
	 public  VkBufferView  pTexelBufferView(){

		 long handle = getPTexelBufferView0(super.ptr);
		 if(handle == 0){
		    this.pTexelBufferView = null;
		    return null;
		  }  

		 if(this.pTexelBufferView == null){
		    this.pTexelBufferView = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.pTexelBufferView).setPointer(handle);
		  }
		 return this.pTexelBufferView;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkWriteDescriptorSet vkObj = (VkWriteDescriptorSet*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkWriteDescriptorSet vkObj = (VkWriteDescriptorSet*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field dstSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  dstSet
	 */ 
	 private static native void setDstSet0(Buffer ptr, java.nio.ByteBuffer  _dstSet);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  vkObj->dstSet = (VkDescriptorSet) (_dstSet);
	  */

	/**
	 * native GET method for field dstSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  dstSet
	 */ 
	 private static native long getDstSet0(Buffer ptr);/*
		  VkWriteDescriptorSet vkObj = (VkWriteDescriptorSet*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->dstSet);	 */

	/**
	 * native SET method for field dstBinding	[int]<br>
	 * Prototype: uint32_t  dstBinding
	 */ 
	 private static native void setDstBinding0(Buffer ptr, int _dstBinding);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  vkObj->dstBinding = (uint32_t) (_dstBinding);
	  */

	/**
	 * native GET method for field dstBinding	[int]<br>
	 * Prototype: uint32_t  dstBinding
	 */ 
	 private static native int getDstBinding0(Buffer ptr);/*
		  VkWriteDescriptorSet vkObj = (VkWriteDescriptorSet*)(ptr);
		  return (jint) (vkObj->dstBinding);
	 */

	/**
	 * native SET method for field dstArrayElement	[int]<br>
	 * Prototype: uint32_t  dstArrayElement
	 */ 
	 private static native void setDstArrayElement0(Buffer ptr, int _dstArrayElement);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  vkObj->dstArrayElement = (uint32_t) (_dstArrayElement);
	  */

	/**
	 * native GET method for field dstArrayElement	[int]<br>
	 * Prototype: uint32_t  dstArrayElement
	 */ 
	 private static native int getDstArrayElement0(Buffer ptr);/*
		  VkWriteDescriptorSet vkObj = (VkWriteDescriptorSet*)(ptr);
		  return (jint) (vkObj->dstArrayElement);
	 */

	/**
	 * native SET method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native void setDescriptorCount0(Buffer ptr, int _descriptorCount);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  vkObj->descriptorCount = (uint32_t) (_descriptorCount);
	  */

	/**
	 * native GET method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native int getDescriptorCount0(Buffer ptr);/*
		  VkWriteDescriptorSet vkObj = (VkWriteDescriptorSet*)(ptr);
		  return (jint) (vkObj->descriptorCount);
	 */

	/**
	 * native SET method for field descriptorType	[vkenum]<br>
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 private static native void setDescriptorType0(Buffer ptr, int  _descriptorType);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  vkObj->descriptorType = (VkDescriptorType) (_descriptorType);
	  */

	/**
	 * native GET method for field descriptorType	[vkenum]<br>
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 private static native int  getDescriptorType0(Buffer ptr);/*
		  VkWriteDescriptorSet vkObj = (VkWriteDescriptorSet*)(ptr);
		  return (VkDescriptorType) (vkObj->descriptorType);
	 */

	/**
	 * native SET method for field pImageInfo	[vkstruct]<br>
	 * Prototype: const VkDescriptorImageInfo*  pImageInfo
	 */ 
	 private static native void setPImageInfo0(Buffer ptr, java.nio.ByteBuffer  _pImageInfo);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  vkObj->pImageInfo = (const VkDescriptorImageInfo*) (_pImageInfo);
	  */

	/**
	 * native GET method for field pImageInfo	[vkstruct]<br>
	 * Prototype: const VkDescriptorImageInfo*  pImageInfo
	 */ 
	 private static native long getPImageInfo0(Buffer ptr);/*
		  VkWriteDescriptorSet vkObj = (VkWriteDescriptorSet*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pImageInfo);	 */

	/**
	 * native SET method for field pBufferInfo	[vkstruct]<br>
	 * Prototype: const VkDescriptorBufferInfo*  pBufferInfo
	 */ 
	 private static native void setPBufferInfo0(Buffer ptr, java.nio.ByteBuffer  _pBufferInfo);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  vkObj->pBufferInfo = (const VkDescriptorBufferInfo*) (_pBufferInfo);
	  */

	/**
	 * native GET method for field pBufferInfo	[vkstruct]<br>
	 * Prototype: const VkDescriptorBufferInfo*  pBufferInfo
	 */ 
	 private static native long getPBufferInfo0(Buffer ptr);/*
		  VkWriteDescriptorSet vkObj = (VkWriteDescriptorSet*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pBufferInfo);	 */

	/**
	 * native SET method for field pTexelBufferView	[vkhandle]<br>
	 * Prototype: const VkBufferView*  pTexelBufferView
	 */ 
	 private static native void setPTexelBufferView0(Buffer ptr, java.nio.ByteBuffer  _pTexelBufferView);/*
		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  vkObj->pTexelBufferView = (const VkBufferView*) (_pTexelBufferView);
	  */

	/**
	 * native GET method for field pTexelBufferView	[vkhandle]<br>
	 * Prototype: const VkBufferView*  pTexelBufferView
	 */ 
	 private static native long getPTexelBufferView0(Buffer ptr);/*
		  VkWriteDescriptorSet vkObj = (VkWriteDescriptorSet*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pTexelBufferView);	 */



} // end of class VkWriteDescriptorSet
