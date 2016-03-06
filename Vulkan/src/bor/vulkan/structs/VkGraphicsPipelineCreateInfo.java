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
	/** TAG of this structure [66]  */
	 private static final String TAG = "VkGraphicsPipelineCreateInfo";

	/** ID of this structure [66]  */
	 public static final int TAG_ID = VKGRAPHICSPIPELINECREATEINFO_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType	[vkenum]
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext	[p]
	 */ 
	P<VkObject> 	pNext;

	/**
	 *  VkPipelineCreateFlags 	flags	[int]
	 */ 
	int 	flags;

	/**
	 *  uint32_t 	stageCount	[int]
	 */ 
	int 	stageCount;

	/**
	 *  const VkPipelineShaderStageCreateInfo* 	pStages	[p]
	 */ 
	P<VkPipelineShaderStageCreateInfo>  	pStages;

	/**
	 *  const VkPipelineVertexInputStateCreateInfo* 	pVertexInputState	[p]
	 */ 
	P<VkPipelineVertexInputStateCreateInfo>  	pVertexInputState;

	/**
	 *  const VkPipelineInputAssemblyStateCreateInfo* 	pInputAssemblyState	[p]
	 */ 
	P<VkPipelineInputAssemblyStateCreateInfo>  	pInputAssemblyState;

	/**
	 *  const VkPipelineTessellationStateCreateInfo* 	pTessellationState	[p]
	 */ 
	P<VkPipelineTessellationStateCreateInfo>  	pTessellationState;

	/**
	 *  const VkPipelineViewportStateCreateInfo* 	pViewportState	[p]
	 */ 
	P<VkPipelineViewportStateCreateInfo>  	pViewportState;

	/**
	 *  const VkPipelineRasterizationStateCreateInfo* 	pRasterizationState	[p]
	 */ 
	P<VkPipelineRasterizationStateCreateInfo>  	pRasterizationState;

	/**
	 *  const VkPipelineMultisampleStateCreateInfo* 	pMultisampleState	[p]
	 */ 
	P<VkPipelineMultisampleStateCreateInfo>  	pMultisampleState;

	/**
	 *  const VkPipelineDepthStencilStateCreateInfo* 	pDepthStencilState	[p]
	 */ 
	P<VkPipelineDepthStencilStateCreateInfo>  	pDepthStencilState;

	/**
	 *  const VkPipelineColorBlendStateCreateInfo* 	pColorBlendState	[p]
	 */ 
	P<VkPipelineColorBlendStateCreateInfo>  	pColorBlendState;

	/**
	 *  const VkPipelineDynamicStateCreateInfo* 	pDynamicState	[p]
	 */ 
	P<VkPipelineDynamicStateCreateInfo>  	pDynamicState;

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
	 public VkGraphicsPipelineCreateInfo(long address, int memSize){ 
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
	 public static P<VkGraphicsPipelineCreateInfo> createNullPointer(){
	        P<VkGraphicsPipelineCreateInfo> p = new  P<VkGraphicsPipelineCreateInfo>(new VkGraphicsPipelineCreateInfo());
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
	 * Prototype: VkPipelineCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkPipelineCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field stageCount	[int]<br>
	 * Prototype: uint32_t  stageCount
	 */ 
	 public void stageCount(int stageCount){
		 this.stageCount = stageCount;
		stageCount0(super.ptr, stageCount);
	 }

	/**
	 * get method for field stageCount	[int]<br>
	 * Prototype: uint32_t  stageCount
	 */ 
	 public int stageCount(){
		 // return  this.stageCount;
		 return stageCount0(super.ptr);
	 }

	/**
	 * Set method for field pStages	[p]<br>
	 * Prototype: const VkPipelineShaderStageCreateInfo*  pStages
	 */ 
	 public void pStages(P<VkPipelineShaderStageCreateInfo>  pStages){
		 this.pStages = pStages;
		pStages0(super.ptr, pStages);
	 }

	/**
	 * get method for field pStages	[p]<br>
	 * Prototype: const VkPipelineShaderStageCreateInfo*  pStages
	 */ 
	 public P<VkPipelineShaderStageCreateInfo>  pStages(){
		 // return  this.pStages;
		 return pStages0(super.ptr);
	 }

	/**
	 * Set method for field pVertexInputState	[p]<br>
	 * Prototype: const VkPipelineVertexInputStateCreateInfo*  pVertexInputState
	 */ 
	 public void pVertexInputState(P<VkPipelineVertexInputStateCreateInfo>  pVertexInputState){
		 this.pVertexInputState = pVertexInputState;
		pVertexInputState0(super.ptr, pVertexInputState);
	 }

	/**
	 * get method for field pVertexInputState	[p]<br>
	 * Prototype: const VkPipelineVertexInputStateCreateInfo*  pVertexInputState
	 */ 
	 public P<VkPipelineVertexInputStateCreateInfo>  pVertexInputState(){
		 // return  this.pVertexInputState;
		 return pVertexInputState0(super.ptr);
	 }

	/**
	 * Set method for field pInputAssemblyState	[p]<br>
	 * Prototype: const VkPipelineInputAssemblyStateCreateInfo*  pInputAssemblyState
	 */ 
	 public void pInputAssemblyState(P<VkPipelineInputAssemblyStateCreateInfo>  pInputAssemblyState){
		 this.pInputAssemblyState = pInputAssemblyState;
		pInputAssemblyState0(super.ptr, pInputAssemblyState);
	 }

	/**
	 * get method for field pInputAssemblyState	[p]<br>
	 * Prototype: const VkPipelineInputAssemblyStateCreateInfo*  pInputAssemblyState
	 */ 
	 public P<VkPipelineInputAssemblyStateCreateInfo>  pInputAssemblyState(){
		 // return  this.pInputAssemblyState;
		 return pInputAssemblyState0(super.ptr);
	 }

	/**
	 * Set method for field pTessellationState	[p]<br>
	 * Prototype: const VkPipelineTessellationStateCreateInfo*  pTessellationState
	 */ 
	 public void pTessellationState(P<VkPipelineTessellationStateCreateInfo>  pTessellationState){
		 this.pTessellationState = pTessellationState;
		pTessellationState0(super.ptr, pTessellationState);
	 }

	/**
	 * get method for field pTessellationState	[p]<br>
	 * Prototype: const VkPipelineTessellationStateCreateInfo*  pTessellationState
	 */ 
	 public P<VkPipelineTessellationStateCreateInfo>  pTessellationState(){
		 // return  this.pTessellationState;
		 return pTessellationState0(super.ptr);
	 }

	/**
	 * Set method for field pViewportState	[p]<br>
	 * Prototype: const VkPipelineViewportStateCreateInfo*  pViewportState
	 */ 
	 public void pViewportState(P<VkPipelineViewportStateCreateInfo>  pViewportState){
		 this.pViewportState = pViewportState;
		pViewportState0(super.ptr, pViewportState);
	 }

	/**
	 * get method for field pViewportState	[p]<br>
	 * Prototype: const VkPipelineViewportStateCreateInfo*  pViewportState
	 */ 
	 public P<VkPipelineViewportStateCreateInfo>  pViewportState(){
		 // return  this.pViewportState;
		 return pViewportState0(super.ptr);
	 }

	/**
	 * Set method for field pRasterizationState	[p]<br>
	 * Prototype: const VkPipelineRasterizationStateCreateInfo*  pRasterizationState
	 */ 
	 public void pRasterizationState(P<VkPipelineRasterizationStateCreateInfo>  pRasterizationState){
		 this.pRasterizationState = pRasterizationState;
		pRasterizationState0(super.ptr, pRasterizationState);
	 }

	/**
	 * get method for field pRasterizationState	[p]<br>
	 * Prototype: const VkPipelineRasterizationStateCreateInfo*  pRasterizationState
	 */ 
	 public P<VkPipelineRasterizationStateCreateInfo>  pRasterizationState(){
		 // return  this.pRasterizationState;
		 return pRasterizationState0(super.ptr);
	 }

	/**
	 * Set method for field pMultisampleState	[p]<br>
	 * Prototype: const VkPipelineMultisampleStateCreateInfo*  pMultisampleState
	 */ 
	 public void pMultisampleState(P<VkPipelineMultisampleStateCreateInfo>  pMultisampleState){
		 this.pMultisampleState = pMultisampleState;
		pMultisampleState0(super.ptr, pMultisampleState);
	 }

	/**
	 * get method for field pMultisampleState	[p]<br>
	 * Prototype: const VkPipelineMultisampleStateCreateInfo*  pMultisampleState
	 */ 
	 public P<VkPipelineMultisampleStateCreateInfo>  pMultisampleState(){
		 // return  this.pMultisampleState;
		 return pMultisampleState0(super.ptr);
	 }

	/**
	 * Set method for field pDepthStencilState	[p]<br>
	 * Prototype: const VkPipelineDepthStencilStateCreateInfo*  pDepthStencilState
	 */ 
	 public void pDepthStencilState(P<VkPipelineDepthStencilStateCreateInfo>  pDepthStencilState){
		 this.pDepthStencilState = pDepthStencilState;
		pDepthStencilState0(super.ptr, pDepthStencilState);
	 }

	/**
	 * get method for field pDepthStencilState	[p]<br>
	 * Prototype: const VkPipelineDepthStencilStateCreateInfo*  pDepthStencilState
	 */ 
	 public P<VkPipelineDepthStencilStateCreateInfo>  pDepthStencilState(){
		 // return  this.pDepthStencilState;
		 return pDepthStencilState0(super.ptr);
	 }

	/**
	 * Set method for field pColorBlendState	[p]<br>
	 * Prototype: const VkPipelineColorBlendStateCreateInfo*  pColorBlendState
	 */ 
	 public void pColorBlendState(P<VkPipelineColorBlendStateCreateInfo>  pColorBlendState){
		 this.pColorBlendState = pColorBlendState;
		pColorBlendState0(super.ptr, pColorBlendState);
	 }

	/**
	 * get method for field pColorBlendState	[p]<br>
	 * Prototype: const VkPipelineColorBlendStateCreateInfo*  pColorBlendState
	 */ 
	 public P<VkPipelineColorBlendStateCreateInfo>  pColorBlendState(){
		 // return  this.pColorBlendState;
		 return pColorBlendState0(super.ptr);
	 }

	/**
	 * Set method for field pDynamicState	[p]<br>
	 * Prototype: const VkPipelineDynamicStateCreateInfo*  pDynamicState
	 */ 
	 public void pDynamicState(P<VkPipelineDynamicStateCreateInfo>  pDynamicState){
		 this.pDynamicState = pDynamicState;
		pDynamicState0(super.ptr, pDynamicState);
	 }

	/**
	 * get method for field pDynamicState	[p]<br>
	 * Prototype: const VkPipelineDynamicStateCreateInfo*  pDynamicState
	 */ 
	 public P<VkPipelineDynamicStateCreateInfo>  pDynamicState(){
		 // return  this.pDynamicState;
		 return pDynamicState0(super.ptr);
	 }

	/**
	 * Set method for field layout	[vkhandle]<br>
	 * Prototype: VkPipelineLayout  layout
	 */ 
	 public void layout(VkPipelineLayout layout){
		 this.layout = layout;
		layout0(super.ptr, layout);
	 }

	/**
	 * get method for field layout	[vkhandle]<br>
	 * Prototype: VkPipelineLayout  layout
	 */ 
	 public VkPipelineLayout layout(){
		 // return  this.layout;
		 return layout0(super.ptr);
	 }

	/**
	 * Set method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 public void renderPass(VkRenderPass renderPass){
		 this.renderPass = renderPass;
		renderPass0(super.ptr, renderPass);
	 }

	/**
	 * get method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 public VkRenderPass renderPass(){
		 // return  this.renderPass;
		 return renderPass0(super.ptr);
	 }

	/**
	 * Set method for field subpass	[int]<br>
	 * Prototype: uint32_t  subpass
	 */ 
	 public void subpass(int subpass){
		 this.subpass = subpass;
		subpass0(super.ptr, subpass);
	 }

	/**
	 * get method for field subpass	[int]<br>
	 * Prototype: uint32_t  subpass
	 */ 
	 public int subpass(){
		 // return  this.subpass;
		 return subpass0(super.ptr);
	 }

	/**
	 * Set method for field basePipelineHandle	[vkhandle]<br>
	 * Prototype: VkPipeline  basePipelineHandle
	 */ 
	 public void basePipelineHandle(VkPipeline basePipelineHandle){
		 this.basePipelineHandle = basePipelineHandle;
		basePipelineHandle0(super.ptr, basePipelineHandle);
	 }

	/**
	 * get method for field basePipelineHandle	[vkhandle]<br>
	 * Prototype: VkPipeline  basePipelineHandle
	 */ 
	 public VkPipeline basePipelineHandle(){
		 // return  this.basePipelineHandle;
		 return basePipelineHandle0(super.ptr);
	 }

	/**
	 * Set method for field basePipelineIndex	[int]<br>
	 * Prototype: int32_t  basePipelineIndex
	 */ 
	 public void basePipelineIndex(int basePipelineIndex){
		 this.basePipelineIndex = basePipelineIndex;
		basePipelineIndex0(super.ptr, basePipelineIndex);
	 }

	/**
	 * get method for field basePipelineIndex	[int]<br>
	 * Prototype: int32_t  basePipelineIndex
	 */ 
	 public int basePipelineIndex(){
		 // return  this.basePipelineIndex;
		 return basePipelineIndex0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.flags = (VkPipelineCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (jint) (_obj.VkPipelineCreateFlags);
	 */

	/**
	 * native SET method for field stageCount	[int]<br>
	 * Prototype: uint32_t  stageCount
	 */ 
	 private static native void stageCount0(ByteBuffer ptr, int _stageCount);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.stageCount = (uint32_t) (_stageCount);
	  */

	/**
	 * native GET method for field stageCount	[int]<br>
	 * Prototype: uint32_t  stageCount
	 */ 
	 private static native int stageCount0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field pStages	[p]<br>
	 * Prototype: const VkPipelineShaderStageCreateInfo*  pStages
	 */ 
	 private static native void pStages0(ByteBuffer ptr, P<VkPipelineShaderStageCreateInfo>  _pStages);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.pStages = (const VkPipelineShaderStageCreateInfo*) (_pStages);
	  */

	/**
	 * native GET method for field pStages	[p]<br>
	 * Prototype: const VkPipelineShaderStageCreateInfo*  pStages
	 */ 
	 private static native P<VkPipelineShaderStageCreateInfo>  pStages0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (P<VkPipelineShaderStageCreateInfo> ) (_obj.const VkPipelineShaderStageCreateInfo*);
	 */

	/**
	 * native SET method for field pVertexInputState	[p]<br>
	 * Prototype: const VkPipelineVertexInputStateCreateInfo*  pVertexInputState
	 */ 
	 private static native void pVertexInputState0(ByteBuffer ptr, P<VkPipelineVertexInputStateCreateInfo>  _pVertexInputState);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.pVertexInputState = (const VkPipelineVertexInputStateCreateInfo*) (_pVertexInputState);
	  */

	/**
	 * native GET method for field pVertexInputState	[p]<br>
	 * Prototype: const VkPipelineVertexInputStateCreateInfo*  pVertexInputState
	 */ 
	 private static native P<VkPipelineVertexInputStateCreateInfo>  pVertexInputState0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (P<VkPipelineVertexInputStateCreateInfo> ) (_obj.const VkPipelineVertexInputStateCreateInfo*);
	 */

	/**
	 * native SET method for field pInputAssemblyState	[p]<br>
	 * Prototype: const VkPipelineInputAssemblyStateCreateInfo*  pInputAssemblyState
	 */ 
	 private static native void pInputAssemblyState0(ByteBuffer ptr, P<VkPipelineInputAssemblyStateCreateInfo>  _pInputAssemblyState);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.pInputAssemblyState = (const VkPipelineInputAssemblyStateCreateInfo*) (_pInputAssemblyState);
	  */

	/**
	 * native GET method for field pInputAssemblyState	[p]<br>
	 * Prototype: const VkPipelineInputAssemblyStateCreateInfo*  pInputAssemblyState
	 */ 
	 private static native P<VkPipelineInputAssemblyStateCreateInfo>  pInputAssemblyState0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (P<VkPipelineInputAssemblyStateCreateInfo> ) (_obj.const VkPipelineInputAssemblyStateCreateInfo*);
	 */

	/**
	 * native SET method for field pTessellationState	[p]<br>
	 * Prototype: const VkPipelineTessellationStateCreateInfo*  pTessellationState
	 */ 
	 private static native void pTessellationState0(ByteBuffer ptr, P<VkPipelineTessellationStateCreateInfo>  _pTessellationState);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.pTessellationState = (const VkPipelineTessellationStateCreateInfo*) (_pTessellationState);
	  */

	/**
	 * native GET method for field pTessellationState	[p]<br>
	 * Prototype: const VkPipelineTessellationStateCreateInfo*  pTessellationState
	 */ 
	 private static native P<VkPipelineTessellationStateCreateInfo>  pTessellationState0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (P<VkPipelineTessellationStateCreateInfo> ) (_obj.const VkPipelineTessellationStateCreateInfo*);
	 */

	/**
	 * native SET method for field pViewportState	[p]<br>
	 * Prototype: const VkPipelineViewportStateCreateInfo*  pViewportState
	 */ 
	 private static native void pViewportState0(ByteBuffer ptr, P<VkPipelineViewportStateCreateInfo>  _pViewportState);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.pViewportState = (const VkPipelineViewportStateCreateInfo*) (_pViewportState);
	  */

	/**
	 * native GET method for field pViewportState	[p]<br>
	 * Prototype: const VkPipelineViewportStateCreateInfo*  pViewportState
	 */ 
	 private static native P<VkPipelineViewportStateCreateInfo>  pViewportState0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (P<VkPipelineViewportStateCreateInfo> ) (_obj.const VkPipelineViewportStateCreateInfo*);
	 */

	/**
	 * native SET method for field pRasterizationState	[p]<br>
	 * Prototype: const VkPipelineRasterizationStateCreateInfo*  pRasterizationState
	 */ 
	 private static native void pRasterizationState0(ByteBuffer ptr, P<VkPipelineRasterizationStateCreateInfo>  _pRasterizationState);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.pRasterizationState = (const VkPipelineRasterizationStateCreateInfo*) (_pRasterizationState);
	  */

	/**
	 * native GET method for field pRasterizationState	[p]<br>
	 * Prototype: const VkPipelineRasterizationStateCreateInfo*  pRasterizationState
	 */ 
	 private static native P<VkPipelineRasterizationStateCreateInfo>  pRasterizationState0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (P<VkPipelineRasterizationStateCreateInfo> ) (_obj.const VkPipelineRasterizationStateCreateInfo*);
	 */

	/**
	 * native SET method for field pMultisampleState	[p]<br>
	 * Prototype: const VkPipelineMultisampleStateCreateInfo*  pMultisampleState
	 */ 
	 private static native void pMultisampleState0(ByteBuffer ptr, P<VkPipelineMultisampleStateCreateInfo>  _pMultisampleState);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.pMultisampleState = (const VkPipelineMultisampleStateCreateInfo*) (_pMultisampleState);
	  */

	/**
	 * native GET method for field pMultisampleState	[p]<br>
	 * Prototype: const VkPipelineMultisampleStateCreateInfo*  pMultisampleState
	 */ 
	 private static native P<VkPipelineMultisampleStateCreateInfo>  pMultisampleState0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (P<VkPipelineMultisampleStateCreateInfo> ) (_obj.const VkPipelineMultisampleStateCreateInfo*);
	 */

	/**
	 * native SET method for field pDepthStencilState	[p]<br>
	 * Prototype: const VkPipelineDepthStencilStateCreateInfo*  pDepthStencilState
	 */ 
	 private static native void pDepthStencilState0(ByteBuffer ptr, P<VkPipelineDepthStencilStateCreateInfo>  _pDepthStencilState);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.pDepthStencilState = (const VkPipelineDepthStencilStateCreateInfo*) (_pDepthStencilState);
	  */

	/**
	 * native GET method for field pDepthStencilState	[p]<br>
	 * Prototype: const VkPipelineDepthStencilStateCreateInfo*  pDepthStencilState
	 */ 
	 private static native P<VkPipelineDepthStencilStateCreateInfo>  pDepthStencilState0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (P<VkPipelineDepthStencilStateCreateInfo> ) (_obj.const VkPipelineDepthStencilStateCreateInfo*);
	 */

	/**
	 * native SET method for field pColorBlendState	[p]<br>
	 * Prototype: const VkPipelineColorBlendStateCreateInfo*  pColorBlendState
	 */ 
	 private static native void pColorBlendState0(ByteBuffer ptr, P<VkPipelineColorBlendStateCreateInfo>  _pColorBlendState);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.pColorBlendState = (const VkPipelineColorBlendStateCreateInfo*) (_pColorBlendState);
	  */

	/**
	 * native GET method for field pColorBlendState	[p]<br>
	 * Prototype: const VkPipelineColorBlendStateCreateInfo*  pColorBlendState
	 */ 
	 private static native P<VkPipelineColorBlendStateCreateInfo>  pColorBlendState0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (P<VkPipelineColorBlendStateCreateInfo> ) (_obj.const VkPipelineColorBlendStateCreateInfo*);
	 */

	/**
	 * native SET method for field pDynamicState	[p]<br>
	 * Prototype: const VkPipelineDynamicStateCreateInfo*  pDynamicState
	 */ 
	 private static native void pDynamicState0(ByteBuffer ptr, P<VkPipelineDynamicStateCreateInfo>  _pDynamicState);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.pDynamicState = (const VkPipelineDynamicStateCreateInfo*) (_pDynamicState);
	  */

	/**
	 * native GET method for field pDynamicState	[p]<br>
	 * Prototype: const VkPipelineDynamicStateCreateInfo*  pDynamicState
	 */ 
	 private static native P<VkPipelineDynamicStateCreateInfo>  pDynamicState0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (P<VkPipelineDynamicStateCreateInfo> ) (_obj.const VkPipelineDynamicStateCreateInfo*);
	 */

	/**
	 * native SET method for field layout	[vkhandle]<br>
	 * Prototype: VkPipelineLayout  layout
	 */ 
	 private static native void layout0(ByteBuffer ptr, VkPipelineLayout _layout);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.layout = (VkPipelineLayout) (_layout);
	  */

	/**
	 * native GET method for field layout	[vkhandle]<br>
	 * Prototype: VkPipelineLayout  layout
	 */ 
	 private static native VkPipelineLayout layout0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (VkPipelineLayout) (_obj.VkPipelineLayout);
	 */

	/**
	 * native SET method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native void renderPass0(ByteBuffer ptr, VkRenderPass _renderPass);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.renderPass = (VkRenderPass) (_renderPass);
	  */

	/**
	 * native GET method for field renderPass	[vkhandle]<br>
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native VkRenderPass renderPass0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (VkRenderPass) (_obj.VkRenderPass);
	 */

	/**
	 * native SET method for field subpass	[int]<br>
	 * Prototype: uint32_t  subpass
	 */ 
	 private static native void subpass0(ByteBuffer ptr, int _subpass);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.subpass = (uint32_t) (_subpass);
	  */

	/**
	 * native GET method for field subpass	[int]<br>
	 * Prototype: uint32_t  subpass
	 */ 
	 private static native int subpass0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field basePipelineHandle	[vkhandle]<br>
	 * Prototype: VkPipeline  basePipelineHandle
	 */ 
	 private static native void basePipelineHandle0(ByteBuffer ptr, VkPipeline _basePipelineHandle);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.basePipelineHandle = (VkPipeline) (_basePipelineHandle);
	  */

	/**
	 * native GET method for field basePipelineHandle	[vkhandle]<br>
	 * Prototype: VkPipeline  basePipelineHandle
	 */ 
	 private static native VkPipeline basePipelineHandle0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (VkPipeline) (_obj.VkPipeline);
	 */

	/**
	 * native SET method for field basePipelineIndex	[int]<br>
	 * Prototype: int32_t  basePipelineIndex
	 */ 
	 private static native void basePipelineIndex0(ByteBuffer ptr, int _basePipelineIndex);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.basePipelineIndex = (int32_t) (_basePipelineIndex);
	  */

	/**
	 * native GET method for field basePipelineIndex	[int]<br>
	 * Prototype: int32_t  basePipelineIndex
	 */ 
	 private static native int basePipelineIndex0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (jint) (_obj.int32_t);
	 */



} // end of class VkGraphicsPipelineCreateInfo
