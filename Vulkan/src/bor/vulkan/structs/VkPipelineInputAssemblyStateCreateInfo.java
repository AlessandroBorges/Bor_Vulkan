/**
 * Class wrapping Vulkan's VkPipelineInputAssemblyStateCreateInfo struct.
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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkPipelineInputAssemblyStateCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [52]  */
	 private static final String TAG = "VkPipelineInputAssemblyStateCreateInfo";

	/** ID of this structure [52]  */
	 public static final int TAG_ID = VKPIPELINEINPUTASSEMBLYSTATECREATEINFO_ID;

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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineInputAssemblyStateCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPipelineInputAssemblyStateCreateInfo(long address){ 
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
	 public static VkArray<VkPipelineInputAssemblyStateCreateInfo> createVkArray(int size){ 
		 VkPipelineInputAssemblyStateCreateInfo[] array = new VkPipelineInputAssemblyStateCreateInfo[size]; 
		 VkArrayStruct<VkPipelineInputAssemblyStateCreateInfo> vkArray = new VkArrayStruct<VkPipelineInputAssemblyStateCreateInfo> (array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 * 
	 * @param sType - a instance of VkStructureType.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineInputAssemblyStateCreateInfo sType(VkStructureType sType){
		 this.sType = sType;
		 int enumVal = sType.getValue();
		 setSType0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = getSType0(super.ptr);
		 this.sType = VkStructureType.fromValue(nativeVal); 
		 return this.sType;
	 }

	/**
	 * Set method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 * 
	 * @param pNext - a instance of VkObject.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineInputAssemblyStateCreateInfo pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 setPNext0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 long pointer = getPNext0(super.ptr);
		 if(pointer == 0){
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
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineInputAssemblyStateCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkPipelineInputAssemblyStateCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field topology	[vkenum]<br>
	 * Prototype: VkPrimitiveTopology  topology
	 * 
	 * @param topology - a instance of VkPrimitiveTopology.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineInputAssemblyStateCreateInfo topology(VkPrimitiveTopology topology){
		 this.topology = topology;
		 int enumVal = topology.getValue();
		 setTopology0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field topology	[vkenum]<br>
	 * Prototype: VkPrimitiveTopology  topology
	 */ 
	 public VkPrimitiveTopology topology(){
		 int nativeVal = getTopology0(super.ptr);
		 this.topology = VkPrimitiveTopology.fromValue(nativeVal); 
		 return this.topology;
	 }

	/**
	 * Set method for field primitiveRestartEnable	[boolean]<br>
	 * Prototype: VkBool32  primitiveRestartEnable
	 * 
	 * @param primitiveRestartEnable - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineInputAssemblyStateCreateInfo primitiveRestartEnable(boolean primitiveRestartEnable){
		 this.primitiveRestartEnable = primitiveRestartEnable;
		 setPrimitiveRestartEnable0(this.ptr,  primitiveRestartEnable);
		 return this;
	 }

	/**
	 * Get method for field primitiveRestartEnable	[boolean]<br>
	 * Prototype: VkBool32  primitiveRestartEnable
	 */ 
	 public boolean primitiveRestartEnable(){
		 boolean var = getPrimitiveRestartEnable0(super.ptr);
		 this.primitiveRestartEnable = var;
		 return this.primitiveRestartEnable;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkPipelineInputAssemblyStateCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n topology: ")
				.append(topology() )
				.append(",\n primitiveRestartEnable: ")
				.append(primitiveRestartEnable() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineInputAssemblyStateCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineInputAssemblyStateCreateFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineInputAssemblyStateCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field topology	[vkenum]<br>
	 * Prototype: VkPrimitiveTopology  topology
	 */ 
	 private static native void setTopology0(Buffer ptr, int  _topology);/*
		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->topology = (VkPrimitiveTopology) (_topology);
	  */

	/**
	 * Native GET method for field topology	[vkenum]<br>
	 * Prototype: VkPrimitiveTopology  topology
	 */ 
	 private static native int getTopology0(Buffer ptr);/*
		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->topology);
	 */

	/**
	 * Native SET method for field primitiveRestartEnable	[boolean]<br>
	 * Prototype: VkBool32  primitiveRestartEnable
	 */ 
	 private static native void setPrimitiveRestartEnable0(Buffer ptr, boolean  _primitiveRestartEnable);/*
		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->primitiveRestartEnable = (VkBool32) (_primitiveRestartEnable);
	  */

	/**
	 * Native GET method for field primitiveRestartEnable	[boolean]<br>
	 * Prototype: VkBool32  primitiveRestartEnable
	 */ 
	 private static native boolean  getPrimitiveRestartEnable0(Buffer ptr);/*
		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->primitiveRestartEnable);
	 */



} // end of class VkPipelineInputAssemblyStateCreateInfo
