package D9;

public class StudentsTest {
    public static void main(String[] args) {

        Students[] arr = new Students[3];
        Students stu1 = new Students(1, "Alice", 20);
        Students stu2 = new Students(2, "Bob", 22);
        Students stu3 = new Students(3, "Charlie", 19);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        Students stu4 = new Students(4, "Diana", 21);
        if (isUnique(arr, stu4.getStdid())) {
            // 是唯一的id接下来判断数组是否已满
            int c = countStudents(arr);
            if (c < 3) {
                // 数组未满，添加学生对象进数组
                // 构造方法来找索引
                arr[c] = stu4;
                prinArr(arr);
            } else {
                // 数组已满
                Students[] newArr = new Students[arr.length + 1];
                for (int i = 0; i < arr.length; i++) {
                    newArr[i] = arr[i];
                }
                newArr[newArr.length - 1] = stu4;
                prinArr(newArr);
            }

            // 唯一性判断
            // 数组已满建立新数组,添加学生对象进数组
        }

        // what i will do
        // 需要数组和id
        // 必须返回结果true or false
    }

    // 打印数组方法
    public static void prinArr(Students[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(
                        "学生id:" + arr[i].getStdid() + ",学生姓名:" + arr[i].getName() + ",学生年龄:" + arr[i].getAge());

            }
        }

    }

    public static int countStudents(Students[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;

    }

    public static boolean isUnique(Students[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getStdid() == id) {
                    return false;// id已存在，返回false
                    // 这里有可能读到空的对象,所以要加一个判断
                }

            }
        }
        return true; // id唯一，返回true
    }
}
