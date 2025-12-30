package DataConstruture_algorithm.Algorithm_CourseWork.filePratice;

import java.io.File;

public class Demo1 {
    public static void main(String[] args) {
        File f = new File(
                "/Users/funzhou/Documents/E-book/Grokking Algorithms - An Illustrated Guide for Programmers -- Aditya Y. Bhargava -- ( WeLib.org ).epub");
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.isAbsolute());
        System.out.println(f.exists());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.length());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        System.out.println(f.lastModified());
        // 打印当前 Java 程序的工作目录
        System.out.println(System.getProperty("user.dir"));
    }
}
