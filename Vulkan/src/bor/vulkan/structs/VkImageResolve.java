/**
 * Class wrapping Vulkan's VkImageResolve struct.
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
 *  This class is a Java front end for struct VkImageResolve. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkImageResolve {
 *     VkImageSubresourceLayers    srcSubresource;
 *     VkOffset3D                  srcOffset;
 *     VkImageSubresourceLayers    dstSubresource;
 *     VkOffset3D                  dstOffset;
 *     VkExtent3D                  extent;
 * } VkImageResolve;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkImageResolve extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [98]  */
	 private static final String TAG = "VkImageResolve";

	/** ID of this structure [98]  */
	 public static final int TAG_ID = VKIMAGERESOLVE_ID;

	/** P wrapper for THIS object */
	 private  P<VkImageResolve> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkImageSubresourceLayers 	srcSubresource	[vkstruct]
	 */ 
	 VkImageSubresourceLayers 	srcSubresource;

	/**
	 *  VkOffset3D 	srcOffset	[vkstruct]
	 */ 
	 VkOffset3D 	srcOffset;

	/**
	 *  VkImageSubresourceLayers 	dstSubresource	[vkstruct]
	 */ 
	 VkImageSubresourceLayers 	dstSubresource;

	/**
	 *  VkOffset3D 	dstOffset	[vkstruct]
	 */ 
	 VkOffset3D 	dstOffset;

	/**
	 *  VkExtent3D 	extent	[vkstruct]
	 */ 
	 VkExtent3D 	extent;

	/**
	 * Ctor
	 */
	public VkImageResolve(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkImageResolve(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkImageResolve(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkImageResolve(long address){ 
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
	 public static P<VkImageResolve> createNullPointer(){
	        P<VkImageResolve> p = new  P<VkImageResolve>(new VkImageResolve());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkImageResolve> getP() {
	       if(p == null ){
	           p = new P<VkImageResolve> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field srcSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 public void srcSubresource(VkImageSubresourceLayers srcSubresource){
		 this.srcSubresource = srcSubresource;
		 ByteBuffer buff = (srcSubresource==null) ? null : srcSubresource.getPointer();
		 setSrcSubresource0(this.ptr, buff);
	 }

	/**
	 * Get method for field srcSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 public VkImageSubresourceLayers srcSubresource(){
		 long pointer = getSrcSubresource0(super.ptr);
		 if(pointer == 0){
		    this.srcSubresource = null;
		    return null;
		  } 

		 if(this.srcSubresource == null){
		    this.srcSubresource = new VkImageSubresourceLayers(pointer);
		 }else{
		    this.srcSubresource.setPointer(pointer);
		  }
		 return this.srcSubresource;
	 }

	/**
	 * Set method for field srcOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  srcOffset
	 */ 
	 public void srcOffset(VkOffset3D srcOffset){
		 this.srcOffset = srcOffset;
		 ByteBuffer buff = (srcOffset==null) ? null : srcOffset.getPointer();
		 setSrcOffset0(this.ptr, buff);
	 }

	/**
	 * Get method for field srcOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  srcOffset
	 */ 
	 public VkOffset3D srcOffset(){
		 long pointer = getSrcOffset0(super.ptr);
		 if(pointer == 0){
		    this.srcOffset = null;
		    return null;
		  } 

		 if(this.srcOffset == null){
		    this.srcOffset = new VkOffset3D(pointer);
		 }else{
		    this.srcOffset.setPointer(pointer);
		  }
		 return this.srcOffset;
	 }

	/**
	 * Set method for field dstSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 public void dstSubresource(VkImageSubresourceLayers dstSubresource){
		 this.dstSubresource = dstSubresource;
		 ByteBuffer buff = (dstSubresource==null) ? null : dstSubresource.getPointer();
		 setDstSubresource0(this.ptr, buff);
	 }

	/**
	 * Get method for field dstSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 public VkImageSubresourceLayers dstSubresource(){
		 long pointer = getDstSubresource0(super.ptr);
		 if(pointer == 0){
		    this.dstSubresource = null;
		    return null;
		  } 

		 if(this.dstSubresource == null){
		    this.dstSubresource = new VkImageSubresourceLayers(pointer);
		 }else{
		    this.dstSubresource.setPointer(pointer);
		  }
		 return this.dstSubresource;
	 }

	/**
	 * Set method for field dstOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  dstOffset
	 */ 
	 public void dstOffset(VkOffset3D dstOffset){
		 this.dstOffset = dstOffset;
		 ByteBuffer buff = (dstOffset==null) ? null : dstOffset.getPointer();
		 setDstOffset0(this.ptr, buff);
	 }

	/**
	 * Get method for field dstOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  dstOffset
	 */ 
	 public VkOffset3D dstOffset(){
		 long pointer = getDstOffset0(super.ptr);
		 if(pointer == 0){
		    this.dstOffset = null;
		    return null;
		  } 

		 if(this.dstOffset == null){
		    this.dstOffset = new VkOffset3D(pointer);
		 }else{
		    this.dstOffset.setPointer(pointer);
		  }
		 return this.dstOffset;
	 }

	/**
	 * Set method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 public void extent(VkExtent3D extent){
		 this.extent = extent;
		 ByteBuffer buff = (extent==null) ? null : extent.getPointer();
		 setExtent0(this.ptr, buff);
	 }

	/**
	 * Get method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 public VkExtent3D extent(){
		 long pointer = getExtent0(super.ptr);
		 if(pointer == 0){
		    this.extent = null;
		    return null;
		  } 

		 if(this.extent == null){
		    this.extent = new VkExtent3D(pointer);
		 }else{
		    this.extent.setPointer(pointer);
		  }
		 return this.extent;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field srcSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 private static native void setSrcSubresource0(Buffer ptr, java.nio.ByteBuffer  _srcSubresource);/*
		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		  vkObj->srcSubresource = (VkImageSubresourceLayers) (_srcSubresource);
	  */

	/**
	 * native GET method for field srcSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 private static native long getSrcSubresource0(Buffer ptr);/*
		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->srcSubresource);	 */

	/**
	 * native SET method for field srcOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  srcOffset
	 */ 
	 private static native void setSrcOffset0(Buffer ptr, java.nio.ByteBuffer  _srcOffset);/*
		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		  vkObj->srcOffset = (VkOffset3D) (_srcOffset);
	  */

	/**
	 * native GET method for field srcOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  srcOffset
	 */ 
	 private static native long getSrcOffset0(Buffer ptr);/*
		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->srcOffset);	 */

	/**
	 * native SET method for field dstSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 private static native void setDstSubresource0(Buffer ptr, java.nio.ByteBuffer  _dstSubresource);/*
		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		  vkObj->dstSubresource = (VkImageSubresourceLayers) (_dstSubresource);
	  */

	/**
	 * native GET method for field dstSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 private static native long getDstSubresource0(Buffer ptr);/*
		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->dstSubresource);	 */

	/**
	 * native SET method for field dstOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  dstOffset
	 */ 
	 private static native void setDstOffset0(Buffer ptr, java.nio.ByteBuffer  _dstOffset);/*
		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		  vkObj->dstOffset = (VkOffset3D) (_dstOffset);
	  */

	/**
	 * native GET method for field dstOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  dstOffset
	 */ 
	 private static native long getDstOffset0(Buffer ptr);/*
		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->dstOffset);	 */

	/**
	 * native SET method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 private static native void setExtent0(Buffer ptr, java.nio.ByteBuffer  _extent);/*
		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		  vkObj->extent = (VkExtent3D) (_extent);
	  */

	/**
	 * native GET method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 private static native long getExtent0(Buffer ptr);/*
		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->extent);	 */



} // end of class VkImageResolve
