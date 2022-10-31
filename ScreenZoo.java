package com.benialex.proiectfinal;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ScreenZoo extends JFrame{
    private JTextField textFieldTitlu;
    private JList listMamifere;
    private JList listPesti;
    private JList listPasari;
    private JTextField textNume;
    private JTextField textInaltime;
    private JTextField textKilograme;
    private JButton ADDButton;
    private JButton UPDATEButton;
    private JButton DELETEButton;
    private JButton AFISEAZAButton;
    private JPanel PanelMain;
    private JButton ADDPEButton;
    private JButton ADDPAButton;
    private ArrayList<Mamifer> mamifere;
    private DefaultListModel lmamifere;
    private ArrayList<Pesti> pesti;
    private DefaultListModel lpesti;
    private ArrayList<Pasari> pasari;
    private DefaultListModel lpasari;
    public StringBuffer mesajeroare1=new StringBuffer();
    public StringBuffer mesajeroare2=new StringBuffer();
    public StringBuffer mesajeroare3=new StringBuffer();

    public ScreenZoo() {
        super("Proiect 3");
        this.setContentPane(this.PanelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        mamifere=new ArrayList<Mamifer>();
        lmamifere=new DefaultListModel();
        listMamifere.setModel(lmamifere);
        pesti=new ArrayList<Pesti>();
        lpesti=new DefaultListModel();
        listPesti.setModel(lpesti);
        pasari=new ArrayList<Pasari>();
        lpasari=new DefaultListModel();
        listPasari.setModel(lpasari);

        mesajeroare1.append("Eroare, nu ati selectat niciun mamifer");
        mesajeroare2.append("Eroare, nu ati selectat niciun peste");
        mesajeroare3.append("Eroare, nu ati selectat nicio pasare");

        listMamifere.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
        });
        listPesti.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
        });
        listPasari.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
        });

        ADDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Magazin m=new Magazin(
                        Integer.parseInt(textcod.getText()),
                        textoras.getText(),
                        Double.parseDouble(textsuprafata.getText())
                );
                magazin.add(m);
                refreshMagazineList();
                System.out.println("noul magazin a fost adaugat");
                clearField();

            }
        });
        UPDATEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int mamiferenumar= listMamifere.getSelectedIndex();
                int pestinumar= listPesti.getSelectedIndex();
                int pasarinumar= listPasari.getSelectedIndex();
                if(mamiferenumar>=0){
                    Mamifer m=mamifere.get(mamifernumar);
                    m.setNume(textNume.getText());
                    m.setInaltime(Integer.parseInt(textInaltime.getText()));
                    m.setKilograme(Integer.parseInt(textKilograme.getText()));
                    refreshMamifereList();
                    System.out.println("Update-ul s-a facut cu succes");
                }
                else if(pestinumar>=0){
                    Pesti p=pesti.get(pestinumar);
                    p.setNume(textNume.getText());
                    p.setInaltime(Integer.parseInt(textInaltime.getText()));
                    p.setKilograme(Integer.parseInt(textKilograme.getText()));
                    refreshPestiList();
                    System.out.println("Update-ul s-a facut cu succes");
                }
                else if(pasarinumar>=0){
                    Pasari p=pasari.get(pasarinumar);
                    p.setNume(textNume.getText());
                    p.setInaltime(Integer.parseInt(textInaltime.getText()));
                    p.setKilograme(Integer.parseInt(textKilograme.getText()));
                    refreshPasariList();
                    System.out.println("Update-ul s-a facut cu succes");
                }
                else{
                    JOptionPane.showMessageDialog(PanelMain,mesajeroare1);
                }
                clearField();


            }
        });

        DELETEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int mamiferenumar= listMamifere.getSelectedIndex();
                int pestinumar= listPesti.getSelectedIndex();
                int pasarinumar= listPasari.getSelectedIndex();
                if(mamiferenumar>=0) {
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    int dialogResult = JOptionPane.showConfirmDialog(listMamifere, "Sterde", "Delete", dialogButton);
                    if (dialogResult == 0) {
                        lmamifere.remove(mamiferenumar);
                        mamifere.remove(mamiferenumar);
                    }
                    System.out.println("Stergerea s-a facut cu succes");
                }
                else if(pestinumar>=0) {
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    int dialogResult = JOptionPane.showConfirmDialog(listMamifere, "Sterde", "Delete", dialogButton);
                    if (dialogResult == 0) {
                        lpesti.remove(pestinumar);
                        pesti.remove(pestinumar);
                    }
                    System.out.println("Stergerea s-a facut cu succes");
                }
                else if(pasarinumar>=0) {
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    int dialogResult = JOptionPane.showConfirmDialog(listMamifere, "Sterde", "Delete", dialogButton);
                    if (dialogResult == 0) {
                        lpasari.remove(pasarinumar);
                        pasari.remove(pasarinumar);
                    }
                    System.out.println("Stergerea s-a facut cu succes");
                }
                else{
                    JOptionPane.showMessageDialog(PanelMain,"Eroare, nu ati selectat niciun camp");
                }
                clearField();

            }
        });

        AFISEAZAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int mamiferenumar= listMamifere.getSelectedIndex();
                int pestinumar= listPesti.getSelectedIndex();
                int pasarinumar= listPasari.getSelectedIndex();
                if(mamiferenumar>=0) {
                    JOptionPane.showMessageDialog(PanelMain,mamifere.get(mamiferenumar).toString());
                    System.out.println("Afisarea s-a facut cu succes");
                }
                else if(pestinumar>=0) {
                        JOptionPane.showMessageDialog(PanelMain,pesti.get(pestinumar).toString());
                        System.out.println("Afisarea s-a facut cu succes");
                }
                else if(pasarinumar>=0) {
                        JOptionPane.showMessageDialog(PanelMain,pasari.get(pasarinumar).toString());
                        System.out.println("Afisarea s-a facut cu succes");
                    }
                else{
                    JOptionPane.showMessageDialog(PanelMain,"Eroare, nu ati selectat niciun camp");
                }
                clearField();

            }
        });
        ADDPEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        ADDPAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }
    private void clearField(){
        textNume.requestFocus();
        textNume.setText("");
        textInaltime.setText(Integer.toString(0));
        textKilograme.setText(Integer.toString(0));
    }
    public void refreshMamifereList(){
        lmamifere.removeAllElements();
        for(Mamifer m:mamifere){
            lmamifere.addElement(m.getNume());
        }
    }
    public void refreshPestiList(){
        lpesti.removeAllElements();
        for(Peste p:pesti){
            lpesti.addElement(p.getNume());
        }
    }
    public void refreshPasariList(){
        lpasari.removeAllElements();
        for(Pasari p:pasari){
            lpasari.addElement(p.getNume());
        }
    }
    public void addMamifer(Mamifer m){
        mamifere.add(m);
        refreshMamifereList();
    }
    public void addPesti(Pesti p){
        pesti.add(p);
        refreshPestiList();
    }
    public void addPasari(Pasari p){
        pasari.add(p);
        refreshPasariList();
    }

    public static void main(String[] args) {
        ScreenZoo screen=new ScreenZoo();
        screen.setVisible(true);
    }

}
