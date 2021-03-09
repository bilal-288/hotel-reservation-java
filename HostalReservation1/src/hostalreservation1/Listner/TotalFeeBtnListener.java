/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostalreservation1.Listner;

import hostalreservation1.Filing.ShowTotalStudentFee;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sajid
 */
public class TotalFeeBtnListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            new ShowTotalStudentFee();
        } catch (IOException ex) {
            //Logger.getLogger(TotalFeeBtnListener.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("IoException   ");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(TotalFeeBtnListener.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Class not found  ");
        }
    }
    
}
