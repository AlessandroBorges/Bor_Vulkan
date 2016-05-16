#include <bor.vulkan.structs.VkPhysicalDeviceFeatures.h>

//@line:91

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setRobustBufferAccess0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _robustBufferAccess) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1638

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->robustBufferAccess = (VkBool32) (_robustBufferAccess);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getRobustBufferAccess0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1647

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->robustBufferAccess);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getRobustBufferAccess0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getRobustBufferAccess0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setFullDrawIndexUint320(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _fullDrawIndexUint32) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1656

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->fullDrawIndexUint32 = (VkBool32) (_fullDrawIndexUint32);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getFullDrawIndexUint320
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1665

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->fullDrawIndexUint32);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getFullDrawIndexUint320(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getFullDrawIndexUint320(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setImageCubeArray0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _imageCubeArray) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1674

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->imageCubeArray = (VkBool32) (_imageCubeArray);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getImageCubeArray0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1683

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->imageCubeArray);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getImageCubeArray0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getImageCubeArray0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setIndependentBlend0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _independentBlend) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1692

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->independentBlend = (VkBool32) (_independentBlend);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getIndependentBlend0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1701

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->independentBlend);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getIndependentBlend0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getIndependentBlend0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setGeometryShader0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _geometryShader) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1710

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->geometryShader = (VkBool32) (_geometryShader);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getGeometryShader0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1719

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->geometryShader);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getGeometryShader0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getGeometryShader0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setTessellationShader0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _tessellationShader) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1728

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->tessellationShader = (VkBool32) (_tessellationShader);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getTessellationShader0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1737

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->tessellationShader);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getTessellationShader0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getTessellationShader0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setSampleRateShading0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _sampleRateShading) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1746

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->sampleRateShading = (VkBool32) (_sampleRateShading);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSampleRateShading0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1755

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->sampleRateShading);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSampleRateShading0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSampleRateShading0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setDualSrcBlend0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _dualSrcBlend) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1764

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->dualSrcBlend = (VkBool32) (_dualSrcBlend);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getDualSrcBlend0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1773

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->dualSrcBlend);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getDualSrcBlend0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getDualSrcBlend0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setLogicOp0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _logicOp) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1782

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->logicOp = (VkBool32) (_logicOp);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getLogicOp0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1791

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->logicOp);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getLogicOp0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getLogicOp0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setMultiDrawIndirect0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _multiDrawIndirect) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1800

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->multiDrawIndirect = (VkBool32) (_multiDrawIndirect);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getMultiDrawIndirect0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1809

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->multiDrawIndirect);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getMultiDrawIndirect0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getMultiDrawIndirect0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setDrawIndirectFirstInstance0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _drawIndirectFirstInstance) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1818

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->drawIndirectFirstInstance = (VkBool32) (_drawIndirectFirstInstance);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getDrawIndirectFirstInstance0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1827

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->drawIndirectFirstInstance);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getDrawIndirectFirstInstance0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getDrawIndirectFirstInstance0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setDepthClamp0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _depthClamp) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1836

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->depthClamp = (VkBool32) (_depthClamp);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getDepthClamp0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1845

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->depthClamp);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getDepthClamp0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getDepthClamp0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setDepthBiasClamp0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _depthBiasClamp) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1854

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->depthBiasClamp = (VkBool32) (_depthBiasClamp);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getDepthBiasClamp0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1863

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->depthBiasClamp);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getDepthBiasClamp0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getDepthBiasClamp0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setFillModeNonSolid0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _fillModeNonSolid) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1872

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->fillModeNonSolid = (VkBool32) (_fillModeNonSolid);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getFillModeNonSolid0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1881

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->fillModeNonSolid);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getFillModeNonSolid0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getFillModeNonSolid0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setDepthBounds0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _depthBounds) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1890

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->depthBounds = (VkBool32) (_depthBounds);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getDepthBounds0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1899

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->depthBounds);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getDepthBounds0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getDepthBounds0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setWideLines0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _wideLines) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1908

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->wideLines = (VkBool32) (_wideLines);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getWideLines0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1917

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->wideLines);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getWideLines0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getWideLines0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setLargePoints0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _largePoints) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1926

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->largePoints = (VkBool32) (_largePoints);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getLargePoints0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1935

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->largePoints);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getLargePoints0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getLargePoints0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setAlphaToOne0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _alphaToOne) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1944

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->alphaToOne = (VkBool32) (_alphaToOne);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getAlphaToOne0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1953

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->alphaToOne);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getAlphaToOne0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getAlphaToOne0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setMultiViewport0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _multiViewport) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1962

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->multiViewport = (VkBool32) (_multiViewport);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getMultiViewport0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1971

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->multiViewport);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getMultiViewport0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getMultiViewport0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setSamplerAnisotropy0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _samplerAnisotropy) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1980

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->samplerAnisotropy = (VkBool32) (_samplerAnisotropy);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSamplerAnisotropy0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1989

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->samplerAnisotropy);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSamplerAnisotropy0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSamplerAnisotropy0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setTextureCompressionETC20(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _textureCompressionETC2) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1998

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->textureCompressionETC2 = (VkBool32) (_textureCompressionETC2);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getTextureCompressionETC20
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2007

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->textureCompressionETC2);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getTextureCompressionETC20(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getTextureCompressionETC20(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setTextureCompressionASTCLDR0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _textureCompressionASTCLDR) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2016

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->textureCompressionASTC_LDR = (VkBool32) (_textureCompressionASTCLDR);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getTextureCompressionASTCLDR0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2025

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->textureCompressionASTC_LDR);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getTextureCompressionASTCLDR0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getTextureCompressionASTCLDR0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setTextureCompressionBC0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _textureCompressionBC) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2034

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->textureCompressionBC = (VkBool32) (_textureCompressionBC);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getTextureCompressionBC0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2043

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->textureCompressionBC);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getTextureCompressionBC0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getTextureCompressionBC0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setOcclusionQueryPrecise0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _occlusionQueryPrecise) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2052

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->occlusionQueryPrecise = (VkBool32) (_occlusionQueryPrecise);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getOcclusionQueryPrecise0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2061

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->occlusionQueryPrecise);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getOcclusionQueryPrecise0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getOcclusionQueryPrecise0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setPipelineStatisticsQuery0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _pipelineStatisticsQuery) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2070

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->pipelineStatisticsQuery = (VkBool32) (_pipelineStatisticsQuery);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getPipelineStatisticsQuery0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2079

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->pipelineStatisticsQuery);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getPipelineStatisticsQuery0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getPipelineStatisticsQuery0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setVertexPipelineStoresAndAtomics0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _vertexPipelineStoresAndAtomics) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2088

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->vertexPipelineStoresAndAtomics = (VkBool32) (_vertexPipelineStoresAndAtomics);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getVertexPipelineStoresAndAtomics0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2097

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->vertexPipelineStoresAndAtomics);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getVertexPipelineStoresAndAtomics0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getVertexPipelineStoresAndAtomics0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setFragmentStoresAndAtomics0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _fragmentStoresAndAtomics) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2106

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->fragmentStoresAndAtomics = (VkBool32) (_fragmentStoresAndAtomics);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getFragmentStoresAndAtomics0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2115

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->fragmentStoresAndAtomics);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getFragmentStoresAndAtomics0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getFragmentStoresAndAtomics0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setShaderTessellationAndGeometryPointSize0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _shaderTessellationAndGeometryPointSize) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2124

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->shaderTessellationAndGeometryPointSize = (VkBool32) (_shaderTessellationAndGeometryPointSize);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderTessellationAndGeometryPointSize0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2133

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderTessellationAndGeometryPointSize);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderTessellationAndGeometryPointSize0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderTessellationAndGeometryPointSize0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setShaderImageGatherExtended0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _shaderImageGatherExtended) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2142

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->shaderImageGatherExtended = (VkBool32) (_shaderImageGatherExtended);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderImageGatherExtended0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2151

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderImageGatherExtended);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderImageGatherExtended0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderImageGatherExtended0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setShaderStorageImageExtendedFormats0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _shaderStorageImageExtendedFormats) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2160

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->shaderStorageImageExtendedFormats = (VkBool32) (_shaderStorageImageExtendedFormats);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderStorageImageExtendedFormats0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2169

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderStorageImageExtendedFormats);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderStorageImageExtendedFormats0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderStorageImageExtendedFormats0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setShaderStorageImageMultisample0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _shaderStorageImageMultisample) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2178

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->shaderStorageImageMultisample = (VkBool32) (_shaderStorageImageMultisample);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderStorageImageMultisample0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2187

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderStorageImageMultisample);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderStorageImageMultisample0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderStorageImageMultisample0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setShaderStorageImageReadWithoutFormat0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _shaderStorageImageReadWithoutFormat) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2196

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->shaderStorageImageReadWithoutFormat = (VkBool32) (_shaderStorageImageReadWithoutFormat);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderStorageImageReadWithoutFormat0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2205

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderStorageImageReadWithoutFormat);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderStorageImageReadWithoutFormat0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderStorageImageReadWithoutFormat0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setShaderStorageImageWriteWithoutFormat0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _shaderStorageImageWriteWithoutFormat) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2214

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->shaderStorageImageWriteWithoutFormat = (VkBool32) (_shaderStorageImageWriteWithoutFormat);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderStorageImageWriteWithoutFormat0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2223

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderStorageImageWriteWithoutFormat);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderStorageImageWriteWithoutFormat0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderStorageImageWriteWithoutFormat0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setShaderUniformBufferArrayDynamicIndexing0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _shaderUniformBufferArrayDynamicIndexing) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2232

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->shaderUniformBufferArrayDynamicIndexing = (VkBool32) (_shaderUniformBufferArrayDynamicIndexing);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderUniformBufferArrayDynamicIndexing0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2241

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderUniformBufferArrayDynamicIndexing);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderUniformBufferArrayDynamicIndexing0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderUniformBufferArrayDynamicIndexing0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setShaderSampledImageArrayDynamicIndexing0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _shaderSampledImageArrayDynamicIndexing) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2250

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->shaderSampledImageArrayDynamicIndexing = (VkBool32) (_shaderSampledImageArrayDynamicIndexing);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderSampledImageArrayDynamicIndexing0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2259

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderSampledImageArrayDynamicIndexing);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderSampledImageArrayDynamicIndexing0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderSampledImageArrayDynamicIndexing0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setShaderStorageBufferArrayDynamicIndexing0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _shaderStorageBufferArrayDynamicIndexing) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2268

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->shaderStorageBufferArrayDynamicIndexing = (VkBool32) (_shaderStorageBufferArrayDynamicIndexing);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderStorageBufferArrayDynamicIndexing0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2277

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderStorageBufferArrayDynamicIndexing);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderStorageBufferArrayDynamicIndexing0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderStorageBufferArrayDynamicIndexing0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setShaderStorageImageArrayDynamicIndexing0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _shaderStorageImageArrayDynamicIndexing) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2286

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->shaderStorageImageArrayDynamicIndexing = (VkBool32) (_shaderStorageImageArrayDynamicIndexing);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderStorageImageArrayDynamicIndexing0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2295

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderStorageImageArrayDynamicIndexing);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderStorageImageArrayDynamicIndexing0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderStorageImageArrayDynamicIndexing0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setShaderClipDistance0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _shaderClipDistance) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2304

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->shaderClipDistance = (VkBool32) (_shaderClipDistance);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderClipDistance0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2313

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderClipDistance);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderClipDistance0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderClipDistance0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setShaderCullDistance0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _shaderCullDistance) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2322

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->shaderCullDistance = (VkBool32) (_shaderCullDistance);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderCullDistance0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2331

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderCullDistance);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderCullDistance0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderCullDistance0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setShaderFloat640(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _shaderFloat64) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2340

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->shaderFloat64 = (VkBool32) (_shaderFloat64);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderFloat640
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2349

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderFloat64);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderFloat640(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderFloat640(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setShaderInt640(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _shaderInt64) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2358

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->shaderInt64 = (VkBool32) (_shaderInt64);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderInt640
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2367

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderInt64);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderInt640(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderInt640(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setShaderInt160(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _shaderInt16) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2376

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->shaderInt16 = (VkBool32) (_shaderInt16);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderInt160
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2385

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderInt16);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderInt160(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderInt160(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setShaderResourceResidency0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _shaderResourceResidency) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2394

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->shaderResourceResidency = (VkBool32) (_shaderResourceResidency);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderResourceResidency0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2403

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderResourceResidency);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderResourceResidency0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderResourceResidency0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setShaderResourceMinLod0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _shaderResourceMinLod) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2412

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->shaderResourceMinLod = (VkBool32) (_shaderResourceMinLod);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderResourceMinLod0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2421

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->shaderResourceMinLod);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderResourceMinLod0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getShaderResourceMinLod0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setSparseBinding0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _sparseBinding) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2430

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->sparseBinding = (VkBool32) (_sparseBinding);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseBinding0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2439

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->sparseBinding);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseBinding0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseBinding0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setSparseResidencyBuffer0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _sparseResidencyBuffer) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2448

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->sparseResidencyBuffer = (VkBool32) (_sparseResidencyBuffer);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseResidencyBuffer0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2457

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->sparseResidencyBuffer);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseResidencyBuffer0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseResidencyBuffer0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setSparseResidencyImage2D0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _sparseResidencyImage2D) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2466

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->sparseResidencyImage2D = (VkBool32) (_sparseResidencyImage2D);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseResidencyImage2D0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2475

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->sparseResidencyImage2D);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseResidencyImage2D0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseResidencyImage2D0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setSparseResidencyImage3D0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _sparseResidencyImage3D) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2484

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->sparseResidencyImage3D = (VkBool32) (_sparseResidencyImage3D);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseResidencyImage3D0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2493

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->sparseResidencyImage3D);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseResidencyImage3D0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseResidencyImage3D0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setSparseResidency2Samples0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _sparseResidency2Samples) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2502

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->sparseResidency2Samples = (VkBool32) (_sparseResidency2Samples);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseResidency2Samples0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2511

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->sparseResidency2Samples);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseResidency2Samples0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseResidency2Samples0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setSparseResidency4Samples0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _sparseResidency4Samples) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2520

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->sparseResidency4Samples = (VkBool32) (_sparseResidency4Samples);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseResidency4Samples0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2529

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->sparseResidency4Samples);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseResidency4Samples0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseResidency4Samples0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setSparseResidency8Samples0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _sparseResidency8Samples) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2538

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->sparseResidency8Samples = (VkBool32) (_sparseResidency8Samples);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseResidency8Samples0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2547

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->sparseResidency8Samples);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseResidency8Samples0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseResidency8Samples0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setSparseResidency16Samples0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _sparseResidency16Samples) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2556

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->sparseResidency16Samples = (VkBool32) (_sparseResidency16Samples);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseResidency16Samples0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2565

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->sparseResidency16Samples);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseResidency16Samples0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseResidency16Samples0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setSparseResidencyAliased0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _sparseResidencyAliased) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2574

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->sparseResidencyAliased = (VkBool32) (_sparseResidencyAliased);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseResidencyAliased0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2583

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->sparseResidencyAliased);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseResidencyAliased0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getSparseResidencyAliased0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setVariableMultisampleRate0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _variableMultisampleRate) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2592

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->variableMultisampleRate = (VkBool32) (_variableMultisampleRate);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getVariableMultisampleRate0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2601

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->variableMultisampleRate);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getVariableMultisampleRate0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getVariableMultisampleRate0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_setInheritedQueries0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _inheritedQueries) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:2610

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  vkObj->inheritedQueries = (VkBool32) (_inheritedQueries);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getInheritedQueries0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:2619

		  VkPhysicalDeviceFeatures* vkObj = (VkPhysicalDeviceFeatures*)(ptr);
		  return (jboolean) (vkObj->inheritedQueries);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getInheritedQueries0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceFeatures_getInheritedQueries0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

