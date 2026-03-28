package DataConstruture_algorithm.MultiThreading.ThreadPratic5;

public class test {
    public static void main(String[] args) {
            Redpocket t1 = new Redpocket();
            Redpocket t2 = new Redpocket();
            Redpocket t3 = new Redpocket();
            Redpocket t4 = new Redpocket();
            Redpocket t5 = new Redpocket();
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();

    }
//1. 为什么先休眠的线程，不一定能先拿到权限？
//你的假设是：“t1 先启动 -> t1 先休眠 10ms -> t1 先醒来 -> t1 直接拿到锁”。
//但在实际的操作系统层面，逻辑是这样的：
//
//The Illusion of Precise Sleep (精确休眠的错觉)： Thread.sleep(10) 的语义并不是“精确休眠 10 毫秒后立刻执行”，而是“休眠至少 10 毫秒”。操作系统的时钟精度和调度机制决定了它无法做到纳秒级的绝对精准。
//
//State Transition (状态转换)： 当 10 毫秒过去后，t1 只是从 TIMED_WAITING (计时等待状态) 切换回了 RUNNABLE (就绪状态)，而不是直接进入 RUNNING (运行状态)。
//
//The Run Queue (就绪队列)： 在这 10 毫秒内，主线程已经把 t2, t3, t4, t5 都启动并进入了休眠。当 10 毫秒的阈值到达时，这 5 个线程几乎在同一个极短的时间窗口内（比如几百微秒内）相继被唤醒，并全部被扔进操作系统的 Run Queue (就绪队列) 中等待 CPU 分配。
//
//Context Switching (上下文切换)： 此时，OS Thread Scheduler (操作系统线程调度器) 会介入。调度器的算法（通常是时间片轮转或抢占式）会从就绪队列里随机挑选一个线程上 CPU 运行。在这个微观尺度下，谁先被塞进队列已经不重要了，它们面临的是一场完全公平（或随机）的无序竞争。
//    2. 为什么去掉 sleep，后 start() 的线程 3 和 4 反而先抢到红包？
//    你观察到的是去掉 sleep 后，抢红包的顺序变成了 0, 4, 3。这说明 t1.start() 虽然在代码里写在 t4.start() 前面，但 t4 反而先执行了。这是为什么？
//
//    Asynchronous Request (异步请求)： 在 Java 中调用 start() 方法，实际上是一个Asynchronous (异步) 操作。它只是主线程向 JVM 和操作系统发送了一个“请帮我建一个新线程”的请求，发送完这个请求后，主线程会立刻往下走，去调用下一个 start()。
//
//    Thread Creation Overhead (线程创建开销)： 操作系统接到请求后，需要在底层分配内存、创建 Call Stack (调用栈)、映射 Native Thread（原生线程）等。这个过程是非常复杂的，受当前系统负载、内存状态等诸多因素影响。
//
//    Unpredictable Initialization (不可预测的初始化时间)： 就像安排五个人去不同的房间换衣服准备赛跑。你依次通知了 1、2、3、4、5 号。虽然你先通知了 1 号，但可能 1 号的衣服扣子比较难解（底层资源分配稍慢了一点点），而 4 号动作特别快。结果 4 号反而先换好衣服，冲上了赛道。
//
//    总结来说： start() 的调用顺序，绝对不等于线程的Execution Order (执行顺序)。一旦主线程发出了启动请求，这些线程何时真正开始执行第一行代码，完全由操作系统底层的心情（调度器状态）决定。
//
//    你观察到的 0, 4, 3 这个顺序，恰恰证明了并发编程中最重要的一条铁律：永远不要依赖线程的启动顺序来控制业务逻辑的执行顺序。
}
