package DataConstruture_algorithm.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class outPutMultipleFile {
    public static void main(String[] args) throws Exception {
        // 写入多个数据
        // 1，创建FileOutputStream对象并写入多次
        // 2，创建FileOutputStream对象并用数组写入
        // 3，创建FileOutputStream对象并用数组和开始索引及长度控制写入
        // 4, 换行 mac \r linux \n windows \r\n
        // 5, 续写开关
        FileOutputStream fos = new FileOutputStream("DataConstruture_algorithm/IO/Directory/b.txt", true);
        // 1，写入多次
        fos.write(97);
        fos.write(98);
        fos.write(99);
        // 4, 换行 mac \r linux \n windows \r\n
        fos.write('\r');
        fos.write('\n');

        // 2，用数组写入
        byte[] bytes = { 100, 101, 102, 103, 104 };
        fos.write(bytes);
        fos.write('\r');
        fos.write('\n');
        // 3，用数组和开始索引及长度控制写入
        fos.write(bytes, 1, 3);// 101,102,103
        fos.close();
    }
}