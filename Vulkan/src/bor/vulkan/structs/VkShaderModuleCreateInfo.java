/**
 * Class wrapping Vulkan's VkShaderModuleCreateInfo struct.
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
 *  This class is a Java front end for struct VkShaderModuleCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkShaderModuleCreateInfo {
 *     VkStructureType              sType;
 *     const void*                  pNext;
 *     VkShaderModuleCreateFlags    flags;
 *     size_t                       codeSize;
 *     const uint32_t*              pCode;
 * } VkShaderModuleCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkShaderModuleCreateInfo extends VkStruct {
	/** TAG of this structure [44]  */
	 private static final String TAG = "VkShaderModuleCreateInfo";

	/** ID of this structure [44]  */
	 public static final int TAG_ID = VKSHADERMODULECREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkShaderModuleCreateInfo> p;

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
	 *  VkShaderModuleCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  size_t 	codeSize	[long]
	 */ 
	 long 	codeSize;

	/**
	 *  const uint32_t* 	pCode	[int_array]
	 */ 
	 int[] 	pCode;

	/**
	 * Ctor
	 */
	public VkShaderModuleCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkShaderModuleCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkShaderModuleCreateInfo(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkShaderModuleCreateInfo(long address){ 
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
	 * Create a pointer P to contain a instance of this,
	 * with clean native pointer.<br>
	 * You can use {@link VkStruct#setPointer(ByteBuffer)} to set a new 
	 * native pointer.
	 * @return An instance of P for this VkStruct with null pointer
	 */
	 public static P<VkShaderModuleCreateInfo> createNullPointer(){
	        P<VkShaderModuleCreateInfo> p = new  P<VkShaderModuleCreateInfo>(new VkShaderModuleCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkShaderModuleCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkShaderModuleCreateInfo> (this);
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
		 setSType0(this.ptr, enumVal );
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
	 */ 
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 setPNext0(this.ptr, buff);
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
	 * Prototype: VkShaderModuleCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkShaderModuleCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field codeSize	[long]<br>
	 * Prototype: size_t  codeSize
	 */ 
	 public void codeSize(long codeSize){
		 this.codeSize = codeSize;
		 setCodeSize0(this.ptr,  codeSize);
	 }

	/**
	 * Get method for field codeSize	[long]<br>
	 * Prototype: size_t  codeSize
	 */ 
	 public long codeSize(){
		 long var = getCodeSize0(super.ptr);
		 this.codeSize = var;
		 return this.codeSize;
	 }

	/**
	 * Set method for field pCode	[int_array]<br>
	 * Prototype: const uint32_t*  pCode
	 */ 
	 public void pCode(int[] pCode){
		 this.pCode = pCode;
		 setPCode0(this.ptr,  pCode);
	 }

	/**
	 * Get method for field pCode	[int_array]<br>
	 * Prototype: const uint32_t*  pCode
	 */ 
	 public int[] pCode(){
		 int[] var = getPCode0(super.ptr);
		 this.pCode = var;
		 return this.pCode;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkShaderModuleCreateInfo vkObj = (VkShaderModuleCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkShaderModuleCreateInfo vkObj = (VkShaderModuleCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkShaderModuleCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		  vkObj->flags = (VkShaderModuleCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkShaderModuleCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkShaderModuleCreateInfo vkObj = (VkShaderModuleCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field codeSize	[long]<br>
	 * Prototype: size_t  codeSize
	 */ 
	 private static native void setCodeSize0(Buffer ptr, long _codeSize);/*
		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		  vkObj->codeSize = (size_t) (_codeSize);
	  */

	/**
	 * native GET method for field codeSize	[long]<br>
	 * Prototype: size_t  codeSize
	 */ 
	 private static native long getCodeSize0(Buffer ptr);/*
		  VkShaderModuleCreateInfo vkObj = (VkShaderModuleCreateInfo*)(ptr);
		  return (jlong) (vkObj->codeSize);
	 */

	/**
	 * native SET method for field pCode	[int_array]<br>
	 * Prototype: const uint32_t*  pCode
	 */ 
	 private static native void setPCode0(Buffer ptr, int[] _pCode);/*
		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		  vkObj->pCode = (const uint32_t*) (_pCode);
	  */

	/**
	 * native GET method for field pCode	[int_array]<br>
	 * Prototype: const uint32_t*  pCode
	 */ 
	 private static native int[] getPCode0(Buffer ptr);/*
		  VkShaderModuleCreateInfo vkObj = (VkShaderModuleCreateInfo*)(ptr);
		  return (int[]) (vkObj->pCode);
	 */



} // end of class VkShaderModuleCreateInfo
