/**
 * Class wrapping Vulkan's VkPipelineColorBlendAttachmentState struct.
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
 *  This class is a Java front end for struct VkPipelineColorBlendAttachmentState. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPipelineColorBlendAttachmentState {
 *     VkBool32                 blendEnable;
 *     VkBlendFactor            srcColorBlendFactor;
 *     VkBlendFactor            dstColorBlendFactor;
 *     VkBlendOp                colorBlendOp;
 *     VkBlendFactor            srcAlphaBlendFactor;
 *     VkBlendFactor            dstAlphaBlendFactor;
 *     VkBlendOp                alphaBlendOp;
 *     VkColorComponentFlags    colorWriteMask;
 * } VkPipelineColorBlendAttachmentState;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkPipelineColorBlendAttachmentState extends VkStruct {
	/** TAG of this structure [187]  */
	 private static final String TAG = "VkPipelineColorBlendAttachmentState";

	/** ID of this structure [187]  */
	 public static final int TAG_ID = VKPIPELINECOLORBLENDATTACHMENTSTATE_ID;

	 // fields //
	/**
	 *  VkBool32 	blendEnable		 */ 
	boolean 	blendEnable;

	/**
	 *  VkBlendFactor 	srcColorBlendFactor	[vkenum]	 */ 
	VkBlendFactor 	srcColorBlendFactor;

	/**
	 *  VkBlendFactor 	dstColorBlendFactor	[vkenum]	 */ 
	VkBlendFactor 	dstColorBlendFactor;

	/**
	 *  VkBlendOp 	colorBlendOp	[vkenum]	 */ 
	VkBlendOp 	colorBlendOp;

	/**
	 *  VkBlendFactor 	srcAlphaBlendFactor	[vkenum]	 */ 
	VkBlendFactor 	srcAlphaBlendFactor;

	/**
	 *  VkBlendFactor 	dstAlphaBlendFactor	[vkenum]	 */ 
	VkBlendFactor 	dstAlphaBlendFactor;

	/**
	 *  VkBlendOp 	alphaBlendOp	[vkenum]	 */ 
	VkBlendOp 	alphaBlendOp;

	/**
	 *  VkColorComponentFlags 	colorWriteMask		 */ 
	int 	colorWriteMask;

	/**
	 * Ctor
	 */
	public VkPipelineColorBlendAttachmentState(){ 
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
	 * Set method for field blendEnable	
	 * Prototype: VkBool32  blendEnable
	 */ 
	 public void blendEnable(boolean blendEnable){
		 this.blendEnable = blendEnable;
		blendEnable0(super.ptr, blendEnable);
	 }

	/**
	 * get method for field blendEnable	
	 * Prototype: VkBool32  blendEnable
	 */ 
	 public boolean blendEnable(){
		 // return  this.blendEnable;
		 return blendEnable0(super.ptr);
	 }

	/**
	 * Set method for field srcColorBlendFactor	[vkenum]
	 * Prototype: VkBlendFactor  srcColorBlendFactor
	 */ 
	 public void srcColorBlendFactor(VkBlendFactor srcColorBlendFactor){
		 this.srcColorBlendFactor = srcColorBlendFactor;
		srcColorBlendFactor0(super.ptr, srcColorBlendFactor);
	 }

	/**
	 * get method for field srcColorBlendFactor	[vkenum]
	 * Prototype: VkBlendFactor  srcColorBlendFactor
	 */ 
	 public VkBlendFactor srcColorBlendFactor(){
		 // return  this.srcColorBlendFactor;
		 return srcColorBlendFactor0(super.ptr);
	 }

	/**
	 * Set method for field dstColorBlendFactor	[vkenum]
	 * Prototype: VkBlendFactor  dstColorBlendFactor
	 */ 
	 public void dstColorBlendFactor(VkBlendFactor dstColorBlendFactor){
		 this.dstColorBlendFactor = dstColorBlendFactor;
		dstColorBlendFactor0(super.ptr, dstColorBlendFactor);
	 }

	/**
	 * get method for field dstColorBlendFactor	[vkenum]
	 * Prototype: VkBlendFactor  dstColorBlendFactor
	 */ 
	 public VkBlendFactor dstColorBlendFactor(){
		 // return  this.dstColorBlendFactor;
		 return dstColorBlendFactor0(super.ptr);
	 }

	/**
	 * Set method for field colorBlendOp	[vkenum]
	 * Prototype: VkBlendOp  colorBlendOp
	 */ 
	 public void colorBlendOp(VkBlendOp colorBlendOp){
		 this.colorBlendOp = colorBlendOp;
		colorBlendOp0(super.ptr, colorBlendOp);
	 }

	/**
	 * get method for field colorBlendOp	[vkenum]
	 * Prototype: VkBlendOp  colorBlendOp
	 */ 
	 public VkBlendOp colorBlendOp(){
		 // return  this.colorBlendOp;
		 return colorBlendOp0(super.ptr);
	 }

	/**
	 * Set method for field srcAlphaBlendFactor	[vkenum]
	 * Prototype: VkBlendFactor  srcAlphaBlendFactor
	 */ 
	 public void srcAlphaBlendFactor(VkBlendFactor srcAlphaBlendFactor){
		 this.srcAlphaBlendFactor = srcAlphaBlendFactor;
		srcAlphaBlendFactor0(super.ptr, srcAlphaBlendFactor);
	 }

	/**
	 * get method for field srcAlphaBlendFactor	[vkenum]
	 * Prototype: VkBlendFactor  srcAlphaBlendFactor
	 */ 
	 public VkBlendFactor srcAlphaBlendFactor(){
		 // return  this.srcAlphaBlendFactor;
		 return srcAlphaBlendFactor0(super.ptr);
	 }

	/**
	 * Set method for field dstAlphaBlendFactor	[vkenum]
	 * Prototype: VkBlendFactor  dstAlphaBlendFactor
	 */ 
	 public void dstAlphaBlendFactor(VkBlendFactor dstAlphaBlendFactor){
		 this.dstAlphaBlendFactor = dstAlphaBlendFactor;
		dstAlphaBlendFactor0(super.ptr, dstAlphaBlendFactor);
	 }

	/**
	 * get method for field dstAlphaBlendFactor	[vkenum]
	 * Prototype: VkBlendFactor  dstAlphaBlendFactor
	 */ 
	 public VkBlendFactor dstAlphaBlendFactor(){
		 // return  this.dstAlphaBlendFactor;
		 return dstAlphaBlendFactor0(super.ptr);
	 }

	/**
	 * Set method for field alphaBlendOp	[vkenum]
	 * Prototype: VkBlendOp  alphaBlendOp
	 */ 
	 public void alphaBlendOp(VkBlendOp alphaBlendOp){
		 this.alphaBlendOp = alphaBlendOp;
		alphaBlendOp0(super.ptr, alphaBlendOp);
	 }

	/**
	 * get method for field alphaBlendOp	[vkenum]
	 * Prototype: VkBlendOp  alphaBlendOp
	 */ 
	 public VkBlendOp alphaBlendOp(){
		 // return  this.alphaBlendOp;
		 return alphaBlendOp0(super.ptr);
	 }

	/**
	 * Set method for field colorWriteMask	
	 * Prototype: VkColorComponentFlags  colorWriteMask
	 */ 
	 public void colorWriteMask(int colorWriteMask){
		 this.colorWriteMask = colorWriteMask;
		colorWriteMask0(super.ptr, colorWriteMask);
	 }

	/**
	 * get method for field colorWriteMask	
	 * Prototype: VkColorComponentFlags  colorWriteMask
	 */ 
	 public int colorWriteMask(){
		 // return  this.colorWriteMask;
		 return colorWriteMask0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field blendEnable	
	 * Prototype: VkBool32  blendEnable
	 */ 
	 private static native void blendEnable0(ByteBuffer ptr, boolean _blendEnable);/*
		  VkPipelineColorBlendAttachmentState _obj = (VkPipelineColorBlendAttachmentState)(*ptr);
		  _obj.blendEnable = (VkBool32) (_blendEnable);
	  */

	/**
	 * get method for field blendEnable	
	 * Prototype: VkBool32  blendEnable
	 */ 
	 private static native boolean blendEnable0(ByteBuffer ptr);/*
		  VkPipelineColorBlendAttachmentState _obj = (VkPipelineColorBlendAttachmentState)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native Set method for field srcColorBlendFactor	[vkenum]
	 * Prototype: VkBlendFactor  srcColorBlendFactor
	 */ 
	 private static native void srcColorBlendFactor0(ByteBuffer ptr, VkBlendFactor _srcColorBlendFactor);/*
		  VkPipelineColorBlendAttachmentState _obj = (VkPipelineColorBlendAttachmentState)(*ptr);
		  _obj.srcColorBlendFactor = (VkBlendFactor) (_srcColorBlendFactor);
	  */

	/**
	 * get method for field srcColorBlendFactor	[vkenum]
	 * Prototype: VkBlendFactor  srcColorBlendFactor
	 */ 
	 private static native VkBlendFactor srcColorBlendFactor0(ByteBuffer ptr);/*
		  VkPipelineColorBlendAttachmentState _obj = (VkPipelineColorBlendAttachmentState)(ptr);
		  return (VkBlendFactor) (_obj.VkBlendFactor);
	 */

	/**
	 * native Set method for field dstColorBlendFactor	[vkenum]
	 * Prototype: VkBlendFactor  dstColorBlendFactor
	 */ 
	 private static native void dstColorBlendFactor0(ByteBuffer ptr, VkBlendFactor _dstColorBlendFactor);/*
		  VkPipelineColorBlendAttachmentState _obj = (VkPipelineColorBlendAttachmentState)(*ptr);
		  _obj.dstColorBlendFactor = (VkBlendFactor) (_dstColorBlendFactor);
	  */

	/**
	 * get method for field dstColorBlendFactor	[vkenum]
	 * Prototype: VkBlendFactor  dstColorBlendFactor
	 */ 
	 private static native VkBlendFactor dstColorBlendFactor0(ByteBuffer ptr);/*
		  VkPipelineColorBlendAttachmentState _obj = (VkPipelineColorBlendAttachmentState)(ptr);
		  return (VkBlendFactor) (_obj.VkBlendFactor);
	 */

	/**
	 * native Set method for field colorBlendOp	[vkenum]
	 * Prototype: VkBlendOp  colorBlendOp
	 */ 
	 private static native void colorBlendOp0(ByteBuffer ptr, VkBlendOp _colorBlendOp);/*
		  VkPipelineColorBlendAttachmentState _obj = (VkPipelineColorBlendAttachmentState)(*ptr);
		  _obj.colorBlendOp = (VkBlendOp) (_colorBlendOp);
	  */

	/**
	 * get method for field colorBlendOp	[vkenum]
	 * Prototype: VkBlendOp  colorBlendOp
	 */ 
	 private static native VkBlendOp colorBlendOp0(ByteBuffer ptr);/*
		  VkPipelineColorBlendAttachmentState _obj = (VkPipelineColorBlendAttachmentState)(ptr);
		  return (VkBlendOp) (_obj.VkBlendOp);
	 */

	/**
	 * native Set method for field srcAlphaBlendFactor	[vkenum]
	 * Prototype: VkBlendFactor  srcAlphaBlendFactor
	 */ 
	 private static native void srcAlphaBlendFactor0(ByteBuffer ptr, VkBlendFactor _srcAlphaBlendFactor);/*
		  VkPipelineColorBlendAttachmentState _obj = (VkPipelineColorBlendAttachmentState)(*ptr);
		  _obj.srcAlphaBlendFactor = (VkBlendFactor) (_srcAlphaBlendFactor);
	  */

	/**
	 * get method for field srcAlphaBlendFactor	[vkenum]
	 * Prototype: VkBlendFactor  srcAlphaBlendFactor
	 */ 
	 private static native VkBlendFactor srcAlphaBlendFactor0(ByteBuffer ptr);/*
		  VkPipelineColorBlendAttachmentState _obj = (VkPipelineColorBlendAttachmentState)(ptr);
		  return (VkBlendFactor) (_obj.VkBlendFactor);
	 */

	/**
	 * native Set method for field dstAlphaBlendFactor	[vkenum]
	 * Prototype: VkBlendFactor  dstAlphaBlendFactor
	 */ 
	 private static native void dstAlphaBlendFactor0(ByteBuffer ptr, VkBlendFactor _dstAlphaBlendFactor);/*
		  VkPipelineColorBlendAttachmentState _obj = (VkPipelineColorBlendAttachmentState)(*ptr);
		  _obj.dstAlphaBlendFactor = (VkBlendFactor) (_dstAlphaBlendFactor);
	  */

	/**
	 * get method for field dstAlphaBlendFactor	[vkenum]
	 * Prototype: VkBlendFactor  dstAlphaBlendFactor
	 */ 
	 private static native VkBlendFactor dstAlphaBlendFactor0(ByteBuffer ptr);/*
		  VkPipelineColorBlendAttachmentState _obj = (VkPipelineColorBlendAttachmentState)(ptr);
		  return (VkBlendFactor) (_obj.VkBlendFactor);
	 */

	/**
	 * native Set method for field alphaBlendOp	[vkenum]
	 * Prototype: VkBlendOp  alphaBlendOp
	 */ 
	 private static native void alphaBlendOp0(ByteBuffer ptr, VkBlendOp _alphaBlendOp);/*
		  VkPipelineColorBlendAttachmentState _obj = (VkPipelineColorBlendAttachmentState)(*ptr);
		  _obj.alphaBlendOp = (VkBlendOp) (_alphaBlendOp);
	  */

	/**
	 * get method for field alphaBlendOp	[vkenum]
	 * Prototype: VkBlendOp  alphaBlendOp
	 */ 
	 private static native VkBlendOp alphaBlendOp0(ByteBuffer ptr);/*
		  VkPipelineColorBlendAttachmentState _obj = (VkPipelineColorBlendAttachmentState)(ptr);
		  return (VkBlendOp) (_obj.VkBlendOp);
	 */

	/**
	 * native Set method for field colorWriteMask	
	 * Prototype: VkColorComponentFlags  colorWriteMask
	 */ 
	 private static native void colorWriteMask0(ByteBuffer ptr, int _colorWriteMask);/*
		  VkPipelineColorBlendAttachmentState _obj = (VkPipelineColorBlendAttachmentState)(*ptr);
		  _obj.colorWriteMask = (VkColorComponentFlags) (_colorWriteMask);
	  */

	/**
	 * get method for field colorWriteMask	
	 * Prototype: VkColorComponentFlags  colorWriteMask
	 */ 
	 private static native int colorWriteMask0(ByteBuffer ptr);/*
		  VkPipelineColorBlendAttachmentState _obj = (VkPipelineColorBlendAttachmentState)(ptr);
		  return (jint) (_obj.VkColorComponentFlags);
	 */



} // end of class VkPipelineColorBlendAttachmentState
