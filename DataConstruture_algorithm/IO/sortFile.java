package DataConstruture_algorithm.IO;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class sortFile {
    public static void main(String[] args) throws IOException {
        // read file that contains numbers, sort them and write to another file

        FileReader fr = new FileReader("DataConstruture_algorithm/IO/Directory/sort.txt");
        int ch;
        ArrayList<Integer> list = new ArrayList<>();
        // Read the file
        while ((ch = fr.read()) != -1) {
            if (ch >= '0' && ch <= '9') {
                list.add(ch - '0');
            }
        }
        fr.close();
        // Sort the numbers
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        // Write sorted numbers to another file
        StringBuilder sb = new StringBuilder();
        for (Integer num : list) {
            sb.append(num).append('-');
        }
        sb.delete(sb.length() - 1, sb.length());
        String string = sb.toString();
        java.io.FileWriter fw = new java.io.FileWriter("DataConstruture_algorithm/IO/Directory/sorted.txt");
        fw.write(string);
        fw.close();
    }
}
