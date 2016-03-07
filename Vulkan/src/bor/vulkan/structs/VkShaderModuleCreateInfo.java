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
	 *  const void* 	pNext	[p]
	 */ 
	 P<VkObject> 	pNext;

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
	 public VkShaderModuleCreateInfo(long address, int memSize){ 
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
	 * Prototype: VkShaderModuleCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkShaderModuleCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field codeSize	[long]<br>
	 * Prototype: size_t  codeSize
	 */ 
	 public void codeSize(long codeSize){
		 this.codeSize = codeSize;
		codeSize0(super.ptr, codeSize);
	 }

	/**
	 * get method for field codeSize	[long]<br>
	 * Prototype: size_t  codeSize
	 */ 
	 public long codeSize(){
		 // return  this.codeSize;
		 return codeSize0(super.ptr);
	 }

	/**
	 * Set method for field pCode	[int_array]<br>
	 * Prototype: const uint32_t*  pCode
	 */ 
	 public void pCode(int[] pCode){
		 this.pCode = pCode;
		pCode0(super.ptr, pCode);
	 }

	/**
	 * get method for field pCode	[int_array]<br>
	 * Prototype: const uint32_t*  pCode
	 */ 
	 public int[] pCode(){
		 // return  this.pCode;
		 return pCode0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkShaderModuleCreateInfo _obj = (VkShaderModuleCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkShaderModuleCreateInfo _obj = (VkShaderModuleCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkShaderModuleCreateInfo _obj = (VkShaderModuleCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkShaderModuleCreateInfo _obj = (VkShaderModuleCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkShaderModuleCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkShaderModuleCreateInfo _obj = (VkShaderModuleCreateInfo)(*ptr);
		  _obj.flags = (VkShaderModuleCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkShaderModuleCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkShaderModuleCreateInfo _obj = (VkShaderModuleCreateInfo)(ptr);
		  return (jint) (_obj.VkShaderModuleCreateFlags);
	 */

	/**
	 * native SET method for field codeSize	[long]<br>
	 * Prototype: size_t  codeSize
	 */ 
	 private static native void codeSize0(ByteBuffer ptr, long _codeSize);/*
		  VkShaderModuleCreateInfo _obj = (VkShaderModuleCreateInfo)(*ptr);
		  _obj.codeSize = (size_t) (_codeSize);
	  */

	/**
	 * native GET method for field codeSize	[long]<br>
	 * Prototype: size_t  codeSize
	 */ 
	 private static native long codeSize0(ByteBuffer ptr);/*
		  VkShaderModuleCreateInfo _obj = (VkShaderModuleCreateInfo)(ptr);
		  return (jlong) (_obj.size_t);
	 */

	/**
	 * native SET method for field pCode	[int_array]<br>
	 * Prototype: const uint32_t*  pCode
	 */ 
	 private static native void pCode0(ByteBuffer ptr, int[] _pCode);/*
		  VkShaderModuleCreateInfo _obj = (VkShaderModuleCreateInfo)(*ptr);
		  _obj.pCode = (const uint32_t*) (_pCode);
	  */

	/**
	 * native GET method for field pCode	[int_array]<br>
	 * Prototype: const uint32_t*  pCode
	 */ 
	 private static native int[] pCode0(ByteBuffer ptr);/*
		  VkShaderModuleCreateInfo _obj = (VkShaderModuleCreateInfo)(ptr);
		  return (int[]) (_obj.const uint32_t*);
	 */



} // end of class VkShaderModuleCreateInfo
