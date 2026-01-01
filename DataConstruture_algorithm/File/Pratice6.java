package DataConstruture_algorithm.File;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class Pratice6 {
    public static void main(String[] args) {
        // 统计某个目录下不同格式的文件个数
        HashMap<String, Integer> fileType = countFileTypeADV(new java.io.File(
                "/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/File"));
        System.out.println(fileType);
    }

    public static ArrayList<HashMap<String, Integer>> countFileType(File dir) {
        ArrayList<HashMap<String, Integer>> hpList = new ArrayList<>();
        HashMap<String, Integer> hp1 = new HashMap<>();
        HashMap<String, Integer> hp2 = new HashMap<>();
        HashMap<String, Integer> hp3 = new HashMap<>();

        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                if (file.getName().endsWith(".java")) {
                    hp1.put("java", hp1.getOrDefault("java", 0) + 1);
                } else if (file.getName().endsWith(".avi")) {
                    hp2.put("avi", hp2.getOrDefault("avi", 0) + 1);
                } else if (file.getName().endsWith(".mp4")) {
                    hp3.put("mp4", hp3.getOrDefault("mp4", 0) + 1);
                }
            }
        }
        hpList.add(hp1);
        hpList.add(hp2);
        hpList.add(hp3);
        return hpList;
        // 这段代码有 3 个问题：1. 只能统计三种格式的文件扩展性差 2. 只能统计一层目录下的文件 3. 返回值类型数据结构不合适
    }

    public static HashMap<String, Integer> countFileTypeADV(File dir) {
        // 1. 检查目录是否合法
        if (dir == null || !dir.exists() || !dir.isDirectory()) {
            return new HashMap<>();
        }

        // 2. 只需要一个 HashMap 存所有类型
        HashMap<String, Integer> countMap = new HashMap<>();

        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    String fileName = file.getName();
                    // 3. 动态获取后缀名逻辑
                    int lastIndex = fileName.lastIndexOf(".");
                    if (lastIndex != -1) {
                        // 截取后缀，例如 "java", "avi"
                        String suffix = fileName.substring(lastIndex + 1);
                        // 4. 使用 getOrDefault 自动计数
                        countMap.put(suffix, countMap.getOrDefault(suffix, 0) + 1);
                    }
                } else {
                    HashMap<String, Integer> DirData = countFileTypeADV(file);
                    for (String key : DirData.keySet()) {
                        countMap.put(key, countMap.getOrDefault(key, 0) + DirData.get(key));
                    }
                }
            }
        }
        return countMap;
    }
}
