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

import java.nio.Buffer;


/**
 *  Project Bor-Vulkan 
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
	/** TAG of this structure [83]  */
	 private static final String TAG = "VkSubpassDescription";

	/** ID of this structure [83]  */
	 public static final int TAG_ID = VKSUBPASSDESCRIPTION_ID;

	/** P wrapper for THIS object */
	 private  P<VkSubpassDescription> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkSubpassDescriptionFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  VkPipelineBindPoint 	pipelineBindPoint	[vkenum]
	 */ 
	 VkPipelineBindPoint 	pipelineBindPoint;

	/**
	 *  uint32_t 	inputAttachmentCount	[int]
	 */ 
	 int 	inputAttachmentCount;

	/**
	 *  const VkAttachmentReference* 	pInputAttachments	[vkstruct]
	 */ 
	  VkAttachmentReference  	pInputAttachments;

	/**
	 *  uint32_t 	colorAttachmentCount	[int]
	 */ 
	 int 	colorAttachmentCount;

	/**
	 *  const VkAttachmentReference* 	pColorAttachments	[vkstruct]
	 */ 
	  VkAttachmentReference  	pColorAttachments;

	/**
	 *  const VkAttachmentReference* 	pResolveAttachments	[vkstruct]
	 */ 
	  VkAttachmentReference  	pResolveAttachments;

	/**
	 *  const VkAttachmentReference* 	pDepthStencilAttachment	[vkstruct]
	 */ 
	  VkAttachmentReference  	pDepthStencilAttachment;

	/**
	 *  uint32_t 	preserveAttachmentCount	[int]
	 */ 
	 int 	preserveAttachmentCount;

	/**
	 *  const uint32_t* 	pPreserveAttachments	[int_array]
	 */ 
	 int[] 	pPreserveAttachments;

	/**
	 * Ctor
	 */
	public VkSubpassDescription(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSubpassDescription(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkSubpassDescription(long address, int memSize){ 
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
	 public static P<VkSubpassDescription> createNullPointer(){
	        P<VkSubpassDescription> p = new  P<VkSubpassDescription>(new VkSubpassDescription());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkSubpassDescription> getP() {
	       if(p == null ){
	           p = new P<VkSubpassDescription> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field flags	[int]<br>
	 * Prototype: VkSubpassDescriptionFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 flags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkSubpassDescriptionFlags  flags
	 */ 
	 public int flags(){
		 int var = flags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field pipelineBindPoint	[vkenum]<br>
	 * Prototype: VkPipelineBindPoint  pipelineBindPoint
	 */ 
	 public void pipelineBindPoint(VkPipelineBindPoint pipelineBindPoint){
		 this.pipelineBindPoint = pipelineBindPoint;
		 int enumVal = pipelineBindPoint.getValue();
		 pipelineBindPoint0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field pipelineBindPoint	[vkenum]<br>
	 * Prototype: VkPipelineBindPoint  pipelineBindPoint
	 */ 
	 public VkPipelineBindPoint pipelineBindPoint(){
		 int nativeVal = pipelineBindPoint0(super.ptr);
		 this.pipelineBindPoint = VkPipelineBindPoint.fromValue(nativeVal); 
		 return this.pipelineBindPoint;
	 }

	/**
	 * Set method for field inputAttachmentCount	[int]<br>
	 * Prototype: uint32_t  inputAttachmentCount
	 */ 
	 public void inputAttachmentCount(int inputAttachmentCount){
		 this.inputAttachmentCount = inputAttachmentCount;
		 inputAttachmentCount0(this.ptr,  inputAttachmentCount);
	 }

	/**
	 * Get method for field inputAttachmentCount	[int]<br>
	 * Prototype: uint32_t  inputAttachmentCount
	 */ 
	 public int inputAttachmentCount(){
		 int var = inputAttachmentCount0(super.ptr);
		 this.inputAttachmentCount = var;
		 return this.inputAttachmentCount;
	 }

	/**
	 * Set method for field pInputAttachments	[vkstruct]<br>
	 * Prototype: const VkAttachmentReference*  pInputAttachments
	 */ 
	 public void pInputAttachments( VkAttachmentReference  pInputAttachments){
		 this.pInputAttachments = pInputAttachments;
		 ByteBuffer buff = (pInputAttachments==null) ? null : pInputAttachments.getPointerStruct();
		 pInputAttachments0(this.ptr, buff);
	 }

	/**
	 * Get method for field pInputAttachments	[vkstruct]<br>
	 * Prototype: const VkAttachmentReference*  pInputAttachments
	 */ 
	 public  VkAttachmentReference  pInputAttachments(){
		 ByteBuffer pointer = pInputAttachments0(super.ptr);
		 if(pointer == null){
		    this.pInputAttachments = null;
		    return null;
		  } else 
 		 if(this.pInputAttachments == null){
		    this.pInputAttachments = new  VkAttachmentReference (pointer);
		 }else{
		    this.pInputAttachments.setPointer(pointer);
		  }
		 return this.pInputAttachments;
	 }

	/**
	 * Set method for field colorAttachmentCount	[int]<br>
	 * Prototype: uint32_t  colorAttachmentCount
	 */ 
	 public void colorAttachmentCount(int colorAttachmentCount){
		 this.colorAttachmentCount = colorAttachmentCount;
		 colorAttachmentCount0(this.ptr,  colorAttachmentCount);
	 }

	/**
	 * Get method for field colorAttachmentCount	[int]<br>
	 * Prototype: uint32_t  colorAttachmentCount
	 */ 
	 public int colorAttachmentCount(){
		 int var = colorAttachmentCount0(super.ptr);
		 this.colorAttachmentCount = var;
		 return this.colorAttachmentCount;
	 }

	/**
	 * Set method for field pColorAttachments	[vkstruct]<br>
	 * Prototype: const VkAttachmentReference*  pColorAttachments
	 */ 
	 public void pColorAttachments( VkAttachmentReference  pColorAttachments){
		 this.pColorAttachments = pColorAttachments;
		 ByteBuffer buff = (pColorAttachments==null) ? null : pColorAttachments.getPointerStruct();
		 pColorAttachments0(this.ptr, buff);
	 }

	/**
	 * Get method for field pColorAttachments	[vkstruct]<br>
	 * Prototype: const VkAttachmentReference*  pColorAttachments
	 */ 
	 public  VkAttachmentReference  pColorAttachments(){
		 ByteBuffer pointer = pColorAttachments0(super.ptr);
		 if(pointer == null){
		    this.pColorAttachments = null;
		    return null;
		  } else 
 		 if(this.pColorAttachments == null){
		    this.pColorAttachments = new  VkAttachmentReference (pointer);
		 }else{
		    this.pColorAttachments.setPointer(pointer);
		  }
		 return this.pColorAttachments;
	 }

	/**
	 * Set method for field pResolveAttachments	[vkstruct]<br>
	 * Prototype: const VkAttachmentReference*  pResolveAttachments
	 */ 
	 public void pResolveAttachments( VkAttachmentReference  pResolveAttachments){
		 this.pResolveAttachments = pResolveAttachments;
		 ByteBuffer buff = (pResolveAttachments==null) ? null : pResolveAttachments.getPointerStruct();
		 pResolveAttachments0(this.ptr, buff);
	 }

	/**
	 * Get method for field pResolveAttachments	[vkstruct]<br>
	 * Prototype: const VkAttachmentReference*  pResolveAttachments
	 */ 
	 public  VkAttachmentReference  pResolveAttachments(){
		 ByteBuffer pointer = pResolveAttachments0(super.ptr);
		 if(pointer == null){
		    this.pResolveAttachments = null;
		    return null;
		  } else 
 		 if(this.pResolveAttachments == null){
		    this.pResolveAttachments = new  VkAttachmentReference (pointer);
		 }else{
		    this.pResolveAttachments.setPointer(pointer);
		  }
		 return this.pResolveAttachments;
	 }

	/**
	 * Set method for field pDepthStencilAttachment	[vkstruct]<br>
	 * Prototype: const VkAttachmentReference*  pDepthStencilAttachment
	 */ 
	 public void pDepthStencilAttachment( VkAttachmentReference  pDepthStencilAttachment){
		 this.pDepthStencilAttachment = pDepthStencilAttachment;
		 ByteBuffer buff = (pDepthStencilAttachment==null) ? null : pDepthStencilAttachment.getPointerStruct();
		 pDepthStencilAttachment0(this.ptr, buff);
	 }

	/**
	 * Get method for field pDepthStencilAttachment	[vkstruct]<br>
	 * Prototype: const VkAttachmentReference*  pDepthStencilAttachment
	 */ 
	 public  VkAttachmentReference  pDepthStencilAttachment(){
		 ByteBuffer pointer = pDepthStencilAttachment0(super.ptr);
		 if(pointer == null){
		    this.pDepthStencilAttachment = null;
		    return null;
		  } else 
 		 if(this.pDepthStencilAttachment == null){
		    this.pDepthStencilAttachment = new  VkAttachmentReference (pointer);
		 }else{
		    this.pDepthStencilAttachment.setPointer(pointer);
		  }
		 return this.pDepthStencilAttachment;
	 }

	/**
	 * Set method for field preserveAttachmentCount	[int]<br>
	 * Prototype: uint32_t  preserveAttachmentCount
	 */ 
	 public void preserveAttachmentCount(int preserveAttachmentCount){
		 this.preserveAttachmentCount = preserveAttachmentCount;
		 preserveAttachmentCount0(this.ptr,  preserveAttachmentCount);
	 }

	/**
	 * Get method for field preserveAttachmentCount	[int]<br>
	 * Prototype: uint32_t  preserveAttachmentCount
	 */ 
	 public int preserveAttachmentCount(){
		 int var = preserveAttachmentCount0(super.ptr);
		 this.preserveAttachmentCount = var;
		 return this.preserveAttachmentCount;
	 }

	/**
	 * Set method for field pPreserveAttachments	[int_array]<br>
	 * Prototype: const uint32_t*  pPreserveAttachments
	 */ 
	 public void pPreserveAttachments(int[] pPreserveAttachments){
		 this.pPreserveAttachments = pPreserveAttachments;
		 pPreserveAttachments0(this.ptr,  pPreserveAttachments);
	 }

	/**
	 * Get method for field pPreserveAttachments	[int_array]<br>
	 * Prototype: const uint32_t*  pPreserveAttachments
	 */ 
	 public int[] pPreserveAttachments(){
		 int[] var = pPreserveAttachments0(super.ptr);
		 this.pPreserveAttachments = var;
		 return this.pPreserveAttachments;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkSubpassDescriptionFlags  flags
	 */ 
	 private static native void flags0(Buffer ptr, int _flags);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  vkObj->flags = (VkSubpassDescriptionFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkSubpassDescriptionFlags  flags
	 */ 
	 private static native int flags0(Buffer ptr);/*
		  VkSubpassDescription vkObj = (VkSubpassDescription*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field pipelineBindPoint	[vkenum]<br>
	 * Prototype: VkPipelineBindPoint  pipelineBindPoint
	 */ 
	 private static native void pipelineBindPoint0(Buffer ptr, int  _pipelineBindPoint);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  vkObj->pipelineBindPoint = (VkPipelineBindPoint) (_pipelineBindPoint);
	  */

	/**
	 * native GET method for field pipelineBindPoint	[vkenum]<br>
	 * Prototype: VkPipelineBindPoint  pipelineBindPoint
	 */ 
	 private static native int  pipelineBindPoint0(Buffer ptr);/*
		  VkSubpassDescription vkObj = (VkSubpassDescription*)(ptr);
		  return (VkPipelineBindPoint) (vkObj->pipelineBindPoint);
	 */

	/**
	 * native SET method for field inputAttachmentCount	[int]<br>
	 * Prototype: uint32_t  inputAttachmentCount
	 */ 
	 private static native void inputAttachmentCount0(Buffer ptr, int _inputAttachmentCount);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  vkObj->inputAttachmentCount = (uint32_t) (_inputAttachmentCount);
	  */

	/**
	 * native GET method for field inputAttachmentCount	[int]<br>
	 * Prototype: uint32_t  inputAttachmentCount
	 */ 
	 private static native int inputAttachmentCount0(Buffer ptr);/*
		  VkSubpassDescription vkObj = (VkSubpassDescription*)(ptr);
		  return (jint) (vkObj->inputAttachmentCount);
	 */

	/**
	 * native SET method for field pInputAttachments	[vkstruct]<br>
	 * Prototype: const VkAttachmentReference*  pInputAttachments
	 */ 
	 private static native void pInputAttachments0(Buffer ptr, java.nio.ByteBuffer  _pInputAttachments);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  vkObj->pInputAttachments = (const VkAttachmentReference*) (_pInputAttachments);
	  */

	/**
	 * native GET method for field pInputAttachments	[vkstruct]<br>
	 * Prototype: const VkAttachmentReference*  pInputAttachments
	 */ 
	 private static native java.nio.ByteBuffer  pInputAttachments0(Buffer ptr);/*
		  VkSubpassDescription vkObj = (VkSubpassDescription*)(ptr);
		  return ( VkAttachmentReference ) (vkObj->pInputAttachments);
	 */

	/**
	 * native SET method for field colorAttachmentCount	[int]<br>
	 * Prototype: uint32_t  colorAttachmentCount
	 */ 
	 private static native void colorAttachmentCount0(Buffer ptr, int _colorAttachmentCount);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  vkObj->colorAttachmentCount = (uint32_t) (_colorAttachmentCount);
	  */

	/**
	 * native GET method for field colorAttachmentCount	[int]<br>
	 * Prototype: uint32_t  colorAttachmentCount
	 */ 
	 private static native int colorAttachmentCount0(Buffer ptr);/*
		  VkSubpassDescription vkObj = (VkSubpassDescription*)(ptr);
		  return (jint) (vkObj->colorAttachmentCount);
	 */

	/**
	 * native SET method for field pColorAttachments	[vkstruct]<br>
	 * Prototype: const VkAttachmentReference*  pColorAttachments
	 */ 
	 private static native void pColorAttachments0(Buffer ptr, java.nio.ByteBuffer  _pColorAttachments);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  vkObj->pColorAttachments = (const VkAttachmentReference*) (_pColorAttachments);
	  */

	/**
	 * native GET method for field pColorAttachments	[vkstruct]<br>
	 * Prototype: const VkAttachmentReference*  pColorAttachments
	 */ 
	 private static native java.nio.ByteBuffer  pColorAttachments0(Buffer ptr);/*
		  VkSubpassDescription vkObj = (VkSubpassDescription*)(ptr);
		  return ( VkAttachmentReference ) (vkObj->pColorAttachments);
	 */

	/**
	 * native SET method for field pResolveAttachments	[vkstruct]<br>
	 * Prototype: const VkAttachmentReference*  pResolveAttachments
	 */ 
	 private static native void pResolveAttachments0(Buffer ptr, java.nio.ByteBuffer  _pResolveAttachments);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  vkObj->pResolveAttachments = (const VkAttachmentReference*) (_pResolveAttachments);
	  */

	/**
	 * native GET method for field pResolveAttachments	[vkstruct]<br>
	 * Prototype: const VkAttachmentReference*  pResolveAttachments
	 */ 
	 private static native java.nio.ByteBuffer  pResolveAttachments0(Buffer ptr);/*
		  VkSubpassDescription vkObj = (VkSubpassDescription*)(ptr);
		  return ( VkAttachmentReference ) (vkObj->pResolveAttachments);
	 */

	/**
	 * native SET method for field pDepthStencilAttachment	[vkstruct]<br>
	 * Prototype: const VkAttachmentReference*  pDepthStencilAttachment
	 */ 
	 private static native void pDepthStencilAttachment0(Buffer ptr, java.nio.ByteBuffer  _pDepthStencilAttachment);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  vkObj->pDepthStencilAttachment = (const VkAttachmentReference*) (_pDepthStencilAttachment);
	  */

	/**
	 * native GET method for field pDepthStencilAttachment	[vkstruct]<br>
	 * Prototype: const VkAttachmentReference*  pDepthStencilAttachment
	 */ 
	 private static native java.nio.ByteBuffer  pDepthStencilAttachment0(Buffer ptr);/*
		  VkSubpassDescription vkObj = (VkSubpassDescription*)(ptr);
		  return ( VkAttachmentReference ) (vkObj->pDepthStencilAttachment);
	 */

	/**
	 * native SET method for field preserveAttachmentCount	[int]<br>
	 * Prototype: uint32_t  preserveAttachmentCount
	 */ 
	 private static native void preserveAttachmentCount0(Buffer ptr, int _preserveAttachmentCount);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  vkObj->preserveAttachmentCount = (uint32_t) (_preserveAttachmentCount);
	  */

	/**
	 * native GET method for field preserveAttachmentCount	[int]<br>
	 * Prototype: uint32_t  preserveAttachmentCount
	 */ 
	 private static native int preserveAttachmentCount0(Buffer ptr);/*
		  VkSubpassDescription vkObj = (VkSubpassDescription*)(ptr);
		  return (jint) (vkObj->preserveAttachmentCount);
	 */

	/**
	 * native SET method for field pPreserveAttachments	[int_array]<br>
	 * Prototype: const uint32_t*  pPreserveAttachments
	 */ 
	 private static native void pPreserveAttachments0(Buffer ptr, int[] _pPreserveAttachments);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  vkObj->pPreserveAttachments = (const uint32_t*) (_pPreserveAttachments);
	  */

	/**
	 * native GET method for field pPreserveAttachments	[int_array]<br>
	 * Prototype: const uint32_t*  pPreserveAttachments
	 */ 
	 private static native int[] pPreserveAttachments0(Buffer ptr);/*
		  VkSubpassDescription vkObj = (VkSubpassDescription*)(ptr);
		  return (int[]) (vkObj->pPreserveAttachments);
	 */



} // end of class VkSubpassDescription
