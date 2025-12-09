package DataConstruture_algorithm.Algorithm_CourseWork;

import java.util.ArrayList;
import java.util.List;

public class ListPratice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0, 0);
        list.remove(1);
        Integer a = 1;
        list.remove(a);
        System.out.println(list);
        list.set(0, a);
        list.get(0);
        System.out.println(list);
    }
}
