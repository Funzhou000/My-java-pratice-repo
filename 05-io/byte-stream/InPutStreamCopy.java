package DataConstruture_algorithm.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InPutStreamCopy {
    public static void main(String[] args) throws Exception {
        // read multi byte
        Long start = System.currentTimeMillis();
        byte[] bytes = new byte[1];
        int len;
        FileInputStream fis = new FileInputStream("DataConstruture_algorithm/IO/Directory/b.txt");
        FileOutputStream fos = new FileOutputStream("DataConstruture_algorithm/IO/Directory/copy_b.txt");
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fos.close();
        fis.close();
        Long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + "ms");
        // len = fis.read(bytes);
        // System.out.println("read length:" + len);
        // System.out.println(new String(bytes, 0, len));
    }
}
