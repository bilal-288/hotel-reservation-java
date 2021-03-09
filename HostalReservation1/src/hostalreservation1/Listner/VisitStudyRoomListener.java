/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostalreservation1.Listner;

import hostalreservation1.GUI.HostalVisitReserve1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author sajid
 */
public class VisitStudyRoomListener implements ActionListener{

    JFrame frame;
    public VisitStudyRoomListener(JFrame fram)
    {
        frame = fram;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
           new HostalVisitReserve1();
           frame.hide();
    }
    
}
