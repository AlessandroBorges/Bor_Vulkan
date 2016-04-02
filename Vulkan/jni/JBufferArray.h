/**
 * Bor Vulkan class.
 * Allows use of java.nio.ByteBuffers[] arrays to
 * native side using JNI.
 *
 */
#ifndef JBUFFERARRAY_H
#define JBUFFERARRAY_H

#include <jni.h>
#include <iostream>

#undef DEBUG

using namespace std;

typedef void* PointerToAnything;
typedef PointerToAnything* PointerToAnythingArray;

class JBufferArray
{
    public:
        JBufferArray(JNIEnv* env, jobjectArray _buffers);
        virtual ~JBufferArray();

        /**
         * @return number of ByteBuffer contained in the Buffer Array.
         */
        unsigned int getSize() { return size; }

        /**
         * get the address of ByteBuffers stored here.
         * @return PointerToAnything pointer. It is a void* typedef
         *
         */
        PointerToAnythingArray getPointers() { return pointers; }

        /**
         * @return the PointerToAnything and index i. Out of bounds indexes
         *          return null.
         */
        PointerToAnything getPointer(int i);
        // { return (i>=0 && i<size)? pointers[i] : NULL;}
        /**
         * creates a ByteBuffer to wrap ptr and set it to position index
         * @param ptr - pointer to something
         * @param length - size in bytes of ptr
         * @param index - position in bufferArr to set ByteBuffer
         **/
        void setPointer(PointerToAnything ptr, jsize length, int index);
        /**
          * @return True if pointer at index is NULL.
          */
        bool isNull(int index);
        /**
         * commit pending changes made at pointers[] returned by getPointers().
         * If you forgot, destructor does it for you.
         */
        void commit();

    protected:
    private:
        JNIEnv* env;
        jobjectArray bufferArr;
        int size;
        PointerToAnythingArray pointers;
        PointerToAnythingArray pinnedPointers;
};

#endif // JBUFFERARRAY_H
