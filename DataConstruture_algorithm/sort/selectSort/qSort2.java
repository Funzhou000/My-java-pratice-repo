package DataConstruture_algorithm.sort.selectSort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class qSort2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 1, 2, 4, 5, 6, 723, 4, 65464, 345, 577);

        System.out.println(fastSort(arr));
    }

    private static ArrayList<Integer> fastSort(ArrayList<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        }

        // 2. Pivot Selection (随机选取基准值)
        // 注意：你原图中用 Scanner 是不对的，Scanner 是等用户输入。
        // 应该用 Random 类来产生随机索引。
        int randomIndex = new Random().nextInt(arr.size());
        int pivot = arr.get(randomIndex);

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>(); // 建议增加一个处理等于 pivot 的列表
        ArrayList<Integer> right = new ArrayList<>();

        // 3. Partition (分区)
        for (Integer num : arr) {
            if (num < pivot) {
                left.add(num);
            } else if (num > pivot) {
                right.add(num);
            } else {
                equal.add(num); // 处理与 pivot 相等的元素，避免死循环
            }
        }

        // 4. Recursive Step (递归调用)
        // 关键点：一定要接收返回的已排序 List

        // ArrayList<Integer> sortedLeft = fastSort(left);
        // ArrayList<Integer> sortedRight = fastSort(right);

        // // 5. Combine (拼接)
        // ArrayList<Integer> result = new ArrayList<>();
        // result.addAll(sortedLeft);
        // result.addAll(equal);
        // result.addAll(sortedRight);

        // ... 前面是 partition 逻辑 ...

        return Stream.of(fastSort(left), equal, fastSort(right))
                .flatMap(Collection::stream)
                .collect(Collectors.toCollection(ArrayList::new));
        // 使用 toCollection(ArrayList::new) 可以确保返回的是 ArrayList 类型

    }
}
