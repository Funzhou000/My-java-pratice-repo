package D11;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("seconde");
        list.add("third");
        System.out.printf("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.printf(list.get(i));
            } else {
                System.out.printf(list.get(i) + ", ");
            }
        }
        System.out.println("]");
        System.out.println(list);
    }
}
