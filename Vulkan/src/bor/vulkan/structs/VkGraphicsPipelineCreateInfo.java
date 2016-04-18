/**
 * Class wrapping Vulkan's VkGraphicsPipelineCreateInfo struct.
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
 *  This class is a Java front end for struct VkGraphicsPipelineCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkGraphicsPipelineCreateInfo {
 *     VkStructureType                                  sType;
 *     const void*                                      pNext;
 *     VkPipelineCreateFlags                            flags;
 *     uint32_t                                         stageCount;
 *     const VkPipelineShaderStageCreateInfo*           pStages;
 *     const VkPipelineVertexInputStateCreateInfo*      pVertexInputState;
 *     const VkPipelineInputAssemblyStateCreateInfo*    pInputAssemblyState;
 *     const VkPipelineTessellationStateCreateInfo*     pTessellationState;
 *     const VkPipelineViewportStateCreateInfo*         pViewportState;
 *     const VkPipelineRasterizationStateCreateInfo*    pRasterizationState;
 *     const VkPipelineMultisampleStateCreateInfo*      pMultisampleState;
 *     const VkPipelineDepthStencilStateCreateInfo*     pDepthStencilState;
 *     const VkPipelineColorBlendStateCreateInfo*       pColorBlendState;
 *     const VkPipelineDynamicStateCreateInfo*          pDynamicState;
 *     VkPipelineLayout                                 layout;
 *     VkRenderPass                                     renderPass;
 *     uint32_t                                         subpass;
 *     VkPipeline                                       basePipelineHandle;
 *     int32_t                                          basePipelineIndex;
 * } VkGraphicsPipelineCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkGraphicsPipelineCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [66]  */
	 private static final String TAG = "VkGraphicsPipelineCreateInfo";

	/** ID of this structure [66]  */
	 public static final int TAG_ID = VKGRAPHICSPIPELINECREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkGraphicsPipelineCreateInfo> p;

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
	 *  VkPipelineCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  uint32_t 	stageCount	[int]
	 */ 
	 int 	stageCount;

	/**
	 *  const VkPipelineShaderStageCreateInfo* 	pStages	[vkstruct]
	 */ 
	  VkPipelineShaderStageCreateInfo  	pStages;

	/**
	 *  const VkPipelineVertexInputStateCreateInfo* 	pVertexInputState	[vkstruct]
	 */ 
	  VkPipelineVertexInputStateCreateInfo  	pVertexInputState;

	/**
	 *  const VkPipelineInputAssemblyStateCreateInfo* 	pInputAssemblyState	[vkstruct]
	 */ 
	  VkPipelineInputAssemblyStateCreateInfo  	pInputAssemblyState;

	/**
	 *  const VkPipelineTessellationStateCreateInfo* 	pTessellationState	[vkstruct]
	 */ 
	  VkPipelineTessellationStateCreateInfo  	pTessellationState;

	/**
	 *  const VkPipelineViewportStateCreateInfo* 	pViewportState	[vkstruct]
	 */ 
	  VkPipelineViewportStateCreateInfo  	pViewportState;

	/**
	 *  const VkPipelineRasterizationStateCreateInfo* 	pRasterizationState	[vkstruct]
	 */ 
	  VkPipelineRasterizationStateCreateInfo  	pRasterizationState;

	/**
	 *  const VkPipelineMultisampleStateCreateInfo* 	pMultisampleState	[vkstruct]
	 */ 
	  VkPipelineMultisampleStateCreateInfo  	pMultisampleState;

	/**
	 *  const VkPipelineDepthStencilStateCreateInfo* 	pDepthStencilState	[vkstruct]
	 */ 
	  VkPipelineDepthStencilStateCreateInfo  	pDepthStencilState;

	/**
	 *  const VkPipelineColorBlendStateCreateInfo* 	pColorBlendState	[vkstruct]
	 */ 
	  VkPipelineColorBlendStateCreateInfo  	pColorBlendState;

	/**
	 *  const VkPipelineDynamicStateCreateInfo* 	pDynamicState	[vkstruct]
	 */ 
	  VkPipelineDynamicStateCreateInfo  	pDynamicState;

	/**
	 *  VkPipelineLayout 	layout	[vkhandle]
	 */ 
	 VkPipelineLayout 	layout;

	/**
	 *  VkRenderPass 	renderPass	[vkhandle]
	 */ 
	 VkRenderPass 	renderPass;

	/**
	 *  uint32_t 	subpass	[int]
	 */ 
	 int 	subpass;

	/**
	 *  VkPipeline 	basePipelineHandle	[vkhandle]
	 */ 
	 VkPipeline 	basePipelineHandle;

	/**
	 *  int32_t 	basePipelineIndex	[int]
	 */ 
	 int 	basePipelineIndex;

	/**
	 * Ctor
	 */
	public VkGraphicsPipelineCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkGraphicsPipelineCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkGraphicsPipelineCreateInfo(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkGraphicsPipelineCreateInfo(long address){ 
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
	 public static P<VkGraphicsPipelineCreateInfo> createNullPointer(){
	        P<VkGraphicsPipelineCreateInfo> p = new  P<VkGraphicsPipelineCreateInfo>(new VkGraphicsPipelineCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkGraphicsPipelineCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkGraphicsPipelineCreateInfo> (this);
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
	 * Prototype: VkPipelineCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkPipelineCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field stageCount	[int]<br>
	 * Prototype: uint32_t  stageCount
	 */ 
	 public void stageCount(int stageCount){
		 this.stageCount = stageCount;
		 setStageCount0(this.ptr,  stageCount);
	 }

	/**
	 * Get method for field stageCount	[int]<br>
	 * Prototype: uint32_t  stageCount
	 */ 
	 public int stageCount(){
		 int var = getStageCount0(super.ptr);
		 this.stageCount = var;
		 return this.stageCount;
	 }

	/**
	 * Set method for field pStages	[vkstruct]<br>
	 * Prototype: const VkPipelineShaderStageCreateInfo*  pStages
	 */ 
	 public void pStages( VkPipelineShaderStageCreateInfo  pStages){
		 this.pStages = pStages;
		 ByteBuffer buff = (pStages==null) ? null : pStages.getPointer();
		 setPStages0(this.ptr, buff);
	 }

	/**
	 * Get method for field pStages	[vkstruct]<br>
	 * Prototype: const VkPipelineShaderStageCreateInfo*  pStages
	 */ 
	 public  VkPipelineShaderStageCreateInfo  pStages(){
		 long pointer = getPStages0(super.ptr);
		 if(pointer == 0){
		    this.pStages = null;
		    return null;
		  } 

		 if(this.pStages == null){
		    this.pStages = new  VkPipelineShaderStageCreateInfo (pointer);
		 }else{
		    this.pStages.setPointer(pointer);
		  }
		 return this.pStages;
	 }

	/**
	 * Set method for field pVertexInputState	[vkstruct]<br>
	 * Prototype: const VkPipelineVertexInputStateCreateInfo*  pVertexInputState
	 */ 
	 public void pVertexInputState( VkPipelineVertexInputStateCreateInfo  pVertexInputState){
		 this.pVertexInputState = pVertexInputState;
		 ByteBuffer buff = (pVertexInputState==null) ? null : pVertexInputState.getPointer();
		 setPVertexInputState0(this.ptr, buff);
	 }

	/**
	 * Get method for field pVertexInputState	[vkstruct]<br>
	 * Prototype: const VkPipelineVertexInputStateCreateInfo*  pVertexInputState
	 */ 
	 public  VkPipelineVertexInputStateCreateInfo  pVertexInputState(){
		 long pointer = getPVertexInputState0(super.ptr);
		 if(pointer == 0){
		    this.pVertexInputState = null;
		    return null;
		  } 

		 if(this.pVertexInputState == null){
		    this.pVertexInputState = new  VkPipelineVertexInputStateCreateInfo (pointer);
		 }else{
		    this.pVertexInputState.setPointer(pointer);
		  }
		 return this.pVertexInputState;
	 }

	/**
	 * Set method for field pInputAssemblyState	[vkstruct]<br>
	 * Prototype: const VkPipelineInputAssemblyStateCreateInfo*  pInputAssemblyState
	 */ 
	 public void pInputAssemblyState( VkPipelineInputAssemblyStateCreateInfo  pInputAssemblyState){
		 this.pInputAssemblyState = pInputAssemblyState;
		 ByteBuffer buff = (pInputAssemblyState==null) ? null : pInputAssemblyState.getPointer();
		 setPInputAssemblyState0(this.ptr, buff);
	 }

	/**
	 * Get method for field pInputAssemblyState	[vkstruct]<br>
	 * Prototype: const VkPipelineInputAssemblyStateCreateInfo*  pInputAssemblyState
	 */ 
	 public  VkPipelineInputAssemblyStateCreateInfo  pInputAssemblyState(){
		 long pointer = getPInputAssemblyState0(super.ptr);
		 if(pointer == 0){
		    this.pInputAssemblyState = null;
		    return null;
		  } 

		 if(this.pInputAssemblyState == null){
		    this.pInputAssemblyState = new  VkPipelineInputAssemblyStateCreateInfo (pointer);
		 }else{
		    this.pInputAssemblyState.setPointer(pointer);
		  }
		 return this.pInputAssemblyState;
	 }

	/**
	 * Set method for field pTessellationState	[vkstruct]<br>
	 * Prototype: const VkPipelineTessellationStateCreateInfo*  pTessellationState
	 */ 
	 public void pTessellationState( VkPipelineTessellationStateCreateInfo  pTessellationState){
		 this.pTessellationState = pTessellationState;
		 ByteBuffer buff = (pTessellationState==null) ? null : pTessellationState.getPointer();
		 setPTessellationState0(this.ptr, buff);
	 }

	/**
	 * Get method for field pTessellationState	[vkstruct]<br>
	 * Prototype: const VkPipelineTessellationStateCreateInfo*  pTessellationState
	 */ 
	 public  VkPipelineTessellationStateCreateInfo  pTessellationState(){
		 long pointer = getPTessellationState0(super.ptr);
		 if(pointer == 0){
		    this.pTessellationState = null;
		    return null;
		  } 

		 if(this.pTessellationState == null){
		    this.pTessellationState = new  VkPipelineTessellationStateCreateInfo (pointer);
		 }else{
		    this.pTessellationState.setPointer(pointer);
		  }
		 return this.pTessellationState;
	 }

	/**
	 * Set method for field pViewportState	[vkstruct]<br>
	 * Prototype: const VkPipelineViewportStateCreateInfo*  pViewportState
	 */ 
	 public void pViewportState( VkPipelineViewportStateCreateInfo  pViewportState){
		 this.pViewportState = pViewportState;
		 ByteBuffer buff = (pViewportState==null) ? null : pViewportState.getPointer();
		 setPViewportState0(this.ptr, buff);
	 }

	/**
	 * Get method for field pViewportState	[vkstruct]<br>
	 * Prototype: const VkPipelineViewportStateCreateInfo*  pViewportState
	 */ 
	 public  VkPipelineViewportStateCreateInfo  pViewportState(){
		 long pointer = getPViewportState0(super.ptr);
		 if(pointer == 0){
		    this.pViewportState = null;
		    return null;
		  } 

		 if(this.pViewportState == null){
		    this.pViewportState = new  VkPipelineViewportStateCreateInfo (pointer);
		 }else{
		    this.pViewportState.setPointer(pointer);
		  }
		 return this.pViewportState;
	 }

	/**
	 * Set method for field pRasterizationState	[vkstruct]<br>
	 * Prototype: const VkPipelineRasterizationStateCreateInfo*  pRasterizationState
	 */ 
	 public void pRasterizationState( VkPipelineRasterizationStateCreateInfo  pRasterizationState){
		 this.pRasterizationState = pRasterizationState;
		 ByteBuffer buff = (pRasterizationState==null) ? null : pRasterizationState.getPointer();
		 setPRasterizationState0(this.ptr, buff);
	 }

	/**
	 * Get method for field pRasterizationState	[vkstruct]<br>
	 * Prototype: const VkPipelineRasterizationStateCreateInfo*  pRasterizationState
	 */ 
	 public  VkPipelineRasterizationStateCreateInfo  pRasterizationState(){
		 long pointer = getPRasterizationState0(super.ptr);
		 if(pointer == 0){
		    this.pRasterizationState = null;
		    return null;
		  } 

		 if(this.pRasterizationState == null){
		    this.pRasterizationState = new  VkPipelineRasterizationStateCreateInfo (pointer);
		 }else{
		    this.pRasterizationState.setPointer(pointer);
		  }
		 return this.pRasterizationState;
	 }

	/**
	 * Set method for field pMultisampleState	[vkstruct]<br>
	 * Prototype: const VkPipelineMultisampleStateCreateInfo*  pMultisampleState
	 */ 
	 public void pMultisampleState( VkPipelineMultisampleStateCreateInfo  pMultisampleState){
		 this.pMultisampleState = pMultisampleState;
		 ByteBuffer buff = (pMultisampleState==null) ? null : pMultisampleState.getPointer();
		 setPMultisampleState0(this.ptr, buff);
	 }

	/**
	 * Get method for field pMultisampleState	[vkstruct]<br>
	 * Prototype: const VkPipelineMultisampleStateCreateInfo*  pMultisampleState
	 */ 
	 public  VkPipelineMultisampleStateCreateInfo  pMultisampleState(){
		 long pointer = getPMultisampleState0(super.ptr);
		 if(pointer == 0){
		    this.pMultisampleState = null;
		    return null;
		  } 

		 if(this.pMultisampleState == null){
		    this.pMultisampleState = new  VkPipelineMultisampleStateCreateInfo (pointer);
		 }else{
		    this.pMultisampleState.setPointer(pointer);
		  }
		 return this.pMultisampleState;
	 }

	/**
	 * Set method for field pDepthStencilState	[vkstruct]<br>
	 * Prototype: const VkPipelineDepthStencilStateCreateInfo*  pDepthStencilState
	 */ 
	 public void pDepthStencilState( VkPipelineDepthStencilStateCreateInfo  pDepthStencilState){
		 this.pDepthStencilState = pDepthStencilState;
		 ByteBuffer buff = (pDepthStencilState==null) ? null : pDepthStencilState.getPointer();
		 setPDepthStencilState0(this.ptr, buff);
	 }

	/**
	 * Get method for field pDepthStencilState	[vkstruct]<br>
	 * Prototype: const VkPipelineDepthStencilStateCreateInfo*  pDepthStencilState
	 */ 
	 public  VkPipelineDepthStencilStateCreateInfo  pDepthStencilState(){
		 long pointer = getPDepthStencilState0(super.ptr);
		 if(pointer == 0){
		    this.pDepthStencilState = null;
		    return null;
		  } 

		 if(this.pDepthStencilState == null){
		    this.pDepthStencilState = new  VkPipelineDepthStencilStateCreateInfo (pointer);
		 }else{
		    this.pDepthStencilState.setPointer(pointer);
		  }
		 return this.pDepthStencilState;
	 }

	/**
	 * Set method for field pColorBlendState	[vkstruct]<br>
	 * Prototype: const VkPipelineColorBlendStateCreateInfo*  pColorBlendState
	 */ 
	 public void pColorBlendState( VkPipelineColorBlendStateCreateInfo  pColorBlendState){
		 this.pColorBlendState = pColorBlendState;
		 ByteBuffer buff = (pColorBlendState==null) ? null : pColorBlendState.getPointer();
		 setPColorBlendState0(this.ptr, buff);
	 }

	/**
	 * Get method for field pColorBlendState	[vkstruct]<br>
	 * Prototype: const VkPipelineColorBlendStateCreateInfo*  pColorBlendState
	 */ 
	 public  VkPipelineColorBlendStateCreateInfo  pColorBlendState(){
		 long pointer = getPColorBlendState0(super.ptr);
		 if(pointer == 0){
		    this.pColorBlendState = null;
		    return null;
		  } 

		 if(this.pColorBlendState == null){
		    this.pColorBlendState = new  VkPipelineColorBlendStateCreateInfo (pointer);
		 }else{
		    this.pColorBlendState.setPointer(pointer);
		  }
		 return this.pColorBlendState;
	 }

	/**
	 * Set method for field pDynamicState	[vkstruct]<br>
	 * Prototype: const VkPipelineDynamicStateCreateInfo*  pDynamicState
	 */ 
	 public void pDynamicState( VkPipelineDynamicStateCreateInfo  pDynamicState){
		 this.pDynamicState = pDynamicState;
		 ByteBuffer buff = (pDynamicState==null) ? null : pDynamicState.getPointer();
		 setPDynamicState0(this.ptr, buff);
	 }

	/**
	 * Get method for field pDynamicState	[vkstruct]<br>
	 * Prototype: const VkPipelineDynamicStateCreateInfo*  pDynamicState
	 */ 
	 public  VkPipelineDynamicStateCreateInfo  pDynamicState(){
		 long pointer = getPDynamicState0(super.ptr);
		 if(pointer == 0){
		    this.pDynamicState = null;
		    return null;
		  } 

		 if(this.pDynamicState == null){
		    this.pDynamicState = new  VkPipelineDynamicStateCreateInfo (pointer);
		 }else{
		    this.pDynamicState.setPointer(pointer);
		  }
		 return this.pDynamicState;
	 }

	/**
	 * Set method for field layout	[vkhandle]<br>
	 * Prototype: VkPipelineLayout  layout
	 */ 
	 public void layout(VkPipelineLayout layout){
		 this.layout = layout;
		 ByteBuffer buff = (layout==null) ? null : layout.getPointer();
		 setLayout0(this.ptr, buff);
	 }

	/**
	 * Get method for field layout	[vkhandle]<br>
	 * Prototype: VkPipelineLayout  layout
	 */ 
	 public VkPipelineLayout layout(){

		 long handle = getLayout0(super.ptr);
		 if(handle == 0){
		    this.layout = null;
		    return null;
		  }  

		 if(this.layout == null){
		    this.layout = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.layout).setPointer(handle);
		  }
		 return this.layout;
	 }

	/**
	 * Set method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 public void renderPass(VkRenderPass renderPass){
		 this.renderPass = renderPass;
		 ByteBuffer buff = (renderPass==null) ? null : renderPass.getPointer();
		 setRenderPass0(this.ptr, buff);
	 }

	/**
	 * Get method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 public VkRenderPass renderPass(){

		 long handle = getRenderPass0(super.ptr);
		 if(handle == 0){
		    this.renderPass = null;
		    return null;
		  }  

		 if(this.renderPass == null){
		    this.renderPass = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.renderPass).setPointer(handle);
		  }
		 return this.renderPass;
	 }

	/**
	 * Set method for field subpass	[int]<br>
	 * Prototype: uint32_t  subpass
	 */ 
	 public void subpass(int subpass){
		 this.subpass = subpass;
		 setSubpass0(this.ptr,  subpass);
	 }

	/**
	 * Get method for field subpass	[int]<br>
	 * Prototype: uint32_t  subpass
	 */ 
	 public int subpass(){
		 int var = getSubpass0(super.ptr);
		 this.subpass = var;
		 return this.subpass;
	 }

	/**
	 * Set method for field basePipelineHandle	[vkhandle]<br>
	 * Prototype: VkPipeline  basePipelineHandle
	 */ 
	 public void basePipelineHandle(VkPipeline basePipelineHandle){
		 this.basePipelineHandle = basePipelineHandle;
		 ByteBuffer buff = (basePipelineHandle==null) ? null : basePipelineHandle.getPointer();
		 setBasePipelineHandle0(this.ptr, buff);
	 }

	/**
	 * Get method for field basePipelineHandle	[vkhandle]<br>
	 * Prototype: VkPipeline  basePipelineHandle
	 */ 
	 public VkPipeline basePipelineHandle(){

		 long handle = getBasePipelineHandle0(super.ptr);
		 if(handle == 0){
		    this.basePipelineHandle = null;
		    return null;
		  }  

		 if(this.basePipelineHandle == null){
		    this.basePipelineHandle = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.basePipelineHandle).setPointer(handle);
		  }
		 return this.basePipelineHandle;
	 }

	/**
	 * Set method for field basePipelineIndex	[int]<br>
	 * Prototype: int32_t  basePipelineIndex
	 */ 
	 public void basePipelineIndex(int basePipelineIndex){
		 this.basePipelineIndex = basePipelineIndex;
		 setBasePipelineIndex0(this.ptr,  basePipelineIndex);
	 }

	/**
	 * Get method for field basePipelineIndex	[int]<br>
	 * Prototype: int32_t  basePipelineIndex
	 */ 
	 public int basePipelineIndex(){
		 int var = getBasePipelineIndex0(super.ptr);
		 this.basePipelineIndex = var;
		 return this.basePipelineIndex;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  vkObj->flags = (VkPipelineCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field stageCount	[int]<br>
	 * Prototype: uint32_t  stageCount
	 */ 
	 private static native void setStageCount0(Buffer ptr, int _stageCount);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  vkObj->stageCount = (uint32_t) (_stageCount);
	  */

	/**
	 * native GET method for field stageCount	[int]<br>
	 * Prototype: uint32_t  stageCount
	 */ 
	 private static native int getStageCount0(Buffer ptr);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  return (jint) (vkObj->stageCount);
	 */

	/**
	 * native SET method for field pStages	[vkstruct]<br>
	 * Prototype: const VkPipelineShaderStageCreateInfo*  pStages
	 */ 
	 private static native void setPStages0(Buffer ptr, java.nio.ByteBuffer  _pStages);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  vkObj->pStages = (const VkPipelineShaderStageCreateInfo*) (_pStages);
	  */

	/**
	 * native GET method for field pStages	[vkstruct]<br>
	 * Prototype: const VkPipelineShaderStageCreateInfo*  pStages
	 */ 
	 private static native long getPStages0(Buffer ptr);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pStages);	 */

	/**
	 * native SET method for field pVertexInputState	[vkstruct]<br>
	 * Prototype: const VkPipelineVertexInputStateCreateInfo*  pVertexInputState
	 */ 
	 private static native void setPVertexInputState0(Buffer ptr, java.nio.ByteBuffer  _pVertexInputState);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  vkObj->pVertexInputState = (const VkPipelineVertexInputStateCreateInfo*) (_pVertexInputState);
	  */

	/**
	 * native GET method for field pVertexInputState	[vkstruct]<br>
	 * Prototype: const VkPipelineVertexInputStateCreateInfo*  pVertexInputState
	 */ 
	 private static native long getPVertexInputState0(Buffer ptr);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pVertexInputState);	 */

	/**
	 * native SET method for field pInputAssemblyState	[vkstruct]<br>
	 * Prototype: const VkPipelineInputAssemblyStateCreateInfo*  pInputAssemblyState
	 */ 
	 private static native void setPInputAssemblyState0(Buffer ptr, java.nio.ByteBuffer  _pInputAssemblyState);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  vkObj->pInputAssemblyState = (const VkPipelineInputAssemblyStateCreateInfo*) (_pInputAssemblyState);
	  */

	/**
	 * native GET method for field pInputAssemblyState	[vkstruct]<br>
	 * Prototype: const VkPipelineInputAssemblyStateCreateInfo*  pInputAssemblyState
	 */ 
	 private static native long getPInputAssemblyState0(Buffer ptr);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pInputAssemblyState);	 */

	/**
	 * native SET method for field pTessellationState	[vkstruct]<br>
	 * Prototype: const VkPipelineTessellationStateCreateInfo*  pTessellationState
	 */ 
	 private static native void setPTessellationState0(Buffer ptr, java.nio.ByteBuffer  _pTessellationState);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  vkObj->pTessellationState = (const VkPipelineTessellationStateCreateInfo*) (_pTessellationState);
	  */

	/**
	 * native GET method for field pTessellationState	[vkstruct]<br>
	 * Prototype: const VkPipelineTessellationStateCreateInfo*  pTessellationState
	 */ 
	 private static native long getPTessellationState0(Buffer ptr);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pTessellationState);	 */

	/**
	 * native SET method for field pViewportState	[vkstruct]<br>
	 * Prototype: const VkPipelineViewportStateCreateInfo*  pViewportState
	 */ 
	 private static native void setPViewportState0(Buffer ptr, java.nio.ByteBuffer  _pViewportState);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  vkObj->pViewportState = (const VkPipelineViewportStateCreateInfo*) (_pViewportState);
	  */

	/**
	 * native GET method for field pViewportState	[vkstruct]<br>
	 * Prototype: const VkPipelineViewportStateCreateInfo*  pViewportState
	 */ 
	 private static native long getPViewportState0(Buffer ptr);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pViewportState);	 */

	/**
	 * native SET method for field pRasterizationState	[vkstruct]<br>
	 * Prototype: const VkPipelineRasterizationStateCreateInfo*  pRasterizationState
	 */ 
	 private static native void setPRasterizationState0(Buffer ptr, java.nio.ByteBuffer  _pRasterizationState);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  vkObj->pRasterizationState = (const VkPipelineRasterizationStateCreateInfo*) (_pRasterizationState);
	  */

	/**
	 * native GET method for field pRasterizationState	[vkstruct]<br>
	 * Prototype: const VkPipelineRasterizationStateCreateInfo*  pRasterizationState
	 */ 
	 private static native long getPRasterizationState0(Buffer ptr);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pRasterizationState);	 */

	/**
	 * native SET method for field pMultisampleState	[vkstruct]<br>
	 * Prototype: const VkPipelineMultisampleStateCreateInfo*  pMultisampleState
	 */ 
	 private static native void setPMultisampleState0(Buffer ptr, java.nio.ByteBuffer  _pMultisampleState);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  vkObj->pMultisampleState = (const VkPipelineMultisampleStateCreateInfo*) (_pMultisampleState);
	  */

	/**
	 * native GET method for field pMultisampleState	[vkstruct]<br>
	 * Prototype: const VkPipelineMultisampleStateCreateInfo*  pMultisampleState
	 */ 
	 private static native long getPMultisampleState0(Buffer ptr);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pMultisampleState);	 */

	/**
	 * native SET method for field pDepthStencilState	[vkstruct]<br>
	 * Prototype: const VkPipelineDepthStencilStateCreateInfo*  pDepthStencilState
	 */ 
	 private static native void setPDepthStencilState0(Buffer ptr, java.nio.ByteBuffer  _pDepthStencilState);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  vkObj->pDepthStencilState = (const VkPipelineDepthStencilStateCreateInfo*) (_pDepthStencilState);
	  */

	/**
	 * native GET method for field pDepthStencilState	[vkstruct]<br>
	 * Prototype: const VkPipelineDepthStencilStateCreateInfo*  pDepthStencilState
	 */ 
	 private static native long getPDepthStencilState0(Buffer ptr);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pDepthStencilState);	 */

	/**
	 * native SET method for field pColorBlendState	[vkstruct]<br>
	 * Prototype: const VkPipelineColorBlendStateCreateInfo*  pColorBlendState
	 */ 
	 private static native void setPColorBlendState0(Buffer ptr, java.nio.ByteBuffer  _pColorBlendState);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  vkObj->pColorBlendState = (const VkPipelineColorBlendStateCreateInfo*) (_pColorBlendState);
	  */

	/**
	 * native GET method for field pColorBlendState	[vkstruct]<br>
	 * Prototype: const VkPipelineColorBlendStateCreateInfo*  pColorBlendState
	 */ 
	 private static native long getPColorBlendState0(Buffer ptr);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pColorBlendState);	 */

	/**
	 * native SET method for field pDynamicState	[vkstruct]<br>
	 * Prototype: const VkPipelineDynamicStateCreateInfo*  pDynamicState
	 */ 
	 private static native void setPDynamicState0(Buffer ptr, java.nio.ByteBuffer  _pDynamicState);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  vkObj->pDynamicState = (const VkPipelineDynamicStateCreateInfo*) (_pDynamicState);
	  */

	/**
	 * native GET method for field pDynamicState	[vkstruct]<br>
	 * Prototype: const VkPipelineDynamicStateCreateInfo*  pDynamicState
	 */ 
	 private static native long getPDynamicState0(Buffer ptr);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pDynamicState);	 */

	/**
	 * native SET method for field layout	[vkhandle]<br>
	 * Prototype: VkPipelineLayout  layout
	 */ 
	 private static native void setLayout0(Buffer ptr, java.nio.ByteBuffer  _layout);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  vkObj->layout = (VkPipelineLayout) (_layout);
	  */

	/**
	 * native GET method for field layout	[vkhandle]<br>
	 * Prototype: VkPipelineLayout  layout
	 */ 
	 private static native long getLayout0(Buffer ptr);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->layout);	 */

	/**
	 * native SET method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native void setRenderPass0(Buffer ptr, java.nio.ByteBuffer  _renderPass);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  vkObj->renderPass = (VkRenderPass) (_renderPass);
	  */

	/**
	 * native GET method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native long getRenderPass0(Buffer ptr);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->renderPass);	 */

	/**
	 * native SET method for field subpass	[int]<br>
	 * Prototype: uint32_t  subpass
	 */ 
	 private static native void setSubpass0(Buffer ptr, int _subpass);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  vkObj->subpass = (uint32_t) (_subpass);
	  */

	/**
	 * native GET method for field subpass	[int]<br>
	 * Prototype: uint32_t  subpass
	 */ 
	 private static native int getSubpass0(Buffer ptr);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  return (jint) (vkObj->subpass);
	 */

	/**
	 * native SET method for field basePipelineHandle	[vkhandle]<br>
	 * Prototype: VkPipeline  basePipelineHandle
	 */ 
	 private static native void setBasePipelineHandle0(Buffer ptr, java.nio.ByteBuffer  _basePipelineHandle);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  vkObj->basePipelineHandle = (VkPipeline) (_basePipelineHandle);
	  */

	/**
	 * native GET method for field basePipelineHandle	[vkhandle]<br>
	 * Prototype: VkPipeline  basePipelineHandle
	 */ 
	 private static native long getBasePipelineHandle0(Buffer ptr);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->basePipelineHandle);	 */

	/**
	 * native SET method for field basePipelineIndex	[int]<br>
	 * Prototype: int32_t  basePipelineIndex
	 */ 
	 private static native void setBasePipelineIndex0(Buffer ptr, int _basePipelineIndex);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  vkObj->basePipelineIndex = (int32_t) (_basePipelineIndex);
	  */

	/**
	 * native GET method for field basePipelineIndex	[int]<br>
	 * Prototype: int32_t  basePipelineIndex
	 */ 
	 private static native int getBasePipelineIndex0(Buffer ptr);/*
		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  return (jint) (vkObj->basePipelineIndex);
	 */



} // end of class VkGraphicsPipelineCreateInfo
