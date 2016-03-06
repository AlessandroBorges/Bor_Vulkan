/**
 * Class wrapping Vulkan's VkAttachmentDescription struct.
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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkAttachmentDescription extends VkStruct {
	/** TAG of this structure [81]  */
	 private static final String TAG = "VkAttachmentDescription";

	/** ID of this structure [81]  */
	 public static final int TAG_ID = VKATTACHMENTDESCRIPTION_ID;

	 // fields //
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
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkAttachmentDescription(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkAttachmentDescription(long address, int memSize){ 
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
	 public static P<VkAttachmentDescription> createNullPointer(){
	        P<VkAttachmentDescription> p = new  P<VkAttachmentDescription>(new VkAttachmentDescription());
	        return p;
	    }

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field flags	[int]<br>
	 * Prototype: VkAttachmentDescriptionFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkAttachmentDescriptionFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 public void format(VkFormat format){
		 this.format = format;
		format0(super.ptr, format);
	 }

	/**
	 * get method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 public VkFormat format(){
		 // return  this.format;
		 return format0(super.ptr);
	 }

	/**
	 * Set method for field samples	[vkenum]<br>
	 * Prototype: VkSampleCountFlagBits  samples
	 */ 
	 public void samples(VkSampleCountFlagBits samples){
		 this.samples = samples;
		samples0(super.ptr, samples);
	 }

	/**
	 * get method for field samples	[vkenum]<br>
	 * Prototype: VkSampleCountFlagBits  samples
	 */ 
	 public VkSampleCountFlagBits samples(){
		 // return  this.samples;
		 return samples0(super.ptr);
	 }

	/**
	 * Set method for field loadOp	[vkenum]<br>
	 * Prototype: VkAttachmentLoadOp  loadOp
	 */ 
	 public void loadOp(VkAttachmentLoadOp loadOp){
		 this.loadOp = loadOp;
		loadOp0(super.ptr, loadOp);
	 }

	/**
	 * get method for field loadOp	[vkenum]<br>
	 * Prototype: VkAttachmentLoadOp  loadOp
	 */ 
	 public VkAttachmentLoadOp loadOp(){
		 // return  this.loadOp;
		 return loadOp0(super.ptr);
	 }

	/**
	 * Set method for field storeOp	[vkenum]<br>
	 * Prototype: VkAttachmentStoreOp  storeOp
	 */ 
	 public void storeOp(VkAttachmentStoreOp storeOp){
		 this.storeOp = storeOp;
		storeOp0(super.ptr, storeOp);
	 }

	/**
	 * get method for field storeOp	[vkenum]<br>
	 * Prototype: VkAttachmentStoreOp  storeOp
	 */ 
	 public VkAttachmentStoreOp storeOp(){
		 // return  this.storeOp;
		 return storeOp0(super.ptr);
	 }

	/**
	 * Set method for field stencilLoadOp	[vkenum]<br>
	 * Prototype: VkAttachmentLoadOp  stencilLoadOp
	 */ 
	 public void stencilLoadOp(VkAttachmentLoadOp stencilLoadOp){
		 this.stencilLoadOp = stencilLoadOp;
		stencilLoadOp0(super.ptr, stencilLoadOp);
	 }

	/**
	 * get method for field stencilLoadOp	[vkenum]<br>
	 * Prototype: VkAttachmentLoadOp  stencilLoadOp
	 */ 
	 public VkAttachmentLoadOp stencilLoadOp(){
		 // return  this.stencilLoadOp;
		 return stencilLoadOp0(super.ptr);
	 }

	/**
	 * Set method for field stencilStoreOp	[vkenum]<br>
	 * Prototype: VkAttachmentStoreOp  stencilStoreOp
	 */ 
	 public void stencilStoreOp(VkAttachmentStoreOp stencilStoreOp){
		 this.stencilStoreOp = stencilStoreOp;
		stencilStoreOp0(super.ptr, stencilStoreOp);
	 }

	/**
	 * get method for field stencilStoreOp	[vkenum]<br>
	 * Prototype: VkAttachmentStoreOp  stencilStoreOp
	 */ 
	 public VkAttachmentStoreOp stencilStoreOp(){
		 // return  this.stencilStoreOp;
		 return stencilStoreOp0(super.ptr);
	 }

	/**
	 * Set method for field initialLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  initialLayout
	 */ 
	 public void initialLayout(VkImageLayout initialLayout){
		 this.initialLayout = initialLayout;
		initialLayout0(super.ptr, initialLayout);
	 }

	/**
	 * get method for field initialLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  initialLayout
	 */ 
	 public VkImageLayout initialLayout(){
		 // return  this.initialLayout;
		 return initialLayout0(super.ptr);
	 }

	/**
	 * Set method for field finalLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  finalLayout
	 */ 
	 public void finalLayout(VkImageLayout finalLayout){
		 this.finalLayout = finalLayout;
		finalLayout0(super.ptr, finalLayout);
	 }

	/**
	 * get method for field finalLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  finalLayout
	 */ 
	 public VkImageLayout finalLayout(){
		 // return  this.finalLayout;
		 return finalLayout0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkAttachmentDescriptionFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkAttachmentDescription _obj = (VkAttachmentDescription)(*ptr);
		  _obj.flags = (VkAttachmentDescriptionFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkAttachmentDescriptionFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkAttachmentDescription _obj = (VkAttachmentDescription)(ptr);
		  return (jint) (_obj.VkAttachmentDescriptionFlags);
	 */

	/**
	 * native SET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native void format0(ByteBuffer ptr, VkFormat _format);/*
		  VkAttachmentDescription _obj = (VkAttachmentDescription)(*ptr);
		  _obj.format = (VkFormat) (_format);
	  */

	/**
	 * native GET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native VkFormat format0(ByteBuffer ptr);/*
		  VkAttachmentDescription _obj = (VkAttachmentDescription)(ptr);
		  return (VkFormat) (_obj.VkFormat);
	 */

	/**
	 * native SET method for field samples	[vkenum]<br>
	 * Prototype: VkSampleCountFlagBits  samples
	 */ 
	 private static native void samples0(ByteBuffer ptr, VkSampleCountFlagBits _samples);/*
		  VkAttachmentDescription _obj = (VkAttachmentDescription)(*ptr);
		  _obj.samples = (VkSampleCountFlagBits) (_samples);
	  */

	/**
	 * native GET method for field samples	[vkenum]<br>
	 * Prototype: VkSampleCountFlagBits  samples
	 */ 
	 private static native VkSampleCountFlagBits samples0(ByteBuffer ptr);/*
		  VkAttachmentDescription _obj = (VkAttachmentDescription)(ptr);
		  return (VkSampleCountFlagBits) (_obj.VkSampleCountFlagBits);
	 */

	/**
	 * native SET method for field loadOp	[vkenum]<br>
	 * Prototype: VkAttachmentLoadOp  loadOp
	 */ 
	 private static native void loadOp0(ByteBuffer ptr, VkAttachmentLoadOp _loadOp);/*
		  VkAttachmentDescription _obj = (VkAttachmentDescription)(*ptr);
		  _obj.loadOp = (VkAttachmentLoadOp) (_loadOp);
	  */

	/**
	 * native GET method for field loadOp	[vkenum]<br>
	 * Prototype: VkAttachmentLoadOp  loadOp
	 */ 
	 private static native VkAttachmentLoadOp loadOp0(ByteBuffer ptr);/*
		  VkAttachmentDescription _obj = (VkAttachmentDescription)(ptr);
		  return (VkAttachmentLoadOp) (_obj.VkAttachmentLoadOp);
	 */

	/**
	 * native SET method for field storeOp	[vkenum]<br>
	 * Prototype: VkAttachmentStoreOp  storeOp
	 */ 
	 private static native void storeOp0(ByteBuffer ptr, VkAttachmentStoreOp _storeOp);/*
		  VkAttachmentDescription _obj = (VkAttachmentDescription)(*ptr);
		  _obj.storeOp = (VkAttachmentStoreOp) (_storeOp);
	  */

	/**
	 * native GET method for field storeOp	[vkenum]<br>
	 * Prototype: VkAttachmentStoreOp  storeOp
	 */ 
	 private static native VkAttachmentStoreOp storeOp0(ByteBuffer ptr);/*
		  VkAttachmentDescription _obj = (VkAttachmentDescription)(ptr);
		  return (VkAttachmentStoreOp) (_obj.VkAttachmentStoreOp);
	 */

	/**
	 * native SET method for field stencilLoadOp	[vkenum]<br>
	 * Prototype: VkAttachmentLoadOp  stencilLoadOp
	 */ 
	 private static native void stencilLoadOp0(ByteBuffer ptr, VkAttachmentLoadOp _stencilLoadOp);/*
		  VkAttachmentDescription _obj = (VkAttachmentDescription)(*ptr);
		  _obj.stencilLoadOp = (VkAttachmentLoadOp) (_stencilLoadOp);
	  */

	/**
	 * native GET method for field stencilLoadOp	[vkenum]<br>
	 * Prototype: VkAttachmentLoadOp  stencilLoadOp
	 */ 
	 private static native VkAttachmentLoadOp stencilLoadOp0(ByteBuffer ptr);/*
		  VkAttachmentDescription _obj = (VkAttachmentDescription)(ptr);
		  return (VkAttachmentLoadOp) (_obj.VkAttachmentLoadOp);
	 */

	/**
	 * native SET method for field stencilStoreOp	[vkenum]<br>
	 * Prototype: VkAttachmentStoreOp  stencilStoreOp
	 */ 
	 private static native void stencilStoreOp0(ByteBuffer ptr, VkAttachmentStoreOp _stencilStoreOp);/*
		  VkAttachmentDescription _obj = (VkAttachmentDescription)(*ptr);
		  _obj.stencilStoreOp = (VkAttachmentStoreOp) (_stencilStoreOp);
	  */

	/**
	 * native GET method for field stencilStoreOp	[vkenum]<br>
	 * Prototype: VkAttachmentStoreOp  stencilStoreOp
	 */ 
	 private static native VkAttachmentStoreOp stencilStoreOp0(ByteBuffer ptr);/*
		  VkAttachmentDescription _obj = (VkAttachmentDescription)(ptr);
		  return (VkAttachmentStoreOp) (_obj.VkAttachmentStoreOp);
	 */

	/**
	 * native SET method for field initialLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  initialLayout
	 */ 
	 private static native void initialLayout0(ByteBuffer ptr, VkImageLayout _initialLayout);/*
		  VkAttachmentDescription _obj = (VkAttachmentDescription)(*ptr);
		  _obj.initialLayout = (VkImageLayout) (_initialLayout);
	  */

	/**
	 * native GET method for field initialLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  initialLayout
	 */ 
	 private static native VkImageLayout initialLayout0(ByteBuffer ptr);/*
		  VkAttachmentDescription _obj = (VkAttachmentDescription)(ptr);
		  return (VkImageLayout) (_obj.VkImageLayout);
	 */

	/**
	 * native SET method for field finalLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  finalLayout
	 */ 
	 private static native void finalLayout0(ByteBuffer ptr, VkImageLayout _finalLayout);/*
		  VkAttachmentDescription _obj = (VkAttachmentDescription)(*ptr);
		  _obj.finalLayout = (VkImageLayout) (_finalLayout);
	  */

	/**
	 * native GET method for field finalLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  finalLayout
	 */ 
	 private static native VkImageLayout finalLayout0(ByteBuffer ptr);/*
		  VkAttachmentDescription _obj = (VkAttachmentDescription)(ptr);
		  return (VkImageLayout) (_obj.VkImageLayout);
	 */



} // end of class VkAttachmentDescription
