package DataConstruture_algorithm.Algorithm_CourseWork;

import java.util.Arrays;

public class LambdaGrilFriend {
    public static void main(String[] args) {
        GrilFriend gf = new GrilFriend("Cathy", 22, 5.5);
        GrilFriend gf2 = new GrilFriend("Alice", 25, 5.6);
        GrilFriend gf3 = new GrilFriend().name("Bob").age(30).height(5.9);
        GrilFriend[] gfs = { gf, gf2, gf3 };
        Arrays.sort(gfs, new java.util.Comparator<GrilFriend>() {
            @Override
            public int compare(GrilFriend o1, GrilFriend o2) {
                int temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? (int) (o1.getHeight() - o2.getHeight()) : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
                // 返回值代表的这个对象应该往前放还是往后放
                if (temp < 0) {
                    return 1;
                } else if (temp > 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(gfs));
    }

}
