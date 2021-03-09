/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostalreservation1.GUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sajid
 */
public class ShowRoomStatus {
 
    public ShowRoomStatus()
    {
       JFrame frame = new JFrame();
       JPanel panel = new JPanel();
       ImageIcon im = new ImageIcon("Bed room status.jpg");
       JLabel label = new JLabel(im);
       panel.add(label);
       frame.add(panel);
       frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
       frame.setVisible(true);
       JOptionPane.showMessageDialog(null, "Room Status");
       frame.hide();
    }
}
