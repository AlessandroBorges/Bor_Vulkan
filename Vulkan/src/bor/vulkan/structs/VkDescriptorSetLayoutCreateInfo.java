/**
 * Class wrapping Vulkan's VkDescriptorSetLayoutCreateInfo struct.
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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkDescriptorSetLayoutCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [72]  */
	 private static final String TAG = "VkDescriptorSetLayoutCreateInfo";

	/** ID of this structure [72]  */
	 public static final int TAG_ID = VKDESCRIPTORSETLAYOUTCREATEINFO_ID;

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
	 *  VkDescriptorSetLayoutCreateFlags 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  uint32_t 	bindingCount	[int]
	 */ 
	int 	bindingCount;
	
	/**
	 *  const VkDescriptorSetLayoutBinding* 	pBindings	[vkstruct_array_array]
	 */ 
	  VkDescriptorSetLayoutBinding[]  	pBindings;
	 private BigBuffer 	 pBindingsBUFFER;
	/**
	 * Ctor
	 */
	public VkDescriptorSetLayoutCreateInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDescriptorSetLayoutCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDescriptorSetLayoutCreateInfo(long address){ 
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
	 public VkDescriptorSetLayoutCreateInfo sType(VkStructureType sType){
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
	 public VkDescriptorSetLayoutCreateInfo pNext(VkObject pNext){
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
	 * Prototype: VkDescriptorSetLayoutCreateFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDescriptorSetLayoutCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkDescriptorSetLayoutCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field bindingCount	[int]<br>
	 * Prototype: uint32_t  bindingCount
	 * 
	 * @param bindingCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDescriptorSetLayoutCreateInfo bindingCount(int bindingCount){
		 this.bindingCount = bindingCount;
		 setBindingCount0(this.ptr,  bindingCount);
		 return this;
	 }

	/**
	 * Get method for field bindingCount	[int]<br>
	 * Prototype: uint32_t  bindingCount
	 */ 
	 public int bindingCount(){
		 int var = getBindingCount0(super.ptr);
		 this.bindingCount = var;
		 return this.bindingCount;
	 }

	/**
	 * Set method for field pBindings	[vkstruct_array]<br>
	 * Prototype: const VkDescriptorSetLayoutBinding*  pBindings
	 * 
	 * @param pBindings - a instance of VkDescriptorSetLayoutBinding[].
	 * @return this VkStruct instance.
	 */ 
	 public VkDescriptorSetLayoutCreateInfo pBindings(VkDescriptorSetLayoutBinding[] pBindings){
		 this.pBindings = pBindings;
		 this.pBindingsBUFFER = new BigBuffer(pBindings, VkDescriptorSetLayoutBinding.getID());
		 setPBindings0(this.ptr, pBindingsBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pBindings	[vkstruct_array]<br>
	 * Prototype: const VkDescriptorSetLayoutBinding*  pBindings
	 */ 
	 public VkDescriptorSetLayoutBinding[] pBindings(){
		 long ptr = getPBindings0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pBindingsBUFFER != null && ptr == pBindingsBUFFER.getBufferAddress()){ //same buffer 
		    pBindingsBUFFER.update();
		    return pBindings;
		  }else{
		     (new UnsupportedOperationException("There is no VKStruct[] for backup.")).printStackTrace();
		   }
		 return this.pBindings;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkDescriptorSetLayoutCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n bindingCount: ")
				.append(bindingCount() )
				.append(",\n pBindings: ")
				.append(Arrays.toString(pBindings()) )
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
		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkDescriptorSetLayoutCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  vkObj->flags = (VkDescriptorSetLayoutCreateFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkDescriptorSetLayoutCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field bindingCount	[int]<br>
	 * Prototype: uint32_t  bindingCount
	 */ 
	 private static native void setBindingCount0(Buffer ptr, int _bindingCount);/*
		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  vkObj->bindingCount = (uint32_t) (_bindingCount);
	  */

	/**
	 * Native GET method for field bindingCount	[int]<br>
	 * Prototype: uint32_t  bindingCount
	 */ 
	 private static native int getBindingCount0(Buffer ptr);/*
		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  return (jint) (vkObj->bindingCount);
	 */

	/**
	 * Native SET method for field pBindings	[vkstruct_array]<br>
	 * Prototype: const VkDescriptorSetLayoutBinding*  pBindings
	 */ 
	 private static native void setPBindings0(Buffer ptr, java.nio.ByteBuffer  _pBindings);/*
		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  vkObj->pBindings = (const VkDescriptorSetLayoutBinding*) (_pBindings);
	  */

	/**
	 * Native GET method for field pBindings	[vkstruct_array]<br>
	 * Prototype: const VkDescriptorSetLayoutBinding*  pBindings
	 */ 
	 private static native long getPBindings0(Buffer ptr);/*
		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pBindings);
	 */



} // end of class VkDescriptorSetLayoutCreateInfo
