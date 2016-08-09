/**
 * Class wrapping Vulkan's VkPipelineViewportStateCreateInfo struct.
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
 *  This class is a Java front end for struct VkPipelineViewportStateCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPipelineViewportStateCreateInfo {
 *     VkStructureType                       sType;
 *     const void*                           pNext;
 *     VkPipelineViewportStateCreateFlags    flags;
 *     uint32_t                              viewportCount;
 *     const VkViewport*                     pViewports;
 *     uint32_t                              scissorCount;
 *     const VkRect2D*                       pScissors;
 * } VkPipelineViewportStateCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkPipelineViewportStateCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [58]  */
	 private static final String TAG = "VkPipelineViewportStateCreateInfo";

	/** ID of this structure [58]  */
	 public static final int TAG_ID = VKPIPELINEVIEWPORTSTATECREATEINFO_ID;

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
	 *  VkPipelineViewportStateCreateFlags 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  uint32_t 	viewportCount	[int]
	 */ 
	int 	viewportCount;
	
	/**
	 *  const VkViewport* 	pViewports	[vkstruct_array_array]
	 */ 
	  VkViewport[]  	pViewports;
	 private BigBuffer 	 pViewportsBUFFER;
	
	/**
	 *  uint32_t 	scissorCount	[int]
	 */ 
	int 	scissorCount;
	
	/**
	 *  const VkRect2D* 	pScissors	[vkstruct_array_array]
	 */ 
	  VkRect2D[]  	pScissors;
	 private BigBuffer 	 pScissorsBUFFER;
	/**
	 * Ctor
	 */
	public VkPipelineViewportStateCreateInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineViewportStateCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPipelineViewportStateCreateInfo(long address){ 
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
	 public VkPipelineViewportStateCreateInfo sType(VkStructureType sType){
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
	 public VkPipelineViewportStateCreateInfo pNext(VkObject pNext){
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
	 * Prototype: VkPipelineViewportStateCreateFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineViewportStateCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkPipelineViewportStateCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field viewportCount	[int]<br>
	 * Prototype: uint32_t  viewportCount
	 * 
	 * @param viewportCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineViewportStateCreateInfo viewportCount(int viewportCount){
		 this.viewportCount = viewportCount;
		 setViewportCount0(this.ptr,  viewportCount);
		 return this;
	 }

	/**
	 * Get method for field viewportCount	[int]<br>
	 * Prototype: uint32_t  viewportCount
	 */ 
	 public int viewportCount(){
		 int var = getViewportCount0(super.ptr);
		 this.viewportCount = var;
		 return this.viewportCount;
	 }

	/**
	 * Set method for field pViewports	[vkstruct_array]<br>
	 * Prototype: const VkViewport*  pViewports
	 * 
	 * @param pViewports - a instance of VkViewport[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineViewportStateCreateInfo pViewports(VkViewport[] pViewports){
		 this.pViewports = pViewports;
		 this.pViewportsBUFFER = new BigBuffer(pViewports, VkViewport.getID());
		 setPViewports0(this.ptr, pViewportsBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pViewports	[vkstruct_array]<br>
	 * Prototype: const VkViewport*  pViewports
	 */ 
	 public VkViewport[] pViewports(){
		 long ptr = getPViewports0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pViewportsBUFFER != null && ptr == pViewportsBUFFER.getBufferAddress()){ //same buffer 
		    pViewportsBUFFER.update();
		    return pViewports;
		  }else{
		     (new UnsupportedOperationException("There is no VKStruct[] for backup.")).printStackTrace();
		   }
		 return this.pViewports;
	 }

	/**
	 * Set method for field scissorCount	[int]<br>
	 * Prototype: uint32_t  scissorCount
	 * 
	 * @param scissorCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineViewportStateCreateInfo scissorCount(int scissorCount){
		 this.scissorCount = scissorCount;
		 setScissorCount0(this.ptr,  scissorCount);
		 return this;
	 }

	/**
	 * Get method for field scissorCount	[int]<br>
	 * Prototype: uint32_t  scissorCount
	 */ 
	 public int scissorCount(){
		 int var = getScissorCount0(super.ptr);
		 this.scissorCount = var;
		 return this.scissorCount;
	 }

	/**
	 * Set method for field pScissors	[vkstruct_array]<br>
	 * Prototype: const VkRect2D*  pScissors
	 * 
	 * @param pScissors - a instance of VkRect2D[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineViewportStateCreateInfo pScissors(VkRect2D[] pScissors){
		 this.pScissors = pScissors;
		 this.pScissorsBUFFER = new BigBuffer(pScissors, VkRect2D.getID());
		 setPScissors0(this.ptr, pScissorsBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pScissors	[vkstruct_array]<br>
	 * Prototype: const VkRect2D*  pScissors
	 */ 
	 public VkRect2D[] pScissors(){
		 long ptr = getPScissors0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pScissorsBUFFER != null && ptr == pScissorsBUFFER.getBufferAddress()){ //same buffer 
		    pScissorsBUFFER.update();
		    return pScissors;
		  }else{
		     (new UnsupportedOperationException("There is no VKStruct[] for backup.")).printStackTrace();
		   }
		 return this.pScissors;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkPipelineViewportStateCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n viewportCount: ")
				.append(viewportCount() )
				.append(",\n pViewports: ")
				.append(Arrays.toString(pViewports()) )
				.append(",\n scissorCount: ")
				.append(scissorCount() )
				.append(",\n pScissors: ")
				.append(Arrays.toString(pScissors()) )
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
		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineViewportStateCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  vkObj->flags = (VkPipelineViewportStateCreateFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineViewportStateCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field viewportCount	[int]<br>
	 * Prototype: uint32_t  viewportCount
	 */ 
	 private static native void setViewportCount0(Buffer ptr, int _viewportCount);/*
		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  vkObj->viewportCount = (uint32_t) (_viewportCount);
	  */

	/**
	 * Native GET method for field viewportCount	[int]<br>
	 * Prototype: uint32_t  viewportCount
	 */ 
	 private static native int getViewportCount0(Buffer ptr);/*
		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  return (jint) (vkObj->viewportCount);
	 */

	/**
	 * Native SET method for field pViewports	[vkstruct_array]<br>
	 * Prototype: const VkViewport*  pViewports
	 */ 
	 private static native void setPViewports0(Buffer ptr, java.nio.ByteBuffer  _pViewports);/*
		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  vkObj->pViewports = (const VkViewport*) (_pViewports);
	  */

	/**
	 * Native GET method for field pViewports	[vkstruct_array]<br>
	 * Prototype: const VkViewport*  pViewports
	 */ 
	 private static native long getPViewports0(Buffer ptr);/*
		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pViewports);
	 */

	/**
	 * Native SET method for field scissorCount	[int]<br>
	 * Prototype: uint32_t  scissorCount
	 */ 
	 private static native void setScissorCount0(Buffer ptr, int _scissorCount);/*
		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  vkObj->scissorCount = (uint32_t) (_scissorCount);
	  */

	/**
	 * Native GET method for field scissorCount	[int]<br>
	 * Prototype: uint32_t  scissorCount
	 */ 
	 private static native int getScissorCount0(Buffer ptr);/*
		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  return (jint) (vkObj->scissorCount);
	 */

	/**
	 * Native SET method for field pScissors	[vkstruct_array]<br>
	 * Prototype: const VkRect2D*  pScissors
	 */ 
	 private static native void setPScissors0(Buffer ptr, java.nio.ByteBuffer  _pScissors);/*
		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  vkObj->pScissors = (const VkRect2D*) (_pScissors);
	  */

	/**
	 * Native GET method for field pScissors	[vkstruct_array]<br>
	 * Prototype: const VkRect2D*  pScissors
	 */ 
	 private static native long getPScissors0(Buffer ptr);/*
		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pScissors);
	 */



} // end of class VkPipelineViewportStateCreateInfo
