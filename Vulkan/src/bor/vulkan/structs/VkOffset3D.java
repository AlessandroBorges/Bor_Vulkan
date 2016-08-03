/**
 * Class wrapping Vulkan's VkOffset3D struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.65 (beta)
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
 *  This class is a Java front end for struct VkOffset3D. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkOffset3D {
 *     int32_t    x;
 *     int32_t    y;
 *     int32_t    z;
 * } VkOffset3D;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkOffset3D extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [29]  */
	 private static final String TAG = "VkOffset3D";

	/** ID of this structure [29]  */
	 public static final int TAG_ID = VKOFFSET3D_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
/**
	 *  int32_t 	x	[int]
	 */ 
	 int 	x;
	
/**
	 *  int32_t 	y	[int]
	 */ 
	 int 	y;
	
/**
	 *  int32_t 	z	[int]
	 */ 
	 int 	z;
	/**
	 * Ctor
	 */
	public VkOffset3D(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkOffset3D(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkOffset3D(long address){ 
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
	 * Prototype: int32_t  x
	 * 
	 * @param x - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkOffset3D x(int x){
		 this.x = x;
		 setX0(this.ptr,  x);
		 return this;
	 }

	/**
	 * Get method for field x	[int]<br>
	 * Prototype: int32_t  x
	 */ 
	 public int x(){
		 int var = getX0(super.ptr);
		 this.x = var;
		 return this.x;
	 }

	/**
	 * Set method for field y	[int]<br>
	 * Prototype: int32_t  y
	 * 
	 * @param y - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkOffset3D y(int y){
		 this.y = y;
		 setY0(this.ptr,  y);
		 return this;
	 }

	/**
	 * Get method for field y	[int]<br>
	 * Prototype: int32_t  y
	 */ 
	 public int y(){
		 int var = getY0(super.ptr);
		 this.y = var;
		 return this.y;
	 }

	/**
	 * Set method for field z	[int]<br>
	 * Prototype: int32_t  z
	 * 
	 * @param z - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkOffset3D z(int z){
		 this.z = z;
		 setZ0(this.ptr,  z);
		 return this;
	 }

	/**
	 * Get method for field z	[int]<br>
	 * Prototype: int32_t  z
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
         builder.append("VkOffset3D [ ")
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
	 * native SET method for field x	[int]<br>
	 * Prototype: int32_t  x
	 */ 
	 private static native void setX0(Buffer ptr, int _x);/*
		  VkOffset3D* vkObj = (VkOffset3D*)(ptr);
		  vkObj->x = (int32_t) (_x);
	  */

	/**
	 * native GET method for field x	[int]<br>
	 * Prototype: int32_t  x
	 */ 
	 private static native int getX0(Buffer ptr);/*
		  VkOffset3D* vkObj = (VkOffset3D*)(ptr);
		  return (jint) (vkObj->x);
	 */

	/**
	 * native SET method for field y	[int]<br>
	 * Prototype: int32_t  y
	 */ 
	 private static native void setY0(Buffer ptr, int _y);/*
		  VkOffset3D* vkObj = (VkOffset3D*)(ptr);
		  vkObj->y = (int32_t) (_y);
	  */

	/**
	 * native GET method for field y	[int]<br>
	 * Prototype: int32_t  y
	 */ 
	 private static native int getY0(Buffer ptr);/*
		  VkOffset3D* vkObj = (VkOffset3D*)(ptr);
		  return (jint) (vkObj->y);
	 */

	/**
	 * native SET method for field z	[int]<br>
	 * Prototype: int32_t  z
	 */ 
	 private static native void setZ0(Buffer ptr, int _z);/*
		  VkOffset3D* vkObj = (VkOffset3D*)(ptr);
		  vkObj->z = (int32_t) (_z);
	  */

	/**
	 * native GET method for field z	[int]<br>
	 * Prototype: int32_t  z
	 */ 
	 private static native int getZ0(Buffer ptr);/*
		  VkOffset3D* vkObj = (VkOffset3D*)(ptr);
		  return (jint) (vkObj->z);
	 */



} // end of class VkOffset3D
