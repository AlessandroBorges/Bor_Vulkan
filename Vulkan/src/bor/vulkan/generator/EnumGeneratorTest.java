package bor.vulkan.generator;

public class EnumGeneratorTest {

    private EnumGeneratorTest() {}
    
    /**
     * Given a roll of names and values, generate source code for concrete EnumInterface class.
     * 
     * @param enumName - name of class
     * @param names - array of item names
     * @param values - array of item values. It can be numbers or other item values
     *  
     * @return source code for enumerations class
     */
    public static String generateEnumSource(String enumName, String[] names, String[] values){
        // basic
        if(names==null || values==null || names.length != values.length){
            throw new IllegalArgumentException("names or values are null or with wrong size");
        }
            // check type: Int or Long ?
        boolean isLong = false;
        boolean isInt = false;
        for (String value : values) {
            // skip expressions
            if(contains(value, names)){
                continue;
            }
            boolean asInt = parseAsInt(value);
            boolean asLong = parseAsLong(value);
            if(asLong && !asInt){
                isLong = true;
            }
            if(asInt){
                isInt = true;
            }
        }// foreach
        
        String superclassName = isLong ? "LongEnum" : "IntEnum";
        String type = isLong ? "long" : "int";
        StringBuffer sb = new StringBuffer(1024*3);
        // header
        sb.append("import bor.enumerable.*;\n\n")
         .append("public class ").append(enumName)
          .append(" extends ").append(superclassName).append('<').append(enumName).append("> {\n");
        
        // enumTypes
        String itemPre = "\tpublic static final " + enumName + " ";        
        for(int i=0; i<names.length; i++){
            
            sb.append(itemPre);
            // intem and name
            sb.append(names[i]).append(" = new ").append(enumName).append("(");
            sb.append("\"").append(names[i]).append("\", ");
            
            // ordinal
            sb.append(i).append(", ");
            // value
            sb.append(fixExpressions(values[i], names)).append(");\n");            
        }
        
        sb.append("\n\n");
        sb.append("\t/** private ctor */\n");
        sb.append("\tprivate ").append(enumName).append("(String name, int ordinal, ")
          .append(type).append(" v) {\n")
          .append("\t\t super(name, ordinal, v);\n")
          .append("\t}\n\n")
          .append(" } // end of class ").append(enumName);
       return sb.toString();
    }
    
    /**
     * Fix expressions by replacing enumeration item by item.getValue()
     * @param exp - expression
     * @param names - list of enumeration itens
     * @return fixed expression
     */
    public static String fixExpressions(String exp, String[] names){
        for (int i = 0; i < names.length; i++) {
            String test = names[i].trim();
            if(exp.contains(test)){
                exp = exp.replace(test,test+".getValue() ");
            }                
        }
        return exp;
    }
    
    /**
     * Check is a value is parseable as int
     * @param value
     * @return
     */
    public static boolean parseAsInt(String value){
        try {        
            value = value.trim().replace(";", "").replace(",","");
            Integer v = Integer.decode(value);
            return true;
        } catch (Exception e) {
           return false;
        }       
    }
    
    /**
     * Check is a value is parseable as long
     * @param value string to test;
     * @return
     */
    public static boolean parseAsLong(String value){
        try {        
            value = value.trim().replace(";", "").replace(",","");
            Long v = Long.decode(value);
            return true;
        } catch (Exception e) {
           return false;
        }       
    }
    
    /**
     * Check if a given string base contains at least a substring from valuesToTest
     * 
     * @param base string which may or may not contain a substring
     * @param valuesToTest array of substrings to test
     * 
     * @return true if at least one valuesToTest is substring of base
     */
    public static boolean contains(String base, String[] valuesToTest){
        for (int i = 0; i < valuesToTest.length; i++) {
            String test = valuesToTest[i].trim();
            if(base.contains(test))
                return true;
        }
        
        return false;
    }

    ////////////////////////////////////////////////////////
    // TEST ME, PLEASE
    ///////////////////////////////////////////////////////
    
    public static void main(String[] args) {
        String className = "VkEnumTest";
        String[] names  = {"OK","MORE_OR_LESS","BAD"};
        String[] values = {"0x01","0x02","~OK"};
        
        String src = generateEnumSource(className, names, values);
        System.out.println("src:\n" + src);

    }

}
