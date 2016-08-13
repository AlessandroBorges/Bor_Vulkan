/**
 * Class wrapping Vulkan's VkShaderModuleCreateInfo struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.65 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
 package bor.vulkan.structs;

 import bor.util.*;
 import bor.vulkan.*;
 import static bor.vulkan.Vulkan.*; 
 import bor.vulkan.enumerations.*;

 import java.util.*;
 import java.nio.*;


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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkShaderModuleCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [44]  */
	 private static final String TAG = "VkShaderModuleCreateInfo";

	/** ID of this structure [44]  */
	 public static final int TAG_ID = VKSHADERMODULECREATEINFO_ID;

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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkShaderModuleCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 * 
	 * @param sType - a instance of VkStructureType.
	 * @return this VkStruct instance.
	 */ 
	 public VkShaderModuleCreateInfo sType(VkStructureType sType){
		 this.sType = sType;
		 int enumVal = sType.getValue();
		 setSType0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param pNext - a instance of VkObject.
	 * @return this VkStruct instance.
	 */ 
	 public VkShaderModuleCreateInfo pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 setPNext0(this.ptr, buff);
		 return this;
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
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkShaderModuleCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
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
	 * 
	 * @param codeSize - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkShaderModuleCreateInfo codeSize(long codeSize){
		 this.codeSize = codeSize;
		 setCodeSize0(this.ptr,  codeSize);
		 return this;
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
	 * Set method for field pCode	[int]<br>
	 * Prototype: const uint32_t*  pCode
	 * 
	 * @param pCode - a instance of int[].
	 * @return this VkStruct instance.
	 */ 
	 public VkShaderModuleCreateInfo pCode(int[] pCode){
		 this.pCode = pCode;
		 setPCode0(this.ptr,  pCode);
		 return this;
	 }

	/**
	 * Get method for field pCode	[int]<br>
	 * Prototype: const uint32_t*  pCode
	 */ 
	 public int[] pCode(){
		 int[] var = getPCode0(super.ptr, pCode);
		 this.pCode = var;
		 return this.pCode;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkShaderModuleCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n codeSize: ")
				.append(codeSize() )
				.append(",\n pCode: ")
				.append(Arrays.toString(pCode()) )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkShaderModuleCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkShaderModuleCreateFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkShaderModuleCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field codeSize	[long]<br>
	 * Prototype: size_t  codeSize
	 */ 
	 private static native void setCodeSize0(Buffer ptr, long _codeSize);/*
		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->codeSize = (size_t) (_codeSize);
	  */

	/**
	 * Native GET method for field codeSize	[long]<br>
	 * Prototype: size_t  codeSize
	 */ 
	 private static native long getCodeSize0(Buffer ptr);/*
		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		  return (jlong) (vkObj->codeSize);
	 */

	/**
	 * Native SET method for field pCode	[int]<br>
	 * Prototype: const uint32_t*  pCode
	 */ 
	 private static native void setPCode0(Buffer ptr, int[] _pCode);/*
		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		 // code for generic array assignment 
		 uint32_t* temp = const_cast<uint32_t*>(vkObj->pCode);
		 if(temp) { free(temp); } 
		 vkObj->pCode = NULL; 
		 if( _pCode == NULL){ 
		    vkObj->codeSize = 0; 
		     return;
		  }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pCode); 
		  temp = CALLOC(count, uint32_t); 
		  memcpy( temp, _pCode, count * sizeof(uint32_t)); 
		  vkObj->pCode = temp; 
		  vkObj->codeSize = count;
	  */

	/**
	 * Native GET method for field pCode	[int]<br>
	 * Prototype: const uint32_t*  pCode
	 */ 
	 private static native int[] getPCode0(Buffer ptr, int[] _pCode);/*
		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		  // generic get for C type array, with content copy 
		  if( 0 == vkObj->codeSize){ 
		     return NULL;
		   }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pCode);
		  if(vkObj->pCode == NULL){
		    return NULL;
		   }
 		  memcpy(_pCode, vkObj->pCode, count * sizeof(uint32_t));
		  return obj__pCode;
	 */



} // end of class VkShaderModuleCreateInfo
