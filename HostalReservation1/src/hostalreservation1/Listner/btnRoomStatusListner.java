/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostalreservation1.Listner;

import hostalreservation1.GUI.ShowRoomStatus;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author sajid
 */
public class btnRoomStatusListner implements ActionListener {

    private JFrame frame ;
    private JPanel panel ;
    private ImageIcon im ;
    private JLabel label ;
    
    @Override
    public void actionPerformed(ActionEvent e) {
       new  ShowRoomStatus(); 
      
    }
    
}
