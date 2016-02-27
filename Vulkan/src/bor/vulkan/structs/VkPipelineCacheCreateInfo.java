// class wrapping Vulkan's VkPipelineCacheCreateInfo struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkPipelineCacheCreateInfo 
 * @Author Alessandro Borges 
 */
public class VkPipelineCacheCreateInfo extends VkStruct {
	/** ID of this structure [45]  */
	 public static final int TAG = VKPIPELINECACHECREATEINFO_ID;

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
	 *  VkPipelineCacheCreateFlags 	flags 
	 */ 
	int 	flags;

	/**
	 *  size_t 	initialDataSize 
	 */ 
	long 	initialDataSize;

	/**
	 *  const void* 	pInitialData 
	 */ 
	const void* 	pInitialData;

	/**
	 * Ctor
	 */
	public VkPipelineCacheCreateInfo(){ 
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
	 * Set method for field flags
	 * Prototype: VkPipelineCacheCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkPipelineCacheCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field initialDataSize
	 * Prototype: size_t  initialDataSize
	 */ 
	 public void initialDataSize(long initialDataSize){
		 this.initialDataSize = initialDataSize;
		initialDataSize0(super.ptr, initialDataSize);
	 }

	/**
	 * get method for field initialDataSize
	 * Prototype: size_t  initialDataSize
	 */ 
	 public long initialDataSize(){
		 // return  this.initialDataSize;
		 return initialDataSize0(super.ptr);
	 }

	/**
	 * Set method for field pInitialData
	 * Prototype: const void*  pInitialData
	 */ 
	 public void pInitialData(const void* pInitialData){
		 this.pInitialData = pInitialData;
		pInitialData0(super.ptr, pInitialData);
	 }

	/**
	 * get method for field pInitialData
	 * Prototype: const void*  pInitialData
	 */ 
	 public const void* pInitialData(){
		 // return  this.pInitialData;
		 return pInitialData0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkPipelineCacheCreateInfo _obj = (VkPipelineCacheCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkPipelineCacheCreateInfo _obj = (VkPipelineCacheCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkPipelineCacheCreateInfo _obj = (VkPipelineCacheCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkPipelineCacheCreateInfo _obj = (VkPipelineCacheCreateInfo)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkPipelineCacheCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkPipelineCacheCreateInfo _obj = (VkPipelineCacheCreateInfo)(*ptr);
		  _obj.flags = (VkPipelineCacheCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkPipelineCacheCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkPipelineCacheCreateInfo _obj = (VkPipelineCacheCreateInfo)(ptr);
		  return (jint) (_obj.VkPipelineCacheCreateFlags);
	 */

	/**
	 * native Set method for field initialDataSize
	 * Prototype: size_t  initialDataSize
	 */ 
	 private static native void initialDataSize0(ByteBuffer ptr, long _initialDataSize);/*
		  VkPipelineCacheCreateInfo _obj = (VkPipelineCacheCreateInfo)(*ptr);
		  _obj.initialDataSize = (size_t) (_initialDataSize);
	  */

	/**
	 * get method for field initialDataSize
	 * Prototype: size_t  initialDataSize
	 */ 
	 private static native long initialDataSize0(ByteBuffer ptr);/*
		  VkPipelineCacheCreateInfo _obj = (VkPipelineCacheCreateInfo)(ptr);
		  return (jlong) (_obj.size_t);
	 */

	/**
	 * native Set method for field pInitialData
	 * Prototype: const void*  pInitialData
	 */ 
	 private static native void pInitialData0(ByteBuffer ptr, const void* _pInitialData);/*
		  VkPipelineCacheCreateInfo _obj = (VkPipelineCacheCreateInfo)(*ptr);
		  _obj.pInitialData = (const void*) (_pInitialData);
	  */

	/**
	 * get method for field pInitialData
	 * Prototype: const void*  pInitialData
	 */ 
	 private static native const void* pInitialData0(ByteBuffer ptr);/*
		  VkPipelineCacheCreateInfo _obj = (VkPipelineCacheCreateInfo)(ptr);
		  return (const void*) (_obj.const void*);
	 */



} // end of class VkPipelineCacheCreateInfo
