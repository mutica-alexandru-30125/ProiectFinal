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
    private JButton ADDMButton;
    private JButton UPDATEButton;
    private JButton DELETEButton;
    private JButton AFISEAZAButton;
    private JPanel PanelMain;
    private JButton ADDPEButton;
    private JButton ADDPAButton;
    private ArrayList<Mamifer> mamifere;
    private DefaultListModel lmamifere;
    private ArrayList<Peste> pesti;
    private DefaultListModel lpesti;
    private ArrayList<Pasare> pasari;
    private DefaultListModel lpasari;
    public StringBuffer mesajeroare1=new StringBuffer();
    public StringBuffer mesajeroare2=new StringBuffer();
    public StringBuffer mesajeroare3=new StringBuffer();

    public ScreenZoo() {
        super("Proiect 3");
        this.setContentPane(this.PanelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        Zoo z=Zoo.getInstance("a","b",2,2);
        textFieldTitlu.setText(z.getNume());
        mamifere=new ArrayList<Mamifer>();
        lmamifere=new DefaultListModel();
        listMamifere.setModel(lmamifere);
        pesti=new ArrayList<Peste>();
        lpesti=new DefaultListModel();
        listPesti.setModel(lpesti);
        pasari=new ArrayList<Pasare>();
        lpasari=new DefaultListModel();
        listPasari.setModel(lpasari);

        mesajeroare1.append("Eroare, nu ati selectat niciun mamifer");
        mesajeroare2.append("Eroare, nu ati selectat niciun peste");
        mesajeroare3.append("Eroare, nu ati selectat nicio pasare");

        listMamifere.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int mamifernumar= listMamifere.getSelectedIndex();
                if(mamifernumar>=0){
                    Mamifer m=mamifere.get(mamifernumar);
                    textNume.setText(m.getNume());
                    textInaltime.setText(Double.toString(m.getInaltime()));
                    textKilograme.setText(Integer.toString(m.getGreutate()));
                }
            }
        });
        listPesti.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int pestenumar= listPesti.getSelectedIndex();
                if(pestenumar>=0){
                    Peste p=pesti.get(pestenumar);
                    textNume.setText(p.getNume());
                    textInaltime.setText(Double.toString(p.getInaltime()));
                    textKilograme.setText(Integer.toString(p.getGreutate()));
                }
            }
        });
        listPasari.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int pasarenumar= listPasari.getSelectedIndex();
                if(pasarenumar>=0){
                    Pasare p=pasari.get(pasarenumar);
                    textNume.setText(p.getNume());
                    textInaltime.setText(Double.toString(p.getInaltime()));
                    textKilograme.setText(Double.toString(p.getGreutate()));
                }
            }
        });

        ADDMButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mamifer m=new Mamifer(
                        textNume.getText(),
                        Double.parseDouble(textInaltime.getText()),
                        Integer.parseInt(textKilograme.getText())
                );
                if(z.getNr_vietati()>=z.getCapacitate_gazduire())
                {
                    JOptionPane.showMessageDialog(PanelMain,"Eroare, ati ajuns la numarul maxim de vietati in acest zoo");
                }else{
                mamifere.add(m);
                refreshMamifereList();
                System.out.println("noul mamifer a fost adaugat cu succes");
                z.setNr_vietati(z.getNr_vietati()+1);}
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
                    Mamifer m=mamifere.get(mamiferenumar);
                    m.setNume(textNume.getText());
                    m.setInaltime(Double.parseDouble(textInaltime.getText()));
                    m.setGreutate(Integer.parseInt(textKilograme.getText()));
                    refreshMamifereList();
                    System.out.println("Update-ul s-a facut cu succes");
                }
                else if(pestinumar>=0){
                    Peste p=pesti.get(pestinumar);
                    p.setNume(textNume.getText());
                    p.setInaltime(Double.parseDouble(textInaltime.getText()));
                    p.setGreutate(Integer.parseInt(textKilograme.getText()));
                    refreshPestiList();
                    System.out.println("Update-ul s-a facut cu succes");
                }
                else if(pasarinumar>=0){
                    Pasare p=pasari.get(pasarinumar);
                    p.setNume(textNume.getText());
                    p.setInaltime(Double.parseDouble(textInaltime.getText()));
                    p.setGreutate(Double.parseDouble(textKilograme.getText()));
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
                        z.setNr_vietati(z.getNr_vietati()-1);
                    }
                    System.out.println("Stergerea s-a facut cu succes");
                }
                else if(pestinumar>=0) {
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    int dialogResult = JOptionPane.showConfirmDialog(listMamifere, "Sterde", "Delete", dialogButton);
                    if (dialogResult == 0) {
                        lpesti.remove(pestinumar);
                        pesti.remove(pestinumar);
                        z.setNr_vietati(z.getNr_vietati()-1);
                    }
                    System.out.println("Stergerea s-a facut cu succes");
                }
                else if(pasarinumar>=0) {
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    int dialogResult = JOptionPane.showConfirmDialog(listMamifere, "Sterde", "Delete", dialogButton);
                    if (dialogResult == 0) {
                        lpasari.remove(pasarinumar);
                        pasari.remove(pasarinumar);
                        z.setNr_vietati(z.getNr_vietati()-1);
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
                    Peste p=new Peste(
                            textNume.getText(),
                            Double.parseDouble(textInaltime.getText()),
                            Integer.parseInt(textKilograme.getText())
                    );
                if(z.getNr_vietati()>=z.getCapacitate_gazduire())
                {
                    JOptionPane.showMessageDialog(PanelMain,"Eroare, ati ajuns la numarul maxim de vietati in acest zoo");
                }else{
                    pesti.add(p);
                    refreshPestiList();
                    System.out.println("noul peste  a fost adaugat cu succes");
                    z.setNr_vietati(z.getNr_vietati()+1);}
                    clearField();
            }
        });
        ADDPAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pasare p=new Pasare(
                        textNume.getText(),
                        Double.parseDouble(textInaltime.getText()),
                        Double.parseDouble(textKilograme.getText())
                );
                if(z.getNr_vietati()>=z.getCapacitate_gazduire())
                {
                    JOptionPane.showMessageDialog(PanelMain,"Eroare, ati ajuns la numarul maxim de vietati in acest zoo");
                }else{
                pasari.add(p);
                refreshPasariList();
                System.out.println("noua pasare  a fost adaugata cu succes");
                z.setNr_vietati(z.getNr_vietati()+1);}
                clearField();
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
        for(Pasare p:pasari){
            lpasari.addElement(p.getNume());
        }
    }
    public void addMamifer(Mamifer m){
        mamifere.add(m);
        refreshMamifereList();
    }
    public void addPesti(Peste p){
        pesti.add(p);
        refreshPestiList();
    }
    public void addPasari(Pasare p){
        pasari.add(p);
        refreshPasariList();
    }

    public static void main(String[] args) {
        ScreenZoo screen=new ScreenZoo();
        screen.setVisible(true);
    }

}
