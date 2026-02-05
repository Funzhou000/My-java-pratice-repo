package DataConstruture_algorithm.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // 单列集合
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.stream().forEach(name -> System.out.println(name));
        // 双列集合
        HashMap<String, Integer> map = new HashMap<>();
        map.put("语文", 100);
        map.put("数学", 99);
        map.entrySet().stream().forEach(s -> System.out.println(s));
        map.keySet().stream().forEach(key -> System.out.println(key + "-->" + map.get(key)));
        // 数组
        Arrays.stream(arr).forEach(num -> System.out.println(num));
        // Stream.of 注意
        Stream.of(arr).forEach(name -> System.out.println(name));
        // 传递基本数据类型数组，不会自动装箱，到 stream 里面的是一个数组
    }
}
