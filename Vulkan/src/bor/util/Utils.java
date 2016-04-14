/**
 * 
 */
package bor.util;

import java.nio.Buffer;
import java.nio.ByteBuffer;

/**
 * Class with some utility functions.
 * 
 * @author Alessandro Borges
 *
 */
public class Utils {

    //@formatter:off
    /*JNI
     
         
      #include <stdio.h>
      #include <stdlib.h>      
      #include <vulkan/vulkan.h>
     
     */
    /**
     * 
     */
    private Utils() {      
    }
    
       
    
    /**
     * Get native size of pointer void* in bytes
     * @return 4 or 8;
     */
    public static final native int sizeOfPtr();/*      
      return (jint) sizeof(void*);      
    */
    
    /**
     * Check if a buffer points to same address of 
     * @param buffer - direct ByteBuffer
     * @param address - native address
     * @return true if native buffer address is equals address parameter
     */
    public static final native boolean equals(Buffer buffer, long address);/*
      
      void* a = (void*) buffer;
      void* b = (void*) reinterpret_cast<void*>(address);      
      return (jboolean) (a==b);    
    */
    
    /**
     * get Native address of Buffer
     * @param buffer - 
     * @return
     */
    public static native long getNativeAddress(Buffer buffer);/*      
      return (jlong) reinterpret_cast<jlong>(buffer);
    */
    
    /**
     * Wrap a pointer using a ByteBuffer. 
     * @param address - native buffer address, created with malloc or calloc.
     * @param size - size in bytes of native buffer pointed by address; 
     * 
     * @return Direct ByteBuffer wrapping "address" with capacity "size".
     */
    public static final native ByteBuffer wrapPointer(long address, int size);/*
     void* buffer = (void *)(address);
     jobject directBuffer = env->NewDirectByteBuffer(buffer, size);
     return directBuffer;
    */
    
    
    /**
     * Alocate a Byte Buffer on native side 
     * @param size
     * @return
     */
    public static final native ByteBuffer createDirectBuffer(int size);/*
     void* pbuffer = calloc((size_t) 1, (size_t)size);
     jobject directBuffer = env->NewDirectByteBuffer(pbuffer, size);
     return directBuffer;
    */
    
    /**
     * Delete byte buffer
     * @param ptr
     * @return
     */
    public static final native boolean deleteDirectBuffer(ByteBuffer ptr);/*
       void* pbuffer = (void*)ptr;
       if(pbuffer)
              free(pbuffer);
       return JNI_TRUE;
    */
      

}
