// class wrapping Vulkan's VkMirSurfaceCreateInfoKHR struct.
package bor.vulkan.khr.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.VkStruct;

import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkMirSurfaceCreateInfoKHR 
 * @Author Alessandro Borges 
 */
public class VkMirSurfaceCreateInfoKHR extends VkStruct {
	/** ID of this structure [121]  */
	 public static final int TAG = VKMIRSURFACECREATEINFOKHR_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType 
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext 
	 */ 
	VkObject 	pNext;

	/**
	 *  VkMirSurfaceCreateFlagsKHR 	flags 
	 */ 
	int 	flags;

	/**
	 *  MirConnection* 	connection 
	 */ 
	MirConnection* 	connection;

	/**
	 *  MirSurface* 	mirSurface 
	 */ 
	MirSurface* 	mirSurface;

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
		 return sizeOf(TAG); 
	}


	 // /////////////////////
	 //  SETTERS & GETTERS //
	 // /////////////////////

	/**
	 * Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType
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
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
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
	 * Set method for field connection
	 * Prototype: MirConnection*  connection
	 */ 
	 public void connection(MirConnection* connection){
		 this.connection = connection;
		connection0(super.ptr, connection);
	 }

	/**
	 * get method for field connection
	 * Prototype: MirConnection*  connection
	 */ 
	 public MirConnection* connection(){
		 // return  this.connection;
		 return connection0(super.ptr);
	 }

	/**
	 * Set method for field mirSurface
	 * Prototype: MirSurface*  mirSurface
	 */ 
	 public void mirSurface(MirSurface* mirSurface){
		 this.mirSurface = mirSurface;
		mirSurface0(super.ptr, mirSurface);
	 }

	/**
	 * get method for field mirSurface
	 * Prototype: MirSurface*  mirSurface
	 */ 
	 public MirSurface* mirSurface(){
		 // return  this.mirSurface;
		 return mirSurface0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
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
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(ptr);
		  return (VkObject) (_obj.const void*);
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
	 * native Set method for field connection
	 * Prototype: MirConnection*  connection
	 */ 
	 private static native void connection0(ByteBuffer ptr, MirConnection* _connection);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(*ptr);
		  _obj.connection = (MirConnection*) (_connection);
	  */

	/**
	 * get method for field connection
	 * Prototype: MirConnection*  connection
	 */ 
	 private static native MirConnection* connection0(ByteBuffer ptr);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(ptr);
		  return (MirConnection*) (_obj.MirConnection*);
	 */

	/**
	 * native Set method for field mirSurface
	 * Prototype: MirSurface*  mirSurface
	 */ 
	 private static native void mirSurface0(ByteBuffer ptr, MirSurface* _mirSurface);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(*ptr);
		  _obj.mirSurface = (MirSurface*) (_mirSurface);
	  */

	/**
	 * get method for field mirSurface
	 * Prototype: MirSurface*  mirSurface
	 */ 
	 private static native MirSurface* mirSurface0(ByteBuffer ptr);/*
		  VkMirSurfaceCreateInfoKHR _obj = (VkMirSurfaceCreateInfoKHR)(ptr);
		  return (MirSurface*) (_obj.MirSurface*);
	 */



} // end of class VkMirSurfaceCreateInfoKHR
