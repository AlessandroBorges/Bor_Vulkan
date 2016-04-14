/**
 * Class wrapping Vulkan's VkDisplayModeCreateInfoKHR struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.01 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.khr.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.*;
import bor.vulkan.khr.*;
import java.nio.ByteBuffer;

import java.nio.Buffer;


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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkDisplayModeCreateInfoKHR extends VkStruct {
	/** TAG of this structure [113]  */
	 private static final String TAG = "VkDisplayModeCreateInfoKHR";

	/** ID of this structure [113]  */
	 public static final int TAG_ID = VKDISPLAYMODECREATEINFOKHR_ID;

	/** P wrapper for THIS object */
	 private  P<VkDisplayModeCreateInfoKHR> p;

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
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDisplayModeCreateInfoKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkDisplayModeCreateInfoKHR(long address , int memSize){ 
		 super(address, memSize); 
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
	 * Create a pointer P to contain a instance of this,
	 * with clean native pointer.<br>
	 * You can use {@link VkStruct#setPointer(ByteBuffer)} to set a new 
	 * native pointer.
	 * @return An instance of P for this VkStruct with null pointer
	 */
	 public static P<VkDisplayModeCreateInfoKHR> createNullPointer(){
	        P<VkDisplayModeCreateInfoKHR> p = new  P<VkDisplayModeCreateInfoKHR>(new VkDisplayModeCreateInfoKHR());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkDisplayModeCreateInfoKHR> getP() {
	       if(p == null ){
	           p = new P<VkDisplayModeCreateInfoKHR> (this);
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
		 setSType0(this.ptr, enumVal );
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
	 */ 
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 setPNext0(this.ptr, buff);
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
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
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
	 */ 
	 public void parameters(VkDisplayModeParametersKHR parameters){
		 this.parameters = parameters;
		 ByteBuffer buff = (parameters==null) ? null : parameters.getPointer();
		 setParameters0(this.ptr, buff);
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


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkDisplayModeCreateInfoKHR* vkObj = (VkDisplayModeCreateInfoKHR*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkDisplayModeCreateInfoKHR vkObj = (VkDisplayModeCreateInfoKHR*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDisplayModeCreateInfoKHR* vkObj = (VkDisplayModeCreateInfoKHR*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkDisplayModeCreateInfoKHR vkObj = (VkDisplayModeCreateInfoKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkDisplayModeCreateFlagsKHR  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkDisplayModeCreateInfoKHR* vkObj = (VkDisplayModeCreateInfoKHR*)(ptr);
		  vkObj->flags = (VkDisplayModeCreateFlagsKHR) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkDisplayModeCreateFlagsKHR  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkDisplayModeCreateInfoKHR vkObj = (VkDisplayModeCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field parameters	[vkstruct]<br>
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 private static native void setParameters0(Buffer ptr, java.nio.ByteBuffer  _parameters);/*
		  VkDisplayModeCreateInfoKHR* vkObj = (VkDisplayModeCreateInfoKHR*)(ptr);
		  vkObj->parameters = (VkDisplayModeParametersKHR) (_parameters);
	  */

	/**
	 * native GET method for field parameters	[vkstruct]<br>
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 private static native long getParameters0(Buffer ptr);/*
		  VkDisplayModeCreateInfoKHR vkObj = (VkDisplayModeCreateInfoKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->parameters);	 */



} // end of class VkDisplayModeCreateInfoKHR
