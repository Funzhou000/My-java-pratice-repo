package DataConstruture_algorithm.Stream;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三,18");
        list.add("李四,19");
        list.add("王五,24");
        list.add("赵六,25");
        // 需求：请使用Stream流的方式，打印出年龄大于20的用户手机他们的名字和年龄为 Map
        Map<String, Integer> m = list.stream().filter(s -> Integer.parseInt(s.split(",")[1]) >= 20)
                .collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));
        System.out.println(m);
    }
}
