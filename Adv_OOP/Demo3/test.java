package Adv_OOP.Demo3;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("li", 1, 'M');
        Student s2 = new Student("i", 2, 'M');
        Student s3 = new Student("li", 3, 'M');
        list.add(s3);
        list.add(s2);
        list.add(s1);
        System.out.println(StudentUtil.getMax(list));

    }
}
