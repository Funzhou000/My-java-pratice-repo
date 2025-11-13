package Project1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagmentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// 不需要每次都开一个sc,把Scanner sc传入方法即可
        ArrayList<Student> list = new ArrayList<>();
        outerloop: while (true) {

            annouce();
            // 接受字符串防止用户输入其他东西导致报错

            String input = sc.next();

            switch (input) {
                case "1" -> addStudent(list, sc);
                case "2" -> deleteStudwent(list, sc);
                case "3" -> modifyStudent(list, sc);
                case "4" -> searchStudent(list, sc);
                case "5" -> {
                    sc.close();
                    break outerloop;
                }
                case "6" -> test(list);
                default -> System.out.println("wrong input");
            }

        }
        sc.close();
        System.out.println("系统已退出");

    }

    public static void searchStudent(ArrayList<Student> list, Scanner sc) {
        System.out.println("you are searching Student static");
        System.out.println("input the ID u want to search");

        String modifiedStudentId = sc.next();
        int index = exist(modifiedStudentId, list);
        if (index >= 0) {
            System.out.println("name     ID     AGE    Address");
            System.out.printf(list.get(index).getName() + "\t ");
            System.out.printf(list.get(index).getId() + " \t");
            System.out.printf(list.get(index).getAge() + " \t");
            System.out.printf(list.get(index).getAddress() + " \t");
            System.out.println(" ");
        }
    }

    public static void modifyStudent(ArrayList<Student> list, Scanner sc) {
        System.out.println("you are modifying Student static");
        System.out.println("input the ID u want to modify");

        String modifiedStudentId = sc.next();
        int index = exist(modifiedStudentId, list);
        if (index >= 0) {// 存在
            System.out.println("请输入新ID");
            String newId = sc.next();
            list.get(index).setId(newId);
            System.out.println("请输入新的学生姓名");
            String newName = sc.next();
            list.get(index).setName(newName);
            System.out.println("请输入新的年龄");
            int newAge = sc.nextInt();
            list.get(index).setAge(newAge);
            System.out.println("请输入新的地址");
            String newAddress = sc.next();
            list.get(index).setAddress(newAddress);
            System.out.println("修改成功");
        } else {
            System.out.println("ID 不存在");
        }

    }

    public static void deleteStudwent(ArrayList<Student> list, Scanner sc) {
        System.out.println("deleting Student");
        System.out.println("input the ID u want to delete");

        String deleteId = sc.next();
        // 先判断ID是否存在
        if (exist(deleteId, list) >= 0) {// true则为存在开始删除
            list.removeIf(Student -> Student.getId().equals(deleteId));
            System.out.println("delete successfully");
        } else {
            System.out.println("wrong input");
        }

    }

    public static void addStudent(ArrayList<Student> list, Scanner sc) {
        System.out.println("pleas input new Student ID");

        // 接受ID并查找
        String newStudentId = sc.next();
        if (exist(newStudentId, list) >= 0) {// 返回true则存在,输出ID已经存在亲重新输入
            System.out.println("ID已经存在亲重新输入");
        } else {
            System.out.println("input new Student name");
            String newStudentName = sc.next();
            System.out.println("input new Student age");
            int newStudentAge = sc.nextInt();
            System.out.println("intput new Student address");
            String newStudentAddress = sc.next();
            Student newStudent = new Student(newStudentId, newStudentName, newStudentAge, newStudentAddress);
            list.add(newStudent);
            System.out.println("add success");
        }
    }

    public static void annouce() {
        System.out.println("-------------欢迎来到学生管理系统----------------");
        System.out.println("1：添加学生");
        System.out.println("2：删除学生");
        System.out.println("3：修改学生");
        System.out.println("4：查询学生");
        System.out.println("5：退出");
        System.out.println("请输入您的选择:");

    }

    public static int exist(String ID, ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            if (ID.equals(list.get(i).getId())) {
                return i;
            }
        }
        return -1;
    }

    public static void test(ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("name: " + list.get(i).getName() + " ");
            System.out.printf("ID: " + list.get(i).getId() + " ");
            System.out.printf("Age: " + list.get(i).getAge() + " ");
            System.out.printf("Address: " + list.get(i).getAddress() + " ");
            System.out.println(" ");
        }
    }
}
