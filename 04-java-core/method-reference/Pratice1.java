package DataConstruture_algorithm.MethodReference;

import java.util.ArrayList;
import java.util.Collections;

import Adv_OOP.Demo1.Student;

public class Pratice1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,15", "周芷若,16", "赵敏,15", "小昭,14");
        Student[] array = list.stream().map(Student::new).toArray(Student[]::new);
        for (Student student : array) {
            System.out.println(student.getName() + "," + student.getAge());
        }
    }
}
