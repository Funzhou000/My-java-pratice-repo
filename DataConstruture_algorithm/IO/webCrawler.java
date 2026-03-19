package DataConstruture_algorithm.IO;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Pattern;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.lang.Matcher;

public class webCrawler {
    public static void main(String[] args) throws IOException {
        String firstName = "https://qiming.hao86.com/view/57250/";
        String lastName = "https://www.ifreesite.com/scriptures/hundred-family-surnames-01.htm";
        String webContent = getWebContent(lastName);
        String webContent2 = getWebContent(firstName);
        String regex = "(\\d+)\\.([\\u4e00-\\u9fa5]{2,})";
        Pattern pattern = Pattern.compile(regex);
        java.util.regex.Matcher matcher = pattern.matcher(webContent2);
        while (matcher.find()) {
            String name = matcher.group(2);
            FileUtil.appendString(name + "\n",
                    "/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/IO/Directory/hundred-family-firstname-01.txt",
                    "utf-8");
            System.out.println("成功提取名: " + name);
        }
        String regex2 = "<td><strong>([\\u4e00-\\u9fa5]+)</strong></td>";
        Pattern pattern2 = Pattern.compile(regex2);
        java.util.regex.Matcher matcher2 = pattern2.matcher(webContent);
        // 循环查找所有匹配的姓氏
        while (matcher2.find()) {
            // matcher.group(1) 提取的就是 (.*?) 捕获到的内容
            String surname = matcher2.group(1);
            FileUtil.appendString(surname + "\n",
                    "/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/IO/Directory/hundred-family-surnames.txt",
                    "utf-8");
            System.out.println("成功提取姓氏: " + surname);
        }
    }

    public static String getWebContent(String url) throws IOException {
        StringBuilder content = new StringBuilder();
        // 1.创建URL对象
        URL urlObj = new URL(url);
        // 2.打开连接
        URLConnection connection = urlObj.openConnection();
        // 3.获取输入流
        // 字节流转换成字符流
        InputStreamReader reader = new InputStreamReader(connection.getInputStream());
        // 4.读取数据
        int data;
        while ((data = reader.read()) != -1) {
            content.append((char) data);
        }
        // 5.关闭连接
        reader.close();
        return content.toString();
    }
}
