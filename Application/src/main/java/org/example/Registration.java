package org.example;

import javax.swing.*;
import java.awt.*;

public class Registration {
    private JFrame frame;
    private JTabbedPane loginTab ,infoTab,personalTab,settingsTab;
    public Registration(){mainWindow();};
    public JFrame mainWindow(){
        frame = new JFrame();
        frame.setTitle("REGISTER");
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setMinimumSize(new Dimension(400, 300));
        frame.pack();
        return frame;
    }
    public JTabbedPane login(){
        loginTab = new JTabbedPane();
    }
}
