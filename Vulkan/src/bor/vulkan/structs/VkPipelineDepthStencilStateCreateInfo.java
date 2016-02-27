// class wrapping Vulkan's VkPipelineDepthStencilStateCreateInfo struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkPipelineDepthStencilStateCreateInfo 
 * @Author Alessandro Borges 
 */
public class VkPipelineDepthStencilStateCreateInfo extends VkStruct {
	/** ID of this structure [62]  */
	 public static final int TAG = VKPIPELINEDEPTHSTENCILSTATECREATEINFO_ID;

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
	 *  VkPipelineDepthStencilStateCreateFlags 	flags 
	 */ 
	int 	flags;

	/**
	 *  VkBool32 	depthTestEnable 
	 */ 
	boolean 	depthTestEnable;

	/**
	 *  VkBool32 	depthWriteEnable 
	 */ 
	boolean 	depthWriteEnable;

	/**
	 *  VkCompareOp 	depthCompareOp 
	 */ 
	VkCompareOp 	depthCompareOp;

	/**
	 *  VkBool32 	depthBoundsTestEnable 
	 */ 
	boolean 	depthBoundsTestEnable;

	/**
	 *  VkBool32 	stencilTestEnable 
	 */ 
	boolean 	stencilTestEnable;

	/**
	 *  VkStencilOpState 	front 
	 */ 
	VkStencilOpState 	front;

	/**
	 *  VkStencilOpState 	back 
	 */ 
	VkStencilOpState 	back;

	/**
	 *  float 	minDepthBounds 
	 */ 
	float 	minDepthBounds;

	/**
	 *  float 	maxDepthBounds 
	 */ 
	float 	maxDepthBounds;

