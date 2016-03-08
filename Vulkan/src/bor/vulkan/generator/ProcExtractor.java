package bor.vulkan.generator;

import java.io.IOException;
import java.util.*;

import static bor.vulkan.generator.Util.*;

public class ProcExtractor {

    /**
     * Extract Next procedure definition, from position pos.
     * also return position for next search
     * 
     * @param src - string source
     * @param pos - start position
     * @param positions - in not null, return the position to next search.
     * 
     * @return string definition of enumeration
     */
    public static List<String> extractNextProc(List<String> src, int pos, int[] positions) {
        int start = findNextLine(src, "VKAPI_ATTR", pos);
        if (start < 0) return null;

        int end = findNextLine(src, ");", start);
        if (end < 0) throw new IllegalAccessError("Malformed procedure");

        end += 1; // inclusive
        if (positions != null) {
            positions[0] = start;
            positions[1] = end;
        }
        return src.subList(start, end);
    }

    /**
     * Process Vulkan Structs
     * 
     * @param vkh - source
     * 
     * @return last struct ID
     */
    public static int processProcedure(List<String> vkh) {
        System.out.println("Processing Procedures.");
        // boolean printStructs = true;
        boolean exportProc = false;
        boolean showAtConsole = false;
        boolean showVars = true;
        boolean printID = false;

        int[] positions = { 0, 0 };
        int ID = 0;
        List<ProcInfo> allProcs = new ArrayList<ProcInfo>();
        List<String> nextProc = null;
        // building structs
        while ((nextProc = extractNextProc(vkh, positions[1], positions)) != null) {
            ID++;
            // System.err.println("/** Structure #" + (++ID) + " */");
            ProcInfo info = ProcInfo.parse(nextProc, ID);
            allProcs.add(info);
            // String foundEnum = toString(nextStruct);
            // System.err.println(foundEnum);
            // System.err.println(info);
        }// while

        if (showAtConsole) {
            
            for (ProcInfo info : allProcs) {
                System.out.println(info.toJavaSrc("bor.vulkan.structs"));
                System.out.println("____________________________________________________________________________");
                // System.out.println("public static final int " + info.getID_NAME()+";");
            }
        }

        if (exportProc) {
            save(allProcs);
        }

        if (showVars) {
            System.out.println("ShowVars");
            Set<String> allTypes = ProcInfo.allTypes;
            int i = 0;
            for (String type : allTypes) {
                System.out.println("#" + (++i) + " " + type);
            }
        }

        if (printID) {
            System.out.println("All Struct ID:");
            for (ProcInfo info : allProcs) {
                System.out.println(info.procName + "\t" + info.id);
                // System.out.println("public static final int " +
                // info.getID_NAME()+";");
            }
        }
        return ID;
    }

    /**
     * SAve it
     * 
     * @param allProcs
     */
    public static void save(List<ProcInfo> allProcs) {

        StringBuffer sb = new StringBuffer(132 * 1024);
        for (ProcInfo info : allProcs) {
            sb.append(info.toJavaSrc("")).append("\n\n\t/////////////////////////////////////\n\n");
        }

        String src = "package bor.vulkan;\n" + " import bor.vulkan.khr.*;\n" + " import java.nio.*;\n\n"
                + " public class Vk extends Vulkan\n" + " {\n";

        src += sb.toString();

        src += "\n\n }//end of Vk\n";

        Util.save("D:/Users/Livia/workspace/Vulkan/src/bor/vulkan", "Vk.java", src);

    }

    public static void main(String[] args) throws IOException {
        List<String> src = readVKH();

        processProcedure(src);

    }

}
