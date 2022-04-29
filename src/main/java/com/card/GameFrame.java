package com.card;

import com.card.scene.LevelOnePanel;
import com.card.test.p1;
import com.card.test.p2;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    JPanel rootPanel;
    JPanel p1;

    public static void main(String[] args) {
        GameFrame gameFrame = new GameFrame();
    }

    public GameFrame() throws HeadlessException {
        //JFrame settings
        this.setSize(900,500);
        this.setTitle("Game");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        // rootPanel settings
        rootPanel =(JPanel) this.getContentPane();
        CardLayout cardLayout = new CardLayout();
        rootPanel.setLayout(cardLayout);
        p1 = new LevelOnePanel();
        rootPanel.add(p1,"p1");
        cardLayout.show(rootPanel,"p1");
        this.setVisible(true);
    }
}
