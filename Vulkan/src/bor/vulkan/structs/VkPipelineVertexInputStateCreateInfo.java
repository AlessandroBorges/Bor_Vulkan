// class wrapping Vulkan's VkPipelineVertexInputStateCreateInfo struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkPipelineVertexInputStateCreateInfo 
 * @Author Alessandro Borges 
 */
public class VkPipelineVertexInputStateCreateInfo extends VkStruct {
	/** ID of this structure [51]  */
	 public static final int TAG = VKPIPELINEVERTEXINPUTSTATECREATEINFO_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType 
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext 
	 */ 
	VkObject 	pNext;

	/**
	 *  VkPipelineVertexInputStateCreateFlags 	flags 
	 */ 
	int 	flags;

	/**
	 *  uint32_t 	vertexBindingDescriptionCount 
	 */ 
	int 	vertexBindingDescriptionCount;

	/**
	 *  const VkVertexInputBindingDescription* 	pVertexBindingDescriptions 
	 */ 
	const VkVertexInputBindingDescription* 	pVertexBindingDescriptions;

	/**
	 *  uint32_t 	vertexAttributeDescriptionCount 
	 */ 
	int 	vertexAttributeDescriptionCount;

	/**
	 *  const VkVertexInputAttributeDescription* 	pVertexAttributeDescriptions 
	 */ 
	const VkVertexInputAttributeDescription* 	pVertexAttributeDescriptions;

