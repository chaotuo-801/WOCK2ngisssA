package com.card.secondaryPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class StatePanel extends JPanel {
    Image headIcon  = new ImageIcon("src/main/java/com/card/img/head.png").getImage();


    public StatePanel() {
        this.setBackground(Color.GRAY);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(headIcon,0,0, null);
        g.setColor(Color.RED);
        g.drawRect(80,20,200,20);
        g.setColor(Color.pink);
        g.fillRect(81,21,199,19);
        g.setColor(Color.WHITE);
        g.drawString("HP",100,35);

        g.setColor(Color.BLACK);
        g.drawRect(80,50,200,20);
        g.setColor(Color.darkGray);
        g.fillRect(81,51,199,19);
        g.setColor(Color.WHITE);
        g.drawString("SAN",100,65);

    }
}
