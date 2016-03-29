/**
 * Class wrapping Vulkan's VkXcbSurfaceCreateInfoKHR struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.01 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.khr.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.*;
import bor.vulkan.khr.*;
import java.nio.ByteBuffer;

import java.nio.Buffer;


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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkXcbSurfaceCreateInfoKHR extends VkStruct {
	/** TAG of this structure [119]  */
	 private static final String TAG = "VkXcbSurfaceCreateInfoKHR";

	/** ID of this structure [119]  */
	 public static final int TAG_ID = VKXCBSURFACECREATEINFOKHR_ID;

	/** P wrapper for THIS object */
	 private  P<VkXcbSurfaceCreateInfoKHR> p;

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
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkXcbSurfaceCreateInfoKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkXcbSurfaceCreateInfoKHR(long address, int memSize){ 
		 super(address, memSize); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	/**
	 * Create a pointer P to contain a instance of this,
	 * with clean native pointer.<br>
	 * You can use {@link VkStruct#setPointer(ByteBuffer)} to set a new 
	 * native pointer.
	 * @return An instance of P for this VkStruct with null pointer
	 */
	 public static P<VkXcbSurfaceCreateInfoKHR> createNullPointer(){
	        P<VkXcbSurfaceCreateInfoKHR> p = new  P<VkXcbSurfaceCreateInfoKHR>(new VkXcbSurfaceCreateInfoKHR());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkXcbSurfaceCreateInfoKHR> getP() {
	       if(p == null ){
	           p = new P<VkXcbSurfaceCreateInfoKHR> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		 int enumVal = sType.getValue();
		 sType0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = sType0(super.ptr);
		 this.sType = VkStructureType.fromValue(nativeVal); 
		 return this.sType;
	 }

	/**
	 * Set method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 pNext0(this.ptr, buff);
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 ByteBuffer pointer = pNext0(super.ptr);
		 if(pointer == null){
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
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 flags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkXcbSurfaceCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 int var = flags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field connection	[vkhandle]<br>
	 * Prototype: xcb_connection_t*  connection
	 */ 
	 public void connection(XCBconnection connection){
		 this.connection = connection;
		 ByteBuffer buff = (connection==null) ? null : connection.getHandle();
		 connection0(this.ptr, buff);
	 }

	/**
	 * Get method for field connection	[vkhandle]<br>
	 * Prototype: xcb_connection_t*  connection
	 */ 
	 public XCBconnection connection(){

		 ByteBuffer handle = connection0(super.ptr);
		 if(handle == null){
		    this.connection = null;
		    return null;
		  } else 
 		 if(this.connection == null){
		    this.connection = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.connection).setHandle(handle);
		  }
		 return this.connection;
	 }

	/**
	 * Set method for field window	[vkhandle]<br>
	 * Prototype: xcb_window_t  window
	 */ 
	 public void window(XCBwindow window){
		 this.window = window;
		 ByteBuffer buff = (window==null) ? null : window.getHandle();
		 window0(this.ptr, buff);
	 }

	/**
	 * Get method for field window	[vkhandle]<br>
	 * Prototype: xcb_window_t  window
	 */ 
	 public XCBwindow window(){

		 ByteBuffer handle = window0(super.ptr);
		 if(handle == null){
		    this.window = null;
		    return null;
		  } else 
 		 if(this.window == null){
		    this.window = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.window).setHandle(handle);
		  }
		 return this.window;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkXcbSurfaceCreateInfoKHR* vkObj = (VkXcbSurfaceCreateInfoKHR*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkXcbSurfaceCreateInfoKHR vkObj = (VkXcbSurfaceCreateInfoKHR*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkXcbSurfaceCreateInfoKHR* vkObj = (VkXcbSurfaceCreateInfoKHR*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkXcbSurfaceCreateInfoKHR vkObj = (VkXcbSurfaceCreateInfoKHR*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkXcbSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native void flags0(Buffer ptr, int _flags);/*
		  VkXcbSurfaceCreateInfoKHR* vkObj = (VkXcbSurfaceCreateInfoKHR*)(ptr);
		  vkObj->flags = (VkXcbSurfaceCreateFlagsKHR) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkXcbSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native int flags0(Buffer ptr);/*
		  VkXcbSurfaceCreateInfoKHR vkObj = (VkXcbSurfaceCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field connection	[vkhandle]<br>
	 * Prototype: xcb_connection_t*  connection
	 */ 
	 private static native void connection0(Buffer ptr, java.nio.ByteBuffer  _connection);/*
		  VkXcbSurfaceCreateInfoKHR* vkObj = (VkXcbSurfaceCreateInfoKHR*)(ptr);
		  vkObj->connection = (xcb_connection_t*) (_connection);
	  */

	/**
	 * native GET method for field connection	[vkhandle]<br>
	 * Prototype: xcb_connection_t*  connection
	 */ 
	 private static native java.nio.ByteBuffer  connection0(Buffer ptr);/*
		  VkXcbSurfaceCreateInfoKHR vkObj = (VkXcbSurfaceCreateInfoKHR*)(ptr);
		  return (XCBconnection) (vkObj->connection);
	 */

	/**
	 * native SET method for field window	[vkhandle]<br>
	 * Prototype: xcb_window_t  window
	 */ 
	 private static native void window0(Buffer ptr, java.nio.ByteBuffer  _window);/*
		  VkXcbSurfaceCreateInfoKHR* vkObj = (VkXcbSurfaceCreateInfoKHR*)(ptr);
		  vkObj->window = (xcb_window_t) (_window);
	  */

	/**
	 * native GET method for field window	[vkhandle]<br>
	 * Prototype: xcb_window_t  window
	 */ 
	 private static native java.nio.ByteBuffer  window0(Buffer ptr);/*
		  VkXcbSurfaceCreateInfoKHR vkObj = (VkXcbSurfaceCreateInfoKHR*)(ptr);
		  return (XCBwindow) (vkObj->window);
	 */



} // end of class VkXcbSurfaceCreateInfoKHR
