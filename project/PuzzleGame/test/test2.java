package project.PuzzleGame.test;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 1. 类继承 JFrame，说明这个类本身就是一个窗口
public class test2 extends JFrame implements ActionListener {
    JButton jb1 = new JButton("+");
    JButton jb2 = new JButton("-");
    JButton jb3 = new JButton("=");
    JButton jb4 = new JButton("push there");
    JLabel resultLabel = new JLabel("000");
    JTextField textField = new JTextField(20);

    // 2. 把界面初始化的代码搬到构造方法里
    public test2() {
        // 因为本类就是 JFrame，所以直接调用方法，其实前面省略了 this.
        initializeWindow();
        initJbutton();

        getTextField();
        // 最后再让自己显示出来
        this.setVisible(true);
    }

    private void initializeWindow() {
        this.getContentPane().removeAll();
        this.setSize(500, 500);
        this.setTitle("TEST");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);
    }

    private void getTextField() {
        textField.setBounds(100, 60, 200, 30);
        // 给文本框也添加监听，这样回车也能触发
        textField.addActionListener(this);
        this.add(textField);
        resultLabel.setBounds(100, 200, 300, 30);

        this.getContentPane().add(resultLabel);

    }

    private void initJbutton() {
        // TODO Auto-generated method stub
        jb1.setBounds(0, 0, 100, 50); // 稍微改大点不然看不见字
        jb2.setBounds(0, 50, 100, 50);
        jb3.setBounds(0, 100, 100, 50);

        // 3. 这里的 this 就不报错了，因为构造方法运行时，对象已经存在了
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        // 把按钮加到自己身上
        this.add(jb1);
        this.add(jb2);
        this.add(jb3);
    }

    public static void main(String[] args) {
        // 4. main 方法只负责启动，new 一下自己
        new test2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        String inputText = textField.getText();

        System.out.println("Action triggered. Input: " + inputText); // Debug info

        if (inputText.isEmpty()) {
            resultLabel.setText("内容不能为空！");
            resultLabel.setForeground(Color.RED);
        } else {
            resultLabel.setText("你输入的是: " + inputText);
            resultLabel.setForeground(Color.BLUE);
        }

        // 强制刷新一下界面，虽然通常不需要，但可以确保更新
        this.getContentPane().repaint();

        if (obj == jb1) {
            System.out.println("you pressed button 1");
        } else if (obj == jb2) {
            System.out.println("you pressed button 2");
        } else if (obj == jb3) {
            System.out.println("you pressed button 3");
        }

    }
}