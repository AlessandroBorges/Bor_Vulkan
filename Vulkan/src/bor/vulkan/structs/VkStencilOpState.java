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
	/** TAG of this structure [61]  */
	 private static final String TAG = "VkStencilOpState";

	/** ID of this structure [61]  */
	 public static final int TAG_ID = VKSTENCILOPSTATE_ID;

	 // fields //
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
		 super(sizeOf()); 
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
	 public VkStencilOpState(long address, int memSize){ 
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
	 public static P<VkStencilOpState> createNullPointer(){
	        P<VkStencilOpState> p = new  P<VkStencilOpState>(new VkStencilOpState());
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
		failOp0(super.ptr, failOp);
	 }

	/**
	 * get method for field failOp	[vkenum]<br>
	 * Prototype: VkStencilOp  failOp
	 */ 
	 public VkStencilOp failOp(){
		 // return  this.failOp;
		 return failOp0(super.ptr);
	 }

	/**
	 * Set method for field passOp	[vkenum]<br>
	 * Prototype: VkStencilOp  passOp
	 */ 
	 public void passOp(VkStencilOp passOp){
		 this.passOp = passOp;
		passOp0(super.ptr, passOp);
	 }

	/**
	 * get method for field passOp	[vkenum]<br>
	 * Prototype: VkStencilOp  passOp
	 */ 
	 public VkStencilOp passOp(){
		 // return  this.passOp;
		 return passOp0(super.ptr);
	 }

	/**
	 * Set method for field depthFailOp	[vkenum]<br>
	 * Prototype: VkStencilOp  depthFailOp
	 */ 
	 public void depthFailOp(VkStencilOp depthFailOp){
		 this.depthFailOp = depthFailOp;
		depthFailOp0(super.ptr, depthFailOp);
	 }

	/**
	 * get method for field depthFailOp	[vkenum]<br>
	 * Prototype: VkStencilOp  depthFailOp
	 */ 
	 public VkStencilOp depthFailOp(){
		 // return  this.depthFailOp;
		 return depthFailOp0(super.ptr);
	 }

	/**
	 * Set method for field compareOp	[vkenum]<br>
	 * Prototype: VkCompareOp  compareOp
	 */ 
	 public void compareOp(VkCompareOp compareOp){
		 this.compareOp = compareOp;
		compareOp0(super.ptr, compareOp);
	 }

	/**
	 * get method for field compareOp	[vkenum]<br>
	 * Prototype: VkCompareOp  compareOp
	 */ 
	 public VkCompareOp compareOp(){
		 // return  this.compareOp;
		 return compareOp0(super.ptr);
	 }

	/**
	 * Set method for field compareMask	[int]<br>
	 * Prototype: uint32_t  compareMask
	 */ 
	 public void compareMask(int compareMask){
		 this.compareMask = compareMask;
		compareMask0(super.ptr, compareMask);
	 }

	/**
	 * get method for field compareMask	[int]<br>
	 * Prototype: uint32_t  compareMask
	 */ 
	 public int compareMask(){
		 // return  this.compareMask;
		 return compareMask0(super.ptr);
	 }

	/**
	 * Set method for field writeMask	[int]<br>
	 * Prototype: uint32_t  writeMask
	 */ 
	 public void writeMask(int writeMask){
		 this.writeMask = writeMask;
		writeMask0(super.ptr, writeMask);
	 }

	/**
	 * get method for field writeMask	[int]<br>
	 * Prototype: uint32_t  writeMask
	 */ 
	 public int writeMask(){
		 // return  this.writeMask;
		 return writeMask0(super.ptr);
	 }

	/**
	 * Set method for field reference	[int]<br>
	 * Prototype: uint32_t  reference
	 */ 
	 public void reference(int reference){
		 this.reference = reference;
		reference0(super.ptr, reference);
	 }

	/**
	 * get method for field reference	[int]<br>
	 * Prototype: uint32_t  reference
	 */ 
	 public int reference(){
		 // return  this.reference;
		 return reference0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field failOp	[vkenum]<br>
	 * Prototype: VkStencilOp  failOp
	 */ 
	 private static native void failOp0(ByteBuffer ptr, VkStencilOp _failOp);/*
		  VkStencilOpState _obj = (VkStencilOpState)(*ptr);
		  _obj.failOp = (VkStencilOp) (_failOp);
	  */

	/**
	 * native GET method for field failOp	[vkenum]<br>
	 * Prototype: VkStencilOp  failOp
	 */ 
	 private static native VkStencilOp failOp0(ByteBuffer ptr);/*
		  VkStencilOpState _obj = (VkStencilOpState)(ptr);
		  return (VkStencilOp) (_obj.VkStencilOp);
	 */

	/**
	 * native SET method for field passOp	[vkenum]<br>
	 * Prototype: VkStencilOp  passOp
	 */ 
	 private static native void passOp0(ByteBuffer ptr, VkStencilOp _passOp);/*
		  VkStencilOpState _obj = (VkStencilOpState)(*ptr);
		  _obj.passOp = (VkStencilOp) (_passOp);
	  */

	/**
	 * native GET method for field passOp	[vkenum]<br>
	 * Prototype: VkStencilOp  passOp
	 */ 
	 private static native VkStencilOp passOp0(ByteBuffer ptr);/*
		  VkStencilOpState _obj = (VkStencilOpState)(ptr);
		  return (VkStencilOp) (_obj.VkStencilOp);
	 */

	/**
	 * native SET method for field depthFailOp	[vkenum]<br>
	 * Prototype: VkStencilOp  depthFailOp
	 */ 
	 private static native void depthFailOp0(ByteBuffer ptr, VkStencilOp _depthFailOp);/*
		  VkStencilOpState _obj = (VkStencilOpState)(*ptr);
		  _obj.depthFailOp = (VkStencilOp) (_depthFailOp);
	  */

	/**
	 * native GET method for field depthFailOp	[vkenum]<br>
	 * Prototype: VkStencilOp  depthFailOp
	 */ 
	 private static native VkStencilOp depthFailOp0(ByteBuffer ptr);/*
		  VkStencilOpState _obj = (VkStencilOpState)(ptr);
		  return (VkStencilOp) (_obj.VkStencilOp);
	 */

	/**
	 * native SET method for field compareOp	[vkenum]<br>
	 * Prototype: VkCompareOp  compareOp
	 */ 
	 private static native void compareOp0(ByteBuffer ptr, VkCompareOp _compareOp);/*
		  VkStencilOpState _obj = (VkStencilOpState)(*ptr);
		  _obj.compareOp = (VkCompareOp) (_compareOp);
	  */

	/**
	 * native GET method for field compareOp	[vkenum]<br>
	 * Prototype: VkCompareOp  compareOp
	 */ 
	 private static native VkCompareOp compareOp0(ByteBuffer ptr);/*
		  VkStencilOpState _obj = (VkStencilOpState)(ptr);
		  return (VkCompareOp) (_obj.VkCompareOp);
	 */

	/**
	 * native SET method for field compareMask	[int]<br>
	 * Prototype: uint32_t  compareMask
	 */ 
	 private static native void compareMask0(ByteBuffer ptr, int _compareMask);/*
		  VkStencilOpState _obj = (VkStencilOpState)(*ptr);
		  _obj.compareMask = (uint32_t) (_compareMask);
	  */

	/**
	 * native GET method for field compareMask	[int]<br>
	 * Prototype: uint32_t  compareMask
	 */ 
	 private static native int compareMask0(ByteBuffer ptr);/*
		  VkStencilOpState _obj = (VkStencilOpState)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field writeMask	[int]<br>
	 * Prototype: uint32_t  writeMask
	 */ 
	 private static native void writeMask0(ByteBuffer ptr, int _writeMask);/*
		  VkStencilOpState _obj = (VkStencilOpState)(*ptr);
		  _obj.writeMask = (uint32_t) (_writeMask);
	  */

	/**
	 * native GET method for field writeMask	[int]<br>
	 * Prototype: uint32_t  writeMask
	 */ 
	 private static native int writeMask0(ByteBuffer ptr);/*
		  VkStencilOpState _obj = (VkStencilOpState)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field reference	[int]<br>
	 * Prototype: uint32_t  reference
	 */ 
	 private static native void reference0(ByteBuffer ptr, int _reference);/*
		  VkStencilOpState _obj = (VkStencilOpState)(*ptr);
		  _obj.reference = (uint32_t) (_reference);
	  */

	/**
	 * native GET method for field reference	[int]<br>
	 * Prototype: uint32_t  reference
	 */ 
	 private static native int reference0(ByteBuffer ptr);/*
		  VkStencilOpState _obj = (VkStencilOpState)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkStencilOpState
