// class wrapping Vulkan's VkDisplayModeCreateInfoKHR struct.
package bor.vulkan.khr.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.VkStruct;

import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkDisplayModeCreateInfoKHR 
 * @Author Alessandro Borges 
 */
public class VkDisplayModeCreateInfoKHR extends VkStruct {
	/** ID of this structure [113]  */
	 public static final int TAG = VKDISPLAYMODECREATEINFOKHR_ID;

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
	 *  VkDisplayModeCreateFlagsKHR 	flags 
	 */ 
	int 	flags;

	/**
	 *  VkDisplayModeParametersKHR 	parameters 
	 */ 
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
	 * Set method for field parameters
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 public void parameters(VkDisplayModeParametersKHR parameters){
		 this.parameters = parameters;
		parameters0(super.ptr, parameters);
	 }

	/**
	 * get method for field parameters
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
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkDisplayModeCreateInfoKHR _obj = (VkDisplayModeCreateInfoKHR)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
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
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkDisplayModeCreateInfoKHR _obj = (VkDisplayModeCreateInfoKHR)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkDisplayModeCreateInfoKHR _obj = (VkDisplayModeCreateInfoKHR)(ptr);
		  return (VkObject) (_obj.const void*);
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
	 * native Set method for field parameters
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 private static native void parameters0(ByteBuffer ptr, VkDisplayModeParametersKHR _parameters);/*
		  VkDisplayModeCreateInfoKHR _obj = (VkDisplayModeCreateInfoKHR)(*ptr);
		  _obj.parameters = (VkDisplayModeParametersKHR) (_parameters);
	  */

	/**
	 * get method for field parameters
	 * Prototype: VkDisplayModeParametersKHR  parameters
	 */ 
	 private static native VkDisplayModeParametersKHR parameters0(ByteBuffer ptr);/*
		  VkDisplayModeCreateInfoKHR _obj = (VkDisplayModeCreateInfoKHR)(ptr);
		  return (VkDisplayModeParametersKHR) (_obj.VkDisplayModeParametersKHR);
	 */



} // end of class VkDisplayModeCreateInfoKHR
