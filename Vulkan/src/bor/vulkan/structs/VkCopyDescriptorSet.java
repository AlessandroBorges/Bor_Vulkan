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
	/** TAG of this structure [79]  */
	 private static final String TAG = "VkCopyDescriptorSet";

	/** ID of this structure [79]  */
	 public static final int TAG_ID = VKCOPYDESCRIPTORSET_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType	[vkenum]
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext	[p]
	 */ 
	P<VkObject> 	pNext;

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
		 super(sizeOf()); 
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
	 public VkCopyDescriptorSet(long address, int memSize){ 
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
	 public static P<VkCopyDescriptorSet> createNullPointer(){
	        P<VkCopyDescriptorSet> p = new  P<VkCopyDescriptorSet>(new VkCopyDescriptorSet());
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
	 * Set method for field srcSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  srcSet
	 */ 
	 public void srcSet(VkDescriptorSet srcSet){
		 this.srcSet = srcSet;
		srcSet0(super.ptr, srcSet);
	 }

	/**
	 * get method for field srcSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  srcSet
	 */ 
	 public VkDescriptorSet srcSet(){
		 // return  this.srcSet;
		 return srcSet0(super.ptr);
	 }

	/**
	 * Set method for field srcBinding	[int]<br>
	 * Prototype: uint32_t  srcBinding
	 */ 
	 public void srcBinding(int srcBinding){
		 this.srcBinding = srcBinding;
		srcBinding0(super.ptr, srcBinding);
	 }

	/**
	 * get method for field srcBinding	[int]<br>
	 * Prototype: uint32_t  srcBinding
	 */ 
	 public int srcBinding(){
		 // return  this.srcBinding;
		 return srcBinding0(super.ptr);
	 }

	/**
	 * Set method for field srcArrayElement	[int]<br>
	 * Prototype: uint32_t  srcArrayElement
	 */ 
	 public void srcArrayElement(int srcArrayElement){
		 this.srcArrayElement = srcArrayElement;
		srcArrayElement0(super.ptr, srcArrayElement);
	 }

	/**
	 * get method for field srcArrayElement	[int]<br>
	 * Prototype: uint32_t  srcArrayElement
	 */ 
	 public int srcArrayElement(){
		 // return  this.srcArrayElement;
		 return srcArrayElement0(super.ptr);
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


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field srcSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  srcSet
	 */ 
	 private static native void srcSet0(ByteBuffer ptr, VkDescriptorSet _srcSet);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(*ptr);
		  _obj.srcSet = (VkDescriptorSet) (_srcSet);
	  */

	/**
	 * native GET method for field srcSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  srcSet
	 */ 
	 private static native VkDescriptorSet srcSet0(ByteBuffer ptr);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(ptr);
		  return (VkDescriptorSet) (_obj.VkDescriptorSet);
	 */

	/**
	 * native SET method for field srcBinding	[int]<br>
	 * Prototype: uint32_t  srcBinding
	 */ 
	 private static native void srcBinding0(ByteBuffer ptr, int _srcBinding);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(*ptr);
		  _obj.srcBinding = (uint32_t) (_srcBinding);
	  */

	/**
	 * native GET method for field srcBinding	[int]<br>
	 * Prototype: uint32_t  srcBinding
	 */ 
	 private static native int srcBinding0(ByteBuffer ptr);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field srcArrayElement	[int]<br>
	 * Prototype: uint32_t  srcArrayElement
	 */ 
	 private static native void srcArrayElement0(ByteBuffer ptr, int _srcArrayElement);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(*ptr);
		  _obj.srcArrayElement = (uint32_t) (_srcArrayElement);
	  */

	/**
	 * native GET method for field srcArrayElement	[int]<br>
	 * Prototype: uint32_t  srcArrayElement
	 */ 
	 private static native int srcArrayElement0(ByteBuffer ptr);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field dstSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  dstSet
	 */ 
	 private static native void dstSet0(ByteBuffer ptr, VkDescriptorSet _dstSet);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(*ptr);
		  _obj.dstSet = (VkDescriptorSet) (_dstSet);
	  */

	/**
	 * native GET method for field dstSet	[vkhandle]<br>
	 * Prototype: VkDescriptorSet  dstSet
	 */ 
	 private static native VkDescriptorSet dstSet0(ByteBuffer ptr);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(ptr);
		  return (VkDescriptorSet) (_obj.VkDescriptorSet);
	 */

	/**
	 * native SET method for field dstBinding	[int]<br>
	 * Prototype: uint32_t  dstBinding
	 */ 
	 private static native void dstBinding0(ByteBuffer ptr, int _dstBinding);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(*ptr);
		  _obj.dstBinding = (uint32_t) (_dstBinding);
	  */

	/**
	 * native GET method for field dstBinding	[int]<br>
	 * Prototype: uint32_t  dstBinding
	 */ 
	 private static native int dstBinding0(ByteBuffer ptr);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field dstArrayElement	[int]<br>
	 * Prototype: uint32_t  dstArrayElement
	 */ 
	 private static native void dstArrayElement0(ByteBuffer ptr, int _dstArrayElement);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(*ptr);
		  _obj.dstArrayElement = (uint32_t) (_dstArrayElement);
	  */

	/**
	 * native GET method for field dstArrayElement	[int]<br>
	 * Prototype: uint32_t  dstArrayElement
	 */ 
	 private static native int dstArrayElement0(ByteBuffer ptr);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native void descriptorCount0(ByteBuffer ptr, int _descriptorCount);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(*ptr);
		  _obj.descriptorCount = (uint32_t) (_descriptorCount);
	  */

	/**
	 * native GET method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native int descriptorCount0(ByteBuffer ptr);/*
		  VkCopyDescriptorSet _obj = (VkCopyDescriptorSet)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkCopyDescriptorSet
