package DataConstruture_algorithm.Leetcode.Exploration_Question;

import java.util.Arrays;

public class exploration4 {
    public static void main(String[] args) {
        int[] nums = { 3, 3, 1, 2, 5 };
        Arrays.sort(nums);
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                ans[0] = nums[i];
                ans[1] = i + 1;
                break;
            }
        }
        // 找到重复的数字
        // for (int i = 0; i < nums.length; i++) {
        // if(nums[i]==nums[i+1]){
        // ans[0]=nums[i];
        // break;
        // }
        // }
        // 缺失的数字
        for (int i = 1; i <= nums.length; i++) {
            int temp = Arrays.binarySearch(nums, i);
            if (temp <= 0) {
                ans[1] = i;
                break;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
