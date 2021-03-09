/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostalreservation1.Listner;

import hostalreservation1.GUI.HostalVisitReserve1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author 14007065242
 */
public class BackbtnActionListner implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
       new HostalVisitReserve1();
    }
    
}
