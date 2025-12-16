package DataConstruture_algorithm.Set;

import java.util.TreeMap;

import Adv_OOP.Demo1.Student;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Student, String> hashMap = new TreeMap<>((a, b) -> b.getStudentId() - a.getStudentId());
        hashMap.put(new Student(3, "Alice"), "A");
        hashMap.put(new Student(3, "Alice"), "A");
        hashMap.put(new Student(1, "Bob"), "B");
        hashMap.put(new Student(2, "Charlie"), "C");
        for (Student stu : hashMap.keySet()) {
            System.out.println(stu.getStudentId() + " " + stu.getName() + " => " + hashMap.get(stu));
        }
    }
}
