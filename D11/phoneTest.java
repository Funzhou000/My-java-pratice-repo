package D11;

import java.util.ArrayList;

public class phoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("xiaomi", 1000);
        Phone p2 = new Phone("apple", 8000);
        Phone p3 = new Phone("chuizi", 3000);
        list.add(p3);
        list.add(p2);
        list.add(p1);
        ArrayList<Phone> tempList = new ArrayList<>();
        tempList = getPhoneInfo(list);
        for (int i = 0; i < tempList.size(); i++) {
            System.out.println(tempList.get(i).getBrand());
        }
    }

    // 如果要返回多个数据可以吧这些数据线放到一个容器中在返回容器
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list) {
        ArrayList<Phone> tempList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrince() <= 3000) {
                tempList.add(list.get(i));
            }
        }
        return tempList;
    }
}
