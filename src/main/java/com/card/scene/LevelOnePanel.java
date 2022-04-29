package com.card.scene;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class LevelOnePanel extends JPanel implements ActionListener, KeyListener {
    Image bgImg1 = new ImageIcon("src/main/java/com/card/img/country1.png").getImage();
    Image walkIcon  = new ImageIcon("src/main/java/com/card/img/Rwalk.gif").getImage();
    Image headIcon  = new ImageIcon("src/main/java/com/card/img/head.png").getImage();

    Timer timer = new javax.swing.Timer(100,this);
    int peopleX = 100;
    int peopleY = 300;
    int peopleWidth = 49;
    int peopleHeight = 84;
    JLabel j = new JLabel(new ImageIcon(walkIcon));

    public LevelOnePanel() {
        this.setLayout(null);
        this.setBackground(Color.GRAY);
        this.add(j);
        this.setFocusable(true);
        addKeyListener(this);
        timer.start();
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(bgImg1, 0, 0, null);
        g.drawImage(headIcon,0,386, null);
        g.setColor(Color.RED);
        g.drawRect(80,404,200,20);
        g.setColor(Color.pink);
        g.fillRect(81,405,199,19);
        g.setColor(Color.WHITE);
        g.drawString("HP",100,419);

        g.setColor(Color.BLACK);
        g.drawRect(80,434,200,20);
        g.setColor(Color.darkGray);
        g.fillRect(81,435,199,19);
        g.setColor(Color.WHITE);
        g.drawString("SAN",100,449);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        j.setBounds(peopleX,peopleY,peopleWidth,peopleHeight);
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_D){
            peopleX = peopleX + 10;
        }
        if(e.getKeyCode()==KeyEvent.VK_A){
            peopleX = peopleX - 10;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
