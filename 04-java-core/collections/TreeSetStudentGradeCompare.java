package DataConstruture_algorithm.Set;

import java.util.TreeSet;

import Adv_OOP.Demo1.Student;
//int Grammer, int Math, int English, int age, String name

public class TreeSetStudentGradeCompare {
    public static void main(String[] args) {
        Student s1 = new Student(90, 85, 88, 18, "Alice");
        Student s2 = new Student(92, 80, 85, 19, "Bob");
        Student s3 = new Student(85, 90, 90, 17, "Charlie");
        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        System.out.println("TreeSet of Students in sorted order by total grades:");
        for (Student s : treeSet) {
            int totalGrade = s.getGrammer() + s.getMath() + s.getEnglish();
            System.out.println("Name: " + s.getName() + ", Total Grade: " + totalGrade);
        }
    }
}
