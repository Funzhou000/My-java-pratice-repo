package DataConstruture_algorithm.MethodReference;

import java.util.ArrayList;

import Adv_OOP.Demo1.Student;

public class Pratice2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张无忌,15"));
        list.add(new Student("周芷若,16"));
        list.add(new Student("赵敏,15"));
        list.add(new Student("小昭,14"));
        String[] array = list.stream().map(s -> s.getName()).toArray(String[]::new);
        // String[] array = list.stream().map(Student::getName).toArray(String[]::new);
        // String[] array = list.stream().map(new Function<Student, String>() {
        // @Override
        // public String apply(Student student) {
        // return student.getName();
        // }
        // }).toArray(String[]::new);
        for (String name : array) {
            System.out.println(name);
        }
    }
}
