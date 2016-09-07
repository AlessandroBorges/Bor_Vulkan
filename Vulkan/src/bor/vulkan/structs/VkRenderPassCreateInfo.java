/**
 * Class wrapping Vulkan's VkRenderPassCreateInfo struct.
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
 *  This class is a Java front end for struct VkRenderPassCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkRenderPassCreateInfo {
 *     VkStructureType                   sType;
 *     const void*                       pNext;
 *     VkRenderPassCreateFlags           flags;
 *     uint32_t                          attachmentCount;
 *     const VkAttachmentDescription*    pAttachments;
 *     uint32_t                          subpassCount;
 *     const VkSubpassDescription*       pSubpasses;
 *     uint32_t                          dependencyCount;
 *     const VkSubpassDependency*        pDependencies;
 * } VkRenderPassCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkRenderPassCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [85]  */
	 private static final String TAG = "VkRenderPassCreateInfo";

	/** ID of this structure [85]  */
	 public static final int TAG_ID = VKRENDERPASSCREATEINFO_ID;

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
	 *  VkRenderPassCreateFlags 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  uint32_t 	attachmentCount	[int]
	 */ 
	int 	attachmentCount;
	
	/**
	 *  const VkAttachmentDescription* 	pAttachments	[vkstruct_array_array]
	 */ 
	VkAttachmentDescription[]  	pAttachments;
	 private BigBuffer 	 pAttachmentsBUFFER;
	
	/**
	 *  uint32_t 	subpassCount	[int]
	 */ 
	int 	subpassCount;
	
	/**
	 *  const VkSubpassDescription* 	pSubpasses	[vkstruct_array_array]
	 */ 
	VkSubpassDescription[]  	pSubpasses;
	 private BigBuffer 	 pSubpassesBUFFER;
	
	/**
	 *  uint32_t 	dependencyCount	[int]
	 */ 
	int 	dependencyCount;
	
	/**
	 *  const VkSubpassDependency* 	pDependencies	[vkstruct_array_array]
	 */ 
	VkSubpassDependency[]  	pDependencies;
	 private BigBuffer 	 pDependenciesBUFFER;
	/**
	 * Ctor
	 */
	public VkRenderPassCreateInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkRenderPassCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkRenderPassCreateInfo(long address){ 
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
	 public static VkArray<VkRenderPassCreateInfo> createVkArray(int size){ 
		 VkRenderPassCreateInfo[] array = new VkRenderPassCreateInfo[size]; 
		 VkArrayStruct<VkRenderPassCreateInfo> vkArray = new VkArrayStruct<VkRenderPassCreateInfo>(array, TAG_ID);
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
	 public VkRenderPassCreateInfo sType(VkStructureType sType){
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
	 public VkRenderPassCreateInfo pNext(VkObject pNext){
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
	 * Prototype: VkRenderPassCreateFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkRenderPassCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkRenderPassCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 * 
	 * @param attachmentCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkRenderPassCreateInfo attachmentCount(int attachmentCount){
		 this.attachmentCount = attachmentCount;
		 setAttachmentCount0(this.ptr,  attachmentCount);
		 return this;
	 }

	/**
	 * Get method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 public int attachmentCount(){
		 int var = getAttachmentCount0(super.ptr);
		 this.attachmentCount = var;
		 return this.attachmentCount;
	 }

	/**
	 * Set method for field pAttachments	[vkstruct_array]<br>
	 * Prototype: const VkAttachmentDescription*  pAttachments
	 * 
	 * @param pAttachments - a instance of VkAttachmentDescription[].
	 * @return this VkStruct instance.
	 */ 
	 public VkRenderPassCreateInfo pAttachments(VkAttachmentDescription[] pAttachments){
		 this.pAttachments = pAttachments;
		 this.pAttachmentsBUFFER = new BigBuffer(pAttachments, VkAttachmentDescription.getID());
		 setPAttachments0(this.ptr, pAttachmentsBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pAttachments	[vkstruct_array]<br>
	 * Prototype: const VkAttachmentDescription*  pAttachments
	 */ 
	 public VkAttachmentDescription[] pAttachments(){
		 long ptr = getPAttachments0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pAttachmentsBUFFER != null && ptr == pAttachmentsBUFFER.getBufferAddress()){ //same buffer 
		    pAttachmentsBUFFER.update();
		  }else{
		     // wrap native structs 
		     int length = attachmentCount();
		     if(length > 0){
		        this.pAttachments = new VkAttachmentDescription[length];
		        pAttachmentsBUFFER = new BigBuffer<VkAttachmentDescription>(ptr, pAttachments, VkAttachmentDescription.getID() );
		     }
		   }
		 return this.pAttachments;
	 }

	/**
	 * Set method for field subpassCount	[int]<br>
	 * Prototype: uint32_t  subpassCount
	 * 
	 * @param subpassCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkRenderPassCreateInfo subpassCount(int subpassCount){
		 this.subpassCount = subpassCount;
		 setSubpassCount0(this.ptr,  subpassCount);
		 return this;
	 }

	/**
	 * Get method for field subpassCount	[int]<br>
	 * Prototype: uint32_t  subpassCount
	 */ 
	 public int subpassCount(){
		 int var = getSubpassCount0(super.ptr);
		 this.subpassCount = var;
		 return this.subpassCount;
	 }

	/**
	 * Set method for field pSubpasses	[vkstruct_array]<br>
	 * Prototype: const VkSubpassDescription*  pSubpasses
	 * 
	 * @param pSubpasses - a instance of VkSubpassDescription[].
	 * @return this VkStruct instance.
	 */ 
	 public VkRenderPassCreateInfo pSubpasses(VkSubpassDescription[] pSubpasses){
		 this.pSubpasses = pSubpasses;
		 this.pSubpassesBUFFER = new BigBuffer(pSubpasses, VkSubpassDescription.getID());
		 setPSubpasses0(this.ptr, pSubpassesBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pSubpasses	[vkstruct_array]<br>
	 * Prototype: const VkSubpassDescription*  pSubpasses
	 */ 
	 public VkSubpassDescription[] pSubpasses(){
		 long ptr = getPSubpasses0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pSubpassesBUFFER != null && ptr == pSubpassesBUFFER.getBufferAddress()){ //same buffer 
		    pSubpassesBUFFER.update();
		  }else{
		     // wrap native structs 
		     int length = subpassCount();
		     if(length > 0){
		        this.pSubpasses = new VkSubpassDescription[length];
		        pSubpassesBUFFER = new BigBuffer<VkSubpassDescription>(ptr, pSubpasses, VkSubpassDescription.getID() );
		     }
		   }
		 return this.pSubpasses;
	 }

	/**
	 * Set method for field dependencyCount	[int]<br>
	 * Prototype: uint32_t  dependencyCount
	 * 
	 * @param dependencyCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkRenderPassCreateInfo dependencyCount(int dependencyCount){
		 this.dependencyCount = dependencyCount;
		 setDependencyCount0(this.ptr,  dependencyCount);
		 return this;
	 }

	/**
	 * Get method for field dependencyCount	[int]<br>
	 * Prototype: uint32_t  dependencyCount
	 */ 
	 public int dependencyCount(){
		 int var = getDependencyCount0(super.ptr);
		 this.dependencyCount = var;
		 return this.dependencyCount;
	 }

	/**
	 * Set method for field pDependencies	[vkstruct_array]<br>
	 * Prototype: const VkSubpassDependency*  pDependencies
	 * 
	 * @param pDependencies - a instance of VkSubpassDependency[].
	 * @return this VkStruct instance.
	 */ 
	 public VkRenderPassCreateInfo pDependencies(VkSubpassDependency[] pDependencies){
		 this.pDependencies = pDependencies;
		 this.pDependenciesBUFFER = new BigBuffer(pDependencies, VkSubpassDependency.getID());
		 setPDependencies0(this.ptr, pDependenciesBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pDependencies	[vkstruct_array]<br>
	 * Prototype: const VkSubpassDependency*  pDependencies
	 */ 
	 public VkSubpassDependency[] pDependencies(){
		 long ptr = getPDependencies0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pDependenciesBUFFER != null && ptr == pDependenciesBUFFER.getBufferAddress()){ //same buffer 
		    pDependenciesBUFFER.update();
		  }else{
		     // wrap native structs 
		     int length = dependencyCount();
		     if(length > 0){
		        this.pDependencies = new VkSubpassDependency[length];
		        pDependenciesBUFFER = new BigBuffer<VkSubpassDependency>(ptr, pDependencies, VkSubpassDependency.getID() );
		     }
		   }
		 return this.pDependencies;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkRenderPassCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n attachmentCount: ")
				.append(attachmentCount() )
				.append(",\n pAttachments: ")
				.append(Arrays.toString(pAttachments()) )
				.append(",\n subpassCount: ")
				.append(subpassCount() )
				.append(",\n pSubpasses: ")
				.append(Arrays.toString(pSubpasses()) )
				.append(",\n dependencyCount: ")
				.append(dependencyCount() )
				.append(",\n pDependencies: ")
				.append(Arrays.toString(pDependencies()) )
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
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkRenderPassCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkRenderPassCreateFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkRenderPassCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 private static native void setAttachmentCount0(Buffer ptr, int _attachmentCount);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->attachmentCount = (uint32_t) (_attachmentCount);
	  */

	/**
	 * Native GET method for field attachmentCount	[int]<br>
	 * Prototype: uint32_t  attachmentCount
	 */ 
	 private static native int getAttachmentCount0(Buffer ptr);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  return (jint) (vkObj->attachmentCount);
	 */

	/**
	 * Native SET method for field pAttachments	[vkstruct_array]<br>
	 * Prototype: const VkAttachmentDescription*  pAttachments
	 */ 
	 private static native void setPAttachments0(Buffer ptr, java.nio.ByteBuffer  _pAttachments);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkAttachmentDescription* p_pAttachments = ( VkAttachmentDescription*) _pAttachments; 
		 vkObj->pAttachments = p_pAttachments; 
	  */

	/**
	 * Native GET method for field pAttachments	[vkstruct_array]<br>
	 * Prototype: const VkAttachmentDescription*  pAttachments
	 */ 
	 private static native long getPAttachments0(Buffer ptr);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pAttachments );
	 */

	/**
	 * Native SET method for field subpassCount	[int]<br>
	 * Prototype: uint32_t  subpassCount
	 */ 
	 private static native void setSubpassCount0(Buffer ptr, int _subpassCount);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->subpassCount = (uint32_t) (_subpassCount);
	  */

	/**
	 * Native GET method for field subpassCount	[int]<br>
	 * Prototype: uint32_t  subpassCount
	 */ 
	 private static native int getSubpassCount0(Buffer ptr);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  return (jint) (vkObj->subpassCount);
	 */

	/**
	 * Native SET method for field pSubpasses	[vkstruct_array]<br>
	 * Prototype: const VkSubpassDescription*  pSubpasses
	 */ 
	 private static native void setPSubpasses0(Buffer ptr, java.nio.ByteBuffer  _pSubpasses);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkSubpassDescription* p_pSubpasses = ( VkSubpassDescription*) _pSubpasses; 
		 vkObj->pSubpasses = p_pSubpasses; 
	  */

	/**
	 * Native GET method for field pSubpasses	[vkstruct_array]<br>
	 * Prototype: const VkSubpassDescription*  pSubpasses
	 */ 
	 private static native long getPSubpasses0(Buffer ptr);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pSubpasses );
	 */

	/**
	 * Native SET method for field dependencyCount	[int]<br>
	 * Prototype: uint32_t  dependencyCount
	 */ 
	 private static native void setDependencyCount0(Buffer ptr, int _dependencyCount);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->dependencyCount = (uint32_t) (_dependencyCount);
	  */

	/**
	 * Native GET method for field dependencyCount	[int]<br>
	 * Prototype: uint32_t  dependencyCount
	 */ 
	 private static native int getDependencyCount0(Buffer ptr);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  return (jint) (vkObj->dependencyCount);
	 */

	/**
	 * Native SET method for field pDependencies	[vkstruct_array]<br>
	 * Prototype: const VkSubpassDependency*  pDependencies
	 */ 
	 private static native void setPDependencies0(Buffer ptr, java.nio.ByteBuffer  _pDependencies);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkSubpassDependency* p_pDependencies = ( VkSubpassDependency*) _pDependencies; 
		 vkObj->pDependencies = p_pDependencies; 
	  */

	/**
	 * Native GET method for field pDependencies	[vkstruct_array]<br>
	 * Prototype: const VkSubpassDependency*  pDependencies
	 */ 
	 private static native long getPDependencies0(Buffer ptr);/*
		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pDependencies );
	 */



} // end of class VkRenderPassCreateInfo
