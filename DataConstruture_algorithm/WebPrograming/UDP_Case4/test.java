package DataConstruture_algorithm.WebPrograming.UDP_Case4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class test {
    public static void main(String[] args) {
        try ( ServerSocket serverSocket = new ServerSocket(8964)){
            Socket socket = serverSocket.accept();
            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            int a;

            while ((a=isr.read())!=-1) {
                System.out.print((char) a);
            }
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
