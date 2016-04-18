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

import java.nio.Buffer;


/**
 *  Project Bor-Vulkan 
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

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [93]  */
	 private static final String TAG = "VkImageBlit";

	/** ID of this structure [93]  */
	 public static final int TAG_ID = VKIMAGEBLIT_ID;

	/** P wrapper for THIS object */
	 private  P<VkImageBlit> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkImageSubresourceLayers 	srcSubresource	[vkstruct]
	 */ 
	 VkImageSubresourceLayers 	srcSubresource;

	/**
	 *  VkOffset3D[] 	srcOffsets	
	 */ 
	 VkOffset3D[] 	srcOffsets;

	/**
	 *  VkImageSubresourceLayers 	dstSubresource	[vkstruct]
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
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkImageBlit(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkImageBlit(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkImageBlit(long address){ 
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
	 public static P<VkImageBlit> createNullPointer(){
	        P<VkImageBlit> p = new  P<VkImageBlit>(new VkImageBlit());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkImageBlit> getP() {
	       if(p == null ){
	           p = new P<VkImageBlit> (this);
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
	 * Set method for field srcOffsets	<br>
	 * Prototype: VkOffset3D[]  srcOffsets
	 */ 
	 public void srcOffsets(VkOffset3D[] srcOffsets){
		 this.srcOffsets = srcOffsets;
		 setSrcOffsets0(this.ptr,  srcOffsets);
	 }

	/**
	 * Get method for field srcOffsets	<br>
	 * Prototype: VkOffset3D[]  srcOffsets
	 */ 
	 public VkOffset3D[] srcOffsets(){
		 VkOffset3D[] var = getSrcOffsets0(super.ptr);
		 this.srcOffsets = var;
		 return this.srcOffsets;
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
	 * Set method for field dstOffsets	<br>
	 * Prototype: VkOffset3D[]  dstOffsets
	 */ 
	 public void dstOffsets(VkOffset3D[] dstOffsets){
		 this.dstOffsets = dstOffsets;
		 setDstOffsets0(this.ptr,  dstOffsets);
	 }

	/**
	 * Get method for field dstOffsets	<br>
	 * Prototype: VkOffset3D[]  dstOffsets
	 */ 
	 public VkOffset3D[] dstOffsets(){
		 VkOffset3D[] var = getDstOffsets0(super.ptr);
		 this.dstOffsets = var;
		 return this.dstOffsets;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field srcSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 private static native void setSrcSubresource0(Buffer ptr, java.nio.ByteBuffer  _srcSubresource);/*
		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		  vkObj->srcSubresource = (VkImageSubresourceLayers) (_srcSubresource);
	  */

	/**
	 * native GET method for field srcSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 private static native long getSrcSubresource0(Buffer ptr);/*
		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->srcSubresource);	 */

	/**
	 * native SET method for field srcOffsets	<br>
	 * Prototype: VkOffset3D[]  srcOffsets
	 */ 
	 private static native void setSrcOffsets0(Buffer ptr, VkOffset3D[] _srcOffsets);/*
		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		  vkObj->srcOffsets = (VkOffset3D[]) (_srcOffsets);
	  */

	/**
	 * native GET method for field srcOffsets	<br>
	 * Prototype: VkOffset3D[]  srcOffsets
	 */ 
	 private static native VkOffset3D[] getSrcOffsets0(Buffer ptr);/*
		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		  return (VkOffset3D[]) (vkObj->srcOffsets);
	 */

	/**
	 * native SET method for field dstSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 private static native void setDstSubresource0(Buffer ptr, java.nio.ByteBuffer  _dstSubresource);/*
		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		  vkObj->dstSubresource = (VkImageSubresourceLayers) (_dstSubresource);
	  */

	/**
	 * native GET method for field dstSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 private static native long getDstSubresource0(Buffer ptr);/*
		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->dstSubresource);	 */

	/**
	 * native SET method for field dstOffsets	<br>
	 * Prototype: VkOffset3D[]  dstOffsets
	 */ 
	 private static native void setDstOffsets0(Buffer ptr, VkOffset3D[] _dstOffsets);/*
		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		  vkObj->dstOffsets = (VkOffset3D[]) (_dstOffsets);
	  */

	/**
	 * native GET method for field dstOffsets	<br>
	 * Prototype: VkOffset3D[]  dstOffsets
	 */ 
	 private static native VkOffset3D[] getDstOffsets0(Buffer ptr);/*
		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		  return (VkOffset3D[]) (vkObj->dstOffsets);
	 */



} // end of class VkImageBlit
