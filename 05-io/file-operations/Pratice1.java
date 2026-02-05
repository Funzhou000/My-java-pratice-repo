package DataConstruture_algorithm.File;

import java.io.File;
import java.io.IOException;

public class Pratice1 {
    public static void main(String[] args) throws IOException {
        File f = new File(
                "/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/File/av.avi");
        System.out.println(f.createNewFile());
    }
}
