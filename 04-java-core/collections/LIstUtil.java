package DataConstruture_algorithm.Algorithm_CourseWork;

import java.util.ArrayList;

public class LIstUtil {
    private LIstUtil() {
    }

    public static <T> void addAll(ArrayList<T> list, T e1, T e2, T e3) {
        list.add(e1);
        list.add(e2);
        list.add(e3);
    }
}
