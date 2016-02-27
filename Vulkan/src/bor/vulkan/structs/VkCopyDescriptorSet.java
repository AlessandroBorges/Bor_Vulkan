// class wrapping Vulkan's VkCopyDescriptorSet struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkCopyDescriptorSet 
 * @Author Alessandro Borges 
 */
public class VkCopyDescriptorSet extends VkStruct {
	/** ID of this structure [79]  */
	 public static final int TAG = VKCOPYDESCRIPTORSET_ID;

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
	 *  VkDescriptorSet 	srcSet 
	 */ 
	VkDescriptorSet 	srcSet;

	/**
	 *  uint32_t 	srcBinding 
	 */ 
	int 	srcBinding;

	/**
	 *  uint32_t 	srcArrayElement 
	 */ 
	int 	srcArrayElement;

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
	 * Ctor
	 */
	public VkCopyDescriptorSet(){ 
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
	 * Set method for field srcSet
	 * Prototype: VkDescriptorSet  srcSet
	 */ 
	 public void srcSet(VkDescriptorSet srcSet){
		 this.srcSet = srcSet;
		srcSet0(super.ptr, srcSet);
	 }

	/**
	 * get method for field srcSet
	 * Prototype: VkDescriptorSet  srcSet
	 */ 
	 public VkDescriptorSet srcSet(){
		 // return  this.srcSet;
		 return srcSet0(super.ptr);
	 }

	/**
	 * Set method for field srcBinding
	 * Prototype: uint32_t  srcBinding
	 */ 
	 public void srcBinding(int srcBinding){
		 this.srcBinding = srcBinding;
		srcBinding0(super.ptr, srcBinding);
	 }

	/**
	 * get method for field srcBinding
	 * Prototype: uint32_t  srcBinding
	 */ 
	 public int srcBinding(){
		 // return  this.srcBinding;
		 return srcBinding0(super.ptr);
	 }

	/**
	 * Set method for field srcArrayElement
	 * Prototype: uint32_t  srcArrayElement
	 */ 
	 public void srcArrayElement(int srcArrayElement){
		 this.srcArrayElement = srcArrayElement;
		srcArrayElement0(super.ptr, srcArrayElement);
	 }

	/**
	 * get method for field srcArrayElement
	 * Prototype: uint32_t  srcArrayElement
	 */ 
	 public int srcArrayElement(){
		 // return  this.srcArrayElement;
		 return srcArrayElement0(super.ptr);
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


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field srcSet
	 * Prototype: VkDescriptorSet  srcSet
	 */ 
	 private static native void srcSet0(ByteBuffer ptr, VkDescriptorSet _srcSet);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(*ptr);
		  _obj.srcSet = (VkDescriptorSet) (_srcSet);
	  */

	/**
	 * get method for field srcSet
	 * Prototype: VkDescriptorSet  srcSet
	 */ 
	 private static native VkDescriptorSet srcSet0(ByteBuffer ptr);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(ptr);
		  return (VkDescriptorSet) (_obj.VkDescriptorSet);
	 */

	/**
	 * native Set method for field srcBinding
	 * Prototype: uint32_t  srcBinding
	 */ 
	 private static native void srcBinding0(ByteBuffer ptr, int _srcBinding);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(*ptr);
		  _obj.srcBinding = (uint32_t) (_srcBinding);
	  */

	/**
	 * get method for field srcBinding
	 * Prototype: uint32_t  srcBinding
	 */ 
	 private static native int srcBinding0(ByteBuffer ptr);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field srcArrayElement
	 * Prototype: uint32_t  srcArrayElement
	 */ 
	 private static native void srcArrayElement0(ByteBuffer ptr, int _srcArrayElement);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(*ptr);
		  _obj.srcArrayElement = (uint32_t) (_srcArrayElement);
	  */

	/**
	 * get method for field srcArrayElement
	 * Prototype: uint32_t  srcArrayElement
	 */ 
	 private static native int srcArrayElement0(ByteBuffer ptr);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field dstSet
	 * Prototype: VkDescriptorSet  dstSet
	 */ 
	 private static native void dstSet0(ByteBuffer ptr, VkDescriptorSet _dstSet);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(*ptr);
		  _obj.dstSet = (VkDescriptorSet) (_dstSet);
	  */

	/**
	 * get method for field dstSet
	 * Prototype: VkDescriptorSet  dstSet
	 */ 
	 private static native VkDescriptorSet dstSet0(ByteBuffer ptr);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(ptr);
		  return (VkDescriptorSet) (_obj.VkDescriptorSet);
	 */

	/**
	 * native Set method for field dstBinding
	 * Prototype: uint32_t  dstBinding
	 */ 
	 private static native void dstBinding0(ByteBuffer ptr, int _dstBinding);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(*ptr);
		  _obj.dstBinding = (uint32_t) (_dstBinding);
	  */

	/**
	 * get method for field dstBinding
	 * Prototype: uint32_t  dstBinding
	 */ 
	 private static native int dstBinding0(ByteBuffer ptr);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field dstArrayElement
	 * Prototype: uint32_t  dstArrayElement
	 */ 
	 private static native void dstArrayElement0(ByteBuffer ptr, int _dstArrayElement);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(*ptr);
		  _obj.dstArrayElement = (uint32_t) (_dstArrayElement);
	  */

	/**
	 * get method for field dstArrayElement
	 * Prototype: uint32_t  dstArrayElement
	 */ 
	 private static native int dstArrayElement0(ByteBuffer ptr);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field descriptorCount
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native void descriptorCount0(ByteBuffer ptr, int _descriptorCount);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(*ptr);
		  _obj.descriptorCount = (uint32_t) (_descriptorCount);
	  */

	/**
	 * get method for field descriptorCount
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native int descriptorCount0(ByteBuffer ptr);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkCopyDescriptorSet
