// class wrapping Vulkan's VkWriteDescriptorSet struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkWriteDescriptorSet 
 * @Author Alessandro Borges 
 */
public class VkWriteDescriptorSet extends VkStruct {
	/** ID of this structure [78]  */
	 public static final int TAG = VKWRITEDESCRIPTORSET_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType 
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext 
	 */ 
	VkObject 	pNext;

	/**
	 *  VkDescriptorSet 	dstSet 
	 */ 
	VkDescriptorSet 	dstSet;

	/**
	 *  uint32_t 	dstBinding 
	 */ 
	int 	dstBinding;

	/**
	 *  uint32_t 	dstArrayElement 
	 */ 
	int 	dstArrayElement;

	/**
	 *  uint32_t 	descriptorCount 
	 */ 
	int 	descriptorCount;

	/**
	 *  VkDescriptorType 	descriptorType 
	 */ 
	VkDescriptorType 	descriptorType;

	/**
	 *  const VkDescriptorImageInfo* 	pImageInfo 
	 */ 
	const VkDescriptorImageInfo* 	pImageInfo;

	/**
	 *  const VkDescriptorBufferInfo* 	pBufferInfo 
	 */ 
	const VkDescriptorBufferInfo* 	pBufferInfo;

	/**
	 *  const VkBufferView* 	pTexelBufferView 
	 */ 
	const VkBufferView* 	pTexelBufferView;

