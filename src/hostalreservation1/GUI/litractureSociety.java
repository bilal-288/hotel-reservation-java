package hostalreservation1.GUI;

import hostalreservation1.Listner.BackbtnActionListner;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;

public class litractureSociety {
    
   
    private JFrame frame;
    private JPanel panel;
    private JLabel l1,l2,l3,l4,l5;
    private GridBagConstraints c;
    private JButton back;
    public litractureSociety()
    {
        frame = new JFrame();
        panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.WHITE);
        c = new GridBagConstraints();
        l1 = new JLabel(" Literary Society ");
        l2 = new JLabel(" It is a student created place where members gather to explore:");
        l3 = new JLabel(" Intellectual concerns,");
        l4 = new JLabel(" Refine oratory skills");
        l5 = new JLabel("This is made in order to broaden understanding of students.");
        c.gridx =0;
        c.gridy =0;
        panel.add(l1,c);
        
        c.gridy++;
        panel.add(l2,c);
        
        c.gridy++;
        panel.add(l3,c);
        
        c.gridy++;
        panel.add(l4,c);
         c.gridy++;
        panel.add(l5,c);
        back = new JButton(" Back ");
        c.gridy++;
        panel.add(back,c);
        back.addActionListener(new BackbtnActionListner());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(panel);
        frame.setVisible(true);    
    
    } 
}
