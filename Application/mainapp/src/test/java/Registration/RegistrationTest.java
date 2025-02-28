package Registration;
import Users.Users;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
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
    void testDeleteButtonAction(){
        JButton deleteButton = registration.delete();
        deleteButton.doClick();
        assertNotNull(deleteButton);
    }
    @Test
    void testAddNewContactButtonAction(){
        JButton addButton = registration.addNewContact();
        addButton.doClick();

        JTabbedPane tab =registration.login();
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

        JTextField editField = registration.Editfield();
        assertEquals("",editField.getText());

    }
    @Test
    void testViewDetailsButtonAction(){
        JButton viewButton = registration.viewDetailsButton();
        viewButton.doClick();

        JTabbedPane tab =registration.login();
        assertEquals(2,tab.getSelectedIndex());
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
    @Test
    void testNameOutputLabel(){
        JLabel nameOutputLabel = registration.nameOutput();
        assertEquals("Output Name:",nameOutputLabel.getText());
    }
    @Test
    void testNumberOutputLabel(){
        JLabel numberOutputLabel = registration.numberOutput();
        assertEquals("Output Number",numberOutputLabel.getText());
    }
    @Test
    void testEmailOutputLabelText(){
        JLabel emailOutputLabelLabel = registration.emailOutput();
        assertEquals("Output Email",emailOutputLabelLabel.getText());
    }

}