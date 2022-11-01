import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {

    private JPanel panel;
    private JFrame frame;
    private JLabel lblUser;
    private JLabel lblPass;
    private JTextField txtUser;
    private JTextField txtPass;

    private JButton btnLoghin;

    public String U,P;

    public Login(){
        panel = new JPanel();
        panel.setBackground(Color.darkGray);
        //panel.setLayout(null);

        frame = new JFrame();

        lblUser=new JLabel("Username");
        panel.add(lblUser);
        lblPass = new JLabel("Password");
        panel.add(lblPass);

        txtUser = new JTextField();
        panel.add(txtUser);
        txtPass = new JTextField();
        panel.add(txtPass);

        U = "abcd";
        P = "0000";

        btnLoghin = new JButton("loghin");
        panel.add(btnLoghin);
        btnLoghin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if((U==txtUser.getText())&&(P==txtPass.getText())){
                    System.out.println("Bun!");
                }
                else{
                    System.out.println("Gresit!");
                }
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Proiect II");
        frame.setContentPane(new Login().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
