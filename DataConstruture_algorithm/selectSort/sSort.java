package DataConstruture_algorithm.selectSort;

import java.util.ArrayList;
import java.util.List;

public class sSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 5, 6, 7, 44, 77, 23));
        System.out.println(selectSort(list));

    }
    // 你的需求,推荐的简洁方法
    // 在代码里直接写死几个数,"new ArrayList<>(List.of(1, 2, 3)); (Java 9+)"
    // 转换 Integer[] (包装类) 数组,new ArrayList<>(Arrays.asList(myArray));
    // 转换 int[] (基本类)
    // 数组,Arrays.stream(myArray).boxed().collect(Collectors.toList()); (Java 8+)
    // 性能优先、代码清晰,for 循环 + new ArrayList<>(array.length);

    public static int findMax(ArrayList<Integer> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static ArrayList<Integer> selectSort(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int max = findMax(list);
            newList.add(max);
            list.remove((Integer) max);
        }
        return newList;
    }
}
