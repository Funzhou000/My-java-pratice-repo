package DataConstruture_algorithm.IO;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class bytesPrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("DataConstruture_algorithm/IO/Directory/bytes.txt");
        ps.println("这是一个测试文件，用于测试字节流的打印功能。");
        ps.printf("当前时间：%tF %<tT%n", System.currentTimeMillis());
        ps.close();

    }
}
