package DataConstruture_algorithm.WebPrograming.Project.com.TalkRoom.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = ConnectServer();
        while (true) {
            String str =initGUI();
            if (str.equals("1")) {
                Login(socket);
                break;
            } else if (str.equals("2")) {
                if(!Register(socket)){
                    System.out.println("注册失败，用户名已存在，请重新输入");
                    continue;
                }else{
                    System.out.println("注册成功，请输入登录信息");
                    continue;

                }//注册成功继续循环，输入登录信息
                //注册成功跳出循环
            }else{
                System.out.println("输入错误重新输入");
            }
        }

    }

    private static Socket ConnectServer() {
        try{
            Socket socket = new Socket("127.0.0.1",8964);
            System.out.println("连接服务器成功");
            return socket;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean Register(Socket socket) throws IOException {
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        //先输入用户名，传送数据给服务器，服务器在 data 文件里查询用户名是否存在
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = input.nextLine();
        System.out.println("请输入密码");
        String password = input.nextLine();
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeInt(2);//发送协议头 1 表示注册
        dos.writeUTF(username);//交给 server 服务器校验
        dos.writeUTF(password);
        //接受服务器的反馈,注册成功还是失败
        String registNotifi = dis.readUTF();
        if (registNotifi.equals("用户名符合要求,用户添加成功")) {
            return true;//添加成功
        } else   {
           return false;

        }


    }

    private static void Login(Socket socket) throws IOException {
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = input.nextLine();
        System.out.println("请输入密码");
        String password = input.nextLine();
        dos.writeInt(1);//表示要登录
        dos.writeUTF(username);
        dos.writeUTF(password);
        String serverRespnd = dis.readUTF();
        System.out.println(serverRespnd);//读取服务器反馈
        joinTalk(socket,serverRespnd,dis,dos,input,username);
    }

    private static void joinTalk(Socket socket,String response,DataInputStream dis,DataOutputStream dos,Scanner input,String username ) throws IOException {
        if (response.equals("登录成功")) {
            // 【关键】登录成功后，立刻启动一个新线程专门用来接收消息
            Thread listenerThread = new Thread(() -> {
                try {
                    while (true) {
                        // 这个 readUTF() 也是阻塞的，但因为它在独立线程里，所以不会影响你打字
                        String broadcastMsg = dis.readUTF();
                        System.out.println("\n" + broadcastMsg);
                    }
                } catch (IOException e) {
                    System.out.println("与服务器断开连接");
                }
            });
            listenerThread.start(); // 启动监听线程

            // 原来的主线程继续负责发送消息
            while (true) {

                String myMessage = input.nextLine();
                dos.writeInt(3); // 假设协议头 3 表示发送群聊消息

                dos.writeUTF(myMessage);
            }
        }
    }

    private static String initGUI() {
        System.out.println("GUI 初始化成功");
        System.out.println("1登录");
        System.out.println("2注册");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
