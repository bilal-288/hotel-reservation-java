/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hostalreservation1.GUI;

import hostalreservation1.Listner.VisitFrontLookListner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author 14007065242
 */
public class visitFrontLook {
    
    public JPanel panel ;
    public JFrame f;
    public JButton nextbtn;
    public JLabel label1;
    public JPanel btnPanel;
    
   public visitFrontLook()
    {
           
         f=new JFrame();
         panel =new JPanel();
         btnPanel = new JPanel();
         nextbtn = new JButton(new ImageIcon("images.jpg"));
         btnPanel.setSize(100, 100);
         btnPanel.setLocation(1250, 650);
         btnPanel.add(nextbtn);
         nextbtn.addActionListener(new VisitFrontLookListner(f));
         f.add(btnPanel);
         
         ImageIcon n =new ImageIcon("login 2.jpg");
         label1 = new JLabel(n);
         panel.add(label1);
         f.add(panel);
         
         f.setUndecorated(true);
         f.setExtendedState(JFrame.MAXIMIZED_BOTH);
         f.setDefaultCloseOperation(EXIT_ON_CLOSE);
         f.setVisible(true);
    }
}
