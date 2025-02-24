package Registration;

import javax.swing.*;
import java.awt.*;
import


public class Registration {
    private JFrame frame;
    private JPanel westPanel,northPanel,southPanel,right;
    private JTabbedPane Tab ;
    public Registration(){mainWindow();};
    public JFrame mainWindow(){
        frame = new JFrame();
        frame.setTitle("REGISTER");
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(BorderLayout.NORTH,this.north());
        frame.add(BorderLayout.SOUTH,this.south());
        frame.add(BorderLayout.EAST,this.nullPanel());
        frame.add(BorderLayout.WEST,this.west());
        frame.add(BorderLayout.CENTER,this.login());
        frame.setMinimumSize(new Dimension(400, 300));
        frame.pack();
        return frame;
    }
    public JTabbedPane login(){
        Tab = new JTabbedPane();
        Tab.setPreferredSize(new Dimension(400,400));
        Tab.setVisible(true);
        Tab.addTab(this.profile(),"Profile");

        return Tab;
    }
    public JPanel north()
    {
        northPanel= new JPanel();
        northPanel.setPreferredSize(new Dimension(100,250));
        return northPanel;
    }
    public JPanel south()
    {
        southPanel= new JPanel();
        southPanel.setPreferredSize(new Dimension(100,200));
        return southPanel;
    }

    public JPanel west()
    {
        westPanel= new JPanel();
        westPanel.setPreferredSize(new Dimension(250,100));

        return westPanel;
    }
    public JPanel nullPanel()
    {
        right=new JPanel();
        right.setPreferredSize(new Dimension(200,100));
        return right;
    }
}
