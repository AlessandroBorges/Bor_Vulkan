/**
 * Class wrapping Vulkan's VkSparseImageOpaqueMemoryBindInfo struct.
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
 *  This class is a Java front end for struct VkSparseImageOpaqueMemoryBindInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSparseImageOpaqueMemoryBindInfo {
 *     VkImage                      image;
 *     uint32_t                     bindCount;
 *     const VkSparseMemoryBind*    pBinds;
 * } VkSparseImageOpaqueMemoryBindInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkSparseImageOpaqueMemoryBindInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [27]  */
	 private static final String TAG = "VkSparseImageOpaqueMemoryBindInfo";

	/** ID of this structure [27]  */
	 public static final int TAG_ID = VKSPARSEIMAGEOPAQUEMEMORYBINDINFO_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkImage 	image	[vkhandle]
	 */ 
	VkImage 	image;
	
	/**
	 *  uint32_t 	bindCount	[int]
	 */ 
	int 	bindCount;
	
	/**
	 *  const VkSparseMemoryBind* 	pBinds	[vkstruct_array_array]
	 */ 
	  VkSparseMemoryBind[]  	pBinds;
	 private BigBuffer 	 pBindsBUFFER;
	/**
	 * Ctor
	 */
	public VkSparseImageOpaqueMemoryBindInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSparseImageOpaqueMemoryBindInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkSparseImageOpaqueMemoryBindInfo(long address){ 
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
	 * Set method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 * 
	 * @param image - a instance of VkImage.
	 * @return this VkStruct instance.
	 */ 
	 public VkSparseImageOpaqueMemoryBindInfo image(VkImage image){
		 this.image = image;
		 long handle = (image==null) ? 0L : image.getNativeHandle();
		 setImage0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 */ 
	 public VkImage image(){

		 long handle = getImage0(super.ptr);
		 if(handle == 0){
		    this.image = null;
		    return null;
		  }  

		 if(this.image == null){
		    this.image = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.image).setNativeHandle(handle);
		  }
		 return this.image;
	 }

	/**
	 * Set method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 * 
	 * @param bindCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSparseImageOpaqueMemoryBindInfo bindCount(int bindCount){
		 this.bindCount = bindCount;
		 setBindCount0(this.ptr,  bindCount);
		 return this;
	 }

	/**
	 * Get method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 */ 
	 public int bindCount(){
		 int var = getBindCount0(super.ptr);
		 this.bindCount = var;
		 return this.bindCount;
	 }

	/**
	 * Set method for field pBinds	[vkstruct_array]<br>
	 * Prototype: const VkSparseMemoryBind*  pBinds
	 * 
	 * @param pBinds - a instance of VkSparseMemoryBind[].
	 * @return this VkStruct instance.
	 */ 
	 public VkSparseImageOpaqueMemoryBindInfo pBinds(VkSparseMemoryBind[] pBinds){
		 this.pBinds = pBinds;
		 this.pBindsBUFFER = new BigBuffer(pBinds, VkSparseMemoryBind.getID());
		 setPBinds0(this.ptr, pBindsBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pBinds	[vkstruct_array]<br>
	 * Prototype: const VkSparseMemoryBind*  pBinds
	 */ 
	 public VkSparseMemoryBind[] pBinds(){
		 long ptr = getPBinds0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pBindsBUFFER != null && ptr == pBindsBUFFER.getBufferAddress()){ //same buffer 
		    pBindsBUFFER.update();
		    return pBinds;
		  }else{
		     (new UnsupportedOperationException("There is no VKStruct[] for backup.")).printStackTrace();
		   }
		 return this.pBinds;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkSparseImageOpaqueMemoryBindInfo [ ")
				.append("image: ").append(image() )
				.append(",\n bindCount: ")
				.append(bindCount() )
				.append(",\n pBinds: ")
				.append(Arrays.toString(pBinds()) )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 */ 
	 private static native void setImage0(Buffer ptr, long  _image);/*
		  VkSparseImageOpaqueMemoryBindInfo* vkObj = (VkSparseImageOpaqueMemoryBindInfo*)(ptr);
		  vkObj->image = (VkImage) (_image);
	  */

	/**
	 * Native GET method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 */ 
	 private static native long getImage0(Buffer ptr);/*
		  VkSparseImageOpaqueMemoryBindInfo* vkObj = (VkSparseImageOpaqueMemoryBindInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->image);
	 */

	/**
	 * Native SET method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 */ 
	 private static native void setBindCount0(Buffer ptr, int _bindCount);/*
		  VkSparseImageOpaqueMemoryBindInfo* vkObj = (VkSparseImageOpaqueMemoryBindInfo*)(ptr);
		  vkObj->bindCount = (uint32_t) (_bindCount);
	  */

	/**
	 * Native GET method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 */ 
	 private static native int getBindCount0(Buffer ptr);/*
		  VkSparseImageOpaqueMemoryBindInfo* vkObj = (VkSparseImageOpaqueMemoryBindInfo*)(ptr);
		  return (jint) (vkObj->bindCount);
	 */

	/**
	 * Native SET method for field pBinds	[vkstruct_array]<br>
	 * Prototype: const VkSparseMemoryBind*  pBinds
	 */ 
	 private static native void setPBinds0(Buffer ptr, java.nio.ByteBuffer  _pBinds);/*
		  VkSparseImageOpaqueMemoryBindInfo* vkObj = (VkSparseImageOpaqueMemoryBindInfo*)(ptr);
		  vkObj->pBinds = (const VkSparseMemoryBind*) (_pBinds);
	  */

	/**
	 * Native GET method for field pBinds	[vkstruct_array]<br>
	 * Prototype: const VkSparseMemoryBind*  pBinds
	 */ 
	 private static native long getPBinds0(Buffer ptr);/*
		  VkSparseImageOpaqueMemoryBindInfo* vkObj = (VkSparseImageOpaqueMemoryBindInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pBinds);
	 */



} // end of class VkSparseImageOpaqueMemoryBindInfo
