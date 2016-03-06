/**
 * Class wrapping Vulkan's VkDescriptorPoolCreateInfo struct.
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
 *  This class is a Java front end for struct VkDescriptorPoolCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDescriptorPoolCreateInfo {
 *     VkStructureType                sType;
 *     const void*                    pNext;
 *     VkDescriptorPoolCreateFlags    flags;
 *     uint32_t                       maxSets;
 *     uint32_t                       poolSizeCount;
 *     const VkDescriptorPoolSize*    pPoolSizes;
 * } VkDescriptorPoolCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkDescriptorPoolCreateInfo extends VkStruct {
	/** TAG of this structure [74]  */
	 private static final String TAG = "VkDescriptorPoolCreateInfo";

	/** ID of this structure [74]  */
	 public static final int TAG_ID = VKDESCRIPTORPOOLCREATEINFO_ID;

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
	 *  VkDescriptorPoolCreateFlags 	flags	[int]
	 */ 
	int 	flags;

	/**
	 *  uint32_t 	maxSets	[int]
	 */ 
	int 	maxSets;

	/**
	 *  uint32_t 	poolSizeCount	[int]
	 */ 
	int 	poolSizeCount;

	/**
	 *  const VkDescriptorPoolSize* 	pPoolSizes	[p]
	 */ 
	P<VkDescriptorPoolSize>  	pPoolSizes;

	/**
	 * Ctor
	 */
	public VkDescriptorPoolCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDescriptorPoolCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkDescriptorPoolCreateInfo(long address, int memSize){ 
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
	 public static P<VkDescriptorPoolCreateInfo> createNullPointer(){
	        P<VkDescriptorPoolCreateInfo> p = new  P<VkDescriptorPoolCreateInfo>(new VkDescriptorPoolCreateInfo());
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
	 * Prototype: VkDescriptorPoolCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkDescriptorPoolCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field maxSets	[int]<br>
	 * Prototype: uint32_t  maxSets
	 */ 
	 public void maxSets(int maxSets){
		 this.maxSets = maxSets;
		maxSets0(super.ptr, maxSets);
	 }

	/**
	 * get method for field maxSets	[int]<br>
	 * Prototype: uint32_t  maxSets
	 */ 
	 public int maxSets(){
		 // return  this.maxSets;
		 return maxSets0(super.ptr);
	 }

	/**
	 * Set method for field poolSizeCount	[int]<br>
	 * Prototype: uint32_t  poolSizeCount
	 */ 
	 public void poolSizeCount(int poolSizeCount){
		 this.poolSizeCount = poolSizeCount;
		poolSizeCount0(super.ptr, poolSizeCount);
	 }

	/**
	 * get method for field poolSizeCount	[int]<br>
	 * Prototype: uint32_t  poolSizeCount
	 */ 
	 public int poolSizeCount(){
		 // return  this.poolSizeCount;
		 return poolSizeCount0(super.ptr);
	 }

	/**
	 * Set method for field pPoolSizes	[p]<br>
	 * Prototype: const VkDescriptorPoolSize*  pPoolSizes
	 */ 
	 public void pPoolSizes(P<VkDescriptorPoolSize>  pPoolSizes){
		 this.pPoolSizes = pPoolSizes;
		pPoolSizes0(super.ptr, pPoolSizes);
	 }

	/**
	 * get method for field pPoolSizes	[p]<br>
	 * Prototype: const VkDescriptorPoolSize*  pPoolSizes
	 */ 
	 public P<VkDescriptorPoolSize>  pPoolSizes(){
		 // return  this.pPoolSizes;
		 return pPoolSizes0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkDescriptorPoolCreateInfo _obj = (VkDescriptorPoolCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkDescriptorPoolCreateInfo _obj = (VkDescriptorPoolCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkDescriptorPoolCreateInfo _obj = (VkDescriptorPoolCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkDescriptorPoolCreateInfo _obj = (VkDescriptorPoolCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkDescriptorPoolCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkDescriptorPoolCreateInfo _obj = (VkDescriptorPoolCreateInfo)(*ptr);
		  _obj.flags = (VkDescriptorPoolCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkDescriptorPoolCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkDescriptorPoolCreateInfo _obj = (VkDescriptorPoolCreateInfo)(ptr);
		  return (jint) (_obj.VkDescriptorPoolCreateFlags);
	 */

	/**
	 * native SET method for field maxSets	[int]<br>
	 * Prototype: uint32_t  maxSets
	 */ 
	 private static native void maxSets0(ByteBuffer ptr, int _maxSets);/*
		  VkDescriptorPoolCreateInfo _obj = (VkDescriptorPoolCreateInfo)(*ptr);
		  _obj.maxSets = (uint32_t) (_maxSets);
	  */

	/**
	 * native GET method for field maxSets	[int]<br>
	 * Prototype: uint32_t  maxSets
	 */ 
	 private static native int maxSets0(ByteBuffer ptr);/*
		  VkDescriptorPoolCreateInfo _obj = (VkDescriptorPoolCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field poolSizeCount	[int]<br>
	 * Prototype: uint32_t  poolSizeCount
	 */ 
	 private static native void poolSizeCount0(ByteBuffer ptr, int _poolSizeCount);/*
		  VkDescriptorPoolCreateInfo _obj = (VkDescriptorPoolCreateInfo)(*ptr);
		  _obj.poolSizeCount = (uint32_t) (_poolSizeCount);
	  */

	/**
	 * native GET method for field poolSizeCount	[int]<br>
	 * Prototype: uint32_t  poolSizeCount
	 */ 
	 private static native int poolSizeCount0(ByteBuffer ptr);/*
		  VkDescriptorPoolCreateInfo _obj = (VkDescriptorPoolCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field pPoolSizes	[p]<br>
	 * Prototype: const VkDescriptorPoolSize*  pPoolSizes
	 */ 
	 private static native void pPoolSizes0(ByteBuffer ptr, P<VkDescriptorPoolSize>  _pPoolSizes);/*
		  VkDescriptorPoolCreateInfo _obj = (VkDescriptorPoolCreateInfo)(*ptr);
		  _obj.pPoolSizes = (const VkDescriptorPoolSize*) (_pPoolSizes);
	  */

	/**
	 * native GET method for field pPoolSizes	[p]<br>
	 * Prototype: const VkDescriptorPoolSize*  pPoolSizes
	 */ 
	 private static native P<VkDescriptorPoolSize>  pPoolSizes0(ByteBuffer ptr);/*
		  VkDescriptorPoolCreateInfo _obj = (VkDescriptorPoolCreateInfo)(ptr);
		  return (P<VkDescriptorPoolSize> ) (_obj.const VkDescriptorPoolSize*);
	 */



} // end of class VkDescriptorPoolCreateInfo
