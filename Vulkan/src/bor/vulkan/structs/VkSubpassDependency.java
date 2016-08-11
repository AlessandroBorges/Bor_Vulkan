/**
 * Class wrapping Vulkan's VkSubpassDependency struct.
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
 *  This class is a Java front end for struct VkSubpassDependency. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSubpassDependency {
 *     uint32_t                srcSubpass;
 *     uint32_t                dstSubpass;
 *     VkPipelineStageFlags    srcStageMask;
 *     VkPipelineStageFlags    dstStageMask;
 *     VkAccessFlags           srcAccessMask;
 *     VkAccessFlags           dstAccessMask;
 *     VkDependencyFlags       dependencyFlags;
 * } VkSubpassDependency;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkSubpassDependency extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [84]  */
	 private static final String TAG = "VkSubpassDependency";

	/** ID of this structure [84]  */
	 public static final int TAG_ID = VKSUBPASSDEPENDENCY_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  uint32_t 	srcSubpass	[int]
	 */ 
	int 	srcSubpass;
	
	/**
	 *  uint32_t 	dstSubpass	[int]
	 */ 
	int 	dstSubpass;
	
	/**
	 *  VkPipelineStageFlags 	srcStageMask	[int]
	 */ 
	int 	srcStageMask;
	
	/**
	 *  VkPipelineStageFlags 	dstStageMask	[int]
	 */ 
	int 	dstStageMask;
	
	/**
	 *  VkAccessFlags 	srcAccessMask	[int]
	 */ 
	int 	srcAccessMask;
	
	/**
	 *  VkAccessFlags 	dstAccessMask	[int]
	 */ 
	int 	dstAccessMask;
	
	/**
	 *  VkDependencyFlags 	dependencyFlags	[int]
	 */ 
	int 	dependencyFlags;
	/**
	 * Ctor
	 */
	public VkSubpassDependency(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSubpassDependency(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkSubpassDependency(long address){ 
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
	 * Set method for field srcSubpass	[int]<br>
	 * Prototype: uint32_t  srcSubpass
	 * 
	 * @param srcSubpass - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSubpassDependency srcSubpass(int srcSubpass){
		 this.srcSubpass = srcSubpass;
		 setSrcSubpass0(this.ptr,  srcSubpass);
		 return this;
	 }

	/**
	 * Get method for field srcSubpass	[int]<br>
	 * Prototype: uint32_t  srcSubpass
	 */ 
	 public int srcSubpass(){
		 int var = getSrcSubpass0(super.ptr);
		 this.srcSubpass = var;
		 return this.srcSubpass;
	 }

	/**
	 * Set method for field dstSubpass	[int]<br>
	 * Prototype: uint32_t  dstSubpass
	 * 
	 * @param dstSubpass - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSubpassDependency dstSubpass(int dstSubpass){
		 this.dstSubpass = dstSubpass;
		 setDstSubpass0(this.ptr,  dstSubpass);
		 return this;
	 }

	/**
	 * Get method for field dstSubpass	[int]<br>
	 * Prototype: uint32_t  dstSubpass
	 */ 
	 public int dstSubpass(){
		 int var = getDstSubpass0(super.ptr);
		 this.dstSubpass = var;
		 return this.dstSubpass;
	 }

	/**
	 * Set method for field srcStageMask	[int]<br>
	 * Prototype: VkPipelineStageFlags  srcStageMask
	 * 
	 * @param srcStageMask - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSubpassDependency srcStageMask(int srcStageMask){
		 this.srcStageMask = srcStageMask;
		 setSrcStageMask0(this.ptr,  srcStageMask);
		 return this;
	 }

	/**
	 * Get method for field srcStageMask	[int]<br>
	 * Prototype: VkPipelineStageFlags  srcStageMask
	 */ 
	 public int srcStageMask(){
		 int var = getSrcStageMask0(super.ptr);
		 this.srcStageMask = var;
		 return this.srcStageMask;
	 }

	/**
	 * Set method for field dstStageMask	[int]<br>
	 * Prototype: VkPipelineStageFlags  dstStageMask
	 * 
	 * @param dstStageMask - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSubpassDependency dstStageMask(int dstStageMask){
		 this.dstStageMask = dstStageMask;
		 setDstStageMask0(this.ptr,  dstStageMask);
		 return this;
	 }

	/**
	 * Get method for field dstStageMask	[int]<br>
	 * Prototype: VkPipelineStageFlags  dstStageMask
	 */ 
	 public int dstStageMask(){
		 int var = getDstStageMask0(super.ptr);
		 this.dstStageMask = var;
		 return this.dstStageMask;
	 }

	/**
	 * Set method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 * 
	 * @param srcAccessMask - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSubpassDependency srcAccessMask(int srcAccessMask){
		 this.srcAccessMask = srcAccessMask;
		 setSrcAccessMask0(this.ptr,  srcAccessMask);
		 return this;
	 }

	/**
	 * Get method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 public int srcAccessMask(){
		 int var = getSrcAccessMask0(super.ptr);
		 this.srcAccessMask = var;
		 return this.srcAccessMask;
	 }

	/**
	 * Set method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 * 
	 * @param dstAccessMask - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSubpassDependency dstAccessMask(int dstAccessMask){
		 this.dstAccessMask = dstAccessMask;
		 setDstAccessMask0(this.ptr,  dstAccessMask);
		 return this;
	 }

	/**
	 * Get method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 public int dstAccessMask(){
		 int var = getDstAccessMask0(super.ptr);
		 this.dstAccessMask = var;
		 return this.dstAccessMask;
	 }

	/**
	 * Set method for field dependencyFlags	[int]<br>
	 * Prototype: VkDependencyFlags  dependencyFlags
	 * 
	 * @param dependencyFlags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSubpassDependency dependencyFlags(int dependencyFlags){
		 this.dependencyFlags = dependencyFlags;
		 setDependencyFlags0(this.ptr,  dependencyFlags);
		 return this;
	 }

	/**
	 * Get method for field dependencyFlags	[int]<br>
	 * Prototype: VkDependencyFlags  dependencyFlags
	 */ 
	 public int dependencyFlags(){
		 int var = getDependencyFlags0(super.ptr);
		 this.dependencyFlags = var;
		 return this.dependencyFlags;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkSubpassDependency [ ")
				.append("srcSubpass: ").append(srcSubpass() )
				.append(",\n dstSubpass: ")
				.append(dstSubpass() )
				.append(",\n srcStageMask: ")
				.append(srcStageMask() )
				.append(",\n dstStageMask: ")
				.append(dstStageMask() )
				.append(",\n srcAccessMask: ")
				.append(srcAccessMask() )
				.append(",\n dstAccessMask: ")
				.append(dstAccessMask() )
				.append(",\n dependencyFlags: ")
				.append(dependencyFlags() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field srcSubpass	[int]<br>
	 * Prototype: uint32_t  srcSubpass
	 */ 
	 private static native void setSrcSubpass0(Buffer ptr, int _srcSubpass);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		 // code for simple past value 
		  vkObj->srcSubpass = (uint32_t) (_srcSubpass);
	  */

	/**
	 * Native GET method for field srcSubpass	[int]<br>
	 * Prototype: uint32_t  srcSubpass
	 */ 
	 private static native int getSrcSubpass0(Buffer ptr);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  return (jint) (vkObj->srcSubpass);
	 */

	/**
	 * Native SET method for field dstSubpass	[int]<br>
	 * Prototype: uint32_t  dstSubpass
	 */ 
	 private static native void setDstSubpass0(Buffer ptr, int _dstSubpass);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		 // code for simple past value 
		  vkObj->dstSubpass = (uint32_t) (_dstSubpass);
	  */

	/**
	 * Native GET method for field dstSubpass	[int]<br>
	 * Prototype: uint32_t  dstSubpass
	 */ 
	 private static native int getDstSubpass0(Buffer ptr);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  return (jint) (vkObj->dstSubpass);
	 */

	/**
	 * Native SET method for field srcStageMask	[int]<br>
	 * Prototype: VkPipelineStageFlags  srcStageMask
	 */ 
	 private static native void setSrcStageMask0(Buffer ptr, int _srcStageMask);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		 // code for simple past value 
		  vkObj->srcStageMask = (VkPipelineStageFlags) (_srcStageMask);
	  */

	/**
	 * Native GET method for field srcStageMask	[int]<br>
	 * Prototype: VkPipelineStageFlags  srcStageMask
	 */ 
	 private static native int getSrcStageMask0(Buffer ptr);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  return (jint) (vkObj->srcStageMask);
	 */

	/**
	 * Native SET method for field dstStageMask	[int]<br>
	 * Prototype: VkPipelineStageFlags  dstStageMask
	 */ 
	 private static native void setDstStageMask0(Buffer ptr, int _dstStageMask);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		 // code for simple past value 
		  vkObj->dstStageMask = (VkPipelineStageFlags) (_dstStageMask);
	  */

	/**
	 * Native GET method for field dstStageMask	[int]<br>
	 * Prototype: VkPipelineStageFlags  dstStageMask
	 */ 
	 private static native int getDstStageMask0(Buffer ptr);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  return (jint) (vkObj->dstStageMask);
	 */

	/**
	 * Native SET method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 private static native void setSrcAccessMask0(Buffer ptr, int _srcAccessMask);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		 // code for simple past value 
		  vkObj->srcAccessMask = (VkAccessFlags) (_srcAccessMask);
	  */

	/**
	 * Native GET method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 private static native int getSrcAccessMask0(Buffer ptr);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  return (jint) (vkObj->srcAccessMask);
	 */

	/**
	 * Native SET method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 private static native void setDstAccessMask0(Buffer ptr, int _dstAccessMask);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		 // code for simple past value 
		  vkObj->dstAccessMask = (VkAccessFlags) (_dstAccessMask);
	  */

	/**
	 * Native GET method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 private static native int getDstAccessMask0(Buffer ptr);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  return (jint) (vkObj->dstAccessMask);
	 */

	/**
	 * Native SET method for field dependencyFlags	[int]<br>
	 * Prototype: VkDependencyFlags  dependencyFlags
	 */ 
	 private static native void setDependencyFlags0(Buffer ptr, int _dependencyFlags);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		 // code for simple past value 
		  vkObj->dependencyFlags = (VkDependencyFlags) (_dependencyFlags);
	  */

	/**
	 * Native GET method for field dependencyFlags	[int]<br>
	 * Prototype: VkDependencyFlags  dependencyFlags
	 */ 
	 private static native int getDependencyFlags0(Buffer ptr);/*
		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  return (jint) (vkObj->dependencyFlags);
	 */



} // end of class VkSubpassDependency
