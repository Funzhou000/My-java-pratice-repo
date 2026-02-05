package DataConstruture_algorithm.Set;

import java.util.HashSet;

import Adv_OOP.Demo1.Student;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        Student s1 = new Student(1, "Alice");
        Student s2 = new Student(1, "Alice"); // Same content as s1
        Student s3 = new Student(2, "Bob");
        System.out.println(hashSet.add(s1));
        System.out.println(hashSet.add(s2));
        System.out.println(hashSet.add(s3));
    }
}
