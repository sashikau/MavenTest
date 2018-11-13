package com.sashika.app.view.medicalrecord;

import javax.swing.*;
import java.awt.*;

public class UnitPanel extends JPanel {

    private JLabel unitLabel;
    private  JComboBox<String> units;

    public UnitPanel() {

        unitLabel = new JLabel("Unit:");
        units = new JComboBox<>();

        GridBagLayout gridbag = new GridBagLayout();
        setLayout(gridbag);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        units.addItem("Unit1");
        units.addItem("Unit2");
        units.addItem("Unit3");

        gridBagConstraints.weightx = 05;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridbag.setConstraints(unitLabel, gridBagConstraints);
        add(unitLabel);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridbag.setConstraints(units, gridBagConstraints);
        add(units);
    }
}
