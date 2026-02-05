package DataConstruture_algorithm.IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class sortFileWithStream {
    public static void main(String[] args) throws IOException {
        // Useing Stream to sort file
        // Read file
        FileReader fr = new FileReader("DataConstruture_algorithm/IO/Directory/sort.txt");
        int ch;
        StringBuilder sb = new StringBuilder();
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }
        fr.close();
        String[] array = Arrays.stream(sb.toString().split("-")).map(Integer::parseInt).sorted().map(s -> s.toString())
                .toArray(String[]::new);
        // Write sorted numbers to another file
        FileWriter fw = new FileWriter("DataConstruture_algorithm/IO/Directory/sorted_with_stream.txt", false);
        fw.write("\n");
        fw.write(String.join("-", array));
        fw.close();
    }
}
