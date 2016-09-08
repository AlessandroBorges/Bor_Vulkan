/**
 * Class wrapping Vulkan's VkDeviceCreateInfo struct.
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
 *  This class is a Java front end for struct VkDeviceCreateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDeviceCreateInfo {
 *     VkStructureType                    sType;
 *     const void*                        pNext;
 *     VkDeviceCreateFlags                flags;
 *     uint32_t                           queueCreateInfoCount;
 *     const VkDeviceQueueCreateInfo*     pQueueCreateInfos;
 *     uint32_t                           enabledLayerCount;
 *     const char* const*                 ppEnabledLayerNames;
 *     uint32_t                           enabledExtensionCount;
 *     const char* const*                 ppEnabledExtensionNames;
 *     const VkPhysicalDeviceFeatures*    pEnabledFeatures;
 * } VkDeviceCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkDeviceCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [16]  */
	 private static final String TAG = "VkDeviceCreateInfo";

	/** ID of this structure [16]  */
	 public static final int TAG_ID = VKDEVICECREATEINFO_ID;

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
	 *  VkDeviceCreateFlags 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  uint32_t 	queueCreateInfoCount	[int]
	 */ 
	int 	queueCreateInfoCount;
	
	/**
	 *  const VkDeviceQueueCreateInfo* 	pQueueCreateInfos	[vkstruct_array_array]
	 */ 
	VkDeviceQueueCreateInfo[]  	pQueueCreateInfos;
	 private BigBuffer<VkDeviceQueueCreateInfo> 	 pQueueCreateInfosBUFFER;
	
	/**
	 *  uint32_t 	enabledLayerCount	[int]
	 */ 
	int 	enabledLayerCount;
	
	/**
	 *  const char* const* 	ppEnabledLayerNames	[string]
	 */ 
	String[] 	ppEnabledLayerNames;
	
	/**
	 *  uint32_t 	enabledExtensionCount	[int]
	 */ 
	int 	enabledExtensionCount;
	
	/**
	 *  const char* const* 	ppEnabledExtensionNames	[string]
	 */ 
	String[] 	ppEnabledExtensionNames;
	
	/**
	 *  const VkPhysicalDeviceFeatures* 	pEnabledFeatures	[vkstruct_array_array]
	 */ 
	VkPhysicalDeviceFeatures  	pEnabledFeatures;
	 private BigBuffer<VkPhysicalDeviceFeatures> 	 pEnabledFeaturesBUFFER;
	/**
	 * Ctor
	 */
	public VkDeviceCreateInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDeviceCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDeviceCreateInfo(long address){ 
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
	 public static VkArray<VkDeviceCreateInfo> createVkArray(int size){ 
		 VkDeviceCreateInfo[] array = new VkDeviceCreateInfo[size]; 
		 VkArrayStruct<VkDeviceCreateInfo> vkArray = new VkArrayStruct<VkDeviceCreateInfo>(array, TAG_ID);
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
	 public VkDeviceCreateInfo sType(VkStructureType sType){
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
	 public VkDeviceCreateInfo pNext(VkObject pNext){
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
	 * Prototype: VkDeviceCreateFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDeviceCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkDeviceCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field queueCreateInfoCount	[int]<br>
	 * Prototype: uint32_t  queueCreateInfoCount
	 * 
	 * @param queueCreateInfoCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDeviceCreateInfo queueCreateInfoCount(int queueCreateInfoCount){
		 this.queueCreateInfoCount = queueCreateInfoCount;
		 setQueueCreateInfoCount0(this.ptr,  queueCreateInfoCount);
		 return this;
	 }

	/**
	 * Get method for field queueCreateInfoCount	[int]<br>
	 * Prototype: uint32_t  queueCreateInfoCount
	 */ 
	 public int queueCreateInfoCount(){
		 int var = getQueueCreateInfoCount0(super.ptr);
		 this.queueCreateInfoCount = var;
		 return this.queueCreateInfoCount;
	 }

	/**
	 * Set method for field pQueueCreateInfos	[vkstruct_array]<br>
	 * Prototype: const VkDeviceQueueCreateInfo*  pQueueCreateInfos
	 * 
	 * @param pQueueCreateInfos - a instance of VkDeviceQueueCreateInfo[].
	 * @return this VkStruct instance.
	 */ 
	 public VkDeviceCreateInfo pQueueCreateInfos(VkDeviceQueueCreateInfo[] pQueueCreateInfos){
		 this.pQueueCreateInfos = pQueueCreateInfos;
		 this.pQueueCreateInfosBUFFER = new BigBuffer<VkDeviceQueueCreateInfo>(pQueueCreateInfos, VkDeviceQueueCreateInfo.getID());
		 setPQueueCreateInfos0(this.ptr, pQueueCreateInfosBUFFER.getBuffer());
		 return this;
	 }

	/**
	 * Get method for field pQueueCreateInfos	[vkstruct_array]<br>
	 * Prototype: const VkDeviceQueueCreateInfo*  pQueueCreateInfos
	 */ 
	 public VkDeviceQueueCreateInfo[] pQueueCreateInfos(){
		 long ptr = getPQueueCreateInfos0(this.ptr);
		 if(ptr == 0L){
		    return null;
		 }
		 if(pQueueCreateInfosBUFFER != null && ptr == pQueueCreateInfosBUFFER.getBufferAddress()){ //same buffer 
		    pQueueCreateInfosBUFFER.update();
		  }else{
		     // wrap native structs 
		     int length = queueCreateInfoCount();
		     if(length > 0){
		        this.pQueueCreateInfos = new VkDeviceQueueCreateInfo[length];
		        pQueueCreateInfosBUFFER = new BigBuffer<VkDeviceQueueCreateInfo>(ptr, pQueueCreateInfos, VkDeviceQueueCreateInfo.getID() );
		     }
		   }
		 return this.pQueueCreateInfos;
	 }

	/**
	 * Set method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 * 
	 * @param enabledLayerCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDeviceCreateInfo enabledLayerCount(int enabledLayerCount){
		 this.enabledLayerCount = enabledLayerCount;
		 setEnabledLayerCount0(this.ptr,  enabledLayerCount);
		 return this;
	 }

	/**
	 * Get method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 public int enabledLayerCount(){
		 int var = getEnabledLayerCount0(super.ptr);
		 this.enabledLayerCount = var;
		 return this.enabledLayerCount;
	 }

// #Included setPpEnabledLayerNames
    /**
     * Set method for field ppEnabledLayerNames [string_arr]<br>
     * Prototype: const char* const*  ppEnabledLayerNames
     */ 
     public VkDeviceCreateInfo ppEnabledLayerNames(String[] ppEnabledLayerNames){
         this.ppEnabledLayerNames = ppEnabledLayerNames;
         setPpEnabledLayerNames0(this.ptr,  ppEnabledLayerNames);
		 return this;
     }

//#END Set Included

// #Included getPpEnabledLayerNames0
    /**
     * Get method for field ppEnabledLayerNames [string_arr]<br>
     * Prototype: const char* const*  ppEnabledLayerNames
     */ 
     public String[] ppEnabledLayerNames(){
             int count = getEnabledLayerCount0(ptr);
             if(count==0) 
                 return null;
             if(ppEnabledLayerNames==null || ppEnabledLayerNames.length != count){
                 ppEnabledLayerNames = new String[count];
             }
             this.ppEnabledLayerNames = getPpEnabledLayerNames0(super.ptr, ppEnabledLayerNames);
         return this.ppEnabledLayerNames;
     }
     

//#END get

	/**
	 * Set method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 * 
	 * @param enabledExtensionCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkDeviceCreateInfo enabledExtensionCount(int enabledExtensionCount){
		 this.enabledExtensionCount = enabledExtensionCount;
		 setEnabledExtensionCount0(this.ptr,  enabledExtensionCount);
		 return this;
	 }

	/**
	 * Get method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 public int enabledExtensionCount(){
		 int var = getEnabledExtensionCount0(super.ptr);
		 this.enabledExtensionCount = var;
		 return this.enabledExtensionCount;
	 }

// #Included setPpEnabledExtensionNames
    /**
     * Set method for field ppEnabledExtensionNames [string_arr]<br>
     * Prototype: const char* const*  ppEnabledExtensionNames
     */ 
     public VkDeviceCreateInfo ppEnabledExtensionNames(String[] ppEnabledExtensionNames){
         this.ppEnabledExtensionNames = ppEnabledExtensionNames;
         setPpEnabledExtensionNames0(this.ptr,  ppEnabledExtensionNames);
		 return this;
     }
     

//#END Set Included

// #Included getPpEnabledExtensionNames0
    /**
     * Get method for field ppEnabledExtensionNames [string_arr]<br>
     * Prototype: const char* const*  ppEnabledExtensionNames
     */ 
     public String[] ppEnabledExtensionNames(){
         String[] var = getPpEnabledExtensionNames0(super.ptr);
         this.ppEnabledExtensionNames = var;
         return this.ppEnabledExtensionNames;
     }
     

//#END get

// #Included setPEnabledFeatures

	
	/**
	 * Set method for field pEnabledFeatures	[vkstruct]<br>
	 * Prototype: const VkPhysicalDeviceFeatures*  pEnabledFeatures
	 * 
	 * @param pEnabledFeatures - a instance of VkPhysicalDeviceFeatures[].
	 * @return this VkStruct instance.
	 */ 
	 public VkDeviceCreateInfo pEnabledFeatures(VkPhysicalDeviceFeatures pEnabledFeatures){
		 this.pEnabledFeatures = pEnabledFeatures;
		 //this.pEnabledFeaturesBUFFER = new BigBuffer(pEnabledFeatures, VkPhysicalDeviceFeatures.getID());
		 setPEnabledFeatures0(this.ptr, pEnabledFeatures.getPointer());
		 return this;
	 }

//#END Set Included

// #Included getPEnabledFeatures0
     
	/**
	 * Get method for field pEnabledFeatures	[vkstruct]<br>
	 * Prototype: const VkPhysicalDeviceFeatures*  pEnabledFeatures
	 */ 
	 public VkPhysicalDeviceFeatures pEnabledFeatures(){
		 long ptr = getPEnabledFeatures0(this.ptr);
		 if(ptr == 0L){
		    pEnabledFeatures = null; 
		    return null;
		 }
		 if(pEnabledFeatures == null && ptr != pEnabledFeatures.getNativeHandle()){
		       this.pEnabledFeatures = new VkPhysicalDeviceFeatures(ptr);		       
		 }		   
		 return this.pEnabledFeatures;
	 }


//#END get


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkDeviceCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n queueCreateInfoCount: ")
				.append(queueCreateInfoCount() )
				.append(",\n pQueueCreateInfos: ")
				.append(Arrays.toString(pQueueCreateInfos()) )
				.append(",\n enabledLayerCount: ")
				.append(enabledLayerCount() )
				.append(",\n ppEnabledLayerNames: ")
				.append(Arrays.toString(ppEnabledLayerNames()) )
				.append(",\n enabledExtensionCount: ")
				.append(enabledExtensionCount() )
				.append(",\n ppEnabledExtensionNames: ")
				.append(Arrays.toString(ppEnabledExtensionNames()) )
				.append(",\n pEnabledFeatures: ")
				.append(pEnabledFeatures())
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
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkDeviceCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkDeviceCreateFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkDeviceCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field queueCreateInfoCount	[int]<br>
	 * Prototype: uint32_t  queueCreateInfoCount
	 */ 
	 private static native void setQueueCreateInfoCount0(Buffer ptr, int _queueCreateInfoCount);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->queueCreateInfoCount = (uint32_t) (_queueCreateInfoCount);
	  */

	/**
	 * Native GET method for field queueCreateInfoCount	[int]<br>
	 * Prototype: uint32_t  queueCreateInfoCount
	 */ 
	 private static native int getQueueCreateInfoCount0(Buffer ptr);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->queueCreateInfoCount);
	 */

	/**
	 * Native SET method for field pQueueCreateInfos	[vkstruct_array]<br>
	 * Prototype: const VkDeviceQueueCreateInfo*  pQueueCreateInfos
	 */ 
	 private static native void setPQueueCreateInfos0(Buffer ptr, java.nio.ByteBuffer  _pQueueCreateInfos);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkDeviceQueueCreateInfo* p_pQueueCreateInfos = ( VkDeviceQueueCreateInfo*) _pQueueCreateInfos; 
		 vkObj->pQueueCreateInfos = p_pQueueCreateInfos; 
	  */

	/**
	 * Native GET method for field pQueueCreateInfos	[vkstruct_array]<br>
	 * Prototype: const VkDeviceQueueCreateInfo*  pQueueCreateInfos
	 */ 
	 private static native long getPQueueCreateInfos0(Buffer ptr);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pQueueCreateInfos );
	 */

	/**
	 * Native SET method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 private static native void setEnabledLayerCount0(Buffer ptr, int _enabledLayerCount);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->enabledLayerCount = (uint32_t) (_enabledLayerCount);
	  */

	/**
	 * Native GET method for field enabledLayerCount	[int]<br>
	 * Prototype: uint32_t  enabledLayerCount
	 */ 
	 private static native int getEnabledLayerCount0(Buffer ptr);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->enabledLayerCount);
	 */

    /**
     * native SET method for field ppEnabledLayerNames  [string_arr]<br>
     * Prototype: const char* const*  ppEnabledLayerNames
     */ 
     private static native void setPpEnabledLayerNames0(Buffer ptr, String[] ppEnabledLayerNames);/*
          VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
          int stringCount = ppEnabledLayerNames ? env->GetArrayLength(ppEnabledLayerNames) : 0;
          if(stringCount==0)
              return;
              
                  const char** enabledLayers = CALLOC(stringCount,const char*) ;
                  
                  for (int i=0; i<stringCount; i++) {
                          jstring string = (jstring) env->GetObjectArrayElement(ppEnabledLayerNames, i);
                          const char *rawString = env->GetStringUTFChars(string, 0);
                          enabledLayers[i] = cloneStr(rawString);
                          env->ReleaseStringUTFChars(string, rawString);
                   }
                  vkObj->enabledLayerCount = stringCount;
                  vkObj->ppEnabledLayerNames = enabledLayers;
      */
      

    /**
     * native GET method for field ppEnabledLayerNames  [string_arr]<br>
     * Prototype: const char* const*  ppEnabledLayerNames
     */
     private static native String[] getPpEnabledLayerNames0(Buffer ptr, String[] names);/*
              if(names == NULL) return NULL;
          VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
          int count = (int) vkObj->enabledLayerCount;
                  if(count > 0){
                    for(int i = 0; i<count; i++){
                         env->SetObjectArrayElement(names, 
                                                    i,
                                                    env->NewStringUTF(vkObj->ppEnabledLayerNames[i]));
                      }//for                      
                  }//if count                  
         return names;
     */

	/**
	 * Native SET method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 private static native void setEnabledExtensionCount0(Buffer ptr, int _enabledExtensionCount);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->enabledExtensionCount = (uint32_t) (_enabledExtensionCount);
	  */

	/**
	 * Native GET method for field enabledExtensionCount	[int]<br>
	 * Prototype: uint32_t  enabledExtensionCount
	 */ 
	 private static native int getEnabledExtensionCount0(Buffer ptr);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->enabledExtensionCount);
	 */

     /**
     * native SET method for field ppEnabledExtensionNames  [string_arr]<br>
     * Prototype: const char* const*  ppEnabledExtensionNames
     */ 
     private static native void setPpEnabledExtensionNames0(Buffer ptr, String[] _ppEnabledExtensionNames);/*
          VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);         
          int stringCount = _ppEnabledExtensionNames ? env->GetArrayLength(_ppEnabledExtensionNames) : 0;
          
                  const char** names = CALLOC(stringCount,const char*);  
                                  
                  for (int i=0; i<stringCount; i++) {
                          jstring string = (jstring) env->GetObjectArrayElement(_ppEnabledExtensionNames, i);
                          const char *rawString = env->GetStringUTFChars(string, 0);
                          names[i] = cloneStr(rawString);                          
                          env->ReleaseStringUTFChars(string, rawString);
                   }                   
                  vkObj->enabledExtensionCount = stringCount;
                  vkObj->ppEnabledExtensionNames = names; 
            
      */


    /**
     * native GET method for field ppEnabledExtensionNames  [string_arr]<br>
     * Prototype: const char* const*  ppEnabledExtensionNames
     */ 
     private static native String[] getPpEnabledExtensionNames0(Buffer ptr);/*
          VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
          int count = (int) vkObj->enabledExtensionCount;
          
                  jobjectArray ret = NULL;                  
                  if(count>0){                   
                   // thanks to code ranch 
                   // http://www.coderanch.com/t/326467/java/java/Returning-String-array-program-Java
                   ret = (jobjectArray)env->NewObjectArray(count,
                                                           env->FindClass("java/lang/String"),
                                                           NULL);//env->NewStringUTF(""));                  
                    for(int i = 0; i<count; i++){
                         env->SetObjectArrayElement(ret, 
                                                    i,
                                                    env->NewStringUTF(vkObj->ppEnabledExtensionNames[i]));
                      }//for
                  }//if count
                  
        return ret;
     */

	/**
	 * Native SET method for field pEnabledFeatures	[vkstruct_array]<br>
	 * Prototype: const VkPhysicalDeviceFeatures*  pEnabledFeatures
	 */ 
	 private static native void setPEnabledFeatures0(Buffer ptr, java.nio.ByteBuffer  _pEnabledFeatures);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkPhysicalDeviceFeatures* p_pEnabledFeatures = ( VkPhysicalDeviceFeatures*) _pEnabledFeatures; 
		 vkObj->pEnabledFeatures = p_pEnabledFeatures; 
	  */

	/**
	 * Native GET method for field pEnabledFeatures	[vkstruct_array]<br>
	 * Prototype: const VkPhysicalDeviceFeatures*  pEnabledFeatures
	 */ 
	 private static native long getPEnabledFeatures0(Buffer ptr);/*
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pEnabledFeatures );
	 */





} // end of class VkDeviceCreateInfo
