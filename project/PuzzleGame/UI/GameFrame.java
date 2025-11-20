package project.PuzzleGame.UI;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GameFrame extends JFrame {

    public GameFrame() {

        initalizeLogin();
        setBar();
        setVisible(true);
    }

    private void setBar() {
        JMenuBar jMenuBar = new JMenuBar();
        JMenu functionJMenu = new JMenu("Function");
        JMenu aboutJMenu = new JMenu("About us");
        JMenuItem replayItem = new JMenuItem("replay");
        JMenuItem reLoginItem = new JMenuItem("relogin");
        JMenuItem closeItem = new JMenuItem("close");

        JMenuItem accountIrem = new JMenuItem("account");
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        aboutJMenu.add(accountIrem);
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);
        setJMenuBar(jMenuBar);
    }

    private void initalizeLogin() {
        setSize(603, 680);
        setTitle("拼图单机版 v1.0");
        setAlwaysOnTop(true);
        // set location in middle of screen
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
    }
}
