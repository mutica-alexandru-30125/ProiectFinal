import com.sun.deploy.panel.ExceptionListDialog;

import java.util.concurrent.TimeUnit;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Proiect {
    public int a=1;

    private JPanel panel;

    private JTextField txtNume;
    private JTextField txtInaltime;
    private JTextField txtKg;

    private JButton btnAdaugaMamifer;
    private JButton btnAdaugaPeste;
    private JButton btnAdaugaPasare;
    private JButton btnAfisare;
    private JButton btnMedia;
    private JButton btnSwich;

    private JLabel lblMesajNume;
    private JLabel lblMesajInaltime;
    private JLabel lblMesajKg;
    private JLabel lblMesaj;
    private JLabel lblAfisareM;
    private JLabel lblAfisarePe;
    private JLabel lblAfisarePa;
    private JLabel lblMedieRez;

    public StringBuffer eroare = new StringBuffer();
    public StringBuffer eroare1 = new StringBuffer();
    public StringBuffer eroare2 = new StringBuffer();
    public StringBuffer eroare3 = new StringBuffer();
    public StringBuffer eroare4 = new StringBuffer();

    private ArrayList<Mamifer> arrM;
    private ArrayList<Pasare> arrPa;
    private ArrayList<Peste> arrPe;

    private static JList lstMamifer;

    /*
    public void createFrame(String s)
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                panelAfisare = new JPanel();
                panelAfisare.setBackground(Color.darkGray);

                JFrame frame = new JFrame("Afisare");
                frame.setContentPane(new Proiect().panelAfisare);
                //frame2.getContentPane().add(BorderLayout.CENTER, panel);
                lblAfisare.setText(s);
                lblAfisare.setBounds(5,5,300,30);
                lblAfisare.setForeground(Color.white);

                panel.add(btnAfisare);

                frame.pack();
                frame.setLocationByPlatform(true);
                frame.setVisible(true);
            }
        });
    }
    */

    public Proiect(){
        arrM = new ArrayList<Mamifer>();
        arrM.add(new Mamifer("Girafa","7m",200));

        arrPe = new ArrayList<Peste>();
        arrPe.add(new Peste("Nemo","2cm",1));

        arrPa = new ArrayList<Pasare>();
        arrPa.add(new Pasare("Colibri","2cm","10g"));

        eroare.append("Toate campurile sunt goale!");
        eroare1.append("Campul 'inaltime' este gol!");
        eroare2.append("Campul 'inaltime' este gol!");
        eroare3.append("Campul 'kg' este gol!");
        eroare4.append("Campul kg nu poate sa fie mai mic decat 0!");

        panel = new JPanel();
        panel.setBackground(Color.darkGray);

        panel.setLayout(null);

        txtNume = new JTextField();                             //Adaugam un TextField pentru a introduce numele
        txtNume.setBounds(5,5,130,30);     //Ii setam pozitia

        txtInaltime = new JTextField();
        txtInaltime.setBounds(135,5,130,30);

        txtKg = new JTextField();
        txtKg.setBounds(265,5,130,30);


        lblMesajNume = new JLabel("Nume");                     //Adaugam un label si ii dam un nume
        lblMesajNume.setBounds(56,30,120,30);  //Il asezam fix sum TextField-ul pt nume
        lblMesajNume.setForeground(Color.white);                    //Ii dam culoarea alb

        lblMesajInaltime = new JLabel("Inaltime");
        lblMesajInaltime.setBounds(185,30,120,30);
        lblMesajInaltime.setForeground(Color.white);

        lblMesajKg = new JLabel("Kg");
        lblMesajKg.setBounds(330,30,120,30);
        lblMesajKg.setForeground(Color.white);

        lblMesaj = new JLabel("");
        lblMesaj.setBounds(5,90,120,30);
        lblMesaj.setForeground(Color.white);

        lblAfisareM = new JLabel("");
        lblAfisareM.setBounds(5,150,400,30);
        lblAfisareM.setForeground(Color.white);

        lblAfisarePe = new JLabel("");
        lblAfisarePe.setBounds(5,180,400,30);
        lblAfisarePe.setForeground(Color.white);

        lblAfisarePa = new JLabel("");
        lblAfisarePa.setBounds(5,210,400,30);
        lblAfisarePa.setForeground(Color.white);

        lblMedieRez = new JLabel("");
        lblMedieRez.setBounds(135,240,400,30);
        lblMedieRez.setForeground(Color.white);

        btnAdaugaMamifer = new JButton("Adauga Mamifer");  //Adaugam butonul si ii setam pozitia
        btnAdaugaMamifer.setBounds(5 , 60, 130, 30);
        btnAdaugaMamifer.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String nume = txtNume.getText();
                        String inaltime = txtInaltime.getText();
                        String kgS = txtKg.getText();
                        int kg = Integer.parseInt(kgS);
                        if((nume.isEmpty())&&(inaltime.isEmpty())&&(kgS.isEmpty()))
                            JOptionPane.showMessageDialog(null,eroare);
                        else if(nume.isEmpty())
                            JOptionPane.showMessageDialog(null,eroare1);
                        else if(inaltime.isEmpty())
                            JOptionPane.showMessageDialog(null, eroare2);
                        else if(kgS.isEmpty())
                            JOptionPane.showMessageDialog(null,eroare3);
                        else if(kg<0)
                            JOptionPane.showMessageDialog(null,eroare4);
                        else{
                            Mamifer m = new Mamifer(nume,inaltime,kg);
                            arrM.add(m);
                            lblMesaj.setText("Adaugare reusita!");
                            /*
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ea) {
                                Thread.currentThread().interrupt();
                            }
                            lblMesaj.setText("");
                            */
                        }
                    }
                }
        );

        btnAdaugaPeste = new JButton("Adauga Peste");
        btnAdaugaPeste.setBounds(135 , 60, 130, 30);
        btnAdaugaPeste.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String nume = txtNume.getText();
                        String inaltime = txtInaltime.getText();
                        String kgS = txtKg.getText();
                        int kg = Integer.parseInt(kgS);
                        if((nume.isEmpty())&&(inaltime.isEmpty())&&(kgS.isEmpty()))
                            JOptionPane.showMessageDialog(null,eroare);
                        else if(nume.isEmpty())
                            JOptionPane.showMessageDialog(null,eroare1);
                        else if(inaltime.isEmpty())
                            JOptionPane.showMessageDialog(null, eroare2);
                        else if(kgS.isEmpty())
                            JOptionPane.showMessageDialog(null,eroare3);
                        else if(kg<0)
                            JOptionPane.showMessageDialog(null,eroare4);
                        else{
                            Peste pe = new Peste(nume,inaltime,kg);
                            arrPe.add(pe);
                            lblMesaj.setText("Adaugare reusita!");
                        }
                    }
                }
        );

        btnAdaugaPasare = new JButton("Adauga Pasare");
        btnAdaugaPasare.setBounds(265 , 60, 130, 30);
        btnAdaugaPasare.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String nume = txtNume.getText();
                        String inaltime = txtInaltime.getText();
                        String kgS = txtKg.getText();
                        if((nume.isEmpty())&&(inaltime.isEmpty())&&(kgS.isEmpty()))
                            JOptionPane.showMessageDialog(null,eroare);
                        else if(nume.isEmpty())
                            JOptionPane.showMessageDialog(null,eroare1);
                        else if(inaltime.isEmpty())
                            JOptionPane.showMessageDialog(null, eroare2);
                        else if(kgS.isEmpty())
                            JOptionPane.showMessageDialog(null,eroare3);
                        else{
                            Pasare pa = new Pasare(nume,inaltime,kgS);
                            arrPa.add(pa);
                            lblMesaj.setText("Adaugare reusita!");
                        }
                    }
                }
        );

        btnAfisare = new JButton("Afisare");
        btnAfisare.setBounds(5 , 120, 130, 30);
        btnAfisare.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lblAfisareM.setText(arrM.toString());
                        lblAfisarePe.setText(arrPe.toString());
                        lblAfisarePa.setText(arrPa.toString());
                    }
                }
        );

        btnMedia = new JButton("Media inaltimii");  //Adaugam butonul si ii setam pozitia
        btnMedia.setBounds(5 , 240, 130, 30);
        btnMedia.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int a=0,i;
                        double rez;
                        for(i=0;i<arrM.size();i++)
                            a+=arrM.get(i).getGreutate();
                        rez=a/arrM.size();
                        lblMedieRez.setText(Double.toString(rez));
                    }
                }
        );

        btnSwich = new JButton("Swich");  //Adaugam butonul si ii setam pozitia
        btnSwich.setBounds(5 , 430, 70, 30);
        btnSwich.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (a == 1){
                            panel.setBackground(Color.lightGray);
                            lblMesajNume.setForeground(Color.darkGray);
                            lblMesajInaltime.setForeground(Color.darkGray);
                            lblMesajKg.setForeground(Color.darkGray);
                            lblMesaj.setForeground(Color.darkGray);
                            lblAfisareM.setForeground(Color.darkGray);
                            lblAfisarePe.setForeground(Color.darkGray);
                            lblAfisarePa.setForeground(Color.darkGray);
                            lblMedieRez.setForeground(Color.darkGray);

                            a = 0;
                        }
                        else{
                            panel.setBackground(Color.darkGray);
                            lblMesajNume.setForeground(Color.white);
                            lblMesajInaltime.setForeground(Color.white);
                            lblMesajKg.setForeground(Color.white);
                            lblMesaj.setForeground(Color.white);
                            lblAfisareM.setForeground(Color.white);
                            lblAfisarePe.setForeground(Color.white);
                            lblAfisarePa.setForeground(Color.white);
                            lblMedieRez.setForeground(Color.white);

                            a = 1;
                        }
                    }
                }
        );

        panel.add(txtNume);
        panel.add(txtInaltime);
        panel.add(txtKg);
        panel.add(lblMesajNume);
        panel.add(lblMesajInaltime);
        panel.add(lblMesajKg);
        panel.add(lblAfisareM);
        panel.add(lblAfisarePe);
        panel.add(lblAfisarePa);
        panel.add(btnAdaugaMamifer);
        panel.add(btnAdaugaPeste);
        panel.add(btnAdaugaPasare);
        panel.add(btnAfisare);
        panel.add(btnMedia);
        panel.add(btnSwich);
        panel.add(lblMesaj);
        panel.add(lblMedieRez);
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Proiect II");
        frame.setContentPane(new Proiect().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
