/**
 * Class wrapping Vulkan's VkImageBlit struct.
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
 *  This class is a Java front end for struct VkImageBlit. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkImageBlit {
 *     VkImageSubresourceLayers    srcSubresource;
 *     VkOffset3D                  srcOffsets[2];
 *     VkImageSubresourceLayers    dstSubresource;
 *     VkOffset3D                  dstOffsets[2];
 * } VkImageBlit;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkImageBlit extends VkStruct {
	/** TAG of this structure [217]  */
	 private static final String TAG = "VkImageBlit";

	/** ID of this structure [217]  */
	 public static final int TAG_ID = VKIMAGEBLIT_ID;

	 // fields //
	/**
	 *  VkImageSubresourceLayers 	srcSubresource 
	 */ 
	VkImageSubresourceLayers 	srcSubresource;

	/**
	 *  VkOffset3D[] 	srcOffsets 
	 */ 
	VkOffset3D[] 	srcOffsets;

	/**
	 *  VkImageSubresourceLayers 	dstSubresource 
	 */ 
	VkImageSubresourceLayers 	dstSubresource;

	/**
	 *  VkOffset3D[] 	dstOffsets 
	 */ 
	VkOffset3D[] 	dstOffsets;

	/**
	 * Ctor
	 */
	public VkImageBlit(){ 
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
	 * Set method for field srcSubresource
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 public void srcSubresource(VkImageSubresourceLayers srcSubresource){
		 this.srcSubresource = srcSubresource;
		srcSubresource0(super.ptr, srcSubresource);
	 }

	/**
	 * get method for field srcSubresource
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 public VkImageSubresourceLayers srcSubresource(){
		 // return  this.srcSubresource;
		 return srcSubresource0(super.ptr);
	 }

	/**
	 * Set method for field srcOffsets
	 * Prototype: VkOffset3D[]  srcOffsets
	 */ 
	 public void srcOffsets(VkOffset3D[] srcOffsets){
		 this.srcOffsets = srcOffsets;
		srcOffsets0(super.ptr, srcOffsets);
	 }

	/**
	 * get method for field srcOffsets
	 * Prototype: VkOffset3D[]  srcOffsets
	 */ 
	 public VkOffset3D[] srcOffsets(){
		 // return  this.srcOffsets;
		 return srcOffsets0(super.ptr);
	 }

	/**
	 * Set method for field dstSubresource
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 public void dstSubresource(VkImageSubresourceLayers dstSubresource){
		 this.dstSubresource = dstSubresource;
		dstSubresource0(super.ptr, dstSubresource);
	 }

	/**
	 * get method for field dstSubresource
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 public VkImageSubresourceLayers dstSubresource(){
		 // return  this.dstSubresource;
		 return dstSubresource0(super.ptr);
	 }

	/**
	 * Set method for field dstOffsets
	 * Prototype: VkOffset3D[]  dstOffsets
	 */ 
	 public void dstOffsets(VkOffset3D[] dstOffsets){
		 this.dstOffsets = dstOffsets;
		dstOffsets0(super.ptr, dstOffsets);
	 }

	/**
	 * get method for field dstOffsets
	 * Prototype: VkOffset3D[]  dstOffsets
	 */ 
	 public VkOffset3D[] dstOffsets(){
		 // return  this.dstOffsets;
		 return dstOffsets0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field srcSubresource
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 private static native void srcSubresource0(ByteBuffer ptr, VkImageSubresourceLayers _srcSubresource);/*
		  VkImageBlit _obj = (VkImageBlit)(*ptr);
		  _obj.srcSubresource = (VkImageSubresourceLayers) (_srcSubresource);
	  */

	/**
	 * get method for field srcSubresource
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 private static native VkImageSubresourceLayers srcSubresource0(ByteBuffer ptr);/*
		  VkImageBlit _obj = (VkImageBlit)(ptr);
		  return (VkImageSubresourceLayers) (_obj.VkImageSubresourceLayers);
	 */

	/**
	 * native Set method for field srcOffsets
	 * Prototype: VkOffset3D[]  srcOffsets
	 */ 
	 private static native void srcOffsets0(ByteBuffer ptr, VkOffset3D[] _srcOffsets);/*
		  VkImageBlit _obj = (VkImageBlit)(*ptr);
		  _obj.srcOffsets = (VkOffset3D[]) (_srcOffsets);
	  */

	/**
	 * get method for field srcOffsets
	 * Prototype: VkOffset3D[]  srcOffsets
	 */ 
	 private static native VkOffset3D[] srcOffsets0(ByteBuffer ptr);/*
		  VkImageBlit _obj = (VkImageBlit)(ptr);
		  return (VkOffset3D[]) (_obj.VkOffset3D[]);
	 */

	/**
	 * native Set method for field dstSubresource
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 private static native void dstSubresource0(ByteBuffer ptr, VkImageSubresourceLayers _dstSubresource);/*
		  VkImageBlit _obj = (VkImageBlit)(*ptr);
		  _obj.dstSubresource = (VkImageSubresourceLayers) (_dstSubresource);
	  */

	/**
	 * get method for field dstSubresource
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 private static native VkImageSubresourceLayers dstSubresource0(ByteBuffer ptr);/*
		  VkImageBlit _obj = (VkImageBlit)(ptr);
		  return (VkImageSubresourceLayers) (_obj.VkImageSubresourceLayers);
	 */

	/**
	 * native Set method for field dstOffsets
	 * Prototype: VkOffset3D[]  dstOffsets
	 */ 
	 private static native void dstOffsets0(ByteBuffer ptr, VkOffset3D[] _dstOffsets);/*
		  VkImageBlit _obj = (VkImageBlit)(*ptr);
		  _obj.dstOffsets = (VkOffset3D[]) (_dstOffsets);
	  */

	/**
	 * get method for field dstOffsets
	 * Prototype: VkOffset3D[]  dstOffsets
	 */ 
	 private static native VkOffset3D[] dstOffsets0(ByteBuffer ptr);/*
		  VkImageBlit _obj = (VkImageBlit)(ptr);
		  return (VkOffset3D[]) (_obj.VkOffset3D[]);
	 */



} // end of class VkImageBlit
