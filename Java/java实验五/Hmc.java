import java.io.*;
import java.util.*;

public class Hmc {
    public static void main(String[] args) throws IOException{
        File dir = new File(".");
        FilenameFilter fileAccept = new FilenameFilter(){

            @Override
            public boolean accept(File dir, String name) {
                String temp = name.substring(name.length()-5,name.length());
                if (temp.equals(".java")) {
                    return true;
                }
                return false;
            }
        };
        String[] fileName = dir.list(fileAccept);
        FileWriter out = new FileWriter("collection.txt");
        FileReader in = null;
        int ch;
        for (String name : fileName ) {
            in = new FileReader(name);
            while ((ch = in.read())!=-1) {
                out.write(ch);
            }
        }
        in.close();
        out.close();
    }
}
