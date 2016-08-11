/**
 * Class wrapping Vulkan's VkRect2D struct.
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
 *  This class is a Java front end for struct VkRect2D. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkRect2D {
 *     VkOffset2D    offset;
 *     VkExtent2D    extent;
 * } VkRect2D;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkRect2D extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [57]  */
	 private static final String TAG = "VkRect2D";

	/** ID of this structure [57]  */
	 public static final int TAG_ID = VKRECT2D_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkOffset2D 	offset	[vkstruct]
	 */ 
	VkOffset2D 	offset;
	
	/**
	 *  VkExtent2D 	extent	[vkstruct]
	 */ 
	VkExtent2D 	extent;
	/**
	 * Ctor
	 */
	public VkRect2D(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkRect2D(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkRect2D(long address){ 
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
	 * Set method for field offset	[vkstruct]<br>
	 * Prototype: VkOffset2D  offset
	 * 
	 * @param offset - a instance of VkOffset2D.
	 * @return this VkStruct instance.
	 */ 
	 public VkRect2D offset(VkOffset2D offset){
		 this.offset = offset;
		 ByteBuffer buff = (offset==null) ? null : offset.getPointer();
		 setOffset0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field offset	[vkstruct]<br>
	 * Prototype: VkOffset2D  offset
	 */ 
	 public VkOffset2D offset(){
		 long pointer = getOffset0(super.ptr);
		 if(pointer == 0){
		    this.offset = null;
		    return null;
		  } 

		 if(this.offset == null){
		    this.offset = new VkOffset2D(pointer);
		 }else{
		    this.offset.setPointer(pointer);
		  }
		 return this.offset;
	 }

	/**
	 * Set method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent2D  extent
	 * 
	 * @param extent - a instance of VkExtent2D.
	 * @return this VkStruct instance.
	 */ 
	 public VkRect2D extent(VkExtent2D extent){
		 this.extent = extent;
		 ByteBuffer buff = (extent==null) ? null : extent.getPointer();
		 setExtent0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent2D  extent
	 */ 
	 public VkExtent2D extent(){
		 long pointer = getExtent0(super.ptr);
		 if(pointer == 0){
		    this.extent = null;
		    return null;
		  } 

		 if(this.extent == null){
		    this.extent = new VkExtent2D(pointer);
		 }else{
		    this.extent.setPointer(pointer);
		  }
		 return this.extent;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkRect2D [ ")
				.append("offset: ").append(offset() )
				.append(",\n extent: ")
				.append(extent() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field offset	[vkstruct]<br>
	 * Prototype: VkOffset2D  offset
	 */ 
	 private static native void setOffset0(Buffer ptr, java.nio.ByteBuffer  _offset);/*
		  VkRect2D* vkObj = (VkRect2D*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->offset = (VkOffset2D) (_offset);
	  */

	/**
	 * Native GET method for field offset	[vkstruct]<br>
	 * Prototype: VkOffset2D  offset
	 */ 
	 private static native long getOffset0(Buffer ptr);/*
		  VkRect2D* vkObj = (VkRect2D*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->offset);
	 */

	/**
	 * Native SET method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent2D  extent
	 */ 
	 private static native void setExtent0(Buffer ptr, java.nio.ByteBuffer  _extent);/*
		  VkRect2D* vkObj = (VkRect2D*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->extent = (VkExtent2D) (_extent);
	  */

	/**
	 * Native GET method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent2D  extent
	 */ 
	 private static native long getExtent0(Buffer ptr);/*
		  VkRect2D* vkObj = (VkRect2D*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->extent);
	 */



} // end of class VkRect2D
