/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostalreservation1.Listner;

import hostalreservation1.GUI.StudentFees;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author sajid
 */
public class StudentFeeListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) 
    {
          new StudentFees();
    }
    
}
