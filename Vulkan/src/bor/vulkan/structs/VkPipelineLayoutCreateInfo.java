/**
 * Class wrapping Vulkan's VkPipelineLayoutCreateInfo struct.
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
 *  This class is a Java front end for struct VkPipelineLayoutCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPipelineLayoutCreateInfo {
 *     VkStructureType                 sType;
 *     const void*                     pNext;
 *     VkPipelineLayoutCreateFlags     flags;
 *     uint32_t                        setLayoutCount;
 *     const VkDescriptorSetLayout*    pSetLayouts;
 *     uint32_t                        pushConstantRangeCount;
 *     const VkPushConstantRange*      pPushConstantRanges;
 * } VkPipelineLayoutCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkPipelineLayoutCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [69]  */
	 private static final String TAG = "VkPipelineLayoutCreateInfo";

	/** ID of this structure [69]  */
	 public static final int TAG_ID = VKPIPELINELAYOUTCREATEINFO_ID;

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
	 *  VkPipelineLayoutCreateFlags 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  uint32_t 	setLayoutCount	[int]
	 */ 
	int 	setLayoutCount;
	
	/**
	 *  const VkDescriptorSetLayout* 	pSetLayouts	[vkhandle_array_array]
	 */ 
	  VkDescriptorSetLayout[]  	pSetLayouts;
	 private BigBuffer 	 pSetLayoutsBUFFER;
	
	/**
	 *  uint32_t 	pushConstantRangeCount	[int]
	 */ 
	int 	pushConstantRangeCount;
	
	/**
	 *  const VkPushConstantRange* 	pPushConstantRanges	[vkstruct_array_array]
	 */ 
	  VkPushConstantRange[]  	pPushConstantRanges;
	 private BigBuffer 	 pPushConstantRangesBUFFER;
	/**
	 * Ctor
	 */
	public VkPipelineLayoutCreateInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineLayoutCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPipelineLayoutCreateInfo(long address){ 
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
	 public VkPipelineLayoutCreateInfo sType(VkStructureType sType){
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
	 public VkPipelineLayoutCreateInfo pNext(VkObject pNext){
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
	 * Prototype: VkPipelineLayoutCreateFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineLayoutCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkPipelineLayoutCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field setLayoutCount	[int]<br>
	 * Prototype: uint32_t  setLayoutCount
	 * 
	 * @param setLayoutCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineLayoutCreateInfo setLayoutCount(int setLayoutCount){
		 this.setLayoutCount = setLayoutCount;
		 setSetLayoutCount0(this.ptr,  setLayoutCount);
		 return this;
	 }

	/**
	 * Get method for field setLayoutCount	[int]<br>
	 * Prototype: uint32_t  setLayoutCount
	 */ 
	 public int setLayoutCount(){
		 int var = getSetLayoutCount0(super.ptr);
		 this.setLayoutCount = var;
		 return this.setLayoutCount;
	 }

	/**
	 * Set method for field pSetLayouts	[vkhandle_array]<br>
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 * 
	 * @param pSetLayouts - a instance of VkDescriptorSetLayout[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineLayoutCreateInfo pSetLayouts(VkDescriptorSetLayout[] pSetLayouts){
		 this.pSetLayouts = pSetLayouts;
		 this.pSetLayoutsBUFFER = new BigBuffer(pSetLayouts, false);
		 setPSetLayouts0(this.ptr, pSetLayoutsBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pSetLayouts	[vkhandle_array]<br>
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 public VkDescriptorSetLayout[] pSetLayouts(){
		 long ptr = getPSetLayouts0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pSetLayoutsBUFFER != null && ptr == pSetLayoutsBUFFER.getBufferAddress()){ //same buffer 
		    pSetLayoutsBUFFER.update();
		    return pSetLayouts;
		  }else{
		     (new UnsupportedOperationException("There is no VKHandle[] for backup.")).printStackTrace();
		   }
		 return this.pSetLayouts;
	 }

	/**
	 * Set method for field pushConstantRangeCount	[int]<br>
	 * Prototype: uint32_t  pushConstantRangeCount
	 * 
	 * @param pushConstantRangeCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineLayoutCreateInfo pushConstantRangeCount(int pushConstantRangeCount){
		 this.pushConstantRangeCount = pushConstantRangeCount;
		 setPushConstantRangeCount0(this.ptr,  pushConstantRangeCount);
		 return this;
	 }

	/**
	 * Get method for field pushConstantRangeCount	[int]<br>
	 * Prototype: uint32_t  pushConstantRangeCount
	 */ 
	 public int pushConstantRangeCount(){
		 int var = getPushConstantRangeCount0(super.ptr);
		 this.pushConstantRangeCount = var;
		 return this.pushConstantRangeCount;
	 }

	/**
	 * Set method for field pPushConstantRanges	[vkstruct_array]<br>
	 * Prototype: const VkPushConstantRange*  pPushConstantRanges
	 * 
	 * @param pPushConstantRanges - a instance of VkPushConstantRange[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineLayoutCreateInfo pPushConstantRanges(VkPushConstantRange[] pPushConstantRanges){
		 this.pPushConstantRanges = pPushConstantRanges;
		 this.pPushConstantRangesBUFFER = new BigBuffer(pPushConstantRanges, VkPushConstantRange.getID());
		 setPPushConstantRanges0(this.ptr, pPushConstantRangesBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pPushConstantRanges	[vkstruct_array]<br>
	 * Prototype: const VkPushConstantRange*  pPushConstantRanges
	 */ 
	 public VkPushConstantRange[] pPushConstantRanges(){
		 long ptr = getPPushConstantRanges0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pPushConstantRangesBUFFER != null && ptr == pPushConstantRangesBUFFER.getBufferAddress()){ //same buffer 
		    pPushConstantRangesBUFFER.update();
		    return pPushConstantRanges;
		  }else{
		     (new UnsupportedOperationException("There is no VKStruct[] for backup.")).printStackTrace();
		   }
		 return this.pPushConstantRanges;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkPipelineLayoutCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n setLayoutCount: ")
				.append(setLayoutCount() )
				.append(",\n pSetLayouts: ")
				.append(Arrays.toString(pSetLayouts()) )
				.append(",\n pushConstantRangeCount: ")
				.append(pushConstantRangeCount() )
				.append(",\n pPushConstantRanges: ")
				.append(Arrays.toString(pPushConstantRanges()) )
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
		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineLayoutCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineLayoutCreateFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineLayoutCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field setLayoutCount	[int]<br>
	 * Prototype: uint32_t  setLayoutCount
	 */ 
	 private static native void setSetLayoutCount0(Buffer ptr, int _setLayoutCount);/*
		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->setLayoutCount = (uint32_t) (_setLayoutCount);
	  */

	/**
	 * Native GET method for field setLayoutCount	[int]<br>
	 * Prototype: uint32_t  setLayoutCount
	 */ 
	 private static native int getSetLayoutCount0(Buffer ptr);/*
		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  return (jint) (vkObj->setLayoutCount);
	 */

	/**
	 * Native SET method for field pSetLayouts	[vkhandle_array]<br>
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 private static native void setPSetLayouts0(Buffer ptr, ByteBuffer  _pSetLayouts);/*
		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkDescriptorSetLayout* p_pSetLayouts = ( VkDescriptorSetLayout*) _pSetLayouts; 
		 vkObj->pSetLayouts = p_pSetLayouts; 
	  */

	/**
	 * Native GET method for field pSetLayouts	[vkhandle_array]<br>
	 * Prototype: const VkDescriptorSetLayout*  pSetLayouts
	 */ 
	 private static native long getPSetLayouts0(Buffer ptr);/*
		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pSetLayouts );
	 */

	/**
	 * Native SET method for field pushConstantRangeCount	[int]<br>
	 * Prototype: uint32_t  pushConstantRangeCount
	 */ 
	 private static native void setPushConstantRangeCount0(Buffer ptr, int _pushConstantRangeCount);/*
		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->pushConstantRangeCount = (uint32_t) (_pushConstantRangeCount);
	  */

	/**
	 * Native GET method for field pushConstantRangeCount	[int]<br>
	 * Prototype: uint32_t  pushConstantRangeCount
	 */ 
	 private static native int getPushConstantRangeCount0(Buffer ptr);/*
		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  return (jint) (vkObj->pushConstantRangeCount);
	 */

	/**
	 * Native SET method for field pPushConstantRanges	[vkstruct_array]<br>
	 * Prototype: const VkPushConstantRange*  pPushConstantRanges
	 */ 
	 private static native void setPPushConstantRanges0(Buffer ptr, java.nio.ByteBuffer  _pPushConstantRanges);/*
		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkPushConstantRange* p_pPushConstantRanges = ( VkPushConstantRange*) _pPushConstantRanges; 
		 vkObj->pPushConstantRanges = p_pPushConstantRanges; 
	  */

	/**
	 * Native GET method for field pPushConstantRanges	[vkstruct_array]<br>
	 * Prototype: const VkPushConstantRange*  pPushConstantRanges
	 */ 
	 private static native long getPPushConstantRanges0(Buffer ptr);/*
		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pPushConstantRanges );
	 */



} // end of class VkPipelineLayoutCreateInfo
