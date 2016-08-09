/**
 * Class wrapping Vulkan's VkSubresourceLayout struct.
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
 *  This class is a Java front end for struct VkSubresourceLayout. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSubresourceLayout {
 *     VkDeviceSize    offset;
 *     VkDeviceSize    size;
 *     VkDeviceSize    rowPitch;
 *     VkDeviceSize    arrayPitch;
 *     VkDeviceSize    depthPitch;
 * } VkSubresourceLayout;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkSubresourceLayout extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [40]  */
	 private static final String TAG = "VkSubresourceLayout";

	/** ID of this structure [40]  */
	 public static final int TAG_ID = VKSUBRESOURCELAYOUT_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkDeviceSize 	offset	[long]
	 */ 
	long 	offset;
	
	/**
	 *  VkDeviceSize 	size	[long]
	 */ 
	long 	size;
	
	/**
	 *  VkDeviceSize 	rowPitch	[long]
	 */ 
	long 	rowPitch;
	
	/**
	 *  VkDeviceSize 	arrayPitch	[long]
	 */ 
	long 	arrayPitch;
	
	/**
	 *  VkDeviceSize 	depthPitch	[long]
	 */ 
	long 	depthPitch;
	/**
	 * Ctor
	 */
	public VkSubresourceLayout(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSubresourceLayout(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkSubresourceLayout(long address){ 
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
	 * Set method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 * 
	 * @param offset - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkSubresourceLayout offset(long offset){
		 this.offset = offset;
		 setOffset0(this.ptr,  offset);
		 return this;
	 }

	/**
	 * Get method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 public long offset(){
		 long var = getOffset0(super.ptr);
		 this.offset = var;
		 return this.offset;
	 }

	/**
	 * Set method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 * 
	 * @param size - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkSubresourceLayout size(long size){
		 this.size = size;
		 setSize0(this.ptr,  size);
		 return this;
	 }

	/**
	 * Get method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 public long size(){
		 long var = getSize0(super.ptr);
		 this.size = var;
		 return this.size;
	 }

	/**
	 * Set method for field rowPitch	[long]<br>
	 * Prototype: VkDeviceSize  rowPitch
	 * 
	 * @param rowPitch - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkSubresourceLayout rowPitch(long rowPitch){
		 this.rowPitch = rowPitch;
		 setRowPitch0(this.ptr,  rowPitch);
		 return this;
	 }

	/**
	 * Get method for field rowPitch	[long]<br>
	 * Prototype: VkDeviceSize  rowPitch
	 */ 
	 public long rowPitch(){
		 long var = getRowPitch0(super.ptr);
		 this.rowPitch = var;
		 return this.rowPitch;
	 }

	/**
	 * Set method for field arrayPitch	[long]<br>
	 * Prototype: VkDeviceSize  arrayPitch
	 * 
	 * @param arrayPitch - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkSubresourceLayout arrayPitch(long arrayPitch){
		 this.arrayPitch = arrayPitch;
		 setArrayPitch0(this.ptr,  arrayPitch);
		 return this;
	 }

	/**
	 * Get method for field arrayPitch	[long]<br>
	 * Prototype: VkDeviceSize  arrayPitch
	 */ 
	 public long arrayPitch(){
		 long var = getArrayPitch0(super.ptr);
		 this.arrayPitch = var;
		 return this.arrayPitch;
	 }

	/**
	 * Set method for field depthPitch	[long]<br>
	 * Prototype: VkDeviceSize  depthPitch
	 * 
	 * @param depthPitch - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkSubresourceLayout depthPitch(long depthPitch){
		 this.depthPitch = depthPitch;
		 setDepthPitch0(this.ptr,  depthPitch);
		 return this;
	 }

	/**
	 * Get method for field depthPitch	[long]<br>
	 * Prototype: VkDeviceSize  depthPitch
	 */ 
	 public long depthPitch(){
		 long var = getDepthPitch0(super.ptr);
		 this.depthPitch = var;
		 return this.depthPitch;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkSubresourceLayout [ ")
				.append("offset: ").append(offset() )
				.append(",\n size: ")
				.append(size() )
				.append(",\n rowPitch: ")
				.append(rowPitch() )
				.append(",\n arrayPitch: ")
				.append(arrayPitch() )
				.append(",\n depthPitch: ")
				.append(depthPitch() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native void setOffset0(Buffer ptr, long _offset);/*
		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		  vkObj->offset = (VkDeviceSize) (_offset);
	  */

	/**
	 * Native GET method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native long getOffset0(Buffer ptr);/*
		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		  return (jlong) (vkObj->offset);
	 */

	/**
	 * Native SET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native void setSize0(Buffer ptr, long _size);/*
		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		  vkObj->size = (VkDeviceSize) (_size);
	  */

	/**
	 * Native GET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native long getSize0(Buffer ptr);/*
		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		  return (jlong) (vkObj->size);
	 */

	/**
	 * Native SET method for field rowPitch	[long]<br>
	 * Prototype: VkDeviceSize  rowPitch
	 */ 
	 private static native void setRowPitch0(Buffer ptr, long _rowPitch);/*
		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		  vkObj->rowPitch = (VkDeviceSize) (_rowPitch);
	  */

	/**
	 * Native GET method for field rowPitch	[long]<br>
	 * Prototype: VkDeviceSize  rowPitch
	 */ 
	 private static native long getRowPitch0(Buffer ptr);/*
		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		  return (jlong) (vkObj->rowPitch);
	 */

	/**
	 * Native SET method for field arrayPitch	[long]<br>
	 * Prototype: VkDeviceSize  arrayPitch
	 */ 
	 private static native void setArrayPitch0(Buffer ptr, long _arrayPitch);/*
		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		  vkObj->arrayPitch = (VkDeviceSize) (_arrayPitch);
	  */

	/**
	 * Native GET method for field arrayPitch	[long]<br>
	 * Prototype: VkDeviceSize  arrayPitch
	 */ 
	 private static native long getArrayPitch0(Buffer ptr);/*
		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		  return (jlong) (vkObj->arrayPitch);
	 */

	/**
	 * Native SET method for field depthPitch	[long]<br>
	 * Prototype: VkDeviceSize  depthPitch
	 */ 
	 private static native void setDepthPitch0(Buffer ptr, long _depthPitch);/*
		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		  vkObj->depthPitch = (VkDeviceSize) (_depthPitch);
	  */

	/**
	 * Native GET method for field depthPitch	[long]<br>
	 * Prototype: VkDeviceSize  depthPitch
	 */ 
	 private static native long getDepthPitch0(Buffer ptr);/*
		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		  return (jlong) (vkObj->depthPitch);
	 */



} // end of class VkSubresourceLayout
