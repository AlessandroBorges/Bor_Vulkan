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

import java.nio.Buffer;


/**
 *  Project Bor-Vulkan 
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
	/** TAG of this structure [52]  */
	 private static final String TAG = "VkPipelineInputAssemblyStateCreateInfo";

	/** ID of this structure [52]  */
	 public static final int TAG_ID = VKPIPELINEINPUTASSEMBLYSTATECREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkPipelineInputAssemblyStateCreateInfo> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkStructureType 	sType	[vkenum]
	 */ 
	 VkStructureType 	sType;

	/**
	 *  const void* 	pNext	[vkobject]
	 */ 
	 VkObject 	pNext;

	/**
	 *  VkPipelineInputAssemblyStateCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  VkPrimitiveTopology 	topology	[vkenum]
	 */ 
	 VkPrimitiveTopology 	topology;

	/**
	 *  VkBool32 	primitiveRestartEnable	[boolean]
	 */ 
	 boolean 	primitiveRestartEnable;

	/**
	 * Ctor
	 */
	public VkPipelineInputAssemblyStateCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineInputAssemblyStateCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkPipelineInputAssemblyStateCreateInfo(long address, int memSize){ 
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
	 public static P<VkPipelineInputAssemblyStateCreateInfo> createNullPointer(){
	        P<VkPipelineInputAssemblyStateCreateInfo> p = new  P<VkPipelineInputAssemblyStateCreateInfo>(new VkPipelineInputAssemblyStateCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkPipelineInputAssemblyStateCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkPipelineInputAssemblyStateCreateInfo> (this);
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
		 int enumVal = sType.getValue();
		 sType0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = sType0(super.ptr);
		 this.sType = VkStructureType.fromValue(nativeVal); 
		 return this.sType;
	 }

	/**
	 * Set method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 pNext0(this.ptr, buff);
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 ByteBuffer pointer = pNext0(super.ptr);
		 if(pointer == null){
		    this.pNext = null;
		    return null;
		  } else 
 		 if(this.pNext == null){
		    this.pNext = (VkObject)(new VkHandle(pointer));
		 }else{
		    this.pNext.setPointer(pointer);
		  }
		 return this.pNext;
	 }

	/**
	 * Set method for field flags	[int]<br>
	 * Prototype: VkPipelineInputAssemblyStateCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 flags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkPipelineInputAssemblyStateCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = flags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field topology	[vkenum]<br>
	 * Prototype: VkPrimitiveTopology  topology
	 */ 
	 public void topology(VkPrimitiveTopology topology){
		 this.topology = topology;
		 int enumVal = topology.getValue();
		 topology0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field topology	[vkenum]<br>
	 * Prototype: VkPrimitiveTopology  topology
	 */ 
	 public VkPrimitiveTopology topology(){
		 int nativeVal = topology0(super.ptr);
		 this.topology = VkPrimitiveTopology.fromValue(nativeVal); 
		 return this.topology;
	 }

	/**
	 * Set method for field primitiveRestartEnable	[boolean]<br>
	 * Prototype: VkBool32  primitiveRestartEnable
	 */ 
	 public void primitiveRestartEnable(boolean primitiveRestartEnable){
		 this.primitiveRestartEnable = primitiveRestartEnable;
		 primitiveRestartEnable0(this.ptr,  primitiveRestartEnable);
	 }

	/**
	 * Get method for field primitiveRestartEnable	[boolean]<br>
	 * Prototype: VkBool32  primitiveRestartEnable
	 */ 
	 public boolean primitiveRestartEnable(){
		 boolean var = primitiveRestartEnable0(super.ptr);
		 this.primitiveRestartEnable = var;
		 return this.primitiveRestartEnable;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkPipelineInputAssemblyStateCreateInfo vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkPipelineInputAssemblyStateCreateInfo vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineInputAssemblyStateCreateFlags  flags
	 */ 
	 private static native void flags0(Buffer ptr, int _flags);/*
		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		  vkObj->flags = (VkPipelineInputAssemblyStateCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineInputAssemblyStateCreateFlags  flags
	 */ 
	 private static native int flags0(Buffer ptr);/*
		  VkPipelineInputAssemblyStateCreateInfo vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field topology	[vkenum]<br>
	 * Prototype: VkPrimitiveTopology  topology
	 */ 
	 private static native void topology0(Buffer ptr, int  _topology);/*
		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		  vkObj->topology = (VkPrimitiveTopology) (_topology);
	  */

	/**
	 * native GET method for field topology	[vkenum]<br>
	 * Prototype: VkPrimitiveTopology  topology
	 */ 
	 private static native int  topology0(Buffer ptr);/*
		  VkPipelineInputAssemblyStateCreateInfo vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		  return (VkPrimitiveTopology) (vkObj->topology);
	 */

	/**
	 * native SET method for field primitiveRestartEnable	[boolean]<br>
	 * Prototype: VkBool32  primitiveRestartEnable
	 */ 
	 private static native void primitiveRestartEnable0(Buffer ptr, boolean _primitiveRestartEnable);/*
		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		  vkObj->primitiveRestartEnable = (VkBool32) (_primitiveRestartEnable);
	  */

	/**
	 * native GET method for field primitiveRestartEnable	[boolean]<br>
	 * Prototype: VkBool32  primitiveRestartEnable
	 */ 
	 private static native boolean primitiveRestartEnable0(Buffer ptr);/*
		  VkPipelineInputAssemblyStateCreateInfo vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->primitiveRestartEnable);
	 */



} // end of class VkPipelineInputAssemblyStateCreateInfo
