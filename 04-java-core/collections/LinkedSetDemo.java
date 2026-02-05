package DataConstruture_algorithm.Set;

import java.util.LinkedHashSet;

//LinkedSetDemo is construture which use a linked list link all the elements in the set
//Sothat it improve the search performance
public class LinkedSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Apple");
        linkedSet.add("Banana");
        linkedSet.add("Orange");
        System.out.println(linkedSet);// output 按顺序[Apple, Banana, Orange]
    }
}
