package DataConstruture_algorithm.Set;

import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>((a, b) -> b - a);
        treeMap.put(3, "cola");
        treeMap.put(1, "tissue");
        treeMap.put(2, "sugar");
        for (Integer key : treeMap.keySet()) {
            System.out.println(key + " => " + treeMap.get(key));
        }
    }
}
