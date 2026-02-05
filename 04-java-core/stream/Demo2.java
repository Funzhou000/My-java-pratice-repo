package DataConstruture_algorithm.Stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Function;

public class Demo2 {
    public static void main(String[] args) {
        // 创建一个Stream流
        ArrayList<String> list = new ArrayList<>();
        list.add("张三-1");
        list.add("张三-2");
        list.add("张三-3");
        list.add("李四-1");
        // list.stream().filter(new Predicate<String>() {

        // @Override
        // public boolean test(String t) {
        // return t.startsWith("张");
        // }

        // }).forEach(name -> System.out.println(name));
        list.stream().distinct().forEach(name -> System.out.println(name));
        list.stream().filter(s -> s.startsWith("李")).forEach(name -> System.out.println(name));
        list.stream().skip(3).forEach(s -> System.out.println(s));
        list.stream().limit(3).forEach(s -> System.out.println(s));
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String t) {
                return t.length();
            }
        }).forEach(s -> System.out.println(s));
        list.stream().map(t -> t.length()).forEach(s -> System.out.println(s));
    }
}
