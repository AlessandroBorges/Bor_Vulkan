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

import java.nio.Buffer;


/**
 *  Project Bor-Vulkan 
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

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [63]  */
	 private static final String TAG = "VkPipelineColorBlendAttachmentState";

	/** ID of this structure [63]  */
	 public static final int TAG_ID = VKPIPELINECOLORBLENDATTACHMENTSTATE_ID;

	/** P wrapper for THIS object */
	 private  P<VkPipelineColorBlendAttachmentState> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkBool32 	blendEnable	[boolean]
	 */ 
	 boolean 	blendEnable;

	/**
	 *  VkBlendFactor 	srcColorBlendFactor	[vkenum]
	 */ 
	 VkBlendFactor 	srcColorBlendFactor;

	/**
	 *  VkBlendFactor 	dstColorBlendFactor	[vkenum]
	 */ 
	 VkBlendFactor 	dstColorBlendFactor;

	/**
	 *  VkBlendOp 	colorBlendOp	[vkenum]
	 */ 
	 VkBlendOp 	colorBlendOp;

	/**
	 *  VkBlendFactor 	srcAlphaBlendFactor	[vkenum]
	 */ 
	 VkBlendFactor 	srcAlphaBlendFactor;

	/**
	 *  VkBlendFactor 	dstAlphaBlendFactor	[vkenum]
	 */ 
	 VkBlendFactor 	dstAlphaBlendFactor;

	/**
	 *  VkBlendOp 	alphaBlendOp	[vkenum]
	 */ 
	 VkBlendOp 	alphaBlendOp;

	/**
	 *  VkColorComponentFlags 	colorWriteMask	[int]
	 */ 
	 int 	colorWriteMask;

	/**
	 * Ctor
	 */
	public VkPipelineColorBlendAttachmentState(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineColorBlendAttachmentState(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkPipelineColorBlendAttachmentState(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPipelineColorBlendAttachmentState(long address){ 
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
	 public static P<VkPipelineColorBlendAttachmentState> createNullPointer(){
	        P<VkPipelineColorBlendAttachmentState> p = new  P<VkPipelineColorBlendAttachmentState>(new VkPipelineColorBlendAttachmentState());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkPipelineColorBlendAttachmentState> getP() {
	       if(p == null ){
	           p = new P<VkPipelineColorBlendAttachmentState> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field blendEnable	[boolean]<br>
	 * Prototype: VkBool32  blendEnable
	 */ 
	 public void blendEnable(boolean blendEnable){
		 this.blendEnable = blendEnable;
		 setBlendEnable0(this.ptr,  blendEnable);
	 }

	/**
	 * Get method for field blendEnable	[boolean]<br>
	 * Prototype: VkBool32  blendEnable
	 */ 
	 public boolean blendEnable(){
		 boolean var = getBlendEnable0(super.ptr);
		 this.blendEnable = var;
		 return this.blendEnable;
	 }

	/**
	 * Set method for field srcColorBlendFactor	[vkenum]<br>
	 * Prototype: VkBlendFactor  srcColorBlendFactor
	 */ 
	 public void srcColorBlendFactor(VkBlendFactor srcColorBlendFactor){
		 this.srcColorBlendFactor = srcColorBlendFactor;
		 int enumVal = srcColorBlendFactor.getValue();
		 setSrcColorBlendFactor0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field srcColorBlendFactor	[vkenum]<br>
	 * Prototype: VkBlendFactor  srcColorBlendFactor
	 */ 
	 public VkBlendFactor srcColorBlendFactor(){
		 int nativeVal = getSrcColorBlendFactor0(super.ptr);
		 this.srcColorBlendFactor = VkBlendFactor.fromValue(nativeVal); 
		 return this.srcColorBlendFactor;
	 }

	/**
	 * Set method for field dstColorBlendFactor	[vkenum]<br>
	 * Prototype: VkBlendFactor  dstColorBlendFactor
	 */ 
	 public void dstColorBlendFactor(VkBlendFactor dstColorBlendFactor){
		 this.dstColorBlendFactor = dstColorBlendFactor;
		 int enumVal = dstColorBlendFactor.getValue();
		 setDstColorBlendFactor0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field dstColorBlendFactor	[vkenum]<br>
	 * Prototype: VkBlendFactor  dstColorBlendFactor
	 */ 
	 public VkBlendFactor dstColorBlendFactor(){
		 int nativeVal = getDstColorBlendFactor0(super.ptr);
		 this.dstColorBlendFactor = VkBlendFactor.fromValue(nativeVal); 
		 return this.dstColorBlendFactor;
	 }

	/**
	 * Set method for field colorBlendOp	[vkenum]<br>
	 * Prototype: VkBlendOp  colorBlendOp
	 */ 
	 public void colorBlendOp(VkBlendOp colorBlendOp){
		 this.colorBlendOp = colorBlendOp;
		 int enumVal = colorBlendOp.getValue();
		 setColorBlendOp0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field colorBlendOp	[vkenum]<br>
	 * Prototype: VkBlendOp  colorBlendOp
	 */ 
	 public VkBlendOp colorBlendOp(){
		 int nativeVal = getColorBlendOp0(super.ptr);
		 this.colorBlendOp = VkBlendOp.fromValue(nativeVal); 
		 return this.colorBlendOp;
	 }

	/**
	 * Set method for field srcAlphaBlendFactor	[vkenum]<br>
	 * Prototype: VkBlendFactor  srcAlphaBlendFactor
	 */ 
	 public void srcAlphaBlendFactor(VkBlendFactor srcAlphaBlendFactor){
		 this.srcAlphaBlendFactor = srcAlphaBlendFactor;
		 int enumVal = srcAlphaBlendFactor.getValue();
		 setSrcAlphaBlendFactor0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field srcAlphaBlendFactor	[vkenum]<br>
	 * Prototype: VkBlendFactor  srcAlphaBlendFactor
	 */ 
	 public VkBlendFactor srcAlphaBlendFactor(){
		 int nativeVal = getSrcAlphaBlendFactor0(super.ptr);
		 this.srcAlphaBlendFactor = VkBlendFactor.fromValue(nativeVal); 
		 return this.srcAlphaBlendFactor;
	 }

	/**
	 * Set method for field dstAlphaBlendFactor	[vkenum]<br>
	 * Prototype: VkBlendFactor  dstAlphaBlendFactor
	 */ 
	 public void dstAlphaBlendFactor(VkBlendFactor dstAlphaBlendFactor){
		 this.dstAlphaBlendFactor = dstAlphaBlendFactor;
		 int enumVal = dstAlphaBlendFactor.getValue();
		 setDstAlphaBlendFactor0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field dstAlphaBlendFactor	[vkenum]<br>
	 * Prototype: VkBlendFactor  dstAlphaBlendFactor
	 */ 
	 public VkBlendFactor dstAlphaBlendFactor(){
		 int nativeVal = getDstAlphaBlendFactor0(super.ptr);
		 this.dstAlphaBlendFactor = VkBlendFactor.fromValue(nativeVal); 
		 return this.dstAlphaBlendFactor;
	 }

	/**
	 * Set method for field alphaBlendOp	[vkenum]<br>
	 * Prototype: VkBlendOp  alphaBlendOp
	 */ 
	 public void alphaBlendOp(VkBlendOp alphaBlendOp){
		 this.alphaBlendOp = alphaBlendOp;
		 int enumVal = alphaBlendOp.getValue();
		 setAlphaBlendOp0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field alphaBlendOp	[vkenum]<br>
	 * Prototype: VkBlendOp  alphaBlendOp
	 */ 
	 public VkBlendOp alphaBlendOp(){
		 int nativeVal = getAlphaBlendOp0(super.ptr);
		 this.alphaBlendOp = VkBlendOp.fromValue(nativeVal); 
		 return this.alphaBlendOp;
	 }

	/**
	 * Set method for field colorWriteMask	[int]<br>
	 * Prototype: VkColorComponentFlags  colorWriteMask
	 */ 
	 public void colorWriteMask(int colorWriteMask){
		 this.colorWriteMask = colorWriteMask;
		 setColorWriteMask0(this.ptr,  colorWriteMask);
	 }

	/**
	 * Get method for field colorWriteMask	[int]<br>
	 * Prototype: VkColorComponentFlags  colorWriteMask
	 */ 
	 public int colorWriteMask(){
		 int var = getColorWriteMask0(super.ptr);
		 this.colorWriteMask = var;
		 return this.colorWriteMask;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field blendEnable	[boolean]<br>
	 * Prototype: VkBool32  blendEnable
	 */ 
	 private static native void setBlendEnable0(Buffer ptr, boolean _blendEnable);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  vkObj->blendEnable = (VkBool32) (_blendEnable);
	  */

	/**
	 * native GET method for field blendEnable	[boolean]<br>
	 * Prototype: VkBool32  blendEnable
	 */ 
	 private static native boolean getBlendEnable0(Buffer ptr);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  return (jboolean) (vkObj->blendEnable);
	 */

	/**
	 * native SET method for field srcColorBlendFactor	[vkenum]<br>
	 * Prototype: VkBlendFactor  srcColorBlendFactor
	 */ 
	 private static native void setSrcColorBlendFactor0(Buffer ptr, int  _srcColorBlendFactor);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  vkObj->srcColorBlendFactor = (VkBlendFactor) (_srcColorBlendFactor);
	  */

	/**
	 * native GET method for field srcColorBlendFactor	[vkenum]<br>
	 * Prototype: VkBlendFactor  srcColorBlendFactor
	 */ 
	 private static native int  getSrcColorBlendFactor0(Buffer ptr);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  return (VkBlendFactor) (vkObj->srcColorBlendFactor);
	 */

	/**
	 * native SET method for field dstColorBlendFactor	[vkenum]<br>
	 * Prototype: VkBlendFactor  dstColorBlendFactor
	 */ 
	 private static native void setDstColorBlendFactor0(Buffer ptr, int  _dstColorBlendFactor);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  vkObj->dstColorBlendFactor = (VkBlendFactor) (_dstColorBlendFactor);
	  */

	/**
	 * native GET method for field dstColorBlendFactor	[vkenum]<br>
	 * Prototype: VkBlendFactor  dstColorBlendFactor
	 */ 
	 private static native int  getDstColorBlendFactor0(Buffer ptr);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  return (VkBlendFactor) (vkObj->dstColorBlendFactor);
	 */

	/**
	 * native SET method for field colorBlendOp	[vkenum]<br>
	 * Prototype: VkBlendOp  colorBlendOp
	 */ 
	 private static native void setColorBlendOp0(Buffer ptr, int  _colorBlendOp);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  vkObj->colorBlendOp = (VkBlendOp) (_colorBlendOp);
	  */

	/**
	 * native GET method for field colorBlendOp	[vkenum]<br>
	 * Prototype: VkBlendOp  colorBlendOp
	 */ 
	 private static native int  getColorBlendOp0(Buffer ptr);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  return (VkBlendOp) (vkObj->colorBlendOp);
	 */

	/**
	 * native SET method for field srcAlphaBlendFactor	[vkenum]<br>
	 * Prototype: VkBlendFactor  srcAlphaBlendFactor
	 */ 
	 private static native void setSrcAlphaBlendFactor0(Buffer ptr, int  _srcAlphaBlendFactor);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  vkObj->srcAlphaBlendFactor = (VkBlendFactor) (_srcAlphaBlendFactor);
	  */

	/**
	 * native GET method for field srcAlphaBlendFactor	[vkenum]<br>
	 * Prototype: VkBlendFactor  srcAlphaBlendFactor
	 */ 
	 private static native int  getSrcAlphaBlendFactor0(Buffer ptr);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  return (VkBlendFactor) (vkObj->srcAlphaBlendFactor);
	 */

	/**
	 * native SET method for field dstAlphaBlendFactor	[vkenum]<br>
	 * Prototype: VkBlendFactor  dstAlphaBlendFactor
	 */ 
	 private static native void setDstAlphaBlendFactor0(Buffer ptr, int  _dstAlphaBlendFactor);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  vkObj->dstAlphaBlendFactor = (VkBlendFactor) (_dstAlphaBlendFactor);
	  */

	/**
	 * native GET method for field dstAlphaBlendFactor	[vkenum]<br>
	 * Prototype: VkBlendFactor  dstAlphaBlendFactor
	 */ 
	 private static native int  getDstAlphaBlendFactor0(Buffer ptr);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  return (VkBlendFactor) (vkObj->dstAlphaBlendFactor);
	 */

	/**
	 * native SET method for field alphaBlendOp	[vkenum]<br>
	 * Prototype: VkBlendOp  alphaBlendOp
	 */ 
	 private static native void setAlphaBlendOp0(Buffer ptr, int  _alphaBlendOp);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  vkObj->alphaBlendOp = (VkBlendOp) (_alphaBlendOp);
	  */

	/**
	 * native GET method for field alphaBlendOp	[vkenum]<br>
	 * Prototype: VkBlendOp  alphaBlendOp
	 */ 
	 private static native int  getAlphaBlendOp0(Buffer ptr);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  return (VkBlendOp) (vkObj->alphaBlendOp);
	 */

	/**
	 * native SET method for field colorWriteMask	[int]<br>
	 * Prototype: VkColorComponentFlags  colorWriteMask
	 */ 
	 private static native void setColorWriteMask0(Buffer ptr, int _colorWriteMask);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  vkObj->colorWriteMask = (VkColorComponentFlags) (_colorWriteMask);
	  */

	/**
	 * native GET method for field colorWriteMask	[int]<br>
	 * Prototype: VkColorComponentFlags  colorWriteMask
	 */ 
	 private static native int getColorWriteMask0(Buffer ptr);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  return (jint) (vkObj->colorWriteMask);
	 */



} // end of class VkPipelineColorBlendAttachmentState
