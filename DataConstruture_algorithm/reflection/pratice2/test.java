package DataConstruture_algorithm.reflection.pratice2;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class test {
    static String path ="/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/reflection/pratice2/pro.properties";
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //根据配置文件创建实例对象并调用方法
        java.util.Properties prop = new java.util.Properties();
        FileInputStream fileInputStream = new FileInputStream(path);
        prop.load(fileInputStream);
        fileInputStream.close();

        Object className = prop.getProperty("className");
        String  method = prop.getProperty("method");
        Class clazz = Class.forName((String) className);
        Object object = clazz.getDeclaredConstructor().newInstance();
        System.out.println(object);
        Method declaredMethod = clazz.getDeclaredMethod(method);
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(object);
    }
}
