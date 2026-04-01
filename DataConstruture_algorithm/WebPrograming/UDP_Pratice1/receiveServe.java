package DataConstruture_algorithm.WebPrograming.UDP_Pratice1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class receiveServe {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds =new DatagramSocket(8964);
        DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);
        while (true) {
            ds.receive(dp);
            byte[] data = dp.getData();
            int len = dp.getLength();
            String ip  = dp.getAddress().getHostAddress();
            String name = dp.getAddress().getHostName();
            int port = dp.getPort();
            System.out.println("收到来自"+ip+"-"+name+"-"+port+"的消息："+new String(data,0,len));
        }
    }
}
