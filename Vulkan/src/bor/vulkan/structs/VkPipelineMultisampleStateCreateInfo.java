/**
 * Class wrapping Vulkan's VkPipelineMultisampleStateCreateInfo struct.
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
 *  This class is a Java front end for struct VkPipelineMultisampleStateCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPipelineMultisampleStateCreateInfo {
 *     VkStructureType                          sType;
 *     const void*                              pNext;
 *     VkPipelineMultisampleStateCreateFlags    flags;
 *     VkSampleCountFlagBits                    rasterizationSamples;
 *     VkBool32                                 sampleShadingEnable;
 *     float                                    minSampleShading;
 *     const VkSampleMask*                      pSampleMask;
 *     VkBool32                                 alphaToCoverageEnable;
 *     VkBool32                                 alphaToOneEnable;
 * } VkPipelineMultisampleStateCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkPipelineMultisampleStateCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [60]  */
	 private static final String TAG = "VkPipelineMultisampleStateCreateInfo";

	/** ID of this structure [60]  */
	 public static final int TAG_ID = VKPIPELINEMULTISAMPLESTATECREATEINFO_ID;

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
	 *  VkPipelineMultisampleStateCreateFlags 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  VkSampleCountFlagBits 	rasterizationSamples	[vkenum]
	 */ 
	VkSampleCountFlagBits 	rasterizationSamples;
	
	/**
	 *  VkBool32 	sampleShadingEnable	[boolean]
	 */ 
	boolean 	sampleShadingEnable;
	
	/**
	 *  float 	minSampleShading	[float]
	 */ 
	float 	minSampleShading;
	
	/**
	 *  const VkSampleMask* 	pSampleMask	[int_array]
	 */ 
	int[] 	pSampleMask;
	
	/**
	 *  VkBool32 	alphaToCoverageEnable	[boolean]
	 */ 
	boolean 	alphaToCoverageEnable;
	
	/**
	 *  VkBool32 	alphaToOneEnable	[boolean]
	 */ 
	boolean 	alphaToOneEnable;
	/**
	 * Ctor
	 */
	public VkPipelineMultisampleStateCreateInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPipelineMultisampleStateCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPipelineMultisampleStateCreateInfo(long address){ 
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
	 public static VkArray<VkPipelineMultisampleStateCreateInfo> createVkArray(int size){ 
		 VkPipelineMultisampleStateCreateInfo[] array = new VkPipelineMultisampleStateCreateInfo[size]; 
		 VkArrayStruct<VkPipelineMultisampleStateCreateInfo> vkArray = new VkArrayStruct<VkPipelineMultisampleStateCreateInfo> (array, TAG_ID);
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
	 public VkPipelineMultisampleStateCreateInfo sType(VkStructureType sType){
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
	 public VkPipelineMultisampleStateCreateInfo pNext(VkObject pNext){
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
	 * Set method for field flags	[int]<br>
	 * Prototype: VkPipelineMultisampleStateCreateFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineMultisampleStateCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkPipelineMultisampleStateCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field rasterizationSamples	[vkenum]<br>
	 * Prototype: VkSampleCountFlagBits  rasterizationSamples
	 * 
	 * @param rasterizationSamples - a instance of VkSampleCountFlagBits.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineMultisampleStateCreateInfo rasterizationSamples(VkSampleCountFlagBits rasterizationSamples){
		 this.rasterizationSamples = rasterizationSamples;
		 int enumVal = rasterizationSamples.getValue();
		 setRasterizationSamples0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field rasterizationSamples	[vkenum]<br>
	 * Prototype: VkSampleCountFlagBits  rasterizationSamples
	 */ 
	 public VkSampleCountFlagBits rasterizationSamples(){
		 int nativeVal = getRasterizationSamples0(super.ptr);
		 this.rasterizationSamples = VkSampleCountFlagBits.fromValue(nativeVal); 
		 return this.rasterizationSamples;
	 }

	/**
	 * Set method for field sampleShadingEnable	[boolean]<br>
	 * Prototype: VkBool32  sampleShadingEnable
	 * 
	 * @param sampleShadingEnable - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineMultisampleStateCreateInfo sampleShadingEnable(boolean sampleShadingEnable){
		 this.sampleShadingEnable = sampleShadingEnable;
		 setSampleShadingEnable0(this.ptr,  sampleShadingEnable);
		 return this;
	 }

	/**
	 * Get method for field sampleShadingEnable	[boolean]<br>
	 * Prototype: VkBool32  sampleShadingEnable
	 */ 
	 public boolean sampleShadingEnable(){
		 boolean var = getSampleShadingEnable0(super.ptr);
		 this.sampleShadingEnable = var;
		 return this.sampleShadingEnable;
	 }

	/**
	 * Set method for field minSampleShading	[float]<br>
	 * Prototype: float  minSampleShading
	 * 
	 * @param minSampleShading - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineMultisampleStateCreateInfo minSampleShading(float minSampleShading){
		 this.minSampleShading = minSampleShading;
		 setMinSampleShading0(this.ptr,  minSampleShading);
		 return this;
	 }

	/**
	 * Get method for field minSampleShading	[float]<br>
	 * Prototype: float  minSampleShading
	 */ 
	 public float minSampleShading(){
		 float var = getMinSampleShading0(super.ptr);
		 this.minSampleShading = var;
		 return this.minSampleShading;
	 }

// #Included setPSampleMask
	/**
	 * Set method for field pSampleMask	[int]<br>
	 * Prototype: const VkSampleMask*  pSampleMask
	 * 
	 * @param pSampleMask - a instance of int[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineMultisampleStateCreateInfo pSampleMask(int[] _pSampleMask){
	     int rsamples = rasterizationSamples().getValue();          
             int len = rsamples <= 32 ? 1 : 2;
             if(pSampleMask==null || pSampleMask.length != len)
                 pSampleMask = new int[len];
             System.arraycopy(_pSampleMask,0, this.pSampleMask, 0, len);
	     setPSampleMask0(this.ptr,  this.pSampleMask, len );
             return this;
	 }

//#END Set Included

// #Included getPSampleMask0
	/**
	 * Get method for field pSampleMask	[int]<br>
	 * Prototype: const VkSampleMask*  pSampleMask
	 */ 
	 public int[] pSampleMask(){
	        int rsamples = rasterizationSamples().getValue();	       
	        int len = rsamples <= 32 ? 1 : 2;
	        if(pSampleMask==null || pSampleMask.length != len)
                 pSampleMask = new int[len];
		 getPSampleMask0(super.ptr, pSampleMask, len);		 
		 return this.pSampleMask;
	 }

//#END get

	/**
	 * Set method for field alphaToCoverageEnable	[boolean]<br>
	 * Prototype: VkBool32  alphaToCoverageEnable
	 * 
	 * @param alphaToCoverageEnable - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineMultisampleStateCreateInfo alphaToCoverageEnable(boolean alphaToCoverageEnable){
		 this.alphaToCoverageEnable = alphaToCoverageEnable;
		 setAlphaToCoverageEnable0(this.ptr,  alphaToCoverageEnable);
		 return this;
	 }

	/**
	 * Get method for field alphaToCoverageEnable	[boolean]<br>
	 * Prototype: VkBool32  alphaToCoverageEnable
	 */ 
	 public boolean alphaToCoverageEnable(){
		 boolean var = getAlphaToCoverageEnable0(super.ptr);
		 this.alphaToCoverageEnable = var;
		 return this.alphaToCoverageEnable;
	 }

	/**
	 * Set method for field alphaToOneEnable	[boolean]<br>
	 * Prototype: VkBool32  alphaToOneEnable
	 * 
	 * @param alphaToOneEnable - a instance of boolean.
	 * @return this VkStruct instance.
	 */ 
	 public VkPipelineMultisampleStateCreateInfo alphaToOneEnable(boolean alphaToOneEnable){
		 this.alphaToOneEnable = alphaToOneEnable;
		 setAlphaToOneEnable0(this.ptr,  alphaToOneEnable);
		 return this;
	 }

	/**
	 * Get method for field alphaToOneEnable	[boolean]<br>
	 * Prototype: VkBool32  alphaToOneEnable
	 */ 
	 public boolean alphaToOneEnable(){
		 boolean var = getAlphaToOneEnable0(super.ptr);
		 this.alphaToOneEnable = var;
		 return this.alphaToOneEnable;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkPipelineMultisampleStateCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n rasterizationSamples: ")
				.append(rasterizationSamples() )
				.append(",\n sampleShadingEnable: ")
				.append(sampleShadingEnable() )
				.append(",\n minSampleShading: ")
				.append(minSampleShading() )
				.append(",\n pSampleMask: ")
				.append(Arrays.toString(pSampleMask()) )
				.append(",\n alphaToCoverageEnable: ")
				.append(alphaToCoverageEnable() )
				.append(",\n alphaToOneEnable: ")
				.append(alphaToOneEnable() )
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
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkPipelineMultisampleStateCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineMultisampleStateCreateFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkPipelineMultisampleStateCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field rasterizationSamples	[vkenum]<br>
	 * Prototype: VkSampleCountFlagBits  rasterizationSamples
	 */ 
	 private static native void setRasterizationSamples0(Buffer ptr, int  _rasterizationSamples);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->rasterizationSamples = (VkSampleCountFlagBits) (_rasterizationSamples);
	  */

	/**
	 * Native GET method for field rasterizationSamples	[vkenum]<br>
	 * Prototype: VkSampleCountFlagBits  rasterizationSamples
	 */ 
	 private static native int getRasterizationSamples0(Buffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->rasterizationSamples);
	 */

	/**
	 * Native SET method for field sampleShadingEnable	[boolean]<br>
	 * Prototype: VkBool32  sampleShadingEnable
	 */ 
	 private static native void setSampleShadingEnable0(Buffer ptr, boolean  _sampleShadingEnable);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sampleShadingEnable = (VkBool32) (_sampleShadingEnable);
	  */

	/**
	 * Native GET method for field sampleShadingEnable	[boolean]<br>
	 * Prototype: VkBool32  sampleShadingEnable
	 */ 
	 private static native boolean  getSampleShadingEnable0(Buffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->sampleShadingEnable);
	 */

	/**
	 * Native SET method for field minSampleShading	[float]<br>
	 * Prototype: float  minSampleShading
	 */ 
	 private static native void setMinSampleShading0(Buffer ptr, float _minSampleShading);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->minSampleShading = (float) (_minSampleShading);
	  */

	/**
	 * Native GET method for field minSampleShading	[float]<br>
	 * Prototype: float  minSampleShading
	 */ 
	 private static native float getMinSampleShading0(Buffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  return (jfloat) (vkObj->minSampleShading);
	 */

     
     /**
	 * Native SET method for field pSampleMask	[int]<br>
	 * Prototype: const VkSampleMask*  pSampleMask
	 */ 
	 private static native void setPSampleMask0(Buffer ptr, int[] _pSampleMask, int count);/*
		VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);  
		VkSampleMask* temp = const_cast<VkSampleMask*>(vkObj->pSampleMask); 
        // I must free it to avoid leaks
        if(temp) 
            free(temp);
        temp = CALLOC(count, VkSampleMask);
		memcpy( temp, _pSampleMask, count * sizeof(VkSampleMask));
        vkObj->pSampleMask = temp;
	  */
      
      
      

	 /**
	  * Native GET method for field pSampleMask      [int]<br>
	  * Prototype: const VkSampleMask*  pSampleMask
	  */ 
	  private static native void getPSampleMask0(Buffer ptr, int[] _pSampleMask, int count);/*
	          VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
	           // included code
	           memcpy( _pSampleMask, vkObj->pSampleMask, count * sizeof(VkSampleMask));
	   */

	/**
	 * Native SET method for field alphaToCoverageEnable	[boolean]<br>
	 * Prototype: VkBool32  alphaToCoverageEnable
	 */ 
	 private static native void setAlphaToCoverageEnable0(Buffer ptr, boolean  _alphaToCoverageEnable);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->alphaToCoverageEnable = (VkBool32) (_alphaToCoverageEnable);
	  */

	/**
	 * Native GET method for field alphaToCoverageEnable	[boolean]<br>
	 * Prototype: VkBool32  alphaToCoverageEnable
	 */ 
	 private static native boolean  getAlphaToCoverageEnable0(Buffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->alphaToCoverageEnable);
	 */

	/**
	 * Native SET method for field alphaToOneEnable	[boolean]<br>
	 * Prototype: VkBool32  alphaToOneEnable
	 */ 
	 private static native void setAlphaToOneEnable0(Buffer ptr, boolean  _alphaToOneEnable);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->alphaToOneEnable = (VkBool32) (_alphaToOneEnable);
	  */

	/**
	 * Native GET method for field alphaToOneEnable	[boolean]<br>
	 * Prototype: VkBool32  alphaToOneEnable
	 */ 
	 private static native boolean  getAlphaToOneEnable0(Buffer ptr);/*
		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->alphaToOneEnable);
	 */





} // end of class VkPipelineMultisampleStateCreateInfo
