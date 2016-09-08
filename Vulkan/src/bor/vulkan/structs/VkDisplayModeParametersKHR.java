/**
 * Class wrapping Vulkan's VkDisplayModeParametersKHR struct.
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
 * @version Ver. 0.8.65 (beta) 
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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDisplayModeParametersKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	/** 
	 * Static method to create a VkArray for this VkStruct subclass.
	 * @param size - number of elements
	 */
	 public static VkArray<VkDisplayModeParametersKHR> createVkArray(int size){ 
		 VkDisplayModeParametersKHR[] array = new VkDisplayModeParametersKHR[size]; 
		 VkArrayStruct<VkDisplayModeParametersKHR> vkArray = new VkArrayStruct<VkDisplayModeParametersKHR>(array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field visibleRegion	[vkstruct]<br>
	 * Prototype: VkExtent2D  visibleRegion
	 * 
	 * @param visibleRegion - a instance of VkExtent2D.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayModeParametersKHR visibleRegion(VkExtent2D visibleRegion){
		 this.visibleRegion = visibleRegion;
		 ByteBuffer buff = (visibleRegion==null) ? null : visibleRegion.getPointer();
		 setVisibleRegion0(this.ptr, buff);
		 return this;
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
	 * 
	 * @param refreshRate - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayModeParametersKHR refreshRate(int refreshRate){
		 this.refreshRate = refreshRate;
		 setRefreshRate0(this.ptr,  refreshRate);
		 return this;
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


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkDisplayModeParametersKHR [ ")
				.append("visibleRegion: ").append(visibleRegion() )
				.append(",\n refreshRate: ")
				.append(refreshRate() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field visibleRegion	[vkstruct]<br>
	 * Prototype: VkExtent2D  visibleRegion
	 */ 
	 private static native void setVisibleRegion0(Buffer ptr, java.nio.ByteBuffer  _visibleRegion);/*
		  VkDisplayModeParametersKHR* vkObj = (VkDisplayModeParametersKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent2D* p_visibleRegion = (VkExtent2D*) _visibleRegion; 
		 vkObj->visibleRegion = (*p_visibleRegion); 
	  */

	/**
	 * Native GET method for field visibleRegion	[vkstruct]<br>
	 * Prototype: VkExtent2D  visibleRegion
	 */ 
	 private static native long getVisibleRegion0(Buffer ptr);/*
		  VkDisplayModeParametersKHR* vkObj = (VkDisplayModeParametersKHR*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->visibleRegion);
	 */

	/**
	 * Native SET method for field refreshRate	[int]<br>
	 * Prototype: uint32_t  refreshRate
	 */ 
	 private static native void setRefreshRate0(Buffer ptr, int _refreshRate);/*
		  VkDisplayModeParametersKHR* vkObj = (VkDisplayModeParametersKHR*)(ptr);
		 // code for simple past value 
		  vkObj->refreshRate = (uint32_t) (_refreshRate);
	  */

	/**
	 * Native GET method for field refreshRate	[int]<br>
	 * Prototype: uint32_t  refreshRate
	 */ 
	 private static native int getRefreshRate0(Buffer ptr);/*
		  VkDisplayModeParametersKHR* vkObj = (VkDisplayModeParametersKHR*)(ptr);
		  return (jint) (vkObj->refreshRate);
	 */



} // end of class VkDisplayModeParametersKHR
