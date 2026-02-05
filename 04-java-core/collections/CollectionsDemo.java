package DataConstruture_algorithm.Set;

import java.util.ArrayList;
import java.util.Collections;

import Adv_OOP.Demo1.Student;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        System.out.println("Original list: " + list);
        System.out.println("------------------------");
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);
        System.out.println("------------------------");
        Collections.shuffle(list);
        System.out.println("Shuffled list: " + list);
        System.out.println("------------------------");
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
        System.out.println("------------------------");
        Collections.sort(list, (a, b) -> b - a);
        System.out.println("Reverse sorted list: " + list);
        ArrayList<Student> list2 = new ArrayList<>();
        Student s1 = new Student(0, 85, 88, 18, "Alice");
        Student s2 = new Student(1, 80, 85, 19, "Bob");
        Student s3 = new Student(2, 90, 90, 17, "Charlie");
        Collections.addAll(list2, s1, s2, s3);
        System.out.println("------------------------");
        Collections.sort(list2, (a, b) -> b.getGrammer() - a.getGrammer());
        System.out.println(list2);
        Collections.binarySearch(list, 3);
        System.out.println("Index of 3: " + Collections.binarySearch(list, 3));
        System.out.println("Index of s3: " + Collections.binarySearch(list2, s3));
        System.out.println("------------------------");
        ArrayList<Integer> dest = new ArrayList<>(Collections.nCopies(list.size(), 0));
        Collections.copy(dest, list);
        System.out.println("Copied list: " + dest);
        System.out.println("------------------------");
        Collections.fill(dest, 0);
        System.out.println("Filled list: " + dest);
        System.out.println("------------------------");
        System.out.println("Max value: " + Collections.max(list));
        System.out.println(list);
        Collections.swap(list, 0, list.size() - 1);
        System.out.println("List after swap: " + list);

    }
}
