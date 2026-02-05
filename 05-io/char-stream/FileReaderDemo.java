package DataConstruture_algorithm.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) throws Exception {
        // 练习分别使用 FileReader 的 read 空参方法和带参方法读取文件内容，并在控制台输出
        // 空参方法
        // FileReader能根据系统默认编码读取文件，适合读取文本文件
        // 遇到中文读取 2/3 个字节 英文 1 个字节
        FileReader fr = new FileReader("DataConstruture_algorithm/IO/Directory/b.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
        System.out.println("--------------------");
        // 带参方法
        FileReader fr2 = new FileReader("DataConstruture_algorithm/IO/Directory/b.txt");
        char[] chars = new char[8];
        int len;
        while ((len = fr2.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));
        }
        fr2.close();
    }
}