/**
 * Class wrapping Vulkan's VkDisplayModeCreateInfoKHR struct.
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
 *  This class is a Java front end for struct VkDisplayModeCreateInfoKHR. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDisplayModeCreateInfoKHR {
 *     VkStructureType                sType;
 *     const void*                    pNext;
 *     VkDisplayModeCreateFlagsKHR    flags;
 *     VkDisplayModeParametersKHR     parameters;
 * } VkDisplayModeCreateInfoKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkDisplayModeCreateInfoKHR extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [113]  */
	 private static final String TAG = "VkDisplayModeCreateInfoKHR";

	/** ID of this structure [113]  */
	 public static final int TAG_ID = VKDISPLAYMODECREATEINFOKHR_ID;

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
	 *  VkDisplayModeCreateFlagsKHR 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  VkDisplayModeParametersKHR 	parameters	[vkstruct]
	 */ 
	VkDisplayModeParametersKHR 	parameters;
	/**
	 * Ctor
	 */
	public VkDisplayModeCreateInfoKHR(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDisplayModeCreateInfoKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDisplayModeCreateInfoKHR(long address){ 
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
	 public VkDisplayModeCreateInfoKHR sType(VkStructureType sType){
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
	 public VkDisplayModeCreateInfoKHR pNext(VkObject pNext){
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
	 * Prototype: VkDisplayModeCreateFlagsKHR  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayModeCreateInfoKHR flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkDisplayModeCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field parameters	[vkstruct]<br>
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 * 
	 * @param parameters - a instance of VkDisplayModeParametersKHR.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayModeCreateInfoKHR parameters(VkDisplayModeParametersKHR parameters){
		 this.parameters = parameters;
		 ByteBuffer buff = (parameters==null) ? null : parameters.getPointer();
		 setParameters0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field parameters	[vkstruct]<br>
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 public VkDisplayModeParametersKHR parameters(){
		 long pointer = getParameters0(super.ptr);
		 if(pointer == 0){
		    this.parameters = null;
		    return null;
		  } 

		 if(this.parameters == null){
		    this.parameters = new VkDisplayModeParametersKHR(pointer);
		 }else{
		    this.parameters.setPointer(pointer);
		  }
		 return this.parameters;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkDisplayModeCreateInfoKHR [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n parameters: ")
				.append(parameters() )
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
		  VkDisplayModeCreateInfoKHR* vkObj = (VkDisplayModeCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkDisplayModeCreateInfoKHR* vkObj = (VkDisplayModeCreateInfoKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDisplayModeCreateInfoKHR* vkObj = (VkDisplayModeCreateInfoKHR*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkDisplayModeCreateInfoKHR* vkObj = (VkDisplayModeCreateInfoKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkDisplayModeCreateFlagsKHR  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkDisplayModeCreateInfoKHR* vkObj = (VkDisplayModeCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkDisplayModeCreateFlagsKHR) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkDisplayModeCreateFlagsKHR  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkDisplayModeCreateInfoKHR* vkObj = (VkDisplayModeCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field parameters	[vkstruct]<br>
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 private static native void setParameters0(Buffer ptr, java.nio.ByteBuffer  _parameters);/*
		  VkDisplayModeCreateInfoKHR* vkObj = (VkDisplayModeCreateInfoKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkDisplayModeParametersKHR* p_parameters = (VkDisplayModeParametersKHR*) _parameters; 
		 vkObj->parameters = (*p_parameters); 
	  */

	/**
	 * Native GET method for field parameters	[vkstruct]<br>
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 private static native long getParameters0(Buffer ptr);/*
		  VkDisplayModeCreateInfoKHR* vkObj = (VkDisplayModeCreateInfoKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->parameters);
	 */



} // end of class VkDisplayModeCreateInfoKHR
