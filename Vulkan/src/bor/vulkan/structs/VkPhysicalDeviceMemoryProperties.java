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

	/** 
	 * Static method to create a VkArray for this VkStruct subclass.
	 * @param size - number of elements
	 */
	 public static VkArray<VkPhysicalDeviceMemoryProperties> createVkArray(int size){ 
		 VkPhysicalDeviceMemoryProperties[] array = new VkPhysicalDeviceMemoryProperties[size]; 
		 VkArrayStruct<VkPhysicalDeviceMemoryProperties> vkArray = new VkArrayStruct<VkPhysicalDeviceMemoryProperties>(array, TAG_ID);
		 return vkArray; 
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

// #Included setMemoryTypes

	/**
	 * Set method for field memoryTypes	[vkstruct_array]<br>
	 * Prototype: VkMemoryType[]  memoryTypes
	 * 
	 * @param _memoryTypes - a instance of VkMemoryType[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceMemoryProperties memoryTypes(VkMemoryType[] _memoryTypes){
	     if(_memoryTypes == null ){
                 throw new IllegalArgumentException("VkMemoryType[] _memoryTypes must be"
                         + " not null");
             }
             if(memoryTypesBUFFER==null){
                 memoryTypes();
             }
              memoryHeapCount(_memoryTypes.length); 
              
              BigBuffer<VkMemoryType> temp = new BigBuffer<VkMemoryType>(_memoryTypes, VkMemoryType.getID());
              setMemoryTypes0(this.ptr, temp.getBuffer());
              temp.update();
              memoryTypesBUFFER.update();
              return this;
	 }


//#END Set Included

// #Included getMemoryTypes0
	/**
	 * Get method for field memoryTypes	[vkstruct_array]<br>
	 * Prototype: VkMemoryType[]  memoryTypes
	 */ 
	 public VkMemoryType[] memoryTypes(){
		 long ptr = getMemoryTypes0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
                 if(memoryTypesBUFFER == null){
                     ByteBuffer bb = Utils.wrapPointer(ptr, VK_MAX_MEMORY_TYPES * VkMemoryType.sizeOf());
                     memoryTypesBUFFER = new BigBuffer(bb, memoryHeaps, VkMemoryType.getID());
                 }
                 memoryHeapsBUFFER.update();  
		 return this.memoryTypes;
	 }

//#END get

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

// #Included setMemoryHeaps

	/**
	 * Set method for field memoryHeaps	[vkstruct_array]<br>
	 * Prototype: VkMemoryHeap[]  memoryHeaps
	 * 
	 * @param _memoryHeaps - a instance of VkMemoryHeap[].
	 * @return this VkStruct instance.
	 */ 
	 public VkPhysicalDeviceMemoryProperties memoryHeaps(VkMemoryHeap[] _memoryHeaps){
	        if(_memoryHeaps == null ){
	            throw new IllegalArgumentException("VkMemoryHeap[] _memoryHeaps must be"
	                    + " not null");
	        }
	        if(memoryHeapsBUFFER==null){
	             memoryHeaps();
	        }
	     memoryHeapCount(_memoryHeaps.length); 
		 BigBuffer<VkMemoryHeap> temp = new BigBuffer<VkMemoryHeap>(_memoryHeaps, VkMemoryHeap.getID());
		 setMemoryHeaps0(this.ptr, temp.getBuffer());
		 temp.update();
         memoryHeapsBUFFER.update();
		 return this;
	 }


//#END Set Included

// #Included getMemoryHeaps0
/**
	 * Get method for field memoryHeaps	[vkstruct_array]<br>
	 * Prototype: VkMemoryHeap[]  memoryHeaps
	 */ 
	 public VkMemoryHeap[] memoryHeaps(){
		 long ptr = getMemoryHeaps0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(memoryHeapsBUFFER == null){
		     ByteBuffer bb = Utils.wrapPointer(ptr, VK_MAX_MEMORY_HEAPS * VkMemoryHeap.sizeOf());
		     memoryHeapsBUFFER = new BigBuffer(bb, memoryHeaps, VkMemoryHeap.getID());
		 }
		 memoryHeapsBUFFER.update();		
		 return this.memoryHeaps;
	 }

//#END get


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
		 // code for simple past value 
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
		 // code for Buffer - ptr to struct 
		 VkMemoryType* p_memoryTypes = (VkMemoryType*) _memoryTypes; 
		 for(uint32_t i = 0; (i < VK_MAX_MEMORY_TYPES && i < vkObj->memoryTypeCount) ; i++){
		    vkObj->memoryTypes[i] = p_memoryTypes[i];
		 } 
	  */

	/**
	 * Native GET method for field memoryTypes	[vkstruct_array]<br>
	 * Prototype: VkMemoryType[]  memoryTypes
	 */ 
	 private static native long getMemoryTypes0(Buffer ptr);/*
		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->memoryTypes );
	 */

	/**
	 * Native SET method for field memoryHeapCount	[int]<br>
	 * Prototype: uint32_t  memoryHeapCount
	 */ 
	 private static native void setMemoryHeapCount0(Buffer ptr, int _memoryHeapCount);/*
		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		 // code for simple past value 
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
		 // code for Buffer - ptr to struct 
		 VkMemoryHeap* p_memoryHeaps = (VkMemoryHeap*) _memoryHeaps; 
		 for(uint32_t i=0; (i < VK_MAX_MEMORY_HEAPS && i < vkObj->memoryHeapCount) ; i++){
		   vkObj->memoryHeaps[i] = p_memoryHeaps[i];
		 } 
	  */

	/**
	 * Native GET method for field memoryHeaps	[vkstruct_array]<br>
	 * Prototype: VkMemoryHeap[]  memoryHeaps
	 */ 
	 private static native long getMemoryHeaps0(Buffer ptr);/*
		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->memoryHeaps );
	 */





} // end of class VkPhysicalDeviceMemoryProperties
