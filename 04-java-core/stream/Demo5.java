package DataConstruture_algorithm.Stream;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // 过滤基数
        list.stream().filter(t -> t % 2 == 0).forEach(s -> System.out.println(s));

    }
}
