package DataConstruture_algorithm.WebPrograming.UDP_Case3;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class consumer {
    public static void main(String[] args) {
        //client 要先读取名字和大小并写入
        File file = new File("/Users/funzhou/Downloads/IMG_3640.HEIC"); // 替换为你的文件路径

        try (Socket socket = new Socket("127.0.0.1", 8888);
             FileInputStream fis = new FileInputStream(file);
             DataOutputStream dos = new DataOutputStream(socket.getOutputStream())) {

            // 1. 发送文件名和长度（这很重要，Server 才知道存成什么名字）
            dos.writeUTF(file.getName());
            dos.writeLong(file.length());
            //写入字符和长度 readUTF LONG
//            String fileName = dis.readUTF();
//            long fileLength = dis.readLong();

            // 2. 缓冲区读写 (Buffer)
            byte[] buffer = new byte[4096]; // 4KB 的缓冲区
            int length;
            System.out.println("Start uploading...");

            while ((length = fis.read(buffer)) != -1) {
                dos.write(buffer, 0, length);
            }

            dos.flush();
            System.out.println("Upload complete!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
