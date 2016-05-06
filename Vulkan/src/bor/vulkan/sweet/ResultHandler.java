/**
 * 
 */
package bor.vulkan.sweet;

import java.util.logging.Level;
import java.util.logging.Logger;

import bor.vulkan.enumerations.VkResult;

/**
 * Singleton class to catch VkResults, where aplicable.
 * 
 * It can be configured to raise exceptions and create logs.
 *  
 * @author Alessandro Borges
 *
 */
public class ResultHandler {
    
    private static ResultHandler singleton;
    
    private boolean raiseExceptions = false;
    private boolean doLogging = false;
    private static Logger logger = null;
    
    /**
     * Hidden Ctor
     */
    private ResultHandler(){}
    
    /**
     * Get the singleton instance
     * @return unique instance of resultHandler
     */
    public static ResultHandler getInstance(){
        if(singleton== null){
            singleton = new ResultHandler();
        }        
        return singleton;
    }
    
    /**
     * Check 
     * @param obj
     * @param res
     */
    public final void check(Object obj, VkResult res){
        if(!(raiseExceptions || doLogging))
            return;
        
        String msg = (obj == null ? "VkResult is " : obj.toString()) + " " + res.toString();
        Level level = (res.getValue() < 0 ) ? Level.SEVERE : Level.INFO;
              
        if(raiseExceptions){
            if(res.getValue() < 0){
                // prepare exception
                VulkanVkResultException exc = new VulkanVkResultException(res);
                StackTraceElement[] trace = exc.getStackTrace();
                if(trace != null && trace.length > 2){
                    StackTraceElement[] trace2 = new StackTraceElement[trace.length - 2];
                    System.arraycopy(trace, 2, trace2, 0, trace2.length);                    
                    exc.setStackTrace(trace2);
                    trace = trace2;
                }
                if(doLogging){
                    StackTraceElement element = trace[0];
                    logger.logp(level, element.getClassName(), element.getMethodName(), msg, exc);       
                }
                throw exc;
            }
        }//raiseExceptions
        
        if(doLogging){
            logger.log(level, msg);
        }
        
    }
    
    /**
     * Enable logging
     * @param enable
     */
    public void enableLogging(boolean enable){
        this.doLogging = enable;
        if(enable){
            if(logger==null){
                logger  = Logger.getLogger(ResultHandler.class.getName());
            }
        }
      }
    
    
    
}
