/**
 * Class wrapping Vulkan's VkDrawIndirectCommand struct.
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
 *  This class is a Java front end for struct VkDrawIndirectCommand. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDrawIndirectCommand {
 *     uint32_t    vertexCount;
 *     uint32_t    instanceCount;
 *     uint32_t    firstVertex;
 *     uint32_t    firstInstance;
 * } VkDrawIndirectCommand;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkDrawIndirectCommand extends VkStruct {
	/** TAG of this structure [229]  */
	 private static final String TAG = "VkDrawIndirectCommand";

	/** ID of this structure [229]  */
	 public static final int TAG_ID = VKDRAWINDIRECTCOMMAND_ID;

	 // fields //
	/**
	 *  uint32_t 	vertexCount		 */ 
	int 	vertexCount;

	/**
	 *  uint32_t 	instanceCount		 */ 
	int 	instanceCount;

	/**
	 *  uint32_t 	firstVertex		 */ 
	int 	firstVertex;

	/**
	 *  uint32_t 	firstInstance		 */ 
	int 	firstInstance;

	/**
	 * Ctor
	 */
	public VkDrawIndirectCommand(){ 
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
	 * Set method for field vertexCount	
	 * Prototype: uint32_t  vertexCount
	 */ 
	 public void vertexCount(int vertexCount){
		 this.vertexCount = vertexCount;
		vertexCount0(super.ptr, vertexCount);
	 }

	/**
	 * get method for field vertexCount	
	 * Prototype: uint32_t  vertexCount
	 */ 
	 public int vertexCount(){
		 // return  this.vertexCount;
		 return vertexCount0(super.ptr);
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
	 * Set method for field firstVertex	
	 * Prototype: uint32_t  firstVertex
	 */ 
	 public void firstVertex(int firstVertex){
		 this.firstVertex = firstVertex;
		firstVertex0(super.ptr, firstVertex);
	 }

	/**
	 * get method for field firstVertex	
	 * Prototype: uint32_t  firstVertex
	 */ 
	 public int firstVertex(){
		 // return  this.firstVertex;
		 return firstVertex0(super.ptr);
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
	 * native Set method for field vertexCount	
	 * Prototype: uint32_t  vertexCount
	 */ 
	 private static native void vertexCount0(ByteBuffer ptr, int _vertexCount);/*
		  VkDrawIndirectCommand _obj = (VkDrawIndirectCommand)(*ptr);
		  _obj.vertexCount = (uint32_t) (_vertexCount);
	  */

	/**
	 * get method for field vertexCount	
	 * Prototype: uint32_t  vertexCount
	 */ 
	 private static native int vertexCount0(ByteBuffer ptr);/*
		  VkDrawIndirectCommand _obj = (VkDrawIndirectCommand)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field instanceCount	
	 * Prototype: uint32_t  instanceCount
	 */ 
	 private static native void instanceCount0(ByteBuffer ptr, int _instanceCount);/*
		  VkDrawIndirectCommand _obj = (VkDrawIndirectCommand)(*ptr);
		  _obj.instanceCount = (uint32_t) (_instanceCount);
	  */

	/**
	 * get method for field instanceCount	
	 * Prototype: uint32_t  instanceCount
	 */ 
	 private static native int instanceCount0(ByteBuffer ptr);/*
		  VkDrawIndirectCommand _obj = (VkDrawIndirectCommand)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field firstVertex	
	 * Prototype: uint32_t  firstVertex
	 */ 
	 private static native void firstVertex0(ByteBuffer ptr, int _firstVertex);/*
		  VkDrawIndirectCommand _obj = (VkDrawIndirectCommand)(*ptr);
		  _obj.firstVertex = (uint32_t) (_firstVertex);
	  */

	/**
	 * get method for field firstVertex	
	 * Prototype: uint32_t  firstVertex
	 */ 
	 private static native int firstVertex0(ByteBuffer ptr);/*
		  VkDrawIndirectCommand _obj = (VkDrawIndirectCommand)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field firstInstance	
	 * Prototype: uint32_t  firstInstance
	 */ 
	 private static native void firstInstance0(ByteBuffer ptr, int _firstInstance);/*
		  VkDrawIndirectCommand _obj = (VkDrawIndirectCommand)(*ptr);
		  _obj.firstInstance = (uint32_t) (_firstInstance);
	  */

	/**
	 * get method for field firstInstance	
	 * Prototype: uint32_t  firstInstance
	 */ 
	 private static native int firstInstance0(ByteBuffer ptr);/*
		  VkDrawIndirectCommand _obj = (VkDrawIndirectCommand)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkDrawIndirectCommand
