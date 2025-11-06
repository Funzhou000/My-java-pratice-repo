package D7;

import java.util.Random;
import java.util.Scanner;

public class pratice7 {
    public static void main(String[] args) {
        int[] prize = new int[7];
        prize = randomArray();
        int[] inputArray = getNumber();
        System.out.println("你tm中了" + compaire(inputArray, prize) + "等奖");
    }

    public static int what_the_fuck_prize_u_get(int redcount, int bluecount) {
        if (redcount == 6 && bluecount == 1)
            return 1;
        else if (redcount == 6 && bluecount == 0)
            return 2;
        else if (redcount == 5 && bluecount == 1)
            return 3;
        else if (redcount == 5 && bluecount == 0)
            return 4;
        else if (redcount == 4 && bluecount == 1)
            return 4;
        else if (redcount == 4 && bluecount == 0)
            return 5;
        else if (redcount == 3 && bluecount == 1)
            return 5;
        else if (redcount == 2 && bluecount == 1)
            return 6;
        else if (redcount == 1 && bluecount == 1)
            return 6;
        else if (redcount == 0 && bluecount == 1)
            return 6;
        else
            return 0;
    }

    public static int compaire(int[] inputArray, int[] prize) {
        int redcount = 0;
        int bluecount = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (prize[i] == inputArray[j]) {
                    redcount++;
                }
            }
        }
        if (inputArray[6] == prize[6])
            bluecount++;
        return what_the_fuck_prize_u_get(redcount, bluecount);

    }

    public static int[] getNumber() {
        System.out.println("input red balls number");
        Scanner sc = new Scanner(System.in);
        int[] inputArray = new int[7];
        for (int i = 0; i < 6;) {
            int input = sc.nextInt();
            if (input < 33 && input >= 1) {
                inputArray[i] = input;
                System.out.println("u re inputing NO" + (i + 1));
                i++;
            } else
                System.out.println("wrong input");
        }
        System.out.println("input blue balls");
        int input2 = sc.nextInt();
        sc.close();
        if (input2 > 0 && input2 <= 16) {
            inputArray[6] = input2;
        } else
            System.out.println("wrong type in");
        return inputArray;
    }

    public static int[] randomArray() {
        int[] array = new int[7];
        int[] arrays = new int[100];// 存已经用过的红球
        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            int redNumber = r.nextInt(33) + 1;
            boolean flag = flags(arrays, redNumber);
            if (flag) {
                array[i] = redNumber;
                arrays[i] = redNumber;
            }
        }
        array[6] = r.nextInt(16) + 1;
        return array;
    }

    public static boolean flags(int arrays[], int redNumber) {
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == redNumber) {
                return false;
            }
        }
        return true;
    }
}
