/**
 * Class wrapping Vulkan's VkPipelineInputAssemblyStateCreateInfo struct.
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
 *  This class is a Java front end for struct VkPipelineInputAssemblyStateCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPipelineInputAssemblyStateCreateInfo {
 *     VkStructureType                            sType;
 *     const void*                                pNext;
 *     VkPipelineInputAssemblyStateCreateFlags    flags;
 *     VkPrimitiveTopology                        topology;
 *     VkBool32                                   primitiveRestartEnable;
 * } VkPipelineInputAssemblyStateCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkPipelineInputAssemblyStateCreateInfo extends VkStruct {
	/** TAG of this structure [176]  */
	 private static final String TAG = "VkPipelineInputAssemblyStateCreateInfo";

	/** ID of this structure [176]  */
	 public static final int TAG_ID = VKPIPELINEINPUTASSEMBLYSTATECREATEINFO_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType	[vkenum]	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext		 */ 
	P<VkObject> 	pNext;

	/**
	 *  VkPipelineInputAssemblyStateCreateFlags 	flags		 */ 
	int 	flags;

	/**
	 *  VkPrimitiveTopology 	topology	[vkenum]	 */ 
	VkPrimitiveTopology 	topology;

	/**
	 *  VkBool32 	primitiveRestartEnable		 */ 
	boolean 	primitiveRestartEnable;

	/**
	 * Ctor
	 */
	public VkPipelineInputAssemblyStateCreateInfo(){ 
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
	 * Set method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType	[vkenum]
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
	 public void pNext(P<VkObject> pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 public P<VkObject> pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field flags	
	 * Prototype: VkPipelineInputAssemblyStateCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	
	 * Prototype: VkPipelineInputAssemblyStateCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field topology	[vkenum]
	 * Prototype: VkPrimitiveTopology  topology
	 */ 
	 public void topology(VkPrimitiveTopology topology){
		 this.topology = topology;
		topology0(super.ptr, topology);
	 }

	/**
	 * get method for field topology	[vkenum]
	 * Prototype: VkPrimitiveTopology  topology
	 */ 
	 public VkPrimitiveTopology topology(){
		 // return  this.topology;
		 return topology0(super.ptr);
	 }

	/**
	 * Set method for field primitiveRestartEnable	
	 * Prototype: VkBool32  primitiveRestartEnable
	 */ 
	 public void primitiveRestartEnable(boolean primitiveRestartEnable){
		 this.primitiveRestartEnable = primitiveRestartEnable;
		primitiveRestartEnable0(super.ptr, primitiveRestartEnable);
	 }

	/**
	 * get method for field primitiveRestartEnable	
	 * Prototype: VkBool32  primitiveRestartEnable
	 */ 
	 public boolean primitiveRestartEnable(){
		 // return  this.primitiveRestartEnable;
		 return primitiveRestartEnable0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkPipelineInputAssemblyStateCreateInfo _obj = (VkPipelineInputAssemblyStateCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkPipelineInputAssemblyStateCreateInfo _obj = (VkPipelineInputAssemblyStateCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkPipelineInputAssemblyStateCreateInfo _obj = (VkPipelineInputAssemblyStateCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkPipelineInputAssemblyStateCreateInfo _obj = (VkPipelineInputAssemblyStateCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags	
	 * Prototype: VkPipelineInputAssemblyStateCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkPipelineInputAssemblyStateCreateInfo _obj = (VkPipelineInputAssemblyStateCreateInfo)(*ptr);
		  _obj.flags = (VkPipelineInputAssemblyStateCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags	
	 * Prototype: VkPipelineInputAssemblyStateCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkPipelineInputAssemblyStateCreateInfo _obj = (VkPipelineInputAssemblyStateCreateInfo)(ptr);
		  return (jint) (_obj.VkPipelineInputAssemblyStateCreateFlags);
	 */

	/**
	 * native Set method for field topology	[vkenum]
	 * Prototype: VkPrimitiveTopology  topology
	 */ 
	 private static native void topology0(ByteBuffer ptr, VkPrimitiveTopology _topology);/*
		  VkPipelineInputAssemblyStateCreateInfo _obj = (VkPipelineInputAssemblyStateCreateInfo)(*ptr);
		  _obj.topology = (VkPrimitiveTopology) (_topology);
	  */

	/**
	 * get method for field topology	[vkenum]
	 * Prototype: VkPrimitiveTopology  topology
	 */ 
	 private static native VkPrimitiveTopology topology0(ByteBuffer ptr);/*
		  VkPipelineInputAssemblyStateCreateInfo _obj = (VkPipelineInputAssemblyStateCreateInfo)(ptr);
		  return (VkPrimitiveTopology) (_obj.VkPrimitiveTopology);
	 */

	/**
	 * native Set method for field primitiveRestartEnable	
	 * Prototype: VkBool32  primitiveRestartEnable
	 */ 
	 private static native void primitiveRestartEnable0(ByteBuffer ptr, boolean _primitiveRestartEnable);/*
		  VkPipelineInputAssemblyStateCreateInfo _obj = (VkPipelineInputAssemblyStateCreateInfo)(*ptr);
		  _obj.primitiveRestartEnable = (VkBool32) (_primitiveRestartEnable);
	  */

	/**
	 * get method for field primitiveRestartEnable	
	 * Prototype: VkBool32  primitiveRestartEnable
	 */ 
	 private static native boolean primitiveRestartEnable0(ByteBuffer ptr);/*
		  VkPipelineInputAssemblyStateCreateInfo _obj = (VkPipelineInputAssemblyStateCreateInfo)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */



} // end of class VkPipelineInputAssemblyStateCreateInfo
