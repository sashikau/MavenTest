package com.sashika.app;

import com.sashika.app.controller.MainWindow;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {

        SwingUtilities.invokeLater(() -> new MainWindow());
    }
}
