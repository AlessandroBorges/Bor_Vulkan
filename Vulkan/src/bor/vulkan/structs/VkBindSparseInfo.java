/**
 * Class wrapping Vulkan's VkBindSparseInfo struct.
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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkBindSparseInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [32]  */
	 private static final String TAG = "VkBindSparseInfo";

	/** ID of this structure [32]  */
	 public static final int TAG_ID = VKBINDSPARSEINFO_ID;

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
	 private BigBuffer 	 pWaitSemaphoresBUFFER;
	
	/**
	 *  uint32_t 	bufferBindCount	[int]
	 */ 
	int 	bufferBindCount;
	
	/**
	 *  const VkSparseBufferMemoryBindInfo* 	pBufferBinds	[vkstruct_array_array]
	 */ 
	VkSparseBufferMemoryBindInfo[]  	pBufferBinds;
	 private BigBuffer 	 pBufferBindsBUFFER;
	
	/**
	 *  uint32_t 	imageOpaqueBindCount	[int]
	 */ 
	int 	imageOpaqueBindCount;
	
	/**
	 *  const VkSparseImageOpaqueMemoryBindInfo* 	pImageOpaqueBinds	[vkstruct_array_array]
	 */ 
	VkSparseImageOpaqueMemoryBindInfo[]  	pImageOpaqueBinds;
	 private BigBuffer 	 pImageOpaqueBindsBUFFER;
	
	/**
	 *  uint32_t 	imageBindCount	[int]
	 */ 
	int 	imageBindCount;
	
	/**
	 *  const VkSparseImageMemoryBindInfo* 	pImageBinds	[vkstruct_array_array]
	 */ 
	VkSparseImageMemoryBindInfo[]  	pImageBinds;
	 private BigBuffer 	 pImageBindsBUFFER;
	
	/**
	 *  uint32_t 	signalSemaphoreCount	[int]
	 */ 
	int 	signalSemaphoreCount;
	
	/**
	 *  const VkSemaphore* 	pSignalSemaphores	[vkhandle_array_array]
	 */ 
	VkSemaphore[]  	pSignalSemaphores;
	 private BigBuffer 	 pSignalSemaphoresBUFFER;
	/**
	 * Ctor
	 */
	public VkBindSparseInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkBindSparseInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkBindSparseInfo(long address){ 
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
	 public static VkArray<VkBindSparseInfo> createVkArray(int size){ 
		 VkBindSparseInfo[] array = new VkBindSparseInfo[size]; 
		 VkArrayStruct<VkBindSparseInfo> vkArray = new VkArrayStruct<VkBindSparseInfo>(array, TAG_ID);
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
	 public VkBindSparseInfo sType(VkStructureType sType){
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
	 public VkBindSparseInfo pNext(VkObject pNext){
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
	 public VkBindSparseInfo waitSemaphoreCount(int waitSemaphoreCount){
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
	 public VkBindSparseInfo pWaitSemaphores(VkSemaphore[] pWaitSemaphores){
		 this.pWaitSemaphores = pWaitSemaphores;
		 this.pWaitSemaphoresBUFFER = new BigBuffer(pWaitSemaphores, false);
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
	 * Set method for field bufferBindCount	[int]<br>
	 * Prototype: uint32_t  bufferBindCount
	 * 
	 * @param bufferBindCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkBindSparseInfo bufferBindCount(int bufferBindCount){
		 this.bufferBindCount = bufferBindCount;
		 setBufferBindCount0(this.ptr,  bufferBindCount);
		 return this;
	 }

	/**
	 * Get method for field bufferBindCount	[int]<br>
	 * Prototype: uint32_t  bufferBindCount
	 */ 
	 public int bufferBindCount(){
		 int var = getBufferBindCount0(super.ptr);
		 this.bufferBindCount = var;
		 return this.bufferBindCount;
	 }

	/**
	 * Set method for field pBufferBinds	[vkstruct_array]<br>
	 * Prototype: const VkSparseBufferMemoryBindInfo*  pBufferBinds
	 * 
	 * @param pBufferBinds - a instance of VkSparseBufferMemoryBindInfo[].
	 * @return this VkStruct instance.
	 */ 
	 public VkBindSparseInfo pBufferBinds(VkSparseBufferMemoryBindInfo[] pBufferBinds){
		 this.pBufferBinds = pBufferBinds;
		 this.pBufferBindsBUFFER = new BigBuffer(pBufferBinds, VkSparseBufferMemoryBindInfo.getID());
		 setPBufferBinds0(this.ptr, pBufferBindsBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pBufferBinds	[vkstruct_array]<br>
	 * Prototype: const VkSparseBufferMemoryBindInfo*  pBufferBinds
	 */ 
	 public VkSparseBufferMemoryBindInfo[] pBufferBinds(){
		 long ptr = getPBufferBinds0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pBufferBindsBUFFER != null && ptr == pBufferBindsBUFFER.getBufferAddress()){ //same buffer 
		    pBufferBindsBUFFER.update();
		  }else{
		     // wrap native structs 
		     int length = bufferBindCount();
		     if(length > 0){
		        this.pBufferBinds = new VkSparseBufferMemoryBindInfo[length];
		        pBufferBindsBUFFER = new BigBuffer<VkSparseBufferMemoryBindInfo>(ptr, pBufferBinds, const VkSparseBufferMemoryBindInfo*getID() );
		     }
		   }
		 return this.pBufferBinds;
	 }

	/**
	 * Set method for field imageOpaqueBindCount	[int]<br>
	 * Prototype: uint32_t  imageOpaqueBindCount
	 * 
	 * @param imageOpaqueBindCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkBindSparseInfo imageOpaqueBindCount(int imageOpaqueBindCount){
		 this.imageOpaqueBindCount = imageOpaqueBindCount;
		 setImageOpaqueBindCount0(this.ptr,  imageOpaqueBindCount);
		 return this;
	 }

	/**
	 * Get method for field imageOpaqueBindCount	[int]<br>
	 * Prototype: uint32_t  imageOpaqueBindCount
	 */ 
	 public int imageOpaqueBindCount(){
		 int var = getImageOpaqueBindCount0(super.ptr);
		 this.imageOpaqueBindCount = var;
		 return this.imageOpaqueBindCount;
	 }

	/**
	 * Set method for field pImageOpaqueBinds	[vkstruct_array]<br>
	 * Prototype: const VkSparseImageOpaqueMemoryBindInfo*  pImageOpaqueBinds
	 * 
	 * @param pImageOpaqueBinds - a instance of VkSparseImageOpaqueMemoryBindInfo[].
	 * @return this VkStruct instance.
	 */ 
	 public VkBindSparseInfo pImageOpaqueBinds(VkSparseImageOpaqueMemoryBindInfo[] pImageOpaqueBinds){
		 this.pImageOpaqueBinds = pImageOpaqueBinds;
		 this.pImageOpaqueBindsBUFFER = new BigBuffer(pImageOpaqueBinds, VkSparseImageOpaqueMemoryBindInfo.getID());
		 setPImageOpaqueBinds0(this.ptr, pImageOpaqueBindsBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pImageOpaqueBinds	[vkstruct_array]<br>
	 * Prototype: const VkSparseImageOpaqueMemoryBindInfo*  pImageOpaqueBinds
	 */ 
	 public VkSparseImageOpaqueMemoryBindInfo[] pImageOpaqueBinds(){
		 long ptr = getPImageOpaqueBinds0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pImageOpaqueBindsBUFFER != null && ptr == pImageOpaqueBindsBUFFER.getBufferAddress()){ //same buffer 
		    pImageOpaqueBindsBUFFER.update();
		  }else{
		     // wrap native structs 
		     int length = imageOpaqueBindCount();
		     if(length > 0){
		        this.pImageOpaqueBinds = new VkSparseImageOpaqueMemoryBindInfo[length];
		        pImageOpaqueBindsBUFFER = new BigBuffer<VkSparseImageOpaqueMemoryBindInfo>(ptr, pImageOpaqueBinds, const VkSparseImageOpaqueMemoryBindInfo*getID() );
		     }
		   }
		 return this.pImageOpaqueBinds;
	 }

	/**
	 * Set method for field imageBindCount	[int]<br>
	 * Prototype: uint32_t  imageBindCount
	 * 
	 * @param imageBindCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkBindSparseInfo imageBindCount(int imageBindCount){
		 this.imageBindCount = imageBindCount;
		 setImageBindCount0(this.ptr,  imageBindCount);
		 return this;
	 }

	/**
	 * Get method for field imageBindCount	[int]<br>
	 * Prototype: uint32_t  imageBindCount
	 */ 
	 public int imageBindCount(){
		 int var = getImageBindCount0(super.ptr);
		 this.imageBindCount = var;
		 return this.imageBindCount;
	 }

	/**
	 * Set method for field pImageBinds	[vkstruct_array]<br>
	 * Prototype: const VkSparseImageMemoryBindInfo*  pImageBinds
	 * 
	 * @param pImageBinds - a instance of VkSparseImageMemoryBindInfo[].
	 * @return this VkStruct instance.
	 */ 
	 public VkBindSparseInfo pImageBinds(VkSparseImageMemoryBindInfo[] pImageBinds){
		 this.pImageBinds = pImageBinds;
		 this.pImageBindsBUFFER = new BigBuffer(pImageBinds, VkSparseImageMemoryBindInfo.getID());
		 setPImageBinds0(this.ptr, pImageBindsBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pImageBinds	[vkstruct_array]<br>
	 * Prototype: const VkSparseImageMemoryBindInfo*  pImageBinds
	 */ 
	 public VkSparseImageMemoryBindInfo[] pImageBinds(){
		 long ptr = getPImageBinds0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pImageBindsBUFFER != null && ptr == pImageBindsBUFFER.getBufferAddress()){ //same buffer 
		    pImageBindsBUFFER.update();
		  }else{
		     // wrap native structs 
		     int length = imageBindCount();
		     if(length > 0){
		        this.pImageBinds = new VkSparseImageMemoryBindInfo[length];
		        pImageBindsBUFFER = new BigBuffer<VkSparseImageMemoryBindInfo>(ptr, pImageBinds, const VkSparseImageMemoryBindInfo*getID() );
		     }
		   }
		 return this.pImageBinds;
	 }

	/**
	 * Set method for field signalSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  signalSemaphoreCount
	 * 
	 * @param signalSemaphoreCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkBindSparseInfo signalSemaphoreCount(int signalSemaphoreCount){
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
	 public VkBindSparseInfo pSignalSemaphores(VkSemaphore[] pSignalSemaphores){
		 this.pSignalSemaphores = pSignalSemaphores;
		 this.pSignalSemaphoresBUFFER = new BigBuffer(pSignalSemaphores, false);
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
         builder.append("VkBindSparseInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n waitSemaphoreCount: ")
				.append(waitSemaphoreCount() )
				.append(",\n pWaitSemaphores: ")
				.append(Arrays.toString(pWaitSemaphores()) )
				.append(",\n bufferBindCount: ")
				.append(bufferBindCount() )
				.append(",\n pBufferBinds: ")
				.append(Arrays.toString(pBufferBinds()) )
				.append(",\n imageOpaqueBindCount: ")
				.append(imageOpaqueBindCount() )
				.append(",\n pImageOpaqueBinds: ")
				.append(Arrays.toString(pImageOpaqueBinds()) )
				.append(",\n imageBindCount: ")
				.append(imageBindCount() )
				.append(",\n pImageBinds: ")
				.append(Arrays.toString(pImageBinds()) )
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
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 */

	/**
	 * Native SET method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 private static native void setWaitSemaphoreCount0(Buffer ptr, int _waitSemaphoreCount);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		 // code for simple past value 
		  vkObj->waitSemaphoreCount = (uint32_t) (_waitSemaphoreCount);
	  */

	/**
	 * Native GET method for field waitSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  waitSemaphoreCount
	 */ 
	 private static native int getWaitSemaphoreCount0(Buffer ptr);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  return (jint) (vkObj->waitSemaphoreCount);
	 */

	/**
	 * Native SET method for field pWaitSemaphores	[vkhandle_array]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 private static native void setPWaitSemaphores0(Buffer ptr, ByteBuffer  _pWaitSemaphores);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkSemaphore* p_pWaitSemaphores = ( VkSemaphore*) _pWaitSemaphores; 
		 vkObj->pWaitSemaphores = p_pWaitSemaphores; 
	  */

	/**
	 * Native GET method for field pWaitSemaphores	[vkhandle_array]<br>
	 * Prototype: const VkSemaphore*  pWaitSemaphores
	 */ 
	 private static native long getPWaitSemaphores0(Buffer ptr);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pWaitSemaphores );
	 */

	/**
	 * Native SET method for field bufferBindCount	[int]<br>
	 * Prototype: uint32_t  bufferBindCount
	 */ 
	 private static native void setBufferBindCount0(Buffer ptr, int _bufferBindCount);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		 // code for simple past value 
		  vkObj->bufferBindCount = (uint32_t) (_bufferBindCount);
	  */

	/**
	 * Native GET method for field bufferBindCount	[int]<br>
	 * Prototype: uint32_t  bufferBindCount
	 */ 
	 private static native int getBufferBindCount0(Buffer ptr);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  return (jint) (vkObj->bufferBindCount);
	 */

	/**
	 * Native SET method for field pBufferBinds	[vkstruct_array]<br>
	 * Prototype: const VkSparseBufferMemoryBindInfo*  pBufferBinds
	 */ 
	 private static native void setPBufferBinds0(Buffer ptr, java.nio.ByteBuffer  _pBufferBinds);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkSparseBufferMemoryBindInfo* p_pBufferBinds = ( VkSparseBufferMemoryBindInfo*) _pBufferBinds; 
		 vkObj->pBufferBinds = p_pBufferBinds; 
	  */

	/**
	 * Native GET method for field pBufferBinds	[vkstruct_array]<br>
	 * Prototype: const VkSparseBufferMemoryBindInfo*  pBufferBinds
	 */ 
	 private static native long getPBufferBinds0(Buffer ptr);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pBufferBinds );
	 */

	/**
	 * Native SET method for field imageOpaqueBindCount	[int]<br>
	 * Prototype: uint32_t  imageOpaqueBindCount
	 */ 
	 private static native void setImageOpaqueBindCount0(Buffer ptr, int _imageOpaqueBindCount);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		 // code for simple past value 
		  vkObj->imageOpaqueBindCount = (uint32_t) (_imageOpaqueBindCount);
	  */

	/**
	 * Native GET method for field imageOpaqueBindCount	[int]<br>
	 * Prototype: uint32_t  imageOpaqueBindCount
	 */ 
	 private static native int getImageOpaqueBindCount0(Buffer ptr);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  return (jint) (vkObj->imageOpaqueBindCount);
	 */

	/**
	 * Native SET method for field pImageOpaqueBinds	[vkstruct_array]<br>
	 * Prototype: const VkSparseImageOpaqueMemoryBindInfo*  pImageOpaqueBinds
	 */ 
	 private static native void setPImageOpaqueBinds0(Buffer ptr, java.nio.ByteBuffer  _pImageOpaqueBinds);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkSparseImageOpaqueMemoryBindInfo* p_pImageOpaqueBinds = ( VkSparseImageOpaqueMemoryBindInfo*) _pImageOpaqueBinds; 
		 vkObj->pImageOpaqueBinds = p_pImageOpaqueBinds; 
	  */

	/**
	 * Native GET method for field pImageOpaqueBinds	[vkstruct_array]<br>
	 * Prototype: const VkSparseImageOpaqueMemoryBindInfo*  pImageOpaqueBinds
	 */ 
	 private static native long getPImageOpaqueBinds0(Buffer ptr);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pImageOpaqueBinds );
	 */

	/**
	 * Native SET method for field imageBindCount	[int]<br>
	 * Prototype: uint32_t  imageBindCount
	 */ 
	 private static native void setImageBindCount0(Buffer ptr, int _imageBindCount);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		 // code for simple past value 
		  vkObj->imageBindCount = (uint32_t) (_imageBindCount);
	  */

	/**
	 * Native GET method for field imageBindCount	[int]<br>
	 * Prototype: uint32_t  imageBindCount
	 */ 
	 private static native int getImageBindCount0(Buffer ptr);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  return (jint) (vkObj->imageBindCount);
	 */

	/**
	 * Native SET method for field pImageBinds	[vkstruct_array]<br>
	 * Prototype: const VkSparseImageMemoryBindInfo*  pImageBinds
	 */ 
	 private static native void setPImageBinds0(Buffer ptr, java.nio.ByteBuffer  _pImageBinds);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkSparseImageMemoryBindInfo* p_pImageBinds = ( VkSparseImageMemoryBindInfo*) _pImageBinds; 
		 vkObj->pImageBinds = p_pImageBinds; 
	  */

	/**
	 * Native GET method for field pImageBinds	[vkstruct_array]<br>
	 * Prototype: const VkSparseImageMemoryBindInfo*  pImageBinds
	 */ 
	 private static native long getPImageBinds0(Buffer ptr);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pImageBinds );
	 */

	/**
	 * Native SET method for field signalSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 private static native void setSignalSemaphoreCount0(Buffer ptr, int _signalSemaphoreCount);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		 // code for simple past value 
		  vkObj->signalSemaphoreCount = (uint32_t) (_signalSemaphoreCount);
	  */

	/**
	 * Native GET method for field signalSemaphoreCount	[int]<br>
	 * Prototype: uint32_t  signalSemaphoreCount
	 */ 
	 private static native int getSignalSemaphoreCount0(Buffer ptr);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  return (jint) (vkObj->signalSemaphoreCount);
	 */

	/**
	 * Native SET method for field pSignalSemaphores	[vkhandle_array]<br>
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 private static native void setPSignalSemaphores0(Buffer ptr, ByteBuffer  _pSignalSemaphores);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkSemaphore* p_pSignalSemaphores = ( VkSemaphore*) _pSignalSemaphores; 
		 vkObj->pSignalSemaphores = p_pSignalSemaphores; 
	  */

	/**
	 * Native GET method for field pSignalSemaphores	[vkhandle_array]<br>
	 * Prototype: const VkSemaphore*  pSignalSemaphores
	 */ 
	 private static native long getPSignalSemaphores0(Buffer ptr);/*
		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pSignalSemaphores );
	 */



} // end of class VkBindSparseInfo
