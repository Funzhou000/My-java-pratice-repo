package DataConstruture_algorithm.Set;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        //给一个字符串
        //打印出a(2)b(3)c(1)类似格式
        String str = "abcbabcaac";
        char[] arr = str.toCharArray();
        java.util.TreeMap<Character, Integer> treeMap = new java.util.TreeMap<>();
        for (char c : arr) {
            if (treeMap.containsKey(c)) {
                int count = treeMap.get(c);
                treeMap.put(c, count + 1);
            } else {
                treeMap.put(c, 1);}
    }
        StringBuilder sb = new StringBuilder();
        for (char c : treeMap.keySet()) {
            sb.append(c).append("(").append(treeMap.get(c)).append(")");
        }
        System.out.println(sb.toString());
}}
