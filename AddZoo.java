package com.benialex.proiectfinal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddZoo extends JFrame{
    private JPanel panelAddZoo;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton SALVEAZAButton;
    Zoo z;

    public AddZoo() {
        super("Proiect 3");
        this.setContentPane(this.panelAddZoo);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        SALVEAZAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 z= Zoo.getInstance(
                        textField1.getText(),
                        textField2.getText(),
                        Integer.parseInt(textField3.getText()),
                        Integer.parseInt(textField4.getText())
                );
                System.out.println(z.getNume());
                ScreenListaZoo screen=new ScreenListaZoo();
                screen.setVisible(true);
                dispose();
            }
        });
    }
    public static void main(String[] args) {
        AddZoo screen1=new AddZoo();
        screen1.setVisible(true);

    }
}
