package DataConstruture_algorithm.Set;

import java.util.TreeSet;

import Adv_OOP.Demo1.Student;

//要想使用自定义类加入到 TreeSet 中，必须让该类实现 Comparable 接口，并重写 compareTo 方法
public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student s1 = new Student(3, "Charlie");
        Student s2 = new Student(1, "Alice");
        Student s3 = new Student(2, "Bob");
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s1);
        System.out.println("TreeSet of Students in sorted order by studentId:");
        for (Student s : treeSet) {
            System.out.println("Student ID: " + s.getStudentId() + ", Name: " + s.getName());
        }
    }
}
