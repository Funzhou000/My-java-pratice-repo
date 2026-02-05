package project.farmerandlord.src.com.itheima.domain;

import javax.swing.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Poker extends JLabel implements MouseListener {

    // 自己练习
    // 扑克牌正反面
    private boolean up;
    // 是否可以被点击
    private boolean canClick = false;
    // 是否被点击了
    private boolean clicked = false;
    // 牌的名字
    private String name;
    // 构造方法：区分正面反面调用相应的方法初始化图片的路径
    // 构造方法：设置牌的宽高大小，添加鼠标监听事件

    public Poker(String name, boolean up) {
        this.name = name;
        this.up = up;
        if (up) {
            this.setIcon(new ImageIcon("project/farmerandlord/image/poker/" + name + ".png"));
        } else {
            this.setIcon(new ImageIcon("project/farmerandlord/image/poker/rear.png"));
        }
        this.setSize(71, 96);
        this.addMouseListener(this);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // check if the poker can be clicked
        if (canClick) {

            // check if the poker is clicked
            if (!clicked) {
                this.setLocation(this.getX(), this.getY() - 20);
                // dosen't clicked raise the poker
                clicked = true;
            } else {
                // up move poker
                this.setLocation(this.getX(), this.getY() + 20);
                clicked = false;
            }
        }

    }

    public Poker() {
    }

    public Poker(boolean up, boolean canClick, boolean clicked, String name) {
        this.up = up;
        this.canClick = canClick;
        this.clicked = clicked;
        this.name = name;
    }

    public boolean isUp() {
        return this.up;
    }

    public boolean getUp() {
        return this.up;
    }

    public void setUp(boolean up) {
        this.up = up;
        if (this.up == false) {
            this.setIcon(new ImageIcon("project/farmerandlord/image/poker/rear.png"));
        } else {
            this.setIcon(new ImageIcon("project/farmerandlord/image/poker/" + this.name + ".png"));
        }
    }

    public boolean isCanClick() {
        return this.canClick;
    }

    public boolean getCanClick() {
        return this.canClick;
    }

    public void setCanClick(boolean canClick) {
        this.canClick = canClick;
    }

    public boolean isClicked() {
        return this.clicked;
    }

    public boolean getClicked() {
        return this.clicked;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Poker up(boolean up) {
        setUp(up);
        return this;
    }

    public Poker canClick(boolean canClick) {
        setCanClick(canClick);
        return this;
    }

    public Poker clicked(boolean clicked) {
        setClicked(clicked);
        return this;
    }

    public Poker name(String name) {
        setName(name);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                " up='" + isUp() + "'" +
                ", canClick='" + isCanClick() + "'" +
                ", clicked='" + isClicked() + "'" +
                ", name='" + getName() + "'" +
                "}";
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }
}
