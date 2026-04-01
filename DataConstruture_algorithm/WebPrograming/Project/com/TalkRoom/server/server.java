package DataConstruture_algorithm.WebPrograming.Project.com.TalkRoom.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

public class server {
    static Map<String, DataOutputStream> onlineUsers = new ConcurrentHashMap<>();
    static String Path = "/Users/funzhou/Documents/javacode/My-java-pratice-repo/DataConstruture_algorithm/WebPrograming/Project/com/TalkRoom/data/UsernamePassword.txt";
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8964)) {
            System.out.println("服务器已启动，等待客户端连接...");

            // 【修改点 1】外层循环不断接收新客户端的连接 (Accepting new connections)
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("新客户端已连接: " + socket.getInetAddress());

                // 【修改点 2】为每一个新接入的客户端启动一个独立线程 (Spawn a new thread)
                new Thread(() -> {
                    String currentUser = null; // 记录当前线程对应的登录用户名
                    try {
                        DataInputStream dis = new DataInputStream(socket.getInputStream());

                        while (true) {
                            int type = dis.readInt(); // 阻塞读取协议头

                            if (type == 2) {
                                handleRegistration(dis, socket);
                            } else if (type == 1) {
                                currentUser = handleLogin(dis, socket);
                            } else if (type == 3) {
                                // 【修改点 3】处理客户端发来的聊天消息 (Handling chat messages)
                                String message = dis.readUTF();
                                if (currentUser != null) {
                                    broadcastMessage(currentUser, message);
                                }
                            }
                        }
                    } catch (EOFException e) {
                        System.out.println("客户端断开连接");
                    } catch (IOException e) {
                        System.out.println("连接异常: " + e.getMessage());
                    } finally {
                        // 【清理工作】当用户强退或断网时，将他从在线列表中移除 (Clean up resources)
                        if (currentUser != null) {
                            onlineUsers.remove(currentUser);
                            broadcastMessage("系统消息", currentUser + " 离开了聊天室。");
                        }
                    }
                }).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
//    public static void main(String[] args) {
//        try(ServerSocket serverSocket = new ServerSocket(8964)) {
//            Socket socket = serverSocket.accept();
//            DataInputStream dis = new DataInputStream(socket.getInputStream());
//            // Server 端接收
//            while (true) {
//
//                int type = dis.readInt(); // 先读取第一个数字
//                if (type == 2) {
//                    handleRegistration(dis,socket); // 调用处理注册的方法
//                } else if (type == 1) {
//                    handleLogin(dis,socket);
//                }else if (type == 3) {
//                    String senderName = dis.readUTF();
//                    String message = dis.readUTF();
//                    broadcastMessage(senderName, message);
//                }
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    private static String handleLogin(DataInputStream dis, Socket socket) throws IOException {
        String userName = dis.readUTF();// 读取来自用户端的用户名
        String password = dis.readUTF();
        Properties properties = new Properties();
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        try( FileInputStream fis = new FileInputStream(Path)) {
          properties.load(fis);
          if (properties.containsKey(userName)) {
              String storedPassword = properties.getProperty(userName);
              if (storedPassword.equals(password)) {
                  dos.writeUTF("登录成功");
                  // 【关键 1】登录成功后，将这个用户的 OutputStream 加入到全局集合中
                  onlineUsers.put(userName, dos);
                  broadcastMessage("系统消息", userName + " 加入了聊天室！");
              } else {
                  dos.writeUTF("密码错误");
              }
          } else {
              dos.writeUTF("用户名不存在");
          }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userName;
    }

    private static void broadcastMessage(String senderName, String message) {
        String finalMsg = "[" + senderName + "] 说: " + message;

        // 遍历整个在线用户集合 (Iteration)
        for (Map.Entry<String, DataOutputStream> entry : onlineUsers.entrySet()) {
            String targetUser = entry.getKey();
            DataOutputStream targetDos = entry.getValue();

            try {
                // 如果你不想把消息发给发送者自己，可以加个判断
                 if (!targetUser.equals(senderName)) {
                targetDos.writeUTF(finalMsg);
                targetDos.flush(); // 确保数据被推送到网络层
                 }
            } catch (IOException e) {
                // 如果发送失败（比如对方强退了），把坏掉的连接从集合里移除
                onlineUsers.remove(targetUser);
            }
        }
    }

    private static void handleRegistration(DataInputStream dis,Socket socket) throws IOException {
        String userName = dis.readUTF();// 读取来自用户端的用户名
        String password = dis.readUTF();
        Properties properties = new Properties();
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        try (FileInputStream fileInputStream = new FileInputStream(Path)) {
            properties.load(fileInputStream);
            if (properties.containsKey(userName)) {
                dos.writeUTF("用户名已存在");
            } else {
                //返回添加成功的消息给客户端
                properties.setProperty(userName, password);
                // 使用 FileOutputStream 将内存中的 properties 写入磁盘
                try (FileOutputStream fos = new FileOutputStream(Path)) {
                    // 参数 2 是注释 (Comments)，可以传 null
                    properties.store(fos, "User database updated");
                    System.out.println("注册成功：用户名已添加");
                    dos.writeUTF("用户名符合要求,用户添加成功");
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
