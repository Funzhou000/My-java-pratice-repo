package DataConstruture_algorithm.MethodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import Adv_OOP.Demo1.Student;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-18", "张三丰-108", "赵敏-16", "周芷若-16", "小昭-15");
        // List<Student> cl = list.stream().map(new Function<String, Student>() {

        // @Override
        // public Student apply(String t) {
        // String[] parts = t.split("-");
        // String name = parts[0];
        // int age = Integer.parseInt(parts[1]);
        // return new Student(name, age);
        // }

        // }).collect(Collectors.toList());
        List<Student> cl = list.stream().map(Student::new).collect(Collectors.toList());
        for (Student student : cl) {
            System.out.println(student);
        }
    }
}
