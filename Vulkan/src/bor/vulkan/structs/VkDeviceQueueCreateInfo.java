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
import java.util.Arrays;
import java.nio.Buffer;

/**
 * Project Bor-Vulkan
 * Class for Java-Vulkan integration
 * This class is a Java front end for struct VkDeviceQueueCreateInfo.
 * <h3>Prototype:</h3>
 * 
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

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

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
		 super(TAG_ID); 
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
	 public VkDeviceQueueCreateInfo(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDeviceQueueCreateInfo(long address){ 
		 super(address); 
	 }

	/** 
	 * Static Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}

	/** 
	 * Method to get native size of this structure 
	 */
	 @Override
	 public int getSizeBytes(){ 
		 return sizeOf(); 
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
		 setSType0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = getSType0(super.ptr);
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
		 setPNext0(this.ptr, buff);
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 long pointer = getPNext0(super.ptr);
		 if(pointer == 0){
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
		 setFlags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkDeviceQueueCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field queueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndex
	 */ 
	 public void queueFamilyIndex(int queueFamilyIndex){
		 this.queueFamilyIndex = queueFamilyIndex;
		 setQueueFamilyIndex0(this.ptr,  queueFamilyIndex);
	 }

	/**
	 * Get method for field queueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndex
	 */ 
	 public int queueFamilyIndex(){
		 int var = getQueueFamilyIndex0(super.ptr);
		 this.queueFamilyIndex = var;
		 return this.queueFamilyIndex;
	 }

	/**
	 * Set method for field queueCount	[int]<br>
	 * Prototype: uint32_t  queueCount
	 */ 
	 public void queueCount(int queueCount){
		 this.queueCount = queueCount;
		 setQueueCount0(this.ptr,  queueCount);
	 }

	/**
	 * Get method for field queueCount	[int]<br>
	 * Prototype: uint32_t  queueCount
	 */ 
	 public int queueCount(){
		 int var = getQueueCount0(super.ptr);
		 this.queueCount = var;
		 return this.queueCount;
	 }

	/**
	 * Set method for field pQueuePriorities	[float_array]<br>
	 * Prototype: const float*  pQueuePriorities
	 */ 
	 public void pQueuePriorities(float[] pQueuePriorities){
		 
		 int len = pQueuePriorities==null ? 0 : pQueuePriorities.length;
		 this.pQueuePriorities = pQueuePriorities==null ? null : pQueuePriorities.clone();
		// this.queueCount(len);
		 setPQueuePriorities0(this.ptr,  pQueuePriorities, len);
	 }

	/**
	 * Get method for field pQueuePriorities	[float_array]<br>
	 * Prototype: const float*  pQueuePriorities
	 */ 
	 public float[] pQueuePriorities(){
		// float[] var = getPQueuePriorities0(super.ptr);
		// this.pQueuePriorities = var;
		 return this.pQueuePriorities;
	 }

	 

	 /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("VkDeviceQueueCreateInfo [sType : ")
                .append(sType())
                .append(", pNext : ")
                .append(pNext())
                .append(", flags : ")
                .append(flags())
                .append(", queueFamilyIndex : ")
                .append(queueFamilyIndex())
                .append(", queueCount : ")
                .append(queueCount())
                .append(", pQueuePriorities : ")
                .append(Arrays.toString(pQueuePriorities()))
                .append("]");
        return builder.toString();
    }

    //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkDeviceQueueCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  vkObj->flags = (VkDeviceQueueCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkDeviceQueueCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field queueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndex
	 */ 
	 private static native void setQueueFamilyIndex0(Buffer ptr, int _queueFamilyIndex);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  vkObj->queueFamilyIndex = (uint32_t) (_queueFamilyIndex);
	  */

	/**
	 * native GET method for field queueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndex
	 */ 
	 private static native int getQueueFamilyIndex0(Buffer ptr);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  return (jint) (vkObj->queueFamilyIndex);
	 */

	/**
	 * native SET method for field queueCount	[int]<br>
	 * Prototype: uint32_t  queueCount
	 */ 
	 private static native void setQueueCount0(Buffer ptr, int _queueCount);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  vkObj->queueCount = (uint32_t) (_queueCount);
	  */

	/**
	 * native GET method for field queueCount	[int]<br>
	 * Prototype: uint32_t  queueCount
	 */ 
	 private static native int getQueueCount0(Buffer ptr);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  return (jint) (vkObj->queueCount);
	 */

	/**
	 * native SET method for field pQueuePriorities	[float_array]<br>
	 * Prototype: const float*  pQueuePriorities
	 */ 
	 private static native void setPQueuePriorities0(Buffer ptr, float[] _pQueuePriorities, int len);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		 
		  if(vkObj->pQueuePriorities)
		          delete vkObj->pQueuePriorities;
		  		  
		  float* fArray = new float[len];
		  for(int i=0; i<len; i++){
		     fArray[i] = (float) (_pQueuePriorities[i]);
		  }
		  vkObj->pQueuePriorities = fArray;
		  vkObj->queueCount = (uint32_t)len;
	  */

	/**
	 * native GET method for field pQueuePriorities	[float_array]<br>
	 * Prototype: const float*  pQueuePriorities
	 */ 
	 private static native void getPQueuePriorities0(Buffer ptr, float[] array);/*
		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  uint32_t queueCount = vkObj->queueCount;
		  for(uint32_t i=0; i<queueCount; i++){
		      array[i] = (jfloat)(vkObj->pQueuePriorities[i]);
		  }
	 */



} // end of class VkDeviceQueueCreateInfo
