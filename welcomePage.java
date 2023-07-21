import javax.swing.*;
import java.awt.*;

public class welcomePage {
    JFrame jFrame = new JFrame();
    JLabel jLabel = new JLabel("Welcome To Your Dark Side...");


    welcomePage(){
        jLabel.setBounds(0,0,525,25);
        jLabel.setFont(new Font(null,Font.PLAIN,25));
        jLabel.setForeground(Color.BLUE);

        jFrame.add(jLabel);
        jFrame.setSize(420,420);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

    }


}
