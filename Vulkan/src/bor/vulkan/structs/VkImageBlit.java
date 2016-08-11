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

	/**
	 * Set method for field srcOffsets	[vkstruct_array]<br>
	 * Prototype: VkOffset3D[]  srcOffsets
	 * 
	 * @param srcOffsets - a instance of VkOffset3D[].
	 * @return this VkStruct instance.
	 */ 
	 public VkImageBlit srcOffsets(VkOffset3D[] srcOffsets){
		 this.srcOffsetsBUFFER = new BigBuffer(srcOffsets, VkOffset3D.getID());
		 setSrcOffsets0(this.ptr, srcOffsetsBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field srcOffsets	[vkstruct_array]<br>
	 * Prototype: VkOffset3D[]  srcOffsets
	 */ 
	 public VkOffset3D[] srcOffsets(){
		 long ptr = getSrcOffsets0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(srcOffsetsBUFFER != null && ptr == srcOffsetsBUFFER.getBufferAddress()){ //same buffer 
		    srcOffsetsBUFFER.update();
		    return srcOffsets;
		  }else{
		     (new UnsupportedOperationException("There is no VKStruct[] for backup.")).printStackTrace();
		   }
		 return this.srcOffsets;
	 }

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

	/**
	 * Set method for field dstOffsets	[vkstruct_array]<br>
	 * Prototype: VkOffset3D[]  dstOffsets
	 * 
	 * @param dstOffsets - a instance of VkOffset3D[].
	 * @return this VkStruct instance.
	 */ 
	 public VkImageBlit dstOffsets(VkOffset3D[] dstOffsets){
		 this.dstOffsetsBUFFER = new BigBuffer(dstOffsets, VkOffset3D.getID());
		 setDstOffsets0(this.ptr, dstOffsetsBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field dstOffsets	[vkstruct_array]<br>
	 * Prototype: VkOffset3D[]  dstOffsets
	 */ 
	 public VkOffset3D[] dstOffsets(){
		 long ptr = getDstOffsets0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(dstOffsetsBUFFER != null && ptr == dstOffsetsBUFFER.getBufferAddress()){ //same buffer 
		    dstOffsetsBUFFER.update();
		    return dstOffsets;
		  }else{
		     (new UnsupportedOperationException("There is no VKStruct[] for backup.")).printStackTrace();
		   }
		 return this.dstOffsets;
	 }


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
		 // code for Buffer - referenced by ptr
		  vkObj->srcSubresource = (VkImageSubresourceLayers) (_srcSubresource);
	  */

	/**
	 * Native GET method for field srcSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 private static native long getSrcSubresource0(Buffer ptr);/*
		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->srcSubresource);
	 */

	/**
	 * Native SET method for field srcOffsets	[vkstruct_array]<br>
	 * Prototype: VkOffset3D[]  srcOffsets
	 */ 
	 private static native void setSrcOffsets0(Buffer ptr, java.nio.ByteBuffer  _srcOffsets);/*
		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->srcOffsets = (VkOffset3D[]) (_srcOffsets);
	  */

	/**
	 * Native GET method for field srcOffsets	[vkstruct_array]<br>
	 * Prototype: VkOffset3D[]  srcOffsets
	 */ 
	 private static native long getSrcOffsets0(Buffer ptr);/*
		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->srcOffsets );
	 */

	/**
	 * Native SET method for field dstSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 private static native void setDstSubresource0(Buffer ptr, java.nio.ByteBuffer  _dstSubresource);/*
		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->dstSubresource = (VkImageSubresourceLayers) (_dstSubresource);
	  */

	/**
	 * Native GET method for field dstSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 private static native long getDstSubresource0(Buffer ptr);/*
		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->dstSubresource);
	 */

	/**
	 * Native SET method for field dstOffsets	[vkstruct_array]<br>
	 * Prototype: VkOffset3D[]  dstOffsets
	 */ 
	 private static native void setDstOffsets0(Buffer ptr, java.nio.ByteBuffer  _dstOffsets);/*
		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->dstOffsets = (VkOffset3D[]) (_dstOffsets);
	  */

	/**
	 * Native GET method for field dstOffsets	[vkstruct_array]<br>
	 * Prototype: VkOffset3D[]  dstOffsets
	 */ 
	 private static native long getDstOffsets0(Buffer ptr);/*
		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->dstOffsets );
	 */



} // end of class VkImageBlit
