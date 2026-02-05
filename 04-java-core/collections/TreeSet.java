package DataConstruture_algorithm.Set;

import java.util.Iterator;

//TreeSet is a set implementation that stores elements in a sorted order
//It uses a red-black tree structure to maintain order and provide efficient operations
public class TreeSet {
    public static void main(String[] args) {
        java.util.TreeSet<Integer> treeSet = new java.util.TreeSet<>();
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        System.out.println("TreeSet elements in sorted order:");
        for (Integer num : treeSet) {
            System.out.println(num);
        }
        System.out.println("------------");
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("------------");
        treeSet.forEach(num -> System.out.println(num));
    }
}
