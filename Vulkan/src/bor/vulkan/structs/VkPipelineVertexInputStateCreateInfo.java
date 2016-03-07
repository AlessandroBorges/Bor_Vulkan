/**
 * Class wrapping Vulkan's VkPipelineVertexInputStateCreateInfo struct.
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
 *  This class is a Java front end for struct VkPipelineVertexInputStateCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPipelineVertexInputStateCreateInfo {
 *     VkStructureType                             sType;
 *     const void*                                 pNext;
 *     VkPipelineVertexInputStateCreateFlags       flags;
 *     uint32_t                                    vertexBindingDescriptionCount;
 *     const VkVertexInputBindingDescription*      pVertexBindingDescriptions;
 *     uint32_t                                    vertexAttributeDescriptionCount;
 *     const VkVertexInputAttributeDescription*    pVertexAttributeDescriptions;
 * } VkPipelineVertexInputStateCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkPipelineVertexInputStateCreateInfo extends VkStruct {
	/** TAG of this structure [51]  */
	 private static final String TAG = "VkPipelineVertexInputStateCreateInfo";

	/** ID of this structure [51]  */
	 public static final int TAG_ID = VKPIPELINEVERTEXINPUTSTATECREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkPipelineVertexInputStateCreateInfo> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkStructureType 	sType	[vkenum]
	 */ 
	 VkStructureType 	sType;

	/**
	 *  const void* 	pNext	[p]
	 */ 
	 P<VkObject> 	pNext;

	/**
	 *  VkPipelineVertexInputStateCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  uint32_t 	vertexBindingDescriptionCount	[int]
	 */ 
	 int 	vertexBindingDescriptionCount;

	/**
	 *  const VkVertexInputBindingDescription* 	pVertexBindingDescriptions	[p]
	 */ 
	 P<VkVertexInputBindingDescription>  	pVertexBindingDescriptions;

	/**
	 *  uint32_t 	vertexAttributeDescriptionCount	[int]
	 */ 
	 int 	vertexAttributeDescriptionCount;

	/**
	 *  const VkVertexInputAttributeDescription* 	pVertexAttributeDescriptions	[p]
	 */ 
	 P<VkVertexInputAttributeDescription>  	pVertexAttributeDescriptions;

	/**
	 * Ctor
	 */
	public VkPipelineVertexInputStateCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineVertexInputStateCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkPipelineVertexInputStateCreateInfo(long address, int memSize){ 
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
	 public static P<VkPipelineVertexInputStateCreateInfo> createNullPointer(){
	        P<VkPipelineVertexInputStateCreateInfo> p = new  P<VkPipelineVertexInputStateCreateInfo>(new VkPipelineVertexInputStateCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkPipelineVertexInputStateCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkPipelineVertexInputStateCreateInfo> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(P<VkObject> pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public P<VkObject> pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field flags	[int]<br>
	 * Prototype: VkPipelineVertexInputStateCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkPipelineVertexInputStateCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field vertexBindingDescriptionCount	[int]<br>
	 * Prototype: uint32_t  vertexBindingDescriptionCount
	 */ 
	 public void vertexBindingDescriptionCount(int vertexBindingDescriptionCount){
		 this.vertexBindingDescriptionCount = vertexBindingDescriptionCount;
		vertexBindingDescriptionCount0(super.ptr, vertexBindingDescriptionCount);
	 }

	/**
	 * get method for field vertexBindingDescriptionCount	[int]<br>
	 * Prototype: uint32_t  vertexBindingDescriptionCount
	 */ 
	 public int vertexBindingDescriptionCount(){
		 // return  this.vertexBindingDescriptionCount;
		 return vertexBindingDescriptionCount0(super.ptr);
	 }

	/**
	 * Set method for field pVertexBindingDescriptions	[p]<br>
	 * Prototype: const VkVertexInputBindingDescription*  pVertexBindingDescriptions
	 */ 
	 public void pVertexBindingDescriptions(P<VkVertexInputBindingDescription>  pVertexBindingDescriptions){
		 this.pVertexBindingDescriptions = pVertexBindingDescriptions;
		pVertexBindingDescriptions0(super.ptr, pVertexBindingDescriptions);
	 }

	/**
	 * get method for field pVertexBindingDescriptions	[p]<br>
	 * Prototype: const VkVertexInputBindingDescription*  pVertexBindingDescriptions
	 */ 
	 public P<VkVertexInputBindingDescription>  pVertexBindingDescriptions(){
		 // return  this.pVertexBindingDescriptions;
		 return pVertexBindingDescriptions0(super.ptr);
	 }

	/**
	 * Set method for field vertexAttributeDescriptionCount	[int]<br>
	 * Prototype: uint32_t  vertexAttributeDescriptionCount
	 */ 
	 public void vertexAttributeDescriptionCount(int vertexAttributeDescriptionCount){
		 this.vertexAttributeDescriptionCount = vertexAttributeDescriptionCount;
		vertexAttributeDescriptionCount0(super.ptr, vertexAttributeDescriptionCount);
	 }

	/**
	 * get method for field vertexAttributeDescriptionCount	[int]<br>
	 * Prototype: uint32_t  vertexAttributeDescriptionCount
	 */ 
	 public int vertexAttributeDescriptionCount(){
		 // return  this.vertexAttributeDescriptionCount;
		 return vertexAttributeDescriptionCount0(super.ptr);
	 }

	/**
	 * Set method for field pVertexAttributeDescriptions	[p]<br>
	 * Prototype: const VkVertexInputAttributeDescription*  pVertexAttributeDescriptions
	 */ 
	 public void pVertexAttributeDescriptions(P<VkVertexInputAttributeDescription>  pVertexAttributeDescriptions){
		 this.pVertexAttributeDescriptions = pVertexAttributeDescriptions;
		pVertexAttributeDescriptions0(super.ptr, pVertexAttributeDescriptions);
	 }

	/**
	 * get method for field pVertexAttributeDescriptions	[p]<br>
	 * Prototype: const VkVertexInputAttributeDescription*  pVertexAttributeDescriptions
	 */ 
	 public P<VkVertexInputAttributeDescription>  pVertexAttributeDescriptions(){
		 // return  this.pVertexAttributeDescriptions;
		 return pVertexAttributeDescriptions0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineVertexInputStateCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(*ptr);
		  _obj.flags = (VkPipelineVertexInputStateCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineVertexInputStateCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(ptr);
		  return (jint) (_obj.VkPipelineVertexInputStateCreateFlags);
	 */

	/**
	 * native SET method for field vertexBindingDescriptionCount	[int]<br>
	 * Prototype: uint32_t  vertexBindingDescriptionCount
	 */ 
	 private static native void vertexBindingDescriptionCount0(ByteBuffer ptr, int _vertexBindingDescriptionCount);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(*ptr);
		  _obj.vertexBindingDescriptionCount = (uint32_t) (_vertexBindingDescriptionCount);
	  */

	/**
	 * native GET method for field vertexBindingDescriptionCount	[int]<br>
	 * Prototype: uint32_t  vertexBindingDescriptionCount
	 */ 
	 private static native int vertexBindingDescriptionCount0(ByteBuffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field pVertexBindingDescriptions	[p]<br>
	 * Prototype: const VkVertexInputBindingDescription*  pVertexBindingDescriptions
	 */ 
	 private static native void pVertexBindingDescriptions0(ByteBuffer ptr, P<VkVertexInputBindingDescription>  _pVertexBindingDescriptions);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(*ptr);
		  _obj.pVertexBindingDescriptions = (const VkVertexInputBindingDescription*) (_pVertexBindingDescriptions);
	  */

	/**
	 * native GET method for field pVertexBindingDescriptions	[p]<br>
	 * Prototype: const VkVertexInputBindingDescription*  pVertexBindingDescriptions
	 */ 
	 private static native P<VkVertexInputBindingDescription>  pVertexBindingDescriptions0(ByteBuffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(ptr);
		  return (P<VkVertexInputBindingDescription> ) (_obj.const VkVertexInputBindingDescription*);
	 */

	/**
	 * native SET method for field vertexAttributeDescriptionCount	[int]<br>
	 * Prototype: uint32_t  vertexAttributeDescriptionCount
	 */ 
	 private static native void vertexAttributeDescriptionCount0(ByteBuffer ptr, int _vertexAttributeDescriptionCount);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(*ptr);
		  _obj.vertexAttributeDescriptionCount = (uint32_t) (_vertexAttributeDescriptionCount);
	  */

	/**
	 * native GET method for field vertexAttributeDescriptionCount	[int]<br>
	 * Prototype: uint32_t  vertexAttributeDescriptionCount
	 */ 
	 private static native int vertexAttributeDescriptionCount0(ByteBuffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field pVertexAttributeDescriptions	[p]<br>
	 * Prototype: const VkVertexInputAttributeDescription*  pVertexAttributeDescriptions
	 */ 
	 private static native void pVertexAttributeDescriptions0(ByteBuffer ptr, P<VkVertexInputAttributeDescription>  _pVertexAttributeDescriptions);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(*ptr);
		  _obj.pVertexAttributeDescriptions = (const VkVertexInputAttributeDescription*) (_pVertexAttributeDescriptions);
	  */

	/**
	 * native GET method for field pVertexAttributeDescriptions	[p]<br>
	 * Prototype: const VkVertexInputAttributeDescription*  pVertexAttributeDescriptions
	 */ 
	 private static native P<VkVertexInputAttributeDescription>  pVertexAttributeDescriptions0(ByteBuffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(ptr);
		  return (P<VkVertexInputAttributeDescription> ) (_obj.const VkVertexInputAttributeDescription*);
	 */



} // end of class VkPipelineVertexInputStateCreateInfo
