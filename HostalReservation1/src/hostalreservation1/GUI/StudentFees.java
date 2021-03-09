
package hostalreservation1.GUI;

import hostalreservation1.Listner.BackbtnActionListner;
import hostalreservation1.Listner.ExpanceSaveListener;
import hostalreservation1.Listner.StudentFeeSaveListener;
import hostalreservation1.Listner.TotalFeeBtnListener;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.geom.Ellipse2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StudentFees {
    
     private JFrame fram;
     private JPanel panel,expancePanel;
     private JLabel studentName,studentPrice;
     private JTextField field_name,field_fees;
     private GridBagConstraints c;
     private JButton Backbtn,saveBtn,TotalFees;
     
     public StudentFees()
     {
         fram = new JFrame();
        panel = new JPanel();
        panel.setBackground(Color.BLUE);
        expancePanel = new JPanel(new GridBagLayout());      
        
        c = new GridBagConstraints();
        c.insets = new Insets(5,5,5,5);
        c.gridx = 0;
        c.gridy = 0;
        studentName = new JLabel("Student Name   ");
        expancePanel.add(studentName,c);
        c.gridx++;
        field_name = new JTextField(15);
        expancePanel.add(field_name,c);
        c.gridx=0;
        c.gridy++;
        studentPrice = new JLabel("Fees    "); 
        expancePanel.add(studentPrice,c);
        c.gridx++;
        field_fees = new JTextField(15);
        expancePanel.add(field_fees,c);
        Backbtn = new JButton("Back");
        c.gridx=0;
        c.gridy++;
        TotalFees = new JButton("Previous fees");
        expancePanel.add(TotalFees,c);
        TotalFees.addActionListener(new TotalFeeBtnListener());
        c.gridx++;
        expancePanel.add(Backbtn,c);
        Backbtn.addActionListener(new BackbtnActionListner());
        saveBtn = new JButton("Save");
        c.gridx++;
        expancePanel.add(saveBtn,c);
        saveBtn.addActionListener(new StudentFeeSaveListener(field_name,field_fees));
        
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
