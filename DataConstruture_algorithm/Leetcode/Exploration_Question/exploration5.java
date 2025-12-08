package DataConstruture_algorithm.Leetcode.Exploration_Question;
//         给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。

// 换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。

// 以数组形式返回答案。

public class exploration5 {
    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        int[] ans = method(nums);
        System.out.println(java.util.Arrays.toString(ans));
    }

    // 暴力解法
    public static int[] method(int[] nums) {
        int[] ans = new int[nums.length];

        int count = 0;
        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[j] > nums[i]) {
                    count++;
                }
            }
            ans[j] = count;
            count = 0;
        }
        return ans;
    }
}
