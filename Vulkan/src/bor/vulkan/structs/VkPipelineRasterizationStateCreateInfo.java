/**
 * Class wrapping Vulkan's VkPipelineRasterizationStateCreateInfo struct.
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
 *  This class is a Java front end for struct VkPipelineRasterizationStateCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPipelineRasterizationStateCreateInfo {
 *     VkStructureType                            sType;
 *     const void*                                pNext;
 *     VkPipelineRasterizationStateCreateFlags    flags;
 *     VkBool32                                   depthClampEnable;
 *     VkBool32                                   rasterizerDiscardEnable;
 *     VkPolygonMode                              polygonMode;
 *     VkCullModeFlags                            cullMode;
 *     VkFrontFace                                frontFace;
 *     VkBool32                                   depthBiasEnable;
 *     float                                      depthBiasConstantFactor;
 *     float                                      depthBiasClamp;
 *     float                                      depthBiasSlopeFactor;
 *     float                                      lineWidth;
 * } VkPipelineRasterizationStateCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkPipelineRasterizationStateCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [59]  */
	 private static final String TAG = "VkPipelineRasterizationStateCreateInfo";

	/** ID of this structure [59]  */
	 public static final int TAG_ID = VKPIPELINERASTERIZATIONSTATECREATEINFO_ID;

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
	 *  VkPipelineRasterizationStateCreateFlags 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  VkBool32 	depthClampEnable	[boolean]
	 */ 
	boolean 	depthClampEnable;
	
	/**
	 *  VkBool32 	rasterizerDiscardEnable	[boolean]
	 */ 
	boolean 	rasterizerDiscardEnable;
	
	/**
	 *  VkPolygonMode 	polygonMode	[vkenum]
	 */ 
	VkPolygonMode 	polygonMode;
	
	/**
	 *  VkCullModeFlags 	cullMode	[int]
	 */ 
	int 	cullMode;
	
	/**
	 *  VkFrontFace 	frontFace	[vkenum]
	 */ 
	VkFrontFace 	frontFace;
	
	/**
	 *  VkBool32 	depthBiasEnable	[boolean]
	 */ 
	boolean 	depthBiasEnable;
	
	/**
	 *  float 	depthBiasConstantFactor	[float]
	 */ 
	float 	depthBiasConstantFactor;
	
	/**
	 *  float 	depthBiasClamp	[float]
	 */ 
	float 	depthBiasClamp;
	
	/**
	 *  float 	depthBiasSlopeFactor	[float]
	 */ 
	float 	depthBiasSlopeFactor;
	
	/**
	 *  float 	lineWidth	[float]
	 */ 
	float 	lineWidth;
	/**
	 * Ctor
	 */
	public VkPipelineRasterizationStateCreateInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineRasterizationStateCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPipelineRasterizationStateCreateInfo(long address){ 
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
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 * 
	 * @param sType - a instance of VkStructureType.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineRasterizationStateCreateInfo sType(VkStructureType sType){
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
	 public VkPipelineRasterizationStateCreateInfo pNext(VkObject pNext){
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
	 * Prototype: VkPipelineRasterizationStateCreateFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineRasterizationStateCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkPipelineRasterizationStateCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field depthClampEnable	[boolean]<br>
	 * Prototype: VkBool32  depthClampEnable
	 * 
	 * @param depthClampEnable - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineRasterizationStateCreateInfo depthClampEnable(boolean depthClampEnable){
		 this.depthClampEnable = depthClampEnable;
		 setDepthClampEnable0(this.ptr,  depthClampEnable);
		 return this;
	 }

	/**
	 * Get method for field depthClampEnable	[boolean]<br>
	 * Prototype: VkBool32  depthClampEnable
	 */ 
	 public boolean depthClampEnable(){
		 boolean var = getDepthClampEnable0(super.ptr);
		 this.depthClampEnable = var;
		 return this.depthClampEnable;
	 }

	/**
	 * Set method for field rasterizerDiscardEnable	[boolean]<br>
	 * Prototype: VkBool32  rasterizerDiscardEnable
	 * 
	 * @param rasterizerDiscardEnable - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineRasterizationStateCreateInfo rasterizerDiscardEnable(boolean rasterizerDiscardEnable){
		 this.rasterizerDiscardEnable = rasterizerDiscardEnable;
		 setRasterizerDiscardEnable0(this.ptr,  rasterizerDiscardEnable);
		 return this;
	 }

	/**
	 * Get method for field rasterizerDiscardEnable	[boolean]<br>
	 * Prototype: VkBool32  rasterizerDiscardEnable
	 */ 
	 public boolean rasterizerDiscardEnable(){
		 boolean var = getRasterizerDiscardEnable0(super.ptr);
		 this.rasterizerDiscardEnable = var;
		 return this.rasterizerDiscardEnable;
	 }

	/**
	 * Set method for field polygonMode	[vkenum]<br>
	 * Prototype: VkPolygonMode  polygonMode
	 * 
	 * @param polygonMode - a instance of VkPolygonMode.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineRasterizationStateCreateInfo polygonMode(VkPolygonMode polygonMode){
		 this.polygonMode = polygonMode;
		 int enumVal = polygonMode.getValue();
		 setPolygonMode0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field polygonMode	[vkenum]<br>
	 * Prototype: VkPolygonMode  polygonMode
	 */ 
	 public VkPolygonMode polygonMode(){
		 int nativeVal = getPolygonMode0(super.ptr);
		 this.polygonMode = VkPolygonMode.fromValue(nativeVal); 
		 return this.polygonMode;
	 }

	/**
	 * Set method for field cullMode	[int]<br>
	 * Prototype: VkCullModeFlags  cullMode
	 * 
	 * @param cullMode - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineRasterizationStateCreateInfo cullMode(int cullMode){
		 this.cullMode = cullMode;
		 setCullMode0(this.ptr,  cullMode);
		 return this;
	 }

	/**
	 * Get method for field cullMode	[int]<br>
	 * Prototype: VkCullModeFlags  cullMode
	 */ 
	 public int cullMode(){
		 int var = getCullMode0(super.ptr);
		 this.cullMode = var;
		 return this.cullMode;
	 }

	/**
	 * Set method for field frontFace	[vkenum]<br>
	 * Prototype: VkFrontFace  frontFace
	 * 
	 * @param frontFace - a instance of VkFrontFace.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineRasterizationStateCreateInfo frontFace(VkFrontFace frontFace){
		 this.frontFace = frontFace;
		 int enumVal = frontFace.getValue();
		 setFrontFace0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field frontFace	[vkenum]<br>
	 * Prototype: VkFrontFace  frontFace
	 */ 
	 public VkFrontFace frontFace(){
		 int nativeVal = getFrontFace0(super.ptr);
		 this.frontFace = VkFrontFace.fromValue(nativeVal); 
		 return this.frontFace;
	 }

	/**
	 * Set method for field depthBiasEnable	[boolean]<br>
	 * Prototype: VkBool32  depthBiasEnable
	 * 
	 * @param depthBiasEnable - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineRasterizationStateCreateInfo depthBiasEnable(boolean depthBiasEnable){
		 this.depthBiasEnable = depthBiasEnable;
		 setDepthBiasEnable0(this.ptr,  depthBiasEnable);
		 return this;
	 }

	/**
	 * Get method for field depthBiasEnable	[boolean]<br>
	 * Prototype: VkBool32  depthBiasEnable
	 */ 
	 public boolean depthBiasEnable(){
		 boolean var = getDepthBiasEnable0(super.ptr);
		 this.depthBiasEnable = var;
		 return this.depthBiasEnable;
	 }

	/**
	 * Set method for field depthBiasConstantFactor	[float]<br>
	 * Prototype: float  depthBiasConstantFactor
	 * 
	 * @param depthBiasConstantFactor - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineRasterizationStateCreateInfo depthBiasConstantFactor(float depthBiasConstantFactor){
		 this.depthBiasConstantFactor = depthBiasConstantFactor;
		 setDepthBiasConstantFactor0(this.ptr,  depthBiasConstantFactor);
		 return this;
	 }

	/**
	 * Get method for field depthBiasConstantFactor	[float]<br>
	 * Prototype: float  depthBiasConstantFactor
	 */ 
	 public float depthBiasConstantFactor(){
		 float var = getDepthBiasConstantFactor0(super.ptr);
		 this.depthBiasConstantFactor = var;
		 return this.depthBiasConstantFactor;
	 }

	/**
	 * Set method for field depthBiasClamp	[float]<br>
	 * Prototype: float  depthBiasClamp
	 * 
	 * @param depthBiasClamp - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineRasterizationStateCreateInfo depthBiasClamp(float depthBiasClamp){
		 this.depthBiasClamp = depthBiasClamp;
		 setDepthBiasClamp0(this.ptr,  depthBiasClamp);
		 return this;
	 }

	/**
	 * Get method for field depthBiasClamp	[float]<br>
	 * Prototype: float  depthBiasClamp
	 */ 
	 public float depthBiasClamp(){
		 float var = getDepthBiasClamp0(super.ptr);
		 this.depthBiasClamp = var;
		 return this.depthBiasClamp;
	 }

	/**
	 * Set method for field depthBiasSlopeFactor	[float]<br>
	 * Prototype: float  depthBiasSlopeFactor
	 * 
	 * @param depthBiasSlopeFactor - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineRasterizationStateCreateInfo depthBiasSlopeFactor(float depthBiasSlopeFactor){
		 this.depthBiasSlopeFactor = depthBiasSlopeFactor;
		 setDepthBiasSlopeFactor0(this.ptr,  depthBiasSlopeFactor);
		 return this;
	 }

	/**
	 * Get method for field depthBiasSlopeFactor	[float]<br>
	 * Prototype: float  depthBiasSlopeFactor
	 */ 
	 public float depthBiasSlopeFactor(){
		 float var = getDepthBiasSlopeFactor0(super.ptr);
		 this.depthBiasSlopeFactor = var;
		 return this.depthBiasSlopeFactor;
	 }

	/**
	 * Set method for field lineWidth	[float]<br>
	 * Prototype: float  lineWidth
	 * 
	 * @param lineWidth - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineRasterizationStateCreateInfo lineWidth(float lineWidth){
		 this.lineWidth = lineWidth;
		 setLineWidth0(this.ptr,  lineWidth);
		 return this;
	 }

	/**
	 * Get method for field lineWidth	[float]<br>
	 * Prototype: float  lineWidth
	 */ 
	 public float lineWidth(){
		 float var = getLineWidth0(super.ptr);
		 this.lineWidth = var;
		 return this.lineWidth;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkPipelineRasterizationStateCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n depthClampEnable: ")
				.append(depthClampEnable() )
				.append(",\n rasterizerDiscardEnable: ")
				.append(rasterizerDiscardEnable() )
				.append(",\n polygonMode: ")
				.append(polygonMode() )
				.append(",\n cullMode: ")
				.append(cullMode() )
				.append(",\n frontFace: ")
				.append(frontFace() )
				.append(",\n depthBiasEnable: ")
				.append(depthBiasEnable() )
				.append(",\n depthBiasConstantFactor: ")
				.append(depthBiasConstantFactor() )
				.append(",\n depthBiasClamp: ")
				.append(depthBiasClamp() )
				.append(",\n depthBiasSlopeFactor: ")
				.append(depthBiasSlopeFactor() )
				.append(",\n lineWidth: ")
				.append(lineWidth() )
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
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineRasterizationStateCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->flags = (VkPipelineRasterizationStateCreateFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineRasterizationStateCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field depthClampEnable	[boolean]<br>
	 * Prototype: VkBool32  depthClampEnable
	 */ 
	 private static native void setDepthClampEnable0(Buffer ptr, boolean  _depthClampEnable);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->depthClampEnable = (VkBool32) (_depthClampEnable);
	  */

	/**
	 * Native GET method for field depthClampEnable	[boolean]<br>
	 * Prototype: VkBool32  depthClampEnable
	 */ 
	 private static native boolean  getDepthClampEnable0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->depthClampEnable);
	 */

	/**
	 * Native SET method for field rasterizerDiscardEnable	[boolean]<br>
	 * Prototype: VkBool32  rasterizerDiscardEnable
	 */ 
	 private static native void setRasterizerDiscardEnable0(Buffer ptr, boolean  _rasterizerDiscardEnable);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->rasterizerDiscardEnable = (VkBool32) (_rasterizerDiscardEnable);
	  */

	/**
	 * Native GET method for field rasterizerDiscardEnable	[boolean]<br>
	 * Prototype: VkBool32  rasterizerDiscardEnable
	 */ 
	 private static native boolean  getRasterizerDiscardEnable0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->rasterizerDiscardEnable);
	 */

	/**
	 * Native SET method for field polygonMode	[vkenum]<br>
	 * Prototype: VkPolygonMode  polygonMode
	 */ 
	 private static native void setPolygonMode0(Buffer ptr, int  _polygonMode);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->polygonMode = (VkPolygonMode) (_polygonMode);
	  */

	/**
	 * Native GET method for field polygonMode	[vkenum]<br>
	 * Prototype: VkPolygonMode  polygonMode
	 */ 
	 private static native int  getPolygonMode0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (VkPolygonMode) (vkObj->polygonMode);
	 */

	/**
	 * Native SET method for field cullMode	[int]<br>
	 * Prototype: VkCullModeFlags  cullMode
	 */ 
	 private static native void setCullMode0(Buffer ptr, int _cullMode);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->cullMode = (VkCullModeFlags) (_cullMode);
	  */

	/**
	 * Native GET method for field cullMode	[int]<br>
	 * Prototype: VkCullModeFlags  cullMode
	 */ 
	 private static native int getCullMode0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jint) (vkObj->cullMode);
	 */

	/**
	 * Native SET method for field frontFace	[vkenum]<br>
	 * Prototype: VkFrontFace  frontFace
	 */ 
	 private static native void setFrontFace0(Buffer ptr, int  _frontFace);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->frontFace = (VkFrontFace) (_frontFace);
	  */

	/**
	 * Native GET method for field frontFace	[vkenum]<br>
	 * Prototype: VkFrontFace  frontFace
	 */ 
	 private static native int  getFrontFace0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (VkFrontFace) (vkObj->frontFace);
	 */

	/**
	 * Native SET method for field depthBiasEnable	[boolean]<br>
	 * Prototype: VkBool32  depthBiasEnable
	 */ 
	 private static native void setDepthBiasEnable0(Buffer ptr, boolean  _depthBiasEnable);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->depthBiasEnable = (VkBool32) (_depthBiasEnable);
	  */

	/**
	 * Native GET method for field depthBiasEnable	[boolean]<br>
	 * Prototype: VkBool32  depthBiasEnable
	 */ 
	 private static native boolean  getDepthBiasEnable0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->depthBiasEnable);
	 */

	/**
	 * Native SET method for field depthBiasConstantFactor	[float]<br>
	 * Prototype: float  depthBiasConstantFactor
	 */ 
	 private static native void setDepthBiasConstantFactor0(Buffer ptr, float _depthBiasConstantFactor);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->depthBiasConstantFactor = (float) (_depthBiasConstantFactor);
	  */

	/**
	 * Native GET method for field depthBiasConstantFactor	[float]<br>
	 * Prototype: float  depthBiasConstantFactor
	 */ 
	 private static native float getDepthBiasConstantFactor0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jfloat) (vkObj->depthBiasConstantFactor);
	 */

	/**
	 * Native SET method for field depthBiasClamp	[float]<br>
	 * Prototype: float  depthBiasClamp
	 */ 
	 private static native void setDepthBiasClamp0(Buffer ptr, float _depthBiasClamp);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->depthBiasClamp = (float) (_depthBiasClamp);
	  */

	/**
	 * Native GET method for field depthBiasClamp	[float]<br>
	 * Prototype: float  depthBiasClamp
	 */ 
	 private static native float getDepthBiasClamp0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jfloat) (vkObj->depthBiasClamp);
	 */

	/**
	 * Native SET method for field depthBiasSlopeFactor	[float]<br>
	 * Prototype: float  depthBiasSlopeFactor
	 */ 
	 private static native void setDepthBiasSlopeFactor0(Buffer ptr, float _depthBiasSlopeFactor);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->depthBiasSlopeFactor = (float) (_depthBiasSlopeFactor);
	  */

	/**
	 * Native GET method for field depthBiasSlopeFactor	[float]<br>
	 * Prototype: float  depthBiasSlopeFactor
	 */ 
	 private static native float getDepthBiasSlopeFactor0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jfloat) (vkObj->depthBiasSlopeFactor);
	 */

	/**
	 * Native SET method for field lineWidth	[float]<br>
	 * Prototype: float  lineWidth
	 */ 
	 private static native void setLineWidth0(Buffer ptr, float _lineWidth);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->lineWidth = (float) (_lineWidth);
	  */

	/**
	 * Native GET method for field lineWidth	[float]<br>
	 * Prototype: float  lineWidth
	 */ 
	 private static native float getLineWidth0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jfloat) (vkObj->lineWidth);
	 */



} // end of class VkPipelineRasterizationStateCreateInfo
