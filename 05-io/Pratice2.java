package DataConstruture_algorithm.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Pratice2 {
    public static void main(String[] args) throws IOException {
        File file = new File("DataConstruture_algorithm/IO/Directory/pratice2.txt");
        File file2 = new File("DataConstruture_algorithm/IO/Directory/pratice3.txt");
        FileOutputStream fos = new FileOutputStream(file2);

        // 加密
        FileInputStream fis = new FileInputStream(file);
        int data;
        while ((data = fis.read()) != -1) {
            fos.write(data ^ 5);
        }

        fos.close();
        fis.close();

    }
}
