/**
 * Class wrapping Vulkan's VkSparseImageMemoryBindInfo struct.
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
 *  This class is a Java front end for struct VkSparseImageMemoryBindInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSparseImageMemoryBindInfo {
 *     VkImage                           image;
 *     uint32_t                          bindCount;
 *     const VkSparseImageMemoryBind*    pBinds;
 * } VkSparseImageMemoryBindInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkSparseImageMemoryBindInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [31]  */
	 private static final String TAG = "VkSparseImageMemoryBindInfo";

	/** ID of this structure [31]  */
	 public static final int TAG_ID = VKSPARSEIMAGEMEMORYBINDINFO_ID;

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
	 *  const VkSparseImageMemoryBind* 	pBinds	[vkstruct_array_array]
	 */ 
	  VkSparseImageMemoryBind[]  	pBinds;
	 private BigBuffer 	 pBindsBUFFER;
	/**
	 * Ctor
	 */
	public VkSparseImageMemoryBindInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSparseImageMemoryBindInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkSparseImageMemoryBindInfo(long address){ 
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
	 public static VkArray<VkSparseImageMemoryBindInfo> createVkArray(int size){ 
		 VkSparseImageMemoryBindInfo[] array = new VkSparseImageMemoryBindInfo[size]; 
		 VkArrayStruct<VkSparseImageMemoryBindInfo> vkArray = new VkArrayStruct<VkSparseImageMemoryBindInfo> (array, TAG_ID);
		 return vkArray; 
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
	 public VkSparseImageMemoryBindInfo image(VkImage image){
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
	 public VkSparseImageMemoryBindInfo bindCount(int bindCount){
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
	 * Prototype: const VkSparseImageMemoryBind*  pBinds
	 * 
	 * @param pBinds - a instance of VkSparseImageMemoryBind[].
	 * @return this VkStruct instance.
	 */ 
	 public VkSparseImageMemoryBindInfo pBinds(VkSparseImageMemoryBind[] pBinds){
		 this.pBinds = pBinds;
		 this.pBindsBUFFER = new BigBuffer(pBinds, VkSparseImageMemoryBind.getID());
		 setPBinds0(this.ptr, pBindsBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pBinds	[vkstruct_array]<br>
	 * Prototype: const VkSparseImageMemoryBind*  pBinds
	 */ 
	 public VkSparseImageMemoryBind[] pBinds(){
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
         builder.append("VkSparseImageMemoryBindInfo [ ")
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
		  VkSparseImageMemoryBindInfo* vkObj = (VkSparseImageMemoryBindInfo*)(ptr);
		 // code for simple past value 
		  vkObj->image = (VkImage) (_image);
	  */

	/**
	 * Native GET method for field image	[vkhandle]<br>
	 * Prototype: VkImage  image
	 */ 
	 private static native long getImage0(Buffer ptr);/*
		  VkSparseImageMemoryBindInfo* vkObj = (VkSparseImageMemoryBindInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->image);
	 */

	/**
	 * Native SET method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 */ 
	 private static native void setBindCount0(Buffer ptr, int _bindCount);/*
		  VkSparseImageMemoryBindInfo* vkObj = (VkSparseImageMemoryBindInfo*)(ptr);
		 // code for simple past value 
		  vkObj->bindCount = (uint32_t) (_bindCount);
	  */

	/**
	 * Native GET method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 */ 
	 private static native int getBindCount0(Buffer ptr);/*
		  VkSparseImageMemoryBindInfo* vkObj = (VkSparseImageMemoryBindInfo*)(ptr);
		  return (jint) (vkObj->bindCount);
	 */

	/**
	 * Native SET method for field pBinds	[vkstruct_array]<br>
	 * Prototype: const VkSparseImageMemoryBind*  pBinds
	 */ 
	 private static native void setPBinds0(Buffer ptr, java.nio.ByteBuffer  _pBinds);/*
		  VkSparseImageMemoryBindInfo* vkObj = (VkSparseImageMemoryBindInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkSparseImageMemoryBind* p_pBinds = ( VkSparseImageMemoryBind*) _pBinds; 
		 vkObj->pBinds = p_pBinds; 
	  */

	/**
	 * Native GET method for field pBinds	[vkstruct_array]<br>
	 * Prototype: const VkSparseImageMemoryBind*  pBinds
	 */ 
	 private static native long getPBinds0(Buffer ptr);/*
		  VkSparseImageMemoryBindInfo* vkObj = (VkSparseImageMemoryBindInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pBinds );
	 */



} // end of class VkSparseImageMemoryBindInfo
