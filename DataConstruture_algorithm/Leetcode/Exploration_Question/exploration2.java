package DataConstruture_algorithm.Leetcode.Exploration_Question;

public class exploration2 {
    public static void main(String[] args) {

        int[] result = { 1, 4, 5, 6, 7 };
        int MAX = 0;
        for (int i = 0; i < result.length; i++) {
            MAX = Math.max(MAX, result[i]);
        }
        System.out.println(MAX);
        // int[] num = { 1, 2, 3, 4 };
        // int n = num.length / 2;
        // int front = 0;
        // int back = n;
        // int index = 0;
        // int[] ans = new int[num.length];
        // for (int i = 0; i < num.length / 2; i++) {
        // ans[index++] = num[front++];
        // ans[index++] = num[back++];
        // }
        // for (int i = 0; i < ans.length; i++) {
        // System.out.print(ans[i] + " ");
        // }
    }
}
