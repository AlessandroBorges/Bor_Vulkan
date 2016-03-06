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
	/** TAG of this structure [59]  */
	 private static final String TAG = "VkPipelineRasterizationStateCreateInfo";

	/** ID of this structure [59]  */
	 public static final int TAG_ID = VKPIPELINERASTERIZATIONSTATECREATEINFO_ID;

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
		 super(sizeOf()); 
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
	 public VkPipelineRasterizationStateCreateInfo(long address, int memSize){ 
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
	 public static P<VkPipelineRasterizationStateCreateInfo> createNullPointer(){
	        P<VkPipelineRasterizationStateCreateInfo> p = new  P<VkPipelineRasterizationStateCreateInfo>(new VkPipelineRasterizationStateCreateInfo());
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
	 * Prototype: VkPipelineRasterizationStateCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkPipelineRasterizationStateCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field depthClampEnable	[boolean]<br>
	 * Prototype: VkBool32  depthClampEnable
	 */ 
	 public void depthClampEnable(boolean depthClampEnable){
		 this.depthClampEnable = depthClampEnable;
		depthClampEnable0(super.ptr, depthClampEnable);
	 }

	/**
	 * get method for field depthClampEnable	[boolean]<br>
	 * Prototype: VkBool32  depthClampEnable
	 */ 
	 public boolean depthClampEnable(){
		 // return  this.depthClampEnable;
		 return depthClampEnable0(super.ptr);
	 }

	/**
	 * Set method for field rasterizerDiscardEnable	[boolean]<br>
	 * Prototype: VkBool32  rasterizerDiscardEnable
	 */ 
	 public void rasterizerDiscardEnable(boolean rasterizerDiscardEnable){
		 this.rasterizerDiscardEnable = rasterizerDiscardEnable;
		rasterizerDiscardEnable0(super.ptr, rasterizerDiscardEnable);
	 }

	/**
	 * get method for field rasterizerDiscardEnable	[boolean]<br>
	 * Prototype: VkBool32  rasterizerDiscardEnable
	 */ 
	 public boolean rasterizerDiscardEnable(){
		 // return  this.rasterizerDiscardEnable;
		 return rasterizerDiscardEnable0(super.ptr);
	 }

	/**
	 * Set method for field polygonMode	[vkenum]<br>
	 * Prototype: VkPolygonMode  polygonMode
	 */ 
	 public void polygonMode(VkPolygonMode polygonMode){
		 this.polygonMode = polygonMode;
		polygonMode0(super.ptr, polygonMode);
	 }

	/**
	 * get method for field polygonMode	[vkenum]<br>
	 * Prototype: VkPolygonMode  polygonMode
	 */ 
	 public VkPolygonMode polygonMode(){
		 // return  this.polygonMode;
		 return polygonMode0(super.ptr);
	 }

	/**
	 * Set method for field cullMode	[int]<br>
	 * Prototype: VkCullModeFlags  cullMode
	 */ 
	 public void cullMode(int cullMode){
		 this.cullMode = cullMode;
		cullMode0(super.ptr, cullMode);
	 }

	/**
	 * get method for field cullMode	[int]<br>
	 * Prototype: VkCullModeFlags  cullMode
	 */ 
	 public int cullMode(){
		 // return  this.cullMode;
		 return cullMode0(super.ptr);
	 }

	/**
	 * Set method for field frontFace	[vkenum]<br>
	 * Prototype: VkFrontFace  frontFace
	 */ 
	 public void frontFace(VkFrontFace frontFace){
		 this.frontFace = frontFace;
		frontFace0(super.ptr, frontFace);
	 }

	/**
	 * get method for field frontFace	[vkenum]<br>
	 * Prototype: VkFrontFace  frontFace
	 */ 
	 public VkFrontFace frontFace(){
		 // return  this.frontFace;
		 return frontFace0(super.ptr);
	 }

	/**
	 * Set method for field depthBiasEnable	[boolean]<br>
	 * Prototype: VkBool32  depthBiasEnable
	 */ 
	 public void depthBiasEnable(boolean depthBiasEnable){
		 this.depthBiasEnable = depthBiasEnable;
		depthBiasEnable0(super.ptr, depthBiasEnable);
	 }

	/**
	 * get method for field depthBiasEnable	[boolean]<br>
	 * Prototype: VkBool32  depthBiasEnable
	 */ 
	 public boolean depthBiasEnable(){
		 // return  this.depthBiasEnable;
		 return depthBiasEnable0(super.ptr);
	 }

	/**
	 * Set method for field depthBiasConstantFactor	[float]<br>
	 * Prototype: float  depthBiasConstantFactor
	 */ 
	 public void depthBiasConstantFactor(float depthBiasConstantFactor){
		 this.depthBiasConstantFactor = depthBiasConstantFactor;
		depthBiasConstantFactor0(super.ptr, depthBiasConstantFactor);
	 }

	/**
	 * get method for field depthBiasConstantFactor	[float]<br>
	 * Prototype: float  depthBiasConstantFactor
	 */ 
	 public float depthBiasConstantFactor(){
		 // return  this.depthBiasConstantFactor;
		 return depthBiasConstantFactor0(super.ptr);
	 }

	/**
	 * Set method for field depthBiasClamp	[float]<br>
	 * Prototype: float  depthBiasClamp
	 */ 
	 public void depthBiasClamp(float depthBiasClamp){
		 this.depthBiasClamp = depthBiasClamp;
		depthBiasClamp0(super.ptr, depthBiasClamp);
	 }

	/**
	 * get method for field depthBiasClamp	[float]<br>
	 * Prototype: float  depthBiasClamp
	 */ 
	 public float depthBiasClamp(){
		 // return  this.depthBiasClamp;
		 return depthBiasClamp0(super.ptr);
	 }

	/**
	 * Set method for field depthBiasSlopeFactor	[float]<br>
	 * Prototype: float  depthBiasSlopeFactor
	 */ 
	 public void depthBiasSlopeFactor(float depthBiasSlopeFactor){
		 this.depthBiasSlopeFactor = depthBiasSlopeFactor;
		depthBiasSlopeFactor0(super.ptr, depthBiasSlopeFactor);
	 }

	/**
	 * get method for field depthBiasSlopeFactor	[float]<br>
	 * Prototype: float  depthBiasSlopeFactor
	 */ 
	 public float depthBiasSlopeFactor(){
		 // return  this.depthBiasSlopeFactor;
		 return depthBiasSlopeFactor0(super.ptr);
	 }

	/**
	 * Set method for field lineWidth	[float]<br>
	 * Prototype: float  lineWidth
	 */ 
	 public void lineWidth(float lineWidth){
		 this.lineWidth = lineWidth;
		lineWidth0(super.ptr, lineWidth);
	 }

	/**
	 * get method for field lineWidth	[float]<br>
	 * Prototype: float  lineWidth
	 */ 
	 public float lineWidth(){
		 // return  this.lineWidth;
		 return lineWidth0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineRasterizationStateCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(*ptr);
		  _obj.flags = (VkPipelineRasterizationStateCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineRasterizationStateCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(ptr);
		  return (jint) (_obj.VkPipelineRasterizationStateCreateFlags);
	 */

	/**
	 * native SET method for field depthClampEnable	[boolean]<br>
	 * Prototype: VkBool32  depthClampEnable
	 */ 
	 private static native void depthClampEnable0(ByteBuffer ptr, boolean _depthClampEnable);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(*ptr);
		  _obj.depthClampEnable = (VkBool32) (_depthClampEnable);
	  */

	/**
	 * native GET method for field depthClampEnable	[boolean]<br>
	 * Prototype: VkBool32  depthClampEnable
	 */ 
	 private static native boolean depthClampEnable0(ByteBuffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field rasterizerDiscardEnable	[boolean]<br>
	 * Prototype: VkBool32  rasterizerDiscardEnable
	 */ 
	 private static native void rasterizerDiscardEnable0(ByteBuffer ptr, boolean _rasterizerDiscardEnable);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(*ptr);
		  _obj.rasterizerDiscardEnable = (VkBool32) (_rasterizerDiscardEnable);
	  */

	/**
	 * native GET method for field rasterizerDiscardEnable	[boolean]<br>
	 * Prototype: VkBool32  rasterizerDiscardEnable
	 */ 
	 private static native boolean rasterizerDiscardEnable0(ByteBuffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field polygonMode	[vkenum]<br>
	 * Prototype: VkPolygonMode  polygonMode
	 */ 
	 private static native void polygonMode0(ByteBuffer ptr, VkPolygonMode _polygonMode);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(*ptr);
		  _obj.polygonMode = (VkPolygonMode) (_polygonMode);
	  */

	/**
	 * native GET method for field polygonMode	[vkenum]<br>
	 * Prototype: VkPolygonMode  polygonMode
	 */ 
	 private static native VkPolygonMode polygonMode0(ByteBuffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(ptr);
		  return (VkPolygonMode) (_obj.VkPolygonMode);
	 */

	/**
	 * native SET method for field cullMode	[int]<br>
	 * Prototype: VkCullModeFlags  cullMode
	 */ 
	 private static native void cullMode0(ByteBuffer ptr, int _cullMode);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(*ptr);
		  _obj.cullMode = (VkCullModeFlags) (_cullMode);
	  */

	/**
	 * native GET method for field cullMode	[int]<br>
	 * Prototype: VkCullModeFlags  cullMode
	 */ 
	 private static native int cullMode0(ByteBuffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(ptr);
		  return (jint) (_obj.VkCullModeFlags);
	 */

	/**
	 * native SET method for field frontFace	[vkenum]<br>
	 * Prototype: VkFrontFace  frontFace
	 */ 
	 private static native void frontFace0(ByteBuffer ptr, VkFrontFace _frontFace);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(*ptr);
		  _obj.frontFace = (VkFrontFace) (_frontFace);
	  */

	/**
	 * native GET method for field frontFace	[vkenum]<br>
	 * Prototype: VkFrontFace  frontFace
	 */ 
	 private static native VkFrontFace frontFace0(ByteBuffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(ptr);
		  return (VkFrontFace) (_obj.VkFrontFace);
	 */

	/**
	 * native SET method for field depthBiasEnable	[boolean]<br>
	 * Prototype: VkBool32  depthBiasEnable
	 */ 
	 private static native void depthBiasEnable0(ByteBuffer ptr, boolean _depthBiasEnable);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(*ptr);
		  _obj.depthBiasEnable = (VkBool32) (_depthBiasEnable);
	  */

	/**
	 * native GET method for field depthBiasEnable	[boolean]<br>
	 * Prototype: VkBool32  depthBiasEnable
	 */ 
	 private static native boolean depthBiasEnable0(ByteBuffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native SET method for field depthBiasConstantFactor	[float]<br>
	 * Prototype: float  depthBiasConstantFactor
	 */ 
	 private static native void depthBiasConstantFactor0(ByteBuffer ptr, float _depthBiasConstantFactor);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(*ptr);
		  _obj.depthBiasConstantFactor = (float) (_depthBiasConstantFactor);
	  */

	/**
	 * native GET method for field depthBiasConstantFactor	[float]<br>
	 * Prototype: float  depthBiasConstantFactor
	 */ 
	 private static native float depthBiasConstantFactor0(ByteBuffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native SET method for field depthBiasClamp	[float]<br>
	 * Prototype: float  depthBiasClamp
	 */ 
	 private static native void depthBiasClamp0(ByteBuffer ptr, float _depthBiasClamp);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(*ptr);
		  _obj.depthBiasClamp = (float) (_depthBiasClamp);
	  */

	/**
	 * native GET method for field depthBiasClamp	[float]<br>
	 * Prototype: float  depthBiasClamp
	 */ 
	 private static native float depthBiasClamp0(ByteBuffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native SET method for field depthBiasSlopeFactor	[float]<br>
	 * Prototype: float  depthBiasSlopeFactor
	 */ 
	 private static native void depthBiasSlopeFactor0(ByteBuffer ptr, float _depthBiasSlopeFactor);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(*ptr);
		  _obj.depthBiasSlopeFactor = (float) (_depthBiasSlopeFactor);
	  */

	/**
	 * native GET method for field depthBiasSlopeFactor	[float]<br>
	 * Prototype: float  depthBiasSlopeFactor
	 */ 
	 private static native float depthBiasSlopeFactor0(ByteBuffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native SET method for field lineWidth	[float]<br>
	 * Prototype: float  lineWidth
	 */ 
	 private static native void lineWidth0(ByteBuffer ptr, float _lineWidth);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(*ptr);
		  _obj.lineWidth = (float) (_lineWidth);
	  */

	/**
	 * native GET method for field lineWidth	[float]<br>
	 * Prototype: float  lineWidth
	 */ 
	 private static native float lineWidth0(ByteBuffer ptr);/*
		  VkPipelineRasterizationStateCreateInfo _obj = (VkPipelineRasterizationStateCreateInfo)(ptr);
		  return (jfloat) (_obj.float);
	 */



} // end of class VkPipelineRasterizationStateCreateInfo
