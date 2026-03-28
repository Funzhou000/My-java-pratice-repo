package DataConstruture_algorithm.MultiThreading.ThreadPratic5;

import java.util.Deque;
import java.util.Random;

public class Redpocket extends Thread {
    //设置锁
    static Object lock = new Object();
    //设置红包金额
    static int money = 100;
    //设置红包个数
    static int count = 3;
    //使用队列来判断是否已经把红包都发完了
    static Deque<Integer> queue = new java.util.LinkedList<>();
    //使用静态代码块多个线程只执行一次
    static {
        Random rand = new Random();
        int remainMoney = money;
        int remainCount = count; // 剩余红包个数

        for (int i = 0; i < count - 1; i++) {
            // 关键逻辑：随机范围必须预留出剩余人每人至少 1 元的空间
            // 范围：[1, 剩余金额 - 剩余人数 + 1]
            int max = remainMoney - (remainCount - 1);
            int tempmoney = rand.nextInt(max) + 1;

            queue.addLast(tempmoney);
            remainMoney -= tempmoney;
            remainCount--;
        }
        // 最后一个红包拿走剩下的所有钱
        queue.addLast(remainMoney);
        System.out.println("红包队列初始化完成: " + queue);
    }
    @Override
    public void run() {
        try {
            Thread.sleep(10); // 给所有线程一点准备时间
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (lock) {

            if (queue.isEmpty()) {
                System.out.println(Thread.currentThread().getName() + "手速慢了...");
            } else {
                System.out.println(Thread.currentThread().getName() + "抢到了" + queue.removeFirst() + "元");
            }
        }

    }
}
