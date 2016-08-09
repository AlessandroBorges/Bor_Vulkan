/**
 * Class wrapping Vulkan's VkPhysicalDeviceMemoryProperties struct.
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
 *  This class is a Java front end for struct VkPhysicalDeviceMemoryProperties. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPhysicalDeviceMemoryProperties {
 *     uint32_t        memoryTypeCount;
 *     VkMemoryType    memoryTypes[VK_MAX_MEMORY_TYPES];
 *     uint32_t        memoryHeapCount;
 *     VkMemoryHeap    memoryHeaps[VK_MAX_MEMORY_HEAPS];
 * } VkPhysicalDeviceMemoryProperties;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkPhysicalDeviceMemoryProperties extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [14]  */
	 private static final String TAG = "VkPhysicalDeviceMemoryProperties";

	/** ID of this structure [14]  */
	 public static final int TAG_ID = VKPHYSICALDEVICEMEMORYPROPERTIES_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  uint32_t 	memoryTypeCount	[int]
	 */ 
	int 	memoryTypeCount;
	
	/**
	 *  VkMemoryType[] 	memoryTypes	[vkstruct_array_array [VK_MAX_MEMORY_TYPES] ]
	 */ 
	VkMemoryType[] 	memoryTypes = new VkMemoryType[VK_MAX_MEMORY_TYPES];
	 private BigBuffer 	 memoryTypesBUFFER;
	
	/**
	 *  uint32_t 	memoryHeapCount	[int]
	 */ 
	int 	memoryHeapCount;
	
	/**
	 *  VkMemoryHeap[] 	memoryHeaps	[vkstruct_array_array [VK_MAX_MEMORY_HEAPS] ]
	 */ 
	VkMemoryHeap[] 	memoryHeaps = new VkMemoryHeap[VK_MAX_MEMORY_HEAPS];
	 private BigBuffer 	 memoryHeapsBUFFER;
	/**
	 * Ctor
	 */
	public VkPhysicalDeviceMemoryProperties(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPhysicalDeviceMemoryProperties(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPhysicalDeviceMemoryProperties(long address){ 
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
	 * Set method for field memoryTypeCount	[int]<br>
	 * Prototype: uint32_t  memoryTypeCount
	 * 
	 * @param memoryTypeCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceMemoryProperties memoryTypeCount(int memoryTypeCount){
		 this.memoryTypeCount = memoryTypeCount;
		 setMemoryTypeCount0(this.ptr,  memoryTypeCount);
		 return this;
	 }

	/**
	 * Get method for field memoryTypeCount	[int]<br>
	 * Prototype: uint32_t  memoryTypeCount
	 */ 
	 public int memoryTypeCount(){
		 int var = getMemoryTypeCount0(super.ptr);
		 this.memoryTypeCount = var;
		 return this.memoryTypeCount;
	 }

	/**
	 * Set method for field memoryTypes	[vkstruct_array]<br>
	 * Prototype: VkMemoryType[]  memoryTypes
	 * 
	 * @param memoryTypes - a instance of VkMemoryType[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceMemoryProperties memoryTypes(VkMemoryType[] memoryTypes){
		 this.memoryTypesBUFFER = new BigBuffer(memoryTypes, VkMemoryType.getID());
		 setMemoryTypes0(this.ptr, memoryTypesBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field memoryTypes	[vkstruct_array]<br>
	 * Prototype: VkMemoryType[]  memoryTypes
	 */ 
	 public VkMemoryType[] memoryTypes(){
		 long ptr = getMemoryTypes0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(memoryTypesBUFFER != null && ptr == memoryTypesBUFFER.getBufferAddress()){ //same buffer 
		    memoryTypesBUFFER.update();
		    return memoryTypes;
		  }else{
		     (new UnsupportedOperationException("There is no VKStruct[] for backup.")).printStackTrace();
		   }
		 return this.memoryTypes;
	 }

	/**
	 * Set method for field memoryHeapCount	[int]<br>
	 * Prototype: uint32_t  memoryHeapCount
	 * 
	 * @param memoryHeapCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceMemoryProperties memoryHeapCount(int memoryHeapCount){
		 this.memoryHeapCount = memoryHeapCount;
		 setMemoryHeapCount0(this.ptr,  memoryHeapCount);
		 return this;
	 }

	/**
	 * Get method for field memoryHeapCount	[int]<br>
	 * Prototype: uint32_t  memoryHeapCount
	 */ 
	 public int memoryHeapCount(){
		 int var = getMemoryHeapCount0(super.ptr);
		 this.memoryHeapCount = var;
		 return this.memoryHeapCount;
	 }

	/**
	 * Set method for field memoryHeaps	[vkstruct_array]<br>
	 * Prototype: VkMemoryHeap[]  memoryHeaps
	 * 
	 * @param memoryHeaps - a instance of VkMemoryHeap[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceMemoryProperties memoryHeaps(VkMemoryHeap[] memoryHeaps){
		 this.memoryHeapsBUFFER = new BigBuffer(memoryHeaps, VkMemoryHeap.getID());
		 setMemoryHeaps0(this.ptr, memoryHeapsBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field memoryHeaps	[vkstruct_array]<br>
	 * Prototype: VkMemoryHeap[]  memoryHeaps
	 */ 
	 public VkMemoryHeap[] memoryHeaps(){
		 long ptr = getMemoryHeaps0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(memoryHeapsBUFFER != null && ptr == memoryHeapsBUFFER.getBufferAddress()){ //same buffer 
		    memoryHeapsBUFFER.update();
		    return memoryHeaps;
		  }else{
		     (new UnsupportedOperationException("There is no VKStruct[] for backup.")).printStackTrace();
		   }
		 return this.memoryHeaps;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkPhysicalDeviceMemoryProperties [ ")
				.append("memoryTypeCount: ").append(memoryTypeCount() )
				.append(",\n memoryTypes: ")
				.append(Arrays.toString(memoryTypes()) )
				.append(",\n memoryHeapCount: ")
				.append(memoryHeapCount() )
				.append(",\n memoryHeaps: ")
				.append(Arrays.toString(memoryHeaps()) )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field memoryTypeCount	[int]<br>
	 * Prototype: uint32_t  memoryTypeCount
	 */ 
	 private static native void setMemoryTypeCount0(Buffer ptr, int _memoryTypeCount);/*
		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  vkObj->memoryTypeCount = (uint32_t) (_memoryTypeCount);
	  */

	/**
	 * Native GET method for field memoryTypeCount	[int]<br>
	 * Prototype: uint32_t  memoryTypeCount
	 */ 
	 private static native int getMemoryTypeCount0(Buffer ptr);/*
		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  return (jint) (vkObj->memoryTypeCount);
	 */

	/**
	 * Native SET method for field memoryTypes	[vkstruct_array]<br>
	 * Prototype: VkMemoryType[]  memoryTypes
	 */ 
	 private static native void setMemoryTypes0(Buffer ptr, java.nio.ByteBuffer  _memoryTypes);/*
		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  memcpy(&(vkObj->memoryTypes), &_memoryTypes, VK_MAX_MEMORY_TYPES * sizeof(VkMemoryType));
	  */

	/**
	 * Native GET method for field memoryTypes	[vkstruct_array]<br>
	 * Prototype: VkMemoryType[]  memoryTypes
	 */ 
	 private static native long getMemoryTypes0(Buffer ptr);/*
		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->memoryTypes);
	 */

	/**
	 * Native SET method for field memoryHeapCount	[int]<br>
	 * Prototype: uint32_t  memoryHeapCount
	 */ 
	 private static native void setMemoryHeapCount0(Buffer ptr, int _memoryHeapCount);/*
		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  vkObj->memoryHeapCount = (uint32_t) (_memoryHeapCount);
	  */

	/**
	 * Native GET method for field memoryHeapCount	[int]<br>
	 * Prototype: uint32_t  memoryHeapCount
	 */ 
	 private static native int getMemoryHeapCount0(Buffer ptr);/*
		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  return (jint) (vkObj->memoryHeapCount);
	 */

	/**
	 * Native SET method for field memoryHeaps	[vkstruct_array]<br>
	 * Prototype: VkMemoryHeap[]  memoryHeaps
	 */ 
	 private static native void setMemoryHeaps0(Buffer ptr, java.nio.ByteBuffer  _memoryHeaps);/*
		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  memcpy(&(vkObj->memoryHeaps), &_memoryHeaps, VK_MAX_MEMORY_HEAPS * sizeof(VkMemoryHeap));
	  */

	/**
	 * Native GET method for field memoryHeaps	[vkstruct_array]<br>
	 * Prototype: VkMemoryHeap[]  memoryHeaps
	 */ 
	 private static native long getMemoryHeaps0(Buffer ptr);/*
		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->memoryHeaps);
	 */



} // end of class VkPhysicalDeviceMemoryProperties
