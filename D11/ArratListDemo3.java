package D11;

import java.util.ArrayList;

public class ArratListDemo3 {
    public static void main(String[] args) {
        // 基本数据类型想放入集合变成包装类放入Arraylist
        // 创建集合
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('s');
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list);
        System.out.println(list2);
    }
}
