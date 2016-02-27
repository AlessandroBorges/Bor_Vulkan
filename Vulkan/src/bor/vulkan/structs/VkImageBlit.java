// class wrapping Vulkan's VkImageBlit struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkImageBlit 
 * @Author Alessandro Borges 
 */
public class VkImageBlit extends VkStruct {
	/** ID of this structure [93]  */
	 public static final int TAG = VKIMAGEBLIT_ID;

	 // fields //
	/**
	 *  VkImageSubresourceLayers 	srcSubresource 
	 */ 
	VkImageSubresourceLayers 	srcSubresource;

	/**
	 *  VkOffset3D[] 	srcOffsets /* length=2 */ 
	 */ 
	VkOffset3D[] 	srcOffsets /* length=2 */;

	/**
	 *  VkImageSubresourceLayers 	dstSubresource 
	 */ 
	VkImageSubresourceLayers 	dstSubresource;

	/**
	 *  VkOffset3D[] 	dstOffsets /* length=2 */ 
	 */ 
	VkOffset3D[] 	dstOffsets /* length=2 */;

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
		 return sizeOf(TAG); 
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
	 * Set method for field srcOffsets /* length=2 */
	 * Prototype: VkOffset3D[]  srcOffsets /* length=2 */
	 */ 
	 public void srcOffsets /* length=2 */(VkOffset3D[] srcOffsets /* length=2 */){
		 this.srcOffsets /* length=2 */ = srcOffsets /* length=2 */;
		srcOffsets /* length=2 */0(super.ptr, srcOffsets /* length=2 */);
	 }

	/**
	 * get method for field srcOffsets /* length=2 */
	 * Prototype: VkOffset3D[]  srcOffsets /* length=2 */
	 */ 
	 public VkOffset3D[] srcOffsets /* length=2 */(){
		 // return  this.srcOffsets /* length=2 */;
		 return srcOffsets /* length=2 */0(super.ptr);
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
	 * Set method for field dstOffsets /* length=2 */
	 * Prototype: VkOffset3D[]  dstOffsets /* length=2 */
	 */ 
	 public void dstOffsets /* length=2 */(VkOffset3D[] dstOffsets /* length=2 */){
		 this.dstOffsets /* length=2 */ = dstOffsets /* length=2 */;
		dstOffsets /* length=2 */0(super.ptr, dstOffsets /* length=2 */);
	 }

	/**
	 * get method for field dstOffsets /* length=2 */
	 * Prototype: VkOffset3D[]  dstOffsets /* length=2 */
	 */ 
	 public VkOffset3D[] dstOffsets /* length=2 */(){
		 // return  this.dstOffsets /* length=2 */;
		 return dstOffsets /* length=2 */0(super.ptr);
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
	 * native Set method for field srcOffsets /* length=2 */
	 * Prototype: VkOffset3D[]  srcOffsets /* length=2 */
	 */ 
	 private static native void srcOffsets /* length=2 */0(ByteBuffer ptr, VkOffset3D[] _srcOffsets /* length=2 */);/*
		  VkImageBlit _obj = (VkImageBlit)(*ptr);
		  _obj.srcOffsets /* length=2 */ = (VkOffset3D[]) (_srcOffsets /* length=2 */);
	  */

	/**
	 * get method for field srcOffsets /* length=2 */
	 * Prototype: VkOffset3D[]  srcOffsets /* length=2 */
	 */ 
	 private static native VkOffset3D[] srcOffsets /* length=2 */0(ByteBuffer ptr);/*
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
	 * native Set method for field dstOffsets /* length=2 */
	 * Prototype: VkOffset3D[]  dstOffsets /* length=2 */
	 */ 
	 private static native void dstOffsets /* length=2 */0(ByteBuffer ptr, VkOffset3D[] _dstOffsets /* length=2 */);/*
		  VkImageBlit _obj = (VkImageBlit)(*ptr);
		  _obj.dstOffsets /* length=2 */ = (VkOffset3D[]) (_dstOffsets /* length=2 */);
	  */

	/**
	 * get method for field dstOffsets /* length=2 */
	 * Prototype: VkOffset3D[]  dstOffsets /* length=2 */
	 */ 
	 private static native VkOffset3D[] dstOffsets /* length=2 */0(ByteBuffer ptr);/*
		  VkImageBlit _obj = (VkImageBlit)(ptr);
		  return (VkOffset3D[]) (_obj.VkOffset3D[]);
	 */



} // end of class VkImageBlit
