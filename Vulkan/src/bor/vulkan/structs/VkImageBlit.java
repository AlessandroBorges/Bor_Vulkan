/**
 * Class wrapping Vulkan's VkImageBlit struct.
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
 *  This class is a Java front end for struct VkImageBlit. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkImageBlit {
 *     VkImageSubresourceLayers    srcSubresource;
 *     VkOffset3D                  srcOffsets[2];
 *     VkImageSubresourceLayers    dstSubresource;
 *     VkOffset3D                  dstOffsets[2];
 * } VkImageBlit;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkImageBlit extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [93]  */
	 private static final String TAG = "VkImageBlit";

	/** ID of this structure [93]  */
	 public static final int TAG_ID = VKIMAGEBLIT_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkImageSubresourceLayers 	srcSubresource	[vkstruct]
	 */ 
	VkImageSubresourceLayers 	srcSubresource;
	
	/**
	 *  VkOffset3D[] 	srcOffsets	[vkstruct_array_array [2] ]
	 */ 
	VkOffset3D[] 	srcOffsets = new VkOffset3D[2];
	 private BigBuffer 	 srcOffsetsBUFFER;
	
	/**
	 *  VkImageSubresourceLayers 	dstSubresource	[vkstruct]
	 */ 
	VkImageSubresourceLayers 	dstSubresource;
	
	/**
	 *  VkOffset3D[] 	dstOffsets	[vkstruct_array_array [2] ]
	 */ 
	VkOffset3D[] 	dstOffsets = new VkOffset3D[2];
	 private BigBuffer 	 dstOffsetsBUFFER;
	/**
	 * Ctor
	 */
	public VkImageBlit(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkImageBlit(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkImageBlit(long address){ 
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
	 public static VkArray<VkImageBlit> createVkArray(int size){ 
		 VkImageBlit[] array = new VkImageBlit[size]; 
		 VkArrayStruct<VkImageBlit> vkArray = new VkArrayStruct<VkImageBlit>(array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field srcSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 * 
	 * @param srcSubresource - a instance of VkImageSubresourceLayers.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageBlit srcSubresource(VkImageSubresourceLayers srcSubresource){
		 this.srcSubresource = srcSubresource;
		 ByteBuffer buff = (srcSubresource==null) ? null : srcSubresource.getPointer();
		 setSrcSubresource0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field srcSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 public VkImageSubresourceLayers srcSubresource(){
		 long pointer = getSrcSubresource0(super.ptr);
		 if(pointer == 0){
		    this.srcSubresource = null;
		    return null;
		  } 

		 if(this.srcSubresource == null){
		    this.srcSubresource = new VkImageSubresourceLayers(pointer);
		 }else{
		    this.srcSubresource.setPointer(pointer);
		  }
		 return this.srcSubresource;
	 }

// #Included setSrcOffsets

   /**
    * pointers to srcOffsets
    */
    private long[] srcOffsetsPtr = new long[2];


    /**
     * Copy VkOffset3D
     * @param dst destination
     * @param src source
     */
    private void copy(VkOffset3D dst, VkOffset3D src) {
         dst.x(src.x);
         dst.y(src.y);
         dst.z(src.z);
    }
     
	/**
	 * Set method for field srcOffsets	[vkstruct_array]<br>
	 * Prototype: VkOffset3D[]  srcOffsets
	 * 
	 * @param srcOffsets - a instance of VkOffset3D[].
	 * @return this VkStruct instance.
	 */ 
	 public VkImageBlit srcOffsets(VkOffset3D[] srcOffsetsNew){
	     if(this.srcOffsets[0] == null){
                 getSrcOffsets0(ptr, srcOffsetsPtr);
             }
             if(srcOffsets[0] != srcOffsetsNew[0]){
                 copy(srcOffsets[0] , srcOffsetsNew[0]);
             }
             
             if(srcOffsets[1] != srcOffsetsNew[1]){
                 copy(srcOffsets[1] , srcOffsetsNew[1]);
             }
       return this;
	 }
	

//#END Set Included

// #Included getSrcOffsets0
    
	/**
     * Get method for field dstOffsets      [vkstruct_array]<br>
     * Prototype: VkOffset3D[]  dstOffsets
     */ 
     public VkOffset3D[] srcOffsets(){
            getDstOffsets0(ptr, srcOffsetsPtr);             
            if(this.srcOffsets[0] == null)
                    srcOffsets[0] = new VkOffset3D(srcOffsetsPtr[0]);           
            if(this.srcOffsets[1] == null)
                    srcOffsets[1] = new VkOffset3D(srcOffsetsPtr[1]);
            return this.srcOffsets;
    }

//#END get

	/**
	 * Set method for field dstSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 * 
	 * @param dstSubresource - a instance of VkImageSubresourceLayers.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageBlit dstSubresource(VkImageSubresourceLayers dstSubresource){
		 this.dstSubresource = dstSubresource;
		 ByteBuffer buff = (dstSubresource==null) ? null : dstSubresource.getPointer();
		 setDstSubresource0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field dstSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 public VkImageSubresourceLayers dstSubresource(){
		 long pointer = getDstSubresource0(super.ptr);
		 if(pointer == 0){
		    this.dstSubresource = null;
		    return null;
		  } 

		 if(this.dstSubresource == null){
		    this.dstSubresource = new VkImageSubresourceLayers(pointer);
		 }else{
		    this.dstSubresource.setPointer(pointer);
		  }
		 return this.dstSubresource;
	 }

// #Included setDstOffsets
    /**
	 * Set method for field dstOffsets	[vkstruct_array]<br>
	 * Prototype: VkOffset3D[]  dstOffsets
	 * 
	 * @param dstOffsets - a instance of VkOffset3D[].
	 * @return this VkStruct instance.
	 */ 
	 public VkImageBlit dstOffsets(VkOffset3D[] dstOffsetsNew){
        	 if(this.dstOffsets[0] == null){
		     getDstOffsets0(ptr, dstOffsetsPtr);
		 }
		 if(dstOffsets[0] != dstOffsetsNew[0]){
		     copy(dstOffsets[0] , dstOffsetsNew[0]);
		 }
		 
		 if(dstOffsets[1] != dstOffsetsNew[1]){
                     copy(dstOffsets[1] , dstOffsetsNew[1]);
                 }
	      return this;
	 }


//#END Set Included

// #Included getDstOffsets0
    /**
	 * pointers to native dstOffset structs 
	 */
     private long[] dstOffsetsPtr = new long[2]; 
	/**
	 * Get method for field dstOffsets	[vkstruct_array]<br>
	 * Prototype: VkOffset3D[]  dstOffsets
	 */ 
	 public VkOffset3D[] dstOffsets(){
	    getDstOffsets0(ptr, dstOffsetsPtr);		 
	    if(this.dstOffsets[0] == null)
		     dstOffsets[0] = new VkOffset3D(dstOffsetsPtr[0]);		 
		if(this.dstOffsets[1] == null)
             dstOffsets[1] = new VkOffset3D(dstOffsetsPtr[1]);
		return this.dstOffsets;
	 }    
     

//#END get


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkImageBlit [ ")
				.append("srcSubresource: ").append(srcSubresource() )
				.append(",\n srcOffsets: ")
				.append(Arrays.toString(srcOffsets()) )
				.append(",\n dstSubresource: ")
				.append(dstSubresource() )
				.append(",\n dstOffsets: ")
				.append(Arrays.toString(dstOffsets()) )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field srcSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 private static native void setSrcSubresource0(Buffer ptr, java.nio.ByteBuffer  _srcSubresource);/*
		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkImageSubresourceLayers* p_srcSubresource = (VkImageSubresourceLayers*) _srcSubresource; 
		 vkObj->srcSubresource = (*p_srcSubresource); 
	  */

	/**
	 * Native GET method for field srcSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 private static native long getSrcSubresource0(Buffer ptr);/*
		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->srcSubresource);
	 */

   /**
	 * Native SET method for field srcOffsets	[vkstruct_array]<br>
	 * Prototype: VkOffset3D[]  srcOffsets
	 */ 
	 private static native void setSrcOffsets0(Buffer ptr, java.nio.ByteBuffer  _off0, java.nio.ByteBuffer _off1);/*
		 VkImageBlit* vkObj = (VkImageBlit*)(ptr);		 
		 VkOffset3D* off0 = (VkOffset3D*) _off0;
		 VkOffset3D* off1 = (VkOffset3D*) _off1;		  
		 vkObj->srcOffsets[0] = (*off0);
		 vkObj->srcOffsets[1] = (*off1); 
	  */


	/**
	 * Native GET method for field srcOffsets	[vkstruct_array]<br>
	 * Prototype: VkOffset3D[]  srcOffsets
	 */ 
	 private static native void getSrcOffsets0(Buffer ptr, long[] offs);/*
             VkImageBlit* vkObj = (VkImageBlit*)(ptr);               
             offs[0] = reinterpret_cast<jlong>(&vkObj->srcOffsets[0]);
             offs[1] = reinterpret_cast<jlong>(&vkObj->srcOffsets[1]);
         */

	/**
	 * Native SET method for field dstSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 private static native void setDstSubresource0(Buffer ptr, java.nio.ByteBuffer  _dstSubresource);/*
		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkImageSubresourceLayers* p_dstSubresource = (VkImageSubresourceLayers*) _dstSubresource; 
		 vkObj->dstSubresource = (*p_dstSubresource); 
	  */

	/**
	 * Native GET method for field dstSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 private static native long getDstSubresource0(Buffer ptr);/*
		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->dstSubresource);
	 */

    /**
	 * Native SET method for field dstOffsets	[vkstruct_array]<br>
	 * Prototype: VkOffset3D[]  dstOffsets
	 */ 
	 private static native void setDstOffsets0(Buffer ptr, java.nio.ByteBuffer  _off0, java.nio.ByteBuffer _off1);/*
             VkImageBlit* vkObj = (VkImageBlit*)(ptr);               
             VkOffset3D* off0 = (VkOffset3D*) _off0;
             VkOffset3D* off1 = (VkOffset3D*) _off1;                  
             vkObj->dstOffsets[0] = (*off0);
             vkObj->dstOffsets[1] = (*off1); 
         */
         

	/**
	 * Native GET method for field dstOffsets	[vkstruct_array]<br>
	 * Prototype: VkOffset3D[]  dstOffsets
	 */ 
	 private static native long getDstOffsets0(Buffer ptr, long[] offs);/*
             VkImageBlit* vkObj = (VkImageBlit*)(ptr);               
             offs[0] = reinterpret_cast<jlong>(&vkObj->dstOffsets[0]);
             offs[1] = reinterpret_cast<jlong>(&vkObj->dstOffsets[1]);
         */  





} // end of class VkImageBlit
