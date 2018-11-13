package com.sashika.app.controller;

import com.sashika.app.view.medicalrecord.LeftPanel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MainWindow extends JFrame {

    LeftPanel leftPanel;
    JPanel rightPanel;

    public MainWindow() {

        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        this.setLayout(gridbag);
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;

        leftPanel = new LeftPanel();
        Border eBorder = BorderFactory.createEtchedBorder();

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.anchor = GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 30;
        gridBagConstraints.weighty = 100;
        add(leftPanel, gridBagConstraints);

        JPanel panel3 = new JPanel();
        panel3.setBorder(BorderFactory.createTitledBorder(eBorder, "20pct"));
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = /*gridBagConstraints.weighty = */ 70;
        gridBagConstraints.insets = new Insets(2, 2, 2, 2);
        add(panel3, gridBagConstraints); //

        setSize(1000, 600);
        setVisible(true);
        //setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
