/**
 * Class wrapping Vulkan's VkDrawIndexedIndirectCommand struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.65 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
 package bor.vulkan.structs;

 import bor.util.*;
 import bor.vulkan.*;
 import static bor.vulkan.Vulkan.*; 
 import bor.vulkan.enumerations.*;

 import java.util.*;
 import java.nio.*;


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
 * @version Ver. 0.8.65 (beta) 
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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDrawIndexedIndirectCommand(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	/** 
	 * Static method to create a VkArray for this VkStruct subclass.
	 * @param size - number of elements
	 */
	 public static VkArray<VkDrawIndexedIndirectCommand> createVkArray(int size){ 
		 VkDrawIndexedIndirectCommand[] array = new VkDrawIndexedIndirectCommand[size]; 
		 VkArrayStruct<VkDrawIndexedIndirectCommand> vkArray = new VkArrayStruct<VkDrawIndexedIndirectCommand> (array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field indexCount	[int]<br>
	 * Prototype: uint32_t  indexCount
	 * 
	 * @param indexCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDrawIndexedIndirectCommand indexCount(int indexCount){
		 this.indexCount = indexCount;
		 setIndexCount0(this.ptr,  indexCount);
		 return this;
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
	 * 
	 * @param instanceCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDrawIndexedIndirectCommand instanceCount(int instanceCount){
		 this.instanceCount = instanceCount;
		 setInstanceCount0(this.ptr,  instanceCount);
		 return this;
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
	 * 
	 * @param firstIndex - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDrawIndexedIndirectCommand firstIndex(int firstIndex){
		 this.firstIndex = firstIndex;
		 setFirstIndex0(this.ptr,  firstIndex);
		 return this;
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
	 * 
	 * @param vertexOffset - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDrawIndexedIndirectCommand vertexOffset(int vertexOffset){
		 this.vertexOffset = vertexOffset;
		 setVertexOffset0(this.ptr,  vertexOffset);
		 return this;
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
	 * 
	 * @param firstInstance - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDrawIndexedIndirectCommand firstInstance(int firstInstance){
		 this.firstInstance = firstInstance;
		 setFirstInstance0(this.ptr,  firstInstance);
		 return this;
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


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkDrawIndexedIndirectCommand [ ")
				.append("indexCount: ").append(indexCount() )
				.append(",\n instanceCount: ")
				.append(instanceCount() )
				.append(",\n firstIndex: ")
				.append(firstIndex() )
				.append(",\n vertexOffset: ")
				.append(vertexOffset() )
				.append(",\n firstInstance: ")
				.append(firstInstance() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field indexCount	[int]<br>
	 * Prototype: uint32_t  indexCount
	 */ 
	 private static native void setIndexCount0(Buffer ptr, int _indexCount);/*
		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		 // code for simple past value 
		  vkObj->indexCount = (uint32_t) (_indexCount);
	  */

	/**
	 * Native GET method for field indexCount	[int]<br>
	 * Prototype: uint32_t  indexCount
	 */ 
	 private static native int getIndexCount0(Buffer ptr);/*
		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		  return (jint) (vkObj->indexCount);
	 */

	/**
	 * Native SET method for field instanceCount	[int]<br>
	 * Prototype: uint32_t  instanceCount
	 */ 
	 private static native void setInstanceCount0(Buffer ptr, int _instanceCount);/*
		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		 // code for simple past value 
		  vkObj->instanceCount = (uint32_t) (_instanceCount);
	  */

	/**
	 * Native GET method for field instanceCount	[int]<br>
	 * Prototype: uint32_t  instanceCount
	 */ 
	 private static native int getInstanceCount0(Buffer ptr);/*
		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		  return (jint) (vkObj->instanceCount);
	 */

	/**
	 * Native SET method for field firstIndex	[int]<br>
	 * Prototype: uint32_t  firstIndex
	 */ 
	 private static native void setFirstIndex0(Buffer ptr, int _firstIndex);/*
		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		 // code for simple past value 
		  vkObj->firstIndex = (uint32_t) (_firstIndex);
	  */

	/**
	 * Native GET method for field firstIndex	[int]<br>
	 * Prototype: uint32_t  firstIndex
	 */ 
	 private static native int getFirstIndex0(Buffer ptr);/*
		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		  return (jint) (vkObj->firstIndex);
	 */

	/**
	 * Native SET method for field vertexOffset	[int]<br>
	 * Prototype: int32_t  vertexOffset
	 */ 
	 private static native void setVertexOffset0(Buffer ptr, int _vertexOffset);/*
		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		 // code for simple past value 
		  vkObj->vertexOffset = (int32_t) (_vertexOffset);
	  */

	/**
	 * Native GET method for field vertexOffset	[int]<br>
	 * Prototype: int32_t  vertexOffset
	 */ 
	 private static native int getVertexOffset0(Buffer ptr);/*
		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		  return (jint) (vkObj->vertexOffset);
	 */

	/**
	 * Native SET method for field firstInstance	[int]<br>
	 * Prototype: uint32_t  firstInstance
	 */ 
	 private static native void setFirstInstance0(Buffer ptr, int _firstInstance);/*
		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		 // code for simple past value 
		  vkObj->firstInstance = (uint32_t) (_firstInstance);
	  */

	/**
	 * Native GET method for field firstInstance	[int]<br>
	 * Prototype: uint32_t  firstInstance
	 */ 
	 private static native int getFirstInstance0(Buffer ptr);/*
		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		  return (jint) (vkObj->firstInstance);
	 */



} // end of class VkDrawIndexedIndirectCommand
