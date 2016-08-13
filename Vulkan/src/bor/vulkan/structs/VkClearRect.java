/**
 * Class wrapping Vulkan's VkClearRect struct.
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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkClearRect extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [97]  */
	 private static final String TAG = "VkClearRect";

	/** ID of this structure [97]  */
	 public static final int TAG_ID = VKCLEARRECT_ID;

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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkClearRect(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkClearRect(long address){ 
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
	 * Set method for field rect	[vkstruct]<br>
	 * Prototype: VkRect2D  rect
	 * 
	 * @param rect - a instance of VkRect2D.
	 * @return this VkStruct instance.
	 */ 
	 public VkClearRect rect(VkRect2D rect){
		 this.rect = rect;
		 ByteBuffer buff = (rect==null) ? null : rect.getPointer();
		 setRect0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field rect	[vkstruct]<br>
	 * Prototype: VkRect2D  rect
	 */ 
	 public VkRect2D rect(){
		 long pointer = getRect0(super.ptr);
		 if(pointer == 0){
		    this.rect = null;
		    return null;
		  } 

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
	 * 
	 * @param baseArrayLayer - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkClearRect baseArrayLayer(int baseArrayLayer){
		 this.baseArrayLayer = baseArrayLayer;
		 setBaseArrayLayer0(this.ptr,  baseArrayLayer);
		 return this;
	 }

	/**
	 * Get method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 public int baseArrayLayer(){
		 int var = getBaseArrayLayer0(super.ptr);
		 this.baseArrayLayer = var;
		 return this.baseArrayLayer;
	 }

	/**
	 * Set method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 * 
	 * @param layerCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkClearRect layerCount(int layerCount){
		 this.layerCount = layerCount;
		 setLayerCount0(this.ptr,  layerCount);
		 return this;
	 }

	/**
	 * Get method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 public int layerCount(){
		 int var = getLayerCount0(super.ptr);
		 this.layerCount = var;
		 return this.layerCount;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkClearRect [ ")
				.append("rect: ").append(rect() )
				.append(",\n baseArrayLayer: ")
				.append(baseArrayLayer() )
				.append(",\n layerCount: ")
				.append(layerCount() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field rect	[vkstruct]<br>
	 * Prototype: VkRect2D  rect
	 */ 
	 private static native void setRect0(Buffer ptr, java.nio.ByteBuffer  _rect);/*
		  VkClearRect* vkObj = (VkClearRect*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkRect2D* p_rect = (VkRect2D*) _rect; 
		 vkObj->rect = (*p_rect); 
	  */

	/**
	 * Native GET method for field rect	[vkstruct]<br>
	 * Prototype: VkRect2D  rect
	 */ 
	 private static native long getRect0(Buffer ptr);/*
		  VkClearRect* vkObj = (VkClearRect*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->rect);
	 */

	/**
	 * Native SET method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 private static native void setBaseArrayLayer0(Buffer ptr, int _baseArrayLayer);/*
		  VkClearRect* vkObj = (VkClearRect*)(ptr);
		 // code for simple past value 
		  vkObj->baseArrayLayer = (uint32_t) (_baseArrayLayer);
	  */

	/**
	 * Native GET method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 private static native int getBaseArrayLayer0(Buffer ptr);/*
		  VkClearRect* vkObj = (VkClearRect*)(ptr);
		  return (jint) (vkObj->baseArrayLayer);
	 */

	/**
	 * Native SET method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 private static native void setLayerCount0(Buffer ptr, int _layerCount);/*
		  VkClearRect* vkObj = (VkClearRect*)(ptr);
		 // code for simple past value 
		  vkObj->layerCount = (uint32_t) (_layerCount);
	  */

	/**
	 * Native GET method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 private static native int getLayerCount0(Buffer ptr);/*
		  VkClearRect* vkObj = (VkClearRect*)(ptr);
		  return (jint) (vkObj->layerCount);
	 */



} // end of class VkClearRect
