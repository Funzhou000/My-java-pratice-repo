package D10;

public class StringAdjustS {
    public static void main(String[] args) {
        String str1 = "ab";
        String str2 = "ba";
        System.out.println(compareString2(str1, str2));
        System.out.println(isRotation(str1, str2));
        System.out.println(compareString(str1, str2));
    }

    public static boolean compareString(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        for (int i = 0; i < str1.length(); i++) {
            char start = str1.charAt(0);
            String end = str1.substring(1);
            str1 = end + start;
            if (str1.equals(str2)) {
                return true;
            }
        }
        return false;

    }

    public static boolean compareString2(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            char first = arr1[0];
            for (int j = 1; j < arr1.length; j++) {
                arr1[j - 1] = arr1[j];
            }
            arr1[arr1.length - 1] = first;
            if (new String(arr1).equals(str2)) {
                // 这里应该用new String(arr1)来转换成字符串进行比较
                return true;
            }
        }
        return false;

    }

    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        String str1str1 = str1 + str1; // 例如 "abc" + "abc" = "abcabc"

        // "abcabc" 包含了 "bca" 和 "cab"
        return str1str1.contains(str2);
    }
}