	/**
	 * Ctor
	 */
	public VkPipelineVertexInputStateCreateInfo(){ 
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
	 * Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field flags
	 * Prototype: VkPipelineVertexInputStateCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkPipelineVertexInputStateCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field vertexBindingDescriptionCount
	 * Prototype: uint32_t  vertexBindingDescriptionCount
	 */ 
	 public void vertexBindingDescriptionCount(int vertexBindingDescriptionCount){
		 this.vertexBindingDescriptionCount = vertexBindingDescriptionCount;
		vertexBindingDescriptionCount0(super.ptr, vertexBindingDescriptionCount);
	 }

	/**
	 * get method for field vertexBindingDescriptionCount
	 * Prototype: uint32_t  vertexBindingDescriptionCount
	 */ 
	 public int vertexBindingDescriptionCount(){
		 // return  this.vertexBindingDescriptionCount;
		 return vertexBindingDescriptionCount0(super.ptr);
	 }

	/**
	 * Set method for field pVertexBindingDescriptions
	 * Prototype: const VkVertexInputBindingDescription*  pVertexBindingDescriptions
	 */ 
	 public void pVertexBindingDescriptions(const VkVertexInputBindingDescription* pVertexBindingDescriptions){
		 this.pVertexBindingDescriptions = pVertexBindingDescriptions;
		pVertexBindingDescriptions0(super.ptr, pVertexBindingDescriptions);
	 }

	/**
	 * get method for field pVertexBindingDescriptions
	 * Prototype: const VkVertexInputBindingDescription*  pVertexBindingDescriptions
	 */ 
	 public const VkVertexInputBindingDescription* pVertexBindingDescriptions(){
		 // return  this.pVertexBindingDescriptions;
		 return pVertexBindingDescriptions0(super.ptr);
	 }

	/**
	 * Set method for field vertexAttributeDescriptionCount
	 * Prototype: uint32_t  vertexAttributeDescriptionCount
	 */ 
	 public void vertexAttributeDescriptionCount(int vertexAttributeDescriptionCount){
		 this.vertexAttributeDescriptionCount = vertexAttributeDescriptionCount;
		vertexAttributeDescriptionCount0(super.ptr, vertexAttributeDescriptionCount);
	 }

	/**
	 * get method for field vertexAttributeDescriptionCount
	 * Prototype: uint32_t  vertexAttributeDescriptionCount
	 */ 
	 public int vertexAttributeDescriptionCount(){
		 // return  this.vertexAttributeDescriptionCount;
		 return vertexAttributeDescriptionCount0(super.ptr);
	 }

	/**
	 * Set method for field pVertexAttributeDescriptions
	 * Prototype: const VkVertexInputAttributeDescription*  pVertexAttributeDescriptions
	 */ 
	 public void pVertexAttributeDescriptions(const VkVertexInputAttributeDescription* pVertexAttributeDescriptions){
		 this.pVertexAttributeDescriptions = pVertexAttributeDescriptions;
		pVertexAttributeDescriptions0(super.ptr, pVertexAttributeDescriptions);
	 }

	/**
	 * get method for field pVertexAttributeDescriptions
	 * Prototype: const VkVertexInputAttributeDescription*  pVertexAttributeDescriptions
	 */ 
	 public const VkVertexInputAttributeDescription* pVertexAttributeDescriptions(){
		 // return  this.pVertexAttributeDescriptions;
		 return pVertexAttributeDescriptions0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkPipelineVertexInputStateCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(*ptr);
		  _obj.flags = (VkPipelineVertexInputStateCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkPipelineVertexInputStateCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(ptr);
		  return (jint) (_obj.VkPipelineVertexInputStateCreateFlags);
	 */

	/**
	 * native Set method for field vertexBindingDescriptionCount
	 * Prototype: uint32_t  vertexBindingDescriptionCount
	 */ 
	 private static native void vertexBindingDescriptionCount0(ByteBuffer ptr, int _vertexBindingDescriptionCount);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(*ptr);
		  _obj.vertexBindingDescriptionCount = (uint32_t) (_vertexBindingDescriptionCount);
	  */

	/**
	 * get method for field vertexBindingDescriptionCount
	 * Prototype: uint32_t  vertexBindingDescriptionCount
	 */ 
	 private static native int vertexBindingDescriptionCount0(ByteBuffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pVertexBindingDescriptions
	 * Prototype: const VkVertexInputBindingDescription*  pVertexBindingDescriptions
	 */ 
	 private static native void pVertexBindingDescriptions0(ByteBuffer ptr, const VkVertexInputBindingDescription* _pVertexBindingDescriptions);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(*ptr);
		  _obj.pVertexBindingDescriptions = (const VkVertexInputBindingDescription*) (_pVertexBindingDescriptions);
	  */

	/**
	 * get method for field pVertexBindingDescriptions
	 * Prototype: const VkVertexInputBindingDescription*  pVertexBindingDescriptions
	 */ 
	 private static native const VkVertexInputBindingDescription* pVertexBindingDescriptions0(ByteBuffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(ptr);
		  return (const VkVertexInputBindingDescription*) (_obj.const VkVertexInputBindingDescription*);
	 */

	/**
	 * native Set method for field vertexAttributeDescriptionCount
	 * Prototype: uint32_t  vertexAttributeDescriptionCount
	 */ 
	 private static native void vertexAttributeDescriptionCount0(ByteBuffer ptr, int _vertexAttributeDescriptionCount);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(*ptr);
		  _obj.vertexAttributeDescriptionCount = (uint32_t) (_vertexAttributeDescriptionCount);
	  */

	/**
	 * get method for field vertexAttributeDescriptionCount
	 * Prototype: uint32_t  vertexAttributeDescriptionCount
	 */ 
	 private static native int vertexAttributeDescriptionCount0(ByteBuffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pVertexAttributeDescriptions
	 * Prototype: const VkVertexInputAttributeDescription*  pVertexAttributeDescriptions
	 */ 
	 private static native void pVertexAttributeDescriptions0(ByteBuffer ptr, const VkVertexInputAttributeDescription* _pVertexAttributeDescriptions);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(*ptr);
		  _obj.pVertexAttributeDescriptions = (const VkVertexInputAttributeDescription*) (_pVertexAttributeDescriptions);
	  */

	/**
	 * get method for field pVertexAttributeDescriptions
	 * Prototype: const VkVertexInputAttributeDescription*  pVertexAttributeDescriptions
	 */ 
	 private static native const VkVertexInputAttributeDescription* pVertexAttributeDescriptions0(ByteBuffer ptr);/*
		  VkPipelineVertexInputStateCreateInfo _obj = (VkPipelineVertexInputStateCreateInfo)(ptr);
		  return (const VkVertexInputAttributeDescription*) (_obj.const VkVertexInputAttributeDescription*);
	 */



} // end of class VkPipelineVertexInputStateCreateInfo
