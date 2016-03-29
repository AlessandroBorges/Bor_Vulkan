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

import java.nio.Buffer;


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

	/** P wrapper for THIS object */
	 private  P<VkMirSurfaceCreateInfoKHR> p;

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


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkMirSurfaceCreateInfoKHR> getP() {
	       if(p == null ){
	           p = new P<VkMirSurfaceCreateInfoKHR> (this);
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
	 * Prototype: VkMirSurfaceCreateFlagsKHR  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 flags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkMirSurfaceCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 int var = flags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field connection	[vkhandle]<br>
	 * Prototype: MirConnection*  connection
	 */ 
	 public void connection(MirConnection connection){
		 this.connection = connection;
		 ByteBuffer buff = (connection==null) ? null : connection.getHandle();
		 connection0(this.ptr, buff);
	 }

	/**
	 * Get method for field connection	[vkhandle]<br>
	 * Prototype: MirConnection*  connection
	 */ 
	 public MirConnection connection(){

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
	 * Set method for field mirSurface	[vkhandle]<br>
	 * Prototype: MirSurface*  mirSurface
	 */ 
	 public void mirSurface(MirSurface mirSurface){
		 this.mirSurface = mirSurface;
		 ByteBuffer buff = (mirSurface==null) ? null : mirSurface.getHandle();
		 mirSurface0(this.ptr, buff);
	 }

	/**
	 * Get method for field mirSurface	[vkhandle]<br>
	 * Prototype: MirSurface*  mirSurface
	 */ 
	 public MirSurface mirSurface(){

		 ByteBuffer handle = mirSurface0(super.ptr);
		 if(handle == null){
		    this.mirSurface = null;
		    return null;
		  } else 
 		 if(this.mirSurface == null){
		    this.mirSurface = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.mirSurface).setHandle(handle);
		  }
		 return this.mirSurface;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkMirSurfaceCreateInfoKHR vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkMirSurfaceCreateInfoKHR vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkMirSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native void flags0(Buffer ptr, int _flags);/*
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		  vkObj->flags = (VkMirSurfaceCreateFlagsKHR) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkMirSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native int flags0(Buffer ptr);/*
		  VkMirSurfaceCreateInfoKHR vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field connection	[vkhandle]<br>
	 * Prototype: MirConnection*  connection
	 */ 
	 private static native void connection0(Buffer ptr, java.nio.ByteBuffer  _connection);/*
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		  vkObj->connection = (MirConnection*) (_connection);
	  */

	/**
	 * native GET method for field connection	[vkhandle]<br>
	 * Prototype: MirConnection*  connection
	 */ 
	 private static native java.nio.ByteBuffer  connection0(Buffer ptr);/*
		  VkMirSurfaceCreateInfoKHR vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		  return (MirConnection) (vkObj->connection);
	 */

	/**
	 * native SET method for field mirSurface	[vkhandle]<br>
	 * Prototype: MirSurface*  mirSurface
	 */ 
	 private static native void mirSurface0(Buffer ptr, java.nio.ByteBuffer  _mirSurface);/*
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		  vkObj->mirSurface = (MirSurface*) (_mirSurface);
	  */

	/**
	 * native GET method for field mirSurface	[vkhandle]<br>
	 * Prototype: MirSurface*  mirSurface
	 */ 
	 private static native java.nio.ByteBuffer  mirSurface0(Buffer ptr);/*
		  VkMirSurfaceCreateInfoKHR vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		  return (MirSurface) (vkObj->mirSurface);
	 */



} // end of class VkMirSurfaceCreateInfoKHR
