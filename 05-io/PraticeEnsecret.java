package DataConstruture_algorithm.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PraticeEnsecret {
    public static void main(String[] args) throws IOException {
        File file = new File("DataConstruture_algorithm/IO/Directory/pratice3.txt");
        FileInputStream fis = new FileInputStream(file);
        File file2 = new File("DataConstruture_algorithm/IO/Directory/answer.txt");
        FileOutputStream fos = new FileOutputStream(file2);
        int data;
        while ((data = fis.read()) != -1) {
            fos.write(data ^ 5);
        }
        fos.close();
        fis.close();

    }
}
