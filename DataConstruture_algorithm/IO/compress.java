package DataConstruture_algorithm.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class compress {
    public static void main(String[] args) throws IOException {
        File src = new File("DataConstruture_algorithm/IO/Directory/chushibiao.txt");
        File dest = new File("DataConstruture_algorithm/IO/Directory/");
        toZip(src, dest);
    }

    private static void toZip(File src, File dest) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest, "a.zip")));
        ZipEntry entry = new ZipEntry("a.txt");
        zos.putNextEntry(entry);
        FileInputStream fis = new FileInputStream(src);
        int len;
        while ((len = fis.read()) != -1) {
            zos.write(len);
        }
        fis.close();
        zos.closeEntry();
        zos.close();

    }
}
