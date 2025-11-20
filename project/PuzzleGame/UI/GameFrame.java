package project.PuzzleGame.UI;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

    public GameFrame() {

        setSize(603, 680);
        setTitle("拼图单机版 v1.0");
        setAlwaysOnTop(true);
        // set location in middle of screen
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setVisible(true);
    }
}
