/**
 * Class wrapping Vulkan's VkBufferCreateInfo struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.65 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
 package bor.vulkan.structs;

 import bor.vulkan.*;
 import bor.vulkan.enumerations.*;
 import bor.vulkan.structs.*;
 
 import java.nio.*;
 import java.util.*;


/**
 *  Project Bor-Vulkan 
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkBufferCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkBufferCreateInfo {
 *     VkStructureType        sType;
 *     const void*            pNext;
 *     VkBufferCreateFlags    flags;
 *     VkDeviceSize           size;
 *     VkBufferUsageFlags     usage;
 *     VkSharingMode          sharingMode;
 *     uint32_t               queueFamilyIndexCount;
 *     const uint32_t*        pQueueFamilyIndices;
 * } VkBufferCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkBufferCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [37]  */
	 private static final String TAG = "VkBufferCreateInfo";

	/** ID of this structure [37]  */
	 public static final int TAG_ID = VKBUFFERCREATEINFO_ID;

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
	 *  VkBufferCreateFlags 	flags	[int]
	 */ 
	 int 	flags;
	
/**
	 *  VkDeviceSize 	size	[long]
	 */ 
	 long 	size;
	
/**
	 *  VkBufferUsageFlags 	usage	[int]
	 */ 
	 int 	usage;
	
/**
	 *  VkSharingMode 	sharingMode	[vkenum]
	 */ 
	 VkSharingMode 	sharingMode;
	
/**
	 *  uint32_t 	queueFamilyIndexCount	[int]
	 */ 
	 int 	queueFamilyIndexCount;
	
