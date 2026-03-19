package DataConstruture_algorithm.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class objectIOStream {
    public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("DataConstruture_algorithm/IO/Directory/object.txt"));
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("DataConstruture_algorithm/IO/Directory/object.txt"));
        oos.writeObject(new testClass(0, "KKX"));
        testClass obj = (testClass) ois.readObject();
        System.out.println(obj);
        oos.close();
        ois.close();
    }
}
