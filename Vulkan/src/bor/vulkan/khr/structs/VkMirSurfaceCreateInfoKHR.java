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
	/** TAG of this structure [245]  */
	 private static final String TAG = "VkMirSurfaceCreateInfoKHR";

	/** ID of this structure [245]  */
	 public static final int TAG_ID = VKMIRSURFACECREATEINFOKHR_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType	[vkenum]	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext		 */ 
	P<VkObject> 	pNext;

	/**
	 *  VkMirSurfaceCreateFlagsKHR 	flags		 */ 
	int 	flags;

	/**
	 *  MirConnection* 	connection	[vkhandle]	 */ 
	MirConnection 	connection;

	/**
	 *  MirSurface* 	mirSurface	[vkhandle]	 */ 
	MirSurface 	mirSurface;

	/**
	 * Ctor
	 */
	public VkMirSurfaceCreateInfoKHR(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(P<VkObject> pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 public P<VkObject> pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field flags	
	 * Prototype: VkMirSurfaceCreateFlagsKHR  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	
	 * Prototype: VkMirSurfaceCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field connection	[vkhandle]
	 * Prototype: MirConnection*  connection
	 */ 
	 public void connection(MirConnection connection){
		 this.connection = connection;
		connection0(super.ptr, connection);
	 }

	/**
	 * get method for field connection	[vkhandle]
	 * Prototype: MirConnection*  connection
	 */ 
	 public MirConnection connection(){
		 // return  this.connection;
		 return connection0(super.ptr);
	 }

	/**
	 * Set method for field mirSurface	[vkhandle]
	 * Prototype: MirSurface*  mirSurface
	 */ 
	 public void mirSurface(MirSurface mirSurface){
		 this.mirSurface = mirSurface;
		mirSurface0(super.ptr, mirSurface);
	 }

	/**
	 * get method for field mirSurface	[vkhandle]
	 * Prototype: MirSurface*  mirSurface
	 */ 
	 public MirSurface mirSurface(){
		 // return  this.mirSurface;
		 return mirSurface0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags	
	 * Prototype: VkMirSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(*ptr);
		  _obj.flags = (VkMirSurfaceCreateFlagsKHR) (_flags);
	  */

	/**
	 * get method for field flags	
	 * Prototype: VkMirSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(ptr);
		  return (jint) (_obj.VkMirSurfaceCreateFlagsKHR);
	 */

	/**
	 * native Set method for field connection	[vkhandle]
	 * Prototype: MirConnection*  connection
	 */ 
	 private static native void connection0(ByteBuffer ptr, MirConnection _connection);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(*ptr);
		  _obj.connection = (MirConnection*) (_connection);
	  */

	/**
	 * get method for field connection	[vkhandle]
	 * Prototype: MirConnection*  connection
	 */ 
	 private static native MirConnection connection0(ByteBuffer ptr);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(ptr);
		  return (MirConnection) (_obj.MirConnection*);
	 */

	/**
	 * native Set method for field mirSurface	[vkhandle]
	 * Prototype: MirSurface*  mirSurface
	 */ 
	 private static native void mirSurface0(ByteBuffer ptr, MirSurface _mirSurface);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(*ptr);
		  _obj.mirSurface = (MirSurface*) (_mirSurface);
	  */

	/**
	 * get method for field mirSurface	[vkhandle]
	 * Prototype: MirSurface*  mirSurface
	 */ 
	 private static native MirSurface mirSurface0(ByteBuffer ptr);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(ptr);
		  return (MirSurface) (_obj.MirSurface*);
	 */



} // end of class VkMirSurfaceCreateInfoKHR
