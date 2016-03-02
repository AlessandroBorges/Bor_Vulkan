/**
 * Class wrapping Vulkan's VkDrawIndexedIndirectCommand struct.
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
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkDrawIndexedIndirectCommand. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDrawIndexedIndirectCommand {
 *     uint32_t    indexCount;
 *     uint32_t    instanceCount;
 *     uint32_t    firstIndex;
 *     int32_t     vertexOffset;
 *     uint32_t    firstInstance;
 * } VkDrawIndexedIndirectCommand;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkDrawIndexedIndirectCommand extends VkStruct {
	/** TAG of this structure [228]  */
	 private static final String TAG = "VkDrawIndexedIndirectCommand";

	/** ID of this structure [228]  */
	 public static final int TAG_ID = VKDRAWINDEXEDINDIRECTCOMMAND_ID;

	 // fields //
	/**
	 *  uint32_t 	indexCount		 */ 
	int 	indexCount;

	/**
	 *  uint32_t 	instanceCount		 */ 
	int 	instanceCount;

	/**
	 *  uint32_t 	firstIndex		 */ 
	int 	firstIndex;

	/**
	 *  int32_t 	vertexOffset		 */ 
	int 	vertexOffset;

	/**
	 *  uint32_t 	firstInstance		 */ 
	int 	firstInstance;

	/**
	 * Ctor
	 */
	public VkDrawIndexedIndirectCommand(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field indexCount	
	 * Prototype: uint32_t  indexCount
	 */ 
	 public void indexCount(int indexCount){
		 this.indexCount = indexCount;
		indexCount0(super.ptr, indexCount);
	 }

	/**
	 * get method for field indexCount	
	 * Prototype: uint32_t  indexCount
	 */ 
	 public int indexCount(){
		 // return  this.indexCount;
		 return indexCount0(super.ptr);
	 }

	/**
	 * Set method for field instanceCount	
	 * Prototype: uint32_t  instanceCount
	 */ 
	 public void instanceCount(int instanceCount){
		 this.instanceCount = instanceCount;
		instanceCount0(super.ptr, instanceCount);
	 }

	/**
	 * get method for field instanceCount	
	 * Prototype: uint32_t  instanceCount
	 */ 
	 public int instanceCount(){
		 // return  this.instanceCount;
		 return instanceCount0(super.ptr);
	 }

	/**
	 * Set method for field firstIndex	
	 * Prototype: uint32_t  firstIndex
	 */ 
	 public void firstIndex(int firstIndex){
		 this.firstIndex = firstIndex;
		firstIndex0(super.ptr, firstIndex);
	 }

	/**
	 * get method for field firstIndex	
	 * Prototype: uint32_t  firstIndex
	 */ 
	 public int firstIndex(){
		 // return  this.firstIndex;
		 return firstIndex0(super.ptr);
	 }

	/**
	 * Set method for field vertexOffset	
	 * Prototype: int32_t  vertexOffset
	 */ 
	 public void vertexOffset(int vertexOffset){
		 this.vertexOffset = vertexOffset;
		vertexOffset0(super.ptr, vertexOffset);
	 }

	/**
	 * get method for field vertexOffset	
	 * Prototype: int32_t  vertexOffset
	 */ 
	 public int vertexOffset(){
		 // return  this.vertexOffset;
		 return vertexOffset0(super.ptr);
	 }

	/**
	 * Set method for field firstInstance	
	 * Prototype: uint32_t  firstInstance
	 */ 
	 public void firstInstance(int firstInstance){
		 this.firstInstance = firstInstance;
		firstInstance0(super.ptr, firstInstance);
	 }

	/**
	 * get method for field firstInstance	
	 * Prototype: uint32_t  firstInstance
	 */ 
	 public int firstInstance(){
		 // return  this.firstInstance;
		 return firstInstance0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field indexCount	
	 * Prototype: uint32_t  indexCount
	 */ 
	 private static native void indexCount0(ByteBuffer ptr, int _indexCount);/*
		  VkDrawIndexedIndirectCommand _obj = (VkDrawIndexedIndirectCommand)(*ptr);
		  _obj.indexCount = (uint32_t) (_indexCount);
	  */

	/**
	 * get method for field indexCount	
	 * Prototype: uint32_t  indexCount
	 */ 
	 private static native int indexCount0(ByteBuffer ptr);/*
		  VkDrawIndexedIndirectCommand _obj = (VkDrawIndexedIndirectCommand)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field instanceCount	
	 * Prototype: uint32_t  instanceCount
	 */ 
	 private static native void instanceCount0(ByteBuffer ptr, int _instanceCount);/*
		  VkDrawIndexedIndirectCommand _obj = (VkDrawIndexedIndirectCommand)(*ptr);
		  _obj.instanceCount = (uint32_t) (_instanceCount);
	  */

	/**
	 * get method for field instanceCount	
	 * Prototype: uint32_t  instanceCount
	 */ 
	 private static native int instanceCount0(ByteBuffer ptr);/*
		  VkDrawIndexedIndirectCommand _obj = (VkDrawIndexedIndirectCommand)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field firstIndex	
	 * Prototype: uint32_t  firstIndex
	 */ 
	 private static native void firstIndex0(ByteBuffer ptr, int _firstIndex);/*
		  VkDrawIndexedIndirectCommand _obj = (VkDrawIndexedIndirectCommand)(*ptr);
		  _obj.firstIndex = (uint32_t) (_firstIndex);
	  */

	/**
	 * get method for field firstIndex	
	 * Prototype: uint32_t  firstIndex
	 */ 
	 private static native int firstIndex0(ByteBuffer ptr);/*
		  VkDrawIndexedIndirectCommand _obj = (VkDrawIndexedIndirectCommand)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field vertexOffset	
	 * Prototype: int32_t  vertexOffset
	 */ 
	 private static native void vertexOffset0(ByteBuffer ptr, int _vertexOffset);/*
		  VkDrawIndexedIndirectCommand _obj = (VkDrawIndexedIndirectCommand)(*ptr);
		  _obj.vertexOffset = (int32_t) (_vertexOffset);
	  */

	/**
	 * get method for field vertexOffset	
	 * Prototype: int32_t  vertexOffset
	 */ 
	 private static native int vertexOffset0(ByteBuffer ptr);/*
		  VkDrawIndexedIndirectCommand _obj = (VkDrawIndexedIndirectCommand)(ptr);
		  return (jint) (_obj.int32_t);
	 */

	/**
	 * native Set method for field firstInstance	
	 * Prototype: uint32_t  firstInstance
	 */ 
	 private static native void firstInstance0(ByteBuffer ptr, int _firstInstance);/*
		  VkDrawIndexedIndirectCommand _obj = (VkDrawIndexedIndirectCommand)(*ptr);
		  _obj.firstInstance = (uint32_t) (_firstInstance);
	  */

	/**
	 * get method for field firstInstance	
	 * Prototype: uint32_t  firstInstance
	 */ 
	 private static native int firstInstance0(ByteBuffer ptr);/*
		  VkDrawIndexedIndirectCommand _obj = (VkDrawIndexedIndirectCommand)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkDrawIndexedIndirectCommand
