package DataConstruture_algorithm.File;

import java.io.File;
import java.io.IOException;

public class MethodDemo1 {
    public static void main(String[] args) throws IOException {
        File f = new File(
                "/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/File/test1");
        boolean b = f.createNewFile();
        System.out.println(b);
        File f2 = new File(
                "/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/File/a/b/c/d/e");
        boolean b2 = f2.mkdirs();
        System.out.println(b2);
        File f3 = new File(
                "/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/File/a/b/c/d/e");
        boolean b3 = f3.delete();
        System.out.println(b3);
        File f4 = new File(
                "/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/File");
        File[] list = f4.listFiles();
        for (File file : list) {
            System.out.println(file.getName());
        }
    }
}
