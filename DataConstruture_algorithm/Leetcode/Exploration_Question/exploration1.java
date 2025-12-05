package DataConstruture_algorithm.Leetcode.Exploration_Question;

public class exploration1 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int[] nums2 = new int[nums.length * 2];
        int index = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < nums.length; j++) {
                nums2[index++] = nums[j];
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
    }
}
