package com.benialex.proiectfinal;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ScreenListaZoo {
    private JComboBox comboBoxInfo;
    private JTextArea textInfo;
    private JButton viziteazaZooButton;
    private JPanel panelMain;
    private JPanel panelTop;
    private JPanel panelInfo;
    private JPanel panelText;


    public static void main(String[] args) {
        ScreenZoo screen=new ScreenZoo();
        screen.setVisible(true);
    }
}
