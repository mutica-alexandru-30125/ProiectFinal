package com.benialex.proiectfinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    public String U,P;
    private JPanel panel1;
    private JTextField txtUser;
    private JTextField txtPass;
    private JButton LOGAREButton;

    public Login(){
        super("Proiect 3");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        U = "abcd";
        P = "0000";
        LOGAREButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a=txtUser.getText();
                if((U.equals(a))&&(P.equals(txtPass.getText()))){
                    System.out.println("Bun!");
                    AddZoo screen=new AddZoo();
                    screen.setVisible(true);
                    dispose();
                }
                else{
                    System.out.println("Gresit!");
                }
            }
        });
    }

    public static void main(String[] args) {
        Login screen=new Login();
        screen.setVisible(true);
    }
}

