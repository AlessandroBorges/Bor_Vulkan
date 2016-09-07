/**
 * Class wrapping Vulkan's VkSparseBufferMemoryBindInfo struct.
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
 *  This class is a Java front end for struct VkSparseBufferMemoryBindInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSparseBufferMemoryBindInfo {
 *     VkBuffer                     buffer;
 *     uint32_t                     bindCount;
 *     const VkSparseMemoryBind*    pBinds;
 * } VkSparseBufferMemoryBindInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkSparseBufferMemoryBindInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [26]  */
	 private static final String TAG = "VkSparseBufferMemoryBindInfo";

	/** ID of this structure [26]  */
	 public static final int TAG_ID = VKSPARSEBUFFERMEMORYBINDINFO_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkBuffer 	buffer	[vkhandle]
	 */ 
	VkBuffer 	buffer;
	
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
	public VkSparseBufferMemoryBindInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSparseBufferMemoryBindInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkSparseBufferMemoryBindInfo(long address){ 
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
	 public static VkArray<VkSparseBufferMemoryBindInfo> createVkArray(int size){ 
		 VkSparseBufferMemoryBindInfo[] array = new VkSparseBufferMemoryBindInfo[size]; 
		 VkArrayStruct<VkSparseBufferMemoryBindInfo> vkArray = new VkArrayStruct<VkSparseBufferMemoryBindInfo>(array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 * 
	 * @param buffer - a instance of VkBuffer.
	 * @return this VkStruct instance.
	 */ 
	 public VkSparseBufferMemoryBindInfo buffer(VkBuffer buffer){
		 this.buffer = buffer;
		 long handle = (buffer==null) ? 0L : buffer.getNativeHandle();
		 setBuffer0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 public VkBuffer buffer(){

		 long handle = getBuffer0(super.ptr);
		 if(handle == 0){
		    this.buffer = null;
		    return null;
		  }  

		 if(this.buffer == null){
		    this.buffer = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.buffer).setNativeHandle(handle);
		  }
		 return this.buffer;
	 }

	/**
	 * Set method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 * 
	 * @param bindCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSparseBufferMemoryBindInfo bindCount(int bindCount){
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
	 public VkSparseBufferMemoryBindInfo pBinds(VkSparseMemoryBind[] pBinds){
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
		  }else{
		     // wrap native structs 
		     int length = bindCount();
		     if(length > 0){
		        this.pBinds = new VkSparseMemoryBind[length];
		        pBindsBUFFER = new BigBuffer<VkSparseMemoryBind>(ptr, pBinds, VkSparseMemoryBind.getID() );
		     }
		   }
		 return this.pBinds;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkSparseBufferMemoryBindInfo [ ")
				.append("buffer: ").append(buffer() )
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
	 * Native SET method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native void setBuffer0(Buffer ptr, long  _buffer);/*
		  VkSparseBufferMemoryBindInfo* vkObj = (VkSparseBufferMemoryBindInfo*)(ptr);
		 // code for simple past value 
		  vkObj->buffer = (VkBuffer) (_buffer);
	  */

	/**
	 * Native GET method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native long getBuffer0(Buffer ptr);/*
		  VkSparseBufferMemoryBindInfo* vkObj = (VkSparseBufferMemoryBindInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->buffer);
	 */

	/**
	 * Native SET method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 */ 
	 private static native void setBindCount0(Buffer ptr, int _bindCount);/*
		  VkSparseBufferMemoryBindInfo* vkObj = (VkSparseBufferMemoryBindInfo*)(ptr);
		 // code for simple past value 
		  vkObj->bindCount = (uint32_t) (_bindCount);
	  */

	/**
	 * Native GET method for field bindCount	[int]<br>
	 * Prototype: uint32_t  bindCount
	 */ 
	 private static native int getBindCount0(Buffer ptr);/*
		  VkSparseBufferMemoryBindInfo* vkObj = (VkSparseBufferMemoryBindInfo*)(ptr);
		  return (jint) (vkObj->bindCount);
	 */

	/**
	 * Native SET method for field pBinds	[vkstruct_array]<br>
	 * Prototype: const VkSparseMemoryBind*  pBinds
	 */ 
	 private static native void setPBinds0(Buffer ptr, java.nio.ByteBuffer  _pBinds);/*
		  VkSparseBufferMemoryBindInfo* vkObj = (VkSparseBufferMemoryBindInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkSparseMemoryBind* p_pBinds = ( VkSparseMemoryBind*) _pBinds; 
		 vkObj->pBinds = p_pBinds; 
	  */

	/**
	 * Native GET method for field pBinds	[vkstruct_array]<br>
	 * Prototype: const VkSparseMemoryBind*  pBinds
	 */ 
	 private static native long getPBinds0(Buffer ptr);/*
		  VkSparseBufferMemoryBindInfo* vkObj = (VkSparseBufferMemoryBindInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pBinds );
	 */



} // end of class VkSparseBufferMemoryBindInfo
