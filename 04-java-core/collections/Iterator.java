package DataConstruture_algorithm.Algorithm_CourseWork;

import java.util.ArrayList;

public class Iterator {
    public static void main(String[] args) {
        String str1 = "hello";
        String str5 = "aaa";
        String str4 = "bbb";
        String str3 = "ccc";
        String str2 = "ddd";
        ArrayList<String> list = new ArrayList<>();
        list.add(str1);
        list.add(str2);
        list.add(str3);
        list.add(str4);
        list.add(str5);
        java.util.Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
        list.forEach(t -> System.out.println(t));
        for (String s : list) {
            System.out.println(s);
        }
    }
}
