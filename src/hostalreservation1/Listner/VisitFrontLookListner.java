/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hostalreservation1.Listner;

import hostalreservation1.GUI.visitBedRoom;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author 14007065242
 */
public class VisitFrontLookListner implements ActionListener{

    JFrame frame;
    public VisitFrontLookListner(JFrame fram)
    {
        frame = fram;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        new visitBedRoom();
        frame.hide();
    }
    
}
