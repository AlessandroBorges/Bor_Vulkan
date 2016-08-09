/**
 * Class wrapping Vulkan's VkXcbSurfaceCreateInfoKHR struct.
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

 import bor.vulkan.khr.*;
 import java.util.*;
 import java.nio.*;


/**
 *  Project Bor-Vulkan 
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkXcbSurfaceCreateInfoKHR. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkXcbSurfaceCreateInfoKHR {
 *     VkStructureType               sType;
 *     const void*                   pNext;
 *     VkXcbSurfaceCreateFlagsKHR    flags;
 *     xcb_connection_t*             connection;
 *     xcb_window_t                  window;
 * } VkXcbSurfaceCreateInfoKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkXcbSurfaceCreateInfoKHR extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [119]  */
	 private static final String TAG = "VkXcbSurfaceCreateInfoKHR";

	/** ID of this structure [119]  */
	 public static final int TAG_ID = VKXCBSURFACECREATEINFOKHR_ID;

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
	 *  VkXcbSurfaceCreateFlagsKHR 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  xcb_connection_t* 	connection	[vkhandle]
	 */ 
	XCBconnection 	connection;
	
	/**
	 *  xcb_window_t 	window	[vkhandle]
	 */ 
	XCBwindow 	window;
	/**
	 * Ctor
	 */
	public VkXcbSurfaceCreateInfoKHR(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkXcbSurfaceCreateInfoKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkXcbSurfaceCreateInfoKHR(long address){ 
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
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 * 
	 * @param sType - a instance of VkStructureType.
	 * @return this VkStruct instance.
	 */ 
	 public VkXcbSurfaceCreateInfoKHR sType(VkStructureType sType){
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
	 public VkXcbSurfaceCreateInfoKHR pNext(VkObject pNext){
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
	 * Prototype: VkXcbSurfaceCreateFlagsKHR  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkXcbSurfaceCreateInfoKHR flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkXcbSurfaceCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field connection	[vkhandle]<br>
	 * Prototype: xcb_connection_t*  connection
	 * 
	 * @param connection - a instance of XCBconnection.
	 * @return this VkStruct instance.
	 */ 
	 public VkXcbSurfaceCreateInfoKHR connection(XCBconnection connection){
		 this.connection = connection;
		 long handle = (connection==null) ? 0L : connection.getNativeHandle();
		 setConnection0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field connection	[vkhandle]<br>
	 * Prototype: xcb_connection_t*  connection
	 */ 
	 public XCBconnection connection(){

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
	 * Set method for field window	[vkhandle]<br>
	 * Prototype: xcb_window_t  window
	 * 
	 * @param window - a instance of XCBwindow.
	 * @return this VkStruct instance.
	 */ 
	 public VkXcbSurfaceCreateInfoKHR window(XCBwindow window){
		 this.window = window;
		 long handle = (window==null) ? 0L : window.getNativeHandle();
		 setWindow0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field window	[vkhandle]<br>
	 * Prototype: xcb_window_t  window
	 */ 
	 public XCBwindow window(){

		 long handle = getWindow0(super.ptr);
		 if(handle == 0){
		    this.window = null;
		    return null;
		  }  

		 if(this.window == null){
		    this.window = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.window).setNativeHandle(handle);
		  }
		 return this.window;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkXcbSurfaceCreateInfoKHR [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n connection: ")
				.append(connection() )
				.append(",\n window: ")
				.append(window() )
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
		  VkXcbSurfaceCreateInfoKHR* vkObj = (VkXcbSurfaceCreateInfoKHR*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkXcbSurfaceCreateInfoKHR* vkObj = (VkXcbSurfaceCreateInfoKHR*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkXcbSurfaceCreateInfoKHR* vkObj = (VkXcbSurfaceCreateInfoKHR*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkXcbSurfaceCreateInfoKHR* vkObj = (VkXcbSurfaceCreateInfoKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkXcbSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkXcbSurfaceCreateInfoKHR* vkObj = (VkXcbSurfaceCreateInfoKHR*)(ptr);
		  vkObj->flags = (VkXcbSurfaceCreateFlagsKHR) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkXcbSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkXcbSurfaceCreateInfoKHR* vkObj = (VkXcbSurfaceCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field connection	[vkhandle]<br>
	 * Prototype: xcb_connection_t*  connection
	 */ 
	 private static native void setConnection0(Buffer ptr, long  _connection);/*
		  VkXcbSurfaceCreateInfoKHR* vkObj = (VkXcbSurfaceCreateInfoKHR*)(ptr);
		  vkObj->connection = (xcb_connection_t*) (_connection);
	  */

	/**
	 * Native GET method for field connection	[vkhandle]<br>
	 * Prototype: xcb_connection_t*  connection
	 */ 
	 private static native long getConnection0(Buffer ptr);/*
		  VkXcbSurfaceCreateInfoKHR* vkObj = (VkXcbSurfaceCreateInfoKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->connection);
	 */

	/**
	 * Native SET method for field window	[vkhandle]<br>
	 * Prototype: xcb_window_t  window
	 */ 
	 private static native void setWindow0(Buffer ptr, long  _window);/*
		  VkXcbSurfaceCreateInfoKHR* vkObj = (VkXcbSurfaceCreateInfoKHR*)(ptr);
		  vkObj->window = (xcb_window_t) (_window);
	  */

	/**
	 * Native GET method for field window	[vkhandle]<br>
	 * Prototype: xcb_window_t  window
	 */ 
	 private static native long getWindow0(Buffer ptr);/*
		  VkXcbSurfaceCreateInfoKHR* vkObj = (VkXcbSurfaceCreateInfoKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->window);
	 */



} // end of class VkXcbSurfaceCreateInfoKHR
