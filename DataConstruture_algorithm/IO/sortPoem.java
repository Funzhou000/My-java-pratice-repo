package DataConstruture_algorithm.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.TreeMap;

public class sortPoem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new java.io.FileReader("DataConstruture_algorithm/IO/Directory/cqmyg.txt"));
        String line;
        TreeMap<Integer, String> map = new TreeMap<>();

        while ((line = br.readLine()) != null) {
            String[] sentences = line.split("\\.");// \\. (Java 中的写法)： 在 Java 字符串中，反斜杠本身也是转义字符，所以你需要写两个反斜杠 \\
                                                   // 才能表示一个正则里的反斜杠，最终变成 \\. 来匹配那个点。
            if (line.trim().isEmpty()) {
                continue;
            }
            map.put(Integer.parseInt(sentences[0]), line);

        }
        br.close();
        BufferedWriter bw = new BufferedWriter(
                new java.io.FileWriter("DataConstruture_algorithm/IO/Directory/cqmyg_sorted.txt"));
        for (String value : map.values()) {
            bw.write(value);
            bw.newLine();
        }
        bw.close();

    }
}
