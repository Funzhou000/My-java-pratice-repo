package DataConstruture_algorithm.Leetcode.Exploration_Question;

import java.util.ArrayList;

public class exploration07 {
    public static void main(String[] args) {
        int[] target = { 1, 2 };
        int n = 4;
        int index = 0;
        String push = "Push";
        String pop = "Pop";
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arr1.add(i);
            ans.add(push);
            if (target[index] != i) {
                ans.add(pop);
                arr1.remove(index);
            } else {
                index++;
            }
            if (arr1.size() == target.length && arr1.get(target.length - 1) == target[target.length - 1]) {
                break;
            }
        }
        System.out.println(ans);

    }
}
