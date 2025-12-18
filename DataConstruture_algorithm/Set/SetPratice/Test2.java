package DataConstruture_algorithm.Set.SetPratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0);
        Collections.shuffle(list);
        Random rand = new Random();
        int index = rand.nextInt(list.size());
        int number = list.get(index);
        ArrayList<String> boyList = new ArrayList<>();
        Collections.addAll(boyList, "Liam", "Noah", "Oliver", "James", "Elijah", "Mateo", "Theodore", "Henry", "Lucas",
                "William");
        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(girlList, "Olivia", "Emma", "Ava", "Sophia", "Isabella", "Mia", "Charlotte", "Amelia",
                "Harper", "Evelyn");
        if (number == 1) {
            System.out.println(boyList.get(rand.nextInt(boyList.size())));
        } else {
            System.out.println(girlList.get(rand.nextInt(girlList.size())));
        }
    }
}
