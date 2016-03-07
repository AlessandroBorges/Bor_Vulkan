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
	 *  const void* 	pNext	[p]
	 */ 
	 P<VkObject> 	pNext;

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
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(P<VkObject> pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public P<VkObject> pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field flags	[int]<br>
	 * Prototype: VkXcbSurfaceCreateFlagsKHR  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkXcbSurfaceCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field connection	[vkhandle]<br>
	 * Prototype: xcb_connection_t*  connection
	 */ 
	 public void connection(XCBconnection connection){
		 this.connection = connection;
		connection0(super.ptr, connection);
	 }

	/**
	 * get method for field connection	[vkhandle]<br>
	 * Prototype: xcb_connection_t*  connection
	 */ 
	 public XCBconnection connection(){
		 // return  this.connection;
		 return connection0(super.ptr);
	 }

	/**
	 * Set method for field window	[vkhandle]<br>
	 * Prototype: xcb_window_t  window
	 */ 
	 public void window(XCBwindow window){
		 this.window = window;
		window0(super.ptr, window);
	 }

	/**
	 * get method for field window	[vkhandle]<br>
	 * Prototype: xcb_window_t  window
	 */ 
	 public XCBwindow window(){
		 // return  this.window;
		 return window0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkXcbSurfaceCreateInfoKHR _obj = (VkXcbSurfaceCreateInfoKHR)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkXcbSurfaceCreateInfoKHR _obj = (VkXcbSurfaceCreateInfoKHR)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkXcbSurfaceCreateInfoKHR _obj = (VkXcbSurfaceCreateInfoKHR)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkXcbSurfaceCreateInfoKHR _obj = (VkXcbSurfaceCreateInfoKHR)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkXcbSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkXcbSurfaceCreateInfoKHR _obj = (VkXcbSurfaceCreateInfoKHR)(*ptr);
		  _obj.flags = (VkXcbSurfaceCreateFlagsKHR) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkXcbSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkXcbSurfaceCreateInfoKHR _obj = (VkXcbSurfaceCreateInfoKHR)(ptr);
		  return (jint) (_obj.VkXcbSurfaceCreateFlagsKHR);
	 */

	/**
	 * native SET method for field connection	[vkhandle]<br>
	 * Prototype: xcb_connection_t*  connection
	 */ 
	 private static native void connection0(ByteBuffer ptr, XCBconnection _connection);/*
		  VkXcbSurfaceCreateInfoKHR _obj = (VkXcbSurfaceCreateInfoKHR)(*ptr);
		  _obj.connection = (xcb_connection_t*) (_connection);
	  */

	/**
	 * native GET method for field connection	[vkhandle]<br>
	 * Prototype: xcb_connection_t*  connection
	 */ 
	 private static native XCBconnection connection0(ByteBuffer ptr);/*
		  VkXcbSurfaceCreateInfoKHR _obj = (VkXcbSurfaceCreateInfoKHR)(ptr);
		  return (XCBconnection) (_obj.xcb_connection_t*);
	 */

	/**
	 * native SET method for field window	[vkhandle]<br>
	 * Prototype: xcb_window_t  window
	 */ 
	 private static native void window0(ByteBuffer ptr, XCBwindow _window);/*
		  VkXcbSurfaceCreateInfoKHR _obj = (VkXcbSurfaceCreateInfoKHR)(*ptr);
		  _obj.window = (xcb_window_t) (_window);
	  */

	/**
	 * native GET method for field window	[vkhandle]<br>
	 * Prototype: xcb_window_t  window
	 */ 
	 private static native XCBwindow window0(ByteBuffer ptr);/*
		  VkXcbSurfaceCreateInfoKHR _obj = (VkXcbSurfaceCreateInfoKHR)(ptr);
		  return (XCBwindow) (_obj.xcb_window_t);
	 */



} // end of class VkXcbSurfaceCreateInfoKHR
