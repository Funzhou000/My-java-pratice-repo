package DataConstruture_algorithm.IO;

import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cn.hutool.core.io.FileUtil;

public class Login {
    public static void main(String[] args) {
        String fileName = "/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/IO/Directory/PassWord&key.txt";
        List<String> lines = FileUtil.readLines(new File(fileName), "utf-8");
        String[] split = lines.get(0).split("&");

        String[] keyValuePair = split[0].split("=");
        String[] passwordValuePair = split[1].split("=");
        String key = keyValuePair[1];
        String password = passwordValuePair[1];
        System.out.println("key: " + key);
        System.out.println("password: " + password);
    }
}
