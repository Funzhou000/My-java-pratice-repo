package DataConstruture_algorithm.Leetcode.Exploration_Question;

import java.util.ArrayList;
import java.util.Arrays;

//给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果
public class exploration6 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 4 };
        System.out.println(Arrays.toString(method(nums)));
    }

    public static int[] method(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 1; i <= nums.length; i++) {
            if (Arrays.binarySearch(nums, i) < 0) {
                // 没有i 这个数
                ans.add(i);
            }
        }
        return ans.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
