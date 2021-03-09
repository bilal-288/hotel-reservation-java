/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hostalreservation1.GUI;

import hostalreservation1.Listner.VisitTableTennisListener;
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
public class VisitTableTennisRoom {
    
     public JPanel panel ;
    public JFrame f;
    public JButton nextbtn;
    public JLabel label1;
    public JPanel btnPanel;
    
    public VisitTableTennisRoom()
    {
         f=new JFrame();
         panel =new JPanel();
         btnPanel = new JPanel();
         nextbtn = new JButton(new ImageIcon("images.jpg"));
         btnPanel.setSize(100, 100);
         btnPanel.setLocation(1250, 650);
         btnPanel.add(nextbtn);
         nextbtn.addActionListener(new VisitTableTennisListener(f));
         f.add(btnPanel);
         
         ImageIcon n =new ImageIcon("table_tenis.jpg");
         label1 = new JLabel(n);
         panel.add(label1);
         f.add(panel);
         
         f.setUndecorated(true);
         f.setExtendedState(JFrame.MAXIMIZED_BOTH);
         f.setDefaultCloseOperation(EXIT_ON_CLOSE);
         f.setVisible(true);
    }
    
    
}
