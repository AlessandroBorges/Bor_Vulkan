// class wrapping Vulkan's VkGraphicsPipelineCreateInfo struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkGraphicsPipelineCreateInfo 
 * @Author Alessandro Borges 
 */
public class VkGraphicsPipelineCreateInfo extends VkStruct {
	/** ID of this structure [66]  */
	 public static final int TAG = VKGRAPHICSPIPELINECREATEINFO_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType 
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext 
	 */ 
	VkObject 	pNext;

	/**
	 *  VkPipelineCreateFlags 	flags 
	 */ 
	int 	flags;

	/**
	 *  uint32_t 	stageCount 
	 */ 
	int 	stageCount;

	/**
	 *  const VkPipelineShaderStageCreateInfo* 	pStages 
	 */ 
	const VkPipelineShaderStageCreateInfo* 	pStages;

	/**
	 *  const VkPipelineVertexInputStateCreateInfo* 	pVertexInputState 
	 */ 
	const VkPipelineVertexInputStateCreateInfo* 	pVertexInputState;

	/**
	 *  const VkPipelineInputAssemblyStateCreateInfo* 	pInputAssemblyState 
	 */ 
	const VkPipelineInputAssemblyStateCreateInfo* 	pInputAssemblyState;

	/**
	 *  const VkPipelineTessellationStateCreateInfo* 	pTessellationState 
	 */ 
	const VkPipelineTessellationStateCreateInfo* 	pTessellationState;

	/**
	 *  const VkPipelineViewportStateCreateInfo* 	pViewportState 
	 */ 
	const VkPipelineViewportStateCreateInfo* 	pViewportState;

	/**
	 *  const VkPipelineRasterizationStateCreateInfo* 	pRasterizationState 
	 */ 
	const VkPipelineRasterizationStateCreateInfo* 	pRasterizationState;

	/**
	 *  const VkPipelineMultisampleStateCreateInfo* 	pMultisampleState 
	 */ 
	const VkPipelineMultisampleStateCreateInfo* 	pMultisampleState;

	/**
	 *  const VkPipelineDepthStencilStateCreateInfo* 	pDepthStencilState 
	 */ 
	const VkPipelineDepthStencilStateCreateInfo* 	pDepthStencilState;

	/**
	 *  const VkPipelineColorBlendStateCreateInfo* 	pColorBlendState 
	 */ 
	const VkPipelineColorBlendStateCreateInfo* 	pColorBlendState;

	/**
	 *  const VkPipelineDynamicStateCreateInfo* 	pDynamicState 
	 */ 
	const VkPipelineDynamicStateCreateInfo* 	pDynamicState;

	/**
	 *  VkPipelineLayout 	layout 
	 */ 
	VkPipelineLayout 	layout;

	/**
	 *  VkRenderPass 	renderPass 
	 */ 
	VkRenderPass 	renderPass;

	/**
	 *  uint32_t 	subpass 
	 */ 
	int 	subpass;

	/**
	 *  VkPipeline 	basePipelineHandle 
	 */ 
	VkPipeline 	basePipelineHandle;

	/**
	 *  int32_t 	basePipelineIndex 
	 */ 
	int 	basePipelineIndex;

