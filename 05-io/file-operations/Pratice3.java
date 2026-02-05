package DataConstruture_algorithm.File;

import java.io.File;

public class Pratice3 {
    public static void main(String[] args) {
        // 查找盘符下是否有 mp4 文件
        hasMP4(new File("/Users/funzhou/Documents/javacode/My-java-pratice-repo"));

    }

    public static void hasMP4(File dir) {

        if (dir != null) {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    if (file.isFile() && file.getName().endsWith("mp4")) {
                        System.out.println(file.getAbsolutePath());
                    }
                } else if (file.isDirectory()) {
                    hasMP4(file);
                }
            }

        }
    }
}
