package DataConstruture_algorithm.MethodReference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "3", "2", "5", "4");
        list.stream().map(Integer::parseInt).forEach(System.out::println);

    }
}