/**
	 *  const uint32_t* 	pQueueFamilyIndices	[int]
	 */ 
	 int[] 	pQueueFamilyIndices;
	/**
	 * Ctor
	 */
	public VkBufferCreateInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkBufferCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkBufferCreateInfo(long address){ 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 * 
	 * @param sType - a instance of VkStructureType.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferCreateInfo sType(VkStructureType sType){
		 this.sType = sType;
		 int enumVal = sType.getValue();
		 setSType0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param pNext - a instance of VkObject.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferCreateInfo pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 setPNext0(this.ptr, buff);
		 return this;
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
	 * Prototype: VkBufferCreateFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkBufferCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 * 
	 * @param size - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferCreateInfo size(long size){
		 this.size = size;
		 setSize0(this.ptr,  size);
		 return this;
	 }

	/**
	 * Get method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 public long size(){
		 long var = getSize0(super.ptr);
		 this.size = var;
		 return this.size;
	 }

	/**
	 * Set method for field usage	[int]<br>
	 * Prototype: VkBufferUsageFlags  usage
	 * 
	 * @param usage - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferCreateInfo usage(int usage){
		 this.usage = usage;
		 setUsage0(this.ptr,  usage);
		 return this;
	 }

	/**
	 * Get method for field usage	[int]<br>
	 * Prototype: VkBufferUsageFlags  usage
	 */ 
	 public int usage(){
		 int var = getUsage0(super.ptr);
		 this.usage = var;
		 return this.usage;
	 }

	/**
	 * Set method for field sharingMode	[vkenum]<br>
	 * Prototype: VkSharingMode  sharingMode
	 * 
	 * @param sharingMode - a instance of VkSharingMode.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferCreateInfo sharingMode(VkSharingMode sharingMode){
		 this.sharingMode = sharingMode;
		 int enumVal = sharingMode.getValue();
		 setSharingMode0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field sharingMode	[vkenum]<br>
	 * Prototype: VkSharingMode  sharingMode
	 */ 
	 public VkSharingMode sharingMode(){
		 int nativeVal = getSharingMode0(super.ptr);
		 this.sharingMode = VkSharingMode.fromValue(nativeVal); 
		 return this.sharingMode;
	 }

	/**
	 * Set method for field queueFamilyIndexCount	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndexCount
	 * 
	 * @param queueFamilyIndexCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferCreateInfo queueFamilyIndexCount(int queueFamilyIndexCount){
		 this.queueFamilyIndexCount = queueFamilyIndexCount;
		 setQueueFamilyIndexCount0(this.ptr,  queueFamilyIndexCount);
		 return this;
	 }

	/**
	 * Get method for field queueFamilyIndexCount	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 public int queueFamilyIndexCount(){
		 int var = getQueueFamilyIndexCount0(super.ptr);
		 this.queueFamilyIndexCount = var;
		 return this.queueFamilyIndexCount;
	 }

	/**
	 * Set method for field pQueueFamilyIndices	[int]<br>
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 * 
	 * @param pQueueFamilyIndices - a instance of int[].
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferCreateInfo pQueueFamilyIndices(int[] pQueueFamilyIndices){
		 this.pQueueFamilyIndices = pQueueFamilyIndices;
		 setPQueueFamilyIndices0(this.ptr,  pQueueFamilyIndices);
		 return this;
	 }

	/**
	 * Get method for field pQueueFamilyIndices	[int]<br>
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 public int[] pQueueFamilyIndices(){
		 int[] var = getPQueueFamilyIndices0(super.ptr);
		 this.pQueueFamilyIndices = var;
		 return this.pQueueFamilyIndices;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkBufferCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n size: ")
				.append(size() )
				.append(",\n usage: ")
				.append(usage() )
				.append(",\n sharingMode: ")
				.append(sharingMode() )
				.append(",\n queueFamilyIndexCount: ")
				.append(queueFamilyIndexCount() )
				.append(",\n pQueueFamilyIndices: ")
				.append(Arrays.toString(pQueueFamilyIndices()) )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkBufferCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		  vkObj->flags = (VkBufferCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkBufferCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native void setSize0(Buffer ptr, long _size);/*
		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		  vkObj->size = (VkDeviceSize) (_size);
	  */

	/**
	 * native GET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native long getSize0(Buffer ptr);/*
		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		  return (jlong) (vkObj->size);
	 */

	/**
	 * native SET method for field usage	[int]<br>
	 * Prototype: VkBufferUsageFlags  usage
	 */ 
	 private static native void setUsage0(Buffer ptr, int _usage);/*
		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		  vkObj->usage = (VkBufferUsageFlags) (_usage);
	  */

	/**
	 * native GET method for field usage	[int]<br>
	 * Prototype: VkBufferUsageFlags  usage
	 */ 
	 private static native int getUsage0(Buffer ptr);/*
		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		  return (jint) (vkObj->usage);
	 */

	/**
	 * native SET method for field sharingMode	[vkenum]<br>
	 * Prototype: VkSharingMode  sharingMode
	 */ 
	 private static native void setSharingMode0(Buffer ptr, int  _sharingMode);/*
		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		  vkObj->sharingMode = (VkSharingMode) (_sharingMode);
	  */

	/**
	 * native GET method for field sharingMode	[vkenum]<br>
	 * Prototype: VkSharingMode  sharingMode
	 */ 
	 private static native int  getSharingMode0(Buffer ptr);/*
		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		  return (VkSharingMode) (vkObj->sharingMode);
	 */

	/**
	 * native SET method for field queueFamilyIndexCount	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 private static native void setQueueFamilyIndexCount0(Buffer ptr, int _queueFamilyIndexCount);/*
		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		  vkObj->queueFamilyIndexCount = (uint32_t) (_queueFamilyIndexCount);
	  */

	/**
	 * native GET method for field queueFamilyIndexCount	[int]<br>
	 * Prototype: uint32_t  queueFamilyIndexCount
	 */ 
	 private static native int getQueueFamilyIndexCount0(Buffer ptr);/*
		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		  return (jint) (vkObj->queueFamilyIndexCount);
	 */

	/**
	 * native SET method for field pQueueFamilyIndices	[int]<br>
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 private static native void setPQueueFamilyIndices0(Buffer ptr, int[] _pQueueFamilyIndices);/*
		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		  vkObj->pQueueFamilyIndices = (const uint32_t*) (_pQueueFamilyIndices);
	  */

	/**
	 * native GET method for field pQueueFamilyIndices	[int]<br>
	 * Prototype: const uint32_t*  pQueueFamilyIndices
	 */ 
	 private static native int[] getPQueueFamilyIndices0(Buffer ptr);/*
		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		  return (int[]) (vkObj->pQueueFamilyIndices);
	 */



} // end of class VkBufferCreateInfo
