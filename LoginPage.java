import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIdField = new JFormattedTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel idlabel = new JLabel("userID: ");
    JLabel jlabelpassword = new JLabel("Password: ");
    JLabel messagelabel = new JLabel();
    HashMap<String,String>logininfo = new HashMap<>();
    LoginPage(HashMap<String,String>loginInfoOriginal ){
        logininfo = loginInfoOriginal;
        idlabel.setBounds(50,100,175,25);
        jlabelpassword.setBounds(50,150,175,25);

        frame.add(idlabel);
        frame.add(jlabelpassword);
        messagelabel.setBounds(130,250,350,35);
        messagelabel.setFont(new Font(null,Font.ITALIC,25));

        userIdField.setBounds(125,100,200,25);
        frame.add(userIdField);

        passwordField.setBounds(125,150,200,25);
        frame.add(passwordField);

        // for login Buttons
        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        // For ResetBuutton
        resetButton.setBounds(225,200,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(messagelabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource()==resetButton){
            userIdField.setText("");
            passwordField.setText("");
        }
        if(actionEvent.getSource()==loginButton){
            String userId = userIdField.getText();
            String password = String.valueOf(passwordField.getPassword());

            if(logininfo.containsKey(userId)){
                if(logininfo.get(userId).equals(password)){
                    messagelabel.setForeground(new Color(24,45,67));
                    messagelabel.setText("Login Successful");
                    welcomePage welcomePage = new welcomePage();
                }
                else {
                    messagelabel.setForeground(Color.red);
                    messagelabel.setText("Wrong Password");
                }

            }
            else {
                     messagelabel.setForeground(Color.red);
                     messagelabel.setText("WrongID");
            }
        }

    }
}
