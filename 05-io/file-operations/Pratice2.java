package DataConstruture_algorithm.File;

import java.io.File;

public class Pratice2 {
    public static void main(String[] args) {
        System.out.println(hasAVI(
                new File("/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/File")));
    }

    private static boolean hasAVI(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith("avi")) {
                return true;
            }
        }
        return false;
    }
}
