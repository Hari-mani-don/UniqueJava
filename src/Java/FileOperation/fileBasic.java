package Java.FileOperation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileBasic {
    public static void main(String[] args) throws IOException {
        File a = new File("/home/harimani/HackerRank/manidon");
        a= new File(a + "/hari/hari.txt");
        System.out.println(a.createNewFile());
        System.out.println(a.length());
        System.out.println(a.getAbsoluteFile());
        System.out.println(a.canRead());
        System.out.println(a.canWrite());
        System.out.println(a.getName());
        FileReader f = new FileReader(a.getAbsoluteFile());
        int i=0;
        while ((i = f.read() )!=-1){
            System.err.print((char) i);
        }
    }
}
