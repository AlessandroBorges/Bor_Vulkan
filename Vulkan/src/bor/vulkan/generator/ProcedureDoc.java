/**
 * 
 */
package bor.vulkan.generator;

import java.util.*;

/**
 * 
 * Class to Store API specifications text about procedures.<br>
 * Uses Vulkan API Reference Pages from https://www.khronos.org/registry/vulkan/specs/1.0/apispec.html
 * 
 * 
 * @author Alessandro
 *
 */
public class ProcedureDoc {
    public String id;           // .
    public String name;         //.1
    public String cSpec;        //.2
    public List<String> parameters;     //.3
    public String description;  //.4     
    public String returnValur; //.5
    public String seeAlso;      //.5 ou //.6
    
    public String asJavadoc(){
        return toString();
    }
    
    /**
     * Convert play parameters to javadoc style
     * @param param
     * @return
     */
    private static String prepareParameters(List<String> param){        
        String tag = "\n @param ";
        String result = "";
        for (int i = 0; i < param.size(); i++) {
            result += tag + param.get(i).replace("\n\n", " - ");
        }        
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return     
                 (name != null ?"<b>"+ name + "</b><br>" : "")
                +(id != null ? "API spec: " +id +"<br>" : "")
                + (cSpec != null ? "<h3>C Specification</h3><br><pre>\n" + cSpec + "\n</pre>\n" : "")               
                + (description != null ? "<pre>\n" + description + "</pre>\n" : "")
                
                + (parameters != null ? prepareParameters(parameters): "")
                
                + (returnValur != null ? "returnValur=" + returnValur + ", " : "")                
                + (seeAlso != null ? "seeAlso=" + seeAlso : "") + "]";
    }



    /**
     * 
     */
    public ProcedureDoc() {      
    }

}
