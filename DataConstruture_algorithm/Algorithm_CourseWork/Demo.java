package DataConstruture_algorithm.Algorithm_CourseWork;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        LIstUtil.addAll(list, "Hello", "World", "Java");
        for (String s : list) {
            System.out.println(s);
        }
        ArrayList<Integer> intList = new ArrayList<>();
        LIstUtil.addAll(intList, 1, 2, 3);
        for (Integer i : intList) {
            System.out.println(i);
        }
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Test1");
        myArrayList.add("Test2");

    }
}
