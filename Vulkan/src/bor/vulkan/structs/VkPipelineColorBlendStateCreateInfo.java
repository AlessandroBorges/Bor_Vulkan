/**
 * Class wrapping Vulkan's VkPipelineColorBlendStateCreateInfo struct.
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
 *  This class is a Java front end for struct VkPipelineColorBlendStateCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPipelineColorBlendStateCreateInfo {
 *     VkStructureType                               sType;
 *     const void*                                   pNext;
 *     VkPipelineColorBlendStateCreateFlags          flags;
 *     VkBool32                                      logicOpEnable;
 *     VkLogicOp                                     logicOp;
 *     uint32_t                                      attachmentCount;
 *     const VkPipelineColorBlendAttachmentState*    pAttachments;
 *     float                                         blendConstants[4];
 * } VkPipelineColorBlendStateCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkPipelineColorBlendStateCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [64]  */
	 private static final String TAG = "VkPipelineColorBlendStateCreateInfo";

	/** ID of this structure [64]  */
	 public static final int TAG_ID = VKPIPELINECOLORBLENDSTATECREATEINFO_ID;

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
	 *  VkPipelineColorBlendStateCreateFlags 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  VkBool32 	logicOpEnable	[boolean]
	 */ 
	boolean 	logicOpEnable;
	
	/**
	 *  VkLogicOp 	logicOp	[vkenum]
	 */ 
	VkLogicOp 	logicOp;
	
	/**
	 *  uint32_t 	attachmentCount	[int]
	 */ 
	int 	attachmentCount;
	
	/**
	 *  const VkPipelineColorBlendAttachmentState* 	pAttachments	[vkstruct_array_array]
	 */ 
	  VkPipelineColorBlendAttachmentState[]  	pAttachments;
	 private BigBuffer 	 pAttachmentsBUFFER;
	
	/**
	 *  float[] 	blendConstants	[float_array [4] ]
	 */ 
	float[] 	blendConstants = new float[4];
	/**
	 * Ctor
	 */
	public VkPipelineColorBlendStateCreateInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineColorBlendStateCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPipelineColorBlendStateCreateInfo(long address){ 
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
	 public VkPipelineColorBlendStateCreateInfo sType(VkStructureType sType){
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
	 public VkPipelineColorBlendStateCreateInfo pNext(VkObject pNext){
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
	 * Prototype: VkPipelineColorBlendStateCreateFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineColorBlendStateCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkPipelineColorBlendStateCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field logicOpEnable	[boolean]<br>
	 * Prototype: VkBool32  logicOpEnable
	 * 
	 * @param logicOpEnable - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineColorBlendStateCreateInfo logicOpEnable(boolean logicOpEnable){
		 this.logicOpEnable = logicOpEnable;
		 setLogicOpEnable0(this.ptr,  logicOpEnable);
		 return this;
	 }

	/**
	 * Get method for field logicOpEnable	[boolean]<br>
	 * Prototype: VkBool32  logicOpEnable
	 */ 
	 public boolean logicOpEnable(){
		 boolean var = getLogicOpEnable0(super.ptr);
		 this.logicOpEnable = var;
		 return this.logicOpEnable;
	 }

	/**
	 * Set method for field logicOp	[vkenum]<br>
	 * Prototype: VkLogicOp  logicOp
	 * 
	 * @param logicOp - a instance of VkLogicOp.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineColorBlendStateCreateInfo logicOp(VkLogicOp logicOp){
		 this.logicOp = logicOp;
		 int enumVal = logicOp.getValue();
		 setLogicOp0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field logicOp	[vkenum]<br>
	 * Prototype: VkLogicOp  logicOp
	 */ 
	 public VkLogicOp logicOp(){
		 int nativeVal = getLogicOp0(super.ptr);
		 this.logicOp = VkLogicOp.fromValue(nativeVal); 
		 return this.logicOp;
	 }

	/**
	 * Set method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 * 
	 * @param attachmentCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineColorBlendStateCreateInfo attachmentCount(int attachmentCount){
		 this.attachmentCount = attachmentCount;
		 setAttachmentCount0(this.ptr,  attachmentCount);
		 return this;
	 }

	/**
	 * Get method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 public int attachmentCount(){
		 int var = getAttachmentCount0(super.ptr);
		 this.attachmentCount = var;
		 return this.attachmentCount;
	 }

	/**
	 * Set method for field pAttachments	[vkstruct_array]<br>
	 * Prototype: const VkPipelineColorBlendAttachmentState*  pAttachments
	 * 
	 * @param pAttachments - a instance of VkPipelineColorBlendAttachmentState[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineColorBlendStateCreateInfo pAttachments(VkPipelineColorBlendAttachmentState[] pAttachments){
		 this.pAttachments = pAttachments;
		 this.pAttachmentsBUFFER = new BigBuffer(pAttachments, VkPipelineColorBlendAttachmentState.getID());
		 setPAttachments0(this.ptr, pAttachmentsBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pAttachments	[vkstruct_array]<br>
	 * Prototype: const VkPipelineColorBlendAttachmentState*  pAttachments
	 */ 
	 public VkPipelineColorBlendAttachmentState[] pAttachments(){
		 long ptr = getPAttachments0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pAttachmentsBUFFER != null && ptr == pAttachmentsBUFFER.getBufferAddress()){ //same buffer 
		    pAttachmentsBUFFER.update();
		    return pAttachments;
		  }else{
		     (new UnsupportedOperationException("There is no VKStruct[] for backup.")).printStackTrace();
		   }
		 return this.pAttachments;
	 }

	/**
	 * Set method for field blendConstants	[float]<br>
	 * Prototype: float[]  blendConstants
	 * 
	 * @param blendConstants - a instance of float[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineColorBlendStateCreateInfo blendConstants(float[] blendConstants){
		 if(blendConstants == null)
		     java.util.Arrays.fill(this.blendConstants , (float) 0);
		  else
		     System.arraycopy(blendConstants, 0, this.blendConstants, 0, this.blendConstants.length); 

		 setBlendConstants0(this.ptr,  this.blendConstants);
		 return this;
	 }

	/**
	 * Get method for field blendConstants	[float]<br>
	 * Prototype: float[]  blendConstants
	 */ 
	 public float[] blendConstants(){
		 float[] var = getBlendConstants0(super.ptr, blendConstants);
		 this.blendConstants = var;
		 return this.blendConstants;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkPipelineColorBlendStateCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n logicOpEnable: ")
				.append(logicOpEnable() )
				.append(",\n logicOp: ")
				.append(logicOp() )
				.append(",\n attachmentCount: ")
				.append(attachmentCount() )
				.append(",\n pAttachments: ")
				.append(Arrays.toString(pAttachments()) )
				.append(",\n blendConstants: ")
				.append(Arrays.toString(blendConstants()) )
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
		  VkPipelineColorBlendStateCreateInfo* vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo* vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPipelineColorBlendStateCreateInfo* vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo* vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineColorBlendStateCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkPipelineColorBlendStateCreateInfo* vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineColorBlendStateCreateFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineColorBlendStateCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo* vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field logicOpEnable	[boolean]<br>
	 * Prototype: VkBool32  logicOpEnable
	 */ 
	 private static native void setLogicOpEnable0(Buffer ptr, boolean  _logicOpEnable);/*
		  VkPipelineColorBlendStateCreateInfo* vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->logicOpEnable = (VkBool32) (_logicOpEnable);
	  */

	/**
	 * Native GET method for field logicOpEnable	[boolean]<br>
	 * Prototype: VkBool32  logicOpEnable
	 */ 
	 private static native boolean  getLogicOpEnable0(Buffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo* vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->logicOpEnable);
	 */

	/**
	 * Native SET method for field logicOp	[vkenum]<br>
	 * Prototype: VkLogicOp  logicOp
	 */ 
	 private static native void setLogicOp0(Buffer ptr, int  _logicOp);/*
		  VkPipelineColorBlendStateCreateInfo* vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->logicOp = (VkLogicOp) (_logicOp);
	  */

	/**
	 * Native GET method for field logicOp	[vkenum]<br>
	 * Prototype: VkLogicOp  logicOp
	 */ 
	 private static native int getLogicOp0(Buffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo* vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->logicOp);
	 */

	/**
	 * Native SET method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 private static native void setAttachmentCount0(Buffer ptr, int _attachmentCount);/*
		  VkPipelineColorBlendStateCreateInfo* vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->attachmentCount = (uint32_t) (_attachmentCount);
	  */

	/**
	 * Native GET method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 private static native int getAttachmentCount0(Buffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo* vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		  return (jint) (vkObj->attachmentCount);
	 */

	/**
	 * Native SET method for field pAttachments	[vkstruct_array]<br>
	 * Prototype: const VkPipelineColorBlendAttachmentState*  pAttachments
	 */ 
	 private static native void setPAttachments0(Buffer ptr, java.nio.ByteBuffer  _pAttachments);/*
		  VkPipelineColorBlendStateCreateInfo* vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkPipelineColorBlendAttachmentState* p_pAttachments = ( VkPipelineColorBlendAttachmentState*) _pAttachments; 
		 vkObj->pAttachments = p_pAttachments; 
	  */

	/**
	 * Native GET method for field pAttachments	[vkstruct_array]<br>
	 * Prototype: const VkPipelineColorBlendAttachmentState*  pAttachments
	 */ 
	 private static native long getPAttachments0(Buffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo* vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pAttachments );
	 */

	/**
	 * Native SET method for field blendConstants	[float]<br>
	 * Prototype: float[]  blendConstants
	 */ 
	 private static native void setBlendConstants0(Buffer ptr, float[] _blendConstants);/*
		  VkPipelineColorBlendStateCreateInfo* vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		 // code for fixed size array 
		  memcpy(vkObj->blendConstants, _blendConstants, 4 * sizeof(float));
	  */

	/**
	 * Native GET method for field blendConstants	[float]<br>
	 * Prototype: float[]  blendConstants
	 */ 
	 private static native float[] getBlendConstants0(Buffer ptr, float[] _blendConstants);/*
		  VkPipelineColorBlendStateCreateInfo* vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		  // fixed length array  
		  memcpy(&_blendConstants, &(vkObj->blendConstants), 4 * sizeof(float));
		  return obj__blendConstants;
	 */



} // end of class VkPipelineColorBlendStateCreateInfo
