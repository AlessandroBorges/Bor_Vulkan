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


/**
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
	/** TAG of this structure [209]  */
	 private static final String TAG = "VkRenderPassCreateInfo";

	/** ID of this structure [209]  */
	 public static final int TAG_ID = VKRENDERPASSCREATEINFO_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType 
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext 
	 */ 
	P<VkObject> 	pNext;

	/**
	 *  VkRenderPassCreateFlags 	flags 
	 */ 
	int 	flags;

	/**
	 *  uint32_t 	attachmentCount 
	 */ 
	int 	attachmentCount;

	/**
	 *  const VkAttachmentDescription* 	pAttachments 
	 */ 
	P<VkAttachmentDescription>  	pAttachments;

	/**
	 *  uint32_t 	subpassCount 
	 */ 
	int 	subpassCount;

	/**
	 *  const VkSubpassDescription* 	pSubpasses 
	 */ 
	P<VkSubpassDescription>  	pSubpasses;

	/**
	 *  uint32_t 	dependencyCount 
	 */ 
	int 	dependencyCount;

	/**
	 *  const VkSubpassDependency* 	pDependencies 
	 */ 
	P<VkSubpassDependency>  	pDependencies;

	/**
	 * Ctor
	 */
	public VkRenderPassCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
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
	 public void pNext(P<VkObject> pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public P<VkObject> pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field flags
	 * Prototype: VkRenderPassCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkRenderPassCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
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
	 * Prototype: const VkAttachmentDescription*  pAttachments
	 */ 
	 public void pAttachments(P<VkAttachmentDescription>  pAttachments){
		 this.pAttachments = pAttachments;
		pAttachments0(super.ptr, pAttachments);
	 }

	/**
	 * get method for field pAttachments
	 * Prototype: const VkAttachmentDescription*  pAttachments
	 */ 
	 public P<VkAttachmentDescription>  pAttachments(){
		 // return  this.pAttachments;
		 return pAttachments0(super.ptr);
	 }

	/**
	 * Set method for field subpassCount
	 * Prototype: uint32_t  subpassCount
	 */ 
	 public void subpassCount(int subpassCount){
		 this.subpassCount = subpassCount;
		subpassCount0(super.ptr, subpassCount);
	 }

	/**
	 * get method for field subpassCount
	 * Prototype: uint32_t  subpassCount
	 */ 
	 public int subpassCount(){
		 // return  this.subpassCount;
		 return subpassCount0(super.ptr);
	 }

	/**
	 * Set method for field pSubpasses
	 * Prototype: const VkSubpassDescription*  pSubpasses
	 */ 
	 public void pSubpasses(P<VkSubpassDescription>  pSubpasses){
		 this.pSubpasses = pSubpasses;
		pSubpasses0(super.ptr, pSubpasses);
	 }

	/**
	 * get method for field pSubpasses
	 * Prototype: const VkSubpassDescription*  pSubpasses
	 */ 
	 public P<VkSubpassDescription>  pSubpasses(){
		 // return  this.pSubpasses;
		 return pSubpasses0(super.ptr);
	 }

	/**
	 * Set method for field dependencyCount
	 * Prototype: uint32_t  dependencyCount
	 */ 
	 public void dependencyCount(int dependencyCount){
		 this.dependencyCount = dependencyCount;
		dependencyCount0(super.ptr, dependencyCount);
	 }

	/**
	 * get method for field dependencyCount
	 * Prototype: uint32_t  dependencyCount
	 */ 
	 public int dependencyCount(){
		 // return  this.dependencyCount;
		 return dependencyCount0(super.ptr);
	 }

	/**
	 * Set method for field pDependencies
	 * Prototype: const VkSubpassDependency*  pDependencies
	 */ 
	 public void pDependencies(P<VkSubpassDependency>  pDependencies){
		 this.pDependencies = pDependencies;
		pDependencies0(super.ptr, pDependencies);
	 }

	/**
	 * get method for field pDependencies
	 * Prototype: const VkSubpassDependency*  pDependencies
	 */ 
	 public P<VkSubpassDependency>  pDependencies(){
		 // return  this.pDependencies;
		 return pDependencies0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkRenderPassCreateInfo _obj = (VkRenderPassCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkRenderPassCreateInfo _obj = (VkRenderPassCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkRenderPassCreateInfo _obj = (VkRenderPassCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkRenderPassCreateInfo _obj = (VkRenderPassCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkRenderPassCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkRenderPassCreateInfo _obj = (VkRenderPassCreateInfo)(*ptr);
		  _obj.flags = (VkRenderPassCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkRenderPassCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkRenderPassCreateInfo _obj = (VkRenderPassCreateInfo)(ptr);
		  return (jint) (_obj.VkRenderPassCreateFlags);
	 */

	/**
	 * native Set method for field attachmentCount
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 private static native void attachmentCount0(ByteBuffer ptr, int _attachmentCount);/*
		  VkRenderPassCreateInfo _obj = (VkRenderPassCreateInfo)(*ptr);
		  _obj.attachmentCount = (uint32_t) (_attachmentCount);
	  */

	/**
	 * get method for field attachmentCount
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 private static native int attachmentCount0(ByteBuffer ptr);/*
		  VkRenderPassCreateInfo _obj = (VkRenderPassCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pAttachments
	 * Prototype: const VkAttachmentDescription*  pAttachments
	 */ 
	 private static native void pAttachments0(ByteBuffer ptr, P<VkAttachmentDescription>  _pAttachments);/*
		  VkRenderPassCreateInfo _obj = (VkRenderPassCreateInfo)(*ptr);
		  _obj.pAttachments = (const VkAttachmentDescription*) (_pAttachments);
	  */

	/**
	 * get method for field pAttachments
	 * Prototype: const VkAttachmentDescription*  pAttachments
	 */ 
	 private static native P<VkAttachmentDescription>  pAttachments0(ByteBuffer ptr);/*
		  VkRenderPassCreateInfo _obj = (VkRenderPassCreateInfo)(ptr);
		  return (P<VkAttachmentDescription> ) (_obj.const VkAttachmentDescription*);
	 */

	/**
	 * native Set method for field subpassCount
	 * Prototype: uint32_t  subpassCount
	 */ 
	 private static native void subpassCount0(ByteBuffer ptr, int _subpassCount);/*
		  VkRenderPassCreateInfo _obj = (VkRenderPassCreateInfo)(*ptr);
		  _obj.subpassCount = (uint32_t) (_subpassCount);
	  */

	/**
	 * get method for field subpassCount
	 * Prototype: uint32_t  subpassCount
	 */ 
	 private static native int subpassCount0(ByteBuffer ptr);/*
		  VkRenderPassCreateInfo _obj = (VkRenderPassCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pSubpasses
	 * Prototype: const VkSubpassDescription*  pSubpasses
	 */ 
	 private static native void pSubpasses0(ByteBuffer ptr, P<VkSubpassDescription>  _pSubpasses);/*
		  VkRenderPassCreateInfo _obj = (VkRenderPassCreateInfo)(*ptr);
		  _obj.pSubpasses = (const VkSubpassDescription*) (_pSubpasses);
	  */

	/**
	 * get method for field pSubpasses
	 * Prototype: const VkSubpassDescription*  pSubpasses
	 */ 
	 private static native P<VkSubpassDescription>  pSubpasses0(ByteBuffer ptr);/*
		  VkRenderPassCreateInfo _obj = (VkRenderPassCreateInfo)(ptr);
		  return (P<VkSubpassDescription> ) (_obj.const VkSubpassDescription*);
	 */

	/**
	 * native Set method for field dependencyCount
	 * Prototype: uint32_t  dependencyCount
	 */ 
	 private static native void dependencyCount0(ByteBuffer ptr, int _dependencyCount);/*
		  VkRenderPassCreateInfo _obj = (VkRenderPassCreateInfo)(*ptr);
		  _obj.dependencyCount = (uint32_t) (_dependencyCount);
	  */

	/**
	 * get method for field dependencyCount
	 * Prototype: uint32_t  dependencyCount
	 */ 
	 private static native int dependencyCount0(ByteBuffer ptr);/*
		  VkRenderPassCreateInfo _obj = (VkRenderPassCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pDependencies
	 * Prototype: const VkSubpassDependency*  pDependencies
	 */ 
	 private static native void pDependencies0(ByteBuffer ptr, P<VkSubpassDependency>  _pDependencies);/*
		  VkRenderPassCreateInfo _obj = (VkRenderPassCreateInfo)(*ptr);
		  _obj.pDependencies = (const VkSubpassDependency*) (_pDependencies);
	  */

	/**
	 * get method for field pDependencies
	 * Prototype: const VkSubpassDependency*  pDependencies
	 */ 
	 private static native P<VkSubpassDependency>  pDependencies0(ByteBuffer ptr);/*
		  VkRenderPassCreateInfo _obj = (VkRenderPassCreateInfo)(ptr);
		  return (P<VkSubpassDependency> ) (_obj.const VkSubpassDependency*);
	 */



} // end of class VkRenderPassCreateInfo
