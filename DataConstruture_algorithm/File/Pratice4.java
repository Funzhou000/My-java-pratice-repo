package DataConstruture_algorithm.File;

import java.io.File;

public class Pratice4 {
    public static void main(String[] args) {
        // dele wenjianjie all file
        deletDir(new File("/Users/funzhou/Downloads/DDir"));
    }

    private static void deletDir(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                file.delete();
            } else {
                deletDir(file);
            }
        }

    }
}
