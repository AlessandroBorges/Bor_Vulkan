/**
 * 
 */
package bor.vulkan.structs;

import java.beans.XMLEncoder;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * @author Alessandro Borges
 * Class to holdOn 
 */
public class CStructInfo {    
   
  
   public  int structID;   
   public  String structName;
   public  int sizeOfStruct; 
   public  String[] fieldName;
   public  int[] size;
   public  int[] offset;
   public  String[] ctype;
   public  String[] jtype;
   public  boolean[] isPtr;
   
   /**
    * Ctor
    */
   public CStructInfo() {
     
   }
   
   /**
    * 
    * @return
    */
   public String toXML(){
       ByteArrayOutputStream out = new ByteArrayOutputStream();
       XMLEncoder e = new XMLEncoder(out);
       e.writeObject(this);
       e.close();
       return out.toString();
   }
   
    /**
     * @return the structID
     */
    public int getStructID() {
        return structID;
    }

    /**
     * @param structID the structID to set
     */
    public void setStructID(int structID) {
        this.structID = structID;
    }

    /**
     * @return the structName
     */
    public String getStructName() {
        return structName;
    }

    /**
     * @param structName the structName to set
     */
    public void setStructName(String structName) {
        this.structName = structName;
    }

    /**
     * @return the sizeOfStruct
     */
    public int getSizeOfStruct() {
        return sizeOfStruct;
    }

    /**
     * @param sizeOfStruct the sizeOfStruct to set
     */
    public void setSizeOfStruct(int sizeOfStruct) {
        this.sizeOfStruct = sizeOfStruct;
    }

    /**
     * @return the fieldName
     */
    public String[] getFieldName() {
        return fieldName;
    }

    /**
     * @param fieldName the fieldName to set
     */
    public void setFieldName(String[] fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * @return the size
     */
    public int[] getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int[] size) {
        this.size = size;
    }

    /**
     * @return the offset
     */
    public int[] getOffset() {
        return offset;
    }

    /**
     * @param offset the offset to set
     */
    public void setOffset(int[] offset) {
        this.offset = offset;
    }

    /**
     * @return the ctype
     */
    public String[] getCtype() {
        return ctype;
    }

    /**
     * @param ctype the ctype to set
     */
    public void setCtype(String[] ctype) {
        this.ctype = ctype;
    }

    /**
     * @return the jtype
     */
    public String[] getJtype() {
        return jtype;
    }

    /**
     * @param jtype the jtype to set
     */
    public void setJtype(String[] jtype) {
        this.jtype = jtype;
    }

    /**
     * @return the isPtr
     */
    public boolean[] getIsPtr() {
        return isPtr;
    }

    /**
     * @param isPtr the isPtr to set
     */
    public void setIsPtr(boolean[] isPtr) {
        this.isPtr = isPtr;
    }

/////////////////////////////////////////////////

/* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString() {
       StringBuilder builder = new StringBuilder();
       builder.append("CStructInfo [structID=").append(structID).append(", ");
       if (structName != null) builder.append("structName=").append(structName).append(", ");
       builder.append("sizeOfStruct=").append(sizeOfStruct).append(", ");
       if (fieldName != null) builder.append("fieldName=").append(Arrays.toString(fieldName)).append(", ");
       if (size != null) builder.append("size=").append(Arrays.toString(size)).append(", ");
       if (offset != null) builder.append("offset=").append(Arrays.toString(offset)).append(", ");
       if (jtype != null) builder.append("jtype=").append(Arrays.toString(jtype)).append(", ");
       if (isPtr != null) builder.append("isPtr=").append(Arrays.toString(isPtr));
       builder.append("]");
       return builder.toString();
   }

   

  
	 public static final int MEMBERS_OF_VkApplicationInfo = 7;

	 private native int introspectVkApplicationInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkApplicationInfo, sType); 
		 size  [0] = sizeof  (VkApplicationInfo::sType); 

		 offset[1] = offsetof(VkApplicationInfo, pNext); 
		 size  [1] = sizeof  (VkApplicationInfo::pNext); 

		 offset[2] = offsetof(VkApplicationInfo, pApplicationName); 
		 size  [2] = sizeof  (VkApplicationInfo::pApplicationName); 

		 offset[3] = offsetof(VkApplicationInfo, applicationVersion); 
		 size  [3] = sizeof  (VkApplicationInfo::applicationVersion); 

		 offset[4] = offsetof(VkApplicationInfo, pEngineName); 
		 size  [4] = sizeof  (VkApplicationInfo::pEngineName); 

		 offset[5] = offsetof(VkApplicationInfo, engineVersion); 
		 size  [5] = sizeof  (VkApplicationInfo::engineVersion); 

		 offset[6] = offsetof(VkApplicationInfo, apiVersion); 
		 size  [6] = sizeof  (VkApplicationInfo::apiVersion); 

		 return sizeof(VkApplicationInfo)
	 */


	 public static final int MEMBERS_OF_VkInstanceCreateInfo = 8;

