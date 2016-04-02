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

import java.nio.Buffer;
import java.nio.ByteBuffer;

import bor.vulkan.P;


/**
 *  Project Bor-Vulkan 
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
	/** TAG of this structure [105]  */
	 private static final String TAG = "VkDrawIndirectCommand";

	/** ID of this structure [105]  */
	 public static final int TAG_ID = VKDRAWINDIRECTCOMMAND_ID;

	/** P wrapper for THIS object */
	 private  P<VkDrawIndirectCommand> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  uint32_t 	vertexCount	[int]
	 */ 
	 int 	vertexCount;

	/**
	 *  uint32_t 	instanceCount	[int]
	 */ 
	 int 	instanceCount;

	/**
	 *  uint32_t 	firstVertex	[int]
	 */ 
	 int 	firstVertex;

	/**
	 *  uint32_t 	firstInstance	[int]
	 */ 
	 int 	firstInstance;

	/**
	 * Ctor
	 */
	public VkDrawIndirectCommand(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDrawIndirectCommand(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkDrawIndirectCommand(long address, int memSize){ 
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
	 public static P<VkDrawIndirectCommand> createNullPointer(){
	        P<VkDrawIndirectCommand> p = new  P<VkDrawIndirectCommand>(new VkDrawIndirectCommand());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkDrawIndirectCommand> getP() {
	       if(p == null ){
	           p = new P<VkDrawIndirectCommand> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field vertexCount	[int]<br>
	 * Prototype: uint32_t  vertexCount
	 */ 
	 public void vertexCount(int vertexCount){
		 this.vertexCount = vertexCount;
		 vertexCount0(this.ptr,  vertexCount);
	 }

	/**
	 * Get method for field vertexCount	[int]<br>
	 * Prototype: uint32_t  vertexCount
	 */ 
	 public int vertexCount(){
		 int var = vertexCount0(super.ptr);
		 this.vertexCount = var;
		 return this.vertexCount;
	 }

	/**
	 * Set method for field instanceCount	[int]<br>
	 * Prototype: uint32_t  instanceCount
	 */ 
	 public void instanceCount(int instanceCount){
		 this.instanceCount = instanceCount;
		 instanceCount0(this.ptr,  instanceCount);
	 }

	/**
	 * Get method for field instanceCount	[int]<br>
	 * Prototype: uint32_t  instanceCount
	 */ 
	 public int instanceCount(){
		 int var = instanceCount0(super.ptr);
		 this.instanceCount = var;
		 return this.instanceCount;
	 }

	/**
	 * Set method for field firstVertex	[int]<br>
	 * Prototype: uint32_t  firstVertex
	 */ 
	 public void firstVertex(int firstVertex){
		 this.firstVertex = firstVertex;
		 firstVertex0(this.ptr,  firstVertex);
	 }

	/**
	 * Get method for field firstVertex	[int]<br>
	 * Prototype: uint32_t  firstVertex
	 */ 
	 public int firstVertex(){
		 int var = firstVertex0(super.ptr);
		 this.firstVertex = var;
		 return this.firstVertex;
	 }

	/**
	 * Set method for field firstInstance	[int]<br>
	 * Prototype: uint32_t  firstInstance
	 */ 
	 public void firstInstance(int firstInstance){
		 this.firstInstance = firstInstance;
		 firstInstance0(this.ptr,  firstInstance);
	 }

	/**
	 * Get method for field firstInstance	[int]<br>
	 * Prototype: uint32_t  firstInstance
	 */ 
	 public int firstInstance(){
		 int var = firstInstance0(super.ptr);
		 this.firstInstance = var;
		 return this.firstInstance;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field vertexCount	[int]<br>
	 * Prototype: uint32_t  vertexCount
	 */ 
	 private static native void vertexCount0(Buffer ptr, int _vertexCount);/*
		  VkDrawIndirectCommand* vkObj = (VkDrawIndirectCommand*)(ptr);
		  vkObj->vertexCount = (uint32_t) (_vertexCount);
	  */

	/**
	 * native GET method for field vertexCount	[int]<br>
	 * Prototype: uint32_t  vertexCount
	 */ 
	 private static native int vertexCount0(Buffer ptr);/*
		  VkDrawIndirectCommand vkObj = (VkDrawIndirectCommand*)(ptr);
		  return (jint) (vkObj->vertexCount);
	 */

	/**
	 * native SET method for field instanceCount	[int]<br>
	 * Prototype: uint32_t  instanceCount
	 */ 
	 private static native void instanceCount0(Buffer ptr, int _instanceCount);/*
		  VkDrawIndirectCommand* vkObj = (VkDrawIndirectCommand*)(ptr);
		  vkObj->instanceCount = (uint32_t) (_instanceCount);
	  */

	/**
	 * native GET method for field instanceCount	[int]<br>
	 * Prototype: uint32_t  instanceCount
	 */ 
	 private static native int instanceCount0(Buffer ptr);/*
		  VkDrawIndirectCommand vkObj = (VkDrawIndirectCommand*)(ptr);
		  return (jint) (vkObj->instanceCount);
	 */

	/**
	 * native SET method for field firstVertex	[int]<br>
	 * Prototype: uint32_t  firstVertex
	 */ 
	 private static native void firstVertex0(Buffer ptr, int _firstVertex);/*
		  VkDrawIndirectCommand* vkObj = (VkDrawIndirectCommand*)(ptr);
		  vkObj->firstVertex = (uint32_t) (_firstVertex);
	  */

	/**
	 * native GET method for field firstVertex	[int]<br>
	 * Prototype: uint32_t  firstVertex
	 */ 
	 private static native int firstVertex0(Buffer ptr);/*
		  VkDrawIndirectCommand vkObj = (VkDrawIndirectCommand*)(ptr);
		  return (jint) (vkObj->firstVertex);
	 */

	/**
	 * native SET method for field firstInstance	[int]<br>
	 * Prototype: uint32_t  firstInstance
	 */ 
	 private static native void firstInstance0(Buffer ptr, int _firstInstance);/*
		  VkDrawIndirectCommand* vkObj = (VkDrawIndirectCommand*)(ptr);
		  vkObj->firstInstance = (uint32_t) (_firstInstance);
	  */

	/**
	 * native GET method for field firstInstance	[int]<br>
	 * Prototype: uint32_t  firstInstance
	 */ 
	 private static native int firstInstance0(Buffer ptr);/*
		  VkDrawIndirectCommand vkObj = (VkDrawIndirectCommand*)(ptr);
		  return (jint) (vkObj->firstInstance);
	 */



} // end of class VkDrawIndirectCommand
