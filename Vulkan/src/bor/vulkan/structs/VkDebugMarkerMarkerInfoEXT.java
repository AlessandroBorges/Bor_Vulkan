/**
 * Class wrapping Vulkan's VkDebugMarkerMarkerInfoEXT struct.
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
 *  This class is a Java front end for struct VkDebugMarkerMarkerInfoEXT. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDebugMarkerMarkerInfoEXT {
 *     VkStructureType    sType;
 *     const void*        pNext;
 *     const char*        pMarkerName;
 *     float              color[4];
 * } VkDebugMarkerMarkerInfoEXT;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkDebugMarkerMarkerInfoEXT extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [128]  */
	 private static final String TAG = "VkDebugMarkerMarkerInfoEXT";

	/** ID of this structure [128]  */
	 public static final int TAG_ID = VKDEBUGMARKERMARKERINFOEXT_ID;

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
	 *  const char* 	pMarkerName	[string]
	 */ 
	String 	pMarkerName;
	
	/**
	 *  float[] 	color	[float_array [4] ]
	 */ 
	float[] 	color = new float[4];
	/**
	 * Ctor
	 */
	public VkDebugMarkerMarkerInfoEXT(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDebugMarkerMarkerInfoEXT(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDebugMarkerMarkerInfoEXT(long address){ 
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
	 public static VkArray<VkDebugMarkerMarkerInfoEXT> createVkArray(int size){ 
		 VkDebugMarkerMarkerInfoEXT[] array = new VkDebugMarkerMarkerInfoEXT[size]; 
		 VkArrayStruct<VkDebugMarkerMarkerInfoEXT> vkArray = new VkArrayStruct<VkDebugMarkerMarkerInfoEXT> (array, TAG_ID);
		 return vkArray; 
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
	 public VkDebugMarkerMarkerInfoEXT sType(VkStructureType sType){
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
	 public VkDebugMarkerMarkerInfoEXT pNext(VkObject pNext){
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
	 * Set method for field pMarkerName	[string]<br>
	 * Prototype: const char*  pMarkerName
	 * 
	 * @param pMarkerName - a instance of String.
	 * @return this VkStruct instance.
	 */ 
	 public VkDebugMarkerMarkerInfoEXT pMarkerName(String pMarkerName){
		 this.pMarkerName = pMarkerName;
		 setPMarkerName0(this.ptr,  pMarkerName);
		 return this;
	 }

	/**
	 * Get method for field pMarkerName	[string]<br>
	 * Prototype: const char*  pMarkerName
	 */ 
	 public String pMarkerName(){
		 String var = getPMarkerName0(super.ptr);
		 this.pMarkerName = var;
		 return this.pMarkerName;
	 }

	/**
	 * Set method for field color	[float]<br>
	 * Prototype: float[]  color
	 * 
	 * @param color - a instance of float[].
	 * @return this VkStruct instance.
	 */ 
	 public VkDebugMarkerMarkerInfoEXT color(float[] color){
		 if(color == null)
		     java.util.Arrays.fill(this.color , (float) 0);
		  else
		     System.arraycopy(color, 0, this.color, 0, this.color.length); 

		 setColor0(this.ptr,  this.color);
		 return this;
	 }

	/**
	 * Get method for field color	[float]<br>
	 * Prototype: float[]  color
	 */ 
	 public float[] color(){
		 float[] var = getColor0(super.ptr, color);
		 this.color = var;
		 return this.color;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkDebugMarkerMarkerInfoEXT [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n pMarkerName: ")
				.append(pMarkerName() )
				.append(",\n color: ")
				.append(Arrays.toString(color()) )
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
		  VkDebugMarkerMarkerInfoEXT* vkObj = (VkDebugMarkerMarkerInfoEXT*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkDebugMarkerMarkerInfoEXT* vkObj = (VkDebugMarkerMarkerInfoEXT*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDebugMarkerMarkerInfoEXT* vkObj = (VkDebugMarkerMarkerInfoEXT*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkDebugMarkerMarkerInfoEXT* vkObj = (VkDebugMarkerMarkerInfoEXT*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field pMarkerName	[string]<br>
	 * Prototype: const char*  pMarkerName
	 */ 
	 private static native void setPMarkerName0(Buffer ptr, String _pMarkerName);/*
		  VkDebugMarkerMarkerInfoEXT* vkObj = (VkDebugMarkerMarkerInfoEXT*)(ptr);
		  vkObj->pMarkerName = cloneStr(_pMarkerName);
	  */

	/**
	 * Native GET method for field pMarkerName	[string]<br>
	 * Prototype: const char*  pMarkerName
	 */ 
	 private static native String getPMarkerName0(Buffer ptr);/*
		  VkDebugMarkerMarkerInfoEXT* vkObj = (VkDebugMarkerMarkerInfoEXT*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->pMarkerName));
	 */

	/**
	 * Native SET method for field color	[float]<br>
	 * Prototype: float[]  color
	 */ 
	 private static native void setColor0(Buffer ptr, float[] _color);/*
		  VkDebugMarkerMarkerInfoEXT* vkObj = (VkDebugMarkerMarkerInfoEXT*)(ptr);
		 // code for fixed size array 
		  memcpy(vkObj->color, _color, 4 * sizeof(float));
	  */

	/**
	 * Native GET method for field color	[float]<br>
	 * Prototype: float[]  color
	 */ 
	 private static native float[] getColor0(Buffer ptr, float[] _color);/*
		  VkDebugMarkerMarkerInfoEXT* vkObj = (VkDebugMarkerMarkerInfoEXT*)(ptr);
		  // fixed length array  
		  memcpy(&_color, &(vkObj->color), 4 * sizeof(float));
		  return obj__color;
	 */



} // end of class VkDebugMarkerMarkerInfoEXT
