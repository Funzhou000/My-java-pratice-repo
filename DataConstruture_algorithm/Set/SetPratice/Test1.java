package DataConstruture_algorithm.Set.SetPratice;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "apple", "banana", "cherry", "date", "elderberry");
        System.out.println("Original list: " + list);
        Collections.shuffle(list);
        System.out.println("Shuffled list: " + list);

    }
}
