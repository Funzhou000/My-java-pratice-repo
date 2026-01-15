package DataConstruture_algorithm.Exception.ExceptionPratice1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class readWriteWith4Tyoe {
    public static void main(String[] args) throws InterruptedException, IOException {
        // 4 种读取数据的方式
        // 字节流
        // 自己设置缓冲区的字节流
        // BufferedInputStream 默认 8124 字节
        // 计算机处理时间
        long start = System.nanoTime();
        readWithBuffer3();
        long end = System.nanoTime();
        System.out.println("Elapsed time in milliseconds: " + (end - start) / 1_000_000.0);
    }

    private static void read() throws IOException {
        FileInputStream fis = new FileInputStream(
                "/Users/funzhou/Documents/LearningFile/Readingexplorer/3 教材（学生）高清扫描版 .pdf");
        int ch;
        while ((ch = fis.read()) != -1) {

        }
        fis.close();
    }

    private static void readWithBuffer() throws IOException {
        FileInputStream fis = new FileInputStream(
                "/Users/funzhou/Documents/LearningFile/Readingexplorer/3 教材（学生）高清扫描版 .pdf");
        byte[] buffer = new byte[8192]; // 8KB 缓冲区
        int bytesRead;
        while ((bytesRead = fis.read(buffer)) != -1) {
            // 处理读取的数据
        }
        fis.close();
    }

    private static void readWithBuffer2() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                "/Users/funzhou/Documents/LearningFile/Readingexplorer/3 教材（学生）高清扫描版 .pdf"));
        byte[] buffer = new byte[8192]; // 8KB 缓冲区
        int bytesRead;
        while ((bytesRead = bis.read(buffer)) != -1) {
            // 处理读取的数据
        }
        bis.close();
    }

    private static void readWithBuffer3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                "/Users/funzhou/Documents/LearningFile/Readingexplorer/3 教材（学生）高清扫描版 .pdf"));
        byte[] buffer = new byte[8192]; // 8KB 缓冲区
        int bytesRead;
        while ((bytesRead = bis.read()) != -1) {
            // 处理读取的数据
        }
        bis.close();
    }

}