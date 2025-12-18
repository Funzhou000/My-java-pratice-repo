package DataConstruture_algorithm.Set.SetPratice;

import java.util.ArrayList;

import java.util.Collections;

public class RollCallSystem1 {
    static int currentIndex = 0;

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Collections.addAll(students, "学生A", "学生B", "学生C", "学生D", "学生E");

        Collections.shuffle(students);
        for (int i = 0; i < 3; i++) {
            System.out.println(students.get(currentIndex++));
            shuffleStudents(students);
        }

    }

    private static void shuffleStudents(ArrayList<String> students) {
        if (currentIndex == students.size()) {
            System.out.println("---- 开启新一轮点名，重新洗牌 ----");
            Collections.shuffle(students);
            currentIndex = 0;
        }

    }
}
