package D7;

import java.util.Scanner;

public class pratice5 {
    public static void main(String[] args) {
        // 1,循环输入6个分数,注意输入审查输入范围应在(0.100)
        int[] score = getscore();
        // 2,找到最小值,最大值
        int mini = findMinimun(score);
        int max = findMaximun(score);
        // 3,计算总和
        int sum = getsum(score);
        // 4,计算平均数
        double aver = (sum - mini - max) / (double) (score.length - 2);
        System.out.println(aver);
    }

    public static int getsum(int score[]) {
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        return sum;
    }

    public static int findMinimun(int score[]) {
        int mini = score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i] < mini)
                mini = score[i];
        }
        return mini;
    }

    public static int findMaximun(int score[]) {
        int max = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max)
                max = score[i];
        }
        return max;
    }

    public static int[] getscore() {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[6];
        // 输入6个(0,100)的数
        for (int i = 0; i < 6;) {
            System.out.println("typein new number");
            int score = sc.nextInt();
            if (score <= 100 && score > 0) {
                scores[i] = score;
                i++;
            } else
                System.out.println("wrong input");
        }
        sc.close();
        return scores;
    }
}
