package bor.vulkan.generator;

import bor.vulkan.enumerations.*;

public class TestEnumerations {
    
    enum ABC{
        A,B,C
    }

    public static void main(String[] args) {
        VkPipelineStageFlagBits[] val =  VkPipelineStageFlagBits.values();
      
      for (int i = 0; i < val.length; i++) {
        System.out.println(val[i]+ " - " + val[i].getValue());
    }
     
      
    
    }

}