	 private native int introspectVkInstanceCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkInstanceCreateInfo, sType); 
		 size  [0] = sizeof  (VkInstanceCreateInfo::sType); 

		 offset[1] = offsetof(VkInstanceCreateInfo, pNext); 
		 size  [1] = sizeof  (VkInstanceCreateInfo::pNext); 

		 offset[2] = offsetof(VkInstanceCreateInfo, flags); 
		 size  [2] = sizeof  (VkInstanceCreateInfo::flags); 

		 offset[3] = offsetof(VkInstanceCreateInfo, pApplicationInfo); 
		 size  [3] = sizeof  (VkInstanceCreateInfo::pApplicationInfo); 

		 offset[4] = offsetof(VkInstanceCreateInfo, enabledLayerCount); 
		 size  [4] = sizeof  (VkInstanceCreateInfo::enabledLayerCount); 

		 offset[5] = offsetof(VkInstanceCreateInfo, ppEnabledLayerNames); 
		 size  [5] = sizeof  (VkInstanceCreateInfo::ppEnabledLayerNames); 

		 offset[6] = offsetof(VkInstanceCreateInfo, enabledExtensionCount); 
		 size  [6] = sizeof  (VkInstanceCreateInfo::enabledExtensionCount); 

		 offset[7] = offsetof(VkInstanceCreateInfo, ppEnabledExtensionNames); 
		 size  [7] = sizeof  (VkInstanceCreateInfo::ppEnabledExtensionNames); 

		 return sizeof(VkInstanceCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkAllocationCallbacks = 6;

	 private native int introspectVkAllocationCallbacks(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkAllocationCallbacks, pUserData); 
		 size  [0] = sizeof  (VkAllocationCallbacks::pUserData); 

		 offset[1] = offsetof(VkAllocationCallbacks, pfnAllocation); 
		 size  [1] = sizeof  (VkAllocationCallbacks::pfnAllocation); 

		 offset[2] = offsetof(VkAllocationCallbacks, pfnReallocation); 
		 size  [2] = sizeof  (VkAllocationCallbacks::pfnReallocation); 

		 offset[3] = offsetof(VkAllocationCallbacks, pfnFree); 
		 size  [3] = sizeof  (VkAllocationCallbacks::pfnFree); 

		 offset[4] = offsetof(VkAllocationCallbacks, pfnInternalAllocation); 
		 size  [4] = sizeof  (VkAllocationCallbacks::pfnInternalAllocation); 

		 offset[5] = offsetof(VkAllocationCallbacks, pfnInternalFree); 
		 size  [5] = sizeof  (VkAllocationCallbacks::pfnInternalFree); 

		 return sizeof(VkAllocationCallbacks)
	 */


	 public static final int MEMBERS_OF_VkPhysicalDeviceFeatures = 55;

	 private native int introspectVkPhysicalDeviceFeatures(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkPhysicalDeviceFeatures, robustBufferAccess); 
		 size  [0] = sizeof  (VkPhysicalDeviceFeatures::robustBufferAccess); 

		 offset[1] = offsetof(VkPhysicalDeviceFeatures, fullDrawIndexUint32); 
		 size  [1] = sizeof  (VkPhysicalDeviceFeatures::fullDrawIndexUint32); 

		 offset[2] = offsetof(VkPhysicalDeviceFeatures, imageCubeArray); 
		 size  [2] = sizeof  (VkPhysicalDeviceFeatures::imageCubeArray); 

		 offset[3] = offsetof(VkPhysicalDeviceFeatures, independentBlend); 
		 size  [3] = sizeof  (VkPhysicalDeviceFeatures::independentBlend); 

		 offset[4] = offsetof(VkPhysicalDeviceFeatures, geometryShader); 
		 size  [4] = sizeof  (VkPhysicalDeviceFeatures::geometryShader); 

		 offset[5] = offsetof(VkPhysicalDeviceFeatures, tessellationShader); 
		 size  [5] = sizeof  (VkPhysicalDeviceFeatures::tessellationShader); 

		 offset[6] = offsetof(VkPhysicalDeviceFeatures, sampleRateShading); 
		 size  [6] = sizeof  (VkPhysicalDeviceFeatures::sampleRateShading); 

		 offset[7] = offsetof(VkPhysicalDeviceFeatures, dualSrcBlend); 
		 size  [7] = sizeof  (VkPhysicalDeviceFeatures::dualSrcBlend); 

		 offset[8] = offsetof(VkPhysicalDeviceFeatures, logicOp); 
		 size  [8] = sizeof  (VkPhysicalDeviceFeatures::logicOp); 

		 offset[9] = offsetof(VkPhysicalDeviceFeatures, multiDrawIndirect); 
		 size  [9] = sizeof  (VkPhysicalDeviceFeatures::multiDrawIndirect); 

		 offset[10] = offsetof(VkPhysicalDeviceFeatures, drawIndirectFirstInstance); 
		 size  [10] = sizeof  (VkPhysicalDeviceFeatures::drawIndirectFirstInstance); 

		 offset[11] = offsetof(VkPhysicalDeviceFeatures, depthClamp); 
		 size  [11] = sizeof  (VkPhysicalDeviceFeatures::depthClamp); 

		 offset[12] = offsetof(VkPhysicalDeviceFeatures, depthBiasClamp); 
		 size  [12] = sizeof  (VkPhysicalDeviceFeatures::depthBiasClamp); 

		 offset[13] = offsetof(VkPhysicalDeviceFeatures, fillModeNonSolid); 
		 size  [13] = sizeof  (VkPhysicalDeviceFeatures::fillModeNonSolid); 

		 offset[14] = offsetof(VkPhysicalDeviceFeatures, depthBounds); 
		 size  [14] = sizeof  (VkPhysicalDeviceFeatures::depthBounds); 

		 offset[15] = offsetof(VkPhysicalDeviceFeatures, wideLines); 
		 size  [15] = sizeof  (VkPhysicalDeviceFeatures::wideLines); 

		 offset[16] = offsetof(VkPhysicalDeviceFeatures, largePoints); 
		 size  [16] = sizeof  (VkPhysicalDeviceFeatures::largePoints); 

		 offset[17] = offsetof(VkPhysicalDeviceFeatures, alphaToOne); 
		 size  [17] = sizeof  (VkPhysicalDeviceFeatures::alphaToOne); 

		 offset[18] = offsetof(VkPhysicalDeviceFeatures, multiViewport); 
		 size  [18] = sizeof  (VkPhysicalDeviceFeatures::multiViewport); 

		 offset[19] = offsetof(VkPhysicalDeviceFeatures, samplerAnisotropy); 
		 size  [19] = sizeof  (VkPhysicalDeviceFeatures::samplerAnisotropy); 

		 offset[20] = offsetof(VkPhysicalDeviceFeatures, textureCompressionETC2); 
		 size  [20] = sizeof  (VkPhysicalDeviceFeatures::textureCompressionETC2); 

		 offset[21] = offsetof(VkPhysicalDeviceFeatures, textureCompressionASTC_LDR); 
		 size  [21] = sizeof  (VkPhysicalDeviceFeatures::textureCompressionASTC_LDR); 

		 offset[22] = offsetof(VkPhysicalDeviceFeatures, textureCompressionBC); 
		 size  [22] = sizeof  (VkPhysicalDeviceFeatures::textureCompressionBC); 

		 offset[23] = offsetof(VkPhysicalDeviceFeatures, occlusionQueryPrecise); 
		 size  [23] = sizeof  (VkPhysicalDeviceFeatures::occlusionQueryPrecise); 

		 offset[24] = offsetof(VkPhysicalDeviceFeatures, pipelineStatisticsQuery); 
		 size  [24] = sizeof  (VkPhysicalDeviceFeatures::pipelineStatisticsQuery); 

		 offset[25] = offsetof(VkPhysicalDeviceFeatures, vertexPipelineStoresAndAtomics); 
		 size  [25] = sizeof  (VkPhysicalDeviceFeatures::vertexPipelineStoresAndAtomics); 

		 offset[26] = offsetof(VkPhysicalDeviceFeatures, fragmentStoresAndAtomics); 
		 size  [26] = sizeof  (VkPhysicalDeviceFeatures::fragmentStoresAndAtomics); 

		 offset[27] = offsetof(VkPhysicalDeviceFeatures, shaderTessellationAndGeometryPointSize); 
		 size  [27] = sizeof  (VkPhysicalDeviceFeatures::shaderTessellationAndGeometryPointSize); 

		 offset[28] = offsetof(VkPhysicalDeviceFeatures, shaderImageGatherExtended); 
		 size  [28] = sizeof  (VkPhysicalDeviceFeatures::shaderImageGatherExtended); 

		 offset[29] = offsetof(VkPhysicalDeviceFeatures, shaderStorageImageExtendedFormats); 
		 size  [29] = sizeof  (VkPhysicalDeviceFeatures::shaderStorageImageExtendedFormats); 

		 offset[30] = offsetof(VkPhysicalDeviceFeatures, shaderStorageImageMultisample); 
		 size  [30] = sizeof  (VkPhysicalDeviceFeatures::shaderStorageImageMultisample); 

		 offset[31] = offsetof(VkPhysicalDeviceFeatures, shaderStorageImageReadWithoutFormat); 
		 size  [31] = sizeof  (VkPhysicalDeviceFeatures::shaderStorageImageReadWithoutFormat); 

		 offset[32] = offsetof(VkPhysicalDeviceFeatures, shaderStorageImageWriteWithoutFormat); 
		 size  [32] = sizeof  (VkPhysicalDeviceFeatures::shaderStorageImageWriteWithoutFormat); 

		 offset[33] = offsetof(VkPhysicalDeviceFeatures, shaderUniformBufferArrayDynamicIndexing); 
		 size  [33] = sizeof  (VkPhysicalDeviceFeatures::shaderUniformBufferArrayDynamicIndexing); 

		 offset[34] = offsetof(VkPhysicalDeviceFeatures, shaderSampledImageArrayDynamicIndexing); 
		 size  [34] = sizeof  (VkPhysicalDeviceFeatures::shaderSampledImageArrayDynamicIndexing); 

		 offset[35] = offsetof(VkPhysicalDeviceFeatures, shaderStorageBufferArrayDynamicIndexing); 
		 size  [35] = sizeof  (VkPhysicalDeviceFeatures::shaderStorageBufferArrayDynamicIndexing); 

		 offset[36] = offsetof(VkPhysicalDeviceFeatures, shaderStorageImageArrayDynamicIndexing); 
		 size  [36] = sizeof  (VkPhysicalDeviceFeatures::shaderStorageImageArrayDynamicIndexing); 

		 offset[37] = offsetof(VkPhysicalDeviceFeatures, shaderClipDistance); 
		 size  [37] = sizeof  (VkPhysicalDeviceFeatures::shaderClipDistance); 

		 offset[38] = offsetof(VkPhysicalDeviceFeatures, shaderCullDistance); 
		 size  [38] = sizeof  (VkPhysicalDeviceFeatures::shaderCullDistance); 

		 offset[39] = offsetof(VkPhysicalDeviceFeatures, shaderFloat64); 
		 size  [39] = sizeof  (VkPhysicalDeviceFeatures::shaderFloat64); 

		 offset[40] = offsetof(VkPhysicalDeviceFeatures, shaderInt64); 
		 size  [40] = sizeof  (VkPhysicalDeviceFeatures::shaderInt64); 

		 offset[41] = offsetof(VkPhysicalDeviceFeatures, shaderInt16); 
		 size  [41] = sizeof  (VkPhysicalDeviceFeatures::shaderInt16); 

		 offset[42] = offsetof(VkPhysicalDeviceFeatures, shaderResourceResidency); 
		 size  [42] = sizeof  (VkPhysicalDeviceFeatures::shaderResourceResidency); 

		 offset[43] = offsetof(VkPhysicalDeviceFeatures, shaderResourceMinLod); 
		 size  [43] = sizeof  (VkPhysicalDeviceFeatures::shaderResourceMinLod); 

		 offset[44] = offsetof(VkPhysicalDeviceFeatures, sparseBinding); 
		 size  [44] = sizeof  (VkPhysicalDeviceFeatures::sparseBinding); 

		 offset[45] = offsetof(VkPhysicalDeviceFeatures, sparseResidencyBuffer); 
		 size  [45] = sizeof  (VkPhysicalDeviceFeatures::sparseResidencyBuffer); 

		 offset[46] = offsetof(VkPhysicalDeviceFeatures, sparseResidencyImage2D); 
		 size  [46] = sizeof  (VkPhysicalDeviceFeatures::sparseResidencyImage2D); 

		 offset[47] = offsetof(VkPhysicalDeviceFeatures, sparseResidencyImage3D); 
		 size  [47] = sizeof  (VkPhysicalDeviceFeatures::sparseResidencyImage3D); 

		 offset[48] = offsetof(VkPhysicalDeviceFeatures, sparseResidency2Samples); 
		 size  [48] = sizeof  (VkPhysicalDeviceFeatures::sparseResidency2Samples); 

		 offset[49] = offsetof(VkPhysicalDeviceFeatures, sparseResidency4Samples); 
		 size  [49] = sizeof  (VkPhysicalDeviceFeatures::sparseResidency4Samples); 

		 offset[50] = offsetof(VkPhysicalDeviceFeatures, sparseResidency8Samples); 
		 size  [50] = sizeof  (VkPhysicalDeviceFeatures::sparseResidency8Samples); 

		 offset[51] = offsetof(VkPhysicalDeviceFeatures, sparseResidency16Samples); 
		 size  [51] = sizeof  (VkPhysicalDeviceFeatures::sparseResidency16Samples); 

		 offset[52] = offsetof(VkPhysicalDeviceFeatures, sparseResidencyAliased); 
		 size  [52] = sizeof  (VkPhysicalDeviceFeatures::sparseResidencyAliased); 

		 offset[53] = offsetof(VkPhysicalDeviceFeatures, variableMultisampleRate); 
		 size  [53] = sizeof  (VkPhysicalDeviceFeatures::variableMultisampleRate); 

		 offset[54] = offsetof(VkPhysicalDeviceFeatures, inheritedQueries); 
		 size  [54] = sizeof  (VkPhysicalDeviceFeatures::inheritedQueries); 

		 return sizeof(VkPhysicalDeviceFeatures)
	 */


	 public static final int MEMBERS_OF_VkFormatProperties = 3;

	 private native int introspectVkFormatProperties(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkFormatProperties, linearTilingFeatures); 
		 size  [0] = sizeof  (VkFormatProperties::linearTilingFeatures); 

		 offset[1] = offsetof(VkFormatProperties, optimalTilingFeatures); 
		 size  [1] = sizeof  (VkFormatProperties::optimalTilingFeatures); 

		 offset[2] = offsetof(VkFormatProperties, bufferFeatures); 
		 size  [2] = sizeof  (VkFormatProperties::bufferFeatures); 

		 return sizeof(VkFormatProperties)
	 */


	 public static final int MEMBERS_OF_VkExtent3D = 3;

	 private native int introspectVkExtent3D(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkExtent3D, width); 
		 size  [0] = sizeof  (VkExtent3D::width); 

		 offset[1] = offsetof(VkExtent3D, height); 
		 size  [1] = sizeof  (VkExtent3D::height); 

		 offset[2] = offsetof(VkExtent3D, depth); 
		 size  [2] = sizeof  (VkExtent3D::depth); 

		 return sizeof(VkExtent3D)
	 */


	 public static final int MEMBERS_OF_VkImageFormatProperties = 5;

	 private native int introspectVkImageFormatProperties(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkImageFormatProperties, maxExtent); 
		 size  [0] = sizeof  (VkImageFormatProperties::maxExtent); 

		 offset[1] = offsetof(VkImageFormatProperties, maxMipLevels); 
		 size  [1] = sizeof  (VkImageFormatProperties::maxMipLevels); 

		 offset[2] = offsetof(VkImageFormatProperties, maxArrayLayers); 
		 size  [2] = sizeof  (VkImageFormatProperties::maxArrayLayers); 

		 offset[3] = offsetof(VkImageFormatProperties, sampleCounts); 
		 size  [3] = sizeof  (VkImageFormatProperties::sampleCounts); 

		 offset[4] = offsetof(VkImageFormatProperties, maxResourceSize); 
		 size  [4] = sizeof  (VkImageFormatProperties::maxResourceSize); 

		 return sizeof(VkImageFormatProperties)
	 */


	 public static final int MEMBERS_OF_VkPhysicalDeviceLimits = 106;

	 private native int introspectVkPhysicalDeviceLimits(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkPhysicalDeviceLimits, maxImageDimension1D); 
		 size  [0] = sizeof  (VkPhysicalDeviceLimits::maxImageDimension1D); 

		 offset[1] = offsetof(VkPhysicalDeviceLimits, maxImageDimension2D); 
		 size  [1] = sizeof  (VkPhysicalDeviceLimits::maxImageDimension2D); 

		 offset[2] = offsetof(VkPhysicalDeviceLimits, maxImageDimension3D); 
		 size  [2] = sizeof  (VkPhysicalDeviceLimits::maxImageDimension3D); 

		 offset[3] = offsetof(VkPhysicalDeviceLimits, maxImageDimensionCube); 
		 size  [3] = sizeof  (VkPhysicalDeviceLimits::maxImageDimensionCube); 

		 offset[4] = offsetof(VkPhysicalDeviceLimits, maxImageArrayLayers); 
		 size  [4] = sizeof  (VkPhysicalDeviceLimits::maxImageArrayLayers); 

		 offset[5] = offsetof(VkPhysicalDeviceLimits, maxTexelBufferElements); 
		 size  [5] = sizeof  (VkPhysicalDeviceLimits::maxTexelBufferElements); 

		 offset[6] = offsetof(VkPhysicalDeviceLimits, maxUniformBufferRange); 
		 size  [6] = sizeof  (VkPhysicalDeviceLimits::maxUniformBufferRange); 

		 offset[7] = offsetof(VkPhysicalDeviceLimits, maxStorageBufferRange); 
		 size  [7] = sizeof  (VkPhysicalDeviceLimits::maxStorageBufferRange); 

		 offset[8] = offsetof(VkPhysicalDeviceLimits, maxPushConstantsSize); 
		 size  [8] = sizeof  (VkPhysicalDeviceLimits::maxPushConstantsSize); 

		 offset[9] = offsetof(VkPhysicalDeviceLimits, maxMemoryAllocationCount); 
		 size  [9] = sizeof  (VkPhysicalDeviceLimits::maxMemoryAllocationCount); 

		 offset[10] = offsetof(VkPhysicalDeviceLimits, maxSamplerAllocationCount); 
		 size  [10] = sizeof  (VkPhysicalDeviceLimits::maxSamplerAllocationCount); 

		 offset[11] = offsetof(VkPhysicalDeviceLimits, bufferImageGranularity); 
		 size  [11] = sizeof  (VkPhysicalDeviceLimits::bufferImageGranularity); 

		 offset[12] = offsetof(VkPhysicalDeviceLimits, sparseAddressSpaceSize); 
		 size  [12] = sizeof  (VkPhysicalDeviceLimits::sparseAddressSpaceSize); 

		 offset[13] = offsetof(VkPhysicalDeviceLimits, maxBoundDescriptorSets); 
		 size  [13] = sizeof  (VkPhysicalDeviceLimits::maxBoundDescriptorSets); 

		 offset[14] = offsetof(VkPhysicalDeviceLimits, maxPerStageDescriptorSamplers); 
		 size  [14] = sizeof  (VkPhysicalDeviceLimits::maxPerStageDescriptorSamplers); 

		 offset[15] = offsetof(VkPhysicalDeviceLimits, maxPerStageDescriptorUniformBuffers); 
		 size  [15] = sizeof  (VkPhysicalDeviceLimits::maxPerStageDescriptorUniformBuffers); 

		 offset[16] = offsetof(VkPhysicalDeviceLimits, maxPerStageDescriptorStorageBuffers); 
		 size  [16] = sizeof  (VkPhysicalDeviceLimits::maxPerStageDescriptorStorageBuffers); 

		 offset[17] = offsetof(VkPhysicalDeviceLimits, maxPerStageDescriptorSampledImages); 
		 size  [17] = sizeof  (VkPhysicalDeviceLimits::maxPerStageDescriptorSampledImages); 

		 offset[18] = offsetof(VkPhysicalDeviceLimits, maxPerStageDescriptorStorageImages); 
		 size  [18] = sizeof  (VkPhysicalDeviceLimits::maxPerStageDescriptorStorageImages); 

		 offset[19] = offsetof(VkPhysicalDeviceLimits, maxPerStageDescriptorInputAttachments); 
		 size  [19] = sizeof  (VkPhysicalDeviceLimits::maxPerStageDescriptorInputAttachments); 

		 offset[20] = offsetof(VkPhysicalDeviceLimits, maxPerStageResources); 
		 size  [20] = sizeof  (VkPhysicalDeviceLimits::maxPerStageResources); 

		 offset[21] = offsetof(VkPhysicalDeviceLimits, maxDescriptorSetSamplers); 
		 size  [21] = sizeof  (VkPhysicalDeviceLimits::maxDescriptorSetSamplers); 

		 offset[22] = offsetof(VkPhysicalDeviceLimits, maxDescriptorSetUniformBuffers); 
		 size  [22] = sizeof  (VkPhysicalDeviceLimits::maxDescriptorSetUniformBuffers); 

		 offset[23] = offsetof(VkPhysicalDeviceLimits, maxDescriptorSetUniformBuffersDynamic); 
		 size  [23] = sizeof  (VkPhysicalDeviceLimits::maxDescriptorSetUniformBuffersDynamic); 

		 offset[24] = offsetof(VkPhysicalDeviceLimits, maxDescriptorSetStorageBuffers); 
		 size  [24] = sizeof  (VkPhysicalDeviceLimits::maxDescriptorSetStorageBuffers); 

		 offset[25] = offsetof(VkPhysicalDeviceLimits, maxDescriptorSetStorageBuffersDynamic); 
		 size  [25] = sizeof  (VkPhysicalDeviceLimits::maxDescriptorSetStorageBuffersDynamic); 

		 offset[26] = offsetof(VkPhysicalDeviceLimits, maxDescriptorSetSampledImages); 
		 size  [26] = sizeof  (VkPhysicalDeviceLimits::maxDescriptorSetSampledImages); 

		 offset[27] = offsetof(VkPhysicalDeviceLimits, maxDescriptorSetStorageImages); 
		 size  [27] = sizeof  (VkPhysicalDeviceLimits::maxDescriptorSetStorageImages); 

		 offset[28] = offsetof(VkPhysicalDeviceLimits, maxDescriptorSetInputAttachments); 
		 size  [28] = sizeof  (VkPhysicalDeviceLimits::maxDescriptorSetInputAttachments); 

		 offset[29] = offsetof(VkPhysicalDeviceLimits, maxVertexInputAttributes); 
		 size  [29] = sizeof  (VkPhysicalDeviceLimits::maxVertexInputAttributes); 

		 offset[30] = offsetof(VkPhysicalDeviceLimits, maxVertexInputBindings); 
		 size  [30] = sizeof  (VkPhysicalDeviceLimits::maxVertexInputBindings); 

		 offset[31] = offsetof(VkPhysicalDeviceLimits, maxVertexInputAttributeOffset); 
		 size  [31] = sizeof  (VkPhysicalDeviceLimits::maxVertexInputAttributeOffset); 

		 offset[32] = offsetof(VkPhysicalDeviceLimits, maxVertexInputBindingStride); 
		 size  [32] = sizeof  (VkPhysicalDeviceLimits::maxVertexInputBindingStride); 

		 offset[33] = offsetof(VkPhysicalDeviceLimits, maxVertexOutputComponents); 
		 size  [33] = sizeof  (VkPhysicalDeviceLimits::maxVertexOutputComponents); 

		 offset[34] = offsetof(VkPhysicalDeviceLimits, maxTessellationGenerationLevel); 
		 size  [34] = sizeof  (VkPhysicalDeviceLimits::maxTessellationGenerationLevel); 

		 offset[35] = offsetof(VkPhysicalDeviceLimits, maxTessellationPatchSize); 
		 size  [35] = sizeof  (VkPhysicalDeviceLimits::maxTessellationPatchSize); 

		 offset[36] = offsetof(VkPhysicalDeviceLimits, maxTessellationControlPerVertexInputComponents); 
		 size  [36] = sizeof  (VkPhysicalDeviceLimits::maxTessellationControlPerVertexInputComponents); 

		 offset[37] = offsetof(VkPhysicalDeviceLimits, maxTessellationControlPerVertexOutputComponents); 
		 size  [37] = sizeof  (VkPhysicalDeviceLimits::maxTessellationControlPerVertexOutputComponents); 

		 offset[38] = offsetof(VkPhysicalDeviceLimits, maxTessellationControlPerPatchOutputComponents); 
		 size  [38] = sizeof  (VkPhysicalDeviceLimits::maxTessellationControlPerPatchOutputComponents); 

		 offset[39] = offsetof(VkPhysicalDeviceLimits, maxTessellationControlTotalOutputComponents); 
		 size  [39] = sizeof  (VkPhysicalDeviceLimits::maxTessellationControlTotalOutputComponents); 

		 offset[40] = offsetof(VkPhysicalDeviceLimits, maxTessellationEvaluationInputComponents); 
		 size  [40] = sizeof  (VkPhysicalDeviceLimits::maxTessellationEvaluationInputComponents); 

		 offset[41] = offsetof(VkPhysicalDeviceLimits, maxTessellationEvaluationOutputComponents); 
		 size  [41] = sizeof  (VkPhysicalDeviceLimits::maxTessellationEvaluationOutputComponents); 

		 offset[42] = offsetof(VkPhysicalDeviceLimits, maxGeometryShaderInvocations); 
		 size  [42] = sizeof  (VkPhysicalDeviceLimits::maxGeometryShaderInvocations); 

		 offset[43] = offsetof(VkPhysicalDeviceLimits, maxGeometryInputComponents); 
		 size  [43] = sizeof  (VkPhysicalDeviceLimits::maxGeometryInputComponents); 

		 offset[44] = offsetof(VkPhysicalDeviceLimits, maxGeometryOutputComponents); 
		 size  [44] = sizeof  (VkPhysicalDeviceLimits::maxGeometryOutputComponents); 

		 offset[45] = offsetof(VkPhysicalDeviceLimits, maxGeometryOutputVertices); 
		 size  [45] = sizeof  (VkPhysicalDeviceLimits::maxGeometryOutputVertices); 

		 offset[46] = offsetof(VkPhysicalDeviceLimits, maxGeometryTotalOutputComponents); 
		 size  [46] = sizeof  (VkPhysicalDeviceLimits::maxGeometryTotalOutputComponents); 

		 offset[47] = offsetof(VkPhysicalDeviceLimits, maxFragmentInputComponents); 
		 size  [47] = sizeof  (VkPhysicalDeviceLimits::maxFragmentInputComponents); 

		 offset[48] = offsetof(VkPhysicalDeviceLimits, maxFragmentOutputAttachments); 
		 size  [48] = sizeof  (VkPhysicalDeviceLimits::maxFragmentOutputAttachments); 

		 offset[49] = offsetof(VkPhysicalDeviceLimits, maxFragmentDualSrcAttachments); 
		 size  [49] = sizeof  (VkPhysicalDeviceLimits::maxFragmentDualSrcAttachments); 

		 offset[50] = offsetof(VkPhysicalDeviceLimits, maxFragmentCombinedOutputResources); 
		 size  [50] = sizeof  (VkPhysicalDeviceLimits::maxFragmentCombinedOutputResources); 

		 offset[51] = offsetof(VkPhysicalDeviceLimits, maxComputeSharedMemorySize); 
		 size  [51] = sizeof  (VkPhysicalDeviceLimits::maxComputeSharedMemorySize); 

		 offset[52] = offsetof(VkPhysicalDeviceLimits, maxComputeWorkGroupCount); 
		 size  [52] = sizeof  (VkPhysicalDeviceLimits::maxComputeWorkGroupCount); 

		 offset[53] = offsetof(VkPhysicalDeviceLimits, maxComputeWorkGroupInvocations); 
		 size  [53] = sizeof  (VkPhysicalDeviceLimits::maxComputeWorkGroupInvocations); 

		 offset[54] = offsetof(VkPhysicalDeviceLimits, maxComputeWorkGroupSize); 
		 size  [54] = sizeof  (VkPhysicalDeviceLimits::maxComputeWorkGroupSize); 

		 offset[55] = offsetof(VkPhysicalDeviceLimits, subPixelPrecisionBits); 
		 size  [55] = sizeof  (VkPhysicalDeviceLimits::subPixelPrecisionBits); 

		 offset[56] = offsetof(VkPhysicalDeviceLimits, subTexelPrecisionBits); 
		 size  [56] = sizeof  (VkPhysicalDeviceLimits::subTexelPrecisionBits); 

		 offset[57] = offsetof(VkPhysicalDeviceLimits, mipmapPrecisionBits); 
		 size  [57] = sizeof  (VkPhysicalDeviceLimits::mipmapPrecisionBits); 

		 offset[58] = offsetof(VkPhysicalDeviceLimits, maxDrawIndexedIndexValue); 
		 size  [58] = sizeof  (VkPhysicalDeviceLimits::maxDrawIndexedIndexValue); 

		 offset[59] = offsetof(VkPhysicalDeviceLimits, maxDrawIndirectCount); 
		 size  [59] = sizeof  (VkPhysicalDeviceLimits::maxDrawIndirectCount); 

		 offset[60] = offsetof(VkPhysicalDeviceLimits, maxSamplerLodBias); 
		 size  [60] = sizeof  (VkPhysicalDeviceLimits::maxSamplerLodBias); 

		 offset[61] = offsetof(VkPhysicalDeviceLimits, maxSamplerAnisotropy); 
		 size  [61] = sizeof  (VkPhysicalDeviceLimits::maxSamplerAnisotropy); 

		 offset[62] = offsetof(VkPhysicalDeviceLimits, maxViewports); 
		 size  [62] = sizeof  (VkPhysicalDeviceLimits::maxViewports); 

		 offset[63] = offsetof(VkPhysicalDeviceLimits, maxViewportDimensions); 
		 size  [63] = sizeof  (VkPhysicalDeviceLimits::maxViewportDimensions); 

		 offset[64] = offsetof(VkPhysicalDeviceLimits, viewportBoundsRange); 
		 size  [64] = sizeof  (VkPhysicalDeviceLimits::viewportBoundsRange); 

		 offset[65] = offsetof(VkPhysicalDeviceLimits, viewportSubPixelBits); 
		 size  [65] = sizeof  (VkPhysicalDeviceLimits::viewportSubPixelBits); 

		 offset[66] = offsetof(VkPhysicalDeviceLimits, minMemoryMapAlignment); 
		 size  [66] = sizeof  (VkPhysicalDeviceLimits::minMemoryMapAlignment); 

		 offset[67] = offsetof(VkPhysicalDeviceLimits, minTexelBufferOffsetAlignment); 
		 size  [67] = sizeof  (VkPhysicalDeviceLimits::minTexelBufferOffsetAlignment); 

		 offset[68] = offsetof(VkPhysicalDeviceLimits, minUniformBufferOffsetAlignment); 
		 size  [68] = sizeof  (VkPhysicalDeviceLimits::minUniformBufferOffsetAlignment); 

		 offset[69] = offsetof(VkPhysicalDeviceLimits, minStorageBufferOffsetAlignment); 
		 size  [69] = sizeof  (VkPhysicalDeviceLimits::minStorageBufferOffsetAlignment); 

		 offset[70] = offsetof(VkPhysicalDeviceLimits, minTexelOffset); 
		 size  [70] = sizeof  (VkPhysicalDeviceLimits::minTexelOffset); 

		 offset[71] = offsetof(VkPhysicalDeviceLimits, maxTexelOffset); 
		 size  [71] = sizeof  (VkPhysicalDeviceLimits::maxTexelOffset); 

		 offset[72] = offsetof(VkPhysicalDeviceLimits, minTexelGatherOffset); 
		 size  [72] = sizeof  (VkPhysicalDeviceLimits::minTexelGatherOffset); 

		 offset[73] = offsetof(VkPhysicalDeviceLimits, maxTexelGatherOffset); 
		 size  [73] = sizeof  (VkPhysicalDeviceLimits::maxTexelGatherOffset); 

		 offset[74] = offsetof(VkPhysicalDeviceLimits, minInterpolationOffset); 
		 size  [74] = sizeof  (VkPhysicalDeviceLimits::minInterpolationOffset); 

		 offset[75] = offsetof(VkPhysicalDeviceLimits, maxInterpolationOffset); 
		 size  [75] = sizeof  (VkPhysicalDeviceLimits::maxInterpolationOffset); 

		 offset[76] = offsetof(VkPhysicalDeviceLimits, subPixelInterpolationOffsetBits); 
		 size  [76] = sizeof  (VkPhysicalDeviceLimits::subPixelInterpolationOffsetBits); 

		 offset[77] = offsetof(VkPhysicalDeviceLimits, maxFramebufferWidth); 
		 size  [77] = sizeof  (VkPhysicalDeviceLimits::maxFramebufferWidth); 

		 offset[78] = offsetof(VkPhysicalDeviceLimits, maxFramebufferHeight); 
		 size  [78] = sizeof  (VkPhysicalDeviceLimits::maxFramebufferHeight); 

		 offset[79] = offsetof(VkPhysicalDeviceLimits, maxFramebufferLayers); 
		 size  [79] = sizeof  (VkPhysicalDeviceLimits::maxFramebufferLayers); 

		 offset[80] = offsetof(VkPhysicalDeviceLimits, framebufferColorSampleCounts); 
		 size  [80] = sizeof  (VkPhysicalDeviceLimits::framebufferColorSampleCounts); 

		 offset[81] = offsetof(VkPhysicalDeviceLimits, framebufferDepthSampleCounts); 
		 size  [81] = sizeof  (VkPhysicalDeviceLimits::framebufferDepthSampleCounts); 

		 offset[82] = offsetof(VkPhysicalDeviceLimits, framebufferStencilSampleCounts); 
		 size  [82] = sizeof  (VkPhysicalDeviceLimits::framebufferStencilSampleCounts); 

		 offset[83] = offsetof(VkPhysicalDeviceLimits, framebufferNoAttachmentsSampleCounts); 
		 size  [83] = sizeof  (VkPhysicalDeviceLimits::framebufferNoAttachmentsSampleCounts); 

		 offset[84] = offsetof(VkPhysicalDeviceLimits, maxColorAttachments); 
		 size  [84] = sizeof  (VkPhysicalDeviceLimits::maxColorAttachments); 

		 offset[85] = offsetof(VkPhysicalDeviceLimits, sampledImageColorSampleCounts); 
		 size  [85] = sizeof  (VkPhysicalDeviceLimits::sampledImageColorSampleCounts); 

		 offset[86] = offsetof(VkPhysicalDeviceLimits, sampledImageIntegerSampleCounts); 
		 size  [86] = sizeof  (VkPhysicalDeviceLimits::sampledImageIntegerSampleCounts); 

		 offset[87] = offsetof(VkPhysicalDeviceLimits, sampledImageDepthSampleCounts); 
		 size  [87] = sizeof  (VkPhysicalDeviceLimits::sampledImageDepthSampleCounts); 

		 offset[88] = offsetof(VkPhysicalDeviceLimits, sampledImageStencilSampleCounts); 
		 size  [88] = sizeof  (VkPhysicalDeviceLimits::sampledImageStencilSampleCounts); 

		 offset[89] = offsetof(VkPhysicalDeviceLimits, storageImageSampleCounts); 
		 size  [89] = sizeof  (VkPhysicalDeviceLimits::storageImageSampleCounts); 

		 offset[90] = offsetof(VkPhysicalDeviceLimits, maxSampleMaskWords); 
		 size  [90] = sizeof  (VkPhysicalDeviceLimits::maxSampleMaskWords); 

		 offset[91] = offsetof(VkPhysicalDeviceLimits, timestampComputeAndGraphics); 
		 size  [91] = sizeof  (VkPhysicalDeviceLimits::timestampComputeAndGraphics); 

		 offset[92] = offsetof(VkPhysicalDeviceLimits, timestampPeriod); 
		 size  [92] = sizeof  (VkPhysicalDeviceLimits::timestampPeriod); 

		 offset[93] = offsetof(VkPhysicalDeviceLimits, maxClipDistances); 
		 size  [93] = sizeof  (VkPhysicalDeviceLimits::maxClipDistances); 

		 offset[94] = offsetof(VkPhysicalDeviceLimits, maxCullDistances); 
		 size  [94] = sizeof  (VkPhysicalDeviceLimits::maxCullDistances); 

		 offset[95] = offsetof(VkPhysicalDeviceLimits, maxCombinedClipAndCullDistances); 
		 size  [95] = sizeof  (VkPhysicalDeviceLimits::maxCombinedClipAndCullDistances); 

		 offset[96] = offsetof(VkPhysicalDeviceLimits, discreteQueuePriorities); 
		 size  [96] = sizeof  (VkPhysicalDeviceLimits::discreteQueuePriorities); 

		 offset[97] = offsetof(VkPhysicalDeviceLimits, pointSizeRange); 
		 size  [97] = sizeof  (VkPhysicalDeviceLimits::pointSizeRange); 

		 offset[98] = offsetof(VkPhysicalDeviceLimits, lineWidthRange); 
		 size  [98] = sizeof  (VkPhysicalDeviceLimits::lineWidthRange); 

		 offset[99] = offsetof(VkPhysicalDeviceLimits, pointSizeGranularity); 
		 size  [99] = sizeof  (VkPhysicalDeviceLimits::pointSizeGranularity); 

		 offset[100] = offsetof(VkPhysicalDeviceLimits, lineWidthGranularity); 
		 size  [100] = sizeof  (VkPhysicalDeviceLimits::lineWidthGranularity); 

		 offset[101] = offsetof(VkPhysicalDeviceLimits, strictLines); 
		 size  [101] = sizeof  (VkPhysicalDeviceLimits::strictLines); 

		 offset[102] = offsetof(VkPhysicalDeviceLimits, standardSampleLocations); 
		 size  [102] = sizeof  (VkPhysicalDeviceLimits::standardSampleLocations); 

		 offset[103] = offsetof(VkPhysicalDeviceLimits, optimalBufferCopyOffsetAlignment); 
		 size  [103] = sizeof  (VkPhysicalDeviceLimits::optimalBufferCopyOffsetAlignment); 

		 offset[104] = offsetof(VkPhysicalDeviceLimits, optimalBufferCopyRowPitchAlignment); 
		 size  [104] = sizeof  (VkPhysicalDeviceLimits::optimalBufferCopyRowPitchAlignment); 

		 offset[105] = offsetof(VkPhysicalDeviceLimits, nonCoherentAtomSize); 
		 size  [105] = sizeof  (VkPhysicalDeviceLimits::nonCoherentAtomSize); 

		 return sizeof(VkPhysicalDeviceLimits)
	 */


	 public static final int MEMBERS_OF_VkPhysicalDeviceSparseProperties = 5;

	 private native int introspectVkPhysicalDeviceSparseProperties(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkPhysicalDeviceSparseProperties, residencyStandard2DBlockShape); 
		 size  [0] = sizeof  (VkPhysicalDeviceSparseProperties::residencyStandard2DBlockShape); 

		 offset[1] = offsetof(VkPhysicalDeviceSparseProperties, residencyStandard2DMultisampleBlockShape); 
		 size  [1] = sizeof  (VkPhysicalDeviceSparseProperties::residencyStandard2DMultisampleBlockShape); 

		 offset[2] = offsetof(VkPhysicalDeviceSparseProperties, residencyStandard3DBlockShape); 
		 size  [2] = sizeof  (VkPhysicalDeviceSparseProperties::residencyStandard3DBlockShape); 

		 offset[3] = offsetof(VkPhysicalDeviceSparseProperties, residencyAlignedMipSize); 
		 size  [3] = sizeof  (VkPhysicalDeviceSparseProperties::residencyAlignedMipSize); 

		 offset[4] = offsetof(VkPhysicalDeviceSparseProperties, residencyNonResidentStrict); 
		 size  [4] = sizeof  (VkPhysicalDeviceSparseProperties::residencyNonResidentStrict); 

		 return sizeof(VkPhysicalDeviceSparseProperties)
	 */


	 public static final int MEMBERS_OF_VkPhysicalDeviceProperties = 9;

	 private native int introspectVkPhysicalDeviceProperties(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkPhysicalDeviceProperties, apiVersion); 
		 size  [0] = sizeof  (VkPhysicalDeviceProperties::apiVersion); 

		 offset[1] = offsetof(VkPhysicalDeviceProperties, driverVersion); 
		 size  [1] = sizeof  (VkPhysicalDeviceProperties::driverVersion); 

		 offset[2] = offsetof(VkPhysicalDeviceProperties, vendorID); 
		 size  [2] = sizeof  (VkPhysicalDeviceProperties::vendorID); 

		 offset[3] = offsetof(VkPhysicalDeviceProperties, deviceID); 
		 size  [3] = sizeof  (VkPhysicalDeviceProperties::deviceID); 

		 offset[4] = offsetof(VkPhysicalDeviceProperties, deviceType); 
		 size  [4] = sizeof  (VkPhysicalDeviceProperties::deviceType); 

		 offset[5] = offsetof(VkPhysicalDeviceProperties, deviceName); 
		 size  [5] = sizeof  (VkPhysicalDeviceProperties::deviceName); 

		 offset[6] = offsetof(VkPhysicalDeviceProperties, pipelineCacheUUID); 
		 size  [6] = sizeof  (VkPhysicalDeviceProperties::pipelineCacheUUID); 

		 offset[7] = offsetof(VkPhysicalDeviceProperties, limits); 
		 size  [7] = sizeof  (VkPhysicalDeviceProperties::limits); 

		 offset[8] = offsetof(VkPhysicalDeviceProperties, sparseProperties); 
		 size  [8] = sizeof  (VkPhysicalDeviceProperties::sparseProperties); 

		 return sizeof(VkPhysicalDeviceProperties)
	 */


	 public static final int MEMBERS_OF_VkQueueFamilyProperties = 4;

	 private native int introspectVkQueueFamilyProperties(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkQueueFamilyProperties, queueFlags); 
		 size  [0] = sizeof  (VkQueueFamilyProperties::queueFlags); 

		 offset[1] = offsetof(VkQueueFamilyProperties, queueCount); 
		 size  [1] = sizeof  (VkQueueFamilyProperties::queueCount); 

		 offset[2] = offsetof(VkQueueFamilyProperties, timestampValidBits); 
		 size  [2] = sizeof  (VkQueueFamilyProperties::timestampValidBits); 

		 offset[3] = offsetof(VkQueueFamilyProperties, minImageTransferGranularity); 
		 size  [3] = sizeof  (VkQueueFamilyProperties::minImageTransferGranularity); 

		 return sizeof(VkQueueFamilyProperties)
	 */


	 public static final int MEMBERS_OF_VkMemoryType = 2;

	 private native int introspectVkMemoryType(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkMemoryType, propertyFlags); 
		 size  [0] = sizeof  (VkMemoryType::propertyFlags); 

		 offset[1] = offsetof(VkMemoryType, heapIndex); 
		 size  [1] = sizeof  (VkMemoryType::heapIndex); 

		 return sizeof(VkMemoryType)
	 */


	 public static final int MEMBERS_OF_VkMemoryHeap = 2;

	 private native int introspectVkMemoryHeap(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkMemoryHeap, size); 
		 size  [0] = sizeof  (VkMemoryHeap::size); 

		 offset[1] = offsetof(VkMemoryHeap, flags); 
		 size  [1] = sizeof  (VkMemoryHeap::flags); 

		 return sizeof(VkMemoryHeap)
	 */


	 public static final int MEMBERS_OF_VkPhysicalDeviceMemoryProperties = 4;

	 private native int introspectVkPhysicalDeviceMemoryProperties(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkPhysicalDeviceMemoryProperties, memoryTypeCount); 
		 size  [0] = sizeof  (VkPhysicalDeviceMemoryProperties::memoryTypeCount); 

		 offset[1] = offsetof(VkPhysicalDeviceMemoryProperties, memoryTypes); 
		 size  [1] = sizeof  (VkPhysicalDeviceMemoryProperties::memoryTypes); 

		 offset[2] = offsetof(VkPhysicalDeviceMemoryProperties, memoryHeapCount); 
		 size  [2] = sizeof  (VkPhysicalDeviceMemoryProperties::memoryHeapCount); 

		 offset[3] = offsetof(VkPhysicalDeviceMemoryProperties, memoryHeaps); 
		 size  [3] = sizeof  (VkPhysicalDeviceMemoryProperties::memoryHeaps); 

		 return sizeof(VkPhysicalDeviceMemoryProperties)
	 */


	 public static final int MEMBERS_OF_VkDeviceQueueCreateInfo = 6;

	 private native int introspectVkDeviceQueueCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDeviceQueueCreateInfo, sType); 
		 size  [0] = sizeof  (VkDeviceQueueCreateInfo::sType); 

		 offset[1] = offsetof(VkDeviceQueueCreateInfo, pNext); 
		 size  [1] = sizeof  (VkDeviceQueueCreateInfo::pNext); 

		 offset[2] = offsetof(VkDeviceQueueCreateInfo, flags); 
		 size  [2] = sizeof  (VkDeviceQueueCreateInfo::flags); 

		 offset[3] = offsetof(VkDeviceQueueCreateInfo, queueFamilyIndex); 
		 size  [3] = sizeof  (VkDeviceQueueCreateInfo::queueFamilyIndex); 

		 offset[4] = offsetof(VkDeviceQueueCreateInfo, queueCount); 
		 size  [4] = sizeof  (VkDeviceQueueCreateInfo::queueCount); 

		 offset[5] = offsetof(VkDeviceQueueCreateInfo, pQueuePriorities); 
		 size  [5] = sizeof  (VkDeviceQueueCreateInfo::pQueuePriorities); 

		 return sizeof(VkDeviceQueueCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkDeviceCreateInfo = 10;

	 private native int introspectVkDeviceCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDeviceCreateInfo, sType); 
		 size  [0] = sizeof  (VkDeviceCreateInfo::sType); 

		 offset[1] = offsetof(VkDeviceCreateInfo, pNext); 
		 size  [1] = sizeof  (VkDeviceCreateInfo::pNext); 

		 offset[2] = offsetof(VkDeviceCreateInfo, flags); 
		 size  [2] = sizeof  (VkDeviceCreateInfo::flags); 

		 offset[3] = offsetof(VkDeviceCreateInfo, queueCreateInfoCount); 
		 size  [3] = sizeof  (VkDeviceCreateInfo::queueCreateInfoCount); 

		 offset[4] = offsetof(VkDeviceCreateInfo, pQueueCreateInfos); 
		 size  [4] = sizeof  (VkDeviceCreateInfo::pQueueCreateInfos); 

		 offset[5] = offsetof(VkDeviceCreateInfo, enabledLayerCount); 
		 size  [5] = sizeof  (VkDeviceCreateInfo::enabledLayerCount); 

		 offset[6] = offsetof(VkDeviceCreateInfo, ppEnabledLayerNames); 
		 size  [6] = sizeof  (VkDeviceCreateInfo::ppEnabledLayerNames); 

		 offset[7] = offsetof(VkDeviceCreateInfo, enabledExtensionCount); 
		 size  [7] = sizeof  (VkDeviceCreateInfo::enabledExtensionCount); 

		 offset[8] = offsetof(VkDeviceCreateInfo, ppEnabledExtensionNames); 
		 size  [8] = sizeof  (VkDeviceCreateInfo::ppEnabledExtensionNames); 

		 offset[9] = offsetof(VkDeviceCreateInfo, pEnabledFeatures); 
		 size  [9] = sizeof  (VkDeviceCreateInfo::pEnabledFeatures); 

		 return sizeof(VkDeviceCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkExtensionProperties = 2;

	 private native int introspectVkExtensionProperties(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkExtensionProperties, extensionName); 
		 size  [0] = sizeof  (VkExtensionProperties::extensionName); 

		 offset[1] = offsetof(VkExtensionProperties, specVersion); 
		 size  [1] = sizeof  (VkExtensionProperties::specVersion); 

		 return sizeof(VkExtensionProperties)
	 */


	 public static final int MEMBERS_OF_VkLayerProperties = 4;

	 private native int introspectVkLayerProperties(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkLayerProperties, layerName); 
		 size  [0] = sizeof  (VkLayerProperties::layerName); 

		 offset[1] = offsetof(VkLayerProperties, specVersion); 
		 size  [1] = sizeof  (VkLayerProperties::specVersion); 

		 offset[2] = offsetof(VkLayerProperties, implementationVersion); 
		 size  [2] = sizeof  (VkLayerProperties::implementationVersion); 

		 offset[3] = offsetof(VkLayerProperties, description); 
		 size  [3] = sizeof  (VkLayerProperties::description); 

		 return sizeof(VkLayerProperties)
	 */


	 public static final int MEMBERS_OF_VkSubmitInfo = 9;

	 private native int introspectVkSubmitInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkSubmitInfo, sType); 
		 size  [0] = sizeof  (VkSubmitInfo::sType); 

		 offset[1] = offsetof(VkSubmitInfo, pNext); 
		 size  [1] = sizeof  (VkSubmitInfo::pNext); 

		 offset[2] = offsetof(VkSubmitInfo, waitSemaphoreCount); 
		 size  [2] = sizeof  (VkSubmitInfo::waitSemaphoreCount); 

		 offset[3] = offsetof(VkSubmitInfo, pWaitSemaphores); 
		 size  [3] = sizeof  (VkSubmitInfo::pWaitSemaphores); 

		 offset[4] = offsetof(VkSubmitInfo, pWaitDstStageMask); 
		 size  [4] = sizeof  (VkSubmitInfo::pWaitDstStageMask); 

		 offset[5] = offsetof(VkSubmitInfo, commandBufferCount); 
		 size  [5] = sizeof  (VkSubmitInfo::commandBufferCount); 

		 offset[6] = offsetof(VkSubmitInfo, pCommandBuffers); 
		 size  [6] = sizeof  (VkSubmitInfo::pCommandBuffers); 

		 offset[7] = offsetof(VkSubmitInfo, signalSemaphoreCount); 
		 size  [7] = sizeof  (VkSubmitInfo::signalSemaphoreCount); 

		 offset[8] = offsetof(VkSubmitInfo, pSignalSemaphores); 
		 size  [8] = sizeof  (VkSubmitInfo::pSignalSemaphores); 

		 return sizeof(VkSubmitInfo)
	 */


	 public static final int MEMBERS_OF_VkMemoryAllocateInfo = 4;

	 private native int introspectVkMemoryAllocateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkMemoryAllocateInfo, sType); 
		 size  [0] = sizeof  (VkMemoryAllocateInfo::sType); 

		 offset[1] = offsetof(VkMemoryAllocateInfo, pNext); 
		 size  [1] = sizeof  (VkMemoryAllocateInfo::pNext); 

		 offset[2] = offsetof(VkMemoryAllocateInfo, allocationSize); 
		 size  [2] = sizeof  (VkMemoryAllocateInfo::allocationSize); 

		 offset[3] = offsetof(VkMemoryAllocateInfo, memoryTypeIndex); 
		 size  [3] = sizeof  (VkMemoryAllocateInfo::memoryTypeIndex); 

		 return sizeof(VkMemoryAllocateInfo)
	 */


	 public static final int MEMBERS_OF_VkMappedMemoryRange = 5;

	 private native int introspectVkMappedMemoryRange(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkMappedMemoryRange, sType); 
		 size  [0] = sizeof  (VkMappedMemoryRange::sType); 

		 offset[1] = offsetof(VkMappedMemoryRange, pNext); 
		 size  [1] = sizeof  (VkMappedMemoryRange::pNext); 

		 offset[2] = offsetof(VkMappedMemoryRange, memory); 
		 size  [2] = sizeof  (VkMappedMemoryRange::memory); 

		 offset[3] = offsetof(VkMappedMemoryRange, offset); 
		 size  [3] = sizeof  (VkMappedMemoryRange::offset); 

		 offset[4] = offsetof(VkMappedMemoryRange, size); 
		 size  [4] = sizeof  (VkMappedMemoryRange::size); 

		 return sizeof(VkMappedMemoryRange)
	 */


	 public static final int MEMBERS_OF_VkMemoryRequirements = 3;

	 private native int introspectVkMemoryRequirements(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkMemoryRequirements, size); 
		 size  [0] = sizeof  (VkMemoryRequirements::size); 

		 offset[1] = offsetof(VkMemoryRequirements, alignment); 
		 size  [1] = sizeof  (VkMemoryRequirements::alignment); 

		 offset[2] = offsetof(VkMemoryRequirements, memoryTypeBits); 
		 size  [2] = sizeof  (VkMemoryRequirements::memoryTypeBits); 

		 return sizeof(VkMemoryRequirements)
	 */


	 public static final int MEMBERS_OF_VkSparseImageFormatProperties = 3;

	 private native int introspectVkSparseImageFormatProperties(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkSparseImageFormatProperties, aspectMask); 
		 size  [0] = sizeof  (VkSparseImageFormatProperties::aspectMask); 

		 offset[1] = offsetof(VkSparseImageFormatProperties, imageGranularity); 
		 size  [1] = sizeof  (VkSparseImageFormatProperties::imageGranularity); 

		 offset[2] = offsetof(VkSparseImageFormatProperties, flags); 
		 size  [2] = sizeof  (VkSparseImageFormatProperties::flags); 

		 return sizeof(VkSparseImageFormatProperties)
	 */


	 public static final int MEMBERS_OF_VkSparseImageMemoryRequirements = 5;

	 private native int introspectVkSparseImageMemoryRequirements(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkSparseImageMemoryRequirements, formatProperties); 
		 size  [0] = sizeof  (VkSparseImageMemoryRequirements::formatProperties); 

		 offset[1] = offsetof(VkSparseImageMemoryRequirements, imageMipTailFirstLod); 
		 size  [1] = sizeof  (VkSparseImageMemoryRequirements::imageMipTailFirstLod); 

		 offset[2] = offsetof(VkSparseImageMemoryRequirements, imageMipTailSize); 
		 size  [2] = sizeof  (VkSparseImageMemoryRequirements::imageMipTailSize); 

		 offset[3] = offsetof(VkSparseImageMemoryRequirements, imageMipTailOffset); 
		 size  [3] = sizeof  (VkSparseImageMemoryRequirements::imageMipTailOffset); 

		 offset[4] = offsetof(VkSparseImageMemoryRequirements, imageMipTailStride); 
		 size  [4] = sizeof  (VkSparseImageMemoryRequirements::imageMipTailStride); 

		 return sizeof(VkSparseImageMemoryRequirements)
	 */


	 public static final int MEMBERS_OF_VkSparseMemoryBind = 5;

	 private native int introspectVkSparseMemoryBind(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkSparseMemoryBind, resourceOffset); 
		 size  [0] = sizeof  (VkSparseMemoryBind::resourceOffset); 

		 offset[1] = offsetof(VkSparseMemoryBind, size); 
		 size  [1] = sizeof  (VkSparseMemoryBind::size); 

		 offset[2] = offsetof(VkSparseMemoryBind, memory); 
		 size  [2] = sizeof  (VkSparseMemoryBind::memory); 

		 offset[3] = offsetof(VkSparseMemoryBind, memoryOffset); 
		 size  [3] = sizeof  (VkSparseMemoryBind::memoryOffset); 

		 offset[4] = offsetof(VkSparseMemoryBind, flags); 
		 size  [4] = sizeof  (VkSparseMemoryBind::flags); 

		 return sizeof(VkSparseMemoryBind)
	 */


	 public static final int MEMBERS_OF_VkSparseBufferMemoryBindInfo = 3;

	 private native int introspectVkSparseBufferMemoryBindInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkSparseBufferMemoryBindInfo, buffer); 
		 size  [0] = sizeof  (VkSparseBufferMemoryBindInfo::buffer); 

		 offset[1] = offsetof(VkSparseBufferMemoryBindInfo, bindCount); 
		 size  [1] = sizeof  (VkSparseBufferMemoryBindInfo::bindCount); 

		 offset[2] = offsetof(VkSparseBufferMemoryBindInfo, pBinds); 
		 size  [2] = sizeof  (VkSparseBufferMemoryBindInfo::pBinds); 

		 return sizeof(VkSparseBufferMemoryBindInfo)
	 */


	 public static final int MEMBERS_OF_VkSparseImageOpaqueMemoryBindInfo = 3;

	 private native int introspectVkSparseImageOpaqueMemoryBindInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkSparseImageOpaqueMemoryBindInfo, image); 
		 size  [0] = sizeof  (VkSparseImageOpaqueMemoryBindInfo::image); 

		 offset[1] = offsetof(VkSparseImageOpaqueMemoryBindInfo, bindCount); 
		 size  [1] = sizeof  (VkSparseImageOpaqueMemoryBindInfo::bindCount); 

		 offset[2] = offsetof(VkSparseImageOpaqueMemoryBindInfo, pBinds); 
		 size  [2] = sizeof  (VkSparseImageOpaqueMemoryBindInfo::pBinds); 

		 return sizeof(VkSparseImageOpaqueMemoryBindInfo)
	 */


	 public static final int MEMBERS_OF_VkImageSubresource = 3;

	 private native int introspectVkImageSubresource(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkImageSubresource, aspectMask); 
		 size  [0] = sizeof  (VkImageSubresource::aspectMask); 

		 offset[1] = offsetof(VkImageSubresource, mipLevel); 
		 size  [1] = sizeof  (VkImageSubresource::mipLevel); 

		 offset[2] = offsetof(VkImageSubresource, arrayLayer); 
		 size  [2] = sizeof  (VkImageSubresource::arrayLayer); 

		 return sizeof(VkImageSubresource)
	 */


	 public static final int MEMBERS_OF_VkOffset3D = 3;

	 private native int introspectVkOffset3D(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkOffset3D, x); 
		 size  [0] = sizeof  (VkOffset3D::x); 

		 offset[1] = offsetof(VkOffset3D, y); 
		 size  [1] = sizeof  (VkOffset3D::y); 

		 offset[2] = offsetof(VkOffset3D, z); 
		 size  [2] = sizeof  (VkOffset3D::z); 

		 return sizeof(VkOffset3D)
	 */


	 public static final int MEMBERS_OF_VkSparseImageMemoryBind = 6;

	 private native int introspectVkSparseImageMemoryBind(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkSparseImageMemoryBind, subresource); 
		 size  [0] = sizeof  (VkSparseImageMemoryBind::subresource); 

		 offset[1] = offsetof(VkSparseImageMemoryBind, offset); 
		 size  [1] = sizeof  (VkSparseImageMemoryBind::offset); 

		 offset[2] = offsetof(VkSparseImageMemoryBind, extent); 
		 size  [2] = sizeof  (VkSparseImageMemoryBind::extent); 

		 offset[3] = offsetof(VkSparseImageMemoryBind, memory); 
		 size  [3] = sizeof  (VkSparseImageMemoryBind::memory); 

		 offset[4] = offsetof(VkSparseImageMemoryBind, memoryOffset); 
		 size  [4] = sizeof  (VkSparseImageMemoryBind::memoryOffset); 

		 offset[5] = offsetof(VkSparseImageMemoryBind, flags); 
		 size  [5] = sizeof  (VkSparseImageMemoryBind::flags); 

		 return sizeof(VkSparseImageMemoryBind)
	 */


	 public static final int MEMBERS_OF_VkSparseImageMemoryBindInfo = 3;

	 private native int introspectVkSparseImageMemoryBindInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkSparseImageMemoryBindInfo, image); 
		 size  [0] = sizeof  (VkSparseImageMemoryBindInfo::image); 

		 offset[1] = offsetof(VkSparseImageMemoryBindInfo, bindCount); 
		 size  [1] = sizeof  (VkSparseImageMemoryBindInfo::bindCount); 

		 offset[2] = offsetof(VkSparseImageMemoryBindInfo, pBinds); 
		 size  [2] = sizeof  (VkSparseImageMemoryBindInfo::pBinds); 

		 return sizeof(VkSparseImageMemoryBindInfo)
	 */


	 public static final int MEMBERS_OF_VkBindSparseInfo = 12;

	 private native int introspectVkBindSparseInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkBindSparseInfo, sType); 
		 size  [0] = sizeof  (VkBindSparseInfo::sType); 

		 offset[1] = offsetof(VkBindSparseInfo, pNext); 
		 size  [1] = sizeof  (VkBindSparseInfo::pNext); 

		 offset[2] = offsetof(VkBindSparseInfo, waitSemaphoreCount); 
		 size  [2] = sizeof  (VkBindSparseInfo::waitSemaphoreCount); 

		 offset[3] = offsetof(VkBindSparseInfo, pWaitSemaphores); 
		 size  [3] = sizeof  (VkBindSparseInfo::pWaitSemaphores); 

		 offset[4] = offsetof(VkBindSparseInfo, bufferBindCount); 
		 size  [4] = sizeof  (VkBindSparseInfo::bufferBindCount); 

		 offset[5] = offsetof(VkBindSparseInfo, pBufferBinds); 
		 size  [5] = sizeof  (VkBindSparseInfo::pBufferBinds); 

		 offset[6] = offsetof(VkBindSparseInfo, imageOpaqueBindCount); 
		 size  [6] = sizeof  (VkBindSparseInfo::imageOpaqueBindCount); 

		 offset[7] = offsetof(VkBindSparseInfo, pImageOpaqueBinds); 
		 size  [7] = sizeof  (VkBindSparseInfo::pImageOpaqueBinds); 

		 offset[8] = offsetof(VkBindSparseInfo, imageBindCount); 
		 size  [8] = sizeof  (VkBindSparseInfo::imageBindCount); 

		 offset[9] = offsetof(VkBindSparseInfo, pImageBinds); 
		 size  [9] = sizeof  (VkBindSparseInfo::pImageBinds); 

		 offset[10] = offsetof(VkBindSparseInfo, signalSemaphoreCount); 
		 size  [10] = sizeof  (VkBindSparseInfo::signalSemaphoreCount); 

		 offset[11] = offsetof(VkBindSparseInfo, pSignalSemaphores); 
		 size  [11] = sizeof  (VkBindSparseInfo::pSignalSemaphores); 

		 return sizeof(VkBindSparseInfo)
	 */


	 public static final int MEMBERS_OF_VkFenceCreateInfo = 3;

	 private native int introspectVkFenceCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkFenceCreateInfo, sType); 
		 size  [0] = sizeof  (VkFenceCreateInfo::sType); 

		 offset[1] = offsetof(VkFenceCreateInfo, pNext); 
		 size  [1] = sizeof  (VkFenceCreateInfo::pNext); 

		 offset[2] = offsetof(VkFenceCreateInfo, flags); 
		 size  [2] = sizeof  (VkFenceCreateInfo::flags); 

		 return sizeof(VkFenceCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkSemaphoreCreateInfo = 3;

	 private native int introspectVkSemaphoreCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkSemaphoreCreateInfo, sType); 
		 size  [0] = sizeof  (VkSemaphoreCreateInfo::sType); 

		 offset[1] = offsetof(VkSemaphoreCreateInfo, pNext); 
		 size  [1] = sizeof  (VkSemaphoreCreateInfo::pNext); 

		 offset[2] = offsetof(VkSemaphoreCreateInfo, flags); 
		 size  [2] = sizeof  (VkSemaphoreCreateInfo::flags); 

		 return sizeof(VkSemaphoreCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkEventCreateInfo = 3;

	 private native int introspectVkEventCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkEventCreateInfo, sType); 
		 size  [0] = sizeof  (VkEventCreateInfo::sType); 

		 offset[1] = offsetof(VkEventCreateInfo, pNext); 
		 size  [1] = sizeof  (VkEventCreateInfo::pNext); 

		 offset[2] = offsetof(VkEventCreateInfo, flags); 
		 size  [2] = sizeof  (VkEventCreateInfo::flags); 

		 return sizeof(VkEventCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkQueryPoolCreateInfo = 6;

	 private native int introspectVkQueryPoolCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkQueryPoolCreateInfo, sType); 
		 size  [0] = sizeof  (VkQueryPoolCreateInfo::sType); 

		 offset[1] = offsetof(VkQueryPoolCreateInfo, pNext); 
		 size  [1] = sizeof  (VkQueryPoolCreateInfo::pNext); 

		 offset[2] = offsetof(VkQueryPoolCreateInfo, flags); 
		 size  [2] = sizeof  (VkQueryPoolCreateInfo::flags); 

		 offset[3] = offsetof(VkQueryPoolCreateInfo, queryType); 
		 size  [3] = sizeof  (VkQueryPoolCreateInfo::queryType); 

		 offset[4] = offsetof(VkQueryPoolCreateInfo, queryCount); 
		 size  [4] = sizeof  (VkQueryPoolCreateInfo::queryCount); 

		 offset[5] = offsetof(VkQueryPoolCreateInfo, pipelineStatistics); 
		 size  [5] = sizeof  (VkQueryPoolCreateInfo::pipelineStatistics); 

		 return sizeof(VkQueryPoolCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkBufferCreateInfo = 8;

	 private native int introspectVkBufferCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkBufferCreateInfo, sType); 
		 size  [0] = sizeof  (VkBufferCreateInfo::sType); 

		 offset[1] = offsetof(VkBufferCreateInfo, pNext); 
		 size  [1] = sizeof  (VkBufferCreateInfo::pNext); 

		 offset[2] = offsetof(VkBufferCreateInfo, flags); 
		 size  [2] = sizeof  (VkBufferCreateInfo::flags); 

		 offset[3] = offsetof(VkBufferCreateInfo, size); 
		 size  [3] = sizeof  (VkBufferCreateInfo::size); 

		 offset[4] = offsetof(VkBufferCreateInfo, usage); 
		 size  [4] = sizeof  (VkBufferCreateInfo::usage); 

		 offset[5] = offsetof(VkBufferCreateInfo, sharingMode); 
		 size  [5] = sizeof  (VkBufferCreateInfo::sharingMode); 

		 offset[6] = offsetof(VkBufferCreateInfo, queueFamilyIndexCount); 
		 size  [6] = sizeof  (VkBufferCreateInfo::queueFamilyIndexCount); 

		 offset[7] = offsetof(VkBufferCreateInfo, pQueueFamilyIndices); 
		 size  [7] = sizeof  (VkBufferCreateInfo::pQueueFamilyIndices); 

		 return sizeof(VkBufferCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkBufferViewCreateInfo = 7;

	 private native int introspectVkBufferViewCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkBufferViewCreateInfo, sType); 
		 size  [0] = sizeof  (VkBufferViewCreateInfo::sType); 

		 offset[1] = offsetof(VkBufferViewCreateInfo, pNext); 
		 size  [1] = sizeof  (VkBufferViewCreateInfo::pNext); 

		 offset[2] = offsetof(VkBufferViewCreateInfo, flags); 
		 size  [2] = sizeof  (VkBufferViewCreateInfo::flags); 

		 offset[3] = offsetof(VkBufferViewCreateInfo, buffer); 
		 size  [3] = sizeof  (VkBufferViewCreateInfo::buffer); 

		 offset[4] = offsetof(VkBufferViewCreateInfo, format); 
		 size  [4] = sizeof  (VkBufferViewCreateInfo::format); 

		 offset[5] = offsetof(VkBufferViewCreateInfo, offset); 
		 size  [5] = sizeof  (VkBufferViewCreateInfo::offset); 

		 offset[6] = offsetof(VkBufferViewCreateInfo, range); 
		 size  [6] = sizeof  (VkBufferViewCreateInfo::range); 

		 return sizeof(VkBufferViewCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkImageCreateInfo = 15;

	 private native int introspectVkImageCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkImageCreateInfo, sType); 
		 size  [0] = sizeof  (VkImageCreateInfo::sType); 

		 offset[1] = offsetof(VkImageCreateInfo, pNext); 
		 size  [1] = sizeof  (VkImageCreateInfo::pNext); 

		 offset[2] = offsetof(VkImageCreateInfo, flags); 
		 size  [2] = sizeof  (VkImageCreateInfo::flags); 

		 offset[3] = offsetof(VkImageCreateInfo, imageType); 
		 size  [3] = sizeof  (VkImageCreateInfo::imageType); 

		 offset[4] = offsetof(VkImageCreateInfo, format); 
		 size  [4] = sizeof  (VkImageCreateInfo::format); 

		 offset[5] = offsetof(VkImageCreateInfo, extent); 
		 size  [5] = sizeof  (VkImageCreateInfo::extent); 

		 offset[6] = offsetof(VkImageCreateInfo, mipLevels); 
		 size  [6] = sizeof  (VkImageCreateInfo::mipLevels); 

		 offset[7] = offsetof(VkImageCreateInfo, arrayLayers); 
		 size  [7] = sizeof  (VkImageCreateInfo::arrayLayers); 

		 offset[8] = offsetof(VkImageCreateInfo, samples); 
		 size  [8] = sizeof  (VkImageCreateInfo::samples); 

		 offset[9] = offsetof(VkImageCreateInfo, tiling); 
		 size  [9] = sizeof  (VkImageCreateInfo::tiling); 

		 offset[10] = offsetof(VkImageCreateInfo, usage); 
		 size  [10] = sizeof  (VkImageCreateInfo::usage); 

		 offset[11] = offsetof(VkImageCreateInfo, sharingMode); 
		 size  [11] = sizeof  (VkImageCreateInfo::sharingMode); 

		 offset[12] = offsetof(VkImageCreateInfo, queueFamilyIndexCount); 
		 size  [12] = sizeof  (VkImageCreateInfo::queueFamilyIndexCount); 

		 offset[13] = offsetof(VkImageCreateInfo, pQueueFamilyIndices); 
		 size  [13] = sizeof  (VkImageCreateInfo::pQueueFamilyIndices); 

		 offset[14] = offsetof(VkImageCreateInfo, initialLayout); 
		 size  [14] = sizeof  (VkImageCreateInfo::initialLayout); 

		 return sizeof(VkImageCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkSubresourceLayout = 5;

	 private native int introspectVkSubresourceLayout(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkSubresourceLayout, offset); 
		 size  [0] = sizeof  (VkSubresourceLayout::offset); 

		 offset[1] = offsetof(VkSubresourceLayout, size); 
		 size  [1] = sizeof  (VkSubresourceLayout::size); 

		 offset[2] = offsetof(VkSubresourceLayout, rowPitch); 
		 size  [2] = sizeof  (VkSubresourceLayout::rowPitch); 

		 offset[3] = offsetof(VkSubresourceLayout, arrayPitch); 
		 size  [3] = sizeof  (VkSubresourceLayout::arrayPitch); 

		 offset[4] = offsetof(VkSubresourceLayout, depthPitch); 
		 size  [4] = sizeof  (VkSubresourceLayout::depthPitch); 

		 return sizeof(VkSubresourceLayout)
	 */


	 public static final int MEMBERS_OF_VkComponentMapping = 4;

	 private native int introspectVkComponentMapping(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkComponentMapping, r); 
		 size  [0] = sizeof  (VkComponentMapping::r); 

		 offset[1] = offsetof(VkComponentMapping, g); 
		 size  [1] = sizeof  (VkComponentMapping::g); 

		 offset[2] = offsetof(VkComponentMapping, b); 
		 size  [2] = sizeof  (VkComponentMapping::b); 

		 offset[3] = offsetof(VkComponentMapping, a); 
		 size  [3] = sizeof  (VkComponentMapping::a); 

		 return sizeof(VkComponentMapping)
	 */


	 public static final int MEMBERS_OF_VkImageSubresourceRange = 5;

	 private native int introspectVkImageSubresourceRange(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkImageSubresourceRange, aspectMask); 
		 size  [0] = sizeof  (VkImageSubresourceRange::aspectMask); 

		 offset[1] = offsetof(VkImageSubresourceRange, baseMipLevel); 
		 size  [1] = sizeof  (VkImageSubresourceRange::baseMipLevel); 

		 offset[2] = offsetof(VkImageSubresourceRange, levelCount); 
		 size  [2] = sizeof  (VkImageSubresourceRange::levelCount); 

		 offset[3] = offsetof(VkImageSubresourceRange, baseArrayLayer); 
		 size  [3] = sizeof  (VkImageSubresourceRange::baseArrayLayer); 

		 offset[4] = offsetof(VkImageSubresourceRange, layerCount); 
		 size  [4] = sizeof  (VkImageSubresourceRange::layerCount); 

		 return sizeof(VkImageSubresourceRange)
	 */


	 public static final int MEMBERS_OF_VkImageViewCreateInfo = 8;

	 private native int introspectVkImageViewCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkImageViewCreateInfo, sType); 
		 size  [0] = sizeof  (VkImageViewCreateInfo::sType); 

		 offset[1] = offsetof(VkImageViewCreateInfo, pNext); 
		 size  [1] = sizeof  (VkImageViewCreateInfo::pNext); 

		 offset[2] = offsetof(VkImageViewCreateInfo, flags); 
		 size  [2] = sizeof  (VkImageViewCreateInfo::flags); 

		 offset[3] = offsetof(VkImageViewCreateInfo, image); 
		 size  [3] = sizeof  (VkImageViewCreateInfo::image); 

		 offset[4] = offsetof(VkImageViewCreateInfo, viewType); 
		 size  [4] = sizeof  (VkImageViewCreateInfo::viewType); 

		 offset[5] = offsetof(VkImageViewCreateInfo, format); 
		 size  [5] = sizeof  (VkImageViewCreateInfo::format); 

		 offset[6] = offsetof(VkImageViewCreateInfo, components); 
		 size  [6] = sizeof  (VkImageViewCreateInfo::components); 

		 offset[7] = offsetof(VkImageViewCreateInfo, subresourceRange); 
		 size  [7] = sizeof  (VkImageViewCreateInfo::subresourceRange); 

		 return sizeof(VkImageViewCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkShaderModuleCreateInfo = 5;

	 private native int introspectVkShaderModuleCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkShaderModuleCreateInfo, sType); 
		 size  [0] = sizeof  (VkShaderModuleCreateInfo::sType); 

		 offset[1] = offsetof(VkShaderModuleCreateInfo, pNext); 
		 size  [1] = sizeof  (VkShaderModuleCreateInfo::pNext); 

		 offset[2] = offsetof(VkShaderModuleCreateInfo, flags); 
		 size  [2] = sizeof  (VkShaderModuleCreateInfo::flags); 

		 offset[3] = offsetof(VkShaderModuleCreateInfo, codeSize); 
		 size  [3] = sizeof  (VkShaderModuleCreateInfo::codeSize); 

		 offset[4] = offsetof(VkShaderModuleCreateInfo, pCode); 
		 size  [4] = sizeof  (VkShaderModuleCreateInfo::pCode); 

		 return sizeof(VkShaderModuleCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkPipelineCacheCreateInfo = 5;

	 private native int introspectVkPipelineCacheCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkPipelineCacheCreateInfo, sType); 
		 size  [0] = sizeof  (VkPipelineCacheCreateInfo::sType); 

		 offset[1] = offsetof(VkPipelineCacheCreateInfo, pNext); 
		 size  [1] = sizeof  (VkPipelineCacheCreateInfo::pNext); 

		 offset[2] = offsetof(VkPipelineCacheCreateInfo, flags); 
		 size  [2] = sizeof  (VkPipelineCacheCreateInfo::flags); 

		 offset[3] = offsetof(VkPipelineCacheCreateInfo, initialDataSize); 
		 size  [3] = sizeof  (VkPipelineCacheCreateInfo::initialDataSize); 

		 offset[4] = offsetof(VkPipelineCacheCreateInfo, pInitialData); 
		 size  [4] = sizeof  (VkPipelineCacheCreateInfo::pInitialData); 

		 return sizeof(VkPipelineCacheCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkSpecializationMapEntry = 3;

	 private native int introspectVkSpecializationMapEntry(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkSpecializationMapEntry, constantID); 
		 size  [0] = sizeof  (VkSpecializationMapEntry::constantID); 

		 offset[1] = offsetof(VkSpecializationMapEntry, offset); 
		 size  [1] = sizeof  (VkSpecializationMapEntry::offset); 

		 offset[2] = offsetof(VkSpecializationMapEntry, size); 
		 size  [2] = sizeof  (VkSpecializationMapEntry::size); 

		 return sizeof(VkSpecializationMapEntry)
	 */


	 public static final int MEMBERS_OF_VkSpecializationInfo = 4;

	 private native int introspectVkSpecializationInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkSpecializationInfo, mapEntryCount); 
		 size  [0] = sizeof  (VkSpecializationInfo::mapEntryCount); 

		 offset[1] = offsetof(VkSpecializationInfo, pMapEntries); 
		 size  [1] = sizeof  (VkSpecializationInfo::pMapEntries); 

		 offset[2] = offsetof(VkSpecializationInfo, dataSize); 
		 size  [2] = sizeof  (VkSpecializationInfo::dataSize); 

		 offset[3] = offsetof(VkSpecializationInfo, pData); 
		 size  [3] = sizeof  (VkSpecializationInfo::pData); 

		 return sizeof(VkSpecializationInfo)
	 */


	 public static final int MEMBERS_OF_VkPipelineShaderStageCreateInfo = 7;

	 private native int introspectVkPipelineShaderStageCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkPipelineShaderStageCreateInfo, sType); 
		 size  [0] = sizeof  (VkPipelineShaderStageCreateInfo::sType); 

		 offset[1] = offsetof(VkPipelineShaderStageCreateInfo, pNext); 
		 size  [1] = sizeof  (VkPipelineShaderStageCreateInfo::pNext); 

		 offset[2] = offsetof(VkPipelineShaderStageCreateInfo, flags); 
		 size  [2] = sizeof  (VkPipelineShaderStageCreateInfo::flags); 

		 offset[3] = offsetof(VkPipelineShaderStageCreateInfo, stage); 
		 size  [3] = sizeof  (VkPipelineShaderStageCreateInfo::stage); 

		 offset[4] = offsetof(VkPipelineShaderStageCreateInfo, module); 
		 size  [4] = sizeof  (VkPipelineShaderStageCreateInfo::module); 

		 offset[5] = offsetof(VkPipelineShaderStageCreateInfo, pName); 
		 size  [5] = sizeof  (VkPipelineShaderStageCreateInfo::pName); 

		 offset[6] = offsetof(VkPipelineShaderStageCreateInfo, pSpecializationInfo); 
		 size  [6] = sizeof  (VkPipelineShaderStageCreateInfo::pSpecializationInfo); 

		 return sizeof(VkPipelineShaderStageCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkVertexInputBindingDescription = 3;

	 private native int introspectVkVertexInputBindingDescription(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkVertexInputBindingDescription, binding); 
		 size  [0] = sizeof  (VkVertexInputBindingDescription::binding); 

		 offset[1] = offsetof(VkVertexInputBindingDescription, stride); 
		 size  [1] = sizeof  (VkVertexInputBindingDescription::stride); 

		 offset[2] = offsetof(VkVertexInputBindingDescription, inputRate); 
		 size  [2] = sizeof  (VkVertexInputBindingDescription::inputRate); 

		 return sizeof(VkVertexInputBindingDescription)
	 */


	 public static final int MEMBERS_OF_VkVertexInputAttributeDescription = 4;

	 private native int introspectVkVertexInputAttributeDescription(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkVertexInputAttributeDescription, location); 
		 size  [0] = sizeof  (VkVertexInputAttributeDescription::location); 

		 offset[1] = offsetof(VkVertexInputAttributeDescription, binding); 
		 size  [1] = sizeof  (VkVertexInputAttributeDescription::binding); 

		 offset[2] = offsetof(VkVertexInputAttributeDescription, format); 
		 size  [2] = sizeof  (VkVertexInputAttributeDescription::format); 

		 offset[3] = offsetof(VkVertexInputAttributeDescription, offset); 
		 size  [3] = sizeof  (VkVertexInputAttributeDescription::offset); 

		 return sizeof(VkVertexInputAttributeDescription)
	 */


	 public static final int MEMBERS_OF_VkPipelineVertexInputStateCreateInfo = 7;

	 private native int introspectVkPipelineVertexInputStateCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkPipelineVertexInputStateCreateInfo, sType); 
		 size  [0] = sizeof  (VkPipelineVertexInputStateCreateInfo::sType); 

		 offset[1] = offsetof(VkPipelineVertexInputStateCreateInfo, pNext); 
		 size  [1] = sizeof  (VkPipelineVertexInputStateCreateInfo::pNext); 

		 offset[2] = offsetof(VkPipelineVertexInputStateCreateInfo, flags); 
		 size  [2] = sizeof  (VkPipelineVertexInputStateCreateInfo::flags); 

		 offset[3] = offsetof(VkPipelineVertexInputStateCreateInfo, vertexBindingDescriptionCount); 
		 size  [3] = sizeof  (VkPipelineVertexInputStateCreateInfo::vertexBindingDescriptionCount); 

		 offset[4] = offsetof(VkPipelineVertexInputStateCreateInfo, pVertexBindingDescriptions); 
		 size  [4] = sizeof  (VkPipelineVertexInputStateCreateInfo::pVertexBindingDescriptions); 

		 offset[5] = offsetof(VkPipelineVertexInputStateCreateInfo, vertexAttributeDescriptionCount); 
		 size  [5] = sizeof  (VkPipelineVertexInputStateCreateInfo::vertexAttributeDescriptionCount); 

		 offset[6] = offsetof(VkPipelineVertexInputStateCreateInfo, pVertexAttributeDescriptions); 
		 size  [6] = sizeof  (VkPipelineVertexInputStateCreateInfo::pVertexAttributeDescriptions); 

		 return sizeof(VkPipelineVertexInputStateCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkPipelineInputAssemblyStateCreateInfo = 5;

	 private native int introspectVkPipelineInputAssemblyStateCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkPipelineInputAssemblyStateCreateInfo, sType); 
		 size  [0] = sizeof  (VkPipelineInputAssemblyStateCreateInfo::sType); 

		 offset[1] = offsetof(VkPipelineInputAssemblyStateCreateInfo, pNext); 
		 size  [1] = sizeof  (VkPipelineInputAssemblyStateCreateInfo::pNext); 

		 offset[2] = offsetof(VkPipelineInputAssemblyStateCreateInfo, flags); 
		 size  [2] = sizeof  (VkPipelineInputAssemblyStateCreateInfo::flags); 

		 offset[3] = offsetof(VkPipelineInputAssemblyStateCreateInfo, topology); 
		 size  [3] = sizeof  (VkPipelineInputAssemblyStateCreateInfo::topology); 

		 offset[4] = offsetof(VkPipelineInputAssemblyStateCreateInfo, primitiveRestartEnable); 
		 size  [4] = sizeof  (VkPipelineInputAssemblyStateCreateInfo::primitiveRestartEnable); 

		 return sizeof(VkPipelineInputAssemblyStateCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkPipelineTessellationStateCreateInfo = 4;

	 private native int introspectVkPipelineTessellationStateCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkPipelineTessellationStateCreateInfo, sType); 
		 size  [0] = sizeof  (VkPipelineTessellationStateCreateInfo::sType); 

		 offset[1] = offsetof(VkPipelineTessellationStateCreateInfo, pNext); 
		 size  [1] = sizeof  (VkPipelineTessellationStateCreateInfo::pNext); 

		 offset[2] = offsetof(VkPipelineTessellationStateCreateInfo, flags); 
		 size  [2] = sizeof  (VkPipelineTessellationStateCreateInfo::flags); 

		 offset[3] = offsetof(VkPipelineTessellationStateCreateInfo, patchControlPoints); 
		 size  [3] = sizeof  (VkPipelineTessellationStateCreateInfo::patchControlPoints); 

		 return sizeof(VkPipelineTessellationStateCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkViewport = 6;

	 private native int introspectVkViewport(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkViewport, x); 
		 size  [0] = sizeof  (VkViewport::x); 

		 offset[1] = offsetof(VkViewport, y); 
		 size  [1] = sizeof  (VkViewport::y); 

		 offset[2] = offsetof(VkViewport, width); 
		 size  [2] = sizeof  (VkViewport::width); 

		 offset[3] = offsetof(VkViewport, height); 
		 size  [3] = sizeof  (VkViewport::height); 

		 offset[4] = offsetof(VkViewport, minDepth); 
		 size  [4] = sizeof  (VkViewport::minDepth); 

		 offset[5] = offsetof(VkViewport, maxDepth); 
		 size  [5] = sizeof  (VkViewport::maxDepth); 

		 return sizeof(VkViewport)
	 */


	 public static final int MEMBERS_OF_VkOffset2D = 2;

	 private native int introspectVkOffset2D(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkOffset2D, x); 
		 size  [0] = sizeof  (VkOffset2D::x); 

		 offset[1] = offsetof(VkOffset2D, y); 
		 size  [1] = sizeof  (VkOffset2D::y); 

		 return sizeof(VkOffset2D)
	 */


	 public static final int MEMBERS_OF_VkExtent2D = 2;

	 private native int introspectVkExtent2D(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkExtent2D, width); 
		 size  [0] = sizeof  (VkExtent2D::width); 

		 offset[1] = offsetof(VkExtent2D, height); 
		 size  [1] = sizeof  (VkExtent2D::height); 

		 return sizeof(VkExtent2D)
	 */


	 public static final int MEMBERS_OF_VkRect2D = 2;

	 private native int introspectVkRect2D(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkRect2D, offset); 
		 size  [0] = sizeof  (VkRect2D::offset); 

		 offset[1] = offsetof(VkRect2D, extent); 
		 size  [1] = sizeof  (VkRect2D::extent); 

		 return sizeof(VkRect2D)
	 */


	 public static final int MEMBERS_OF_VkPipelineViewportStateCreateInfo = 7;

	 private native int introspectVkPipelineViewportStateCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkPipelineViewportStateCreateInfo, sType); 
		 size  [0] = sizeof  (VkPipelineViewportStateCreateInfo::sType); 

		 offset[1] = offsetof(VkPipelineViewportStateCreateInfo, pNext); 
		 size  [1] = sizeof  (VkPipelineViewportStateCreateInfo::pNext); 

		 offset[2] = offsetof(VkPipelineViewportStateCreateInfo, flags); 
		 size  [2] = sizeof  (VkPipelineViewportStateCreateInfo::flags); 

		 offset[3] = offsetof(VkPipelineViewportStateCreateInfo, viewportCount); 
		 size  [3] = sizeof  (VkPipelineViewportStateCreateInfo::viewportCount); 

		 offset[4] = offsetof(VkPipelineViewportStateCreateInfo, pViewports); 
		 size  [4] = sizeof  (VkPipelineViewportStateCreateInfo::pViewports); 

		 offset[5] = offsetof(VkPipelineViewportStateCreateInfo, scissorCount); 
		 size  [5] = sizeof  (VkPipelineViewportStateCreateInfo::scissorCount); 

		 offset[6] = offsetof(VkPipelineViewportStateCreateInfo, pScissors); 
		 size  [6] = sizeof  (VkPipelineViewportStateCreateInfo::pScissors); 

		 return sizeof(VkPipelineViewportStateCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkPipelineRasterizationStateCreateInfo = 13;

	 private native int introspectVkPipelineRasterizationStateCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkPipelineRasterizationStateCreateInfo, sType); 
		 size  [0] = sizeof  (VkPipelineRasterizationStateCreateInfo::sType); 

		 offset[1] = offsetof(VkPipelineRasterizationStateCreateInfo, pNext); 
		 size  [1] = sizeof  (VkPipelineRasterizationStateCreateInfo::pNext); 

		 offset[2] = offsetof(VkPipelineRasterizationStateCreateInfo, flags); 
		 size  [2] = sizeof  (VkPipelineRasterizationStateCreateInfo::flags); 

		 offset[3] = offsetof(VkPipelineRasterizationStateCreateInfo, depthClampEnable); 
		 size  [3] = sizeof  (VkPipelineRasterizationStateCreateInfo::depthClampEnable); 

		 offset[4] = offsetof(VkPipelineRasterizationStateCreateInfo, rasterizerDiscardEnable); 
		 size  [4] = sizeof  (VkPipelineRasterizationStateCreateInfo::rasterizerDiscardEnable); 

		 offset[5] = offsetof(VkPipelineRasterizationStateCreateInfo, polygonMode); 
		 size  [5] = sizeof  (VkPipelineRasterizationStateCreateInfo::polygonMode); 

		 offset[6] = offsetof(VkPipelineRasterizationStateCreateInfo, cullMode); 
		 size  [6] = sizeof  (VkPipelineRasterizationStateCreateInfo::cullMode); 

		 offset[7] = offsetof(VkPipelineRasterizationStateCreateInfo, frontFace); 
		 size  [7] = sizeof  (VkPipelineRasterizationStateCreateInfo::frontFace); 

		 offset[8] = offsetof(VkPipelineRasterizationStateCreateInfo, depthBiasEnable); 
		 size  [8] = sizeof  (VkPipelineRasterizationStateCreateInfo::depthBiasEnable); 

		 offset[9] = offsetof(VkPipelineRasterizationStateCreateInfo, depthBiasConstantFactor); 
		 size  [9] = sizeof  (VkPipelineRasterizationStateCreateInfo::depthBiasConstantFactor); 

		 offset[10] = offsetof(VkPipelineRasterizationStateCreateInfo, depthBiasClamp); 
		 size  [10] = sizeof  (VkPipelineRasterizationStateCreateInfo::depthBiasClamp); 

		 offset[11] = offsetof(VkPipelineRasterizationStateCreateInfo, depthBiasSlopeFactor); 
		 size  [11] = sizeof  (VkPipelineRasterizationStateCreateInfo::depthBiasSlopeFactor); 

		 offset[12] = offsetof(VkPipelineRasterizationStateCreateInfo, lineWidth); 
		 size  [12] = sizeof  (VkPipelineRasterizationStateCreateInfo::lineWidth); 

		 return sizeof(VkPipelineRasterizationStateCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkPipelineMultisampleStateCreateInfo = 9;

	 private native int introspectVkPipelineMultisampleStateCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkPipelineMultisampleStateCreateInfo, sType); 
		 size  [0] = sizeof  (VkPipelineMultisampleStateCreateInfo::sType); 

		 offset[1] = offsetof(VkPipelineMultisampleStateCreateInfo, pNext); 
		 size  [1] = sizeof  (VkPipelineMultisampleStateCreateInfo::pNext); 

		 offset[2] = offsetof(VkPipelineMultisampleStateCreateInfo, flags); 
		 size  [2] = sizeof  (VkPipelineMultisampleStateCreateInfo::flags); 

		 offset[3] = offsetof(VkPipelineMultisampleStateCreateInfo, rasterizationSamples); 
		 size  [3] = sizeof  (VkPipelineMultisampleStateCreateInfo::rasterizationSamples); 

		 offset[4] = offsetof(VkPipelineMultisampleStateCreateInfo, sampleShadingEnable); 
		 size  [4] = sizeof  (VkPipelineMultisampleStateCreateInfo::sampleShadingEnable); 

		 offset[5] = offsetof(VkPipelineMultisampleStateCreateInfo, minSampleShading); 
		 size  [5] = sizeof  (VkPipelineMultisampleStateCreateInfo::minSampleShading); 

		 offset[6] = offsetof(VkPipelineMultisampleStateCreateInfo, pSampleMask); 
		 size  [6] = sizeof  (VkPipelineMultisampleStateCreateInfo::pSampleMask); 

		 offset[7] = offsetof(VkPipelineMultisampleStateCreateInfo, alphaToCoverageEnable); 
		 size  [7] = sizeof  (VkPipelineMultisampleStateCreateInfo::alphaToCoverageEnable); 

		 offset[8] = offsetof(VkPipelineMultisampleStateCreateInfo, alphaToOneEnable); 
		 size  [8] = sizeof  (VkPipelineMultisampleStateCreateInfo::alphaToOneEnable); 

		 return sizeof(VkPipelineMultisampleStateCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkStencilOpState = 7;

	 private native int introspectVkStencilOpState(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkStencilOpState, failOp); 
		 size  [0] = sizeof  (VkStencilOpState::failOp); 

		 offset[1] = offsetof(VkStencilOpState, passOp); 
		 size  [1] = sizeof  (VkStencilOpState::passOp); 

		 offset[2] = offsetof(VkStencilOpState, depthFailOp); 
		 size  [2] = sizeof  (VkStencilOpState::depthFailOp); 

		 offset[3] = offsetof(VkStencilOpState, compareOp); 
		 size  [3] = sizeof  (VkStencilOpState::compareOp); 

		 offset[4] = offsetof(VkStencilOpState, compareMask); 
		 size  [4] = sizeof  (VkStencilOpState::compareMask); 

		 offset[5] = offsetof(VkStencilOpState, writeMask); 
		 size  [5] = sizeof  (VkStencilOpState::writeMask); 

		 offset[6] = offsetof(VkStencilOpState, reference); 
		 size  [6] = sizeof  (VkStencilOpState::reference); 

		 return sizeof(VkStencilOpState)
	 */


	 public static final int MEMBERS_OF_VkPipelineDepthStencilStateCreateInfo = 12;

	 private native int introspectVkPipelineDepthStencilStateCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkPipelineDepthStencilStateCreateInfo, sType); 
		 size  [0] = sizeof  (VkPipelineDepthStencilStateCreateInfo::sType); 

		 offset[1] = offsetof(VkPipelineDepthStencilStateCreateInfo, pNext); 
		 size  [1] = sizeof  (VkPipelineDepthStencilStateCreateInfo::pNext); 

		 offset[2] = offsetof(VkPipelineDepthStencilStateCreateInfo, flags); 
		 size  [2] = sizeof  (VkPipelineDepthStencilStateCreateInfo::flags); 

		 offset[3] = offsetof(VkPipelineDepthStencilStateCreateInfo, depthTestEnable); 
		 size  [3] = sizeof  (VkPipelineDepthStencilStateCreateInfo::depthTestEnable); 

		 offset[4] = offsetof(VkPipelineDepthStencilStateCreateInfo, depthWriteEnable); 
		 size  [4] = sizeof  (VkPipelineDepthStencilStateCreateInfo::depthWriteEnable); 

		 offset[5] = offsetof(VkPipelineDepthStencilStateCreateInfo, depthCompareOp); 
		 size  [5] = sizeof  (VkPipelineDepthStencilStateCreateInfo::depthCompareOp); 

		 offset[6] = offsetof(VkPipelineDepthStencilStateCreateInfo, depthBoundsTestEnable); 
		 size  [6] = sizeof  (VkPipelineDepthStencilStateCreateInfo::depthBoundsTestEnable); 

		 offset[7] = offsetof(VkPipelineDepthStencilStateCreateInfo, stencilTestEnable); 
		 size  [7] = sizeof  (VkPipelineDepthStencilStateCreateInfo::stencilTestEnable); 

		 offset[8] = offsetof(VkPipelineDepthStencilStateCreateInfo, front); 
		 size  [8] = sizeof  (VkPipelineDepthStencilStateCreateInfo::front); 

		 offset[9] = offsetof(VkPipelineDepthStencilStateCreateInfo, back); 
		 size  [9] = sizeof  (VkPipelineDepthStencilStateCreateInfo::back); 

		 offset[10] = offsetof(VkPipelineDepthStencilStateCreateInfo, minDepthBounds); 
		 size  [10] = sizeof  (VkPipelineDepthStencilStateCreateInfo::minDepthBounds); 

		 offset[11] = offsetof(VkPipelineDepthStencilStateCreateInfo, maxDepthBounds); 
		 size  [11] = sizeof  (VkPipelineDepthStencilStateCreateInfo::maxDepthBounds); 

		 return sizeof(VkPipelineDepthStencilStateCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkPipelineColorBlendAttachmentState = 8;

	 private native int introspectVkPipelineColorBlendAttachmentState(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkPipelineColorBlendAttachmentState, blendEnable); 
		 size  [0] = sizeof  (VkPipelineColorBlendAttachmentState::blendEnable); 

		 offset[1] = offsetof(VkPipelineColorBlendAttachmentState, srcColorBlendFactor); 
		 size  [1] = sizeof  (VkPipelineColorBlendAttachmentState::srcColorBlendFactor); 

		 offset[2] = offsetof(VkPipelineColorBlendAttachmentState, dstColorBlendFactor); 
		 size  [2] = sizeof  (VkPipelineColorBlendAttachmentState::dstColorBlendFactor); 

		 offset[3] = offsetof(VkPipelineColorBlendAttachmentState, colorBlendOp); 
		 size  [3] = sizeof  (VkPipelineColorBlendAttachmentState::colorBlendOp); 

		 offset[4] = offsetof(VkPipelineColorBlendAttachmentState, srcAlphaBlendFactor); 
		 size  [4] = sizeof  (VkPipelineColorBlendAttachmentState::srcAlphaBlendFactor); 

		 offset[5] = offsetof(VkPipelineColorBlendAttachmentState, dstAlphaBlendFactor); 
		 size  [5] = sizeof  (VkPipelineColorBlendAttachmentState::dstAlphaBlendFactor); 

		 offset[6] = offsetof(VkPipelineColorBlendAttachmentState, alphaBlendOp); 
		 size  [6] = sizeof  (VkPipelineColorBlendAttachmentState::alphaBlendOp); 

		 offset[7] = offsetof(VkPipelineColorBlendAttachmentState, colorWriteMask); 
		 size  [7] = sizeof  (VkPipelineColorBlendAttachmentState::colorWriteMask); 

		 return sizeof(VkPipelineColorBlendAttachmentState)
	 */


	 public static final int MEMBERS_OF_VkPipelineColorBlendStateCreateInfo = 8;

	 private native int introspectVkPipelineColorBlendStateCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkPipelineColorBlendStateCreateInfo, sType); 
		 size  [0] = sizeof  (VkPipelineColorBlendStateCreateInfo::sType); 

		 offset[1] = offsetof(VkPipelineColorBlendStateCreateInfo, pNext); 
		 size  [1] = sizeof  (VkPipelineColorBlendStateCreateInfo::pNext); 

		 offset[2] = offsetof(VkPipelineColorBlendStateCreateInfo, flags); 
		 size  [2] = sizeof  (VkPipelineColorBlendStateCreateInfo::flags); 

		 offset[3] = offsetof(VkPipelineColorBlendStateCreateInfo, logicOpEnable); 
		 size  [3] = sizeof  (VkPipelineColorBlendStateCreateInfo::logicOpEnable); 

		 offset[4] = offsetof(VkPipelineColorBlendStateCreateInfo, logicOp); 
		 size  [4] = sizeof  (VkPipelineColorBlendStateCreateInfo::logicOp); 

		 offset[5] = offsetof(VkPipelineColorBlendStateCreateInfo, attachmentCount); 
		 size  [5] = sizeof  (VkPipelineColorBlendStateCreateInfo::attachmentCount); 

		 offset[6] = offsetof(VkPipelineColorBlendStateCreateInfo, pAttachments); 
		 size  [6] = sizeof  (VkPipelineColorBlendStateCreateInfo::pAttachments); 

		 offset[7] = offsetof(VkPipelineColorBlendStateCreateInfo, blendConstants); 
		 size  [7] = sizeof  (VkPipelineColorBlendStateCreateInfo::blendConstants); 

		 return sizeof(VkPipelineColorBlendStateCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkPipelineDynamicStateCreateInfo = 5;

	 private native int introspectVkPipelineDynamicStateCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkPipelineDynamicStateCreateInfo, sType); 
		 size  [0] = sizeof  (VkPipelineDynamicStateCreateInfo::sType); 

		 offset[1] = offsetof(VkPipelineDynamicStateCreateInfo, pNext); 
		 size  [1] = sizeof  (VkPipelineDynamicStateCreateInfo::pNext); 

		 offset[2] = offsetof(VkPipelineDynamicStateCreateInfo, flags); 
		 size  [2] = sizeof  (VkPipelineDynamicStateCreateInfo::flags); 

		 offset[3] = offsetof(VkPipelineDynamicStateCreateInfo, dynamicStateCount); 
		 size  [3] = sizeof  (VkPipelineDynamicStateCreateInfo::dynamicStateCount); 

		 offset[4] = offsetof(VkPipelineDynamicStateCreateInfo, pDynamicStates); 
		 size  [4] = sizeof  (VkPipelineDynamicStateCreateInfo::pDynamicStates); 

		 return sizeof(VkPipelineDynamicStateCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkGraphicsPipelineCreateInfo = 19;

	 private native int introspectVkGraphicsPipelineCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkGraphicsPipelineCreateInfo, sType); 
		 size  [0] = sizeof  (VkGraphicsPipelineCreateInfo::sType); 

		 offset[1] = offsetof(VkGraphicsPipelineCreateInfo, pNext); 
		 size  [1] = sizeof  (VkGraphicsPipelineCreateInfo::pNext); 

		 offset[2] = offsetof(VkGraphicsPipelineCreateInfo, flags); 
		 size  [2] = sizeof  (VkGraphicsPipelineCreateInfo::flags); 

		 offset[3] = offsetof(VkGraphicsPipelineCreateInfo, stageCount); 
		 size  [3] = sizeof  (VkGraphicsPipelineCreateInfo::stageCount); 

		 offset[4] = offsetof(VkGraphicsPipelineCreateInfo, pStages); 
		 size  [4] = sizeof  (VkGraphicsPipelineCreateInfo::pStages); 

		 offset[5] = offsetof(VkGraphicsPipelineCreateInfo, pVertexInputState); 
		 size  [5] = sizeof  (VkGraphicsPipelineCreateInfo::pVertexInputState); 

		 offset[6] = offsetof(VkGraphicsPipelineCreateInfo, pInputAssemblyState); 
		 size  [6] = sizeof  (VkGraphicsPipelineCreateInfo::pInputAssemblyState); 

		 offset[7] = offsetof(VkGraphicsPipelineCreateInfo, pTessellationState); 
		 size  [7] = sizeof  (VkGraphicsPipelineCreateInfo::pTessellationState); 

		 offset[8] = offsetof(VkGraphicsPipelineCreateInfo, pViewportState); 
		 size  [8] = sizeof  (VkGraphicsPipelineCreateInfo::pViewportState); 

		 offset[9] = offsetof(VkGraphicsPipelineCreateInfo, pRasterizationState); 
		 size  [9] = sizeof  (VkGraphicsPipelineCreateInfo::pRasterizationState); 

		 offset[10] = offsetof(VkGraphicsPipelineCreateInfo, pMultisampleState); 
		 size  [10] = sizeof  (VkGraphicsPipelineCreateInfo::pMultisampleState); 

		 offset[11] = offsetof(VkGraphicsPipelineCreateInfo, pDepthStencilState); 
		 size  [11] = sizeof  (VkGraphicsPipelineCreateInfo::pDepthStencilState); 

		 offset[12] = offsetof(VkGraphicsPipelineCreateInfo, pColorBlendState); 
		 size  [12] = sizeof  (VkGraphicsPipelineCreateInfo::pColorBlendState); 

		 offset[13] = offsetof(VkGraphicsPipelineCreateInfo, pDynamicState); 
		 size  [13] = sizeof  (VkGraphicsPipelineCreateInfo::pDynamicState); 

		 offset[14] = offsetof(VkGraphicsPipelineCreateInfo, layout); 
		 size  [14] = sizeof  (VkGraphicsPipelineCreateInfo::layout); 

		 offset[15] = offsetof(VkGraphicsPipelineCreateInfo, renderPass); 
		 size  [15] = sizeof  (VkGraphicsPipelineCreateInfo::renderPass); 

		 offset[16] = offsetof(VkGraphicsPipelineCreateInfo, subpass); 
		 size  [16] = sizeof  (VkGraphicsPipelineCreateInfo::subpass); 

		 offset[17] = offsetof(VkGraphicsPipelineCreateInfo, basePipelineHandle); 
		 size  [17] = sizeof  (VkGraphicsPipelineCreateInfo::basePipelineHandle); 

		 offset[18] = offsetof(VkGraphicsPipelineCreateInfo, basePipelineIndex); 
		 size  [18] = sizeof  (VkGraphicsPipelineCreateInfo::basePipelineIndex); 

		 return sizeof(VkGraphicsPipelineCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkComputePipelineCreateInfo = 7;

	 private native int introspectVkComputePipelineCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkComputePipelineCreateInfo, sType); 
		 size  [0] = sizeof  (VkComputePipelineCreateInfo::sType); 

		 offset[1] = offsetof(VkComputePipelineCreateInfo, pNext); 
		 size  [1] = sizeof  (VkComputePipelineCreateInfo::pNext); 

		 offset[2] = offsetof(VkComputePipelineCreateInfo, flags); 
		 size  [2] = sizeof  (VkComputePipelineCreateInfo::flags); 

		 offset[3] = offsetof(VkComputePipelineCreateInfo, stage); 
		 size  [3] = sizeof  (VkComputePipelineCreateInfo::stage); 

		 offset[4] = offsetof(VkComputePipelineCreateInfo, layout); 
		 size  [4] = sizeof  (VkComputePipelineCreateInfo::layout); 

		 offset[5] = offsetof(VkComputePipelineCreateInfo, basePipelineHandle); 
		 size  [5] = sizeof  (VkComputePipelineCreateInfo::basePipelineHandle); 

		 offset[6] = offsetof(VkComputePipelineCreateInfo, basePipelineIndex); 
		 size  [6] = sizeof  (VkComputePipelineCreateInfo::basePipelineIndex); 

		 return sizeof(VkComputePipelineCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkPushConstantRange = 3;

	 private native int introspectVkPushConstantRange(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkPushConstantRange, stageFlags); 
		 size  [0] = sizeof  (VkPushConstantRange::stageFlags); 

		 offset[1] = offsetof(VkPushConstantRange, offset); 
		 size  [1] = sizeof  (VkPushConstantRange::offset); 

		 offset[2] = offsetof(VkPushConstantRange, size); 
		 size  [2] = sizeof  (VkPushConstantRange::size); 

		 return sizeof(VkPushConstantRange)
	 */


	 public static final int MEMBERS_OF_VkPipelineLayoutCreateInfo = 7;

	 private native int introspectVkPipelineLayoutCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkPipelineLayoutCreateInfo, sType); 
		 size  [0] = sizeof  (VkPipelineLayoutCreateInfo::sType); 

		 offset[1] = offsetof(VkPipelineLayoutCreateInfo, pNext); 
		 size  [1] = sizeof  (VkPipelineLayoutCreateInfo::pNext); 

		 offset[2] = offsetof(VkPipelineLayoutCreateInfo, flags); 
		 size  [2] = sizeof  (VkPipelineLayoutCreateInfo::flags); 

		 offset[3] = offsetof(VkPipelineLayoutCreateInfo, setLayoutCount); 
		 size  [3] = sizeof  (VkPipelineLayoutCreateInfo::setLayoutCount); 

		 offset[4] = offsetof(VkPipelineLayoutCreateInfo, pSetLayouts); 
		 size  [4] = sizeof  (VkPipelineLayoutCreateInfo::pSetLayouts); 

		 offset[5] = offsetof(VkPipelineLayoutCreateInfo, pushConstantRangeCount); 
		 size  [5] = sizeof  (VkPipelineLayoutCreateInfo::pushConstantRangeCount); 

		 offset[6] = offsetof(VkPipelineLayoutCreateInfo, pPushConstantRanges); 
		 size  [6] = sizeof  (VkPipelineLayoutCreateInfo::pPushConstantRanges); 

		 return sizeof(VkPipelineLayoutCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkSamplerCreateInfo = 18;

	 private native int introspectVkSamplerCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkSamplerCreateInfo, sType); 
		 size  [0] = sizeof  (VkSamplerCreateInfo::sType); 

		 offset[1] = offsetof(VkSamplerCreateInfo, pNext); 
		 size  [1] = sizeof  (VkSamplerCreateInfo::pNext); 

		 offset[2] = offsetof(VkSamplerCreateInfo, flags); 
		 size  [2] = sizeof  (VkSamplerCreateInfo::flags); 

		 offset[3] = offsetof(VkSamplerCreateInfo, magFilter); 
		 size  [3] = sizeof  (VkSamplerCreateInfo::magFilter); 

		 offset[4] = offsetof(VkSamplerCreateInfo, minFilter); 
		 size  [4] = sizeof  (VkSamplerCreateInfo::minFilter); 

		 offset[5] = offsetof(VkSamplerCreateInfo, mipmapMode); 
		 size  [5] = sizeof  (VkSamplerCreateInfo::mipmapMode); 

		 offset[6] = offsetof(VkSamplerCreateInfo, addressModeU); 
		 size  [6] = sizeof  (VkSamplerCreateInfo::addressModeU); 

		 offset[7] = offsetof(VkSamplerCreateInfo, addressModeV); 
		 size  [7] = sizeof  (VkSamplerCreateInfo::addressModeV); 

		 offset[8] = offsetof(VkSamplerCreateInfo, addressModeW); 
		 size  [8] = sizeof  (VkSamplerCreateInfo::addressModeW); 

		 offset[9] = offsetof(VkSamplerCreateInfo, mipLodBias); 
		 size  [9] = sizeof  (VkSamplerCreateInfo::mipLodBias); 

		 offset[10] = offsetof(VkSamplerCreateInfo, anisotropyEnable); 
		 size  [10] = sizeof  (VkSamplerCreateInfo::anisotropyEnable); 

		 offset[11] = offsetof(VkSamplerCreateInfo, maxAnisotropy); 
		 size  [11] = sizeof  (VkSamplerCreateInfo::maxAnisotropy); 

		 offset[12] = offsetof(VkSamplerCreateInfo, compareEnable); 
		 size  [12] = sizeof  (VkSamplerCreateInfo::compareEnable); 

		 offset[13] = offsetof(VkSamplerCreateInfo, compareOp); 
		 size  [13] = sizeof  (VkSamplerCreateInfo::compareOp); 

		 offset[14] = offsetof(VkSamplerCreateInfo, minLod); 
		 size  [14] = sizeof  (VkSamplerCreateInfo::minLod); 

		 offset[15] = offsetof(VkSamplerCreateInfo, maxLod); 
		 size  [15] = sizeof  (VkSamplerCreateInfo::maxLod); 

		 offset[16] = offsetof(VkSamplerCreateInfo, borderColor); 
		 size  [16] = sizeof  (VkSamplerCreateInfo::borderColor); 

		 offset[17] = offsetof(VkSamplerCreateInfo, unnormalizedCoordinates); 
		 size  [17] = sizeof  (VkSamplerCreateInfo::unnormalizedCoordinates); 

		 return sizeof(VkSamplerCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkDescriptorSetLayoutBinding = 5;

	 private native int introspectVkDescriptorSetLayoutBinding(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDescriptorSetLayoutBinding, binding); 
		 size  [0] = sizeof  (VkDescriptorSetLayoutBinding::binding); 

		 offset[1] = offsetof(VkDescriptorSetLayoutBinding, descriptorType); 
		 size  [1] = sizeof  (VkDescriptorSetLayoutBinding::descriptorType); 

		 offset[2] = offsetof(VkDescriptorSetLayoutBinding, descriptorCount); 
		 size  [2] = sizeof  (VkDescriptorSetLayoutBinding::descriptorCount); 

		 offset[3] = offsetof(VkDescriptorSetLayoutBinding, stageFlags); 
		 size  [3] = sizeof  (VkDescriptorSetLayoutBinding::stageFlags); 

		 offset[4] = offsetof(VkDescriptorSetLayoutBinding, pImmutableSamplers); 
		 size  [4] = sizeof  (VkDescriptorSetLayoutBinding::pImmutableSamplers); 

		 return sizeof(VkDescriptorSetLayoutBinding)
	 */


	 public static final int MEMBERS_OF_VkDescriptorSetLayoutCreateInfo = 5;

	 private native int introspectVkDescriptorSetLayoutCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDescriptorSetLayoutCreateInfo, sType); 
		 size  [0] = sizeof  (VkDescriptorSetLayoutCreateInfo::sType); 

		 offset[1] = offsetof(VkDescriptorSetLayoutCreateInfo, pNext); 
		 size  [1] = sizeof  (VkDescriptorSetLayoutCreateInfo::pNext); 

		 offset[2] = offsetof(VkDescriptorSetLayoutCreateInfo, flags); 
		 size  [2] = sizeof  (VkDescriptorSetLayoutCreateInfo::flags); 

		 offset[3] = offsetof(VkDescriptorSetLayoutCreateInfo, bindingCount); 
		 size  [3] = sizeof  (VkDescriptorSetLayoutCreateInfo::bindingCount); 

		 offset[4] = offsetof(VkDescriptorSetLayoutCreateInfo, pBindings); 
		 size  [4] = sizeof  (VkDescriptorSetLayoutCreateInfo::pBindings); 

		 return sizeof(VkDescriptorSetLayoutCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkDescriptorPoolSize = 2;

	 private native int introspectVkDescriptorPoolSize(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDescriptorPoolSize, type); 
		 size  [0] = sizeof  (VkDescriptorPoolSize::type); 

		 offset[1] = offsetof(VkDescriptorPoolSize, descriptorCount); 
		 size  [1] = sizeof  (VkDescriptorPoolSize::descriptorCount); 

		 return sizeof(VkDescriptorPoolSize)
	 */


	 public static final int MEMBERS_OF_VkDescriptorPoolCreateInfo = 6;

	 private native int introspectVkDescriptorPoolCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDescriptorPoolCreateInfo, sType); 
		 size  [0] = sizeof  (VkDescriptorPoolCreateInfo::sType); 

		 offset[1] = offsetof(VkDescriptorPoolCreateInfo, pNext); 
		 size  [1] = sizeof  (VkDescriptorPoolCreateInfo::pNext); 

		 offset[2] = offsetof(VkDescriptorPoolCreateInfo, flags); 
		 size  [2] = sizeof  (VkDescriptorPoolCreateInfo::flags); 

		 offset[3] = offsetof(VkDescriptorPoolCreateInfo, maxSets); 
		 size  [3] = sizeof  (VkDescriptorPoolCreateInfo::maxSets); 

		 offset[4] = offsetof(VkDescriptorPoolCreateInfo, poolSizeCount); 
		 size  [4] = sizeof  (VkDescriptorPoolCreateInfo::poolSizeCount); 

		 offset[5] = offsetof(VkDescriptorPoolCreateInfo, pPoolSizes); 
		 size  [5] = sizeof  (VkDescriptorPoolCreateInfo::pPoolSizes); 

		 return sizeof(VkDescriptorPoolCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkDescriptorSetAllocateInfo = 5;

	 private native int introspectVkDescriptorSetAllocateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDescriptorSetAllocateInfo, sType); 
		 size  [0] = sizeof  (VkDescriptorSetAllocateInfo::sType); 

		 offset[1] = offsetof(VkDescriptorSetAllocateInfo, pNext); 
		 size  [1] = sizeof  (VkDescriptorSetAllocateInfo::pNext); 

		 offset[2] = offsetof(VkDescriptorSetAllocateInfo, descriptorPool); 
		 size  [2] = sizeof  (VkDescriptorSetAllocateInfo::descriptorPool); 

		 offset[3] = offsetof(VkDescriptorSetAllocateInfo, descriptorSetCount); 
		 size  [3] = sizeof  (VkDescriptorSetAllocateInfo::descriptorSetCount); 

		 offset[4] = offsetof(VkDescriptorSetAllocateInfo, pSetLayouts); 
		 size  [4] = sizeof  (VkDescriptorSetAllocateInfo::pSetLayouts); 

		 return sizeof(VkDescriptorSetAllocateInfo)
	 */


	 public static final int MEMBERS_OF_VkDescriptorImageInfo = 3;

	 private native int introspectVkDescriptorImageInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDescriptorImageInfo, sampler); 
		 size  [0] = sizeof  (VkDescriptorImageInfo::sampler); 

		 offset[1] = offsetof(VkDescriptorImageInfo, imageView); 
		 size  [1] = sizeof  (VkDescriptorImageInfo::imageView); 

		 offset[2] = offsetof(VkDescriptorImageInfo, imageLayout); 
		 size  [2] = sizeof  (VkDescriptorImageInfo::imageLayout); 

		 return sizeof(VkDescriptorImageInfo)
	 */


	 public static final int MEMBERS_OF_VkDescriptorBufferInfo = 3;

	 private native int introspectVkDescriptorBufferInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDescriptorBufferInfo, buffer); 
		 size  [0] = sizeof  (VkDescriptorBufferInfo::buffer); 

		 offset[1] = offsetof(VkDescriptorBufferInfo, offset); 
		 size  [1] = sizeof  (VkDescriptorBufferInfo::offset); 

		 offset[2] = offsetof(VkDescriptorBufferInfo, range); 
		 size  [2] = sizeof  (VkDescriptorBufferInfo::range); 

		 return sizeof(VkDescriptorBufferInfo)
	 */


	 public static final int MEMBERS_OF_VkWriteDescriptorSet = 10;

	 private native int introspectVkWriteDescriptorSet(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkWriteDescriptorSet, sType); 
		 size  [0] = sizeof  (VkWriteDescriptorSet::sType); 

		 offset[1] = offsetof(VkWriteDescriptorSet, pNext); 
		 size  [1] = sizeof  (VkWriteDescriptorSet::pNext); 

		 offset[2] = offsetof(VkWriteDescriptorSet, dstSet); 
		 size  [2] = sizeof  (VkWriteDescriptorSet::dstSet); 

		 offset[3] = offsetof(VkWriteDescriptorSet, dstBinding); 
		 size  [3] = sizeof  (VkWriteDescriptorSet::dstBinding); 

		 offset[4] = offsetof(VkWriteDescriptorSet, dstArrayElement); 
		 size  [4] = sizeof  (VkWriteDescriptorSet::dstArrayElement); 

		 offset[5] = offsetof(VkWriteDescriptorSet, descriptorCount); 
		 size  [5] = sizeof  (VkWriteDescriptorSet::descriptorCount); 

		 offset[6] = offsetof(VkWriteDescriptorSet, descriptorType); 
		 size  [6] = sizeof  (VkWriteDescriptorSet::descriptorType); 

		 offset[7] = offsetof(VkWriteDescriptorSet, pImageInfo); 
		 size  [7] = sizeof  (VkWriteDescriptorSet::pImageInfo); 

		 offset[8] = offsetof(VkWriteDescriptorSet, pBufferInfo); 
		 size  [8] = sizeof  (VkWriteDescriptorSet::pBufferInfo); 

		 offset[9] = offsetof(VkWriteDescriptorSet, pTexelBufferView); 
		 size  [9] = sizeof  (VkWriteDescriptorSet::pTexelBufferView); 

		 return sizeof(VkWriteDescriptorSet)
	 */


	 public static final int MEMBERS_OF_VkCopyDescriptorSet = 9;

	 private native int introspectVkCopyDescriptorSet(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkCopyDescriptorSet, sType); 
		 size  [0] = sizeof  (VkCopyDescriptorSet::sType); 

		 offset[1] = offsetof(VkCopyDescriptorSet, pNext); 
		 size  [1] = sizeof  (VkCopyDescriptorSet::pNext); 

		 offset[2] = offsetof(VkCopyDescriptorSet, srcSet); 
		 size  [2] = sizeof  (VkCopyDescriptorSet::srcSet); 

		 offset[3] = offsetof(VkCopyDescriptorSet, srcBinding); 
		 size  [3] = sizeof  (VkCopyDescriptorSet::srcBinding); 

		 offset[4] = offsetof(VkCopyDescriptorSet, srcArrayElement); 
		 size  [4] = sizeof  (VkCopyDescriptorSet::srcArrayElement); 

		 offset[5] = offsetof(VkCopyDescriptorSet, dstSet); 
		 size  [5] = sizeof  (VkCopyDescriptorSet::dstSet); 

		 offset[6] = offsetof(VkCopyDescriptorSet, dstBinding); 
		 size  [6] = sizeof  (VkCopyDescriptorSet::dstBinding); 

		 offset[7] = offsetof(VkCopyDescriptorSet, dstArrayElement); 
		 size  [7] = sizeof  (VkCopyDescriptorSet::dstArrayElement); 

		 offset[8] = offsetof(VkCopyDescriptorSet, descriptorCount); 
		 size  [8] = sizeof  (VkCopyDescriptorSet::descriptorCount); 

		 return sizeof(VkCopyDescriptorSet)
	 */


	 public static final int MEMBERS_OF_VkFramebufferCreateInfo = 9;

	 private native int introspectVkFramebufferCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkFramebufferCreateInfo, sType); 
		 size  [0] = sizeof  (VkFramebufferCreateInfo::sType); 

		 offset[1] = offsetof(VkFramebufferCreateInfo, pNext); 
		 size  [1] = sizeof  (VkFramebufferCreateInfo::pNext); 

		 offset[2] = offsetof(VkFramebufferCreateInfo, flags); 
		 size  [2] = sizeof  (VkFramebufferCreateInfo::flags); 

		 offset[3] = offsetof(VkFramebufferCreateInfo, renderPass); 
		 size  [3] = sizeof  (VkFramebufferCreateInfo::renderPass); 

		 offset[4] = offsetof(VkFramebufferCreateInfo, attachmentCount); 
		 size  [4] = sizeof  (VkFramebufferCreateInfo::attachmentCount); 

		 offset[5] = offsetof(VkFramebufferCreateInfo, pAttachments); 
		 size  [5] = sizeof  (VkFramebufferCreateInfo::pAttachments); 

		 offset[6] = offsetof(VkFramebufferCreateInfo, width); 
		 size  [6] = sizeof  (VkFramebufferCreateInfo::width); 

		 offset[7] = offsetof(VkFramebufferCreateInfo, height); 
		 size  [7] = sizeof  (VkFramebufferCreateInfo::height); 

		 offset[8] = offsetof(VkFramebufferCreateInfo, layers); 
		 size  [8] = sizeof  (VkFramebufferCreateInfo::layers); 

		 return sizeof(VkFramebufferCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkAttachmentDescription = 9;

	 private native int introspectVkAttachmentDescription(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkAttachmentDescription, flags); 
		 size  [0] = sizeof  (VkAttachmentDescription::flags); 

		 offset[1] = offsetof(VkAttachmentDescription, format); 
		 size  [1] = sizeof  (VkAttachmentDescription::format); 

		 offset[2] = offsetof(VkAttachmentDescription, samples); 
		 size  [2] = sizeof  (VkAttachmentDescription::samples); 

		 offset[3] = offsetof(VkAttachmentDescription, loadOp); 
		 size  [3] = sizeof  (VkAttachmentDescription::loadOp); 

		 offset[4] = offsetof(VkAttachmentDescription, storeOp); 
		 size  [4] = sizeof  (VkAttachmentDescription::storeOp); 

		 offset[5] = offsetof(VkAttachmentDescription, stencilLoadOp); 
		 size  [5] = sizeof  (VkAttachmentDescription::stencilLoadOp); 

		 offset[6] = offsetof(VkAttachmentDescription, stencilStoreOp); 
		 size  [6] = sizeof  (VkAttachmentDescription::stencilStoreOp); 

		 offset[7] = offsetof(VkAttachmentDescription, initialLayout); 
		 size  [7] = sizeof  (VkAttachmentDescription::initialLayout); 

		 offset[8] = offsetof(VkAttachmentDescription, finalLayout); 
		 size  [8] = sizeof  (VkAttachmentDescription::finalLayout); 

		 return sizeof(VkAttachmentDescription)
	 */


	 public static final int MEMBERS_OF_VkAttachmentReference = 2;

	 private native int introspectVkAttachmentReference(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkAttachmentReference, attachment); 
		 size  [0] = sizeof  (VkAttachmentReference::attachment); 

		 offset[1] = offsetof(VkAttachmentReference, layout); 
		 size  [1] = sizeof  (VkAttachmentReference::layout); 

		 return sizeof(VkAttachmentReference)
	 */


	 public static final int MEMBERS_OF_VkSubpassDescription = 10;

	 private native int introspectVkSubpassDescription(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkSubpassDescription, flags); 
		 size  [0] = sizeof  (VkSubpassDescription::flags); 

		 offset[1] = offsetof(VkSubpassDescription, pipelineBindPoint); 
		 size  [1] = sizeof  (VkSubpassDescription::pipelineBindPoint); 

		 offset[2] = offsetof(VkSubpassDescription, inputAttachmentCount); 
		 size  [2] = sizeof  (VkSubpassDescription::inputAttachmentCount); 

		 offset[3] = offsetof(VkSubpassDescription, pInputAttachments); 
		 size  [3] = sizeof  (VkSubpassDescription::pInputAttachments); 

		 offset[4] = offsetof(VkSubpassDescription, colorAttachmentCount); 
		 size  [4] = sizeof  (VkSubpassDescription::colorAttachmentCount); 

		 offset[5] = offsetof(VkSubpassDescription, pColorAttachments); 
		 size  [5] = sizeof  (VkSubpassDescription::pColorAttachments); 

		 offset[6] = offsetof(VkSubpassDescription, pResolveAttachments); 
		 size  [6] = sizeof  (VkSubpassDescription::pResolveAttachments); 

		 offset[7] = offsetof(VkSubpassDescription, pDepthStencilAttachment); 
		 size  [7] = sizeof  (VkSubpassDescription::pDepthStencilAttachment); 

		 offset[8] = offsetof(VkSubpassDescription, preserveAttachmentCount); 
		 size  [8] = sizeof  (VkSubpassDescription::preserveAttachmentCount); 

		 offset[9] = offsetof(VkSubpassDescription, pPreserveAttachments); 
		 size  [9] = sizeof  (VkSubpassDescription::pPreserveAttachments); 

		 return sizeof(VkSubpassDescription)
	 */


	 public static final int MEMBERS_OF_VkSubpassDependency = 7;

	 private native int introspectVkSubpassDependency(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkSubpassDependency, srcSubpass); 
		 size  [0] = sizeof  (VkSubpassDependency::srcSubpass); 

		 offset[1] = offsetof(VkSubpassDependency, dstSubpass); 
		 size  [1] = sizeof  (VkSubpassDependency::dstSubpass); 

		 offset[2] = offsetof(VkSubpassDependency, srcStageMask); 
		 size  [2] = sizeof  (VkSubpassDependency::srcStageMask); 

		 offset[3] = offsetof(VkSubpassDependency, dstStageMask); 
		 size  [3] = sizeof  (VkSubpassDependency::dstStageMask); 

		 offset[4] = offsetof(VkSubpassDependency, srcAccessMask); 
		 size  [4] = sizeof  (VkSubpassDependency::srcAccessMask); 

		 offset[5] = offsetof(VkSubpassDependency, dstAccessMask); 
		 size  [5] = sizeof  (VkSubpassDependency::dstAccessMask); 

		 offset[6] = offsetof(VkSubpassDependency, dependencyFlags); 
		 size  [6] = sizeof  (VkSubpassDependency::dependencyFlags); 

		 return sizeof(VkSubpassDependency)
	 */


	 public static final int MEMBERS_OF_VkRenderPassCreateInfo = 9;

	 private native int introspectVkRenderPassCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkRenderPassCreateInfo, sType); 
		 size  [0] = sizeof  (VkRenderPassCreateInfo::sType); 

		 offset[1] = offsetof(VkRenderPassCreateInfo, pNext); 
		 size  [1] = sizeof  (VkRenderPassCreateInfo::pNext); 

		 offset[2] = offsetof(VkRenderPassCreateInfo, flags); 
		 size  [2] = sizeof  (VkRenderPassCreateInfo::flags); 

		 offset[3] = offsetof(VkRenderPassCreateInfo, attachmentCount); 
		 size  [3] = sizeof  (VkRenderPassCreateInfo::attachmentCount); 

		 offset[4] = offsetof(VkRenderPassCreateInfo, pAttachments); 
		 size  [4] = sizeof  (VkRenderPassCreateInfo::pAttachments); 

		 offset[5] = offsetof(VkRenderPassCreateInfo, subpassCount); 
		 size  [5] = sizeof  (VkRenderPassCreateInfo::subpassCount); 

		 offset[6] = offsetof(VkRenderPassCreateInfo, pSubpasses); 
		 size  [6] = sizeof  (VkRenderPassCreateInfo::pSubpasses); 

		 offset[7] = offsetof(VkRenderPassCreateInfo, dependencyCount); 
		 size  [7] = sizeof  (VkRenderPassCreateInfo::dependencyCount); 

		 offset[8] = offsetof(VkRenderPassCreateInfo, pDependencies); 
		 size  [8] = sizeof  (VkRenderPassCreateInfo::pDependencies); 

		 return sizeof(VkRenderPassCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkCommandPoolCreateInfo = 4;

	 private native int introspectVkCommandPoolCreateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkCommandPoolCreateInfo, sType); 
		 size  [0] = sizeof  (VkCommandPoolCreateInfo::sType); 

		 offset[1] = offsetof(VkCommandPoolCreateInfo, pNext); 
		 size  [1] = sizeof  (VkCommandPoolCreateInfo::pNext); 

		 offset[2] = offsetof(VkCommandPoolCreateInfo, flags); 
		 size  [2] = sizeof  (VkCommandPoolCreateInfo::flags); 

		 offset[3] = offsetof(VkCommandPoolCreateInfo, queueFamilyIndex); 
		 size  [3] = sizeof  (VkCommandPoolCreateInfo::queueFamilyIndex); 

		 return sizeof(VkCommandPoolCreateInfo)
	 */


	 public static final int MEMBERS_OF_VkCommandBufferAllocateInfo = 5;

	 private native int introspectVkCommandBufferAllocateInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkCommandBufferAllocateInfo, sType); 
		 size  [0] = sizeof  (VkCommandBufferAllocateInfo::sType); 

		 offset[1] = offsetof(VkCommandBufferAllocateInfo, pNext); 
		 size  [1] = sizeof  (VkCommandBufferAllocateInfo::pNext); 

		 offset[2] = offsetof(VkCommandBufferAllocateInfo, commandPool); 
		 size  [2] = sizeof  (VkCommandBufferAllocateInfo::commandPool); 

		 offset[3] = offsetof(VkCommandBufferAllocateInfo, level); 
		 size  [3] = sizeof  (VkCommandBufferAllocateInfo::level); 

		 offset[4] = offsetof(VkCommandBufferAllocateInfo, commandBufferCount); 
		 size  [4] = sizeof  (VkCommandBufferAllocateInfo::commandBufferCount); 

		 return sizeof(VkCommandBufferAllocateInfo)
	 */


	 public static final int MEMBERS_OF_VkCommandBufferInheritanceInfo = 8;

	 private native int introspectVkCommandBufferInheritanceInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkCommandBufferInheritanceInfo, sType); 
		 size  [0] = sizeof  (VkCommandBufferInheritanceInfo::sType); 

		 offset[1] = offsetof(VkCommandBufferInheritanceInfo, pNext); 
		 size  [1] = sizeof  (VkCommandBufferInheritanceInfo::pNext); 

		 offset[2] = offsetof(VkCommandBufferInheritanceInfo, renderPass); 
		 size  [2] = sizeof  (VkCommandBufferInheritanceInfo::renderPass); 

		 offset[3] = offsetof(VkCommandBufferInheritanceInfo, subpass); 
		 size  [3] = sizeof  (VkCommandBufferInheritanceInfo::subpass); 

		 offset[4] = offsetof(VkCommandBufferInheritanceInfo, framebuffer); 
		 size  [4] = sizeof  (VkCommandBufferInheritanceInfo::framebuffer); 

		 offset[5] = offsetof(VkCommandBufferInheritanceInfo, occlusionQueryEnable); 
		 size  [5] = sizeof  (VkCommandBufferInheritanceInfo::occlusionQueryEnable); 

		 offset[6] = offsetof(VkCommandBufferInheritanceInfo, queryFlags); 
		 size  [6] = sizeof  (VkCommandBufferInheritanceInfo::queryFlags); 

		 offset[7] = offsetof(VkCommandBufferInheritanceInfo, pipelineStatistics); 
		 size  [7] = sizeof  (VkCommandBufferInheritanceInfo::pipelineStatistics); 

		 return sizeof(VkCommandBufferInheritanceInfo)
	 */


	 public static final int MEMBERS_OF_VkCommandBufferBeginInfo = 4;

	 private native int introspectVkCommandBufferBeginInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkCommandBufferBeginInfo, sType); 
		 size  [0] = sizeof  (VkCommandBufferBeginInfo::sType); 

		 offset[1] = offsetof(VkCommandBufferBeginInfo, pNext); 
		 size  [1] = sizeof  (VkCommandBufferBeginInfo::pNext); 

		 offset[2] = offsetof(VkCommandBufferBeginInfo, flags); 
		 size  [2] = sizeof  (VkCommandBufferBeginInfo::flags); 

		 offset[3] = offsetof(VkCommandBufferBeginInfo, pInheritanceInfo); 
		 size  [3] = sizeof  (VkCommandBufferBeginInfo::pInheritanceInfo); 

		 return sizeof(VkCommandBufferBeginInfo)
	 */


	 public static final int MEMBERS_OF_VkBufferCopy = 3;

	 private native int introspectVkBufferCopy(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkBufferCopy, srcOffset); 
		 size  [0] = sizeof  (VkBufferCopy::srcOffset); 

		 offset[1] = offsetof(VkBufferCopy, dstOffset); 
		 size  [1] = sizeof  (VkBufferCopy::dstOffset); 

		 offset[2] = offsetof(VkBufferCopy, size); 
		 size  [2] = sizeof  (VkBufferCopy::size); 

		 return sizeof(VkBufferCopy)
	 */


	 public static final int MEMBERS_OF_VkImageSubresourceLayers = 4;

	 private native int introspectVkImageSubresourceLayers(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkImageSubresourceLayers, aspectMask); 
		 size  [0] = sizeof  (VkImageSubresourceLayers::aspectMask); 

		 offset[1] = offsetof(VkImageSubresourceLayers, mipLevel); 
		 size  [1] = sizeof  (VkImageSubresourceLayers::mipLevel); 

		 offset[2] = offsetof(VkImageSubresourceLayers, baseArrayLayer); 
		 size  [2] = sizeof  (VkImageSubresourceLayers::baseArrayLayer); 

		 offset[3] = offsetof(VkImageSubresourceLayers, layerCount); 
		 size  [3] = sizeof  (VkImageSubresourceLayers::layerCount); 

		 return sizeof(VkImageSubresourceLayers)
	 */


	 public static final int MEMBERS_OF_VkImageCopy = 5;

	 private native int introspectVkImageCopy(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkImageCopy, srcSubresource); 
		 size  [0] = sizeof  (VkImageCopy::srcSubresource); 

		 offset[1] = offsetof(VkImageCopy, srcOffset); 
		 size  [1] = sizeof  (VkImageCopy::srcOffset); 

		 offset[2] = offsetof(VkImageCopy, dstSubresource); 
		 size  [2] = sizeof  (VkImageCopy::dstSubresource); 

		 offset[3] = offsetof(VkImageCopy, dstOffset); 
		 size  [3] = sizeof  (VkImageCopy::dstOffset); 

		 offset[4] = offsetof(VkImageCopy, extent); 
		 size  [4] = sizeof  (VkImageCopy::extent); 

		 return sizeof(VkImageCopy)
	 */


	 public static final int MEMBERS_OF_VkImageBlit = 4;

	 private native int introspectVkImageBlit(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkImageBlit, srcSubresource); 
		 size  [0] = sizeof  (VkImageBlit::srcSubresource); 

		 offset[1] = offsetof(VkImageBlit, srcOffsets); 
		 size  [1] = sizeof  (VkImageBlit::srcOffsets); 

		 offset[2] = offsetof(VkImageBlit, dstSubresource); 
		 size  [2] = sizeof  (VkImageBlit::dstSubresource); 

		 offset[3] = offsetof(VkImageBlit, dstOffsets); 
		 size  [3] = sizeof  (VkImageBlit::dstOffsets); 

		 return sizeof(VkImageBlit)
	 */


	 public static final int MEMBERS_OF_VkBufferImageCopy = 6;

	 private native int introspectVkBufferImageCopy(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkBufferImageCopy, bufferOffset); 
		 size  [0] = sizeof  (VkBufferImageCopy::bufferOffset); 

		 offset[1] = offsetof(VkBufferImageCopy, bufferRowLength); 
		 size  [1] = sizeof  (VkBufferImageCopy::bufferRowLength); 

		 offset[2] = offsetof(VkBufferImageCopy, bufferImageHeight); 
		 size  [2] = sizeof  (VkBufferImageCopy::bufferImageHeight); 

		 offset[3] = offsetof(VkBufferImageCopy, imageSubresource); 
		 size  [3] = sizeof  (VkBufferImageCopy::imageSubresource); 

		 offset[4] = offsetof(VkBufferImageCopy, imageOffset); 
		 size  [4] = sizeof  (VkBufferImageCopy::imageOffset); 

		 offset[5] = offsetof(VkBufferImageCopy, imageExtent); 
		 size  [5] = sizeof  (VkBufferImageCopy::imageExtent); 

		 return sizeof(VkBufferImageCopy)
	 */


	 public static final int MEMBERS_OF_VkClearDepthStencilValue = 2;

	 private native int introspectVkClearDepthStencilValue(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkClearDepthStencilValue, depth); 
		 size  [0] = sizeof  (VkClearDepthStencilValue::depth); 

		 offset[1] = offsetof(VkClearDepthStencilValue, stencil); 
		 size  [1] = sizeof  (VkClearDepthStencilValue::stencil); 

		 return sizeof(VkClearDepthStencilValue)
	 */


	 public static final int MEMBERS_OF_VkClearAttachment = 3;

	 private native int introspectVkClearAttachment(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkClearAttachment, aspectMask); 
		 size  [0] = sizeof  (VkClearAttachment::aspectMask); 

		 offset[1] = offsetof(VkClearAttachment, colorAttachment); 
		 size  [1] = sizeof  (VkClearAttachment::colorAttachment); 

		 offset[2] = offsetof(VkClearAttachment, clearValue); 
		 size  [2] = sizeof  (VkClearAttachment::clearValue); 

		 return sizeof(VkClearAttachment)
	 */


	 public static final int MEMBERS_OF_VkClearRect = 3;

	 private native int introspectVkClearRect(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkClearRect, rect); 
		 size  [0] = sizeof  (VkClearRect::rect); 

		 offset[1] = offsetof(VkClearRect, baseArrayLayer); 
		 size  [1] = sizeof  (VkClearRect::baseArrayLayer); 

		 offset[2] = offsetof(VkClearRect, layerCount); 
		 size  [2] = sizeof  (VkClearRect::layerCount); 

		 return sizeof(VkClearRect)
	 */


	 public static final int MEMBERS_OF_VkImageResolve = 5;

	 private native int introspectVkImageResolve(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkImageResolve, srcSubresource); 
		 size  [0] = sizeof  (VkImageResolve::srcSubresource); 

		 offset[1] = offsetof(VkImageResolve, srcOffset); 
		 size  [1] = sizeof  (VkImageResolve::srcOffset); 

		 offset[2] = offsetof(VkImageResolve, dstSubresource); 
		 size  [2] = sizeof  (VkImageResolve::dstSubresource); 

		 offset[3] = offsetof(VkImageResolve, dstOffset); 
		 size  [3] = sizeof  (VkImageResolve::dstOffset); 

		 offset[4] = offsetof(VkImageResolve, extent); 
		 size  [4] = sizeof  (VkImageResolve::extent); 

		 return sizeof(VkImageResolve)
	 */


	 public static final int MEMBERS_OF_VkMemoryBarrier = 4;

	 private native int introspectVkMemoryBarrier(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkMemoryBarrier, sType); 
		 size  [0] = sizeof  (VkMemoryBarrier::sType); 

		 offset[1] = offsetof(VkMemoryBarrier, pNext); 
		 size  [1] = sizeof  (VkMemoryBarrier::pNext); 

		 offset[2] = offsetof(VkMemoryBarrier, srcAccessMask); 
		 size  [2] = sizeof  (VkMemoryBarrier::srcAccessMask); 

		 offset[3] = offsetof(VkMemoryBarrier, dstAccessMask); 
		 size  [3] = sizeof  (VkMemoryBarrier::dstAccessMask); 

		 return sizeof(VkMemoryBarrier)
	 */


	 public static final int MEMBERS_OF_VkBufferMemoryBarrier = 9;

	 private native int introspectVkBufferMemoryBarrier(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkBufferMemoryBarrier, sType); 
		 size  [0] = sizeof  (VkBufferMemoryBarrier::sType); 

		 offset[1] = offsetof(VkBufferMemoryBarrier, pNext); 
		 size  [1] = sizeof  (VkBufferMemoryBarrier::pNext); 

		 offset[2] = offsetof(VkBufferMemoryBarrier, srcAccessMask); 
		 size  [2] = sizeof  (VkBufferMemoryBarrier::srcAccessMask); 

		 offset[3] = offsetof(VkBufferMemoryBarrier, dstAccessMask); 
		 size  [3] = sizeof  (VkBufferMemoryBarrier::dstAccessMask); 

		 offset[4] = offsetof(VkBufferMemoryBarrier, srcQueueFamilyIndex); 
		 size  [4] = sizeof  (VkBufferMemoryBarrier::srcQueueFamilyIndex); 

		 offset[5] = offsetof(VkBufferMemoryBarrier, dstQueueFamilyIndex); 
		 size  [5] = sizeof  (VkBufferMemoryBarrier::dstQueueFamilyIndex); 

		 offset[6] = offsetof(VkBufferMemoryBarrier, buffer); 
		 size  [6] = sizeof  (VkBufferMemoryBarrier::buffer); 

		 offset[7] = offsetof(VkBufferMemoryBarrier, offset); 
		 size  [7] = sizeof  (VkBufferMemoryBarrier::offset); 

		 offset[8] = offsetof(VkBufferMemoryBarrier, size); 
		 size  [8] = sizeof  (VkBufferMemoryBarrier::size); 

		 return sizeof(VkBufferMemoryBarrier)
	 */


	 public static final int MEMBERS_OF_VkImageMemoryBarrier = 10;

	 private native int introspectVkImageMemoryBarrier(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkImageMemoryBarrier, sType); 
		 size  [0] = sizeof  (VkImageMemoryBarrier::sType); 

		 offset[1] = offsetof(VkImageMemoryBarrier, pNext); 
		 size  [1] = sizeof  (VkImageMemoryBarrier::pNext); 

		 offset[2] = offsetof(VkImageMemoryBarrier, srcAccessMask); 
		 size  [2] = sizeof  (VkImageMemoryBarrier::srcAccessMask); 

		 offset[3] = offsetof(VkImageMemoryBarrier, dstAccessMask); 
		 size  [3] = sizeof  (VkImageMemoryBarrier::dstAccessMask); 

		 offset[4] = offsetof(VkImageMemoryBarrier, oldLayout); 
		 size  [4] = sizeof  (VkImageMemoryBarrier::oldLayout); 

		 offset[5] = offsetof(VkImageMemoryBarrier, newLayout); 
		 size  [5] = sizeof  (VkImageMemoryBarrier::newLayout); 

		 offset[6] = offsetof(VkImageMemoryBarrier, srcQueueFamilyIndex); 
		 size  [6] = sizeof  (VkImageMemoryBarrier::srcQueueFamilyIndex); 

		 offset[7] = offsetof(VkImageMemoryBarrier, dstQueueFamilyIndex); 
		 size  [7] = sizeof  (VkImageMemoryBarrier::dstQueueFamilyIndex); 

		 offset[8] = offsetof(VkImageMemoryBarrier, image); 
		 size  [8] = sizeof  (VkImageMemoryBarrier::image); 

		 offset[9] = offsetof(VkImageMemoryBarrier, subresourceRange); 
		 size  [9] = sizeof  (VkImageMemoryBarrier::subresourceRange); 

		 return sizeof(VkImageMemoryBarrier)
	 */


	 public static final int MEMBERS_OF_VkRenderPassBeginInfo = 7;

	 private native int introspectVkRenderPassBeginInfo(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkRenderPassBeginInfo, sType); 
		 size  [0] = sizeof  (VkRenderPassBeginInfo::sType); 

		 offset[1] = offsetof(VkRenderPassBeginInfo, pNext); 
		 size  [1] = sizeof  (VkRenderPassBeginInfo::pNext); 

		 offset[2] = offsetof(VkRenderPassBeginInfo, renderPass); 
		 size  [2] = sizeof  (VkRenderPassBeginInfo::renderPass); 

		 offset[3] = offsetof(VkRenderPassBeginInfo, framebuffer); 
		 size  [3] = sizeof  (VkRenderPassBeginInfo::framebuffer); 

		 offset[4] = offsetof(VkRenderPassBeginInfo, renderArea); 
		 size  [4] = sizeof  (VkRenderPassBeginInfo::renderArea); 

		 offset[5] = offsetof(VkRenderPassBeginInfo, clearValueCount); 
		 size  [5] = sizeof  (VkRenderPassBeginInfo::clearValueCount); 

		 offset[6] = offsetof(VkRenderPassBeginInfo, pClearValues); 
		 size  [6] = sizeof  (VkRenderPassBeginInfo::pClearValues); 

		 return sizeof(VkRenderPassBeginInfo)
	 */


	 public static final int MEMBERS_OF_VkDispatchIndirectCommand = 3;

	 private native int introspectVkDispatchIndirectCommand(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDispatchIndirectCommand, x); 
		 size  [0] = sizeof  (VkDispatchIndirectCommand::x); 

		 offset[1] = offsetof(VkDispatchIndirectCommand, y); 
		 size  [1] = sizeof  (VkDispatchIndirectCommand::y); 

		 offset[2] = offsetof(VkDispatchIndirectCommand, z); 
		 size  [2] = sizeof  (VkDispatchIndirectCommand::z); 

		 return sizeof(VkDispatchIndirectCommand)
	 */


	 public static final int MEMBERS_OF_VkDrawIndexedIndirectCommand = 5;

	 private native int introspectVkDrawIndexedIndirectCommand(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDrawIndexedIndirectCommand, indexCount); 
		 size  [0] = sizeof  (VkDrawIndexedIndirectCommand::indexCount); 

		 offset[1] = offsetof(VkDrawIndexedIndirectCommand, instanceCount); 
		 size  [1] = sizeof  (VkDrawIndexedIndirectCommand::instanceCount); 

		 offset[2] = offsetof(VkDrawIndexedIndirectCommand, firstIndex); 
		 size  [2] = sizeof  (VkDrawIndexedIndirectCommand::firstIndex); 

		 offset[3] = offsetof(VkDrawIndexedIndirectCommand, vertexOffset); 
		 size  [3] = sizeof  (VkDrawIndexedIndirectCommand::vertexOffset); 

		 offset[4] = offsetof(VkDrawIndexedIndirectCommand, firstInstance); 
		 size  [4] = sizeof  (VkDrawIndexedIndirectCommand::firstInstance); 

		 return sizeof(VkDrawIndexedIndirectCommand)
	 */


	 public static final int MEMBERS_OF_VkDrawIndirectCommand = 4;

	 private native int introspectVkDrawIndirectCommand(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDrawIndirectCommand, vertexCount); 
		 size  [0] = sizeof  (VkDrawIndirectCommand::vertexCount); 

		 offset[1] = offsetof(VkDrawIndirectCommand, instanceCount); 
		 size  [1] = sizeof  (VkDrawIndirectCommand::instanceCount); 

		 offset[2] = offsetof(VkDrawIndirectCommand, firstVertex); 
		 size  [2] = sizeof  (VkDrawIndirectCommand::firstVertex); 

		 offset[3] = offsetof(VkDrawIndirectCommand, firstInstance); 
		 size  [3] = sizeof  (VkDrawIndirectCommand::firstInstance); 

		 return sizeof(VkDrawIndirectCommand)
	 */


	 public static final int MEMBERS_OF_VkSurfaceCapabilitiesKHR = 10;

	 private native int introspectVkSurfaceCapabilitiesKHR(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkSurfaceCapabilitiesKHR, minImageCount); 
		 size  [0] = sizeof  (VkSurfaceCapabilitiesKHR::minImageCount); 

		 offset[1] = offsetof(VkSurfaceCapabilitiesKHR, maxImageCount); 
		 size  [1] = sizeof  (VkSurfaceCapabilitiesKHR::maxImageCount); 

		 offset[2] = offsetof(VkSurfaceCapabilitiesKHR, currentExtent); 
		 size  [2] = sizeof  (VkSurfaceCapabilitiesKHR::currentExtent); 

		 offset[3] = offsetof(VkSurfaceCapabilitiesKHR, minImageExtent); 
		 size  [3] = sizeof  (VkSurfaceCapabilitiesKHR::minImageExtent); 

		 offset[4] = offsetof(VkSurfaceCapabilitiesKHR, maxImageExtent); 
		 size  [4] = sizeof  (VkSurfaceCapabilitiesKHR::maxImageExtent); 

		 offset[5] = offsetof(VkSurfaceCapabilitiesKHR, maxImageArrayLayers); 
		 size  [5] = sizeof  (VkSurfaceCapabilitiesKHR::maxImageArrayLayers); 

		 offset[6] = offsetof(VkSurfaceCapabilitiesKHR, supportedTransforms); 
		 size  [6] = sizeof  (VkSurfaceCapabilitiesKHR::supportedTransforms); 

		 offset[7] = offsetof(VkSurfaceCapabilitiesKHR, currentTransform); 
		 size  [7] = sizeof  (VkSurfaceCapabilitiesKHR::currentTransform); 

		 offset[8] = offsetof(VkSurfaceCapabilitiesKHR, supportedCompositeAlpha); 
		 size  [8] = sizeof  (VkSurfaceCapabilitiesKHR::supportedCompositeAlpha); 

		 offset[9] = offsetof(VkSurfaceCapabilitiesKHR, supportedUsageFlags); 
		 size  [9] = sizeof  (VkSurfaceCapabilitiesKHR::supportedUsageFlags); 

		 return sizeof(VkSurfaceCapabilitiesKHR)
	 */


	 public static final int MEMBERS_OF_VkSurfaceFormatKHR = 2;

	 private native int introspectVkSurfaceFormatKHR(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkSurfaceFormatKHR, format); 
		 size  [0] = sizeof  (VkSurfaceFormatKHR::format); 

		 offset[1] = offsetof(VkSurfaceFormatKHR, colorSpace); 
		 size  [1] = sizeof  (VkSurfaceFormatKHR::colorSpace); 

		 return sizeof(VkSurfaceFormatKHR)
	 */


	 public static final int MEMBERS_OF_VkSwapchainCreateInfoKHR = 18;

	 private native int introspectVkSwapchainCreateInfoKHR(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkSwapchainCreateInfoKHR, sType); 
		 size  [0] = sizeof  (VkSwapchainCreateInfoKHR::sType); 

		 offset[1] = offsetof(VkSwapchainCreateInfoKHR, pNext); 
		 size  [1] = sizeof  (VkSwapchainCreateInfoKHR::pNext); 

		 offset[2] = offsetof(VkSwapchainCreateInfoKHR, flags); 
		 size  [2] = sizeof  (VkSwapchainCreateInfoKHR::flags); 

		 offset[3] = offsetof(VkSwapchainCreateInfoKHR, surface); 
		 size  [3] = sizeof  (VkSwapchainCreateInfoKHR::surface); 

		 offset[4] = offsetof(VkSwapchainCreateInfoKHR, minImageCount); 
		 size  [4] = sizeof  (VkSwapchainCreateInfoKHR::minImageCount); 

		 offset[5] = offsetof(VkSwapchainCreateInfoKHR, imageFormat); 
		 size  [5] = sizeof  (VkSwapchainCreateInfoKHR::imageFormat); 

		 offset[6] = offsetof(VkSwapchainCreateInfoKHR, imageColorSpace); 
		 size  [6] = sizeof  (VkSwapchainCreateInfoKHR::imageColorSpace); 

		 offset[7] = offsetof(VkSwapchainCreateInfoKHR, imageExtent); 
		 size  [7] = sizeof  (VkSwapchainCreateInfoKHR::imageExtent); 

		 offset[8] = offsetof(VkSwapchainCreateInfoKHR, imageArrayLayers); 
		 size  [8] = sizeof  (VkSwapchainCreateInfoKHR::imageArrayLayers); 

		 offset[9] = offsetof(VkSwapchainCreateInfoKHR, imageUsage); 
		 size  [9] = sizeof  (VkSwapchainCreateInfoKHR::imageUsage); 

		 offset[10] = offsetof(VkSwapchainCreateInfoKHR, imageSharingMode); 
		 size  [10] = sizeof  (VkSwapchainCreateInfoKHR::imageSharingMode); 

		 offset[11] = offsetof(VkSwapchainCreateInfoKHR, queueFamilyIndexCount); 
		 size  [11] = sizeof  (VkSwapchainCreateInfoKHR::queueFamilyIndexCount); 

		 offset[12] = offsetof(VkSwapchainCreateInfoKHR, pQueueFamilyIndices); 
		 size  [12] = sizeof  (VkSwapchainCreateInfoKHR::pQueueFamilyIndices); 

		 offset[13] = offsetof(VkSwapchainCreateInfoKHR, preTransform); 
		 size  [13] = sizeof  (VkSwapchainCreateInfoKHR::preTransform); 

		 offset[14] = offsetof(VkSwapchainCreateInfoKHR, compositeAlpha); 
		 size  [14] = sizeof  (VkSwapchainCreateInfoKHR::compositeAlpha); 

		 offset[15] = offsetof(VkSwapchainCreateInfoKHR, presentMode); 
		 size  [15] = sizeof  (VkSwapchainCreateInfoKHR::presentMode); 

		 offset[16] = offsetof(VkSwapchainCreateInfoKHR, clipped); 
		 size  [16] = sizeof  (VkSwapchainCreateInfoKHR::clipped); 

		 offset[17] = offsetof(VkSwapchainCreateInfoKHR, oldSwapchain); 
		 size  [17] = sizeof  (VkSwapchainCreateInfoKHR::oldSwapchain); 

		 return sizeof(VkSwapchainCreateInfoKHR)
	 */


	 public static final int MEMBERS_OF_VkPresentInfoKHR = 8;

	 private native int introspectVkPresentInfoKHR(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkPresentInfoKHR, sType); 
		 size  [0] = sizeof  (VkPresentInfoKHR::sType); 

		 offset[1] = offsetof(VkPresentInfoKHR, pNext); 
		 size  [1] = sizeof  (VkPresentInfoKHR::pNext); 

		 offset[2] = offsetof(VkPresentInfoKHR, waitSemaphoreCount); 
		 size  [2] = sizeof  (VkPresentInfoKHR::waitSemaphoreCount); 

		 offset[3] = offsetof(VkPresentInfoKHR, pWaitSemaphores); 
		 size  [3] = sizeof  (VkPresentInfoKHR::pWaitSemaphores); 

		 offset[4] = offsetof(VkPresentInfoKHR, swapchainCount); 
		 size  [4] = sizeof  (VkPresentInfoKHR::swapchainCount); 

		 offset[5] = offsetof(VkPresentInfoKHR, pSwapchains); 
		 size  [5] = sizeof  (VkPresentInfoKHR::pSwapchains); 

		 offset[6] = offsetof(VkPresentInfoKHR, pImageIndices); 
		 size  [6] = sizeof  (VkPresentInfoKHR::pImageIndices); 

		 offset[7] = offsetof(VkPresentInfoKHR, pResults); 
		 size  [7] = sizeof  (VkPresentInfoKHR::pResults); 

		 return sizeof(VkPresentInfoKHR)
	 */


	 public static final int MEMBERS_OF_VkDisplayPropertiesKHR = 7;

	 private native int introspectVkDisplayPropertiesKHR(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDisplayPropertiesKHR, display); 
		 size  [0] = sizeof  (VkDisplayPropertiesKHR::display); 

		 offset[1] = offsetof(VkDisplayPropertiesKHR, displayName); 
		 size  [1] = sizeof  (VkDisplayPropertiesKHR::displayName); 

		 offset[2] = offsetof(VkDisplayPropertiesKHR, physicalDimensions); 
		 size  [2] = sizeof  (VkDisplayPropertiesKHR::physicalDimensions); 

		 offset[3] = offsetof(VkDisplayPropertiesKHR, physicalResolution); 
		 size  [3] = sizeof  (VkDisplayPropertiesKHR::physicalResolution); 

		 offset[4] = offsetof(VkDisplayPropertiesKHR, supportedTransforms); 
		 size  [4] = sizeof  (VkDisplayPropertiesKHR::supportedTransforms); 

		 offset[5] = offsetof(VkDisplayPropertiesKHR, planeReorderPossible); 
		 size  [5] = sizeof  (VkDisplayPropertiesKHR::planeReorderPossible); 

		 offset[6] = offsetof(VkDisplayPropertiesKHR, persistentContent); 
		 size  [6] = sizeof  (VkDisplayPropertiesKHR::persistentContent); 

		 return sizeof(VkDisplayPropertiesKHR)
	 */


	 public static final int MEMBERS_OF_VkDisplayModeParametersKHR = 2;

	 private native int introspectVkDisplayModeParametersKHR(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDisplayModeParametersKHR, visibleRegion); 
		 size  [0] = sizeof  (VkDisplayModeParametersKHR::visibleRegion); 

		 offset[1] = offsetof(VkDisplayModeParametersKHR, refreshRate); 
		 size  [1] = sizeof  (VkDisplayModeParametersKHR::refreshRate); 

		 return sizeof(VkDisplayModeParametersKHR)
	 */


	 public static final int MEMBERS_OF_VkDisplayModePropertiesKHR = 2;

	 private native int introspectVkDisplayModePropertiesKHR(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDisplayModePropertiesKHR, displayMode); 
		 size  [0] = sizeof  (VkDisplayModePropertiesKHR::displayMode); 

		 offset[1] = offsetof(VkDisplayModePropertiesKHR, parameters); 
		 size  [1] = sizeof  (VkDisplayModePropertiesKHR::parameters); 

		 return sizeof(VkDisplayModePropertiesKHR)
	 */


	 public static final int MEMBERS_OF_VkDisplayModeCreateInfoKHR = 4;

	 private native int introspectVkDisplayModeCreateInfoKHR(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDisplayModeCreateInfoKHR, sType); 
		 size  [0] = sizeof  (VkDisplayModeCreateInfoKHR::sType); 

		 offset[1] = offsetof(VkDisplayModeCreateInfoKHR, pNext); 
		 size  [1] = sizeof  (VkDisplayModeCreateInfoKHR::pNext); 

		 offset[2] = offsetof(VkDisplayModeCreateInfoKHR, flags); 
		 size  [2] = sizeof  (VkDisplayModeCreateInfoKHR::flags); 

		 offset[3] = offsetof(VkDisplayModeCreateInfoKHR, parameters); 
		 size  [3] = sizeof  (VkDisplayModeCreateInfoKHR::parameters); 

		 return sizeof(VkDisplayModeCreateInfoKHR)
	 */


	 public static final int MEMBERS_OF_VkDisplayPlaneCapabilitiesKHR = 9;

	 private native int introspectVkDisplayPlaneCapabilitiesKHR(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDisplayPlaneCapabilitiesKHR, supportedAlpha); 
		 size  [0] = sizeof  (VkDisplayPlaneCapabilitiesKHR::supportedAlpha); 

		 offset[1] = offsetof(VkDisplayPlaneCapabilitiesKHR, minSrcPosition); 
		 size  [1] = sizeof  (VkDisplayPlaneCapabilitiesKHR::minSrcPosition); 

		 offset[2] = offsetof(VkDisplayPlaneCapabilitiesKHR, maxSrcPosition); 
		 size  [2] = sizeof  (VkDisplayPlaneCapabilitiesKHR::maxSrcPosition); 

		 offset[3] = offsetof(VkDisplayPlaneCapabilitiesKHR, minSrcExtent); 
		 size  [3] = sizeof  (VkDisplayPlaneCapabilitiesKHR::minSrcExtent); 

		 offset[4] = offsetof(VkDisplayPlaneCapabilitiesKHR, maxSrcExtent); 
		 size  [4] = sizeof  (VkDisplayPlaneCapabilitiesKHR::maxSrcExtent); 

		 offset[5] = offsetof(VkDisplayPlaneCapabilitiesKHR, minDstPosition); 
		 size  [5] = sizeof  (VkDisplayPlaneCapabilitiesKHR::minDstPosition); 

		 offset[6] = offsetof(VkDisplayPlaneCapabilitiesKHR, maxDstPosition); 
		 size  [6] = sizeof  (VkDisplayPlaneCapabilitiesKHR::maxDstPosition); 

		 offset[7] = offsetof(VkDisplayPlaneCapabilitiesKHR, minDstExtent); 
		 size  [7] = sizeof  (VkDisplayPlaneCapabilitiesKHR::minDstExtent); 

		 offset[8] = offsetof(VkDisplayPlaneCapabilitiesKHR, maxDstExtent); 
		 size  [8] = sizeof  (VkDisplayPlaneCapabilitiesKHR::maxDstExtent); 

		 return sizeof(VkDisplayPlaneCapabilitiesKHR)
	 */


	 public static final int MEMBERS_OF_VkDisplayPlanePropertiesKHR = 2;

	 private native int introspectVkDisplayPlanePropertiesKHR(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDisplayPlanePropertiesKHR, currentDisplay); 
		 size  [0] = sizeof  (VkDisplayPlanePropertiesKHR::currentDisplay); 

		 offset[1] = offsetof(VkDisplayPlanePropertiesKHR, currentStackIndex); 
		 size  [1] = sizeof  (VkDisplayPlanePropertiesKHR::currentStackIndex); 

		 return sizeof(VkDisplayPlanePropertiesKHR)
	 */


	 public static final int MEMBERS_OF_VkDisplaySurfaceCreateInfoKHR = 10;

	 private native int introspectVkDisplaySurfaceCreateInfoKHR(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDisplaySurfaceCreateInfoKHR, sType); 
		 size  [0] = sizeof  (VkDisplaySurfaceCreateInfoKHR::sType); 

		 offset[1] = offsetof(VkDisplaySurfaceCreateInfoKHR, pNext); 
		 size  [1] = sizeof  (VkDisplaySurfaceCreateInfoKHR::pNext); 

		 offset[2] = offsetof(VkDisplaySurfaceCreateInfoKHR, flags); 
		 size  [2] = sizeof  (VkDisplaySurfaceCreateInfoKHR::flags); 

		 offset[3] = offsetof(VkDisplaySurfaceCreateInfoKHR, displayMode); 
		 size  [3] = sizeof  (VkDisplaySurfaceCreateInfoKHR::displayMode); 

		 offset[4] = offsetof(VkDisplaySurfaceCreateInfoKHR, planeIndex); 
		 size  [4] = sizeof  (VkDisplaySurfaceCreateInfoKHR::planeIndex); 

		 offset[5] = offsetof(VkDisplaySurfaceCreateInfoKHR, planeStackIndex); 
		 size  [5] = sizeof  (VkDisplaySurfaceCreateInfoKHR::planeStackIndex); 

		 offset[6] = offsetof(VkDisplaySurfaceCreateInfoKHR, transform); 
		 size  [6] = sizeof  (VkDisplaySurfaceCreateInfoKHR::transform); 

		 offset[7] = offsetof(VkDisplaySurfaceCreateInfoKHR, globalAlpha); 
		 size  [7] = sizeof  (VkDisplaySurfaceCreateInfoKHR::globalAlpha); 

		 offset[8] = offsetof(VkDisplaySurfaceCreateInfoKHR, alphaMode); 
		 size  [8] = sizeof  (VkDisplaySurfaceCreateInfoKHR::alphaMode); 

		 offset[9] = offsetof(VkDisplaySurfaceCreateInfoKHR, imageExtent); 
		 size  [9] = sizeof  (VkDisplaySurfaceCreateInfoKHR::imageExtent); 

		 return sizeof(VkDisplaySurfaceCreateInfoKHR)
	 */


	 public static final int MEMBERS_OF_VkDisplayPresentInfoKHR = 5;

	 private native int introspectVkDisplayPresentInfoKHR(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDisplayPresentInfoKHR, sType); 
		 size  [0] = sizeof  (VkDisplayPresentInfoKHR::sType); 

		 offset[1] = offsetof(VkDisplayPresentInfoKHR, pNext); 
		 size  [1] = sizeof  (VkDisplayPresentInfoKHR::pNext); 

		 offset[2] = offsetof(VkDisplayPresentInfoKHR, srcRect); 
		 size  [2] = sizeof  (VkDisplayPresentInfoKHR::srcRect); 

		 offset[3] = offsetof(VkDisplayPresentInfoKHR, dstRect); 
		 size  [3] = sizeof  (VkDisplayPresentInfoKHR::dstRect); 

		 offset[4] = offsetof(VkDisplayPresentInfoKHR, persistent); 
		 size  [4] = sizeof  (VkDisplayPresentInfoKHR::persistent); 

		 return sizeof(VkDisplayPresentInfoKHR)
	 */


	 public static final int MEMBERS_OF_VkXlibSurfaceCreateInfoKHR = 5;

	 private native int introspectVkXlibSurfaceCreateInfoKHR(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkXlibSurfaceCreateInfoKHR, sType); 
		 size  [0] = sizeof  (VkXlibSurfaceCreateInfoKHR::sType); 

		 offset[1] = offsetof(VkXlibSurfaceCreateInfoKHR, pNext); 
		 size  [1] = sizeof  (VkXlibSurfaceCreateInfoKHR::pNext); 

		 offset[2] = offsetof(VkXlibSurfaceCreateInfoKHR, flags); 
		 size  [2] = sizeof  (VkXlibSurfaceCreateInfoKHR::flags); 

		 offset[3] = offsetof(VkXlibSurfaceCreateInfoKHR, dpy); 
		 size  [3] = sizeof  (VkXlibSurfaceCreateInfoKHR::dpy); 

		 offset[4] = offsetof(VkXlibSurfaceCreateInfoKHR, window); 
		 size  [4] = sizeof  (VkXlibSurfaceCreateInfoKHR::window); 

		 return sizeof(VkXlibSurfaceCreateInfoKHR)
	 */


	 public static final int MEMBERS_OF_VkXcbSurfaceCreateInfoKHR = 5;

	 private native int introspectVkXcbSurfaceCreateInfoKHR(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkXcbSurfaceCreateInfoKHR, sType); 
		 size  [0] = sizeof  (VkXcbSurfaceCreateInfoKHR::sType); 

		 offset[1] = offsetof(VkXcbSurfaceCreateInfoKHR, pNext); 
		 size  [1] = sizeof  (VkXcbSurfaceCreateInfoKHR::pNext); 

		 offset[2] = offsetof(VkXcbSurfaceCreateInfoKHR, flags); 
		 size  [2] = sizeof  (VkXcbSurfaceCreateInfoKHR::flags); 

		 offset[3] = offsetof(VkXcbSurfaceCreateInfoKHR, connection); 
		 size  [3] = sizeof  (VkXcbSurfaceCreateInfoKHR::connection); 

		 offset[4] = offsetof(VkXcbSurfaceCreateInfoKHR, window); 
		 size  [4] = sizeof  (VkXcbSurfaceCreateInfoKHR::window); 

		 return sizeof(VkXcbSurfaceCreateInfoKHR)
	 */


	 public static final int MEMBERS_OF_VkWaylandSurfaceCreateInfoKHR = 5;

	 private native int introspectVkWaylandSurfaceCreateInfoKHR(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkWaylandSurfaceCreateInfoKHR, sType); 
		 size  [0] = sizeof  (VkWaylandSurfaceCreateInfoKHR::sType); 

		 offset[1] = offsetof(VkWaylandSurfaceCreateInfoKHR, pNext); 
		 size  [1] = sizeof  (VkWaylandSurfaceCreateInfoKHR::pNext); 

		 offset[2] = offsetof(VkWaylandSurfaceCreateInfoKHR, flags); 
		 size  [2] = sizeof  (VkWaylandSurfaceCreateInfoKHR::flags); 

		 offset[3] = offsetof(VkWaylandSurfaceCreateInfoKHR, display); 
		 size  [3] = sizeof  (VkWaylandSurfaceCreateInfoKHR::display); 

		 offset[4] = offsetof(VkWaylandSurfaceCreateInfoKHR, surface); 
		 size  [4] = sizeof  (VkWaylandSurfaceCreateInfoKHR::surface); 

		 return sizeof(VkWaylandSurfaceCreateInfoKHR)
	 */


	 public static final int MEMBERS_OF_VkMirSurfaceCreateInfoKHR = 5;

	 private native int introspectVkMirSurfaceCreateInfoKHR(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkMirSurfaceCreateInfoKHR, sType); 
		 size  [0] = sizeof  (VkMirSurfaceCreateInfoKHR::sType); 

		 offset[1] = offsetof(VkMirSurfaceCreateInfoKHR, pNext); 
		 size  [1] = sizeof  (VkMirSurfaceCreateInfoKHR::pNext); 

		 offset[2] = offsetof(VkMirSurfaceCreateInfoKHR, flags); 
		 size  [2] = sizeof  (VkMirSurfaceCreateInfoKHR::flags); 

		 offset[3] = offsetof(VkMirSurfaceCreateInfoKHR, connection); 
		 size  [3] = sizeof  (VkMirSurfaceCreateInfoKHR::connection); 

		 offset[4] = offsetof(VkMirSurfaceCreateInfoKHR, mirSurface); 
		 size  [4] = sizeof  (VkMirSurfaceCreateInfoKHR::mirSurface); 

		 return sizeof(VkMirSurfaceCreateInfoKHR)
	 */


	 public static final int MEMBERS_OF_VkAndroidSurfaceCreateInfoKHR = 4;

	 private native int introspectVkAndroidSurfaceCreateInfoKHR(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkAndroidSurfaceCreateInfoKHR, sType); 
		 size  [0] = sizeof  (VkAndroidSurfaceCreateInfoKHR::sType); 

		 offset[1] = offsetof(VkAndroidSurfaceCreateInfoKHR, pNext); 
		 size  [1] = sizeof  (VkAndroidSurfaceCreateInfoKHR::pNext); 

		 offset[2] = offsetof(VkAndroidSurfaceCreateInfoKHR, flags); 
		 size  [2] = sizeof  (VkAndroidSurfaceCreateInfoKHR::flags); 

		 offset[3] = offsetof(VkAndroidSurfaceCreateInfoKHR, window); 
		 size  [3] = sizeof  (VkAndroidSurfaceCreateInfoKHR::window); 

		 return sizeof(VkAndroidSurfaceCreateInfoKHR)
	 */


	 public static final int MEMBERS_OF_VkWin32SurfaceCreateInfoKHR = 5;

	 private native int introspectVkWin32SurfaceCreateInfoKHR(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkWin32SurfaceCreateInfoKHR, sType); 
		 size  [0] = sizeof  (VkWin32SurfaceCreateInfoKHR::sType); 

		 offset[1] = offsetof(VkWin32SurfaceCreateInfoKHR, pNext); 
		 size  [1] = sizeof  (VkWin32SurfaceCreateInfoKHR::pNext); 

		 offset[2] = offsetof(VkWin32SurfaceCreateInfoKHR, flags); 
		 size  [2] = sizeof  (VkWin32SurfaceCreateInfoKHR::flags); 

		 offset[3] = offsetof(VkWin32SurfaceCreateInfoKHR, hinstance); 
		 size  [3] = sizeof  (VkWin32SurfaceCreateInfoKHR::hinstance); 

		 offset[4] = offsetof(VkWin32SurfaceCreateInfoKHR, hwnd); 
		 size  [4] = sizeof  (VkWin32SurfaceCreateInfoKHR::hwnd); 

		 return sizeof(VkWin32SurfaceCreateInfoKHR)
	 */


	 public static final int MEMBERS_OF_VkDebugReportCallbackCreateInfoEXT = 5;

	 private native int introspectVkDebugReportCallbackCreateInfoEXT(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDebugReportCallbackCreateInfoEXT, sType); 
		 size  [0] = sizeof  (VkDebugReportCallbackCreateInfoEXT::sType); 

		 offset[1] = offsetof(VkDebugReportCallbackCreateInfoEXT, pNext); 
		 size  [1] = sizeof  (VkDebugReportCallbackCreateInfoEXT::pNext); 

		 offset[2] = offsetof(VkDebugReportCallbackCreateInfoEXT, flags); 
		 size  [2] = sizeof  (VkDebugReportCallbackCreateInfoEXT::flags); 

		 offset[3] = offsetof(VkDebugReportCallbackCreateInfoEXT, pfnCallback); 
		 size  [3] = sizeof  (VkDebugReportCallbackCreateInfoEXT::pfnCallback); 

		 offset[4] = offsetof(VkDebugReportCallbackCreateInfoEXT, pUserData); 
		 size  [4] = sizeof  (VkDebugReportCallbackCreateInfoEXT::pUserData); 

		 return sizeof(VkDebugReportCallbackCreateInfoEXT)
	 */


	 public static final int MEMBERS_OF_VkPipelineRasterizationStateRasterizationOrderAMD = 3;

	 private native int introspectVkPipelineRasterizationStateRasterizationOrderAMD(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkPipelineRasterizationStateRasterizationOrderAMD, sType); 
		 size  [0] = sizeof  (VkPipelineRasterizationStateRasterizationOrderAMD::sType); 

		 offset[1] = offsetof(VkPipelineRasterizationStateRasterizationOrderAMD, pNext); 
		 size  [1] = sizeof  (VkPipelineRasterizationStateRasterizationOrderAMD::pNext); 

		 offset[2] = offsetof(VkPipelineRasterizationStateRasterizationOrderAMD, rasterizationOrder); 
		 size  [2] = sizeof  (VkPipelineRasterizationStateRasterizationOrderAMD::rasterizationOrder); 

		 return sizeof(VkPipelineRasterizationStateRasterizationOrderAMD)
	 */


	 public static final int MEMBERS_OF_VkDebugMarkerObjectNameInfoEXT = 5;

	 private native int introspectVkDebugMarkerObjectNameInfoEXT(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDebugMarkerObjectNameInfoEXT, sType); 
		 size  [0] = sizeof  (VkDebugMarkerObjectNameInfoEXT::sType); 

		 offset[1] = offsetof(VkDebugMarkerObjectNameInfoEXT, pNext); 
		 size  [1] = sizeof  (VkDebugMarkerObjectNameInfoEXT::pNext); 

		 offset[2] = offsetof(VkDebugMarkerObjectNameInfoEXT, objectType); 
		 size  [2] = sizeof  (VkDebugMarkerObjectNameInfoEXT::objectType); 

		 offset[3] = offsetof(VkDebugMarkerObjectNameInfoEXT, object); 
		 size  [3] = sizeof  (VkDebugMarkerObjectNameInfoEXT::object); 

		 offset[4] = offsetof(VkDebugMarkerObjectNameInfoEXT, pObjectName); 
		 size  [4] = sizeof  (VkDebugMarkerObjectNameInfoEXT::pObjectName); 

		 return sizeof(VkDebugMarkerObjectNameInfoEXT)
	 */


	 public static final int MEMBERS_OF_VkDebugMarkerObjectTagInfoEXT = 7;

	 private native int introspectVkDebugMarkerObjectTagInfoEXT(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDebugMarkerObjectTagInfoEXT, sType); 
		 size  [0] = sizeof  (VkDebugMarkerObjectTagInfoEXT::sType); 

		 offset[1] = offsetof(VkDebugMarkerObjectTagInfoEXT, pNext); 
		 size  [1] = sizeof  (VkDebugMarkerObjectTagInfoEXT::pNext); 

		 offset[2] = offsetof(VkDebugMarkerObjectTagInfoEXT, objectType); 
		 size  [2] = sizeof  (VkDebugMarkerObjectTagInfoEXT::objectType); 

		 offset[3] = offsetof(VkDebugMarkerObjectTagInfoEXT, object); 
		 size  [3] = sizeof  (VkDebugMarkerObjectTagInfoEXT::object); 

		 offset[4] = offsetof(VkDebugMarkerObjectTagInfoEXT, tagName); 
		 size  [4] = sizeof  (VkDebugMarkerObjectTagInfoEXT::tagName); 

		 offset[5] = offsetof(VkDebugMarkerObjectTagInfoEXT, tagSize); 
		 size  [5] = sizeof  (VkDebugMarkerObjectTagInfoEXT::tagSize); 

		 offset[6] = offsetof(VkDebugMarkerObjectTagInfoEXT, pTag); 
		 size  [6] = sizeof  (VkDebugMarkerObjectTagInfoEXT::pTag); 

		 return sizeof(VkDebugMarkerObjectTagInfoEXT)
	 */


	 public static final int MEMBERS_OF_VkDebugMarkerMarkerInfoEXT = 4;

	 private native int introspectVkDebugMarkerMarkerInfoEXT(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDebugMarkerMarkerInfoEXT, sType); 
		 size  [0] = sizeof  (VkDebugMarkerMarkerInfoEXT::sType); 

		 offset[1] = offsetof(VkDebugMarkerMarkerInfoEXT, pNext); 
		 size  [1] = sizeof  (VkDebugMarkerMarkerInfoEXT::pNext); 

		 offset[2] = offsetof(VkDebugMarkerMarkerInfoEXT, pMarkerName); 
		 size  [2] = sizeof  (VkDebugMarkerMarkerInfoEXT::pMarkerName); 

		 offset[3] = offsetof(VkDebugMarkerMarkerInfoEXT, color); 
		 size  [3] = sizeof  (VkDebugMarkerMarkerInfoEXT::color); 

		 return sizeof(VkDebugMarkerMarkerInfoEXT)
	 */


	 public static final int MEMBERS_OF_VkDedicatedAllocationImageCreateInfoNV = 3;

	 private native int introspectVkDedicatedAllocationImageCreateInfoNV(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDedicatedAllocationImageCreateInfoNV, sType); 
		 size  [0] = sizeof  (VkDedicatedAllocationImageCreateInfoNV::sType); 

		 offset[1] = offsetof(VkDedicatedAllocationImageCreateInfoNV, pNext); 
		 size  [1] = sizeof  (VkDedicatedAllocationImageCreateInfoNV::pNext); 

		 offset[2] = offsetof(VkDedicatedAllocationImageCreateInfoNV, dedicatedAllocation); 
		 size  [2] = sizeof  (VkDedicatedAllocationImageCreateInfoNV::dedicatedAllocation); 

		 return sizeof(VkDedicatedAllocationImageCreateInfoNV)
	 */


	 public static final int MEMBERS_OF_VkDedicatedAllocationBufferCreateInfoNV = 3;

	 private native int introspectVkDedicatedAllocationBufferCreateInfoNV(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDedicatedAllocationBufferCreateInfoNV, sType); 
		 size  [0] = sizeof  (VkDedicatedAllocationBufferCreateInfoNV::sType); 

		 offset[1] = offsetof(VkDedicatedAllocationBufferCreateInfoNV, pNext); 
		 size  [1] = sizeof  (VkDedicatedAllocationBufferCreateInfoNV::pNext); 

		 offset[2] = offsetof(VkDedicatedAllocationBufferCreateInfoNV, dedicatedAllocation); 
		 size  [2] = sizeof  (VkDedicatedAllocationBufferCreateInfoNV::dedicatedAllocation); 

		 return sizeof(VkDedicatedAllocationBufferCreateInfoNV)
	 */


	 public static final int MEMBERS_OF_VkDedicatedAllocationMemoryAllocateInfoNV = 4;

	 private native int introspectVkDedicatedAllocationMemoryAllocateInfoNV(int[] offset, int[] size);/*
		 offset[0] = offsetof(VkDedicatedAllocationMemoryAllocateInfoNV, sType); 
		 size  [0] = sizeof  (VkDedicatedAllocationMemoryAllocateInfoNV::sType); 

		 offset[1] = offsetof(VkDedicatedAllocationMemoryAllocateInfoNV, pNext); 
		 size  [1] = sizeof  (VkDedicatedAllocationMemoryAllocateInfoNV::pNext); 

		 offset[2] = offsetof(VkDedicatedAllocationMemoryAllocateInfoNV, image); 
		 size  [2] = sizeof  (VkDedicatedAllocationMemoryAllocateInfoNV::image); 

		 offset[3] = offsetof(VkDedicatedAllocationMemoryAllocateInfoNV, buffer); 
		 size  [3] = sizeof  (VkDedicatedAllocationMemoryAllocateInfoNV::buffer); 

		 return sizeof(VkDedicatedAllocationMemoryAllocateInfoNV)
	 */




   

}
