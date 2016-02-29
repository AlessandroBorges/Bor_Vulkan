package bor.vulkan.generator;

import static bor.vulkan.generator.Util.*;

import java.io.IOException;
import java.util.*;


public class TestGen {

    public static void main(String[] args) {
        try {
            
            List<Class<?>> classes = getStructClasses();//getEnumerationClasses();
            Collection<String> names = getClassFullNames(classes); 
            for (String nm : names) {
                System.err.println(nm);
            }
            
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 

    }

}
