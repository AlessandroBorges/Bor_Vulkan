/**
 * 
 */
package bor.vulkan.structs;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;

import bor.enumerable.IntEnum;
import bor.util.BigBuffer;
import bor.util.Utils;
import bor.vulkan.VkHandleInterface;
import bor.vulkan.VkObject;

/**
 *
 * VkStruct holds the native reference to a Vulkan struct.
 * 
 * There are two types of VkObjects:
 * <li> Vulkan Handler - hold only a pointer to Vulkan objects
 * <li> Vulkan Structures - hold a pointer Vulkan struct itself.
 *
 * Vulkan Struct. <br>
 * This is a front end java class to native struct, 
 * which is created at runtime when you instantiante 
 * 
 * @see VkObject
 * @see VkHandleInterface
 * 
 * @author Alessandro Borges
 *
 */
public abstract class VkStruct implements VkObject{
   
    //@formatter:off
    /*JNI
   #include <BorVulkan.hpp>
     
     */
    /**
     * Default size of Pointer.
     * It is safe from Java side and can be cast to (void *) in both 
     * 32 and 64 bits in all major O.S. supported by Java JRE. <br>
     */
    public static  int SIZEOF_PTR = 8; 
    
    /** internal ID of Vulkan structure */
    public static final int VKAPPLICATIONINFO_ID = 1;
    public static final int VKINSTANCECREATEINFO_ID = 2;
    public static final int VKALLOCATIONCALLBACKS_ID = 3;
    public static final int VKPHYSICALDEVICEFEATURES_ID = 4;
    public static final int VKFORMATPROPERTIES_ID = 5;
    public static final int VKEXTENT3D_ID = 6;
    public static final int VKIMAGEFORMATPROPERTIES_ID = 7;
    public static final int VKPHYSICALDEVICELIMITS_ID = 8;
    public static final int VKPHYSICALDEVICESPARSEPROPERTIES_ID = 9;
    public static final int VKPHYSICALDEVICEPROPERTIES_ID = 10;
    public static final int VKQUEUEFAMILYPROPERTIES_ID = 11;
    public static final int VKMEMORYTYPE_ID = 12;
    public static final int VKMEMORYHEAP_ID = 13;
    public static final int VKPHYSICALDEVICEMEMORYPROPERTIES_ID = 14;
    public static final int VKDEVICEQUEUECREATEINFO_ID = 15;
    public static final int VKDEVICECREATEINFO_ID = 16;
    public static final int VKEXTENSIONPROPERTIES_ID = 17;
    public static final int VKLAYERPROPERTIES_ID = 18;
    public static final int VKSUBMITINFO_ID = 19;
    public static final int VKMEMORYALLOCATEINFO_ID = 20;
    public static final int VKMAPPEDMEMORYRANGE_ID = 21;
    public static final int VKMEMORYREQUIREMENTS_ID = 22;
    public static final int VKSPARSEIMAGEFORMATPROPERTIES_ID = 23;
    public static final int VKSPARSEIMAGEMEMORYREQUIREMENTS_ID = 24;
    public static final int VKSPARSEMEMORYBIND_ID = 25;
    public static final int VKSPARSEBUFFERMEMORYBINDINFO_ID = 26;
    public static final int VKSPARSEIMAGEOPAQUEMEMORYBINDINFO_ID = 27;
    public static final int VKIMAGESUBRESOURCE_ID = 28;
    public static final int VKOFFSET3D_ID = 29;
    public static final int VKSPARSEIMAGEMEMORYBIND_ID = 30;
    public static final int VKSPARSEIMAGEMEMORYBINDINFO_ID = 31;
    public static final int VKBINDSPARSEINFO_ID = 32;
    public static final int VKFENCECREATEINFO_ID = 33;
    public static final int VKSEMAPHORECREATEINFO_ID = 34;
    public static final int VKEVENTCREATEINFO_ID = 35;
    public static final int VKQUERYPOOLCREATEINFO_ID = 36;
    public static final int VKBUFFERCREATEINFO_ID = 37;
    public static final int VKBUFFERVIEWCREATEINFO_ID = 38;
    public static final int VKIMAGECREATEINFO_ID = 39;
    public static final int VKSUBRESOURCELAYOUT_ID = 40;
    public static final int VKCOMPONENTMAPPING_ID = 41;
    public static final int VKIMAGESUBRESOURCERANGE_ID = 42;
    public static final int VKIMAGEVIEWCREATEINFO_ID = 43;
    public static final int VKSHADERMODULECREATEINFO_ID = 44;
    public static final int VKPIPELINECACHECREATEINFO_ID = 45;
    public static final int VKSPECIALIZATIONMAPENTRY_ID = 46;
    public static final int VKSPECIALIZATIONINFO_ID = 47;
    public static final int VKPIPELINESHADERSTAGECREATEINFO_ID = 48;
    public static final int VKVERTEXINPUTBINDINGDESCRIPTION_ID = 49;
    public static final int VKVERTEXINPUTATTRIBUTEDESCRIPTION_ID = 50;
    public static final int VKPIPELINEVERTEXINPUTSTATECREATEINFO_ID = 51;
    public static final int VKPIPELINEINPUTASSEMBLYSTATECREATEINFO_ID = 52;
    public static final int VKPIPELINETESSELLATIONSTATECREATEINFO_ID = 53;
    public static final int VKVIEWPORT_ID = 54;
    public static final int VKOFFSET2D_ID = 55;
    public static final int VKEXTENT2D_ID = 56;
    public static final int VKRECT2D_ID = 57;
    public static final int VKPIPELINEVIEWPORTSTATECREATEINFO_ID = 58;
    public static final int VKPIPELINERASTERIZATIONSTATECREATEINFO_ID = 59;
    public static final int VKPIPELINEMULTISAMPLESTATECREATEINFO_ID = 60;
    public static final int VKSTENCILOPSTATE_ID = 61;
    public static final int VKPIPELINEDEPTHSTENCILSTATECREATEINFO_ID = 62;
    public static final int VKPIPELINECOLORBLENDATTACHMENTSTATE_ID = 63;
    public static final int VKPIPELINECOLORBLENDSTATECREATEINFO_ID = 64;
    public static final int VKPIPELINEDYNAMICSTATECREATEINFO_ID = 65;
    public static final int VKGRAPHICSPIPELINECREATEINFO_ID = 66;
    public static final int VKCOMPUTEPIPELINECREATEINFO_ID = 67;
    public static final int VKPUSHCONSTANTRANGE_ID = 68;
    public static final int VKPIPELINELAYOUTCREATEINFO_ID = 69;
    public static final int VKSAMPLERCREATEINFO_ID = 70;
    public static final int VKDESCRIPTORSETLAYOUTBINDING_ID = 71;
    public static final int VKDESCRIPTORSETLAYOUTCREATEINFO_ID = 72;
    public static final int VKDESCRIPTORPOOLSIZE_ID = 73;
    public static final int VKDESCRIPTORPOOLCREATEINFO_ID = 74;
    public static final int VKDESCRIPTORSETALLOCATEINFO_ID = 75;
    public static final int VKDESCRIPTORIMAGEINFO_ID = 76;
    public static final int VKDESCRIPTORBUFFERINFO_ID = 77;
    public static final int VKWRITEDESCRIPTORSET_ID = 78;
    public static final int VKCOPYDESCRIPTORSET_ID = 79;
    public static final int VKFRAMEBUFFERCREATEINFO_ID = 80;
    public static final int VKATTACHMENTDESCRIPTION_ID = 81;
    public static final int VKATTACHMENTREFERENCE_ID = 82;
    public static final int VKSUBPASSDESCRIPTION_ID = 83;
    public static final int VKSUBPASSDEPENDENCY_ID = 84;
    public static final int VKRENDERPASSCREATEINFO_ID = 85;
    public static final int VKCOMMANDPOOLCREATEINFO_ID = 86;
    public static final int VKCOMMANDBUFFERALLOCATEINFO_ID = 87;
    public static final int VKCOMMANDBUFFERINHERITANCEINFO_ID = 88;
    public static final int VKCOMMANDBUFFERBEGININFO_ID = 89;
    public static final int VKBUFFERCOPY_ID = 90;
    public static final int VKIMAGESUBRESOURCELAYERS_ID = 91;
    public static final int VKIMAGECOPY_ID = 92;
    public static final int VKIMAGEBLIT_ID = 93;
    public static final int VKBUFFERIMAGECOPY_ID = 94;
    public static final int VKCLEARDEPTHSTENCILVALUE_ID = 95;
    public static final int VKCLEARATTACHMENT_ID = 96;
    public static final int VKCLEARVALUE_ID = 97;
    public static final int VKCLEARCOLORVALUE_ID = 98;
    public static final int VKCLEARRECT_ID = 99;
    public static final int VKIMAGERESOLVE_ID = 100;
    public static final int VKMEMORYBARRIER_ID = 101;
    public static final int VKBUFFERMEMORYBARRIER_ID = 102;
    public static final int VKIMAGEMEMORYBARRIER_ID = 103;
    public static final int VKRENDERPASSBEGININFO_ID = 104;
    public static final int VKDISPATCHINDIRECTCOMMAND_ID = 105;
    public static final int VKDRAWINDEXEDINDIRECTCOMMAND_ID = 106;
    public static final int VKDRAWINDIRECTCOMMAND_ID = 107;
    public static final int VKSURFACECAPABILITIESKHR_ID = 108;
    public static final int VKSURFACEFORMATKHR_ID = 109;
    public static final int VKSWAPCHAINCREATEINFOKHR_ID = 110;
    public static final int VKPRESENTINFOKHR_ID = 111;
    public static final int VKDISPLAYPROPERTIESKHR_ID = 112;
    public static final int VKDISPLAYMODEPARAMETERSKHR_ID = 113;
    public static final int VKDISPLAYMODEPROPERTIESKHR_ID = 114;
    public static final int VKDISPLAYMODECREATEINFOKHR_ID = 115;
    public static final int VKDISPLAYPLANECAPABILITIESKHR_ID = 116;
    public static final int VKDISPLAYPLANEPROPERTIESKHR_ID = 117;
    public static final int VKDISPLAYSURFACECREATEINFOKHR_ID = 118;
    public static final int VKDISPLAYPRESENTINFOKHR_ID = 119;
    public static final int VKXLIBSURFACECREATEINFOKHR_ID = 120;
    public static final int VKXCBSURFACECREATEINFOKHR_ID = 121;
    public static final int VKWAYLANDSURFACECREATEINFOKHR_ID = 122;
    public static final int VKMIRSURFACECREATEINFOKHR_ID = 123;
    public static final int VKANDROIDSURFACECREATEINFOKHR_ID = 124;
    public static final int VKWIN32SURFACECREATEINFOKHR_ID = 125;
    public static final int VKDEBUGREPORTCALLBACKCREATEINFOEXT_ID = 126;
    public static final int VKPIPELINERASTERIZATIONSTATERASTERIZATIONORDERAMD_ID = 127;
    public static final int VKDEBUGMARKEROBJECTNAMEINFOEXT_ID = 128;
    public static final int VKDEBUGMARKEROBJECTTAGINFOEXT_ID = 129;
    public static final int VKDEBUGMARKERMARKERINFOEXT_ID = 130;
    public static final int VKDEDICATEDALLOCATIONIMAGECREATEINFONV_ID = 131;
    public static final int VKDEDICATEDALLOCATIONBUFFERCREATEINFONV_ID = 132;
    public static final int VKDEDICATEDALLOCATIONMEMORYALLOCATEINFONV_ID = 133;

    
    
