package D9;

public class StudentTest2 {
    public static void main(String[] args) {
        Students[] arr = new Students[3];
        Students stu1 = new Students(1, "Alice", 20);
        Students stu2 = new Students(2, "Bob", 22);
        Students stu3 = new Students(3, "Charlie", 19);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        // 通过id删除信息
        delStudents(arr, 2);
        prinArr(arr);
    }

    public static Students[] delStudents(Students arr[], int id) {
        // 先判断id是否存在
        if (findIndex(arr, id) == -1) {
            // id不存在
            System.out.println("id不存在，无法删除");
        } else {
            int index = findIndex(arr, id);
            arr[index] = null;
            System.out.println("id为" + id + "的学生信息已删除");
        }
        return arr;
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
    // public static boolean isIdExist(Students[] arr, int id) {
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] != null) {
    // if (arr[i].getStdid() == id) {
    // return true;// id已存在，返回true
    // }
    // }
    // }
    // return false; // id不存在，返回false
    // }
}
