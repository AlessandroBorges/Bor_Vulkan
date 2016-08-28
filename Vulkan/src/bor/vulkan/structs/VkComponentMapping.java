/**
 * Class wrapping Vulkan's VkComponentMapping struct.
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
 *  This class is a Java front end for struct VkComponentMapping. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkComponentMapping {
 *     VkComponentSwizzle    r;
 *     VkComponentSwizzle    g;
 *     VkComponentSwizzle    b;
 *     VkComponentSwizzle    a;
 * } VkComponentMapping;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkComponentMapping extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [41]  */
	 private static final String TAG = "VkComponentMapping";

	/** ID of this structure [41]  */
	 public static final int TAG_ID = VKCOMPONENTMAPPING_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkComponentSwizzle 	r	[vkenum]
	 */ 
	VkComponentSwizzle 	r;
	
	/**
	 *  VkComponentSwizzle 	g	[vkenum]
	 */ 
	VkComponentSwizzle 	g;
	
	/**
	 *  VkComponentSwizzle 	b	[vkenum]
	 */ 
	VkComponentSwizzle 	b;
	
	/**
	 *  VkComponentSwizzle 	a	[vkenum]
	 */ 
	VkComponentSwizzle 	a;
	/**
	 * Ctor
	 */
	public VkComponentMapping(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkComponentMapping(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkComponentMapping(long address){ 
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

	/** 
	 * Static method to create a VkArray for this VkStruct subclass.
	 * @param size - number of elements
	 */
	 public static VkArray<VkComponentMapping> createVkArray(int size){ 
		 VkComponentMapping[] array = new VkComponentMapping[size]; 
		 VkArrayStruct<VkComponentMapping> vkArray = new VkArrayStruct<VkComponentMapping> (array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field r	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  r
	 * 
	 * @param r - a instance of VkComponentSwizzle.
	 * @return this VkStruct instance.
	 */ 
	 public VkComponentMapping r(VkComponentSwizzle r){
		 this.r = r;
		 int enumVal = r.getValue();
		 setR0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field r	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  r
	 */ 
	 public VkComponentSwizzle r(){
		 int nativeVal = getR0(super.ptr);
		 this.r = VkComponentSwizzle.fromValue(nativeVal); 
		 return this.r;
	 }

	/**
	 * Set method for field g	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  g
	 * 
	 * @param g - a instance of VkComponentSwizzle.
	 * @return this VkStruct instance.
	 */ 
	 public VkComponentMapping g(VkComponentSwizzle g){
		 this.g = g;
		 int enumVal = g.getValue();
		 setG0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field g	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  g
	 */ 
	 public VkComponentSwizzle g(){
		 int nativeVal = getG0(super.ptr);
		 this.g = VkComponentSwizzle.fromValue(nativeVal); 
		 return this.g;
	 }

	/**
	 * Set method for field b	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  b
	 * 
	 * @param b - a instance of VkComponentSwizzle.
	 * @return this VkStruct instance.
	 */ 
	 public VkComponentMapping b(VkComponentSwizzle b){
		 this.b = b;
		 int enumVal = b.getValue();
		 setB0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field b	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  b
	 */ 
	 public VkComponentSwizzle b(){
		 int nativeVal = getB0(super.ptr);
		 this.b = VkComponentSwizzle.fromValue(nativeVal); 
		 return this.b;
	 }

	/**
	 * Set method for field a	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  a
	 * 
	 * @param a - a instance of VkComponentSwizzle.
	 * @return this VkStruct instance.
	 */ 
	 public VkComponentMapping a(VkComponentSwizzle a){
		 this.a = a;
		 int enumVal = a.getValue();
		 setA0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field a	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  a
	 */ 
	 public VkComponentSwizzle a(){
		 int nativeVal = getA0(super.ptr);
		 this.a = VkComponentSwizzle.fromValue(nativeVal); 
		 return this.a;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkComponentMapping [ ")
				.append("r: ").append(r() )
				.append(",\n g: ")
				.append(g() )
				.append(",\n b: ")
				.append(b() )
				.append(",\n a: ")
				.append(a() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field r	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  r
	 */ 
	 private static native void setR0(Buffer ptr, int  _r);/*
		  VkComponentMapping* vkObj = (VkComponentMapping*)(ptr);
		 // code for simple past value 
		  vkObj->r = (VkComponentSwizzle) (_r);
	  */

	/**
	 * Native GET method for field r	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  r
	 */ 
	 private static native int getR0(Buffer ptr);/*
		  VkComponentMapping* vkObj = (VkComponentMapping*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->r);
	 */

	/**
	 * Native SET method for field g	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  g
	 */ 
	 private static native void setG0(Buffer ptr, int  _g);/*
		  VkComponentMapping* vkObj = (VkComponentMapping*)(ptr);
		 // code for simple past value 
		  vkObj->g = (VkComponentSwizzle) (_g);
	  */

	/**
	 * Native GET method for field g	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  g
	 */ 
	 private static native int getG0(Buffer ptr);/*
		  VkComponentMapping* vkObj = (VkComponentMapping*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->g);
	 */

	/**
	 * Native SET method for field b	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  b
	 */ 
	 private static native void setB0(Buffer ptr, int  _b);/*
		  VkComponentMapping* vkObj = (VkComponentMapping*)(ptr);
		 // code for simple past value 
		  vkObj->b = (VkComponentSwizzle) (_b);
	  */

	/**
	 * Native GET method for field b	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  b
	 */ 
	 private static native int getB0(Buffer ptr);/*
		  VkComponentMapping* vkObj = (VkComponentMapping*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->b);
	 */

	/**
	 * Native SET method for field a	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  a
	 */ 
	 private static native void setA0(Buffer ptr, int  _a);/*
		  VkComponentMapping* vkObj = (VkComponentMapping*)(ptr);
		 // code for simple past value 
		  vkObj->a = (VkComponentSwizzle) (_a);
	  */

	/**
	 * Native GET method for field a	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  a
	 */ 
	 private static native int getA0(Buffer ptr);/*
		  VkComponentMapping* vkObj = (VkComponentMapping*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->a);
	 */



} // end of class VkComponentMapping
