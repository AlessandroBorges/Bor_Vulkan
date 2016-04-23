/**
 * Class wrapping Vulkan's VkPipelineRasterizationStateCreateInfo struct.
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
 * @version Ver. 0.8.01 (beta) 
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

	/** P wrapper for THIS object */
	 private  P<VkPipelineRasterizationStateCreateInfo> p;

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
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkPipelineRasterizationStateCreateInfo(long address , int memSize){ 
		 super(address, memSize); 
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
	 * Create a pointer P to contain a instance of this,
	 * with clean native pointer.<br>
	 * You can use {@link VkStruct#setPointer(ByteBuffer)} to set a new 
	 * native pointer.
	 * @return An instance of P for this VkStruct with null pointer
	 */
	 public static P<VkPipelineRasterizationStateCreateInfo> createNullPointer(){
	        P<VkPipelineRasterizationStateCreateInfo> p = new  P<VkPipelineRasterizationStateCreateInfo>(new VkPipelineRasterizationStateCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkPipelineRasterizationStateCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkPipelineRasterizationStateCreateInfo> (this);
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
	 * Prototype: VkPipelineRasterizationStateCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
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
	 */ 
	 public void depthClampEnable(boolean depthClampEnable){
		 this.depthClampEnable = depthClampEnable;
		 setDepthClampEnable0(this.ptr,  depthClampEnable);
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
	 */ 
	 public void rasterizerDiscardEnable(boolean rasterizerDiscardEnable){
		 this.rasterizerDiscardEnable = rasterizerDiscardEnable;
		 setRasterizerDiscardEnable0(this.ptr,  rasterizerDiscardEnable);
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
	 */ 
	 public void polygonMode(VkPolygonMode polygonMode){
		 this.polygonMode = polygonMode;
		 int enumVal = polygonMode.getValue();
		 setPolygonMode0(this.ptr, enumVal );
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
	 */ 
	 public void cullMode(int cullMode){
		 this.cullMode = cullMode;
		 setCullMode0(this.ptr,  cullMode);
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
	 */ 
	 public void frontFace(VkFrontFace frontFace){
		 this.frontFace = frontFace;
		 int enumVal = frontFace.getValue();
		 setFrontFace0(this.ptr, enumVal );
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
	 */ 
	 public void depthBiasEnable(boolean depthBiasEnable){
		 this.depthBiasEnable = depthBiasEnable;
		 setDepthBiasEnable0(this.ptr,  depthBiasEnable);
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
	 */ 
	 public void depthBiasConstantFactor(float depthBiasConstantFactor){
		 this.depthBiasConstantFactor = depthBiasConstantFactor;
		 setDepthBiasConstantFactor0(this.ptr,  depthBiasConstantFactor);
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
	 */ 
	 public void depthBiasClamp(float depthBiasClamp){
		 this.depthBiasClamp = depthBiasClamp;
		 setDepthBiasClamp0(this.ptr,  depthBiasClamp);
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
	 */ 
	 public void depthBiasSlopeFactor(float depthBiasSlopeFactor){
		 this.depthBiasSlopeFactor = depthBiasSlopeFactor;
		 setDepthBiasSlopeFactor0(this.ptr,  depthBiasSlopeFactor);
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
	 */ 
	 public void lineWidth(float lineWidth){
		 this.lineWidth = lineWidth;
		 setLineWidth0(this.ptr,  lineWidth);
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


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineRasterizationStateCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->flags = (VkPipelineRasterizationStateCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineRasterizationStateCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field depthClampEnable	[boolean]<br>
	 * Prototype: VkBool32  depthClampEnable
	 */ 
	 private static native void setDepthClampEnable0(Buffer ptr, boolean _depthClampEnable);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->depthClampEnable = (VkBool32) (_depthClampEnable);
	  */

	/**
	 * native GET method for field depthClampEnable	[boolean]<br>
	 * Prototype: VkBool32  depthClampEnable
	 */ 
	 private static native boolean getDepthClampEnable0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->depthClampEnable);
	 */

	/**
	 * native SET method for field rasterizerDiscardEnable	[boolean]<br>
	 * Prototype: VkBool32  rasterizerDiscardEnable
	 */ 
	 private static native void setRasterizerDiscardEnable0(Buffer ptr, boolean _rasterizerDiscardEnable);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->rasterizerDiscardEnable = (VkBool32) (_rasterizerDiscardEnable);
	  */

	/**
	 * native GET method for field rasterizerDiscardEnable	[boolean]<br>
	 * Prototype: VkBool32  rasterizerDiscardEnable
	 */ 
	 private static native boolean getRasterizerDiscardEnable0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->rasterizerDiscardEnable);
	 */

	/**
	 * native SET method for field polygonMode	[vkenum]<br>
	 * Prototype: VkPolygonMode  polygonMode
	 */ 
	 private static native void setPolygonMode0(Buffer ptr, int  _polygonMode);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->polygonMode = (VkPolygonMode) (_polygonMode);
	  */

	/**
	 * native GET method for field polygonMode	[vkenum]<br>
	 * Prototype: VkPolygonMode  polygonMode
	 */ 
	 private static native int  getPolygonMode0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (VkPolygonMode) (vkObj->polygonMode);
	 */

	/**
	 * native SET method for field cullMode	[int]<br>
	 * Prototype: VkCullModeFlags  cullMode
	 */ 
	 private static native void setCullMode0(Buffer ptr, int _cullMode);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->cullMode = (VkCullModeFlags) (_cullMode);
	  */

	/**
	 * native GET method for field cullMode	[int]<br>
	 * Prototype: VkCullModeFlags  cullMode
	 */ 
	 private static native int getCullMode0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jint) (vkObj->cullMode);
	 */

	/**
	 * native SET method for field frontFace	[vkenum]<br>
	 * Prototype: VkFrontFace  frontFace
	 */ 
	 private static native void setFrontFace0(Buffer ptr, int  _frontFace);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->frontFace = (VkFrontFace) (_frontFace);
	  */

	/**
	 * native GET method for field frontFace	[vkenum]<br>
	 * Prototype: VkFrontFace  frontFace
	 */ 
	 private static native int  getFrontFace0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (VkFrontFace) (vkObj->frontFace);
	 */

	/**
	 * native SET method for field depthBiasEnable	[boolean]<br>
	 * Prototype: VkBool32  depthBiasEnable
	 */ 
	 private static native void setDepthBiasEnable0(Buffer ptr, boolean _depthBiasEnable);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->depthBiasEnable = (VkBool32) (_depthBiasEnable);
	  */

	/**
	 * native GET method for field depthBiasEnable	[boolean]<br>
	 * Prototype: VkBool32  depthBiasEnable
	 */ 
	 private static native boolean getDepthBiasEnable0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->depthBiasEnable);
	 */

	/**
	 * native SET method for field depthBiasConstantFactor	[float]<br>
	 * Prototype: float  depthBiasConstantFactor
	 */ 
	 private static native void setDepthBiasConstantFactor0(Buffer ptr, float _depthBiasConstantFactor);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->depthBiasConstantFactor = (float) (_depthBiasConstantFactor);
	  */

	/**
	 * native GET method for field depthBiasConstantFactor	[float]<br>
	 * Prototype: float  depthBiasConstantFactor
	 */ 
	 private static native float getDepthBiasConstantFactor0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jfloat) (vkObj->depthBiasConstantFactor);
	 */

	/**
	 * native SET method for field depthBiasClamp	[float]<br>
	 * Prototype: float  depthBiasClamp
	 */ 
	 private static native void setDepthBiasClamp0(Buffer ptr, float _depthBiasClamp);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->depthBiasClamp = (float) (_depthBiasClamp);
	  */

	/**
	 * native GET method for field depthBiasClamp	[float]<br>
	 * Prototype: float  depthBiasClamp
	 */ 
	 private static native float getDepthBiasClamp0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jfloat) (vkObj->depthBiasClamp);
	 */

	/**
	 * native SET method for field depthBiasSlopeFactor	[float]<br>
	 * Prototype: float  depthBiasSlopeFactor
	 */ 
	 private static native void setDepthBiasSlopeFactor0(Buffer ptr, float _depthBiasSlopeFactor);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->depthBiasSlopeFactor = (float) (_depthBiasSlopeFactor);
	  */

	/**
	 * native GET method for field depthBiasSlopeFactor	[float]<br>
	 * Prototype: float  depthBiasSlopeFactor
	 */ 
	 private static native float getDepthBiasSlopeFactor0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jfloat) (vkObj->depthBiasSlopeFactor);
	 */

	/**
	 * native SET method for field lineWidth	[float]<br>
	 * Prototype: float  lineWidth
	 */ 
	 private static native void setLineWidth0(Buffer ptr, float _lineWidth);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  vkObj->lineWidth = (float) (_lineWidth);
	  */

	/**
	 * native GET method for field lineWidth	[float]<br>
	 * Prototype: float  lineWidth
	 */ 
	 private static native float getLineWidth0(Buffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jfloat) (vkObj->lineWidth);
	 */



} // end of class VkPipelineRasterizationStateCreateInfo
