// class wrapping Vulkan's VkWaylandSurfaceCreateInfoKHR struct.
package bor.vulkan.khr.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.VkStruct;

import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkWaylandSurfaceCreateInfoKHR 
 * @Author Alessandro Borges 
 */
public class VkWaylandSurfaceCreateInfoKHR extends VkStruct {
	/** ID of this structure [120]  */
	 public static final int TAG = VKWAYLANDSURFACECREATEINFOKHR_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType 
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext 
	 */ 
	VkObject 	pNext;

	/**
	 *  VkWaylandSurfaceCreateFlagsKHR 	flags 
	 */ 
	int 	flags;

	/**
	 *  struct wl_display* 	display 
	 */ 
	struct wl_display* 	display;

	/**
	 *  struct wl_surface* 	surface 
	 */ 
	struct wl_surface* 	surface;

	/**
	 * Ctor
	 */
	public VkWaylandSurfaceCreateInfoKHR(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG); 
	}


	 // /////////////////////
	 //  SETTERS & GETTERS //
	 // /////////////////////

	/**
	 * Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field flags
	 * Prototype: VkWaylandSurfaceCreateFlagsKHR  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkWaylandSurfaceCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field display
	 * Prototype: struct wl_display*  display
	 */ 
	 public void display(struct wl_display* display){
		 this.display = display;
		display0(super.ptr, display);
	 }

	/**
	 * get method for field display
	 * Prototype: struct wl_display*  display
	 */ 
	 public struct wl_display* display(){
		 // return  this.display;
		 return display0(super.ptr);
	 }

	/**
	 * Set method for field surface
	 * Prototype: struct wl_surface*  surface
	 */ 
	 public void surface(struct wl_surface* surface){
		 this.surface = surface;
		surface0(super.ptr, surface);
	 }

	/**
	 * get method for field surface
	 * Prototype: struct wl_surface*  surface
	 */ 
	 public struct wl_surface* surface(){
		 // return  this.surface;
		 return surface0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkWaylandSurfaceCreateInfoKHR _obj = (VkWaylandSurfaceCreateInfoKHR)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkWaylandSurfaceCreateInfoKHR _obj = (VkWaylandSurfaceCreateInfoKHR)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkWaylandSurfaceCreateInfoKHR _obj = (VkWaylandSurfaceCreateInfoKHR)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkWaylandSurfaceCreateInfoKHR _obj = (VkWaylandSurfaceCreateInfoKHR)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkWaylandSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkWaylandSurfaceCreateInfoKHR _obj = (VkWaylandSurfaceCreateInfoKHR)(*ptr);
		  _obj.flags = (VkWaylandSurfaceCreateFlagsKHR) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkWaylandSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkWaylandSurfaceCreateInfoKHR _obj = (VkWaylandSurfaceCreateInfoKHR)(ptr);
		  return (jint) (_obj.VkWaylandSurfaceCreateFlagsKHR);
	 */

	/**
	 * native Set method for field display
	 * Prototype: struct wl_display*  display
	 */ 
	 private static native void display0(ByteBuffer ptr, struct wl_display* _display);/*
		  VkWaylandSurfaceCreateInfoKHR _obj = (VkWaylandSurfaceCreateInfoKHR)(*ptr);
		  _obj.display = (struct wl_display*) (_display);
	  */

	/**
	 * get method for field display
	 * Prototype: struct wl_display*  display
	 */ 
	 private static native struct wl_display* display0(ByteBuffer ptr);/*
		  VkWaylandSurfaceCreateInfoKHR _obj = (VkWaylandSurfaceCreateInfoKHR)(ptr);
		  return (struct wl_display*) (_obj.struct wl_display*);
	 */

	/**
	 * native Set method for field surface
	 * Prototype: struct wl_surface*  surface
	 */ 
	 private static native void surface0(ByteBuffer ptr, struct wl_surface* _surface);/*
		  VkWaylandSurfaceCreateInfoKHR _obj = (VkWaylandSurfaceCreateInfoKHR)(*ptr);
		  _obj.surface = (struct wl_surface*) (_surface);
	  */

	/**
	 * get method for field surface
	 * Prototype: struct wl_surface*  surface
	 */ 
	 private static native struct wl_surface* surface0(ByteBuffer ptr);/*
		  VkWaylandSurfaceCreateInfoKHR _obj = (VkWaylandSurfaceCreateInfoKHR)(ptr);
		  return (struct wl_surface*) (_obj.struct wl_surface*);
	 */



} // end of class VkWaylandSurfaceCreateInfoKHR
