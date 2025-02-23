package org.example;

import javax.swing.*;
import java.awt.*;

public class Profile {
    private JPanel viewPanel;
    private JLabel label1,label2,label3,labelOutput1,labelOutput2,labelOutput3;
    public JPanel profile()
    {
        viewPanel = new JPanel();
        viewPanel.setPreferredSize(new Dimension(100,100));
        GridLayout gridLayout = new GridLayout(4,2);
        gridLayout.setHgap(20);
        gridLayout.setVgap(20);
        viewPanel.setLayout(gridLayout);
        viewPanel.add(this.name());
        viewPanel.add(this.nameOutput());
        viewPanel.add(this.number());
        viewPanel.add(this.numberOutput());
        viewPanel.add(this.email());
        viewPanel.add(this.emailOutput());
        viewPanel.add(this.delete());
        viewPanel.add(this.backToList());
        viewPanel.isVisible();
        return viewPanel;
    }

    //method for the Name label in the formCard
    public JLabel name(){
        label2 =new JLabel("Name:");
        label2.setFont(new Font("Verdana", Font.BOLD, 16));
        label2.setBorder(BorderFactory.createEmptyBorder(0,10,0,0));

        return label2;
    }
    //method for the Number label in the formCard
    public JLabel number(){
        label1 =new JLabel("Contact:");
        label1.setFont(new Font("Verdana", Font.BOLD, 16));
        label1.setBorder(BorderFactory.createEmptyBorder(0,10,0,0));

        return label1;
    }
    //method for the email label in the formCard
    public JLabel email(){
        label3 =new JLabel("Email:");
        label3.setFont(new Font("Verdana", Font.BOLD, 16));
        label3.setBorder(BorderFactory.createEmptyBorder(0,10,0,0));

        return label3;
    }

    //displays the name detail for the selected contact
    public JLabel nameOutput()
    {
        labelOutput1 =new JLabel();
        labelOutput1.setFont(new Font("Verdana", Font.BOLD, 14));
        labelOutput1.setBorder(BorderFactory.createEmptyBorder(0,10,0,0));

        return labelOutput1;
    }
    //displays the number detail for the selected contact
    public JLabel numberOutput(){
        labelOutput2 =new JLabel();
        labelOutput2.setFont(new Font("Verdana", Font.BOLD, 14));
        labelOutput2.setBorder(BorderFactory.createEmptyBorder(0,10,0,0));

        return labelOutput2;
    }
    //desplays the email detail for the selected contact
    public JLabel emailOutput(){
        labelOutput3 =new JLabel();
        labelOutput3.setFont(new Font("Verdana", Font.BOLD, 14));
        labelOutput3.setBorder(BorderFactory.createEmptyBorder(0,10,0,0));
        return labelOutput3;
    }

}
