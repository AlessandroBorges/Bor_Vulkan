/**
 * Class wrapping Vulkan's VkDescriptorPoolSize struct.
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
 *  This class is a Java front end for struct VkDescriptorPoolSize. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDescriptorPoolSize {
 *     VkDescriptorType    type;
 *     uint32_t            descriptorCount;
 * } VkDescriptorPoolSize;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkDescriptorPoolSize extends VkStruct {
	/** TAG of this structure [73]  */
	 private static final String TAG = "VkDescriptorPoolSize";

	/** ID of this structure [73]  */
	 public static final int TAG_ID = VKDESCRIPTORPOOLSIZE_ID;

	/** P wrapper for THIS object */
	 private  P<VkDescriptorPoolSize> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkDescriptorType 	type	[vkenum]
	 */ 
	 VkDescriptorType 	type;

	/**
	 *  uint32_t 	descriptorCount	[int]
	 */ 
	 int 	descriptorCount;

	/**
	 * Ctor
	 */
	public VkDescriptorPoolSize(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDescriptorPoolSize(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkDescriptorPoolSize(long address, int memSize){ 
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
	 public static P<VkDescriptorPoolSize> createNullPointer(){
	        P<VkDescriptorPoolSize> p = new  P<VkDescriptorPoolSize>(new VkDescriptorPoolSize());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkDescriptorPoolSize> getP() {
	       if(p == null ){
	           p = new P<VkDescriptorPoolSize> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field type	[vkenum]<br>
	 * Prototype: VkDescriptorType  type
	 */ 
	 public void type(VkDescriptorType type){
		 this.type = type;
		type0(super.ptr, type);
	 }

	/**
	 * get method for field type	[vkenum]<br>
	 * Prototype: VkDescriptorType  type
	 */ 
	 public VkDescriptorType type(){
		 // return  this.type;
		 return type0(super.ptr);
	 }

	/**
	 * Set method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 public void descriptorCount(int descriptorCount){
		 this.descriptorCount = descriptorCount;
		descriptorCount0(super.ptr, descriptorCount);
	 }

	/**
	 * get method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 public int descriptorCount(){
		 // return  this.descriptorCount;
		 return descriptorCount0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field type	[vkenum]<br>
	 * Prototype: VkDescriptorType  type
	 */ 
	 private static native void type0(ByteBuffer ptr, VkDescriptorType _type);/*
		  VkDescriptorPoolSize _obj = (VkDescriptorPoolSize)(*ptr);
		  _obj.type = (VkDescriptorType) (_type);
	  */

	/**
	 * native GET method for field type	[vkenum]<br>
	 * Prototype: VkDescriptorType  type
	 */ 
	 private static native VkDescriptorType type0(ByteBuffer ptr);/*
		  VkDescriptorPoolSize _obj = (VkDescriptorPoolSize)(ptr);
		  return (VkDescriptorType) (_obj.VkDescriptorType);
	 */

	/**
	 * native SET method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native void descriptorCount0(ByteBuffer ptr, int _descriptorCount);/*
		  VkDescriptorPoolSize _obj = (VkDescriptorPoolSize)(*ptr);
		  _obj.descriptorCount = (uint32_t) (_descriptorCount);
	  */

	/**
	 * native GET method for field descriptorCount	[int]<br>
	 * Prototype: uint32_t  descriptorCount
	 */ 
	 private static native int descriptorCount0(ByteBuffer ptr);/*
		  VkDescriptorPoolSize _obj = (VkDescriptorPoolSize)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkDescriptorPoolSize
