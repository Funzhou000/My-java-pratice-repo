package DataConstruture_algorithm.reflection.pratice;

import java.io.*;
import java.lang.reflect.Field;
import java.nio.Buffer;

public class test {
    public static void main(String[] args) throws IOException {
        Student student = new Student("张三", 20, 5000.0);
        Save(student);
    }

    private static void Save(Student student) throws IOException {
        Class sClass = student.getClass();
        Field[] declaredFields = sClass.getDeclaredFields();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/reflection/pratice/saved.txt"));
        for (Field field : declaredFields) {
            field.setAccessible(true);
            try {
                bufferedWriter.write(field.getName() + ":" + field.get(student));
                bufferedWriter.newLine();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        bufferedWriter.close();

    }
}
