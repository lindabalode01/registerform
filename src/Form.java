import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// this class will inharit all values of the Fields class
 public class Form extends Field{

     //In this method we build the form
    public void registerForm () {

        //Define frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBounds(400, 400, 450, 450);
        frame.setTitle("Registration form");

        //Adding pannel to the frame and define it
        frame.add(panel);

        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);

        //Adding elements to panel on by one and defining them
        panel.add(user);
        panel.add(userText);

        user.setBounds(10, 10, 150, 30);
        userText.setBounds(170, 15, 120, 20);

        panel.add(email);
        panel.add(emailText);

        email.setBounds(10, 45, 150, 30);
        emailText.setBounds(170, 50, 120, 20);

        panel.add(phone);
        panel.add(phoneText);

        phone.setBounds(10, 80, 150, 30);
        phoneText.setBounds(170, 85, 120, 20);

        panel.add(state);
        panel.add(stateText);

        state.setBounds(10, 110, 150, 30);
        stateText.setBounds(170, 115, 120, 20);

        panel.add(city);
        panel.add(cityText);

        city.setBounds(10, 140, 150, 30);
        cityText.setBounds(170, 145, 120, 20);

        panel.add(street);
        panel.add(streetText);

        street.setBounds(10, 170, 150, 30);
        streetText.setBounds(170, 175, 120, 20);

        panel.add(gender);
        panel.add(genderText);

        gender.setBounds(10, 200, 150, 30);
        genderText.setBounds(170, 205, 120, 20);

        panel.add(password);
        panel.add(passwordField);

        password.setBounds(10, 230, 150, 30);
        passwordField.setBounds(170, 235, 120, 20);

        panel.add(submit);

        submit.setBounds(150, 270, 150, 45);
        submit.setFocusable(false);
        submit.setBackground(Color.GREEN);

        //adding function to the button so that when it is clicked all the inputed info is displayed in a label bellow the button
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.add(display);
                display.setBounds(10, 300, 400,130);
                display.setText("Your info " + userText.getText() + ", " + emailText.getText() + ", " + phoneText.getText() + ", " + stateText.getText() + ", " + cityText.getText() + ", " + streetText.getText() + ", " + genderText.getSelectedItem());
            }
        });

    }

}
