package Register;

import javax.swing.*;
import java.awt.*;

public class Register {
    private JPanel registerPanel;
    private JLabel label1,label2,label3;
    private JTextField field,field2,field3;
    private JButton saveButton,cancelButton;


    public JPanel register(){
        registerPanel = new JPanel();

        registerPanel.setPreferredSize(new Dimension(100,100));
        GridLayout gridLayout = new GridLayout(4,2);
        gridLayout.setHgap(10);
        gridLayout.setVgap(10);
        registerPanel.setLayout(gridLayout);

        registerPanel.add(this.name());
        registerPanel.add(this.field());
        registerPanel.add(this.number());
        registerPanel.add(this.field2());
        registerPanel.add(this.email());
        registerPanel.add(this.field3());
        registerPanel.add(this.cancel());
        registerPanel.add(this.saveContact());
        return registerPanel;
    }
    //text field of the Name in the formCreation Card
    public JTextField field(){
        field=new JTextField();
        return field;
    }
    //text field of the number in the formCreation Card
    public JTextField field2()
    {
        field2=new JTextField();
        return field2;
    }

    //text field of the email in the formCreation Card
    public JTextField field3(){
        field3=new JTextField();
        //text3=field3.getText();
        return field3;
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
    public JButton saveContact(){
        saveButton=new JButton("Save Contact");
        saveButton.setBackground(new Color(60,179,113));
        saveButton.setForeground(Color.white);
        saveButton.setFocusPainted(false);
        saveButton.setPreferredSize(new Dimension(100,50));

        saveButton.addActionListener(e->{
            String name = field.getText();
            String number = field2.getText();
            String email = field3.getText();
            if (!name.isBlank() && !number.isBlank() && !email.isBlank())
            {
                ContactsList newContact = new ContactsList(name, number, email);
                contactsList.add(newContact);
                contactLisstModel.addElement(name);
                field.setText("");
                field2.setText("");
                field3.setText("");

                cardLayout.show(centerPanel, "contactList");}
        });
        return saveButton;
    }
    public JButton cancel(){
        cancelButton=new JButton("Cancel");
        cancelButton.setBackground(new Color(140,17,11));
        cancelButton.setForeground(Color.white);
        cancelButton.setFocusPainted(false);
        cancelButton.setPreferredSize(new Dimension(100,50));
        cancelButton.addActionListener(e->{
            field.setText("");
            field2.setText("");
            field3.setText("");
            cardLayout.show(centerPanel, "contactList");
        });
        return cancelButton;
    }
}
