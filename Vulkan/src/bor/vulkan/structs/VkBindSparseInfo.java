/**
 * Class wrapping Vulkan's VkBindSparseInfo struct.
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


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkBindSparseInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkBindSparseInfo {
 *     VkStructureType                             sType;
 *     const void*                                 pNext;
 *     uint32_t                                    waitSemaphoreCount;
 *     const VkSemaphore*                          pWaitSemaphores;
 *     uint32_t                                    bufferBindCount;
 *     const VkSparseBufferMemoryBindInfo*         pBufferBinds;
 *     uint32_t                                    imageOpaqueBindCount;
 *     const VkSparseImageOpaqueMemoryBindInfo*    pImageOpaqueBinds;
 *     uint32_t                                    imageBindCount;
 *     const VkSparseImageMemoryBindInfo*          pImageBinds;
 *     uint32_t                                    signalSemaphoreCount;
 *     const VkSemaphore*                          pSignalSemaphores;
 * } VkBindSparseInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkBindSparseInfo extends VkStruct {
	/** TAG of this structure [156]  */
	 private static final String TAG = "VkBindSparseInfo";

	/** ID of this structure [156]  */
	 public static final int TAG_ID = VKBINDSPARSEINFO_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType	[vkenum]	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext		 */ 
	P<VkObject> 	pNext;

	/**
	 *  uint32_t 	waitSemaphoreCount		 */ 
	int 	waitSemaphoreCount;

	/**
	 *  const VkSemaphore* 	pWaitSemaphores		 */ 
	P<VkSemaphore>  	pWaitSemaphores;

	/**
	 *  uint32_t 	bufferBindCount		 */ 
	int 	bufferBindCount;

	/**
	 *  const VkSparseBufferMemoryBindInfo* 	pBufferBinds		 */ 
	P<VkSparseBufferMemoryBindInfo>  	pBufferBinds;

	/**
	 *  uint32_t 	imageOpaqueBindCount		 */ 
	int 	imageOpaqueBindCount;

	/**
	 *  const VkSparseImageOpaqueMemoryBindInfo* 	pImageOpaqueBinds		 */ 
	P<VkSparseImageOpaqueMemoryBindInfo>  	pImageOpaqueBinds;

	/**
	 *  uint32_t 	imageBindCount		 */ 
	int 	imageBindCount;

	/**
	 *  const VkSparseImageMemoryBindInfo* 	pImageBinds		 */ 
	P<VkSparseImageMemoryBindInfo>  	pImageBinds;

	/**
	 *  uint32_t 	signalSemaphoreCount		 */ 
	int 	signalSemaphoreCount;

	/**
	 *  const VkSemaphore* 	pSignalSemaphores		 */ 
	P<VkSemaphore>  	pSignalSemaphores;

	/**
	 * Ctor
	 */
	public VkBindSparseInfo(){ 
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
	 * Set method for field waitSemaphoreCount	
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 public void waitSemaphoreCount(int waitSemaphoreCount){
		 this.waitSemaphoreCount = waitSemaphoreCount;
		waitSemaphoreCount0(super.ptr, waitSemaphoreCount);
	 }

	/**
	 * get method for field waitSemaphoreCount	
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 public int waitSemaphoreCount(){
		 // return  this.waitSemaphoreCount;
		 return waitSemaphoreCount0(super.ptr);
	 }

	/**
	 * Set method for field pWaitSemaphores	
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 public void pWaitSemaphores(P<VkSemaphore>  pWaitSemaphores){
		 this.pWaitSemaphores = pWaitSemaphores;
		pWaitSemaphores0(super.ptr, pWaitSemaphores);
	 }

	/**
	 * get method for field pWaitSemaphores	
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 public P<VkSemaphore>  pWaitSemaphores(){
		 // return  this.pWaitSemaphores;
		 return pWaitSemaphores0(super.ptr);
	 }

	/**
	 * Set method for field bufferBindCount	
	 * Prototype: uint32_t  bufferBindCount
	 */ 
	 public void bufferBindCount(int bufferBindCount){
		 this.bufferBindCount = bufferBindCount;
		bufferBindCount0(super.ptr, bufferBindCount);
	 }

	/**
	 * get method for field bufferBindCount	
	 * Prototype: uint32_t  bufferBindCount
	 */ 
	 public int bufferBindCount(){
		 // return  this.bufferBindCount;
		 return bufferBindCount0(super.ptr);
	 }

	/**
	 * Set method for field pBufferBinds	
	 * Prototype: const VkSparseBufferMemoryBindInfo*  pBufferBinds
	 */ 
	 public void pBufferBinds(P<VkSparseBufferMemoryBindInfo>  pBufferBinds){
		 this.pBufferBinds = pBufferBinds;
		pBufferBinds0(super.ptr, pBufferBinds);
	 }

	/**
	 * get method for field pBufferBinds	
	 * Prototype: const VkSparseBufferMemoryBindInfo*  pBufferBinds
	 */ 
	 public P<VkSparseBufferMemoryBindInfo>  pBufferBinds(){
		 // return  this.pBufferBinds;
		 return pBufferBinds0(super.ptr);
	 }

	/**
	 * Set method for field imageOpaqueBindCount	
	 * Prototype: uint32_t  imageOpaqueBindCount
	 */ 
	 public void imageOpaqueBindCount(int imageOpaqueBindCount){
		 this.imageOpaqueBindCount = imageOpaqueBindCount;
		imageOpaqueBindCount0(super.ptr, imageOpaqueBindCount);
	 }

	/**
	 * get method for field imageOpaqueBindCount	
	 * Prototype: uint32_t  imageOpaqueBindCount
	 */ 
	 public int imageOpaqueBindCount(){
		 // return  this.imageOpaqueBindCount;
		 return imageOpaqueBindCount0(super.ptr);
	 }

	/**
	 * Set method for field pImageOpaqueBinds	
	 * Prototype: const VkSparseImageOpaqueMemoryBindInfo*  pImageOpaqueBinds
	 */ 
	 public void pImageOpaqueBinds(P<VkSparseImageOpaqueMemoryBindInfo>  pImageOpaqueBinds){
		 this.pImageOpaqueBinds = pImageOpaqueBinds;
		pImageOpaqueBinds0(super.ptr, pImageOpaqueBinds);
	 }

	/**
	 * get method for field pImageOpaqueBinds	
	 * Prototype: const VkSparseImageOpaqueMemoryBindInfo*  pImageOpaqueBinds
	 */ 
	 public P<VkSparseImageOpaqueMemoryBindInfo>  pImageOpaqueBinds(){
		 // return  this.pImageOpaqueBinds;
		 return pImageOpaqueBinds0(super.ptr);
	 }

	/**
	 * Set method for field imageBindCount	
	 * Prototype: uint32_t  imageBindCount
	 */ 
	 public void imageBindCount(int imageBindCount){
		 this.imageBindCount = imageBindCount;
		imageBindCount0(super.ptr, imageBindCount);
	 }

	/**
	 * get method for field imageBindCount	
	 * Prototype: uint32_t  imageBindCount
	 */ 
	 public int imageBindCount(){
		 // return  this.imageBindCount;
		 return imageBindCount0(super.ptr);
	 }

	/**
	 * Set method for field pImageBinds	
	 * Prototype: const VkSparseImageMemoryBindInfo*  pImageBinds
	 */ 
	 public void pImageBinds(P<VkSparseImageMemoryBindInfo>  pImageBinds){
		 this.pImageBinds = pImageBinds;
		pImageBinds0(super.ptr, pImageBinds);
	 }

	/**
	 * get method for field pImageBinds	
	 * Prototype: const VkSparseImageMemoryBindInfo*  pImageBinds
	 */ 
	 public P<VkSparseImageMemoryBindInfo>  pImageBinds(){
		 // return  this.pImageBinds;
		 return pImageBinds0(super.ptr);
	 }

	/**
	 * Set method for field signalSemaphoreCount	
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 public void signalSemaphoreCount(int signalSemaphoreCount){
		 this.signalSemaphoreCount = signalSemaphoreCount;
		signalSemaphoreCount0(super.ptr, signalSemaphoreCount);
	 }

	/**
	 * get method for field signalSemaphoreCount	
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 public int signalSemaphoreCount(){
		 // return  this.signalSemaphoreCount;
		 return signalSemaphoreCount0(super.ptr);
	 }

	/**
	 * Set method for field pSignalSemaphores	
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 public void pSignalSemaphores(P<VkSemaphore>  pSignalSemaphores){
		 this.pSignalSemaphores = pSignalSemaphores;
		pSignalSemaphores0(super.ptr, pSignalSemaphores);
	 }

	/**
	 * get method for field pSignalSemaphores	
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 public P<VkSemaphore>  pSignalSemaphores(){
		 // return  this.pSignalSemaphores;
		 return pSignalSemaphores0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkBindSparseInfo _obj = (VkBindSparseInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkBindSparseInfo _obj = (VkBindSparseInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkBindSparseInfo _obj = (VkBindSparseInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkBindSparseInfo _obj = (VkBindSparseInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field waitSemaphoreCount	
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 private static native void waitSemaphoreCount0(ByteBuffer ptr, int _waitSemaphoreCount);/*
		  VkBindSparseInfo _obj = (VkBindSparseInfo)(*ptr);
		  _obj.waitSemaphoreCount = (uint32_t) (_waitSemaphoreCount);
	  */

	/**
	 * get method for field waitSemaphoreCount	
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 private static native int waitSemaphoreCount0(ByteBuffer ptr);/*
		  VkBindSparseInfo _obj = (VkBindSparseInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pWaitSemaphores	
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 private static native void pWaitSemaphores0(ByteBuffer ptr, P<VkSemaphore>  _pWaitSemaphores);/*
		  VkBindSparseInfo _obj = (VkBindSparseInfo)(*ptr);
		  _obj.pWaitSemaphores = (const VkSemaphore*) (_pWaitSemaphores);
	  */

	/**
	 * get method for field pWaitSemaphores	
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 private static native P<VkSemaphore>  pWaitSemaphores0(ByteBuffer ptr);/*
		  VkBindSparseInfo _obj = (VkBindSparseInfo)(ptr);
		  return (P<VkSemaphore> ) (_obj.const VkSemaphore*);
	 */

	/**
	 * native Set method for field bufferBindCount	
	 * Prototype: uint32_t  bufferBindCount
	 */ 
	 private static native void bufferBindCount0(ByteBuffer ptr, int _bufferBindCount);/*
		  VkBindSparseInfo _obj = (VkBindSparseInfo)(*ptr);
		  _obj.bufferBindCount = (uint32_t) (_bufferBindCount);
	  */

	/**
	 * get method for field bufferBindCount	
	 * Prototype: uint32_t  bufferBindCount
	 */ 
	 private static native int bufferBindCount0(ByteBuffer ptr);/*
		  VkBindSparseInfo _obj = (VkBindSparseInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pBufferBinds	
	 * Prototype: const VkSparseBufferMemoryBindInfo*  pBufferBinds
	 */ 
	 private static native void pBufferBinds0(ByteBuffer ptr, P<VkSparseBufferMemoryBindInfo>  _pBufferBinds);/*
		  VkBindSparseInfo _obj = (VkBindSparseInfo)(*ptr);
		  _obj.pBufferBinds = (const VkSparseBufferMemoryBindInfo*) (_pBufferBinds);
	  */

	/**
	 * get method for field pBufferBinds	
	 * Prototype: const VkSparseBufferMemoryBindInfo*  pBufferBinds
	 */ 
	 private static native P<VkSparseBufferMemoryBindInfo>  pBufferBinds0(ByteBuffer ptr);/*
		  VkBindSparseInfo _obj = (VkBindSparseInfo)(ptr);
		  return (P<VkSparseBufferMemoryBindInfo> ) (_obj.const VkSparseBufferMemoryBindInfo*);
	 */

	/**
	 * native Set method for field imageOpaqueBindCount	
	 * Prototype: uint32_t  imageOpaqueBindCount
	 */ 
	 private static native void imageOpaqueBindCount0(ByteBuffer ptr, int _imageOpaqueBindCount);/*
		  VkBindSparseInfo _obj = (VkBindSparseInfo)(*ptr);
		  _obj.imageOpaqueBindCount = (uint32_t) (_imageOpaqueBindCount);
	  */

	/**
	 * get method for field imageOpaqueBindCount	
	 * Prototype: uint32_t  imageOpaqueBindCount
	 */ 
	 private static native int imageOpaqueBindCount0(ByteBuffer ptr);/*
		  VkBindSparseInfo _obj = (VkBindSparseInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pImageOpaqueBinds	
	 * Prototype: const VkSparseImageOpaqueMemoryBindInfo*  pImageOpaqueBinds
	 */ 
	 private static native void pImageOpaqueBinds0(ByteBuffer ptr, P<VkSparseImageOpaqueMemoryBindInfo>  _pImageOpaqueBinds);/*
		  VkBindSparseInfo _obj = (VkBindSparseInfo)(*ptr);
		  _obj.pImageOpaqueBinds = (const VkSparseImageOpaqueMemoryBindInfo*) (_pImageOpaqueBinds);
	  */

	/**
	 * get method for field pImageOpaqueBinds	
	 * Prototype: const VkSparseImageOpaqueMemoryBindInfo*  pImageOpaqueBinds
	 */ 
	 private static native P<VkSparseImageOpaqueMemoryBindInfo>  pImageOpaqueBinds0(ByteBuffer ptr);/*
		  VkBindSparseInfo _obj = (VkBindSparseInfo)(ptr);
		  return (P<VkSparseImageOpaqueMemoryBindInfo> ) (_obj.const VkSparseImageOpaqueMemoryBindInfo*);
	 */

	/**
	 * native Set method for field imageBindCount	
	 * Prototype: uint32_t  imageBindCount
	 */ 
	 private static native void imageBindCount0(ByteBuffer ptr, int _imageBindCount);/*
		  VkBindSparseInfo _obj = (VkBindSparseInfo)(*ptr);
		  _obj.imageBindCount = (uint32_t) (_imageBindCount);
	  */

	/**
	 * get method for field imageBindCount	
	 * Prototype: uint32_t  imageBindCount
	 */ 
	 private static native int imageBindCount0(ByteBuffer ptr);/*
		  VkBindSparseInfo _obj = (VkBindSparseInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pImageBinds	
	 * Prototype: const VkSparseImageMemoryBindInfo*  pImageBinds
	 */ 
	 private static native void pImageBinds0(ByteBuffer ptr, P<VkSparseImageMemoryBindInfo>  _pImageBinds);/*
		  VkBindSparseInfo _obj = (VkBindSparseInfo)(*ptr);
		  _obj.pImageBinds = (const VkSparseImageMemoryBindInfo*) (_pImageBinds);
	  */

	/**
	 * get method for field pImageBinds	
	 * Prototype: const VkSparseImageMemoryBindInfo*  pImageBinds
	 */ 
	 private static native P<VkSparseImageMemoryBindInfo>  pImageBinds0(ByteBuffer ptr);/*
		  VkBindSparseInfo _obj = (VkBindSparseInfo)(ptr);
		  return (P<VkSparseImageMemoryBindInfo> ) (_obj.const VkSparseImageMemoryBindInfo*);
	 */

	/**
	 * native Set method for field signalSemaphoreCount	
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 private static native void signalSemaphoreCount0(ByteBuffer ptr, int _signalSemaphoreCount);/*
		  VkBindSparseInfo _obj = (VkBindSparseInfo)(*ptr);
		  _obj.signalSemaphoreCount = (uint32_t) (_signalSemaphoreCount);
	  */

	/**
	 * get method for field signalSemaphoreCount	
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 private static native int signalSemaphoreCount0(ByteBuffer ptr);/*
		  VkBindSparseInfo _obj = (VkBindSparseInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pSignalSemaphores	
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 private static native void pSignalSemaphores0(ByteBuffer ptr, P<VkSemaphore>  _pSignalSemaphores);/*
		  VkBindSparseInfo _obj = (VkBindSparseInfo)(*ptr);
		  _obj.pSignalSemaphores = (const VkSemaphore*) (_pSignalSemaphores);
	  */

	/**
	 * get method for field pSignalSemaphores	
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 private static native P<VkSemaphore>  pSignalSemaphores0(ByteBuffer ptr);/*
		  VkBindSparseInfo _obj = (VkBindSparseInfo)(ptr);
		  return (P<VkSemaphore> ) (_obj.const VkSemaphore*);
	 */



} // end of class VkBindSparseInfo
