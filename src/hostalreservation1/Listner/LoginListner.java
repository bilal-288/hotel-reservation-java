/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostalreservation1.Listner;

import hostalreservation1.Filing.LoginFile;
import hostalreservation1.GUI.HostalVisitReserve1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * @author sajid
 */
public class LoginListner implements ActionListener {
    JTextField Name;JPasswordField Password;JFrame Frame;
    String n,p;
    public LoginListner(JTextField name,JPasswordField password,JFrame fram)
    {
        Name = name;
        Password = password;
        Frame = fram;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            LoginFile lf = new LoginFile();
            n=lf.getName();
            p=lf.getPassword();
            
            if(Name.getText().compareTo(n)==0)
            {
                if(Password.getText().compareTo(p)==0)
                {
                    //JOptionPane.showMessageDialog(null, "Login Successfull  :  ");
                    new HostalVisitReserve1();
                    Frame.hide();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Invalid Password    :  ");
                }
            }
            else
            {
                 JOptionPane.showMessageDialog(null, "Invalid Name  :  ");
            }
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
         
        
    }
    
}
