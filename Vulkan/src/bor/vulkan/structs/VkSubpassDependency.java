// class wrapping Vulkan's VkSubpassDependency struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkSubpassDependency 
 * @Author Alessandro Borges 
 */
public class VkSubpassDependency extends VkStruct {
	/** ID of this structure [84]  */
	 public static final int TAG = VKSUBPASSDEPENDENCY_ID;

	 // fields //
	/**
	 *  uint32_t 	srcSubpass 
	 */ 
	int 	srcSubpass;

	/**
	 *  uint32_t 	dstSubpass 
	 */ 
	int 	dstSubpass;

	/**
	 *  VkPipelineStageFlags 	srcStageMask 
	 */ 
	int 	srcStageMask;

	/**
	 *  VkPipelineStageFlags 	dstStageMask 
	 */ 
	int 	dstStageMask;

	/**
	 *  VkAccessFlags 	srcAccessMask 
	 */ 
	int 	srcAccessMask;

	/**
	 *  VkAccessFlags 	dstAccessMask 
	 */ 
	int 	dstAccessMask;

	/**
	 *  VkDependencyFlags 	dependencyFlags 
	 */ 
	int 	dependencyFlags;

	/**
	 * Ctor
	 */
	public VkSubpassDependency(){ 
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
	 * Set method for field srcSubpass
	 * Prototype: uint32_t  srcSubpass
	 */ 
	 public void srcSubpass(int srcSubpass){
		 this.srcSubpass = srcSubpass;
		srcSubpass0(super.ptr, srcSubpass);
	 }

	/**
	 * get method for field srcSubpass
	 * Prototype: uint32_t  srcSubpass
	 */ 
	 public int srcSubpass(){
		 // return  this.srcSubpass;
		 return srcSubpass0(super.ptr);
	 }

	/**
	 * Set method for field dstSubpass
	 * Prototype: uint32_t  dstSubpass
	 */ 
	 public void dstSubpass(int dstSubpass){
		 this.dstSubpass = dstSubpass;
		dstSubpass0(super.ptr, dstSubpass);
	 }

	/**
	 * get method for field dstSubpass
	 * Prototype: uint32_t  dstSubpass
	 */ 
	 public int dstSubpass(){
		 // return  this.dstSubpass;
		 return dstSubpass0(super.ptr);
	 }

	/**
	 * Set method for field srcStageMask
	 * Prototype: VkPipelineStageFlags  srcStageMask
	 */ 
	 public void srcStageMask(int srcStageMask){
		 this.srcStageMask = srcStageMask;
		srcStageMask0(super.ptr, srcStageMask);
	 }

	/**
	 * get method for field srcStageMask
	 * Prototype: VkPipelineStageFlags  srcStageMask
	 */ 
	 public int srcStageMask(){
		 // return  this.srcStageMask;
		 return srcStageMask0(super.ptr);
	 }

	/**
	 * Set method for field dstStageMask
	 * Prototype: VkPipelineStageFlags  dstStageMask
	 */ 
	 public void dstStageMask(int dstStageMask){
		 this.dstStageMask = dstStageMask;
		dstStageMask0(super.ptr, dstStageMask);
	 }

	/**
	 * get method for field dstStageMask
	 * Prototype: VkPipelineStageFlags  dstStageMask
	 */ 
	 public int dstStageMask(){
		 // return  this.dstStageMask;
		 return dstStageMask0(super.ptr);
	 }

	/**
	 * Set method for field srcAccessMask
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 public void srcAccessMask(int srcAccessMask){
		 this.srcAccessMask = srcAccessMask;
		srcAccessMask0(super.ptr, srcAccessMask);
	 }

	/**
	 * get method for field srcAccessMask
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 public int srcAccessMask(){
		 // return  this.srcAccessMask;
		 return srcAccessMask0(super.ptr);
	 }

	/**
	 * Set method for field dstAccessMask
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 public void dstAccessMask(int dstAccessMask){
		 this.dstAccessMask = dstAccessMask;
		dstAccessMask0(super.ptr, dstAccessMask);
	 }

	/**
	 * get method for field dstAccessMask
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 public int dstAccessMask(){
		 // return  this.dstAccessMask;
		 return dstAccessMask0(super.ptr);
	 }

	/**
	 * Set method for field dependencyFlags
	 * Prototype: VkDependencyFlags  dependencyFlags
	 */ 
	 public void dependencyFlags(int dependencyFlags){
		 this.dependencyFlags = dependencyFlags;
		dependencyFlags0(super.ptr, dependencyFlags);
	 }

	/**
	 * get method for field dependencyFlags
	 * Prototype: VkDependencyFlags  dependencyFlags
	 */ 
	 public int dependencyFlags(){
		 // return  this.dependencyFlags;
		 return dependencyFlags0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field srcSubpass
	 * Prototype: uint32_t  srcSubpass
	 */ 
	 private static native void srcSubpass0(ByteBuffer ptr, int _srcSubpass);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(*ptr);
		  _obj.srcSubpass = (uint32_t) (_srcSubpass);
	  */

	/**
	 * get method for field srcSubpass
	 * Prototype: uint32_t  srcSubpass
	 */ 
	 private static native int srcSubpass0(ByteBuffer ptr);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field dstSubpass
	 * Prototype: uint32_t  dstSubpass
	 */ 
	 private static native void dstSubpass0(ByteBuffer ptr, int _dstSubpass);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(*ptr);
		  _obj.dstSubpass = (uint32_t) (_dstSubpass);
	  */

	/**
	 * get method for field dstSubpass
	 * Prototype: uint32_t  dstSubpass
	 */ 
	 private static native int dstSubpass0(ByteBuffer ptr);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field srcStageMask
	 * Prototype: VkPipelineStageFlags  srcStageMask
	 */ 
	 private static native void srcStageMask0(ByteBuffer ptr, int _srcStageMask);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(*ptr);
		  _obj.srcStageMask = (VkPipelineStageFlags) (_srcStageMask);
	  */

	/**
	 * get method for field srcStageMask
	 * Prototype: VkPipelineStageFlags  srcStageMask
	 */ 
	 private static native int srcStageMask0(ByteBuffer ptr);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(ptr);
		  return (jint) (_obj.VkPipelineStageFlags);
	 */

	/**
	 * native Set method for field dstStageMask
	 * Prototype: VkPipelineStageFlags  dstStageMask
	 */ 
	 private static native void dstStageMask0(ByteBuffer ptr, int _dstStageMask);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(*ptr);
		  _obj.dstStageMask = (VkPipelineStageFlags) (_dstStageMask);
	  */

	/**
	 * get method for field dstStageMask
	 * Prototype: VkPipelineStageFlags  dstStageMask
	 */ 
	 private static native int dstStageMask0(ByteBuffer ptr);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(ptr);
		  return (jint) (_obj.VkPipelineStageFlags);
	 */

	/**
	 * native Set method for field srcAccessMask
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 private static native void srcAccessMask0(ByteBuffer ptr, int _srcAccessMask);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(*ptr);
		  _obj.srcAccessMask = (VkAccessFlags) (_srcAccessMask);
	  */

	/**
	 * get method for field srcAccessMask
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 private static native int srcAccessMask0(ByteBuffer ptr);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(ptr);
		  return (jint) (_obj.VkAccessFlags);
	 */

	/**
	 * native Set method for field dstAccessMask
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 private static native void dstAccessMask0(ByteBuffer ptr, int _dstAccessMask);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(*ptr);
		  _obj.dstAccessMask = (VkAccessFlags) (_dstAccessMask);
	  */

	/**
	 * get method for field dstAccessMask
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 private static native int dstAccessMask0(ByteBuffer ptr);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(ptr);
		  return (jint) (_obj.VkAccessFlags);
	 */

	/**
	 * native Set method for field dependencyFlags
	 * Prototype: VkDependencyFlags  dependencyFlags
	 */ 
	 private static native void dependencyFlags0(ByteBuffer ptr, int _dependencyFlags);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(*ptr);
		  _obj.dependencyFlags = (VkDependencyFlags) (_dependencyFlags);
	  */

	/**
	 * get method for field dependencyFlags
	 * Prototype: VkDependencyFlags  dependencyFlags
	 */ 
	 private static native int dependencyFlags0(ByteBuffer ptr);/*
		  VkSubpassDependency _obj = (VkSubpassDependency)(ptr);
		  return (jint) (_obj.VkDependencyFlags);
	 */



} // end of class VkSubpassDependency
