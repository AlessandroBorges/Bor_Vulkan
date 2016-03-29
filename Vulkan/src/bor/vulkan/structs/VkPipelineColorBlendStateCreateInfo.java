/**
 * Class wrapping Vulkan's VkPipelineColorBlendStateCreateInfo struct.
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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkPipelineColorBlendStateCreateInfo extends VkStruct {
	/** TAG of this structure [64]  */
	 private static final String TAG = "VkPipelineColorBlendStateCreateInfo";

	/** ID of this structure [64]  */
	 public static final int TAG_ID = VKPIPELINECOLORBLENDSTATECREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkPipelineColorBlendStateCreateInfo> p;

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
	 *  const VkPipelineColorBlendAttachmentState* 	pAttachments	[vkstruct]
	 */ 
	  VkPipelineColorBlendAttachmentState  	pAttachments;

	/**
	 *  float[] 	blendConstants	[float_array]
	 */ 
	 float[] 	blendConstants;

	/**
	 * Ctor
	 */
	public VkPipelineColorBlendStateCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineColorBlendStateCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkPipelineColorBlendStateCreateInfo(long address, int memSize){ 
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
	 public static P<VkPipelineColorBlendStateCreateInfo> createNullPointer(){
	        P<VkPipelineColorBlendStateCreateInfo> p = new  P<VkPipelineColorBlendStateCreateInfo>(new VkPipelineColorBlendStateCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkPipelineColorBlendStateCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkPipelineColorBlendStateCreateInfo> (this);
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
	 * Prototype: VkPipelineColorBlendStateCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 flags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkPipelineColorBlendStateCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = flags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field logicOpEnable	[boolean]<br>
	 * Prototype: VkBool32  logicOpEnable
	 */ 
	 public void logicOpEnable(boolean logicOpEnable){
		 this.logicOpEnable = logicOpEnable;
		 logicOpEnable0(this.ptr,  logicOpEnable);
	 }

	/**
	 * Get method for field logicOpEnable	[boolean]<br>
	 * Prototype: VkBool32  logicOpEnable
	 */ 
	 public boolean logicOpEnable(){
		 boolean var = logicOpEnable0(super.ptr);
		 this.logicOpEnable = var;
		 return this.logicOpEnable;
	 }

	/**
	 * Set method for field logicOp	[vkenum]<br>
	 * Prototype: VkLogicOp  logicOp
	 */ 
	 public void logicOp(VkLogicOp logicOp){
		 this.logicOp = logicOp;
		 int enumVal = logicOp.getValue();
		 logicOp0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field logicOp	[vkenum]<br>
	 * Prototype: VkLogicOp  logicOp
	 */ 
	 public VkLogicOp logicOp(){
		 int nativeVal = logicOp0(super.ptr);
		 this.logicOp = VkLogicOp.fromValue(nativeVal); 
		 return this.logicOp;
	 }

	/**
	 * Set method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 public void attachmentCount(int attachmentCount){
		 this.attachmentCount = attachmentCount;
		 attachmentCount0(this.ptr,  attachmentCount);
	 }

	/**
	 * Get method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 public int attachmentCount(){
		 int var = attachmentCount0(super.ptr);
		 this.attachmentCount = var;
		 return this.attachmentCount;
	 }

	/**
	 * Set method for field pAttachments	[vkstruct]<br>
	 * Prototype: const VkPipelineColorBlendAttachmentState*  pAttachments
	 */ 
	 public void pAttachments( VkPipelineColorBlendAttachmentState  pAttachments){
		 this.pAttachments = pAttachments;
		 ByteBuffer buff = (pAttachments==null) ? null : pAttachments.getPointerStruct();
		 pAttachments0(this.ptr, buff);
	 }

	/**
	 * Get method for field pAttachments	[vkstruct]<br>
	 * Prototype: const VkPipelineColorBlendAttachmentState*  pAttachments
	 */ 
	 public  VkPipelineColorBlendAttachmentState  pAttachments(){
		 ByteBuffer pointer = pAttachments0(super.ptr);
		 if(pointer == null){
		    this.pAttachments = null;
		    return null;
		  } else 
 		 if(this.pAttachments == null){
		    this.pAttachments = new  VkPipelineColorBlendAttachmentState (pointer);
		 }else{
		    this.pAttachments.setPointer(pointer);
		  }
		 return this.pAttachments;
	 }

	/**
	 * Set method for field blendConstants	[float_array]<br>
	 * Prototype: float[]  blendConstants
	 */ 
	 public void blendConstants(float[] blendConstants){
		 this.blendConstants = blendConstants;
		 blendConstants0(this.ptr,  blendConstants);
	 }

	/**
	 * Get method for field blendConstants	[float_array]<br>
	 * Prototype: float[]  blendConstants
	 */ 
	 public float[] blendConstants(){
		 float[] var = blendConstants0(super.ptr);
		 this.blendConstants = var;
		 return this.blendConstants;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkPipelineColorBlendStateCreateInfo* vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPipelineColorBlendStateCreateInfo* vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineColorBlendStateCreateFlags  flags
	 */ 
	 private static native void flags0(Buffer ptr, int _flags);/*
		  VkPipelineColorBlendStateCreateInfo* vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		  vkObj->flags = (VkPipelineColorBlendStateCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineColorBlendStateCreateFlags  flags
	 */ 
	 private static native int flags0(Buffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field logicOpEnable	[boolean]<br>
	 * Prototype: VkBool32  logicOpEnable
	 */ 
	 private static native void logicOpEnable0(Buffer ptr, boolean _logicOpEnable);/*
		  VkPipelineColorBlendStateCreateInfo* vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		  vkObj->logicOpEnable = (VkBool32) (_logicOpEnable);
	  */

	/**
	 * native GET method for field logicOpEnable	[boolean]<br>
	 * Prototype: VkBool32  logicOpEnable
	 */ 
	 private static native boolean logicOpEnable0(Buffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->logicOpEnable);
	 */

	/**
	 * native SET method for field logicOp	[vkenum]<br>
	 * Prototype: VkLogicOp  logicOp
	 */ 
	 private static native void logicOp0(Buffer ptr, int  _logicOp);/*
		  VkPipelineColorBlendStateCreateInfo* vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		  vkObj->logicOp = (VkLogicOp) (_logicOp);
	  */

	/**
	 * native GET method for field logicOp	[vkenum]<br>
	 * Prototype: VkLogicOp  logicOp
	 */ 
	 private static native int  logicOp0(Buffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		  return (VkLogicOp) (vkObj->logicOp);
	 */

	/**
	 * native SET method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 private static native void attachmentCount0(Buffer ptr, int _attachmentCount);/*
		  VkPipelineColorBlendStateCreateInfo* vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		  vkObj->attachmentCount = (uint32_t) (_attachmentCount);
	  */

	/**
	 * native GET method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 private static native int attachmentCount0(Buffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		  return (jint) (vkObj->attachmentCount);
	 */

	/**
	 * native SET method for field pAttachments	[vkstruct]<br>
	 * Prototype: const VkPipelineColorBlendAttachmentState*  pAttachments
	 */ 
	 private static native void pAttachments0(Buffer ptr, java.nio.ByteBuffer  _pAttachments);/*
		  VkPipelineColorBlendStateCreateInfo* vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		  vkObj->pAttachments = (const VkPipelineColorBlendAttachmentState*) (_pAttachments);
	  */

	/**
	 * native GET method for field pAttachments	[vkstruct]<br>
	 * Prototype: const VkPipelineColorBlendAttachmentState*  pAttachments
	 */ 
	 private static native java.nio.ByteBuffer  pAttachments0(Buffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		  return ( VkPipelineColorBlendAttachmentState ) (vkObj->pAttachments);
	 */

	/**
	 * native SET method for field blendConstants	[float_array]<br>
	 * Prototype: float[]  blendConstants
	 */ 
	 private static native void blendConstants0(Buffer ptr, float[] _blendConstants);/*
		  VkPipelineColorBlendStateCreateInfo* vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		  vkObj->blendConstants = (float[]) (_blendConstants);
	  */

	/**
	 * native GET method for field blendConstants	[float_array]<br>
	 * Prototype: float[]  blendConstants
	 */ 
	 private static native float[] blendConstants0(Buffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo vkObj = (VkPipelineColorBlendStateCreateInfo*)(ptr);
		  return (float[]) (vkObj->blendConstants);
	 */



} // end of class VkPipelineColorBlendStateCreateInfo
