package DataConstruture_algorithm;

// import java.util.ArrayList;

// import D6.resist;

class leetcode307 {
    public static int main(int[][] grid) {
        // 定义两个数组分别存储行最大值和列最大值
        int[] rowMax = new int[grid.length];
        int[] colMax = new int[grid[0].length];

        // traverse 2d array
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                // 找行最大值：比较当前记录的行最大值和当前元素
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
                // 找列最大值：比较当前记录的列最大值和当前元素
                colMax[j] = Math.max(colMax[j], grid[i][j]);
                // 找到当前元素说在行列的最大值中的较小值

            }
        }

        return result(grid, rowMax, colMax);
    }

    static public int result(int[][] grid, int[] rowMax, int[] colMax) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                // 找到当前元素说在行列的最大值中的较小值
                int minHeight = Math.min(rowMax[i], colMax[j]);
                // 计算当前元素可以增加的高度
                sum += minHeight - grid[i][j];
            }
        }
        return sum;
    }
}
