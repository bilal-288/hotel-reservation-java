/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostalreservation1.Listner;

import hostalreservation1.Filing.ReservedVacencyFile;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class SaveReservedVacencyListner implements ActionListener{

   JTextField field_fname,field_lname,field_Address,field_num,field_cnic;
    JFrame fram ;
    JComboBox field_Age,field_Religion,field_Nationality,field_Gander;
    
public  SaveReservedVacencyListner(JFrame fram, JTextField field_fname,JTextField field_lname,JComboBox field_Age,JTextField field_Address,JTextField field_num,JTextField field_cnic,JComboBox field_Religion,JComboBox field_Nationality,JComboBox field_Gander)
     {
          this.field_fname =field_fname ;
          this.field_lname = field_lname;
          this.field_Age = field_Age;
          this.field_Address = field_Address;
          this.field_num = field_num;
          this.field_cnic = field_cnic;
          this.field_Religion = field_Religion;
          this.field_Nationality = field_Nationality;
          this.field_Gander = field_Gander;
          this.fram = fram;
     }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        ReservedVacencyFile rv = new ReservedVacencyFile();
       try {
           rv.WriteOnfile(field_fname.getText(),field_lname.getText(),field_Age.getSelectedItem().toString(),field_Address.getText(),field_num.getText(),field_cnic.getText(),field_Religion.getSelectedItem().toString(),field_Nationality.getSelectedItem().toString(),field_Gander.getSelectedItem().toString());
           rv.CloseFile();
       } catch (IOException ex) {
           System.out.println(ex);
           //Logger.getLogger(SaveReservedVacencyListner.class.getName()).log(Level.SEVERE, null, ex);
       }
                        
       fram.hide();
    }

    
}
