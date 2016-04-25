package bor.vulkan.tutorial;

import bor.vulkan.Vk10;
import bor.vulkan.structs.VkStruct;

public class Misc {
    
    
    private static void testSizes(){
       
        for(int i=1; i<127;i++){
            System.out.println("Struct #" + i + " size: "+ VkStruct.sizeOf(i));    
        }        
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
