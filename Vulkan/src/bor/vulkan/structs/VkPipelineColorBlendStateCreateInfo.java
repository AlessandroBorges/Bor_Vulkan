// class wrapping Vulkan's VkPipelineColorBlendStateCreateInfo struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkPipelineColorBlendStateCreateInfo 
 * @Author Alessandro Borges 
 */
public class VkPipelineColorBlendStateCreateInfo extends VkStruct {
	/** ID of this structure [64]  */
	 public static final int TAG = VKPIPELINECOLORBLENDSTATECREATEINFO_ID;

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
	 *  VkPipelineColorBlendStateCreateFlags 	flags 
	 */ 
	int 	flags;

	/**
	 *  VkBool32 	logicOpEnable 
	 */ 
	boolean 	logicOpEnable;

	/**
	 *  VkLogicOp 	logicOp 
	 */ 
	VkLogicOp 	logicOp;

	/**
	 *  uint32_t 	attachmentCount 
	 */ 
	int 	attachmentCount;

	/**
	 *  const VkPipelineColorBlendAttachmentState* 	pAttachments 
	 */ 
	const VkPipelineColorBlendAttachmentState* 	pAttachments;

	/**
	 *  float[] 	blendConstants /* length=4 */ 
	 */ 
	float[] 	blendConstants /* length=4 */;

	/**
	 * Ctor
	 */
	public VkPipelineColorBlendStateCreateInfo(){ 
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
	 * Prototype: VkPipelineColorBlendStateCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkPipelineColorBlendStateCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field logicOpEnable
	 * Prototype: VkBool32  logicOpEnable
	 */ 
	 public void logicOpEnable(boolean logicOpEnable){
		 this.logicOpEnable = logicOpEnable;
		logicOpEnable0(super.ptr, logicOpEnable);
	 }

	/**
	 * get method for field logicOpEnable
	 * Prototype: VkBool32  logicOpEnable
	 */ 
	 public boolean logicOpEnable(){
		 // return  this.logicOpEnable;
		 return logicOpEnable0(super.ptr);
	 }

	/**
	 * Set method for field logicOp
	 * Prototype: VkLogicOp  logicOp
	 */ 
	 public void logicOp(VkLogicOp logicOp){
		 this.logicOp = logicOp;
		logicOp0(super.ptr, logicOp);
	 }

	/**
	 * get method for field logicOp
	 * Prototype: VkLogicOp  logicOp
	 */ 
	 public VkLogicOp logicOp(){
		 // return  this.logicOp;
		 return logicOp0(super.ptr);
	 }

	/**
	 * Set method for field attachmentCount
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 public void attachmentCount(int attachmentCount){
		 this.attachmentCount = attachmentCount;
		attachmentCount0(super.ptr, attachmentCount);
	 }

	/**
	 * get method for field attachmentCount
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 public int attachmentCount(){
		 // return  this.attachmentCount;
		 return attachmentCount0(super.ptr);
	 }

	/**
	 * Set method for field pAttachments
	 * Prototype: const VkPipelineColorBlendAttachmentState*  pAttachments
	 */ 
	 public void pAttachments(const VkPipelineColorBlendAttachmentState* pAttachments){
		 this.pAttachments = pAttachments;
		pAttachments0(super.ptr, pAttachments);
	 }

	/**
	 * get method for field pAttachments
	 * Prototype: const VkPipelineColorBlendAttachmentState*  pAttachments
	 */ 
	 public const VkPipelineColorBlendAttachmentState* pAttachments(){
		 // return  this.pAttachments;
		 return pAttachments0(super.ptr);
	 }

	/**
	 * Set method for field blendConstants /* length=4 */
	 * Prototype: float[]  blendConstants /* length=4 */
	 */ 
	 public void blendConstants /* length=4 */(float[] blendConstants /* length=4 */){
		 this.blendConstants /* length=4 */ = blendConstants /* length=4 */;
		blendConstants /* length=4 */0(super.ptr, blendConstants /* length=4 */);
	 }

	/**
	 * get method for field blendConstants /* length=4 */
	 * Prototype: float[]  blendConstants /* length=4 */
	 */ 
	 public float[] blendConstants /* length=4 */(){
		 // return  this.blendConstants /* length=4 */;
		 return blendConstants /* length=4 */0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkPipelineColorBlendStateCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(*ptr);
		  _obj.flags = (VkPipelineColorBlendStateCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkPipelineColorBlendStateCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(ptr);
		  return (jint) (_obj.VkPipelineColorBlendStateCreateFlags);
	 */

	/**
	 * native Set method for field logicOpEnable
	 * Prototype: VkBool32  logicOpEnable
	 */ 
	 private static native void logicOpEnable0(ByteBuffer ptr, boolean _logicOpEnable);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(*ptr);
		  _obj.logicOpEnable = (VkBool32) (_logicOpEnable);
	  */

	/**
	 * get method for field logicOpEnable
	 * Prototype: VkBool32  logicOpEnable
	 */ 
	 private static native boolean logicOpEnable0(ByteBuffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native Set method for field logicOp
	 * Prototype: VkLogicOp  logicOp
	 */ 
	 private static native void logicOp0(ByteBuffer ptr, VkLogicOp _logicOp);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(*ptr);
		  _obj.logicOp = (VkLogicOp) (_logicOp);
	  */

	/**
	 * get method for field logicOp
	 * Prototype: VkLogicOp  logicOp
	 */ 
	 private static native VkLogicOp logicOp0(ByteBuffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(ptr);
		  return (VkLogicOp) (_obj.VkLogicOp);
	 */

	/**
	 * native Set method for field attachmentCount
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 private static native void attachmentCount0(ByteBuffer ptr, int _attachmentCount);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(*ptr);
		  _obj.attachmentCount = (uint32_t) (_attachmentCount);
	  */

	/**
	 * get method for field attachmentCount
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 private static native int attachmentCount0(ByteBuffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pAttachments
	 * Prototype: const VkPipelineColorBlendAttachmentState*  pAttachments
	 */ 
	 private static native void pAttachments0(ByteBuffer ptr, const VkPipelineColorBlendAttachmentState* _pAttachments);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(*ptr);
		  _obj.pAttachments = (const VkPipelineColorBlendAttachmentState*) (_pAttachments);
	  */

	/**
	 * get method for field pAttachments
	 * Prototype: const VkPipelineColorBlendAttachmentState*  pAttachments
	 */ 
	 private static native const VkPipelineColorBlendAttachmentState* pAttachments0(ByteBuffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(ptr);
		  return (const VkPipelineColorBlendAttachmentState*) (_obj.const VkPipelineColorBlendAttachmentState*);
	 */

	/**
	 * native Set method for field blendConstants /* length=4 */
	 * Prototype: float[]  blendConstants /* length=4 */
	 */ 
	 private static native void blendConstants /* length=4 */0(ByteBuffer ptr, float[] _blendConstants /* length=4 */);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(*ptr);
		  _obj.blendConstants /* length=4 */ = (float[]) (_blendConstants /* length=4 */);
	  */

	/**
	 * get method for field blendConstants /* length=4 */
	 * Prototype: float[]  blendConstants /* length=4 */
	 */ 
	 private static native float[] blendConstants /* length=4 */0(ByteBuffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(ptr);
		  return (float[]) (_obj.float[]);
	 */



} // end of class VkPipelineColorBlendStateCreateInfo
