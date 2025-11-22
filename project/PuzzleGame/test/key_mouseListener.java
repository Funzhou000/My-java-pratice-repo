package project.PuzzleGame.test;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class key_mouseListener extends JFrame implements KeyListener, MouseListener {
    JButton jb = new JButton("push there");

    public static void main(String[] args) {
        new key_mouseListener();
    }

    public key_mouseListener() {
        this.setSize(500, 500);
        this.setTitle("Key and Mouse Listener Test");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);
        jb.setBounds(0, 0, 100, 50); // 稍微改大点不然看不见字

        // 添加键盘监听器
        this.addKeyListener(this);
        // 添加鼠标监听器
        jb.addMouseListener(this);
        this.add(jb);
        this.setVisible(true);
    }

    /**
     * 按下某个键时调用此方法
     * 
     * @param e 键盘事件
     */
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("you pressed key:" + e.getKeyChar());

    }

    /**
     * 释放某个键时调用此方法
     * 
     * @param e 键盘事件
     */
    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("you released key:");

    }

    /**
     * 键入某个键时调用此方法
     * 
     * @param e 键盘事件
     */
    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * 鼠标点击（按下并释放）时调用此方法
     * 
     * @param e 鼠标事件
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("you clicked mouse at position: (" + e.getX() + ", " + e.getY() + ")");

    }

    /**
     * 鼠标进入组件区域时调用此方法
     * 
     * @param e 鼠标事件
     */
    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouse entered at position: (" + e.getX() + ", " + e.getY() + ")");

    }

    /**
     * 鼠标离开组件区域时调用此方法
     * 
     * @param e 鼠标事件
     */
    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("mouse exited at position: (" + e.getX() + ", " + e.getY() + ")");

    }

    /**
     * 鼠标按下时调用此方法
     * 
     * @param e 鼠标事件
     */
    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("mouse pressed at position: (" + e.getX() + ", " + e.getY() + ")");

    }

    /**
     * 鼠标释放时调用此方法
     * 
     * @param e 鼠标事件
     */
    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouse released at position: (" + e.getX() + ", " + e.getY() + ")");

    }

}
