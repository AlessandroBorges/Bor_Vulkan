/**
 * Class wrapping Vulkan's VkRenderPassCreateInfo struct.
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
 *  This class is a Java front end for struct VkRenderPassCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkRenderPassCreateInfo {
 *     VkStructureType                   sType;
 *     const void*                       pNext;
 *     VkRenderPassCreateFlags           flags;
 *     uint32_t                          attachmentCount;
 *     const VkAttachmentDescription*    pAttachments;
 *     uint32_t                          subpassCount;
 *     const VkSubpassDescription*       pSubpasses;
 *     uint32_t                          dependencyCount;
 *     const VkSubpassDependency*        pDependencies;
 * } VkRenderPassCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkRenderPassCreateInfo extends VkStruct {
	/** TAG of this structure [85]  */
	 private static final String TAG = "VkRenderPassCreateInfo";

	/** ID of this structure [85]  */
	 public static final int TAG_ID = VKRENDERPASSCREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkRenderPassCreateInfo> p;

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
	 *  VkRenderPassCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  uint32_t 	attachmentCount	[int]
	 */ 
	 int 	attachmentCount;

	/**
	 *  const VkAttachmentDescription* 	pAttachments	[vkstruct]
	 */ 
	  VkAttachmentDescription  	pAttachments;

	/**
	 *  uint32_t 	subpassCount	[int]
	 */ 
	 int 	subpassCount;

	/**
	 *  const VkSubpassDescription* 	pSubpasses	[vkstruct]
	 */ 
	  VkSubpassDescription  	pSubpasses;

	/**
	 *  uint32_t 	dependencyCount	[int]
	 */ 
	 int 	dependencyCount;

	/**
	 *  const VkSubpassDependency* 	pDependencies	[vkstruct]
	 */ 
	  VkSubpassDependency  	pDependencies;

	/**
	 * Ctor
	 */
	public VkRenderPassCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkRenderPassCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkRenderPassCreateInfo(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkRenderPassCreateInfo(long address){ 
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
	 public static P<VkRenderPassCreateInfo> createNullPointer(){
	        P<VkRenderPassCreateInfo> p = new  P<VkRenderPassCreateInfo>(new VkRenderPassCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkRenderPassCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkRenderPassCreateInfo> (this);
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
	 * Prototype: VkRenderPassCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkRenderPassCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 public void attachmentCount(int attachmentCount){
		 this.attachmentCount = attachmentCount;
		 setAttachmentCount0(this.ptr,  attachmentCount);
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
	 * Set method for field pAttachments	[vkstruct]<br>
	 * Prototype: const VkAttachmentDescription*  pAttachments
	 */ 
	 public void pAttachments( VkAttachmentDescription  pAttachments){
		 this.pAttachments = pAttachments;
		 ByteBuffer buff = (pAttachments==null) ? null : pAttachments.getPointer();
		 setPAttachments0(this.ptr, buff);
	 }

	/**
	 * Get method for field pAttachments	[vkstruct]<br>
	 * Prototype: const VkAttachmentDescription*  pAttachments
	 */ 
	 public  VkAttachmentDescription  pAttachments(){
		 long pointer = getPAttachments0(super.ptr);
		 if(pointer == 0){
		    this.pAttachments = null;
		    return null;
		  } 

		 if(this.pAttachments == null){
		    this.pAttachments = new  VkAttachmentDescription (pointer);
		 }else{
		    this.pAttachments.setPointer(pointer);
		  }
		 return this.pAttachments;
	 }

	/**
	 * Set method for field subpassCount	[int]<br>
	 * Prototype: uint32_t  subpassCount
	 */ 
	 public void subpassCount(int subpassCount){
		 this.subpassCount = subpassCount;
		 setSubpassCount0(this.ptr,  subpassCount);
	 }

	/**
	 * Get method for field subpassCount	[int]<br>
	 * Prototype: uint32_t  subpassCount
	 */ 
	 public int subpassCount(){
		 int var = getSubpassCount0(super.ptr);
		 this.subpassCount = var;
		 return this.subpassCount;
	 }

	/**
	 * Set method for field pSubpasses	[vkstruct]<br>
	 * Prototype: const VkSubpassDescription*  pSubpasses
	 */ 
	 public void pSubpasses( VkSubpassDescription  pSubpasses){
		 this.pSubpasses = pSubpasses;
		 ByteBuffer buff = (pSubpasses==null) ? null : pSubpasses.getPointer();
		 setPSubpasses0(this.ptr, buff);
	 }

	/**
	 * Get method for field pSubpasses	[vkstruct]<br>
	 * Prototype: const VkSubpassDescription*  pSubpasses
	 */ 
	 public  VkSubpassDescription  pSubpasses(){
		 long pointer = getPSubpasses0(super.ptr);
		 if(pointer == 0){
		    this.pSubpasses = null;
		    return null;
		  } 

		 if(this.pSubpasses == null){
		    this.pSubpasses = new  VkSubpassDescription (pointer);
		 }else{
		    this.pSubpasses.setPointer(pointer);
		  }
		 return this.pSubpasses;
	 }

	/**
	 * Set method for field dependencyCount	[int]<br>
	 * Prototype: uint32_t  dependencyCount
	 */ 
	 public void dependencyCount(int dependencyCount){
		 this.dependencyCount = dependencyCount;
		 setDependencyCount0(this.ptr,  dependencyCount);
	 }

	/**
	 * Get method for field dependencyCount	[int]<br>
	 * Prototype: uint32_t  dependencyCount
	 */ 
	 public int dependencyCount(){
		 int var = getDependencyCount0(super.ptr);
		 this.dependencyCount = var;
		 return this.dependencyCount;
	 }

	/**
	 * Set method for field pDependencies	[vkstruct]<br>
	 * Prototype: const VkSubpassDependency*  pDependencies
	 */ 
	 public void pDependencies( VkSubpassDependency  pDependencies){
		 this.pDependencies = pDependencies;
		 ByteBuffer buff = (pDependencies==null) ? null : pDependencies.getPointer();
		 setPDependencies0(this.ptr, buff);
	 }

	/**
	 * Get method for field pDependencies	[vkstruct]<br>
	 * Prototype: const VkSubpassDependency*  pDependencies
	 */ 
	 public  VkSubpassDependency  pDependencies(){
		 long pointer = getPDependencies0(super.ptr);
		 if(pointer == 0){
		    this.pDependencies = null;
		    return null;
		  } 

		 if(this.pDependencies == null){
		    this.pDependencies = new  VkSubpassDependency (pointer);
		 }else{
		    this.pDependencies.setPointer(pointer);
		  }
		 return this.pDependencies;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkRenderPassCreateInfo vkObj = (VkRenderPassCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkRenderPassCreateInfo vkObj = (VkRenderPassCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkRenderPassCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  vkObj->flags = (VkRenderPassCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkRenderPassCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkRenderPassCreateInfo vkObj = (VkRenderPassCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 private static native void setAttachmentCount0(Buffer ptr, int _attachmentCount);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  vkObj->attachmentCount = (uint32_t) (_attachmentCount);
	  */

	/**
	 * native GET method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 private static native int getAttachmentCount0(Buffer ptr);/*
		  VkRenderPassCreateInfo vkObj = (VkRenderPassCreateInfo*)(ptr);
		  return (jint) (vkObj->attachmentCount);
	 */

	/**
	 * native SET method for field pAttachments	[vkstruct]<br>
	 * Prototype: const VkAttachmentDescription*  pAttachments
	 */ 
	 private static native void setPAttachments0(Buffer ptr, java.nio.ByteBuffer  _pAttachments);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  vkObj->pAttachments = (const VkAttachmentDescription*) (_pAttachments);
	  */

	/**
	 * native GET method for field pAttachments	[vkstruct]<br>
	 * Prototype: const VkAttachmentDescription*  pAttachments
	 */ 
	 private static native long getPAttachments0(Buffer ptr);/*
		  VkRenderPassCreateInfo vkObj = (VkRenderPassCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pAttachments);	 */

	/**
	 * native SET method for field subpassCount	[int]<br>
	 * Prototype: uint32_t  subpassCount
	 */ 
	 private static native void setSubpassCount0(Buffer ptr, int _subpassCount);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  vkObj->subpassCount = (uint32_t) (_subpassCount);
	  */

	/**
	 * native GET method for field subpassCount	[int]<br>
	 * Prototype: uint32_t  subpassCount
	 */ 
	 private static native int getSubpassCount0(Buffer ptr);/*
		  VkRenderPassCreateInfo vkObj = (VkRenderPassCreateInfo*)(ptr);
		  return (jint) (vkObj->subpassCount);
	 */

	/**
	 * native SET method for field pSubpasses	[vkstruct]<br>
	 * Prototype: const VkSubpassDescription*  pSubpasses
	 */ 
	 private static native void setPSubpasses0(Buffer ptr, java.nio.ByteBuffer  _pSubpasses);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  vkObj->pSubpasses = (const VkSubpassDescription*) (_pSubpasses);
	  */

	/**
	 * native GET method for field pSubpasses	[vkstruct]<br>
	 * Prototype: const VkSubpassDescription*  pSubpasses
	 */ 
	 private static native long getPSubpasses0(Buffer ptr);/*
		  VkRenderPassCreateInfo vkObj = (VkRenderPassCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pSubpasses);	 */

	/**
	 * native SET method for field dependencyCount	[int]<br>
	 * Prototype: uint32_t  dependencyCount
	 */ 
	 private static native void setDependencyCount0(Buffer ptr, int _dependencyCount);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  vkObj->dependencyCount = (uint32_t) (_dependencyCount);
	  */

	/**
	 * native GET method for field dependencyCount	[int]<br>
	 * Prototype: uint32_t  dependencyCount
	 */ 
	 private static native int getDependencyCount0(Buffer ptr);/*
		  VkRenderPassCreateInfo vkObj = (VkRenderPassCreateInfo*)(ptr);
		  return (jint) (vkObj->dependencyCount);
	 */

	/**
	 * native SET method for field pDependencies	[vkstruct]<br>
	 * Prototype: const VkSubpassDependency*  pDependencies
	 */ 
	 private static native void setPDependencies0(Buffer ptr, java.nio.ByteBuffer  _pDependencies);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  vkObj->pDependencies = (const VkSubpassDependency*) (_pDependencies);
	  */

	/**
	 * native GET method for field pDependencies	[vkstruct]<br>
	 * Prototype: const VkSubpassDependency*  pDependencies
	 */ 
	 private static native long getPDependencies0(Buffer ptr);/*
		  VkRenderPassCreateInfo vkObj = (VkRenderPassCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pDependencies);	 */



} // end of class VkRenderPassCreateInfo
