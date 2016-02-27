// class wrapping Vulkan's VkClearRect struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkClearRect 
 * @Author Alessandro Borges 
 */
public class VkClearRect extends VkStruct {
	/** ID of this structure [97]  */
	 public static final int TAG = VKCLEARRECT_ID;

	 // fields //
	/**
	 *  VkRect2D 	rect 
	 */ 
	VkRect2D 	rect;

	/**
	 *  uint32_t 	baseArrayLayer 
	 */ 
	int 	baseArrayLayer;

	/**
	 *  uint32_t 	layerCount 
	 */ 
	int 	layerCount;

	/**
	 * Ctor
	 */
	public VkClearRect(){ 
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
	 * Set method for field rect
	 * Prototype: VkRect2D  rect
	 */ 
	 public void rect(VkRect2D rect){
		 this.rect = rect;
		rect0(super.ptr, rect);
	 }

	/**
	 * get method for field rect
	 * Prototype: VkRect2D  rect
	 */ 
	 public VkRect2D rect(){
		 // return  this.rect;
		 return rect0(super.ptr);
	 }

	/**
	 * Set method for field baseArrayLayer
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 public void baseArrayLayer(int baseArrayLayer){
		 this.baseArrayLayer = baseArrayLayer;
		baseArrayLayer0(super.ptr, baseArrayLayer);
	 }

	/**
	 * get method for field baseArrayLayer
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 public int baseArrayLayer(){
		 // return  this.baseArrayLayer;
		 return baseArrayLayer0(super.ptr);
	 }

	/**
	 * Set method for field layerCount
	 * Prototype: uint32_t  layerCount
	 */ 
	 public void layerCount(int layerCount){
		 this.layerCount = layerCount;
		layerCount0(super.ptr, layerCount);
	 }

	/**
	 * get method for field layerCount
	 * Prototype: uint32_t  layerCount
	 */ 
	 public int layerCount(){
		 // return  this.layerCount;
		 return layerCount0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field rect
	 * Prototype: VkRect2D  rect
	 */ 
	 private static native void rect0(ByteBuffer ptr, VkRect2D _rect);/*
		  VkClearRect _obj = (VkClearRect)(*ptr);
		  _obj.rect = (VkRect2D) (_rect);
	  */

	/**
	 * get method for field rect
	 * Prototype: VkRect2D  rect
	 */ 
	 private static native VkRect2D rect0(ByteBuffer ptr);/*
		  VkClearRect _obj = (VkClearRect)(ptr);
		  return (VkRect2D) (_obj.VkRect2D);
	 */

	/**
	 * native Set method for field baseArrayLayer
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 private static native void baseArrayLayer0(ByteBuffer ptr, int _baseArrayLayer);/*
		  VkClearRect _obj = (VkClearRect)(*ptr);
		  _obj.baseArrayLayer = (uint32_t) (_baseArrayLayer);
	  */

	/**
	 * get method for field baseArrayLayer
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 private static native int baseArrayLayer0(ByteBuffer ptr);/*
		  VkClearRect _obj = (VkClearRect)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field layerCount
	 * Prototype: uint32_t  layerCount
	 */ 
	 private static native void layerCount0(ByteBuffer ptr, int _layerCount);/*
		  VkClearRect _obj = (VkClearRect)(*ptr);
		  _obj.layerCount = (uint32_t) (_layerCount);
	  */

	/**
	 * get method for field layerCount
	 * Prototype: uint32_t  layerCount
	 */ 
	 private static native int layerCount0(ByteBuffer ptr);/*
		  VkClearRect _obj = (VkClearRect)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkClearRect
