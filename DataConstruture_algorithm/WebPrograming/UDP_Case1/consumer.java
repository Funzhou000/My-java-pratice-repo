package DataConstruture_algorithm.WebPrograming.UDP_Case1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class consumer {
    public static void main(String[] args) {
        try ( Socket socket = new Socket("127.0.0.1",8964)){
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            writer.println("Hello Server, this is Fangzhou.");
            Scanner scanner = new Scanner(System.in);
            while (true) {
                // nextLine will block until user input a line and press enter
                //它会一直阻塞（Wait），直到读取到 \n 为止。
                String outputStr = scanner.nextLine();
                if(outputStr.contentEquals("exit")){
                    writer.println(outputStr);
                    System.out.println("Consumer Exiting...");
                    break;
                }
                writer.println(outputStr);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
