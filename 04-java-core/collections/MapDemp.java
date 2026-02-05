package DataConstruture_algorithm.Set;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemp {
    public static void main(String[] args) {
        Map<String, Integer> map = new java.util.HashMap<>();
        map.put("Alice", 90);
        map.put("Bob", 85);
        map.put("Charlie", 92);
        // map.remove("Alice");
        // System.out.println(map.get("Bob")); // 输出85
        // System.out.println(map.containsKey("Aluce"));
        // System.out.println(map.size());
        // System.out.println(map.isEmpty());
        for (String key : map.keySet()) {// keySet()方法返回Set集合 继承于 Collection接口 其实现了 Iterable 接口
            System.out.println(key + " : " + map.get(key));
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {// keySet()方法返回Set集合 继承于 Collection接口 其实现了 Iterable 接口
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("========================");
        Set<Entry<String, Integer>> eS = map.entrySet();
        eS.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
        System.out.println("========================");
        Iterator<Entry<String, Integer>> iterator = eS.iterator();
        while (iterator.hasNext()) {
            Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " ===> " + entry.getValue());
        }
        // map.forEach((key, value) -> System.out.println(key + " => " + value));
        // Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        // while (iterator.hasNext()) {
        // Map.Entry<String, Integer> entry = iterator.next();
        // System.out.println(entry.getKey() + " --> " + entry.getValue());
        // }

    }
}
