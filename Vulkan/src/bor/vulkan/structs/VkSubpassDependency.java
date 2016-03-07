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
	 public VkSubpassDependency(long address, int memSize){ 
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
		srcSubpass0(super.ptr, srcSubpass);
	 }

	/**
	 * get method for field srcSubpass	[int]<br>
	 * Prototype: uint32_t  srcSubpass
	 */ 
	 public int srcSubpass(){
		 // return  this.srcSubpass;
		 return srcSubpass0(super.ptr);
	 }

	/**
	 * Set method for field dstSubpass	[int]<br>
	 * Prototype: uint32_t  dstSubpass
	 */ 
	 public void dstSubpass(int dstSubpass){
		 this.dstSubpass = dstSubpass;
		dstSubpass0(super.ptr, dstSubpass);
	 }

	/**
	 * get method for field dstSubpass	[int]<br>
	 * Prototype: uint32_t  dstSubpass
	 */ 
	 public int dstSubpass(){
		 // return  this.dstSubpass;
		 return dstSubpass0(super.ptr);
	 }

	/**
	 * Set method for field srcStageMask	[int]<br>
	 * Prototype: VkPipelineStageFlags  srcStageMask
	 */ 
	 public void srcStageMask(int srcStageMask){
		 this.srcStageMask = srcStageMask;
		srcStageMask0(super.ptr, srcStageMask);
	 }

	/**
	 * get method for field srcStageMask	[int]<br>
	 * Prototype: VkPipelineStageFlags  srcStageMask
	 */ 
	 public int srcStageMask(){
		 // return  this.srcStageMask;
		 return srcStageMask0(super.ptr);
	 }

	/**
	 * Set method for field dstStageMask	[int]<br>
	 * Prototype: VkPipelineStageFlags  dstStageMask
	 */ 
	 public void dstStageMask(int dstStageMask){
		 this.dstStageMask = dstStageMask;
		dstStageMask0(super.ptr, dstStageMask);
	 }

	/**
	 * get method for field dstStageMask	[int]<br>
	 * Prototype: VkPipelineStageFlags  dstStageMask
	 */ 
	 public int dstStageMask(){
		 // return  this.dstStageMask;
		 return dstStageMask0(super.ptr);
	 }

	/**
	 * Set method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 public void srcAccessMask(int srcAccessMask){
		 this.srcAccessMask = srcAccessMask;
		srcAccessMask0(super.ptr, srcAccessMask);
	 }

	/**
	 * get method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 public int srcAccessMask(){
		 // return  this.srcAccessMask;
		 return srcAccessMask0(super.ptr);
	 }

	/**
	 * Set method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 public void dstAccessMask(int dstAccessMask){
		 this.dstAccessMask = dstAccessMask;
		dstAccessMask0(super.ptr, dstAccessMask);
	 }

	/**
	 * get method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 public int dstAccessMask(){
		 // return  this.dstAccessMask;
		 return dstAccessMask0(super.ptr);
	 }

	/**
	 * Set method for field dependencyFlags	[int]<br>
	 * Prototype: VkDependencyFlags  dependencyFlags
	 */ 
	 public void dependencyFlags(int dependencyFlags){
		 this.dependencyFlags = dependencyFlags;
		dependencyFlags0(super.ptr, dependencyFlags);
	 }

	/**
	 * get method for field dependencyFlags	[int]<br>
	 * Prototype: VkDependencyFlags  dependencyFlags
	 */ 
	 public int dependencyFlags(){
		 // return  this.dependencyFlags;
		 return dependencyFlags0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field srcSubpass	[int]<br>
	 * Prototype: uint32_t  srcSubpass
	 */ 
	 private static native void srcSubpass0(ByteBuffer ptr, int _srcSubpass);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(*ptr);
		  _obj.srcSubpass = (uint32_t) (_srcSubpass);
	  */

	/**
	 * native GET method for field srcSubpass	[int]<br>
	 * Prototype: uint32_t  srcSubpass
	 */ 
	 private static native int srcSubpass0(ByteBuffer ptr);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field dstSubpass	[int]<br>
	 * Prototype: uint32_t  dstSubpass
	 */ 
	 private static native void dstSubpass0(ByteBuffer ptr, int _dstSubpass);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(*ptr);
		  _obj.dstSubpass = (uint32_t) (_dstSubpass);
	  */

	/**
	 * native GET method for field dstSubpass	[int]<br>
	 * Prototype: uint32_t  dstSubpass
	 */ 
	 private static native int dstSubpass0(ByteBuffer ptr);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field srcStageMask	[int]<br>
	 * Prototype: VkPipelineStageFlags  srcStageMask
	 */ 
	 private static native void srcStageMask0(ByteBuffer ptr, int _srcStageMask);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(*ptr);
		  _obj.srcStageMask = (VkPipelineStageFlags) (_srcStageMask);
	  */

	/**
	 * native GET method for field srcStageMask	[int]<br>
	 * Prototype: VkPipelineStageFlags  srcStageMask
	 */ 
	 private static native int srcStageMask0(ByteBuffer ptr);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(ptr);
		  return (jint) (_obj.VkPipelineStageFlags);
	 */

	/**
	 * native SET method for field dstStageMask	[int]<br>
	 * Prototype: VkPipelineStageFlags  dstStageMask
	 */ 
	 private static native void dstStageMask0(ByteBuffer ptr, int _dstStageMask);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(*ptr);
		  _obj.dstStageMask = (VkPipelineStageFlags) (_dstStageMask);
	  */

	/**
	 * native GET method for field dstStageMask	[int]<br>
	 * Prototype: VkPipelineStageFlags  dstStageMask
	 */ 
	 private static native int dstStageMask0(ByteBuffer ptr);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(ptr);
		  return (jint) (_obj.VkPipelineStageFlags);
	 */

	/**
	 * native SET method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 private static native void srcAccessMask0(ByteBuffer ptr, int _srcAccessMask);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(*ptr);
		  _obj.srcAccessMask = (VkAccessFlags) (_srcAccessMask);
	  */

	/**
	 * native GET method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 private static native int srcAccessMask0(ByteBuffer ptr);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(ptr);
		  return (jint) (_obj.VkAccessFlags);
	 */

	/**
	 * native SET method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 private static native void dstAccessMask0(ByteBuffer ptr, int _dstAccessMask);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(*ptr);
		  _obj.dstAccessMask = (VkAccessFlags) (_dstAccessMask);
	  */

	/**
	 * native GET method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 private static native int dstAccessMask0(ByteBuffer ptr);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(ptr);
		  return (jint) (_obj.VkAccessFlags);
	 */

	/**
	 * native SET method for field dependencyFlags	[int]<br>
	 * Prototype: VkDependencyFlags  dependencyFlags
	 */ 
	 private static native void dependencyFlags0(ByteBuffer ptr, int _dependencyFlags);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(*ptr);
		  _obj.dependencyFlags = (VkDependencyFlags) (_dependencyFlags);
	  */

	/**
	 * native GET method for field dependencyFlags	[int]<br>
	 * Prototype: VkDependencyFlags  dependencyFlags
	 */ 
	 private static native int dependencyFlags0(ByteBuffer ptr);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(ptr);
		  return (jint) (_obj.VkDependencyFlags);
	 */



} // end of class VkSubpassDependency
