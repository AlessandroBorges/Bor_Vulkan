#include <bor.vulkan.structs.VkGraphicsPipelineCreateInfo.h>

//@line:56

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:850

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:860

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:869

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:879

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:889

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:899

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_setStageCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _stageCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:908

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->stageCount = (uint32_t) (_stageCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getStageCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:918

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  return (jint) (vkObj->stageCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getStageCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getStageCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_setPStages0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pStages) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pStages = (char*)(obj__pStages?env->GetDirectBufferAddress(obj__pStages) : NULL);


//@line:927

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pStages = (const VkPipelineShaderStageCreateInfo*) (_pStages);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPStages0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:937

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pStages );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPStages0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPStages0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_setPVertexInputState0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pVertexInputState) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pVertexInputState = (char*)(obj__pVertexInputState?env->GetDirectBufferAddress(obj__pVertexInputState) : NULL);


//@line:947

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pVertexInputState = (const VkPipelineVertexInputStateCreateInfo*) (_pVertexInputState);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPVertexInputState0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:957

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pVertexInputState);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPVertexInputState0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPVertexInputState0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_setPInputAssemblyState0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pInputAssemblyState) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pInputAssemblyState = (char*)(obj__pInputAssemblyState?env->GetDirectBufferAddress(obj__pInputAssemblyState) : NULL);


//@line:967

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pInputAssemblyState = (const VkPipelineInputAssemblyStateCreateInfo*) (_pInputAssemblyState);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPInputAssemblyState0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:977

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pInputAssemblyState);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPInputAssemblyState0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPInputAssemblyState0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_setPTessellationState0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pTessellationState) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pTessellationState = (char*)(obj__pTessellationState?env->GetDirectBufferAddress(obj__pTessellationState) : NULL);


//@line:987

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pTessellationState = (const VkPipelineTessellationStateCreateInfo*) (_pTessellationState);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPTessellationState0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:997

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pTessellationState);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPTessellationState0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPTessellationState0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_setPViewportState0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pViewportState) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pViewportState = (char*)(obj__pViewportState?env->GetDirectBufferAddress(obj__pViewportState) : NULL);


//@line:1007

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pViewportState = (const VkPipelineViewportStateCreateInfo*) (_pViewportState);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPViewportState0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1017

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pViewportState);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPViewportState0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPViewportState0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_setPRasterizationState0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pRasterizationState) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pRasterizationState = (char*)(obj__pRasterizationState?env->GetDirectBufferAddress(obj__pRasterizationState) : NULL);


//@line:1027

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pRasterizationState = (const VkPipelineRasterizationStateCreateInfo*) (_pRasterizationState);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPRasterizationState0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1037

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pRasterizationState);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPRasterizationState0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPRasterizationState0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_setPMultisampleState0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pMultisampleState) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pMultisampleState = (char*)(obj__pMultisampleState?env->GetDirectBufferAddress(obj__pMultisampleState) : NULL);


//@line:1047

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pMultisampleState = (const VkPipelineMultisampleStateCreateInfo*) (_pMultisampleState);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPMultisampleState0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1057

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pMultisampleState);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPMultisampleState0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPMultisampleState0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_setPDepthStencilState0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pDepthStencilState) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pDepthStencilState = (char*)(obj__pDepthStencilState?env->GetDirectBufferAddress(obj__pDepthStencilState) : NULL);


//@line:1067

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pDepthStencilState = (const VkPipelineDepthStencilStateCreateInfo*) (_pDepthStencilState);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPDepthStencilState0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1077

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pDepthStencilState);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPDepthStencilState0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPDepthStencilState0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_setPColorBlendState0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pColorBlendState) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pColorBlendState = (char*)(obj__pColorBlendState?env->GetDirectBufferAddress(obj__pColorBlendState) : NULL);


//@line:1087

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pColorBlendState = (const VkPipelineColorBlendStateCreateInfo*) (_pColorBlendState);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPColorBlendState0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1097

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pColorBlendState);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPColorBlendState0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPColorBlendState0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_setPDynamicState0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pDynamicState) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pDynamicState = (char*)(obj__pDynamicState?env->GetDirectBufferAddress(obj__pDynamicState) : NULL);


//@line:1107

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pDynamicState = (const VkPipelineDynamicStateCreateInfo*) (_pDynamicState);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPDynamicState0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1117

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pDynamicState);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPDynamicState0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getPDynamicState0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_setLayout0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _layout) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1127

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->layout = (VkPipelineLayout) (_layout);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getLayout0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1137

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->layout);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getLayout0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getLayout0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_setRenderPass0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _renderPass) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1147

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->renderPass = (VkRenderPass) (_renderPass);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getRenderPass0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1157

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->renderPass);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getRenderPass0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getRenderPass0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_setSubpass0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _subpass) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1167

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->subpass = (uint32_t) (_subpass);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getSubpass0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1177

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  return (jint) (vkObj->subpass);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getSubpass0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getSubpass0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_setBasePipelineHandle0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _basePipelineHandle) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1186

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->basePipelineHandle = (VkPipeline) (_basePipelineHandle);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getBasePipelineHandle0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1196

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->basePipelineHandle);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getBasePipelineHandle0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getBasePipelineHandle0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_setBasePipelineIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _basePipelineIndex) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1206

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->basePipelineIndex = (int32_t) (_basePipelineIndex);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getBasePipelineIndex0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1216

		  VkGraphicsPipelineCreateInfo* vkObj = (VkGraphicsPipelineCreateInfo*)(ptr);
		  return (jint) (vkObj->basePipelineIndex);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getBasePipelineIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkGraphicsPipelineCreateInfo_getBasePipelineIndex0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

