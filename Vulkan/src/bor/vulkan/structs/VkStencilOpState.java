/**
 * Class wrapping Vulkan's VkStencilOpState struct.
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
 *  This class is a Java front end for struct VkStencilOpState. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkStencilOpState {
 *     VkStencilOp    failOp;
 *     VkStencilOp    passOp;
 *     VkStencilOp    depthFailOp;
 *     VkCompareOp    compareOp;
 *     uint32_t       compareMask;
 *     uint32_t       writeMask;
 *     uint32_t       reference;
 * } VkStencilOpState;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkStencilOpState extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [61]  */
	 private static final String TAG = "VkStencilOpState";

	/** ID of this structure [61]  */
	 public static final int TAG_ID = VKSTENCILOPSTATE_ID;

	/** P wrapper for THIS object */
	 private  P<VkStencilOpState> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkStencilOp 	failOp	[vkenum]
	 */ 
	 VkStencilOp 	failOp;

	/**
	 *  VkStencilOp 	passOp	[vkenum]
	 */ 
	 VkStencilOp 	passOp;

	/**
	 *  VkStencilOp 	depthFailOp	[vkenum]
	 */ 
	 VkStencilOp 	depthFailOp;

	/**
	 *  VkCompareOp 	compareOp	[vkenum]
	 */ 
	 VkCompareOp 	compareOp;

	/**
	 *  uint32_t 	compareMask	[int]
	 */ 
	 int 	compareMask;

	/**
	 *  uint32_t 	writeMask	[int]
	 */ 
	 int 	writeMask;

	/**
	 *  uint32_t 	reference	[int]
	 */ 
	 int 	reference;

	/**
	 * Ctor
	 */
	public VkStencilOpState(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkStencilOpState(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkStencilOpState(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkStencilOpState(long address){ 
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
	 public static P<VkStencilOpState> createNullPointer(){
	        P<VkStencilOpState> p = new  P<VkStencilOpState>(new VkStencilOpState());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkStencilOpState> getP() {
	       if(p == null ){
	           p = new P<VkStencilOpState> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field failOp	[vkenum]<br>
	 * Prototype: VkStencilOp  failOp
	 */ 
	 public void failOp(VkStencilOp failOp){
		 this.failOp = failOp;
		 int enumVal = failOp.getValue();
		 setFailOp0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field failOp	[vkenum]<br>
	 * Prototype: VkStencilOp  failOp
	 */ 
	 public VkStencilOp failOp(){
		 int nativeVal = getFailOp0(super.ptr);
		 this.failOp = VkStencilOp.fromValue(nativeVal); 
		 return this.failOp;
	 }

	/**
	 * Set method for field passOp	[vkenum]<br>
	 * Prototype: VkStencilOp  passOp
	 */ 
	 public void passOp(VkStencilOp passOp){
		 this.passOp = passOp;
		 int enumVal = passOp.getValue();
		 setPassOp0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field passOp	[vkenum]<br>
	 * Prototype: VkStencilOp  passOp
	 */ 
	 public VkStencilOp passOp(){
		 int nativeVal = getPassOp0(super.ptr);
		 this.passOp = VkStencilOp.fromValue(nativeVal); 
		 return this.passOp;
	 }

	/**
	 * Set method for field depthFailOp	[vkenum]<br>
	 * Prototype: VkStencilOp  depthFailOp
	 */ 
	 public void depthFailOp(VkStencilOp depthFailOp){
		 this.depthFailOp = depthFailOp;
		 int enumVal = depthFailOp.getValue();
		 setDepthFailOp0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field depthFailOp	[vkenum]<br>
	 * Prototype: VkStencilOp  depthFailOp
	 */ 
	 public VkStencilOp depthFailOp(){
		 int nativeVal = getDepthFailOp0(super.ptr);
		 this.depthFailOp = VkStencilOp.fromValue(nativeVal); 
		 return this.depthFailOp;
	 }

	/**
	 * Set method for field compareOp	[vkenum]<br>
	 * Prototype: VkCompareOp  compareOp
	 */ 
	 public void compareOp(VkCompareOp compareOp){
		 this.compareOp = compareOp;
		 int enumVal = compareOp.getValue();
		 setCompareOp0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field compareOp	[vkenum]<br>
	 * Prototype: VkCompareOp  compareOp
	 */ 
	 public VkCompareOp compareOp(){
		 int nativeVal = getCompareOp0(super.ptr);
		 this.compareOp = VkCompareOp.fromValue(nativeVal); 
		 return this.compareOp;
	 }

	/**
	 * Set method for field compareMask	[int]<br>
	 * Prototype: uint32_t  compareMask
	 */ 
	 public void compareMask(int compareMask){
		 this.compareMask = compareMask;
		 setCompareMask0(this.ptr,  compareMask);
	 }

	/**
	 * Get method for field compareMask	[int]<br>
	 * Prototype: uint32_t  compareMask
	 */ 
	 public int compareMask(){
		 int var = getCompareMask0(super.ptr);
		 this.compareMask = var;
		 return this.compareMask;
	 }

	/**
	 * Set method for field writeMask	[int]<br>
	 * Prototype: uint32_t  writeMask
	 */ 
	 public void writeMask(int writeMask){
		 this.writeMask = writeMask;
		 setWriteMask0(this.ptr,  writeMask);
	 }

	/**
	 * Get method for field writeMask	[int]<br>
	 * Prototype: uint32_t  writeMask
	 */ 
	 public int writeMask(){
		 int var = getWriteMask0(super.ptr);
		 this.writeMask = var;
		 return this.writeMask;
	 }

	/**
	 * Set method for field reference	[int]<br>
	 * Prototype: uint32_t  reference
	 */ 
	 public void reference(int reference){
		 this.reference = reference;
		 setReference0(this.ptr,  reference);
	 }

	/**
	 * Get method for field reference	[int]<br>
	 * Prototype: uint32_t  reference
	 */ 
	 public int reference(){
		 int var = getReference0(super.ptr);
		 this.reference = var;
		 return this.reference;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field failOp	[vkenum]<br>
	 * Prototype: VkStencilOp  failOp
	 */ 
	 private static native void setFailOp0(Buffer ptr, int  _failOp);/*
		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  vkObj->failOp = (VkStencilOp) (_failOp);
	  */

	/**
	 * native GET method for field failOp	[vkenum]<br>
	 * Prototype: VkStencilOp  failOp
	 */ 
	 private static native int  getFailOp0(Buffer ptr);/*
		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  return (VkStencilOp) (vkObj->failOp);
	 */

	/**
	 * native SET method for field passOp	[vkenum]<br>
	 * Prototype: VkStencilOp  passOp
	 */ 
	 private static native void setPassOp0(Buffer ptr, int  _passOp);/*
		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  vkObj->passOp = (VkStencilOp) (_passOp);
	  */

	/**
	 * native GET method for field passOp	[vkenum]<br>
	 * Prototype: VkStencilOp  passOp
	 */ 
	 private static native int  getPassOp0(Buffer ptr);/*
		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  return (VkStencilOp) (vkObj->passOp);
	 */

	/**
	 * native SET method for field depthFailOp	[vkenum]<br>
	 * Prototype: VkStencilOp  depthFailOp
	 */ 
	 private static native void setDepthFailOp0(Buffer ptr, int  _depthFailOp);/*
		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  vkObj->depthFailOp = (VkStencilOp) (_depthFailOp);
	  */

	/**
	 * native GET method for field depthFailOp	[vkenum]<br>
	 * Prototype: VkStencilOp  depthFailOp
	 */ 
	 private static native int  getDepthFailOp0(Buffer ptr);/*
		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  return (VkStencilOp) (vkObj->depthFailOp);
	 */

	/**
	 * native SET method for field compareOp	[vkenum]<br>
	 * Prototype: VkCompareOp  compareOp
	 */ 
	 private static native void setCompareOp0(Buffer ptr, int  _compareOp);/*
		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  vkObj->compareOp = (VkCompareOp) (_compareOp);
	  */

	/**
	 * native GET method for field compareOp	[vkenum]<br>
	 * Prototype: VkCompareOp  compareOp
	 */ 
	 private static native int  getCompareOp0(Buffer ptr);/*
		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  return (VkCompareOp) (vkObj->compareOp);
	 */

	/**
	 * native SET method for field compareMask	[int]<br>
	 * Prototype: uint32_t  compareMask
	 */ 
	 private static native void setCompareMask0(Buffer ptr, int _compareMask);/*
		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  vkObj->compareMask = (uint32_t) (_compareMask);
	  */

	/**
	 * native GET method for field compareMask	[int]<br>
	 * Prototype: uint32_t  compareMask
	 */ 
	 private static native int getCompareMask0(Buffer ptr);/*
		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  return (jint) (vkObj->compareMask);
	 */

	/**
	 * native SET method for field writeMask	[int]<br>
	 * Prototype: uint32_t  writeMask
	 */ 
	 private static native void setWriteMask0(Buffer ptr, int _writeMask);/*
		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  vkObj->writeMask = (uint32_t) (_writeMask);
	  */

	/**
	 * native GET method for field writeMask	[int]<br>
	 * Prototype: uint32_t  writeMask
	 */ 
	 private static native int getWriteMask0(Buffer ptr);/*
		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  return (jint) (vkObj->writeMask);
	 */

	/**
	 * native SET method for field reference	[int]<br>
	 * Prototype: uint32_t  reference
	 */ 
	 private static native void setReference0(Buffer ptr, int _reference);/*
		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  vkObj->reference = (uint32_t) (_reference);
	  */

	/**
	 * native GET method for field reference	[int]<br>
	 * Prototype: uint32_t  reference
	 */ 
	 private static native int getReference0(Buffer ptr);/*
		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  return (jint) (vkObj->reference);
	 */



} // end of class VkStencilOpState
