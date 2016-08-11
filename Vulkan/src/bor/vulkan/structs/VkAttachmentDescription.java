/**
 * Class wrapping Vulkan's VkAttachmentDescription struct.
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
 *  This class is a Java front end for struct VkAttachmentDescription. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkAttachmentDescription {
 *     VkAttachmentDescriptionFlags    flags;
 *     VkFormat                        format;
 *     VkSampleCountFlagBits           samples;
 *     VkAttachmentLoadOp              loadOp;
 *     VkAttachmentStoreOp             storeOp;
 *     VkAttachmentLoadOp              stencilLoadOp;
 *     VkAttachmentStoreOp             stencilStoreOp;
 *     VkImageLayout                   initialLayout;
 *     VkImageLayout                   finalLayout;
 * } VkAttachmentDescription;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkAttachmentDescription extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [81]  */
	 private static final String TAG = "VkAttachmentDescription";

	/** ID of this structure [81]  */
	 public static final int TAG_ID = VKATTACHMENTDESCRIPTION_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkAttachmentDescriptionFlags 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  VkFormat 	format	[vkenum]
	 */ 
	VkFormat 	format;
	
	/**
	 *  VkSampleCountFlagBits 	samples	[vkenum]
	 */ 
	VkSampleCountFlagBits 	samples;
	
	/**
	 *  VkAttachmentLoadOp 	loadOp	[vkenum]
	 */ 
	VkAttachmentLoadOp 	loadOp;
	
	/**
	 *  VkAttachmentStoreOp 	storeOp	[vkenum]
	 */ 
	VkAttachmentStoreOp 	storeOp;
	
	/**
	 *  VkAttachmentLoadOp 	stencilLoadOp	[vkenum]
	 */ 
	VkAttachmentLoadOp 	stencilLoadOp;
	
	/**
	 *  VkAttachmentStoreOp 	stencilStoreOp	[vkenum]
	 */ 
	VkAttachmentStoreOp 	stencilStoreOp;
	
	/**
	 *  VkImageLayout 	initialLayout	[vkenum]
	 */ 
	VkImageLayout 	initialLayout;
	
	/**
	 *  VkImageLayout 	finalLayout	[vkenum]
	 */ 
	VkImageLayout 	finalLayout;
	/**
	 * Ctor
	 */
	public VkAttachmentDescription(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkAttachmentDescription(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkAttachmentDescription(long address){ 
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
	 * Set method for field flags	[int]<br>
	 * Prototype: VkAttachmentDescriptionFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkAttachmentDescription flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkAttachmentDescriptionFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 * 
	 * @param format - a instance of VkFormat.
	 * @return this VkStruct instance.
	 */ 
	 public VkAttachmentDescription format(VkFormat format){
		 this.format = format;
		 int enumVal = format.getValue();
		 setFormat0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 public VkFormat format(){
		 int nativeVal = getFormat0(super.ptr);
		 this.format = VkFormat.fromValue(nativeVal); 
		 return this.format;
	 }

	/**
	 * Set method for field samples	[vkenum]<br>
	 * Prototype: VkSampleCountFlagBits  samples
	 * 
	 * @param samples - a instance of VkSampleCountFlagBits.
	 * @return this VkStruct instance.
	 */ 
	 public VkAttachmentDescription samples(VkSampleCountFlagBits samples){
		 this.samples = samples;
		 int enumVal = samples.getValue();
		 setSamples0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field samples	[vkenum]<br>
	 * Prototype: VkSampleCountFlagBits  samples
	 */ 
	 public VkSampleCountFlagBits samples(){
		 int nativeVal = getSamples0(super.ptr);
		 this.samples = VkSampleCountFlagBits.fromValue(nativeVal); 
		 return this.samples;
	 }

	/**
	 * Set method for field loadOp	[vkenum]<br>
	 * Prototype: VkAttachmentLoadOp  loadOp
	 * 
	 * @param loadOp - a instance of VkAttachmentLoadOp.
	 * @return this VkStruct instance.
	 */ 
	 public VkAttachmentDescription loadOp(VkAttachmentLoadOp loadOp){
		 this.loadOp = loadOp;
		 int enumVal = loadOp.getValue();
		 setLoadOp0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field loadOp	[vkenum]<br>
	 * Prototype: VkAttachmentLoadOp  loadOp
	 */ 
	 public VkAttachmentLoadOp loadOp(){
		 int nativeVal = getLoadOp0(super.ptr);
		 this.loadOp = VkAttachmentLoadOp.fromValue(nativeVal); 
		 return this.loadOp;
	 }

	/**
	 * Set method for field storeOp	[vkenum]<br>
	 * Prototype: VkAttachmentStoreOp  storeOp
	 * 
	 * @param storeOp - a instance of VkAttachmentStoreOp.
	 * @return this VkStruct instance.
	 */ 
	 public VkAttachmentDescription storeOp(VkAttachmentStoreOp storeOp){
		 this.storeOp = storeOp;
		 int enumVal = storeOp.getValue();
		 setStoreOp0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field storeOp	[vkenum]<br>
	 * Prototype: VkAttachmentStoreOp  storeOp
	 */ 
	 public VkAttachmentStoreOp storeOp(){
		 int nativeVal = getStoreOp0(super.ptr);
		 this.storeOp = VkAttachmentStoreOp.fromValue(nativeVal); 
		 return this.storeOp;
	 }

	/**
	 * Set method for field stencilLoadOp	[vkenum]<br>
	 * Prototype: VkAttachmentLoadOp  stencilLoadOp
	 * 
	 * @param stencilLoadOp - a instance of VkAttachmentLoadOp.
	 * @return this VkStruct instance.
	 */ 
	 public VkAttachmentDescription stencilLoadOp(VkAttachmentLoadOp stencilLoadOp){
		 this.stencilLoadOp = stencilLoadOp;
		 int enumVal = stencilLoadOp.getValue();
		 setStencilLoadOp0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field stencilLoadOp	[vkenum]<br>
	 * Prototype: VkAttachmentLoadOp  stencilLoadOp
	 */ 
	 public VkAttachmentLoadOp stencilLoadOp(){
		 int nativeVal = getStencilLoadOp0(super.ptr);
		 this.stencilLoadOp = VkAttachmentLoadOp.fromValue(nativeVal); 
		 return this.stencilLoadOp;
	 }

	/**
	 * Set method for field stencilStoreOp	[vkenum]<br>
	 * Prototype: VkAttachmentStoreOp  stencilStoreOp
	 * 
	 * @param stencilStoreOp - a instance of VkAttachmentStoreOp.
	 * @return this VkStruct instance.
	 */ 
	 public VkAttachmentDescription stencilStoreOp(VkAttachmentStoreOp stencilStoreOp){
		 this.stencilStoreOp = stencilStoreOp;
		 int enumVal = stencilStoreOp.getValue();
		 setStencilStoreOp0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field stencilStoreOp	[vkenum]<br>
	 * Prototype: VkAttachmentStoreOp  stencilStoreOp
	 */ 
	 public VkAttachmentStoreOp stencilStoreOp(){
		 int nativeVal = getStencilStoreOp0(super.ptr);
		 this.stencilStoreOp = VkAttachmentStoreOp.fromValue(nativeVal); 
		 return this.stencilStoreOp;
	 }

	/**
	 * Set method for field initialLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  initialLayout
	 * 
	 * @param initialLayout - a instance of VkImageLayout.
	 * @return this VkStruct instance.
	 */ 
	 public VkAttachmentDescription initialLayout(VkImageLayout initialLayout){
		 this.initialLayout = initialLayout;
		 int enumVal = initialLayout.getValue();
		 setInitialLayout0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field initialLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  initialLayout
	 */ 
	 public VkImageLayout initialLayout(){
		 int nativeVal = getInitialLayout0(super.ptr);
		 this.initialLayout = VkImageLayout.fromValue(nativeVal); 
		 return this.initialLayout;
	 }

	/**
	 * Set method for field finalLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  finalLayout
	 * 
	 * @param finalLayout - a instance of VkImageLayout.
	 * @return this VkStruct instance.
	 */ 
	 public VkAttachmentDescription finalLayout(VkImageLayout finalLayout){
		 this.finalLayout = finalLayout;
		 int enumVal = finalLayout.getValue();
		 setFinalLayout0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field finalLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  finalLayout
	 */ 
	 public VkImageLayout finalLayout(){
		 int nativeVal = getFinalLayout0(super.ptr);
		 this.finalLayout = VkImageLayout.fromValue(nativeVal); 
		 return this.finalLayout;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkAttachmentDescription [ ")
				.append("flags: ").append(flags() )
				.append(",\n format: ")
				.append(format() )
				.append(",\n samples: ")
				.append(samples() )
				.append(",\n loadOp: ")
				.append(loadOp() )
				.append(",\n storeOp: ")
				.append(storeOp() )
				.append(",\n stencilLoadOp: ")
				.append(stencilLoadOp() )
				.append(",\n stencilStoreOp: ")
				.append(stencilStoreOp() )
				.append(",\n initialLayout: ")
				.append(initialLayout() )
				.append(",\n finalLayout: ")
				.append(finalLayout() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkAttachmentDescriptionFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkAttachmentDescriptionFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkAttachmentDescriptionFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native void setFormat0(Buffer ptr, int  _format);/*
		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		 // code for simple past value 
		  vkObj->format = (VkFormat) (_format);
	  */

	/**
	 * Native GET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native int  getFormat0(Buffer ptr);/*
		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		  return (VkFormat) (vkObj->format);
	 */

	/**
	 * Native SET method for field samples	[vkenum]<br>
	 * Prototype: VkSampleCountFlagBits  samples
	 */ 
	 private static native void setSamples0(Buffer ptr, int  _samples);/*
		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		 // code for simple past value 
		  vkObj->samples = (VkSampleCountFlagBits) (_samples);
	  */

	/**
	 * Native GET method for field samples	[vkenum]<br>
	 * Prototype: VkSampleCountFlagBits  samples
	 */ 
	 private static native int  getSamples0(Buffer ptr);/*
		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		  return (VkSampleCountFlagBits) (vkObj->samples);
	 */

	/**
	 * Native SET method for field loadOp	[vkenum]<br>
	 * Prototype: VkAttachmentLoadOp  loadOp
	 */ 
	 private static native void setLoadOp0(Buffer ptr, int  _loadOp);/*
		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		 // code for simple past value 
		  vkObj->loadOp = (VkAttachmentLoadOp) (_loadOp);
	  */

	/**
	 * Native GET method for field loadOp	[vkenum]<br>
	 * Prototype: VkAttachmentLoadOp  loadOp
	 */ 
	 private static native int  getLoadOp0(Buffer ptr);/*
		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		  return (VkAttachmentLoadOp) (vkObj->loadOp);
	 */

	/**
	 * Native SET method for field storeOp	[vkenum]<br>
	 * Prototype: VkAttachmentStoreOp  storeOp
	 */ 
	 private static native void setStoreOp0(Buffer ptr, int  _storeOp);/*
		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		 // code for simple past value 
		  vkObj->storeOp = (VkAttachmentStoreOp) (_storeOp);
	  */

	/**
	 * Native GET method for field storeOp	[vkenum]<br>
	 * Prototype: VkAttachmentStoreOp  storeOp
	 */ 
	 private static native int  getStoreOp0(Buffer ptr);/*
		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		  return (VkAttachmentStoreOp) (vkObj->storeOp);
	 */

	/**
	 * Native SET method for field stencilLoadOp	[vkenum]<br>
	 * Prototype: VkAttachmentLoadOp  stencilLoadOp
	 */ 
	 private static native void setStencilLoadOp0(Buffer ptr, int  _stencilLoadOp);/*
		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		 // code for simple past value 
		  vkObj->stencilLoadOp = (VkAttachmentLoadOp) (_stencilLoadOp);
	  */

	/**
	 * Native GET method for field stencilLoadOp	[vkenum]<br>
	 * Prototype: VkAttachmentLoadOp  stencilLoadOp
	 */ 
	 private static native int  getStencilLoadOp0(Buffer ptr);/*
		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		  return (VkAttachmentLoadOp) (vkObj->stencilLoadOp);
	 */

	/**
	 * Native SET method for field stencilStoreOp	[vkenum]<br>
	 * Prototype: VkAttachmentStoreOp  stencilStoreOp
	 */ 
	 private static native void setStencilStoreOp0(Buffer ptr, int  _stencilStoreOp);/*
		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		 // code for simple past value 
		  vkObj->stencilStoreOp = (VkAttachmentStoreOp) (_stencilStoreOp);
	  */

	/**
	 * Native GET method for field stencilStoreOp	[vkenum]<br>
	 * Prototype: VkAttachmentStoreOp  stencilStoreOp
	 */ 
	 private static native int  getStencilStoreOp0(Buffer ptr);/*
		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		  return (VkAttachmentStoreOp) (vkObj->stencilStoreOp);
	 */

	/**
	 * Native SET method for field initialLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  initialLayout
	 */ 
	 private static native void setInitialLayout0(Buffer ptr, int  _initialLayout);/*
		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		 // code for simple past value 
		  vkObj->initialLayout = (VkImageLayout) (_initialLayout);
	  */

	/**
	 * Native GET method for field initialLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  initialLayout
	 */ 
	 private static native int  getInitialLayout0(Buffer ptr);/*
		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		  return (VkImageLayout) (vkObj->initialLayout);
	 */

	/**
	 * Native SET method for field finalLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  finalLayout
	 */ 
	 private static native void setFinalLayout0(Buffer ptr, int  _finalLayout);/*
		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		 // code for simple past value 
		  vkObj->finalLayout = (VkImageLayout) (_finalLayout);
	  */

	/**
	 * Native GET method for field finalLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  finalLayout
	 */ 
	 private static native int  getFinalLayout0(Buffer ptr);/*
		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		  return (VkImageLayout) (vkObj->finalLayout);
	 */



} // end of class VkAttachmentDescription
