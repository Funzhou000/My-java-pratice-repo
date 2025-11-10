package D9;

public class StudentsTest3 {
    public static void main(String[] args) {
        Students[] arr = new Students[3];
        Students stu1 = new Students(1, "Alice", 20);
        Students stu2 = new Students(2, "Bob", 22);
        Students stu3 = new Students(3, "Charlie", 19);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        // 查询id并把查到的人都年龄进行更改
        changeName(arr, 3, 4);
        prinArr(arr);
    }

    public static void changeName(Students[] arr, int id, int newAge) {
        // 先判断id是否存在
        if (findIndex(arr, id) == -1) {
            // id不存在
            System.out.println("id不存在");
        } else {
            int index = findIndex(arr, id);
            arr[index].setAge(newAge);
        }

    }

    public static int findIndex(Students[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getStdid() == id) {
                    return i;
                }
            }
        }
        return -1;// 未找到返回-1
    }

    public static void prinArr(Students[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(
                        "学生id:" + arr[i].getStdid() + ",学生姓名:" + arr[i].getName() + ",学生年龄:" + arr[i].getAge());

            }
        }

    }
}
