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


/**
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
	/** TAG of this structure [237]  */
	 private static final String TAG = "VkDisplayModeCreateInfoKHR";

	/** ID of this structure [237]  */
	 public static final int TAG_ID = VKDISPLAYMODECREATEINFOKHR_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType	[vkenum]	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext		 */ 
	P<VkObject> 	pNext;

	/**
	 *  VkDisplayModeCreateFlagsKHR 	flags		 */ 
	int 	flags;

	/**
	 *  VkDisplayModeParametersKHR 	parameters	[vkstruct]	 */ 
	VkDisplayModeParametersKHR 	parameters;

	/**
	 * Ctor
	 */
	public VkDisplayModeCreateInfoKHR(){ 
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
	 * Prototype: VkDisplayModeCreateFlagsKHR  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	
	 * Prototype: VkDisplayModeCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field parameters	[vkstruct]
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 public void parameters(VkDisplayModeParametersKHR parameters){
		 this.parameters = parameters;
		parameters0(super.ptr, parameters);
	 }

	/**
	 * get method for field parameters	[vkstruct]
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 public VkDisplayModeParametersKHR parameters(){
		 // return  this.parameters;
		 return parameters0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkDisplayModeCreateInfoKHR _obj = (VkDisplayModeCreateInfoKHR)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkDisplayModeCreateInfoKHR _obj = (VkDisplayModeCreateInfoKHR)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkDisplayModeCreateInfoKHR _obj = (VkDisplayModeCreateInfoKHR)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkDisplayModeCreateInfoKHR _obj = (VkDisplayModeCreateInfoKHR)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags	
	 * Prototype: VkDisplayModeCreateFlagsKHR  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkDisplayModeCreateInfoKHR _obj = (VkDisplayModeCreateInfoKHR)(*ptr);
		  _obj.flags = (VkDisplayModeCreateFlagsKHR) (_flags);
	  */

	/**
	 * get method for field flags	
	 * Prototype: VkDisplayModeCreateFlagsKHR  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkDisplayModeCreateInfoKHR _obj = (VkDisplayModeCreateInfoKHR)(ptr);
		  return (jint) (_obj.VkDisplayModeCreateFlagsKHR);
	 */

	/**
	 * native Set method for field parameters	[vkstruct]
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 private static native void parameters0(ByteBuffer ptr, VkDisplayModeParametersKHR _parameters);/*
		  VkDisplayModeCreateInfoKHR _obj = (VkDisplayModeCreateInfoKHR)(*ptr);
		  _obj.parameters = (VkDisplayModeParametersKHR) (_parameters);
	  */

	/**
	 * get method for field parameters	[vkstruct]
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 private static native VkDisplayModeParametersKHR parameters0(ByteBuffer ptr);/*
		  VkDisplayModeCreateInfoKHR _obj = (VkDisplayModeCreateInfoKHR)(ptr);
		  return (VkDisplayModeParametersKHR) (_obj.VkDisplayModeParametersKHR);
	 */



} // end of class VkDisplayModeCreateInfoKHR
