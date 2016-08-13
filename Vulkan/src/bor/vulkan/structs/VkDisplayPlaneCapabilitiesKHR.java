/**
 * Class wrapping Vulkan's VkDisplayPlaneCapabilitiesKHR struct.
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
 *  This class is a Java front end for struct VkDisplayPlaneCapabilitiesKHR. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDisplayPlaneCapabilitiesKHR {
 *     VkDisplayPlaneAlphaFlagsKHR    supportedAlpha;
 *     VkOffset2D                     minSrcPosition;
 *     VkOffset2D                     maxSrcPosition;
 *     VkExtent2D                     minSrcExtent;
 *     VkExtent2D                     maxSrcExtent;
 *     VkOffset2D                     minDstPosition;
 *     VkOffset2D                     maxDstPosition;
 *     VkExtent2D                     minDstExtent;
 *     VkExtent2D                     maxDstExtent;
 * } VkDisplayPlaneCapabilitiesKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkDisplayPlaneCapabilitiesKHR extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [114]  */
	 private static final String TAG = "VkDisplayPlaneCapabilitiesKHR";

	/** ID of this structure [114]  */
	 public static final int TAG_ID = VKDISPLAYPLANECAPABILITIESKHR_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkDisplayPlaneAlphaFlagsKHR 	supportedAlpha	[int]
	 */ 
	int 	supportedAlpha;
	
	/**
	 *  VkOffset2D 	minSrcPosition	[vkstruct]
	 */ 
	VkOffset2D 	minSrcPosition;
	
	/**
	 *  VkOffset2D 	maxSrcPosition	[vkstruct]
	 */ 
	VkOffset2D 	maxSrcPosition;
	
	/**
	 *  VkExtent2D 	minSrcExtent	[vkstruct]
	 */ 
	VkExtent2D 	minSrcExtent;
	
	/**
	 *  VkExtent2D 	maxSrcExtent	[vkstruct]
	 */ 
	VkExtent2D 	maxSrcExtent;
	
	/**
	 *  VkOffset2D 	minDstPosition	[vkstruct]
	 */ 
	VkOffset2D 	minDstPosition;
	
	/**
	 *  VkOffset2D 	maxDstPosition	[vkstruct]
	 */ 
	VkOffset2D 	maxDstPosition;
	
	/**
	 *  VkExtent2D 	minDstExtent	[vkstruct]
	 */ 
	VkExtent2D 	minDstExtent;
	
	/**
	 *  VkExtent2D 	maxDstExtent	[vkstruct]
	 */ 
	VkExtent2D 	maxDstExtent;
	/**
	 * Ctor
	 */
	public VkDisplayPlaneCapabilitiesKHR(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDisplayPlaneCapabilitiesKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDisplayPlaneCapabilitiesKHR(long address){ 
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
	 * Set method for field supportedAlpha	[int]<br>
	 * Prototype: VkDisplayPlaneAlphaFlagsKHR  supportedAlpha
	 * 
	 * @param supportedAlpha - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayPlaneCapabilitiesKHR supportedAlpha(int supportedAlpha){
		 this.supportedAlpha = supportedAlpha;
		 setSupportedAlpha0(this.ptr,  supportedAlpha);
		 return this;
	 }

	/**
	 * Get method for field supportedAlpha	[int]<br>
	 * Prototype: VkDisplayPlaneAlphaFlagsKHR  supportedAlpha
	 */ 
	 public int supportedAlpha(){
		 int var = getSupportedAlpha0(super.ptr);
		 this.supportedAlpha = var;
		 return this.supportedAlpha;
	 }

	/**
	 * Set method for field minSrcPosition	[vkstruct]<br>
	 * Prototype: VkOffset2D  minSrcPosition
	 * 
	 * @param minSrcPosition - a instance of VkOffset2D.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayPlaneCapabilitiesKHR minSrcPosition(VkOffset2D minSrcPosition){
		 this.minSrcPosition = minSrcPosition;
		 ByteBuffer buff = (minSrcPosition==null) ? null : minSrcPosition.getPointer();
		 setMinSrcPosition0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field minSrcPosition	[vkstruct]<br>
	 * Prototype: VkOffset2D  minSrcPosition
	 */ 
	 public VkOffset2D minSrcPosition(){
		 long pointer = getMinSrcPosition0(super.ptr);
		 if(pointer == 0){
		    this.minSrcPosition = null;
		    return null;
		  } 

		 if(this.minSrcPosition == null){
		    this.minSrcPosition = new VkOffset2D(pointer);
		 }else{
		    this.minSrcPosition.setPointer(pointer);
		  }
		 return this.minSrcPosition;
	 }

	/**
	 * Set method for field maxSrcPosition	[vkstruct]<br>
	 * Prototype: VkOffset2D  maxSrcPosition
	 * 
	 * @param maxSrcPosition - a instance of VkOffset2D.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayPlaneCapabilitiesKHR maxSrcPosition(VkOffset2D maxSrcPosition){
		 this.maxSrcPosition = maxSrcPosition;
		 ByteBuffer buff = (maxSrcPosition==null) ? null : maxSrcPosition.getPointer();
		 setMaxSrcPosition0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field maxSrcPosition	[vkstruct]<br>
	 * Prototype: VkOffset2D  maxSrcPosition
	 */ 
	 public VkOffset2D maxSrcPosition(){
		 long pointer = getMaxSrcPosition0(super.ptr);
		 if(pointer == 0){
		    this.maxSrcPosition = null;
		    return null;
		  } 

		 if(this.maxSrcPosition == null){
		    this.maxSrcPosition = new VkOffset2D(pointer);
		 }else{
		    this.maxSrcPosition.setPointer(pointer);
		  }
		 return this.maxSrcPosition;
	 }

	/**
	 * Set method for field minSrcExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  minSrcExtent
	 * 
	 * @param minSrcExtent - a instance of VkExtent2D.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayPlaneCapabilitiesKHR minSrcExtent(VkExtent2D minSrcExtent){
		 this.minSrcExtent = minSrcExtent;
		 ByteBuffer buff = (minSrcExtent==null) ? null : minSrcExtent.getPointer();
		 setMinSrcExtent0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field minSrcExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  minSrcExtent
	 */ 
	 public VkExtent2D minSrcExtent(){
		 long pointer = getMinSrcExtent0(super.ptr);
		 if(pointer == 0){
		    this.minSrcExtent = null;
		    return null;
		  } 

		 if(this.minSrcExtent == null){
		    this.minSrcExtent = new VkExtent2D(pointer);
		 }else{
		    this.minSrcExtent.setPointer(pointer);
		  }
		 return this.minSrcExtent;
	 }

	/**
	 * Set method for field maxSrcExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  maxSrcExtent
	 * 
	 * @param maxSrcExtent - a instance of VkExtent2D.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayPlaneCapabilitiesKHR maxSrcExtent(VkExtent2D maxSrcExtent){
		 this.maxSrcExtent = maxSrcExtent;
		 ByteBuffer buff = (maxSrcExtent==null) ? null : maxSrcExtent.getPointer();
		 setMaxSrcExtent0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field maxSrcExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  maxSrcExtent
	 */ 
	 public VkExtent2D maxSrcExtent(){
		 long pointer = getMaxSrcExtent0(super.ptr);
		 if(pointer == 0){
		    this.maxSrcExtent = null;
		    return null;
		  } 

		 if(this.maxSrcExtent == null){
		    this.maxSrcExtent = new VkExtent2D(pointer);
		 }else{
		    this.maxSrcExtent.setPointer(pointer);
		  }
		 return this.maxSrcExtent;
	 }

	/**
	 * Set method for field minDstPosition	[vkstruct]<br>
	 * Prototype: VkOffset2D  minDstPosition
	 * 
	 * @param minDstPosition - a instance of VkOffset2D.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayPlaneCapabilitiesKHR minDstPosition(VkOffset2D minDstPosition){
		 this.minDstPosition = minDstPosition;
		 ByteBuffer buff = (minDstPosition==null) ? null : minDstPosition.getPointer();
		 setMinDstPosition0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field minDstPosition	[vkstruct]<br>
	 * Prototype: VkOffset2D  minDstPosition
	 */ 
	 public VkOffset2D minDstPosition(){
		 long pointer = getMinDstPosition0(super.ptr);
		 if(pointer == 0){
		    this.minDstPosition = null;
		    return null;
		  } 

		 if(this.minDstPosition == null){
		    this.minDstPosition = new VkOffset2D(pointer);
		 }else{
		    this.minDstPosition.setPointer(pointer);
		  }
		 return this.minDstPosition;
	 }

	/**
	 * Set method for field maxDstPosition	[vkstruct]<br>
	 * Prototype: VkOffset2D  maxDstPosition
	 * 
	 * @param maxDstPosition - a instance of VkOffset2D.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayPlaneCapabilitiesKHR maxDstPosition(VkOffset2D maxDstPosition){
		 this.maxDstPosition = maxDstPosition;
		 ByteBuffer buff = (maxDstPosition==null) ? null : maxDstPosition.getPointer();
		 setMaxDstPosition0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field maxDstPosition	[vkstruct]<br>
	 * Prototype: VkOffset2D  maxDstPosition
	 */ 
	 public VkOffset2D maxDstPosition(){
		 long pointer = getMaxDstPosition0(super.ptr);
		 if(pointer == 0){
		    this.maxDstPosition = null;
		    return null;
		  } 

		 if(this.maxDstPosition == null){
		    this.maxDstPosition = new VkOffset2D(pointer);
		 }else{
		    this.maxDstPosition.setPointer(pointer);
		  }
		 return this.maxDstPosition;
	 }

	/**
	 * Set method for field minDstExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  minDstExtent
	 * 
	 * @param minDstExtent - a instance of VkExtent2D.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayPlaneCapabilitiesKHR minDstExtent(VkExtent2D minDstExtent){
		 this.minDstExtent = minDstExtent;
		 ByteBuffer buff = (minDstExtent==null) ? null : minDstExtent.getPointer();
		 setMinDstExtent0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field minDstExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  minDstExtent
	 */ 
	 public VkExtent2D minDstExtent(){
		 long pointer = getMinDstExtent0(super.ptr);
		 if(pointer == 0){
		    this.minDstExtent = null;
		    return null;
		  } 

		 if(this.minDstExtent == null){
		    this.minDstExtent = new VkExtent2D(pointer);
		 }else{
		    this.minDstExtent.setPointer(pointer);
		  }
		 return this.minDstExtent;
	 }

	/**
	 * Set method for field maxDstExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  maxDstExtent
	 * 
	 * @param maxDstExtent - a instance of VkExtent2D.
	 * @return this VkStruct instance.
	 */ 
	 public VkDisplayPlaneCapabilitiesKHR maxDstExtent(VkExtent2D maxDstExtent){
		 this.maxDstExtent = maxDstExtent;
		 ByteBuffer buff = (maxDstExtent==null) ? null : maxDstExtent.getPointer();
		 setMaxDstExtent0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field maxDstExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  maxDstExtent
	 */ 
	 public VkExtent2D maxDstExtent(){
		 long pointer = getMaxDstExtent0(super.ptr);
		 if(pointer == 0){
		    this.maxDstExtent = null;
		    return null;
		  } 

		 if(this.maxDstExtent == null){
		    this.maxDstExtent = new VkExtent2D(pointer);
		 }else{
		    this.maxDstExtent.setPointer(pointer);
		  }
		 return this.maxDstExtent;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkDisplayPlaneCapabilitiesKHR [ ")
				.append("supportedAlpha: ").append(supportedAlpha() )
				.append(",\n minSrcPosition: ")
				.append(minSrcPosition() )
				.append(",\n maxSrcPosition: ")
				.append(maxSrcPosition() )
				.append(",\n minSrcExtent: ")
				.append(minSrcExtent() )
				.append(",\n maxSrcExtent: ")
				.append(maxSrcExtent() )
				.append(",\n minDstPosition: ")
				.append(minDstPosition() )
				.append(",\n maxDstPosition: ")
				.append(maxDstPosition() )
				.append(",\n minDstExtent: ")
				.append(minDstExtent() )
				.append(",\n maxDstExtent: ")
				.append(maxDstExtent() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field supportedAlpha	[int]<br>
	 * Prototype: VkDisplayPlaneAlphaFlagsKHR  supportedAlpha
	 */ 
	 private static native void setSupportedAlpha0(Buffer ptr, int _supportedAlpha);/*
		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->supportedAlpha = (VkDisplayPlaneAlphaFlagsKHR) (_supportedAlpha);
	  */

	/**
	 * Native GET method for field supportedAlpha	[int]<br>
	 * Prototype: VkDisplayPlaneAlphaFlagsKHR  supportedAlpha
	 */ 
	 private static native int getSupportedAlpha0(Buffer ptr);/*
		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		  return (jint) (vkObj->supportedAlpha);
	 */

	/**
	 * Native SET method for field minSrcPosition	[vkstruct]<br>
	 * Prototype: VkOffset2D  minSrcPosition
	 */ 
	 private static native void setMinSrcPosition0(Buffer ptr, java.nio.ByteBuffer  _minSrcPosition);/*
		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkOffset2D* p_minSrcPosition = (VkOffset2D*) _minSrcPosition; 
		 vkObj->minSrcPosition = (*p_minSrcPosition); 
	  */

	/**
	 * Native GET method for field minSrcPosition	[vkstruct]<br>
	 * Prototype: VkOffset2D  minSrcPosition
	 */ 
	 private static native long getMinSrcPosition0(Buffer ptr);/*
		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->minSrcPosition);
	 */

	/**
	 * Native SET method for field maxSrcPosition	[vkstruct]<br>
	 * Prototype: VkOffset2D  maxSrcPosition
	 */ 
	 private static native void setMaxSrcPosition0(Buffer ptr, java.nio.ByteBuffer  _maxSrcPosition);/*
		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkOffset2D* p_maxSrcPosition = (VkOffset2D*) _maxSrcPosition; 
		 vkObj->maxSrcPosition = (*p_maxSrcPosition); 
	  */

	/**
	 * Native GET method for field maxSrcPosition	[vkstruct]<br>
	 * Prototype: VkOffset2D  maxSrcPosition
	 */ 
	 private static native long getMaxSrcPosition0(Buffer ptr);/*
		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->maxSrcPosition);
	 */

	/**
	 * Native SET method for field minSrcExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  minSrcExtent
	 */ 
	 private static native void setMinSrcExtent0(Buffer ptr, java.nio.ByteBuffer  _minSrcExtent);/*
		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent2D* p_minSrcExtent = (VkExtent2D*) _minSrcExtent; 
		 vkObj->minSrcExtent = (*p_minSrcExtent); 
	  */

	/**
	 * Native GET method for field minSrcExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  minSrcExtent
	 */ 
	 private static native long getMinSrcExtent0(Buffer ptr);/*
		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->minSrcExtent);
	 */

	/**
	 * Native SET method for field maxSrcExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  maxSrcExtent
	 */ 
	 private static native void setMaxSrcExtent0(Buffer ptr, java.nio.ByteBuffer  _maxSrcExtent);/*
		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent2D* p_maxSrcExtent = (VkExtent2D*) _maxSrcExtent; 
		 vkObj->maxSrcExtent = (*p_maxSrcExtent); 
	  */

	/**
	 * Native GET method for field maxSrcExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  maxSrcExtent
	 */ 
	 private static native long getMaxSrcExtent0(Buffer ptr);/*
		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->maxSrcExtent);
	 */

	/**
	 * Native SET method for field minDstPosition	[vkstruct]<br>
	 * Prototype: VkOffset2D  minDstPosition
	 */ 
	 private static native void setMinDstPosition0(Buffer ptr, java.nio.ByteBuffer  _minDstPosition);/*
		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkOffset2D* p_minDstPosition = (VkOffset2D*) _minDstPosition; 
		 vkObj->minDstPosition = (*p_minDstPosition); 
	  */

	/**
	 * Native GET method for field minDstPosition	[vkstruct]<br>
	 * Prototype: VkOffset2D  minDstPosition
	 */ 
	 private static native long getMinDstPosition0(Buffer ptr);/*
		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->minDstPosition);
	 */

	/**
	 * Native SET method for field maxDstPosition	[vkstruct]<br>
	 * Prototype: VkOffset2D  maxDstPosition
	 */ 
	 private static native void setMaxDstPosition0(Buffer ptr, java.nio.ByteBuffer  _maxDstPosition);/*
		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkOffset2D* p_maxDstPosition = (VkOffset2D*) _maxDstPosition; 
		 vkObj->maxDstPosition = (*p_maxDstPosition); 
	  */

	/**
	 * Native GET method for field maxDstPosition	[vkstruct]<br>
	 * Prototype: VkOffset2D  maxDstPosition
	 */ 
	 private static native long getMaxDstPosition0(Buffer ptr);/*
		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->maxDstPosition);
	 */

	/**
	 * Native SET method for field minDstExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  minDstExtent
	 */ 
	 private static native void setMinDstExtent0(Buffer ptr, java.nio.ByteBuffer  _minDstExtent);/*
		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent2D* p_minDstExtent = (VkExtent2D*) _minDstExtent; 
		 vkObj->minDstExtent = (*p_minDstExtent); 
	  */

	/**
	 * Native GET method for field minDstExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  minDstExtent
	 */ 
	 private static native long getMinDstExtent0(Buffer ptr);/*
		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->minDstExtent);
	 */

	/**
	 * Native SET method for field maxDstExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  maxDstExtent
	 */ 
	 private static native void setMaxDstExtent0(Buffer ptr, java.nio.ByteBuffer  _maxDstExtent);/*
		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent2D* p_maxDstExtent = (VkExtent2D*) _maxDstExtent; 
		 vkObj->maxDstExtent = (*p_maxDstExtent); 
	  */

	/**
	 * Native GET method for field maxDstExtent	[vkstruct]<br>
	 * Prototype: VkExtent2D  maxDstExtent
	 */ 
	 private static native long getMaxDstExtent0(Buffer ptr);/*
		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->maxDstExtent);
	 */



} // end of class VkDisplayPlaneCapabilitiesKHR
