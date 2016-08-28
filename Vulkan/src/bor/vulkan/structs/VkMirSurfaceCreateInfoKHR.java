/**
 * Class wrapping Vulkan's VkMirSurfaceCreateInfoKHR struct.
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
 *  This class is a Java front end for struct VkMirSurfaceCreateInfoKHR. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkMirSurfaceCreateInfoKHR {
 *     VkStructureType               sType;
 *     const void*                   pNext;
 *     VkMirSurfaceCreateFlagsKHR    flags;
 *     MirConnection*                connection;
 *     MirSurface*                   mirSurface;
 * } VkMirSurfaceCreateInfoKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkMirSurfaceCreateInfoKHR extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [121]  */
	 private static final String TAG = "VkMirSurfaceCreateInfoKHR";

	/** ID of this structure [121]  */
	 public static final int TAG_ID = VKMIRSURFACECREATEINFOKHR_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkStructureType 	sType	[vkenum]
	 */ 
	VkStructureType 	sType;
	
	/**
	 *  const void* 	pNext	[vkobject]
	 */ 
	VkObject 	pNext;
	
	/**
	 *  VkMirSurfaceCreateFlagsKHR 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  MirConnection* 	connection	[vkhandle]
	 */ 
	MirConnection 	connection;
	
	/**
	 *  MirSurface* 	mirSurface	[vkhandle]
	 */ 
	MirSurface 	mirSurface;
	/**
	 * Ctor
	 */
	public VkMirSurfaceCreateInfoKHR(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkMirSurfaceCreateInfoKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkMirSurfaceCreateInfoKHR(long address){ 
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
	 public static VkArray<VkMirSurfaceCreateInfoKHR> createVkArray(int size){ 
		 VkMirSurfaceCreateInfoKHR[] array = new VkMirSurfaceCreateInfoKHR[size]; 
		 VkArrayStruct<VkMirSurfaceCreateInfoKHR> vkArray = new VkArrayStruct<VkMirSurfaceCreateInfoKHR> (array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 * 
	 * @param sType - a instance of VkStructureType.
	 * @return this VkStruct instance.
	 */ 
	 public VkMirSurfaceCreateInfoKHR sType(VkStructureType sType){
		 this.sType = sType;
		 int enumVal = sType.getValue();
		 setSType0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = getSType0(super.ptr);
		 this.sType = VkStructureType.fromValue(nativeVal); 
		 return this.sType;
	 }

	/**
	 * Set method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 * 
	 * @param pNext - a instance of VkObject.
	 * @return this VkStruct instance.
	 */ 
	 public VkMirSurfaceCreateInfoKHR pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 setPNext0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 long pointer = getPNext0(super.ptr);
		 if(pointer == 0){
		    this.pNext = null;
		    return null;
		  } else 
		 if(this.pNext == null){
		    this.pNext = (VkObject)(new VkHandle(pointer));
		 }else{
		    this.pNext.setPointer(pointer);
		  }
		 return this.pNext;
	 }

	/**
	 * Set method for field flags	[int]<br>
	 * Prototype: VkMirSurfaceCreateFlagsKHR  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkMirSurfaceCreateInfoKHR flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkMirSurfaceCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field connection	[vkhandle]<br>
	 * Prototype: MirConnection*  connection
	 * 
	 * @param connection - a instance of MirConnection.
	 * @return this VkStruct instance.
	 */ 
	 public VkMirSurfaceCreateInfoKHR connection(MirConnection connection){
		 this.connection = connection;
		 long handle = (connection==null) ? 0L : connection.getNativeHandle();
		 setConnection0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field connection	[vkhandle]<br>
	 * Prototype: MirConnection*  connection
	 */ 
	 public MirConnection connection(){

		 long handle = getConnection0(super.ptr);
		 if(handle == 0){
		    this.connection = null;
		    return null;
		  }  

		 if(this.connection == null){
		    this.connection = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.connection).setNativeHandle(handle);
		  }
		 return this.connection;
	 }

	/**
	 * Set method for field mirSurface	[vkhandle]<br>
	 * Prototype: MirSurface*  mirSurface
	 * 
	 * @param mirSurface - a instance of MirSurface.
	 * @return this VkStruct instance.
	 */ 
	 public VkMirSurfaceCreateInfoKHR mirSurface(MirSurface mirSurface){
		 this.mirSurface = mirSurface;
		 long handle = (mirSurface==null) ? 0L : mirSurface.getNativeHandle();
		 setMirSurface0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field mirSurface	[vkhandle]<br>
	 * Prototype: MirSurface*  mirSurface
	 */ 
	 public MirSurface mirSurface(){

		 long handle = getMirSurface0(super.ptr);
		 if(handle == 0){
		    this.mirSurface = null;
		    return null;
		  }  

		 if(this.mirSurface == null){
		    this.mirSurface = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.mirSurface).setNativeHandle(handle);
		  }
		 return this.mirSurface;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkMirSurfaceCreateInfoKHR [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n connection: ")
				.append(connection() )
				.append(",\n mirSurface: ")
				.append(mirSurface() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
	 #ifdef VK_USE_PLATFORM_MIR_KHR 
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	 #endif 
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
	 #ifdef VK_USE_PLATFORM_MIR_KHR 
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 #else 
	   return 0; 
	 #endif 
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
	 #ifdef VK_USE_PLATFORM_MIR_KHR 
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	 #endif 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
	 #ifdef VK_USE_PLATFORM_MIR_KHR 
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 #else 
	   return 0; 
	 #endif 
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkMirSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
	 #ifdef VK_USE_PLATFORM_MIR_KHR 
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkMirSurfaceCreateFlagsKHR) (_flags);
	 #endif 
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkMirSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
	 #ifdef VK_USE_PLATFORM_MIR_KHR 
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->flags);
	 #else 
	   return 0; 
	 #endif 
	 */

	/**
	 * Native SET method for field connection	[vkhandle]<br>
	 * Prototype: MirConnection*  connection
	 */ 
	 private static native void setConnection0(Buffer ptr, long  _connection);/*
	 #ifdef VK_USE_PLATFORM_MIR_KHR 
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->connection = (MirConnection*) (_connection);
	 #endif 
	  */

	/**
	 * Native GET method for field connection	[vkhandle]<br>
	 * Prototype: MirConnection*  connection
	 */ 
	 private static native long getConnection0(Buffer ptr);/*
	 #ifdef VK_USE_PLATFORM_MIR_KHR 
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->connection);
	 #else 
	   return 0; 
	 #endif 
	 */

	/**
	 * Native SET method for field mirSurface	[vkhandle]<br>
	 * Prototype: MirSurface*  mirSurface
	 */ 
	 private static native void setMirSurface0(Buffer ptr, long  _mirSurface);/*
	 #ifdef VK_USE_PLATFORM_MIR_KHR 
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->mirSurface = (MirSurface*) (_mirSurface);
	 #endif 
	  */

	/**
	 * Native GET method for field mirSurface	[vkhandle]<br>
	 * Prototype: MirSurface*  mirSurface
	 */ 
	 private static native long getMirSurface0(Buffer ptr);/*
	 #ifdef VK_USE_PLATFORM_MIR_KHR 
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->mirSurface);
	 #else 
	   return 0; 
	 #endif 
	 */



} // end of class VkMirSurfaceCreateInfoKHR
