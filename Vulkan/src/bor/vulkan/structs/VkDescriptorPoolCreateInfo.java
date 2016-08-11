/**
 * Class wrapping Vulkan's VkDescriptorPoolCreateInfo struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.65 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
 package bor.vulkan.structs;

 import bor.util.*;
 import bor.vulkan.*;
 import static bor.vulkan.Vulkan.*; 
 import bor.vulkan.enumerations.*;

 import java.util.*;
 import java.nio.*;


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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkDescriptorPoolCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [74]  */
	 private static final String TAG = "VkDescriptorPoolCreateInfo";

	/** ID of this structure [74]  */
	 public static final int TAG_ID = VKDESCRIPTORPOOLCREATEINFO_ID;

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
	 *  const VkDescriptorPoolSize* 	pPoolSizes	[vkstruct_array_array]
	 */ 
	  VkDescriptorPoolSize[]  	pPoolSizes;
	 private BigBuffer 	 pPoolSizesBUFFER;
	/**
	 * Ctor
	 */
	public VkDescriptorPoolCreateInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDescriptorPoolCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDescriptorPoolCreateInfo(long address){ 
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
	 public VkDescriptorPoolCreateInfo sType(VkStructureType sType){
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
	 public VkDescriptorPoolCreateInfo pNext(VkObject pNext){
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
	 * Prototype: VkDescriptorPoolCreateFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDescriptorPoolCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkDescriptorPoolCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field maxSets	[int]<br>
	 * Prototype: uint32_t  maxSets
	 * 
	 * @param maxSets - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDescriptorPoolCreateInfo maxSets(int maxSets){
		 this.maxSets = maxSets;
		 setMaxSets0(this.ptr,  maxSets);
		 return this;
	 }

	/**
	 * Get method for field maxSets	[int]<br>
	 * Prototype: uint32_t  maxSets
	 */ 
	 public int maxSets(){
		 int var = getMaxSets0(super.ptr);
		 this.maxSets = var;
		 return this.maxSets;
	 }

	/**
	 * Set method for field poolSizeCount	[int]<br>
	 * Prototype: uint32_t  poolSizeCount
	 * 
	 * @param poolSizeCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDescriptorPoolCreateInfo poolSizeCount(int poolSizeCount){
		 this.poolSizeCount = poolSizeCount;
		 setPoolSizeCount0(this.ptr,  poolSizeCount);
		 return this;
	 }

	/**
	 * Get method for field poolSizeCount	[int]<br>
	 * Prototype: uint32_t  poolSizeCount
	 */ 
	 public int poolSizeCount(){
		 int var = getPoolSizeCount0(super.ptr);
		 this.poolSizeCount = var;
		 return this.poolSizeCount;
	 }

	/**
	 * Set method for field pPoolSizes	[vkstruct_array]<br>
	 * Prototype: const VkDescriptorPoolSize*  pPoolSizes
	 * 
	 * @param pPoolSizes - a instance of VkDescriptorPoolSize[].
	 * @return this VkStruct instance.
	 */ 
	 public VkDescriptorPoolCreateInfo pPoolSizes(VkDescriptorPoolSize[] pPoolSizes){
		 this.pPoolSizes = pPoolSizes;
		 this.pPoolSizesBUFFER = new BigBuffer(pPoolSizes, VkDescriptorPoolSize.getID());
		 setPPoolSizes0(this.ptr, pPoolSizesBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pPoolSizes	[vkstruct_array]<br>
	 * Prototype: const VkDescriptorPoolSize*  pPoolSizes
	 */ 
	 public VkDescriptorPoolSize[] pPoolSizes(){
		 long ptr = getPPoolSizes0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pPoolSizesBUFFER != null && ptr == pPoolSizesBUFFER.getBufferAddress()){ //same buffer 
		    pPoolSizesBUFFER.update();
		    return pPoolSizes;
		  }else{
		     (new UnsupportedOperationException("There is no VKStruct[] for backup.")).printStackTrace();
		   }
		 return this.pPoolSizes;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkDescriptorPoolCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n maxSets: ")
				.append(maxSets() )
				.append(",\n poolSizeCount: ")
				.append(poolSizeCount() )
				.append(",\n pPoolSizes: ")
				.append(Arrays.toString(pPoolSizes()) )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkDescriptorPoolCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkDescriptorPoolCreateFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkDescriptorPoolCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field maxSets	[int]<br>
	 * Prototype: uint32_t  maxSets
	 */ 
	 private static native void setMaxSets0(Buffer ptr, int _maxSets);/*
		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->maxSets = (uint32_t) (_maxSets);
	  */

	/**
	 * Native GET method for field maxSets	[int]<br>
	 * Prototype: uint32_t  maxSets
	 */ 
	 private static native int getMaxSets0(Buffer ptr);/*
		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		  return (jint) (vkObj->maxSets);
	 */

	/**
	 * Native SET method for field poolSizeCount	[int]<br>
	 * Prototype: uint32_t  poolSizeCount
	 */ 
	 private static native void setPoolSizeCount0(Buffer ptr, int _poolSizeCount);/*
		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->poolSizeCount = (uint32_t) (_poolSizeCount);
	  */

	/**
	 * Native GET method for field poolSizeCount	[int]<br>
	 * Prototype: uint32_t  poolSizeCount
	 */ 
	 private static native int getPoolSizeCount0(Buffer ptr);/*
		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		  return (jint) (vkObj->poolSizeCount);
	 */

	/**
	 * Native SET method for field pPoolSizes	[vkstruct_array]<br>
	 * Prototype: const VkDescriptorPoolSize*  pPoolSizes
	 */ 
	 private static native void setPPoolSizes0(Buffer ptr, java.nio.ByteBuffer  _pPoolSizes);/*
		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pPoolSizes = (const VkDescriptorPoolSize*) (_pPoolSizes);
	  */

	/**
	 * Native GET method for field pPoolSizes	[vkstruct_array]<br>
	 * Prototype: const VkDescriptorPoolSize*  pPoolSizes
	 */ 
	 private static native long getPPoolSizes0(Buffer ptr);/*
		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pPoolSizes );
	 */



} // end of class VkDescriptorPoolCreateInfo
