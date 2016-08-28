/**
 * Class wrapping Vulkan's VkDrawIndirectCommand struct.
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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkDrawIndirectCommand extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [105]  */
	 private static final String TAG = "VkDrawIndirectCommand";

	/** ID of this structure [105]  */
	 public static final int TAG_ID = VKDRAWINDIRECTCOMMAND_ID;

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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDrawIndirectCommand(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDrawIndirectCommand(long address){ 
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
	 public static VkArray<VkDrawIndirectCommand> createVkArray(int size){ 
		 VkDrawIndirectCommand[] array = new VkDrawIndirectCommand[size]; 
		 VkArrayStruct<VkDrawIndirectCommand> vkArray = new VkArrayStruct<VkDrawIndirectCommand> (array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field vertexCount	[int]<br>
	 * Prototype: uint32_t  vertexCount
	 * 
	 * @param vertexCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDrawIndirectCommand vertexCount(int vertexCount){
		 this.vertexCount = vertexCount;
		 setVertexCount0(this.ptr,  vertexCount);
		 return this;
	 }

	/**
	 * Get method for field vertexCount	[int]<br>
	 * Prototype: uint32_t  vertexCount
	 */ 
	 public int vertexCount(){
		 int var = getVertexCount0(super.ptr);
		 this.vertexCount = var;
		 return this.vertexCount;
	 }

	/**
	 * Set method for field instanceCount	[int]<br>
	 * Prototype: uint32_t  instanceCount
	 * 
	 * @param instanceCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDrawIndirectCommand instanceCount(int instanceCount){
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
	 * Set method for field firstVertex	[int]<br>
	 * Prototype: uint32_t  firstVertex
	 * 
	 * @param firstVertex - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDrawIndirectCommand firstVertex(int firstVertex){
		 this.firstVertex = firstVertex;
		 setFirstVertex0(this.ptr,  firstVertex);
		 return this;
	 }

	/**
	 * Get method for field firstVertex	[int]<br>
	 * Prototype: uint32_t  firstVertex
	 */ 
	 public int firstVertex(){
		 int var = getFirstVertex0(super.ptr);
		 this.firstVertex = var;
		 return this.firstVertex;
	 }

	/**
	 * Set method for field firstInstance	[int]<br>
	 * Prototype: uint32_t  firstInstance
	 * 
	 * @param firstInstance - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDrawIndirectCommand firstInstance(int firstInstance){
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
         builder.append("VkDrawIndirectCommand [ ")
				.append("vertexCount: ").append(vertexCount() )
				.append(",\n instanceCount: ")
				.append(instanceCount() )
				.append(",\n firstVertex: ")
				.append(firstVertex() )
				.append(",\n firstInstance: ")
				.append(firstInstance() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field vertexCount	[int]<br>
	 * Prototype: uint32_t  vertexCount
	 */ 
	 private static native void setVertexCount0(Buffer ptr, int _vertexCount);/*
		  VkDrawIndirectCommand* vkObj = (VkDrawIndirectCommand*)(ptr);
		 // code for simple past value 
		  vkObj->vertexCount = (uint32_t) (_vertexCount);
	  */

	/**
	 * Native GET method for field vertexCount	[int]<br>
	 * Prototype: uint32_t  vertexCount
	 */ 
	 private static native int getVertexCount0(Buffer ptr);/*
		  VkDrawIndirectCommand* vkObj = (VkDrawIndirectCommand*)(ptr);
		  return (jint) (vkObj->vertexCount);
	 */

	/**
	 * Native SET method for field instanceCount	[int]<br>
	 * Prototype: uint32_t  instanceCount
	 */ 
	 private static native void setInstanceCount0(Buffer ptr, int _instanceCount);/*
		  VkDrawIndirectCommand* vkObj = (VkDrawIndirectCommand*)(ptr);
		 // code for simple past value 
		  vkObj->instanceCount = (uint32_t) (_instanceCount);
	  */

	/**
	 * Native GET method for field instanceCount	[int]<br>
	 * Prototype: uint32_t  instanceCount
	 */ 
	 private static native int getInstanceCount0(Buffer ptr);/*
		  VkDrawIndirectCommand* vkObj = (VkDrawIndirectCommand*)(ptr);
		  return (jint) (vkObj->instanceCount);
	 */

	/**
	 * Native SET method for field firstVertex	[int]<br>
	 * Prototype: uint32_t  firstVertex
	 */ 
	 private static native void setFirstVertex0(Buffer ptr, int _firstVertex);/*
		  VkDrawIndirectCommand* vkObj = (VkDrawIndirectCommand*)(ptr);
		 // code for simple past value 
		  vkObj->firstVertex = (uint32_t) (_firstVertex);
	  */

	/**
	 * Native GET method for field firstVertex	[int]<br>
	 * Prototype: uint32_t  firstVertex
	 */ 
	 private static native int getFirstVertex0(Buffer ptr);/*
		  VkDrawIndirectCommand* vkObj = (VkDrawIndirectCommand*)(ptr);
		  return (jint) (vkObj->firstVertex);
	 */

	/**
	 * Native SET method for field firstInstance	[int]<br>
	 * Prototype: uint32_t  firstInstance
	 */ 
	 private static native void setFirstInstance0(Buffer ptr, int _firstInstance);/*
		  VkDrawIndirectCommand* vkObj = (VkDrawIndirectCommand*)(ptr);
		 // code for simple past value 
		  vkObj->firstInstance = (uint32_t) (_firstInstance);
	  */

	/**
	 * Native GET method for field firstInstance	[int]<br>
	 * Prototype: uint32_t  firstInstance
	 */ 
	 private static native int getFirstInstance0(Buffer ptr);/*
		  VkDrawIndirectCommand* vkObj = (VkDrawIndirectCommand*)(ptr);
		  return (jint) (vkObj->firstInstance);
	 */



} // end of class VkDrawIndirectCommand
