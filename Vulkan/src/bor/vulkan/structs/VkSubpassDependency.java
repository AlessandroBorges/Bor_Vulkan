/**
 * Class wrapping Vulkan's VkSubpassDependency struct.
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
 *  This class is a Java front end for struct VkSubpassDependency. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSubpassDependency {
 *     uint32_t                srcSubpass;
 *     uint32_t                dstSubpass;
 *     VkPipelineStageFlags    srcStageMask;
 *     VkPipelineStageFlags    dstStageMask;
 *     VkAccessFlags           srcAccessMask;
 *     VkAccessFlags           dstAccessMask;
 *     VkDependencyFlags       dependencyFlags;
 * } VkSubpassDependency;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkSubpassDependency extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [84]  */
	 private static final String TAG = "VkSubpassDependency";

	/** ID of this structure [84]  */
	 public static final int TAG_ID = VKSUBPASSDEPENDENCY_ID;

	/** P wrapper for THIS object */
	 private  P<VkSubpassDependency> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  uint32_t 	srcSubpass	[int]
	 */ 
	 int 	srcSubpass;

	/**
	 *  uint32_t 	dstSubpass	[int]
	 */ 
	 int 	dstSubpass;

	/**
	 *  VkPipelineStageFlags 	srcStageMask	[int]
	 */ 
	 int 	srcStageMask;

	/**
	 *  VkPipelineStageFlags 	dstStageMask	[int]
	 */ 
	 int 	dstStageMask;

	/**
	 *  VkAccessFlags 	srcAccessMask	[int]
	 */ 
	 int 	srcAccessMask;

	/**
	 *  VkAccessFlags 	dstAccessMask	[int]
	 */ 
	 int 	dstAccessMask;

	/**
	 *  VkDependencyFlags 	dependencyFlags	[int]
	 */ 
	 int 	dependencyFlags;

	/**
	 * Ctor
	 */
	public VkSubpassDependency(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSubpassDependency(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkSubpassDependency(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkSubpassDependency(long address){ 
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
	 public static P<VkSubpassDependency> createNullPointer(){
	        P<VkSubpassDependency> p = new  P<VkSubpassDependency>(new VkSubpassDependency());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkSubpassDependency> getP() {
	       if(p == null ){
	           p = new P<VkSubpassDependency> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field srcSubpass	[int]<br>
	 * Prototype: uint32_t  srcSubpass
	 */ 
	 public void srcSubpass(int srcSubpass){
		 this.srcSubpass = srcSubpass;
		 setSrcSubpass0(this.ptr,  srcSubpass);
	 }

	/**
	 * Get method for field srcSubpass	[int]<br>
	 * Prototype: uint32_t  srcSubpass
	 */ 
	 public int srcSubpass(){
		 int var = getSrcSubpass0(super.ptr);
		 this.srcSubpass = var;
		 return this.srcSubpass;
	 }

	/**
	 * Set method for field dstSubpass	[int]<br>
	 * Prototype: uint32_t  dstSubpass
	 */ 
	 public void dstSubpass(int dstSubpass){
		 this.dstSubpass = dstSubpass;
		 setDstSubpass0(this.ptr,  dstSubpass);
	 }

	/**
	 * Get method for field dstSubpass	[int]<br>
	 * Prototype: uint32_t  dstSubpass
	 */ 
	 public int dstSubpass(){
		 int var = getDstSubpass0(super.ptr);
		 this.dstSubpass = var;
		 return this.dstSubpass;
	 }

	/**
	 * Set method for field srcStageMask	[int]<br>
	 * Prototype: VkPipelineStageFlags  srcStageMask
	 */ 
	 public void srcStageMask(int srcStageMask){
		 this.srcStageMask = srcStageMask;
		 setSrcStageMask0(this.ptr,  srcStageMask);
	 }

	/**
	 * Get method for field srcStageMask	[int]<br>
	 * Prototype: VkPipelineStageFlags  srcStageMask
	 */ 
	 public int srcStageMask(){
		 int var = getSrcStageMask0(super.ptr);
		 this.srcStageMask = var;
		 return this.srcStageMask;
	 }

	/**
	 * Set method for field dstStageMask	[int]<br>
	 * Prototype: VkPipelineStageFlags  dstStageMask
	 */ 
	 public void dstStageMask(int dstStageMask){
		 this.dstStageMask = dstStageMask;
		 setDstStageMask0(this.ptr,  dstStageMask);
	 }

	/**
	 * Get method for field dstStageMask	[int]<br>
	 * Prototype: VkPipelineStageFlags  dstStageMask
	 */ 
	 public int dstStageMask(){
		 int var = getDstStageMask0(super.ptr);
		 this.dstStageMask = var;
		 return this.dstStageMask;
	 }

	/**
	 * Set method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 public void srcAccessMask(int srcAccessMask){
		 this.srcAccessMask = srcAccessMask;
		 setSrcAccessMask0(this.ptr,  srcAccessMask);
	 }

	/**
	 * Get method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 public int srcAccessMask(){
		 int var = getSrcAccessMask0(super.ptr);
		 this.srcAccessMask = var;
		 return this.srcAccessMask;
	 }

	/**
	 * Set method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 public void dstAccessMask(int dstAccessMask){
		 this.dstAccessMask = dstAccessMask;
		 setDstAccessMask0(this.ptr,  dstAccessMask);
	 }

	/**
	 * Get method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 public int dstAccessMask(){
		 int var = getDstAccessMask0(super.ptr);
		 this.dstAccessMask = var;
		 return this.dstAccessMask;
	 }

	/**
	 * Set method for field dependencyFlags	[int]<br>
	 * Prototype: VkDependencyFlags  dependencyFlags
	 */ 
	 public void dependencyFlags(int dependencyFlags){
		 this.dependencyFlags = dependencyFlags;
		 setDependencyFlags0(this.ptr,  dependencyFlags);
	 }

	/**
	 * Get method for field dependencyFlags	[int]<br>
	 * Prototype: VkDependencyFlags  dependencyFlags
	 */ 
	 public int dependencyFlags(){
		 int var = getDependencyFlags0(super.ptr);
		 this.dependencyFlags = var;
		 return this.dependencyFlags;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field srcSubpass	[int]<br>
	 * Prototype: uint32_t  srcSubpass
	 */ 
	 private static native void setSrcSubpass0(Buffer ptr, int _srcSubpass);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  vkObj->srcSubpass = (uint32_t) (_srcSubpass);
	  */

	/**
	 * native GET method for field srcSubpass	[int]<br>
	 * Prototype: uint32_t  srcSubpass
	 */ 
	 private static native int getSrcSubpass0(Buffer ptr);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  return (jint) (vkObj->srcSubpass);
	 */

	/**
	 * native SET method for field dstSubpass	[int]<br>
	 * Prototype: uint32_t  dstSubpass
	 */ 
	 private static native void setDstSubpass0(Buffer ptr, int _dstSubpass);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  vkObj->dstSubpass = (uint32_t) (_dstSubpass);
	  */

	/**
	 * native GET method for field dstSubpass	[int]<br>
	 * Prototype: uint32_t  dstSubpass
	 */ 
	 private static native int getDstSubpass0(Buffer ptr);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  return (jint) (vkObj->dstSubpass);
	 */

	/**
	 * native SET method for field srcStageMask	[int]<br>
	 * Prototype: VkPipelineStageFlags  srcStageMask
	 */ 
	 private static native void setSrcStageMask0(Buffer ptr, int _srcStageMask);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  vkObj->srcStageMask = (VkPipelineStageFlags) (_srcStageMask);
	  */

	/**
	 * native GET method for field srcStageMask	[int]<br>
	 * Prototype: VkPipelineStageFlags  srcStageMask
	 */ 
	 private static native int getSrcStageMask0(Buffer ptr);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  return (jint) (vkObj->srcStageMask);
	 */

	/**
	 * native SET method for field dstStageMask	[int]<br>
	 * Prototype: VkPipelineStageFlags  dstStageMask
	 */ 
	 private static native void setDstStageMask0(Buffer ptr, int _dstStageMask);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  vkObj->dstStageMask = (VkPipelineStageFlags) (_dstStageMask);
	  */

	/**
	 * native GET method for field dstStageMask	[int]<br>
	 * Prototype: VkPipelineStageFlags  dstStageMask
	 */ 
	 private static native int getDstStageMask0(Buffer ptr);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  return (jint) (vkObj->dstStageMask);
	 */

	/**
	 * native SET method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 private static native void setSrcAccessMask0(Buffer ptr, int _srcAccessMask);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  vkObj->srcAccessMask = (VkAccessFlags) (_srcAccessMask);
	  */

	/**
	 * native GET method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 private static native int getSrcAccessMask0(Buffer ptr);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  return (jint) (vkObj->srcAccessMask);
	 */

	/**
	 * native SET method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 private static native void setDstAccessMask0(Buffer ptr, int _dstAccessMask);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  vkObj->dstAccessMask = (VkAccessFlags) (_dstAccessMask);
	  */

	/**
	 * native GET method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 private static native int getDstAccessMask0(Buffer ptr);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  return (jint) (vkObj->dstAccessMask);
	 */

	/**
	 * native SET method for field dependencyFlags	[int]<br>
	 * Prototype: VkDependencyFlags  dependencyFlags
	 */ 
	 private static native void setDependencyFlags0(Buffer ptr, int _dependencyFlags);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  vkObj->dependencyFlags = (VkDependencyFlags) (_dependencyFlags);
	  */

	/**
	 * native GET method for field dependencyFlags	[int]<br>
	 * Prototype: VkDependencyFlags  dependencyFlags
	 */ 
	 private static native int getDependencyFlags0(Buffer ptr);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  return (jint) (vkObj->dependencyFlags);
	 */



} // end of class VkSubpassDependency
