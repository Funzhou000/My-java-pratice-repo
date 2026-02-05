package DataConstruture_algorithm.Set;

import java.util.TreeSet;

import Adv_OOP.Demo1.Student;

public class TreeSetCompare2 {
    public static void main(String[] args) {
        Student s1 = new Student(3, "Charlie");
        Student s2 = new Student(1, "Alice");
        Student s3 = new Student(2, "Bob");
        Student s4 = new Student(2, "Bod");
        TreeSet<Student> treeSet = new TreeSet<>((o1, o2) -> {
            int i = o1.getStudentId() - o2.getStudentId();
            i = i == 0 ? o1.getName().compareTo(o2.getName()) : i;
            return i;
        });
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s1);
        treeSet.add(s4);
        System.out.println("TreeSet of Students in sorted order by studentId:");
        for (Student s : treeSet) {
            System.out.println("Student ID: " + s.getStudentId() + ", Name: " + s.getName());
        }
    }
}
