package DataConstruture_algorithm.IO;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo1 {
    public static void main(String[] args) throws Exception {
        // char stream is used to deal with text file
        // char stream mumber metho
        FileWriter fw = new FileWriter("DataConstruture_algorithm/IO/Directory/copy_b.txt", true);
        char[] chars = "Hello, 你好".toCharArray();
        fw.write(chars);
        fw.write(chars, 0, 5);
        fw.write(66);
        fw.close();
    }
}
