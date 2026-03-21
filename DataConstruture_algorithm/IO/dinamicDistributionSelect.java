package DataConstruture_algorithm.IO;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import cn.hutool.core.io.FileUtil;

public class dinamicDistributionSelect {
    public static void main(String[] args) {
        // 把人物以名字-年龄-权重从文件中读取并创建 student 对象，并将对象放入集合中
        // 取出每一行的学生信息
        String filePath = "/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/IO/Directory/students.txt";
        List<Student> collect = FileUtil.readLines(filePath, "utf-8").stream().map(line -> line.split("-"))
                .map(data -> new Student(data[0], Integer.parseInt(data[1]), Double.parseDouble(data[2])))
                .collect(Collectors.toList());
        double[] arr = new double[collect.size()];
        for (int i = 0; i < collect.size(); i++) {
            arr[i] = collect.get(i).getweight();
        }
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        Random random = new Random();
        // Double randomValue = 70.0;
        Double randomValue = random.nextDouble() * arr[arr.length - 1];//
        // （0，1）*totalWeight
        System.out.println(randomValue);
        int index = Arrays.binarySearch(arr, randomValue);
        if (index < 0) {
            index = -index - 1;
        }
        System.out.println("Selected : " + collect.get(index));

    }
}

class Student {
    private String name;
    private int age;
    private double weight; // 权重

    // Constructor (构造器)
    public Student(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Getter 和 Setter 方法 (用于访问私有属性)
    public double getweight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", weight=" + weight + "}";
    }
}
