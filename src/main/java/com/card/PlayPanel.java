package com.card;

import com.card.secondaryPage.MapPanel;
import com.card.secondaryPage.StatePanel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;

public class PlayPanel extends JPanel {


    public PlayPanel() {
        this.setLayout(null);
        MapPanel mapPanel = new MapPanel();
        StatePanel statePanel = new StatePanel();
        this.add(mapPanel);
        this.add(statePanel);
        this.getComponent(0).setFocusable(true);
        mapPanel.setLocation(0,0);
        mapPanel.setSize(900,384);
        statePanel.setLocation(0,384);
        statePanel.setSize(900,116);

    }


}
