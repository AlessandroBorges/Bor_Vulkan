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
	 *  const void* 	pNext	[p]
	 */ 
	 P<VkObject> 	pNext;

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
	 *  const VkDescriptorImageInfo* 	pImageInfo	[p]
	 */ 
	 P<VkDescriptorImageInfo>  	pImageInfo;

	/**
	 *  const VkDescriptorBufferInfo* 	pBufferInfo	[p]
	 */ 
	 P<VkDescriptorBufferInfo>  	pBufferInfo;

	/**
	 *  const VkBufferView* 	pTexelBufferView	[p]
	 */ 
	 P<VkBufferView>  	pTexelBufferView;

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
	 public VkWriteDescriptorSet(long address, int memSize){ 
		 super(address, memSize); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
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
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(P<VkObject> pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public P<VkObject> pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field dstSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  dstSet
	 */ 
	 public void dstSet(VkDescriptorSet dstSet){
		 this.dstSet = dstSet;
		dstSet0(super.ptr, dstSet);
	 }

	/**
	 * get method for field dstSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  dstSet
	 */ 
	 public VkDescriptorSet dstSet(){
		 // return  this.dstSet;
		 return dstSet0(super.ptr);
	 }

	/**
	 * Set method for field dstBinding	[int]<br>
	 * Prototype: uint32_t  dstBinding
	 */ 
	 public void dstBinding(int dstBinding){
		 this.dstBinding = dstBinding;
		dstBinding0(super.ptr, dstBinding);
	 }

	/**
	 * get method for field dstBinding	[int]<br>
	 * Prototype: uint32_t  dstBinding
	 */ 
	 public int dstBinding(){
		 // return  this.dstBinding;
		 return dstBinding0(super.ptr);
	 }

	/**
	 * Set method for field dstArrayElement	[int]<br>
	 * Prototype: uint32_t  dstArrayElement
	 */ 
	 public void dstArrayElement(int dstArrayElement){
		 this.dstArrayElement = dstArrayElement;
		dstArrayElement0(super.ptr, dstArrayElement);
	 }

	/**
	 * get method for field dstArrayElement	[int]<br>
	 * Prototype: uint32_t  dstArrayElement
	 */ 
	 public int dstArrayElement(){
		 // return  this.dstArrayElement;
		 return dstArrayElement0(super.ptr);
	 }

	/**
	 * Set method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 public void descriptorCount(int descriptorCount){
		 this.descriptorCount = descriptorCount;
		descriptorCount0(super.ptr, descriptorCount);
	 }

	/**
	 * get method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 public int descriptorCount(){
		 // return  this.descriptorCount;
		 return descriptorCount0(super.ptr);
	 }

	/**
	 * Set method for field descriptorType	[vkenum]<br>
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 public void descriptorType(VkDescriptorType descriptorType){
		 this.descriptorType = descriptorType;
		descriptorType0(super.ptr, descriptorType);
	 }

	/**
	 * get method for field descriptorType	[vkenum]<br>
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 public VkDescriptorType descriptorType(){
		 // return  this.descriptorType;
		 return descriptorType0(super.ptr);
	 }

	/**
	 * Set method for field pImageInfo	[p]<br>
	 * Prototype: const VkDescriptorImageInfo*  pImageInfo
	 */ 
	 public void pImageInfo(P<VkDescriptorImageInfo>  pImageInfo){
		 this.pImageInfo = pImageInfo;
		pImageInfo0(super.ptr, pImageInfo);
	 }

	/**
	 * get method for field pImageInfo	[p]<br>
	 * Prototype: const VkDescriptorImageInfo*  pImageInfo
	 */ 
	 public P<VkDescriptorImageInfo>  pImageInfo(){
		 // return  this.pImageInfo;
		 return pImageInfo0(super.ptr);
	 }

	/**
	 * Set method for field pBufferInfo	[p]<br>
	 * Prototype: const VkDescriptorBufferInfo*  pBufferInfo
	 */ 
	 public void pBufferInfo(P<VkDescriptorBufferInfo>  pBufferInfo){
		 this.pBufferInfo = pBufferInfo;
		pBufferInfo0(super.ptr, pBufferInfo);
	 }

	/**
	 * get method for field pBufferInfo	[p]<br>
	 * Prototype: const VkDescriptorBufferInfo*  pBufferInfo
	 */ 
	 public P<VkDescriptorBufferInfo>  pBufferInfo(){
		 // return  this.pBufferInfo;
		 return pBufferInfo0(super.ptr);
	 }

	/**
	 * Set method for field pTexelBufferView	[p]<br>
	 * Prototype: const VkBufferView*  pTexelBufferView
	 */ 
	 public void pTexelBufferView(P<VkBufferView>  pTexelBufferView){
		 this.pTexelBufferView = pTexelBufferView;
		pTexelBufferView0(super.ptr, pTexelBufferView);
	 }

	/**
	 * get method for field pTexelBufferView	[p]<br>
	 * Prototype: const VkBufferView*  pTexelBufferView
	 */ 
	 public P<VkBufferView>  pTexelBufferView(){
		 // return  this.pTexelBufferView;
		 return pTexelBufferView0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field dstSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  dstSet
	 */ 
	 private static native void dstSet0(ByteBuffer ptr, VkDescriptorSet _dstSet);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(*ptr);
		  _obj.dstSet = (VkDescriptorSet) (_dstSet);
	  */

	/**
	 * native GET method for field dstSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  dstSet
	 */ 
	 private static native VkDescriptorSet dstSet0(ByteBuffer ptr);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(ptr);
		  return (VkDescriptorSet) (_obj.VkDescriptorSet);
	 */

	/**
	 * native SET method for field dstBinding	[int]<br>
	 * Prototype: uint32_t  dstBinding
	 */ 
	 private static native void dstBinding0(ByteBuffer ptr, int _dstBinding);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(*ptr);
		  _obj.dstBinding = (uint32_t) (_dstBinding);
	  */

	/**
	 * native GET method for field dstBinding	[int]<br>
	 * Prototype: uint32_t  dstBinding
	 */ 
	 private static native int dstBinding0(ByteBuffer ptr);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field dstArrayElement	[int]<br>
	 * Prototype: uint32_t  dstArrayElement
	 */ 
	 private static native void dstArrayElement0(ByteBuffer ptr, int _dstArrayElement);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(*ptr);
		  _obj.dstArrayElement = (uint32_t) (_dstArrayElement);
	  */

	/**
	 * native GET method for field dstArrayElement	[int]<br>
	 * Prototype: uint32_t  dstArrayElement
	 */ 
	 private static native int dstArrayElement0(ByteBuffer ptr);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native void descriptorCount0(ByteBuffer ptr, int _descriptorCount);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(*ptr);
		  _obj.descriptorCount = (uint32_t) (_descriptorCount);
	  */

	/**
	 * native GET method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native int descriptorCount0(ByteBuffer ptr);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field descriptorType	[vkenum]<br>
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 private static native void descriptorType0(ByteBuffer ptr, VkDescriptorType _descriptorType);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(*ptr);
		  _obj.descriptorType = (VkDescriptorType) (_descriptorType);
	  */

	/**
	 * native GET method for field descriptorType	[vkenum]<br>
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 private static native VkDescriptorType descriptorType0(ByteBuffer ptr);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(ptr);
		  return (VkDescriptorType) (_obj.VkDescriptorType);
	 */

	/**
	 * native SET method for field pImageInfo	[p]<br>
	 * Prototype: const VkDescriptorImageInfo*  pImageInfo
	 */ 
	 private static native void pImageInfo0(ByteBuffer ptr, P<VkDescriptorImageInfo>  _pImageInfo);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(*ptr);
		  _obj.pImageInfo = (const VkDescriptorImageInfo*) (_pImageInfo);
	  */

	/**
	 * native GET method for field pImageInfo	[p]<br>
	 * Prototype: const VkDescriptorImageInfo*  pImageInfo
	 */ 
	 private static native P<VkDescriptorImageInfo>  pImageInfo0(ByteBuffer ptr);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(ptr);
		  return (P<VkDescriptorImageInfo> ) (_obj.const VkDescriptorImageInfo*);
	 */

	/**
	 * native SET method for field pBufferInfo	[p]<br>
	 * Prototype: const VkDescriptorBufferInfo*  pBufferInfo
	 */ 
	 private static native void pBufferInfo0(ByteBuffer ptr, P<VkDescriptorBufferInfo>  _pBufferInfo);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(*ptr);
		  _obj.pBufferInfo = (const VkDescriptorBufferInfo*) (_pBufferInfo);
	  */

	/**
	 * native GET method for field pBufferInfo	[p]<br>
	 * Prototype: const VkDescriptorBufferInfo*  pBufferInfo
	 */ 
	 private static native P<VkDescriptorBufferInfo>  pBufferInfo0(ByteBuffer ptr);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(ptr);
		  return (P<VkDescriptorBufferInfo> ) (_obj.const VkDescriptorBufferInfo*);
	 */

	/**
	 * native SET method for field pTexelBufferView	[p]<br>
	 * Prototype: const VkBufferView*  pTexelBufferView
	 */ 
	 private static native void pTexelBufferView0(ByteBuffer ptr, P<VkBufferView>  _pTexelBufferView);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(*ptr);
		  _obj.pTexelBufferView = (const VkBufferView*) (_pTexelBufferView);
	  */

	/**
	 * native GET method for field pTexelBufferView	[p]<br>
	 * Prototype: const VkBufferView*  pTexelBufferView
	 */ 
	 private static native P<VkBufferView>  pTexelBufferView0(ByteBuffer ptr);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(ptr);
		  return (P<VkBufferView> ) (_obj.const VkBufferView*);
	 */



} // end of class VkWriteDescriptorSet
