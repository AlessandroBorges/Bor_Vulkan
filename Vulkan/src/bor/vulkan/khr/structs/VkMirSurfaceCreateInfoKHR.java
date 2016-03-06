/**
 * Class wrapping Vulkan's VkMirSurfaceCreateInfoKHR struct.
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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkMirSurfaceCreateInfoKHR extends VkStruct {
	/** TAG of this structure [121]  */
	 private static final String TAG = "VkMirSurfaceCreateInfoKHR";

	/** ID of this structure [121]  */
	 public static final int TAG_ID = VKMIRSURFACECREATEINFOKHR_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType	[vkenum]
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext	[p]
	 */ 
	P<VkObject> 	pNext;

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
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkMirSurfaceCreateInfoKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkMirSurfaceCreateInfoKHR(long address, int memSize){ 
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
	 public static P<VkMirSurfaceCreateInfoKHR> createNullPointer(){
	        P<VkMirSurfaceCreateInfoKHR> p = new  P<VkMirSurfaceCreateInfoKHR>(new VkMirSurfaceCreateInfoKHR());
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
	 * Prototype: VkMirSurfaceCreateFlagsKHR  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkMirSurfaceCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field connection	[vkhandle]<br>
	 * Prototype: MirConnection*  connection
	 */ 
	 public void connection(MirConnection connection){
		 this.connection = connection;
		connection0(super.ptr, connection);
	 }

	/**
	 * get method for field connection	[vkhandle]<br>
	 * Prototype: MirConnection*  connection
	 */ 
	 public MirConnection connection(){
		 // return  this.connection;
		 return connection0(super.ptr);
	 }

	/**
	 * Set method for field mirSurface	[vkhandle]<br>
	 * Prototype: MirSurface*  mirSurface
	 */ 
	 public void mirSurface(MirSurface mirSurface){
		 this.mirSurface = mirSurface;
		mirSurface0(super.ptr, mirSurface);
	 }

	/**
	 * get method for field mirSurface	[vkhandle]<br>
	 * Prototype: MirSurface*  mirSurface
	 */ 
	 public MirSurface mirSurface(){
		 // return  this.mirSurface;
		 return mirSurface0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkMirSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(*ptr);
		  _obj.flags = (VkMirSurfaceCreateFlagsKHR) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkMirSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(ptr);
		  return (jint) (_obj.VkMirSurfaceCreateFlagsKHR);
	 */

	/**
	 * native SET method for field connection	[vkhandle]<br>
	 * Prototype: MirConnection*  connection
	 */ 
	 private static native void connection0(ByteBuffer ptr, MirConnection _connection);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(*ptr);
		  _obj.connection = (MirConnection*) (_connection);
	  */

	/**
	 * native GET method for field connection	[vkhandle]<br>
	 * Prototype: MirConnection*  connection
	 */ 
	 private static native MirConnection connection0(ByteBuffer ptr);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(ptr);
		  return (MirConnection) (_obj.MirConnection*);
	 */

	/**
	 * native SET method for field mirSurface	[vkhandle]<br>
	 * Prototype: MirSurface*  mirSurface
	 */ 
	 private static native void mirSurface0(ByteBuffer ptr, MirSurface _mirSurface);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(*ptr);
		  _obj.mirSurface = (MirSurface*) (_mirSurface);
	  */

	/**
	 * native GET method for field mirSurface	[vkhandle]<br>
	 * Prototype: MirSurface*  mirSurface
	 */ 
	 private static native MirSurface mirSurface0(ByteBuffer ptr);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(ptr);
		  return (MirSurface) (_obj.MirSurface*);
	 */



} // end of class VkMirSurfaceCreateInfoKHR
