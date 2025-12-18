package DataConstruture_algorithm.Set.SetPratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RollCallSystem {
    // 1. 定义成员变量，保存状态
    private List<String> students;
    private int currentIndex;

    public RollCallSystem() {
        students = new ArrayList<>();
        students.add("学生A");
        students.add("学生B");
        students.add("学生C");
        students.add("学生D");
        students.add("学生E");

        // 初始化时先洗牌
        shuffleStudents();
    }

    // 洗牌方法
    private void shuffleStudents() {
        System.out.println("---- 开启新一轮点名，重新洗牌 ----");
        Collections.shuffle(students);
        currentIndex = 0; // 重置索引 (Reset index)
    }

    // 点名方法
    public String nextStudent() {
        // 2. 检测是否到达末尾
        if (currentIndex >= students.size()) {
            shuffleStudents();
        }

        // 3. 获取当前学生并递增索引
        return students.get(currentIndex++);
    }

    public static void main(String[] args) {
        RollCallSystem system = new RollCallSystem();

        // 模拟点名 12 次 (测试两轮多一点)
        for (int i = 1; i <= 12; i++) {
            System.out.println("第 " + i + " 位点名: " + system.nextStudent());
        }
    }
}
