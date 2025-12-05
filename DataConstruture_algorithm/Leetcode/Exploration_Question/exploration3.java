package DataConstruture_algorithm.Leetcode.Exploration_Question;

import java.util.ArrayList;

public class exploration3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(1);
        arr.add(0);
        ArrayList<Integer> result = method(arr);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }

    public static ArrayList<Integer> method(ArrayList<Integer> arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int count = 0;

        // 使用循环代替递归，避免栈溢出和状态丢失问题
        for (int i = 0; i < arr.size(); i++) {
            int val = arr.get(i);
            if (val == 1) {
                count++;
            } else if (val == 0) {
                result.add(count);
                count = 0; // 遇到0，记录当前的1的数量，并重置计数器
            }
        }

        return result;
    }
}