    /**
     * A Direct Buffer to native
     */
    protected ByteBuffer ptr;
    /**
     * Size in bytes hold by this pointer
     */
    protected int memSize;
    /**
     * Native address
     */
    protected long nativeHandle = 0;
        
    /**
     * 
     */
    private boolean isJni = true;
    
    /**
     * Object to store a list of native array of VkStructs
     */
    protected BigBuffer<VkStruct> bigBuffer;
    
        
    /**
     * Used to recover VkStruct reference after a native call.
     * It maps the (this.ptr) -> (this), to avoid GC
     * as well double instances of VkStruct sharing the same object. 
     * @TODO - define a free method for this
     * 
     *   
     */
    private static Map<ByteBuffer,VkStruct> objManager = new HashMap<ByteBuffer, VkStruct>();
    
    /**
     * Ctor
     */
    private VkStruct(){        
    }
    
    /**
     * creates a instance of this struct with a data in native side.    
     * @param structID - Id Of this struct
     */  
    protected VkStruct(int structID){
        this(sizeOf(structID), true);       
    }
    
   
    /**
     * Constructor.
     * Creates a native pointer with memSize bytes 
     * @param memSize - native size of structure, in bytes
     * @param unused - not used.
     */    
    protected VkStruct(int memSize, boolean unused){
        ByteBuffer nativeBuffer = ByteBuffer.allocateDirect(memSize);
        this.memSize = memSize;
        this.isJni = false;
        preparePtr(nativeBuffer);
    }
    
    
    /**
     * Ctor for natively allocated buffer.
     * It wraps the address, assumed as a valid native pointer to memory buffer
     * allocated somehow,
     * and wraps it with a ByteBuffer.
     * 
     * @param address - native address to wrap with an Direct ByteBuffer  
     * @param size - size in bytes pointed by this address
     */
    protected VkStruct(final long address, int size){         
         setPointer(address, size);
    }
    
    /**
     * Ctor for natively allocated buffer.
     * It wraps the address, assumed as a valid native pointer to memory buffer
     * allocated somehow,
     * and wraps it with a ByteBuffer.
     * 
     * @param address - native address to wrap with an Direct ByteBuffer
     */
    protected VkStruct(long address){
         setPointer(address);
    }
    
    /**
     * Ctor for natively allocated buffer.
     * @param nativeBuffer - native buffer wrapped by a Direct ByteBuffer  
     * @param size - size in bytes pointed by this buffer
     */
//    @Deprecated
//    protected VkStruct(ByteBuffer nativeBuffer, int size){
//        preparePtr(nativeBuffer);
//    }
//    
    
    /**
     * Ctor for natively allocated buffer.
     * @param nativeBuffer - native buffer wrapped by a Direct ByteBuffer 
     * 
     */
    protected VkStruct(ByteBuffer nativeBuffer){
        if(null==nativeBuffer || !nativeBuffer.isDirect()){
            throw 
            new IllegalArgumentException("ByteBuffer nativePtr must "
                    + "be Direct and not null.");
        }
        preparePtr(nativeBuffer);
    }
    
//    /**
//     * Creates a 
//     * @param nativeBuffer
//     * @param elementCount
//     */
//    @SuppressWarnings("unchecked")
//    protected VkStruct(ByteBuffer nativeBuffer, int elementCount){
//        if(null==nativeBuffer || !nativeBuffer.isDirect()){
//            throw 
//            new IllegalArgumentException("ByteBuffer nativePtr must "
//                    + "be Direct and not null.");
//        }
//        this.count = elementCount;
//        bigBuffer = new BigBuffer(nativeBuffer, elementCount, this.getClass(), true);
//        bigBuffer.setOwner(this);
//        preparePtr(nativeBuffer);
//    }
    
    /**
     * Implements {@link VkObject#getType()}.     
     *  Always return {@link VkObject#TYPE_STRUCT}
     *  
     *  @return VkObject.TYPE_Struct. Always
     */
    @Override
    public int getType(){
        return TYPE_STRUCT;
    }
    
    
    /**
     * Implements {@link VkObject#getPointer()}<br>
     * Same as {@link VkStruct#getPointerStruct()}
     * 
     * @see #getPointerStruct()
     * @see VkObject#getPointer()
     * @return the structs's native pointer, wrapped by a ByteBuffer 
     */
    @Override
    public final ByteBuffer getPointer(){
        return this.ptr;
    }
    
    /**
     * Get native address.
     * @return long value holding native address.
     */
    public long getNativeHandle(){
        return nativeHandle;
    }
    
    /**
     * Prepare native pointer to be used in this object. <br><pre>
     *  - unregister ptr
     *  - make it  native order
     *  - rewind
     *  - set memSize with buffer capacity
     *  - register on objManager 
     *  </pre>
     * @param nativePtr
     */
   private void preparePtr(ByteBuffer nativePtr) {
       if(this.ptr != null )
           objManager.remove(this.ptr);
              
       this.ptr = nativePtr;
       
       if(ptr!=null){
           this.ptr.order(ByteOrder.nativeOrder());
           this.ptr.rewind();
           this.memSize = ptr.capacity();
           this.nativeHandle = Utils.getNativeAddress(ptr);
       objManager.put(ptr, this);
       }
   }
    
   
    
    /*
     * (non-Javadoc)
     * @see bor.vulkan.VkObject#setPointer(java.nio.ByteBuffer)
     */
     public void setPointer(ByteBuffer nativePtr){       
        preparePtr(nativePtr);
    }
    
     /*
      * (non-Javadoc)
      * @see bor.vulkan.VkObject#setPointer(long)
      */
      public void setPointer(long nativeHnd){
         if(nativeHnd==this.nativeHandle){
             //same pointer
             return;
         }         
         ByteBuffer nativePtr = Utils.wrapPointer(nativeHnd, getSizeBytes());         
         preparePtr(nativePtr);
     }
      
      /*
       * (non-Javadoc)
       * @see bor.vulkan.VkObject#setPointer(long)
       */
       public void setPointer(long nativeHnd, int size){
          if(nativeHnd==this.nativeHandle){
              //same pointer
              return;
          }         
          ByteBuffer nativePtr = Utils.wrapPointer(nativeHnd, size); 
          isJni = true;
          preparePtr(nativePtr);
      } 
     
     /**
      * Get the size in bytes of this Struct
      * @return
      */
     public abstract int getSizeBytes(); 
     
         
    /**
     * Make sure buffer is filled with null or zero values
     * @TODO - 
     * @param buff - buffer to be clean up
     * @param memSize - amount of bytes to clean up
     */
    private static void clean(ByteBuffer buff, int memSize){
        int size = Math.min(buff.remaining(), memSize);
        byte blank = (byte)0x00;
        for(int i=0; i<size; i++){
          buff.put(blank);    
        }
         buff.rewind();
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {       
        int result = (ptr == null) ? 0 : ptr.hashCode();
        return result;
    }



    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        
        if ( !(obj instanceof VkStruct)) 
            return false;
        
        VkStruct other = (VkStruct) obj;
        if (ptr == null) {
            if (other.ptr != null) return false;
        } else if (!ptr.equals(other.ptr)) return false;
        return true;
    }

    

