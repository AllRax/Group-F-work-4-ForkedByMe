package org.example;

import javax.swing.*;
import java.awt.*;

public class Registration {
    private JFrame frame;
    private JTabbedPane Tab ;
    public Registration(){mainWindow();};
    public JFrame mainWindow(){
        frame = new JFrame();
        frame.setTitle("REGISTER");
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(BorderLayout.CENTER,this.login());
        frame.setMinimumSize(new Dimension(400, 300));
        frame.pack();
        return frame;
    }
    public JTabbedPane login(){
        Tab = new JTabbedPane();
        Tab.setPreferredSize(new Dimension(400,400));
        Tab.setVisible(true);

        return Tab;
    }
}
