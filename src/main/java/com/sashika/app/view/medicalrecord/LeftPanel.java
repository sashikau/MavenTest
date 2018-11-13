package com.sashika.app.view.medicalrecord;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LeftPanel extends JPanel {

private UnitPanel unitPanel;
private JTextArea jTextArea;

    public LeftPanel() {

        unitPanel = new UnitPanel();
        jTextArea = new JTextArea();

        GridBagLayout myBagLayout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        this.setLayout(myBagLayout);
        c.fill = GridBagConstraints.HORIZONTAL;

        c.weightx = 0.1;
        c.gridx = 0;
        c.gridy = 0;
        myBagLayout.setConstraints(unitPanel, c);
        Border border = BorderFactory.createLoweredBevelBorder();
        unitPanel.setBorder(border);
        this.add(unitPanel);

        c.weightx = 10;
        c.gridx = 0;
        c.gridy = 1;
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        myBagLayout.setConstraints(jScrollPane, c);
        this.add(jScrollPane);

    }
}
