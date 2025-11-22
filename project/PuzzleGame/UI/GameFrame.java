package project.PuzzleGame.UI;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.BevelBorder;

public class GameFrame extends JFrame implements KeyListener, ActionListener {
    JMenuBar jMenuBar = new JMenuBar();
    JMenu functionJMenu = new JMenu("Function");
    JMenu aboutJMenu = new JMenu("About us");
    JMenuItem replayItem = new JMenuItem("replay");
    JMenuItem reLoginItem = new JMenuItem("relogin");
    JMenuItem closeItem = new JMenuItem("close");

    JMenuItem accountItem = new JMenuItem("account");
    int step = 0;
    int arr2dmension[][] = new int[4][4];// 成员变量 所有成员方法都可以调用
    int row = 0;
    int col = 0;// 记录空白位置
    String wholePhotoPath = "/project/PuzzleGame/image/animal/animal3/";
    String winPath = "project/PuzzleGame/image";
    
    // Thread to prevent screen from sleeping
    private Thread keepAwakeThread;
    private volatile boolean isRunning = true;
    int answerArr[][] = new int[][] {
            { 1, 5, 9, 13 },
            { 2, 6, 10, 14 },
            { 3, 7, 11, 15 },
            { 4, 8, 12, 0 }
    };

    public GameFrame() {

        initalizeLogin();
        setBar();
        initData();
        initImage();
        startKeepAwakeThread();
        
        // Add window listener to stop thread when window closes
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                stopKeepAwakeThread();
            }
        });

        setVisible(true);
        this.addKeyListener(this);
    }

    private void initData() {

        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        Random r = new Random();
        int temp;

        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        // 转换成二维数组

        int num = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr2dmension[j][i] = arr[num];
                num++;
            }
        }

    }

    private void initImage() {
        // 清除原有图片
        this.getContentPane().removeAll();

        if (victory()) {
            JLabel winLabel = new JLabel(new ImageIcon(winPath + "/win.png"));
            winLabel.setBounds(203, 303, 197, 73);// 这里的坐标是图片的左上角坐标
            this.getContentPane().add(winLabel);
        }

        JLabel stepMenu = new JLabel("Steps: " + step);
        stepMenu.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepMenu);

        // 重新加载图片

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int number = arr2dmension[j][i];// j 行 i 列
                // 1. 动态加载图片路径
                String path = "/project/PuzzleGame/image/animal/animal3/" + number + ".jpg";
                java.net.URL imageUrl = this.getClass().getResource(path);
                // this.getClass().getResource从 bin 根目录开始找

                JLabel jLabel;

                // 记录空白位置
                if (number == 0) {
                    row = j;
                    col = i;
                }
                // 2. 安全检查：如果 imageUrl 是 null，说明没找到图片
                if (imageUrl == null) {

                    jLabel = new JLabel(new ImageIcon());// 找不到图片就显示文字代替
                } else {
                    jLabel = new JLabel(new ImageIcon(imageUrl));
                }
                // java.net.URL imageUrl = this.getClass().getResource("/image/animal/animal3/"
                // + number + ".jpg");
                // JLabel jLabel = new JLabel(new ImageIcon(imageUrl));
                // JLabel jLabel = new JLabel(new ImageIcon(
                // "/Users/funzhou/Documents/javacode/My-java-pratice-repo/project/PuzzleGame/image/animal/animal3/"
                // + number + ".jpg"));
                // 指定位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                // add image borader
                jLabel.setBorder(new BevelBorder(0));
                // this.add(jLabel);
                // 把管理容器添加到界面
                getContentPane().add(jLabel);
                number++;
            }
        }
        // 添加背景图片

        initalBackground();

    }

    private void initalBackground() {
        String backgroundPath = "/project/PuzzleGame/image/background.png";
        java.net.URL bgUrl = this.getClass().getResource(backgroundPath);
        JLabel bgLabel = new JLabel(new ImageIcon(bgUrl));
        bgLabel.setBounds(40, 40, 508, 560);
        this.getContentPane().add(bgLabel);
        // 刷新界面
        this.getContentPane().repaint();
    }

    private void setBar() {

        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        aboutJMenu.add(accountItem);
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);
        setJMenuBar(jMenuBar);
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
    }

    private void initalizeLogin() {
        setSize(603, 680);
        setTitle("拼图单机版 v1.0");
        setAlwaysOnTop(true);
        // set location in middle of screen
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        this.setLayout(null);
    }
    // 方向键处理

    @Override
    public void keyPressed(KeyEvent e) {

        int code = e.getKeyCode();
        // System.out.println(code);测试键对应码
        if (code == 39 || code == 68) { // 37 is Left Arrow, 65 is 'A'
            System.out.println("left");
            if (row == 0) {
                return;
            }
            // 把空白方块左边的数字赋值给空白方块
            arr2dmension[row][col] = arr2dmension[row - 1][col];
            arr2dmension[row - 1][col] = 0;
            row--;
            step++;
            initImage();
        } else if (code == 38 || code == 87) { // 38 is Up Arrow, 87 is 'W'
            System.out.println("up");
            if (col == 3) {
                return;
            }
            // 把空白方块上方的数字赋值给空白方块
            arr2dmension[row][col] = arr2dmension[row][col + 1];
            arr2dmension[row][col + 1] = 0;
            col++;
            step++;
            initImage();
        } else if (code == 37 || code == 65) { // 39 is Right Arrow, 68 is 'D'code == 37 || code == 65
            System.out.println("right");
            if (row == 3) {
                return;
            }
            // 把空白方块右边的数字赋值给空白方块
            arr2dmension[row][col] = arr2dmension[row + 1][col];
            arr2dmension[row + 1][col] = 0;
            row++;
            step++;
            initImage();
        } else if (code == 40 || code == 83) { // 40 is Down Arrow, 83 is 'S'
            System.out.println("down");
            if (col == 0) {
                return;
            }
            // 把空白方块下方的数字赋值给空白方块
            arr2dmension[row][col] = arr2dmension[row][col - 1];
            arr2dmension[row][col - 1] = 0;
            col--;
            step++;

            initImage();
        } else if (code == 32) {
            this.getContentPane().removeAll();
            String allPath = wholePhotoPath + "all.jpg";
            java.net.URL allUrl = this.getClass().getResource(allPath);
            JLabel wholePhoto = new JLabel(new ImageIcon(allUrl));
            wholePhoto.setBounds(83, 134, 420, 420);
            this.getContentPane().add(wholePhoto);
            initalBackground();
            this.getContentPane().repaint();
        } else if (e.isControlDown() && e.getKeyCode() == 90) {
            // 作弊
            // 必须把 answerArr 的数据正确复制给 arr2dmension
            // answerArr 是 [行][列], arr2dmension 是 [列][行]
            arr2dmension = answerArr;
            // 更新空白块的位置到右下角 (3, 3)
            // 注意：您的代码中 row 变量实际存的是列号(x), col 变量存的是行号(y)
            row = 3;
            col = 3;
            initImage();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (victory()) {
            return;
        }
        initImage();
    }

    @Override
    public void keyTyped(KeyEvent e) {

        // TODO Auto-generated method stub

    }

    public boolean victory() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr2dmension[j][i] != answerArr[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == replayItem) {
            initData();
            step = 0;
            initImage();
        } else if (source == reLoginItem) {
            this.setVisible(false);
            stopKeepAwakeThread();
            new LoginFrame();
        } else if (source == closeItem) {
            stopKeepAwakeThread();
            System.exit(0);
        } else if (source == accountItem) {
            new AccountFrame();
        }
    }
    
    /**
     * Starts a background thread to prevent the screen from sleeping.
     * This thread periodically simulates minimal mouse movement to keep the system awake.
     */
    private void startKeepAwakeThread() {
        keepAwakeThread = new Thread(() -> {
            try {
                Robot robot = new Robot();
                while (isRunning) {
                    // Get current mouse position and move back to it (simulates activity without affecting user)
                    PointerInfo pointerInfo = MouseInfo.getPointerInfo();
                    if (pointerInfo != null) {
                        Point currentPos = pointerInfo.getLocation();
                        robot.mouseMove(currentPos.x, currentPos.y);
                    }
                    // Wait for 60 seconds before next simulation
                    Thread.sleep(60000);
                }
            } catch (AWTException e) {
                System.err.println("Could not create Robot for keep-awake functionality: " + e.getMessage());
                return; // Exit thread if Robot cannot be created
            } catch (InterruptedException e) {
                // Thread interrupted, exit gracefully
                Thread.currentThread().interrupt();
                return;
            }
        });
        keepAwakeThread.setDaemon(true); // Make it a daemon thread
        keepAwakeThread.start();
    }
    
    /**
     * Stops the keep-awake thread when the game window is closed.
     */
    private synchronized void stopKeepAwakeThread() {
        if (!isRunning) {
            return; // Already stopped
        }
        isRunning = false;
        if (keepAwakeThread != null) {
            keepAwakeThread.interrupt();
        }
    }

    class AccountFrame extends JFrame {
        public AccountFrame() {
            JDialog jd = new JDialog();
            JLabel jl = new JLabel("Author: FunZhou");// new ImageIcon("project/PuzzleGame/image/about.png")
            jl.setBounds(50, 0, 200, 60);
            jd.setAlwaysOnTop(true);
            jd.getContentPane().setLayout(null);
            jd.getContentPane().add(jl);
            jd.setSize(200, 100);
            jd.setLocationRelativeTo(null);
            jd.setModal(true);
            jd.setVisible(true);
        }
    }
}
