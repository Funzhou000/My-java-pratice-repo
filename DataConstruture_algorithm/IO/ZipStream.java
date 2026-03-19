package DataConstruture_algorithm.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStream {
    public static void main(String[] args) throws IOException {
        File src = new File("DataConstruture_algorithm/IO/Directory/chushibiao.txt.zip");
        File dest = new File("DataConstruture_algorithm/IO/Directory/");
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        ZipEntry entry;
        while ((entry = zip.getNextEntry()) != null) {
            System.out.println(entry.getName());
            String name = entry.getName();
            // 关键过滤逻辑：跳过 macOS 自动生成的元数据文件
            if (name.startsWith("__MACOSX") || name.contains(".DS_Store")) {
                zip.closeEntry();
                continue;
            }
            if (entry.isDirectory()) {
                new File(dest, entry.getName()).mkdirs();
            } else {
                FileOutputStream fos = new FileOutputStream(new File(dest, entry.getName()));

                int len;
                while ((len = zip.read()) != -1) {
                    fos.write(len);
                }
                fos.close();
            }
        }
        zip.closeEntry();
        zip.close();
    }
}
