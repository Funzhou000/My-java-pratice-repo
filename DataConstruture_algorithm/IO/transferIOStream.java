package DataConstruture_algorithm.IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class transferIOStream {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("DataConstruture_algorithm/IO/Directory/transfer2.txt",
                Charset.forName("UTF-8"));
        fw.write("这是一个测试文件，用于测试字符流的转换功能。");
        FileReader fr = new FileReader("DataConstruture_algorithm/IO/Directory/transfer.txt", Charset.forName("GBK"));
        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }
        fw.close();
        fr.close();
    }
}
