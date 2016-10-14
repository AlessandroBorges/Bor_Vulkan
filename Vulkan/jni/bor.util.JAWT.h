/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class bor_util_JAWT */

#ifndef _Included_bor_util_JAWT
#define _Included_bor_util_JAWT
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     bor_util_JAWT
 * Method:    getAWT0
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_bor_util_JAWT_getAWT0
  (JNIEnv *, jclass);

/*
 * Class:     bor_util_JAWT
 * Method:    getDrawingSurfaceInfo0
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_bor_util_JAWT_getDrawingSurfaceInfo0
  (JNIEnv *, jclass, jlong);

/*
 * Class:     bor_util_JAWT
 * Method:    getDrawingSurfaceAWT0
 * Signature: (Ljava/awt/Component;J)J
 */
JNIEXPORT jlong JNICALL Java_bor_util_JAWT_getDrawingSurfaceAWT0
  (JNIEnv *, jclass, jobject, jlong);

/*
 * Class:     bor_util_JAWT
 * Method:    getDrawingSurfaceWindowIdAWT
 * Signature: (Ljava/awt/Component;JJJI)J
 */
JNIEXPORT jlong JNICALL Java_bor_util_JAWT_getDrawingSurfaceWindowIdAWT
  (JNIEnv *, jclass, jobject, jlong, jlong, jlong, jint);

/*
 * Class:     bor_util_JAWT
 * Method:    lockGlobal0
 * Signature: (J)Z
 */
JNIEXPORT jboolean JNICALL Java_bor_util_JAWT_lockGlobal0
  (JNIEnv *, jclass, jlong);

/*
 * Class:     bor_util_JAWT
 * Method:    unlockGlobal0
 * Signature: (J)Z
 */
JNIEXPORT jboolean JNICALL Java_bor_util_JAWT_unlockGlobal0
  (JNIEnv *, jclass, jlong);

/*
 * Class:     bor_util_JAWT
 * Method:    freeResource
 * Signature: (JJJ)V
 */
JNIEXPORT void JNICALL Java_bor_util_JAWT_freeResource
  (JNIEnv *, jclass, jlong, jlong, jlong);

/*
 * Class:     bor_util_JAWT
 * Method:    lock0
 * Signature: (J)Z
 */
JNIEXPORT jboolean JNICALL Java_bor_util_JAWT_lock0
  (JNIEnv *, jclass, jlong);

/*
 * Class:     bor_util_JAWT
 * Method:    unlock0
 * Signature: (J)Z
 */
JNIEXPORT jboolean JNICALL Java_bor_util_JAWT_unlock0
  (JNIEnv *, jclass, jlong);

/*
 * Class:     bor_util_JAWT
 * Method:    getHwndHdc
 * Signature: (J[J)Z
 */
JNIEXPORT jboolean JNICALL Java_bor_util_JAWT_getHwndHdc
  (JNIEnv *, jclass, jlong, jlongArray);

/*
 * Class:     bor_util_JAWT
 * Method:    getRectangle0
 * Signature: (J[I)Z
 */
JNIEXPORT jboolean JNICALL Java_bor_util_JAWT_getRectangle0
  (JNIEnv *, jclass, jlong, jintArray);

/*
 * Class:     bor_util_JAWT
 * Method:    updateDSIEGLhandlers00
 * Signature: (JJ[J)Z
 */
JNIEXPORT jboolean JNICALL Java_bor_util_JAWT_updateDSIEGLhandlers00
  (JNIEnv *, jclass, jlong, jlong, jlongArray);

/*
 * Class:     bor_util_JAWT
 * Method:    freeDrawingSurfaceInfo0
 * Signature: (JJ)Z
 */
JNIEXPORT jboolean JNICALL Java_bor_util_JAWT_freeDrawingSurfaceInfo0
  (JNIEnv *, jclass, jlong, jlong);

#ifdef __cplusplus
}
#endif
#endif
/* Header for class bor_util_JAWT_DrawingSurface */

#ifndef _Included_bor_util_JAWT_DrawingSurface
#define _Included_bor_util_JAWT_DrawingSurface
#ifdef __cplusplus
extern "C" {
#endif
#ifdef __cplusplus
}
#endif
#endif
/* Header for class bor_util_JAWT_DrawingSurfaceInfo */

#ifndef _Included_bor_util_JAWT_DrawingSurfaceInfo
#define _Included_bor_util_JAWT_DrawingSurfaceInfo
#ifdef __cplusplus
extern "C" {
#endif
#undef bor_util_JAWT_DrawingSurfaceInfo_EGLNativeDisplayType_index
#define bor_util_JAWT_DrawingSurfaceInfo_EGLNativeDisplayType_index 0L
#undef bor_util_JAWT_DrawingSurfaceInfo_EGLNativePixmapType_index
#define bor_util_JAWT_DrawingSurfaceInfo_EGLNativePixmapType_index 1L
#undef bor_util_JAWT_DrawingSurfaceInfo_EGLNativeWindowType_index
#define bor_util_JAWT_DrawingSurfaceInfo_EGLNativeWindowType_index 2L
#ifdef __cplusplus
}
#endif
#endif
/* Header for class bor_util_JAWT_JAWT_Rectangle */

#ifndef _Included_bor_util_JAWT_JAWT_Rectangle
#define _Included_bor_util_JAWT_JAWT_Rectangle
#ifdef __cplusplus
extern "C" {
#endif
#undef bor_util_JAWT_JAWT_Rectangle_OUT_LEFT
#define bor_util_JAWT_JAWT_Rectangle_OUT_LEFT 1L
#undef bor_util_JAWT_JAWT_Rectangle_OUT_TOP
#define bor_util_JAWT_JAWT_Rectangle_OUT_TOP 2L
#undef bor_util_JAWT_JAWT_Rectangle_OUT_RIGHT
#define bor_util_JAWT_JAWT_Rectangle_OUT_RIGHT 4L
#undef bor_util_JAWT_JAWT_Rectangle_OUT_BOTTOM
#define bor_util_JAWT_JAWT_Rectangle_OUT_BOTTOM 8L
#undef bor_util_JAWT_JAWT_Rectangle_serialVersionUID
#define bor_util_JAWT_JAWT_Rectangle_serialVersionUID -4345857070255674764i64
#ifdef __cplusplus
}
#endif
#endif