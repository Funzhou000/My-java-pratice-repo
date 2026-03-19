package DataConstruture_algorithm.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

import cn.hutool.core.io.FileUtil;

public class clawler2 {
    public static void main(String[] args) throws IOException {
        // 1，读取本地文件把文件里的姓氏和名直接拼接
        // List<String> firsName = new ArrayList<>();
        // List<String> surnameStrings = new ArrayList<>();
        HashSet<String> fullNameSet = new HashSet<>();
        int count = 100;
        BufferedReader surnNameReader = new BufferedReader(
                new FileReader("DataConstruture_algorithm/IO/Directory/hundred-family-surnames.txt"));
        BufferedReader firstNameReader = new BufferedReader(
                new FileReader("DataConstruture_algorithm/IO/Directory/hundred-family-firstname-01.txt"));
        String surnameLine;
        String firstNameLine;
        while ((surnameLine = surnNameReader.readLine()) != null
                && (firstNameLine = firstNameReader.readLine()) != null) {
            String fullName = surnameLine + firstNameLine + "-" + age();
            fullNameSet.add(fullName);
        }
        surnNameReader.close();
        firstNameReader.close();
        FileUtil.writeLines(fullNameSet,
                "/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/IO/Directory/full-names.txt",
                "utf-8");
        // for (int i = 0; i < count; i++) {
        // String name = FileUtil
        // .readLines("DataConstruture_algorithm/IO/Directory/hundred-family-firstname-01.txt",
        // "utf-8")
        // .get(i);
        // String surname = FileUtil
        // .readLines("DataConstruture_algorithm/IO/Directory/hundred-family-surnames.txt",
        // "utf-8").get(i);
        // String fullName = surname + name + "-" + age();
        // fullNameSet.add(fullName);
        // }
        System.out.println("成功生成 " + fullNameSet.size() + " 个姓名");
        System.out.println("生成的姓名列表: " + fullNameSet);
    }

    private static String age() {
        Random random = new Random();
        int age = random.nextInt(100) + 1; // 生成1到100之间的随机年龄
        return String.valueOf(age);
    }
}
