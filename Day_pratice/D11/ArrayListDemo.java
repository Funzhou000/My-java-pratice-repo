package D11;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.add("aaa"));// fanhui boolean
        // list.remove("aaa");
        // String str = list.remove(0);// 返回被删除的元素
        // System.out.println(str);
        // 修改
        list.set(0, "sss");// return modified
        // search
        list.get(0);
        // get length
        list.size();
        System.out.println(list.size());
        // list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
