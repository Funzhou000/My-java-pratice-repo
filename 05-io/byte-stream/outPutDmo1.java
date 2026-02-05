package DataConstruture_algorithm.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class outPutDmo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(
                "DataConstruture_algorithm/IO/Directory/a.txt");
        fos.write(87);
        fos.close();
    }
}
