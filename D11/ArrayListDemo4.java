package D11;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<ArrayLIstUser> list = new ArrayList<>();
        ArrayLIstUser u1 = new ArrayLIstUser(341567, 345678, "vv3bnm");// 怎么查看要填什么值
        ArrayLIstUser u2 = new ArrayLIstUser(345367, 345678, "vv4bnm");
        ArrayLIstUser u12 = new ArrayLIstUser(345667, 3445678, "v5vbnm");
        ArrayLIstUser u13 = new ArrayLIstUser(345676, 3455678, "v6vbnm");
        // 吧user放入list
        list.add(u13);
        list.add(u1);
        list.add(u2);
        list.add(u12);
        System.out.println(contain(list, 341567));
    }

    // 做什么
    // 需要什么
    // 返回什么
    public static int contain(ArrayList<ArrayLIstUser> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }
}
