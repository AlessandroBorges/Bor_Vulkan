/**
 * Class wrapping Vulkan's VkRect2D struct.
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
 *  This class is a Java front end for struct VkRect2D. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkRect2D {
 *     VkOffset2D    offset;
 *     VkExtent2D    extent;
 * } VkRect2D;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkRect2D extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [57]  */
	 private static final String TAG = "VkRect2D";

	/** ID of this structure [57]  */
	 public static final int TAG_ID = VKRECT2D_ID;

	/** P wrapper for THIS object */
	 private  P<VkRect2D> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkOffset2D 	offset	[vkstruct]
	 */ 
	 VkOffset2D 	offset;

	/**
	 *  VkExtent2D 	extent	[vkstruct]
	 */ 
	 VkExtent2D 	extent;

	/**
	 * Ctor
	 */
	public VkRect2D(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkRect2D(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkRect2D(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkRect2D(long address){ 
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
	 public static P<VkRect2D> createNullPointer(){
	        P<VkRect2D> p = new  P<VkRect2D>(new VkRect2D());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkRect2D> getP() {
	       if(p == null ){
	           p = new P<VkRect2D> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field offset	[vkstruct]<br>
	 * Prototype: VkOffset2D  offset
	 */ 
	 public void offset(VkOffset2D offset){
		 this.offset = offset;
		 ByteBuffer buff = (offset==null) ? null : offset.getPointer();
		 setOffset0(this.ptr, buff);
	 }

	/**
	 * Get method for field offset	[vkstruct]<br>
	 * Prototype: VkOffset2D  offset
	 */ 
	 public VkOffset2D offset(){
		 long pointer = getOffset0(super.ptr);
		 if(pointer == 0){
		    this.offset = null;
		    return null;
		  } 

		 if(this.offset == null){
		    this.offset = new VkOffset2D(pointer);
		 }else{
		    this.offset.setPointer(pointer);
		  }
		 return this.offset;
	 }

	/**
	 * Set method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent2D  extent
	 */ 
	 public void extent(VkExtent2D extent){
		 this.extent = extent;
		 ByteBuffer buff = (extent==null) ? null : extent.getPointer();
		 setExtent0(this.ptr, buff);
	 }

	/**
	 * Get method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent2D  extent
	 */ 
	 public VkExtent2D extent(){
		 long pointer = getExtent0(super.ptr);
		 if(pointer == 0){
		    this.extent = null;
		    return null;
		  } 

		 if(this.extent == null){
		    this.extent = new VkExtent2D(pointer);
		 }else{
		    this.extent.setPointer(pointer);
		  }
		 return this.extent;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field offset	[vkstruct]<br>
	 * Prototype: VkOffset2D  offset
	 */ 
	 private static native void setOffset0(Buffer ptr, java.nio.ByteBuffer  _offset);/*
		  VkRect2D* vkObj = (VkRect2D*)(ptr);
		  vkObj->offset = (VkOffset2D) (_offset);
	  */

	/**
	 * native GET method for field offset	[vkstruct]<br>
	 * Prototype: VkOffset2D  offset
	 */ 
	 private static native long getOffset0(Buffer ptr);/*
		  VkRect2D* vkObj = (VkRect2D*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->offset);	 */

	/**
	 * native SET method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent2D  extent
	 */ 
	 private static native void setExtent0(Buffer ptr, java.nio.ByteBuffer  _extent);/*
		  VkRect2D* vkObj = (VkRect2D*)(ptr);
		  vkObj->extent = (VkExtent2D) (_extent);
	  */

	/**
	 * native GET method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent2D  extent
	 */ 
	 private static native long getExtent0(Buffer ptr);/*
		  VkRect2D* vkObj = (VkRect2D*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->extent);	 */



} // end of class VkRect2D
