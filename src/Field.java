import javax.swing.*;

public class Field {

    // In this class we define all the elements that are needed to construct the programm

    //Frame and Panel for the vase
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();

    //Here are all the text labels to show wicch info is required
    JLabel user = new JLabel("Username");
    JLabel email = new JLabel("Email");
    JLabel phone = new JLabel("Phone number");
    JLabel state = new JLabel("Country");
    JLabel city = new JLabel("City");
    JLabel street = new JLabel("Street");
    JLabel gender = new JLabel("Gender");
    JLabel password = new JLabel("Password");
    JLabel display = new JLabel();

    //Here are all the fields so that the user can input the info
    JTextField userText = new JTextField();
    JTextField emailText = new JTextField();
    JTextField phoneText = new JTextField();
    JTextField stateText = new JTextField();
    JTextField cityText = new JTextField();
    JTextField streetText = new JTextField();

    //so that the password is hiden we use password field and not textfield
    JPasswordField passwordField = new JPasswordField();

    //Here we create a drop down menu so that the user can choose gender
     String [] genderSelect = {"- Select -", "Male", "Female", "Other"};
     JComboBox genderText = new JComboBox<>(genderSelect);

     //Button for submiting info
    JButton submit = new JButton("Submit");
}
