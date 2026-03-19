package DataConstruture_algorithm.IO;

import java.io.File;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;

public class hutoolUtil {
    public static void main(String[] args) {
        File[] ls = FileUtil.ls("DataConstruture_algorithm");
        // for (File file : ls) {
        // System.out.println(file.getName());
        // }

        FileUtil.copy(
                "/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/IO/Directory/chushibiao 2/chushibiao.txt",
                "/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/IO/Directory", true);
    }
}
