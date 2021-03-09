/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostalreservation1.GUI;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.*;
import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sajid
 */
public class showVisit {
    
    public    JPanel panel ;
    public    JPanel panel1 ;
    public    JPanel panel2 ;
    public    JPanel panel3 ;
    public    JPanel panel5;
    public    JLabel label;
    public    JLabel label1;
    public    JLabel label2;
    public    JLabel label3;
    public    JLabel label5;
    public    JButton btn;
    JPanel btnPanel = new JPanel(new GridBagLayout());
    public showVisit()
    {
         JFrame f=new JFrame();
         panel =new JPanel();
         btn = new JButton(new ImageIcon("images.jpg"));
         f.setUndecorated(true);
         f.setExtendedState(JFrame.MAXIMIZED_BOTH);
         f.setDefaultCloseOperation(EXIT_ON_CLOSE);
         
         
         ImageIcon n =new ImageIcon("login 2.jpg");
         label1 = new JLabel(n);
         panel.add(label1);
          // panel.add();
         btnPanel.setSize(100, 100);
         btnPanel.setLocation(1250, 650);
         btnPanel.add(btn);
         //btn.setSize(30,30);
         f.add(btnPanel);
         f.add(panel);
         
         f.setVisible(true); 
         
         for(int i =0 ;i<20000;i++){System.out.println("hello");}
         JOptionPane.showMessageDialog(null, "Front look");
         //for(int i =0 ;i<20000;i++){{System.out.println("hello");}}
         
         
          
        ImageIcon n1 =new ImageIcon("bed room.jpg");//
        
        label =new JLabel(n1);
        panel1 =  new JPanel();
        panel1.add(label);
      
        f.add(panel1);
        f.setVisible(true); 
        for(int i =0 ;i<20000;i++){{System.out.println("hello");}}
        JOptionPane.showMessageDialog(null, "bed room");
         
         
        
           
        ImageIcon n2 =new ImageIcon("small_mess.jpg");
        
        
        label =new JLabel(n2);
        panel2 =  new JPanel();
       panel2.add(label);
       f.add(panel2);
       f.setVisible(true); 
       for(int i =0 ;i<20000;i++){{System.out.println("hello");}}
       JOptionPane.showMessageDialog(null, "mess");
       
         ImageIcon n3 =new ImageIcon("table_tenis.jpg");
         label3 =new JLabel(n3);
         panel3 =  new JPanel();
        
         label3 = new JLabel(n3);
         panel3.add(label3);
         f.add(panel3);
        
         f.setVisible(true); 
         for(int i =0 ;i<20000;i++){{System.out.println("hello");}}
         JOptionPane.showMessageDialog(null, "table_tenis");
       
        
         
       
         
          ImageIcon n5 =new ImageIcon("study room.jpg");
         label5 =  new JLabel(n5);
         panel5 =  new JPanel();
        
         label5 = new JLabel(n5);
         panel5.add(label5);
         f.add(panel5);
         
         f.setVisible(true); 
         for(int i =0 ;i<20000;i++){{System.out.println("hello");}}
         JOptionPane.showMessageDialog(null, "Study room");
         f.dispose();

      
    }
    
}
