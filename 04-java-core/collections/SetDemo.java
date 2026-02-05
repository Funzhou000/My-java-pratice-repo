package DataConstruture_algorithm.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Hello");
        set.add("World");
        set.add("Java");
        set.add("Hello"); // Duplicate, should not be added
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (String s : set) {
            System.out.println(s);
        }
        set.forEach(str -> System.out.println(str));
    }
}
