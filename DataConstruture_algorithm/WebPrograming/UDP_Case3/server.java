package DataConstruture_algorithm.WebPrograming.UDP_Case3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8888)) {
            System.out.println("Server waiting for file...");

            while (true) {
                try (Socket socket = serverSocket.accept();
                     DataInputStream dis = new DataInputStream(socket.getInputStream())) {

                    // 1. 读取文件名和长度
                    String fileName = dis.readUTF();
                    long fileLength = dis.readLong();
                    System.out.println("Receiving file: " + fileName + " (" + fileLength + " bytes)");

                    // 2. 创建输出流，保存文件
                    File saveFile = new File("received_" + fileName);
                    try (FileOutputStream fos = new FileOutputStream(saveFile)) {
                        byte[] buffer = new byte[4096];
                        int length;
                        long totalRead = 0;

                        while (totalRead < fileLength && (length = dis.read(buffer)) != -1) {
                            fos.write(buffer, 0, length);
                            totalRead += length;
                        }
                    }
                    System.out.println("File saved successfully.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