	/**
	 * Ctor
	 */
	public VkWriteDescriptorSet(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG); 
	}


	 // /////////////////////
	 //  SETTERS & GETTERS //
	 // /////////////////////

	/**
	 * Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field dstSet
	 * Prototype: VkDescriptorSet  dstSet
	 */ 
	 public void dstSet(VkDescriptorSet dstSet){
		 this.dstSet = dstSet;
		dstSet0(super.ptr, dstSet);
	 }

	/**
	 * get method for field dstSet
	 * Prototype: VkDescriptorSet  dstSet
	 */ 
	 public VkDescriptorSet dstSet(){
		 // return  this.dstSet;
		 return dstSet0(super.ptr);
	 }

	/**
	 * Set method for field dstBinding
	 * Prototype: uint32_t  dstBinding
	 */ 
	 public void dstBinding(int dstBinding){
		 this.dstBinding = dstBinding;
		dstBinding0(super.ptr, dstBinding);
	 }

	/**
	 * get method for field dstBinding
	 * Prototype: uint32_t  dstBinding
	 */ 
	 public int dstBinding(){
		 // return  this.dstBinding;
		 return dstBinding0(super.ptr);
	 }

	/**
	 * Set method for field dstArrayElement
	 * Prototype: uint32_t  dstArrayElement
	 */ 
	 public void dstArrayElement(int dstArrayElement){
		 this.dstArrayElement = dstArrayElement;
		dstArrayElement0(super.ptr, dstArrayElement);
	 }

	/**
	 * get method for field dstArrayElement
	 * Prototype: uint32_t  dstArrayElement
	 */ 
	 public int dstArrayElement(){
		 // return  this.dstArrayElement;
		 return dstArrayElement0(super.ptr);
	 }

	/**
	 * Set method for field descriptorCount
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 public void descriptorCount(int descriptorCount){
		 this.descriptorCount = descriptorCount;
		descriptorCount0(super.ptr, descriptorCount);
	 }

	/**
	 * get method for field descriptorCount
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 public int descriptorCount(){
		 // return  this.descriptorCount;
		 return descriptorCount0(super.ptr);
	 }

	/**
	 * Set method for field descriptorType
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 public void descriptorType(VkDescriptorType descriptorType){
		 this.descriptorType = descriptorType;
		descriptorType0(super.ptr, descriptorType);
	 }

	/**
	 * get method for field descriptorType
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 public VkDescriptorType descriptorType(){
		 // return  this.descriptorType;
		 return descriptorType0(super.ptr);
	 }

	/**
	 * Set method for field pImageInfo
	 * Prototype: const VkDescriptorImageInfo*  pImageInfo
	 */ 
	 public void pImageInfo(const VkDescriptorImageInfo* pImageInfo){
		 this.pImageInfo = pImageInfo;
		pImageInfo0(super.ptr, pImageInfo);
	 }

	/**
	 * get method for field pImageInfo
	 * Prototype: const VkDescriptorImageInfo*  pImageInfo
	 */ 
	 public const VkDescriptorImageInfo* pImageInfo(){
		 // return  this.pImageInfo;
		 return pImageInfo0(super.ptr);
	 }

	/**
	 * Set method for field pBufferInfo
	 * Prototype: const VkDescriptorBufferInfo*  pBufferInfo
	 */ 
	 public void pBufferInfo(const VkDescriptorBufferInfo* pBufferInfo){
		 this.pBufferInfo = pBufferInfo;
		pBufferInfo0(super.ptr, pBufferInfo);
	 }

	/**
	 * get method for field pBufferInfo
	 * Prototype: const VkDescriptorBufferInfo*  pBufferInfo
	 */ 
	 public const VkDescriptorBufferInfo* pBufferInfo(){
		 // return  this.pBufferInfo;
		 return pBufferInfo0(super.ptr);
	 }

	/**
	 * Set method for field pTexelBufferView
	 * Prototype: const VkBufferView*  pTexelBufferView
	 */ 
	 public void pTexelBufferView(const VkBufferView* pTexelBufferView){
		 this.pTexelBufferView = pTexelBufferView;
		pTexelBufferView0(super.ptr, pTexelBufferView);
	 }

	/**
	 * get method for field pTexelBufferView
	 * Prototype: const VkBufferView*  pTexelBufferView
	 */ 
	 public const VkBufferView* pTexelBufferView(){
		 // return  this.pTexelBufferView;
		 return pTexelBufferView0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field dstSet
	 * Prototype: VkDescriptorSet  dstSet
	 */ 
	 private static native void dstSet0(ByteBuffer ptr, VkDescriptorSet _dstSet);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(*ptr);
		  _obj.dstSet = (VkDescriptorSet) (_dstSet);
	  */

	/**
	 * get method for field dstSet
	 * Prototype: VkDescriptorSet  dstSet
	 */ 
	 private static native VkDescriptorSet dstSet0(ByteBuffer ptr);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(ptr);
		  return (VkDescriptorSet) (_obj.VkDescriptorSet);
	 */

	/**
	 * native Set method for field dstBinding
	 * Prototype: uint32_t  dstBinding
	 */ 
	 private static native void dstBinding0(ByteBuffer ptr, int _dstBinding);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(*ptr);
		  _obj.dstBinding = (uint32_t) (_dstBinding);
	  */

	/**
	 * get method for field dstBinding
	 * Prototype: uint32_t  dstBinding
	 */ 
	 private static native int dstBinding0(ByteBuffer ptr);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field dstArrayElement
	 * Prototype: uint32_t  dstArrayElement
	 */ 
	 private static native void dstArrayElement0(ByteBuffer ptr, int _dstArrayElement);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(*ptr);
		  _obj.dstArrayElement = (uint32_t) (_dstArrayElement);
	  */

	/**
	 * get method for field dstArrayElement
	 * Prototype: uint32_t  dstArrayElement
	 */ 
	 private static native int dstArrayElement0(ByteBuffer ptr);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field descriptorCount
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native void descriptorCount0(ByteBuffer ptr, int _descriptorCount);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(*ptr);
		  _obj.descriptorCount = (uint32_t) (_descriptorCount);
	  */

	/**
	 * get method for field descriptorCount
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native int descriptorCount0(ByteBuffer ptr);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field descriptorType
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 private static native void descriptorType0(ByteBuffer ptr, VkDescriptorType _descriptorType);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(*ptr);
		  _obj.descriptorType = (VkDescriptorType) (_descriptorType);
	  */

	/**
	 * get method for field descriptorType
	 * Prototype: VkDescriptorType  descriptorType
	 */ 
	 private static native VkDescriptorType descriptorType0(ByteBuffer ptr);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(ptr);
		  return (VkDescriptorType) (_obj.VkDescriptorType);
	 */

	/**
	 * native Set method for field pImageInfo
	 * Prototype: const VkDescriptorImageInfo*  pImageInfo
	 */ 
	 private static native void pImageInfo0(ByteBuffer ptr, const VkDescriptorImageInfo* _pImageInfo);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(*ptr);
		  _obj.pImageInfo = (const VkDescriptorImageInfo*) (_pImageInfo);
	  */

	/**
	 * get method for field pImageInfo
	 * Prototype: const VkDescriptorImageInfo*  pImageInfo
	 */ 
	 private static native const VkDescriptorImageInfo* pImageInfo0(ByteBuffer ptr);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(ptr);
		  return (const VkDescriptorImageInfo*) (_obj.const VkDescriptorImageInfo*);
	 */

	/**
	 * native Set method for field pBufferInfo
	 * Prototype: const VkDescriptorBufferInfo*  pBufferInfo
	 */ 
	 private static native void pBufferInfo0(ByteBuffer ptr, const VkDescriptorBufferInfo* _pBufferInfo);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(*ptr);
		  _obj.pBufferInfo = (const VkDescriptorBufferInfo*) (_pBufferInfo);
	  */

	/**
	 * get method for field pBufferInfo
	 * Prototype: const VkDescriptorBufferInfo*  pBufferInfo
	 */ 
	 private static native const VkDescriptorBufferInfo* pBufferInfo0(ByteBuffer ptr);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(ptr);
		  return (const VkDescriptorBufferInfo*) (_obj.const VkDescriptorBufferInfo*);
	 */

	/**
	 * native Set method for field pTexelBufferView
	 * Prototype: const VkBufferView*  pTexelBufferView
	 */ 
	 private static native void pTexelBufferView0(ByteBuffer ptr, const VkBufferView* _pTexelBufferView);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(*ptr);
		  _obj.pTexelBufferView = (const VkBufferView*) (_pTexelBufferView);
	  */

	/**
	 * get method for field pTexelBufferView
	 * Prototype: const VkBufferView*  pTexelBufferView
	 */ 
	 private static native const VkBufferView* pTexelBufferView0(ByteBuffer ptr);/*
		  VkWriteDescriptorSet _obj = (VkWriteDescriptorSet)(ptr);
		  return (const VkBufferView*) (_obj.const VkBufferView*);
	 */



} // end of class VkWriteDescriptorSet
