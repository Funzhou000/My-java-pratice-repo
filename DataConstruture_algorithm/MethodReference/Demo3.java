package DataConstruture_algorithm.MethodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "3", "2", "5", "4", "s", "a", "b", "c");
        list.stream().filter(Demo3::method).forEach(s -> System.out.println(s));
    }

    public static boolean method(String s) {
        return s.startsWith("s");
    }
}
