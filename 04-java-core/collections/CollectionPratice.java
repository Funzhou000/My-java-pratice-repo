package DataConstruture_algorithm.Algorithm_CourseWork;

import java.util.ArrayList;

import Adv_OOP.Demo3.Student;

public class CollectionPratice {
    public static void main(String[] args) {
        Student s1 = new Student("001", 13, 'M');
        Student s2 = new Student("002", 14, 'F');
        Student s3 = new Student("003", 15, 'M');
        Student s4 = new Student("003", 15, 'M');
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        System.out.println(students.add(s4));
        System.out.println(students.contains(s4));// ture

        System.out.println(students);
        System.out.println(students.size());// 4

    }
}