	/**
	 * Ctor
	 */
	public VkPipelineDepthStencilStateCreateInfo(){ 
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
	 * Prototype: VkPipelineDepthStencilStateCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkPipelineDepthStencilStateCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field depthTestEnable
	 * Prototype: VkBool32  depthTestEnable
	 */ 
	 public void depthTestEnable(boolean depthTestEnable){
		 this.depthTestEnable = depthTestEnable;
		depthTestEnable0(super.ptr, depthTestEnable);
	 }

	/**
	 * get method for field depthTestEnable
	 * Prototype: VkBool32  depthTestEnable
	 */ 
	 public boolean depthTestEnable(){
		 // return  this.depthTestEnable;
		 return depthTestEnable0(super.ptr);
	 }

	/**
	 * Set method for field depthWriteEnable
	 * Prototype: VkBool32  depthWriteEnable
	 */ 
	 public void depthWriteEnable(boolean depthWriteEnable){
		 this.depthWriteEnable = depthWriteEnable;
		depthWriteEnable0(super.ptr, depthWriteEnable);
	 }

	/**
	 * get method for field depthWriteEnable
	 * Prototype: VkBool32  depthWriteEnable
	 */ 
	 public boolean depthWriteEnable(){
		 // return  this.depthWriteEnable;
		 return depthWriteEnable0(super.ptr);
	 }

	/**
	 * Set method for field depthCompareOp
	 * Prototype: VkCompareOp  depthCompareOp
	 */ 
	 public void depthCompareOp(VkCompareOp depthCompareOp){
		 this.depthCompareOp = depthCompareOp;
		depthCompareOp0(super.ptr, depthCompareOp);
	 }

	/**
	 * get method for field depthCompareOp
	 * Prototype: VkCompareOp  depthCompareOp
	 */ 
	 public VkCompareOp depthCompareOp(){
		 // return  this.depthCompareOp;
		 return depthCompareOp0(super.ptr);
	 }

	/**
	 * Set method for field depthBoundsTestEnable
	 * Prototype: VkBool32  depthBoundsTestEnable
	 */ 
	 public void depthBoundsTestEnable(boolean depthBoundsTestEnable){
		 this.depthBoundsTestEnable = depthBoundsTestEnable;
		depthBoundsTestEnable0(super.ptr, depthBoundsTestEnable);
	 }

	/**
	 * get method for field depthBoundsTestEnable
	 * Prototype: VkBool32  depthBoundsTestEnable
	 */ 
	 public boolean depthBoundsTestEnable(){
		 // return  this.depthBoundsTestEnable;
		 return depthBoundsTestEnable0(super.ptr);
	 }

	/**
	 * Set method for field stencilTestEnable
	 * Prototype: VkBool32  stencilTestEnable
	 */ 
	 public void stencilTestEnable(boolean stencilTestEnable){
		 this.stencilTestEnable = stencilTestEnable;
		stencilTestEnable0(super.ptr, stencilTestEnable);
	 }

	/**
	 * get method for field stencilTestEnable
	 * Prototype: VkBool32  stencilTestEnable
	 */ 
	 public boolean stencilTestEnable(){
		 // return  this.stencilTestEnable;
		 return stencilTestEnable0(super.ptr);
	 }

	/**
	 * Set method for field front
	 * Prototype: VkStencilOpState  front
	 */ 
	 public void front(VkStencilOpState front){
		 this.front = front;
		front0(super.ptr, front);
	 }

	/**
	 * get method for field front
	 * Prototype: VkStencilOpState  front
	 */ 
	 public VkStencilOpState front(){
		 // return  this.front;
		 return front0(super.ptr);
	 }

	/**
	 * Set method for field back
	 * Prototype: VkStencilOpState  back
	 */ 
	 public void back(VkStencilOpState back){
		 this.back = back;
		back0(super.ptr, back);
	 }

	/**
	 * get method for field back
	 * Prototype: VkStencilOpState  back
	 */ 
	 public VkStencilOpState back(){
		 // return  this.back;
		 return back0(super.ptr);
	 }

	/**
	 * Set method for field minDepthBounds
	 * Prototype: float  minDepthBounds
	 */ 
	 public void minDepthBounds(float minDepthBounds){
		 this.minDepthBounds = minDepthBounds;
		minDepthBounds0(super.ptr, minDepthBounds);
	 }

	/**
	 * get method for field minDepthBounds
	 * Prototype: float  minDepthBounds
	 */ 
	 public float minDepthBounds(){
		 // return  this.minDepthBounds;
		 return minDepthBounds0(super.ptr);
	 }

	/**
	 * Set method for field maxDepthBounds
	 * Prototype: float  maxDepthBounds
	 */ 
	 public void maxDepthBounds(float maxDepthBounds){
		 this.maxDepthBounds = maxDepthBounds;
		maxDepthBounds0(super.ptr, maxDepthBounds);
	 }

	/**
	 * get method for field maxDepthBounds
	 * Prototype: float  maxDepthBounds
	 */ 
	 public float maxDepthBounds(){
		 // return  this.maxDepthBounds;
		 return maxDepthBounds0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkPipelineDepthStencilStateCreateInfo _obj = (VkPipelineDepthStencilStateCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo _obj = (VkPipelineDepthStencilStateCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkPipelineDepthStencilStateCreateInfo _obj = (VkPipelineDepthStencilStateCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo _obj = (VkPipelineDepthStencilStateCreateInfo)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkPipelineDepthStencilStateCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkPipelineDepthStencilStateCreateInfo _obj = (VkPipelineDepthStencilStateCreateInfo)(*ptr);
		  _obj.flags = (VkPipelineDepthStencilStateCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkPipelineDepthStencilStateCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo _obj = (VkPipelineDepthStencilStateCreateInfo)(ptr);
		  return (jint) (_obj.VkPipelineDepthStencilStateCreateFlags);
	 */

	/**
	 * native Set method for field depthTestEnable
	 * Prototype: VkBool32  depthTestEnable
	 */ 
	 private static native void depthTestEnable0(ByteBuffer ptr, boolean _depthTestEnable);/*
		  VkPipelineDepthStencilStateCreateInfo _obj = (VkPipelineDepthStencilStateCreateInfo)(*ptr);
		  _obj.depthTestEnable = (VkBool32) (_depthTestEnable);
	  */

	/**
	 * get method for field depthTestEnable
	 * Prototype: VkBool32  depthTestEnable
	 */ 
	 private static native boolean depthTestEnable0(ByteBuffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo _obj = (VkPipelineDepthStencilStateCreateInfo)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native Set method for field depthWriteEnable
	 * Prototype: VkBool32  depthWriteEnable
	 */ 
	 private static native void depthWriteEnable0(ByteBuffer ptr, boolean _depthWriteEnable);/*
		  VkPipelineDepthStencilStateCreateInfo _obj = (VkPipelineDepthStencilStateCreateInfo)(*ptr);
		  _obj.depthWriteEnable = (VkBool32) (_depthWriteEnable);
	  */

	/**
	 * get method for field depthWriteEnable
	 * Prototype: VkBool32  depthWriteEnable
	 */ 
	 private static native boolean depthWriteEnable0(ByteBuffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo _obj = (VkPipelineDepthStencilStateCreateInfo)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native Set method for field depthCompareOp
	 * Prototype: VkCompareOp  depthCompareOp
	 */ 
	 private static native void depthCompareOp0(ByteBuffer ptr, VkCompareOp _depthCompareOp);/*
		  VkPipelineDepthStencilStateCreateInfo _obj = (VkPipelineDepthStencilStateCreateInfo)(*ptr);
		  _obj.depthCompareOp = (VkCompareOp) (_depthCompareOp);
	  */

	/**
	 * get method for field depthCompareOp
	 * Prototype: VkCompareOp  depthCompareOp
	 */ 
	 private static native VkCompareOp depthCompareOp0(ByteBuffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo _obj = (VkPipelineDepthStencilStateCreateInfo)(ptr);
		  return (VkCompareOp) (_obj.VkCompareOp);
	 */

	/**
	 * native Set method for field depthBoundsTestEnable
	 * Prototype: VkBool32  depthBoundsTestEnable
	 */ 
	 private static native void depthBoundsTestEnable0(ByteBuffer ptr, boolean _depthBoundsTestEnable);/*
		  VkPipelineDepthStencilStateCreateInfo _obj = (VkPipelineDepthStencilStateCreateInfo)(*ptr);
		  _obj.depthBoundsTestEnable = (VkBool32) (_depthBoundsTestEnable);
	  */

	/**
	 * get method for field depthBoundsTestEnable
	 * Prototype: VkBool32  depthBoundsTestEnable
	 */ 
	 private static native boolean depthBoundsTestEnable0(ByteBuffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo _obj = (VkPipelineDepthStencilStateCreateInfo)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native Set method for field stencilTestEnable
	 * Prototype: VkBool32  stencilTestEnable
	 */ 
	 private static native void stencilTestEnable0(ByteBuffer ptr, boolean _stencilTestEnable);/*
		  VkPipelineDepthStencilStateCreateInfo _obj = (VkPipelineDepthStencilStateCreateInfo)(*ptr);
		  _obj.stencilTestEnable = (VkBool32) (_stencilTestEnable);
	  */

	/**
	 * get method for field stencilTestEnable
	 * Prototype: VkBool32  stencilTestEnable
	 */ 
	 private static native boolean stencilTestEnable0(ByteBuffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo _obj = (VkPipelineDepthStencilStateCreateInfo)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */

	/**
	 * native Set method for field front
	 * Prototype: VkStencilOpState  front
	 */ 
	 private static native void front0(ByteBuffer ptr, VkStencilOpState _front);/*
		  VkPipelineDepthStencilStateCreateInfo _obj = (VkPipelineDepthStencilStateCreateInfo)(*ptr);
		  _obj.front = (VkStencilOpState) (_front);
	  */

	/**
	 * get method for field front
	 * Prototype: VkStencilOpState  front
	 */ 
	 private static native VkStencilOpState front0(ByteBuffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo _obj = (VkPipelineDepthStencilStateCreateInfo)(ptr);
		  return (VkStencilOpState) (_obj.VkStencilOpState);
	 */

	/**
	 * native Set method for field back
	 * Prototype: VkStencilOpState  back
	 */ 
	 private static native void back0(ByteBuffer ptr, VkStencilOpState _back);/*
		  VkPipelineDepthStencilStateCreateInfo _obj = (VkPipelineDepthStencilStateCreateInfo)(*ptr);
		  _obj.back = (VkStencilOpState) (_back);
	  */

	/**
	 * get method for field back
	 * Prototype: VkStencilOpState  back
	 */ 
	 private static native VkStencilOpState back0(ByteBuffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo _obj = (VkPipelineDepthStencilStateCreateInfo)(ptr);
		  return (VkStencilOpState) (_obj.VkStencilOpState);
	 */

	/**
	 * native Set method for field minDepthBounds
	 * Prototype: float  minDepthBounds
	 */ 
	 private static native void minDepthBounds0(ByteBuffer ptr, float _minDepthBounds);/*
		  VkPipelineDepthStencilStateCreateInfo _obj = (VkPipelineDepthStencilStateCreateInfo)(*ptr);
		  _obj.minDepthBounds = (float) (_minDepthBounds);
	  */

	/**
	 * get method for field minDepthBounds
	 * Prototype: float  minDepthBounds
	 */ 
	 private static native float minDepthBounds0(ByteBuffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo _obj = (VkPipelineDepthStencilStateCreateInfo)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native Set method for field maxDepthBounds
	 * Prototype: float  maxDepthBounds
	 */ 
	 private static native void maxDepthBounds0(ByteBuffer ptr, float _maxDepthBounds);/*
		  VkPipelineDepthStencilStateCreateInfo _obj = (VkPipelineDepthStencilStateCreateInfo)(*ptr);
		  _obj.maxDepthBounds = (float) (_maxDepthBounds);
	  */

	/**
	 * get method for field maxDepthBounds
	 * Prototype: float  maxDepthBounds
	 */ 
	 private static native float maxDepthBounds0(ByteBuffer ptr);/*
		  VkPipelineDepthStencilStateCreateInfo _obj = (VkPipelineDepthStencilStateCreateInfo)(ptr);
		  return (jfloat) (_obj.float);
	 */



} // end of class VkPipelineDepthStencilStateCreateInfo
