package bor.vulkan;

/**
 * Class to define Lock-able Canvas for drawing
 * @author Alessandro Borges
 *
 */
public interface LockableCanvas {
    
    /**
     * lock canvas for drawing
     * @return true if ok
     */
    public boolean lock();
    
    /**
     * unlock canvas after drawing
     */
    public void unLock();

}
