package DataConstruture_algorithm.IO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import D4.homework.calculator;
import D8.afterClassWork.praitce;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;

import java.util.Objects;

public class randonNote {
    public static void main(String[] args) throws IOException {
        // BufferedReader reader = new BufferedReader(new FileReader(
        // "/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/IO/Directory/full-names.txt"));
        // String line;
        // while ((line = reader.readLine()) != null) {
        // System.out.println(line);
        // }
        String src = "/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/IO/Directory/full-names.txt";
        String sortedFileOverage = "/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/IO/Directory/Sorted-names-overage.txt";
        String sortedFileUnderage = "/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/IO/Directory/Sorted-names-underage.txt";
        String randomFile = "/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/IO/Directory/random-names.txt";
        sortByAge(src);
        for (int i = 0; i < 10000; i++) {
            getRandomName2(sortedFileOverage, sortedFileUnderage);
        }
        System.out.println(calculatorAgeDistribution(randomFile));
        getRandomName();
        //

    }

    private static double calculatorAgeDistribution(String randomFile) {
        List<String> lines = FileUtil.readLines(randomFile, "utf-8");
        int over = 0;
        int under = 0;
        for (String line : lines) {
            List<String> lineParts = StrUtil.split(line, '-');
            if (isOverage(lineParts.get(1))) {
                over++;
            } else {
                under++;
            }
        }
        return (double) over / (over + under);
    }

    // 抽取人，年龄在 50 以下的概率为 70%，年龄在 50 以上的概率为 30%并写入一个文件
    private static void getRandomName2(String sortedFileOverage, String sortedFileUnderage) throws IOException {
        Random random = new Random();
        ArrayList<String> List = new ArrayList<>();
        String randomFile2 = "/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/IO/Directory/random-names.txt";
        if (random.nextInt(100) + 1 <= 70) {
            List.add(getRandomName1(sortedFileUnderage));

        } else {
            List.add(getRandomName1(sortedFileOverage));

        }

        FileUtil.writeLines(List, randomFile2, "utf-8", true);

    }

    // 把人按年龄分类，生成两个文件，一个是50岁以上的，一个是50岁以下的
    private static void sortByAge(String src) throws IOException {

        String sortedFileOverage = "/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/IO/Directory/Sorted-names-overage.txt";
        String sortedFileUnderage = "/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/IO/Directory/Sorted-names-underage.txt";
        if (new File(sortedFileOverage).exists()) {
            return;
        }
        if (new File(sortedFileUnderage).exists()) {
            return;
        }
        BufferedReader reader = new BufferedReader(new FileReader(src));
        String line;

        ArrayList<String> overageList = new ArrayList<>();
        ArrayList<String> underageList = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            List<String> lineParts = StrUtil.split(line, '-');
            if (isOverage(lineParts.get(1))) {
                overageList.add(line);

            } else {
                underageList.add(line);

            }
        }
        FileUtil.writeLines(overageList, sortedFileOverage, "utf-8");
        FileUtil.writeLines(underageList, sortedFileUnderage, "utf-8");

    }

    private static boolean isOverage(String string) {
        if (Integer.parseInt(string) > 50) {
            return true;
        }
        return false;
    }

    private static void getRandomName() {
        List<String> lines = FileUtil.readLines(
                "/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/IO/Directory/full-names.txt",
                "utf-8");
        System.out.println(lines.get(new Random().nextInt(lines.size())));
    }

    // 实现随机读取一行内容有两种方法，一种是把文件内容读到内存里，随机读取一行，另一种是通过文件指针随机读取一行
    // 主要讲下后者的实现方式
    // 它的核心逻辑是“边读边替换”，利用 Probability (概率) 来保证每一行被抽中的几率绝对均等：读到第 1 行时，100% 保留它。读到第 2
    // 行时，有 $\frac{1}{2}$ 的概率用它替换掉刚才保留的行。读到第 $n$ 行时，有 $\frac{1}{n}$ 的概率用它替换掉当前暂存的行。
    // 这种方法的优点是：它只需要一次遍历文件，且不需要将整个文件加载到内存中，因此非常适合处理大文件。
    // 对于这个文件，前者编程实现起来更简单，后者需要处理文件指针和概率问题，代码相对复杂一些。
    private static String getRandomName1(String src) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(src));
        String line;
        ArrayList<String> lines = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        return lines.get(new Random().nextInt(lines.size()));
    }
}
