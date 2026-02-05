package DataConstruture_algorithm.Stream;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo4 {
    public static void main(String[] args) {
        // 练习终结方法中的 collect
        // collect。toMap（）
        ArrayList<String> list = new ArrayList<>();
        list.add("张三-男-1");
        list.add("历史-男-1");
        list.add("王五-男-1");
        list.add("老王-男-1");
        list.add("李四-女-1");
        // 要求把女放到一个Map 以名字为键-年龄为值中
        Map<String, Integer> hm = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {

                    @Override
                    public String apply(String t) {
                        return t.split("-")[0];

                    }

                }, new Function<String, Integer>() {

                    @Override
                    public Integer apply(String t) {
                        return Integer.parseInt(t.split("-")[2]);
                    }

                }));
        Map<String, Integer> m = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s -> s.split("-")[0], t -> Integer.parseInt(t.split("-")[2])));

        System.out.println(m);

    }
}