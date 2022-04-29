package com.card;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;


public class CardMenu extends JFrame  {

    JPanel rootPanel;
    MenuPanel p1;
    PlayPanel p2;

    public static void main(String[] args) {

        CardMenu cardMenu = new CardMenu();
    }

    public CardMenu() {
        //JFrame settings
        this.setSize(900,500);
        this.setTitle("Card");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Timer timer = new Timer();
        // rootPanel settings
        rootPanel = new JPanel();
        CardLayout cardLayout = new CardLayout();
        rootPanel.setLayout(cardLayout);
        this.add(rootPanel);
        p1 = new MenuPanel();
        rootPanel.add(p1,"p1");
        p2 = new PlayPanel();
        rootPanel.add(p2,"p2");
        cardLayout.show(rootPanel,"p1");
        this.setVisible(true);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(p1.getSign() == 1){
                    cardLayout.show(rootPanel,"p2");
                    p1.setSign(0);
                    timer.cancel();
                }
            }
        },100,100);
    }
}
