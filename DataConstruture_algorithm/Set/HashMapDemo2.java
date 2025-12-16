package DataConstruture_algorithm.Set;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class HashMapDemo2 {
    public static void main(String[] args) {
        char[] arr = { 'A', 'B', 'C', 'D' };
        char[] arr2 = new char[80];
        Random rand = new Random();
        for (int i = 0; i < 80; i++) {
            arr2[i] = arr[rand.nextInt(arr.length)];
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c : arr2) {
            if (hashMap.containsKey(c)) {
                int count = hashMap.get(c);
                hashMap.put(c, count + 1);
            } else {
                hashMap.put(c, 1);
            }
        }
        int maximum = 0;
        for (char c : hashMap.keySet()) {
            maximum = Math.max(maximum, hashMap.get(c));

        }
        StringBuilder ans = new StringBuilder();
        int i = 0;
        for (char c : hashMap.keySet()) {
            if (hashMap.get(c) == maximum) {
                ans.append(c);
            }
        }
        System.out.println(ans.toString() + "出现的次数为：" + maximum);
    }
}
