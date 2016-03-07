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
	 *  const void* 	pNext	[p]
	 */ 
	 P<VkObject> 	pNext;

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
	 *  const VkPipelineColorBlendAttachmentState* 	pAttachments	[p]
	 */ 
	 P<VkPipelineColorBlendAttachmentState>  	pAttachments;

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
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(P<VkObject> pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public P<VkObject> pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field flags	[int]<br>
	 * Prototype: VkPipelineColorBlendStateCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkPipelineColorBlendStateCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field logicOpEnable	[boolean]<br>
	 * Prototype: VkBool32  logicOpEnable
	 */ 
	 public void logicOpEnable(boolean logicOpEnable){
		 this.logicOpEnable = logicOpEnable;
		logicOpEnable0(super.ptr, logicOpEnable);
	 }

	/**
	 * get method for field logicOpEnable	[boolean]<br>
	 * Prototype: VkBool32  logicOpEnable
	 */ 
	 public boolean logicOpEnable(){
		 // return  this.logicOpEnable;
		 return logicOpEnable0(super.ptr);
	 }

	/**
	 * Set method for field logicOp	[vkenum]<br>
	 * Prototype: VkLogicOp  logicOp
	 */ 
	 public void logicOp(VkLogicOp logicOp){
		 this.logicOp = logicOp;
		logicOp0(super.ptr, logicOp);
	 }

	/**
	 * get method for field logicOp	[vkenum]<br>
	 * Prototype: VkLogicOp  logicOp
	 */ 
	 public VkLogicOp logicOp(){
		 // return  this.logicOp;
		 return logicOp0(super.ptr);
	 }

	/**
	 * Set method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 public void attachmentCount(int attachmentCount){
		 this.attachmentCount = attachmentCount;
		attachmentCount0(super.ptr, attachmentCount);
	 }

	/**
	 * get method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 public int attachmentCount(){
		 // return  this.attachmentCount;
		 return attachmentCount0(super.ptr);
	 }

	/**
	 * Set method for field pAttachments	[p]<br>
	 * Prototype: const VkPipelineColorBlendAttachmentState*  pAttachments
	 */ 
	 public void pAttachments(P<VkPipelineColorBlendAttachmentState>  pAttachments){
		 this.pAttachments = pAttachments;
		pAttachments0(super.ptr, pAttachments);
	 }

	/**
	 * get method for field pAttachments	[p]<br>
	 * Prototype: const VkPipelineColorBlendAttachmentState*  pAttachments
	 */ 
	 public P<VkPipelineColorBlendAttachmentState>  pAttachments(){
		 // return  this.pAttachments;
		 return pAttachments0(super.ptr);
	 }

	/**
	 * Set method for field blendConstants	[float_array]<br>
	 * Prototype: float[]  blendConstants
	 */ 
	 public void blendConstants(float[] blendConstants){
		 this.blendConstants = blendConstants;
		blendConstants0(super.ptr, blendConstants);
	 }

	/**
	 * get method for field blendConstants	[float_array]<br>
	 * Prototype: float[]  blendConstants
	 */ 
	 public float[] blendConstants(){
		 // return  this.blendConstants;
		 return blendConstants0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineColorBlendStateCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(*ptr);
		  _obj.flags = (VkPipelineColorBlendStateCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineColorBlendStateCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(ptr);
		  return (jint) (_obj.VkPipelineColorBlendStateCreateFlags);
	 */

	/**
	 * native SET method for field logicOpEnable	[boolean]<br>
	 * Prototype: VkBool32  logicOpEnable
	 */ 
	 private static native void logicOpEnable0(ByteBuffer ptr, boolean _logicOpEnable);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(*ptr);
		  _obj.logicOpEnable = (VkBool32) (_logicOpEnable);
	  */

	/**
	 * native GET method for field logicOpEnable	[boolean]<br>
	 * Prototype: VkBool32  logicOpEnable
	 */ 
	 private static native boolean logicOpEnable0(ByteBuffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field logicOp	[vkenum]<br>
	 * Prototype: VkLogicOp  logicOp
	 */ 
	 private static native void logicOp0(ByteBuffer ptr, VkLogicOp _logicOp);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(*ptr);
		  _obj.logicOp = (VkLogicOp) (_logicOp);
	  */

	/**
	 * native GET method for field logicOp	[vkenum]<br>
	 * Prototype: VkLogicOp  logicOp
	 */ 
	 private static native VkLogicOp logicOp0(ByteBuffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(ptr);
		  return (VkLogicOp) (_obj.VkLogicOp);
	 */

	/**
	 * native SET method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 private static native void attachmentCount0(ByteBuffer ptr, int _attachmentCount);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(*ptr);
		  _obj.attachmentCount = (uint32_t) (_attachmentCount);
	  */

	/**
	 * native GET method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 private static native int attachmentCount0(ByteBuffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field pAttachments	[p]<br>
	 * Prototype: const VkPipelineColorBlendAttachmentState*  pAttachments
	 */ 
	 private static native void pAttachments0(ByteBuffer ptr, P<VkPipelineColorBlendAttachmentState>  _pAttachments);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(*ptr);
		  _obj.pAttachments = (const VkPipelineColorBlendAttachmentState*) (_pAttachments);
	  */

	/**
	 * native GET method for field pAttachments	[p]<br>
	 * Prototype: const VkPipelineColorBlendAttachmentState*  pAttachments
	 */ 
	 private static native P<VkPipelineColorBlendAttachmentState>  pAttachments0(ByteBuffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(ptr);
		  return (P<VkPipelineColorBlendAttachmentState> ) (_obj.const VkPipelineColorBlendAttachmentState*);
	 */

	/**
	 * native SET method for field blendConstants	[float_array]<br>
	 * Prototype: float[]  blendConstants
	 */ 
	 private static native void blendConstants0(ByteBuffer ptr, float[] _blendConstants);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(*ptr);
		  _obj.blendConstants = (float[]) (_blendConstants);
	  */

	/**
	 * native GET method for field blendConstants	[float_array]<br>
	 * Prototype: float[]  blendConstants
	 */ 
	 private static native float[] blendConstants0(ByteBuffer ptr);/*
		  VkPipelineColorBlendStateCreateInfo _obj = (VkPipelineColorBlendStateCreateInfo)(ptr);
		  return (float[]) (_obj.float[]);
	 */



} // end of class VkPipelineColorBlendStateCreateInfo
