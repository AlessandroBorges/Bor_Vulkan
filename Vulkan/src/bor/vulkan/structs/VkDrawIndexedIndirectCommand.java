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
	 public VkDrawIndexedIndirectCommand(long address, int memSize){ 
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
		indexCount0(super.ptr, indexCount);
	 }

	/**
	 * get method for field indexCount	[int]<br>
	 * Prototype: uint32_t  indexCount
	 */ 
	 public int indexCount(){
		 // return  this.indexCount;
		 return indexCount0(super.ptr);
	 }

	/**
	 * Set method for field instanceCount	[int]<br>
	 * Prototype: uint32_t  instanceCount
	 */ 
	 public void instanceCount(int instanceCount){
		 this.instanceCount = instanceCount;
		instanceCount0(super.ptr, instanceCount);
	 }

	/**
	 * get method for field instanceCount	[int]<br>
	 * Prototype: uint32_t  instanceCount
	 */ 
	 public int instanceCount(){
		 // return  this.instanceCount;
		 return instanceCount0(super.ptr);
	 }

	/**
	 * Set method for field firstIndex	[int]<br>
	 * Prototype: uint32_t  firstIndex
	 */ 
	 public void firstIndex(int firstIndex){
		 this.firstIndex = firstIndex;
		firstIndex0(super.ptr, firstIndex);
	 }

	/**
	 * get method for field firstIndex	[int]<br>
	 * Prototype: uint32_t  firstIndex
	 */ 
	 public int firstIndex(){
		 // return  this.firstIndex;
		 return firstIndex0(super.ptr);
	 }

	/**
	 * Set method for field vertexOffset	[int]<br>
	 * Prototype: int32_t  vertexOffset
	 */ 
	 public void vertexOffset(int vertexOffset){
		 this.vertexOffset = vertexOffset;
		vertexOffset0(super.ptr, vertexOffset);
	 }

	/**
	 * get method for field vertexOffset	[int]<br>
	 * Prototype: int32_t  vertexOffset
	 */ 
	 public int vertexOffset(){
		 // return  this.vertexOffset;
		 return vertexOffset0(super.ptr);
	 }

	/**
	 * Set method for field firstInstance	[int]<br>
	 * Prototype: uint32_t  firstInstance
	 */ 
	 public void firstInstance(int firstInstance){
		 this.firstInstance = firstInstance;
		firstInstance0(super.ptr, firstInstance);
	 }

	/**
	 * get method for field firstInstance	[int]<br>
	 * Prototype: uint32_t  firstInstance
	 */ 
	 public int firstInstance(){
		 // return  this.firstInstance;
		 return firstInstance0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field indexCount	[int]<br>
	 * Prototype: uint32_t  indexCount
	 */ 
	 private static native void indexCount0(ByteBuffer ptr, int _indexCount);/*
		  VkDrawIndexedIndirectCommand _obj = (VkDrawIndexedIndirectCommand)(*ptr);
		  _obj.indexCount = (uint32_t) (_indexCount);
	  */

	/**
	 * native GET method for field indexCount	[int]<br>
	 * Prototype: uint32_t  indexCount
	 */ 
	 private static native int indexCount0(ByteBuffer ptr);/*
		  VkDrawIndexedIndirectCommand _obj = (VkDrawIndexedIndirectCommand)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field instanceCount	[int]<br>
	 * Prototype: uint32_t  instanceCount
	 */ 
	 private static native void instanceCount0(ByteBuffer ptr, int _instanceCount);/*
		  VkDrawIndexedIndirectCommand _obj = (VkDrawIndexedIndirectCommand)(*ptr);
		  _obj.instanceCount = (uint32_t) (_instanceCount);
	  */

	/**
	 * native GET method for field instanceCount	[int]<br>
	 * Prototype: uint32_t  instanceCount
	 */ 
	 private static native int instanceCount0(ByteBuffer ptr);/*
		  VkDrawIndexedIndirectCommand _obj = (VkDrawIndexedIndirectCommand)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field firstIndex	[int]<br>
	 * Prototype: uint32_t  firstIndex
	 */ 
	 private static native void firstIndex0(ByteBuffer ptr, int _firstIndex);/*
		  VkDrawIndexedIndirectCommand _obj = (VkDrawIndexedIndirectCommand)(*ptr);
		  _obj.firstIndex = (uint32_t) (_firstIndex);
	  */

	/**
	 * native GET method for field firstIndex	[int]<br>
	 * Prototype: uint32_t  firstIndex
	 */ 
	 private static native int firstIndex0(ByteBuffer ptr);/*
		  VkDrawIndexedIndirectCommand _obj = (VkDrawIndexedIndirectCommand)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field vertexOffset	[int]<br>
	 * Prototype: int32_t  vertexOffset
	 */ 
	 private static native void vertexOffset0(ByteBuffer ptr, int _vertexOffset);/*
		  VkDrawIndexedIndirectCommand _obj = (VkDrawIndexedIndirectCommand)(*ptr);
		  _obj.vertexOffset = (int32_t) (_vertexOffset);
	  */

	/**
	 * native GET method for field vertexOffset	[int]<br>
	 * Prototype: int32_t  vertexOffset
	 */ 
	 private static native int vertexOffset0(ByteBuffer ptr);/*
		  VkDrawIndexedIndirectCommand _obj = (VkDrawIndexedIndirectCommand)(ptr);
		  return (jint) (_obj.int32_t);
	 */

	/**
	 * native SET method for field firstInstance	[int]<br>
	 * Prototype: uint32_t  firstInstance
	 */ 
	 private static native void firstInstance0(ByteBuffer ptr, int _firstInstance);/*
		  VkDrawIndexedIndirectCommand _obj = (VkDrawIndexedIndirectCommand)(*ptr);
		  _obj.firstInstance = (uint32_t) (_firstInstance);
	  */

	/**
	 * native GET method for field firstInstance	[int]<br>
	 * Prototype: uint32_t  firstInstance
	 */ 
	 private static native int firstInstance0(ByteBuffer ptr);/*
		  VkDrawIndexedIndirectCommand _obj = (VkDrawIndexedIndirectCommand)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkDrawIndexedIndirectCommand
