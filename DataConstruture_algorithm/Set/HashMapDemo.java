package DataConstruture_algorithm.Set;

import java.util.HashMap;

import Adv_OOP.Demo1.Student;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Student, String> hashMap = new HashMap<>();
        hashMap.put(new Student(1, "Alice"), "A");
        hashMap.put(new Student(1, "Alice"), "B");
        for (Student stu : hashMap.keySet()) {
            System.out.println(stu.getStudentId() + " : " + stu.getName() + " => " + hashMap.get(stu));
        }
    }
}
