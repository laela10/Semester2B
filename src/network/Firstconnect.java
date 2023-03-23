package network;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Firstconnect extends JFrame{
    private JPanel panelMain;
    private JButton ButtonSubmit;
    private JTextField textFieldMsg;
    private JTextField textFieldStatus;
    private JTextField textFieldComment;
    private JLabel lbWelcome;
    private JButton ButtonClose;

    public Firstconnect() {
        this.setContentPane(panelMain);
        this.setTitle("Welcome");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

        ButtonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Msg = textFieldMsg.getText();
                String Status = textFieldStatus.getText();
                String Comment = textFieldComment.getText();
                lbWelcome.setText("Welcome :" + Msg + Status + Comment);
            }
        });
        ButtonClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
    public static void main(String [] args){
        Firstconnect firstconnect = new Firstconnect();
        firstconnect.setVisible(true);
    }
}
