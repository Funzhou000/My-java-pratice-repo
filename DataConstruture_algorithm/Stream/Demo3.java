package DataConstruture_algorithm.Stream;

import java.util.ArrayList;
import java.util.function.IntFunction;

public class Demo3 {
    public static void main(String[] args) {
        // 终结方法
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        System.out.println(list.stream().count());
        list.stream().forEach(s -> System.out.println(s));
        String[] s = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        for (String string : s) {
            System.out.println(string);
        }

    }
}
