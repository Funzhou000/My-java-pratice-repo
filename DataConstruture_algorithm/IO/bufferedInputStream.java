package DataConstruture_algorithm.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;

public class bufferedInputStream {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("DataConstruture_algorithm/IO/Directory/aCopy..txt"));
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("DataConstruture_algorithm/IO/Directory/a.txt"));
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bis.close();
        bos.close();
    }
}