    /**
     * Deletes this object reference to native, leaving it to be GC'ed <br>
     * 
     * After calling this method, any further operation with this struct
     * will result in a NullPointerException.
     * 
     * @return true if everything goes OK
     */
    @Override
    public boolean free(){
        boolean op = false;
        synchronized (objManager) {
            objManager.remove(ptr); 
        }        
        synchronized (ptr) {
            if(isJni){
                op = Utils.deleteDirectBuffer(this.ptr);
            }
            ptr = null;
        }
        nativeHandle = 0;
        op=true;
        return op;
    }
    
    /**
     * Read a enumeration array and convert it to int array
     * @param array - Enumeration array to read int values
     * @return int[] with enumeration values
     */
    /* package */ int[] readEnumArray(IntEnum<?>[] array){
        if(array == null)
            return null;
        
        int[] res = new int[array.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = array[i].getValue();
        }
        return res;
    }
    
       
    
    /**
     * 
     * @param bb - buffer to check
     * @return true if it is native allocated
     */
    @Deprecated
    public boolean isJNIBuffer(Buffer bb){
        if(!bb.isDirect()) return false;
        return false;
    }
    
    /**
     * Check if native pointer to this VkStruct is null.<br>
     * 
     * @see VkObject#isNull()
     * @see VkStruct#isNull()
     * 
     * @return true if pointer to this struct is null 
     */
    @Override
    public boolean isNull(){
        return null==ptr;
    }
    
    /**
     * Dump content of this struct, as binary 
     */
    public void dump(){
         ByteBuffer bb = ptr;
         if(ptr==null){
             System.out.println("null");
             return;
         }
        java.nio.IntBuffer intBB = bb.asIntBuffer();
        int size = intBB.capacity();
        intBB.rewind();
        String name = this.getClass().getSimpleName();
        System.out.println("Dump of " + name + ". Size in bytes: " + bb.capacity());
        System.out.println("Base address: 0x" + Long.toHexString(nativeHandle));
        for(int i=0; i<size; i++){            
            int v = intBB.get(i);
            String hex = "0x" + Integer.toHexString(v);
            System.out.println(hex + "\t ("+ v +")");
        }
        System.out.println("end of dump");

    }
    
