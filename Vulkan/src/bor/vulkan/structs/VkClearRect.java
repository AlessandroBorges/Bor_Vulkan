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

import java.nio.Buffer;


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
		 ByteBuffer buff = (rect==null) ? null : rect.getPointerStruct();
		 rect0(this.ptr, buff);
	 }

	/**
	 * Get method for field rect	[vkstruct]<br>
	 * Prototype: VkRect2D  rect
	 */ 
	 public VkRect2D rect(){
		 ByteBuffer pointer = rect0(super.ptr);
		 if(pointer == null){
		    this.rect = null;
		    return null;
		  } else 
 		 if(this.rect == null){
		    this.rect = new VkRect2D(pointer);
		 }else{
		    this.rect.setPointer(pointer);
		  }
		 return this.rect;
	 }

	/**
	 * Set method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 public void baseArrayLayer(int baseArrayLayer){
		 this.baseArrayLayer = baseArrayLayer;
		 baseArrayLayer0(this.ptr,  baseArrayLayer);
	 }

	/**
	 * Get method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 public int baseArrayLayer(){
		 int var = baseArrayLayer0(super.ptr);
		 this.baseArrayLayer = var;
		 return this.baseArrayLayer;
	 }

	/**
	 * Set method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 public void layerCount(int layerCount){
		 this.layerCount = layerCount;
		 layerCount0(this.ptr,  layerCount);
	 }

	/**
	 * Get method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 public int layerCount(){
		 int var = layerCount0(super.ptr);
		 this.layerCount = var;
		 return this.layerCount;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field rect	[vkstruct]<br>
	 * Prototype: VkRect2D  rect
	 */ 
	 private static native void rect0(Buffer ptr, java.nio.ByteBuffer  _rect);/*
		  VkClearRect* vkObj = (VkClearRect*)(ptr);
		  vkObj->rect = (VkRect2D) (_rect);
	  */

	/**
	 * native GET method for field rect	[vkstruct]<br>
	 * Prototype: VkRect2D  rect
	 */ 
	 private static native java.nio.ByteBuffer  rect0(Buffer ptr);/*
		  VkClearRect vkObj = (VkClearRect*)(ptr);
		  return (VkRect2D) (vkObj->rect);
	 */

	/**
	 * native SET method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 private static native void baseArrayLayer0(Buffer ptr, int _baseArrayLayer);/*
		  VkClearRect* vkObj = (VkClearRect*)(ptr);
		  vkObj->baseArrayLayer = (uint32_t) (_baseArrayLayer);
	  */

	/**
	 * native GET method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 private static native int baseArrayLayer0(Buffer ptr);/*
		  VkClearRect vkObj = (VkClearRect*)(ptr);
		  return (jint) (vkObj->baseArrayLayer);
	 */

	/**
	 * native SET method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 private static native void layerCount0(Buffer ptr, int _layerCount);/*
		  VkClearRect* vkObj = (VkClearRect*)(ptr);
		  vkObj->layerCount = (uint32_t) (_layerCount);
	  */

	/**
	 * native GET method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 private static native int layerCount0(Buffer ptr);/*
		  VkClearRect vkObj = (VkClearRect*)(ptr);
		  return (jint) (vkObj->layerCount);
	 */



} // end of class VkClearRect