	/**
	 * Ctor
	 */
	public VkGraphicsPipelineCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG); 
	}


	 // /////////////////////
	 //  SETTERS & GETTERS //
	 // /////////////////////

	/**
	 * Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field flags
	 * Prototype: VkPipelineCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkPipelineCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field stageCount
	 * Prototype: uint32_t  stageCount
	 */ 
	 public void stageCount(int stageCount){
		 this.stageCount = stageCount;
		stageCount0(super.ptr, stageCount);
	 }

	/**
	 * get method for field stageCount
	 * Prototype: uint32_t  stageCount
	 */ 
	 public int stageCount(){
		 // return  this.stageCount;
		 return stageCount0(super.ptr);
	 }

	/**
	 * Set method for field pStages
	 * Prototype: const VkPipelineShaderStageCreateInfo*  pStages
	 */ 
	 public void pStages(const VkPipelineShaderStageCreateInfo* pStages){
		 this.pStages = pStages;
		pStages0(super.ptr, pStages);
	 }

	/**
	 * get method for field pStages
	 * Prototype: const VkPipelineShaderStageCreateInfo*  pStages
	 */ 
	 public const VkPipelineShaderStageCreateInfo* pStages(){
		 // return  this.pStages;
		 return pStages0(super.ptr);
	 }

	/**
	 * Set method for field pVertexInputState
	 * Prototype: const VkPipelineVertexInputStateCreateInfo*  pVertexInputState
	 */ 
	 public void pVertexInputState(const VkPipelineVertexInputStateCreateInfo* pVertexInputState){
		 this.pVertexInputState = pVertexInputState;
		pVertexInputState0(super.ptr, pVertexInputState);
	 }

	/**
	 * get method for field pVertexInputState
	 * Prototype: const VkPipelineVertexInputStateCreateInfo*  pVertexInputState
	 */ 
	 public const VkPipelineVertexInputStateCreateInfo* pVertexInputState(){
		 // return  this.pVertexInputState;
		 return pVertexInputState0(super.ptr);
	 }

	/**
	 * Set method for field pInputAssemblyState
	 * Prototype: const VkPipelineInputAssemblyStateCreateInfo*  pInputAssemblyState
	 */ 
	 public void pInputAssemblyState(const VkPipelineInputAssemblyStateCreateInfo* pInputAssemblyState){
		 this.pInputAssemblyState = pInputAssemblyState;
		pInputAssemblyState0(super.ptr, pInputAssemblyState);
	 }

	/**
	 * get method for field pInputAssemblyState
	 * Prototype: const VkPipelineInputAssemblyStateCreateInfo*  pInputAssemblyState
	 */ 
	 public const VkPipelineInputAssemblyStateCreateInfo* pInputAssemblyState(){
		 // return  this.pInputAssemblyState;
		 return pInputAssemblyState0(super.ptr);
	 }

	/**
	 * Set method for field pTessellationState
	 * Prototype: const VkPipelineTessellationStateCreateInfo*  pTessellationState
	 */ 
	 public void pTessellationState(const VkPipelineTessellationStateCreateInfo* pTessellationState){
		 this.pTessellationState = pTessellationState;
		pTessellationState0(super.ptr, pTessellationState);
	 }

	/**
	 * get method for field pTessellationState
	 * Prototype: const VkPipelineTessellationStateCreateInfo*  pTessellationState
	 */ 
	 public const VkPipelineTessellationStateCreateInfo* pTessellationState(){
		 // return  this.pTessellationState;
		 return pTessellationState0(super.ptr);
	 }

	/**
	 * Set method for field pViewportState
	 * Prototype: const VkPipelineViewportStateCreateInfo*  pViewportState
	 */ 
	 public void pViewportState(const VkPipelineViewportStateCreateInfo* pViewportState){
		 this.pViewportState = pViewportState;
		pViewportState0(super.ptr, pViewportState);
	 }

	/**
	 * get method for field pViewportState
	 * Prototype: const VkPipelineViewportStateCreateInfo*  pViewportState
	 */ 
	 public const VkPipelineViewportStateCreateInfo* pViewportState(){
		 // return  this.pViewportState;
		 return pViewportState0(super.ptr);
	 }

	/**
	 * Set method for field pRasterizationState
	 * Prototype: const VkPipelineRasterizationStateCreateInfo*  pRasterizationState
	 */ 
	 public void pRasterizationState(const VkPipelineRasterizationStateCreateInfo* pRasterizationState){
		 this.pRasterizationState = pRasterizationState;
		pRasterizationState0(super.ptr, pRasterizationState);
	 }

	/**
	 * get method for field pRasterizationState
	 * Prototype: const VkPipelineRasterizationStateCreateInfo*  pRasterizationState
	 */ 
	 public const VkPipelineRasterizationStateCreateInfo* pRasterizationState(){
		 // return  this.pRasterizationState;
		 return pRasterizationState0(super.ptr);
	 }

	/**
	 * Set method for field pMultisampleState
	 * Prototype: const VkPipelineMultisampleStateCreateInfo*  pMultisampleState
	 */ 
	 public void pMultisampleState(const VkPipelineMultisampleStateCreateInfo* pMultisampleState){
		 this.pMultisampleState = pMultisampleState;
		pMultisampleState0(super.ptr, pMultisampleState);
	 }

	/**
	 * get method for field pMultisampleState
	 * Prototype: const VkPipelineMultisampleStateCreateInfo*  pMultisampleState
	 */ 
	 public const VkPipelineMultisampleStateCreateInfo* pMultisampleState(){
		 // return  this.pMultisampleState;
		 return pMultisampleState0(super.ptr);
	 }

	/**
	 * Set method for field pDepthStencilState
	 * Prototype: const VkPipelineDepthStencilStateCreateInfo*  pDepthStencilState
	 */ 
	 public void pDepthStencilState(const VkPipelineDepthStencilStateCreateInfo* pDepthStencilState){
		 this.pDepthStencilState = pDepthStencilState;
		pDepthStencilState0(super.ptr, pDepthStencilState);
	 }

	/**
	 * get method for field pDepthStencilState
	 * Prototype: const VkPipelineDepthStencilStateCreateInfo*  pDepthStencilState
	 */ 
	 public const VkPipelineDepthStencilStateCreateInfo* pDepthStencilState(){
		 // return  this.pDepthStencilState;
		 return pDepthStencilState0(super.ptr);
	 }

	/**
	 * Set method for field pColorBlendState
	 * Prototype: const VkPipelineColorBlendStateCreateInfo*  pColorBlendState
	 */ 
	 public void pColorBlendState(const VkPipelineColorBlendStateCreateInfo* pColorBlendState){
		 this.pColorBlendState = pColorBlendState;
		pColorBlendState0(super.ptr, pColorBlendState);
	 }

	/**
	 * get method for field pColorBlendState
	 * Prototype: const VkPipelineColorBlendStateCreateInfo*  pColorBlendState
	 */ 
	 public const VkPipelineColorBlendStateCreateInfo* pColorBlendState(){
		 // return  this.pColorBlendState;
		 return pColorBlendState0(super.ptr);
	 }

	/**
	 * Set method for field pDynamicState
	 * Prototype: const VkPipelineDynamicStateCreateInfo*  pDynamicState
	 */ 
	 public void pDynamicState(const VkPipelineDynamicStateCreateInfo* pDynamicState){
		 this.pDynamicState = pDynamicState;
		pDynamicState0(super.ptr, pDynamicState);
	 }

	/**
	 * get method for field pDynamicState
	 * Prototype: const VkPipelineDynamicStateCreateInfo*  pDynamicState
	 */ 
	 public const VkPipelineDynamicStateCreateInfo* pDynamicState(){
		 // return  this.pDynamicState;
		 return pDynamicState0(super.ptr);
	 }

	/**
	 * Set method for field layout
	 * Prototype: VkPipelineLayout  layout
	 */ 
	 public void layout(VkPipelineLayout layout){
		 this.layout = layout;
		layout0(super.ptr, layout);
	 }

	/**
	 * get method for field layout
	 * Prototype: VkPipelineLayout  layout
	 */ 
	 public VkPipelineLayout layout(){
		 // return  this.layout;
		 return layout0(super.ptr);
	 }

	/**
	 * Set method for field renderPass
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 public void renderPass(VkRenderPass renderPass){
		 this.renderPass = renderPass;
		renderPass0(super.ptr, renderPass);
	 }

	/**
	 * get method for field renderPass
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 public VkRenderPass renderPass(){
		 // return  this.renderPass;
		 return renderPass0(super.ptr);
	 }

	/**
	 * Set method for field subpass
	 * Prototype: uint32_t  subpass
	 */ 
	 public void subpass(int subpass){
		 this.subpass = subpass;
		subpass0(super.ptr, subpass);
	 }

	/**
	 * get method for field subpass
	 * Prototype: uint32_t  subpass
	 */ 
	 public int subpass(){
		 // return  this.subpass;
		 return subpass0(super.ptr);
	 }

	/**
	 * Set method for field basePipelineHandle
	 * Prototype: VkPipeline  basePipelineHandle
	 */ 
	 public void basePipelineHandle(VkPipeline basePipelineHandle){
		 this.basePipelineHandle = basePipelineHandle;
		basePipelineHandle0(super.ptr, basePipelineHandle);
	 }

	/**
	 * get method for field basePipelineHandle
	 * Prototype: VkPipeline  basePipelineHandle
	 */ 
	 public VkPipeline basePipelineHandle(){
		 // return  this.basePipelineHandle;
		 return basePipelineHandle0(super.ptr);
	 }

	/**
	 * Set method for field basePipelineIndex
	 * Prototype: int32_t  basePipelineIndex
	 */ 
	 public void basePipelineIndex(int basePipelineIndex){
		 this.basePipelineIndex = basePipelineIndex;
		basePipelineIndex0(super.ptr, basePipelineIndex);
	 }

	/**
	 * get method for field basePipelineIndex
	 * Prototype: int32_t  basePipelineIndex
	 */ 
	 public int basePipelineIndex(){
		 // return  this.basePipelineIndex;
		 return basePipelineIndex0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkPipelineCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.flags = (VkPipelineCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkPipelineCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (jint) (_obj.VkPipelineCreateFlags);
	 */

	/**
	 * native Set method for field stageCount
	 * Prototype: uint32_t  stageCount
	 */ 
	 private static native void stageCount0(ByteBuffer ptr, int _stageCount);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.stageCount = (uint32_t) (_stageCount);
	  */

	/**
	 * get method for field stageCount
	 * Prototype: uint32_t  stageCount
	 */ 
	 private static native int stageCount0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field pStages
	 * Prototype: const VkPipelineShaderStageCreateInfo*  pStages
	 */ 
	 private static native void pStages0(ByteBuffer ptr, const VkPipelineShaderStageCreateInfo* _pStages);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.pStages = (const VkPipelineShaderStageCreateInfo*) (_pStages);
	  */

	/**
	 * get method for field pStages
	 * Prototype: const VkPipelineShaderStageCreateInfo*  pStages
	 */ 
	 private static native const VkPipelineShaderStageCreateInfo* pStages0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (const VkPipelineShaderStageCreateInfo*) (_obj.const VkPipelineShaderStageCreateInfo*);
	 */

	/**
	 * native Set method for field pVertexInputState
	 * Prototype: const VkPipelineVertexInputStateCreateInfo*  pVertexInputState
	 */ 
	 private static native void pVertexInputState0(ByteBuffer ptr, const VkPipelineVertexInputStateCreateInfo* _pVertexInputState);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.pVertexInputState = (const VkPipelineVertexInputStateCreateInfo*) (_pVertexInputState);
	  */

	/**
	 * get method for field pVertexInputState
	 * Prototype: const VkPipelineVertexInputStateCreateInfo*  pVertexInputState
	 */ 
	 private static native const VkPipelineVertexInputStateCreateInfo* pVertexInputState0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (const VkPipelineVertexInputStateCreateInfo*) (_obj.const VkPipelineVertexInputStateCreateInfo*);
	 */

	/**
	 * native Set method for field pInputAssemblyState
	 * Prototype: const VkPipelineInputAssemblyStateCreateInfo*  pInputAssemblyState
	 */ 
	 private static native void pInputAssemblyState0(ByteBuffer ptr, const VkPipelineInputAssemblyStateCreateInfo* _pInputAssemblyState);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.pInputAssemblyState = (const VkPipelineInputAssemblyStateCreateInfo*) (_pInputAssemblyState);
	  */

	/**
	 * get method for field pInputAssemblyState
	 * Prototype: const VkPipelineInputAssemblyStateCreateInfo*  pInputAssemblyState
	 */ 
	 private static native const VkPipelineInputAssemblyStateCreateInfo* pInputAssemblyState0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (const VkPipelineInputAssemblyStateCreateInfo*) (_obj.const VkPipelineInputAssemblyStateCreateInfo*);
	 */

	/**
	 * native Set method for field pTessellationState
	 * Prototype: const VkPipelineTessellationStateCreateInfo*  pTessellationState
	 */ 
	 private static native void pTessellationState0(ByteBuffer ptr, const VkPipelineTessellationStateCreateInfo* _pTessellationState);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.pTessellationState = (const VkPipelineTessellationStateCreateInfo*) (_pTessellationState);
	  */

	/**
	 * get method for field pTessellationState
	 * Prototype: const VkPipelineTessellationStateCreateInfo*  pTessellationState
	 */ 
	 private static native const VkPipelineTessellationStateCreateInfo* pTessellationState0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (const VkPipelineTessellationStateCreateInfo*) (_obj.const VkPipelineTessellationStateCreateInfo*);
	 */

	/**
	 * native Set method for field pViewportState
	 * Prototype: const VkPipelineViewportStateCreateInfo*  pViewportState
	 */ 
	 private static native void pViewportState0(ByteBuffer ptr, const VkPipelineViewportStateCreateInfo* _pViewportState);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.pViewportState = (const VkPipelineViewportStateCreateInfo*) (_pViewportState);
	  */

	/**
	 * get method for field pViewportState
	 * Prototype: const VkPipelineViewportStateCreateInfo*  pViewportState
	 */ 
	 private static native const VkPipelineViewportStateCreateInfo* pViewportState0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (const VkPipelineViewportStateCreateInfo*) (_obj.const VkPipelineViewportStateCreateInfo*);
	 */

	/**
	 * native Set method for field pRasterizationState
	 * Prototype: const VkPipelineRasterizationStateCreateInfo*  pRasterizationState
	 */ 
	 private static native void pRasterizationState0(ByteBuffer ptr, const VkPipelineRasterizationStateCreateInfo* _pRasterizationState);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.pRasterizationState = (const VkPipelineRasterizationStateCreateInfo*) (_pRasterizationState);
	  */

	/**
	 * get method for field pRasterizationState
	 * Prototype: const VkPipelineRasterizationStateCreateInfo*  pRasterizationState
	 */ 
	 private static native const VkPipelineRasterizationStateCreateInfo* pRasterizationState0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (const VkPipelineRasterizationStateCreateInfo*) (_obj.const VkPipelineRasterizationStateCreateInfo*);
	 */

	/**
	 * native Set method for field pMultisampleState
	 * Prototype: const VkPipelineMultisampleStateCreateInfo*  pMultisampleState
	 */ 
	 private static native void pMultisampleState0(ByteBuffer ptr, const VkPipelineMultisampleStateCreateInfo* _pMultisampleState);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.pMultisampleState = (const VkPipelineMultisampleStateCreateInfo*) (_pMultisampleState);
	  */

	/**
	 * get method for field pMultisampleState
	 * Prototype: const VkPipelineMultisampleStateCreateInfo*  pMultisampleState
	 */ 
	 private static native const VkPipelineMultisampleStateCreateInfo* pMultisampleState0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (const VkPipelineMultisampleStateCreateInfo*) (_obj.const VkPipelineMultisampleStateCreateInfo*);
	 */

	/**
	 * native Set method for field pDepthStencilState
	 * Prototype: const VkPipelineDepthStencilStateCreateInfo*  pDepthStencilState
	 */ 
	 private static native void pDepthStencilState0(ByteBuffer ptr, const VkPipelineDepthStencilStateCreateInfo* _pDepthStencilState);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.pDepthStencilState = (const VkPipelineDepthStencilStateCreateInfo*) (_pDepthStencilState);
	  */

	/**
	 * get method for field pDepthStencilState
	 * Prototype: const VkPipelineDepthStencilStateCreateInfo*  pDepthStencilState
	 */ 
	 private static native const VkPipelineDepthStencilStateCreateInfo* pDepthStencilState0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (const VkPipelineDepthStencilStateCreateInfo*) (_obj.const VkPipelineDepthStencilStateCreateInfo*);
	 */

	/**
	 * native Set method for field pColorBlendState
	 * Prototype: const VkPipelineColorBlendStateCreateInfo*  pColorBlendState
	 */ 
	 private static native void pColorBlendState0(ByteBuffer ptr, const VkPipelineColorBlendStateCreateInfo* _pColorBlendState);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.pColorBlendState = (const VkPipelineColorBlendStateCreateInfo*) (_pColorBlendState);
	  */

	/**
	 * get method for field pColorBlendState
	 * Prototype: const VkPipelineColorBlendStateCreateInfo*  pColorBlendState
	 */ 
	 private static native const VkPipelineColorBlendStateCreateInfo* pColorBlendState0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (const VkPipelineColorBlendStateCreateInfo*) (_obj.const VkPipelineColorBlendStateCreateInfo*);
	 */

	/**
	 * native Set method for field pDynamicState
	 * Prototype: const VkPipelineDynamicStateCreateInfo*  pDynamicState
	 */ 
	 private static native void pDynamicState0(ByteBuffer ptr, const VkPipelineDynamicStateCreateInfo* _pDynamicState);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.pDynamicState = (const VkPipelineDynamicStateCreateInfo*) (_pDynamicState);
	  */

	/**
	 * get method for field pDynamicState
	 * Prototype: const VkPipelineDynamicStateCreateInfo*  pDynamicState
	 */ 
	 private static native const VkPipelineDynamicStateCreateInfo* pDynamicState0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (const VkPipelineDynamicStateCreateInfo*) (_obj.const VkPipelineDynamicStateCreateInfo*);
	 */

	/**
	 * native Set method for field layout
	 * Prototype: VkPipelineLayout  layout
	 */ 
	 private static native void layout0(ByteBuffer ptr, VkPipelineLayout _layout);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.layout = (VkPipelineLayout) (_layout);
	  */

	/**
	 * get method for field layout
	 * Prototype: VkPipelineLayout  layout
	 */ 
	 private static native VkPipelineLayout layout0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (VkPipelineLayout) (_obj.VkPipelineLayout);
	 */

	/**
	 * native Set method for field renderPass
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native void renderPass0(ByteBuffer ptr, VkRenderPass _renderPass);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.renderPass = (VkRenderPass) (_renderPass);
	  */

	/**
	 * get method for field renderPass
	 * Prototype: VkRenderPass  renderPass
	 */ 
	 private static native VkRenderPass renderPass0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (VkRenderPass) (_obj.VkRenderPass);
	 */

	/**
	 * native Set method for field subpass
	 * Prototype: uint32_t  subpass
	 */ 
	 private static native void subpass0(ByteBuffer ptr, int _subpass);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.subpass = (uint32_t) (_subpass);
	  */

	/**
	 * get method for field subpass
	 * Prototype: uint32_t  subpass
	 */ 
	 private static native int subpass0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field basePipelineHandle
	 * Prototype: VkPipeline  basePipelineHandle
	 */ 
	 private static native void basePipelineHandle0(ByteBuffer ptr, VkPipeline _basePipelineHandle);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.basePipelineHandle = (VkPipeline) (_basePipelineHandle);
	  */

	/**
	 * get method for field basePipelineHandle
	 * Prototype: VkPipeline  basePipelineHandle
	 */ 
	 private static native VkPipeline basePipelineHandle0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (VkPipeline) (_obj.VkPipeline);
	 */

	/**
	 * native Set method for field basePipelineIndex
	 * Prototype: int32_t  basePipelineIndex
	 */ 
	 private static native void basePipelineIndex0(ByteBuffer ptr, int _basePipelineIndex);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(*ptr);
		  _obj.basePipelineIndex = (int32_t) (_basePipelineIndex);
	  */

	/**
	 * get method for field basePipelineIndex
	 * Prototype: int32_t  basePipelineIndex
	 */ 
	 private static native int basePipelineIndex0(ByteBuffer ptr);/*
		  VkGraphicsPipelineCreateInfo _obj = (VkGraphicsPipelineCreateInfo)(ptr);
		  return (jint) (_obj.int32_t);
	 */



} // end of class VkGraphicsPipelineCreateInfo
