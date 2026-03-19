package DataConstruture_algorithm.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class compress2Stream {
    public static void main(String[] args) throws IOException {
        File src = new File("DataConstruture_algorithm/IO/Directory/chushibiao");
        File dest = new File(src.getParent(), "chushibiao.zip");
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));

        toZip(src, zos, src.getName());
        zos.close();
    }

    // name
    public static void toZip(File src, ZipOutputStream zos, String name) throws IOException {
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                ZipEntry entry = new ZipEntry(name + "/" + file.getName());//file 是 chushibiao 里面的文件
                zos.putNextEntry(entry);
                FileInputStream fis = new FileInputStream(file);
                int len;
                while ((len = fis.read()) != -1) {
                    zos.write(len);
                }
                fis.close();
            } else if (file.isDirectory()) {
                toZip(file, zos, name + "/" + file.getName());
            }
        }
    }
}
