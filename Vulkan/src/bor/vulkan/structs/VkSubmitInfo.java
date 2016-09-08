/**
 * Class wrapping Vulkan's VkSubmitInfo struct.
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
 *  This class is a Java front end for struct VkSubmitInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSubmitInfo {
 *     VkStructureType                sType;
 *     const void*                    pNext;
 *     uint32_t                       waitSemaphoreCount;
 *     const VkSemaphore*             pWaitSemaphores;
 *     const VkPipelineStageFlags*    pWaitDstStageMask;
 *     uint32_t                       commandBufferCount;
 *     const VkCommandBuffer*         pCommandBuffers;
 *     uint32_t                       signalSemaphoreCount;
 *     const VkSemaphore*             pSignalSemaphores;
 * } VkSubmitInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkSubmitInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [19]  */
	 private static final String TAG = "VkSubmitInfo";

	/** ID of this structure [19]  */
	 public static final int TAG_ID = VKSUBMITINFO_ID;

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
	 *  uint32_t 	waitSemaphoreCount	[int]
	 */ 
	int 	waitSemaphoreCount;
	
	/**
	 *  const VkSemaphore* 	pWaitSemaphores	[vkhandle_array_array]
	 */ 
	VkSemaphore[]  	pWaitSemaphores;
	 private BigBuffer<VkSemaphore> 	 pWaitSemaphoresBUFFER;
	
	/**
	 *  const VkPipelineStageFlags* 	pWaitDstStageMask	[int_array]
	 */ 
	int[] 	pWaitDstStageMask;
	
	/**
	 *  uint32_t 	commandBufferCount	[int]
	 */ 
	int 	commandBufferCount;
	
	/**
	 *  const VkCommandBuffer* 	pCommandBuffers	[vkhandle_array_array]
	 */ 
	VkCommandBuffer[]  	pCommandBuffers;
	 private BigBuffer<VkCommandBuffer> 	 pCommandBuffersBUFFER;
	
	/**
	 *  uint32_t 	signalSemaphoreCount	[int]
	 */ 
	int 	signalSemaphoreCount;
	
	/**
	 *  const VkSemaphore* 	pSignalSemaphores	[vkhandle_array_array]
	 */ 
	VkSemaphore[]  	pSignalSemaphores;
	 private BigBuffer<VkSemaphore> 	 pSignalSemaphoresBUFFER;
	/**
	 * Ctor
	 */
	public VkSubmitInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSubmitInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkSubmitInfo(long address){ 
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

	/** 
	 * Static method to create a VkArray for this VkStruct subclass.
	 * @param size - number of elements
	 */
	 public static VkArray<VkSubmitInfo> createVkArray(int size){ 
		 VkSubmitInfo[] array = new VkSubmitInfo[size]; 
		 VkArrayStruct<VkSubmitInfo> vkArray = new VkArrayStruct<VkSubmitInfo>(array, TAG_ID);
		 return vkArray; 
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
	 public VkSubmitInfo sType(VkStructureType sType){
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
	 public VkSubmitInfo pNext(VkObject pNext){
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
	 * Set method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 * 
	 * @param waitSemaphoreCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSubmitInfo waitSemaphoreCount(int waitSemaphoreCount){
		 this.waitSemaphoreCount = waitSemaphoreCount;
		 setWaitSemaphoreCount0(this.ptr,  waitSemaphoreCount);
		 return this;
	 }

	/**
	 * Get method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 public int waitSemaphoreCount(){
		 int var = getWaitSemaphoreCount0(super.ptr);
		 this.waitSemaphoreCount = var;
		 return this.waitSemaphoreCount;
	 }

	/**
	 * Set method for field pWaitSemaphores	[vkhandle_array]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 * 
	 * @param pWaitSemaphores - a instance of VkSemaphore[].
	 * @return this VkStruct instance.
	 */ 
	 public VkSubmitInfo pWaitSemaphores(VkSemaphore[] pWaitSemaphores){
		 this.pWaitSemaphores = pWaitSemaphores;
		 this.pWaitSemaphoresBUFFER = new BigBuffer<VkSemaphore>(pWaitSemaphores, false);
		 setPWaitSemaphores0(this.ptr, pWaitSemaphoresBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pWaitSemaphores	[vkhandle_array]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 public VkSemaphore[] pWaitSemaphores(){
		 long ptr = getPWaitSemaphores0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pWaitSemaphoresBUFFER != null && ptr == pWaitSemaphoresBUFFER.getBufferAddress()){ //same buffer 
		    pWaitSemaphoresBUFFER.update();
		    return pWaitSemaphores;
		  }else{
		     // wrap native handles 
		     int length = waitSemaphoreCount();
		     if(length > 0){
		        this.pWaitSemaphores = new VkSemaphore[length];
		        pWaitSemaphoresBUFFER = new BigBuffer<VkSemaphore>(ptr, pWaitSemaphores, false);
		     }
		   }
		 return this.pWaitSemaphores;
	 }

	/**
	 * Set method for field pWaitDstStageMask	[int]<br>
	 * Prototype: const VkPipelineStageFlags*  pWaitDstStageMask
	 * 
	 * @param pWaitDstStageMask - a instance of int[].
	 * @return this VkStruct instance.
	 */ 
	 public VkSubmitInfo pWaitDstStageMask(int[] pWaitDstStageMask){
		 this.pWaitDstStageMask = pWaitDstStageMask;
		 setPWaitDstStageMask0(this.ptr,  pWaitDstStageMask);
		 return this;
	 }

	/**
	 * Get method for field pWaitDstStageMask	[int]<br>
	 * Prototype: const VkPipelineStageFlags*  pWaitDstStageMask
	 */ 
	 public int[] pWaitDstStageMask(){
		 int[] var = getPWaitDstStageMask0(super.ptr, pWaitDstStageMask);
		 this.pWaitDstStageMask = var;
		 return this.pWaitDstStageMask;
	 }

	/**
	 * Set method for field commandBufferCount	[int]<br>
	 * Prototype: uint32_t  commandBufferCount
	 * 
	 * @param commandBufferCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSubmitInfo commandBufferCount(int commandBufferCount){
		 this.commandBufferCount = commandBufferCount;
		 setCommandBufferCount0(this.ptr,  commandBufferCount);
		 return this;
	 }

	/**
	 * Get method for field commandBufferCount	[int]<br>
	 * Prototype: uint32_t  commandBufferCount
	 */ 
	 public int commandBufferCount(){
		 int var = getCommandBufferCount0(super.ptr);
		 this.commandBufferCount = var;
		 return this.commandBufferCount;
	 }

	/**
	 * Set method for field pCommandBuffers	[vkhandle_array]<br>
	 * Prototype: const VkCommandBuffer*  pCommandBuffers
	 * 
	 * @param pCommandBuffers - a instance of VkCommandBuffer[].
	 * @return this VkStruct instance.
	 */ 
	 public VkSubmitInfo pCommandBuffers(VkCommandBuffer[] pCommandBuffers){
		 this.pCommandBuffers = pCommandBuffers;
		 this.pCommandBuffersBUFFER = new BigBuffer<VkCommandBuffer>(pCommandBuffers, true);
		 setPCommandBuffers0(this.ptr, pCommandBuffersBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pCommandBuffers	[vkhandle_array]<br>
	 * Prototype: const VkCommandBuffer*  pCommandBuffers
	 */ 
	 public VkCommandBuffer[] pCommandBuffers(){
		 long ptr = getPCommandBuffers0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pCommandBuffersBUFFER != null && ptr == pCommandBuffersBUFFER.getBufferAddress()){ //same buffer 
		    pCommandBuffersBUFFER.update();
		    return pCommandBuffers;
		  }else{
		     // wrap native handles 
		     int length = commandBufferCount();
		     if(length > 0){
		        this.pCommandBuffers = new VkCommandBuffer[length];
		        pCommandBuffersBUFFER = new BigBuffer<VkCommandBuffer>(ptr, pCommandBuffers, true);
		     }
		   }
		 return this.pCommandBuffers;
	 }

	/**
	 * Set method for field signalSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  signalSemaphoreCount
	 * 
	 * @param signalSemaphoreCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSubmitInfo signalSemaphoreCount(int signalSemaphoreCount){
		 this.signalSemaphoreCount = signalSemaphoreCount;
		 setSignalSemaphoreCount0(this.ptr,  signalSemaphoreCount);
		 return this;
	 }

	/**
	 * Get method for field signalSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 public int signalSemaphoreCount(){
		 int var = getSignalSemaphoreCount0(super.ptr);
		 this.signalSemaphoreCount = var;
		 return this.signalSemaphoreCount;
	 }

	/**
	 * Set method for field pSignalSemaphores	[vkhandle_array]<br>
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 * 
	 * @param pSignalSemaphores - a instance of VkSemaphore[].
	 * @return this VkStruct instance.
	 */ 
	 public VkSubmitInfo pSignalSemaphores(VkSemaphore[] pSignalSemaphores){
		 this.pSignalSemaphores = pSignalSemaphores;
		 this.pSignalSemaphoresBUFFER = new BigBuffer<VkSemaphore>(pSignalSemaphores, false);
		 setPSignalSemaphores0(this.ptr, pSignalSemaphoresBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pSignalSemaphores	[vkhandle_array]<br>
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 public VkSemaphore[] pSignalSemaphores(){
		 long ptr = getPSignalSemaphores0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pSignalSemaphoresBUFFER != null && ptr == pSignalSemaphoresBUFFER.getBufferAddress()){ //same buffer 
		    pSignalSemaphoresBUFFER.update();
		    return pSignalSemaphores;
		  }else{
		     // wrap native handles 
		     int length = signalSemaphoreCount();
		     if(length > 0){
		        this.pSignalSemaphores = new VkSemaphore[length];
		        pSignalSemaphoresBUFFER = new BigBuffer<VkSemaphore>(ptr, pSignalSemaphores, false);
		     }
		   }
		 return this.pSignalSemaphores;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkSubmitInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n waitSemaphoreCount: ")
				.append(waitSemaphoreCount() )
				.append(",\n pWaitSemaphores: ")
				.append(Arrays.toString(pWaitSemaphores()) )
				.append(",\n pWaitDstStageMask: ")
				.append(Arrays.toString(pWaitDstStageMask()) )
				.append(",\n commandBufferCount: ")
				.append(commandBufferCount() )
				.append(",\n pCommandBuffers: ")
				.append(Arrays.toString(pCommandBuffers()) )
				.append(",\n signalSemaphoreCount: ")
				.append(signalSemaphoreCount() )
				.append(",\n pSignalSemaphores: ")
				.append(Arrays.toString(pSignalSemaphores()) )
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
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 */

	/**
	 * Native SET method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 private static native void setWaitSemaphoreCount0(Buffer ptr, int _waitSemaphoreCount);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		 // code for simple past value 
		  vkObj->waitSemaphoreCount = (uint32_t) (_waitSemaphoreCount);
	  */

	/**
	 * Native GET method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 private static native int getWaitSemaphoreCount0(Buffer ptr);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  return (jint) (vkObj->waitSemaphoreCount);
	 */

	/**
	 * Native SET method for field pWaitSemaphores	[vkhandle_array]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 private static native void setPWaitSemaphores0(Buffer ptr, ByteBuffer  _pWaitSemaphores);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkSemaphore* p_pWaitSemaphores = ( VkSemaphore*) _pWaitSemaphores; 
		 vkObj->pWaitSemaphores = p_pWaitSemaphores; 
	  */

	/**
	 * Native GET method for field pWaitSemaphores	[vkhandle_array]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 private static native long getPWaitSemaphores0(Buffer ptr);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pWaitSemaphores );
	 */

	/**
	 * Native SET method for field pWaitDstStageMask	[int]<br>
	 * Prototype: const VkPipelineStageFlags*  pWaitDstStageMask
	 */ 
	 private static native void setPWaitDstStageMask0(Buffer ptr, int[] _pWaitDstStageMask);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		 // code for generic array assignment 
		 VkPipelineStageFlags* temp = const_cast<VkPipelineStageFlags*>(vkObj->pWaitDstStageMask);
		 if(temp) { free(temp); } 
		 vkObj->pWaitDstStageMask = NULL; 
		 if( _pWaitDstStageMask == NULL){ 
		    vkObj->waitSemaphoreCount = 0; 
		     return;
		  }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pWaitDstStageMask); 
		  temp = CALLOC(count, VkPipelineStageFlags); 
		  memcpy( temp, _pWaitDstStageMask, count * sizeof(VkPipelineStageFlags)); 
		  vkObj->pWaitDstStageMask = temp; 
		  vkObj->waitSemaphoreCount = count;
	  */

	/**
	 * Native GET method for field pWaitDstStageMask	[int]<br>
	 * Prototype: const VkPipelineStageFlags*  pWaitDstStageMask
	 */ 
	 private static native int[] getPWaitDstStageMask0(Buffer ptr, int[] _pWaitDstStageMask);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  // generic get for C type array, with content copy 
		  if( 0 == vkObj->waitSemaphoreCount){ 
		     return NULL;
		   }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pWaitDstStageMask);
		  if(vkObj->pWaitDstStageMask == NULL){
		    return NULL;
		   }
 		  memcpy(_pWaitDstStageMask, vkObj->pWaitDstStageMask, count * sizeof(VkPipelineStageFlags));
		  return obj__pWaitDstStageMask;
	 */

	/**
	 * Native SET method for field commandBufferCount	[int]<br>
	 * Prototype: uint32_t  commandBufferCount
	 */ 
	 private static native void setCommandBufferCount0(Buffer ptr, int _commandBufferCount);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		 // code for simple past value 
		  vkObj->commandBufferCount = (uint32_t) (_commandBufferCount);
	  */

	/**
	 * Native GET method for field commandBufferCount	[int]<br>
	 * Prototype: uint32_t  commandBufferCount
	 */ 
	 private static native int getCommandBufferCount0(Buffer ptr);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  return (jint) (vkObj->commandBufferCount);
	 */

	/**
	 * Native SET method for field pCommandBuffers	[vkhandle_array]<br>
	 * Prototype: const VkCommandBuffer*  pCommandBuffers
	 */ 
	 private static native void setPCommandBuffers0(Buffer ptr, ByteBuffer  _pCommandBuffers);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkCommandBuffer* p_pCommandBuffers = ( VkCommandBuffer*) _pCommandBuffers; 
		 vkObj->pCommandBuffers = p_pCommandBuffers; 
	  */

	/**
	 * Native GET method for field pCommandBuffers	[vkhandle_array]<br>
	 * Prototype: const VkCommandBuffer*  pCommandBuffers
	 */ 
	 private static native long getPCommandBuffers0(Buffer ptr);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pCommandBuffers );
	 */

	/**
	 * Native SET method for field signalSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 private static native void setSignalSemaphoreCount0(Buffer ptr, int _signalSemaphoreCount);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		 // code for simple past value 
		  vkObj->signalSemaphoreCount = (uint32_t) (_signalSemaphoreCount);
	  */

	/**
	 * Native GET method for field signalSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 private static native int getSignalSemaphoreCount0(Buffer ptr);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  return (jint) (vkObj->signalSemaphoreCount);
	 */

	/**
	 * Native SET method for field pSignalSemaphores	[vkhandle_array]<br>
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 private static native void setPSignalSemaphores0(Buffer ptr, ByteBuffer  _pSignalSemaphores);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkSemaphore* p_pSignalSemaphores = ( VkSemaphore*) _pSignalSemaphores; 
		 vkObj->pSignalSemaphores = p_pSignalSemaphores; 
	  */

	/**
	 * Native GET method for field pSignalSemaphores	[vkhandle_array]<br>
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 private static native long getPSignalSemaphores0(Buffer ptr);/*
		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pSignalSemaphores );
	 */



} // end of class VkSubmitInfo