    /**
     * Delegate method for wrapPointer.
     * @TODO remove dependency 
     * 
     * @param address - native address
     * @param size - size in bytes
     * @return Direct ByteBuffer.
     */
    protected static ByteBuffer wrapPointer(long address, int size){
        return Utils.wrapPointer(address, size);
    }
    
    
    /**
     * Native method to retrieve any Vulkan struct size, in bytes
     * 
     * @TODO - include Vulkan Unions 
     * 
     * @param structID - ID of structure.  
     * @return size in bytes of structure
     */
    public static final native int sizeOf(int structID);/*
     
     size_t _size = 0; 
     switch((int)(structID)){
         case bor_vulkan_structs_VkStruct_VKAPPLICATIONINFO_ID   :  _size = sizeof(VkApplicationInfo);break;
         case bor_vulkan_structs_VkStruct_VKINSTANCECREATEINFO_ID   :  _size = sizeof(VkInstanceCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKALLOCATIONCALLBACKS_ID   :  _size = sizeof(VkAllocationCallbacks);break;
         case bor_vulkan_structs_VkStruct_VKPHYSICALDEVICEFEATURES_ID   :  _size = sizeof(VkPhysicalDeviceFeatures);break;
         case bor_vulkan_structs_VkStruct_VKFORMATPROPERTIES_ID   :  _size = sizeof(VkFormatProperties);break;
         case bor_vulkan_structs_VkStruct_VKEXTENT3D_ID   :  _size = sizeof(VkExtent3D);break;
         case bor_vulkan_structs_VkStruct_VKIMAGEFORMATPROPERTIES_ID   :  _size = sizeof(VkImageFormatProperties);break;
         case bor_vulkan_structs_VkStruct_VKPHYSICALDEVICELIMITS_ID   :  _size = sizeof(VkPhysicalDeviceLimits);break;
         case bor_vulkan_structs_VkStruct_VKPHYSICALDEVICESPARSEPROPERTIES_ID   :  _size = sizeof(VkPhysicalDeviceSparseProperties);break;
         case bor_vulkan_structs_VkStruct_VKPHYSICALDEVICEPROPERTIES_ID   :  _size = sizeof(VkPhysicalDeviceProperties);break;
         case bor_vulkan_structs_VkStruct_VKQUEUEFAMILYPROPERTIES_ID   :  _size = sizeof(VkQueueFamilyProperties);break;
         case bor_vulkan_structs_VkStruct_VKMEMORYTYPE_ID   :  _size = sizeof(VkMemoryType);break;
         case bor_vulkan_structs_VkStruct_VKMEMORYHEAP_ID   :  _size = sizeof(VkMemoryHeap);break;
         case bor_vulkan_structs_VkStruct_VKPHYSICALDEVICEMEMORYPROPERTIES_ID   :  _size = sizeof(VkPhysicalDeviceMemoryProperties);break;
         case bor_vulkan_structs_VkStruct_VKDEVICEQUEUECREATEINFO_ID   :  _size = sizeof(VkDeviceQueueCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKDEVICECREATEINFO_ID   :  _size = sizeof(VkDeviceCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKEXTENSIONPROPERTIES_ID   :  _size = sizeof(VkExtensionProperties);break;
         case bor_vulkan_structs_VkStruct_VKLAYERPROPERTIES_ID   :  _size = sizeof(VkLayerProperties);break;
         case bor_vulkan_structs_VkStruct_VKSUBMITINFO_ID   :  _size = sizeof(VkSubmitInfo);break;
         case bor_vulkan_structs_VkStruct_VKMEMORYALLOCATEINFO_ID   :  _size = sizeof(VkMemoryAllocateInfo);break;
         case bor_vulkan_structs_VkStruct_VKMAPPEDMEMORYRANGE_ID   :  _size = sizeof(VkMappedMemoryRange);break;
         case bor_vulkan_structs_VkStruct_VKMEMORYREQUIREMENTS_ID   :  _size = sizeof(VkMemoryRequirements);break;
         case bor_vulkan_structs_VkStruct_VKSPARSEIMAGEFORMATPROPERTIES_ID   :  _size = sizeof(VkSparseImageFormatProperties);break;
         case bor_vulkan_structs_VkStruct_VKSPARSEIMAGEMEMORYREQUIREMENTS_ID   :  _size = sizeof(VkSparseImageMemoryRequirements);break;
         case bor_vulkan_structs_VkStruct_VKSPARSEMEMORYBIND_ID   :  _size = sizeof(VkSparseMemoryBind);break;
         case bor_vulkan_structs_VkStruct_VKSPARSEBUFFERMEMORYBINDINFO_ID   :  _size = sizeof(VkSparseBufferMemoryBindInfo);break;
         case bor_vulkan_structs_VkStruct_VKSPARSEIMAGEOPAQUEMEMORYBINDINFO_ID   :  _size = sizeof(VkSparseImageOpaqueMemoryBindInfo);break;
         case bor_vulkan_structs_VkStruct_VKIMAGESUBRESOURCE_ID   :  _size = sizeof(VkImageSubresource);break;
         case bor_vulkan_structs_VkStruct_VKOFFSET3D_ID   :  _size = sizeof(VkOffset3D);break;
         case bor_vulkan_structs_VkStruct_VKSPARSEIMAGEMEMORYBIND_ID   :  _size = sizeof(VkSparseImageMemoryBind);break;
         case bor_vulkan_structs_VkStruct_VKSPARSEIMAGEMEMORYBINDINFO_ID   :  _size = sizeof(VkSparseImageMemoryBindInfo);break;
         case bor_vulkan_structs_VkStruct_VKBINDSPARSEINFO_ID   :  _size = sizeof(VkBindSparseInfo);break;
         case bor_vulkan_structs_VkStruct_VKFENCECREATEINFO_ID   :  _size = sizeof(VkFenceCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKSEMAPHORECREATEINFO_ID   :  _size = sizeof(VkSemaphoreCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKEVENTCREATEINFO_ID   :  _size = sizeof(VkEventCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKQUERYPOOLCREATEINFO_ID   :  _size = sizeof(VkQueryPoolCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKBUFFERCREATEINFO_ID   :  _size = sizeof(VkBufferCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKBUFFERVIEWCREATEINFO_ID   :  _size = sizeof(VkBufferViewCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKIMAGECREATEINFO_ID   :  _size = sizeof(VkImageCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKSUBRESOURCELAYOUT_ID   :  _size = sizeof(VkSubresourceLayout);break;
         case bor_vulkan_structs_VkStruct_VKCOMPONENTMAPPING_ID   :  _size = sizeof(VkComponentMapping);break;
         case bor_vulkan_structs_VkStruct_VKIMAGESUBRESOURCERANGE_ID   :  _size = sizeof(VkImageSubresourceRange);break;
         case bor_vulkan_structs_VkStruct_VKIMAGEVIEWCREATEINFO_ID   :  _size = sizeof(VkImageViewCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKSHADERMODULECREATEINFO_ID   :  _size = sizeof(VkShaderModuleCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINECACHECREATEINFO_ID   :  _size = sizeof(VkPipelineCacheCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKSPECIALIZATIONMAPENTRY_ID   :  _size = sizeof(VkSpecializationMapEntry);break;
         case bor_vulkan_structs_VkStruct_VKSPECIALIZATIONINFO_ID   :  _size = sizeof(VkSpecializationInfo);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINESHADERSTAGECREATEINFO_ID   :  _size = sizeof(VkPipelineShaderStageCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKVERTEXINPUTBINDINGDESCRIPTION_ID   :  _size = sizeof(VkVertexInputBindingDescription);break;
         case bor_vulkan_structs_VkStruct_VKVERTEXINPUTATTRIBUTEDESCRIPTION_ID   :  _size = sizeof(VkVertexInputAttributeDescription);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINEVERTEXINPUTSTATECREATEINFO_ID   :  _size = sizeof(VkPipelineVertexInputStateCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINEINPUTASSEMBLYSTATECREATEINFO_ID   :  _size = sizeof(VkPipelineInputAssemblyStateCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINETESSELLATIONSTATECREATEINFO_ID   :  _size = sizeof(VkPipelineTessellationStateCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKVIEWPORT_ID   :  _size = sizeof(VkViewport);break;
         case bor_vulkan_structs_VkStruct_VKOFFSET2D_ID   :  _size = sizeof(VkOffset2D);break;
         case bor_vulkan_structs_VkStruct_VKEXTENT2D_ID   :  _size = sizeof(VkExtent2D);break;
         case bor_vulkan_structs_VkStruct_VKRECT2D_ID   :  _size = sizeof(VkRect2D);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINEVIEWPORTSTATECREATEINFO_ID   :  _size = sizeof(VkPipelineViewportStateCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINERASTERIZATIONSTATECREATEINFO_ID   :  _size = sizeof(VkPipelineRasterizationStateCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINEMULTISAMPLESTATECREATEINFO_ID   :  _size = sizeof(VkPipelineMultisampleStateCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKSTENCILOPSTATE_ID   :  _size = sizeof(VkStencilOpState);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINEDEPTHSTENCILSTATECREATEINFO_ID   :  _size = sizeof(VkPipelineDepthStencilStateCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINECOLORBLENDATTACHMENTSTATE_ID   :  _size = sizeof(VkPipelineColorBlendAttachmentState);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINECOLORBLENDSTATECREATEINFO_ID   :  _size = sizeof(VkPipelineColorBlendStateCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINEDYNAMICSTATECREATEINFO_ID   :  _size = sizeof(VkPipelineDynamicStateCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKGRAPHICSPIPELINECREATEINFO_ID   :  _size = sizeof(VkGraphicsPipelineCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKCOMPUTEPIPELINECREATEINFO_ID   :  _size = sizeof(VkComputePipelineCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKPUSHCONSTANTRANGE_ID   :  _size = sizeof(VkPushConstantRange);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINELAYOUTCREATEINFO_ID   :  _size = sizeof(VkPipelineLayoutCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKSAMPLERCREATEINFO_ID   :  _size = sizeof(VkSamplerCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKDESCRIPTORSETLAYOUTBINDING_ID   :  _size = sizeof(VkDescriptorSetLayoutBinding);break;
         case bor_vulkan_structs_VkStruct_VKDESCRIPTORSETLAYOUTCREATEINFO_ID   :  _size = sizeof(VkDescriptorSetLayoutCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKDESCRIPTORPOOLSIZE_ID   :  _size = sizeof(VkDescriptorPoolSize);break;
         case bor_vulkan_structs_VkStruct_VKDESCRIPTORPOOLCREATEINFO_ID   :  _size = sizeof(VkDescriptorPoolCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKDESCRIPTORSETALLOCATEINFO_ID   :  _size = sizeof(VkDescriptorSetAllocateInfo);break;
         case bor_vulkan_structs_VkStruct_VKDESCRIPTORIMAGEINFO_ID   :  _size = sizeof(VkDescriptorImageInfo);break;
         case bor_vulkan_structs_VkStruct_VKDESCRIPTORBUFFERINFO_ID   :  _size = sizeof(VkDescriptorBufferInfo);break;
         case bor_vulkan_structs_VkStruct_VKWRITEDESCRIPTORSET_ID   :  _size = sizeof(VkWriteDescriptorSet);break;
         case bor_vulkan_structs_VkStruct_VKCOPYDESCRIPTORSET_ID   :  _size = sizeof(VkCopyDescriptorSet);break;
         case bor_vulkan_structs_VkStruct_VKFRAMEBUFFERCREATEINFO_ID   :  _size = sizeof(VkFramebufferCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKATTACHMENTDESCRIPTION_ID   :  _size = sizeof(VkAttachmentDescription);break;
         case bor_vulkan_structs_VkStruct_VKATTACHMENTREFERENCE_ID   :  _size = sizeof(VkAttachmentReference);break;
         case bor_vulkan_structs_VkStruct_VKSUBPASSDESCRIPTION_ID   :  _size = sizeof(VkSubpassDescription);break;
         case bor_vulkan_structs_VkStruct_VKSUBPASSDEPENDENCY_ID   :  _size = sizeof(VkSubpassDependency);break;
         case bor_vulkan_structs_VkStruct_VKRENDERPASSCREATEINFO_ID   :  _size = sizeof(VkRenderPassCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKCOMMANDPOOLCREATEINFO_ID   :  _size = sizeof(VkCommandPoolCreateInfo);break;
         case bor_vulkan_structs_VkStruct_VKCOMMANDBUFFERALLOCATEINFO_ID   :  _size = sizeof(VkCommandBufferAllocateInfo);break;
         case bor_vulkan_structs_VkStruct_VKCOMMANDBUFFERINHERITANCEINFO_ID   :  _size = sizeof(VkCommandBufferInheritanceInfo);break;
         case bor_vulkan_structs_VkStruct_VKCOMMANDBUFFERBEGININFO_ID   :  _size = sizeof(VkCommandBufferBeginInfo);break;
         case bor_vulkan_structs_VkStruct_VKBUFFERCOPY_ID   :  _size = sizeof(VkBufferCopy);break;
         case bor_vulkan_structs_VkStruct_VKIMAGESUBRESOURCELAYERS_ID   :  _size = sizeof(VkImageSubresourceLayers);break;
         case bor_vulkan_structs_VkStruct_VKIMAGECOPY_ID   :  _size = sizeof(VkImageCopy);break;
         case bor_vulkan_structs_VkStruct_VKIMAGEBLIT_ID   :  _size = sizeof(VkImageBlit);break;
         case bor_vulkan_structs_VkStruct_VKBUFFERIMAGECOPY_ID   :  _size = sizeof(VkBufferImageCopy);break;
         case bor_vulkan_structs_VkStruct_VKCLEARDEPTHSTENCILVALUE_ID   :  _size = sizeof(VkClearDepthStencilValue);break;
         case bor_vulkan_structs_VkStruct_VKCLEARATTACHMENT_ID   :  _size = sizeof(VkClearAttachment);break;
         case bor_vulkan_structs_VkStruct_VKCLEARRECT_ID   :  _size = sizeof(VkClearRect);break;
         case bor_vulkan_structs_VkStruct_VKIMAGERESOLVE_ID   :  _size = sizeof(VkImageResolve);break;
         case bor_vulkan_structs_VkStruct_VKMEMORYBARRIER_ID   :  _size = sizeof(VkMemoryBarrier);break;
         case bor_vulkan_structs_VkStruct_VKBUFFERMEMORYBARRIER_ID   :  _size = sizeof(VkBufferMemoryBarrier);break;
         case bor_vulkan_structs_VkStruct_VKIMAGEMEMORYBARRIER_ID   :  _size = sizeof(VkImageMemoryBarrier);break;
         case bor_vulkan_structs_VkStruct_VKRENDERPASSBEGININFO_ID   :  _size = sizeof(VkRenderPassBeginInfo);break;
         case bor_vulkan_structs_VkStruct_VKDISPATCHINDIRECTCOMMAND_ID   :  _size = sizeof(VkDispatchIndirectCommand);break;
         case bor_vulkan_structs_VkStruct_VKDRAWINDEXEDINDIRECTCOMMAND_ID   :  _size = sizeof(VkDrawIndexedIndirectCommand);break;
         case bor_vulkan_structs_VkStruct_VKDRAWINDIRECTCOMMAND_ID   :  _size = sizeof(VkDrawIndirectCommand);break;
         case bor_vulkan_structs_VkStruct_VKSURFACECAPABILITIESKHR_ID   :  _size = sizeof(VkSurfaceCapabilitiesKHR);break;
         case bor_vulkan_structs_VkStruct_VKSURFACEFORMATKHR_ID   :  _size = sizeof(VkSurfaceFormatKHR);break;
         case bor_vulkan_structs_VkStruct_VKSWAPCHAINCREATEINFOKHR_ID   :  _size = sizeof(VkSwapchainCreateInfoKHR);break;
         case bor_vulkan_structs_VkStruct_VKPRESENTINFOKHR_ID   :  _size = sizeof(VkPresentInfoKHR);break;
         case bor_vulkan_structs_VkStruct_VKDISPLAYPROPERTIESKHR_ID   :  _size = sizeof(VkDisplayPropertiesKHR);break;
         case bor_vulkan_structs_VkStruct_VKDISPLAYMODEPARAMETERSKHR_ID   :  _size = sizeof(VkDisplayModeParametersKHR);break;
         case bor_vulkan_structs_VkStruct_VKDISPLAYMODEPROPERTIESKHR_ID   :  _size = sizeof(VkDisplayModePropertiesKHR);break;
         case bor_vulkan_structs_VkStruct_VKDISPLAYMODECREATEINFOKHR_ID   :  _size = sizeof(VkDisplayModeCreateInfoKHR);break;
         case bor_vulkan_structs_VkStruct_VKDISPLAYPLANECAPABILITIESKHR_ID   :  _size = sizeof(VkDisplayPlaneCapabilitiesKHR);break;
         case bor_vulkan_structs_VkStruct_VKDISPLAYPLANEPROPERTIESKHR_ID   :  _size = sizeof(VkDisplayPlanePropertiesKHR);break;
         case bor_vulkan_structs_VkStruct_VKDISPLAYSURFACECREATEINFOKHR_ID   :  _size = sizeof(VkDisplaySurfaceCreateInfoKHR);break;
         case bor_vulkan_structs_VkStruct_VKDISPLAYPRESENTINFOKHR_ID   :  _size = sizeof(VkDisplayPresentInfoKHR);break;
//         case bor_vulkan_structs_VkStruct_VKXLIBSURFACECREATEINFOKHR_ID   :  _size = sizeof(VkXlibSurfaceCreateInfoKHR);break;
//         case bor_vulkan_structs_VkStruct_VKXCBSURFACECREATEINFOKHR_ID   :  _size = sizeof(VkXcbSurfaceCreateInfoKHR);break;
//         case bor_vulkan_structs_VkStruct_VKWAYLANDSURFACECREATEINFOKHR_ID   :  _size = sizeof(VkWaylandSurfaceCreateInfoKHR);break;
//         case bor_vulkan_structs_VkStruct_VKMIRSURFACECREATEINFOKHR_ID   :  _size = sizeof(VkMirSurfaceCreateInfoKHR);break;
//         case bor_vulkan_structs_VkStruct_VKANDROIDSURFACECREATEINFOKHR_ID   :  _size = sizeof(VkAndroidSurfaceCreateInfoKHR);break;
//         case bor_vulkan_structs_VkStruct_VKWIN32SURFACECREATEINFOKHR_ID   :  _size = sizeof(VkWin32SurfaceCreateInfoKHR);break;
         case bor_vulkan_structs_VkStruct_VKDEBUGREPORTCALLBACKCREATEINFOEXT_ID   :  _size = sizeof(VkDebugReportCallbackCreateInfoEXT);break;
         case bor_vulkan_structs_VkStruct_VKPIPELINERASTERIZATIONSTATERASTERIZATIONORDERAMD_ID   :  _size = sizeof(VkPipelineRasterizationStateRasterizationOrderAMD);break;
         case bor_vulkan_structs_VkStruct_VKDEBUGMARKEROBJECTNAMEINFOEXT_ID   :  _size = sizeof(VkDebugMarkerObjectNameInfoEXT);break;
         case bor_vulkan_structs_VkStruct_VKDEBUGMARKEROBJECTTAGINFOEXT_ID   :  _size = sizeof(VkDebugMarkerObjectTagInfoEXT);break;
         case bor_vulkan_structs_VkStruct_VKDEBUGMARKERMARKERINFOEXT_ID   :  _size = sizeof(VkDebugMarkerMarkerInfoEXT);break;
         case bor_vulkan_structs_VkStruct_VKDEDICATEDALLOCATIONIMAGECREATEINFONV_ID   :  _size = sizeof(VkDedicatedAllocationImageCreateInfoNV);break;
         case bor_vulkan_structs_VkStruct_VKDEDICATEDALLOCATIONBUFFERCREATEINFONV_ID   :  _size = sizeof(VkDedicatedAllocationBufferCreateInfoNV);break;
         case bor_vulkan_structs_VkStruct_VKDEDICATEDALLOCATIONMEMORYALLOCATEINFONV_ID   :  _size = sizeof(VkDedicatedAllocationMemoryAllocateInfoNV);break;
         case bor_vulkan_structs_VkStruct_VKCLEARVALUE_ID   :  _size = sizeof(VkClearValue);break;
         case bor_vulkan_structs_VkStruct_VKCLEARCOLORVALUE_ID   :  _size = sizeof(VkClearColorValue);break;
        
         
       #ifdef VK_USE_PLATFORM_XLIB_KHR
         case bor_vulkan_structs_VkStruct_VKXLIBSURFACECREATEINFOKHR_ID :  _size = sizeof(VkXlibSurfaceCreateInfoKHR);break;
       #endif  
       #ifdef VK_USE_PLATFORM_XCB_KHR
         case bor_vulkan_structs_VkStruct_VKXCBSURFACECREATEINFOKHR_ID :  _size = sizeof(VkXcbSurfaceCreateInfoKHR);break;
       #endif  
       #ifdef VK_USE_PLATFORM_WAYLAND_KHR
         case bor_vulkan_structs_VkStruct_VKWAYLANDSURFACECREATEINFOKHR_ID :  _size = sizeof(VkWaylandSurfaceCreateInfoKHR);break;
       #endif  
       #ifdef VK_USE_PLATFORM_MIR_KHR
         case bor_vulkan_structs_VkStruct_VKMIRSURFACECREATEINFOKHR_ID :  _size = sizeof(VkMirSurfaceCreateInfoKHR);break;
       #endif 
       #ifdef VK_USE_PLATFORM_ANDROID_KHR 
         case bor_vulkan_structs_VkStruct_VKANDROIDSURFACECREATEINFOKHR_ID :  _size = sizeof(VkAndroidSurfaceCreateInfoKHR);break;
       #endif
       #ifdef VK_USE_PLATFORM_WIN32_KHR  
         case bor_vulkan_structs_VkStruct_VKWIN32SURFACECREATEINFOKHR_ID :  _size = sizeof(VkWin32SurfaceCreateInfoKHR);break;
       #endif
       
       default: _size = 0;break;
     }// switch
         
     return (jint)(_size);
         
    */

   
    /**
     * Create and populate direct, garbage collectable, IntBuffer 
     * @param data - data to put it
     * @return a IntBuffer with data[] content, with postion 0
     */
    protected IntBuffer allocateBuffer(int[] data){
        if(data == null) 
            return null;        
       ByteBuffer bb = createBuffer(4*data.length);
       IntBuffer buffer =  bb.asIntBuffer();
       buffer.put(data);
       buffer.rewind();
       buffer.capacity();
       return buffer;
    }
    
