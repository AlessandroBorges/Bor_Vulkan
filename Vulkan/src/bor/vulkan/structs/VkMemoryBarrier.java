/**
 * Class wrapping Vulkan's VkMemoryBarrier struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.01 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.*;
import java.nio.ByteBuffer;

import java.nio.Buffer;


/**
 *  Project Bor-Vulkan 
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkMemoryBarrier. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkMemoryBarrier {
 *     VkStructureType    sType;
 *     const void*        pNext;
 *     VkAccessFlags      srcAccessMask;
 *     VkAccessFlags      dstAccessMask;
 * } VkMemoryBarrier;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkMemoryBarrier extends VkStruct {
	/** TAG of this structure [99]  */
	 private static final String TAG = "VkMemoryBarrier";

	/** ID of this structure [99]  */
	 public static final int TAG_ID = VKMEMORYBARRIER_ID;

	/** P wrapper for THIS object */
	 private  P<VkMemoryBarrier> p;

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
	 *  VkAccessFlags 	srcAccessMask	[int]
	 */ 
	 int 	srcAccessMask;

	/**
	 *  VkAccessFlags 	dstAccessMask	[int]
	 */ 
	 int 	dstAccessMask;

	/**
	 * Ctor
	 */
	public VkMemoryBarrier(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkMemoryBarrier(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkMemoryBarrier(long address, int memSize){ 
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
	 public static P<VkMemoryBarrier> createNullPointer(){
	        P<VkMemoryBarrier> p = new  P<VkMemoryBarrier>(new VkMemoryBarrier());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkMemoryBarrier> getP() {
	       if(p == null ){
	           p = new P<VkMemoryBarrier> (this);
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
	 * Set method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 public void srcAccessMask(int srcAccessMask){
		 this.srcAccessMask = srcAccessMask;
		 srcAccessMask0(this.ptr,  srcAccessMask);
	 }

	/**
	 * Get method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 public int srcAccessMask(){
		 int var = srcAccessMask0(super.ptr);
		 this.srcAccessMask = var;
		 return this.srcAccessMask;
	 }

	/**
	 * Set method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 public void dstAccessMask(int dstAccessMask){
		 this.dstAccessMask = dstAccessMask;
		 dstAccessMask0(this.ptr,  dstAccessMask);
	 }

	/**
	 * Get method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 public int dstAccessMask(){
		 int var = dstAccessMask0(super.ptr);
		 this.dstAccessMask = var;
		 return this.dstAccessMask;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkMemoryBarrier* vkObj = (VkMemoryBarrier*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkMemoryBarrier vkObj = (VkMemoryBarrier*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkMemoryBarrier* vkObj = (VkMemoryBarrier*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkMemoryBarrier vkObj = (VkMemoryBarrier*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 private static native void srcAccessMask0(Buffer ptr, int _srcAccessMask);/*
		  VkMemoryBarrier* vkObj = (VkMemoryBarrier*)(ptr);
		  vkObj->srcAccessMask = (VkAccessFlags) (_srcAccessMask);
	  */

	/**
	 * native GET method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 private static native int srcAccessMask0(Buffer ptr);/*
		  VkMemoryBarrier vkObj = (VkMemoryBarrier*)(ptr);
		  return (jint) (vkObj->srcAccessMask);
	 */

	/**
	 * native SET method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 private static native void dstAccessMask0(Buffer ptr, int _dstAccessMask);/*
		  VkMemoryBarrier* vkObj = (VkMemoryBarrier*)(ptr);
		  vkObj->dstAccessMask = (VkAccessFlags) (_dstAccessMask);
	  */

	/**
	 * native GET method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 private static native int dstAccessMask0(Buffer ptr);/*
		  VkMemoryBarrier vkObj = (VkMemoryBarrier*)(ptr);
		  return (jint) (vkObj->dstAccessMask);
	 */



} // end of class VkMemoryBarrier
