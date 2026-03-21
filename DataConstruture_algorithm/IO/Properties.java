package DataConstruture_algorithm.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Properties {
    public static void main(String[] args) throws IOException, IOException {
        // 这里是一个示例，展示如何使用Java的Properties类来读取和写入属性文件
        // 你可以根据需要修改文件路径和属性内容
        String filePath = "DataConstruture_algorithm/IO/Directory/config.properties";
        // 创建一个Properties对象
        java.util.Properties properties = new java.util.Properties();
        // properties可放入的元素是 object类型的键值对
        // 写入属性
        properties.put("username", "kali");
        properties.put("password", "123456");
        // 将属性写入文件
        properties.store(new FileOutputStream(filePath), filePath);

        // 读取属性
        java.util.Properties readProperties = new java.util.Properties();
        readProperties.load(new java.io.FileInputStream(filePath));
        String username = readProperties.getProperty("username");
        String password = readProperties.getProperty("password");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

    }
}
