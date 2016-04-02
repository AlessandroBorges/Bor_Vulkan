/**
 * Class wrapping Vulkan's VkDispatchIndirectCommand struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.01 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.structs;

import java.nio.Buffer;
import java.nio.ByteBuffer;

import bor.vulkan.P;


/**
 *  Project Bor-Vulkan 
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkDispatchIndirectCommand. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDispatchIndirectCommand {
 *     uint32_t    x;
 *     uint32_t    y;
 *     uint32_t    z;
 * } VkDispatchIndirectCommand;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkDispatchIndirectCommand extends VkStruct {
	/** TAG of this structure [103]  */
	 private static final String TAG = "VkDispatchIndirectCommand";

	/** ID of this structure [103]  */
	 public static final int TAG_ID = VKDISPATCHINDIRECTCOMMAND_ID;

	/** P wrapper for THIS object */
	 private  P<VkDispatchIndirectCommand> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  uint32_t 	x	[int]
	 */ 
	 int 	x;

	/**
	 *  uint32_t 	y	[int]
	 */ 
	 int 	y;

	/**
	 *  uint32_t 	z	[int]
	 */ 
	 int 	z;

	/**
	 * Ctor
	 */
	public VkDispatchIndirectCommand(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDispatchIndirectCommand(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkDispatchIndirectCommand(long address, int memSize){ 
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
	 public static P<VkDispatchIndirectCommand> createNullPointer(){
	        P<VkDispatchIndirectCommand> p = new  P<VkDispatchIndirectCommand>(new VkDispatchIndirectCommand());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkDispatchIndirectCommand> getP() {
	       if(p == null ){
	           p = new P<VkDispatchIndirectCommand> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field x	[int]<br>
	 * Prototype: uint32_t  x
	 */ 
	 public void x(int x){
		 this.x = x;
		 x0(this.ptr,  x);
	 }

	/**
	 * Get method for field x	[int]<br>
	 * Prototype: uint32_t  x
	 */ 
	 public int x(){
		 int var = x0(super.ptr);
		 this.x = var;
		 return this.x;
	 }

	/**
	 * Set method for field y	[int]<br>
	 * Prototype: uint32_t  y
	 */ 
	 public void y(int y){
		 this.y = y;
		 y0(this.ptr,  y);
	 }

	/**
	 * Get method for field y	[int]<br>
	 * Prototype: uint32_t  y
	 */ 
	 public int y(){
		 int var = y0(super.ptr);
		 this.y = var;
		 return this.y;
	 }

	/**
	 * Set method for field z	[int]<br>
	 * Prototype: uint32_t  z
	 */ 
	 public void z(int z){
		 this.z = z;
		 z0(this.ptr,  z);
	 }

	/**
	 * Get method for field z	[int]<br>
	 * Prototype: uint32_t  z
	 */ 
	 public int z(){
		 int var = z0(super.ptr);
		 this.z = var;
		 return this.z;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field x	[int]<br>
	 * Prototype: uint32_t  x
	 */ 
	 private static native void x0(Buffer ptr, int _x);/*
		  VkDispatchIndirectCommand* vkObj = (VkDispatchIndirectCommand*)(ptr);
		  vkObj->x = (uint32_t) (_x);
	  */

	/**
	 * native GET method for field x	[int]<br>
	 * Prototype: uint32_t  x
	 */ 
	 private static native int x0(Buffer ptr);/*
		  VkDispatchIndirectCommand vkObj = (VkDispatchIndirectCommand*)(ptr);
		  return (jint) (vkObj->x);
	 */

	/**
	 * native SET method for field y	[int]<br>
	 * Prototype: uint32_t  y
	 */ 
	 private static native void y0(Buffer ptr, int _y);/*
		  VkDispatchIndirectCommand* vkObj = (VkDispatchIndirectCommand*)(ptr);
		  vkObj->y = (uint32_t) (_y);
	  */

	/**
	 * native GET method for field y	[int]<br>
	 * Prototype: uint32_t  y
	 */ 
	 private static native int y0(Buffer ptr);/*
		  VkDispatchIndirectCommand vkObj = (VkDispatchIndirectCommand*)(ptr);
		  return (jint) (vkObj->y);
	 */

	/**
	 * native SET method for field z	[int]<br>
	 * Prototype: uint32_t  z
	 */ 
	 private static native void z0(Buffer ptr, int _z);/*
		  VkDispatchIndirectCommand* vkObj = (VkDispatchIndirectCommand*)(ptr);
		  vkObj->z = (uint32_t) (_z);
	  */

	/**
	 * native GET method for field z	[int]<br>
	 * Prototype: uint32_t  z
	 */ 
	 private static native int z0(Buffer ptr);/*
		  VkDispatchIndirectCommand vkObj = (VkDispatchIndirectCommand*)(ptr);
		  return (jint) (vkObj->z);
	 */



} // end of class VkDispatchIndirectCommand
