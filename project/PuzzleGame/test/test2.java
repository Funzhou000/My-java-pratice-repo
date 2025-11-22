package project.PuzzleGame.test;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 1. 类继承 JFrame，说明这个类本身就是一个窗口
public class test2 extends JFrame implements ActionListener {
    JButton jb = new JButton("push there");

    // 2. 把界面初始化的代码搬到构造方法里
    public test2() {
        // 因为本类就是 JFrame，所以直接调用方法，其实前面省略了 this.
        this.setSize(500, 500);
        this.setTitle("TEST");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);

        jb.setBounds(0, 0, 100, 50); // 稍微改大点不然看不见字

        // 3. 这里的 this 就不报错了，因为构造方法运行时，对象已经存在了

        // 把按钮加到自己身上
        this.add(jb);

        // 最后再让自己显示出来
        this.setVisible(true);
    }

    public static void main(String[] args) {
        // 4. main 方法只负责启动，new 一下自己
        new test2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("an");
    }
}