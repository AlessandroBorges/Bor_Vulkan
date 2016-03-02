/**
 * Class wrapping Vulkan's VkSubpassDescription struct.
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
 *  This class is a Java front end for struct VkSubpassDescription. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSubpassDescription {
 *     VkSubpassDescriptionFlags       flags;
 *     VkPipelineBindPoint             pipelineBindPoint;
 *     uint32_t                        inputAttachmentCount;
 *     const VkAttachmentReference*    pInputAttachments;
 *     uint32_t                        colorAttachmentCount;
 *     const VkAttachmentReference*    pColorAttachments;
 *     const VkAttachmentReference*    pResolveAttachments;
 *     const VkAttachmentReference*    pDepthStencilAttachment;
 *     uint32_t                        preserveAttachmentCount;
 *     const uint32_t*                 pPreserveAttachments;
 * } VkSubpassDescription;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkSubpassDescription extends VkStruct {
	/** TAG of this structure [207]  */
	 private static final String TAG = "VkSubpassDescription";

	/** ID of this structure [207]  */
	 public static final int TAG_ID = VKSUBPASSDESCRIPTION_ID;

	 // fields //
	/**
	 *  VkSubpassDescriptionFlags 	flags		 */ 
	int 	flags;

	/**
	 *  VkPipelineBindPoint 	pipelineBindPoint	[vkenum]	 */ 
	VkPipelineBindPoint 	pipelineBindPoint;

	/**
	 *  uint32_t 	inputAttachmentCount		 */ 
	int 	inputAttachmentCount;

	/**
	 *  const VkAttachmentReference* 	pInputAttachments		 */ 
	P<VkAttachmentReference>  	pInputAttachments;

	/**
	 *  uint32_t 	colorAttachmentCount		 */ 
	int 	colorAttachmentCount;

	/**
	 *  const VkAttachmentReference* 	pColorAttachments		 */ 
	P<VkAttachmentReference>  	pColorAttachments;

	/**
	 *  const VkAttachmentReference* 	pResolveAttachments		 */ 
	P<VkAttachmentReference>  	pResolveAttachments;

	/**
	 *  const VkAttachmentReference* 	pDepthStencilAttachment		 */ 
	P<VkAttachmentReference>  	pDepthStencilAttachment;

	/**
	 *  uint32_t 	preserveAttachmentCount		 */ 
	int 	preserveAttachmentCount;

	/**
	 *  const uint32_t* 	pPreserveAttachments		 */ 
	int[] 	pPreserveAttachments;

	/**
	 * Ctor
	 */
	public VkSubpassDescription(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field flags	
	 * Prototype: VkSubpassDescriptionFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	
	 * Prototype: VkSubpassDescriptionFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field pipelineBindPoint	[vkenum]
	 * Prototype: VkPipelineBindPoint  pipelineBindPoint
	 */ 
	 public void pipelineBindPoint(VkPipelineBindPoint pipelineBindPoint){
		 this.pipelineBindPoint = pipelineBindPoint;
		pipelineBindPoint0(super.ptr, pipelineBindPoint);
	 }

	/**
	 * get method for field pipelineBindPoint	[vkenum]
	 * Prototype: VkPipelineBindPoint  pipelineBindPoint
	 */ 
	 public VkPipelineBindPoint pipelineBindPoint(){
		 // return  this.pipelineBindPoint;
		 return pipelineBindPoint0(super.ptr);
	 }

	/**
	 * Set method for field inputAttachmentCount	
	 * Prototype: uint32_t  inputAttachmentCount
	 */ 
	 public void inputAttachmentCount(int inputAttachmentCount){
		 this.inputAttachmentCount = inputAttachmentCount;
		inputAttachmentCount0(super.ptr, inputAttachmentCount);
	 }

	/**
	 * get method for field inputAttachmentCount	
	 * Prototype: uint32_t  inputAttachmentCount
	 */ 
	 public int inputAttachmentCount(){
		 // return  this.inputAttachmentCount;
		 return inputAttachmentCount0(super.ptr);
	 }

	/**
	 * Set method for field pInputAttachments	
	 * Prototype: const VkAttachmentReference*  pInputAttachments
	 */ 
	 public void pInputAttachments(P<VkAttachmentReference>  pInputAttachments){
		 this.pInputAttachments = pInputAttachments;
		pInputAttachments0(super.ptr, pInputAttachments);
	 }

	/**
	 * get method for field pInputAttachments	
	 * Prototype: const VkAttachmentReference*  pInputAttachments
	 */ 
	 public P<VkAttachmentReference>  pInputAttachments(){
		 // return  this.pInputAttachments;
		 return pInputAttachments0(super.ptr);
	 }

	/**
	 * Set method for field colorAttachmentCount	
	 * Prototype: uint32_t  colorAttachmentCount
	 */ 
	 public void colorAttachmentCount(int colorAttachmentCount){
		 this.colorAttachmentCount = colorAttachmentCount;
		colorAttachmentCount0(super.ptr, colorAttachmentCount);
	 }

	/**
	 * get method for field colorAttachmentCount	
	 * Prototype: uint32_t  colorAttachmentCount
	 */ 
	 public int colorAttachmentCount(){
		 // return  this.colorAttachmentCount;
		 return colorAttachmentCount0(super.ptr);
	 }

	/**
	 * Set method for field pColorAttachments	
	 * Prototype: const VkAttachmentReference*  pColorAttachments
	 */ 
	 public void pColorAttachments(P<VkAttachmentReference>  pColorAttachments){
		 this.pColorAttachments = pColorAttachments;
		pColorAttachments0(super.ptr, pColorAttachments);
	 }

	/**
	 * get method for field pColorAttachments	
	 * Prototype: const VkAttachmentReference*  pColorAttachments
	 */ 
	 public P<VkAttachmentReference>  pColorAttachments(){
		 // return  this.pColorAttachments;
		 return pColorAttachments0(super.ptr);
	 }

	/**
	 * Set method for field pResolveAttachments	
	 * Prototype: const VkAttachmentReference*  pResolveAttachments
	 */ 
	 public void pResolveAttachments(P<VkAttachmentReference>  pResolveAttachments){
		 this.pResolveAttachments = pResolveAttachments;
		pResolveAttachments0(super.ptr, pResolveAttachments);
	 }

	/**
	 * get method for field pResolveAttachments	
	 * Prototype: const VkAttachmentReference*  pResolveAttachments
	 */ 
	 public P<VkAttachmentReference>  pResolveAttachments(){
		 // return  this.pResolveAttachments;
		 return pResolveAttachments0(super.ptr);
	 }

	/**
	 * Set method for field pDepthStencilAttachment	
	 * Prototype: const VkAttachmentReference*  pDepthStencilAttachment
	 */ 
	 public void pDepthStencilAttachment(P<VkAttachmentReference>  pDepthStencilAttachment){
		 this.pDepthStencilAttachment = pDepthStencilAttachment;
		pDepthStencilAttachment0(super.ptr, pDepthStencilAttachment);
	 }

	/**
	 * get method for field pDepthStencilAttachment	
	 * Prototype: const VkAttachmentReference*  pDepthStencilAttachment
	 */ 
	 public P<VkAttachmentReference>  pDepthStencilAttachment(){
		 // return  this.pDepthStencilAttachment;
		 return pDepthStencilAttachment0(super.ptr);
	 }

	/**
	 * Set method for field preserveAttachmentCount	
	 * Prototype: uint32_t  preserveAttachmentCount
	 */ 
	 public void preserveAttachmentCount(int preserveAttachmentCount){
		 this.preserveAttachmentCount = preserveAttachmentCount;
		preserveAttachmentCount0(super.ptr, preserveAttachmentCount);
	 }

	/**
	 * get method for field preserveAttachmentCount	
	 * Prototype: uint32_t  preserveAttachmentCount
	 */ 
	 public int preserveAttachmentCount(){
		 // return  this.preserveAttachmentCount;
		 return preserveAttachmentCount0(super.ptr);
	 }

	/**
	 * Set method for field pPreserveAttachments	
	 * Prototype: const uint32_t*  pPreserveAttachments
	 */ 
	 public void pPreserveAttachments(int[] pPreserveAttachments){
		 this.pPreserveAttachments = pPreserveAttachments;
		pPreserveAttachments0(super.ptr, pPreserveAttachments);
	 }

	/**
	 * get method for field pPreserveAttachments	
	 * Prototype: const uint32_t*  pPreserveAttachments
	 */ 
	 public int[] pPreserveAttachments(){
		 // return  this.pPreserveAttachments;
		 return pPreserveAttachments0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field flags	
	 * Prototype: VkSubpassDescriptionFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkSubpassDescription _obj = (VkSubpassDescription)(*ptr);
		  _obj.flags = (VkSubpassDescriptionFlags) (_flags);
	  */

	/**
	 * get method for field flags	
	 * Prototype: VkSubpassDescriptionFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkSubpassDescription _obj = (VkSubpassDescription)(ptr);
		  return (jint) (_obj.VkSubpassDescriptionFlags);
	 */

	/**
	 * native Set method for field pipelineBindPoint	[vkenum]
	 * Prototype: VkPipelineBindPoint  pipelineBindPoint
	 */ 
	 private static native void pipelineBindPoint0(ByteBuffer ptr, VkPipelineBindPoint _pipelineBindPoint);/*
		  VkSubpassDescription _obj = (VkSubpassDescription)(*ptr);
		  _obj.pipelineBindPoint = (VkPipelineBindPoint) (_pipelineBindPoint);
	  */

	/**
	 * get method for field pipelineBindPoint	[vkenum]
	 * Prototype: VkPipelineBindPoint  pipelineBindPoint
	 */ 
	 private static native VkPipelineBindPoint pipelineBindPoint0(ByteBuffer ptr);/*
		  VkSubpassDescription _obj = (VkSubpassDescription)(ptr);
		  return (VkPipelineBindPoint) (_obj.VkPipelineBindPoint);
	 */

	/**
	 * native Set method for field inputAttachmentCount	
	 * Prototype: uint32_t  inputAttachmentCount
	 */ 
	 private static native void inputAttachmentCount0(ByteBuffer ptr, int _inputAttachmentCount);/*
		  VkSubpassDescription _obj = (VkSubpassDescription)(*ptr);
		  _obj.inputAttachmentCount = (uint32_t) (_inputAttachmentCount);
	  */

	/**
	 * get method for field inputAttachmentCount	
	 * Prototype: uint32_t  inputAttachmentCount
	 */ 
	 private static native int inputAttachmentCount0(ByteBuffer ptr);/*
		  VkSubpassDescription _obj = (VkSubpassDescription)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pInputAttachments	
	 * Prototype: const VkAttachmentReference*  pInputAttachments
	 */ 
	 private static native void pInputAttachments0(ByteBuffer ptr, P<VkAttachmentReference>  _pInputAttachments);/*
		  VkSubpassDescription _obj = (VkSubpassDescription)(*ptr);
		  _obj.pInputAttachments = (const VkAttachmentReference*) (_pInputAttachments);
	  */

	/**
	 * get method for field pInputAttachments	
	 * Prototype: const VkAttachmentReference*  pInputAttachments
	 */ 
	 private static native P<VkAttachmentReference>  pInputAttachments0(ByteBuffer ptr);/*
		  VkSubpassDescription _obj = (VkSubpassDescription)(ptr);
		  return (P<VkAttachmentReference> ) (_obj.const VkAttachmentReference*);
	 */

	/**
	 * native Set method for field colorAttachmentCount	
	 * Prototype: uint32_t  colorAttachmentCount
	 */ 
	 private static native void colorAttachmentCount0(ByteBuffer ptr, int _colorAttachmentCount);/*
		  VkSubpassDescription _obj = (VkSubpassDescription)(*ptr);
		  _obj.colorAttachmentCount = (uint32_t) (_colorAttachmentCount);
	  */

	/**
	 * get method for field colorAttachmentCount	
	 * Prototype: uint32_t  colorAttachmentCount
	 */ 
	 private static native int colorAttachmentCount0(ByteBuffer ptr);/*
		  VkSubpassDescription _obj = (VkSubpassDescription)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pColorAttachments	
	 * Prototype: const VkAttachmentReference*  pColorAttachments
	 */ 
	 private static native void pColorAttachments0(ByteBuffer ptr, P<VkAttachmentReference>  _pColorAttachments);/*
		  VkSubpassDescription _obj = (VkSubpassDescription)(*ptr);
		  _obj.pColorAttachments = (const VkAttachmentReference*) (_pColorAttachments);
	  */

	/**
	 * get method for field pColorAttachments	
	 * Prototype: const VkAttachmentReference*  pColorAttachments
	 */ 
	 private static native P<VkAttachmentReference>  pColorAttachments0(ByteBuffer ptr);/*
		  VkSubpassDescription _obj = (VkSubpassDescription)(ptr);
		  return (P<VkAttachmentReference> ) (_obj.const VkAttachmentReference*);
	 */

	/**
	 * native Set method for field pResolveAttachments	
	 * Prototype: const VkAttachmentReference*  pResolveAttachments
	 */ 
	 private static native void pResolveAttachments0(ByteBuffer ptr, P<VkAttachmentReference>  _pResolveAttachments);/*
		  VkSubpassDescription _obj = (VkSubpassDescription)(*ptr);
		  _obj.pResolveAttachments = (const VkAttachmentReference*) (_pResolveAttachments);
	  */

	/**
	 * get method for field pResolveAttachments	
	 * Prototype: const VkAttachmentReference*  pResolveAttachments
	 */ 
	 private static native P<VkAttachmentReference>  pResolveAttachments0(ByteBuffer ptr);/*
		  VkSubpassDescription _obj = (VkSubpassDescription)(ptr);
		  return (P<VkAttachmentReference> ) (_obj.const VkAttachmentReference*);
	 */

	/**
	 * native Set method for field pDepthStencilAttachment	
	 * Prototype: const VkAttachmentReference*  pDepthStencilAttachment
	 */ 
	 private static native void pDepthStencilAttachment0(ByteBuffer ptr, P<VkAttachmentReference>  _pDepthStencilAttachment);/*
		  VkSubpassDescription _obj = (VkSubpassDescription)(*ptr);
		  _obj.pDepthStencilAttachment = (const VkAttachmentReference*) (_pDepthStencilAttachment);
	  */

	/**
	 * get method for field pDepthStencilAttachment	
	 * Prototype: const VkAttachmentReference*  pDepthStencilAttachment
	 */ 
	 private static native P<VkAttachmentReference>  pDepthStencilAttachment0(ByteBuffer ptr);/*
		  VkSubpassDescription _obj = (VkSubpassDescription)(ptr);
		  return (P<VkAttachmentReference> ) (_obj.const VkAttachmentReference*);
	 */

	/**
	 * native Set method for field preserveAttachmentCount	
	 * Prototype: uint32_t  preserveAttachmentCount
	 */ 
	 private static native void preserveAttachmentCount0(ByteBuffer ptr, int _preserveAttachmentCount);/*
		  VkSubpassDescription _obj = (VkSubpassDescription)(*ptr);
		  _obj.preserveAttachmentCount = (uint32_t) (_preserveAttachmentCount);
	  */

	/**
	 * get method for field preserveAttachmentCount	
	 * Prototype: uint32_t  preserveAttachmentCount
	 */ 
	 private static native int preserveAttachmentCount0(ByteBuffer ptr);/*
		  VkSubpassDescription _obj = (VkSubpassDescription)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pPreserveAttachments	
	 * Prototype: const uint32_t*  pPreserveAttachments
	 */ 
	 private static native void pPreserveAttachments0(ByteBuffer ptr, int[] _pPreserveAttachments);/*
		  VkSubpassDescription _obj = (VkSubpassDescription)(*ptr);
		  _obj.pPreserveAttachments = (const uint32_t*) (_pPreserveAttachments);
	  */

	/**
	 * get method for field pPreserveAttachments	
	 * Prototype: const uint32_t*  pPreserveAttachments
	 */ 
	 private static native int[] pPreserveAttachments0(ByteBuffer ptr);/*
		  VkSubpassDescription _obj = (VkSubpassDescription)(ptr);
		  return (int[]) (_obj.const uint32_t*);
	 */



} // end of class VkSubpassDescription
