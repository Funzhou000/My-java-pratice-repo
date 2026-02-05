package DataConstruture_algorithm.File;

import java.io.File;

public class Pratice5 {
    public static void main(String[] args) {
        // calculate dir size
        System.out.println(
                getDirSize(new java.io.File("/Users/funzhou/Documents/javacode/My-java-pratice-repo")) / 1024 / 1024
                        + " MB");
    }

    private static long getDirSize(File dir) {
        long size = 0;
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                size += file.length();
            } else if (file.isDirectory()) {
                size += getDirSize(file);
            }
        }
        return size;
    }
}
