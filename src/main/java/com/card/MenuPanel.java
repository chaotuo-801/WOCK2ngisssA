package com.card;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MenuPanel extends JPanel {

    private final JButton play;
    private final JButton help;
    private final JButton quit;
    private int sign = 0;

    public JButton getPlay() {
        return play;
    }

    public JButton getHelp() {
        return help;
    }

    public JButton getQuit() {
        return quit;
    }

    public MenuPanel() {
        //Menu Panel settings
        Box MenuBox = Box.createVerticalBox();
        play = new JButton("PLAY");
        help = new JButton("HELP");
        quit = new JButton("QUIT");
        Font font = new Font("arial",Font.PLAIN,30);
        play.setFont(font);
        help.setFont(font);
        quit.setFont(font);
        play.setBackground(Color.GRAY);
        help.setBackground(Color.GRAY);
        quit.setBackground(Color.GRAY);

        MenuBox.add(Box.createVerticalStrut(200));
        MenuBox.add(play);
        MenuBox.add(Box.createVerticalStrut(50));
        MenuBox.add(help);
        MenuBox.add(Box.createVerticalStrut(50));
        MenuBox.add(quit);
        MenuBox.add(Box.createVerticalGlue());
        MenuBox.setOpaque(false);
        this.add(MenuBox);

        // set buttons action
        play.addActionListener(e -> {
            if(e.getSource() == play){
                sign = 1;
            }
        });

        help.addActionListener(e -> {
            if(e.getSource() == help){
                JOptionPane.showMessageDialog(this,"Write some information!");
            }
        });

        quit.addActionListener(e -> {
            if(e.getSource() == quit){
                System.exit(0);
            }
        });
    }

    // draw background Img
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon bgmImg = new ImageIcon("src/main/java/com/card/img/MenuImg.jpg");
        g.drawImage(bgmImg.getImage(),0,0,null);

    }

    public int getSign() {
        return sign;
    }

    public void setSign(int sign) {
        this.sign = sign;
    }
}
