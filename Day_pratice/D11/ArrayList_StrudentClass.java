package D11;

import java.util.ArrayList;

public class ArrayList_StrudentClass {
    public static void main(String[] args) {
        ArrayList<StrudentClass> list = new ArrayList<>();
        StrudentClass s1 = new StrudentClass("li", 23);
        StrudentClass s2 = new StrudentClass("s", 54);
        StrudentClass s3 = new StrudentClass("gd", 32);
        list.add(s3);
        list.add(s2);
        list.add(s1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + " \t" + list.get(i).getAge());
        }
    }
}
