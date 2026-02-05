package Adv_OOP.Demo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {
        System.out.println("this is tool class,do not instantiate ");
    }

    public static int getMax(ArrayList<Student> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i).getAge()) {
                max = list.get(i).getAge();
            }
        }
        return max;
    }
}
