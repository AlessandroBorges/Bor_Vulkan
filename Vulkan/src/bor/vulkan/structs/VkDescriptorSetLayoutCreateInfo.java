/**
 * Class wrapping Vulkan's VkDescriptorSetLayoutCreateInfo struct.
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
 *  This class is a Java front end for struct VkDescriptorSetLayoutCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDescriptorSetLayoutCreateInfo {
 *     VkStructureType                        sType;
 *     const void*                            pNext;
 *     VkDescriptorSetLayoutCreateFlags       flags;
 *     uint32_t                               bindingCount;
 *     const VkDescriptorSetLayoutBinding*    pBindings;
 * } VkDescriptorSetLayoutCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkDescriptorSetLayoutCreateInfo extends VkStruct {
	/** TAG of this structure [72]  */
	 private static final String TAG = "VkDescriptorSetLayoutCreateInfo";

	/** ID of this structure [72]  */
	 public static final int TAG_ID = VKDESCRIPTORSETLAYOUTCREATEINFO_ID;

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
	 *  VkDescriptorSetLayoutCreateFlags 	flags	[int]
	 */ 
	int 	flags;

	/**
	 *  uint32_t 	bindingCount	[int]
	 */ 
	int 	bindingCount;

	/**
	 *  const VkDescriptorSetLayoutBinding* 	pBindings	[p]
	 */ 
	P<VkDescriptorSetLayoutBinding>  	pBindings;

	/**
	 * Ctor
	 */
	public VkDescriptorSetLayoutCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDescriptorSetLayoutCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkDescriptorSetLayoutCreateInfo(long address, int memSize){ 
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
	 public static P<VkDescriptorSetLayoutCreateInfo> createNullPointer(){
	        P<VkDescriptorSetLayoutCreateInfo> p = new  P<VkDescriptorSetLayoutCreateInfo>(new VkDescriptorSetLayoutCreateInfo());
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
	 * Set method for field flags	[int]<br>
	 * Prototype: VkDescriptorSetLayoutCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkDescriptorSetLayoutCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field bindingCount	[int]<br>
	 * Prototype: uint32_t  bindingCount
	 */ 
	 public void bindingCount(int bindingCount){
		 this.bindingCount = bindingCount;
		bindingCount0(super.ptr, bindingCount);
	 }

	/**
	 * get method for field bindingCount	[int]<br>
	 * Prototype: uint32_t  bindingCount
	 */ 
	 public int bindingCount(){
		 // return  this.bindingCount;
		 return bindingCount0(super.ptr);
	 }

	/**
	 * Set method for field pBindings	[p]<br>
	 * Prototype: const VkDescriptorSetLayoutBinding*  pBindings
	 */ 
	 public void pBindings(P<VkDescriptorSetLayoutBinding>  pBindings){
		 this.pBindings = pBindings;
		pBindings0(super.ptr, pBindings);
	 }

	/**
	 * get method for field pBindings	[p]<br>
	 * Prototype: const VkDescriptorSetLayoutBinding*  pBindings
	 */ 
	 public P<VkDescriptorSetLayoutBinding>  pBindings(){
		 // return  this.pBindings;
		 return pBindings0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkDescriptorSetLayoutCreateInfo _obj = (VkDescriptorSetLayoutCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkDescriptorSetLayoutCreateInfo _obj = (VkDescriptorSetLayoutCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkDescriptorSetLayoutCreateInfo _obj = (VkDescriptorSetLayoutCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkDescriptorSetLayoutCreateInfo _obj = (VkDescriptorSetLayoutCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkDescriptorSetLayoutCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkDescriptorSetLayoutCreateInfo _obj = (VkDescriptorSetLayoutCreateInfo)(*ptr);
		  _obj.flags = (VkDescriptorSetLayoutCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkDescriptorSetLayoutCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkDescriptorSetLayoutCreateInfo _obj = (VkDescriptorSetLayoutCreateInfo)(ptr);
		  return (jint) (_obj.VkDescriptorSetLayoutCreateFlags);
	 */

	/**
	 * native SET method for field bindingCount	[int]<br>
	 * Prototype: uint32_t  bindingCount
	 */ 
	 private static native void bindingCount0(ByteBuffer ptr, int _bindingCount);/*
		  VkDescriptorSetLayoutCreateInfo _obj = (VkDescriptorSetLayoutCreateInfo)(*ptr);
		  _obj.bindingCount = (uint32_t) (_bindingCount);
	  */

	/**
	 * native GET method for field bindingCount	[int]<br>
	 * Prototype: uint32_t  bindingCount
	 */ 
	 private static native int bindingCount0(ByteBuffer ptr);/*
		  VkDescriptorSetLayoutCreateInfo _obj = (VkDescriptorSetLayoutCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field pBindings	[p]<br>
	 * Prototype: const VkDescriptorSetLayoutBinding*  pBindings
	 */ 
	 private static native void pBindings0(ByteBuffer ptr, P<VkDescriptorSetLayoutBinding>  _pBindings);/*
		  VkDescriptorSetLayoutCreateInfo _obj = (VkDescriptorSetLayoutCreateInfo)(*ptr);
		  _obj.pBindings = (const VkDescriptorSetLayoutBinding*) (_pBindings);
	  */

	/**
	 * native GET method for field pBindings	[p]<br>
	 * Prototype: const VkDescriptorSetLayoutBinding*  pBindings
	 */ 
	 private static native P<VkDescriptorSetLayoutBinding>  pBindings0(ByteBuffer ptr);/*
		  VkDescriptorSetLayoutCreateInfo _obj = (VkDescriptorSetLayoutCreateInfo)(ptr);
		  return (P<VkDescriptorSetLayoutBinding> ) (_obj.const VkDescriptorSetLayoutBinding*);
	 */



} // end of class VkDescriptorSetLayoutCreateInfo