    /**
     * Create and populate direct, garbage collectable, FloatBuffer 
     * @param data - data to put it
     * @return a IntBuffer with data[] content, with postion 0
     */
    protected FloatBuffer allocateBuffer(float[] data){
        if(data == null) 
            return null;        
       ByteBuffer bb = createBuffer(4*data.length);
       FloatBuffer buffer =  bb.asFloatBuffer();
       buffer.put(data);
       buffer.rewind();
       return buffer;
    }
    
    /**
     * Create a direct ByteBuffer. 
     * @param sizeBytes - size in bytes
     * @return Direct buffer, garbage collectable 
     */
    protected static ByteBuffer createBuffer(int sizeBytes){
        ByteBuffer bb = ByteBuffer.allocateDirect(sizeBytes);
        bb.order(ByteOrder.nativeOrder());
        return bb;
    }
    
    /**
     * Get name of VkStruct by ID.
     * @see static getID() method in VkStructs.
     *  
     * @param struct_ID - VkStruct ID. Use static <b>getID()</b> method 
     * to discover the ID of that VkStruct subclass.
     *  
     * @return Name of VkStruct subclass.
     */
    public static String getStructureName(int struct_ID){
        switch (struct_ID) {
            case   VKAPPLICATIONINFO_ID    :   return "VkApplicationInfo";
            case   VKINSTANCECREATEINFO_ID    :   return "VkInstanceCreateInfo";
            case   VKALLOCATIONCALLBACKS_ID    :   return "VkAllocationCallbacks";
            case   VKPHYSICALDEVICEFEATURES_ID    :   return "VkPhysicalDeviceFeatures";
            case   VKFORMATPROPERTIES_ID    :   return "VkFormatProperties";
            case   VKEXTENT3D_ID    :   return "VkExtent3D";
            case   VKIMAGEFORMATPROPERTIES_ID    :   return "VkImageFormatProperties";
            case   VKPHYSICALDEVICELIMITS_ID    :   return "VkPhysicalDeviceLimits";
            case   VKPHYSICALDEVICESPARSEPROPERTIES_ID    :   return "VkPhysicalDeviceSparseProperties";
            case   VKPHYSICALDEVICEPROPERTIES_ID    :   return "VkPhysicalDeviceProperties";
            case   VKQUEUEFAMILYPROPERTIES_ID    :   return "VkQueueFamilyProperties";
            case   VKMEMORYTYPE_ID    :   return "VkMemoryType";
            case   VKMEMORYHEAP_ID    :   return "VkMemoryHeap";
            case   VKPHYSICALDEVICEMEMORYPROPERTIES_ID    :   return "VkPhysicalDeviceMemoryProperties";
            case   VKDEVICEQUEUECREATEINFO_ID    :   return "VkDeviceQueueCreateInfo";
            case   VKDEVICECREATEINFO_ID    :   return "VkDeviceCreateInfo";
            case   VKEXTENSIONPROPERTIES_ID    :   return "VkExtensionProperties";
            case   VKLAYERPROPERTIES_ID    :   return "VkLayerProperties";
            case   VKSUBMITINFO_ID    :   return "VkSubmitInfo";
            case   VKMEMORYALLOCATEINFO_ID    :   return "VkMemoryAllocateInfo";
            case   VKMAPPEDMEMORYRANGE_ID    :   return "VkMappedMemoryRange";
            case   VKMEMORYREQUIREMENTS_ID    :   return "VkMemoryRequirements";
            case   VKSPARSEIMAGEFORMATPROPERTIES_ID    :   return "VkSparseImageFormatProperties";
            case   VKSPARSEIMAGEMEMORYREQUIREMENTS_ID    :   return "VkSparseImageMemoryRequirements";
            case   VKSPARSEMEMORYBIND_ID    :   return "VkSparseMemoryBind";
            case   VKSPARSEBUFFERMEMORYBINDINFO_ID    :   return "VkSparseBufferMemoryBindInfo";
            case   VKSPARSEIMAGEOPAQUEMEMORYBINDINFO_ID    :   return "VkSparseImageOpaqueMemoryBindInfo";
            case   VKIMAGESUBRESOURCE_ID    :   return "VkImageSubresource";
            case   VKOFFSET3D_ID    :   return "VkOffset3D";
            case   VKSPARSEIMAGEMEMORYBIND_ID    :   return "VkSparseImageMemoryBind";
            case   VKSPARSEIMAGEMEMORYBINDINFO_ID    :   return "VkSparseImageMemoryBindInfo";
            case   VKBINDSPARSEINFO_ID    :   return "VkBindSparseInfo";
            case   VKFENCECREATEINFO_ID    :   return "VkFenceCreateInfo";
            case   VKSEMAPHORECREATEINFO_ID    :   return "VkSemaphoreCreateInfo";
            case   VKEVENTCREATEINFO_ID    :   return "VkEventCreateInfo";
            case   VKQUERYPOOLCREATEINFO_ID    :   return "VkQueryPoolCreateInfo";
            case   VKBUFFERCREATEINFO_ID    :   return "VkBufferCreateInfo";
            case   VKBUFFERVIEWCREATEINFO_ID    :   return "VkBufferViewCreateInfo";
            case   VKIMAGECREATEINFO_ID    :   return "VkImageCreateInfo";
            case   VKSUBRESOURCELAYOUT_ID    :   return "VkSubresourceLayout";
            case   VKCOMPONENTMAPPING_ID    :   return "VkComponentMapping";
            case   VKIMAGESUBRESOURCERANGE_ID    :   return "VkImageSubresourceRange";
            case   VKIMAGEVIEWCREATEINFO_ID    :   return "VkImageViewCreateInfo";
            case   VKSHADERMODULECREATEINFO_ID    :   return "VkShaderModuleCreateInfo";
            case   VKPIPELINECACHECREATEINFO_ID    :   return "VkPipelineCacheCreateInfo";
            case   VKSPECIALIZATIONMAPENTRY_ID    :   return "VkSpecializationMapEntry";
            case   VKSPECIALIZATIONINFO_ID    :   return "VkSpecializationInfo";
            case   VKPIPELINESHADERSTAGECREATEINFO_ID    :   return "VkPipelineShaderStageCreateInfo";
            case   VKVERTEXINPUTBINDINGDESCRIPTION_ID    :   return "VkVertexInputBindingDescription";
            case   VKVERTEXINPUTATTRIBUTEDESCRIPTION_ID    :   return "VkVertexInputAttributeDescription";
            case   VKPIPELINEVERTEXINPUTSTATECREATEINFO_ID    :   return "VkPipelineVertexInputStateCreateInfo";
            case   VKPIPELINEINPUTASSEMBLYSTATECREATEINFO_ID    :   return "VkPipelineInputAssemblyStateCreateInfo";
            case   VKPIPELINETESSELLATIONSTATECREATEINFO_ID    :   return "VkPipelineTessellationStateCreateInfo";
            case   VKVIEWPORT_ID    :   return "VkViewport";
            case   VKOFFSET2D_ID    :   return "VkOffset2D";
            case   VKEXTENT2D_ID    :   return "VkExtent2D";
            case   VKRECT2D_ID    :   return "VkRect2D";
            case   VKPIPELINEVIEWPORTSTATECREATEINFO_ID    :   return "VkPipelineViewportStateCreateInfo";
            case   VKPIPELINERASTERIZATIONSTATECREATEINFO_ID    :   return "VkPipelineRasterizationStateCreateInfo";
            case   VKPIPELINEMULTISAMPLESTATECREATEINFO_ID    :   return "VkPipelineMultisampleStateCreateInfo";
            case   VKSTENCILOPSTATE_ID    :   return "VkStencilOpState";
            case   VKPIPELINEDEPTHSTENCILSTATECREATEINFO_ID    :   return "VkPipelineDepthStencilStateCreateInfo";
            case   VKPIPELINECOLORBLENDATTACHMENTSTATE_ID    :   return "VkPipelineColorBlendAttachmentState";
            case   VKPIPELINECOLORBLENDSTATECREATEINFO_ID    :   return "VkPipelineColorBlendStateCreateInfo";
            case   VKPIPELINEDYNAMICSTATECREATEINFO_ID    :   return "VkPipelineDynamicStateCreateInfo";
            case   VKGRAPHICSPIPELINECREATEINFO_ID    :   return "VkGraphicsPipelineCreateInfo";
            case   VKCOMPUTEPIPELINECREATEINFO_ID    :   return "VkComputePipelineCreateInfo";
            case   VKPUSHCONSTANTRANGE_ID    :   return "VkPushConstantRange";
            case   VKPIPELINELAYOUTCREATEINFO_ID    :   return "VkPipelineLayoutCreateInfo";
            case   VKSAMPLERCREATEINFO_ID    :   return "VkSamplerCreateInfo";
            case   VKDESCRIPTORSETLAYOUTBINDING_ID    :   return "VkDescriptorSetLayoutBinding";
            case   VKDESCRIPTORSETLAYOUTCREATEINFO_ID    :   return "VkDescriptorSetLayoutCreateInfo";
            case   VKDESCRIPTORPOOLSIZE_ID    :   return "VkDescriptorPoolSize";
            case   VKDESCRIPTORPOOLCREATEINFO_ID    :   return "VkDescriptorPoolCreateInfo";
            case   VKDESCRIPTORSETALLOCATEINFO_ID    :   return "VkDescriptorSetAllocateInfo";
            case   VKDESCRIPTORIMAGEINFO_ID    :   return "VkDescriptorImageInfo";
            case   VKDESCRIPTORBUFFERINFO_ID    :   return "VkDescriptorBufferInfo";
            case   VKWRITEDESCRIPTORSET_ID    :   return "VkWriteDescriptorSet";
            case   VKCOPYDESCRIPTORSET_ID    :   return "VkCopyDescriptorSet";
            case   VKFRAMEBUFFERCREATEINFO_ID    :   return "VkFramebufferCreateInfo";
            case   VKATTACHMENTDESCRIPTION_ID    :   return "VkAttachmentDescription";
            case   VKATTACHMENTREFERENCE_ID    :   return "VkAttachmentReference";
            case   VKSUBPASSDESCRIPTION_ID    :   return "VkSubpassDescription";
            case   VKSUBPASSDEPENDENCY_ID    :   return "VkSubpassDependency";
            case   VKRENDERPASSCREATEINFO_ID    :   return "VkRenderPassCreateInfo";
            case   VKCOMMANDPOOLCREATEINFO_ID    :   return "VkCommandPoolCreateInfo";
            case   VKCOMMANDBUFFERALLOCATEINFO_ID    :   return "VkCommandBufferAllocateInfo";
            case   VKCOMMANDBUFFERINHERITANCEINFO_ID    :   return "VkCommandBufferInheritanceInfo";
            case   VKCOMMANDBUFFERBEGININFO_ID    :   return "VkCommandBufferBeginInfo";
            case   VKBUFFERCOPY_ID    :   return "VkBufferCopy";
            case   VKIMAGESUBRESOURCELAYERS_ID    :   return "VkImageSubresourceLayers";
            case   VKIMAGECOPY_ID    :   return "VkImageCopy";
            case   VKIMAGEBLIT_ID    :   return "VkImageBlit";
            case   VKBUFFERIMAGECOPY_ID    :   return "VkBufferImageCopy";
            case   VKCLEARDEPTHSTENCILVALUE_ID    :   return "VkClearDepthStencilValue";
            case   VKCLEARATTACHMENT_ID    :   return "VkClearAttachment";
            case   VKCLEARVALUE_ID    :   return "VkClearValue";
            case   VKCLEARCOLORVALUE_ID    :   return "VkClearColorValue";
            case   VKCLEARRECT_ID    :   return "VkClearRect";
            case   VKIMAGERESOLVE_ID    :   return "VkImageResolve";
            case   VKMEMORYBARRIER_ID    :   return "VkMemoryBarrier";
            case   VKBUFFERMEMORYBARRIER_ID    :   return "VkBufferMemoryBarrier";
            case   VKIMAGEMEMORYBARRIER_ID    :   return "VkImageMemoryBarrier";
            case   VKRENDERPASSBEGININFO_ID    :   return "VkRenderPassBeginInfo";
            case   VKDISPATCHINDIRECTCOMMAND_ID    :   return "VkDispatchIndirectCommand";
            case   VKDRAWINDEXEDINDIRECTCOMMAND_ID    :   return "VkDrawIndexedIndirectCommand";
            case   VKDRAWINDIRECTCOMMAND_ID    :   return "VkDrawIndirectCommand";
            case   VKSURFACECAPABILITIESKHR_ID    :   return "VkSurfaceCapabilitiesKHR";
            case   VKSURFACEFORMATKHR_ID    :   return "VkSurfaceFormatKHR";
            case   VKSWAPCHAINCREATEINFOKHR_ID    :   return "VkSwapchainCreateInfoKHR";
            case   VKPRESENTINFOKHR_ID    :   return "VkPresentInfoKHR";
            case   VKDISPLAYPROPERTIESKHR_ID    :   return "VkDisplayPropertiesKHR";
            case   VKDISPLAYMODEPARAMETERSKHR_ID    :   return "VkDisplayModeParametersKHR";
            case   VKDISPLAYMODEPROPERTIESKHR_ID    :   return "VkDisplayModePropertiesKHR";
            case   VKDISPLAYMODECREATEINFOKHR_ID    :   return "VkDisplayModeCreateInfoKHR";
            case   VKDISPLAYPLANECAPABILITIESKHR_ID    :   return "VkDisplayPlaneCapabilitiesKHR";
            case   VKDISPLAYPLANEPROPERTIESKHR_ID    :   return "VkDisplayPlanePropertiesKHR";
            case   VKDISPLAYSURFACECREATEINFOKHR_ID    :   return "VkDisplaySurfaceCreateInfoKHR";
            case   VKDISPLAYPRESENTINFOKHR_ID    :   return "VkDisplayPresentInfoKHR";
            case   VKXLIBSURFACECREATEINFOKHR_ID    :   return "VkXlibSurfaceCreateInfoKHR";
            case   VKXCBSURFACECREATEINFOKHR_ID    :   return "VkXcbSurfaceCreateInfoKHR";
            case   VKWAYLANDSURFACECREATEINFOKHR_ID    :   return "VkWaylandSurfaceCreateInfoKHR";
            case   VKMIRSURFACECREATEINFOKHR_ID    :   return "VkMirSurfaceCreateInfoKHR";
            case   VKANDROIDSURFACECREATEINFOKHR_ID    :   return "VkAndroidSurfaceCreateInfoKHR";
            case   VKWIN32SURFACECREATEINFOKHR_ID    :   return "VkWin32SurfaceCreateInfoKHR";
            case   VKDEBUGREPORTCALLBACKCREATEINFOEXT_ID    :   return "VkDebugReportCallbackCreateInfoEXT";
            case   VKPIPELINERASTERIZATIONSTATERASTERIZATIONORDERAMD_ID    :   return "VkPipelineRasterizationStateRasterizationOrderAMD";
            case   VKDEBUGMARKEROBJECTNAMEINFOEXT_ID    :   return "VkDebugMarkerObjectNameInfoEXT";
            case   VKDEBUGMARKEROBJECTTAGINFOEXT_ID    :   return "VkDebugMarkerObjectTagInfoEXT";
            case   VKDEBUGMARKERMARKERINFOEXT_ID    :   return "VkDebugMarkerMarkerInfoEXT";
            case   VKDEDICATEDALLOCATIONIMAGECREATEINFONV_ID    :   return "VkDedicatedAllocationImageCreateInfoNV";
            case   VKDEDICATEDALLOCATIONBUFFERCREATEINFONV_ID    :   return "VkDedicatedAllocationBufferCreateInfoNV";
            case   VKDEDICATEDALLOCATIONMEMORYALLOCATEINFONV_ID    :   return "VkDedicatedAllocationMemoryAllocateInfoNV";

            default:
                return "unknown struct.";
        }
    }
    
