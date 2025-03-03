package Registration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import static org.junit.jupiter.api.Assertions.*;

public class RegistrationTest {
    private Registration registration;
    @BeforeEach
    void setUp(){
        registration = new Registration();
    }
    @Test
    void testMainWindowDoesNotThrow(){
        assertDoesNotThrow(() ->registration.mainWindow());
    }

    @Test
    void testMainWindowInstanceOfJFrame(){
        JFrame frame =registration.mainWindow();
        assertInstanceOf(JFrame.class,frame);
    }
    @Test
    void testLoginInstanceOfJTabbedPane(){
        JTabbedPane tab = registration.login();
        assertInstanceOf(JTabbedPane.class,tab);
    }
    @Test
    void testContactListOfPanel(){
        JPanel contactListPanel = registration.contactList();
        assertInstanceOf(JPanel.class,contactListPanel);
    }
    @Test
    void testCreationFormInstanceOfJPanel(){
        JPanel creationFormPanel = registration.creationForm();
        assertInstanceOf(JPanel.class,creationFormPanel);
    }
    @Test
    void testContactDetailsInstanceOfPanel(){
        JPanel contactDetailsPanel =registration.contactDetails();
        assertInstanceOf(JPanel.class,contactDetailsPanel);
    }
    @Test
    void testEditFormInstanceOfJPanel(){
        JPanel editFormPanel = registration.editForm();
        assertInstanceOf(JPanel.class,editFormPanel);
    }
    @Test
    void testEditContactButtonAction(){
        JButton editButton = registration.EditButton();
        editButton.doClick();
        JTextField editField = registration.Editfield();
        assertNotNull(editField);

    }
    @Test
    void testAddNewContactButtonAction(){

        JButton addButton = registration.addNewContact();
        JTabbedPane tab =registration.login();
        addButton.doClick();


        assertEquals(1,tab.getSelectedIndex());
    }
    @Test
    void testBackToListButtonAction(){
        JButton backToListButton = registration.backToList();
        backToListButton.doClick();

        JTabbedPane tab = registration.login();
        assertEquals(0,tab.getSelectedIndex());
    }
    @Test
    void testCancelButtonAction(){
        JButton cancelEditButton = registration.cancelEdit();
        cancelEditButton.doClick();

        JTabbedPane tab =registration.login();
        JTextField editField = registration.Editfield();
        assertEquals("",editField.getText());
        assertEquals("",registration.Editfield2().getText());
        assertEquals("",registration.Editfield3().getText());

        assertEquals(0,tab.getSelectedIndex());

    }
    @Test
    void testSaveContactButtonAction(){
        JButton saveButton = registration.saveContact();
        registration.field().setText("Eddie");
        registration.field2().setText("email");
        registration.field3().setText("0778594231");

        saveButton.doClick();




        assertEquals("Eddie",registration.getContactsList().getFirst().getNames());
        assertEquals("email",registration.getContactsList().getFirst().getEmail());
        assertEquals("0778594231",registration.getContactsList().getFirst().getNumber());
    }
    @Test
    void testViewDetailsButtonAction(){

        JTabbedPane tab = registration.login();
        JButton viewButton = registration.viewDetailsButton();
        JButton saveButton = registration.saveContact();
        registration.field().setText("Eddie");
        registration.field2().setText("email");
        registration.field3().setText("0778594231");

        saveButton.doClick();



        registration.getContactListview().setSelectedIndex(0);
        viewButton.doClick();

        assertEquals(2,tab.getSelectedIndex());

    }
    @Test
    void testEditButtonAndConfirmEditButtonAction(){
        JButton confirmEditButton = registration.EditButton();
        JButton saveButton = registration.saveContact();
        JButton editButton = registration.EditContact();
        registration.field().setText("Eddie");
        registration.field2().setText("email");
        registration.field3().setText("0778594231");

        saveButton.doClick();

        registration.contactListview.setSelectedIndex(0);
        editButton.doClick();
        registration.Editfield().setText("James");
        registration.Editfield2().setText("new email");
        registration.Editfield3().setText("new number");
        confirmEditButton.doClick();

        assertEquals("James",registration.getContactsList().getFirst().getNames());
        assertNotEquals("email",registration.getContactsList().getFirst().getEmail());
        assertNotEquals("0778594231",registration.getContactsList().getFirst().getNumber());



    }
    @Test
    void testDeleteButtonAction(){
        JButton deleteButton = registration.delete();
        deleteButton.doClick();
        assertNotNull(deleteButton);
        JButton viewButton = registration.viewDetailsButton();
        JButton saveButton = registration.saveContact();
        registration.field().setText("Eddie");
        registration.field2().setText("email");
        registration.field3().setText("0778594231");

        saveButton.doClick();

        registration.contactListview.setSelectedIndex(0);
        viewButton.doClick();

        assertFalse(registration.getContactsList().isEmpty());
        deleteButton.doClick();
        assertTrue(registration.getContactsList().isEmpty());

    }
    @Test
    void testFieldText(){
        JTextField field = registration.field();
        field.setText("Test Name");
        assertEquals("Test Name",field.getText());
    }
    @Test
    void testField2Text(){
        JTextField field2 = registration.field();
        field2.setText("123456789");
        assertEquals("123456789",field2.getText());
    }
    @Test
    void testField3Text(){
        JTextField field3 = registration.field();
        field3.setText("test@gmail.com");
        assertEquals("test@gmail.com",field3.getText());
    }
    @Test
    void testEditFieldText(){
        JTextField editField = registration.Editfield();
        editField.setText("Edited Name");
        assertEquals("Edited Name",editField.getText());
    }
    @Test
    void testNameLabelText(){
        JLabel nameLabel = registration.name();
        assertEquals("Name:",nameLabel.getText());
    }
    @Test
    void testNumberLabelText(){
        JLabel numberLabel = registration.number();
        assertEquals("Contact:",numberLabel.getText());
    }
    @Test
    void testEmailLabelText(){
        JLabel emailLabel = registration.email();
        assertEquals("Email:",emailLabel.getText());
    }



}