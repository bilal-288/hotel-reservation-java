/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostalreservation1.GUI;

import hostalreservation1.Listner.BackbtnActionListner;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;

/**
 *
 * @author 14007065242
 */
public class SportSociety {
    
    private JFrame frame;
    private JPanel panel;
    private JLabel l1,l2,l3,l4;
    private GridBagConstraints c;
    private JButton back;
    public SportSociety()
    {
        frame = new JFrame();
        panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.WHITE);
        c = new GridBagConstraints();
        l1 = new JLabel(" Three Sport Clubs ");
        l2 = new JLabel(" 1:-Cricket   2:- Football  3:-Tabletennis");
        l3 = new JLabel(" A sports club is for the purpose of playing one or more sports.");
        l4 = new JLabel(" Clubs may be dedicated to a single sport or to several (multi-sport club)");
        
        c.gridx =0;
        c.gridy =0;
        panel.add(l1,c);
        
        c.gridy++;
        panel.add(l2,c);
        
        c.gridy++;
        panel.add(l3,c);
        
        c.gridy++;
        panel.add(l4,c);
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
