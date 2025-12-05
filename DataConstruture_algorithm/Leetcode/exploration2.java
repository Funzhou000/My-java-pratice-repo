package DataConstruture_algorithm.Leetcode;

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
    public static int[] method(int[] arr) {
        int[] result = new int[arr.length];
        int count = 0;
        int index = 0;
        // 使用循环代替递归，避免栈溢出和状态丢失问题
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (val == 1) {
                count++;
                if (i == arr.length - 1) {
                    result[index] = count;
                }
            } else if (val == 0) {
                result[index] = count;
                index++;//记得处理下数组下标
                
                count = 0; // 遇到0，记录当前的1的数量，并重置计数器
            }
        }

        return result;
    }
}