    /**
     * Creates a new Instance of a VkStruct
     * @param id - VkStruct ID
     * @param buff - Buffer pointer
     * @return live instance of VkStruct 
     */
    public static VkStruct createInstance(int id, ByteBuffer buff){        
        switch (id) {
            case VKAPPLICATIONINFO_ID :  return   new VkApplicationInfo(buff);
            case VKINSTANCECREATEINFO_ID :  return   new VkInstanceCreateInfo(buff);
            case VKALLOCATIONCALLBACKS_ID :  return   new VkAllocationCallbacks(buff);
            case VKPHYSICALDEVICEFEATURES_ID :  return   new VkPhysicalDeviceFeatures(buff);
            case VKFORMATPROPERTIES_ID :  return   new VkFormatProperties(buff);
            case VKEXTENT3D_ID :  return   new VkExtent3D(buff);
            case VKIMAGEFORMATPROPERTIES_ID :  return   new VkImageFormatProperties(buff);
            case VKPHYSICALDEVICELIMITS_ID :  return   new VkPhysicalDeviceLimits(buff);
            case VKPHYSICALDEVICESPARSEPROPERTIES_ID :  return   new VkPhysicalDeviceSparseProperties(buff);
            case VKPHYSICALDEVICEPROPERTIES_ID :  return   new VkPhysicalDeviceProperties(buff);
            case VKQUEUEFAMILYPROPERTIES_ID :  return   new VkQueueFamilyProperties(buff);
            case VKMEMORYTYPE_ID :  return   new VkMemoryType(buff);
            case VKMEMORYHEAP_ID :  return   new VkMemoryHeap(buff);
            case VKPHYSICALDEVICEMEMORYPROPERTIES_ID :  return   new VkPhysicalDeviceMemoryProperties(buff);
            case VKDEVICEQUEUECREATEINFO_ID :  return   new VkDeviceQueueCreateInfo(buff);
            case VKDEVICECREATEINFO_ID :  return   new VkDeviceCreateInfo(buff);
            case VKEXTENSIONPROPERTIES_ID :  return   new VkExtensionProperties(buff);
            case VKLAYERPROPERTIES_ID :  return   new VkLayerProperties(buff);
            case VKSUBMITINFO_ID :  return   new VkSubmitInfo(buff);
            case VKMEMORYALLOCATEINFO_ID :  return   new VkMemoryAllocateInfo(buff);
            case VKMAPPEDMEMORYRANGE_ID :  return   new VkMappedMemoryRange(buff);
            case VKMEMORYREQUIREMENTS_ID :  return   new VkMemoryRequirements(buff);
            case VKSPARSEIMAGEFORMATPROPERTIES_ID :  return   new VkSparseImageFormatProperties(buff);
            case VKSPARSEIMAGEMEMORYREQUIREMENTS_ID :  return   new VkSparseImageMemoryRequirements(buff);
            case VKSPARSEMEMORYBIND_ID :  return   new VkSparseMemoryBind(buff);
            case VKSPARSEBUFFERMEMORYBINDINFO_ID :  return   new VkSparseBufferMemoryBindInfo(buff);
            case VKSPARSEIMAGEOPAQUEMEMORYBINDINFO_ID :  return   new VkSparseImageOpaqueMemoryBindInfo(buff);
            case VKIMAGESUBRESOURCE_ID :  return   new VkImageSubresource(buff);
            case VKOFFSET3D_ID :  return   new VkOffset3D(buff);
            case VKSPARSEIMAGEMEMORYBIND_ID :  return   new VkSparseImageMemoryBind(buff);
            case VKSPARSEIMAGEMEMORYBINDINFO_ID :  return   new VkSparseImageMemoryBindInfo(buff);
            case VKBINDSPARSEINFO_ID :  return   new VkBindSparseInfo(buff);
            case VKFENCECREATEINFO_ID :  return   new VkFenceCreateInfo(buff);
            case VKSEMAPHORECREATEINFO_ID :  return   new VkSemaphoreCreateInfo(buff);
            case VKEVENTCREATEINFO_ID :  return   new VkEventCreateInfo(buff);
            case VKQUERYPOOLCREATEINFO_ID :  return   new VkQueryPoolCreateInfo(buff);
            case VKBUFFERCREATEINFO_ID :  return   new VkBufferCreateInfo(buff);
            case VKBUFFERVIEWCREATEINFO_ID :  return   new VkBufferViewCreateInfo(buff);
            case VKIMAGECREATEINFO_ID :  return   new VkImageCreateInfo(buff);
            case VKSUBRESOURCELAYOUT_ID :  return   new VkSubresourceLayout(buff);
            case VKCOMPONENTMAPPING_ID :  return   new VkComponentMapping(buff);
            case VKIMAGESUBRESOURCERANGE_ID :  return   new VkImageSubresourceRange(buff);
            case VKIMAGEVIEWCREATEINFO_ID :  return   new VkImageViewCreateInfo(buff);
            case VKSHADERMODULECREATEINFO_ID :  return   new VkShaderModuleCreateInfo(buff);
            case VKPIPELINECACHECREATEINFO_ID :  return   new VkPipelineCacheCreateInfo(buff);
            case VKSPECIALIZATIONMAPENTRY_ID :  return   new VkSpecializationMapEntry(buff);
            case VKSPECIALIZATIONINFO_ID :  return   new VkSpecializationInfo(buff);
            case VKPIPELINESHADERSTAGECREATEINFO_ID :  return   new VkPipelineShaderStageCreateInfo(buff);
            case VKVERTEXINPUTBINDINGDESCRIPTION_ID :  return   new VkVertexInputBindingDescription(buff);
            case VKVERTEXINPUTATTRIBUTEDESCRIPTION_ID :  return   new VkVertexInputAttributeDescription(buff);
            case VKPIPELINEVERTEXINPUTSTATECREATEINFO_ID :  return   new VkPipelineVertexInputStateCreateInfo(buff);
            case VKPIPELINEINPUTASSEMBLYSTATECREATEINFO_ID :  return   new VkPipelineInputAssemblyStateCreateInfo(buff);
            case VKPIPELINETESSELLATIONSTATECREATEINFO_ID :  return   new VkPipelineTessellationStateCreateInfo(buff);
            case VKVIEWPORT_ID :  return   new VkViewport(buff);
            case VKOFFSET2D_ID :  return   new VkOffset2D(buff);
            case VKEXTENT2D_ID :  return   new VkExtent2D(buff);
            case VKRECT2D_ID :  return   new VkRect2D(buff);
            case VKPIPELINEVIEWPORTSTATECREATEINFO_ID :  return   new VkPipelineViewportStateCreateInfo(buff);
            case VKPIPELINERASTERIZATIONSTATECREATEINFO_ID :  return   new VkPipelineRasterizationStateCreateInfo(buff);
            case VKPIPELINEMULTISAMPLESTATECREATEINFO_ID :  return   new VkPipelineMultisampleStateCreateInfo(buff);
            case VKSTENCILOPSTATE_ID :  return   new VkStencilOpState(buff);
            case VKPIPELINEDEPTHSTENCILSTATECREATEINFO_ID :  return   new VkPipelineDepthStencilStateCreateInfo(buff);
            case VKPIPELINECOLORBLENDATTACHMENTSTATE_ID :  return   new VkPipelineColorBlendAttachmentState(buff);
            case VKPIPELINECOLORBLENDSTATECREATEINFO_ID :  return   new VkPipelineColorBlendStateCreateInfo(buff);
            case VKPIPELINEDYNAMICSTATECREATEINFO_ID :  return   new VkPipelineDynamicStateCreateInfo(buff);
            case VKGRAPHICSPIPELINECREATEINFO_ID :  return   new VkGraphicsPipelineCreateInfo(buff);
            case VKCOMPUTEPIPELINECREATEINFO_ID :  return   new VkComputePipelineCreateInfo(buff);
            case VKPUSHCONSTANTRANGE_ID :  return   new VkPushConstantRange(buff);
            case VKPIPELINELAYOUTCREATEINFO_ID :  return   new VkPipelineLayoutCreateInfo(buff);
            case VKSAMPLERCREATEINFO_ID :  return   new VkSamplerCreateInfo(buff);
            case VKDESCRIPTORSETLAYOUTBINDING_ID :  return   new VkDescriptorSetLayoutBinding(buff);
            case VKDESCRIPTORSETLAYOUTCREATEINFO_ID :  return   new VkDescriptorSetLayoutCreateInfo(buff);
            case VKDESCRIPTORPOOLSIZE_ID :  return   new VkDescriptorPoolSize(buff);
            case VKDESCRIPTORPOOLCREATEINFO_ID :  return   new VkDescriptorPoolCreateInfo(buff);
            case VKDESCRIPTORSETALLOCATEINFO_ID :  return   new VkDescriptorSetAllocateInfo(buff);
            case VKDESCRIPTORIMAGEINFO_ID :  return   new VkDescriptorImageInfo(buff);
            case VKDESCRIPTORBUFFERINFO_ID :  return   new VkDescriptorBufferInfo(buff);
            case VKWRITEDESCRIPTORSET_ID :  return   new VkWriteDescriptorSet(buff);
            case VKCOPYDESCRIPTORSET_ID :  return   new VkCopyDescriptorSet(buff);
            case VKFRAMEBUFFERCREATEINFO_ID :  return   new VkFramebufferCreateInfo(buff);
            case VKATTACHMENTDESCRIPTION_ID :  return   new VkAttachmentDescription(buff);
            case VKATTACHMENTREFERENCE_ID :  return   new VkAttachmentReference(buff);
            case VKSUBPASSDESCRIPTION_ID :  return   new VkSubpassDescription(buff);
            case VKSUBPASSDEPENDENCY_ID :  return   new VkSubpassDependency(buff);
            case VKRENDERPASSCREATEINFO_ID :  return   new VkRenderPassCreateInfo(buff);
            case VKCOMMANDPOOLCREATEINFO_ID :  return   new VkCommandPoolCreateInfo(buff);
            case VKCOMMANDBUFFERALLOCATEINFO_ID :  return   new VkCommandBufferAllocateInfo(buff);
            case VKCOMMANDBUFFERINHERITANCEINFO_ID :  return   new VkCommandBufferInheritanceInfo(buff);
            case VKCOMMANDBUFFERBEGININFO_ID :  return   new VkCommandBufferBeginInfo(buff);
            case VKBUFFERCOPY_ID :  return   new VkBufferCopy(buff);
            case VKIMAGESUBRESOURCELAYERS_ID :  return   new VkImageSubresourceLayers(buff);
            case VKIMAGECOPY_ID :  return   new VkImageCopy(buff);
            case VKIMAGEBLIT_ID :  return   new VkImageBlit(buff);
            case VKBUFFERIMAGECOPY_ID :  return   new VkBufferImageCopy(buff);
            case VKCLEARDEPTHSTENCILVALUE_ID :  return   new VkClearDepthStencilValue(buff);
            case VKCLEARATTACHMENT_ID :  return   new VkClearAttachment(buff);
            case VKCLEARRECT_ID :  return   new VkClearRect(buff);
            case VKIMAGERESOLVE_ID :  return   new VkImageResolve(buff);
            case VKMEMORYBARRIER_ID :  return   new VkMemoryBarrier(buff);
            case VKBUFFERMEMORYBARRIER_ID :  return   new VkBufferMemoryBarrier(buff);
            case VKIMAGEMEMORYBARRIER_ID :  return   new VkImageMemoryBarrier(buff);
            case VKRENDERPASSBEGININFO_ID :  return   new VkRenderPassBeginInfo(buff);
            case VKDISPATCHINDIRECTCOMMAND_ID :  return   new VkDispatchIndirectCommand(buff);
            case VKDRAWINDEXEDINDIRECTCOMMAND_ID :  return   new VkDrawIndexedIndirectCommand(buff);
            case VKDRAWINDIRECTCOMMAND_ID :  return   new VkDrawIndirectCommand(buff);
            case VKSURFACECAPABILITIESKHR_ID :  return   new VkSurfaceCapabilitiesKHR(buff);
            case VKSURFACEFORMATKHR_ID :  return   new VkSurfaceFormatKHR(buff);
            case VKSWAPCHAINCREATEINFOKHR_ID :  return   new VkSwapchainCreateInfoKHR(buff);
            case VKPRESENTINFOKHR_ID :  return   new VkPresentInfoKHR(buff);
            case VKDISPLAYPROPERTIESKHR_ID :  return   new VkDisplayPropertiesKHR(buff);
            case VKDISPLAYMODEPARAMETERSKHR_ID :  return   new VkDisplayModeParametersKHR(buff);
            case VKDISPLAYMODEPROPERTIESKHR_ID :  return   new VkDisplayModePropertiesKHR(buff);
            case VKDISPLAYMODECREATEINFOKHR_ID :  return   new VkDisplayModeCreateInfoKHR(buff);
            case VKDISPLAYPLANECAPABILITIESKHR_ID :  return   new VkDisplayPlaneCapabilitiesKHR(buff);
            case VKDISPLAYPLANEPROPERTIESKHR_ID :  return   new VkDisplayPlanePropertiesKHR(buff);
            case VKDISPLAYSURFACECREATEINFOKHR_ID :  return   new VkDisplaySurfaceCreateInfoKHR(buff);
            case VKDISPLAYPRESENTINFOKHR_ID :  return   new VkDisplayPresentInfoKHR(buff);
         
            case VKXLIBSURFACECREATEINFOKHR_ID :  return   new VkXlibSurfaceCreateInfoKHR(buff);
          
            case VKXCBSURFACECREATEINFOKHR_ID :  return   new VkXcbSurfaceCreateInfoKHR(buff);
         
            case VKWAYLANDSURFACECREATEINFOKHR_ID :  return   new VkWaylandSurfaceCreateInfoKHR(buff);
         
            case VKMIRSURFACECREATEINFOKHR_ID :  return   new VkMirSurfaceCreateInfoKHR(buff);
          
            case VKANDROIDSURFACECREATEINFOKHR_ID :  return   new VkAndroidSurfaceCreateInfoKHR(buff);
           
            case VKWIN32SURFACECREATEINFOKHR_ID :  return   new VkWin32SurfaceCreateInfoKHR(buff);
           
            case VKDEBUGREPORTCALLBACKCREATEINFOEXT_ID :  return   new VkDebugReportCallbackCreateInfoEXT(buff);
            
            case VKDEBUGMARKEROBJECTNAMEINFOEXT_ID : return   new VkDebugMarkerObjectNameInfoEXT(buff);
            case VKDEBUGMARKEROBJECTTAGINFOEXT_ID : return   new VkDebugMarkerObjectTagInfoEXT(buff);
            case VKDEBUGMARKERMARKERINFOEXT_ID : return new VkDebugMarkerMarkerInfoEXT(buff);            
            case VKPIPELINERASTERIZATIONSTATERASTERIZATIONORDERAMD_ID : return new VkPipelineRasterizationStateRasterizationOrderAMD(buff);
            
            default: return  null;        
        } //switch
    }//create instance
    

}//class
