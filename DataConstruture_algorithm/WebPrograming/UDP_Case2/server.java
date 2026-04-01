package DataConstruture_algorithm.WebPrograming.UDP_Case2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) {
        //tcp receive multi data and print
        try (ServerSocket server = new ServerSocket(8964)) {//自动关闭 ServerSocket
            System.out.println("服务器已启动，等待客户端连接...");
            Socket socket = server.accept();
            System.out.println("Client connected");
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String str = bufferedReader.readLine();
                if(str.contentEquals("exit")){
                    System.out.println("Client Exiting...");
                    break;
                }else if(str.contentEquals("ping")){
                    OutputStream output = socket.getOutputStream();
                    PrintWriter writer = new PrintWriter(output, true);
                    writer.println("127.0.0.1:8964");
                }
                System.out.println("收到客户端消息：" + str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
