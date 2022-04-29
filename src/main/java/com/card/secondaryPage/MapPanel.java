package com.card.secondaryPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MapPanel extends JPanel implements  ActionListener {
    Image ImageBuffer = null;
    Graphics doubleBuffImg;
    Image bgImg1 = new ImageIcon("src/main/java/com/card/img/country1.png").getImage();
    Image walkIcon  = new ImageIcon("src/main/java/com/card/img/Rwalk.gif").getImage();
    Timer timer = new javax.swing.Timer(100,this);
    int peopleX = 100;
    int peopleY = 300;
    int peopleWidth = 49;
    int peopleHeight = 84;
    JLabel j = new JLabel(new ImageIcon(walkIcon));

    public MapPanel() {
        this.setLayout(null);
        this.add(j);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //        if(ImageBuffer == null){
//            ImageBuffer = createImage(900,800);
//        }
//
//        doubleBuffImg = ImageBuffer.getGraphics();
//        super.paint(doubleBuffImg);

        g.drawImage(bgImg1, 0, 0, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        j.setBounds(peopleX,peopleY,peopleWidth,peopleHeight);
        repaint();
    }
}

