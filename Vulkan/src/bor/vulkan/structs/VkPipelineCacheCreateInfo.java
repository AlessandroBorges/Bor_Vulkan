/**
 * Class wrapping Vulkan's VkPipelineCacheCreateInfo struct.
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
 *  This class is a Java front end for struct VkPipelineCacheCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPipelineCacheCreateInfo {
 *     VkStructureType               sType;
 *     const void*                   pNext;
 *     VkPipelineCacheCreateFlags    flags;
 *     size_t                        initialDataSize;
 *     const void*                   pInitialData;
 * } VkPipelineCacheCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkPipelineCacheCreateInfo extends VkStruct {
	/** TAG of this structure [45]  */
	 private static final String TAG = "VkPipelineCacheCreateInfo";

	/** ID of this structure [45]  */
	 public static final int TAG_ID = VKPIPELINECACHECREATEINFO_ID;

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
	 *  VkPipelineCacheCreateFlags 	flags	[int]
	 */ 
	int 	flags;

	/**
	 *  size_t 	initialDataSize	[long]
	 */ 
	long 	initialDataSize;

	/**
	 *  const void* 	pInitialData	[buffer]
	 */ 
	java.nio.Buffer 	pInitialData;

	/**
	 * Ctor
	 */
	public VkPipelineCacheCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineCacheCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkPipelineCacheCreateInfo(long address, int memSize){ 
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
	 public static P<VkPipelineCacheCreateInfo> createNullPointer(){
	        P<VkPipelineCacheCreateInfo> p = new  P<VkPipelineCacheCreateInfo>(new VkPipelineCacheCreateInfo());
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
	 * Prototype: VkPipelineCacheCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkPipelineCacheCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field initialDataSize	[long]<br>
	 * Prototype: size_t  initialDataSize
	 */ 
	 public void initialDataSize(long initialDataSize){
		 this.initialDataSize = initialDataSize;
		initialDataSize0(super.ptr, initialDataSize);
	 }

	/**
	 * get method for field initialDataSize	[long]<br>
	 * Prototype: size_t  initialDataSize
	 */ 
	 public long initialDataSize(){
		 // return  this.initialDataSize;
		 return initialDataSize0(super.ptr);
	 }

	/**
	 * Set method for field pInitialData	[buffer]<br>
	 * Prototype: const void*  pInitialData
	 */ 
	 public void pInitialData(java.nio.Buffer pInitialData){
		 this.pInitialData = pInitialData;
		pInitialData0(super.ptr, pInitialData);
	 }

	/**
	 * get method for field pInitialData	[buffer]<br>
	 * Prototype: const void*  pInitialData
	 */ 
	 public java.nio.Buffer pInitialData(){
		 // return  this.pInitialData;
		 return pInitialData0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkPipelineCacheCreateInfo _obj = (VkPipelineCacheCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkPipelineCacheCreateInfo _obj = (VkPipelineCacheCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkPipelineCacheCreateInfo _obj = (VkPipelineCacheCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkPipelineCacheCreateInfo _obj = (VkPipelineCacheCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineCacheCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkPipelineCacheCreateInfo _obj = (VkPipelineCacheCreateInfo)(*ptr);
		  _obj.flags = (VkPipelineCacheCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineCacheCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkPipelineCacheCreateInfo _obj = (VkPipelineCacheCreateInfo)(ptr);
		  return (jint) (_obj.VkPipelineCacheCreateFlags);
	 */

	/**
	 * native SET method for field initialDataSize	[long]<br>
	 * Prototype: size_t  initialDataSize
	 */ 
	 private static native void initialDataSize0(ByteBuffer ptr, long _initialDataSize);/*
		  VkPipelineCacheCreateInfo _obj = (VkPipelineCacheCreateInfo)(*ptr);
		  _obj.initialDataSize = (size_t) (_initialDataSize);
	  */

	/**
	 * native GET method for field initialDataSize	[long]<br>
	 * Prototype: size_t  initialDataSize
	 */ 
	 private static native long initialDataSize0(ByteBuffer ptr);/*
		  VkPipelineCacheCreateInfo _obj = (VkPipelineCacheCreateInfo)(ptr);
		  return (jlong) (_obj.size_t);
	 */

	/**
	 * native SET method for field pInitialData	[buffer]<br>
	 * Prototype: const void*  pInitialData
	 */ 
	 private static native void pInitialData0(ByteBuffer ptr, java.nio.Buffer _pInitialData);/*
		  VkPipelineCacheCreateInfo _obj = (VkPipelineCacheCreateInfo)(*ptr);
		  _obj.pInitialData = (const void*) (_pInitialData);
	  */

	/**
	 * native GET method for field pInitialData	[buffer]<br>
	 * Prototype: const void*  pInitialData
	 */ 
	 private static native java.nio.Buffer pInitialData0(ByteBuffer ptr);/*
		  VkPipelineCacheCreateInfo _obj = (VkPipelineCacheCreateInfo)(ptr);
		  return (java.nio.Buffer) (_obj.const void*);
	 */



} // end of class VkPipelineCacheCreateInfo
