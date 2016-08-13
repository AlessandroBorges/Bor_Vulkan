/**
 * Class wrapping Vulkan's VkSubpassDescription struct.
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
 *  This class is a Java front end for struct VkSubpassDescription. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSubpassDescription {
 *     VkSubpassDescriptionFlags       flags;
 *     VkPipelineBindPoint             pipelineBindPoint;
 *     uint32_t                        inputAttachmentCount;
 *     const VkAttachmentReference*    pInputAttachments;
 *     uint32_t                        colorAttachmentCount;
 *     const VkAttachmentReference*    pColorAttachments;
 *     const VkAttachmentReference*    pResolveAttachments;
 *     const VkAttachmentReference*    pDepthStencilAttachment;
 *     uint32_t                        preserveAttachmentCount;
 *     const uint32_t*                 pPreserveAttachments;
 * } VkSubpassDescription;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkSubpassDescription extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [83]  */
	 private static final String TAG = "VkSubpassDescription";

	/** ID of this structure [83]  */
	 public static final int TAG_ID = VKSUBPASSDESCRIPTION_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkSubpassDescriptionFlags 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  VkPipelineBindPoint 	pipelineBindPoint	[vkenum]
	 */ 
	VkPipelineBindPoint 	pipelineBindPoint;
	
	/**
	 *  uint32_t 	inputAttachmentCount	[int]
	 */ 
	int 	inputAttachmentCount;
	
	/**
	 *  const VkAttachmentReference* 	pInputAttachments	[vkstruct_array_array]
	 */ 
	  VkAttachmentReference[]  	pInputAttachments;
	 private BigBuffer 	 pInputAttachmentsBUFFER;
	
	/**
	 *  uint32_t 	colorAttachmentCount	[int]
	 */ 
	int 	colorAttachmentCount;
	
	/**
	 *  const VkAttachmentReference* 	pColorAttachments	[vkstruct_array_array]
	 */ 
	  VkAttachmentReference[]  	pColorAttachments;
	 private BigBuffer 	 pColorAttachmentsBUFFER;
	
	/**
	 *  const VkAttachmentReference* 	pResolveAttachments	[vkstruct_array_array]
	 */ 
	  VkAttachmentReference[]  	pResolveAttachments;
	 private BigBuffer 	 pResolveAttachmentsBUFFER;
	
	/**
	 *  const VkAttachmentReference* 	pDepthStencilAttachment	[vkstruct]
	 */ 
	VkAttachmentReference  	pDepthStencilAttachment;
	
	/**
	 *  uint32_t 	preserveAttachmentCount	[int]
	 */ 
	int 	preserveAttachmentCount;
	
	/**
	 *  const uint32_t* 	pPreserveAttachments	[int_array]
	 */ 
	int[] 	pPreserveAttachments;
	/**
	 * Ctor
	 */
	public VkSubpassDescription(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSubpassDescription(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkSubpassDescription(long address){ 
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
	 * Set method for field flags	[int]<br>
	 * Prototype: VkSubpassDescriptionFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSubpassDescription flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkSubpassDescriptionFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field pipelineBindPoint	[vkenum]<br>
	 * Prototype: VkPipelineBindPoint  pipelineBindPoint
	 * 
	 * @param pipelineBindPoint - a instance of VkPipelineBindPoint.
	 * @return this VkStruct instance.
	 */ 
	 public VkSubpassDescription pipelineBindPoint(VkPipelineBindPoint pipelineBindPoint){
		 this.pipelineBindPoint = pipelineBindPoint;
		 int enumVal = pipelineBindPoint.getValue();
		 setPipelineBindPoint0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field pipelineBindPoint	[vkenum]<br>
	 * Prototype: VkPipelineBindPoint  pipelineBindPoint
	 */ 
	 public VkPipelineBindPoint pipelineBindPoint(){
		 int nativeVal = getPipelineBindPoint0(super.ptr);
		 this.pipelineBindPoint = VkPipelineBindPoint.fromValue(nativeVal); 
		 return this.pipelineBindPoint;
	 }

	/**
	 * Set method for field inputAttachmentCount	[int]<br>
	 * Prototype: uint32_t  inputAttachmentCount
	 * 
	 * @param inputAttachmentCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSubpassDescription inputAttachmentCount(int inputAttachmentCount){
		 this.inputAttachmentCount = inputAttachmentCount;
		 setInputAttachmentCount0(this.ptr,  inputAttachmentCount);
		 return this;
	 }

	/**
	 * Get method for field inputAttachmentCount	[int]<br>
	 * Prototype: uint32_t  inputAttachmentCount
	 */ 
	 public int inputAttachmentCount(){
		 int var = getInputAttachmentCount0(super.ptr);
		 this.inputAttachmentCount = var;
		 return this.inputAttachmentCount;
	 }

	/**
	 * Set method for field pInputAttachments	[vkstruct_array]<br>
	 * Prototype: const VkAttachmentReference*  pInputAttachments
	 * 
	 * @param pInputAttachments - a instance of VkAttachmentReference[].
	 * @return this VkStruct instance.
	 */ 
	 public VkSubpassDescription pInputAttachments(VkAttachmentReference[] pInputAttachments){
		 this.pInputAttachments = pInputAttachments;
		 this.pInputAttachmentsBUFFER = new BigBuffer(pInputAttachments, VkAttachmentReference.getID());
		 setPInputAttachments0(this.ptr, pInputAttachmentsBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pInputAttachments	[vkstruct_array]<br>
	 * Prototype: const VkAttachmentReference*  pInputAttachments
	 */ 
	 public VkAttachmentReference[] pInputAttachments(){
		 long ptr = getPInputAttachments0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pInputAttachmentsBUFFER != null && ptr == pInputAttachmentsBUFFER.getBufferAddress()){ //same buffer 
		    pInputAttachmentsBUFFER.update();
		    return pInputAttachments;
		  }else{
		     (new UnsupportedOperationException("There is no VKStruct[] for backup.")).printStackTrace();
		   }
		 return this.pInputAttachments;
	 }

	/**
	 * Set method for field colorAttachmentCount	[int]<br>
	 * Prototype: uint32_t  colorAttachmentCount
	 * 
	 * @param colorAttachmentCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSubpassDescription colorAttachmentCount(int colorAttachmentCount){
		 this.colorAttachmentCount = colorAttachmentCount;
		 setColorAttachmentCount0(this.ptr,  colorAttachmentCount);
		 return this;
	 }

	/**
	 * Get method for field colorAttachmentCount	[int]<br>
	 * Prototype: uint32_t  colorAttachmentCount
	 */ 
	 public int colorAttachmentCount(){
		 int var = getColorAttachmentCount0(super.ptr);
		 this.colorAttachmentCount = var;
		 return this.colorAttachmentCount;
	 }

	/**
	 * Set method for field pColorAttachments	[vkstruct_array]<br>
	 * Prototype: const VkAttachmentReference*  pColorAttachments
	 * 
	 * @param pColorAttachments - a instance of VkAttachmentReference[].
	 * @return this VkStruct instance.
	 */ 
	 public VkSubpassDescription pColorAttachments(VkAttachmentReference[] pColorAttachments){
		 this.pColorAttachments = pColorAttachments;
		 this.pColorAttachmentsBUFFER = new BigBuffer(pColorAttachments, VkAttachmentReference.getID());
		 setPColorAttachments0(this.ptr, pColorAttachmentsBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pColorAttachments	[vkstruct_array]<br>
	 * Prototype: const VkAttachmentReference*  pColorAttachments
	 */ 
	 public VkAttachmentReference[] pColorAttachments(){
		 long ptr = getPColorAttachments0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pColorAttachmentsBUFFER != null && ptr == pColorAttachmentsBUFFER.getBufferAddress()){ //same buffer 
		    pColorAttachmentsBUFFER.update();
		    return pColorAttachments;
		  }else{
		     (new UnsupportedOperationException("There is no VKStruct[] for backup.")).printStackTrace();
		   }
		 return this.pColorAttachments;
	 }

	/**
	 * Set method for field pResolveAttachments	[vkstruct_array]<br>
	 * Prototype: const VkAttachmentReference*  pResolveAttachments
	 * 
	 * @param pResolveAttachments - a instance of VkAttachmentReference[].
	 * @return this VkStruct instance.
	 */ 
	 public VkSubpassDescription pResolveAttachments(VkAttachmentReference[] pResolveAttachments){
		 this.pResolveAttachments = pResolveAttachments;
		 this.pResolveAttachmentsBUFFER = new BigBuffer(pResolveAttachments, VkAttachmentReference.getID());
		 setPResolveAttachments0(this.ptr, pResolveAttachmentsBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pResolveAttachments	[vkstruct_array]<br>
	 * Prototype: const VkAttachmentReference*  pResolveAttachments
	 */ 
	 public VkAttachmentReference[] pResolveAttachments(){
		 long ptr = getPResolveAttachments0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pResolveAttachmentsBUFFER != null && ptr == pResolveAttachmentsBUFFER.getBufferAddress()){ //same buffer 
		    pResolveAttachmentsBUFFER.update();
		    return pResolveAttachments;
		  }else{
		     (new UnsupportedOperationException("There is no VKStruct[] for backup.")).printStackTrace();
		   }
		 return this.pResolveAttachments;
	 }

	/**
	 * Set method for field pDepthStencilAttachment	[vkstruct]<br>
	 * Prototype: const VkAttachmentReference*  pDepthStencilAttachment
	 * 
	 * @param pDepthStencilAttachment - a instance of VkAttachmentReference.
	 * @return this VkStruct instance.
	 */ 
	 public VkSubpassDescription pDepthStencilAttachment(VkAttachmentReference pDepthStencilAttachment){
		 this.pDepthStencilAttachment = pDepthStencilAttachment;
		 ByteBuffer buff = (pDepthStencilAttachment==null) ? null : pDepthStencilAttachment.getPointer();
		 setPDepthStencilAttachment0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field pDepthStencilAttachment	[vkstruct]<br>
	 * Prototype: const VkAttachmentReference*  pDepthStencilAttachment
	 */ 
	 public VkAttachmentReference pDepthStencilAttachment(){
		 long pointer = getPDepthStencilAttachment0(super.ptr);
		 if(pointer == 0){
		    this.pDepthStencilAttachment = null;
		    return null;
		  } 

		 if(this.pDepthStencilAttachment == null){
		    this.pDepthStencilAttachment = new VkAttachmentReference(pointer);
		 }else{
		    this.pDepthStencilAttachment.setPointer(pointer);
		  }
		 return this.pDepthStencilAttachment;
	 }

	/**
	 * Set method for field preserveAttachmentCount	[int]<br>
	 * Prototype: uint32_t  preserveAttachmentCount
	 * 
	 * @param preserveAttachmentCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSubpassDescription preserveAttachmentCount(int preserveAttachmentCount){
		 this.preserveAttachmentCount = preserveAttachmentCount;
		 setPreserveAttachmentCount0(this.ptr,  preserveAttachmentCount);
		 return this;
	 }

	/**
	 * Get method for field preserveAttachmentCount	[int]<br>
	 * Prototype: uint32_t  preserveAttachmentCount
	 */ 
	 public int preserveAttachmentCount(){
		 int var = getPreserveAttachmentCount0(super.ptr);
		 this.preserveAttachmentCount = var;
		 return this.preserveAttachmentCount;
	 }

	/**
	 * Set method for field pPreserveAttachments	[int]<br>
	 * Prototype: const uint32_t*  pPreserveAttachments
	 * 
	 * @param pPreserveAttachments - a instance of int[].
	 * @return this VkStruct instance.
	 */ 
	 public VkSubpassDescription pPreserveAttachments(int[] pPreserveAttachments){
		 this.pPreserveAttachments = pPreserveAttachments;
		 setPPreserveAttachments0(this.ptr,  pPreserveAttachments);
		 return this;
	 }

	/**
	 * Get method for field pPreserveAttachments	[int]<br>
	 * Prototype: const uint32_t*  pPreserveAttachments
	 */ 
	 public int[] pPreserveAttachments(){
		 int[] var = getPPreserveAttachments0(super.ptr, pPreserveAttachments);
		 this.pPreserveAttachments = var;
		 return this.pPreserveAttachments;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkSubpassDescription [ ")
				.append("flags: ").append(flags() )
				.append(",\n pipelineBindPoint: ")
				.append(pipelineBindPoint() )
				.append(",\n inputAttachmentCount: ")
				.append(inputAttachmentCount() )
				.append(",\n pInputAttachments: ")
				.append(Arrays.toString(pInputAttachments()) )
				.append(",\n colorAttachmentCount: ")
				.append(colorAttachmentCount() )
				.append(",\n pColorAttachments: ")
				.append(Arrays.toString(pColorAttachments()) )
				.append(",\n pResolveAttachments: ")
				.append(Arrays.toString(pResolveAttachments()) )
				.append(",\n pDepthStencilAttachment: ")
				.append(pDepthStencilAttachment() )
				.append(",\n preserveAttachmentCount: ")
				.append(preserveAttachmentCount() )
				.append(",\n pPreserveAttachments: ")
				.append(Arrays.toString(pPreserveAttachments()) )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkSubpassDescriptionFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkSubpassDescriptionFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkSubpassDescriptionFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field pipelineBindPoint	[vkenum]<br>
	 * Prototype: VkPipelineBindPoint  pipelineBindPoint
	 */ 
	 private static native void setPipelineBindPoint0(Buffer ptr, int  _pipelineBindPoint);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		 // code for simple past value 
		  vkObj->pipelineBindPoint = (VkPipelineBindPoint) (_pipelineBindPoint);
	  */

	/**
	 * Native GET method for field pipelineBindPoint	[vkenum]<br>
	 * Prototype: VkPipelineBindPoint  pipelineBindPoint
	 */ 
	 private static native int getPipelineBindPoint0(Buffer ptr);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->pipelineBindPoint);
	 */

	/**
	 * Native SET method for field inputAttachmentCount	[int]<br>
	 * Prototype: uint32_t  inputAttachmentCount
	 */ 
	 private static native void setInputAttachmentCount0(Buffer ptr, int _inputAttachmentCount);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		 // code for simple past value 
		  vkObj->inputAttachmentCount = (uint32_t) (_inputAttachmentCount);
	  */

	/**
	 * Native GET method for field inputAttachmentCount	[int]<br>
	 * Prototype: uint32_t  inputAttachmentCount
	 */ 
	 private static native int getInputAttachmentCount0(Buffer ptr);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  return (jint) (vkObj->inputAttachmentCount);
	 */

	/**
	 * Native SET method for field pInputAttachments	[vkstruct_array]<br>
	 * Prototype: const VkAttachmentReference*  pInputAttachments
	 */ 
	 private static native void setPInputAttachments0(Buffer ptr, java.nio.ByteBuffer  _pInputAttachments);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkAttachmentReference* p_pInputAttachments = ( VkAttachmentReference*) _pInputAttachments; 
		 vkObj->pInputAttachments = p_pInputAttachments; 
	  */

	/**
	 * Native GET method for field pInputAttachments	[vkstruct_array]<br>
	 * Prototype: const VkAttachmentReference*  pInputAttachments
	 */ 
	 private static native long getPInputAttachments0(Buffer ptr);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pInputAttachments );
	 */

	/**
	 * Native SET method for field colorAttachmentCount	[int]<br>
	 * Prototype: uint32_t  colorAttachmentCount
	 */ 
	 private static native void setColorAttachmentCount0(Buffer ptr, int _colorAttachmentCount);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		 // code for simple past value 
		  vkObj->colorAttachmentCount = (uint32_t) (_colorAttachmentCount);
	  */

	/**
	 * Native GET method for field colorAttachmentCount	[int]<br>
	 * Prototype: uint32_t  colorAttachmentCount
	 */ 
	 private static native int getColorAttachmentCount0(Buffer ptr);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  return (jint) (vkObj->colorAttachmentCount);
	 */

	/**
	 * Native SET method for field pColorAttachments	[vkstruct_array]<br>
	 * Prototype: const VkAttachmentReference*  pColorAttachments
	 */ 
	 private static native void setPColorAttachments0(Buffer ptr, java.nio.ByteBuffer  _pColorAttachments);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkAttachmentReference* p_pColorAttachments = ( VkAttachmentReference*) _pColorAttachments; 
		 vkObj->pColorAttachments = p_pColorAttachments; 
	  */

	/**
	 * Native GET method for field pColorAttachments	[vkstruct_array]<br>
	 * Prototype: const VkAttachmentReference*  pColorAttachments
	 */ 
	 private static native long getPColorAttachments0(Buffer ptr);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pColorAttachments );
	 */

	/**
	 * Native SET method for field pResolveAttachments	[vkstruct_array]<br>
	 * Prototype: const VkAttachmentReference*  pResolveAttachments
	 */ 
	 private static native void setPResolveAttachments0(Buffer ptr, java.nio.ByteBuffer  _pResolveAttachments);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkAttachmentReference* p_pResolveAttachments = ( VkAttachmentReference*) _pResolveAttachments; 
		 vkObj->pResolveAttachments = p_pResolveAttachments; 
	  */

	/**
	 * Native GET method for field pResolveAttachments	[vkstruct_array]<br>
	 * Prototype: const VkAttachmentReference*  pResolveAttachments
	 */ 
	 private static native long getPResolveAttachments0(Buffer ptr);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pResolveAttachments );
	 */

	/**
	 * Native SET method for field pDepthStencilAttachment	[vkstruct]<br>
	 * Prototype: const VkAttachmentReference*  pDepthStencilAttachment
	 */ 
	 private static native void setPDepthStencilAttachment0(Buffer ptr, java.nio.ByteBuffer  _pDepthStencilAttachment);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkAttachmentReference* p_pDepthStencilAttachment = ( VkAttachmentReference*) _pDepthStencilAttachment; 
		 vkObj->pDepthStencilAttachment = p_pDepthStencilAttachment; 
	  */

	/**
	 * Native GET method for field pDepthStencilAttachment	[vkstruct]<br>
	 * Prototype: const VkAttachmentReference*  pDepthStencilAttachment
	 */ 
	 private static native long getPDepthStencilAttachment0(Buffer ptr);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pDepthStencilAttachment);
	 */

	/**
	 * Native SET method for field preserveAttachmentCount	[int]<br>
	 * Prototype: uint32_t  preserveAttachmentCount
	 */ 
	 private static native void setPreserveAttachmentCount0(Buffer ptr, int _preserveAttachmentCount);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		 // code for simple past value 
		  vkObj->preserveAttachmentCount = (uint32_t) (_preserveAttachmentCount);
	  */

	/**
	 * Native GET method for field preserveAttachmentCount	[int]<br>
	 * Prototype: uint32_t  preserveAttachmentCount
	 */ 
	 private static native int getPreserveAttachmentCount0(Buffer ptr);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  return (jint) (vkObj->preserveAttachmentCount);
	 */

	/**
	 * Native SET method for field pPreserveAttachments	[int]<br>
	 * Prototype: const uint32_t*  pPreserveAttachments
	 */ 
	 private static native void setPPreserveAttachments0(Buffer ptr, int[] _pPreserveAttachments);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		 // code for generic array assignment 
		 uint32_t* temp = const_cast<uint32_t*>(vkObj->pPreserveAttachments);
		 if(temp) { free(temp); } 
		 vkObj->pPreserveAttachments = NULL; 
		 if( _pPreserveAttachments == NULL){ 
		    vkObj->preserveAttachmentCount = 0; 
		     return;
		  }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pPreserveAttachments); 
		  temp = CALLOC(count, uint32_t); 
		  memcpy( temp, _pPreserveAttachments, count * sizeof(uint32_t)); 
		  vkObj->pPreserveAttachments = temp; 
		  vkObj->preserveAttachmentCount = count;
	  */

	/**
	 * Native GET method for field pPreserveAttachments	[int]<br>
	 * Prototype: const uint32_t*  pPreserveAttachments
	 */ 
	 private static native int[] getPPreserveAttachments0(Buffer ptr, int[] _pPreserveAttachments);/*
		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  // generic get for C type array, with content copy 
		  if( 0 == vkObj->preserveAttachmentCount){ 
		     return NULL;
		   }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pPreserveAttachments);
		  if(vkObj->pPreserveAttachments == NULL){
		    return NULL;
		   }
 		  memcpy(_pPreserveAttachments, vkObj->pPreserveAttachments, count * sizeof(uint32_t));
		  return obj__pPreserveAttachments;
	 */



} // end of class VkSubpassDescription
