package DataConstruture_algorithm.WebPrograming.UDP_Pratice1;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class sentService {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入要发送的消息：");
            String str = sc.nextLine();
            if(str.contentEquals("exit")){
                break;
            }
            byte[] buf = str.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 8964;
            DatagramPacket packet = new DatagramPacket(buf, buf.length, address, port);
            socket.send(packet);
        }
        socket.close();
    }
}
