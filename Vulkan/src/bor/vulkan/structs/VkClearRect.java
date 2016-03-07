/**
 * Class wrapping Vulkan's VkClearRect struct.
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
 *  Project Bor-Vulkan 
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkClearRect. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkClearRect {
 *     VkRect2D    rect;
 *     uint32_t    baseArrayLayer;
 *     uint32_t    layerCount;
 * } VkClearRect;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkClearRect extends VkStruct {
	/** TAG of this structure [97]  */
	 private static final String TAG = "VkClearRect";

	/** ID of this structure [97]  */
	 public static final int TAG_ID = VKCLEARRECT_ID;

	/** P wrapper for THIS object */
	 private  P<VkClearRect> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkRect2D 	rect	[vkstruct]
	 */ 
	 VkRect2D 	rect;

	/**
	 *  uint32_t 	baseArrayLayer	[int]
	 */ 
	 int 	baseArrayLayer;

	/**
	 *  uint32_t 	layerCount	[int]
	 */ 
	 int 	layerCount;

	/**
	 * Ctor
	 */
	public VkClearRect(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkClearRect(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkClearRect(long address, int memSize){ 
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
	 public static P<VkClearRect> createNullPointer(){
	        P<VkClearRect> p = new  P<VkClearRect>(new VkClearRect());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkClearRect> getP() {
	       if(p == null ){
	           p = new P<VkClearRect> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field rect	[vkstruct]<br>
	 * Prototype: VkRect2D  rect
	 */ 
	 public void rect(VkRect2D rect){
		 this.rect = rect;
		rect0(super.ptr, rect);
	 }

	/**
	 * get method for field rect	[vkstruct]<br>
	 * Prototype: VkRect2D  rect
	 */ 
	 public VkRect2D rect(){
		 // return  this.rect;
		 return rect0(super.ptr);
	 }

	/**
	 * Set method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 public void baseArrayLayer(int baseArrayLayer){
		 this.baseArrayLayer = baseArrayLayer;
		baseArrayLayer0(super.ptr, baseArrayLayer);
	 }

	/**
	 * get method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 public int baseArrayLayer(){
		 // return  this.baseArrayLayer;
		 return baseArrayLayer0(super.ptr);
	 }

	/**
	 * Set method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 public void layerCount(int layerCount){
		 this.layerCount = layerCount;
		layerCount0(super.ptr, layerCount);
	 }

	/**
	 * get method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 public int layerCount(){
		 // return  this.layerCount;
		 return layerCount0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field rect	[vkstruct]<br>
	 * Prototype: VkRect2D  rect
	 */ 
	 private static native void rect0(ByteBuffer ptr, VkRect2D _rect);/*
		  VkClearRect _obj = (VkClearRect)(*ptr);
		  _obj.rect = (VkRect2D) (_rect);
	  */

	/**
	 * native GET method for field rect	[vkstruct]<br>
	 * Prototype: VkRect2D  rect
	 */ 
	 private static native VkRect2D rect0(ByteBuffer ptr);/*
		  VkClearRect _obj = (VkClearRect)(ptr);
		  return (VkRect2D) (_obj.VkRect2D);
	 */

	/**
	 * native SET method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 private static native void baseArrayLayer0(ByteBuffer ptr, int _baseArrayLayer);/*
		  VkClearRect _obj = (VkClearRect)(*ptr);
		  _obj.baseArrayLayer = (uint32_t) (_baseArrayLayer);
	  */

	/**
	 * native GET method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 private static native int baseArrayLayer0(ByteBuffer ptr);/*
		  VkClearRect _obj = (VkClearRect)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 private static native void layerCount0(ByteBuffer ptr, int _layerCount);/*
		  VkClearRect _obj = (VkClearRect)(*ptr);
		  _obj.layerCount = (uint32_t) (_layerCount);
	  */

	/**
	 * native GET method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 private static native int layerCount0(ByteBuffer ptr);/*
		  VkClearRect _obj = (VkClearRect)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkClearRect
