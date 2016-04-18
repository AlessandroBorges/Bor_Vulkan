/**
 * Class wrapping Vulkan's VkDisplayModeParametersKHR struct.
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
 *  This class is a Java front end for struct VkDisplayModeParametersKHR. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDisplayModeParametersKHR {
 *     VkExtent2D    visibleRegion;
 *     uint32_t      refreshRate;
 * } VkDisplayModeParametersKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkDisplayModeParametersKHR extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [111]  */
	 private static final String TAG = "VkDisplayModeParametersKHR";

	/** ID of this structure [111]  */
	 public static final int TAG_ID = VKDISPLAYMODEPARAMETERSKHR_ID;

	/** P wrapper for THIS object */
	 private  P<VkDisplayModeParametersKHR> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkExtent2D 	visibleRegion	[vkstruct]
	 */ 
	 VkExtent2D 	visibleRegion;

	/**
	 *  uint32_t 	refreshRate	[int]
	 */ 
	 int 	refreshRate;

	/**
	 * Ctor
	 */
	public VkDisplayModeParametersKHR(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDisplayModeParametersKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkDisplayModeParametersKHR(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDisplayModeParametersKHR(long address){ 
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
	 public static P<VkDisplayModeParametersKHR> createNullPointer(){
	        P<VkDisplayModeParametersKHR> p = new  P<VkDisplayModeParametersKHR>(new VkDisplayModeParametersKHR());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkDisplayModeParametersKHR> getP() {
	       if(p == null ){
	           p = new P<VkDisplayModeParametersKHR> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field visibleRegion	[vkstruct]<br>
	 * Prototype: VkExtent2D  visibleRegion
	 */ 
	 public void visibleRegion(VkExtent2D visibleRegion){
		 this.visibleRegion = visibleRegion;
		 ByteBuffer buff = (visibleRegion==null) ? null : visibleRegion.getPointer();
		 setVisibleRegion0(this.ptr, buff);
	 }

	/**
	 * Get method for field visibleRegion	[vkstruct]<br>
	 * Prototype: VkExtent2D  visibleRegion
	 */ 
	 public VkExtent2D visibleRegion(){
		 long pointer = getVisibleRegion0(super.ptr);
		 if(pointer == 0){
		    this.visibleRegion = null;
		    return null;
		  } 

		 if(this.visibleRegion == null){
		    this.visibleRegion = new VkExtent2D(pointer);
		 }else{
		    this.visibleRegion.setPointer(pointer);
		  }
		 return this.visibleRegion;
	 }

	/**
	 * Set method for field refreshRate	[int]<br>
	 * Prototype: uint32_t  refreshRate
	 */ 
	 public void refreshRate(int refreshRate){
		 this.refreshRate = refreshRate;
		 setRefreshRate0(this.ptr,  refreshRate);
	 }

	/**
	 * Get method for field refreshRate	[int]<br>
	 * Prototype: uint32_t  refreshRate
	 */ 
	 public int refreshRate(){
		 int var = getRefreshRate0(super.ptr);
		 this.refreshRate = var;
		 return this.refreshRate;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field visibleRegion	[vkstruct]<br>
	 * Prototype: VkExtent2D  visibleRegion
	 */ 
	 private static native void setVisibleRegion0(Buffer ptr, java.nio.ByteBuffer  _visibleRegion);/*
		  VkDisplayModeParametersKHR* vkObj = (VkDisplayModeParametersKHR*)(ptr);
		  vkObj->visibleRegion = (VkExtent2D) (_visibleRegion);
	  */

	/**
	 * native GET method for field visibleRegion	[vkstruct]<br>
	 * Prototype: VkExtent2D  visibleRegion
	 */ 
	 private static native long getVisibleRegion0(Buffer ptr);/*
		  VkDisplayModeParametersKHR* vkObj = (VkDisplayModeParametersKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->visibleRegion);	 */

	/**
	 * native SET method for field refreshRate	[int]<br>
	 * Prototype: uint32_t  refreshRate
	 */ 
	 private static native void setRefreshRate0(Buffer ptr, int _refreshRate);/*
		  VkDisplayModeParametersKHR* vkObj = (VkDisplayModeParametersKHR*)(ptr);
		  vkObj->refreshRate = (uint32_t) (_refreshRate);
	  */

	/**
	 * native GET method for field refreshRate	[int]<br>
	 * Prototype: uint32_t  refreshRate
	 */ 
	 private static native int getRefreshRate0(Buffer ptr);/*
		  VkDisplayModeParametersKHR* vkObj = (VkDisplayModeParametersKHR*)(ptr);
		  return (jint) (vkObj->refreshRate);
	 */



} // end of class VkDisplayModeParametersKHR
