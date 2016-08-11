/**
 * Class wrapping Vulkan's VkDispatchIndirectCommand struct.
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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkDispatchIndirectCommand extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [103]  */
	 private static final String TAG = "VkDispatchIndirectCommand";

	/** ID of this structure [103]  */
	 public static final int TAG_ID = VKDISPATCHINDIRECTCOMMAND_ID;

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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDispatchIndirectCommand(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDispatchIndirectCommand(long address){ 
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
	 * Set method for field x	[int]<br>
	 * Prototype: uint32_t  x
	 * 
	 * @param x - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDispatchIndirectCommand x(int x){
		 this.x = x;
		 setX0(this.ptr,  x);
		 return this;
	 }

	/**
	 * Get method for field x	[int]<br>
	 * Prototype: uint32_t  x
	 */ 
	 public int x(){
		 int var = getX0(super.ptr);
		 this.x = var;
		 return this.x;
	 }

	/**
	 * Set method for field y	[int]<br>
	 * Prototype: uint32_t  y
	 * 
	 * @param y - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDispatchIndirectCommand y(int y){
		 this.y = y;
		 setY0(this.ptr,  y);
		 return this;
	 }

	/**
	 * Get method for field y	[int]<br>
	 * Prototype: uint32_t  y
	 */ 
	 public int y(){
		 int var = getY0(super.ptr);
		 this.y = var;
		 return this.y;
	 }

	/**
	 * Set method for field z	[int]<br>
	 * Prototype: uint32_t  z
	 * 
	 * @param z - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDispatchIndirectCommand z(int z){
		 this.z = z;
		 setZ0(this.ptr,  z);
		 return this;
	 }

	/**
	 * Get method for field z	[int]<br>
	 * Prototype: uint32_t  z
	 */ 
	 public int z(){
		 int var = getZ0(super.ptr);
		 this.z = var;
		 return this.z;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkDispatchIndirectCommand [ ")
				.append("x: ").append(x() )
				.append(",\n y: ")
				.append(y() )
				.append(",\n z: ")
				.append(z() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field x	[int]<br>
	 * Prototype: uint32_t  x
	 */ 
	 private static native void setX0(Buffer ptr, int _x);/*
		  VkDispatchIndirectCommand* vkObj = (VkDispatchIndirectCommand*)(ptr);
		 // code for simple past value 
		  vkObj->x = (uint32_t) (_x);
	  */

	/**
	 * Native GET method for field x	[int]<br>
	 * Prototype: uint32_t  x
	 */ 
	 private static native int getX0(Buffer ptr);/*
		  VkDispatchIndirectCommand* vkObj = (VkDispatchIndirectCommand*)(ptr);
		  return (jint) (vkObj->x);
	 */

	/**
	 * Native SET method for field y	[int]<br>
	 * Prototype: uint32_t  y
	 */ 
	 private static native void setY0(Buffer ptr, int _y);/*
		  VkDispatchIndirectCommand* vkObj = (VkDispatchIndirectCommand*)(ptr);
		 // code for simple past value 
		  vkObj->y = (uint32_t) (_y);
	  */

	/**
	 * Native GET method for field y	[int]<br>
	 * Prototype: uint32_t  y
	 */ 
	 private static native int getY0(Buffer ptr);/*
		  VkDispatchIndirectCommand* vkObj = (VkDispatchIndirectCommand*)(ptr);
		  return (jint) (vkObj->y);
	 */

	/**
	 * Native SET method for field z	[int]<br>
	 * Prototype: uint32_t  z
	 */ 
	 private static native void setZ0(Buffer ptr, int _z);/*
		  VkDispatchIndirectCommand* vkObj = (VkDispatchIndirectCommand*)(ptr);
		 // code for simple past value 
		  vkObj->z = (uint32_t) (_z);
	  */

	/**
	 * Native GET method for field z	[int]<br>
	 * Prototype: uint32_t  z
	 */ 
	 private static native int getZ0(Buffer ptr);/*
		  VkDispatchIndirectCommand* vkObj = (VkDispatchIndirectCommand*)(ptr);
		  return (jint) (vkObj->z);
	 */



} // end of class VkDispatchIndirectCommand
