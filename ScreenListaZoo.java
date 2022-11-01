package com.benialex.proiectfinal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScreenListaZoo extends JFrame{
    private JComboBox comboBoxInfo;
    private JTextArea textInfo;
    private JButton viziteazaZooButton;
    private JPanel panelMain;
    private JPanel panelTop;
    private JPanel panelInfo;
    private JPanel panelText;
    private JButton AFISEAZAButton;
    private JTextField textTitlu;
    private JButton AFISEAZATOATEINFORMATIILEButton;
    private DefaultComboBoxModel zooBox;


    public ScreenListaZoo() {
        super("Proiect 3");
        this.setContentPane(this.panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        zooBox = new DefaultComboBoxModel();
        comboBoxInfo.setModel(zooBox);
        zooBox.addElement("");
        zooBox.addElement("nume");
        zooBox.addElement("oras");
        zooBox.addElement("numar angajati");
        zooBox.addElement("capacitate maxima de gazduire animale");
        zooBox.addElement("numar de animale existente");
        Zoo z=Zoo.getInstance("a","b",2,2);
        textTitlu.setText(z.getNume());



        AFISEAZAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=zooBox.getSelectedItem().toString();
                if(text=="nume"){textInfo.setText(z.getNume());}
                if(text=="oras"){textInfo.setText(z.getOras());}
                if(text=="numar angajati"){textInfo.setText(Integer.toString(z.getNrangajati()));}
                if(text=="capacitate maxima de gazduire animale"){textInfo.setText(Integer.toString(z.getCapacitate_gazduire()));}
                if(text=="numar de animale existente"){textInfo.setText(Integer.toString(z.getNr_vietati()));}
            }
        });
        AFISEAZATOATEINFORMATIILEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panelMain,z.toString());
                System.out.println("Afisarea s-a facut cu succes");
            }
        });
        viziteazaZooButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScreenZoo screen1=new ScreenZoo();
                screen1.setVisible(true);
                dispose();
            }
        });
    }
    public static void main(String[] args) {
        ScreenListaZoo screen=new ScreenListaZoo();
        screen.setVisible(true);
    }
}
