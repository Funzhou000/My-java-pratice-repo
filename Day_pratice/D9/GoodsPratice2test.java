package D9;

public class GoodsPratice2test {
    public static void main(String[] args) {
        GoodsPratice2[] arr = new GoodsPratice2[3];
        GoodsPratice2 g1 = new GoodsPratice2(5, "huawei", 5999.9, 100);
        GoodsPratice2 g2 = new GoodsPratice2(6, "apple", 5999.9, 100);
        GoodsPratice2 g3 = new GoodsPratice2(7, "xiaomi", 599.9, 100);
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        for (int i = 0; i < arr.length; i++) {
            GoodsPratice2 goods = arr[i];
            System.out
                    .println(goods.getCount() + "," + goods.getId() + " " + goods.getName() + " \t" + goods.getCount());
        }
    }
}
