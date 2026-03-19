package DataConstruture_algorithm.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

public class CommonsioPratice {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("DataConstruture_algorithm/IO/Directory/cqmyg.txt");
        FileOutputStream fos = new FileOutputStream("DataConstruture_algorithm/IO/Directory/cqmyg2.txt");
        IOUtils.copy(fis, fos);
    }
}
