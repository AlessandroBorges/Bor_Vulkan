/**
 * Class wrapping Vulkan's VkDeviceQueueCreateInfo struct.
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
 *  This class is a Java front end for struct VkDeviceQueueCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDeviceQueueCreateInfo {
 *     VkStructureType             sType;
 *     const void*                 pNext;
 *     VkDeviceQueueCreateFlags    flags;
 *     uint32_t                    queueFamilyIndex;
 *     uint32_t                    queueCount;
 *     const float*                pQueuePriorities;
 * } VkDeviceQueueCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkDeviceQueueCreateInfo extends VkStruct {
	/** TAG of this structure [15]  */
	 private static final String TAG = "VkDeviceQueueCreateInfo";

	/** ID of this structure [15]  */
	 public static final int TAG_ID = VKDEVICEQUEUECREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkDeviceQueueCreateInfo> p;

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
	 *  VkDeviceQueueCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  uint32_t 	queueFamilyIndex	[int]
	 */ 
	 int 	queueFamilyIndex;

	/**
	 *  uint32_t 	queueCount	[int]
	 */ 
	 int 	queueCount;

	/**
	 *  const float* 	pQueuePriorities	[float_array]
	 */ 
	 float[] 	pQueuePriorities;

	/**
	 * Ctor
	 */
	public VkDeviceQueueCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDeviceQueueCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkDeviceQueueCreateInfo(long address, int memSize){ 
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
	 public static P<VkDeviceQueueCreateInfo> createNullPointer(){
	        P<VkDeviceQueueCreateInfo> p = new  P<VkDeviceQueueCreateInfo>(new VkDeviceQueueCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkDeviceQueueCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkDeviceQueueCreateInfo> (this);
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
	 * Prototype: VkDeviceQueueCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 flags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkDeviceQueueCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = flags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field queueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndex
	 */ 
	 public void queueFamilyIndex(int queueFamilyIndex){
		 this.queueFamilyIndex = queueFamilyIndex;
		 queueFamilyIndex0(this.ptr,  queueFamilyIndex);
	 }

	/**
	 * Get method for field queueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndex
	 */ 
	 public int queueFamilyIndex(){
		 int var = queueFamilyIndex0(super.ptr);
		 this.queueFamilyIndex = var;
		 return this.queueFamilyIndex;
	 }

	/**
	 * Set method for field queueCount	[int]<br>
	 * Prototype: uint32_t  queueCount
	 */ 
	 public void queueCount(int queueCount){
		 this.queueCount = queueCount;
		 queueCount0(this.ptr,  queueCount);
	 }

	/**
	 * Get method for field queueCount	[int]<br>
	 * Prototype: uint32_t  queueCount
	 */ 
	 public int queueCount(){
		 int var = queueCount0(super.ptr);
		 this.queueCount = var;
		 return this.queueCount;
	 }

	/**
	 * Set method for field pQueuePriorities	[float_array]<br>
	 * Prototype: const float*  pQueuePriorities
	 */ 
	 public void pQueuePriorities(float[] pQueuePriorities){
		 this.pQueuePriorities = pQueuePriorities;
		 pQueuePriorities0(this.ptr,  pQueuePriorities);
	 }

	/**
	 * Get method for field pQueuePriorities	[float_array]<br>
	 * Prototype: const float*  pQueuePriorities
	 */ 
	 public float[] pQueuePriorities(){
		 float[] var = pQueuePriorities0(super.ptr);
		 this.pQueuePriorities = var;
		 return this.pQueuePriorities;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkDeviceQueueCreateInfo vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkDeviceQueueCreateInfo vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkDeviceQueueCreateFlags  flags
	 */ 
	 private static native void flags0(Buffer ptr, int _flags);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  vkObj->flags = (VkDeviceQueueCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkDeviceQueueCreateFlags  flags
	 */ 
	 private static native int flags0(Buffer ptr);/*
		  VkDeviceQueueCreateInfo vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field queueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndex
	 */ 
	 private static native void queueFamilyIndex0(Buffer ptr, int _queueFamilyIndex);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  vkObj->queueFamilyIndex = (uint32_t) (_queueFamilyIndex);
	  */

	/**
	 * native GET method for field queueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndex
	 */ 
	 private static native int queueFamilyIndex0(Buffer ptr);/*
		  VkDeviceQueueCreateInfo vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  return (jint) (vkObj->queueFamilyIndex);
	 */

	/**
	 * native SET method for field queueCount	[int]<br>
	 * Prototype: uint32_t  queueCount
	 */ 
	 private static native void queueCount0(Buffer ptr, int _queueCount);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  vkObj->queueCount = (uint32_t) (_queueCount);
	  */

	/**
	 * native GET method for field queueCount	[int]<br>
	 * Prototype: uint32_t  queueCount
	 */ 
	 private static native int queueCount0(Buffer ptr);/*
		  VkDeviceQueueCreateInfo vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  return (jint) (vkObj->queueCount);
	 */

	/**
	 * native SET method for field pQueuePriorities	[float_array]<br>
	 * Prototype: const float*  pQueuePriorities
	 */ 
	 private static native void pQueuePriorities0(Buffer ptr, float[] _pQueuePriorities);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  vkObj->pQueuePriorities = (const float*) (_pQueuePriorities);
	  */

	/**
	 * native GET method for field pQueuePriorities	[float_array]<br>
	 * Prototype: const float*  pQueuePriorities
	 */ 
	 private static native float[] pQueuePriorities0(Buffer ptr);/*
		  VkDeviceQueueCreateInfo vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  return (float[]) (vkObj->pQueuePriorities);
	 */



} // end of class VkDeviceQueueCreateInfo
