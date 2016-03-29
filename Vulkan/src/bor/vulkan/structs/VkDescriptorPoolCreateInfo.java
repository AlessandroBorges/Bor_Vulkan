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

import java.nio.Buffer;


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

	/** P wrapper for THIS object */
	 private  P<VkDescriptorPoolCreateInfo> p;

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
	 *  const VkDescriptorPoolSize* 	pPoolSizes	[vkstruct]
	 */ 
	  VkDescriptorPoolSize  	pPoolSizes;

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


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkDescriptorPoolCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkDescriptorPoolCreateInfo> (this);
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
		 sType0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = sType0(super.ptr);
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
		 pNext0(this.ptr, buff);
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 ByteBuffer pointer = pNext0(super.ptr);
		 if(pointer == null){
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
	 * Set method for field flags	[int]<br>
	 * Prototype: VkDescriptorPoolCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 flags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkDescriptorPoolCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = flags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field maxSets	[int]<br>
	 * Prototype: uint32_t  maxSets
	 */ 
	 public void maxSets(int maxSets){
		 this.maxSets = maxSets;
		 maxSets0(this.ptr,  maxSets);
	 }

	/**
	 * Get method for field maxSets	[int]<br>
	 * Prototype: uint32_t  maxSets
	 */ 
	 public int maxSets(){
		 int var = maxSets0(super.ptr);
		 this.maxSets = var;
		 return this.maxSets;
	 }

	/**
	 * Set method for field poolSizeCount	[int]<br>
	 * Prototype: uint32_t  poolSizeCount
	 */ 
	 public void poolSizeCount(int poolSizeCount){
		 this.poolSizeCount = poolSizeCount;
		 poolSizeCount0(this.ptr,  poolSizeCount);
	 }

	/**
	 * Get method for field poolSizeCount	[int]<br>
	 * Prototype: uint32_t  poolSizeCount
	 */ 
	 public int poolSizeCount(){
		 int var = poolSizeCount0(super.ptr);
		 this.poolSizeCount = var;
		 return this.poolSizeCount;
	 }

	/**
	 * Set method for field pPoolSizes	[vkstruct]<br>
	 * Prototype: const VkDescriptorPoolSize*  pPoolSizes
	 */ 
	 public void pPoolSizes( VkDescriptorPoolSize  pPoolSizes){
		 this.pPoolSizes = pPoolSizes;
		 ByteBuffer buff = (pPoolSizes==null) ? null : pPoolSizes.getPointerStruct();
		 pPoolSizes0(this.ptr, buff);
	 }

	/**
	 * Get method for field pPoolSizes	[vkstruct]<br>
	 * Prototype: const VkDescriptorPoolSize*  pPoolSizes
	 */ 
	 public  VkDescriptorPoolSize  pPoolSizes(){
		 ByteBuffer pointer = pPoolSizes0(super.ptr);
		 if(pointer == null){
		    this.pPoolSizes = null;
		    return null;
		  } else 
 		 if(this.pPoolSizes == null){
		    this.pPoolSizes = new  VkDescriptorPoolSize (pointer);
		 }else{
		    this.pPoolSizes.setPointer(pointer);
		  }
		 return this.pPoolSizes;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkDescriptorPoolCreateInfo vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkDescriptorPoolCreateInfo vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkDescriptorPoolCreateFlags  flags
	 */ 
	 private static native void flags0(Buffer ptr, int _flags);/*
		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		  vkObj->flags = (VkDescriptorPoolCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkDescriptorPoolCreateFlags  flags
	 */ 
	 private static native int flags0(Buffer ptr);/*
		  VkDescriptorPoolCreateInfo vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field maxSets	[int]<br>
	 * Prototype: uint32_t  maxSets
	 */ 
	 private static native void maxSets0(Buffer ptr, int _maxSets);/*
		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		  vkObj->maxSets = (uint32_t) (_maxSets);
	  */

	/**
	 * native GET method for field maxSets	[int]<br>
	 * Prototype: uint32_t  maxSets
	 */ 
	 private static native int maxSets0(Buffer ptr);/*
		  VkDescriptorPoolCreateInfo vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		  return (jint) (vkObj->maxSets);
	 */

	/**
	 * native SET method for field poolSizeCount	[int]<br>
	 * Prototype: uint32_t  poolSizeCount
	 */ 
	 private static native void poolSizeCount0(Buffer ptr, int _poolSizeCount);/*
		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		  vkObj->poolSizeCount = (uint32_t) (_poolSizeCount);
	  */

	/**
	 * native GET method for field poolSizeCount	[int]<br>
	 * Prototype: uint32_t  poolSizeCount
	 */ 
	 private static native int poolSizeCount0(Buffer ptr);/*
		  VkDescriptorPoolCreateInfo vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		  return (jint) (vkObj->poolSizeCount);
	 */

	/**
	 * native SET method for field pPoolSizes	[vkstruct]<br>
	 * Prototype: const VkDescriptorPoolSize*  pPoolSizes
	 */ 
	 private static native void pPoolSizes0(Buffer ptr, java.nio.ByteBuffer  _pPoolSizes);/*
		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		  vkObj->pPoolSizes = (const VkDescriptorPoolSize*) (_pPoolSizes);
	  */

	/**
	 * native GET method for field pPoolSizes	[vkstruct]<br>
	 * Prototype: const VkDescriptorPoolSize*  pPoolSizes
	 */ 
	 private static native java.nio.ByteBuffer  pPoolSizes0(Buffer ptr);/*
		  VkDescriptorPoolCreateInfo vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		  return ( VkDescriptorPoolSize ) (vkObj->pPoolSizes);
	 */



} // end of class VkDescriptorPoolCreateInfo
