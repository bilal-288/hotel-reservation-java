
package hostalreservation1.GUI;

import hostalreservation1.Listner.BackbtnActionListner;
import hostalreservation1.Listner.ExpanceSaveListener;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.geom.Ellipse2D;
import javax.swing.*;


public class ExpancesGUI 
{
     private JFrame fram;
     private JPanel panel,expancePanel;
     private JLabel product_name,product_price;
     private JTextField field_name,field_price;
     private GridBagConstraints c;
     private JButton Backbtn,saveBtn;
     
     public ExpancesGUI()
     {
        fram = new JFrame();
        panel = new JPanel();
        panel.setBackground(Color.BLUE);
        expancePanel = new JPanel(new GridBagLayout());      
        
        c = new GridBagConstraints();
        c.insets = new Insets(5,5,5,5);
        c.gridx = 0;
        c.gridy = 0;
        product_name = new JLabel("Product Name   ");
        expancePanel.add(product_name,c);
        c.gridx++;
        field_name = new JTextField(15);
        expancePanel.add(field_name,c);
        c.gridx=0;
        c.gridy++;
        product_price = new JLabel("Price    "); 
        expancePanel.add(product_price,c);
        c.gridx++;
        field_price = new JTextField(15);
        expancePanel.add(field_price,c);
        Backbtn = new JButton("Back");
        //c.gridx=0;
        c.gridy++;
        expancePanel.add(Backbtn,c);
        Backbtn.addActionListener(new BackbtnActionListner());
        saveBtn = new JButton("Save");
        c.gridx++;
        expancePanel.add(saveBtn,c);
        saveBtn.addActionListener(new ExpanceSaveListener(field_price.getText(),field_price.getText()));
        
        expancePanel.setSize(400,300);
        expancePanel.setLocation(350, 200);
        expancePanel.setBackground(Color.red);
        
        fram.add(expancePanel);
        fram.add(panel);
        fram.setUndecorated(true);
        fram.setShape(new Ellipse2D.Double(50,50,990,690));
        fram.setSize(1100,800);
        fram.setVisible(true);
        
        
     }
}
