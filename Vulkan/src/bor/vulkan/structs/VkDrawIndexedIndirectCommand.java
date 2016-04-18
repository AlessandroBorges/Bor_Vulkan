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

import java.nio.Buffer;


/**
 *  Project Bor-Vulkan 
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

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [104]  */
	 private static final String TAG = "VkDrawIndexedIndirectCommand";

	/** ID of this structure [104]  */
	 public static final int TAG_ID = VKDRAWINDEXEDINDIRECTCOMMAND_ID;

	/** P wrapper for THIS object */
	 private  P<VkDrawIndexedIndirectCommand> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  uint32_t 	indexCount	[int]
	 */ 
	 int 	indexCount;

	/**
	 *  uint32_t 	instanceCount	[int]
	 */ 
	 int 	instanceCount;

	/**
	 *  uint32_t 	firstIndex	[int]
	 */ 
	 int 	firstIndex;

	/**
	 *  int32_t 	vertexOffset	[int]
	 */ 
	 int 	vertexOffset;

	/**
	 *  uint32_t 	firstInstance	[int]
	 */ 
	 int 	firstInstance;

	/**
	 * Ctor
	 */
	public VkDrawIndexedIndirectCommand(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDrawIndexedIndirectCommand(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkDrawIndexedIndirectCommand(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDrawIndexedIndirectCommand(long address){ 
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
	 public static P<VkDrawIndexedIndirectCommand> createNullPointer(){
	        P<VkDrawIndexedIndirectCommand> p = new  P<VkDrawIndexedIndirectCommand>(new VkDrawIndexedIndirectCommand());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkDrawIndexedIndirectCommand> getP() {
	       if(p == null ){
	           p = new P<VkDrawIndexedIndirectCommand> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field indexCount	[int]<br>
	 * Prototype: uint32_t  indexCount
	 */ 
	 public void indexCount(int indexCount){
		 this.indexCount = indexCount;
		 setIndexCount0(this.ptr,  indexCount);
	 }

	/**
	 * Get method for field indexCount	[int]<br>
	 * Prototype: uint32_t  indexCount
	 */ 
	 public int indexCount(){
		 int var = getIndexCount0(super.ptr);
		 this.indexCount = var;
		 return this.indexCount;
	 }

	/**
	 * Set method for field instanceCount	[int]<br>
	 * Prototype: uint32_t  instanceCount
	 */ 
	 public void instanceCount(int instanceCount){
		 this.instanceCount = instanceCount;
		 setInstanceCount0(this.ptr,  instanceCount);
	 }

	/**
	 * Get method for field instanceCount	[int]<br>
	 * Prototype: uint32_t  instanceCount
	 */ 
	 public int instanceCount(){
		 int var = getInstanceCount0(super.ptr);
		 this.instanceCount = var;
		 return this.instanceCount;
	 }

	/**
	 * Set method for field firstIndex	[int]<br>
	 * Prototype: uint32_t  firstIndex
	 */ 
	 public void firstIndex(int firstIndex){
		 this.firstIndex = firstIndex;
		 setFirstIndex0(this.ptr,  firstIndex);
	 }

	/**
	 * Get method for field firstIndex	[int]<br>
	 * Prototype: uint32_t  firstIndex
	 */ 
	 public int firstIndex(){
		 int var = getFirstIndex0(super.ptr);
		 this.firstIndex = var;
		 return this.firstIndex;
	 }

	/**
	 * Set method for field vertexOffset	[int]<br>
	 * Prototype: int32_t  vertexOffset
	 */ 
	 public void vertexOffset(int vertexOffset){
		 this.vertexOffset = vertexOffset;
		 setVertexOffset0(this.ptr,  vertexOffset);
	 }

	/**
	 * Get method for field vertexOffset	[int]<br>
	 * Prototype: int32_t  vertexOffset
	 */ 
	 public int vertexOffset(){
		 int var = getVertexOffset0(super.ptr);
		 this.vertexOffset = var;
		 return this.vertexOffset;
	 }

	/**
	 * Set method for field firstInstance	[int]<br>
	 * Prototype: uint32_t  firstInstance
	 */ 
	 public void firstInstance(int firstInstance){
		 this.firstInstance = firstInstance;
		 setFirstInstance0(this.ptr,  firstInstance);
	 }

	/**
	 * Get method for field firstInstance	[int]<br>
	 * Prototype: uint32_t  firstInstance
	 */ 
	 public int firstInstance(){
		 int var = getFirstInstance0(super.ptr);
		 this.firstInstance = var;
		 return this.firstInstance;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field indexCount	[int]<br>
	 * Prototype: uint32_t  indexCount
	 */ 
	 private static native void setIndexCount0(Buffer ptr, int _indexCount);/*
		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		  vkObj->indexCount = (uint32_t) (_indexCount);
	  */

	/**
	 * native GET method for field indexCount	[int]<br>
	 * Prototype: uint32_t  indexCount
	 */ 
	 private static native int getIndexCount0(Buffer ptr);/*
		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		  return (jint) (vkObj->indexCount);
	 */

	/**
	 * native SET method for field instanceCount	[int]<br>
	 * Prototype: uint32_t  instanceCount
	 */ 
	 private static native void setInstanceCount0(Buffer ptr, int _instanceCount);/*
		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		  vkObj->instanceCount = (uint32_t) (_instanceCount);
	  */

	/**
	 * native GET method for field instanceCount	[int]<br>
	 * Prototype: uint32_t  instanceCount
	 */ 
	 private static native int getInstanceCount0(Buffer ptr);/*
		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		  return (jint) (vkObj->instanceCount);
	 */

	/**
	 * native SET method for field firstIndex	[int]<br>
	 * Prototype: uint32_t  firstIndex
	 */ 
	 private static native void setFirstIndex0(Buffer ptr, int _firstIndex);/*
		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		  vkObj->firstIndex = (uint32_t) (_firstIndex);
	  */

	/**
	 * native GET method for field firstIndex	[int]<br>
	 * Prototype: uint32_t  firstIndex
	 */ 
	 private static native int getFirstIndex0(Buffer ptr);/*
		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		  return (jint) (vkObj->firstIndex);
	 */

	/**
	 * native SET method for field vertexOffset	[int]<br>
	 * Prototype: int32_t  vertexOffset
	 */ 
	 private static native void setVertexOffset0(Buffer ptr, int _vertexOffset);/*
		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		  vkObj->vertexOffset = (int32_t) (_vertexOffset);
	  */

	/**
	 * native GET method for field vertexOffset	[int]<br>
	 * Prototype: int32_t  vertexOffset
	 */ 
	 private static native int getVertexOffset0(Buffer ptr);/*
		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		  return (jint) (vkObj->vertexOffset);
	 */

	/**
	 * native SET method for field firstInstance	[int]<br>
	 * Prototype: uint32_t  firstInstance
	 */ 
	 private static native void setFirstInstance0(Buffer ptr, int _firstInstance);/*
		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		  vkObj->firstInstance = (uint32_t) (_firstInstance);
	  */

	/**
	 * native GET method for field firstInstance	[int]<br>
	 * Prototype: uint32_t  firstInstance
	 */ 
	 private static native int getFirstInstance0(Buffer ptr);/*
		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		  return (jint) (vkObj->firstInstance);
	 */



} // end of class VkDrawIndexedIndirectCommand
