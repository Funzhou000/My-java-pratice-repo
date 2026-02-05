package DataConstruture_algorithm.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InPutStreamDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("DataConstruture_algorithm/IO/Directory/b.txt");
        int b;
        while ((b = fis.read()) != -1) {
            System.out.print((char) b);
        }
        fis.close();
    }
}
