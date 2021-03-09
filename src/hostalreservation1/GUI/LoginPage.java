/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostalreservation1.GUI;



import hostalreservation1.Listner.LoginListner;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;

public class LoginPage {

    private JFrame Frame;
    private JPanel p1;
    private JPanel p2;
    private JLabel label;
    private JLabel name;
    private JButton login;
    private JTextField Fname;
    private JPasswordField Fpassword;
    private JLabel password;
    private String Name,Password;
    
   
    public LoginPage()  {
        creatPage();
    }
  
 
    private void creatPage()
    {
         Frame = new JFrame();
        p1 = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        p2 = new JPanel();
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setBounds(50, 50, 1000, 1000);
        p1.setSize(350, 350);
        p1.setOpaque(false);
        p1.setLocation(740, 100);
        name = new JLabel("User name   ");
        c.gridx = 0;
        c.gridy = 1;
        p1.add(name, c);
        Fname = new JTextField(11);
        c.gridx = 13;
        c.gridy = 1;
        p1.add(Fname, c);
        password = new JLabel("Password   ");
        c.gridx = 0;
        c.gridy = 3;
        p1.add(password, c);
        c.gridx = 13;
        c.gridy = 3;
        Fpassword = new JPasswordField(11);
        p1.add(Fpassword, c);
        Frame.add(p1);
        JLabel space = new JLabel("  ");
        c.gridx = 10;
        c.gridy = 5;
        p1.add(space, c);
        c.gridx = 13;
        c.gridy = 6;
        login = new JButton(" Login");
        p1.add(login, c);
        login.addActionListener(new LoginListner(Fname,Fpassword,Frame));
        label = (new JLabel(new ImageIcon("Login page.jpg")));
        p2.add(label);
        Frame.add(p2);
        Frame.setUndecorated(true);
        Frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Frame.setVisible(true);
        
    }
}

