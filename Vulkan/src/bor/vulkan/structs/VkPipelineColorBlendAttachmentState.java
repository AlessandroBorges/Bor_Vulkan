/**
 * Class wrapping Vulkan's VkPipelineColorBlendAttachmentState struct.
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
 * @version Ver. 0.8.65 (beta) 
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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineColorBlendAttachmentState(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field blendEnable	[boolean]<br>
	 * Prototype: VkBool32  blendEnable
	 * 
	 * @param blendEnable - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineColorBlendAttachmentState blendEnable(boolean blendEnable){
		 this.blendEnable = blendEnable;
		 setBlendEnable0(this.ptr,  blendEnable);
		 return this;
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
	 * 
	 * @param srcColorBlendFactor - a instance of VkBlendFactor.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineColorBlendAttachmentState srcColorBlendFactor(VkBlendFactor srcColorBlendFactor){
		 this.srcColorBlendFactor = srcColorBlendFactor;
		 int enumVal = srcColorBlendFactor.getValue();
		 setSrcColorBlendFactor0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param dstColorBlendFactor - a instance of VkBlendFactor.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineColorBlendAttachmentState dstColorBlendFactor(VkBlendFactor dstColorBlendFactor){
		 this.dstColorBlendFactor = dstColorBlendFactor;
		 int enumVal = dstColorBlendFactor.getValue();
		 setDstColorBlendFactor0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param colorBlendOp - a instance of VkBlendOp.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineColorBlendAttachmentState colorBlendOp(VkBlendOp colorBlendOp){
		 this.colorBlendOp = colorBlendOp;
		 int enumVal = colorBlendOp.getValue();
		 setColorBlendOp0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param srcAlphaBlendFactor - a instance of VkBlendFactor.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineColorBlendAttachmentState srcAlphaBlendFactor(VkBlendFactor srcAlphaBlendFactor){
		 this.srcAlphaBlendFactor = srcAlphaBlendFactor;
		 int enumVal = srcAlphaBlendFactor.getValue();
		 setSrcAlphaBlendFactor0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param dstAlphaBlendFactor - a instance of VkBlendFactor.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineColorBlendAttachmentState dstAlphaBlendFactor(VkBlendFactor dstAlphaBlendFactor){
		 this.dstAlphaBlendFactor = dstAlphaBlendFactor;
		 int enumVal = dstAlphaBlendFactor.getValue();
		 setDstAlphaBlendFactor0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param alphaBlendOp - a instance of VkBlendOp.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineColorBlendAttachmentState alphaBlendOp(VkBlendOp alphaBlendOp){
		 this.alphaBlendOp = alphaBlendOp;
		 int enumVal = alphaBlendOp.getValue();
		 setAlphaBlendOp0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param colorWriteMask - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineColorBlendAttachmentState colorWriteMask(int colorWriteMask){
		 this.colorWriteMask = colorWriteMask;
		 setColorWriteMask0(this.ptr,  colorWriteMask);
		 return this;
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


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkPipelineColorBlendAttachmentState [ ")
				.append("blendEnable: ").append(blendEnable() )
				.append(",\n srcColorBlendFactor: ")
				.append(srcColorBlendFactor() )
				.append(",\n dstColorBlendFactor: ")
				.append(dstColorBlendFactor() )
				.append(",\n colorBlendOp: ")
				.append(colorBlendOp() )
				.append(",\n srcAlphaBlendFactor: ")
				.append(srcAlphaBlendFactor() )
				.append(",\n dstAlphaBlendFactor: ")
				.append(dstAlphaBlendFactor() )
				.append(",\n alphaBlendOp: ")
				.append(alphaBlendOp() )
				.append(",\n colorWriteMask: ")
				.append(colorWriteMask() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field blendEnable	[boolean]<br>
	 * Prototype: VkBool32  blendEnable
	 */ 
	 private static native void setBlendEnable0(Buffer ptr, boolean  _blendEnable);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		 // code for simple past value 
		  vkObj->blendEnable = (VkBool32) (_blendEnable);
	  */

	/**
	 * Native GET method for field blendEnable	[boolean]<br>
	 * Prototype: VkBool32  blendEnable
	 */ 
	 private static native boolean  getBlendEnable0(Buffer ptr);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  return (jboolean) (vkObj->blendEnable);
	 */

	/**
	 * Native SET method for field srcColorBlendFactor	[vkenum]<br>
	 * Prototype: VkBlendFactor  srcColorBlendFactor
	 */ 
	 private static native void setSrcColorBlendFactor0(Buffer ptr, int  _srcColorBlendFactor);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		 // code for simple past value 
		  vkObj->srcColorBlendFactor = (VkBlendFactor) (_srcColorBlendFactor);
	  */

	/**
	 * Native GET method for field srcColorBlendFactor	[vkenum]<br>
	 * Prototype: VkBlendFactor  srcColorBlendFactor
	 */ 
	 private static native int  getSrcColorBlendFactor0(Buffer ptr);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  return (VkBlendFactor) (vkObj->srcColorBlendFactor);
	 */

	/**
	 * Native SET method for field dstColorBlendFactor	[vkenum]<br>
	 * Prototype: VkBlendFactor  dstColorBlendFactor
	 */ 
	 private static native void setDstColorBlendFactor0(Buffer ptr, int  _dstColorBlendFactor);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		 // code for simple past value 
		  vkObj->dstColorBlendFactor = (VkBlendFactor) (_dstColorBlendFactor);
	  */

	/**
	 * Native GET method for field dstColorBlendFactor	[vkenum]<br>
	 * Prototype: VkBlendFactor  dstColorBlendFactor
	 */ 
	 private static native int  getDstColorBlendFactor0(Buffer ptr);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  return (VkBlendFactor) (vkObj->dstColorBlendFactor);
	 */

	/**
	 * Native SET method for field colorBlendOp	[vkenum]<br>
	 * Prototype: VkBlendOp  colorBlendOp
	 */ 
	 private static native void setColorBlendOp0(Buffer ptr, int  _colorBlendOp);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		 // code for simple past value 
		  vkObj->colorBlendOp = (VkBlendOp) (_colorBlendOp);
	  */

	/**
	 * Native GET method for field colorBlendOp	[vkenum]<br>
	 * Prototype: VkBlendOp  colorBlendOp
	 */ 
	 private static native int  getColorBlendOp0(Buffer ptr);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  return (VkBlendOp) (vkObj->colorBlendOp);
	 */

	/**
	 * Native SET method for field srcAlphaBlendFactor	[vkenum]<br>
	 * Prototype: VkBlendFactor  srcAlphaBlendFactor
	 */ 
	 private static native void setSrcAlphaBlendFactor0(Buffer ptr, int  _srcAlphaBlendFactor);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		 // code for simple past value 
		  vkObj->srcAlphaBlendFactor = (VkBlendFactor) (_srcAlphaBlendFactor);
	  */

	/**
	 * Native GET method for field srcAlphaBlendFactor	[vkenum]<br>
	 * Prototype: VkBlendFactor  srcAlphaBlendFactor
	 */ 
	 private static native int  getSrcAlphaBlendFactor0(Buffer ptr);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  return (VkBlendFactor) (vkObj->srcAlphaBlendFactor);
	 */

	/**
	 * Native SET method for field dstAlphaBlendFactor	[vkenum]<br>
	 * Prototype: VkBlendFactor  dstAlphaBlendFactor
	 */ 
	 private static native void setDstAlphaBlendFactor0(Buffer ptr, int  _dstAlphaBlendFactor);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		 // code for simple past value 
		  vkObj->dstAlphaBlendFactor = (VkBlendFactor) (_dstAlphaBlendFactor);
	  */

	/**
	 * Native GET method for field dstAlphaBlendFactor	[vkenum]<br>
	 * Prototype: VkBlendFactor  dstAlphaBlendFactor
	 */ 
	 private static native int  getDstAlphaBlendFactor0(Buffer ptr);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  return (VkBlendFactor) (vkObj->dstAlphaBlendFactor);
	 */

	/**
	 * Native SET method for field alphaBlendOp	[vkenum]<br>
	 * Prototype: VkBlendOp  alphaBlendOp
	 */ 
	 private static native void setAlphaBlendOp0(Buffer ptr, int  _alphaBlendOp);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		 // code for simple past value 
		  vkObj->alphaBlendOp = (VkBlendOp) (_alphaBlendOp);
	  */

	/**
	 * Native GET method for field alphaBlendOp	[vkenum]<br>
	 * Prototype: VkBlendOp  alphaBlendOp
	 */ 
	 private static native int  getAlphaBlendOp0(Buffer ptr);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  return (VkBlendOp) (vkObj->alphaBlendOp);
	 */

	/**
	 * Native SET method for field colorWriteMask	[int]<br>
	 * Prototype: VkColorComponentFlags  colorWriteMask
	 */ 
	 private static native void setColorWriteMask0(Buffer ptr, int _colorWriteMask);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		 // code for simple past value 
		  vkObj->colorWriteMask = (VkColorComponentFlags) (_colorWriteMask);
	  */

	/**
	 * Native GET method for field colorWriteMask	[int]<br>
	 * Prototype: VkColorComponentFlags  colorWriteMask
	 */ 
	 private static native int getColorWriteMask0(Buffer ptr);/*
		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  return (jint) (vkObj->colorWriteMask);
	 */



} // end of class VkPipelineColorBlendAttachmentState
