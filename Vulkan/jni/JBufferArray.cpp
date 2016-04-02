#include "JBufferArray.h"


JBufferArray::JBufferArray(JNIEnv* _env, jobjectArray _buffers)
{
    env = _env;
    bufferArr = _buffers;
    size = (int) env->GetArrayLength(bufferArr);
    pointers = new PointerToAnything[size];
    pinnedPointers = new PointerToAnything[size];
     #ifdef DEBUG
       cout<< "instancing pointers" <<endl;
     #endif // DEBUG
    for( int i = 0; i < size; i++){
         jobject obj = (bufferArr) ?(jobject) env->GetObjectArrayElement(bufferArr, i):NULL;
         if(obj){
           pointers[i] = (env->GetDirectBufferAddress(obj));
         }else{
           pointers[i] = NULL;
         }
         pinnedPointers[i] = pointers[i];
      }
}

void JBufferArray::setPointer(PointerToAnything ptr,jsize length, int index){
       if(length==0){
        length = sizeof(void*);
       }
      //easy path
      if(pinnedPointers[index]==NULL || pinnedPointers[index] != ptr ){
         jobject buffer = (jobject)(env->NewDirectByteBuffer(ptr, length));
         pinnedPointers[index] = ptr;
         env->SetObjectArrayElement(bufferArr, index, buffer);
      }
       pointers[index] = pinnedPointers[index];
}

bool JBufferArray::isNull(int index){
 return (bool)(pinnedPointers==NULL || pinnedPointers[index]==NULL);
 }

void JBufferArray::commit()
{
    #ifdef DEBUG
       cout<< "commit" <<endl;
     #endif // DEBUG
  int len = size;
  for(int i = 0; i < len; i++){
        JBufferArray::setPointer(pointers[i],0, i);
     }

      #ifdef DEBUG
       cout<< "commit DONE" <<endl;
     #endif // DEBUG

}

PointerToAnything JBufferArray::getPointer(int i)
{
    return (i>=0 && i<size)? pointers[i] : NULL;
}

JBufferArray::~JBufferArray()
{
     commit();
     #ifdef DEBUG
       cout<< "Deleting pointers" <<endl;
     #endif // DEBUG
     delete[] pointers;
     delete[] pinnedPointers;
}


